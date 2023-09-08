package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p140cw.C7138g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.l6 */
public class C82563l6 implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ JsApiShowImageOperateSheet.BottomSheetLogicHelper f241667a;

    public C82563l6(JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper) {
        this.f241667a = bottomSheetLogicHelper;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        Log.m105925i("MicroMsg.JsApiShowImageOperateSheet", "saveToSDCard localPath:%s", str);
        if (!Util.isNullOrNil(str)) {
            ((C7138g) C86312j.m106911c(C7138g.class)).he0(str, this.f241667a.f240451c.getContext());
        }
    }
}
