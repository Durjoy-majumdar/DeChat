package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.account.ui.z0 */
public class C115203z0 {

    /* renamed from: a */
    public String f345247a;

    /* renamed from: b */
    public String f345248b;

    /* renamed from: c */
    public String f345249c;

    /* renamed from: d */
    public C115206d f345250d;

    /* renamed from: e */
    public String f345251e;

    /* renamed from: f */
    public boolean f345252f = false;

    /* renamed from: com.tencent.mm.plugin.account.ui.z0$c */
    public class C1495c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f10848d;

        public C1495c(C115203z0 z0Var, MMActivity mMActivity) {
            this.f10848d = mMActivity;
        }

        public void run() {
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this.f10848d);
            b.addFlags(67108864);
            MMActivity mMActivity = this.f10848d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            MMActivity mMActivity2 = mMActivity;
            C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileAutoLogin$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/account/ui/MobileAutoLogin$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f10848d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.z0$a */
    public class C115204a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f345253d;

        public C115204a(C115203z0 z0Var, C114735a0 a0Var) {
            this.f345253d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345253d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.z0$b */
    public class C115205b implements C75576f4.C75578b {
        public C115205b(C115203z0 z0Var) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(new byte[0], new byte[0], new byte[0], C86709a0.m107523b().mo121110g());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.z0$d */
    public interface C115206d {
        /* renamed from: a */
        void mo174591a(ProgressDialog progressDialog);
    }

    public C115203z0(C115206d dVar, String str, String str2, String str3) {
        this.f345248b = str;
        this.f345247a = str3;
        this.f345249c = str2;
        this.f345250d = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008a, code lost:
        if (r10 != -3) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo174957a(com.tencent.p014mm.p136ui.MMActivity r8, int r9, int r10, java.lang.String r11, ob0.C117747y r12) {
        /*
            r7 = this;
            r0 = 1
            r1 = 4
            r2 = 0
            if (r9 != r1) goto L_0x0021
            r3 = -16
            if (r10 == r3) goto L_0x000d
            r3 = -17
            if (r10 != r3) goto L_0x0021
        L_0x000d:
            ob0.b0 r3 = f40.C86709a0.m107524d()
            eb0.f4 r4 = new eb0.f4
            com.tencent.mm.plugin.account.ui.z0$b r5 = new com.tencent.mm.plugin.account.ui.z0$b
            r5.<init>(r7)
            r6 = 0
            r4.<init>(r5, r6)
            r3.mo123460f(r4)
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            boolean r4 = r12 instanceof com.tencent.p014mm.modelsimple.C114735a0
            if (r4 == 0) goto L_0x002f
            r4 = r12
            com.tencent.mm.modelsimple.a0 r4 = (com.tencent.p014mm.modelsimple.C114735a0) r4
            java.lang.String r4 = r4.mo174354j1()
            r7.f345251e = r4
        L_0x002f:
            r4 = 2
            if (r3 != 0) goto L_0x011c
            if (r9 != 0) goto L_0x0038
            if (r10 != 0) goto L_0x0038
            goto L_0x011c
        L_0x0038:
            r3 = -106(0xffffffffffffff96, float:NaN)
            if (r10 != r3) goto L_0x0040
            sf0.C13665i0.m12970c(r8, r11, r2)
            return
        L_0x0040:
            r3 = -217(0xffffffffffffff27, float:NaN)
            if (r10 != r3) goto L_0x004e
            com.tencent.mm.modelsimple.a0 r12 = (com.tencent.p014mm.modelsimple.C114735a0) r12
            com.tencent.mm.modelsimple.a0$c r9 = sf0.C118276e.m166845a(r12)
            sf0.C13665i0.m12973f(r8, r9, r10)
            return
        L_0x004e:
            java.lang.Class<om.f> r12 = p214om.C11502f.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            om.f r12 = (p214om.C11502f) r12
            wc3.y r12 = r12.mo11461Sr()
            boolean r12 = r12.mo93163uP(r8, r9, r10, r11)
            if (r12 == 0) goto L_0x0063
        L_0x0060:
            r11 = 1
            goto L_0x00fc
        L_0x0063:
            if (r9 != r1) goto L_0x00fb
            r12 = -2023(0xfffffffffffff819, float:NaN)
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r10 == r12) goto L_0x00cd
            r12 = -140(0xffffffffffffff74, float:NaN)
            if (r10 == r12) goto L_0x00bf
            r11 = -100
            if (r10 == r11) goto L_0x00cd
            r11 = -75
            if (r10 == r11) goto L_0x00b8
            r11 = -72
            if (r10 == r11) goto L_0x00b1
            r11 = -9
            r12 = 2131832276(0x7f112dd4, float:1.9297601E38)
            if (r10 == r11) goto L_0x00aa
            r11 = -1
            if (r10 == r11) goto L_0x008e
            r11 = -4
            if (r10 == r11) goto L_0x00a3
            r11 = -3
            if (r10 == r11) goto L_0x00a3
            goto L_0x00fb
        L_0x008e:
            ob0.b0 r11 = f40.C86709a0.m107524d()
            int r11 = r11.mo123467m()
            r1 = 5
            if (r11 != r1) goto L_0x00a3
            r11 = 2131833496(0x7f113298, float:1.9300076E38)
            r12 = 2131833495(0x7f113297, float:1.9300074E38)
            nj3.C76879j.m92738i(r8, r11, r12)
            goto L_0x0060
        L_0x00a3:
            r11 = 2131825174(0x7f111216, float:1.9283197E38)
            nj3.C76879j.m92738i(r8, r11, r12)
            goto L_0x0060
        L_0x00aa:
            r11 = 2131832275(0x7f112dd3, float:1.92976E38)
            nj3.C76879j.m92738i(r8, r11, r12)
            goto L_0x0060
        L_0x00b1:
            r11 = 2131834619(0x7f1136fb, float:1.9302353E38)
            nj3.C76879j.m92738i(r8, r11, r1)
            goto L_0x0060
        L_0x00b8:
            r11 = 2131820928(0x7f110180, float:1.9274585E38)
            nj3.C76879j.m92738i(r8, r11, r1)
            goto L_0x0060
        L_0x00bf:
            java.lang.String r12 = r7.f345251e
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0060
            java.lang.String r12 = r7.f345251e
            sf0.C13665i0.m12972e(r8, r11, r12)
            goto L_0x0060
        L_0x00cd:
            f40.C86718e.m107550n()
            f40.C86709a0.m107523b()
            java.lang.String r11 = f40.C86718e.f251747w
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x00e3
            r11 = 2131832656(0x7f112f50, float:1.9298372E38)
            java.lang.String r11 = kg3.C76577a.m92166q(r8, r11)
            goto L_0x00e8
        L_0x00e3:
            f40.C86709a0.m107523b()
            java.lang.String r11 = f40.C86718e.f251747w
        L_0x00e8:
            java.lang.String r12 = r8.getString(r1)
            com.tencent.mm.plugin.account.ui.a1 r1 = new com.tencent.mm.plugin.account.ui.a1
            r1.<init>(r7)
            com.tencent.mm.plugin.account.ui.b1 r3 = new com.tencent.mm.plugin.account.ui.b1
            r3.<init>(r7)
            nj3.C76879j.m92719M(r8, r11, r12, r1, r3)
            goto L_0x0060
        L_0x00fb:
            r11 = 0
        L_0x00fc:
            if (r11 == 0) goto L_0x00ff
            return
        L_0x00ff:
            r11 = 2131830303(0x7f11261f, float:1.92936E38)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12[r2] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r12[r0] = r9
            java.lang.String r9 = r8.getString(r11, r12)
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r9, (int) r2)
            r8.show()
            return
        L_0x011c:
            f40.C86718e.m107546E()
            java.lang.String r9 = r7.f345247a
            sf0.C13665i0.m12968a(r8, r9)
            com.tencent.mm.plugin.account.ui.z0$c r9 = new com.tencent.mm.plugin.account.ui.z0$c
            r9.<init>(r7, r8)
            sf0.C13665i0.m12969b(r8, r9, r2, r4)
            boolean r8 = r7.f345252f
            if (r8 == 0) goto L_0x0153
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = "randomid_prefs"
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r9, r1)
            java.lang.String r9 = "randomID"
            java.lang.String r10 = ""
            java.lang.String r8 = r8.getString(r9, r10)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 11930(0x2e9a, float:1.6717E-41)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r2] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r11[r0] = r8
            r9.mo160131h(r10, r11)
        L_0x0153:
            boolean r8 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r8 != 0) goto L_0x015f
            boolean r8 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r8 == 0) goto L_0x016b
        L_0x015f:
            r8 = 2
            com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct r10 = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct
            r10.<init>()
            r10.f107894d = r8
            r10.mo86054n()
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.C115203z0.mo174957a(com.tencent.mm.ui.MMActivity, int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: b */
    public void mo174958b(MMActivity mMActivity) {
        String str = this.f345247a;
        if (Util.isNullOrNil(str)) {
            str = this.f345248b;
        }
        C114735a0 a0Var = new C114735a0(str, this.f345249c, 0, "", "", "", 0, "", false, true);
        C86709a0.m107524d().mo123460f(a0Var);
        this.f345250d.mo174591a(C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), mMActivity.getString(C0966R.string.gda), true, true, new C115204a(this, a0Var)));
    }
}
