package com.tencent.p014mm.plugin.profile.p088ui;

import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76708i;
import p248ug.C52557b0;
import p248ug.C52558c;
import p910lj.C76701a;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.profile.ui.k1 */
public class C42638k1 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f115416d;

    /* renamed from: e */
    public final /* synthetic */ C42643m1 f115417e;

    public C42638k1(C42643m1 m1Var, C89779i0 i0Var) {
        this.f115417e = m1Var;
        this.f115416d = i0Var;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C75700k0.class;
        Class cls2 = C52557b0.class;
        Log.m105925i("MicroMsg.ContactWidgetMiniShopHelper", "onSceneEnd, errType: %d, errCode: %d, errMsg: %s, scene: %d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
        if (yVar instanceof C44590b1) {
            C86709a0.m107524d().mo123470p(30, this);
            if (i == 0 && i2 == 0) {
                String T0 = ((C44590b1) yVar).mo56091T0();
                Log.m105924i("MicroMsg.ContactWidgetMiniShopHelper", "onSceneEnd, respUsername: " + T0);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_579db1f2cf89");
                this.f115417e.getClass();
                if (z1Var == null || Util.isNullOrNil(T0)) {
                    Log.m105921e("MicroMsg.ContactWidgetMiniShopHelper", "updateContact, contact: %s, respUsername: %s", z1Var, T0);
                } else {
                    C52558c cVar = null;
                    if (C72996z1.m85796D5(z1Var.getUsername())) {
                        String nullAsNil = Util.nullAsNil(z1Var.getUsername());
                        C52558c v = ((C52557b0) C86312j.m106911c(cls2)).mo71152v(nullAsNil);
                        if (v == null) {
                            v.field_username = T0;
                        }
                        ((C52557b0) C86312j.m106911c(cls2)).mo71150d0(nullAsNil);
                        z1Var.mo62874S2(nullAsNil);
                        cVar = v;
                    }
                    z1Var.setUsername(T0);
                    if (((int) z1Var.f108320R1) == 0) {
                        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var);
                    }
                    if (((int) z1Var.f108320R1) <= 0) {
                        Log.m105920e("MicroMsg.ContactWidgetMiniShopHelper", "updateContact, insert contact fail");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
                        if (cVar != null) {
                            ((C52557b0) C86312j.m106911c(cls2)).mo71149YD(cVar);
                        } else {
                            Class cls3 = C76708i.class;
                            C52558c v2 = ((C52557b0) C86312j.m106911c(cls2)).mo71152v(z1Var2.getUsername());
                            if (v2 == null || v2.mo72809G1()) {
                                Log.m105924i("MicroMsg.ContactWidgetMiniShopHelper", "updateBizInfoInNeed, shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls3)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5()) {
                                Log.m105924i("MicroMsg.ContactWidgetMiniShopHelper", "updateBizInfoInNeed, last check time:" + z1Var2.f149509Q0);
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls3)).mo106823Jc(z1Var2.getUsername());
                            }
                        }
                    }
                }
                C52558c v3 = ((C52557b0) C86312j.m106911c(cls2)).mo71152v(z1Var.getUsername());
                if (v3 != null) {
                    ((C52557b0) C86312j.m106911c(cls2)).ol0(v3);
                }
                C86709a0.m107535s().mo121142i().mo119676J(327825, Boolean.TRUE);
            } else {
                Log.m105928w("MicroMsg.ContactWidgetMiniShopHelper", "onSceneEnd, fail");
                if (4 == i && -24 == i2 && !Util.isNullOrNil(str)) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
                }
            }
            this.f115416d.dismiss();
            this.f115417e.mo66773b();
        }
    }
}
