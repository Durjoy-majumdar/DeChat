package cc0;

import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.map.geolocation.sapp.internal.TencentExtraKeys;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONArray;
import org.json.JSONObject;
import p702ts.C118505d;
import p702ts.C78083b;

/* renamed from: cc0.c */
public class C113265c implements C11385n, C78083b {

    /* renamed from: i */
    public static C113265c f338872i;

    /* renamed from: d */
    public C118505d f338873d = null;

    /* renamed from: e */
    public CopyOnWriteArrayList<C118505d> f338874e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    public HashMap<String, CopyOnWriteArrayList<WeakReference<C78083b.C78084a>>> f338875f = new HashMap<>();

    /* renamed from: g */
    public QueueWorkerThread f338876g = new QueueWorkerThread(1, "addr_worker");

    /* renamed from: h */
    public boolean f338877h = true;

    /* renamed from: cc0.c$a */
    public class C113266a implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public Addr f338878d = null;

        public C113266a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0259, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x025a, code lost:
            r19 = "exception:%s";
            r17 = r11;
            r18 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0263, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0264, code lost:
            r19 = "exception:%s";
            r17 = r11;
            r18 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x026d, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x026e, code lost:
            r1 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0272, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0273, code lost:
            r19 = "exception:%s";
            r17 = r11;
            r12 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x027c, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x027d, code lost:
            r19 = "exception:%s";
            r17 = r11;
            r12 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x02aa, code lost:
            if (r12 != null) goto L_0x02ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ac, code lost:
            r0 = r12;
            r12 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c9, code lost:
            if (r12 != null) goto L_0x02ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x02cc, code lost:
            r0.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d0, code lost:
            r12 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f5, code lost:
            r13.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0174, code lost:
            r18 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0184, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0185, code lost:
            r18 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0189, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x018a, code lost:
            r18 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0249, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x024b, code lost:
            r0 = e;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x026d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x0084] */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x02f5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean doInBackground() {
            /*
                r20 = this;
                r1 = r20
                cc0.c r0 = cc0.C113265c.this
                ts.d r0 = r0.f338873d
                r2 = 0
                if (r0 != 0) goto L_0x000a
                return r2
            L_0x000a:
                com.tencent.mm.modelgeo.Addr r0 = r1.f338878d
                java.lang.String r3 = ""
                r4 = 1
                if (r0 == 0) goto L_0x001f
                java.lang.String r0 = r0.f343956d
                if (r0 == 0) goto L_0x001f
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x001c
                goto L_0x001f
            L_0x001c:
                r3 = 1
                goto L_0x02ef
            L_0x001f:
                cc0.c r0 = cc0.C113265c.this
                ts.d r5 = r0.f338873d
                double r6 = r5.f354669a
                double r8 = r5.f354670b
                boolean r0 = r0.f338877h
                java.lang.String r5 = "exception:%s"
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
                com.tencent.mm.modelgeo.Addr r11 = new com.tencent.mm.modelgeo.Addr
                r11.<init>()
                java.lang.String r12 = "https://maps.google.com/maps/api/geocode/json?latlng=%f,%f&language=%s&sensor=false"
                r13 = 3
                r14 = 2
                if (r0 == 0) goto L_0x004f
                java.lang.Object[] r0 = new java.lang.Object[r13]
                java.lang.Double r15 = java.lang.Double.valueOf(r6)
                r0[r2] = r15
                java.lang.Double r15 = java.lang.Double.valueOf(r8)
                r0[r4] = r15
                r0[r14] = r10
                java.lang.String r0 = java.lang.String.format(r12, r0)
                goto L_0x0066
            L_0x004f:
                java.lang.Object[] r0 = new java.lang.Object[r13]
                java.lang.Double r15 = java.lang.Double.valueOf(r6)
                r0[r2] = r15
                java.lang.Double r15 = java.lang.Double.valueOf(r8)
                r0[r4] = r15
                java.lang.String r15 = "zh_CN"
                r0[r14] = r15
                java.lang.String r0 = java.lang.String.format(r12, r0)
            L_0x0066:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r15 = "url "
                r12.append(r15)
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                java.lang.String r15 = "MicroMsg.LocationAddr"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r12)
                r12 = 0
                com.tencent.mm.network.b0 r13 = com.tencent.p014mm.network.C81035d.m98963d(r0, r12)     // Catch:{ IOException -> 0x02b0, Exception -> 0x028e, all -> 0x0288 }
                r0 = 10000(0x2710, float:1.4013E-41)
                r13.mo112919d(r0)     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                java.lang.String r0 = "GET"
                r13.mo112930l(r0)     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                r0.<init>()     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                java.lang.String r12 = "conn "
                r0.append(r12)     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                int r12 = r13.mo112916a()     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                r0.append(r12)     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                java.io.InputStream r0 = r13.getInputStream()     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                r12.<init>(r0)     // Catch:{ IOException -> 0x027c, Exception -> 0x0272, all -> 0x026d }
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                r0.<init>(r12)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                r4.<init>()     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
            L_0x00b7:
                java.lang.String r14 = r0.readLine()     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                if (r14 == 0) goto L_0x00c1
                r4.append(r14)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                goto L_0x00b7
            L_0x00c1:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                r0.<init>()     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                java.lang.String r14 = "sb "
                r0.append(r14)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                java.lang.String r14 = r4.toString()     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                r0.append(r14)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                r0.<init>(r4)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                java.lang.String r4 = "results"
                org.json.JSONArray r0 = r0.getJSONArray(r4)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                org.json.JSONObject r4 = r0.optJSONObject(r2)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                if (r4 == 0) goto L_0x00f6
                java.lang.String r14 = "formatted_address"
                java.lang.String r14 = r4.getString(r14)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                r11.f343956d = r14     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
            L_0x00f6:
                org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch:{ IOException -> 0x0263, Exception -> 0x0259, all -> 0x026d }
                java.lang.String r14 = "types"
                if (r0 == 0) goto L_0x018e
                java.lang.String r2 = "address_components"
                org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ IOException -> 0x0189, Exception -> 0x0184, all -> 0x026d }
                r17 = r3
                r2 = 0
            L_0x0108:
                int r3 = r0.length()     // Catch:{ IOException -> 0x0189, Exception -> 0x0184, all -> 0x026d }
                if (r2 >= r3) goto L_0x017d
                org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ IOException -> 0x0189, Exception -> 0x0184, all -> 0x026d }
                r16 = r0
                java.lang.String r0 = "long_name"
                java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x0174, all -> 0x026d }
                org.json.JSONArray r3 = r3.getJSONArray(r14)     // Catch:{ Exception -> 0x0174, all -> 0x026d }
                r18 = r12
                r12 = 0
                java.lang.String r3 = r3.getString(r12)     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                java.lang.String r12 = "administrative_area_level_1"
                boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                if (r12 == 0) goto L_0x0130
                r11.f343958f = r0     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                goto L_0x0176
            L_0x0130:
                java.lang.String r12 = "locality"
                boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                if (r12 == 0) goto L_0x013b
                r11.f343959g = r0     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                goto L_0x0176
            L_0x013b:
                java.lang.String r12 = "sublocality"
                boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                if (r12 == 0) goto L_0x0147
                r11.f343961i = r0     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                goto L_0x0176
            L_0x0147:
                java.lang.String r12 = "neighborhood"
                boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                if (r12 == 0) goto L_0x0152
                r11.f343962j = r0     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                goto L_0x0176
            L_0x0152:
                java.lang.String r12 = "route"
                boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                if (r12 == 0) goto L_0x015d
                r11.f343963n = r0     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                goto L_0x0176
            L_0x015d:
                java.lang.String r12 = "street_number"
                boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                if (r12 == 0) goto L_0x0169
                r11.f343964o = r0     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                goto L_0x0176
            L_0x0169:
                java.lang.String r12 = "country"
                boolean r3 = r3.equals(r12)     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                if (r3 == 0) goto L_0x0176
                r11.f343957e = r0     // Catch:{ Exception -> 0x0176, all -> 0x026d }
                goto L_0x0176
            L_0x0174:
                r18 = r12
            L_0x0176:
                int r2 = r2 + 1
                r0 = r16
                r12 = r18
                goto L_0x0108
            L_0x017d:
                r16 = r0
                r18 = r12
                r12 = r16
                goto L_0x0193
            L_0x0184:
                r0 = move-exception
                r18 = r12
                goto L_0x024e
            L_0x0189:
                r0 = move-exception
                r18 = r12
                goto L_0x0254
            L_0x018e:
                r17 = r3
                r18 = r12
                r12 = 0
            L_0x0193:
                java.lang.String r0 = "utf-8"
                java.lang.String r2 = r11.f343956d     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                if (r2 == 0) goto L_0x01a7
                boolean r2 = r2.isEmpty()     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                if (r2 == 0) goto L_0x01a7
                java.lang.String r2 = r11.f343956d     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                goto L_0x01a9
            L_0x01a7:
                r2 = r17
            L_0x01a9:
                if (r12 == 0) goto L_0x01b4
                java.lang.String r3 = r12.toString()     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                goto L_0x01b6
            L_0x01b4:
                r3 = r17
            L_0x01b6:
                if (r4 == 0) goto L_0x01c7
                java.lang.String r12 = "geometry"
                org.json.JSONObject r12 = r4.getJSONObject(r12)     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                java.lang.String r12 = java.net.URLEncoder.encode(r12, r0)     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                goto L_0x01c9
            L_0x01c7:
                r12 = r17
            L_0x01c9:
                if (r4 == 0) goto L_0x01d6
                java.lang.String r1 = "place_id"
                java.lang.String r1 = r4.getString(r1)     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                java.lang.String r1 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                goto L_0x01d8
            L_0x01d6:
                r1 = r17
            L_0x01d8:
                if (r4 == 0) goto L_0x01e7
                org.json.JSONArray r4 = r4.getJSONArray(r14)     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                java.lang.String r4 = java.net.URLEncoder.encode(r4, r0)     // Catch:{ IOException -> 0x0253, Exception -> 0x024d, all -> 0x026d }
                goto L_0x01e9
            L_0x01e7:
                r4 = r17
            L_0x01e9:
                java.lang.String r14 = "[%f,%f]"
                r19 = r5
                r17 = r11
                r11 = 2
                java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r7 = 0
                r5[r7] = r6     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                java.lang.Double r6 = java.lang.Double.valueOf(r8)     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r7 = 1
                r5[r7] = r6     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                java.lang.String r5 = java.lang.String.format(r14, r5)     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                java.lang.String r0 = java.net.URLEncoder.encode(r5, r0)     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                java.lang.String r5 = "google report, formattedaddr: %s, componentaddr: %s, geometry: %s, placeId: %s, types: %s, location: %s, curLanguage: %s"
                r6 = 7
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r8 = 0
                r7[r8] = r2     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r8 = 1
                r7[r8] = r3     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r8 = 2
                r7[r8] = r12     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r8 = 3
                r7[r8] = r1     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r8 = 4
                r7[r8] = r4     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r9 = 5
                r7[r9] = r0     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r11 = 6
                r7[r11] = r10     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r5, r7)     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r7 = 12886(0x3256, float:1.8057E-41)
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r14 = 0
                r6[r14] = r3     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r3 = 1
                r6[r3] = r2     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r2 = 2
                r6[r2] = r12     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r2 = 3
                r6[r2] = r1     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r6[r8] = r4     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r6[r9] = r0     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r6[r11] = r10     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r5.mo160131h(r7, r6)     // Catch:{ IOException -> 0x024b, Exception -> 0x0249, all -> 0x026d }
                r13.disconnect()
                r12 = r18
                r1 = r19
                goto L_0x02d2
            L_0x0249:
                r0 = move-exception
                goto L_0x0260
            L_0x024b:
                r0 = move-exception
                goto L_0x026a
            L_0x024d:
                r0 = move-exception
            L_0x024e:
                r19 = r5
                r17 = r11
                goto L_0x0260
            L_0x0253:
                r0 = move-exception
            L_0x0254:
                r19 = r5
                r17 = r11
                goto L_0x026a
            L_0x0259:
                r0 = move-exception
                r19 = r5
                r17 = r11
                r18 = r12
            L_0x0260:
                r12 = r18
                goto L_0x0278
            L_0x0263:
                r0 = move-exception
                r19 = r5
                r17 = r11
                r18 = r12
            L_0x026a:
                r12 = r18
                goto L_0x0282
            L_0x026d:
                r0 = move-exception
                r1 = r20
                goto L_0x02f3
            L_0x0272:
                r0 = move-exception
                r19 = r5
                r17 = r11
                r12 = 0
            L_0x0278:
                r16 = r12
                r12 = r13
                goto L_0x0296
            L_0x027c:
                r0 = move-exception
                r19 = r5
                r17 = r11
                r12 = 0
            L_0x0282:
                r16 = r12
                r12 = r13
                r1 = r19
                goto L_0x02b7
            L_0x0288:
                r0 = move-exception
                r12 = 0
            L_0x028a:
                r1 = r20
                goto L_0x02f2
            L_0x028e:
                r0 = move-exception
                r19 = r5
                r17 = r11
                r12 = 0
                r16 = 0
            L_0x0296:
                java.lang.String r1 = "error Exception"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)     // Catch:{ all -> 0x02f0 }
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x02f0 }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x02f0 }
                r1 = 0
                r2[r1] = r0     // Catch:{ all -> 0x02f0 }
                r1 = r19
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r2)     // Catch:{ all -> 0x02f0 }
                if (r12 == 0) goto L_0x02d0
            L_0x02ac:
                r0 = r12
                r12 = r16
                goto L_0x02cc
            L_0x02b0:
                r0 = move-exception
                r1 = r5
                r17 = r11
                r12 = 0
                r16 = 0
            L_0x02b7:
                java.lang.String r2 = "error e"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r2)     // Catch:{ all -> 0x02f0 }
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x02f0 }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x02f0 }
                r2 = 0
                r3[r2] = r0     // Catch:{ all -> 0x02f0 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r3)     // Catch:{ all -> 0x02f0 }
                if (r12 == 0) goto L_0x02d0
                goto L_0x02ac
            L_0x02cc:
                r0.disconnect()
                goto L_0x02d2
            L_0x02d0:
                r12 = r16
            L_0x02d2:
                if (r12 == 0) goto L_0x02e8
                r12.close()     // Catch:{ IOException -> 0x02d8 }
                goto L_0x02e8
            L_0x02d8:
                r0 = move-exception
                r2 = r0
                r3 = 1
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
                r4 = 0
                r0[r4] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r0)
                goto L_0x02e9
            L_0x02e8:
                r3 = 1
            L_0x02e9:
                r1 = r20
                r2 = r17
                r1.f338878d = r2
            L_0x02ef:
                return r3
            L_0x02f0:
                r0 = move-exception
                goto L_0x028a
            L_0x02f2:
                r13 = r12
            L_0x02f3:
                if (r13 == 0) goto L_0x02f8
                r13.disconnect()
            L_0x02f8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cc0.C113265c.C113266a.doInBackground():boolean");
        }

        public boolean onPostExecute() {
            C113265c cVar = C113265c.this;
            cVar.f338877h = true;
            cVar.mo165812c(this.f338878d);
            return true;
        }
    }

    static {
        WeChatHosts.domainString(C0966R.string.flt);
    }

    /* renamed from: a */
    public boolean mo108054a(C118505d dVar, C78083b.C78084a aVar) {
        boolean z;
        Object obj;
        Object obj2 = dVar.f354674f;
        if (obj2 != null) {
            Iterator<C118505d> it = this.f338874e.iterator();
            while (true) {
                if (it.hasNext()) {
                    C118505d next = it.next();
                    if (next != null && (obj = next.f354674f) != null && obj.equals(obj2)) {
                        this.f338874e.remove(next);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f338875f.get(dVar.toString());
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
        }
        Iterator it4 = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z = false;
                break;
            }
            WeakReference weakReference = (WeakReference) it4.next();
            if (weakReference != null && weakReference.get() != null && ((C78083b.C78084a) weakReference.get()).equals(aVar)) {
                z = true;
                break;
            }
        }
        if (!z) {
            copyOnWriteArrayList.add(new WeakReference(aVar));
        }
        this.f338875f.put(dVar.toString(), copyOnWriteArrayList);
        Iterator<C118505d> it5 = this.f338874e.iterator();
        while (it5.hasNext()) {
            if (it5.next().equals(dVar)) {
                mo165813d();
                return false;
            }
        }
        C118505d dVar2 = this.f338873d;
        if (dVar2 != null && dVar.equals(dVar2)) {
            return false;
        }
        this.f338874e.add(dVar);
        Log.m105925i("MicroMsg.LocationAddr", "push task size %d listeners %d", Integer.valueOf(this.f338874e.size()), Integer.valueOf(this.f338875f.size()));
        while (this.f338874e.size() > 30) {
            Log.m105924i("MicroMsg.LocationAddr", "force remove task");
            C118505d remove = this.f338874e.remove(0);
            if (remove != null) {
                this.f338875f.remove(remove.toString());
            }
        }
        mo165813d();
        return true;
    }

    /* renamed from: b */
    public boolean mo108055b(C78083b.C78084a aVar) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (String next : this.f338875f.keySet()) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f338875f.get(next);
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        if (weakReference != null && weakReference.get() != null && ((C78083b.C78084a) weakReference.get()).equals(aVar)) {
                            copyOnWriteArrayList.remove(weakReference);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.f338875f.put(next, copyOnWriteArrayList);
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
                linkedList2.add(next);
            }
        }
        Iterator it4 = linkedList2.iterator();
        while (it4.hasNext()) {
            this.f338875f.remove((String) it4.next());
        }
        Iterator<C118505d> it5 = this.f338874e.iterator();
        while (it5.hasNext()) {
            C118505d next2 = it5.next();
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f338875f.get(next2.toString());
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() == 0) {
                linkedList.add(next2);
                this.f338875f.remove(next2.toString());
            }
        }
        Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            this.f338874e.remove((C118505d) it6.next());
        }
        Log.m105925i("MicroMsg.LocationAddr", "remove taskLists %d listeners size %d", Integer.valueOf(this.f338874e.size()), Integer.valueOf(this.f338875f.size()));
        return true;
    }

    /* renamed from: c */
    public final void mo165812c(Addr addr) {
        if (this.f338873d != null) {
            if (addr == null) {
                addr = new Addr();
            }
            C118505d dVar = this.f338873d;
            Object obj = dVar.f354674f;
            if (obj == null) {
                obj = new Object();
            }
            addr.f343972w = obj;
            addr.f343969t = (float) dVar.f354669a;
            addr.f343970u = (float) dVar.f354670b;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f338875f.get(dVar.toString());
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (!(weakReference == null || weakReference.get() == null)) {
                        ((C78083b.C78084a) weakReference.get()).onLocationAddr(addr);
                    }
                }
            }
            this.f338875f.remove(this.f338873d.toString());
            Log.m105919d("MicroMsg.LocationAddr", "postexecute2 listeners %d", Integer.valueOf(this.f338875f.size()));
            this.f338873d = null;
            mo165813d();
            if (this.f338873d == null && this.f338874e.size() > 0) {
                C86709a0.m107524d().mo123470p(JsApiAddDownloadTaskForNative.CTRL_INDEX, this);
                C86709a0.m107524d().mo123470p(WearableStatusCodes.ASSET_UNAVAILABLE, this);
            }
        }
    }

    /* renamed from: d */
    public final void mo165813d() {
        CopyOnWriteArrayList<C118505d> copyOnWriteArrayList;
        if (this.f338873d == null && (copyOnWriteArrayList = this.f338874e) != null && copyOnWriteArrayList.size() > 0) {
            this.f338873d = this.f338874e.remove(0);
            C86709a0.m107524d().mo123455a(JsApiAddDownloadTaskForNative.CTRL_INDEX, this);
            C86709a0.m107524d().mo123455a(WearableStatusCodes.ASSET_UNAVAILABLE, this);
            if (this.f338873d.f354675g) {
                C89137b0 d = C86709a0.m107524d();
                C118505d dVar = this.f338873d;
                d.mo123460f(new C39943f(dVar.f354669a, dVar.f354670b, dVar.f354671c));
                return;
            }
            C86709a0.m107524d().mo123460f(new C39942e(this.f338873d));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Addr addr = null;
        if (yVar.getType() == 4005) {
            C39943f fVar = (C39943f) yVar;
            if (!Util.isNullOrNil(fVar.f107084f)) {
                Addr addr2 = new Addr();
                try {
                    Log.m105919d("MicroMsg.NetSceneGetAddress", "tofutest retJson: %s", fVar.f107084f);
                    JSONObject jSONObject = new JSONObject(fVar.f107084f);
                    addr2.f343968s = jSONObject.optString("request_id");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                    JSONObject optJSONObject3 = jSONObject2.optJSONObject("address_component");
                    if (optJSONObject3 != null) {
                        addr2.f343957e = optJSONObject3.optString(TencentExtraKeys.LOCATION_KEY_NATION);
                        addr2.f343958f = optJSONObject3.optString("province", optJSONObject3.optString("ad_level_1"));
                        addr2.f343959g = optJSONObject3.optString("city", optJSONObject3.optString("ad_level_2"));
                        addr2.f343961i = optJSONObject3.optString("district");
                        addr2.f343962j = "";
                        addr2.f343963n = optJSONObject3.optString("street");
                        addr2.f343964o = optJSONObject3.optString("street_number");
                    }
                    JSONObject optJSONObject4 = jSONObject2.optJSONObject("formatted_addresses");
                    if (optJSONObject4 != null) {
                        addr2.f343956d = optJSONObject4.optString("recommend");
                        addr2.f343966q = optJSONObject4.optString("rough");
                    } else {
                        JSONObject optJSONObject5 = jSONObject2.optJSONObject("address_component");
                        if (optJSONObject5 != null) {
                            String optString = optJSONObject5.optString("street_number");
                            addr2.f343956d = optString;
                            if (Util.isNullOrNil(optString)) {
                                addr2.f343956d = optJSONObject5.optString("street");
                            }
                            if (Util.isNullOrNil(addr2.f343956d)) {
                                addr2.f343956d = optJSONObject5.optString("ad_level_3");
                            }
                            if (Util.isNullOrNil(addr2.f343956d)) {
                                addr2.f343956d = optJSONObject5.optString("ad_level_2");
                            }
                            if (Util.isNullOrNil(addr2.f343956d)) {
                                addr2.f343956d = optJSONObject5.optString("ad_level_1");
                            }
                        }
                    }
                    if (!Util.isNullOrNil(addr2.f343964o)) {
                        addr2.f343963n = "";
                    }
                    JSONObject optJSONObject6 = jSONObject2.optJSONObject("address_reference");
                    if (!(optJSONObject6 == null || (optJSONObject2 = optJSONObject6.optJSONObject("town")) == null)) {
                        addr2.f343965p = optJSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        addr2.f343971v = optJSONObject2.optString("id");
                    }
                    if (Util.isNullOrNil(addr2.f343971v) && (optJSONObject = jSONObject2.optJSONObject("ad_info")) != null) {
                        addr2.f343971v = optJSONObject.optString("adcode");
                    }
                    addr = addr2;
                } catch (Exception unused) {
                }
            }
        } else if (yVar.getType() == 655) {
            C39942e eVar = (C39942e) yVar;
            if (!Util.isNullOrNil(eVar.f107081f)) {
                Addr addr3 = new Addr();
                Log.m105919d("MicroMsg.NetSceneGetAddress", "tofutest retJson: %s", eVar.f107081f);
                JSONObject jSONObject3 = new JSONObject(eVar.f107081f);
                addr3.f343968s = jSONObject3.optString("request_id");
                JSONArray jSONArray = jSONObject3.getJSONArray("results");
                JSONObject jSONObject4 = jSONArray.getJSONObject(1);
                addr3.f343956d = jSONObject4.getString("address_name");
                addr3.f343973x = jSONObject4.getString("address_name_id");
                JSONObject jSONObject5 = jSONArray.getJSONObject(0);
                addr3.f343958f = jSONObject5.getString("p");
                addr3.f343974y = jSONObject5.getString("city_code");
                addr3.f343959g = jSONObject5.getString("c");
                addr3.f343961i = jSONObject5.getString("d");
                addr3.f343962j = "";
                addr3.f343963n = "";
                addr3.f343964o = "";
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    try {
                        JSONObject jSONObject6 = jSONArray.getJSONObject(i3);
                        String string = jSONObject6.getString("dtype");
                        if ("ST".equals(string)) {
                            addr3.f343963n = jSONObject6.getString("name");
                        } else if ("ST_NO".equals(string)) {
                            addr3.f343964o = jSONObject6.getString("name");
                        }
                        if ("FORMAT_ADDRESS".equals(string)) {
                            addr3.f343966q = jSONObject6.getString("rough_address_name");
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (!Util.isNullOrNil(addr3.f343964o)) {
                    addr3.f343963n = "";
                }
                addr = addr3;
            }
        }
        if (addr == null || (str2 = addr.f343956d) == null || str2.equals("")) {
            this.f338876g.add(new C113266a());
        } else {
            mo165812c(addr);
        }
    }
}
