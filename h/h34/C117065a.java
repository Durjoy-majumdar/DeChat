package h34;

import d34.C116558b;
import d34.C116559c;
import e34.C116680b;
import e34.C116681c;
import e34.C116682d;
import f34.C116799a;
import g34.C116910a;
import g34.C116911b;
import g34.C116912c;
import g34.C116913d;
import g34.C116914e;
import g34.C116916g;
import g34.C116918i;
import g34.C116919k;
import g34.C87131j;
import i34.C98596a;
import j34.C117295b;
import j34.C117296c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: h34.a */
public class C117065a implements C117066b {

    /* renamed from: c */
    public static /* synthetic */ int[] f350748c;

    /* renamed from: a */
    public C116910a f350749a;

    /* renamed from: b */
    public C116558b f350750b;

    public C117065a(C116558b bVar, C116910a aVar) {
        this.f350750b = bVar;
        this.f350749a = aVar;
    }

    /* renamed from: a */
    public final void mo180992a(C116912c cVar, C116918i iVar) {
        this.f350750b.getClass();
        cVar.mo180876d("oauth_timestamp", String.valueOf(Long.valueOf(Long.valueOf(System.currentTimeMillis()).longValue() / 1000)));
        this.f350750b.getClass();
        cVar.mo180876d("oauth_nonce", String.valueOf(Long.valueOf(Long.valueOf(System.currentTimeMillis()).longValue() / 1000).longValue() + ((long) Integer.valueOf(new Random().nextInt()).intValue())));
        cVar.mo180876d("oauth_consumer_key", this.f350749a.f350328a);
        this.f350750b.getClass();
        cVar.mo180876d("oauth_signature_method", "HMAC-SHA1");
        cVar.mo180876d("oauth_version", "1.0");
        this.f350749a.getClass();
        this.f350749a.mo180875a("generating signature...");
        this.f350750b.getClass();
        C117296c.m165375b(cVar, "Cannot extract base string from null object");
        Map<String, String> map = cVar.f350332g;
        if (map == null || ((HashMap) map).size() <= 0) {
            throw new C116681c(cVar);
        }
        String b = C117295b.m165373b(cVar.f350337b.name());
        String str = "";
        String b2 = C117295b.m165373b(cVar.f350336a.replaceAll("\\?.*", str).replace("\\:\\d{4}", str));
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList();
            String query = new URL(cVar.f350336a).getQuery();
            if (query != null && query.length() > 0) {
                for (String split : query.split("&")) {
                    String[] split2 = split.split("=");
                    arrayList2.add(new C116913d(C117295b.m165372a(split2[0]), split2.length > 1 ? C117295b.m165372a(split2[1]) : str));
                }
            }
            arrayList2.addAll(cVar.f350338c.f350335a);
            arrayList.addAll(arrayList2);
            arrayList.addAll(cVar.f350339d.f350335a);
            Map<String, String> map2 = cVar.f350332g;
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry : ((HashMap) map2).entrySet()) {
                arrayList3.add(new C116913d((String) entry.getKey(), (String) entry.getValue()));
            }
            arrayList.addAll(arrayList3);
            C116914e eVar = new C116914e(arrayList);
            Collections.sort(eVar.f350335a);
            String format = String.format("%s&%s&%s", new Object[]{b, b2, C117295b.m165373b(eVar.mo180881a())});
            this.f350750b.getClass();
            C98596a aVar = new C98596a();
            String str2 = this.f350749a.f350329b;
            String str3 = iVar.f350348e;
            try {
                C117296c.m165374a(format, "Base string cant be null or empty string");
                C117296c.m165374a(str2, "Api secret cant be null or empty string");
                String a = aVar.mo137989a(format, String.valueOf(C117295b.m165373b(str2)) + '&' + C117295b.m165373b(str3));
                this.f350749a.mo180875a("base string is: " + format);
                this.f350749a.mo180875a("signature is: " + a);
                cVar.mo180876d("oauth_signature", a);
                C116910a aVar2 = this.f350749a;
                StringBuilder sb = new StringBuilder("appended additional OAuth parameters: ");
                Map<String, String> map3 = cVar.f350332g;
                if (map3 != null) {
                    HashMap hashMap = (HashMap) map3;
                    if (hashMap.isEmpty()) {
                        str = "{}";
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        for (Map.Entry entry2 : hashMap.entrySet()) {
                            sb4.append(String.format(", %s -> %s ", new Object[]{entry2.getKey().toString(), entry2.getValue().toString()}));
                        }
                        str = "{" + sb4.substring(1) + "}";
                    }
                }
                sb.append(str);
                aVar2.mo180875a(sb.toString());
            } catch (Exception e) {
                throw new C116682d(format, e);
            }
        } catch (MalformedURLException e2) {
            throw new C116680b("Malformed URL", e2);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo180993b(g34.C116912c r10) {
        /*
            r9 = this;
            int[] r0 = f350748c
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0008
            goto L_0x0015
        L_0x0008:
            g34.h[] r0 = g34.C116917h.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0013 }
        L_0x0013:
            f350748c = r0
        L_0x0015:
            g34.a r4 = r9.f350749a
            r4.getClass()
            r0 = r0[r3]
            if (r0 == r2) goto L_0x005d
            if (r0 == r1) goto L_0x0022
            goto L_0x00a9
        L_0x0022:
            g34.a r0 = r9.f350749a
            java.lang.String r1 = "using Querystring signature"
            r0.mo180875a(r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f350332g
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0035:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x003c
            goto L_0x00a9
        L_0x003c:
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            g34.e r3 = r10.f350338c
            java.util.List<g34.d> r3 = r3.f350335a
            g34.d r4 = new g34.d
            r4.<init>(r2, r1)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r4)
            goto L_0x0035
        L_0x005d:
            g34.a r0 = r9.f350749a
            java.lang.String r4 = "using Http Header signature"
            r0.mo180875a(r4)
            d34.b r0 = r9.f350750b
            r0.getClass()
            java.lang.String r0 = "Cannot extract a header from a null object"
            j34.C117296c.m165375b(r10, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f350332g
            if (r0 == 0) goto L_0x00d6
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00d6
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f350332g
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r5 = r0.size()
            int r5 = r5 * 20
            r4.<init>(r5)
            java.lang.String r5 = "OAuth "
            r4.append(r5)
            java.util.Set r5 = r0.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0096:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x00aa
            java.lang.String r0 = r4.toString()
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f350340e
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.String r1 = "Authorization"
            r10.put(r1, r0)
        L_0x00a9:
            return
        L_0x00aa:
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r4.length()
            r8 = 6
            if (r7 <= r8) goto L_0x00bc
            java.lang.String r7 = ", "
            r4.append(r7)
        L_0x00bc:
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r3] = r6
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = j34.C117295b.m165373b(r6)
            r7[r2] = r6
            java.lang.String r6 = "%s=\"%s\""
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r4.append(r6)
            goto L_0x0096
        L_0x00d6:
            e34.c r0 = new e34.c
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h34.C117065a.mo180993b(g34.c):void");
    }

    /* renamed from: c */
    public C116918i mo180994c(C116918i iVar, C116919k kVar) {
        C116910a aVar = this.f350749a;
        this.f350750b.getClass();
        aVar.getClass();
        this.f350750b.getClass();
        C87131j jVar = C87131j.POST;
        this.f350750b.getClass();
        C116912c cVar = new C116912c(jVar, "https://api.twitter.com/oauth/access_token");
        cVar.mo180876d("oauth_token", iVar.f350347d);
        cVar.mo180876d("oauth_verifier", kVar.f350349a);
        C116910a aVar2 = this.f350749a;
        iVar.toString();
        aVar2.getClass();
        mo180992a(cVar, iVar);
        mo180993b(cVar);
        C116916g c = cVar.mo180884c();
        this.f350750b.getClass();
        C116799a aVar3 = new C116799a();
        String a = c.mo180885a();
        C117296c.m165374a(a, "Response body is incorrect. Can't extract a token from an empty string");
        return new C116918i(aVar3.mo180770a(a, C116799a.f350122a), aVar3.mo180770a(a, C116799a.f350123b), a);
    }

    /* renamed from: d */
    public String mo180995d(C116918i iVar) {
        ((C116559c) this.f350750b).getClass();
        return String.format("https://api.twitter.com/oauth/authorize?oauth_token=%s", new Object[]{iVar.f350347d});
    }

    /* renamed from: e */
    public C116918i mo180996e() {
        C116910a aVar = this.f350749a;
        this.f350750b.getClass();
        aVar.getClass();
        this.f350750b.getClass();
        C87131j jVar = C87131j.POST;
        this.f350750b.getClass();
        C116912c cVar = new C116912c(jVar, "https://api.twitter.com/oauth/request_token");
        C116910a aVar2 = this.f350749a;
        String str = this.f350749a.f350330c;
        aVar2.getClass();
        cVar.mo180876d("oauth_callback", this.f350749a.f350330c);
        mo180992a(cVar, C116911b.f350331a);
        mo180993b(cVar);
        this.f350749a.getClass();
        String a = cVar.mo180884c().mo180885a();
        this.f350749a.getClass();
        this.f350749a.getClass();
        this.f350750b.getClass();
        C116799a aVar3 = new C116799a();
        C117296c.m165374a(a, "Response body is incorrect. Can't extract a token from an empty string");
        return new C116918i(aVar3.mo180770a(a, C116799a.f350122a), aVar3.mo180770a(a, C116799a.f350123b), a);
    }
}
