package p621nn;

import android.content.Intent;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.plugin.backup.backuppcmove.BackupPcService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C31543z5;
import eb0.C86497v5;
import gy3.C87412m;
import java.util.Map;
import ke3.C88144b;
import ob0.C35136m;
import sf0.C48374j0;
import sf0.C77702q0;

/* renamed from: nn.q */
public class C34922q implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Log.m105924i("MicroMsg.BackupCore.BackupToPc", "sysMsgListener onreceive sysmsg");
        C115669n.INSTANCE.idkeyStat(400, 0, 1, false);
        Map<String, String> parseXml = XmlParser.parseXml(C48374j0.m53718g(aVar.f94242a.f227631h), "sysmsg", (String) null);
        if (C31543z5.m39451a() - (((long) aVar.f94242a.f227635o) * 1000) > 60000) {
            Log.m105920e("MicroMsg.BackupCore.BackupToPc", "notify delaytime > 1min ignore");
            return;
        }
        String str = parseXml.get(".sysmsg.MMBakChatNotify.url");
        String str2 = parseXml.get(".sysmsg.MMBakChatNotify.pcdevicetype");
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.BackupCore.BackupToPc", "MMBakChatNotify url is null");
            return;
        }
        C87412m.m108594g(1, "value");
        StringBuilder sb = new StringBuilder();
        sb.append("reportAndCommit() called with: key = ");
        sb.append("Type");
        sb.append(", value = ");
        sb.append(1);
        sb.append(" stack:");
        int i = C77702q0.f226484a;
        sb.append(new C77702q0.C77703a());
        Log.m105918d("BackupReport", sb.toString());
        Intent intent = new Intent(MMApplicationContext.getContext(), BackupPcService.class);
        Intent createExplicitFromImplicitIntent = Util.createExplicitFromImplicitIntent(MMApplicationContext.getContext(), intent);
        if (createExplicitFromImplicitIntent != null) {
            intent = createExplicitFromImplicitIntent;
        }
        C88144b.m109807y(intent.putExtra("url", str).putExtra("isFromWifi", true).putExtra(MJTextResolver.KEY_DEVICE_NAME, str2));
    }
}
