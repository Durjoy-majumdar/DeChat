package com.tencent.p014mm.plugin.gallery.picker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import gy3.C87412m;
import kotlin.Metadata;
import nw1.C100221y;
import nw1.C100222z;
import nw1.C76964x;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-B#\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b,\u00100R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'¨\u00061"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/MMMediaCropLayout;", "Landroid/widget/FrameLayout;", "Landroid/widget/ImageView;", "d", "Lrx3/g;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Lcom/tencent/mm/pluginsdk/ui/CommonVideoView;", "e", "getVideoView", "()Lcom/tencent/mm/pluginsdk/ui/CommonVideoView;", "videoView", "Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "f", "getLayout", "()Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "layout", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;", "g", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;", "getDefaultScaleType", "()Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;", "setDefaultScaleType", "(Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;)V", "defaultScaleType", "", "h", "J", "getCurrentPreviewMediaId", "()J", "setCurrentPreviewMediaId", "(J)V", "currentPreviewMediaId", "", "isLockCropWindow", "Z", "()Z", "setLockCropWindow", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout */
public final class MMMediaCropLayout extends FrameLayout {

    /* renamed from: d */
    public final C13601g f271237d = C36568h.m40985a(new C76964x(this));

    /* renamed from: e */
    public final C13601g f271238e = C36568h.m40985a(new C100222z(this));

    /* renamed from: f */
    public final C13601g f271239f = C36568h.m40985a(new C100221y(this));

    /* renamed from: g */
    public CropLayout.C97279e f271240g = CropLayout.C97279e.CENTER_INSIDE;

    /* renamed from: h */
    public long f271241h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMMediaCropLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        new LongSparseArray();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(getLayout(), layoutParams);
    }

    public final long getCurrentPreviewMediaId() {
        return this.f271241h;
    }

    public final CropLayout.C97279e getDefaultScaleType() {
        return this.f271240g;
    }

    public final ImageView getImageView() {
        return (ImageView) this.f271237d.getValue();
    }

    public final CropLayout getLayout() {
        return (CropLayout) this.f271239f.getValue();
    }

    public final CommonVideoView getVideoView() {
        return (CommonVideoView) this.f271238e.getValue();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getVideoView().mo79616c();
    }

    public final void setCurrentPreviewMediaId(long j) {
        this.f271241h = j;
    }

    public final void setDefaultScaleType(CropLayout.C97279e eVar) {
        C87412m.m108594g(eVar, "<set-?>");
        this.f271240g = eVar;
    }

    public final void setLockCropWindow(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMMediaCropLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        new LongSparseArray();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(getLayout(), layoutParams);
    }
}
