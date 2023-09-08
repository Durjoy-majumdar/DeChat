package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import android.view.MenuItem;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.h */
public class C93014h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ChooseMsgFileUI f267874d;

    public C93014h(ChooseMsgFileUI chooseMsgFileUI) {
        this.f267874d = chooseMsgFileUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        ChooseMsgFileUI chooseMsgFileUI = this.f267874d;
        String str = chooseMsgFileUI.f267843f;
        String str2 = "all";
        if (i != 0) {
            if (i == 1) {
                str2 = "image";
            } else if (i == 2) {
                str2 = "video";
            } else if (i == 3) {
                str2 = "file";
            }
        }
        chooseMsgFileUI.f267846i.mo127389c(true, str2, chooseMsgFileUI.f267845h);
        this.f267874d.mo127419J7(str2);
    }
}
