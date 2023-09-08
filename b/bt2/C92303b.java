package bt2;

import androidx.lifecycle.C0120a0;
import at2.C92091c;
import at2.C92092d;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;

/* renamed from: bt2.b */
public final class C92303b<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C92304c f264130d;

    public C92303b(C92304c cVar) {
        this.f264130d = cVar;
    }

    public void onChanged(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController$initCallbacks$1$1");
        C92091c cVar = (C92091c) obj;
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController$initCallbacks$1$1");
        C92304c cVar2 = this.f264130d;
        SnsMethodCalculate.markStartTimeMs("access$getCallbacks$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
        List<C32226l<List<C92092d>, C13598b0>> list = cVar2.f264135e;
        SnsMethodCalculate.markEndTimeMs("access$getCallbacks$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
        C92304c cVar3 = this.f264130d;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((C32226l) it.next()).invoke(cVar3.mo126079a());
        }
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController$initCallbacks$1$1");
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController$initCallbacks$1$1");
    }
}
