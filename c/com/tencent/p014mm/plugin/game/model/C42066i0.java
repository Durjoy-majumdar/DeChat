package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import py1.C47594h4;

/* renamed from: com.tencent.mm.plugin.game.model.i0 */
public class C42066i0 {

    /* renamed from: a */
    public String f113338a = "";

    /* renamed from: b */
    public List<C42067a> f113339b = new LinkedList();

    /* renamed from: com.tencent.mm.plugin.game.model.i0$a */
    public static class C42067a implements Serializable {

        /* renamed from: d */
        public int f113340d;

        /* renamed from: e */
        public String f113341e;

        /* renamed from: f */
        public String f113342f;

        /* renamed from: g */
        public long f113343g;

        /* renamed from: h */
        public int f113344h;

        /* renamed from: i */
        public boolean f113345i;

        /* renamed from: j */
        public String f113346j;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x005b */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079 A[SYNTHETIC, Splitter:B:27:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087 A[SYNTHETIC, Splitter:B:36:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C42066i0(java.lang.String r9) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r0 = ""
            r8.f113338a = r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r8.f113339b = r1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            r8.f113338a = r9
            java.util.List<com.tencent.mm.plugin.game.model.i0$a> r9 = r8.f113339b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.f113338a
            r1.append(r2)
            java.lang.String r2 = "_ranks"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.Class<sw1.q> r3 = sw1.C48484q.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            sw1.q r3 = (sw1.C48484q) r3
            com.tencent.mm.plugin.game.model.e0 r3 = r3.mo66106SL()
            byte[] r1 = r3.mo57116Rz(r1)
            if (r1 != 0) goto L_0x0044
            goto L_0x007c
        L_0x0044:
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r1)
            r1 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            java.lang.Object r1 = r4.readObject()     // Catch:{ Exception -> 0x0062 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0062 }
            r2.addAll(r1)     // Catch:{ Exception -> 0x0062 }
            r3.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r4.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x007c
        L_0x005f:
            r9 = move-exception
            r1 = r4
            goto L_0x0080
        L_0x0062:
            r1 = move-exception
            goto L_0x006a
        L_0x0064:
            r9 = move-exception
            goto L_0x0080
        L_0x0066:
            r4 = move-exception
            r7 = r4
            r4 = r1
            r1 = r7
        L_0x006a:
            java.lang.String r5 = "MicroMsg.GamePBDataDetailRank"
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x005f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r0, r6)     // Catch:{ all -> 0x005f }
            r3.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x0077
        L_0x0076:
        L_0x0077:
            if (r4 == 0) goto L_0x007c
            r4.close()     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            r9.addAll(r2)
            return
        L_0x0080:
            r3.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
        L_0x0085:
            if (r1 == 0) goto L_0x008a
            r1.close()     // Catch:{ IOException -> 0x008a }
        L_0x008a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.C42066i0.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[SYNTHETIC, Splitter:B:19:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[SYNTHETIC, Splitter:B:23:0x0059] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66036a() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f113338a
            r0.append(r1)
            java.lang.String r1 = "_ranks"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0045 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0045 }
            java.util.List<com.tencent.mm.plugin.game.model.i0$a> r2 = r6.f113339b     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r3.writeObject(r2)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            byte[] r2 = r1.toByteArray()     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            java.lang.Class<sw1.q> r4 = sw1.C48484q.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            sw1.q r4 = (sw1.C48484q) r4     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            com.tencent.mm.plugin.game.model.e0 r4 = r4.mo66106SL()     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r4.mo57117Yt(r0, r2)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r3.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r1.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0056
        L_0x003d:
            r0 = move-exception
            r2 = r3
            goto L_0x0057
        L_0x0040:
            r0 = move-exception
            r2 = r3
            goto L_0x0046
        L_0x0043:
            r0 = move-exception
            goto L_0x0057
        L_0x0045:
            r0 = move-exception
        L_0x0046:
            java.lang.String r3 = "MicroMsg.GamePBDataDetailRank"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0043 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r5)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0039
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0039
        L_0x0056:
            return
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            r1.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.C42066i0.mo66036a():void");
    }

    public C42066i0(String str, List<C47594h4> list) {
        if (!Util.isNullOrNil(str) && list != null && !list.isEmpty()) {
            this.f113338a = str;
            this.f113339b.clear();
            for (C47594h4 next : list) {
                C42067a aVar = new C42067a();
                aVar.f113340d = next.f127758e;
                aVar.f113341e = next.f127757d;
                aVar.f113342f = next.f127760g;
                aVar.f113343g = next.f127759f;
                aVar.f113345i = next.f127761h;
                aVar.f113344h = next.f127762i;
                aVar.f113346j = next.f127763j;
                this.f113339b.add(aVar);
            }
            mo66036a();
        }
    }
}
