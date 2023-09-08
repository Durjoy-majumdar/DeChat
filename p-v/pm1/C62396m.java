package pm1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0797z;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import p182kk.C61104a;
import rx3.C13598b0;
import te3.C64273c21;

/* renamed from: pm1.m */
public final class C62396m extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62381d f177349d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62396m(C62381d dVar) {
        super(1);
        this.f177349d = dVar;
    }

    public Object invoke(Object obj) {
        boolean z;
        int intValue = ((Number) obj).intValue();
        Log.m105924i(this.f177349d.mo87439r(), "invokeOnTouchMoveCallback pos:" + intValue);
        C62381d dVar = this.f177349d;
        RecyclerView recyclerView = dVar.f177286b;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            View findViewByPosition = ((FinderStaggeredGridLayoutManager) layoutManager).findViewByPosition(intValue);
            if (findViewByPosition != null) {
                boolean z2 = true;
                if (dVar.f177288d && !dVar.f177305u) {
                    C9493c cVar = dVar.f177287c.get(intValue - dVar.mo87438q());
                    if (cVar instanceof C0797z) {
                        C64273c21 c212 = ((C0797z) cVar).mo3513o().getFeedObject().liveInfo;
                        z = !(c212 != null && c212.f182394f == 1);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        NearbyLivePreviewView nearbyLivePreviewView = (NearbyLivePreviewView) findViewByPosition.findViewWithTag("nearby-live-preview-view-tag");
                        if (nearbyLivePreviewView != null) {
                            z2 = nearbyLivePreviewView.f160231o;
                        }
                        if (z2 && !C61104a.m71660p()) {
                            C62407x xVar = new C62407x(findViewByPosition, intValue, dVar.mo87444w(intValue));
                            View view = xVar.f177372b;
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            if (xVar.f177371a) {
                                View view3 = xVar.f177373c;
                                if (view3 != null) {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(0);
                                    View view4 = view3;
                                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                View view5 = xVar.f177374d;
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                aVar3.mo10233c(0);
                                View view6 = view5;
                                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                if (xVar.mo87455a()) {
                                    View view7 = xVar.f177375e;
                                    if (view7 != null) {
                                        C9556a aVar4 = new C9556a();
                                        aVar4.mo10233c(0);
                                        View view8 = view7;
                                        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                } else {
                                    View view9 = xVar.f177375e;
                                    if (view9 != null) {
                                        C9556a aVar5 = new C9556a();
                                        aVar5.mo10233c(8);
                                        View view10 = view9;
                                        C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                        C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                }
                                View view11 = xVar.f177376f;
                                if (view11 != null) {
                                    C9556a aVar6 = new C9556a();
                                    aVar6.mo10233c(8);
                                    View view12 = view11;
                                    C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                    C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            } else {
                                View view13 = xVar.f177376f;
                                if (view13 != null) {
                                    C9556a aVar7 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                                    aVar7.mo10233c(0);
                                    View view14 = view13;
                                    C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                    C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                View view15 = xVar.f177377g;
                                if (view15 != null) {
                                    C9556a aVar8 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                                    aVar8.mo10233c(0);
                                    View view16 = view15;
                                    C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                                    C117292a.m165359e(view16, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                if (xVar.mo87455a()) {
                                    View view17 = xVar.f177378h;
                                    if (view17 != null) {
                                        C9556a aVar9 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                                        aVar9.mo10233c(0);
                                        View view18 = view17;
                                        C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                                        C117292a.m165359e(view18, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                } else {
                                    View view19 = xVar.f177378h;
                                    if (view19 != null) {
                                        C9556a aVar10 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                                        aVar10.mo10233c(8);
                                        View view20 = view19;
                                        C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                                        C117292a.m165359e(view20, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                }
                                View view21 = xVar.f177373c;
                                if (view21 != null) {
                                    C9556a aVar11 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                                    aVar11.mo10233c(8);
                                    View view22 = view21;
                                    C117292a.m165358d(view22, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view21.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                                    C117292a.m165359e(view22, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            }
                        }
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
