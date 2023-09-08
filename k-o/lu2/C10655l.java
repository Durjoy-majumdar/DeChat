package lu2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: lu2.l */
public final class C10655l {

    /* renamed from: a */
    public static final C10655l f32071a = new C10655l();

    /* renamed from: a */
    public final String mo10923a(int i, int i2) {
        String str;
        SnsMethodCalculate.markStartTimeMs("getWording", "com.tencent.mm.plugin.sns.ui.item.WsFoldWordManager");
        if (i == 1) {
            str = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f8194tz);
            C87412m.m108593f(str, "getString(MMApplicationC…ing.sns_item_ws_fold_pic)");
        } else if (i == 3) {
            str = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f8192tk);
            C87412m.m108593f(str, "getString(MMApplicationC…ng.sns_item_ws_fold_feed)");
        } else if (i == 5) {
            str = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f8196u1);
            C87412m.m108593f(str, "getString(MMApplicationC…g.sns_item_ws_fold_video)");
        } else if (i == 15) {
            str = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f8196u1);
            C87412m.m108593f(str, "getString(MMApplicationC…g.sns_item_ws_fold_video)");
        } else if (i != 28) {
            str = "";
        } else {
            str = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f8193ty);
            C87412m.m108593f(str, "getString(MMApplicationC….sns_item_ws_fold_finder)");
        }
        if (str.length() == 0) {
            str = MMApplicationContext.getContext().getResources().getString(C0966R.string.nc5, new Object[]{Integer.valueOf(i2)});
            C87412m.m108593f(str, "getContext().resources.g…_fold_default_desc, size)");
        } else if (i2 > 1) {
            str = str + MMApplicationContext.getContext().getResources().getString(C0966R.string.f8195u0, new Object[]{Integer.valueOf(i2)});
        }
        Log.m105924i("WsFoldWord", "[getWording] type = " + i + ", size = " + i2 + ", wording = " + str);
        SnsMethodCalculate.markEndTimeMs("getWording", "com.tencent.mm.plugin.sns.ui.item.WsFoldWordManager");
        return str;
    }
}
