package vd3;

import android.view.View;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileEditPhoneNumberView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vd3.s */
public class C78413s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ProfileEditPhoneNumberView f229755d;

    public C78413s(ProfileEditPhoneNumberView profileEditPhoneNumberView) {
        this.f229755d = profileEditPhoneNumberView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f229755d;
        int i = ProfileEditPhoneNumberView.f211630n;
        profileEditPhoneNumberView.mo100273b((String) null, false, true);
        if (this.f229755d.f211634h.getChildCount() > 5) {
            this.f229755d.mo100274c();
        } else {
            this.f229755d.mo100278f();
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
