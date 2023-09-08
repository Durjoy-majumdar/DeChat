package com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import in0.C87760d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.BaseVideoView */
public abstract class BaseVideoView extends AbstractVideoView {

    /* renamed from: E */
    public boolean f49724E;

    /* renamed from: F */
    public String f49725F;

    /* renamed from: G */
    public int f49726G;

    /* renamed from: H */
    public int f49727H = 0;

    /* renamed from: I */
    public final Rect f49728I = new Rect();

    /* renamed from: J */
    public boolean f49729J = false;

    public BaseVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo22294a(double d, boolean z) {
        if (!mo22308i()) {
            return super.mo22294a(d, z);
        }
        Log.m105929w("MicroMsg.Video.BaseVideoView", "%s it is live, don't seek ", mo22453k());
        return false;
    }

    /* renamed from: b */
    public void mo22296b() {
        super.mo22296b();
    }

    /* renamed from: e */
    public C18015a mo22448e(Context context) {
        return mo22466r(context);
    }

    /* renamed from: f */
    public void mo22299f() {
        Surface surface;
        boolean z = this.f49697e;
        super.mo22299f();
        C18015a aVar = this.f49704o;
        if (aVar != null && (aVar instanceof AbstractVideoTextureView)) {
            if (this.f49705p) {
                play();
                return;
            }
            boolean localVisibleRect = getLocalVisibleRect(this.f49728I);
            Log.m105925i("MicroMsg.Video.BaseVideoView", "onUIResume, oldIsUIAvailable: %b, isShown: %b", Boolean.valueOf(z), Boolean.valueOf(localVisibleRect));
            if (!z && localVisibleRect) {
                AbstractVideoTextureView abstractVideoTextureView = (AbstractVideoTextureView) this.f49704o;
                if (abstractVideoTextureView.f49663g != null && abstractVideoTextureView.f49664h && (surface = abstractVideoTextureView.f49662f) != null && surface.isValid()) {
                    Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d flush surface start time[%d] ", Integer.valueOf(abstractVideoTextureView.hashCode()), Integer.valueOf(abstractVideoTextureView.getCurrentPosition()));
                    abstractVideoTextureView.f49655H = true;
                    abstractVideoTextureView.f49663g.mo22532a(0.0f, 0.0f);
                    abstractVideoTextureView.f49663g.start();
                }
            }
        }
    }

    /* renamed from: g */
    public void mo22449g() {
        super.mo22449g();
    }

    public int getCacheTimeSec() {
        try {
            C18015a aVar = this.f49704o;
            if (aVar instanceof AbstractVideoTextureView) {
                return (int) (((float) super.getVideoDurationSec()) * ((((float) ((AbstractVideoTextureView) aVar).getDownloadPercent()) * 1.0f) / 100.0f));
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Video.BaseVideoView", e, "%s get cache time sec error", mo22453k());
        }
        return 0;
    }

    public int getVideoDurationSec() {
        int i = this.f49726G;
        return i <= 0 ? super.getVideoDurationSec() : i;
    }

    public int getVideoSource() {
        return this.f49727H;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo22307h(boolean z, String str, int i) {
        this.f49724E = z;
        this.f49725F = str;
        this.f49726G = i;
    }

    /* renamed from: i */
    public boolean mo22308i() {
        C18015a aVar = this.f49704o;
        boolean z = aVar != null && !Util.isNullOrNil(aVar.getVideoPath()) && this.f49712w;
        C18015a aVar2 = this.f49704o;
        int duration = aVar2 != null ? aVar2.getDuration() : 0;
        if (this.f49724E) {
            return true;
        }
        return z && duration <= 0;
    }

    /* renamed from: j */
    public void mo22310j() {
        if (this.f49704o != null) {
            Log.m105925i("MicroMsg.Video.BaseVideoView", "%s preloadVideo url:%s, path:%s", mo22453k(), this.f49725F, this.f49704o.getVideoPath());
            if (Util.isNullOrNil(this.f49704o.getVideoPath())) {
                this.f49704o.setVideoPath(this.f49725F);
                this.f49709t = false;
            }
        }
    }

    public void onCompletion() {
        if (mo22308i()) {
            Log.m105925i("MicroMsg.Video.BaseVideoView", "%s it is live video, do not completion", mo22453k());
            stop();
            start();
            return;
        }
        super.onCompletion();
        if (this.f49729J) {
            mo22294a(0.0d, true);
        }
    }

    /* renamed from: r */
    public abstract C18015a mo22466r(Context context);

    /* renamed from: s */
    public void mo22467s(int i, int i2) {
        Log.m105925i("MicroMsg.Video.BaseVideoView", "%s onInfo [%d %d]", mo22453k(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 701) {
            mo22455m();
        } else if (i == 702) {
            super.mo22449g();
        }
    }

    public void setLoop(boolean z) {
        this.f49729J = z;
    }

    public boolean setPlayRate(float f) {
        Log.m105925i("MicroMsg.Video.BaseVideoView", "%s set play rate [%f]", mo22453k(), Float.valueOf(f));
        C18015a aVar = this.f49704o;
        if (aVar instanceof AbstractVideoTextureView) {
            AbstractVideoTextureView abstractVideoTextureView = (AbstractVideoTextureView) aVar;
            if (f <= 0.0f) {
                abstractVideoTextureView.getClass();
            } else {
                abstractVideoTextureView.f49659L = f;
                C87760d dVar = abstractVideoTextureView.f49663g;
                if (dVar != null) {
                    dVar.mo22543l(f);
                }
            }
        }
        return false;
    }

    public void setScaleType(C17978c.C17986h hVar) {
        C18015a aVar = this.f49704o;
        if (aVar instanceof AbstractVideoTextureView) {
            ((AbstractVideoTextureView) aVar).setScaleType(hVar);
        }
    }

    public void setVideoSource(int i) {
        this.f49727H = i;
    }

    public void start() {
        if (this.f49704o != null) {
            Log.m105925i("MicroMsg.Video.BaseVideoView", "%s start path [%s] [%s]", mo22453k(), this.f49704o.getVideoPath(), Util.getStack());
            if (Util.isNullOrNil(this.f49704o.getVideoPath())) {
                this.f49704o.setVideoPath(this.f49725F);
                this.f49709t = true;
                mo22455m();
                return;
            }
            this.f49709t = true;
            play();
        }
    }

    public BaseVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BaseVideoView(Context context) {
        super(context, (AttributeSet) null);
    }
}
