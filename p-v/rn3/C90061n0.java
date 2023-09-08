package rn3;

import com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: rn3.n0 */
public class C90061n0 implements C90049b0 {

    /* renamed from: a */
    public final /* synthetic */ WXStateSceneDataObject f258726a;

    /* renamed from: b */
    public final /* synthetic */ SendAppMessageWrapperUI f258727b;

    public C90061n0(SendAppMessageWrapperUI sendAppMessageWrapperUI, WXStateSceneDataObject wXStateSceneDataObject) {
        this.f258727b = sendAppMessageWrapperUI;
        this.f258726a = wXStateSceneDataObject;
    }

    /* renamed from: a */
    public void mo119879a(String str, boolean z) {
        if (z) {
            SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f258727b;
            WXStateSceneDataObject wXStateSceneDataObject = this.f258726a;
            int i = SendAppMessageWrapperUI.f250361A;
            sendAppMessageWrapperUI.mo119871O7(wXStateSceneDataObject, str, (String) null, false, "");
            return;
        }
        Log.m105920e("MicroMsg.SendAppMessageWrapperUI", "thumb img CDN upload fail!");
        ReportUtil.m84997c(this.f258727b, ReportUtil.m84995a(this.f258727b.getIntent().getExtras(), -1), true, false);
        this.f258727b.finish();
    }
}
