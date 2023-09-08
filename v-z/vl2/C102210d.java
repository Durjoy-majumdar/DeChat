package vl2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.plugin.scanner.model.C42910u;
import com.tencent.p014mm.plugin.scanner.model.C85412x;
import com.tencent.p014mm.plugin.scanner.model.OfflineScanContext;
import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TimerTask;
import lu3.C34379c;
import ml2.C10931f;
import nj3.C76879j;
import ob0.C11385n;
import p910lj.C76701a;
import te3.C51694vh;
import zt3.C119157j;

/* renamed from: vl2.d */
public class C102210d implements C11385n, C90831e {

    /* renamed from: d */
    public ProgressDialog f300906d;

    /* renamed from: e */
    public Activity f300907e;

    /* renamed from: f */
    public Bundle f300908f;

    /* renamed from: g */
    public int f300909g;

    /* renamed from: h */
    public boolean f300910h;

    /* renamed from: i */
    public boolean f300911i;

    /* renamed from: j */
    public String f300912j;

    /* renamed from: n */
    public String f300913n;

    /* renamed from: o */
    public int f300914o;

    /* renamed from: p */
    public int f300915p = -1;

    /* renamed from: q */
    public boolean f300916q = false;

    /* renamed from: r */
    public boolean f300917r = false;

    /* renamed from: s */
    public ArrayList<Integer> f300918s = null;

    /* renamed from: t */
    public C10931f.C10933a f300919t;

    /* renamed from: u */
    public C94528d f300920u;

    /* renamed from: v */
    public C34379c<?> f300921v = null;

    /* renamed from: w */
    public TimerTask f300922w = null;

    /* renamed from: vl2.d$a */
    public class C102211a implements C94528d.C94529a {

        /* renamed from: a */
        public final /* synthetic */ C42910u f300923a;

        public C102211a(C42910u uVar) {
            this.f300923a = uVar;
        }

        /* renamed from: a */
        public void mo55548a(C94528d dVar) {
            C102210d dVar2 = C102210d.this;
            dVar2.getClass();
            C86709a0.m107524d().mo123470p(1061, dVar2);
            C86709a0.m107524d().mo123458d(this.f300923a);
        }
    }

    /* renamed from: a */
    public final void mo141736a() {
        Log.m105918d("MicroMsg.BarcodeStringHandler", "alvinluo cancelLoading");
        C94528d dVar = this.f300920u;
        if (dVar != null) {
            ((BaseScanUI) dVar).mo24310k8(false, false, (C94528d.C94529a) null);
        }
        ProgressDialog progressDialog = this.f300906d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        C34379c<?> cVar = this.f300921v;
        if (cVar != null) {
            cVar.cancel(false);
        }
        TimerTask timerTask = this.f300922w;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    /* renamed from: b */
    public void mo141737b(Activity activity, C10931f.C10933a aVar, C94528d dVar, String str, boolean z, int i, String str2, Bundle bundle, int i2, boolean z2, int i3, boolean z3, boolean z4, int i4, ArrayList<Integer> arrayList) {
        int i5;
        boolean z5;
        Activity activity2 = activity;
        C10931f.C10933a aVar2 = aVar;
        String str3 = str;
        boolean z6 = z;
        String str4 = str2;
        boolean z7 = z2;
        boolean z8 = z3;
        Log.m105925i("MicroMsg.BarcodeStringHandler", "alvinluo handleBarCode result: %s, processOfflineScan: %b, selectFromAlbum: %b, codeName: %s, mode: %d, disableJumpScanGoods: %s", str3, Boolean.valueOf(z2), Boolean.valueOf(z), str4, Integer.valueOf(i4), Boolean.valueOf(z4));
        this.f300907e = activity2;
        int a = C5177x.m5204a(str2);
        this.f300908f = bundle;
        this.f300913n = str3;
        this.f300912j = str4;
        this.f300914o = i;
        this.f300909g = i2;
        this.f300910h = z7;
        this.f300911i = z6;
        this.f300915p = i3;
        this.f300916q = z8;
        this.f300919t = aVar2;
        this.f300920u = dVar;
        this.f300917r = z4;
        this.f300918s = arrayList;
        C51694vh vhVar = null;
        if (C86709a0.m107524d().mo123467m() == 0) {
            boolean isConnected = NetStatusUtil.isConnected((Context) activity);
            int i6 = isConnected ? 2 : 1;
            Log.m105925i("MicroMsg.BarcodeStringHandler", "alvinluo handleBarcode network unavailable and deal with offline, isConnected: %b", Boolean.valueOf(isConnected));
            if (!z7) {
                C37755i iVar = C37755i.f100002a;
                if (z8) {
                    if (aVar2 != null) {
                        aVar2.mo361b(isConnected ? 7 : 6, (Bundle) null);
                    }
                    iVar.mo61325b(new OfflineScanContext(activity, i6, str, a, i, str2, z, bundle), activity2.getString(isConnected ? C0966R.string.idk : C0966R.string.idn), false);
                    C85412x.f248924a.mo118759a(str, str2, z6 ? 2 : 1, i6, 0);
                    return;
                }
            }
            i5 = 2;
            if (!z7 || !z8) {
                C76701a.makeText((Context) activity2, (CharSequence) activity2.getString(C0966R.string.f360087a11), 0).show();
            } else {
                String string = activity2.getString(C0966R.string.idi);
                C87412m.m108594g(string, "showMsg");
                C76879j.m92754y(activity2, string, "", activity2.getString(C0966R.string.f8029zr), (DialogInterface.OnClickListener) null);
            }
        } else {
            i5 = 2;
        }
        C86709a0.m107524d().mo123455a(1061, this);
        if (this.f300910h) {
            Log.m105928w("MicroMsg.BarcodeStringHandler", "getBizScanTabBarInfo  processOfflineScan is false, return null");
        } else {
            LinkedList<Integer> linkedList = new LinkedList<>();
            ArrayList<Integer> arrayList2 = this.f300918s;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                z5 = false;
            } else {
                linkedList.addAll(this.f300918s);
                z5 = true;
            }
            Object[] objArr = new Object[i5];
            objArr[0] = Boolean.valueOf(z5);
            objArr[1] = linkedList;
            Log.m105925i("MicroMsg.BarcodeStringHandler", "getBizScanTabBarInfo  hasTabBar:%s, tabBarTypeList:%s", objArr);
            C51694vh vhVar2 = new C51694vh();
            vhVar2.f143482d = z5;
            vhVar2.f143483e = linkedList;
            vhVar = vhVar2;
        }
        C42910u uVar = new C42910u(str2, str, i, i4, i2, vhVar);
        uVar.f116190g = z6;
        C86709a0.m107524d().mo123460f(uVar);
        mo141738c(activity2.getString(C0966R.string.hqi), new C102211a(uVar));
    }

    /* renamed from: c */
    public final void mo141738c(String str, C94528d.C94529a aVar) {
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.f300916q);
        if (this.f300920u == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.BarcodeStringHandler", "alvinluo showLoading isFromScanUI: %b, loadingViewModel == null: %b", objArr);
        if (this.f300920u == null || !this.f300916q) {
            ProgressDialog progressDialog = this.f300906d;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f300906d = C76879j.m92723Q(this.f300907e, "", str, true, true, new C102208b(this, aVar));
            return;
        }
        Log.m105918d("MicroMsg.BarcodeStringHandler", "alvinluo initLoadingTimer");
        mo141736a();
        C22769s sVar = new C22769s(this.f300920u, new C102207a(this), aVar);
        this.f300922w = sVar;
        this.f300921v = ((C119157j) C119157j.f356862d).mo183878i(sVar, 500);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0146, code lost:
        r2 = r2.f127056b.f127083a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r28, int r29, java.lang.String r30, ob0.C117747y r31) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r29
            r3 = r31
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r28)
            r7 = 0
            r5[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r29)
            r8 = 1
            r5[r8] = r6
            java.lang.String r6 = "MicroMsg.BarcodeStringHandler"
            java.lang.String r9 = "onSceneEnd, errType: %s, errCode: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r5)
            ob0.b0 r5 = f40.C86709a0.m107524d()
            r9 = 1061(0x425, float:1.487E-42)
            r5.mo123470p(r9, r1)
            r27.mo141736a()
            r5 = 2131821704(0x7f110488, float:1.9276159E38)
            r10 = 5
            r11 = 4
            r12 = 0
            if (r0 != r11) goto L_0x0048
            r13 = -4
            if (r2 != r13) goto L_0x0048
            android.app.Activity r0 = r1.f300907e
            r2 = 2131834302(0x7f1135be, float:1.930171E38)
            nj3.C76879j.m92742m(r0, r2, r5, r12)
            ml2.f$a r0 = r1.f300919t
            if (r0 == 0) goto L_0x0047
            r0.mo361b(r10, r12)
        L_0x0047:
            return
        L_0x0048:
            vl2.i r13 = vl2.C37755i.f100002a
            boolean r14 = r1.f300916q
            if (r14 == 0) goto L_0x00ca
            boolean r14 = r13.mo61324a(r0, r2, r3)
            if (r14 == 0) goto L_0x00ca
            boolean r0 = r1.f300910h
            if (r0 != 0) goto L_0x00ae
            ml2.f$a r0 = r1.f300919t
            if (r0 == 0) goto L_0x0060
            r2 = 7
            r0.mo361b(r2, r12)
        L_0x0060:
            java.lang.String r0 = "alvinluo dealQBarString onSceneEnd overtime and deal with offline"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.scanner.model.OfflineScanContext r0 = new com.tencent.mm.plugin.scanner.model.OfflineScanContext
            android.app.Activity r15 = r1.f300907e
            r16 = 2
            java.lang.String r2 = r1.f300913n
            java.lang.String r3 = r1.f300912j
            int r18 = com.tencent.p014mm.plugin.scanner.C5177x.m5204a(r3)
            int r3 = r1.f300914o
            java.lang.String r5 = r1.f300912j
            boolean r6 = r1.f300911i
            android.os.Bundle r7 = r1.f300908f
            r14 = r0
            r17 = r2
            r19 = r3
            r20 = r5
            r21 = r6
            r22 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            android.app.Activity r2 = r1.f300907e
            r3 = 2131835272(0x7f113988, float:1.9303678E38)
            java.lang.String r2 = r2.getString(r3)
            r13.mo61325b(r0, r2, r8)
            com.tencent.mm.plugin.scanner.model.x r14 = com.tencent.p014mm.plugin.scanner.model.C85412x.f248924a
            java.lang.String r15 = r1.f300913n
            java.lang.String r0 = r1.f300912j
            boolean r2 = r1.f300911i
            if (r2 == 0) goto L_0x00a2
            r17 = 2
            goto L_0x00a4
        L_0x00a2:
            r17 = 1
        L_0x00a4:
            r18 = 2
            r19 = 0
            r16 = r0
            r14.mo118759a(r15, r16, r17, r18, r19)
            goto L_0x00c9
        L_0x00ae:
            android.app.Activity r0 = r1.f300907e
            r2 = 2131835270(0x7f113986, float:1.9303674E38)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "showMsg"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 2131821557(0x7f1103f5, float:1.927586E38)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = ""
            nj3.C76879j.m92754y(r0, r2, r4, r3, r12)
        L_0x00c9:
            return
        L_0x00ca:
            if (r0 == r8) goto L_0x00e1
            if (r0 == r4) goto L_0x00d0
            r13 = 0
            goto L_0x0120
        L_0x00d0:
            android.app.Activity r13 = r1.f300907e
            r14 = 2131821610(0x7f11042a, float:1.9275968E38)
            java.lang.String r14 = r13.getString(r14)
            android.widget.Toast r13 = p910lj.C76701a.makeText((android.content.Context) r13, (java.lang.CharSequence) r14, (int) r8)
            r13.show()
            goto L_0x011f
        L_0x00e1:
            ob0.b0 r13 = f40.C86709a0.m107524d()
            boolean r13 = r13.mo123466l()
            if (r13 == 0) goto L_0x00f3
            ob0.b0 r13 = f40.C86709a0.m107524d()
            r13.mo123465k()
            goto L_0x011f
        L_0x00f3:
            android.app.Activity r13 = r1.f300907e
            boolean r13 = com.tencent.p014mm.network.C114786m0.m161568a(r13)
            if (r13 == 0) goto L_0x0101
            android.app.Activity r13 = r1.f300907e
            com.tencent.p014mm.pluginsdk.p133ui.tools.C6692y0.m7002a(r13)
            goto L_0x011f
        L_0x0101:
            android.app.Activity r13 = r1.f300907e
            r14 = 2131830324(0x7f112634, float:1.9293642E38)
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            r15[r7] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r29)
            r15[r8] = r16
            java.lang.String r14 = r13.getString(r14, r15)
            android.widget.Toast r13 = p910lj.C76701a.makeText((android.content.Context) r13, (java.lang.CharSequence) r14, (int) r8)
            r13.show()
        L_0x011f:
            r13 = 1
        L_0x0120:
            if (r13 == 0) goto L_0x0123
            return
        L_0x0123:
            if (r0 != r11) goto L_0x0139
            r13 = -2004(0xfffffffffffff82c, float:NaN)
            if (r2 != r13) goto L_0x0139
            android.app.Activity r0 = r1.f300907e
            r2 = 2131834284(0x7f1135ac, float:1.9301674E38)
            nj3.C76879j.m92738i(r0, r2, r5)
            ml2.f$a r0 = r1.f300919t
            if (r0 == 0) goto L_0x0138
            r0.mo361b(r10, r12)
        L_0x0138:
            return
        L_0x0139:
            int r5 = r31.getType()
            if (r5 != r9) goto L_0x0441
            r0 = r3
            com.tencent.mm.plugin.scanner.model.u r0 = (com.tencent.p014mm.plugin.scanner.model.C42910u) r0
            ob0.c r2 = r0.f116188e
            if (r2 == 0) goto L_0x014f
            ob0.c$d r2 = r2.f127056b
            pe3.a r2 = r2.f127083a
            if (r2 == 0) goto L_0x014f
            te3.sh r2 = (te3.C51242sh) r2
            goto L_0x0150
        L_0x014f:
            r2 = r12
        L_0x0150:
            if (r2 != 0) goto L_0x0160
            java.lang.String r0 = "onSceneEnd(), getResp() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            ml2.f$a r0 = r1.f300919t
            if (r0 == 0) goto L_0x015f
            r0.mo361b(r4, r12)
        L_0x015f:
            return
        L_0x0160:
            java.lang.Object[] r3 = new java.lang.Object[r8]
            int r5 = r2.f141506d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r7] = r5
            java.lang.String r5 = "onSceneEnd() ScanBarcode Type = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r3)
            java.lang.String r3 = r2.f141507e
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0180
            ml2.f$a r0 = r1.f300919t
            if (r0 == 0) goto L_0x017f
            r0.mo361b(r4, r12)
        L_0x017f:
            return
        L_0x0180:
            int r3 = r2.f141506d
            java.lang.String r5 = r2.f141507e
            android.app.Activity r9 = r1.f300907e
            r20 = 0
            java.lang.String r15 = r1.f300912j
            int r14 = r0.f116189f
            boolean r0 = r0.f116190g
            int r13 = r1.f300909g
            boolean r11 = r1.f300910h
            int r10 = r1.f300915p
            boolean r12 = r1.f300916q
            boolean r4 = r1.f300917r
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            java.lang.String r7 = "MicroMsg.Scanner.ScanXmlHelper"
            if (r17 == 0) goto L_0x01b9
            java.lang.Object[] r0 = new java.lang.Object[r8]
            if (r5 != 0) goto L_0x01a6
            r3 = 1
            goto L_0x01a7
        L_0x01a6:
            r3 = 0
        L_0x01a7:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r17 = 0
            r0[r17] = r3
            java.lang.String r3 = "wrong args, xml == null ? [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r3, r0)
        L_0x01b5:
            r0 = 1
            r3 = 0
            goto L_0x0326
        L_0x01b9:
            r17 = 0
            int r1 = vl2.C102216y.m134693c(r5)
            r18 = r13
            r8 = 2
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r13[r17] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r17 = r14
            r14 = 1
            r13[r14] = r8
            java.lang.String r8 = "processReturnXml(), xmlType = [%s], respType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r13)
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r1 != r14) goto L_0x027d
            if (r5 != 0) goto L_0x01e0
            goto L_0x01ea
        L_0x01e0:
            java.lang.String r0 = "user"
            r1 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r0, r1)
            if (r0 != 0) goto L_0x01ec
        L_0x01ea:
            r1 = 0
            goto L_0x0209
        L_0x01ec:
            vl2.y$c r1 = new vl2.y$c
            java.lang.String r3 = ".user.username"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r4 = ".user.nickname"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r1.<init>(r3, r0)
        L_0x0209:
            if (r1 == 0) goto L_0x0275
            java.lang.String r0 = r1.f301004a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0214
            goto L_0x0275
        L_0x0214:
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r3 = r1.f301004a
            com.tencent.mm.storage.z1 r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0249
            long r3 = r0.f108320R1
            int r4 = (int) r3
            if (r4 <= 0) goto L_0x0249
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r0 = r0.getUsername()
            java.lang.String r3 = "Contact_User"
            r1.putExtra(r3, r0)
            r1.setFlags(r8)
            wc3.z r0 = com.tencent.p014mm.plugin.scanner.C5176w.m5203a()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93174g(r1, r9)
            goto L_0x03a3
        L_0x0249:
            vl2.j r13 = new vl2.j
            r13.<init>()
            java.lang.String r0 = r1.f301004a
            r16 = 1
            int r1 = com.tencent.p014mm.plugin.scanner.C5177x.m5204a(r15)
            r21 = 0
            r22 = 0
            r3 = r18
            r4 = r17
            r14 = r9
            r5 = r15
            r15 = r0
            r17 = r5
            r18 = r1
            r19 = r4
            r23 = r3
            r24 = r11
            r25 = r10
            r26 = r12
            r13.mo141743f(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = 1
            goto L_0x03a4
        L_0x0275:
            java.lang.String r0 = "xmlUser null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x01b5
        L_0x027d:
            r10 = 2
            if (r1 != r10) goto L_0x030a
            if (r5 != 0) goto L_0x0283
            goto L_0x028d
        L_0x0283:
            java.lang.String r1 = "url"
            r10 = 0
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r1, r10)
            if (r1 != 0) goto L_0x028f
        L_0x028d:
            r5 = 0
            goto L_0x02a0
        L_0x028f:
            vl2.y$b r5 = new vl2.y$b
            java.lang.String r10 = ".url.link"
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r5.<init>(r1)
        L_0x02a0:
            if (r5 == 0) goto L_0x0302
            java.lang.String r1 = r5.f301003a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x02ab
            goto L_0x0302
        L_0x02ab:
            r1 = 1
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = r5.f301003a
            r11 = 0
            r10[r11] = r1
            java.lang.String r1 = "xmlurl.link: [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r1, r10)
            r1 = 5
            if (r3 != r1) goto L_0x02dc
            java.lang.String r15 = r5.f301003a
            java.lang.Class<kr0.y0> r1 = kr0.C76632y0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r13 = r1
            kr0.y0 r13 = (kr0.C76632y0) r13
            if (r0 == 0) goto L_0x02ce
            r0 = 1032(0x408, float:1.446E-42)
            r16 = 1032(0x408, float:1.446E-42)
            goto L_0x02d2
        L_0x02ce:
            r0 = 1025(0x401, float:1.436E-42)
            r16 = 1025(0x401, float:1.436E-42)
        L_0x02d2:
            r17 = 0
            r18 = 0
            r14 = r9
            r13.mo106903ZO(r14, r15, r16, r17, r18)
            goto L_0x03a3
        L_0x02dc:
            r0 = 6
            if (r3 != r0) goto L_0x02e7
            if (r4 == 0) goto L_0x02e4
            r0 = 4
            goto L_0x03a4
        L_0x02e4:
            r0 = 3
            goto L_0x03a4
        L_0x02e7:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r5.f301003a
            java.lang.String r3 = "rawUrl"
            r0.putExtra(r3, r1)
            r0.setFlags(r8)
            wc3.z r1 = com.tencent.p014mm.plugin.scanner.C5176w.m5203a()
            com.tencent.mm.app.r1 r1 = (com.tencent.p014mm.app.C67654r1) r1
            r1.mo93190w(r0, r9)
            goto L_0x03a3
        L_0x0302:
            java.lang.String r0 = "xmlurl null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x01b5
        L_0x030a:
            r0 = 3
            if (r1 == r0) goto L_0x0328
            r0 = 4
            if (r1 != r0) goto L_0x0314
            r0 = 1
            r1 = 2
            r3 = 0
            goto L_0x032b
        L_0x0314:
            java.lang.String r0 = "wrong xmlType"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r3 = 0
            r1[r3] = r5
            java.lang.String r4 = "wrong xml : [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r4, r1)
        L_0x0326:
            r0 = 2
            goto L_0x03a4
        L_0x0328:
            r0 = 1
            r3 = 0
            r1 = 2
        L_0x032b:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r1 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r4[r3] = r10
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4[r0] = r1
            java.lang.String r0 = "funcType = [%s], addProductToDB = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r0, r4)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.Class<com.tencent.mm.plugin.scanner.ui.ProductUI> r1 = com.tencent.p014mm.plugin.scanner.p101ui.ProductUI.class
            r0.setClass(r9, r1)
            r0.setFlags(r8)
            java.lang.String r1 = "key_Product_xml"
            r0.putExtra(r1, r5)
            java.lang.String r1 = "key_Product_funcType"
            r3 = 4
            r0.putExtra(r1, r3)
            java.lang.String r1 = "key_ProductUI_addToDB"
            r3 = 1
            r0.putExtra(r1, r3)
            java.lang.String r1 = "key_need_add_to_history"
            r0.putExtra(r1, r3)
            java.lang.String r1 = "key_is_from_barcode"
            r0.putExtra(r1, r3)
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r0)
            java.lang.Object[] r14 = r1.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/scanner/util/ScanXmlHelper"
            java.lang.String r16 = "processReturnXmlProduct"
            java.lang.String r17 = "(ILjava/lang/String;Landroid/app/Activity;IZLcom/tencent/mm/plugin/scanner/result/ResultHandler$IResultHandleCallback;Ljava/lang/String;IZIZIZZ)I"
            java.lang.String r18 = "Undefined"
            java.lang.String r19 = "startActivity"
            java.lang.String r20 = "(Landroid/content/Intent;)V"
            r13 = r9
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 0
            java.lang.Object r0 = r1.mo10231a(r3)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r14 = "com/tencent/mm/plugin/scanner/util/ScanXmlHelper"
            java.lang.String r15 = "processReturnXmlProduct"
            java.lang.String r16 = "(ILjava/lang/String;Landroid/app/Activity;IZLcom/tencent/mm/plugin/scanner/result/ResultHandler$IResultHandleCallback;Ljava/lang/String;IZIZIZZ)I"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "startActivity"
            java.lang.String r19 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x03a3:
            r0 = 0
        L_0x03a4:
            if (r0 == 0) goto L_0x042f
            r1 = 1
            if (r0 == r1) goto L_0x0426
            r1 = 2
            if (r0 == r1) goto L_0x0414
            java.lang.String r1 = "onSceneEnd BizScanBarcodeResponse toByteArray exception"
            java.lang.String r3 = "key_scan_bar_code_response"
            r4 = 3
            if (r0 == r4) goto L_0x03ee
            r4 = 4
            if (r0 == r4) goto L_0x03bc
            r5 = r27
            goto L_0x042e
        L_0x03bc:
            java.lang.String r0 = "onSceneEnd() PROCESS_XML_RETURN_TYPE_SCAN_GOODS_MERGE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x03db }
            r4.putByteArray(r3, r0)     // Catch:{ Exception -> 0x03db }
            java.lang.String r0 = "key_scan_bar_code_string"
            r5 = r27
            java.lang.String r2 = r5.f300913n     // Catch:{ Exception -> 0x03d9 }
            r4.putString(r0, r2)     // Catch:{ Exception -> 0x03d9 }
            goto L_0x03e4
        L_0x03d9:
            r0 = move-exception
            goto L_0x03de
        L_0x03db:
            r0 = move-exception
            r5 = r27
        L_0x03de:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r1, r2)
        L_0x03e4:
            ml2.f$a r0 = r5.f300919t
            if (r0 == 0) goto L_0x042e
            r1 = 9
            r0.mo361b(r1, r4)
            goto L_0x042e
        L_0x03ee:
            r5 = r27
            java.lang.String r0 = "onSceneEnd() PROCESS_XML_RETURN_TYPE_JUMP_SCAN_GOODS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x0403 }
            r4.putByteArray(r3, r0)     // Catch:{ Exception -> 0x0403 }
            goto L_0x040a
        L_0x0403:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r1, r2)
        L_0x040a:
            ml2.f$a r0 = r5.f300919t
            if (r0 == 0) goto L_0x042e
            r1 = 8
            r0.mo361b(r1, r4)
            goto L_0x042e
        L_0x0414:
            r5 = r27
            java.lang.String r0 = "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            ml2.f$a r0 = r5.f300919t
            if (r0 == 0) goto L_0x042e
            r1 = 0
            r2 = 2
            r0.mo361b(r2, r1)
            goto L_0x042e
        L_0x0426:
            r5 = r27
            java.lang.String r0 = "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x042e:
            return
        L_0x042f:
            r5 = r27
            r0 = 3
            r1 = 0
            java.lang.String r2 = "onSceneEnd PROCESS_XML_RETURN_TYPE_OK"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            ml2.f$a r2 = r5.f300919t
            if (r2 == 0) goto L_0x0440
            r2.mo361b(r0, r1)
        L_0x0440:
            return
        L_0x0441:
            r5 = r1
            if (r0 != 0) goto L_0x0448
            if (r2 == 0) goto L_0x0447
            goto L_0x0448
        L_0x0447:
            return
        L_0x0448:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.getErrMsgContent(r30)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 == 0) goto L_0x046d
            android.app.Activity r1 = r5.f300907e
            r3 = 2131830378(0x7f11266a, float:1.9293752E38)
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r4 = 0
            r6[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            r2 = 1
            r6[r2] = r0
            java.lang.String r1 = r1.getString(r3, r6)
            goto L_0x046e
        L_0x046d:
            r4 = 0
        L_0x046e:
            android.app.Activity r0 = r5.f300907e
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r4)
            r0.show()
            ml2.f$a r0 = r5.f300919t
            if (r0 == 0) goto L_0x0480
            r1 = 0
            r2 = 2
            r0.mo361b(r2, r1)
        L_0x0480:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.C102210d.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
