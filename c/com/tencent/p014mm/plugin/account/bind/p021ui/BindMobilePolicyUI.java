package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.BindPhoneGuidancePageReportStruct;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import eg0.C45655c;
import f40.C86709a0;
import fg0.C32039a;
import fg0.C32041c;
import gg0.k$$a;
import gg0.k$$b;
import gg0.k$$c;
import gg0.l$$a;
import hg0.C76170j0;
import hg0.C76186t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C88989a;
import ob0.C117747y;
import p286zl.C79396l;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import zb3.C66782d;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI */
public class BindMobilePolicyUI extends BindMContactIntroUI {

    /* renamed from: C */
    public static final /* synthetic */ int f344310C = 0;

    /* renamed from: A */
    public String f344311A;

    /* renamed from: B */
    public C89779i0 f344312B;

    /* renamed from: x */
    public Map<String, String> f344313x;

    /* renamed from: y */
    public boolean f344314y;

    /* renamed from: z */
    public String f344315z;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI$a */
    public class C1357a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI$a$a */
        public class C1358a implements C47883u {
            public C1358a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                if (z) {
                    String className = BindMobilePolicyUI.this.getContext().getComponentName().getClassName();
                    String str2 = MMApplicationContext.getSourcePackageName() + ".plugin." + "account";
                    if (className.startsWith(str2)) {
                        className = className.substring(str2.length());
                    }
                    ((C66782d) C86312j.m106911c(C66782d.class)).O70(BindMobilePolicyUI.this.getContext(), className, "account");
                }
            }
        }

        public C1357a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77426q qVar = new C77426q(BindMobilePolicyUI.this.getContext());
            qVar.mo107595g(BindMobilePolicyUI.this.getString(C0966R.string.ak6));
            qVar.mo107601m(C0966R.string.ak7);
            qVar.mo107589a(true);
            qVar.mo107590b(new C1358a());
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI$b */
    public class C1359b implements View.OnClickListener {
        public C1359b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", BindMobilePolicyUI.this.f344313x.get(".sysmsg.BindPhoneGuidance.guidanceHelp.jumpUrl"));
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            C88144b.m109795m(BindMobilePolicyUI.this.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 100);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI$c */
    public class C114860c implements C47883u {
        public C114860c() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (!z) {
                BindMobilePolicyUI bindMobilePolicyUI = BindMobilePolicyUI.this;
                int i = BindMobilePolicyUI.f344310C;
                bindMobilePolicyUI.mo174540U7(12904);
                C45655c cVar = new C45655c(3, (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null), BindMobilePolicyUI.this.f344311A);
                C86709a0.m107524d().mo123460f(cVar);
                BindMobilePolicyUI bindMobilePolicyUI2 = BindMobilePolicyUI.this;
                if (bindMobilePolicyUI2.f344314y) {
                    C86709a0.m107524d().mo123455a(268, BindMobilePolicyUI.this);
                    BindMobilePolicyUI bindMobilePolicyUI3 = BindMobilePolicyUI.this;
                    bindMobilePolicyUI3.f344312B = C89779i0.m112246c(bindMobilePolicyUI3, bindMobilePolicyUI3.getString(C0966R.string.ddc), true, 0, new l$$a(this, cVar));
                    BindMobilePolicyUI.this.f344312B.show();
                    return;
                }
                bindMobilePolicyUI2.mo7680J7();
                return;
            }
            BindMobilePolicyUI bindMobilePolicyUI4 = BindMobilePolicyUI.this;
            int i2 = BindMobilePolicyUI.f344310C;
            bindMobilePolicyUI4.mo174540U7(12905);
        }
    }

    /* renamed from: S7 */
    public static void m161789S7() {
        Log.m105925i("MicroMsg.BindMobilePolicyUI", "checkAndStartBindPhoneGuidance %s", Integer.valueOf(C76170j0.f223160i));
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, new Bundle(), C32039a.class, new k$$a());
    }

    /* renamed from: T7 */
    public static void m161790T7() {
        Log.m105924i("MicroMsg.BindMobilePolicyUI", "clearBindPhoneGuidance");
        Bundle bundle = new Bundle();
        bundle.putString("key_wording_cfg", (String) null);
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, bundle, C32041c.class, new k$$b());
    }

    /* renamed from: V7 */
    public static void m161791V7(String str) {
        Log.m105925i("MicroMsg.BindMobilePolicyUI", "startBindPhoneGuidanceUI %s", str);
        Bundle bundle = new Bundle();
        bundle.putString("key_wording_cfg", str);
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, bundle, C32041c.class, new k$$c(str));
    }

    /* renamed from: J7 */
    public void mo7680J7() {
        mo7681K7(1);
        m161790T7();
    }

    /* renamed from: O7 */
    public void mo174515O7() {
        mo174540U7(12901);
        hideVKB();
        if (this.f344301v != 9 || this.f344293n == C79396l.SUCC) {
            super.mo174515O7();
            return;
        }
        C77426q qVar = new C77426q(getContext());
        qVar.mo107595g(this.f344313x.get(".sysmsg.BindPhoneGuidance.doublecheck_content"));
        qVar.mo107598j(this.f344313x.get(".sysmsg.BindPhoneGuidance.doublecheck_cancel"));
        qVar.mo107602n(this.f344313x.get(".sysmsg.BindPhoneGuidance.doublecheck_ok"));
        qVar.mo107589a(true);
        qVar.mo107590b(new C114860c());
        qVar.mo107603o();
    }

    /* renamed from: P7 */
    public void mo174516P7() {
        mo174540U7(12902);
        super.mo174516P7();
    }

    /* renamed from: R7 */
    public void mo174518R7() {
        if (this.f344293n == C79396l.NO_INIT) {
            showOptionMenu(1, false);
            this.f344289g.setVisibility(0);
            this.f344292j.setVisibility(8);
            C85875k4.m106191k0(this.f344287e.getPaint());
            TextView textView = this.f344287e;
            Map<String, String> map = this.f344313x;
            textView.setText(map != null ? map.get(".sysmsg.BindPhoneGuidance.guidanceTitle") : getString(C0966R.string.ak_));
            TextView textView2 = this.f344289g;
            Map<String, String> map2 = this.f344313x;
            textView2.setText(map2 != null ? map2.get(".sysmsg.BindPhoneGuidance.guidanceTip") : getString(C0966R.string.ak9));
            this.f344289g.setTextSize(0, ((float) C76577a.m92155f(this, C0966R.dimen.f3628l)) * C76577a.m92161l(this));
            if (!Util.isNullOrNil(this.f344315z)) {
                this.f344291i.setText(this.f344315z);
            } else {
                this.f344291i.setText(C0966R.string.ajh);
            }
        } else {
            super.mo174518R7();
        }
    }

    /* renamed from: U7 */
    public final void mo174540U7(int i) {
        BindPhoneGuidancePageReportStruct bindPhoneGuidancePageReportStruct = new BindPhoneGuidancePageReportStruct();
        bindPhoneGuidancePageReportStruct.f343663e = 1029;
        bindPhoneGuidancePageReportStruct.f343664f = (long) i;
        bindPhoneGuidancePageReportStruct.f343662d = 0;
        bindPhoneGuidancePageReportStruct.f343666h = bindPhoneGuidancePageReportStruct.mo86045b("GuidanceScene", this.f344311A, true);
        bindPhoneGuidancePageReportStruct.mo86054n();
        bindPhoneGuidancePageReportStruct.mo86056r();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cxd;
    }

    public void initView() {
        Map<String, String> parseXml = XmlParser.parseXml(getIntent().getStringExtra("key_wording_cfg"), "sysmsg", (String) null);
        this.f344313x = parseXml;
        if (parseXml != null) {
            Log.m105925i("MicroMsg.BindMobilePolicyUI", "wording:%s", parseXml);
            this.f344315z = this.f344313x.get(".sysmsg.BindPhoneGuidance.guidanceBtn");
            this.f344314y = "yes".equals(this.f344313x.get(".sysmsg.BindPhoneGuidance.syncEscape"));
            this.f344311A = Util.nullAs(this.f344313x.get(".sysmsg.BindPhoneGuidance.guidanceScene"), "");
            BindPhoneGuidancePageReportStruct bindPhoneGuidancePageReportStruct = new BindPhoneGuidancePageReportStruct();
            bindPhoneGuidancePageReportStruct.f343662d = 1;
            bindPhoneGuidancePageReportStruct.f343666h = bindPhoneGuidancePageReportStruct.mo86045b("GuidanceScene", this.f344311A, true);
            bindPhoneGuidancePageReportStruct.mo86054n();
            bindPhoneGuidancePageReportStruct.mo86056r();
            C79396l b = C76186t.m91534b();
            if (b == C79396l.NO_INIT || b == C79396l.SET_MOBILE) {
                C86709a0.m107535s().mo121142i().mo119676J(4097, "");
                C86709a0.m107535s().mo121142i().mo119676J(6, "");
            }
            super.initView();
            Map<String, String> map = this.f344313x;
            if (map == null || !"yes".equals(map.get(".sysmsg.BindPhoneGuidance.canUseBankAuthInstead"))) {
                Map<String, String> map2 = this.f344313x;
                if (map2 != null && map2.get(".sysmsg.BindPhoneGuidance.guidanceHelp") != null) {
                    TextView textView = (TextView) findViewById(C0966R.C0970id.jde);
                    textView.setText(this.f344313x.get(".sysmsg.BindPhoneGuidance.guidanceHelp.tips"));
                    textView.setOnClickListener(new C1359b());
                    textView.setVisibility(0);
                    return;
                }
                return;
            }
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.jde);
            textView2.setOnClickListener(new C1357a());
            textView2.setVisibility(0);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Map map;
        super.onActivityResult(i, i2, intent);
        if (i == 100 && intent != null && (map = (Map) intent.getBundleExtra("result_data").getSerializable("next_params")) != null && "continue_bind_mobile".equalsIgnoreCase((String) map.get("next_step"))) {
            mo174516P7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
    }

    public void onDestroy() {
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
        C86709a0.m107524d().mo123470p(268, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        if (yVar.getType() == 268) {
            C89779i0 i0Var = this.f344312B;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (i == 0 && i2 == 0) {
                mo7680J7();
                return;
            }
            Toast.makeText(this, String.format("(%s,%s,%s)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}), 0).show();
        }
    }
}
