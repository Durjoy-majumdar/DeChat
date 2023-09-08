package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.n1 */
public final class C96874n1 {

    /* renamed from: a */
    public static final C96874n1 f283849a = new C96874n1();

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r3 = r13.f265015d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.tencent.p014mm.plugin.scanner.ImageQBarDataBean> mo135192a(com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r13 == 0) goto L_0x0033
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r2 = r13.f265015d
            if (r2 == 0) goto L_0x0033
            java.util.ArrayList r2 = r2.f265017b
            if (r2 == 0) goto L_0x0033
            java.util.Iterator r2 = r2.iterator()
        L_0x0018:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x0018
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 != 0) goto L_0x0018
            r1.add(r3)
            goto L_0x0018
        L_0x0033:
            r2 = 1
            if (r13 == 0) goto L_0x003d
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r3 = r13.f265015d
            if (r3 == 0) goto L_0x003d
            int r3 = r3.f265022g
            goto L_0x003e
        L_0x003d:
            r3 = 1
        L_0x003e:
            if (r13 == 0) goto L_0x0046
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r4 = r13.f265015d
            if (r4 == 0) goto L_0x0046
            int r2 = r4.f265023h
        L_0x0046:
            r4 = 0
            if (r13 == 0) goto L_0x0050
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r5 = r13.f265015d
            if (r5 == 0) goto L_0x0050
            java.lang.String r5 = r5.f265016a
            goto L_0x0051
        L_0x0050:
            r5 = r4
        L_0x0051:
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = ""
        L_0x0055:
            r6 = 0
            java.util.Iterator r1 = r1.iterator()
        L_0x005a:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00e7
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x00e3
            java.lang.String r7 = (java.lang.String) r7
            com.tencent.mm.plugin.scanner.ImageQBarDataBean r9 = new com.tencent.mm.plugin.scanner.ImageQBarDataBean
            r9.<init>()
            r9.f273113d = r7
            com.tencent.mm.pluginsdk.ui.tools.n1 r7 = f283849a
            if (r13 == 0) goto L_0x007c
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r10 = r13.f265015d
            if (r10 == 0) goto L_0x007c
            java.util.ArrayList r10 = r10.f265019d
            goto L_0x007d
        L_0x007c:
            r10 = r4
        L_0x007d:
            java.lang.String r10 = r7.mo135198g(r10, r6)
            r9.f273116g = r10
            if (r13 == 0) goto L_0x008c
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r10 = r13.f265015d
            if (r10 == 0) goto L_0x008c
            java.util.ArrayList r10 = r10.f265018c
            goto L_0x008d
        L_0x008c:
            r10 = r4
        L_0x008d:
            int r10 = r7.mo135197f(r10, r6)
            r9.f273114e = r10
            if (r13 == 0) goto L_0x009c
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r10 = r13.f265015d
            if (r10 == 0) goto L_0x009c
            java.util.ArrayList r10 = r10.f265020e
            goto L_0x009d
        L_0x009c:
            r10 = r4
        L_0x009d:
            int r10 = r7.mo135197f(r10, r6)
            r9.f273115f = r10
            if (r13 == 0) goto L_0x00ac
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r10 = r13.f265015d
            if (r10 == 0) goto L_0x00ac
            java.util.ArrayList r10 = r10.f265021f
            goto L_0x00ad
        L_0x00ac:
            r10 = r4
        L_0x00ad:
            int r10 = r7.mo135197f(r10, r6)
            r9.f273122p = r10
            if (r13 == 0) goto L_0x00bc
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r10 = r13.f265015d
            if (r10 == 0) goto L_0x00bc
            java.util.ArrayList r10 = r10.f265024i
            goto L_0x00bd
        L_0x00bc:
            r10 = r4
        L_0x00bd:
            float r10 = r7.mo135196e(r10, r6)
            float r11 = (float) r3
            float r10 = r10 / r11
            r9.f273117h = r10
            if (r13 == 0) goto L_0x00ce
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r10 = r13.f265015d
            if (r10 == 0) goto L_0x00ce
            java.util.ArrayList r10 = r10.f265025j
            goto L_0x00cf
        L_0x00ce:
            r10 = r4
        L_0x00cf:
            float r6 = r7.mo135196e(r10, r6)
            float r7 = (float) r2
            float r6 = r6 / r7
            r9.f273118i = r6
            r9.f273119j = r3
            r9.f273120n = r2
            r9.f273121o = r5
            r0.add(r9)
            r6 = r8
            goto L_0x005a
        L_0x00e3:
            sx3.C64197v.m75542k()
            throw r4
        L_0x00e7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1.mo135192a(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r3 = r3.f265015d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo135193b(com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0009
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r3 = r3.f265015d
            if (r3 == 0) goto L_0x0009
            java.util.ArrayList r3 = r3.f265018c
            goto L_0x000a
        L_0x0009:
            r3 = 0
        L_0x000a:
            r0 = 0
            int r3 = r2.mo135197f(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getEventCodeType "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.scanner.QBarOfImageFileResultEventDataParser"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1.mo135193b(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r3 = r3.f265015d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo135194c(com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0009
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r3 = r3.f265015d
            if (r3 == 0) goto L_0x0009
            java.util.ArrayList r3 = r3.f265020e
            goto L_0x000a
        L_0x0009:
            r3 = 0
        L_0x000a:
            r0 = 0
            int r3 = r2.mo135197f(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getEventCodeVersion "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.scanner.QBarOfImageFileResultEventDataParser"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1.mo135194c(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r3 = r3.f265015d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo135195d(com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0009
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r3 = r3.f265015d
            if (r3 == 0) goto L_0x0009
            java.util.ArrayList r3 = r3.f265017b
            goto L_0x000a
        L_0x0009:
            r3 = 0
        L_0x000a:
            r0 = 0
            java.lang.String r3 = r2.mo135198g(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getEventResult "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.scanner.QBarOfImageFileResultEventDataParser"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1.mo135195d(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent):java.lang.String");
    }

    /* renamed from: e */
    public final float mo135196e(ArrayList<Object> arrayList, int i) {
        float f = 0.0f;
        if (!(arrayList == null || arrayList.isEmpty()) && i >= 0 && i < arrayList.size()) {
            try {
                Object obj = arrayList.get(i);
                C87412m.m108593f(obj, "list[index]");
                f = ((Float) obj).floatValue();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", e, "", new Object[0]);
            }
        }
        Log.m105924i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getValueFloat:" + f + "   index:" + i);
        return f;
    }

    /* renamed from: f */
    public final int mo135197f(ArrayList<Object> arrayList, int i) {
        int i2 = 0;
        if (!(arrayList == null || arrayList.isEmpty()) && i >= 0 && i < arrayList.size()) {
            try {
                Object obj = arrayList.get(i);
                C87412m.m108593f(obj, "list[index]");
                i2 = ((Integer) obj).intValue();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", e, "", new Object[0]);
            }
        }
        Log.m105924i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getValueInt:" + i2 + "   index:" + i);
        return i2;
    }

    /* renamed from: g */
    public final String mo135198g(ArrayList<Object> arrayList, int i) {
        String str = "";
        if (!(arrayList == null || arrayList.isEmpty()) && i >= 0 && i < arrayList.size()) {
            try {
                Object obj = arrayList.get(i);
                C87412m.m108593f(obj, "list[index]");
                str = (String) obj;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", e, str, new Object[0]);
            }
        }
        Log.m105924i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getValueString:" + str + "   index:" + i);
        return str;
    }
}
