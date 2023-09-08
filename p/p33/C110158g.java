package p33;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: p33.g */
public final class C110158g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110152e f329564d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f329565e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.voip.floatcard.VoipFloatCardManager$showFinishCard$3$1$1", mo125469f = "VoipFloatCardManager.kt", mo125470l = {317}, mo125471m = "invokeSuspend")
    /* renamed from: p33.g$a */
    public static final class C110159a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f329566d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f329567e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.voip.floatcard.VoipFloatCardManager$showFinishCard$3$1$1$1", mo125469f = "VoipFloatCardManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: p33.g$a$a */
        public static final class C110160a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ ImageView f329568d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f329569e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C110160a(ImageView imageView, Bitmap bitmap, C15601d<? super C110160a> dVar) {
                super(2, dVar);
                this.f329568d = imageView;
                this.f329569e = bitmap;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C110160a(this.f329568d, this.f329569e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C110160a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                ImageView imageView = this.f329568d;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(MMApplicationContext.getContext().getResources(), this.f329569e);
                bitmapDrawable.setAlpha(230);
                bitmapDrawable.setFilterBitmap(true);
                imageView.setBackground(bitmapDrawable);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110159a(ImageView imageView, C15601d<? super C110159a> dVar) {
            super(2, dVar);
            this.f329567e = imageView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110159a(this.f329567e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110159a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f329566d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Bitmap bitmapNative = BitmapUtil.getBitmapNative((int) C0966R.C0969drawable.ced, this.f329567e.getWidth(), this.f329567e.getHeight());
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C110160a aVar2 = new C110160a(this.f329567e, bitmapNative, (C15601d<? super C110160a>) null);
                this.f329566d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public C110158g(C110152e eVar, ImageView imageView) {
        this.f329564d = eVar;
        this.f329565e = imageView;
    }

    public final void run() {
        C0000n0 n0Var = this.f329564d.f329507c;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C110159a(this.f329565e, (C15601d<? super C110159a>) null), 3, (Object) null);
        }
    }
}
