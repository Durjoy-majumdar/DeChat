package p171il;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p813fl.C97927q0;

/* renamed from: il.z */
public class C98748z<I extends C97927q0> extends RecyclerView.C16631z {

    /* renamed from: A */
    public I f289539A;

    /* renamed from: z */
    public C98744t f289540z;

    /* renamed from: il.z$a */
    public static final class C98749a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C98748z<I> f289541d;

        public C98749a(C98748z<I> zVar) {
            this.f289541d = zVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/adapter/PanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C98744t tVar = this.f289541d.f289540z;
            if (tVar != null) {
                Context context = view.getContext();
                C87412m.m108593f(context, "it.context");
                tVar.mo127711c(view, context, this.f289541d.mo17363j(), this.f289541d.f289539A);
            }
            C117292a.m165361g(this, "com/tencent/mm/emoji/panel/adapter/PanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il.z$b */
    public static final class C98750b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C98748z<I> f289542d;

        public C98750b(C98748z<I> zVar) {
            this.f289542d = zVar;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/adapter/PanelViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C98744t tVar = this.f289542d.f289540z;
            if (tVar != null) {
                Context context = view.getContext();
                C87412m.m108593f(context, "it.context");
                tVar.mo127710b(view, context, this.f289542d.mo17363j(), this.f289542d.f289539A);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/emoji/panel/adapter/PanelViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98748z(View view, C98744t tVar) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f289540z = tVar;
        view.setOnClickListener(new C98749a(this));
        view.setOnLongClickListener(new C98750b(this));
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
    }
}
