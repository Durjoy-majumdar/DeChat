package b00;

import android.content.Context;
import android.content.Intent;
import c00.C0405n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import ky2.C10432i;
import te3.C48884bn2;
import te3.uh4;
import u73.C101987v0;
import u73.C52468u0;
import zt3.C119157j;

@C86522b
/* renamed from: b00.w */
public class C0239w extends C86301e implements C0405n {
    public Map<String, String> H80(int i, boolean z, int i2, String str) {
        return C101987v0.m134268b(i, z, i2, str);
    }

    /* renamed from: L8 */
    public void mo273L8(Context context, uh4 uh4, int i) {
        Class cls = C10432i.class;
        if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(context);
            return;
        }
        Intent intent = new Intent();
        try {
            intent.putExtra("key_context", uh4.toByteArray());
        } catch (IOException unused) {
        }
        if (uh4.f64641h == 100203) {
            C43471q.m46986j(context, ".ui.video.fs.TopStoryFSVideoUI", intent, i);
        } else {
            C43471q.m46986j(context, ".ui.video.list.TopStoryListVideoUI", intent, i);
        }
    }

    public Intent O20() {
        Intent intent = new Intent();
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        intent.putExtra("neverGetA8Key", true);
        return intent;
    }

    /* renamed from: Rn */
    public boolean mo275Rn(long j) {
        Log.m105925i("MicroMsg.WebSearch.WebSearchInnerLogic", "rec updateRedDotTimestamp %d", Long.valueOf(j));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SEARCH_REDDOT_LONG, Long.valueOf(j));
        return false;
    }

    /* renamed from: Th */
    public void mo276Th(Context context, uh4 uh4) {
        C101987v0.m134280n(context, uh4);
    }

    /* renamed from: Vw */
    public String mo277Vw(Map<String, String> map) {
        return C101987v0.m134270d(map, 0);
    }

    /* renamed from: ce */
    public void mo278ce() {
        ((C119157j) C119157j.f356862d).mo183879j(new C52468u0(true, false), 0, "WebSearchThread");
    }

    /* renamed from: e */
    public boolean mo279e() {
        return C101987v0.m134276j();
    }

    /* renamed from: hn */
    public Map<String, String> mo280hn(int i, boolean z, int i2) {
        return C101987v0.m134267a(i, z, i2);
    }

    /* renamed from: hr */
    public void mo281hr(Intent intent, int i, boolean z, int i2) {
        intent.putExtra("ftsbizscene", i);
        Map<String, String> a = C101987v0.m134267a(i, z, i2);
        HashMap hashMap = (HashMap) a;
        String e = C101987v0.m134271e(Util.safeParseInt((String) hashMap.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)));
        hashMap.put("sessionId", e);
        intent.putExtra("sessionId", e);
        intent.putExtra("rawUrl", C101987v0.m134270d(a, 0));
        intent.putExtra("ftsType", i2);
    }

    public String lh0(int i) {
        return C101987v0.m134271e(i);
    }

    public float pg0() {
        float p = C76577a.m92165p(MMApplicationContext.getContext());
        if (p == 1.0f || p == 0.8f || p == 1.1f || p == 1.12f || p == 1.125f || p == 1.4f || p == 1.55f || p == 1.65f) {
            return p;
        }
        return 1.0f;
    }

    /* renamed from: tp */
    public C48884bn2 mo284tp() {
        return C101987v0.m134273g();
    }
}
