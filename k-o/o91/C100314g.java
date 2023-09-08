package o91;

import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import q91.C101077d;
import q91.C101078e;

/* renamed from: o91.g */
public final class C100314g implements C101078e {

    /* renamed from: a */
    public final C101077d f293877a;

    /* renamed from: b */
    public final String f293878b;

    /* renamed from: c */
    public int f293879c;

    /* renamed from: d */
    public int f293880d;

    /* renamed from: e */
    public int f293881e = -1;

    /* renamed from: f */
    public long f293882f = -1;

    /* renamed from: g */
    public String f293883g = "";

    /* renamed from: h */
    public Class<?> f293884h;

    /* renamed from: i */
    public Field f293885i;

    /* renamed from: j */
    public Field f293886j;

    /* renamed from: k */
    public Method f293887k;

    /* renamed from: l */
    public Field f293888l;

    /* renamed from: m */
    public int f293889m = -1;

    /* renamed from: n */
    public int f293890n = 0;

    public C100314g(C101077d dVar, String str) {
        this.f293877a = dVar;
        this.f293878b = str;
        try {
            this.f293879c = ViewConfiguration.get(MMApplicationContext.getContext()).getScaledTouchSlop();
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellSpeedChecker", e, "init crash: %s", e.getMessage());
        }
        String str2 = this.f293878b;
        if (C87412m.m108589b(str2, "SnsTimelineUI")) {
            Class<TimeLineObject> cls = TimeLineObject.class;
            Class<BaseTimeLineItem.BaseViewHolder> cls2 = BaseTimeLineItem.BaseViewHolder.class;
            try {
                this.f293884h = cls2;
                Field declaredField = cls2.getDeclaredField("timeLineObject");
                this.f293885i = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                Field declaredField2 = cls.getDeclaredField("Id");
                this.f293886j = declaredField2;
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSpeedChecker", e2, "initSns crash-1: %s", e2.getMessage());
            }
            Class<SnsInfo> cls3 = SnsInfo.class;
            try {
                String str3 = SnsInfo.TABLEINDEXUSERNAME;
                Method declaredMethod = cls3.getDeclaredMethod("getTimeLine", new Class[0]);
                this.f293887k = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
                Field declaredField3 = cls.getDeclaredField("Id");
                this.f293888l = declaredField3;
                if (declaredField3 != null) {
                    declaredField3.setAccessible(true);
                }
            } catch (Exception e3) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSpeedChecker", e3, "initSns crash-2: %s", e3.getMessage());
            }
        } else {
            C87412m.m108589b(str2, "ChattingUIFragment");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0180, code lost:
        if (r12.f293880d != 0) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d9, code lost:
        if (r0 != null) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139597a(android.view.View r13, int r14, int r15) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0003
            return
        L_0x0003:
            r12.f293889m = r14
            r12.f293890n = r15
            int r0 = r12.f293880d
            r1 = 0
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0011
            goto L_0x0182
        L_0x0011:
            int r0 = r15 + -1
            r5 = 0
            r6 = r5
        L_0x0015:
            r7 = -1
            if (r7 >= r0) goto L_0x002c
            android.view.View r6 = o91.C100317j.m131143a(r13, r0)
            if (r6 != 0) goto L_0x0026
            int r6 = o91.C100317j.m131146d(r13)
            android.view.View r6 = o91.C100317j.m131143a(r13, r6)
        L_0x0026:
            if (r6 == 0) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            int r0 = r0 + -1
            goto L_0x0015
        L_0x002c:
            if (r6 != 0) goto L_0x0030
            goto L_0x0183
        L_0x0030:
            java.lang.String r0 = r12.f293878b
            java.lang.String r8 = "SnsTimelineUI"
            boolean r8 = gy3.C87412m.m108589b(r0, r8)
            if (r8 == 0) goto L_0x00dd
            java.lang.Class<?> r0 = r12.f293884h
            if (r0 != 0) goto L_0x003f
            goto L_0x008b
        L_0x003f:
            java.lang.Object r0 = r6.getTag()
            if (r0 != 0) goto L_0x0046
            goto L_0x008b
        L_0x0046:
            java.lang.Class<?> r0 = r12.f293884h     // Catch:{ Exception -> 0x008a }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x008a }
            java.lang.Object r8 = r6.getTag()     // Catch:{ Exception -> 0x008a }
            boolean r0 = r0.isInstance(r8)     // Catch:{ Exception -> 0x008a }
            if (r0 != 0) goto L_0x0056
            goto L_0x008b
        L_0x0056:
            java.lang.reflect.Field r0 = r12.f293885i     // Catch:{ Exception -> 0x008a }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r8 = r6.getTag()     // Catch:{ Exception -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x008a }
            if (r0 != 0) goto L_0x0065
            goto L_0x008b
        L_0x0065:
            java.lang.reflect.Field r8 = r12.f293886j     // Catch:{ Exception -> 0x0079 }
            if (r8 == 0) goto L_0x006e
            java.lang.Object r0 = r8.get(r0)     // Catch:{ Exception -> 0x0079 }
            goto L_0x006f
        L_0x006e:
            r0 = r5
        L_0x006f:
            if (r0 != 0) goto L_0x0072
            goto L_0x008b
        L_0x0072:
            boolean r8 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x0079 }
            if (r8 == 0) goto L_0x008b
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0079 }
            goto L_0x008c
        L_0x0079:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r9 = r0.getMessage()
            r8[r3] = r9
            java.lang.String r9 = "HABBYGE-MALI.HellSpeedChecker"
            java.lang.String r10 = "getFeedId1: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r10, r8)
            goto L_0x008b
        L_0x008a:
        L_0x008b:
            r0 = r5
        L_0x008c:
            if (r0 != 0) goto L_0x00d9
            boolean r0 = o91.C100317j.m131147e(r13)
            if (r0 != 0) goto L_0x0095
            goto L_0x00d8
        L_0x0095:
            int r0 = r14 + r15
            int r0 = r0 + r7
            int r8 = o91.C100317j.m131145c(r13)
            if (r0 >= r8) goto L_0x00ad
            java.lang.Object r0 = o91.C100317j.m131144b(r13, r0)
            if (r0 != 0) goto L_0x00b5
            int r0 = o91.C100317j.m131146d(r13)
            java.lang.Object r0 = o91.C100317j.m131144b(r13, r0)
            goto L_0x00b5
        L_0x00ad:
            int r0 = o91.C100317j.m131146d(r13)
            java.lang.Object r0 = o91.C100317j.m131144b(r13, r0)
        L_0x00b5:
            if (r0 != 0) goto L_0x00b8
            goto L_0x00d8
        L_0x00b8:
            java.lang.reflect.Method r8 = r12.f293887k
            if (r8 == 0) goto L_0x00c3
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Object r0 = r8.invoke(r0, r9)
            goto L_0x00c4
        L_0x00c3:
            r0 = r5
        L_0x00c4:
            if (r0 != 0) goto L_0x00c7
            goto L_0x00d8
        L_0x00c7:
            java.lang.reflect.Field r8 = r12.f293888l
            if (r8 == 0) goto L_0x00d0
            java.lang.Object r0 = r8.get(r0)
            goto L_0x00d1
        L_0x00d0:
            r0 = r5
        L_0x00d1:
            boolean r8 = r0 instanceof java.lang.String
            if (r8 == 0) goto L_0x00d8
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
        L_0x00d8:
            r0 = r5
        L_0x00d9:
            if (r0 != 0) goto L_0x0122
            goto L_0x0183
        L_0x00dd:
            java.lang.String r8 = "ChattingUIFragment"
            boolean r0 = gy3.C87412m.m108589b(r0, r8)
            if (r0 == 0) goto L_0x0183
            boolean r0 = o91.C100317j.m131147e(r13)
            if (r0 != 0) goto L_0x00ec
            goto L_0x011e
        L_0x00ec:
            int r0 = r14 + r15
            int r0 = r0 + r7
            int r8 = o91.C100317j.m131145c(r13)
            if (r0 >= r8) goto L_0x0104
            java.lang.Object r0 = o91.C100317j.m131144b(r13, r0)
            if (r0 != 0) goto L_0x010c
            int r0 = o91.C100317j.m131146d(r13)
            java.lang.Object r0 = o91.C100317j.m131144b(r13, r0)
            goto L_0x010c
        L_0x0104:
            int r0 = o91.C100317j.m131146d(r13)
            java.lang.Object r0 = o91.C100317j.m131144b(r13, r0)
        L_0x010c:
            if (r0 != 0) goto L_0x010f
            goto L_0x011e
        L_0x010f:
            boolean r8 = r0 instanceof com.tencent.p014mm.storage.C72963f4
            if (r8 != 0) goto L_0x0114
            goto L_0x011e
        L_0x0114:
            com.tencent.mm.storage.f4 r0 = (com.tencent.p014mm.storage.C72963f4) r0
            long r8 = r0.getMsgId()
            java.lang.String r5 = java.lang.String.valueOf(r8)
        L_0x011e:
            if (r5 != 0) goto L_0x0121
            goto L_0x0183
        L_0x0121:
            r0 = r5
        L_0x0122:
            java.lang.String r5 = r12.f293883g
            boolean r5 = gy3.C87412m.m108589b(r0, r5)
            r8 = 2
            if (r5 != 0) goto L_0x0144
            int[] r1 = new int[r8]
        L_0x012d:
            if (r3 >= r8) goto L_0x0134
            r1[r3] = r7
            int r3 = r3 + 1
            goto L_0x012d
        L_0x0134:
            r6.getLocationOnScreen(r1)
            r1 = r1[r4]
            r12.f293881e = r1
            long r1 = java.lang.System.currentTimeMillis()
            r12.f293882f = r1
            r12.f293883g = r0
            goto L_0x0182
        L_0x0144:
            int[] r0 = new int[r8]
            r5 = 0
        L_0x0147:
            if (r5 >= r8) goto L_0x014e
            r0[r5] = r7
            int r5 = r5 + 1
            goto L_0x0147
        L_0x014e:
            r6.getLocationOnScreen(r0)
            r0 = r0[r4]
            int r5 = r12.f293881e
            int r5 = r0 - r5
            int r5 = java.lang.Math.abs(r5)
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r12.f293882f
            long r8 = r6 - r8
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0183
            int r1 = r12.f293879c
            if (r5 <= r1) goto L_0x0183
            long r1 = (long) r5
            r10 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r10
            long r1 = r1 / r8
            r12.f293881e = r0
            r12.f293882f = r6
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x017b
            r0 = 1
            goto L_0x017c
        L_0x017b:
            r0 = 0
        L_0x017c:
            if (r0 != 0) goto L_0x0182
            int r0 = r12.f293880d
            if (r0 != 0) goto L_0x0183
        L_0x0182:
            r3 = 1
        L_0x0183:
            if (r3 == 0) goto L_0x018c
            q91.d r0 = r12.f293877a
            if (r0 == 0) goto L_0x018c
            r0.mo102106a(r13, r14, r15)
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o91.C100314g.mo139597a(android.view.View, int, int):void");
    }

    /* renamed from: b */
    public void mo139598b(View view, int i) {
        C101077d dVar;
        if (view != null) {
            this.f293880d = i;
            if (i == 0 && (dVar = this.f293877a) != null) {
                dVar.mo102107b(view, i, this.f293889m, this.f293890n);
            }
        }
    }
}
