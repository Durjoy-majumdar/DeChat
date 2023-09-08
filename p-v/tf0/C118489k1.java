package tf0;

import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.pigeon.C26952e;
import com.tencent.pigeon.FlutterMMKVSlotPigeon;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;

/* renamed from: tf0.k1 */
public final class C118489k1 implements FlutterPlugin, FlutterMMKVSlotPigeon.FlutterMMKVSlotHost {
    /* renamed from: a */
    public final MMKVSlotManager mo183212a(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(flutterMMKVSlotInfo.getRecorderName());
        C87412m.m108593f(mmkv, "getMMKV(recorderName)");
        Long slotSeconds = flutterMMKVSlotInfo.getSlotSeconds();
        C87412m.m108593f(slotSeconds, "slotSeconds");
        return new MMKVSlotManager(mmkv, slotSeconds.longValue());
    }

    public Boolean getBool(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(str, "key");
        return Boolean.valueOf(mo183212a(flutterMMKVSlotInfo).decodeBool(str, booleanValue));
    }

    public byte[] getBytes(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str) {
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(str, "key");
        return mo183212a(flutterMMKVSlotInfo).decodeBytes(str);
    }

    public Long getInt(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, Long l) {
        long longValue = l.longValue();
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(str, "key");
        return Long.valueOf(mo183212a(flutterMMKVSlotInfo).decodeLong(str, longValue));
    }

    public String getString(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str) {
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(str, "key");
        return mo183212a(flutterMMKVSlotInfo).decodeString(str, (String) null);
    }

    public Map<String, String> getStringList(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, List<String> list) {
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(list, "keyList");
        HashMap hashMap = new HashMap();
        MMKVSlotManager a = mo183212a(flutterMMKVSlotInfo);
        for (String str : list) {
            hashMap.put(str, a.decodeString(str, (String) null));
        }
        return hashMap;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C26952e.m35883l(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C26952e.m35883l(flutterPluginBinding.getBinaryMessenger(), (FlutterMMKVSlotPigeon.FlutterMMKVSlotHost) null);
    }

    public void putBool(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(str, "key");
        ((MultiProcessMMKV) mo183212a(flutterMMKVSlotInfo).getSlotForWrite()).encode(str, booleanValue);
    }

    public void putBytes(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, byte[] bArr) {
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(str, "key");
        C87412m.m108594g(bArr, "value");
        ((MultiProcessMMKV) mo183212a(flutterMMKVSlotInfo).getSlotForWrite()).encode(str, bArr);
    }

    public void putInt(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, Long l) {
        long longValue = l.longValue();
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(str, "key");
        ((MultiProcessMMKV) mo183212a(flutterMMKVSlotInfo).getSlotForWrite()).encode(str, longValue);
    }

    public void putString(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, String str, String str2) {
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "value");
        ((MultiProcessMMKV) mo183212a(flutterMMKVSlotInfo).getSlotForWrite()).encode(str, str2);
    }

    public void putStringList(FlutterMMKVSlotPigeon.FlutterMMKVSlotInfo flutterMMKVSlotInfo, Map<String, String> map) {
        C87412m.m108594g(flutterMMKVSlotInfo, "info");
        C87412m.m108594g(map, "valueList");
        MMKVSlotManager a = mo183212a(flutterMMKVSlotInfo);
        for (Map.Entry next : map.entrySet()) {
            ((MultiProcessMMKV) a.getSlotForWrite()).encode((String) next.getKey(), (String) next.getValue());
        }
    }
}
