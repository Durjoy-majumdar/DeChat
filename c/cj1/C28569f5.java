package cj1;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import is3.C60622a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: cj1.f5 */
public final class C28569f5 extends C87413o implements C32226l<List<? extends String>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f78432d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f78433e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28569f5(AppCompatActivity appCompatActivity, C32224a<C13598b0> aVar) {
        super(1);
        this.f78432d = appCompatActivity;
        this.f78433e = aVar;
    }

    public Object invoke(Object obj) {
        C13598b0 b0Var;
        int i;
        List list = (List) obj;
        if (list != null) {
            AppCompatActivity appCompatActivity = this.f78432d;
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            boolean z = true;
            int i2 = 0;
            if (oVar != null && oVar.f154301c3) {
                if (list.isEmpty() ^ true) {
                    C76912y0.makeText((Context) appCompatActivity, (CharSequence) appCompatActivity.getString(C0966R.string.fjh), 1).show();
                }
            }
            C54806r1 r1Var = FinderLiveService.f159382j;
            r1Var.getClass();
            if (!(!list.isEmpty())) {
                z = false;
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (!C72996z1.m85820U5((String) next)) {
                        arrayList.add(next);
                    }
                }
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (z) {
                i2 = list.size() - i;
            }
            List<C60622a> list2 = r1Var.f153636a;
            C87412m.m108593f(list2, "externalLiveCallbacks");
            synchronized (list2) {
                for (C60622a e : list2) {
                    Log.m105924i("FinderLiveExternalHelper", "onShareToConversation result:" + z + " shareUserCount:" + i + " shareRoomCount:" + i2);
                    e.mo85578e(z, i, i2);
                }
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            C32224a<C13598b0> aVar = this.f78433e;
            Log.m105924i("Finder.FinderLiveService", "share2Friend fail");
            aVar.invoke();
        }
        return C13598b0.f38549a;
    }
}
