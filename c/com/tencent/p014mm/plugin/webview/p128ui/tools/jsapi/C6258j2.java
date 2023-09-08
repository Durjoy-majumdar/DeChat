package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.core.C5843f0;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubTempUI;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import java.util.Map;
import lg3.C76697h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.j2 */
public class C6258j2 implements C92411b.C0447b {

    /* renamed from: d */
    public final /* synthetic */ String f23052d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23053e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.j2$a */
    public class C6259a implements DialogInterface.OnClickListener {
        public C6259a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MsgHandler msgHandler = C6258j2.this.f23053e;
            msgHandler.f22688R = false;
            Context context = msgHandler.f22697d;
            if (context != null) {
                LocationUtil.jumpToOpenGps(context);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.j2$b */
    public class C6260b implements DialogInterface.OnClickListener {
        public C6260b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C6258j2.this.f23053e.f22686P.removeCallbacksAndMessages((Object) null);
            MsgHandler msgHandler = C6258j2.this.f23053e;
            msgHandler.f22685N = null;
            msgHandler.f22688R = true;
            msgHandler.mo7210k5(msgHandler.f22698e, "geo_location:fail_gps_closed", (Map<String, Object>) null);
        }
    }

    public C6258j2(MsgHandler msgHandler, String str) {
        this.f23053e = msgHandler;
        this.f23052d = str;
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        return false;
    }

    /* renamed from: u7 */
    public boolean mo489u7(boolean z, float f, float f2, int i, double d, double d2, double d3, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!z) {
            MsgHandler msgHandler = this.f23053e;
            if (msgHandler.f22685N == null) {
                Log.m105928w("MicroMsg.MsgHandler", "is not ok, already callback");
                return false;
            }
            if (!msgHandler.f22687Q && !LocationUtil.isGpsEnable()) {
                MsgHandler msgHandler2 = this.f23053e;
                msgHandler2.f22687Q = true;
                Context context = msgHandler2.f22697d;
                if (context != null) {
                    WebViewStubTempUI.m5972I7(context, msgHandler2.f22715x, false, C76697h.m92348a(context).getString(C0966R.string.fez), C76697h.m92348a(this.f23053e.f22697d).getString(C0966R.string.a3h), C76697h.m92348a(this.f23053e.f22697d).getString(C0966R.string.fyd), C76697h.m92348a(this.f23053e.f22697d).getString(C0966R.string.f7926wf), new C6259a(), new C6260b());
                }
            }
            MsgHandler msgHandler3 = this.f23053e;
            if (msgHandler3.f22687Q && msgHandler3.f22688R) {
                msgHandler3.f22686P.removeCallbacksAndMessages((Object) null);
                MsgHandler msgHandler4 = this.f23053e;
                msgHandler4.f22685N = null;
                msgHandler4.mo7210k5(msgHandler4.f22698e, "geo_location:fail_gps_closed", (Map<String, Object>) null);
            }
            return true;
        }
        MMHandler mMHandler = this.f23053e.f22686P;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        Log.m105927v("MicroMsg.MsgHandler", "doGeoLocation.onGetLocation, fLongitude:%f, fLatitude:%f, locType:%d, speed:%f, accuracy:%f", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2));
        MsgHandler msgHandler5 = this.f23053e;
        C92411b bVar = msgHandler5.f22684M;
        if (bVar != null) {
            bVar.mo126408b(msgHandler5.f22685N);
        }
        MsgHandler msgHandler6 = this.f23053e;
        if (msgHandler6.f22685N == null) {
            Log.m105928w("MicroMsg.MsgHandler", "already callback");
            return false;
        }
        msgHandler6.f22685N = null;
        HashMap hashMap = new HashMap();
        hashMap.put("longitude", Float.valueOf(f));
        hashMap.put("latitude", Float.valueOf(f2));
        hashMap.put(TPReportKeys.Common.COMMON_NETWORK_SPEED, Double.valueOf(d));
        hashMap.put("accuracy", Double.valueOf(d2));
        hashMap.put("type", this.f23052d);
        if (bundle2 != null) {
            hashMap.put("indoor_building_id", bundle2.getString("indoor_building_id"));
            hashMap.put("indoor_building_floor", bundle2.getString("indoor_building_floor"));
            hashMap.put("indoor_building_type", Integer.valueOf(bundle2.getInt("indoor_building_type")));
        }
        C5843f0 f0Var = C5843f0.f22025a;
        if (((Boolean) ((C36570n) C5843f0.f22029e).getValue()).booleanValue()) {
            this.f23053e.f22689S = hashMap;
            Log.m105924i("MicroMsg.MsgHandler", "startGeoLocation cache retValues");
        }
        MsgHandler msgHandler7 = this.f23053e;
        msgHandler7.mo7210k5(msgHandler7.f22698e, "geo_location:ok", hashMap);
        return false;
    }
}
