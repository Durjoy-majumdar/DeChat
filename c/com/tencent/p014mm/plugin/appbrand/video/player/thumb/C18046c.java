package com.tencent.p014mm.plugin.appbrand.video.player.thumb;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.hardcoder.HardCoderJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerFactory;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C8480h;
import gy3.C87412m;
import in0.C21108a;
import in0.C87760d;
import java.util.HashMap;
import p823sg.C90193h;
import rx3.C13598b0;
import sx3.C26236u;
import tm0.C14016b0;
import z04.C112551y;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.c */
public class C18046c extends C21108a {

    /* renamed from: A */
    public final ITPPlayerListener.IOnVideoSizeChangedListener f49871A;

    /* renamed from: B */
    public final ITPPlayerListener.IOnErrorListener f49872B;

    /* renamed from: C */
    public final ITPPlayerListener.IOnStateChangeListener f49873C;

    /* renamed from: D */
    public final ITPPlayerListener.IOnInfoListener f49874D;

    /* renamed from: o */
    public final boolean f49875o;

    /* renamed from: p */
    public final String f49876p;

    /* renamed from: q */
    public final ITPPlayer f49877q;

    /* renamed from: r */
    public volatile boolean f49878r;

    /* renamed from: s */
    public Integer f49879s;

    /* renamed from: t */
    public volatile boolean f49880t;

    /* renamed from: u */
    public boolean f49881u;

    /* renamed from: v */
    public volatile boolean f49882v;

    /* renamed from: w */
    public volatile boolean f49883w;

    /* renamed from: x */
    public final ITPPlayerListener.IOnPreparedListener f49884x;

    /* renamed from: y */
    public final ITPPlayerListener.IOnSeekCompleteListener f49885y;

    /* renamed from: z */
    public final ITPPlayerListener.IOnCompletionListener f49886z;

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.c$a */
    public static final class C18047a implements ITPPlayerListener.IOnInfoListener {

        /* renamed from: d */
        public final /* synthetic */ C18046c f49887d;

        public C18047a(C18046c cVar) {
            this.f49887d = cVar;
        }

        public final void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
            int i2 = i;
            String str = this.f49887d.f49876p;
            Log.m105918d(str, "onInfo, what: " + i + ", arg1: " + j + ", arg2: " + j2 + ", extraObject: " + obj);
            if (201 == i2 && 7 == this.f49887d.f49877q.getCurrentState()) {
                Log.m105924i(this.f49887d.f49876p, "onInfo, buffering end when COMPLETE, notify seek complete");
                this.f49887d.mo22527D();
            }
            int i3 = 3;
            int i4 = 0;
            if (i2 != 106) {
                if (i2 == 200) {
                    if (!(3 == this.f49887d.f49877q.getCurrentState()) && !this.f49887d.f49880t) {
                        i3 = 701;
                        i4 = C104818d.m140486b(this.f49887d.f49877q);
                        this.f49887d.f49881u = true;
                    }
                } else if (i2 == 201) {
                    C18046c cVar = this.f49887d;
                    if (cVar.f49881u) {
                        cVar.f49881u = false;
                        i3 = 702;
                        i4 = C104818d.m140486b(cVar.f49877q);
                    }
                }
                i3 = -1;
            }
            if (-1 != i3) {
                this.f49887d.mo32883B(i3, i4);
            }
            C18046c cVar2 = this.f49887d;
            ITPPlayer iTPPlayer2 = iTPPlayer;
            C87412m.m108593f(iTPPlayer, "ttplayer");
            cVar2.mo22530H(iTPPlayer, i, j, j2, obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.c$b */
    public static final class C18048b implements ITPPlayerListener.IOnCompletionListener {

        /* renamed from: d */
        public final /* synthetic */ C18046c f49888d;

        public C18048b(C18046c cVar) {
            this.f49888d = cVar;
        }

        public final void onCompletion(ITPPlayer iTPPlayer) {
            Log.m105918d(this.f49888d.f49876p, "onCompletion");
            C18046c cVar = this.f49888d;
            cVar.f59681a = 6;
            cVar.mo32889x();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.c$c */
    public static final class C18049c implements ITPPlayerListener.IOnErrorListener {

        /* renamed from: d */
        public final /* synthetic */ C18046c f49889d;

        public C18049c(C18046c cVar) {
            this.f49889d = cVar;
        }

        public final void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
            String str = this.f49889d.f49876p;
            Log.m105928w(str, "onError, errorType: " + i + ", errorCode: " + i2 + ", arg1: " + j + ", arg2: " + j2);
            if (1000 != i2) {
                if (1100 == i) {
                    boolean z = false;
                    if (11070000 <= i2 && i2 < 11080000) {
                        z = true;
                    }
                    if (z) {
                        this.f49889d.mo32891z(HardCoderJNI.CLIENT_CONNECT, i2 - 11070000);
                        return;
                    }
                }
                this.f49889d.mo32891z(-10000 - i, i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.c$d */
    public static final class C18050d implements ITPPlayerListener.IOnStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C18046c f49890d;

        public C18050d(C18046c cVar) {
            this.f49890d = cVar;
        }

        public final void onStateChange(int i, int i2) {
            String str = this.f49890d.f49876p;
            Log.m105918d(str, "onStateChange, preState: " + i + ", curState: " + i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.c$e */
    public static final class C18051e implements ITPPlayerListener.IOnPreparedListener {

        /* renamed from: d */
        public final /* synthetic */ C18046c f49891d;

        public C18051e(C18046c cVar) {
            this.f49891d = cVar;
        }

        public final void onPrepared(ITPPlayer iTPPlayer) {
            Log.m105918d(this.f49891d.f49876p, "onPrepared");
            C18046c cVar = this.f49891d;
            cVar.f49877q.pauseDownload();
            cVar.f49882v = true;
            C18046c cVar2 = this.f49891d;
            cVar2.f59681a = 2;
            cVar2.mo32884C();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.c$f */
    public static final class C18052f implements ITPPlayerListener.IOnSeekCompleteListener {

        /* renamed from: d */
        public final /* synthetic */ C18046c f49892d;

        public C18052f(C18046c cVar) {
            this.f49892d = cVar;
        }

        public final void onSeekComplete(ITPPlayer iTPPlayer) {
            Log.m105918d(this.f49892d.f49876p, "onSeekComplete");
            this.f49892d.mo22527D();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.c$g */
    public static final class C18053g implements ITPPlayerListener.IOnVideoSizeChangedListener {

        /* renamed from: d */
        public final /* synthetic */ C18046c f49893d;

        public C18053g(C18046c cVar) {
            this.f49893d = cVar;
        }

        public final void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
            String str = this.f49893d.f49876p;
            Log.m105918d(str, "onVideoSizeChanged, width: " + j + ", height: " + j2);
            this.f49893d.mo32885E((int) j, (int) j2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18046c(Context context, Looper looper, boolean z, boolean z2, int i, C8480h hVar) {
        this(context, (i & 2) != 0 ? null : looper, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
    }

    /* renamed from: J */
    public static /* synthetic */ void m18615J(C18046c cVar, String str, String str2, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                i = cVar.f49875o;
            }
            cVar.mo22531I(str, str2, z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDataSource");
    }

    /* renamed from: D */
    public void mo22527D() {
        this.f49880t = false;
        super.mo22527D();
        if (this.f49883w) {
            Log.m105924i(this.f49876p, "notifyOnSeekComplete, isDownloadPausedBeforeSeek, pausePlayerDownload");
            this.f49877q.pauseDownload();
            this.f49882v = true;
        }
    }

    /* renamed from: F */
    public final boolean mo22528F() {
        switch (this.f49877q.getCurrentState()) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: G */
    public final void mo22529G(Exception exc) {
        C87412m.m108594g(exc, "e");
        if (exc instanceof IllegalStateException) {
            mo32891z(-10001, -1);
        } else if (!(exc instanceof IllegalArgumentException) || !C87412m.m108589b("drm asset url is null or drm property is null", exc.getMessage())) {
            mo32891z(-10999, -1);
        } else {
            mo32891z(HardCoderJNI.CLIENT_CONNECT, 10000);
        }
    }

    /* renamed from: H */
    public void mo22530H(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
        C87412m.m108594g(iTPPlayer, "player");
    }

    /* renamed from: I */
    public final void mo22531I(String str, String str2, boolean z, int i) {
        C87412m.m108594g(str, "path");
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "setDataSource");
                String str3 = this.f49876p;
                Log.m105918d(str3, "setDataSource, path: " + str + ", referrer: " + str2);
                boolean z2 = false;
                if (C112551y.m153819s(str, "file://", false)) {
                    str = str.substring(7);
                    C87412m.m108593f(str, "this as java.lang.String).substring(startIndex)");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", MMApplicationContext.getApplicationId());
                if (str2 == null || str2.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    hashMap.put("Referrer", str2);
                }
                iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(102, 1000));
                iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(504, 1));
                iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(206, z));
                byte[] bytes = str.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                String f = C90193h.m112878f(bytes);
                String str4 = this.f49876p;
                Log.m105924i(str4, "setDataSource, fileId: " + f);
                TPVideoInfo.Builder fileId = new TPVideoInfo.Builder().fileId(f);
                TPDownloadParamData tPDownloadParamData = new TPDownloadParamData(i);
                try {
                    tPDownloadParamData.setHeadersList(C26236u.m33719b(hashMap));
                } catch (Throwable th) {
                    String str5 = this.f49876p;
                    Log.m105924i(str5, "setDataSource, use custom api fail since " + th);
                }
                fileId.downloadParam(tPDownloadParamData);
                iTPPlayer.setVideoInfo(fileId.build());
                C104818d.m140487c(iTPPlayer, str, hashMap);
                this.f59681a = 1;
                C13598b0 b0Var2 = C13598b0.f38549a;
            } catch (Exception e) {
                String str6 = this.f49876p;
                Log.m105920e(str6, "setDataSource" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "setDataSource, player is not available");
        }
    }

    /* renamed from: a */
    public void mo22532a(float f, float f2) {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, C14016b0.NAME);
                iTPPlayer.setAudioGainRatio(f);
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, C14016b0.NAME + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "setVolume, player is not available");
        }
    }

    /* renamed from: b */
    public void mo22533b(boolean z) {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "setLooping");
                iTPPlayer.setLoopback(z);
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "setLooping" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "setLooping, player is not available");
        }
    }

    /* renamed from: d */
    public void mo22534d(String str, String str2) {
        C87412m.m108594g(str, "path");
        m18615J(this, str, str2, true, 0, 8, (Object) null);
    }

    /* renamed from: e */
    public void mo22535e(double d) {
    }

    public int getCurrentPosition() {
        ITPPlayer iTPPlayer = this.f49877q;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "getCurrentPosition");
                return (int) iTPPlayer.getCurrentPositionMs();
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "getCurrentPosition" + ", fail since " + e);
                mo22529G(e);
                return 0;
            }
        } else {
            Log.m105928w(this.f49876p, "getCurrentPosition, player is not available");
            return 0;
        }
    }

    public int getDuration() {
        ITPPlayer iTPPlayer = this.f49877q;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "getDuration");
                return (int) iTPPlayer.getDurationMs();
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "getDuration" + ", fail since " + e);
                mo22529G(e);
                return 0;
            }
        } else {
            Log.m105928w(this.f49876p, "getDuration, player is not available");
            return 0;
        }
    }

    public int getPlayerType() {
        return 3;
    }

    public int getVideoHeight() {
        ITPPlayer iTPPlayer = this.f49877q;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "getVideoHeight");
                return iTPPlayer.getVideoHeight();
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "getVideoHeight" + ", fail since " + e);
                mo22529G(e);
                return 0;
            }
        } else {
            Log.m105928w(this.f49876p, "getVideoHeight, player is not available");
            return 0;
        }
    }

    public int getVideoWidth() {
        ITPPlayer iTPPlayer = this.f49877q;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "getVideoWidth");
                return iTPPlayer.getVideoWidth();
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "getVideoWidth" + ", fail since " + e);
                mo22529G(e);
                return 0;
            }
        } else {
            Log.m105928w(this.f49876p, "getVideoWidth, player is not available");
            return 0;
        }
    }

    /* renamed from: h */
    public void mo22541h(String str, int i) {
        if (str != null) {
            setDataSource(str);
        }
    }

    public boolean isPlaying() {
        ITPPlayer iTPPlayer = this.f49877q;
        boolean z = true;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "isPlaying");
                if (5 != iTPPlayer.getCurrentState()) {
                    z = false;
                }
                return z;
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "isPlaying" + ", fail since " + e);
                mo22529G(e);
                return false;
            }
        } else {
            Log.m105928w(this.f49876p, "isPlaying, player is not available");
            return false;
        }
    }

    /* renamed from: l */
    public boolean mo22543l(float f) {
        ITPPlayer iTPPlayer = this.f49877q;
        boolean z = true;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "setSpeed");
                iTPPlayer.setPlaySpeedRatio(f);
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "setSpeed" + ", fail since " + e);
                mo22529G(e);
                z = false;
            }
            return z;
        }
        Log.m105928w(this.f49876p, "setSpeed, player is not available");
        return false;
    }

    /* renamed from: o */
    public <PlayerImpl extends C87760d> PlayerImpl mo22544o(Class<PlayerImpl> cls) {
        C87412m.m108594g(cls, "playerClass");
        C18046c cVar = C18046c.class.isAssignableFrom(cls) ? this : null;
        String str = this.f49876p;
        Log.m105924i(str, "castTo, playerClass: " + cls + ", playerImpl: " + cVar);
        return cVar;
    }

    public void pause() {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "pause");
                if ((3 == this.f49877q.getCurrentState()) || isPlaying()) {
                    iTPPlayer.pause();
                    this.f49877q.pauseDownload();
                    this.f49882v = true;
                    this.f59681a = 4;
                    return;
                }
                Log.m105928w(this.f49876p, "pause, is not preparing and not playing");
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "pause" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "pause, player is not available");
        }
    }

    public void prepareAsync() {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        boolean z = true;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "prepareAsync");
                if (this.f59681a == 0) {
                    Log.m105928w(this.f49876p, "prepareAsync, idle");
                    return;
                }
                if (3 == this.f49877q.getCurrentState()) {
                    Log.m105928w(this.f49876p, "prepareAsync, isPreparing");
                    return;
                }
                int currentState = this.f49877q.getCurrentState();
                if (!(currentState == 4 || currentState == 5 || currentState == 6 || currentState == 7)) {
                    z = false;
                }
                if (z) {
                    Log.m105928w(this.f49876p, "prepareAsync, isPrepared");
                } else {
                    iTPPlayer.prepareAsync();
                }
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "prepareAsync" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "prepareAsync, player is not available");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106 A[Catch:{ Exception -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0116 A[Catch:{ Exception -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d A[Catch:{ Exception -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013a A[Catch:{ Exception -> 0x0138 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22547r(java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "sourceUrl"
            gy3.C87412m.m108594g(r10, r0)
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L_0x0013
            int r2 = r11.length()
            if (r2 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            if (r2 == 0) goto L_0x002c
            if (r12 == 0) goto L_0x0021
            int r2 = r12.length()
            if (r2 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r2 = 0
            goto L_0x0022
        L_0x0021:
            r2 = 1
        L_0x0022:
            if (r2 == 0) goto L_0x002c
            r10 = -20000(0xffffffffffffb1e0, float:NaN)
            r11 = 10000(0x2710, float:1.4013E-41)
            r9.mo32891z(r10, r11)
            return
        L_0x002c:
            com.tencent.thumbplayer.api.ITPPlayer r2 = r9.f49877q
            java.lang.String r3 = "setDataSource"
            rx3.b0 r4 = rx3.C13598b0.f38549a
            boolean r4 = r9.f49878r
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x015d
            java.lang.String r4 = r9.f49876p     // Catch:{ Exception -> 0x0138 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = r9.f49876p     // Catch:{ Exception -> 0x0138 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r5.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = "setDrmDataSource, sourceUrl: "
            r5.append(r6)     // Catch:{ Exception -> 0x0138 }
            r5.append(r10)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = ", provisionUrl: "
            r5.append(r6)     // Catch:{ Exception -> 0x0138 }
            r5.append(r11)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = ", licenseUrl: "
            r5.append(r6)     // Catch:{ Exception -> 0x0138 }
            r5.append(r12)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = ", isLive: "
            r5.append(r6)     // Catch:{ Exception -> 0x0138 }
            r5.append(r13)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0138 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "file://"
            boolean r4 = z04.C112551y.m153819s(r10, r4, r0)     // Catch:{ Exception -> 0x0138 }
            if (r4 == 0) goto L_0x0081
            r4 = 7
            java.lang.String r10 = r10.substring(r4)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r10, r4)     // Catch:{ Exception -> 0x0138 }
            r4 = 1
            goto L_0x0082
        L_0x0081:
            r4 = 0
        L_0x0082:
            com.tencent.thumbplayer.api.TPOptionalParam r5 = new com.tencent.thumbplayer.api.TPOptionalParam     // Catch:{ Exception -> 0x0138 }
            r5.<init>()     // Catch:{ Exception -> 0x0138 }
            r6 = 102(0x66, float:1.43E-43)
            r7 = 1000(0x3e8, double:4.94E-321)
            com.tencent.thumbplayer.api.TPOptionalParam r5 = r5.buildLong(r6, r7)     // Catch:{ Exception -> 0x0138 }
            r2.setPlayerOptionalParam(r5)     // Catch:{ Exception -> 0x0138 }
            com.tencent.thumbplayer.api.TPOptionalParam r5 = new com.tencent.thumbplayer.api.TPOptionalParam     // Catch:{ Exception -> 0x0138 }
            r5.<init>()     // Catch:{ Exception -> 0x0138 }
            r6 = 504(0x1f8, float:7.06E-43)
            r7 = 1
            com.tencent.thumbplayer.api.TPOptionalParam r5 = r5.buildLong(r6, r7)     // Catch:{ Exception -> 0x0138 }
            r2.setPlayerOptionalParam(r5)     // Catch:{ Exception -> 0x0138 }
            com.tencent.thumbplayer.api.TPOptionalParam r5 = new com.tencent.thumbplayer.api.TPOptionalParam     // Catch:{ Exception -> 0x0138 }
            r5.<init>()     // Catch:{ Exception -> 0x0138 }
            r6 = 206(0xce, float:2.89E-43)
            com.tencent.thumbplayer.api.TPOptionalParam r5 = r5.buildBoolean(r6, r1)     // Catch:{ Exception -> 0x0138 }
            r2.setPlayerOptionalParam(r5)     // Catch:{ Exception -> 0x0138 }
            java.nio.charset.Charset r5 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x0138 }
            byte[] r5 = r10.getBytes(r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r5, r6)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = p823sg.C90193h.m112878f(r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = r9.f49876p     // Catch:{ Exception -> 0x0138 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r7.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = "setDrmDataSource, fileId: "
            r7.append(r8)     // Catch:{ Exception -> 0x0138 }
            r7.append(r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0138 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ Exception -> 0x0138 }
            com.tencent.thumbplayer.api.TPVideoInfo$Builder r6 = new com.tencent.thumbplayer.api.TPVideoInfo$Builder     // Catch:{ Exception -> 0x0138 }
            r6.<init>()     // Catch:{ Exception -> 0x0138 }
            com.tencent.thumbplayer.api.TPVideoInfo$Builder r5 = r6.fileId(r5)     // Catch:{ Exception -> 0x0138 }
            com.tencent.thumbplayer.api.proxy.TPDownloadParamData r6 = new com.tencent.thumbplayer.api.proxy.TPDownloadParamData     // Catch:{ Exception -> 0x0138 }
            if (r13 == 0) goto L_0x00e6
            r13 = 5
            goto L_0x00e7
        L_0x00e6:
            r13 = 3
        L_0x00e7:
            r6.<init>((int) r13)     // Catch:{ Exception -> 0x0138 }
            r5.downloadParam(r6)     // Catch:{ Exception -> 0x0138 }
            com.tencent.thumbplayer.api.TPVideoInfo r13 = r5.build()     // Catch:{ Exception -> 0x0138 }
            r2.setVideoInfo(r13)     // Catch:{ Exception -> 0x0138 }
            com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset r10 = com.tencent.thumbplayer.api.composition.TPMediaCompositionFactory.createMediaDRMAsset(r0, r10)     // Catch:{ Exception -> 0x0138 }
            if (r11 == 0) goto L_0x0103
            int r13 = r11.length()     // Catch:{ Exception -> 0x0138 }
            if (r13 != 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r13 = 0
            goto L_0x0104
        L_0x0103:
            r13 = 1
        L_0x0104:
            if (r13 != 0) goto L_0x010b
            java.lang.String r13 = "drm_property_provision_url"
            r10.setDrmProperty(r13, r11)     // Catch:{ Exception -> 0x0138 }
        L_0x010b:
            if (r12 == 0) goto L_0x0113
            int r11 = r12.length()     // Catch:{ Exception -> 0x0138 }
            if (r11 != 0) goto L_0x0114
        L_0x0113:
            r0 = 1
        L_0x0114:
            if (r0 != 0) goto L_0x011b
            java.lang.String r11 = "drm_property_license_url"
            r10.setDrmProperty(r11, r12)     // Catch:{ Exception -> 0x0138 }
        L_0x011b:
            if (r4 == 0) goto L_0x013a
            java.lang.String r10 = r10.getUrl()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "drmAsset.url"
            gy3.C87412m.m108593f(r10, r11)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "protocol_whitelist"
            java.lang.String r12 = "file,crypto,http,https,tls,tcp"
            rx3.l r13 = new rx3.l     // Catch:{ Exception -> 0x0138 }
            r13.<init>(r11, r12)     // Catch:{ Exception -> 0x0138 }
            java.util.Map r11 = sx3.C90363p0.m113143b(r13)     // Catch:{ Exception -> 0x0138 }
            com.tencent.p014mm.plugin.appbrand.video.player.thumb.C104818d.m140487c(r2, r10, r11)     // Catch:{ Exception -> 0x0138 }
            goto L_0x013d
        L_0x0138:
            r10 = move-exception
            goto L_0x0140
        L_0x013a:
            r2.setDataSource((com.tencent.thumbplayer.api.composition.ITPMediaAsset) r10)     // Catch:{ Exception -> 0x0138 }
        L_0x013d:
            r9.f59681a = r1     // Catch:{ Exception -> 0x0138 }
            goto L_0x0165
        L_0x0140:
            java.lang.String r11 = r9.f49876p
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r13 = ", fail since "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            r9.mo22529G(r10)
            goto L_0x0165
        L_0x015d:
            java.lang.String r10 = r9.f49876p
            java.lang.String r11 = "setDataSource, player is not available"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r11)
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18046c.mo22547r(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public void release() {
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "release");
                this.f49877q.setOnPreparedListener((ITPPlayerListener.IOnPreparedListener) null);
                this.f49877q.setOnSeekCompleteListener((ITPPlayerListener.IOnSeekCompleteListener) null);
                this.f49877q.setOnCompletionListener((ITPPlayerListener.IOnCompletionListener) null);
                this.f49877q.setOnVideoSizeChangedListener((ITPPlayerListener.IOnVideoSizeChangedListener) null);
                this.f49877q.setOnErrorListener((ITPPlayerListener.IOnErrorListener) null);
                this.f49877q.setOnPlayerStateChangeListener((ITPPlayerListener.IOnStateChangeListener) null);
                this.f49877q.setOnInfoListener((ITPPlayerListener.IOnInfoListener) null);
                this.f49877q.release();
                this.f59681a = -2;
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "release" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "release, player is not available");
        }
        this.f59682b = true;
        this.f49878r = true;
    }

    public void reset() {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "reset");
                iTPPlayer.reset();
                this.f59681a = 0;
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "reset" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "reset, player is not available");
        }
    }

    public void seekTo(long j) {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "seekTo");
                this.f49883w = this.f49882v;
                this.f49877q.resumeDownload();
                this.f49882v = false;
                iTPPlayer.seekTo((int) j, 3);
                this.f49880t = true;
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "seekTo" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "seekTo, player is not available");
        }
    }

    public void setDataSource(String str) {
        C87412m.m108594g(str, "path");
        mo22534d(str, (String) null);
    }

    public void setMute(boolean z) {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "setMute");
                iTPPlayer.setOutputMute(z);
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "setMute" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "setMute, player is not available");
        }
    }

    public void setSurface(Surface surface) {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface);
                iTPPlayer.setSurface(surface);
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "setSurface, player is not available");
        }
    }

    public void start() {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        boolean z = true;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, IXWebBroadcastListener.STAGE_START);
                if (!mo22528F()) {
                    Log.m105928w(this.f49876p, "start, can not start");
                } else if (isPlaying()) {
                    Log.m105928w(this.f49876p, "start, isPlaying");
                } else {
                    int currentState = this.f49877q.getCurrentState();
                    if (!(currentState == 4 || currentState == 5 || currentState == 6 || currentState == 7)) {
                        z = false;
                    }
                    if (!z) {
                        Log.m105928w(this.f49876p, "start, is not prepared");
                        return;
                    }
                    if (7 == iTPPlayer.getCurrentState()) {
                        seekTo(0);
                    }
                    iTPPlayer.start();
                    this.f49877q.resumeDownload();
                    this.f49882v = false;
                    this.f59681a = 3;
                }
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, IXWebBroadcastListener.STAGE_START + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "start, player is not available");
        }
    }

    public void stop() {
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "stop");
                if (!mo22528F()) {
                    Log.m105928w(this.f49876p, "stop, can not start");
                    return;
                }
                iTPPlayer.stop();
                this.f49877q.pauseDownload();
                this.f49882v = true;
                this.f59681a = 5;
            } catch (Exception e) {
                String str = this.f49876p;
                Log.m105920e(str, "stop" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "stop, player is not available");
        }
    }

    /* renamed from: w */
    public void mo22556w(int i) {
        String str = this.f49876p;
        Log.m105918d(str, "notifyOnBufferingUpdate, percent:" + i);
        Integer num = this.f49879s;
        if (num == null || i != num.intValue()) {
            super.mo22556w(i);
            this.f49879s = Integer.valueOf(i);
        }
    }

    public C18046c(Context context, Looper looper, boolean z, boolean z2) {
        C87412m.m108594g(context, "context");
        this.f49875o = z;
        String str = "MicroMsg.AppBrand.ThumbMediaPlayer#" + hashCode();
        this.f49876p = str;
        this.f49882v = true;
        C18051e eVar = new C18051e(this);
        this.f49884x = eVar;
        C18052f fVar = new C18052f(this);
        this.f49885y = fVar;
        C18048b bVar = new C18048b(this);
        this.f49886z = bVar;
        C18053g gVar = new C18053g(this);
        this.f49871A = gVar;
        C18049c cVar = new C18049c(this);
        this.f49872B = cVar;
        C18050d dVar = new C18050d(this);
        this.f49873C = dVar;
        Log.m105918d(str, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C18054e.f49894a.mo22566d(context, z2);
        ITPPlayer createTPPlayer = TPPlayerFactory.createTPPlayer(context, looper);
        C87412m.m108593f(createTPPlayer, "createTPPlayer(context, mainLooper)");
        this.f49877q = createTPPlayer;
        createTPPlayer.setOnPreparedListener(eVar);
        createTPPlayer.setOnSeekCompleteListener(fVar);
        createTPPlayer.setOnCompletionListener(bVar);
        createTPPlayer.setOnVideoSizeChangedListener(gVar);
        createTPPlayer.setOnErrorListener(cVar);
        createTPPlayer.setOnPlayerStateChangeListener(dVar);
        C18047a aVar = new C18047a(this);
        this.f49874D = aVar;
        createTPPlayer.setOnInfoListener(aVar);
        mo22533b(false);
    }
}
