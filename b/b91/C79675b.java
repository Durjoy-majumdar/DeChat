package b91;

import a91.C79474a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s81.C90153a;

/* renamed from: b91.b */
public class C79675b extends C79474a {

    /* renamed from: a */
    public C90153a f233584a;

    /* renamed from: b */
    public Map<String, List<List<String>>> f233585b = new HashMap();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.util.List<java.util.List<java.lang.String>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo109467a(com.eclipsesource.mmv8.V8Array r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x00d4
            int r1 = r11.length()
            r2 = 1
            if (r1 >= r2) goto L_0x000c
            goto L_0x00d4
        L_0x000c:
            r1 = 0
            java.lang.String r11 = r11.getString(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[EdgeComputingJsApiReadEdgeDBData] logic, sql : "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "EdgeComputingJsApiBase"
            j81.C87906e.m109407a(r4, r3)
            boolean r3 = u24.C90599h.m113511d(r11)
            if (r3 == 0) goto L_0x002e
            return r0
        L_0x002e:
            java.util.Map<java.lang.String, java.util.List<java.util.List<java.lang.String>>> r3 = r10.f233585b
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r3 = r3.containsKey(r11)
            if (r3 != 0) goto L_0x0053
            s81.a r3 = r10.f233584a
            if (r3 != 0) goto L_0x0043
            s81.a r3 = new s81.a
            r3.<init>()
            r10.f233584a = r3
        L_0x0043:
            s81.a r3 = r10.f233584a
            java.lang.String r4 = "Edge.db"
            java.util.List r3 = r3.mo124408b(r4, r11)
            java.util.Map<java.lang.String, java.util.List<java.util.List<java.lang.String>>> r4 = r10.f233585b
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r11, r3)
            goto L_0x005e
        L_0x0053:
            java.util.Map<java.lang.String, java.util.List<java.util.List<java.lang.String>>> r3 = r10.f233585b
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r11 = r3.get(r11)
            r3 = r11
            java.util.List r3 = (java.util.List) r3
        L_0x005e:
            if (r3 == 0) goto L_0x00d4
            int r11 = r3.size()
            if (r11 > 0) goto L_0x0067
            goto L_0x00d4
        L_0x0067:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.util.Iterator r0 = r3.iterator()
        L_0x0070:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00cf
            java.lang.Object r3 = r0.next()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0070
            int r4 = r3.size()
            if (r4 > 0) goto L_0x0085
            goto L_0x0070
        L_0x0085:
            int r4 = r11.length()
            java.lang.String r5 = ";"
            if (r4 <= 0) goto L_0x0090
            r11.append(r5)
        L_0x0090:
            java.util.Iterator r4 = r3.iterator()
            r6 = 0
        L_0x0095:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0070
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x00a5
            java.lang.String r7 = ""
        L_0x00a5:
            java.lang.String r8 = ","
            boolean r9 = u24.C90599h.m113508a(r7, r8)
            if (r9 == 0) goto L_0x00b3
            java.lang.String r9 = "\\#"
            java.lang.String r7 = u24.C90599h.m113518k(r7, r8, r9)
        L_0x00b3:
            boolean r9 = u24.C90599h.m113508a(r7, r5)
            if (r9 == 0) goto L_0x00bf
            java.lang.String r9 = "\\$"
            java.lang.String r7 = u24.C90599h.m113518k(r7, r5, r9)
        L_0x00bf:
            r11.append(r7)
            int r7 = r3.size()
            int r7 = r7 - r2
            if (r6 >= r7) goto L_0x00cc
            r11.append(r8)
        L_0x00cc:
            int r6 = r6 + 1
            goto L_0x0095
        L_0x00cf:
            java.lang.String r11 = r11.toString()
            return r11
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b91.C79675b.mo109467a(com.eclipsesource.mmv8.V8Array):java.lang.Object");
    }

    /* renamed from: b */
    public String mo109468b() {
        return "read_edge_db_data";
    }

    public int getType() {
        return 5;
    }

    public void release() {
        ((HashMap) this.f233585b).clear();
        C90153a aVar = this.f233584a;
        if (aVar != null) {
            aVar.mo124409c();
            this.f233584a = null;
        }
    }
}
