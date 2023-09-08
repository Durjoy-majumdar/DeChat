package gr1;

import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gr1.x1 */
public final class C59687x1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f170510d;

    /* renamed from: e */
    public final /* synthetic */ long f170511e;

    /* renamed from: f */
    public final /* synthetic */ boolean f170512f;

    /* renamed from: g */
    public final /* synthetic */ int f170513g;

    /* renamed from: h */
    public final /* synthetic */ float f170514h;

    /* renamed from: i */
    public final /* synthetic */ ITPPlayerListener.IOnSeekCompleteListener f170515i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59687x1(FinderVideoLayout finderVideoLayout, long j, boolean z, int i, float f, ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        super(0);
        this.f170510d = finderVideoLayout;
        this.f170511e = j;
        this.f170512f = z;
        this.f170513g = i;
        this.f170514h = f;
        this.f170515i = iOnSeekCompleteListener;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [gr1.o2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r7.f170510d
            gr1.o2 r0 = r0.getVideoView()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            r1 = 0
            if (r0 == 0) goto L_0x002f
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r7.f170510d
            gr1.o2 r0 = r0.getVideoView()
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r2 == 0) goto L_0x0018
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r0
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            if (r0 == 0) goto L_0x004d
            com.tencent.thumbplayer.api.ITPPlayerListener$IOnSeekCompleteListener r2 = r7.f170515i
            long r3 = r7.f170511e
            boolean r5 = r7.f170512f
            int r6 = r7.f170513g
            r0.setOnSeekCompleteListener(r2)
            boolean r0 = r0.mo79450W(r3, r5, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x004e
        L_0x002f:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r7.f170510d
            gr1.o2 r0 = r0.getVideoView()
            if (r0 == 0) goto L_0x004d
            long r2 = r7.f170511e
            double r2 = (double) r2
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r4
            boolean r4 = r7.f170512f
            int r5 = r7.f170513g
            boolean r0 = r0.mo51233x(r2, r4, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 != 0) goto L_0x0065
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r7.f170510d
            long r1 = r7.f170511e
            r0.f161865V = r1
            int r1 = r7.f170513g
            r0.f161866W = r1
            float r1 = r7.f170514h
            r0.f161877p0 = r1
            goto L_0x008b
        L_0x0065:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r7.f170510d
            gr1.o2 r0 = r0.getVideoView()
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r2 == 0) goto L_0x0072
            r1 = r0
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r1
        L_0x0072:
            if (r1 == 0) goto L_0x0079
            float r0 = r7.f170514h
            r1.setPlaySpeed(r0)
        L_0x0079:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r7.f170510d
            he1.v r0 = r0.getBulletLifecycle()
            if (r0 == 0) goto L_0x008b
            long r1 = r7.f170511e
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r1 = r1 / r3
            int r2 = (int) r1
            r0.mo84824a(r2)
        L_0x008b:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C59687x1.invoke():java.lang.Object");
    }
}
