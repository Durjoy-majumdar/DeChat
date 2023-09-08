package rf2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.ProfileLiveNotifyTextLayout;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: rf2.e */
public final class C48024e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ProfileLiveNotifyTextLayout f128822d;

    public C48024e(ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout) {
        this.f128822d = profileLiveNotifyTextLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<TextView, C13598b0> onClickExpandBtn = this.f128822d.getOnClickExpandBtn();
        if (onClickExpandBtn != null) {
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
            onClickExpandBtn.invoke((TextView) view);
        }
        ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout = this.f128822d;
        profileLiveNotifyTextLayout.mo66925b(profileLiveNotifyTextLayout.f115811e, profileLiveNotifyTextLayout.f115813g, profileLiveNotifyTextLayout.f115815i);
        ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout2 = this.f128822d;
        ProfileLiveNotifyTextLayout.m46452a(profileLiveNotifyTextLayout2, profileLiveNotifyTextLayout2.f115814h);
        ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout3 = this.f128822d;
        ProfileLiveNotifyTextLayout.m46452a(profileLiveNotifyTextLayout3, profileLiveNotifyTextLayout3.f115815i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
