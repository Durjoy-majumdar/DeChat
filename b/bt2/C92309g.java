package bt2;

import at2.C92091c;
import bt2.C92307f;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.List;
import kf0.C21332b;

/* renamed from: bt2.g */
public final class C92309g implements C21332b<C92091c> {

    /* renamed from: a */
    public final /* synthetic */ C92307f.C92308a f264147a;

    public C92309g(C92307f.C92308a aVar) {
        this.f264147a = aVar;
    }

    /* renamed from: a */
    public String mo33223a(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemToDisplay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
        if (i < 0) {
            SnsMethodCalculate.markEndTimeMs("getItemToDisplay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
            return "";
        }
        List<C92091c> a = this.f264147a.mo126291a();
        if (a.size() > i) {
            C92091c cVar = a.get(i);
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
            String str = cVar.f263638b;
            SnsMethodCalculate.markEndTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
            SnsMethodCalculate.markEndTimeMs("getItemToDisplay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getItemToDisplay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
        return "";
    }

    public Object getItem(int i) {
        C92091c cVar;
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
        if (this.f264147a.mo126291a().size() > i) {
            cVar = this.f264147a.mo126291a().get(i);
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
        } else {
            cVar = null;
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
        }
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
        return cVar;
    }

    public int getItemsCount() {
        SnsMethodCalculate.markStartTimeMs("getItemsCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
        int size = this.f264147a.mo126291a().size();
        SnsMethodCalculate.markEndTimeMs("getItemsCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$setAdapter$1");
        return size;
    }
}
