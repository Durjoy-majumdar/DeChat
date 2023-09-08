package ej1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import cj1.C0544h;
import cj1.C0581o5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qk1.C12806i0;
import rx3.C13598b0;
import te3.C64674r41;
import tf0.C64916p1;
import wk1.C15437l;
import wk1.C15439m;
import yg1.C15999b;
import z04.C112551y;

/* renamed from: ej1.v */
public final class C7714v extends C15999b {

    /* renamed from: i */
    public final C45795b f26135i;

    /* renamed from: j */
    public final String f26136j = "CommentItemLocalSetManager";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7714v(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f26135i = bVar;
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        String str;
        Context context2 = context;
        C12806i0.C12807a aVar2 = aVar;
        C0581o5 o5Var2 = o5Var;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(aVar2, "holder");
        C87412m.m108594g(o5Var2, "msg");
        C13598b0 b0Var = null;
        if (!(o5Var2 instanceof C0544h)) {
            o5Var2 = null;
        }
        if (o5Var2 != null) {
            C0544h hVar = (C0544h) o5Var2;
            String str2 = hVar.f1323c;
            if (str2 == null || str2.length() == 0) {
                str = hVar.f1321a.f185126f;
            } else {
                String str3 = hVar.f1321a.f185126f;
                if (str3 != null) {
                    String str4 = hVar.f1323c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = str4;
                    C7335d c = C86312j.m106911c(C64916p1.class);
                    C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                    TextPaint paint = aVar2.f36658A.getPaint();
                    C87412m.m108593f(paint, "holder.contentTv.paint");
                    str = C112551y.m153814n(str3, str5, C64916p1.C64917a.m76441h((C64916p1) c, context, paint, String.valueOf(hVar.f1323c), 0, 8, (Object) null).toString(), false);
                } else {
                    str = null;
                }
            }
            if (str != null) {
                String str6 = mo8834m() + str;
                int length = hVar.f1322b == 1 ? str6.length() - mo8835n().length() : (str6.length() - mo8835n().length()) - 3;
                C75375u uVar = new C75375u(str6);
                Drawable a = C15437l.C15438a.m14437a(C15437l.f41880f, mo8834m(), 0.0f, 0.0f, 6, (Object) null);
                String m = mo8834m();
                float f = C15439m.f41885k;
                uVar.mo105705b(new C15437l(a, new C15439m(m, f, f, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3), C15439m.f41883i, MMApplicationContext.getContext().getResources().getColor(C0966R.color.al_), C15439m.f41884j, 0.0f, 128, (C8480h) null)), 0, mo8834m().length() + 0, 33);
                uVar.mo105705b(new C7713u(context2, this), length, mo8835n().length() + length, 33);
                aVar2.f36658A.mo104279b(uVar);
                aVar2.f36658A.setTextSize((float) this.f43055h);
                aVar2.f36658A.setVisibility(0);
                aVar2.f36659B.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.f5166yy));
                View view = aVar2.f36660C;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalSetManager", "onBindSetManagerInfo", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalSetManager", "onBindSetManagerInfo", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ViewParent parent = aVar2.f36658A.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
                RelativeLayout relativeLayout = (RelativeLayout) parent;
                relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
                b0Var = C13598b0.f38549a;
            }
        }
        if (b0Var == null) {
            Log.m105924i(this.f26136j, "[onBinderLocationMsg]  msg is not location");
        }
    }

    /* renamed from: d */
    public C0581o5 mo8796d(C64674r41 r412) {
        C87412m.m108594g(r412, "msg");
        return new C0544h(r412);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 100001;
    }

    /* renamed from: m */
    public final String mo8834m() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dgf);
        C87412m.m108593f(string, "getContext().resources.g…_annoucement_replacement)");
        return string;
    }

    /* renamed from: n */
    public final String mo8835n() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.mes);
        C87412m.m108593f(string, "getContext().resources.g…der_live_comment_manager)");
        return string;
    }
}
