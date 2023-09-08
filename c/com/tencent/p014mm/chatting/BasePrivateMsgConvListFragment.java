package com.tencent.p014mm.chatting;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p739wi.C53170a;
import p739wi.C78601d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64187h0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "CONVERSATION", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "a", "b", "common-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment */
public abstract class BasePrivateMsgConvListFragment<CONVERSATION extends IAutoDBItem> extends UIComponentFragment {

    /* renamed from: u */
    public static final /* synthetic */ int f108290u = 0;

    /* renamed from: j */
    public C40274b<CONVERSATION> f108291j;

    /* renamed from: n */
    public final C13601g f108292n = C36568h.m40985a(new C40278f(this));

    /* renamed from: o */
    public final C13601g f108293o = C36568h.m40985a(new C40277e(this));

    /* renamed from: p */
    public final C13601g f108294p = C36568h.m40985a(new C40276d(this));

    /* renamed from: q */
    public final C13601g f108295q = C36568h.m40985a(new C40279g(this));

    /* renamed from: r */
    public final C13601g f108296r = C36568h.m40985a(new C40275c(this));

    /* renamed from: s */
    public long f108297s;

    /* renamed from: t */
    public C78601d f108298t;

    /* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment$a */
    public static abstract class C40273a<CONVERSATION> extends RecyclerView.C16613e<C53170a> implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public C32224a<C13598b0> f108299d;

        /* renamed from: F4 */
        public abstract List<CONVERSATION> mo62831F4();

        /* renamed from: G4 */
        public abstract void mo62832G4(boolean z, List<? extends CONVERSATION> list);

        /* renamed from: O4 */
        public abstract boolean mo62833O4(String str, MStorageEventData mStorageEventData);

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            C32224a<C13598b0> aVar;
            if (mo62833O4(str, mStorageEventData) && (aVar = this.f108299d) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment$b */
    public interface C40274b<T extends IAutoDBItem> {
        /* renamed from: L4 */
        MAutoStorage<T> mo62834L4();

        /* renamed from: M4 */
        List<T> mo62835M4(int i);

        /* renamed from: N4 */
        List<T> mo62836N4();
    }

    /* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment$c */
    public static final class C40275c extends C87413o implements C32224a<C40273a<CONVERSATION>> {

        /* renamed from: d */
        public final /* synthetic */ BasePrivateMsgConvListFragment<CONVERSATION> f108300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40275c(BasePrivateMsgConvListFragment<CONVERSATION> basePrivateMsgConvListFragment) {
            super(0);
            this.f108300d = basePrivateMsgConvListFragment;
        }

        public Object invoke() {
            C40273a<CONVERSATION> T = this.f108300d.mo62819T();
            T.f108299d = new C40281a(this.f108300d);
            return T;
        }
    }

    /* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment$d */
    public static final class C40276d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ BasePrivateMsgConvListFragment<CONVERSATION> f108301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40276d(BasePrivateMsgConvListFragment<CONVERSATION> basePrivateMsgConvListFragment) {
            super(0);
            this.f108301d = basePrivateMsgConvListFragment;
        }

        public Object invoke() {
            return this.f108301d.mo62825a0();
        }
    }

    /* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment$e */
    public static final class C40277e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ BasePrivateMsgConvListFragment<CONVERSATION> f108302d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40277e(BasePrivateMsgConvListFragment<CONVERSATION> basePrivateMsgConvListFragment) {
            super(0);
            this.f108302d = basePrivateMsgConvListFragment;
        }

        public Object invoke() {
            return this.f108302d.mo62827e0();
        }
    }

    /* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment$f */
    public static final class C40278f extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ BasePrivateMsgConvListFragment<CONVERSATION> f108303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40278f(BasePrivateMsgConvListFragment<CONVERSATION> basePrivateMsgConvListFragment) {
            super(0);
            this.f108303d = basePrivateMsgConvListFragment;
        }

        public Object invoke() {
            return this.f108303d.mo62828f0();
        }
    }

    /* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment$g */
    public static final class C40279g extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ BasePrivateMsgConvListFragment<CONVERSATION> f108304d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40279g(BasePrivateMsgConvListFragment<CONVERSATION> basePrivateMsgConvListFragment) {
            super(0);
            this.f108304d = basePrivateMsgConvListFragment;
        }

        public Object invoke() {
            return this.f108304d.mo62829g0();
        }
    }

    /* renamed from: com.tencent.mm.chatting.BasePrivateMsgConvListFragment$h */
    public static final class C40280h extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ BasePrivateMsgConvListFragment<CONVERSATION> f108305a;

        public C40280h(BasePrivateMsgConvListFragment<CONVERSATION> basePrivateMsgConvListFragment) {
            this.f108305a = basePrivateMsgConvListFragment;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            List<CONVERSATION> M4 = this.f108305a.mo62824Z().mo62835M4(this.f108305a.mo62821V().getItemCount());
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
            cVar.f24952g = false;
            cVar.f24951f = true ^ M4.isEmpty();
            cVar.f24953h = M4.size();
            this.f108305a.mo62821V().mo62832G4(false, M4);
            this.f108305a.mo62822X().onPreFinishLoadMoreSmooth(cVar);
            this.f108305a.mo62818S();
        }
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C64187h0.f181908d;
    }

    /* renamed from: O */
    public void mo2202O() {
        C117292a.m165355a("com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.mo2202O();
        C117292a.m165361g(this, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    /* renamed from: P */
    public void mo3550P() {
        C117292a.m165355a("com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.mo3550P();
        C117292a.m165361g(this, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    /* renamed from: R */
    public void mo62817R() {
    }

    /* renamed from: S */
    public final void mo62818S() {
        if (mo62821V().getItemCount() == 0) {
            View view = (View) ((C36570n) this.f108294p).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo62822X().setVisibility(8);
            return;
        }
        View view3 = (View) ((C36570n) this.f108294p).getValue();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo62822X().setVisibility(0);
    }

    /* renamed from: T */
    public abstract C40273a<CONVERSATION> mo62819T();

    /* renamed from: U */
    public abstract List<MStorage> mo62820U();

    /* renamed from: V */
    public final C40273a<CONVERSATION> mo62821V() {
        return (C40273a) ((C36570n) this.f108296r).getValue();
    }

    /* renamed from: X */
    public final RefreshLoadMoreLayout mo62822X() {
        return (RefreshLoadMoreLayout) ((C36570n) this.f108295q).getValue();
    }

    /* renamed from: Y */
    public abstract C40274b<CONVERSATION> mo62823Y();

    /* renamed from: Z */
    public final C40274b<CONVERSATION> mo62824Z() {
        C40274b<CONVERSATION> bVar = this.f108291j;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("dataSource");
        throw null;
    }

    /* renamed from: a0 */
    public abstract View mo62825a0();

    /* renamed from: d0 */
    public int mo62826d0() {
        return 0;
    }

    /* renamed from: e0 */
    public abstract View mo62827e0();

    /* renamed from: f0 */
    public abstract RecyclerView mo62828f0();

    /* renamed from: g0 */
    public abstract RefreshLoadMoreLayout mo62829g0();

    /* renamed from: h0 */
    public void mo62830h0(long j) {
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        mo62824Z().mo62834L4().remove(mo62821V());
        for (MStorage remove : mo62820U()) {
            remove.remove(mo62821V());
        }
    }

    public void onResume() {
        super.onResume();
        mo62818S();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        this.f108297s = SystemClock.uptimeMillis();
        C39818r rVar = C39818r.f106831a;
        FragmentActivity activity = getActivity();
        C87412m.m108591d(activity);
        C39622i0 a = rVar.mo62443b(activity).mo75002a(C78601d.class);
        C87412m.m108593f(a, "UICProvider.of(this.acti…yChattingUIC::class.java)");
        this.f108298t = (C78601d) a;
        RecyclerView recyclerView = (RecyclerView) ((C36570n) this.f108292n).getValue();
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(mo62821V());
        C40274b<CONVERSATION> Y = mo62823Y();
        C87412m.m108594g(Y, "<set-?>");
        this.f108291j = Y;
        mo62824Z().mo62834L4().add(mo62821V());
        for (MStorage add : mo62820U()) {
            add.add(mo62821V());
        }
        mo62822X().setActionCallback(new C40280h(this));
        View view2 = (View) ((C36570n) this.f108293o).getValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        List N4 = mo62824Z().mo62836N4();
        mo62821V().mo62832G4(true, N4);
        mo62817R();
        if (mo62826d0() > N4.size()) {
            mo62822X().setEnableLoadMore(false);
        }
        mo62830h0(SystemClock.uptimeMillis() - this.f108297s);
        View view4 = (View) ((C36570n) this.f108293o).getValue();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo62818S();
    }
}
