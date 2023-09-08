package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.text.SpannableString;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import p629ny.C76979h;
import te3.C78021z;

/* renamed from: com.tencent.mm.plugin.aa.ui.v1 */
public class C68347v1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f196372d;

    /* renamed from: e */
    public final /* synthetic */ String f196373e;

    /* renamed from: f */
    public final /* synthetic */ C78021z f196374f;

    /* renamed from: g */
    public final /* synthetic */ PaylistAAUI f196375g;

    public C68347v1(PaylistAAUI paylistAAUI, TextView textView, String str, C78021z zVar) {
        this.f196375g = paylistAAUI;
        this.f196372d = textView;
        this.f196373e = str;
        this.f196374f = zVar;
    }

    public void run() {
        if (this.f196372d.getMeasuredWidth() != 0) {
            String str = "  " + this.f196375g.getString(C0966R.string.hhb);
            PaylistAAUI paylistAAUI = this.f196375g;
            TextView textView = this.f196372d;
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f196375g.getContext(), str + (" " + this.f196373e + " "));
            C78021z zVar = this.f196374f;
            int i = PaylistAAUI.f196231R;
            paylistAAUI.mo93856R7(textView, T1, str, zVar);
        }
    }
}
