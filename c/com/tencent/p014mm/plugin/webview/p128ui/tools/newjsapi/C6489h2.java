package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qo3.C101218e0;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h2 */
public final class C6489h2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23575d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23576e;

    /* renamed from: f */
    public final /* synthetic */ IPCString f23577f;

    public C6489h2(C13855j jVar, C13851h1 h1Var, IPCString iPCString) {
        this.f23575d = jVar;
        this.f23576e = h1Var;
        this.f23577f = iPCString;
    }

    public final void run() {
        C6439g2 g2Var = C6439g2.f23461d;
        C13855j jVar = this.f23575d;
        C13851h1 h1Var = this.f23576e;
        IPCString iPCString = this.f23577f;
        String str = iPCString != null ? iPCString.f10315d : null;
        g2Var.getClass();
        Object obj = h1Var.f38983a.get("requestName");
        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = h1Var.f38983a.get("requestIconUrl");
        C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
        C101218e0 e0Var = new C101218e0(jVar.f38998a, 0, 0, false);
        e0Var.f296384g.setBackgroundColor(jVar.f38998a.getResources().getColor(C0966R.color.al6));
        View inflate = View.inflate(jVar.f38998a, C0966R.C0971layout.f360070ci1, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.f359083iq3);
        C87412m.m108593f(findViewById, "contentView.findViewById(R.id.request_icon)");
        View findViewById2 = inflate.findViewById(C0966R.C0970id.iq5);
        C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.request_name)");
        View findViewById3 = inflate.findViewById(C0966R.C0970id.hvf);
        C87412m.m108593f(findViewById3, "contentView.findViewById…anager_dialog_item_phone)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.hvg);
        C87412m.m108593f(findViewById4, "contentView.findViewById…nager_dialog_item_remark)");
        View findViewById5 = inflate.findViewById(C0966R.C0970id.aoi);
        C87412m.m108593f(findViewById5, "contentView.findViewById(R.id.button_group)");
        View findViewById6 = inflate.findViewById(C0966R.C0970id.aoj);
        C87412m.m108593f(findViewById6, "contentView.findViewById(R.id.button_i_known)");
        View findViewById7 = inflate.findViewById(C0966R.C0970id.ipy);
        C87412m.m108593f(findViewById7, "contentView.findViewById(R.id.request_cancel)");
        View findViewById8 = inflate.findViewById(C0966R.C0970id.iq6);
        C87412m.m108593f(findViewById8, "contentView.findViewById(R.id.request_ok)");
        findViewById7.setOnClickListener(new C6495i2(e0Var, jVar, h1Var));
        findViewById8.setOnClickListener(new C6500j2(e0Var, str, jVar, h1Var));
        findViewById6.setOnClickListener(new C6505k2(e0Var, jVar, h1Var));
        ((TextView) findViewById2).setText((String) obj);
        C20937c.C20939b bVar = new C20937c.C20939b();
        boolean z = true;
        bVar.f59347c = true;
        bVar.f59359o = C0966R.raw.default_avatar_round;
        bVar.f59364t = true;
        C20828a.m22825b().mo32519h((String) obj2, (ImageView) findViewById, bVar.mo32666a());
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (z) {
            textView.setVisibility(0);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById4;
            View view2 = findViewById6;
            View view3 = findViewById5;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view5 = view2;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setTextColor(jVar.f38998a.getResources().getColor(C0966R.color.f3563xt));
            textView.setText(jVar.f38998a.getText(C0966R.string.lfv));
        } else {
            View view6 = findViewById6;
            View view7 = findViewById5;
            textView.setVisibility(0);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view8 = findViewById4;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view9 = view7;
            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view10 = view6;
            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(str);
        }
        e0Var.mo140663j(inflate);
        e0Var.mo140655A();
    }
}
