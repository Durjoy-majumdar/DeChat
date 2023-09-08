package qk1;

import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.file.XVFSFile;
import de3.C75375u;
import gy3.C87412m;
import java.util.LinkedList;
import te3.lf4;

/* renamed from: qk1.w0 */
public final class C12843w0 extends RecyclerView.C16613e<C12844a> {

    /* renamed from: d */
    public LinkedList<lf4> f36755d = new LinkedList<>();

    /* renamed from: qk1.w0$a */
    public final class C12844a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f36756A;

        /* renamed from: B */
        public final TextView f36757B;

        /* renamed from: z */
        public final TextView f36758z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12844a(C12843w0 w0Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f36758z = (TextView) view.findViewById(C0966R.C0970id.kfz);
            this.f36756A = (TextView) view.findViewById(C0966R.C0970id.kfv);
            this.f36757B = (TextView) view.findViewById(C0966R.C0970id.kfw);
        }
    }

    public int getItemCount() {
        return this.f36755d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C12844a aVar = (C12844a) zVar;
        C87412m.m108594g(aVar, "holder");
        lf4 lf4 = this.f36755d.get(i);
        C87412m.m108593f(lf4, "dataList[position]");
        lf4 lf42 = lf4;
        aVar.f36758z.setText(lf42.f137391d);
        aVar.f36756A.setText(lf42.f137392e);
        int i2 = lf42.f137394g;
        int i3 = lf42.f137397j;
        int i4 = (i2 * i3) / lf42.f137395h;
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        sb.append(i3);
        C75375u uVar = new C75375u(sb.toString());
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(aVar.f44854d.getContext().getResources().getColor(C0966R.color.f2976b7));
        if (lf42.f137394g == lf42.f137395h) {
            uVar.mo105705b(foregroundColorSpan, 0, uVar.length(), 17);
        } else {
            uVar.mo105705b(foregroundColorSpan, 0, String.valueOf(i4).length(), 17);
        }
        aVar.f36757B.setText(uVar);
        aVar.f44854d.setOnClickListener(new C12845x0(this));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.aga, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…task_item, parent, false)");
        return new C12844a(this, inflate);
    }
}
