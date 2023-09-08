package com.tencent.p014mm.pluginsdk.p133ui.applet;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageViewWithCompletion;", "Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageView;", "Landroid/graphics/Bitmap;", "bitmap", "Lrx3/b0;", "setImageBitmapCompleted", "Ljava/lang/Runnable;", "q", "Ljava/lang/Runnable;", "getCallback", "()Ljava/lang/Runnable;", "setCallback", "(Ljava/lang/Runnable;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "common-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.applet.CdnImageViewWithCompletion */
public final class CdnImageViewWithCompletion extends CdnImageView {

    /* renamed from: q */
    public Runnable f211660q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CdnImageViewWithCompletion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attr");
    }

    public final Runnable getCallback() {
        return this.f211660q;
    }

    public final void setCallback(Runnable runnable) {
        this.f211660q = runnable;
    }

    public void setImageBitmapCompleted(Bitmap bitmap) {
        super.setImageBitmapCompleted(bitmap);
        Runnable runnable = this.f211660q;
        if (runnable != null) {
            runnable.run();
        }
    }
}
