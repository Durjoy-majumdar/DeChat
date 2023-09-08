package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.map.tools.json.JsonEncoder;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.C113565bo;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.ps */
public final class C114081ps {

    /* renamed from: e */
    private static final int f341363e = 256;

    /* renamed from: f */
    private static final String f341364f = "custom-layer";

    /* renamed from: g */
    private static final String f341365g = "layer-infos";

    /* renamed from: a */
    public C114117qo f341366a;

    /* renamed from: b */
    public List<C114084pt> f341367b = new ArrayList();

    /* renamed from: c */
    public SharedPreferences f341368c;

    /* renamed from: d */
    public Set<C114083a> f341369d = new HashSet();

    /* renamed from: h */
    private Context f341370h;

    /* renamed from: com.tencent.mapsdk.internal.ps$a */
    public class C114083a implements JsonEncoder, JsonParser {

        /* renamed from: b */
        private static final String f341373b = "id";

        /* renamed from: c */
        private static final String f341374c = "version";
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f341376d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f341377e;

        private C114083a() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C114083a)) {
                return false;
            }
            C114083a aVar = (C114083a) obj;
            String str = this.f341376d;
            if (str == null ? aVar.f341376d != null : !str.equals(aVar.f341376d)) {
                return false;
            }
            String str2 = this.f341377e;
            String str3 = aVar.f341377e;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }

        public int hashCode() {
            String str = this.f341376d;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f341377e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public void parse(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f341376d = jSONObject.optString("id");
                this.f341377e = jSONObject.optString("version");
            }
        }

        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f341376d);
                jSONObject.put("version", this.f341377e);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public /* synthetic */ C114083a(C114081ps psVar, byte b) {
            this();
        }
    }

    public C114081ps(Context context, C114117qo qoVar, C113565bo.C113567b bVar) {
        this.f341370h = context;
        this.f341366a = qoVar;
        this.f341368c = C113887kh.m157525a(context, "custom-layer." + bVar.mo171818c());
        m158876a();
    }

    /* renamed from: a */
    private CustomLayer m158875a(CustomLayerOptions customLayerOptions) {
        if (this.f341366a == null) {
            return null;
        }
        customLayerOptions.getLayerId();
        C113896kq.m157668c(C0949kl.f2231a);
        C114117qo qoVar = this.f341366a;
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        String str = "custom_layer_" + C113904kw.m157758a(customLayerOptions.getLayerId());
        tileOverlayOptions.diskCacheDir(str);
        final C114084pt a = mo172665a(customLayerOptions.getLayerId());
        C113896kq.m157655a(C0949kl.f2231a, XWalkReaderBasePlugin.PARAM_KEY_CACHE_DIR, (Object) str);
        if (a != null) {
            C113896kq.m157655a(C0949kl.f2231a, ProviderConstants.API_COLNAME_FEATURE_VERSION, (Object) a.f341379b);
            C113896kq.m157655a(C0949kl.f2231a, "minZoom", (Object) Integer.valueOf(a.f341381d));
            C113896kq.m157655a(C0949kl.f2231a, "maxZoom", (Object) Integer.valueOf(a.f341380c));
            C113896kq.m157655a(C0949kl.f2231a, "layerId", (Object) a.f341378a);
            tileOverlayOptions.tileProvider(new UrlTileProvider() {
                public final URL getTileUrl(int i, int i2, int i3) {
                    C114084pt ptVar = r5;
                    if (i3 <= ptVar.f341380c && i3 >= ptVar.f341381d) {
                        try {
                            return new URL(r5.mo172669a(i, i2, i3));
                        } catch (MalformedURLException unused) {
                        }
                    }
                    return null;
                }
            });
            tileOverlayOptions.versionInfo(a.f341379b);
        }
        C114110qj a2 = qoVar.mo172733a(tileOverlayOptions);
        C114084pt a3 = mo172665a(customLayerOptions.getLayerId());
        if (!(a2 == null || a3 == null)) {
            if (a3.f341382e) {
                a2.mo172013e();
                a3.f341382e = false;
            }
            a2.mo172728a(a3.f341381d, a3.f341380c);
        }
        this.f341366a.f341590h.f339861d.mo172156c().f340447a++;
        C113896kq.m157674e(C0949kl.f2231a);
        return new C113526au(a2);
    }

    /* renamed from: b */
    private void m158879b() {
        boolean z;
        boolean z2;
        if (!this.f341369d.isEmpty() || this.f341367b.isEmpty()) {
            z = false;
            for (C114084pt next : this.f341367b) {
                Iterator<C114083a> it = this.f341369d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    C114083a next2 = it.next();
                    if (next2.f341376d.equals(next.f341378a)) {
                        if (!next2.f341377e.equalsIgnoreCase(next.f341379b)) {
                            next.f341382e = true;
                            String unused = next2.f341377e = next.f341379b;
                        }
                        z2 = true;
                    }
                }
                if (!z2) {
                    C114083a aVar = new C114083a(this, (byte) 0);
                    String unused2 = aVar.f341376d = next.f341378a;
                    String unused3 = aVar.f341377e = next.f341379b;
                    this.f341369d.add(aVar);
                    z = true;
                }
            }
        } else {
            z = false;
            for (C114084pt next3 : this.f341367b) {
                C114083a aVar2 = new C114083a(this, (byte) 0);
                String unused4 = aVar2.f341376d = next3.f341378a;
                String unused5 = aVar2.f341377e = next3.f341379b;
                this.f341369d.add(aVar2);
                z = true;
            }
        }
        if (z) {
            C113887kh.m157526a(this.f341368c).mo172293a(f341365g, JsonUtils.collectionToJson(this.f341369d));
        }
    }

    /* renamed from: b */
    private TileOverlayOptions m158878b(CustomLayerOptions customLayerOptions) {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        String str = "custom_layer_" + C113904kw.m157758a(customLayerOptions.getLayerId());
        tileOverlayOptions.diskCacheDir(str);
        final C114084pt a = mo172665a(customLayerOptions.getLayerId());
        C113896kq.m157655a(C0949kl.f2231a, XWalkReaderBasePlugin.PARAM_KEY_CACHE_DIR, (Object) str);
        if (a != null) {
            C113896kq.m157655a(C0949kl.f2231a, ProviderConstants.API_COLNAME_FEATURE_VERSION, (Object) a.f341379b);
            C113896kq.m157655a(C0949kl.f2231a, "minZoom", (Object) Integer.valueOf(a.f341381d));
            C113896kq.m157655a(C0949kl.f2231a, "maxZoom", (Object) Integer.valueOf(a.f341380c));
            C113896kq.m157655a(C0949kl.f2231a, "layerId", (Object) a.f341378a);
            tileOverlayOptions.tileProvider(new UrlTileProvider() {
                public final URL getTileUrl(int i, int i2, int i3) {
                    C114084pt ptVar = a;
                    if (i3 <= ptVar.f341380c && i3 >= ptVar.f341381d) {
                        try {
                            return new URL(a.mo172669a(i, i2, i3));
                        } catch (MalformedURLException unused) {
                        }
                    }
                    return null;
                }
            });
            tileOverlayOptions.versionInfo(a.f341379b);
        }
        return tileOverlayOptions;
    }

    /* renamed from: a */
    public final C114084pt mo172665a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C114084pt next : this.f341367b) {
            if (next != null && str.equals(next.f341378a)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m158876a() {
        SharedPreferences sharedPreferences = this.f341368c;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(f341365g, (String) null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            Set<C114083a> set = this.f341369d;
                            set.add((C114083a) JsonUtils.parseToModel(jSONArray.getJSONObject(i), C114083a.class, this));
                        } catch (JSONException unused) {
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m158877a(C114080pr prVar) {
        boolean z;
        boolean z2;
        if (prVar != null && prVar.f341361a) {
            this.f341367b.clear();
            this.f341367b.addAll(prVar.f341362b);
            if (!this.f341369d.isEmpty() || this.f341367b.isEmpty()) {
                z = false;
                for (C114084pt next : this.f341367b) {
                    Iterator<C114083a> it = this.f341369d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        C114083a next2 = it.next();
                        if (next2.f341376d.equals(next.f341378a)) {
                            if (!next2.f341377e.equalsIgnoreCase(next.f341379b)) {
                                next.f341382e = true;
                                String unused = next2.f341377e = next.f341379b;
                            }
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        C114083a aVar = new C114083a(this, (byte) 0);
                        String unused2 = aVar.f341376d = next.f341378a;
                        String unused3 = aVar.f341377e = next.f341379b;
                        this.f341369d.add(aVar);
                        z = true;
                    }
                }
            } else {
                z = false;
                for (C114084pt next3 : this.f341367b) {
                    C114083a aVar2 = new C114083a(this, (byte) 0);
                    String unused4 = aVar2.f341376d = next3.f341378a;
                    String unused5 = aVar2.f341377e = next3.f341379b;
                    this.f341369d.add(aVar2);
                    z = true;
                }
            }
            if (z) {
                C113887kh.m157526a(this.f341368c).mo172293a(f341365g, JsonUtils.collectionToJson(this.f341369d));
            }
        }
    }
}
