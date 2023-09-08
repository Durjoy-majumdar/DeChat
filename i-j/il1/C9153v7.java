package il1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import qo3.C12925w;
import rx3.C13598b0;
import te3.C51613uy0;
import te3.C64247az0;

/* renamed from: il1.v7 */
public final class C9153v7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f28826d;

    /* renamed from: e */
    public final /* synthetic */ int f28827e;

    /* renamed from: f */
    public final /* synthetic */ C64247az0 f28828f;

    /* renamed from: g */
    public final /* synthetic */ C51613uy0 f28829g;

    /* renamed from: il1.v7$a */
    public static final class C9154a extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60362c7 f28830d;

        /* renamed from: e */
        public final /* synthetic */ int f28831e;

        /* renamed from: f */
        public final /* synthetic */ C64247az0 f28832f;

        /* renamed from: g */
        public final /* synthetic */ C51613uy0 f28833g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9154a(C60362c7 c7Var, int i, C64247az0 az02, C51613uy0 uy02) {
            super(2);
            this.f28830d = c7Var;
            this.f28831e = i;
            this.f28832f = az02;
            this.f28833g = uy02;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj2;
            if (((Boolean) obj).booleanValue()) {
                C60362c7 c7Var = this.f28830d;
                c7Var.f172101C = -1;
                c7Var.mo85338m(this.f28831e, this.f28832f, this.f28833g);
            } else {
                Context context = this.f28830d.f172116a.getContext();
                if (str == null) {
                    str = "";
                }
                C60362c7 c7Var2 = this.f28830d;
                if (str.length() == 0) {
                    str = c7Var2.f172116a.getContext().getString(C0966R.string.dnr);
                    C87412m.m108593f(str, "root.context.getString(c…_live_game_prepare_error)");
                }
                C76912y0.m92767f(context, str);
            }
            C12925w wVar = this.f28830d.f172130o;
            if (wVar != null) {
                wVar.mo5085n();
            }
            return C13598b0.f38549a;
        }
    }

    public C9153v7(C60362c7 c7Var, int i, C64247az0 az02, C51613uy0 uy02) {
        this.f28826d = c7Var;
        this.f28827e = i;
        this.f28828f = az02;
        this.f28829g = uy02;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$setupBottomSheetForNormalGameTeam$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C60362c7 c7Var = this.f28826d;
        c7Var.mo85327b(new C9154a(c7Var, this.f28827e, this.f28828f, this.f28829g));
        this.f28826d.mo85341p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$setupBottomSheetForNormalGameTeam$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
