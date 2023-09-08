package cj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import ig1.C8916d;
import java.util.LinkedList;
import kotlin.ResultKt;
import p165hr.C60106t;
import rx3.C13598b0;
import te3.C51765w03;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$checkAndDownloadMultiAnimation$1", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {452}, mo125471m = "invokeSuspend")
/* renamed from: cj1.x1 */
public final class C0635x1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f1499d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C51765w03> f1500e;

    /* renamed from: f */
    public final /* synthetic */ String f1501f;

    /* renamed from: g */
    public final /* synthetic */ C8916d f1502g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0635x1(LinkedList<C51765w03> linkedList, String str, C8916d dVar, C15601d<? super C0635x1> dVar2) {
        super(2, dVar2);
        this.f1500e = linkedList;
        this.f1501f = str;
        this.f1502g = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0635x1(this.f1500e, this.f1501f, this.f1502g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0635x1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f1499d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0639y1 y1Var = C0639y1.f1510a;
            LinkedList<C51765w03> linkedList = this.f1500e;
            String str = this.f1501f;
            C8916d dVar = this.f1502g;
            this.f1499d = 1;
            obj = C53895h.m60469g(C53872d1.f151119c, new C0519b2(linkedList, str, dVar, (C15601d<? super C0519b2>) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C8916d dVar2 = C0639y1.f1513d.get(this.f1501f);
        if (!booleanValue || dVar2 == null) {
            Log.m105928w("Finder.FinderLiveGiftLoader", "checkAndDownloadMultiAnimation id:" + this.f1501f + " failed, succ:" + booleanValue + ", lastestGiftInfo:" + dVar2);
        } else {
            ((C60106t) C86312j.m106911c(C60106t.class)).zx0().replace(dVar2);
            Log.m105924i("Finder.FinderLiveGiftLoader", "checkAndDownloadMultiAnimation id:" + this.f1501f + " succ");
        }
        return C13598b0.f38549a;
    }
}
