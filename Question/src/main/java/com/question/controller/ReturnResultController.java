package com.question.controller;


import com.alibaba.fastjson.JSONObject;
import com.question.service.ReturnService;
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
@RequestMapping("Return")
public class ReturnResultController extends BaseController {
    @Autowired
    private ReturnService returnService;

    /**
     * 根据前端传回的表单数据更新选项的count
     * @param selectedIds
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateSelectionCount", method = RequestMethod.POST)
    public JSONObject updateSelectionCount(@RequestParam("selectedIdList") List<Integer> selectedIds) {
        logger.info("invoke--------------------Return/updateSelectionCount?selectedIdList=" + selectedIds);
        for (int i = 0; i < selectedIds.size(); i++) {
            returnService.updateSelectionCount(selectedIds.get(i));
        }
        return CommonUtil.constructResponse(EnumUtil.OK,"",selectedIds);
    }
}


