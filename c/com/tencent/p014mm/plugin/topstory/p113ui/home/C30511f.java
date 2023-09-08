package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbiz.WXOpenBusinessView;
import di3.C86312j;
import kj2.C117407d;
import p763ym.C39072t;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.f */
public class C30511f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Bundle f82196d;

    /* renamed from: e */
    public final /* synthetic */ String f82197e;

    public C30511f(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl, Bundle bundle, String str) {
        this.f82196d = bundle;
        this.f82197e = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C117407d.INSTANCE.mo160131h(17080, 43, 1);
        ((C39072t) C86312j.m106911c(C39072t.class)).Fj0(this.f82196d, new WXOpenBusinessView.Resp(this.f82196d), this.f82197e);
    }
}
