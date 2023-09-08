package it2;

import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.p106ui.album.SnsAlbumUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: it2.e */
public class C98796e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumUI f289644d;

    public C98796e(SnsAlbumUI snsAlbumUI) {
        this.f289644d = snsAlbumUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$6");
        SnsAlbumUI snsAlbumUI = this.f289644d;
        int i = SnsAlbumUI.f279150r;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        boolean z = snsAlbumUI.f279158n;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        if (z) {
            Log.m105928w("MicroMsg.SnsAlbumUI", "too fast that it finish");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$6");
            return;
        }
        SnsAlbumUI snsAlbumUI2 = this.f289644d;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        C5431p1.C5432a aVar = snsAlbumUI2.f279159o;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        aVar.mo6423t(10, SnsAlbumUI.m122527K(this.f289644d), this.f289644d);
        SnsAlbumUI snsAlbumUI3 = this.f289644d;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        C5431p1.C5432a aVar2 = snsAlbumUI3.f279159o;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        String K = SnsAlbumUI.m122527K(this.f289644d);
        SnsAlbumUI snsAlbumUI4 = this.f289644d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        int i2 = snsAlbumUI4.f279157j;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        aVar2.mo6413d(10, K, false, true, i2);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$6");
    }
}
