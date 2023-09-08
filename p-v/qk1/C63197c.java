package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import pl1.C11978e0;
import rx3.C13598b0;
import sk1.C63948b;
import te3.C50030js1;

/* renamed from: qk1.c */
public final class C63197c extends RecyclerView.C16613e<C63198a> {

    /* renamed from: d */
    public final ArrayList<C63948b> f179302d = new ArrayList<>();

    /* renamed from: e */
    public C32226l<? super C63948b, C13598b0> f179303e;

    /* renamed from: f */
    public boolean f179304f;

    /* renamed from: qk1.c$a */
    public static final class C63198a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f179305A;

        /* renamed from: B */
        public final ImageView f179306B;

        /* renamed from: C */
        public final View f179307C;

        /* renamed from: D */
        public final View f179308D;

        /* renamed from: E */
        public C63948b f179309E;

        /* renamed from: z */
        public final TextView f179310z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63198a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179310z = (TextView) view.findViewById(C0966R.C0970id.eo6);
            this.f179305A = (TextView) view.findViewById(C0966R.C0970id.eio);
            this.f179306B = (ImageView) view.findViewById(C0966R.C0970id.eku);
            this.f179307C = view.findViewById(C0966R.C0970id.krm);
            this.f179308D = view.findViewById(C0966R.C0970id.agz);
        }
    }

    public int getItemCount() {
        return this.f179302d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        String str2;
        int i2 = i;
        C63198a aVar = (C63198a) zVar;
        C87412m.m108594g(aVar, "holder");
        View view = aVar.f179307C;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        int i3 = 8;
        aVar2.mo10233c(8);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i2 == 0) {
            View view2 = aVar.f179307C;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter", "initLines", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$GameSelectItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ViewGroup.LayoutParams layoutParams = aVar.f179308D.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (i2 != getItemCount() - 1 || this.f179304f) {
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) aVar.f44854d.getContext().getResources().getDimension(C0966R.dimen.f3760da));
            }
        } else if (layoutParams2 != null) {
            layoutParams2.setMarginStart(0);
        }
        C63948b bVar = this.f179302d.get(i2);
        C87412m.m108593f(bVar, "dataList[position]");
        C63948b bVar2 = bVar;
        aVar.f179309E = bVar2;
        TextView textView = aVar.f179310z;
        C50030js1 js12 = bVar2.f181275d.f137024e;
        if (js12 == null || (str = js12.f136285e) == null) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = aVar.f179305A;
        C50030js1 js13 = bVar2.f181275d.f137024e;
        boolean z = true;
        if (js13 == null || js13.f136294q != 1) {
            z = false;
        }
        if (z) {
            i3 = 0;
        }
        textView2.setVisibility(i3);
        C50030js1 js14 = bVar2.f181275d.f137024e;
        String str3 = (js14 == null || (str2 = js14.f136286f) == null) ? "" : str2;
        C7335d c = C86312j.m106911c(C60200t1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C60200t1.C60201a.m70370h((C60200t1) c, str3, aVar.f179306B, (C11978e0.C11979a) null, 4, (Object) null);
        aVar.f44854d.setOnClickListener(new C63201d(this, bVar2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.acq, viewGroup, false);
        C87412m.m108593f(inflate, "getInflater(parent.conte…lect_item, parent, false)");
        return new C63198a(inflate);
    }
}
