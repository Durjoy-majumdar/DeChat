package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.rv */
public final class C114189rv {

    /* renamed from: f */
    private static final int f341873f = 7;

    /* renamed from: a */
    public C114322sx f341874a = null;

    /* renamed from: b */
    public C114185ru f341875b;

    /* renamed from: c */
    public OverSeaTileProvider f341876c;

    /* renamed from: d */
    public volatile boolean f341877d = false;

    /* renamed from: e */
    public boolean f341878e;

    /* renamed from: g */
    private TileOverlay f341879g = null;

    /* renamed from: h */
    private TileOverlayOptions f341880h;

    public C114189rv(C114322sx sxVar) {
        this.f341874a = sxVar;
        if (C80343jx.m97837a("4.5.12.4", "4.0.9")) {
            C113886kg.m157524c(C113959ml.m157965a(this.f341874a.mo171543G(), (TencentMapOptions) null).mo172401a() + "/tencentmapsdk/rastermap/unmainland");
            C113886kg.m157524c(C113959ml.m157965a(this.f341874a.mo171543G(), (TencentMapOptions) null).mo172403b().getPath() + "/rastermap/taiwan");
        }
    }

    /* renamed from: a */
    private void m159558a(Context context, OverSeaSource overSeaSource) {
        C114185ru ruVar = new C114185ru();
        this.f341875b = ruVar;
        if (context != null) {
            ruVar.f341863i = overSeaSource;
            C113865kb.m157396a(new C113865kb.C113879g<Boolean>(context, overSeaSource) {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Boolean call() {
                    C113889km.m157550c(C0949kl.f2238h, "开始初始化配置");
                    Context context = r2;
                    OverSeaSource overSeaSource = r3;
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
                        C114185ru.this.mo172829a(r2);
                    }
                    C113889km.m157550c(C0949kl.f2238h, "完成初始化配置");
                    return null;
                }
            }).mo172280a(Boolean.FALSE, (C113865kb.C113868a) null);
        }
    }

    /* renamed from: c */
    private boolean m159562c() {
        return this.f341877d;
    }

    /* renamed from: d */
    private void m159563d() {
        this.f341877d = true;
    }

    /* renamed from: e */
    private void m159564e() {
        TileOverlay tileOverlay = this.f341879g;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    /* renamed from: f */
    private void m159565f() {
        if (C80343jx.m97837a("4.5.12.4", "4.0.9")) {
            C113886kg.m157524c(C113959ml.m157965a(this.f341874a.mo171543G(), (TencentMapOptions) null).mo172401a() + "/tencentmapsdk/rastermap/unmainland");
            C113886kg.m157524c(C113959ml.m157965a(this.f341874a.mo171543G(), (TencentMapOptions) null).mo172403b().getPath() + "/rastermap/taiwan");
        }
    }

    /* renamed from: g */
    private void m159566g() {
        M m;
        C113961mq mqVar;
        C114322sx sxVar = this.f341874a;
        TileOverlay tileOverlay = this.f341879g;
        if (sxVar != null && (m = sxVar.f339878e_) != null && (mqVar = sxVar.f342647aD) != null && tileOverlay != null) {
            mqVar.mo172460j(((VectorMap) m).f342910p);
            mqVar.mo172461k(true);
            tileOverlay.remove();
            this.f341879g = null;
            this.f341880h = null;
        }
    }

    /* renamed from: h */
    private void m159567h() {
        C114322sx sxVar;
        C114199sd b;
        if (this.f341879g == null && (sxVar = this.f341874a) != null && sxVar.f339878e_ != null && sxVar.f342647aD != null && (b = this.f341875b.mo172833b()) != null) {
            C113889km.m157550c(C0949kl.f2238h, "获取海外图图源：".concat(String.valueOf(b)));
            C113961mq mqVar = this.f341874a.f342647aD;
            mqVar.mo172460j(false);
            mqVar.mo172461k(false);
            this.f341876c = new C114190rw(b, this.f341875b.f341863i, mqVar.f339861d);
            String d = this.f341875b.mo172835d();
            String a = this.f341875b.mo172828a();
            C113889km.m157550c(C0949kl.f2238h, "海外瓦片缓存目录：".concat(String.valueOf(a)));
            TileOverlayOptions diskCacheDir = new TileOverlayOptions().tileProvider(this.f341876c).betterQuality(false).versionInfo(d).zIndex(1).diskCacheDir(a);
            this.f341880h = diskCacheDir;
            this.f341879g = mqVar.f340878H.mo172738b(diskCacheDir);
            C113889km.m157550c(C0949kl.f2238h, "开启海外图");
        }
    }

    /* renamed from: i */
    private C114185ru m159568i() {
        return this.f341875b;
    }

    /* renamed from: j */
    private boolean m159569j() {
        return this.f341875b.f341859e;
    }

    /* renamed from: b */
    public final void mo172838b() {
        M m;
        C c;
        C113889km.m157550c(C0949kl.f2238h, "检查海外图状态");
        C114322sx sxVar = this.f341874a;
        if (sxVar != null && (m = sxVar.f339878e_) != null && (c = sxVar.f339876d_) != null) {
            if (((VectorMap) m).mo173490r() < 7) {
                m159566g();
                C113889km.m157550c(C0949kl.f2238h, "级别无效");
                return;
            }
            C113889km.m157550c(C0949kl.f2238h, "级别有效");
            if (!this.f341875b.f341859e || !c.f339863f) {
                if (this.f341879g != null) {
                    m159566g();
                }
                C113889km.m157550c(C0949kl.f2238h, "权限无效");
                return;
            }
            C113889km.m157550c(C0949kl.f2238h, "权限有效");
            if (!c.f339862e) {
                if (this.f341879g != null) {
                    m159566g();
                }
                C113889km.m157550c(C0949kl.f2238h, "边界线无效");
                return;
            }
            C113889km.m157550c(C0949kl.f2238h, "边界线有效");
            boolean z = this.f341875b.f341862h;
            StringBuilder sb = new StringBuilder("数据配置模式：");
            String str = "暗色";
            sb.append(z ? str : "亮色");
            C113889km.m157550c(C0949kl.f2238h, sb.toString());
            boolean l = ((C113961mq) this.f341874a.f339876d_).mo171803l();
            StringBuilder sb4 = new StringBuilder("当前地图模式：");
            if (!l) {
                str = "亮色";
            }
            sb4.append(str);
            C113889km.m157550c(C0949kl.f2238h, sb4.toString());
            if (l != z) {
                C113889km.m157550c(C0949kl.f2238h, "更新暗色模式：".concat(String.valueOf(l)));
                this.f341875b.mo172832a(l);
                m159566g();
                OverSeaTileProvider overSeaTileProvider = this.f341876c;
                if (overSeaTileProvider != null) {
                    overSeaTileProvider.onDayNightChange(z);
                }
            }
            if (this.f341878e) {
                this.f341878e = false;
                m159566g();
            }
            if (this.f341879g == null) {
                m159567h();
            }
        }
    }

    /* renamed from: a */
    public final void mo172837a() {
        mo172838b();
        TileOverlayOptions tileOverlayOptions = this.f341880h;
        if (tileOverlayOptions != null) {
            tileOverlayOptions.versionInfo(this.f341875b.mo172835d()).diskCacheDir(this.f341875b.mo172828a());
        }
        TileOverlay tileOverlay = this.f341879g;
        if (tileOverlay != null) {
            tileOverlay.reload();
        }
    }

    /* renamed from: a */
    private void m159559a(Language language) {
        if (language != null) {
            C114185ru ruVar = this.f341875b;
            if (ruVar.f341864j != language) {
                ruVar.f341864j = language;
                OverSeaTileProvider overSeaTileProvider = this.f341876c;
                if (overSeaTileProvider != null) {
                    overSeaTileProvider.onLanguageChange(language);
                }
                mo172837a();
            }
        }
    }

    /* renamed from: a */
    private boolean m159561a(C113741fw[] fwVarArr) {
        C114322sx sxVar = this.f341874a;
        if (sxVar == null) {
            return true;
        }
        C113741fw[] W = sxVar.mo172978W();
        if (fwVarArr == null) {
            return true;
        }
        return C114181rs.m159512a(W, fwVarArr);
    }

    /* renamed from: a */
    private void m159560a(OverSeaTileProvider overSeaTileProvider) {
        if (this.f341876c != overSeaTileProvider) {
            C113889km.m157550c(C0949kl.f2238h, "设置自定义海外图源，old[" + this.f341876c + "] to new[" + overSeaTileProvider + "]");
            this.f341876c = overSeaTileProvider;
            this.f341878e = true;
            C114185ru ruVar = this.f341875b;
            ruVar.f341865k = overSeaTileProvider;
            List<C114193ry> c = ruVar.mo172834c();
            C114322sx sxVar = this.f341874a;
            if (sxVar != null) {
                sxVar.mo172981a(false, c);
            }
            mo172837a();
        }
    }
}
