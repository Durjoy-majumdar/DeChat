package c01;

import a01.C27724a;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.vfs.C86015s1;
import fy3.C32224a;
import fy3.C32226l;
import p375qh.C110390f;
import rx3.C13598b0;

/* renamed from: c01.a */
public final class C104207a {

    /* renamed from: a */
    public C27724a f308491a;

    /* renamed from: b */
    public C32226l<? super byte[], C13598b0> f308492b;

    /* renamed from: c */
    public MMHandler f308493c = new MMHandler(this.f308494d.getLooper());

    /* renamed from: d */
    public HandlerThread f308494d;

    /* renamed from: e */
    public C86015s1 f308495e;

    /* renamed from: f */
    public C110390f f308496f;

    /* renamed from: c01.a$a */
    public static final class C104208a implements C110390f.C89659b {

        /* renamed from: a */
        public final /* synthetic */ C104207a f308497a;

        public C104208a(C104207a aVar) {
            this.f308497a = aVar;
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            if (bArr != null) {
                C104207a aVar = this.f308497a;
                aVar.getClass();
                try {
                    C32226l<? super byte[], C13598b0> lVar = aVar.f308492b;
                    if (lVar != null) {
                        lVar.invoke(bArr);
                    }
                    C86015s1 s1Var = aVar.f308495e;
                    if (s1Var != null) {
                        s1Var.write(bArr);
                    }
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.ScreenCastAudioEncoder", "error write to local");
                }
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
            Log.m105920e("MicroMsg.ScreenCastAudioEncoder", "onRecError state is in " + i);
        }
    }

    /* renamed from: c01.a$b */
    public static final class C104209b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f308498d;

        public C104209b(C32224a aVar) {
            this.f308498d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f308498d.invoke();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104207a(a01.C27724a r5, fy3.C32226l<? super byte[], rx3.C13598b0> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "audioConfig"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r6, r0)
            r4.<init>()
            r4.f308491a = r5
            r4.f308492b = r6
            android.os.HandlerThread r5 = new android.os.HandlerThread
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "MicroMsg.ScreenCastAudioEncoder"
            r6.append(r0)
            int r0 = r4.hashCode()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            r4.f308494d = r5
            r5.start()
            com.tencent.mm.sdk.platformtools.MMHandler r5 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.HandlerThread r6 = r4.f308494d
            android.os.Looper r6 = r6.getLooper()
            r5.<init>((android.os.Looper) r6)
            r4.f308493c = r5
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_finder_screec_cast_pc_debug
            java.lang.Class<h81.h> r6 = h81.C32735h.class
            gj.m r0 = p156gj.C107835h0.f322856m
            int r0 = r0.f322866F
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x005c
            if (r0 == r2) goto L_0x005a
            r1 = 2
            if (r0 == r1) goto L_0x0070
            di3.d r6 = di3.C86312j.m106911c(r6)
            h81.h r6 = (h81.C32735h) r6
            boolean r5 = r6.mo58784wf(r5, r3)
            goto L_0x0071
        L_0x005a:
            r5 = 1
            goto L_0x0071
        L_0x005c:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0070
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0065
            goto L_0x0070
        L_0x0065:
            di3.d r6 = di3.C86312j.m106911c(r6)
            h81.h r6 = (h81.C32735h) r6
            boolean r5 = r6.mo58784wf(r5, r3)
            goto L_0x0071
        L_0x0070:
            r5 = 0
        L_0x0071:
            if (r5 == 0) goto L_0x00e6
            java.lang.String r5 = "/sdcard/ScreenCastDebug"
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            r6 = 0
            java.lang.String r0 = r5.getPath()
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163855k(r0, r3, r3)
            java.lang.String r1 = r5.getPath()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x009a
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r0)
            android.net.Uri r5 = r5.build()
        L_0x009a:
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r6 = r0.mo177799l(r5, r6)
            boolean r0 = r6.mo177810a()
            if (r0 != 0) goto L_0x00a7
            goto L_0x00af
        L_0x00a7:
            com.tencent.mm.vfs.FileSystem$c r0 = r6.f348991a
            java.lang.String r1 = r6.f348992b
            boolean r3 = r0.mo119948x(r1)
        L_0x00af:
            if (r3 != 0) goto L_0x00c5
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r5 = r0.mo177799l(r5, r6)
            boolean r6 = r5.mo177810a()
            if (r6 != 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            r6.mo119937g(r5)
        L_0x00c5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "/sdcard/ScreenCastDebug/audio_"
            r5.append(r6)
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r5.append(r0)
            java.lang.String r6 = ".pcm"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mm.vfs.s1 r6 = new com.tencent.mm.vfs.s1
            r6.<init>((java.lang.String) r5)
            r4.f308495e = r6
        L_0x00e6:
            a01.a r5 = r4.f308491a
            int r6 = r5.f76742b
            int r5 = r5.f76743c
            qh.f r0 = new qh.f
            r1 = 9
            r0.<init>(r6, r5, r1)
            r4.f308496f = r0
            r0.mo161900e(r2)
            qh.f r5 = r4.f308496f
            if (r5 == 0) goto L_0x0100
            r6 = -19
            r5.f330234m = r6
        L_0x0100:
            if (r5 == 0) goto L_0x0109
            c01.a$a r6 = new c01.a$a
            r6.<init>(r4)
            r5.f330245x = r6
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.C104207a.<init>(a01.a, fy3.l):void");
    }
}
