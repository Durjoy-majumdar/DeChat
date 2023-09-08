package ps2;

import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.modelimage.C92856r0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jp3.C9487b;
import lo2.C99569s;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import os2.C35286b;
import os2.C35288c;
import os2.C35290e;
import os2.C35298u0;
import os2.C35300v0;
import te3.C49898iu1;
import te3.C50038ju1;
import te3.C50494n42;
import te3.C50635o42;
import xb0.C102609h;
import zt3.C119157j;

/* renamed from: ps2.d0 */
public class C35631d0 {

    /* renamed from: f */
    public static final C35631d0 f95242f = new C35631d0();

    /* renamed from: a */
    public C35290e f95243a;

    /* renamed from: b */
    public C35288c f95244b;

    /* renamed from: c */
    public Map<String, String> f95245c;

    /* renamed from: d */
    public C35300v0 f95246d;

    /* renamed from: e */
    public Map<String, String> f95247e;

    /* renamed from: ps2.d0$a */
    public class C35632a implements Runnable {
        public C35632a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00fc A[SYNTHETIC, Splitter:B:28:0x00fc] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0194  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0199 A[SYNTHETIC, Splitter:B:47:0x0199] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                java.lang.String r1 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                r3 = r18
                ps2.d0 r4 = ps2.C35631d0.this
                java.lang.String r5 = "access$000"
                java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                r4.getClass()
                java.lang.String r7 = "clearOld"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
                java.lang.String r8 = "OpenCanvasMgr"
                java.lang.String r0 = "clearing old canvasInfo cache"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                java.lang.String r9 = "clearAdOldCanvasCache"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r6)
                r10 = 259200000(0xf731400, double:1.280618154E-315)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00c9 }
                r0.<init>()     // Catch:{ all -> 0x00c9 }
                os2.c r13 = r4.f95244b     // Catch:{ all -> 0x00c9 }
                android.database.Cursor r13 = r13.getAll()     // Catch:{ all -> 0x00c9 }
                if (r13 != 0) goto L_0x0041
                java.lang.String r0 = "clearAdOldCanvasCache, cursor null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ all -> 0x00c9 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r6)
                goto L_0x00e5
            L_0x0041:
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c9 }
                long r14 = r14 - r10
                r10 = 0
            L_0x0047:
                boolean r11 = r13.moveToNext()     // Catch:{ all -> 0x00c9 }
                if (r11 == 0) goto L_0x008a
                int r10 = r10 + 1
                os2.b r11 = new os2.b     // Catch:{ all -> 0x00c9 }
                r11.<init>()     // Catch:{ all -> 0x00c9 }
                r11.convertFrom(r13)     // Catch:{ all -> 0x00c9 }
                r16 = r13
                long r12 = r11.field_createTime     // Catch:{ all -> 0x00c9 }
                int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r17 >= 0) goto L_0x0064
                r0.add(r11)     // Catch:{ all -> 0x00c9 }
                r12 = 1
                goto L_0x0065
            L_0x0064:
                r12 = 0
            L_0x0065:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
                r13.<init>()     // Catch:{ all -> 0x00c9 }
                java.lang.String r3 = "canvas item:"
                r13.append(r3)     // Catch:{ all -> 0x00c9 }
                java.lang.String r3 = r4.mo60344g(r11)     // Catch:{ all -> 0x00c9 }
                r13.append(r3)     // Catch:{ all -> 0x00c9 }
                java.lang.String r3 = ", del="
                r13.append(r3)     // Catch:{ all -> 0x00c9 }
                r13.append(r12)     // Catch:{ all -> 0x00c9 }
                java.lang.String r3 = r13.toString()     // Catch:{ all -> 0x00c9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)     // Catch:{ all -> 0x00c9 }
                r3 = r18
                r13 = r16
                goto L_0x0047
            L_0x008a:
                r16 = r13
                r16.close()     // Catch:{ all -> 0x00c9 }
                java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00c9 }
            L_0x0093:
                boolean r11 = r3.hasNext()     // Catch:{ all -> 0x00c9 }
                if (r11 == 0) goto L_0x00a8
                java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x00c9 }
                os2.b r11 = (os2.C35286b) r11     // Catch:{ all -> 0x00c9 }
                os2.c r12 = r4.f95244b     // Catch:{ all -> 0x00c9 }
                r13 = 0
                java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ all -> 0x00c9 }
                r12.delete(r11, r14)     // Catch:{ all -> 0x00c9 }
                goto L_0x0093
            L_0x00a8:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
                r3.<init>()     // Catch:{ all -> 0x00c9 }
                java.lang.String r11 = "clearAdOldCanvasCache, delCount="
                r3.append(r11)     // Catch:{ all -> 0x00c9 }
                int r0 = r0.size()     // Catch:{ all -> 0x00c9 }
                r3.append(r0)     // Catch:{ all -> 0x00c9 }
                java.lang.String r0 = ", total="
                r3.append(r0)     // Catch:{ all -> 0x00c9 }
                r3.append(r10)     // Catch:{ all -> 0x00c9 }
                java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00c9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ all -> 0x00c9 }
                goto L_0x00e2
            L_0x00c9:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r10 = "clearAdOldCanvasCache, exp="
                r3.append(r10)
                java.lang.String r0 = r0.toString()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            L_0x00e2:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r6)
            L_0x00e5:
                java.lang.String r3 = "clearAdOldCanvas"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0166 }
                r0.<init>()     // Catch:{ all -> 0x0166 }
                os2.e r9 = r4.f95243a     // Catch:{ all -> 0x0166 }
                android.database.Cursor r9 = r9.getAll()     // Catch:{ all -> 0x0166 }
                if (r9 != 0) goto L_0x00fc
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
                goto L_0x0182
            L_0x00fc:
                long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0166 }
                r12 = 259200000(0xf731400, double:1.280618154E-315)
                long r10 = r10 - r12
            L_0x0104:
                boolean r12 = r9.moveToNext()     // Catch:{ all -> 0x0166 }
                if (r12 == 0) goto L_0x0132
                os2.d r12 = new os2.d     // Catch:{ all -> 0x0166 }
                r12.<init>()     // Catch:{ all -> 0x0166 }
                r12.convertFrom(r9)     // Catch:{ all -> 0x0166 }
                long r13 = r12.field_createTime     // Catch:{ all -> 0x0166 }
                int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r15 >= 0) goto L_0x0104
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
                r13.<init>()     // Catch:{ all -> 0x0166 }
                java.lang.String r14 = "ad canvas eliminate %d "
                r13.append(r14)     // Catch:{ all -> 0x0166 }
                long r14 = r12.field_canvasId     // Catch:{ all -> 0x0166 }
                r13.append(r14)     // Catch:{ all -> 0x0166 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0166 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r13)     // Catch:{ all -> 0x0166 }
                r0.add(r12)     // Catch:{ all -> 0x0166 }
                goto L_0x0104
            L_0x0132:
                r9.close()     // Catch:{ all -> 0x0166 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
                r9.<init>()     // Catch:{ all -> 0x0166 }
                java.lang.String r10 = "clearAdOldCanvas, delCount="
                r9.append(r10)     // Catch:{ all -> 0x0166 }
                int r10 = r0.size()     // Catch:{ all -> 0x0166 }
                r9.append(r10)     // Catch:{ all -> 0x0166 }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0166 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x0166 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0166 }
            L_0x0151:
                boolean r9 = r0.hasNext()     // Catch:{ all -> 0x0166 }
                if (r9 == 0) goto L_0x017f
                java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x0166 }
                os2.d r9 = (os2.C35289d) r9     // Catch:{ all -> 0x0166 }
                os2.e r10 = r4.f95243a     // Catch:{ all -> 0x0166 }
                r11 = 0
                java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ all -> 0x0166 }
                r10.delete(r9, r12)     // Catch:{ all -> 0x0166 }
                goto L_0x0151
            L_0x0166:
                r0 = move-exception
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "clearAdOldCanvas, exp="
                r9.append(r10)
                java.lang.String r0 = r0.toString()
                r9.append(r0)
                java.lang.String r0 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            L_0x017f:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            L_0x0182:
                java.lang.String r3 = "clearUxOldCanvas"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0204 }
                r0.<init>()     // Catch:{ all -> 0x0204 }
                os2.v0 r9 = r4.f95246d     // Catch:{ all -> 0x0204 }
                android.database.Cursor r9 = r9.getAll()     // Catch:{ all -> 0x0204 }
                if (r9 != 0) goto L_0x0199
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
                goto L_0x0220
            L_0x0199:
                long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0204 }
                r12 = 777600000(0x2e593c00, double:3.84185446E-315)
                long r10 = r10 - r12
            L_0x01a1:
                boolean r12 = r9.moveToNext()     // Catch:{ all -> 0x0204 }
                if (r12 == 0) goto L_0x01d0
                os2.u0 r12 = new os2.u0     // Catch:{ all -> 0x0204 }
                r12.<init>()     // Catch:{ all -> 0x0204 }
                r12.convertFrom(r9)     // Catch:{ all -> 0x0204 }
                long r13 = r12.field_createTime     // Catch:{ all -> 0x0204 }
                int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r15 >= 0) goto L_0x01a1
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0204 }
                r13.<init>()     // Catch:{ all -> 0x0204 }
                java.lang.String r14 = "ux canvas eliminate %d "
                r13.append(r14)     // Catch:{ all -> 0x0204 }
                java.lang.String r14 = r12.field_canvasId     // Catch:{ all -> 0x0204 }
                r13.append(r14)     // Catch:{ all -> 0x0204 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0204 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r13)     // Catch:{ all -> 0x0204 }
                r0.add(r12)     // Catch:{ all -> 0x0204 }
                goto L_0x01a1
            L_0x01d0:
                r9.close()     // Catch:{ all -> 0x0204 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0204 }
                r9.<init>()     // Catch:{ all -> 0x0204 }
                java.lang.String r10 = "clearUxOldCanvas, delCount="
                r9.append(r10)     // Catch:{ all -> 0x0204 }
                int r10 = r0.size()     // Catch:{ all -> 0x0204 }
                r9.append(r10)     // Catch:{ all -> 0x0204 }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0204 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x0204 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0204 }
            L_0x01ef:
                boolean r9 = r0.hasNext()     // Catch:{ all -> 0x0204 }
                if (r9 == 0) goto L_0x021d
                java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x0204 }
                os2.u0 r9 = (os2.C35298u0) r9     // Catch:{ all -> 0x0204 }
                os2.v0 r10 = r4.f95246d     // Catch:{ all -> 0x0204 }
                r11 = 0
                java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ all -> 0x0204 }
                r10.delete(r9, r12)     // Catch:{ all -> 0x0204 }
                goto L_0x01ef
            L_0x0204:
                r0 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "clearUxOldCanvas, exp="
                r4.append(r9)
                java.lang.String r0 = r0.toString()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            L_0x021d:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            L_0x0220:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ps2.C35631d0.C35632a.run():void");
        }
    }

    /* renamed from: ps2.d0$b */
    public class C35633b implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ long f95249d;

        /* renamed from: e */
        public final /* synthetic */ C35635d f95250e;

        /* renamed from: f */
        public final /* synthetic */ int f95251f;

        /* renamed from: g */
        public final /* synthetic */ String f95252g;

        /* renamed from: h */
        public final /* synthetic */ String f95253h;

        /* renamed from: i */
        public final /* synthetic */ C12004a f95254i;

        /* renamed from: j */
        public final /* synthetic */ int f95255j;

        /* renamed from: n */
        public final /* synthetic */ int f95256n;

        public C35633b(long j, C35635d dVar, int i, String str, String str2, C12004a aVar, int i2, int i3) {
            this.f95249d = j;
            this.f95250e = dVar;
            this.f95251f = i;
            this.f95252g = str;
            this.f95253h = str2;
            this.f95254i = aVar;
            this.f95255j = i2;
            this.f95256n = i3;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            String str2;
            String str3;
            int i3 = i;
            int i4 = i2;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$2");
            Log.m105924i("OpenCanvasMgr", "callback, errType=" + i3 + ", errCode=" + i4 + ", errMsg=" + str + ", pageId=" + this.f95249d);
            if (i3 == 0 && i4 == 0) {
                C50038ju1 ju12 = (C50038ju1) cVar.f127056b.f127083a;
                C35635d dVar = this.f95250e;
                if (dVar != null) {
                    dVar.mo60346a(true, ju12.f136339d);
                }
                if (!TextUtils.isEmpty(ju12.f136339d)) {
                    C35631d0 b = C35631d0.m40782b();
                    long j = this.f95249d;
                    int i5 = this.f95251f;
                    String str4 = this.f95252g;
                    String str5 = this.f95253h;
                    String str6 = ju12.f136339d;
                    C12004a aVar = this.f95254i;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
                    b.getClass();
                    String str7 = "";
                    SnsMethodCalculate.markStartTimeMs("addAdCanvasCache", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
                    str3 = "callback";
                    String str8 = str6;
                    C12004a aVar2 = aVar;
                    String str9 = str5;
                    String str10 = str4;
                    C50038ju1 ju13 = ju12;
                    long j2 = j;
                    str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$2";
                    int i6 = i5;
                    try {
                        String a = C35631d0.m40781a(j, str4, i5, str9, aVar2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("addAdCanvasCache, pageId=");
                        sb.append(j2);
                        sb.append(", source=");
                        sb.append(i6);
                        sb.append(", canvasDynamicInfo=");
                        String str11 = str9;
                        sb.append(str11);
                        sb.append(", xml.len=");
                        sb.append(str8 == null ? 0 : str8.length());
                        sb.append(", uxInfo=");
                        sb.append(str10);
                        sb.append(", adCanvasParams = ");
                        sb.append(aVar2 == null ? str7 : aVar2.toString());
                        Log.m105924i("OpenCanvasMgr", sb.toString());
                        if (j2 > 0 && !TextUtils.isEmpty(a) && !TextUtils.isEmpty(str8)) {
                            ((ConcurrentHashMap) b.f95245c).put(a, str8);
                            C35286b bVar = new C35286b();
                            bVar.field_cacheKey = a;
                            bVar.field_canvasId = j2;
                            bVar.field_canvasXml = str8;
                            bVar.field_source = i6;
                            bVar.field_uxInfo = str10;
                            bVar.field_dynamicInfo = str11;
                            C35288c cVar2 = b.f95244b;
                            cVar2.getClass();
                            SnsMethodCalculate.markStartTimeMs("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.AdCanvasCacheInfoStorage");
                            bVar.field_createTime = System.currentTimeMillis();
                            if (!cVar2.insert(bVar)) {
                                cVar2.update(bVar, new String[0]);
                            }
                            SnsMethodCalculate.markEndTimeMs("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.AdCanvasCacheInfoStorage");
                        }
                    } catch (Throwable th) {
                        Log.m105920e("OpenCanvasMgr", "addAdCanvasCache, exp=" + th.toString());
                    }
                    SnsMethodCalculate.markEndTimeMs("addAdCanvasCache", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
                    if (this.f95255j == 1 && this.f95256n == 1) {
                        String str12 = ju13.f136339d;
                        SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPagesForJsapiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                        if (Util.isNullOrNil(str12)) {
                            SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForJsapiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                        } else {
                            ((C119157j) C119157j.f356862d).mo183875f(new C100902y(str12));
                            SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForJsapiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                        }
                    }
                } else {
                    str3 = "callback";
                    str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$2";
                    Log.m105920e("OpenCanvasMgr", "requestAdCanvasXmlFromNet, rsp xml empty, pageId=" + this.f95249d);
                }
                SnsMethodCalculate.markEndTimeMs(str3, str2);
                return 0;
            }
            String str13 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$2";
            String str14 = "";
            C35635d dVar2 = this.f95250e;
            if (dVar2 != null) {
                dVar2.mo60346a(false, str14);
            }
            SnsMethodCalculate.markEndTimeMs("callback", str13);
            return 0;
        }
    }

    /* renamed from: ps2.d0$c */
    public class C35634c implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ String f95257d;

        /* renamed from: e */
        public final /* synthetic */ int f95258e;

        /* renamed from: f */
        public final /* synthetic */ C35635d f95259f;

        /* renamed from: g */
        public final /* synthetic */ String f95260g;

        public C35634c(String str, int i, C35635d dVar, String str2) {
            this.f95257d = str;
            this.f95258e = i;
            this.f95259f = dVar;
            this.f95260g = str2;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            String str2;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$3");
            if (i == 0 && i2 == 0) {
                String h = ((C50635o42) cVar.f127056b.f127083a).f138955d.mo123705h();
                Log.m105925i("OpenCanvasMgr", "getCanvasInfo pageid %s ,xml %s", this.f95257d, h);
                C35635d dVar = this.f95259f;
                if (dVar != null) {
                    dVar.mo60346a(true, h);
                }
                if (!TextUtils.isEmpty(h)) {
                    C35631d0 b = C35631d0.m40782b();
                    String str3 = this.f95257d;
                    String str4 = this.f95260g;
                    b.getClass();
                    SnsMethodCalculate.markStartTimeMs("addUxCache", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
                    if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(str3)) {
                        if (!Util.isNullOrNil(str4)) {
                            str2 = str3 + str4;
                        } else {
                            str2 = str3;
                        }
                        ((HashMap) b.f95247e).put(str2, h);
                        C35298u0 u0Var = new C35298u0();
                        u0Var.field_canvasId = str3;
                        u0Var.field_canvasXml = h;
                        u0Var.field_canvasExt = str4;
                        C35300v0 v0Var = b.f95246d;
                        v0Var.getClass();
                        SnsMethodCalculate.markStartTimeMs("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.UxCanvasInfoStorage");
                        if (Util.isNullOrNil(u0Var.field_canvasXml)) {
                            SnsMethodCalculate.markEndTimeMs("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.UxCanvasInfoStorage");
                        } else {
                            u0Var.field_createTime = System.currentTimeMillis();
                            if (!v0Var.insert(u0Var)) {
                                v0Var.update(u0Var, new String[0]);
                            }
                            SnsMethodCalculate.markEndTimeMs("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.UxCanvasInfoStorage");
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("addUxCache", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$3");
                return 0;
            }
            Log.m105921e("OpenCanvasMgr", "cgi fail pageid %s,preLoad %d, errType %d,errCode %d", this.f95257d, Integer.valueOf(this.f95258e), Integer.valueOf(i), Integer.valueOf(i2));
            C35635d dVar2 = this.f95259f;
            if (dVar2 != null) {
                dVar2.mo60346a(false, "");
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$3");
            return 0;
        }
    }

    /* renamed from: ps2.d0$d */
    public interface C35635d {
        /* renamed from: a */
        int mo60346a(boolean z, String str);
    }

    public C35631d0() {
        int i = C94866e1.f274866V;
        SnsMethodCalculate.markStartTimeMs("getCanvasInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (C94866e1.Ax0().f274902p == null) {
            C94866e1.Ax0().f274902p = new C35290e(C94866e1.Bx0());
        }
        C35290e eVar = C94866e1.Ax0().f274902p;
        SnsMethodCalculate.markEndTimeMs("getCanvasInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        this.f95243a = eVar;
        SnsMethodCalculate.markStartTimeMs("getAdCanvasCacheInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (C94866e1.Ax0().f274904r == null) {
            C94866e1.Ax0().f274904r = new C35288c(C94866e1.Bx0());
        }
        C35288c cVar = C94866e1.Ax0().f274904r;
        SnsMethodCalculate.markEndTimeMs("getAdCanvasCacheInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        this.f95244b = cVar;
        this.f95245c = new ConcurrentHashMap();
        SnsMethodCalculate.markStartTimeMs("getUxCanvasInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (C94866e1.Ax0().f274903q == null) {
            C94866e1.Ax0().f274903q = new C35300v0(C94866e1.Bx0());
        }
        C35300v0 v0Var = C94866e1.Ax0().f274903q;
        SnsMethodCalculate.markEndTimeMs("getUxCanvasInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        this.f95246d = v0Var;
        this.f95247e = new HashMap();
        new MMHandler("OpenCanvasMgr").postDelayed(new C35632a(), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }

    /* renamed from: a */
    public static final String m40781a(long j, String str, int i, String str2, C12004a aVar) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("getAdCanvasCacheKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        String str3 = j + Util.nullAsNil(str) + Util.nullAsNil(str2);
        boolean z2 = false;
        if (aVar == null || !aVar.f35001d) {
            z2 = C102609h.m135510UY(6);
            z = C92856r0.m117121g();
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getAdCanvasCacheKey, supportH265 is ");
        sb.append(z2 ? 1 : 0);
        sb.append(", supportWebP is ");
        sb.append(z ? 1 : 0);
        sb.append(", adCanvasParams is ");
        sb.append(aVar == null ? "" : aVar.toString());
        Log.m105924i("OpenCanvasMgr", sb.toString());
        String mD5String = MD5Util.getMD5String((str3 + z2) + z);
        SnsMethodCalculate.markEndTimeMs("getAdCanvasCacheKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        return mD5String;
    }

    /* renamed from: b */
    public static C35631d0 m40782b() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        C35631d0 d0Var = f95242f;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        return d0Var;
    }

    /* renamed from: e */
    public static void m40783e(long j, int i, int i2, int i3, String str, String str2, C12004a aVar, C35635d dVar, C9487b bVar) {
        String str3;
        String str4;
        String str5;
        long j2 = j;
        int i4 = i3;
        String str6 = str;
        String str7 = str2;
        C12004a aVar2 = aVar;
        SnsMethodCalculate.markStartTimeMs("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        try {
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            bVar2.f127066a = new C49898iu1();
            bVar2.f127067b = new C50038ju1();
            bVar2.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/get_adcanvasinfo";
            bVar2.f127069d = 1286;
            C47350c a = bVar2.mo72403a();
            C49898iu1 iu12 = (C49898iu1) a.f127055a.f127080a;
            iu12.f135671d = j2;
            iu12.f135672e = str6;
            iu12.f135673f = i4;
            iu12.f135674g = str7;
            if (C99569s.m129964f()) {
                iu12.f135675h = 0;
                iu12.f135676i = 0;
                if (aVar2 == null || !aVar2.f35001d) {
                    int i5 = 1;
                    iu12.f135675h = C102609h.m135510UY(6) ? 1 : 0;
                    if (!C92856r0.m117121g()) {
                        i5 = 0;
                    }
                    iu12.f135676i = i5;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("requestAdCanvasXmlFromNet, pageId=");
            sb.append(j2);
            sb.append(", preload=");
            sb.append(i);
            sb.append(", source=");
            sb.append(i4);
            sb.append(", canvasDynamicInfo=");
            sb.append(str7);
            sb.append(", uxInfo=");
            sb.append(str6);
            sb.append(", supportH265 = ");
            sb.append(iu12.f135675h);
            sb.append(", supportWebP = ");
            sb.append(iu12.f135676i);
            sb.append(", adCanvasParams = ");
            sb.append(aVar2 == null ? "" : aVar.toString());
            Log.m105924i("OpenCanvasMgr", sb.toString());
            C35633b bVar3 = r1;
            str4 = "requestAdCanvasXmlFromNet";
            str5 = "OpenCanvasMgr";
            C47350c cVar = a;
            str3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr";
            try {
                C35633b bVar4 = new C35633b(j, dVar, i3, str, str2, aVar, i, i2);
                C89144l0.m111430f(cVar, bVar3, false, bVar);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            str3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr";
            str5 = "OpenCanvasMgr";
            str4 = "requestAdCanvasXmlFromNet";
            Log.m105920e(str5, "requestAdCanvasXmlFromNet, pageId=" + j2 + ", exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs(str4, str3);
        }
        SnsMethodCalculate.markEndTimeMs(str4, str3);
    }

    /* renamed from: f */
    public static void m40784f(String str, String str2, int i, C35635d dVar, C9487b bVar) {
        SnsMethodCalculate.markStartTimeMs("requestUxCanvasXmlFromNet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C50494n42();
        bVar2.f127067b = new C50635o42();
        bVar2.f127068c = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_getofficialcanvasinfo";
        bVar2.f127069d = 1890;
        C47350c a = bVar2.mo72403a();
        C50494n42 n422 = (C50494n42) a.f127055a.f127080a;
        n422.f138405d = str;
        n422.f138406e = str2;
        C89144l0.m111430f(a, new C35634c(str, i, dVar, str2), false, bVar);
        SnsMethodCalculate.markEndTimeMs("requestUxCanvasXmlFromNet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x014e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo60342c(long r19, int r21, int r22, int r23, int r24, java.lang.String r25, java.lang.String r26, ps2.C12004a r27) {
        /*
            r18 = this;
            r1 = r18
            r8 = r19
            r10 = r21
            r0 = r23
            r11 = r24
            java.lang.String r12 = "openForAd"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "openForAd, pageId="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ", preload="
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = ", preloadInnerRes="
            r2.append(r3)
            r14 = r22
            r2.append(r14)
            java.lang.String r3 = ", noStore="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r15 = ", source="
            r2.append(r15)
            r2.append(r11)
            java.lang.String r3 = ", canvasDynamicInfo="
            r2.append(r3)
            r7 = r26
            r2.append(r7)
            java.lang.String r3 = ", uxInfo="
            r2.append(r3)
            r6 = r25
            r2.append(r6)
            java.lang.String r3 = ", adCanvasParams = "
            r2.append(r3)
            java.lang.String r16 = ""
            if (r27 != 0) goto L_0x0062
            r3 = r16
            goto L_0x0066
        L_0x0062:
            java.lang.String r3 = r27.toString()
        L_0x0066:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "OpenCanvasMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x007c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r16
        L_0x007c:
            r4 = 1
            if (r0 == r4) goto L_0x0164
            java.lang.String r2 = "getAdCanvasXmlFromCache"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r13)
            r14 = r2
            r2 = r19
            r17 = r12
            r12 = 1
            r4 = r25
            r12 = r5
            r5 = r24
            r6 = r26
            r7 = r27
            java.lang.String r0 = m40781a(r2, r4, r5, r6, r7)     // Catch:{ all -> 0x00fa }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00fa }
            if (r2 == 0) goto L_0x00a2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            goto L_0x0124
        L_0x00a2:
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f95245c     // Catch:{ all -> 0x00fa }
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x00fa }
            boolean r2 = r2.containsKey(r0)     // Catch:{ all -> 0x00fa }
            if (r2 == 0) goto L_0x00ba
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f95245c     // Catch:{ all -> 0x00fa }
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x00fa }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00fa }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            goto L_0x0126
        L_0x00ba:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r2.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = "getAdCanvasXmlFromCache, read db, pageId="
            r2.append(r3)     // Catch:{ all -> 0x00fa }
            r2.append(r8)     // Catch:{ all -> 0x00fa }
            r2.append(r15)     // Catch:{ all -> 0x00fa }
            r2.append(r11)     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)     // Catch:{ all -> 0x00fa }
            os2.b r2 = new os2.b     // Catch:{ all -> 0x00fa }
            r2.<init>()     // Catch:{ all -> 0x00fa }
            r2.field_cacheKey = r0     // Catch:{ all -> 0x00fa }
            os2.c r3 = r1.f95244b     // Catch:{ all -> 0x00fa }
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x00fa }
            r3.get(r2, (java.lang.String[]) r4)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = r2.field_canvasXml     // Catch:{ all -> 0x00fa }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00fa }
            if (r3 != 0) goto L_0x0121
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.f95245c     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = r2.field_canvasXml     // Catch:{ all -> 0x00fa }
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ all -> 0x00fa }
            r3.put(r0, r4)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r2.field_canvasXml     // Catch:{ all -> 0x00fa }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            goto L_0x0126
        L_0x00fa:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getAdCanvasXmlFromCache, pageId="
            r2.append(r3)
            r2.append(r8)
            r2.append(r15)
            r2.append(r11)
            java.lang.String r3 = ", exp="
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0121:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
        L_0x0124:
            r0 = r16
        L_0x0126:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x014e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "openForAd, hit local cache, pageId="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ", xml.len="
            r2.append(r3)
            int r3 = r0.length()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x017e
        L_0x014e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "openForAd, no local cache, pageId="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x017e
        L_0x0164:
            r17 = r12
            r12 = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "openForAd, forbid local cache, pageId="
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r0 = r16
        L_0x017e:
            r2 = 1
            if (r10 == r2) goto L_0x0187
            r12 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r0
        L_0x0187:
            r12 = r17
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x01a8
            r0 = 0
            r14 = 0
            r2 = r19
            r4 = r21
            r5 = r22
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r0
            r11 = r14
            m40783e(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r16
        L_0x01a8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ps2.C35631d0.mo60342c(long, int, int, int, int, java.lang.String, java.lang.String, ps2.a):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0099  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo60343d(java.lang.String r10, java.lang.String r11, int r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "openForUx"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r5 = 2
            r2[r5] = r4
            java.lang.String r4 = "OpenCanvasMgr"
            java.lang.String r5 = "open pageId %s, canvasExt %s, preLoad %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x002c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L_0x002c:
            if (r13 == r3) goto L_0x0092
            java.lang.String r13 = "getUxXmlFromCache"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 != 0) goto L_0x0049
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            goto L_0x004a
        L_0x0049:
            r2 = r10
        L_0x004a:
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f95247e
            java.util.HashMap r5 = (java.util.HashMap) r5
            boolean r5 = r5.containsKey(r2)
            if (r5 == 0) goto L_0x0062
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f95247e
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r1)
            goto L_0x0093
        L_0x0062:
            os2.u0 r5 = new os2.u0
            r5.<init>()
            r5.field_canvasId = r10
            r5.field_canvasExt = r11
            os2.v0 r6 = r9.f95246d
            java.lang.String r7 = "canvasId"
            java.lang.String r8 = "canvasExt"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            r6.get(r5, (java.lang.String[]) r7)
            java.lang.String r6 = r5.field_canvasXml
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x008f
            java.util.Map<java.lang.String, java.lang.String> r6 = r9.f95247e
            java.lang.String r7 = r5.field_canvasXml
            java.util.HashMap r6 = (java.util.HashMap) r6
            r6.put(r2, r7)
            java.lang.String r2 = r5.field_canvasXml
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r1)
            goto L_0x0093
        L_0x008f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r1)
        L_0x0092:
            r2 = r4
        L_0x0093:
            if (r12 == r3) goto L_0x0099
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0099:
            boolean r13 = android.text.TextUtils.isEmpty(r2)
            if (r13 == 0) goto L_0x00a7
            r13 = 0
            m40784f(r10, r11, r12, r13, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L_0x00a7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ps2.C35631d0.mo60343d(java.lang.String, java.lang.String, int, int):java.lang.String");
    }

    /* renamed from: g */
    public final String mo60344g(C35286b bVar) {
        SnsMethodCalculate.markStartTimeMs("toLogStr", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        if (bVar == null) {
            SnsMethodCalculate.markEndTimeMs("toLogStr", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
            return "";
        }
        String str = "canvasId=" + bVar.field_canvasId + ", source=" + bVar.field_source + ", createTime=" + bVar.field_createTime + ", dynamicInfo=" + bVar.field_dynamicInfo + ", uxInfo=" + bVar.field_uxInfo;
        SnsMethodCalculate.markEndTimeMs("toLogStr", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        return str;
    }
}
