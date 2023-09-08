package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.scanner.ui.w */
public class C71022w implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ TranslationResultUI f205536a;

    public C71022w(TranslationResultUI translationResultUI) {
        this.f205536a = translationResultUI;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        TranslationResultUI translationResultUI = this.f205536a;
        C76701a.makeText((Context) translationResultUI, (CharSequence) translationResultUI.getString(C0966R.string.fn4, new Object[]{str2}), 1).show();
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        TranslationResultUI translationResultUI = this.f205536a;
        C76701a.makeText((Context) translationResultUI, (CharSequence) translationResultUI.getString(C0966R.string.iak), 1).show();
    }
}
