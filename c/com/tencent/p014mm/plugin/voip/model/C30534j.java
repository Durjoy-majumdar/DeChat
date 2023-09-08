package com.tencent.p014mm.plugin.voip.model;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.voip.model.j */
public class C30534j {

    /* renamed from: com.tencent.mm.plugin.voip.model.j$a */
    public static class C30535a {

        /* renamed from: a */
        public int f82261a = 0;

        /* renamed from: b */
        public int f82262b = 0;

        /* renamed from: a */
        public static String m39120a(Map<String, C30535a> map) {
            StringBuilder sb = new StringBuilder();
            if (map != null) {
                try {
                    if (map.size() > 0) {
                        sb.append("<voiptenmin>");
                        for (Map.Entry next : map.entrySet()) {
                            Object key = next.getKey();
                            C30535a aVar = (C30535a) next.getValue();
                            sb.append("<" + key);
                            sb.append(" hitcount = \"");
                            sb.append(aVar.f82261a);
                            sb.append(FastJsonResponse.QUOTE);
                            sb.append(" sendcount = \"");
                            sb.append(aVar.f82262b);
                            sb.append(FastJsonResponse.QUOTE);
                            sb.append("/>");
                        }
                        sb.append("</voiptenmin>");
                    }
                } catch (Exception e) {
                    Log.m105921e("PostTaskTenMinutesLogicState", "exception:%s", Util.stackTraceToString(e));
                    return null;
                }
            }
            Log.m105918d("PostTaskTenMinutesLogicState", "mapToXml " + sb.toString());
            return sb.toString();
        }

        /* renamed from: b */
        public static Map<String, C30535a> m39121b(String str) {
            Log.m105918d("PostTaskTenMinutesLogicState", "xml " + str);
            HashMap hashMap = null;
            if (str == null) {
                return null;
            }
            try {
                Map<String, String> parseXml = XmlParser.parseXml(str, "voiptenmin", (String) null);
                if (parseXml == null || parseXml.size() <= 0) {
                    return null;
                }
                HashMap hashMap2 = new HashMap();
                try {
                    Iterator<Map.Entry<String, String>> it = parseXml.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry next = it.next();
                        String str2 = (String) next.getKey();
                        if (str2 == null) {
                            break;
                        }
                        String[] split = str2.split("\\.");
                        Log.m105918d("PostTaskTenMinutesLogicState", "key is " + str2);
                        Log.m105918d("PostTaskTenMinutesLogicState", "array is " + split.length);
                        if (split.length >= 4) {
                            Log.m105918d("PostTaskTenMinutesLogicState", "getValue is " + ((String) next.getValue()) + "array[1] " + split[2]);
                            C30535a aVar = hashMap2.containsKey(split[2]) ? (C30535a) hashMap2.get(split[2]) : new C30535a();
                            if (str2.contains("hitcount")) {
                                aVar.f82261a = Util.getInt((String) next.getValue(), 0);
                            } else if (str2.contains("sendcount")) {
                                aVar.f82262b = Util.getInt((String) next.getValue(), 0);
                            }
                            aVar.getClass();
                            Log.m105918d("PostTaskTenMinutesLogicState", "hitCount " + aVar.f82261a + "sendCount " + aVar.f82262b);
                            hashMap2.put(split[2], aVar);
                        }
                    }
                    return hashMap2;
                } catch (Exception e) {
                    e = e;
                    hashMap = hashMap2;
                    Log.m105921e("PostTaskTenMinutesLogicState", "exception:%s", Util.stackTraceToString(e));
                    return hashMap;
                }
            } catch (Exception e2) {
                e = e2;
                Log.m105921e("PostTaskTenMinutesLogicState", "exception:%s", Util.stackTraceToString(e));
                return hashMap;
            }
        }
    }

    /* renamed from: a */
    public static boolean m39119a() {
        return Util.secondsToNow(Util.nullAs((Long) C86709a0.m107535s().mo121142i().mo119684e(77828, (Object) null), 0)) * 1000 > 1800000;
    }
}
