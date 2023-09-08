package tl1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import k60.C60979d;
import o40.C61926c;
import ok1.C62042e;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import te3.C51773w21;
import up1.C27696y;

/* renamed from: tl1.n */
public final class C13995n extends RecyclerView.C16613e<C13996a> {

    /* renamed from: d */
    public LinkedList<C51773w21> f39310d = new LinkedList<>();

    /* renamed from: tl1.n$a */
    public final class C13996a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f39311A;

        /* renamed from: z */
        public ImageView f39312z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13996a(C13995n nVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f39312z = (ImageView) view.findViewById(C0966R.C0970id.a1p);
            this.f39311A = (TextView) view.findViewById(C0966R.C0970id.hft);
        }
    }

    public C13995n(C45795b bVar) {
        C87412m.m108594g(bVar, "liveData");
    }

    /* renamed from: F4 */
    public void onBindViewHolder(C13996a aVar, int i) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C76979h.class;
        C87412m.m108594g(aVar, "holder");
        boolean z = true;
        String str = null;
        C51773w21 w212 = i >= 0 && i < getItemCount() ? this.f39310d.get(i) : null;
        if (C62042e.f176370a.mo87027N0()) {
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
            C62345f fVar = new C62345f(w212 != null ? w212.f143826f : null, (C27696y) null, 2, (C8480h) null);
            ImageView imageView = aVar.f39312z;
            C87412m.m108593f(imageView, "holder.avatar");
            K1.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
            TextView textView = aVar.f39311A;
            C76979h hVar = (C76979h) C86312j.m106911c(cls3);
            Context context = aVar.f39311A.getContext();
            if (w212 != null) {
                str = w212.f143825e;
            }
            textView.setText(hVar.mo107057T1(context, str));
            return;
        }
        aVar.f39312z.setVisibility(8);
        String str2 = w212 != null ? w212.f143825e : null;
        if (w212 != null) {
            str = w212.f143824d;
        }
        if ((str == null || str.length() == 0) || !C87412m.m108589b(str, C75592q0.m90789s())) {
            String str3 = "***";
            if (str2 == null || str2.length() < 2) {
                Log.m105924i("Finder.LiveLotteryWinnerListAdapter", "onBindViewHolder invalid nickName:" + str2);
                Context context2 = aVar.f39311A.getContext();
                String valueOf = String.valueOf(((C76979h) C86312j.m106911c(cls3)).mo107057T1(context2, str2 + str3));
                if (!(str2 == null || str2.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    str3 = valueOf;
                }
                aVar.f39311A.setText(str3);
                return;
            }
            Pattern pattern = C61926c.f176038a;
            if (1 <= str2.length()) {
                str2 = str2.substring(0, 1);
                C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            aVar.f39311A.setText(((C76979h) C86312j.m106911c(cls3)).mo107057T1(aVar.f39311A.getContext(), str2 + str3));
            return;
        }
        aVar.f39311A.setText(((C76979h) C86312j.m106911c(cls3)).mo107057T1(aVar.f39311A.getContext(), str2));
        Log.m105924i("Finder.LiveLotteryWinnerListAdapter", "onBindViewHolder username:" + str + "(nickname:" + str2 + ")win the award");
    }

    /* renamed from: G4 */
    public final void mo13433G4(LinkedList<C51773w21> linkedList) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateWinnerList,ori size:");
        sb.append(this.f39310d.size());
        sb.append(",new size:");
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        Log.m105924i("Finder.LiveLotteryWinnerListAdapter", sb.toString());
        this.f39310d.clear();
        if (linkedList != null) {
            for (C51773w21 add : linkedList) {
                this.f39310d.add(add);
            }
        }
    }

    public int getItemCount() {
        return this.f39310d.size();
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.f359736ai3, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C13996a(this, inflate);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C13996a aVar = (C13996a) zVar;
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(list, "payloads");
        Log.m105924i("Finder.LiveLotteryWinnerListAdapter", "onBindViewHolder payload, pos:" + i + ",payloads:" + list);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        onBindViewHolder(aVar, i);
    }
}
