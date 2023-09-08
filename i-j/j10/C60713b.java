package j10;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import p158gt.C76057w;
import p773yy.C66707f;
import p773yy.C66709i;
import p773yy.C66710j;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.text_status.TextStatusDataSource$getImageFile$2", mo125469f = "TextStatusDataSource.kt", mo125470l = {114}, mo125471m = "invokeSuspend")
/* renamed from: j10.b */
public final class C60713b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public Object f172922d;

    /* renamed from: e */
    public Object f172923e;

    /* renamed from: f */
    public int f172924f;

    /* renamed from: g */
    public final /* synthetic */ String f172925g;

    /* renamed from: h */
    public final /* synthetic */ String f172926h;

    /* renamed from: i */
    public final /* synthetic */ String f172927i;

    /* renamed from: j10.b$a */
    public static final class C60714a implements C76057w.C76058a {

        /* renamed from: a */
        public final /* synthetic */ C15601d<Bitmap> f172928a;

        public C60714a(C15601d<? super Bitmap> dVar) {
            this.f172928a = dVar;
        }

        /* renamed from: a */
        public final void mo25933a(String str, Bitmap bitmap, String str2) {
            this.f172928a.resumeWith(Result.m168114constructorimpl(bitmap));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60713b(String str, String str2, String str3, C15601d<? super C60713b> dVar) {
        super(2, dVar);
        this.f172925g = str;
        this.f172926h = str2;
        this.f172927i = str3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60713b(this.f172925g, this.f172926h, this.f172927i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60713b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f172924f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String HV = ((C66707f) C86312j.m106911c(C66707f.class)).mo90736HV("image", this.f172925g);
            if (C86013q1.m106450k(HV)) {
                Log.m105924i("MicroMsg.TextStatusDataSource", "getImageFile: file is ready: " + HV);
                return HV;
            }
            Log.m105924i("MicroMsg.TextStatusDataSource", "start downloading image: " + this.f172926h + ", path=" + HV);
            String str2 = this.f172926h;
            this.f172922d = HV;
            this.f172923e = str2;
            this.f172924f = 1;
            C66218h hVar = new C66218h(C66447b.m78392b(this));
            ((C76057w) C86312j.m106911c(C76057w.class)).h60(str2, new C60714a(hVar));
            Object b = hVar.mo90314b();
            if (b == aVar) {
                return aVar;
            }
            str = HV;
            obj = b;
        } else if (i == 1) {
            String str3 = (String) this.f172923e;
            str = (String) this.f172922d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            Log.m105928w("MicroMsg.TextStatusDataSource", "failed to download bitmap, url=" + this.f172926h + ", path=" + str);
            return null;
        }
        C66710j ga = ((C66709i) C86312j.m106911c(C66709i.class)).mo90748ga(this.f172925g);
        if (ga == null) {
            Log.m105928w("MicroMsg.TextStatusDataSource", "no text status found for " + this.f172925g);
            return null;
        } else if (!C87412m.m108589b(this.f172927i, ga.mo72942h1())) {
            Log.m105924i("MicroMsg.TextStatusDataSource", "status changed, discard this request, expected status id is " + this.f172927i + ", latest one is " + ga.mo72942h1());
            return str;
        } else {
            synchronized (C60711a.class) {
                if (C86013q1.m106450k(str)) {
                    Log.m105928w("MicroMsg.TextStatusDataSource", "File has been created by another task, so we can reuse it");
                    return str;
                }
                C87412m.m108594g(str, "path");
                try {
                    BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, str, false);
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.TextStatusDataSource", "save bitmap to image failed: " + e);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                Log.m105924i("MicroMsg.TextStatusDataSource", "bitmap has been exported to " + str);
                return str;
            }
        }
    }
}
