package u30;

import android.database.Cursor;
import com.tencent.xweb.file.XVFSFile;
import e40.C86423a;
import e40.C86424b;
import f40.C86709a0;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C38682v2;
import qh3.C89661b;
import qh3.C89664c;
import qh3.C89667e;
import w30.C90892a;
import zt3.C119157j;

/* renamed from: u30.a */
public class C90601a implements C89661b.C89662a<Boolean>, Runnable {

    /* renamed from: d */
    public static C90601a f260320d = new C90601a();

    /* renamed from: e */
    public static final C89661b.C89663b<Boolean> f260321e;

    /* renamed from: u30.a$a */
    public class C90602a extends C90892a.C90893a {

        /* renamed from: a */
        public final /* synthetic */ Cursor f260322a;

        /* renamed from: b */
        public final /* synthetic */ List f260323b;

        /* renamed from: c */
        public final /* synthetic */ Map f260324c;

        public C90602a(Cursor cursor, List list, Map map) {
            this.f260322a = cursor;
            this.f260323b = list;
            this.f260324c = map;
        }

        /* renamed from: a */
        public C90892a.C90893a.C90894a mo124754a(Map<String, Integer> map) {
            if (!this.f260322a.moveToNext()) {
                return null;
            }
            C38682v2 v2Var = new C38682v2();
            v2Var.convertFrom(this.f260322a);
            C90601a.this.getClass();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            try {
                JSONObject jSONObject = new JSONObject(new String(C86424b.m107090a(v2Var.field_feature_str.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.ISO_8859_1));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            sb.append(map.get(next + ":arr:" + i));
                            sb.append(XVFSFile.PATH_SEPARATOR);
                            sb.append(jSONArray.get(i));
                            sb.append(" ");
                        }
                    } else {
                        if (obj instanceof String) {
                            obj = Float.valueOf(C86423a.m107089a((String) obj));
                        }
                        sb.append(map.get(next));
                        sb.append(XVFSFile.PATH_SEPARATOR);
                        sb.append(obj);
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            } catch (JSONException unused) {
            }
            String sb4 = sb.toString();
            C90892a.C90893a.C90894a aVar = new C90892a.C90893a.C90894a();
            aVar.f260873a = sb4;
            aVar.f260875c = v2Var.field_label;
            C90601a.this.getClass();
            if (Math.random() >= 0.2d) {
                z = true;
            }
            aVar.f260874b = z;
            if (z) {
                this.f260323b.add(v2Var.field_sample_uid);
            }
            return aVar;
        }
    }

    static {
        Class<Boolean> cls = Boolean.class;
        f260321e = new C89664c(C86709a0.m107534r().mo123993a(0, cls), new C89667e(C86709a0.m107534r().mo123993a(1, cls)));
    }

    /* renamed from: a */
    public void mo123994a(C89661b.C89663b bVar, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C119157j jVar = (C119157j) C119157j.f356862d;
            jVar.getClass();
            jVar.mo183886q(this, 1800000, "FewShotBooster");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183894y("FewShotBooster");
    }

    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016c  */
    public void run() {
        /*
            r16 = this;
            java.lang.String r0 = v30.C90748b.f260643b
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Kara.FewShotBooster"
            java.lang.String r1 = "env not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x0010:
            boolean r0 = j30.C76385a.m91810b()
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "Kara.FewShotBooster"
            java.lang.String r1 = "few shot close"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x001e:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r1 = "TAG_TRAIN_TIME"
            r2 = 0
            long r1 = r0.getLong(r1, r2)
            long r3 = java.lang.System.currentTimeMillis()
            long r1 = r3 - r1
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0040
            java.lang.String r0 = "Kara.FewShotBooster"
            java.lang.String r1 = "sorry, it's not time"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x0040:
            boolean r1 = u30.C90603b.f260326a
            r2 = 1
            if (r1 != 0) goto L_0x004a
            u30.C90603b.f260326a = r2
            v30.C90748b.m113818a()
        L_0x004a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r5 = "MomentVideo"
            r1.add(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0058:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x025a
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            m30.a r6 = m30.C88691b.f256043b
            if (r6 != 0) goto L_0x006b
            m30.C88691b.m110635a()
        L_0x006b:
            m30.a r6 = m30.C88691b.f256043b
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r6.f92768d
            java.lang.String r8 = "FewShotLearning"
            java.lang.String r9 = "UPDATE FewShotLearning SET tag=0 WHERE tag=1"
            r7.execSQL(r8, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "select * from FewShotLearning where model='"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = "'"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r6.f92768d
            r9 = 0
            java.lang.String[] r10 = new java.lang.String[r9]
            android.database.Cursor r7 = r8.rawQuery(r7, r10)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r10 = 0
            if (r7 == 0) goto L_0x012e
            boolean r11 = r7.moveToFirst()
            if (r11 != 0) goto L_0x00a6
            goto L_0x012e
        L_0x00a6:
            boolean r11 = r7.moveToNext()
            if (r11 != 0) goto L_0x00ae
            goto L_0x012e
        L_0x00ae:
            xh.v2 r11 = new xh.v2
            r11.<init>()
            r11.convertFrom(r7)
            r7.moveToPrevious()
            java.lang.String r12 = r11.field_feature_str
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x00c2
            goto L_0x012e
        L_0x00c2:
            java.lang.String r10 = r11.field_feature_str
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.ISO_8859_1
            byte[] r10 = r10.getBytes(r11)
            byte[] r10 = e40.C86424b.m107090a(r10)
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.ISO_8859_1
            r11.<init>(r10, r12)
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x012c }
            r10.<init>(r11)     // Catch:{ JSONException -> 0x012c }
            java.util.Iterator r11 = r10.keys()     // Catch:{ JSONException -> 0x012c }
            r12 = 0
        L_0x00df:
            boolean r13 = r11.hasNext()     // Catch:{ JSONException -> 0x012c }
            if (r13 == 0) goto L_0x012f
            java.lang.Object r13 = r11.next()     // Catch:{ JSONException -> 0x012c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x012c }
            java.lang.Object r14 = r10.get(r13)     // Catch:{ JSONException -> 0x012c }
            boolean r15 = r14 instanceof org.json.JSONArray     // Catch:{ JSONException -> 0x012c }
            if (r15 == 0) goto L_0x011f
            org.json.JSONArray r14 = (org.json.JSONArray) r14     // Catch:{ JSONException -> 0x012c }
            int r14 = r14.length()     // Catch:{ JSONException -> 0x012c }
            r15 = 0
        L_0x00fa:
            if (r15 >= r14) goto L_0x00df
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x012c }
            r9.<init>()     // Catch:{ JSONException -> 0x012c }
            r9.append(r13)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r2 = ":arr:"
            r9.append(r2)     // Catch:{ JSONException -> 0x012c }
            r9.append(r15)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r2 = r9.toString()     // Catch:{ JSONException -> 0x012c }
            int r9 = r12 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x012c }
            r8.put(r2, r12)     // Catch:{ JSONException -> 0x012c }
            int r15 = r15 + 1
            r12 = r9
            r2 = 1
            r9 = 0
            goto L_0x00fa
        L_0x011f:
            int r2 = r12 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x012c }
            r8.put(r13, r9)     // Catch:{ JSONException -> 0x012c }
            r12 = r2
            r2 = 1
            r9 = 0
            goto L_0x00df
        L_0x012c:
            goto L_0x012f
        L_0x012e:
            r8 = r10
        L_0x012f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            w30.b r10 = new w30.b
            r10.<init>(r9)
            u30.a$a r9 = new u30.a$a
            r11 = r16
            r9.<init>(r7, r2, r8)
            r10.f260872a = r9
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = y30.C91374g.f262062c
            r9.append(r12)
            java.lang.String r13 = "/"
            r9.append(r13)
            r9.append(r5)
            java.lang.String r13 = ".json"
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            r8.<init>((java.lang.String) r9)
            boolean r9 = r8.mo119967g()
            if (r9 == 0) goto L_0x016f
            r8.mo119966f()
        L_0x016f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            java.lang.String r9 = "/"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = ".json"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.Class<w30.b> r8 = w30.C90895b.class
            monitor-enter(r8)
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x01a4 }
            java.lang.String r12 = r10.f260876b     // Catch:{ all -> 0x01a4 }
            r9.<init>(r12)     // Catch:{ all -> 0x01a4 }
            java.io.File[] r9 = r9.listFiles()     // Catch:{ all -> 0x01a4 }
            if (r9 == 0) goto L_0x01a7
            r12 = 0
        L_0x0199:
            int r13 = r9.length     // Catch:{ all -> 0x01a4 }
            if (r12 >= r13) goto L_0x01a7
            r13 = r9[r12]     // Catch:{ all -> 0x01a4 }
            r13.delete()     // Catch:{ all -> 0x01a4 }
            int r12 = r12 + 1
            goto L_0x0199
        L_0x01a4:
            r0 = move-exception
            goto L_0x0258
        L_0x01a7:
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x01a4 }
            r12 = 4
            if (r9 == 0) goto L_0x01b1
            monitor-exit(r8)     // Catch:{ all -> 0x01a4 }
            r9 = 0
            goto L_0x01df
        L_0x01b1:
            boolean r9 = r10.mo124989a()     // Catch:{ all -> 0x01a4 }
            if (r9 == 0) goto L_0x01c3
            boolean r5 = r10.mo124990b(r5)     // Catch:{ all -> 0x01a4 }
            if (r5 == 0) goto L_0x01c0
            r5 = 9
            goto L_0x01c4
        L_0x01c0:
            r5 = 10
            goto L_0x01c4
        L_0x01c3:
            r5 = 4
        L_0x01c4:
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x01a4 }
            java.lang.String r10 = r10.f260876b     // Catch:{ all -> 0x01a4 }
            r9.<init>(r10)     // Catch:{ all -> 0x01a4 }
            java.io.File[] r9 = r9.listFiles()     // Catch:{ all -> 0x01a4 }
            if (r9 == 0) goto L_0x01dd
            r10 = 0
        L_0x01d2:
            int r13 = r9.length     // Catch:{ all -> 0x01a4 }
            if (r10 >= r13) goto L_0x01dd
            r13 = r9[r10]     // Catch:{ all -> 0x01a4 }
            r13.delete()     // Catch:{ all -> 0x01a4 }
            int r10 = r10 + 1
            goto L_0x01d2
        L_0x01dd:
            monitor-exit(r8)     // Catch:{ all -> 0x01a4 }
            r9 = r5
        L_0x01df:
            r5 = r9 & 4
            if (r12 != r5) goto L_0x01e9
            r12 = 101(0x65, double:5.0E-322)
            d40.C86172c.m106685a(r12)
            goto L_0x01f4
        L_0x01e9:
            r5 = r9 & 8
            r8 = 8
            if (r8 != r5) goto L_0x01f4
            r12 = 100
            d40.C86172c.m106685a(r12)
        L_0x01f4:
            r5 = r9 & 1
            r8 = 1
            if (r8 != r5) goto L_0x0242
            r8 = 102(0x66, double:5.04E-322)
            d40.C86172c.m106685a(r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x0202:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0240
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "UPDATE FewShotLearning SET tag="
            r8.append(r9)
            r10 = 1
            r8.append(r10)
            java.lang.String r9 = " WHERE "
            r8.append(r9)
            java.lang.String r9 = "sample_uid"
            r8.append(r9)
            java.lang.String r9 = "='"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = "'"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r6.f92768d
            java.lang.String r9 = "FewShotLearning"
            r8.execSQL(r9, r5)
            goto L_0x0202
        L_0x0240:
            r10 = 1
            goto L_0x024d
        L_0x0242:
            r10 = 1
            r2 = r9 & 2
            r5 = 2
            if (r5 != r2) goto L_0x024d
            r5 = 103(0x67, double:5.1E-322)
            d40.C86172c.m106685a(r5)
        L_0x024d:
            r7.close()
            java.lang.String r2 = "TAG_TRAIN_TIME"
            r0.putLong(r2, r3)
            r2 = 1
            goto L_0x0058
        L_0x0258:
            monitor-exit(r8)     // Catch:{ all -> 0x01a4 }
            throw r0
        L_0x025a:
            r11 = r16
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u30.C90601a.run():void");
    }
}
