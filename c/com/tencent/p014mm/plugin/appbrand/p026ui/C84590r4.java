package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.os.Build;
import bm3.C0329a;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f40.C86718e;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p385u2.C111105a;
import rx3.C13598b0;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/r4;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.r4 */
final class C84590r4 implements C1255d<IPCVoid, IPCBoolean> {
    public void invoke(Object obj, C1256g gVar) {
        Activity j;
        T t;
        boolean z;
        IPCVoid iPCVoid = (IPCVoid) obj;
        if (C86718e.m107551r() || C86718e.f251748x) {
            Log.m105924i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "checkIfNeedManualLogin account hold, return true");
        } else {
            Log.m105924i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "checkIfNeedManualLogin fallback return true");
        }
        C0329a aVar = (C0329a) C86709a0.m107533q(C0329a.class);
        boolean z2 = true;
        if (aVar != null && (j = aVar.mo372j()) != null) {
            if (IntentUtil.getBooleanExtra(j.getIntent(), "Intro_Switch", false)) {
                Log.m105924i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "handleRequest LauncherUI ConstantsUI.Intro.KSwitch==true");
            } else {
                try {
                    Object d = C111105a.m151502d(j, ActivityManager.class);
                    C87412m.m108591d(d);
                    List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) d).getRunningTasks(100);
                    C87412m.m108593f(runningTasks, "getSystemService(this, A…a)!!.getRunningTasks(100)");
                    Iterator<T> it = runningTasks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) t;
                        if ((Build.VERSION.SDK_INT >= 29 ? runningTaskInfo.taskId : runningTaskInfo.id) == j.getTaskId()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    ActivityManager.RunningTaskInfo runningTaskInfo2 = (ActivityManager.RunningTaskInfo) t;
                    if (runningTaskInfo2 != null) {
                        String[] strArr = {"LoginHistoryUI", "AccountExpiredUI", "LoginSmsUI", "LoginPasswordUI", "LoginVoiceUI", "LoginFaceUI"};
                        int i = 0;
                        while (i < 6) {
                            String str = strArr[i];
                            ComponentName componentName = runningTaskInfo2.topActivity;
                            String className = componentName != null ? componentName.getClassName() : null;
                            if (className == null) {
                                className = "";
                            }
                            if (C112551y.m153808h(className, str, false, 2, (Object) null)) {
                                Log.m105924i("MicroMsg.AppBrandUIAccountReleaseHandler.ICPCheckIfStartLoginUITask", "handleRequest " + str + " already present");
                            } else {
                                i++;
                            }
                        }
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                } catch (Exception unused) {
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
            }
            z2 = false;
            break;
        }
        if (gVar != null) {
            gVar.mo894a(new IPCBoolean(z2));
        }
    }
}
