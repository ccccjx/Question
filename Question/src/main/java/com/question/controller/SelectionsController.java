package com.question.controller;

import com.alibaba.fastjson.JSONObject;
import com.question.model.Selections;
import com.question.service.SelectionsService;
import com.question.util.BaseController;
import com.question.util.CommonUtil;
import com.question.util.EnumUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/question")
public class SelectionsController extends BaseController {
    @Autowired
    private SelectionsService selectionsService;

    /**
     * 获取问题选项
     * @param questionId
     * @return
     */
    @RequestMapping(value = "/getSelections" ,method= RequestMethod.GET )
    @ResponseBody
    public JSONObject getSelections(@RequestParam("questionId") int questionId){

        logger.info("invoke--------------------question/getSelections?questionId=" + questionId);
        List<Selections> selectionsList=selectionsService.getSelections(questionId);
        return CommonUtil.constructResponse(EnumUtil.OK,"请求问题选项成功！",selectionsList);

    }
}
