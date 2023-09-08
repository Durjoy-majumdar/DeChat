package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.List;
import java.util.Random;
import og2.C100336e;
import og2.C100346q;
import p478cp.C45138c;
import qg2.C101143h0;
import qg2.C101153n0;
import te3.C101801kd0;
import te3.C77915dp3;

/* renamed from: com.tencent.mm.pluginsdk.model.app.y */
public class C96779y implements C45138c.C45139a {

    /* renamed from: a */
    public final /* synthetic */ long f283522a;

    /* renamed from: b */
    public final /* synthetic */ C72963f4 f283523b;

    /* renamed from: c */
    public final /* synthetic */ String f283524c;

    /* renamed from: d */
    public final /* synthetic */ C68070l.C68072b f283525d;

    /* renamed from: e */
    public final /* synthetic */ C101801kd0 f283526e;

    /* renamed from: f */
    public final /* synthetic */ C77915dp3 f283527f;

    /* renamed from: g */
    public final /* synthetic */ C72963f4 f283528g;

    public C96779y(long j, C72963f4 f4Var, String str, C68070l.C68072b bVar, C101801kd0 kd02, C77915dp3 dp32, C72963f4 f4Var2) {
        this.f283522a = j;
        this.f283523b = f4Var;
        this.f283524c = str;
        this.f283525d = bVar;
        this.f283526e = kd02;
        this.f283527f = dp32;
        this.f283528g = f4Var2;
    }

    /* renamed from: a */
    public void mo70647a(int i, String str, List<C45138c.C45141c> list) {
        Class cls = C75700k0.class;
        Class cls2 = C100336e.class;
        if (i == 0) {
            C100346q qVar = new C100346q();
            qVar.field_msgId = this.f283522a;
            qVar.field_oriMsgId = this.f283523b.getMsgId();
            qVar.field_toUser = this.f283524c;
            C68070l.C68072b bVar = this.f283525d;
            qVar.field_title = bVar.f195570f;
            qVar.field_desc = bVar.f195574g;
            qVar.field_dataProto = this.f283526e;
            qVar.field_type = 0;
            qVar.field_favFrom = this.f283527f.f227156g;
            qVar.field_localId = new Random().nextInt(2147483645) + 1;
            Log.m105925i("MicroMsg.AppMsgLogic", "summerrecord needNetScene insert ret:%b, id:%d, localid:%d", Boolean.valueOf(((C101143h0) ((C100336e) C86312j.m106911c(cls2)).k10()).insert(qVar)), Long.valueOf(this.f283522a), Integer.valueOf(qVar.field_localId));
            ((C101153n0) ((C100336e) C86312j.m106911c(cls2)).mo139409NS()).mo140599f(qVar, false);
            return;
        }
        if (-3200 == i) {
            Log.m105921e("MicroMsg.AppMsgLogic", "why errCode equals %s", Integer.valueOf(i));
        }
        this.f283528g.mo100991d(5);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f283522a, this.f283528g);
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108733M2(this.f283528g.getCreateTime() + 1);
        f4Var.mo108749c3(this.f283528g.mo108768t());
        f4Var.mo108732L2(str);
        f4Var.setType(10000);
        f4Var.mo100991d(6);
        f4Var.mo108740T2(0);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).my0(f4Var);
    }
}
