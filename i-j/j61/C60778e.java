package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52081y8;
import te3.C64824x8;

/* renamed from: j61.e */
public class C60778e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f173108d;

    /* renamed from: e */
    public final C47350c f173109e;

    /* renamed from: f */
    public int f173110f;

    /* renamed from: g */
    public int f173111g;

    /* renamed from: h */
    public List<String> f173112h;

    public C60778e(int i, int i2, List<String> list) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64824x8();
        bVar.f127067b = new C52081y8();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmbackupemojioperate";
        bVar.f127069d = 698;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f173109e = bVar.mo72403a();
        this.f173110f = i;
        this.f173111g = i2;
        this.f173112h = list;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173108d = nVar;
        C64824x8 x8Var = (C64824x8) this.f173109e.f127055a.f127080a;
        x8Var.f186280e = this.f173111g;
        LinkedList<String> linkedList = new LinkedList<>(this.f173112h);
        x8Var.f186279d = linkedList;
        x8Var.f186281f = this.f173110f;
        if (linkedList.size() > 0) {
            Log.m105925i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5 list size:%s", Integer.valueOf(x8Var.f186279d.size()));
            for (int i = 0; i < x8Var.f186279d.size(); i++) {
                Log.m105925i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5:%s", x8Var.f186279d.get(i));
            }
        } else {
            Log.m105924i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "empty md5 list.");
        }
        return dispatch(gVar, this.f173109e, this);
    }

    public int getType() {
        return 698;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN;
        Log.m105925i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i5 == -434) {
            Log.m105928w("MicroMsg.emoji.NetSceneBackupEmojiOperate", "[cpan] batch backup emoji failed. over size.");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            C115669n.INSTANCE.idkeyStat(164, 7, 1, false);
        }
        if (i4 == 0 && i5 == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
            int i6 = this.f173111g;
            if (i6 == 1 || i6 == 4) {
                C115669n.INSTANCE.idkeyStat(164, 5, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(164, 8, 1, false);
            }
        } else {
            int i7 = this.f173111g;
            if (i7 == 1 || i7 == 4) {
                C115669n.INSTANCE.idkeyStat(164, 6, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(164, 9, 1, false);
            }
        }
        this.f173108d.onSceneEnd(i4, i5, str, this);
    }
}
