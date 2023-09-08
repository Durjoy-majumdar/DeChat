package com.tencent.p014mm.plugin.thumbplayer.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import f03.C97787h;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import l03.C21387c;
import m03.C99783d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010>\u001a\u00020=\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?\u0012\b\b\u0002\u0010A\u001a\u00020\u0019¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0012\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0004H\u0016J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0016J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0004H\u0016J\u0012\u0010,\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010.\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010-H\u0016J\u0012\u00100\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010/H\u0016R$\u00106\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048V@VX\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010<\u001a\u0002072\u0006\u00101\u001a\u0002078V@VX\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006D"}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerViewContainer;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/pluginsdk/ui/tools/r0;", "Lm03/d;", "", "enableDolby", "Lrx3/b0;", "setDolbyEnable", "Landroid/view/View;", "getCurrentView", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$d;", "_callback", "setOnSurfaceCallback", "Lf03/h;", "downloader", "setResourceDownloader", "", "path", "setVideoPath", "getVideoPath", "loop", "setLoop", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$a;", "callback", "setVideoCallback", "", "getCurrentPosition", "getDuration", "Landroid/graphics/Bitmap;", "bmp", "setThumb", "", "getLastProgresstime", "isTrue", "setPlayProgressCallback", "", "getLastSurfaceUpdateTime", "forceScale", "setForceScaleFullScreen", "mute", "setMute", "autoFixRotation", "setAutoFixRotation", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$e;", "setOneTimeVideoTextureUpdateCallback", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$c;", "setOnSeekCompleteCallback", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$b;", "setOnInfoCallback", "value", "g", "()Z", "setOnlineVideo", "(Z)V", "isOnlineVideo", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "getScaleType", "()Lcom/tencent/mm/pluginsdk/ui/a$e;", "setScaleType", "(Lcom/tencent/mm/pluginsdk/ui/a$e;)V", "scaleType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-thumbplayer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer */
public final class ThumbPlayerViewContainer extends FrameLayout implements C96875r0, C99783d {

    /* renamed from: d */
    public final ThumbPlayerSurfaceView f282467d;

    /* renamed from: e */
    public final ThumbPlayerVideoView f282468e;

    /* renamed from: f */
    public C99783d f282469f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbPlayerViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbPlayerViewContainer(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public void mo24787a(double d, boolean z) {
        this.f282469f.mo24787a(d, z);
    }

    /* renamed from: b */
    public final void mo134547b() {
        if (this.f282467d.getVisibility() != 0 || !C87412m.m108589b(this.f282469f, this.f282467d)) {
            this.f282469f.stop();
            this.f282468e.setVisibility(8);
            this.f282467d.setVisibility(0);
            this.f282469f = this.f282467d;
        }
    }

    /* renamed from: c */
    public void mo24836c(C21387c cVar) {
        C87412m.m108594g(cVar, "reporter");
        this.f282469f.mo24836c(cVar);
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        this.f282469f.mo24788d(d);
    }

    /* renamed from: e */
    public boolean mo24789e(Context context, boolean z) {
        return this.f282469f.mo24789e(context, z);
    }

    /* renamed from: f */
    public final void mo134548f() {
        if (this.f282468e.getVisibility() != 0 || !C87412m.m108589b(this.f282469f, this.f282468e)) {
            this.f282469f.stop();
            this.f282468e.setVisibility(0);
            this.f282467d.setVisibility(8);
            this.f282469f = this.f282468e;
        }
    }

    /* renamed from: g */
    public boolean mo24838g() {
        return this.f282469f.mo24838g();
    }

    public int getCurrentPosition() {
        return this.f282469f.getCurrentPosition();
    }

    public final View getCurrentView() {
        if (this.f282468e.getVisibility() == 0) {
            return this.f282468e;
        }
        if (this.f282467d.getVisibility() == 0) {
            return this.f282467d;
        }
        return null;
    }

    public int getDuration() {
        return this.f282469f.getDuration();
    }

    public double getLastProgresstime() {
        return this.f282469f.getLastProgresstime();
    }

    public long getLastSurfaceUpdateTime() {
        return this.f282469f.getLastSurfaceUpdateTime();
    }

    public C96814a.C96817e getScaleType() {
        return this.f282469f.getScaleType();
    }

    public String getVideoPath() {
        return this.f282469f.getVideoPath();
    }

    /* renamed from: h */
    public boolean mo24843h() {
        return this.f282469f.mo24843h();
    }

    public boolean isInitialized() {
        return this.f282469f.isInitialized();
    }

    public boolean isMuted() {
        return this.f282467d.f54399x || this.f282468e.f54459z;
    }

    public boolean isPlaying() {
        return this.f282469f.isPlaying();
    }

    /* renamed from: j */
    public void mo24847j() {
        this.f282469f.mo24847j();
    }

    public void onDetach() {
        this.f282469f.onDetach();
    }

    public void pause() {
        this.f282469f.pause();
    }

    public void prepare() {
        this.f282469f.prepare();
    }

    public void setAutoFixRotation(boolean z) {
        this.f282467d.setAutoFixRotation(z);
        this.f282468e.setAutoFixRotation(z);
    }

    public void setDolbyEnable(boolean z) {
        this.f282467d.setDolbyEnable(z);
        this.f282468e.setDolbyEnable(z);
    }

    public void setForceScaleFullScreen(boolean z) {
        this.f282467d.setForceScaleFullScreen(z);
        this.f282468e.setForceScaleFullScreen(z);
    }

    public void setLoop(boolean z) {
        this.f282467d.setLoop(z);
        this.f282468e.setLoop(z);
    }

    public void setMute(boolean z) {
        this.f282467d.setMute(z);
        this.f282468e.setMute(z);
    }

    public void setOnInfoCallback(C96875r0.C19571b bVar) {
        this.f282467d.setOnInfoCallback(bVar);
        this.f282468e.setOnInfoCallback(bVar);
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
        this.f282467d.setOnSeekCompleteCallback(cVar);
        this.f282468e.setOnSeekCompleteCallback(cVar);
    }

    public void setOnSurfaceCallback(C96875r0.C96878d dVar) {
        this.f282467d.setOnSurfaceCallback(dVar);
        this.f282468e.setOnSurfaceCallback(dVar);
    }

    public void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar) {
        this.f282467d.setOneTimeVideoTextureUpdateCallback(eVar);
        this.f282468e.setOneTimeVideoTextureUpdateCallback(eVar);
    }

    public void setOnlineVideo(boolean z) {
        this.f282469f.setOnlineVideo(z);
    }

    public void setPlayProgressCallback(boolean z) {
        this.f282469f.setPlayProgressCallback(z);
    }

    public void setResourceDownloader(C97787h hVar) {
        C87412m.m108594g(hVar, "downloader");
        this.f282469f.setResourceDownloader(hVar);
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C87412m.m108594g(eVar, "value");
        this.f282469f.setScaleType(eVar);
    }

    public void setThumb(Bitmap bitmap) {
        this.f282467d.setThumb(bitmap);
        this.f282468e.setThumb(bitmap);
    }

    public void setVideoCallback(C96875r0.C96876a aVar) {
        this.f282467d.setVideoCallback(aVar);
        this.f282468e.setVideoCallback(aVar);
    }

    public void setVideoPath(String str) {
        this.f282469f.setVideoPath(str);
    }

    public boolean start() {
        return this.f282469f.start();
    }

    public void stop() {
        this.f282469f.stop();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbPlayerViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Context context2 = context;
        ThumbPlayerSurfaceView thumbPlayerSurfaceView = new ThumbPlayerSurfaceView(context2, (AttributeSet) null, 0, 6, (C8480h) null);
        this.f282467d = thumbPlayerSurfaceView;
        ThumbPlayerVideoView thumbPlayerVideoView = new ThumbPlayerVideoView(context2, (AttributeSet) null, 0, 6, (C8480h) null);
        this.f282468e = thumbPlayerVideoView;
        this.f282469f = thumbPlayerVideoView;
        addView(thumbPlayerSurfaceView, new FrameLayout.LayoutParams(-1, -1));
        addView(thumbPlayerVideoView, new FrameLayout.LayoutParams(-1, -1));
        thumbPlayerSurfaceView.setVisibility(8);
    }
}
