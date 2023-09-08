package p1052vd;

import android.content.Context;
import android.content.res.AssetManager;
import com.github.henryye.nativeiv.BaseImageDecodeService;
import com.github.henryye.nativeiv.api.IImageDecodeService;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import ny3.C89104m;
import p1017od.C89166m;
import p1017od.C89167n;
import p1030s6.C90132b;
import p1045ud.C90643b;
import p416qd.C89598h;
import p673r6.C89881d;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: vd.a */
public final class C90765a {

    /* renamed from: vd.a$a */
    public static final class C90766a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C89166m f260659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90766a(C89166m mVar) {
            super(0);
            this.f260659d = mVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f260659d.mo123515c() > 0 && this.f260659d.mo123514b() > 0);
        }
    }

    /* renamed from: a */
    public static final void m113824a(C89166m mVar, String str) {
        C87412m.m108594g(mVar, "<this>");
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        if (mVar.f256988u) {
            C89598h.m112045b("MagicBrush", str, new Object[0]);
        }
    }

    /* renamed from: b */
    public static final void m113825b(C89166m mVar) {
        C87412m.m108594g(mVar, "<this>");
        C89167n.C89168a aVar = mVar.f256975h;
        C89104m<Object>[] mVarArr = C89167n.f256956L;
        if (((AssetManager) aVar.mo125227a(mVar, mVarArr[4])) == null) {
            Context context = mVar.f256968a;
            mVar.f256975h.mo125228b(mVar, mVarArr[4], context != null ? context.getAssets() : null);
        }
        if (((AssetManager) mVar.f256975h.mo125227a(mVar, mVarArr[4])) == null) {
            throw new IllegalStateException("AssetManager invalid. Either assetManager or context should be provided.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r5.y != 0) goto L_0x0078;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m113826c(p1017od.C89166m r8) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r8, r0)
            float r0 = r8.mo123516d()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            android.content.Context r0 = r8.f256968a
            if (r0 == 0) goto L_0x0029
            float r2 = p748xd.C91169b.f261402a
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0024
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            p748xd.C91169b.f261402a = r0
        L_0x0024:
            float r0 = p748xd.C91169b.f261402a
            r8.mo123519g(r0)
        L_0x0029:
            vd.a$a r0 = new vd.a$a
            r0.<init>(r8)
            java.lang.Object r2 = r0.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 47
            if (r2 != 0) goto L_0x0124
            android.content.Context r2 = r8.f256968a
            if (r2 == 0) goto L_0x00fa
            java.lang.String r4 = "window"
            java.lang.Object r4 = r2.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>()
            if (r4 == 0) goto L_0x0060
            android.view.Display r4 = r4.getDefaultDisplay()
            r4.getRealSize(r5)
            int r4 = r5.x
            if (r4 == 0) goto L_0x0060
            int r4 = r5.y
            if (r4 == 0) goto L_0x0060
            goto L_0x0078
        L_0x0060:
            android.content.res.Resources r4 = r2.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
            r5.x = r4
            android.content.res.Resources r4 = r2.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            r5.y = r4
        L_0x0078:
            int r4 = r5.x
            float r4 = (float) r4
            float r6 = p748xd.C91169b.f261402a
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x008d
            android.content.res.Resources r6 = r2.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            p748xd.C91169b.f261402a = r6
        L_0x008d:
            float r6 = p748xd.C91169b.f261402a
            float r4 = r4 / r6
            double r6 = (double) r4
            double r6 = java.lang.Math.ceil(r6)
            int r4 = (int) r6
            r5.x = r4
            int r4 = r5.y
            float r4 = (float) r4
            float r6 = p748xd.C91169b.f261402a
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ad
            android.content.res.Resources r1 = r2.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            p748xd.C91169b.f261402a = r1
        L_0x00ad:
            float r1 = p748xd.C91169b.f261402a
            float r4 = r4 / r1
            double r1 = (double) r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r5.y = r1
            int r1 = r5.x
            od.n$a r2 = r8.f256972e
            ny3.m<java.lang.Object>[] r4 = p1017od.C89167n.f256956L
            r6 = 1
            r6 = r4[r6]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo125228b(r8, r6, r1)
            int r1 = r5.y
            od.n$a r2 = r8.f256973f
            r5 = 2
            r4 = r4[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo125228b(r8, r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "w/h invalid, use context automatically. "
            r1.append(r2)
            int r2 = r8.mo123515c()
            r1.append(r2)
            r1.append(r3)
            int r2 = r8.mo123514b()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m113824a(r8, r1)
            goto L_0x0124
        L_0x00fa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "w/h invalid. context invalid. "
            r0.append(r1)
            int r1 = r8.mo123515c()
            r0.append(r1)
            r0.append(r3)
            int r8 = r8.mo123514b()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x0124:
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0131
            return
        L_0x0131:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dpr/w/h invalid. "
            r0.append(r1)
            float r1 = r8.mo123516d()
            r0.append(r1)
            r0.append(r3)
            int r1 = r8.mo123515c()
            r0.append(r1)
            r0.append(r3)
            int r8 = r8.mo123514b()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1052vd.C90765a.m113826c(od.m):void");
    }

    /* renamed from: d */
    public static final void m113827d(C89166m mVar) {
        C87412m.m108594g(mVar, "<this>");
        C89167n.C89171b bVar = mVar.f256976i;
        if (bVar.f256996a) {
            BaseImageDecodeService baseImageDecodeService = new BaseImageDecodeService();
            baseImageDecodeService.addImageStreamFetcher(new C90643b(), false);
            List<C90132b> list = mVar.f256976i.f256997b;
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C90132b bVar2 = (C90132b) next;
                    boolean z = true;
                    if (i != ((ArrayList) list).size() - 1) {
                        z = false;
                    }
                    baseImageDecodeService.addImageStreamFetcher(bVar2, z);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            C89881d dVar = mVar.f256976i.f256998c;
            if (dVar != null) {
                baseImageDecodeService.setKvReportDelegate(dVar);
            }
            IImageDecodeService.C80187a aVar = mVar.f256976i.f256999d;
            if (aVar != null) {
                C87412m.m108591d(aVar);
                baseImageDecodeService.setBitmapDecodeSlave(aVar);
            }
            mVar.f256976i.f257000e = baseImageDecodeService;
        } else if (bVar.f257000e == null) {
            m113824a(mVar, "ImageHandler invalid, BindingImage can not use. BE CAUTIOUS!");
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
