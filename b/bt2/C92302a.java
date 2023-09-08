package bt2;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import at2.C92091c;
import bt2.C92307f;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import java.util.List;

/* renamed from: bt2.a */
public final class C92302a<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C54219z<C92307f.C92308a> f264129d;

    public C92302a(C54219z<C92307f.C92308a> zVar) {
        this.f264129d = zVar;
    }

    public void onChanged(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController$createBindLiveData$1");
        C92091c cVar = (C92091c) obj;
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController$createBindLiveData$1");
        List<C92091c> a = cVar != null ? cVar.mo126080a() : null;
        if (a == null || a.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController$createBindLiveData$1");
        } else {
            this.f264129d.setValue(new C92307f.C92308a(cVar, a, 0, 0, 12, (C8480h) null));
            SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController$createBindLiveData$1");
        }
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController$createBindLiveData$1");
    }
}
