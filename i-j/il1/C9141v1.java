package il1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import nj3.C76912y0;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: il1.v1 */
public final class C9141v1<T> implements C7045j.C7056k {

    /* renamed from: a */
    public final /* synthetic */ ArrayList<String> f28792a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList<List<String>> f28793b;

    /* renamed from: c */
    public final /* synthetic */ C9093q1 f28794c;

    /* renamed from: d */
    public final /* synthetic */ int f28795d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Integer, C13598b0> f28796e;

    public C9141v1(ArrayList<String> arrayList, ArrayList<List<String>> arrayList2, C9093q1 q1Var, int i, C32226l<? super Integer, C13598b0> lVar) {
        this.f28792a = arrayList;
        this.f28793b = arrayList2;
        this.f28794c = q1Var;
        this.f28795d = i;
        this.f28796e = lVar;
    }

    public final void onResult(boolean z, Object obj, Object obj2) {
        if (z) {
            try {
                ArrayList<String> arrayList = this.f28792a;
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                int P = C110818d0.m150918P(arrayList, (CharSequence) obj);
                List<String> list = this.f28793b.get(P);
                C87412m.m108593f(list, "minuteList[firstChosenIndex]");
                C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf = list.indexOf((CharSequence) obj2);
                int i = (P * 3600) + (indexOf * 60);
                Log.m105924i("FinderLiveChargeIncreaseDurationWidget", "chosen time:" + obj + ' ' + obj2 + ",firstChosenIndex:" + P + ",secChosenIndex:" + indexOf + ",duration:" + i + ",preview_type:" + this.f28794c.mo9902a().f138632d);
                if (i <= this.f28795d) {
                    Context context = this.f28794c.f28669a;
                    C76912y0.m92773l(context, context.getResources().getString(C0966R.string.n7f));
                    return;
                }
                C7045j jVar = this.f28794c.f28672d;
                if (jVar != null) {
                    jVar.mo8101d();
                }
                if (this.f28794c.mo9902a().f138632d == 2) {
                    this.f28794c.mo9902a().f138634f = i;
                } else {
                    this.f28794c.mo9902a().f138633e = i;
                }
                this.f28796e.invoke(Integer.valueOf(i));
            } catch (Throwable th) {
                C7045j jVar2 = this.f28794c.f28672d;
                if (jVar2 != null) {
                    jVar2.mo8101d();
                }
                Log.m105924i("FinderLiveChargeIncreaseDurationWidget", th.getMessage());
            }
        }
    }
}
