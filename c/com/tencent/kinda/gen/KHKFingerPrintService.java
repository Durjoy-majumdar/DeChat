package com.tencent.kinda.gen;

public interface KHKFingerPrintService {
    void authenticateImpl(String str, String str2, ITransmitKvData iTransmitKvData, VoidBinaryI32Callback voidBinaryI32Callback, VoidCallback voidCallback, VoidBoolCallback voidBoolCallback, VoidStringCallback voidStringCallback);

    KRect getFingerPosition();

    FingerType getFingerType();

    void releaseService();

    void showBioAuthViewImpl(String str, String str2, VoidStringStringCallback voidStringStringCallback, VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3);

    void showFaceIdAuthDialogImpl(String str, VoidBinaryI32Callback voidBinaryI32Callback, VoidCallback voidCallback, VoidCallback voidCallback2);

    BioType supportBioType();
}
