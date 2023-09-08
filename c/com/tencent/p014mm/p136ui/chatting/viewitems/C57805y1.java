package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86300q;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60200t1;
import nj3.C76912y0;
import p565ir.C60613r;
import te3.C64287ci1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.y1 */
public final class C57805y1 implements C86300q {

    /* renamed from: a */
    public final /* synthetic */ boolean f165401a;

    /* renamed from: b */
    public final /* synthetic */ Context f165402b;

    public C57805y1(boolean z, Context context) {
        this.f165401a = z;
        this.f165402b = context;
    }

    /* renamed from: a */
    public void mo63853a() {
        Log.m105920e("MicroMsg.ChattingItemAppMsgFinderProduct", "miniprogram died!");
    }

    /* renamed from: b */
    public void mo63854b(String str) {
        C64287ci1 iW;
        Class cls = C60613r.class;
        Log.m105924i("MicroMsg.ChattingItemAppMsgFinderProduct", "onTriggerHalfScreenShare " + str);
        if (!(str == null || str.length() == 0) && (iW = ((C60613r) C86312j.m106911c(cls)).mo84980iW(str)) != null) {
            Context context = this.f165402b;
            C7335d c = C86312j.m106911c(C60200t1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C60200t1.C60201a.m70372j((C60200t1) c, context, iW, (C32226l) null, 4, (Object) null);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IFinderLiveUtilService::class.java)");
            ((C60613r) C86312j.m106911c(cls)).Vb0(iW, "share_commodity", C60613r.C60614a.m70875a((C60613r) c2, iW, (String) null, (String) null, (Integer) null, 14, (Object) null));
        }
    }

    /* renamed from: c */
    public void mo63855c() {
        Log.m105920e("MicroMsg.ChattingItemAppMsgFinderProduct", "enter miniprogram suc!");
        if (this.f165401a) {
            Context context = this.f165402b;
            C76912y0.m92767f(context, context.getResources().getString(C0966R.string.mbi));
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo63856d() {
    }

    /* renamed from: e */
    public void mo63857e() {
        Log.m105920e("MicroMsg.ChattingItemAppMsgFinderProduct", "enter miniprogram error!");
    }

    /* renamed from: f */
    public void mo63858f(boolean z) {
        Log.m105920e("MicroMsg.ChattingItemAppMsgFinderProduct", "exit miniprogram!");
    }
}
