package com.tencent.p014mm.plugin.finder.extension.reddot;

import bd1.C39759i;
import bd1.C54447c;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58759o4;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C45770k;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60152b4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import kotlin.Result;
import kotlin.ResultKt;
import o40.C11348f;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import te3.C49272ee1;
import te3.C50134ki1;
import te3.C50401mh0;
import te3.C50414mk0;
import te3.C51978xi1;
import te3.C64373fs0;
import te3.C64586nn1;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.b */
public final class C41409b implements C45770k {

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.b$a */
    public static final class C41410a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C50401mh0 f111496d;

        /* renamed from: e */
        public final /* synthetic */ int f111497e;

        /* renamed from: f */
        public final /* synthetic */ int f111498f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41410a(C50401mh0 mh02, int i, int i2) {
            super(0);
            this.f111496d = mh02;
            this.f111497e = i;
            this.f111498f = i2;
        }

        public Object invoke() {
            return "cmdId=" + this.f111496d.f138028d + " selector=" + this.f111497e + " scene=" + this.f111498f + ", " + this.f111496d.f138030f;
        }
    }

    /* renamed from: a */
    public final void mo64496a(C50401mh0 mh02) {
        C50414mk0 mk02 = new C50414mk0();
        C89349b bVar = mh02.f138029e;
        mk02.parseFrom(bVar != null ? bVar.mo123703f() : null);
        String str = mk02.f138080f;
        if (str == null) {
            str = "";
        }
        Log.m105924i("Finder.AccountSyncHandler", "[processFansCount] finderUsername=" + str + " fansCount " + mk02.f138078d + " fansAddCount:" + mk02.f138079e);
        C66785b bVar2 = C66785b.f191882e;
        if (bVar2.mo90677q1(str)) {
            C54447c cVar = new C54447c(str);
            cVar.mo75251m2().f132484A = mk02.f138078d;
            int i = mk02.f138079e;
            if (i != 0) {
                cVar.field_fansAddCount = i;
            }
            bVar2.mo90672m1(cVar, C39759i.FINDER_SYNC);
        }
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        int i2 = mk02.f138079e;
        if (i2 <= 0) {
            Log.m105924i("Finder.RedDotManager", "[notifyFinderFansAddCount] server error.");
            return;
        }
        Log.m105924i("Finder.RedDotManager", "[notifyFinderFansAddCount] count = " + i2);
        C51978xi1 xi12 = new C51978xi1();
        xi12.f144673h = String.valueOf(C31543z5.m39453c());
        xi12.f144669d = 100000;
        xi12.f144670e = 2;
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184502d = 2;
        nn12.f184506h = 1;
        nn12.f184507i = "AuthorProfileFans";
        nn12.f184503e = i2;
        xi12.f144672g.add(nn12);
        C60152b4.C8759a.m8561a(Nx0, xi12, "notifyFinderFansAddCount", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0089, code lost:
        if ((r8.length() > 0) == true) goto L_0x008d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64497b(te3.C50401mh0 r8) {
        /*
            r7 = this;
            te3.fc1 r0 = new te3.fc1
            r0.<init>()
            pe3.b r8 = r8.f138029e
            if (r8 == 0) goto L_0x000e
            byte[] r8 = r8.mo123703f()
            goto L_0x000f
        L_0x000e:
            r8 = 0
        L_0x000f:
            r0.parseFrom(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "[processGetMentionCount] finderUsername="
            r8.append(r1)
            java.lang.String r1 = r0.f133430s
            r8.append(r1)
            java.lang.String r1 = ", msg like count:"
            r8.append(r1)
            int r1 = r0.f133419e
            r8.append(r1)
            java.lang.String r1 = ", mentionCommentCount:"
            r8.append(r1)
            int r1 = r0.f133420f
            r8.append(r1)
            java.lang.String r1 = ", followCount:"
            r8.append(r1)
            int r1 = r0.f133427p
            r8.append(r1)
            java.lang.String r1 = ", msg count:"
            r8.append(r1)
            int r1 = r0.f133418d
            r8.append(r1)
            java.lang.String r1 = ", normalCount:"
            r8.append(r1)
            int r1 = r0.f133425n
            r8.append(r1)
            java.lang.String r1 = ", systemCount:"
            r8.append(r1)
            int r1 = r0.f133426o
            r8.append(r1)
            java.lang.String r1 = ", latest_notification_briefing:"
            r8.append(r1)
            java.lang.String r1 = r0.f133428q
            r8.append(r1)
            java.lang.String r1 = ", latest_notification_time:"
            r8.append(r1)
            long r1 = r0.f133429r
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "Finder.AccountSyncHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            java.lang.String r8 = r0.f133428q
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L_0x008c
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x0088
            r8 = 1
            goto L_0x0089
        L_0x0088:
            r8 = 0
        L_0x0089:
            if (r8 != r1) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            if (r1 == 0) goto L_0x009e
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LATEST_NOTIFICATION_BRIEF_STRING_SYNC
            java.lang.String r2 = r0.f133428q
            r8.mo119677K(r1, r2)
        L_0x009e:
            long r1 = r0.f133429r
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x00b9
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LATEST_NOTIFICATION_TIME_LONG_SYNC
            long r2 = r0.f133429r
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.mo119677K(r1, r2)
        L_0x00b9:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r8 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            com.tencent.mm.plugin.FinderCommonFeatureService r8 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r8
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r8.Nt0()
            int r2 = r0.f133419e
            int r3 = r0.f133420f
            int r4 = r0.f133427p
            int r5 = r0.f133426o
            java.lang.String r8 = r0.f133430s
            if (r8 != 0) goto L_0x00d3
            java.lang.String r8 = ""
        L_0x00d3:
            r6 = r8
            r1.mo77223D(r2, r3, r4, r5, r6)
            com.tencent.mm.autogen.events.FinderSysNotificationEvent r8 = new com.tencent.mm.autogen.events.FinderSysNotificationEvent
            r8.<init>()
            com.tencent.mm.autogen.events.FinderSysNotificationEvent$a r1 = r8.f107540d
            java.lang.String r2 = r0.f133428q
            r1.f107541a = r2
            long r2 = r0.f133429r
            r1.f107542b = r2
            r8.publish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.C41409b.mo64497b(te3.mh0):void");
    }

    /* renamed from: c */
    public final void mo64498c(C50401mh0 mh02) {
        C49272ee1 ee12 = new C49272ee1();
        C89349b bVar = mh02.f138029e;
        ee12.parseFrom(bVar != null ? bVar.mo123703f() : null);
        Log.m105924i("Finder.AccountSyncHandler", "[processMyAccountSync] finderUsername=" + ee12.f132885e);
        String str = ee12.f132885e;
        if (!(str == null || str.length() == 0)) {
            C66785b bVar2 = C66785b.f191882e;
            String str2 = ee12.f132885e;
            if (str2 == null) {
                str2 = "";
            }
            bVar2.mo90667X1(str2);
        }
    }

    /* renamed from: d */
    public final void mo64499d(C50401mh0 mh02) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC;
        Log.m105924i("Finder.AccountSyncHandler", "[processReInit] ...");
        C50134ki1 ki12 = new C50134ki1();
        C89349b bVar = mh02.f138029e;
        if (bVar != null) {
            ki12.parseFrom(bVar.mo123703f());
            if (ki12.f136806f != 0) {
                C115669n.INSTANCE.mo175913w(1279, 20, 1);
                LinkedList<FinderContact> linkedList = ki12.f136804d;
                C87412m.m108593f(linkedList, "newSelf.self");
                if (!linkedList.isEmpty()) {
                    LinkedList<FinderContact> linkedList2 = ki12.f136804d;
                    C87412m.m108593f(linkedList2, "newSelf.self");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                    for (FinderContact finderContact : linkedList2) {
                        arrayList.add(finderContact.username);
                    }
                    String listToString = Util.listToString(arrayList, ";");
                    Log.m105925i("Finder.AccountSyncHandler", "replace new finder username %s", listToString);
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, listToString);
                } else {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                }
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC, Integer.valueOf(ki12.f136805e));
                int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0);
                Log.m105924i("Finder.AccountSyncHandler", "[processReInit] userVersion=" + j + " userVersion=" + ki12.f136805e);
                int i = ki12.f136805e;
                if (j != i && i != 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_USER_HARD_REINIT_INT_SYNC, 1);
                }
            }
        }
    }

    /* renamed from: i4 */
    public void mo3121i4(C50401mh0 mh02, int i, int i2) {
        Object obj;
        C50401mh0 mh03 = mh02;
        int i3 = i;
        int i4 = i2;
        C87412m.m108594g(mh03, "cmdItem");
        Log.m105924i("Finder.AccountSyncHandler", "[handleCmd] cmdId=" + mh03.f138028d + " selector=" + i3 + " scene=" + i4 + ", " + mh03.f138030f);
        try {
            Result.Companion companion = Result.Companion;
            int i5 = mh03.f138028d;
            if (i5 == 101) {
                mo64497b(mh02);
            } else if (i5 == 106) {
                mo64496a(mh02);
            } else if (i5 == 118) {
                C64373fs0 fs02 = new C64373fs0();
                C89349b bVar = mh03.f138029e;
                fs02.parseFrom(bVar != null ? bVar.mo123703f() : null);
                ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).getClass();
                C58759o4 o4Var = C58759o4.f168229a;
                C58784w3.f168295a.mo83975w1(fs02, Boolean.TRUE, "FinderAccountSyncHandler");
            } else if (i5 == 110) {
                mo64499d(mh02);
            } else if (i5 == 111) {
                mo64498c(mh02);
            }
            obj = Result.m168114constructorimpl(C13598b0.f38549a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        if (r0 != null) {
            Log.printErrStackTrace("Finder.AccountSyncHandler", r0, "", new Object[0]);
            C11348f.C11349a.m11178b(C59319a.f169618b, "Finder.AccountSyncHandler", false, (C11348f.C11352b) null, false, false, new C41410a(mh03, i3, i4), 28, (Object) null);
        }
    }
}
