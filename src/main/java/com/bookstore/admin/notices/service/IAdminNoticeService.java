package com.bookstore.admin.notices.service;

import com.bookstore.commons.beans.Notice;

import java.util.List;

public interface IAdminNoticeService {
    List<Notice> findNoticeServlet();

    void removeNotice(String id);

    void addNotice(Notice notice);

    Notice findNoticeById(Integer n_id);

    void modifyNotice(Notice notice);
}
