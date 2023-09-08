package rl1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import te3.C48979cb1;
import wc1.C15064b;

/* renamed from: rl1.j */
public final class C48048j extends RecyclerView.C16613e<C48049a> {

    /* renamed from: d */
    public LinkedList<C48979cb1> f128896d = new LinkedList<>();

    /* renamed from: rl1.j$a */
    public final class C48049a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f128897A;

        /* renamed from: z */
        public final TextView f128898z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48049a(C48048j jVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.n6z);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b bVar2 = bVar;
            C15064b.m14230a(bVar2, context, textView, 14.0f, 0.0f, 8, (Object) null);
            this.f128898z = textView;
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.n6n);
            Context context2 = textView2.getContext();
            C87412m.m108593f(context2, "context");
            C15064b.m14230a(bVar2, context2, textView2, 14.0f, 0.0f, 8, (Object) null);
            this.f128897A = textView2;
        }
    }

    /* renamed from: F4 */
    public void onBindViewHolder(C48049a aVar, int i) {
        C87412m.m108594g(aVar, "holder");
        C48979cb1 cb12 = this.f128896d.get(i);
        C87412m.m108593f(cb12, "dataList[position]");
        C48979cb1 cb13 = cb12;
        aVar.f128898z.setText(cb13.f131617d);
        aVar.f128897A.setText(cb13.f131618e);
    }

    public int getItemCount() {
        return this.f128896d.size();
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cya, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…list_item, parent, false)");
        return new C48049a(this, inflate);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C48049a aVar = (C48049a) zVar;
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(list, "payloads");
        onBindViewHolder(aVar, i);
    }
}
