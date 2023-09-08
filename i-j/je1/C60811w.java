package je1;

import android.content.Context;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import it1.C60625c;
import nj3.C76912y0;
import ob0.C117747y;
import ot1.C11767a;
import te3.C49299el0;
import te3.C49335eu3;
import vq1.C65859p;

/* renamed from: je1.w */
public final class C60811w extends C60625c<C49299el0> {

    /* renamed from: u */
    public static final /* synthetic */ int f173196u = 0;

    /* renamed from: s */
    public final C65859p f173197s;

    /* renamed from: t */
    public final String f173198t = "Finder.CgiFinderFollow";

    /* renamed from: je1.w$a */
    public static final class C9383a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C9383a f29310d = new C9383a();

        public C9383a() {
            super(0);
        }

        public Object invoke() {
            String mMStack = Util.getStack().toString();
            C87412m.m108593f(mMStack, "getStack().toString()");
            return mMStack;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60811w(vq1.C65859p r24, boolean r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            java.lang.String r3 = "action"
            gy3.C87412m.m108594g(r1, r3)
            te3.hj1 r3 = r1.f189387f
            r4 = 2
            r5 = 0
            r0.<init>(r3, r5, r4, r5)
            r0.f173197s = r1
            java.lang.String r3 = "Finder.CgiFinderFollow"
            r0.f173198t = r3
            te3.dl0 r4 = new te3.dl0
            r4.<init>()
            java.lang.String r6 = r1.f189384c
            r4.f182762d = r6
            java.lang.String r6 = r1.f189390i
            int r6 = r6.length()
            r7 = 1
            r8 = 0
            if (r6 <= 0) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            if (r6 == 0) goto L_0x0034
            java.lang.String r6 = r1.f189390i
            r4.f182765g = r6
        L_0x0034:
            int r6 = r1.f189385d
            r4.f182763e = r6
            long r9 = r1.f189386e
            r4.f182764f = r9
            je1.h2 r6 = je1.C46523h2.f125330a
            te3.hj1 r9 = r0.f172731j
            r10 = 3867(0xf1b, float:5.419E-42)
            te3.ig0 r9 = r6.mo71860b(r10, r9)
            r4.f182767i = r9
            te3.hj1 r11 = r0.f172731j
            if (r11 == 0) goto L_0x0054
            int r12 = r11.f134675i
            r13 = 32
            if (r12 != r13) goto L_0x0054
            r12 = 1
            goto L_0x0055
        L_0x0054:
            r12 = 0
        L_0x0055:
            if (r12 != 0) goto L_0x00d1
            if (r11 == 0) goto L_0x0061
            int r11 = r11.f134675i
            r12 = 97
            if (r11 != r12) goto L_0x0061
            r11 = 1
            goto L_0x0062
        L_0x0061:
            r11 = 0
        L_0x0062:
            if (r11 != 0) goto L_0x00d1
            long r11 = r1.f189386e
            di3.d r13 = di3.C86312j.m106911c(r2)
            dp1.y0 r13 = (dp1.C58417y0) r13
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r13.Br0(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "isFromLiveHalfScreen isLiveFeed: "
            r12.append(r13)
            if (r11 == 0) goto L_0x0085
            boolean r13 = r11.isLiveFeed()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            goto L_0x0086
        L_0x0085:
            r13 = r5
        L_0x0086:
            r12.append(r13)
            java.lang.String r13 = " commentScene: "
            r12.append(r13)
            te3.hj1 r13 = r0.f172731j
            if (r13 == 0) goto L_0x0099
            int r13 = r13.f134675i
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x009a
        L_0x0099:
            r13 = r5
        L_0x009a:
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            if (r11 == 0) goto L_0x00ae
            boolean r11 = r11.isLiveFeed()
            if (r11 != r7) goto L_0x00ae
            r11 = 1
            goto L_0x00af
        L_0x00ae:
            r11 = 0
        L_0x00af:
            if (r11 == 0) goto L_0x00c2
            te3.hj1 r11 = r0.f172731j
            if (r11 == 0) goto L_0x00bd
            int r11 = r11.f134675i
            r12 = 136(0x88, float:1.9E-43)
            if (r11 != r12) goto L_0x00bd
            r11 = 1
            goto L_0x00be
        L_0x00bd:
            r11 = 0
        L_0x00be:
            if (r11 == 0) goto L_0x00c2
            r11 = 1
            goto L_0x00c3
        L_0x00c2:
            r11 = 0
        L_0x00c3:
            if (r11 == 0) goto L_0x00c6
            goto L_0x00d1
        L_0x00c6:
            te3.hj1 r11 = r0.f172731j
            if (r11 == 0) goto L_0x00dc
            int r11 = r11.f134675i
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00dd
        L_0x00d1:
            te3.hj1 r11 = r0.f172731j
            if (r11 == 0) goto L_0x00dc
            int r11 = r11.f134677n
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00dd
        L_0x00dc:
            r11 = r5
        L_0x00dd:
            int r11 = r11.intValue()
            r9.f135313e = r11
            te3.hj1 r9 = r0.f172731j
            if (r9 == 0) goto L_0x010f
            java.lang.String r9 = r9.f134681r
            if (r9 == 0) goto L_0x010f
            int r11 = r9.length()
            if (r11 <= 0) goto L_0x00f3
            r11 = 1
            goto L_0x00f4
        L_0x00f3:
            r11 = 0
        L_0x00f4:
            if (r11 == 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r9 = r5
        L_0x00f8:
            if (r9 == 0) goto L_0x010f
            te3.ig0 r11 = r4.f182767i
            if (r11 != 0) goto L_0x00ff
            goto L_0x010f
        L_0x00ff:
            te3.og1 r12 = new te3.og1
            r12.<init>()
            te3.we1 r13 = new te3.we1
            r13.<init>()
            r13.f143989i = r9
            r12.f139153d = r13
            r11.f135324s = r12
        L_0x010f:
            ft1.a r14 = ft1.C59319a.f169618b
            te3.hj1 r9 = r0.f172731j
            if (r9 == 0) goto L_0x011b
            int r9 = r9.f134677n
            if (r9 != 0) goto L_0x011b
            r9 = 1
            goto L_0x011c
        L_0x011b:
            r9 = 0
        L_0x011c:
            r16 = r9 ^ 1
            r17 = 0
            r18 = 0
            r19 = 0
            je1.w$a r20 = je1.C60811w.C9383a.f29310d
            r21 = 28
            r22 = 0
            java.lang.String r15 = "NetSceneFinderFollow_fromCommentScene_0"
            o40.C11348f.C11349a.m11178b(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r11 = r1.f189386e
            te3.ig0 r9 = r4.f182767i
            if (r9 == 0) goto L_0x013e
            int r9 = r9.f135313e
            goto L_0x013f
        L_0x013e:
            r9 = 0
        L_0x013f:
            java.lang.String r2 = r2.mo83281Cu(r11, r9)
            r4.f182768j = r2
            int r2 = r1.f189389h
            if (r2 <= 0) goto L_0x014a
            goto L_0x0152
        L_0x014a:
            te3.hj1 r2 = r0.f172731j
            if (r2 == 0) goto L_0x0151
            int r2 = r2.f134678o
            goto L_0x0152
        L_0x0151:
            r2 = 0
        L_0x0152:
            r4.f182769n = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "enterType="
            r2.append(r9)
            int r9 = r4.f182769n
            r2.append(r9)
            java.lang.String r9 = ", client_udf_kv="
            r2.append(r9)
            te3.ig0 r9 = r4.f182767i
            if (r9 == 0) goto L_0x0178
            te3.og1 r9 = r9.f135324s
            if (r9 == 0) goto L_0x0178
            te3.we1 r9 = r9.f139153d
            if (r9 == 0) goto L_0x0178
            java.lang.String r9 = r9.f143989i
            if (r9 != 0) goto L_0x017a
        L_0x0178:
            java.lang.String r9 = ""
        L_0x017a:
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.lang.Integer r2 = r1.f189392k
            if (r2 == 0) goto L_0x018d
            int r2 = r2.intValue()
            goto L_0x018e
        L_0x018d:
            r2 = 0
        L_0x018e:
            r4.f182771p = r2
            te3.h71 r2 = r1.f189391j
            r4.f182770o = r2
            te3.ig0 r2 = r4.f182767i
            rx3.l r9 = new rx3.l
            if (r2 == 0) goto L_0x019c
            int r8 = r2.f135313e
        L_0x019c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            long r11 = r1.f189386e
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r9.<init>(r8, r11)
            java.util.List r8 = sx3.C26236u.m33719b(r9)
            te3.hj1 r9 = r0.f172731j
            r6.mo71865g(r2, r8, r9)
            int r2 = r1.f189385d
            if (r2 != r7) goto L_0x01f3
            te3.lx4 r2 = new te3.lx4
            r2.<init>()
            te3.qv3 r6 = new te3.qv3
            r6.<init>()
            tc2.g r7 = tc2.C118418g.INSTANCE
            java.lang.String r8 = "ce_feed_follow"
            byte[] r8 = r7.bw0(r8)
            r6.mo73350k(r8)
            r2.f354116e = r6
            te3.qv3 r6 = new te3.qv3
            r6.<init>()
            byte[] r7 = r7.mo175821hd()
            r6.mo73350k(r7)
            r2.f354117f = r6
            te3.ig0 r6 = r4.f182767i
            if (r6 != 0) goto L_0x01e0
            goto L_0x01eb
        L_0x01e0:
            pe3.b r7 = new pe3.b
            byte[] r2 = r2.toByteArray()
            r7.<init>(r2)
            r6.f135314f = r7
        L_0x01eb:
            jm2.f r2 = jm2.C117361f.INSTANCE
            r6 = 540999688(0x203f0008, float:1.617834E-19)
            r2.mo182041q(r6)
        L_0x01f3:
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            r2.f127066a = r4
            te3.el0 r6 = new te3.el0
            r6.<init>()
            te3.ja r7 = new te3.ja
            r7.<init>()
            r6.setBaseResponse(r7)
            te3.ja r7 = r6.getBaseResponse()
            te3.rv3 r8 = new te3.rv3
            r8.<init>()
            r7.f135956e = r8
            r2.f127067b = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderfollow"
            r2.f127068c = r6
            r2.f127069d = r10
            ob0.c r2 = r2.mo72403a()
            r0.mo123453j(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "CgiFinderFollow init, "
            r2.append(r6)
            java.lang.String r6 = r1.f189384c
            r2.append(r6)
            java.lang.String r6 = " opType="
            r2.append(r6)
            int r6 = r4.f182763e
            r2.append(r6)
            java.lang.String r6 = " scene="
            r2.append(r6)
            te3.ig0 r6 = r4.f182767i
            if (r6 == 0) goto L_0x024a
            int r6 = r6.f135313e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x024b
        L_0x024a:
            r6 = r5
        L_0x024b:
            r2.append(r6)
            java.lang.String r6 = " feedId="
            r2.append(r6)
            long r6 = r1.f189386e
            r2.append(r6)
            java.lang.String r6 = " enterType="
            r2.append(r6)
            int r6 = r4.f182769n
            r2.append(r6)
            java.lang.String r6 = " finderUsername="
            r2.append(r6)
            java.lang.String r4 = r4.f182765g
            r2.append(r4)
            java.lang.String r4 = " enterProfileType="
            r2.append(r4)
            te3.hj1 r4 = r0.f172731j
            if (r4 == 0) goto L_0x027b
            int r4 = r4.f134678o
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
        L_0x027b:
            r2.append(r5)
            java.lang.String r4 = ", followScene= "
            r2.append(r4)
            java.lang.Integer r1 = r1.f189392k
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60811w.<init>(vq1.p, boolean):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49299el0 el02 = (C49299el0) eu32;
        C87412m.m108594g(el02, "resp");
        String str2 = this.f173198t;
        Log.m105924i(str2, "errType " + i + ", errCode " + i2 + ", errMsg " + str);
        int i3 = 0;
        if (i == 0 && i2 == 0) {
            FinderContact finderContact = el02.f132993d;
            if (finderContact != null) {
                String str3 = this.f173198t;
                Log.m105924i(str3, "newContact.followFlag: " + Integer.valueOf(finderContact.followFlag));
                C58961d.f168673a.mo84161i(this.f173197s.f189384c, finderContact.followFlag);
                return;
            }
            C58961d.C58963b bVar = C58961d.f168673a;
            C65859p pVar = this.f173197s;
            String str4 = pVar.f189384c;
            if (pVar.f189385d == 1) {
                i3 = C58969q.f168707c2;
            } else {
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
            }
            bVar.mo84161i(str4, i3);
            return;
        }
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            Context context = MMApplicationContext.getContext();
            C76912y0.makeText(context, (CharSequence) "is debug info finderfollow: " + i + ' ' + i2, 1).show();
        }
        C11767a.f34453a.mo11664f(i, i2, str);
        FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        aVar.f9174a = this.f173197s.f189386e;
        aVar.f9175b = 1;
        feedUpdateEvent.publish();
        C58961d.C58963b bVar2 = C58961d.f168673a;
        C65859p pVar2 = this.f173197s;
        String str5 = pVar2.f189384c;
        if (pVar2.f189385d == 1) {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C58969q.f168705a2;
        } else {
            i3 = C58969q.f168707c2;
        }
        bVar2.mo84161i(str5, i3);
    }
}
