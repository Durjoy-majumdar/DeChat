package sp1;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import gy3.C8480h;
import java.lang.ref.SoftReference;
import qj1.C62660c;

/* renamed from: sp1.o0 */
public final class C64117o0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public SoftReference<C64107n0> f181788d;

    /* renamed from: e */
    public SoftReference<C62660c> f181789e;

    /* renamed from: f */
    public SoftReference<ViewGroup> f181790f;

    public C64117o0(SoftReference<C64107n0> softReference, SoftReference<C62660c> softReference2, SoftReference<ViewGroup> softReference3, int i, C8480h hVar) {
        softReference = (i & 1) != 0 ? null : softReference;
        softReference2 = (i & 2) != 0 ? null : softReference2;
        softReference3 = (i & 4) != 0 ? null : softReference3;
        this.f181788d = softReference;
        this.f181789e = softReference2;
        this.f181790f = softReference3;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r7 = this;
            java.lang.ref.SoftReference<qj1.c> r0 = r7.f181789e
            r1 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.get()
            qj1.c r0 = (qj1.C62660c) r0
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            java.lang.ref.SoftReference<android.view.ViewGroup> r2 = r7.f181790f
            if (r2 == 0) goto L_0x0018
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x0019
        L_0x0018:
            r2 = r1
        L_0x0019:
            if (r0 == 0) goto L_0x0082
            if (r2 == 0) goto L_0x0082
            boolean r0 = r0.mo87688G0()
            if (r0 == 0) goto L_0x0044
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r7)
            sp1.o0 r0 = sp1.C64107n0.f181767k
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "watchShoppingEntrancePosition removeOnGlobalLayoutListener:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveVisitorShoppingEntranceWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x0044:
            java.lang.ref.SoftReference<sp1.n0> r0 = r7.f181788d
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r0.get()
            sp1.n0 r0 = (sp1.C64107n0) r0
            if (r0 == 0) goto L_0x0082
            boolean r2 = r0.f181771d
            if (r2 == 0) goto L_0x0082
            org.libpag.PAGView r2 = r0.f181772e
            if (r2 == 0) goto L_0x0082
            float[] r0 = r0.mo88857h()
            r3 = 0
            r4 = r0[r3]
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0082
            r4 = 1
            r6 = r0[r4]
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0082
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r5 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0076
            r1 = r2
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x0076:
            if (r1 == 0) goto L_0x0082
            r2 = r0[r3]
            int r2 = (int) r2
            r1.leftMargin = r2
            r0 = r0[r4]
            int r0 = (int) r0
            r1.topMargin = r0
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sp1.C64117o0.onGlobalLayout():void");
    }
}
