package fk3;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: fk3.d */
public final class C8096d extends C87413o implements C32226l<ArrayList<Pair<String, ArrayList<String>>>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59141h f26951d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8096d(C59141h hVar) {
        super(1);
        this.f26951d = hVar;
    }

    public Object invoke(Object obj) {
        ArrayList<Pair> arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, LocaleUtil.ITALIAN);
        StringBuilder sb = new StringBuilder();
        for (Pair pair : arrayList) {
            sb.append((String) pair.first);
            sb.append("#");
        }
        Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "report sugText: " + sb);
        C59141h hVar = this.f26951d;
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sugTextListBuilder.toString()");
        hVar.mo84356c(sb4);
        return C13598b0.f38549a;
    }
}
