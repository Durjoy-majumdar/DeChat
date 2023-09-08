package com.tencent.p014mm.plugin.profile.p088ui.newbizinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import p629ny.C76979h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoErrMsgPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoErrMsgPreference */
public final class NewBizInfoErrMsgPreference extends Preference {

    /* renamed from: J */
    public String f20299J = "";

    public NewBizInfoErrMsgPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        C87412m.m108594g(view, "view");
        super.mo1086w(view);
        View findViewById = view.findViewById(C0966R.C0970id.aa8);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) findViewById;
        mMNeat7extView.mo154994l(1, 16.0f);
        mMNeat7extView.setTextColor(mMNeat7extView.getResources().getColor(C0966R.color.f3550xf));
        C87412m.m108593f(findViewById, "view.findViewById<MMNeat…ey_text_color))\n        }");
        MMNeat7extView mMNeat7extView2 = (MMNeat7extView) findViewById;
        mMNeat7extView2.mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).mo107081qu(mMNeat7extView2.getContext(), this.f20299J, (int) mMNeat7extView2.getTextSize()));
    }

    public NewBizInfoErrMsgPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
