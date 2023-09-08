package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.ru */
public final class C114185ru {

    /* renamed from: a */
    public int f341855a = C114197sb.f341907a;

    /* renamed from: b */
    public int f341856b = 1000;

    /* renamed from: c */
    public int f341857c = C114197sb.f341909c;

    /* renamed from: d */
    public int f341858d = 0;

    /* renamed from: e */
    public volatile boolean f341859e = false;

    /* renamed from: f */
    public int f341860f = 0;

    /* renamed from: g */
    public C114198sc f341861g;

    /* renamed from: h */
    public boolean f341862h;

    /* renamed from: i */
    public OverSeaSource f341863i = OverSeaSource.DEFAULT;

    /* renamed from: j */
    public Language f341864j = Language.zh;

    /* renamed from: k */
    public OverSeaTileProvider f341865k;

    /* renamed from: l */
    private String f341866l = null;

    /* renamed from: com.tencent.mapsdk.internal.ru$3 */
    public static /* synthetic */ class C1141883 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f341872a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource[] r0 = com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f341872a = r0
                com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource r1 = com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f341872a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource r1 = com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.SPARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114185ru.C1141883.<clinit>():void");
        }
    }

    /* renamed from: e */
    private int m159538e() {
        return this.f341858d;
    }

    /* renamed from: f */
    private boolean m159539f() {
        return this.f341859e;
    }

    /* renamed from: g */
    private int m159540g() {
        return this.f341860f;
    }

    /* renamed from: h */
    private C114196sa m159541h() {
        C114197sb sbVar;
        C114198sc scVar = this.f341861g;
        if (scVar == null || (sbVar = scVar.f341918b) == null) {
            return null;
        }
        return sbVar.f341914h;
    }

    /* renamed from: i */
    private boolean m159542i() {
        return this.f341862h;
    }

    /* renamed from: j */
    private OverSeaSource m159543j() {
        return this.f341863i;
    }

    /* renamed from: k */
    private int m159544k() {
        int i = C1141883.f341872a[this.f341863i.ordinal()];
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: l */
    private Language m159545l() {
        return this.f341864j;
    }

    /* renamed from: m */
    private OverSeaTileProvider m159546m() {
        return this.f341865k;
    }

    /* renamed from: c */
    public final List<C114193ry> mo172834c() {
        C114198sc scVar = this.f341861g;
        if (scVar == null) {
            return null;
        }
        if (this.f341865k == null) {
            return m159537c(scVar.f341918b);
        }
        ArrayList arrayList = new ArrayList(m159537c(this.f341861g.f341918b));
        C114193ry ryVar = new C114193ry();
        ryVar.f341891a = new int[]{0, 18};
        ArrayList arrayList2 = new ArrayList();
        C114194rz rzVar = new C114194rz();
        rzVar.f341897b = C114181rs.f341835a;
        rzVar.f341903h = true;
        rzVar.f341896a = 1;
        rzVar.f341898c = this.f341865k.getProviderName();
        rzVar.f341901f = this.f341865k.getLogo(true);
        rzVar.f341902g = this.f341865k.getLogo(false);
        arrayList2.add(rzVar);
        ryVar.f341892b = arrayList2;
        arrayList.add(0, ryVar);
        return arrayList;
    }

    /* renamed from: d */
    public final String mo172835d() {
        if (this.f341865k != null) {
            return this.f341865k.getProviderVersion() + File.separator + this.f341864j.name();
        }
        C114199sd b = mo172833b();
        if (b == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b.f341921c);
        String str = File.separator;
        sb.append(str);
        sb.append(b.f341920b);
        sb.append(str);
        sb.append(b.f341922d);
        sb.append(str);
        sb.append(this.f341864j.name());
        return sb.toString();
    }

    /* renamed from: b */
    private File m159534b(Context context) {
        return new File(C113959ml.m157965a(context, (TencentMapOptions) null).mo172403b(), mo172828a());
    }

    /* renamed from: a */
    private boolean m159532a(Context context, String str) {
        C114197sb sbVar;
        boolean z;
        C113889km.m157550c(C0949kl.f2238h, "开始更新配置：".concat(String.valueOf(str)));
        C114198sc scVar = (C114198sc) JsonUtils.parseToModel(str, C114198sc.class, new Object[0]);
        if (scVar == null || (sbVar = scVar.f341918b) == null) {
            C113889km.m157550c(C0949kl.f2238h, "配置更新数据解析失败，使用上次的配置");
            return false;
        }
        if (scVar.f341917a != 0) {
            z = this.f341859e;
            this.f341859e = false;
        } else {
            z = !this.f341859e;
            this.f341859e = true;
        }
        C113889km.m157550c(C0949kl.f2238h, "权限是否更新：".concat(String.valueOf(z)));
        boolean z2 = sbVar.f341913g != this.f341858d;
        C113889km.m157550c(C0949kl.f2238h, "协议版本是否更新：".concat(String.valueOf(z2)));
        if (!z && !z2) {
            return false;
        }
        C114192rx a = mo172827a(sbVar);
        if (a != null) {
            int i = a.f341889d;
            C114199sd sdVar = a.f341890e;
            if (sdVar != null) {
                int i2 = sdVar.f341922d;
                int i3 = sdVar.f341920b;
                C113889km.m157550c(C0949kl.f2238h, "版本对比: old[" + this.f341857c + "]-new[" + i2 + "]");
                C113889km.m157550c(C0949kl.f2238h, "样式对比: old[" + this.f341856b + "]-new[" + i3 + "]");
                if (!(i2 == this.f341857c && i3 == this.f341856b && i == this.f341855a)) {
                    File file = new File(C113959ml.m157965a(context, (TencentMapOptions) null).mo172403b(), mo172828a());
                    if (file.exists()) {
                        C113884kf.m157500b(file);
                        C113889km.m157550c(C0949kl.f2238h, "删除海外图缓存目录: ".concat(String.valueOf(file)));
                    }
                }
            }
        }
        C114196sa saVar = sbVar.f341914h;
        if (saVar != null) {
            String str2 = saVar.f341906b;
            C113889km.m157550c(C0949kl.f2238h, "配置边界线: ".concat(String.valueOf(str2)));
            mo172831a(str2);
            saVar.f341905a = this.f341860f;
        }
        this.f341861g = scVar;
        OverSeaSource overSeaSource = this.f341863i;
        C113958mk a2 = C113958mk.m157962a(context);
        int i4 = C1141883.f341872a[overSeaSource.ordinal()];
        if (i4 == 1) {
            a2.mo172395a(C0939el.f2177g, str);
        } else if (i4 == 2) {
            a2.mo172395a("worldMapConfig_BING", str);
        }
        mo172830a(this.f341861g);
        C113889km.m157550c(C0949kl.f2238h, "配置更新完成");
        return true;
    }

    /* renamed from: b */
    public final C114199sd mo172833b() {
        C114198sc scVar = this.f341861g;
        if (scVar == null) {
            return null;
        }
        return m159533b(scVar.f341918b);
    }

    /* renamed from: b */
    private C114199sd m159533b(C114197sb sbVar) {
        C114192rx a;
        if (sbVar == null || (a = mo172827a(sbVar)) == null) {
            return null;
        }
        return a.f341890e;
    }

    /* renamed from: b */
    private static /* synthetic */ String m159535b(Context context, OverSeaSource overSeaSource) {
        C113958mk a = C113958mk.m157962a(context);
        int i = C1141883.f341872a[overSeaSource.ordinal()];
        if (i == 1) {
            return a.mo172391a(C0939el.f2177g);
        }
        if (i != 2) {
            return null;
        }
        return a.mo172391a("worldMapConfig_BING");
    }

    /* renamed from: c */
    private static List<C114193ry> m159537c(C114197sb sbVar) {
        if (sbVar != null) {
            return sbVar.f341916j;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo172831a(String str) {
        byte[] bArr;
        if (str != null && str.length() != 0) {
            C113889km.m157550c(C0949kl.f2238h, "下载新边界数据：".concat(str));
            try {
                NetResponse doStream = NetManager.getInstance().builder().gzip().url(str).doStream();
                InputStream inputStream = doStream.getInputStream();
                if (doStream.statusCode == 200) {
                    String str2 = TextUtils.isEmpty(doStream.contentEncoding) ? "gzip" : doStream.contentEncoding;
                    if (str2 != null && str2.length() > 0 && str2.toLowerCase().contains("gzip")) {
                        bArr = C80344ki.m97845a(inputStream);
                    } else {
                        bArr = C113886kg.m157522b(inputStream);
                    }
                    if (bArr != null && bArr.length > 0) {
                        String str3 = new String(bArr);
                        C114181rs.m159508a();
                        this.f341860f = C114181rs.m159513b(str3);
                        C113889km.m157550c(C0949kl.f2238h, "新边界数据版本号：" + this.f341860f);
                        C114181rs.m159508a().mo172822a(str3);
                    }
                }
            } catch (Throwable th) {
                C113889km.m157547b(C0949kl.f2238h, th);
            }
        }
    }

    /* renamed from: a */
    public final String mo172828a() {
        String str;
        boolean z;
        OverSeaTileProvider overSeaTileProvider = this.f341865k;
        if (overSeaTileProvider != null) {
            z = overSeaTileProvider.onDayNightChange(this.f341862h);
            str = "rastermap/customoversea/" + this.f341865k.getProviderName();
        } else if (C1141883.f341872a[this.f341863i.ordinal()] != 2) {
            z = true;
            str = "rastermap/world";
        } else {
            z = false;
            str = "rastermap/bingworld";
        }
        return str + ((!this.f341862h || !z) ? "" : "/dark");
    }

    /* renamed from: a */
    private void m159528a(final Context context, final OverSeaSource overSeaSource, final Callback<Boolean> callback) {
        if (context != null) {
            this.f341863i = overSeaSource;
            C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Boolean call() {
                    C113889km.m157550c(C0949kl.f2238h, "开始初始化配置");
                    Context context = context;
                    OverSeaSource overSeaSource = overSeaSource;
                    C113958mk a = C113958mk.m157962a(context);
                    int i = C1141883.f341872a[overSeaSource.ordinal()];
                    String a2 = i != 1 ? i != 2 ? null : a.mo172391a("worldMapConfig_BING") : a.mo172391a(C0939el.f2177g);
                    C113889km.m157550c(C0949kl.f2238h, "本地配置数据：".concat(String.valueOf(a2)));
                    if (!C40002he.m42805a(a2)) {
                        try {
                            C114185ru.this.f341861g = (C114198sc) JsonUtils.parseToModel(new JSONObject(a2), C114198sc.class, new Object[0]);
                        } catch (JSONException e) {
                            C113889km.m157547b(C0949kl.f2238h, (Throwable) e);
                        }
                        C114185ru ruVar = C114185ru.this;
                        ruVar.mo172830a(ruVar.f341861g);
                    } else if (C80343jx.m97837a("4.5.12.4", "4.3.1")) {
                        C114185ru.this.mo172829a(context);
                    }
                    C113889km.m157550c(C0949kl.f2238h, "完成初始化配置");
                    return null;
                }
            }).mo172280a(Boolean.FALSE, callback != null ? new C113865kb.C113868a<Boolean>() {
                /* renamed from: a */
                private void m159556a(Boolean bool) {
                    callback.callback(bool);
                }

                public final /* bridge */ /* synthetic */ void callback(Object obj) {
                    callback.callback((Boolean) obj);
                }
            } : null);
        }
    }

    /* renamed from: a */
    private static String m159527a(Context context, OverSeaSource overSeaSource) {
        C113958mk a = C113958mk.m157962a(context);
        int i = C1141883.f341872a[overSeaSource.ordinal()];
        if (i == 1) {
            return a.mo172391a(C0939el.f2177g);
        }
        if (i != 2) {
            return null;
        }
        return a.mo172391a("worldMapConfig_BING");
    }

    /* renamed from: a */
    private static void m159529a(Context context, OverSeaSource overSeaSource, String str) {
        C113958mk a = C113958mk.m157962a(context);
        int i = C1141883.f341872a[overSeaSource.ordinal()];
        if (i == 1) {
            a.mo172395a(C0939el.f2177g, str);
        } else if (i == 2) {
            a.mo172395a("worldMapConfig_BING", str);
        }
    }

    /* renamed from: a */
    public final void mo172829a(Context context) {
        C113958mk a = C113958mk.m157962a(context);
        C113889km.m157550c(C0949kl.f2238h, "兼容老数据");
        int b = a.mo172398b(C0939el.f2179i, 1000);
        int b2 = a.mo172398b(C0939el.f2180j, C114197sb.f341907a);
        int b3 = a.mo172398b(C0939el.f2181k, C114197sb.f341909c);
        int i = 0;
        int b4 = a.mo172398b(C0939el.f2183m, 0);
        boolean c = a.mo172400c(C0939el.f2178h);
        String a2 = a.mo172391a(C0939el.f2184n);
        int[] iArr = new int[0];
        try {
            String a3 = a.mo172391a(C0939el.f2185o);
            if (!C40002he.m42805a(a3)) {
                JSONArray jSONArray = new JSONArray(a3);
                int length = jSONArray.length();
                iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = jSONArray.getInt(i2);
                }
            }
        } catch (Exception e) {
            C113889km.m157547b(C0949kl.f2238h, (Throwable) e);
        }
        String a4 = a.mo172391a(C0939el.f2186p);
        int b5 = a.mo172398b(C0939el.f2182l, 0);
        C114192rx rxVar = new C114192rx();
        rxVar.f341889d = 1;
        C114199sd sdVar = new C114199sd();
        sdVar.f341923e = a2;
        sdVar.f341924f = iArr;
        sdVar.f341921c = b2;
        sdVar.f341920b = b;
        sdVar.f341922d = b3;
        rxVar.f341890e = sdVar;
        C114197sb sbVar = new C114197sb();
        sbVar.f341913g = b4;
        List<C114193ry> list = null;
        try {
            if (!C40002he.m42805a(a4)) {
                list = JsonUtils.parseToList(new JSONArray(a4), C114193ry.class, new Object[0]);
            }
        } catch (JSONException e2) {
            C113889km.m157547b(C0949kl.f2238h, (Throwable) e2);
        }
        sbVar.f341916j = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(rxVar);
        sbVar.f341915i = arrayList;
        C114196sa saVar = new C114196sa();
        saVar.f341905a = b5;
        sbVar.f341914h = saVar;
        C114198sc scVar = new C114198sc();
        this.f341861g = scVar;
        if (!c) {
            i = -1;
        }
        scVar.f341917a = i;
        scVar.f341918b = sbVar;
        String jSONObject = scVar.toJson().toString();
        C113889km.m157550c(C0949kl.f2238h, "老数据：".concat(String.valueOf(jSONObject)));
        a.mo172395a(C0939el.f2177g, jSONObject);
        a.mo172396a(new String[]{C0939el.f2179i, C0939el.f2180j, C0939el.f2181k, C0939el.f2183m, C0939el.f2178h, C0939el.f2184n, C0939el.f2185o, C0939el.f2186p, C0939el.f2182l});
        mo172830a(this.f341861g);
    }

    /* renamed from: a */
    public final void mo172832a(boolean z) {
        C113889km.m157550c(C0949kl.f2238h, "使用海外暗色模式？".concat(String.valueOf(z)));
        this.f341862h = z;
    }

    /* renamed from: a */
    private void m159531a(OverSeaTileProvider overSeaTileProvider) {
        this.f341865k = overSeaTileProvider;
    }

    /* renamed from: a */
    private void m159530a(Language language) {
        this.f341864j = language;
    }

    /* renamed from: a */
    public final void mo172830a(C114198sc scVar) {
        if (scVar != null) {
            C114197sb sbVar = scVar.f341918b;
            if (sbVar != null) {
                this.f341858d = sbVar.f341913g;
                C113889km.m157550c(C0949kl.f2238h, "更新版本：" + this.f341858d);
                C114196sa saVar = sbVar.f341914h;
                if (saVar != null) {
                    this.f341860f = saVar.f341905a;
                    C113889km.m157550c(C0949kl.f2238h, "更新边界版本：" + this.f341857c);
                }
            }
            C114199sd b = m159533b(sbVar);
            if (b != null) {
                this.f341856b = b.f341920b;
                this.f341855a = b.f341921c;
                this.f341857c = b.f341922d;
                this.f341866l = b.f341923e;
                C113889km.m157550c(C0949kl.f2238h, "更新图源版本：" + this.f341857c);
            }
            this.f341859e = scVar.f341917a == 0;
        }
    }

    /* renamed from: a */
    public final C114192rx mo172827a(C114197sb sbVar) {
        List<C114192rx> list;
        if (sbVar == null || (list = sbVar.f341915i) == null) {
            return null;
        }
        for (C114192rx next : list) {
            int i = next.f341889d;
            if (i == 2 && this.f341862h) {
                return next;
            }
            if (i == 1 && !this.f341862h) {
                return next;
            }
        }
        return null;
    }
}
