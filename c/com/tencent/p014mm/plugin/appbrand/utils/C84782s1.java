package com.tencent.p014mm.plugin.appbrand.utils;

import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import js0.C88016e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.s1 */
public class C84782s1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.s1$a */
    public static class C84783a implements C1727m {

        /* renamed from: d */
        public String f247206d = "__nativeBuffers__";

        /* renamed from: e */
        public String f247207e = "key";

        /* renamed from: f */
        public String f247208f = "id";

        /* renamed from: g */
        public String f247209g = "base64";

        /* renamed from: h */
        public int f247210h = Integer.MAX_VALUE;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.s1$b */
    public enum C84784b {
        OK,
        FAIL_SIZE_EXCEED_LIMIT
    }

    /* renamed from: a */
    public static ByteBuffer m104460a(ByteBuffer byteBuffer) {
        return (byteBuffer != null && !byteBuffer.isDirect() && byteBuffer.hasArray()) ? m104464e(byteBuffer.array()) : byteBuffer;
    }

    /* renamed from: b */
    public static void m104461b(C82381f fVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.MESSAGE, "convert native buffer parameter fail, event=" + str + ", error=native buffer exceed size limit");
        hashMap.put("stack", "");
        fVar.mo109650d("onError", new JSONObject(hashMap).toString());
    }

    /* renamed from: c */
    public static final C84784b m104462c(C83165i iVar, C82870p pVar, JSONObject jSONObject, C84783a aVar) {
        C83165i iVar2 = iVar;
        C82870p pVar2 = pVar;
        JSONObject jSONObject2 = jSONObject;
        C84784b bVar = C84784b.OK;
        boolean z = false;
        if (iVar2 == null || jSONObject2 == null) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(iVar2 == null);
            if (jSONObject2 == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.NativeBufferUtil", "processNativeBufferToJs fail, invalid argument, jsruntime is null:[%b], data is null:[%b]", objArr);
            return bVar;
        }
        C84783a aVar2 = aVar == null ? new C84783a() : aVar;
        JSONArray optJSONArray = jSONObject2.optJSONArray(aVar2.f247206d);
        if (optJSONArray == null) {
            return bVar;
        }
        jSONObject2.remove(aVar2.f247206d);
        int length = optJSONArray.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(aVar2.f247207e);
                if (!Util.isNullOrNil(optString)) {
                    int optInt = optJSONObject.optInt(aVar2.f247208f, -1);
                    if (optInt == -1) {
                        try {
                            String optString2 = optJSONObject.optString(aVar2.f247209g, "");
                            if (Util.isNullOrNil(optString2)) {
                                Log.m105924i("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs base64 is null");
                                jSONObject2.put(optString, ByteBuffer.allocate(0));
                            } else {
                                jSONObject2.put(optString, ByteBuffer.wrap(Base64.decode(optString2.getBytes(Charset.forName("UTF-8")), 2)));
                            }
                        } catch (JSONException e) {
                            Log.m105929w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs JSONException :%s", e.getMessage());
                        }
                    } else {
                        C83170k kVar = (C83170k) iVar2.mo63321n0(C83170k.class);
                        if (kVar == null) {
                            Log.m105928w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs bufferAddon is null, not support");
                        } else {
                            ByteBuffer k1 = pVar2 == null ? kVar.mo115416k1(optInt, false) : pVar2.mo115118s(optString, kVar, optInt);
                            if (k1 == null) {
                                Log.m105928w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs byteBuffer is null");
                            } else {
                                k1.position(0);
                                jSONObject2.put(optString, k1);
                                i += k1.capacity();
                            }
                        }
                    }
                }
            }
        }
        Log.m105919d("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs bufferSize %d", Integer.valueOf(i));
        if (i <= aVar2.f247210h) {
            return bVar;
        }
        Log.m105921e("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs fail, size exceed limit, bufferSize = %d, limit = %d", Integer.valueOf(i), Integer.valueOf(aVar2.f247210h));
        return C84784b.FAIL_SIZE_EXCEED_LIMIT;
    }

    /* renamed from: d */
    public static final C84784b m104463d(C83165i iVar, Map map, C84783a aVar) {
        int Z;
        C84784b bVar = C84784b.OK;
        boolean z = false;
        if (iVar == null || map == null) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(iVar == null);
            if (map == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.NativeBufferUtil", "processNativeBufferToJs fail, invalid argument, jsruntime is null:[%b], map is null:[%b]", objArr);
            return bVar;
        }
        if (aVar == null) {
            aVar = new C84783a();
        }
        C83170k kVar = (C83170k) iVar.mo63321n0(C83170k.class);
        JSONArray jSONArray = new JSONArray();
        Iterator it = map.entrySet().iterator();
        int i = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null && (value instanceof ByteBuffer)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(aVar.f247207e, str);
                    if (kVar == null || (Z = kVar.mo115404Z()) == -1) {
                        jSONObject.put(aVar.f247209g, new String(Base64.encode(C88016e.m109544a((ByteBuffer) value), 2), StandardCharsets.UTF_8));
                    } else {
                        ByteBuffer byteBuffer = (ByteBuffer) value;
                        kVar.mo115401U0(Z, byteBuffer);
                        jSONObject.put(aVar.f247208f, Z);
                        i += byteBuffer.capacity();
                    }
                    jSONArray.put(jSONObject);
                    z2 = true;
                } catch (JSONException e) {
                    Log.m105929w("MicroMsg.NativeBufferUtil", "processNativeBuffer JSONException :%s", e.getMessage());
                }
                it.remove();
            }
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = Boolean.valueOf(kVar != null);
        objArr2[1] = Integer.valueOf(i);
        Log.m105919d("MicroMsg.NativeBufferUtil", "ToJs useX5JSCore %b,bufferSize %d", objArr2);
        if (i > aVar.f247210h) {
            Log.m105921e("MicroMsg.NativeBufferUtil", "bufferSize exceed the limit, bufferSize = %d, limit = %d", Integer.valueOf(i), Integer.valueOf(aVar.f247210h));
            return C84784b.FAIL_SIZE_EXCEED_LIMIT;
        }
        if (z2) {
            map.put(aVar.f247206d, jSONArray);
        }
        return bVar;
    }

    /* renamed from: e */
    public static ByteBuffer m104464e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr, 0, bArr.length);
        allocateDirect.rewind();
        return allocateDirect;
    }
}
