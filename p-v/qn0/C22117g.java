package qn0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;

/* renamed from: qn0.g */
public class C22117g implements C17978c {

    /* renamed from: d */
    public C22115e f62533d;

    public C22117g(Context context) {
        this.f62533d = new C22115e(context);
    }

    /* renamed from: a */
    public boolean mo22294a(double d, boolean z) {
        return this.f62533d.mo22294a(d, z);
    }

    /* renamed from: b */
    public void mo22296b() {
        this.f62533d.mo22296b();
    }

    /* renamed from: c */
    public void mo22297c() {
        this.f62533d.mo22297c();
    }

    /* renamed from: d */
    public boolean mo22298d(double d) {
        return this.f62533d.mo22298d(d);
    }

    /* renamed from: f */
    public void mo22299f() {
        this.f62533d.mo22299f();
    }

    public int getCacheTimeSec() {
        return this.f62533d.getCacheTimeSec();
    }

    public int getCurrPosMs() {
        return this.f62533d.getCurrPosMs();
    }

    public int getCurrPosSec() {
        return this.f62533d.getCurrPosSec();
    }

    public int getPlayerType() {
        return this.f62533d.getPlayerType();
    }

    public int getVideoDurationSec() {
        return this.f62533d.getVideoDurationSec();
    }

    public View getView() {
        return this.f62533d;
    }

    /* renamed from: h */
    public void mo22307h(boolean z, String str, int i) {
        this.f62533d.mo22307h(z, str, i);
    }

    /* renamed from: i */
    public boolean mo22308i() {
        return this.f62533d.mo22308i();
    }

    public boolean isPlaying() {
        return this.f62533d.isPlaying();
    }

    /* renamed from: j */
    public void mo22310j() {
        this.f62533d.mo22310j();
    }

    public boolean pause() {
        return this.f62533d.pause();
    }

    public boolean play() {
        return this.f62533d.play();
    }

    public void setCover(Bitmap bitmap) {
        this.f62533d.setCover(bitmap);
    }

    public void setFullDirection(int i) {
        this.f62533d.setFullDirection(i);
    }

    public void setIMMVideoViewCallback(C17978c.C17981c cVar) {
        this.f62533d.setIMMVideoViewCallback(cVar);
    }

    public void setIsShowBasicControls(boolean z) {
        this.f62533d.setIsShowBasicControls(z);
    }

    public void setMute(boolean z) {
        this.f62533d.setMute(z);
    }

    public boolean setPlayRate(float f) {
        this.f62533d.setPlayRate(f);
        return false;
    }

    public void setScaleType(C17978c.C17986h hVar) {
        this.f62533d.setScaleType(hVar);
    }

    public void setVideoFooterView(C17978c.C17980b bVar) {
        this.f62533d.setVideoFooterView(bVar);
    }

    public void setVideoSource(int i) {
        this.f62533d.setVideoSource(i);
    }

    public void start() {
        this.f62533d.start();
    }

    public void stop() {
        this.f62533d.stop();
    }
}
