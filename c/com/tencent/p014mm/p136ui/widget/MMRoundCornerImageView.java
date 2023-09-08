package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import go3.C76017w;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/MMRoundCornerImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "radius", "Lrx3/b0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.MMRoundCornerImageView */
public final class MMRoundCornerImageView extends AppCompatImageView {

    /* renamed from: f */
    public int f220402f;

    /* renamed from: g */
    public final C76017w f220403g;

    /* renamed from: com.tencent.mm.ui.widget.MMRoundCornerImageView$a */
    public static final class C74957a extends ViewOutlineProvider {

        /* renamed from: a */
        public int f220404a;

        public C74957a(int i) {
            this.f220404a = i;
        }

        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect(0, 0, view != null ? view.getMeasuredWidth() : 0, view != null ? view.getMeasuredHeight() : 0);
            if (outline != null) {
                outline.setRoundRect(rect, (float) this.f220404a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f220403g = new C76017w(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226870p);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…e.MMRoundCornerImageView)");
            this.f220402f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        setClipToOutline(true);
        setOutlineProvider(new C74957a(this.f220402f));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f220403g.mo106233a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f220403g.f222877c = false;
    }

    public boolean post(Runnable runnable) {
        C76017w wVar = this.f220403g;
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

    public final void setRadius(int i) {
        this.f220402f = i;
        setClipToOutline(true);
        setOutlineProvider(new C74957a(i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MMRoundCornerImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MMRoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
