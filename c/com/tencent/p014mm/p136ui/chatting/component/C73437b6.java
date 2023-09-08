package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import di3.C86312j;
import p140cw.C7138g;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.chatting.component.b6 */
public class C73437b6 implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ C73669z5 f215811a;

    public C73437b6(C73669z5 z5Var) {
        this.f215811a = z5Var;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        C76701a.makeText((Context) this.f215811a.f215752d.mo91565f(), (CharSequence) this.f215811a.f215752d.mo91572m().getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
        ((C7138g) C86312j.m106911c(C7138g.class)).mo8315Wr(str2, this.f215811a.f215752d.mo91565f());
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        C76701a.makeText((Context) this.f215811a.f215752d.mo91565f(), (CharSequence) this.f215811a.f215752d.mo91572m().getString(C0966R.string.kag), 1).show();
    }
}
