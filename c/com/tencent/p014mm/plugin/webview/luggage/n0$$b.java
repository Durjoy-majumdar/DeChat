package com.tencent.p014mm.plugin.webview.luggage;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n0$$b */
public class n0$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C43661n0 f118011d;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.n0$$b$a */
    public class C43662a extends C53099d {
        public C43662a(n0$$b n0__b) {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            return new JSONObject();
        }

        /* renamed from: b */
        public String mo14702b() {
            return "onNavigationBarRightButtonClick";
        }
    }

    public n0$$b(C43661n0 n0Var) {
        this.f118011d = n0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C43658n nVar = this.f118011d.f117992e;
        if (nVar == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        nVar.f148259i.mo73815b(new C43662a(this));
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
