package x82;

import a92.C103341b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.recyclerview.ScreenThumbLayoutManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import x82.C112075a;

/* renamed from: x82.a0 */
public final class C112078a0 extends C87413o implements C32227p<View, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112080b0 f335530d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112078a0(C112080b0 b0Var) {
        super(2);
        this.f335530d = b0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        C87412m.m108594g((View) obj, "view");
        Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickThumb");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1538, 10, 1);
        if (intValue != this.f335530d.f335557m) {
            Bundle bundle = new Bundle();
            bundle.putInt("thumb_flip_target_position", intValue);
            this.f335530d.f335546b.mo163772c(C112075a.C112077b.THUMB_VIEW_PAGE_FLIP, bundle);
            if (this.f335530d.f335552h != null && intValue >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(intValue + 1);
                sb.append(XVFSFile.SEPARATOR_CHAR);
                sb.append(this.f335530d.f335558n);
                String sb4 = sb.toString();
                C112134y yVar = this.f335530d.f335554j;
                if (yVar != null) {
                    yVar.mo163918e(sb4);
                }
                C103341b bVar = this.f335530d.f335551g;
                if (bVar != null) {
                    bVar.f304732i = intValue;
                    bVar.notifyDataSetChanged();
                }
                C112080b0 b0Var = this.f335530d;
                ScreenThumbLayoutManager screenThumbLayoutManager = b0Var.f335549e;
                if (screenThumbLayoutManager != null) {
                    RecyclerView recyclerView = b0Var.f335552h;
                    C87412m.m108591d(recyclerView);
                    screenThumbLayoutManager.smoothScrollToPosition(recyclerView, new RecyclerView.C16628w(), intValue);
                }
                Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickThumbFlipPage");
                nVar.mo175913w(1538, 11, 1);
            }
        }
        return C13598b0.f38549a;
    }
}
