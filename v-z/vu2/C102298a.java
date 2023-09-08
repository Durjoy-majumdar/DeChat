package vu2;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;

/* renamed from: vu2.a */
public final class C102298a extends ViewGroup {

    /* renamed from: d */
    public int f301290d;

    /* renamed from: e */
    public ColorDrawable f301291e;

    /* renamed from: f */
    public final int f301292f;

    /* renamed from: g */
    public final int f301293g = C94866e1.Hx0();

    /* renamed from: h */
    public final ArrayList<MaskImageView> f301294h = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102298a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f301291e = new ColorDrawable(C76577a.m92153d(context, C0966R.color.f2930d));
        int b = C76577a.m92151b(context, 1);
        this.f301292f = C76577a.m92151b(context, 3);
        setPadding(b, b, b, b);
    }

    /* renamed from: a */
    public final boolean mo141846a() {
        SnsMethodCalculate.markStartTimeMs("isAllImgViewAttached", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        for (View view : getChildList()) {
            if ((view instanceof MaskImageView) && !((MaskImageView) view).f266837E) {
                SnsMethodCalculate.markEndTimeMs("isAllImgViewAttached", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
                return false;
            }
        }
        SnsMethodCalculate.markEndTimeMs("isAllImgViewAttached", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        return true;
    }

    /* renamed from: b */
    public final void mo141847b(int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("lineLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        int i4 = this.f301293g + this.f301292f;
        int i5 = i3 + i2;
        int i6 = 0;
        while (i2 < i5) {
            View childAt = getChildAt(i2);
            int i7 = i6 + 1;
            int i8 = i6 * i4;
            int i9 = i4 * i;
            int i15 = this.f301293g;
            int i16 = i8 + i15;
            int i17 = i15 + i9;
            childAt.layout(i8, i9, i16, i17);
            Log.m105926v("MicroMsg.ImproveMultiPhotoLayout", "lineLayout child left:" + i8 + " top:" + i9 + " right:" + i16 + " bottom:" + i17);
            i2++;
            i6 = i7;
        }
        SnsMethodCalculate.markEndTimeMs("lineLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }

    /* renamed from: c */
    public final void mo141848c(int i) {
        SnsMethodCalculate.markStartTimeMs("updateMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        this.f301290d = i;
        while (this.f301290d > getChildCount()) {
            MaskImageView maskImageView = new MaskImageView(getContext());
            maskImageView.setScaleType(QImageView.C97274a.CENTER_CROP);
            maskImageView.setImageDrawable(this.f301291e);
            this.f301294h.add(maskImageView);
            int i2 = this.f301293g;
            addView(maskImageView, i2, i2);
        }
        while (this.f301290d < getChildCount()) {
            int childCount = getChildCount() - 1;
            removeViewAt(childCount);
            this.f301294h.remove(childCount);
        }
        Log.m105924i("MicroMsg.ImproveMultiPhotoLayout", "updateMediaList media size:" + i + " child count:" + getChildCount());
        SnsMethodCalculate.markEndTimeMs("updateMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }

    public final List<View> getChildList() {
        SnsMethodCalculate.markStartTimeMs("getChildList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        ArrayList<MaskImageView> arrayList = this.f301294h;
        SnsMethodCalculate.markEndTimeMs("getChildList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        return arrayList;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        int childCount = getChildCount();
        if (childCount >= 0 && childCount < 4) {
            mo141847b(0, 0, getChildCount());
        } else if (childCount == 4) {
            mo141847b(0, 0, 2);
            mo141847b(1, 2, 2);
        } else {
            if (5 <= childCount && childCount < 7) {
                mo141847b(0, 0, 3);
                mo141847b(1, 3, getChildCount() - 3);
            } else {
                if (7 <= childCount && childCount < 10) {
                    mo141847b(0, 0, 3);
                    mo141847b(1, 3, 3);
                    mo141847b(2, 6, getChildCount() - 6);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            measureChild(childAt, 1073741824, 1073741824);
            Log.m105926v("MicroMsg.ImproveMultiPhotoLayout", "measure child size:" + childAt.getMeasuredWidth() + ' ' + childAt.getMeasuredHeight());
        }
        int childCount2 = getChildCount() % 3;
        int childCount3 = getChildCount() / 3;
        if (childCount2 > 0) {
            i3 = 1;
        }
        setMeasuredDimension(i, (childCount3 + i3) * (this.f301293g + this.f301292f));
        Log.m105926v("MicroMsg.ImproveMultiPhotoLayout", "measure parent size:" + getMeasuredWidth() + ' ' + getMeasuredHeight());
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }
}
