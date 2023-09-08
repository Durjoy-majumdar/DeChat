package com.tencent.p014mm.plugin.luckymoney.model;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import cr3.C75280e;
import cr3.C75281f;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.d1 */
public class C69203d1 implements C11385n, C75280e {

    /* renamed from: d */
    public Context f199124d;

    /* renamed from: e */
    public C75281f f199125e = null;

    /* renamed from: f */
    public HashSet<C117747y> f199126f = new HashSet<>();

    /* renamed from: g */
    public HashSet<C117747y> f199127g = new HashSet<>();

    /* renamed from: h */
    public C89779i0 f199128h = null;

    /* renamed from: i */
    public Set<Integer> f199129i = new HashSet();

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.d1$a */
    public class C69204a implements DialogInterface.OnCancelListener {
        public C69204a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C69203d1.this.mo95365e();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.d1$b */
    public class C69205b implements DialogInterface.OnCancelListener {
        public C69205b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C69203d1 d1Var = C69203d1.this;
            if (d1Var.f199128h != null && d1Var.f199126f.isEmpty()) {
                C69203d1.this.f199128h.dismiss();
                Iterator<C117747y> it = C69203d1.this.f199127g.iterator();
                while (it.hasNext()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(it.next());
                }
                C69203d1.this.f199127g.clear();
            }
        }
    }

    public C69203d1(Context context, C75281f fVar) {
        this.f199124d = context;
        this.f199125e = fVar;
    }

    /* renamed from: a */
    public void mo95361a() {
        C89779i0 i0Var = this.f199128h;
        if (i0Var != null && i0Var.isShowing()) {
            this.f199128h.dismiss();
        }
    }

    /* renamed from: b */
    public void mo95362b(C117747y yVar, boolean z) {
        C89779i0 i0Var;
        if (yVar != null && (yVar instanceof C75123k0)) {
            ((C75123k0) yVar).setProcessName((String) null);
        }
        this.f199126f.add(yVar);
        if (z && ((i0Var = this.f199128h) == null || !i0Var.isShowing())) {
            C89779i0 i0Var2 = this.f199128h;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            Context context = this.f199124d;
            this.f199128h = C76879j.m92723Q(context, (String) null, context.getString(C0966R.string.gas), true, false, new C69204a());
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(yVar);
    }

    /* renamed from: c */
    public void mo95363c(int i) {
        ((HashSet) this.f199129i).add(Integer.valueOf(i));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(i, this);
    }

    /* renamed from: d */
    public void mo95364d(C117747y yVar, boolean z) {
        C89779i0 i0Var;
        Log.m105918d("MicroMsg.WalletNetSceneMgr", "isShowProgress " + z);
        if (yVar != null && (yVar instanceof C75123k0)) {
            ((C75123k0) yVar).setProcessName((String) null);
        }
        this.f199127g.add(yVar);
        if (z && ((i0Var = this.f199128h) == null || !i0Var.isShowing())) {
            C89779i0 i0Var2 = this.f199128h;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            Context context = this.f199124d;
            this.f199128h = C76879j.m92722P(context, (String) null, 3, context.getString(C0966R.string.gas), true, true, new C69205b());
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(yVar);
    }

    /* renamed from: e */
    public void mo95365e() {
        C89779i0 i0Var = this.f199128h;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f199128h = null;
        }
        Iterator<C117747y> it = this.f199126f.iterator();
        while (it.hasNext()) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(it.next());
        }
        Iterator<C117747y> it4 = this.f199127g.iterator();
        while (it4.hasNext()) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(it4.next());
        }
        this.f199126f.clear();
        this.f199127g.clear();
    }

    /* renamed from: f */
    public void mo95366f(int i) {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(i, this);
        ((HashSet) this.f199129i).remove(Integer.valueOf(i));
        if (((HashSet) this.f199129i).isEmpty()) {
            mo95365e();
            this.f199125e = null;
            this.f199124d = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r11, int r12, java.lang.String r13, ob0.C117747y r14) {
        /*
            r10 = this;
            java.util.HashSet<ob0.y> r0 = r10.f199127g
            boolean r0 = r0.contains(r14)
            java.lang.String r1 = "MicroMsg.WalletNetSceneMgr"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0018
            java.util.HashSet<ob0.y> r0 = r10.f199127g
            r0.remove(r14)
            java.lang.String r0 = "has find scene "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
        L_0x0016:
            r0 = 1
            goto L_0x002c
        L_0x0018:
            java.util.HashSet<ob0.y> r0 = r10.f199126f
            boolean r0 = r0.contains(r14)
            if (r0 == 0) goto L_0x002b
            java.util.HashSet<ob0.y> r0 = r10.f199126f
            r0.remove(r14)
            java.lang.String r0 = "has find forcescenes "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            goto L_0x0016
        L_0x002b:
            r0 = 0
        L_0x002c:
            java.util.HashSet<ob0.y> r1 = r10.f199127g
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0048
            java.util.HashSet<ob0.y> r1 = r10.f199126f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0048
            qo3.i0 r1 = r10.f199128h
            if (r1 == 0) goto L_0x0046
            r1.dismiss()
            r1 = 0
            r10.f199128h = r1
        L_0x0046:
            r9 = 1
            goto L_0x0049
        L_0x0048:
            r9 = 0
        L_0x0049:
            if (r0 == 0) goto L_0x0056
            cr3.f r4 = r10.f199125e
            if (r4 == 0) goto L_0x0056
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r4.onSceneEnd(r5, r6, r7, r8, r9)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69203d1.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
