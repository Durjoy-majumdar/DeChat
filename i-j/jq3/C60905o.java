package jq3;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import java.util.LinkedHashSet;
import k20.C60958c;
import k20.C9556a;
import p192l4.C10461a;

/* renamed from: jq3.o */
public class C60905o extends C9507n {

    /* renamed from: A */
    public final Context f173499A;

    /* renamed from: B */
    public RecyclerView.C16613e f173500B;

    /* renamed from: C */
    public C10461a f173501C;

    /* renamed from: D */
    public Object f173502D;

    /* renamed from: E */
    public Object f173503E;

    /* renamed from: F */
    public RecyclerView f173504F = null;

    public C60905o(View view, C10461a aVar) {
        super(view);
        new LinkedHashSet();
        new LinkedHashSet();
        this.f173499A = view.getContext();
        this.f173501C = aVar;
    }

    /* renamed from: B */
    public Context mo85810B() {
        return this.f173499A;
    }

    /* renamed from: C */
    public RecyclerView mo85811C() {
        if (this.f173504F != null || !(this.f44854d.getParent() instanceof RecyclerView)) {
            return this.f173504F;
        }
        RecyclerView recyclerView = (RecyclerView) this.f44854d.getParent();
        this.f173504F = recyclerView;
        return recyclerView;
    }

    /* renamed from: D */
    public <T extends View> T mo85812D(int i) {
        return this.f44854d.findViewById(i);
    }

    /* renamed from: E */
    public void mo85813E(Object obj) {
        this.f173503E = obj;
    }

    /* renamed from: F */
    public C60905o mo85814F(int i, int i2) {
        ((TextView) mo85812D(i)).setText(i2);
        return this;
    }

    /* renamed from: G */
    public C60905o mo85815G(int i, CharSequence charSequence) {
        ((TextView) mo85812D(i)).setText(charSequence);
        return this;
    }

    /* renamed from: H */
    public C60905o mo85816H(int i, int i2) {
        ((TextView) mo85812D(i)).setTextColor(i2);
        return this;
    }

    /* renamed from: I */
    public C60905o mo85817I(int i, int i2) {
        View D = mo85812D(i);
        if (D != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/recyclerview/SimpleViewHolder", "setVisible", "(II)Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/view/recyclerview/SimpleViewHolder", "setVisible", "(II)Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return this;
    }

    /* renamed from: z */
    public <T> T mo85818z() {
        return this.f173503E;
    }

    public C60905o(View view) {
        super(view);
        new LinkedHashSet();
        new LinkedHashSet();
        this.f173499A = view.getContext();
    }
}
