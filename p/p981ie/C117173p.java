package p981ie;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.system.Os;
import com.eclipsesource.mmv8.Platform;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p723vf.C118672d;

/* renamed from: ie.p */
public class C117173p {

    /* renamed from: b */
    public static C117173p f351028b;

    /* renamed from: c */
    public static final HashMap<String, Double> f351029c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<String, Double[]> f351030d = new HashMap<>();

    /* renamed from: e */
    public static final Object f351031e = new Object();

    /* renamed from: f */
    public static String f351032f = "unknown";

    /* renamed from: a */
    public C117175b[] f351033a;

    /* renamed from: ie.p$c */
    public static class C108458c {
        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: a */
        public static void m146952a(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4) {
            /*
            L_0x0000:
                int r0 = r3.next()
                r1 = 2
                if (r0 == r1) goto L_0x000b
                r2 = 1
                if (r0 == r2) goto L_0x000b
                goto L_0x0000
            L_0x000b:
                if (r0 != r1) goto L_0x003b
                java.lang.String r0 = r3.getName()
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x0018
                return
            L_0x0018:
                org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected start tag: found "
                r1.append(r2)
                java.lang.String r3 = r3.getName()
                r1.append(r3)
                java.lang.String r3 = ", expected "
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L_0x003b:
                org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
                java.lang.String r4 = "No start tag found"
                r3.<init>(r4)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p981ie.C117173p.C108458c.m146952a(org.xmlpull.v1.XmlPullParser, java.lang.String):void");
        }
    }

    /* renamed from: ie.p$a */
    public class C117174a implements Callable<File> {
        public C117174a(C117173p pVar) {
        }

        public Object call() {
            String[] split = Os.getenv("CUST_POLICY_DIRS").split(XVFSFile.PATH_SEPARATOR);
            int length = split.length;
            int i = 0;
            while (i < length) {
                File file = new File(split[i], "/xml/power_profile.xml");
                if (!file.exists() || !file.canRead()) {
                    i++;
                } else {
                    C118672d.m167353c("PowerProfile", "find profile xml: " + file, new Object[0]);
                    return file;
                }
            }
            throw new FileNotFoundException("/xml/power_profile.xml");
        }
    }

    /* renamed from: ie.p$b */
    public static class C117175b {

        /* renamed from: a */
        public final String f351034a;

        /* renamed from: b */
        public final String f351035b;

        /* renamed from: c */
        public final String f351036c;

        /* renamed from: d */
        public final int f351037d;

        public C117175b(String str, String str2, String str3, int i, C117174a aVar) {
            this.f351034a = str;
            this.f351035b = str2;
            this.f351036c = str3;
            this.f351037d = i;
        }
    }

    public C117173p(Context context) {
        synchronized (f351031e) {
            if (f351029c.size() == 0 && f351030d.size() == 0) {
                try {
                    mo181095m(context);
                } catch (IOException e) {
                    C118672d.m167356f("PowerProfile", "Failed to read power values: " + e, new Object[0]);
                }
            }
            mo181093k();
        }
    }

    /* renamed from: j */
    public static C117173p m165234j(Context context) {
        C117173p pVar;
        synchronized (f351031e) {
            try {
                if (f351028b == null) {
                    C117173p pVar2 = new C117173p(context);
                    pVar2.mo181099q();
                    f351028b = pVar2;
                }
                pVar = f351028b;
            } catch (Throwable th) {
                throw new IOException("Compat err: " + th.getMessage(), th);
            }
        }
        return pVar;
    }

    /* renamed from: a */
    public double mo181084a(String str) {
        HashMap<String, Double> hashMap = f351029c;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).doubleValue();
        }
        HashMap<String, Double[]> hashMap2 = f351030d;
        if (hashMap2.containsKey(str)) {
            return hashMap2.get(str)[0].doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: b */
    public double mo181085b(String str, int i) {
        HashMap<String, Double> hashMap = f351029c;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).doubleValue();
        }
        HashMap<String, Double[]> hashMap2 = f351030d;
        if (hashMap2.containsKey(str)) {
            Double[] dArr = hashMap2.get(str);
            if (dArr.length > i && i >= 0) {
                return dArr[i].doubleValue();
            }
            if (i >= 0 && dArr.length != 0) {
                return dArr[dArr.length - 1].doubleValue();
            }
        }
        return 0.0d;
    }

    /* renamed from: c */
    public double mo181086c(int i) {
        if (i < 0) {
            return 0.0d;
        }
        C117175b[] bVarArr = this.f351033a;
        if (i < bVarArr.length) {
            return mo181084a(bVarArr[i].f351035b);
        }
        return 0.0d;
    }

    /* renamed from: d */
    public double mo181087d(int i, int i2) {
        if (i < 0) {
            return 0.0d;
        }
        C117175b[] bVarArr = this.f351033a;
        if (i < bVarArr.length) {
            return mo181085b(bVarArr[i].f351036c, i2);
        }
        return 0.0d;
    }

    /* renamed from: e */
    public double mo181088e(String str) {
        int h = mo181091h(str);
        if (h <= 0) {
            return mo181084a(str);
        }
        double d = 0.0d;
        for (int i = 0; i < h; i++) {
            d += mo181085b(str, i);
        }
        return d / ((double) h);
    }

    /* renamed from: f */
    public int mo181089f(int i) {
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C117175b[] bVarArr = this.f351033a;
            if (i2 >= bVarArr.length) {
                return -2;
            }
            int i4 = bVarArr[i2].f351037d;
            if (i4 + i3 >= i + 1) {
                return i2;
            }
            i3 += i4;
            i2++;
        }
    }

    /* renamed from: g */
    public int mo181090g() {
        int i = 0;
        int i2 = 0;
        while (true) {
            C117175b[] bVarArr = this.f351033a;
            if (i >= bVarArr.length) {
                return i2;
            }
            i2 += bVarArr[i].f351037d;
            i++;
        }
    }

    /* renamed from: h */
    public int mo181091h(String str) {
        if (f351029c.containsKey(str)) {
            return 1;
        }
        HashMap<String, Double[]> hashMap = f351030d;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).length;
        }
        return 0;
    }

    /* renamed from: i */
    public int mo181092i(int i) {
        if (i < 0) {
            return 0;
        }
        C117175b[] bVarArr = this.f351033a;
        if (i >= bVarArr.length) {
            return 0;
        }
        HashMap<String, Double[]> hashMap = f351030d;
        if (hashMap.containsKey(bVarArr[i].f351034a)) {
            return hashMap.get(this.f351033a[i].f351034a).length;
        }
        return 1;
    }

    /* renamed from: k */
    public void mo181093k() {
        HashMap<String, Double[]> hashMap = f351030d;
        if (hashMap.containsKey("cpu.clusters.cores")) {
            Double[] dArr = hashMap.get("cpu.clusters.cores");
            this.f351033a = new C117175b[dArr.length];
            for (int i = 0; i < dArr.length; i++) {
                int round = (int) Math.round(dArr[i].doubleValue());
                this.f351033a[i] = new C117175b("cpu.core_speeds.cluster" + i, "cpu.cluster_power.cluster" + i, "cpu.core_power.cluster" + i, round, (C117174a) null);
            }
            return;
        }
        this.f351033a = new C117175b[1];
        HashMap<String, Double> hashMap2 = f351029c;
        this.f351033a[0] = new C117175b("cpu.core_speeds.cluster0", "cpu.cluster_power.cluster0", "cpu.core_power.cluster0", hashMap2.containsKey("cpu.clusters.cores") ? (int) Math.round(hashMap2.get("cpu.clusters.cores").doubleValue()) : 1, (C117174a) null);
    }

    /* renamed from: l */
    public boolean mo181094l() {
        try {
            mo181099q();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public final void mo181095m(Context context) {
        Exception exc = null;
        try {
            mo181097o(context, "power_profile");
            mo181093k();
            mo181099q();
            f351032f = "framework";
            e = null;
        } catch (Exception e) {
            e = e;
            C118672d.m167356f("PowerProfile", "read from framework failed: " + e, new Object[0]);
            f351029c.clear();
            f351030d.clear();
        }
        if (e != null) {
            try {
                mo181096n(context, (File) new C117174a(this).call());
                mo181093k();
                mo181099q();
                f351032f = "custom";
                e = null;
            } catch (Exception e2) {
                e = e2;
                C118672d.m167356f("PowerProfile", "read from custom failed: " + e, new Object[0]);
                f351029c.clear();
                f351030d.clear();
            }
        }
        if (e != null) {
            try {
                mo181097o(context, "power_profile_test");
                mo181093k();
                mo181099q();
                f351032f = APMidasPayAPI.ENV_TEST;
            } catch (Exception e3) {
                exc = e3;
                C118672d.m167356f("PowerProfile", "read from test failed: " + exc, new Object[0]);
                f351029c.clear();
                f351030d.clear();
            }
        } else {
            exc = e;
        }
        if (exc != null) {
            throw new IOException("readPowerValuesCompat failed", exc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo181096n(android.content.Context r5, java.io.File r6) {
        /*
            r4 = this;
            r0 = 0
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x0024 }
            r2 = 1
            r1.setNamespaceAware(r2)     // Catch:{ Exception -> 0x0024 }
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()     // Catch:{ Exception -> 0x0024 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0024 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0024 }
            r1.setInput(r2, r0)     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            r4.mo181098p(r5, r1)     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            r2.close()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return
        L_0x001c:
            r5 = move-exception
            r0 = r2
            goto L_0x0048
        L_0x001f:
            r5 = move-exception
            r0 = r2
            goto L_0x0025
        L_0x0022:
            r5 = move-exception
            goto L_0x0048
        L_0x0024:
            r5 = move-exception
        L_0x0025:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0022 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
            r2.<init>()     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = "Error reading file "
            r2.append(r3)     // Catch:{ all -> 0x0022 }
            r2.append(r6)     // Catch:{ all -> 0x0022 }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x0022 }
            java.lang.String r6 = r5.getMessage()     // Catch:{ all -> 0x0022 }
            r2.append(r6)     // Catch:{ all -> 0x0022 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0022 }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x0022 }
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            r0.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p981ie.C117173p.mo181096n(android.content.Context, java.io.File):void");
    }

    /* renamed from: o */
    public void mo181097o(Context context, String str) {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = context.getResources().getXml(context.getResources().getIdentifier(str, "xml", Platform.ANDROID));
            mo181098p(context, xmlResourceParser);
            try {
                xmlResourceParser.close();
            } catch (Exception unused) {
            }
        } catch (Exception e) {
            throw new RuntimeException("Error reading res " + str + ": " + e.getMessage(), e);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                try {
                    xmlResourceParser.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:42|43|44|45|46|(2:48|63)(1:(2:50|65)(1:64))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0101 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107 A[Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112 A[Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo181098p(android.content.Context r16, org.xmlpull.v1.XmlPullParser r17) {
        /*
            r15 = this;
            r0 = r17
            java.lang.String r1 = "item"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "device"
            p981ie.C117173p.C108458c.m146952a(r0, r3)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            r3 = 0
            r4 = 0
            r6 = r3
            r5 = 0
        L_0x0012:
            int r7 = r17.next()     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            r8 = 2
            r9 = 1
            if (r7 == r8) goto L_0x001d
            if (r7 == r9) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            java.lang.String r7 = r17.getName()     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            r10 = 0
            r12 = 4
            if (r7 != 0) goto L_0x00ad
            if (r5 == 0) goto L_0x0037
            java.util.HashMap<java.lang.String, java.lang.Double[]> r0 = f351030d     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            int r1 = r2.size()     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            java.lang.Double[] r1 = new java.lang.Double[r1]     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            java.lang.Object[] r1 = r2.toArray(r1)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            r0.put(r6, r1)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
        L_0x0037:
            int[] r0 = new int[r12]
            android.content.res.Resources r1 = r16.getResources()
            java.lang.String r2 = "config_bluetooth_idle_cur_ma"
            java.lang.String r3 = "integer"
            java.lang.String r5 = "android"
            int r1 = r1.getIdentifier(r2, r3, r5)
            r0[r4] = r1
            android.content.res.Resources r1 = r16.getResources()
            java.lang.String r2 = "config_bluetooth_rx_cur_ma"
            int r1 = r1.getIdentifier(r2, r3, r5)
            r0[r9] = r1
            android.content.res.Resources r1 = r16.getResources()
            java.lang.String r2 = "config_bluetooth_tx_cur_ma"
            int r1 = r1.getIdentifier(r2, r3, r5)
            r0[r8] = r1
            r1 = 3
            android.content.res.Resources r2 = r16.getResources()
            java.lang.String r6 = "config_bluetooth_operating_voltage_mv"
            int r2 = r2.getIdentifier(r6, r3, r5)
            r0[r1] = r2
            java.lang.String r1 = "bluetooth.controller.idle"
            java.lang.String r2 = "bluetooth.controller.rx"
            java.lang.String r3 = "bluetooth.controller.tx"
            java.lang.String r5 = "bluetooth.controller.voltage"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r5}
        L_0x007a:
            if (r4 >= r12) goto L_0x00ac
            r2 = r1[r4]
            java.util.HashMap<java.lang.String, java.lang.Double> r3 = f351029c
            boolean r5 = r3.containsKey(r2)
            if (r5 == 0) goto L_0x0095
            java.lang.Object r5 = r3.get(r2)
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0095
            goto L_0x00a9
        L_0x0095:
            android.content.res.Resources r5 = r16.getResources()
            r6 = r0[r4]
            int r5 = r5.getInteger(r6)
            if (r5 <= 0) goto L_0x00a9
            double r5 = (double) r5
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r3.put(r2, r5)
        L_0x00a9:
            int r4 = r4 + 1
            goto L_0x007a
        L_0x00ac:
            return
        L_0x00ad:
            java.lang.String r8 = "value"
            if (r5 == 0) goto L_0x00c7
            boolean r13 = r7.equals(r8)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            if (r13 != 0) goto L_0x00c7
            java.util.HashMap<java.lang.String, java.lang.Double[]> r5 = f351030d     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            int r13 = r2.size()     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            java.lang.Double[] r13 = new java.lang.Double[r13]     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            java.lang.Object[] r13 = r2.toArray(r13)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            r5.put(r6, r13)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            r5 = 0
        L_0x00c7:
            java.lang.String r13 = "array"
            boolean r13 = r7.equals(r13)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            java.lang.String r14 = "name"
            if (r13 == 0) goto L_0x00db
            r2.clear()     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            java.lang.String r6 = r0.getAttributeValue(r3, r14)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            r5 = 1
            goto L_0x0012
        L_0x00db:
            boolean r9 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            if (r9 != 0) goto L_0x00e7
            boolean r8 = r7.equals(r8)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            if (r8 == 0) goto L_0x0012
        L_0x00e7:
            if (r5 != 0) goto L_0x00ee
            java.lang.String r8 = r0.getAttributeValue(r3, r14)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            goto L_0x00ef
        L_0x00ee:
            r8 = r3
        L_0x00ef:
            int r9 = r17.next()     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            if (r9 != r12) goto L_0x0012
            java.lang.String r9 = r17.getText()     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch:{ NumberFormatException -> 0x0101 }
            double r10 = r9.doubleValue()     // Catch:{ NumberFormatException -> 0x0101 }
        L_0x0101:
            boolean r7 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            if (r7 == 0) goto L_0x0112
            java.util.HashMap<java.lang.String, java.lang.Double> r7 = f351029c     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            java.lang.Double r9 = java.lang.Double.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            r7.put(r8, r9)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            goto L_0x0012
        L_0x0112:
            if (r5 == 0) goto L_0x0012
            java.lang.Double r7 = java.lang.Double.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            r2.add(r7)     // Catch:{ XmlPullParserException -> 0x0124, IOException -> 0x011d }
            goto L_0x0012
        L_0x011d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0124:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p981ie.C117173p.mo181098p(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: q */
    public C117173p mo181099q() {
        if (this.f351033a.length > 0) {
            int i = 0;
            while (i < this.f351033a.length) {
                if (mo181092i(i) > 0) {
                    i++;
                } else {
                    throw new IOException("Invalid cpu cluster speed-steps: cluster = " + i + ", steps = " + mo181092i(i));
                }
            }
            int k = C117159b.m165210k();
            int g = mo181090g();
            if (k == g) {
                return this;
            }
            throw new IOException("Unmatched cpu core num, sys = " + k + ", profile = " + g);
        }
        throw new IOException("Invalid cpu clusters: " + this.f351033a.length);
    }
}
