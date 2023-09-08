package p225rc;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import gy3.C87412m;
import p206nj.C47264o;

/* renamed from: rc.l */
public final class C89923l implements C89924m {

    /* renamed from: a */
    public static final C89923l f258408a = new C89923l();

    /* renamed from: b */
    public static C89924m f258409b;

    /* renamed from: a */
    public boolean mo117495a() {
        C89924m mVar = f258409b;
        if (mVar != null) {
            return mVar.mo117495a();
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo117496b() {
        C89924m mVar = f258409b;
        if (mVar != null) {
            return mVar.mo117496b();
        }
        return false;
    }

    /* renamed from: c */
    public int mo117497c(Context context) {
        C87412m.m108594g(context, "context");
        C89924m mVar = f258409b;
        return mVar != null ? mVar.mo117497c(context) : C47264o.m52556a(context, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0057 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117498d(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            rc.m r1 = f258409b
            r2 = 1
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1.mo117498d(r5)
            goto L_0x0058
        L_0x000e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 < r3) goto L_0x0045
            boolean r1 = r5 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001b
            android.app.Activity r5 = (android.app.Activity) r5
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r5 == 0) goto L_0x0041
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L_0x0041
            android.view.View r5 = r5.getDecorView()
            if (r5 == 0) goto L_0x0041
            android.view.WindowInsets r5 = r5.getRootWindowInsets()
            if (r5 == 0) goto L_0x0041
            android.view.DisplayCutout r5 = r5.getDisplayCutout()
            if (r5 == 0) goto L_0x0041
            java.util.List r5 = r5.getBoundingRects()
            if (r5 == 0) goto L_0x0041
            int r5 = r5.size()
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            if (r5 <= 0) goto L_0x0058
            goto L_0x0057
        L_0x0045:
            boolean r1 = com.tencent.p014mm.sdk.vendor.Vivo.vivohasCutOut(r5)
            if (r1 != 0) goto L_0x0057
            boolean r1 = com.tencent.p014mm.sdk.vendor.Oppo.oppohasCutOut(r5)
            if (r1 != 0) goto L_0x0057
            boolean r5 = com.tencent.p014mm.sdk.vendor.Huawei.huaweihasCutOut(r5)
            if (r5 == 0) goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p225rc.C89923l.mo117498d(android.content.Context):boolean");
    }

    /* renamed from: e */
    public boolean mo117499e(String str) {
        C89924m mVar = f258409b;
        if (mVar != null) {
            return mVar.mo117499e(str);
        }
        return false;
    }

    /* renamed from: f */
    public int mo117500f(int i) {
        C89924m mVar = f258409b;
        return mVar != null ? mVar.mo117500f(i) : i;
    }

    /* renamed from: g */
    public int mo117501g(Context context) {
        if (context == null) {
            return 0;
        }
        C89924m mVar = f258409b;
        return mVar != null ? mVar.mo117501g(context) : C47264o.m52556a(context, 25);
    }

    /* renamed from: h */
    public boolean mo117502h() {
        C89924m mVar = f258409b;
        if (mVar != null) {
            return mVar.mo117502h();
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo117503i() {
        C89924m mVar = f258409b;
        if (mVar != null) {
            return mVar.mo117503i();
        }
        return false;
    }

    /* renamed from: j */
    public void mo117504j(TextPaint textPaint) {
        C89924m mVar = f258409b;
        if (mVar != null) {
            mVar.mo117504j(textPaint);
            return;
        }
        if (textPaint != null) {
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        if (textPaint != null) {
            textPaint.setStrokeWidth(0.8f);
        }
    }
}
