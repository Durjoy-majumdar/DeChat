package ma2;

import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.FloatBallHelper;
import com.tencent.p014mm.plugin.music.p080ui.FloatBallMusicLyricView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import la2.C99364n;
import p646pn.C100824i;
import qc0.C101093a;
import qc0.C101106m;
import za2.C102984b;

/* renamed from: ma2.i */
public class C99803i extends FloatBallHelper {

    /* renamed from: n */
    public String f292485n;

    /* renamed from: ma2.i$a */
    public class C99804a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicPlayerEvent f292486d;

        public C99804a(MusicPlayerEvent musicPlayerEvent) {
            this.f292486d = musicPlayerEvent;
        }

        public void run() {
            if (C101093a.m132481c()) {
                Log.m105924i(C99803i.this.f292485n, "delay stop and playing music again");
            } else if (C99803i.this.mo90541w()) {
                BallInfo e0 = C99803i.this.mo149069e0();
                if (e0 == null || !e0.f311680E) {
                    C99803i.this.mo139154E0();
                } else if (e0.f311686d != 23) {
                    C99803i.this.getReportInfo().f311721j = this.f292486d.f9336d.f9337a == 2 ? 10 : 11;
                    C99803i.this.mo68414O();
                    C99803i.this.mo68418k();
                } else {
                    MusicPlayerEvent musicPlayerEvent = this.f292486d;
                    if (musicPlayerEvent.f9336d.f9337a == 7) {
                        C99803i.this.mo139163z0(musicPlayerEvent);
                    } else {
                        C99803i.this.mo139153D0(musicPlayerEvent);
                    }
                }
            }
        }
    }

    /* renamed from: ma2.i$b */
    public static class C99805b {

        /* renamed from: a */
        public static C99803i f292488a = new C99803i("MicroMsg.GlobalMusicFloatBallHelper");
    }

    public C99803i(String str) {
        this.f292485n = str;
        mo35648A(mo139160x0(), "MusicFloatBall");
        if (mo139160x0() == 23) {
            getReportInfo().f311717f = 18;
        } else if (mo139160x0() == 6) {
            getReportInfo().f311717f = 1;
        }
        mo68414O();
    }

    /* renamed from: A0 */
    public void mo139150A0(MusicPlayerEvent musicPlayerEvent, C101106m mVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139151B0(com.tencent.p014mm.autogen.events.MusicPlayerEvent r10) {
        /*
            r9 = this;
            la2.n r0 = la2.C99364n.f291354g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 != 0) goto L_0x0013
            java.lang.String r10 = r9.f292485n
            java.lang.String r0 = "floatBallMusicActionListener don't anything, must init MusicPlayerManager first with MusicLogic before!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            return
        L_0x0013:
            com.tencent.mm.autogen.events.MusicPlayerEvent$a r0 = r10.f9336d
            int r0 = r0.f9337a
            r3 = 2
            if (r0 == 0) goto L_0x007e
            if (r0 == r1) goto L_0x007e
            if (r0 == r3) goto L_0x0072
            r1 = 3
            if (r0 == r1) goto L_0x005a
            r1 = 7
            if (r0 == r1) goto L_0x0072
            r10 = 13
            if (r0 == r10) goto L_0x002e
            r10 = 14
            if (r0 == r10) goto L_0x002e
            goto L_0x01a3
        L_0x002e:
            boolean r10 = r9.mo90541w()
            if (r10 != 0) goto L_0x0036
            goto L_0x01a3
        L_0x0036:
            qc0.m r10 = qc0.C101093a.m132480b()
            java.lang.String r0 = r10.f295962g
            r9.mo67998q0(r0)
            java.lang.String r0 = r10.f295963h
            r9.mo149075o0(r0)
            java.lang.String r0 = r10.f295960e
            java.lang.String r1 = "song_id"
            r9.mo149079t0(r1, r0)
            java.lang.String r0 = za2.C102984b.m136164a(r10)
            java.lang.String r1 = "db_music_id"
            r9.mo149079t0(r1, r0)
            r9.mo139157H0(r10)
            goto L_0x01a3
        L_0x005a:
            boolean r0 = r9.mo90541w()
            if (r0 != 0) goto L_0x0062
            goto L_0x01a3
        L_0x0062:
            qc0.m r0 = qc0.C101093a.m132480b()
            boolean r1 = r9.mo139159w0(r0)
            if (r1 != 0) goto L_0x006d
            return
        L_0x006d:
            r9.mo139150A0(r10, r0)
            goto L_0x01a3
        L_0x0072:
            ma2.i$a r0 = new ma2.i$a
            r0.<init>(r10)
            r1 = 200(0xc8, double:9.9E-322)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
            goto L_0x01a3
        L_0x007e:
            java.lang.Class<vz.f> r0 = p734vz.C90876f.class
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r5 = "phone"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch:{ Exception -> 0x00b5 }
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch:{ Exception -> 0x00b5 }
            if (r4 == 0) goto L_0x00b3
            int r4 = r4.getCallState()     // Catch:{ Exception -> 0x00b5 }
            if (r4 == r1) goto L_0x0099
            if (r4 == r3) goto L_0x0099
            r5 = 0
            goto L_0x009a
        L_0x0099:
            r5 = 1
        L_0x009a:
            java.lang.String r6 = r9.f292485n     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r7 = "isPhoneInUse, isPhoneInUse:%s, callState:%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00b1 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x00b1 }
            r3[r2] = r8     // Catch:{ Exception -> 0x00b1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00b1 }
            r3[r1] = r4     // Catch:{ Exception -> 0x00b1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r3)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00c3
        L_0x00b1:
            r3 = move-exception
            goto L_0x00b7
        L_0x00b3:
            r5 = 0
            goto L_0x00c3
        L_0x00b5:
            r3 = move-exception
            r5 = 0
        L_0x00b7:
            java.lang.String r4 = r9.f292485n
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r6[r2] = r3
            java.lang.String r7 = "isPhoneInUse, exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r7, r6)
        L_0x00c3:
            if (r5 == 0) goto L_0x00d2
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131831439(0x7f112a8f, float:1.9295904E38)
            java.lang.String r0 = r0.getString(r3)
            goto L_0x017f
        L_0x00d2:
            boolean r3 = p182kk.C61104a.m71645a()
            r4 = 2131831442(0x7f112a92, float:1.929591E38)
            if (r3 == 0) goto L_0x00e5
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = r0.getString(r4)
            goto L_0x017f
        L_0x00e5:
            di3.d r3 = di3.C86312j.m106911c(r0)
            vz.f r3 = (p734vz.C90876f) r3
            boolean r3 = r3.mo124867WV()
            if (r3 != 0) goto L_0x0174
            di3.d r3 = di3.C86312j.m106911c(r0)
            vz.f r3 = (p734vz.C90876f) r3
            boolean r3 = r3.mo124868Wj()
            if (r3 != 0) goto L_0x0174
            boolean r3 = p182kk.C61104a.m71644D()
            if (r3 != 0) goto L_0x0174
            boolean r3 = p182kk.C61104a.m71648d()
            if (r3 == 0) goto L_0x010a
            goto L_0x0174
        L_0x010a:
            di3.d r0 = di3.C86312j.m106911c(r0)
            vz.f r0 = (p734vz.C90876f) r0
            boolean r0 = r0.mo124869yj()
            if (r0 != 0) goto L_0x016b
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.s> r0 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s.class
            boolean r3 = di3.C86312j.m106916h(r0)
            if (r3 == 0) goto L_0x0148
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.appbrand.backgroundrunning.s r0 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s) r0
            java.util.List r0 = r0.mo113854fA()
            java.util.Iterator r0 = r0.iterator()
        L_0x012c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0148
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r3 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) r3
            int r3 = r3.f239209f
            r3 = r3 & 4
            if (r3 <= 0) goto L_0x012c
            java.lang.String r0 = r9.f292485n
            java.lang.String r3 = "isAnyAppInVOIP, already exist wxa using VOIP"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r0 = 1
            goto L_0x0149
        L_0x0148:
            r0 = 0
        L_0x0149:
            if (r0 == 0) goto L_0x014c
            goto L_0x016b
        L_0x014c:
            r0 = 0
            boolean r3 = p182kk.C61104a.m71657m(r0, r2, r0)
            if (r3 != 0) goto L_0x015f
            boolean r3 = p182kk.C61104a.m71658n(r0, r2)
            if (r3 != 0) goto L_0x015f
            boolean r3 = p182kk.C61104a.m71662r()
            if (r3 == 0) goto L_0x017f
        L_0x015f:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131831436(0x7f112a8c, float:1.9295898E38)
            java.lang.String r0 = r0.getString(r3)
            goto L_0x017f
        L_0x016b:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = r0.getString(r4)
            goto L_0x017f
        L_0x0174:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131831443(0x7f112a93, float:1.9295912E38)
            java.lang.String r0 = r0.getString(r3)
        L_0x017f:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 == 0) goto L_0x0187
            r1 = 0
            goto L_0x0196
        L_0x0187:
            qc0.C101093a.m132490l()
            zt3.t r2 = zt3.C119157j.f356862d
            ma2.j r3 = new ma2.j
            r3.<init>(r9, r0)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183895z(r3)
        L_0x0196:
            if (r1 == 0) goto L_0x0199
            goto L_0x01a3
        L_0x0199:
            qc0.m r0 = qc0.C101093a.m132480b()
            r9.mo139161y(r0)
            r9.mo139152C0(r10, r0)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma2.C99803i.mo139151B0(com.tencent.mm.autogen.events.MusicPlayerEvent):void");
    }

    /* renamed from: C0 */
    public void mo139152C0(MusicPlayerEvent musicPlayerEvent, C101106m mVar) {
    }

    /* renamed from: D0 */
    public void mo139153D0(MusicPlayerEvent musicPlayerEvent) {
    }

    /* renamed from: E0 */
    public void mo139154E0() {
        mo149078s0(((C100824i) C86312j.m106911c(C100824i.class)).g30(this.f311726d.f311679D, 2));
    }

    /* renamed from: F0 */
    public void mo139155F0(C101106m mVar) {
        if (!mo90541w()) {
            mo149077r0(true);
            mo67998q0(mVar.f295962g);
            mo149075o0(mVar.f295963h);
            mo149079t0("song_id", mVar.f295960e);
            mo149079t0("db_music_id", C102984b.m136164a(mVar));
            mo139156G0(mVar);
            getReportInfo().f311716e = mVar.f295959d;
            mo68414O();
            mo139157H0(mVar);
            mo139158v0(mVar);
        }
    }

    /* renamed from: G0 */
    public void mo139156G0(C101106m mVar) {
        if (!mVar.f295958T) {
            this.f311726d.f311679D = ((C100824i) C86312j.m106911c(C100824i.class)).mo139644ye(this.f311726d.f311679D, 2);
            mo149078s0(this.f311726d.f311679D);
        }
    }

    /* renamed from: H0 */
    public final void mo139157H0(C101106m mVar) {
        if (!mVar.f295958T) {
            BallInfo ballInfo = this.f311726d;
            if (ballInfo.f311691i == null) {
                ballInfo.f311691i = new FloatBallMusicLyricView(MMApplicationContext.getContext(), (AttributeSet) null);
            }
            View view = this.f311726d.f311691i;
            if (view instanceof FloatBallMusicLyricView) {
                ((FloatBallMusicLyricView) view).setMusicWrapper(mVar);
                FloatBallMusicLyricView floatBallMusicLyricView = (FloatBallMusicLyricView) this.f311726d.f311691i;
                floatBallMusicLyricView.f272195h.alive();
                C99364n.m129616h().mo138823b(floatBallMusicLyricView.f272194g);
            }
        }
    }

    /* renamed from: v0 */
    public void mo139158v0(C101106m mVar) {
        if (mVar != null) {
            Log.m105925i(this.f292485n, "addMusicFloatBall isFromNewMusicPlayer: %s", Boolean.valueOf(mVar.f295958T));
            if (!mVar.f295958T) {
                mo68419u();
            }
        }
    }

    /* renamed from: w0 */
    public boolean mo139159w0(C101106m mVar) {
        return !mVar.f295958T && mo139160x0() == 6;
    }

    /* renamed from: x0 */
    public int mo139160x0() {
        return 6;
    }

    /* renamed from: y */
    public void mo139161y(C101106m mVar) {
        boolean z;
        Log.m105924i(this.f292485n, "addFloatBallForMusic");
        if (!mo90541w()) {
            mo149077r0(true);
            z = true;
        } else {
            z = false;
        }
        if (!mo139159w0(mVar)) {
            Log.m105928w(this.f292485n, "can not hand musicPlayerEvent and ignore");
            return;
        }
        mo67998q0(mVar.f295962g);
        mo149075o0(mVar.f295963h);
        mo149079t0("song_id", mVar.f295960e);
        mo149079t0("db_music_id", C102984b.m136164a(mVar));
        mo139156G0(mVar);
        Log.m105925i(this.f292485n, "onMusicPlayerEvent isFromNewMusicPlayer: %s, newBall: %s", Boolean.valueOf(mVar.f295958T), Boolean.valueOf(z));
        if (z) {
            getReportInfo().f311716e = mVar.f295959d;
            mo68414O();
            mo139158v0(mVar);
        }
        mo139157H0(mVar);
    }

    /* renamed from: y0 */
    public String mo139162y0(BallInfo ballInfo, boolean z) {
        C101106m b = C101093a.m132480b();
        String h = ballInfo.mo149045h("song_id", "~");
        String str = b == null ? "" : b.f295960e;
        Log.m105925i(this.f292485n, "onFloatBallInfoRemoved, stop music id:%s current:%s, needStopMusic: %s, isStartPlayMusic: %s, isPlaying: %s", h, str, Boolean.valueOf(z), Boolean.valueOf(C101093a.m132483e()), Boolean.valueOf(C101093a.m132481c()));
        if (z && b != null && C101093a.m132483e() && h.equals(str)) {
            C101093a.m132490l();
        }
        View view = ballInfo.f311691i;
        if (view != null && (view instanceof FloatBallMusicLyricView)) {
            FloatBallMusicLyricView floatBallMusicLyricView = (FloatBallMusicLyricView) view;
            floatBallMusicLyricView.f272195h.dead();
            C99364n.m129616h().mo138828g(floatBallMusicLyricView.f272194g);
        }
        if (z) {
            return h;
        }
        return null;
    }

    /* renamed from: z0 */
    public void mo139163z0(MusicPlayerEvent musicPlayerEvent) {
    }
}
