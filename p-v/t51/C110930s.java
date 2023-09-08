package t51;

import a14.C0000n0;
import a14.C53965x0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import kotlin.ResultKt;
import p51.C110174a;
import p51.C110175b;
import q51.C47758e;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggViewModel$acceptMoney$1", mo125469f = "SpringLuckyEggViewModel.kt", mo125470l = {139, 142}, mo125471m = "invokeSuspend")
/* renamed from: t51.s */
public final class C110930s extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f331771d;

    /* renamed from: e */
    public final /* synthetic */ long f331772e;

    /* renamed from: f */
    public final /* synthetic */ C110935w f331773f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110930s(long j, C110935w wVar, C15601d<? super C110930s> dVar) {
        super(2, dVar);
        this.f331772e = j;
        this.f331773f = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110930s(this.f331772e, this.f331773f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110930s) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C54219z<Boolean> zVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f331771d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.f331772e;
            String str = this.f331773f.f331786g;
            if (str == null) {
                str = "";
            }
            C47758e eVar = new C47758e("", 1, j, str);
            this.f331771d = 1;
            if (C110175b.m149770a(eVar, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            try {
                ResultKt.throwOnFailure(obj);
                this.f331773f.f331788i.setValue(Boolean.FALSE);
                zVar = this.f331773f.f331795s;
            } catch (C110174a e) {
                Log.m105928w("MicroMsg.SpringLuckyEggViewModel", "unable to accept money: " + e.getMessage());
                this.f331773f.f331788i.setValue(Boolean.FALSE);
                zVar = this.f331773f.f331795s;
            } catch (Throwable th) {
                this.f331773f.f331788i.setValue(Boolean.FALSE);
                this.f331773f.f331795s.setValue(Boolean.TRUE);
                throw th;
            }
            zVar.setValue(Boolean.TRUE);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long milliSecondsToNow = Util.milliSecondsToNow(this.f331773f.f331796t);
        if (milliSecondsToNow < 2000) {
            this.f331771d = 2;
            if (C53965x0.m60607b(((long) 2000) - milliSecondsToNow, this) == aVar) {
                return aVar;
            }
        }
        this.f331773f.f331788i.setValue(Boolean.FALSE);
        zVar = this.f331773f.f331795s;
        zVar.setValue(Boolean.TRUE);
        return C13598b0.f38549a;
    }
}
