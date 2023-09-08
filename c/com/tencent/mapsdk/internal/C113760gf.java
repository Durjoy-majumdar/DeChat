package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.C113565bo;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.mapsdk.internal.C113880kc;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.gf */
public final class C113760gf {

    /* renamed from: a */
    public static volatile boolean f340366a;

    /* renamed from: com.tencent.mapsdk.internal.gf$a */
    public static class C113766a extends JsonComposer {
        @Json(name = "name")

        /* renamed from: a */
        public String f340378a;
        @Json(name = "token")

        /* renamed from: b */
        public C113769b f340379b;
        @Json(name = "create_time")

        /* renamed from: c */
        public long f340380c;
        @Json(ignore = true)

        /* renamed from: d */
        public C113565bo f340381d;

        public C113766a(C113565bo boVar) {
            this(boVar, "");
        }

        /* renamed from: c */
        private long m156981c() {
            return this.f340380c;
        }

        /* renamed from: d */
        private long m156982d() {
            C113769b bVar = this.f340379b;
            if (bVar != null) {
                return Long.parseLong(bVar.f340386b);
            }
            return 0;
        }

        /* renamed from: e */
        private String m156983e() {
            return HttpWrapperBase.PROTOCAL_HTTPS + this.f340379b.f340387c + "/" + mo172137b();
        }

        /* renamed from: f */
        private boolean m156984f() {
            byte[] c;
            File[] listFiles;
            if (this.f340381d == null) {
                return false;
            }
            File file = new File(C113959ml.m157965a(this.f340381d.getContext(), (TencentMapOptions) null).mo172401a());
            File a = C113884kf.m157485a(file, mo172134a());
            C113889km.m157550c(C0949kl.f2239i, "创建上传文件目录:".concat(String.valueOf(a)));
            File b = C113884kf.m157494b(a, "base-info.txt");
            StringBuilder sb = new StringBuilder();
            C113565bo.C113567b w = this.f340381d.mo171810w();
            sb.append(C113798hb.m157070a(w.f339870c, w.f339871d));
            sb.append("&engine_draw_version=");
            sb.append(this.f340381d.mo171811x());
            sb.append("&engine_data_version=");
            sb.append(this.f340381d.mo171812y());
            sb.append("&camera=");
            sb.append(this.f340381d.f339859b.getMap().getCameraPosition());
            C113889km.m157550c(C0949kl.f2239i, "日志数据:".concat(String.valueOf(sb)));
            C113884kf.m157491a(b, sb.toString().getBytes());
            C113889km.m157550c(C0949kl.f2239i, "收集日志数据至文件:".concat(String.valueOf(b)));
            C113884kf.m157498b(new File(C113959ml.m157965a(this.f340381d.getContext(), (TencentMapOptions) null).mo172402a(this.f340381d.mo171810w().f339870c)), new File(a, "config"));
            String a2 = this.f340381d.mo171786A().mo171844a();
            if (!TextUtils.isEmpty(a2)) {
                File b2 = C113884kf.m157494b(a, "engine-crash-info.txt");
                C113889km.m157550c(C0949kl.f2239i, "收集引擎Crash至文件:".concat(String.valueOf(b2)));
                C113884kf.m157491a(b2, a2.getBytes());
            }
            String b3 = this.f340381d.mo171786A().mo171846b();
            if (!TextUtils.isEmpty(b3)) {
                File b4 = C113884kf.m157494b(a, "engine-log-info.txt");
                C113889km.m157550c(C0949kl.f2239i, "收集引擎日志至文件:".concat(String.valueOf(b4)));
                C113884kf.m157491a(b4, b3.getBytes());
            }
            File d = C114361u.m160481a().f342769a.mo172876d();
            if (d != null && d.exists() && d.isDirectory() && (listFiles = d.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists() && file2.isFile()) {
                        C113884kf.m157498b(file2, new File(a, "plugin"));
                    }
                }
            }
            String a3 = C113889km.m157533a();
            if (!TextUtils.isEmpty(a3)) {
                File file3 = new File(a3);
                if (file3.exists() && file3.isDirectory()) {
                    File[] e = C113884kf.m157507e(file3, ".*.log.*");
                    if (e != null) {
                        for (File file4 : e) {
                            if (file4 != null && file4.exists() && file4.isFile()) {
                                C113884kf.m157498b(file4, new File(a, "logs"));
                            }
                        }
                    }
                    File[] e2 = C113884kf.m157507e(file3, "archive-.*.zip");
                    if (e2 != null) {
                        for (File file5 : e2) {
                            if (file5 != null && file5.exists() && file5.isFile()) {
                                C113884kf.m157498b(file5, new File(a, "archives"));
                            }
                        }
                    }
                }
            }
            File a4 = C80344ki.m97840a(a, file.getAbsolutePath());
            C113889km.m157550c(C0949kl.f2239i, "打包成zip文件:".concat(String.valueOf(a4)));
            if (a4 == null || (c = C113884kf.m157503c(a4)) == null) {
                return false;
            }
            C113889km.m157550c(C0949kl.f2239i, "zip文件大小:" + c.length);
            if (c.length > 0) {
                C113889km.m157550c(C0949kl.f2239i, "开始上传文件到：" + m156983e());
                String a5 = C113904kw.m157757a(a4);
                NetRequest postData = new NetRequest(NetMethod.PUT, m156983e()).setPostData(c);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(c.length);
                NetResponse doRequest = NetManager.getInstance().doRequest(postData.setMapHeaders("Content-Length", sb4.toString()).setMapHeaders("Authorization", this.f340379b.f340385a).setMapHeaders("x-cos-content-sha1", a5).setTimeout(120000));
                C113889km.m157550c(C0949kl.f2239i, "结束上传文件");
                C113884kf.m157500b(a4);
                C113884kf.m157500b(a);
                int i = doRequest.statusCode;
                C113889km.m157550c(C0949kl.f2239i, "上传状态:".concat(String.valueOf(i)));
                if (i == 200) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private byte[] m156985g() {
            StringBuilder sb = new StringBuilder();
            C113565bo.C113567b w = this.f340381d.mo171810w();
            sb.append(C113798hb.m157070a(w.f339870c, w.f339871d));
            sb.append("&engine_draw_version=");
            sb.append(this.f340381d.mo171811x());
            sb.append("&engine_data_version=");
            sb.append(this.f340381d.mo171812y());
            sb.append("&camera=");
            sb.append(this.f340381d.f339859b.getMap().getCameraPosition());
            C113889km.m157550c(C0949kl.f2239i, "日志数据:".concat(String.valueOf(sb)));
            return sb.toString().getBytes();
        }

        /* renamed from: a */
        public final String mo172134a() {
            return "android-" + this.f340378a + "-" + this.f340380c;
        }

        /* renamed from: b */
        public final String mo172137b() {
            return mo172134a() + ".zip";
        }

        public C113766a(C113565bo boVar, String str) {
            this.f340378a = str;
            this.f340381d = boVar;
            this.f340380c = System.currentTimeMillis();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r1 = r0.f340379b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo172136a(android.content.Context r1) {
            /*
                r0 = this;
                boolean r1 = com.tencent.map.tools.net.NetUtil.isWifi(r1)
                if (r1 == 0) goto L_0x0012
                com.tencent.mapsdk.internal.gf$b r1 = r0.f340379b
                if (r1 == 0) goto L_0x0012
                boolean r1 = r1.mo172139a()
                if (r1 != 0) goto L_0x0012
                r1 = 1
                return r1
            L_0x0012:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113760gf.C113766a.mo172136a(android.content.Context):boolean");
        }

        /* renamed from: a */
        public final void mo172135a(final Callback<Boolean> callback) {
            C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
                /* renamed from: a */
                private Boolean m156991a() {
                    return Boolean.valueOf(C113766a.m156980a(C113766a.this));
                }

                public final /* synthetic */ Object call() {
                    return Boolean.valueOf(C113766a.m156980a(C113766a.this));
                }
            }).mo172278a(new C113865kb.C113868a<Boolean>() {
                /* renamed from: a */
                private void m156990a(Boolean bool) {
                    Callback callback = callback;
                    if (callback != null) {
                        callback.callback(bool);
                    }
                }

                public final /* bridge */ /* synthetic */ void callback(Object obj) {
                    Boolean bool = (Boolean) obj;
                    Callback callback = callback;
                    if (callback != null) {
                        callback.callback(bool);
                    }
                }
            });
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m156980a(C113766a aVar) {
            byte[] c;
            File[] listFiles;
            if (aVar.f340381d != null) {
                File file = new File(C113959ml.m157965a(aVar.f340381d.getContext(), (TencentMapOptions) null).mo172401a());
                File a = C113884kf.m157485a(file, aVar.mo172134a());
                C113889km.m157550c(C0949kl.f2239i, "创建上传文件目录:".concat(String.valueOf(a)));
                File b = C113884kf.m157494b(a, "base-info.txt");
                StringBuilder sb = new StringBuilder();
                C113565bo.C113567b w = aVar.f340381d.mo171810w();
                sb.append(C113798hb.m157070a(w.f339870c, w.f339871d));
                sb.append("&engine_draw_version=");
                sb.append(aVar.f340381d.mo171811x());
                sb.append("&engine_data_version=");
                sb.append(aVar.f340381d.mo171812y());
                sb.append("&camera=");
                sb.append(aVar.f340381d.f339859b.getMap().getCameraPosition());
                C113889km.m157550c(C0949kl.f2239i, "日志数据:".concat(String.valueOf(sb)));
                C113884kf.m157491a(b, sb.toString().getBytes());
                C113889km.m157550c(C0949kl.f2239i, "收集日志数据至文件:".concat(String.valueOf(b)));
                C113884kf.m157498b(new File(C113959ml.m157965a(aVar.f340381d.getContext(), (TencentMapOptions) null).mo172402a(aVar.f340381d.mo171810w().f339870c)), new File(a, "config"));
                String a2 = aVar.f340381d.mo171786A().mo171844a();
                if (!TextUtils.isEmpty(a2)) {
                    File b2 = C113884kf.m157494b(a, "engine-crash-info.txt");
                    C113889km.m157550c(C0949kl.f2239i, "收集引擎Crash至文件:".concat(String.valueOf(b2)));
                    C113884kf.m157491a(b2, a2.getBytes());
                }
                String b3 = aVar.f340381d.mo171786A().mo171846b();
                if (!TextUtils.isEmpty(b3)) {
                    File b4 = C113884kf.m157494b(a, "engine-log-info.txt");
                    C113889km.m157550c(C0949kl.f2239i, "收集引擎日志至文件:".concat(String.valueOf(b4)));
                    C113884kf.m157491a(b4, b3.getBytes());
                }
                File d = C114361u.m160481a().f342769a.mo172876d();
                if (d != null && d.exists() && d.isDirectory() && (listFiles = d.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists() && file2.isFile()) {
                            C113884kf.m157498b(file2, new File(a, "plugin"));
                        }
                    }
                }
                String a3 = C113889km.m157533a();
                if (!TextUtils.isEmpty(a3)) {
                    File file3 = new File(a3);
                    if (file3.exists() && file3.isDirectory()) {
                        File[] e = C113884kf.m157507e(file3, ".*.log.*");
                        if (e != null) {
                            for (File file4 : e) {
                                if (file4 != null && file4.exists() && file4.isFile()) {
                                    C113884kf.m157498b(file4, new File(a, "logs"));
                                }
                            }
                        }
                        File[] e2 = C113884kf.m157507e(file3, "archive-.*.zip");
                        if (e2 != null) {
                            for (File file5 : e2) {
                                if (file5 != null && file5.exists() && file5.isFile()) {
                                    C113884kf.m157498b(file5, new File(a, "archives"));
                                }
                            }
                        }
                    }
                }
                File a4 = C80344ki.m97840a(a, file.getAbsolutePath());
                C113889km.m157550c(C0949kl.f2239i, "打包成zip文件:".concat(String.valueOf(a4)));
                if (!(a4 == null || (c = C113884kf.m157503c(a4)) == null)) {
                    C113889km.m157550c(C0949kl.f2239i, "zip文件大小:" + c.length);
                    if (c.length > 0) {
                        C113889km.m157550c(C0949kl.f2239i, "开始上传文件到：" + aVar.m156983e());
                        String a5 = C113904kw.m157757a(a4);
                        NetRequest postData = new NetRequest(NetMethod.PUT, aVar.m156983e()).setPostData(c);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c.length);
                        NetResponse doRequest = NetManager.getInstance().doRequest(postData.setMapHeaders("Content-Length", sb4.toString()).setMapHeaders("Authorization", aVar.f340379b.f340385a).setMapHeaders("x-cos-content-sha1", a5).setTimeout(120000));
                        C113889km.m157550c(C0949kl.f2239i, "结束上传文件");
                        C113884kf.m157500b(a4);
                        C113884kf.m157500b(a);
                        int i = doRequest.statusCode;
                        C113889km.m157550c(C0949kl.f2239i, "上传状态:".concat(String.valueOf(i)));
                        if (i == 200) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.gf$b */
    public static class C113769b extends JsonComposer {
        @Json(name = "token")

        /* renamed from: a */
        public String f340385a;
        @Json(name = "expire")

        /* renamed from: b */
        public String f340386b;
        @Json(name = "host")

        /* renamed from: c */
        public String f340387c;

        /* renamed from: a */
        public final boolean mo172139a() {
            try {
                return Long.parseLong(this.f340386b) < SystemClock.uptimeMillis() / 1000;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    /* renamed from: a */
    public static boolean m156972a(final Context context, final SharedPreferences sharedPreferences, final C113766a aVar) {
        if (!(aVar == null || context == null)) {
            if (C113889km.m157556d(C0949kl.f2239i) && Build.VERSION.SDK_INT < 30) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("日志名称:\n");
                    sb.append(aVar.mo172134a());
                    sb.append("\n");
                    String format = DateFormat.getInstance().format(new Date(aVar.f340380c));
                    sb.append("创建时间:\n");
                    sb.append(format);
                    sb.append("\n");
                    DateFormat instance = DateFormat.getInstance();
                    C113769b bVar = aVar.f340379b;
                    String format2 = instance.format(new Date((bVar != null ? Long.parseLong(bVar.f340386b) : 0) * 1000));
                    sb.append("过期时间:\n");
                    sb.append(format2);
                    sb.append("\n");
                    final C113880kc.C113881a a = C113880kc.m157444a(context, "调试模式", sb.toString(), 1);
                    return a.mo172287a().mo172290a("上报(仅WIFI)", (View.OnClickListener) new View.OnClickListener() {
                        public final void onClick(View view) {
                            if (C113760gf.f340366a || !aVar.mo172136a(context)) {
                                C113889km.m157550c(C0949kl.f2239i, "正在上传中");
                                return;
                            }
                            a.mo172290a("上报中", (View.OnClickListener) null);
                            aVar.mo172135a((Callback<Boolean>) new Callback<Boolean>() {
                                /* renamed from: a */
                                private void m156978a(Boolean bool) {
                                    if (!bool.booleanValue()) {
                                        C113889km.m157550c(C0949kl.f2239i, "清理本地缓存");
                                        C113887kh.m157526a(sharedPreferences).mo172293a("reportFile", "");
                                    }
                                    Toast toast = a.f340689a;
                                    if (toast != null) {
                                        toast.cancel();
                                    }
                                    C113760gf.f340366a = false;
                                }

                                public final /* synthetic */ void callback(Object obj) {
                                    if (!((Boolean) obj).booleanValue()) {
                                        C113889km.m157550c(C0949kl.f2239i, "清理本地缓存");
                                        C113887kh.m157526a(sharedPreferences).mo172293a("reportFile", "");
                                    }
                                    Toast toast = a.f340689a;
                                    if (toast != null) {
                                        toast.cancel();
                                    }
                                    C113760gf.f340366a = false;
                                }
                            });
                            C113760gf.f340366a = true;
                        }
                    }).mo172291b();
                } catch (Exception unused) {
                }
            } else if (!f340366a && aVar.mo172136a(context)) {
                aVar.mo172135a((Callback<Boolean>) new Callback<Boolean>() {
                    /* renamed from: a */
                    private void m156979a(Boolean bool) {
                        if (!bool.booleanValue()) {
                            C113889km.m157550c(C0949kl.f2239i, "清理本地缓存");
                            C113887kh.m157526a(sharedPreferences).mo172293a("reportFile", "");
                        }
                        C113760gf.f340366a = false;
                    }

                    public final /* synthetic */ void callback(Object obj) {
                        if (!((Boolean) obj).booleanValue()) {
                            C113889km.m157550c(C0949kl.f2239i, "清理本地缓存");
                            C113887kh.m157526a(sharedPreferences).mo172293a("reportFile", "");
                        }
                        C113760gf.f340366a = false;
                    }
                });
                f340366a = true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m156973a(C113565bo boVar) {
        if (boVar == null || boVar.f339862e || boVar.mo171805q().mo171939a()) {
            return false;
        }
        final Context context = boVar.getContext();
        final C113565bo.C113567b w = boVar.mo171810w();
        String a = w.mo171816a();
        final SharedPreferences a2 = C113887kh.m157525a(context, "uploadConfig." + w.mo171818c());
        final C113766a aVar = null;
        String string = a2.getString("reportFile", (String) null);
        if (!TextUtils.isEmpty(string)) {
            try {
                C113889km.m157550c(C0949kl.f2239i, "获取本地上报文件：".concat(String.valueOf(string)));
                aVar = (C113766a) JsonUtils.parseToModel(new JSONObject(string), C113766a.class, boVar);
            } catch (Exception unused) {
            }
        }
        if (aVar == null || !a.equals(aVar.f340378a)) {
            C113889km.m157550c(C0949kl.f2239i, "重新创建上报文件");
            aVar = new C113766a(boVar, a);
        }
        C113769b bVar = aVar.f340379b;
        if (bVar == null || bVar.mo172139a()) {
            C113889km.m157550c(C0949kl.f2239i, "请求token");
            C113865kb.m157396a(new C113865kb.C113879g<JSONObject>() {
                /* renamed from: a */
                private JSONObject m156977a() {
                    String b = aVar.mo172137b();
                    C113565bo.C113567b bVar = w;
                    NetResponse uploadToken = ((C113607ct) ((C113620df) C113601cl.m156511a(C113620df.class)).mo171932h()).uploadToken(b, bVar.f339868a, bVar.f339869b);
                    C113889km.m157550c(C0949kl.f2239i, "响应状态：" + uploadToken.statusCode);
                    if (!uploadToken.available()) {
                        return null;
                    }
                    String a = C40002he.m42804a(uploadToken.data, uploadToken.charset);
                    C113889km.m157550c(C0949kl.f2239i, "获取网络token数据：".concat(String.valueOf(a)));
                    if (!TextUtils.isEmpty(a)) {
                        return new JSONObject(a).optJSONObject("detail");
                    }
                    return null;
                }

                public final /* synthetic */ Object call() {
                    String b = aVar.mo172137b();
                    C113565bo.C113567b bVar = w;
                    NetResponse uploadToken = ((C113607ct) ((C113620df) C113601cl.m156511a(C113620df.class)).mo171932h()).uploadToken(b, bVar.f339868a, bVar.f339869b);
                    C113889km.m157550c(C0949kl.f2239i, "响应状态：" + uploadToken.statusCode);
                    if (!uploadToken.available()) {
                        return null;
                    }
                    String a = C40002he.m42804a(uploadToken.data, uploadToken.charset);
                    C113889km.m157550c(C0949kl.f2239i, "获取网络token数据：".concat(String.valueOf(a)));
                    if (!TextUtils.isEmpty(a)) {
                        return new JSONObject(a).optJSONObject("detail");
                    }
                    return null;
                }
            }).mo172278a(new C113865kb.C113868a<JSONObject>() {
                /* renamed from: a */
                private void m156976a(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        aVar.f340379b = (C113769b) JsonUtils.parseToModel(jSONObject, C113769b.class, new Object[0]);
                        C113760gf.m156972a(context, a2, aVar);
                        JSONObject modelToJson = JsonUtils.modelToJson(aVar);
                        if (modelToJson != null) {
                            C113889km.m157550c(C0949kl.f2239i, "保存上报文件至本地");
                            C113887kh.m157526a(a2).mo172293a("reportFile", modelToJson.toString());
                        }
                    }
                }

                public final /* synthetic */ void callback(Object obj) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null) {
                        aVar.f340379b = (C113769b) JsonUtils.parseToModel(jSONObject, C113769b.class, new Object[0]);
                        C113760gf.m156972a(context, a2, aVar);
                        JSONObject modelToJson = JsonUtils.modelToJson(aVar);
                        if (modelToJson != null) {
                            C113889km.m157550c(C0949kl.f2239i, "保存上报文件至本地");
                            C113887kh.m157526a(a2).mo172293a("reportFile", modelToJson.toString());
                        }
                    }
                }
            });
            return false;
        }
        C113889km.m157550c(C0949kl.f2239i, "使用本地上报文件");
        return m156972a(context, a2, aVar);
    }
}
