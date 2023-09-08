package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p159gw.C98250h;
import p159gw.C98252k;
import p910lj.C76701a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.i */
public class C93569i implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ Context f270228a;

    /* renamed from: b */
    public final /* synthetic */ String f270229b;

    /* renamed from: c */
    public final /* synthetic */ String f270230c;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.i$a */
    public class C93570a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f270231d;

        public C93570a(String str) {
            this.f270231d = str;
        }

        public void run() {
            ((C98252k) C86312j.m106911c(C98252k.class)).Aq0(C86013q1.m106456q(this.f270231d), C93569i.this.f270229b);
        }
    }

    public C93569i(Context context, String str, String str2) {
        this.f270228a = context;
        this.f270229b = str;
        this.f270230c = str2;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        Context context = this.f270228a;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.bwc, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
        ((C119157j) C119157j.f356862d).mo183875f(new C93570a(str2));
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        C76701a.makeText(this.f270228a, (CharSequence) this.f270230c, 1).show();
    }
}
