package tu1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import java.util.HashMap;

/* renamed from: tu1.f */
public final class C118527f implements ITPPlayerListener.IOnErrorListener {

    /* renamed from: d */
    public final /* synthetic */ C118522d f354725d;

    public C118527f(C118522d dVar) {
        this.f354725d = dVar;
    }

    public final void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
        String str = this.f354725d.f354709a;
        Log.m105920e(str, "tplayer log " + iTPPlayer + " error " + i + ' ' + i2);
        C118541p pVar = this.f354725d.f354713e;
        if (pVar != null) {
            C118539n nVar = (C118539n) pVar;
            if (nVar.f354751a.f354744e != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, Integer.valueOf(i2));
                hashMap.put("errorType", Integer.valueOf(i));
                hashMap.put(OpenSDKTool4Assistant.EXTRA_ERROR_MSG, "视频加载失败，请重试");
                hashMap.put("errorActionDesc", "重试");
                nVar.f354751a.f354744e.error(String.valueOf(i2), "视频加载失败，请重试", hashMap);
            }
        }
        C115669n.INSTANCE.mo175911u(1414, 1);
    }
}
