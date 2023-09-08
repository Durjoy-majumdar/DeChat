package lk0;

import android.os.ParcelUuid;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import rx3.C13604l;
import sk0.C90215a;
import sk0.C90216b;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: lk0.g */
public final class C88552g extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 725;
    private static final String NAME = "startBLEPeripheralAdvertising";

    /* renamed from: g */
    public static final C34293c f255762g = new C34293c((C8480h) null);

    /* renamed from: lk0.g$b */
    public static final class C34291b {

        /* renamed from: e */
        public static final C34292a f92418e = new C34292a((C8480h) null);

        /* renamed from: a */
        public final byte[] f92419a;

        /* renamed from: b */
        public final int f92420b;

        /* renamed from: c */
        public final int f92421c;

        /* renamed from: d */
        public final int f92422d;

        /* renamed from: lk0.g$b$a */
        public static final class C34292a {
            public C34292a(C8480h hVar) {
            }

            /* renamed from: a */
            public final C34291b mo59550a(JSONObject jSONObject) {
                C87412m.m108594g(jSONObject, "json");
                C34293c cVar = C88552g.f255762g;
                String optString = jSONObject.optString("uuid");
                C87412m.m108593f(optString, "json.optString(\"uuid\")");
                String n = C112551y.m153814n(optString, "-", "", false);
                int length = n.length();
                byte[] bArr = new byte[(length / 2)];
                for (int i = 0; i < length; i += 2) {
                    bArr[i / 2] = (byte) ((cVar.mo59551a(n.charAt(i)) << 4) | cVar.mo59551a(n.charAt(i + 1)));
                }
                return new C34291b(bArr, jSONObject.optInt("major"), jSONObject.optInt("minor"), jSONObject.optInt("measuredPower"));
            }
        }

        public C34291b(byte[] bArr, int i, int i2, int i3) {
            C87412m.m108594g(bArr, "uuid");
            this.f92419a = bArr;
            this.f92420b = i;
            this.f92421c = i2;
            this.f92422d = i3;
        }
    }

    /* renamed from: lk0.g$c */
    public static final class C34293c {
        public C34293c(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo59551a(char c) {
            boolean z = true;
            if ('0' <= c && c < ':') {
                return c - '0';
            }
            char c2 = 'A';
            if (!('A' <= c && c < 'G')) {
                c2 = 'a';
                if ('a' > c || c >= 'g') {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("invalid hex char '" + c + '\'');
                }
            }
            return (c - c2) + 10;
        }
    }

    /* renamed from: lk0.g$a */
    public static final class C88553a {

        /* renamed from: a */
        public int f255763a;

        /* renamed from: b */
        public boolean f255764b;

        /* renamed from: c */
        public List<ParcelUuid> f255765c;

        /* renamed from: d */
        public List<C13604l<Integer, String>> f255766d;

        /* renamed from: e */
        public String f255767e;

        /* renamed from: f */
        public String f255768f;

        /* renamed from: g */
        public C34291b f255769g;

        public C88553a(int i, boolean z, List<ParcelUuid> list, List<C13604l<Integer, String>> list2, String str, String str2, C34291b bVar) {
            C87412m.m108594g(list, "serviceUuids");
            C87412m.m108594g(list2, "manufacturerData");
            C87412m.m108594g(str, "powerLevel");
            C87412m.m108594g(str2, MJTextResolver.KEY_DEVICE_NAME);
            this.f255763a = i;
            this.f255764b = z;
            this.f255765c = list;
            this.f255766d = list2;
            this.f255767e = str;
            this.f255768f = str2;
            this.f255769g = bVar;
        }
    }

    /* renamed from: lk0.g$d */
    public static final class C88554d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88552g f255770d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f255771e;

        /* renamed from: f */
        public final /* synthetic */ int f255772f;

        /* renamed from: g */
        public final /* synthetic */ C82381f f255773g;

        public C88554d(C88552g gVar, JSONObject jSONObject, int i, C82381f fVar) {
            this.f255770d = gVar;
            this.f255771e = jSONObject;
            this.f255772f = i;
            this.f255773g = fVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:41|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.BLE.JsApiStartBlePeripheralAdvertising", "NumberFormatException: input = " + r13);
            r13 = 0;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0121 */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0171  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0341  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0355  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x035b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r25 = this;
                r1 = r25
                lk0.g r2 = r1.f255770d
                org.json.JSONObject r0 = r1.f255771e
                int r3 = r1.f255772f
                com.tencent.mm.plugin.appbrand.jsapi.f r4 = r1.f255773g
                r2.getClass()
                java.lang.String r5 = "0x"
                java.lang.String r6 = ""
                java.lang.String r7 = "deviceName"
                java.lang.String r8 = "medium"
                java.lang.String r9 = "MicroMsg.BLE.JsApiStartBlePeripheralAdvertising"
                r14 = 1
                if (r0 != 0) goto L_0x001c
                goto L_0x015c
            L_0x001c:
                lk0.g$a r15 = new lk0.g$a
                r16 = -1
                r17 = 1
                java.util.ArrayList r18 = new java.util.ArrayList
                r18.<init>()
                java.util.ArrayList r19 = new java.util.ArrayList
                r19.<init>()
                r22 = 0
                java.lang.String r20 = "medium"
                java.lang.String r21 = ""
                r23 = r15
                r15.<init>(r16, r17, r18, r19, r20, r21, r22)
                java.lang.String r15 = "serverId"
                int r15 = r0.optInt(r15)     // Catch:{ Exception -> 0x014f }
                r11 = r23
                r11.f255763a = r15     // Catch:{ Exception -> 0x014f }
                java.lang.String r15 = "powerLevel"
                java.lang.String r15 = r0.optString(r15, r8)     // Catch:{ Exception -> 0x014f }
                java.lang.String r12 = "data.optString(\"powerLevel\", \"medium\")"
                gy3.C87412m.m108593f(r15, r12)     // Catch:{ Exception -> 0x014f }
                r11.f255767e = r15     // Catch:{ Exception -> 0x014f }
                java.lang.String r12 = "advertiseRequest"
                org.json.JSONObject r0 = r0.optJSONObject(r12)     // Catch:{ Exception -> 0x014f }
                gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x014f }
                java.lang.String r12 = "beacon"
                org.json.JSONObject r12 = r0.optJSONObject(r12)     // Catch:{ Exception -> 0x014f }
                if (r12 == 0) goto L_0x006b
                lk0.g$b$a r0 = lk0.C88552g.C34291b.f92418e     // Catch:{ Exception -> 0x014f }
                lk0.g$b r0 = r0.mo59550a(r12)     // Catch:{ Exception -> 0x014f }
                r11.f255769g = r0     // Catch:{ Exception -> 0x014f }
                goto L_0x014d
            L_0x006b:
                java.lang.String r12 = "connectable"
                boolean r12 = r0.optBoolean(r12, r14)     // Catch:{ Exception -> 0x014f }
                r11.f255764b = r12     // Catch:{ Exception -> 0x014f }
                java.lang.String r12 = r0.optString(r7, r6)     // Catch:{ Exception -> 0x014f }
                java.lang.String r15 = "jAdvertiseRequest.optString(\"deviceName\", \"\")"
                gy3.C87412m.m108593f(r12, r15)     // Catch:{ Exception -> 0x014f }
                r11.f255768f = r12     // Catch:{ Exception -> 0x014f }
                java.lang.String r12 = "serviceUuids"
                org.json.JSONArray r12 = r0.optJSONArray(r12)     // Catch:{ Exception -> 0x014f }
                if (r12 == 0) goto L_0x00d6
                int r15 = r12.length()     // Catch:{ Exception -> 0x014f }
                java.lang.String[] r10 = new java.lang.String[r15]     // Catch:{ Exception -> 0x014f }
                r14 = 0
            L_0x008e:
                if (r14 >= r15) goto L_0x00a5
                java.lang.Object r20 = r12.get(r14)     // Catch:{ Exception -> 0x014f }
                if (r20 == 0) goto L_0x009d
                java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x014f }
                r10[r14] = r20     // Catch:{ Exception -> 0x014f }
                int r14 = r14 + 1
                goto L_0x008e
            L_0x009d:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x014f }
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
                r0.<init>(r5)     // Catch:{ Exception -> 0x014f }
                throw r0     // Catch:{ Exception -> 0x014f }
            L_0x00a5:
                java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x014f }
                r12.<init>(r15)     // Catch:{ Exception -> 0x014f }
                r14 = 0
            L_0x00ab:
                if (r14 >= r15) goto L_0x00c0
                r20 = r10[r14]     // Catch:{ Exception -> 0x014f }
                android.os.ParcelUuid r13 = new android.os.ParcelUuid     // Catch:{ Exception -> 0x014f }
                java.util.UUID r1 = tk0.C90508a.m113330a(r20)     // Catch:{ Exception -> 0x014f }
                r13.<init>(r1)     // Catch:{ Exception -> 0x014f }
                r12.add(r13)     // Catch:{ Exception -> 0x014f }
                int r14 = r14 + 1
                r1 = r25
                goto L_0x00ab
            L_0x00c0:
                java.util.Iterator r1 = r12.iterator()     // Catch:{ Exception -> 0x014f }
            L_0x00c4:
                boolean r10 = r1.hasNext()     // Catch:{ Exception -> 0x014f }
                if (r10 == 0) goto L_0x00d6
                java.lang.Object r10 = r1.next()     // Catch:{ Exception -> 0x014f }
                android.os.ParcelUuid r10 = (android.os.ParcelUuid) r10     // Catch:{ Exception -> 0x014f }
                java.util.List<android.os.ParcelUuid> r12 = r11.f255765c     // Catch:{ Exception -> 0x014f }
                r12.add(r10)     // Catch:{ Exception -> 0x014f }
                goto L_0x00c4
            L_0x00d6:
                java.lang.String r1 = "manufacturerData"
                org.json.JSONArray r0 = r0.optJSONArray(r1)     // Catch:{ Exception -> 0x014f }
                if (r0 == 0) goto L_0x014d
                int r1 = r0.length()     // Catch:{ Exception -> 0x014f }
                org.json.JSONObject[] r10 = new org.json.JSONObject[r1]     // Catch:{ Exception -> 0x014f }
                r12 = 0
            L_0x00e5:
                if (r12 >= r1) goto L_0x00fc
                java.lang.Object r13 = r0.get(r12)     // Catch:{ Exception -> 0x014f }
                if (r13 == 0) goto L_0x00f4
                org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ Exception -> 0x014f }
                r10[r12] = r13     // Catch:{ Exception -> 0x014f }
                int r12 = r12 + 1
                goto L_0x00e5
            L_0x00f4:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x014f }
                java.lang.String r1 = "null cannot be cast to non-null type org.json.JSONObject"
                r0.<init>(r1)     // Catch:{ Exception -> 0x014f }
                throw r0     // Catch:{ Exception -> 0x014f }
            L_0x00fc:
                r0 = 0
            L_0x00fd:
                if (r0 >= r1) goto L_0x014d
                r12 = r10[r0]     // Catch:{ Exception -> 0x014f }
                java.lang.String r13 = "manufacturerId"
                java.lang.String r13 = r12.optString(r13)     // Catch:{ Exception -> 0x014f }
                java.lang.String r14 = "manufacturerIdString"
                gy3.C87412m.m108593f(r13, r14)     // Catch:{ Exception -> 0x014f }
                r14 = 0
                boolean r15 = z04.C112551y.m153819s(r13, r5, r14)     // Catch:{ Exception -> 0x014f }
                if (r15 == 0) goto L_0x011a
                java.lang.String r13 = z04.C112551y.m153814n(r13, r5, r6, r14)     // Catch:{ Exception -> 0x014f }
                r14 = 16
                goto L_0x011c
            L_0x011a:
                r14 = 10
            L_0x011c:
                int r13 = java.lang.Integer.parseInt(r13, r14)     // Catch:{ NumberFormatException -> 0x0121 }
                goto L_0x0136
            L_0x0121:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
                r14.<init>()     // Catch:{ Exception -> 0x014f }
                java.lang.String r15 = "NumberFormatException: input = "
                r14.append(r15)     // Catch:{ Exception -> 0x014f }
                r14.append(r13)     // Catch:{ Exception -> 0x014f }
                java.lang.String r13 = r14.toString()     // Catch:{ Exception -> 0x014f }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r13)     // Catch:{ Exception -> 0x014f }
                r13 = 0
            L_0x0136:
                java.lang.String r14 = "manufacturerSpecificData"
                java.lang.String r12 = r12.optString(r14, r6)     // Catch:{ Exception -> 0x014f }
                java.util.List<rx3.l<java.lang.Integer, java.lang.String>> r14 = r11.f255766d     // Catch:{ Exception -> 0x014f }
                rx3.l r15 = new rx3.l     // Catch:{ Exception -> 0x014f }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x014f }
                r15.<init>(r13, r12)     // Catch:{ Exception -> 0x014f }
                r14.add(r15)     // Catch:{ Exception -> 0x014f }
                int r0 = r0 + 1
                goto L_0x00fd
            L_0x014d:
                r15 = r11
                goto L_0x015d
            L_0x014f:
                r0 = move-exception
                r1 = 1
                java.lang.Object[] r5 = new java.lang.Object[r1]
                r1 = 0
                r5[r1] = r0
                java.lang.String r0 = "parseData: error "
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r5)
            L_0x015c:
                r15 = 0
            L_0x015d:
                if (r15 != 0) goto L_0x0171
                java.lang.String r0 = "createBLEPeripheralServer data is invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                r5 = 10013(0x271d, float:1.4031E-41)
                r7 = 0
                r8 = 16
                r9 = 0
                java.lang.String r6 = "fail:invalid data"
                sk0.C90215a.m112929a(r2, r3, r4, r5, r6, r7, r8, r9)
                goto L_0x039a
            L_0x0171:
                lk0.s r0 = lk0.C88567s.f255793a
                int r1 = r15.f255763a
                lk0.p r0 = r0.mo123030b(r1)
                if (r0 != 0) goto L_0x018d
                java.lang.String r0 = "invoke: retrieve a null server"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                r5 = 10020(0x2724, float:1.4041E-41)
                r7 = 0
                r8 = 16
                r9 = 0
                java.lang.String r6 = "fail: no server"
                sk0.C90215a.m112929a(r2, r3, r4, r5, r6, r7, r8, r9)
                goto L_0x039a
            L_0x018d:
                android.bluetooth.BluetoothAdapter r1 = sk0.C90216b.m112935d()
                if (r1 == 0) goto L_0x0198
                android.bluetooth.le.BluetoothLeAdvertiser r11 = r1.getBluetoothLeAdvertiser()
                goto L_0x0199
            L_0x0198:
                r11 = 0
            L_0x0199:
                if (r1 == 0) goto L_0x038a
                if (r11 != 0) goto L_0x019f
                goto L_0x038a
            L_0x019f:
                java.lang.String r5 = "<set-?>"
                gy3.C87412m.m108594g(r4, r5)
                r0.f255787c = r4
                lk0.g$b r5 = r15.f255769g
                java.lang.String r6 = "builder.build()"
                r12 = 2
                if (r5 == 0) goto L_0x0240
                android.bluetooth.le.AdvertiseData$Builder r13 = new android.bluetooth.le.AdvertiseData$Builder
                r13.<init>()
                int r14 = r5.f92420b
                int r9 = r5.f92421c
                int r10 = r5.f92422d
                byte[] r5 = r5.f92419a
                r22 = r11
                r11 = 23
                byte[] r11 = new byte[r11]
                r23 = r1
                byte r1 = (byte) r12
                r21 = 0
                r11[r21] = r1
                r24 = r0
                r1 = 21
                byte r0 = (byte) r1
                r1 = 1
                r11[r1] = r0
                r11[r12] = r21
                r0 = 3
                r11[r0] = r21
                r0 = 4
                r11[r0] = r21
                r0 = 5
                r11[r0] = r21
                r0 = 6
                r11[r0] = r21
                r0 = 7
                r11[r0] = r21
                r0 = 8
                r11[r0] = r21
                r0 = 9
                r11[r0] = r21
                r1 = 10
                r11[r1] = r21
                r0 = 11
                r11[r0] = r21
                r0 = 12
                r11[r0] = r21
                r0 = 13
                r11[r0] = r21
                r0 = 14
                r11[r0] = r21
                r0 = 15
                r11[r0] = r21
                r1 = 16
                r11[r1] = r21
                r0 = 17
                r11[r0] = r21
                r0 = 18
                int r1 = r14 >>> 8
                byte r1 = (byte) r1
                r11[r0] = r1
                r0 = 19
                byte r1 = (byte) r14
                r11[r0] = r1
                r0 = 20
                int r1 = r9 >>> 8
                byte r1 = (byte) r1
                r11[r0] = r1
                byte r0 = (byte) r9
                r1 = 21
                r11[r1] = r0
                r0 = 22
                byte r1 = (byte) r10
                r11[r0] = r1
                r1 = 16
                r9 = 0
                java.lang.System.arraycopy(r5, r9, r11, r12, r1)
                android.bluetooth.le.AdvertiseData$Builder r0 = r13.setIncludeTxPowerLevel(r9)
                android.bluetooth.le.AdvertiseData$Builder r0 = r0.setIncludeDeviceName(r9)
                r1 = 76
                r0.addManufacturerData(r1, r11)
                android.bluetooth.le.AdvertiseData r0 = r13.build()
                gy3.C87412m.m108593f(r0, r6)
                goto L_0x029e
            L_0x0240:
                r24 = r0
                r23 = r1
                r22 = r11
                java.lang.String r0 = r15.f255768f
                boolean r0 = z04.C112551y.m153811k(r0)
                r1 = 1
                r0 = r0 ^ r1
                android.bluetooth.le.AdvertiseData$Builder r1 = new android.bluetooth.le.AdvertiseData$Builder
                r1.<init>()
                android.bluetooth.le.AdvertiseData$Builder r0 = r1.setIncludeDeviceName(r0)
                java.util.List<rx3.l<java.lang.Integer, java.lang.String>> r1 = r15.f255766d
                java.util.Iterator r1 = r1.iterator()
            L_0x025d:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0281
                java.lang.Object r5 = r1.next()
                rx3.l r5 = (rx3.C13604l) r5
                B r9 = r5.f38556e
                java.lang.String r9 = (java.lang.String) r9
                byte[] r9 = android.util.Base64.decode(r9, r12)
                A r5 = r5.f38555d
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                byte[] r9 = sk0.C90216b.m112932a(r9)
                r0.addManufacturerData(r5, r9)
                goto L_0x025d
            L_0x0281:
                java.util.List<android.os.ParcelUuid> r1 = r15.f255765c
                java.util.Iterator r1 = r1.iterator()
            L_0x0287:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0297
                java.lang.Object r5 = r1.next()
                android.os.ParcelUuid r5 = (android.os.ParcelUuid) r5
                r0.addServiceUuid(r5)
                goto L_0x0287
            L_0x0297:
                android.bluetooth.le.AdvertiseData r0 = r0.build()
                gy3.C87412m.m108593f(r0, r6)
            L_0x029e:
                java.lang.String r1 = r15.f255767e
                int r5 = r1.hashCode()
                r6 = -1078030475(0xffffffffbfbe8f75, float:-1.488753)
                if (r5 == r6) goto L_0x02c6
                r6 = 107348(0x1a354, float:1.50427E-40)
                if (r5 == r6) goto L_0x02ba
                r6 = 3202466(0x30dda2, float:4.48761E-39)
                if (r5 == r6) goto L_0x02b4
                goto L_0x02cc
            L_0x02b4:
                java.lang.String r5 = "high"
                r1.equals(r5)
                goto L_0x02cc
            L_0x02ba:
                java.lang.String r5 = "low"
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x02c3
                goto L_0x02cc
            L_0x02c3:
                r1 = 0
                r5 = 1
                goto L_0x02d1
            L_0x02c6:
                boolean r1 = r1.equals(r8)
                if (r1 != 0) goto L_0x02cf
            L_0x02cc:
                r1 = 2
                r5 = 3
                goto L_0x02d1
            L_0x02cf:
                r1 = 1
                r5 = 2
            L_0x02d1:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                int r1 = r1.intValue()
                int r5 = r5.intValue()
                android.bluetooth.le.AdvertiseSettings$Builder r6 = new android.bluetooth.le.AdvertiseSettings$Builder
                r6.<init>()
                android.bluetooth.le.AdvertiseSettings$Builder r1 = r6.setAdvertiseMode(r1)
                android.bluetooth.le.AdvertiseSettings$Builder r1 = r1.setTxPowerLevel(r5)
                r5 = 0
                android.bluetooth.le.AdvertiseSettings$Builder r1 = r1.setTimeout(r5)
                boolean r6 = r15.f255764b
                android.bluetooth.le.AdvertiseSettings$Builder r1 = r1.setConnectable(r6)
                android.bluetooth.le.AdvertiseSettings r1 = r1.build()
                java.lang.String r6 = "Builder()\n            .s…ble)\n            .build()"
                gy3.C87412m.m108593f(r1, r6)
                android.bluetooth.le.AdvertiseData$Builder r6 = new android.bluetooth.le.AdvertiseData$Builder
                r6.<init>()
                android.bluetooth.le.AdvertiseData$Builder r6 = r6.setIncludeDeviceName(r5)
                android.bluetooth.le.AdvertiseData r5 = r6.build()
                java.lang.String r6 = "Builder()\n            .s…lse)\n            .build()"
                gy3.C87412m.m108593f(r5, r6)
                java.lang.String r6 = r15.f255768f
                lk0.h r8 = new lk0.h
                r8.<init>(r2, r3, r4)
                gy3.C87412m.m108594g(r6, r7)
                r2 = r24
                java.util.concurrent.CopyOnWriteArrayList<android.bluetooth.le.AdvertiseCallback> r2 = r2.f255789e
                r2.add(r8)
                boolean r2 = z04.C112551y.m153811k(r6)
                r3 = 1
                r2 = r2 ^ r3
                if (r2 == 0) goto L_0x0384
                java.lang.String r2 = r23.getName()
                boolean r2 = gy3.C87412m.m108589b(r2, r6)
                if (r2 != 0) goto L_0x0384
                r2 = r23
                boolean r4 = r2.setName(r6)
                java.lang.String r7 = "MicroMsg.BLE.PeripheralBleServer"
                if (r4 != 0) goto L_0x0355
                java.lang.Object[] r4 = new java.lang.Object[r3]
                int r3 = r2.getState()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r14 = 0
                r4[r14] = r3
                java.lang.String r3 = "set BLE adapter name fail, may under wrong state! [%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r3, r4)
                goto L_0x0356
            L_0x0355:
                r14 = 0
            L_0x0356:
                r3 = 0
                r4 = 21
            L_0x0359:
                if (r3 >= r4) goto L_0x0384
                java.lang.String r9 = r2.getName()
                r10 = 3
                java.lang.Object[] r11 = new java.lang.Object[r10]
                java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
                r11[r14] = r13
                r13 = 1
                r11[r13] = r9
                r11[r12] = r6
                java.lang.String r15 = "round [%d] sys = [%s], want = [%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r15, r11)
                boolean r9 = gy3.C87412m.m108589b(r6, r9)
                if (r9 != 0) goto L_0x0384
                r15 = 50
                java.lang.Thread.sleep(r15)     // Catch:{ InterruptedException -> 0x0381 }
                int r3 = r3 + 1
                goto L_0x0359
            L_0x0381:
                r0 = move-exception
                r1 = r0
                throw r1
            L_0x0384:
                r11 = r22
                r11.startAdvertising(r1, r0, r5, r8)
                goto L_0x039a
            L_0x038a:
                java.lang.String r0 = "invoke: adapter is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                r5 = 10001(0x2711, float:1.4014E-41)
                r7 = 0
                r8 = 16
                r9 = 0
                java.lang.String r6 = "fail:not available"
                sk0.C90215a.m112929a(r2, r3, r4, r5, r6, r7, r8, r9)
            L_0x039a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lk0.C88552g.C88554d.run():void");
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "env");
        if (!C90216b.m112933b()) {
            C90215a.m112929a(this, i, fVar, 10001, "fail:not available", (HashMap) null, 16, (Object) null);
            Log.m105924i("MicroMsg.BLE.JsApiStartBlePeripheralAdvertising", "invoke: Ble is not available");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C88554d(this, jSONObject, i, fVar), "MicroMsg.BLE.Peripheral");
    }
}
