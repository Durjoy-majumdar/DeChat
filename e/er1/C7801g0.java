package er1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7435f2;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64237ap1;

/* renamed from: er1.g0 */
public final class C7801g0 {

    /* renamed from: a */
    public static final C7801g0 f26318a = new C7801g0();

    /* renamed from: a */
    public static final void m7947a(C7801g0 g0Var, Context context, BaseFinderFeed baseFinderFeed, C64237ap1 ap12, boolean z) {
        g0Var.getClass();
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        JSONObject jSONObject = new JSONObject();
        String str = "";
        if (ap12.f182116e == 2) {
            String str2 = ap12.f182115d;
            if (str2 != null) {
                str = str2;
            }
            jSONObject.put("shooting_templateid", str);
        } else {
            String str3 = ap12.f182115d;
            if (str3 != null) {
                str = str3;
            }
            jSONObject.put("templateId", str);
        }
        jSONObject.put("feedid", ((C58417y0) C86312j.m106911c(C58417y0.class)).xx0(baseFinderFeed.mo3513o().getFeedObject().f164794id));
        C13598b0 b0Var = C13598b0.f38549a;
        f2Var.mo8580d(q3, "shoot_same_video", z, jSONObject);
    }

    /* renamed from: b */
    public final void mo8907b(View view, int i, String str) {
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderCreateSameUtils", "setSameTemplateVisibility", "(Landroid/view/View;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/utils/FinderCreateSameUtils", "setSameTemplateVisibility", "(Landroid/view/View;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
