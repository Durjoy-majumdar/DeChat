package b50;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.TXLiveConstants;
import d50.C58111e;
import gy3.C8480h;
import java.util.LinkedList;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: b50.j */
public final class C54424j {

    /* renamed from: a */
    public static final C54424j f152652a = new C54424j();

    /* renamed from: b */
    public static final LinkedList<C58111e> f152653b = new LinkedList<>();

    /* renamed from: c */
    public static long f152654c;

    /* renamed from: a */
    public final synchronized C58111e mo75237a() {
        return (C58111e) C110818d0.m150925W(f152653b);
    }

    /* renamed from: b */
    public final C58111e mo75238b(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        C58111e eVar = r1;
        C58111e eVar2 = new C58111e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (String) null, 0, 0.0f, 0.0f, 0, 0, 0, 0, -1, 7, (C8480h) null);
        long j = 0;
        long j2 = bundle2 != null ? bundle2.getLong("NET_STATUS_START_TIME", 0) : 0;
        C58111e eVar3 = eVar;
        eVar3.f166200a = bundle2 != null ? bundle2.getLong("NET_STATUS_LIVE_ID", 0) : 0;
        int i = 0;
        eVar3.f166201b = bundle2 != null ? bundle2.getInt("NET_STATUS_ROLE", 0) : 0;
        eVar3.f166202c = bundle2 != null ? bundle2.getInt("NET_STATUS_MODE", 0) : 0;
        eVar3.f166204e = bundle2 != null ? bundle2.getInt("NET_STATUS_NET_TYPE", 0) : 0;
        eVar3.f166203d = bundle2 != null ? bundle2.getLong("NET_STATUS_TIMESTAMP", 0) : 0;
        eVar3.f166222w = (int) (j2 / ((long) 1000));
        eVar3.f166220u = System.currentTimeMillis() - j2;
        String string = bundle2 != null ? bundle2.getString(TXLiveConstants.NET_STATUS_CPU_USAGE) : null;
        if (string != null) {
            String str2 = string;
            eVar3.f166194D = (float) Util.safeParseInt((String) C110818d0.m150914L(C112550d0.m153785U(str2, new String[]{"/"}, false, 0, 6, (Object) null)));
            eVar3.f166195E = (float) Util.safeParseInt((String) C110818d0.m150923U(C112550d0.m153785U(str2, new String[]{"/"}, false, 0, 6, (Object) null)));
        }
        eVar3.f166205f = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH) : 0;
        eVar3.f166206g = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT) : 0;
        eVar3.f166207h = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_VIDEO_FPS) : 0;
        eVar3.f166208i = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) : 0;
        eVar3.f166209j = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE) : 0;
        eVar3.f166210k = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE) : 0;
        eVar3.f166211l = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_NET_SPEED) : 0;
        eVar3.f166212m = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE) : 0;
        eVar3.f166213n = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) : 0;
        eVar3.f166214o = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) : 0;
        eVar3.f166215p = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) : 0;
        eVar3.f166216q = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) : 0;
        eVar3.f166217r = (int) (bundle2 != null ? bundle2.getFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD) : 0.0f);
        eVar3.f166218s = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_NET_JITTER) : 0;
        eVar3.f166219t = bundle2 != null ? bundle2.getInt(TXLiveConstants.NET_STATUS_QUALITY_LEVEL) : 0;
        if (bundle2 == null || (str = bundle2.getString(TXLiveConstants.NET_STATUS_SERVER_IP)) == null) {
            str = "";
        }
        eVar3.f166192B = str;
        eVar3.f166225z = bundle2 != null ? bundle2.getInt("NET_STATUS_RTT") : 0;
        eVar3.f166196F = bundle2 != null ? bundle2.getInt("NET_STATUS_UP_LOSS") : 0;
        if (bundle2 != null) {
            i = bundle2.getInt("NET_STATUS_DOWN_LOSS");
        }
        eVar3.f166197G = i;
        eVar3.f166198H = bundle2 != null ? bundle2.getLong("NET_STATUS_SEND_BYTES") : 0;
        if (bundle2 != null) {
            j = bundle2.getLong("NET_STATUS_RECEIVE_BYTES");
        }
        eVar3.f166199I = j;
        return eVar3;
    }
}
