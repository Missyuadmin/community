package com.spring.boot.Dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalCount, Integer page, Integer size) {

            if (totalCount % size == 0) {
                totalPage = totalCount / size;
            } else {
                totalPage = totalCount / size + 1;
            }

            if (page < 1) {
                page = 1;
            }
            if (page > totalPage) {
                page = totalPage;
            }
            this.page = page;
            pages.add(page);
            for (int i = 1; i <= 3; i++) {
                if (page - i > 0) {
                    pages.add(0, page - i);
                }
                if (page + i <= totalPage) {
                    pages.add(page + i);
                }
            }
        if(totalCount!=0) {
            //是否展示返回上一页的箭头
            if (page == 1) {
                showPrevious = false;
            } else {
                showPrevious = true;
            }
            //是否展示返回下一页的箭头
            if (page == totalPage) {
                showNext = false;
            } else {
                showNext = true;
            }
            //是否展示前往首页的箭头
            if (pages.contains(1)) {
                showFirstPage = false;
            } else {
                showFirstPage = true;
            }
            //是否展示前往尾页的箭头
            if (pages.contains(totalPage)) {
                showEndPage = false;
            } else {
                showEndPage = true;
            }
        }
    }
}
