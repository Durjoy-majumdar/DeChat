package i60;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d62.C75339i;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import p196ln.C76705f;
import p629ny.C76979h;
import rx3.C13598b0;

/* renamed from: i60.g */
public final class C60253g extends RecyclerView.C16613e<C60254a> {

    /* renamed from: d */
    public final ArrayList<C33210j> f171784d = new ArrayList<>();

    /* renamed from: e */
    public final ArrayList<String> f171785e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<String> f171786f = new ArrayList<>();

    /* renamed from: g */
    public C32224a<C13598b0> f171787g;

    /* renamed from: i60.g$a */
    public static final class C60254a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ImageView f171788A;

        /* renamed from: B */
        public final TextView f171789B;

        /* renamed from: C */
        public final TextView f171790C;

        /* renamed from: z */
        public final ImageView f171791z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60254a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.fys);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…hare_rooms_item_selector)");
            this.f171791z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.fyq);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…e_rooms_item_avatar_icon)");
            this.f171788A = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.fyt);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…e_rooms_item_username_tv)");
            this.f171789B = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.fyr);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.…hare_rooms_item_count_tv)");
            this.f171790C = (TextView) findViewById4;
        }
    }

    public int getItemCount() {
        return this.f171784d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C60254a aVar = (C60254a) zVar;
        C87412m.m108594g(aVar, "holder");
        String str = this.f171784d.get(i).f90104a;
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar.f171788A, str);
        aVar.f171789B.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(MMApplicationContext.getContext(), ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f171784d.get(i).f90104a), aVar.f171789B.getTextSize()));
        TextView textView = aVar.f171790C;
        String string = textView.getContext().getResources().getString(C0966R.string.g_u);
        C87412m.m108593f(string, "holder.countTv.context.r…e_share_rooms_item_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f171784d.get(i).f90105b)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        textView.setText(format);
        aVar.f171791z.setEnabled(!this.f171785e.contains(str));
        aVar.f44854d.setOnClickListener(new C60255h(this, i, aVar));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.b7c, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C60254a(inflate);
    }
}
