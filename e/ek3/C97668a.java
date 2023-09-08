package ek3;

import android.os.Bundle;
import aw0.C0225d;
import aw0.C103925l;
import aw0.C79635e;
import aw0.C92162m;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.HashSet;
import java.util.Set;
import uv0.C111237j;

/* renamed from: ek3.a */
public class C97668a extends C105052s implements C97669b {

    /* renamed from: u */
    public static final Set<String> f286473u;

    /* renamed from: v */
    public static boolean f286474v = false;

    /* renamed from: w */
    public static long f286475w = 0;

    /* renamed from: s */
    public String f286476s = "";

    /* renamed from: t */
    public int f286477t = 0;

    static {
        HashSet hashSet = new HashSet();
        f286473u = hashSet;
        hashSet.add("app_type");
        hashSet.add("app_media_id");
        hashSet.add("app_msg_id");
        hashSet.add("app_show_share");
        hashSet.add(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
    }

    public C97668a(C111237j jVar) {
        super(jVar);
    }

    /* renamed from: C0 */
    public void mo136917C0(String str, String str2, int i, boolean z) {
        Log.m105925i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "onCreate, filePath:%s fileExt:%s sence:%s", str, str2, Integer.valueOf(i));
        this.f286476s = str;
        this.f286477t = i;
        mo35648A(4, C79635e.m96715c(str));
        getReportInfo().f311717f = 4;
        getReportInfo().f311716e = this.f286477t;
        mo68414O();
        Bundle bundle = this.f311726d.f311678C;
        if (bundle != null) {
            bundle.putString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
            if (!z) {
                this.f311726d.f311678C.putBoolean("ifAppAttachDownloadUI", false);
                this.f311726d.f311678C.putString("fileExt", str2);
                this.f311726d.f311678C.putInt("sence", Integer.valueOf(i).intValue());
                mo68414O();
            } else if (this.f311808n.getIntent() != null) {
                C0225d.m179c(this.f311808n.getIntent(), this.f311726d.f311678C, f286473u);
                this.f311726d.f311678C.putBoolean("ifAppAttachDownloadUI", true);
                mo68414O();
            }
        }
    }

    /* renamed from: D0 */
    public void mo136918D0(String str, String str2) {
        Boolean bool = C103925l.f307288a;
        Integer a = C92162m.m115833a(str);
        if (a == null) {
            a = C92162m.m115833a("unknown");
        }
        this.f311726d.f311698s = a.intValue();
        if (Util.isNullOrNil(this.f311726d.f311699t)) {
            this.f311726d.f311699t = str2;
        }
        mo68414O();
    }

    /* renamed from: V */
    public boolean mo35650V() {
        return true;
    }

    /* renamed from: f0 */
    public boolean mo35651f0() {
        return Util.isNullOrNil(this.f286476s) || C86013q1.m106450k(this.f286476s);
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105925i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f286476s);
        mo149200z0();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f286476s);
        C111237j jVar = this.f311808n;
        if (jVar != null && jVar.getActivity() != null) {
            this.f311808n.getActivity().finish();
        }
    }
}
