package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.subapp.jdbiz.C96460e;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import kr0.C76630x0;

/* renamed from: com.tencent.mm.ui.h0 */
public class C97231h0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96460e f285303d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandStatObject f285304e;

    /* renamed from: f */
    public final /* synthetic */ FindMoreFriendsUI f285305f;

    public C97231h0(FindMoreFriendsUI findMoreFriendsUI, C96460e eVar, AppBrandStatObject appBrandStatObject) {
        this.f285305f = findMoreFriendsUI;
        this.f285303d = eVar;
        this.f285304e = appBrandStatObject;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Activity context = this.f285305f.getContext();
        C96460e eVar = this.f285303d;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(context, eVar.f282212a, "", 0, eVar.f282214c, eVar.f282213b, this.f285304e);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, Boolean.TRUE);
    }
}
