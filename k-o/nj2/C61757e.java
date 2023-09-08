package nj2;

import a14.C0000n0;
import fy3.C32227p;
import java.util.LinkedList;
import kotlin.ResultKt;
import mp3.C88819d;
import q40.C89456b;
import rx3.C13598b0;
import ve3.C52823a0;
import ve3.C52828c0;
import ve3.C65678d0;
import ve3.C65680f;
import vj2.C52939i;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.PluginRingtone$Companion$getSingleFinderRingBackPlayInfo$2", mo125469f = "PluginRingtone.kt", mo125470l = {241}, mo125471m = "invokeSuspend")
/* renamed from: nj2.e */
public final class C61757e extends C91594j implements C32227p<C0000n0, C15601d<? super C52823a0>, Object> {

    /* renamed from: d */
    public int f175546d;

    /* renamed from: e */
    public final /* synthetic */ long f175547e;

    /* renamed from: f */
    public final /* synthetic */ String f175548f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61757e(long j, String str, C15601d<? super C61757e> dVar) {
        super(2, dVar);
        this.f175547e = j;
        this.f175548f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61757e(this.f175547e, this.f175548f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61757e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f175546d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65678d0 d0Var = new C65678d0();
            d0Var.f188979d = 2;
            C65680f fVar = new C65680f();
            long j = this.f175547e;
            String str = this.f175548f;
            fVar.f188983d = j;
            fVar.f188984e = str;
            d0Var.f188981f = fVar;
            LinkedList linkedList = new LinkedList();
            linkedList.add(d0Var);
            C52939i iVar = new C52939i(linkedList);
            this.f175546d = 1;
            obj = C89456b.m111831a(iVar, 0, (C88819d) null, this, 3, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LinkedList<C52823a0> linkedList2 = ((C52828c0) obj).f147577d;
        if (linkedList2 != null) {
            return linkedList2.getFirst();
        }
        return null;
    }
}
