package com.tencent.p014mm.plugin.kidswatch.p066ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import nj3.C88989a;
import ob0.C11385n;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import v12.C52738d;
import w12.C53070e;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchEntranceUI */
public final class KidsWatchEntranceUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public String f114962d;

    /* renamed from: e */
    public String f114963e;

    /* renamed from: f */
    public String f114964f;

    /* renamed from: g */
    public final C13601g f114965g = C36568h.m40985a(new C42467b(this));

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchEntranceUI$a */
    public static final class C42466a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchEntranceUI f114966d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42466a(KidsWatchEntranceUI kidsWatchEntranceUI) {
            super(0);
            this.f114966d = kidsWatchEntranceUI;
        }

        public Object invoke() {
            this.f114966d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchEntranceUI$b */
    public static final class C42467b extends C87413o implements C32224a<C52738d> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchEntranceUI f114967d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42467b(KidsWatchEntranceUI kidsWatchEntranceUI) {
            super(0);
            this.f114967d = kidsWatchEntranceUI;
        }

        public Object invoke() {
            View findViewById = this.f114967d.findViewById(C0966R.C0970id.mer);
            int i = C0966R.C0970id.f358387eu1;
            KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
            if (kidsWatchHeadComponent != null) {
                RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.i38);
                if (progressBar != null) {
                    return new C52738d(relativeLayout, kidsWatchHeadComponent, relativeLayout, progressBar);
                }
                i = C0966R.C0970id.i38;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: H7 */
    public final C52738d mo66557H7() {
        return (C52738d) ((C36570n) this.f114965g).getValue();
    }

    /* renamed from: I7 */
    public final boolean mo66558I7(String str) {
        boolean z = false;
        char c = Util.isNullOrNil(str) ? 8 : C72996z1.m85841l5(str) ? 3 : C72996z1.m85840k5(str) ? 5 : (C45628s0.m50751P(str) || C72996z1.m85795C5(str) || C72996z1.m85826X5(str)) ? 4 : C72996z1.m85806K4(str) ? 6 : C112551y.m153819s(str, "gh_", false) ? 7 : C72996z1.m85820U5(str) ? (char) 2 : 1;
        boolean z2 = 1 == c;
        if (2 == c) {
            z = true;
        }
        return z2 | z;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b35;
    }

    public void initView() {
        Log.m105924i("MicroMsg.KidsWatchEntranceUI", "initView");
        setMMTitle("");
        this.f114962d = getIntent().getStringExtra("intent.key.login.url");
        this.f114963e = getIntent().getStringExtra("intent.key.device.name");
        KidsWatchHeadComponent kidsWatchHeadComponent = mo66557H7().f147325a;
        String string = getString(C0966R.string.g0g);
        C87412m.m108593f(string, "getString(R.string.kids_…ogin_enter_loading_title)");
        kidsWatchHeadComponent.setTitle(string);
        mo66557H7().f147325a.setCloseBtnCallBack(new C42466a(this));
        mo66557H7().f147325a.f19755e.f39983b.setVisibility(0);
        ProgressBar progressBar = mo66557H7().f147326b;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        Log.m105924i("MicroMsg.KidsWatchEntranceUI", "doLoginConfirmGet, url:" + this.f114962d + ", device:" + this.f114963e);
        C86709a0.m107524d().mo123455a(5218, this);
        C86709a0.m107524d().mo123460f(new C53070e(this.f114962d, this.f114963e));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        C87412m.m108591d(supportActionBar);
        supportActionBar.mo91104o();
        setSelfNavigationBarVisible(8);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.YellowK));
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.YellowK));
        initView();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        mo66557H7().f147326b.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0416, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0417, code lost:
        r3.putExtra("intent.key.ok.reg.btn", r7);
        r3.putExtra(r4, r2.f135502g);
        r4 = new java.util.ArrayList();
        r7 = r2.f135499d.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x042b, code lost:
        if (r8 < r7) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x042d, code lost:
        r9 = r2.f135499d.get(r8);
        r26 = r7;
        r7 = r10;
        r10 = new com.tencent.p014mm.plugin.kidswatch.model.KidsWatchAcctInfo(r9.f133009d, r9.f133010e, r9.f133011f, r9.f133012g, r9.f133013h);
        r4.add(r7);
        r8 = r8 + 1;
        r7 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0451, code lost:
        r2 = new android.os.Bundle();
        r2.putParcelableArrayList(r5, r4);
        r3.putExtras(r2);
        r3.setFlags(268435456);
        r3.setClass(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext(), r6);
        r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext();
        r4 = new k20.C9556a();
        r4.mo10233c(r3);
        r7 = r2;
        j20.C117292a.m165358d(r7, r4.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r2.startActivity((android.content.Intent) r4.mo10231a(0));
        j20.C117292a.m165359e(r7, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x04a2, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.KidsWatchEntranceUI", r7);
        finish();
        r3 = new android.content.Intent();
        r3.putExtra("intent.key.login.url", r1.f114962d);
        r3.putExtra("intent.key.device.name", r1.f114963e);
        r3.putExtra("intent.key.ok.session.list", r1.f114964f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x04bf, code lost:
        if (r2.f135500e == 1) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x04c1, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x04c3, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04c4, code lost:
        r3.putExtra("intent.key.ok.reg.btn", r5);
        r3.putExtra(r9, 1);
        r3.putExtra(r4, r2.f135502g);
        r3.setFlags(268435456);
        r3.setClass(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext(), r12);
        r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext();
        r12 = new k20.C9556a();
        r12.mo10233c(r3);
        r4 = r2;
        j20.C117292a.m165358d(r4, r12.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r2.startActivity((android.content.Intent) r12.mo10231a(0));
        j20.C117292a.m165359e(r4, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0102, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0103, code lost:
        r12 = r16;
        r9 = r17;
        r7 = r18;
        r6 = r19;
        r5 = r20;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x028a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x028b, code lost:
        r12 = r16;
        r9 = r17;
        r7 = r18;
        r6 = r19;
        r5 = r20;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02bd, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02c8, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.KidsWatchEntranceUI", "kids size:" + r2.f135499d.size());
        finish();
        r0 = new android.content.Intent();
        r0.putExtra("intent.key.login.url", r1.f114962d);
        r0.putExtra("intent.key.device.name", r1.f114963e);
        r0.putExtra("intent.key.ok.session.list", r1.f114964f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02fa, code lost:
        if (r2.f135500e == 1) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02fc, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02fe, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ff, code lost:
        r0.putExtra("intent.key.ok.reg.btn", r3);
        r0.putExtra(r4, r2.f135502g);
        r3 = new java.util.ArrayList();
        r4 = r2.f135499d.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0313, code lost:
        if (r7 < r4) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0315, code lost:
        r8 = r2.f135499d.get(r7);
        r3.add(new com.tencent.p014mm.plugin.kidswatch.model.KidsWatchAcctInfo(r8.f133009d, r8.f133010e, r8.f133011f, r8.f133012g, r8.f133013h));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0333, code lost:
        r2 = new android.os.Bundle();
        r2.putParcelableArrayList(r5, r3);
        r0.putExtras(r2);
        r0.setFlags(268435456);
        r0.setClass(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext(), r6);
        r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext();
        r3 = new k20.C9556a();
        r3.mo10233c(r0);
        r7 = r2;
        j20.C117292a.m165358d(r7, r3.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x036c, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.KidsWatchEntranceUI", r18);
        finish();
        r0 = new android.content.Intent();
        r0.putExtra("intent.key.login.url", r1.f114962d);
        r0.putExtra("intent.key.device.name", r1.f114963e);
        r0.putExtra("intent.key.ok.session.list", r1.f114964f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x038b, code lost:
        if (r2.f135500e == 1) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x038d, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x038f, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0390, code lost:
        r0.putExtra("intent.key.ok.reg.btn", r3);
        r0.putExtra(r17, 1);
        r0.putExtra(r4, r2.f135502g);
        r0.setFlags(268435456);
        r0.setClass(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext(), r16);
        r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext();
        r11 = new k20.C9556a();
        r11.mo10233c(r0);
        j20.C117292a.m165358d(r2, r11.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03d5, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03e0, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.KidsWatchEntranceUI", "kids size:" + r2.f135499d.size());
        finish();
        r3 = new android.content.Intent();
        r3.putExtra("intent.key.login.url", r1.f114962d);
        r3.putExtra("intent.key.device.name", r1.f114963e);
        r3.putExtra("intent.key.ok.session.list", r1.f114964f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0412, code lost:
        if (r2.f135500e == 1) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0414, code lost:
        r7 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x028a A[ExcHandler: Exception (e java.lang.Exception), PHI: r19 r20 r21 
      PHI: (r19v4 java.lang.Class<com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI>) = (r19v6 java.lang.Class<com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI>), (r19v6 java.lang.Class<com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI>), (r19v6 java.lang.Class<com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI>), (r19v6 java.lang.Class<com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI>), (r19v9 java.lang.Class<com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI>) binds: [B:31:0x00e9, B:42:0x0113, B:43:?, B:37:0x00f4, B:16:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r20v1 java.lang.String) = (r20v3 java.lang.String), (r20v3 java.lang.String), (r20v3 java.lang.String), (r20v3 java.lang.String), (r20v6 java.lang.String) binds: [B:31:0x00e9, B:42:0x0113, B:43:?, B:37:0x00f4, B:16:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r21v0 java.lang.String) = (r21v2 java.lang.String), (r21v2 java.lang.String), (r21v2 java.lang.String), (r21v2 java.lang.String), (r21v4 java.lang.String) binds: [B:31:0x00e9, B:42:0x0113, B:43:?, B:37:0x00f4, B:16:0x00ad] A[DONT_GENERATE, DONT_INLINE], Splitter:B:16:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r24, int r25, java.lang.String r26, ob0.C117747y r27) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            java.lang.String r5 = "username"
            java.lang.Class<com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI> r6 = com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchLoginCardChooseUI.class
            java.lang.String r7 = "intent.key.kids.list"
            java.lang.Class<com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst> r8 = com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchLoginFirst.class
            java.lang.String r9 = "intent.key.enter.login.first"
            java.lang.String r10 = "kids size:"
            java.lang.String r11 = "enter KidsWatchLoginFirst"
            java.lang.String r12 = "intent.key.need.show.syncmsg.btn"
            java.lang.String r13 = "intent.key.ok.reg.btn"
            java.lang.String r14 = "intent.key.ok.session.list"
            java.lang.String r15 = "intent.key.device.name"
            r16 = r8
            java.lang.String r8 = "intent.key.login.url"
            r17 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r18 = r11
            java.lang.String r11 = "onSceneEnd: errType = "
            r9.append(r11)
            r9.append(r0)
            java.lang.String r11 = " errCode = "
            r9.append(r11)
            r9.append(r2)
            java.lang.String r11 = " errMsg = "
            r9.append(r11)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "MicroMsg.KidsWatchEntranceUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)
            boolean r9 = r4 instanceof w12.C53070e
            if (r9 == 0) goto L_0x0525
            java.lang.String r9 = "scene is NetSceneKidsWatchLoginConfirmGet"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)
            ob0.b0 r9 = f40.C86709a0.m107524d()
            r3 = 5218(0x1462, float:7.312E-42)
            r9.mo123470p(r3, r1)
            v12.d r3 = r23.mo66557H7()
            android.widget.ProgressBar r3 = r3.f147326b
            r9 = 4
            r3.setVisibility(r9)
            if (r0 != 0) goto L_0x0515
            if (r2 != 0) goto L_0x0515
            r0 = r4
            w12.e r0 = (w12.C53070e) r0
            ob0.c r0 = r0.f148130e
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            r2 = r0
            te3.im2 r2 = (te3.C49869im2) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = 0
            r4 = 1
            java.lang.Class<f62.k0> r19 = f62.C75700k0.class
            k40.a r19 = f40.C86709a0.m107533q(r19)     // Catch:{ Exception -> 0x0298, all -> 0x02a2 }
            f62.k0 r19 = (f62.C75700k0) r19     // Catch:{ Exception -> 0x0298, all -> 0x02a2 }
            com.tencent.mm.storage.v3 r19 = r19.mo96094Ku()     // Catch:{ Exception -> 0x0298, all -> 0x02a2 }
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r20 = p922vj.C78420a.f229768m1     // Catch:{ Exception -> 0x0298, all -> 0x02a2 }
            r9 = r19
            com.tencent.mm.storage.i2 r9 = (com.tencent.p014mm.storage.C44660i2) r9     // Catch:{ Exception -> 0x0298, all -> 0x02a2 }
            android.database.Cursor r3 = r9.mo69745P(r4, r3, r3, r4)     // Catch:{ Exception -> 0x0298, all -> 0x02a2 }
            if (r3 == 0) goto L_0x00e3
            int r9 = r2.f135501f     // Catch:{ Exception -> 0x0298, all -> 0x02a2 }
            if (r9 != 0) goto L_0x009f
            r9 = 200(0xc8, float:2.8E-43)
        L_0x009f:
            int r4 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x0298, all -> 0x02a2 }
            r19 = r6
            r20 = r7
            r6 = 0
            r7 = 0
        L_0x00a9:
            if (r6 >= r9) goto L_0x00e7
            r21 = r12
            int r12 = r3.getCount()     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            if (r7 >= r12) goto L_0x00e9
            boolean r12 = r3.moveToPosition(r7)     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            if (r12 == 0) goto L_0x00e9
            java.lang.String r12 = r3.getString(r4)     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            gy3.C87412m.m108593f(r12, r5)     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            boolean r22 = r1.mo66558I7(r12)     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            if (r22 == 0) goto L_0x00de
            int r6 = r6 + 1
            r0.append(r12)     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            int r12 = r9 + -1
            if (r6 >= r12) goto L_0x00de
            int r12 = r3.getCount()     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            r22 = 1
            int r12 = r12 + -1
            if (r7 >= r12) goto L_0x00de
            java.lang.String r12 = ","
            r0.append(r12)     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
        L_0x00de:
            int r7 = r7 + 1
            r12 = r21
            goto L_0x00a9
        L_0x00e3:
            r19 = r6
            r20 = r7
        L_0x00e7:
            r21 = r12
        L_0x00e9:
            int r4 = r0.length()     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            if (r4 <= 0) goto L_0x00f1
            r4 = 1
            goto L_0x00f2
        L_0x00f1:
            r4 = 0
        L_0x00f2:
            if (r4 == 0) goto L_0x0111
            int r4 = r0.length()     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            r5 = 0
            java.lang.String r0 = r0.substring(r5, r4)     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x028a, all -> 0x0102 }
            goto L_0x0113
        L_0x0102:
            r0 = move-exception
            r12 = r16
            r9 = r17
            r7 = r18
            r6 = r19
            r5 = r20
            r4 = r21
            goto L_0x03d3
        L_0x0111:
            java.lang.String r0 = ""
        L_0x0113:
            r1.f114964f = r0     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            r0.<init>()     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            java.lang.String r4 = "okSessionList:"
            r0.append(r4)     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            java.lang.String r4 = r1.f114964f     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            r0.append(r4)     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            java.lang.String r4 = ", response.EnableRegButton:"
            r0.append(r4)     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            int r4 = r2.f135500e     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            r0.append(r4)     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)     // Catch:{ Exception -> 0x028a, all -> 0x0282 }
            if (r3 == 0) goto L_0x013a
            r3.close()
        L_0x013a:
            java.util.LinkedList<te3.em2> r0 = r2.f135499d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0205
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.util.LinkedList<te3.em2> r3 = r2.f135499d
            int r3 = r3.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r23.finish()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = r1.f114962d
            r0.putExtra(r8, r3)
            java.lang.String r3 = r1.f114963e
            r0.putExtra(r15, r3)
            java.lang.String r3 = r1.f114964f
            r0.putExtra(r14, r3)
            int r3 = r2.f135500e
            r4 = 1
            if (r3 != r4) goto L_0x0178
            r4 = 1
            goto L_0x0179
        L_0x0178:
            r4 = 0
        L_0x0179:
            r0.putExtra(r13, r4)
            boolean r3 = r2.f135502g
            r4 = r21
            r0.putExtra(r4, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.LinkedList<te3.em2> r4 = r2.f135499d
            int r4 = r4.size()
            r5 = 0
        L_0x018f:
            if (r5 >= r4) goto L_0x01af
            java.util.LinkedList<te3.em2> r6 = r2.f135499d
            java.lang.Object r6 = r6.get(r5)
            te3.em2 r6 = (te3.C49305em2) r6
            com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo r13 = new com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo
            java.lang.String r8 = r6.f133009d
            java.lang.String r9 = r6.f133010e
            java.lang.String r10 = r6.f133011f
            java.lang.String r11 = r6.f133012g
            int r12 = r6.f133013h
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r3.add(r13)
            int r5 = r5 + 1
            goto L_0x018f
        L_0x01af:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r5 = r20
            r2.putParcelableArrayList(r5, r3)
            r0.putExtras(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = r19
            r0.setClass(r2, r6)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r0)
            java.lang.Object[] r8 = r3.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r10 = "onSceneEnd"
            java.lang.String r11 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x01ea:
            r4 = 0
            java.lang.Object r0 = r3.mo10231a(r4)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.startActivity(r0)
            java.lang.String r8 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r9 = "onSceneEnd"
            java.lang.String r10 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0525
        L_0x0205:
            r7 = r18
            r4 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            r23.finish()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = r1.f114962d
            r0.putExtra(r8, r3)
            java.lang.String r3 = r1.f114963e
            r0.putExtra(r15, r3)
            java.lang.String r3 = r1.f114964f
            r0.putExtra(r14, r3)
            int r3 = r2.f135500e
            r5 = 1
            if (r3 != r5) goto L_0x022a
            r3 = 1
            goto L_0x022b
        L_0x022a:
            r3 = 0
        L_0x022b:
            r0.putExtra(r13, r3)
            r9 = r17
            r0.putExtra(r9, r5)
            boolean r2 = r2.f135502g
            r0.putExtra(r4, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = r16
            r0.setClass(r2, r12)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r0)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r6 = "onSceneEnd"
            java.lang.String r7 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r3 = r2
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0266:
            r3 = 0
            java.lang.Object r0 = r11.mo10231a(r3)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.startActivity(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r5 = "onSceneEnd"
            java.lang.String r6 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r3 = r2
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0525
        L_0x0282:
            r0 = move-exception
            r6 = r19
            r5 = r20
            r4 = r21
            goto L_0x02a5
        L_0x028a:
            r0 = move-exception
            r12 = r16
            r9 = r17
            r7 = r18
            r6 = r19
            r5 = r20
            r4 = r21
            goto L_0x02ad
        L_0x0298:
            r0 = move-exception
            r5 = r7
            r4 = r12
            r12 = r16
            r9 = r17
            r7 = r18
            goto L_0x02ad
        L_0x02a2:
            r0 = move-exception
            r5 = r7
            r4 = r12
        L_0x02a5:
            r12 = r16
            r9 = r17
            r7 = r18
            goto L_0x03d3
        L_0x02ad:
            r16 = r12
            java.lang.String r12 = "[felixzhou]get session list error."
            r18 = r7
            r17 = r9
            r9 = 0
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ all -> 0x03cd }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r12, r7)     // Catch:{ all -> 0x03cd }
            if (r3 == 0) goto L_0x02c0
            r3.close()
        L_0x02c0:
            java.util.LinkedList<te3.em2> r0 = r2.f135499d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x036c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.util.LinkedList<te3.em2> r3 = r2.f135499d
            int r3 = r3.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r23.finish()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = r1.f114962d
            r0.putExtra(r8, r3)
            java.lang.String r3 = r1.f114963e
            r0.putExtra(r15, r3)
            java.lang.String r3 = r1.f114964f
            r0.putExtra(r14, r3)
            int r3 = r2.f135500e
            r7 = 1
            if (r3 != r7) goto L_0x02fe
            r3 = 1
            goto L_0x02ff
        L_0x02fe:
            r3 = 0
        L_0x02ff:
            r0.putExtra(r13, r3)
            boolean r3 = r2.f135502g
            r0.putExtra(r4, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.LinkedList<te3.em2> r4 = r2.f135499d
            int r4 = r4.size()
            r7 = 0
        L_0x0313:
            if (r7 >= r4) goto L_0x0333
            java.util.LinkedList<te3.em2> r8 = r2.f135499d
            java.lang.Object r8 = r8.get(r7)
            te3.em2 r8 = (te3.C49305em2) r8
            com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo r15 = new com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo
            java.lang.String r10 = r8.f133009d
            java.lang.String r11 = r8.f133010e
            java.lang.String r12 = r8.f133011f
            java.lang.String r13 = r8.f133012g
            int r14 = r8.f133013h
            r9 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            r3.add(r15)
            int r7 = r7 + 1
            goto L_0x0313
        L_0x0333:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r2.putParcelableArrayList(r5, r3)
            r0.putExtras(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.setClass(r2, r6)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r0)
            java.lang.Object[] r8 = r3.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r10 = "onSceneEnd"
            java.lang.String r11 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01ea
        L_0x036c:
            r7 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            r23.finish()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = r1.f114962d
            r0.putExtra(r8, r3)
            java.lang.String r3 = r1.f114963e
            r0.putExtra(r15, r3)
            java.lang.String r3 = r1.f114964f
            r0.putExtra(r14, r3)
            int r3 = r2.f135500e
            r5 = 1
            if (r3 != r5) goto L_0x038f
            r3 = 1
            goto L_0x0390
        L_0x038f:
            r3 = 0
        L_0x0390:
            r0.putExtra(r13, r3)
            r9 = r17
            r0.putExtra(r9, r5)
            boolean r2 = r2.f135502g
            r0.putExtra(r4, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = r16
            r0.setClass(r2, r12)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r0)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r6 = "onSceneEnd"
            java.lang.String r7 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r3 = r2
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0266
        L_0x03cd:
            r0 = move-exception
            goto L_0x02a5
        L_0x03d0:
            r0 = move-exception
            r12 = r16
        L_0x03d3:
            if (r3 == 0) goto L_0x03d8
            r3.close()
        L_0x03d8:
            java.util.LinkedList<te3.em2> r3 = r2.f135499d
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x04a2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            java.util.LinkedList<te3.em2> r7 = r2.f135499d
            int r7 = r7.size()
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            r23.finish()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r7 = r1.f114962d
            r3.putExtra(r8, r7)
            java.lang.String r7 = r1.f114963e
            r3.putExtra(r15, r7)
            java.lang.String r7 = r1.f114964f
            r3.putExtra(r14, r7)
            int r7 = r2.f135500e
            r8 = 1
            if (r7 != r8) goto L_0x0416
            r7 = 1
            goto L_0x0417
        L_0x0416:
            r7 = 0
        L_0x0417:
            r3.putExtra(r13, r7)
            boolean r7 = r2.f135502g
            r3.putExtra(r4, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.LinkedList<te3.em2> r7 = r2.f135499d
            int r7 = r7.size()
            r8 = 0
        L_0x042b:
            if (r8 >= r7) goto L_0x0451
            java.util.LinkedList<te3.em2> r9 = r2.f135499d
            java.lang.Object r9 = r9.get(r8)
            te3.em2 r9 = (te3.C49305em2) r9
            com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo r15 = new com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo
            java.lang.String r11 = r9.f133009d
            java.lang.String r12 = r9.f133010e
            java.lang.String r13 = r9.f133011f
            java.lang.String r14 = r9.f133012g
            int r9 = r9.f133013h
            r10 = r15
            r26 = r7
            r7 = r15
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r4.add(r7)
            int r8 = r8 + 1
            r7 = r26
            goto L_0x042b
        L_0x0451:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r2.putParcelableArrayList(r5, r4)
            r3.putExtras(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3.setClass(r2, r6)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r3)
            java.lang.Object[] r8 = r4.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r10 = "onSceneEnd"
            java.lang.String r11 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = 0
            java.lang.Object r3 = r4.mo10231a(r3)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.startActivity(r3)
            java.lang.String r8 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r9 = "onSceneEnd"
            java.lang.String r10 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0514
        L_0x04a2:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            r23.finish()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r5 = r1.f114962d
            r3.putExtra(r8, r5)
            java.lang.String r5 = r1.f114963e
            r3.putExtra(r15, r5)
            java.lang.String r5 = r1.f114964f
            r3.putExtra(r14, r5)
            int r5 = r2.f135500e
            r6 = 1
            if (r5 != r6) goto L_0x04c3
            r5 = 1
            goto L_0x04c4
        L_0x04c3:
            r5 = 0
        L_0x04c4:
            r3.putExtra(r13, r5)
            r3.putExtra(r9, r6)
            boolean r2 = r2.f135502g
            r3.putExtra(r4, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3.setClass(r2, r12)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r3)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r7 = "onSceneEnd"
            java.lang.String r8 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = 0
            java.lang.Object r3 = r12.mo10231a(r3)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.startActivity(r3)
            java.lang.String r5 = "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchEntranceUI"
            java.lang.String r6 = "onSceneEnd"
            java.lang.String r7 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0514:
            throw r0
        L_0x0515:
            z12.a r0 = z12.C16094a.f43246a
            androidx.appcompat.app.AppCompatActivity r3 = r23.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r3, r4)
            r4 = r26
            r0.mo14693d(r3, r2, r4)
        L_0x0525:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchEntranceUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
