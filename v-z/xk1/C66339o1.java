package xk1;

import a14.C0000n0;
import android.database.Cursor;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import ht1.C60200t1;
import ik1.C60332h;
import ik1.C60333i;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import p165hr.C60106t;
import p749xh.C66276va;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveMentionUIC$initPostLayout$1", mo125469f = "FinderLiveMentionUIC.kt", mo125470l = {289}, mo125471m = "invokeSuspend")
/* renamed from: xk1.o1 */
public final class C66339o1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f190967d;

    /* renamed from: e */
    public final /* synthetic */ C66320l1 f190968e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66339o1(C66320l1 l1Var, C15601d<? super C66339o1> dVar) {
        super(2, dVar);
        this.f190968e = l1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66339o1(this.f190968e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66339o1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f190967d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f190967d = 1;
            if (((C60200t1) C86312j.m106911c(C60200t1.class)).mo76735Af(1, 2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C66320l1 l1Var = this.f190968e;
        Cursor all = ((C60333i) ((C36570n) ((C60106t) C86312j.m106911c(C60106t.class)).f171524x).getValue()).getAll();
        LinkedList linkedList = new LinkedList();
        while (all.moveToNext()) {
            C66276va vaVar = new C66276va();
            vaVar.convertFrom(all);
            linkedList.add(vaVar);
        }
        LinkedList linkedList2 = new LinkedList(C110818d0.m150943o0(linkedList, new C60332h()));
        String str = l1Var.f190915d;
        Log.m105924i(str, "[addMentionListAndRefresh] list.size = " + linkedList2.size());
        l1Var.f190923o.addAll(0, linkedList2);
        if (l1Var.f190923o.size() > 0) {
            View view = (View) ((C36570n) l1Var.f190918g).getValue();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "addMentionListAndRefresh", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC", "addMentionListAndRefresh", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l1Var.mo90433g3().setVisibility(0);
            l1Var.mo90436k3(0);
            FinderLiveTaskBannerView finderLiveTaskBannerView = ((C66297d2) C39818r.f106831a.mo62444c(l1Var.getActivity()).mo75002a(C66297d2.class)).f190865x;
            if (finderLiveTaskBannerView != null) {
                finderLiveTaskBannerView.setVisibility(8);
            }
        } else {
            l1Var.mo90434i3();
        }
        return C13598b0.f38549a;
    }
}
