package com.tencent.mapsdk.internal;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.qx */
public final class C114129qx {

    /* renamed from: a */
    public static final int f341614a = 1000;

    /* renamed from: b */
    public static final int f341615b = 11;

    /* renamed from: g */
    private static final String f341616g = "[{\"id\":0,\"index\":0,\"order\":1},{\"id\":-1,\"index\":1,\"order\":-1},{\"id\":-1,\"index\":2,\"order\":-1},{\"id\":-1,\"index\":3,\"order\":-1},{\"id\":-1,\"index\":4,\"order\":-1},{\"id\":-1,\"index\":5,\"order\":-1},{\"id\":-1,\"index\":6,\"order\":-1},{\"id\":-1,\"index\":7,\"order\":-1},{\"id\":16,\"index\":8,\"order\":-1},{\"id\":9,\"index\":9,\"order\":-1},{\"id\":10,\"index\":10,\"order\":-1},{\"id\":5,\"index\":11,\"order\":-1},{\"id\":4,\"index\":12,\"order\":-1},{\"id\":6,\"index\":13,\"order\":-1},{\"id\":7,\"index\":14,\"order\":-1},{\"id\":8,\"index\":15,\"order\":-1}]";

    /* renamed from: c */
    public volatile List<C114128qw> f341617c;

    /* renamed from: d */
    public final Object f341618d;

    /* renamed from: e */
    public C113955mh f341619e;

    /* renamed from: f */
    public int f341620f = -1;

    public C114129qx(Context context, String str) {
        Object obj = new Object();
        this.f341618d = obj;
        if (str == null) {
            this.f341619e = C113958mk.m157962a(context);
        } else {
            this.f341619e = C113957mj.m157958a(context, str);
        }
        this.f341617c = new CopyOnWriteArrayList();
        String a = this.f341619e.mo172391a(C0939el.f2167A);
        try {
            JSONArray jSONArray = new JSONArray(a == null ? f341616g : a);
            synchronized (obj) {
                this.f341617c.addAll(m159256a(jSONArray));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static List<C114128qw> m159256a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new C114128qw(jSONObject.getInt(FirebaseAnalytics.C113379b.INDEX), jSONObject.getInt("id"), jSONObject.getInt("order")));
                i++;
            } catch (Exception unused) {
                return null;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    private void m159258b() {
        this.f341617c = new CopyOnWriteArrayList();
        String a = this.f341619e.mo172391a(C0939el.f2167A);
        if (a == null) {
            a = f341616g;
        }
        try {
            JSONArray jSONArray = new JSONArray(a);
            synchronized (this.f341618d) {
                this.f341617c.addAll(m159256a(jSONArray));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m159259b(JSONArray jSONArray) {
        List<C114128qw> a;
        String a2 = this.f341619e.mo172391a(C0939el.f2167A);
        if (jSONArray != null && (a = m159256a(jSONArray)) != null) {
            synchronized (this.f341618d) {
                this.f341617c.clear();
                this.f341617c.addAll(a);
            }
            if (!jSONArray.toString().equals(a2)) {
                this.f341619e.mo172392a();
                this.f341619e.mo172395a(C0939el.f2167A, jSONArray.toString());
            }
        }
    }

    /* renamed from: a */
    public final String mo172747a() {
        if (this.f341617c == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(128);
        for (C114128qw next : this.f341617c) {
            if (next.f341612b != -1) {
                if (sb.length() == 0) {
                    sb.append(next.f341612b);
                } else {
                    sb.append(",");
                    sb.append(next.f341612b);
                }
            } else if (sb.length() == 0) {
                sb.append(0);
            } else {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0054, code lost:
        return r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo172748b(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f341618d
            monitor-enter(r0)
            java.util.List<com.tencent.mapsdk.internal.qw> r1 = r5.f341617c     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0053
            java.util.List<com.tencent.mapsdk.internal.qw> r1 = r5.f341617c     // Catch:{ all -> 0x0055 }
            int r1 = r1.size()     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0053
            if (r6 >= 0) goto L_0x0012
            goto L_0x0053
        L_0x0012:
            r1 = 8
            r2 = 19
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r6 < r1) goto L_0x001c
            if (r6 <= r2) goto L_0x0020
        L_0x001c:
            int r1 = r5.f341620f     // Catch:{ all -> 0x0055 }
            if (r1 < r3) goto L_0x0023
        L_0x0020:
            int r6 = r6 + r3
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r6
        L_0x0023:
            if (r6 <= r2) goto L_0x002b
            if (r6 >= r3) goto L_0x002b
            int r6 = r6 + -11
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r6
        L_0x002b:
            java.util.List<com.tencent.mapsdk.internal.qw> r1 = r5.f341617c     // Catch:{ all -> 0x0055 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0055 }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0055 }
            com.tencent.mapsdk.internal.qw r2 = (com.tencent.mapsdk.internal.C114128qw) r2     // Catch:{ all -> 0x0055 }
            int r4 = r2.f341611a     // Catch:{ all -> 0x0055 }
            if (r6 != r4) goto L_0x0031
            if (r6 != 0) goto L_0x004d
            int r6 = r2.f341612b     // Catch:{ all -> 0x0055 }
            if (r6 != 0) goto L_0x004d
            int r6 = r5.f341620f     // Catch:{ all -> 0x0055 }
            if (r6 > 0) goto L_0x004d
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r3
        L_0x004d:
            int r6 = r2.f341613c     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r6
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r6
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r6
        L_0x0055:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114129qx.mo172748b(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.mapsdk.internal.C114128qw mo172746a(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f341618d
            monitor-enter(r0)
            java.util.List<com.tencent.mapsdk.internal.qw> r1 = r4.f341617c     // Catch:{ all -> 0x0070 }
            r2 = 0
            if (r1 == 0) goto L_0x006e
            java.util.List<com.tencent.mapsdk.internal.qw> r1 = r4.f341617c     // Catch:{ all -> 0x0070 }
            int r1 = r1.size()     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x006e
            if (r5 < 0) goto L_0x006e
            int r1 = r5 + -1000
            java.util.List<com.tencent.mapsdk.internal.qw> r3 = r4.f341617c     // Catch:{ all -> 0x0070 }
            int r3 = r3.size()     // Catch:{ all -> 0x0070 }
            if (r1 < r3) goto L_0x001d
            goto L_0x006e
        L_0x001d:
            r4.f341620f = r5     // Catch:{ all -> 0x0070 }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r5 < r3) goto L_0x002d
            java.util.List<com.tencent.mapsdk.internal.qw> r5 = r4.f341617c     // Catch:{ all -> 0x0070 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ all -> 0x0070 }
            com.tencent.mapsdk.internal.qw r5 = (com.tencent.mapsdk.internal.C114128qw) r5     // Catch:{ all -> 0x0070 }
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return r5
        L_0x002d:
            r1 = 8
            if (r5 <= r1) goto L_0x004b
            r1 = 989(0x3dd, float:1.386E-42)
            if (r5 >= r1) goto L_0x004b
            int r5 = r5 + 11
            java.util.List<com.tencent.mapsdk.internal.qw> r1 = r4.f341617c     // Catch:{ all -> 0x0070 }
            int r1 = r1.size()     // Catch:{ all -> 0x0070 }
            if (r5 < r1) goto L_0x0041
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return r2
        L_0x0041:
            java.util.List<com.tencent.mapsdk.internal.qw> r1 = r4.f341617c     // Catch:{ all -> 0x0070 }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x0070 }
            com.tencent.mapsdk.internal.qw r5 = (com.tencent.mapsdk.internal.C114128qw) r5     // Catch:{ all -> 0x0070 }
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return r5
        L_0x004b:
            java.util.List<com.tencent.mapsdk.internal.qw> r1 = r4.f341617c     // Catch:{ all -> 0x0070 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0070 }
        L_0x0051:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0070 }
            com.tencent.mapsdk.internal.qw r2 = (com.tencent.mapsdk.internal.C114128qw) r2     // Catch:{ all -> 0x0070 }
            int r3 = r2.f341613c     // Catch:{ all -> 0x0070 }
            if (r3 != r5) goto L_0x0051
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return r2
        L_0x0063:
            java.util.List<com.tencent.mapsdk.internal.qw> r5 = r4.f341617c     // Catch:{ all -> 0x0070 }
            r1 = 0
            java.lang.Object r5 = r5.get(r1)     // Catch:{ all -> 0x0070 }
            com.tencent.mapsdk.internal.qw r5 = (com.tencent.mapsdk.internal.C114128qw) r5     // Catch:{ all -> 0x0070 }
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return r5
        L_0x006e:
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return r2
        L_0x0070:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114129qx.mo172746a(int):com.tencent.mapsdk.internal.qw");
    }

    /* renamed from: a */
    private void m159257a(C113961mq mqVar) {
        C114128qw a;
        if (mqVar != null && (a = mo172746a(this.f341620f)) != null) {
            mqVar.f340901i.mo171224b(a.f341611a);
        }
    }
}
