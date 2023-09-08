package fx0;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.view.View;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.plugin.bizui.widget.StoryListView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18206a;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C118459qf;
import te3.C118474vf;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: fx0.b */
public final class C20729b {

    /* renamed from: a */
    public static final C20729b f58601a = new C20729b();

    /* renamed from: b */
    public static MTimerHandler f58602b;

    /* renamed from: c */
    public static boolean f58603c;

    /* renamed from: d */
    public static int f58604d;

    /* renamed from: e */
    public static IListener<BizFinderLineStatusChangedEvent> f58605e;

    /* renamed from: f */
    public static final CopyOnWriteArrayList<String> f58606f = new CopyOnWriteArrayList<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.model.BizFinderLiveUILogic$checkPosition$1", mo125469f = "BizFinderLiveUILogic.kt", mo125470l = {105}, mo125471m = "invokeSuspend")
    /* renamed from: fx0.b$a */
    public static final class C20730a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f58607d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<String> f58608e;

        /* renamed from: f */
        public final /* synthetic */ WeakReference<C18508z2> f58609f;

        /* renamed from: fx0.b$a$a */
        public static final class C20731a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ WeakReference<C18508z2> f58610d;

            /* renamed from: e */
            public final /* synthetic */ LinkedList<String> f58611e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20731a(WeakReference<C18508z2> weakReference, LinkedList<String> linkedList) {
                super(0);
                this.f58610d = weakReference;
                this.f58611e = linkedList;
            }

            public Object invoke() {
                C18508z2 z2Var = this.f58610d.get();
                if (z2Var != null) {
                    z2Var.notifyDataSetChanged();
                }
                Log.m105924i("MicroMsg.BizFinderLiveUILogic", "checkPosition data change list size = " + this.f58611e.size());
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20730a(LinkedList<String> linkedList, WeakReference<C18508z2> weakReference, C15601d<? super C20730a> dVar) {
            super(2, dVar);
            this.f58608e = linkedList;
            this.f58609f = weakReference;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C20730a(this.f58608e, this.f58609f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C20730a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            LinkedList<C118459qf> linkedList;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f58607d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C20729b bVar = C20729b.f58601a;
                C20729b.f58606f.addAll(this.f58608e);
                C19428d dVar = C19428d.f54856a;
                LinkedList<String> linkedList2 = this.f58608e;
                this.f58607d = 1;
                obj = dVar.mo25171e(3, linkedList2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C118474vf vfVar = (C118474vf) obj;
            C20729b bVar2 = C20729b.f58601a;
            C20729b.f58606f.removeAll(this.f58608e);
            C8477a0 a0Var = new C8477a0();
            if (!(vfVar == null || (linkedList = vfVar.f354494d) == null)) {
                for (C118459qf qfVar : linkedList) {
                    C19428d dVar2 = C19428d.f54856a;
                    if (dVar2.mo25182q(qfVar.f354270d, qfVar.f354271e)) {
                        a0Var.f27482d = true;
                        dVar2.mo25153F(qfVar.f354270d, qfVar.f354271e, 3);
                        Log.m105924i("MicroMsg.BizFinderLiveUILogic", "checkPosition data change bizUserName=" + qfVar.f354270d);
                    }
                    dVar2.mo25159L(qfVar);
                }
            }
            Log.m105918d("MicroMsg.BizFinderLiveUILogic", "checkPosition isChange=" + a0Var.f27482d);
            if (a0Var.f27482d) {
                C61926c.m72668M(new C20731a(this.f58609f, this.f58608e));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo32440a(StoryListView storyListView, C18508z2 z2Var) {
        View childAt;
        C19428d dVar = C19428d.f54856a;
        if (((Boolean) ((C36570n) C19428d.f54865j).getValue()).booleanValue() && storyListView != null && z2Var != null) {
            int firstVisiblePosition = storyListView.getFirstVisiblePosition();
            int lastVisiblePosition = storyListView.getLastVisiblePosition();
            LinkedList linkedList = new LinkedList();
            if (firstVisiblePosition <= lastVisiblePosition) {
                int i = firstVisiblePosition;
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (!(i == 0 || (childAt = storyListView.getChildAt(i2)) == null)) {
                        Object tag = childAt.getTag();
                        C18206a aVar = tag instanceof C18206a ? (C18206a) tag : null;
                        C19623o0 o0Var = aVar != null ? aVar.f50327a : null;
                        if (o0Var != null && o0Var.mo25754B2()) {
                            String str = o0Var.field_talker;
                            if (!(str == null || C112551y.m153811k(str)) && C19428d.f54856a.mo25165R(o0Var.field_talker)) {
                                linkedList.add(o0Var.field_talker);
                            }
                        }
                    }
                    if (i == lastVisiblePosition) {
                        break;
                    }
                    i++;
                    i2 = i3;
                }
            }
            Log.m105918d("MicroMsg.BizFinderLiveUILogic", "checkPosition startPos=" + firstVisiblePosition + ", endPos=" + lastVisiblePosition + ", size = " + linkedList.size());
            linkedList.removeAll(f58606f);
            if (!Util.isNullOrNil((List) linkedList)) {
                C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C20730a(linkedList, new WeakReference(z2Var), (C15601d<? super C20730a>) null), 2, (Object) null);
            }
        }
    }
}
