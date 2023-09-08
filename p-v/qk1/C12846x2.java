package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C51745vv0;

/* renamed from: qk1.x2 */
public final class C12846x2 extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public C32224a<C13598b0> f36760d;

    /* renamed from: e */
    public LinkedList<C12848b> f36761e = new LinkedList<>();

    /* renamed from: qk1.x2$a */
    public final class C12847a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12847a(C12846x2 x2Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.lpp);
        }
    }

    /* renamed from: qk1.x2$b */
    public static final class C12848b {

        /* renamed from: a */
        public boolean f36762a;

        /* renamed from: b */
        public final C51745vv0 f36763b;

        /* renamed from: c */
        public int f36764c;

        public C12848b(boolean z, C51745vv0 vv02, int i, int i2, C8480h hVar) {
            z = (i2 & 1) != 0 ? false : z;
            i = (i2 & 4) != 0 ? 1 : i;
            C87412m.m108594g(vv02, "audienceFile");
            this.f36762a = z;
            this.f36763b = vv02;
            this.f36764c = i;
        }
    }

    /* renamed from: qk1.x2$c */
    public final class C12849c extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f36765A;

        /* renamed from: z */
        public CheckBox f36766z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12849c(C12846x2 x2Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f36766z = (CheckBox) view.findViewById(C0966R.C0970id.lpn);
            this.f36765A = (TextView) view.findViewById(C0966R.C0970id.lps);
            this.f36766z.setClickable(false);
        }
    }

    public int getItemCount() {
        return this.f36761e.size();
    }

    public int getItemViewType(int i) {
        return this.f36761e.get(i).f36764c;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C51745vv0 vv02;
        C51745vv0 vv03;
        C87412m.m108594g(zVar, "holder");
        if (zVar instanceof C12849c) {
            C12849c cVar = (C12849c) zVar;
            boolean z = false;
            String str = null;
            C12848b bVar = i >= 0 && i < getItemCount() ? this.f36761e.get(i) : null;
            CheckBox checkBox = cVar.f36766z;
            if (bVar != null && bVar.f36762a) {
                z = true;
            }
            checkBox.setChecked(z);
            cVar.f44854d.setOnClickListener(new C12870y2(bVar, cVar, this));
            cVar.f36765A.setText((bVar == null || (vv03 = bVar.f36763b) == null) ? null : vv03.f143710e);
            TextView textView = cVar.f36765A;
            if (!(bVar == null || (vv02 = bVar.f36763b) == null)) {
                str = vv02.f143709d;
            }
            textView.setTag(str);
        } else if (zVar instanceof C12847a) {
            C12847a aVar = (C12847a) zVar;
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 2) {
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.al5, (ViewGroup) null);
            C87412m.m108593f(inflate, "itemView");
            return new C12847a(this, inflate);
        }
        View inflate2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.al7, (ViewGroup) null);
        C87412m.m108593f(inflate2, "itemView");
        return new C12849c(this, inflate2);
    }
}
