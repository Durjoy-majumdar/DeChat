package x82;

import android.text.TextUtils;
import c92.C104331h;
import com.tencent.p014mm.plugin.multitalk.model.C105808j;
import com.tencent.p014mm.plugin.multitalk.model.C105810k;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: x82.p */
public final class C112112p implements C105810k {

    /* renamed from: d */
    public C112113q f335660d;

    /* renamed from: e */
    public C112075a f335661e;

    /* renamed from: f */
    public C112091e0 f335662f;

    /* renamed from: g */
    public final boolean f335663g;

    /* renamed from: h */
    public ArrayList<Integer> f335664h;

    public C112112p(C112113q qVar, C112075a aVar) {
        C87412m.m108594g(qVar, "contentView");
        C87412m.m108594g(aVar, "statusManager");
        this.f335660d = qVar;
        this.f335661e = aVar;
        C105851w0.zx0().mo150676q().mo150842f(this);
        C112091e0 e0Var = new C112091e0(this.f335661e);
        this.f335662f = e0Var;
        MTimerHandler mTimerHandler = e0Var.f335589b;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = e0Var.f335589b;
        if (mTimerHandler2 != null) {
            mTimerHandler2.quitSafely();
        }
        MTimerHandler mTimerHandler3 = e0Var.f335589b;
        if (mTimerHandler3 != null) {
            mTimerHandler3.removeCallbacksAndMessages((Object) null);
        }
        MTimerHandler mTimerHandler4 = new MTimerHandler(new C112089d0(e0Var), true);
        e0Var.f335589b = mTimerHandler4;
        mTimerHandler4.startTimer(20);
        this.f335663g = C104331h.m139315h();
        this.f335664h = new ArrayList<>();
    }

    /* renamed from: a */
    public C105808j mo150700a(int i) {
        return null;
    }

    /* renamed from: b */
    public C105808j mo150701b(String str) {
        C87412m.m108594g(str, "wxUserName");
        C112113q qVar = this.f335660d;
        if (TextUtils.isEmpty(qVar.getUsername()) || C87412m.m108589b(qVar.getUsername(), str)) {
            return qVar;
        }
        return null;
    }

    /* renamed from: c */
    public void mo150702c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163842d() {
        /*
            r12 = this;
            x82.q r0 = r12.f335660d
            java.lang.String r0 = r0.mo163844d()
            boolean r1 = z04.C112551y.m153811k(r0)
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L_0x00a3
            x82.q r1 = r12.f335660d
            x82.l r1 = r1.f335668g
            r5 = 0
            if (r1 == 0) goto L_0x001a
            java.lang.Long r1 = r1.f335637i
            goto L_0x001b
        L_0x001a:
            r1 = r5
        L_0x001b:
            if (r1 == 0) goto L_0x00a3
            long r6 = r1.longValue()
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r6)
            r8 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x0079
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            if (r1 == 0) goto L_0x003f
            java.util.List r1 = r1.mo150675p()
            if (r1 == 0) goto L_0x003f
            boolean r1 = r1.contains(r0)
            if (r1 != r2) goto L_0x003f
            r1 = 1
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x0060
            x82.q r1 = r12.f335660d
            r1.mo163843c(r2)
            x82.q r1 = r12.f335660d
            x82.l r1 = r1.f335668g
            if (r1 != 0) goto L_0x004e
            goto L_0x005a
        L_0x004e:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.f335637i = r5
            r1.f335635g = r0
        L_0x005a:
            x82.q r1 = r12.f335660d
            r1.mo163848h(r0)
            goto L_0x007e
        L_0x0060:
            x82.a r1 = r12.f335661e
            x82.a$b r6 = x82.C112075a.C112077b.AVATAR_HIDE
            x82.C112075a.C112076a.m152803a(r1, r6, r5, r4, r5)
            x82.q r1 = r12.f335660d
            r1.mo163843c(r3)
            x82.q r1 = r12.f335660d
            x82.l r1 = r1.f335668g
            if (r1 != 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            r1.f335637i = r5
            r1.f335635g = r5
        L_0x0077:
            r1 = 1
            goto L_0x007f
        L_0x0079:
            x82.q r1 = r12.f335660d
            r1.mo163848h(r0)
        L_0x007e:
            r1 = 0
        L_0x007f:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r5 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            if (r5 == 0) goto L_0x0093
            java.util.List r5 = r5.mo150675p()
            if (r5 == 0) goto L_0x0093
            boolean r0 = r5.contains(r0)
            if (r0 != r2) goto L_0x0093
            r0 = 1
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            if (r0 == 0) goto L_0x009e
            if (r1 != 0) goto L_0x009e
            x82.q r0 = r12.f335660d
            r0.mo163849i(r2)
            goto L_0x00a3
        L_0x009e:
            x82.q r0 = r12.f335660d
            r0.mo163849i(r3)
        L_0x00a3:
            boolean r0 = r12.f335663g
            if (r0 != 0) goto L_0x02a6
            com.tencent.mm.plugin.multitalk.model.w r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            if (r0 == 0) goto L_0x02a6
            java.util.ArrayList r0 = r0.mo150824d(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x00c1
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r5 = 0
            goto L_0x00c2
        L_0x00c1:
            r5 = 1
        L_0x00c2:
            java.lang.String r6 = "MicroMsg.ScreenProjectAvatarManager"
            if (r5 != 0) goto L_0x011d
            int r5 = r0.size()
            int r5 = r5 - r2
            if (r2 > r5) goto L_0x011d
            int r5 = r0.size()
            java.util.List r0 = r0.subList(r2, r5)
            java.lang.String r5 = "speakers.subList(startIndex,speakers.size)"
            gy3.C87412m.m108593f(r0, r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x00de:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x011d
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r7 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r7 = r7.f314465G
            if (r7 == 0) goto L_0x0117
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r7 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.a r8 = r7.f314473P
            boolean r8 = r8.mo150708j()
            if (r8 == 0) goto L_0x0108
            com.tencent.mm.plugin.multitalk.model.a r7 = r7.f314473P
            java.lang.String r7 = r7.mo150705g()
            if (r7 != r5) goto L_0x0108
            r7 = 1
            goto L_0x0109
        L_0x0108:
            r7 = 0
        L_0x0109:
            if (r7 == 0) goto L_0x0117
            int r5 = c92.C104331h.m139311c(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.add(r5)
            goto L_0x00de
        L_0x0117:
            java.lang.String r5 = "screen big are not allow to refresh decode"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
            goto L_0x00de
        L_0x011d:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02a6
            java.util.ArrayList<java.lang.Integer> r0 = r12.f335664h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0131
            java.util.ArrayList<java.lang.Integer> r0 = r12.f335664h
            r0.addAll(r1)
            goto L_0x018a
        L_0x0131:
            int r0 = r1.size()
            java.util.ArrayList<java.lang.Integer> r5 = r12.f335664h
            int r5 = r5.size()
            int r4 = r4 - r5
            if (r0 >= r4) goto L_0x0187
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<java.lang.Integer> r4 = r12.f335664h
            java.util.Iterator r4 = r4.iterator()
        L_0x0149:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0161
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            goto L_0x0149
        L_0x0161:
            java.util.Iterator r4 = r1.iterator()
        L_0x0165:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0188
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r7 = r0.contains(r7)
            if (r7 != 0) goto L_0x0165
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            goto L_0x0165
        L_0x0187:
            r0 = r1
        L_0x0188:
            r12.f335664h = r0
        L_0x018a:
            java.util.ArrayList<java.lang.Integer> r0 = r12.f335664h
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.a r5 = r4.f314473P
            boolean r5 = r5.mo150708j()
            if (r5 == 0) goto L_0x01a3
            com.tencent.mm.plugin.multitalk.model.a r4 = r4.f314473P
            java.lang.String r4 = r4.mo150705g()
            int r4 = c92.C104331h.m139311c(r4)
            goto L_0x01a4
        L_0x01a3:
            r4 = -1
        L_0x01a4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.remove(r4)
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r0 = r0.mo150680v()
            if (r0 != 0) goto L_0x0226
            java.util.ArrayList<java.lang.Integer> r4 = r12.f335664h
            if (r4 == 0) goto L_0x0226
            int r5 = r4.size()
            if (r5 >= r2) goto L_0x01c0
            goto L_0x0226
        L_0x01c0:
            int r5 = r4.size()
            int[] r7 = new int[r5]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 0
        L_0x01cc:
            if (r9 >= r5) goto L_0x01ea
            java.lang.Object r10 = r4.get(r9)
            java.lang.String r11 = "memberIdList[i]"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r8.append(r10)
            java.lang.String r11 = ","
            r8.append(r11)
            r7[r9] = r10
            int r9 = r9 + 1
            goto L_0x01cc
        L_0x01ea:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r8 = r8.toString()
            r4[r3] = r8
            java.lang.String r8 = "steve: engineDoMemberSelectForView: selected id list: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r4)
            int r4 = r5 * 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r8 = r4.order(r8)
            java.nio.IntBuffer r8 = r8.asIntBuffer()
            r8.put(r7)
            byte[] r4 = r4.array()
            com.tencent.mm.plugin.multitalk.model.w r7 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r7 = r7.f314798d
            r8 = 23
            nw3.e r7 = (nw3.C109779e) r7
            int r4 = r7.mo161038i(r8, r4, r5)
            if (r4 >= 0) goto L_0x0226
            java.lang.String r4 = "steve:engineDoMemberSelectForView failed!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            com.tencent.p014mm.plugin.multitalk.model.C105853x.m142231b()
        L_0x0226:
            if (r0 == 0) goto L_0x0274
            java.util.ArrayList<java.lang.Integer> r0 = r12.f335664h
            int r0 = r0.size()
            if (r0 != r2) goto L_0x0246
            com.tencent.mm.plugin.multitalk.ilinkservice.z r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            java.util.ArrayList<java.lang.Integer> r2 = r12.f335664h
            java.lang.Object r2 = sx3.C110818d0.m150914L(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.getClass()
            com.tencent.mm.plugin.multitalk.ilinkservice.z1 r4 = new com.tencent.mm.plugin.multitalk.ilinkservice.z1
            r4.<init>(r0, r2, r3)
            r0.mo150614x(r4)
            goto L_0x0255
        L_0x0246:
            com.tencent.mm.plugin.multitalk.ilinkservice.z r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            java.util.ArrayList<java.lang.Integer> r2 = r12.f335664h
            r0.getClass()
            com.tencent.mm.plugin.multitalk.ilinkservice.x1 r4 = new com.tencent.mm.plugin.multitalk.ilinkservice.x1
            r4.<init>(r0, r2, r3)
            r0.mo150614x(r4)
        L_0x0255:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "ilink subscribeByUserMids ok, mids:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " and subscribe one is "
            r0.append(r1)
            java.util.ArrayList<java.lang.Integer> r1 = r12.f335664h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x02a6
        L_0x0274:
            java.util.ArrayList<java.lang.Integer> r0 = r12.f335664h
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x027f:
            if (r3 >= r0) goto L_0x029f
            as3.r0 r2 = new as3.r0
            r2.<init>()
            java.util.ArrayList<java.lang.Integer> r4 = r12.f335664h
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r5 = "subscribeVideoCacheList[i]"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r2.f307152b = r4
            r1.add(r2)
            int r3 = r3 + 1
            goto L_0x027f
        L_0x029f:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            r0.mo150649Z(r1)
        L_0x02a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112112p.mo163842d():void");
    }
}
