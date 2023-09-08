package pl2;

import a70.C112760b;
import android.content.Context;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p1054vg.C90801g;
import p523fp.C32147e;
import pl2.C35529e;
import z04.C112551y;

@C86522b(creator = C35529e.C35530a.class, onProcess = {C80625v0.MATCH_MM})
/* renamed from: pl2.c */
public final class C35526c extends C86301e {

    /* renamed from: d */
    public final C35533g f95002d = new C35533g(0);

    /* renamed from: e */
    public final ConcurrentHashMap<String, String> f95003e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public int f95004f;

    /* renamed from: g */
    public int f95005g = -1;

    /* renamed from: pl2.c$a */
    public static final class C35527a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C35526c f95006d;

        /* renamed from: e */
        public final /* synthetic */ String f95007e;

        public C35527a(C35526c cVar, String str) {
            this.f95006d = cVar;
            this.f95007e = str;
        }

        public final void run() {
            C35526c cVar = this.f95006d;
            String str = this.f95007e;
            C87412m.m108593f(str, "cacheFile");
            this.f95006d.getClass();
            this.f95006d.getClass();
            C35526c.vx0(cVar, str, 97, 1, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01fa A[SYNTHETIC, Splitter:B:58:0x01fa] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0205 A[Catch:{ all -> 0x0243 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0247 A[Catch:{ all -> 0x0243 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0256 A[Catch:{ all -> 0x0243 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void vx0(pl2.C35526c r16, java.lang.String r17, int r18, int r19, int r20) {
        /*
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.Class<fp.e> r5 = p523fp.C32147e.class
            monitor-enter(r16)
            java.lang.String r6 = "MicroMsg.ScanProductModelResLogic"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r7.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r8 = "unzipRes: "
            r7.append(r8)     // Catch:{ all -> 0x0279 }
            r7.append(r0)     // Catch:{ all -> 0x0279 }
            java.lang.String r8 = "  type:"
            r7.append(r8)     // Catch:{ all -> 0x0279 }
            r7.append(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r8 = "  version:"
            r7.append(r8)     // Catch:{ all -> 0x0279 }
            r7.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0279 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x0279 }
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r17)     // Catch:{ all -> 0x0279 }
            if (r6 == 0) goto L_0x0277
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r6.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r7 = r16.Ex0()     // Catch:{ all -> 0x0279 }
            r6.append(r7)     // Catch:{ all -> 0x0279 }
            java.lang.String r7 = "temp"
            r6.append(r7)     // Catch:{ all -> 0x0279 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0279 }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r6)     // Catch:{ all -> 0x0279 }
            int r0 = com.tencent.p014mm.vfs.C86013q1.m106436R(r0, r6)     // Catch:{ all -> 0x0279 }
            java.lang.String r7 = "MicroMsg.ScanProductModelResLogic"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r8.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r9 = "unzipRes unzip file ret:"
            r8.append(r9)     // Catch:{ all -> 0x0279 }
            r8.append(r0)     // Catch:{ all -> 0x0279 }
            java.lang.String r9 = "  getResTmpPath:"
            r8.append(r9)     // Catch:{ all -> 0x0279 }
            r8.append(r6)     // Catch:{ all -> 0x0279 }
            java.lang.String r9 = "   version:"
            r8.append(r9)     // Catch:{ all -> 0x0279 }
            r8.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0279 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x0279 }
            java.lang.String r7 = r16.Gx0()     // Catch:{ all -> 0x0279 }
            r8 = 0
            java.lang.Iterable r7 = com.tencent.p014mm.vfs.C86013q1.m106459t(r7, r8)     // Catch:{ all -> 0x0279 }
            if (r7 == 0) goto L_0x00c7
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0279 }
        L_0x008d:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x0279 }
            if (r9 == 0) goto L_0x00c7
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0279 }
            com.tencent.mm.vfs.b0 r9 = (com.tencent.p014mm.vfs.C86001b0) r9     // Catch:{ all -> 0x0279 }
            java.lang.String r10 = "MicroMsg.ScanProductModelResLogic"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r11.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = "unzipRes unzip file path:"
            r11.append(r12)     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = r9.f250471a     // Catch:{ all -> 0x0279 }
            r11.append(r12)     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = " name:"
            r11.append(r12)     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = r9.f250472b     // Catch:{ all -> 0x0279 }
            r11.append(r12)     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = " size:"
            r11.append(r12)     // Catch:{ all -> 0x0279 }
            long r12 = r9.f250473c     // Catch:{ all -> 0x0279 }
            r11.append(r12)     // Catch:{ all -> 0x0279 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0279 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)     // Catch:{ all -> 0x0279 }
            goto L_0x008d
        L_0x00c7:
            if (r0 != 0) goto L_0x0271
            r7 = 7
            r9 = 8
            pl2.g r0 = r1.f95002d     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            r11 = 5
            r0.mo60305a(r11)     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            java.lang.String r0 = r16.Fx0()     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            if (r11 == 0) goto L_0x01e0
            java.lang.String r11 = "MicroMsg.ScanProductModelResLogic"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            r12.<init>()     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            java.lang.String r13 = "unzipRes file exist, tmpConfigPath:"
            r12.append(r13)     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            r12.append(r0)     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            r12.<init>(r11)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            java.lang.String r13 = "file"
            org.json.JSONArray r13 = r12.optJSONArray(r13)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            java.lang.String r14 = "version"
            int r12 = r12.optInt(r14)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            java.lang.String r14 = "MicroMsg.ScanProductModelResLogic"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            r15.<init>()     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            java.lang.String r8 = "unzipRes meta json: "
            r15.append(r8)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            r15.append(r11)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            java.lang.String r8 = "  jsonFile:"
            r15.append(r8)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            if (r13 == 0) goto L_0x0129
            int r8 = r13.length()     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            goto L_0x012a
        L_0x0129:
            r8 = 0
        L_0x012a:
            r15.append(r8)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            java.lang.String r8 = "  version:"
            r15.append(r8)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            r15.append(r12)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            java.lang.String r8 = r15.toString()     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r8)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            if (r13 == 0) goto L_0x01d1
            int r8 = r13.length()     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            if (r8 <= 0) goto L_0x01d1
            java.lang.String r8 = r16.Ax0()     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            com.tencent.p014mm.vfs.C86013q1.m106445f(r8)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            java.lang.String r8 = r16.Ax0()     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r8)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            r8 = 0
        L_0x0153:
            r11 = 1
        L_0x0154:
            int r14 = r13.length()     // Catch:{ Exception -> 0x01cf }
            if (r8 >= r14) goto L_0x015c
            r14 = 1
            goto L_0x015d
        L_0x015c:
            r14 = 0
        L_0x015d:
            if (r14 == 0) goto L_0x0191
            java.lang.Object r14 = r13.get(r8)     // Catch:{ Exception -> 0x01cf }
            int r8 = r8 + 1
            java.lang.String r15 = "null cannot be cast to non-null type org.json.JSONObject"
            gy3.C87412m.m108592e(r14, r15)     // Catch:{ Exception -> 0x01cf }
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch:{ Exception -> 0x01cf }
            java.lang.String r15 = "name"
            java.lang.String r15 = r14.optString(r15)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r10 = "md5"
            java.lang.String r10 = r14.optString(r10)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r14 = "fileName"
            gy3.C87412m.m108593f(r15, r14)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r14 = "md5"
            gy3.C87412m.m108593f(r10, r14)     // Catch:{ Exception -> 0x01cf }
            boolean r10 = r1.Hx0(r15, r10)     // Catch:{ Exception -> 0x01cf }
            if (r10 == 0) goto L_0x018f
            if (r11 == 0) goto L_0x018f
            goto L_0x0153
        L_0x018f:
            r11 = 0
            goto L_0x0154
        L_0x0191:
            java.lang.String r8 = "MicroMsg.ScanProductModelResLogic"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cf }
            r10.<init>()     // Catch:{ Exception -> 0x01cf }
            java.lang.String r13 = "unzipRes file, unzipSuccess:"
            r10.append(r13)     // Catch:{ Exception -> 0x01cf }
            r10.append(r11)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01cf }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)     // Catch:{ Exception -> 0x01cf }
            if (r11 == 0) goto L_0x01cd
            java.lang.String r8 = r16.zx0()     // Catch:{ Exception -> 0x01cf }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r8 = r16.zx0()     // Catch:{ Exception -> 0x01cf }
            com.tencent.p014mm.vfs.C86013q1.m106463x(r0, r8)     // Catch:{ Exception -> 0x01cf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cf }
            r0.<init>()     // Catch:{ Exception -> 0x01cf }
            java.lang.String r8 = "识物模型解压成功："
            r0.append(r8)     // Catch:{ Exception -> 0x01cf }
            r0.append(r12)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01cf }
            r1.Ix0(r0)     // Catch:{ Exception -> 0x01cf }
        L_0x01cd:
            r8 = r11
            goto L_0x01f8
        L_0x01cf:
            r0 = move-exception
            goto L_0x0221
        L_0x01d1:
            java.lang.String r0 = "MicroMsg.ScanProductModelResLogic"
            java.lang.String r8 = "unzipRes json file is null or empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)     // Catch:{ Exception -> 0x01dd, all -> 0x01da }
            goto L_0x01f7
        L_0x01da:
            r0 = move-exception
            r8 = 1
            goto L_0x0245
        L_0x01dd:
            r0 = move-exception
            r11 = 1
            goto L_0x0221
        L_0x01e0:
            java.lang.String r8 = "MicroMsg.ScanProductModelResLogic"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            r10.<init>()     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            java.lang.String r11 = "unzipRes file not exist, configPath:"
            r10.append(r11)     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            r10.append(r0)     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x021f, all -> 0x021c }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x021f, all -> 0x021c }
        L_0x01f7:
            r8 = 0
        L_0x01f8:
            if (r8 != 0) goto L_0x0205
            pl2.g r0 = r1.f95002d     // Catch:{ all -> 0x0279 }
            r0.mo60305a(r9)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = "MicroMsg.ScanProductModelResLogic"
        L_0x0201:
            java.lang.String r2 = "unzipRes unzip failed"
            goto L_0x023b
        L_0x0205:
            pl2.g r0 = r1.f95002d     // Catch:{ all -> 0x0279 }
            r0.mo60305a(r7)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = "MicroMsg.ScanProductModelResLogic"
            java.lang.String r7 = "unzipRes unzip success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ all -> 0x0279 }
            di3.d r0 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x0279 }
            fp.e r0 = (p523fp.C32147e) r0     // Catch:{ all -> 0x0279 }
            r0.Y40(r2, r3, r4)     // Catch:{ all -> 0x0279 }
            goto L_0x023e
        L_0x021c:
            r0 = move-exception
            r8 = 0
            goto L_0x0245
        L_0x021f:
            r0 = move-exception
            r11 = 0
        L_0x0221:
            java.lang.String r8 = "MicroMsg.ScanProductModelResLogic"
            java.lang.String r10 = "unzipRes error: %s"
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x0243 }
            java.lang.String r12 = r0.getMessage()     // Catch:{ all -> 0x0243 }
            r14 = 0
            r13[r14] = r12     // Catch:{ all -> 0x0243 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r10, r13)     // Catch:{ all -> 0x0243 }
            pl2.g r0 = r1.f95002d     // Catch:{ all -> 0x0279 }
            r0.mo60305a(r9)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = "MicroMsg.ScanProductModelResLogic"
            goto L_0x0201
        L_0x023b:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0279 }
        L_0x023e:
            r2 = 1
            com.tencent.p014mm.vfs.C86013q1.m106446g(r6, r2)     // Catch:{ all -> 0x0279 }
            goto L_0x0277
        L_0x0243:
            r0 = move-exception
            r8 = r11
        L_0x0245:
            if (r8 != 0) goto L_0x0256
            pl2.g r2 = r1.f95002d     // Catch:{ all -> 0x0279 }
            r2.mo60305a(r9)     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "MicroMsg.ScanProductModelResLogic"
            java.lang.String r3 = "unzipRes unzip failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0279 }
        L_0x0254:
            r2 = 1
            goto L_0x026d
        L_0x0256:
            pl2.g r8 = r1.f95002d     // Catch:{ all -> 0x0279 }
            r8.mo60305a(r7)     // Catch:{ all -> 0x0279 }
            java.lang.String r7 = "MicroMsg.ScanProductModelResLogic"
            java.lang.String r8 = "unzipRes unzip success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x0279 }
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x0279 }
            fp.e r5 = (p523fp.C32147e) r5     // Catch:{ all -> 0x0279 }
            r5.Y40(r2, r3, r4)     // Catch:{ all -> 0x0279 }
            goto L_0x0254
        L_0x026d:
            com.tencent.p014mm.vfs.C86013q1.m106446g(r6, r2)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x0271:
            pl2.g r0 = r1.f95002d     // Catch:{ all -> 0x0279 }
            r2 = 6
            r0.mo60305a(r2)     // Catch:{ all -> 0x0279 }
        L_0x0277:
            monitor-exit(r16)
            return
        L_0x0279:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pl2.C35526c.vx0(pl2.c, java.lang.String, int, int, int):void");
    }

    public final String Ax0() {
        return Ex0() + "pending";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[Catch:{ Exception -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[Catch:{ Exception -> 0x006b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String Bx0() {
        /*
            r6 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.ScanProductModelResLogic"
            r2 = 0
            boolean r3 = r6.wx0()     // Catch:{ Exception -> 0x006b }
            if (r3 != 0) goto L_0x0011
            java.lang.String r3 = "getReadyModelConfigString res is not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)     // Catch:{ Exception -> 0x006b }
            return r0
        L_0x0011:
            r6.requireAccountInitialized()     // Catch:{ Exception -> 0x006b }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r6.f95003e     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "csc_model_config"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x006b }
            if (r3 == 0) goto L_0x0029
            boolean r4 = z04.C112551y.m153811k(r3)     // Catch:{ Exception -> 0x006b }
            if (r4 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r4 = 0
            goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            if (r4 == 0) goto L_0x0032
            java.lang.String r3 = "getReadyModelConfigString fileName is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)     // Catch:{ Exception -> 0x006b }
            return r0
        L_0x0032:
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ Exception -> 0x006b }
            if (r4 != 0) goto L_0x004d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b }
            r4.<init>()     // Catch:{ Exception -> 0x006b }
            java.lang.String r5 = "getReadyModelConfigString file is not exist. filePath:"
            r4.append(r5)     // Catch:{ Exception -> 0x006b }
            r4.append(r3)     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x006b }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)     // Catch:{ Exception -> 0x006b }
            return r0
        L_0x004d:
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106432N(r3)     // Catch:{ Exception -> 0x006b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b }
            r4.<init>()     // Catch:{ Exception -> 0x006b }
            java.lang.String r5 = "getReadyModelConfigString  config:"
            r4.append(r5)     // Catch:{ Exception -> 0x006b }
            r4.append(r3)     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x006b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "config"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x006b }
            return r3
        L_0x006b:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "getReadyModelConfigString"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pl2.C35526c.Bx0():java.lang.String");
    }

    public final String Cx0(String str) {
        if (!wx0()) {
            Log.m105920e("MicroMsg.ScanProductModelResLogic", "getReadyParamPath res is not ready");
            return null;
        }
        boolean z = false;
        if (str == null || C112551y.m153811k(str)) {
            Log.m105920e("MicroMsg.ScanProductModelResLogic", "getReadyParamPath param is empty");
            return null;
        }
        requireAccountInitialized();
        String str2 = this.f95003e.get(str);
        if (str2 == null || C112551y.m153811k(str2)) {
            z = true;
        }
        if (z) {
            Log.m105920e("MicroMsg.ScanProductModelResLogic", "getReadyParamPath fileName is empty, param:" + str);
            return null;
        }
        Log.m105924i("MicroMsg.ScanProductModelResLogic", "getReadyParamPath  param:" + str + "  filePath:" + str2);
        return str2;
    }

    public final String Dx0() {
        return Ex0() + "ready";
    }

    public final String Ex0() {
        requireAccountInitialized();
        return C112760b.m154231g() + "scan_res/";
    }

    public final String Fx0() {
        requireAccountInitialized();
        return Gx0() + "/csc_config.json";
    }

    public final String Gx0() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ex0() + "temp");
        sb.append("/cscmodel");
        return sb.toString();
    }

    public final boolean Hx0(String str, String str2) {
        String str3 = Gx0() + XVFSFile.SEPARATOR_CHAR + str;
        String str4 = Ax0() + XVFSFile.SEPARATOR_CHAR + str;
        Log.m105924i("MicroMsg.ScanProductModelResLogic", "moveFileToPendingFilePath file tmp:" + str3 + "  pending:" + str4);
        if (C86013q1.m106450k(str3)) {
            C86013q1.m106463x(str3, str4);
            boolean b = C87412m.m108589b(C90801g.m113874b(str4), str2);
            Log.m105924i("MicroMsg.ScanProductModelResLogic", "moveFileToPendingFilePath move, result:" + b + "  file: " + str4);
            return b;
        }
        Log.m105920e("MicroMsg.ScanProductModelResLogic", "moveFileToPendingFilePath file is not exist. tmpFilePath:" + str3);
        return false;
    }

    public final void Ix0(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
    }

    public void onAccountInitialized(Context context) {
        boolean z;
        String str;
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.ScanProductModelResLogic", "onAccountInitialized");
        try {
            this.f95004f = 0;
            this.f95005g = -1;
            requireAccountInitialized();
            this.f95003e.clear();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanProductModelResLogic", e, "resetData", new Object[0]);
        }
        String zx02 = zx0();
        Log.m105924i("MicroMsg.ScanProductModelResLogic", "checkFile pendingConfigFilePath : " + zx02);
        if (C86013q1.m106450k(zx02)) {
            try {
                String N = C86013q1.m106432N(zx02);
                JSONObject jSONObject = new JSONObject(N);
                JSONArray optJSONArray = jSONObject.optJSONArray("file");
                int optInt = jSONObject.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION);
                StringBuilder sb = new StringBuilder();
                sb.append("unzipRes  jsonFile:");
                sb.append(optJSONArray != null ? Integer.valueOf(optJSONArray.length()) : null);
                sb.append("  version:");
                sb.append(optInt);
                sb.append("  meta json: ");
                sb.append(N);
                Log.m105924i("MicroMsg.ScanProductModelResLogic", sb.toString());
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    Log.m105920e("MicroMsg.ScanProductModelResLogic", "checkFile jsonFile is empty");
                } else {
                    int i = 0;
                    do {
                        if (!(i < optJSONArray.length())) {
                            xx0();
                            Log.m105924i("MicroMsg.ScanProductModelResLogic", "checkFile true");
                            z = true;
                            break;
                        }
                        Object obj = optJSONArray.get(i);
                        i++;
                        C87412m.m108592e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                        str = Ax0() + XVFSFile.SEPARATOR_CHAR + ((JSONObject) obj).optString("name");
                    } while (C86013q1.m106450k(str));
                    Log.m105920e("MicroMsg.ScanProductModelResLogic", "checkFile file not exist. filePath:" + str);
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.ScanProductModelResLogic", e2, "checkFile", new Object[0]);
            }
        } else {
            Log.m105928w("MicroMsg.ScanProductModelResLogic", "checkFile config not exist.");
        }
        z = false;
        if (z) {
            this.f95002d.mo60305a(0);
            return;
        }
        String AD = ((C32147e) C86312j.m106911c(C32147e.class)).mo58507AD(97, 1);
        if (C86013q1.m106450k(AD)) {
            Log.m105924i("MicroMsg.ScanProductModelResLogic", "cache file exist " + AD);
            C86709a0.m107525e().postToWorker(new C35527a(this, AD));
        }
        this.f95002d.mo60305a(1);
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105920e("MicroMsg.ScanProductModelResLogic", "onAccountReleased");
        try {
            this.f95004f = 0;
            this.f95005g = -1;
            requireAccountInitialized();
            this.f95003e.clear();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanProductModelResLogic", e, "resetData", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1 A[Catch:{ Exception -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[EDGE_INSN: B:42:0x00c4->B:33:0x00c4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean wx0() {
        /*
            r11 = this;
            java.lang.String r0 = "param"
            java.lang.String r1 = "MicroMsg.ScanProductModelResLogic"
            r2 = 0
            r3 = 3
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            int r4 = r11.f95005g     // Catch:{ Exception -> 0x015e }
            r5 = -1
            r6 = 1
            if (r4 == r5) goto L_0x0019
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            int r0 = r11.f95005g     // Catch:{ Exception -> 0x015e }
            if (r0 != r6) goto L_0x0018
            r2 = 1
        L_0x0018:
            return r2
        L_0x0019:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r4.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r5 = r11.Dx0()     // Catch:{ Exception -> 0x015e }
            r4.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r5 = "/csc_config.json"
            r4.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x015e }
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)     // Catch:{ Exception -> 0x015e }
            if (r5 != 0) goto L_0x0046
            r11.f95005g = r2     // Catch:{ Exception -> 0x015e }
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r11.f95003e     // Catch:{ Exception -> 0x015e }
            r0.clear()     // Catch:{ Exception -> 0x015e }
            r11.f95004f = r2     // Catch:{ Exception -> 0x015e }
            pl2.g r0 = r11.f95002d     // Catch:{ Exception -> 0x015e }
            r0.mo60305a(r3)     // Catch:{ Exception -> 0x015e }
            return r2
        L_0x0046:
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106432N(r4)     // Catch:{ Exception -> 0x015e }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x015e }
            r5.<init>(r4)     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = "version"
            int r4 = r5.optInt(r4, r2)     // Catch:{ Exception -> 0x015e }
            r11.f95004f = r4     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = "file"
            org.json.JSONArray r4 = r5.optJSONArray(r4)     // Catch:{ Exception -> 0x015e }
            if (r4 == 0) goto L_0x0133
            int r5 = r4.length()     // Catch:{ Exception -> 0x015e }
            if (r5 <= 0) goto L_0x0133
            r5 = 0
        L_0x0067:
            int r7 = r4.length()     // Catch:{ Exception -> 0x015e }
            if (r5 >= r7) goto L_0x006f
            r7 = 1
            goto L_0x0070
        L_0x006f:
            r7 = 0
        L_0x0070:
            if (r7 == 0) goto L_0x00f7
            java.lang.Object r7 = r4.get(r5)     // Catch:{ Exception -> 0x015e }
            int r5 = r5 + 1
            java.lang.String r8 = "null cannot be cast to non-null type org.json.JSONObject"
            gy3.C87412m.m108592e(r7, r8)     // Catch:{ Exception -> 0x015e }
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = "name"
            java.lang.String r8 = r7.optString(r8)     // Catch:{ Exception -> 0x015e }
            java.lang.String r7 = r7.optString(r0)     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r9.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = r11.Dx0()     // Catch:{ Exception -> 0x015e }
            r9.append(r10)     // Catch:{ Exception -> 0x015e }
            r10 = 47
            r9.append(r10)     // Catch:{ Exception -> 0x015e }
            r9.append(r8)     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x00ae
            boolean r9 = z04.C112551y.m153811k(r7)     // Catch:{ Exception -> 0x015e }
            if (r9 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r9 = 0
            goto L_0x00af
        L_0x00ae:
            r9 = 1
        L_0x00af:
            if (r9 != 0) goto L_0x00c4
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ Exception -> 0x015e }
            if (r9 != 0) goto L_0x00b8
            goto L_0x00c4
        L_0x00b8:
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r9 = r11.f95003e     // Catch:{ Exception -> 0x015e }
            gy3.C87412m.m108593f(r7, r0)     // Catch:{ Exception -> 0x015e }
            r9.put(r7, r8)     // Catch:{ Exception -> 0x015e }
            goto L_0x0067
        L_0x00c4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r0.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = "checkIfDownloadModelResReady file not exist. version:"
            r0.append(r4)     // Catch:{ Exception -> 0x015e }
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            int r4 = r11.f95004f     // Catch:{ Exception -> 0x015e }
            r0.append(r4)     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = ", filePath:"
            r0.append(r4)     // Catch:{ Exception -> 0x015e }
            r0.append(r8)     // Catch:{ Exception -> 0x015e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x015e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ Exception -> 0x015e }
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r11.f95003e     // Catch:{ Exception -> 0x015e }
            r0.clear()     // Catch:{ Exception -> 0x015e }
            r11.f95004f = r2     // Catch:{ Exception -> 0x015e }
            r11.f95005g = r2     // Catch:{ Exception -> 0x015e }
            pl2.g r0 = r11.f95002d     // Catch:{ Exception -> 0x015e }
            r0.mo60305a(r3)     // Catch:{ Exception -> 0x015e }
            return r2
        L_0x00f7:
            r11.f95005g = r6     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r0.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = "checkIfDownloadModelResReady true. version:"
            r0.append(r4)     // Catch:{ Exception -> 0x015e }
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            int r4 = r11.f95004f     // Catch:{ Exception -> 0x015e }
            r0.append(r4)     // Catch:{ Exception -> 0x015e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x015e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r0.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = "下发模型已ready："
            r0.append(r4)     // Catch:{ Exception -> 0x015e }
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            int r4 = r11.f95004f     // Catch:{ Exception -> 0x015e }
            r0.append(r4)     // Catch:{ Exception -> 0x015e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x015e }
            r11.Ix0(r0)     // Catch:{ Exception -> 0x015e }
            pl2.g r0 = r11.f95002d     // Catch:{ Exception -> 0x015e }
            r4 = 2
            r0.mo60305a(r4)     // Catch:{ Exception -> 0x015e }
            return r6
        L_0x0133:
            r11.f95005g = r2     // Catch:{ Exception -> 0x015e }
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r11.f95003e     // Catch:{ Exception -> 0x015e }
            r0.clear()     // Catch:{ Exception -> 0x015e }
            r11.f95004f = r2     // Catch:{ Exception -> 0x015e }
            pl2.g r0 = r11.f95002d     // Catch:{ Exception -> 0x015e }
            r0.mo60305a(r3)     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r0.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = "checkIfDownloadModelResReady fileJsonArray is empty. version:"
            r0.append(r4)     // Catch:{ Exception -> 0x015e }
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x015e }
            int r4 = r11.f95004f     // Catch:{ Exception -> 0x015e }
            r0.append(r4)     // Catch:{ Exception -> 0x015e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x015e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ Exception -> 0x015e }
            return r2
        L_0x015e:
            r0 = move-exception
            r11.f95005g = r2
            r11.requireAccountInitialized()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r4 = r11.f95003e
            r4.clear()
            r11.f95004f = r2
            pl2.g r4 = r11.f95002d
            r4.mo60305a(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "checkIfDownloadModelResReady."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pl2.C35526c.wx0():boolean");
    }

    public final boolean xx0() {
        try {
            int yx02 = yx0(zx0());
            int yx03 = yx0(Dx0() + "/csc_config.json");
            if (yx02 > yx03) {
                String Dx0 = Dx0();
                String Ax0 = Ax0();
                C86013q1.m106445f(Dx0);
                C86013q1.m106461v(Dx0);
                boolean b = C86013q1.m106441b(Ax0, Dx0);
                if (b) {
                    this.f95002d.mo60305a(9);
                } else {
                    this.f95002d.mo60305a(10);
                }
                Log.m105924i("MicroMsg.ScanProductModelResLogic", "copyPendingDirToReadyDirIfNeed copy, pendingVersion:" + yx02 + ", readyVersion:" + yx03 + ", result:" + b);
                Ix0("拷贝模型到ready目录：" + yx03 + ", " + yx02 + ", " + b);
                return b;
            }
            Log.m105928w("MicroMsg.ScanProductModelResLogic", "copyPendingDirToReadyDirIfNeed not copy, pendingVersion:" + yx02 + ", readyVersion:" + yx03);
            Ix0("下发模型已ready，无需拷贝：" + yx03 + ", " + yx02);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanProductModelResLogic", e, "copyPendingDirToReadyDirIfNeed", new Object[0]);
            return false;
        }
    }

    public final int yx0(String str) {
        try {
            if (!C86013q1.m106450k(str)) {
                Log.m105928w("MicroMsg.ScanProductModelResLogic", "getConfigJsonVersion file is not exist. filePath:" + str);
                return 0;
            }
            int optInt = new JSONObject(C86013q1.m106432N(str)).optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION, 0);
            Log.m105924i("MicroMsg.ScanProductModelResLogic", "getConfigJsonVersion version:" + optInt + " , filePath:" + str);
            return optInt;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanProductModelResLogic", e, "getConfigJsonVersion", new Object[0]);
            return 0;
        }
    }

    public final String zx0() {
        return Ax0() + "/csc_config.json";
    }
}
