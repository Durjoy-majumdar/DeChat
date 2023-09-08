package p392w5;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: w5.d */
public class C22868d extends C22867c {

    /* renamed from: d */
    public static AtomicInteger f65745d = new AtomicInteger();

    /* renamed from: b */
    public final Vibrator f65746b;

    /* renamed from: c */
    public Class<?> f65747c;

    /* renamed from: w5.d$a */
    public class C22869a extends C22870b {

        /* renamed from: h */
        public int f65748h;

        /* renamed from: i */
        public C22872d[] f65749i;

        public C22869a(C22868d dVar) {
            super(dVar);
        }

        /* renamed from: a */
        public int[] mo36044a() {
            int i = 8;
            int[] iArr = new int[((this.f65748h * 3) + 8)];
            Arrays.fill(iArr, 0);
            iArr[0] = this.f65750a;
            int i2 = this.f65748h;
            iArr[1] = ((i2 * 3) + 8) - 2;
            iArr[2] = this.f65752c;
            iArr[3] = this.f65753d;
            iArr[4] = this.f65754e;
            iArr[5] = this.f65755f;
            iArr[6] = this.f65756g;
            iArr[7] = i2;
            for (int i3 = 0; i3 < this.f65748h; i3++) {
                C22872d dVar = this.f65749i[i3];
                iArr[i] = dVar.f65759a;
                int i4 = i + 1;
                iArr[i4] = dVar.f65760b;
                int i5 = i4 + 1;
                iArr[i5] = dVar.f65761c;
                i = i5 + 1;
            }
            return iArr;
        }

        public String toString() {
            return "Continuous{mPointNum=" + this.f65748h + ", mPoint=" + Arrays.toString(this.f65749i) + '}';
        }
    }

    /* renamed from: w5.d$b */
    public abstract class C22870b {

        /* renamed from: a */
        public int f65750a;

        /* renamed from: b */
        public int f65751b;

        /* renamed from: c */
        public int f65752c;

        /* renamed from: d */
        public int f65753d;

        /* renamed from: e */
        public int f65754e;

        /* renamed from: f */
        public int f65755f;

        /* renamed from: g */
        public int f65756g;

        public C22870b(C22868d dVar) {
        }

        /* renamed from: a */
        public abstract int[] mo36044a();

        public String toString() {
            return "Event{mType=" + this.f65750a + ", mVibId=" + this.f65752c + ", mRelativeTime=" + this.f65753d + ", mIntensity=" + this.f65754e + ", mFreq=" + this.f65755f + ", mDuration=" + this.f65756g + '}';
        }
    }

    /* renamed from: w5.d$c */
    public class C22871c {

        /* renamed from: a */
        public int f65757a;

        /* renamed from: b */
        public C22870b[] f65758b;

        public C22871c(C22868d dVar) {
        }

        /* renamed from: a */
        public int mo36046a() {
            int i = 0;
            for (C22870b bVar : this.f65758b) {
                int i2 = bVar.f65750a;
                if (i2 == 4096) {
                    i += (((C22869a) bVar).f65748h * 3) + 8;
                } else if (i2 == 4097) {
                    i += 7;
                }
            }
            return i + 3;
        }
    }

    /* renamed from: w5.d$d */
    public class C22872d {

        /* renamed from: a */
        public int f65759a;

        /* renamed from: b */
        public int f65760b;

        /* renamed from: c */
        public int f65761c;

        public C22872d(C22868d dVar) {
        }
    }

    /* renamed from: w5.d$e */
    public class C22873e extends C22870b {
        public C22873e(C22868d dVar) {
            super(dVar);
            this.f65751b = 7;
        }

        /* renamed from: a */
        public int[] mo36044a() {
            int[] iArr = new int[this.f65751b];
            Arrays.fill(iArr, 0);
            iArr[0] = this.f65750a;
            iArr[1] = this.f65751b - 2;
            iArr[2] = this.f65752c;
            iArr[3] = this.f65753d;
            iArr[4] = this.f65754e;
            iArr[5] = this.f65755f;
            iArr[6] = this.f65756g;
            return iArr;
        }
    }

    public C22868d(Context context) {
        this.f65746b = (Vibrator) context.getSystemService("vibrator");
        try {
            this.f65747c = Class.forName("android.os.RichTapVibrationEffect");
        } catch (ClassNotFoundException unused) {
        }
        if (this.f65747c == null) {
            try {
                this.f65747c = Class.forName("android.os.VibrationEffect");
            } catch (ClassNotFoundException unused2) {
            }
        }
    }

    /* renamed from: a */
    public void mo36031a(String str, int i, int i2, int i3, int i4) {
        int i5;
        if (this.f65746b != null && i >= 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!C26424f.f73697c) {
                    int i6 = jSONObject.getJSONObject("Metadata").getInt("Version");
                    int i7 = C26424f.f73695a;
                    if (!mo36036g(i7, C26424f.f73696b, i6)) {
                        String.format("%x02", new Object[]{Integer.valueOf(i7)});
                        return;
                    }
                    i5 = i6;
                } else {
                    i5 = 0;
                }
                C22871c[] n = mo36043n(str);
                if (n == null) {
                    return;
                }
                if (n.length != 0) {
                    int andIncrement = f65745d.getAndIncrement();
                    int myPid = Process.myPid();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < ((int) Math.ceil(((double) n.length) / 4.0d))) {
                        int i15 = i8 + 1;
                        int length = n.length < i15 * 4 ? n.length - (i8 * 4) : 4;
                        C22871c[] cVarArr = new C22871c[length];
                        System.arraycopy(n, i8 * 4, cVarArr, 0, length);
                        int i16 = length;
                        Object h = mo36037h(2, i5, length, myPid, andIncrement, i9, cVarArr);
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                Class<?> cls = this.f65747c;
                                Class cls2 = Integer.TYPE;
                                this.f65746b.vibrate((VibrationEffect) cls.getMethod("createPatternHeWithParam", new Class[]{int[].class, cls2, cls2, cls2, cls2}).invoke((Object) null, new Object[]{h, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
                            }
                        } catch (Exception unused) {
                        }
                        i8 = i15;
                        i9 = i16;
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36032b(java.lang.String r17, int r18, int r19, int r20, int r21) {
        /*
            r16 = this;
            r0 = r16
            android.os.Vibrator r1 = r0.f65746b
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            r1 = 1
            r2 = r18
            if (r2 >= r1) goto L_0x000d
            return
        L_0x000d:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ad }
            r4 = r17
            r3.<init>(r4)     // Catch:{ Exception -> 0x00ad }
            boolean r5 = p392w5.C26424f.f73697c     // Catch:{ Exception -> 0x00ad }
            r6 = 0
            if (r5 != 0) goto L_0x003d
            java.lang.String r7 = "Metadata"
            org.json.JSONObject r3 = r3.getJSONObject(r7)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r7 = "Version"
            int r3 = r3.getInt(r7)     // Catch:{ Exception -> 0x00ad }
            int r7 = p392w5.C26424f.f73695a     // Catch:{ Exception -> 0x00ad }
            int r8 = p392w5.C26424f.f73696b     // Catch:{ Exception -> 0x00ad }
            boolean r3 = r0.mo36036g(r7, r8, r3)     // Catch:{ Exception -> 0x00ad }
            if (r3 != 0) goto L_0x003d
            java.lang.String r2 = "%x02"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00ad }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00ad }
            r1[r6] = r3     // Catch:{ Exception -> 0x00ad }
            java.lang.String.format(r2, r1)     // Catch:{ Exception -> 0x00ad }
            return
        L_0x003d:
            int r3 = p392w5.C26424f.f73695a     // Catch:{ Exception -> 0x00ad }
            r7 = 24
            if (r3 >= r7) goto L_0x0048
            int[] r3 = r16.mo36040k(r17)     // Catch:{ Exception -> 0x00ad }
            goto L_0x004c
        L_0x0048:
            int[] r3 = r16.mo36041l(r17)     // Catch:{ Exception -> 0x00ad }
        L_0x004c:
            if (r3 != 0) goto L_0x004f
            return
        L_0x004f:
            int r4 = r3.length     // Catch:{ Exception -> 0x00ad }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ad }
            r9 = 26
            if (r8 < r9) goto L_0x00ad
            java.lang.Class<?> r8 = r0.f65747c     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = "createPatternHeWithParam"
            r10 = 5
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x00ad }
            java.lang.Class<int[]> r12 = int[].class
            r11[r6] = r12     // Catch:{ Exception -> 0x00ad }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00ad }
            r11[r1] = r12     // Catch:{ Exception -> 0x00ad }
            r13 = 2
            r11[r13] = r12     // Catch:{ Exception -> 0x00ad }
            r14 = 3
            r11[r14] = r12     // Catch:{ Exception -> 0x00ad }
            r15 = 4
            r11[r15] = r12     // Catch:{ Exception -> 0x00ad }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ Exception -> 0x00ad }
            if (r5 != 0) goto L_0x0085
            int r4 = r4 + r1
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x00ad }
            int r5 = p392w5.C26424f.f73695a     // Catch:{ Exception -> 0x00ad }
            if (r5 >= r7) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x007d:
            r5 = 3
        L_0x007e:
            r4[r6] = r5     // Catch:{ Exception -> 0x00ad }
            int r5 = r3.length     // Catch:{ Exception -> 0x00ad }
            java.lang.System.arraycopy(r3, r6, r4, r1, r5)     // Catch:{ Exception -> 0x00ad }
            r3 = r4
        L_0x0085:
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00ad }
            r5[r6] = r3     // Catch:{ Exception -> 0x00ad }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x00ad }
            r5[r1] = r2     // Catch:{ Exception -> 0x00ad }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x00ad }
            r5[r13] = r1     // Catch:{ Exception -> 0x00ad }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x00ad }
            r5[r14] = r1     // Catch:{ Exception -> 0x00ad }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x00ad }
            r5[r15] = r1     // Catch:{ Exception -> 0x00ad }
            java.lang.Object r1 = r8.invoke(r4, r5)     // Catch:{ Exception -> 0x00ad }
            android.os.VibrationEffect r1 = (android.os.VibrationEffect) r1     // Catch:{ Exception -> 0x00ad }
            android.os.Vibrator r2 = r0.f65746b     // Catch:{ Exception -> 0x00ad }
            r2.vibrate(r1)     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p392w5.C22868d.mo36032b(java.lang.String, int, int, int, int):void");
    }

    /* renamed from: c */
    public void mo36033c(String str, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3;
        if (this.f65746b != null && i >= 1) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("Pattern");
                int min = Math.min(jSONArray.length(), 16);
                int i8 = min * 2;
                long[] jArr = new long[i8];
                int[] iArr = new int[i8];
                Arrays.fill(iArr, 0);
                int i9 = 0;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (i9 >= min) {
                        i5 = i8;
                        break;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(i9).getJSONObject("Event");
                    String string = jSONObject.getString("Type");
                    JSONArray jSONArray2 = jSONArray;
                    int i17 = min;
                    if (!TextUtils.equals("continuous", string)) {
                        i5 = i8;
                        if (!TextUtils.equals("transient", string)) {
                            break;
                        }
                        int i18 = i9 * 2;
                        long j = (long) ((jSONObject.getInt("RelativeTime") - i15) - i16);
                        jArr[i18] = j;
                        if (j < 0) {
                            jArr[i18] = 50;
                        }
                        iArr[i18] = 0;
                        JSONObject jSONObject2 = jSONObject.getJSONObject("Parameters");
                        int i19 = jSONObject2.getInt("Intensity");
                        jSONObject2.getInt("Frequency");
                        int i25 = i18 + 1;
                        jArr[i25] = (long) 65;
                        iArr[i25] = Math.max(1, Math.min((int) (((((double) i7) * 1.0d) * ((double) i19)) / 100.0d), 255));
                        i6 = jSONObject.getInt("RelativeTime");
                        i16 = 65;
                    } else {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("Parameters");
                        int[] j2 = mo36039j(jSONObject3.getJSONArray("Curve"));
                        int i26 = i9 * 2;
                        long j3 = (long) ((jSONObject.getInt("RelativeTime") - i15) - i16);
                        jArr[i26] = j3;
                        if (j3 < 0) {
                            jArr[i26] = 50;
                        }
                        iArr[i26] = 0;
                        int i27 = jSONObject.getInt("Duration");
                        int i28 = i26 + 1;
                        i5 = i8;
                        jArr[i28] = (long) i27;
                        int max = Math.max(Math.min((j2[4] * 255) / 100, 255), Math.min((j2[7] * 255) / 100, 255));
                        int i29 = jSONObject3.getInt("Intensity");
                        jSONObject3.getInt("Frequency");
                        iArr[i28] = Math.max(1, (int) (((((double) max) * (((double) i29) / 100.0d)) * ((double) i7)) / 255.0d));
                        i6 = jSONObject.getInt("RelativeTime");
                        i16 = i27;
                    }
                    i9++;
                    i15 = i6;
                    jSONArray = jSONArray2;
                    min = i17;
                    i8 = i5;
                }
                Arrays.toString(jArr);
                int i35 = i5;
                for (int i36 = 0; i36 < i35; i36++) {
                    long j4 = jArr[i36];
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f65746b.vibrate(VibrationEffect.createWaveform(jArr, iArr, -1));
                } else {
                    this.f65746b.vibrate(jArr, -1);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public int mo36034e(String str) {
        int i = 0;
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("Pattern");
            int min = Math.min(jSONArray.length(), 16);
            int i2 = min * 2;
            long[] jArr = new long[i2];
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < min; i5++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i5).getJSONObject("Event");
                String string = jSONObject.getString("Type");
                if (!TextUtils.equals("continuous", string)) {
                    if (!TextUtils.equals("transient", string)) {
                        break;
                    }
                    int i6 = i5 * 2;
                    long j = (long) ((jSONObject.getInt("RelativeTime") - i3) - i4);
                    jArr[i6] = j;
                    if (j < 0) {
                        jArr[i6] = 50;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("Parameters");
                    jSONObject2.getInt("Intensity");
                    jSONObject2.getInt("Frequency");
                    jArr[i6 + 1] = (long) 65;
                    i3 = jSONObject.getInt("RelativeTime");
                    i4 = 65;
                } else {
                    int i7 = i5 * 2;
                    long j2 = (long) ((jSONObject.getInt("RelativeTime") - i3) - i4);
                    jArr[i7] = j2;
                    if (j2 < 0) {
                        jArr[i7] = 50;
                    }
                    int i8 = jSONObject.getInt("Duration");
                    jArr[i7 + 1] = (long) i8;
                    i4 = i8;
                    i3 = jSONObject.getInt("RelativeTime");
                }
            }
            int i9 = 0;
            while (i < i2) {
                try {
                    i9 = (int) (((long) i9) + jArr[i]);
                    i++;
                } catch (Exception unused) {
                    return i9;
                }
            }
            return i9;
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: f */
    public void mo36035f() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Class<?> cls = this.f65747c;
                Class cls2 = Integer.TYPE;
                Vibrator vibrator = this.f65746b;
                vibrator.vibrate((VibrationEffect) cls.getMethod("createPatternHeParameter", new Class[]{cls2, cls2, cls2}).invoke((Object) null, new Object[]{0, 0, 0}));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public final boolean mo36036g(int i, int i2, int i3) {
        if (i < 22) {
            String.format("%x02", new Object[]{Integer.valueOf(i)});
            return false;
        }
        if (i == 22) {
            if (i3 != 1) {
                String.format("%x", new Object[]{Integer.valueOf(i)});
                return false;
            }
        } else if (i != 23) {
            return i != 24 || i3 == 1 || i3 == 2;
        } else {
            if (i3 != 1) {
                String.format("%x", new Object[]{Integer.valueOf(i)});
                return false;
            }
        }
    }

    /* renamed from: h */
    public int[] mo36037h(int i, int i2, int i3, int i4, int i5, int i6, C22871c[] cVarArr) {
        int i7 = i3;
        C22871c[] cVarArr2 = cVarArr;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += cVarArr2[i9].mo36046a();
        }
        int[] iArr = new int[(i8 + 5)];
        Arrays.fill(iArr, 0);
        iArr[0] = i;
        char c = 1;
        iArr[1] = i2;
        char c2 = 2;
        iArr[2] = i4;
        iArr[3] = i5;
        int i15 = iArr[4] | (65535 & i7);
        iArr[4] = i15;
        iArr[4] = i15 | ((cVarArr2.length << 16) & -65536);
        int i16 = i6;
        int i17 = 5;
        int i18 = 0;
        while (i18 < i7) {
            C22871c cVar = cVarArr2[i18];
            int a = cVar.mo36046a();
            int[] iArr2 = new int[a];
            Arrays.fill(iArr2, 0);
            iArr2[0] = i16;
            iArr2[c] = cVar.f65757a;
            C22870b[] bVarArr = cVar.f65758b;
            iArr2[c2] = bVarArr.length;
            int i19 = 3;
            for (C22870b a2 : bVarArr) {
                int[] a3 = a2.mo36044a();
                System.arraycopy(a3, 0, iArr2, i19, a3.length);
                i19 += a3.length;
            }
            System.arraycopy(iArr2, 0, iArr, i17, a);
            i17 += a;
            i16++;
            i18++;
            c = 1;
            c2 = 2;
        }
        return iArr;
    }

    /* renamed from: i */
    public final int[] mo36038i(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[48];
        for (int i = 0; i < 48; i++) {
            iArr[i] = -1;
        }
        try {
            int length = jSONArray.length();
            if (length >= 4) {
                int min = Math.min(length, 16);
                int i2 = 0;
                while (i2 < min) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    int i3 = jSONObject.getInt("Time");
                    int i4 = (int) (jSONObject.getDouble("Intensity") * 100.0d);
                    int i5 = jSONObject.getInt("Frequency");
                    if (mo36042m(i3, 0, 5000) && mo36042m(i4, 0, 100)) {
                        if (mo36042m(i5, -100, 100)) {
                            int i6 = i2 * 3;
                            iArr[i6 + 0] = i3;
                            iArr[i6 + 1] = i4;
                            iArr[i6 + 2] = i5;
                            i2++;
                        }
                    }
                    return null;
                }
                return iArr;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: j */
    public final int[] mo36039j(JSONArray jSONArray) {
        int i;
        JSONArray jSONArray2 = jSONArray;
        int[] iArr = null;
        if (jSONArray2 == null) {
            return null;
        }
        int[] iArr2 = new int[12];
        try {
            int length = jSONArray.length();
            double d = 100.0d;
            if (length == 4) {
                int i2 = 0;
                while (i2 < length) {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                    try {
                        int i3 = jSONObject.getInt("Time");
                        int i4 = (int) (jSONObject.getDouble("Intensity") * 100.0d);
                        int i5 = jSONObject.getInt("Frequency");
                        if (!mo36042m(i3, 0, 5000) || !mo36042m(i4, 0, 100)) {
                            return null;
                        }
                        if (!mo36042m(i5, -100, 100)) {
                            return null;
                        }
                        int i6 = i2 * 3;
                        iArr2[i6] = i3;
                        iArr2[i6 + 1] = i4;
                        iArr2[i6 + 2] = i5;
                        i2++;
                        iArr = null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            } else if (length <= 4 || length > 16) {
                return null;
            } else {
                int i7 = 0;
                while (i7 < length) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i7);
                    int i8 = jSONObject2.getInt("Time");
                    int i9 = (int) (jSONObject2.getDouble("Intensity") * d);
                    int i15 = jSONObject2.getInt("Frequency");
                    if (!mo36042m(i8, 0, 5000) || !mo36042m(i9, 0, 100)) {
                        return null;
                    }
                    if (!mo36042m(i15, -100, 100)) {
                        return null;
                    }
                    if (i7 == 0) {
                        int i16 = i7 * 3;
                        iArr2[i16] = i8;
                        iArr2[i16 + 1] = i9;
                        iArr2[i16 + 2] = i15;
                    } else {
                        int i17 = length - 1;
                        if (i7 < i17) {
                            double d2 = ((double) length) / 2.0d;
                            int i18 = 1;
                            if (((double) i7) < Math.ceil(d2)) {
                                i = (int) (Math.ceil(d2) - 1.0d);
                            } else {
                                i = (length / 2) - 1;
                                i18 = 2;
                            }
                            int i19 = i18 * 3;
                            iArr2[i19] = iArr2[i19] + (i8 / i);
                            int i25 = i19 + 1;
                            iArr2[i25] = iArr2[i25] + (i9 / i);
                            int i26 = i19 + 2;
                            iArr2[i26] = iArr2[i26] + (i15 / i);
                        } else if (i7 == i17) {
                            iArr2[9] = i8;
                            iArr2[10] = i9;
                            iArr2[11] = i15;
                        }
                    }
                    i7++;
                    d = 100.0d;
                }
            }
            return iArr2;
        } catch (Exception unused2) {
            return iArr;
        }
    }

    /* renamed from: k */
    public final int[] mo36040k(String str) {
        int[] iArr;
        boolean z;
        int i;
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("Pattern");
            int min = Math.min(jSONArray.length(), 16);
            int[] iArr2 = new int[(min * 17)];
            int i2 = 0;
            while (true) {
                if (i2 >= min) {
                    z = true;
                    break;
                }
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2).getJSONObject("Event");
                    String string = jSONObject.getString("Type");
                    if (!TextUtils.equals("continuous", string)) {
                        if (!TextUtils.equals("transient", string)) {
                            break;
                        }
                        i = 4097;
                    } else {
                        i = 4096;
                    }
                    int i3 = !jSONObject.has("RelativeTime") ? i2 * 400 : jSONObject.getInt("RelativeTime");
                    if (i3 < 0) {
                        break;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("Parameters");
                    int i4 = jSONObject2.getInt("Intensity");
                    int i5 = jSONObject2.getInt("Frequency");
                    if (i != 4096) {
                        if (i == 4097) {
                            if (mo36042m(i4, 0, 100)) {
                                if (!mo36042m(i5, -50, 150)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else if (mo36042m(i4, 0, 100)) {
                        if (!mo36042m(i5, 0, 100)) {
                            break;
                        }
                    } else {
                        break;
                    }
                    int i6 = i2 * 17;
                    iArr2[i6 + 0] = i;
                    iArr2[i6 + 1] = i3;
                    iArr2[i6 + 2] = i4;
                    iArr2[i6 + 3] = i5;
                    if (4096 == i) {
                        int i7 = !jSONObject.has("Duration") ? 0 : jSONObject.getInt("Duration");
                        if (mo36042m(i7, 0, 5000)) {
                            iArr2[i6 + 4] = i7;
                            int[] j = mo36039j(jSONObject2.getJSONArray("Curve"));
                            if (j == null) {
                                break;
                            }
                            System.arraycopy(j, 0, iArr2, i6 + 5, 12);
                        } else {
                            break;
                        }
                    }
                    i2++;
                } catch (Exception unused) {
                    iArr = iArr2;
                    return iArr;
                }
            }
            z = false;
            if (!z) {
                return null;
            }
            int i8 = iArr2[((min - 1) * 17) + 0];
            return iArr2;
        } catch (Exception unused2) {
            iArr = null;
            return iArr;
        }
    }

    /* renamed from: l */
    public final int[] mo36041l(String str) {
        int[] iArr;
        boolean z;
        int i;
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("Pattern");
            int min = Math.min(jSONArray.length(), 16);
            int[] iArr2 = new int[(min * 55)];
            int i2 = 0;
            while (true) {
                if (i2 >= min) {
                    z = true;
                    break;
                }
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2).getJSONObject("Event");
                    String string = jSONObject.getString("Type");
                    if (!TextUtils.equals("continuous", string)) {
                        if (!TextUtils.equals("transient", string)) {
                            break;
                        }
                        i = 4097;
                    } else {
                        i = 4096;
                    }
                    int i3 = !jSONObject.has("RelativeTime") ? i2 * 400 : jSONObject.getInt("RelativeTime");
                    if (i3 < 0) {
                        break;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("Parameters");
                    int i4 = jSONObject2.getInt("Intensity");
                    int i5 = jSONObject2.getInt("Frequency");
                    if (i != 4096) {
                        if (i == 4097) {
                            if (mo36042m(i4, 0, 100)) {
                                if (!mo36042m(i5, -50, 150)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else if (mo36042m(i4, 0, 100)) {
                        if (!mo36042m(i5, 0, 100)) {
                            break;
                        }
                    } else {
                        break;
                    }
                    int i6 = i2 * 55;
                    iArr2[i6 + 0] = i;
                    iArr2[i6 + 1] = i3;
                    iArr2[i6 + 2] = i4;
                    iArr2[i6 + 3] = i5;
                    iArr2[i6 + 5] = 0;
                    if (4096 == i) {
                        int i7 = !jSONObject.has("Duration") ? 0 : jSONObject.getInt("Duration");
                        if (mo36042m(i7, 0, 5000)) {
                            iArr2[i6 + 4] = i7;
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("Curve");
                            iArr2[i6 + 6] = jSONArray2.length();
                            int[] i8 = mo36038i(jSONArray2);
                            if (i8 == null) {
                                break;
                            }
                            System.arraycopy(i8, 0, iArr2, i6 + 7, 48);
                        } else {
                            break;
                        }
                    }
                    i2++;
                } catch (Exception unused) {
                    iArr = iArr2;
                    return iArr;
                }
            }
            z = false;
            if (!z) {
                return null;
            }
            int i9 = iArr2[((min - 1) * 55) + 0];
            return iArr2;
        } catch (Exception unused2) {
            iArr = null;
            return iArr;
        }
    }

    /* renamed from: m */
    public final boolean mo36042m(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a A[Catch:{ Exception -> 0x0214 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad A[Catch:{ Exception -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01bd A[Catch:{ Exception -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c0 A[Catch:{ Exception -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c7 A[Catch:{ Exception -> 0x0216 }, LOOP:1: B:11:0x0058->B:88:0x01c7, LOOP_END] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p392w5.C22868d.C22871c[] mo36043n(java.lang.String r32) {
        /*
            r31 = this;
            r0 = r31
            java.lang.String r1 = "Duration"
            java.lang.String r2 = "Frequency"
            java.lang.String r3 = "Intensity"
            java.lang.String r4 = "RelativeTime"
            r5 = 0
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x021c }
            r7 = r32
            r6.<init>(r7)     // Catch:{ Exception -> 0x021c }
            java.lang.String r7 = "PatternList"
            org.json.JSONArray r6 = r6.getJSONArray(r7)     // Catch:{ Exception -> 0x021c }
            int r7 = r6.length()     // Catch:{ Exception -> 0x021c }
            int r8 = r7 * 64
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x021c }
            w5.d$c[] r8 = new p392w5.C22868d.C22871c[r7]     // Catch:{ Exception -> 0x021c }
            r9 = 1
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0026:
            if (r11 >= r7) goto L_0x0219
            w5.d$c r14 = new w5.d$c     // Catch:{ Exception -> 0x0214 }
            r14.<init>(r0)     // Catch:{ Exception -> 0x0214 }
            org.json.JSONObject r15 = r6.getJSONObject(r11)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r10 = "AbsoluteTime"
            int r10 = r15.getInt(r10)     // Catch:{ Exception -> 0x0214 }
            r14.f65757a = r10     // Catch:{ Exception -> 0x0214 }
            int r12 = r12 + r13
            if (r11 <= 0) goto L_0x003f
            if (r10 >= r12) goto L_0x003f
            return r5
        L_0x003f:
            java.lang.String r12 = "Pattern"
            org.json.JSONArray r12 = r15.getJSONArray(r12)     // Catch:{ Exception -> 0x0214 }
            r13 = 16
            int r15 = r12.length()     // Catch:{ Exception -> 0x0214 }
            int r13 = java.lang.Math.min(r13, r15)     // Catch:{ Exception -> 0x0214 }
            w5.d$b[] r15 = new p392w5.C22868d.C22870b[r13]     // Catch:{ Exception -> 0x0214 }
            r14.f65758b = r15     // Catch:{ Exception -> 0x0214 }
            r15 = 0
            r16 = -1
            r17 = 0
        L_0x0058:
            if (r15 >= r13) goto L_0x01eb
            org.json.JSONObject r5 = r12.getJSONObject(r15)     // Catch:{ Exception -> 0x0214 }
            r18 = r6
            java.lang.String r6 = "Event"
            org.json.JSONObject r5 = r5.getJSONObject(r6)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r6 = "Type"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ Exception -> 0x0214 }
            r19 = r7
            java.lang.String r7 = "continuous"
            boolean r7 = android.text.TextUtils.equals(r7, r6)     // Catch:{ Exception -> 0x0214 }
            r20 = r9
            if (r7 == 0) goto L_0x0087
            w5.d$b[] r6 = r14.f65758b     // Catch:{ Exception -> 0x0084 }
            w5.d$a r7 = new w5.d$a     // Catch:{ Exception -> 0x0084 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0084 }
            r6[r15] = r7     // Catch:{ Exception -> 0x0084 }
            r6 = 4096(0x1000, float:5.74E-42)
            goto L_0x009b
        L_0x0084:
            r5 = r8
            goto L_0x021d
        L_0x0087:
            java.lang.String r7 = "transient"
            boolean r6 = android.text.TextUtils.equals(r7, r6)     // Catch:{ Exception -> 0x0214 }
            if (r6 == 0) goto L_0x01de
            w5.d$b[] r6 = r14.f65758b     // Catch:{ Exception -> 0x0214 }
            w5.d$e r7 = new w5.d$e     // Catch:{ Exception -> 0x0214 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0214 }
            r6[r15] = r7     // Catch:{ Exception -> 0x0214 }
            r6 = 4097(0x1001, float:5.741E-42)
        L_0x009b:
            java.lang.String r7 = "Index"
            int r7 = r5.getInt(r7)     // Catch:{ Exception -> 0x0214 }
            w5.d$b[] r9 = r14.f65758b     // Catch:{ Exception -> 0x0214 }
            r9 = r9[r15]     // Catch:{ Exception -> 0x0214 }
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x0214 }
            r9.f65752c = r7     // Catch:{ Exception -> 0x0214 }
            boolean r7 = r5.has(r4)     // Catch:{ Exception -> 0x0214 }
            if (r7 != 0) goto L_0x00b0
            r1 = 0
            return r1
        L_0x00b0:
            int r7 = r5.getInt(r4)     // Catch:{ Exception -> 0x0214 }
            if (r15 <= 0) goto L_0x00b8
            r9 = r16
        L_0x00b8:
            if (r7 >= 0) goto L_0x00c6
            r21 = r1
            r16 = r4
            r22 = r8
            r23 = r10
        L_0x00c2:
            r12 = r17
            goto L_0x01e9
        L_0x00c6:
            java.lang.String r9 = "Parameters"
            org.json.JSONObject r9 = r5.getJSONObject(r9)     // Catch:{ Exception -> 0x0214 }
            r16 = r4
            int r4 = r9.getInt(r3)     // Catch:{ Exception -> 0x0214 }
            r23 = r10
            int r10 = r9.getInt(r2)     // Catch:{ Exception -> 0x0214 }
            r24 = r12
            r12 = 100
            r25 = r13
            r13 = 4096(0x1000, float:5.74E-42)
            if (r6 != r13) goto L_0x00f4
            r13 = 0
            boolean r21 = r0.mo36042m(r4, r13, r12)     // Catch:{ Exception -> 0x0084 }
            if (r21 == 0) goto L_0x00ef
            boolean r12 = r0.mo36042m(r10, r13, r12)     // Catch:{ Exception -> 0x0084 }
            if (r12 != 0) goto L_0x010a
        L_0x00ef:
            r21 = r1
            r22 = r8
            goto L_0x00c2
        L_0x00f4:
            r13 = 4097(0x1001, float:5.741E-42)
            if (r6 != r13) goto L_0x010a
            r13 = 0
            boolean r12 = r0.mo36042m(r4, r13, r12)     // Catch:{ Exception -> 0x0084 }
            if (r12 == 0) goto L_0x00ef
            r12 = -50
            r13 = 150(0x96, float:2.1E-43)
            boolean r12 = r0.mo36042m(r10, r12, r13)     // Catch:{ Exception -> 0x0084 }
            if (r12 != 0) goto L_0x010a
            goto L_0x00ef
        L_0x010a:
            w5.d$b[] r12 = r14.f65758b     // Catch:{ Exception -> 0x0214 }
            r12 = r12[r15]     // Catch:{ Exception -> 0x0214 }
            r12.f65750a = r6     // Catch:{ Exception -> 0x0214 }
            r12.f65753d = r7     // Catch:{ Exception -> 0x0214 }
            r12.f65754e = r4     // Catch:{ Exception -> 0x0214 }
            r12.f65755f = r10     // Catch:{ Exception -> 0x0214 }
            r4 = 4096(0x1000, float:5.74E-42)
            if (r4 != r6) goto L_0x01ad
            boolean r4 = r5.has(r1)     // Catch:{ Exception -> 0x0214 }
            if (r4 != 0) goto L_0x0122
            r1 = 0
            return r1
        L_0x0122:
            int r4 = r5.getInt(r1)     // Catch:{ Exception -> 0x0214 }
            r5 = 5000(0x1388, float:7.006E-42)
            r13 = 0
            boolean r5 = r0.mo36042m(r4, r13, r5)     // Catch:{ Exception -> 0x0214 }
            if (r5 != 0) goto L_0x0130
            goto L_0x00ef
        L_0x0130:
            w5.d$b[] r5 = r14.f65758b     // Catch:{ Exception -> 0x0214 }
            r5 = r5[r15]     // Catch:{ Exception -> 0x0214 }
            r5.f65756g = r4     // Catch:{ Exception -> 0x0214 }
            java.lang.String r5 = "Curve"
            org.json.JSONArray r5 = r9.getJSONArray(r5)     // Catch:{ Exception -> 0x0214 }
            w5.d$b[] r6 = r14.f65758b     // Catch:{ Exception -> 0x0214 }
            r6 = r6[r15]     // Catch:{ Exception -> 0x0214 }
            w5.d$a r6 = (p392w5.C22868d.C22869a) r6     // Catch:{ Exception -> 0x0214 }
            int r9 = r5.length()     // Catch:{ Exception -> 0x0214 }
            byte r9 = (byte) r9     // Catch:{ Exception -> 0x0214 }
            r6.f65748h = r9     // Catch:{ Exception -> 0x0214 }
            int r6 = r5.length()     // Catch:{ Exception -> 0x0214 }
            w5.d$d[] r9 = new p392w5.C22868d.C22872d[r6]     // Catch:{ Exception -> 0x0214 }
            r21 = r1
            r10 = 0
            r12 = 0
            r13 = -1
        L_0x0154:
            int r1 = r5.length()     // Catch:{ Exception -> 0x0214 }
            if (r10 >= r1) goto L_0x0198
            org.json.JSONObject r1 = r5.getJSONObject(r10)     // Catch:{ Exception -> 0x0214 }
            w5.d$d r12 = new w5.d$d     // Catch:{ Exception -> 0x0214 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x0214 }
            r9[r10] = r12     // Catch:{ Exception -> 0x0214 }
            java.lang.String r12 = "Time"
            int r12 = r1.getInt(r12)     // Catch:{ Exception -> 0x0214 }
            double r26 = r1.getDouble(r3)     // Catch:{ Exception -> 0x0214 }
            r28 = 4636737291354636288(0x4059000000000000, double:100.0)
            r30 = r7
            r22 = r8
            double r7 = r26 * r28
            int r7 = (int) r7
            int r1 = r1.getInt(r2)     // Catch:{ Exception -> 0x0216 }
            if (r10 != 0) goto L_0x0182
            if (r12 == 0) goto L_0x0182
            r8 = 0
            return r8
        L_0x0182:
            r8 = 0
            if (r10 <= 0) goto L_0x0188
            if (r12 >= r13) goto L_0x0188
            return r8
        L_0x0188:
            r8 = r9[r10]     // Catch:{ Exception -> 0x0216 }
            r8.f65759a = r12     // Catch:{ Exception -> 0x0216 }
            r8.f65760b = r7     // Catch:{ Exception -> 0x0216 }
            r8.f65761c = r1     // Catch:{ Exception -> 0x0216 }
            int r10 = r10 + 1
            r13 = r12
            r8 = r22
            r7 = r30
            goto L_0x0154
        L_0x0198:
            r30 = r7
            r22 = r8
            if (r12 == r4) goto L_0x01a0
            r1 = 0
            return r1
        L_0x01a0:
            if (r6 <= 0) goto L_0x01ab
            w5.d$b[] r1 = r14.f65758b     // Catch:{ Exception -> 0x0216 }
            r1 = r1[r15]     // Catch:{ Exception -> 0x0216 }
            w5.d$a r1 = (p392w5.C22868d.C22869a) r1     // Catch:{ Exception -> 0x0216 }
            r1.f65749i = r9     // Catch:{ Exception -> 0x0216 }
            goto L_0x01b5
        L_0x01ab:
            r9 = 0
            goto L_0x01b7
        L_0x01ad:
            r21 = r1
            r30 = r7
            r22 = r8
            r4 = 22
        L_0x01b5:
            r9 = r20
        L_0x01b7:
            int r7 = r30 + r4
            r1 = r17
            if (r1 >= r7) goto L_0x01c0
            r17 = r7
            goto L_0x01c2
        L_0x01c0:
            r17 = r1
        L_0x01c2:
            if (r9 != 0) goto L_0x01c7
            r12 = r17
            goto L_0x01fc
        L_0x01c7:
            int r15 = r15 + 1
            r4 = r16
            r6 = r18
            r7 = r19
            r1 = r21
            r8 = r22
            r10 = r23
            r12 = r24
            r13 = r25
            r16 = r30
            r5 = 0
            goto L_0x0058
        L_0x01de:
            r21 = r1
            r16 = r4
            r22 = r8
            r23 = r10
            r1 = r17
            r12 = r1
        L_0x01e9:
            r9 = 0
            goto L_0x01fc
        L_0x01eb:
            r21 = r1
            r16 = r4
            r18 = r6
            r19 = r7
            r22 = r8
            r20 = r9
            r23 = r10
            r1 = r17
            r12 = r1
        L_0x01fc:
            if (r9 != 0) goto L_0x0200
            r1 = 0
            return r1
        L_0x0200:
            r1 = 0
            r22[r11] = r14     // Catch:{ Exception -> 0x0216 }
            int r11 = r11 + 1
            r5 = r1
            r4 = r16
            r6 = r18
            r7 = r19
            r1 = r21
            r8 = r22
            r13 = r23
            goto L_0x0026
        L_0x0214:
            r22 = r8
        L_0x0216:
            r5 = r22
            goto L_0x021d
        L_0x0219:
            r22 = r8
            goto L_0x021e
        L_0x021c:
            r1 = r5
        L_0x021d:
            r8 = r5
        L_0x021e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p392w5.C22868d.mo36043n(java.lang.String):w5.d$c[]");
    }
}
