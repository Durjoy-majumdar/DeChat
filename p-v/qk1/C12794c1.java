package qk1;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: qk1.c1 */
public final class C12794c1 extends RecyclerView.C16613e<C12795a> {

    /* renamed from: d */
    public final Context f36619d;

    /* renamed from: e */
    public ArrayList<String> f36620e = new ArrayList<>();

    /* renamed from: f */
    public int f36621f = 2;

    /* renamed from: g */
    public int f36622g = 20;

    /* renamed from: h */
    public boolean f36623h = true;

    /* renamed from: i */
    public C32226l<? super Boolean, C13598b0> f36624i;

    /* renamed from: j */
    public boolean f36625j;

    /* renamed from: qk1.c1$a */
    public class C12795a extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f36626A;

        /* renamed from: B */
        public C12796b f36627B;

        /* renamed from: z */
        public EditText f36628z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12795a(C12794c1 c1Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f357980cu1);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.fast_comment_et)");
            this.f36628z = (EditText) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.cu6);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.….fast_comment_text_clear)");
            this.f36626A = (ImageView) findViewById2;
            C12796b bVar = new C12796b(c1Var, new WeakReference(this.f36626A), 0, 2, (C8480h) null);
            this.f36627B = bVar;
            this.f36628z.addTextChangedListener(bVar);
        }
    }

    /* renamed from: qk1.c1$b */
    public final class C12796b implements TextWatcher {

        /* renamed from: d */
        public WeakReference<ImageView> f36629d;

        /* renamed from: e */
        public int f36630e;

        /* renamed from: f */
        public final /* synthetic */ C12794c1 f36631f;

        public C12796b(C12794c1 c1Var, WeakReference weakReference, int i, int i2, C8480h hVar) {
            i = (i2 & 2) != 0 ? 0 : i;
            this.f36631f = c1Var;
            this.f36629d = weakReference;
            this.f36630e = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
            if ((r4.length() == 0) == true) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r4) {
            /*
                r3 = this;
                qk1.c1 r0 = r3.f36631f
                java.util.ArrayList<java.lang.String> r0 = r0.f36620e
                int r1 = r3.f36630e
                if (r4 == 0) goto L_0x0018
                java.lang.String r2 = r4.toString()
                if (r2 == 0) goto L_0x0018
                java.lang.CharSequence r2 = z04.C112550d0.m153799i0(r2)
                java.lang.String r2 = r2.toString()
                if (r2 != 0) goto L_0x001a
            L_0x0018:
                java.lang.String r2 = ""
            L_0x001a:
                r0.set(r1, r2)
                r0 = 1
                r1 = 0
                if (r4 == 0) goto L_0x0033
                java.lang.String r4 = r4.toString()
                if (r4 == 0) goto L_0x0033
                int r4 = r4.length()
                if (r4 != 0) goto L_0x002f
                r4 = 1
                goto L_0x0030
            L_0x002f:
                r4 = 0
            L_0x0030:
                if (r4 != r0) goto L_0x0033
                goto L_0x0034
            L_0x0033:
                r0 = 0
            L_0x0034:
                r4 = 0
                if (r0 == 0) goto L_0x004a
                java.lang.ref.WeakReference<android.widget.ImageView> r0 = r3.f36629d
                if (r0 == 0) goto L_0x0041
                java.lang.Object r4 = r0.get()
                android.widget.ImageView r4 = (android.widget.ImageView) r4
            L_0x0041:
                if (r4 != 0) goto L_0x0044
                goto L_0x005a
            L_0x0044:
                r0 = 8
                r4.setVisibility(r0)
                goto L_0x005a
            L_0x004a:
                java.lang.ref.WeakReference<android.widget.ImageView> r0 = r3.f36629d
                if (r0 == 0) goto L_0x0054
                java.lang.Object r4 = r0.get()
                android.widget.ImageView r4 = (android.widget.ImageView) r4
            L_0x0054:
                if (r4 != 0) goto L_0x0057
                goto L_0x005a
            L_0x0057:
                r4.setVisibility(r1)
            L_0x005a:
                qk1.c1 r4 = r3.f36631f
                r4.mo12325F4()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qk1.C12794c1.C12796b.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C12794c1(Context context) {
        C87412m.m108594g(context, "context");
        this.f36619d = context;
        for (int i = 0; i < 2; i++) {
            this.f36620e.add("");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: F4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12325F4() {
        /*
            r2 = this;
            java.util.ArrayList<java.lang.String> r0 = r2.f36620e
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 == 0) goto L_0x0021
            boolean r1 = r2.f36623h
            if (r1 != 0) goto L_0x0006
        L_0x0021:
            fy3.l<? super java.lang.Boolean, rx3.b0> r0 = r2.f36624i
            if (r0 == 0) goto L_0x002a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.invoke(r1)
        L_0x002a:
            return
        L_0x002b:
            fy3.l<? super java.lang.Boolean, rx3.b0> r0 = r2.f36624i
            if (r0 == 0) goto L_0x0034
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r1)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk1.C12794c1.mo12325F4():void");
    }

    public int getItemCount() {
        return this.f36620e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C12795a aVar = (C12795a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.f36628z.setText(this.f36620e.get(i));
        String str = this.f36620e.get(i);
        C87412m.m108593f(str, "dataList[position]");
        boolean z = false;
        if (!(str.length() == 0)) {
            this.f36623h = false;
            aVar.f36626A.setVisibility(0);
        } else {
            aVar.f36626A.setVisibility(8);
        }
        aVar.f36626A.setOnClickListener(new C12798d1(aVar));
        EditText editText = aVar.f36628z;
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setCursorVisible(true);
        editText.setFilters(new InputFilter[]{new C12801g1(this), new C12804h1(this.f36622g, C45078p0.C45079a.MODE_CHINESE_AS_2)});
        aVar.f36627B.f36630e = i;
        editText.setOnEditorActionListener(new C12799e1(aVar, editText));
        if (i == 0) {
            if (aVar.f36628z.getText().toString().length() == 0) {
                z = true;
            }
            if (z) {
                this.f36623h = true;
                aVar.f36628z.postDelayed(new C12800f1(aVar, editText), 300);
            }
        }
        if (i == this.f36620e.size() - 1) {
            mo12325F4();
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.agc, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…ment_item, parent, false)");
        return new C12795a(this, inflate);
    }
}
