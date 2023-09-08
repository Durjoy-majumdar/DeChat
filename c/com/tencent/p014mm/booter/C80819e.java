package com.tencent.p014mm.booter;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C30643n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import di3.C86301e;
import ei3.C86522b;
import lj2.C88544a;
import p156gj.C87200o;
import qe3.C89625d;
import sf0.C90188n0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.booter.e */
public class C80819e extends C86301e implements C30643n {
    public void onCreate(Context context) {
        C80814d b = C80814d.m98665b(context);
        C80820e0 e0Var = new C80820e0(b);
        b.mo112570e("MM");
        C90188n0.f258956x = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.use_cdn_down_thumb"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.display_errcode"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.display_msgstate"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.network.simulate_fault"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.network.force_touch"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.crashIsExit"), false);
        Util.getInt(Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.datatransfer.times"), "0"), 0);
        Util.getInt(Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.datatransfer.duration"), "0"), 0);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.album_drop_table"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.album_dle_file"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.album_show_info"), false);
        C90188n0.f258933a = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.location_help"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.force_soso"), false);
        C90188n0.f258935c = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.simulatePostServerError"), false);
        C90188n0.f258936d = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
        C90188n0.f258938f = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.filterfpnp"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.testForPull"), false);
        int nullAs = Util.nullAs(e0Var.f237574a.mo112568c(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
        C90188n0.f258937e = nullAs;
        if (nullAs != 4 && nullAs > 0) {
            Log.m105920e("MicroMsg.WorkerDebugger", "cdn thread num " + C90188n0.f258937e);
        }
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
        C90188n0.f258939g = Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.server.host.http"), "");
        Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.server.host.socket"), "");
        if (Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.show_full_version"), false)) {
            ChannelUtil.fullVersionInfo = true;
        }
        try {
            int intValue = Integer.decode(e0Var.mo112566b(".com.tencent.mm.debug.log.setversion")).intValue();
            C89625d.m112062c(intValue);
            Integer.toHexString(intValue);
        } catch (Exception unused) {
            Log.m105924i("MicroMsg.WorkerDebugger", "no debugger was got");
        }
        try {
            String b2 = e0Var.mo112566b(".com.tencent.mm.debug.log.setapilevel");
            if (!Util.isNullOrNil(b2)) {
                C87200o.f252868a = "android-" + b2;
                C87200o.f252872e = "android-" + b2;
                C87200o.f252873f = "" + b2;
                CrashReportFactory.setDebugerApiLevel(b2);
                int i = C89625d.f257835a;
                CrashReportFactory.getDebugerApiLevel();
            }
        } catch (Exception unused2) {
            Log.m105924i("MicroMsg.WorkerDebugger", "no debugger was got");
        }
        try {
            C89625d.f257840f = Long.decode(e0Var.mo112566b(".com.tencent.mm.debug.log.setuin")).longValue();
        } catch (Exception unused3) {
            Log.m105924i("MicroMsg.WorkerDebugger", "no debugger was got");
        }
        try {
            e0Var.f237574a.f237576a = Integer.decode(e0Var.mo112566b(".com.tencent.mm.debug.log.setchannel")).intValue();
        } catch (Exception unused4) {
            Log.m105924i("MicroMsg.WorkerDebugger", "no debugger was got");
        }
        try {
            boolean nullAs2 = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean nullAs3 = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.report.kvstat"), false);
            Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.report.clientpref"), false);
            Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.report.useraction"), false);
            C88544a.f255754a = nullAs2;
            C88544a.f255755b = nullAs3;
        } catch (Exception unused5) {
            Log.m105924i("MicroMsg.WorkerDebugger", "no debugger was got");
        }
        C90188n0.f258940h = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.update_test"), false);
        WeChatSomeFeatureSwitch.isDeviceTypeTablet = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.tablet"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.scan_save_image"), false);
        C90188n0.f258942j = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.shake_get_config_list"), false);
        C90188n0.f258943k = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.test.shake_show_shaketv"), false);
        C90188n0.f258945m = Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.jsapi.permission"), "");
        Log.m105918d("MicroMsg.WorkerDebugger", "Test.jsapiPermission = " + C90188n0.f258945m);
        C90188n0.f258908B = Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.cdn.front"), "");
        Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.cdn.zone"), "");
        Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.cdn.wifi_elt"), "");
        Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.cdn.nowifi_elt"), "");
        Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.cdn.ptl"), "");
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.cdn.usestream"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.cdn.onlysendetl"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.cdn.onlysendptl"), false);
        C90188n0.f258910D = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.cdn.enable_debug"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.cdn.enable_conn_verify"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.cdn.enable_video_redirect_oc"), false);
        C90188n0.f258913G = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.bakmove_hardcode"), false);
        Log.m105918d("MicroMsg.WorkerDebugger", "Test.bakmove_hardcode = " + C90188n0.f258913G);
        Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.bakmove_ip"), "");
        Util.getInt(Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.bakmove_port"), "0"), 0);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.cursormode_enabled"), true);
        C90188n0.f258930X = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.disaster_ignore_interval"), false);
        C90188n0.f258931Y = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.disaster_ignore_expire"), false);
        C90188n0.f258932Z = Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.disaster_ignore_remove"), false);
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.netscene_sniffer.enable_snapshot"), false);
        Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.netscene_sniffer.snapshot_protocal"), "");
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.netscene_sniffer.enable_inject"), false);
        Util.nullAs(e0Var.mo112566b(".com.tencent.mm.debug.netscene_sniffer.inject_protocal"), "");
        Util.nullAs(e0Var.mo112565a(".com.tencent.mm.debug.netmock"), false);
    }
}
