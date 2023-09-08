package com.tencent.p014mm.plugin.finder.profile.uic;

import android.os.Bundle;
import android.view.View;
import bl3.C39818r;
import cm1.C0782u0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import pe3.C89349b;
import rx3.C36570n;
import sx3.C22415w0;
import sx3.C36907w;
import te3.C64273c21;
import ye1.C15984y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC$a;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayFragment */
public final class FinderProfileReplayFragment extends FinderHomeTabFragment implements FinderProfileTabUIC.C56223a {

    /* renamed from: q */
    public List<? extends FinderObject> f16337q;

    /* renamed from: r */
    public C89349b f16338r;

    public FinderProfileReplayFragment() {
        super(113);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C22415w0.m26092a(FinderProfileReplayLiveUIC.class);
    }

    /* renamed from: O */
    public void mo2202O() {
        super.mo2202O();
        getActivity();
    }

    /* renamed from: e */
    public void mo3765e(boolean z) {
        FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = (FinderProfileReplayLiveUIC) C39818r.f106831a.mo62445d(this).mo62449e(FinderProfileReplayLiveUIC.class);
        if (finderProfileReplayLiveUIC == null) {
            return;
        }
        if (z) {
            ((C15984y) ((C36570n) finderProfileReplayLiveUIC.f16340p).getValue()).f43020a.setBackgroundResource(C0966R.color.ahf);
        } else {
            ((C15984y) ((C36570n) finderProfileReplayLiveUIC.f16340p).getValue()).f43020a.setBackgroundResource(C0966R.color.f2932f);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        List<? extends FinderObject> list = this.f16337q;
        C89349b bVar = this.f16338r;
        if (list != null && bVar != null) {
            FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = (FinderProfileReplayLiveUIC) C39818r.f106831a.mo62445d(this).mo75002a(FinderProfileReplayLiveUIC.class);
            finderProfileReplayLiveUIC.getClass();
            FinderProfileLiveUserPageLoader c3 = finderProfileReplayLiveUIC.mo3849c3();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                C64273c21 c212 = ((FinderObject) next).liveInfo;
                if (c212 != null && c212.f182366L == 6) {
                    z = true;
                }
                if (!z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList2.add(new C0782u0((FinderObject) it4.next()));
            }
            c3.f15084h = arrayList2;
            finderProfileReplayLiveUIC.mo3849c3().f15085i = bVar;
            BaseFeedLoader.requestInit$default(finderProfileReplayLiveUIC.mo3849c3(), false, 1, (Object) null);
        }
    }
}
