package com.tencent.kinda.gen;

public interface KScanWidget {
    void dismissOnScanFinish(boolean z);

    void scan(String str);

    void setHandlerImpl(VoidStringStringBinaryCallback voidStringStringBinaryCallback);
}
