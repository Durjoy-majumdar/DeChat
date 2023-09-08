package com.tencent.p014mm.plugin.lite.p068ui;

import android.os.Bundle;
import com.tencent.liteapp.p877ui.WxaLiteAppUI;
import di3.C86312j;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppMMUI */
public class WxaLiteAppMMUI extends WxaLiteAppUI {
    public void onCreate(Bundle bundle) {
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13514aF(Boolean.TRUE);
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13514aF(Boolean.FALSE);
    }
}
