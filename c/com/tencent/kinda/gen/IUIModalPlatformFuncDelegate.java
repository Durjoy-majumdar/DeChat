package com.tencent.kinda.gen;

public interface IUIModalPlatformFuncDelegate {
    void endEditing();

    void fragmentShow(boolean z);

    void genSnapshotImpl(boolean z, VoidCallback voidCallback);

    void refreshNavigationBar();

    void setKeyBoardShowCallbackImpl(VoidBoolI32Callback voidBoolI32Callback);
}
