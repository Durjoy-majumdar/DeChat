package l20;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: l20.b */
public class C21389b {

    /* renamed from: a */
    public SparseArray<C21390a> f60510a = new SparseArray<>();

    /* renamed from: b */
    public HashMap<C72994y1.C72995a, C21390a> f60511b = new HashMap<>();

    /* renamed from: c */
    public SparseArray<C21391b> f60512c = new SparseArray<>();

    /* renamed from: d */
    public HashMap<C72994y1.C72995a, C21391b> f60513d = new HashMap<>();

    /* renamed from: e */
    public Random f60514e = new Random();

    /* renamed from: f */
    public C85801v1 f60515f = null;

    /* renamed from: l20.b$a */
    public class C21390a {

        /* renamed from: a */
        public int f60516a;

        /* renamed from: b */
        public C72994y1.C72995a f60517b;

        /* renamed from: c */
        public int f60518c;

        /* renamed from: d */
        public String f60519d;

        /* renamed from: e */
        public String f60520e;

        public C21390a(C21389b bVar) {
        }
    }

    /* renamed from: l20.b$b */
    public class C21391b {

        /* renamed from: a */
        public int f60521a;

        /* renamed from: b */
        public C72994y1.C72995a f60522b;

        /* renamed from: c */
        public SparseArray<String> f60523c = new SparseArray<>();

        /* renamed from: d */
        public HashMap<String, String> f60524d = new HashMap<>();

        public C21391b(C21389b bVar) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l20.C21389b.C21390a mo33511a(int r10) {
        /*
            r9 = this;
            android.util.SparseArray<l20.b$a> r0 = r9.f60510a
            java.lang.Object r0 = r0.get(r10)
            l20.b$a r0 = (l20.C21389b.C21390a) r0
            if (r0 != 0) goto L_0x0073
            com.tencent.mm.storage.v1 r0 = r9.f60515f
            r1 = 0
            java.lang.Object r0 = r0.mo119684e(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0016
            goto L_0x006b
        L_0x0016:
            java.lang.String r2 = "\\|"
            java.lang.String[] r2 = r0.split(r2)
            int r3 = r2.length
            r4 = 3
            java.lang.String r5 = "MicroMsg.NewBadgeDecoder"
            r6 = 1
            r7 = 0
            if (r3 == r4) goto L_0x002e
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r7] = r0
            java.lang.String r0 = "loadDataSource array.length != 3 content %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
            goto L_0x006b
        L_0x002e:
            r3 = r2[r7]     // Catch:{ Exception -> 0x0054 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0054 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0054 }
            r4 = r2[r6]     // Catch:{ Exception -> 0x0054 }
            java.lang.String r4 = r9.mo33520j(r4)     // Catch:{ Exception -> 0x0054 }
            r8 = 2
            r2 = r2[r8]     // Catch:{ Exception -> 0x0054 }
            java.lang.String r2 = r9.mo33520j(r2)     // Catch:{ Exception -> 0x0054 }
            l20.b$a r8 = new l20.b$a     // Catch:{ Exception -> 0x0054 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0054 }
            r8.f60516a = r10     // Catch:{ Exception -> 0x0054 }
            r8.f60518c = r3     // Catch:{ Exception -> 0x0054 }
            r8.f60519d = r4     // Catch:{ Exception -> 0x0054 }
            r8.f60520e = r2     // Catch:{ Exception -> 0x0054 }
            r0 = r8
            goto L_0x006c
        L_0x0054:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
            r3[r7] = r2
            java.lang.String r2 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r3)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r7] = r0
            java.lang.String r0 = "loadDataSource exception content %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
        L_0x006b:
            r0 = r1
        L_0x006c:
            if (r0 == 0) goto L_0x0073
            android.util.SparseArray<l20.b$a> r1 = r9.f60510a
            r1.put(r10, r0)
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l20.C21389b.mo33511a(int):l20.b$a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l20.C21389b.C21390a mo33512b(com.tencent.p014mm.storage.C72994y1.C72995a r10) {
        /*
            r9 = this;
            java.util.HashMap<com.tencent.mm.storage.y1$a, l20.b$a> r0 = r9.f60511b
            java.lang.Object r0 = r0.get(r10)
            l20.b$a r0 = (l20.C21389b.C21390a) r0
            if (r0 != 0) goto L_0x0073
            com.tencent.mm.storage.v1 r0 = r9.f60515f
            r1 = 0
            java.lang.Object r0 = r0.mo119685f(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0016
            goto L_0x006b
        L_0x0016:
            java.lang.String r2 = "\\|"
            java.lang.String[] r2 = r0.split(r2)
            int r3 = r2.length
            r4 = 3
            java.lang.String r5 = "MicroMsg.NewBadgeDecoder"
            r6 = 1
            r7 = 0
            if (r3 == r4) goto L_0x002e
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r7] = r0
            java.lang.String r0 = "loadDataSource array.length != 3 content %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
            goto L_0x006b
        L_0x002e:
            r3 = r2[r7]     // Catch:{ Exception -> 0x0054 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0054 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0054 }
            r4 = r2[r6]     // Catch:{ Exception -> 0x0054 }
            java.lang.String r4 = r9.mo33520j(r4)     // Catch:{ Exception -> 0x0054 }
            r8 = 2
            r2 = r2[r8]     // Catch:{ Exception -> 0x0054 }
            java.lang.String r2 = r9.mo33520j(r2)     // Catch:{ Exception -> 0x0054 }
            l20.b$a r8 = new l20.b$a     // Catch:{ Exception -> 0x0054 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0054 }
            r8.f60517b = r10     // Catch:{ Exception -> 0x0054 }
            r8.f60518c = r3     // Catch:{ Exception -> 0x0054 }
            r8.f60519d = r4     // Catch:{ Exception -> 0x0054 }
            r8.f60520e = r2     // Catch:{ Exception -> 0x0054 }
            r0 = r8
            goto L_0x006c
        L_0x0054:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
            r3[r7] = r2
            java.lang.String r2 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r3)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r7] = r0
            java.lang.String r0 = "loadDataSource exception content %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
        L_0x006b:
            r0 = r1
        L_0x006c:
            if (r0 == 0) goto L_0x0073
            java.util.HashMap<com.tencent.mm.storage.y1$a, l20.b$a> r1 = r9.f60511b
            r1.put(r10, r0)
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l20.C21389b.mo33512b(com.tencent.mm.storage.y1$a):l20.b$a");
    }

    /* renamed from: c */
    public final C21391b mo33513c(int i) {
        C21391b bVar = this.f60512c.get(i);
        if (bVar == null) {
            String str = (String) this.f60515f.mo119684e(i, (Object) null);
            if (str == null) {
                bVar = new C21391b(this);
                bVar.f60521a = i;
            } else {
                String[] split = str.split("\\|");
                if (split.length % 2 != 0) {
                    Log.m105921e("MicroMsg.NewBadgeDecoder", "loadWatcher array.length %% 2 != 0 content %s", str);
                } else {
                    try {
                        C21391b bVar2 = new C21391b(this);
                        bVar2.f60521a = i;
                        for (int i2 = 0; i2 < split.length; i2 += 2) {
                            String str2 = split[i2];
                            if (!Util.isNullOrNil(str2) && str2.matches("^[\\d]+$")) {
                                bVar2.f60523c.put(Integer.valueOf(split[i2]).intValue(), mo33520j(split[i2 + 1]));
                            } else {
                                bVar2.f60524d.put(split[i2], mo33520j(split[i2 + 1]));
                            }
                        }
                        bVar = bVar2;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.NewBadgeDecoder", "exception:%s", Util.stackTraceToString(e));
                        Log.m105921e("MicroMsg.NewBadgeDecoder", "loadWatcher exception content %s", str);
                    }
                }
                bVar = null;
            }
            if (bVar == null) {
                Log.m105920e("MicroMsg.NewBadgeDecoder", "[carl] loadWatcher watcher == null");
                return null;
            }
            this.f60512c.put(i, bVar);
        }
        return bVar;
    }

    /* renamed from: d */
    public final C21391b mo33514d(C72994y1.C72995a aVar) {
        C21391b bVar = this.f60513d.get(aVar);
        if (bVar == null) {
            String str = (String) this.f60515f.mo119685f(aVar, (Object) null);
            if (str == null) {
                bVar = new C21391b(this);
                bVar.f60522b = aVar;
            } else {
                String[] split = str.split("\\|");
                if (split.length % 2 != 0) {
                    Log.m105921e("MicroMsg.NewBadgeDecoder", "loadWatcher array.length %% 2 != 0 content %s", str);
                } else {
                    try {
                        C21391b bVar2 = new C21391b(this);
                        bVar2.f60522b = aVar;
                        for (int i = 0; i < split.length; i += 2) {
                            String str2 = split[i];
                            if (!Util.isNullOrNil(str2) && str2.matches("^[\\d]+$")) {
                                bVar2.f60523c.put(Integer.valueOf(split[i]).intValue(), mo33520j(split[i + 1]));
                            } else {
                                bVar2.f60524d.put(split[i], mo33520j(split[i + 1]));
                            }
                        }
                        bVar = bVar2;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.NewBadgeDecoder", "exception:%s", Util.stackTraceToString(e));
                        Log.m105921e("MicroMsg.NewBadgeDecoder", "loadWatcher exception content %s", str);
                    }
                }
                bVar = null;
            }
            if (bVar == null) {
                Log.m105920e("MicroMsg.NewBadgeDecoder", "[carl] loadWatcher watcher == null");
                return null;
            }
            this.f60513d.put(aVar, bVar);
        }
        return bVar;
    }

    /* renamed from: e */
    public final String mo33515e() {
        long currentTimeMillis = System.currentTimeMillis();
        Random random = this.f60514e;
        return String.format("%d%04d", new Object[]{Long.valueOf(currentTimeMillis), Integer.valueOf(random.nextInt(Math.abs(random.nextInt(Integer.MAX_VALUE))) % 10000)});
    }

    /* renamed from: f */
    public C21390a mo33516f(int i, int i2, int i3) {
        Log.m105919d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSourceId %d, watcherId %d, type %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        C21390a a = mo33511a(i);
        if (a == null) {
            Log.m105918d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSource == null");
            return null;
        } else if ((i3 & a.f60518c) == 0) {
            Log.m105918d("MicroMsg.NewBadgeDecoder", "[alex] peek, dataSource.type is wrong");
            return null;
        } else {
            C21391b c = mo33513c(i2);
            if (c != null) {
                String str = c.f60523c.get(i);
                if (str != null && str.equals(a.f60520e)) {
                    return null;
                }
                if (str == null) {
                    c.f60523c.put(i, mo33515e());
                    mo33519i(c);
                }
                return a;
            }
            Log.m105920e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
            return null;
        }
    }

    /* renamed from: g */
    public C21390a mo33517g(C72994y1.C72995a aVar, C72994y1.C72995a aVar2, int i) {
        Log.m105919d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSourceKey %s, watcherKey %s, type %d", aVar, aVar2, Integer.valueOf(i));
        C21390a b = mo33512b(aVar);
        if (b == null) {
            Log.m105918d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSource == null");
            return null;
        } else if ((i & b.f60518c) == 0) {
            Log.m105918d("MicroMsg.NewBadgeDecoder", "[alex] peek, dataSource.type is wrong");
            return null;
        } else {
            C21391b d = mo33514d(aVar2);
            if (d != null) {
                String str = d.f60524d.get(aVar.name());
                if (str != null && str.equals(b.f60520e)) {
                    return null;
                }
                if (str == null) {
                    d.f60524d.put(aVar.name(), mo33515e());
                    mo33519i(d);
                }
                return b;
            }
            Log.m105920e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
            return null;
        }
    }

    /* renamed from: h */
    public final void mo33518h(C21390a aVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(aVar.f60518c);
        stringBuffer.append("|");
        stringBuffer.append(aVar.f60519d.replaceAll("\\|", "%7C"));
        stringBuffer.append("|");
        stringBuffer.append(aVar.f60520e.replaceAll("\\|", "%7C"));
        C72994y1.C72995a aVar2 = aVar.f60517b;
        if (aVar2 != null) {
            this.f60515f.mo119677K(aVar2, stringBuffer.toString());
        } else {
            this.f60515f.mo119676J(aVar.f60516a, stringBuffer.toString());
        }
    }

    /* renamed from: i */
    public final void mo33519i(C21391b bVar) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (Map.Entry next : bVar.f60524d.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if (i != 0) {
                stringBuffer.append("|");
            }
            stringBuffer.append(str);
            stringBuffer.append("|");
            stringBuffer.append(str2.replaceAll("\\|", "%7C"));
            i++;
        }
        for (int i2 = 0; i2 < bVar.f60523c.size(); i2++) {
            int keyAt = bVar.f60523c.keyAt(i2);
            String str3 = bVar.f60523c.get(keyAt);
            if (i != 0) {
                stringBuffer.append("|");
            }
            stringBuffer.append(keyAt);
            stringBuffer.append("|");
            stringBuffer.append(str3.replaceAll("\\|", "%7C"));
            i++;
        }
        C72994y1.C72995a aVar = bVar.f60522b;
        if (aVar != null) {
            this.f60515f.mo119677K(aVar, stringBuffer.toString());
        } else {
            this.f60515f.mo119676J(bVar.f60521a, stringBuffer.toString());
        }
    }

    /* renamed from: j */
    public final String mo33520j(String str) {
        return str.replaceAll("%7C", "|");
    }
}
