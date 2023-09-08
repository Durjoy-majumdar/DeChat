package rs1;

import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C45983e0;
import gy3.C8479f0;
import gy3.C87413o;

/* renamed from: rs1.za */
public final class C63676za extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ Class<? extends C59670o2> f180518d;

    /* renamed from: e */
    public final /* synthetic */ C45983e0 f180519e;

    /* renamed from: f */
    public final /* synthetic */ int[] f180520f;

    /* renamed from: g */
    public final /* synthetic */ boolean f180521g;

    /* renamed from: h */
    public final /* synthetic */ FinderVideoRecycler f180522h;

    /* renamed from: i */
    public final /* synthetic */ C8479f0<C59670o2> f180523i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63676za(Class<? extends C59670o2> cls, C45983e0 e0Var, int[] iArr, boolean z, FinderVideoRecycler finderVideoRecycler, C8479f0<C59670o2> f0Var) {
        super(1);
        this.f180518d = cls;
        this.f180519e = e0Var;
        this.f180520f = iArr;
        this.f180521g = z;
        this.f180522h = finderVideoRecycler;
        this.f180523i = f0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r10.getVideoViewFocused() != false) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            gr1.o2 r10 = (gr1.C59670o2) r10
            java.lang.String r0 = "it"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.Class<? extends gr1.o2> r0 = r9.f180518d
            java.lang.Class r1 = r10.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x010d
            r0 = 2131304857(0x7f092199, float:1.8227868E38)
            java.lang.Object r0 = r10.getTag(r0)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x0021
            java.lang.Long r0 = (java.lang.Long) r0
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0029
            long r0 = r0.longValue()
            goto L_0x002b
        L_0x0029:
            r0 = 0
        L_0x002b:
            gy3.e0 r2 = r9.f180519e
            long r2 = r2.f124000d
            r4 = 93
            java.lang.String r5 = ", "
            java.lang.String r6 = "Finder.VideoRecycler"
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x00bd
            int[] r2 = r9.f180520f
            r3 = 0
            r2[r3] = r3
            r7 = 1
            r2[r7] = r3
            android.view.View r2 = r10.getVideoView()
            int r2 = r2.getHeight()
            android.view.View r3 = r10.getVideoView()
            int[] r8 = r9.f180520f
            r3.getLocationInWindow(r8)
            boolean r3 = r9.f180521g
            if (r3 != 0) goto L_0x0081
            android.view.View r3 = r10.getVideoView()
            boolean r3 = r3.isAttachedToWindow()
            if (r3 == 0) goto L_0x0081
            int[] r3 = r9.f180520f
            r3 = r3[r7]
            int r2 = r2 + r3
            if (r2 <= 0) goto L_0x0081
            android.view.View r2 = r10.getVideoView()
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
            if (r3 > r2) goto L_0x0081
            boolean r2 = r10.getVideoViewFocused()
            if (r2 != 0) goto L_0x010d
        L_0x0081:
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r2 = r9.f180522h
            java.util.HashMap<java.lang.Integer, java.lang.Object> r2 = r2.f162541x
            int r3 = r10.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x010d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "findOldestVideoView hit update updateTime ["
            r2.append(r3)
            r2.append(r0)
            r2.append(r5)
            gy3.e0 r3 = r9.f180519e
            long r7 = r3.f124000d
            r2.append(r7)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            gy3.e0 r2 = r9.f180519e
            r2.f124000d = r0
            gy3.f0<gr1.o2> r0 = r9.f180523i
            r0.f27484d = r10
            goto L_0x010d
        L_0x00bd:
            boolean r2 = r10 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            java.lang.String r3 = "findOldestVideoView updateTime > minUpdateTime ["
            if (r2 == 0) goto L_0x00ee
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r10 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r10
            java.lang.String r10 = r10.getFTPPTag()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            r2.append(r5)
            gy3.e0 r0 = r9.f180519e
            long r0 = r0.f124000d
            r2.append(r0)
            java.lang.String r0 = "] "
            r2.append(r0)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            goto L_0x010d
        L_0x00ee:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r10.append(r0)
            r10.append(r5)
            gy3.e0 r0 = r9.f180519e
            long r0 = r0.f124000d
            r10.append(r0)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
        L_0x010d:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63676za.invoke(java.lang.Object):java.lang.Object");
    }
}
