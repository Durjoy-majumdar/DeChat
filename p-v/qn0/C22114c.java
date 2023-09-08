package qn0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;

/* renamed from: qn0.c */
public final class C22114c implements C17978c {

    /* renamed from: d */
    public final C17978c f62531d;

    public C22114c(Context context) {
        this.f62531d = new C22113b(context);
    }

    /* renamed from: a */
    public boolean mo22294a(double d, boolean z) {
        return this.f62531d.mo22294a(d, z);
    }

    /* renamed from: b */
    public void mo22296b() {
        this.f62531d.mo22296b();
    }

    /* renamed from: c */
    public void mo22297c() {
        this.f62531d.mo22297c();
    }

    /* renamed from: d */
    public boolean mo22298d(double d) {
        return this.f62531d.mo22298d(d);
    }

    /* renamed from: f */
    public void mo22299f() {
        this.f62531d.mo22299f();
    }

    public int getCacheTimeSec() {
        return this.f62531d.getCacheTimeSec();
    }

    public int getCurrPosMs() {
        return this.f62531d.getCurrPosMs();
    }

    public int getCurrPosSec() {
        return this.f62531d.getCurrPosSec();
    }

    public int getPlayerType() {
        return this.f62531d.getPlayerType();
    }

    public int getVideoDurationSec() {
        return this.f62531d.getVideoDurationSec();
    }

    public View getView() {
        return this.f62531d.getView();
    }

    /* renamed from: h */
    public void mo22307h(boolean z, String str, int i) {
        this.f62531d.mo22307h(z, str, i);
    }

    /* renamed from: i */
    public boolean mo22308i() {
        return this.f62531d.mo22308i();
    }

    public boolean isPlaying() {
        return this.f62531d.isPlaying();
    }

    /* renamed from: j */
    public void mo22310j() {
        this.f62531d.mo22310j();
    }

    public boolean pause() {
        return this.f62531d.pause();
    }

    public boolean play() {
        return this.f62531d.play();
    }

    public void setCover(Bitmap bitmap) {
        this.f62531d.setCover(bitmap);
    }

    public void setFullDirection(int i) {
        this.f62531d.setFullDirection(i);
    }

    public void setIMMVideoViewCallback(C17978c.C17981c cVar) {
        this.f62531d.setIMMVideoViewCallback(cVar);
    }

    public void setIsShowBasicControls(boolean z) {
        this.f62531d.setIsShowBasicControls(z);
    }

    public void setMute(boolean z) {
        this.f62531d.setMute(z);
    }

    public boolean setPlayRate(float f) {
        return this.f62531d.setPlayRate(f);
    }

    public void setScaleType(C17978c.C17986h hVar) {
        this.f62531d.setScaleType(hVar);
    }

    public void setVideoFooterView(C17978c.C17980b bVar) {
        this.f62531d.setVideoFooterView(bVar);
    }

    public void setVideoSource(int i) {
        this.f62531d.setVideoSource(i);
    }

    public void start() {
        this.f62531d.start();
    }

    public void stop() {
        this.f62531d.stop();
    }
}
