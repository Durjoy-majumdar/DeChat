package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.mmfb.sdk.LoginClient;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import j20.C117292a;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import org.json.JSONException;
import org.json.JSONObject;
import p1208q3.C118144a;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.h */
public class C116102h {

    /* renamed from: g */
    public static final String f348429g;

    /* renamed from: h */
    public static final String f348430h;

    /* renamed from: i */
    public static final String f348431i;

    /* renamed from: j */
    public static final String f348432j;

    /* renamed from: k */
    public static final String f348433k;

    /* renamed from: l */
    public static final String f348434l;

    /* renamed from: m */
    public static final String f348435m;

    /* renamed from: n */
    public static String f348436n = "https://m.facebook.com/dialog/";

    /* renamed from: o */
    public static String f348437o = "https://graph.facebook.com/";

    /* renamed from: p */
    public static String f348438p = "https://api.facebook.com/restserver.php";

    /* renamed from: q */
    public static WeakReference<BroadcastReceiver> f348439q;

    /* renamed from: a */
    public String f348440a = null;

    /* renamed from: b */
    public long f348441b = 0;

    /* renamed from: c */
    public String f348442c = "290293790992170";

    /* renamed from: d */
    public C116103a f348443d;

    /* renamed from: e */
    public C116103a f348444e;

    /* renamed from: f */
    public C116104i f348445f = new C116104i();

    /* renamed from: com.tencent.mm.ui.mmfb.sdk.h$a */
    public interface C116103a {
        /* renamed from: b */
        void mo1391b(Bundle bundle);

        /* renamed from: c */
        void mo1392c(C116105j jVar);

        /* renamed from: d */
        void mo1393d(C116099e eVar);

        void onCancel();
    }

    static {
        Class<C116102h> cls = C116102h.class;
        f348429g = cls.getSimpleName() + ".extra_url";
        f348430h = cls.getSimpleName() + ".extra_action";
        f348431i = cls.getSimpleName() + ".extra_params";
        f348432j = cls.getSimpleName() + ".extra_chromePackage";
        f348433k = cls.getSimpleName() + ".action_refresh";
        f348434l = cls.getSimpleName() + ".no_activity_exception";
        f348435m = cls.getSimpleName() + ".action_customTabRedirect";
    }

    /* renamed from: e */
    public static Bundle m163385e(String str) {
        Bundle bundle = new Bundle();
        if (!Util.isNullOrNil(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo177418a(Activity activity, String[] strArr, C116103a aVar) {
        this.f348443d = aVar;
        this.f348444e = new C116101g(this);
        CustomTabLoginMethodHandler customTabLoginMethodHandler = new CustomTabLoginMethodHandler(new LoginClient(activity));
        ArrayList arrayList = new ArrayList();
        for (String add : strArr) {
            arrayList.add(add);
        }
        arrayList.clear();
        for (String add2 : strArr) {
            arrayList.add(add2);
        }
        LoginClient.Request request = new LoginClient.Request(C57841n.NATIVE_WITH_FALLBACK, Collections.unmodifiableSet(new HashSet(arrayList)), C116098d.FRIENDS, "rerequest", "290293790992170", UUID.randomUUID().toString());
        Parcelable.Creator<AccessToken> creator = AccessToken.CREATOR;
        request.f348403i = false;
        Bundle bundle = new Bundle();
        Set<String> set = request.f348399e;
        String str = null;
        if (!(set == null || set.size() == 0)) {
            String join = TextUtils.join(",", request.f348399e);
            bundle.putString("scope", join);
            if (customTabLoginMethodHandler.f348415d == null) {
                customTabLoginMethodHandler.f348415d = new HashMap();
            }
            customTabLoginMethodHandler.f348415d.put("scope", join == null ? null : join.toString());
        }
        bundle.putString("default_audience", "friends");
        bundle.putString("state", new JSONObject().toString());
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", "0");
        bundle.putString("redirect_uri", customTabLoginMethodHandler.f348391h);
        bundle.putString("client_id", request.f348401g);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        bundle.putString("e2e", jSONObject.toString());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", "rerequest");
        bundle.putString("login_behavior", "NATIVE_WITH_FALLBACK");
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{"android-8.2.0"}));
        bundle.putString("sso", "chrome_custom_tab");
        bundle.putString("cct_prefetching", "0");
        Intent intent = new Intent();
        intent.setClassName(activity, "com.tencent.mm.plugin.account.ui.CustomTabMainActivity");
        intent.putExtra(f348430h, "oauth");
        intent.putExtra(f348431i, bundle);
        String str2 = f348432j;
        String str3 = customTabLoginMethodHandler.f348389f;
        if (str3 == null) {
            List<ResolveInfo> queryIntentServices = MMApplicationContext.getContext().getApplicationContext().getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                HashSet hashSet = new HashSet(Arrays.asList(C116097c.f348424a));
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ServiceInfo serviceInfo = it.next().serviceInfo;
                        if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                            str = serviceInfo.packageName;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            customTabLoginMethodHandler.f348389f = str;
            str3 = str;
        }
        intent.putExtra(str2, str3);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(101);
        aVar2.mo10233c(intent);
        C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/ui/mmfb/sdk/CustomTabLoginMethodHandler", "tryAuthorize", "(Landroid/app/Activity;[Ljava/lang/String;)I", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        mo177425i(activity);
        C116100f fVar = new C116100f(this);
        f348439q = new WeakReference<>(fVar);
        C118144a.m166672a(activity).mo182943b(fVar, new IntentFilter(f348435m));
        C117407d.INSTANCE.idkeyStat(582, 0, 1, false);
    }

    /* renamed from: b */
    public void mo177419b(int i, int i2, Intent intent) {
        if (i != 0) {
            return;
        }
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra("error");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("error_type");
            }
            if (stringExtra == null) {
                mo177424h(intent.getStringExtra("access_token"));
                mo177423g(intent.getStringExtra("expires_in"));
                if (mo177421d()) {
                    Log.m105918d("Facebook-authorize", "Login Success! access_token=" + this.f348440a + " expires=" + this.f348441b);
                    this.f348443d.mo1391b(intent.getExtras());
                    return;
                }
                this.f348443d.mo1392c(new C116105j("Failed to receive access token."));
            } else if (stringExtra.equals("service_disabled") || stringExtra.equals("AndroidAuthKillSwitchException")) {
                Log.m105918d("Facebook-authorize", "Hosted auth currently disabled. Retrying dialog auth...");
                new Bundle();
                throw null;
            } else if (stringExtra.equals("access_denied") || stringExtra.equals("OAuthAccessDeniedException")) {
                Log.m105918d("Facebook-authorize", "Login canceled by user.");
                this.f348443d.onCancel();
            } else {
                String stringExtra2 = intent.getStringExtra("error_description");
                if (stringExtra2 != null) {
                    stringExtra = stringExtra + XVFSFile.PATH_SEPARATOR + stringExtra2;
                }
                Log.m105918d("Facebook-authorize", "Login failed: " + stringExtra);
                this.f348443d.mo1392c(new C116105j(stringExtra));
            }
        } else if (i2 != 0) {
        } else {
            if (intent != null) {
                Log.m105918d("Facebook-authorize", "Login failed: " + intent.getStringExtra("error"));
                this.f348443d.mo1393d(new C116099e(intent.getStringExtra("error"), intent.getIntExtra(StateEvent.Name.ERROR_CODE, -1), intent.getStringExtra("failing_url")));
                return;
            }
            Log.m105918d("Facebook-authorize", "Login canceled by user.");
            this.f348443d.onCancel();
        }
    }

    /* renamed from: c */
    public void mo177420c(Activity activity) {
        if (this.f348445f != null) {
            Log.m105924i("MicroMsg.FacebookLoginUI", "facebook destory, unInitSdk = " + Util.getStack());
        }
        mo177425i(activity);
    }

    /* renamed from: d */
    public boolean mo177421d() {
        return this.f348440a != null && (this.f348441b == 0 || System.currentTimeMillis() < this.f348441b);
    }

    /* renamed from: f */
    public String mo177422f(String str, Bundle bundle, String str2) {
        String str3;
        String str4;
        bundle.putString(TPReportKeys.PlayerStep.PLAYER_FORMAT, "json");
        if (mo177421d()) {
            bundle.putString("access_token", this.f348440a);
        }
        if (str != null) {
            str3 = f348437o + str;
        } else {
            str3 = f348438p;
        }
        if (str2.equals("GET")) {
            str3 = str3 + "?" + C116106k.m163398b(bundle);
        }
        Log.m105918d("Facebook-Util", str2 + " URL: " + str3);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
        httpURLConnection.setConnectTimeout(20000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent") + " FacebookAndroidSDK");
        if (!str2.equals("GET")) {
            Bundle bundle2 = new Bundle();
            for (String next : bundle.keySet()) {
                if (bundle.getByteArray(next) != null) {
                    bundle2.putByteArray(next, bundle.getByteArray(next));
                }
            }
            if (!bundle.containsKey(FirebaseAnalytics.C113379b.METHOD)) {
                bundle.putString(FirebaseAnalytics.C113379b.METHOD, str2);
            }
            if (bundle.containsKey("access_token")) {
                bundle.putString("access_token", URLDecoder.decode(bundle.getString("access_token")));
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.connect();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write("--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
            StringBuilder sb = new StringBuilder();
            for (String next2 : bundle.keySet()) {
                if (bundle.getByteArray(next2) == null) {
                    sb.append("Content-Disposition: form-data; name=\"" + next2 + "\"\r\n\r\n" + bundle.getString(next2));
                    sb.append("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n");
                }
            }
            bufferedOutputStream.write(sb.toString().getBytes());
            bufferedOutputStream.write("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
            if (!bundle2.isEmpty()) {
                for (String next3 : bundle2.keySet()) {
                    bufferedOutputStream.write(("Content-Disposition: form-data; filename=\"" + next3 + FastJsonResponse.QUOTE + APLogFileUtil.SEPARATOR_LINE).getBytes());
                    bufferedOutputStream.write("Content-Type: content/unknown\r\n\r\n".getBytes());
                    bufferedOutputStream.write(bundle2.getByteArray(next3));
                    bufferedOutputStream.write("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
                }
            }
            bufferedOutputStream.flush();
        }
        try {
            str4 = C116106k.m163400d(httpURLConnection.getInputStream());
        } catch (FileNotFoundException unused) {
            str4 = C116106k.m163400d(httpURLConnection.getErrorStream());
        }
        try {
            httpURLConnection.getInputStream().close();
        } catch (Exception e) {
            Log.m105920e("FacebookUtil", e.getMessage());
        }
        httpURLConnection.disconnect();
        return str4;
    }

    /* renamed from: g */
    public void mo177423g(String str) {
        if (str != null) {
            this.f348441b = str.equals("0") ? 0 : System.currentTimeMillis() + (Util.safeParseLong(str) * 1000);
        }
    }

    /* renamed from: h */
    public void mo177424h(String str) {
        this.f348440a = str;
        System.currentTimeMillis();
    }

    /* renamed from: i */
    public void mo177425i(Context context) {
        try {
            WeakReference<BroadcastReceiver> weakReference = f348439q;
            if (weakReference != null && weakReference.get() != null) {
                Log.m105924i("MicroMsg.FacebookLoginUI", "unregisterReceiver");
                C118144a.m166672a(context).mo182945d(f348439q.get());
                f348439q = null;
            }
        } catch (Exception e) {
            Log.m105924i("MicroMsg.FacebookLoginUI", "facebook destory, Exception = " + e);
        }
    }
}
