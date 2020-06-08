package com.bookstore.admin.notices.handler;

import com.bookstore.admin.notices.service.IAdminNoticeService;
import com.bookstore.commons.beans.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/admin/notices")
public class AdminNoticeHandler {

    @Autowired
    IAdminNoticeService adminNoticeService;

    //查询公告信息
    @RequestMapping("/ListNoticeServlet")
    public String ListNoticeServlet(Model model){
        List<Notice> notices=adminNoticeService.findNoticeServlet();
        model.addAttribute("notices",notices);
        return "/admin/notices/list.jsp";
    }

    //删除公告信息
    @RequestMapping("/DeleteNoticeServlet")
    public String DeleteNoticeServlet(String id){
        adminNoticeService.removeNotice(id);
        return "redirect:/admin/notices/ListNoticeServlet";
    }

    //添加公告信息
    @RequestMapping("/AddNoticeServlet")
    public String AddNoticeServlet(Notice notice){
        if (!notice.getDetails().isEmpty()){
            //当公告标题与内容同时存在才能发布公告
            if (!notice.getTitle().isEmpty()){
                adminNoticeService.addNotice(notice);
            }
        }
        return "redirect:/admin/notices/ListNoticeServlet";
    }

    //修改公告信息的先查询
    @RequestMapping("/FindByIdNoticeServlet")
    public String FindByIdNoticeServlet(Model model,Notice notice){
        notice = adminNoticeService.findNoticeById(notice.getN_id());
        model.addAttribute("n",notice);
        return "/admin/notices/edit.jsp";
    }
    //修改公告信息
    @RequestMapping("/EditNoticeServlet")
    public String EditNoticeServlet(Notice notice){
        adminNoticeService.modifyNotice(notice);
        System.out.println(notice);
        return "redirect:/admin/notices/ListNoticeServlet";
    }
}
