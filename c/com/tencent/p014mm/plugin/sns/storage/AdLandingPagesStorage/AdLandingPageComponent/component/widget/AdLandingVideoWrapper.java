package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.autogen.events.OpenSnsAdFloatPageEvent;
import com.tencent.p014mm.modelvideo.AdLandingMMVideoView;
import com.tencent.p014mm.modelvideo.FullScreenMMVideoView;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95050a2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95079c2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.C95260a;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.xweb.IXWebBroadcastListener;
import eb0.C97621e;
import fm0.C8136w;
import p749xh.C66261f3;
import ps2.C100891r;
import qs2.C101284p0;
import tm0.C90557z;
import vd3.C102173o;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper */
public class AdLandingVideoWrapper extends RelativeLayout implements C96814a, C96814a.C96815a, C96814a.C96816c, C96814a.C57541b, C97621e.C97622a {

    /* renamed from: v */
    public static final /* synthetic */ int f276424v = 0;

    /* renamed from: d */
    public Context f276425d;

    /* renamed from: e */
    public C96814a f276426e;

    /* renamed from: f */
    public C96814a.C57541b f276427f;

    /* renamed from: g */
    public C102173o f276428g;

    /* renamed from: h */
    public C96814a.C96817e f276429h;

    /* renamed from: i */
    public boolean f276430i;

    /* renamed from: j */
    public float f276431j;

    /* renamed from: n */
    public int f276432n;

    /* renamed from: o */
    public boolean f276433o;

    /* renamed from: p */
    public boolean f276434p;

    /* renamed from: q */
    public String f276435q;

    /* renamed from: r */
    public boolean f276436r;

    /* renamed from: s */
    public C97621e f276437s;

    /* renamed from: t */
    public C95249b f276438t;

    /* renamed from: u */
    public MTimerHandler f276439u;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper$a */
    public class C95248a implements MTimerHandler.CallBack {
        public C95248a() {
        }

        public boolean onTimerExpired() {
            SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper$1");
            AdLandingVideoWrapper adLandingVideoWrapper = AdLandingVideoWrapper.this;
            int i = AdLandingVideoWrapper.f276424v;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            C96814a aVar = adLandingVideoWrapper.f276426e;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            if (aVar != null) {
                AdLandingVideoWrapper adLandingVideoWrapper2 = AdLandingVideoWrapper.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                C95249b bVar = adLandingVideoWrapper2.f276438t;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                if (bVar != null) {
                    AdLandingVideoWrapper adLandingVideoWrapper3 = AdLandingVideoWrapper.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                    C95249b bVar2 = adLandingVideoWrapper3.f276438t;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                    if (bVar2 != null) {
                        AdLandingVideoWrapper adLandingVideoWrapper4 = AdLandingVideoWrapper.this;
                        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                        C96814a aVar2 = adLandingVideoWrapper4.f276426e;
                        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                        if (aVar2.isPlaying()) {
                            AdLandingVideoWrapper adLandingVideoWrapper5 = AdLandingVideoWrapper.this;
                            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                            C95249b bVar3 = adLandingVideoWrapper5.f276438t;
                            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                            AdLandingVideoWrapper adLandingVideoWrapper6 = AdLandingVideoWrapper.this;
                            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                            C96814a aVar3 = adLandingVideoWrapper6.f276426e;
                            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
                            int currPosSec = aVar3.getCurrPosSec();
                            C95050a2.C95056h hVar = (C95050a2.C95056h) bVar3;
                            hVar.getClass();
                            SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$5");
                            C95050a2 a2Var = C95050a2.this;
                            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                            MMHandler mMHandler = a2Var.f275856G;
                            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                            mMHandler.post(new C95079c2(hVar));
                            C95050a2 a2Var2 = C95050a2.this;
                            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                            C101284p0 X = a2Var2.mo131546X();
                            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                            if (X.f296675C != null) {
                                int i2 = currPosSec * 1000;
                                C95050a2 a2Var3 = C95050a2.this;
                                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                                C101284p0 X2 = a2Var3.mo131546X();
                                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                                if (i2 >= X2.f296675C.f296648b) {
                                    C95050a2 a2Var4 = C95050a2.this;
                                    SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                                    boolean z = a2Var4.f275852C;
                                    SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                                    if (!z) {
                                        C95050a2 a2Var5 = C95050a2.this;
                                        SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                                        a2Var5.f275852C = true;
                                        SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                                        OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent = new OpenSnsAdFloatPageEvent();
                                        OpenSnsAdFloatPageEvent.C92539a aVar4 = openSnsAdFloatPageEvent.f264978d;
                                        C95050a2 a2Var6 = C95050a2.this;
                                        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                                        C101284p0 X3 = a2Var6.mo131546X();
                                        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                                        aVar4.f264979a = X3.f296675C.f296647a;
                                        openSnsAdFloatPageEvent.publish();
                                    }
                                }
                            }
                            SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$5");
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper$1");
                    return true;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper$1");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper$b */
    public interface C95249b {
    }

    public AdLandingVideoWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a.C57541b bVar = this.f276427f;
        if (bVar != null) {
            bVar.mo22955F(str, str2);
        }
        SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: I2 */
    public void mo23179I2() {
        SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a.C57541b bVar = this.f276427f;
        if (bVar != null) {
            bVar.mo22957I3(str, str2, bool);
        }
        SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        Log.m105925i("MicroMsg.AdLandingVideoWrapper", "%d onVideoEnded", Integer.valueOf(hashCode()));
        C96814a.C57541b bVar = this.f276427f;
        if (bVar != null) {
            bVar.mo22958L(str, str2);
        }
        C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 35);
        SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: N3 */
    public void mo23180N3() {
        SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: R0 */
    public void mo23181R0() {
        SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        Log.m105929w("MicroMsg.AdLandingVideoWrapper", "%d onError[%s %d, %d]", Integer.valueOf(hashCode()), str3, Integer.valueOf(i), Integer.valueOf(i2));
        C96814a.C57541b bVar = this.f276427f;
        if (bVar != null) {
            bVar.mo22960T(str, str2, str3, i, i2);
        }
        C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 36);
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        Log.m105925i("MicroMsg.AdLandingVideoWrapper", "%d onPrepared", Integer.valueOf(hashCode()));
        C96814a.C57541b bVar = this.f276427f;
        if (bVar != null) {
            bVar.mo22962Z(str, str2);
        }
        SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: a */
    public boolean mo79613a(double d, boolean z) {
        SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            boolean a = aVar.mo79613a(d, z);
            SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return false;
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        Log.m105919d("MicroMsg.AdLandingVideoWrapper", "%d onVideoPause", Integer.valueOf(hashCode()));
        setKeepScreenOn(false);
        this.f276437s.mo136889a();
        C96814a.C57541b bVar = this.f276427f;
        if (bVar != null) {
            bVar.mo22963a0(str, str2);
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: b */
    public void mo79614b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.mo79614b();
        }
        this.f276437s.mo136889a();
        setKeepScreenOn(false);
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: c */
    public void mo79616c() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.mo79616c();
        }
        this.f276437s.mo136889a();
        setKeepScreenOn(false);
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: d */
    public final C96814a mo131772d() {
        SnsMethodCalculate.markStartTimeMs("createFullScreenMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        try {
            FullScreenMMVideoView fullScreenMMVideoView = new FullScreenMMVideoView(this.f276425d);
            fullScreenMMVideoView.setReporter(this);
            fullScreenMMVideoView.setIMMVideoViewCallback(this);
            fullScreenMMVideoView.setIMMDownloadFinish(this);
            String g = C100891r.m132212g();
            FilePathGenerator.checkMkdir(g);
            fullScreenMMVideoView.setRootPath(g);
            fullScreenMMVideoView.setIOnlineVideoProxy(new C95260a());
            SnsMethodCalculate.markEndTimeMs("createFullScreenMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return fullScreenMMVideoView;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingVideoWrapper", th.toString());
            FullScreenMMVideoView fullScreenMMVideoView2 = new FullScreenMMVideoView(this.f276425d);
            SnsMethodCalculate.markEndTimeMs("createFullScreenMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return fullScreenMMVideoView2;
        }
    }

    /* renamed from: e */
    public final C96814a mo131773e() {
        SnsMethodCalculate.markStartTimeMs("createMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        AdLandingMMVideoView adLandingMMVideoView = new AdLandingMMVideoView(this.f276425d);
        adLandingMMVideoView.setReporter(this);
        adLandingMMVideoView.setIMMVideoViewCallback(this);
        adLandingMMVideoView.setIMMDownloadFinish(this);
        String g = C100891r.m132212g();
        FilePathGenerator.checkMkdir(g);
        adLandingMMVideoView.setRootPath(g);
        adLandingMMVideoView.setIOnlineVideoProxy(new C95260a());
        SnsMethodCalculate.markEndTimeMs("createMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return adLandingMMVideoView;
    }

    /* renamed from: f */
    public void mo79617f() {
        SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.mo79617f();
        }
        SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: f2 */
    public void mo23185f2() {
        SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: g */
    public void mo131774g() {
        SnsMethodCalculate.markStartTimeMs("startPlayTimer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f276439u.stopTimer();
        this.f276439u.startTimer(1000);
        SnsMethodCalculate.markEndTimeMs("startPlayTimer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public int getCacheTimeSec() {
        SnsMethodCalculate.markStartTimeMs("getCacheTimeSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            int cacheTimeSec = aVar.getCacheTimeSec();
            SnsMethodCalculate.markEndTimeMs("getCacheTimeSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return cacheTimeSec;
        }
        SnsMethodCalculate.markEndTimeMs("getCacheTimeSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return 0;
    }

    public int getCurrPosMs() {
        SnsMethodCalculate.markStartTimeMs("getCurrPosMs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            int currPosMs = aVar.getCurrPosMs();
            SnsMethodCalculate.markEndTimeMs("getCurrPosMs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return currPosMs;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrPosMs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return 0;
    }

    public int getCurrPosSec() {
        SnsMethodCalculate.markStartTimeMs("getCurrPosSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            int currPosSec = aVar.getCurrPosSec();
            SnsMethodCalculate.markEndTimeMs("getCurrPosSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return currPosSec;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrPosSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return 0;
    }

    public View getInnerVideoView() {
        SnsMethodCalculate.markStartTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar instanceof AdLandingMMVideoView) {
            View innerVideoView = ((AdLandingMMVideoView) aVar).getInnerVideoView();
            SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return innerVideoView;
        } else if (aVar instanceof MMVideoView) {
            View innerVideoView2 = ((MMVideoView) aVar).getInnerVideoView();
            SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return innerVideoView2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return null;
        }
    }

    public int getPlayerType() {
        SnsMethodCalculate.markStartTimeMs("getPlayerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            int playerType = aVar.getPlayerType();
            SnsMethodCalculate.markEndTimeMs("getPlayerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return playerType;
        }
        SnsMethodCalculate.markEndTimeMs("getPlayerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return 0;
    }

    public int getVideoDurationSec() {
        SnsMethodCalculate.markStartTimeMs("getVideoDurationSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            int videoDurationSec = aVar.getVideoDurationSec();
            SnsMethodCalculate.markEndTimeMs("getVideoDurationSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return videoDurationSec;
        }
        int i = this.f276432n;
        SnsMethodCalculate.markEndTimeMs("getVideoDurationSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058 A[SYNTHETIC, Splitter:B:13:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d1 A[Catch:{ all -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d5  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76636h(boolean r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.AdLandingVideoWrapper"
            java.lang.String r1 = "setVideoPath"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r8.f276432n = r11
            r8.f276433o = r9
            com.tencent.mm.pointers.PString r9 = new com.tencent.mm.pointers.PString
            r9.<init>()
            r9.value = r10
            java.lang.String r10 = "checkLocalUrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r2)
            java.lang.String r11 = r9.value
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            r3 = 0
            r4 = 1
            if (r11 == 0) goto L_0x0028
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r2)
            goto L_0x0043
        L_0x0028:
            java.lang.String r11 = r9.value
            java.lang.String r5 = "file://"
            int r11 = r11.indexOf(r5)
            if (r11 != 0) goto L_0x0040
            java.lang.String r11 = r9.value
            r5 = 7
            java.lang.String r11 = r11.substring(r5)
            r9.value = r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r2)
            r10 = 1
            goto L_0x0044
        L_0x0040:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r2)
        L_0x0043:
            r10 = 0
        L_0x0044:
            r8.f276434p = r10
            java.lang.String r9 = r9.value
            r8.f276435q = r9
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            java.lang.String r10 = "%d use mm video view !"
            java.lang.String r11 = "%d use common video view !"
            java.lang.String r5 = "createSystemPlayer"
            java.lang.String r6 = "checkIsFullScrenn"
            java.lang.String r7 = "checkUseSystemPlayer"
            if (r9 != 0) goto L_0x00d1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)     // Catch:{ all -> 0x0068 }
            boolean r9 = r8.f276433o     // Catch:{ all -> 0x0068 }
            if (r9 != 0) goto L_0x006b
            boolean r9 = r8.f276434p     // Catch:{ all -> 0x0068 }
            if (r9 != 0) goto L_0x006b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)     // Catch:{ all -> 0x0068 }
            r9 = 0
            goto L_0x006f
        L_0x0068:
            r9 = move-exception
            goto L_0x01bd
        L_0x006b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)     // Catch:{ all -> 0x0068 }
            r9 = 1
        L_0x006f:
            if (r9 == 0) goto L_0x0097
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0068 }
            int r10 = r8.hashCode()     // Catch:{ all -> 0x0068 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0068 }
            r9[r3] = r10     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r11, r9)     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.CommonVideoView r9 = new com.tencent.mm.pluginsdk.ui.CommonVideoView     // Catch:{ all -> 0x0068 }
            android.content.Context r10 = r8.f276425d     // Catch:{ all -> 0x0068 }
            r9.<init>(r10)     // Catch:{ all -> 0x0068 }
            r9.setReporter(r8)     // Catch:{ all -> 0x0068 }
            r9.setIMMVideoViewCallback(r8)     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)     // Catch:{ all -> 0x0068 }
            r8.f276426e = r9     // Catch:{ all -> 0x0068 }
            goto L_0x01a2
        L_0x0097:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)     // Catch:{ all -> 0x0068 }
            boolean r9 = r8.f276436r     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)     // Catch:{ all -> 0x0068 }
            if (r9 == 0) goto L_0x00ba
            java.lang.String r9 = "%d use full screen mm video  view !"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0068 }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0068 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0068 }
            r10[r3] = r11     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r10)     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.mo131772d()     // Catch:{ all -> 0x0068 }
            r8.f276426e = r9     // Catch:{ all -> 0x0068 }
            goto L_0x01a2
        L_0x00ba:
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0068 }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0068 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0068 }
            r9[r3] = r11     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r9)     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.mo131773e()     // Catch:{ all -> 0x0068 }
            r8.f276426e = r9     // Catch:{ all -> 0x0068 }
            goto L_0x01a2
        L_0x00d1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)     // Catch:{ all -> 0x0068 }
            boolean r9 = r8.f276433o     // Catch:{ all -> 0x0068 }
            if (r9 != 0) goto L_0x00e1
            boolean r9 = r8.f276434p     // Catch:{ all -> 0x0068 }
            if (r9 != 0) goto L_0x00e1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)     // Catch:{ all -> 0x0068 }
            r9 = 0
            goto L_0x00e5
        L_0x00e1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)     // Catch:{ all -> 0x0068 }
            r9 = 1
        L_0x00e5:
            if (r9 == 0) goto L_0x013f
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            boolean r10 = r9 instanceof com.tencent.p014mm.modelvideo.MMVideoView     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x0127
            r9.stop()     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r9 = (com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView) r9     // Catch:{ all -> 0x0068 }
            r9.mo135081w()     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            android.view.View r9 = (android.view.View) r9     // Catch:{ all -> 0x0068 }
            r8.removeView(r9)     // Catch:{ all -> 0x0068 }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0124 }
            int r10 = r8.hashCode()     // Catch:{ all -> 0x0124 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0124 }
            r9[r3] = r10     // Catch:{ all -> 0x0124 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r11, r9)     // Catch:{ all -> 0x0124 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)     // Catch:{ all -> 0x0124 }
            com.tencent.mm.pluginsdk.ui.CommonVideoView r9 = new com.tencent.mm.pluginsdk.ui.CommonVideoView     // Catch:{ all -> 0x0124 }
            android.content.Context r10 = r8.f276425d     // Catch:{ all -> 0x0124 }
            r9.<init>(r10)     // Catch:{ all -> 0x0124 }
            r9.setReporter(r8)     // Catch:{ all -> 0x0124 }
            r9.setIMMVideoViewCallback(r8)     // Catch:{ all -> 0x0124 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)     // Catch:{ all -> 0x0124 }
            r8.f276426e = r9     // Catch:{ all -> 0x0124 }
            goto L_0x01a2
        L_0x0124:
            r9 = move-exception
            goto L_0x01a4
        L_0x0127:
            java.lang.String r9 = "%d use last common video view !"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0068 }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0068 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0068 }
            r10[r3] = r11     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r10)     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            r9.stop()     // Catch:{ all -> 0x0068 }
            goto L_0x01c4
        L_0x013f:
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            boolean r9 = r9 instanceof com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView     // Catch:{ all -> 0x0068 }
            if (r9 == 0) goto L_0x01a6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)     // Catch:{ all -> 0x0068 }
            boolean r9 = r8.f276436r     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)     // Catch:{ all -> 0x0068 }
            if (r9 == 0) goto L_0x017a
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            r9.stop()     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r9 = (com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView) r9     // Catch:{ all -> 0x0068 }
            r9.mo135081w()     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            android.view.View r9 = (android.view.View) r9     // Catch:{ all -> 0x0068 }
            r8.removeView(r9)     // Catch:{ all -> 0x0068 }
            java.lang.String r9 = "%d use full screen mm video view !"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0124 }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0124 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0124 }
            r10[r3] = r11     // Catch:{ all -> 0x0124 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r10)     // Catch:{ all -> 0x0124 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.mo131772d()     // Catch:{ all -> 0x0124 }
            r8.f276426e = r9     // Catch:{ all -> 0x0124 }
            goto L_0x01a2
        L_0x017a:
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            r9.stop()     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.AbstractVideoView r9 = (com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView) r9     // Catch:{ all -> 0x0068 }
            r9.mo135081w()     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            android.view.View r9 = (android.view.View) r9     // Catch:{ all -> 0x0068 }
            r8.removeView(r9)     // Catch:{ all -> 0x0068 }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0124 }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0124 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0124 }
            r9[r3] = r11     // Catch:{ all -> 0x0124 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r9)     // Catch:{ all -> 0x0124 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.mo131773e()     // Catch:{ all -> 0x0124 }
            r8.f276426e = r9     // Catch:{ all -> 0x0124 }
        L_0x01a2:
            r3 = 1
            goto L_0x01c4
        L_0x01a4:
            r3 = 1
            goto L_0x01bd
        L_0x01a6:
            java.lang.String r9 = "%d use last mm video view !"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0068 }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0068 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0068 }
            r10[r3] = r11     // Catch:{ all -> 0x0068 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r10)     // Catch:{ all -> 0x0068 }
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e     // Catch:{ all -> 0x0068 }
            r9.stop()     // Catch:{ all -> 0x0068 }
            goto L_0x01c4
        L_0x01bd:
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
        L_0x01c4:
            com.tencent.mm.pluginsdk.ui.a$e r9 = r8.f276429h
            r8.setScaleType(r9)
            float r9 = r8.f276431j
            r8.setPlayRate(r9)
            boolean r9 = r8.f276430i
            r8.setMute(r9)
            if (r3 == 0) goto L_0x01ed
            vd3.o r9 = r8.f276428g
            r8.setVideoFooterView(r9)
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            r10 = -1
            r11 = -2
            r9.<init>(r10, r11)
            r10 = 13
            r9.addRule(r10)
            com.tencent.mm.pluginsdk.ui.a r10 = r8.f276426e
            android.view.View r10 = (android.view.View) r10
            r8.addView(r10, r9)
        L_0x01ed:
            com.tencent.mm.pluginsdk.ui.a r9 = r8.f276426e
            boolean r10 = r8.f276433o
            java.lang.String r11 = r8.f276435q
            int r0 = r8.f276432n
            r9.mo76636h(r10, r11, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper.mo76636h(boolean, java.lang.String, int):void");
    }

    /* renamed from: i */
    public boolean mo129198i() {
        SnsMethodCalculate.markStartTimeMs("isLive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            boolean i = aVar.mo129198i();
            SnsMethodCalculate.markEndTimeMs("isLive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return i;
        }
        SnsMethodCalculate.markEndTimeMs("isLive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return false;
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        SnsMethodCalculate.markStartTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
        SnsMethodCalculate.markEndTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public boolean isPlaying() {
        SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            boolean isPlaying = aVar.isPlaying();
            SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return isPlaying;
        }
        SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return false;
    }

    /* renamed from: j */
    public void mo131776j() {
        SnsMethodCalculate.markStartTimeMs("stopPlayTimer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f276439u.stopTimer();
        SnsMethodCalculate.markEndTimeMs("stopPlayTimer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void kvStat(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C115669n.INSTANCE.kvStat(i, str);
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        Log.m105925i("MicroMsg.AdLandingVideoWrapper", "%d onGetVideoSize[%d %d]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
        C96814a.C57541b bVar = this.f276427f;
        if (bVar != null) {
            bVar.mo22964l0(str, str2, i, i2);
        }
        SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        Log.m105919d("MicroMsg.AdLandingVideoWrapper", "%d onVideoPlay", Integer.valueOf(hashCode()));
        setKeepScreenOn(true);
        this.f276437s.mo136891c(this);
        C96814a.C57541b bVar = this.f276427f;
        if (bVar != null) {
            bVar.mo22965m0(str, str2);
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    /* renamed from: o */
    public void mo129208o(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        Log.m105925i("MicroMsg.AdLandingVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", Integer.valueOf(hashCode()), str, Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
        SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public boolean pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        if (this.f276426e != null) {
            setKeepScreenOn(false);
            this.f276437s.mo136889a();
            boolean pause = this.f276426e.pause();
            SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return pause;
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return false;
    }

    public boolean play() {
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        if (this.f276426e != null) {
            setKeepScreenOn(true);
            this.f276437s.mo136891c(this);
            boolean play = this.f276426e.play();
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return play;
        }
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return false;
    }

    public void setCover(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setCover", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.setCover(bitmap);
        }
        SnsMethodCalculate.markEndTimeMs("setCover", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setFullDirection(int i) {
        SnsMethodCalculate.markStartTimeMs("setFullDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.setFullDirection(i);
        }
        SnsMethodCalculate.markEndTimeMs("setFullDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setFullScreen(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f276436r = z;
        SnsMethodCalculate.markEndTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setIMMVideoViewCallback(C96814a.C57541b bVar) {
        SnsMethodCalculate.markStartTimeMs("setIMMVideoViewCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f276427f = bVar;
        SnsMethodCalculate.markEndTimeMs("setIMMVideoViewCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setIsShowBasicControls(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsShowBasicControls", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.setIsShowBasicControls(z);
        }
        SnsMethodCalculate.markEndTimeMs("setIsShowBasicControls", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setKeepScreenOn(boolean z) {
        SnsMethodCalculate.markStartTimeMs(C90557z.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        Log.m105919d("MicroMsg.AdLandingVideoWrapper", "set keep screen on[%b] stack[%s]", Boolean.valueOf(z), Util.getStack());
        super.setKeepScreenOn(z);
        SnsMethodCalculate.markEndTimeMs(C90557z.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setLoop(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setLoop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        try {
            C96814a aVar = this.f276426e;
            if (aVar != null) {
                aVar.setLoop(z);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingVideoWrapper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("setLoop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setLoopCompletionCallback(C96814a.C57542d dVar) {
        SnsMethodCalculate.markStartTimeMs("setLoopCompletionCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        try {
            C96814a aVar = this.f276426e;
            if (aVar != null) {
                aVar.setLoopCompletionCallback(dVar);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingVideoWrapper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("setLoopCompletionCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setMute(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f276430i = z;
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.setMute(z);
        }
        SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setNeedPause(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setNeedPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar instanceof AdLandingMMVideoView) {
            ((AdLandingMMVideoView) aVar).setNeedPause(z);
        }
        SnsMethodCalculate.markEndTimeMs("setNeedPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public boolean setPlayRate(float f) {
        SnsMethodCalculate.markStartTimeMs("setPlayRate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        if (f <= 0.0f) {
            SnsMethodCalculate.markEndTimeMs("setPlayRate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return false;
        }
        this.f276431j = f;
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            boolean playRate = aVar.setPlayRate(f);
            SnsMethodCalculate.markEndTimeMs("setPlayRate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return playRate;
        }
        SnsMethodCalculate.markEndTimeMs("setPlayRate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return false;
    }

    public void setScaleType(C96814a.C96817e eVar) {
        SnsMethodCalculate.markStartTimeMs("setScaleType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f276429h = eVar;
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.setScaleType(eVar);
        }
        SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setVideoFooterView(C102173o oVar) {
        SnsMethodCalculate.markStartTimeMs("setVideoFooterView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f276428g = oVar;
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.setVideoFooterView(oVar);
        }
        SnsMethodCalculate.markEndTimeMs("setVideoFooterView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setVideoPlayCallback(C95249b bVar) {
        SnsMethodCalculate.markStartTimeMs("setVideoPlayCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f276438t = bVar;
        SnsMethodCalculate.markEndTimeMs("setVideoPlayCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void start() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.start();
            setKeepScreenOn(true);
            this.f276437s.mo136891c(this);
        }
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        C96814a aVar = this.f276426e;
        if (aVar != null) {
            aVar.stop();
            this.f276437s.mo136889a();
            setKeepScreenOn(false);
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public AdLandingVideoWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f276429h = C96814a.C96817e.CONTAIN;
        this.f276430i = false;
        this.f276431j = -1.0f;
        this.f276436r = false;
        this.f276439u = new MTimerHandler(new C95248a(), true);
        this.f276425d = context;
        this.f276437s = new C97621e();
    }
}
