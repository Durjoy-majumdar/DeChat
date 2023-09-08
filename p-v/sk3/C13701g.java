package sk3;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qg0.C12215a;
import rk3.C63462a;

/* renamed from: sk3.g */
public final class C13701g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13703i f38773d;

    public C13701g(C13703i iVar) {
        this.f38773d = iVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63462a.f180011a.mo88330e(104);
        String obj = C86709a0.m107535s().mo121142i().mo119684e(274436, "").toString();
        String string = this.f38773d.getActivity().getString(C0966R.string.g5g, new Object[]{LocaleUtil.getApplicationLanguage(), obj, "setting", 0, 0});
        C87412m.m108593f(string, "activity.getString(com.t…tryCode, \"setting\", 0, 0)");
        C12215a.m11778c(this.f38773d.getActivity(), string, 0, true);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
