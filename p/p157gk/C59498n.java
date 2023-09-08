package p157gk;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import android.graphics.Bitmap;
import android.util.Pair;
import au3.C54328a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.WeOcr;
import fy3.C32227p;
import gy3.C87412m;
import ja3.C60786a;
import java.nio.Buffer;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$applyLocateOcrKeywordReq$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {496}, mo125471m = "invokeSuspend")
/* renamed from: gk.n */
public final class C59498n extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public int f170018d;

    /* renamed from: e */
    public final /* synthetic */ String f170019e;

    /* renamed from: f */
    public final /* synthetic */ String f170020f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59498n(String str, String str2, C15601d<? super C59498n> dVar) {
        super(2, dVar);
        this.f170019e = str;
        this.f170020f = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59498n(this.f170019e, this.f170020f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59498n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f170018d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (C59503r.f170043d == null) {
                C59503r.f170043d = C53930o0.m60555b();
            }
            Log.m105924i("MicroMsg.ImageQuerySDKCore", "applyLocateOcrKeywordReq start, " + Thread.currentThread().getName());
            C59503r rVar = C59503r.f170040a;
            String str = this.f170019e;
            this.f170018d = 1;
            rVar.getClass();
            obj = C53895h.m60469g(C54328a.f152462f, new C59516s(str, false, (C15601d<? super C59516s>) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Pair pair = (Pair) obj;
        Buffer buffer = (Buffer) pair.first;
        Bitmap bitmap = (Bitmap) pair.second;
        if (bitmap == null || buffer == null) {
            Log.m105920e("MicroMsg.ImageQuerySDKCore", "applyLocateOcrKeywordReq >> decode error " + this.f170019e);
            return "";
        }
        C60786a aVar2 = C59503r.f170042c;
        if (aVar2 == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String str2 = this.f170020f;
        C87412m.m108594g(str2, "keyWords");
        long j = aVar2.f173136d;
        if (j == 0) {
            Log.m105920e("MicroMsg.WeChatClsManager", "locateKeywords >> weOcrHandle no init");
            return null;
        }
        String nLocateKeyWords = WeOcr.nLocateKeyWords(j, buffer, height, width, str2);
        Log.m105924i("MicroMsg.WeChatClsManager", "locateKeywords >> keywords: " + str2 + ", result: " + nLocateKeyWords);
        return nLocateKeyWords;
    }
}
