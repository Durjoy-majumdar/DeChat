package com.tencent.p014mm.plugin.luckymoney.model;

import android.os.Handler;
import android.os.Message;
import b63.C67186g0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.luckymoney.model.C69225h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import f32.C75674c;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashMap;
import p281yz.C79173v;
import qo3.C89779i0;
import te3.C50994qp3;
import ub3.C78144b;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.i0 */
public class C69231i0 implements Handler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C50994qp3 f199201d;

    /* renamed from: e */
    public final /* synthetic */ C68070l.C68072b f199202e;

    /* renamed from: f */
    public final /* synthetic */ C69225h0.C69227b f199203f;

    public C69231i0(C69225h0.C69227b bVar, C50994qp3 qp32, C68070l.C68072b bVar2) {
        this.f199203f = bVar;
        this.f199201d = qp32;
        this.f199202e = bVar2;
    }

    public boolean handleMessage(Message message) {
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopePreview", "download finish: %s", Integer.valueOf(message.arg1));
        if (message.arg1 == 3) {
            C69225h0.m81571b();
            C69225h0.m81573d();
            String str = this.f199201d.f140445d;
            C68070l.C68072b bVar = this.f199202e;
            Class cls = C79173v.class;
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108732L2(str);
            f4Var.mo100991d(2);
            f4Var.mo108749c3("1@fackuser");
            f4Var.mo108733M2(C75604z3.m90843o("1@fackuser"));
            f4Var.mo108740T2(0);
            f4Var.setType(436207665);
            long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
            C67186g0 jo = ((C79173v) C86312j.m106911c(cls)).mo109172tc().mo105871jo(bVar.f195608o1);
            if (jo != null) {
                jo.field_hbType = 0;
                jo.field_hbStatus = 0;
                jo.field_receiveStatus = 0;
                jo.field_receiveAmount = 0;
                ((C79173v) C86312j.m106911c(cls)).mo109172tc().replace(jo);
            }
            ((HashMap) C75674c.f222274c).put(Long.valueOf(my02), this.f199201d);
            C78144b.C78145a aVar = C69225h0.f199187a;
            if (aVar != null) {
                ((C79173v.C79175d) aVar).f232487a.onCompletion();
            }
            C89779i0 i0Var = this.f199203f.f199190a;
            if (i0Var != null) {
                i0Var.dismiss();
            }
        }
        return false;
    }
}
