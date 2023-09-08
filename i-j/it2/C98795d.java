package it2;

import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.album.SnsAlbumUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: it2.d */
public class C98795d extends C9257a {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumUI f289643d;

    public C98795d(SnsAlbumUI snsAlbumUI) {
        this.f289643d = snsAlbumUI;
    }

    /* renamed from: a */
    public void mo10033a() {
        SnsMethodCalculate.markStartTimeMs("onLoadMore", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$5");
        Log.m105918d("MicroMsg.SnsAlbumUI", "onLoadMore");
        SnsAlbumUI snsAlbumUI = this.f289643d;
        int i = SnsAlbumUI.f279150r;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        C5431p1.C5432a aVar = snsAlbumUI.f279159o;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        String K = SnsAlbumUI.m122527K(this.f289643d);
        SnsAlbumUI snsAlbumUI2 = this.f289643d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        int i2 = snsAlbumUI2.f279157j;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        aVar.mo6414e(10, K, false, true, i2);
        MMHandler ly02 = C94866e1.ly0();
        SnsAlbumUI snsAlbumUI3 = this.f289643d;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        Runnable runnable = snsAlbumUI3.f279161q;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        ly02.postDelayed(runnable, 3000);
        SnsMethodCalculate.markEndTimeMs("onLoadMore", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$5");
    }
}
