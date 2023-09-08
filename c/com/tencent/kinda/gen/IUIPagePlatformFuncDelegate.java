package com.tencent.kinda.gen;

public interface IUIPagePlatformFuncDelegate {
    void addReportInfo(ViewReportStruct viewReportStruct);

    void beginIgnoringInteractionEvents();

    void closeUI(boolean z);

    void endEditing();

    void endIgnoringInteractionEvents();

    String getTitle();

    void refreshNavigationBar();

    void setBackgroundColor(DynamicColor dynamicColor);

    void setKeyBoardShowCallbackImpl(VoidBoolI32Callback voidBoolI32Callback);

    void setTitle(String str);

    void setTopLeftBackBtnCallbackImpl(VoidCallback voidCallback);

    void setTopRightBtnImage(String str);

    void setTopRightBtnTitle(String str, String str2);

    void setTopRightCallbackImpl(VoidCallback voidCallback);

    void setWindowSoftInputAdjustMode(AndroidWindowAdjustMode androidWindowAdjustMode);

    void startLoading(String str, boolean z);

    void stopLoading();

    void triggerReport(ReportEvent reportEvent, String str);
}
