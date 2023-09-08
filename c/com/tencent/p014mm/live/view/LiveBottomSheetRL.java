package com.tencent.p014mm.live.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/live/view/LiveBottomSheetRL;", "Landroid/widget/RelativeLayout;", "Landroid/view/View;", "contentView", "Lrx3/b0;", "setContentView", "Landroid/graphics/drawable/Drawable;", "background", "setContentBg", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.LiveBottomSheetRL */
public class LiveBottomSheetRL extends RelativeLayout {

    /* renamed from: d */
    public final String f157314d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveBottomSheetRL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f157314d = "MicroMsg.LiveBottomSheetRL";
        View.inflate(context, C0966R.C0971layout.b6j, this);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        String str = this.f157314d;
        Log.m105918d(str, "onNestedFling velocityX:" + f + " velocityY:" + f2 + " ViewConfiguration.getMinimumFlingVelocity():" + ViewConfiguration.getMinimumFlingVelocity());
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        return super.onNestedFling(view, f, f2, z);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        String str = this.f157314d;
        Log.m105918d(str, "onNestedPreScroll target:" + view + " dx:" + i + " dy:" + i2);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        String str = this.f157314d;
        Log.m105918d(str, "onNestedScroll target:" + view + " dxConsumed:" + i + " dyConsumed:" + i2 + " dxUnconsumed:" + i3 + " dyUnconsumed:" + i4);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        String str = this.f157314d;
        Log.m105918d(str, "onStartNestedScroll target:" + view2 + ",nestedScrollAxes:" + i);
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        String str = this.f157314d;
        Log.m105918d(str, "onStopNestedScroll child:" + view + ", totalConsumed:" + 0);
    }

    public final void setContentBg(Drawable drawable) {
        setBackground(drawable);
    }

    public final void setContentView(View view) {
        C87412m.m108594g(view, "contentView");
        addView(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LiveBottomSheetRL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
