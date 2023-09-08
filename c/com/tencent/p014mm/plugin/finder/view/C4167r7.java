package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import bl3.C39818r;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60172g4;
import jp3.C9487b;
import ks3.C10412u;
import l31.C61212e;
import ls3.C10649f;
import o40.C61926c;
import ob0.C89132b;
import p749xh.C66261f3;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C48924by0;
import te3.C49712hj1;
import te3.C49720hl0;
import te3.C50008jm0;
import te3.C50124kf1;
import te3.C50851pn0;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64347eq2;
import te3.C64686ro2;
import tf0.C64916p1;

/* renamed from: com.tencent.mm.plugin.finder.view.r7 */
public final class C4167r7 {

    /* renamed from: a */
    public final Context f18403a;

    /* renamed from: b */
    public final String f18404b;

    /* renamed from: c */
    public final int f18405c;

    /* renamed from: d */
    public final boolean f18406d;

    /* renamed from: e */
    public final long f18407e;

    /* renamed from: com.tencent.mm.plugin.finder.view.r7$a */
    public static final class C4168a implements C10649f.C10650a {

        /* renamed from: a */
        public final /* synthetic */ int f18408a;

        /* renamed from: b */
        public final /* synthetic */ C4167r7 f18409b;

        /* renamed from: c */
        public final /* synthetic */ FinderObject f18410c;

        /* renamed from: d */
        public final /* synthetic */ Intent f18411d;

        public C4168a(int i, C4167r7 r7Var, FinderObject finderObject, Intent intent) {
            this.f18408a = i;
            this.f18409b = r7Var;
            this.f18410c = finderObject;
            this.f18411d = intent;
        }

        /* renamed from: a */
        public void mo5052a() {
        }

        /* renamed from: b */
        public void mo5053b(FinderObject finderObject) {
            C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        }

        /* renamed from: c */
        public void mo5054c(Object obj) {
            C87412m.m108594g(obj, "bundle");
        }

        /* renamed from: d */
        public void mo5055d(C89132b.C89134c<C50008jm0> cVar) {
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        }

        /* renamed from: e */
        public void mo5056e(C89132b.C89134c<C50851pn0> cVar) {
            C48924by0 by02;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            FinderObject finderObject = ((C50851pn0) cVar.f256796d).f139838d;
            if (finderObject != null) {
                int i = this.f18408a;
                C4167r7 r7Var = this.f18409b;
                FinderObject finderObject2 = this.f18410c;
                Intent intent = this.f18411d;
                ((C64916p1) C86312j.m106911c(C64916p1.class)).j80(finderObject, i);
                r7Var.mo5051b(r7Var.f18403a.getClass().getName(), finderObject2 == null ? finderObject : finderObject2, r7Var.f18405c, r7Var.f18406d, 0);
                FinderContact finderContact = finderObject.contact;
                int i2 = 0;
                if (finderContact != null && finderContact.liveStatus == 1) {
                    C49712hj1 q3 = ((C60172g4) C39818r.f106831a.mo62443b(r7Var.f18403a).mo62447c(C60172g4.class)).mo12861q3();
                    C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                    C13604l[] lVarArr = new C13604l[9];
                    lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(finderObject.f164794id));
                    C64273c21 c212 = finderObject.liveInfo;
                    lVarArr[1] = new C13604l("live_id", c212 != null ? C61926c.m72691p(c212.f182392d) : null);
                    lVarArr[2] = new C13604l("comment_scene", Integer.valueOf(i));
                    FinderContact finderContact2 = finderObject.contact;
                    lVarArr[3] = new C13604l("finder_username", finderContact2 != null ? finderContact2.username : null);
                    lVarArr[4] = new C13604l("session_buffer", finderObject.sessionBuffer);
                    lVarArr[5] = new C13604l("behaviour_session_id", q3.f134671e);
                    lVarArr[6] = new C13604l("finder_tab_context_id", q3.f134672f);
                    lVarArr[7] = new C13604l("live_enter_status", 1L);
                    lVarArr[8] = new C13604l("share_username", "");
                    eVar.mo86153W7("finder_feed_living_label_click", (Object) null, C90364q0.m113147f(lVarArr), 26236);
                }
                C64273c21 c213 = finderObject.liveInfo;
                if (c213 != null) {
                    i2 = c213.f182384X;
                }
                intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", i2);
                C64273c21 c214 = finderObject.liveInfo;
                if (c214 != null && (by02 = c214.f182402p0) != null) {
                    intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", by02.toByteArray());
                }
            }
        }

        public void onFailed(int i) {
        }
    }

    public C4167r7(Context context, String str, int i, boolean z, long j) {
        C87412m.m108594g(context, "context");
        this.f18403a = context;
        this.f18404b = str;
        this.f18405c = i;
        this.f18406d = z;
        this.f18407e = j;
    }

    /* renamed from: a */
    public void mo5050a(boolean z, boolean z2, FinderObject finderObject) {
        C50124kf1 kf12;
        C49720hl0 hl02;
        String str = this.f18404b;
        if (!(str == null || str.length() == 0)) {
            int t3 = ((C60172g4) C39818r.f106831a.mo62443b(this.f18403a).mo62447c(C60172g4.class)).mo12864t3();
            Intent intent = new Intent();
            intent.putExtra("key_enter_live_param_visitor_enter_scene", 5);
            int i = C10412u.f31640a;
            intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 2);
            intent.putExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", this.f18407e);
            intent.putExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", z2);
            Log.m105924i("LiveLogoAssistant", "set fromObjectId:" + C61926c.m72691p(this.f18407e));
            C64279c90 c902 = new C64279c90();
            c902.f182444d = "";
            c902.f182445e = "";
            c902.f182446f = z;
            c902.f182447g = -1;
            c902.f182448h = -1;
            c902.f182449i = 1;
            C64686ro2 ro22 = new C64686ro2();
            ro22.f185214e = t3;
            c902.f182450j = ro22;
            C64347eq2 eq22 = new C64347eq2();
            String str2 = null;
            eq22.f183018f = finderObject != null ? finderObject.sessionBuffer : null;
            if (!(finderObject == null || (kf12 = finderObject.object_extend) == null || (hl02 = kf12.f136752n) == null)) {
                str2 = hl02.f134715d;
            }
            eq22.f183019g = str2;
            Log.m105924i("LiveLogoAssistant", "fromObjectId:" + C61926c.m72691p(this.f18407e) + ", jumperSessionBuffer:" + eq22.f183018f);
            StringBuilder sb = new StringBuilder();
            sb.append("finderForwardSource:");
            sb.append(eq22.f183019g);
            Log.m105924i("LiveLogoAssistant", sb.toString());
            c902.f182451n = eq22;
            ((C10649f) C86312j.m106911c(C10649f.class)).E40(this.f18403a, intent, this.f18404b, (C9487b<?>) null, c902, new C4168a(t3, this, finderObject, intent));
            return;
        }
        Log.m105924i("LiveLogoAssistant", "[LiveLogoAssistant]click live icon but username is empty!");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011f, code lost:
        if (r8.equals("999") == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
        if (r8.equals("102") == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0148, code lost:
        if (r8.equals("101") == false) goto L_0x014a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0197  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5051b(java.lang.String r38, com.tencent.p014mm.protocal.protobuf.FinderObject r39, int r40, boolean r41, long r42) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            java.lang.Class<ht1.j5> r7 = ht1.C8777j5.class
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "HABBYGE-MALI, LiveLogoAssistant, context="
            r8.append(r9)
            android.content.Context r9 = r0.f18403a
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r8.append(r9)
            java.lang.String r9 = ", anchorUsername="
            r8.append(r9)
            java.lang.String r9 = r0.f18404b
            r8.append(r9)
            java.lang.String r9 = ", username="
            r8.append(r9)
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r2.contact
            r10 = 0
            if (r9 == 0) goto L_0x003c
            java.lang.String r9 = r9.username
            goto L_0x003d
        L_0x003c:
            r9 = r10
        L_0x003d:
            r8.append(r9)
            java.lang.String r9 = ", nickname="
            r8.append(r9)
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r2.contact
            if (r9 == 0) goto L_0x004c
            java.lang.String r9 = r9.nickname
            goto L_0x004d
        L_0x004c:
            r9 = r10
        L_0x004d:
            r8.append(r9)
            java.lang.String r9 = ", isLiveFeed="
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = ", liveId="
            r8.append(r9)
            te3.c21 r9 = r2.liveInfo
            if (r9 == 0) goto L_0x0067
            long r9 = r9.f182392d
            java.lang.Long r10 = java.lang.Long.valueOf(r9)
        L_0x0067:
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "LiveLogoAssistant"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            ak1.f0$q r8 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_AVATAR_LIVING
            if (r4 == 0) goto L_0x0079
            ak1.f0$q r8 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_LIVE_FEED_AVATAR_LIVING
        L_0x0079:
            r20 = r8
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r8 = r0.f18403a
            bl3.r$a r4 = r4.mo62443b(r8)
            java.lang.Class<ht1.g4> r8 = ht1.C60172g4.class
            bl3.c r4 = r4.mo62447c(r8)
            ht1.g4 r4 = (ht1.C60172g4) r4
            r4.mo12864t3()
            r10 = 0
            java.lang.String r4 = ""
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x00a6
            cm1.s0$b r8 = cm1.C0773s0.f1815b
            cm1.s0 r8 = r8.mo714a()
            java.lang.String r5 = r8.mo713b(r5, r4)
            if (r5 != 0) goto L_0x00a3
            goto L_0x00a6
        L_0x00a3:
            r33 = r5
            goto L_0x00a8
        L_0x00a6:
            r33 = r4
        L_0x00a8:
            java.lang.String r5 = "com.tencent.mm.plugin.finder.ui.FinderHomeUI"
            boolean r5 = gy3.C87412m.m108589b(r5, r1)
            r12 = -1
            java.lang.String r6 = "getService(IHellLiveReport::class.java)"
            if (r5 != 0) goto L_0x01a7
            java.lang.String r5 = "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"
            boolean r5 = gy3.C87412m.m108589b(r5, r1)
            if (r5 == 0) goto L_0x00be
            goto L_0x01a7
        L_0x00be:
            di3.d r5 = di3.C86312j.m106911c(r7)
            ht1.j5 r5 = (ht1.C8777j5) r5
            ak1.f0 r5 = r5.getConfig()
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r5.f151430L
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0208
            java.lang.String r5 = "27"
            boolean r8 = gy3.C87412m.m108589b(r1, r5)
            if (r8 == 0) goto L_0x00e7
            t91.c$a r1 = t91.C64208c.f181951a
            boolean r1 = t91.C64208c.f181962l
            if (r1 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r5 = "9"
        L_0x00e3:
            r32 = r5
            goto L_0x016e
        L_0x00e7:
            java.lang.String r5 = "25"
            boolean r8 = gy3.C87412m.m108589b(r1, r5)
            if (r8 == 0) goto L_0x014d
            java.lang.Class<kq.h> r8 = p185kq.C10383h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            kq.h r8 = (p185kq.C10383h) r8
            kq.l r8 = r8.mo10693DZ()
            z91.b r8 = (z91.C23462b) r8
            java.lang.String r8 = r8.mo36921e()
            java.lang.Class<oq.e> r9 = p217oq.C62120e.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            oq.e r9 = (p217oq.C62120e) r9
            boolean r9 = r9.tu0(r8)
            if (r9 != 0) goto L_0x016c
            if (r8 == 0) goto L_0x014a
            int r1 = r8.hashCode()
            switch(r1) {
                case 48626: goto L_0x0142;
                case 48627: goto L_0x0139;
                case 48690: goto L_0x012d;
                case 48780: goto L_0x0122;
                case 56601: goto L_0x0119;
                default: goto L_0x0118;
            }
        L_0x0118:
            goto L_0x014a
        L_0x0119:
            java.lang.String r1 = "999"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x00e3
            goto L_0x014a
        L_0x0122:
            java.lang.String r1 = "150"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x014a
            java.lang.String r5 = "15"
            goto L_0x00e3
        L_0x012d:
            java.lang.String r1 = "123"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0136
            goto L_0x014a
        L_0x0136:
            java.lang.String r5 = "38"
            goto L_0x00e3
        L_0x0139:
            java.lang.String r1 = "102"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x00e3
            goto L_0x014a
        L_0x0142:
            java.lang.String r1 = "101"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x00e3
        L_0x014a:
            java.lang.String r5 = "39"
            goto L_0x00e3
        L_0x014d:
            java.lang.String r5 = "temp_3"
            boolean r5 = gy3.C87412m.m108589b(r1, r5)
            r8 = 1
            if (r5 == 0) goto L_0x0159
            r5 = 1
            goto L_0x015f
        L_0x0159:
            java.lang.String r5 = "23"
            boolean r5 = gy3.C87412m.m108589b(r1, r5)
        L_0x015f:
            if (r5 == 0) goto L_0x0162
            goto L_0x0168
        L_0x0162:
            java.lang.String r5 = "12"
            boolean r8 = gy3.C87412m.m108589b(r1, r5)
        L_0x0168:
            if (r8 == 0) goto L_0x016c
            ak1.f0$q r20 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_AVATAR_LIVING
        L_0x016c:
            r32 = r1
        L_0x016e:
            r31 = r20
            di3.d r1 = di3.C86312j.m106911c(r7)
            gy3.C87412m.m108593f(r1, r6)
            r21 = r1
            ht1.j5 r21 = (ht1.C8777j5) r21
            long r5 = r2.f164794id
            te3.c21 r1 = r2.liveInfo
            if (r1 == 0) goto L_0x0183
            long r10 = r1.f182392d
        L_0x0183:
            r24 = r10
            java.lang.String r2 = r2.username
            if (r2 != 0) goto L_0x018c
            r26 = r4
            goto L_0x018e
        L_0x018c:
            r26 = r2
        L_0x018e:
            long r2 = (long) r3
            if (r1 == 0) goto L_0x0197
            int r1 = r1.f182393e
            long r7 = (long) r1
            r29 = r7
            goto L_0x0199
        L_0x0197:
            r29 = r12
        L_0x0199:
            r34 = 0
            r35 = 256(0x100, float:3.59E-43)
            r36 = 0
            r22 = r5
            r27 = r2
            ht1.C8777j5.C8778a.m8603d(r21, r22, r24, r26, r27, r29, r31, r32, r33, r34, r35, r36)
            goto L_0x0208
        L_0x01a7:
            di3.d r1 = di3.C86312j.m106911c(r7)
            ht1.j5 r1 = (ht1.C8777j5) r1
            ak1.f0 r1 = r1.getConfig()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.f151431M
            java.lang.String r5 = t91.C64208c.f181960j
            java.lang.Object r1 = r1.get(r5)
            r21 = r1
            java.lang.String r21 = (java.lang.String) r21
            if (r21 == 0) goto L_0x01f2
            di3.d r1 = di3.C86312j.m106911c(r7)
            gy3.C87412m.m108593f(r1, r6)
            ht1.j5 r1 = (ht1.C8777j5) r1
            long r5 = r2.f164794id
            te3.c21 r7 = r2.liveInfo
            if (r7 == 0) goto L_0x01d0
            long r10 = r7.f182392d
        L_0x01d0:
            r14 = r10
            java.lang.String r2 = r2.username
            if (r2 != 0) goto L_0x01d6
            r2 = r4
        L_0x01d6:
            long r3 = (long) r3
            if (r7 == 0) goto L_0x01df
            int r7 = r7.f182393e
            long r7 = (long) r7
            r18 = r7
            goto L_0x01e1
        L_0x01df:
            r18 = r12
        L_0x01e1:
            r23 = 0
            r24 = 256(0x100, float:3.59E-43)
            r25 = 0
            r10 = r1
            r11 = r5
            r13 = r14
            r15 = r2
            r16 = r3
            r22 = r33
            ht1.C8777j5.C8778a.m8603d(r10, r11, r13, r15, r16, r18, r20, r21, r22, r23, r24, r25)
        L_0x01f2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "HABBYGE-MALI, pageObj:"
            r1.append(r2)
            java.lang.String r2 = t91.C64208c.f181960j
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
        L_0x0208:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C4167r7.mo5051b(java.lang.String, com.tencent.mm.protocal.protobuf.FinderObject, int, boolean, long):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4167r7(Context context, String str, int i, boolean z, long j, int i2, C8480h hVar) {
        this(context, str, i, z, (i2 & 16) != 0 ? 0 : j);
    }
}
