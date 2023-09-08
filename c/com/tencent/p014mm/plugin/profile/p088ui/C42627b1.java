package com.tencent.p014mm.plugin.profile.p088ui;

import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import eb0.C75592q0;
import eb0.C97625j3;
import g62.C8233m;
import qo3.C89779i0;
import tc0.C77884m;
import tc0.C77885p;

/* renamed from: com.tencent.mm.plugin.profile.ui.b1 */
public class C42627b1 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ boolean f115398d;

    /* renamed from: e */
    public final /* synthetic */ C6975i1 f115399e;

    /* renamed from: f */
    public final /* synthetic */ C89779i0 f115400f;

    public C42627b1(boolean z, C6975i1 i1Var, C89779i0 i0Var) {
        this.f115398d = z;
        this.f115399e = i1Var;
        this.f115400f = i0Var;
    }

    public boolean onTimerExpired() {
        int o = C75592q0.m90785o();
        int i = this.f115398d ? o & -32769 : o | 32768;
        C97625j3.m125812b().mo105906u().mo119676J(34, Integer.valueOf(i));
        C8233m B = C97625j3.m125812b().mo105876B();
        C77884m mVar = r2;
        C77884m mVar2 = new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i, "", 0, "", 0);
        ((C77885p) B).mo107993q(mVar);
        if (!this.f115398d) {
            C42628c1.m46308c();
        }
        C6975i1 i1Var = this.f115399e;
        if (i1Var != null) {
            i1Var.onNotifyChange((String) null, (MStorageEventData) null);
        }
        C89779i0 i0Var = this.f115400f;
        if (i0Var == null) {
            return true;
        }
        i0Var.dismiss();
        return true;
    }
}
