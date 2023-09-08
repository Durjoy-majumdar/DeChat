package com.tencent.p014mm.plugin.game.media.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.ITPPlayer;
import eb0.C97621e;
import java.util.HashSet;
import java.util.Set;
import ny1.C100233a;
import ny1.C100243e;
import vd3.C102173o;

/* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoView */
public class GameVideoView extends RelativeLayout implements C96814a {

    /* renamed from: A */
    public static Set<String> f271851A = new HashSet();

    /* renamed from: d */
    public Context f271852d = getContext();

    /* renamed from: e */
    public C96814a f271853e;

    /* renamed from: f */
    public C96814a.C96817e f271854f = C96814a.C96817e.CONTAIN;

    /* renamed from: g */
    public boolean f271855g = false;

    /* renamed from: h */
    public float f271856h = -1.0f;

    /* renamed from: i */
    public int f271857i;

    /* renamed from: j */
    public boolean f271858j;

    /* renamed from: n */
    public boolean f271859n;

    /* renamed from: o */
    public String f271860o;

    /* renamed from: p */
    public int f271861p = 0;

    /* renamed from: q */
    public C102173o f271862q;

    /* renamed from: r */
    public C97621e f271863r = new C97621e();

    /* renamed from: s */
    public C94132e f271864s;

    /* renamed from: t */
    public C94133f f271865t;

    /* renamed from: u */
    public C100233a f271866u;

    /* renamed from: v */
    public boolean f271867v = true;

    /* renamed from: w */
    public C96814a.C96815a f271868w = new C94128a();

    /* renamed from: x */
    public C96814a.C96816c f271869x = new C94129b(this);

    /* renamed from: y */
    public C97621e.C97622a f271870y = new C94130c(this);

    /* renamed from: z */
    public C96814a.C57541b f271871z = new C94131d();

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoView$a */
    public class C94128a implements C96814a.C96815a {
        public C94128a() {
        }

        /* renamed from: o */
        public void mo129208o(String str, boolean z) {
            Log.m105925i("MicroMsg.Haowan.GameVideoView", "onDownloadFinish path [%s] isPlayNow [%b]", str, Boolean.valueOf(z));
            if (str != null && str.endsWith(".temp")) {
                String replace = str.replace(".temp", "");
                C86013q1.m106442c(str, replace);
                GameVideoView gameVideoView = GameVideoView.this;
                gameVideoView.f271859n = true;
                gameVideoView.f271860o = replace;
                ((HashSet) GameVideoView.f271851A).add(str);
                Log.m105925i("MicroMsg.Haowan.GameVideoView", "onDownloadFinish tempPath [%s] newPath [%s]", str, replace);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoView$b */
    public class C94129b implements C96814a.C96816c {
        public C94129b(GameVideoView gameVideoView) {
        }

        public void idkeyStat(long j, long j2, long j3, boolean z) {
            C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
        }

        public void kvStat(int i, String str) {
            C115669n.INSTANCE.kvStat(i, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoView$c */
    public class C94130c implements C97621e.C97622a {
        public C94130c(GameVideoView gameVideoView) {
        }

        /* renamed from: I2 */
        public void mo23179I2() {
        }

        /* renamed from: N3 */
        public void mo23180N3() {
        }

        /* renamed from: R0 */
        public void mo23181R0() {
        }

        /* renamed from: f2 */
        public void mo23185f2() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoView$d */
    public class C94131d implements C96814a.C57541b {
        public C94131d() {
        }

        /* renamed from: F */
        public void mo22955F(String str, String str2) {
        }

        /* renamed from: I1 */
        public void mo22956I1(String str, String str2) {
        }

        /* renamed from: I3 */
        public void mo22957I3(String str, String str2, Boolean bool) {
        }

        /* renamed from: L */
        public void mo22958L(String str, String str2) {
            Log.m105925i("MicroMsg.Haowan.GameVideoView", "%d onVideoEnded", Integer.valueOf(hashCode()));
            GameVideoView gameVideoView = GameVideoView.this;
            if (gameVideoView.f271867v) {
                gameVideoView.mo79613a(0.0d, true);
                return;
            }
            C96814a aVar = gameVideoView.f271853e;
            if (aVar != null) {
                aVar.pause();
            }
        }

        /* renamed from: T */
        public void mo22960T(String str, String str2, String str3, int i, int i2) {
            Log.m105929w("MicroMsg.Haowan.GameVideoView", "%d onError[%s %d, %d]", Integer.valueOf(hashCode()), str3, Integer.valueOf(i), Integer.valueOf(i2));
        }

        /* renamed from: Z */
        public void mo22962Z(String str, String str2) {
            Log.m105925i("MicroMsg.Haowan.GameVideoView", "%d onPrepared", Integer.valueOf(hashCode()));
            C94132e eVar = GameVideoView.this.f271864s;
            if (eVar != null) {
                C94141f fVar = (C94141f) eVar;
                fVar.f271883a.f271847B.postDelayed(new C94140e(fVar), 200);
            }
        }

        /* renamed from: a0 */
        public void mo22963a0(String str, String str2) {
            Log.m105919d("MicroMsg.Haowan.GameVideoView", "%d onVideoPause", Integer.valueOf(hashCode()));
            C94133f fVar = GameVideoView.this.f271865t;
            if (fVar != null) {
                fVar.mo129154a(false);
            }
            GameVideoView.this.setKeepScreenOn(false);
            GameVideoView.this.f271863r.mo136889a();
        }

        /* renamed from: l0 */
        public void mo22964l0(String str, String str2, int i, int i2) {
            Log.m105925i("MicroMsg.Haowan.GameVideoView", "%d onGetVideoSize[%d %d]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
        }

        /* renamed from: m0 */
        public void mo22965m0(String str, String str2) {
            Log.m105919d("MicroMsg.Haowan.GameVideoView", "%d onVideoPlay", Integer.valueOf(hashCode()));
            C94133f fVar = GameVideoView.this.f271865t;
            if (fVar != null) {
                fVar.mo129154a(true);
            }
            GameVideoView.this.setKeepScreenOn(true);
            GameVideoView gameVideoView = GameVideoView.this;
            gameVideoView.f271863r.mo136891c(gameVideoView.f271870y);
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoView$e */
    public interface C94132e {
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoView$f */
    public interface C94133f {
        /* renamed from: a */
        void mo129154a(boolean z);
    }

    public GameVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static String getRootPath() {
        return C41872f.m45392b(C41872f.C41873a.ONE_WEEK) + "haowan/";
    }

    /* renamed from: a */
    public boolean mo79613a(double d, boolean z) {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            return aVar.mo79613a(d, z);
        }
        return false;
    }

    /* renamed from: b */
    public void mo79614b() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            this.f271861p = aVar.getCurrPosSec();
            this.f271853e.mo79614b();
        }
        this.f271863r.mo136889a();
        setKeepScreenOn(false);
    }

    /* renamed from: c */
    public void mo79616c() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            ((AbstractVideoView) aVar).mo79616c();
        }
        this.f271863r.mo136889a();
        setKeepScreenOn(false);
    }

    /* renamed from: d */
    public final C96814a mo129190d() {
        GameMMVideoView gameMMVideoView = new GameMMVideoView(this.f271852d);
        gameMMVideoView.setReporter(this.f271869x);
        gameMMVideoView.setIMMVideoViewCallback(this.f271871z);
        gameMMVideoView.setIMMDownloadFinish(this.f271868w);
        String rootPath = getRootPath();
        FilePathGenerator.checkMkdir(rootPath);
        gameMMVideoView.setRootPath(rootPath);
        gameMMVideoView.setLoop(this.f271867v);
        C100233a aVar = new C100233a(gameMMVideoView);
        this.f271866u = aVar;
        gameMMVideoView.setIOnlineVideoProxy(aVar);
        return gameMMVideoView;
    }

    /* renamed from: e */
    public final String mo129191e(String str) {
        return getRootPath() + "MMVideo_" + str.hashCode() + ".mp4";
    }

    /* renamed from: f */
    public void mo79617f() {
        C96814a aVar;
        String str;
        boolean z = false;
        if (this.f271853e instanceof GameMMVideoView) {
            if (C86013q1.m106450k(this.f271860o)) {
                str = this.f271860o;
            } else if (C86013q1.m106450k(mo129191e(this.f271860o))) {
                str = mo129191e(this.f271860o);
            }
            this.f271853e.stop();
            mo76636h(this.f271858j, str, this.f271857i);
            this.f271853e.mo79613a((double) this.f271861p, true);
            Log.m105925i("MicroMsg.Haowan.GameVideoView", "change to local video. currPosSec:%d", Integer.valueOf(this.f271861p));
            MMHandlerThread.postToMainThreadDelayed(new C100243e(this), 1000);
            z = true;
        }
        if (!z && (aVar = this.f271853e) != null) {
            aVar.mo79617f();
        }
    }

    /* renamed from: g */
    public final String mo129192g(String str) {
        return getRootPath() + "MMVideo_" + str.hashCode() + ".mp4.temp";
    }

    public int getCacheTimeSec() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            return aVar.getCacheTimeSec();
        }
        return 0;
    }

    public int getCurrPosMs() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            return aVar.getCurrPosMs();
        }
        return 0;
    }

    public int getCurrPosSec() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            return aVar.getCurrPosSec();
        }
        return 0;
    }

    public String getFilePath() {
        C96814a aVar = this.f271853e;
        return aVar instanceof GameMMVideoView ? ((GameMMVideoView) aVar).getFilePath() : this.f271860o;
    }

    public String getLocalPath() {
        return this.f271859n ? this.f271860o : mo129191e(this.f271860o);
    }

    public String getMediaId() {
        C96814a aVar = this.f271853e;
        if (aVar instanceof GameMMVideoView) {
            return ((GameMMVideoView) aVar).getMediaId();
        }
        return null;
    }

    public int getPlayerType() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            return aVar.getPlayerType();
        }
        return 0;
    }

    public int getVideoDurationSec() {
        C96814a aVar = this.f271853e;
        return aVar != null ? aVar.getVideoDurationSec() : this.f271857i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r4.value) != false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76636h(boolean r4, java.lang.String r5, int r6) {
        /*
            r3 = this;
            r3.f271857i = r6
            r3.f271858j = r4
            com.tencent.mm.pointers.PString r4 = new com.tencent.mm.pointers.PString
            r4.<init>()
            r4.value = r5
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0014
            goto L_0x0032
        L_0x0014:
            java.lang.String r6 = r4.value
            java.lang.String r2 = "file://"
            int r6 = r6.indexOf(r2)
            if (r6 != 0) goto L_0x0028
            java.lang.String r6 = r4.value
            r2 = 7
            java.lang.String r6 = r6.substring(r2)
            r4.value = r6
            goto L_0x0030
        L_0x0028:
            java.lang.String r4 = r4.value
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x0032
        L_0x0030:
            r4 = 1
            goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            r3.f271859n = r4
            if (r4 == 0) goto L_0x003a
            r3.f271860o = r5
            goto L_0x0052
        L_0x003a:
            java.lang.String r4 = r3.mo129191e(r5)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = r3.mo129192g(r5)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            r3.f271859n = r0
            r3.f271860o = r4
            goto L_0x0052
        L_0x0050:
            r3.f271860o = r5
        L_0x0052:
            com.tencent.mm.pluginsdk.ui.a r4 = r3.f271853e
            java.lang.String r6 = "MicroMsg.Haowan.GameVideoView"
            if (r4 != 0) goto L_0x009d
            boolean r4 = r3.f271858j
            if (r4 != 0) goto L_0x0062
            boolean r4 = r3.f271859n
            if (r4 != 0) goto L_0x0062
            r4 = 0
            goto L_0x0063
        L_0x0062:
            r4 = 1
        L_0x0063:
            if (r4 == 0) goto L_0x008b
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r5
            java.lang.String r5 = "new use common video view! path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
            com.tencent.mm.pluginsdk.ui.CommonVideoView r4 = new com.tencent.mm.pluginsdk.ui.CommonVideoView
            android.content.Context r5 = r3.f271852d
            r4.<init>(r5)
            r4.f283618S = r1
            com.tencent.mm.pluginsdk.ui.a$c r5 = r3.f271869x
            r4.setReporter(r5)
            com.tencent.mm.pluginsdk.ui.a$b r5 = r3.f271871z
            r4.setIMMVideoViewCallback(r5)
            boolean r5 = r3.f271867v
            r4.setLoop(r5)
            r3.f271853e = r4
            goto L_0x012a
        L_0x008b:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r5
            java.lang.String r5 = "new use mm video view! path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
            com.tencent.mm.pluginsdk.ui.a r4 = r3.mo129190d()
            r3.f271853e = r4
            goto L_0x012a
        L_0x009d:
            boolean r2 = r3.f271858j
            if (r2 != 0) goto L_0x00a7
            boolean r2 = r3.f271859n
            if (r2 != 0) goto L_0x00a7
            r2 = 0
            goto L_0x00a8
        L_0x00a7:
            r2 = 1
        L_0x00a8:
            if (r2 == 0) goto L_0x00f4
            boolean r2 = r4 instanceof com.tencent.p014mm.modelvideo.MMVideoView
            if (r2 == 0) goto L_0x00e4
            r4.stop()
            com.tencent.mm.pluginsdk.ui.a r4 = r3.f271853e
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r4 = (com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView) r4
            r4.mo135081w()
            com.tencent.mm.pluginsdk.ui.a r4 = r3.f271853e
            android.view.View r4 = (android.view.View) r4
            r3.removeView(r4)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r5
            java.lang.String r5 = "use common video view! path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
            com.tencent.mm.pluginsdk.ui.CommonVideoView r4 = new com.tencent.mm.pluginsdk.ui.CommonVideoView
            android.content.Context r5 = r3.f271852d
            r4.<init>(r5)
            r4.f283618S = r1
            com.tencent.mm.pluginsdk.ui.a$c r5 = r3.f271869x
            r4.setReporter(r5)
            com.tencent.mm.pluginsdk.ui.a$b r5 = r3.f271871z
            r4.setIMMVideoViewCallback(r5)
            boolean r5 = r3.f271867v
            r4.setLoop(r5)
            r3.f271853e = r4
            goto L_0x012a
        L_0x00e4:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r5
            java.lang.String r5 = "use last common video view! path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
            com.tencent.mm.pluginsdk.ui.a r4 = r3.f271853e
            r4.stop()
            goto L_0x0129
        L_0x00f4:
            boolean r2 = r4 instanceof com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView
            if (r2 == 0) goto L_0x011a
            r4.stop()
            com.tencent.mm.pluginsdk.ui.a r4 = r3.f271853e
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r4 = (com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView) r4
            r4.mo135081w()
            com.tencent.mm.pluginsdk.ui.a r4 = r3.f271853e
            android.view.View r4 = (android.view.View) r4
            r3.removeView(r4)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r5
            java.lang.String r5 = "use mm video view! path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
            com.tencent.mm.pluginsdk.ui.a r4 = r3.mo129190d()
            r3.f271853e = r4
            goto L_0x012a
        L_0x011a:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r5
            java.lang.String r5 = "use last mm video view! path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
            com.tencent.mm.pluginsdk.ui.a r4 = r3.f271853e
            r4.stop()
        L_0x0129:
            r0 = 0
        L_0x012a:
            com.tencent.mm.pluginsdk.ui.a$e r4 = r3.f271854f
            r3.setScaleType(r4)
            float r4 = r3.f271856h
            r3.setPlayRate(r4)
            boolean r4 = r3.f271855g
            r3.setMute(r4)
            if (r0 == 0) goto L_0x0153
            vd3.o r4 = r3.f271862q
            r3.setVideoFooterView(r4)
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r5 = -1
            r6 = -2
            r4.<init>(r5, r6)
            r5 = 13
            r4.addRule(r5)
            com.tencent.mm.pluginsdk.ui.a r5 = r3.f271853e
            android.view.View r5 = (android.view.View) r5
            r3.addView(r5, r4)
        L_0x0153:
            com.tencent.mm.pluginsdk.ui.a r4 = r3.f271853e
            boolean r5 = r3.f271858j
            java.lang.String r6 = r3.f271860o
            int r0 = r3.f271857i
            r4.mo76636h(r5, r6, r0)
            com.tencent.mm.pluginsdk.ui.a r4 = r3.f271853e
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.game.media.preview.GameMMVideoView
            if (r5 == 0) goto L_0x016f
            com.tencent.mm.plugin.game.media.preview.GameMMVideoView r4 = (com.tencent.p014mm.plugin.game.media.preview.GameMMVideoView) r4
            java.lang.String r5 = r3.f271860o
            java.lang.String r5 = r3.mo129192g(r5)
            r4.setFilepath(r5)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.media.preview.GameVideoView.mo76636h(boolean, java.lang.String, int):void");
    }

    /* renamed from: i */
    public boolean mo129198i() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            return ((CommonVideoView) aVar).mo129198i();
        }
        return false;
    }

    public boolean isPlaying() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            return ((AbstractVideoView) aVar).isPlaying();
        }
        return false;
    }

    public boolean pause() {
        if (this.f271853e == null) {
            return false;
        }
        setKeepScreenOn(false);
        this.f271863r.mo136889a();
        return this.f271853e.pause();
    }

    public boolean play() {
        if (this.f271853e == null) {
            return false;
        }
        setKeepScreenOn(true);
        this.f271863r.mo136891c(this.f271870y);
        return this.f271853e.play();
    }

    public void setCover(Bitmap bitmap) {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            aVar.setCover(bitmap);
        }
    }

    public void setFullDirection(int i) {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            aVar.setFullDirection(i);
        }
    }

    public void setIMMVideoViewCallback(C96814a.C57541b bVar) {
        if (bVar != null) {
            this.f271871z = bVar;
        }
    }

    public void setIsShowBasicControls(boolean z) {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            aVar.setIsShowBasicControls(z);
        }
    }

    public void setLoop(boolean z) {
        this.f271867v = z;
        this.f271853e.setLoop(z);
    }

    public void setLoopCompletionCallback(C96814a.C57542d dVar) {
    }

    public void setMute(boolean z) {
        this.f271855g = z;
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            aVar.setMute(z);
        }
    }

    public boolean setPlayRate(float f) {
        if (f <= 0.0f) {
            return false;
        }
        this.f271856h = f;
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            return aVar.setPlayRate(f);
        }
        return false;
    }

    public void setPlayerListener(C94133f fVar) {
        this.f271865t = fVar;
    }

    public void setScaleType(C96814a.C96817e eVar) {
        this.f271854f = eVar;
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            aVar.setScaleType(eVar);
        }
    }

    public void setVideoFooterView(C102173o oVar) {
        this.f271862q = oVar;
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            aVar.setVideoFooterView(oVar);
        }
    }

    public void setVideoPreparedListener(C94132e eVar) {
        this.f271864s = eVar;
    }

    public void start() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            aVar.start();
            setKeepScreenOn(true);
            this.f271863r.mo136891c(this.f271870y);
        }
    }

    public void stop() {
        C96814a aVar = this.f271853e;
        if (aVar != null) {
            aVar.stop();
            this.f271863r.mo136889a();
            setKeepScreenOn(false);
        }
    }

    public GameVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
