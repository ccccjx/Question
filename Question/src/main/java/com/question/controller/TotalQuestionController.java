package com.question.controller;

import com.alibaba.fastjson.JSONObject;
import com.question.model.TotalQuestion;
import com.question.service.TotalQuestionService;
import com.question.util.BaseController;
import com.question.util.CommonUtil;
import com.question.util.EnumUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/question")
public class TotalQuestionController extends BaseController {
@Autowired
    private TotalQuestionService totalQuestionService;

    /**
     * 获取问题列表
     * @return
     */
    @RequestMapping(value = "/getTotalQuestion",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getTotalQuestion() {
    logger.info("invoke--------------------quuestion/getTotalQuestion");

    TotalQuestion totalQuestion;
    List<TotalQuestion> totalQuestionList=new ArrayList<>();
    for (int i = 1; i < totalQuestionService.getQuestionLength(); i++) {
        totalQuestion=totalQuestionService.getTotalQuestion(i);
        totalQuestionList.add(totalQuestion);
    }
    return CommonUtil.constructResponse(EnumUtil.OK,"得到问题列表成功！",totalQuestionList);
}
}
