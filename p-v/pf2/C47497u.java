package pf2;

import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import p565ir.C60606n;
import te3.C52257zg;

/* renamed from: pf2.u */
public final class C47497u implements C60606n.C60609c {

    /* renamed from: a */
    public final /* synthetic */ C47499w f127429a;

    /* renamed from: b */
    public final /* synthetic */ C52257zg f127430b;

    /* renamed from: c */
    public final /* synthetic */ TextView f127431c;

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOnliveWidget f127432d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveOnliveWidget f127433e;

    /* renamed from: f */
    public final /* synthetic */ TextView f127434f;

    public C47497u(C47499w wVar, C52257zg zgVar, TextView textView, FinderLiveOnliveWidget finderLiveOnliveWidget, FinderLiveOnliveWidget finderLiveOnliveWidget2, TextView textView2) {
        this.f127429a = wVar;
        this.f127430b = zgVar;
        this.f127431c = textView;
        this.f127432d = finderLiveOnliveWidget;
        this.f127433e = finderLiveOnliveWidget2;
        this.f127434f = textView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r4 = (te3.C51713vn0) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLiveStatusCallback(long r4, int r6, java.lang.Object r7) {
        /*
            r3 = this;
            r0 = 0
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0010
            pf2.w r4 = r3.f127429a
            java.lang.String r4 = r4.f127442C
            java.lang.String r5 = "query fail, liveId = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
        L_0x0010:
            te3.zg r4 = r3.f127430b
            java.lang.String r4 = r4.f145868f
            android.widget.TextView r5 = r3.f127431c
            r6 = 2131299367(0x7f090c27, float:1.8216733E38)
            java.lang.Object r5 = r5.getTag(r6)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002e
            pf2.w r4 = r3.f127429a
            java.lang.String r4 = r4.f127442C
            java.lang.String r5 = "recycled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            return
        L_0x002e:
            if (r7 == 0) goto L_0x0061
            boolean r4 = r7 instanceof te3.C51713vn0
            if (r4 == 0) goto L_0x0061
            r4 = r7
            te3.vn0 r4 = (te3.C51713vn0) r4
            te3.c21 r5 = r4.f143572d
            if (r5 == 0) goto L_0x0061
            sj3.p r6 = sj3.C63941p.f181254a
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r0 = r3.f127432d
            java.lang.String r1 = "liveOnIcon"
            gy3.C87412m.m108593f(r0, r1)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r1 = r3.f127433e
            java.lang.String r2 = "liveEndIcon"
            gy3.C87412m.m108593f(r1, r2)
            r6.mo88711i(r5, r0, r1)
            java.lang.Class<ex0.d> r5 = ex0.C45696d.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            ex0.d r5 = (ex0.C45696d) r5
            te3.zg r6 = r3.f127430b
            java.lang.String r6 = r6.f145868f
            te3.c21 r4 = r4.f143572d
            r5.Ks0(r6, r4)
        L_0x0061:
            java.lang.String r4 = ""
            if (r7 == 0) goto L_0x0079
            boolean r5 = r7 instanceof te3.C51713vn0
            if (r5 == 0) goto L_0x0079
            te3.vn0 r7 = (te3.C51713vn0) r7
            java.lang.String r5 = r7.f143575g
            boolean r5 = sf0.C77702q0.m93719b(r5)
            if (r5 == 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            java.lang.String r4 = r7.f143575g
            gy3.C87412m.m108591d(r4)
        L_0x0079:
            boolean r5 = sf0.C77702q0.m93719b(r4)
            if (r5 != 0) goto L_0x008b
            android.widget.TextView r5 = r3.f127434f
            r5.setText(r4)
            android.widget.TextView r4 = r3.f127434f
            r5 = 0
            r4.setVisibility(r5)
            goto L_0x0092
        L_0x008b:
            android.widget.TextView r4 = r3.f127434f
            r5 = 8
            r4.setVisibility(r5)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf2.C47497u.onLiveStatusCallback(long, int, java.lang.Object):void");
    }
}
