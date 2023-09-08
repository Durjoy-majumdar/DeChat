package dj2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;

/* renamed from: dj2.b */
public final class C7353b extends RecyclerView.C16613e<C7354a> {

    /* renamed from: d */
    public final List<String> f25477d;

    /* renamed from: e */
    public final Context f25478e;

    /* renamed from: dj2.b$a */
    public final class C7354a extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f25479z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7354a(C7353b bVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.kv8);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.tvTest)");
            this.f25479z = (TextView) findViewById;
        }
    }

    public C7353b(List<String> list, Context context) {
        C87412m.m108594g(list, "datas");
        C87412m.m108594g(context, "context");
        this.f25477d = list;
        this.f25478e = context;
    }

    public int getItemCount() {
        return this.f25477d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C7354a aVar = (C7354a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.f25479z.setText(this.f25477d.get(i));
        if (i % 2 == 0) {
            aVar.f25479z.setBackgroundColor(this.f25478e.getResources().getColor(C0966R.color.aky));
        } else {
            aVar.f25479z.setBackgroundColor(this.f25478e.getResources().getColor(C0966R.color.al6));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f25478e).inflate(C0966R.C0971layout.bsp, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context)\n          …_demo_rl_list_item, null)");
        return new C7354a(this, inflate);
    }
}
