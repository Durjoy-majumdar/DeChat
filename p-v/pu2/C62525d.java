package pu2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import kotlin.ResultKt;
import ls3.C61397g;
import o40.C61926c;
import p565ir.C60606n;
import rx3.C13598b0;
import te3.C48654a21;
import te3.C51576uo2;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64623p81;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2", mo125469f = "ImproveFinderLiveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: pu2.d */
public final class C62525d extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C62510b f177603d;

    /* renamed from: e */
    public final /* synthetic */ C64623p81 f177604e;

    /* renamed from: f */
    public final /* synthetic */ C51713vn0 f177605f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62525d(C62510b bVar, C64623p81 p812, C51713vn0 vn02, C15601d<? super C62525d> dVar) {
        super(2, dVar);
        this.f177603d = bVar;
        this.f177604e = p812;
        this.f177605f = vn02;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
        C62525d dVar2 = new C62525d(this.f177603d, this.f177604e, this.f177605f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
        return dVar2;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
        Object invokeSuspend = ((C62525d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        C48654a21 a212;
        LinkedList<C48654a21> linkedList;
        T t;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
        ResultKt.throwOnFailure(obj);
        C62510b bVar = this.f177603d;
        C64623p81 p812 = this.f177604e;
        C51713vn0 vn02 = this.f177605f;
        int i = C62510b.f177565a1;
        SnsMethodCalculate.markStartTimeMs("access$getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        C62552v0 v0Var = new C62552v0((String) null, (String) null, 3, (C8480h) null);
        C51576uo2 uo22 = vn02 != null ? vn02.f143580o : null;
        if (vn02 == null || (linkedList = vn02.f143586u) == null) {
            a212 = null;
        } else {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C48654a21) t).f130235i == 2) {
                    break;
                }
            }
            a212 = (C48654a21) t;
        }
        String str = a212 != null ? a212.f130230d : null;
        String str2 = "";
        if (!(str == null || str.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a212 != null ? a212.f130230d : null);
            sb.append(Util.nullAsNil(a212 != null ? a212.f130231e : null));
            v0Var.mo87558d(sb.toString());
            String str3 = a212 != null ? a212.f130230d : null;
            if (str3 != null) {
                str2 = str3;
            }
            v0Var.mo87557c(str2);
        } else {
            String str4 = uo22 != null ? uo22.f142984d : null;
            if (!(str4 == null || str4.length() == 0)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(uo22 != null ? uo22.f142984d : null);
                sb4.append(Util.nullAsNil(uo22 != null ? uo22.f142985e : null));
                v0Var.mo87558d(sb4.toString());
                String str5 = uo22 != null ? uo22.f142984d : null;
                if (str5 != null) {
                    str2 = str5;
                }
                v0Var.mo87557c(str2);
            } else {
                String str6 = p812.f184783i;
                if (!(str6 == null || str6.length() == 0)) {
                    String str7 = p812.f184783i;
                    if (str7 == null) {
                        str7 = str2;
                    }
                    v0Var.mo87558d(str7);
                    String b = v0Var.mo87556b();
                    SnsMethodCalculate.markStartTimeMs("removeParam", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItemKt");
                    C87412m.m108594g(b, "url");
                    Pattern compile = Pattern.compile("&?token=[^&]*");
                    C87412m.m108593f(compile, "compile(pattern)");
                    String replaceAll = compile.matcher(b).replaceAll(str2);
                    C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                    SnsMethodCalculate.markEndTimeMs("removeParam", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItemKt");
                    v0Var.mo87557c(replaceAll);
                } else {
                    String str8 = p812.f184789r;
                    if (!(str8 == null || str8.length() == 0)) {
                        String str9 = p812.f184789r;
                        if (str9 != null) {
                            str2 = str9;
                        }
                        v0Var.mo87558d(str2);
                        v0Var.mo87557c(v0Var.mo87556b());
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("access$getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        C62510b bVar2 = this.f177603d;
        C64623p81 p813 = this.f177604e;
        C64273c21 c212 = p813.f184761E;
        SnsMethodCalculate.markStartTimeMs("access$isChargeLive", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        bVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("isChargeLive", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        boolean I1 = c212 != null ? ((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(c212) : p813.f184759C == 2;
        SnsMethodCalculate.markEndTimeMs("isChargeLive", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("access$isChargeLive", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        C62510b bVar3 = this.f177603d;
        C64623p81 p814 = this.f177604e;
        C64273c21 c213 = p814.f184761E;
        SnsMethodCalculate.markStartTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        boolean P = bVar3.mo87540P(p814, c213);
        SnsMethodCalculate.markEndTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        C62510b bVar4 = this.f177603d;
        C64623p81 p815 = this.f177604e;
        C64273c21 c214 = p815.f184761E;
        SnsMethodCalculate.markStartTimeMs("access$replayAuditing", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        bVar4.getClass();
        Class cls = C61397g.class;
        SnsMethodCalculate.markStartTimeMs("replayAuditing", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        boolean Qg = c214 != null ? ((C61397g) C86312j.m106911c(cls)).mo83480Qg(c214) : ((C61397g) C86312j.m106911c(cls)).X30(C61926c.m72671P(p815.f184778d));
        SnsMethodCalculate.markEndTimeMs("replayAuditing", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("access$replayAuditing", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        C62510b bVar5 = this.f177603d;
        bVar5.mo140441m("MicroMsg.Improve.ImproveFinderLiveTimelineItem", "isChargeLive:" + I1 + " isLiveReplay:" + P + " replayAuditing:" + Qg + " getCoverUrl:" + v0Var);
        if (I1) {
            C62510b.m73477L(this.f177603d, this.f177604e.f184761E, v0Var, 2);
            Boolean bool = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
            return bool;
        } else if (P) {
            C62510b.m73477L(this.f177603d, this.f177604e.f184761E, v0Var, 4);
            Boolean bool2 = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
            return bool2;
        } else if (Qg) {
            C62510b.m73476K(this.f177603d, v0Var, 3);
            Boolean bool3 = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
            return bool3;
        } else {
            C64623p81 p816 = this.f177604e;
            if (p816.f184791t == 1) {
                C62510b.m73477L(this.f177603d, p816.f184761E, v0Var, 0);
                Boolean bool4 = Boolean.TRUE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
                return bool4;
            }
            C62510b.m73476K(this.f177603d, v0Var, 0);
            Boolean bool5 = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$updateLiveTag$2");
            return bool5;
        }
    }
}
