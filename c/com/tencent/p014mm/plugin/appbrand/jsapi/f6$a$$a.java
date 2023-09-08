package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82386f6;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p200lx.C46897s;
import p200lx.C46900z;
import p200lx.C61416x;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f6$a$$a */
public final /* synthetic */ class f6$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82386f6.C82387a f241436d;

    /* renamed from: e */
    public final /* synthetic */ JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult f241437e;

    public /* synthetic */ f6$a$$a(C82386f6.C82387a aVar, JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult) {
        this.f241436d = aVar;
        this.f241437e = iPCQRCodeRecognizeResult;
    }

    public final void run() {
        C82386f6.C82387a aVar = this.f241436d;
        JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult = this.f241437e;
        JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper = C82386f6.this.f241434g;
        bottomSheetLogicHelper.f240449a = iPCQRCodeRecognizeResult;
        C77407n nVar = bottomSheetLogicHelper.f240450b;
        if (nVar != null && nVar.mo107563h()) {
            C82386f6.this.f241434g.mo114458d();
        }
        JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper2 = C82386f6.this.f241434g;
        int i = iPCQRCodeRecognizeResult.f240477f;
        String str = iPCQRCodeRecognizeResult.f240475d;
        bottomSheetLogicHelper2.getClass();
        Log.m105924i("MicroMsg.JsApiShowImageOperateSheet", "processGetCodeInfo");
        if (!((C61416x) C86312j.m106911c(C61416x.class)).mo72002rO(i, str)) {
            Log.m105928w("MicroMsg.JsApiShowImageOperateSheet", "processGetCodeInfo is not customCode, return, codeType:" + i);
            return;
        }
        C46900z zVar = bottomSheetLogicHelper2.f240455g;
        if (zVar == null) {
            Log.m105928w("MicroMsg.JsApiShowImageOperateSheet", "processGetCodeInfo sheetItemLogic == null , return");
            return;
        }
        String appId = bottomSheetLogicHelper2.f240451c.getAppId();
        C46897s.C46898a aVar2 = new C46897s.C46898a(str);
        aVar2.f126106b = 5;
        aVar2.f126107c = appId;
        ((ScanCodeSheetItemLogic) zVar).mo67078i(i, aVar2);
    }
}
