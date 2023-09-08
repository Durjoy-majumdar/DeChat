package wg1;

import a14.C0000n0;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import ke3.C88144b;
import kotlin.ResultKt;
import rx3.C13598b0;
import tf0.C64916p1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveVisitorNoticeQRCodeUIC$buildShareBottomSheet$share2Friend$1", mo125469f = "FinderLiveVisitorNoticeQRCodeUIC.kt", mo125470l = {590}, mo125471m = "invokeSuspend")
/* renamed from: wg1.n3 */
public final class C15326n3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41654d;

    /* renamed from: e */
    public final /* synthetic */ C15278g3 f41655e;

    /* renamed from: wg1.n3$a */
    public static final class C15327a implements MMFragmentActivity$$f {

        /* renamed from: a */
        public static final C15327a f41656a = new C15327a();

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15326n3(C15278g3 g3Var, C15601d<? super C15326n3> dVar) {
        super(2, dVar);
        this.f41655e = g3Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15326n3(this.f41655e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15326n3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41654d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C15278g3 g3Var = this.f41655e;
            this.f41654d = 1;
            obj = C15278g3.m14309c3(g3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15278g3 g3Var2 = this.f41655e;
        String e802 = ((C64916p1) C86312j.m106911c(C64916p1.class)).e80();
        BitmapUtil.saveBitmapToImage((Bitmap) obj, 80, Bitmap.CompressFormat.JPEG, e802, true);
        Intent intent = new Intent();
        intent.putExtra("Retr_File_Name", e802);
        intent.putExtra("Retr_Compress_Type", 0);
        intent.putExtra("Retr_Msg_Type", 0);
        Activity context = g3Var2.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        C88144b.m109804v((MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, C15327a.f41656a);
        return C13598b0.f38549a;
    }
}
