package p212oe;

import android.content.Context;
import android.content.res.XmlResourceParser;
import com.eclipsesource.mmv8.Platform;
import java.util.HashMap;

/* renamed from: oe.x */
public final class C117781x {

    /* renamed from: b */
    public static final HashMap<String, Double> f352296b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, Double[]> f352297c = new HashMap<>();

    /* renamed from: a */
    public C117782b[] f352298a;

    /* renamed from: oe.x$c */
    public static class C110038c {
        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: a */
        public static void m149546a(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: p212oe.C117781x.C110038c.m149546a(org.xmlpull.v1.XmlPullParser, java.lang.String):void");
        }
    }

    /* renamed from: oe.x$b */
    public static class C117782b {

        /* renamed from: a */
        public final String f352299a;

        /* renamed from: b */
        public final String f352300b;

        /* renamed from: c */
        public final String f352301c;

        public C117782b(String str, String str2, String str3, int i, C110037a aVar) {
            this.f352299a = str;
            this.f352300b = str2;
            this.f352301c = str3;
        }
    }

    /* renamed from: a */
    public double mo182536a(String str) {
        HashMap<String, Double> hashMap = f352296b;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).doubleValue();
        }
        HashMap<String, Double[]> hashMap2 = f352297c;
        if (hashMap2.containsKey(str)) {
            return hashMap2.get(str)[0].doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: b */
    public double mo182537b(String str, int i) {
        HashMap<String, Double> hashMap = f352296b;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).doubleValue();
        }
        HashMap<String, Double[]> hashMap2 = f352297c;
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
    public double mo182538c(String str) {
        int i;
        if (f352296b.containsKey(str)) {
            i = 1;
        } else {
            HashMap<String, Double[]> hashMap = f352297c;
            i = hashMap.containsKey(str) ? hashMap.get(str).length : 0;
        }
        if (i <= 0) {
            return mo182536a(str);
        }
        double d = 0.0d;
        for (int i2 = 0; i2 < i; i2++) {
            d += mo182537b(str, i2);
        }
        return d / ((double) i);
    }

    /* renamed from: d */
    public void mo182539d() {
        HashMap<String, Double[]> hashMap = f352297c;
        if (hashMap.containsKey("cpu.clusters.cores")) {
            Double[] dArr = hashMap.get("cpu.clusters.cores");
            this.f352298a = new C117782b[dArr.length];
            for (int i = 0; i < dArr.length; i++) {
                int round = (int) Math.round(dArr[i].doubleValue());
                this.f352298a[i] = new C117782b("cpu.core_speeds.cluster" + i, "cpu.cluster_power.cluster" + i, "cpu.core_power.cluster" + i, round, (C110037a) null);
            }
            return;
        }
        this.f352298a = new C117782b[1];
        HashMap<String, Double> hashMap2 = f352296b;
        this.f352298a[0] = new C117782b("cpu.core_speeds.cluster0", "cpu.cluster_power.cluster0", "cpu.core_power.cluster0", hashMap2.containsKey("cpu.clusters.cores") ? (int) Math.round(hashMap2.get("cpu.clusters.cores").doubleValue()) : 1, (C110037a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo182540e(android.content.Context r5, java.io.File r6) {
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
            r4.mo182542g(r5, r1)     // Catch:{ Exception -> 0x001f, all -> 0x001c }
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
        throw new UnsupportedOperationException("Method not decompiled: p212oe.C117781x.mo182540e(android.content.Context, java.io.File):void");
    }

    /* renamed from: f */
    public void mo182541f(Context context, String str) {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = context.getResources().getXml(context.getResources().getIdentifier(str, "xml", Platform.ANDROID));
            mo182542g(context, xmlResourceParser);
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
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0105 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010b A[Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0116 A[Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo182542g(android.content.Context r16, org.xmlpull.v1.XmlPullParser r17) {
        /*
            r15 = this;
            r0 = r17
            java.lang.String r1 = "item"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "device"
            p212oe.C117781x.C110038c.m149546a(r0, r3)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            r3 = 0
            r4 = 0
            r6 = r3
            r5 = 0
        L_0x0012:
            int r7 = r17.next()     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            r8 = 2
            r9 = 1
            if (r7 == r8) goto L_0x001d
            if (r7 == r9) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            java.lang.String r7 = r17.getName()     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            r10 = 0
            r12 = 4
            if (r7 != 0) goto L_0x00af
            if (r5 == 0) goto L_0x0039
            java.util.HashMap<java.lang.String, java.lang.Double[]> r0 = f352297c     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            int r1 = r2.size()     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.Double[] r1 = new java.lang.Double[r1]     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.Object[] r1 = r2.toArray(r1)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.Double[] r1 = (java.lang.Double[]) r1     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            r0.put(r6, r1)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
        L_0x0039:
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
        L_0x007c:
            if (r4 >= r12) goto L_0x00ae
            r2 = r1[r4]
            java.util.HashMap<java.lang.String, java.lang.Double> r3 = f352296b
            boolean r5 = r3.containsKey(r2)
            if (r5 == 0) goto L_0x0097
            java.lang.Object r5 = r3.get(r2)
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0097
            goto L_0x00ab
        L_0x0097:
            android.content.res.Resources r5 = r16.getResources()
            r6 = r0[r4]
            int r5 = r5.getInteger(r6)
            if (r5 <= 0) goto L_0x00ab
            double r5 = (double) r5
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r3.put(r2, r5)
        L_0x00ab:
            int r4 = r4 + 1
            goto L_0x007c
        L_0x00ae:
            return
        L_0x00af:
            java.lang.String r8 = "value"
            if (r5 == 0) goto L_0x00cb
            boolean r13 = r7.equals(r8)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            if (r13 != 0) goto L_0x00cb
            java.util.HashMap<java.lang.String, java.lang.Double[]> r5 = f352297c     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            int r13 = r2.size()     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.Double[] r13 = new java.lang.Double[r13]     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.Object[] r13 = r2.toArray(r13)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.Double[] r13 = (java.lang.Double[]) r13     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            r5.put(r6, r13)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            r5 = 0
        L_0x00cb:
            java.lang.String r13 = "array"
            boolean r13 = r7.equals(r13)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.String r14 = "name"
            if (r13 == 0) goto L_0x00df
            r2.clear()     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.String r6 = r0.getAttributeValue(r3, r14)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            r5 = 1
            goto L_0x0012
        L_0x00df:
            boolean r9 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            if (r9 != 0) goto L_0x00eb
            boolean r8 = r7.equals(r8)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            if (r8 == 0) goto L_0x0012
        L_0x00eb:
            if (r5 != 0) goto L_0x00f2
            java.lang.String r8 = r0.getAttributeValue(r3, r14)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            goto L_0x00f3
        L_0x00f2:
            r8 = r3
        L_0x00f3:
            int r9 = r17.next()     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            if (r9 != r12) goto L_0x0012
            java.lang.String r9 = r17.getText()     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch:{ NumberFormatException -> 0x0105 }
            double r10 = r9.doubleValue()     // Catch:{ NumberFormatException -> 0x0105 }
        L_0x0105:
            boolean r7 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            if (r7 == 0) goto L_0x0116
            java.util.HashMap<java.lang.String, java.lang.Double> r7 = f352296b     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            java.lang.Double r9 = java.lang.Double.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            r7.put(r8, r9)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            goto L_0x0012
        L_0x0116:
            if (r5 == 0) goto L_0x0012
            java.lang.Double r7 = java.lang.Double.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            r2.add(r7)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0121 }
            goto L_0x0012
        L_0x0121:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0128:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.C117781x.mo182542g(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
