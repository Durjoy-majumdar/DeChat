package k11;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.FrequentLimiter;
import wy0.C102506a;
import yy0.C102971b;

public class s$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C99085s f290475d;

    public s$$h(C99085s sVar, s$$d s__d) {
        this.f290475d = sVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0119  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138435a(java.util.List<yy0.C102970a> r11) {
        /*
            r10 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0010:
            boolean r3 = r11.hasNext()
            r4 = 2
            if (r3 == 0) goto L_0x0199
            java.lang.Object r3 = r11.next()
            yy0.a r3 = (yy0.C102970a) r3
            long r5 = r3.field_msgId
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r1.get(r5)
            j11.d r5 = (j11.C98895d) r5
            if (r5 != 0) goto L_0x003c
            j11.d r5 = new j11.d
            r5.<init>()
            long r6 = r3.field_msgId
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r1.put(r6, r5)
            r2.add(r5)
        L_0x003c:
            int r6 = r3.field_msgType
            r7 = 98
            if (r6 == r7) goto L_0x0047
            r7 = 1124073521(0x43000031, float:128.00075)
            if (r6 != r7) goto L_0x0063
        L_0x0047:
            java.lang.String r6 = r5.f289902i
            if (r6 != 0) goto L_0x0063
            k40.a r6 = f40.C86709a0.m107533q(r0)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            long r7 = r5.f289899f
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.b00(r7)
            java.lang.String r6 = r6.getContent()
            r5.f289902i = r6
        L_0x0063:
            java.util.List<yy0.a> r6 = r5.f289905l
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r3)
            long r6 = r3.field_msgtime
            r5.f289900g = r6
            java.lang.String r6 = r3.field_username
            r5.f289898e = r6
            long r6 = r3.field_msgId
            r5.f289899f = r6
            long r6 = r5.f289894a
            long r8 = r3.field_diskSpace
            long r6 = r6 + r8
            r5.f289894a = r6
            int r6 = r3.field_msgType
            r5.f289901h = r6
            int r6 = r3.field_msgSubType
            r7 = 3
            r8 = 1
            if (r6 == r8) goto L_0x0157
            if (r6 == r4) goto L_0x0157
            if (r6 == r7) goto L_0x0157
            r9 = 4
            if (r6 == r9) goto L_0x0157
            r7 = 10
            if (r6 == r7) goto L_0x0153
            r4 = 20
            if (r6 == r4) goto L_0x0149
            r4 = 21
            if (r6 == r4) goto L_0x013f
            r4 = 0
            switch(r6) {
                case 30: goto L_0x0149;
                case 31: goto L_0x013f;
                case 32: goto L_0x00ff;
                case 33: goto L_0x00ff;
                case 34: goto L_0x00ff;
                case 35: goto L_0x00ff;
                default: goto L_0x009e;
            }
        L_0x009e:
            switch(r6) {
                case 38: goto L_0x00ff;
                case 39: goto L_0x00a3;
                case 40: goto L_0x00a3;
                case 41: goto L_0x00a3;
                case 42: goto L_0x00a3;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            goto L_0x0010
        L_0x00a3:
            r7 = 41
            if (r6 == r7) goto L_0x00b0
            r7 = 42
            if (r6 != r7) goto L_0x00ac
            goto L_0x00b0
        L_0x00ac:
            r6 = 5
            r5.f289895b = r6
            goto L_0x00b3
        L_0x00b0:
            r6 = 6
            r5.f289895b = r6
        L_0x00b3:
            java.lang.String r6 = r5.f289902i
            if (r6 == 0) goto L_0x00bb
            java.lang.String r6 = r5.f289903j
            if (r6 != 0) goto L_0x00e9
        L_0x00bb:
            k40.a r6 = f40.C86709a0.m107533q(r0)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            long r7 = r5.f289899f
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.b00(r7)
            java.lang.String r6 = r6.getContent()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r6)
            if (r6 != 0) goto L_0x00d9
            goto L_0x0010
        L_0x00d9:
            com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r4)
            if (r4 != 0) goto L_0x00e1
            goto L_0x0010
        L_0x00e1:
            java.lang.String r6 = r4.f195574g
            r5.f289902i = r6
            java.lang.String r4 = r4.f195571f0
            r5.f289903j = r4
        L_0x00e9:
            java.lang.String r4 = r5.f289897d
            if (r4 != 0) goto L_0x0010
            java.lang.String r4 = r3.field_path
            java.lang.String r6 = ".mp4"
            boolean r4 = r4.endsWith(r6)
            if (r4 != 0) goto L_0x0010
            java.lang.String r3 = r3.mo142683l2()
            r5.f289897d = r3
            goto L_0x0010
        L_0x00ff:
            r7 = 32
            if (r6 == r7) goto L_0x010f
            r7 = 34
            if (r6 != r7) goto L_0x0108
            goto L_0x010f
        L_0x0108:
            java.lang.String r3 = r3.mo142683l2()
            r5.f289896c = r3
            goto L_0x0115
        L_0x010f:
            java.lang.String r3 = r3.mo142683l2()
            r5.f289897d = r3
        L_0x0115:
            java.lang.String r3 = r5.f289902i
            if (r3 != 0) goto L_0x013b
            k40.a r3 = f40.C86709a0.m107533q(r0)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            long r6 = r5.f289899f
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4 r3 = r3.b00(r6)
            java.lang.String r3 = r3.getContent()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r3)
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r4)
            java.lang.String r3 = r3.f195570f
            r5.f289902i = r3
        L_0x013b:
            r5.f289895b = r9
            goto L_0x0010
        L_0x013f:
            java.lang.String r3 = r3.mo142683l2()
            r5.f289896c = r3
            r5.f289895b = r8
            goto L_0x0010
        L_0x0149:
            java.lang.String r3 = r3.mo142683l2()
            r5.f289897d = r3
            r5.f289895b = r8
            goto L_0x0010
        L_0x0153:
            r5.f289895b = r4
            goto L_0x0010
        L_0x0157:
            r5.f289895b = r7
            if (r6 != r4) goto L_0x0162
            java.lang.String r3 = r3.mo142683l2()
            r5.f289896c = r3
            goto L_0x0168
        L_0x0162:
            java.lang.String r3 = r3.mo142683l2()
            r5.f289897d = r3
        L_0x0168:
            int r3 = r5.f289904k
            r4 = -1
            if (r3 != r4) goto L_0x0010
            long r3 = r5.f289899f
            k40.a r6 = f40.C86709a0.m107533q(r0)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r3 = r6.b00(r3)
            java.lang.Class<rz.u> r4 = p682rz.C101491u.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            rz.u r4 = (p682rz.C101491u) r4
            java.lang.String r3 = r3.mo108765s2()
            hd0.n0 r3 = r4.mo140806Zd(r3)
            if (r3 != 0) goto L_0x0193
            r3 = -2
            goto L_0x0195
        L_0x0193:
            int r3 = r3.f288566m
        L_0x0195:
            r5.f289904k = r3
            goto L_0x0010
        L_0x0199:
            java.util.Iterator r11 = r2.iterator()
        L_0x019d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r0 = r11.next()
            j11.d r0 = (j11.C98895d) r0
            long r5 = r0.f289894a
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x01b5
            int r0 = r0.f289895b
            if (r0 != r4) goto L_0x019d
        L_0x01b5:
            r11.remove()
            goto L_0x019d
        L_0x01b9:
            k11.s r11 = r10.f290475d
            java.util.ArrayList<j11.d> r11 = r11.f290456f
            r11.addAll(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k11.s$$h.mo138435a(java.util.List):void");
    }

    public void run() {
        long j;
        Cursor rawQuery;
        Throwable th;
        C102971b e = C102506a.f301832a.mo142120e();
        String str = this.f290475d.f290457g;
        e.getClass();
        long currentTicks = Util.currentTicks();
        long[] jArr = new long[2];
        try {
            rawQuery = e.f303871d.rawQuery("SELECT min(msgtime), max(msgtime) FROM WxFileIndex3 WHERE username = ?", new String[]{str});
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    jArr[0] = rawQuery.getLong(0);
                    jArr[1] = rawQuery.getLong(1);
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.WxFileIndexStorage", e2, " sql [%s]", "SELECT min(msgtime), max(msgtime) FROM WxFileIndex3 WHERE username = ?");
        } catch (Throwable th4) {
            th.addSuppressed(th4);
        }
        Log.m105925i("MicroMsg.WxFileIndexStorage", "getMediaMsgTimeByUsername [%s] cost[%d]", str, Long.valueOf(Util.ticksToNow(currentTicks)));
        jArr[0] = Math.max(jArr[0], this.f290475d.f290459i) - 1;
        long min = Math.min(jArr[1], this.f290475d.f290460j);
        jArr[1] = min;
        long max = Math.max(min - FrequentLimiter.WEEK_MILLS, jArr[0]);
        try {
            if (!this.f290475d.f290462o) {
                if (max == min) {
                    max--;
                }
                C102971b e3 = C102506a.f301832a.mo142120e();
                C99085s sVar = this.f290475d;
                mo138435a(e3.mo142701mI(sVar.f290457g, min, j, sVar.f290458h, true));
                C99085s sVar2 = this.f290475d;
                if (!sVar2.f290462o) {
                    MMHandlerThread.postToMainThread(new s$$a(sVar2));
                }
                while (true) {
                    long j2 = j;
                    if (!this.f290475d.f290462o) {
                        long j3 = jArr[0];
                        if (j2 > j3) {
                            j = Math.max(j2 - 15552000000L, j3);
                            if (j == j2) {
                                j--;
                            }
                            C102971b e4 = C102506a.f301832a.mo142120e();
                            C99085s sVar3 = this.f290475d;
                            mo138435a(e4.mo142701mI(sVar3.f290457g, j2, j, sVar3.f290458h, true));
                            C99085s sVar4 = this.f290475d;
                            if (!sVar4.f290462o) {
                                MMHandlerThread.postToMainThread(new s$$a(sVar4));
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        } catch (Exception e5) {
            Log.printErrStackTrace("MicroMsg.CleanChattingDetailAdapter", e5, "", new Object[0]);
            return;
        }
        throw th;
    }
}
