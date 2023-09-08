package rs1;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import go1.C8366a;
import go1.C8367b;
import go1.C8368c;
import j20.C117292a;
import java.util.List;
import java.util.Map;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.f1 */
public final class C13227f1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Map<String, C8367b> f37566d;

    /* renamed from: e */
    public final /* synthetic */ List<String> f37567e;

    /* renamed from: f */
    public final /* synthetic */ Context f37568f;

    /* renamed from: g */
    public final /* synthetic */ C13176d1 f37569g;

    /* renamed from: h */
    public final /* synthetic */ C60905o f37570h;

    /* renamed from: i */
    public final /* synthetic */ BaseFinderFeed f37571i;

    public C13227f1(Map<String, C8367b> map, List<String> list, Context context, C13176d1 d1Var, C60905o oVar, BaseFinderFeed baseFinderFeed) {
        this.f37566d = map;
        this.f37567e = list;
        this.f37568f = context;
        this.f37569g = d1Var;
        this.f37570h = oVar;
        this.f37571i = baseFinderFeed;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TextView textView;
        int i2;
        ViewStub viewStub;
        C8367b bVar = this.f37566d.get(this.f37567e.get(i));
        if (bVar != null) {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37568f);
            int i3 = f != null ? f.mo12861q3().f134675i : 0;
            boolean z = true;
            int ordinal = bVar.f27349b.ordinal();
            if (ordinal == 2) {
                C13176d1.m12586c3(this.f37569g, this.f37570h, this.f37571i, i3, 2, 1, 2, "强化广告测试");
            } else if (ordinal == 3) {
                C13176d1.m12586c3(this.f37569g, this.f37570h, this.f37571i, i3, 1, 0, 2, "普通广告测试");
            } else if (ordinal == 11) {
                C13176d1.m12586c3(this.f37569g, this.f37570h, this.f37571i, i3, 2, 1, 3, "热点测试");
            } else if (ordinal != 13) {
                z = false;
            } else {
                C13176d1.m12586c3(this.f37569g, this.f37570h, this.f37571i, i3, 2, 1, 18, "音乐专题测试");
            }
            C8368c cVar = C8368c.f27352a;
            if (cVar.mo9335b(this.f37570h.hashCode(), bVar.f27349b)) {
                View view = null;
                int i4 = bVar.f27350c;
                if (i4 > 0) {
                    view = this.f37570h.mo85812D(i4);
                }
                if (view == null && (i2 = bVar.f27351d) > 0 && (viewStub = (ViewStub) this.f37570h.mo85812D(i2)) != null) {
                    viewStub.inflate();
                }
                if (!z && view != null) {
                    C60905o oVar = this.f37570h;
                    if (bVar.f27349b == C8366a.HOT_SEARCH && (textView = (TextView) view.findViewById(C0966R.C0970id.cyp)) != null) {
                        textView.setText("热搜气泡测试");
                    }
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDebugUIC$showPriorityDialog$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDebugUIC$showPriorityDialog$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    cVar.mo9337d(oVar, view, bVar.f27349b);
                }
            }
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }
}
