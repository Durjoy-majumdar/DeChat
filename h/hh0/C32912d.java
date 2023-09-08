package hh0;

/* renamed from: hh0.d */
public class C32912d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f89475d;

    /* renamed from: e */
    public final /* synthetic */ long f89476e;

    /* renamed from: f */
    public final /* synthetic */ long f89477f;

    /* renamed from: g */
    public final /* synthetic */ C32913e f89478g;

    public C32912d(C32913e eVar, boolean z, long j, long j2) {
        this.f89478g = eVar;
        this.f89475d = z;
        this.f89476e = j;
        this.f89477f = j2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(1:2)(1:3)|4|(1:6)(1:7)|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(1:20)|31|21|22|23|(1:25)|32|26|28|(2:30|33)(1:34)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0111 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x011b A[Catch:{ Exception -> 0x0152 }, LOOP:1: B:24:0x0119->B:25:0x011b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r20 = this;
            r0 = r20
            hh0.e r1 = r0.f89478g
            boolean r2 = r0.f89475d
            long r3 = r0.f89476e
            long r5 = r0.f89477f
            r1.getClass()
            java.lang.String r7 = ""
            java.lang.String r8 = ";"
            java.lang.String r9 = ","
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.autogen.mmdata.rpt.AiFinderRedDotStruct r12 = new com.tencent.mm.autogen.mmdata.rpt.AiFinderRedDotStruct
            r12.<init>()
            if (r2 == 0) goto L_0x0021
            r13 = 1
            goto L_0x0023
        L_0x0021:
            r13 = 0
        L_0x0023:
            r12.f79086d = r13
            hh0.b r13 = r1.f89482b
            com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct r13 = r13.f89471a
            boolean r14 = r13.f79079d
            r12.f79087e = r14
            long r13 = r13.f79080e
            r12.f79088f = r13
            java.lang.String r15 = "LastEnterFinderTimeStampMs"
            r12.mo86048e(r15, r13)
            hh0.b r13 = r1.f89482b
            com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct r13 = r13.f89471a
            long r14 = r13.f79081f
            r12.f79089g = r14
            java.lang.String r13 = r13.f79082g
            java.lang.String r14 = "LastFinderRedDotTipsId"
            r15 = 1
            java.lang.String r13 = r12.mo86045b(r14, r13, r15)
            r12.f79090h = r13
            hh0.b r13 = r1.f89482b
            com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct r13 = r13.f89471a
            r16 = r10
            long r10 = r13.f79083h
            int r11 = (int) r10
            r12.f79091i = r11
            long r10 = r13.f79084i
            int r11 = (int) r10
            r12.f79092j = r11
            hh0.a r10 = r1.f89481a
            java.lang.String r10 = r10.f89461a
            java.lang.String r11 = "LastSessionId"
            java.lang.String r10 = r12.mo86045b(r11, r10, r15)
            r12.f79093k = r10
            hh0.a r10 = r1.f89481a
            long r13 = r10.f89462b
            r18 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r18
            r12.f79104v = r13
            boolean r11 = r10.f89463c
            if (r11 == 0) goto L_0x0076
            r13 = 1
            goto L_0x0078
        L_0x0076:
            r13 = 0
        L_0x0078:
            r12.f79094l = r13
            int r11 = r10.f89464d
            long r13 = (long) r11
            r12.f79095m = r13
            java.lang.String r10 = r10.f89465e
            java.lang.String r11 = "FinderRedDotTipsId"
            java.lang.String r10 = r12.mo86045b(r11, r10, r15)
            r12.f79096n = r10
            hh0.a r1 = r1.f89481a
            int r10 = r1.f89466f
            r12.f79097o = r10
            int r10 = r1.f89467g
            r12.f79098p = r10
            boolean r10 = r1.f89468h
            if (r10 == 0) goto L_0x009a
            r10 = 1
            goto L_0x009c
        L_0x009a:
            r10 = 0
        L_0x009c:
            r12.f79099q = r10
            int r10 = r1.f89469i
            long r10 = (long) r10
            r12.f79100r = r10
            boolean r1 = r1.f89470j
            if (r1 == 0) goto L_0x00aa
            r13 = 1
            goto L_0x00ac
        L_0x00aa:
            r13 = 0
        L_0x00ac:
            r12.f79101s = r13
            r12.f79102t = r3
            java.lang.String r1 = "EnterFinderTimeStampMs"
            r12.mo86048e(r1, r3)
            r12.f79103u = r5
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            int r1 = jh0.C33573a.m40128d(r3)
            lh0.g r3 = lh0.C34262g.vx0()
            r3.requireAccountInitialized()
            lh0.m r3 = r3.f92368f
            r4 = 7
            long r3 = r3.mo59535kD(r4, r1)
            long r3 = r3 / r18
            r12.f79106x = r3
            r1 = 3
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0111 }
            r4.<init>()     // Catch:{ Exception -> 0x0111 }
            int[] r5 = hh0.C32913e.f89479g     // Catch:{ Exception -> 0x0111 }
            r6 = 0
        L_0x00db:
            if (r6 >= r1) goto L_0x0101
            r10 = r5[r6]     // Catch:{ Exception -> 0x0111 }
            lh0.g r11 = lh0.C34262g.vx0()     // Catch:{ Exception -> 0x0111 }
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x0111 }
            lh0.k r11 = r11.f92367e     // Catch:{ Exception -> 0x0111 }
            int r11 = r11.mo59529Ow(r10)     // Catch:{ Exception -> 0x0111 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0111 }
            r13.<init>()     // Catch:{ Exception -> 0x0111 }
            r13.append(r7)     // Catch:{ Exception -> 0x0111 }
            r13.append(r10)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r10 = r13.toString()     // Catch:{ Exception -> 0x0111 }
            r4.put(r10, r11)     // Catch:{ Exception -> 0x0111 }
            int r6 = r6 + 1
            goto L_0x00db
        L_0x0101:
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r4 = r4.replace(r9, r8)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r5 = "FindFriendUIExposure"
            java.lang.String r4 = r12.mo86045b(r5, r4, r15)     // Catch:{ Exception -> 0x0111 }
            r12.f79105w = r4     // Catch:{ Exception -> 0x0111 }
        L_0x0111:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0152 }
            r4.<init>()     // Catch:{ Exception -> 0x0152 }
            int[] r5 = hh0.C32913e.f89479g     // Catch:{ Exception -> 0x0152 }
            r6 = 0
        L_0x0119:
            if (r6 >= r1) goto L_0x0141
            r10 = r5[r6]     // Catch:{ Exception -> 0x0152 }
            lh0.g r11 = lh0.C34262g.vx0()     // Catch:{ Exception -> 0x0152 }
            r11.requireAccountInitialized()     // Catch:{ Exception -> 0x0152 }
            lh0.m r11 = r11.f92368f     // Catch:{ Exception -> 0x0152 }
            long r13 = r11.mo59534bD(r10)     // Catch:{ Exception -> 0x0152 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0152 }
            r11.<init>()     // Catch:{ Exception -> 0x0152 }
            r11.append(r7)     // Catch:{ Exception -> 0x0152 }
            r11.append(r10)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x0152 }
            long r13 = r13 / r18
            r4.put(r10, r13)     // Catch:{ Exception -> 0x0152 }
            int r6 = r6 + 1
            goto L_0x0119
        L_0x0141:
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = r1.replace(r9, r8)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r4 = "WechatDurationNMinute"
            java.lang.String r1 = r12.mo86045b(r4, r1, r15)     // Catch:{ Exception -> 0x0152 }
            r12.f79107y = r1     // Catch:{ Exception -> 0x0152 }
            goto L_0x0153
        L_0x0152:
        L_0x0153:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getFormatedNetType(r1)
            java.lang.String r4 = "NetType"
            java.lang.String r1 = r12.mo86045b(r4, r1, r15)
            r12.f79108z = r1
            lh0.g r1 = lh0.C34262g.vx0()
            r1.requireAccountInitialized()
            lh0.m r1 = r1.f92368f
            r1.getClass()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.text.SimpleDateFormat r6 = jh0.C33573a.m40125a()
            java.util.Date r7 = new java.util.Date
            r7.<init>(r4)
            java.lang.String r4 = r6.format(r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "SELECT COUNT(*) FROM WechatAppHistory WHERE  ( appDs == "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " ) "
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            long r4 = r1.mo59533Yt(r4)
            int r1 = (int) r4
            r12.f79085A = r1
            r12.mo86054n()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r16)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r3] = r4
            java.lang.String r4 = r12.mo1006q()
            r1[r15] = r4
            java.lang.String r4 = "MicroMsg.AiFinderData"
            java.lang.String r5 = "ai report cost[%d] [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r1)
            if (r2 != 0) goto L_0x01d5
            java.lang.String r1 = r12.mo1005p()
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r3] = r1
            java.lang.String r3 = "notify to run ai [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
            com.tencent.mm.autogen.events.RunAiEvent r2 = new com.tencent.mm.autogen.events.RunAiEvent
            r2.<init>()
            com.tencent.mm.autogen.events.RunAiEvent$a r3 = r2.f78961d
            r3.f78962a = r1
            r2.publish()
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hh0.C32912d.run():void");
    }
}
