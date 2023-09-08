package sk3;

import a11.C39479c;
import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
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
import ok3.C62067b;
import ok3.C62068c;
import ok3.C62070e;
import ok3.C62074i;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemFileUIC$updateMatchInfo$1", mo125469f = "FTSMultiItemFileUIC.kt", mo125470l = {100}, mo125471m = "invokeSuspend")
/* renamed from: sk3.z */
public final class C64037z extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181561d;

    /* renamed from: e */
    public /* synthetic */ Object f181562e;

    /* renamed from: f */
    public final /* synthetic */ C64034y f181563f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<C72963f4> f181564g;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemFileUIC$updateMatchInfo$1$2", mo125469f = "FTSMultiItemFileUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.z$a */
    public static final class C64038a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C64034y f181565d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C62070e> f181566e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64038a(C64034y yVar, ArrayList<C62070e> arrayList, C15601d<? super C64038a> dVar) {
            super(2, dVar);
            this.f181565d = yVar;
            this.f181566e = arrayList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64038a(this.f181565d, this.f181566e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64038a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C64034y yVar = this.f181565d;
            ArrayList<C62070e> arrayList = this.f181566e;
            yVar.getClass();
            C87412m.m108594g(arrayList, "<set-?>");
            yVar.f181421j = arrayList;
            this.f181565d.f181419h.setValue(C62074i.FINISH);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64037z(C64034y yVar, ArrayList<C72963f4> arrayList, C15601d<? super C64037z> dVar) {
        super(2, dVar);
        this.f181563f = yVar;
        this.f181564g = arrayList;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C64037z zVar = new C64037z(this.f181563f, this.f181564g, dVar);
        zVar.f181562e = obj;
        return zVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64037z) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C8479f0 f0Var;
        C0000n0 n0Var;
        C15911a aVar;
        C68070l.C68072b u;
        String str;
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181561d;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var2 = (C0000n0) this.f181562e;
            ArrayList arrayList = new ArrayList();
            Log.m105924i("MicroMsg.FTSMultiItemFileUIC", "fileSearchJob start >> " + Thread.currentThread().getName());
            C8479f0 f0Var2 = new C8479f0();
            if (C72996z1.m85820U5(this.f181563f.f181423o)) {
                f0Var2.f27484d = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f181563f.f181423o);
            }
            C45983e0 e0Var = new C45983e0();
            ArrayList<C72963f4> arrayList2 = this.f181564g;
            C64034y yVar = this.f181563f;
            for (C72963f4 f4Var : arrayList2) {
                if (!C53930o0.m60560g(n0Var2)) {
                    Log.m105924i("MicroMsg.FTSMultiItemFileUIC", "is no active");
                    return C13598b0.f38549a;
                }
                String content = f4Var.getContent();
                if (content == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null) {
                    aVar = aVar2;
                    n0Var = n0Var2;
                    f0Var = f0Var2;
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
                    boolean U5 = C72996z1.m85820U5(yVar.f181423o);
                    String str2 = "";
                    if (f4Var.mo108769t2() == i2) {
                        str = C75592q0.m90789s();
                    } else {
                        str = U5 ? C75604z3.m90847s(f4Var.getContent()) : str2;
                        if (Util.isNullOrNil(str)) {
                            str = f4Var.mo108768t();
                        }
                    }
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                    if (f0Var2.f27484d != null) {
                        if (!(str == null || str.length() == 0)) {
                            str2 = ((C44661m1) f0Var2.f27484d).mo69789q2(str);
                            C87412m.m108593f(str2, "member.getDisplayName(username)");
                        }
                    }
                    String str3 = str2;
                    C68070l.C68072b bVar2 = bVar;
                    int d = C93693r.m118403d(bVar2.f195602n);
                    f0Var = f0Var2;
                    C62068c cVar = new C62068c(f4Var.getCreateTime(), bVar2.f195582i, bVar2.f195570f, f4Var.getMsgId(), z1Var != null ? z1Var.getUsername() : null, z1Var != null ? z1Var.mo62909j3() : null, z1Var != null ? z1Var.mo73969n2() : null, str3);
                    cVar.f176451i = d;
                    cVar.f176452j = Util.getSizeKB((long) bVar2.f195594l);
                    arrayList.add(cVar);
                    e0Var.f124000d = a;
                }
                aVar2 = aVar;
                n0Var2 = n0Var;
                f0Var2 = f0Var;
                i2 = 1;
            }
            C15911a aVar3 = aVar2;
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C64038a aVar4 = new C64038a(this.f181563f, arrayList, (C15601d<? super C64038a>) null);
            this.f181561d = 1;
            if (C53895h.m60469g(k2Var, aVar4, this) == aVar3) {
                return aVar3;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
