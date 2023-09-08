package hm3;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.matrix.ManualDumpActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import z04.C112550d0;

/* renamed from: hm3.h */
public final class C32963h extends C32951a {

    /* renamed from: d */
    public static final C32963h f89563d = new C32963h();

    /* renamed from: e */
    public static final C32965j<String>[] f89564e = {C32966k.m39900b("MiuiDecorCaptionView"), C32966k.m39900b("InputMethodManager"), C32966k.m39900b("mCastProjectionCallbacks"), C32966k.m39900b("OppoGestureAreaDetection"), C32966k.m39900b("com.huawei.android.hwaps.EventAnalyzed"), C32966k.m39900b("android.view.WindowManagerGlobal"), C32966k.m39900b("android.view.accessibility.AccessibilityManager"), C32966k.m39900b("com.android.internal.widget.FtMainPanelLayout"), C32966k.m39900b("Longshot"), C32966k.m39900b("com.huawei.imax.intercept.cfg.WebViewDumperCfg"), C32966k.m39900b("com.huawei.contentsensor.agent.ContentSensorManager"), C32966k.m39900b("com.huawei.imax.intercept.dumper.WeChatDumper"), C32966k.m39900b("com.huawei.imax.intercept.ContentInterceptor"), C32966k.m39900b("MiuiPhoneWindow"), C32966k.m39900b("com.huawei.uifirst.smartslide.HighFreqSmartSlideModel"), C32966k.m39900b("com.mediatek.boostfwk.identify.scroll.ScrollIdentify"), C32966k.m39900b("com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin"), C32966k.m39900b("ActivityClientRecord"), C32966k.m39900b("Oplus")};

    /* renamed from: c */
    public String mo58887c() {
        return ManualDumpActivity.class.getName();
    }

    /* renamed from: d */
    public final void mo58892d(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        C87412m.m108594g(str5, "activityName");
        C87412m.m108594g(str6, "refKey");
        C87412m.m108594g(str7, "hprofPath");
        C87412m.m108594g(str8, "refChain");
        if (TextUtils.isEmpty(str4)) {
            Log.m105920e("MicroMsg.MatrixResPluginManualDu", "refChain is empty");
            return;
        }
        C32965j<String>[] jVarArr = f89564e;
        ArrayList arrayList = new ArrayList();
        int length = jVarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= length) {
                break;
            }
            C32965j<String> jVar = jVarArr[i];
            if (System.currentTimeMillis() >= jVar.f89568b) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(jVar);
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C112550d0.m153803w(str8, (CharSequence) ((C32965j) it.next()).f89567a, false, 2, (Object) null)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            Log.m105920e("MicroMsg.MatrixResPluginManualDu", "match white list, skip show Activity");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(EnvConsts.ACTIVITY_MANAGER_SRVNAME, str5);
        intent.putExtra("ref_key", str6);
        intent.putExtra("leak_process", MMApplicationContext.getProcessName());
        intent.putExtra("hprof_path", str7);
        intent.putExtra("leak_detail", str8);
        f89563d.mo58886b(intent);
    }
}
