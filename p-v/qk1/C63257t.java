package qk1;

import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54785k6;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import nj3.C76912y0;
import ok1.C62042e;
import rx3.C13598b0;
import sx3.C64197v;
import z04.C112550d0;

/* renamed from: qk1.t */
public final class C63257t extends RecyclerView.C16613e<C63258a> {

    /* renamed from: d */
    public final Context f179504d;

    /* renamed from: e */
    public final String f179505e = "FinderLiveAnchorSingSongAddAdapter";

    /* renamed from: f */
    public final String f179506f = "save_str";

    /* renamed from: g */
    public ArrayList<C54785k6> f179507g = new ArrayList<>();

    /* renamed from: h */
    public int f179508h = 100;

    /* renamed from: i */
    public int f179509i = 30;

    /* renamed from: j */
    public C32226l<? super Integer, C13598b0> f179510j;

    /* renamed from: n */
    public C32228q<? super Integer, ? super Boolean, ? super Integer, C13598b0> f179511n;

    /* renamed from: o */
    public C32226l<? super Integer, C13598b0> f179512o;

    /* renamed from: p */
    public C32226l<? super Integer, C13598b0> f179513p;

    /* renamed from: q */
    public int f179514q = -1;

    /* renamed from: r */
    public boolean f179515r = true;

    /* renamed from: s */
    public boolean f179516s;

    /* renamed from: t */
    public boolean f179517t;

    /* renamed from: u */
    public boolean f179518u;

    /* renamed from: v */
    public C32224a<C13598b0> f179519v;

    /* renamed from: qk1.t$a */
    public final class C63258a extends RecyclerView.C16631z {

        /* renamed from: A */
        public FrameLayout f179520A;

        /* renamed from: B */
        public WeImageView f179521B;

        /* renamed from: C */
        public WeImageView f179522C;

        /* renamed from: D */
        public EditText f179523D;

        /* renamed from: E */
        public FrameLayout f179524E;

        /* renamed from: z */
        public LinearLayout f179525z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63258a(C63257t tVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179525z = (LinearLayout) view.findViewById(C0966R.C0970id.mty);
            this.f179520A = (FrameLayout) view.findViewById(C0966R.C0970id.mtx);
            this.f179521B = (WeImageView) view.findViewById(C0966R.C0970id.f358808mu2);
            this.f179522C = (WeImageView) view.findViewById(C0966R.C0970id.f358807mu1);
            this.f179523D = (EditText) view.findViewById(C0966R.C0970id.h6u);
            this.f179524E = (FrameLayout) view.findViewById(C0966R.C0970id.mv5);
        }
    }

    public C63257t(Context context, C45795b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        this.f179504d = context;
    }

    /* renamed from: F4 */
    public final boolean mo88161F4(Context context) {
        C87412m.m108594g(context, "context");
        int i = this.f179514q;
        if (i == -1 || i > this.f179507g.size() - 1) {
            this.f179514q = -1;
            return true;
        }
        int i2 = 0;
        for (T next : this.f179507g) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C54785k6 k6Var = (C54785k6) next;
                int i4 = this.f179514q;
                if (i4 != i2 && C87412m.m108589b(k6Var.f153566a, this.f179507g.get(i4).f153566a)) {
                    if (k6Var.f153566a.length() > 0) {
                        C76912y0.m92767f(context, context.getResources().getString(C0966R.string.mc4));
                        int i5 = this.f179514q;
                        notifyItemChanged(i5, Integer.valueOf(i5));
                        return false;
                    }
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return true;
    }

    /* renamed from: G4 */
    public void onBindViewHolder(C63258a aVar, int i) {
        C87412m.m108594g(aVar, "holder");
        boolean z = true;
        if (this.f179507g.get(i).f153568c == 1 && i == this.f179507g.size() - 1) {
            aVar.f179525z.setVisibility(0);
            aVar.f179520A.setVisibility(8);
        } else {
            aVar.f179525z.setVisibility(8);
            aVar.f179520A.setVisibility(0);
            aVar.f179523D.setText(this.f179507g.get(i).f153566a);
            aVar.f179521B.setOnClickListener(new C63260u(aVar, this, i));
            aVar.f179522C.setOnClickListener(new C63264v(aVar, this, i));
            EditText editText = aVar.f179523D;
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.setCursorVisible(true);
            editText.setFilters(new InputFilter[]{new C63195a0(this), new C12790b0(this.f179509i, C45078p0.C45079a.MODE_CHINESE_AS_2)});
            editText.setOnEditorActionListener(new C63269w(this, i, editText, aVar));
            editText.setOnFocusChangeListener(new C63273x(i, this, aVar, editText));
            if (i >= this.f179508h) {
                aVar.f179524E.setVisibility(0);
            } else {
                aVar.f179524E.setVisibility(8);
            }
            if (!((i == this.f179507g.size() - 1 && this.f179507g.get(i).f153568c == 3) || (i == this.f179507g.size() - 2 && this.f179507g.get(i + 1).f153568c == 1))) {
                z = false;
            }
            if (z && this.f179515r) {
                this.f179515r = false;
                aVar.f179523D.requestFocus();
            }
        }
        aVar.f179525z.setOnClickListener(new C63278y(this, aVar, i));
    }

    public int getItemCount() {
        int size = this.f179507g.size();
        C62042e eVar = C62042e.f176370a;
        String str = this.f179505e;
        eVar.mo86998D1(str, "getItemCount " + size);
        return size;
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.csf, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C63258a(this, inflate);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C63258a aVar = (C63258a) zVar;
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(aVar, i);
            return;
        }
        for (Object next : list) {
            boolean z = next instanceof Integer;
            if (z && z && i == ((Number) next).intValue()) {
                this.f179517t = true;
                this.f179516s = true;
                aVar.f179523D.postDelayed(new C63279z(aVar), 300);
            }
            if ((next instanceof Boolean) && C87412m.m108589b(next, Boolean.TRUE)) {
                if (aVar.f179523D.hasFocus()) {
                    C54785k6 k6Var = this.f179507g.get(i);
                    String obj = C112550d0.m153799i0(aVar.f179523D.getEditableText().toString()).toString();
                    k6Var.getClass();
                    C87412m.m108594g(obj, "<set-?>");
                    k6Var.f153566a = obj;
                    aVar.f179523D.clearFocus();
                }
                C32224a<C13598b0> aVar2 = this.f179519v;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                this.f179519v = null;
            }
            if ((next instanceof String) && C87412m.m108589b(next, this.f179506f)) {
                if (this.f179514q == i) {
                    C54785k6 k6Var2 = this.f179507g.get(i);
                    String obj2 = C112550d0.m153799i0(aVar.f179523D.getEditableText().toString()).toString();
                    k6Var2.getClass();
                    C87412m.m108594g(obj2, "<set-?>");
                    k6Var2.f153566a = obj2;
                }
                onBindViewHolder(aVar, i);
            }
        }
    }
}
