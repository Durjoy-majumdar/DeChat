package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.AsyncTask;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.C114185ru;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mapsdk.internal.pn */
public final class C114072pn extends AsyncTask<Object, Void, Boolean> {

    /* renamed from: a */
    private WeakReference<Context> f341334a;

    /* renamed from: b */
    private WeakReference<C114073a> f341335b;

    /* renamed from: c */
    private C114185ru f341336c;

    /* renamed from: com.tencent.mapsdk.internal.pn$a */
    public interface C114073a {
        /* renamed from: a */
        void mo172654a(boolean z, C114185ru ruVar);
    }

    public C114072pn(C113540bh bhVar, C114073a aVar) {
        this.f341334a = new WeakReference<>(bhVar.f339764c);
        this.f341336c = bhVar.f339763b.f342584k.f341875b;
        this.f341335b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    private Boolean m158840a() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f341334a.get() == null) {
            return Boolean.FALSE;
        }
        Context context = this.f341334a.get();
        try {
            C113613cz czVar = (C113613cz) ((C113631dn) C113601cl.m156511a(C113631dn.class)).mo171932h();
            String a = C113798hb.m157068a();
            String i = C113798hb.m157092i();
            int i2 = this.f341336c.f341858d;
            String d = C113798hb.m157085d();
            C114185ru ruVar = this.f341336c;
            int i3 = ruVar.f341860f;
            int[] iArr = C114185ru.C1141883.f341872a;
            int i4 = iArr[ruVar.f341863i.ordinal()];
            NetResponse checkAuth = czVar.checkAuth(a, i, i2, d, i3, 3, i4 != 1 ? i4 != 2 ? 0 : 1 : 2);
            if (checkAuth != null) {
                if (checkAuth.available()) {
                    String netResponse = checkAuth.toString();
                    if (netResponse != null) {
                        if (netResponse.length() != 0) {
                            C114185ru ruVar2 = this.f341336c;
                            C113889km.m157550c(C0949kl.f2238h, "开始更新配置：".concat(netResponse));
                            C114198sc scVar = (C114198sc) JsonUtils.parseToModel(netResponse, C114198sc.class, new Object[0]);
                            if (scVar != null) {
                                C114197sb sbVar = scVar.f341918b;
                                if (sbVar != null) {
                                    if (scVar.f341917a != 0) {
                                        boolean z4 = ruVar2.f341859e;
                                        ruVar2.f341859e = false;
                                        z2 = z4;
                                        z3 = true;
                                    } else {
                                        if (!ruVar2.f341859e) {
                                            z3 = true;
                                            z2 = true;
                                        } else {
                                            z3 = true;
                                            z2 = false;
                                        }
                                        ruVar2.f341859e = z3;
                                    }
                                    C113889km.m157550c(C0949kl.f2238h, "权限是否更新：".concat(String.valueOf(z2)));
                                    boolean z5 = sbVar.f341913g != ruVar2.f341858d;
                                    C113889km.m157550c(C0949kl.f2238h, "协议版本是否更新：".concat(String.valueOf(z5)));
                                    if (z5 || z2) {
                                        C114192rx a2 = ruVar2.mo172827a(sbVar);
                                        if (a2 != null) {
                                            int i5 = a2.f341889d;
                                            C114199sd sdVar = a2.f341890e;
                                            if (sdVar != null) {
                                                int i6 = sdVar.f341922d;
                                                int i7 = sdVar.f341920b;
                                                C113889km.m157550c(C0949kl.f2238h, "版本对比: old[" + ruVar2.f341857c + "]-new[" + i6 + "]");
                                                C113889km.m157550c(C0949kl.f2238h, "样式对比: old[" + ruVar2.f341856b + "]-new[" + i7 + "]");
                                                if (!(i6 == ruVar2.f341857c && i7 == ruVar2.f341856b && i5 == ruVar2.f341855a)) {
                                                    File file = new File(C113959ml.m157965a(context, (TencentMapOptions) null).mo172403b(), ruVar2.mo172828a());
                                                    if (file.exists()) {
                                                        C113884kf.m157500b(file);
                                                        C113889km.m157550c(C0949kl.f2238h, "删除海外图缓存目录: ".concat(String.valueOf(file)));
                                                    }
                                                }
                                            }
                                        }
                                        C114196sa saVar = sbVar.f341914h;
                                        if (saVar != null) {
                                            String str = saVar.f341906b;
                                            C113889km.m157550c(C0949kl.f2238h, "配置边界线: ".concat(String.valueOf(str)));
                                            ruVar2.mo172831a(str);
                                            saVar.f341905a = ruVar2.f341860f;
                                        }
                                        ruVar2.f341861g = scVar;
                                        OverSeaSource overSeaSource = ruVar2.f341863i;
                                        C113958mk a3 = C113958mk.m157962a(context);
                                        int i8 = iArr[overSeaSource.ordinal()];
                                        if (i8 == z3) {
                                            a3.mo172395a(C0939el.f2177g, netResponse);
                                        } else if (i8 == 2) {
                                            a3.mo172395a("worldMapConfig_BING", netResponse);
                                        }
                                        ruVar2.mo172830a(ruVar2.f341861g);
                                        C113889km.m157550c(C0949kl.f2238h, "配置更新完成");
                                        z = true;
                                        return Boolean.valueOf(z);
                                    }
                                }
                            }
                            C113889km.m157550c(C0949kl.f2238h, "配置更新数据解析失败，使用上次的配置");
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            return Boolean.FALSE;
        } catch (Throwable th) {
            String message = th.getMessage();
            C113890kn knVar = C113889km.f340717a;
            if (knVar != null) {
                knVar.mo172309b(message, th);
            } else {
                C113889km.m157552c(message, th);
            }
            return Boolean.FALSE;
        }
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m158840a();
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        super.onPostExecute(bool);
        WeakReference<C114073a> weakReference = this.f341335b;
        if (weakReference != null && weakReference.get() != null) {
            this.f341335b.get().mo172654a(bool.booleanValue(), this.f341336c);
        }
    }

    /* renamed from: a */
    private void m158841a(Boolean bool) {
        super.onPostExecute(bool);
        WeakReference<C114073a> weakReference = this.f341335b;
        if (weakReference != null && weakReference.get() != null) {
            this.f341335b.get().mo172654a(bool.booleanValue(), this.f341336c);
        }
    }

    /* renamed from: a */
    private boolean m158842a(Context context, String str) {
        C114197sb sbVar;
        boolean z;
        if (!(str == null || str.length() == 0)) {
            C114185ru ruVar = this.f341336c;
            C113889km.m157550c(C0949kl.f2238h, "开始更新配置：".concat(str));
            C114198sc scVar = (C114198sc) JsonUtils.parseToModel(str, C114198sc.class, new Object[0]);
            if (scVar == null || (sbVar = scVar.f341918b) == null) {
                C113889km.m157550c(C0949kl.f2238h, "配置更新数据解析失败，使用上次的配置");
            } else {
                if (scVar.f341917a != 0) {
                    z = ruVar.f341859e;
                    ruVar.f341859e = false;
                } else {
                    z = !ruVar.f341859e;
                    ruVar.f341859e = true;
                }
                C113889km.m157550c(C0949kl.f2238h, "权限是否更新：".concat(String.valueOf(z)));
                boolean z2 = sbVar.f341913g != ruVar.f341858d;
                C113889km.m157550c(C0949kl.f2238h, "协议版本是否更新：".concat(String.valueOf(z2)));
                if (!z && !z2) {
                    return false;
                }
                C114192rx a = ruVar.mo172827a(sbVar);
                if (a != null) {
                    int i = a.f341889d;
                    C114199sd sdVar = a.f341890e;
                    if (sdVar != null) {
                        int i2 = sdVar.f341922d;
                        int i3 = sdVar.f341920b;
                        C113889km.m157550c(C0949kl.f2238h, "版本对比: old[" + ruVar.f341857c + "]-new[" + i2 + "]");
                        C113889km.m157550c(C0949kl.f2238h, "样式对比: old[" + ruVar.f341856b + "]-new[" + i3 + "]");
                        if (!(i2 == ruVar.f341857c && i3 == ruVar.f341856b && i == ruVar.f341855a)) {
                            File file = new File(C113959ml.m157965a(context, (TencentMapOptions) null).mo172403b(), ruVar.mo172828a());
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
                    ruVar.mo172831a(str2);
                    saVar.f341905a = ruVar.f341860f;
                }
                ruVar.f341861g = scVar;
                OverSeaSource overSeaSource = ruVar.f341863i;
                C113958mk a2 = C113958mk.m157962a(context);
                int i4 = C114185ru.C1141883.f341872a[overSeaSource.ordinal()];
                if (i4 == 1) {
                    a2.mo172395a(C0939el.f2177g, str);
                } else if (i4 == 2) {
                    a2.mo172395a("worldMapConfig_BING", str);
                }
                ruVar.mo172830a(ruVar.f341861g);
                C113889km.m157550c(C0949kl.f2238h, "配置更新完成");
                return true;
            }
        }
        return false;
    }
}
