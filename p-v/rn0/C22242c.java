package rn0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;

/* renamed from: rn0.c */
public class C22242c implements C17978c {

    /* renamed from: d */
    public C22241b f63029d;

    public C22242c(Context context) {
        this.f63029d = new C22241b(context);
    }

    /* renamed from: a */
    public boolean mo22294a(double d, boolean z) {
        return this.f63029d.mo22294a(d, z);
    }

    /* renamed from: b */
    public void mo22296b() {
        this.f63029d.mo22296b();
    }

    /* renamed from: c */
    public void mo22297c() {
        this.f63029d.mo22297c();
    }

    /* renamed from: d */
    public boolean mo22298d(double d) {
        return this.f63029d.mo22298d(d);
    }

    /* renamed from: f */
    public void mo22299f() {
        this.f63029d.mo22299f();
    }

    public int getCacheTimeSec() {
        return this.f63029d.getCacheTimeSec();
    }

    public int getCurrPosMs() {
        return this.f63029d.getCurrPosMs();
    }

    public int getCurrPosSec() {
        return this.f63029d.getCurrPosSec();
    }

    public int getPlayerType() {
        return this.f63029d.getPlayerType();
    }

    public int getVideoDurationSec() {
        return this.f63029d.getVideoDurationSec();
    }

    public View getView() {
        return this.f63029d;
    }

    /* renamed from: h */
    public void mo22307h(boolean z, String str, int i) {
        this.f63029d.mo22307h(z, str, i);
    }

    /* renamed from: i */
    public boolean mo22308i() {
        return this.f63029d.mo22308i();
    }

    public boolean isPlaying() {
        return this.f63029d.isPlaying();
    }

    /* renamed from: j */
    public void mo22310j() {
        this.f63029d.mo22310j();
    }

    public boolean pause() {
        return this.f63029d.pause();
    }

    public boolean play() {
        return this.f63029d.play();
    }

    public void setCover(Bitmap bitmap) {
        this.f63029d.setCover(bitmap);
    }

    public void setFullDirection(int i) {
        this.f63029d.setFullDirection(i);
    }

    public void setIMMVideoViewCallback(C17978c.C17981c cVar) {
        this.f63029d.setIMMVideoViewCallback(cVar);
    }

    public void setIsShowBasicControls(boolean z) {
        this.f63029d.setIsShowBasicControls(z);
    }

    public void setMute(boolean z) {
        this.f63029d.setMute(z);
    }

    public boolean setPlayRate(float f) {
        this.f63029d.setPlayRate(f);
        return false;
    }

    public void setScaleType(C17978c.C17986h hVar) {
        this.f63029d.setScaleType(hVar);
    }

    public void setVideoFooterView(C17978c.C17980b bVar) {
        this.f63029d.setVideoFooterView(bVar);
    }

    public void setVideoSource(int i) {
        this.f63029d.setVideoSource(i);
    }

    public void start() {
        this.f63029d.start();
    }

    public void stop() {
        this.f63029d.stop();
    }
}
