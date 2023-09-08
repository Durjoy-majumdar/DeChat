package u73;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C101762bu2;

/* renamed from: u73.c */
public class C101970c {

    /* renamed from: a */
    public int f300214a;

    /* renamed from: b */
    public int f300215b;

    /* renamed from: c */
    public String f300216c;

    /* renamed from: d */
    public long f300217d;

    /* renamed from: e */
    public long f300218e;

    /* renamed from: f */
    public String f300219f;

    /* renamed from: g */
    public boolean f300220g = false;

    /* renamed from: h */
    public String f300221h = null;

    /* renamed from: a */
    public static String m134241a(String str, int i, int i2, boolean z) {
        String str2 = "FTS_BizCacheObj" + i + "-" + i2;
        String str3 = str2 + "-" + LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        return (!z && !new C86009m1(str, str3).mo119967g()) ? str2 : str3;
    }

    /* renamed from: b */
    public String mo141492b() {
        if (this.f300221h == null) {
            this.f300221h = "";
            try {
                JSONArray optJSONArray = new JSONObject(this.f300216c).optJSONObject("data").optJSONObject("hotwords").optJSONArray("items");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(Uri.encode(optJSONArray.optJSONObject(i).optString("hotword")));
                }
                this.f300221h = TextUtils.join("|", arrayList);
            } catch (Exception unused) {
            }
        }
        return this.f300221h;
    }

    /* renamed from: c */
    public boolean mo141493c() {
        return !this.f300220g && !Util.isNullOrNil(this.f300216c) && (System.currentTimeMillis() / 1000) - this.f300218e <= this.f300217d;
    }

    /* renamed from: d */
    public void mo141494d(String str, int i, int i2) {
        C101762bu2 bu22 = new C101762bu2();
        String a = m134241a(str, i, i2, false);
        if (!a.equals(m134241a(str, i, i2, true))) {
            this.f300220g = true;
        }
        C86009m1 m1Var = new C86009m1(str, a);
        byte[] O = C86013q1.m106433O(m1Var.mo119971i(), 0, (int) m1Var.mo119980r());
        if (O != null) {
            try {
                bu22.parseFrom(O);
                this.f300214a = bu22.f297993d;
                this.f300216c = bu22.f297994e;
                this.f300217d = bu22.f297995f;
                this.f300218e = bu22.f297996g;
                this.f300219f = bu22.f297997h;
                this.f300215b = bu22.f297998i;
                Log.m105925i("MicroMsg.WebSearch.BizCacheObj", "load bizCacheFile %s %d", m1Var.mo119971i(), Integer.valueOf(O.length));
            } catch (IOException unused) {
            }
        }
    }
}
