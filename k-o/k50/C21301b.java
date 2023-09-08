package k50;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: k50.b */
public class C21301b extends TRTCCloudListener {

    /* renamed from: a */
    public WeakReference<C21302d> f60159a;

    public C21301b(C21302d dVar) {
        this.f60159a = new WeakReference<>(dVar);
    }

    public void onAudioEffectFinished(int i, int i2) {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33297q(i, i2);
        }
    }

    public void onConnectOtherRoom(String str, int i, String str2) {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33287I(str, i, str2);
        }
    }

    public void onConnectionLost() {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33292l();
        }
    }

    public void onConnectionRecovery() {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33285D();
        }
    }

    public void onDisConnectOtherRoom(int i, String str) {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33300u(i, str);
        }
    }

    public void onEnterRoom(long j) {
        Log.m105924i("k50.b", "onEnterRoom: elapsed = " + j);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33295o(j);
        }
    }

    public void onError(int i, String str, Bundle bundle) {
        Log.m105924i("k50.b", "onError: errCode = " + i + " errMsg = " + str);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33298s(i, str, bundle);
        }
    }

    public void onExitRoom(int i) {
        Log.m105924i("k50.b", "onExitRoom: reason = " + i);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33283B(i);
        }
    }

    public void onFirstVideoFrame(String str, int i, int i2, int i3) {
        Log.m105924i("k50.b", "onFirstVideoFrame: userId = " + str + " streamType = " + i + " width = " + i2 + " height = " + i3);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33302y(str, i, i2, i3);
        }
    }

    public void onNetworkQuality(TRTCCloudDef.TRTCQuality tRTCQuality, ArrayList<TRTCCloudDef.TRTCQuality> arrayList) {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33284C(tRTCQuality, arrayList);
        }
    }

    public void onRecvCustomCmdMsg(String str, int i, int i2, byte[] bArr) {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33291j(str, i, i2, bArr);
        }
    }

    public void onRecvSEIMsg(String str, byte[] bArr) {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33301w(str, bArr);
        }
    }

    public void onRemoteUserEnterRoom(String str) {
        Log.m105924i("k50.b", "onRemoteUserEnterRoom: userId = " + str);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33303y4(str);
        }
    }

    public void onRemoteUserLeaveRoom(String str, int i) {
        Log.m105924i("k50.b", "onRemoteUserLeaveRoom: userId = " + str + " reason = " + i);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33288Q1(str, i);
        }
    }

    public void onStatistics(TRTCStatistics tRTCStatistics) {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33290h(tRTCStatistics);
        }
    }

    public void onTryToReconnect() {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33286H();
        }
    }

    public void onUserAudioAvailable(String str, boolean z) {
        Log.m105924i("k50.b", "onUserAudioAvailable: userId = " + str + " available = " + z);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33289g(str, z);
        }
    }

    public void onUserSubStreamAvailable(String str, boolean z) {
        Log.m105924i("k50.b", "onUserSubStreamAvailable: userId = " + str + " available = " + z);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33293m(str, z);
        }
    }

    public void onUserVideoAvailable(String str, boolean z) {
        Log.m105924i("k50.b", "onUserVideoAvailable: userId = " + str + " available = " + z);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33294n(str, z);
        }
    }

    public void onUserVoiceVolume(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i) {
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33299t(arrayList, i);
        }
    }

    public void onWarning(int i, String str, Bundle bundle) {
        Log.m105925i("k50.b", "onWarning: %d, warningMsg: %s", Integer.valueOf(i), str);
        C21302d dVar = this.f60159a.get();
        if (dVar != null) {
            dVar.mo33296p(i, str, bundle);
        }
    }
}
