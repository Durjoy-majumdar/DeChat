package com.tencent.p014mm.plugin.vlog.p117ui.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.FakeVideoViewLayer;
import com.tencent.p014mm.plugin.vlog.model.C96557v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import s23.C48218a;
import te3.C101773e70;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/preview/VLogFakeVideoView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/vlog/model/v0;", "getScriptModel", "", "mute", "Lrx3/b0;", "setMute", "Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "d", "Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "getVlogVideoView", "()Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "setVlogVideoView", "(Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;)V", "vlogVideoView", "Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "e", "Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "getFakeLayer", "()Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "setFakeLayer", "(Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;)V", "fakeLayer", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "getLoading", "()Landroid/widget/ProgressBar;", "setLoading", "(Landroid/widget/ProgressBar;)V", "loading", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.preview.VLogFakeVideoView */
public final class VLogFakeVideoView extends RelativeLayout {

    /* renamed from: d */
    public VLogPlayView f117096d;

    /* renamed from: e */
    public FakeVideoViewLayer f117097e;

    /* renamed from: f */
    public ProgressBar f117098f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VLogFakeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.Story.VLogFakeVideoView", "initView");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cc8, this);
        View findViewById = findViewById(C0966R.C0970id.l_b);
        C87412m.m108593f(findViewById, "findViewById(R.id.vlog_play_view)");
        setVlogVideoView((VLogPlayView) findViewById);
        View findViewById2 = findViewById(C0966R.C0970id.f357968cs0);
        C87412m.m108593f(findViewById2, "findViewById(R.id.fakelayer)");
        setFakeLayer((FakeVideoViewLayer) findViewById2);
        View findViewById3 = findViewById(C0966R.C0970id.l6a);
        C87412m.m108593f(findViewById3, "findViewById(R.id.video_loading)");
        setLoading((ProgressBar) findViewById3);
        getVlogVideoView().setPrepareCallback(new C48218a(this));
    }

    private final C96557v0 getScriptModel() {
        new C101773e70();
        return null;
    }

    public final FakeVideoViewLayer getFakeLayer() {
        FakeVideoViewLayer fakeVideoViewLayer = this.f117097e;
        if (fakeVideoViewLayer != null) {
            return fakeVideoViewLayer;
        }
        C87412m.m108603p("fakeLayer");
        throw null;
    }

    public final ProgressBar getLoading() {
        ProgressBar progressBar = this.f117098f;
        if (progressBar != null) {
            return progressBar;
        }
        C87412m.m108603p("loading");
        throw null;
    }

    public final VLogPlayView getVlogVideoView() {
        VLogPlayView vLogPlayView = this.f117096d;
        if (vLogPlayView != null) {
            return vLogPlayView;
        }
        C87412m.m108603p("vlogVideoView");
        throw null;
    }

    public final void setFakeLayer(FakeVideoViewLayer fakeVideoViewLayer) {
        C87412m.m108594g(fakeVideoViewLayer, "<set-?>");
        this.f117097e = fakeVideoViewLayer;
    }

    public final void setLoading(ProgressBar progressBar) {
        C87412m.m108594g(progressBar, "<set-?>");
        this.f117098f = progressBar;
    }

    public final void setMute(boolean z) {
    }

    public final void setVlogVideoView(VLogPlayView vLogPlayView) {
        C87412m.m108594g(vLogPlayView, "<set-?>");
        this.f117096d = vLogPlayView;
    }
}
