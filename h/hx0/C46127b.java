package hx0;

import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import qj3.C47864f;

/* renamed from: hx0.b */
public class C46127b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f124290d;

    /* renamed from: e */
    public final /* synthetic */ BrandServiceSortView f124291e;

    public C46127b(BrandServiceSortView brandServiceSortView, int i) {
        this.f124291e = brandServiceSortView;
        this.f124290d = i;
    }

    public void run() {
        Log.m105924i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog run");
        List<C47864f> datas = this.f124291e.getDatas();
        int i = this.f124290d;
        if (i < 0 || datas == null || i >= datas.size()) {
            Log.m105924i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog run refresh all");
            this.f124291e.mo63548h();
            return;
        }
        datas.remove(this.f124290d);
        C44721b adapter = this.f124291e.getAdapter();
        adapter.mo69954b(adapter.f121310d);
    }
}
