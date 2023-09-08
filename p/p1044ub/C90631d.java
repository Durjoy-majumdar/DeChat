package p1044ub;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import lp3.C46888b;

/* renamed from: ub.d */
public class C90631d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f260382d;

    /* renamed from: e */
    public final /* synthetic */ int f260383e;

    /* renamed from: f */
    public final /* synthetic */ C46888b f260384f;

    /* renamed from: g */
    public final /* synthetic */ View f260385g;

    /* renamed from: h */
    public final /* synthetic */ int f260386h;

    /* renamed from: i */
    public final /* synthetic */ int f260387i;

    /* renamed from: j */
    public final /* synthetic */ c$$e f260388j;

    /* renamed from: ub.d$a */
    public class C90632a implements C82531i.C82536e {

        /* renamed from: ub.d$a$a */
        public class C90633a implements Runnable {
            public C90633a() {
            }

            public void run() {
                C90631d.this.f260388j.f260381a.mo124767E1();
                C83797e3 e3Var = C90631d.this.f260388j.f260381a.f244558J;
                if (e3Var != null) {
                    e3Var.setVerticalScrollBarEnabled(true);
                }
            }
        }

        public C90632a() {
        }

        /* renamed from: a */
        public void mo114870a() {
            C90631d.this.f260388j.f260381a.f244657w.f241651j.remove(this);
            C90631d dVar = C90631d.this;
            dVar.f260385g.scrollTo(dVar.f260386h, dVar.f260387i);
            C90631d.this.f260388j.f260381a.f244558J.mo63311e1(new C90633a());
        }
    }

    public C90631d(c$$e c__e, int i, int i2, C46888b bVar, View view, int i3, int i4) {
        this.f260388j = c__e;
        this.f260382d = i;
        this.f260383e = i2;
        this.f260384f = bVar;
        this.f260385g = view;
        this.f260386h = i3;
        this.f260387i = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.AppBrandPageViewLU"
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            ub.c$$e r5 = r11.f260388j     // Catch:{ OutOfMemoryError -> 0x0030, NullPointerException -> 0x000f }
            ub.c r5 = r5.f260381a     // Catch:{ OutOfMemoryError -> 0x0030, NullPointerException -> 0x000f }
            android.graphics.Bitmap r5 = r5.mo116159N0()     // Catch:{ OutOfMemoryError -> 0x0030, NullPointerException -> 0x000f }
            goto L_0x004d
        L_0x000f:
            r5 = move-exception
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r5
            ub.c$$e r5 = r11.f260388j
            ub.c r5 = r5.f260381a
            java.lang.String r5 = r5.getAppId()
            r6[r4] = r5
            ub.c$$e r5 = r11.f260388j
            ub.c r5 = r5.f260381a
            java.lang.String r5 = r5.mo116162Q0()
            r6[r3] = r5
            java.lang.String r5 = "postOnReRendered getScreenshotWithoutDecor npe(%s), appId[%s] url[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r6)
            goto L_0x004c
        L_0x0030:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            ub.c$$e r6 = r11.f260388j
            ub.c r6 = r6.f260381a
            java.lang.String r6 = r6.getAppId()
            r5[r1] = r6
            ub.c$$e r6 = r11.f260388j
            ub.c r6 = r6.f260381a
            java.lang.String r6 = r6.mo116162Q0()
            r5[r4] = r6
            java.lang.String r6 = "postOnReRendered getScreenshotWithoutDecor oom, appId[%s] url[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r5)
        L_0x004c:
            r5 = r2
        L_0x004d:
            if (r5 == 0) goto L_0x00dc
            int r6 = r5.getWidth()
            if (r6 <= 0) goto L_0x00dc
            int r6 = r5.getHeight()
            if (r6 <= 0) goto L_0x00dc
            int r6 = r5.getWidth()
            int r7 = r11.f260382d
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getHeight()
            int r8 = r11.f260383e
            int r7 = java.lang.Math.min(r7, r8)
            ub.c$$e r8 = r11.f260388j
            ub.c r8 = r8.f260381a
            bt0.b r8 = r8.f244554F
            boolean r9 = r8.f233903v
            if (r9 == 0) goto L_0x009d
            int[] r9 = new int[r3]
            com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView r8 = r8.getCapsuleView()
            r8.getLocationInWindow(r9)
            r8 = r9[r4]
            ub.c$$e r9 = r11.f260388j
            ub.c r9 = r9.f260381a
            android.content.Context r9 = r9.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165819(0x7f07027b, float:1.7945866E38)
            int r9 = r9.getDimensionPixelSize(r10)
            int r8 = r8 + r9
            int r8 = java.lang.Math.min(r8, r7)
            goto L_0x009e
        L_0x009d:
            r8 = 0
        L_0x009e:
            lp3.b r9 = r11.f260384f     // Catch:{ OutOfMemoryError -> 0x00af }
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ OutOfMemoryError -> 0x00af }
            int r7 = r7 - r8
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r5, r1, r8, r6, r7)     // Catch:{ OutOfMemoryError -> 0x00af }
            r10[r1] = r6     // Catch:{ OutOfMemoryError -> 0x00af }
            r9.mo72093c(r10)     // Catch:{ OutOfMemoryError -> 0x00af }
            goto L_0x00d4
        L_0x00ad:
            r0 = move-exception
            goto L_0x00d8
        L_0x00af:
            java.lang.String r6 = "postOnReRendered getScreenshotWithoutDecor cut final bitmap oom, appId[%s] url[%s]"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ad }
            ub.c$$e r7 = r11.f260388j     // Catch:{ all -> 0x00ad }
            ub.c r7 = r7.f260381a     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = r7.getAppId()     // Catch:{ all -> 0x00ad }
            r3[r1] = r7     // Catch:{ all -> 0x00ad }
            ub.c$$e r7 = r11.f260388j     // Catch:{ all -> 0x00ad }
            ub.c r7 = r7.f260381a     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = r7.mo116162Q0()     // Catch:{ all -> 0x00ad }
            r3[r4] = r7     // Catch:{ all -> 0x00ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r3)     // Catch:{ all -> 0x00ad }
            lp3.b r0 = r11.f260384f     // Catch:{ all -> 0x00ad }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x00ad }
            r3[r1] = r2     // Catch:{ all -> 0x00ad }
            r0.mo72093c(r3)     // Catch:{ all -> 0x00ad }
        L_0x00d4:
            r5.recycle()     // Catch:{ all -> 0x0108 }
            goto L_0x0108
        L_0x00d8:
            r5.recycle()     // Catch:{ all -> 0x00db }
        L_0x00db:
            throw r0
        L_0x00dc:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6 = -1
            if (r5 != 0) goto L_0x00e3
            r7 = -1
            goto L_0x00e7
        L_0x00e3:
            int r7 = r5.getWidth()
        L_0x00e7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r1] = r7
            if (r5 != 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            int r6 = r5.getHeight()
        L_0x00f4:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r3[r4] = r5
            java.lang.String r5 = "getScreenshotWithoutDecor bitmap invalid width(%d), height(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r3)
            lp3.b r0 = r11.f260384f
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r1] = r2
            r0.mo72093c(r3)
        L_0x0108:
            ub.c$$e r0 = r11.f260388j
            ub.c r0 = r0.f260381a
            ub.d$a r1 = new ub.d$a
            r1.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.j r0 = r0.f244657w
            java.util.Set<com.tencent.mm.plugin.appbrand.jsapi.i$e> r0 = r0.f241651j
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1044ub.C90631d.run():void");
    }
}
