package com.tencent.kinda.gen;

public interface IUIPageController {
    void popAndStartPageUI(IUIPage iUIPage, boolean z, ITransmitKvData iTransmitKvData);

    void startModalPageUI(IUIPage iUIPage, boolean z, ITransmitKvData iTransmitKvData);

    void startPageUI(IUIPage iUIPage, boolean z, ITransmitKvData iTransmitKvData);
}
