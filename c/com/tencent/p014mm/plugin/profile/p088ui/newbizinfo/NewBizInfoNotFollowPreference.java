package com.tencent.p014mm.plugin.profile.p088ui.newbizinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import gy3.C87412m;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoNotFollowPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoNotFollowPreference */
public final class NewBizInfoNotFollowPreference extends Preference {

    /* renamed from: J */
    public TextView f20302J;

    /* renamed from: K */
    public String f20303K = "";

    public NewBizInfoNotFollowPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        C87412m.m108594g(view, "view");
        super.mo1086w(view);
        View findViewById = view.findViewById(C0966R.C0970id.a_y);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.biz_follow_tv)");
        this.f20302J = (TextView) findViewById;
        if (!C112551y.m153811k(this.f20303K)) {
            TextView textView = this.f20302J;
            if (textView != null) {
                textView.setText(this.f20303K);
            } else {
                C87412m.m108603p("titleTv");
                throw null;
            }
        }
    }

    public NewBizInfoNotFollowPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
