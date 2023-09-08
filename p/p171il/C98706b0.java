package p171il;

import android.view.View;
import android.view.ViewGroup;
import gy3.C87412m;
import j20.C117292a;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import my3.C61595o;
import p813fl.C97904g;
import p813fl.C97927q0;
import sx3.C36904l0;

/* renamed from: il.b0 */
public class C98706b0 extends C98748z<C97904g> {

    /* renamed from: B */
    public int f289446B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98706b0(View view, int i) {
        super(view, (C98744t) null);
        C87412m.m108594g(view, "itemView");
        this.f289446B = i;
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        View view = this.f44854d;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        Iterator it = C61595o.m72301i(0, ((ViewGroup) view).getChildCount()).iterator();
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            View view2 = this.f44854d;
            C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt = ((ViewGroup) view2).getChildAt(a);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = childAt;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/emoji/panel/adapter/SimilarEmojiFullPageViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/emoji/panel/adapter/SimilarEmojiFullPageViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById = this.f44854d.findViewById(this.f289446B);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = findViewById;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/emoji/panel/adapter/SimilarEmojiFullPageViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/emoji/panel/adapter/SimilarEmojiFullPageViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
