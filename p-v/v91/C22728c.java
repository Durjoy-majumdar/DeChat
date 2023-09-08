package v91;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import t91.C22461e;

/* renamed from: v91.c */
public final class C22728c {

    /* renamed from: a */
    public final C22734j f65369a;

    /* renamed from: b */
    public Field f65370b;

    /* renamed from: c */
    public Method f65371c;

    /* renamed from: d */
    public Field f65372d;

    /* renamed from: e */
    public final C22729a f65373e;

    /* renamed from: v91.c$a */
    public static final class C22729a implements C22461e {

        /* renamed from: a */
        public final /* synthetic */ C22728c f65374a;

        public C22729a(C22728c cVar) {
            this.f65374a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x02b2  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x02c4  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x02d9  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x02e9  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0225  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo35604a(java.lang.Object r31, int r32) {
            /*
                r30 = this;
                r1 = r30
                r0 = r31
                r2 = r32
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "onFeedClick: obj="
                r3.append(r4)
                r4 = 0
                if (r0 == 0) goto L_0x001c
                java.lang.Class r5 = r31.getClass()
                java.lang.String r5 = r5.getName()
                goto L_0x001d
            L_0x001c:
                r5 = r4
            L_0x001d:
                r3.append(r5)
                java.lang.String r5 = ", pos="
                r3.append(r5)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                java.lang.String r5 = "HABBYGE-MALI.FinderClickStatistics"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                long r6 = java.lang.System.currentTimeMillis()
                v91.a r3 = new v91.a
                r8 = r3
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r17 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 131071(0x1ffff, float:1.8367E-40)
                r29 = 0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                boolean r8 = r0 instanceof android.view.View
                java.lang.String r9 = "."
                java.lang.String r10 = ","
                r11 = 0
                r12 = 1
                if (r8 == 0) goto L_0x022f
                v91.c r8 = r1.f65374a
                v91.j r8 = r8.f65369a
                android.view.View r0 = (android.view.View) r0
                r8.getClass()
                java.lang.String r13 = "feedView"
                gy3.C87412m.m108594g(r0, r13)
                p91.b r13 = r8.f65417l
                if (r13 == 0) goto L_0x007d
                java.lang.String r0 = r13.mo87292e(r0, r2)
                goto L_0x007e
            L_0x007d:
                r0 = r4
            L_0x007e:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "getFeedWhenClick, getFeed="
                r13.append(r14)
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                java.lang.String r14 = "HABBYGE-MALI.WaterfallsFlowStatistics"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r13)
                if (r0 != 0) goto L_0x009b
                r13 = r4
            L_0x0097:
                r11 = r9
                r15 = r10
                goto L_0x0205
            L_0x009b:
                java.util.HashMap<java.lang.String, v91.i> r13 = r8.f65406a
                java.lang.Object r13 = r13.get(r0)
                v91.i r13 = (v91.C22733i) r13
                if (r13 != 0) goto L_0x0097
                java.lang.ref.WeakReference<androidx.recyclerview.widget.StaggeredGridLayoutManager> r13 = r8.f65420o
                if (r13 == 0) goto L_0x01fa
                java.lang.Object r13 = r13.get()
                androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r13
                if (r13 != 0) goto L_0x00b3
                goto L_0x01fa
            L_0x00b3:
                java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r14 = r8.f65421p
                if (r14 == 0) goto L_0x01fa
                java.lang.Object r14 = r14.get()
                androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14
                if (r14 != 0) goto L_0x00c1
                goto L_0x01fa
            L_0x00c1:
                int[] r15 = r13.mo17394A(r4)
                r4 = r15[r11]
                r15 = r15[r12]
                int r4 = java.lang.Math.min(r4, r15)
                r15 = 0
                int[] r17 = r13.mo17395B(r15)
                r15 = r17[r11]
                r11 = r17[r12]
                int r11 = java.lang.Math.max(r15, r11)
                int r15 = v91.C22734j.f65405t
                int r11 = r11 - r15
                r15 = 0
                int r11 = java.lang.Math.max(r11, r15)
                int r15 = v91.C22734j.f65405t
                int r4 = java.lang.Math.max(r4, r15)
                int r15 = v91.C22734j.f65405t
                int r4 = r4 - r15
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                int r11 = r11 + r12
            L_0x00f1:
                if (r4 >= r11) goto L_0x01e7
                int r17 = v91.C22734j.f65405t
                int r12 = r17 + r4
                android.view.View r12 = r13.findViewByPosition(r12)
                if (r12 != 0) goto L_0x0102
                r31 = r11
                r17 = r13
                goto L_0x011d
            L_0x0102:
                r31 = r11
                android.util.Pair r11 = e91.C116711b.m164576a(r12)
                r17 = r13
                java.lang.String r13 = "getCoordinateOnScreen(feedView)"
                gy3.C87412m.m108593f(r11, r13)
                java.lang.Object r13 = r11.first
                java.lang.Integer r13 = (java.lang.Integer) r13
                java.lang.Object r11 = r11.second
                java.lang.Integer r11 = (java.lang.Integer) r11
                v91.i r12 = r8.mo35833d(r12, r4, r14)
                if (r12 != 0) goto L_0x0120
            L_0x011d:
                r20 = r14
                goto L_0x0126
            L_0x0120:
                r20 = r14
                java.lang.String r14 = r12.f65399t
                if (r14 != 0) goto L_0x012c
            L_0x0126:
                r11 = r9
                r21 = r15
            L_0x0129:
                r15 = r10
                goto L_0x01d8
            L_0x012c:
                r15.add(r14)
                r21 = r15
                long r14 = r8.f65409d
                r22 = 0
                int r24 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
                if (r24 > 0) goto L_0x013b
                long r14 = r8.f65410e
            L_0x013b:
                r12.f65388i = r14
                java.lang.String r14 = "x"
                gy3.C87412m.m108593f(r13, r14)
                int r13 = r13.intValue()
                r12.f65391l = r13
                java.lang.String r13 = "y"
                gy3.C87412m.m108593f(r11, r13)
                int r11 = r11.intValue()
                r12.f65392m = r11
                r12.f65395p = r4
                r8.mo35832c(r12)
                r8.mo35831b(r12)
                r8.mo35830a(r12)
                int r11 = r12.f65392m
                float r11 = (float) r11
                float r13 = r12.f65393n
                float r13 = r13 + r11
                float r14 = r8.f65415j
                int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r11 >= 0) goto L_0x0174
                float r11 = r8.f65414i
                int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r11 <= 0) goto L_0x0174
                r11 = 1
                goto L_0x0175
            L_0x0174:
                r11 = 0
            L_0x0175:
                if (r11 != 0) goto L_0x0184
                java.util.HashMap<java.lang.String, v91.i> r11 = r8.f65406a
                java.lang.String r12 = r12.f65399t
                java.util.Map r11 = gy3.C24564k0.m30739c(r11)
                r11.remove(r12)
                r11 = r9
                goto L_0x0129
            L_0x0184:
                long r13 = r8.f65410e
                r12.f65381b = r13
                r12.f65382c = r6
                p91.b r11 = r8.f65417l
                if (r11 == 0) goto L_0x0195
                int r13 = r12.f65395p
                java.lang.String r11 = r11.mo87291d(r13)
                goto L_0x0196
            L_0x0195:
                r11 = 0
            L_0x0196:
                if (r11 != 0) goto L_0x019a
                r11 = 0
                goto L_0x019e
            L_0x019a:
                java.lang.String r11 = r11.replace(r10, r9)
            L_0x019e:
                r12.f65404y = r11
                long r13 = r12.f65382c
                r11 = r9
                r15 = r10
                long r9 = r12.f65381b
                long r13 = r13 - r9
                r12.f65389j = r13
                r9 = 1
                r12.f65390k = r9
                r8.f65411f = r9
                r12.f65383d = r9
                long r9 = r12.f65388i
                int r13 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
                if (r13 > 0) goto L_0x01c0
                long r9 = r8.f65409d
                int r13 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
                if (r13 > 0) goto L_0x01be
                long r9 = r8.f65410e
            L_0x01be:
                r12.f65388i = r9
            L_0x01c0:
                java.lang.String r9 = r8.f65407b
                if (r9 != 0) goto L_0x01cc
                aa1.d r9 = aa1.C91980d.vx0()
                java.lang.String r9 = r9.mo84751Wb()
            L_0x01cc:
                r12.f65380a = r9
                int r9 = r8.f65408c
                r12.f65387h = r9
                java.lang.String r9 = e91.C116711b.m164579d()
                r12.f65386g = r9
            L_0x01d8:
                int r4 = r4 + 1
                r9 = r11
                r10 = r15
                r13 = r17
                r14 = r20
                r15 = r21
                r12 = 1
                r11 = r31
                goto L_0x00f1
            L_0x01e7:
                r11 = r9
                r15 = r10
                t91.c$a r4 = t91.C64208c.f181951a
                java.util.List<java.lang.String> r4 = t91.C64208c.f181976z
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                r4.clear()
                java.util.List<java.lang.String> r4 = t91.C64208c.f181934A
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                r4.clear()
                goto L_0x01fc
            L_0x01fa:
                r11 = r9
                r15 = r10
            L_0x01fc:
                java.util.HashMap<java.lang.String, v91.i> r4 = r8.f65406a
                java.lang.Object r0 = r4.get(r0)
                r13 = r0
                v91.i r13 = (v91.C22733i) r13
            L_0x0205:
                v91.c r0 = r1.f65374a
                v91.j r0 = r0.f65369a
                r0.getClass()
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.util.HashMap<java.lang.String, v91.i> r8 = r0.f65406a
                r4.putAll(r8)
                r0.mo35834e(r4)
                if (r13 != 0) goto L_0x022b
                if (r2 < 0) goto L_0x022b
                v91.c r0 = r1.f65374a
                v91.i r0 = v91.C22728c.m26615a(r0, r2, r4)
                if (r0 != 0) goto L_0x022a
                java.lang.String r2 = "getFeed-0-1"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            L_0x022a:
                r13 = r0
            L_0x022b:
                r8 = r4
                r4 = 0
                goto L_0x02d7
            L_0x022f:
                r11 = r9
                r15 = r10
                v91.c r4 = r1.f65374a
                v91.j r4 = r4.f65369a
                r4.getClass()
                java.util.HashMap r8 = new java.util.HashMap
                r8.<init>()
                java.util.HashMap<java.lang.String, v91.i> r9 = r4.f65406a
                r8.putAll(r9)
                r4.mo35834e(r8)
                if (r0 != 0) goto L_0x0249
                r0 = 0
                goto L_0x0279
            L_0x0249:
                v91.c r4 = r1.f65374a     // Catch:{ Exception -> 0x0292 }
                java.lang.reflect.Field r4 = r4.f65370b     // Catch:{ Exception -> 0x0292 }
                if (r4 == 0) goto L_0x0289
                java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x0292 }
                v91.c r4 = r1.f65374a     // Catch:{ Exception -> 0x0292 }
                java.lang.reflect.Method r4 = r4.f65371c     // Catch:{ Exception -> 0x0292 }
                if (r4 == 0) goto L_0x0282
                r9 = 0
                java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0292 }
                java.lang.Object r0 = r4.invoke(r0, r10)     // Catch:{ Exception -> 0x0292 }
                v91.c r4 = r1.f65374a     // Catch:{ Exception -> 0x0292 }
                java.lang.reflect.Field r4 = r4.f65372d     // Catch:{ Exception -> 0x0292 }
                if (r4 == 0) goto L_0x027b
                java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x0292 }
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Long"
                gy3.C87412m.m108592e(r0, r4)     // Catch:{ Exception -> 0x0292 }
                java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0292 }
                long r9 = r0.longValue()     // Catch:{ Exception -> 0x0292 }
                java.lang.String r0 = e91.C116711b.m164593r(r9)     // Catch:{ Exception -> 0x0292 }
            L_0x0279:
                r4 = 0
                goto L_0x02b0
            L_0x027b:
                java.lang.String r0 = "id_Field"
                gy3.C87412m.m108603p(r0)     // Catch:{ Exception -> 0x0292 }
                r4 = 0
                throw r4     // Catch:{ Exception -> 0x0292 }
            L_0x0282:
                java.lang.String r0 = "getFinderObject_Method"
                gy3.C87412m.m108603p(r0)     // Catch:{ Exception -> 0x0292 }
                r4 = 0
                throw r4     // Catch:{ Exception -> 0x0292 }
            L_0x0289:
                java.lang.String r0 = "feedObject_Field"
                gy3.C87412m.m108603p(r0)     // Catch:{ Exception -> 0x0292 }
                r4 = 0
                throw r4     // Catch:{ Exception -> 0x0290 }
            L_0x0290:
                r0 = move-exception
                goto L_0x0294
            L_0x0292:
                r0 = move-exception
                r4 = 0
            L_0x0294:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "getFeedIdWithBaseFinderFeedType crash: "
                r9.append(r10)
                java.lang.String r10 = r0.getMessage()
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r10 = 0
                java.lang.Object[] r12 = new java.lang.Object[r10]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r9, r12)
                r0 = r4
            L_0x02b0:
                if (r0 != 0) goto L_0x02c4
                if (r2 < 0) goto L_0x02c2
                v91.c r0 = r1.f65374a
                v91.i r0 = v91.C22728c.m26615a(r0, r2, r8)
                if (r0 != 0) goto L_0x02d6
                java.lang.String r2 = "getFeed-1-1"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
                goto L_0x02d6
            L_0x02c2:
                r13 = r4
                goto L_0x02d7
            L_0x02c4:
                v91.c r2 = r1.f65374a
                r2.getClass()
                java.lang.Object r0 = r8.get(r0)
                v91.i r0 = (v91.C22733i) r0
                if (r0 != 0) goto L_0x02d6
                java.lang.String r2 = "getFeed-1-2"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            L_0x02d6:
                r13 = r0
            L_0x02d7:
                if (r13 != 0) goto L_0x02e9
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r2 = "onFeedClick, wtf, feed is null !!!"
                r0.<init>(r2)
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r3, r2)
                return
            L_0x02e9:
                float r0 = r13.f65394o
                r3.f65353b = r0
                float r0 = r13.f65393n
                r3.f65352a = r0
                java.lang.String r0 = r13.f65380a
                r3.f65354c = r0
                java.lang.String r0 = r13.f65399t
                r3.f65355d = r0
                java.lang.String r0 = r13.f65401v
                r3.f65356e = r0
                int r0 = r13.f65387h
                r3.f65357f = r0
                long r9 = r13.f65388i
                r3.f65358g = r9
                r3.f65359h = r6
                float r0 = r13.f65384e
                r3.f65360i = r0
                float r0 = r13.f65385f
                r3.f65361j = r0
                int r0 = r13.f65397r
                r3.f65362k = r0
                int r0 = r13.f65398s
                r3.f65363l = r0
                java.lang.String r0 = r13.f65386g
                r3.f65365n = r0
                java.lang.String r0 = r13.f65404y
                r3.f65366o = r0
                int r0 = r13.f65396q
                r3.f65367p = r0
                int r0 = r13.f65395p
                r3.f65368q = r0
                v91.c r0 = r1.f65374a
                r0.getClass()
                org.json.JSONArray r0 = new org.json.JSONArray
                r0.<init>()
                java.util.Set r2 = r8.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x0339:
                boolean r5 = r2.hasNext()
                java.lang.String r6 = "ItemExposureAreaWeigth"
                java.lang.String r7 = "ScreenExposureAreaWeigth"
                java.lang.String r8 = "format(format, *args)"
                java.lang.String r9 = "%.2f"
                r10 = 0
                r12 = 1120403456(0x42c80000, float:100.0)
                if (r5 == 0) goto L_0x03f9
                java.lang.Object r5 = r2.next()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                org.json.JSONObject r13 = new org.json.JSONObject
                r13.<init>()
                java.lang.Object r14 = r5.getValue()
                v91.i r14 = (v91.C22733i) r14
                int r14 = r14.f65397r
                java.lang.String r4 = "ItemDirection"
                r13.put(r4, r14)
                java.lang.Object r4 = r5.getValue()
                v91.i r4 = (v91.C22733i) r4
                java.lang.String r4 = r4.f65399t
                java.lang.String r14 = "FeedId"
                r13.put(r14, r4)
                java.lang.Object r4 = r5.getValue()
                v91.i r4 = (v91.C22733i) r4
                float r4 = r4.f65385f
                int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r4 > 0) goto L_0x0393
                java.lang.Object r4 = r5.getValue()
                v91.i r4 = (v91.C22733i) r4
                float r4 = r4.f65394o
                java.lang.Object r14 = r5.getValue()
                v91.i r14 = (v91.C22733i) r14
                float r14 = r14.f65393n
                float r4 = r4 * r14
                float r4 = r4 * r12
                float r14 = t91.C64208c.f181974x
                float r4 = r4 / r14
                goto L_0x039b
            L_0x0393:
                java.lang.Object r4 = r5.getValue()
                v91.i r4 = (v91.C22733i) r4
                float r4 = r4.f65385f
            L_0x039b:
                r14 = 1
                java.lang.Object[] r10 = new java.lang.Object[r14]
                float r4 = r4 / r12
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r17 = 0
                r10[r17] = r4
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r10, r14)
                java.lang.String r4 = java.lang.String.format(r9, r4)
                gy3.C87412m.m108593f(r4, r8)
                r13.put(r7, r4)
                java.lang.Object r4 = r5.getValue()
                v91.i r4 = (v91.C22733i) r4
                float r4 = r4.f65384e
                r7 = 0
                int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r4 > 0) goto L_0x03c5
                r4 = 1120403456(0x42c80000, float:100.0)
                goto L_0x03cd
            L_0x03c5:
                java.lang.Object r4 = r5.getValue()
                v91.i r4 = (v91.C22733i) r4
                float r4 = r4.f65384e
            L_0x03cd:
                r7 = 1
                java.lang.Object[] r10 = new java.lang.Object[r7]
                float r4 = r4 / r12
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r12 = 0
                r10[r12] = r4
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r10, r7)
                java.lang.String r4 = java.lang.String.format(r9, r4)
                gy3.C87412m.m108593f(r4, r8)
                r13.put(r6, r4)
                java.lang.Object r4 = r5.getValue()
                v91.i r4 = (v91.C22733i) r4
                int r4 = r4.f65398s
                java.lang.String r5 = "ItemIndex"
                r13.put(r5, r4)
                r0.put(r13)
                r4 = 0
                goto L_0x0339
            L_0x03f9:
                java.lang.String r0 = r0.toString()
                r3.f65364m = r0
                u91.a$a r0 = u91.C22618a.f65058a
                r0.getClass()
                com.tencent.mm.autogen.mmdata.rpt.WaterFallFlowClickRptStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WaterFallFlowClickRptStruct
                r0.<init>()
                java.lang.String r2 = r3.f65354c
                java.lang.String r4 = "SessionId"
                r5 = 1
                java.lang.String r2 = r0.mo86045b(r4, r2, r5)
                r0.f48647d = r2
                java.lang.String r2 = r3.f65355d
                java.lang.String r4 = "ClickFeedId"
                java.lang.String r2 = r0.mo86045b(r4, r2, r5)
                r0.f48648e = r2
                int r2 = r3.f65357f
                r0.f48649f = r2
                long r4 = r3.f65358g
                r0.f48650g = r4
                java.lang.String r2 = "UpdataTimeMs"
                r0.mo86046c(r2, r4)
                long r4 = r3.f65359h
                r0.f48651h = r4
                java.lang.String r2 = "ClickTimeMs"
                r0.mo86046c(r2, r4)
                float r2 = r3.f65360i
                r4 = 0
                int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r5 > 0) goto L_0x043d
                r2 = 1120403456(0x42c80000, float:100.0)
            L_0x043d:
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                float r2 = r2 / r12
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r10 = 0
                r5[r10] = r2
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r4)
                java.lang.String r2 = java.lang.String.format(r9, r2)
                gy3.C87412m.m108593f(r2, r8)
                java.lang.String r2 = r0.mo86045b(r6, r2, r4)
                r0.f48652i = r2
                float r2 = r3.f65361j
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 > 0) goto L_0x046b
                float r2 = r3.f65353b
                float r4 = r3.f65352a
                float r2 = r2 * r4
                float r2 = r2 * r12
                float r4 = t91.C64208c.f181974x
                float r2 = r2 / r4
            L_0x046b:
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                float r2 = r2 / r12
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r6 = 0
                r5[r6] = r2
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r4)
                java.lang.String r2 = java.lang.String.format(r9, r2)
                gy3.C87412m.m108593f(r2, r8)
                java.lang.String r2 = r0.mo86045b(r7, r2, r4)
                r0.f48653j = r2
                int r2 = r3.f65362k
                r0.f48654k = r2
                int r2 = r3.f65363l
                r0.f48655l = r2
                java.lang.String r2 = r3.f65364m
                if (r2 != 0) goto L_0x0495
                r4 = 0
                goto L_0x049a
            L_0x0495:
                r4 = r15
                java.lang.String r4 = r2.replace(r4, r11)
            L_0x049a:
                java.lang.String r2 = "ShotScreenJson"
                r5 = 1
                java.lang.String r2 = r0.mo86045b(r2, r4, r5)
                r0.f48656m = r2
                java.lang.String r2 = r3.f65365n
                java.lang.String r4 = "ContextId"
                java.lang.String r2 = r0.mo86045b(r4, r2, r5)
                r0.f48657n = r2
                java.lang.String r2 = r3.f65366o
                java.lang.String r4 = "ItemBufffer"
                java.lang.String r2 = r0.mo86045b(r4, r2, r5)
                r0.f48658o = r2
                int r2 = r3.f65367p
                r0.f48659p = r2
                zt3.t r2 = zt3.C119157j.f356862d
                u91.b r4 = new u91.b
                r4.<init>(r0, r3)
                zt3.j r2 = (zt3.C119157j) r2
                r2.mo183884o(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v91.C22728c.C22729a.mo35604a(java.lang.Object, int):void");
        }
    }

    public C22728c(C22734j jVar) {
        C87412m.m108594g(jVar, "flowStatistics");
        this.f65369a = jVar;
        try {
            Field declaredField = BaseFinderFeed.class.getDeclaredField("feedObject");
            C87412m.m108593f(declaredField, "BaseFinderFeed_Class.get…redField(feedObject_Name)");
            this.f65370b = declaredField;
            declaredField.setAccessible(true);
            Method declaredMethod = Class.forName("com.tencent.mm.plugin.finder.storage.FinderItem").getDeclaredMethod("getFinderObject", new Class[0]);
            C87412m.m108593f(declaredMethod, "FinderItem_Class.getDecl…hod(getFinderObject_Name)");
            this.f65371c = declaredMethod;
            declaredMethod.setAccessible(true);
            Field declaredField2 = FinderObject.class.getDeclaredField("id");
            C87412m.m108593f(declaredField2, "FinderObject_Class.getDeclaredField(id_Name)");
            this.f65372d = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.FinderClickStatistics", e, "init crash: " + e.getMessage(), new Object[0]);
        }
        this.f65373e = new C22729a(this);
    }

    /* renamed from: a */
    public static final C22733i m26615a(C22728c cVar, int i, Map map) {
        cVar.getClass();
        if (i < 0) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((C22733i) entry.getValue()).f65395p == i) {
                return (C22733i) entry.getValue();
            }
        }
        return null;
    }
}
