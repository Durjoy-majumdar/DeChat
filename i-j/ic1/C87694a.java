package ic1;

import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import uv0.C111237j;

/* renamed from: ic1.a */
public class C87694a extends C105052s {

    /* renamed from: s */
    public String f253970s = "";

    public C87694a(C111237j jVar) {
        super(jVar);
    }

    /* renamed from: V */
    public boolean mo35650V() {
        return true;
    }

    /* renamed from: f0 */
    public boolean mo35651f0() {
        return Util.isNullOrNil(this.f253970s) || C86013q1.m106450k(this.f253970s);
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105925i("MicroMsg.FilesFloatBall.FavoriteFilePFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f253970s);
        mo149200z0();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.FilesFloatBall.FavoriteFilePFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f253970s);
        C111237j jVar = this.f311808n;
        if (jVar != null && jVar.getActivity() != null) {
            this.f311808n.getActivity().finish();
        }
    }
}
