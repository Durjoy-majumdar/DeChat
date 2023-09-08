package xj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import xj0.C91237o;

/* renamed from: xj0.p */
public class C91245p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91248r f261829d;

    /* renamed from: xj0.p$a */
    public class C91246a implements C91216b0<String> {
        public C91246a() {
        }

        /* renamed from: a */
        public void mo123718a(int i, int i2, String str, Object obj) {
            String str2 = (String) obj;
            if (i == 0 && i2 == 0) {
                C91248r rVar = C91245p.this.f261829d;
                C91237o oVar = rVar.f261835h;
                oVar.f261809d = C91237o.C91243f.Running;
                C91214a0 a0Var = rVar.f261832e;
                oVar.f261810e = a0Var.f261755c;
                oVar.f261811f = a0Var.f261756d;
                C91220f fVar = (C91220f) oVar.f261807b;
                synchronized (fVar) {
                    fVar.f261769d = null;
                }
                C91248r rVar2 = C91245p.this.f261829d;
                C91215b bVar = rVar2.f261835h.f261807b;
                C91237o.C91240c cVar = rVar2.f261833f;
                C91220f fVar2 = (C91220f) bVar;
                synchronized (fVar2) {
                    fVar2.f261769d = cVar;
                }
                C91245p.this.f261829d.f261831d.mo123718a(0, 0, "ok", null);
                return;
            }
            Log.m105928w("MicroMsg.GameRecorderMgr", "hy: start record failed!");
            C91245p.this.f261829d.f261831d.mo123718a(i, i2, str, "");
        }
    }

    public C91245p(C91248r rVar) {
        this.f261829d = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r1 = r18
            xj0.r r0 = r1.f261829d
            xj0.o r2 = r0.f261835h
            xj0.o$f r3 = r2.f261809d
            xj0.o$f r4 = xj0.C91237o.C91243f.Running
            java.lang.String r5 = "MicroMsg.GameRecorderMgr"
            r6 = 0
            r7 = 2
            if (r3 != r4) goto L_0x0021
            java.lang.String r0 = "hy: already running!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            xj0.r r0 = r1.f261829d
            xj0.b0 r0 = r0.f261831d
            r2 = 103(0x67, float:1.44E-43)
            java.lang.String r3 = "already started"
            r0.mo123718a(r7, r2, r3, r6)
            return
        L_0x0021:
            xj0.o$f r4 = xj0.C91237o.C91243f.Paused
            if (r3 != r4) goto L_0x0036
            java.lang.String r0 = "hy: currently paused. fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            xj0.r r0 = r1.f261829d
            xj0.b0 r0 = r0.f261831d
            r2 = 104(0x68, float:1.46E-43)
            java.lang.String r3 = "currently paused. please call resume"
            r0.mo123718a(r7, r2, r3, r6)
            return
        L_0x0036:
            xj0.o$f r4 = xj0.C91237o.C91243f.NotInit
            if (r3 != r4) goto L_0x003e
            xj0.o$f r3 = xj0.C91237o.C91243f.Inited
            r2.f261809d = r3
        L_0x003e:
            xj0.a0 r2 = r0.f261832e
            xj0.b0 r0 = r0.f261831d
            xj0.z r3 = r2.f261755c
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x00ef
            sj0.b$b r3 = (sj0.C90203b.C90205b) r3
            java.lang.String r3 = r3.f258967a
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0054
            goto L_0x00ef
        L_0x0054:
            int r3 = r2.f261758f
            if (r3 <= 0) goto L_0x00db
            r8 = 100000000(0x5f5e100, float:2.3122341E-35)
            if (r3 < r8) goto L_0x005f
            goto L_0x00db
        L_0x005f:
            int r3 = r2.f261757e
            if (r3 <= 0) goto L_0x00c7
            r8 = 60
            if (r3 <= r8) goto L_0x0068
            goto L_0x00c7
        L_0x0068:
            int r3 = r2.f261759g
            if (r3 > 0) goto L_0x0081
            r2 = 108(0x6c, float:1.51E-43)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8[r5] = r3
            java.lang.String r3 = "invalid gop: %d"
            java.lang.String r3 = java.lang.String.format(r3, r8)
            r0.mo123718a(r7, r2, r3, r6)
            goto L_0x00f6
        L_0x0081:
            int r3 = r2.f261754b
            if (r3 <= 0) goto L_0x00a9
            int r3 = r2.f261753a
            if (r3 > 0) goto L_0x008a
            goto L_0x00a9
        L_0x008a:
            int r2 = r2.f261760h
            if (r2 <= 0) goto L_0x0095
            r3 = 7200(0x1c20, float:1.009E-41)
            if (r2 <= r3) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r0 = 1
            goto L_0x00f7
        L_0x0095:
            r3 = 101(0x65, float:1.42E-43)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = "invalid duration: %d"
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r0.mo123718a(r7, r3, r2, r6)
            goto L_0x00f6
        L_0x00a9:
            r3 = 109(0x6d, float:1.53E-43)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            int r9 = r2.f261753a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r5] = r9
            int r2 = r2.f261754b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r4] = r2
            java.lang.String r2 = "invalid size : %d * %d"
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r0.mo123718a(r7, r3, r2, r6)
            goto L_0x00f6
        L_0x00c7:
            r2 = 107(0x6b, float:1.5E-43)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8[r5] = r3
            java.lang.String r3 = "invalid fps: %d"
            java.lang.String r3 = java.lang.String.format(r3, r8)
            r0.mo123718a(r7, r2, r3, r6)
            goto L_0x00f6
        L_0x00db:
            r2 = 106(0x6a, float:1.49E-43)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8[r5] = r3
            java.lang.String r3 = "invalid bitrate: %d"
            java.lang.String r3 = java.lang.String.format(r3, r8)
            r0.mo123718a(r7, r2, r3, r6)
            goto L_0x00f6
        L_0x00ef:
            r2 = 105(0x69, float:1.47E-43)
            java.lang.String r3 = "not provide file path"
            r0.mo123718a(r7, r2, r3, r6)
        L_0x00f6:
            r0 = 0
        L_0x00f7:
            if (r0 != 0) goto L_0x00fa
            return
        L_0x00fa:
            xj0.r r0 = r1.f261829d
            xj0.o r2 = r0.f261835h
            xj0.b r2 = r2.f261807b
            xj0.a0 r0 = r0.f261832e
            xj0.p$a r3 = new xj0.p$a
            r3.<init>()
            xj0.f r2 = (xj0.C91220f) r2
            java.lang.ref.WeakReference<com.tencent.magicbrush.ui.MagicBrushView> r6 = r2.f261763b
            java.lang.Object r6 = r6.get()
            com.tencent.magicbrush.ui.MagicBrushView r6 = (com.tencent.magicbrush.p941ui.MagicBrushView) r6
            r8 = 111(0x6f, float:1.56E-43)
            java.lang.String r9 = ""
            if (r6 != 0) goto L_0x011e
            java.lang.String r0 = "magic brush view not found"
            r3.mo123718a(r4, r8, r0, r9)
            goto L_0x027c
        L_0x011e:
            com.tencent.magicbrush.ui.MagicBrushView$b r6 = r6.getRendererView()
            vj0.f r6 = (vj0.C90807f) r6
            if (r6 != 0) goto L_0x012e
            java.lang.String r0 = "texture view not found"
            r3.mo123718a(r4, r8, r0, r9)
            goto L_0x027c
        L_0x012e:
            boolean r10 = r6.isAvailable()
            if (r10 != 0) goto L_0x013a
            java.lang.String r10 = "view not prepared"
            r3.mo123718a(r4, r8, r10, r9)
        L_0x013a:
            com.tencent.mm.modelcontrol.VideoTransPara r8 = new com.tencent.mm.modelcontrol.VideoTransPara
            r8.<init>()
            r2.f261770e = r8
            int r10 = r0.f261758f
            r8.f267169g = r10
            int r10 = r0.f261753a
            r8.f267166d = r10
            int r10 = r0.f261754b
            r8.f267167e = r10
            int r10 = r0.f261757e
            r8.f267168f = r10
            int r10 = r0.f261759g
            r8.f267172j = r10
            r8.f267177r = r4
            r8.f267176q = r7
            int r10 = r0.f261760h
            r8.f267170h = r10
            r10 = 64000(0xfa00, float:8.9683E-41)
            r8.f267173n = r10
            r10 = 44100(0xac44, float:6.1797E-41)
            r8.f267174o = r10
            r8.f267175p = r7
            r11 = 200(0xc8, float:2.8E-43)
            r8.f267179t = r11
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r5] = r8
            java.lang.String r8 = "MicroMsg.BaseGameRecord.HardwareMgrImp"
            java.lang.String r12 = "hy: record param is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r11)
            java.lang.Class<eu.f> r11 = p509eu.C86681f.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            r12 = r11
            eu.f r12 = (p509eu.C86681f) r12
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r2.f261770e
            s80.a r14 = r6.getAbsSurfaceRenderer()
            android.opengl.EGLContext r15 = r6.getEGLContext()
            int r16 = r6.getPreviewTextureId()
            xj0.c r11 = new xj0.c
            r11.<init>(r2)
            r17 = r11
            m90.b r11 = r12.Kk0(r13, r14, r15, r16, r17)
            r2.f261768c = r11
            xj0.z r11 = r0.f261755c
            if (r11 != 0) goto L_0x01a2
            goto L_0x027c
        L_0x01a2:
            xj0.z r11 = r0.f261756d
            if (r11 != 0) goto L_0x01a8
            goto L_0x027c
        L_0x01a8:
            java.lang.String r11 = "hy: can not get current bitmap! just a hint"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r11)
            m90.b r11 = r2.f261768c
            r11.mo159629w(r4)
            m90.b r11 = r2.f261768c
            int r12 = r6.getSurfaceWidth()
            int r13 = r6.getSurfaceHeight()
            com.tencent.mm.modelcontrol.VideoTransPara r14 = r2.f261770e
            int r15 = r14.f267166d
            int r14 = r14.f267167e
            r11.mo159612i(r12, r13, r15, r14)
            m90.b r11 = r2.f261768c
            xj0.z r12 = r0.f261755c
            sj0.b$b r12 = (sj0.C90203b.C90205b) r12
            java.lang.String r12 = r12.f258967a
            r11.mo159615m(r12)
            m90.b r11 = r2.f261768c
            r11.mo159618p(r5)
            m90.b r11 = r2.f261768c
            int r11 = r11.mo159632z(r5, r5, r5)
            if (r11 == 0) goto L_0x01f2
            r0 = 110(0x6e, float:1.54E-43)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r2[r5] = r6
            java.lang.String r5 = "media recoder start failed: %d"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r3.mo123718a(r4, r0, r2, r9)
            goto L_0x027c
        L_0x01f2:
            m90.b r11 = r2.f261768c
            r11.mo123150l(r4)
            m90.b r11 = r2.f261768c
            boolean r12 = r0.f261761i
            r12 = r12 ^ r4
            r11.setMute(r12)
            boolean r0 = r0.f261761i
            if (r0 == 0) goto L_0x026a
            yj0.c r0 = new yj0.c
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.i2> r11 = r2.f261762a
            java.lang.Object r11 = r11.get()
            com.tencent.mm.plugin.appbrand.i2 r11 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r11
            r0.<init>(r11)
            r2.f261771f = r0
            m90.b r11 = r2.f261768c
            qh.b r11 = r11.mo159626t()
            r0.f262224l = r11
            yj0.c r11 = r2.f261771f
            r11.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "start, mIsStopped: "
            r0.append(r12)
            boolean r12 = r11.mo125403b()
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r12 = "MicroMsg.GameRecordAudioLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            boolean r0 = r11.mo125403b()
            if (r0 != 0) goto L_0x0241
            goto L_0x026a
        L_0x0241:
            monitor-enter(r11)
            r11.f262226n = r5     // Catch:{ all -> 0x0266 }
            monitor-exit(r11)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r12 = android.provider.Settings.System.CONTENT_URI
            yj0.c$c r13 = r11.f262219g
            r0.registerContentObserver(r12, r4, r13)
            yj0.a r0 = r11.f262215c
            r0.mo125395b(r10, r7)
            android.media.AudioManager r0 = r11.f262216d
            r4 = 3
            int r0 = r0.getStreamVolume(r4)
            r11.f262218f = r0
            r11.mo125405d()
            goto L_0x026a
        L_0x0266:
            r0 = move-exception
            r2 = r0
            monitor-exit(r11)
            throw r2
        L_0x026a:
            xj0.d r0 = new xj0.d
            r0.<init>(r2)
            r6.setOnTextureDrawFinishDelegate(r0)
            java.lang.String r0 = "hy: start succ!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = "ok"
            r3.mo123718a(r5, r5, r0, r9)
        L_0x027c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xj0.C91245p.run():void");
    }
}
