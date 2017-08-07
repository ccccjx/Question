package com.question.controller;


import com.alibaba.fastjson.JSONObject;
import com.question.model.Title;
import com.question.service.TitleService;
import com.question.util.BaseController;
import com.question.util.CommonUtil;
import com.question.util.EnumUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
/*
获取问题题目
 */
@Controller
@RequestMapping("/question")
public class TitleController extends BaseController{
@Autowired
private TitleService titleService;

    public TitleController() {
    }

    /**
     * 获取问题题目
     * @param questionId
     * @return
     */
    @RequestMapping(value = "/getTitle",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getTitle(@RequestParam(value="questionId") int questionId){
        logger.info("invoke--------------------quuestion/getTitle?questionId=" + questionId);
        Title title = titleService.getTitle(questionId);
        System.out.print(title.toString());
        return  CommonUtil.constructResponse(EnumUtil.OK, "查询问题列表成功！", title.toString());
    }

}
