package gu2;

import au2.C92093b;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.C96315x6;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ip3.C98780b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import op3.C117879d;
import op3.C117882j;
import os2.C100417r0;
import os2.C35293n0;
import p749xh.C102654l5;
import p823sg.C90193h;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101802kr2;
import te3.C101808lv2;
import te3.k94;
import te3.w64;
import vr2.C102236a0;

/* renamed from: gu2.b */
public class C98214b extends C102654l5 {

    /* renamed from: o1 */
    public static final /* synthetic */ int f287959o1 = 0;

    /* renamed from: Q0 */
    public final C13601g f287960Q0 = C36568h.m40985a(new C98220f(this));

    /* renamed from: R0 */
    public final C13601g f287961R0 = C36568h.m40985a(new C98221g(this));

    /* renamed from: S0 */
    public final C13601g f287962S0 = C36568h.m40985a(new C98218d(this));

    /* renamed from: T0 */
    public final C13601g f287963T0 = C36568h.m40985a(new C98219e(this));

    /* renamed from: U0 */
    public final C13601g f287964U0 = C36568h.m40985a(new C98225k(this));

    /* renamed from: V0 */
    public Boolean f287965V0;

    /* renamed from: W0 */
    public String f287966W0;

    /* renamed from: X0 */
    public Boolean f287967X0;

    /* renamed from: Y0 */
    public String f287968Y0;

    /* renamed from: Z0 */
    public String f287969Z0;

    /* renamed from: a1 */
    public Boolean f287970a1;

    /* renamed from: b1 */
    public String f287971b1;

    /* renamed from: c1 */
    public Boolean f287972c1;

    /* renamed from: d1 */
    public Boolean f287973d1;

    /* renamed from: e1 */
    public Boolean f287974e1;

    /* renamed from: f1 */
    public CharSequence f287975f1;

    /* renamed from: g1 */
    public Boolean f287976g1;

    /* renamed from: h1 */
    public Boolean f287977h1;

    /* renamed from: i1 */
    public final C13601g f287978i1 = C36568h.m40985a(new C98222h(this));

    /* renamed from: j1 */
    public final C13601g f287979j1 = C36568h.m40985a(new C98227m(this));

    /* renamed from: k1 */
    public final C13601g f287980k1 = C36568h.m40985a(new C98228n(this));

    /* renamed from: l1 */
    public final C13601g f287981l1 = C36568h.m40985a(new C98215a(this));

    /* renamed from: m1 */
    public final C13601g f287982m1 = C36568h.m40985a(new C98217c(this));

    /* renamed from: n1 */
    public final C13601g f287983n1 = C36568h.m40985a(new C98216b(this));

    /* renamed from: p0 */
    public final C13601g f287984p0 = C36568h.m40985a(new C98223i(this));

    /* renamed from: x0 */
    public final C13601g f287985x0 = C36568h.m40985a(new C98224j(this));

    /* renamed from: y0 */
    public final C13601g f287986y0 = C36568h.m40985a(new C98226l(this));

    /* renamed from: gu2.b$a */
    public static final class C98215a extends C87413o implements C32224a<LinkedList<w64>> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98215a(C98214b bVar) {
            super(0);
            this.f287987d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$commentList$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$commentList$2");
            LinkedList<w64> linkedList = this.f287987d.mo137506D2().CommentUserList;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$commentList$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$commentList$2");
            return linkedList;
        }
    }

    /* renamed from: gu2.b$b */
    public static final class C98216b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98216b(C98214b bVar) {
            super(0);
            this.f287988d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$isNoCopy$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$isNoCopy$2");
            Boolean valueOf = Boolean.valueOf((this.f287988d.mo142400o2() & 128) > 0);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$isNoCopy$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$isNoCopy$2");
            return valueOf;
        }
    }

    /* renamed from: gu2.b$c */
    public static final class C98217c extends C87413o implements C32224a<C98780b<C117882j>> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287989d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98217c(C98214b bVar) {
            super(0);
            this.f287989d = bVar;
        }

        public Object invoke() {
            C98780b bVar;
            String str;
            String str2;
            String str3;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
            SnsObject D2 = this.f287989d.mo137506D2();
            if (D2.LikeUserList.size() > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<w64> it = D2.LikeUserList.iterator();
                while (it.hasNext()) {
                    w64 next = it.next();
                    C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(next.f299703d);
                    if (H3 != null) {
                        str2 = Util.nullAsNil(H3.mo62898f());
                        C87412m.m108593f(str2, "nullAsNil(contact.displayRemark)");
                        str = Util.nullAsNil(H3.mo73980x2());
                        C87412m.m108593f(str, "nullAsNil(contact.openImAppid)");
                        str3 = Util.nullAsNil(H3.mo73976t2());
                        C87412m.m108593f(str3, "nullAsNil(contact.descWordingId)");
                    } else {
                        String nullAsNil = Util.nullAsNil(next.f299703d);
                        C87412m.m108593f(nullAsNil, "nullAsNil(info.Username)");
                        str = "";
                        str2 = nullAsNil;
                        str3 = str;
                    }
                    C117879d e = C117882j.m166286e(next.f299703d, str2, str, str3);
                    C117882j[] jVarArr = {e};
                    for (int i = 0; i < 1; i++) {
                        arrayList.add(jVarArr[i]);
                    }
                }
                bVar = new C98780b(arrayList, (C98780b.C98781a) null);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
            } else {
                C98780b bVar2 = new C98780b(new ArrayList(), (C98780b.C98781a) null);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
                bVar = bVar2;
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$likeUserList$2");
            return bVar;
        }
    }

    /* renamed from: gu2.b$d */
    public static final class C98218d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98218d(C98214b bVar) {
            super(0);
            this.f287990d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDNumber$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDNumber$2");
            Long valueOf = Long.valueOf(this.f287990d.systemRowid);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDNumber$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDNumber$2");
            return valueOf;
        }
    }

    /* renamed from: gu2.b$e */
    public static final class C98219e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98219e(C98214b bVar) {
            super(0);
            this.f287991d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDString$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDString$2");
            String j = this.f287991d.isAd() ? C100417r0.m131421j("ad_table_", this.f287991d.mo137526z2()) : C100417r0.m131421j("sns_table_", this.f287991d.mo137526z2());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDString$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDString$2");
            return j;
        }
    }

    /* renamed from: gu2.b$f */
    public static final class C98220f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98220f(C98214b bVar) {
            super(0);
            this.f287992d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$mainContent$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$mainContent$2");
            String str = this.f287992d.mo137509G2().ContentDesc;
            if (str == null) {
                str = "";
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$mainContent$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$mainContent$2");
            return str;
        }
    }

    /* renamed from: gu2.b$g */
    public static final class C98221g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98221g(C98214b bVar) {
            super(0);
            this.f287993d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$openIMAppID$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$openIMAppID$2");
            C72996z1 v2 = this.f287993d.mo137522v2();
            String x2 = v2 != null ? v2.mo73980x2() : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$openIMAppID$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$openIMAppID$2");
            return x2;
        }
    }

    /* renamed from: gu2.b$h */
    public static final class C98222h extends C87413o implements C32224a<C101808lv2> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98222h(C98214b bVar) {
            super(0);
            this.f287994d = bVar;
        }

        public Object invoke() {
            C101808lv2 lv22;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
            if (this.f287994d.getPostBuf() != null) {
                byte[] postBuf = this.f287994d.getPostBuf();
                C87412m.m108593f(postBuf, "postBuf");
                if (!(postBuf.length == 0)) {
                    C47465a parseFrom = new C101808lv2().parseFrom(this.f287994d.getPostBuf());
                    C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaPostInfo");
                    lv22 = (C101808lv2) parseFrom;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
                    return lv22;
                }
            }
            lv22 = new C101808lv2();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
            return lv22;
        }
    }

    /* renamed from: gu2.b$i */
    public static final class C98223i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287995d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98223i(C98214b bVar) {
            super(0);
            this.f287995d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsIDString$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsIDString$2");
            String q0 = C102236a0.m134765q0(this.f287995d.mo142401p2());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsIDString$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsIDString$2");
            return q0;
        }
    }

    /* renamed from: gu2.b$j */
    public static final class C98224j extends C87413o implements C32224a<SnsInfo> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98224j(C98214b bVar) {
            super(0);
            this.f287996d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsInfo$2");
            C98214b bVar = this.f287996d;
            int i = C98214b.f287959o1;
            SnsMethodCalculate.markStartTimeMs("access$toSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("toSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            SnsInfo snsInfo = new SnsInfo();
            snsInfo.convertFrom(bVar.mo142397l2());
            snsInfo.localid = (int) bVar.systemRowid;
            SnsMethodCalculate.markEndTimeMs("toSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            SnsMethodCalculate.markEndTimeMs("access$toSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsInfo$2");
            return snsInfo;
        }
    }

    /* renamed from: gu2.b$k */
    public static final class C98225k extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98225k(C98214b bVar) {
            super(0);
            this.f287997d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsTableId$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsTableId$2");
            String j = this.f287997d.isAd() ? C100417r0.m131421j("ad_table_", this.f287997d.mo142401p2()) : C100417r0.m131421j("sns_table_", this.f287997d.mo142401p2());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsTableId$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsTableId$2");
            return j;
        }
    }

    /* renamed from: gu2.b$l */
    public static final class C98226l extends C87413o implements C32224a<TimeLineObject> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287998d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98226l(C98214b bVar) {
            super(0);
            this.f287998d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$timelineObject$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$timelineObject$2");
            C47465a parseFrom = new TimeLineObject().parseFrom(this.f287998d.mo142399n2());
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.TimeLineObject");
            TimeLineObject timeLineObject = (TimeLineObject) parseFrom;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$timelineObject$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$timelineObject$2");
            return timeLineObject;
        }
    }

    /* renamed from: gu2.b$m */
    public static final class C98227m extends C87413o implements C32224a<C35293n0> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f287999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98227m(C98214b bVar) {
            super(0);
            this.f287999d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsFoldDetail$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsFoldDetail$2");
            C35293n0 jo = C94866e1.iy0().mo60192jo(this.f287999d.mo142401p2());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsFoldDetail$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsFoldDetail$2");
            return jo;
        }
    }

    /* renamed from: gu2.b$n */
    public static final class C98228n extends C87413o implements C32224a<k94> {

        /* renamed from: d */
        public final /* synthetic */ C98214b f288000d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98228n(C98214b bVar) {
            super(0);
            this.f288000d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
            C35293n0 H2 = this.f288000d.mo137510H2();
            k94 k94 = null;
            if (!Util.isNullOrNil(H2 != null ? H2.field_groupStrcut : null)) {
                try {
                    k94 k942 = new k94();
                    C35293n0 H22 = this.f288000d.mo137510H2();
                    C87412m.m108591d(H22);
                    k942.parseFrom(H22.field_groupStrcut);
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
                    k94 = k942;
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.Improve.SnsInfo", "parse SnsWsGroupStruct fail:%s", e.getMessage());
                }
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
                return k94;
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
            return k94;
        }
    }

    public C98214b() {
        mo142403r2(0);
        mo142408t2(0);
    }

    /* renamed from: A2 */
    public final String mo137503A2() {
        SnsMethodCalculate.markStartTimeMs("getLocalIDString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        Object value = ((C36570n) this.f287963T0).getValue();
        C87412m.m108593f(value, "<get-localIDString>(...)");
        String str = (String) value;
        SnsMethodCalculate.markEndTimeMs("getLocalIDString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    /* renamed from: B2 */
    public final String mo137504B2() {
        SnsMethodCalculate.markStartTimeMs("getSnsIDString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        Object value = ((C36570n) this.f287984p0).getValue();
        C87412m.m108593f(value, "<get-snsIDString>(...)");
        String str = (String) value;
        SnsMethodCalculate.markEndTimeMs("getSnsIDString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    /* renamed from: C2 */
    public final SnsInfo mo137505C2() {
        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        SnsInfo snsInfo = (SnsInfo) ((C36570n) this.f287985x0).getValue();
        SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return snsInfo;
    }

    /* renamed from: D2 */
    public final SnsObject mo137506D2() {
        SnsObject snsObject;
        SnsMethodCalculate.markStartTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        int i = C94897n1.f274990d;
        SnsMethodCalculate.markStartTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        try {
            if (((ConcurrentHashMap) C94897n1.f274992f).containsKey(mo137523w2())) {
                snsObject = (SnsObject) ((ConcurrentHashMap) C94897n1.f274992f).get(mo137523w2());
                if (snsObject != null) {
                    C94866e1.Rx0().mo130957p(snsObject);
                    SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                    C87412m.m108593f(snsObject, "getMergeSnsObject(this)");
                    SnsMethodCalculate.markEndTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                    return snsObject;
                }
            }
            snsObject = (SnsObject) new SnsObject().parseFrom(mo142398m2());
            ((ConcurrentHashMap) C94897n1.f274992f).put(mo137523w2(), snsObject);
            C94866e1.Rx0().mo130957p(snsObject);
            SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
            Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e, "", new Object[0]);
            snsObject = new SnsObject();
            SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        }
        C87412m.m108593f(snsObject, "getMergeSnsObject(this)");
        SnsMethodCalculate.markEndTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return snsObject;
    }

    /* renamed from: E2 */
    public final String mo137507E2() {
        SnsMethodCalculate.markStartTimeMs("getSnsTableId", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        Object value = ((C36570n) this.f287964U0).getValue();
        C87412m.m108593f(value, "<get-snsTableId>(...)");
        String str = (String) value;
        SnsMethodCalculate.markEndTimeMs("getSnsTableId", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    /* renamed from: F2 */
    public final String mo137508F2() {
        SnsMethodCalculate.markStartTimeMs("getTimeString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        String a = C96315x6.m123535a(MMApplicationContext.getContext(), ((long) getCreateTime()) * 1000);
        C87412m.m108593f(a, "formatSnsTimeInTimeLine(…ateTime * 1000L\n        )");
        SnsMethodCalculate.markEndTimeMs("getTimeString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return a;
    }

    /* renamed from: G2 */
    public final TimeLineObject mo137509G2() {
        SnsMethodCalculate.markStartTimeMs("getTimelineObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        TimeLineObject timeLineObject = (TimeLineObject) ((C36570n) this.f287986y0).getValue();
        SnsMethodCalculate.markEndTimeMs("getTimelineObject", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return timeLineObject;
    }

    /* renamed from: H2 */
    public final C35293n0 mo137510H2() {
        SnsMethodCalculate.markStartTimeMs("getWsFoldDetail", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        C35293n0 n0Var = (C35293n0) ((C36570n) this.f287979j1).getValue();
        SnsMethodCalculate.markEndTimeMs("getWsFoldDetail", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return n0Var;
    }

    /* renamed from: I2 */
    public final k94 mo137511I2() {
        SnsMethodCalculate.markStartTimeMs("getWsGroupStruct", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        k94 k94 = (k94) ((C36570n) this.f287980k1).getValue();
        SnsMethodCalculate.markEndTimeMs("getWsGroupStruct", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return k94;
    }

    /* renamed from: J2 */
    public final void mo137512J2() {
        SnsMethodCalculate.markStartTimeMs("setupAddressInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        TimeLineObject G2 = mo137509G2();
        if (G2 == null) {
            SnsMethodCalculate.markEndTimeMs("setupAddressInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            return;
        }
        C101802kr2 kr22 = G2.Location;
        String str = null;
        String str2 = kr22 != null ? kr22.f298649f : null;
        if (kr22 != null) {
            str = kr22.f298650g;
        }
        if (!Util.isNullOrNil(str)) {
            if (mo142401p2() == 0 && !Util.isNullOrNil(str2)) {
                str = str2 + 183 + str;
            }
            this.f287966W0 = str;
            this.f287965V0 = Boolean.TRUE;
        } else {
            this.f287966W0 = str2;
            this.f287965V0 = Boolean.FALSE;
        }
        SnsMethodCalculate.markEndTimeMs("setupAddressInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        if (r4 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016b  */
    /* renamed from: K2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137513K2() {
        /*
            r16 = this;
            r0 = r16
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_finder_no_support_share_switch
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.Class<ym.l> r4 = p763ym.C79138l.class
            java.lang.String r5 = "setupAppInfo"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r16.mo137509G2()
            if (r7 != 0) goto L_0x001c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x001c:
            java.util.HashMap<java.lang.String, java.lang.String> r8 = st2.C101701a.f297756a
            java.lang.String r8 = "getAppNamesCache"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.improve.cache.ImproveAppNameCache"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            java.util.HashMap<java.lang.String, java.lang.String> r10 = st2.C101701a.f297756a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.CharSequence r8 = vr2.C102236a0.m134710E(r7, r8, r10)
            te3.r5 r10 = r7.AppInfo
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0044
            java.lang.String r10 = r10.f299236d
            java.lang.String r12 = "wx122a2d4c4b5f211e"
            boolean r10 = gy3.C87412m.m108589b(r12, r10)
            if (r10 == 0) goto L_0x0044
            r8 = r11
        L_0x0044:
            java.lang.Class<om.f> r10 = p214om.C11502f.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            om.f r10 = (p214om.C11502f) r10
            r13 = 0
            r14 = 1
            if (r10 == 0) goto L_0x0066
            wc3.y r10 = r10.mo11461Sr()
            if (r10 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x005d
            java.lang.String r15 = r8.toString()
            goto L_0x005e
        L_0x005d:
            r15 = 0
        L_0x005e:
            boolean r10 = r10.mo93144L1(r15)
            if (r10 != r14) goto L_0x0066
            r10 = 1
            goto L_0x0067
        L_0x0066:
            r10 = 0
        L_0x0067:
            if (r10 == 0) goto L_0x016b
            boolean r10 = vr2.C102236a0.m134749i0(r7)
            if (r10 == 0) goto L_0x016b
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r0.f287973d1 = r10
            te3.r5 r10 = r7.AppInfo
            if (r10 != 0) goto L_0x0078
            goto L_0x00a7
        L_0x0078:
            java.lang.String r10 = "getAppTailClickableCache"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r9)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r15 = st2.C101701a.f297757b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
            te3.r5 r12 = r7.AppInfo
            java.lang.String r12 = r12.f299236d
            boolean r12 = r15.containsKey(r12)
            if (r12 == 0) goto L_0x00ab
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r9)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r4 = st2.C101701a.f297757b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
            te3.r5 r9 = r7.AppInfo
            java.lang.String r9 = r9.f299236d
            java.lang.Object r4 = r4.get(r9)
            gy3.C87412m.m108591d(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x00a9
        L_0x00a7:
            r12 = 0
            goto L_0x00eb
        L_0x00a9:
            r12 = 1
            goto L_0x00eb
        L_0x00ab:
            di3.d r12 = di3.C86312j.m106911c(r4)
            ym.l r12 = (p763ym.C79138l) r12
            te3.r5 r15 = r7.AppInfo
            java.lang.String r15 = r15.f299236d
            boolean r12 = r12.mo74006a3(r15)
            if (r12 == 0) goto L_0x00c5
            te3.r5 r4 = r7.AppInfo
            int r4 = r4.f299241i
            if (r4 != 0) goto L_0x00c3
            r4 = 0
            goto L_0x00d5
        L_0x00c3:
            r4 = 1
            goto L_0x00d7
        L_0x00c5:
            di3.d r4 = di3.C86312j.m106911c(r4)
            ym.l r4 = (p763ym.C79138l) r4
            te3.r5 r12 = r7.AppInfo
            java.lang.String r12 = r12.f299236d
            boolean r4 = r4.cg0(r12)
            if (r4 != 0) goto L_0x00d7
        L_0x00d5:
            r12 = 0
            goto L_0x00d8
        L_0x00d7:
            r12 = 1
        L_0x00d8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r9)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r15 = st2.C101701a.f297757b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
            te3.r5 r9 = r7.AppInfo
            java.lang.String r9 = r9.f299236d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r15.put(r9, r4)
        L_0x00eb:
            te3.j00 r4 = r7.ContentObj
            int r4 = r4.f298424e
            r9 = 28
            if (r4 == r9) goto L_0x0103
            r9 = 36
            if (r4 == r9) goto L_0x0103
            r9 = 34
            if (r4 == r9) goto L_0x0103
            r9 = 43
            if (r4 == r9) goto L_0x0103
            r9 = 45
            if (r4 != r9) goto L_0x011c
        L_0x0103:
            di3.d r4 = di3.C86312j.m106911c(r3)
            ht1.t1 r4 = (ht1.C60200t1) r4
            boolean r4 = r4.mo76873sF()
            if (r4 != 0) goto L_0x011b
            di3.d r4 = di3.C86312j.m106911c(r2)
            h81.h r4 = (h81.C32735h) r4
            int r4 = r4.mo58779Qe(r1, r13)
            if (r4 != 0) goto L_0x011c
        L_0x011b:
            r12 = 1
        L_0x011c:
            te3.j00 r4 = r7.ContentObj
            int r9 = r4.f298424e
            if (r9 != r14) goto L_0x013f
            te3.p81 r4 = r4.f298435s
            if (r4 == 0) goto L_0x013f
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.t1 r3 = (ht1.C60200t1) r3
            boolean r3 = r3.mo76873sF()
            if (r3 != 0) goto L_0x013e
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            int r1 = r2.mo58779Qe(r1, r13)
            if (r1 != 0) goto L_0x013f
        L_0x013e:
            r12 = 1
        L_0x013f:
            te3.j00 r1 = r7.ContentObj
            if (r1 == 0) goto L_0x014a
            te3.t23 r1 = r1.f298439w
            if (r1 == 0) goto L_0x014a
            java.lang.String r1 = r1.f185476x
            goto L_0x014b
        L_0x014a:
            r1 = 0
        L_0x014b:
            if (r1 != 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r11 = r1
        L_0x014f:
            java.lang.String r1 = "wx485a97c844086dc9"
            boolean r1 = gy3.C87412m.m108589b(r1, r11)
            if (r1 == 0) goto L_0x0159
            goto L_0x015a
        L_0x0159:
            r14 = r12
        L_0x015a:
            if (r8 == 0) goto L_0x0161
            java.lang.String r12 = r8.toString()
            goto L_0x0162
        L_0x0161:
            r12 = 0
        L_0x0162:
            r0.f287975f1 = r12
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            r0.f287974e1 = r1
            goto L_0x016f
        L_0x016b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.f287973d1 = r1
        L_0x016f:
            te3.w25 r1 = r7.webSearchInfo
            if (r1 == 0) goto L_0x0191
            java.lang.String r1 = r1.f259899d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0191
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131838105(0x7f114499, float:1.9309424E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            java.lang.String r2 = "getString(\n             …_brand_name\n            )"
            gy3.C87412m.m108593f(r1, r2)
            r0.f287975f1 = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.f287973d1 = r1
        L_0x0191:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gu2.C98214b.mo137513K2():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0100  */
    /* renamed from: L2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137514L2() {
        /*
            r9 = this;
            java.lang.String r0 = "setupGameInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r9.mo137509G2()
            r3 = 0
            if (r2 == 0) goto L_0x0012
            te3.k1 r2 = r2.actionInfo
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            java.lang.String r4 = ""
            if (r2 != 0) goto L_0x001f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r9.f287967X0 = r2
            r9.f287968Y0 = r4
            goto L_0x0111
        L_0x001f:
            java.lang.Class<ym.l> r5 = p763ym.C79138l.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ym.l r5 = (p763ym.C79138l) r5
            te3.g1 r6 = r2.f298580j
            if (r6 == 0) goto L_0x002d
            java.lang.String r3 = r6.f298271d
        L_0x002d:
            boolean r3 = r5.Lw0(r3)
            if (r3 == 0) goto L_0x010d
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r9.f287967X0 = r3
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            te3.s5 r5 = r2.f298584q
            if (r5 == 0) goto L_0x00b0
            te3.s5 r5 = r2.f298585r
            if (r5 == 0) goto L_0x00b0
            java.lang.Class<om.f> r5 = p214om.C11502f.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            om.f r5 = (p214om.C11502f) r5
            wc3.y r5 = r5.mo11461Sr()
            te3.g1 r6 = r2.f298580j
            java.lang.String r6 = r6.f298271d
            boolean r3 = r5.mo93140D5(r3, r6)
            if (r3 == 0) goto L_0x005c
            te3.s5 r3 = r2.f298584q
            goto L_0x005e
        L_0x005c:
            te3.s5 r3 = r2.f298585r
        L_0x005e:
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            if (r5 == 0) goto L_0x00a7
            int r6 = r5.hashCode()
            r7 = 115861276(0x6e7e71c, float:8.7232127E-35)
            if (r6 == r7) goto L_0x0095
            r7 = 115861428(0x6e7e7b4, float:8.7233E-35)
            if (r6 == r7) goto L_0x0082
            r7 = 115861812(0x6e7e934, float:8.7235204E-35)
            if (r6 == r7) goto L_0x0078
            goto L_0x00a7
        L_0x0078:
            java.lang.String r6 = "zh_TW"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x008c
            goto L_0x00a7
        L_0x0082:
            java.lang.String r6 = "zh_HK"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x008c
            goto L_0x00a7
        L_0x008c:
            java.lang.String r3 = r3.f299378f
            java.lang.String r5 = "{\n                      …_TW\n                    }"
            gy3.C87412m.m108593f(r3, r5)
            goto L_0x00d6
        L_0x0095:
            java.lang.String r6 = "zh_CN"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00a7
            java.lang.String r3 = r3.f299377e
            java.lang.String r5 = "{\n                      …_CN\n                    }"
            gy3.C87412m.m108593f(r3, r5)
            goto L_0x00d6
        L_0x00a7:
            java.lang.String r3 = r3.f299376d
            java.lang.String r5 = "{\n                      ….en\n                    }"
            gy3.C87412m.m108593f(r3, r5)
            goto L_0x00d6
        L_0x00b0:
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.p106ui.C96318y1.m123549c(r3, r2)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x00d5 }
            if (r6 != 0) goto L_0x00d5
            android.content.res.Resources r6 = r3.getResources()     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r7 = "string"
            java.lang.String r8 = r3.getPackageName()     // Catch:{ Exception -> 0x00d5 }
            int r5 = r6.getIdentifier(r5, r7, r8)     // Catch:{ Exception -> 0x00d5 }
            if (r5 <= 0) goto L_0x00d5
            java.lang.String r3 = r3.getString(r5)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r5 = "context.getString(id)"
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00d6
        L_0x00d5:
            r3 = r4
        L_0x00d6:
            int r5 = r2.f298574d
            r6 = 4
            if (r5 == r6) goto L_0x00f4
            r6 = 5
            if (r5 == r6) goto L_0x00e8
            r2 = 6
            if (r5 == r2) goto L_0x00f4
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r9.f287967X0 = r2
            r9.f287968Y0 = r4
            goto L_0x00fa
        L_0x00e8:
            int r2 = r2.f298576f
            r4 = 1
            if (r2 != r4) goto L_0x00fa
            r9.f287968Y0 = r3
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r9.f287967X0 = r2
            goto L_0x00fa
        L_0x00f4:
            r9.f287968Y0 = r3
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r9.f287967X0 = r2
        L_0x00fa:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 == 0) goto L_0x0111
            java.lang.String r2 = "MicroMsg.Improve.SnsInfo"
            java.lang.String r3 = "text can not load ?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r9.f287967X0 = r2
            goto L_0x0111
        L_0x010d:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r9.f287967X0 = r2
        L_0x0111:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gu2.C98214b.mo137514L2():void");
    }

    /* renamed from: M2 */
    public final void mo137515M2() {
        SnsMethodCalculate.markStartTimeMs("setupWithUserInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        SnsObject D2 = mo137506D2();
        if (D2.WithUserList.size() > 0) {
            if (!C87412m.m108589b(C92093b.f263643a.mo126084a(), D2.Username)) {
                Iterator<w64> it = D2.WithUserList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C87412m.m108589b(C92093b.f263643a.mo126084a(), it.next().f299703d)) {
                            Boolean bool = Boolean.TRUE;
                            this.f287970a1 = bool;
                            this.f287972c1 = bool;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                this.f287970a1 = Boolean.TRUE;
                StringBuffer stringBuffer = new StringBuffer();
                boolean z = false;
                Iterator<w64> it4 = D2.WithUserList.iterator();
                while (it4.hasNext()) {
                    w64 next = it4.next();
                    if (!z) {
                        z = true;
                        stringBuffer.append("  ");
                    } else {
                        stringBuffer.append(",  ");
                    }
                    String str = next.f299704e;
                    if (str != null) {
                        stringBuffer.append(str);
                    } else {
                        C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(next.f299703d);
                        stringBuffer.append(H3 == null ? next.f299703d : H3.mo62898f());
                    }
                }
                this.f287971b1 = stringBuffer.toString();
            }
        } else {
            this.f287970a1 = Boolean.FALSE;
        }
        SnsMethodCalculate.markEndTimeMs("setupWithUserInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
    }

    public final LinkedList<w64> getCommentList() {
        SnsMethodCalculate.markStartTimeMs("getCommentList", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        Object value = ((C36570n) this.f287981l1).getValue();
        C87412m.m108593f(value, "<get-commentList>(...)");
        LinkedList<w64> linkedList = (LinkedList) value;
        SnsMethodCalculate.markEndTimeMs("getCommentList", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return linkedList;
    }

    public final boolean isAd() {
        SnsMethodCalculate.markStartTimeMs("isAd", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        SnsMethodCalculate.markStartTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean z = (getSourceType() & 32) > 0;
        SnsMethodCalculate.markEndTimeMs("isSourceExist", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        SnsMethodCalculate.markEndTimeMs("isAd", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return z;
    }

    public final boolean isDieItem() {
        SnsMethodCalculate.markStartTimeMs("isDieItem", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean z = (getLocalFlag() & 32) > 0 && mo142401p2() == 0;
        SnsMethodCalculate.markEndTimeMs("isDieItem", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return z;
    }

    public void setCreateTime(int i) {
        SnsMethodCalculate.markStartTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (i - getCreateTime() >= 180 || i - getCreateTime() < 0) {
            super.setCreateTime(i);
            setHead(SnsInfo.formatUnixTime((long) i));
            SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            return;
        }
        if (getHead() == 0) {
            setHead(SnsInfo.formatUnixTime((long) getCreateTime()));
        }
        SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        String str = "ImproveInfo(name=" + mo137524x2() + ", snsID='" + mo137504B2() + "', ad:" + isAd() + ", time:" + mo137508F2() + " rowid=" + mo137526z2() + ", createTime=" + getCreateTime() + " localFlag=" + getLocalFlag() + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    /* renamed from: u2 */
    public final String mo137521u2() {
        SnsMethodCalculate.markStartTimeMs("getAddressText", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (this.f287966W0 == null) {
            mo137512J2();
        }
        String str = this.f287966W0;
        SnsMethodCalculate.markEndTimeMs("getAddressText", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    /* renamed from: v2 */
    public final C72996z1 mo137522v2() {
        SnsMethodCalculate.markStartTimeMs("getContact", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        Log.m105918d("MicroMsg.Improve.SnsInfo", "get contact: userName=" + getUserName());
        C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(getUserName());
        SnsMethodCalculate.markEndTimeMs("getContact", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return H3;
    }

    /* renamed from: w2 */
    public final String mo137523w2() {
        SnsMethodCalculate.markStartTimeMs("getContentByteMd5", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (this.f287969Z0 == null) {
            this.f287969Z0 = C90193h.m112878f(mo142399n2()) + C90193h.m112878f(mo142398m2());
        }
        String str = this.f287969Z0;
        SnsMethodCalculate.markEndTimeMs("getContentByteMd5", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    /* renamed from: x2 */
    public final String mo137524x2() {
        String str;
        SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        StringBuilder sb = new StringBuilder();
        sb.append("get displayName: ");
        C72996z1 v2 = mo137522v2();
        String str2 = null;
        sb.append(v2 != null ? Integer.valueOf(v2.hashCode()) : null);
        sb.append(", displayRemark=");
        C72996z1 v25 = mo137522v2();
        if (v25 != null) {
            str2 = v25.mo62898f();
        }
        sb.append(str2);
        sb.append(", userName=");
        sb.append(getUserName());
        Log.m105918d("MicroMsg.Improve.SnsInfo", sb.toString());
        C72996z1 v26 = mo137522v2();
        if (v26 == null || (str = v26.mo62898f()) == null) {
            str = getUserName();
        }
        SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return str;
    }

    /* renamed from: y2 */
    public final C98780b<C117882j> mo137525y2() {
        SnsMethodCalculate.markStartTimeMs("getLikeUserList", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        Object value = ((C36570n) this.f287982m1).getValue();
        C87412m.m108593f(value, "<get-likeUserList>(...)");
        C98780b<C117882j> bVar = (C98780b) value;
        SnsMethodCalculate.markEndTimeMs("getLikeUserList", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return bVar;
    }

    /* renamed from: z2 */
    public final long mo137526z2() {
        SnsMethodCalculate.markStartTimeMs("getLocalIDNumber", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        long longValue = ((Number) ((C36570n) this.f287962S0).getValue()).longValue();
        SnsMethodCalculate.markEndTimeMs("getLocalIDNumber", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        return longValue;
    }
}
