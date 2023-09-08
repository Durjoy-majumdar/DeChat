package com.tencent.p014mm.plugin.profile.p088ui.tab;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31519v2;
import eb0.C75597w2;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C76874e0;
import rb0.C47984k;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.v */
public final class C42768v implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ContactWidgetTabBizInfo f115793d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.v$a */
    public static final class C42769a implements C75597w2.C31525a {

        /* renamed from: a */
        public static final C42769a f115794a = new C42769a();

        /* renamed from: a */
        public final void mo1109a(String str, boolean z) {
            Log.m105925i("MicroMsg.ContactWidgetTabBizInfo", "onCreateMMMenu Fetch Contact username:%s, succ: %b", str, Boolean.valueOf(z));
        }
    }

    public C42768v(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f115793d = contactWidgetTabBizInfo;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C72996z1 z1Var = this.f115793d.f115610i;
        boolean z = true;
        String str = null;
        if (z1Var != null && z1Var.mo62927s3()) {
            C72996z1 z1Var2 = this.f115793d.f115610i;
            if (z1Var2 != null && z1Var2.mo62940x3()) {
                C72996z1 z1Var3 = this.f115793d.f115610i;
                if (z1Var3 != null) {
                    str = z1Var3.getUsername();
                }
                if (C47984k.m53341o(str)) {
                    e0Var.mo107125a(this.f115793d.f115598R, C0966R.string.bky);
                } else {
                    e0Var.mo107125a(this.f115793d.f115598R, C0966R.string.f361011gm3);
                }
            } else {
                C72996z1 z1Var4 = this.f115793d.f115610i;
                if (z1Var4 != null) {
                    str = z1Var4.getUsername();
                }
                if (C47984k.m53341o(str)) {
                    e0Var.mo107125a(this.f115793d.f115597Q, C0966R.string.bku);
                } else {
                    e0Var.mo107125a(this.f115793d.f115597Q, C0966R.string.bsh);
                }
            }
        } else {
            C72996z1 z1Var5 = this.f115793d.f115610i;
            Integer valueOf = z1Var5 != null ? Integer.valueOf((int) z1Var5.f108320R1) : null;
            C87412m.m108591d(valueOf);
            if (valueOf.intValue() <= 0) {
                C75597w2 a = C31519v2.m39436a();
                C72996z1 z1Var6 = this.f115793d.f115610i;
                if (z1Var6 != null) {
                    str = z1Var6.getUsername();
                }
                a.mo55988e(str, "", C42769a.f115794a);
            }
        }
        e0Var.mo107125a(this.f115793d.f115595N, C0966R.string.bqj);
        e0Var.mo107125a(this.f115793d.f115599S, C0966R.string.b7n);
        C72996z1 z1Var7 = this.f115793d.f115610i;
        if (z1Var7 == null || !z1Var7.mo62927s3()) {
            z = false;
        }
        if (z) {
            e0Var.mo107125a(this.f115793d.f115596P, C0966R.string.bl9);
            ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f115793d;
            e0Var.mo107140d(contactWidgetTabBizInfo.f115600T, -65536, contactWidgetTabBizInfo.f115605d.getString(C0966R.string.an5));
        }
    }
}
