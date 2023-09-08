package ej1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import cj1.C0581o5;
import cj1.C54845x3;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;
import qk1.C12806i0;
import wk1.C15437l;
import wk1.C15439m;
import yg1.C15999b;

/* renamed from: ej1.a0 */
public final class C7665a0 extends C15999b {

    /* renamed from: i */
    public final String f26017i = "CommentItemOfficialAccount";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7665a0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        Context context2 = context;
        C12806i0.C12807a aVar2 = aVar;
        C0581o5 o5Var2 = o5Var;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(aVar2, "holder");
        C87412m.m108594g(o5Var2, "msg");
        if (o5Var2 instanceof C54845x3) {
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context2, context2.getString(C0966R.string.e0f) + ' ' + o5Var.getContent()));
            Drawable a = C15437l.C15438a.m14437a(C15437l.f41880f, mo8799m(), 0.0f, 0.0f, 6, (Object) null);
            String m = mo8799m();
            float f = C15439m.f41885k;
            uVar.mo105705b(new C15437l(a, new C15439m(m, f, f, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8), C15439m.f41883i, MMApplicationContext.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9), C15439m.f41884j, 0.0f, 128, (C8480h) null)), 0, mo8799m().length() + 0, 33);
            aVar2.f36658A.mo104279b(uVar);
            aVar2.f36658A.setTextSize((float) this.f43055h);
            aVar2.f36658A.setVisibility(0);
            aVar2.f36659B.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.f5166yy));
            View view = aVar2.f36660C;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemOfficialAccount", "onBinderOfficialAccountMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemOfficialAccount", "onBinderOfficialAccountMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewParent parent = aVar2.f36658A.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) parent;
            relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
            aVar2.f36658A.setMaxLines(1);
            aVar2.f36658A.setEllipsize(TextUtils.TruncateAt.END);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8608i((C8777j5) c, C54067f0.C0066n.LIVE_ENTER_BIZ, (Map) null, 2, (Object) null);
            aVar2.f36658A.setTag(C0966R.C0970id.d47, context2.getString(C0966R.string.e0f));
            return;
        }
        Log.m105924i(this.f26017i, "#onBinderOfficialAccountMsg msg is not an official account");
    }

    /* renamed from: j */
    public int mo8797j() {
        return 10019;
    }

    /* renamed from: m */
    public final String mo8799m() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e0f);
        C87412m.m108593f(string, "getContext().resources\n …official_account_tag_txt)");
        return string;
    }
}
