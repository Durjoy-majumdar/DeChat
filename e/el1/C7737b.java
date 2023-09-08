package el1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: el1.b */
public final class C7737b extends RecyclerView.C16613e<C7739b> {

    /* renamed from: d */
    public List<C7738a> f26202d;

    /* renamed from: e */
    public C32227p<? super C7738a, ? super Integer, C13598b0> f26203e;

    /* renamed from: el1.b$a */
    public static final class C7738a {

        /* renamed from: a */
        public String f26204a;

        /* renamed from: b */
        public String f26205b;

        /* renamed from: c */
        public int f26206c;

        /* renamed from: d */
        public boolean f26207d;

        public C7738a() {
            this("", "", 0, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7738a)) {
                return false;
            }
            C7738a aVar = (C7738a) obj;
            return C87412m.m108589b(this.f26204a, aVar.f26204a) && C87412m.m108589b(this.f26205b, aVar.f26205b) && this.f26206c == aVar.f26206c && this.f26207d == aVar.f26207d;
        }

        public int hashCode() {
            int hashCode = ((((this.f26204a.hashCode() * 31) + this.f26205b.hashCode()) * 31) + this.f26206c) * 31;
            boolean z = this.f26207d;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "title:" + this.f26204a + "-:desc:" + this.f26205b + "-type:" + this.f26206c + "-choose:" + this.f26207d;
        }

        public C7738a(String str, String str2, int i, boolean z) {
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "desc");
            this.f26204a = str;
            this.f26205b = str2;
            this.f26206c = i;
            this.f26207d = z;
        }
    }

    /* renamed from: el1.b$b */
    public static final class C7739b extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f26208A;

        /* renamed from: B */
        public WeImageView f26209B;

        /* renamed from: z */
        public TextView f26210z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7739b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f26210z = (TextView) view.findViewById(C0966R.C0970id.g7d);
            this.f26208A = (TextView) view.findViewById(C0966R.C0970id.g7b);
            this.f26209B = (WeImageView) view.findViewById(C0966R.C0970id.g7c);
        }
    }

    public int getItemCount() {
        List<C7738a> list = this.f26202d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        List<C7738a> list;
        int i2 = i;
        C7739b bVar = (C7739b) zVar;
        C87412m.m108594g(bVar, "holder");
        View view = bVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$ChargeModeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$ChargeModeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z = true;
        C13598b0 b0Var = null;
        C7738a aVar2 = (!(i2 >= 0 && i2 < getItemCount()) || (list = this.f26202d) == null) ? null : list.get(i2);
        if (aVar2 != null) {
            bVar.f26210z.setText(aVar2.f26204a);
            bVar.f26209B.setVisibility(aVar2.f26207d ? 0 : 8);
            bVar.f44854d.setEnabled(true);
            String str = aVar2.f26205b;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (z) {
                bVar.f26208A.setVisibility(8);
                bVar.f26208A.setText("");
            } else {
                bVar.f26208A.setVisibility(0);
                bVar.f26208A.setText(aVar2.f26205b);
            }
            bVar.f26210z.setTextColor(bVar.f44854d.getContext().getResources().getColor(C0966R.color.f3133gi));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            bVar.f44854d.setEnabled(false);
            bVar.f26210z.setText("");
            bVar.f26208A.setText("");
            bVar.f26209B.setVisibility(8);
            View view2 = bVar.f44854d;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$ChargeModeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$ChargeModeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bVar.f44854d.setOnClickListener(new C7740c(this, aVar2, i2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.f359733ai0, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C7739b(inflate);
    }
}
