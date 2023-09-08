package qz0;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import hz0.C46153l0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import oz0.C47407b;

/* renamed from: qz0.i */
public class C47911i {

    /* renamed from: a */
    public View f128542a;

    /* renamed from: b */
    public MMActivity f128543b;

    /* renamed from: c */
    public View f128544c;

    /* renamed from: d */
    public TextView f128545d;

    /* renamed from: e */
    public TextView f128546e;

    public C47911i(MMActivity mMActivity, View view) {
        this.f128543b = mMActivity;
        this.f128542a = view;
    }

    /* renamed from: a */
    public void mo72675a() {
        Integer num = (Integer) C46153l0.yx0().mo71382a("key_share_card_show_type");
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 || C47407b.m52740b()) {
            View view = this.f128544c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f128544c;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f128545d.setVisibility(0);
        ShareCardInfo shareCardInfo = new ShareCardInfo();
        if (!TextUtils.isEmpty(shareCardInfo.mo23268P(10))) {
            this.f128545d.setVisibility(0);
            this.f128545d.setText(shareCardInfo.mo23268P(10));
        } else {
            this.f128545d.setVisibility(8);
        }
        if (!TextUtils.isEmpty("")) {
            this.f128546e.setVisibility(0);
            this.f128546e.setText("");
            return;
        }
        this.f128546e.setVisibility(8);
    }
}
