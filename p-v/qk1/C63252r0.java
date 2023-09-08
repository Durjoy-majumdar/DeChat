package qk1;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.EllipsizeTextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.List;
import l60.C99344b;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C64693s21;
import up1.C27696y;

/* renamed from: qk1.r0 */
public final class C63252r0 extends RecyclerView.C16613e<C63253a> {

    /* renamed from: d */
    public ArrayList<C63254b> f179489d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C63254b> f179490e = new ArrayList<>();

    /* renamed from: f */
    public C32224a<C13598b0> f179491f;

    /* renamed from: g */
    public C32226l<? super String, C13598b0> f179492g;

    /* renamed from: h */
    public C32226l<? super Boolean, C13598b0> f179493h;

    /* renamed from: qk1.r0$a */
    public final class C63253a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final EllipsizeTextView f179494A;

        /* renamed from: B */
        public final CheckBox f179495B;

        /* renamed from: C */
        public final WeImageView f179496C;

        /* renamed from: z */
        public final ImageView f179497z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63253a(C63252r0 r0Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179497z = (ImageView) view.findViewById(C0966R.C0970id.f358718n23);
            this.f179494A = (EllipsizeTextView) view.findViewById(C0966R.C0970id.n26);
            this.f179495B = (CheckBox) view.findViewById(C0966R.C0970id.f358719n24);
            this.f179496C = (WeImageView) view.findViewById(C0966R.C0970id.n25);
        }
    }

    /* renamed from: qk1.r0$b */
    public static final class C63254b {

        /* renamed from: a */
        public C64693s21 f179498a;

        /* renamed from: b */
        public boolean f179499b;

        public C63254b(C64693s21 s212, boolean z) {
            C87412m.m108594g(s212, "item");
            this.f179498a = s212;
            this.f179499b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63254b)) {
                return false;
            }
            C63254b bVar = (C63254b) obj;
            return C87412m.m108589b(this.f179498a, bVar.f179498a) && this.f179499b == bVar.f179499b;
        }

        public int hashCode() {
            int hashCode = this.f179498a.hashCode() * 31;
            boolean z = this.f179499b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "selectItem(item=" + this.f179498a + ", isCheck=" + this.f179499b + ')';
        }
    }

    /* renamed from: F4 */
    public final List<String> mo88155F4() {
        ArrayList arrayList = new ArrayList();
        ArrayList<C63254b> arrayList2 = this.f179490e;
        ArrayList<C63254b> arrayList3 = new ArrayList<>();
        for (T next : arrayList2) {
            boolean z = true;
            if (!((C63254b) next).f179499b) {
                z = false;
            }
            if (z) {
                arrayList3.add(next);
            }
        }
        for (C63254b bVar : arrayList3) {
            String str = bVar.f179498a.f185309d;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x002c A[SYNTHETIC] */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88156G4(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "matchStr"
            gy3.C87412m.m108594g(r10, r0)
            java.util.ArrayList<qk1.r0$b> r0 = r9.f179490e
            r0.clear()
            int r0 = r10.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001f
            java.util.ArrayList<qk1.r0$b> r10 = r9.f179490e
            java.util.ArrayList<qk1.r0$b> r0 = r9.f179489d
            r10.addAll(r0)
            goto L_0x0064
        L_0x001f:
            java.util.ArrayList<qk1.r0$b> r0 = r9.f179490e
            java.util.ArrayList<qk1.r0$b> r3 = r9.f179489d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x002c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r3.next()
            r6 = r5
            qk1.r0$b r6 = (qk1.C63252r0.C63254b) r6
            te3.s21 r6 = r6.f179498a
            java.lang.String r6 = r6.f185310e
            if (r6 == 0) goto L_0x005a
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.String r8 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            gy3.C87412m.m108593f(r6, r8)
            java.lang.String r7 = r10.toLowerCase(r7)
            gy3.C87412m.m108593f(r7, r8)
            boolean r6 = z04.C112550d0.m153801u(r6, r7, r2)
            if (r6 != r1) goto L_0x005a
            r6 = 1
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x002c
            r4.add(r5)
            goto L_0x002c
        L_0x0061:
            r0.addAll(r4)
        L_0x0064:
            fy3.l<? super java.lang.Boolean, rx3.b0> r10 = r9.f179493h
            if (r10 == 0) goto L_0x0079
            java.util.ArrayList<qk1.r0$b> r0 = r9.f179490e
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r10.invoke(r0)
        L_0x0079:
            r9.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk1.C63252r0.mo88156G4(java.lang.String):void");
    }

    public int getItemCount() {
        return this.f179490e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63253a aVar = (C63253a) zVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(aVar, "holder");
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = this.f179490e.get(i).f179498a;
        aVar.f179494A.setVisibility(0);
        aVar.f179494A.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), ((C64693s21) f0Var.f27484d).f185310e));
        C39818r rVar = C39818r.f106831a;
        C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85956b(new C62345f(((C64693s21) f0Var.f27484d).f185313h, (C27696y) null, 2, (C8480h) null), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        C63259t0 t0Var = new C63259t0(aVar);
        b.getClass();
        b.f291320d = t0Var;
        b.mo85951a();
        aVar.f179495B.setChecked(this.f179490e.get(i).f179499b);
        aVar.f179496C.setOnClickListener(new C63261u0(this, f0Var));
        aVar.f44854d.setOnClickListener(new C63265v0(this, i, aVar));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cv9, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C63253a(this, inflate);
    }
}
