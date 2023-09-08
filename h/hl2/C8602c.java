package hl2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32227p;
import gy3.C87412m;
import hl2.C8596a;
import kotlin.ResultKt;
import p823sg.C90193h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import wl2.C15511a;
import wl2.C15512b;
import wl2.C15516e;
import wl2.C15519h;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C119027c;

@C91590f(mo125468c = "com.tencent.mm.plugin.scanner.image.AIScanImageCdnUploadUtil$decodeBitmap$2", mo125469f = "AIScanImageCdnUploadUtil.kt", mo125470l = {145}, mo125471m = "invokeSuspend")
/* renamed from: hl2.c */
public final class C8602c extends C91594j implements C32227p<C0000n0, C15601d<? super C8596a.C8598b>, Object> {

    /* renamed from: d */
    public Object f27699d;

    /* renamed from: e */
    public Object f27700e;

    /* renamed from: f */
    public int f27701f;

    /* renamed from: g */
    public /* synthetic */ Object f27702g;

    /* renamed from: h */
    public final /* synthetic */ String f27703h;

    /* renamed from: i */
    public final /* synthetic */ int f27704i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8602c(String str, int i, C15601d<? super C8602c> dVar) {
        super(2, dVar);
        this.f27703h = str;
        this.f27704i = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C8602c cVar = new C8602c(this.f27703h, this.f27704i, dVar);
        cVar.f27702g = obj;
        return cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8602c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15519h hVar;
        Bitmap bitmap;
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f27701f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f27702g;
            C15511a aVar2 = new C15511a(this.f27703h);
            int i2 = this.f27704i;
            if (i2 < 0) {
                C13601g gVar = C8596a.f27688a;
                i2 = ((Number) ((C36570n) C8596a.f27688a).getValue()).intValue();
            }
            aVar2.f42055c = i2;
            C15519h a = C15516e.m14538a(aVar2, (C15512b) ((C36570n) C8596a.f27690c).getValue());
            bitmap = a.f42061a;
            if (bitmap == null) {
                Log.m105920e("MicroMsg.AIScanImageCdnUploadUtil", "decode error, bitmap is null");
                return null;
            }
            Log.m105924i("MicroMsg.AIScanImageCdnUploadUtil", "decode result,width:" + bitmap.getWidth() + ", height:" + bitmap.getHeight());
            byte[] bytes = this.f27703h.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            String str2 = "wcf://ImageSearchFilePath/" + C90193h.m112878f(bytes);
            this.f27702g = a;
            this.f27699d = bitmap;
            this.f27700e = str2;
            this.f27701f = 1;
            Object g = C53895h.m60469g(C53872d1.f151119c, new C8603d(bitmap, str2, (C15601d<? super C8603d>) null), this);
            if (g == aVar) {
                return aVar;
            }
            str = str2;
            Object obj2 = g;
            hVar = a;
            obj = obj2;
        } else if (i == 1) {
            str = (String) this.f27700e;
            bitmap = (Bitmap) this.f27699d;
            hVar = (C15519h) this.f27702g;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean k = C86013q1.m106450k(str);
        if (!booleanValue || !k) {
            Log.m105924i("MicroMsg.AIScanImageCdnUploadUtil", "save Image Fail, saveSuccess:" + booleanValue + ", fileExist:" + k);
            return null;
        }
        C8596a.C8598b bVar = new C8596a.C8598b();
        Point point = hVar.f42062b;
        int i3 = 0;
        bVar.f27692b = point != null ? point.y : 0;
        if (point != null) {
            i3 = point.x;
        }
        bVar.f27691a = i3;
        bVar.f27694d = bitmap.getWidth();
        bVar.f27695e = bitmap.getHeight();
        bVar.f27693c = str;
        return bVar;
    }
}
