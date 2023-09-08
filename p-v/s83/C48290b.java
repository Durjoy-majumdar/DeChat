package s83;

import com.tencent.mars.cdn.CronetLogic;
import fy3.C32226l;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: s83.b */
public final class C48290b extends C87413o implements C32226l<CronetLogic.CronetTaskResult, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15601d<Map<String, ? extends List<String>>> f129308d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48290b(C48292d dVar, C15601d<? super Map<String, ? extends List<String>>> dVar2) {
        super(1);
        this.f129308d = dVar2;
    }

    public Object invoke(Object obj) {
        CronetLogic.CronetTaskResult cronetTaskResult = (CronetLogic.CronetTaskResult) obj;
        if (cronetTaskResult == null) {
            this.f129308d.resumeWith(Result.m168114constructorimpl((Object) null));
        } else if (cronetTaskResult.statusCode != 200 || cronetTaskResult.getHeaderMapList() == null) {
            this.f129308d.resumeWith(Result.m168114constructorimpl((Object) null));
        } else {
            C15601d<Map<String, ? extends List<String>>> dVar = this.f129308d;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(cronetTaskResult.getHeaderMapList()));
        }
        return C13598b0.f38549a;
    }
}
