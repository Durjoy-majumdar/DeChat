package fd3;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fd3.C97867h;
import fd3.C97872k;
import ld3.C61276b;
import te3.C101870ya3;
import te3.C51948xa3;

/* renamed from: fd3.j */
public class C97870j {

    /* renamed from: a */
    public int f287098a;

    /* renamed from: b */
    public int f287099b;

    /* renamed from: c */
    public String f287100c;

    /* renamed from: d */
    public C101870ya3 f287101d = null;

    /* renamed from: e */
    public C97869i f287102e = null;

    /* renamed from: f */
    public boolean f287103f = false;

    /* renamed from: g */
    public int f287104g = 3;

    /* renamed from: h */
    public C61276b f287105h = null;

    /* renamed from: i */
    public C97874l f287106i;

    /* renamed from: fd3.j$a */
    public class C97871a implements C61276b.C61277a {

        /* renamed from: a */
        public final /* synthetic */ C97870j f287107a;

        public C97871a(C97870j jVar) {
            this.f287107a = jVar;
        }

        /* renamed from: a */
        public void mo137198a(boolean z, int i, C51948xa3 xa32) {
            C97867h.C97868a aVar;
            int i2 = i;
            C51948xa3 xa33 = xa32;
            C97870j jVar = C97870j.this;
            boolean z2 = false;
            jVar.f287103f = false;
            if (z) {
                C97874l lVar = jVar.f287106i;
                C97870j jVar2 = this.f287107a;
                C97858a aVar2 = (C97858a) lVar;
                aVar2.f287038v++;
                int i3 = xa33 != null ? xa33.f144571i : 0;
                Log.m105925i("MicroMsg.CGIFileUploader", "upload section success, index = %s, successCount:%s, partIDLimit:%s", Integer.valueOf(jVar2.f287102e.f287095b), Integer.valueOf(aVar2.f287038v), Integer.valueOf(i3));
                aVar2.f287035s.remove(jVar2);
                int i4 = aVar2.f287039w;
                if (i3 <= i4) {
                    i3 = i4;
                }
                aVar2.f287039w = i3;
                int i5 = aVar2.f287037u;
                if (i5 > 0) {
                    C97872k kVar = aVar2.f287032p;
                    float f = (((float) aVar2.f287038v) * 1.0f) / ((float) i5);
                    C97869i iVar = jVar2.f287102e;
                    long j = (long) (iVar.f287096c + iVar.f287097d);
                    C97860d dVar = (C97860d) kVar;
                    dVar.getClass();
                    int i6 = aVar2.f287043d;
                    C97867h hVar = dVar.f287054b;
                    if (i6 == hVar.f287082a && (aVar = hVar.f287084c) != null) {
                        aVar.mo127088c(f, j);
                    }
                }
                if (jVar2.f287102e.f287095b == 0) {
                    if (Util.isNullOrNil(xa33.f144566d)) {
                        Log.m105920e("MicroMsg.CGIFileUploader", "no upload id return!");
                        aVar2.mo137185c();
                        C97872k kVar2 = aVar2.f287032p;
                        if (kVar2 != null) {
                            ((C97860d) kVar2).mo137193f(aVar2, aVar2.f287034r, -30002);
                            return;
                        }
                        return;
                    }
                    aVar2.f287034r = xa33.f144566d;
                    for (C97870j jVar3 : aVar2.f287036t) {
                        jVar3.f287100c = xa33.f144566d;
                    }
                }
                if (aVar2.mo137186d(aVar2.f287038v)) {
                    if (aVar2.f287036t.size() == 1 && aVar2.f287035s.size() == 0) {
                        aVar2.mo137187e();
                    }
                    if (aVar2.f287036t.size() == 0 && aVar2.f287035s.size() == 0) {
                        C97872k.C97873a aVar3 = new C97872k.C97873a();
                        aVar3.f287109a = xa33.f144567e;
                        aVar3.f287110b = xa33.f144568f;
                        aVar3.f287113e = xa33.f144570h;
                        aVar3.f287112d = aVar2.f287041b;
                        aVar2.mo137185c();
                        C97872k kVar3 = aVar2.f287032p;
                        if (kVar3 != null) {
                            C97860d dVar2 = (C97860d) kVar3;
                            Log.m105925i("MicroMsg.CGIParallelUploadMgr", "upload file success, type = %s, path = %s", Integer.valueOf(aVar2.f287043d), aVar2.f287040a);
                            C97867h hVar2 = dVar2.f287054b;
                            hVar2.f287093l += aVar3.f287112d;
                            int i7 = hVar2.f287082a;
                            int i8 = aVar2.f287043d;
                            if (i7 == i8) {
                                aVar3.f287111c = aVar2.f287051l;
                                hVar2.f287091j = Util.nowMilliSecond();
                                C115669n nVar = C115669n.INSTANCE;
                                C97867h hVar3 = dVar2.f287054b;
                                nVar.mo160128e(20470, true, true, true, Integer.valueOf(dVar2.f287054b.f287083b), Long.valueOf(dVar2.f287054b.f287092k), Long.valueOf(hVar3.f287091j - hVar3.f287090i), 0, Long.valueOf(dVar2.f287054b.f287093l));
                                nVar.mo175911u(1431, 1);
                                int i9 = dVar2.f287054b.f287083b;
                                if (i9 == 1) {
                                    nVar.mo175911u(1431, 4);
                                } else if (i9 == 2) {
                                    nVar.mo175911u(1431, 7);
                                } else if (i9 == 3) {
                                    nVar.mo175911u(1431, 10);
                                    if (dVar2.f287054b.f287092k > 26214400) {
                                        nVar.mo175911u(1431, 13);
                                    }
                                }
                                C97867h.C97868a aVar4 = dVar2.f287054b.f287084c;
                                if (aVar4 != null) {
                                    aVar4.mo127087b(aVar3);
                                }
                            } else if (i8 == 2) {
                                dVar2.f287058f = aVar3.f287109a;
                                dVar2.f287059g = aVar3.f287110b;
                                dVar2.mo137194g(i7);
                            } else if (i8 != 3) {
                                dVar2.mo137194g(i7);
                            } else {
                                dVar2.f287056d = aVar3.f287109a;
                                dVar2.f287057e = aVar3.f287110b;
                                if (i7 == 1) {
                                    dVar2.mo137194g(2);
                                } else {
                                    dVar2.mo137194g(i7);
                                }
                            }
                        }
                    }
                }
            } else if (-1 == i2) {
                C97874l lVar2 = jVar.f287106i;
                C97870j jVar4 = this.f287107a;
                if (jVar.f287099b < jVar.f287104g) {
                    z2 = true;
                }
                ((C97858a) lVar2).mo137183a(jVar4, z2, -1);
            } else {
                ((C97858a) jVar.f287106i).mo137183a(this.f287107a, false, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8 A[SYNTHETIC, Splitter:B:31:0x00a8] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137197a() {
        /*
            r12 = this;
            java.lang.String r0 = "close VFSFileInputStream fail"
            boolean r1 = r12.f287103f
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MicroMsg.CgiSectionUploadTask"
            if (r1 == 0) goto L_0x001c
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            fd3.i r1 = r12.f287102e
            r0[r3] = r1
            java.lang.String r1 = r12.f287100c
            r0[r2] = r1
            java.lang.String r1 = "task is running info = %s, uploadId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r1, r0)
            return
        L_0x001c:
            r12.f287103f = r2
            r1 = 0
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0076, all -> 0x0072 }
            fd3.i r5 = r12.f287102e     // Catch:{ Exception -> 0x0076, all -> 0x0072 }
            java.lang.String r5 = r5.f287094a     // Catch:{ Exception -> 0x0076, all -> 0x0072 }
            r2.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x0076, all -> 0x0072 }
            com.tencent.mm.vfs.p1 r5 = new com.tencent.mm.vfs.p1     // Catch:{ Exception -> 0x0076, all -> 0x0072 }
            r5.<init>((com.tencent.p014mm.vfs.C86009m1) r2)     // Catch:{ Exception -> 0x0076, all -> 0x0072 }
            fd3.i r1 = r12.f287102e     // Catch:{ Exception -> 0x0070 }
            int r2 = r1.f287097d     // Catch:{ Exception -> 0x0070 }
            byte[] r10 = new byte[r2]     // Catch:{ Exception -> 0x0070 }
            int r1 = r1.f287096c     // Catch:{ Exception -> 0x0070 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x0070 }
            r5.skip(r1)     // Catch:{ Exception -> 0x0070 }
            fd3.i r1 = r12.f287102e     // Catch:{ Exception -> 0x0070 }
            int r1 = r1.f287097d     // Catch:{ Exception -> 0x0070 }
            int r1 = r5.read(r10, r3, r1)     // Catch:{ Exception -> 0x0070 }
            r2 = -1
            if (r2 != r1) goto L_0x0051
            java.lang.String r1 = "has no more to read"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)     // Catch:{ Exception -> 0x0070 }
            r5.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0050
        L_0x004d:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0050:
            return
        L_0x0051:
            ld3.b r1 = new ld3.b     // Catch:{ Exception -> 0x0070 }
            java.lang.String r7 = r12.f287100c     // Catch:{ Exception -> 0x0070 }
            te3.ya3 r8 = r12.f287101d     // Catch:{ Exception -> 0x0070 }
            fd3.i r2 = r12.f287102e     // Catch:{ Exception -> 0x0070 }
            int r9 = r2.f287095b     // Catch:{ Exception -> 0x0070 }
            fd3.j$a r11 = new fd3.j$a     // Catch:{ Exception -> 0x0070 }
            r11.<init>(r12)     // Catch:{ Exception -> 0x0070 }
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0070 }
            r12.f287105h = r1     // Catch:{ Exception -> 0x0070 }
            ob0.b0 r1 = f40.C86709a0.m107524d()     // Catch:{ Exception -> 0x0070 }
            ld3.b r2 = r12.f287105h     // Catch:{ Exception -> 0x0070 }
            r1.mo123460f(r2)     // Catch:{ Exception -> 0x0070 }
            goto L_0x009d
        L_0x0070:
            r1 = move-exception
            goto L_0x0079
        L_0x0072:
            r2 = move-exception
            r5 = r1
            r1 = r2
            goto L_0x00a6
        L_0x0076:
            r2 = move-exception
            r5 = r1
            r1 = r2
        L_0x0079:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r2.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.String r6 = "parseGlobalConfig: "
            r2.append(r6)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00a5 }
            r2.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)     // Catch:{ all -> 0x00a5 }
            fd3.l r1 = r12.f287106i     // Catch:{ all -> 0x00a5 }
            r2 = -9999(0xffffffffffffd8f1, float:NaN)
            fd3.a r1 = (fd3.C97858a) r1     // Catch:{ all -> 0x00a5 }
            r1.mo137183a(r12, r3, r2)     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x00a4
        L_0x009d:
            r5.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a4
        L_0x00a1:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x00a4:
            return
        L_0x00a5:
            r1 = move-exception
        L_0x00a6:
            if (r5 == 0) goto L_0x00af
            r5.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00af
        L_0x00ac:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x00af:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fd3.C97870j.mo137197a():void");
    }
}
