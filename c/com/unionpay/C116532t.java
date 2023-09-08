package com.unionpay;

import android.content.SharedPreferences;

/* renamed from: com.unionpay.t */
public final class C116532t implements C116515a0 {

    /* renamed from: a */
    public final /* synthetic */ UPPayWapActivity f349499a;

    public C116532t(UPPayWapActivity uPPayWapActivity) {
        this.f349499a = uPPayWapActivity;
    }

    /* renamed from: a */
    public final void mo180512a(String str, C116517b0 b0Var) {
        UPPayWapActivity uPPayWapActivity = this.f349499a;
        if (uPPayWapActivity != null) {
            SharedPreferences.Editor edit = uPPayWapActivity.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.remove(str);
            edit.commit();
        }
        if (b0Var != null) {
            b0Var.mo180515a(UPPayWapActivity.m164324H7("0", "success", (String) null));
        }
    }
}
