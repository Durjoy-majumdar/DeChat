package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75598w3;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import jr2.C99019x;
import os2.C100421x;
import p166hy.C98567o0;

/* renamed from: com.tencent.mm.ui.conversation.banner.y */
public class C74683y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f219563d;

    /* renamed from: e */
    public final /* synthetic */ int f219564e;

    /* renamed from: f */
    public final /* synthetic */ C74665a0 f219565f;

    public C74683y(C74665a0 a0Var, int i, int i2) {
        this.f219565f = a0Var;
        this.f219563d = i;
        this.f219564e = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75598w3.m90816e().mo105950b(this.f219563d, this.f219564e);
        C74665a0 a0Var = this.f219565f;
        Context context = a0Var.f230570g.get();
        a0Var.getClass();
        C97625j3.m125812b().mo105906u().mo119676J(68377, "");
        boolean isNullOrNil = Util.isNullOrNil((String) C97625j3.m125812b().mo105906u().mo119684e(68377, (Object) null));
        if (C99019x.m128969a() != null && ((C100421x) C99019x.m128969a()).mo139896kD() > 0) {
            isNullOrNil = false;
        }
        C98567o0.C76249a aVar = new C98567o0.C76249a();
        aVar.f223351g = isNullOrNil;
        ((C98567o0) C86312j.m106911c(C98567o0.class)).yb0(context, (Intent) null, 6, aVar);
        C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 8, 1);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
