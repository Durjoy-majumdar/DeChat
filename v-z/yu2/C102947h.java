package yu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import sx3.C110818d0;
import yu2.C102923d;
import yu2.C102948i;
import yu2.C102951j;

/* renamed from: yu2.h */
public final class C102947h implements C102951j.C102952a {

    /* renamed from: a */
    public final /* synthetic */ C102923d f303830a;

    public C102947h(C102923d dVar) {
        this.f303830a = dVar;
    }

    /* renamed from: a */
    public void mo142665a(List<C102944e0> list) {
        SnsMethodCalculate.markStartTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$initSnsAlbumAdapterHelper$1");
        C87412m.m108594g(list, "pickerMediaInfoList");
        C102923d dVar = this.f303830a;
        dVar.getClass();
        SnsMethodCalculate.markStartTimeMs("updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        SnsMethodCalculate.markStartTimeMs("updateByDataSetChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if (list.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("updateByDataSetChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        } else {
            dVar.mo142646T5();
            int size = dVar.mo142642P5().size();
            dVar.mo142642P5().addAll(list);
            dVar.notifyItemRangeInserted(size, dVar.mo142642P5().size() - size);
            SnsMethodCalculate.markEndTimeMs("updateByDataSetChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C102923d dVar2 = this.f303830a;
        dVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C102923d.C102926c cVar = dVar2.f303791n;
        SnsMethodCalculate.markEndTimeMs("getMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if (cVar != null) {
            cVar.mo142651a(list);
        }
        long j = C102923d.m136072N5(this.f303830a).isEmpty() ^ true ? ((C102944e0) C110818d0.m150923U(C102923d.m136072N5(this.f303830a))).mo142658a().field_snsId : 0;
        Log.m105918d("MicroMsg.SnsAlbumPickerListAdapter", "PickAdapter getData onLoadDataFinish, curAdapterDataLastSnsId = " + j + " , curLimitSeq = " + this.f303830a.mo142667F4());
        SnsMethodCalculate.markEndTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$initSnsAlbumAdapterHelper$1");
    }

    /* renamed from: b */
    public void mo142666b(String str) {
        SnsMethodCalculate.markStartTimeMs("onUpdateDbMinLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$initSnsAlbumAdapterHelper$1");
        C87412m.m108594g(str, "pullMinLimitSeq");
        C102948i.C102949a G4 = this.f303830a.mo142668G4();
        G4.getClass();
        SnsMethodCalculate.markStartTimeMs("setMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        G4.f303832a = str;
        SnsMethodCalculate.markEndTimeMs("setMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("onUpdateDbMinLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$initSnsAlbumAdapterHelper$1");
    }
}
