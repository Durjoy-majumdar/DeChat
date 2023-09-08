package t51;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import uc0.C111156r;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity$bindViewModel$4$1", mo125469f = "SpringLuckyEggActivity.kt", mo125470l = {366}, mo125471m = "invokeSuspend")
/* renamed from: t51.j */
public final class C110918j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f331730d;

    /* renamed from: e */
    public final /* synthetic */ SpringLuckyEggActivity f331731e;

    /* renamed from: f */
    public final /* synthetic */ String f331732f;

    /* renamed from: g */
    public final /* synthetic */ C111156r f331733g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity$bindViewModel$4$1$bitmap$1", mo125469f = "SpringLuckyEggActivity.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: t51.j$a */
    public static final class C110919a extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f331734d;

        /* renamed from: e */
        public final /* synthetic */ C111156r f331735e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110919a(String str, C111156r rVar, C15601d<? super C110919a> dVar) {
            super(2, dVar);
            this.f331734d = str;
            this.f331735e = rVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110919a(this.f331734d, this.f331735e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110919a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (!C86013q1.m106450k(this.f331734d + XVFSFile.SEPARATOR_CHAR + this.f331735e.f332906o)) {
                return null;
            }
            return BitmapUtil.decodeFile(this.f331734d + XVFSFile.SEPARATOR_CHAR + this.f331735e.f332906o, (BitmapFactory.Options) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110918j(SpringLuckyEggActivity springLuckyEggActivity, String str, C111156r rVar, C15601d<? super C110918j> dVar) {
        super(2, dVar);
        this.f331731e = springLuckyEggActivity;
        this.f331732f = str;
        this.f331733g = rVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110918j(this.f331731e, this.f331732f, this.f331733g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110918j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f331730d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53896h0 h0Var = C53872d1.f151119c;
            C110919a aVar2 = new C110919a(this.f331732f, this.f331733g, (C15601d<? super C110919a>) null);
            this.f331730d = 1;
            obj = C53895h.m60469g(h0Var, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Bitmap bitmap = (Bitmap) obj;
        C110928q qVar = this.f331731e.f312423f;
        if (qVar != null) {
            qVar.f331752h.setImageBitmap(bitmap);
            if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                C110928q qVar2 = this.f331731e.f312423f;
                if (qVar2 != null) {
                    ViewGroup.LayoutParams layoutParams = qVar2.f331752h.getLayoutParams();
                    SpringLuckyEggActivity springLuckyEggActivity = this.f331731e;
                    float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
                    C110928q qVar3 = springLuckyEggActivity.f312423f;
                    if (qVar3 != null) {
                        layoutParams.height = (int) (((float) qVar3.f331752h.getWidth()) / width);
                        C110928q qVar4 = this.f331731e.f312423f;
                        if (qVar4 != null) {
                            qVar4.f331752h.requestLayout();
                        } else {
                            C87412m.m108603p("viewBinding");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewBinding");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("viewBinding");
        throw null;
    }
}
