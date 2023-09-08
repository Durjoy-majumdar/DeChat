package la2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import da2.C97456b;
import di3.C86312j;
import ha2.C32752h;
import ha2.C98330i;
import ka2.C99111a;
import p370p7.C21949o;
import p396x6.C23023u;
import qc0.C101106m;
import sa2.C101567h;
import za2.C102982a;
import za2.C102985c;
import za2.C102986d;
import za2.C102987e;

/* renamed from: la2.n */
public class C99364n extends C99361k {

    /* renamed from: g */
    public static C99364n f291354g;

    /* renamed from: e */
    public C99355b f291355e;

    /* renamed from: f */
    public C102982a f291356f;

    public C99364n(C99355b bVar) {
        this.f291355e = bVar;
    }

    /* renamed from: h */
    public static C99364n m129616h() {
        C99364n nVar = f291354g;
        if (nVar != null) {
            if (nVar.f291355e == null) {
                nVar.f291355e = new C99363l();
            }
            ((C97456b) C86312j.m106911c(C97456b.class)).requireAndWaitForAccountInitialized();
            return f291354g;
        }
        throw new NullPointerException("must init MusicPlayerManager with your impl logic first!!!");
    }

    /* renamed from: l */
    public static C102982a m129617l() {
        if (m129616h().f291356f == null) {
            m129616h().f291356f = new C102982a();
        }
        return m129616h().f291356f;
    }

    /* renamed from: m */
    public static C99355b m129618m() {
        return m129616h().f291355e;
    }

    /* renamed from: a */
    public C94223g mo138822a() {
        C101106m k = mo138832k();
        return C102985c.m136170a(k) ? this.f291351c : (k == null || !C102985c.m136171b(k.f295959d)) ? this.f291349a : this.f291350b;
    }

    /* renamed from: i */
    public final void mo138830i(C101106m mVar) {
        if (mVar == null) {
            Log.m105920e("MicroMsg.Music.MusicUrlParser", "GetShakeMusicUrl, musicWrapper is null");
        } else {
            boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
            boolean isNetworkConnected = NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext());
            PBool pBool = new PBool();
            String str = Util.isNullOrNil(mVar.f295966n) ? mVar.f295968p : mVar.f295966n;
            String str2 = mVar.f295967o;
            String d = C102987e.m136176d(str, str2, isWifi, pBool);
            Log.m105925i("MicroMsg.Music.MusicUrlParser", "parsePlayUrl mSrc:%s", d);
            Log.m105925i("MicroMsg.Music.MusicUrlParser", "songWifiUrl:%s", mVar.f295966n);
            Log.m105925i("MicroMsg.Music.MusicUrlParser", "isWifi:%d, isQQMusic:%d", Integer.valueOf(isWifi ? 1 : 0), Integer.valueOf(pBool.value ? 1 : 0));
            boolean z = isWifi ? pBool.value : false;
            String str3 = "";
            if (!isNetworkConnected) {
                Log.m105924i("MicroMsg.Music.MusicUrlParser", "isNetConnected false, detect right Url to play");
                String d2 = C102987e.m136176d(str, str2, true, pBool);
                String d3 = C102987e.m136176d(str, str2, false, pBool);
                if (d2 == null || !d2.equals(d3)) {
                    if (C102985c.m136170a(mVar)) {
                        Log.m105924i("MicroMsg.Music.MusicUrlParser", "use exoMusicPlayer");
                    } else if (C102985c.m136171b(mVar.f295959d)) {
                        Log.m105924i("MicroMsg.Music.MusicUrlParser", "use qqMusicPlayer");
                        if (C98330i.m127112b(d2) && C98330i.m127113c(d2) > 0) {
                            str3 = d2;
                        } else {
                            if (C98330i.m127112b(d3) && C98330i.m127113c(d3) > 0) {
                                str3 = d3;
                            }
                        }
                    } else {
                        if (C102986d.m136172a(mVar, true)) {
                            str3 = d2;
                        } else if (C102986d.m136172a(mVar, false)) {
                            str3 = d3;
                        }
                        Log.m105924i("MicroMsg.Music.MusicUrlParser", "use musicPlayer");
                    }
                }
                if (!TextUtils.isEmpty(str3) && !str3.equals(d)) {
                    Log.m105925i("MicroMsg.Music.MusicUrlParser", "reset the mSrc :%s", str3);
                    d = str3;
                }
            }
            mVar.f295955Q = d;
            LruCache<String, String> lruCache = C32752h.f89139a;
            if (!TextUtils.isEmpty(d)) {
                C32752h.f89140b.put(d, Boolean.valueOf(z));
            }
        }
        if (this.f291355e.mo138793u0(mVar)) {
            mo138826e(mVar);
            return;
        }
        mo138827f();
        Log.m105920e("MicroMsg.Music.MusicPlayerManager", "prepare is fail, not to play or wait for callback onStart");
    }

    /* renamed from: j */
    public void mo138831j() {
        mo138835p();
        Log.m105924i("MicroMsg.Music.MusicPlayerManager", "release");
        Log.m105924i("MicroMsg.Music.MusicBasePlayEngine", "release");
        C101567h hVar = this.f291350b;
        if (hVar != null) {
            Log.m105924i("MicroMsg.Music.QQMusicPlayer", "release");
            CommonPlayer commonPlayer = hVar.f297343r;
            if (commonPlayer != null) {
                commonPlayer.release();
                hVar.f297343r = null;
            }
            hVar.mo141034y();
        }
        C99111a aVar = this.f291351c;
        if (aVar != null) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "release");
            aVar.f290612L.removeMessages(100);
            aVar.mo141034y();
            C23023u uVar = aVar.f290619u;
            if (uVar != null) {
                uVar.mo36265d(aVar.f290608H);
                aVar.f290619u.f66196f.remove(aVar);
                aVar.f290619u.release();
                aVar.f290619u = null;
            }
            C21949o oVar = aVar.f290623y;
            if (oVar != null) {
                oVar.mo35004f();
                aVar.f290623y = null;
            }
            aVar.f290620v = null;
            aVar.f290622x = null;
        }
        MMHandlerThread.removeRunnable(this.f291352d);
        this.f291355e.release();
        this.f291356f = null;
    }

    /* renamed from: k */
    public C101106m mo138832k() {
        return this.f291355e.mo138771E();
    }

    /* renamed from: n */
    public void mo138833n(boolean z) {
        if (this.f291349a.mo32206f()) {
            this.f291349a.f297304f = z;
        }
        if (this.f291350b.mo32206f()) {
            this.f291350b.f297304f = z;
        }
        if (this.f291351c.mo32206f()) {
            this.f291351c.f297304f = z;
        }
    }

    /* renamed from: o */
    public void mo138834o(C101106m mVar) {
        if (mVar != null) {
            Log.m105925i("MicroMsg.Music.MusicPlayerManager", "MusicType %d", Integer.valueOf(mVar.f295959d));
        }
        Log.m105924i("MicroMsg.Music.MusicPlayerManager", "startPlayNewMusic");
        mo138830i(this.f291355e.mo138792t(mVar));
    }

    /* renamed from: p */
    public void mo138835p() {
        this.f291349a.mo32210j();
        C101567h hVar = this.f291350b;
        if (hVar != null) {
            hVar.mo32210j();
        }
        C99111a aVar = this.f291351c;
        if (aVar != null) {
            aVar.mo32210j();
        }
        MMHandlerThread.removeRunnable(this.f291352d);
    }

    /* renamed from: q */
    public void mo138836q(int i) {
        Log.m105925i("MicroMsg.Music.MusicBasePlayEngine", "stopMusicDelayIfPaused, delay_ms:%d", Integer.valueOf(i));
        MMHandlerThread.removeRunnable(this.f291352d);
        MMHandlerThread.postToMainThreadDelayed(this.f291352d, (long) i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        r2 = r0.f291351c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        r2 = r0.f291350b;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138837r(qc0.C101106m r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sa2.e r2 = r0.f291349a
            boolean r2 = r2.mo32206f()
            if (r2 == 0) goto L_0x0010
            sa2.e r2 = r0.f291349a
            r2.getClass()
        L_0x0010:
            sa2.h r2 = r0.f291350b
            boolean r2 = r2.mo32206f()
            java.lang.String r3 = "setVolume volume:%f"
            java.lang.String r4 = "setPlaybackRate playbackRate:%f"
            r5 = 0
            r6 = 0
            java.lang.String r8 = "updateCurrentMusicWrapper src:%s"
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0086
            sa2.h r2 = r0.f291350b
            qc0.m r11 = r2.f297342q
            if (r11 == 0) goto L_0x0086
            boolean r11 = r11.mo140555a(r1)
            if (r11 == 0) goto L_0x0086
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r12 = r2.f297348w
            r11[r9] = r12
            java.lang.String r12 = "MicroMsg.Music.QQMusicPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r8, r11)
            double r13 = r1.f295950K
            int r11 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x0062
            qc0.m r11 = r2.f297342q
            double r6 = r11.f295950K
            int r11 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0062
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.Double r7 = java.lang.Double.valueOf(r13)
            r6[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r6)
            double r6 = r1.f295950K
            float r6 = (float) r6
            r2.mo141049F(r6)
            qc0.m r6 = r2.f297342q
            double r13 = r1.f295950K
            r6.f295950K = r13
        L_0x0062:
            float r6 = r1.f295951L
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0086
            qc0.m r7 = r2.f297342q
            float r7 = r7.f295951L
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0086
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r7[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r7)
            float r6 = r1.f295951L
            r2.mo141050G(r6)
            qc0.m r2 = r2.f297342q
            float r6 = r1.f295951L
            r2.f295951L = r6
        L_0x0086:
            ka2.a r2 = r0.f291351c
            boolean r2 = r2.mo32206f()
            if (r2 == 0) goto L_0x00f0
            ka2.a r2 = r0.f291351c
            qc0.m r6 = r2.f290615q
            if (r6 == 0) goto L_0x00f0
            boolean r6 = r6.mo140555a(r1)
            if (r6 == 0) goto L_0x00f0
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r7 = r2.f290624z
            r6[r9] = r7
            java.lang.String r7 = "MicroMsg.Music.ExoMusicPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            double r11 = r1.f295950K
            r13 = 0
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cc
            qc0.m r6 = r2.f290615q
            double r13 = r6.f295950K
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x00cc
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.Double r8 = java.lang.Double.valueOf(r11)
            r6[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r6)
            double r11 = r1.f295950K
            float r4 = (float) r11
            r2.mo138490I(r4)
            qc0.m r4 = r2.f290615q
            double r11 = r1.f295950K
            r4.f295950K = r11
        L_0x00cc:
            float r4 = r1.f295951L
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00f0
            qc0.m r5 = r2.f290615q
            float r5 = r5.f295951L
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00f0
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5[r9] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r5)
            float r3 = r1.f295951L
            r2.mo138491J(r3)
            qc0.m r2 = r2.f290615q
            float r3 = r1.f295951L
            r2.f295951L = r3
        L_0x00f0:
            la2.b r2 = r0.f291355e
            r2.mo138787o(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: la2.C99364n.mo138837r(qc0.m):void");
    }
}
