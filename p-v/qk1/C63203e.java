package qk1;

import al1.C54130j;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.List;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C64284cg;
import tf0.C64916p1;
import up1.C27696y;

/* renamed from: qk1.e */
public final class C63203e extends RecyclerView.C16613e<C63204a> {

    /* renamed from: d */
    public final ArrayList<C54130j> f179327d = new ArrayList<>();

    /* renamed from: e */
    public final int f179328e = 300;

    /* renamed from: f */
    public C32226l<? super C54130j, C13598b0> f179329f;

    /* renamed from: g */
    public C45795b f179330g;

    /* renamed from: qk1.e$a */
    public static final class C63204a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f179331A;

        /* renamed from: B */
        public final ImageView f179332B;

        /* renamed from: C */
        public final TextView f179333C;

        /* renamed from: D */
        public final TextView f179334D;

        /* renamed from: z */
        public final ImageView f179335z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63204a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179335z = (ImageView) view.findViewById(C0966R.C0970id.dpd);
            this.f179331A = (TextView) view.findViewById(C0966R.C0970id.dpi);
            this.f179332B = (ImageView) view.findViewById(C0966R.C0970id.dpj);
            this.f179333C = (TextView) view.findViewById(C0966R.C0970id.dpc);
            this.f179334D = (TextView) view.findViewById(C0966R.C0970id.dpm);
        }
    }

    /* renamed from: c */
    public final void mo88115c(List<C54130j> list) {
        C87412m.m108594g(list, "data");
        this.f179327d.clear();
        ArrayList<C54130j> arrayList = this.f179327d;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C54130j jVar = (C54130j) next;
                if (i < this.f179328e) {
                    arrayList2.add(next);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        arrayList.addAll(arrayList2);
    }

    public int getItemCount() {
        return this.f179327d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C54130j jVar;
        int i2 = i;
        C63204a aVar = (C63204a) zVar;
        Class cls = C64916p1.class;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        C87412m.m108594g(aVar, "holder");
        C54130j jVar2 = this.f179327d.get(i2);
        C87412m.m108593f(jVar2, "dataList[position]");
        C54130j jVar3 = jVar2;
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
        String str = null;
        C62345f fVar = new C62345f(jVar3.f151998b, (C27696y) null, 2, (C8480h) null);
        ImageView imageView = aVar.f179335z;
        C87412m.m108593f(imageView, "holder.avatar");
        i25.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
        TextView textView = aVar.f179331A;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C64916p1 p1Var = (C64916p1) c;
        TextView textView2 = aVar.f179331A;
        C87412m.m108593f(textView2, "holder.nicknameTv");
        C58739j4 j4Var = C58739j4.f168176a;
        String str2 = jVar3.f151999c;
        String str3 = str2 == null ? "" : str2;
        String str4 = jVar3.f152000d;
        textView.setText(C64916p1.C64917a.m76442i(p1Var, textView2, C58739j4.m68253s(j4Var, str3, str4 == null ? "" : str4, false, 4, (Object) null), 0, 4, (Object) null));
        C45795b bVar = this.f179330g;
        if (!(bVar == null || (jVar = ((C54963d0) bVar.mo71262a(C54963d0.class)).f154073p) == null)) {
            str = jVar.f151999c;
        }
        if (Util.isEqual(str, jVar3.f151999c)) {
            TextView textView3 = aVar.f179333C;
            textView3.setText(textView3.getContext().getResources().getString(C0966R.string.f360597dr2));
            TextView textView4 = aVar.f179333C;
            textView4.setBackground(textView4.getContext().getDrawable(C0966R.C0969drawable.a2r));
            TextView textView5 = aVar.f179333C;
            textView5.setTextColor(textView5.getContext().getResources().getColor(C0966R.color.Red_100));
        } else {
            TextView textView6 = aVar.f179333C;
            textView6.setText(textView6.getContext().getResources().getString(C0966R.string.f360596dr1));
            TextView textView7 = aVar.f179333C;
            textView7.setBackground(textView7.getContext().getDrawable(C0966R.C0969drawable.a2r));
            TextView textView8 = aVar.f179333C;
            textView8.setTextColor(textView8.getContext().getResources().getColorStateList(C0966R.color.anm));
        }
        aVar.f179334D.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(aVar.f179334D.getContext(), jVar3.f152007k, aVar.f179334D.getTextSize()));
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
        ImageView imageView2 = aVar.f179332B;
        C87412m.m108593f(imageView2, "holder.typeIcon");
        C64916p1.C64917a.m76444k((C64916p1) c2, imageView2, jVar3.f152006j, 0, (C64284cg) null, 12, (Object) null);
        aVar.f179333C.setOnClickListener(new C63210f(this, i2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.ahi, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(parent.context, …_anchor_apply_item, null)");
        return new C63204a(inflate);
    }
}
