package com.tencent.kinda.framework.app;

import com.tencent.kinda.framework.widget.tools.ActivityController;
import com.tencent.kinda.framework.widget.tools.ConstantsKinda;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.IUIPage;
import com.tencent.kinda.gen.IUIPageController;

public class UIPageControllerImpl implements IUIPageController {
    private static String TAG = "kinda UIPageControllerImpl";

    public void popAndStartPageUI(IUIPage iUIPage, boolean z, ITransmitKvData iTransmitKvData) {
        if (z) {
            ActivityController.startNewUIPage(iUIPage, iTransmitKvData, ConstantsKinda.ENTER_ANIMATE_STYLE_POP);
        } else {
            ActivityController.startNewUIPage(iUIPage, iTransmitKvData, ConstantsKinda.ENTER_ANIMATE_STYLE_DEFAULT);
        }
    }

    public void startModalPageUI(IUIPage iUIPage, boolean z, ITransmitKvData iTransmitKvData) {
        if (z) {
            ActivityController.startNewUIPage(iUIPage, iTransmitKvData, ConstantsKinda.ENTER_ANIMATE_STYLE_POP);
        } else {
            ActivityController.startNewUIPage(iUIPage, iTransmitKvData, ConstantsKinda.ENTER_ANIMATE_STYLE_DEFAULT);
        }
    }

    public void startPageUI(IUIPage iUIPage, boolean z, ITransmitKvData iTransmitKvData) {
        if (z) {
            ActivityController.startNewUIPage(iUIPage, iTransmitKvData, ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE);
        } else {
            ActivityController.startNewUIPage(iUIPage, iTransmitKvData, ConstantsKinda.ENTER_ANIMATE_STYLE_DEFAULT);
        }
    }
}
