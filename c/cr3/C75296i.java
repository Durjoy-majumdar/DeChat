package cr3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.tenpay.model.C75159a;
import com.tencent.p014mm.wallet_core.tenpay.model.ITenpaySave;
import di3.C86312j;
import f40.C86709a0;
import fr3.C75790l;
import fr3.C75791m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p281yz.C79173v;
import qo3.C77390c0;
import sf0.C90188n0;

/* renamed from: cr3.i */
public class C75296i implements C11385n, C75280e {

    /* renamed from: d */
    public Context f221436d;

    /* renamed from: e */
    public C75281f f221437e = null;

    /* renamed from: f */
    public HashSet<C117747y> f221438f = new HashSet<>();

    /* renamed from: g */
    public HashSet<C117747y> f221439g = new HashSet<>();

    /* renamed from: h */
    public Dialog f221440h = null;

    /* renamed from: i */
    public Set<Integer> f221441i = new HashSet();

    /* renamed from: j */
    public String f221442j;

    /* renamed from: n */
    public Bundle f221443n;

    /* renamed from: o */
    public C75276a f221444o;

    /* renamed from: p */
    public C75277b f221445p;

    /* renamed from: q */
    public HashMap<Integer, C75278c> f221446q;

    /* renamed from: cr3.i$a */
    public class C75297a implements DialogInterface.OnCancelListener {
        public C75297a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C75296i.this.mo105627f();
        }
    }

    /* renamed from: cr3.i$b */
    public class C75298b implements DialogInterface.OnCancelListener {
        public C75298b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C75296i iVar = C75296i.this;
            if (iVar.f221440h != null && iVar.f221438f.isEmpty()) {
                C75296i.this.f221440h.dismiss();
                Iterator<C117747y> it = C75296i.this.f221439g.iterator();
                while (it.hasNext()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(it.next());
                }
                C75296i.this.f221439g.clear();
            }
        }
    }

    /* renamed from: cr3.i$c */
    public class C75299c implements DialogInterface.OnCancelListener {
        public C75299c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C75296i iVar = C75296i.this;
            if (iVar.f221440h != null && iVar.f221438f.isEmpty()) {
                C75296i.this.f221440h.dismiss();
                Iterator<C117747y> it = C75296i.this.f221439g.iterator();
                while (it.hasNext()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(it.next());
                }
                C75296i.this.f221439g.clear();
            }
        }
    }

    /* renamed from: cr3.i$d */
    public class C75300d implements DialogInterface.OnCancelListener {
        public C75300d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C75296i iVar = C75296i.this;
            if (iVar.f221440h != null && iVar.f221438f.isEmpty()) {
                C75296i.this.f221440h.dismiss();
                Iterator<C117747y> it = C75296i.this.f221439g.iterator();
                while (it.hasNext()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(it.next());
                }
                C75296i.this.f221439g.clear();
            }
        }
    }

    /* renamed from: cr3.i$e */
    public class C75301e implements DialogInterface.OnCancelListener {
        public C75301e() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C75296i iVar = C75296i.this;
            if (iVar.f221440h != null && iVar.f221438f.isEmpty()) {
                C75296i.this.f221440h.dismiss();
                Iterator<C117747y> it = C75296i.this.f221439g.iterator();
                while (it.hasNext()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(it.next());
                }
                C75296i.this.f221439g.clear();
            }
        }
    }

    /* renamed from: cr3.i$f */
    public class C75302f implements DialogInterface.OnCancelListener {
        public C75302f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C75296i iVar = C75296i.this;
            if (iVar.f221440h != null && iVar.f221438f.isEmpty()) {
                C75296i.this.f221440h.dismiss();
                Iterator<C117747y> it = C75296i.this.f221439g.iterator();
                while (it.hasNext()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(it.next());
                }
                C75296i.this.f221439g.clear();
            }
        }
    }

    /* renamed from: cr3.i$g */
    public class C75303g implements DialogInterface.OnCancelListener {
        public C75303g() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C75296i iVar = C75296i.this;
            if (iVar.f221440h != null && iVar.f221438f.isEmpty()) {
                C75296i.this.f221440h.dismiss();
                Iterator<C117747y> it = C75296i.this.f221439g.iterator();
                while (it.hasNext()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(it.next());
                }
                C75296i.this.f221439g.clear();
            }
        }
    }

    public C75296i(Context context, C75281f fVar) {
        this.f221436d = context;
        this.f221437e = fVar;
        this.f221444o = new C75276a(this);
        this.f221445p = new C75277b(this);
        this.f221446q = new HashMap<>();
    }

    /* renamed from: a */
    public void mo95361a() {
        Dialog dialog = this.f221440h;
        if (dialog != null) {
            dialog.dismiss();
            this.f221440h = null;
        }
    }

    /* renamed from: b */
    public void mo95362b(C117747y yVar, boolean z) {
        Dialog dialog;
        mo105629h(yVar);
        this.f221438f.add(yVar);
        if (z && ((dialog = this.f221440h) == null || (dialog != null && !dialog.isShowing()))) {
            Dialog dialog2 = this.f221440h;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            Context context = this.f221436d;
            if (context == null) {
                Log.m105929w("MicroMsg.WalletNetSceneMgr", "%s activity has destroyed!!!", this);
                return;
            }
            this.f221440h = C75197d0.m90164e(context, false, new C75297a());
        }
        if (C90188n0.f258925S && (yVar instanceof C75790l)) {
            C75790l lVar = (C75790l) yVar;
            if (lVar.getUri().contains("authen") || lVar.getUri().contains("verify")) {
                lVar.setFake();
            }
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(yVar);
    }

    /* renamed from: c */
    public void mo105624c(int i) {
        ((HashSet) this.f221441i).add(Integer.valueOf(i));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(i, this);
    }

    /* renamed from: d */
    public void mo105625d(C117747y yVar, boolean z) {
        mo105626e(yVar, z, 1, 0);
    }

    /* renamed from: e */
    public void mo105626e(C117747y yVar, boolean z, int i, int i2) {
        Dialog dialog;
        C117747y yVar2 = yVar;
        int i3 = i;
        Object[] objArr = new Object[7];
        objArr[0] = this;
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = yVar2;
        objArr[3] = Integer.valueOf(i);
        objArr[4] = Integer.valueOf(yVar.getType());
        boolean z2 = yVar2 instanceof C45119n;
        objArr[5] = Boolean.valueOf(z2);
        Dialog dialog2 = this.f221440h;
        objArr[6] = Boolean.valueOf(dialog2 == null || (dialog2 != null && !dialog2.isShowing()));
        Log.m105925i("MicroMsg.WalletNetSceneMgr", "this %s isShowProgress %s scene: %s dialogType %s type %s IWxSafePay %s tipDialog showing? %s", objArr);
        mo105629h(yVar);
        this.f221439g.add(yVar2);
        if (z && ((dialog = this.f221440h) == null || (dialog != null && !dialog.isShowing()))) {
            Dialog dialog3 = this.f221440h;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
            Context context = this.f221436d;
            if (context == null) {
                Log.m105928w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
                return;
            } else if (i3 == 1) {
                if (z2) {
                    this.f221440h = C75197d0.m90164e(context, false, new C75298b());
                } else {
                    this.f221440h = C76879j.m92723Q(context, context.getString(C0966R.string.f7961xj), this.f221436d.getString(C0966R.string.l4f), false, false, new C75299c());
                }
            } else if (i3 == 2) {
                this.f221440h = C76879j.m92723Q(context, context.getString(C0966R.string.f7961xj), this.f221436d.getString(C0966R.string.l4f), false, false, new C75300d());
            } else if (i3 == 3) {
                C75301e eVar = new C75301e();
                int i4 = C75197d0.f221234d;
                View inflate = View.inflate(context, C0966R.C0971layout.cg5, (ViewGroup) null);
                C75197d0.m90161a(context, inflate);
                ((TextView) inflate.findViewById(C0966R.C0970id.c6x)).setText("验证中");
                C77390c0 c0Var = new C77390c0(context, C0966R.style.a0u);
                c0Var.setCancelable(false);
                c0Var.setContentView(inflate);
                c0Var.setOnCancelListener(eVar);
                c0Var.show();
                this.f221440h = c0Var;
            } else if (i3 == 4) {
                this.f221440h = C75197d0.m90164e(context, false, new C75302f());
            } else {
                Log.m105925i("MicroMsg.WalletNetSceneMgr", "unknown dialog type: %d", Integer.valueOf(i));
                Context context2 = this.f221436d;
                this.f221440h = C76879j.m92723Q(context2, context2.getString(C0966R.string.f7961xj), this.f221436d.getString(C0966R.string.l4f), false, false, new C75303g());
            }
        }
        if (C90188n0.f258925S && (yVar2 instanceof C75790l)) {
            C75790l lVar = (C75790l) yVar2;
            if (lVar.getUri().contains("authen") || lVar.getUri().contains("verify")) {
                lVar.setFake();
            }
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123461g(yVar2, i2);
        Object[] objArr2 = new Object[3];
        objArr2[0] = this;
        objArr2[1] = yVar2;
        objArr2[2] = yVar.getReqResp() == null ? "" : yVar.getReqResp().getUri();
        Log.m105925i("MicroMsg.WalletNetSceneMgr", "this %s scene url %s %s", objArr2);
    }

    /* renamed from: f */
    public void mo105627f() {
        Dialog dialog = this.f221440h;
        if (dialog != null) {
            dialog.dismiss();
            this.f221440h = null;
        }
        Iterator<C117747y> it = this.f221438f.iterator();
        while (it.hasNext()) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(it.next());
        }
        Iterator<C117747y> it4 = this.f221439g.iterator();
        while (it4.hasNext()) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(it4.next());
        }
        this.f221438f.clear();
        this.f221439g.clear();
    }

    /* renamed from: g */
    public boolean mo105628g() {
        return !this.f221439g.isEmpty() || !this.f221438f.isEmpty();
    }

    /* renamed from: h */
    public final void mo105629h(C117747y yVar) {
        if (yVar != null && (yVar instanceof C75123k0)) {
            C75123k0 k0Var = (C75123k0) yVar;
            k0Var.setProcessName(this.f221442j);
            Bundle bundle = this.f221443n;
            if (bundle != null) {
                k0Var.setProcessBundle(bundle);
                return;
            }
            Context context = this.f221436d;
            if (context instanceof WalletBaseUI) {
                k0Var.setProcessBundle(((WalletBaseUI) context).getInput());
            }
        }
    }

    /* renamed from: i */
    public void mo105630i(int i) {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(i, this);
        ((HashSet) this.f221441i).remove(Integer.valueOf(i));
        if (((HashSet) this.f221441i).isEmpty()) {
            mo105627f();
            this.f221437e = null;
            this.f221436d = null;
            C75276a aVar = this.f221444o;
            aVar.f221410g = null;
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, aVar);
            C75277b bVar = this.f221445p;
            bVar.f221414f = null;
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, bVar);
            for (C75278c next : this.f221446q.values()) {
                Log.m105925i("MicroMsg.IDelayQueryOrder", "onDestory rtType %s", Integer.valueOf(next.f221416e));
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123470p(next.f221416e, next);
            }
            this.f221446q.clear();
        }
    }

    /* renamed from: j */
    public boolean mo105631j(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        Log.m105925i("MicroMsg.WalletNetSceneMgr", "onSceneEnd scene is %s %s", this, yVar.toString());
        Log.m105919d("MicroMsg.WalletNetSceneMgr", "tofutest: %s errType: %d, errCode: %d, errMsg: %s, %s", this, Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(C90188n0.f258925S));
        if (C90188n0.f258925S && (yVar2 instanceof C75791m)) {
            C75791m mVar = (C75791m) yVar2;
            if (!mVar.getHasRetried() && !mVar.mo105664j1()) {
                Log.m105924i("MicroMsg.WalletNetSceneMgr", "test do delay query order");
                C75276a aVar = this.f221444o;
                aVar.getClass();
                Log.m105924i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
                aVar.f221409f = 0;
                aVar.mo105609a(mVar);
                return true;
            }
        }
        if (yVar2 instanceof ITenpaySave) {
            this.f221445p.getClass();
            ITenpaySave.RetryPayInfo retryPayInfo = ((ITenpaySave) yVar2).getRetryPayInfo();
            if (retryPayInfo != null && retryPayInfo.mo104874b()) {
                C75277b.f221411g = retryPayInfo;
            }
        }
        boolean z = yVar2 instanceof C75791m;
        if (z) {
            C75791m mVar2 = (C75791m) yVar2;
            if (mVar2.getHasRetried()) {
                Log.m105925i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass %s", yVar2);
                return false;
            } else if (mVar2.mo105664j1() && (yVar2 instanceof C75159a)) {
                boolean canPayRetry = mVar2.canPayRetry();
                boolean z2 = !mVar2.checkRecSrvResp();
                Log.m105925i("MicroMsg.WalletNetSceneMgr", "%s save or fetch shouldRetry, network: %B, server: %B", this, Boolean.valueOf(z2), Boolean.valueOf(canPayRetry));
                if (!canPayRetry && !z2) {
                    return false;
                }
                this.f221445p.getClass();
                ITenpaySave.RetryPayInfo retryPayInfo2 = ((C75159a) yVar2).getRetryPayInfo();
                if (retryPayInfo2 != null && retryPayInfo2.mo104874b()) {
                    C75277b.f221411g = retryPayInfo2;
                }
                return this.f221445p.mo105611a(mVar2);
            }
        }
        int type = yVar.getType();
        HashMap<Integer, C75278c> hashMap = this.f221446q;
        if (hashMap != null) {
            C75278c cVar = hashMap.get(Integer.valueOf(type));
            if (yVar2 instanceof C75279d) {
                T t = (C75279d) yVar2;
                if (t.getHasRetried()) {
                    return false;
                }
                cVar.getClass();
                Log.m105925i("MicroMsg.IDelayQueryOrder", "startQueryOrder %s ", t);
                cVar.f221417f = t;
                if (cVar.mo97353b(i, i2, t)) {
                    return true;
                }
            }
        }
        if (!z) {
            return false;
        }
        C75791m mVar3 = (C75791m) yVar2;
        if (mVar3.mo105664j1()) {
            return false;
        }
        if (mVar3.getHasRetried()) {
            Log.m105924i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass");
            return false;
        }
        C75276a aVar2 = this.f221444o;
        aVar2.getClass();
        int i3 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().f192966s;
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(mVar3.f222383e == 1);
        objArr[1] = Integer.valueOf(aVar2.f221409f);
        Log.m105925i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", objArr);
        boolean z3 = (mVar3.f222383e == 1) && aVar2.f221409f < i3;
        boolean z4 = !mVar3.checkRecSrvResp();
        Log.m105919d("MicroMsg.WalletNetSceneMgr", "%s shouldRetry, network: %B, server: %B", this, Boolean.valueOf(z4), Boolean.valueOf(z3));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(965, 13, 1);
        if (z4) {
            nVar.mo175913w(965, 14, 1);
        }
        if (!z3 && !z4) {
            return false;
        }
        Log.m105925i("MicroMsg.WalletNetSceneMgr", "%s doing delay order query retry", this);
        C75276a aVar3 = this.f221444o;
        aVar3.getClass();
        Log.m105924i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
        aVar3.f221409f = 0;
        aVar3.mo105609a(mVar3);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r10, int r11, java.lang.String r12, ob0.C117747y r13) {
        /*
            r9 = this;
            java.util.HashSet<ob0.y> r0 = r9.f221439g
            boolean r0 = r0.contains(r13)
            r1 = 0
            r2 = 1
            java.lang.String r3 = "%s Not need delay query order,remove scene"
            java.lang.String r4 = "%s do delay order query.break off!"
            java.lang.String r5 = "MicroMsg.WalletNetSceneMgr"
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r9
            java.lang.String r6 = "%s has find scene "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r0)
            boolean r0 = r9.mo105631j(r10, r11, r12, r13)
            if (r0 != 0) goto L_0x002c
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r0)
            java.util.HashSet<ob0.y> r0 = r9.f221439g
            r0.remove(r13)
            goto L_0x0057
        L_0x002c:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r1] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r10)
            return
        L_0x0034:
            java.util.HashSet<ob0.y> r0 = r9.f221438f
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x0061
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r9
            java.lang.String r6 = "%s has find forcescenes "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r0)
            boolean r0 = r9.mo105631j(r10, r11, r12, r13)
            if (r0 != 0) goto L_0x0059
            java.util.HashSet<ob0.y> r0 = r9.f221438f
            r0.remove(r13)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r0)
        L_0x0057:
            r0 = 1
            goto L_0x0062
        L_0x0059:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r1] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r10)
            return
        L_0x0061:
            r0 = 0
        L_0x0062:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r9
            java.util.HashSet<ob0.y> r4 = r9.f221439g
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            r4 = 2
            java.util.HashSet<ob0.y> r6 = r9.f221438f
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r4] = r6
            java.lang.String r4 = "%s onSceneEnd scenes %s forcescenes %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            java.util.HashSet<ob0.y> r3 = r9.f221439g
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00a1
            java.util.HashSet<ob0.y> r3 = r9.f221438f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00a1
            android.app.Dialog r1 = r9.f221440h
            if (r1 == 0) goto L_0x009f
            r1.dismiss()
            r1 = 0
            r9.f221440h = r1
        L_0x009f:
            r8 = 1
            goto L_0x00a2
        L_0x00a1:
            r8 = 0
        L_0x00a2:
            if (r0 == 0) goto L_0x00af
            cr3.f r3 = r9.f221437e
            if (r3 == 0) goto L_0x00af
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.onSceneEnd(r4, r5, r6, r7, r8)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.C75296i.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
