package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import fy0.C8219i;
import kg3.C76577a;
import kotlin.Metadata;
import kw0.C46746a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/ContactWidgetActionLiveBar;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetActionLiveBar */
public final class ContactWidgetActionLiveBar extends LinearLayout {
    public ContactWidgetActionLiveBar(Context context) {
        super(context);
        mo66823a(context);
    }

    /* renamed from: a */
    public final void mo66823a(Context context) {
        if (context != null) {
            LayoutInflater.from(context).inflate(C0966R.C0971layout.d17, this, true);
            setBackgroundColor(Color.parseColor(!C85875k4.m106211z() ? "#08000000" : "#0DFFFFFF"));
            C8219i.f27144a.mo9271b((TextView) findViewById(C0966R.C0970id.nj8));
            C46746a.m52038k(C46746a.f125826a, this, (float) C76577a.m92151b(context, 15), false, false, 12, (Object) null);
            C7007c1.m7256a(this);
        }
    }

    public ContactWidgetActionLiveBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo66823a(context);
    }

    public ContactWidgetActionLiveBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo66823a(context);
    }
}
