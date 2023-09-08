package com.tencent.p014mm.p136ui.anim.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import gy3.C87412m;
import jj3.C60875a;
import jj3.C60876b;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/widget/XTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Ljj3/a;", "", "visibility", "Lrx3/b0;", "setVisibility", "Landroid/view/View;", "getView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.widget.XTextView */
public final class XTextView extends AppCompatTextView implements C60875a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public View getView() {
        return this;
    }

    /* renamed from: l */
    public void mo82004l(int i) {
        super.setVisibility(i);
    }

    public void setVisibility(int i) {
        C60876b.m71283a(this, i);
    }
}
