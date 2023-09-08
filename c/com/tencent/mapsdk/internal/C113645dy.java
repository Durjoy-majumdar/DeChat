package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.map.tools.Callback;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.dy */
public interface C113645dy extends TencentMapComponent.Component {
    /* renamed from: a */
    int mo171966a(String str);

    /* renamed from: a */
    VisualLayer mo171967a(VisualLayerOptions visualLayerOptions);

    /* renamed from: a */
    void mo171968a(String str, int i);

    /* renamed from: a */
    void mo171969a(String str, int i, int i2);

    /* renamed from: a */
    void mo171970a(String str, Callback<byte[]> callback);

    /* renamed from: a */
    void mo171971a(String str, byte[] bArr);

    /* renamed from: a */
    void mo171972a(JSONObject jSONObject);

    /* renamed from: a */
    boolean mo171973a();

    /* renamed from: b */
    void mo171974b(String str);

    /* renamed from: b */
    void mo171975b(String str, Callback<byte[]> callback);

    /* renamed from: c */
    void mo171976c(String str);

    /* renamed from: c_ */
    C113565bo mo171977c_();

    /* renamed from: d */
    String mo171978d(String str);

    /* renamed from: e */
    boolean mo171979e(String str);

    /* renamed from: f */
    void mo171980f(String str);

    /* renamed from: g */
    void mo171981g(String str);
}
