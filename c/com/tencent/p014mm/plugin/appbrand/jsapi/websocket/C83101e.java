package com.tencent.p014mm.plugin.appbrand.jsapi.websocket;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.e */
public interface C83101e {

    /* renamed from: a */
    public static final ArrayList<C83103f> f242909a = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.e$a */
    public interface C83102a {
    }

    /* renamed from: a */
    C83103f mo115339a(String str);

    /* renamed from: b */
    void mo115340b(C83103f fVar, int i, String str);

    /* renamed from: c */
    void mo115341c(C83103f fVar, ByteBuffer byteBuffer);

    /* renamed from: d */
    void mo115342d(String str, String str2, int i, int i2, JSONObject jSONObject, Map<String, String> map, C83102a aVar);

    /* renamed from: e */
    boolean mo115343e(C83103f fVar);

    /* renamed from: f */
    void mo115344f(C83103f fVar, String str);

    /* renamed from: g */
    void mo115345g(C83103f fVar);

    void release();
}
