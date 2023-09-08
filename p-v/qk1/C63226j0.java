package qk1;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import l60.C99344b;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C64693s21;
import up1.C27696y;

/* renamed from: qk1.j0 */
public final class C63226j0 extends RecyclerView.C16613e<C63227a> {

    /* renamed from: d */
    public C32226l<? super String, C13598b0> f179422d;

    /* renamed from: e */
    public C32224a<C13598b0> f179423e;

    /* renamed from: f */
    public C32224a<C13598b0> f179424f;

    /* renamed from: g */
    public ArrayList<C64693s21> f179425g = new ArrayList<>();

    /* renamed from: qk1.j0$a */
    public final class C63227a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f179426A;

        /* renamed from: z */
        public final ImageView f179427z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63227a(C63226j0 j0Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179427z = (ImageView) view.findViewById(C0966R.C0970id.f358718n23);
            this.f179426A = (TextView) view.findViewById(C0966R.C0970id.n26);
        }
    }

    /* renamed from: F4 */
    public final List<String> mo88134F4() {
        ArrayList<C64693s21> arrayList = this.f179425g;
        ArrayList<C64693s21> arrayList2 = new ArrayList<>();
        for (T next : arrayList) {
            if (((C64693s21) next).f185311f != 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        for (C64693s21 s212 : arrayList2) {
            String str = s212.f185309d;
            if (str == null) {
                str = "";
            }
            arrayList3.add(str);
        }
        return arrayList3;
    }

    /* renamed from: G4 */
    public final void mo88135G4(LinkedList<C64693s21> linkedList) {
        boolean z;
        T t;
        boolean z2;
        if (linkedList != null) {
            this.f179425g.clear();
            this.f179425g.addAll(linkedList);
        }
        T t2 = null;
        if (this.f179425g.size() < 5) {
            Iterator<T> it = this.f179425g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C64693s21) t).f185312g == 1) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (t == null) {
                ArrayList<C64693s21> arrayList = this.f179425g;
                C64693s21 s212 = new C64693s21();
                s212.f185312g = 1;
                arrayList.add(s212);
            }
        }
        if (this.f179425g.size() > 1) {
            Iterator<T> it4 = this.f179425g.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                T next = it4.next();
                if (((C64693s21) next).f185312g == 2) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t2 = next;
                    break;
                }
            }
            if (t2 == null) {
                ArrayList<C64693s21> arrayList2 = this.f179425g;
                C64693s21 s213 = new C64693s21();
                s213.f185312g = 2;
                arrayList2.add(s213);
            }
        }
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f179425g.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63227a aVar = (C63227a) zVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(aVar, "holder");
        C8479f0 f0Var = new C8479f0();
        T t = this.f179425g.get(i);
        C87412m.m108593f(t, "dataList[position]");
        f0Var.f27484d = t;
        int i2 = ((C64693s21) t).f185312g;
        boolean z = true;
        if (i2 == 0) {
            aVar.f179426A.setVisibility(0);
            aVar.f179426A.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(MMApplicationContext.getContext(), ((C64693s21) f0Var.f27484d).f185310e, aVar.f179426A.getTextSize()));
            String str = ((C64693s21) f0Var.f27484d).f185313h;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (z) {
                aVar.f179427z.setImageResource(C0966R.C0969drawable.bfa);
            } else {
                C39818r rVar = C39818r.f106831a;
                C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85956b(new C62345f(((C64693s21) f0Var.f27484d).f185313h, (C27696y) null, 2, (C8480h) null), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
                C63234l0 l0Var = new C63234l0(f0Var, aVar);
                b.getClass();
                b.f291320d = l0Var;
                b.mo85951a();
            }
            aVar.f44854d.setOnClickListener(new C63237m0(this, f0Var));
        } else if (i2 == 1) {
            aVar.f179426A.setVisibility(4);
            aVar.f179427z.setImageResource(C0966R.C0969drawable.f4552fu);
            aVar.f44854d.setOnClickListener(new C63243n0(this));
        } else if (i2 == 2) {
            aVar.f179426A.setVisibility(4);
            aVar.f179427z.setImageResource(C0966R.C0969drawable.f4553fv);
            aVar.f44854d.setOnClickListener(new C63246o0(this));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359714cv1, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C63227a(this, inflate);
    }
}
