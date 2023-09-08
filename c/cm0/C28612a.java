package cm0;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: cm0.a */
public class C28612a implements C1255d<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("0,");
        C28615c.m38294b().getClass();
        sb.append((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOICE_OFFLINE_RES_IDS_STRING_SYNC, ""));
        String sb4 = sb.toString();
        C28615c.m38294b();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, "0");
        Log.m105925i("MicroMsg.OfflineVoice.IPCLoadPaySpeechDialectConfig", "idsStr:%s  resId:%s", sb4, str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("idsStr", sb4);
        bundle2.putString("resId", str);
        if (gVar != null) {
            gVar.mo894a(bundle2);
        }
    }
}
