package sg3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C40363l0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p1054vg.C102189h;
import sf0.C90188n0;
import te3.C50517na2;
import te3.C90428oa2;

/* renamed from: sg3.a */
public class C90198a extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f258964d;

    /* renamed from: e */
    public C11385n f258965e;

    public C90198a(int i) {
        int i2;
        int i3 = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50517na2();
        bVar.f127067b = new C90428oa2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getupdateinfo";
        bVar.f127069d = 113;
        bVar.f127070e = 35;
        bVar.f127071f = 1000000035;
        C47350c a = bVar.mo72403a();
        this.f258964d = a;
        C50517na2 na22 = (C50517na2) a.f127055a.f127080a;
        na22.f138514d = i3;
        na22.f138515e = ChannelUtil.channelId;
        if (10012 == C90188n0.f258950r && (i2 = C90188n0.f258951s) > 0) {
            na22.f138515e = i2;
        }
        if (i3 == 1) {
            C115669n.INSTANCE.idkeyStat(405, 3, 1, true);
        } else if (i3 == 2) {
            C115669n.INSTANCE.idkeyStat(405, 4, 1, true);
        } else if (i3 == 3) {
            C115669n.INSTANCE.idkeyStat(405, 5, 1, true);
        } else if (i3 == 4) {
            C115669n.INSTANCE.idkeyStat(405, 6, 1, true);
        }
        Log.m105925i("MicroMsg.NetSceneGetUpdateInfo", "summerupdate dkchan NetSceneGetUpdateInfo updateType:%d channel:%d release:%d, stack[%s]", Integer.valueOf(na22.f138514d), Integer.valueOf(na22.f138515e), Integer.valueOf(ChannelUtil.channelId), Util.getStack());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f258965e = nVar;
        return dispatch(gVar, this.f258964d, this);
    }

    public int getType() {
        return 11;
    }

    /* renamed from: j1 */
    public C90428oa2 mo124437j1() {
        if (SubCoreSandBox.f248890a) {
            C90428oa2 oa22 = (C90428oa2) this.f258964d.f127056b.f127083a;
            oa22.f259725n = 1;
            oa22.f259726o = HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
            oa22.f259727p = SubCoreSandBox.f248891b ? 1 : 0;
        }
        return (C90428oa2) this.f258964d.f127056b.f127083a;
    }

    /* renamed from: k1 */
    public String mo124438k1() {
        return ((C90428oa2) this.f258964d.f127056b.f127083a).f259719e;
    }

    /* renamed from: l1 */
    public int mo124439l1() {
        return ((C90428oa2) this.f258964d.f127056b.f127083a).f259720f;
    }

    /* renamed from: m1 */
    public String mo124440m1() {
        C90428oa2 oa22 = (C90428oa2) this.f258964d.f127056b.f127083a;
        Log.m105919d("MicroMsg.NetSceneGetUpdateInfo", "summertoken getPatchInfo[%s], stack[%s]", oa22.f259724j, Util.getStack());
        return oa22.f259724j;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105925i("MicroMsg.NetSceneGetUpdateInfo", "summertoken GetUpdateInfo onGYNetEnd errType[%d], errCode[%d], errMsg[%s]", Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (i4 == 0 && i5 == 0) {
            C115669n.INSTANCE.idkeyStat(405, 7, 1, true);
        } else {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(405, 8, 1, true);
            if (i4 == 4) {
                nVar.idkeyStat(405, 9, 1, true);
                if (i5 == -16) {
                    nVar.idkeyStat(405, 10, 1, true);
                } else if (i5 == -17) {
                    nVar.idkeyStat(405, 11, 1, true);
                } else if (i5 == -18) {
                    nVar.idkeyStat(405, 12, 1, true);
                }
            }
        }
        this.f258965e.onSceneEnd(i4, i5, str2, this);
        String m1 = mo124440m1();
        if (m1 != null) {
            C102189h b = C102189h.m134650b(m1);
            if (b != null) {
                int i6 = b.f300888c;
                Log.m105925i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchVersionCode[%d]", Integer.valueOf(i6));
                C86709a0.m107529k().f251779b.mo123460f(new C40363l0(MMApplicationContext.getPackageName(), i6));
                C115669n.INSTANCE.idkeyStat(405, 13, 1, true);
                return;
            }
            Log.m105925i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchInfo is null patchXml[%s]", m1);
            return;
        }
        Log.m105928w("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchXml is null!");
        C115669n.INSTANCE.idkeyStat(405, 14, 1, true);
    }
}
