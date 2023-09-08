package rs1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import er1.C7919x;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import tc2.C118418g;

/* renamed from: rs1.q3 */
public final class C13376q3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean[] f37891d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f37892e;

    /* renamed from: f */
    public final /* synthetic */ TextView f37893f;

    /* renamed from: g */
    public final /* synthetic */ C13345o3 f37894g;

    /* renamed from: h */
    public final /* synthetic */ boolean f37895h;

    /* renamed from: i */
    public final /* synthetic */ View f37896i;

    /* renamed from: j */
    public final /* synthetic */ View f37897j;

    /* renamed from: n */
    public final /* synthetic */ C60905o f37898n;

    public C13376q3(boolean[] zArr, C32224a<C13598b0> aVar, TextView textView, C13345o3 o3Var, boolean z, View view, View view2, C60905o oVar) {
        this.f37891d = zArr;
        this.f37892e = aVar;
        this.f37893f = textView;
        this.f37894g = o3Var;
        this.f37895h = z;
        this.f37896i = view;
        this.f37897j = view2;
        this.f37898n = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f37891d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            C118418g gVar = C118418g.INSTANCE;
            gVar.w40("ce_feed_follow", "<FeedFollow>");
            gVar.mo175827n9("ce_feed_follow", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
            gVar.ec0("ce_feed_follow");
        }
        this.f37892e.invoke();
        this.f37893f.setText(C0966R.string.fje);
        this.f37893f.setTextColor(this.f37894g.getContext().getResources().getColor(this.f37895h ? C0966R.color.BW_0_Alpha_0_3 : C0966R.color.f3583yg));
        TextView textView = this.f37893f;
        C87412m.m108593f(textView, "followTv");
        C7919x.m8092b(textView);
        View view2 = this.f37896i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f37897j.setBackground(this.f37898n.f173499A.getDrawable(this.f37895h ? C0966R.C0969drawable.cil : C0966R.C0969drawable.f5117xb));
        int dimensionPixelOffset = this.f37898n.f173499A.getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);
        View view4 = this.f37897j;
        view4.setPadding(dimensionPixelOffset, view4.getPaddingTop(), dimensionPixelOffset, this.f37897j.getPaddingBottom());
        this.f37897j.setOnClickListener((View.OnClickListener) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
