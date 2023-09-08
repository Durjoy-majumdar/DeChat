package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "Landroid/widget/RelativeLayout;", "Landroid/widget/LinearLayout;", "d", "Landroid/widget/LinearLayout;", "getPostTipLayout", "()Landroid/widget/LinearLayout;", "setPostTipLayout", "(Landroid/widget/LinearLayout;)V", "postTipLayout", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getPostTipIv", "()Landroid/widget/ImageView;", "setPostTipIv", "(Landroid/widget/ImageView;)V", "postTipIv", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getPostTipTv", "()Landroid/widget/TextView;", "setPostTipTv", "(Landroid/widget/TextView;)V", "postTipTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryPostTip */
public final class StoryGalleryPostTip extends RelativeLayout {

    /* renamed from: d */
    public LinearLayout f21292d;

    /* renamed from: e */
    public ImageView f21293e;

    /* renamed from: f */
    public TextView f21294f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryGalleryPostTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.c6w, this);
        View findViewById = findViewById(C0966R.C0970id.k7b);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_gallery_post_tip_iv)");
        this.f21293e = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k7c);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_gallery_post_tip_tv)");
        this.f21294f = (TextView) findViewById2;
        ImageView imageView = this.f21293e;
        Drawable drawable = getResources().getDrawable(C0966R.raw.icons_outlined_error);
        C74933u4.m89769f(drawable, -65536);
        imageView.setImageDrawable(drawable);
        setVisibility(8);
    }

    public final ImageView getPostTipIv() {
        return this.f21293e;
    }

    public final LinearLayout getPostTipLayout() {
        return this.f21292d;
    }

    public final TextView getPostTipTv() {
        return this.f21294f;
    }

    public final void setPostTipIv(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f21293e = imageView;
    }

    public final void setPostTipLayout(LinearLayout linearLayout) {
        this.f21292d = linearLayout;
    }

    public final void setPostTipTv(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f21294f = textView;
    }
}
