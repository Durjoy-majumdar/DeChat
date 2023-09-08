package sp2;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53916l;
import a14.C53921m;
import a14.C53934p0;
import android.os.SystemClock;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94833a;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import d14.C45252f;
import d14.C45253g;
import d14.C45254q0;
import d14.C58042h;
import d14.C58087u0;
import eb0.C31519v2;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C45983e0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import jq2.C98993j;
import jq2.C98995n;
import jq2.C99001u;
import kotlin.Result;
import kotlin.ResultKt;
import lo2.C34323y0;
import lo2.C99554m;
import lo2.C99569s;
import lp2.C61333b;
import ps2.C100897v;
import rx3.C13598b0;
import rx3.C13604l;
import sf0.C48374j0;
import te3.C101820nt3;
import te3.C48952c4;
import te3.C50903q2;
import te3.C51163rv3;
import te3.C52156yq3;
import te3.h64;
import te3.p64;
import te3.t84;
import te3.u84;
import vr2.C102236a0;
import vr2.C102259p;
import vr2.C102260r;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1", mo125469f = "AdPullRequestHelper.kt", mo125470l = {220}, mo125471m = "invokeSuspend")
/* renamed from: sp2.a */
public final class C64132a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181807d;

    /* renamed from: e */
    public /* synthetic */ Object f181808e;

    /* renamed from: f */
    public final /* synthetic */ String f181809f;

    /* renamed from: g */
    public final /* synthetic */ t84 f181810g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2", mo125469f = "AdPullRequestHelper.kt", mo125470l = {223}, mo125471m = "invokeSuspend")
    /* renamed from: sp2.a$b */
    public static final class C64133b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f181811d;

        /* renamed from: e */
        public /* synthetic */ Object f181812e;

        /* renamed from: f */
        public final /* synthetic */ C58087u0<C13604l<Boolean, u84>> f181813f;

        /* renamed from: g */
        public final /* synthetic */ C58087u0<C13604l<Boolean, p64>> f181814g;

        /* renamed from: h */
        public final /* synthetic */ String f181815h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1", mo125469f = "AdPullRequestHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: sp2.a$b$a */
        public static final class C36776a extends C91594j implements C32228q<C13604l<? extends Boolean, ? extends u84>, C13604l<? extends Boolean, ? extends p64>, C15601d<? super C13604l<? extends C13604l<? extends Boolean, ? extends u84>, ? extends C13604l<? extends Boolean, ? extends p64>>>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f97665d;

            /* renamed from: e */
            public /* synthetic */ Object f97666e;

            public C36776a(C15601d<? super C36776a> dVar) {
                super(3, dVar);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
                C36776a aVar = new C36776a((C15601d) obj3);
                aVar.f97665d = (C13604l) obj;
                aVar.f97666e = (C13604l) obj2;
                Object invokeSuspend = aVar.invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
                ResultKt.throwOnFailure(obj);
                C13604l lVar = new C13604l((C13604l) this.f97665d, (C13604l) this.f97666e);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
                return lVar;
            }
        }

        /* renamed from: sp2.a$b$b */
        public static final class C64134b<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ String f181816d;

            /* renamed from: e */
            public final /* synthetic */ C0000n0 f181817e;

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1", mo125469f = "AdPullRequestHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: sp2.a$b$b$a */
            public static final class C64135a extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends Integer, ? extends Boolean>>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C13604l<Boolean, p64> f181818d;

                /* renamed from: e */
                public final /* synthetic */ C13604l<Boolean, u84> f181819e;

                /* renamed from: f */
                public final /* synthetic */ String f181820f;

                /* renamed from: g */
                public final /* synthetic */ C45983e0 f181821g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C64135a(C13604l<Boolean, ? extends p64> lVar, C13604l<Boolean, ? extends u84> lVar2, String str, C45983e0 e0Var, C15601d<? super C64135a> dVar) {
                    super(2, dVar);
                    this.f181818d = lVar;
                    this.f181819e = lVar2;
                    this.f181820f = str;
                    this.f181821g = e0Var;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
                    C64135a aVar = new C64135a(this.f181818d, this.f181819e, this.f181820f, this.f181821g, dVar);
                    SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
                    return aVar;
                }

                public Object invoke(Object obj, Object obj2) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
                    Object invokeSuspend = ((C64135a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
                    return invokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    long j;
                    String str;
                    String str2;
                    C13604l lVar;
                    String str3;
                    String str4;
                    String str5;
                    Long l;
                    String str6;
                    String str7;
                    boolean z;
                    String str8;
                    C13604l<Boolean, p64> lVar2;
                    C101690c cVar;
                    String str9;
                    String str10;
                    C48952c4 c4Var;
                    C13604l lVar3;
                    LinkedList<C48952c4> linkedList;
                    C48952c4 c4Var2;
                    h64 h64;
                    SnsObject snsObject;
                    SnsObject snsObject2;
                    C48952c4 c4Var3;
                    String str11;
                    String str12;
                    boolean z2;
                    String str13;
                    C13604l<Boolean, p64> lVar4;
                    C101690c cVar2;
                    long j2;
                    Integer num;
                    SnsObject snsObject3;
                    SnsObject snsObject4;
                    LinkedList<C48952c4> linkedList2;
                    C48952c4 c4Var4;
                    h64 h642;
                    SnsObject snsObject5;
                    SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
                    ResultKt.throwOnFailure(obj);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C101690c cVar3 = C101690c.f297710a;
                    C13604l<Boolean, p64> lVar5 = this.f181818d;
                    C13604l<Boolean, u84> lVar6 = this.f181819e;
                    String str14 = this.f181820f;
                    SnsMethodCalculate.markStartTimeMs("access$processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    String str15 = "processAdPull";
                    SnsMethodCalculate.markStartTimeMs(str15, "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    C48952c4 f = cVar3.mo141139f(lVar5);
                    C48952c4 h = cVar3.mo141141h(lVar6);
                    String str16 = "AdPullRequestHelper";
                    if (f == null && h == null) {
                        lVar = new C13604l(0, Boolean.FALSE);
                        SnsMethodCalculate.markEndTimeMs(str15, "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    } else if (f == null) {
                        lVar = new C13604l(5, Boolean.FALSE);
                        SnsMethodCalculate.markEndTimeMs(str15, "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    } else if (h == null) {
                        lVar = new C13604l(6, Boolean.FALSE);
                        SnsMethodCalculate.markEndTimeMs(str15, "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    } else {
                        ADInfo e = cVar3.mo141138e(f);
                        ADInfo e2 = cVar3.mo141138e(h);
                        str2 = "invokeSuspend";
                        str = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1";
                        boolean z3 = e2.score < e.score;
                        if (cVar3.mo141142i(str14)) {
                            Log.m105924i(str16, "uuid is already exposed!  uuid = " + str14);
                            lVar = z3 ? new C13604l(4, Boolean.FALSE) : new C13604l(3, Boolean.FALSE);
                            SnsMethodCalculate.markEndTimeMs(str15, "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                        } else {
                            Log.m105924i(str16, " pull, timeline scores is = " + e.score + ", " + e2.score);
                            if (!z3) {
                                Log.m105924i(str16, "adPull score is lower! ");
                                lVar = new C13604l(1, Boolean.FALSE);
                                SnsMethodCalculate.markEndTimeMs(str15, "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                            } else {
                                p64 p64 = (p64) lVar5.f38556e;
                                if (p64 == null || (linkedList2 = p64.f139609d) == null || (c4Var4 = linkedList2.get(0)) == null || (h642 = c4Var4.f131489d) == null || (snsObject5 = h642.f134464d) == null) {
                                    j = elapsedRealtime;
                                    l = null;
                                } else {
                                    j = elapsedRealtime;
                                    l = Long.valueOf(snsObject5.f283891Id);
                                }
                                h64 h643 = h.f131489d;
                                if (C87412m.m108589b(l, (h643 == null || (snsObject4 = h643.f134464d) == null) ? null : Long.valueOf(snsObject4.f283891Id))) {
                                    Log.m105924i(str16, "snsId is equals!");
                                    lVar = new C13604l(7, Boolean.FALSE);
                                    SnsMethodCalculate.markEndTimeMs(str15, "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                                    str5 = "access$processAdPull";
                                    str3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                                    str4 = str16;
                                    SnsMethodCalculate.markEndTimeMs(str5, str3);
                                    this.f181821g.f124000d = SystemClock.elapsedRealtime() - j;
                                    Log.m105924i(str4, "end process! cost = " + this.f181821g.f124000d);
                                    SnsMethodCalculate.markEndTimeMs(str2, str);
                                    return lVar;
                                }
                                p64 p642 = (p64) lVar5.f38556e;
                                LinkedList<C48952c4> linkedList3 = p642 != null ? p642.f139609d : null;
                                SnsMethodCalculate.markStartTimeMs("insertAdByPull", "com.tencent.mm.plugin.sns.model.AdPullStorageLogic");
                                if (WeChatBrands.Business.Entries.MomentAds.banned()) {
                                    Log.m105928w("AdPullStorageLogic", "insert, forbid ad");
                                    SnsMethodCalculate.markEndTimeMs("insertAdByPull", "com.tencent.mm.plugin.sns.model.AdPullStorageLogic");
                                    z = z3;
                                    cVar = cVar3;
                                    lVar2 = lVar5;
                                    str6 = str14;
                                    str10 = "access$processAdPull";
                                    str9 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                                    str8 = str15;
                                    c4Var = h;
                                    str7 = str16;
                                } else if (linkedList3 != null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("adList[");
                                    int size = linkedList3.size();
                                    str10 = "access$processAdPull";
                                    str9 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                                    int i = 0;
                                    boolean z4 = false;
                                    while (i < size) {
                                        int i2 = size;
                                        C48952c4 c4Var5 = linkedList3.get(i);
                                        if (c4Var5 == null) {
                                            Log.m105924i("AdPullStorageLogic", "ad is null");
                                        } else {
                                            h64 h644 = c4Var5.f131489d;
                                            if (h644 == null) {
                                                Log.m105924i("AdPullStorageLogic", "item.SnsADObject is null");
                                            } else if (h644.f134464d == null) {
                                                Log.m105924i("AdPullStorageLogic", "item.SnsADObject.SnsObject is null");
                                            } else {
                                                h64 h645 = h.f131489d;
                                                if (h645 == null || (snsObject3 = h645.f134464d) == null) {
                                                    cVar2 = cVar3;
                                                    lVar4 = lVar5;
                                                    j2 = 0;
                                                } else {
                                                    cVar2 = cVar3;
                                                    lVar4 = lVar5;
                                                    j2 = snsObject3.f283891Id;
                                                }
                                                AdSnsInfo jo = C94866e1.zx0().mo139864jo(j2);
                                                if (jo != null) {
                                                    str13 = str15;
                                                    num = Integer.valueOf(jo.field_createTime);
                                                } else {
                                                    str13 = str15;
                                                    num = null;
                                                }
                                                if (num == null) {
                                                    Log.m105924i("AdPullStorageLogic", "createTime is null ??!! orgAdId=" + j2);
                                                    z2 = z3;
                                                    str11 = str14;
                                                    c4Var3 = h;
                                                    str12 = str16;
                                                    i++;
                                                    size = i2;
                                                    cVar3 = cVar2;
                                                    lVar5 = lVar4;
                                                    str15 = str13;
                                                    z3 = z2;
                                                    str16 = str12;
                                                    str14 = str11;
                                                    h = c4Var3;
                                                } else {
                                                    String g = C48374j0.m53718g(c4Var5.f131490e);
                                                    String g2 = C48374j0.m53718g(c4Var5.f131489d.f134465e);
                                                    String f2 = C48374j0.m53717f(c4Var5.f131489d.f134464d.ObjectDesc);
                                                    z2 = z3;
                                                    ADInfo aDInfo = new ADInfo(g);
                                                    str11 = str14;
                                                    str12 = str16;
                                                    Log.m105925i("AdPullStorageLogic", "insert ad, skXml %s, adXml %s, snsXml %s", g, g2, f2);
                                                    C99569s.m129965g(aDInfo.adIPv4Url);
                                                    String q0 = C102236a0.m134765q0(c4Var5.f131489d.f134464d.f283891Id);
                                                    try {
                                                        sb.append(q0);
                                                        sb.append(",");
                                                        sb.append(aDInfo.ad_sns_pos);
                                                        sb.append("|");
                                                    } catch (Exception e3) {
                                                        Log.m105920e("AdPullStorageLogic", "log exp=" + e3);
                                                    }
                                                    Log.m105924i("AdPullStorageLogic", "insert ad, create adinfo time  " + num + " pos " + aDInfo.ad_sns_pos);
                                                    c4Var3 = h;
                                                    int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
                                                    Log.m105924i("AdPullStorageLogic", "insert ad, gettime " + currentTimeMillis);
                                                    C94833a.m120162o(c4Var5, num.intValue(), currentTimeMillis);
                                                    AdSnsInfo jo4 = C94866e1.zx0().mo139864jo(c4Var5.f131489d.f134464d.f283891Id);
                                                    if (jo4 != null) {
                                                        Log.m105924i("AdPullStorageLogic", "insert ad, snsId=" + q0 + ", exposureTime=" + jo4.field_exposureTime + ", , expouseCnt=" + jo4.field_exposureCount + ", isExposued=" + jo4.isExposured() + ", adDupSnsIdDel=" + aDInfo.adDupSnsIdDel);
                                                        if (aDInfo.adDupSnsIdDel == 1) {
                                                            C99554m.m129937b(jo4);
                                                        }
                                                        C50903q2 remindInfoGroup = jo4.getRemindInfoGroup();
                                                        if (remindInfoGroup == null) {
                                                            remindInfoGroup = new C50903q2();
                                                        }
                                                        C52156yq3 yq32 = c4Var5.f131492g;
                                                        remindInfoGroup.f140095d = yq32;
                                                        if (yq32 != null) {
                                                            Log.m105925i("AdPullStorageLogic", "insert ad, update timeline remind info , aid64:%d, aid:%d", Long.valueOf(yq32.f145470i), Integer.valueOf(remindInfoGroup.f140095d.f145465d));
                                                        }
                                                        jo4.setRemindInfoGroup(remindInfoGroup);
                                                        jo4.setLocalVisible();
                                                        C94866e1.zx0().replace(jo4);
                                                        SnsInfo convertToSnsInfo = jo4.convertToSnsInfo();
                                                        if (C98993j.m128899a(convertToSnsInfo)) {
                                                            C94866e1.hy0().mo131026l(convertToSnsInfo);
                                                            z4 = true;
                                                        }
                                                    }
                                                    C94833a.m120168u(c4Var5.f131489d.f134464d.f283891Id, aDInfo);
                                                    try {
                                                        String q05 = C102236a0.m134765q0(c4Var5.f131489d.f134464d.f283891Id);
                                                        if (!C98995n.m128906b(aDInfo, q05)) {
                                                            try {
                                                                C98995n.m128907c(1, q05, aDInfo, c4Var5.f131489d.f134464d);
                                                            } catch (Throwable th) {
                                                                th = th;
                                                            }
                                                            i++;
                                                            size = i2;
                                                            cVar3 = cVar2;
                                                            lVar5 = lVar4;
                                                            str15 = str13;
                                                            z3 = z2;
                                                            str16 = str12;
                                                            str14 = str11;
                                                            h = c4Var3;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        Log.m105920e("AdPullStorageLogic", th.toString());
                                                        i++;
                                                        size = i2;
                                                        cVar3 = cVar2;
                                                        lVar5 = lVar4;
                                                        str15 = str13;
                                                        z3 = z2;
                                                        str16 = str12;
                                                        str14 = str11;
                                                        h = c4Var3;
                                                    }
                                                    i++;
                                                    size = i2;
                                                    cVar3 = cVar2;
                                                    lVar5 = lVar4;
                                                    str15 = str13;
                                                    z3 = z2;
                                                    str16 = str12;
                                                    str14 = str11;
                                                    h = c4Var3;
                                                }
                                            }
                                        }
                                        cVar2 = cVar3;
                                        lVar4 = lVar5;
                                        str13 = str15;
                                        z2 = z3;
                                        str11 = str14;
                                        c4Var3 = h;
                                        str12 = str16;
                                        i++;
                                        size = i2;
                                        cVar3 = cVar2;
                                        lVar5 = lVar4;
                                        str15 = str13;
                                        z3 = z2;
                                        str16 = str12;
                                        str14 = str11;
                                        h = c4Var3;
                                    }
                                    z = z3;
                                    cVar = cVar3;
                                    lVar2 = lVar5;
                                    str6 = str14;
                                    str8 = str15;
                                    C48952c4 c4Var6 = h;
                                    str7 = str16;
                                    if (z4) {
                                        Log.m105924i("AdPullStorageLogic", "the on line video preload start in AdSnsInfoStorageLogic ");
                                        C94866e1.hy0().mo131035u();
                                    }
                                    try {
                                        sb.append("],  ");
                                        Log.m105924i("AdPullStorageLogic", "insert ad, " + sb);
                                    } catch (Exception e4) {
                                        Log.m105920e("AdPullStorageLogic", "log exp=" + e4);
                                    }
                                    SnsMethodCalculate.markEndTimeMs("insertAdByPull", "com.tencent.mm.plugin.sns.model.AdPullStorageLogic");
                                    c4Var = c4Var6;
                                } else {
                                    z = z3;
                                    cVar = cVar3;
                                    lVar2 = lVar5;
                                    str6 = str14;
                                    str10 = "access$processAdPull";
                                    str9 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                                    str8 = str15;
                                    str7 = str16;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("adlist is ");
                                    sb4.append(linkedList3);
                                    sb4.append(", originAd is ");
                                    c4Var = h;
                                    sb4.append(c4Var);
                                    Log.m105928w("AdPullStorageLogic", sb4.toString());
                                    SnsMethodCalculate.markEndTimeMs("insertAdByPull", "com.tencent.mm.plugin.sns.model.AdPullStorageLogic");
                                }
                                h64 h646 = c4Var.f131489d;
                                long j3 = (h646 == null || (snsObject2 = h646.f134464d) == null) ? 0 : snsObject2.f283891Id;
                                if (cVar.mo141142i(str6)) {
                                    str4 = str7;
                                    Log.m105928w(str4, "adPull inserted in subThread but ad is exposed in mainThread! ");
                                    C115669n.INSTANCE.mo175911u(1920, 21);
                                    p64 p643 = (p64) lVar2.f38556e;
                                    Long valueOf = (p643 == null || (linkedList = p643.f139609d) == null || (c4Var2 = linkedList.get(0)) == null || (h64 = c4Var2.f131489d) == null || (snsObject = h64.f134464d) == null) ? null : Long.valueOf(snsObject.f283891Id);
                                    if (valueOf != null) {
                                        C94833a.m120153f(valueOf.longValue(), -1);
                                    }
                                    lVar3 = z ? new C13604l(4, Boolean.TRUE) : new C13604l(3, Boolean.TRUE);
                                    str3 = str9;
                                    SnsMethodCalculate.markEndTimeMs(str8, str3);
                                } else {
                                    str3 = str9;
                                    String str17 = str8;
                                    str4 = str7;
                                    if (j3 == 0) {
                                        Log.m105924i(str4, "delId is null! ");
                                    } else {
                                        C94833a.m120153f(j3, -1);
                                    }
                                    lVar3 = new C13604l(2, Boolean.TRUE);
                                    SnsMethodCalculate.markEndTimeMs(str17, str3);
                                }
                                str5 = str10;
                                SnsMethodCalculate.markEndTimeMs(str5, str3);
                                this.f181821g.f124000d = SystemClock.elapsedRealtime() - j;
                                Log.m105924i(str4, "end process! cost = " + this.f181821g.f124000d);
                                SnsMethodCalculate.markEndTimeMs(str2, str);
                                return lVar;
                            }
                        }
                        j = elapsedRealtime;
                        str5 = "access$processAdPull";
                        str3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                        str4 = str16;
                        SnsMethodCalculate.markEndTimeMs(str5, str3);
                        this.f181821g.f124000d = SystemClock.elapsedRealtime() - j;
                        Log.m105924i(str4, "end process! cost = " + this.f181821g.f124000d);
                        SnsMethodCalculate.markEndTimeMs(str2, str);
                        return lVar;
                    }
                    str2 = "invokeSuspend";
                    str = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1";
                    j = elapsedRealtime;
                    str5 = "access$processAdPull";
                    str3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                    str4 = str16;
                    SnsMethodCalculate.markEndTimeMs(str5, str3);
                    this.f181821g.f124000d = SystemClock.elapsedRealtime() - j;
                    Log.m105924i(str4, "end process! cost = " + this.f181821g.f124000d);
                    SnsMethodCalculate.markEndTimeMs(str2, str);
                    return lVar;
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3", mo125469f = "AdPullRequestHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: sp2.a$b$b$b */
            public static final class C64136b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C13604l<Boolean, p64> f181822d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C64136b(C13604l<Boolean, ? extends p64> lVar, C15601d<? super C64136b> dVar) {
                    super(2, dVar);
                    this.f181822d = lVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
                    C64136b bVar = new C64136b(this.f181822d, dVar);
                    SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
                    return bVar;
                }

                public Object invoke(Object obj, Object obj2) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
                    Object invokeSuspend = ((C64136b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
                    return invokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    SnsObject snsObject;
                    SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
                    ResultKt.throwOnFailure(obj);
                    Log.m105924i("AdPullRequestHelper", "tryPreloadResource !");
                    C101690c cVar = C101690c.f297710a;
                    C13604l<Boolean, p64> lVar = this.f181822d;
                    SnsMethodCalculate.markStartTimeMs("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    C48952c4 f = cVar.mo141139f(lVar);
                    SnsMethodCalculate.markEndTimeMs("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    SnsMethodCalculate.markStartTimeMs("access$tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    SnsMethodCalculate.markStartTimeMs("tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    if (f == null) {
                        SnsMethodCalculate.markEndTimeMs("tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    } else {
                        h64 h64 = f.f131489d;
                        String g = C48374j0.m53718g(h64 != null ? h64.f134465e : null);
                        if (g == null) {
                            g = "";
                        }
                        String str = f.f131489d.f134464d.Username;
                        C87412m.m108593f(str, "item.SnsADObject.SnsObject.Username");
                        if (!Util.isNullOrNil(str)) {
                            boolean J = C102260r.m134841J(g);
                            StringBuilder sb = new StringBuilder();
                            sb.append("checkUpdate contact:");
                            sb.append(str);
                            sb.append(", isUsePreferedInfo=");
                            sb.append(J);
                            sb.append(", snsId=");
                            h64 h642 = f.f131489d;
                            sb.append(C102236a0.m134763p0((h642 == null || (snsObject = h642.f134464d) == null) ? 0 : snsObject.f283891Id));
                            Log.m105924i("AdPullRequestHelper", sb.toString());
                            if (!J) {
                                C31519v2.m39436a().mo55987c(str, "");
                                ((C119157j) C119157j.f356862d).mo183878i(new C48460d(str), 10000);
                            }
                        }
                        C99001u.m128918d(f, 1);
                        C100897v.m132253b(f, false);
                        SnsMethodCalculate.markEndTimeMs("tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    }
                    SnsMethodCalculate.markEndTimeMs("access$tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
                    return b0Var;
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4", mo125469f = "AdPullRequestHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: sp2.a$b$b$c */
            public static final class C64137c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ int f181823d;

                /* renamed from: e */
                public final /* synthetic */ ADInfo f181824e;

                /* renamed from: f */
                public final /* synthetic */ C48952c4 f181825f;

                /* renamed from: g */
                public final /* synthetic */ ADInfo f181826g;

                /* renamed from: h */
                public final /* synthetic */ C48952c4 f181827h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C64137c(int i, ADInfo aDInfo, C48952c4 c4Var, ADInfo aDInfo2, C48952c4 c4Var2, C15601d<? super C64137c> dVar) {
                    super(2, dVar);
                    this.f181823d = i;
                    this.f181824e = aDInfo;
                    this.f181825f = c4Var;
                    this.f181826g = aDInfo2;
                    this.f181827h = c4Var2;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
                    C64137c cVar = new C64137c(this.f181823d, this.f181824e, this.f181825f, this.f181826g, this.f181827h, dVar);
                    SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
                    return cVar;
                }

                public Object invoke(Object obj, Object obj2) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
                    Object invokeSuspend = ((C64137c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
                    return invokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    h64 h64;
                    SnsObject snsObject;
                    h64 h642;
                    SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
                    ResultKt.throwOnFailure(obj);
                    C101690c cVar = C101690c.f297710a;
                    int i = this.f181823d;
                    ADInfo aDInfo = this.f181824e;
                    C48952c4 c4Var = this.f181825f;
                    ADInfo aDInfo2 = this.f181826g;
                    C48952c4 c4Var2 = this.f181827h;
                    SnsMethodCalculate.markStartTimeMs("access$reportAnalyse", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    SnsMethodCalculate.markStartTimeMs("reportAnalyse", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    if (i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7) {
                        Log.m105924i("AdPullRequestHelper", "reportAnalyse of " + i + " !");
                        C34323y0.C34324a b = C34323y0.C34324a.m40328b();
                        C13604l lVar = i == 2 ? new C13604l(aDInfo, c4Var) : new C13604l(aDInfo2, c4Var2);
                        ADInfo aDInfo3 = (ADInfo) lVar.f38555d;
                        C48952c4 c4Var3 = (C48952c4) lVar.f38556e;
                        C51163rv3 rv32 = null;
                        String str = aDInfo3 != null ? aDInfo3.uxInfo : null;
                        String str2 = "";
                        if (str == null) {
                            str = str2;
                        }
                        b.mo59560a(str, c4Var3 != null ? cVar.mo141140g(c4Var3) : str2, 4, 0);
                        b.mo59561c();
                        if (!(c4Var3 == null || (h642 = c4Var3.f131489d) == null)) {
                            rv32 = h642.f134465e;
                        }
                        String g = C48374j0.m53718g(rv32);
                        if (g != null) {
                            str2 = g;
                        }
                        C102259p.m134829b(6, (c4Var3 == null || (h64 = c4Var3.f131489d) == null || (snsObject = h64.f134464d) == null) ? 0 : snsObject.f283891Id, aDInfo3, new ADXml(str2));
                    }
                    SnsMethodCalculate.markEndTimeMs("reportAnalyse", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    SnsMethodCalculate.markEndTimeMs("access$reportAnalyse", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
                    return b0Var;
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2", mo125469f = "AdPullRequestHelper.kt", mo125470l = {257, 276, 284}, mo125471m = "emit")
            /* renamed from: sp2.a$b$b$d */
            public static final class C64138d extends C66704d {

                /* renamed from: d */
                public Object f181828d;

                /* renamed from: e */
                public Object f181829e;

                /* renamed from: f */
                public Object f181830f;

                /* renamed from: g */
                public Object f181831g;

                /* renamed from: h */
                public Object f181832h;

                /* renamed from: i */
                public Object f181833i;

                /* renamed from: j */
                public Object f181834j;

                /* renamed from: n */
                public Object f181835n;

                /* renamed from: o */
                public int f181836o;

                /* renamed from: p */
                public /* synthetic */ Object f181837p;

                /* renamed from: q */
                public final /* synthetic */ C64134b<T> f181838q;

                /* renamed from: r */
                public int f181839r;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C64138d(C64134b<? super T> bVar, C15601d<? super C64138d> dVar) {
                    super(dVar);
                    this.f181838q = bVar;
                }

                public final Object invokeSuspend(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$emit$1");
                    this.f181837p = obj;
                    this.f181839r |= Integer.MIN_VALUE;
                    Object a = this.f181838q.mo88867a((C13604l<? extends C13604l<Boolean, ? extends u84>, ? extends C13604l<Boolean, ? extends p64>>) null, this);
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$emit$1");
                    return a;
                }
            }

            public C64134b(String str, C0000n0 n0Var) {
                this.f181816d = str;
                this.f181817e = n0Var;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:110:0x03b8, code lost:
                if (r1 != 7) goto L_0x03c8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x027c, code lost:
                if (a14.C53895h.m60469g(r2, r7, r3) == r4) goto L_0x02d3;
             */
            /* JADX WARNING: Removed duplicated region for block: B:125:0x0445  */
            /* JADX WARNING: Removed duplicated region for block: B:126:0x0447  */
            /* JADX WARNING: Removed duplicated region for block: B:129:0x044d  */
            /* JADX WARNING: Removed duplicated region for block: B:132:0x04f1 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:136:0x051c  */
            /* JADX WARNING: Removed duplicated region for block: B:137:0x0521  */
            /* JADX WARNING: Removed duplicated region for block: B:156:0x05ce  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x00c2  */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x021d  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x02db  */
            /* JADX WARNING: Removed duplicated region for block: B:75:0x02e5  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo88867a(rx3.C13604l<? extends rx3.C13604l<java.lang.Boolean, ? extends te3.u84>, ? extends rx3.C13604l<java.lang.Boolean, ? extends te3.p64>> r30, wx3.C15601d<? super rx3.C13598b0> r31) {
                /*
                    r29 = this;
                    r1 = r29
                    r0 = r30
                    r2 = r31
                    java.lang.String r3 = "emit"
                    java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    boolean r3 = r2 instanceof sp2.C64132a.C64133b.C64134b.C64138d
                    if (r3 == 0) goto L_0x0020
                    r3 = r2
                    sp2.a$b$b$d r3 = (sp2.C64132a.C64133b.C64134b.C64138d) r3
                    int r4 = r3.f181839r
                    r5 = -2147483648(0xffffffff80000000, float:-0.0)
                    r6 = r4 & r5
                    if (r6 == 0) goto L_0x0020
                    int r4 = r4 - r5
                    r3.f181839r = r4
                    goto L_0x0025
                L_0x0020:
                    sp2.a$b$b$d r3 = new sp2.a$b$b$d
                    r3.<init>(r1, r2)
                L_0x0025:
                    java.lang.Object r2 = r3.f181837p
                    xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r5 = r3.f181839r
                    r6 = 3
                    r7 = 1920(0x780, float:2.69E-42)
                    r8 = 1
                    r9 = 2
                    r10 = 0
                    if (r5 == 0) goto L_0x00c2
                    if (r5 == r8) goto L_0x009d
                    if (r5 == r9) goto L_0x006c
                    if (r5 != r6) goto L_0x005d
                    int r0 = r3.f181836o
                    java.lang.Object r4 = r3.f181835n
                    gy3.e0 r4 = (gy3.C45983e0) r4
                    java.lang.Object r5 = r3.f181834j
                    com.tencent.mm.plugin.sns.storage.ADInfo r5 = (com.tencent.p014mm.plugin.sns.storage.ADInfo) r5
                    java.lang.Object r6 = r3.f181833i
                    te3.c4 r6 = (te3.C48952c4) r6
                    java.lang.Object r11 = r3.f181831g
                    te3.c4 r11 = (te3.C48952c4) r11
                    java.lang.Object r12 = r3.f181830f
                    rx3.l r12 = (rx3.C13604l) r12
                    java.lang.Object r13 = r3.f181829e
                    rx3.l r13 = (rx3.C13604l) r13
                    java.lang.Object r3 = r3.f181828d
                    sp2.a$b$b r3 = (sp2.C64132a.C64133b.C64134b) r3
                    kotlin.ResultKt.throwOnFailure(r2)
                L_0x005a:
                    r1 = r0
                    goto L_0x02e3
                L_0x005d:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    java.lang.String r2 = "emit"
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    throw r0
                L_0x006c:
                    int r0 = r3.f181836o
                    java.lang.Object r5 = r3.f181835n
                    gy3.e0 r5 = (gy3.C45983e0) r5
                    java.lang.Object r11 = r3.f181834j
                    com.tencent.mm.plugin.sns.storage.ADInfo r11 = (com.tencent.p014mm.plugin.sns.storage.ADInfo) r11
                    java.lang.Object r12 = r3.f181833i
                    te3.c4 r12 = (te3.C48952c4) r12
                    java.lang.Object r13 = r3.f181832h
                    com.tencent.mm.plugin.sns.storage.ADInfo r13 = (com.tencent.p014mm.plugin.sns.storage.ADInfo) r13
                    java.lang.Object r14 = r3.f181831g
                    te3.c4 r14 = (te3.C48952c4) r14
                    java.lang.Object r15 = r3.f181830f
                    rx3.l r15 = (rx3.C13604l) r15
                    java.lang.Object r6 = r3.f181829e
                    rx3.l r6 = (rx3.C13604l) r6
                    java.lang.Object r9 = r3.f181828d
                    sp2.a$b$b r9 = (sp2.C64132a.C64133b.C64134b) r9
                    kotlin.ResultKt.throwOnFailure(r2)
                    r2 = r9
                    r7 = r12
                    r12 = r13
                    r13 = r6
                    r6 = r11
                    r28 = r15
                    r15 = r14
                    r14 = r28
                    goto L_0x0292
                L_0x009d:
                    java.lang.Object r0 = r3.f181835n
                    gy3.e0 r0 = (gy3.C45983e0) r0
                    java.lang.Object r5 = r3.f181834j
                    com.tencent.mm.plugin.sns.storage.ADInfo r5 = (com.tencent.p014mm.plugin.sns.storage.ADInfo) r5
                    java.lang.Object r6 = r3.f181833i
                    te3.c4 r6 = (te3.C48952c4) r6
                    java.lang.Object r9 = r3.f181832h
                    com.tencent.mm.plugin.sns.storage.ADInfo r9 = (com.tencent.p014mm.plugin.sns.storage.ADInfo) r9
                    java.lang.Object r11 = r3.f181831g
                    te3.c4 r11 = (te3.C48952c4) r11
                    java.lang.Object r12 = r3.f181830f
                    rx3.l r12 = (rx3.C13604l) r12
                    java.lang.Object r13 = r3.f181829e
                    rx3.l r13 = (rx3.C13604l) r13
                    java.lang.Object r14 = r3.f181828d
                    sp2.a$b$b r14 = (sp2.C64132a.C64133b.C64134b) r14
                    kotlin.ResultKt.throwOnFailure(r2)
                    goto L_0x0209
                L_0x00c2:
                    kotlin.ResultKt.throwOnFailure(r2)
                    A r2 = r0.f38555d
                    r13 = r2
                    rx3.l r13 = (rx3.C13604l) r13
                    B r0 = r0.f38556e
                    r12 = r0
                    rx3.l r12 = (rx3.C13604l) r12
                    java.lang.String r0 = "AdPullRequestHelper"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "collect in async !  "
                    r2.append(r5)
                    r2.append(r13)
                    java.lang.String r5 = ",  "
                    r2.append(r5)
                    r2.append(r12)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                    A r0 = r13.f38555d
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x05e1
                    A r0 = r12.f38555d
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x05e1
                    sp2.c r0 = sp2.C101690c.f297710a
                    java.lang.String r2 = "access$getTlObjOrNull"
                    java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
                    te3.c4 r11 = r0.mo141141h(r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
                    if (r11 == 0) goto L_0x0122
                    java.lang.String r2 = "access$getAdInfoObj"
                    java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
                    com.tencent.mm.plugin.sns.storage.ADInfo r6 = r0.mo141138e(r11)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
                    goto L_0x0123
                L_0x0122:
                    r6 = r10
                L_0x0123:
                    if (r6 == 0) goto L_0x0128
                    java.lang.String r2 = r6.sessionKeyAd
                    goto L_0x0129
                L_0x0128:
                    r2 = r10
                L_0x0129:
                    java.lang.String r5 = "access$getAdPullObjOrNull"
                    java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r9)
                    te3.c4 r14 = r0.mo141139f(r12)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)
                    if (r14 == 0) goto L_0x0149
                    java.lang.String r5 = "access$getAdInfoObj"
                    java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r9)
                    com.tencent.mm.plugin.sns.storage.ADInfo r0 = r0.mo141138e(r14)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)
                    r5 = r0
                    goto L_0x014a
                L_0x0149:
                    r5 = r10
                L_0x014a:
                    if (r5 == 0) goto L_0x014f
                    java.lang.String r0 = r5.sessionKeyAd
                    goto L_0x0150
                L_0x014f:
                    r0 = r10
                L_0x0150:
                    if (r11 == 0) goto L_0x0191
                    java.lang.String r9 = r1.f181816d
                    boolean r9 = gy3.C87412m.m108589b(r9, r2)
                    if (r9 != 0) goto L_0x0191
                    java.lang.String r0 = "AdPullRequestHelper"
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "session is not match!  uuid = "
                    r3.append(r4)
                    java.lang.String r4 = r1.f181816d
                    r3.append(r4)
                    java.lang.String r4 = " sessionKeyAdByTl = "
                    r3.append(r4)
                    r3.append(r2)
                    java.lang.String r2 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
                    com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r2 = 22
                    r0.mo175911u(r7, r2)
                    a14.n0 r0 = r1.f181817e
                    a14.C53930o0.m60558e(r0, r10, r8, r10)
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    java.lang.String r2 = "emit"
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    return r0
                L_0x0191:
                    if (r14 == 0) goto L_0x01d2
                    java.lang.String r2 = r1.f181816d
                    boolean r2 = gy3.C87412m.m108589b(r2, r0)
                    if (r2 != 0) goto L_0x01d2
                    java.lang.String r2 = "AdPullRequestHelper"
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "session is not match!  uuid = "
                    r3.append(r4)
                    java.lang.String r4 = r1.f181816d
                    r3.append(r4)
                    java.lang.String r4 = " sessionKeyAdByPull = "
                    r3.append(r4)
                    r3.append(r0)
                    java.lang.String r0 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                    com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r2 = 23
                    r0.mo175911u(r7, r2)
                    a14.n0 r0 = r1.f181817e
                    a14.C53930o0.m60558e(r0, r10, r8, r10)
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    java.lang.String r2 = "emit"
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    return r0
                L_0x01d2:
                    gy3.e0 r0 = new gy3.e0
                    r0.<init>()
                    a14.h0 r2 = a14.C53872d1.f151119c
                    sp2.a$b$b$a r9 = new sp2.a$b$b$a
                    java.lang.String r15 = r1.f181816d
                    r21 = 0
                    r16 = r9
                    r17 = r12
                    r18 = r13
                    r19 = r15
                    r20 = r0
                    r16.<init>(r17, r18, r19, r20, r21)
                    r3.f181828d = r1
                    r3.f181829e = r13
                    r3.f181830f = r12
                    r3.f181831g = r11
                    r3.f181832h = r6
                    r3.f181833i = r14
                    r3.f181834j = r5
                    r3.f181835n = r0
                    r3.f181839r = r8
                    java.lang.Object r2 = a14.C53895h.m60469g(r2, r9, r3)
                    if (r2 != r4) goto L_0x0206
                    goto L_0x02d3
                L_0x0206:
                    r9 = r6
                    r6 = r14
                    r14 = r1
                L_0x0209:
                    rx3.l r2 = (rx3.C13604l) r2
                    A r15 = r2.f38555d
                    java.lang.Number r15 = (java.lang.Number) r15
                    int r15 = r15.intValue()
                    B r2 = r2.f38556e
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x028a
                    java.lang.String r2 = "AdPullRequestHelper"
                    java.lang.String r7 = "refresh UI~"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
                    sp2.c r2 = sp2.C101690c.f297710a
                    java.lang.String r2 = "access$getAdPullFunctions$p"
                    java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
                    java.util.List<fy3.a<rx3.b0>> r17 = sp2.C101690c.f297714e
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
                    monitor-enter(r17)
                    java.lang.String r2 = "access$getAdPullFunctions$p"
                    java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)     // Catch:{ all -> 0x0280 }
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)     // Catch:{ all -> 0x0280 }
                    r2 = r17
                    java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0280 }
                    java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0280 }
                L_0x0246:
                    boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0280 }
                    if (r7 == 0) goto L_0x0256
                    java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0280 }
                    fy3.a r7 = (fy3.C32224a) r7     // Catch:{ all -> 0x0280 }
                    r7.invoke()     // Catch:{ all -> 0x0280 }
                    goto L_0x0246
                L_0x0256:
                    rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0280 }
                    monitor-exit(r17)
                    r2 = 2
                    if (r15 != r2) goto L_0x028a
                    a14.h0 r2 = a14.C53872d1.f151119c
                    sp2.a$b$b$b r7 = new sp2.a$b$b$b
                    r7.<init>(r12, r10)
                    r3.f181828d = r14
                    r3.f181829e = r13
                    r3.f181830f = r12
                    r3.f181831g = r11
                    r3.f181832h = r9
                    r3.f181833i = r6
                    r3.f181834j = r5
                    r3.f181835n = r0
                    r3.f181836o = r15
                    r10 = 2
                    r3.f181839r = r10
                    java.lang.Object r2 = a14.C53895h.m60469g(r2, r7, r3)
                    if (r2 != r4) goto L_0x028a
                    goto L_0x02d3
                L_0x0280:
                    r0 = move-exception
                    monitor-exit(r17)
                    java.lang.String r2 = "emit"
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    throw r0
                L_0x028a:
                    r7 = r6
                    r2 = r14
                    r6 = r5
                    r14 = r12
                    r5 = r0
                    r12 = r9
                    r0 = r15
                    r15 = r11
                L_0x0292:
                    a14.h0 r11 = a14.C53872d1.f151119c
                    sp2.a$b$b$c r10 = new sp2.a$b$b$c
                    r17 = 0
                    r9 = r10
                    r8 = r10
                    r10 = r0
                    r1 = r11
                    r11 = r12
                    r20 = r4
                    r4 = r12
                    r12 = r15
                    r22 = r13
                    r13 = r6
                    r21 = r1
                    r1 = r14
                    r14 = r7
                    r30 = r8
                    r8 = r15
                    r15 = r17
                    r9.<init>(r10, r11, r12, r13, r14, r15)
                    r3.f181828d = r2
                    r13 = r22
                    r3.f181829e = r13
                    r3.f181830f = r1
                    r3.f181831g = r8
                    r3.f181832h = r4
                    r3.f181833i = r7
                    r3.f181834j = r6
                    r3.f181835n = r5
                    r3.f181836o = r0
                    r4 = 3
                    r3.f181839r = r4
                    r9 = r30
                    r4 = r21
                    java.lang.Object r3 = a14.C53895h.m60469g(r4, r9, r3)
                    r4 = r20
                    if (r3 != r4) goto L_0x02db
                L_0x02d3:
                    java.lang.String r0 = "emit"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return r4
                L_0x02db:
                    r12 = r1
                    r3 = r2
                    r4 = r5
                    r5 = r6
                    r6 = r7
                    r11 = r8
                    goto L_0x005a
                L_0x02e3:
                    if (r1 == 0) goto L_0x05ce
                    sp2.c r2 = sp2.C101690c.f297710a
                    java.lang.String r7 = r3.f181816d
                    long r8 = r4.f124000d
                    java.lang.String r4 = "access$reportAdChannel"
                    java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r10)
                    java.lang.String r14 = "reportAdChannel"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r10)
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    te3.c4 r13 = r2.mo141141h(r13)
                    te3.c4 r12 = r2.mo141139f(r12)
                    java.lang.String r15 = ""
                    if (r13 == 0) goto L_0x0312
                    java.lang.String r17 = r2.mo141140g(r13)
                    r30 = r11
                    r11 = r17
                    goto L_0x0315
                L_0x0312:
                    r30 = r11
                    r11 = r15
                L_0x0315:
                    if (r13 == 0) goto L_0x0320
                    r31 = r6
                    com.tencent.mm.plugin.sns.storage.ADInfo r6 = r2.mo141138e(r13)
                    java.lang.String r6 = r6.uxInfo
                    goto L_0x0323
                L_0x0320:
                    r31 = r6
                    r6 = 0
                L_0x0323:
                    if (r6 != 0) goto L_0x0326
                    r6 = r15
                L_0x0326:
                    if (r13 == 0) goto L_0x0331
                    r17 = r5
                    com.tencent.mm.plugin.sns.storage.ADInfo r5 = r2.mo141138e(r13)
                    java.lang.String r5 = r5.costLevel
                    goto L_0x0334
                L_0x0331:
                    r17 = r5
                    r5 = 0
                L_0x0334:
                    if (r5 != 0) goto L_0x0337
                    r5 = r15
                L_0x0337:
                    if (r12 == 0) goto L_0x0344
                    java.lang.String r20 = r2.mo141140g(r12)
                    r28 = r20
                    r20 = r3
                    r3 = r28
                    goto L_0x0347
                L_0x0344:
                    r20 = r3
                    r3 = r15
                L_0x0347:
                    if (r12 == 0) goto L_0x0352
                    r21 = r4
                    com.tencent.mm.plugin.sns.storage.ADInfo r4 = r2.mo141138e(r12)
                    java.lang.String r4 = r4.uxInfo
                    goto L_0x0355
                L_0x0352:
                    r21 = r4
                    r4 = 0
                L_0x0355:
                    if (r4 != 0) goto L_0x0358
                    r4 = r15
                L_0x0358:
                    if (r12 == 0) goto L_0x0363
                    r22 = r14
                    com.tencent.mm.plugin.sns.storage.ADInfo r14 = r2.mo141138e(r12)
                    java.lang.String r14 = r14.costLevel
                    goto L_0x0366
                L_0x0363:
                    r22 = r14
                    r14 = 0
                L_0x0366:
                    r23 = r8
                    if (r14 != 0) goto L_0x036b
                    r14 = r15
                L_0x036b:
                    org.json.JSONObject r8 = new org.json.JSONObject
                    r8.<init>()
                    java.lang.String r9 = "snsId"
                    r8.put(r9, r11)
                    r25 = r11
                    java.lang.String r11 = "uxInfo"
                    r8.put(r11, r6)
                    r26 = r6
                    java.lang.String r6 = "costLevel"
                    r8.put(r6, r5)
                    rx3.b0 r27 = rx3.C13598b0.f38549a
                    r27 = r5
                    java.lang.String r5 = "timelinePullAd"
                    r0.put(r5, r8)
                    org.json.JSONObject r5 = new org.json.JSONObject
                    r5.<init>()
                    r5.put(r9, r3)
                    r5.put(r11, r4)
                    r5.put(r6, r14)
                    java.lang.String r6 = "adPullAd"
                    r0.put(r6, r5)
                    java.lang.String r5 = "sessionKeyAd"
                    r0.put(r5, r7)
                    java.lang.String r5 = "selectedSnsId"
                    r0.put(r5, r15)
                    r6 = 1
                    if (r1 == r6) goto L_0x03c2
                    r6 = 2
                    if (r1 == r6) goto L_0x03bb
                    r6 = 4
                    if (r1 == r6) goto L_0x03c2
                    r6 = 7
                    if (r1 == r6) goto L_0x03c2
                    goto L_0x03c8
                L_0x03bb:
                    if (r12 == 0) goto L_0x03c8
                    java.lang.String r15 = r2.mo141140g(r12)
                    goto L_0x03c8
                L_0x03c2:
                    if (r13 == 0) goto L_0x03c8
                    java.lang.String r15 = r2.mo141140g(r13)
                L_0x03c8:
                    r0.put(r5, r15)
                    java.lang.String r5 = "stateType"
                    r0.put(r5, r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r5 = "obj.toString()"
                    gy3.C87412m.m108593f(r0, r5)
                    com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r6 = 1920(0x780, float:2.69E-42)
                    r5.mo175911u(r6, r1)
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "reportChannel:"
                    r5.append(r6)
                    r5.append(r0)
                    java.lang.String r5 = r5.toString()
                    java.lang.String r6 = "AdPullRequestHelper"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                    java.lang.String r5 = "sns_pull_ad_select_info"
                    vr2.C102260r.m134858a(r5, r0)
                    java.lang.String r5 = "isAdPullKvEnable"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r10)
                    r8 = 0
                    java.lang.Class<h81.h> r0 = h81.C32735h.class
                    di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x042c }
                    h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x042c }
                    h81.h$c r9 = h81.C32735h.C32737c.clicfg_sns_ad_timeline_pull_kv_report_android     // Catch:{ all -> 0x042c }
                    int r9 = r0.mo58779Qe(r9, r8)     // Catch:{ all -> 0x042c }
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x042a }
                    r0.<init>()     // Catch:{ all -> 0x042a }
                    java.lang.String r11 = "isAdPullKvEnable called "
                    r0.append(r11)     // Catch:{ all -> 0x042a }
                    r0.append(r9)     // Catch:{ all -> 0x042a }
                    java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x042a }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x042a }
                    goto L_0x0443
                L_0x042a:
                    r0 = move-exception
                    goto L_0x042e
                L_0x042c:
                    r0 = move-exception
                    r9 = 0
                L_0x042e:
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    java.lang.String r12 = "isAdPullKvEnable, exp="
                    r11.append(r12)
                    r11.append(r0)
                    java.lang.String r0 = r11.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
                L_0x0443:
                    if (r9 <= 0) goto L_0x0447
                    r0 = 1
                    goto L_0x0448
                L_0x0447:
                    r0 = 0
                L_0x0448:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
                    if (r0 == 0) goto L_0x04d0
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r5 = "timelinePullAd.snsId="
                    r0.append(r5)
                    r5 = r25
                    r0.append(r5)
                    java.lang.String r5 = "|timelinePullAd.uxInfo="
                    r0.append(r5)
                    r6 = r26
                    java.lang.String r5 = r2.mo141144k(r6)
                    r0.append(r5)
                    java.lang.String r5 = "|timelinePullAd.costLevel="
                    r0.append(r5)
                    r5 = r27
                    java.lang.String r5 = r2.mo141144k(r5)
                    r0.append(r5)
                    java.lang.String r5 = "|adPullAd.snsId="
                    r0.append(r5)
                    r0.append(r3)
                    java.lang.String r3 = "|adPullAd.uxInfo="
                    r0.append(r3)
                    java.lang.String r3 = r2.mo141144k(r4)
                    r0.append(r3)
                    java.lang.String r3 = "|adPullAd.costLevel="
                    r0.append(r3)
                    java.lang.String r2 = r2.mo141144k(r14)
                    r0.append(r2)
                    java.lang.String r2 = "|sessionKeyAd="
                    r0.append(r2)
                    r0.append(r7)
                    java.lang.String r2 = "|selectedSnsId="
                    r0.append(r2)
                    r0.append(r15)
                    java.lang.String r2 = "|stateType="
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r2 = "|costInProcess="
                    r0.append(r2)
                    r2 = r23
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r2 = "sns_ad_pull_cost_info_report"
                    java.lang.String r3 = "0"
                    vr2.C37817q.m41546b(r2, r3, r8, r8, r0)
                L_0x04d0:
                    r2 = r22
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                    r2 = r21
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                    sp2.c r0 = sp2.C101690c.f297710a
                    r2 = r20
                    java.lang.String r3 = r2.f181816d
                    java.lang.String r4 = "access$storePullRecord"
                    java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                    java.lang.String r6 = "AdPullRequestHelper"
                    java.lang.String r7 = "storePullRecord"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r5)
                    if (r17 == 0) goto L_0x0519
                    if (r31 == 0) goto L_0x0519
                    os2.g r9 = new os2.g
                    r9.<init>()
                    r10 = r31
                    java.lang.String r10 = r0.mo141140g(r10)
                    r9.field_snsid = r10
                    r10 = r17
                    java.lang.String r11 = r10.aid
                    r9.field_aid = r11
                    int r11 = eb0.C31543z5.m39455e()
                    long r11 = (long) r11
                    r9.field_storeTime = r11
                    r11 = 1
                    r9.field_isAsync = r11
                    r9.field_isSelected = r8
                    r9.field_sessionKey = r3
                    java.lang.String r10 = r10.traceid
                    r9.field_traceid = r10
                    goto L_0x051a
                L_0x0519:
                    r9 = 0
                L_0x051a:
                    if (r9 != 0) goto L_0x0521
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r5)
                    goto L_0x05ca
                L_0x0521:
                    r10 = 2
                    if (r1 != r10) goto L_0x0527
                    r1 = 1
                    r9.field_isSelected = r1
                L_0x0527:
                    os2.h r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.yx0()
                    r1.getClass()
                    java.lang.String r10 = "getDb"
                    java.lang.String r11 = "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
                    com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f294120d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
                    if (r1 != 0) goto L_0x0541
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r5)
                    goto L_0x05ca
                L_0x0541:
                    java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x05bf }
                    long r10 = r10.getId()     // Catch:{ all -> 0x05bf }
                    long r10 = r1.beginTransaction(r10)     // Catch:{ all -> 0x05bf }
                    int r12 = r9.field_isSelected     // Catch:{ all -> 0x05bf }
                    r13 = 1
                    if (r12 != r13) goto L_0x0595
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x05bf }
                    r12.<init>()     // Catch:{ all -> 0x05bf }
                    java.lang.String r13 = "update AdPullRecordsInfo set isSelected = 0 where sessionKey = '"
                    r12.append(r13)     // Catch:{ all -> 0x05bf }
                    r12.append(r3)     // Catch:{ all -> 0x05bf }
                    java.lang.String r13 = "' and snsid = '"
                    r12.append(r13)     // Catch:{ all -> 0x05bf }
                    if (r30 == 0) goto L_0x056e
                    r13 = r30
                    java.lang.String r0 = r0.mo141140g(r13)     // Catch:{ all -> 0x05bf }
                    goto L_0x056f
                L_0x056e:
                    r0 = 0
                L_0x056f:
                    r12.append(r0)     // Catch:{ all -> 0x05bf }
                    r0 = 39
                    r12.append(r0)     // Catch:{ all -> 0x05bf }
                    java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x05bf }
                    java.lang.String r12 = "AdPullRecordsInfo"
                    r1.execSQL(r12, r0)     // Catch:{ all -> 0x05bf }
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x05bf }
                    r12.<init>()     // Catch:{ all -> 0x05bf }
                    java.lang.String r13 = "updateAdPullRecordsInfo: "
                    r12.append(r13)     // Catch:{ all -> 0x05bf }
                    r12.append(r0)     // Catch:{ all -> 0x05bf }
                    java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x05bf }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x05bf }
                L_0x0595:
                    os2.h r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.yx0()     // Catch:{ all -> 0x05bf }
                    r0.insert(r9)     // Catch:{ all -> 0x05bf }
                    r1.endTransaction(r10)     // Catch:{ all -> 0x05bf }
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05bf }
                    r0.<init>()     // Catch:{ all -> 0x05bf }
                    java.lang.String r1 = "recordInfo inserted "
                    r0.append(r1)     // Catch:{ all -> 0x05bf }
                    java.lang.String r1 = r9.field_snsid     // Catch:{ all -> 0x05bf }
                    r0.append(r1)     // Catch:{ all -> 0x05bf }
                    java.lang.String r1 = "  "
                    r0.append(r1)     // Catch:{ all -> 0x05bf }
                    r0.append(r3)     // Catch:{ all -> 0x05bf }
                    java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05bf }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x05bf }
                    goto L_0x05c7
                L_0x05bf:
                    r0 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r8]
                    java.lang.String r3 = ""
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r3, r1)
                L_0x05c7:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r5)
                L_0x05ca:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                    goto L_0x05d8
                L_0x05ce:
                    r2 = r3
                    com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r1 = 11
                    r3 = 1920(0x780, float:2.69E-42)
                    r0.mo175911u(r3, r1)
                L_0x05d8:
                    a14.n0 r0 = r2.f181817e
                    java.lang.String r1 = "completed~"
                    r2 = 2
                    r3 = 0
                    a14.C53930o0.m60557d(r0, r1, r3, r2, r3)
                L_0x05e1:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    java.lang.String r1 = "emit"
                    java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: sp2.C64132a.C64133b.C64134b.mo88867a(rx3.l, wx3.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2");
                Object a = mo88867a((C13604l) obj, dVar);
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2");
                return a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64133b(C58087u0<C13604l<Boolean, u84>> u0Var, C58087u0<C13604l<Boolean, p64>> u0Var2, String str, C15601d<? super C64133b> dVar) {
            super(2, dVar);
            this.f181813f = u0Var;
            this.f181814g = u0Var2;
            this.f181815h = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
            C64133b bVar = new C64133b(this.f181813f, this.f181814g, this.f181815h, dVar);
            bVar.f181812e = obj;
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
            Object invokeSuspend = ((C64133b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f181811d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45254q0 q0Var = new C45254q0(this.f181813f, this.f181814g, new C36776a((C15601d<? super C36776a>) null));
                C53896h0 h0Var = C53872d1.f151117a;
                C45252f j = C58042h.m67201j(q0Var, C58901s.f168555a);
                C64134b bVar = new C64134b(this.f181815h, (C0000n0) this.f181812e);
                this.f181811d = 1;
                if (j.mo31880a(bVar, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1", mo125469f = "AdPullRequestHelper.kt", mo125470l = {732}, mo125471m = "invokeSuspend")
    /* renamed from: sp2.a$a */
    public static final class C64139a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f181840d;

        /* renamed from: e */
        public int f181841e;

        /* renamed from: f */
        public final /* synthetic */ t84 f181842f;

        /* renamed from: g */
        public final /* synthetic */ String f181843g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgiAsync$2", mo125469f = "CgiRequestHelper.kt", mo125470l = {143}, mo125471m = "invokeSuspend")
        /* renamed from: sp2.a$a$a */
        public static final class C64140a extends C91594j implements C32227p<C0000n0, C15601d<? super C61333b.C61334a<p64>>, Object> {

            /* renamed from: d */
            public Object f181844d;

            /* renamed from: e */
            public Object f181845e;

            /* renamed from: f */
            public int f181846f;

            /* renamed from: g */
            public final /* synthetic */ C101820nt3 f181847g;

            /* renamed from: h */
            public final /* synthetic */ int f181848h;

            /* renamed from: i */
            public final /* synthetic */ String f181849i;

            /* renamed from: sp2.a$a$a$a */
            public static final class C64141a extends C87413o implements C32226l<C61333b.C61334a<p64>, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C53916l f181850d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C64141a(C53916l lVar) {
                    super(1);
                    this.f181850d = lVar;
                }

                public Object invoke(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$1");
                    C61333b.C61334a aVar = (C61333b.C61334a) obj;
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$1");
                    C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
                    this.f181850d.resumeWith(Result.m168114constructorimpl(aVar));
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$1");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$1");
                    return b0Var;
                }
            }

            /* renamed from: sp2.a$a$a$b */
            public static final class C64142b extends C87413o implements C32226l<Throwable, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C32226l f181851d;

                /* renamed from: e */
                public final /* synthetic */ int f181852e;

                /* renamed from: f */
                public final /* synthetic */ C101820nt3 f181853f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C64142b(C32226l lVar, int i, C101820nt3 nt32) {
                    super(1);
                    this.f181851d = lVar;
                    this.f181852e = i;
                    this.f181853f = nt32;
                }

                public Object invoke(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$2");
                    Throwable th = (Throwable) obj;
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$2");
                    try {
                        this.f181851d.hashCode();
                    } catch (Throwable unused) {
                    }
                    Log.m105924i("CgiRequestHelper", "requestCgiAsync canceled " + this.f181852e + ' ' + this.f181853f);
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$2");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$2");
                    return b0Var;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C64140a(C101820nt3 nt32, int i, String str, C15601d dVar) {
                super(2, dVar);
                this.f181847g = nt32;
                this.f181848h = i;
                this.f181849i = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                C64140a aVar = new C64140a(this.f181847g, this.f181848h, this.f181849i, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                Object invokeSuspend = ((C64140a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                int i = this.f181846f;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C101820nt3 nt32 = this.f181847g;
                    int i2 = this.f181848h;
                    String str = this.f181849i;
                    this.f181844d = nt32;
                    this.f181845e = str;
                    this.f181846f = 1;
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    C64141a aVar2 = new C64141a(mVar);
                    try {
                        C61333b.m71949a(nt32, i2, str, aVar2, p64.class.newInstance(), true);
                    } catch (Throwable th) {
                        Log.m105920e("CgiRequestHelper", "requestCgiAsync error: request = " + nt32 + ", funcId = " + i2 + "  " + th);
                    }
                    mVar.mo74599v(new C64142b(aVar2, i2, nt32));
                    obj = mVar.mo74608o();
                    if (obj == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                    throw illegalStateException;
                }
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64139a(t84 t84, String str, C15601d<? super C64139a> dVar) {
            super(2, dVar);
            this.f181842f = t84;
            this.f181843g = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
            C64139a aVar = new C64139a(this.f181842f, this.f181843g, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
            Object invokeSuspend = ((C64139a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
            return invokeSuspend;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: te3.p64} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.String r2 = "invokeSuspend"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r1.f181841e
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
                r6 = 1
                r7 = 0
                r8 = 0
                if (r4 == 0) goto L_0x002b
                if (r4 != r6) goto L_0x0020
                long r9 = r1.f181840d
                kotlin.ResultKt.throwOnFailure(r17)
                r4 = r17
                goto L_0x00b4
            L_0x0020:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                throw r0
            L_0x002b:
                kotlin.ResultKt.throwOnFailure(r17)
                com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 1920(0x780, float:2.69E-42)
                r4.mo175911u(r9, r7)
                long r9 = java.lang.System.currentTimeMillis()
                sp2.c r4 = sp2.C101690c.f297710a
                te3.t84 r4 = r1.f181842f
                java.lang.String r11 = "toSnsAdPullReq"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r5)
                java.lang.String r12 = "<this>"
                gy3.C87412m.m108594g(r4, r12)
                te3.o64 r12 = new te3.o64
                r12.<init>()
                te3.ia r13 = r4.getBaseRequest()
                r12.setBaseRequest(r13)
                java.lang.String r13 = r4.f299492d
                r12.f298959d = r13
                long r13 = r4.f299493e
                r12.f298960e = r13
                long r13 = r4.f299494f
                r12.f298961f = r13
                int r13 = r4.f299495g
                r12.f298962g = r13
                long r13 = r4.f299496h
                r12.f298963h = r13
                te3.qv3 r13 = r4.f299497i
                r12.f298964i = r13
                int r13 = r4.f299498j
                r12.f298965j = r13
                int r13 = r4.f299499n
                r12.f298966n = r13
                java.util.LinkedList<java.lang.Long> r13 = r4.f299500o
                r12.f298967o = r13
                int r13 = r4.f299501p
                r12.f298968p = r13
                int r13 = r4.f299502q
                r12.f298969q = r13
                long r13 = r4.f299503r
                r12.f298970r = r13
                long r13 = r4.f299504s
                r12.f298971s = r13
                long r13 = r4.f299505t
                r12.f298972t = r13
                int r13 = r4.f299506u
                r12.f298973u = r13
                long r13 = r4.f299507v
                r12.f298974v = r13
                te3.qv3 r4 = r4.f299508w
                r12.f298975w = r4
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
                r4 = 4348(0x10fc, float:6.093E-42)
                r13 = 30000(0x7530, double:1.4822E-319)
                sp2.a$a$a r11 = new sp2.a$a$a
                java.lang.String r15 = "/cgi-bin/mmoc-bin/adplayinfo/sns_pull_request_adobject"
                r11.<init>(r12, r4, r15, r8)
                r1.f181840d = r9
                r1.f181841e = r6
                java.lang.Object r4 = a14.C53860b3.m60375c(r13, r11, r1)
                if (r4 != r0) goto L_0x00b4
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r0
            L_0x00b4:
                lp2.b$a r4 = (lp2.C61333b.C61334a) r4
                long r11 = java.lang.System.currentTimeMillis()
                long r11 = r11 - r9
                if (r4 == 0) goto L_0x00c5
                int r0 = r4.mo86289a()
                if (r0 != 0) goto L_0x00c5
                r0 = 1
                goto L_0x00c6
            L_0x00c5:
                r0 = 0
            L_0x00c6:
                java.lang.String r9 = "AdPullRequestHelper"
                if (r0 == 0) goto L_0x00d8
                int r0 = r4.mo86290b()
                if (r0 != 0) goto L_0x00d8
                java.lang.Object r0 = r4.mo86291c()
                r8 = r0
                te3.p64 r8 = (te3.p64) r8
                goto L_0x010e
            L_0x00d8:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r10 = "adpull result not ok ! "
                r0.append(r10)
                if (r4 == 0) goto L_0x00ee
                int r10 = r4.mo86289a()
                java.lang.Integer r13 = new java.lang.Integer
                r13.<init>(r10)
                goto L_0x00ef
            L_0x00ee:
                r13 = r8
            L_0x00ef:
                r0.append(r13)
                java.lang.String r10 = ", "
                r0.append(r10)
                if (r4 == 0) goto L_0x0103
                int r4 = r4.mo86290b()
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r4)
                goto L_0x0104
            L_0x0103:
                r10 = r8
            L_0x0104:
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            L_0x010e:
                rx3.l r4 = new rx3.l
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r4.<init>(r0, r8)
                sp2.c r0 = sp2.C101690c.f297710a
                java.lang.String r8 = "access$getAdPullObjOrNull"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                te3.c4 r0 = r0.mo141139f(r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                if (r0 == 0) goto L_0x012a
                boolean r5 = com.tencent.p014mm.plugin.sns.model.C94833a.m120169v(r0)
                goto L_0x012b
            L_0x012a:
                r5 = 0
            L_0x012b:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "adDynamic, updateSuccess="
                r8.append(r10)
                r8.append(r5)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
                r8 = 1802(0x70a, float:2.525E-42)
                if (r5 == 0) goto L_0x014b
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r10 = 8
                r5.mo175911u(r8, r10)
                goto L_0x0152
            L_0x014b:
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r10 = 9
                r5.mo175911u(r8, r10)
            L_0x0152:
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter"
                java.lang.String r8 = "reportAdPullRequestCost"
                if (r0 == 0) goto L_0x01b9
                te3.rv3 r10 = r0.f131490e
                java.lang.String r10 = sf0.C48374j0.m53718g(r10)
                te3.h64 r13 = r0.f131489d
                te3.rv3 r13 = r13.f134465e
                java.lang.String r13 = sf0.C48374j0.m53718g(r13)
                r14 = 2
                java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ all -> 0x018e }
                r14[r7] = r10     // Catch:{ all -> 0x018e }
                r14[r6] = r13     // Catch:{ all -> 0x018e }
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r14)     // Catch:{ all -> 0x018e }
                if (r7 != 0) goto L_0x01a4
                te3.h64 r0 = r0.f131489d     // Catch:{ all -> 0x018e }
                if (r0 == 0) goto L_0x0188
                com.tencent.mm.protocal.protobuf.SnsObject r0 = r0.f134464d     // Catch:{ all -> 0x018e }
                if (r0 == 0) goto L_0x0188
                long r14 = r0.f283891Id     // Catch:{ all -> 0x018e }
                java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x018e }
                r0.<init>(r14)     // Catch:{ all -> 0x018e }
                long r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r0)     // Catch:{ all -> 0x018e }
                goto L_0x018a
            L_0x0188:
                r14 = 0
            L_0x018a:
                vr2.C102259p.m134830c(r14, r10, r13)     // Catch:{ all -> 0x018e }
                goto L_0x01a4
            L_0x018e:
                r0 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r10 = "reportAdPullException: "
                r7.append(r10)
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            L_0x01a4:
                pq2.a r0 = pq2.C35614a.f95198a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                zt3.t r0 = zt3.C119157j.f356862d
                pq2.b r7 = new pq2.b
                r7.<init>(r11, r6)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183875f(r7)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                goto L_0x01cd
            L_0x01b9:
                pq2.a r0 = pq2.C35614a.f95198a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                zt3.t r0 = zt3.C119157j.f356862d
                pq2.b r6 = new pq2.b
                r6.<init>(r11, r7)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183875f(r6)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            L_0x01cd:
                java.lang.String r0 = r1.f181843g
                sp2.C101690c.m133573c(r0, r4)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sp2.C64132a.C64139a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64132a(String str, t84 t84, C15601d<? super C64132a> dVar) {
        super(2, dVar);
        this.f181809f = str;
        this.f181810g = t84;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        C64132a aVar = new C64132a(this.f181809f, this.f181810g, dVar);
        aVar.f181808e = obj;
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        return aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        Object invokeSuspend = ((C64132a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C58087u0 u0Var;
        C58087u0 u0Var2;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181807d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53895h.m60466d((C0000n0) this.f181808e, (C66212f) null, (C53934p0) null, new C64139a(this.f181810g, this.f181809f, (C15601d<? super C64139a>) null), 3, (Object) null);
            Map a = C101690c.m133571a();
            String str3 = this.f181809f;
            synchronized (a) {
                try {
                    u0Var = (C58087u0) ((LinkedHashMap) C101690c.m133571a()).get(str3);
                } finally {
                    str = "invokeSuspend";
                    str2 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
            Map b = C101690c.m133572b();
            String str4 = this.f181809f;
            synchronized (b) {
                try {
                    u0Var2 = (C58087u0) ((LinkedHashMap) C101690c.m133572b()).get(str4);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (u0Var == null || u0Var2 == null) {
                Log.m105920e("AdPullRequestHelper", "combine error with: uuid = " + this.f181809f);
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
                return b0Var;
            }
            C64133b bVar = new C64133b(u0Var2, u0Var, this.f181809f, (C15601d<? super C64133b>) null);
            this.f181807d = 1;
            if (C53860b3.m60375c(30000, bVar, this) == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
            throw illegalStateException;
        }
        C115669n.INSTANCE.mo175911u(1920, 12);
        Log.m105920e("AdPullRequestHelper", "request of " + this.f181809f + " time out! ");
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        return b0Var2;
    }
}
