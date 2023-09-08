package yu2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: yu2.i */
public abstract class C102948i extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final C13601g f303831d = C36568h.m40985a(C102950b.f303838d);

    /* renamed from: yu2.i$a */
    public static final class C102949a {

        /* renamed from: a */
        public String f303832a = "";

        /* renamed from: b */
        public String f303833b = "";

        /* renamed from: c */
        public boolean f303834c = true;

        /* renamed from: d */
        public long f303835d;

        /* renamed from: e */
        public int f303836e;

        /* renamed from: f */
        public boolean f303837f;
    }

    /* renamed from: yu2.i$b */
    public static final class C102950b extends C87413o implements C32224a<C102949a> {

        /* renamed from: d */
        public static final C102950b f303838d = new C102950b();

        public C102950b() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$mSnsArguments$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$mSnsArguments$2");
            C102949a aVar = new C102949a();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$mSnsArguments$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$mSnsArguments$2");
            return aVar;
        }
    }

    /* renamed from: F4 */
    public final String mo142667F4() {
        SnsMethodCalculate.markStartTimeMs("getLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        C102949a G4 = mo142668G4();
        G4.getClass();
        SnsMethodCalculate.markStartTimeMs("getMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        String str = G4.f303832a;
        SnsMethodCalculate.markEndTimeMs("getMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("getLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        return str;
    }

    /* renamed from: G4 */
    public final C102949a mo142668G4() {
        SnsMethodCalculate.markStartTimeMs("getMSnsArguments", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        C102949a aVar = (C102949a) ((C36570n) this.f303831d).getValue();
        SnsMethodCalculate.markEndTimeMs("getMSnsArguments", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        return aVar;
    }

    /* renamed from: O4 */
    public final String mo142669O4() {
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        C102949a G4 = mo142668G4();
        G4.getClass();
        SnsMethodCalculate.markStartTimeMs("getMUserName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        String str = G4.f303833b;
        SnsMethodCalculate.markEndTimeMs("getMUserName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        return str;
    }

    /* renamed from: g5 */
    public final void mo142670g5(boolean z, String str) {
        SnsMethodCalculate.markStartTimeMs("setCurPageLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        C87412m.m108594g(str, "tips");
        mo142668G4().getClass();
        SnsMethodCalculate.markStartTimeMs("setMIsCurPageLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("setMIsCurPageLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        mo142668G4().getClass();
        SnsMethodCalculate.markStartTimeMs("setMTips", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("setMTips", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("setCurPageLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
    }

    /* renamed from: u5 */
    public final void mo142671u5(long j) {
        SnsMethodCalculate.markStartTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        C102949a G4 = mo142668G4();
        G4.getClass();
        SnsMethodCalculate.markStartTimeMs("getMLimitedID", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        long j2 = G4.f303835d;
        SnsMethodCalculate.markEndTimeMs("getMLimitedID", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        if (0 != j2) {
            SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
            return;
        }
        C102949a G42 = mo142668G4();
        G42.getClass();
        SnsMethodCalculate.markStartTimeMs("setMLimitedID", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        G42.f303835d = j;
        SnsMethodCalculate.markEndTimeMs("setMLimitedID", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        mo142668G4().getClass();
        SnsMethodCalculate.markStartTimeMs("setMCorrectLimitedID", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("setMCorrectLimitedID", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
    }

    /* renamed from: w5 */
    public final void mo142672w5(String str) {
        SnsMethodCalculate.markStartTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        C87412m.m108594g(str, "respMinSeq");
        mo142668G4().getClass();
        SnsMethodCalculate.markStartTimeMs("setMRespMinSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("setMRespMinSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
    }

    /* renamed from: y5 */
    public final void mo142673y5(String str) {
        SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        C87412m.m108594g(str, "name");
        C102949a G4 = mo142668G4();
        G4.getClass();
        SnsMethodCalculate.markStartTimeMs("setMUserName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        G4.f303833b = str;
        SnsMethodCalculate.markEndTimeMs("setMUserName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
    }
}
