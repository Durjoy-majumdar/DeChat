package qk1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import d50.C7170j;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: qk1.p0 */
public final class C12825p0 extends RecyclerView.C16613e<C12827b> {

    /* renamed from: d */
    public LinkedList<C12826a> f36710d = new LinkedList<>();

    /* renamed from: e */
    public C32226l<? super C7170j, C13598b0> f36711e;

    /* renamed from: qk1.p0$a */
    public static final class C12826a {

        /* renamed from: a */
        public final C7170j f36712a;

        /* renamed from: b */
        public boolean f36713b;

        public C12826a(C7170j jVar, boolean z) {
            C87412m.m108594g(jVar, "liveUrlInfo");
            this.f36712a = jVar;
            this.f36713b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12826a)) {
                return false;
            }
            C12826a aVar = (C12826a) obj;
            return C87412m.m108589b(this.f36712a, aVar.f36712a) && this.f36713b == aVar.f36713b;
        }

        public int hashCode() {
            int hashCode = this.f36712a.hashCode() * 31;
            boolean z = this.f36713b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "liveUrlInfo:" + this.f36712a + ", chooser:" + this.f36713b;
        }
    }

    /* renamed from: qk1.p0$b */
    public final class C12827b extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f36714A;

        /* renamed from: z */
        public TextView f36715z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12827b(C12825p0 p0Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.c09);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.definition_tv)");
            this.f36715z = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.c05);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.definition_choose)");
            this.f36714A = (ImageView) findViewById2;
        }
    }

    public int getItemCount() {
        return this.f36710d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C12827b bVar = (C12827b) zVar;
        C87412m.m108594g(bVar, "holder");
        C12826a aVar = this.f36710d.get(i);
        C87412m.m108593f(aVar, "dataList[position]");
        C12826a aVar2 = aVar;
        TextView textView = bVar.f36715z;
        String str = aVar2.f36712a.f25144c;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        if (aVar2.f36713b) {
            bVar.f36714A.setVisibility(0);
        } else {
            bVar.f36714A.setVisibility(8);
        }
        bVar.f44854d.setOnClickListener(new C12830q0(aVar2, this));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.aki, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C12827b(this, inflate);
    }
}
