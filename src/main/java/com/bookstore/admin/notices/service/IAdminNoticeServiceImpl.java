package com.bookstore.admin.notices.service;


import com.bookstore.admin.notices.dao.IAdminNoticeDao;
import com.bookstore.commons.beans.Notice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IAdminNoticeServiceImpl implements IAdminNoticeService {

    @Resource
    IAdminNoticeDao adminNoticeDao;

    @Override
    public List<Notice> findNoticeServlet() {
        return adminNoticeDao.selectNoticeServlet();
    }

    @Override
    public void removeNotice(String id) {
        adminNoticeDao.deleteNotices(id);
    }

    @Override
    public void addNotice(Notice notice) {
        adminNoticeDao.insertNotice(notice);
    }

    @Override
    public Notice findNoticeById(Integer n_id) {
        return adminNoticeDao.selectNoticeById(n_id);
    }

    @Override
    public void modifyNotice(Notice notice) {
        adminNoticeDao.updateNotice(notice);
    }

}
