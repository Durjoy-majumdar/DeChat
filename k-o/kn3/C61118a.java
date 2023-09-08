package kn3;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import ln3.C76709a;
import nj3.C11183n0;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: kn3.a */
public abstract class C61118a<DATA extends C76709a<?>> extends C60896i<DATA> implements View.OnCreateContextMenuListener {

    /* renamed from: kn3.a$a */
    public static final class C61119a implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f174010d;

        /* renamed from: e */
        public final /* synthetic */ C61118a<DATA> f174011e;

        /* renamed from: f */
        public final /* synthetic */ C11184p0 f174012f;

        /* renamed from: g */
        public final /* synthetic */ ChatTipsBarGroup.C74825d f174013g;

        /* renamed from: h */
        public final /* synthetic */ View f174014h;

        /* renamed from: kn3.a$a$a */
        public static final class C61120a implements C11183n0 {

            /* renamed from: a */
            public boolean f174015a;

            /* renamed from: b */
            public final /* synthetic */ View f174016b;

            public C61120a(View view) {
                this.f174016b = view;
            }

            /* renamed from: a */
            public void mo2585a(View view, int i, MenuItem menuItem) {
                C87412m.m108594g(menuItem, "menuItem");
                if (menuItem.getItemId() == 0) {
                    C7335d c = C86312j.m106911c(C61212e.class);
                    View view2 = this.f174016b;
                    C61212e eVar = (C61212e) c;
                    eVar.o30(view, "group_msg_set_top_bar_delete");
                    eVar.mo86175pO(view, 40, 26356);
                    eVar.mo86138Fz(view, view2);
                    if (!this.f174015a) {
                        this.f174015a = true;
                        eVar.mo86153W7("view_exp", view, (Map<String, Object>) null, 26356);
                    }
                }
            }
        }

        public C61119a(int i, C61118a<DATA> aVar, C11184p0 p0Var, ChatTipsBarGroup.C74825d dVar, View view) {
            this.f174010d = i;
            this.f174011e = aVar;
            this.f174012f = p0Var;
            this.f174013g = dVar;
            this.f174014h = view;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert$bindLongClickMenu$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C78253a aVar = new C78253a(view.getContext());
            aVar.f229250s = new C61120a(this.f174014h);
            int i = this.f174010d;
            C61118a<DATA> aVar2 = this.f174011e;
            C11184p0 p0Var = this.f174012f;
            int[] iArr = this.f174013g.f219976d;
            aVar.mo108272g(view, i, 0, aVar2, p0Var, iArr[0], iArr[1]);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert$bindLongClickMenu$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
        View view = new View(oVar.f44854d.getContext());
        View view2 = oVar.f44854d;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = 0;
            layoutParams.height = 0;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: j */
    public final void mo86075j(View view, int i, ChatTipsBarGroup.C74825d dVar, C11184p0 p0Var) {
        C87412m.m108594g(view, "longClickView");
        C87412m.m108594g(dVar, "tipsBarContext");
        view.setOnLongClickListener(new C61119a(i, this, p0Var, dVar, view));
    }

    /* renamed from: k */
    public void mo86076k(C60905o oVar, DATA data, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(data, "item");
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(oVar.f44854d, "group_msg_set_top_bar");
        eVar.mo86175pO(oVar.f44854d, 40, 26356);
        eVar.mo86149PM(oVar.f44854d, data.mo106997b());
        super.mo44e(oVar, data, i, i2, z, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.getContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateContextMenu(android.view.ContextMenu r1, android.view.View r2, android.view.ContextMenu.ContextMenuInfo r3) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0017
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x0012
            r3 = 2131821435(0x7f11037b, float:1.9275613E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r3 = 0
            r1.add(r3, r3, r3, r2)
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kn3.C61118a.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }
}
