package in2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.mvvmlist.SingleItemConvertFactory;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import yb2.C15946a;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: in2.d */
public final class C9208d extends C15946a {

    /* renamed from: d */
    public final C13601g f28956d = C36568h.m40985a(new C9211c(this));

    /* renamed from: e */
    public List<C9205a> f28957e = new ArrayList();

    /* renamed from: f */
    public MvvmList<C9205a> f28958f;

    /* renamed from: g */
    public C103009m<C9205a> f28959g;

    /* renamed from: in2.d$a */
    public /* synthetic */ class C9209a extends C24565l implements C32226l<C9205a, C13598b0> {
        public C9209a(Object obj) {
            super(1, obj, C9208d.class, "notifyGroupChange", "notifyGroupChange(Lcom/tencent/mm/plugin/setting/ui/widget/GroupItem;)V", 0);
        }

        public Object invoke(Object obj) {
            C9205a aVar = (C9205a) obj;
            C87412m.m108594g(aVar, "p0");
            ((C9208d) this.receiver).mo10017k3(aVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: in2.d$b */
    public /* synthetic */ class C9210b extends C24565l implements C32226l<C9205a, C13598b0> {
        public C9210b(Object obj) {
            super(1, obj, C9208d.class, "notifyGroupChange", "notifyGroupChange(Lcom/tencent/mm/plugin/setting/ui/widget/GroupItem;)V", 0);
        }

        public Object invoke(Object obj) {
            C9205a aVar = (C9205a) obj;
            C87412m.m108594g(aVar, "p0");
            ((C9208d) this.receiver).mo10017k3(aVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: in2.d$c */
    public static final class C9211c extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C9208d f28960d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9211c(C9208d dVar) {
            super(0);
            this.f28960d = dVar;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f28960d.findViewById(C0966R.C0970id.olv);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9208d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final void mo10014g3(C9205a aVar) {
        C87412m.m108594g(aVar, "group");
        Log.m105924i(C54492n.TAG, aVar + ' ' + aVar.f28948d + " addGroup");
        ((ArrayList) this.f28957e).add(aVar);
        MvvmList<C9205a> mvvmList = this.f28958f;
        if (mvvmList != null) {
            MvvmList.m119209l(mvvmList, aVar, false, 2, (Object) null);
        }
        aVar.mo10012f(new C9209a(this));
    }

    /* renamed from: i3 */
    public final C9212e mo10015i3(String str) {
        Iterable<C9205a> iterable;
        C87412m.m108594g(str, "key");
        MvvmList<C9205a> mvvmList = this.f28958f;
        if (mvvmList == null || (iterable = mvvmList.f272353o) == null) {
            iterable = this.f28957e;
        }
        for (C9205a j : iterable) {
            C9212e j2 = j.mo10013j(str);
            if (j2 != null) {
                return j2;
            }
        }
        return null;
    }

    /* renamed from: j3 */
    public final void mo10016j3(String str, boolean z) {
        Iterable<C9205a> iterable;
        C87412m.m108594g(str, "key");
        MvvmList<C9205a> mvvmList = this.f28958f;
        if (mvvmList == null || (iterable = mvvmList.f272353o) == null) {
            iterable = this.f28957e;
        }
        for (C9205a aVar : iterable) {
            C9212e j = aVar.mo10013j(str);
            if (j != null) {
                Log.m105924i(C54492n.TAG, aVar + ' ' + str + " hideItem");
                j.f28964d = z;
                mo10017k3(aVar);
            }
        }
    }

    /* renamed from: k3 */
    public final void mo10017k3(C9205a aVar) {
        Iterable iterable;
        C103009m<C9205a> mVar;
        C87412m.m108594g(aVar, "group");
        MvvmList<C9205a> mvvmList = this.f28958f;
        if (mvvmList == null || (iterable = mvvmList.f272353o) == null) {
            iterable = this.f28957e;
        }
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i >= 0) {
                if (C87412m.m108589b(((C9205a) next).f28948d, aVar.f28948d) && (mVar = this.f28959g) != null) {
                    mVar.notifyItemChanged(i);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    public void onCreateAfter(Bundle bundle) {
        MvvmList mvvmList = new MvvmList(new C60569c(this.f28957e), new C53769h(), getActivity(), (LifecycleScope) null, this.f28957e, 8, (C8480h) null);
        this.f28958f = mvvmList;
        ArrayList<T> arrayList = mvvmList.f272353o;
        C87412m.m108591d(arrayList);
        this.f28957e = C110818d0.m150900B0(arrayList);
        MvvmList<C9205a> mvvmList2 = this.f28958f;
        C87412m.m108591d(mvvmList2);
        this.f28959g = new C103009m<>(mvvmList2, new SingleItemConvertFactory(C9206b.class), false);
        ((WxRecyclerView) ((C36570n) this.f28956d).getValue()).setAdapter(this.f28959g);
        ((WxRecyclerView) ((C36570n) this.f28956d).getValue()).setLayoutManager(new WxLinearLayoutManager(getContext()));
        ((WxRecyclerView) ((C36570n) this.f28956d).getValue()).getRecycledViewPool().mo17336e(0, 0);
        ((WxRecyclerView) ((C36570n) this.f28956d).getValue()).setItemAnimator((RecyclerView.C16616j) null);
        Iterator it = ((ArrayList) this.f28957e).iterator();
        while (it.hasNext()) {
            ((C9205a) it.next()).mo10012f(new C9210b(this));
        }
        MvvmList<C9205a> mvvmList3 = this.f28958f;
        if (mvvmList3 != null) {
            mvvmList3.mo129609m();
        }
    }
}
