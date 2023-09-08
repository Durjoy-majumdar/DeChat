package p392w5;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import p288a6.C23610a;
import p421x5.C26532a;
import p421x5.C26533b;
import p421x5.C26534c;
import p421x5.C26535d;
import p421x5.C26536e;
import p422y5.C26624a;
import p422y5.C26625b;
import p424z5.C26654a;
import p424z5.C26655b;
import p424z5.C26656c;

/* renamed from: w5.f */
public class C26424f {

    /* renamed from: a */
    public static int f73695a;

    /* renamed from: b */
    public static int f73696b;

    /* renamed from: c */
    public static boolean f73697c;

    /* renamed from: a */
    public static String m34019a(String str) {
        C26624a aVar;
        ArrayList<C26536e> arrayList;
        try {
            aVar = m34023e(str);
        } catch (Exception unused) {
            aVar = null;
        }
        if (aVar == null || (arrayList = aVar.f74065b) == null || arrayList.size() == 0) {
            return "";
        }
        C26654a aVar2 = new C26654a();
        aVar2.f74225a = new C26655b();
        aVar2.f74226b = new ArrayList<>();
        C26656c cVar = new C26656c();
        cVar.f74228b = aVar.f74065b;
        cVar.f74227a = 0;
        aVar2.f74226b.add(cVar);
        return m34020b(aVar2);
    }

    /* renamed from: b */
    public static String m34020b(C26654a aVar) {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            jSONStringer.object();
            JSONStringer key = jSONStringer.key("Metadata").object().key("Created");
            aVar.f74225a.getClass();
            JSONStringer key2 = key.value("2021-01-01").key("Description");
            aVar.f74225a.getClass();
            JSONStringer key3 = key2.value("game haptic").key("Version");
            aVar.f74225a.getClass();
            key3.value((long) 2).endObject();
            jSONStringer.key("PatternList").array();
            Iterator<C26656c> it = aVar.f74226b.iterator();
            while (it.hasNext()) {
                C26656c next = it.next();
                jSONStringer.object().key("AbsoluteTime").value((long) next.f74227a).key("Pattern").array();
                Iterator<C26536e> it4 = next.f74228b.iterator();
                while (it4.hasNext()) {
                    C26536e next2 = it4.next();
                    jSONStringer.object();
                    jSONStringer.key("Event").object().key("Index").value((long) next2.f73838a.f73833d).key("RelativeTime").value((long) next2.f73838a.f73831b).key("Type").value(next2.f73838a.f73830a);
                    if ("continuous".equals(next2.f73838a.f73830a)) {
                        jSONStringer.key("Duration").value((long) next2.f73838a.f73832c);
                    }
                    jSONStringer.key("Parameters").object().key("Frequency").value((long) next2.f73838a.f73834e.f73836b).key("Intensity").value((long) next2.f73838a.f73834e.f73835a);
                    if ("continuous".equals(next2.f73838a.f73830a)) {
                        jSONStringer.key("Curve").array();
                        Iterator<C26532a> it5 = next2.f73838a.f73834e.f73837c.iterator();
                        while (it5.hasNext()) {
                            C26532a next3 = it5.next();
                            jSONStringer.object().key("Frequency").value((long) next3.f73829c).key("Intensity").value(next3.f73828b).key("Time").value((long) next3.f73827a).endObject();
                        }
                        jSONStringer.endArray();
                    }
                    jSONStringer.endObject().endObject().endObject();
                }
                jSONStringer.endArray().endObject();
            }
            jSONStringer.endArray().endObject();
            return jSONStringer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: z5.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: z5.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: z5.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: z5.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: z5.a} */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m34021c(java.lang.String r10, int r11) {
        /*
            int r0 = m34027i(r10)
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = -1
            java.lang.String r5 = ""
            if (r0 == r3) goto L_0x00cc
            r3 = 2
            if (r0 == r3) goto L_0x0010
            return r5
        L_0x0010:
            z5.a r2 = m34024f(r10)     // Catch:{ Exception -> 0x0015 }
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            if (r2 == 0) goto L_0x00cb
            java.util.ArrayList<z5.c> r10 = r2.f74226b
            if (r10 == 0) goto L_0x00cb
            int r10 = r10.size()
            if (r10 != 0) goto L_0x0024
            goto L_0x00cb
        L_0x0024:
            java.util.ArrayList<z5.c> r10 = r2.f74226b
            java.util.Iterator r10 = r10.iterator()
        L_0x002a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r10.next()
            z5.c r0 = (p424z5.C26656c) r0
            java.util.ArrayList<x5.e> r3 = r0.f74228b
            if (r3 != 0) goto L_0x003b
            goto L_0x002a
        L_0x003b:
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r3.next()
            x5.e r6 = (p421x5.C26536e) r6
            x5.b r7 = r6.f73838a
            if (r7 != 0) goto L_0x0050
            goto L_0x003f
        L_0x0050:
            int r7 = r7.f73831b
            int r8 = r0.f74227a
            int r7 = r7 + r8
            if (r7 < r11) goto L_0x003f
            java.util.ArrayList<x5.e> r10 = r0.f74228b
            int r4 = r10.indexOf(r6)
            java.util.ArrayList<z5.c> r10 = r2.f74226b
            int r10 = r10.indexOf(r0)
            r9 = r4
            r4 = r10
            r10 = r9
            goto L_0x0068
        L_0x0067:
            r10 = -1
        L_0x0068:
            if (r4 < 0) goto L_0x00cb
            if (r10 >= 0) goto L_0x006d
            goto L_0x00cb
        L_0x006d:
            java.util.ArrayList<z5.c> r0 = r2.f74226b
            java.util.List r0 = r0.subList(r1, r4)
            r0.clear()
            java.util.ArrayList<z5.c> r0 = r2.f74226b
            java.lang.Object r0 = r0.get(r1)
            z5.c r0 = (p424z5.C26656c) r0
            java.util.ArrayList<x5.e> r0 = r0.f74228b
            java.util.List r10 = r0.subList(r1, r10)
            r10.clear()
            java.util.ArrayList<z5.c> r10 = r2.f74226b
            java.util.Iterator r10 = r10.iterator()
        L_0x008d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r0 = r10.next()
            z5.c r0 = (p424z5.C26656c) r0
            java.util.ArrayList<x5.e> r3 = r0.f74228b
            if (r3 != 0) goto L_0x009e
            goto L_0x008d
        L_0x009e:
            int r4 = r0.f74227a
            if (r4 >= r11) goto L_0x00c3
            java.util.Iterator r3 = r3.iterator()
        L_0x00a6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00c0
            java.lang.Object r4 = r3.next()
            x5.e r4 = (p421x5.C26536e) r4
            x5.b r4 = r4.f73838a
            if (r4 != 0) goto L_0x00b7
            goto L_0x00a6
        L_0x00b7:
            int r5 = r4.f73831b
            int r6 = r0.f74227a
            int r5 = r5 + r6
            int r5 = r5 - r11
            r4.f73831b = r5
            goto L_0x00a6
        L_0x00c0:
            r0.f74227a = r1
            goto L_0x008d
        L_0x00c3:
            int r4 = r4 - r11
            r0.f74227a = r4
            goto L_0x008d
        L_0x00c7:
            java.lang.String r5 = m34020b(r2)
        L_0x00cb:
            return r5
        L_0x00cc:
            y5.a r10 = m34023e(r10)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00d3
        L_0x00d1:
            r10 = r2
        L_0x00d3:
            if (r10 == 0) goto L_0x026b
            java.util.ArrayList<x5.e> r0 = r10.f74065b
            if (r0 == 0) goto L_0x026b
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00e1
            goto L_0x026b
        L_0x00e1:
            java.util.ArrayList<x5.e> r0 = r10.f74065b
            java.util.Iterator r0 = r0.iterator()
        L_0x00e7:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0102
            java.lang.Object r6 = r0.next()
            x5.e r6 = (p421x5.C26536e) r6
            x5.b r7 = r6.f73838a
            if (r7 != 0) goto L_0x00f8
            goto L_0x00e7
        L_0x00f8:
            int r7 = r7.f73831b
            if (r7 < r11) goto L_0x00e7
            java.util.ArrayList<x5.e> r0 = r10.f74065b
            int r4 = r0.indexOf(r6)
        L_0x0102:
            if (r4 >= 0) goto L_0x0106
            goto L_0x026b
        L_0x0106:
            java.util.ArrayList<x5.e> r0 = r10.f74065b
            java.util.List r0 = r0.subList(r1, r4)
            r0.clear()
            java.util.ArrayList<x5.e> r0 = r10.f74065b
            java.util.Iterator r0 = r0.iterator()
        L_0x0115:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x012c
            java.lang.Object r1 = r0.next()
            x5.e r1 = (p421x5.C26536e) r1
            x5.b r1 = r1.f73838a
            if (r1 != 0) goto L_0x0126
            goto L_0x0115
        L_0x0126:
            int r4 = r1.f73831b
            int r4 = r4 - r11
            r1.f73831b = r4
            goto L_0x0115
        L_0x012c:
            java.lang.String r11 = "Intensity"
            java.lang.String r0 = "Frequency"
            java.lang.String r1 = "continuous"
            org.json.JSONStringer r4 = new org.json.JSONStringer     // Catch:{ Exception -> 0x026a }
            r4.<init>()     // Catch:{ Exception -> 0x026a }
            r4.object()     // Catch:{ Exception -> 0x026a }
            java.lang.String r5 = "Metadata"
            org.json.JSONStringer r5 = r4.key(r5)     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r5 = r5.object()     // Catch:{ Exception -> 0x026a }
            java.lang.String r6 = "Created"
            org.json.JSONStringer r5 = r5.key(r6)     // Catch:{ Exception -> 0x026a }
            y5.b r6 = r10.f74064a     // Catch:{ Exception -> 0x026a }
            r6.getClass()     // Catch:{ Exception -> 0x026a }
            java.lang.String r6 = "2021-01-01"
            org.json.JSONStringer r5 = r5.value(r6)     // Catch:{ Exception -> 0x026a }
            java.lang.String r6 = "Description"
            org.json.JSONStringer r5 = r5.key(r6)     // Catch:{ Exception -> 0x026a }
            y5.b r6 = r10.f74064a     // Catch:{ Exception -> 0x026a }
            r6.getClass()     // Catch:{ Exception -> 0x026a }
            java.lang.String r6 = "game haptic"
            org.json.JSONStringer r5 = r5.value(r6)     // Catch:{ Exception -> 0x026a }
            java.lang.String r6 = "Version"
            org.json.JSONStringer r5 = r5.key(r6)     // Catch:{ Exception -> 0x026a }
            y5.b r6 = r10.f74064a     // Catch:{ Exception -> 0x026a }
            r6.getClass()     // Catch:{ Exception -> 0x026a }
            long r6 = (long) r3     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r3 = r5.value(r6)     // Catch:{ Exception -> 0x026a }
            r3.endObject()     // Catch:{ Exception -> 0x026a }
            java.lang.String r3 = "Pattern"
            org.json.JSONStringer r3 = r4.key(r3)     // Catch:{ Exception -> 0x026a }
            r3.array()     // Catch:{ Exception -> 0x026a }
            java.util.ArrayList<x5.e> r10 = r10.f74065b     // Catch:{ Exception -> 0x026a }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x026a }
        L_0x0188:
            boolean r3 = r10.hasNext()     // Catch:{ Exception -> 0x026a }
            if (r3 == 0) goto L_0x025f
            java.lang.Object r3 = r10.next()     // Catch:{ Exception -> 0x026a }
            x5.e r3 = (p421x5.C26536e) r3     // Catch:{ Exception -> 0x026a }
            r4.object()     // Catch:{ Exception -> 0x026a }
            java.lang.String r5 = "Event"
            org.json.JSONStringer r5 = r4.key(r5)     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r5 = r5.object()     // Catch:{ Exception -> 0x026a }
            java.lang.String r6 = "Type"
            org.json.JSONStringer r5 = r5.key(r6)     // Catch:{ Exception -> 0x026a }
            x5.b r6 = r3.f73838a     // Catch:{ Exception -> 0x026a }
            java.lang.String r6 = r6.f73830a     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r5 = r5.value(r6)     // Catch:{ Exception -> 0x026a }
            java.lang.String r6 = "RelativeTime"
            org.json.JSONStringer r5 = r5.key(r6)     // Catch:{ Exception -> 0x026a }
            x5.b r6 = r3.f73838a     // Catch:{ Exception -> 0x026a }
            int r6 = r6.f73831b     // Catch:{ Exception -> 0x026a }
            long r6 = (long) r6     // Catch:{ Exception -> 0x026a }
            r5.value(r6)     // Catch:{ Exception -> 0x026a }
            x5.b r5 = r3.f73838a     // Catch:{ Exception -> 0x026a }
            java.lang.String r5 = r5.f73830a     // Catch:{ Exception -> 0x026a }
            boolean r5 = r1.equals(r5)     // Catch:{ Exception -> 0x026a }
            if (r5 == 0) goto L_0x01d5
            java.lang.String r5 = "Duration"
            org.json.JSONStringer r5 = r4.key(r5)     // Catch:{ Exception -> 0x026a }
            x5.b r6 = r3.f73838a     // Catch:{ Exception -> 0x026a }
            int r6 = r6.f73832c     // Catch:{ Exception -> 0x026a }
            long r6 = (long) r6     // Catch:{ Exception -> 0x026a }
            r5.value(r6)     // Catch:{ Exception -> 0x026a }
        L_0x01d5:
            java.lang.String r5 = "Parameters"
            org.json.JSONStringer r5 = r4.key(r5)     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r5 = r5.object()     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r5 = r5.key(r0)     // Catch:{ Exception -> 0x026a }
            x5.b r6 = r3.f73838a     // Catch:{ Exception -> 0x026a }
            x5.d r6 = r6.f73834e     // Catch:{ Exception -> 0x026a }
            int r6 = r6.f73836b     // Catch:{ Exception -> 0x026a }
            long r6 = (long) r6     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r5 = r5.value(r6)     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r5 = r5.key(r11)     // Catch:{ Exception -> 0x026a }
            x5.b r6 = r3.f73838a     // Catch:{ Exception -> 0x026a }
            x5.d r6 = r6.f73834e     // Catch:{ Exception -> 0x026a }
            int r6 = r6.f73835a     // Catch:{ Exception -> 0x026a }
            long r6 = (long) r6     // Catch:{ Exception -> 0x026a }
            r5.value(r6)     // Catch:{ Exception -> 0x026a }
            x5.b r5 = r3.f73838a     // Catch:{ Exception -> 0x026a }
            java.lang.String r5 = r5.f73830a     // Catch:{ Exception -> 0x026a }
            boolean r5 = r1.equals(r5)     // Catch:{ Exception -> 0x026a }
            if (r5 == 0) goto L_0x0252
            java.lang.String r5 = "Curve"
            org.json.JSONStringer r5 = r4.key(r5)     // Catch:{ Exception -> 0x026a }
            r5.array()     // Catch:{ Exception -> 0x026a }
            x5.b r3 = r3.f73838a     // Catch:{ Exception -> 0x026a }
            x5.d r3 = r3.f73834e     // Catch:{ Exception -> 0x026a }
            java.util.ArrayList<x5.a> r3 = r3.f73837c     // Catch:{ Exception -> 0x026a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x026a }
        L_0x0219:
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x026a }
            if (r5 == 0) goto L_0x024f
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x026a }
            x5.a r5 = (p421x5.C26532a) r5     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r6 = r4.object()     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r6 = r6.key(r0)     // Catch:{ Exception -> 0x026a }
            int r7 = r5.f73829c     // Catch:{ Exception -> 0x026a }
            long r7 = (long) r7     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r6 = r6.value(r7)     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r6 = r6.key(r11)     // Catch:{ Exception -> 0x026a }
            double r7 = r5.f73828b     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r6 = r6.value(r7)     // Catch:{ Exception -> 0x026a }
            java.lang.String r7 = "Time"
            org.json.JSONStringer r6 = r6.key(r7)     // Catch:{ Exception -> 0x026a }
            int r5 = r5.f73827a     // Catch:{ Exception -> 0x026a }
            long r7 = (long) r5     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r5 = r6.value(r7)     // Catch:{ Exception -> 0x026a }
            r5.endObject()     // Catch:{ Exception -> 0x026a }
            goto L_0x0219
        L_0x024f:
            r4.endArray()     // Catch:{ Exception -> 0x026a }
        L_0x0252:
            org.json.JSONStringer r3 = r4.endObject()     // Catch:{ Exception -> 0x026a }
            org.json.JSONStringer r3 = r3.endObject()     // Catch:{ Exception -> 0x026a }
            r3.endObject()     // Catch:{ Exception -> 0x026a }
            goto L_0x0188
        L_0x025f:
            org.json.JSONStringer r10 = r4.endArray()     // Catch:{ Exception -> 0x026a }
            r10.endObject()     // Catch:{ Exception -> 0x026a }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x026a }
        L_0x026a:
            r5 = r2
        L_0x026b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p392w5.C26424f.m34021c(java.lang.String, int):java.lang.String");
    }

    /* renamed from: d */
    public static int m34022d(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        C26534c g = m34025g(str);
        if (!C23610a.m28204a(g)) {
            return 0;
        }
        return g.getDuration();
    }

    /* renamed from: e */
    public static C26624a m34023e(String str) {
        if (1 != m34027i(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C26624a aVar = new C26624a();
            aVar.f74064a = new C26625b();
            aVar.f74065b = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("Pattern");
            for (int i = 0; i < jSONArray.length(); i++) {
                C26536e eVar = new C26536e();
                eVar.f73838a = new C26533b();
                JSONObject jSONObject2 = ((JSONObject) jSONArray.get(i)).getJSONObject("Event");
                eVar.f73838a.f73830a = jSONObject2.getString("Type");
                if ("continuous".equals(eVar.f73838a.f73830a)) {
                    eVar.f73838a.f73832c = jSONObject2.getInt("Duration");
                }
                eVar.f73838a.f73831b = jSONObject2.getInt("RelativeTime");
                JSONObject jSONObject3 = jSONObject2.getJSONObject("Parameters");
                C26533b bVar = eVar.f73838a;
                C26535d dVar = new C26535d();
                bVar.f73834e = dVar;
                dVar.f73836b = jSONObject3.getInt("Frequency");
                eVar.f73838a.f73834e.f73835a = jSONObject3.getInt("Intensity");
                eVar.f73838a.f73834e.f73837c = new ArrayList<>();
                if ("continuous".equals(eVar.f73838a.f73830a)) {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("Curve");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject4 = (JSONObject) jSONArray2.get(i2);
                        C26532a aVar2 = new C26532a();
                        aVar2.f73829c = jSONObject4.getInt("Frequency");
                        aVar2.f73828b = jSONObject4.getDouble("Intensity");
                        aVar2.f73827a = jSONObject4.getInt("Time");
                        eVar.f73838a.f73834e.f73837c.add(aVar2);
                    }
                }
                aVar.f74065b.add(eVar);
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static C26654a m34024f(String str) {
        if (2 != m34027i(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C26654a aVar = new C26654a();
            aVar.f74225a = new C26655b();
            aVar.f74226b = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("PatternList");
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                C26656c cVar = new C26656c();
                cVar.f74227a = jSONObject2.getInt("AbsoluteTime");
                cVar.f74228b = new ArrayList<>();
                JSONArray jSONArray2 = jSONObject2.getJSONArray("Pattern");
                int i2 = 0;
                while (i2 < jSONArray2.length()) {
                    C26536e eVar = new C26536e();
                    eVar.f73838a = new C26533b();
                    JSONObject jSONObject3 = ((JSONObject) jSONArray2.get(i2)).getJSONObject("Event");
                    eVar.f73838a.f73830a = jSONObject3.getString("Type");
                    if ("continuous".equals(eVar.f73838a.f73830a)) {
                        eVar.f73838a.f73832c = jSONObject3.getInt("Duration");
                    }
                    eVar.f73838a.f73831b = jSONObject3.getInt("RelativeTime");
                    eVar.f73838a.f73833d = jSONObject3.getInt("Index");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("Parameters");
                    C26533b bVar = eVar.f73838a;
                    C26535d dVar = new C26535d();
                    bVar.f73834e = dVar;
                    dVar.f73836b = jSONObject4.getInt("Frequency");
                    eVar.f73838a.f73834e.f73835a = jSONObject4.getInt("Intensity");
                    eVar.f73838a.f73834e.f73837c = new ArrayList<>();
                    if ("continuous".equals(eVar.f73838a.f73830a)) {
                        JSONArray jSONArray3 = jSONObject4.getJSONArray("Curve");
                        int i3 = 0;
                        while (i3 < jSONArray3.length()) {
                            JSONObject jSONObject5 = (JSONObject) jSONArray3.get(i3);
                            C26532a aVar2 = new C26532a();
                            aVar2.f73829c = jSONObject5.getInt("Frequency");
                            C26654a aVar3 = aVar;
                            try {
                                aVar2.f73828b = jSONObject5.getDouble("Intensity");
                                aVar2.f73827a = jSONObject5.getInt("Time");
                                eVar.f73838a.f73834e.f73837c.add(aVar2);
                                i3++;
                                aVar = aVar3;
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                    }
                    cVar.f74228b.add(eVar);
                    i2++;
                    aVar = aVar;
                }
                C26654a aVar4 = aVar;
                aVar4.f74226b.add(cVar);
                i++;
                aVar = aVar4;
            }
            return aVar;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: g */
    public static C26534c m34025g(String str) {
        int i = m34027i(str);
        if (i == 1) {
            try {
                return m34023e(str);
            } catch (Exception unused) {
                return null;
            }
        } else if (i != 2) {
            return null;
        } else {
            try {
                return m34024f(str);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0036 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m34026h(java.io.File r5) {
        /*
            if (r5 == 0) goto L_0x003e
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x0009
            goto L_0x003e
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
        L_0x001e:
            java.lang.String r5 = r2.readLine()     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            if (r5 == 0) goto L_0x0028
            r0.append(r5)     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            goto L_0x001e
        L_0x0028:
            r2.close()     // Catch:{ Exception -> 0x0039 }
            goto L_0x0039
        L_0x002c:
            r5 = move-exception
            r1 = r2
            goto L_0x0032
        L_0x002f:
            r1 = r2
            goto L_0x0036
        L_0x0031:
            r5 = move-exception
        L_0x0032:
            r1.close()     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            throw r5
        L_0x0036:
            r1.close()     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            java.lang.String r5 = r0.toString()
            return r5
        L_0x003e:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p392w5.C26424f.m34026h(java.io.File):java.lang.String");
    }

    /* renamed from: i */
    public static int m34027i(String str) {
        try {
            return new JSONObject(str).getJSONObject("Metadata").getInt("Version");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: j */
    public static String m34028j(String str) {
        C26654a aVar;
        C26654a aVar2;
        try {
            aVar = m34024f(str);
        } catch (Exception unused) {
            aVar = null;
        }
        if (!C23610a.m28204a(aVar)) {
            return "";
        }
        Iterator<C26656c> it = aVar.f74226b.iterator();
        while (it.hasNext()) {
            Iterator<C26536e> it4 = it.next().f74228b.iterator();
            while (it4.hasNext()) {
                C26536e next = it4.next();
                C26535d dVar = next.f73838a.f73834e;
                ArrayList<C26532a> arrayList = dVar.f73837c;
                if (arrayList == null || arrayList.size() == 0) {
                    aVar2 = aVar;
                    arrayList = null;
                } else {
                    int size = arrayList.size();
                    if (size <= 0 || size > 4) {
                        C26532a aVar3 = new C26532a();
                        int i = size - 2;
                        int i2 = i / 2;
                        int i3 = 1;
                        while (i3 <= i2) {
                            aVar3.f73827a += arrayList.get(i3).f73827a;
                            aVar3.f73828b += arrayList.get(i3).f73828b;
                            aVar3.f73829c += arrayList.get(i3).f73829c;
                            i3++;
                            aVar = aVar;
                        }
                        aVar2 = aVar;
                        aVar3.f73827a /= i2;
                        double d = aVar3.f73828b / ((double) i2);
                        aVar3.f73828b = d;
                        aVar3.f73828b = ((double) Math.round(d * 10.0d)) / 10.0d;
                        aVar3.f73829c /= i2;
                        C26532a aVar4 = new C26532a();
                        for (int i4 = i2 + 1; i4 <= i; i4++) {
                            aVar4.f73827a += arrayList.get(i4).f73827a;
                            aVar4.f73828b += arrayList.get(i4).f73828b;
                            aVar4.f73829c += arrayList.get(i4).f73829c;
                        }
                        int i5 = i - i2;
                        aVar4.f73827a /= i5;
                        double d2 = aVar4.f73828b / ((double) i5);
                        aVar4.f73828b = d2;
                        aVar4.f73828b = ((double) Math.round(d2 * 10.0d)) / 10.0d;
                        aVar4.f73829c /= i5;
                        arrayList.subList(1, size - 1).clear();
                        arrayList.add(1, aVar3);
                        arrayList.add(2, aVar4);
                    } else {
                        aVar2 = aVar;
                    }
                }
                dVar.f73837c = arrayList;
                if (next.f73838a.f73830a.equals("transient")) {
                    C26535d dVar2 = next.f73838a.f73834e;
                    int i6 = dVar2.f73836b;
                    if (i6 < 0) {
                        dVar2.f73836b = 0;
                    } else if (i6 > 100) {
                        dVar2.f73836b = 100;
                    }
                }
                aVar = aVar2;
            }
        }
        return m34020b(aVar);
    }

    /* renamed from: k */
    public static String m34029k(String str) {
        int i;
        if (2 != m34027i(str)) {
            return null;
        }
        C26654a f = m34024f(str);
        if (!C23610a.m28204a(f)) {
            return null;
        }
        for (int i2 = 0; i2 <= 2; i2++) {
            Iterator<C26656c> it = f.f74226b.iterator();
            while (it.hasNext()) {
                C26656c next = it.next();
                if (next.f74228b.size() > 1) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < next.f74228b.size(); i4++) {
                        C26533b bVar = next.f74228b.get(i4).f73838a;
                        if (bVar != null && bVar.f73833d == i2) {
                            int i5 = bVar.f73831b;
                            int i6 = bVar.f73830a.equals("continuous") ? bVar.f73832c + i5 : i5 + 22;
                            if (i5 < i3) {
                                next.f74228b.get(i4).f73838a.f73831b = -1;
                            } else {
                                i3 = i6;
                            }
                        }
                    }
                    Iterator<C26536e> it4 = next.f74228b.iterator();
                    while (it4.hasNext()) {
                        if (it4.next().f73838a.f73831b < 0) {
                            it4.remove();
                        }
                    }
                }
            }
        }
        for (int i7 = 1; i7 <= 2; i7++) {
            Iterator<C26656c> it5 = f.f74226b.iterator();
            while (it5.hasNext()) {
                C26656c next2 = it5.next();
                if (next2.f74228b.size() > 1) {
                    int i8 = 0;
                    for (int i9 = 0; i9 < next2.f74228b.size(); i9++) {
                        C26533b bVar2 = next2.f74228b.get(i9).f73838a;
                        if (bVar2 != null && ((i = bVar2.f73833d) == i7 || i == 0)) {
                            int i15 = bVar2.f73831b;
                            int i16 = bVar2.f73830a.equals("continuous") ? bVar2.f73832c + i15 : i15 + 22;
                            if (i15 < i8) {
                                next2.f74228b.get(i9).f73838a.f73831b = -1;
                            } else {
                                i8 = i16;
                            }
                        }
                    }
                    Iterator<C26536e> it6 = next2.f74228b.iterator();
                    while (it6.hasNext()) {
                        if (it6.next().f73838a.f73831b < 0) {
                            it6.remove();
                        }
                    }
                }
            }
        }
        return m34020b(f);
    }
}
