package i72;

import ad0.C0033t;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONObject;

/* renamed from: i72.l */
public class C108389l {
    /* renamed from: a */
    public static void m146840a() {
        Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markCapture");
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(440, 0, 1, false);
        C108392r rVar = C108388k.f324540d;
        if (rVar != null) {
            boolean z = true;
            int i = rVar.f324551a == 1 ? 39 : 36;
            int i2 = rVar.f324557g;
            if (i2 == 720) {
                i++;
            } else {
                if (rVar.f324552b.f267166d >= i2) {
                    z = false;
                }
                if (z) {
                    i += 2;
                }
            }
            nVar.idkeyStat(440, (long) i, 1, false);
        }
    }

    /* renamed from: b */
    public static void m146841b(boolean z, long j) {
        int i;
        int i2;
        int i3;
        Log.m105927v("MicroMsg.MMSightRecorderIDKeyStat", "markCaptureProcessCost isPictureMode %s cost_time %s", Boolean.valueOf(z), Long.valueOf(j));
        C108375b.m146794b().f324448G = j;
        C108375b b = C108375b.m146794b();
        b.getClass();
        C0033t tVar = new C0033t();
        C0033t tVar2 = new C0033t();
        tVar.mo33b("model", b.f324451a + ",");
        tVar.mo33b("apiLevel", b.f324452b + ",");
        tVar.mo33b("memoryClass", b.f324453c + ",");
        tVar.mo33b("totalMemory", b.f324454d + ",");
        tVar.mo33b("maxCpu", b.f324455e + ",");
        tVar.mo33b("screenW", b.f324456f + ",");
        tVar.mo33b("screenH", b.f324457g + ",");
        tVar2.mo33b("model", b.f324451a + ",");
        tVar2.mo33b("apiLevel", b.f324452b + ",");
        tVar2.mo33b("memoryClass", b.f324453c + ",");
        tVar2.mo33b("totalMemory", b.f324454d + ",");
        tVar2.mo33b("maxCpu", b.f324455e + ",");
        tVar2.mo33b("screenW", b.f324456f + ",");
        tVar2.mo33b("screenH", b.f324457g + ",");
        tVar.mo33b("cropx", b.f324462l + ",");
        tVar.mo33b("cropy", b.f324463m + ",");
        tVar.mo33b("previewx", b.f324464n + ",");
        tVar.mo33b("previewy", b.f324465o + ",");
        tVar.mo33b("encoderx", b.f324466p + ",");
        tVar.mo33b("encodery", b.f324467q + ",");
        tVar.mo33b(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, b.f324468r + ",");
        tVar.mo33b("deviceoutfps", b.f324469s + ",");
        tVar.mo33b("recordfps", b.f324470t + ",");
        tVar.mo33b("recordertype", b.f324471u + ",");
        tVar.mo33b("videoBitrate", b.f324472v + ",");
        tVar.mo33b("needRotateEachFrame", b.f324473w + ",");
        tVar.mo33b("isNeedRealtimeScale", b.f324474x + ",");
        tVar.mo33b("resolutionLimit", b.f324475y + ",");
        tVar.mo33b("outfps", b.f324476z + ",");
        tVar.mo33b("recordTime", b.f324442A + ",");
        tVar.mo33b("avgcpu", b.f324443B + ",");
        tVar.mo33b("outx", b.f324444C + ",");
        tVar.mo33b("outy", b.f324445D + ",");
        tVar.mo33b("outbitrate", b.f324446E + ",");
        tVar.mo33b("fileSize", b.f324447F + ",");
        tVar.mo33b("wait2playtime", b.f324448G + ",");
        tVar.mo33b("useback", b.f324449H + ",");
        Intent registerReceiver = MMApplicationContext.getContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            i2 = (intExtra == 2 || intExtra == 5) ? 1 : 0;
            i = registerReceiver.getIntExtra(FirebaseAnalytics.C113379b.LEVEL, -1);
            i3 = registerReceiver.getIntExtra("scale", -1);
        } else {
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        Log.m105925i("MicroMsg.CaptureStatistics", "battery %s %s %s", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3));
        tVar.mo33b("mIsCharging", i2 + ",");
        tVar.mo33b(FirebaseAnalytics.C113379b.LEVEL, i + ",");
        tVar.mo33b("scale", i3 + ",");
        tVar.mo33b("createTime", System.currentTimeMillis() + ",");
        tVar2.mo33b("prewViewlist1", b.f324458h + ",");
        tVar2.mo33b("pictureSize1", b.f324459i + ",");
        tVar2.mo33b("prewViewlist2", b.f324460j + ",");
        tVar2.mo33b("pictureSize2", b.f324461k + ",");
        Log.m105924i("MicroMsg.CaptureStatistics", "report " + tVar.mo34c());
        Log.m105926v("MicroMsg.CaptureStatistics", "report " + tVar2.mo34c());
        C115669n nVar = C115669n.INSTANCE;
        nVar.kvStat(13947, tVar.toString());
        nVar.kvStat(13949, tVar2.toString());
        if (z) {
            nVar.idkeyStat(440, 119, 1, false);
            nVar.idkeyStat(440, 120, j, false);
            C108392r rVar = C108388k.f324540d;
            int i4 = rVar.f324557g;
            if (i4 == 720) {
                nVar.idkeyStat(440, 122, j, false);
                return;
            }
            if (rVar.f324552b.f267166d < i4) {
                nVar.idkeyStat(440, 123, j, false);
            } else {
                nVar.idkeyStat(440, 121, j, false);
            }
        } else {
            nVar.idkeyStat(440, 124, 1, false);
            nVar.idkeyStat(440, 125, j, false);
            if (C108388k.f324540d.f324551a == 1) {
                C115669n nVar2 = nVar;
                long j2 = j;
                nVar2.idkeyStat(440, 127, j2, false);
                nVar2.idkeyStat(440, 131, j2, false);
                return;
            }
            C115669n nVar3 = nVar;
            long j3 = j;
            nVar3.idkeyStat(440, 126, j3, false);
            nVar3.idkeyStat(440, 130, j3, false);
        }
    }

    /* renamed from: c */
    public static void m146842c() {
        Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegInitError");
        C115669n.INSTANCE.idkeyStat(440, 7, 1, false);
    }

    /* renamed from: d */
    public static void m146843d() {
        Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecInitError");
        C115669n.INSTANCE.idkeyStat(440, 8, 1, false);
    }

    /* renamed from: e */
    public static void m146844e() {
        Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecMuxError");
        C115669n.INSTANCE.idkeyStat(440, 31, 1, false);
    }

    /* renamed from: f */
    public static void m146845f() {
        Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecYUVInitError");
        C115669n.INSTANCE.idkeyStat(440, 16, 1, false);
    }

    /* renamed from: g */
    public static void m146846g(String str, int i, int i2) {
        try {
            if (C108388k.f324540d != null) {
                int optInt = new JSONObject(SightVideoJNI.getSimpleMp4InfoVFS(str)).optInt("videoBitrate");
                if (i2 == 1) {
                    if (i == 1) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.idkeyStat(440, 189, (long) optInt, false);
                        nVar.idkeyStat(440, 190, 1, false);
                        return;
                    }
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.idkeyStat(440, 184, (long) optInt, false);
                    nVar2.idkeyStat(440, 185, 1, false);
                } else if (i2 != 2) {
                } else {
                    if (i == 1) {
                        C115669n nVar3 = C115669n.INSTANCE;
                        nVar3.idkeyStat(440, 194, (long) optInt, false);
                        nVar3.idkeyStat(440, 195, 1, false);
                        return;
                    }
                    C115669n nVar4 = C115669n.INSTANCE;
                    nVar4.idkeyStat(440, 199, (long) optInt, false);
                    nVar4.idkeyStat(440, 200, 1, false);
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish error: %s", e.getMessage());
        }
    }
}
