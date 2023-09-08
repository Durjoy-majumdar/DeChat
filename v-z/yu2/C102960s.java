package yu2;

import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: yu2.s */
public final class C102960s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerUI f303852d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102960s(SnsAlbumPickerUI snsAlbumPickerUI) {
        super(0);
        this.f303852d = snsAlbumPickerUI;
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$1");
        SnsAlbumPickerUI snsAlbumPickerUI = this.f303852d;
        int i = SnsAlbumPickerUI.f280763B;
        SnsMethodCalculate.markStartTimeMs("access$getMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z = snsAlbumPickerUI.f280766e;
        SnsMethodCalculate.markEndTimeMs("access$getMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (!z && SnsAlbumPickerUI.m123170J7(this.f303852d)) {
            SnsAlbumPickerUI snsAlbumPickerUI2 = this.f303852d;
            SnsMethodCalculate.markStartTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            C5431p1.C5432a aVar = snsAlbumPickerUI2.f280767f;
            SnsMethodCalculate.markEndTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            if (aVar == null) {
                aVar = C94866e1.dy0();
            }
            SnsMethodCalculate.markStartTimeMs("access$setMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI2.f280767f = aVar;
            SnsMethodCalculate.markEndTimeMs("access$setMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsAlbumPickerUI.m123168H7(this.f303852d);
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$1");
        return b0Var;
    }
}
