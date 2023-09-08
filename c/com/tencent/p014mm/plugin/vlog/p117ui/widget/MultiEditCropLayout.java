package com.tencent.p014mm.plugin.vlog.p117ui.widget;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/MultiEditCropLayout;", "Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout */
public class MultiEditCropLayout extends CropLayout {

    /* renamed from: Q0 */
    public boolean f316992Q0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiEditCropLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo82325c(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e1");
        if (!this.f316992Q0) {
            super.mo82325c(motionEvent);
            return;
        }
        CropLayout.C106804b onChangeListener = getOnChangeListener();
        CropLayout.C106805c cVar = onChangeListener instanceof CropLayout.C106805c ? (CropLayout.C106805c) onChangeListener : null;
        if (cVar != null) {
            cVar.mo154489a();
        }
    }

    /* renamed from: l */
    public void mo152390l(boolean z, int i, int i2, int i3, int i4) {
        if (!this.f316992Q0) {
            super.mo152390l(z, i, i2, i3, i4);
            return;
        }
        View contentView = getContentView();
        if (contentView != null && this.f319542A) {
            setShouldLayout(false);
            getContentBaseRect().set(contentView.getLeft(), contentView.getTop(), contentView.getRight(), contentView.getBottom());
            contentView.setPivotX(getContentBaseRect().exactCenterX());
            contentView.setPivotY(getContentBaseRect().exactCenterY());
            getTmpRectF().set(getContentBaseRect());
            getMainMatrix().mapRect(getTmpRectF());
            getTmpRectF().round(getContentRect());
            getContentRectF().set(getTmpRectF());
            if (getInitFinish().invoke(getMainMatrix()).booleanValue()) {
                mo154485v();
                getContentRectF().round(getContentCenterRect());
            }
        }
    }

    /* renamed from: w */
    public void mo152391w(RectF rectF, boolean z) {
        C87412m.m108594g(rectF, "rectF");
        if (!this.f316992Q0) {
            super.mo152391w(rectF, z);
        } else {
            getVisibilityRect().set(rectF);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiEditCropLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
