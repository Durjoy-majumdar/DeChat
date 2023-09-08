package pc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import java.util.ArrayList;
import qe3.C101130q0;
import sf0.C48374j0;
import te3.C101865x33;
import te3.C50886px;
import te3.C51018qv3;
import te3.C51024qx;
import te3.C51163rv3;
import te3.C77949j3;

/* renamed from: pc0.h0 */
public class C100766h0 {

    /* renamed from: a */
    public static ArrayList<C77949j3> f295219a = new ArrayList<>();

    /* renamed from: b */
    public static ArrayList<C72996z1> f295220b = new ArrayList<>();

    /* renamed from: pc0.h0$a */
    public class C100767a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f295221d;

        /* renamed from: e */
        public final /* synthetic */ int f295222e;

        /* renamed from: pc0.h0$a$a */
        public class C100768a implements MTimerHandler.CallBack {

            /* renamed from: d */
            public int f295223d;

            public C100768a() {
                this.f295223d = C100767a.this.f295221d;
            }

            public boolean onTimerExpired() {
                int i = this.f295223d;
                if (i <= 0) {
                    return false;
                }
                this.f295223d = i - 1;
                C101130q0 q0Var = new C101130q0();
                q0Var.f296025a.f299846e = new C51024qx();
                int intRandom = Util.getIntRandom(C100767a.this.f295222e, 1);
                for (int i2 = 0; i2 < intRandom; i2++) {
                    ArrayList<C77949j3> arrayList = C100766h0.f295219a;
                    C77949j3 j3Var = arrayList.get(Util.getIntRandom(arrayList.size() - 1, 0));
                    C51163rv3 rv32 = new C51163rv3();
                    ArrayList<C72996z1> arrayList2 = C100766h0.f295220b;
                    rv32.f141175d = arrayList2.get(Util.getIntRandom(arrayList2.size() - 1, 0)).getUsername();
                    rv32.f141176e = true;
                    j3Var.f227628e = rv32;
                    j3Var.f227635o = (int) Util.nowSecond();
                    j3Var.f227638r = (long) Math.abs(((int) Util.nowMilliSecond()) % 10000000);
                    try {
                        C50886px pxVar = new C50886px();
                        C51018qv3 qv32 = new C51018qv3();
                        pxVar.f140038e = qv32;
                        qv32.mo73350k(j3Var.toByteArray());
                        pxVar.f140037d = 5;
                        q0Var.f296025a.f299846e.f140594e.add(pxVar);
                        q0Var.f296025a.f299846e.f140593d++;
                        Log.m105919d("MicroMsg.TestSyncAddMsg", "syncAddMsg  loop:%d cnt:[%d,%d] cmdList:%d id:%d u:%s", Integer.valueOf(this.f295223d), Integer.valueOf(i2), Integer.valueOf(intRandom), Integer.valueOf(q0Var.f296025a.f299846e.f140594e.size()), Long.valueOf(j3Var.f227638r), j3Var.f227628e.f141175d);
                    } catch (Exception e) {
                        Log.m105918d("MicroMsg.TestSyncAddMsg", e.getMessage());
                        Log.printErrStackTrace("MicroMsg.TestSyncAddMsg", e, "", new Object[0]);
                    }
                }
                C101865x33 x332 = q0Var.f296025a;
                x332.f299847f = 0;
                x332.f299848g = C48374j0.m53712a(C118000d0.f352701a.mo182756a());
                C101865x33 x333 = q0Var.f296025a;
                x333.f299845d = 0;
                x333.f299849h = 0;
                C77064b0.yn0().mo182765i(q0Var, 0, Util.nowSecond());
                return true;
            }
        }

        public C100767a(int i, int i2) {
            this.f295221d = i;
            this.f295222e = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0112  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                java.lang.String r0 = "MicroMsg.TestSyncAddMsg"
                eb0.c r1 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.u3 r1 = r1.mo105907v()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r3 = 0
                android.database.Cursor r1 = r1.mo69687b4(r3, r3, r2)
            L_0x0014:
                boolean r2 = r1.moveToNext()
                if (r2 == 0) goto L_0x0028
                com.tencent.mm.storage.z1 r2 = new com.tencent.mm.storage.z1
                r2.<init>()
                r2.convertFrom(r1)
                java.util.ArrayList<com.tencent.mm.storage.z1> r4 = pc0.C100766h0.f295220b
                r4.add(r2)
                goto L_0x0014
            L_0x0028:
                r1.close()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = a70.C112760b.m154195C()
                r1.append(r2)
                java.lang.String r2 = "/testaddmsg.txt"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 2
                r4 = 0
                r5 = 1
                java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d0 }
                java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d0 }
                java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106423E(r1)     // Catch:{ Exception -> 0x00d0 }
                r7.<init>(r1)     // Catch:{ Exception -> 0x00d0 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x00d0 }
                r1 = 0
            L_0x0052:
                java.lang.String r3 = r6.readLine()     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                if (r3 == 0) goto L_0x00c5
                int r1 = r1 + r5
                java.lang.String r7 = "###"
                java.lang.String[] r3 = r3.split(r7)     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                if (r3 == 0) goto L_0x00ab
                int r7 = r3.length     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8 = 3
                if (r7 == r8) goto L_0x0066
                goto L_0x00ab
            L_0x0066:
                te3.j3 r7 = new te3.j3     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r7.<init>()     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                te3.rv3 r8 = new te3.rv3     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8.<init>()     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                java.lang.String r9 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8.f141175d = r9     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8.f141176e = r5     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r7.f227629f = r8     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r7.f227632i = r2     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                te3.qv3 r8 = new te3.qv3     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8.<init>()     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                byte[] r9 = new byte[r4]     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8.mo73350k(r9)     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r7.f227634n = r8     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8 = r3[r4]     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r7.f227630g = r8     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8 = r3[r5]     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r7.f227633j = r8     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                te3.rv3 r8 = new te3.rv3     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8.<init>()     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r3 = r3[r2]     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8.f141175d = r3     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8.f141176e = r5     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r7.f227631h = r8     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                java.util.ArrayList<te3.j3> r3 = pc0.C100766h0.f295219a     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r3.add(r7)     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                goto L_0x0052
            L_0x00ab:
                java.lang.String r7 = "readMsgFromFile parse line %d failed : len:%d "
                java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8[r4] = r9     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                if (r3 != 0) goto L_0x00ba
                r3 = -1
                goto L_0x00bb
            L_0x00ba:
                int r3 = r3.length     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
            L_0x00bb:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                r8[r5] = r3     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r8)     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
                goto L_0x0052
            L_0x00c5:
                r6.close()     // Catch:{ Exception -> 0x00e9 }
                goto L_0x00e9
            L_0x00c9:
                r0 = move-exception
                goto L_0x0134
            L_0x00cb:
                r1 = move-exception
                r3 = r6
                goto L_0x00d1
            L_0x00ce:
                r0 = move-exception
                goto L_0x0133
            L_0x00d0:
                r1 = move-exception
            L_0x00d1:
                java.lang.String r6 = "readMsgFromFile failed e:%s"
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ce }
                java.lang.String r8 = r1.getMessage()     // Catch:{ all -> 0x00ce }
                r7[r4] = r8     // Catch:{ all -> 0x00ce }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r7)     // Catch:{ all -> 0x00ce }
                java.lang.String r6 = ""
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x00ce }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r6, r7)     // Catch:{ all -> 0x00ce }
                r3.close()     // Catch:{ Exception -> 0x00e9 }
            L_0x00e9:
                java.util.ArrayList<com.tencent.mm.storage.z1> r1 = pc0.C100766h0.f295220b
                int r1 = r1.size()
                if (r1 <= 0) goto L_0x0112
                java.util.ArrayList<te3.j3> r1 = pc0.C100766h0.f295219a
                int r1 = r1.size()
                if (r1 > 0) goto L_0x00fa
                goto L_0x0112
            L_0x00fa:
                com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler
                com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
                android.os.Looper r1 = r1.getLooper()
                pc0.h0$a$a r2 = new pc0.h0$a$a
                r2.<init>()
                r0.<init>((android.os.Looper) r1, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r2, (boolean) r5)
                r1 = 3000(0xbb8, double:1.482E-320)
                r0.startTimer(r1)
                return
            L_0x0112:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.util.ArrayList<te3.j3> r2 = pc0.C100766h0.f295219a
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r4] = r2
                java.util.ArrayList<com.tencent.mm.storage.z1> r2 = pc0.C100766h0.f295220b
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r5] = r2
                java.lang.String r2 = "syncAddMsg get source failed cmd:%d contact:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
                return
            L_0x0133:
                r6 = r3
            L_0x0134:
                r6.close()     // Catch:{ Exception -> 0x0137 }
            L_0x0137:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pc0.C100766h0.C100767a.run():void");
        }
    }

    /* renamed from: a */
    public static void m131941a(int i, int i2, String str) {
        C86709a0.m107525e().postToWorker(new C100767a(i, i2));
    }
}
