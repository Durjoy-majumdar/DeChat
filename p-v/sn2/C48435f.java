package sn2;

import android.bluetooth.BluetoothAdapter;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTaskForNative;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75590o4;
import java.util.Collection;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87203t;
import p680ru.C101464l;
import sn2.C48438k;
import te3.C49146dh2;
import te3.C49285eh2;
import te3.C49706hh2;

/* renamed from: sn2.f */
public class C48435f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129610d;

    /* renamed from: e */
    public final C47350c f129611e;

    /* renamed from: f */
    public int f129612f;

    /* renamed from: g */
    public long f129613g = 0;

    public C48435f(String str, Collection<C48438k.C48443e> collection, int i, float f, float f2, int i2) {
        int i3 = i;
        float f3 = f;
        float f4 = f2;
        this.f129612f = i3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49146dh2();
        bVar.f127067b = new C49285eh2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/ibeaconboardcast";
        bVar.f127069d = JsApiInstallDownloadTaskForNative.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129611e = a;
        C75590o4 a2 = C75590o4.m90740a();
        String nullAsNil = Util.nullAsNil(a2.f222072i);
        String nullAsNil2 = Util.nullAsNil(a2.f222071h);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        C49146dh2 dh22 = (C49146dh2) a.f127055a.f127080a;
        dh22.f132326d = Util.nullAsNil(str);
        StringBuilder sb = new StringBuilder();
        sb.append("{\"Beacons\":[");
        if (collection != null) {
            int size = collection.size();
            int i4 = 0;
            for (C48438k.C48443e next : collection) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("{\"UUID\":\"");
                sb4.append(next.f129632a);
                sb4.append("\",\"Location\":{\"Major\":");
                sb4.append(next.f129633b);
                sb4.append(",\"Minor\":");
                sb4.append(next.f129634c);
                sb4.append("},\"Distance\":");
                C49146dh2 dh23 = dh22;
                sb4.append(0.0d);
                sb4.append(",\"Extra\":\"\",\"MacAddress\":\"");
                sb4.append(next.f129635d);
                sb4.append("\",\"Rssi\":\"");
                sb4.append(0.0d);
                sb4.append("\",\"MeasurePower\":\"");
                sb4.append(0);
                sb4.append("\"}");
                sb.append(sb4.toString());
                if (i4 < size - 1) {
                    sb.append(",");
                }
                i4++;
                dh22 = dh23;
            }
        }
        C49146dh2 dh24 = dh22;
        int i5 = (defaultAdapter == null || defaultAdapter.getState() != 12 || !MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) ? 1 : 0;
        sb.append("],\"Action\":" + i3 + ",\"LBS\":{\"Latitude\":" + f3 + ",\"Longitude\":" + f4 + ",\"Province\":\"" + nullAsNil + "\",\"City\":\"" + nullAsNil2 + "\"},\"MachineID\":\"" + C87203t.m108273i() + "\",\"ZBBeaconState\":\"" + i5 + "\"}");
        C49146dh2 dh25 = dh24;
        dh25.f132327e = sb.toString();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(collection != null ? collection.size() : 0);
        objArr[1] = dh25.f132327e;
        Log.m105925i("MicroMsg.NetSceneShakeIbeacon", "[oneliang]beaconCollection.size:%d,json:%s", objArr);
        if (i3 == 1) {
            ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2008, f4, f3, i2);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129613g = System.currentTimeMillis();
        this.f129610d = nVar;
        return dispatch(gVar, this.f129611e, this);
    }

    public int getType() {
        return JsApiInstallDownloadTaskForNative.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105925i("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:netId:%s,errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2);
        this.f129610d.onSceneEnd(i4, i5, str2, this);
        long currentTimeMillis = System.currentTimeMillis() - this.f129613g;
        this.f129613g = currentTimeMillis;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(11497, String.valueOf((int) (((double) (currentTimeMillis / 1000)) + 0.5d)), 1, Integer.valueOf((int) this.f129613g));
        String str3 = "parse IBeaconBoardcastRequest json error!";
        C115669n nVar2 = nVar;
        if (i4 == 0 && i5 == 0) {
            Log.m105918d("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:net end ok");
            C47350c cVar = this.f129611e;
            C49285eh2 eh22 = (C49285eh2) cVar.f127056b.f127083a;
            try {
                JSONObject jSONObject = new JSONObject(((C49146dh2) cVar.f127055a.f127080a).f132327e);
                JSONArray jSONArray = jSONObject.getJSONArray("Beacons");
                int length = jSONArray.length();
                JSONObject jSONObject2 = jSONObject.getJSONObject("LBS");
                int i6 = jSONObject.getInt("Action");
                String string = jSONObject2.getString("Latitude");
                String string2 = jSONObject2.getString("Longitude");
                if (length > 0) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(0);
                    String string3 = jSONObject3.getString("UUID");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("Location");
                    int i7 = jSONObject4.getInt("Major");
                    int i8 = jSONObject4.getInt("Minor");
                    C49706hh2 hh22 = eh22.f132926d;
                    if (hh22 == null || hh22.f134655d != 0) {
                        nVar2.mo160131h(12659, 1, Integer.valueOf(length), string3, Integer.valueOf(i7), Integer.valueOf(i8), string, string2, 2, Integer.valueOf(eh22.f132926d.f134655d));
                    } else {
                        String str4 = hh22.f134657f;
                        if (i6 == 1 && str4 != null && !str4.equals("") && new JSONObject(str4).getJSONArray("msgs").length() == 0) {
                            nVar2.mo160131h(12659, 1, Integer.valueOf(length), string3, Integer.valueOf(i7), Integer.valueOf(i8), string, string2, 2, Integer.valueOf(eh22.f132926d.f134655d));
                        }
                    }
                } else {
                    nVar2.mo160131h(12659, 1, Integer.valueOf(length), "", null, null, string, string2, 2, Integer.valueOf(eh22.f132926d.f134655d));
                }
            } catch (JSONException unused) {
                Log.m105920e("MicroMsg.NetSceneShakeIbeacon", str3);
            }
            return;
        }
        String str5 = str3;
        C115669n nVar3 = nVar2;
        Log.m105918d("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:net end not ok");
        try {
            JSONObject jSONObject5 = new JSONObject(((C49146dh2) this.f129611e.f127055a.f127080a).f132327e);
            JSONArray jSONArray2 = jSONObject5.getJSONArray("Beacons");
            int length2 = jSONArray2.length();
            JSONObject jSONObject6 = jSONObject5.getJSONObject("LBS");
            String string4 = jSONObject6.getString("Latitude");
            String string5 = jSONObject6.getString("Longitude");
            if (length2 > 0) {
                JSONObject jSONObject7 = jSONArray2.getJSONObject(0);
                String string6 = jSONObject7.getString("UUID");
                JSONObject jSONObject8 = jSONObject7.getJSONObject("Location");
                nVar3.mo160131h(12659, 1, Integer.valueOf(length2), string6, Integer.valueOf(jSONObject8.getInt("Major")), Integer.valueOf(jSONObject8.getInt("Minor")), string4, string5, 1, Integer.valueOf(i3));
                return;
            }
            nVar3.mo160131h(12659, 1, Integer.valueOf(length2), "", null, null, string4, string5, 1, Integer.valueOf(i3));
        } catch (JSONException unused2) {
            Log.m105920e("MicroMsg.NetSceneShakeIbeacon", str5);
        }
    }
}
