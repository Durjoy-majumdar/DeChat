package vf1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRingtoneTimelineUI;
import fy3.C32227p;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9707f;
import rx3.C13598b0;

/* renamed from: vf1.q4 */
public final class C14816q4 extends C87413o implements C32227p<Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderRingtoneTimelineUI f40809d;

    /* renamed from: e */
    public final /* synthetic */ FinderRingtoneTimelineContract$Presenter f40810e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14816q4(FinderRingtoneTimelineUI finderRingtoneTimelineUI, FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter) {
        super(2);
        this.f40809d = finderRingtoneTimelineUI;
        this.f40810e = finderRingtoneTimelineContract$Presenter;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        boolean z = false;
        this.f40809d.mo3099X7(false);
        C9707f fVar = this.f40810e.f29964g;
        RecyclerView recyclerView = fVar != null ? fVar.getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        TextView textView = (TextView) FinderRingtoneTimelineUI.m2957V7(this.f40809d).findViewById(C0966R.C0970id.c1m);
        if (textView != null) {
            textView.setTextColor(-1);
        }
        if (intValue == -4036) {
            View V7 = FinderRingtoneTimelineUI.m2957V7(this.f40809d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = V7;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$2$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$2$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    textView.setText(str);
                }
            }
            textView.setText(C0966R.string.eoh);
        } else if (intValue == -4033) {
            View V72 = FinderRingtoneTimelineUI.m2957V7(this.f40809d);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = V72;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$2$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V72.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$2$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    textView.setText(str);
                }
            }
            textView.setText(C0966R.string.d_8);
        } else if (intValue != -4011) {
            this.f40809d.mo3100Y7(true);
        } else {
            View V73 = FinderRingtoneTimelineUI.m2957V7(this.f40809d);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view3 = V73;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$2$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V73.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$2$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    textView.setText(str);
                }
            }
            textView.setText(C0966R.string.f360503d90);
        }
        return C13598b0.f38549a;
    }
}
