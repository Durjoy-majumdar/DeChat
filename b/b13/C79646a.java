package b13;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.traceroute.p115ui.C85498d;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import p206nj.C88956h;
import p823sg.C118283d;
import p823sg.C90193h;
import p823sg.C90197s;
import qe3.C89625d;

/* renamed from: b13.a */
public class C79646a {

    /* renamed from: i */
    public static String f233538i;

    /* renamed from: j */
    public static C79661d f233539j;

    /* renamed from: a */
    public boolean f233540a = false;

    /* renamed from: b */
    public C79653g f233541b = new C79653g((C79647a) null);

    /* renamed from: c */
    public Map<String, Set<Integer>> f233542c = new HashMap();

    /* renamed from: d */
    public String f233543d;

    /* renamed from: e */
    public C79652f f233544e;

    /* renamed from: f */
    public C79651e f233545f;

    /* renamed from: g */
    public C79650d f233546g;

    /* renamed from: h */
    public C79649c f233547h;

    /* renamed from: b13.a$b */
    public class C79648b implements Runnable {

        /* renamed from: d */
        public String f233548d;

        /* renamed from: e */
        public Set<Integer> f233549e;

        public C79648b(String str, Set<Integer> set) {
            this.f233548d = str;
            this.f233549e = set;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00fb A[SYNTHETIC, Splitter:B:27:0x00fb] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0154 A[SYNTHETIC, Splitter:B:36:0x0154] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x01af A[SYNTHETIC, Splitter:B:45:0x01af] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01d7 A[SYNTHETIC, Splitter:B:51:0x01d7] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0021 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0021 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0021 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r21 = this;
                r1 = r21
                r2 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r4 = r1.f233548d
                r5 = 0
                r0[r5] = r4
                java.lang.String r4 = "connect %s: "
                java.lang.String r0 = java.lang.String.format(r4, r0)
                b13.a r4 = b13.C79646a.this
                java.lang.String r6 = r1.f233548d
                r4.mo109777d(r6, r0, r3)
                java.util.Set<java.lang.Integer> r0 = r1.f233549e
                java.util.Iterator r4 = r0.iterator()
            L_0x0021:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x01f9
                java.lang.Object r0 = r4.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                b13.a r6 = b13.C79646a.this
                java.lang.String r7 = r1.f233548d
                int r8 = r0.intValue()
                r6.getClass()
                java.lang.String r9 = "connect err:"
                java.lang.String r10 = "close err: "
                java.lang.String r11 = ""
                java.lang.String r12 = "MicroMsg.MMTraceRoute"
                r13 = 2
                r14 = 0
                java.net.Socket r15 = new java.net.Socket     // Catch:{ UnknownHostException -> 0x0178, IOException -> 0x011f, Exception -> 0x00c6 }
                r15.<init>()     // Catch:{ UnknownHostException -> 0x0178, IOException -> 0x011f, Exception -> 0x00c6 }
                r0 = 5000(0x1388, float:7.006E-42)
                r15.setSoTimeout(r0)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                long r16 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                r0.<init>(r7, r8)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                r15.connect(r0)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                long r18 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                r0.<init>()     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                java.lang.String r14 = "connect success"
                r0.append(r14)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                r0.append(r7)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                java.lang.String r14 = ":"
                r0.append(r14)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                r0.append(r8)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                java.lang.String r0 = r0.toString()     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                java.lang.String r0 = "port = %d, time = %dms "
                java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                java.lang.Integer r20 = java.lang.Integer.valueOf(r8)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                r14[r5] = r20     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                long r18 = r18 - r16
                java.lang.Long r16 = java.lang.Long.valueOf(r18)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                r14[r2] = r16     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                java.lang.String r0 = java.lang.String.format(r0, r14)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                r6.mo109777d(r7, r0, r3)     // Catch:{ UnknownHostException -> 0x00bf, IOException -> 0x00bc, Exception -> 0x00b9, all -> 0x00b5 }
                r15.close()     // Catch:{ IOException -> 0x0096 }
                goto L_0x0021
            L_0x0096:
                r0 = move-exception
                r6 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                java.lang.String r7 = r6.getMessage()
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r6, r11, r0)
                goto L_0x0021
            L_0x00b5:
                r0 = move-exception
                r2 = r0
                goto L_0x01d5
            L_0x00b9:
                r0 = move-exception
                r14 = r15
                goto L_0x00c7
            L_0x00bc:
                r0 = move-exception
                r14 = r15
                goto L_0x0120
            L_0x00bf:
                r0 = move-exception
                r14 = r15
                goto L_0x0179
            L_0x00c3:
                r0 = move-exception
                goto L_0x01d3
            L_0x00c6:
                r0 = move-exception
            L_0x00c7:
                java.lang.String r15 = "connect err; Exception: port = %d, errmsg: %s"
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x00c3 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00c3 }
                r13[r5] = r8     // Catch:{ all -> 0x00c3 }
                java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x00c3 }
                r13[r2] = r8     // Catch:{ all -> 0x00c3 }
                java.lang.String r8 = java.lang.String.format(r15, r13)     // Catch:{ all -> 0x00c3 }
                r6.mo109777d(r7, r8, r3)     // Catch:{ all -> 0x00c3 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
                r6.<init>()     // Catch:{ all -> 0x00c3 }
                r6.append(r9)     // Catch:{ all -> 0x00c3 }
                java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x00c3 }
                r6.append(r7)     // Catch:{ all -> 0x00c3 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00c3 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r6)     // Catch:{ all -> 0x00c3 }
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c3 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r11, r6)     // Catch:{ all -> 0x00c3 }
                if (r14 == 0) goto L_0x0021
                r14.close()     // Catch:{ IOException -> 0x0100 }
                goto L_0x0021
            L_0x0100:
                r0 = move-exception
                r6 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                java.lang.String r7 = r6.getMessage()
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r6, r11, r0)
                goto L_0x0021
            L_0x011f:
                r0 = move-exception
            L_0x0120:
                java.lang.String r15 = "connect err; IOException: port = %d, errmsg: %s"
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x00c3 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00c3 }
                r13[r5] = r8     // Catch:{ all -> 0x00c3 }
                java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x00c3 }
                r13[r2] = r8     // Catch:{ all -> 0x00c3 }
                java.lang.String r8 = java.lang.String.format(r15, r13)     // Catch:{ all -> 0x00c3 }
                r6.mo109777d(r7, r8, r3)     // Catch:{ all -> 0x00c3 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
                r6.<init>()     // Catch:{ all -> 0x00c3 }
                r6.append(r9)     // Catch:{ all -> 0x00c3 }
                java.lang.String r7 = r0.getMessage()     // Catch:{ all -> 0x00c3 }
                r6.append(r7)     // Catch:{ all -> 0x00c3 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00c3 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r6)     // Catch:{ all -> 0x00c3 }
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c3 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r11, r6)     // Catch:{ all -> 0x00c3 }
                if (r14 == 0) goto L_0x0021
                r14.close()     // Catch:{ IOException -> 0x0159 }
                goto L_0x0021
            L_0x0159:
                r0 = move-exception
                r6 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                java.lang.String r7 = r6.getMessage()
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r6, r11, r0)
                goto L_0x0021
            L_0x0178:
                r0 = move-exception
            L_0x0179:
                java.lang.String r9 = "connect err; UnknownHostException: port = %d, errmsg: %s"
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x00c3 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00c3 }
                r13[r5] = r8     // Catch:{ all -> 0x00c3 }
                java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x00c3 }
                r13[r2] = r8     // Catch:{ all -> 0x00c3 }
                java.lang.String r8 = java.lang.String.format(r9, r13)     // Catch:{ all -> 0x00c3 }
                r6.mo109777d(r7, r8, r3)     // Catch:{ all -> 0x00c3 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
                r6.<init>()     // Catch:{ all -> 0x00c3 }
                java.lang.String r7 = "connect err: "
                r6.append(r7)     // Catch:{ all -> 0x00c3 }
                java.lang.String r7 = r0.getMessage()     // Catch:{ all -> 0x00c3 }
                r6.append(r7)     // Catch:{ all -> 0x00c3 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00c3 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r6)     // Catch:{ all -> 0x00c3 }
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c3 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r11, r6)     // Catch:{ all -> 0x00c3 }
                if (r14 == 0) goto L_0x0021
                r14.close()     // Catch:{ IOException -> 0x01b4 }
                goto L_0x0021
            L_0x01b4:
                r0 = move-exception
                r6 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                java.lang.String r7 = r6.getMessage()
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r6, r11, r0)
                goto L_0x0021
            L_0x01d3:
                r2 = r0
                r15 = r14
            L_0x01d5:
                if (r15 == 0) goto L_0x01f8
                r15.close()     // Catch:{ IOException -> 0x01db }
                goto L_0x01f8
            L_0x01db:
                r0 = move-exception
                r3 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                java.lang.String r4 = r3.getMessage()
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r3, r11, r0)
            L_0x01f8:
                throw r2
            L_0x01f9:
                b13.a r0 = b13.C79646a.this
                java.lang.String r2 = r1.f233548d
                java.lang.String r4 = "\n"
                r0.mo109777d(r2, r4, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b13.C79646a.C79648b.run():void");
        }
    }

    /* renamed from: b13.a$c */
    public interface C79649c {
    }

    /* renamed from: b13.a$d */
    public interface C79650d {
    }

    /* renamed from: b13.a$e */
    public interface C79651e {
    }

    /* renamed from: b13.a$f */
    public interface C79652f {
    }

    /* renamed from: b13.a$g */
    public class C79653g extends ConcurrentHashMap<String, ConcurrentHashMap<Integer, StringBuilder>> {
        public C79653g(C79647a aVar) {
            WeChatHosts.domainString(C0966R.string.fmp);
        }

        /* renamed from: a */
        public static void m96751a(C79653g gVar, String str, byte[] bArr) {
            int i = 3;
            while (true) {
                int i2 = i - 1;
                if (i > 0) {
                    gVar.getClass();
                    DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                    HttpPost httpPost = new HttpPost(str);
                    try {
                        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(bArr);
                        byteArrayEntity.setContentType("binary/octet-stream");
                        httpPost.setEntity(byteArrayEntity);
                        Log.m105924i("MicroMsg.MMTraceRoute", "http pose returnContent : " + Util.convertStreamToString(defaultHttpClient.execute(httpPost).getEntity().getContent()));
                        C79646a.m96747b(C79646a.this);
                        return;
                    } catch (IllegalStateException e) {
                        Log.m105920e("MicroMsg.MMTraceRoute", "http post IllegalStateException: " + e.getMessage());
                        Log.printErrStackTrace("MicroMsg.MMTraceRoute", e, "", new Object[0]);
                    } catch (IOException e2) {
                        Log.m105920e("MicroMsg.MMTraceRoute", "http post IOException: " + e2.getMessage());
                        Log.printErrStackTrace("MicroMsg.MMTraceRoute", e2, "", new Object[0]);
                    }
                } else {
                    C79646a.m96746a(C79646a.this);
                    return;
                }
                i = i2;
            }
        }

        /* renamed from: b */
        public void mo109780b() {
            Map map;
            String str;
            C86009m1 m1Var = new C86009m1(C79646a.f233538i);
            if (!m1Var.mo119967g()) {
                try {
                    m1Var.mo119964e();
                    C86013q1.m106440a(C79646a.f233538i, (C79646a.this.f233543d + "\n").getBytes());
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.MMTraceRoute", "create log file err " + e.getMessage());
                    Log.printErrStackTrace("MicroMsg.MMTraceRoute", e, "", new Object[0]);
                    C79646a.m96746a(C79646a.this);
                    return;
                }
            }
            for (Map.Entry key : C79646a.this.f233541b.entrySet()) {
                String str2 = (String) key.getKey();
                if (!Util.isNullOrNil(str2) && C79646a.this.f233541b.containsKey(str2) && (map = (Map) C79646a.this.f233541b.get(str2)) != null) {
                    if (map.size() != 1 || map.get(1) == null) {
                        String str3 = "";
                        boolean z = false;
                        for (int i = 0; i < map.size() && !z; i++) {
                            if (map.get(Integer.valueOf(i)) != null) {
                                String sb = ((StringBuilder) map.get(Integer.valueOf(i))).toString();
                                if (!Util.isNullOrNil(sb)) {
                                    str3 = str3 + sb;
                                    if (sb.contains("FIN")) {
                                        z = true;
                                    }
                                }
                            }
                        }
                        str = str3;
                    } else {
                        str = "" + ((StringBuilder) map.get(1)).toString();
                    }
                    if (str.length() > 0) {
                        Log.m105924i("MicroMsg.MMTraceRoute", str2 + str);
                        C86013q1.m106440a(C79646a.f233538i, str.getBytes());
                    }
                }
            }
            byte[] O = C86013q1.m106433O(C79646a.f233538i, 0, -1);
            if (Util.isNullOrNil(O)) {
                Log.m105920e("MicroMsg.MMTraceRoute", "read log failed");
                C79646a.m96746a(C79646a.this);
                return;
            }
            int length = O.length;
            String lowerCase = C90193h.m112878f(String.format("weixin#$()%d%d", new Object[]{Integer.valueOf(C89625d.f257841g), Integer.valueOf(length)}).getBytes()).toLowerCase();
            byte[] a = C90197s.m112889a(O);
            PByteArray pByteArray = new PByteArray();
            C118283d.m166849b(pByteArray, a, lowerCase.getBytes());
            ThreadPool.post(new C79658b(this, length, lowerCase, pByteArray), "MMTraceRoute_uploadLog");
        }
    }

    /* renamed from: b13.a$h */
    public class C79654h implements Runnable {

        /* renamed from: d */
        public String f233552d;

        /* renamed from: e */
        public String f233553e;

        /* renamed from: f */
        public Integer f233554f;

        public C79654h(String str, String str2, boolean z, Integer num) {
            this.f233552d = str;
            this.f233553e = str2;
            this.f233554f = num;
        }

        public void run() {
            String str;
            C79646a aVar = C79646a.this;
            String str2 = this.f233552d;
            String str3 = this.f233553e;
            Integer num = this.f233554f;
            aVar.getClass();
            for (int i = 1; i <= 3; i++) {
                ArrayList arrayList = (ArrayList) C79659c.m96756d(new String[]{"ping", "-c 1", "-t " + String.valueOf(64), str2});
                if (arrayList.size() == 2) {
                    String str4 = (String) arrayList.get(0);
                    if (Util.isNullOrNil(str4)) {
                        Log.m105920e("MicroMsg.MMTraceRoute", "runcommand err " + str2);
                        aVar.mo109777d(str3, "run command err ", num);
                    } else {
                        String obj = arrayList.get(1).toString();
                        if (C79659c.m96755c(str4) > 0) {
                            String b = C79659c.m96754b(str4, true);
                            if (!Util.isNullOrNil(b)) {
                                str = String.format(" %sms ", new Object[]{b});
                            } else if (!Util.isNullOrNil(obj)) {
                                str = String.format(" %sms ", new Object[]{obj});
                            } else {
                                str = String.format("unable to get time", new Object[0]);
                            }
                        } else {
                            str = String.format(" router no response ", new Object[0]);
                        }
                        if (i == 3) {
                            str = str + "\n";
                        }
                        aVar.mo109777d(str3, str, num);
                    }
                } else if (i == 3) {
                    aVar.mo109777d(str3, " router no response\n", num);
                } else {
                    aVar.mo109777d(str3, " router no response", num);
                }
            }
        }
    }

    /* renamed from: b13.a$i */
    public class C79655i implements Runnable {

        /* renamed from: d */
        public String f233556d;

        /* renamed from: e */
        public int f233557e;

        public C79655i(String str, int i) {
            this.f233556d = str;
            this.f233557e = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0095, code lost:
            r12 = r2.indexOf(" ", r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x009f, code lost:
            r12 = r2.indexOf(com.tencent.xweb.file.XVFSFile.PATH_SEPARATOR, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a6, code lost:
            r12 = r12 + 1;
            r6 = r2.indexOf(" ", r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x008c, code lost:
            r6 = r2.indexOf("from ");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r14 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ttl= "
                r0.append(r1)
                int r1 = r14.f233557e
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.MMTraceRoute"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                b13.a r3 = b13.C79646a.this
                java.lang.String r5 = r14.f233556d
                int r0 = r14.f233557e
                r3.getClass()
                r2 = 4
                java.lang.String[] r2 = new java.lang.String[r2]
                r4 = 0
                java.lang.String r6 = "ping"
                r2[r4] = r6
                java.lang.String r6 = "-c 1"
                r7 = 1
                r2[r7] = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "-t "
                r6.append(r8)
                java.lang.String r8 = java.lang.String.valueOf(r0)
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                r8 = 2
                r2[r8] = r6
                r6 = 3
                r2[r6] = r5
                java.util.List r2 = b13.C79659c.m96756d(r2)
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                int r6 = r2.size()
                java.lang.String r9 = "%d : can not get roupter ip\n"
                if (r6 == r8) goto L_0x006f
                java.lang.Object[] r1 = new java.lang.Object[r7]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r1[r4] = r2
                java.lang.String r1 = java.lang.String.format(r9, r1)
                int r0 = r0 + r7
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3.mo109777d(r5, r1, r0)
                goto L_0x0171
            L_0x006f:
                java.lang.Object r2 = r2.get(r4)
                java.lang.String r2 = (java.lang.String) r2
                int r6 = r2.length()
                if (r6 != 0) goto L_0x0083
                java.lang.String r0 = "runcommand err"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                goto L_0x0171
            L_0x0083:
                java.lang.String r6 = "From "
                int r6 = r2.indexOf(r6)
                r10 = 0
                if (r6 >= 0) goto L_0x0095
                java.lang.String r6 = "from "
                int r6 = r2.indexOf(r6)
                if (r6 >= 0) goto L_0x0095
                goto L_0x00ad
            L_0x0095:
                java.lang.String r11 = " "
                int r12 = r2.indexOf(r11, r6)
                java.lang.String r13 = ":"
                if (r12 >= 0) goto L_0x00a6
                int r12 = r2.indexOf(r13, r6)
                if (r12 >= 0) goto L_0x00a6
                goto L_0x00ad
            L_0x00a6:
                int r12 = r12 + r7
                int r6 = r2.indexOf(r11, r12)
                if (r6 >= 0) goto L_0x00af
            L_0x00ad:
                r6 = r10
                goto L_0x00b9
            L_0x00af:
                java.lang.String r6 = r2.substring(r12, r6)
                java.lang.String r10 = ""
                java.lang.String r6 = r6.replace(r13, r10)
            L_0x00b9:
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r10 == 0) goto L_0x00f1
                int r2 = b13.C79659c.m96755c(r2)
                if (r2 <= 0) goto L_0x00c7
                goto L_0x0171
            L_0x00c7:
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r2[r4] = r6
                java.lang.String r2 = java.lang.String.format(r9, r2)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "can not get setData ip and ttl"
                r4.append(r6)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
                int r0 = r0 + r7
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3.mo109777d(r5, r2, r0)
                goto L_0x0171
            L_0x00f1:
                boolean r1 = r5.equals(r6)
                if (r1 == 0) goto L_0x0110
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r1[r4] = r2
                r1[r7] = r6
                java.lang.String r2 = "%d : FIN %s\n\n"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                int r0 = r0 + r7
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3.mo109777d(r5, r1, r0)
                goto L_0x0171
            L_0x0110:
                int r1 = b13.C79659c.m96755c(r2)
                if (r1 <= 0) goto L_0x0144
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r1[r4] = r2
                r1[r7] = r6
                java.lang.String r2 = "%d : FIN %s\n\n "
                java.lang.String r1 = java.lang.String.format(r2, r1)
                int r0 = r0 + r7
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r3.mo109777d(r5, r1, r2)
                b13.d r1 = b13.C79646a.f233539j
                if (r1 == 0) goto L_0x0171
                b13.a$h r8 = new b13.a$h
                r7 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = r8
                r4 = r6
                r6 = r7
                r7 = r0
                r2.<init>(r4, r5, r6, r7)
                r1.execute(r8)
                goto L_0x0171
            L_0x0144:
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r1[r4] = r2
                r1[r7] = r6
                java.lang.String r2 = "%d : %s"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                int r0 = r0 + r7
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r3.mo109777d(r5, r1, r2)
                b13.d r1 = b13.C79646a.f233539j
                if (r1 == 0) goto L_0x0171
                b13.a$h r8 = new b13.a$h
                r7 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = r8
                r4 = r6
                r6 = r7
                r7 = r0
                r2.<init>(r4, r5, r6, r7)
                r1.execute(r8)
            L_0x0171:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b13.C79646a.C79655i.run():void");
        }
    }

    /* renamed from: b13.a$j */
    public class C79656j implements Runnable {

        /* renamed from: d */
        public String f233559d;

        public C79656j(String str) {
            this.f233559d = str;
        }

        public void run() {
            String str;
            boolean z;
            int i = 1;
            StringBuilder sb = new StringBuilder();
            sb.append("-t ");
            int i2 = 64;
            sb.append(String.valueOf(64));
            ArrayList arrayList = (ArrayList) C79659c.m96756d(new String[]{"ping", "-c 1", sb.toString(), this.f233559d});
            if (arrayList.size() != 2) {
                C79646a aVar = C79646a.this;
                String str2 = this.f233559d;
                aVar.mo109777d(str2, "failed to ping: \n" + this.f233559d, 0);
                return;
            }
            String str3 = (String) arrayList.get(0);
            if (Util.isNullOrNil(str3)) {
                C79646a aVar2 = C79646a.this;
                String str4 = this.f233559d;
                aVar2.mo109777d(str4, "failed to ping: \n" + this.f233559d, 0);
                Log.m105920e("MicroMsg.MMTraceRoute", "runcommand err");
                return;
            }
            int c = C79659c.m96755c(str3);
            if (c <= 0) {
                Log.m105920e("MicroMsg.MMTraceRoute", "failed to touch server:" + this.f233559d);
                C79646a aVar3 = C79646a.this;
                String str5 = this.f233559d;
                aVar3.mo109777d(str5, "failed to touch server: " + this.f233559d + "\n", 0);
                return;
            }
            String obj = arrayList.get(1).toString();
            String b = C79659c.m96754b(str3, true);
            if (!Util.isNullOrNil(b)) {
                str = String.format("server: %s, TTL: %d, Time = %sms", new Object[]{this.f233559d, Integer.valueOf(c), b});
            } else if (!Util.isNullOrNil(obj)) {
                str = String.format("server: %s, TTL: %d, Time = %sms", new Object[]{this.f233559d, Integer.valueOf(c), obj});
            } else {
                str = String.format("server: %s, TTL: %d, Time = %sms", new Object[]{this.f233559d, Integer.valueOf(c), "unknown"});
            }
            C79646a aVar4 = C79646a.this;
            String str6 = this.f233559d;
            aVar4.mo109777d(str6, str + "\n", 0);
            int i3 = (64 - c) + 5;
            if (i3 >= 0) {
                i2 = i3;
            }
            while (i < i2) {
                C79646a aVar5 = C79646a.this;
                synchronized (aVar5) {
                    z = aVar5.f233540a;
                }
                if (!z) {
                    C79655i iVar = new C79655i(this.f233559d, i);
                    C79661d dVar = C79646a.f233539j;
                    if (dVar != null) {
                        dVar.execute(iVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b13.a$k */
    public class C79657k implements Runnable {
        public C79657k(C79647a aVar) {
        }

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
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public void run() {
            /*
                r15 = this;
                b13.a r0 = b13.C79646a.this
                monitor-enter(r0)
                r1 = 0
                r0.f233540a = r1     // Catch:{ all -> 0x0173 }
                monitor-exit(r0)
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
                r0.<init>(r2)
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                java.sql.Date r4 = new java.sql.Date
                r4.<init>(r2)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "mmtraceroute start time "
                r5.append(r6)
                java.lang.String r4 = r0.format(r4)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = "MicroMsg.MMTraceRoute"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                b13.a r4 = b13.C79646a.this
                java.util.Map<java.lang.String, java.util.Set<java.lang.Integer>> r4 = r4.f233542c
                java.util.HashMap r4 = (java.util.HashMap) r4
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0040:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x007b
                java.lang.Object r6 = r4.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                b13.a$j r7 = new b13.a$j
                b13.a r8 = b13.C79646a.this
                java.lang.Object r9 = r6.getKey()
                java.lang.String r9 = (java.lang.String) r9
                r7.<init>(r9)
                b13.d r8 = b13.C79646a.f233539j
                if (r8 == 0) goto L_0x0060
                r8.execute(r7)
            L_0x0060:
                b13.a$b r7 = new b13.a$b
                b13.a r8 = b13.C79646a.this
                java.lang.Object r9 = r6.getKey()
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r6 = r6.getValue()
                java.util.Set r6 = (java.util.Set) r6
                r7.<init>(r9, r6)
                b13.d r6 = b13.C79646a.f233539j
                if (r6 == 0) goto L_0x0040
                r6.execute(r7)
                goto L_0x0040
            L_0x007b:
                b13.a r4 = b13.C79646a.this
                monitor-enter(r4)
                boolean r6 = r4.f233540a     // Catch:{ all -> 0x0170 }
                monitor-exit(r4)
                r7 = 1000(0x3e8, double:4.94E-321)
                r9 = 500(0x1f4, double:2.47E-321)
                if (r6 != 0) goto L_0x0118
                b13.d r4 = b13.C79646a.f233539j
                int r4 = r4.getActiveCount()
                if (r4 <= 0) goto L_0x0118
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
                r4.<init>()     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r6 = "task count: "
                r4.append(r6)     // Catch:{ Exception -> 0x00f5 }
                b13.d r6 = b13.C79646a.f233539j     // Catch:{ Exception -> 0x00f5 }
                int r6 = r6.getActiveCount()     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00f5 }
                r4.append(r6)     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00f5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)     // Catch:{ Exception -> 0x00f5 }
                long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x00f5 }
                long r11 = r11 - r2
                r13 = 120000(0x1d4c0, double:5.9288E-319)
                int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r4 < 0) goto L_0x00f1
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
                r4.<init>()     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r6 = "traceroute timeout: "
                r4.append(r6)     // Catch:{ Exception -> 0x00f5 }
                long r11 = r11 / r7
                r4.append(r11)     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00f5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)     // Catch:{ Exception -> 0x00f5 }
                b13.a r4 = b13.C79646a.this     // Catch:{ Exception -> 0x00f5 }
                r6 = 1
                monitor-enter(r4)     // Catch:{ Exception -> 0x00f5 }
                r4.f233540a = r6     // Catch:{ all -> 0x00ee }
                monitor-exit(r4)     // Catch:{ Exception -> 0x00f5 }
                b13.a r4 = b13.C79646a.this     // Catch:{ Exception -> 0x00f5 }
                r4.mo109778e()     // Catch:{ Exception -> 0x00f5 }
                b13.a r4 = b13.C79646a.this     // Catch:{ Exception -> 0x00f5 }
                b13.a$f r4 = r4.f233544e     // Catch:{ Exception -> 0x00f5 }
                if (r4 == 0) goto L_0x00ed
                com.tencent.mm.plugin.traceroute.ui.d$b r4 = (com.tencent.p014mm.plugin.traceroute.p115ui.C85498d.C85500b) r4     // Catch:{ Exception -> 0x00f5 }
                com.tencent.mm.plugin.traceroute.ui.d r4 = com.tencent.p014mm.plugin.traceroute.p115ui.C85498d.this     // Catch:{ Exception -> 0x00f5 }
                com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI r4 = r4.f249161a     // Catch:{ Exception -> 0x00f5 }
                com.tencent.mm.sdk.platformtools.MMHandler r4 = r4.f249155j     // Catch:{ Exception -> 0x00f5 }
                r4.sendEmptyMessageDelayed(r6, r9)     // Catch:{ Exception -> 0x00f5 }
            L_0x00ed:
                return
            L_0x00ee:
                r6 = move-exception
                monitor-exit(r4)     // Catch:{ Exception -> 0x00f5 }
                throw r6     // Catch:{ Exception -> 0x00f5 }
            L_0x00f1:
                java.lang.Thread.sleep(r9)     // Catch:{ Exception -> 0x00f5 }
                goto L_0x007b
            L_0x00f5:
                r4 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "wait for command end err: "
                r6.append(r7)
                java.lang.String r7 = r4.getMessage()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
                java.lang.Object[] r6 = new java.lang.Object[r1]
                java.lang.String r7 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r4, r7, r6)
                goto L_0x007b
            L_0x0118:
                long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "mmtraceroute end time "
                r1.append(r4)
                java.util.Date r4 = new java.util.Date
                r4.<init>(r11)
                java.lang.String r0 = r0.format(r4)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "mmtraceroute total time "
                r0.append(r1)
                long r11 = r11 - r2
                long r11 = r11 / r7
                r0.append(r11)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                b13.a r0 = b13.C79646a.this
                b13.a$e r1 = r0.f233545f
                if (r1 == 0) goto L_0x016f
                monitor-enter(r0)
                boolean r1 = r0.f233540a     // Catch:{ all -> 0x016c }
                monitor-exit(r0)
                if (r1 != 0) goto L_0x016f
                b13.a r0 = b13.C79646a.this
                b13.a$e r0 = r0.f233545f
                com.tencent.mm.plugin.traceroute.ui.d$a r0 = (com.tencent.p014mm.plugin.traceroute.p115ui.C85498d.C85499a) r0
                com.tencent.mm.plugin.traceroute.ui.d r0 = com.tencent.p014mm.plugin.traceroute.p115ui.C85498d.this
                com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI r0 = r0.f249161a
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f249155j
                r1 = 2
                r0.sendEmptyMessageDelayed(r1, r9)
                goto L_0x016f
            L_0x016c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x016f:
                return
            L_0x0170:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L_0x0173:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b13.C79646a.C79657k.run():void");
        }
    }

    public C79646a(String str) {
        this.f233543d = str;
        f233538i = C88956h.m111061b().getAbsolutePath() + "/tencent/traceroute_log_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString() + ".log";
    }

    /* renamed from: a */
    public static void m96746a(C79646a aVar) {
        C79649c cVar = aVar.f233547h;
        if (cVar != null) {
            C85498d.this.f249161a.f249155j.sendEmptyMessage(3);
        }
    }

    /* renamed from: b */
    public static void m96747b(C79646a aVar) {
        C79650d dVar = aVar.f233546g;
        if (dVar != null) {
            C85498d.this.f249161a.f249155j.sendEmptyMessage(4);
        }
    }

    /* renamed from: c */
    public void mo109776c(String[] strArr, boolean z) {
        if (strArr == null || strArr.length == 0) {
            Log.m105920e("MicroMsg.MMTraceRoute", "no ip contains");
            return;
        }
        String str = z ? "long: " : "short: ";
        for (String str2 : strArr) {
            String[] split = str2.split(XVFSFile.PATH_SEPARATOR);
            if (split == null || split.length != 3) {
                Log.m105920e("MicroMsg.MMTraceRoute", "err ip " + str2);
            } else {
                if (!((HashMap) this.f233542c).containsKey(split[0])) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(Integer.valueOf(Util.getInt(split[1], 0)));
                    ((HashMap) this.f233542c).put(split[0], hashSet);
                    str = str + split[0] + " ";
                } else {
                    ((Set) ((HashMap) this.f233542c).get(split[0])).add(Integer.valueOf(Util.getInt(split[1], 0)));
                }
            }
        }
        C86013q1.m106440a(f233538i, (str + "\n").getBytes());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo109777d(java.lang.String r3, java.lang.String r4, java.lang.Integer r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0069
            if (r4 == 0) goto L_0x0069
            int r0 = r5.intValue()     // Catch:{ all -> 0x0066 }
            if (r0 >= 0) goto L_0x000c
            goto L_0x0069
        L_0x000c:
            b13.a$g r0 = r2.f233541b     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0027
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r1.<init>(r4)     // Catch:{ all -> 0x0066 }
            r0.put(r5, r1)     // Catch:{ all -> 0x0066 }
            b13.a$g r4 = r2.f233541b     // Catch:{ all -> 0x0066 }
            r4.put(r3, r0)     // Catch:{ all -> 0x0066 }
            goto L_0x0064
        L_0x0027:
            b13.a$g r0 = r2.f233541b     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0066 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0047
            b13.a$g r0 = r2.f233541b     // Catch:{ all -> 0x0066 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0066 }
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ all -> 0x0066 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3     // Catch:{ all -> 0x0066 }
            r3.append(r4)     // Catch:{ all -> 0x0066 }
            goto L_0x0064
        L_0x0047:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r1.<init>(r4)     // Catch:{ all -> 0x0066 }
            r0.put(r5, r1)     // Catch:{ all -> 0x0066 }
            b13.a$g r0 = r2.f233541b     // Catch:{ all -> 0x0066 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0066 }
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r0.<init>(r4)     // Catch:{ all -> 0x0066 }
            r3.put(r5, r0)     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r2)
            return
        L_0x0066:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0069:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b13.C79646a.mo109777d(java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    /* renamed from: e */
    public void mo109778e() {
        synchronized (this) {
            this.f233540a = true;
        }
        C79661d dVar = f233539j;
        if (dVar != null) {
            try {
                dVar.shutdownNow();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MMTraceRoute", "failed to shutdown threadpool: " + e.getMessage());
            }
        }
    }
}
