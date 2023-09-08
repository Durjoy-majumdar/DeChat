package p51;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53975z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import kotlin.ResultKt;
import p821rk.C48033f;
import q51.C47756c;
import r51.C110503b;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.SpringLuckyEggHelper$checkCanShowEgg$1", mo125469f = "SpringLuckyEggHelper.kt", mo125470l = {41}, mo125471m = "invokeSuspend")
/* renamed from: p51.h */
public final class C110185h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f329627d;

    /* renamed from: e */
    public final /* synthetic */ C110187i f329628e;

    /* renamed from: f */
    public final /* synthetic */ String f329629f;

    /* renamed from: g */
    public final /* synthetic */ String f329630g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.SpringLuckyEggHelper$checkCanShowEgg$1$resp$1", mo125469f = "SpringLuckyEggHelper.kt", mo125470l = {42}, mo125471m = "invokeSuspend")
    /* renamed from: p51.h$a */
    public static final class C110186a extends C91594j implements C32227p<C0000n0, C15601d<? super C48033f>, Object> {

        /* renamed from: d */
        public int f329631d;

        /* renamed from: e */
        public final /* synthetic */ String f329632e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110186a(String str, C15601d<? super C110186a> dVar) {
            super(2, dVar);
            this.f329632e = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110186a(this.f329632e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110186a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f329631d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C47756c cVar = new C47756c(this.f329632e, "", 1);
                this.f329631d = 1;
                obj = C110175b.m149770a(cVar, this);
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
    public C110185h(C110187i iVar, String str, String str2, C15601d<? super C110185h> dVar) {
        super(2, dVar);
        this.f329628e = iVar;
        this.f329629f = str;
        this.f329630g = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110185h(this.f329628e, this.f329629f, this.f329630g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110185h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C32226l<? super C110503b, C13598b0> lVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f329627d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C110186a aVar2 = new C110186a(this.f329629f, (C15601d<? super C110186a>) null);
            this.f329627d = 1;
            obj = C53860b3.m60374b(10000, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C110174a e) {
                Log.m105928w("MicroMsg.SpringLuckyEggHelper", "Unable to check if we can show lucky egg: " + e.getMessage());
                C13598b0 b0Var = C13598b0.f38549a;
                this.f329628e.f329637e = null;
                return b0Var;
            } catch (C53975z2 unused) {
                Log.m105928w("MicroMsg.SpringLuckyEggHelper", "Timeout to check can show luck egg");
                C13598b0 b0Var2 = C13598b0.f38549a;
                this.f329628e.f329637e = null;
                return b0Var2;
            } catch (Throwable th) {
                this.f329628e.f329637e = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C48033f fVar = (C48033f) obj;
        this.f329628e.f329636d = fVar.f128838f;
        Log.m105924i("MicroMsg.SpringLuckyEggHelper", "should play lucky egg:" + fVar.f128837e + " interval=" + this.f329628e.f329636d + ", traceId=" + fVar.f128836d);
        if (fVar.f128837e == 1 && (lVar = this.f329628e.f329637e) != null) {
            lVar.invoke(new C110503b(this.f329629f, fVar.f128836d, this.f329630g, true, fVar.f128838f, (String) null, 32, (C8480h) null));
        }
        this.f329628e.f329637e = null;
        return C13598b0.f38549a;
    }
}
