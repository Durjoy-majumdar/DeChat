package com.tencent.p014mm.plugin.sns.cover.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import p166hy.C33133k0;
import p166hy.C98563j0;
import pr2.C100846e;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\u001c\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0003¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "Lrx3/b0;", "getSourceDecodeCallback", "callback", "setSourceDecodeCallback", "Lpr2/e;", "getSnsCoverReporter", "reporter", "setSnsCoverReporter", "source", "setImageBitmapWithFade", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sns-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView */
public final class SnsCoverFadeImageView extends AppCompatImageView {

    /* renamed from: g */
    public static final /* synthetic */ int f274653g = 0;

    /* renamed from: f */
    public final C98563j0 f274654f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsCoverFadeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        C33133k0 k0Var = (C33133k0) C86312j.m106911c(C33133k0.class);
        this.f274654f = k0Var != null ? k0Var.mo58709lz(this) : null;
    }

    public final C100846e getSnsCoverReporter() {
        C98563j0 j0Var = this.f274654f;
        if (j0Var != null) {
            return j0Var.getSnsCoverReporter();
        }
        return null;
    }

    public final C32226l<Bitmap, C13598b0> getSourceDecodeCallback() {
        C98563j0 j0Var = this.f274654f;
        if (j0Var != null) {
            return j0Var.mo137934b();
        }
        return null;
    }

    public final void setImageBitmapWithFade(Bitmap bitmap) {
        C98563j0 j0Var = this.f274654f;
        if (j0Var != null) {
            j0Var.mo137935c(bitmap);
        }
    }

    public final void setSnsCoverReporter(C100846e eVar) {
        C98563j0 j0Var = this.f274654f;
        if (j0Var != null) {
            j0Var.mo137937e(eVar);
        }
    }

    public final void setSourceDecodeCallback(C32226l<? super Bitmap, C13598b0> lVar) {
        C98563j0 j0Var = this.f274654f;
        if (j0Var != null) {
            j0Var.mo137933a(lVar);
        }
    }
}
