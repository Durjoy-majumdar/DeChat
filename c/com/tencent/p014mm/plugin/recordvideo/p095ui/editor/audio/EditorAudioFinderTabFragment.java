package com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import ob0.C11385n;
import p385u2.C111105a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C36907w;
import zh2.C16212x;
import zh2.C66819a;
import zh2.C66820b;
import zh2.C66821c;
import zh2.C66822d;
import zh2.C66823e;
import zh2.C66824f;
import zh2.C66825g;
import zh2.C66826h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'B#\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010(\u001a\u00020\u0018¢\u0006\u0004\b&\u0010)R#\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00038BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\u000e\u001a\n \u0004*\u0004\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0016\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0012R<\u0010!\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment;", "Landroid/widget/FrameLayout;", "Lob0/n;", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "kotlin.jvm.PlatformType", "g", "Lrx3/g;", "getLoadMoreLayout", "()Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "loadMoreLayout", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "h", "getFinderRecycler", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "finderRecycler", "Landroid/view/View;", "i", "getLoadingState", "()Landroid/view/View;", "loadingState", "j", "getEmptyState", "emptyState", "Lkotlin/Function3;", "", "Lcom/tencent/mm/protocal/protobuf/FinderObject;", "Lrx3/b0;", "o", "Lfy3/q;", "getOnFinderVideoSelectListener", "()Lfy3/q;", "setOnFinderVideoSelectListener", "(Lfy3/q;)V", "onFinderVideoSelectListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment */
public abstract class EditorAudioFinderTabFragment extends FrameLayout implements C11385n {

    /* renamed from: d */
    public final ArrayList<C66820b> f163866d;

    /* renamed from: e */
    public int f163867e = -1;

    /* renamed from: f */
    public final WxRecyclerAdapter<C66820b> f163868f;

    /* renamed from: g */
    public final C13601g f163869g = C36568h.m40985a(new C66825g(this));

    /* renamed from: h */
    public final C13601g f163870h = C36568h.m40985a(new C66824f(this));

    /* renamed from: i */
    public final C13601g f163871i = C36568h.m40985a(new C66826h(this));

    /* renamed from: j */
    public final C13601g f163872j = C36568h.m40985a(new C66823e(this));

    /* renamed from: n */
    public boolean f163873n;

    /* renamed from: o */
    public C32228q<? super EditorAudioFinderTabFragment, ? super Integer, ? super FinderObject, C13598b0> f163874o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderTabFragment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        ArrayList<C66820b> arrayList = new ArrayList<>();
        this.f163866d = arrayList;
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cbg, this, true);
        WxRecyclerAdapter<C66820b> wxRecyclerAdapter = new WxRecyclerAdapter<>(new C9500j() {
            public C60896i<?> getItemConvert(int i) {
                return new C66819a();
            }
        }, arrayList, true);
        this.f163868f = wxRecyclerAdapter;
        wxRecyclerAdapter.f173488o = new C66821c(this);
        getLoadMoreLayout().setEnablePullDownHeader(false);
        getLoadMoreLayout().setEnableRefresh(false);
        getLoadMoreLayout().setActionCallback(new C66822d(this));
        getFinderRecycler().setAdapter(wxRecyclerAdapter);
        getFinderRecycler().setLayoutManager(new GridLayoutManager(getContext(), 3));
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        Resources resources = context2.getResources();
        C87412m.m108593f(resources, "mContext.resources");
        C16212x xVar = new C16212x(resources.getDimensionPixelSize(C0966R.dimen.a2e), resources.getDimensionPixelSize(C0966R.dimen.a2e), C111105a.m151500b(context2, C0966R.color.BW_0), false, (C8480h) null);
        WxRecyclerView finderRecycler = getFinderRecycler();
        if (finderRecycler != null) {
            finderRecycler.mo17085h0(xVar);
        }
        mo80773f();
    }

    private final View getEmptyState() {
        return (View) this.f163872j.getValue();
    }

    private final WxRecyclerView getFinderRecycler() {
        return (WxRecyclerView) this.f163870h.getValue();
    }

    /* access modifiers changed from: private */
    public final RefreshLoadMoreLayout getLoadMoreLayout() {
        return (RefreshLoadMoreLayout) this.f163869g.getValue();
    }

    private final View getLoadingState() {
        return (View) this.f163871i.getValue();
    }

    /* renamed from: b */
    public final void mo80771b() {
        C66820b bVar = (C66820b) C110818d0.m150917O(this.f163866d, this.f163867e);
        if (bVar != null) {
            bVar.f191939e = false;
        }
        this.f163868f.notifyItemChanged(this.f163867e, 1);
        this.f163867e = -1;
    }

    /* renamed from: c */
    public abstract void mo6011c();

    /* renamed from: d */
    public final void mo80772d(List<? extends FinderObject> list, boolean z) {
        List<? extends FinderObject> list2 = list;
        C87412m.m108594g(list2, "newData");
        int size = this.f163866d.size();
        int size2 = list.size();
        int size3 = this.f163866d.size();
        ArrayList<C66820b> arrayList = this.f163866d;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list2, 10));
        for (FinderObject bVar : list) {
            arrayList2.add(new C66820b(bVar, false, false, 6, (C8480h) null));
        }
        arrayList.addAll(arrayList2);
        this.f163868f.notifyItemRangeInserted(size, size2);
        if (size3 == 0 && size2 == 0) {
            View loadingState = getLoadingState();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = loadingState;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingState.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View emptyState = getEmptyState();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = emptyState;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            emptyState.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getLoadMoreLayout().setVisibility(8);
        } else if (size3 != 0 || size2 <= 0) {
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
            cVar.f24951f = z;
            getLoadMoreLayout().mo82441G(cVar);
        } else {
            View loadingState2 = getLoadingState();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(loadingState2, aVar3.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingState2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(loadingState2, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View emptyState2 = getEmptyState();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view3 = emptyState2;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            emptyState2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getLoadMoreLayout().setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo6012e() {
        mo80771b();
        WxRecyclerView finderRecycler = getFinderRecycler();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(finderRecycler, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
        finderRecycler.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(finderRecycler, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
        if (!this.f163873n) {
            this.f163873n = true;
            mo6011c();
        }
    }

    /* renamed from: f */
    public final void mo80773f() {
        View loadingState = getLoadingState();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(loadingState, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadingState.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(loadingState, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View emptyState = getEmptyState();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view = emptyState;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        emptyState.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getLoadMoreLayout().setVisibility(8);
    }

    public final C32228q<EditorAudioFinderTabFragment, Integer, FinderObject, C13598b0> getOnFinderVideoSelectListener() {
        return this.f163874o;
    }

    public final void setOnFinderVideoSelectListener(C32228q<? super EditorAudioFinderTabFragment, ? super Integer, ? super FinderObject, C13598b0> qVar) {
        this.f163874o = qVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorAudioFinderTabFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        ArrayList<C66820b> arrayList = new ArrayList<>();
        this.f163866d = arrayList;
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cbg, this, true);
        WxRecyclerAdapter<C66820b> wxRecyclerAdapter = new WxRecyclerAdapter<>(new C9500j() {
            public C60896i<?> getItemConvert(int i) {
                return new C66819a();
            }
        }, arrayList, true);
        this.f163868f = wxRecyclerAdapter;
        wxRecyclerAdapter.f173488o = new C66821c(this);
        getLoadMoreLayout().setEnablePullDownHeader(false);
        getLoadMoreLayout().setEnableRefresh(false);
        getLoadMoreLayout().setActionCallback(new C66822d(this));
        getFinderRecycler().setAdapter(wxRecyclerAdapter);
        getFinderRecycler().setLayoutManager(new GridLayoutManager(getContext(), 3));
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        Resources resources = context2.getResources();
        C87412m.m108593f(resources, "mContext.resources");
        C16212x xVar = new C16212x(resources.getDimensionPixelSize(C0966R.dimen.a2e), resources.getDimensionPixelSize(C0966R.dimen.a2e), C111105a.m151500b(context2, C0966R.color.BW_0), false, (C8480h) null);
        WxRecyclerView finderRecycler = getFinderRecycler();
        if (finderRecycler != null) {
            finderRecycler.mo17085h0(xVar);
        }
        mo80773f();
    }
}
