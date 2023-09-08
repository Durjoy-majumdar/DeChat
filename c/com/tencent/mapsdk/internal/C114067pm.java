package com.tencent.mapsdk.internal;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.pm */
public final class C114067pm extends AsyncTask<Object, Void, Void> {

    /* renamed from: a */
    public static final int f341314a = 10000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Handler f341315b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f341316c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f341317d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C26874c f341318e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TencentMap.OnAuthResultCallback f341319f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C114071b f341320g;

    /* renamed from: h */
    private Handler f341321h = new Handler(Looper.myLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 10000) {
                new C114067pm(C114067pm.this.f341315b, C114067pm.this.f341316c, C114067pm.this.f341317d, C114067pm.this.f341318e, C114067pm.this.f341319f).execute(new Object[0]);
            }
        }
    };

    /* renamed from: com.tencent.mapsdk.internal.pm$c */
    public interface C26874c {
        /* renamed from: a */
        void mo54066a(C114071b bVar);
    }

    /* renamed from: com.tencent.mapsdk.internal.pm$a */
    public enum C114070a {
        NETWORK_ERROR(1000),
        INTERNAL_ERROR(1001);
        

        /* renamed from: c */
        public final int f341328c;

        private C114070a(int i) {
            this.f341328c = i;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.pm$b */
    public static class C114071b implements JsonParser {

        /* renamed from: a */
        public C113735fr f341329a;

        /* renamed from: b */
        public JSONArray f341330b;

        /* renamed from: c */
        public JSONObject f341331c;

        /* renamed from: d */
        public C114080pr f341332d;

        /* renamed from: e */
        public int f341333e = C114141rg.f341663c;

        public void parse(JSONObject jSONObject) {
            JSONObject optJSONObject;
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("cfg")) != null) {
                this.f341330b = optJSONObject.optJSONObject("custom_map_style").optJSONArray("style_list");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("indoor_map");
                if (optJSONObject2 != null) {
                    int optInt = optJSONObject2.optInt("enable", -1);
                    int optInt2 = optJSONObject2.optInt("type", -1);
                    if (!(optInt == -1 || optInt2 == -1)) {
                        this.f341329a = new C113735fr(optInt, optInt2, optJSONObject2.optJSONArray("building_list"));
                    }
                }
                JSONObject optJSONObject3 = optJSONObject.optJSONObject("custom_layer");
                if (optJSONObject3 != null) {
                    this.f341332d = (C114080pr) JsonUtils.parseToModel(optJSONObject3, C114080pr.class, new Object[0]);
                }
                JSONObject optJSONObject4 = optJSONObject.optJSONObject("event_map");
                if (optJSONObject4 != null) {
                    this.f341333e = optJSONObject4.optInt("enable", C114141rg.f341663c);
                }
                this.f341331c = optJSONObject.optJSONObject("data_layer");
            }
        }
    }

    public C114067pm(Handler handler, String str, String str2, C26874c cVar, TencentMap.OnAuthResultCallback onAuthResultCallback) {
        this.f341315b = handler;
        this.f341318e = cVar;
        this.f341316c = TextUtils.isEmpty(str) ? "" : str;
        this.f341317d = TextUtils.isEmpty(str2) ? "" : str2;
        this.f341319f = onAuthResultCallback;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean a = m158830a();
        if (C113798hb.f340501i == 2) {
            this.f341321h.sendEmptyMessageDelayed(10000, 10000);
        }
        if (a || this.f341315b == null) {
            return null;
        }
        C113739fu fuVar = new C113739fu();
        fuVar.f340295f = 3;
        this.f341315b.sendMessage(this.f341315b.obtainMessage(3, fuVar));
        return null;
    }

    /* renamed from: a */
    private boolean m158830a() {
        String str;
        String str2;
        String str3;
        int i;
        C113620df dfVar = (C113620df) C113601cl.m156511a(C113620df.class);
        if (dfVar == null) {
            TencentMap.OnAuthResultCallback onAuthResultCallback = this.f341319f;
            if (onAuthResultCallback != null) {
                onAuthResultCallback.onAuthFail(C114070a.INTERNAL_ERROR.f341328c, "Native environment not ready");
            }
            return false;
        }
        C113607ct ctVar = (C113607ct) dfVar.mo171932h();
        String a = C113798hb.m157068a();
        String str4 = this.f341316c;
        String l = C113798hb.m157095l();
        String str5 = this.f341317d;
        String h = C113798hb.m157091h();
        String d = C113798hb.m157085d();
        int j = C113798hb.m157093j();
        String k = C113798hb.m157094k();
        String m = C113798hb.m157096m();
        String c = C113798hb.m157083c();
        String g = C113798hb.m157090g();
        if (TextUtils.isEmpty(g)) {
            str = "0";
        } else {
            str = "wifi".equals(g) ? "2" : "1";
        }
        NetResponse checkAuth = ctVar.checkAuth(a, str4, l, str5, h, d, j, k, m, c, str);
        byte[] bArr = new byte[0];
        if (checkAuth != null) {
            str2 = checkAuth.charset;
            byte[] bArr2 = checkAuth.data;
            if (bArr2 != null) {
                bArr = bArr2;
            }
        } else {
            str2 = "utf-8";
        }
        C113798hb.f340502j = Calendar.getInstance().get(1);
        C113798hb.f340503k = Calendar.getInstance().get(2);
        C113798hb.f340504l = Calendar.getInstance().get(5);
        try {
            final JSONObject jSONObject = new JSONObject(new String(bArr, str2));
            this.f341320g = (C114071b) JsonUtils.parseToModel(jSONObject.optJSONObject("detail"), C114071b.class, new Object[0]);
            this.f341315b.post(new Runnable() {
                public final void run() {
                    if (C114067pm.this.f341318e != null) {
                        C114067pm.this.f341318e.mo54066a(C114067pm.this.f341320g);
                    }
                }
            });
            JSONObject optJSONObject = jSONObject.optJSONObject("info");
            if (optJSONObject != null) {
                i = optJSONObject.optInt("error");
                str3 = optJSONObject.optString("msg");
            } else {
                str3 = null;
                i = 0;
            }
            if (i != 0) {
                TencentMap.OnAuthResultCallback onAuthResultCallback2 = this.f341319f;
                if (onAuthResultCallback2 != null) {
                    onAuthResultCallback2.onAuthFail(i, str3);
                }
                m158828a(i, str3);
                if (i < -400) {
                    C113798hb.f340501i = -1;
                } else {
                    C113798hb.f340501i = 1;
                }
            } else if (optJSONObject != null) {
                C113798hb.f340501i = 0;
                TencentMap.OnAuthResultCallback onAuthResultCallback3 = this.f341319f;
                if (onAuthResultCallback3 != null) {
                    onAuthResultCallback3.onAuthSuccess();
                }
            } else {
                TencentMap.OnAuthResultCallback onAuthResultCallback4 = this.f341319f;
                if (onAuthResultCallback4 != null) {
                    onAuthResultCallback4.onAuthFail(C114070a.NETWORK_ERROR.f341328c, "Network environment error");
                }
            }
            if (C113798hb.f340501i == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            TencentMap.OnAuthResultCallback onAuthResultCallback5 = this.f341319f;
            if (onAuthResultCallback5 != null) {
                onAuthResultCallback5.onAuthFail(C114070a.INTERNAL_ERROR.f341328c, "Internal error exception: " + e.fillInStackTrace().getMessage());
            }
            return false;
        }
    }

    /* renamed from: b */
    private static String m158831b() {
        String g = C113798hb.m157090g();
        if (TextUtils.isEmpty(g)) {
            return "0";
        }
        return "wifi".equals(g) ? "2" : "1";
    }

    /* renamed from: c */
    private Void m158835c() {
        boolean a = m158830a();
        if (C113798hb.f340501i == 2) {
            this.f341321h.sendEmptyMessageDelayed(10000, 10000);
        }
        if (a || this.f341315b == null) {
            return null;
        }
        C113739fu fuVar = new C113739fu();
        fuVar.f340295f = 3;
        this.f341315b.sendMessage(this.f341315b.obtainMessage(3, fuVar));
        return null;
    }

    /* renamed from: d */
    private void m158837d() {
        if (this.f341315b != null) {
            C113739fu fuVar = new C113739fu();
            fuVar.f340295f = 3;
            this.f341315b.sendMessage(this.f341315b.obtainMessage(3, fuVar));
        }
    }

    /* renamed from: b */
    private void m158833b(final JSONObject jSONObject) {
        this.f341320g = (C114071b) JsonUtils.parseToModel(jSONObject.optJSONObject("detail"), C114071b.class, new Object[0]);
        this.f341315b.post(new Runnable() {
            public final void run() {
                if (C114067pm.this.f341318e != null) {
                    C114067pm.this.f341318e.mo54066a(C114067pm.this.f341320g);
                }
            }
        });
    }

    /* renamed from: a */
    private void m158829a(JSONObject jSONObject) {
        String str;
        int i;
        JSONObject optJSONObject = jSONObject.optJSONObject("info");
        if (optJSONObject != null) {
            i = optJSONObject.optInt("error");
            str = optJSONObject.optString("msg");
        } else {
            str = null;
            i = 0;
        }
        if (i != 0) {
            TencentMap.OnAuthResultCallback onAuthResultCallback = this.f341319f;
            if (onAuthResultCallback != null) {
                onAuthResultCallback.onAuthFail(i, str);
            }
            m158828a(i, str);
            if (i < -400) {
                C113798hb.f340501i = -1;
            } else {
                C113798hb.f340501i = 1;
            }
        } else if (optJSONObject != null) {
            C113798hb.f340501i = 0;
            TencentMap.OnAuthResultCallback onAuthResultCallback2 = this.f341319f;
            if (onAuthResultCallback2 != null) {
                onAuthResultCallback2.onAuthSuccess();
            }
        } else {
            TencentMap.OnAuthResultCallback onAuthResultCallback3 = this.f341319f;
            if (onAuthResultCallback3 != null) {
                onAuthResultCallback3.onAuthFail(C114070a.NETWORK_ERROR.f341328c, "Network environment error");
            }
        }
    }

    /* renamed from: a */
    private static void m158828a(int i, String str) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("腾讯地图鉴权失败，请访问 lbs.qq.com 检查 key 配置");
        arrayList.add("错误码：".concat(String.valueOf(i)));
        arrayList.add("错误信息：".concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder(1024);
        char[] cArr = new char[81];
        Arrays.fill(cArr, '*');
        cArr[80] = 10;
        sb.append(cArr);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
        }
        sb.append(cArr);
    }
}
