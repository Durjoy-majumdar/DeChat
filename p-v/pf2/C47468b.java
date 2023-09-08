package pf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import kg3.C76577a;
import nf2.C47240a;
import te3.C49699hg;
import te3.C50117ke;

/* renamed from: pf2.b */
public final class C47468b extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final C50117ke f127321d;

    /* renamed from: e */
    public final ArrayList<C47472c> f127322e;

    /* renamed from: f */
    public final C47240a f127323f;

    /* renamed from: g */
    public final int f127324g;

    public C47468b(C50117ke keVar, ArrayList<C47472c> arrayList, C47240a aVar, int i) {
        C87412m.m108594g(keVar, "baseInfo");
        C87412m.m108594g(arrayList, "dataList");
        C87412m.m108594g(aVar, "outAdapter");
        this.f127321d = keVar;
        this.f127322e = arrayList;
        this.f127323f = aVar;
        this.f127324g = i;
    }

    /* renamed from: F4 */
    public final int mo72489F4(int i) {
        return C76577a.m92151b(this.f127323f.f126805d, i);
    }

    public int getItemCount() {
        return this.f127322e.size();
    }

    public int getItemViewType(int i) {
        return this.f127322e.get(i).f127335a.f127458d;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C87412m.m108594g(zVar, "holder");
        if (zVar instanceof C47466a) {
            C47472c cVar = this.f127322e.get(i);
            C87412m.m108593f(cVar, "dataList[position]");
            ((C47466a) zVar).mo72488y(cVar, i);
        } else if ((zVar instanceof C47476e) && this.f127322e.get(i).f127337c != null) {
            C47476e eVar = (C47476e) zVar;
            C49699hg hgVar = this.f127322e.get(i).f127337c;
            C87412m.m108591d(hgVar);
            String string = eVar.f127348A.getResources().getString(C0966R.string.app);
            C87412m.m108593f(string, "mContext.resources.getSt…e_line_show_more_article)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(hgVar.f134607i.f137969e.size() - 3)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            ((TextView) eVar.f44854d.findViewById(C0966R.C0970id.lyt)).setText(format);
            eVar.f44854d.setOnClickListener(new C47474d(hgVar, eVar));
        }
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        View findViewById = view.findViewById(C0966R.C0970id.lzg);
        if (this.f127322e.size() == 1) {
            if (findViewById != null) {
                findViewById.setPadding(mo72489F4(16), mo72489F4(4), mo72489F4(16), mo72489F4(20));
            }
        } else if (i == 0) {
            if (findViewById != null) {
                findViewById.setPadding(mo72489F4(16), mo72489F4(4), mo72489F4(16), mo72489F4(16));
            }
        } else if (i == this.f127322e.size() - 1 && findViewById != null) {
            findViewById.setPadding(mo72489F4(16), mo72489F4(16), mo72489F4(16), mo72489F4(20));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c4r, viewGroup, false);
            C87412m.m108593f(inflate, "itemView");
            return new C47501y(inflate, this.f127323f, this.f127321d);
        } else if (i == 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.bxp, viewGroup, false);
            C87412m.m108593f(inflate2, "itemView");
            return new C47500x(inflate2, this.f127323f, this.f127321d);
        } else if (i == 7) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cur, viewGroup, false);
            C87412m.m108593f(inflate3, "itemView");
            return new C47499w(inflate3, this.f127323f, this.f127321d);
        } else if (i == 3) {
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c5b, viewGroup, false);
            C87412m.m108593f(inflate4, "itemView");
            return new C47467a0(inflate4, this.f127323f, this.f127321d);
        } else if (i == 5) {
            View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359636c81, viewGroup, false);
            C87412m.m108593f(inflate5, "itemView");
            return new C47473c0(inflate5, this.f127323f, this.f127321d);
        } else if (i == 4) {
            View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cip, viewGroup, false);
            C87412m.m108593f(inflate6, "itemView");
            return new C47475d0(inflate6, this.f127323f, this.f127321d);
        } else if (i == 6) {
            View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cj8, viewGroup, false);
            C87412m.m108593f(inflate7, "itemView");
            return new C47481f0(inflate7, this.f127323f, this.f127321d);
        } else if (i == 8) {
            View inflate8 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cus, viewGroup, false);
            C87412m.m108593f(inflate8, "itemView");
            return new C47469b0(inflate8, this.f127323f, this.f127321d);
        } else if (i == 99) {
            View inflate9 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.bws, viewGroup, false);
            C87412m.m108593f(inflate9, "itemView");
            return new C47476e(inflate9, this.f127323f, this.f127324g);
        } else {
            View inflate10 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c5b, viewGroup, false);
            C87412m.m108593f(inflate10, "itemView");
            return new C47467a0(inflate10, this.f127323f, this.f127321d);
        }
    }
}
