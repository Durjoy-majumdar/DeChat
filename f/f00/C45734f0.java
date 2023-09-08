package f00;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import java.util.Set;
import ke3.C88144b;
import te3.C51173ry;
import te3.i25;
import wx2.C66204d;
import y93.C53513a;

/* renamed from: f00.f0 */
public class C45734f0 implements C66204d.C38350a {
    /* renamed from: D1 */
    public void mo61631D1(MultiTaskInfo multiTaskInfo) {
        Log.m105919d("WvTaskBarEventListener", "onTaskBarItemRemoved, name:%s", multiTaskInfo.field_showData.f183752e);
        C43861d.f118783a.mo68423f(multiTaskInfo);
    }

    /* renamed from: Q0 */
    public void mo61632Q0(MultiTaskInfo multiTaskInfo) {
        Intent intent;
        MultiTaskInfo multiTaskInfo2 = multiTaskInfo;
        Set<String> set = C53513a.f150462A;
        Class cls = C45696d.class;
        i25 i25 = new i25();
        try {
            i25.parseFrom(multiTaskInfo2.field_data);
            String str = multiTaskInfo2.field_id;
            String str2 = i25.f135051e;
            Log.m105925i("MicroMsg.WebMultiTaskHelper", "handleClicked, url:%s", str2);
            int i = i25.f135069z;
            Intent intent2 = new Intent();
            try {
                C51173ry ryVar = new C51173ry();
                ryVar.f141212f = true;
                intent2.putExtra("key_multi_task_common_info", ryVar.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebMultiTaskHelper", e, "onTaskBarItemClicked", new Object[0]);
            }
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151045de(intent2, i25);
            intent2.putExtra("rawUrl", str2);
            intent2.putExtra("minimize_secene", 0);
            intent2.putExtra("float_ball_key", str);
            intent2.putExtra("key_enable_teen_mode_check", true);
            intent2.putExtra("webpageTitle", i25.f135054h);
            if (i > -1) {
                boolean z = i == 5 || i == 16;
                int i2 = i25.f135063t;
                int i3 = i25.f135064u;
                if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(i2)) {
                    intent = intent2;
                    if (((C45696d) C86709a0.m107533q(cls)).Ms0(MMApplicationContext.getContext(), str2, i, z, i2, i3, intent2)) {
                        Log.m105924i("MicroMsg.WebMultiTaskHelper", "openWebPage, use fast Load");
                        return;
                    }
                    C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    C43861d dVar = C43861d.f118783a;
                    C43861d.f118786d.remove(multiTaskInfo2.field_id);
                }
            }
            intent = intent2;
            C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C43861d dVar2 = C43861d.f118783a;
            C43861d.f118786d.remove(multiTaskInfo2.field_id);
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.WebMultiTaskHelper", "WebMultiTaskData parse fail", th);
        }
    }

    /* renamed from: m1 */
    public void mo61633m1(MultiTaskInfo multiTaskInfo) {
        Log.m105919d("WvTaskBarEventListener", "MultiTaskInfo, name:%s", multiTaskInfo.field_showData.f183752e);
        i25 i25 = new i25();
        try {
            i25.parseFrom(multiTaskInfo.field_data);
            int i = i25.f135069z;
            String str = i25.f135051e;
            if (i > -1 && !Util.isNullOrNil(str)) {
                int i2 = i25.f135063t;
                Log.m105919d("WvTaskBarEventListener", "addToPreload, name:%s", multiTaskInfo.field_showData.f183752e);
                ((C45696d) C86709a0.m107533q(C45696d.class)).Tn0(str, i, i2, new Object[0]);
            }
            C43861d.f118783a.mo68422e(multiTaskInfo);
        } catch (Throwable th) {
            Log.m105921e("WvTaskBarEventListener", "WebMultiTaskData parse fail", th);
        }
    }
}
