package com.tencent.p014mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82721h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82724i0;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import qn0.C22115e;
import ym0.C23313f;
import ym0.d$$a;
import zm0.C91794b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper */
public class AppBrandVideoWrapper extends RelativeLayout implements C17978c, C17978c.C17981c {

    /* renamed from: x */
    public static C23313f f49557x;

    /* renamed from: y */
    public static C82721h0.C82722a f49558y = C91794b.f262875b;

    /* renamed from: d */
    public final String f49559d;

    /* renamed from: e */
    public Context f49560e;

    /* renamed from: f */
    public C17978c f49561f;

    /* renamed from: g */
    public C23313f f49562g;

    /* renamed from: h */
    public C17978c.C17981c f49563h;

    /* renamed from: i */
    public C17978c.C17980b f49564i;

    /* renamed from: j */
    public C17978c.C17986h f49565j;

    /* renamed from: n */
    public boolean f49566n;

    /* renamed from: o */
    public float f49567o;

    /* renamed from: p */
    public int f49568p;

    /* renamed from: q */
    public boolean f49569q;

    /* renamed from: r */
    public String f49570r;

    /* renamed from: s */
    public int f49571s;

    /* renamed from: t */
    public C82381f f49572t;

    /* renamed from: u */
    public final C82721h0 f49573u;

    /* renamed from: v */
    public boolean f49574v;

    /* renamed from: w */
    public int f49575w;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper$a */
    public class C17975a implements C82724i0.C29521a {
        public C17975a() {
        }

        public void onPause() {
            Log.m105924i(AppBrandVideoWrapper.this.f49559d, "onPause");
            AppBrandVideoWrapper.this.pause();
        }

        public void onResume() {
            Log.m105924i(AppBrandVideoWrapper.this.f49559d, "onResume");
            AppBrandVideoWrapper.this.play();
        }

        public void onStop() {
            Log.m105924i(AppBrandVideoWrapper.this.f49559d, "onStop");
            AppBrandVideoWrapper.this.stop();
        }
    }

    public AppBrandVideoWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void setAudioFocusComponentFactory(C82721h0.C82722a aVar) {
        f49558y = aVar;
    }

    public static void setVideoViewFactory(C23313f fVar) {
        Log.m105924i("MicroMsg.Video.AppBrandVideoWrapper", "setVideoViewFactory, videoViewFactory: " + fVar.getName());
        f49557x = fVar;
    }

    /* renamed from: F */
    public void mo22290F(String str, String str2) {
        C17978c.C17981c cVar = this.f49563h;
        if (cVar != null) {
            cVar.mo22290F(str, str2);
        }
    }

    /* renamed from: L */
    public void mo22291L(String str, String str2) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoWrapper", "%d onVideoEnded", Integer.valueOf(hashCode()));
        C17978c.C17981c cVar = this.f49563h;
        if (cVar != null) {
            cVar.mo22291L(str, str2);
        }
    }

    /* renamed from: T */
    public void mo22292T(String str, String str2, String str3, int i, int i2) {
        Log.m105929w("MicroMsg.Video.AppBrandVideoWrapper", "%d onError[%s %d, %d]", Integer.valueOf(hashCode()), str3, Integer.valueOf(i), Integer.valueOf(i2));
        C17978c.C17981c cVar = this.f49563h;
        if (cVar != null) {
            cVar.mo22292T(str, str2, str3, i, i2);
        }
    }

    /* renamed from: Z */
    public void mo22293Z(String str, String str2) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoWrapper", "%d onPrepared", Integer.valueOf(hashCode()));
        C17978c.C17981c cVar = this.f49563h;
        if (cVar != null) {
            cVar.mo22293Z(str, str2);
        }
    }

    /* renamed from: a */
    public boolean mo22294a(double d, boolean z) {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            return cVar.mo22294a(d, z);
        }
        return false;
    }

    /* renamed from: a0 */
    public void mo22295a0(String str, String str2) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoWrapper", "%d onVideoPause", Integer.valueOf(hashCode()));
        setKeepScreenOn(false);
        if (this.f49574v) {
            this.f49573u.mo115002L();
        }
        C17978c.C17981c cVar = this.f49563h;
        if (cVar != null) {
            cVar.mo22295a0(str, str2);
        }
    }

    /* renamed from: b */
    public void mo22296b() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.mo22296b();
        }
        if (this.f49574v) {
            this.f49573u.mo115002L();
        }
        setKeepScreenOn(false);
    }

    /* renamed from: c */
    public void mo22297c() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.mo22297c();
        }
        if (this.f49574v) {
            this.f49573u.mo115002L();
        }
        setKeepScreenOn(false);
    }

    /* renamed from: d */
    public boolean mo22298d(double d) {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            return cVar.mo22298d(d);
        }
        return false;
    }

    /* renamed from: f */
    public void mo22299f() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.mo22299f();
        }
    }

    public int getCacheTimeSec() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            return cVar.getCacheTimeSec();
        }
        return 0;
    }

    public int getCurrPosMs() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            return cVar.getCurrPosMs();
        }
        return 0;
    }

    public int getCurrPosSec() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            return cVar.getCurrPosSec();
        }
        return 0;
    }

    public int getPlayerType() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            return cVar.getPlayerType();
        }
        return 0;
    }

    public TextureView getTexture() {
        C17978c cVar = this.f49561f;
        if (cVar == null || !(cVar.getView() instanceof C22115e)) {
            return null;
        }
        return ((C22115e) this.f49561f.getView()).getVideoTexture();
    }

    public int getVideoDurationSec() {
        C17978c cVar = this.f49561f;
        return cVar != null ? cVar.getVideoDurationSec() : this.f49568p;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo22307h(boolean z, String str, int i) {
        this.f49568p = i;
        this.f49569q = z;
        PString pString = new PString();
        pString.value = str;
        if (!Util.isNullOrNil(str) && pString.value.indexOf("file://") == 0) {
            pString.value = pString.value.substring(7);
        }
        this.f49570r = pString.value;
        boolean z2 = false;
        C17978c cVar = this.f49561f;
        if (cVar == null) {
            C23313f fVar = this.f49562g;
            if (fVar == null) {
                fVar = f49557x;
            }
            Log.m105924i("MicroMsg.Video.AppBrandVideoWrapper", "setVideoPath, videoViewFactory: " + fVar.getName());
            C17978c a = fVar.mo35199a(this.f49560e, this.f49575w);
            this.f49561f = a;
            a.setVideoSource(this.f49571s);
            this.f49561f.setIMMVideoViewCallback(this);
            z2 = true;
        } else {
            cVar.stop();
        }
        setScaleType(this.f49565j);
        setPlayRate(this.f49567o);
        setMute(this.f49566n);
        if (z2) {
            setVideoFooterView(this.f49564i);
            addView(this.f49561f.getView(), new RelativeLayout.LayoutParams(-1, -1));
        }
        this.f49561f.mo22307h(this.f49569q, this.f49570r, this.f49568p);
    }

    /* renamed from: i */
    public boolean mo22308i() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            return cVar.mo22308i();
        }
        return false;
    }

    public boolean isPlaying() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            return cVar.isPlaying();
        }
        return false;
    }

    /* renamed from: j */
    public void mo22310j() {
        Log.m105925i("MicroMsg.Video.AppBrandVideoWrapper", "%s preload video url %s", Integer.valueOf(hashCode()), this.f49570r);
        if (!Util.isNullOrNil(this.f49570r)) {
            this.f49561f.mo22310j();
        }
    }

    /* renamed from: l0 */
    public void mo22311l0(String str, String str2, int i, int i2) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
        C17978c.C17981c cVar = this.f49563h;
        if (cVar != null) {
            cVar.mo22311l0(str, str2, i, i2);
        }
    }

    /* renamed from: m0 */
    public void mo22312m0(String str, String str2) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoWrapper", "%d onVideoPlay", Integer.valueOf(hashCode()));
        setKeepScreenOn(true);
        if (this.f49574v) {
            this.f49573u.requestFocus();
        }
        C17978c.C17981c cVar = this.f49563h;
        if (cVar != null) {
            cVar.mo22312m0(str, str2);
        }
    }

    /* renamed from: n0 */
    public void mo22313n0(String str, String str2) {
        C17978c.C17981c cVar = this.f49563h;
        if (cVar != null) {
            cVar.mo22313n0(str, str2);
        }
    }

    public boolean pause() {
        if (this.f49561f == null) {
            return false;
        }
        setKeepScreenOn(false);
        return this.f49561f.pause();
    }

    public boolean play() {
        if (this.f49561f == null) {
            return false;
        }
        setKeepScreenOn(true);
        return this.f49561f.play();
    }

    public void setCover(Bitmap bitmap) {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.setCover(bitmap);
        }
    }

    public void setFocusAudio(boolean z) {
        this.f49574v = z;
    }

    public void setFullDirection(int i) {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.setFullDirection(i);
        }
    }

    public void setHostComponent(C82381f fVar) {
        this.f49572t = fVar;
    }

    public void setIMMVideoViewCallback(C17978c.C17981c cVar) {
        this.f49563h = cVar;
    }

    public void setIsShowBasicControls(boolean z) {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.setIsShowBasicControls(z);
        }
    }

    public void setKeepScreenOn(boolean z) {
        Log.m105919d("MicroMsg.Video.AppBrandVideoWrapper", "set keep screen on:%s", Boolean.valueOf(z));
        super.setKeepScreenOn(z);
    }

    public void setMute(boolean z) {
        this.f49566n = z;
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.setMute(z);
        }
    }

    public void setMyVideoViewFactory(C23313f fVar) {
        Log.m105924i("MicroMsg.Video.AppBrandVideoWrapper", "setMyVideoViewFactory, videoViewFactory: " + fVar.getName());
        this.f49562g = fVar;
    }

    public boolean setPlayRate(float f) {
        if (f <= 0.0f) {
            return false;
        }
        this.f49567o = f;
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            return cVar.setPlayRate(f);
        }
        return false;
    }

    public void setPlayerHint(int i) {
        Log.m105924i("MicroMsg.Video.AppBrandVideoWrapper", "setPlayerHint, playerHint: " + i);
        this.f49575w = i;
    }

    public void setScaleType(C17978c.C17986h hVar) {
        this.f49565j = hVar;
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.setScaleType(hVar);
        }
    }

    public void setVideoFooterView(C17978c.C17980b bVar) {
        this.f49564i = bVar;
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.setVideoFooterView(bVar);
        }
    }

    public void setVideoSource(int i) {
        this.f49571s = i;
    }

    public void start() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.start();
            setKeepScreenOn(true);
        }
    }

    public void stop() {
        C17978c cVar = this.f49561f;
        if (cVar != null) {
            cVar.stop();
            if (this.f49574v) {
                this.f49573u.mo115002L();
            }
            setKeepScreenOn(false);
        }
    }

    public AppBrandVideoWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49559d = "MicroMsg.Video.AppBrandVideoWrapper#" + hashCode();
        this.f49562g = null;
        this.f49565j = C17978c.C17986h.CONTAIN;
        this.f49566n = false;
        this.f49567o = -1.0f;
        this.f49571s = 0;
        this.f49572t = null;
        this.f49574v = true;
        this.f49575w = 0;
        this.f49560e = context;
        if (MMApplicationContext.isMainProcess()) {
            ((C1523c3) C86312j.m106911c(C1523c3.class)).waitFor();
        }
        this.f49562g = f49557x;
        this.f49573u = f49558y.mo115004a(new d$$a(this), new C17975a());
    }
}
