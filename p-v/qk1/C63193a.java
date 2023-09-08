package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import pl1.C11978e0;
import rx3.C13598b0;
import sk1.C63948b;
import te3.C50030js1;

/* renamed from: qk1.a */
public final class C63193a extends RecyclerView.C16613e<C63194a> {

    /* renamed from: d */
    public final ArrayList<C63948b> f179293d = new ArrayList<>();

    /* renamed from: e */
    public C32226l<? super C63948b, C13598b0> f179294e;

    /* renamed from: qk1.a$a */
    public static final class C63194a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f179295A;

        /* renamed from: B */
        public final ImageView f179296B;

        /* renamed from: C */
        public C63948b f179297C;

        /* renamed from: z */
        public final TextView f179298z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63194a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179298z = (TextView) view.findViewById(C0966R.C0970id.eo6);
            this.f179295A = (TextView) view.findViewById(C0966R.C0970id.eio);
            this.f179296B = (ImageView) view.findViewById(C0966R.C0970id.eku);
        }
    }

    public int getItemCount() {
        return this.f179293d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        String str2;
        C63194a aVar = (C63194a) zVar;
        C87412m.m108594g(aVar, "holder");
        C63948b bVar = this.f179293d.get(i);
        C87412m.m108593f(bVar, "dataList[position]");
        C63948b bVar2 = bVar;
        aVar.f179297C = bVar2;
        TextView textView = aVar.f179298z;
        C50030js1 js12 = bVar2.f181275d.f137024e;
        if (js12 == null || (str = js12.f136296s) == null) {
            str = js12 != null ? js12.f136285e : null;
            if (str == null) {
                str = "";
            }
        }
        textView.setText(str);
        TextView textView2 = aVar.f179295A;
        C50030js1 js13 = bVar2.f181275d.f137024e;
        boolean z = true;
        int i2 = 0;
        if (js13 == null || js13.f136294q != 1) {
            z = false;
        }
        if (!z) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        C50030js1 js14 = bVar2.f181275d.f137024e;
        String str3 = (js14 == null || (str2 = js14.f136286f) == null) ? "" : str2;
        C7335d c = C86312j.m106911c(C60200t1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C60200t1.C60201a.m70370h((C60200t1) c, str3, aVar.f179296B, (C11978e0.C11979a) null, 4, (Object) null);
        aVar.f44854d.setOnClickListener(new C63196b(this, bVar2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.aco, viewGroup, false);
        C87412m.m108593f(inflate, "getInflater(parent.conte…cent_play, parent, false)");
        return new C63194a(inflate);
    }
}
