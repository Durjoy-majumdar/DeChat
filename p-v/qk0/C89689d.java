package qk0;

import android.os.ParcelUuid;
import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import rk0.C89999m;

/* renamed from: qk0.d */
public class C89689d {

    /* renamed from: a */
    public String f257957a;

    /* renamed from: b */
    public String f257958b;

    /* renamed from: c */
    public int f257959c;

    /* renamed from: d */
    public LinkedHashMap<Integer, byte[]> f257960d;

    /* renamed from: e */
    public List<ParcelUuid> f257961e;

    /* renamed from: f */
    public String f257962f;

    /* renamed from: g */
    public Map<ParcelUuid, byte[]> f257963g;

    /* renamed from: h */
    public Boolean f257964h;

    public C89689d(String str, String str2) {
        this.f257957a = str;
        this.f257958b = str2;
        this.f257964h = null;
    }

    /* renamed from: a */
    public JSONObject mo124015a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceId", this.f257958b);
        jSONObject.put("name", this.f257957a);
        jSONObject.put("RSSI", this.f257959c);
        Boolean bool = this.f257964h;
        if (bool != null) {
            jSONObject.put("connectable", bool);
        }
        byte[] bArr = new byte[0];
        StringBuilder sb = new StringBuilder();
        LinkedHashMap<Integer, byte[]> linkedHashMap = this.f257960d;
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry next : this.f257960d.entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                byte[] bArr2 = {(byte) (intValue & 255), (byte) ((intValue >> 8) & 255)};
                byte[] bArr3 = (byte[]) next.getValue();
                byte[] bArr4 = new byte[(bArr.length + 2 + bArr3.length)];
                System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
                System.arraycopy(bArr2, 0, bArr4, bArr.length, 2);
                System.arraycopy(bArr3, 0, bArr4, bArr.length + 2, bArr3.length);
                bArr = bArr4;
            }
        }
        sb.append(new String(Base64.encode(bArr, 2)));
        jSONObject.put("advertisData", sb);
        JSONArray jSONArray = new JSONArray();
        List<ParcelUuid> list = this.f257961e;
        if (list != null) {
            for (ParcelUuid uuid : list) {
                jSONArray.put(uuid.getUuid().toString().toUpperCase());
            }
        }
        jSONObject.put("advertisServiceUUIDs", jSONArray);
        jSONObject.put("localName", this.f257962f);
        JSONObject jSONObject2 = new JSONObject();
        Map<ParcelUuid, byte[]> map = this.f257963g;
        if (map != null && map.size() > 0) {
            for (ParcelUuid next2 : this.f257963g.keySet()) {
                jSONObject2.put(next2.getUuid().toString().toUpperCase(), new String(Base64.encode(this.f257963g.get(next2), 2)));
            }
        }
        jSONObject.put("serviceData", jSONObject2);
        return jSONObject;
    }

    public C89689d(ScanResultCompat scanResultCompat) {
        this.f257957a = Util.nullAsNil(scanResultCompat.mo114648a().getName());
        this.f257958b = Util.nullAsNil(scanResultCompat.mo114648a().getAddress());
        this.f257959c = scanResultCompat.f241163f;
        this.f257964h = scanResultCompat.f241165h;
        C89999m mVar = scanResultCompat.f241162e;
        if (mVar != null) {
            this.f257960d = mVar.f258580h;
            this.f257961e = mVar.f258574b;
            this.f257962f = Util.nullAsNil(mVar.f258578f);
            this.f257963g = mVar.f258576d;
            return;
        }
        this.f257962f = "";
    }
}
