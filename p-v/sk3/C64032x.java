package sk3;

import a11.C39479c;
import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import f14.C58901s;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C45983e0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Date;
import kotlin.ResultKt;
import kr0.C76629w0;
import ok3.C62066a;
import ok3.C62067b;
import ok3.C62070e;
import ok3.C62074i;
import p158gt.C98201k;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemAppBrandUIC$updateMatchInfo$1", mo125469f = "FTSMultiItemAppBrandUIC.kt", mo125470l = {165}, mo125471m = "invokeSuspend")
/* renamed from: sk3.x */
public final class C64032x extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181549d;

    /* renamed from: e */
    public /* synthetic */ Object f181550e;

    /* renamed from: f */
    public final /* synthetic */ C64028w f181551f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<C72963f4> f181552g;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemAppBrandUIC$updateMatchInfo$1$2", mo125469f = "FTSMultiItemAppBrandUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.x$a */
    public static final class C64033a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C64028w f181553d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C62070e> f181554e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64033a(C64028w wVar, ArrayList<C62070e> arrayList, C15601d<? super C64033a> dVar) {
            super(2, dVar);
            this.f181553d = wVar;
            this.f181554e = arrayList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64033a(this.f181553d, this.f181554e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64033a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C64028w wVar = this.f181553d;
            ArrayList<C62070e> arrayList = this.f181554e;
            wVar.getClass();
            C87412m.m108594g(arrayList, "<set-?>");
            wVar.f181421j = arrayList;
            this.f181553d.f181419h.setValue(C62074i.FINISH);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64032x(C64028w wVar, ArrayList<C72963f4> arrayList, C15601d<? super C64032x> dVar) {
        super(2, dVar);
        this.f181551f = wVar;
        this.f181552g = arrayList;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C64032x xVar = new C64032x(this.f181551f, this.f181552g, dVar);
        xVar.f181550e = obj;
        return xVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64032x) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C0000n0 n0Var;
        C15911a aVar;
        String str;
        C8479f0 f0Var;
        C68070l.C68072b u;
        String str2;
        String str3;
        String str4;
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181549d;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var2 = (C0000n0) this.f181550e;
            ArrayList arrayList = new ArrayList();
            String str5 = "FTSMultiItemAppBrandUIC";
            Log.m105924i(str5, "searchJob start >> " + Thread.currentThread().getName());
            C8479f0 f0Var2 = new C8479f0();
            if (C72996z1.m85820U5(this.f181551f.f181423o)) {
                f0Var2.f27484d = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f181551f.f181423o);
            }
            C45983e0 e0Var = new C45983e0();
            ArrayList<C72963f4> arrayList2 = this.f181552g;
            C64028w wVar = this.f181551f;
            for (C72963f4 f4Var : arrayList2) {
                if (!C53930o0.m60560g(n0Var2)) {
                    Log.m105924i(str5, "is no active");
                    return C13598b0.f38549a;
                }
                String content = f4Var.getContent();
                if (content == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null) {
                    aVar = aVar2;
                    n0Var = n0Var2;
                    f0Var = f0Var2;
                    str = str5;
                } else {
                    long a = C74763a.m89510e().mo103933a(new Date(f4Var.getCreateTime()));
                    C68070l.C68072b bVar = u;
                    if (e0Var.f124000d != a) {
                        aVar = aVar2;
                        n0Var = n0Var2;
                        arrayList.add(new C62067b(f4Var.getCreateTime()));
                    } else {
                        aVar = aVar2;
                        n0Var = n0Var2;
                    }
                    boolean U5 = C72996z1.m85820U5(wVar.f181423o);
                    String str6 = "";
                    if (f4Var.mo108769t2() == i2) {
                        str2 = C75592q0.m90789s();
                    } else {
                        str2 = U5 ? C75604z3.m90847s(f4Var.getContent()) : str6;
                        if (Util.isNullOrNil(str2)) {
                            str2 = f4Var.mo108768t();
                        }
                    }
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
                    if (f0Var2.f27484d != null) {
                        if (!(str2 == null || str2.length() == 0)) {
                            str6 = ((C44661m1) f0Var2.f27484d).mo69789q2(str2);
                            C87412m.m108593f(str6, "member.getDisplayName(username)");
                        }
                    }
                    C68070l.C68072b bVar2 = bVar;
                    C62066a aVar3 = new C62066a(f4Var.getCreateTime(), bVar2.f195582i, bVar2.f195570f, f4Var.getMsgId(), z1Var != null ? z1Var.getUsername() : null, z1Var != null ? z1Var.mo62909j3() : null, z1Var != null ? z1Var.mo73969n2() : null, str6);
                    aVar3.f176445i = Util.nullAs(bVar2.f195577g2, bVar2.f195562d);
                    aVar3.f176446j = bVar2;
                    f0Var = f0Var2;
                    str = str5;
                    aVar3.f176447k = f4Var.mo108774y2();
                    aVar3.f176448l = bVar2.f195570f;
                    C68070l.C68072b bVar3 = aVar3.f176446j;
                    C87412m.m108591d(bVar3);
                    WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(bVar3.f195573f2);
                    if (N2 != null) {
                        str3 = N2.field_nickname;
                    } else {
                        C68070l.C68072b bVar4 = aVar3.f176446j;
                        C87412m.m108591d(bVar4);
                        str3 = bVar4.f195638w;
                    }
                    aVar3.f176458c = str3;
                    if (N2 != null) {
                        str4 = N2.field_brandIconURL;
                    } else {
                        C68070l.C68072b bVar5 = aVar3.f176446j;
                        C87412m.m108591d(bVar5);
                        str4 = bVar5.f195471B2;
                    }
                    aVar3.f176449m = str4;
                    if (bVar2.f195581h2 != 1) {
                        String h302 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).h30(f4Var.mo108765s2());
                        if (!Util.isNullOrNil(h302)) {
                            aVar3.f176450n = "file://" + h302;
                        }
                    }
                    arrayList.add(aVar3);
                    e0Var.f124000d = a;
                }
                f0Var2 = f0Var;
                str5 = str;
                aVar2 = aVar;
                n0Var2 = n0Var;
                i2 = 1;
            }
            C15911a aVar4 = aVar2;
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C64033a aVar5 = new C64033a(this.f181551f, arrayList, (C15601d<? super C64033a>) null);
            this.f181549d = 1;
            if (C53895h.m60469g(k2Var, aVar5, this) == aVar4) {
                return aVar4;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
