package com.tencent.kinda.gen;

public interface KindaRealNameManager {
    void callPrivacyDutyPageImpl(VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void goToRealNameInputUIImpl(VoidCallback voidCallback, VoidCallback voidCallback2, ITransmitKvData iTransmitKvData);

    void reportRealnameAction(int i);

    void startRealNameImpl(VoidCallback voidCallback, VoidCallback voidCallback2, ITransmitKvData iTransmitKvData);
}
