package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p200lx.C46900z;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i6 */
public class C82546i6 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ JsApiShowImageOperateSheet.BottomSheetLogicHelper f241643a;

    public C82546i6(JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper) {
        this.f241643a = bottomSheetLogicHelper;
    }

    public void onDismiss() {
        C46900z zVar = this.f241643a.f240455g;
        if (zVar != null) {
            ((ScanCodeSheetItemLogic) zVar).mo67083n();
            ((ScanCodeSheetItemLogic) this.f241643a.f240455g).f116146d = MMApplicationContext.getContext();
        }
        this.f241643a.f240455g = null;
    }
}
