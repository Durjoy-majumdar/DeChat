package mb2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mb2.a */
public final class C61457a extends RecyclerView.C16613e<C61458a> {

    /* renamed from: d */
    public final C61460b f174771d;

    /* renamed from: e */
    public final ArrayList<String> f174772e = new ArrayList<>();

    /* renamed from: mb2.a$a */
    public final class C61458a extends RecyclerView.C16631z {

        /* renamed from: z */
        public final TextView f174773z;

        /* renamed from: mb2.a$a$a */
        public static final class C61459a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C61457a f174774d;

            /* renamed from: e */
            public final /* synthetic */ C61458a f174775e;

            public C61459a(C61457a aVar, C61458a aVar2) {
                this.f174774d = aVar;
                this.f174775e = aVar2;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/mv/ui/adapter/MusicLyricAdapter$MusicLyricViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f174774d.f174771d.mo86435j(this.f174775e.mo17363j());
                C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicLyricAdapter$MusicLyricViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61458a(C61457a aVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f174773z = (TextView) view.findViewById(C0966R.C0970id.gjt);
            view.setOnClickListener(new C61459a(aVar, this));
        }
    }

    /* renamed from: mb2.a$b */
    public interface C61460b {
        /* renamed from: j */
        void mo86435j(int i);
    }

    public C61457a(C61460b bVar) {
        C87412m.m108594g(bVar, "itemClickListener");
        this.f174771d = bVar;
    }

    /* renamed from: F4 */
    public final void mo86433F4(List<String> list) {
        C87412m.m108594g(list, "list");
        this.f174772e.clear();
        this.f174772e.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f174772e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C61458a aVar = (C61458a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.f174773z.setText(this.f174772e.get(i));
        aVar.f174773z.setContentDescription(this.f174772e.get(i));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.bil, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C61458a(this, inflate);
    }
}
