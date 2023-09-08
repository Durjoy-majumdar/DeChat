package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C60187m5;
import ht1.C60208v1;
import java.util.LinkedList;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import sx3.C64197v;
import te3.C48861bi1;
import te3.C48915bw0;
import te3.C49335eu3;
import te3.C49454fp0;
import te3.C49590gp0;
import te3.C49966ja;
import te3.C50405mi0;

/* renamed from: je1.e2 */
public final class C46516e2 extends C89132b<C49590gp0> {
    public C46516e2(LinkedList<C50405mi0> linkedList) {
        C87412m.m108594g(linkedList, "userList");
        C49454fp0 fp02 = new C49454fp0();
        fp02.f133620d = C46523h2.f125330a.mo71859a(6688);
        fp02.f133621e = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = fp02;
        C49590gp0 gp02 = new C49590gp0();
        gp02.setBaseResponse(new C49966ja());
        bVar.f127067b = gp02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetprivatemsgcontactextinfolist";
        bVar.f127069d = 6688;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Cgi.CgiPrivateMsgContactExtInfo", "CgiPrivateMsgContactExtInfo init userNameList.size = " + linkedList.size());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        LinkedList<C48861bi1> linkedList;
        C49590gp0 gp02 = (C49590gp0) eu32;
        Class cls = C60208v1.class;
        StringBuilder sb = new StringBuilder();
        sb.append("[onCgiBack] errType=");
        sb.append(i);
        sb.append(" errCode=");
        sb.append(i2);
        sb.append(" errMsg=");
        sb.append(str);
        sb.append(", resp: ");
        sb.append(gp02 != null ? C61937h.m72703b(gp02) : " null");
        Log.m105924i("Cgi.CgiPrivateMsgContactExtInfo", sb.toString());
        if (i == 0 && i2 == 0) {
            if (gp02 != null) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ENTER_PERSONAL_MSG_REFRESH_INTERVAL_INT_SYNC, Integer.valueOf(gp02.f134186e));
            }
            if (gp02 != null && (linkedList = gp02.f134185d) != null) {
                int i3 = 0;
                for (T next : linkedList) {
                    int i4 = i3 + 1;
                    byte[] bArr = null;
                    if (i3 >= 0) {
                        C48861bi1 bi12 = (C48861bi1) next;
                        C60187m5 Ff = ((C60208v1) C86312j.m106911c(cls)).mo78700Ff(bi12.f131130d);
                        if (!(Ff instanceof C58969q)) {
                            Ff = null;
                        }
                        C58969q qVar = Ff != null ? (C58969q) Ff : null;
                        if (qVar != null) {
                            C48915bw0 bw02 = new C48915bw0();
                            bw02.f131341d = bi12.f131131e;
                            C48915bw0 bw03 = qVar.field_badgeInfoList;
                            if (bw03 != null) {
                                bArr = bw03.toByteArray();
                            }
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            if (!MD5Util.getMD5String(bArr).equals(MD5Util.getMD5String(bw02.toByteArray())) || qVar.field_rewardTotalAmountInWecoin != bi12.f131132f || qVar.field_interactionCount != bi12.f131133g || qVar.field_follow_Flag != bi12.f131134h) {
                                qVar.field_badgeInfoList = bw02;
                                qVar.field_personalMsgUpdateTime = C31543z5.m39453c();
                                qVar.field_rewardTotalAmountInWecoin = bi12.f131132f;
                                qVar.field_interactionCount = bi12.f131133g;
                                qVar.field_follow_Flag = bi12.f131134h;
                                ((C60208v1) C86312j.m106911c(cls)).Do0(qVar);
                            }
                        }
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
        }
    }
}
