package k50;

import android.os.Environment;
import b50.C54407c;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58115i;
import j20.C117292a;
import k50.C60971a;
import m50.C61441e;
import org.json.JSONException;
import org.json.JSONObject;
import z40.C66733d;

/* renamed from: k50.c */
public class C60974c {

    /* renamed from: a */
    public TRTCCloud f173671a;

    /* renamed from: b */
    public TRTCCloudDef.TRTCParams f173672b;

    /* renamed from: c */
    public int f173673c;

    /* renamed from: d */
    public int f173674d = 0;

    /* renamed from: e */
    public int f173675e = 0;

    /* renamed from: f */
    public int f173676f = 0;

    /* renamed from: g */
    public int f173677g = 0;

    /* renamed from: h */
    public C60975a f173678h;

    /* renamed from: i */
    public C58115i f173679i = null;

    /* renamed from: k50.c$a */
    public interface C60975a {
        /* renamed from: c */
        void mo85685c(boolean z);
    }

    static {
        Environment.getExternalStorageDirectory().getPath();
    }

    public C60974c(TRTCCloud tRTCCloud, TRTCCloudDef.TRTCParams tRTCParams, int i) {
        this.f173671a = tRTCCloud;
        this.f173672b = tRTCParams;
        this.f173673c = tRTCParams == null ? 21 : tRTCParams.role;
    }

    /* renamed from: a */
    public void mo85948a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ProviderConstants.API_PATH, "setStereoCaptureStrategy");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("strategy", i);
            jSONObject.put("params", jSONObject2);
            this.f173671a.callExperimentalAPI(jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public void mo85949b(boolean z) {
        C61441e d = C60971a.C60973b.f173670a.mo85947d();
        int i = d.f174728x;
        int i2 = d.f174729y;
        boolean isEqual = Util.isEqual(this.f173679i.f166260g, this.f173672b.userId);
        TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam = new TRTCCloudDef.TRTCVideoEncParam();
        tRTCVideoEncParam.videoResolution = d.f174711d;
        if (!z || !isEqual) {
            tRTCVideoEncParam.videoFps = d.f174712e;
            tRTCVideoEncParam.videoBitrate = d.f174713f;
        } else {
            tRTCVideoEncParam.videoFps = d.f174726v;
            tRTCVideoEncParam.videoBitrate = d.f174727w;
        }
        tRTCVideoEncParam.minVideoBitrate = d.f174714g;
        C54407c cVar = C66733d.f191764b;
        boolean z2 = cVar != null && cVar.mo75205gB();
        if (d.f174724t && !z2) {
            tRTCVideoEncParam.videoResolution = d.f174715h;
            tRTCVideoEncParam.videoFps = d.f174716i;
            tRTCVideoEncParam.videoBitrate = d.f174717j;
            tRTCVideoEncParam.minVideoBitrate = d.f174718n;
        }
        tRTCVideoEncParam.videoResolutionMode = d.f174721q ? 1 : 0;
        if (i == 0 || i2 == 0) {
            this.f173671a.setVideoEncoderParam(tRTCVideoEncParam);
        } else {
            int i3 = tRTCVideoEncParam.videoFps;
            int i4 = tRTCVideoEncParam.videoBitrate;
            int i5 = tRTCVideoEncParam.minVideoBitrate;
            Log.m105925i("MicroMsg.TRTCCloudManager", "setCustomVideoEncoderParam type:%s width:%s height:%s fps:%s bitrate:%s minbitrate:%s", 0, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("streamType", 0);
                    jSONObject.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, i);
                    jSONObject.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, i2);
                    jSONObject.put("videoBitrate", i4);
                    jSONObject.put("minVideoBitrate", i5);
                    jSONObject.put("videoFps", i3);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt(ProviderConstants.API_PATH, "setVideoEncodeParamEx");
                    jSONObject2.put("params", jSONObject);
                    Log.m105925i("MicroMsg.TRTCCloudManager", "setCustomVideoEncoderParam %s", jSONObject2.toString());
                    this.f173671a.callExperimentalAPI(jSONObject2.toString());
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.TRTCCloudManager", "setCustomVideoEncoderParam fail:%s", e.getMessage());
                }
            }
        }
        Log.m105925i("MicroMsg.TRTCCloudManager", "setBigSteam isAudioMode:%s videoFps:%s videoBitrate:%s audioModeFps:%s audioModeBitrate:%s customWidth:%s customHeight:%s isMicGridNineMode: $s", Boolean.valueOf(z), Integer.valueOf(d.f174712e), Integer.valueOf(d.f174713f), Integer.valueOf(d.f174726v), Integer.valueOf(d.f174727w), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z2));
        C60971a aVar = C60971a.C60973b.f173670a;
        C61441e d2 = aVar.mo85947d();
        TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam = new TRTCCloudDef.TRTCNetworkQosParam();
        tRTCNetworkQosParam.controlMode = d2.f174719o;
        tRTCNetworkQosParam.preference = d2.f174720p;
        this.f173671a.setNetworkQosParam(tRTCNetworkQosParam);
        C61441e d3 = aVar.mo85947d();
        TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam2 = new TRTCCloudDef.TRTCVideoEncParam();
        tRTCVideoEncParam2.videoResolution = 100;
        tRTCVideoEncParam2.videoFps = d3.f174712e;
        tRTCVideoEncParam2.videoBitrate = 100;
        tRTCVideoEncParam2.videoResolutionMode = d3.f174721q ? 1 : 0;
        this.f173671a.enableEncSmallVideoStream(false, tRTCVideoEncParam2);
        this.f173671a.setPriorRemoteVideoStreamType(0);
    }

    /* renamed from: c */
    public void mo85950c() {
        C117292a.m165363i(this.f173671a, "com/tencent/mm/live/core/core/trtc/sdkadapter/TRTCCloudManager", "startLocalAudio", "()V", "com/tencent/trtc/TRTCCloud", "startLocalAudio", "()V");
    }
}
