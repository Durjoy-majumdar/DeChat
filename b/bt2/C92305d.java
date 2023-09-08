package bt2;

import androidx.lifecycle.C54219z;
import at2.C92091c;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import lf0.C21425b;

/* renamed from: bt2.d */
public final class C92305d implements C21425b {

    /* renamed from: a */
    public final /* synthetic */ C92307f f264136a;

    public C92305d(C92307f fVar) {
        this.f264136a = fVar;
    }

    public final void onItemSelected(int i) {
        SnsMethodCalculate.markStartTimeMs("onItemSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$1");
        C92307f fVar = this.f264136a;
        SnsMethodCalculate.markStartTimeMs("access$get_selectedItem$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        C54219z<C92091c> zVar = fVar.f264141d;
        SnsMethodCalculate.markEndTimeMs("access$get_selectedItem$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        zVar.setValue(C92307f.m116081a(this.f264136a, i));
        SnsMethodCalculate.markEndTimeMs("onItemSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$1");
    }
}
