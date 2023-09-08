package lw2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import o40.C61926c;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: lw2.b */
public final class C76729b extends C76734e<C76730a> {

    /* renamed from: e */
    public String f224483e;

    /* renamed from: lw2.b$a */
    public final class C76730a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f224484A;

        /* renamed from: z */
        public final ImageView f224485z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76730a(C76729b bVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.a27);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.avatar_iv)");
            this.f224485z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.hg4);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.nickname_tv)");
            TextView textView = (TextView) findViewById2;
            this.f224484A = textView;
            C61926c.m72678c(textView);
        }
    }

    public int getItemCount() {
        return this.f224492d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C76730a aVar = (C76730a) zVar;
        C87412m.m108594g(aVar, "holder");
        String str = this.f224492d.get(i);
        C87412m.m108593f(str, "dataList[position]");
        String str2 = str;
        if (!C87412m.m108589b(str2, "")) {
            aVar.f224484A.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(aVar.f44854d.getContext(), ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2).mo62898f(), aVar.f224484A.getTextSize()));
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(aVar.f224485z, str2, 0.5f);
            aVar.f224485z.setOnClickListener(new C76731c(str2, this, aVar));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c6r, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context)\n   …atar_view, parent, false)");
        return new C76730a(this, inflate);
    }
}
