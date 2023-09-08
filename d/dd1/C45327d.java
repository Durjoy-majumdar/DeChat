package dd1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import kt1.C46744d;
import nr3.C89059e;
import ob0.C47350c;
import ob0.C89132b;
import org.json.JSONObject;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C51282sq0;
import te3.C51430tq0;
import zc1.C66785b;

/* renamed from: dd1.d */
public final class C45327d extends C60625c<C51430tq0> {

    /* renamed from: s */
    public final String f122782s;

    /* renamed from: t */
    public C46744d f122783t = C46744d.Disable;

    /* renamed from: u */
    public final JSONObject f122784u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45327d(String str) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        String str2 = "Cgi.FinderInit#" + str + '@' + hashCode();
        this.f122782s = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51282sq0 sq02 = new C51282sq0();
        sq02.f141672e = C46523h2.f125330a.mo71859a(3930);
        C51018qv3 qv32 = C66785b.f191882e.mo90673n0().mo62397b().f140463d;
        sq02.f141671d = qv32 == null ? new C51018qv3() : qv32;
        bVar.f127066a = sq02;
        C51430tq0 tq02 = new C51430tq0();
        tq02.setBaseResponse(new C49966ja());
        tq02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = tq02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderinit";
        bVar.f127069d = 3930;
        mo123453j(bVar.mo72403a());
        Log.m105924i(str2, "[CgiFinderInit]");
        this.f122784u = new JSONObject();
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return this.f122783t;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122784u;
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C51430tq0>> mo9225i() {
        Log.m105924i(this.f122782s, "[run]... ");
        return super.mo9225i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x023b, code lost:
        if (r11.isEmpty() != false) goto L_0x023f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02f2  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo332r(int r28, int r29, java.lang.String r30, te3.C49335eu3 r31, ob0.C117747y r32) {
        /*
            r27 = this;
            r0 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            te3.tq0 r10 = (te3.C51430tq0) r10
            java.lang.String r1 = "resp"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = r0.f122782s
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[onCgiBack] errType="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r11 = " errCode="
            r2.append(r11)
            r2.append(r8)
            java.lang.String r12 = " errMsg="
            r2.append(r12)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r1 = 4
            if (r7 < r1) goto L_0x003e
            kt1.d r1 = kt1.C46744d.Default
            r0.f122783t = r1
        L_0x003e:
            zc1.b r1 = zc1.C66785b.f191882e
            bd1.g r1 = r1.mo75316W2()
            java.util.concurrent.CopyOnWriteArraySet<ad1.a<?>> r1 = r1.f152703h
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x004f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof ad1.C39543a
            if (r4 == 0) goto L_0x004f
            r2.add(r3)
            goto L_0x004f
        L_0x0061:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r1 = r2.iterator()
        L_0x006a:
            boolean r2 = r1.hasNext()
            r15 = 1
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r1.next()
            r3 = r2
            ad1.a r3 = (ad1.C39543a) r3
            int r3 = r3.mo14612c()
            ob0.c r4 = r0.f256789f
            int r4 = r4.f127058d
            if (r3 != r4) goto L_0x0084
            r14 = 1
            goto L_0x0085
        L_0x0084:
            r14 = 0
        L_0x0085:
            if (r14 == 0) goto L_0x006a
            r13.add(r2)
            goto L_0x006a
        L_0x008b:
            java.util.Iterator r16 = r13.iterator()
        L_0x008f:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r1 = r16.next()
            ad1.a r1 = (ad1.C39543a) r1
            org.json.JSONObject r6 = r0.f122784u
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r10
            r1.mo14610a(r2, r3, r4, r5, r6)
            goto L_0x008f
        L_0x00a8:
            if (r7 != 0) goto L_0x03d0
            if (r8 != 0) goto L_0x03d0
            zc1.b r1 = zc1.C66785b.f191882e
            bd1.f r2 = new bd1.f
            r2.<init>()
            te3.qq2 r3 = r2.mo62397b()
            te3.qv3 r4 = r10.f142338e
            r3.f140463d = r4
            java.lang.String r3 = r10.f142326B
            r2.f131580d = r3
            te3.qq2 r3 = new te3.qq2
            r3.<init>()
            byte[] r4 = r10.toByteArray()
            r3.parseFrom(r4)
            r3.f140462F = r15
            r2.f131583g = r3
            int r3 = r10.f142347q
            r2.f131584h = r3
            long r3 = r10.f142348r
            r2.f131585i = r3
            java.lang.String r3 = r0.f122782s
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[successful] current_alias_role_type:"
            r4.append(r5)
            int r5 = r2.f131584h
            r4.append(r5)
            java.lang.String r5 = ", next_alias_mod_available_time:"
            r4.append(r5)
            long r5 = r2.f131585i
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            bd1.i r3 = bd1.C39759i.FINDER_INIT
            r1.mo90665S0(r2, r3)
            java.util.LinkedList<te3.si0> r1 = r10.f142327C
            java.lang.String r2 = "resp.contacts"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0109:
            boolean r3 = r1.hasNext()
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0302
            java.lang.Object r3 = r1.next()
            te3.si0 r3 = (te3.C51248si0) r3
            java.lang.String r5 = "contact"
            gy3.C87412m.m108593f(r3, r5)
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r3.f141536d
            if (r5 == 0) goto L_0x0125
            bd1.c r5 = bd1.C54448d.m61169a(r5)
            goto L_0x012a
        L_0x0125:
            bd1.c r5 = new bd1.c
            r5.<init>(r4)
        L_0x012a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.LinkedList<java.lang.String> r11 = r3.f141537e
            java.lang.String r12 = "this.finder_version_username_history"
            gy3.C87412m.m108593f(r11, r12)
            java.util.HashSet r11 = sx3.C110818d0.m150951w0(r11)
            java.lang.String r15 = r5.field_username
            r11.add(r15)
            java.util.Iterator r11 = r11.iterator()
        L_0x0144:
            boolean r15 = r11.hasNext()
            java.lang.String r14 = ";"
            if (r15 == 0) goto L_0x0159
            java.lang.Object r15 = r11.next()
            java.lang.String r15 = (java.lang.String) r15
            r6.append(r15)
            r6.append(r14)
            goto L_0x0144
        L_0x0159:
            java.lang.String r11 = r5.field_finder_version_username_history
            if (r11 == 0) goto L_0x0170
            java.lang.String[] r17 = new java.lang.String[]{r14}
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r11
            java.util.List r11 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
            goto L_0x0172
        L_0x0170:
            sx3.f0 r11 = sx3.C64186f0.f181907d
        L_0x0172:
            java.util.LinkedList<java.lang.String> r15 = r3.f141537e
            gy3.C87412m.m108593f(r15, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x0180:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x01ad
            r16 = r1
            java.lang.Object r1 = r15.next()
            r17 = r4
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            r18 = r11
            java.lang.String r11 = "it"
            gy3.C87412m.m108593f(r4, r11)
            int r4 = r4.length()
            if (r4 != 0) goto L_0x01a0
            r4 = 1
            goto L_0x01a1
        L_0x01a0:
            r4 = 0
        L_0x01a1:
            if (r4 != 0) goto L_0x01a6
            r12.add(r1)
        L_0x01a6:
            r1 = r16
            r4 = r17
            r11 = r18
            goto L_0x0180
        L_0x01ad:
            r16 = r1
            r17 = r4
            r18 = r11
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>(r12)
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDER_USERNAME_LIST_RESET_INT_SYNC
            r12 = 0
            int r4 = r4.mo119689j(r11, r12)
            java.lang.String r12 = r5.field_username
            zc1.b r15 = zc1.C66785b.f191882e
            r19 = r13
            java.lang.String r13 = r15.mo90658I1()
            boolean r12 = gy3.C87412m.m108589b(r12, r13)
            java.lang.String r13 = "toFinderAccountModify"
            if (r12 == 0) goto L_0x021a
            r12 = 2
            if (r4 > r12) goto L_0x021a
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.t1 r4 = (ht1.C60200t1) r4
            ht1.x1 r4 = r4.mo76776L4()
            java.lang.String r12 = r15.mo90658I1()
            int r4 = r4.mo71565J8(r12)
            r5.field_username_history_version = r4
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            r18 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r18)
            r12.mo119677K(r11, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "reset username_history_version="
            r9.append(r11)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r4)
            r11 = r1
            goto L_0x021c
        L_0x021a:
            r11 = r18
        L_0x021c:
            java.lang.String r4 = r5.field_username
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L_0x0229
            java.lang.String r4 = r5.field_username
            r1.add(r4)
        L_0x0229:
            boolean r4 = r1.containsAll(r11)
            if (r4 == 0) goto L_0x023e
            boolean r4 = r1.isEmpty()
            r9 = 1
            r4 = r4 ^ r9
            if (r4 == 0) goto L_0x025b
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L_0x025b
            goto L_0x023f
        L_0x023e:
            r9 = 1
        L_0x023f:
            int r4 = r5.field_username_history_version
            int r4 = r4 + r9
            r5.field_username_history_version = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "username_history_version + 1 = "
            r4.append(r9)
            int r9 = r5.field_username_history_version
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
        L_0x025b:
            java.lang.String r4 = r5.field_username
            java.lang.String r9 = r15.mo90658I1()
            boolean r4 = gy3.C87412m.m108589b(r4, r9)
            if (r4 == 0) goto L_0x0298
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDER_USERNAME_LIST_LOCAL_VERSION_INT_SYNC
            int r12 = r5.field_username_history_version
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r4.mo119677K(r9, r12)
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDER_USERNAME_LIST_STRING_SYNC
            java.lang.String r12 = r6.toString()
            java.lang.String r15 = "ss.toString()"
            gy3.C87412m.m108593f(r12, r15)
            java.lang.String r15 = ","
            r8 = 0
            java.lang.String r12 = z04.C112551y.m153814n(r12, r14, r15, r8)
            r4.mo119677K(r9, r12)
        L_0x0298:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "userVersion="
            r4.append(r8)
            int r8 = r5.field_username_history_version
            r4.append(r8)
            java.lang.String r8 = " old="
            r4.append(r8)
            r4.append(r11)
            java.lang.String r8 = " new="
            r4.append(r8)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            int r1 = z04.C112550d0.m153765A(r6)
        L_0x02c3:
            r4 = -1
            if (r4 >= r1) goto L_0x02df
            char r4 = r6.charAt(r1)
            r8 = 59
            if (r4 != r8) goto L_0x02d0
            r4 = 1
            goto L_0x02d1
        L_0x02d0:
            r4 = 0
        L_0x02d1:
            if (r4 != 0) goto L_0x02dc
            int r1 = r1 + 1
            r4 = 0
            java.lang.CharSequence r1 = r6.subSequence(r4, r1)
            r4 = r1
            goto L_0x02e1
        L_0x02dc:
            int r1 = r1 + -1
            goto L_0x02c3
        L_0x02df:
            r4 = r17
        L_0x02e1:
            java.lang.String r1 = r4.toString()
            r5.field_finder_version_username_history = r1
            zc1.b r1 = zc1.C66785b.f191882e
            bd1.i r4 = bd1.C39759i.FINDER_INIT
            r1.mo90672m1(r5, r4)
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r3.f141536d
            if (r1 == 0) goto L_0x02f7
            fe1.d$b r3 = fe1.C58961d.f168673a
            r3.mo84162j(r1)
        L_0x02f7:
            r8 = r29
            r9 = r30
            r1 = r16
            r13 = r19
            r15 = 1
            goto L_0x0109
        L_0x0302:
            r17 = r4
            r19 = r13
            int r1 = r10.f142344n
            r3 = 0
            if (r1 <= 0) goto L_0x0320
            zc1.b r1 = zc1.C66785b.f191882e
            bd1.i r2 = bd1.C39759i.FINDER_INIT
            r1.mo90655C2(r2)
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 1279(0x4ff, double:6.32E-321)
            r23 = 26
            r25 = 1
            r20.mo175913w(r21, r23, r25)
            r4 = 0
            r12 = 1
            goto L_0x0361
        L_0x0320:
            java.util.LinkedList<te3.si0> r1 = r10.f142327C
            gy3.C87412m.m108593f(r1, r2)
            boolean r1 = r1.isEmpty()
            r12 = 1
            r1 = r1 ^ r12
            if (r1 == 0) goto L_0x0360
            java.util.ArrayList r1 = new java.util.ArrayList
            zc1.b r2 = zc1.C66785b.f191882e
            r4 = 0
            java.util.List r2 = zc1.C66783a.C66784a.m78799b(r2, r4, r12, r3)
            r1.<init>(r2)
            dd1.c r2 = new dd1.c
            r2.<init>(r10)
            o40.C61926c.m72673R(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0345:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0361
            java.lang.Object r2 = r1.next()
            bd1.b r2 = (bd1.C54446b) r2
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r2 = r2.field_username
            java.lang.String r6 = "it.field_username"
            gy3.C87412m.m108593f(r2, r6)
            bd1.i r6 = bd1.C39759i.FINDER_INIT
            r5.mo90660L2(r2, r6)
            goto L_0x0345
        L_0x0360:
            r4 = 0
        L_0x0361:
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r2 = r1.mo90662O5()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x036f
            r2 = 1
            goto L_0x0370
        L_0x036f:
            r2 = 0
        L_0x0370:
            if (r2 == 0) goto L_0x037b
            java.lang.String r2 = r10.f142326B
            if (r2 != 0) goto L_0x0378
            r2 = r17
        L_0x0378:
            r1.mo90667X1(r2)
        L_0x037b:
            java.lang.String r2 = r10.f142330F
            if (r2 != 0) goto L_0x0381
            r2 = r17
        L_0x0381:
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x0389
            r14 = 1
            goto L_0x038a
        L_0x0389:
            r14 = 0
        L_0x038a:
            if (r14 == 0) goto L_0x038f
            r1.mo90667X1(r2)
        L_0x038f:
            java.util.LinkedList<te3.bi0> r1 = r10.f142334J
            java.lang.String r2 = "resp.finder_config_item"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x039a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03b3
            java.lang.Object r2 = r1.next()
            r4 = r2
            te3.bi0 r4 = (te3.C48860bi0) r4
            java.lang.String r4 = r4.f131128d
            java.lang.String r5 = "usefindergetcommentlist"
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x039a
            goto L_0x03b4
        L_0x03b3:
            r2 = r3
        L_0x03b4:
            te3.bi0 r2 = (te3.C48860bi0) r2
            if (r2 == 0) goto L_0x03cb
            zc1.b r1 = zc1.C66785b.f191882e
            pe3.b r2 = r2.f131129e
            if (r2 == 0) goto L_0x03c2
            java.lang.String r3 = r2.mo123705h()
        L_0x03c2:
            java.lang.String r2 = "1"
            boolean r2 = gy3.C87412m.m108589b(r3, r2)
            r1.mo90674o0(r2)
        L_0x03cb:
            r8 = r29
            r9 = r30
            goto L_0x041e
        L_0x03d0:
            r19 = r13
            java.lang.String r1 = r0.f122782s
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[failure] errType="
            r2.append(r3)
            r2.append(r7)
            r2.append(r11)
            r8 = r29
            r2.append(r8)
            r2.append(r12)
            r9 = r30
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            org.json.JSONObject r1 = r0.f122784u
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "errType="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " errType="
            r2.append(r3)
            r2.append(r7)
            r2.append(r12)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "failure"
            r1.put(r3, r2)
        L_0x041e:
            java.util.Iterator r11 = r19.iterator()
        L_0x0422:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x043b
            java.lang.Object r1 = r11.next()
            ad1.a r1 = (ad1.C39543a) r1
            org.json.JSONObject r6 = r0.f122784u
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r10
            r1.mo14611b(r2, r3, r4, r5, r6)
            goto L_0x0422
        L_0x043b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dd1.C45327d.mo332r(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }
}
