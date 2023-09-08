package f22;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.label.p067ui.searchContact.ContactDataItemList;
import com.tencent.p014mm.plugin.label.p067ui.searchContact.ContactManagerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import java.util.List;
import nj3.C11184p0;
import nj3.C76879j;
import pc0.C11884l;
import zt3.C119157j;

/* renamed from: f22.g */
public final class C7975g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ContactManagerUI f26655d;

    public C7975g(ContactManagerUI contactManagerUI) {
        this.f26655d = contactManagerUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (i == 0) {
            ContactManagerUI contactManagerUI = this.f26655d;
            ContactDataItemList I7 = contactManagerUI.mo5663I7();
            C87412m.m108591d(I7);
            List<String> list = I7.f19778x;
            if (list == null || list.isEmpty()) {
                Log.m105928w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteScene] can not do scene. lable is null");
                return;
            }
            C11884l lVar = new C11884l(list, 1, 2, contactManagerUI.f19781d);
            C86709a0.m107529k().f251779b.mo123460f(lVar);
            contactManagerUI.f19790p = C76879j.m92723Q(contactManagerUI.getContext(), contactManagerUI.getString(C0966R.string.a3h), contactManagerUI.getString(C0966R.string.f7427v0), true, true, new C7976h(lVar));
            String str = "" + list.size();
            C87412m.m108594g(str, "actionInfo");
            ((C119157j) C119157j.f356862d).mo183875f(new C7977i(4, str));
        }
    }
}
