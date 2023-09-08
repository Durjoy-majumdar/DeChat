package vs1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: vs1.n */
public final class C15000n extends RecyclerView.C16613e<C15001a> {

    /* renamed from: d */
    public final ArrayList<C15002b> f41115d = new ArrayList<>();

    /* renamed from: vs1.n$a */
    public final class C15001a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f41116A;

        /* renamed from: z */
        public final TextView f41117z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15001a(C15000n nVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f41117z = (TextView) view.findViewById(C0966R.C0970id.nhf);
            this.f41116A = (TextView) view.findViewById(C0966R.C0970id.nhe);
        }
    }

    /* renamed from: vs1.n$b */
    public static final class C15002b {

        /* renamed from: a */
        public final String f41118a;

        /* renamed from: b */
        public final int f41119b;

        public C15002b(String str, int i) {
            C87412m.m108594g(str, "choiceName");
            this.f41118a = str;
            this.f41119b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15002b)) {
                return false;
            }
            C15002b bVar = (C15002b) obj;
            return C87412m.m108589b(this.f41118a, bVar.f41118a) && this.f41119b == bVar.f41119b;
        }

        public int hashCode() {
            return (this.f41118a.hashCode() * 31) + this.f41119b;
        }

        public String toString() {
            return "VoteChoiceItem(choiceName=" + this.f41118a + ", choiceCount=" + this.f41119b + ')';
        }
    }

    public int getItemCount() {
        return this.f41115d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C15001a aVar = (C15001a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.f41117z.setText(this.f41115d.get(i).f41118a);
        aVar.f41116A.setText(aVar.f44854d.getContext().getResources().getString(C0966R.string.mry, new Object[]{String.valueOf(this.f41115d.get(i).f41119b)}));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359762d00, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C15001a(this, inflate);
    }
}
