package av2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: av2.v */
public final class C54359v extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final /* synthetic */ C54360w f152529d;

    public C54359v(C54360w wVar) {
        this.f152529d = wVar;
    }

    public int getItemCount() {
        SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2$1");
        int size = C54360w.m61051L(this.f152529d).size();
        SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2$1");
        return size;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2$1");
        C87412m.m108594g(zVar, "holder");
        ((C54348d) zVar).mo75118z((C72996z1) C54360w.m61051L(this.f152529d).get(i));
        if (i == 0 && i == getItemCount() - 1) {
            zVar.f44854d.setBackground(C76577a.m92158i(this.f152529d.getContext(), C0966R.C0969drawable.clv));
        } else if (i == 0) {
            zVar.f44854d.setBackground(C76577a.m92158i(this.f152529d.getContext(), C0966R.C0969drawable.clu));
        } else if (i == getItemCount() - 1) {
            zVar.f44854d.setBackground(C76577a.m92158i(this.f152529d.getContext(), C0966R.C0969drawable.cls));
        } else {
            zVar.f44854d.setBackground(C76577a.m92158i(this.f152529d.getContext(), C0966R.C0969drawable.clt));
        }
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2$1");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2$1");
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(this.f152529d.getContext()).inflate(C0966R.C0971layout.d2y, viewGroup, false);
        C87412m.m108593f(inflate, "getInflater(context)\n   …tact_item, parent, false)");
        C54360w wVar = this.f152529d;
        wVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getUiContext", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        Context context = wVar.f152534s;
        SnsMethodCalculate.markEndTimeMs("getUiContext", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
        C54348d dVar = new C54348d(inflate, context);
        SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$adapter$2$1");
        return dVar;
    }
}
