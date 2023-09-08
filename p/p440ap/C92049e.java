package p440ap;

import android.content.Context;
import android.content.Intent;
import ba2.C39749d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ik3.C87750b;
import ik3.C98700c;
import j20.C117292a;
import java.util.Set;
import k20.C9556a;
import kr0.C88274h0;
import p262wm.C22921c;
import qo3.C47883u;
import qo3.C77426q;
import te3.C101828pe0;
import te3.C51173ry;
import vx2.C37860g;
import wx2.C66204d;
import zt3.C119157j;

/* renamed from: ap.e */
public class C92049e implements C66204d.C38350a {
    /* renamed from: D1 */
    public void mo61631D1(MultiTaskInfo multiTaskInfo) {
    }

    /* renamed from: Q0 */
    public void mo61632Q0(MultiTaskInfo multiTaskInfo) {
        MultiTaskInfo multiTaskInfo2 = multiTaskInfo;
        Set<String> set = C98700c.f289434x;
        if (multiTaskInfo2.field_data != null) {
            Context context = MMApplicationContext.getContext();
            if (!C98700c.m128469Z()) {
                ((C119157j) C119157j.f356862d).mo183895z(new C87750b(context));
                return;
            }
            C101828pe0 pe02 = new C101828pe0();
            try {
                pe02.parseFrom(multiTaskInfo2.field_data);
            } catch (Throwable unused) {
                Log.m105920e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "FileMultiTaskData parse error");
            }
            String str = pe02.f299161e;
            if (!C86013q1.m106450k(str)) {
                C77426q qVar = new C77426q(context);
                qVar.mo107606r("");
                qVar.mo107595g(context.getString(C0966R.string.cvo));
                qVar.mo107589a(true);
                qVar.mo107600l((C47883u) null);
                qVar.mo107603o();
                ((C37860g) C86312j.m106911c(C37860g.class)).mo61365E1(multiTaskInfo2.field_id, true, 0);
                return;
            }
            C51173ry ryVar = new C51173ry();
            ryVar.f141212f = true;
            if (pe02.f299160d) {
                Intent intent = new Intent();
                intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
                C39749d.m42534a(intent, pe02);
                try {
                    intent.putExtra("key_multi_task_common_info", ryVar.toByteArray());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", e, "onTaskBarItemClicked", new Object[0]);
                }
                intent.getExtras().putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 12);
                intent.addFlags(268435456);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/multitask/FilesPageMultiTaskHelper", "onTaskBarItemClicked", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/multitask/FilesPageMultiTaskHelper", "onTaskBarItemClicked", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            String str2 = pe02.f299162f;
            String str3 = pe02.f299163g;
            boolean z = pe02.f299166j;
            String str4 = pe02.f299164h;
            if (!Util.isNullOrNil(str4)) {
                ((C88274h0) C86312j.m106911c(C88274h0.class)).j30(context, str, str2, str3, z, str4);
            } else if (((C22921c) C86312j.m106911c(C22921c.class)).ap0(str, str2, multiTaskInfo.mo80305m2().f183752e, 12, ryVar)) {
                Intent intent2 = new Intent();
                intent2.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
                C39749d.m42534a(intent2, pe02);
                intent2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 12);
                intent2.addFlags(268435456);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                Context context3 = context;
                C117292a.m165358d(context3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/multitask/FilesPageMultiTaskHelper", "onTaskBarItemClicked", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context3, "com/tencent/mm/ui/chatting/multitask/FilesPageMultiTaskHelper", "onTaskBarItemClicked", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: m1 */
    public void mo61633m1(MultiTaskInfo multiTaskInfo) {
    }
}
