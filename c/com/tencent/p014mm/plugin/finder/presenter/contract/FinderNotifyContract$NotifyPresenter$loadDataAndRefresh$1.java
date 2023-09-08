package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1 */
public final class FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContract.NotifyPresenter f160469d;

    /* renamed from: e */
    public final /* synthetic */ long f160470e;

    /* renamed from: f */
    public final /* synthetic */ int f160471f;

    /* renamed from: g */
    public final /* synthetic */ int f160472g;

    /* renamed from: h */
    public final /* synthetic */ boolean f160473h;

    /* renamed from: i */
    public final /* synthetic */ boolean f160474i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1(FinderNotifyContract.NotifyPresenter notifyPresenter, long j, int i, int i2, boolean z, boolean z2) {
        super(0);
        this.f160469d = notifyPresenter;
        this.f160470e = j;
        this.f160471f = i;
        this.f160472g = i2;
        this.f160473h = z;
        this.f160474i = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0275  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r18 = this;
            r0 = r18
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r1 = r0.f160469d
            long r9 = r0.f160470e
            int r2 = r0.f160471f
            int r11 = r0.f160472g
            r1.getClass()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            wp1.h$a r3 = wp1.C66169h.f190180a
            java.util.ArrayList<int[]> r4 = r1.f160442f
            r13 = 1
            r14 = 0
            if (r2 < 0) goto L_0x0022
            int r5 = r4.size()
            if (r2 >= r5) goto L_0x0022
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            if (r5 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            if (r4 == 0) goto L_0x0032
            java.util.ArrayList<int[]> r4 = r1.f160442f
            java.lang.Object r2 = r4.get(r2)
            int[] r2 = (int[]) r2
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r2 != 0) goto L_0x0037
            int[] r2 = new int[r14]
        L_0x0037:
            r6 = r2
            int r7 = r1.f160440d
            java.lang.String r8 = r1.f160450q
            r2 = r3
            r3 = r9
            r5 = r11
            java.util.List r2 = r2.mo90243b(r3, r5, r6, r7, r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x004c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r2.next()
            xh.va r4 = (p749xh.C66276va) r4
            wp1.h$a r5 = wp1.C66169h.f190180a
            cm1.a r4 = r5.mo90250i(r4)
            if (r4 == 0) goto L_0x004c
            r3.add(r4)
            goto L_0x004c
        L_0x0064:
            java.lang.String r1 = r1.f160443g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "loadMoreData mentionId:"
            r2.append(r4)
            r2.append(r9)
            java.lang.String r4 = " limit:"
            r2.append(r4)
            r2.append(r11)
            java.lang.String r4 = " list:"
            r2.append(r4)
            int r4 = r3.size()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r12.addAll(r3)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r1 = r0.f160469d
            java.lang.String r1 = r1.f160443g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "tobe mergeData from db data from DB:"
            r2.append(r3)
            int r3 = r12.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r1 = r0.f160469d
            int r2 = r0.f160471f
            java.util.ArrayList<java.util.ArrayList<cm1.a>> r3 = r1.f160448o
            if (r2 < 0) goto L_0x00be
            int r4 = r3.size()
            if (r2 >= r4) goto L_0x00be
            r4 = 1
            goto L_0x00bf
        L_0x00be:
            r4 = 0
        L_0x00bf:
            if (r4 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            if (r3 == 0) goto L_0x00ce
            java.util.ArrayList<java.util.ArrayList<cm1.a>> r3 = r1.f160448o
            java.lang.Object r3 = r3.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            goto L_0x00cf
        L_0x00ce:
            r3 = 0
        L_0x00cf:
            if (r3 == 0) goto L_0x024a
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x00dc
            r3.addAll(r12)
            goto L_0x024a
        L_0x00dc:
            int r6 = sx3.C64197v.m75536e(r3)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = r6 instanceof cm1.C39993q1
            if (r6 == 0) goto L_0x00f2
            int r6 = sx3.C64197v.m75536e(r3)
            java.lang.Object r6 = r3.remove(r6)
            cm1.a r6 = (cm1.C55011a) r6
        L_0x00f2:
            java.util.List r6 = sx3.C110818d0.m150936h0(r12)
            java.util.Iterator r6 = r6.iterator()
        L_0x00fa:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0199
            java.lang.Object r7 = r6.next()
            cm1.a r7 = (cm1.C55011a) r7
            java.util.Iterator r9 = r3.iterator()
            r10 = 0
        L_0x010b:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0138
            java.lang.Object r11 = r9.next()
            cm1.a r11 = (cm1.C55011a) r11
            xh.va r11 = r11.f154465d
            long r14 = r11.field_id
            xh.va r4 = r7.f154465d
            r16 = r9
            long r8 = r4.field_id
            int r17 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r17 != 0) goto L_0x012d
            int r8 = r11.field_createTime
            int r4 = r4.field_createTime
            if (r8 != r4) goto L_0x012d
            r4 = 1
            goto L_0x012e
        L_0x012d:
            r4 = 0
        L_0x012e:
            if (r4 == 0) goto L_0x0132
            r4 = -1
            goto L_0x013a
        L_0x0132:
            int r10 = r10 + 1
            r9 = r16
            r14 = 0
            goto L_0x010b
        L_0x0138:
            r4 = -1
            r10 = -1
        L_0x013a:
            if (r10 != r4) goto L_0x0193
            xh.va r4 = r7.f154465d
            int r8 = r4.field_type
            r9 = 10
            if (r8 != r9) goto L_0x018f
            java.lang.String r4 = r4.field_clientMsgId
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x018f
            java.util.Iterator r4 = r3.iterator()
            r8 = 0
        L_0x0151:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x016f
            java.lang.Object r9 = r4.next()
            cm1.a r9 = (cm1.C55011a) r9
            xh.va r9 = r9.f154465d
            java.lang.String r9 = r9.field_clientMsgId
            xh.va r10 = r7.f154465d
            java.lang.String r10 = r10.field_clientMsgId
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x016c
            goto L_0x0170
        L_0x016c:
            int r8 = r8 + 1
            goto L_0x0151
        L_0x016f:
            r8 = -1
        L_0x0170:
            if (r8 < 0) goto L_0x018f
            r3.remove(r8)
            java.lang.String r4 = r1.f160443g
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "remove same clientMsgId, "
            r5.append(r8)
            xh.va r8 = r7.f154465d
            java.lang.String r8 = r8.field_clientMsgId
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
        L_0x018f:
            r3.add(r7)
            goto L_0x0196
        L_0x0193:
            r3.set(r10, r7)
        L_0x0196:
            r14 = 0
            goto L_0x00fa
        L_0x0199:
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$sortMentionList$comparator$1<T> r4 = com.tencent.p014mm.plugin.finder.presenter.contract.C56191x6df2bcc5.f160481d
            sx3.C77813z.m93909o(r3, r4)
            java.lang.String r4 = r1.f160443g
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "increment size "
            r6.append(r7)
            int r7 = r12.size()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            boolean r4 = r12.isEmpty()
            r4 = r4 ^ r13
            if (r4 == 0) goto L_0x024a
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Long> r4 = r1.f160445i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto L_0x01d0
            r6 = 0
            goto L_0x01d4
        L_0x01d0:
            long r6 = r2.longValue()
        L_0x01d4:
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0248
            int r2 = r3.size()
            java.util.ListIterator r2 = r3.listIterator(r2)
        L_0x01e2:
            boolean r4 = r2.hasPrevious()
            if (r4 == 0) goto L_0x0200
            java.lang.Object r4 = r2.previous()
            cm1.a r4 = (cm1.C55011a) r4
            xh.va r4 = r4.f154465d
            long r10 = r4.field_id
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01f8
            r4 = 1
            goto L_0x01f9
        L_0x01f8:
            r4 = 0
        L_0x01f9:
            if (r4 == 0) goto L_0x01e2
            int r4 = r2.nextIndex()
            goto L_0x0201
        L_0x0200:
            r4 = -1
        L_0x0201:
            java.lang.String r2 = r1.f160443g
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "unread index "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ", raw size "
            r6.append(r7)
            int r7 = r3.size()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            r2 = -1
            if (r4 == r2) goto L_0x0248
            if (r4 < 0) goto L_0x0238
            r2 = 0
        L_0x022a:
            java.lang.Object r5 = r3.get(r2)
            cm1.a r5 = (cm1.C55011a) r5
            r6 = 0
            r5.f154466e = r6
            if (r2 == r4) goto L_0x0239
            int r2 = r2 + 1
            goto L_0x022a
        L_0x0238:
            r6 = 0
        L_0x0239:
            int r2 = sx3.C64197v.m75536e(r3)
            if (r4 == r2) goto L_0x024d
            java.lang.Object r2 = r3.get(r4)
            cm1.a r2 = (cm1.C55011a) r2
            r2.f154466e = r13
            goto L_0x024d
        L_0x0248:
            r6 = 0
            goto L_0x024d
        L_0x024a:
            r6 = 0
            r8 = 0
        L_0x024d:
            java.lang.String r1 = r1.f160443g
            java.lang.String r2 = "mergeData after"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r1 = r0.f160469d
            int r2 = r0.f160471f
            java.util.ArrayList<com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback> r1 = r1.f160447n
            if (r2 < 0) goto L_0x0263
            int r3 = r1.size()
            if (r2 >= r3) goto L_0x0263
            goto L_0x0264
        L_0x0263:
            r13 = 0
        L_0x0264:
            if (r13 == 0) goto L_0x0267
            goto L_0x0268
        L_0x0267:
            r1 = 0
        L_0x0268:
            if (r1 == 0) goto L_0x0272
            java.lang.Object r1 = r1.get(r2)
            r15 = r1
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback r15 = (com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) r15
            goto L_0x0273
        L_0x0272:
            r15 = 0
        L_0x0273:
            if (r15 == 0) goto L_0x0308
            boolean r1 = r0.f160473h
            boolean r2 = r0.f160474i
            gy3.d0 r3 = new gy3.d0
            r3.<init>()
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r4 = r15.f160455g
            int r5 = r15.f160452d
            java.util.ArrayList r4 = r4.mo78485n(r5)
            int r4 = r4.size()
            r3.f27483d = r4
            java.lang.String r4 = r15.f160453e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "presenter.getData("
            r5.append(r6)
            int r6 = r15.f160452d
            r5.append(r6)
            java.lang.String r6 = ": "
            r5.append(r6)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r6 = r15.f160455g
            int r7 = r15.f160452d
            java.util.ArrayList r6 = r6.mo78485n(r7)
            int r6 = r6.hashCode()
            r5.append(r6)
            java.lang.String r6 = " --- "
            r5.append(r6)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r6 = r15.f160455g
            int r7 = r15.f160452d
            java.util.ArrayList r6 = r6.mo78485n(r7)
            r5.append(r6)
            r6 = 41
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            if (r1 == 0) goto L_0x02ff
            long r4 = android.os.SystemClock.uptimeMillis()
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract r1 = com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract.f160438a
            int r6 = r15.f160452d
            long r6 = r1.mo78483a(r6)
            long r4 = r4 - r6
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Long> r1 = up1.C37521f.f99343Z1
            java.lang.Object r6 = r1.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x02f2
            goto L_0x02ff
        L_0x02f2:
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            long r4 = r6 - r4
            goto L_0x0300
        L_0x02ff:
            r4 = r8
        L_0x0300:
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$finishLoadMore$1 r1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$finishLoadMore$1
            r1.<init>(r15, r2, r3, r12)
            o40.C61926c.m72666K(r4, r1)
        L_0x0308:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1.invoke():java.lang.Object");
    }
}
