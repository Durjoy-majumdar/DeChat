package c33;

import android.os.Bundle;
import b62.C92180d;
import com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: c33.d */
public final class C92344d extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15601d<MediaErrorInfo> f264236d;

    /* renamed from: e */
    public final /* synthetic */ C92338c f264237e;

    /* renamed from: f */
    public final /* synthetic */ String f264238f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92344d(C15601d<? super MediaErrorInfo> dVar, C92338c cVar, String str) {
        super(2);
        this.f264236d = dVar;
        this.f264237e = cVar;
        this.f264238f = str;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        C92180d dVar = C92180d.MediaRemuxSuccess;
        C92180d dVar2 = C92180d.MediaRemuxError;
        if (!booleanValue) {
            C15601d<MediaErrorInfo> dVar3 = this.f264236d;
            Result.Companion companion = Result.Companion;
            dVar3.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(intValue == 0 ? dVar : dVar2, intValue, "ERROR_TARGET_BITRATE_ERROR remux error", (Bundle) null, 8, (C8480h) null)));
        } else {
            C92338c.m116156e(this.f264237e, this.f264238f);
            C15601d<MediaErrorInfo> dVar4 = this.f264236d;
            Result.Companion companion2 = Result.Companion;
            dVar4.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(intValue == 0 ? dVar : dVar2, intValue, "go to background remux", (Bundle) null, 8, (C8480h) null)));
        }
        return C13598b0.f38549a;
    }
}
