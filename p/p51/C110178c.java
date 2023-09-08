package p51;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53975z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p821rk.C48037j;
import q51.C47755b;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.EggMiniAppHelper$checkShowEgg$1", mo125469f = "EggMiniAppHelper.kt", mo125470l = {45}, mo125471m = "invokeSuspend")
/* renamed from: p51.c */
public final class C110178c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f329599d;

    /* renamed from: e */
    public final /* synthetic */ C110180d f329600e;

    /* renamed from: f */
    public final /* synthetic */ Long f329601f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.EggMiniAppHelper$checkShowEgg$1$resp$1", mo125469f = "EggMiniAppHelper.kt", mo125470l = {46}, mo125471m = "invokeSuspend")
    /* renamed from: p51.c$a */
    public static final class C110179a extends C91594j implements C32227p<C0000n0, C15601d<? super C48037j>, Object> {

        /* renamed from: d */
        public int f329602d;

        /* renamed from: e */
        public final /* synthetic */ Long f329603e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110179a(Long l, C15601d<? super C110179a> dVar) {
            super(2, dVar);
            this.f329603e = l;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110179a(this.f329603e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110179a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f329602d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Long l = this.f329603e;
                if (l == null || (str = l.toString()) == null) {
                    str = "";
                }
                C47755b bVar = new C47755b(str);
                this.f329602d = 1;
                obj = C110175b.m149770a(bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110178c(C110180d dVar, Long l, C15601d<? super C110178c> dVar2) {
        super(2, dVar2);
        this.f329600e = dVar;
        this.f329601f = l;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110178c(this.f329600e, this.f329601f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110178c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f329599d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C110179a aVar2 = new C110179a(this.f329601f, (C15601d<? super C110179a>) null);
            this.f329599d = 1;
            obj = C53860b3.m60374b(10000, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C110174a e) {
                this.f329600e.getClass();
                Log.m105928w("MicroMsg.EggMiniAppHelper", "Cgi error: " + e.getMessage());
            } catch (C53975z2 unused) {
                this.f329600e.getClass();
                Log.m105928w("MicroMsg.EggMiniAppHelper", "Cgi Timeout: ");
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C48037j jVar = (C48037j) obj;
        this.f329600e.f329607d = jVar.f128848f * 1000;
        Log.m105924i("MicroMsg.EggMiniAppHelper", "checkShowEgg: " + jVar.f128846d + ", " + jVar.f128849g + ", " + jVar.f128848f);
        if (jVar.f128846d && (str = jVar.f128849g) != null) {
            C110180d dVar = this.f329600e;
            dVar.getClass();
            dVar.f329609f = str;
            C32227p<? super Boolean, ? super String, C13598b0> pVar = this.f329600e.f329608e;
            if (pVar != null) {
                Boolean bool = Boolean.TRUE;
                String str2 = jVar.f128849g;
                C87412m.m108593f(str2, "resp.emoticon_prize");
                pVar.invoke(bool, str2);
            }
        }
        return C13598b0.f38549a;
    }
}
