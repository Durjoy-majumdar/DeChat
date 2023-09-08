package ob2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* renamed from: ob2.b */
public final class C61988b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61999g f176215d;

    public C61988b(C61999g gVar) {
        this.f176215d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        StringBuilder sb = new StringBuilder();
        sb.append("user clicked complete button, indexes=");
        Set<Integer> keySet = this.f176215d.f176260q.keySet();
        C87412m.m108593f(keySet, "rangeSnapshots.keys");
        Object[] array2 = keySet.toArray(new Integer[0]);
        C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String arrays = Arrays.toString(array2);
        C87412m.m108593f(arrays, "toString(this)");
        sb.append(arrays);
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb.toString());
        C61999g gVar = this.f176215d;
        if (gVar.f176258o != -1) {
            gVar.f176259p = true;
        }
        gVar.f176258o = -1;
        C61999g.m72743c3(gVar);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
