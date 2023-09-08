package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.qn4;
import te3.rn4;

/* renamed from: j61.v */
public class C9283v extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f29038d;

    /* renamed from: e */
    public final C47350c f29039e;

    /* renamed from: f */
    public List<String> f29040f = new ArrayList();

    /* renamed from: g */
    public int f29041g;

    public C9283v(List<String> list, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new qn4();
        bVar.f127067b = new rn4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmuploadmypanellist";
        bVar.f127069d = 717;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f29039e = bVar.mo72403a();
        this.f29040f = list;
        this.f29041g = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29038d = nVar;
        qn4 qn4 = (qn4) this.f29039e.f127055a.f127080a;
        qn4.f140418d = this.f29041g;
        List<String> list = this.f29040f;
        if (list != null) {
            for (String next : list) {
                if (!Util.isNullOrNil(next) && next.equals(String.valueOf(17))) {
                    next = "com.tencent.xin.emoticon.tusiji";
                }
                qn4.f140419e.add(next);
                Log.m105919d("MicroMsg.emoji.NetSceneUploadMyPanelList", "product id is:%s", next);
            }
            Log.m105925i("MicroMsg.emoji.NetSceneUploadMyPanelList", "opcode is:%d mProductIdList size:%s", Integer.valueOf(this.f29041g), Integer.valueOf(this.f29040f.size()));
        }
        return dispatch(gVar, this.f29039e, this);
    }

    public int getType() {
        return 717;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_LONG;
        Log.m105925i("MicroMsg.emoji.NetSceneUploadMyPanelList", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(System.currentTimeMillis()));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_FINISH_BOOLEAN, Boolean.TRUE);
            C115669n.INSTANCE.idkeyStat(165, 0, 1, false);
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf((System.currentTimeMillis() - 86400000) + 3600000));
            C115669n.INSTANCE.idkeyStat(165, 1, 1, false);
        }
        this.f29038d.onSceneEnd(i2, i3, str, this);
    }
}
