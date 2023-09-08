package com.tencent.p014mm.plugin.voip.video.render;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voip/video/render/VoIPRenderSurfaceView;", "Landroid/view/SurfaceView;", "", "isFullScreen", "Z", "()Z", "setFullScreen", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.video.render.VoIPRenderSurfaceView */
public class VoIPRenderSurfaceView extends SurfaceView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoIPRenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append("MicroMsg.VoIPRenderSurfaceView@");
        sb.append(hashCode());
    }

    public final void setFullScreen(boolean z) {
    }
}
