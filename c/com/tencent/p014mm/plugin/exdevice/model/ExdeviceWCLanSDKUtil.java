package com.tencent.p014mm.plugin.exdevice.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Parcelable;
import com.tencent.mapsdk.internal.C113596ci;
import com.tencent.p014mm.autogen.events.ExDeviceLanDeviceStateChangeEvent;
import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.plugin.exdevice.model.C2242s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.xweb.FileReaderHelper;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil */
public class ExdeviceWCLanSDKUtil {

    /* renamed from: a */
    public int f12285a = 0;

    /* renamed from: b */
    public int f12286b = 0;

    /* renamed from: c */
    public C2242s0.C2243a f12287c;

    /* renamed from: d */
    public C2242s0.C2243a f12288d;

    /* renamed from: e */
    public C2242s0.C2243a f12289e;

    /* renamed from: f */
    public C2242s0.C2243a f12290f;

    /* renamed from: g */
    public HashMap<String, byte[]> f12291g = new HashMap<>();

    /* renamed from: h */
    public HashMap<String, Boolean> f12292h = new HashMap<>();

    /* renamed from: i */
    public HashMap<String, String> f12293i = new HashMap<>();

    /* renamed from: j */
    public Context f12294j = null;

    /* renamed from: k */
    public BroadcastReceiver f12295k;

    /* renamed from: l */
    public boolean f12296l = true;

    /* renamed from: m */
    public boolean f12297m = true;

    /* renamed from: n */
    public boolean f12298n = false;

    /* renamed from: o */
    public int f12299o;

    /* renamed from: com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil$LanStateChangeReceiver */
    public class LanStateChangeReceiver extends BroadcastReceiver {
        public LanStateChangeReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction()) && (parcelableExtra = intent.getParcelableExtra("networkInfo")) != null) {
                boolean z = ((NetworkInfo) parcelableExtra).getState() == NetworkInfo.State.CONNECTED;
                Log.m105918d("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "isConnected =" + z);
                ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil = ExdeviceWCLanSDKUtil.this;
                if (exdeviceWCLanSDKUtil.f12297m || exdeviceWCLanSDKUtil.f12296l != z) {
                    ExDeviceLanDeviceStateChangeEvent exDeviceLanDeviceStateChangeEvent = new ExDeviceLanDeviceStateChangeEvent();
                    exDeviceLanDeviceStateChangeEvent.f343555d.f343556a = z;
                    exDeviceLanDeviceStateChangeEvent.publish();
                    ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil2 = ExdeviceWCLanSDKUtil.this;
                    exdeviceWCLanSDKUtil2.f12297m = false;
                    exdeviceWCLanSDKUtil2.f12296l = z;
                }
            }
        }
    }

    public ExdeviceWCLanSDKUtil() {
        this.f12291g.clear();
        this.f12292h.clear();
        this.f12293i.clear();
        this.f12294j = MMApplicationContext.getContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        if (this.f12295k == null) {
            this.f12295k = new LanStateChangeReceiver();
        }
        this.f12294j.registerReceiver(this.f12295k, intentFilter);
        this.f12287c = new C2236h0(this);
        this.f12290f = new C2237i0(this);
        this.f12288d = new C2238j0(this);
        this.f12289e = new C115395k0(this);
    }

    /* renamed from: a */
    public boolean mo2126a(boolean z, String str) {
        if (str == null || !this.f12291g.containsKey(str)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in openOrCloseDevice");
            return false;
        }
        byte[] bArr = this.f12291g.get(str);
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "open device!");
                jSONObject.put(FileReaderHelper.OPEN_FILE_FROM_CMD, WeChatBrands.Business.GROUP_OPEN);
            } else {
                Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "close device!");
                jSONObject.put(FileReaderHelper.OPEN_FILE_FROM_CMD, "close");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("wxmsg_jsapi", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C113596ci.f339982a_, jSONObject2);
            int useWCLanDeviceService = Java2CExDevice.useWCLanDeviceService(bArr, jSONObject3.toString().getBytes());
            this.f12286b = useWCLanDeviceService;
            if (useWCLanDeviceService != 0) {
                Log.m105918d("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "get openOrCloseDevice mCallBackCmdId =" + this.f12286b);
                return true;
            }
            Log.m105920e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "openOrCloseDevice error!");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e, "", new Object[0]);
            Log.m105920e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON encode failed in openOrCloseDevice");
            return false;
        }
    }
}
