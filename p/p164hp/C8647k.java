package p164hp;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.feature.checkresupdate.superdownloader.WrapCore$unzipToFolder$2", mo125469f = "WrapCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: hp.k */
public final class C8647k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f27802d;

    /* renamed from: e */
    public final /* synthetic */ String f27803e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8647k(String str, String str2, C15601d<? super C8647k> dVar) {
        super(2, dVar);
        this.f27802d = str;
        this.f27803e = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8647k(this.f27802d, this.f27803e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8647k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        boolean z = false;
        if (C86013q1.m106459t(this.f27802d, false) != null) {
            Log.m105924i("Download.SuperDownloaderWrapCore", "#unzipToFolder is exist, return");
            return C13598b0.f38549a;
        }
        String str = this.f27802d + "_temp";
        if (this.f27803e.length() == 0) {
            z = true;
        }
        if (!z && C86013q1.m106450k(this.f27803e)) {
            Log.m105924i("Download.SuperDownloaderWrapCore", "#checkAndMakeToReady-checkAndUnzip zipFilePath:" + this.f27803e + " unzip it");
            C86013q1.m106445f(str);
            C86013q1.m106445f(this.f27802d);
            C86013q1.m106436R(this.f27803e, str);
            C86013q1.m106462w(str, this.f27802d);
        }
        return C13598b0.f38549a;
    }
}
