package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.C113667ef;
import com.tencent.mapsdk.internal.C113684eg;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.rl */
public final class C114154rl implements C114153rk {
    /* renamed from: a */
    public final C113667ef mo172778a(byte[] bArr) {
        return (C113667ef) JsonUtils.parseToModel(new String(bArr), C113684eg.class, new Object[0]);
    }

    /* renamed from: a */
    public final C113667ef mo172777a(C113667ef efVar, String str) {
        boolean z = efVar instanceof C113684eg;
        C113684eg egVar = efVar;
        if (z) {
            C113684eg egVar2 = (C113684eg) efVar;
            C113667ef.C113668a.C113669a.C113672c cVar = (C113667ef.C113668a.C113669a.C113672c) egVar2.f340129a.f340095c.f340097b.get(0);
            String str2 = str + "/model/";
            C113889km.m157545b(C0949kl.f2254x, "# 2次处理数据缓存根目录: [" + str2 + "]");
            String str3 = str2 + cVar.f340108i;
            File file = new File(str3, cVar.f340107h);
            C113889km.m157545b(C0949kl.f2254x, "# 2次处理数据缓存目标文件: [" + file.getAbsolutePath() + "]");
            if (!file.exists()) {
                if (!TextUtils.isEmpty(cVar.f340103d) && !cVar.f340103d.equals("null")) {
                    cVar.f340102c = cVar.f340103d;
                }
                if (!TextUtils.isEmpty(cVar.f340104e) && !cVar.f340104e.equals("null")) {
                    cVar.f340102c = cVar.f340104e;
                }
                C113889km.m157545b(C0949kl.f2254x, "2次处理数据请求url: [" + cVar.f340102c + "]");
                NetResponse doGet = NetManager.getInstance().builder().url(cVar.f340102c).doGet();
                if (doGet.available()) {
                    C113884kf.m157508f(new File(str2));
                    byte[] bArr = doGet.data;
                    File file2 = new File(str2, cVar.f340106g + ".tmp");
                    C113884kf.m157491a(file2, bArr);
                    try {
                        C80344ki.m97843a((InputStream) new FileInputStream(file2), new File(str3));
                    } catch (Exception unused) {
                    }
                    C113884kf.m157500b(file2);
                    StringBuilder sb = new StringBuilder("# 2次下载处理数据大小: {");
                    sb.append(cVar.f340106g);
                    sb.append("} [");
                    byte[] bArr2 = doGet.data;
                    sb.append(bArr2 != null ? bArr2.length : 0);
                    sb.append("]");
                    C113889km.m157545b(C0949kl.f2254x, sb.toString());
                    ((C113667ef.C113668a.C113669a.C113672c) egVar2.f340129a.f340095c.f340097b.get(0)).f340099b = file.getAbsolutePath();
                    egVar = egVar2;
                } else {
                    C113889km.m157545b(C0949kl.f2254x, "2次处理数据请求失败");
                    ((C113667ef.C113668a.C113669a.C113672c) egVar2.f340129a.f340095c.f340097b.get(0)).f340099b = "";
                    egVar = egVar2;
                }
            } else {
                C113889km.m157545b(C0949kl.f2254x, "2次处理数据已存在缓存中");
                ((C113667ef.C113668a.C113669a.C113672c) egVar2.f340129a.f340095c.f340097b.get(0)).f340099b = file.getAbsolutePath();
                egVar = egVar2;
            }
        }
        return egVar;
    }

    /* renamed from: a */
    public final BaseOverlayProvider mo172776a(C113667ef efVar) {
        if (!(efVar instanceof C113684eg) || !efVar.mo171988c()) {
            return null;
        }
        C113684eg egVar = (C113684eg) efVar;
        C113667ef.C113668a.C113669a.C113672c cVar = (C113667ef.C113668a.C113669a.C113672c) egVar.f340129a.f340095c.f340097b.get(0);
        if (TextUtils.isEmpty(cVar.f340099b)) {
            return null;
        }
        LatLng latLng = egVar.f340129a.f340130a.f340131a.f340133a.f340142a.f340134a;
        GLModelOverlayProvider gLModelOverlayProvider = new GLModelOverlayProvider(cVar.f340099b, new LatLng(latLng.latitude, latLng.longitude, latLng.altitude));
        List<Double> list = egVar.f340129a.f340130a.f340131a.f340133a.f340142a.f340135b;
        if (list != null && list.size() == 3) {
            gLModelOverlayProvider.rotationX(list.get(0).floatValue() + 90.0f).rotationY(list.get(1).floatValue()).rotationZ(list.get(2).floatValue());
        }
        gLModelOverlayProvider.latLngBounds(egVar.f340129a.f340130a.f340131a.f340133a.f340142a.f340139f);
        if (egVar.f340129a.f340130a.f340131a.f340133a.f340142a.f340137d) {
            gLModelOverlayProvider.coordType(GLModelOverlayProvider.CoordType.GeoGraphicType);
            gLModelOverlayProvider.scale(egVar.f340129a.f340130a.f340131a.f340133a.f340142a.f340136c);
        } else {
            gLModelOverlayProvider.coordType(GLModelOverlayProvider.CoordType.PixelType);
            List<Integer> list2 = egVar.f340129a.f340130a.f340131a.f340133a.f340142a.f340138e;
            if (list2 != null && list2.size() == 2) {
                gLModelOverlayProvider.pixelBounds(list2.get(0).intValue(), list2.get(1).intValue());
            }
        }
        int i = egVar.f340129a.f340130a.f340131a.f340133a.f340142a.f340140g.f340128a;
        if (i == 0) {
            gLModelOverlayProvider.animateType(GLModelOverlayProvider.AnimationType.None);
        } else if (i == 1) {
            gLModelOverlayProvider.animateType(GLModelOverlayProvider.AnimationType.FlattenRise);
        }
        gLModelOverlayProvider.setExposure((float) egVar.f340129a.f340130a.f340131a.f340133a.f340142a.f340141h);
        C113684eg.C113685a.C113686a.C113687a aVar = egVar.f340129a.f340130a.f340132b;
        gLModelOverlayProvider.zoomRange(aVar.f340121k, aVar.f340120j);
        gLModelOverlayProvider.zIndex(egVar.f340129a.f340130a.f340132b.f340117g);
        gLModelOverlayProvider.displayLevel(egVar.f340129a.f340130a.f340132b.f340116f);
        gLModelOverlayProvider.opacity((float) egVar.f340129a.f340130a.f340132b.f340119i);
        gLModelOverlayProvider.visibility(!egVar.f340129a.f340130a.f340132b.f340118h);
        return gLModelOverlayProvider;
    }
}
