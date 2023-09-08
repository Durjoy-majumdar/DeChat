package wh3;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import mp3.C88819d;
import q40.C12040d;
import q40.C89456b;
import rx3.C13598b0;
import te3.xd4;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.storage.emotion.SwitchLocalEmojiRecommendCgi$Companion$send$1", mo125469f = "SwitchLocalEmojiRecommendCgi.kt", mo125470l = {37}, mo125471m = "invokeSuspend")
/* renamed from: wh3.b0 */
public final class C15405b0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41801d;

    /* renamed from: e */
    public final /* synthetic */ boolean f41802e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15405b0(boolean z, C15601d<? super C15405b0> dVar) {
        super(2, dVar);
        this.f41802e = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15405b0(this.f41802e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15405b0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41801d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.SwitchLocalEmojiRecommendCgi", "sending request: enabled=" + this.f41802e);
            C15406c0 c0Var = new C15406c0(this.f41802e);
            this.f41801d = 1;
            obj = C89456b.m111831a(c0Var, 0, (C88819d) null, this, 3, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C12040d e) {
                Log.m105920e("MicroMsg.SwitchLocalEmojiRecommendCgi", "SwitchLocalEmojiRecommendRequest: " + e.getLocalizedMessage());
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Log.m105924i("MicroMsg.SwitchLocalEmojiRecommendCgi", "received response: " + ((xd4) obj));
        return C13598b0.f38549a;
    }
}
