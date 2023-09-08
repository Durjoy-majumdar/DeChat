package com.tencent.kinda.gen;

public interface KFingerprintService {
    void authenticateImpl(String str, String str2, ITransmitKvData iTransmitKvData, VoidBinaryI32Callback voidBinaryI32Callback, VoidCallback voidCallback, VoidBoolCallback voidBoolCallback, VoidStringCallback voidStringCallback);

    void changeAuthKey(boolean z, boolean z2, String str);

    KRect getFingerPosition();

    FingerType getFingerType();

    boolean isNeedChangeAuthKey();

    void reGenFpRsaKeyImpl(boolean z, int i, String str, VoidStringStringCallback voidStringStringCallback, VoidCallback voidCallback);

    void releaseService();

    void setNeedChangeAuthKey(boolean z);

    void showBioAuthViewImpl(String str, String str2, VoidStringBinaryCallback voidStringBinaryCallback, VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3);

    void showFaceIdAuthDialogImpl(String str, VoidBinaryI32Callback voidBinaryI32Callback, VoidCallback voidCallback, VoidCallback voidCallback2);

    BioType supportBioType();

    void userCancel();
}
