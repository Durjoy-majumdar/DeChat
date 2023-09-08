package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import ji3.C9457a;
import nj3.C11182m0;
import nj3.C76874e0;
import p200lx.C61416x;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g6 */
public class C82518g6 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ JsApiShowImageOperateSheet.BottomSheetLogicHelper f241614d;

    public C82518g6(JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper) {
        this.f241614d = bottomSheetLogicHelper;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        Bitmap bitmap = null;
        this.f241614d.f240450b.mo107567l((View) null);
        e0Var.clear();
        e0Var.mo107125a(1, C0966R.string.i48);
        e0Var.mo107125a(2, C0966R.string.iam);
        e0Var.mo107125a(3, C0966R.string.f361137hk2);
        JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult = this.f241614d.f240449a;
        if (iPCQRCodeRecognizeResult == null || Util.isNullOrNil(iPCQRCodeRecognizeResult.f240475d)) {
            JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper = this.f241614d;
            C83928t1 t1Var = bottomSheetLogicHelper.f240451c;
            bottomSheetLogicHelper.getClass();
            C81415h0 fileSystem = t1Var.getFileSystem();
            C86009m1 allocTempFile = fileSystem.allocTempFile("showSheet_" + System.currentTimeMillis());
            if (allocTempFile == null) {
                Log.m105920e("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic failed for allocTempFile");
                return;
            }
            Bitmap N0 = t1Var.mo116159N0();
            if (N0 == null || N0.isRecycled() || N0.getWidth() <= 0 || N0.getHeight() <= 0) {
                Log.m105920e("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic bitmap not valid");
                return;
            }
            Rect rect = bottomSheetLogicHelper.f240454f;
            int width = N0.getWidth();
            int height = N0.getHeight();
            Log.m105925i("MicroMsg.JsApiShowImageOperateSheet", "constructValidElementRect from left:%d top:%d width:%d height:%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
            Rect rect2 = new Rect(Math.min(width, Math.max(0, rect.left)), Math.min(height, Math.max(0, rect.top)), Math.min(width, Math.max(0, rect.right)), Math.min(height, Math.max(0, rect.bottom)));
            Log.m105925i("MicroMsg.JsApiShowImageOperateSheet", "constructValidElementRect final left:%d top:%d width:%d height:%d", Integer.valueOf(rect2.left), Integer.valueOf(rect2.top), Integer.valueOf(rect2.width()), Integer.valueOf(rect2.height()));
            if (rect2.width() > 0 && rect2.height() > 0) {
                bitmap = Bitmap.createBitmap(N0, rect2.left, rect2.top, rect2.width(), rect2.height());
            }
            C9457a.m9137a(new C82386f6(bottomSheetLogicHelper, allocTempFile, N0, bitmap));
            return;
        }
        AppBrandInitConfigWC M1 = this.f241614d.f240451c.getRuntime().mo113210l1();
        boolean eQ = ((C45696d) C86709a0.m107533q(C45696d.class)).mo70989eQ(this.f241614d.f240451c.mo116163R0());
        JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult2 = this.f241614d.f240449a;
        if (((C61416x) C86312j.m106911c(C61416x.class)).mo72001rH(iPCQRCodeRecognizeResult2.f240477f, iPCQRCodeRecognizeResult2.f240475d, eQ, M1.mo111300k())) {
            JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper2 = this.f241614d;
            C77407n nVar = bottomSheetLogicHelper2.f240450b;
            JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult3 = bottomSheetLogicHelper2.f240449a;
            bottomSheetLogicHelper2.getClass();
            C82552j6 j6Var = new C82552j6(bottomSheetLogicHelper2);
            bottomSheetLogicHelper2.mo114457c(iPCQRCodeRecognizeResult3.f240477f, iPCQRCodeRecognizeResult3.f240475d, true, false);
            nVar.mo107567l(((ScanCodeSheetItemLogic) bottomSheetLogicHelper2.f240455g).mo67071b(j6Var, iPCQRCodeRecognizeResult3.f240477f, iPCQRCodeRecognizeResult3.f240475d, 11));
            return;
        }
        JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper3 = this.f241614d;
        JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult4 = bottomSheetLogicHelper3.f240449a;
        bottomSheetLogicHelper3.mo114457c(iPCQRCodeRecognizeResult4.f240477f, iPCQRCodeRecognizeResult4.f240475d, false, false);
        Log.m105929w("MicroMsg.JsApiShowImageOperateSheet", "showBottomSheet code is not AppBrand Enable,  codeType:%d result:%s", Integer.valueOf(this.f241614d.f240449a.f240477f), this.f241614d.f240449a.f240475d);
    }
}
