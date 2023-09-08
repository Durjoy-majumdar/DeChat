package com.tencent.kinda.framework.widget.base;

import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;

public interface IExtendUI {
    void hideTenpayKB();

    void scrollTo(View view, int i, int i2);

    void scrollToFormEditPosAfterShowTenPay(View view, View view2, int i);

    void setEditFocusListener(View view, int i, boolean z);

    void setEditFocusListener(View view, int i, boolean z, boolean z2);

    void setTenpayKBStateListener(C75217h hVar);

    void showTenpayKB();

    void showVKB();
}
