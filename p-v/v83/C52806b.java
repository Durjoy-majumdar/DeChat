package v83;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: v83.b */
public final class C52806b {

    /* renamed from: a */
    public int f147523a;

    /* renamed from: b */
    public boolean f147524b;

    /* renamed from: c */
    public boolean f147525c;

    /* renamed from: d */
    public String f147526d = "";

    /* renamed from: e */
    public float f147527e;

    /* renamed from: f */
    public int f147528f = -1;

    /* renamed from: g */
    public int f147529g = -1;

    /* renamed from: h */
    public float f147530h;

    /* renamed from: i */
    public float f147531i;

    /* renamed from: j */
    public float f147532j;

    /* renamed from: k */
    public String f147533k = "";

    /* renamed from: l */
    public boolean f147534l;

    @JavascriptInterface
    public final String getEnv() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("immersiveMode", this.f147523a);
        jSONObject.put("childView", this.f147524b);
        int i = this.f147528f;
        if (i >= 0 && this.f147529g >= 0) {
            jSONObject.put("fontLevel", i);
            jSONObject.put("fontScale", this.f147529g);
        }
        String str = this.f147526d;
        if (!(str == null || C112551y.m153811k(str))) {
            jSONObject.put("extData", this.f147526d);
        }
        float f = this.f147527e;
        if (f > 0.0f) {
            jSONObject.put("heightPercent", Float.valueOf(f));
        }
        jSONObject.put("isPreload", this.f147534l);
        jSONObject.put("maxHeight", Float.valueOf(this.f147531i));
        jSONObject.put("peekHeight", Float.valueOf(this.f147530h));
        jSONObject.put("currHeight", Float.valueOf(this.f147532j));
        if (!Util.isNullOrNil(this.f147533k)) {
            jSONObject.put("jumperExtInfo", this.f147533k);
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "env.toString()");
        Log.m105924i("MicroMsg.WebViewEnv", "getEnv " + jSONObject2);
        return jSONObject2;
    }
}
