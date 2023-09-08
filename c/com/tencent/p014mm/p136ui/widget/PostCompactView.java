package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import go3.C76017w;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/PostCompactView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.PostCompactView */
public final class PostCompactView extends View {

    /* renamed from: d */
    public final C76017w f220446d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PostCompactView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f220446d.mo106233a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f220446d.f222877c = false;
    }

    public boolean post(Runnable runnable) {
        C76017w wVar = this.f220446d;
        wVar.getClass();
        boolean z = false;
        if ((Build.VERSION.SDK_INT <= 23) && !wVar.f222877c) {
            ((ArrayList) wVar.f222876b).add(runnable);
            z = true;
        }
        if (z) {
            return true;
        }
        return super.post(runnable);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostCompactView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f220446d = new C76017w(this);
    }
}
