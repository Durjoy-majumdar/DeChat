package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h6 */
public class C82529h6 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ JsApiShowImageOperateSheet.BottomSheetLogicHelper f241631d;

    public C82529h6(JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper) {
        this.f241631d = bottomSheetLogicHelper;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper = this.f241631d;
            bottomSheetLogicHelper.getClass();
            bottomSheetLogicHelper.mo114456b(new C82556k6(bottomSheetLogicHelper));
        } else if (itemId == 2) {
            JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper2 = this.f241631d;
            bottomSheetLogicHelper2.getClass();
            bottomSheetLogicHelper2.mo114456b(new C82563l6(bottomSheetLogicHelper2));
        } else if (itemId == 3) {
            JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper3 = this.f241631d;
            bottomSheetLogicHelper3.getClass();
            bottomSheetLogicHelper3.mo114456b(new C82841n6(bottomSheetLogicHelper3));
        } else if (itemId == 4) {
            JsApiShowImageOperateSheet.BottomSheetLogicHelper.m100714a(this.f241631d);
        }
    }
}
