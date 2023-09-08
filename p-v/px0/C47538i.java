package px0;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.autogen.mmdata.rpt.BizQualityReportStruct;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import jq3.C9500j;

/* renamed from: px0.i */
public final class C47538i extends WxRecyclerAdapter<C22039d> {
    public C47538i(C9500j jVar, ArrayList<C22039d> arrayList) {
        super(jVar, arrayList, true);
    }

    /* renamed from: l6 */
    public String mo10423l6(Exception exc, RecyclerView.C16631z zVar, int i, List list) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(exc, "e");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(list, "payloads");
        BizQualityReportStruct bizQualityReportStruct = new BizQualityReportStruct();
        bizQualityReportStruct.f107857d = 101;
        bizQualityReportStruct.mo86054n();
        super.mo10423l6(exc, oVar, i, list);
        return "";
    }

    /* renamed from: m6 */
    public String mo10424m6(Exception exc, int i) {
        C87412m.m108594g(exc, "e");
        BizQualityReportStruct bizQualityReportStruct = new BizQualityReportStruct();
        bizQualityReportStruct.f107857d = 101;
        bizQualityReportStruct.mo86054n();
        return super.mo10424m6(exc, i);
    }

    /* renamed from: v6 */
    public boolean mo6267v6() {
        return true;
    }
}
