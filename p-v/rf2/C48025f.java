package rf2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.ProfileLiveNotifyTextLayout;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: rf2.f */
public final class C48025f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ProfileLiveNotifyTextLayout f128823d;

    public C48025f(ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout) {
        this.f128823d = profileLiveNotifyTextLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<TextView, C13598b0> onClickCollapseBtn = this.f128823d.getOnClickCollapseBtn();
        if (onClickCollapseBtn != null) {
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
            onClickCollapseBtn.invoke((TextView) view);
        }
        ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout = this.f128823d;
        profileLiveNotifyTextLayout.mo66925b(profileLiveNotifyTextLayout.f115810d, profileLiveNotifyTextLayout.f115812f, profileLiveNotifyTextLayout.f115814h);
        ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout2 = this.f128823d;
        ProfileLiveNotifyTextLayout.m46452a(profileLiveNotifyTextLayout2, profileLiveNotifyTextLayout2.f115814h);
        ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout3 = this.f128823d;
        ProfileLiveNotifyTextLayout.m46452a(profileLiveNotifyTextLayout3, profileLiveNotifyTextLayout3.f115815i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
