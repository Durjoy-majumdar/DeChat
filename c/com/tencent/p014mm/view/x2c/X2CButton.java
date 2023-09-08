package com.tencent.p014mm.view.x2c;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import gy3.C87412m;
import kotlin.Metadata;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB%\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/view/x2c/X2CButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lwq3/h;", "Landroid/content/res/Resources;", "getResources", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.x2c.X2CButton */
public class X2CButton extends AppCompatButton implements C111847h {
    public X2CButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Resources getResources() {
        Resources resources = getContext().getResources();
        C87412m.m108593f(resources, "context.resources");
        return resources;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public X2CButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
