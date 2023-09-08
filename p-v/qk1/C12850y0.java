package qk1;

import android.content.Context;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ok1.C62042e;
import p629ny.C76979h;
import rx3.C13598b0;
import te3.C48770aw0;
import te3.C49765hx0;
import te3.C50465my0;
import wk1.C15440n;
import wk1.C15481v;
import wk1.C15483x;
import wk1.C15484y;

/* renamed from: qk1.y0 */
public final class C12850y0 extends RecyclerView.C16613e<C12851a> {

    /* renamed from: d */
    public ArrayList<C12854d> f36767d = new ArrayList<>();

    /* renamed from: e */
    public int f36768e;

    /* renamed from: f */
    public C32226l<? super C49765hx0, C13598b0> f36769f;

    /* renamed from: g */
    public int f36770g = MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.f3731ck);

    /* renamed from: qk1.y0$a */
    public class C12851a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12851a(C12850y0 y0Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: qk1.y0$b */
    public final class C12852b extends C12851a {

        /* renamed from: A */
        public final TextView f36771A;

        /* renamed from: B */
        public final ImageView f36772B;

        /* renamed from: C */
        public final TextView f36773C;

        /* renamed from: D */
        public final TextView f36774D;

        /* renamed from: z */
        public final TextView f36775z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12852b(C12850y0 y0Var, View view) {
            super(y0Var, view);
            C87412m.m108594g(view, "itemView");
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.ice);
            this.f36775z = textView;
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.hft);
            this.f36771A = textView2;
            this.f36772B = (ImageView) view.findViewById(C0966R.C0970id.d3c);
            this.f36773C = (TextView) view.findViewById(C0966R.C0970id.ctq);
            TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.f357720bf0);
            this.f36774D = textView3;
            textView.setTextSize(1, 15.0f);
            textView2.setTextSize(1, 17.0f);
            textView3.setTextSize(1, 17.0f);
        }
    }

    /* renamed from: qk1.y0$c */
    public final class C12853c extends C12851a {

        /* renamed from: z */
        public TextView f36776z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12853c(C12850y0 y0Var, View view) {
            super(y0Var, view);
            C87412m.m108594g(view, "itemView");
            this.f36776z = (TextView) view.findViewById(C0966R.C0970id.ctm);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.f357721bf1);
        }
    }

    /* renamed from: qk1.y0$d */
    public static final class C12854d {

        /* renamed from: a */
        public final C50465my0 f36777a;

        /* renamed from: b */
        public final int f36778b;

        public C12854d(C50465my0 my02, int i) {
            this.f36777a = my02;
            this.f36778b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12854d)) {
                return false;
            }
            C12854d dVar = (C12854d) obj;
            return C87412m.m108589b(this.f36777a, dVar.f36777a) && this.f36778b == dVar.f36778b;
        }

        public int hashCode() {
            C50465my0 my02 = this.f36777a;
            return ((my02 == null ? 0 : my02.hashCode()) * 31) + this.f36778b;
        }

        public String toString() {
            return "FinderLiveContactInfo(contact=" + this.f36777a + ", type=" + this.f36778b + ')';
        }
    }

    public int getItemCount() {
        return this.f36767d.size();
    }

    public int getItemViewType(int i) {
        return this.f36767d.get(i).f36778b;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        FinderContact finderContact;
        FinderContact finderContact2;
        C12851a aVar = (C12851a) zVar;
        C87412m.m108594g(aVar, "holder");
        boolean z = true;
        if (aVar instanceof C12852b) {
            C12852b bVar = (C12852b) aVar;
            C50465my0 my02 = this.f36767d.get(i).f36777a;
            String str = null;
            C49765hx0 hx02 = my02 != null ? my02.f138283d : null;
            bVar.f36775z.setText(String.valueOf(i));
            int measuredWidth = (bVar.f44854d.getMeasuredWidth() - bVar.f36775z.getMeasuredWidth()) - MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.f3758d_);
            bVar.f36772B.setVisibility(hx02 != null && hx02.f134926n == 3 ? 0 : 8);
            if (bVar.f36772B.getVisibility() == 0) {
                measuredWidth -= bVar.f36772B.getMeasuredWidth();
            }
            List<ImageSpan> q = C15440n.m14441q(C15440n.f41895a, hx02 != null ? hx02.f134930r : null, new int[]{2, 4}, C15483x.MODE_AUTO, (C15484y) null, 0, bVar.f36773C, (Map) null, 88, (Object) null);
            if (q.isEmpty()) {
                C54991o.C0675c cVar = C54991o.f154177g4;
                LinkedList<C48770aw0> linkedList = hx02 != null ? hx02.f134930r : null;
                StringBuilder sb = new StringBuilder();
                sb.append((hx02 == null || (finderContact2 = hx02.f134919d) == null) ? null : finderContact2.nickname);
                sb.append(",bindFansItem");
                cVar.mo643b(linkedList, sb.toString());
            } else {
                for (ImageSpan imageSpan : q) {
                    C15481v vVar = imageSpan instanceof C15481v ? (C15481v) imageSpan : null;
                    measuredWidth -= vVar != null ? vVar.mo14226a() : 0;
                }
            }
            C75375u uVar = new C75375u(C15440n.f41895a.mo14265n(q) + ' ');
            int i2 = 0;
            for (ImageSpan b : q) {
                int i3 = i2 + 1;
                uVar.mo105705b(b, i2, i3, 33);
                i2 = i3;
            }
            bVar.f36773C.setText(uVar);
            bVar.f36774D.setText(String.valueOf(hx02 != null ? Long.valueOf(hx02.f134932t) : null));
            Integer valueOf = Integer.valueOf(bVar.f36774D.getMeasuredWidth());
            if (valueOf.intValue() <= 0) {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            int intValue = measuredWidth - (valueOf != null ? valueOf.intValue() : MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.f3758d_));
            if (intValue > 0) {
                bVar.f36771A.setMaxWidth(intValue);
            } else {
                bVar.f36771A.setMaxWidth(this.f36770g);
            }
            TextView textView = bVar.f36771A;
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = MMApplicationContext.getContext();
            if (!(hx02 == null || (finderContact = hx02.f134919d) == null)) {
                str = finderContact.nickname;
            }
            textView.setText(hVar.yp0(context, str, bVar.f36771A.getTextSize()));
            bVar.f44854d.setOnClickListener(new C12871z0(this, hx02));
            C62042e.f176370a.mo86998D1("FinderLiveFansListAdapter", "bindFansItem nicknameMaxWidth:" + intValue);
        } else if (aVar instanceof C12853c) {
            C12853c cVar2 = (C12853c) aVar;
            int i4 = this.f36768e;
            if (i4 <= 0) {
                i4 = 0;
            }
            cVar2.f36776z.setText(cVar2.f44854d.getContext().getString(C0966R.string.dm4, new Object[]{Integer.valueOf(i4)}));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ag8, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…itle_item, parent, false)");
            return new C12853c(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ag7, viewGroup, false);
        C87412m.m108593f(inflate2, "from(parent.context).inf…mber_item, parent, false)");
        return new C12852b(this, inflate2);
    }
}
