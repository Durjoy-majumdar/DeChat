package com.tencent.p014mm.plugin.voip.video.render;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voip/video/render/VoIPRenderTextureView;", "Landroid/view/TextureView;", "", "isFullScreen", "Z", "()Z", "setFullScreen", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView */
public class VoIPRenderTextureView extends TextureView {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoIPRenderTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo153116a(boolean z) {
        if (z) {
            setAlpha(0.0f);
        } else {
            setAlpha(1.0f);
        }
    }

    /* renamed from: b */
    public void mo153096b(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        if (C85875k4.m106207v()) {
            layoutParams = new RelativeLayout.LayoutParams((i2 * 9) / 16, i2);
            layoutParams.addRule(13);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public final void mo153117c() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(10);
            layoutParams2.addRule(21);
            layoutParams2.width = C76577a.m92151b(getContext(), 16);
            layoutParams2.height = C76577a.m92151b(getContext(), 24);
            layoutParams2.topMargin = C76577a.m92151b(getContext(), 4);
            layoutParams2.rightMargin = C76577a.m92151b(getContext(), 4);
            setLayoutParams(layoutParams2);
        }
    }

    public final void setFullScreen(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoIPRenderTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
