package sj0;

import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import kr0.C88267e;
import li0.C88509c;
import org.json.JSONObject;
import p635os.C89291d;
import sj0.C90203b;
import uj0.C90665a;
import vj0.C90807f;
import xj0.C91214a0;
import xj0.C91237o;
import xj0.C91248r;
import xj0.C91251u;
import xj0.C91252v;
import xj0.C91253w;
import xj0.C91255x;

/* renamed from: sj0.f */
public class C90210f extends C90203b {
    public static final int CTRL_INDEX = 666;
    public static final String NAME = "operateGameRecorder";

    /* renamed from: g */
    public final C90202a f258980g = new C90202a();

    /* renamed from: h */
    public C88509c.C88512b f258981h = null;

    /* renamed from: i */
    public String f258982i = null;

    /* renamed from: A */
    public final void mo124449A(C81925i2 i2Var, int i, Map<String, Object> map) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("errCode", 0);
        if (map != null) {
            hashMap.putAll(map);
        }
        i2Var.mo109647a(i, mo115112m("ok", hashMap));
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C88267e eVar = (C88267e) fVar;
        String optString = jSONObject2.optString("operationType");
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: operating game screen recorder: %s json: %s", optString, jSONObject.toString());
        if (((C89291d) C86312j.m106911c(C89291d.class)).Qq0(eVar.getAppId(), eVar.getRuntime().mo113210l1().f239365g).booleanValue()) {
            Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderOperate", "is game living");
            mo124450z(eVar, i, 1, 112, "game is living, not support record now");
        } else if (IXWebBroadcastListener.STAGE_START.equalsIgnoreCase(optString)) {
            C90665a aVar = (C90665a) eVar.mo114341l0().mo116150E0(C90665a.class);
            MagicBrushView c = aVar == null ? null : aVar.mo111251c();
            if (c == null) {
                Log.m105920e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: cannot retrieve magicbrush view!");
                mo124450z(eVar, i, 1, 111, "game view not prepared");
            } else if (!eVar.mo114341l0().f244563P) {
                Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: current game is not in foreground. ignore start!");
                mo124450z(eVar, i, 2, -2, "can not start in background");
            } else {
                C90807f fVar2 = (C90807f) c.getRendererView();
                int surfaceWidth = fVar2.getSurfaceWidth();
                int surfaceHeight = fVar2.getSurfaceHeight();
                int optInt = jSONObject2.optInt("duration");
                int optInt2 = jSONObject2.optInt(V2TXJSAdapterConstants.PUSHER_KEY_FPS);
                int optInt3 = jSONObject2.optInt(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) * 1000;
                int optInt4 = jSONObject2.optInt("gop");
                boolean optBoolean = jSONObject2.optBoolean("hookBgm", true);
                if (eVar.getFileSystem() == null) {
                    Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: not file system");
                    mo124450z(eVar, i, 1, -1, "no file system!");
                    return;
                }
                C90203b.C90205b w = mo124444w(eVar, "src_game_screenrecord.mp4", true);
                C90203b.C90205b w2 = mo124444w(eVar, "src_game_screenrecord_thumb.jpg", true);
                if (w == null || w2 == null) {
                    Log.m105920e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: WAGameJsApiScreenRecorderOperate, alloc file failed");
                    mo124450z(eVar, i, 1, -1, "internal create file failed!");
                    return;
                }
                Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: given duration: %d, fps: %d, bitrate: %d, gop: %d, width: %d, height: %d, srcFileName: %s, srcThumbPath: %s, hookBgm: %b", Integer.valueOf(optInt), Integer.valueOf(optInt2), Integer.valueOf(optInt3), Integer.valueOf(optInt4), Integer.valueOf(surfaceWidth), Integer.valueOf(surfaceHeight), w.f258967a, w2.f258967a, Boolean.valueOf(optBoolean));
                C91214a0 a0Var = new C91214a0();
                a0Var.f261753a = surfaceWidth;
                a0Var.f261754b = surfaceHeight;
                a0Var.f261760h = optInt;
                a0Var.f261757e = optInt2;
                a0Var.f261758f = optInt3;
                a0Var.f261759g = optInt4;
                a0Var.f261755c = w;
                a0Var.f261756d = w2;
                a0Var.f261761i = optBoolean;
                long currentTicks = Util.currentTicks();
                C91237o b = C91237o.m114472b(eVar.getAppId(), eVar);
                f$$d f__d = new f$$d(this, currentTicks, eVar, i);
                f$$e f__e = new f$$e(this, eVar);
                MagicBrushView magicBrushView = b.f261807b.f261763b.get();
                if (magicBrushView == null) {
                    Log.m105928w("MicroMsg.GameRecorderMgr", "hy: view lost");
                    f__d.mo123718a(1, -2, "view lost", (Object) null);
                    return;
                }
                magicBrushView.mo111630b(false, 1, new C91248r(b, f__d, a0Var, f__e, magicBrushView));
            }
        } else if (!"pause".equalsIgnoreCase(optString)) {
            int i3 = i;
            if ("resume".equalsIgnoreCase(optString)) {
                if (!eVar.mo114341l0().f244563P) {
                    Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: current game is not in foreground. ignore resume!");
                    mo124450z(eVar, i, 2, -2, "can not resume in background");
                    return;
                }
                C91237o b2 = C91237o.m114472b(eVar.getAppId(), eVar);
                f$$a f__a = new f$$a(this, eVar, i3);
                b2.getClass();
                Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger resume");
                b2.f261806a.postToWorker(new C91252v(b2, f__a));
            } else if ("abort".equalsIgnoreCase(optString)) {
                C91237o b3 = C91237o.m114472b(eVar.getAppId(), eVar);
                f$$g f__g = new f$$g(this, eVar, i3);
                b3.getClass();
                Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger abort");
                b3.f261806a.postToWorker(new C91255x(b3, f__g));
            } else if ("stop".equalsIgnoreCase(optString)) {
                C91237o b4 = C91237o.m114472b(eVar.getAppId(), eVar);
                f$$f f__f = new f$$f(this, eVar, i3);
                b4.getClass();
                Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger stop");
                b4.f261806a.postToWorker(new C91253w(b4, f__f));
            } else {
                Log.m105921e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: invalid operate type: %s", optString);
                eVar.mo109647a(i3, mo115109j(String.format("fail: not valid operate type: %s", new Object[]{optString})));
            }
        } else if (!eVar.mo114341l0().f244563P) {
            Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: current game is not in foreground. ignore pause!");
            mo124450z(eVar, i, 2, -2, "can not pause in background");
        } else {
            C91237o b5 = C91237o.m114472b(eVar.getAppId(), eVar);
            f$$c f__c = new f$$c(this, eVar, i);
            b5.getClass();
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger pause");
            b5.f261806a.postToWorker(new C91251u(b5, f__c));
        }
    }

    /* renamed from: z */
    public final void mo124450z(C81925i2 i2Var, int i, int i2, int i3, String str) {
        String format = String.format("fail: errType: %d, errCode: %d, errMsg: %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str});
        HashMap hashMap = new HashMap(1);
        hashMap.put("errCode", Integer.valueOf(i3));
        i2Var.mo109647a(i, mo115112m(format, hashMap));
        this.f258980g.mo124441s(i2Var, i3, str);
    }
}
