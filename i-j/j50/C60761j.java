package j50;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.trtc.TRTCCloudDef;
import fy3.C32226l;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: j50.j */
public final class C60761j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173078d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceTexture f173079e;

    /* renamed from: j50.j$a */
    public static final class C60762a extends C87413o implements C32226l<C110194c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60762a(C60735a aVar) {
            super(1);
            this.f173080d = aVar;
        }

        public Object invoke(Object obj) {
            C110194c cVar = (C110194c) obj;
            C60735a aVar = this.f173080d;
            if (!aVar.f172990B) {
                Log.m105924i("MicroMsg.LiveCore", "skip sendCustomVideoData by isPushing:" + this.f173080d.f172990B);
            } else if (aVar.f172989A.f166264k) {
                Log.m105924i("MicroMsg.LiveCore", "skip sendCustomVideoData by isDocMode:" + this.f173080d.f172989A.f166264k);
                C60735a.m71076L(this.f173080d);
            } else if (cVar != null) {
                aVar.f173027n.eglContext14 = aVar.f173031q.getEGLContext();
                TRTCCloudDef.TRTCTexture tRTCTexture = aVar.f173027n;
                tRTCTexture.textureId = cVar.f329652e;
                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = aVar.f173026j;
                tRTCVideoFrame.texture = tRTCTexture;
                tRTCVideoFrame.width = cVar.f329657j;
                tRTCVideoFrame.height = cVar.f329658n;
                tRTCVideoFrame.pixelFormat = 2;
                tRTCVideoFrame.bufferType = 3;
                aVar.mo85679W().sendCustomVideoData(aVar.f173026j);
            }
            return C13598b0.f38549a;
        }
    }

    public C60761j(C60735a aVar, SurfaceTexture surfaceTexture) {
        this.f173078d = aVar;
        this.f173079e = surfaceTexture;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r1 = r1.f166253d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            j50.a r0 = r5.f173078d
            int r0 = j50.C60735a.m71075K(r0)
            j50.a r1 = r5.f173078d
            y80.g r2 = r1.f173034t
            r3 = 0
            if (r2 == 0) goto L_0x001e
            android.graphics.SurfaceTexture r4 = r5.f173079e
            d50.h r1 = r1.f173042z
            if (r1 == 0) goto L_0x001a
            d50.f r1 = r1.f166253d
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.f166228c
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            r2.mo143169h(r4, r1, r0)
        L_0x001e:
            j50.a r1 = r5.f173078d
            y80.g r1 = r1.f173034t
            r2 = 1
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.mo164109B()
            if (r1 != r2) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            java.lang.String r1 = "MicroMsg.LiveCore"
            if (r2 == 0) goto L_0x00a3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "start preview success, mirrorMode:"
            r2.append(r4)
            j50.a r4 = r5.f173078d
            s50.k r4 = r4.f173031q
            s50.u r4 = r4.f331238j
            if (r4 == 0) goto L_0x0047
            int r4 = r4.f331284N
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            r2.append(r4)
            java.lang.String r4 = " resolution:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            k50.a r0 = k50.C60971a.C60973b.f173670a
            m50.b r0 = r0.mo85945b()
            j50.a r1 = r5.f173078d
            y80.g r1 = r1.f173034t
            if (r1 == 0) goto L_0x006a
            int r3 = r1.mo143180s()
        L_0x006a:
            r0.f174704a = r3
            j50.a r0 = r5.f173078d
            s50.k r1 = r0.f173031q
            y80.g r0 = r0.f173034t
            r2 = 0
            if (r0 == 0) goto L_0x007a
            y80.b r0 = r0.mo143174m()
            goto L_0x007b
        L_0x007a:
            r0 = r2
        L_0x007b:
            gy3.C87412m.m108591d(r0)
            r1.mo148310m(r0)
            j50.a r0 = r5.f173078d
            y80.g r1 = r0.f173034t
            if (r1 == 0) goto L_0x0093
            y80.b r1 = r1.mo143174m()
            if (r1 == 0) goto L_0x0093
            boolean r1 = y80.C66557b.f191420g
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
        L_0x0093:
            r0.mo85675Q(r2)
            j50.a r0 = r5.f173078d
            s50.k r1 = r0.f173031q
            j50.j$a r2 = new j50.j$a
            r2.<init>(r0)
            r1.setOnDrawListener(r2)
            goto L_0x00a9
        L_0x00a3:
            java.lang.String r0 = "start preview fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.C60761j.run():void");
    }
}
