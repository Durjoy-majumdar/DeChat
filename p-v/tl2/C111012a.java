package tl2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import tl2.C111016c;

/* renamed from: tl2.a */
public abstract class C111012a implements C111019e {

    /* renamed from: o */
    public static final C111013a f332469o = new C111013a();

    /* renamed from: p */
    public static final ArrayList<C111016c> f332470p = new ArrayList<>();

    /* renamed from: d */
    public final Context f332471d;

    /* renamed from: e */
    public final C111018d f332472e;

    /* renamed from: f */
    public long f332473f = 700;

    /* renamed from: g */
    public HashSet<C111016c> f332474g = new HashSet<>();

    /* renamed from: h */
    public int f332475h;

    /* renamed from: i */
    public int f332476i;

    /* renamed from: j */
    public boolean f332477j;

    /* renamed from: n */
    public C111014b f332478n = new C111014b(this);

    /* renamed from: tl2.a$a */
    public static final class C111013a {
    }

    /* renamed from: tl2.a$b */
    public static final class C111014b implements C111016c.C111017a {

        /* renamed from: a */
        public final /* synthetic */ C111012a f332479a;

        public C111014b(C111012a aVar) {
            this.f332479a = aVar;
        }

        /* renamed from: a */
        public void mo162697a(C111016c cVar) {
            Log.m105927v("MicroMsg.BaseScanDotsAnimationController", "alvinluo dotsGroupSet remove isStoping: %b", Boolean.valueOf(this.f332479a.f332477j));
            C111012a aVar = this.f332479a;
            if (!aVar.f332477j) {
                C24564k0.m30737a(aVar.f332474g).remove(cVar);
            }
        }

        public void onAnimationStart() {
        }
    }

    public C111012a(Context context, C111018d dVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(dVar, "scanAnimationDotsView");
        this.f332471d = context;
        this.f332472e = dVar;
    }

    /* renamed from: a */
    public void mo151668a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo162696b(com.tencent.p014mm.plugin.scanner.model.C106084y0 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "pointsResult"
            gy3.C87412m.m108594g(r12, r0)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r12.f315844b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.BaseScanDotsAnimationController"
            java.lang.String r4 = "alvinluo addAnimationDots size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r4, r1)
            tl2.a$a r1 = f332469o
            android.content.Context r4 = r11.f332471d
            long r5 = r11.f332473f
            tl2.d r7 = r11.f332472e
            r1.getClass()
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r4, r1)
            java.lang.String r1 = "scanAnimationDotsView"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.util.ArrayList<tl2.c> r8 = f332470p
            int r9 = r8.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r3] = r9
            java.lang.String r9 = "alvinluo obtain recycledViewList: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r9, r1)
            java.util.Iterator r1 = r8.iterator()
        L_0x0046:
            boolean r8 = r1.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x005a
            java.lang.Object r8 = r1.next()
            tl2.c r8 = (tl2.C111016c) r8
            boolean r10 = r8.mo162699a()
            if (r10 != 0) goto L_0x0046
            goto L_0x005b
        L_0x005a:
            r8 = r9
        L_0x005b:
            if (r8 != 0) goto L_0x0083
            java.util.ArrayList<tl2.c> r1 = f332470p
            int r8 = r1.size()
            r10 = 10
            if (r8 >= r10) goto L_0x0070
            tl2.f r8 = new tl2.f
            r8.<init>(r4, r7)
            r1.add(r8)
            goto L_0x0083
        L_0x0070:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r3] = r1
            java.lang.String r1 = "alvinluo recycledViewList exceed max size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r4)
            r8 = r9
            goto L_0x008b
        L_0x0083:
            r8.setDuration(r5)
            java.lang.String r1 = "alvinluo obtain return new view"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r1)
        L_0x008b:
            if (r8 == 0) goto L_0x00a6
            com.tencent.mm.plugin.scanner.model.ScanPoint[] r1 = r12.f315843a
            if (r1 == 0) goto L_0x0099
            gy3.C87412m.m108591d(r1)
            int r12 = r12.f315844b
            r8.mo162700b(r1, r12)
        L_0x0099:
            int r12 = r11.f332475h
            int r1 = r11.f332476i
            r8.mo162702d(r12, r1, r0)
            tl2.a$b r12 = r11.f332478n
            r8.mo162701c(r12)
            r9 = r8
        L_0x00a6:
            if (r9 == 0) goto L_0x00c1
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.util.HashSet<tl2.c> r0 = r11.f332474g
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r3] = r0
            java.lang.String r0 = "alvinluo addAnimationDotsGroup dotsGroupSet size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r0, r12)
            java.util.HashSet<tl2.c> r12 = r11.f332474g
            r12.add(r9)
            goto L_0x00c6
        L_0x00c1:
            java.lang.String r12 = "alvinluo addAnimationDotsGroup group obtain failed and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r12)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl2.C111012a.mo162696b(com.tencent.mm.plugin.scanner.model.y0):void");
    }

    public void stopAnimation() {
        this.f332477j = true;
        for (C111016c stopAnimation : this.f332474g) {
            stopAnimation.stopAnimation();
        }
        this.f332474g.clear();
        this.f332477j = false;
    }
}
