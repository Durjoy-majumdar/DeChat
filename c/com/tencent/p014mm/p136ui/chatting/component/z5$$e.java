package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import hd0.C76152m;
import hd0.C98429r0;
import p682rz.C101491u;
import p910lj.C76701a;
import te3.tc4;

/* renamed from: com.tencent.mm.ui.chatting.component.z5$$e */
public class z5$$e implements C76152m.C76154b {

    /* renamed from: a */
    public final /* synthetic */ String f216308a;

    /* renamed from: b */
    public final /* synthetic */ C73669z5 f216309b;

    public z5$$e(C73669z5 z5Var, String str) {
        this.f216309b = z5Var;
        this.f216308a = str;
    }

    /* renamed from: a */
    public void mo96034a(int i, String str, String str2, String str3, int i2) {
        int i3 = i;
        if (i3 == -50002) {
            C76701a.makeText((Context) this.f216309b.f215752d.mo91565f(), (CharSequence) this.f216309b.f215752d.mo91565f().getString(C0966R.string.ka_), 0).show();
        } else if (i3 < 0) {
            C76701a.makeText((Context) this.f216309b.f215752d.mo91565f(), (CharSequence) this.f216309b.f215752d.mo91565f().getString(C0966R.string.ka9), 0).show();
        } else {
            if (!Util.isNullOrNil(str2)) {
                C98429r0.m127827r(str2, (String) null, i2, this.f216308a, str3, 0, "", 43, (tc4) null, "", 0, (String) null, (String) null, true);
            }
            C98429r0.m127826q(str, str2, i2, this.f216308a, str3, 0, "", 43, (tc4) null, "", 0, (String) null, (String) null);
            ((C101491u) C86312j.m106911c(C101491u.class)).mo140800Ic(str);
        }
        this.f216309b.f215752d.mo91561b();
    }
}
