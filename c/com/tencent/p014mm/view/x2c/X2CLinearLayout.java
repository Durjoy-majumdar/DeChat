package com.tencent.p014mm.view.x2c;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gy3.C87412m;
import kotlin.Metadata;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000bB%\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/view/x2c/X2CLinearLayout;", "Landroid/widget/LinearLayout;", "Lwq3/h;", "Landroid/content/res/Resources;", "getResources", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.x2c.X2CLinearLayout */
public class X2CLinearLayout extends LinearLayout implements C111847h {
    public X2CLinearLayout(Context context) {
        super(context);
    }

    public Resources getResources() {
        Resources resources = getContext().getResources();
        C87412m.m108593f(resources, "context.resources");
        return resources;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public X2CLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public X2CLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
