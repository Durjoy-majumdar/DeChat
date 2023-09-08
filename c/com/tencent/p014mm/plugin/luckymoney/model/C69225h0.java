package com.tencent.p014mm.plugin.luckymoney.model;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68062c;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f32.C75672b;
import f40.C86709a0;
import f62.C75700k0;
import hp3.C87581a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import nj3.C76879j;
import nr3.C89059e;
import ob0.C89132b;
import qo3.C89779i0;
import te3.C50924q72;
import te3.C50994qp3;
import te3.C77993rp3;
import te3.C77999tf2;
import ub3.C78144b;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.h0 */
public class C69225h0 {

    /* renamed from: a */
    public static C78144b.C78145a f199187a;

    /* renamed from: b */
    public static C42518g f199188b;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.h0$a */
    public class C69226a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C42518g f199189d;

        public C69226a(C42518g gVar) {
            this.f199189d = gVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            this.f199189d.mo85581g();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.h0$b */
    public class C69227b implements C87581a<Object, C89132b.C89134c<C50924q72>> {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f199190a;

        /* renamed from: b */
        public final /* synthetic */ Context f199191b;

        public C69227b(C89779i0 i0Var, Context context) {
            this.f199190a = i0Var;
            this.f199191b = context;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopePreview", "do confirm errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                Iterator<C50994qp3> it = ((C50924q72) cVar.f256796d).f140171d.iterator();
                while (it.hasNext()) {
                    C50994qp3 next = it.next();
                    C68070l.C68072b u = C68070l.C68072b.m80422u(next.f140445d, (String) null);
                    C68062c cVar2 = (C68062c) u.mo93555w(C68062c.class);
                    C77999tf2 tf22 = new C77999tf2();
                    tf22.f228244e = cVar2.f195388e;
                    tf22.f228247h = cVar2.f195389f;
                    tf22.f228245f = cVar2.f195392i;
                    tf22.f228248i = cVar2.f195393j;
                    tf22.f228246g = cVar2.f195394k;
                    tf22.f228249j = cVar2.f195395l;
                    tf22.f228259w = cVar2.f195406w;
                    tf22.f228239A = cVar2.f195407x;
                    tf22.f228260x = cVar2.f195409z;
                    tf22.f228240B = cVar2.f195380A;
                    tf22.f228242D = cVar2.f195381B;
                    tf22.f228261y = cVar2.f195382C;
                    tf22.f228241C = cVar2.f195383D;
                    tf22.f228253q = cVar2.f195400q;
                    tf22.f228254r = cVar2.f195401r;
                    tf22.f228251o = cVar2.f195398o;
                    tf22.f228252p = cVar2.f195399p;
                    C77993rp3 rp32 = next.f140448g;
                    if (rp32 != null) {
                        rp32.f228175C = cVar2.f195396m;
                    }
                    C69231i0 i0Var = new C69231i0(this, next, u);
                    Class cls = C75672b.class;
                    AtomicInteger atomicInteger = new AtomicInteger(0);
                    ((C75672b) C86312j.m106911c(cls)).mo95331xk(tf22.f228244e, tf22.f228247h, "", new C69238k0(atomicInteger, i0Var));
                    ((C75672b) C86312j.m106911c(cls)).mo95331xk(tf22.f228245f, tf22.f228248i, "", new C69241l0(atomicInteger, i0Var));
                    ((C75672b) C86312j.m106911c(cls)).mo95331xk(tf22.f228246g, tf22.f228249j, "", new C69246m0(atomicInteger, i0Var));
                    ((C75672b) C86312j.m106911c(cls)).mo95331xk(tf22.f228253q, tf22.f228254r, "", new C69250n0(atomicInteger, i0Var));
                    ((C75672b) C86312j.m106911c(cls)).mo95331xk(tf22.f228251o, tf22.f228252p, "", new C69254o0(atomicInteger, i0Var));
                    ((C75672b) C86312j.m106911c(cls)).mo95318Ng(rp32, true);
                }
            } else {
                C89779i0 i0Var2 = this.f199190a;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
                String str = cVar.f256795c;
                if (Util.isNullOrNil(str)) {
                    str = MMApplicationContext.getContext().getString(C0966R.string.l_3);
                }
                C76879j.m92754y(this.f199191b, str, "", MMApplicationContext.getContext().getString(C0966R.string.gfp), new C69235j0(this));
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m81570a(Context context, C42518g gVar) {
        C89779i0 O = C76879j.m92721O(context, (String) null, 3, C0966R.style.f8510l3, context.getString(C0966R.string.gas), true, true, new C69226a(gVar));
        if (!(context instanceof MMFragmentActivity)) {
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopePreview", "context is not MMFragmentActivity: %s", context.getClass().getName());
            return;
        }
        C89059e i = gVar.mo9225i();
        i.mo11397F((MMFragmentActivity) context);
        i.mo123064p(new C69227b(O, context));
    }

    /* renamed from: b */
    public static void m81571b() {
        Class cls = C75700k0.class;
        Log.m105919d("MicroMsg.LuckyMoneyEnvelopePreview", "before cursor: %s", Integer.valueOf(((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).r50("1@fackuser").getCount()));
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101089TE("1@fackuser");
        Log.m105919d("MicroMsg.LuckyMoneyEnvelopePreview", "after cursor: %s", Integer.valueOf(((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).r50("1@fackuser").getCount()));
    }

    /* renamed from: c */
    public static void m81572c(Context context, String str, C78144b.C78145a aVar) {
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopePreview", "do get red packet preview from scan，url: %s", str);
        f199187a = null;
        C42518g gVar = f199188b;
        if (gVar != null) {
            gVar.mo85581g();
            f199188b = null;
        }
        f199187a = aVar;
        C42518g gVar2 = new C42518g(0, str, "");
        f199188b = gVar2;
        m81570a(context, gVar2);
    }

    /* renamed from: d */
    public static void m81573d() {
        Class cls = C75700k0.class;
        if (((int) ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69664N2("1@fackuser").f108320R1) > 0) {
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69688c("1@fackuser");
        }
        C72996z1 z1Var = new C72996z1();
        z1Var.setUsername("1@fackuser");
        z1Var.mo62878U2(MMApplicationContext.getContext().getString(C0966R.string.gil));
        z1Var.mo62868O3();
        z1Var.f108320R1 = -99;
        z1Var.mo62879U3(3);
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69690c4(z1Var);
    }
}
