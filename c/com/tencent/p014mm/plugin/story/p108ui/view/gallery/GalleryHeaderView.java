package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import kotlin.Metadata;
import p196ln.C76705f;
import p629ny.C76979h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHeaderView;", "Landroid/widget/RelativeLayout;", "", "user", "Lrx3/b0;", "setUserName", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getAvatarIv", "()Landroid/widget/ImageView;", "setAvatarIv", "(Landroid/widget/ImageView;)V", "avatarIv", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getNickNameTv", "()Landroid/widget/TextView;", "setNickNameTv", "(Landroid/widget/TextView;)V", "nickNameTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryHeaderView */
public final class GalleryHeaderView extends RelativeLayout {

    /* renamed from: d */
    public ImageView f21279d;

    /* renamed from: e */
    public TextView f21280e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.c6r, this);
        this.f21279d = (ImageView) findViewById(C0966R.C0970id.a27);
        this.f21280e = (TextView) findViewById(C0966R.C0970id.hg4);
        setPadding(0, 0, 0, C75044y4.m89991c(context));
    }

    public final ImageView getAvatarIv() {
        return this.f21279d;
    }

    public final TextView getNickNameTv() {
        return this.f21280e;
    }

    public final void setAvatarIv(ImageView imageView) {
        this.f21279d = imageView;
    }

    public final void setNickNameTv(TextView textView) {
        this.f21280e = textView;
    }

    public final void setUserName(String str) {
        if (str != null) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            TextView textView = this.f21280e;
            if (textView != null) {
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), z1Var.mo62898f()));
            }
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f21279d, str, 0.5f);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
