package com.tencent.p014mm.modelstat;

import android.util.Pair;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.GreenManUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.ConfigFile;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import junit.framework.Assert;
import kj2.C117407d;
import mu3.C109639a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.modelstat.b */
public class C81016b {

    /* renamed from: k */
    public static C81016b f237960k;

    /* renamed from: a */
    public MMHandler f237961a = null;

    /* renamed from: b */
    public MTimerHandler f237962b = null;

    /* renamed from: c */
    public ArrayList<C81021c> f237963c = new ArrayList<>();

    /* renamed from: d */
    public String f237964d = null;

    /* renamed from: e */
    public long f237965e = 0;

    /* renamed from: f */
    public ArrayList<C81022d> f237966f = new ArrayList<>();

    /* renamed from: g */
    public Map<String, Boolean> f237967g = new HashMap();

    /* renamed from: h */
    public long f237968h = 0;

    /* renamed from: i */
    public long f237969i = 0;

    /* renamed from: j */
    public List<C29035e> f237970j = new ArrayList();

    /* renamed from: com.tencent.mm.modelstat.b$e */
    public static class C29035e implements Comparable<C29035e>, Serializable {
        public int compareTo(Object obj) {
            ((C29035e) obj).getClass();
            return (int) 0;
        }

        public String toString() {
            return String.format(Locale.getDefault(), "[%s,%s]", new Object[]{null, C81016b.m98928h(0)});
        }
    }

    /* renamed from: com.tencent.mm.modelstat.b$a */
    public class C81017a implements MTimerHandler.CallBack {

        /* renamed from: com.tencent.mm.modelstat.b$a$a */
        public class C81018a implements Runnable {
            public C81018a() {
            }

            public void run() {
                C81016b.m98926b(C81016b.this);
            }
        }

        public C81017a() {
        }

        public boolean onTimerExpired() {
            boolean isScreenOn = GreenManUtil.isScreenOn(MMApplicationContext.getContext());
            String a = C81016b.m98925a(MMApplicationContext.getContext());
            boolean z = !Util.isNullOrNil(a);
            Log.m105919d("MicroMsg.ClickFlowStatReceiver", "monitorHandler ScreenOn:%s isTop:%s top:%s ", Boolean.valueOf(isScreenOn), Boolean.valueOf(z), a);
            if (isScreenOn && z) {
                return true;
            }
            C81016b.this.f237961a.post(new C81018a());
            return false;
        }
    }

    /* renamed from: com.tencent.mm.modelstat.b$b */
    public static class C81019b {

        /* renamed from: a */
        public long f237973a;

        /* renamed from: b */
        public long f237974b;

        /* renamed from: c */
        public List<C81022d> f237975c = new ArrayList();

        /* renamed from: d */
        public Map<String, Boolean> f237976d = new HashMap();

        /* renamed from: com.tencent.mm.modelstat.b$b$a */
        public static class C81020a extends Exception {
            public C81020a(String str) {
                super(str);
            }

            public C81020a(Throwable th) {
                super(th);
            }
        }

        /* renamed from: a */
        public static C81019b m98940a(String str) {
            String str2 = str;
            C81019b bVar = new C81019b();
            try {
                Map<String, String> parseXml = XmlParser.parseXml(str2, "eventSampleConf", (String) null);
                if (parseXml != null) {
                    long j = 0;
                    long j2 = Util.getLong(parseXml.get(".eventSampleConf.nextUpdateInterval"), 0);
                    bVar.f237973a = j2;
                    if (j2 <= 0 || j2 > 432000) {
                        bVar.f237973a = 432000;
                    }
                    bVar.f237974b = Util.getLong(parseXml.get(".eventSampleConf.samplePeriod"), 0);
                    int i = 0;
                    while (true) {
                        C81022d dVar = new C81022d();
                        StringBuilder sb = new StringBuilder();
                        sb.append(".eventSampleConf.events.event");
                        sb.append(i > 0 ? Integer.valueOf(i) : "");
                        sb.append(".");
                        String sb4 = sb.toString();
                        i++;
                        int i2 = Util.getInt(parseXml.get(sb4 + "id"), 0);
                        dVar.f237983a = i2;
                        if (i2 <= 0) {
                            Log.m105927v("MicroMsg.ClickFlowStatReceiver", "Config.parseString %s", bVar);
                            return bVar;
                        }
                        dVar.f237985c = Util.getLong(parseXml.get(sb4 + "expireTime"), j);
                        dVar.f237984b = parseXml.get(sb4 + "name");
                        dVar.f237986d = Util.getFloat(parseXml.get(sb4 + TPReportKeys.Common.COMMON_MEDIA_RATE), 0.0f);
                        dVar.f237987e = Util.getInt(parseXml.get(sb4 + "logId"), 0);
                        dVar.f237988f = parseXml.get(sb4 + "pages.$type");
                        ArrayList<Pair<String, Boolean>> arrayList = new ArrayList<>();
                        int i3 = 0;
                        while (true) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(sb4);
                            sb5.append("pages.page");
                            sb5.append(i3 > 0 ? Integer.valueOf(i3) : "");
                            sb5.append(".");
                            String sb6 = sb5.toString();
                            i3++;
                            String str3 = parseXml.get(sb6 + "$id");
                            if (str3 == null) {
                                break;
                            }
                            boolean equals = parseXml.get(sb6 + "$action").equals("true");
                            arrayList.add(new Pair(str3, Boolean.valueOf(equals)));
                            ((HashMap) bVar.f237976d).put(str3, Boolean.valueOf(equals));
                        }
                        dVar.f237989g = arrayList;
                        ArrayList<Pair<String, String>> arrayList2 = new ArrayList<>();
                        int i4 = 0;
                        while (true) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(sb4);
                            sb7.append("specialPVPages.pageItem");
                            sb7.append(i4 > 0 ? Integer.valueOf(i4) : "");
                            sb7.append(".");
                            String sb8 = sb7.toString();
                            i4++;
                            String str4 = parseXml.get(sb8 + "$prePage");
                            if (str4 == null) {
                                break;
                            }
                            arrayList2.add(new Pair(str4, parseXml.get(sb8 + "$page")));
                        }
                        dVar.f237990h = arrayList2;
                        ((ArrayList) bVar.f237975c).add(dVar);
                        Log.m105925i("MicroMsg.ClickFlowStatReceiver", "Config.parseString Event: %s", dVar);
                        j = 0;
                    }
                } else {
                    Log.m105921e("MicroMsg.ClickFlowStatReceiver", "Config.parseString unable parse XML: %s", str2);
                    throw new C81020a("reportConfigMap is null");
                }
            } catch (Exception e) {
                throw new C81020a((Throwable) e);
            }
        }

        public String toString() {
            return "Config{nextUpdateInterval=" + this.f237973a + ", samplePeriod=" + this.f237974b + ", eventList=" + this.f237975c + '}';
        }
    }

    /* renamed from: com.tencent.mm.modelstat.b$c */
    public static class C81021c implements Comparable<C81021c>, Serializable {

        /* renamed from: d */
        public String f237977d = null;

        /* renamed from: e */
        public long f237978e = 0;

        /* renamed from: f */
        public int f237979f = 0;

        /* renamed from: g */
        public long f237980g;

        /* renamed from: h */
        public long f237981h = 0;

        /* renamed from: i */
        public List<C29035e> f237982i = null;

        public int compareTo(Object obj) {
            return (int) (this.f237978e - ((C81021c) obj).f237978e);
        }

        public String toString() {
            return String.format(Locale.getDefault(), "[%s,%d,%s]", new Object[]{this.f237977d, Integer.valueOf(this.f237979f), C81016b.m98928h(this.f237978e)});
        }
    }

    /* renamed from: com.tencent.mm.modelstat.b$d */
    public static class C81022d {

        /* renamed from: a */
        public int f237983a;

        /* renamed from: b */
        public String f237984b;

        /* renamed from: c */
        public long f237985c;

        /* renamed from: d */
        public float f237986d;

        /* renamed from: e */
        public int f237987e;

        /* renamed from: f */
        public String f237988f;

        /* renamed from: g */
        public ArrayList<Pair<String, Boolean>> f237989g = new ArrayList<>();

        /* renamed from: h */
        public ArrayList<Pair<String, String>> f237990h = new ArrayList<>();

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReportConfigEvent{");
            sb.append("id=" + this.f237983a);
            sb.append(", name='" + this.f237984b + "'");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", expireTime=");
            sb4.append(this.f237985c);
            sb.append(sb4.toString());
            sb.append(", rate=" + this.f237986d);
            sb.append(", logId=" + this.f237987e);
            sb.append(", pagesType='" + this.f237988f + "'");
            sb.append(", pageList=[");
            Iterator<Pair<String, Boolean>> it = this.f237989g.iterator();
            while (it.hasNext()) {
                Pair next = it.next();
                sb.append("{" + ((String) next.first) + "," + next.second + "}");
                sb.append(",");
            }
            sb.append("]");
            sb.append(", specialPVPages=[");
            Iterator<Pair<String, String>> it4 = this.f237990h.iterator();
            while (it4.hasNext()) {
                Pair next2 = it4.next();
                sb.append("{" + ((String) next2.first) + "," + ((String) next2.second) + "}");
                sb.append(",");
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    public C81016b() {
        if (CrashReportFactory.hasDebuger()) {
            Assert.assertTrue("Error: ClickFlow internal code can only run in MM process.", MMApplicationContext.isMMProcess());
        }
        C109639a a = C109639a.m148950a("ClickFlow");
        MMHandler mMHandler = new MMHandler(a);
        this.f237961a = mMHandler;
        mMHandler.setLogging(false);
        MTimerHandler mTimerHandler = new MTimerHandler(a, (MTimerHandler.CallBack) new C81017a(), true);
        this.f237962b = mTimerHandler;
        mTimerHandler.setLogging(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r4 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m98925a(android.content.Context r8) {
        /*
            java.lang.String r0 = "MicroMsg.ClickFlowStatReceiver"
            java.lang.String r1 = "activity"
            r2 = 1
            r3 = 0
            java.lang.Object r4 = r8.getSystemService(r1)     // Catch:{ Exception -> 0x0054 }
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch:{ Exception -> 0x0054 }
            java.util.List r4 = r4.getRunningAppProcesses()     // Catch:{ Exception -> 0x0054 }
            if (r4 != 0) goto L_0x0013
            goto L_0x005c
        L_0x0013:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0054 }
        L_0x0017:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x0054 }
            if (r5 == 0) goto L_0x005c
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x0054 }
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5     // Catch:{ Exception -> 0x0054 }
            int r6 = r5.importance     // Catch:{ Exception -> 0x0054 }
            r7 = 100
            if (r6 != r7) goto L_0x0017
            java.lang.String r6 = r5.processName     // Catch:{ Exception -> 0x0054 }
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getApplicationId()     // Catch:{ Exception -> 0x0054 }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x0054 }
            if (r6 != 0) goto L_0x0052
            java.lang.String r5 = r5.processName     // Catch:{ Exception -> 0x0054 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0054 }
            r6.<init>()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getApplicationId()     // Catch:{ Exception -> 0x0054 }
            r6.append(r7)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r7 = ":tools"
            r6.append(r7)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0054 }
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x0054 }
            if (r5 == 0) goto L_0x0017
        L_0x0052:
            r4 = 1
            goto L_0x005d
        L_0x0054:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "isAppOnForeground"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r4, r6, r5)
        L_0x005c:
            r4 = 0
        L_0x005d:
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x0063
            goto L_0x00e2
        L_0x0063:
            java.lang.Object r8 = r8.getSystemService(r1)     // Catch:{ Exception -> 0x00cd }
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8     // Catch:{ Exception -> 0x00cd }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00cd }
            r4 = 23
            java.lang.String r6 = "."
            if (r1 < r4) goto L_0x00ad
            java.util.List r8 = r8.getAppTasks()     // Catch:{ Exception -> 0x00cd }
            if (r8 == 0) goto L_0x00e2
            int r1 = r8.size()     // Catch:{ Exception -> 0x00cd }
            if (r1 > 0) goto L_0x007e
            goto L_0x00e2
        L_0x007e:
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00cd }
            boolean r1 = r8.hasNext()     // Catch:{ Exception -> 0x00cd }
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r8 = r8.next()     // Catch:{ Exception -> 0x00cd }
            android.app.ActivityManager$AppTask r8 = (android.app.ActivityManager.AppTask) r8     // Catch:{ Exception -> 0x00cd }
            android.app.ActivityManager$RecentTaskInfo r8 = r8.getTaskInfo()     // Catch:{ Exception -> 0x00cd }
            android.content.ComponentName r8 = r8.topActivity     // Catch:{ Exception -> 0x00cd }
            if (r8 != 0) goto L_0x0098
            r5 = 0
            goto L_0x00e2
        L_0x0098:
            java.lang.String r8 = r8.getClassName()     // Catch:{ Exception -> 0x00cd }
            boolean r1 = r8.contains(r6)     // Catch:{ Exception -> 0x00cd }
            if (r1 == 0) goto L_0x00ab
            int r1 = r8.lastIndexOf(r6)     // Catch:{ Exception -> 0x00cd }
            int r1 = r1 + r2
            java.lang.String r8 = r8.substring(r1)     // Catch:{ Exception -> 0x00cd }
        L_0x00ab:
            r5 = r8
            goto L_0x00e2
        L_0x00ad:
            java.util.List r8 = r8.getRunningTasks(r2)     // Catch:{ Exception -> 0x00cd }
            java.lang.Object r8 = r8.get(r3)     // Catch:{ Exception -> 0x00cd }
            android.app.ActivityManager$RunningTaskInfo r8 = (android.app.ActivityManager.RunningTaskInfo) r8     // Catch:{ Exception -> 0x00cd }
            android.content.ComponentName r8 = r8.topActivity     // Catch:{ Exception -> 0x00cd }
            java.lang.String r8 = r8.getClassName()     // Catch:{ Exception -> 0x00cd }
            boolean r1 = r8.contains(r6)     // Catch:{ Exception -> 0x00cd }
            if (r1 == 0) goto L_0x00ab
            int r1 = r8.lastIndexOf(r6)     // Catch:{ Exception -> 0x00cd }
            int r1 = r1 + r2
            java.lang.String r8 = r8.substring(r1)     // Catch:{ Exception -> 0x00cd }
            goto L_0x00ab
        L_0x00cd:
            r8 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r8.getMessage()
            r1[r3] = r4
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r8)
            r1[r2] = r8
            java.lang.String r8 = "getTopActivityName Exception:%s stack:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r1)
        L_0x00e2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C81016b.m98925a(android.content.Context):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.tencent.mm.modelstat.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: com.tencent.mm.modelstat.b$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: com.tencent.mm.modelstat.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0304 A[Catch:{ a -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x030a A[Catch:{ a -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0311 A[Catch:{ a -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0318 A[Catch:{ a -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0427 A[Catch:{ Exception -> 0x0495 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x044a A[Catch:{ Exception -> 0x0495 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0498 A[Catch:{ Exception -> 0x04bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04eb A[SYNTHETIC, Splitter:B:175:0x04eb] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05ed A[Catch:{ Exception -> 0x0614 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05ef A[Catch:{ Exception -> 0x0614 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05f2 A[Catch:{ Exception -> 0x0614 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0619 A[Catch:{ Exception -> 0x06c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0628 A[Catch:{ Exception -> 0x06c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0637 A[Catch:{ Exception -> 0x06c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x067e A[Catch:{ Exception -> 0x06c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x06e7  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x06ea  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0447 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02e8  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m98926b(com.tencent.p014mm.modelstat.C81016b r28) {
        /*
            r9 = r28
            java.util.ArrayList<com.tencent.mm.modelstat.b$c> r0 = r9.f237963c
            java.lang.String r10 = "MicroMsg.ClickFlowStatReceiver"
            if (r0 == 0) goto L_0x06f0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0010
            goto L_0x06f0
        L_0x0010:
            java.util.ArrayList<com.tencent.mm.modelstat.b$c> r0 = r9.f237963c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4 = 4
            r13 = 0
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x01a6 }
            r5.<init>()     // Catch:{ Exception -> 0x01a6 }
            r7 = r13
            r6 = 0
        L_0x0025:
            int r15 = r0.size()     // Catch:{ Exception -> 0x01a6 }
            r18 = 50400000(0x3010b00, double:2.49009086E-316)
            if (r6 >= r15) goto L_0x0096
            java.lang.Object r15 = r0.get(r6)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r15 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r15     // Catch:{ Exception -> 0x01a6 }
            long r11 = r15.f237978e     // Catch:{ Exception -> 0x01a6 }
            int r20 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r20 < 0) goto L_0x006f
            int r20 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r20 > 0) goto L_0x006f
            long r20 = r2 - r11
            int r22 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r22 <= 0) goto L_0x0045
            goto L_0x006f
        L_0x0045:
            int r13 = r15.f237979f     // Catch:{ Exception -> 0x01a6 }
            if (r13 != r4) goto L_0x004f
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x006a
            r7 = r11
            goto L_0x006a
        L_0x004f:
            r11 = 3
            if (r13 == r11) goto L_0x0067
            java.lang.String r0 = "getResumeList failed Err Opcode:%d %s"
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01a6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01a6 }
            r3 = 0
            r2[r3] = r1     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r1 = r15.f237977d     // Catch:{ Exception -> 0x01a6 }
            r3 = 1
            r2[r3] = r1     // Catch:{ Exception -> 0x01a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r2)     // Catch:{ Exception -> 0x01a6 }
            goto L_0x009c
        L_0x0067:
            r5.add(r15)     // Catch:{ Exception -> 0x01a6 }
        L_0x006a:
            int r6 = r6 + 1
            r13 = 0
            goto L_0x0025
        L_0x006f:
            java.lang.String r0 = "getResumeList failed Err timestamp:%d diff:%d opcode:%d page:%s"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01a6 }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x01a6 }
            r6 = 0
            r1[r6] = r5     // Catch:{ Exception -> 0x01a6 }
            long r5 = r15.f237978e     // Catch:{ Exception -> 0x01a6 }
            long r2 = r2 - r5
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x01a6 }
            r3 = 1
            r1[r3] = r2     // Catch:{ Exception -> 0x01a6 }
            int r2 = r15.f237979f     // Catch:{ Exception -> 0x01a6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01a6 }
            r3 = 2
            r1[r3] = r2     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = r15.f237977d     // Catch:{ Exception -> 0x01a6 }
            r3 = 3
            r1[r3] = r2     // Catch:{ Exception -> 0x01a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r1)     // Catch:{ Exception -> 0x01a6 }
            goto L_0x009c
        L_0x0096:
            int r6 = r5.size()     // Catch:{ Exception -> 0x01a6 }
            if (r6 != 0) goto L_0x009e
        L_0x009c:
            goto L_0x01bf
        L_0x009e:
            java.util.Collections.sort(r5)     // Catch:{ Exception -> 0x01a6 }
            java.util.List<com.tencent.mm.modelstat.b$e> r6 = r9.f237970j     // Catch:{ Exception -> 0x01a6 }
            java.util.Collections.sort(r6)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r6 = new com.tencent.mm.modelstat.b$c     // Catch:{ Exception -> 0x01a6 }
            r6.<init>()     // Catch:{ Exception -> 0x01a6 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x01a6 }
        L_0x00af:
            boolean r11 = r5.hasNext()     // Catch:{ Exception -> 0x01a6 }
            if (r11 == 0) goto L_0x00fe
            java.lang.Object r11 = r5.next()     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r11 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r11     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r12 = r11.f237977d     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r13 = r6.f237977d     // Catch:{ Exception -> 0x01a6 }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x01a6 }
            if (r12 == 0) goto L_0x00ef
            long r12 = r11.f237978e     // Catch:{ Exception -> 0x01a6 }
            long r14 = r6.f237978e     // Catch:{ Exception -> 0x01a6 }
            long r14 = r12 - r14
            r22 = 10800000(0xa4cb80, double:5.335909E-317)
            int r24 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r24 <= 0) goto L_0x00fc
            java.lang.String r14 = "[oneliang]Duplicate resume info check,current resume info time:%s,previous resume info time:%s"
            r15 = 2
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x01a6 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x01a6 }
            r13 = 0
            r4[r13] = r12     // Catch:{ Exception -> 0x01a6 }
            long r12 = r6.f237978e     // Catch:{ Exception -> 0x01a6 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x01a6 }
            r13 = 1
            r4[r13] = r12     // Catch:{ Exception -> 0x01a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r4)     // Catch:{ Exception -> 0x01a6 }
            long r11 = r11.f237978e     // Catch:{ Exception -> 0x01a6 }
            r6.f237978e = r11     // Catch:{ Exception -> 0x01a6 }
            goto L_0x00fc
        L_0x00ef:
            long r12 = r11.f237981h     // Catch:{ Exception -> 0x01a6 }
            r9.mo112888c(r6, r12)     // Catch:{ Exception -> 0x01a6 }
            r1.add(r11)     // Catch:{ Exception -> 0x01a6 }
            long r12 = r11.f237978e     // Catch:{ Exception -> 0x01a6 }
            r6.f237980g = r12     // Catch:{ Exception -> 0x01a6 }
            r6 = r11
        L_0x00fc:
            r4 = 4
            goto L_0x00af
        L_0x00fe:
            boolean r4 = r1.isEmpty()     // Catch:{ Exception -> 0x01a6 }
            if (r4 != 0) goto L_0x0113
            int r4 = r1.size()     // Catch:{ Exception -> 0x01a6 }
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r4 = r1.get(r4)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r4 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r4     // Catch:{ Exception -> 0x01a6 }
            r9.mo112888c(r4, r7)     // Catch:{ Exception -> 0x01a6 }
        L_0x0113:
            int r4 = r0.size()     // Catch:{ Exception -> 0x01a6 }
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r0 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r0     // Catch:{ Exception -> 0x01a6 }
            long r4 = r0.f237978e     // Catch:{ Exception -> 0x01a6 }
            r6.f237980g = r4     // Catch:{ Exception -> 0x01a6 }
            int r0 = r1.size()     // Catch:{ Exception -> 0x01a6 }
            r4 = 1
            int r0 = r0 - r4
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r0 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r0     // Catch:{ Exception -> 0x01a6 }
            long r5 = r0.f237978e     // Catch:{ Exception -> 0x01a6 }
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0143
            int r0 = r1.size()     // Catch:{ Exception -> 0x01a6 }
            int r0 = r0 - r4
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r0 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r0     // Catch:{ Exception -> 0x01a6 }
            r0.f237980g = r2     // Catch:{ Exception -> 0x01a6 }
            goto L_0x0155
        L_0x0143:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0155
            int r0 = r1.size()     // Catch:{ Exception -> 0x01a6 }
            r4 = 1
            int r0 = r0 - r4
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r0 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r0     // Catch:{ Exception -> 0x01a6 }
            r0.f237980g = r2     // Catch:{ Exception -> 0x01a6 }
        L_0x0155:
            int r0 = r1.size()     // Catch:{ Exception -> 0x01a6 }
            r4 = 1
            int r0 = r0 - r4
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r0 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r0     // Catch:{ Exception -> 0x01a6 }
            long r4 = r0.f237980g     // Catch:{ Exception -> 0x01a6 }
            r6 = 0
            java.lang.Object r0 = r1.get(r6)     // Catch:{ Exception -> 0x01a6 }
            com.tencent.mm.modelstat.b$c r0 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r0     // Catch:{ Exception -> 0x01a6 }
            long r6 = r0.f237978e     // Catch:{ Exception -> 0x01a6 }
            long r4 = r4 - r6
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0177
            java.lang.String r0 = "getResumeList failed Err list time"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ Exception -> 0x01a6 }
            goto L_0x01bf
        L_0x0177:
            java.lang.String r0 = "getResumeList errType:%d list:%d time:%d"
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01a6 }
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01a6 }
            r5[r4] = r6     // Catch:{ Exception -> 0x01a6 }
            int r4 = r1.size()     // Catch:{ Exception -> 0x01a6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01a6 }
            r6 = 1
            r5[r6] = r4     // Catch:{ Exception -> 0x01a6 }
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)     // Catch:{ Exception -> 0x01a6 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x01a6 }
            r3 = 2
            r5[r3] = r2     // Catch:{ Exception -> 0x01a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r5)     // Catch:{ Exception -> 0x01a6 }
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01a6 }
            android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ Exception -> 0x01a6 }
            goto L_0x01c0
        L_0x01a6:
            r0 = move-exception
            r1 = 15008(0x3aa0, float:2.103E-41)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            m98927f(r1, r2)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "getResumeList failed %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r2)
        L_0x01bf:
            r0 = 0
        L_0x01c0:
            java.util.ArrayList<com.tencent.mm.modelstat.b$c> r1 = r9.f237963c
            r1.clear()
            java.util.List<com.tencent.mm.modelstat.b$e> r1 = r9.f237970j
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            if (r0 != 0) goto L_0x01d6
            java.lang.String r0 = "report failed :getResumeList return null "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x06f7
        L_0x01d6:
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r11 = r1.intValue()
            java.lang.Object r0 = r0.second
            r12 = r0
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r0 == 0) goto L_0x0205
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121114l()
            if (r0 == 0) goto L_0x0205
            f40.C86709a0.m107523b()
            boolean r0 = f40.C86718e.m107551r()
            if (r0 != 0) goto L_0x0205
            f40.e r0 = f40.C86709a0.m107523b()
            int r0 = r0.mo121110g()
            goto L_0x0206
        L_0x0205:
            r0 = 0
        L_0x0206:
            if (r0 != 0) goto L_0x020e
            java.lang.String r1 = "report get uin failed  , maybe AccNotReady,  but report it"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
        L_0x020e:
            sg.q r1 = new sg.q
            r1.<init>((int) r0)
            long r13 = r1.longValue()
            java.lang.String r0 = r9.f237964d
            if (r0 != 0) goto L_0x0282
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154225d()
            r0.append(r1)
            java.lang.String r1 = "ClickFlow/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.f237964d = r0
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r1 = r0.getPath()
            if (r1 == 0) goto L_0x0257
            r2 = 0
            java.lang.String r1 = com.tencent.p014mm.vfs.C116299g2.m163855k(r1, r2, r2)
            java.lang.String r2 = r0.getPath()
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0257
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r1)
            android.net.Uri r0 = r0.build()
        L_0x0257:
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r2 = 0
            com.tencent.mm.vfs.f0$h r3 = r1.mo177799l(r0, r2)
            boolean r2 = r3.mo177810a()
            if (r2 != 0) goto L_0x0266
            r2 = 0
            goto L_0x026e
        L_0x0266:
            com.tencent.mm.vfs.FileSystem$c r2 = r3.f348991a
            java.lang.String r4 = r3.f348992b
            boolean r2 = r2.mo119948x(r4)
        L_0x026e:
            if (r2 != 0) goto L_0x0282
            com.tencent.mm.vfs.f0$h r0 = r1.mo177799l(r0, r3)
            boolean r1 = r0.mo177810a()
            if (r1 != 0) goto L_0x027b
            goto L_0x0282
        L_0x027b:
            com.tencent.mm.vfs.FileSystem$c r1 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            r1.mo119937g(r0)
        L_0x0282:
            com.tencent.mm.sdk.storage.ConfigFile r15 = new com.tencent.mm.sdk.storage.ConfigFile
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.f237964d
            r0.append(r1)
            java.lang.String r1 = "stg_"
            r0.append(r1)
            r1 = 20971520(0x1400000, float:3.526483E-38)
            r0.append(r1)
            java.lang.String r2 = "_"
            r0.append(r2)
            r0.append(r13)
            java.lang.String r3 = ".cfg"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r9.f237964d
            r0.append(r3)
            java.lang.String r3 = "ReportConfig_"
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            r0.append(r13)
            java.lang.String r1 = ".xml"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r0 = r9.f237966f
            if (r0 == 0) goto L_0x02d8
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0346
        L_0x02d8:
            r0 = -1
            r2 = 0
            byte[] r3 = com.tencent.p014mm.vfs.C86013q1.m106433O(r1, r2, r0)
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x02e8
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            goto L_0x02e9
        L_0x02e8:
            r4 = r2
        L_0x02e9:
            java.lang.String r3 = "/sdcard/reportConfig-android.xml"
            boolean r5 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ a -> 0x0320 }
            if (r5 == 0) goto L_0x030b
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ a -> 0x0320 }
            if (r5 == 0) goto L_0x030b
            r5 = 0
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r3, r5, r0)     // Catch:{ a -> 0x0320 }
            java.lang.String r3 = "parseAndApplyString: use /sdcard/reportConfig-android.xml as config, cgi config is ignored!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r3)     // Catch:{ a -> 0x0320 }
            if (r0 == 0) goto L_0x030a
            java.lang.String r4 = new java.lang.String     // Catch:{ a -> 0x0320 }
            r4.<init>(r0)     // Catch:{ a -> 0x0320 }
            goto L_0x030b
        L_0x030a:
            r4 = r2
        L_0x030b:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ a -> 0x0320 }
            if (r0 == 0) goto L_0x0318
            java.lang.String r0 = "parseAndApplyString xml is empty and don't use /sdcard/reportConfig-android.xml"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ a -> 0x0320 }
            goto L_0x0346
        L_0x0318:
            com.tencent.mm.modelstat.b$b r0 = com.tencent.p014mm.modelstat.C81016b.C81019b.m98940a(r4)     // Catch:{ a -> 0x0320 }
            r9.mo112889d(r0)     // Catch:{ a -> 0x0320 }
            goto L_0x0346
        L_0x0320:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r2, r4)
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r2 = r0.getMessage()
            r4[r3] = r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r3 = 1
            r4[r3] = r2
            java.lang.String r2 = "parseAndApplyString throwable :%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r4)
            r2 = 15013(0x3aa5, float:2.1038E-41)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            m98927f(r2, r0)
        L_0x0346:
            r2 = 0
            int r18 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r18 != 0) goto L_0x034e
            r0 = 1
            goto L_0x034f
        L_0x034e:
            r0 = 0
        L_0x034f:
            if (r0 == 0) goto L_0x0355
            r23 = r13
            goto L_0x0403
        L_0x0355:
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.String r0 = "LAST_UPDATE_CONFIG"
            java.lang.Long r0 = r15.getLongValue(r0)
            long r20 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r0, (long) r2)
            long r6 = r20 - r4
            r23 = 432000(0x69780, double:2.134364E-318)
            int r0 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x036e
            r6 = r2
            goto L_0x0370
        L_0x036e:
            r6 = r20
        L_0x0370:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r23 = r13
            if (r0 <= 0) goto L_0x0384
            long r13 = r9.f237968h
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0384
            long r13 = r13 + r6
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0382
            goto L_0x0384
        L_0x0382:
            r0 = 0
            goto L_0x0385
        L_0x0384:
            r0 = 1
        L_0x0385:
            if (r0 == 0) goto L_0x0392
            long r2 = r9.f237965e
            r13 = 3600(0xe10, double:1.7786E-320)
            long r2 = r2 + r13
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0392
            r0 = 1
            goto L_0x0393
        L_0x0392:
            r0 = 0
        L_0x0393:
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r8 = 0
            r2[r8] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r8 = 1
            r2[r8] = r3
            long r13 = r9.f237965e
            long r13 = r4 - r13
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r8 = 2
            r2[r8] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r8 = 3
            r2[r8] = r3
            long r6 = r4 - r6
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r6 = 4
            r2[r6] = r3
            r3 = 5
            long r6 = r9.f237968h
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2[r3] = r6
            java.lang.String r3 = "readReportConfig shouldUpdate:%b now:%d lastCheckUpdateConfigDiff:%d lastUpdate:%d diff:%d  updateintval:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            if (r0 != 0) goto L_0x03d1
            goto L_0x0403
        L_0x03d1:
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            com.tencent.mm.network.g r0 = r0.f256809d
            if (r0 != 0) goto L_0x03e1
            java.lang.String r0 = "dispatcher is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
            goto L_0x0403
        L_0x03e1:
            com.tencent.mm.modelstat.e r2 = new com.tencent.mm.modelstat.e
            r2.<init>(r9, r15, r1)
            java.lang.String r1 = "versionBuffer"
            java.lang.String r1 = r15.getValue(r1)
            byte[] r1 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r1)
            pe3.b r3 = new pe3.b
            r3.<init>(r1)
            com.tencent.mm.modelstat.m r1 = new com.tencent.mm.modelstat.m
            r1.<init>(r3)
            int r0 = r1.doScene(r0, r2)
            if (r0 != 0) goto L_0x0403
            r9.f237965e = r4
        L_0x0403:
            r1 = 0
            java.lang.Object r0 = r12.get(r1)
            com.tencent.mm.modelstat.b$c r0 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r0
            long r7 = r0.f237978e
            int r0 = r12.size()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r0 = r12.get(r0)
            com.tencent.mm.modelstat.b$c r0 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r0
            long r13 = r0.f237980g
            long r25 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r3 = 0
        L_0x041f:
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r0 = r9.f237966f     // Catch:{ Exception -> 0x0495 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0495 }
            if (r3 >= r0) goto L_0x0447
            java.lang.String r0 = "app"
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r1 = r9.f237966f     // Catch:{ Exception -> 0x0495 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0495 }
            com.tencent.mm.modelstat.b$d r1 = (com.tencent.p014mm.modelstat.C81016b.C81022d) r1     // Catch:{ Exception -> 0x0495 }
            java.lang.String r1 = r1.f237988f     // Catch:{ Exception -> 0x0495 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0495 }
            if (r0 == 0) goto L_0x0444
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r0 = r9.f237966f     // Catch:{ Exception -> 0x0495 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0495 }
            r2 = r0
            com.tencent.mm.modelstat.b$d r2 = (com.tencent.p014mm.modelstat.C81016b.C81022d) r2     // Catch:{ Exception -> 0x0495 }
            r0 = r2
            goto L_0x0448
        L_0x0444:
            int r3 = r3 + 1
            goto L_0x041f
        L_0x0447:
            r0 = 0
        L_0x0448:
            if (r0 == 0) goto L_0x0498
            long r1 = r0.f237985c     // Catch:{ Exception -> 0x0495 }
            int r3 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x0481
            float r4 = r0.f237986d     // Catch:{ Exception -> 0x0495 }
            long r5 = r9.f237969i     // Catch:{ Exception -> 0x0495 }
            r1 = r28
            r2 = r23
            boolean r1 = r1.mo112890e(r2, r4, r5)     // Catch:{ Exception -> 0x0495 }
            if (r1 == 0) goto L_0x0481
            java.lang.String r1 = "type: app, handle %s, now:%d"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0495 }
            r17 = 0
            r3[r17] = r0     // Catch:{ Exception -> 0x0495 }
            java.lang.Long r2 = java.lang.Long.valueOf(r25)     // Catch:{ Exception -> 0x0495 }
            r16 = 1
            r3[r16] = r2     // Catch:{ Exception -> 0x0495 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r3)     // Catch:{ Exception -> 0x0495 }
            int r3 = r0.f237987e     // Catch:{ Exception -> 0x0495 }
            int r4 = r0.f237983a     // Catch:{ Exception -> 0x0495 }
            r1 = r28
            r2 = r15
            r5 = r7
            r9 = 0
            r7 = r13
            r1.mo112895m(r2, r3, r4, r5, r7)     // Catch:{ Exception -> 0x04bb }
            goto L_0x04d4
        L_0x0481:
            r9 = 0
            java.lang.String r1 = "type: app, skip %s, now:%d"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x04bb }
            r3[r9] = r0     // Catch:{ Exception -> 0x04bb }
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ Exception -> 0x04bb }
            r2 = 1
            r3[r2] = r0     // Catch:{ Exception -> 0x04bb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r3)     // Catch:{ Exception -> 0x04bb }
            goto L_0x04d4
        L_0x0495:
            r0 = move-exception
            r9 = 0
            goto L_0x04bc
        L_0x0498:
            r9 = 0
            java.lang.String r0 = "type: app, skip null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x04bb }
            if (r18 != 0) goto L_0x04a3
            r0 = 1
            goto L_0x04a4
        L_0x04a3:
            r0 = 0
        L_0x04a4:
            if (r0 == 0) goto L_0x04b4
            r3 = 13604(0x3524, float:1.9063E-41)
            r4 = 100001(0x186a1, float:1.40131E-40)
            r1 = r28
            r2 = r15
            r5 = r7
            r7 = r13
            r1.mo112895m(r2, r3, r4, r5, r7)     // Catch:{ Exception -> 0x04bb }
            goto L_0x04d4
        L_0x04b4:
            java.lang.String r0 = "type: app, event null, uin not zero"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x04bb }
            goto L_0x04d4
        L_0x04bb:
            r0 = move-exception
        L_0x04bc:
            r1 = 15004(0x3a9c, float:2.1025E-41)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            m98927f(r1, r2)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r2[r9] = r0
            java.lang.String r0 = "report ev:1 exception : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r2)
        L_0x04d4:
            java.lang.String r0 = "SEQ_"
            java.lang.String r1 = "SEQ_13604"
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x06c6 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x06c6 }
            r4.<init>()     // Catch:{ Exception -> 0x06c6 }
            r8 = 0
        L_0x04e2:
            int r5 = r12.size()     // Catch:{ Exception -> 0x06c6 }
            java.lang.String r6 = "t"
            if (r8 >= r5) goto L_0x05d0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x05cd }
            r5.<init>()     // Catch:{ Exception -> 0x05cd }
            java.lang.Object r7 = r12.get(r8)     // Catch:{ Exception -> 0x05cd }
            com.tencent.mm.modelstat.b$c r7 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r7     // Catch:{ Exception -> 0x05cd }
            long r13 = r7.f237980g     // Catch:{ Exception -> 0x05cd }
            r17 = r10
            long r9 = r7.f237978e     // Catch:{ Exception -> 0x05cb }
            int r22 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r22 < 0) goto L_0x059f
            r20 = 0
            int r22 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r22 < 0) goto L_0x059f
            int r22 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r22 < 0) goto L_0x059f
            int r22 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r22 > 0) goto L_0x059f
            int r13 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0514
            goto L_0x059f
        L_0x0514:
            java.lang.String r9 = "p"
            java.lang.String r10 = r7.f237977d     // Catch:{ Exception -> 0x05cb }
            org.json.JSONObject r9 = r5.put(r9, r10)     // Catch:{ Exception -> 0x05cb }
            java.lang.String r10 = "tbe"
            long r13 = r7.f237978e     // Catch:{ Exception -> 0x05cb }
            r25 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r25
            org.json.JSONObject r9 = r9.put(r10, r13)     // Catch:{ Exception -> 0x05cb }
            java.lang.String r10 = "in"
            long r13 = r7.f237980g     // Catch:{ Exception -> 0x05cb }
            r22 = r0
            r27 = r1
            long r0 = r7.f237978e     // Catch:{ Exception -> 0x0598 }
            long r13 = r13 - r0
            long r13 = r13 / r25
            r9.put(r10, r13)     // Catch:{ Exception -> 0x0598 }
            java.util.List<com.tencent.mm.modelstat.b$e> r0 = r7.f237982i     // Catch:{ Exception -> 0x0598 }
            if (r0 == 0) goto L_0x058a
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0598 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0598 }
            if (r0 != 0) goto L_0x058a
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0598 }
            r0.<init>()     // Catch:{ Exception -> 0x0598 }
            r1 = 0
        L_0x054c:
            java.util.List<com.tencent.mm.modelstat.b$e> r9 = r7.f237982i     // Catch:{ Exception -> 0x0598 }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ Exception -> 0x0598 }
            int r9 = r9.size()     // Catch:{ Exception -> 0x0598 }
            if (r1 >= r9) goto L_0x0584
            java.util.List<com.tencent.mm.modelstat.b$e> r9 = r7.f237982i     // Catch:{ Exception -> 0x0598 }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ Exception -> 0x0598 }
            java.lang.Object r9 = r9.get(r1)     // Catch:{ Exception -> 0x0598 }
            com.tencent.mm.modelstat.b$e r9 = (com.tencent.p014mm.modelstat.C81016b.C29035e) r9     // Catch:{ Exception -> 0x0598 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0598 }
            r10.<init>()     // Catch:{ Exception -> 0x0598 }
            java.lang.String r13 = "w"
            r9.getClass()     // Catch:{ Exception -> 0x0598 }
            r9 = 0
            org.json.JSONObject r13 = r10.put(r13, r9)     // Catch:{ Exception -> 0x0598 }
            r14 = 0
            org.json.JSONObject r13 = r13.put(r6, r14)     // Catch:{ Exception -> 0x0598 }
            java.lang.String r14 = "tbp"
            java.lang.String r9 = "{0;0}"
            r13.put(r14, r9)     // Catch:{ Exception -> 0x0598 }
            r0.put(r10)     // Catch:{ Exception -> 0x0598 }
            int r1 = r1 + 1
            goto L_0x054c
        L_0x0584:
            java.lang.String r1 = "wf"
            r5.put(r1, r0)     // Catch:{ Exception -> 0x0598 }
        L_0x058a:
            r4.put(r5)     // Catch:{ Exception -> 0x0598 }
            int r8 = r8 + 1
            r10 = r17
            r0 = r22
            r1 = r27
            r9 = 0
            goto L_0x04e2
        L_0x0598:
            r0 = move-exception
            r8 = r28
            r7 = r17
            goto L_0x06ca
        L_0x059f:
            java.lang.String r0 = "reportPage ErrorTime: [%d, %d]  now:%d "
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x05c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x05c7 }
            r5 = 0
            r1[r5] = r4     // Catch:{ Exception -> 0x05c7 }
            long r4 = r7.f237980g     // Catch:{ Exception -> 0x05c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x05c7 }
            r5 = 1
            r1[r5] = r4     // Catch:{ Exception -> 0x05c7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x05c7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ Exception -> 0x05c7 }
            r7 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r1)     // Catch:{ Exception -> 0x0614 }
            r1 = 1
            r3 = 0
            r8 = r28
            goto L_0x06e3
        L_0x05c7:
            r0 = move-exception
        L_0x05c8:
            r7 = r17
            goto L_0x0615
        L_0x05cb:
            r0 = move-exception
            goto L_0x05c8
        L_0x05cd:
            r0 = move-exception
            r7 = r10
            goto L_0x0615
        L_0x05d0:
            r22 = r0
            r27 = r1
            r7 = r10
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0614 }
            r0.<init>()     // Catch:{ Exception -> 0x0614 }
            r1 = 2
            org.json.JSONObject r2 = r0.put(r6, r1)     // Catch:{ Exception -> 0x0614 }
            java.lang.String r1 = "errt"
            org.json.JSONObject r1 = r2.put(r1, r11)     // Catch:{ Exception -> 0x0614 }
            java.lang.String r2 = "pf"
            r1.put(r2, r4)     // Catch:{ Exception -> 0x0614 }
            if (r18 != 0) goto L_0x05ef
            r1 = 1
            goto L_0x05f0
        L_0x05ef:
            r1 = 0
        L_0x05f0:
            if (r1 == 0) goto L_0x0619
            r1 = r27
            java.lang.Integer r2 = r15.getIntegerValue(r1)     // Catch:{ Exception -> 0x0614 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r2)     // Catch:{ Exception -> 0x0614 }
            int r3 = r2 + 1
            r15.saveValue((java.lang.String) r1, (int) r3)     // Catch:{ Exception -> 0x0614 }
            r1 = 13604(0x3524, float:1.9063E-41)
            r3 = 100002(0x186a2, float:1.40133E-40)
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0614 }
            java.lang.String r4 = r0.toString()     // Catch:{ Exception -> 0x0614 }
            r8 = r28
            r8.mo112893k(r1, r3, r2, r4)     // Catch:{ Exception -> 0x06c4 }
            goto L_0x061b
        L_0x0614:
            r0 = move-exception
        L_0x0615:
            r8 = r28
            goto L_0x06ca
        L_0x0619:
            r8 = r28
        L_0x061b:
            android.util.SparseArray r9 = new android.util.SparseArray     // Catch:{ Exception -> 0x06c4 }
            r9.<init>()     // Catch:{ Exception -> 0x06c4 }
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r1 = r8.f237966f     // Catch:{ Exception -> 0x06c4 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x06c4 }
            if (r1 != 0) goto L_0x062e
            java.lang.String r1 = "type: page, no event"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)     // Catch:{ Exception -> 0x06c4 }
        L_0x062e:
            r10 = 0
        L_0x062f:
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r1 = r8.f237966f     // Catch:{ Exception -> 0x06c4 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x06c4 }
            if (r10 >= r1) goto L_0x0677
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r1 = r8.f237966f     // Catch:{ Exception -> 0x06c4 }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ Exception -> 0x06c4 }
            r11 = r1
            com.tencent.mm.modelstat.b$d r11 = (com.tencent.p014mm.modelstat.C81016b.C81022d) r11     // Catch:{ Exception -> 0x06c4 }
            long r1 = r11.f237985c     // Catch:{ Exception -> 0x06c4 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x06c4 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x065d
            float r4 = r11.f237986d     // Catch:{ Exception -> 0x06c4 }
            long r5 = r8.f237969i     // Catch:{ Exception -> 0x06c4 }
            r1 = r28
            r2 = r23
            boolean r1 = r1.mo112890e(r2, r4, r5)     // Catch:{ Exception -> 0x06c4 }
            if (r1 == 0) goto L_0x065d
            r8.mo112892j(r12, r11, r9)     // Catch:{ Exception -> 0x06c4 }
            r2 = 2
            goto L_0x0674
        L_0x065d:
            java.lang.String r1 = "type: page, skip %s, now: %d"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x06c4 }
            r4 = 0
            r3[r4] = r11     // Catch:{ Exception -> 0x06c4 }
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x06c4 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x06c4 }
            r5 = 1
            r3[r5] = r4     // Catch:{ Exception -> 0x06c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r3)     // Catch:{ Exception -> 0x06c4 }
        L_0x0674:
            int r10 = r10 + 1
            goto L_0x062f
        L_0x0677:
            r1 = 0
        L_0x0678:
            int r2 = r9.size()     // Catch:{ Exception -> 0x06c4 }
            if (r1 >= r2) goto L_0x06c1
            int r2 = r9.keyAt(r1)     // Catch:{ Exception -> 0x06c4 }
            java.lang.Object r3 = r9.get(r2)     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x06c4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x06c4 }
            r4.<init>()     // Catch:{ Exception -> 0x06c4 }
            r5 = r22
            r4.append(r5)     // Catch:{ Exception -> 0x06c4 }
            r4.append(r2)     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x06c4 }
            java.lang.Integer r4 = r15.getIntegerValue(r4)     // Catch:{ Exception -> 0x06c4 }
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r4)     // Catch:{ Exception -> 0x06c4 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x06c4 }
            r6.<init>()     // Catch:{ Exception -> 0x06c4 }
            r6.append(r5)     // Catch:{ Exception -> 0x06c4 }
            r6.append(r2)     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x06c4 }
            int r10 = r4 + 1
            r15.saveValue((java.lang.String) r6, (int) r10)     // Catch:{ Exception -> 0x06c4 }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x06c4 }
            r8.mo112893k(r2, r3, r4, r6)     // Catch:{ Exception -> 0x06c4 }
            int r1 = r1 + 1
            r22 = r5
            goto L_0x0678
        L_0x06c1:
            r1 = 1
            r3 = 0
            goto L_0x06e3
        L_0x06c4:
            r0 = move-exception
            goto L_0x06ca
        L_0x06c6:
            r0 = move-exception
            r8 = r28
            r7 = r10
        L_0x06ca:
            r1 = 15005(0x3a9d, float:2.1026E-41)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            m98927f(r1, r2)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "report ev:2 exception : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r2)
        L_0x06e3:
            if (r18 != 0) goto L_0x06e7
            r7 = 1
            goto L_0x06e8
        L_0x06e7:
            r7 = 0
        L_0x06e8:
            if (r7 != 0) goto L_0x06f7
            r1 = r23
            r8.mo112896n(r1, r12, r15)
            goto L_0x06f7
        L_0x06f0:
            r7 = r10
            java.lang.String r0 = "page info array size is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x06f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C81016b.m98926b(com.tencent.mm.modelstat.b):void");
    }

    /* renamed from: f */
    public static void m98927f(int i, String str) {
        C117407d dVar = C117407d.INSTANCE;
        dVar.kvStat(13328, "" + i + ",0,0,0,0,0,0,0,0,0,0,0,0," + str);
    }

    /* renamed from: h */
    public static String m98928h(long j) {
        if (j < 100000000000L) {
            return new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(j * 1000));
        }
        return new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(j)) + String.format(Locale.getDefault(), ".%03d", new Object[]{Long.valueOf(j % 1000)});
    }

    /* renamed from: i */
    public static C81016b m98929i() {
        if (f237960k == null) {
            synchronized (C81016b.class) {
                if (f237960k == null) {
                    f237960k = new C81016b();
                }
            }
        }
        return f237960k;
    }

    /* renamed from: c */
    public final void mo112888c(C81021c cVar, long j) {
        long j2 = cVar.f237981h;
        if (j2 > 0) {
            int g = mo112891g(j2, 0, ((ArrayList) this.f237970j).isEmpty() ? 0 : ((ArrayList) this.f237970j).size() - 1);
            if (g != -1) {
                if (cVar.f237982i == null) {
                    cVar.f237982i = new ArrayList();
                }
                int size = ((ArrayList) this.f237970j).size();
                while (g < size) {
                    C29035e eVar = (C29035e) ((ArrayList) this.f237970j).get(g);
                    eVar.getClass();
                    if (0 > cVar.f237981h && 0 <= j) {
                        cVar.f237982i.add(eVar);
                    }
                    if (0 < j) {
                        g++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo112889d(C81019b bVar) {
        long j = bVar.f237973a;
        this.f237968h = j;
        if (j <= 0 || j > 432000) {
            this.f237968h = 432000;
        }
        this.f237969i = bVar.f237974b;
        this.f237966f.clear();
        this.f237966f.addAll(bVar.f237975c);
        ((HashMap) this.f237967g).clear();
        ((HashMap) this.f237967g).putAll(bVar.f237976d);
        if (((HashMap) this.f237967g).containsKey("*")) {
            ((Boolean) ((HashMap) this.f237967g).get("*")).booleanValue();
        }
        Log.m105925i("MicroMsg.ClickFlowStatReceiver", "applyConfig OK evenCount:%d nextUpdateInterval:%d samplePeriod:%d", Integer.valueOf(this.f237966f.size()), Long.valueOf(this.f237968h), Long.valueOf(this.f237969i));
    }

    /* renamed from: e */
    public final boolean mo112890e(long j, float f, long j2) {
        if (CrashReportFactory.hasDebuger()) {
            return true;
        }
        if (f <= 0.0f) {
            return false;
        }
        int i = 10000 / ((int) (10000.0f * f));
        int i2 = (int) j;
        int i3 = (i2 ^ (i2 >> 16)) * 73244475;
        int i4 = (i3 ^ (i3 >> 16)) * 73244475;
        int i5 = i4 ^ (i4 >> 16);
        int i6 = i5 % i;
        int nowSecond = (int) ((Util.nowSecond() / (j2 == 0 ? 259200 : j2)) % ((long) i));
        boolean z = i6 == nowSecond;
        Log.m105927v("MicroMsg.ClickFlowStatReceiver", "checkRate %b uin:%s rate:%s period:%s rec:%s x:%s uinMod:%s timeMod:%s", Boolean.valueOf(z), Long.valueOf(j), Float.valueOf(f), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(nowSecond));
        return z;
    }

    /* renamed from: g */
    public final int mo112891g(long j, int i, int i2) {
        List<C29035e> list = this.f237970j;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return -1;
        }
        int i3 = (i + i2) / 2;
        int i4 = i2 - i;
        if (i4 == 0 || i4 == 1) {
            ((C29035e) ((ArrayList) this.f237970j).get(i2)).getClass();
            return j >= 0 ? i2 : i;
        }
        ((C29035e) ((ArrayList) this.f237970j).get(i3)).getClass();
        int i5 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i5 < 0) {
            return mo112891g(j, i, i3);
        }
        ((C29035e) ((ArrayList) this.f237970j).get(i3)).getClass();
        return i5 > 0 ? mo112891g(j, i3, i2) : i3;
    }

    /* renamed from: j */
    public final void mo112892j(List<C81021c> list, C81022d dVar, SparseArray<String> sparseArray) {
        String str = dVar.f237988f;
        str.getClass();
        char c = 65535;
        boolean z = false;
        switch (str.hashCode()) {
            case -929554094:
                if (str.equals("respective")) {
                    c = 0;
                    break;
                }
                break;
            case 3117816:
                if (str.equals("ends")) {
                    c = 1;
                    break;
                }
                break;
            case 3433103:
                if (str.equals("page")) {
                    c = 2;
                    break;
                }
                break;
            case 379114255:
                if (str.equals("continuous")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Log.m105925i("MicroMsg.ClickFlowStatReceiver", "type: respective, handle %s", dVar);
                int i = 0;
                while (i < list.size()) {
                    int i2 = 0;
                    while (i2 < dVar.f237989g.size()) {
                        if (((String) dVar.f237989g.get(i2).first).equals(list.get(i).f237977d)) {
                            sparseArray.put(dVar.f237987e, Util.nullAsNil(sparseArray.get(dVar.f237987e)) + dVar.f237983a + ";");
                            i2 = dVar.f237989g.size();
                            i = list.size();
                        }
                        i2++;
                    }
                    i++;
                }
                return;
            case 1:
                Log.m105925i("MicroMsg.ClickFlowStatReceiver", "type: ends, handle %s", dVar);
                if (list.size() >= 2) {
                    if (!(dVar.f237989g.size() == 2)) {
                        Log.m105920e("MicroMsg.ClickFlowStatReceiver", "ends's pages size is not 2: " + dVar.f237989g.toString());
                        return;
                    }
                    String str2 = (String) dVar.f237989g.get(1).first;
                    if (list.get(0).f237977d.equals((String) dVar.f237989g.get(0).first) && list.get(list.size() - 1).f237977d.equals(str2)) {
                        sparseArray.put(dVar.f237987e, Util.nullAsNil(sparseArray.get(dVar.f237987e)) + dVar.f237983a + ";");
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Log.m105925i("MicroMsg.ClickFlowStatReceiver", "type: page, handle %s", dVar);
                sparseArray.put(dVar.f237987e, Util.nullAsNil(sparseArray.get(dVar.f237987e)) + dVar.f237983a + ";");
                return;
            case 3:
                Log.m105925i("MicroMsg.ClickFlowStatReceiver", "type: continuous, handle %s", dVar);
                ArrayList<Pair<String, Boolean>> arrayList = dVar.f237989g;
                if (arrayList.size() > 0) {
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < list.size()) {
                            int size2 = arrayList.size() - 1;
                            while (((String) arrayList.get(size2).first).equals(list.get(size).f237977d)) {
                                if (size2 == 0) {
                                    z = true;
                                } else {
                                    size--;
                                    size2--;
                                }
                            }
                            size += arrayList.size() - size2;
                        }
                    }
                }
                if (z) {
                    sparseArray.put(dVar.f237987e, Util.nullAsNil(sparseArray.get(dVar.f237987e)) + dVar.f237983a + ";");
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: k */
    public final void mo112893k(int i, String str, int i2, String str2) {
        String str3 = str;
        try {
            String replace = str2.replace(",", ";");
            int ceil = (int) Math.ceil(((double) replace.length()) / 6000.0d);
            int i3 = 0;
            while (i3 < ceil) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(str3);
                sb.append(",");
                sb.append(i2);
                sb.append(",");
                sb.append(i3);
                sb.append(",");
                sb.append(ceil);
                sb.append(",0,0,,");
                int i4 = i3 * 6000;
                i3++;
                sb.append(replace.substring(i4, Math.min(i3 * 6000, replace.length())));
                String sb4 = sb.toString();
                Log.m105925i("MicroMsg.ClickFlowStatReceiver", "jsonKVReporter id:%d event[%s] [%s]", Integer.valueOf(i), str3, sb4);
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat(346, 4, 1, false);
                dVar.mo160126c(i, sb4, true, true);
            }
        } catch (Exception e) {
            m98927f(15009, Util.stackTraceToString(e));
            Log.m105921e("MicroMsg.ClickFlowStatReceiver", "jsonKVReporter exception : %s", Util.stackTraceToString(e));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.io.ObjectInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084 A[SYNTHETIC, Splitter:B:34:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b A[SYNTHETIC, Splitter:B:38:0x008b] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.lang.Long, java.util.ArrayList<com.tencent.p014mm.modelstat.C81016b.C81021c>> mo112894l(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "MicroMsg.ClickFlowStatReceiver"
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x006c }
            r7.<init>((java.lang.String) r14)     // Catch:{ all -> 0x006c }
            boolean r8 = r7.mo119967g()     // Catch:{ all -> 0x006c }
            if (r8 == 0) goto L_0x005c
            long r8 = r7.mo119980r()     // Catch:{ all -> 0x006c }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x0020
            goto L_0x005c
        L_0x0020:
            java.io.InputStream r14 = com.tencent.p014mm.vfs.C86013q1.m106422D(r7)     // Catch:{ all -> 0x006c }
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0058 }
            r7.<init>(r14)     // Catch:{ all -> 0x0058 }
            java.lang.Object r4 = r7.readObject()     // Catch:{ all -> 0x0056 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0056 }
            java.lang.String r8 = "readStorage keys count:%d readTime:%d"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0056 }
            int r10 = r4.size()     // Catch:{ all -> 0x0056 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0056 }
            r9[r6] = r10     // Catch:{ all -> 0x0056 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r1)     // Catch:{ all -> 0x0056 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0056 }
            r9[r5] = r1     // Catch:{ all -> 0x0056 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r9)     // Catch:{ all -> 0x0056 }
            r7.close()     // Catch:{ Exception -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            if (r14 == 0) goto L_0x0055
            r14.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            return r4
        L_0x0056:
            r1 = move-exception
            goto L_0x005a
        L_0x0058:
            r1 = move-exception
            r7 = r4
        L_0x005a:
            r4 = r14
            goto L_0x006e
        L_0x005c:
            java.lang.String r1 = "readStorage not exist path[%s]"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x006c }
            r2[r6] = r14     // Catch:{ all -> 0x006c }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r2)     // Catch:{ all -> 0x006c }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x006c }
            r14.<init>()     // Catch:{ all -> 0x006c }
            return r14
        L_0x006c:
            r1 = move-exception
            r7 = r4
        L_0x006e:
            java.lang.String r14 = "readStorage exception: %s [%s]"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x0094 }
            r2[r6] = r3     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ all -> 0x0094 }
            r2[r5] = r1     // Catch:{ all -> 0x0094 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r14, r2)     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x0089
            r7.close()     // Catch:{ Exception -> 0x0088 }
            goto L_0x0089
        L_0x0088:
        L_0x0089:
            if (r4 == 0) goto L_0x008e
            r4.close()     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            return r14
        L_0x0094:
            r14 = move-exception
            if (r7 == 0) goto L_0x009c
            r7.close()     // Catch:{ Exception -> 0x009b }
            goto L_0x009c
        L_0x009b:
        L_0x009c:
            if (r4 == 0) goto L_0x00a1
            r4.close()     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C81016b.mo112894l(java.lang.String):java.util.HashMap");
    }

    /* renamed from: m */
    public final void mo112895m(ConfigFile configFile, int i, int i2, long j, long j2) {
        ConfigFile configFile2 = configFile;
        int i3 = i;
        int i4 = i2;
        long j3 = j2;
        long nowMilliSecond = Util.nowMilliSecond();
        if (j > j3 || j < 0 || j3 < 0 || j > nowMilliSecond || j3 > nowMilliSecond) {
            Log.m105921e("MicroMsg.ClickFlowStatReceiver", "reportAppInternal ErrorParam begin:%d end:%d now:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(nowMilliSecond));
            return;
        }
        int nullAsNil = Util.nullAsNil(configFile.getIntegerValue("SEQ_" + i3));
        configFile.saveValue("SEQ_" + i3, nullAsNil + 1);
        long nullAsNil2 = Util.nullAsNil(configFile.getLongValue("LastQuit_" + i4));
        configFile.saveValue("LastQuit_" + i4, j3);
        if (nullAsNil2 <= 0 || nullAsNil2 > j) {
            nullAsNil2 = j;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1).put("tbe", j / 1000).put("ten", j3 / 1000).put(LocaleUtil.INDONESIAN_NEWNAME, (j3 - j) / 1000).put("lten", nullAsNil2 / 1000).put("inbg", (j - nullAsNil2) / 1000);
        mo112893k(i3, "" + i4, nullAsNil, jSONObject.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v1, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v2, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v4, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v5, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v6, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v7, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v10, resolved type: java.util.ArrayList<com.tencent.mm.modelstat.b$c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v11, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v13, resolved type: java.util.ArrayList<com.tencent.mm.modelstat.b$c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v58, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v59, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v60, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v61, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v62, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v63, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v14, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v16, resolved type: java.util.ArrayList<com.tencent.mm.modelstat.b$c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v17, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v19, resolved type: java.util.ArrayList<com.tencent.mm.modelstat.b$c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v20, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v21, resolved type: java.util.ArrayList<com.tencent.mm.modelstat.b$c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v22, resolved type: java.util.ArrayList<com.tencent.mm.modelstat.b$c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v23, resolved type: java.util.ArrayList<com.tencent.mm.modelstat.b$c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v24, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v25, resolved type: java.util.ArrayList<com.tencent.mm.modelstat.b$c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v26, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v27, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v28, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: com.tencent.mm.sdk.storage.ConfigFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v76, resolved type: com.tencent.mm.sdk.storage.ConfigFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v77, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v66, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r54v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d7, code lost:
        r5 = r51;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r7 = r11;
        r9 = ((com.tencent.p014mm.modelstat.C81016b.C81021c) ((java.util.ArrayList) r7.get(java.lang.Long.valueOf(r28))).get(0)).f237978e;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ClickFlowStatReceiver", "min key:%s,tbe:%s", java.lang.Long.valueOf(r28), java.lang.Long.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x040e, code lost:
        if (r9 > r3) goto L_0x07cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0414, code lost:
        if (r9 >= 0) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0418, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0419, code lost:
        r8 = r51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0423, code lost:
        if (r3 >= r8.f237966f.size()) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0435, code lost:
        if ("appstat".equals(r8.f237966f.get(r3).f237988f) == false) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0437, code lost:
        r11 = r8.f237966f.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0441, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0444, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0445, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ClickFlowStatReceiver", "[oneliang] end:%s,tbe:%s,sumInFg:%s", java.lang.Long.valueOf(r34), java.lang.Long.valueOf(r9), java.lang.Long.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0465, code lost:
        if (r11 == null) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0467, code lost:
        r38 = (r34 - r9) - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x046f, code lost:
        if (r38 < 0) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0471, code lost:
        r5 = (r11.f237985c > r23 ? 1 : (r11.f237985c == r23 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0475, code lost:
        if (r5 <= 0) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0479, code lost:
        r45 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x047b, code lost:
        r54 = r54;
        r12 = r12;
        r2 = r2;
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x047d, code lost:
        r48 = r2;
        r49 = r1;
        r2 = r52;
        r54 = r12;
        r12 = r19;
        r50 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x048c, code lost:
        r7 = r7;
        r2 = r2;
        r54 = r54;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0490, code lost:
        if (mo112890e(r2, r11.f237986d, r8.f237969i) == false) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0492, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ClickFlowStatReceiver", "type: appstat, handle %s, now:%d", r11, java.lang.Long.valueOf(r23));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04b6, code lost:
        r5 = r55;
        r2 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04ba, code lost:
        r7 = r7;
        r54 = r54;
        r12 = r12;
        r5 = r5;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(r5.getIntegerValue(r12 + r11.f237987e));
        r5.saveValue(r12 + r11.f237987e, r1 + 1);
        r3 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04dd, code lost:
        r6 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04e0, code lost:
        r7 = r7;
        r54 = r54;
        r12 = r12;
        r5 = r5;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04e4, code lost:
        r33 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04e8, code lost:
        r19 = r12;
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04ec, code lost:
        r7 = r7;
        r54 = r54;
        r2 = r2;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r4 = r3.put(r6, 5).put(r12, r9 / 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04f2, code lost:
        r32 = r12;
        r12 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04f6, code lost:
        r7 = r7;
        r54 = r54;
        r2 = r2;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r4 = r4.put(r12, r34 / 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04fc, code lost:
        r5 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04fe, code lost:
        r7 = r7;
        r54 = r54;
        r2 = r2;
        r12 = r12;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        r1 = r0;
        r5 = r7;
        r31 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r4.put(r5, r13 / 1000).put("inbg", r38 / 1000).put("swc", r7.size());
        r4 = r11.f237987e;
        r6 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x051b, code lost:
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x051d, code lost:
        r54 = r54;
        r2 = r2;
        r12 = r12;
        r5 = r5;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r6.append(r7);
        r6.append(r11.f237983a);
        mo112893k(r4, r6.toString(), r1, r3.toString());
        r54 = r54;
        r2 = r2;
        r12 = r12;
        r5 = r5;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0532, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0533, code lost:
        r7 = r17;
        r54 = r54;
        r2 = r2;
        r12 = r12;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0537, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0538, code lost:
        r7 = r17;
        r5 = r22;
        r54 = r54;
        r2 = r2;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x053e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x053f, code lost:
        r32 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0542, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0543, code lost:
        r33 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0546, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0547, code lost:
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0549, code lost:
        r7 = r17;
        r5 = r22;
        r12 = r30;
        r54 = r54;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0551, code lost:
        r19 = r12;
        r54 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0554, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0555, code lost:
        r19 = r12;
        r54 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0559, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x055a, code lost:
        r49 = r1;
        r48 = r2;
        r54 = r12;
        r7 = r17;
        r5 = r22;
        r12 = r30;
        r2 = r37;
        r50 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b6, code lost:
        r3 = r0;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x056c, code lost:
        r49 = r1;
        r48 = r2;
        r50 = r6;
        r54 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0574, code lost:
        r7 = r17;
        r5 = r22;
        r12 = r30;
        r2 = r37;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ClickFlowStatReceiver", "type: appstat, skip %s, now:%d", r11, java.lang.Long.valueOf(r23));
        r54 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0590, code lost:
        r49 = r1;
        r48 = r2;
        r50 = r6;
        r54 = r12;
        r7 = r17;
        r5 = r22;
        r12 = r30;
        r2 = r37;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ClickFlowStatReceiver", "type: appstat, skip null, event:%s, (end - tbe - sumInFg):%s", r11, java.lang.Long.valueOf((r34 - r9) - r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05b8, code lost:
        r0 = e;
        r54 = r54;
        r12 = r12;
        r7 = r7;
        r5 = r5;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05bb, code lost:
        r1 = r0;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05bf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05c0, code lost:
        r49 = r1;
        r48 = r2;
        r50 = r6;
        r54 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05c8, code lost:
        r7 = r17;
        r5 = r22;
        r12 = r30;
        r2 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05d0, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05d3, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        m98927f(15006, com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1));
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.ClickFlowStatReceiver", "report ev:3 exception : %s", com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1));
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05ea, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05f1, code lost:
        if (r1 < r8.f237966f.size()) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0601, code lost:
        if (r2.equals(r8.f237966f.get(r1).f237988f) != false) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x060b, code lost:
        r11 = r8.f237966f.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x060d, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0610, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0611, code lost:
        r1 = r0;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0615, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0616, code lost:
        if (r11 != null) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x061c, code lost:
        if (r11.f237985c > r23) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x061e, code lost:
        r4 = r11.f237986d;
        r13 = r8.f237969i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0622, code lost:
        r8 = r55;
        r17 = r7;
        r30 = r12;
        r7 = r33;
        r12 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0634, code lost:
        if (mo112890e(r52, r4, r13) != false) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0636, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ClickFlowStatReceiver", "type: pagestat, handle %s, now:%d", r11, java.lang.Long.valueOf(r23));
        r1 = new java.lang.StringBuilder();
        r2 = r19;
        r1.append(r2);
        r1.append(r11.f237987e);
        r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(r8.getIntegerValue(r1.toString()));
        r8.saveValue(r2 + r11.f237987e, r1 + 1);
        r2 = new org.json.JSONArray();
        r3 = r54.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x068b, code lost:
        if (r3.hasNext() != false) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x068d, code lost:
        r4 = (java.lang.String) r3.next();
        r5 = new org.json.JSONObject();
        r8 = r54;
        r6 = r5.put("p", r4).put(r12, ((java.lang.Long) r8.get(r4)).longValue() / 1000);
        r13 = r48;
        r52 = r3;
        r3 = r18;
        r54 = r8;
        r22 = r12;
        r8 = r49;
        r6.put(r3, r13.get(r4)).put("c2", r8.get(r4));
        r6 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06d4, code lost:
        if (r6.containsKey(r4) != false) goto L_0x06d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06d6, code lost:
        r12 = new org.json.JSONArray();
        r4 = (java.util.Map) r6.get(r4);
        r14 = r4.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x06ed, code lost:
        if (r14.hasNext() != false) goto L_0x06ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06ef, code lost:
        r50 = r6;
        r6 = (java.lang.String) r14.next();
        r38 = r8;
        r8 = new org.json.JSONObject();
        r8.put("w", r6).put(r3, r4.get(r6));
        r12.put(r8);
        r8 = r38;
        r13 = r13;
        r6 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x071a, code lost:
        r50 = r6;
        r38 = r8;
        r48 = r13;
        r5.put("wa", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0727, code lost:
        r50 = r6;
        r38 = r8;
        r48 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x072d, code lost:
        r2.put(r5);
        r18 = r3;
        r12 = r22;
        r49 = r38;
        r3 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x073a, code lost:
        r3 = new org.json.JSONObject();
        r3.put(r7, 6).put(r32, r9 / 1000).put(r30, r34 / 1000).put("pa", r2);
        r2 = r11.f237987e;
        r4 = new java.lang.StringBuilder();
        r4.append(r17);
        r4.append(r11.f237983a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        mo112893k(r2, r4.toString(), r1, r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x077a, code lost:
        r5 = r51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x077d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x077e, code lost:
        r5 = r51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0781, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0782, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ClickFlowStatReceiver", "type: pagestat, skip %s, now:%d", r11, java.lang.Long.valueOf(r23));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0797, code lost:
        r5 = r8;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ClickFlowStatReceiver", "type: pagestat, skip null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x07a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x07a2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x07a3, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x07a4, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x07a7, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        m98927f(15007, com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1));
        r3 = new java.lang.Object[1];
        r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x07b5, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x07b6, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        r3[0] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x07b8, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x07ba, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.ClickFlowStatReceiver", r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07bf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x07c0, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x07c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x07c6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x07c7, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x07c9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x07ca, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x07cc, code lost:
        r5 = r51;
        r1 = r16;
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.ClickFlowStatReceiver", "reportStat ErroTime tbe:%d now:%d", java.lang.Long.valueOf(r9), java.lang.Long.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x07e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x07ea, code lost:
        r0 = e;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x07ec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07ed, code lost:
        r5 = r51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07f7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x07f8, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x07fe, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07ff, code lost:
        r5 = r7;
        r31 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x081b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x081c, code lost:
        r5 = r7;
        r1 = r16;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0820, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b5 A[ExcHandler: Exception (r0v39 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r7 
      PHI: (r7v57 com.tencent.mm.modelstat.b) = (r7v2 com.tencent.mm.modelstat.b), (r7v0 com.tencent.mm.modelstat.b), (r7v0 com.tencent.mm.modelstat.b), (r7v0 com.tencent.mm.modelstat.b), (r7v0 com.tencent.mm.modelstat.b), (r7v0 com.tencent.mm.modelstat.b) binds: [B:67:0x01b9, B:51:0x015d, B:42:0x011a, B:33:0x00e4, B:34:?, B:12:0x0091] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x05ba A[ExcHandler: OutOfMemoryError (r0v23 'e' java.lang.OutOfMemoryError A[CUSTOM_DECLARE]), Splitter:B:140:0x041d] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x05f3 A[SYNTHETIC, Splitter:B:216:0x05f3] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0618 A[SYNTHETIC, Splitter:B:226:0x0618] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0797 A[Catch:{ Exception -> 0x07a0, OutOfMemoryError -> 0x07e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x07c6 A[Catch:{ Exception -> 0x07ea, OutOfMemoryError -> 0x07e8 }, ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:210:0x05d3] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x07e8 A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:248:0x0775] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x07ec A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:63:0x01a9] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x07f7 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:8:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x07fe A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:6:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0615 A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112896n(long r52, java.util.ArrayList<com.tencent.p014mm.modelstat.C81016b.C81021c> r54, com.tencent.p014mm.sdk.storage.ConfigFile r55) {
        /*
            r51 = this;
            r7 = r51
            r1 = r54
            r8 = r55
            java.lang.String r9 = ""
            java.lang.String r10 = "c"
            java.lang.String r11 = "in"
            java.lang.String r12 = "ten"
            java.lang.String r13 = "tbe"
            java.lang.String r14 = "t"
            java.lang.String r2 = "LAST_REPORT_STATISITIC_TIME"
            java.lang.String r15 = "report ev:4 exception : %s"
            java.lang.String r5 = "SEQ_"
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            int r6 = r54.size()
            r16 = r15
            r15 = 1
            int r6 = r6 - r15
            java.lang.Object r6 = r1.get(r6)
            com.tencent.mm.modelstat.b$c r6 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r6
            r17 = r9
            r18 = r10
            long r9 = r6.f237980g
            r19 = r5
            r5 = 0
            java.lang.String r15 = "MicroMsg.ClickFlowStatReceiver"
            r22 = r11
            int r23 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r23 <= 0) goto L_0x082e
            int r23 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r23 <= 0) goto L_0x004c
            r5 = r7
            r34 = r9
            r1 = 2
            r2 = 0
            r6 = 1
            goto L_0x0834
        L_0x004c:
            long r23 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r5 = r7.f237964d
            r11.append(r5)
            java.lang.String r5 = "stg_"
            r11.append(r5)
            r5 = 20971520(0x1400000, float:3.526483E-38)
            r11.append(r5)
            java.lang.String r5 = "_"
            r11.append(r5)
            r5 = r52
            r11.append(r5)
            java.lang.String r5 = ".HashMap"
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            java.util.HashMap r5 = r7.mo112894l(r11)     // Catch:{ Exception -> 0x081b, OutOfMemoryError -> 0x07fe }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07fe }
            r5.put(r6, r1)     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07fe }
            java.util.Set r1 = r5.entrySet()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07fe }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07fe }
        L_0x008b:
            boolean r6 = r1.hasNext()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07fe }
            if (r6 == 0) goto L_0x00bc
            java.lang.Object r6 = r1.next()     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ae }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ae }
            java.lang.Object r6 = r6.getKey()     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ae }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ae }
            long r28 = r6.longValue()     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ae }
            r30 = 259200000(0xf731400, double:1.280618154E-315)
            long r28 = r28 + r30
            int r6 = (r28 > r9 ? 1 : (r28 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x008b
            r1.remove()     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ae }
            goto L_0x008b
        L_0x00ae:
            r0 = move-exception
            r1 = r0
            r5 = r7
            r31 = r11
            goto L_0x0803
        L_0x00b5:
            r0 = move-exception
            r3 = r0
            r5 = r7
        L_0x00b8:
            r1 = r16
            goto L_0x07fc
        L_0x00bc:
            r7.mo112897o(r11, r5)     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07fe }
            boolean r1 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07fe }
            if (r1 == 0) goto L_0x00c9
            r28 = 180000(0x2bf20, double:8.8932E-319)
            goto L_0x00cc
        L_0x00c9:
            r28 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x00cc:
            java.lang.Long r1 = r8.getLongValue(r2)     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07fe }
            r31 = r11
            r30 = r12
            r11 = 0
            long r32 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r1, (long) r11)     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            long r11 = r32 + r28
            r1 = 3
            int r6 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0104
            java.lang.String r2 = "type: stat, skip all, lastStatisticTime: %d, end: %d, FREQ: %d"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            java.lang.Long r3 = java.lang.Long.valueOf(r32)     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            r4 = 0
            r1[r4] = r3     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            r4 = 1
            r1[r4] = r3     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            java.lang.Long r3 = java.lang.Long.valueOf(r28)     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            r4 = 2
            r1[r4] = r3     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r1)     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            return
        L_0x00ff:
            r0 = move-exception
            r1 = r0
            r5 = r7
            goto L_0x0803
        L_0x0104:
            r8.saveValue((java.lang.String) r2, (long) r9)     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r11.<init>()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.util.Set r2 = r5.keySet()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
        L_0x0114:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            if (r6 == 0) goto L_0x0132
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            long r28 = r6.longValue()     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            int r12 = (r28 > r32 ? 1 : (r28 == r32 ? 0 : -1))
            if (r12 <= 0) goto L_0x0114
            java.lang.Object r12 = r5.get(r6)     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            r11.put(r6, r12)     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            goto L_0x0114
        L_0x0132:
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r12.<init>()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r2.<init>()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r1.<init>()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r5.<init>()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r6.<init>()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r32 = r13
            r33 = r14
            r13 = 0
        L_0x0150:
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r14 = r7.f237966f     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            int r14 = r14.size()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.lang.String r8 = "pagestat"
            r34 = r9
            if (r13 >= r14) goto L_0x017d
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r10 = r7.f237966f     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            java.lang.Object r10 = r10.get(r13)     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            com.tencent.mm.modelstat.b$d r10 = (com.tencent.p014mm.modelstat.C81016b.C81022d) r10     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            java.lang.String r10 = r10.f237988f     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            boolean r10 = r8.equals(r10)     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            if (r10 == 0) goto L_0x0176
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r10 = r7.f237966f     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            java.lang.Object r10 = r10.get(r13)     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            com.tencent.mm.modelstat.b$d r10 = (com.tencent.p014mm.modelstat.C81016b.C81022d) r10     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
            goto L_0x017e
        L_0x0176:
            int r13 = r13 + 1
            r8 = r55
            r9 = r34
            goto L_0x0150
        L_0x017d:
            r10 = 0
        L_0x017e:
            java.lang.String r13 = "[oneliang] click flow session count:%s"
            r14 = 1
            java.lang.Object[] r9 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            int r14 = r11.size()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r25 = 0
            r9[r25] = r14     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r13, r9)     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.util.Set r9 = r11.keySet()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r13 = 0
            r28 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x01a1:
            boolean r36 = r9.hasNext()     // Catch:{ Exception -> 0x07f7, OutOfMemoryError -> 0x07f4 }
            r37 = r8
            if (r36 == 0) goto L_0x03dc
            java.lang.Object r36 = r9.next()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r8 = r36
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r38 = r8.longValue()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            int r36 = (r28 > r38 ? 1 : (r28 == r38 ? 0 : -1))
            if (r36 <= 0) goto L_0x01bd
            long r28 = r8.longValue()     // Catch:{ Exception -> 0x00b5, OutOfMemoryError -> 0x00ff }
        L_0x01bd:
            r36 = r9
            java.lang.String r9 = "find min key,min key:%s,cur key:%s"
            r38 = r1
            r7 = 2
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r7 = java.lang.Long.valueOf(r28)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r25 = 0
            r1[r25] = r7     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r7 = 1
            r1[r7] = r8     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r9, r1)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Object r1 = r11.get(r8)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            int r8 = r1.size()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            int r8 = r8 - r7
            java.lang.Object r7 = r1.get(r8)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            com.tencent.mm.modelstat.b$c r7 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r7     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r7 = r7.f237980g     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r9 = 0
            java.lang.Object r39 = r1.get(r9)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r9 = r39
            com.tencent.mm.modelstat.b$c r9 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r9     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r39 = r10
            long r9 = r9.f237978e     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r7 = r7 - r9
            long r13 = r13 + r7
            r7 = 0
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x03c3
            r7 = 172800000(0xa4cb800, double:8.53745436E-316)
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0205
            goto L_0x03c3
        L_0x0205:
            r7 = 0
            r8 = 0
        L_0x0207:
            int r9 = r1.size()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r10 = ","
            if (r7 >= r9) goto L_0x035d
            java.lang.Object r9 = r1.get(r7)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            com.tencent.mm.modelstat.b$c r9 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r9     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r40 = r1
            java.lang.String r1 = "pageIntervalMap page:%s old:%d  new[%d,%d,%d]"
            r41 = r11
            r42 = r13
            r11 = 5
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r11 = r9.f237977d     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r14 = 0
            r13[r14] = r11     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Object r11 = r12.get(r11)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r44 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r11)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r11 = java.lang.Long.valueOf(r44)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r14 = 1
            r13[r14] = r11     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r11 = r6
            r14 = r7
            long r6 = r9.f237980g     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r7 = 2
            r13[r7] = r6     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r6 = r9.f237978e     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r7 = 3
            r13[r7] = r6     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r6 = r9.f237980g     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r44 = r10
            r45 = r11
            long r10 = r9.f237978e     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r6 = r6 - r10
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r7 = 4
            r13[r7] = r6     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r15, r1, r13)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r10 = r9.f237980g     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r1 = r8
            long r7 = r9.f237978e     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r10 = r10 - r7
            r26 = 0
            int r13 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r13 < 0) goto L_0x0271
            r46 = 86400000(0x5265c00, double:4.2687272E-316)
            int r13 = (r10 > r46 ? 1 : (r10 == r46 ? 0 : -1))
            if (r13 <= 0) goto L_0x029a
        L_0x0271:
            java.lang.String r13 = "pageIntervalMap ErrorTime [%d,%d] now:%d diff:%d"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r8 = 0
            r6[r8] = r7     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r7 = r9.f237980g     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r8 = 1
            r6[r8] = r7     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r8 = 2
            r6[r8] = r7     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r8 = 3
            r6[r8] = r7     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r13, r6)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r10 = 0
        L_0x029a:
            java.lang.String r6 = r9.f237977d     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Object r7 = r12.get(r6)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r7)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r7 = r7 + r10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r12.put(r6, r7)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r6 = r9.f237977d     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Object r7 = r2.get(r6)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r7)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r10 = 1
            long r7 = r7 + r10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r2.put(r6, r7)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            if (r1 == 0) goto L_0x02f0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r6.<init>()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r1 = r1.f237977d     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r6.append(r1)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r1 = r44
            r6.append(r1)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r1 = r9.f237977d     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r6.append(r1)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Object r6 = r5.get(r1)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r6)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r6 = r6 + r10
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r5.put(r1, r6)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
        L_0x02f0:
            java.util.List<com.tencent.mm.modelstat.b$e> r1 = r9.f237982i     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            if (r1 == 0) goto L_0x034f
            java.lang.String r1 = r9.f237977d     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r6 = r45
            boolean r1 = r6.containsKey(r1)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            if (r1 == 0) goto L_0x0307
            java.lang.String r1 = r9.f237977d     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Object r1 = r6.get(r1)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            goto L_0x0311
        L_0x0307:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r1.<init>()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r7 = r9.f237977d     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r6.put(r7, r1)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
        L_0x0311:
            r7 = 0
        L_0x0312:
            java.util.List<com.tencent.mm.modelstat.b$e> r8 = r9.f237982i     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ Exception -> 0x0343, OutOfMemoryError -> 0x0340 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x0343, OutOfMemoryError -> 0x0340 }
            if (r7 >= r8) goto L_0x0351
            java.util.List<com.tencent.mm.modelstat.b$e> r8 = r9.f237982i     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ Exception -> 0x0343, OutOfMemoryError -> 0x0340 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ Exception -> 0x0343, OutOfMemoryError -> 0x0340 }
            com.tencent.mm.modelstat.b$e r8 = (com.tencent.p014mm.modelstat.C81016b.C29035e) r8     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r8.getClass()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r8 = 0
            java.lang.Object r13 = r1.get(r8)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r44 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r13)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            long r44 = r44 + r10
            java.lang.Long r13 = java.lang.Long.valueOf(r44)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r1.put(r8, r13)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            int r7 = r7 + 1
            goto L_0x0312
        L_0x0340:
            r0 = move-exception
            r1 = r0
            goto L_0x0346
        L_0x0343:
            r0 = move-exception
            r1 = r0
            goto L_0x034a
        L_0x0346:
            r5 = r51
            goto L_0x0803
        L_0x034a:
            r5 = r51
            r3 = r1
            goto L_0x00b8
        L_0x034f:
            r6 = r45
        L_0x0351:
            r8 = 0
            int r7 = r14 + 1
            r8 = r9
            r1 = r40
            r11 = r41
            r13 = r42
            goto L_0x0207
        L_0x035d:
            r1 = r10
            r41 = r11
            r42 = r13
            r8 = 0
            if (r39 == 0) goto L_0x03b1
            r9 = r39
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r7 = r9.f237990h     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
        L_0x036d:
            boolean r10 = r7.hasNext()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            if (r10 == 0) goto L_0x03ae
            java.lang.Object r10 = r7.next()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r11.<init>()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Object r13 = r10.first     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r11.append(r13)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r11.append(r1)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Object r13 = r10.second     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r11.append(r13)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            boolean r13 = r5.containsKey(r11)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            if (r13 == 0) goto L_0x03a9
            java.lang.Object r10 = r10.second     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Object r11 = r5.get(r11)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r13 = r38
            r13.put(r10, r11)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            goto L_0x03ab
        L_0x03a9:
            r13 = r38
        L_0x03ab:
            r38 = r13
            goto L_0x036d
        L_0x03ae:
            r13 = r38
            goto L_0x03b5
        L_0x03b1:
            r13 = r38
            r9 = r39
        L_0x03b5:
            r7 = r51
            r10 = r9
            r1 = r13
            r9 = r36
            r8 = r37
            r11 = r41
            r13 = r42
            goto L_0x01a1
        L_0x03c3:
            r42 = r13
            java.lang.String r1 = "reportStat ErrorTime sumInFg:%d"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            java.lang.Long r2 = java.lang.Long.valueOf(r42)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            r4 = 0
            r3[r4] = r2     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r3)     // Catch:{ Exception -> 0x03d6, OutOfMemoryError -> 0x07ec }
            return
        L_0x03d6:
            r0 = move-exception
            r5 = r51
            r3 = r0
            goto L_0x00b8
        L_0x03dc:
            r41 = r11
            r8 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r28)     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            r7 = r41
            java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            r9 = 0
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            com.tencent.mm.modelstat.b$c r5 = (com.tencent.p014mm.modelstat.C81016b.C81021c) r5     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            long r9 = r5.f237978e     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            java.lang.String r5 = "min key:%s,tbe:%s"
            r11 = 2
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            java.lang.Long r11 = java.lang.Long.valueOf(r28)     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            r25 = 0
            r8[r25] = r11     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            java.lang.Long r11 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            r20 = 1
            r8[r20] = r11     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r8)     // Catch:{ Exception -> 0x07f0, OutOfMemoryError -> 0x07ec }
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x07cc
            r26 = 0
            int r5 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r5 >= 0) goto L_0x0418
            goto L_0x07cc
        L_0x0418:
            r3 = 0
        L_0x0419:
            r28 = 1000(0x3e8, double:4.94E-321)
            r8 = r51
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r4 = r8.f237966f     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            int r4 = r4.size()     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            if (r3 >= r4) goto L_0x0444
            java.lang.String r4 = "appstat"
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r5 = r8.f237966f     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            com.tencent.mm.modelstat.b$d r5 = (com.tencent.p014mm.modelstat.C81016b.C81022d) r5     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            java.lang.String r5 = r5.f237988f     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            if (r4 == 0) goto L_0x0441
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r4 = r8.f237966f     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            com.tencent.mm.modelstat.b$d r3 = (com.tencent.p014mm.modelstat.C81016b.C81022d) r3     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            r11 = r3
            goto L_0x0445
        L_0x0441:
            int r3 = r3 + 1
            goto L_0x0419
        L_0x0444:
            r11 = 0
        L_0x0445:
            java.lang.String r3 = "[oneliang] end:%s,tbe:%s,sumInFg:%s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            java.lang.Long r5 = java.lang.Long.valueOf(r34)     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            r25 = 0
            r4[r25] = r5     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            r20 = 1
            r4[r20] = r5     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            r21 = 2
            r4[r21] = r5     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r4)     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            if (r11 == 0) goto L_0x0590
            long r3 = r34 - r9
            long r38 = r3 - r13
            r3 = 0
            int r5 = (r38 > r3 ? 1 : (r38 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0590
            long r3 = r11.f237985c     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            int r5 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r5 <= 0) goto L_0x056c
            float r4 = r11.f237986d     // Catch:{ Exception -> 0x05bf, OutOfMemoryError -> 0x05ba }
            r45 = r6
            long r5 = r8.f237969i     // Catch:{ Exception -> 0x0559, OutOfMemoryError -> 0x05ba }
            r3 = r1
            r1 = r51
            r48 = r2
            r49 = r3
            r2 = r52
            r54 = r12
            r12 = r19
            r50 = r45
            boolean r1 = r1.mo112890e(r2, r4, r5)     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            if (r1 == 0) goto L_0x0551
            java.lang.String r1 = "type: appstat, handle %s, now:%d"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            r2 = 0
            r3[r2] = r11     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            java.lang.Long r2 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            r4 = 1
            r3[r4] = r2     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r3)     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            r1.<init>()     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            r1.append(r12)     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            int r2 = r11.f237987e     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            r1.append(r2)     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0554, OutOfMemoryError -> 0x05ba }
            r5 = r55
            r2 = r37
            java.lang.Integer r1 = r5.getIntegerValue(r1)     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r1)     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            r3.<init>()     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            r3.append(r12)     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            int r4 = r11.f237987e     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            r3.append(r4)     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            int r4 = r1 + 1
            r5.saveValue((java.lang.String) r3, (int) r4)     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            r3.<init>()     // Catch:{ Exception -> 0x0546, OutOfMemoryError -> 0x05ba }
            r6 = r33
            r4 = 5
            org.json.JSONObject r4 = r3.put(r6, r4)     // Catch:{ Exception -> 0x0542, OutOfMemoryError -> 0x05ba }
            r33 = r6
            long r5 = r9 / r28
            r19 = r12
            r12 = r32
            org.json.JSONObject r4 = r4.put(r12, r5)     // Catch:{ Exception -> 0x053e, OutOfMemoryError -> 0x05ba }
            long r5 = r34 / r28
            r32 = r12
            r12 = r30
            org.json.JSONObject r4 = r4.put(r12, r5)     // Catch:{ Exception -> 0x0537, OutOfMemoryError -> 0x05ba }
            long r13 = r13 / r28
            r5 = r22
            org.json.JSONObject r4 = r4.put(r5, r13)     // Catch:{ Exception -> 0x0532, OutOfMemoryError -> 0x05ba }
            java.lang.String r6 = "inbg"
            long r13 = r38 / r28
            org.json.JSONObject r4 = r4.put(r6, r13)     // Catch:{ Exception -> 0x0532, OutOfMemoryError -> 0x05ba }
            java.lang.String r6 = "swc"
            int r7 = r7.size()     // Catch:{ Exception -> 0x0532, OutOfMemoryError -> 0x05ba }
            r4.put(r6, r7)     // Catch:{ Exception -> 0x0532, OutOfMemoryError -> 0x05ba }
            int r4 = r11.f237987e     // Catch:{ Exception -> 0x0532, OutOfMemoryError -> 0x05ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532, OutOfMemoryError -> 0x05ba }
            r6.<init>()     // Catch:{ Exception -> 0x0532, OutOfMemoryError -> 0x05ba }
            r7 = r17
            r6.append(r7)     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            int r11 = r11.f237983a     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            r6.append(r11)     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            r8.mo112893k(r4, r6, r1, r3)     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            goto L_0x05ea
        L_0x0532:
            r0 = move-exception
            r7 = r17
            goto L_0x05d0
        L_0x0537:
            r0 = move-exception
            r7 = r17
            r5 = r22
            goto L_0x05d0
        L_0x053e:
            r0 = move-exception
            r32 = r12
            goto L_0x0549
        L_0x0542:
            r0 = move-exception
            r33 = r6
            goto L_0x0547
        L_0x0546:
            r0 = move-exception
        L_0x0547:
            r19 = r12
        L_0x0549:
            r7 = r17
            r5 = r22
            r12 = r30
            goto L_0x05d0
        L_0x0551:
            r19 = r12
            goto L_0x0574
        L_0x0554:
            r0 = move-exception
            r19 = r12
            goto L_0x05c8
        L_0x0559:
            r0 = move-exception
            r49 = r1
            r48 = r2
            r54 = r12
            r7 = r17
            r5 = r22
            r12 = r30
            r2 = r37
            r50 = r45
            goto L_0x05d0
        L_0x056c:
            r49 = r1
            r48 = r2
            r50 = r6
            r54 = r12
        L_0x0574:
            r7 = r17
            r5 = r22
            r12 = r30
            r2 = r37
            java.lang.String r1 = "type: appstat, skip %s, now:%d"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            r3 = 0
            r4[r3] = r11     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            java.lang.Long r3 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            r6 = 1
            r4[r6] = r3     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r4)     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            goto L_0x05ea
        L_0x0590:
            r49 = r1
            r48 = r2
            r50 = r6
            r54 = r12
            r7 = r17
            r5 = r22
            r12 = r30
            r2 = r37
            java.lang.String r1 = "type: appstat, skip null, event:%s, (end - tbe - sumInFg):%s"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            r3 = 0
            r4[r3] = r11     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            long r26 = r34 - r9
            long r26 = r26 - r13
            java.lang.Long r3 = java.lang.Long.valueOf(r26)     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            r6 = 1
            r4[r6] = r3     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r4)     // Catch:{ Exception -> 0x05b8, OutOfMemoryError -> 0x05ba }
            goto L_0x05ea
        L_0x05b8:
            r0 = move-exception
            goto L_0x05d0
        L_0x05ba:
            r0 = move-exception
            r1 = r0
            r5 = r8
            goto L_0x0803
        L_0x05bf:
            r0 = move-exception
            r49 = r1
            r48 = r2
            r50 = r6
            r54 = r12
        L_0x05c8:
            r7 = r17
            r5 = r22
            r12 = r30
            r2 = r37
        L_0x05d0:
            r1 = r0
            r3 = 15006(0x3a9e, float:2.1028E-41)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ Exception -> 0x07c9, OutOfMemoryError -> 0x07c6 }
            m98927f(r3, r4)     // Catch:{ Exception -> 0x07c9, OutOfMemoryError -> 0x07c6 }
            java.lang.String r3 = "report ev:3 exception : %s"
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x07c9, OutOfMemoryError -> 0x07c6 }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ Exception -> 0x07c9, OutOfMemoryError -> 0x07c6 }
            r4 = 0
            r6[r4] = r1     // Catch:{ Exception -> 0x07c9, OutOfMemoryError -> 0x07c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r3, r6)     // Catch:{ Exception -> 0x07c9, OutOfMemoryError -> 0x07c6 }
        L_0x05ea:
            r1 = 0
        L_0x05eb:
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r3 = r8.f237966f     // Catch:{ Exception -> 0x07a2, OutOfMemoryError -> 0x07c6 }
            int r3 = r3.size()     // Catch:{ Exception -> 0x07a2, OutOfMemoryError -> 0x07c6 }
            if (r1 >= r3) goto L_0x0615
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r3 = r8.f237966f     // Catch:{ Exception -> 0x0610, OutOfMemoryError -> 0x05ba }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ Exception -> 0x0610, OutOfMemoryError -> 0x05ba }
            com.tencent.mm.modelstat.b$d r3 = (com.tencent.p014mm.modelstat.C81016b.C81022d) r3     // Catch:{ Exception -> 0x0610, OutOfMemoryError -> 0x05ba }
            java.lang.String r3 = r3.f237988f     // Catch:{ Exception -> 0x0610, OutOfMemoryError -> 0x05ba }
            boolean r3 = r2.equals(r3)     // Catch:{ Exception -> 0x0610, OutOfMemoryError -> 0x05ba }
            if (r3 == 0) goto L_0x060d
            java.util.ArrayList<com.tencent.mm.modelstat.b$d> r2 = r8.f237966f     // Catch:{ Exception -> 0x0610, OutOfMemoryError -> 0x05ba }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x0610, OutOfMemoryError -> 0x05ba }
            com.tencent.mm.modelstat.b$d r1 = (com.tencent.p014mm.modelstat.C81016b.C81022d) r1     // Catch:{ Exception -> 0x0610, OutOfMemoryError -> 0x05ba }
            r11 = r1
            goto L_0x0616
        L_0x060d:
            int r1 = r1 + 1
            goto L_0x05eb
        L_0x0610:
            r0 = move-exception
            r1 = r0
            r5 = r8
            goto L_0x07a5
        L_0x0615:
            r11 = 0
        L_0x0616:
            if (r11 == 0) goto L_0x0797
            long r1 = r11.f237985c     // Catch:{ Exception -> 0x07a2, OutOfMemoryError -> 0x07c6 }
            int r3 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r3 <= 0) goto L_0x0781
            float r4 = r11.f237986d     // Catch:{ Exception -> 0x07a2, OutOfMemoryError -> 0x07c6 }
            long r13 = r8.f237969i     // Catch:{ Exception -> 0x07a2, OutOfMemoryError -> 0x07c6 }
            r1 = r51
            r2 = r52
            r8 = r55
            r17 = r7
            r30 = r12
            r7 = r33
            r12 = r5
            r5 = r13
            boolean r1 = r1.mo112890e(r2, r4, r5)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            if (r1 == 0) goto L_0x077a
            java.lang.String r1 = "type: pagestat, handle %s, now:%d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r3 = 0
            r2[r3] = r11     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.Long r3 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r4 = 1
            r2[r4] = r3     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r2)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r1.<init>()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r2 = r19
            r1.append(r2)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            int r3 = r11.f237987e     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r1.append(r3)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.Integer r1 = r8.getIntegerValue(r1)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r1)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r3.<init>()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r3.append(r2)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            int r2 = r11.f237987e     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r3.append(r2)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            int r3 = r1 + 1
            r8.saveValue((java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r2.<init>()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.util.Set r3 = r54.keySet()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
        L_0x0687:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            if (r4 == 0) goto L_0x073a
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r5.<init>()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.String r6 = "p"
            org.json.JSONObject r6 = r5.put(r6, r4)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r8 = r54
            java.lang.Object r13 = r8.get(r4)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            long r13 = r13.longValue()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            long r13 = r13 / r28
            org.json.JSONObject r6 = r6.put(r12, r13)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r13 = r48
            java.lang.Object r14 = r13.get(r4)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r52 = r3
            r3 = r18
            org.json.JSONObject r6 = r6.put(r3, r14)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.String r14 = "c2"
            r54 = r8
            r22 = r12
            r8 = r49
            java.lang.Object r12 = r8.get(r4)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r6.put(r14, r12)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r6 = r50
            boolean r12 = r6.containsKey(r4)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            if (r12 == 0) goto L_0x0727
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r12.<init>()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.Object r4 = r6.get(r4)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.util.Set r14 = r4.keySet()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
        L_0x06e9:
            boolean r18 = r14.hasNext()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            if (r18 == 0) goto L_0x071a
            java.lang.Object r18 = r14.next()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r50 = r6
            r6 = r18
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r38 = r8
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r8.<init>()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r48 = r13
            java.lang.String r13 = "w"
            org.json.JSONObject r13 = r8.put(r13, r6)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.Object r6 = r4.get(r6)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r13.put(r3, r6)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r12.put(r8)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r8 = r38
            r13 = r48
            r6 = r50
            goto L_0x06e9
        L_0x071a:
            r50 = r6
            r38 = r8
            r48 = r13
            java.lang.String r4 = "wa"
            r5.put(r4, r12)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            goto L_0x072d
        L_0x0727:
            r50 = r6
            r38 = r8
            r48 = r13
        L_0x072d:
            r2.put(r5)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r18 = r3
            r12 = r22
            r49 = r38
            r3 = r52
            goto L_0x0687
        L_0x073a:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r3.<init>()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r4 = 6
            org.json.JSONObject r4 = r3.put(r7, r4)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            long r9 = r9 / r28
            r5 = r32
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            long r9 = r34 / r28
            r5 = r30
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.String r5 = "pa"
            r4.put(r5, r2)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            int r2 = r11.f237987e     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r4.<init>()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r5 = r17
            r4.append(r5)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            int r5 = r11.f237983a     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r4.append(r5)     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x077d, OutOfMemoryError -> 0x07ec }
            r5 = r51
            r5.mo112893k(r2, r4, r1, r3)     // Catch:{ Exception -> 0x07a0, OutOfMemoryError -> 0x07e8 }
            goto L_0x082d
        L_0x077a:
            r5 = r51
            goto L_0x0782
        L_0x077d:
            r0 = move-exception
            r5 = r51
            goto L_0x07a4
        L_0x0781:
            r5 = r8
        L_0x0782:
            java.lang.String r1 = "type: pagestat, skip %s, now:%d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x07a0, OutOfMemoryError -> 0x07e8 }
            r3 = 0
            r2[r3] = r11     // Catch:{ Exception -> 0x07a0, OutOfMemoryError -> 0x07e8 }
            java.lang.Long r3 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x07a0, OutOfMemoryError -> 0x07e8 }
            r4 = 1
            r2[r4] = r3     // Catch:{ Exception -> 0x07a0, OutOfMemoryError -> 0x07e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r2)     // Catch:{ Exception -> 0x07a0, OutOfMemoryError -> 0x07e8 }
            goto L_0x082d
        L_0x0797:
            r5 = r8
            java.lang.String r1 = "type: pagestat, skip null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)     // Catch:{ Exception -> 0x07a0, OutOfMemoryError -> 0x07e8 }
            goto L_0x082d
        L_0x07a0:
            r0 = move-exception
            goto L_0x07a4
        L_0x07a2:
            r0 = move-exception
            r5 = r8
        L_0x07a4:
            r1 = r0
        L_0x07a5:
            r2 = 15007(0x3a9f, float:2.1029E-41)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ Exception -> 0x07c4, OutOfMemoryError -> 0x07e8 }
            m98927f(r2, r3)     // Catch:{ Exception -> 0x07c4, OutOfMemoryError -> 0x07e8 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x07c4, OutOfMemoryError -> 0x07e8 }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ Exception -> 0x07c4, OutOfMemoryError -> 0x07e8 }
            r2 = 0
            r3[r2] = r1     // Catch:{ Exception -> 0x07bf, OutOfMemoryError -> 0x07e8 }
            r1 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r3)     // Catch:{ Exception -> 0x07ea, OutOfMemoryError -> 0x07e8 }
            goto L_0x082d
        L_0x07bf:
            r0 = move-exception
            r1 = r16
            goto L_0x0820
        L_0x07c4:
            r0 = move-exception
            goto L_0x07f9
        L_0x07c6:
            r0 = move-exception
            r5 = r8
            goto L_0x0802
        L_0x07c9:
            r0 = move-exception
            r5 = r8
            goto L_0x07f9
        L_0x07cc:
            r5 = r51
            r1 = r16
            java.lang.String r2 = "reportStat ErroTime tbe:%d now:%d"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x07ea, OutOfMemoryError -> 0x07e8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x07ea, OutOfMemoryError -> 0x07e8 }
            r8 = 0
            r6[r8] = r7     // Catch:{ Exception -> 0x07ea, OutOfMemoryError -> 0x07e8 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x07ea, OutOfMemoryError -> 0x07e8 }
            r4 = 1
            r6[r4] = r3     // Catch:{ Exception -> 0x07ea, OutOfMemoryError -> 0x07e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r2, r6)     // Catch:{ Exception -> 0x07ea, OutOfMemoryError -> 0x07e8 }
            return
        L_0x07e8:
            r0 = move-exception
            goto L_0x0802
        L_0x07ea:
            r0 = move-exception
            goto L_0x07fb
        L_0x07ec:
            r0 = move-exception
            r5 = r51
            goto L_0x0802
        L_0x07f0:
            r0 = move-exception
            r5 = r51
            goto L_0x07f9
        L_0x07f4:
            r0 = move-exception
            r5 = r7
            goto L_0x0802
        L_0x07f7:
            r0 = move-exception
            r5 = r7
        L_0x07f9:
            r1 = r16
        L_0x07fb:
            r3 = r0
        L_0x07fc:
            r2 = 0
            goto L_0x0821
        L_0x07fe:
            r0 = move-exception
            r5 = r7
            r31 = r11
        L_0x0802:
            r1 = r0
        L_0x0803:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r31)
            java.lang.System.gc()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "OutOfMemoryError"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r1, r3, r2)
            r2 = 15010(0x3aa2, float:2.1033E-41)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            m98927f(r2, r1)
            goto L_0x082d
        L_0x081b:
            r0 = move-exception
            r5 = r7
            r1 = r16
            r2 = 0
        L_0x0820:
            r3 = r0
        L_0x0821:
            r6 = 1
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)
            r4[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r4)
        L_0x082d:
            return
        L_0x082e:
            r5 = r7
            r34 = r9
            r2 = 0
            r6 = 1
            r1 = 2
        L_0x0834:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Long r7 = java.lang.Long.valueOf(r34)
            r1[r2] = r7
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r1[r6] = r2
            java.lang.String r2 = "reportStat  ErrorTime end:%d now:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C81016b.mo112896n(long, java.util.ArrayList, com.tencent.mm.sdk.storage.ConfigFile):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:1|(5:2|3|4|5|(4:6|7|8|9))|10|11|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r10 == null) goto L_0x006a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x007b */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[SYNTHETIC, Splitter:B:25:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f A[SYNTHETIC, Splitter:B:34:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078 A[SYNTHETIC, Splitter:B:39:0x0078] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo112897o(java.lang.String r10, java.util.HashMap<java.lang.Long, java.util.ArrayList<com.tencent.p014mm.modelstat.C81016b.C81021c>> r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 0
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            java.io.OutputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106429K(r10, r3)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0043 }
            r6.<init>(r10)     // Catch:{ Exception -> 0x0043 }
            r6.writeObject(r11)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r10.flush()     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            java.lang.String r2 = "MicroMsg.ClickFlowStatReceiver"
            java.lang.String r7 = "writeStorage count:%d time:%d"
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            int r11 = r11.size()     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r8[r3] = r11     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r4)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r8[r0] = r11     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r8)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r6.close()     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            r10.close()     // Catch:{ Exception -> 0x006a }
            goto L_0x006a
        L_0x003d:
            r11 = move-exception
            r2 = r6
            goto L_0x006d
        L_0x0040:
            r11 = move-exception
            r2 = r6
            goto L_0x004a
        L_0x0043:
            r11 = move-exception
            goto L_0x004a
        L_0x0045:
            r11 = move-exception
            r10 = r2
            goto L_0x006d
        L_0x0048:
            r11 = move-exception
            r10 = r2
        L_0x004a:
            java.lang.String r4 = "MicroMsg.ClickFlowStatReceiver"
            java.lang.String r5 = "writeStorage exception: %s [%s]"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x006c }
            java.lang.String r6 = r11.getMessage()     // Catch:{ all -> 0x006c }
            r1[r3] = r6     // Catch:{ all -> 0x006c }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r11)     // Catch:{ all -> 0x006c }
            r1[r0] = r11     // Catch:{ all -> 0x006c }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r1)     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ Exception -> 0x0066 }
            goto L_0x0067
        L_0x0066:
        L_0x0067:
            if (r10 == 0) goto L_0x006a
            goto L_0x0039
        L_0x006a:
            monitor-exit(r9)
            return
        L_0x006c:
            r11 = move-exception
        L_0x006d:
            if (r2 == 0) goto L_0x0076
            r2.close()     // Catch:{ Exception -> 0x0075 }
            goto L_0x0076
        L_0x0073:
            r10 = move-exception
            goto L_0x007c
        L_0x0075:
        L_0x0076:
            if (r10 == 0) goto L_0x007b
            r10.close()     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            throw r11     // Catch:{ all -> 0x0073 }
        L_0x007c:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C81016b.mo112897o(java.lang.String, java.util.HashMap):void");
    }
}
