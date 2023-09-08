package og0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31924c1;
import ft3.C8206g;
import gy3.C87412m;
import java.util.Map;
import ke3.C88144b;
import ob0.C35136m;
import p156gj.C87203t;

/* renamed from: og0.c */
public final class C11409c implements C31924c1 {

    /* renamed from: d */
    public static C11410a f33568d;

    /* renamed from: og0.c$a */
    public final class C11410a {

        /* renamed from: a */
        public String f33569a;

        /* renamed from: b */
        public String f33570b;

        /* renamed from: c */
        public String f33571c;

        /* renamed from: d */
        public String f33572d;

        /* renamed from: e */
        public String f33573e;

        /* renamed from: f */
        public String f33574f;

        /* renamed from: g */
        public String f33575g;

        /* renamed from: h */
        public boolean f33576h;

        public C11410a(C11409c cVar) {
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (C87412m.m108589b(str, "showpolicylist")) {
            C11410a aVar2 = new C11410a(this);
            f33568d = aVar2;
            if (map != null) {
                aVar2.f33569a = map.get(".sysmsg.showpolicylist.policylist_url");
                C11410a aVar3 = f33568d;
                if (aVar3 != null) {
                    aVar3.f33570b = map.get(".sysmsg.showpolicylist.policylist_list");
                }
                C11410a aVar4 = f33568d;
                if (aVar4 != null) {
                    aVar4.f33571c = map.get(".sysmsg.showpolicylist.policylist_ticket");
                }
                C11410a aVar5 = f33568d;
                if (aVar5 != null) {
                    aVar5.f33572d = map.get(".sysmsg.showpolicylist.deviceid");
                }
                C11410a aVar6 = f33568d;
                if (aVar6 != null) {
                    aVar6.f33573e = map.get(".sysmsg.showpolicylist.doublecheck_content");
                }
                C11410a aVar7 = f33568d;
                if (aVar7 != null) {
                    aVar7.f33574f = map.get(".sysmsg.showpolicylist.doublecheck_cancel");
                }
                C11410a aVar8 = f33568d;
                if (aVar8 != null) {
                    aVar8.f33575g = map.get(".sysmsg.showpolicylist.doublecheck_ok");
                }
                C11410a aVar9 = f33568d;
                if (aVar9 != null) {
                    aVar9.f33576h = Util.getInt(map.get(".sysmsg.showpolicylist.hideclosebtn"), 0) == 1;
                }
            }
            C11410a aVar10 = f33568d;
            if (aVar10 != null) {
                Log.m105924i("MicroMsg.Account.AccountComplianceReceiver", "showpolicylist onNewXmlReceived url:" + aVar10.f33569a + " list:" + aVar10.f33570b + " ticket:" + aVar10.f33571c + " hideCloseBtn:" + aVar10.f33576h);
                if (!Util.isNullOrNil(aVar10.f33569a) && C8206g.f27135a.mo9260a(aVar10.f33572d, C87203t.m108273i(), "showpolicylist", false)) {
                    Bundle bundle = new Bundle();
                    String str2 = "";
                    bundle.putString("close_dialog_title", str2);
                    String str3 = aVar10.f33573e;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    bundle.putString("close_dialog_msg", str3);
                    String str4 = aVar10.f33575g;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    bundle.putString("close_dialog_ok", str4);
                    String str5 = aVar10.f33574f;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    bundle.putString("close_dialog_cancel", str2);
                    bundle.putBoolean("close_dialog_ok_close", false);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("key_close_action", 1);
                    bundle2.putBoolean("hide_close_btn", aVar10.f33576h);
                    bundle2.putBundle("key_close_data", bundle);
                    bundle2.putBoolean("hide_option_menu", true);
                    bundle2.putBoolean("KRightBtn", true);
                    bundle2.putBoolean("KPopUpTransition", true);
                    bundle2.putBoolean("open_custom_style_url", true);
                    Context context = MMApplicationContext.getContext();
                    String str6 = aVar10.f33569a;
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str6);
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("needRedirect", false);
                    intent.putExtra("neverGetA8Key", false);
                    intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                    intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                    intent.putExtras(bundle2);
                    C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
        }
    }
}
