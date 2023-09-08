package uq1;

import android.graphics.BitmapFactory;
import android.graphics.Point;
import bd1.C54446b;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import er1.C58739j4;
import er1.C58741j5;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import je1.C9328k1;
import org.json.JSONObject;
import pe3.C89349b;
import qw1.C63341j;
import rx3.C13598b0;
import te3.C52271zj0;
import te3.C64477jr2;
import te3.C64591nr3;
import te3.C64689rq2;
import up1.C37521f;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: uq1.m */
public final class C65449m {

    /* renamed from: a */
    public static final C65449m f188332a = new C65449m();

    /* renamed from: uq1.m$b */
    public static final class C14372b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<C52271zj0, C13598b0> f39927a;

        public C14372b(C32226l<? super C52271zj0, C13598b0> lVar) {
            this.f39927a = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r11) {
            /*
                r10 = this;
                ob0.b$c r11 = (ob0.C89132b.C89134c) r11
                int r0 = r11.f256793a
                java.lang.String r1 = "Finder.FinderPostUtil"
                r2 = 0
                if (r0 != 0) goto L_0x001e
                int r0 = r11.f256794b
                if (r0 != 0) goto L_0x001e
                T r11 = r11.f256796d
                te3.sj1 r11 = (te3.C51253sj1) r11
                if (r11 == 0) goto L_0x0053
                java.util.LinkedList<te3.zj0> r11 = r11.f141556e
                if (r11 == 0) goto L_0x0053
                java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
                te3.zj0 r11 = (te3.C52271zj0) r11
                goto L_0x0054
            L_0x001e:
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 1253(0x4e5, double:6.19E-321)
                r6 = 71
                r8 = 1
                r3.mo175913w(r4, r6, r8)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "errorType = "
                r0.append(r3)
                int r3 = r11.f256793a
                r0.append(r3)
                java.lang.String r3 = " errorCode = "
                r0.append(r3)
                int r3 = r11.f256794b
                r0.append(r3)
                java.lang.String r3 = "  errorMsg = "
                r0.append(r3)
                java.lang.String r11 = r11.f256795c
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            L_0x0053:
                r11 = r2
            L_0x0054:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "eventInfo = "
                r0.append(r3)
                r0.append(r11)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                r0 = 1
                if (r11 == 0) goto L_0x0070
                int r1 = r11.f146017s
                if (r1 != r0) goto L_0x0070
                goto L_0x0071
            L_0x0070:
                r0 = 0
            L_0x0071:
                if (r0 == 0) goto L_0x0084
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 1253(0x4e5, double:6.19E-321)
                r6 = 72
                r8 = 1
                r3.mo175913w(r4, r6, r8)
                fy3.l<te3.zj0, rx3.b0> r11 = r10.f39927a
                r11.invoke(r2)
                goto L_0x0089
            L_0x0084:
                fy3.l<te3.zj0, rx3.b0> r0 = r10.f39927a
                r0.invoke(r11)
            L_0x0089:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: uq1.C65449m.C14372b.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: uq1.m$a */
    public static final class C65450a {

        /* renamed from: a */
        public String f188333a = "";

        /* renamed from: b */
        public String f188334b;

        /* renamed from: c */
        public String f188335c;

        /* renamed from: d */
        public int f188336d = -1;

        /* renamed from: e */
        public int f188337e = -1;
    }

    /* renamed from: g */
    public static /* synthetic */ C64689rq2 m77108g(C65449m mVar, String str, String str2, C64477jr2 jr22, String str3, String str4, C64591nr3 nr32, int i, Object obj) {
        return mVar.mo89567f(str, str2, (i & 4) != 0 ? null : jr22, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : nr32);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo89562a(te3.C64689rq2 r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = " url:"
            java.lang.String r1 = "Finder.FinderPostUtil"
            java.lang.String r2 = "mediaObject"
            gy3.C87412m.m108594g(r11, r2)
            r2 = 0
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e3 }
            int r5 = r11.f185268f     // Catch:{ all -> 0x00e3 }
            r6 = 4
            if (r5 != r6) goto L_0x003c
            java.lang.String r5 = r11.f185283w     // Catch:{ all -> 0x00e3 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ all -> 0x00e3 }
            if (r5 != 0) goto L_0x001e
            java.lang.String r5 = r11.f185283w     // Catch:{ all -> 0x00e3 }
            goto L_0x002b
        L_0x001e:
            java.lang.String r5 = r11.f185261W     // Catch:{ all -> 0x00e3 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ all -> 0x00e3 }
            if (r5 != 0) goto L_0x0029
            java.lang.String r5 = r11.f185261W     // Catch:{ all -> 0x00e3 }
            goto L_0x002b
        L_0x0029:
            java.lang.String r5 = r11.f185239F     // Catch:{ all -> 0x00e3 }
        L_0x002b:
            tc2.b r6 = new tc2.b     // Catch:{ all -> 0x00e3 }
            r6.<init>(r5, r2, r5)     // Catch:{ all -> 0x00e3 }
            tc2.c r5 = new tc2.c     // Catch:{ all -> 0x00e3 }
            java.lang.String r7 = r11.f185266d     // Catch:{ all -> 0x00e3 }
            int r8 = r11.f185269g     // Catch:{ all -> 0x00e3 }
            java.lang.String r9 = r11.f185250Q0     // Catch:{ all -> 0x00e3 }
            r5.<init>(r7, r8, r9, r12)     // Catch:{ all -> 0x00e3 }
            goto L_0x004c
        L_0x003c:
            r12 = 2
            if (r5 != r12) goto L_0x004a
            tc2.b r6 = new tc2.b     // Catch:{ all -> 0x00e3 }
            java.lang.String r12 = r11.f185266d     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = r11.f185250Q0     // Catch:{ all -> 0x00e3 }
            r6.<init>(r12, r2, r5)     // Catch:{ all -> 0x00e3 }
            r5 = r2
            goto L_0x004c
        L_0x004a:
            r5 = r2
            r6 = r5
        L_0x004c:
            tc2.g r12 = tc2.C118418g.INSTANCE     // Catch:{ all -> 0x00e3 }
            byte[] r12 = r12.Qc0(r6, r5)     // Catch:{ all -> 0x00e3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r7.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r8 = "calculateSecClientMediaFeature time:"
            r7.append(r8)     // Catch:{ all -> 0x00e0 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e0 }
            long r8 = r8 - r3
            r7.append(r8)     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = " size:"
            r7.append(r3)     // Catch:{ all -> 0x00e0 }
            if (r12 == 0) goto L_0x0071
            int r3 = r12.length     // Catch:{ all -> 0x00e0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00e0 }
            goto L_0x0072
        L_0x0071:
            r3 = r2
        L_0x0072:
            r7.append(r3)     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = " type:"
            r7.append(r3)     // Catch:{ all -> 0x00e0 }
            int r3 = r11.f185268f     // Catch:{ all -> 0x00e0 }
            r7.append(r3)     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = " duration:"
            r7.append(r3)     // Catch:{ all -> 0x00e0 }
            if (r5 == 0) goto L_0x008d
            int r3 = r5.f182000b     // Catch:{ all -> 0x00e0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00e0 }
            goto L_0x008e
        L_0x008d:
            r3 = r2
        L_0x008e:
            r7.append(r3)     // Catch:{ all -> 0x00e0 }
            r7.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = ""
            if (r5 == 0) goto L_0x00a5
            java.lang.String r4 = r5.f181999a     // Catch:{ all -> 0x00e0 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00e0 }
            if (r4 == 0) goto L_0x00a2
            r4 = r3
            goto L_0x00a6
        L_0x00a2:
            java.lang.String r4 = r5.f181999a     // Catch:{ all -> 0x00e0 }
            goto L_0x00a6
        L_0x00a5:
            r4 = r2
        L_0x00a6:
            r7.append(r4)     // Catch:{ all -> 0x00e0 }
            r7.append(r0)     // Catch:{ all -> 0x00e0 }
            if (r6 == 0) goto L_0x00ba
            java.lang.String r0 = r6.f181997a     // Catch:{ all -> 0x00e0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            java.lang.String r3 = r6.f181997a     // Catch:{ all -> 0x00e0 }
            goto L_0x00bb
        L_0x00ba:
            r3 = r2
        L_0x00bb:
            r7.append(r3)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = " origin:"
            r7.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r11 = r11.f185250Q0     // Catch:{ all -> 0x00e0 }
            r7.append(r11)     // Catch:{ all -> 0x00e0 }
            java.lang.String r11 = " watermarkFlag:"
            r7.append(r11)     // Catch:{ all -> 0x00e0 }
            if (r5 == 0) goto L_0x00d5
            int r11 = r5.f182002d     // Catch:{ all -> 0x00e0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00e0 }
        L_0x00d5:
            r7.append(r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r11 = r7.toString()     // Catch:{ all -> 0x00e0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)     // Catch:{ all -> 0x00e0 }
            goto L_0x00f9
        L_0x00e0:
            r11 = move-exception
            r2 = r12
            goto L_0x00e4
        L_0x00e3:
            r11 = move-exception
        L_0x00e4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "calculateSecClientMediaFeature time e:"
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r11)
            r12 = r2
        L_0x00f9:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: uq1.C65449m.mo89562a(te3.rq2, int):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89563b(android.content.Context r13, uq1.C65449m.C65450a r14) {
        /*
            r12 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r14, r0)
            int r0 = r14.f188337e
            int r1 = r14.f188336d
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0028
            if (r1 != 0) goto L_0x0015
            goto L_0x0028
        L_0x0015:
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1077936128(0x40400000, float:3.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0028
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 != 0) goto L_0x0036
            r14 = 2131829492(0x7f1122f4, float:1.9291955E38)
            java.lang.String r14 = r13.getString(r14)
            nj3.C76879j.m92726T(r13, r14)
            return r3
        L_0x0036:
            java.lang.String r0 = r14.f188334b
            java.lang.String r1 = "video/hevc"
            boolean r0 = z04.C112551y.m153809i(r1, r0, r2)
            if (r0 == 0) goto L_0x0048
            boolean r0 = s62.C101554f.m133322g()
            if (r0 == 0) goto L_0x0048
            goto L_0x0053
        L_0x0048:
            java.lang.String r0 = r14.f188334b
            java.lang.String r1 = "video/avc"
            boolean r0 = z04.C112551y.m153809i(r1, r0, r2)
            if (r0 == 0) goto L_0x0055
        L_0x0053:
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            java.lang.String r1 = r14.f188335c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r4 = "Finder.FinderPostUtil"
            if (r1 != 0) goto L_0x0081
            java.lang.String r1 = r14.f188335c
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r1 = z04.C112551y.m153809i(r5, r1, r2)
            if (r1 != 0) goto L_0x0081
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "audioTrack invalid, "
            r0.append(r1)
            java.lang.String r1 = r14.f188335c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = 0
        L_0x0081:
            java.lang.Class<tz.f> r1 = p707tz.C65000f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tz.f r1 = (p707tz.C65000f) r1
            java.lang.String r5 = r14.f188333a
            boolean r1 = r1.mo89208wj(r5)
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = r14.f188334b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = r14.f188334b
            boolean r0 = s62.C101554f.m133316a(r0)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r14.f188335c
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = r14.f188335c
            boolean r0 = s62.C101554f.m133316a(r0)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = "qt video can decode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = 1
            goto L_0x00be
        L_0x00b8:
            java.lang.String r0 = "qt video cannot decode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = 0
        L_0x00be:
            if (r0 != 0) goto L_0x00f5
            java.lang.String r1 = r14.f188334b
            java.lang.String r4 = r14.f188335c
            java.lang.String r14 = r14.f188333a
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = ""
            if (r1 != 0) goto L_0x00d0
            r1 = r7
        L_0x00d0:
            r6[r3] = r1
            if (r4 != 0) goto L_0x00d5
            r4 = r7
        L_0x00d5:
            r6[r2] = r4
            r1 = 2
            if (r14 != 0) goto L_0x00db
            r14 = r7
        L_0x00db:
            r6[r1] = r14
            r14 = 19441(0x4bf1, float:2.7243E-41)
            r5.mo160131h(r14, r6)
            r6 = 1253(0x4e5, double:6.19E-321)
            r8 = 33
            r10 = 1
            r5.mo175913w(r6, r8, r10)
            r14 = 2131829490(0x7f1122f2, float:1.929195E38)
            java.lang.String r14 = r13.getString(r14)
            nj3.C76879j.m92729W(r13, r14)
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uq1.C65449m.mo89563b(android.content.Context, uq1.m$a):boolean");
    }

    /* renamed from: c */
    public final boolean mo89564c() {
        C66785b bVar = C66785b.f191882e;
        boolean z = false;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90658I1(), false, 2, (Object) null);
        int i = a != null ? a.field_extFlag : 0;
        boolean z2 = (2097152 & i) != 0;
        C37521f.f99374d.getClass();
        if (C37521f.f99538v4.mo60266n().intValue() == 1) {
            z = true;
        }
        Log.m105924i("Finder.FinderPostUtil", "checkSupportWindowProduct extFlag:" + i + ", ret " + z2 + ", debugOk:" + z);
        if (z) {
            return true;
        }
        return z2;
    }

    /* renamed from: d */
    public final boolean mo89565d(String str) {
        C87412m.m108594g(str, "thumbFile");
        if (!C86013q1.m106450k(str)) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapUtil.decodeFile(str, options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    /* renamed from: e */
    public final C64689rq2 mo89566e(String str, String str2) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "thumbUrl");
        Log.m105925i("Finder.FinderPostUtil", "gen img media url %s, thumbUrl %s", str, str2);
        C64689rq2 rq22 = new C64689rq2();
        rq22.f185268f = 2;
        if (Exif.fromFile(str).getOrientationInDegree() != 0) {
            C58741j5 j5Var = C58741j5.f168184a;
            String str3 = C58741j5.f168192i + MD5Util.getMD5String(str) + '_' + C86013q1.m106452m(str) + "_rotated";
            if (C86013q1.m106450k(str3)) {
                str = str3;
            }
        }
        rq22.f185266d = str;
        rq22.f185267e = str2;
        rq22.f185239F = str2;
        rq22.f185275p = MD5Util.getMD5String(str);
        rq22.f185285x0 = C58784w3.f168295a.mo83984z1(rq22.f185267e);
        C58739j4 j4Var = C58739j4.f168176a;
        String str4 = rq22.f185266d;
        if (str4 == null) {
            str4 = "";
        }
        Point x = j4Var.mo83725x(str4);
        rq22.f185270h = (float) x.x;
        rq22.f185271i = (float) x.y;
        rq22.f185277q = 1;
        rq22.f185280t = false;
        return rq22;
    }

    /* renamed from: f */
    public final C64689rq2 mo89567f(String str, String str2, C64477jr2 jr22, String str3, String str4, C64591nr3 nr32) {
        int i;
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "thumbUrl");
        C87412m.m108594g(str3, "coverUrl");
        C87412m.m108594g(str4, "fullCoverUrl");
        Log.m105925i("Finder.FinderPostUtil", "gen video media url %s, thumbUrl %s", str, str2);
        C64689rq2 rq22 = new C64689rq2();
        rq22.f185268f = 4;
        rq22.f185266d = str;
        rq22.f185267e = str2;
        rq22.f185275p = MD5Util.getMD5String(str);
        C58784w3 w3Var = C58784w3.f168295a;
        rq22.f185285x0 = w3Var.mo83984z1(str2);
        rq22.f185273n = (int) C86013q1.m106451l(str);
        rq22.f185283w = str3;
        rq22.f185261W = str4;
        C94554a v0 = w3Var.mo83971v0(str);
        if (v0 != null) {
            rq22.f185270h = (float) v0.f273445c;
            rq22.f185271i = (float) v0.f273446d;
            rq22.f185274o = v0.f273444b;
            rq22.f185269g = v0.mo130041a();
            if (jr22 != null && (i = jr22.f183833g) > 0) {
                rq22.f185269g = i / 1000;
            }
        }
        rq22.f185277q = 1;
        if (jr22 == null) {
            rq22.f185280t = false;
        } else {
            rq22.f185280t = true;
            rq22.f185270h = (float) jr22.f183834h;
            rq22.f185271i = (float) jr22.f183835i;
            rq22.f185281u = jr22;
        }
        rq22.f185258U0 = nr32;
        return rq22;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uq1.C65449m.C65450a mo89568h(java.lang.String r23) {
        /*
            r22 = this;
            r1 = r23
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_album_device_configuration
            java.lang.String r4 = ""
            java.lang.String r0 = r0.Y60(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "Finder.FinderPostUtil"
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x0025
        L_0x0022:
            r0 = 0
            goto L_0x0106
        L_0x0025:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r8] = r0
            java.lang.String r9 = "devices configuration: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r3)
            r3 = 4
            java.lang.Object[] r9 = new java.lang.Object[r3]
            int r10 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r8] = r10
            java.lang.String r10 = android.os.Build.MANUFACTURER
            r9[r7] = r10
            java.lang.String r10 = android.os.Build.BRAND
            r9[r6] = r10
            java.lang.String r10 = p156gj.C87203t.m108275k()
            r11 = 3
            r9[r11] = r10
            java.lang.String r10 = "android version: %s, manufacturer: %s, brand: %s, model: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fc }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r0 = "devices"
            java.lang.String r0 = r9.optString(r0)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r10 = "maxsize"
            int r9 = r9.optInt(r10)     // Catch:{ JSONException -> 0x00fc }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00fc }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x00fc }
            int r0 = r10.length()     // Catch:{ JSONException -> 0x00fc }
            r12 = 0
        L_0x0068:
            if (r12 >= r0) goto L_0x0022
            org.json.JSONObject r13 = r10.optJSONObject(r12)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r14 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r15 = "brand"
            java.lang.String r15 = r13.optString(r15)     // Catch:{ JSONException -> 0x00fc }
            boolean r15 = z04.C112551y.m153809i(r14, r15, r7)     // Catch:{ JSONException -> 0x00fc }
            if (r15 == 0) goto L_0x00f6
            java.lang.String r15 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r3 = "model"
            java.lang.String r3 = r13.optString(r3)     // Catch:{ JSONException -> 0x00fc }
            boolean r3 = z04.C112551y.m153809i(r15, r3, r7)     // Catch:{ JSONException -> 0x00fc }
            if (r3 == 0) goto L_0x00f5
            long r17 = com.tencent.p014mm.vfs.C86013q1.m106451l(r23)     // Catch:{ JSONException -> 0x00fc }
            if (r9 == 0) goto L_0x00b4
            int r3 = r9 * 1024
            int r3 = r3 * 1024
            long r6 = (long) r3     // Catch:{ JSONException -> 0x00fc }
            int r3 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b4
            java.lang.String r0 = "hit devices but it is too big, fileSize: %s, maxSize: %s, filePath: %s"
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x00fc }
            java.lang.Long r6 = java.lang.Long.valueOf(r17)     // Catch:{ JSONException -> 0x00fc }
            r3[r8] = r6     // Catch:{ JSONException -> 0x00fc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ JSONException -> 0x00fc }
            r7 = 1
            r3[r7] = r6     // Catch:{ JSONException -> 0x00fc }
            r6 = 2
            r3[r6] = r1     // Catch:{ JSONException -> 0x00fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r3)     // Catch:{ JSONException -> 0x00fc }
            goto L_0x0022
        L_0x00b4:
            java.lang.String r3 = "androidVersion"
            int r3 = r13.optInt(r3)     // Catch:{ JSONException -> 0x00fc }
            r6 = -1
            if (r6 != r3) goto L_0x00d4
            java.lang.String r0 = "hit devices all version, manufacturer: %s, brand: %s, model: %s"
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x00fc }
            r3[r8] = r14     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x00fc }
            r7 = 1
            r3[r7] = r6     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r6 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x00fc }
            r7 = 2
            r3[r7] = r6     // Catch:{ JSONException -> 0x00fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r3)     // Catch:{ JSONException -> 0x00fc }
        L_0x00d2:
            r0 = 1
            goto L_0x0106
        L_0x00d4:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x00fc }
            if (r6 != r3) goto L_0x00f5
            java.lang.String r0 = "hit devices, version: %s, manufacturer: %s, brand: %s, model: %s"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ JSONException -> 0x00fc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x00fc }
            r3[r8] = r6     // Catch:{ JSONException -> 0x00fc }
            r6 = 1
            r3[r6] = r14     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x00fc }
            r7 = 2
            r3[r7] = r6     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r6 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x00fc }
            r3[r11] = r6     // Catch:{ JSONException -> 0x00fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r3)     // Catch:{ JSONException -> 0x00fc }
            goto L_0x00d2
        L_0x00f5:
            r3 = 4
        L_0x00f6:
            int r12 = r12 + 1
            r6 = 2
            r7 = 1
            goto L_0x0068
        L_0x00fc:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r6 = "parse json error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r3)
            goto L_0x0022
        L_0x0106:
            if (r0 == 0) goto L_0x010e
            uq1.m$a r0 = r22.mo89570j(r23)
            goto L_0x0266
        L_0x010e:
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_album_get_video_info
            int r0 = r0.mo58779Qe(r2, r8)
            r2 = 1
            if (r0 != r2) goto L_0x011f
            r0 = 1
            goto L_0x0120
        L_0x011f:
            r0 = 0
        L_0x0120:
            if (r0 == 0) goto L_0x0128
            uq1.m$a r0 = r22.mo89570j(r23)
            goto L_0x0266
        L_0x0128:
            java.lang.String r0 = "frame-rate"
            java.lang.String r2 = "i-frame-interval"
            java.lang.String r3 = "bitrate"
            java.lang.String r6 = "width"
            java.lang.String r7 = "height"
            java.lang.String r9 = "durationUs"
            oj.b r10 = new oj.b
            r10.<init>()
            r10.mo161392k(r1)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            int r12 = r10.mo161385d()     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            r13 = 0
            r14 = 0
            r16 = 0
        L_0x0145:
            java.lang.String r11 = "mime"
            if (r13 >= r12) goto L_0x01a2
            android.media.MediaFormat r15 = r10.mo161386e(r13)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            java.lang.String r8 = "extractor.getTrackFormat(i)"
            gy3.C87412m.m108593f(r15, r8)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            boolean r8 = r15.containsKey(r11)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            if (r8 != 0) goto L_0x0163
            java.lang.String r8 = "find video mime : not found."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r8)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            r19 = r4
            r20 = r12
            r12 = 0
            goto L_0x019a
        L_0x0163:
            java.lang.String r8 = r15.getString(r11)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            r19 = r4
            java.lang.String r4 = "find video mime : %s"
            r20 = r12
            r21 = r15
            r12 = 1
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            r12 = 0
            r15[r12] = r8     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r15)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            if (r8 != 0) goto L_0x017b
            goto L_0x019a
        L_0x017b:
            java.lang.String r4 = "video/"
            boolean r4 = z04.C112551y.m153819s(r8, r4, r12)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            if (r4 == 0) goto L_0x0189
            if (r14 != 0) goto L_0x0195
            r14 = r21
            goto L_0x0195
        L_0x0189:
            java.lang.String r4 = "audio/"
            boolean r4 = z04.C112551y.m153819s(r8, r4, r12)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            if (r4 == 0) goto L_0x0195
            if (r16 != 0) goto L_0x0195
            r16 = r21
        L_0x0195:
            if (r16 == 0) goto L_0x019a
            if (r14 == 0) goto L_0x019a
            goto L_0x01a4
        L_0x019a:
            int r13 = r13 + 1
            r4 = r19
            r12 = r20
            r8 = 0
            goto L_0x0145
        L_0x01a2:
            r19 = r4
        L_0x01a4:
            r4 = r16
            uq1.m$a r8 = new uq1.m$a     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            r8.<init>()     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            r8.f188333a = r1     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            if (r14 == 0) goto L_0x0217
            boolean r12 = r14.containsKey(r9)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            if (r12 != 0) goto L_0x01b8
            r16 = r10
            goto L_0x01c2
        L_0x01b8:
            long r12 = r14.getLong(r9)     // Catch:{ Exception -> 0x024d, all -> 0x0249 }
            r9 = 1000(0x3e8, float:1.401E-42)
            r16 = r10
            long r9 = (long) r9
            long r12 = r12 / r9
        L_0x01c2:
            boolean r9 = r14.containsKey(r7)     // Catch:{ Exception -> 0x0247 }
            if (r9 != 0) goto L_0x01ca
            r7 = 0
            goto L_0x01ce
        L_0x01ca:
            int r7 = r14.getInteger(r7)     // Catch:{ Exception -> 0x0247 }
        L_0x01ce:
            r8.f188336d = r7     // Catch:{ Exception -> 0x0247 }
            boolean r7 = r14.containsKey(r6)     // Catch:{ Exception -> 0x0247 }
            if (r7 != 0) goto L_0x01d8
            r6 = 0
            goto L_0x01dc
        L_0x01d8:
            int r6 = r14.getInteger(r6)     // Catch:{ Exception -> 0x0247 }
        L_0x01dc:
            r8.f188337e = r6     // Catch:{ Exception -> 0x0247 }
            boolean r6 = r14.containsKey(r11)     // Catch:{ Exception -> 0x0247 }
            if (r6 != 0) goto L_0x01e7
            r6 = r19
            goto L_0x01eb
        L_0x01e7:
            java.lang.String r6 = r14.getString(r11)     // Catch:{ Exception -> 0x0247 }
        L_0x01eb:
            r8.f188334b = r6     // Catch:{ Exception -> 0x0247 }
            boolean r6 = r14.containsKey(r3)     // Catch:{ Exception -> 0x0247 }
            if (r6 != 0) goto L_0x01f4
            goto L_0x01f7
        L_0x01f4:
            r14.getInteger(r3)     // Catch:{ Exception -> 0x0247 }
        L_0x01f7:
            boolean r3 = r14.containsKey(r2)     // Catch:{ Exception -> 0x0247 }
            if (r3 != 0) goto L_0x01fe
            goto L_0x0201
        L_0x01fe:
            r14.getInteger(r2)     // Catch:{ Exception -> 0x0247 }
        L_0x0201:
            boolean r2 = r14.containsKey(r0)     // Catch:{ Exception -> 0x0247 }
            if (r2 != 0) goto L_0x0208
            goto L_0x020b
        L_0x0208:
            r14.getInteger(r0)     // Catch:{ Exception -> 0x0247 }
        L_0x020b:
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r0 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0247 }
            com.tencent.mm.feature.sight.api.ISightJNIService r0 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r0     // Catch:{ Exception -> 0x0247 }
            r0.getMp4RotateVFS(r1)     // Catch:{ Exception -> 0x0247 }
            goto L_0x0219
        L_0x0217:
            r16 = r10
        L_0x0219:
            if (r4 == 0) goto L_0x022a
            boolean r0 = r4.containsKey(r11)     // Catch:{ Exception -> 0x0247 }
            if (r0 != 0) goto L_0x0224
            r4 = r19
            goto L_0x0228
        L_0x0224:
            java.lang.String r4 = r4.getString(r11)     // Catch:{ Exception -> 0x0247 }
        L_0x0228:
            r8.f188335c = r4     // Catch:{ Exception -> 0x0247 }
        L_0x022a:
            java.lang.String r0 = "loadItemFromExtractor mediaItem: %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0247 }
            r2 = 0
            r3[r2] = r8     // Catch:{ Exception -> 0x0247 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r3)     // Catch:{ Exception -> 0x0247 }
            java.lang.String r0 = "mediaItem format:%s, videoPath:%s"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0247 }
            r4[r2] = r14     // Catch:{ Exception -> 0x0247 }
            r2 = 1
            r4[r2] = r1     // Catch:{ Exception -> 0x0247 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r4)     // Catch:{ Exception -> 0x0247 }
            r16.mo161388g()
            r0 = r8
            goto L_0x0266
        L_0x0247:
            r0 = move-exception
            goto L_0x0250
        L_0x0249:
            r0 = move-exception
            r16 = r10
            goto L_0x0268
        L_0x024d:
            r0 = move-exception
            r16 = r10
        L_0x0250:
            java.lang.String r2 = "Video extractor init failed. video path = [%s] e = [%s]"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0267 }
            r4 = 0
            r3[r4] = r1     // Catch:{ all -> 0x0267 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0267 }
            r1 = 1
            r3[r1] = r0     // Catch:{ all -> 0x0267 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r3)     // Catch:{ all -> 0x0267 }
            r16.mo161388g()
            r0 = 0
        L_0x0266:
            return r0
        L_0x0267:
            r0 = move-exception
        L_0x0268:
            r16.mo161388g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uq1.C65449m.mo89568h(java.lang.String):uq1.m$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r5 != 7) goto L_0x00b3;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Point mo89569i(java.lang.String r4, int r5) {
        /*
            r3 = this;
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            int r0 = up1.C37521f.f99489q
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r1 != 0) goto L_0x00b3
            r1 = 2
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r5 == r1) goto L_0x005e
            r1 = 4
            if (r5 == r1) goto L_0x001d
            r1 = 6
            if (r5 == r1) goto L_0x001d
            r1 = 7
            if (r5 == r1) goto L_0x005e
            goto L_0x00b3
        L_0x001d:
            er1.w3 r5 = er1.C58784w3.f168295a
            gy3.C87412m.m108591d(r4)
            com.tencent.mm.plugin.sight.base.a r4 = r5.mo83971v0(r4)
            if (r4 == 0) goto L_0x00b3
            int r5 = r4.f273445c
            int r1 = r4.f273446d
            int r5 = java.lang.Math.min(r5, r1)
            int r0 = java.lang.Math.min(r5, r0)
            int r1 = r4.f273445c
            if (r5 != r1) goto L_0x004b
            android.graphics.Point r5 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r4.f273445c
            float r2 = (float) r2
            float r1 = r1 / r2
            int r4 = r4.f273446d
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = (int) r1
            r5.<init>(r0, r4)
            goto L_0x005d
        L_0x004b:
            android.graphics.Point r5 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r4.f273446d
            float r2 = (float) r2
            float r1 = r1 / r2
            int r4 = r4.f273445c
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = (int) r1
            r5.<init>(r4, r0)
        L_0x005d:
            return r5
        L_0x005e:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r1 = 1
            r5.inJustDecodeBounds = r1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r4, r5)
            com.tencent.mm.compatible.util.Exif r4 = com.tencent.p014mm.compatible.util.Exif.fromFile(r4)
            int r4 = r4.getOrientationInDegree()
            int r4 = r4 % 180
            if (r4 == 0) goto L_0x007d
            int r4 = r5.outHeight
            int r1 = r5.outWidth
            r5.outHeight = r1
            r5.outWidth = r4
        L_0x007d:
            int r4 = r5.outWidth
            int r1 = r5.outHeight
            int r4 = java.lang.Math.min(r4, r1)
            int r0 = java.lang.Math.min(r4, r0)
            int r1 = r5.outWidth
            if (r4 != r1) goto L_0x00a0
            android.graphics.Point r4 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r5.outWidth
            float r2 = (float) r2
            float r1 = r1 / r2
            int r5 = r5.outHeight
            float r5 = (float) r5
            float r1 = r1 * r5
            int r5 = (int) r1
            r4.<init>(r0, r5)
            goto L_0x00b2
        L_0x00a0:
            android.graphics.Point r4 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r5.outHeight
            float r2 = (float) r2
            float r1 = r1 / r2
            int r5 = r5.outWidth
            float r5 = (float) r5
            float r1 = r1 * r5
            int r5 = (int) r1
            r4.<init>(r5, r0)
        L_0x00b2:
            return r4
        L_0x00b3:
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r0, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uq1.C65449m.mo89569i(java.lang.String, int):android.graphics.Point");
    }

    /* renamed from: j */
    public final C65450a mo89570j(String str) {
        Class cls = ISightJNIService.class;
        try {
            String simpleMp4InfoVFS = ((ISightJNIService) C86312j.m106911c(cls)).getSimpleMp4InfoVFS(str);
            Log.m105925i("Finder.FinderPostUtil", "get simple mp4 info %s", simpleMp4InfoVFS);
            JSONObject jSONObject = new JSONObject(simpleMp4InfoVFS);
            C65450a aVar = new C65450a();
            C87412m.m108594g(str, "<set-?>");
            aVar.f188333a = str;
            jSONObject.getInt("videoDuration");
            aVar.f188336d = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            aVar.f188337e = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            jSONObject.getInt("videoBitrate");
            jSONObject.getInt("videoFPS");
            ((ISightJNIService) C86312j.m106911c(cls)).getMp4RotateVFS(str);
            aVar.f188334b = C63341j.m74673a(jSONObject.getString("videoType"));
            aVar.f188335c = C63341j.m74673a(jSONObject.getString("audioType"));
            return aVar;
        } catch (Exception e) {
            Log.printErrStackTrace("Finder.FinderPostUtil", e, "loadItemFromSimpleMP4Info fail", new Object[0]);
            return null;
        }
    }

    /* renamed from: k */
    public final void mo89571k(FinderFeedReportObject finderFeedReportObject, String str) {
        C87412m.m108594g(finderFeedReportObject, "<this>");
        C87412m.m108594g(str, "prefix");
        Log.m105924i("Finder.FinderFeedReportObject", str + " remux:" + finderFeedReportObject.mediaProcessCost + ",upload:" + finderFeedReportObject.uploadCost + ",uploadSize:" + (finderFeedReportObject.uploadMediaTotalSize / ((long) 1024)) + "KB,taskTotal:" + finderFeedReportObject.postTaskCost + ",repost:" + finderFeedReportObject.clickRepostCount);
    }

    /* renamed from: l */
    public final void mo89572l(String str, String str2, C32226l<? super C52271zj0, C13598b0> lVar) {
        C87412m.m108594g(str, "nickName");
        C87412m.m108594g(str2, "eventName");
        C87412m.m108594g(lVar, "callback");
        boolean z = true;
        if (!(str.length() == 0)) {
            if (str2.length() != 0) {
                z = false;
            }
            if (!z) {
                C115669n.INSTANCE.mo175913w(1253, 70, 1);
                new C9328k1(str, str2, (String) null, (C89349b) null, (String) null, 28, (C8480h) null).mo9225i().mo123420E(new C14372b(lVar));
                return;
            }
        }
        lVar.invoke(null);
        Log.m105924i("Finder.FinderPostUtil", "nickName or eventName is Empty");
    }
}
