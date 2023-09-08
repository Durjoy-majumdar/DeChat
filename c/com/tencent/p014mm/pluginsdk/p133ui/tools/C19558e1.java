package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19569p0;
import di3.C86312j;
import p262wm.C22921c;
import qo3.C47883u;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.e1 */
public final class C19558e1 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ QBFileMenuBottomSheetHelper f55368a;

    public C19558e1(QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper) {
        this.f55368a = qBFileMenuBottomSheetHelper;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        Class cls = C22921c.class;
        if (z) {
            MMActivity mMActivity = this.f55368a.f55282a;
            QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper = this.f55368a;
            MMActivity mMActivity2 = qBFileMenuBottomSheetHelper.f55282a;
            C19569p0.C19570a aVar = qBFileMenuBottomSheetHelper.f55283b;
            Intent qw = ((C22921c) C86312j.m106911c(cls)).mo35893qw(mMActivity2, aVar.f55384g, aVar.f55381d);
            qw.setPackage(this.f55368a.f55290i);
            C13598b0 b0Var = C13598b0.f38549a;
            ((C22921c) C86312j.m106911c(cls)).y90(mMActivity, qw);
        }
    }
}
