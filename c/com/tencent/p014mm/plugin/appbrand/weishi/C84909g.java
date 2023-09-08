package com.tencent.p014mm.plugin.appbrand.weishi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.weishi.g */
public class C84909g extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 621;
    public static final String NAME = "showShareActionSheet";

    /* renamed from: g */
    public C77407n f247442g;

    /* renamed from: com.tencent.mm.plugin.appbrand.weishi.g$a */
    public class C84910a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83928t1 f247443d;

        public C84910a(C83928t1 t1Var) {
            this.f247443d = t1Var;
        }

        public void run() {
            C84909g gVar = C84909g.this;
            C83928t1 t1Var = this.f247443d;
            gVar.getClass();
            C77407n nVar = new C77407n(t1Var.getContext(), false, 1);
            gVar.f247442g = nVar;
            nVar.f225771i = new C84911h(gVar);
            nVar.f225782p = new C84912i(gVar, t1Var);
            nVar.f225774j1 = true;
            nVar.f225779n1 = true;
            nVar.mo107573q();
            t1Var.mo114864j(new C84913j(gVar, t1Var));
            t1Var.mo114865m(new C84914k(gVar, t1Var));
        }
    }

    /* renamed from: w */
    public static void m104627w(C84909g gVar) {
        gVar.getClass();
        try {
            C77407n nVar = gVar.f247442g;
            if (nVar != null) {
                nVar.mo107572p();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiShowShareActionSheet", "hideActionSheet exception:%s", e);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83928t1 M0 = fVar instanceof C88267e ? ((C88267e) fVar).mo114341l0() : fVar instanceof C83928t1 ? (C83928t1) fVar : null;
        if (M0 == null) {
            Log.m105920e("MicroMsg.JsApiShowShareActionSheet", "fail, page view is null");
            fVar.mo109647a(i, mo115109j("fail:page don't exist"));
            return;
        }
        Log.m105924i("MicroMsg.JsApiShowShareActionSheet", "weishi show share action sheet");
        M0.getRuntime().mo113024P0(new C84910a(M0));
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
