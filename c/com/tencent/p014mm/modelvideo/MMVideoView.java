package com.tencent.p014mm.modelvideo;

import a70.C112760b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import p206nj.C11171e;
import uf0.C102020i;
import uf0.C65339f;
import vd3.C102171c0;

@Deprecated
/* renamed from: com.tencent.mm.modelvideo.MMVideoView */
public class MMVideoView extends CommonVideoView implements C55394a.C55395a {

    /* renamed from: f1 */
    public static final /* synthetic */ int f267485f1 = 0;

    /* renamed from: Q0 */
    public int f267486Q0 = 0;

    /* renamed from: R0 */
    public C65339f f267487R0;

    /* renamed from: S0 */
    public int f267488S0;

    /* renamed from: T0 */
    public int f267489T0;

    /* renamed from: U */
    public String f267490U;

    /* renamed from: U0 */
    public boolean f267491U0;

    /* renamed from: V */
    public C55394a f267492V;

    /* renamed from: V0 */
    public boolean f267493V0;

    /* renamed from: W */
    public String f267494W;

    /* renamed from: W0 */
    public int f267495W0 = 0;

    /* renamed from: X0 */
    public int f267496X0;

    /* renamed from: Y0 */
    public boolean f267497Y0 = false;

    /* renamed from: Z0 */
    public boolean f267498Z0 = false;

    /* renamed from: a1 */
    public boolean f267499a1 = false;

    /* renamed from: b1 */
    public C55393b f267500b1;

    /* renamed from: c1 */
    public boolean f267501c1 = false;

    /* renamed from: d1 */
    public boolean f267502d1;

    /* renamed from: e1 */
    public MTimerHandler f267503e1 = new MTimerHandler(new C92860a(), true);

    /* renamed from: p0 */
    public String f267504p0;

    /* renamed from: x0 */
    public C96814a.C96815a f267505x0;

    /* renamed from: y0 */
    public int f267506y0 = 0;

    /* renamed from: com.tencent.mm.modelvideo.MMVideoView$b */
    public static class C55393b {

        /* renamed from: a */
        public int f157764a;

        /* renamed from: b */
        public int f157765b;
    }

    /* renamed from: com.tencent.mm.modelvideo.MMVideoView$a */
    public class C92860a implements MTimerHandler.CallBack {
        public C92860a() {
        }

        public boolean onTimerExpired() {
            boolean z;
            MMVideoView mMVideoView = MMVideoView.this;
            int i = MMVideoView.f267485f1;
            if (mMVideoView.f283595q == null) {
                return false;
            }
            boolean isPlaying = mMVideoView.isPlaying();
            if (isPlaying) {
                MMVideoView.this.mo135072F();
            }
            try {
                int currentPosition = MMVideoView.this.f283595q.getCurrentPosition() / 1000;
                MMVideoView.this.mo79610W(currentPosition);
                z = MMVideoView.this.mo127232a0(currentPosition);
            } catch (Exception e) {
                MMVideoView mMVideoView2 = MMVideoView.this;
                Log.m105921e(mMVideoView2.f283586e, "%s online video timer check error [%s] ", mMVideoView2.mo76634K(), e.toString());
                z = false;
            }
            MMVideoView mMVideoView3 = MMVideoView.this;
            Log.m105919d(mMVideoView3.f283586e, "%s check timer[%b] isplay[%b]", mMVideoView3.mo76634K(), Boolean.valueOf(z), Boolean.valueOf(isPlaying));
            return MMVideoView.this.mo129178N() ? z && isPlaying && MMVideoView.this.mo135071C() : z && isPlaying;
        }
    }

    public MMVideoView(Context context) {
        super(context);
    }

    private String getRootPath() {
        if (!Util.isNullOrNil(this.f267490U)) {
            return this.f267490U;
        }
        return C112760b.m154195C() + "video/";
    }

    /* renamed from: E */
    public C96875r0 mo79608E(Context context) {
        this.f283601w = 1;
        VideoPlayerTextureView videoPlayerTextureView = new VideoPlayerTextureView(context, (AttributeSet) null);
        videoPlayerTextureView.setNeedResetExtractor(true);
        return videoPlayerTextureView;
    }

    /* renamed from: H */
    public void mo79392H() {
        super.mo79392H();
        this.f283586e = "MicroMsg.MMVideoView";
        this.f283585d = "VideoView.MMVideoView";
        this.f267487R0 = mo79615b0();
        this.f267500b1 = new C55393b();
        mo127233e0();
        mo79628h0();
    }

    /* renamed from: T */
    public void mo127230T(boolean z) {
        Log.m105919d(this.f283586e, "%s start timer rightNow[%b]", mo76634K(), Boolean.valueOf(z));
        this.f267503e1.stopTimer();
        this.f267503e1.startTimer(10, 500);
    }

    /* renamed from: U */
    public void mo127231U() {
        this.f267503e1.stopTimer();
    }

    /* renamed from: Y */
    public boolean mo79611Y(int i, PInt pInt, PInt pInt2) {
        pInt.value = Math.max(i, this.f267495W0);
        int i2 = this.f267486Q0;
        if (i2 == 1) {
            pInt.value = i;
            pInt2.value = this.f267496X0 + i;
        }
        if (i2 == 2) {
            int i3 = i - 8;
            pInt.value = i3;
            if (i3 < 0) {
                pInt.value = 0;
            }
            pInt2.value = pInt.value + this.f267496X0 + 8;
        }
        if (i2 == 3 || i2 == 4) {
            pInt.value = this.f267495W0;
            pInt2.value = this.f267496X0 + i + 1 + this.f267500b1.f157765b;
        }
        int i4 = pInt2.value;
        int i5 = this.f267488S0;
        if (i4 >= i5 + 1) {
            pInt2.value = i5 + 1;
        }
        int i6 = pInt2.value;
        int i7 = pInt.value;
        if (i6 < i7) {
            Log.m105925i("VideoView.MMVideoView", "calcDownloadRange ret is false, range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", Integer.valueOf(i7), Integer.valueOf(pInt2.value), Integer.valueOf(i), Integer.valueOf(this.f267486Q0), Integer.valueOf(this.f267495W0), Integer.valueOf(this.f267496X0), this.f267494W);
            pInt2.value = pInt.value + this.f267500b1.f157765b;
            return false;
        }
        Log.m105925i(this.f283586e, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", mo76634K(), Integer.valueOf(pInt.value), Integer.valueOf(pInt2.value), Integer.valueOf(i), Integer.valueOf(this.f267486Q0), Integer.valueOf(this.f267495W0), Integer.valueOf(this.f267496X0), this.f267494W);
        return true;
    }

    /* renamed from: Z */
    public boolean mo79612Z(int i) {
        boolean z;
        if (this.f267506y0 == 3) {
            Log.m105924i(this.f283585d, "checkCanPlay true, downloadStatus is download finish");
            return true;
        }
        int i2 = this.f267495W0;
        if (i2 - i > 1 || i2 >= this.f267488S0) {
            PInt pInt = new PInt();
            PInt pInt2 = new PInt();
            try {
                if (this.f267487R0.mo89449d(i, i + 1, pInt, pInt2)) {
                    C55394a aVar = this.f267492V;
                    z = aVar != null ? aVar.mo36229c(this.f267494W, pInt.value, pInt2.value) : false;
                    if (!z) {
                        try {
                            this.f267495W0 = i;
                        } catch (Exception e) {
                            e = e;
                            Log.m105921e(this.f283586e, "%s check video data error %s ", mo76634K(), e.toString());
                            return z;
                        }
                    }
                    String str = this.f283585d;
                    Log.m105924i(str, "checkCanPlay ret is " + z + ", cachePlayTime is " + this.f267495W0 + ", playTime is " + i);
                    return z;
                }
                Log.m105924i(this.f283585d, "checkCanPlay false, parser videoTimeToFilePos return false");
                return false;
            } catch (Exception e2) {
                e = e2;
                z = false;
            }
        } else {
            String str2 = this.f283585d;
            Log.m105924i(str2, "checkCanPlay false, cachePlayTime is " + this.f267495W0 + ", playTime is " + i + ", MIN_CAN_PLAY_CACHE is " + 1 + ", timeDuration is " + this.f267488S0);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo79613a(double d, boolean z) {
        return mo79629i0((int) d, z);
    }

    /* renamed from: a0 */
    public boolean mo127232a0(int i) {
        boolean z;
        int i2 = this.f267489T0;
        if (i2 == -1) {
            i2 = i;
        }
        Log.m105924i(this.f283586e, mo76634K() + " check timer playCurrPos " + i + " playTime " + i2 + " cachePlayTime " + this.f267495W0 + " timeDuration " + this.f267488S0 + " playStatus " + this.f267486Q0 + " downloadStatus " + this.f267506y0 + " cdnMediaId " + this.f267494W + " isPrepareVideo[" + this.f267497Y0 + "], isPrepared[" + this.f283572B + "]");
        int i3 = this.f267506y0;
        int i4 = 3;
        if (i3 == 1) {
            Log.m105924i(this.f283585d, "checkTimer, downloadStatus is downloading, playCurrPos is " + i);
            if (!mo79612Z(i2)) {
                this.f267493V0 = true;
                if (this.f267495W0 > 0) {
                    Log.m105925i(this.f283586e, "%s pause by load data cdnMediaId %s, playStatus %d", mo76634K(), this.f267494W, Integer.valueOf(this.f267486Q0));
                    this.f283584N.f300839e = Util.nowMilliSecond();
                    int i5 = this.f267486Q0;
                    if (!(i5 == 2 || i5 == 4)) {
                        int i6 = this.f267496X0 + this.f267500b1.f157764a;
                        this.f267496X0 = i6;
                        this.f267496X0 = Math.min(i6, 60);
                        this.f283584N.f300842h++;
                        this.f267486Q0 = 4;
                    }
                    Log.m105925i(this.f283586e, "%s pauseByDataBlock ", mo76634K());
                    mo129179R();
                    pause();
                } else if (this.f267489T0 == -1) {
                    this.f267486Q0 = 1;
                } else {
                    this.f267486Q0 = 2;
                }
                z = false;
            } else {
                if (this.f267497Y0) {
                    mo79610W(i2);
                    Log.m105925i(this.f283586e, "resumeByDataGain, playStatus:%s, isPlaying:%s, pauseByLoadData:%s", Integer.valueOf(this.f267486Q0), Boolean.valueOf(this.f283595q.isPlaying()), Boolean.valueOf(this.f267493V0));
                    if (this.f267493V0) {
                        this.f283584N.f300840f = Util.nowMilliSecond();
                        C102171c0 c0Var = this.f283584N;
                        long j = c0Var.f300839e;
                        if (j > 0) {
                            c0Var.f300841g += c0Var.f300840f - j;
                        }
                        mo135077P();
                        Log.m105925i(this.f283586e, "%s resume by data gain cdnMediaId %s", mo76634K(), this.f267494W);
                        int i7 = this.f267489T0;
                        if (i7 != -1) {
                            mo79629i0(i7, this.f267491U0);
                            this.f267489T0 = -1;
                            this.f267493V0 = false;
                        } else {
                            this.f267493V0 = !play();
                        }
                        this.f267486Q0 = 3;
                    } else if (this.f267486Q0 != 3 || !this.f283595q.isPlaying()) {
                        Log.m105925i(this.f283586e, "%s start to play video playStatus[%d]", mo76634K(), Integer.valueOf(this.f267486Q0));
                        if (!play()) {
                            i4 = this.f267486Q0;
                        }
                        this.f267486Q0 = i4;
                    }
                } else {
                    Log.m105925i(this.f283586e, "%s prepare cdnMediaId [%s]", mo76634K(), this.f267494W);
                    if (this.f267486Q0 == 5) {
                        this.f267486Q0 = 1;
                    }
                    mo127234f0();
                }
                z = true;
            }
            mo79610W(i2);
            PInt pInt = new PInt();
            PInt pInt2 = new PInt();
            if (!mo79611Y(i2, pInt, pInt2)) {
                Log.m105919d(this.f283586e, "%s can not calc download.", mo76634K());
                Log.m105925i("VideoView.MMVideoView", "%s can not calc download.", mo76634K());
            } else if (mo127235g0(pInt.value, pInt2.value, false)) {
                this.f267495W0 = Math.max(this.f267495W0, pInt2.value);
            }
            return z;
        } else if (i3 == 2) {
            Log.m105924i(this.f283585d, "checkTimer, downloadStatus is download error, playCurrPos is " + i);
            Log.m105929w(this.f283586e, "%s download error.", mo76634K());
            return false;
        } else if (i3 != 3) {
            Log.m105924i(this.f283585d, "checkTimer, downloadStatus is default, playCurrPos is " + i);
            Log.m105929w(this.f283586e, "%s check time default.", mo76634K());
            return false;
        } else {
            Log.m105924i(this.f283585d, "checkTimer, downloadStatus is download finish, playCurrPos is " + i);
            if (this.f283572B) {
                if (this.f267493V0) {
                    int i8 = this.f267489T0;
                    if (i8 != -1) {
                        mo79629i0(i8, true);
                        this.f267489T0 = -1;
                        this.f267493V0 = false;
                    } else {
                        this.f267493V0 = !play();
                    }
                }
                this.f267486Q0 = 3;
                mo79610W(i2);
            } else {
                if (this.f267486Q0 == 5) {
                    this.f267486Q0 = 1;
                }
                mo127234f0();
            }
        }
        return true;
    }

    /* renamed from: b */
    public void mo79614b() {
        super.mo79614b();
        if (this.f267501c1) {
            this.f267499a1 = true;
            stop();
        }
    }

    /* renamed from: b0 */
    public C65339f mo79615b0() {
        return new C102020i();
    }

    /* renamed from: c0 */
    public void mo76635c0() {
        if (!Util.isNullOrNil(this.f283616Q)) {
            this.f267494W = "MMVideo_" + this.f283616Q.hashCode();
            String str = getRootPath() + "MMVideo_" + this.f283616Q.hashCode() + ".mp4";
            this.f267504p0 = str;
            C86013q1.m106461v(C86013q1.m106458s(str));
            Log.m105925i(this.f283586e, "%s set video path [%s %s]", mo76634K(), this.f267494W, this.f267504p0);
        }
    }

    /* renamed from: e */
    public void mo76638e(String str, long j, long j2) {
        if (Util.isEqual(this.f267494W, str)) {
            Log.m105919d(this.f283586e, "%s download  onProgress [%d, %d]", mo76634K(), Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* renamed from: e0 */
    public void mo127233e0() {
        C55393b bVar = this.f267500b1;
        bVar.f157764a = 5;
        bVar.f157765b = 2;
    }

    /* renamed from: f */
    public void mo79617f() {
        super.mo79617f();
        Log.m105925i(this.f283586e, "%s onUIResume stopDownloadByUiPause[%b] currTimeOnUiPause[%d] isPlayOnUiPause[%b]", mo76634K(), Boolean.valueOf(this.f267499a1), Integer.valueOf(this.f283596r), Boolean.valueOf(this.f283597s));
        if (this.f267499a1) {
            mo79629i0(this.f283596r, this.f283597s);
        } else if (this.f283595q != null && C11171e.m11046c(24)) {
            C96875r0 r0Var = this.f283595q;
            if (r0Var instanceof VideoPlayerTextureView) {
                ((VideoPlayerTextureView) r0Var).mo153302E();
            }
        }
    }

    /* renamed from: f0 */
    public void mo127234f0() {
        Log.m105924i(this.f283585d, "prepareVideo and set video path to VideoPlayerTextureView");
        Log.printInfoStack(this.f283586e, "%s prepareVideo", mo76634K());
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            this.f267497Y0 = true;
            r0Var.setVideoPath(this.f267504p0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00dd  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo127235g0(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            com.tencent.mm.pointers.PInt r0 = new com.tencent.mm.pointers.PInt
            r0.<init>()
            com.tencent.mm.pointers.PInt r1 = new com.tencent.mm.pointers.PInt
            r1.<init>()
            r2 = 2
            r3 = 1
            r4 = 0
            uf0.f r5 = r7.f267487R0     // Catch:{ Exception -> 0x0024 }
            boolean r8 = r5.mo89449d(r8, r9, r0, r1)     // Catch:{ Exception -> 0x0024 }
            if (r8 == 0) goto L_0x003a
            com.tencent.mm.modelvideo.a r8 = r7.f267492V     // Catch:{ Exception -> 0x0024 }
            if (r8 == 0) goto L_0x003a
            java.lang.String r9 = r7.f267494W     // Catch:{ Exception -> 0x0024 }
            int r5 = r0.value     // Catch:{ Exception -> 0x0024 }
            int r6 = r1.value     // Catch:{ Exception -> 0x0024 }
            boolean r8 = r8.mo36229c(r9, r5, r6)     // Catch:{ Exception -> 0x0024 }
            goto L_0x003b
        L_0x0024:
            r8 = move-exception
            java.lang.String r9 = r7.f283586e
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r7.mo76634K()
            r5[r4] = r6
            java.lang.String r8 = r8.toString()
            r5[r3] = r8
            java.lang.String r8 = "%s check video data error[%s] "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r8, r5)
        L_0x003a:
            r8 = 0
        L_0x003b:
            java.lang.String r9 = r7.f283585d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "requestVideoData ret is "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = ", cdnMediaId is "
            r5.append(r6)
            java.lang.String r6 = r7.f267494W
            r5.append(r6)
            java.lang.String r6 = ", offset is "
            r5.append(r6)
            int r6 = r0.value
            r5.append(r6)
            java.lang.String r6 = ", length is "
            r5.append(r6)
            int r6 = r1.value
            r5.append(r6)
            java.lang.String r6 = ", isRequestNow is "
            r5.append(r6)
            boolean r6 = r7.f267498Z0
            r5.append(r6)
            java.lang.String r6 = ", isSeek is "
            r5.append(r6)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            if (r8 != 0) goto L_0x00dd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = r7.f267494W
            r9.append(r5)
            java.lang.String r5 = "_"
            r9.append(r5)
            int r6 = r0.value
            r9.append(r6)
            r9.append(r5)
            int r5 = r1.value
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            boolean r5 = r7.f267498Z0
            if (r5 == 0) goto L_0x00cd
            if (r10 == 0) goto L_0x00ab
            goto L_0x00cd
        L_0x00ab:
            java.lang.String r0 = r7.f283586e
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = r7.mo76634K()
            r1[r4] = r5
            r1[r3] = r9
            boolean r9 = r7.f267498Z0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r1[r2] = r9
            r9 = 3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r1[r9] = r10
            java.lang.String r9 = "%s already request video [%s] isRequestNow[%b] isSeek[%b] "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r9, r1)
            goto L_0x00ec
        L_0x00cd:
            r7.f267498Z0 = r3
            com.tencent.mm.modelvideo.a r9 = r7.f267492V
            if (r9 == 0) goto L_0x00ec
            java.lang.String r10 = r7.f267494W
            int r0 = r0.value
            int r1 = r1.value
            r9.mo36230d(r10, r0, r1)
            goto L_0x00ec
        L_0x00dd:
            java.lang.String r9 = r7.f283586e
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r0 = r7.mo76634K()
            r10[r4] = r0
            java.lang.String r0 = "%s already had video data."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r10)
        L_0x00ec:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideo.MMVideoView.mo127235g0(int, int, boolean):boolean");
    }

    public int getCacheTimeSec() {
        return this.f267506y0 == 3 ? getVideoDurationSec() : this.f267495W0;
    }

    public View getInnerVideoView() {
        C96875r0 r0Var = this.f283595q;
        if (r0Var instanceof VideoPlayerTextureView) {
            return (View) r0Var;
        }
        return null;
    }

    public String getMediaId() {
        return this.f267494W;
    }

    public int getReportIdkey() {
        return 100;
    }

    /* renamed from: h */
    public void mo76636h(boolean z, String str, int i) {
        super.mo76636h(z, str, i);
        mo76635c0();
    }

    /* renamed from: h0 */
    public void mo79628h0() {
        this.f267489T0 = -1;
        this.f267495W0 = 0;
        this.f267488S0 = 0;
        this.f267486Q0 = 0;
        this.f267506y0 = 0;
        this.f267493V0 = false;
        this.f267497Y0 = false;
        this.f267498Z0 = false;
        C55393b bVar = this.f267500b1;
        if (bVar != null) {
            this.f267496X0 = bVar.f157764a;
        }
    }

    /* renamed from: i0 */
    public boolean mo79629i0(int i, boolean z) {
        boolean z2;
        int i2 = this.f267506y0;
        if (i2 == 0) {
            String str = this.f283585d;
            Log.m105924i(str, "seekTo, downloadStatus is download default, isPrepared is " + mo135074I());
            if (!mo135074I()) {
                if (this.f283571A) {
                    this.f283602x = z;
                    this.f267491U0 = z;
                    this.f283603y = i;
                    this.f267489T0 = i;
                } else {
                    this.f283602x = z;
                    if (i > 0) {
                        this.f283603y = i;
                    } else {
                        this.f283603y = this.f283596r;
                    }
                }
                start();
            }
        } else if (i2 == 1) {
            Log.m105924i(this.f283585d, "seekTo, downloadStatus is downloading");
            this.f267486Q0 = 2;
            PInt pInt = new PInt();
            PInt pInt2 = new PInt();
            mo79611Y(i, pInt, pInt2);
            if (mo127235g0(pInt.value, pInt2.value, true)) {
                this.f267489T0 = -1;
                this.f267493V0 = false;
                this.f267495W0 = pInt2.value;
                this.f267486Q0 = 3;
                super.mo79613a((double) i, z);
            } else {
                this.f267489T0 = i;
                this.f267491U0 = z;
                this.f267493V0 = true;
                Log.m105925i(this.f283586e, "%s pauseByDataBlock ", mo76634K());
                mo129179R();
                pause();
                z2 = false;
                Log.printInfoStack(this.f283586e, "%s seek video time %d, download status %d playStatus %d", mo76634K(), Integer.valueOf(i), Integer.valueOf(this.f267506y0), Integer.valueOf(this.f267486Q0));
                return z2;
            }
        } else if (i2 == 2) {
            Log.m105924i(this.f283585d, "seekTo, downloadStatus is download error");
        } else if (i2 == 3) {
            Log.m105924i(this.f283585d, "seekTo, downloadStatus is download finish");
            super.mo79613a((double) i, z);
        }
        z2 = true;
        Log.printInfoStack(this.f283586e, "%s seek video time %d, download status %d playStatus %d", mo76634K(), Integer.valueOf(i), Integer.valueOf(this.f267506y0), Integer.valueOf(this.f267486Q0));
        return z2;
    }

    /* renamed from: k */
    public void mo127239k() {
    }

    /* renamed from: l */
    public void mo76639l(String str, long j, long j2, String str2) {
        Log.m105924i(this.f283585d, "onMoovReady");
        Log.m105925i(this.f283586e, "%s deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s", mo76634K(), Long.valueOf(j), Integer.valueOf(this.f267488S0), this.f267494W);
        if (this.f267488S0 != 0) {
            Log.m105928w(this.f283586e, "moov had callback, do nothing.");
            return;
        }
        C102171c0 c0Var = this.f283584N;
        if (c0Var.f300847m == 0) {
            c0Var.f300847m = Util.nowMilliSecond();
        }
        try {
            C65339f fVar = this.f267487R0;
            if (fVar == null) {
                Log.m105929w(this.f283586e, "%s parser is null, thread is error.", mo76634K());
            } else if (fVar.mo89446a(this.f267504p0, j)) {
                this.f267488S0 = this.f267487R0.mo89447b();
                Log.m105925i(this.f283586e, "%s mp4 parse moov success. duration %d cdnMediaId %s ", mo76634K(), Integer.valueOf(this.f267488S0), this.f267494W);
                if (mo127232a0(0)) {
                    mo127234f0();
                }
                if (this.f267489T0 == -1) {
                    this.f267486Q0 = 1;
                } else {
                    this.f267486Q0 = 2;
                }
            } else {
                Log.m105929w(this.f283586e, "%s mp4 parse moov error. cdnMediaId %s", mo76634K(), this.f267494W);
                C55394a aVar = this.f267492V;
                if (aVar != null) {
                    aVar.mo36230d(this.f267494W, 0, -1);
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f283586e, e, "%s deal moov ready error [%s]", mo76634K(), this.f267494W);
        }
    }

    /* renamed from: m */
    public void mo76640m(String str, int i) {
        if (Util.isEqual(this.f267494W, str) && this.f267506y0 != 3) {
            Log.m105925i(this.f283586e, "%s download finish [%d]", mo76634K(), Integer.valueOf(i));
            if (i == 0) {
                this.f267506y0 = 3;
            }
            C96814a.C96815a aVar = this.f267505x0;
            if (aVar != null) {
                aVar.mo129208o(this.f267504p0, this.f267486Q0 > 0);
            }
            Log.m105924i(this.f283585d, "onFinish, startTimer");
            mo127230T(true);
            this.f267498Z0 = false;
        }
    }

    public void onCompletion() {
        C55394a aVar;
        if (this.f267502d1) {
            mo79629i0(0, true);
            try {
                mo79610W(getVideoDurationSec());
                C96814a.C57542d dVar = this.f283599u;
                if (dVar != null) {
                    dVar.mo81284b();
                }
            } catch (Throwable th) {
                Log.m105920e(this.f283586e, th.toString());
            }
        } else {
            super.onCompletion();
            String str = this.f267494W;
            if (!(str == null || (aVar = this.f267492V) == null)) {
                aVar.mo36227a(str);
            }
            mo79628h0();
            C96875r0 r0Var = this.f283595q;
            if (r0Var != null) {
                r0Var.stop();
            }
        }
        this.f267487R0.release();
    }

    public void onDataAvailable(String str, long j, long j2) {
        this.f267498Z0 = false;
        if (j <= -1 || j2 <= -1) {
            Log.m105929w(this.f283586e, "%s deal data available error offset[%d], length[%d]", mo76634K(), Long.valueOf(j), Long.valueOf(j2));
        } else if (Util.isEqual(this.f267494W, str)) {
            try {
                this.f267495W0 = this.f267487R0.mo89448c((int) j, (int) j2);
            } catch (Exception e) {
                Log.m105921e(this.f283586e, "%s deal data available file pos to video time error[%s] ", mo76634K(), e.toString());
            }
            Log.m105925i(this.f283586e, "%s deal data available. offset[%d] length[%d] cachePlayTime[%d]", mo76634K(), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(this.f267495W0));
            Log.m105924i(this.f283585d, "onDataAvailable, startTimer");
            mo127230T(true);
        }
    }

    public boolean pause() {
        boolean pause = super.pause();
        if (pause) {
            this.f267498Z0 = false;
            this.f267486Q0 = 4;
        }
        return pause;
    }

    public boolean play() {
        boolean play = super.play();
        if (play) {
            this.f267486Q0 = 3;
        }
        return play;
    }

    public void setDownloadStatus(int i) {
        this.f267506y0 = i;
    }

    public void setFilepath(String str) {
        this.f267504p0 = str;
    }

    public void setIMMDownloadFinish(C96814a.C96815a aVar) {
        this.f267505x0 = aVar;
    }

    public void setIOnlineVideoProxy(C55394a aVar) {
        this.f267492V = aVar;
        aVar.mo36228b(this);
    }

    public void setLoop(boolean z) {
        this.f267502d1 = z;
    }

    public void setRootPath(String str) {
        this.f267490U = str;
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C96875r0 r0Var = this.f283595q;
        if (r0Var instanceof VideoPlayerTextureView) {
            ((VideoPlayerTextureView) r0Var).setScaleType(eVar);
            mo135073G(600, (long) (getReportIdkey() + 14), 1, false);
        }
    }

    public void start() {
        Log.m105925i(this.f283586e, "%s start cdnMediaId[%s] timeDuration[%d]", mo76634K(), this.f267494W, Integer.valueOf(this.f267488S0));
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            if (Util.isNullOrNil(r0Var.getVideoPath())) {
                mo129179R();
                this.f267501c1 = true;
                this.f267488S0 = 0;
                this.f267506y0 = 1;
                C55394a aVar = this.f267492V;
                if (aVar != null) {
                    aVar.mo36231f(this.f267494W, this.f267504p0, this.f283616Q);
                    this.f267492V.mo36228b(this);
                }
                mo135076O();
            } else {
                play();
            }
            mo135073G(600, (long) (getReportIdkey() + 1), 1, false);
        }
    }

    public void stop() {
        C55394a aVar = this.f267492V;
        if (aVar != null) {
            aVar.mo36227a(this.f267494W);
        }
        mo79628h0();
        super.stop();
        this.f267487R0.release();
    }

    /* renamed from: z */
    public void mo86881z(boolean z) {
        super.mo86881z(z);
        mo135072F();
    }

    public MMVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MMVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
