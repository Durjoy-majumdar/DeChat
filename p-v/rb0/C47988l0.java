package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C75569c4;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49618gw;
import te3.C49759hw;
import te3.C49905iw;
import te3.C49939j34;
import te3.C52054y14;
import te3.f45;

/* renamed from: rb0.l0 */
public class C47988l0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128702d;

    /* renamed from: e */
    public C47350c f128703e;

    public C47988l0(String str, int i, String str2, LinkedList<C49618gw> linkedList, String str3) {
        this(str, i, str2, linkedList, str3, 0, (C52054y14) null, (C49939j34) null);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128702d = nVar;
        return dispatch(gVar, this.f128703e, this);
    }

    public int getType() {
        return 359;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        if (i4 == 0 && i5 == 0) {
            C47350c cVar = this.f128703e;
            C49759hw hwVar = (C49759hw) cVar.f127055a.f127080a;
            C49905iw iwVar = (C49905iw) cVar.f127056b.f127083a;
            if (!(hwVar.f134900d != 10 || hwVar.f134902f == null || iwVar.f135697d == null)) {
                if (((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69771j(hwVar.f134902f) != null) {
                    f45 f45 = iwVar.f135697d;
                    String str2 = hwVar.f134902f;
                    if (f45 == null || Util.isNullOrNil(f45.f133295f) || Util.isNullOrNil(f45.f133294e)) {
                        Log.m105928w("MicroMsg.NetSceneBizClickCommand", "insertReportLocationMsg tips is null");
                    } else {
                        int i6 = f45.f133293d;
                        if (i6 != 1) {
                            Log.m105929w("MicroMsg.NetSceneBizClickCommand", "insertReportLocationMsg %d", Integer.valueOf(i6));
                        } else {
                            String str3 = f45.f133294e;
                            String str4 = f45.f133295f;
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("<sysmsg type=\"");
                            stringBuffer.append("biz_services_mute");
                            stringBuffer.append("\">");
                            stringBuffer.append("<");
                            stringBuffer.append("biz_services_mute");
                            stringBuffer.append(">");
                            stringBuffer.append("<text>");
                            stringBuffer.append("<![CDATA[");
                            stringBuffer.append(str3);
                            stringBuffer.append("]]>");
                            stringBuffer.append("</text>");
                            stringBuffer.append("<link>");
                            stringBuffer.append("<scene>");
                            stringBuffer.append("biz_services_mute");
                            stringBuffer.append("</scene>");
                            stringBuffer.append("<text>");
                            stringBuffer.append("<![CDATA[");
                            stringBuffer.append(str4);
                            stringBuffer.append("]]>");
                            stringBuffer.append("</text>");
                            stringBuffer.append("</link>");
                            stringBuffer.append("</");
                            stringBuffer.append("biz_services_mute");
                            stringBuffer.append(">");
                            stringBuffer.append("</sysmsg>");
                            C72963f4 f4Var = new C72963f4();
                            f4Var.mo108749c3(str2);
                            f4Var.mo108740T2(2);
                            f4Var.setType(10002);
                            f4Var.mo108733M2(C75604z3.m90844p());
                            f4Var.mo108732L2(stringBuffer.toString());
                            C75604z3.m90852x(f4Var);
                        }
                    }
                }
            }
            if (iwVar.f135697d != null) {
                Log.m105919d("MicroMsg.NetSceneBizClickCommand", "onGYNetEnd ClickType=%d", Integer.valueOf(hwVar.f134900d));
            }
        }
        this.f128702d.onSceneEnd(i4, i5, str, this);
    }

    public C47988l0(String str, int i, String str2, LinkedList<C49618gw> linkedList, String str3, int i2, C52054y14 y142, C49939j34 j342) {
        String str4 = str;
        String str5 = str2;
        LinkedList<C49618gw> linkedList2 = linkedList;
        C52054y14 y143 = y142;
        C49939j34 j343 = j342;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49759hw();
        bVar.f127067b = new C49905iw();
        bVar.f127068c = "/cgi-bin/micromsg-bin/clickcommand";
        bVar.f127069d = 359;
        bVar.f127070e = WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED;
        bVar.f127071f = 1000000176;
        C47350c a = bVar.mo72403a();
        this.f128703e = a;
        C49759hw hwVar = (C49759hw) a.f127055a.f127080a;
        hwVar.f134900d = i;
        hwVar.f134901e = str5;
        hwVar.f134902f = str4;
        hwVar.f134903g = C75569c4.m90679l();
        hwVar.f134905i = i2;
        hwVar.f134906j = C19636w0.f55626c;
        hwVar.f134909p = str3;
        if (linkedList2 != null) {
            hwVar.f134904h = linkedList2;
        }
        if (y143 != null) {
            hwVar.f134907n = y143;
            Log.m105919d("MicroMsg.NetSceneBizClickCommand", "SessionStat StayDuration=%d, UnreadCount=%d, UnreadDuration=%d, IndexInSessionList=%d, LatestMsgType=%d, MassSendUnreadCount=%d, TemplateUnreadCount=%d", Integer.valueOf(y143.f145075d), Integer.valueOf(y143.f145077f), Integer.valueOf(y143.f145076e), Integer.valueOf(y143.f145079h), Integer.valueOf(y143.f145078g), Integer.valueOf(y143.f145080i), Integer.valueOf(y143.f145081j));
        }
        if (j343 != null) {
            hwVar.f134908o = j343;
            Log.m105919d("MicroMsg.NetSceneBizClickCommand", "settingPageInfo Scene=%d, IsServiceWuRaoOpen=%d", Integer.valueOf(j343.f135850d), Integer.valueOf(j343.f135851e));
        }
        Log.m105925i("MicroMsg.NetSceneBizClickCommand", "click command : %s, type: %s, info: %s, MsgSource : %s, MsgReport size %d, scene %d", str4, Integer.valueOf(i), str5, hwVar.f134903g, Integer.valueOf(hwVar.f134904h.size()), Integer.valueOf(i2));
    }
}
