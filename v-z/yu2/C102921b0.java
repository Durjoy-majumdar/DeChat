package yu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import fy3.C32224a;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C101804kv2;
import yu2.C102948i;

/* renamed from: yu2.b0 */
public final class C102921b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerUI f303783d;

    public C102921b0(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303783d = snsAlbumPickerUI;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showLoadingMoreFooter$1");
        if (SnsAlbumPickerUI.m123170J7(this.f303783d)) {
            C102923d K7 = SnsAlbumPickerUI.m123171K7(this.f303783d);
            K7.getClass();
            SnsMethodCalculate.markStartTimeMs("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if (!(!K7.mo142642P5().isEmpty()) || !K7.mo142644R5().mo142674d((C102944e0) C110818d0.m150923U(K7.mo142642P5()))) {
                if (!K7.mo142642P5().isEmpty()) {
                    SnsMethodCalculate.markStartTimeMs("isDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                    C102948i.C102949a G4 = K7.mo142668G4();
                    G4.getClass();
                    SnsMethodCalculate.markStartTimeMs("getMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                    boolean z = G4.f303837f;
                    SnsMethodCalculate.markEndTimeMs("getMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                    SnsMethodCalculate.markEndTimeMs("isDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                    if (!z) {
                        List<C102944e0> P5 = K7.mo142642P5();
                        K7.mo142644R5().getClass();
                        SnsMethodCalculate.markStartTimeMs("createSnsPickerLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                        SnsInfo snsInfo = new SnsInfo();
                        snsInfo.setCreateTime(-4);
                        snsInfo.setTypeFlag(-4);
                        C101804kv2 kv22 = new C101804kv2();
                        kv22.f298689d = "-4";
                        C102944e0 e0Var = new C102944e0(snsInfo, kv22);
                        SnsMethodCalculate.markEndTimeMs("createSnsPickerLoadingInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                        P5.add(e0Var);
                        K7.notifyItemInserted(K7.mo142642P5().size() - 1);
                        C32224a<C13598b0> aVar = K7.f303795r;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        SnsMethodCalculate.markEndTimeMs("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                C32224a<C13598b0> aVar2 = K7.f303795r;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                SnsMethodCalculate.markEndTimeMs("showLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showLoadingMoreFooter$1");
    }
}
