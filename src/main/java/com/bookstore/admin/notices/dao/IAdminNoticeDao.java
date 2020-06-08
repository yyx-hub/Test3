package com.bookstore.admin.notices.dao;

import com.bookstore.commons.beans.Notice;

import java.util.List;

public interface IAdminNoticeDao {
    List<Notice> selectNoticeServlet();

    void deleteNotices(String id);

    void insertNotice(Notice notice);

    Notice selectNoticeById(Integer n_id);

    void updateNotice(Notice notice);
}
