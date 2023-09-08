package com.tencent.p014mm.plugin.profile.p088ui.tab.list;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import p629ny.C76979h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileErrorFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileErrorFragment */
public final class BizProfileErrorFragment extends BaseBizProfileFragment {

    /* renamed from: j */
    public String f115699j;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f7058wh, viewGroup, false);
        View findViewById = inflate.findViewById(C0966R.C0970id.aam);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.biz_profile_err_msg_text)");
        MMNeat7extView mMNeat7extView = (MMNeat7extView) findViewById;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = mMNeat7extView.getContext();
        String str = this.f115699j;
        if (str != null) {
            mMNeat7extView.mo104279b(hVar.mo107081qu(context, str, (int) mMNeat7extView.getTextSize()));
            return inflate;
        }
        C87412m.m108603p(OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
        throw null;
    }
}
