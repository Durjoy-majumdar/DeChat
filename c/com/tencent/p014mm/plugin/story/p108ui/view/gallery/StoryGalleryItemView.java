package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentView;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gw2.C98268m;
import gy3.C87412m;
import jw2.C99066b;
import jw2.C99068c;
import kotlin.Metadata;
import zv2.C103109c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020!¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0006XD¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006@"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryItemView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr;", "videoViewMgr", "Lrx3/b0;", "setVideoViewMgr", "", "isMute", "setMute", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getThumbView", "()Landroid/widget/ImageView;", "thumbView", "Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "f", "Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "getCommentView", "()Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "commentView", "Lcom/tencent/mm/plugin/story/ui/view/StoryMsgView;", "g", "Lcom/tencent/mm/plugin/story/ui/view/StoryMsgView;", "getMsgView", "()Lcom/tencent/mm/plugin/story/ui/view/StoryMsgView;", "msgView", "", "h", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "Lgw2/m;", "i", "Lgw2/m;", "getVideoItem", "()Lgw2/m;", "setVideoItem", "(Lgw2/m;)V", "videoItem", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "j", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "getPostTipView", "()Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "setPostTipView", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;)V", "postTipView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView */
public final class StoryGalleryItemView extends RelativeLayout {

    /* renamed from: d */
    public final String f282046d = "MircoMsg.StoryGalleryItemView";

    /* renamed from: e */
    public final ImageView f282047e;

    /* renamed from: f */
    public final StoryCommentView f282048f;

    /* renamed from: g */
    public final StoryMsgView f282049g;

    /* renamed from: h */
    public int f282050h;

    /* renamed from: i */
    public C98268m f282051i;

    /* renamed from: j */
    public StoryGalleryPostTip f282052j;

    /* renamed from: n */
    public ViewGroup f282053n;

    /* renamed from: o */
    public final FrameLayout.LayoutParams f282054o;

    /* renamed from: p */
    public StoryVideoViewMgr f282055p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryGalleryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.f282054o = new FrameLayout.LayoutParams(-1, -1);
        setBackgroundColor(-16777216);
        this.f282053n = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.f282047e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, layoutParams);
        addView(this.f282053n, layoutParams);
        StoryCommentView storyCommentView = new StoryCommentView(context, (AttributeSet) null);
        this.f282048f = storyCommentView;
        addView(storyCommentView, layoutParams);
        StoryMsgView storyMsgView = new StoryMsgView(context, (AttributeSet) null, 0);
        this.f282049g = storyMsgView;
        addView(storyMsgView, layoutParams);
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f282052j = new StoryGalleryPostTip(context2, (AttributeSet) null, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, C75044y4.m89989a(getContext()) + C75044y4.m89996h(getContext()));
        layoutParams2.addRule(10);
        addView(this.f282052j, layoutParams2);
        if (C103109c.f304232b.mo108963a()) {
            storyMsgView.setVisibility(0);
            storyCommentView.setVisibility(8);
            return;
        }
        storyMsgView.setVisibility(8);
        storyCommentView.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo134355a() {
        if (C103109c.f304232b.mo108963a()) {
            this.f282049g.setVisibility(0);
            this.f282048f.setVisibility(8);
            return;
        }
        this.f282049g.setVisibility(8);
        this.f282048f.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo134356b() {
        Log.m105924i(this.f282046d, "switchVideoMode");
        C98268m mVar = this.f282051i;
        if (mVar != null) {
            mVar.mo137568b();
            StoryVideoViewMgr storyVideoViewMgr = this.f282055p;
            if (storyVideoViewMgr != null) {
                storyVideoViewMgr.mo134424b(this.f282053n, this.f282054o);
            }
            StoryVideoViewMgr storyVideoViewMgr2 = this.f282055p;
            if (storyVideoViewMgr2 != null) {
                storyVideoViewMgr2.mo134425c(mVar, false);
            }
        }
        this.f282053n.setVisibility(0);
        if (C103109c.f304232b.mo108963a()) {
            this.f282049g.setVisibility(0);
            this.f282048f.setVisibility(8);
            this.f282049g.mo134308d();
        } else {
            this.f282049g.setVisibility(8);
            this.f282048f.setVisibility(0);
            StoryCommentView storyCommentView = this.f282048f;
            storyCommentView.f281883I = true;
            storyCommentView.mo134253e();
        }
        C98268m mVar2 = this.f282051i;
        if (mVar2 != null) {
            C99068c.f290406a.mo138411b(mVar2.f288091d, false, mVar2.f288089b);
            C99066b.f290392a.mo138408b(mVar2.f288091d, false, mVar2.f288089b, -1, -1);
        }
    }

    public final StoryCommentView getCommentView() {
        return this.f282048f;
    }

    public final StoryMsgView getMsgView() {
        return this.f282049g;
    }

    public final int getPosition() {
        return this.f282050h;
    }

    public final StoryGalleryPostTip getPostTipView() {
        return this.f282052j;
    }

    public final String getTAG() {
        return this.f282046d;
    }

    public final ImageView getThumbView() {
        return this.f282047e;
    }

    public final C98268m getVideoItem() {
        return this.f282051i;
    }

    public void onDetachedFromWindow() {
        Log.m105918d(this.f282046d, "onDetachedFromWindow");
        super.onDetachedFromWindow();
        this.f282055p = null;
    }

    public final void setMute(boolean z) {
        StoryVideoViewMgr storyVideoViewMgr = this.f282055p;
        if (storyVideoViewMgr != null) {
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "setMute " + z + " ret " + "");
            storyVideoViewMgr.f282152c = z;
        }
    }

    public final void setPosition(int i) {
        this.f282050h = i;
    }

    public final void setPostTipView(StoryGalleryPostTip storyGalleryPostTip) {
        this.f282052j = storyGalleryPostTip;
    }

    public final void setVideoItem(C98268m mVar) {
        this.f282051i = mVar;
    }

    public final void setVideoViewMgr(StoryVideoViewMgr storyVideoViewMgr) {
        this.f282055p = storyVideoViewMgr;
    }
}
