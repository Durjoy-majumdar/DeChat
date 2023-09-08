package d60;

import a43.C103310i;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import kg3.C76577a;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: d60.t1 */
public final class C58212t1 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C58169j1 f166698d;

    public C58212t1(C58169j1 j1Var) {
        this.f166698d = j1Var;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        yVar.setHasCallbackToQueue(true);
        String str2 = "[cgi-ret]user close mic :" + i + " errCode:" + i2 + " errMsg:" + str;
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", str2);
        if (i == 0 && i2 == 0) {
            ((C103310i) this.f166698d.f166620w).mo143086b("playend", true, 1, true);
            Context context = this.f166698d.f166607g;
            C76912y0.makeText(context, (CharSequence) C76577a.m92166q(context, C0966R.string.g_f), 0).show();
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157185Q.mo74652b();
            this.f166698d.mo82942C0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_HANGUP_SELF", true);
            this.f166698d.f166606f.statusChange(C58124b.C58125b.LIVE_STOP_MIC, bundle);
        }
    }
}
