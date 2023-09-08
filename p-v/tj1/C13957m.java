package tj1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import l31.C10460a;
import l31.C61212e;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: tj1.m */
public final class C13957m extends RecyclerView.C16613e<FinderLiveGiftTagView.C3187a> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveGiftTagView f39201d;

    public C13957m(FinderLiveGiftTagView finderLiveGiftTagView) {
        this.f39201d = finderLiveGiftTagView;
    }

    public int getItemCount() {
        List<String> list = this.f39201d.f15185g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        FinderLiveGiftTagView.C3187a aVar = (FinderLiveGiftTagView.C3187a) zVar;
        C87412m.m108594g(aVar, "holder");
        TextView textView = (TextView) aVar.f44854d.findViewById(C0966R.C0970id.f358157mr3);
        List<String> list = this.f39201d.f15185g;
        textView.setText(list != null ? list.get(i) : null);
        View view = aVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C10460a.m10392a(view, "live_gift_tab");
        FinderLiveGiftTagView finderLiveGiftTagView = this.f39201d;
        if (i == finderLiveGiftTagView.f15188j) {
            View view2 = aVar.f44854d;
            Context context = finderLiveGiftTagView.f15182d;
            if (context != null) {
                view2.setBackground(context.getDrawable(C0966R.C0969drawable.b8y));
                textView.setTextColor(Color.parseColor("#CCFFFFFF"));
                if (i != this.f39201d.f15187i) {
                    C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                    View view3 = aVar.f44854d;
                    C13604l[] lVarArr = new C13604l[2];
                    lVarArr[0] = new C13604l("tab_type_page", Integer.valueOf(i + 1));
                    List<String> list2 = this.f39201d.f15185g;
                    if (list2 == null || (str = list2.get(i)) == null) {
                        str = "";
                    }
                    lVarArr[1] = new C13604l("tab_type_name", str);
                    eVar.mo86153W7("view_exp", view3, C90364q0.m113147f(lVarArr), 25561);
                    this.f39201d.f15187i = i;
                }
            } else {
                C87412m.m108603p("mContext");
                throw null;
            }
        } else {
            aVar.f44854d.setBackground((Drawable) null);
            textView.setTextColor(Color.parseColor("#80FFFFFF"));
        }
        aVar.f44854d.setOnClickListener(new C13956l(this.f39201d, i, this));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f39201d.getContext()).inflate(C0966R.C0971layout.f359724ct0, viewGroup, false);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
        return new FinderLiveGiftTagView.C3187a(this.f39201d, inflate);
    }
}
