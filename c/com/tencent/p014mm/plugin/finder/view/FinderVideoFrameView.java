package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderVideoFrameView;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView;", "d", "Landroid/view/TextureView;", "getTextureView", "()Landroid/view/TextureView;", "setTextureView", "(Landroid/view/TextureView;)V", "textureView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderVideoFrameView */
public final class FinderVideoFrameView extends FrameLayout {

    /* renamed from: d */
    public TextureView f162137d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoFrameView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo79888a();
    }

    /* renamed from: a */
    public final void mo79888a() {
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359790ar2, this, true);
        View findViewById = findViewById(C0966R.C0970id.l5x);
        C87412m.m108593f(findViewById, "findViewById(R.id.video_frame_textureview)");
        setTextureView((TextureView) findViewById);
    }

    public final TextureView getTextureView() {
        TextureView textureView = this.f162137d;
        if (textureView != null) {
            return textureView;
        }
        C87412m.m108603p("textureView");
        throw null;
    }

    public final void setTextureView(TextureView textureView) {
        C87412m.m108594g(textureView, "<set-?>");
        this.f162137d = textureView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo79888a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoFrameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo79888a();
    }
}
