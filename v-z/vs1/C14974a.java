package vs1;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: vs1.a */
public final class C14974a extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final Context f41036d;

    /* renamed from: e */
    public List<C14979e> f41037e = Collections.synchronizedList(new ArrayList());

    /* renamed from: f */
    public int f41038f = 50;

    /* renamed from: g */
    public int f41039g = 24;

    /* renamed from: h */
    public int f41040h = 60;

    /* renamed from: i */
    public final int f41041i = 1;

    /* renamed from: j */
    public final int f41042j = 2;

    /* renamed from: n */
    public boolean f41043n;

    /* renamed from: o */
    public int f41044o = 2;

    /* renamed from: p */
    public int f41045p = -1;

    /* renamed from: q */
    public C32226l<? super Integer, C13598b0> f41046q;

    /* renamed from: r */
    public C32226l<? super Boolean, C13598b0> f41047r;

    /* renamed from: s */
    public final Map<Integer, C14975a> f41048s = new HashMap();

    /* renamed from: t */
    public boolean f41049t;

    /* renamed from: u */
    public final C14981g f41050u = new C14981g(this);

    /* renamed from: vs1.a$a */
    public final class C14975a implements TextWatcher {

        /* renamed from: d */
        public int f41051d = -1;

        public C14975a() {
        }

        public void afterTextChanged(Editable editable) {
            int i = this.f41051d;
            if (i != -1) {
                C14979e eVar = C14974a.this.f41037e.get(i);
                String obj = C112550d0.m153799i0(String.valueOf(editable)).toString();
                eVar.getClass();
                C87412m.m108594g(obj, "<set-?>");
                eVar.f41056a = obj;
            }
            C14974a.this.mo14025F4();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: vs1.a$b */
    public final class C14976b extends RecyclerView.C16631z {

        /* renamed from: z */
        public final /* synthetic */ C14974a f41053z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14976b(C14974a aVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f41053z = aVar;
        }
    }

    /* renamed from: vs1.a$c */
    public final class C14977c extends RecyclerView.C16631z {

        /* renamed from: z */
        public final /* synthetic */ C14974a f41054z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14977c(C14974a aVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f41054z = aVar;
        }
    }

    /* renamed from: vs1.a$d */
    public final class C14978d extends RecyclerView.C16631z {

        /* renamed from: z */
        public final /* synthetic */ C14974a f41055z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14978d(C14974a aVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f41055z = aVar;
        }
    }

    /* renamed from: vs1.a$e */
    public static final class C14979e {

        /* renamed from: a */
        public String f41056a;

        /* renamed from: b */
        public C14980f f41057b;

        /* renamed from: c */
        public int f41058c;

        public C14979e(String str, C14980f fVar, int i) {
            C87412m.m108594g(str, "choice");
            C87412m.m108594g(fVar, "settingItem");
            this.f41056a = str;
            this.f41057b = fVar;
            this.f41058c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14979e)) {
                return false;
            }
            C14979e eVar = (C14979e) obj;
            return C87412m.m108589b(this.f41056a, eVar.f41056a) && C87412m.m108589b(this.f41057b, eVar.f41057b) && this.f41058c == eVar.f41058c;
        }

        public int hashCode() {
            return (((this.f41056a.hashCode() * 31) + this.f41057b.hashCode()) * 31) + this.f41058c;
        }

        public String toString() {
            return "VoteItem(choice=" + this.f41056a + ", settingItem=" + this.f41057b + ", itemType=" + this.f41058c + ')';
        }
    }

    /* renamed from: vs1.a$f */
    public static final class C14980f {

        /* renamed from: a */
        public boolean f41059a;

        /* renamed from: b */
        public int f41060b;

        /* renamed from: c */
        public String f41061c;

        public C14980f() {
            this(false, 0, (String) null, 7, (C8480h) null);
        }

        public C14980f(boolean z, int i, String str, int i2, C8480h hVar) {
            z = (i2 & 1) != 0 ? true : z;
            i = (i2 & 2) != 0 ? 3 : i;
            str = (i2 & 4) != 0 ? null : str;
            this.f41059a = z;
            this.f41060b = i;
            this.f41061c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14980f)) {
                return false;
            }
            C14980f fVar = (C14980f) obj;
            return this.f41059a == fVar.f41059a && this.f41060b == fVar.f41060b && C87412m.m108589b(this.f41061c, fVar.f41061c);
        }

        public int hashCode() {
            boolean z = this.f41059a;
            if (z) {
                z = true;
            }
            int i = (((z ? 1 : 0) * true) + this.f41060b) * 31;
            String str = this.f41061c;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "VoteSettingItem(isSingleChoice=" + this.f41059a + ", time=" + this.f41060b + ", question=" + this.f41061c + ')';
        }
    }

    /* renamed from: vs1.a$g */
    public static final class C14981g implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C14974a f41062d;

        public C14981g(C14974a aVar) {
            this.f41062d = aVar;
        }

        public void afterTextChanged(Editable editable) {
            List<C14979e> list = this.f41062d.f41037e;
            C87412m.m108593f(list, "dataList");
            C14979e eVar = (C14979e) C110818d0.m150916N(list);
            C14980f fVar = eVar != null ? eVar.f41057b : null;
            if (fVar != null) {
                fVar.f41061c = C112550d0.m153799i0(String.valueOf(editable)).toString();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C14974a(Context context) {
        C87412m.m108594g(context, "context");
        this.f41036d = context;
    }

    /* renamed from: F4 */
    public final void mo14025F4() {
        List<C14979e> list = this.f41037e;
        C87412m.m108593f(list, "dataList");
        Iterator<T> it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            if (((C14979e) it.next()).f41056a.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                i++;
            }
        }
        C32226l<? super Boolean, C13598b0> lVar = this.f41047r;
        if (lVar != null) {
            if (i >= 2) {
                z = true;
            }
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    public int getItemCount() {
        return this.f41037e.size();
    }

    public int getItemViewType(int i) {
        return this.f41037e.get(i).f41058c;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List<Object> list) {
        View view;
        EditText editText;
        C87412m.m108594g(zVar, "holder");
        C87412m.m108594g(list, "payloads");
        Object N = C110818d0.m150916N(list);
        if (!(N instanceof Integer) || !C87412m.m108589b(N, Integer.valueOf(i))) {
            onBindViewHolder(zVar, i);
            return;
        }
        C14978d dVar = zVar instanceof C14978d ? (C14978d) zVar : null;
        if (dVar != null && (view = dVar.f44854d) != null && (editText = (EditText) view.findViewById(C0966R.C0970id.f359538ni2)) != null) {
            editText.requestFocus();
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359764d02, viewGroup, false);
            C87412m.m108593f(inflate, "itemView");
            return new C14976b(this, inflate);
        } else if (i == 1) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.czw, viewGroup, false);
            C87412m.m108593f(inflate2, "itemView");
            return new C14977c(this, inflate2);
        } else if (i != 2) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.czz, viewGroup, false);
            C87412m.m108593f(inflate3, "itemView");
            return new C14978d(this, inflate3);
        } else {
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.czz, viewGroup, false);
            C87412m.m108593f(inflate4, "itemView");
            return new C14978d(this, inflate4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: vs1.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: vs1.a$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: vs1.a$d} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r13, int r14) {
        /*
            r12 = this;
            com.tencent.mm.ui.tools.p0$a r0 = com.tencent.p014mm.p136ui.tools.C45078p0.C45079a.MODE_CHINESE_AS_2
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r13, r1)
            int r1 = r13.f44859i
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.String r5 = "holder.itemView"
            r6 = 0
            if (r1 == 0) goto L_0x0119
            if (r1 == r4) goto L_0x00ed
            if (r1 == r3) goto L_0x0017
            goto L_0x01a3
        L_0x0017:
            boolean r1 = r13 instanceof vs1.C14974a.C14978d
            if (r1 == 0) goto L_0x001e
            r6 = r13
            vs1.a$d r6 = (vs1.C14974a.C14978d) r6
        L_0x001e:
            if (r6 == 0) goto L_0x01a3
            android.view.View r13 = r13.f44854d
            gy3.C87412m.m108593f(r13, r5)
            r1 = 2131316607(0x7f094f7f, float:1.82517E38)
            android.view.View r1 = r13.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r5 = 2131316608(0x7f094f80, float:1.8251702E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            vs1.a r7 = r6.f41055z
            java.util.Map<java.lang.Integer, vs1.a$a> r7 = r7.f41048s
            int r8 = r13.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r7 = r7.get(r8)
            android.text.TextWatcher r7 = (android.text.TextWatcher) r7
            r5.removeTextChangedListener(r7)
            vs1.a$a r7 = new vs1.a$a
            vs1.a r8 = r6.f41055z
            r7.<init>()
            r7.f41051d = r14
            java.util.Map<java.lang.Integer, vs1.a$a> r8 = r8.f41048s
            int r9 = r13.hashCode()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.util.HashMap r8 = (java.util.HashMap) r8
            r8.put(r9, r7)
            r5.addTextChangedListener(r7)
            vs1.a r7 = r6.f41055z
            java.util.List<vs1.a$e> r7 = r7.f41037e
            java.lang.Object r7 = r7.get(r14)
            vs1.a$e r7 = (vs1.C14974a.C14979e) r7
            java.lang.String r7 = r7.f41056a
            r5.setText(r7)
            vs1.f r7 = new vs1.f
            vs1.a r8 = r6.f41055z
            r7.<init>(r8, r14, r5, r13)
            r1.setOnClickListener(r7)
            vs1.a r1 = r6.f41055z
            r5.setFocusable(r4)
            r5.setFocusableInTouchMode(r4)
            r5.setCursorVisible(r4)
            int r7 = r1.f41039g
            android.text.InputFilter[] r8 = new android.text.InputFilter[r3]
            vs1.j r9 = new vs1.j
            r9.<init>(r1)
            r8[r2] = r9
            vs1.k r2 = new vs1.k
            r2.<init>(r7, r0)
            r8[r4] = r2
            r5.setFilters(r8)
            vs1.g r0 = new vs1.g
            r0.<init>(r1, r14, r5)
            r5.setOnEditorActionListener(r0)
            vs1.h r0 = new vs1.h
            r0.<init>(r13, r1, r5, r14)
            r5.setOnFocusChangeListener(r0)
            vs1.a r0 = r6.f41055z
            int r1 = r0.f41045p
            if (r1 != r14) goto L_0x00cb
            java.util.List<vs1.a$e> r0 = r0.f41037e
            int r0 = r0.size()
            int r0 = r0 - r3
            if (r14 != r0) goto L_0x00cb
            r5.requestFocus()
            vs1.a r13 = r6.f41055z
            r14 = -1
            r13.f41045p = r14
            goto L_0x01a3
        L_0x00cb:
            if (r14 != r4) goto L_0x01a3
            vs1.a r0 = r6.f41055z
            java.util.List<vs1.a$e> r0 = r0.f41037e
            java.lang.Object r14 = r0.get(r14)
            vs1.a$e r14 = (vs1.C14974a.C14979e) r14
            int r14 = r14.f41058c
            if (r14 != r3) goto L_0x01a3
            vs1.a r14 = r6.f41055z
            boolean r0 = r14.f41043n
            if (r0 == 0) goto L_0x01a3
            vs1.i r0 = new vs1.i
            r0.<init>(r5, r14)
            r1 = 300(0x12c, double:1.48E-321)
            r13.postDelayed(r0, r1)
            goto L_0x01a3
        L_0x00ed:
            boolean r0 = r13 instanceof vs1.C14974a.C14977c
            if (r0 == 0) goto L_0x00f4
            r6 = r13
            vs1.a$c r6 = (vs1.C14974a.C14977c) r6
        L_0x00f4:
            if (r6 == 0) goto L_0x01a3
            android.view.View r13 = r13.f44854d
            gy3.C87412m.m108593f(r13, r5)
            r0 = 2131316606(0x7f094f7e, float:1.8251698E38)
            android.view.View r0 = r13.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 2131316611(0x7f094f83, float:1.8251708E38)
            android.view.View r13 = r13.findViewById(r1)
            android.widget.TextView r13 = (android.widget.TextView) r13
            vs1.e r1 = new vs1.e
            vs1.a r2 = r6.f41054z
            r1.<init>(r14, r2, r0, r13)
            r0.setOnClickListener(r1)
            goto L_0x01a3
        L_0x0119:
            boolean r1 = r13 instanceof vs1.C14974a.C14976b
            if (r1 == 0) goto L_0x0120
            r6 = r13
            vs1.a$b r6 = (vs1.C14974a.C14976b) r6
        L_0x0120:
            if (r6 == 0) goto L_0x01a3
            android.view.View r13 = r13.f44854d
            gy3.C87412m.m108593f(r13, r5)
            r1 = 2131316619(0x7f094f8b, float:1.8251725E38)
            android.view.View r1 = r13.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r5 = 2131316620(0x7f094f8c, float:1.8251727E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2131316623(0x7f094f8f, float:1.8251733E38)
            android.view.View r7 = r13.findViewById(r7)
            android.widget.EditText r7 = (android.widget.EditText) r7
            r8 = 2131316621(0x7f094f8d, float:1.8251729E38)
            android.view.View r8 = r13.findViewById(r8)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            r9 = 2131316622(0x7f094f8e, float:1.825173E38)
            android.view.View r9 = r13.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r10 = "singleChoiceTv"
            gy3.C87412m.m108593f(r5, r10)
            er1.C7919x.m8091a(r5)
            vs1.b r10 = new vs1.b
            vs1.a r11 = r6.f41053z
            r10.<init>(r13, r11, r14, r5)
            r1.setOnClickListener(r10)
            vs1.a r1 = r6.f41053z
            int r5 = r1.f41040h
            android.text.InputFilter[] r3 = new android.text.InputFilter[r3]
            vs1.j r10 = new vs1.j
            r10.<init>(r1)
            r3[r2] = r10
            vs1.k r1 = new vs1.k
            r1.<init>(r5, r0)
            r3[r4] = r1
            if (r7 != 0) goto L_0x017e
            goto L_0x0181
        L_0x017e:
            r7.setFilters(r3)
        L_0x0181:
            vs1.c r0 = new vs1.c
            vs1.a r1 = r6.f41053z
            r0.<init>(r13, r1)
            r7.setOnFocusChangeListener(r0)
            vs1.a r0 = r6.f41053z
            vs1.a$g r0 = r0.f41050u
            r7.removeTextChangedListener(r0)
            vs1.a r0 = r6.f41053z
            vs1.a$g r0 = r0.f41050u
            r7.addTextChangedListener(r0)
            vs1.d r0 = new vs1.d
            vs1.a r1 = r6.f41053z
            r0.<init>(r1, r13, r9, r14)
            r8.setOnClickListener(r0)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vs1.C14974a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }
}
