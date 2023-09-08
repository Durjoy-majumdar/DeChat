package lz1;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import p635os.C89291d;
import zt3.C119143b;
import zt3.C119157j;

@C86522b(dependencies = {C89291d.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: lz1.j */
public final class C88684j extends C86301e implements C34451m {

    /* renamed from: g */
    public static boolean f256034g = true;

    /* renamed from: d */
    public final C119143b f256035d = ((C119157j) C119157j.f356862d).mo183883n("gamelive_audio_mix_ipc_main");

    /* renamed from: e */
    public volatile boolean f256036e;

    /* renamed from: f */
    public final Runnable f256037f = new C88685a(this);

    /* renamed from: lz1.j$a */
    public static final class C88685a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88684j f256038d;

        public C88685a(C88684j jVar) {
            this.f256038d = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                lz1.j r0 = r13.f256038d
                r1 = 0
                r0.f256036e = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "MicroMsgGameLiveAudio"
                r0.append(r2)
                f40.e r2 = f40.C86709a0.m107523b()
                int r2 = r2.mo121110g()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.nio.charset.Charset r2 = z04.C119027c.f356488a
                byte[] r0 = r0.getBytes(r2)
                java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
                gy3.C87412m.m108593f(r0, r2)
                java.lang.String r0 = p823sg.C90193h.m112878f(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "try connect "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.GameLiveMainAudioMgrService"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                android.net.LocalSocket r2 = new android.net.LocalSocket
                r2.<init>()
                android.net.LocalSocketAddress r4 = new android.net.LocalSocketAddress
                android.net.LocalSocketAddress$Namespace r5 = android.net.LocalSocketAddress.Namespace.ABSTRACT
                r4.<init>(r0, r5)
                java.lang.Class<ir.n> r0 = p565ir.C60606n.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ir.n r0 = (p565ir.C60606n) r0
                r5 = 0
            L_0x005a:
                r11 = 1
                r2.connect(r4)     // Catch:{ IOException -> 0x0113 }
                java.lang.String r6 = "connected"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ IOException -> 0x0113 }
                r4 = 0
                java.io.ObjectInputStream r12 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x008a, all -> 0x0087 }
                java.io.InputStream r5 = r2.getInputStream()     // Catch:{ IOException -> 0x008a, all -> 0x0087 }
                r12.<init>(r5)     // Catch:{ IOException -> 0x008a, all -> 0x0087 }
            L_0x006d:
                java.lang.Object r4 = r12.readUnshared()     // Catch:{ IOException -> 0x0085 }
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.audio.IPCData"
                gy3.C87412m.m108592e(r4, r5)     // Catch:{ IOException -> 0x0085 }
                lz1.n r4 = (lz1.C88687n) r4     // Catch:{ IOException -> 0x0085 }
                byte[] r6 = r4.f256039d     // Catch:{ IOException -> 0x0085 }
                r7 = 44100(0xac44, float:6.1797E-41)
                r8 = 2
                long r9 = r4.f256040e     // Catch:{ IOException -> 0x0085 }
                r5 = r0
                r5.uq0(r6, r7, r8, r9)     // Catch:{ IOException -> 0x0085 }
                goto L_0x006d
            L_0x0085:
                r4 = move-exception
                goto L_0x008d
            L_0x0087:
                r0 = move-exception
                goto L_0x010a
            L_0x008a:
                r5 = move-exception
                r12 = r4
                r4 = r5
            L_0x008d:
                boolean r5 = r4 instanceof java.io.EOFException     // Catch:{ all -> 0x0108 }
                if (r5 == 0) goto L_0x00c7
                boolean r4 = lz1.C88684j.f256034g     // Catch:{ all -> 0x0108 }
                if (r4 == 0) goto L_0x00c0
                lz1.j r4 = r13.f256038d     // Catch:{ all -> 0x0108 }
                boolean r4 = r4.f256036e     // Catch:{ all -> 0x0108 }
                if (r4 != 0) goto L_0x00c0
                java.lang.String r4 = "game crashed!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)     // Catch:{ all -> 0x0108 }
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0108 }
                r0.mo85099wF(r11, r4)     // Catch:{ all -> 0x0108 }
                java.lang.Class<com.tencent.mm.feature.gamelive.GameLiveCommonService> r0 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0108 }
                com.tencent.mm.feature.gamelive.GameLiveCommonService r0 = (com.tencent.p014mm.feature.gamelive.GameLiveCommonService) r0     // Catch:{ all -> 0x0108 }
                com.tencent.mm.feature.gamelive.GameLiveCommonService$a r4 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.C80853a.GameLiveState_Destroy     // Catch:{ all -> 0x0108 }
                r0.Ax0(r4)     // Catch:{ all -> 0x0108 }
                java.lang.Class<kz1.h> r0 = kz1.C88341h.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0108 }
                kz1.h r0 = (kz1.C88341h) r0     // Catch:{ all -> 0x0108 }
                r0.wx0(r1)     // Catch:{ all -> 0x0108 }
            L_0x00c0:
                java.lang.String r0 = "zbqll:eof got, quit"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x0108 }
                goto L_0x00da
            L_0x00c7:
                boolean r0 = r4 instanceof java.io.OptionalDataException     // Catch:{ all -> 0x0108 }
                if (r0 == 0) goto L_0x00d2
                java.lang.String r0 = "zbqll:optional data got, quit"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x0108 }
                goto L_0x00da
            L_0x00d2:
                java.lang.String r0 = "zbqll:read object io exception"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0108 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r4, r0, r1)     // Catch:{ all -> 0x0108 }
            L_0x00da:
                if (r12 == 0) goto L_0x00df
                r12.close()
            L_0x00df:
                r2.close()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "audio task quit "
                r0.append(r1)
                lz1.j r1 = r13.f256038d
                boolean r1 = r1.f256036e
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                lz1.j r0 = r13.f256038d
                boolean r0 = r0.f256036e
                if (r0 == 0) goto L_0x0107
                lz1.j r0 = r13.f256038d
                zt3.b r0 = r0.f256035d
                r0.execute(r13)
            L_0x0107:
                return
            L_0x0108:
                r0 = move-exception
                r4 = r12
            L_0x010a:
                if (r4 == 0) goto L_0x010f
                r4.close()
            L_0x010f:
                r2.close()
                throw r0
            L_0x0113:
                r6 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r1]
                java.lang.String r8 = "connect io exception, retry"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r8, r7)
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r6)
                int r5 = r5 + r11
                if (r5 <= r11) goto L_0x005a
                java.lang.String r0 = "connect fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lz1.C88684j.C88685a.run():void");
        }
    }
}
