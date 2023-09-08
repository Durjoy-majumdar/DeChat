package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.autogen.events.WebViewCloseWindowEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.plugin.remittance.model.C70607m0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import ie3.C76324c;
import ie3.C76328d;
import nj3.C76912y0;
import nj3.C88989a;
import p196ln.C76706g;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceOSUI */
public class RemittanceOSUI extends RemittanceBaseUI {

    /* renamed from: m1 */
    public static final /* synthetic */ int f205103m1 = 0;

    /* renamed from: g1 */
    public int f205104g1;

    /* renamed from: h1 */
    public String f205105h1;

    /* renamed from: i1 */
    public String f205106i1;

    /* renamed from: j1 */
    public String f205107j1;

    /* renamed from: k1 */
    public boolean f205108k1 = false;

    /* renamed from: l1 */
    public IListener f205109l1 = new IListener<WebViewCloseWindowEvent>(C40008f.f107254d) {
        {
            this.__eventId = -704562821;
        }

        public boolean callback(IEvent iEvent) {
            WebViewCloseWindowEvent webViewCloseWindowEvent = (WebViewCloseWindowEvent) iEvent;
            RemittanceOSUI remittanceOSUI = RemittanceOSUI.this;
            if (!remittanceOSUI.f205108k1) {
                return false;
            }
            remittanceOSUI.finish();
            return false;
        }
    };

    /* renamed from: J7 */
    public void mo97270J7() {
        C115669n.INSTANCE.mo160131h(13337, 2);
    }

    /* renamed from: K7 */
    public void mo97271K7() {
    }

    /* renamed from: M7 */
    public void mo97273M7(String str, int i, String str2, String str3, String str4, String str5, String str6, F2fDynamicStartPayEvent f2fDynamicStartPayEvent) {
        String m = C75592q0.m90783m();
        if (Util.isNullOrNil(m)) {
            m = C75592q0.m90789s();
        }
        String str7 = m;
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f204384f);
        C70607m0 m0Var = new C70607m0(this.f204382e, str7, this.f204384f, ((int) z1Var.f108320R1) != 0 ? z1Var.mo62898f() : this.f204384f, str, this.f205104g1);
        m0Var.setProcessName("RemittanceProcess");
        doSceneProgress(m0Var);
        C115669n.INSTANCE.mo160131h(13337, 1, Double.valueOf(this.f204382e));
    }

    /* renamed from: S7 */
    public void mo97279S7() {
        C76912y0.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.i2b, new Object[]{this.f205105h1}), 0).show();
    }

    /* renamed from: X */
    public void mo1428X(String str) {
    }

    /* renamed from: X7 */
    public void mo97283X7() {
        if (!Util.isNullOrNil(this.f205106i1)) {
            C75228t.m90247g0((View) null, (TextView) findViewById(C0966R.C0970id.a7l), "", this.f205106i1, this.f205107j1);
        } else {
            Log.m105924i("MicroMsg.RemittanceOSUI", "no bulletin data");
        }
    }

    /* renamed from: a8 */
    public boolean mo97487a8(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        String si = ((C76328d) C86312j.m106911c(C76328d.class)).mo106562si(str);
        if (Util.isNullOrNil(si)) {
            return false;
        }
        Log.m105924i("MicroMsg.RemittanceOSUI", "start hk native cashier");
        ((C76324c) C86312j.m106911c(C76324c.class)).handleHKNativeCashier(getContext(), si, new RemittanceOSUI$$a(this));
        return true;
    }

    /* renamed from: b8 */
    public void mo97488b8(String str) {
        if (!mo97487a8(str)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            C75228t.m90218K(getContext(), intent, 3);
            this.f205108k1 = true;
        }
    }

    /* renamed from: c8 */
    public void mo97489c8(String str) {
        if (!mo97487a8(str)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            C75228t.m90218K(getContext(), intent, 3);
            this.f205108k1 = true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bro;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105918d("MicroMsg.RemittanceOSUI", "reqcode=" + i + ", resultCode=" + i2 + ", username=" + this.f204384f);
        this.f205108k1 = false;
        if (i == 3 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f205109l1.alive();
        this.mNetSceneMgr.mo105624c(1622);
        this.mNetSceneMgr.mo105624c(1574);
        initView();
        this.f204394r.setTitleText("");
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b(this);
        this.f205104g1 = getIntent().getIntExtra("os_currency", 0);
        this.f205105h1 = getIntent().getStringExtra("os_currencyuint");
        getIntent().getStringExtra("os_currencywording");
        this.f205106i1 = getIntent().getStringExtra("os_notice");
        this.f205107j1 = getIntent().getStringExtra("os_notice_url");
        this.f204394r.setTitleText(this.f205105h1);
        mo97283X7();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f205109l1.dead();
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93567p(this);
        this.mNetSceneMgr.mo105630i(1622);
        this.mNetSceneMgr.mo105630i(1574);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r13, int r14, java.lang.String r15, ob0.C117747y r16, boolean r17) {
        /*
            r12 = this;
            r7 = r12
            r0 = r16
            super.onSceneEnd(r13, r14, r15, r16, r17)
            if (r13 != 0) goto L_0x00a6
            if (r14 != 0) goto L_0x00a6
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.remittance.model.C70607m0
            if (r1 == 0) goto L_0x00a6
            r8 = r0
            com.tencent.mm.plugin.remittance.model.m0 r8 = (com.tencent.p014mm.plugin.remittance.model.C70607m0) r8
            int r0 = r8.f204278h
            r9 = 1
            r10 = 0
            if (r0 <= 0) goto L_0x007f
            int r1 = r8.f204279i
            r2 = 2131834771(0x7f113793, float:1.9302662E38)
            r3 = 2131834702(0x7f11374e, float:1.9302522E38)
            r4 = 2131821662(0x7f11045e, float:1.9276074E38)
            r5 = 2131834788(0x7f1137a4, float:1.9302696E38)
            if (r1 != 0) goto L_0x0052
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r10] = r0
            java.lang.String r1 = r12.getString(r5, r1)
            java.lang.String r4 = r12.getString(r4)
            java.lang.String r3 = r12.getString(r3)
            java.lang.String r5 = r12.getString(r2)
            com.tencent.mm.plugin.remittance.ui.h1 r6 = new com.tencent.mm.plugin.remittance.ui.h1
            r6.<init>(r12, r8)
            com.tencent.mm.plugin.remittance.ui.i1 r11 = new com.tencent.mm.plugin.remittance.ui.i1
            r11.<init>(r12, r8)
            r0 = r12
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r11
            nj3.C76879j.m92707A(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0080
        L_0x0052:
            if (r1 != r9) goto L_0x007f
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r10] = r0
            java.lang.String r1 = r12.getString(r5, r1)
            java.lang.String r4 = r12.getString(r4)
            java.lang.String r3 = r12.getString(r3)
            java.lang.String r5 = r12.getString(r2)
            com.tencent.mm.plugin.remittance.ui.j1 r6 = new com.tencent.mm.plugin.remittance.ui.j1
            r6.<init>(r12, r8)
            com.tencent.mm.plugin.remittance.ui.k1 r11 = new com.tencent.mm.plugin.remittance.ui.k1
            r11.<init>(r12, r8)
            r0 = r12
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r11
            nj3.C76879j.m92707A(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0080
        L_0x007f:
            r9 = 0
        L_0x0080:
            if (r9 != 0) goto L_0x00a6
            java.lang.String r0 = r8.f204276f
            boolean r0 = r12.mo97487a8(r0)
            if (r0 == 0) goto L_0x008b
            return
        L_0x008b:
            java.lang.String r0 = r8.f204276f
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "rawUrl"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "showShare"
            r1.putExtra(r0, r10)
            androidx.appcompat.app.AppCompatActivity r0 = r12.getContext()
            r2 = 3
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90218K(r0, r1, r2)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceOSUI.onSceneEnd(int, int, java.lang.String, ob0.y, boolean):void");
    }
}
