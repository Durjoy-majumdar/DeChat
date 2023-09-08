package mj1;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.xweb.file.XVFSFile;
import f50.C58915a;
import f50.C58924d;
import gy3.C87412m;
import java.util.HashMap;
import oj1.C62034b;

/* renamed from: mj1.b */
public final class C61487b {

    /* renamed from: a */
    public static final HashMap<String, C58924d> f174813a = new HashMap<>();

    /* renamed from: mj1.b$a */
    public static final class C61488a extends C58915a {

        /* renamed from: d */
        public final C58924d f174814d;

        /* renamed from: e */
        public final boolean f174815e;

        /* renamed from: f */
        public final C62034b f174816f;

        public C61488a(C58924d dVar, boolean z, C62034b bVar) {
            C87412m.m108594g(dVar, "player");
            C87412m.m108594g(bVar, "data");
            this.f174814d = dVar;
            this.f174815e = z;
            this.f174816f = bVar;
        }

        /* renamed from: a */
        public final void mo86465a(String str) {
            Log.m105924i("AbsTXLivePlayListener", "key: " + this.f174816f.mo86978a() + ' ' + str);
        }

        public void onNetStatus(Bundle bundle) {
        }

        public void onPlayEvent(int i, Bundle bundle) {
            super.onPlayEvent(i, bundle);
            boolean z = true;
            int i2 = 0;
            if (i == -2301) {
                if (NetStatusUtil.getNetType(MMApplicationContext.getContext()) != -1) {
                    z = false;
                }
                mo86465a("onPlayEvent PLAY_ERR_NET_DISCONNECT, non_network:" + z);
            } else if (i == 1007) {
                mo86465a("onPlayEvent PUSH_EVT_FIRST_FRAME_AVAILABLE");
            } else if (i == 2001) {
                StringBuilder sb = new StringBuilder();
                sb.append("onPlayEvent ");
                sb.append(i == 2004 ? "PLAY_EVT_PLAY_BEGIN" : "PLAY_EVT_CONNECT_SUCC");
                mo86465a(sb.toString());
            } else if (i == 2009) {
                int i3 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
                if (bundle != null) {
                    i2 = bundle.getInt("EVT_PARAM2");
                }
                this.f174814d.setRenderMode(this.f174815e ? 1 : 0);
                mo86465a("onPlayEvent PLAY_EVT_CHANGE_RESOLUTION, w:h=" + i3 + XVFSFile.PATH_SEPARATOR_CHAR + i2 + " videoRatioWH:" + ((((float) i3) * 1.0f) / ((float) i2)) + " isLandscape: " + this.f174815e);
            } else if (i == 2033) {
                mo86465a("receive EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME");
            } else if (i == 2103) {
                if (NetStatusUtil.getNetType(MMApplicationContext.getContext()) != -1) {
                    z = false;
                }
                mo86465a("onPlayEvent PLAY_WARNING_RECONNECT, non_network:" + z);
            }
        }
    }
}
