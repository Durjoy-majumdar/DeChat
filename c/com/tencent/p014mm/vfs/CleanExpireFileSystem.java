package com.tencent.p014mm.vfs;

import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.ExpireFileSystem;
import com.tencent.p014mm.vfs.FileSystem;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.CleanExpireFileSystem */
public class CleanExpireFileSystem extends ExpireFileSystem {
    public static final Parcelable.Creator<CleanExpireFileSystem> CREATOR = new C116197a();

    /* renamed from: h */
    public final long f348722h;

    /* renamed from: i */
    public final boolean f348723i;

    /* renamed from: com.tencent.mm.vfs.CleanExpireFileSystem$a */
    public class C116197a implements Parcelable.Creator<CleanExpireFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new CleanExpireFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new CleanExpireFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.CleanExpireFileSystem$b */
    public class C116198b extends ExpireFileSystem.C116212b implements Handler.Callback {

        /* renamed from: i */
        public final Object f348724i = new Object();

        /* renamed from: j */
        public HashMap<String, Long> f348725j;

        /* renamed from: n */
        public final Handler f348726n;

        public C116198b(FileSystem.C85995c cVar, Map<String, Object> map) {
            super(cVar, CleanExpireFileSystem.this.f348722h, map);
            if (CleanExpireFileSystem.this.f348723i) {
                this.f348725j = new HashMap<>();
                this.f348726n = new Handler(C116281f0.C116289i.f348994a.f348971r.getLooper(), this);
                return;
            }
            this.f348725j = null;
            this.f348726n = null;
        }

        /* renamed from: N */
        public final void mo177620N(String str, boolean z) {
            boolean isEmpty;
            if (CleanExpireFileSystem.this.f348723i) {
                if (z) {
                    synchronized (this.f348724i) {
                        this.f348725j.remove(str);
                    }
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (this.f348724i) {
                    isEmpty = this.f348725j.isEmpty();
                    this.f348725j.put(str, Long.valueOf(currentTimeMillis));
                }
                if (isEmpty) {
                    this.f348726n.sendMessageDelayed(Message.obtain(), 60000);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x03fb  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0403  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x056f  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x059c  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x0603  */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x065d  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x068f  */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x0713  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x07fb A[LOOP:7: B:193:0x07f5->B:195:0x07fb, LOOP_END] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo119928a(android.os.CancellationSignal r50) {
            /*
                r49 = this;
                r1 = r49
                r2 = r50
                r3 = 0
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r4 = 1
                r1.mo177781F(r4, r0)
                com.tencent.mm.vfs.CleanExpireFileSystem r0 = com.tencent.p014mm.vfs.CleanExpireFileSystem.this
                boolean r0 = r0.f348723i
                if (r0 == 0) goto L_0x005a
                java.lang.Object r6 = r1.f348724i
                monitor-enter(r6)
                java.util.HashMap<java.lang.String, java.lang.Long> r0 = r1.f348725j     // Catch:{ all -> 0x0057 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0057 }
                if (r0 != 0) goto L_0x0026
                java.util.HashMap<java.lang.String, java.lang.Long> r0 = r1.f348725j     // Catch:{ all -> 0x0057 }
                java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0057 }
                r7.<init>()     // Catch:{ all -> 0x0057 }
                r1.f348725j = r7     // Catch:{ all -> 0x0057 }
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                monitor-exit(r6)     // Catch:{ all -> 0x0057 }
                if (r0 == 0) goto L_0x005a
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x0032:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x005a
                java.lang.Object r6 = r0.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                r50.throwIfCanceled()
                com.tencent.mm.vfs.FileSystem$c r7 = r1.f348754e
                java.lang.Object r8 = r6.getKey()
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r6 = r6.getValue()
                java.lang.Long r6 = (java.lang.Long) r6
                long r9 = r6.longValue()
                r7.mo119935e(r8, r9)
                goto L_0x0032
            L_0x0057:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0057 }
                throw r0
            L_0x005a:
                r50.throwIfCanceled()
                com.tencent.mm.pointers.PLong r6 = new com.tencent.mm.pointers.PLong
                r6.<init>()
                com.tencent.mm.pointers.PLong r7 = new com.tencent.mm.pointers.PLong
                r7.<init>()
                java.lang.String r0 = "CleanExpireFileSystem"
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
                java.lang.String r0 = "CleanExpireCurrentExpireTime"
                r9 = 0
                long r11 = r8.getLong(r0, r9)
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r13 = "clicfg_clean_expire_default_expire_time"
                r14 = 604800000(0x240c8400, double:2.988109026E-315)
                java.lang.String r9 = java.lang.Long.toString(r14)
                java.lang.String r0 = r0.mo182444f(r13, r9, r3, r4)
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r14)
                java.lang.String r0 = "VFS.CleanExpireFileSystem"
                java.lang.String r13 = "originExpireTime:%d min"
                java.lang.Object[] r14 = new java.lang.Object[r4]
                r18 = 60
                long r20 = r11 / r18
                r22 = 1000(0x3e8, double:4.94E-321)
                long r20 = r20 / r22
                java.lang.Long r15 = java.lang.Long.valueOf(r20)
                r14[r3] = r15
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r14)
                double r13 = (double) r11
                r20 = 4721067015706509312(0x4184997000000000, double:4.32E7)
                int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
                if (r0 < 0) goto L_0x00af
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x00b5
            L_0x00af:
                java.lang.String r0 = "CleanExpireCurrentExpireTime"
                r8.encode((java.lang.String) r0, (long) r9)
                r11 = r9
            L_0x00b5:
                long r13 = java.lang.System.currentTimeMillis()
                com.tencent.mm.storage.r1 r0 = com.tencent.p014mm.storage.C6716r1.m7012jo()
                int r15 = r0.getCount()
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r5 = "clicfg_clean_expire_storage_min"
                java.lang.String r2 = "100"
                java.lang.String r0 = r0.mo182444f(r5, r2, r3, r4)
                r2 = 100
                int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
                r25 = -1
                r26 = 5
                r5 = 4
                if (r15 <= r2) goto L_0x053b
                com.tencent.mm.storage.r1 r0 = com.tencent.p014mm.storage.C6716r1.m7012jo()
                r0.getClass()
                java.lang.Object[] r4 = new java.lang.Object[r5]
                java.lang.String r31 = "id"
                r4[r3] = r31
                java.lang.String r32 = "CleanDeleteItem"
                r27 = 1
                r4[r27] = r32
                r30 = 2
                r4[r30] = r31
                r29 = 3
                r4[r29] = r32
                java.lang.String r5 = "SELECT SUM(IdCount) FROM (SELECT COUNT( %s ) AS IdCount FROM %s GROUP BY %s ) %s WHERE IdCount > 1"
                java.lang.String r4 = java.lang.String.format(r5, r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r3 = "calculateRepetitionCount:"
                r5.append(r3)
                r5.append(r4)
                java.lang.String r3 = r5.toString()
                java.lang.String r5 = "MicroMsg.CleanDeleteItemStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r3)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f24130d
                r3 = 0
                android.database.Cursor r0 = r0.rawQuery(r4, r3)
                if (r0 != 0) goto L_0x0121
                java.lang.String r0 = "calculateTheRepetitionRatio failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
                r4 = 0
                goto L_0x0144
            L_0x0121:
                boolean r3 = r0.moveToFirst()
                if (r3 == 0) goto L_0x012f
                r3 = 0
                int r32 = r0.getInt(r3)
                r4 = r32
                goto L_0x0131
            L_0x012f:
                r3 = 0
                r4 = 0
            L_0x0131:
                r0.close()
                r3 = 1
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r32 = 0
                r0[r32] = r3
                java.lang.String r3 = "calculateRepetitionCount, count:%d,"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r0)
            L_0x0144:
                float r0 = (float) r4
                r3 = 1232348160(0x49742400, float:1000000.0)
                float r0 = r0 * r3
                float r4 = (float) r15
                float r5 = r0 / r4
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r3 = "clicfg_clean_expire_repetition_ratio_list_size"
                java.lang.String r1 = "28"
                r34 = r13
                r13 = 1
                r14 = 0
                java.lang.String r0 = r0.mo182444f(r3, r1, r14, r13)
                r1 = 28
                int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
                java.lang.String r0 = "CleanExpireRepetitionRatioList"
                java.lang.String r3 = ""
                java.lang.String r0 = r8.getString(r0, r3)
                te3.cw r3 = new te3.cw
                r3.<init>()
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r13 != 0) goto L_0x0197
                java.lang.String r13 = "ISO-8859-1"
                byte[] r0 = r0.getBytes(r13)     // Catch:{ IOException -> 0x0180 }
                r3.parseFrom(r0)     // Catch:{ IOException -> 0x0180 }
                goto L_0x0197
            L_0x0180:
                r0 = move-exception
                java.lang.String r13 = "VFS.CleanExpireFileSystem"
                java.lang.String r14 = "Parsing Failed: %s"
                r37 = r2
                r36 = r4
                r4 = 1
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r0 = r0.getMessage()
                r4 = 0
                r2[r4] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r14, r2)
                goto L_0x019b
            L_0x0197:
                r37 = r2
                r36 = r4
            L_0x019b:
                java.util.LinkedList<java.lang.Float> r0 = r3.f131990d
                if (r0 != 0) goto L_0x01a6
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r3.f131990d = r0
            L_0x01a6:
                java.util.LinkedList<java.lang.Float> r0 = r3.f131990d
                int r0 = r0.size()
                if (r0 <= r1) goto L_0x01b4
                java.util.LinkedList<java.lang.Float> r0 = r3.f131990d
                r0.removeFirst()
                goto L_0x01a6
            L_0x01b4:
                java.util.LinkedList<java.lang.Float> r0 = r3.f131990d
                java.lang.Float r1 = java.lang.Float.valueOf(r5)
                r0.add(r1)
                java.util.LinkedList<java.lang.Float> r0 = r3.f131990d
                int r1 = r0.size()
                java.lang.String r0 = "CleanExpireRepetitionRatioList"
                java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01d5 }
                byte[] r4 = r3.toByteArray()     // Catch:{ IOException -> 0x01d5 }
                java.nio.charset.Charset r13 = z04.C119027c.f356489b     // Catch:{ IOException -> 0x01d5 }
                r2.<init>(r4, r13)     // Catch:{ IOException -> 0x01d5 }
                r8.encode((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ IOException -> 0x01d5 }
                r13 = 0
                goto L_0x01e7
            L_0x01d5:
                r0 = move-exception
                java.lang.String r2 = "VFS.CleanExpireFileSystem"
                java.lang.String r4 = "toByteArray Failed: %s"
                r13 = 1
                java.lang.Object[] r14 = new java.lang.Object[r13]
                java.lang.String r0 = r0.getMessage()
                r13 = 0
                r14[r13] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r14)
            L_0x01e7:
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r2 = "clicfg_clean_expire_repetition_ratio_min_size"
                java.lang.String r4 = "7"
                r14 = 1
                java.lang.String r0 = r0.mo182444f(r2, r4, r13, r14)
                r2 = 7
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
                if (r1 < r0) goto L_0x0532
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r2 = "clicfg_clean_expire_change_switch"
                java.lang.String r4 = "2"
                java.lang.String r0 = r0.mo182444f(r2, r4, r13, r14)
                r2 = 2
                int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
                if (r4 <= 0) goto L_0x0429
                r38 = 0
                if (r4 != r14) goto L_0x0255
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r2 = "clicfg_clean_expire_repetition_ratio_left_range"
                java.lang.String r3 = "0.009"
                java.lang.String r0 = r0.mo182444f(r2, r3, r13, r14)
                r2 = 1007908028(0x3c1374bc, float:0.009)
                float r0 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r0, r2)
                r2 = 1232348160(0x49742400, float:1000000.0)
                float r0 = r0 * r2
                double r2 = (double) r0
                oa1.d r0 = oa1.C117731d.m166007c()
                r40 = r1
                java.lang.String r1 = "clicfg_clean_expire_repetition_ratio_right_range"
                r38 = r2
                java.lang.String r2 = "0.011"
                java.lang.String r0 = r0.mo182444f(r1, r2, r13, r14)
                r1 = 1010055512(0x3c343958, float:0.011)
                float r0 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r0, r1)
                r1 = 1232348160(0x49742400, float:1000000.0)
                float r0 = r0 * r1
                double r0 = (double) r0
                r41 = r4
                r43 = r6
                r2 = r7
                r42 = r15
                r13 = r38
            L_0x0251:
                r38 = r0
                goto L_0x0397
            L_0x0255:
                r40 = r1
                r1 = 2
                if (r4 != r1) goto L_0x038e
                java.util.LinkedList<java.lang.Float> r0 = r3.f131990d
                if (r0 != 0) goto L_0x0298
                java.lang.String r0 = "CleanExpireRepetitionRatioList"
                java.lang.String r1 = ""
                java.lang.String r0 = r8.getString(r0, r1)
                te3.cw r3 = new te3.cw
                r3.<init>()
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r1 != 0) goto L_0x028d
                java.lang.String r1 = "ISO-8859-1"
                byte[] r0 = r0.getBytes(r1)     // Catch:{ IOException -> 0x027b }
                r3.parseFrom(r0)     // Catch:{ IOException -> 0x027b }
                goto L_0x028d
            L_0x027b:
                r0 = move-exception
                java.lang.String r1 = "VFS.CleanExpireFileSystem"
                java.lang.String r2 = "Parsing Failed: %s"
                r13 = 1
                java.lang.Object[] r14 = new java.lang.Object[r13]
                java.lang.String r0 = r0.getMessage()
                r13 = 0
                r14[r13] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r14)
            L_0x028d:
                java.util.LinkedList<java.lang.Float> r0 = r3.f131990d
                if (r0 != 0) goto L_0x0298
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r3.f131990d = r0
            L_0x0298:
                java.util.LinkedList<java.lang.Float> r0 = r3.f131990d
                int r0 = r0.size()
                r1 = 0
                if (r0 <= 0) goto L_0x030c
                java.lang.Float r2 = java.lang.Float.valueOf(r1)
                java.util.LinkedList<java.lang.Float> r13 = r3.f131990d
                java.util.Iterator r13 = r13.iterator()
            L_0x02ab:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x02c5
                java.lang.Object r14 = r13.next()
                java.lang.Float r14 = (java.lang.Float) r14
                float r2 = r2.floatValue()
                float r14 = r14.floatValue()
                float r2 = r2 + r14
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                goto L_0x02ab
            L_0x02c5:
                float r2 = r2.floatValue()
                float r13 = (float) r0
                float r2 = r2 / r13
                java.lang.Double r13 = java.lang.Double.valueOf(r38)
                java.util.LinkedList<java.lang.Float> r3 = r3.f131990d
                java.util.Iterator r3 = r3.iterator()
            L_0x02d5:
                boolean r14 = r3.hasNext()
                if (r14 == 0) goto L_0x02fd
                java.lang.Object r14 = r3.next()
                java.lang.Float r14 = (java.lang.Float) r14
                double r38 = r13.doubleValue()
                float r13 = r14.floatValue()
                float r13 = r13 - r2
                double r13 = (double) r13
                r41 = r2
                r1 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r1 = java.lang.Math.pow(r13, r1)
                double r38 = r38 + r1
                java.lang.Double r13 = java.lang.Double.valueOf(r38)
                r2 = r41
                r1 = 0
                goto L_0x02d5
            L_0x02fd:
                r41 = r2
                double r1 = r13.doubleValue()
                double r13 = (double) r0
                double r1 = r1 / r13
                double r38 = java.lang.Math.sqrt(r1)
                r2 = r41
                goto L_0x030d
            L_0x030c:
                r2 = 0
            L_0x030d:
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r1 = "clicfg_clean_expire_repetition_ratio_left_range_var_count"
                java.lang.String r3 = "1"
                r13 = 1
                r14 = 0
                java.lang.String r0 = r0.mo182444f(r1, r3, r14, r13)
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r13)
                oa1.d r1 = oa1.C117731d.m166007c()
                java.lang.String r3 = "clicfg_clean_expire_repetition_ratio_right_range_var_count"
                r41 = r4
                java.lang.String r4 = "2"
                java.lang.String r1 = r1.mo182444f(r3, r4, r14, r13)
                r3 = 2
                int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r3)
                oa1.d r3 = oa1.C117731d.m166007c()
                java.lang.String r4 = "clicfg_clean_expire_repetition_min"
                r42 = r15
                java.lang.String r15 = "-1"
                java.lang.String r3 = r3.mo182444f(r4, r15, r14, r13)
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                float r3 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r3, r4)
                r15 = 1232348160(0x49742400, float:1000000.0)
                float r3 = r3 * r15
                oa1.d r15 = oa1.C117731d.m166007c()
                java.lang.String r4 = "clicfg_clean_expire_repetition_max"
                r43 = r6
                java.lang.String r6 = "-1"
                java.lang.String r4 = r15.mo182444f(r4, r6, r14, r13)
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                float r4 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r4, r6)
                r13 = 1232348160(0x49742400, float:1000000.0)
                float r4 = r4 * r13
                double r13 = (double) r2
                r2 = r7
                double r6 = (double) r0
                double r6 = r6 * r38
                double r6 = r6 + r13
                double r0 = (double) r1
                double r0 = r0 * r38
                double r38 = r13 + r0
                r0 = 0
                int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r1 <= 0) goto L_0x038c
                double r13 = (double) r3
                int r1 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r1 >= 0) goto L_0x038c
                int r1 = (r38 > r13 ? 1 : (r38 == r13 ? 0 : -1))
                if (r1 >= 0) goto L_0x0397
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x0384
                double r0 = (double) r4
                goto L_0x0251
            L_0x0384:
                r0 = 4607632778762754458(0x3ff199999999999a, double:1.1)
                double r38 = r13 * r0
                goto L_0x0397
            L_0x038c:
                r13 = r6
                goto L_0x0397
            L_0x038e:
                r41 = r4
                r43 = r6
                r2 = r7
                r42 = r15
                r13 = r38
            L_0x0397:
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r1 = "clicfg_clean_expire_time_change_threshold"
                java.lang.Long r3 = new java.lang.Long
                r6 = 259200000(0xf731400, double:1.280618154E-315)
                r3.<init>(r6)
                java.lang.String r3 = r3.toString()
                r4 = 1
                r15 = 0
                java.lang.String r0 = r0.mo182444f(r1, r3, r15, r4)
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r6)
                oa1.d r3 = oa1.C117731d.m166007c()
                java.lang.String r6 = "clicfg_clean_expire_time_change_step"
                java.lang.Long r7 = new java.lang.Long
                r44 = r5
                r4 = 86400000(0x5265c00, double:4.2687272E-316)
                r7.<init>(r4)
                java.lang.String r4 = r7.toString()
                r5 = 1
                java.lang.String r3 = r3.mo182444f(r6, r4, r15, r5)
                r6 = 86400000(0x5265c00, double:4.2687272E-316)
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r6)
                oa1.d r6 = oa1.C117731d.m166007c()
                java.lang.String r7 = "clicfg_clean_expire_time_change_step_ratio"
                java.lang.Float r5 = new java.lang.Float
                r15 = 1230570382(0x4959038e, float:888888.9)
                r5.<init>(r15)
                java.lang.String r5 = r5.toString()
                r45 = r2
                r2 = 0
                r15 = 1
                java.lang.String r5 = r6.mo182444f(r7, r5, r2, r15)
                r2 = 1230570382(0x4959038e, float:888888.9)
                float r2 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r5, r2)
                r5 = r44
                double r6 = (double) r5
                int r15 = (r6 > r38 ? 1 : (r6 == r38 ? 0 : -1))
                if (r15 <= 0) goto L_0x0403
                long r3 = r3 + r11
                int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x0401
                r3 = r9
            L_0x0401:
                r0 = 1
                goto L_0x0421
            L_0x0403:
                int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r15 >= 0) goto L_0x041f
                int r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x040e
                long r0 = r11 - r3
                goto L_0x0416
            L_0x040e:
                float r0 = (float) r11
                float r2 = r2 * r0
                long r0 = (long) r2
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r0 = r0 / r2
            L_0x0416:
                r3 = r0
                double r0 = (double) r3
                int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
                if (r2 >= 0) goto L_0x041d
                r3 = r11
            L_0x041d:
                r0 = 2
                goto L_0x0421
            L_0x041f:
                r3 = r11
                r0 = 0
            L_0x0421:
                java.lang.String r1 = "CleanExpireCurrentExpireTime"
                r8.encode((java.lang.String) r1, (long) r3)
                r25 = r0
                goto L_0x0434
            L_0x0429:
                r40 = r1
                r41 = r4
                r43 = r6
                r45 = r7
                r42 = r15
                r3 = r11
            L_0x0434:
                com.tencent.mm.storage.r1 r0 = com.tencent.p014mm.storage.C6716r1.m7012jo()
                r0.getClass()
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r1 = "CleanDeleteItem"
                r6 = 0
                r2[r6] = r1
                java.lang.String r1 = "SELECT * FROM %s"
                java.lang.String r1 = java.lang.String.format(r1, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "calculateFreeSpaceSize, sql = "
                r2.append(r7)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r7 = "MicroMsg.CleanDeleteItemStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                java.lang.String[] r2 = new java.lang.String[r6]
                android.database.Cursor r0 = r0.rawQuery(r1, r2)
                if (r0 != 0) goto L_0x046c
                r6 = r43
                r2 = r45
                goto L_0x04a4
            L_0x046c:
                boolean r1 = r0.moveToNext()
                if (r1 == 0) goto L_0x049d
                com.tencent.mm.storage.q1 r1 = new com.tencent.mm.storage.q1
                r1.<init>()
                r1.convertFrom(r0)
                long r6 = r1.field_deleteTime
                long r13 = r1.field_modifyTime
                long r6 = r6 - r13
                int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r2 >= 0) goto L_0x048d
                r2 = r45
                long r6 = r2.value
                long r13 = r1.field_size
                long r6 = r6 + r13
                r2.value = r6
                goto L_0x048f
            L_0x048d:
                r2 = r45
            L_0x048f:
                r6 = r43
                long r7 = r6.value
                long r13 = r1.field_size
                long r7 = r7 + r13
                r6.value = r7
                r45 = r2
                r43 = r6
                goto L_0x046c
            L_0x049d:
                r6 = r43
                r2 = r45
                r0.close()
            L_0x04a4:
                com.tencent.mm.storage.r1 r0 = com.tencent.p014mm.storage.C6716r1.m7012jo()
                r0.getClass()
                r1 = 6
                java.lang.Object[] r7 = new java.lang.Object[r1]
                java.lang.String r1 = "id"
                r8 = 0
                r7[r8] = r1
                java.lang.String r8 = "CleanDeleteItem"
                r13 = 1
                r7[r13] = r8
                java.lang.String r13 = "saveTime"
                r14 = 2
                r7[r14] = r13
                java.lang.Long r13 = java.lang.Long.valueOf(r9)
                r14 = 3
                r7[r14] = r13
                r13 = 4
                r7[r13] = r1
                r7[r26] = r8
                java.lang.String r1 = "SELECT SUM(IdCount) FROM (SELECT COUNT( %s ) AS IdCount FROM %s WHERE %s >= %d GROUP BY %s ) %s WHERE IdCount > 1"
                java.lang.String r1 = java.lang.String.format(r1, r7)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "calculateDefaultRepetitionCount:"
                r7.append(r8)
                r7.append(r1)
                java.lang.String r7 = r7.toString()
                java.lang.String r8 = "MicroMsg.CleanDeleteItemStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r7)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f24130d
                r7 = 0
                android.database.Cursor r0 = r0.rawQuery(r1, r7)
                if (r0 != 0) goto L_0x04f5
                java.lang.String r0 = "calculateTheRepetitionRatio failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                r13 = 0
                goto L_0x051d
            L_0x04f5:
                boolean r1 = r0.moveToFirst()
                if (r1 == 0) goto L_0x0503
                r1 = 0
                int r32 = r0.getInt(r1)
                r13 = r32
                goto L_0x0505
            L_0x0503:
                r1 = 0
                r13 = 0
            L_0x0505:
                r0.close()
                r14 = 2
                java.lang.Object[] r0 = new java.lang.Object[r14]
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r0[r1] = r9
                java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                r9 = 1
                r0[r9] = r1
                java.lang.String r1 = "calculateDefaultRepetitionCount, threshold:%d, count:%d,"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r0)
            L_0x051d:
                long r0 = (long) r13
                r8 = r37
                r9 = r42
                if (r9 <= r8) goto L_0x052f
                float r0 = (float) r0
                r1 = 1232348160(0x49742400, float:1000000.0)
                float r0 = r0 * r1
                float r0 = r0 / r36
                r28 = r0
                goto L_0x0549
            L_0x052f:
                r28 = -1082130432(0xffffffffbf800000, float:-1.0)
                goto L_0x0549
            L_0x0532:
                r40 = r1
                r2 = r7
                r9 = r15
                r7 = 0
                r3 = r11
                r28 = -1082130432(0xffffffffbf800000, float:-1.0)
                goto L_0x0547
            L_0x053b:
                r2 = r7
                r34 = r13
                r9 = r15
                r7 = 0
                r3 = r11
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                r28 = -1082130432(0xffffffffbf800000, float:-1.0)
                r40 = 0
            L_0x0547:
                r41 = -1
            L_0x0549:
                long r0 = java.lang.System.currentTimeMillis()
                long r0 = r0 - r34
                r13 = -1
                long r0 = r0 + r13
                long r33 = java.lang.System.currentTimeMillis()
                oa1.d r8 = oa1.C117731d.m166007c()
                java.lang.String r10 = "clicfg_sns_file_clean_min_since"
                java.lang.String r15 = "0"
                r7 = 1
                r13 = 0
                java.lang.String r8 = r8.mo182444f(r10, r15, r13, r7)
                r13 = 0
                long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r13)
                double r13 = (double) r7
                int r10 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
                if (r10 <= 0) goto L_0x0570
                r3 = r7
            L_0x0570:
                long r33 = r33 - r3
                java.lang.String r7 = "VFS.CleanExpireFileSystem"
                java.lang.String r8 = "newExpireTime:%s = %s h"
                r10 = 2
                java.lang.Object[] r13 = new java.lang.Object[r10]
                java.lang.Long r10 = java.lang.Long.valueOf(r3)
                r14 = 0
                r13[r14] = r10
                long r14 = r3 / r22
                long r14 = r14 / r18
                long r14 = r14 / r18
                java.lang.Long r10 = java.lang.Long.valueOf(r14)
                r14 = 1
                r13[r14] = r10
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r13)
                r7 = r49
                com.tencent.mm.vfs.FileSystem$c r8 = r7.f348754e
                java.lang.String r10 = ""
                java.lang.Iterable r8 = com.tencent.p014mm.vfs.C116299g2.m163859o(r8, r10)
                if (r8 == 0) goto L_0x065d
                qp3.a r8 = (qp3.C118196a) r8
                java.util.Iterator r8 = r8.iterator()
                r13 = 0
                r20 = 0
                r37 = 0
                r42 = 0
            L_0x05aa:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x0653
                java.lang.Object r10 = r8.next()
                com.tencent.mm.vfs.b0 r10 = (com.tencent.p014mm.vfs.C86001b0) r10
                r50.throwIfCanceled()
                r15 = r8
                long r7 = r10.f250474d
                r16 = 0
                int r39 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r39 >= 0) goto L_0x05c4
                long r7 = r10.f250473c
            L_0x05c4:
                long r20 = r20 + r7
                r44 = 1
                long r37 = r37 + r44
                r39 = r15
                boolean r15 = r10.f250476f
                r46 = r3
                if (r15 != 0) goto L_0x0649
                long r3 = r10.f250475e
                int r15 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
                if (r15 <= 0) goto L_0x05da
                goto L_0x0649
            L_0x05da:
                com.tencent.mm.vfs.FileSystem$c r3 = r10.f250477g     // Catch:{ ErrnoException -> 0x05f7 }
                if (r3 == 0) goto L_0x05f4
                com.tencent.mm.vfs.FileSystem r3 = r3.mo119930u()     // Catch:{ ErrnoException -> 0x05f7 }
                boolean r3 = r3 instanceof com.tencent.p014mm.vfs.NativeFileSystem     // Catch:{ ErrnoException -> 0x05f7 }
                if (r3 == 0) goto L_0x05f4
                com.tencent.mm.vfs.FileSystem$c r3 = r10.f250477g     // Catch:{ ErrnoException -> 0x05f7 }
                java.lang.String r4 = r10.f250471a     // Catch:{ ErrnoException -> 0x05f7 }
                r15 = 0
                java.lang.String r3 = r3.mo119947w(r4, r15)     // Catch:{ ErrnoException -> 0x05f7 }
                android.system.StructStat r3 = android.system.Os.stat(r3)     // Catch:{ ErrnoException -> 0x05f7 }
                goto L_0x05f5
            L_0x05f4:
                r3 = 0
            L_0x05f5:
                if (r3 != 0) goto L_0x05fa
            L_0x05f7:
                r3 = -1
                goto L_0x05fc
            L_0x05fa:
                long r3 = r3.st_ctime     // Catch:{ ErrnoException -> 0x05f7 }
            L_0x05fc:
                r15 = 1
                boolean r48 = r10.mo119955b(r15)
                if (r48 == 0) goto L_0x0649
                long r13 = r13 + r7
                long r42 = r42 + r44
                java.lang.String r15 = r10.f250472b
                r44 = r13
                java.lang.String r13 = ".nomedia"
                boolean r13 = r15.endsWith(r13)
                if (r13 != 0) goto L_0x0644
                com.tencent.mm.storage.q1 r13 = new com.tencent.mm.storage.q1
                r13.<init>()
                r13.field_createTime = r3
                r14 = 0
                int r48 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
                if (r48 >= 0) goto L_0x0623
                long r3 = r10.f250475e
                r13.field_createTime = r3
            L_0x0623:
                long r3 = r10.f250475e
                r13.field_modifyTime = r3
                long r3 = java.lang.System.currentTimeMillis()
                r13.field_deleteTime = r3
                java.lang.String r10 = r10.f250472b
                r13.field_id = r10
                long r14 = r13.field_createTime
                long r3 = r3 - r14
                r13.field_saveTime = r3
                r13.field_size = r7
                r3 = 0
                r13.field_flags = r3
                com.tencent.mm.storage.r1 r7 = com.tencent.p014mm.storage.C6716r1.m7012jo()
                r7.insert(r13)
                goto L_0x0646
            L_0x0644:
                r3 = 0
            L_0x0646:
                r13 = r44
                goto L_0x064b
            L_0x0649:
                r3 = 0
            L_0x064b:
                r7 = r49
                r8 = r39
                r3 = r46
                goto L_0x05aa
            L_0x0653:
                r46 = r3
                r3 = r13
                r7 = r20
                r15 = r37
                r13 = r42
                goto L_0x0664
            L_0x065d:
                r46 = r3
                r3 = 0
                r7 = r3
                r13 = r7
                r15 = r13
            L_0x0664:
                long r20 = java.lang.System.currentTimeMillis()
                oa1.d r10 = oa1.C117731d.m166007c()
                r33 = r15
                java.lang.String r15 = "clicfg_clean_expire_storage_count"
                r16 = r13
                java.lang.String r13 = "50000"
                r35 = r7
                r7 = 0
                r14 = 1
                java.lang.String r8 = r10.mo182444f(r15, r13, r7, r14)
                r13 = 20000(0x4e20, double:9.8813E-320)
                long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r13)
                com.tencent.mm.storage.r1 r10 = com.tencent.p014mm.storage.C6716r1.m7012jo()
                int r10 = r10.getCount()
                long r13 = (long) r10
                int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r10 <= 0) goto L_0x0713
                com.tencent.mm.storage.r1 r10 = com.tencent.p014mm.storage.C6716r1.m7012jo()
                int r13 = r10.getCount()
                long r13 = (long) r13
                java.lang.String r15 = "MicroMsg.CleanDeleteItemStorage"
                int r24 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                r37 = r11
                if (r24 > 0) goto L_0x06a5
                java.lang.String r11 = "cleanDate don't need to clean"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r11)
            L_0x06a5:
                r11 = 6
                java.lang.Object[] r12 = new java.lang.Object[r11]
                java.lang.String r11 = "CleanDeleteItem"
                r24 = 0
                r12[r24] = r11
                java.lang.String r24 = "deleteTime"
                r27 = 1
                r12[r27] = r24
                r30 = 2
                r12[r30] = r24
                r29 = 3
                r12[r29] = r11
                r31 = 4
                r12[r31] = r24
                long r42 = r13 - r7
                java.lang.Long r24 = java.lang.Long.valueOf(r42)
                r12[r26] = r24
                r42 = r3
                java.lang.String r3 = "DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )"
                java.lang.String r3 = java.lang.String.format(r3, r12)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r12 = "cleanData:"
                r4.append(r12)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r4)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r10.f24130d
                boolean r3 = r4.execSQL(r11, r3)
                r4 = 4
                java.lang.Object[] r11 = new java.lang.Object[r4]
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r4 = 0
                r11[r4] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r7)
                r4 = 1
                r11[r4] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r13)
                r4 = 2
                r11[r4] = r3
                int r3 = r10.getCount()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 3
                r11[r4] = r3
                java.lang.String r3 = "cleanData result:%b, size:%d, originCount:%d, finalCount:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r11)
                goto L_0x0717
            L_0x0713:
                r42 = r3
                r37 = r11
            L_0x0717:
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r20
                long r0 = r0 + r3
                r3 = 24
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "cleanStorageCount"
                r7 = 0
                r3[r7] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
                r7 = 1
                r3[r7] = r4
                java.lang.String r4 = "cleanRepetitionRatio"
                r7 = 2
                r3[r7] = r4
                java.lang.Float r4 = java.lang.Float.valueOf(r5)
                r5 = 3
                r3[r5] = r4
                java.lang.String r4 = "cleanRepetitionRatioCount"
                r5 = 4
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r40)
                r3[r26] = r4
                java.lang.String r4 = "cleanStorageRepetitionRatio"
                r5 = 6
                r3[r5] = r4
                java.lang.Float r4 = java.lang.Float.valueOf(r28)
                r5 = 7
                r3[r5] = r4
                r4 = 8
                java.lang.String r5 = "cleanStorageDeleteSize"
                r3[r4] = r5
                r4 = 9
                long r5 = r6.value
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r3[r4] = r5
                r4 = 10
                java.lang.String r5 = "cleanStorageFreeSize"
                r3[r4] = r5
                r4 = 11
                long r5 = r2.value
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                r3[r4] = r2
                r2 = 12
                java.lang.String r4 = "deleteSize"
                r3[r2] = r4
                r2 = 13
                java.lang.Long r4 = java.lang.Long.valueOf(r42)
                r3[r2] = r4
                r2 = 14
                java.lang.String r4 = "cleanOriginExpireTime"
                r3[r2] = r4
                r2 = 15
                java.lang.Long r4 = java.lang.Long.valueOf(r37)
                r3[r2] = r4
                r2 = 16
                java.lang.String r4 = "cleanNewExpireTime"
                r3[r2] = r4
                r2 = 17
                java.lang.Long r4 = java.lang.Long.valueOf(r46)
                r3[r2] = r4
                r2 = 18
                java.lang.String r4 = "cleanExtraCostTime"
                r3[r2] = r4
                r2 = 19
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r3[r2] = r0
                r0 = 20
                java.lang.String r1 = "cleanTrend"
                r3[r0] = r1
                r0 = 21
                java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
                r3[r0] = r1
                r0 = 22
                java.lang.String r1 = "changeSwitch"
                r3[r0] = r1
                r0 = 23
                java.lang.Integer r1 = java.lang.Integer.valueOf(r41)
                r3[r0] = r1
                r2 = 3
                r1 = r49
                r1.mo177781F(r2, r3)
                com.tencent.mm.autogen.events.SnsCleanStorageEvent r0 = new com.tencent.mm.autogen.events.SnsCleanStorageEvent
                r0.<init>()
                com.tencent.mm.autogen.events.SnsCleanStorageEvent$a r2 = r0.f78986d
                long r3 = r46 / r18
                long r3 = r3 / r22
                r2.f78987a = r3
                r3 = r50
                r2.f78988b = r3
                r13 = r42
                r2.f78989c = r13
                r4 = r35
                r2.f78990d = r4
                r4 = r16
                r2.f78992f = r4
                r4 = r33
                r2.f78991e = r4
                r0.publish()
                java.util.List<com.tencent.mm.vfs.FileSystem$c> r0 = r1.f348755f
                java.util.Iterator r0 = r0.iterator()
            L_0x07f5:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0808
                java.lang.Object r2 = r0.next()
                com.tencent.mm.vfs.FileSystem$c r2 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r2
                r50.throwIfCanceled()
                r2.mo119928a(r3)
                goto L_0x07f5
            L_0x0808:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.CleanExpireFileSystem.C116198b.mo119928a(android.os.CancellationSignal):void");
        }

        /* renamed from: b */
        public WritableByteChannel mo119932b(String str, boolean z) {
            WritableByteChannel b = this.f348754e.mo119932b(str, z);
            mo177620N(str, true);
            return b;
        }

        /* renamed from: h */
        public ReadableByteChannel mo119938h(String str) {
            ReadableByteChannel h = this.f348754e.mo119938h(str);
            mo177620N(str, false);
            return h;
        }

        public boolean handleMessage(Message message) {
            HashMap<String, Long> hashMap;
            synchronized (this.f348724i) {
                if (!this.f348725j.isEmpty()) {
                    hashMap = this.f348725j;
                    this.f348725j = new HashMap<>();
                } else {
                    hashMap = null;
                }
            }
            if (hashMap == null) {
                return true;
            }
            for (Map.Entry next : hashMap.entrySet()) {
                this.f348754e.mo119935e((String) next.getKey(), ((Long) next.getValue()).longValue());
            }
            Log.m105918d("VFS.CleanExpireFileSystem", "Flush access time cache entries: " + hashMap.size());
            return true;
        }

        /* renamed from: i */
        public ParcelFileDescriptor mo119939i(String str, String str2) {
            ParcelFileDescriptor i = this.f348754e.mo119939i(str, str2);
            mo177620N(str, str2.contains("w"));
            return i;
        }

        /* renamed from: m */
        public OutputStream mo119941m(String str, boolean z) {
            OutputStream m = this.f348754e.mo119941m(str, z);
            mo177620N(str, true);
            return m;
        }

        public InputStream openRead(String str) {
            InputStream openRead = this.f348754e.openRead(str);
            mo177620N(str, false);
            return openRead;
        }
    }

    public CleanExpireFileSystem(Parcel parcel) {
        super(parcel);
        C116299g2.m163845a(parcel, CleanExpireFileSystem.class, 2);
        this.f348723i = parcel.readByte() != 0;
        this.f348722h = this.f348752f;
    }

    /* renamed from: b */
    public FileSystem.C85995c mo177578v(Map<String, Object> map) {
        return new C116198b((FileSystem.C85995c) this.f348751e.mo177578v(map), map);
    }

    public String toString() {
        return "CleanExpire [" + this.f348751e.toString() + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C116299g2.m163866v(parcel, CleanExpireFileSystem.class, 2);
        parcel.writeByte(this.f348723i ? (byte) 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CleanExpireFileSystem(com.tencent.p014mm.vfs.FileSystem r9, long r10, boolean r12) {
        /*
            r8 = this;
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r1 = java.lang.Long.toString(r10)
            r2 = 0
            java.lang.String r3 = "clicfg_clean_expire_default_expire_time"
            r4 = 1
            java.lang.String r0 = r0.mo182444f(r3, r1, r2, r4)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r10)
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r1 = "clicfg_clean_expire_need_reset_expire_time"
            java.lang.String r3 = "0"
            java.lang.String r0 = r0.mo182444f(r1, r3, r2, r4)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            if (r0 <= 0) goto L_0x0027
            r2 = 1
        L_0x0027:
            java.lang.String r0 = "CleanExpireFileSystem"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r1 = "CleanExpireCurrentExpireTime"
            r3 = 0
            long r5 = r0.getLong(r1, r3)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0042
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0042
            if (r2 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r10 = r5
            goto L_0x0045
        L_0x0042:
            r0.encode((java.lang.String) r1, (long) r10)
        L_0x0045:
            r8.<init>(r9, r10)
            long r9 = r8.f348752f
            r8.f348722h = r9
            r8.f348723i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.CleanExpireFileSystem.<init>(com.tencent.mm.vfs.FileSystem, long, boolean):void");
    }
}
