package p007bo;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wechat.p326mm.biz.BizDynamicCardMrg;
import di3.C86312j;
import p493do.C86380f;
import p493do.C86382i;
import rx3.C36570n;

/* renamed from: bo.d */
public final class C79727d implements BizDynamicCardMrg.Callback {
    public void onAdServerInfoEvent(String str) {
        Log.m105918d("MicroMsg.BizFlutterDynamicCardHelper", "onAdServerInfoEvent adinfo=" + str);
        if (C0336e.f914a.mo376a() && str != null) {
            ((C86380f) C86312j.m106911c(C86380f.class)).mo120801TY(str);
        }
    }

    public void onDynamicCardInfoEvent(int i, long j, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onDynamicCardInfoEvent dynamicCardType=");
        sb.append(i);
        sb.append(" msgId=");
        sb.append(j);
        sb.append(" frameSetName=");
        sb.append(str);
        sb.append(" frameSetDataSize=");
        sb.append(str2 != null ? Integer.valueOf(str2.length()) : null);
        Log.m105918d("MicroMsg.BizFlutterDynamicCardHelper", sb.toString());
        if (str != null && str2 != null) {
            if (i == 1 && C0336e.f914a.mo376a()) {
                ((C86380f) C86312j.m106911c(C86380f.class)).mo120805bD(j, str, str2);
            }
            if (i == 2) {
                C0336e eVar = C0336e.f914a;
                if (((Boolean) ((C36570n) C0336e.f916c).getValue()).booleanValue()) {
                    ((C86382i) C86312j.m106911c(C86382i.class)).mo120805bD(j, str, str2);
                }
            }
        }
    }
}
