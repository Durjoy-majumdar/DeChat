package il1;

import ak1.C54116w;
import ak1.C54117x;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import qo3.C12925w;
import rx3.C13598b0;
import te3.C64247az0;

/* renamed from: il1.w7 */
public final class C9162w7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f28855d;

    /* renamed from: e */
    public final /* synthetic */ C64247az0 f28856e;

    /* renamed from: il1.w7$a */
    public static final class C9163a extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64247az0 f28857d;

        /* renamed from: e */
        public final /* synthetic */ C60362c7 f28858e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9163a(C64247az0 az02, C60362c7 c7Var) {
            super(2);
            this.f28857d = az02;
            this.f28858e = c7Var;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj2;
            if (((Boolean) obj).booleanValue()) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar = (C54116w) c;
                C64247az0 az02 = this.f28857d;
                C54116w.gy0(wVar, 22, 0, (String) null, az02 != null ? C54117x.m60831b(az02) : null, 6, (Object) null);
                C60362c7 c7Var = this.f28858e;
                c7Var.f172101C = -1;
                c7Var.mo85339n(this.f28857d);
            } else {
                Context context = this.f28858e.f172116a.getContext();
                if (str == null) {
                    str = "";
                }
                C60362c7 c7Var2 = this.f28858e;
                if (str.length() == 0) {
                    str = c7Var2.f172116a.getContext().getString(C0966R.string.dnr);
                    C87412m.m108593f(str, "root.context.getString(c…_live_game_prepare_error)");
                }
                C76912y0.m92767f(context, str);
            }
            C12925w wVar2 = this.f28858e.f172130o;
            if (wVar2 != null) {
                wVar2.mo5085n();
            }
            return C13598b0.f38549a;
        }
    }

    public C9162w7(C60362c7 c7Var, C64247az0 az02) {
        this.f28855d = c7Var;
        this.f28856e = az02;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$setupBottomSheetForNormalGameTeam$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C60362c7 c7Var = this.f28855d;
        c7Var.mo85327b(new C9163a(this.f28856e, c7Var));
        this.f28855d.mo85341p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$setupBottomSheetForNormalGameTeam$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
