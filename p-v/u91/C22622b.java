package u91;

import com.tencent.p014mm.autogen.mmdata.rpt.WaterFallFlowClickRptStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import v91.C22727a;

/* renamed from: u91.b */
public final class C22622b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WaterFallFlowClickRptStruct f65062d;

    /* renamed from: e */
    public final /* synthetic */ C22727a f65063e;

    public C22622b(WaterFallFlowClickRptStruct waterFallFlowClickRptStruct, C22727a aVar) {
        this.f65062d = waterFallFlowClickRptStruct;
        this.f65063e = aVar;
    }

    public final void run() {
        this.f65062d.mo86055o();
        Log.m105924i("HABBYGE-MALI.HellFinderReport", "report[19945]:\nsessionId=" + this.f65062d.f48647d + "\nclickFeedId=" + this.f65062d.f48648e + "\nposition=" + this.f65063e.f65368q + "\nnickName=" + this.f65063e.f65356e + "\nscene=" + this.f65062d.f48649f + "\nupdateTimeMs=" + this.f65062d.f48650g + "\nclickTimeMs=" + this.f65062d.f48651h + "\nitemExposureAreaWeigth=" + this.f65062d.f48652i + "\nscreenExposureAreaWeigth=" + this.f65062d.f48653j + "\nitemDirection=" + this.f65062d.f48654k + "\nitemIndex=" + this.f65062d.f48655l + "\nshotScreenJson=" + this.f65062d.f48656m + "\ncontextId=" + this.f65062d.f48657n + "\nitemBufffer=" + this.f65062d.f48658o + "\nitemArrayIndex=" + this.f65062d.f48659p);
    }
}
