package qk1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import gl3.C75921a;
import gl3.C75922b;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p255vr.C78470h;

/* renamed from: qk1.t1 */
public final class C77360t1 extends C75921a {

    /* renamed from: B */
    public String f225558B;

    /* renamed from: C */
    public final C77362b f225559C = new C77362b();

    /* renamed from: D */
    public final C77361a f225560D = new C77361a(this);

    /* renamed from: qk1.t1$a */
    public final class C77361a implements C75922b.C75923a {

        /* renamed from: a */
        public TextView f225561a;

        /* renamed from: b */
        public View f225562b;

        public C77361a(C77360t1 t1Var) {
        }
    }

    /* renamed from: qk1.t1$b */
    public final class C77362b implements C75922b.C75924b {
        public C77362b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(aVar, "holder");
            C87412m.m108594g(bVar, "data");
            ((C78470h) C86312j.m106911c(C78470h.class)).mo108300VH(((C77360t1) bVar).f225558B, ((C77361a) aVar).f225561a);
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bwh, viewGroup, false);
            C77361a aVar = C77360t1.this.f225560D;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveHeaderDataItem.HeaderViewHolder");
            View view2 = null;
            TextView textView = inflate != null ? (TextView) inflate.findViewById(C0966R.C0970id.evf) : null;
            C87412m.m108592e(textView, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f225561a = textView;
            if (inflate != null) {
                view2 = inflate.findViewById(C0966R.C0970id.evg);
            }
            aVar.f225562b = view2;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveHeaderDataItem$HeaderViewItem", "inflateView", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveHeaderDataItem$HeaderViewItem", "inflateView", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (inflate != null) {
                inflate.setTag(aVar);
            }
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "data");
            return false;
        }
    }

    public C77360t1(int i) {
        super(0, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f225559C;
    }
}
