package xr0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import xr0.C91332m;

/* renamed from: xr0.k */
public final class C91331k extends RecyclerView.C16613e<C91332m> {

    /* renamed from: d */
    public final ArrayList<LocalUsageInfo> f261958d;

    /* renamed from: e */
    public final C91332m.C91333a f261959e;

    public C91331k(ArrayList<LocalUsageInfo> arrayList, C91332m.C91333a aVar) {
        C87412m.m108594g(arrayList, "dataList");
        this.f261958d = arrayList;
        this.f261959e = aVar;
    }

    public int getItemCount() {
        return this.f261958d.size();
    }

    public long getItemId(int i) {
        LocalUsageInfo localUsageInfo = this.f261958d.get(i);
        return (long) (localUsageInfo.f239040d + localUsageInfo.f239042f).hashCode();
    }

    public int getItemViewType(int i) {
        return 1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C91332m mVar = (C91332m) zVar;
        C87412m.m108594g(mVar, "holder");
        LocalUsageInfo localUsageInfo = this.f261958d.get(i);
        C87412m.m108593f(localUsageInfo, "dataList[position]");
        mVar.mo125317y(localUsageInfo);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6422ef, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…as_normal, parent, false)");
        return new C91332m(inflate, this.f261959e);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C91332m mVar = (C91332m) zVar;
        C87412m.m108594g(mVar, "holder");
        C87412m.m108594g(list, "payloads");
        if (!list.isEmpty()) {
            Object obj = list.get(0);
            Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
            if (bundle != null && !bundle.isEmpty()) {
                LocalUsageInfo localUsageInfo = this.f261958d.get(i);
                C87412m.m108593f(localUsageInfo, "dataList[position]");
                mVar.f261965F = localUsageInfo;
                if (bundle.get("icon") != null) {
                    String str = C88394b.f255384g;
                    C88394b bVar = C88394b.C88418q.f255427a;
                    ImageView imageView = mVar.f261961B;
                    LocalUsageInfo localUsageInfo2 = mVar.f261965F;
                    C87412m.m108591d(localUsageInfo2);
                    bVar.mo122786b(imageView, localUsageInfo2.f239046j, C88393a.m110230a(), C88431k.f255437d);
                }
                if (bundle.get("nick_name") != null) {
                    mVar.mo125318z();
                    return;
                }
                return;
            }
        }
        LocalUsageInfo localUsageInfo3 = this.f261958d.get(i);
        C87412m.m108593f(localUsageInfo3, "dataList[position]");
        mVar.mo125317y(localUsageInfo3);
    }
}
