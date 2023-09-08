package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import er1.C7881t2;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9707f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.y3 */
public final class C3892y3 extends C87413o implements C32227p<Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17471d;

    /* renamed from: e */
    public final /* synthetic */ ShareRelPresenter f17472e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3892y3(FinderShareFeedRelUI finderShareFeedRelUI, ShareRelPresenter shareRelPresenter) {
        super(2);
        this.f17471d = finderShareFeedRelUI;
        this.f17472e = shareRelPresenter;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        boolean z = false;
        this.f17471d.mo4134g8(false);
        C9707f fVar = this.f17472e.f29964g;
        RecyclerView recyclerView = fVar != null ? fVar.getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        View view = this.f17471d.f17137L;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.c1m);
            if (textView != null) {
                textView.setTextColor(-1);
            }
            if (intValue != -5002) {
                if (intValue == -4036) {
                    View view2 = this.f17471d.f17137L;
                    if (view2 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (str != null) {
                            if (str.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                textView.setText(str);
                            }
                        }
                        textView.setText(C0966R.string.eoh);
                    } else {
                        C87412m.m108603p("tipsLayout");
                        throw null;
                    }
                } else if (intValue == -4033) {
                    View view4 = this.f17471d.f17137L;
                    if (view4 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (str != null) {
                            if (str.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                textView.setText(str);
                            }
                        }
                        textView.setText(C0966R.string.d_8);
                    } else {
                        C87412m.m108603p("tipsLayout");
                        throw null;
                    }
                } else if (intValue != -4011) {
                    this.f17471d.mo4135i8(true);
                } else {
                    View view6 = this.f17471d.f17137L;
                    if (view6 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (str != null) {
                            if (str.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                textView.setText(str);
                            }
                        }
                        textView.setText(C0966R.string.f360503d90);
                    } else {
                        C87412m.m108603p("tipsLayout");
                        throw null;
                    }
                }
            } else if (str != null) {
                C7881t2.f26501a.mo8997b(this.f17471d, str);
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("tipsLayout");
        throw null;
    }
}
