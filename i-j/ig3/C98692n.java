package ig3;

import com.tencent.p014mm.autogen.mmdata.rpt.VideoSendReporterStruct;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import hd0.C98398h0;
import hd0.C98403m0;
import hd0.C98408n0;
import hd0.C98429r0;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import x80.C102578b;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: ig3.n */
public final class C98692n {

    /* renamed from: a */
    public static final C98692n f289404a = new C98692n();

    /* renamed from: b */
    public static final HashMap<String, VideoSendReporterStruct> f289405b = new HashMap<>();

    /* renamed from: ig3.n$a */
    public static final class C98693a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f289406d;

        public C98693a(String str) {
            this.f289406d = str;
        }

        public final void run() {
            C98692n nVar = C98692n.f289404a;
            VideoSendReporterStruct a = C98692n.m128463a(nVar, C98692n.m128464b(nVar, this.f289406d));
            a.f266532k = 2;
            a.mo86054n();
            String str = this.f289406d;
            if (str != null) {
                C98692n.f289405b.remove(str);
            }
        }
    }

    /* renamed from: ig3.n$b */
    public static final class C98694b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f289407d;

        /* renamed from: e */
        public final /* synthetic */ String f289408e;

        /* renamed from: f */
        public final /* synthetic */ long f289409f;

        /* renamed from: g */
        public final /* synthetic */ long f289410g;

        /* renamed from: h */
        public final /* synthetic */ long f289411h;

        /* renamed from: i */
        public final /* synthetic */ boolean f289412i;

        /* renamed from: j */
        public final /* synthetic */ long f289413j;

        public C98694b(String str, String str2, long j, long j2, long j3, boolean z, long j4) {
            this.f289407d = str;
            this.f289408e = str2;
            this.f289409f = j;
            this.f289410g = j2;
            this.f289411h = j3;
            this.f289412i = z;
            this.f289413j = j4;
        }

        public final void run() {
            C98692n nVar = C98692n.f289404a;
            VideoSendReporterStruct b = C98692n.m128464b(nVar, this.f289407d);
            b.f266528g = b.mo86045b("ToUsername", this.f289408e, true);
            b.f266529h = this.f289409f;
            b.f266531j = this.f289410g;
            b.f266530i = this.f289411h;
            b.f266527f = this.f289412i ? 1 : 2;
            b.f266526e = this.f289413j;
            VideoSendReporterStruct a = C98692n.m128463a(nVar, b);
            a.f266532k = 1;
            a.mo86054n();
        }
    }

    /* renamed from: ig3.n$c */
    public static final class C98695c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f289414d;

        /* renamed from: e */
        public final /* synthetic */ long f289415e;

        /* renamed from: f */
        public final /* synthetic */ long f289416f;

        /* renamed from: g */
        public final /* synthetic */ long f289417g;

        /* renamed from: h */
        public final /* synthetic */ boolean f289418h;

        /* renamed from: i */
        public final /* synthetic */ long f289419i;

        /* renamed from: j */
        public final /* synthetic */ String f289420j;

        /* renamed from: n */
        public final /* synthetic */ int f289421n;

        /* renamed from: o */
        public final /* synthetic */ int f289422o;

        public C98695c(String str, long j, long j2, long j3, boolean z, long j4, String str2, int i, int i2) {
            this.f289414d = str;
            this.f289415e = j;
            this.f289416f = j2;
            this.f289417g = j3;
            this.f289418h = z;
            this.f289419i = j4;
            this.f289420j = str2;
            this.f289421n = i;
            this.f289422o = i2;
        }

        public final void run() {
            C98692n nVar = C98692n.f289404a;
            VideoSendReporterStruct b = C98692n.m128464b(nVar, this.f289414d);
            long j = this.f289415e;
            if (j != 0) {
                b.f266529h = j;
            }
            long j2 = this.f289416f;
            if (j2 != 0) {
                b.f266530i = j2;
            }
            long j3 = this.f289417g;
            if (j3 != 0) {
                b.f266531j = j3;
            }
            if (b.f266527f == 0) {
                b.f266527f = this.f289418h ? 1 : 2;
            }
            long j4 = this.f289419i;
            if (j4 != 0) {
                b.f266526e = j4;
            }
            String str = this.f289420j;
            if (str != null) {
                b.f266528g = b.mo86045b("ToUsername", str, true);
            }
            VideoSendReporterStruct a = C98692n.m128463a(nVar, b);
            JSONObject jSONObject = Util.isNullOrNil(a.f266534m) ? new JSONObject() : new JSONObject(a.f266534m);
            jSONObject.put("cdnErrorCode", this.f289421n);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "jsonObject.toString()");
            a.f266534m = a.mo86045b("ExtraInfo", C112551y.m153815o(jSONObject2, ',', ';', false, 4, (Object) null), true);
            a.f266533l = this.f289422o;
            a.f266532k = 3;
            a.mo86054n();
            String str2 = this.f289414d;
            if (str2 != null) {
                C98692n.f289405b.remove(str2);
            }
        }
    }

    /* renamed from: a */
    public static final VideoSendReporterStruct m128463a(C98692n nVar, VideoSendReporterStruct videoSendReporterStruct) {
        nVar.getClass();
        VideoSendReporterStruct videoSendReporterStruct2 = new VideoSendReporterStruct();
        videoSendReporterStruct2.f266528g = videoSendReporterStruct2.mo86045b("ToUsername", videoSendReporterStruct.f266528g, true);
        videoSendReporterStruct2.f266529h = videoSendReporterStruct.f266529h;
        videoSendReporterStruct2.f266525d = videoSendReporterStruct2.mo86045b("SessionId", videoSendReporterStruct.f266525d, true);
        videoSendReporterStruct2.f266531j = videoSendReporterStruct.f266531j;
        videoSendReporterStruct2.f266530i = videoSendReporterStruct.f266530i;
        videoSendReporterStruct2.f266527f = videoSendReporterStruct.f266527f;
        videoSendReporterStruct2.f266526e = videoSendReporterStruct.f266526e;
        videoSendReporterStruct2.f266534m = videoSendReporterStruct2.mo86045b("ExtraInfo", videoSendReporterStruct.f266534m, true);
        return videoSendReporterStruct2;
    }

    /* renamed from: b */
    public static final VideoSendReporterStruct m128464b(C98692n nVar, String str) {
        String str2;
        nVar.getClass();
        VideoSendReporterStruct videoSendReporterStruct = f289405b.get(str);
        if (videoSendReporterStruct == null) {
            videoSendReporterStruct = new VideoSendReporterStruct();
            if (str == null) {
                str2 = "";
            } else {
                str2 = str + System.currentTimeMillis();
            }
            videoSendReporterStruct.f266525d = videoSendReporterStruct.mo86045b("SessionId", str2, true);
            C98408n0 i = C98429r0.m127818i(str);
            String str3 = null;
            if (i != null) {
                String q = Util.isNullOrNil(i.mo137702f()) ? Util.isNullOrNil(i.f288546N) ? C98398h0.Bx0().mo137728q(str) : C98429r0.m127818i(i.f288546N) != null ? C98398h0.Bx0().mo137728q(i.f288546N) : C98398h0.Bx0().mo137728q(str) : i.mo137702f();
                try {
                    str3 = SightVideoJNI.getSimpleMp4InfoVFS(q);
                    Log.m105925i("MicroMsg.VideoSendReporter", "getSimpleMp4Info: %s", str3);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.VideoSendReporter", "getBasicReportData, get video meta fail", e);
                }
                if (str3 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        C7335d c = C86312j.m106911c(C102578b.class);
                        C87412m.m108593f(c, "getService(IPluginVideoC…paceDetector::class.java)");
                        String i3 = ((C102578b) c).mo141938i3(q);
                        if (i3 != null) {
                            JSONObject jSONObject2 = new JSONObject(i3);
                            jSONObject.put("colorRange", jSONObject2.getInt("colorRange"));
                            jSONObject.put("colorStandard", jSONObject2.getInt("colorStandard"));
                            jSONObject.put("colorTransfer", jSONObject2.getInt("colorTransfer"));
                        }
                        jSONObject.put("isH265", C98403m0.m127702b(q));
                        String jSONObject3 = jSONObject.toString();
                        C87412m.m108593f(jSONObject3, "jsonObj.toString()");
                        videoSendReporterStruct.f266534m = videoSendReporterStruct.mo86045b("ExtraInfo", C112551y.m153814n(jSONObject3, ",", ";", false), true);
                    } catch (JSONException e2) {
                        Log.m105921e("MicroMsg.VideoSendReporter", "parse video meta json error", e2);
                    } catch (Exception e3) {
                        Log.m105921e("MicroMsg.VideoSendReporter", "parse video meta json error", e3);
                    }
                }
            }
        }
        f289405b.put(str, videoSendReporterStruct);
        return videoSendReporterStruct;
    }

    /* renamed from: c */
    public final void mo138102c(String str) {
        if (str != null) {
            ((C119157j) C119157j.f356862d).mo183884o(new C98693a(str));
        }
    }

    /* renamed from: d */
    public final void mo138103d(String str, String str2, long j, long j2, long j3, long j4, boolean z) {
        if (str2 != null) {
            ((C119157j) C119157j.f356862d).mo183884o(new C98694b(str2, str, j, j3, j2, z, j4));
        }
    }

    /* renamed from: e */
    public final void mo138104e(String str, String str2, int i, long j, long j2, long j3, long j4, boolean z, int i2) {
        if (str2 != null) {
            ((C119157j) C119157j.f356862d).mo183884o(new C98695c(str2, j, j2, j3, z, j4, str, i2, i));
        }
    }
}
