package kf1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.ArrayList;
import java.util.HashMap;
import sx3.C64197v;
import te3.C49352ez;

/* renamed from: kf1.e4 */
public final class C9696e4 implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ C9765h4 f30102a;

    public C9696e4(C9765h4 h4Var) {
        this.f30102a = h4Var;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        new ArrayList();
        if (i2 == -1) {
            ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            int i3 = 0;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new ArrayList<>(0);
            }
            if (!stringArrayListExtra.isEmpty()) {
                HashMap hashMap = new HashMap();
                C9765h4 h4Var = this.f30102a;
                C49352ez ezVar = h4Var.f30249J;
                String str3 = "";
                if (ezVar == null || (str = ezVar.f133182d) == null) {
                    str = str3;
                }
                hashMap.put("activityId", str);
                hashMap.put("is_fast_share", "0");
                hashMap.put("share_type", "1");
                hashMap.put("enter_sence", h4Var.f30245F);
                StringBuilder sb = new StringBuilder();
                for (T next : stringArrayListExtra) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        String str4 = (String) next;
                        if (i3 == 0) {
                            sb.append(str4);
                        } else {
                            sb.append('#' + str4);
                        }
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "userStr.toString()");
                hashMap.put("share_wx_username", sb4);
                C49352ez ezVar2 = h4Var.f30249J;
                if (!(ezVar2 == null || (str2 = ezVar2.f133179B) == null)) {
                    str3 = str2;
                }
                hashMap.put("resource_id", str3);
                hashMap.put("enter_sence", h4Var.f30245F);
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_CONCERT_TICKET_PAGE_SHARE_SUCC;
                C9765h4 h4Var2 = this.f30102a;
                C8777j5.C8778a.m8607h((C8777j5) c, mVar, hashMap, h4Var2.f30255Q, h4Var2.f30256R, (String) null, 16, (Object) null);
            }
        }
    }
}
