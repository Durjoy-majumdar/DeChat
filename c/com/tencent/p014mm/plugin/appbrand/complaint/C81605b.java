package com.tencent.p014mm.plugin.appbrand.complaint;

import ak0.C79584a;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.page.C83907r4;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.webview.model.C6032f2;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p1044ub.C90634e;
import qq0.C89797e;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.complaint.b */
public final class C81605b {

    /* renamed from: a */
    public static final C81605b f239273a = new C81605b();

    /* renamed from: com.tencent.mm.plugin.appbrand.complaint.b$a */
    public static final class C81606a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83928t1 f239274d;

        /* renamed from: e */
        public final /* synthetic */ String f239275e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81606a(C83928t1 t1Var, String str) {
            super(0);
            this.f239274d = t1Var;
            this.f239275e = str;
        }

        public Object invoke() {
            Bitmap N0 = this.f239274d.mo116159N0();
            ((C119157j) C119157j.f356862d).mo183875f(new C81604a(N0, this.f239275e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public static final String m100094b(C83928t1 t1Var) {
        C87412m.m108594g(t1Var, "pageView");
        Log.m105924i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, pageView:" + t1Var);
        String vn = ((C81607h) C86312j.m106911c(C81607h.class)).mo56719vn();
        Bitmap bitmap = null;
        if (vn == null) {
            Log.m105924i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, null image cache dir");
            return null;
        }
        C86009m1 m1Var = new C86009m1(vn + XVFSFile.SEPARATOR_CHAR + t1Var.getAppId() + '_' + System.currentTimeMillis() + ".jpeg");
        t1Var.mo109673t(new C90634e(t1Var));
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "tempFile.absolutePath");
        C81606a aVar = new C81606a(t1Var, i);
        C79584a.C79585a aVar2 = C79584a.f233382a;
        AppBrandRuntimeWC J1 = t1Var.getRuntime();
        C87412m.m108593f(J1, "pageView.runtime");
        if (!aVar2.mo109700c(J1)) {
            AppBrandRuntimeWC J12 = t1Var.getRuntime();
            C87412m.m108593f(J12, "pageView.runtime");
            if (!aVar2.mo109699b(J12)) {
                aVar.invoke();
                String a = C6032f2.m5914a(i);
                Log.m105924i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, localId:" + a + ", imagePath:" + i);
                return a;
            }
        }
        AppBrandRuntimeWC J13 = t1Var.getRuntime();
        C89797e eVar = J13.f238159x;
        if (eVar != null) {
            if (eVar.f258187b != null) {
                eVar.f258190e = eVar.mo124089b().getVisibility();
            }
            C89797e eVar2 = J13.f238159x;
            if (eVar2.f258187b != null) {
                eVar2.mo124089b().setVisibility(4);
            }
        }
        View findViewById = J13.f238153r.getRootView().findViewById(C0966R.C0970id.biv);
        if (findViewById != null) {
            bitmap = C83907r4.m103302b(findViewById);
            C89797e eVar3 = J13.f238159x;
            if (!(eVar3 == null || eVar3.f258187b == null)) {
                eVar3.mo124089b().setVisibility(eVar3.f258190e);
            }
        }
        if (bitmap != null) {
            f239273a.mo113888a(bitmap, i);
        } else {
            aVar.invoke();
        }
        String a2 = C6032f2.m5914a(i);
        Log.m105924i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, localId:" + a2 + ", imagePath:" + i);
        return a2;
    }

    /* renamed from: a */
    public final void mo113888a(Bitmap bitmap, String str) {
        StringBuilder sb;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    bitmap2 = BitmapUtil.extractThumbNail(bitmap, 640, 640, false, true);
                    BitmapUtil.saveBitmapToImage(bitmap2, 100, Bitmap.CompressFormat.JPEG, str, true);
                    Log.m105924i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, save bitmap to file:" + str + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
                    ((C81607h) C86312j.m106911c(C81607h.class)).Y80(str);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandComplaintHelper", e, "tryTakeScreenshot, save bitmap to file fail", new Object[0]);
                if (!bitmap.isRecycled()) {
                    Log.m105918d("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, recycle bitmap:" + bitmap);
                    bitmap.recycle();
                }
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    sb = new StringBuilder();
                } else {
                    return;
                }
            } catch (Throwable th) {
                if (!bitmap.isRecycled()) {
                    Log.m105918d("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, recycle bitmap:" + bitmap);
                    bitmap.recycle();
                }
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    Log.m105918d("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, recycle thumbnail:" + bitmap2);
                    bitmap2.recycle();
                }
                throw th;
            }
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105918d("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, recycle bitmap:" + bitmap);
            bitmap.recycle();
        }
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            sb = new StringBuilder();
            sb.append("tryTakeScreenshot, recycle thumbnail:");
            sb.append(bitmap2);
            Log.m105918d("MicroMsg.AppBrandComplaintHelper", sb.toString());
            bitmap2.recycle();
        }
    }
}
