package com.tencent.p014mm.plugin.multitask.p079ui.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import gy3.C87412m;
import kotlin.Metadata;
import r92.C110554a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapViewWrapper;", "Landroid/widget/FrameLayout;", "Lr92/a;", "Landroid/graphics/Bitmap;", "bitmap", "Lrx3/b0;", "setBitmap", "Landroid/view/View;", "getView", "Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;", "d", "Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;", "getSnapView", "()Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;", "setSnapView", "(Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;)V", "snapView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapViewWrapper */
public class MultiTaskSnapViewWrapper extends FrameLayout implements C110554a {

    /* renamed from: d */
    public MultiTaskSnapView f272146d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTaskSnapViewWrapper(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo129491a();
    }

    /* renamed from: a */
    public final void mo129491a() {
        MultiTaskSnapView multiTaskSnapView = new MultiTaskSnapView(getContext());
        this.f272146d = multiTaskSnapView;
        addView(multiTaskSnapView);
        MultiTaskSnapView multiTaskSnapView2 = this.f272146d;
        if (multiTaskSnapView2 != null) {
            multiTaskSnapView2.setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    public final MultiTaskSnapView getSnapView() {
        return this.f272146d;
    }

    public View getView() {
        return this;
    }

    public void setBitmap(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, 1.0f);
        MultiTaskSnapView multiTaskSnapView = this.f272146d;
        if (multiTaskSnapView != null) {
            multiTaskSnapView.setImageMatrix(matrix);
        }
        MultiTaskSnapView multiTaskSnapView2 = this.f272146d;
        if (multiTaskSnapView2 != null) {
            multiTaskSnapView2.setImageBitmap(bitmap);
        }
    }

    public final void setSnapView(MultiTaskSnapView multiTaskSnapView) {
        this.f272146d = multiTaskSnapView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTaskSnapViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo129491a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTaskSnapViewWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo129491a();
    }
}
