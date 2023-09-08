package p218pl;

import a14.C0000n0;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.search.data.SimilarEmojiQueryModel;
import fy3.C32227p;
import kotlin.ResultKt;
import mp3.C88819d;
import p490dl.C31197b;
import q40.C12040d;
import q40.C89456b;
import rx3.C13598b0;
import te3.C101868xo3;
import te3.C52147yo3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.emojisearch.data.EmojiSearchManagerRemote$IPCEmojiSearch$invoke$1", mo125469f = "EmojiSearchManagerRemote.kt", mo125470l = {52}, mo125471m = "invokeSuspend")
/* renamed from: pl.a */
public final class C100799a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f295273d;

    /* renamed from: e */
    public final /* synthetic */ SimilarEmojiQueryModel f295274e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f295275f;

    /* renamed from: g */
    public final /* synthetic */ C1256g<Bundle> f295276g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100799a(SimilarEmojiQueryModel similarEmojiQueryModel, Bundle bundle, C1256g<Bundle> gVar, C15601d<? super C100799a> dVar) {
        super(2, dVar);
        this.f295274e = similarEmojiQueryModel;
        this.f295275f = bundle;
        this.f295276g = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C100799a(this.f295274e, this.f295275f, this.f295276g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C100799a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f295273d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SimilarEmojiQueryModel similarEmojiQueryModel = this.f295274e;
            this.f295273d = 1;
            C101868xo3 xo32 = new C101868xo3();
            xo32.f299893d = similarEmojiQueryModel.f283910d;
            xo32.f299894e = similarEmojiQueryModel.f283912f;
            xo32.f299895f = String.valueOf(similarEmojiQueryModel.f283913g);
            xo32.f299896g = similarEmojiQueryModel.f283916j;
            xo32.f299898i = similarEmojiQueryModel.f283914h;
            obj = C89456b.m111831a(new C31197b(xo32), 0, (C88819d) null, this, 3, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C12040d unused) {
                C1256g<Bundle> gVar = this.f295276g;
                if (gVar != null) {
                    gVar.mo894a(null);
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f295275f.putByteArray("resp", ((C52147yo3) obj).toByteArray());
        C1256g<Bundle> gVar2 = this.f295276g;
        if (gVar2 != null) {
            gVar2.mo894a(this.f295275f);
        }
        return C13598b0.f38549a;
    }
}
