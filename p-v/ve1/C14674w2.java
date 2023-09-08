package ve1;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0712b0;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedLiveListConvert;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58389m1;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C10008v1;
import o40.C61926c;
import rs1.C13457t3;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C64441i93;
import te3.C64654qd;
import te3.db4;
import te3.op4;
import zc1.C66785b;
import zp3.C23555k;

/* renamed from: ve1.w2 */
public final class C14674w2 extends C23555k.C23558c {

    /* renamed from: a */
    public final HashSet<Long> f40597a = new HashSet<>();

    /* renamed from: b */
    public final /* synthetic */ FinderFeedLiveListConvert f40598b;

    /* renamed from: ve1.w2$a */
    public static final class C14675a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<C0712b0> f40599d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedLiveListConvert f40600e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14675a(LinkedList<C0712b0> linkedList, FinderFeedLiveListConvert finderFeedLiveListConvert) {
            super(0);
            this.f40599d = linkedList;
            this.f40600e = finderFeedLiveListConvert;
        }

        public Object invoke() {
            LinkedList<C0712b0> linkedList = this.f40599d;
            FinderFeedLiveListConvert finderFeedLiveListConvert = this.f40600e;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            Iterator<T> it = linkedList.iterator();
            while (true) {
                int i = 0;
                if (it.hasNext()) {
                    FinderObject finderObject = ((C0712b0) it.next()).f1709d;
                    long j = finderObject.f164794id;
                    String str = finderObject.sessionBuffer;
                    C49712hj1 hj12 = finderFeedLiveListConvert.f12802f;
                    if (hj12 != null) {
                        i = hj12.f134675i;
                    }
                    db4 db4 = new db4();
                    db4.f182678f = new op4();
                    db4.f182677e = new C64654qd();
                    db4.f182679g = new C64441i93();
                    db4.f182676d = j;
                    db4.f182686q = i;
                    db4.f182684o = str;
                    db4.f182681i = C66785b.f191882e.mo90662O5();
                    db4.f182682j = C31543z5.m39453c();
                    db4.f182689t = 2004;
                    arrayList.add(db4);
                } else {
                    C58389m1.f167287a.mo83224a(arrayList, this.f40600e.f12802f, 0);
                    return C13598b0.f38549a;
                }
            }
        }
    }

    public C14674w2(FinderFeedLiveListConvert finderFeedLiveListConvert) {
        this.f40598b = finderFeedLiveListConvert;
    }

    /* renamed from: d */
    public boolean mo777d() {
        return true;
    }

    /* renamed from: e */
    public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
        View c3;
        C87412m.m108594g(view, "parent");
        C87412m.m108594g(list, "exposedHolders");
        LinkedList<C0712b0> linkedList = new LinkedList<>();
        for (RecyclerView.C16631z zVar : list) {
            if (zVar instanceof C60905o) {
                Object obj = ((C60905o) zVar).f173503E;
                if (obj instanceof C0712b0) {
                    C0712b0 b0Var = (C0712b0) obj;
                    if (!this.f40597a.contains(Long.valueOf(b0Var.f1709d.f164794id))) {
                        this.f40597a.add(Long.valueOf(b0Var.f1709d.f164794id));
                        linkedList.add(obj);
                    }
                }
            }
        }
        String str = this.f40598b.f12804h;
        StringBuilder sb = new StringBuilder();
        sb.append("[onChildExposeChanged] exposed=");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C0712b0 b0Var2 : linkedList) {
            arrayList.add(C61926c.m72691p(b0Var2.f1709d.f164794id));
        }
        sb.append(arrayList);
        Log.m105924i(str, sb.toString());
        boolean z = true;
        if (!linkedList.isEmpty()) {
            C61926c.m72661F("FinderFeedLiveListExpose", new C14675a(linkedList, this.f40598b));
        }
        if (!list.isEmpty()) {
            C10008v1 v1Var = this.f40598b.f12801e;
            FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
            FinderHomeTabFragment finderHomeTabFragment = finderTimelinePresenter != null ? finderTimelinePresenter.f13267h : null;
            if (!(finderHomeTabFragment instanceof Fragment)) {
                finderHomeTabFragment = null;
            }
            if (finderHomeTabFragment != null) {
                C13457t3 t3Var = (C13457t3) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C13457t3.class);
                t3Var.getClass();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("hideTips， ");
                View c35 = t3Var.mo12882c3();
                sb4.append(c35 != null && c35.getVisibility() == 0);
                Log.m105924i("FinderFriendsLeftSlideGuideUIC", sb4.toString());
                View c36 = t3Var.mo12882c3();
                if (c36 == null || c36.getVisibility() != 0) {
                    z = false;
                }
                if (z && (c3 = t3Var.mo12882c3()) != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = c3;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "hideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "hideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    t3Var.mo12883d3();
                    C13457t3.f38149j = null;
                    t3Var.f38156i = false;
                }
            }
        }
    }
}
