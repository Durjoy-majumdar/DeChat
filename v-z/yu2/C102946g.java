package yu2;

import com.tencent.p014mm.p136ui.widget.MMNumberCheckbox;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import yu2.C102923d;

/* renamed from: yu2.g */
public final class C102946g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102923d.C102929e f303828d;

    /* renamed from: e */
    public final /* synthetic */ int f303829e;

    public C102946g(C102923d.C102929e eVar, int i) {
        this.f303828d = eVar;
        this.f303829e = i;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$3");
        MMNumberCheckbox y = this.f303828d.mo142655y();
        int i = this.f303829e;
        Util.expandViewTouchArea(y, i, i, i, i);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$3");
    }
}
