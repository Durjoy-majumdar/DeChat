package com.tencent.kinda.gen;

public interface KindaModalManager {
    void addModalView(IUIModal iUIModal);

    void removeAllModalViews();

    void removeModalViewImpl(IUIModal iUIModal, VoidCallback voidCallback);
}
