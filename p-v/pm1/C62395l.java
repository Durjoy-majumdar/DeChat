package pm1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;

/* renamed from: pm1.l */
public final class C62395l extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C62381d f177348d;

    public C62395l(C62381d dVar) {
        this.f177348d = dVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        String r = this.f177348d.mo87439r();
        Log.m105924i(r, "onScrollStateChanged newState:" + i);
        C62399p pVar = this.f177348d.f177302r;
        if (pVar != null) {
            if (i == 0) {
                if (!pVar.f177359h && pVar.f177358g) {
                    pVar.f177355d.invoke(Integer.valueOf(pVar.f177356e));
                }
                if (pVar.f177360i && pVar.f177361j != null && pVar.f177353b) {
                    C61926c.m72656A((String) null, new C62402r(pVar));
                }
                pVar.f177359h = false;
            } else if (i == 1) {
                pVar.f177360i = true;
            } else if (i == 2) {
                pVar.f177359h = true;
            }
        }
        if (i == 0) {
            this.f177348d.mo11215b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.f177348d.mo87432k();
        C62399p pVar = this.f177348d.f177302r;
        if (pVar != null) {
            if (pVar.f177358g) {
                Log.m105924i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled return for isInvokeAutoPlayCallback");
            } else if (pVar.f177356e < 0) {
                Log.m105924i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled return for onTouchPos:" + pVar.f177356e);
            } else {
                if (pVar.f177357f == 0) {
                    pVar.f177357f = i2;
                }
                if (Math.abs(i2 - pVar.f177357f) > 1) {
                    Log.m105924i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled hit auto play pos:" + pVar.f177356e + " (" + pVar.f177357f + ", " + i2 + ')');
                    pVar.f177354c.invoke(Integer.valueOf(pVar.f177356e));
                    pVar.f177358g = true;
                } else {
                    Log.m105924i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled auto play pos:" + pVar.f177356e + " (" + pVar.f177357f + ", " + i2 + " move:" + Math.abs(i2 - pVar.f177357f) + " threshold:1");
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
