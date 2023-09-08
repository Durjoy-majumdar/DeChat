package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.j0 */
public class C82173j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32227p f241004d;

    /* renamed from: e */
    public final /* synthetic */ JsApiOperateWXData.OperateWXDataTask f241005e;

    public C82173j0(JsApiOperateWXData.OperateWXDataTask operateWXDataTask, C32227p pVar) {
        this.f241005e = operateWXDataTask;
        this.f241004d = pVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData$OperateWXDataTask$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32227p pVar = this.f241004d;
        JsApiOperateWXData.OperateWXDataTask operateWXDataTask = this.f241005e;
        C82197q qVar = operateWXDataTask.f240857f;
        C81879g gVar = operateWXDataTask.f240858g;
        qVar.getClass();
        Context o0 = gVar instanceof C81925i2 ? ((C81925i2) gVar).mo114344o0() : gVar.getContext();
        pVar.invoke(o0 == null ? null : AndroidContextUtil.castActivityOrNull(o0), this.f241005e.f240875y);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData$OperateWXDataTask$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
