package p440ap;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import aw0.C0225d;
import aw0.C79635e;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.handoff.model.HandOffFile;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import ek3.C97668a;
import f40.C86709a0;
import j20.C117292a;
import java.util.Set;
import k20.C9556a;
import kr0.C88274h0;
import nj3.C76912y0;
import org.json.JSONObject;
import p262wm.C22921c;
import p646pn.C110234e;
import qo3.C47883u;
import qo3.C77426q;
import xv0.C38857m;

/* renamed from: ap.c */
public class C92048c extends C38857m {
    /* renamed from: G1 */
    public void mo58338G1(BallInfo ballInfo) {
        Set<String> set = C97668a.f286473u;
        if (ballInfo != null && ballInfo.f311678C != null) {
            Log.m105925i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "handleBallInfoClicked, openFile ballInfo:%s", ballInfo);
            Context context = MMApplicationContext.getContext();
            long currentTimeMillis = System.currentTimeMillis();
            C97668a.f286475w = currentTimeMillis;
            if (C97668a.f286475w + 30000 < currentTimeMillis) {
                C86709a0.m107528h();
                C97668a.f286474v = C86709a0.m107535s().mo121147n();
            }
            if (!C97668a.f286474v) {
                C76912y0.m92771j(context, (View) null);
                return;
            }
            boolean z = ballInfo.f311678C.getBoolean("ifAppAttachDownloadUI");
            String string = ballInfo.f311678C.getString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (!C86013q1.m106450k(string)) {
                Log.m105925i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "handleBallInfoClicked() %s not exist", string);
                C77426q qVar = new C77426q(context);
                qVar.mo107606r("");
                qVar.mo107595g(context.getString(C0966R.string.cvo));
                qVar.mo107589a(true);
                qVar.mo107600l((C47883u) null);
                qVar.mo107603o();
                ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149108Z(new BallInfo(4, C79635e.m96715c(string), (JSONObject) null));
            } else if (z) {
                Intent intent = new Intent();
                intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
                C0225d.m178b(intent, ballInfo.f311678C, C97668a.f286473u);
                intent.getExtras().putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 9);
                intent.addFlags(268435456);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/floatball/FilesPageFloatBallHelper", "handleBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/floatball/FilesPageFloatBallHelper", "handleBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                String string2 = ballInfo.f311678C.getString("fileExt");
                String string3 = ballInfo.f311678C.getString("appId");
                String string4 = ballInfo.f311678C.getString(ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
                boolean z2 = ballInfo.f311678C.getBoolean("showMenu");
                ((C92331c) C86312j.m106911c(C92331c.class)).mo58375rt(HandOffFile.fromBallInfo(ballInfo));
                if (Util.isNullOrNil(string4)) {
                    ((C22921c) C86312j.m106911c(C22921c.class)).mo35887bZ(string, string2, 9);
                } else {
                    ((C88274h0) C86312j.m106911c(C88274h0.class)).j30(context, string, string2, string3, z2, string4);
                }
            }
        }
    }

    /* renamed from: H */
    public void mo58339H(BallInfo ballInfo) {
    }

    /* renamed from: c2 */
    public void mo58340c2(BallInfo ballInfo) {
    }
}
