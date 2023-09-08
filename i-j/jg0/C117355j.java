package jg0;

import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116094a;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116095b;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116105j;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116106k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.io.PrintStream;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: jg0.j */
public class C117355j {

    /* renamed from: a */
    public C116102h f351331a;

    /* renamed from: b */
    public C9398c f351332b;

    /* renamed from: c */
    public MMHandler f351333c;

    /* renamed from: jg0.j$a */
    public class C9397a extends MMHandler {
        public C9397a() {
        }

        public void handleMessage(Message message) {
            C9398c cVar;
            int i = message.what;
            if (i == 1) {
                C9398c cVar2 = C117355j.this.f351332b;
                if (cVar2 != null) {
                    cVar2.mo779a(message.arg1, (String) message.obj);
                }
            } else if (i == 2 && (cVar = C117355j.this.f351332b) != null) {
                cVar.mo780b(message.getData());
            }
        }
    }

    /* renamed from: jg0.j$c */
    public interface C9398c {
        /* renamed from: a */
        void mo779a(int i, String str);

        /* renamed from: b */
        void mo780b(Bundle bundle);
    }

    /* renamed from: jg0.j$b */
    public class C117356b implements C116095b.C116096a {
        public C117356b() {
        }

        /* renamed from: a */
        public void mo182019a(String str, Object obj) {
            if (str == null || str.length() == 0) {
                Log.m105920e("MicroMsg.RefreshTokenRunner", "response is null or nil");
                C117355j.m165448a(C117355j.this, 1, "response is null or nil");
            } else if (!str.contains("access_token") || str.length() <= 12) {
                try {
                    C116106k.m163399c(str);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.RefreshTokenRunner", "parseJson exception : " + e.getMessage());
                    Log.printErrStackTrace("MicroMsg.RefreshTokenRunner", e, "", new Object[0]);
                } catch (C116105j e2) {
                    String str2 = "errCode = " + e2.f348446d + ", errType = " + e2.f348447e + ", errMsg = " + e2.getMessage();
                    Log.m105920e("MicroMsg.RefreshTokenRunner", "parseJson facebookerror, " + str2);
                    Log.printErrStackTrace("MicroMsg.RefreshTokenRunner", e2, "", new Object[0]);
                    C117355j.m165448a(C117355j.this, 3, str2);
                    return;
                }
                C117355j.m165448a(C117355j.this, 2, "parseJson error");
            } else {
                try {
                    JSONObject c = C116106k.m163399c(str);
                    if (c.has("access_token")) {
                        Bundle b = C117355j.m165449b(c);
                        C117355j jVar = C117355j.this;
                        jVar.getClass();
                        Message obtain = Message.obtain();
                        obtain.what = 2;
                        obtain.setData(b);
                        jVar.f351333c.sendMessage(obtain);
                        return;
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.RefreshTokenRunner", th, "", new Object[0]);
                }
                C117355j.m165448a(C117355j.this, 2, "decodeUrl fail");
            }
        }
    }

    public C117355j(C116102h hVar, C9398c cVar) {
        this.f351331a = hVar;
        this.f351332b = cVar;
    }

    /* renamed from: a */
    public static void m165448a(C117355j jVar, int i, String str) {
        jVar.getClass();
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.arg1 = i;
        obtain.obj = str;
        jVar.f351333c.sendMessage(obtain);
    }

    /* renamed from: b */
    public static Bundle m165449b(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray optJSONArray = jSONObject.optJSONArray(next);
            Double valueOf = Double.valueOf(jSONObject.optDouble(next));
            String optString = jSONObject.optString(next);
            int i = 0;
            if (optJSONArray != null && optJSONArray.length() <= 0) {
                bundle.putStringArray(next, new String[0]);
            } else if (optJSONArray != null && !Double.isNaN(optJSONArray.optDouble(0))) {
                double[] dArr = new double[optJSONArray.length()];
                while (i < optJSONArray.length()) {
                    dArr[i] = optJSONArray.optDouble(i);
                    i++;
                }
                bundle.putDoubleArray(next, dArr);
            } else if (optJSONArray != null && optJSONArray.optString(0) != null) {
                String[] strArr = new String[optJSONArray.length()];
                while (i < optJSONArray.length()) {
                    strArr[i] = optJSONArray.optString(i);
                    i++;
                }
                bundle.putStringArray(next, strArr);
            } else if (!valueOf.isNaN()) {
                bundle.putDouble(next, valueOf.doubleValue());
            } else if (optString != null) {
                bundle.putString(next, optString);
            } else {
                PrintStream printStream = System.err;
                printStream.println("unable to transform json to bundle " + next);
            }
        }
        return bundle;
    }

    /* renamed from: c */
    public void mo182018c() {
        this.f351333c = new C9397a();
        Bundle bundle = new Bundle();
        bundle.putString("client_id", "290293790992170");
        bundle.putString("client_secret", MMApplicationContext.getContext().getString(C0966R.string.clc));
        bundle.putString("grant_type", "fb_exchange_token");
        bundle.putString("fb_exchange_token", this.f351331a.f348440a);
        ThreadPool.post(new C116094a(new C116095b(this.f351331a), "oauth/access_token", bundle, "GET", new C117356b(), (Object) null), "AsyncFacebookRunner_request");
    }
}
