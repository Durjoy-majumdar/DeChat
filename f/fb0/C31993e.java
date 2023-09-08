package fb0;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;
import sf0.C48374j0;
import te3.C51163rv3;
import te3.C77949j3;

/* renamed from: fb0.e */
public class C31993e implements C35141t {
    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        C51163rv3 rv32;
        C31992c cVar;
        C77949j3 j3Var = aVar.f94242a;
        if (j3Var == null || (rv32 = j3Var.f227631h) == null) {
            Log.m105922f("MicroMsg.abtest.AbTestMsgExtension", "[Abtest] AbTestMsgExtension failed, invalid cmdAM");
            return null;
        }
        String g = C48374j0.m53718g(rv32);
        C86709a0.m107535s().mo121142i().mo119676J(328193, g);
        C97853d vx02 = C31999k.vx0();
        vx02.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            vx02.mo137180b(g);
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(328197, (Object) null);
            if (Util.isNullOrNil(str) || ((cVar = vx02.f287021a) != null && !str.equals(cVar.f85183a))) {
                C86709a0.m107535s().mo121142i().mo119676J(328197, vx02.f287021a.f85183a);
                C85801v1 i = C86709a0.m107535s().mo121142i();
                Boolean bool = Boolean.FALSE;
                i.mo119676J(328195, bool);
                C86709a0.m107535s().mo121142i().mo119676J(328194, bool);
                C86709a0.m107535s().mo121142i().mo119676J(328196, bool);
                Log.m105924i("MicroMsg.abtest.AbTestManager", "[cpan] new case id or new case id , reset click value.");
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.abtest.AbTestManager", "[Abtest] updateAbTestCase exception:%s", e.toString());
        }
        Log.m105925i("MicroMsg.abtest.AbTestManager", "[Abtest] update use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        if (C31999k.vx0().mo137179a()) {
            String str2 = C31999k.vx0().f287021a.f85183a;
            Log.m105924i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] startAbTestCase: start abtest click stream");
            String str3 = "TestCaseID:" + str2;
            Log.m105925i("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast:%s", str3);
            if (C31999k.vx0().mo137179a()) {
                Intent intent = new Intent();
                intent.setAction("com.tencent.mm.ui.ACTION_ABTEST");
                intent.putExtra("content", str3);
                MMApplicationContext.getContext().sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
            } else {
                Log.m105924i("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast abtest faild. no test case.");
            }
        }
        return null;
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
