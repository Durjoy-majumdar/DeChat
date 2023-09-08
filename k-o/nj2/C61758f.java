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
import ve3.C65679e0;
import vj2.C52939i;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.PluginRingtone$Companion$getSingleMusicRingBackPlayInfo$2", mo125469f = "PluginRingtone.kt", mo125470l = {222}, mo125471m = "invokeSuspend")
/* renamed from: nj2.f */
public final class C61758f extends C91594j implements C32227p<C0000n0, C15601d<? super C52823a0>, Object> {

    /* renamed from: d */
    public int f175549d;

    /* renamed from: e */
    public final /* synthetic */ int f175550e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61758f(int i, C15601d<? super C61758f> dVar) {
        super(2, dVar);
        this.f175550e = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61758f(this.f175550e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61758f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C52823a0 first;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f175549d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65678d0 d0Var = new C65678d0();
            d0Var.f188979d = 1;
            C65679e0 e0Var = new C65679e0();
            e0Var.f188982d = this.f175550e;
            d0Var.f188980e = e0Var;
            LinkedList linkedList = new LinkedList();
            linkedList.add(d0Var);
            C52939i iVar = new C52939i(linkedList);
            this.f175549d = 1;
            obj = C89456b.m111831a(iVar, 0, (C88819d) null, this, 3, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LinkedList<C52823a0> linkedList2 = ((C52828c0) obj).f147577d;
        if (linkedList2 == null || (first = linkedList2.getFirst()) == null) {
            return null;
        }
        return first;
    }
}
