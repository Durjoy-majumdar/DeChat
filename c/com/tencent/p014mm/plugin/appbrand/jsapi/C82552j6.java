package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.j6 */
public class C82552j6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ JsApiShowImageOperateSheet.BottomSheetLogicHelper f241658d;

    public C82552j6(JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper) {
        this.f241658d = bottomSheetLogicHelper;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/JsApiShowImageOperateSheet$BottomSheetLogicHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f241658d.f240450b.mo107563h()) {
            this.f241658d.f240450b.mo107572p();
        }
        JsApiShowImageOperateSheet.BottomSheetLogicHelper.m100714a(this.f241658d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/JsApiShowImageOperateSheet$BottomSheetLogicHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
