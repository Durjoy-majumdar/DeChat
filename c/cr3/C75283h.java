package cr3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import eb0.C75592q0;
import fr3.C75791m;
import ie3.C76324c;
import nj3.C76879j;
import ob0.C117747y;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

/* renamed from: cr3.h */
public class C75283h {

    /* renamed from: cr3.h$a */
    public class C75284a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221420d;

        public C75284a(WalletBaseUI walletBaseUI) {
            this.f221420d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75228t.m90219L(this.f221420d, "https://www.payu.co.za/wechat/contact-us/", true);
            if (this.f221420d.isTransparent() || this.f221420d.getContentViewVisibility() != 0) {
                this.f221420d.finish();
            }
        }
    }

    /* renamed from: cr3.h$b */
    public class C75285b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221421d;

        /* renamed from: e */
        public final /* synthetic */ int f221422e;

        public C75285b(WalletBaseUI walletBaseUI, int i) {
            this.f221421d = walletBaseUI;
            this.f221422e = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBaseUI walletBaseUI = this.f221421d;
            C79143a.m95764c(walletBaseUI, walletBaseUI.getInput(), this.f221422e);
            if (this.f221421d.isTransparent() || this.f221421d.getContentViewVisibility() != 0) {
                this.f221421d.finish();
            }
        }
    }

    /* renamed from: cr3.h$c */
    public class C75286c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221423d;

        public C75286c(WalletBaseUI walletBaseUI) {
            this.f221423d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f221423d.isTransparent()) {
                this.f221423d.finish();
            }
        }
    }

    /* renamed from: cr3.h$d */
    public class C75287d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f221424d;

        /* renamed from: e */
        public final /* synthetic */ WalletBaseUI f221425e;

        public C75287d(C117747y yVar, WalletBaseUI walletBaseUI) {
            this.f221424d = yVar;
            this.f221425e = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C117747y yVar = this.f221424d;
            String str = yVar instanceof C75791m ? ((C75791m) yVar).f222397v : "";
            if (!Util.isNullOrNil(str)) {
                WCPayResetPwdClickReportStruct wCPayResetPwdClickReportStruct = new WCPayResetPwdClickReportStruct();
                wCPayResetPwdClickReportStruct.f194679d = 1;
                wCPayResetPwdClickReportStruct.f194680e = 2;
                wCPayResetPwdClickReportStruct.mo86054n();
                Log.m105925i("MicroMsg.WalletErrMgr", "jump to forget_url %s", str);
                C75228t.m90219L(this.f221425e, str, false);
                return;
            }
            WCPayResetPwdClickReportStruct wCPayResetPwdClickReportStruct2 = new WCPayResetPwdClickReportStruct();
            wCPayResetPwdClickReportStruct2.f194679d = 1;
            wCPayResetPwdClickReportStruct2.f194680e = 1;
            wCPayResetPwdClickReportStruct2.mo86054n();
            if (C75592q0.m90763K()) {
                C79143a.m95772k(this.f221425e, "wallet_payu", "PayUForgotPwdProcess", (Bundle) null, (C79148e.C79149a) null);
            } else {
                WalletBaseUI walletBaseUI = this.f221425e;
                C79144b.m95773a().getClass();
                Log.m105918d("MicroMsg.WalletErrMgr", "startKindaResetPwd:true");
                ((C76324c) C86312j.m106911c(C76324c.class)).startResetPwdUseCase(walletBaseUI, (Bundle) null);
            }
            if (this.f221425e.isTransparent()) {
                this.f221425e.finish();
            }
        }
    }

    /* renamed from: cr3.h$e */
    public class C75288e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221426d;

        public C75288e(WalletBaseUI walletBaseUI) {
            this.f221426d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f221426d.cleanUiData(1);
        }
    }

    /* renamed from: cr3.h$f */
    public class C75289f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221427d;

        /* renamed from: e */
        public final /* synthetic */ int f221428e;

        public C75289f(WalletBaseUI walletBaseUI, int i) {
            this.f221427d = walletBaseUI;
            this.f221428e = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C79143a.m95764c(this.f221427d, new Bundle(), this.f221428e);
            if (this.f221427d.isTransparent()) {
                this.f221427d.finish();
            }
        }
    }

    /* renamed from: cr3.h$g */
    public class C75290g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221429d;

        public C75290g(WalletBaseUI walletBaseUI) {
            this.f221429d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f221429d.isTransparent()) {
                this.f221429d.finish();
            }
        }
    }

    /* renamed from: cr3.h$h */
    public class C75291h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221430d;

        public C75291h(WalletBaseUI walletBaseUI) {
            this.f221430d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f221430d.resend(true);
        }
    }

    /* renamed from: cr3.h$i */
    public class C75292i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221431d;

        /* renamed from: cr3.h$i$a */
        public class C75293a implements C79148e.C79149a {
            public C75293a(C75292i iVar) {
            }

            public Intent onProcessEnd(int i, Bundle bundle) {
                return null;
            }
        }

        public C75292i(WalletBaseUI walletBaseUI) {
            this.f221431d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_is_bind_bankcard", false);
            C79143a.m95772k(this.f221431d, "wallet", "BindCardProcess", bundle, new C75293a(this));
        }
    }

    /* renamed from: cr3.h$j */
    public class C75294j implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221432d;

        /* renamed from: e */
        public final /* synthetic */ int f221433e;

        public C75294j(WalletBaseUI walletBaseUI, int i) {
            this.f221432d = walletBaseUI;
            this.f221433e = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBaseUI walletBaseUI = this.f221432d;
            C79143a.m95764c(walletBaseUI, walletBaseUI.getInput(), this.f221433e);
            if (this.f221432d.isTransparent()) {
                this.f221432d.finish();
            }
        }
    }

    /* renamed from: cr3.h$k */
    public class C75295k implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f221434d;

        /* renamed from: e */
        public final /* synthetic */ int f221435e;

        public C75295k(WalletBaseUI walletBaseUI, int i) {
            this.f221434d = walletBaseUI;
            this.f221435e = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBaseUI walletBaseUI = this.f221434d;
            C79143a.m95764c(walletBaseUI, walletBaseUI.getInput(), this.f221435e);
            if (this.f221434d.isTransparent()) {
                this.f221434d.finish();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90311a(com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI r10, ob0.C117747y r11, int r12, int r13, java.lang.String r14) {
        /*
            r0 = 0
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r12 != r1) goto L_0x0126
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r12 == 0) goto L_0x0012
            r12 = 2131839734(0x7f114af6, float:1.9312728E38)
            java.lang.String r14 = r10.getString(r12)
        L_0x0012:
            yq3.e r12 = yq3.C79143a.m95768g(r10)
            r1 = 407(0x197, float:5.7E-43)
            r2 = 0
            r9 = 1
            if (r13 == r1) goto L_0x00ff
            r1 = 408(0x198, float:5.72E-43)
            if (r13 == r1) goto L_0x00f5
            r1 = 412(0x19c, float:5.77E-43)
            r3 = 2131821426(0x7f110372, float:1.9275595E38)
            if (r13 == r1) goto L_0x00dc
            r1 = 414(0x19e, float:5.8E-43)
            if (r13 == r1) goto L_0x00d1
            switch(r13) {
                case -100869: goto L_0x004a;
                case -100868: goto L_0x0039;
                default: goto L_0x002e;
            }
        L_0x002e:
            r1 = 2131839101(0x7f11487d, float:1.9311444E38)
            java.lang.String r2 = ""
            switch(r13) {
                case 401: goto L_0x0097;
                case 402: goto L_0x00f5;
                case 403: goto L_0x00f5;
                case 404: goto L_0x008f;
                case 405: goto L_0x005c;
                default: goto L_0x0036;
            }
        L_0x0036:
            r9 = 0
            goto L_0x00fc
        L_0x0039:
            r12 = 2131839083(0x7f11486b, float:1.9311407E38)
            java.lang.String r12 = r10.getString(r12)
            cr3.h$j r14 = new cr3.h$j
            r14.<init>(r10, r13)
            nj3.C76879j.m92713G(r10, r12, r2, r0, r14)
            goto L_0x0118
        L_0x004a:
            r12 = 2131839082(0x7f11486a, float:1.9311405E38)
            java.lang.String r12 = r10.getString(r12)
            cr3.h$k r14 = new cr3.h$k
            r14.<init>(r10, r13)
            nj3.C76879j.m92713G(r10, r12, r2, r0, r14)
            r12 = 1
            goto L_0x011a
        L_0x005c:
            boolean r12 = r11 instanceof fr3.C75791m
            if (r12 == 0) goto L_0x0065
            r12 = r11
            fr3.m r12 = (fr3.C75791m) r12
            int r0 = r12.f222396u
        L_0x0065:
            if (r0 != r9) goto L_0x0075
            java.lang.String r12 = r10.getString(r1)
            cr3.h$g r13 = new cr3.h$g
            r13.<init>(r10)
            nj3.C76879j.m92754y(r10, r14, r2, r12, r13)
            goto L_0x0118
        L_0x0075:
            r12 = 2131839644(0x7f114a9c, float:1.9312545E38)
            java.lang.String r4 = r10.getString(r12)
            java.lang.String r5 = r10.getString(r3)
            cr3.h$h r6 = new cr3.h$h
            r6.<init>(r10)
            r7 = 0
            java.lang.String r3 = ""
            r1 = r10
            r2 = r14
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0118
        L_0x008f:
            if (r12 == 0) goto L_0x00fc
            boolean r12 = r12.mo91268w(r10, r13, r14)
            goto L_0x0119
        L_0x0097:
            boolean r12 = r11 instanceof fr3.C75791m
            if (r12 == 0) goto L_0x00a0
            r12 = r11
            fr3.m r12 = (fr3.C75791m) r12
            int r0 = r12.f222396u
        L_0x00a0:
            if (r0 != r9) goto L_0x00b0
            java.lang.String r12 = r10.getString(r1)
            cr3.h$c r13 = new cr3.h$c
            r13.<init>(r10)
            nj3.C76879j.m92754y(r10, r14, r2, r12, r13)
            goto L_0x0118
        L_0x00b0:
            r2 = 0
            r12 = 2131839102(0x7f11487e, float:1.9311446E38)
            java.lang.String r5 = r10.getString(r12)
            r12 = 2131821669(0x7f110465, float:1.9276088E38)
            java.lang.String r6 = r10.getString(r12)
            cr3.h$d r7 = new cr3.h$d
            r7.<init>(r11, r10)
            cr3.h$e r8 = new cr3.h$e
            r8.<init>(r10)
            java.lang.String r4 = ""
            r1 = r10
            r3 = r14
            nj3.C76879j.m92717K(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0118
        L_0x00d1:
            java.lang.String r12 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90271t()
            com.tenpay.android.wechat.TenpaySecureEditText.setSalt(r12)
            m90312b(r10, r13, r14)
            goto L_0x0118
        L_0x00dc:
            r12 = 2131839763(0x7f114b13, float:1.9312787E38)
            java.lang.String r4 = r10.getString(r12)
            java.lang.String r5 = r10.getString(r3)
            cr3.h$i r6 = new cr3.h$i
            r6.<init>(r10)
            r7 = 0
            java.lang.String r3 = ""
            r1 = r10
            r2 = r14
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0118
        L_0x00f5:
            if (r12 == 0) goto L_0x00fc
            boolean r12 = r12.mo91268w(r10, r13, r14)
            goto L_0x0119
        L_0x00fc:
            r0 = r9
            r12 = 0
            goto L_0x011a
        L_0x00ff:
            java.lang.String r12 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90271t()
            com.tenpay.android.wechat.TenpaySecureEditText.setSalt(r12)
            boolean r12 = eb0.C75592q0.m90763K()
            if (r12 == 0) goto L_0x0110
            m90312b(r10, r13, r14)
            goto L_0x0118
        L_0x0110:
            cr3.h$f r12 = new cr3.h$f
            r12.<init>(r10, r13)
            nj3.C76879j.m92713G(r10, r14, r2, r0, r12)
        L_0x0118:
            r12 = 1
        L_0x0119:
            r0 = 1
        L_0x011a:
            if (r0 == 0) goto L_0x0121
            r13 = 2
            r10.setmPayResultType(r13)
            goto L_0x0125
        L_0x0121:
            r13 = 3
            r10.setmPayResultType(r13)
        L_0x0125:
            r0 = r12
        L_0x0126:
            boolean r10 = r11 instanceof com.tencent.p014mm.wallet_core.model.C75117g0
            if (r10 == 0) goto L_0x012f
            com.tencent.mm.wallet_core.model.g0 r11 = (com.tencent.p014mm.wallet_core.model.C75117g0) r11
            r11.setHasProcessWalletError(r0)
        L_0x012f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.C75283h.m90311a(com.tencent.mm.wallet_core.ui.WalletBaseUI, ob0.y, int, int, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static void m90312b(WalletBaseUI walletBaseUI, int i, String str) {
        C76879j.m92717K(walletBaseUI, false, str, "", walletBaseUI.getString(C0966R.string.ksp), walletBaseUI.getString(C0966R.string.f7926wf), new C75284a(walletBaseUI), new C75285b(walletBaseUI, i));
    }
}
