package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetConfig;
import com.tencent.map.tools.net.NetManager;
import com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest;
import com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse;
import com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult;
import com.tencent.mapsdk.core.components.protocol.jce.sso.Header;
import com.tencent.mapsdk.core.components.protocol.jce.sso.Package;
import com.tencent.mapsdk.core.components.protocol.jce.sso.Tag;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Response;
import com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t;
import com.tencent.mapsdk.internal.C113596ci;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.cl */
public class C113601cl extends C113564bn implements C113595ch, TencentMapProtocol {

    /* renamed from: a */
    private static final String f339988a = "cuid";

    /* renamed from: b */
    private static final String f339989b = "duid";

    /* renamed from: c */
    private static final String f339990c = "sessionid";

    /* renamed from: g */
    private static final Stack<C113590cd> f339991g = new Stack<>();

    /* renamed from: h */
    private static final C113590cd f339992h = new C113592ce();

    /* renamed from: d */
    private C113590cd f339993d;

    /* renamed from: e */
    private final Map<String, String> f339994e = new HashMap();

    /* renamed from: f */
    private TencentMapOptions f339995f;

    /* renamed from: com.tencent.mapsdk.internal.cl$a */
    public static class C113602a implements TencentMapServiceProtocol.IMapService {

        /* renamed from: a */
        public C113596ci.C113597a f339996a;

        public C113602a(C113596ci.C113597a aVar) {
            this.f339996a = aVar;
        }

        public final void setAllow(boolean z) {
            this.f339996a.mo171921a(z);
        }

        public final void setUseHttps(boolean z) {
            this.f339996a.mo171923c(z);
        }

        public final void setUseTest(boolean z) {
            this.f339996a.mo171922b(z);
        }
    }

    public C113601cl() {
    }

    /* renamed from: e */
    public static C113604cn m156515e() {
        Stack<C113590cd> stack = f339991g;
        return stack.isEmpty() ? new C113605co() : stack.peek().f339971b;
    }

    /* renamed from: f */
    private static HashMap<String, String> m156516f() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("apikey.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
        hashMap.put("vectorsdk.map.qq.com/mvd_map", "map_nf_mvd");
        hashMap.put("vectorsdk.map.qq.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("p0.map.gtimg.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("vectorsdk.map.qq.com/indoormap2", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormap2/index", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx/index", "map_nf_indoor");
        hashMap.put("tafrtt.map.qq.com/rttserverex/", "map_nf_trfc");
        hashMap.put("p0.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p1.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p2.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p3.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("apikey.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
        hashMap.put("overseactrl.map.qq.com", "map_nf_wdVer");
        hashMap.put("s0.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s1.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s2.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s3.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("confinfo.map.qq.com/confinfo", "map_nf_hdVer");
        hashMap.put("p0.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p1.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p2.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p3.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("sdkgw.map.qq.com/map/traffic/event", "map_nf_pnt");
        hashMap.put("sdkgw.map.qq.com/map/poi/detail", "map_nf_aoi");
        hashMap.put("mapapi.qq.com/sdk/", "map_nf_res");
        hashMap.put("wecar.myapp.com/myapp/mapwecar", "map_nf_res");
        hashMap.put("map.myapp.com/soso_map/", "map_nf_off");
        hashMap.put("pr.map.qq.com/ditusdk/monitor", "map_nf_pr");
        hashMap.put("pr.map.qq.com/pingd", "map_nf_pr");
        hashMap.put("s0.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s1.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s2.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s3.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("datalayer.map.qq.com/console/datalayer/data", "map_nf_visLyr");
        return hashMap;
    }

    /* renamed from: a */
    public final void mo171781a(C113565bo boVar, Bundle bundle) {
        super.mo171781a(boVar, bundle);
        C113798hb.m157075a(m156515e().mo171939a());
    }

    /* renamed from: a_ */
    public final List<Class<? extends C114029p>> mo171919a_() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Basic.class);
        arrayList.add(Detail.class);
        arrayList.add(Response.class);
        arrayList.add(RttRequest.class);
        arrayList.add(RttResponse.class);
        arrayList.add(user_login_t.class);
        arrayList.add(CmdResult.class);
        arrayList.add(Header.class);
        arrayList.add(Package.class);
        arrayList.add(Tag.class);
        arrayList.add(CSFileUpdateReq.class);
        arrayList.add(FileUpdateReq.class);
        arrayList.add(FileUpdateRsp.class);
        arrayList.add(SCFileUpdateRsp.class);
        return arrayList;
    }

    /* renamed from: b */
    public final void mo171783b(C113565bo boVar) {
        C113590cd cdVar;
        super.mo171783b(boVar);
        Stack<C113590cd> stack = f339991g;
        if (!stack.isEmpty() && (cdVar = this.f339993d) != null) {
            stack.remove(cdVar);
            this.f339993d = null;
        }
    }

    /* renamed from: c */
    public final Map<String, String> mo171920c() {
        TencentMapOptions tencentMapOptions = this.f339995f;
        if (tencentMapOptions != null) {
            m156514b(f339988a, tencentMapOptions.getCustomUserId());
        }
        m156514b(f339989b, C113798hb.m157087e());
        m156514b(f339990c, C113801hf.m157137a());
        return this.f339994e;
    }

    /* renamed from: d */
    public final C113590cd mo171934d() {
        if (this.f339993d == null) {
            Stack<C113590cd> stack = f339991g;
            if (!stack.isEmpty()) {
                this.f339993d = stack.peek();
            } else {
                this.f339993d = f339992h;
            }
        }
        return this.f339993d;
    }

    public TencentMapServiceProtocol.IMapService getMapService(String str) {
        C113598cj b;
        C113590cd d = mo171934d();
        this.f339993d = d;
        if (d == null || (b = d.mo171915b(str)) == null) {
            return null;
        }
        return new C113602a(b);
    }

    private C113601cl(TencentMapOptions tencentMapOptions, C113590cd cdVar) {
        this.f339995f = tencentMapOptions;
        this.f339993d = cdVar;
    }

    /* renamed from: a */
    public final void mo171780a(C113565bo boVar) {
        super.mo171780a(boVar);
        if (boVar != null) {
            TencentMapOptions tencentMapOptions = boVar.f339858a;
            this.f339995f = tencentMapOptions;
            Object protocolDataDesc = tencentMapOptions.getProtocolDataDesc();
            String str = boVar.mo171810w().f339868a;
            if (this.f339993d == null) {
                this.f339993d = f339992h;
            }
            if (protocolDataDesc != null) {
                C113590cd cdVar = null;
                int protocolFrom = tencentMapOptions.getProtocolFrom();
                if (protocolFrom == -1) {
                    cdVar = m156508a(boVar, str, (String) protocolDataDesc);
                } else if (protocolFrom == 1) {
                    cdVar = m156509a(str, boVar.getContext().getResources().openRawResource(((Integer) protocolDataDesc).intValue()));
                } else if (protocolFrom == 3) {
                    cdVar = m156510a(str, (String) protocolDataDesc);
                }
                if (cdVar != null) {
                    this.f339993d = cdVar;
                }
            }
            C113590cd cdVar2 = this.f339993d;
            if (cdVar2 != null) {
                cdVar2.f339970a = str;
                cdVar2.mo171910a((C113595ch) this);
            } else {
                this.f339993d = f339992h;
            }
            f339991g.push(this.f339993d);
            Context b = mo171782b();
            TencentMapOptions tencentMapOptions2 = this.f339995f;
            NetConfig arguments = NetConfig.create().setAdapterType(tencentMapOptions2.getNetAdapterType()).setLogEnable(C114207sl.f341932d).setForceHttps(tencentMapOptions2.isForceHttps()).setArguments(tencentMapOptions2.getNetParams());
            HashMap hashMap = new HashMap();
            hashMap.put("apikey.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
            hashMap.put("vectorsdk.map.qq.com/mvd_map", "map_nf_mvd");
            hashMap.put("vectorsdk.map.qq.com/fileupdate", "map_nf_mapcfg");
            hashMap.put("p0.map.gtimg.com/fileupdate", "map_nf_mapcfg");
            hashMap.put("vectorsdk.map.qq.com/indoormap2", "map_nf_indoor");
            hashMap.put("vectorsdk.map.qq.com/indoormap2/index", "map_nf_indoor");
            hashMap.put("vectorsdk.map.qq.com/indoormapx", "map_nf_indoor");
            hashMap.put("vectorsdk.map.qq.com/indoormapx/index", "map_nf_indoor");
            hashMap.put("tafrtt.map.qq.com/rttserverex/", "map_nf_trfc");
            hashMap.put("p0.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p1.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p2.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("p3.map.gtimg.com/sateTiles/", "map_nf_sat");
            hashMap.put("apikey.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
            hashMap.put("overseactrl.map.qq.com", "map_nf_wdVer");
            hashMap.put("s0.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s1.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s2.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("s3.map.gtimg.com/oversea", "map_nf_wdTile");
            hashMap.put("confinfo.map.qq.com/confinfo", "map_nf_hdVer");
            hashMap.put("p0.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p1.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p2.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("p3.map.gtimg.com/scenic/", "map_nf_hdTile");
            hashMap.put("sdkgw.map.qq.com/map/traffic/event", "map_nf_pnt");
            hashMap.put("sdkgw.map.qq.com/map/poi/detail", "map_nf_aoi");
            hashMap.put("mapapi.qq.com/sdk/", "map_nf_res");
            hashMap.put("wecar.myapp.com/myapp/mapwecar", "map_nf_res");
            hashMap.put("map.myapp.com/soso_map/", "map_nf_off");
            hashMap.put("pr.map.qq.com/ditusdk/monitor", "map_nf_pr");
            hashMap.put("pr.map.qq.com/pingd", "map_nf_pr");
            hashMap.put("s0.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s1.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s2.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("s3.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
            hashMap.put("datalayer.map.qq.com/console/datalayer/data", "map_nf_visLyr");
            NetManager.init(b, arguments.setNetFlowRuleList(hashMap).setProcessor(C113770gg.class).setProxyRuleList(m156515e().mo171940b()));
            C113798hb.m157075a(m156515e().mo171939a());
        }
    }

    /* renamed from: b */
    private void m156514b(String str, String str2) {
        if (!C40002he.m42805a(str2)) {
            this.f339994e.put(str, str2);
        }
    }

    /* renamed from: a */
    private static void m156512a(Context context, TencentMapOptions tencentMapOptions) {
        NetConfig arguments = NetConfig.create().setAdapterType(tencentMapOptions.getNetAdapterType()).setLogEnable(C114207sl.f341932d).setForceHttps(tencentMapOptions.isForceHttps()).setArguments(tencentMapOptions.getNetParams());
        HashMap hashMap = new HashMap();
        hashMap.put("apikey.map.qq.com/mkey/index.php/mkey/check", "map_nf_auth");
        hashMap.put("vectorsdk.map.qq.com/mvd_map", "map_nf_mvd");
        hashMap.put("vectorsdk.map.qq.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("p0.map.gtimg.com/fileupdate", "map_nf_mapcfg");
        hashMap.put("vectorsdk.map.qq.com/indoormap2", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormap2/index", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx", "map_nf_indoor");
        hashMap.put("vectorsdk.map.qq.com/indoormapx/index", "map_nf_indoor");
        hashMap.put("tafrtt.map.qq.com/rttserverex/", "map_nf_trfc");
        hashMap.put("p0.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p1.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p2.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("p3.map.gtimg.com/sateTiles/", "map_nf_sat");
        hashMap.put("apikey.map.qq.com/sdkapis/v1/cos_token", "map_nf_fileup");
        hashMap.put("overseactrl.map.qq.com", "map_nf_wdVer");
        hashMap.put("s0.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s1.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s2.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("s3.map.gtimg.com/oversea", "map_nf_wdTile");
        hashMap.put("confinfo.map.qq.com/confinfo", "map_nf_hdVer");
        hashMap.put("p0.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p1.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p2.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("p3.map.gtimg.com/scenic/", "map_nf_hdTile");
        hashMap.put("sdkgw.map.qq.com/map/traffic/event", "map_nf_pnt");
        hashMap.put("sdkgw.map.qq.com/map/poi/detail", "map_nf_aoi");
        hashMap.put("mapapi.qq.com/sdk/", "map_nf_res");
        hashMap.put("wecar.myapp.com/myapp/mapwecar", "map_nf_res");
        hashMap.put("map.myapp.com/soso_map/", "map_nf_off");
        hashMap.put("pr.map.qq.com/ditusdk/monitor", "map_nf_pr");
        hashMap.put("pr.map.qq.com/pingd", "map_nf_pr");
        hashMap.put("s0.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s1.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s2.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("s3.map.gtimg.com/customlayer/tile", "map_nf_cusLyr");
        hashMap.put("datalayer.map.qq.com/console/datalayer/data", "map_nf_visLyr");
        NetManager.init(context, arguments.setNetFlowRuleList(hashMap).setProcessor(C113770gg.class).setProxyRuleList(m156515e().mo171940b()));
    }

    /* renamed from: a */
    private void m156513a(C113565bo boVar, TencentMapOptions tencentMapOptions) {
        Object protocolDataDesc = tencentMapOptions.getProtocolDataDesc();
        String str = boVar.mo171810w().f339868a;
        if (this.f339993d == null) {
            this.f339993d = f339992h;
        }
        if (protocolDataDesc != null) {
            C113590cd cdVar = null;
            int protocolFrom = tencentMapOptions.getProtocolFrom();
            if (protocolFrom == -1) {
                cdVar = m156508a(boVar, str, (String) protocolDataDesc);
            } else if (protocolFrom == 1) {
                cdVar = m156509a(str, boVar.getContext().getResources().openRawResource(((Integer) protocolDataDesc).intValue()));
            } else if (protocolFrom == 3) {
                cdVar = m156510a(str, (String) protocolDataDesc);
            }
            if (cdVar != null) {
                this.f339993d = cdVar;
            }
        }
        C113590cd cdVar2 = this.f339993d;
        if (cdVar2 != null) {
            cdVar2.f339970a = str;
            cdVar2.mo171910a((C113595ch) this);
        } else {
            this.f339993d = f339992h;
        }
        f339991g.push(this.f339993d);
    }

    /* renamed from: a */
    private C113590cd m156508a(C113565bo boVar, String str, String str2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = boVar.getContext().getResources().getAssets().open(str2);
            try {
                C113590cd a = m156509a(str, inputStream);
                C113886kg.m157515a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C113886kg.m157515a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C113886kg.m157515a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C113886kg.m157515a((Closeable) inputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            C113886kg.m157515a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private C113590cd m156507a(C113565bo boVar, String str, int i) {
        return m156509a(str, boVar.getContext().getResources().openRawResource(i));
    }

    /* renamed from: a */
    private C113590cd m156509a(String str, InputStream inputStream) {
        if (inputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                byte[] bArr = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (-1 != read) {
                            byteArrayOutputStream2.write(bArr, 0, read);
                        } else {
                            C113590cd a = m156510a(str, new String(byteArrayOutputStream2.toByteArray(), Charset.forName("UTF-8")));
                            C113886kg.m157515a((Closeable) byteArrayOutputStream2);
                            C113886kg.m157515a((Closeable) inputStream);
                            return a;
                        }
                    } catch (IOException unused) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        C113886kg.m157515a((Closeable) byteArrayOutputStream);
                        C113886kg.m157515a((Closeable) inputStream);
                        return new C113592ce();
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        C113886kg.m157515a((Closeable) byteArrayOutputStream);
                        C113886kg.m157515a((Closeable) inputStream);
                        throw th;
                    }
                }
            } catch (IOException unused2) {
                C113886kg.m157515a((Closeable) byteArrayOutputStream);
                C113886kg.m157515a((Closeable) inputStream);
                return new C113592ce();
            } catch (Throwable th4) {
                th = th4;
                C113886kg.m157515a((Closeable) byteArrayOutputStream);
                C113886kg.m157515a((Closeable) inputStream);
                throw th;
            }
        }
        return new C113592ce();
    }

    /* renamed from: a */
    private C113590cd m156510a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString(C113593cf.f339979c, "-1");
            String optString2 = jSONObject.optString(C113593cf.f339980d, "_unknown");
            if (!"-1".equals(optString) && optString2.equals(str)) {
                C113600ck ckVar = new C113600ck();
                ckVar.f339970a = str;
                ckVar.mo171910a((C113595ch) this);
                JSONArray optJSONArray = jSONObject.optJSONArray(C113596ci.f339982a_);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        ckVar.mo171933a(optJSONArray.getJSONObject(i));
                    }
                }
                JSONObject optJSONObject = jSONObject.optJSONObject(C113594cg.f339981e);
                if (optJSONObject != null) {
                    C113603cm cmVar = (C113603cm) JsonUtils.parseToModel(optJSONObject, C113603cm.class, new Object[0]);
                    C113605co coVar = ckVar.f339971b;
                    coVar.f339999a = cmVar.f339997a;
                    coVar.f340000b = cmVar.f339998b;
                }
                return ckVar;
            }
        } catch (JSONException unused) {
        }
        return f339992h;
    }

    /* renamed from: a */
    public static <S extends C113598cj> S m156511a(Class<S> cls) {
        Stack<C113590cd> stack = f339991g;
        if (stack.isEmpty()) {
            return f339992h.mo171916c(cls);
        }
        return stack.peek().mo171916c(cls);
    }

    /* renamed from: a */
    public final Map<String, Class<? extends C113596ci.C113597a>> mo171918a() {
        HashMap hashMap = new HashMap();
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_AUTHORIZATION, C113620df.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_INDOOR_DATA, C113625dh.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_MAP_DATA, C113627dj.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_MAP_STYLE, C113629dl.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_RTT_DATA, C113632do.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_SATELLITE_DATA, C113633dp.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_SKETCH_DATA, C113634dq.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_OVERSEA_DATA, C113631dn.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_STATISTIC, C113635dr.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_TRAFFIC_EVENT, C113636ds.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_OFFLINE_MAP_DATA, C113630dm.class);
        hashMap.put(TencentMapServiceProtocol.SERVICE_NAME_MAP_POI_DATA, C113628dk.class);
        return hashMap;
    }
}
