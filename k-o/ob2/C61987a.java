package ob2;

import android.util.Range;
import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvTracksEditView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: ob2.a */
public final class C61987a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61999g f176214d;

    public C61987a(C61999g gVar) {
        this.f176214d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        StringBuilder sb = new StringBuilder();
        sb.append("user clicked cancel button，revert: ");
        Set<Integer> keySet = this.f176214d.f176260q.keySet();
        C87412m.m108593f(keySet, "rangeSnapshots.keys");
        Object[] array2 = keySet.toArray(new Integer[0]);
        C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String arrays = Arrays.toString(array2);
        C87412m.m108593f(arrays, "toString(this)");
        sb.append(arrays);
        Log.m105924i("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb.toString());
        C61999g gVar = this.f176214d;
        gVar.f176258o = -1;
        if (!gVar.f176260q.isEmpty()) {
            Set<Map.Entry<Integer, Range<Long>>> entrySet = this.f176214d.f176260q.entrySet();
            C87412m.m108593f(entrySet, "rangeSnapshots.entries");
            C61999g gVar2 = this.f176214d;
            for (Map.Entry entry : entrySet) {
                MvTracksEditView mvTracksEditView = gVar2.f176250d;
                if (mvTracksEditView != null) {
                    Object key = entry.getKey();
                    C87412m.m108593f(key, "entry.key");
                    int intValue = ((Number) key).intValue();
                    Comparable lower = ((Range) entry.getValue()).getLower();
                    C87412m.m108593f(lower, "entry.value.lower");
                    long longValue = ((Number) lower).longValue();
                    Comparable upper = ((Range) entry.getValue()).getUpper();
                    C87412m.m108593f(upper, "entry.value.upper");
                    long longValue2 = ((Number) upper).longValue();
                    int i = MvTracksEditView.f163696F;
                    mvTracksEditView.mo80658d(intValue, longValue, longValue2, true);
                } else {
                    C87412m.m108603p("tracksEditView");
                    throw null;
                }
            }
        }
        C61999g.m72743c3(this.f176214d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
