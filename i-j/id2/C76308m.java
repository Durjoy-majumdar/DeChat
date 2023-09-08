package id2;

import com.tencent.p014mm.network.C114799u;
import org.json.JSONObject;

/* renamed from: id2.m */
public class C76308m extends C76305i {
    public int getTenpayCgicmd() {
        return 78;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.optString("barcode");
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
    }
}
