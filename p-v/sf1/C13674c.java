package sf1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: sf1.c */
public final class C13674c {

    /* renamed from: a */
    public static final C13674c f38721a = new C13674c();

    /* renamed from: a */
    public final void mo13060a(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        int d = C76577a.m92153d(oVar.f173499A, C0966R.color.f3395rc);
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.f1t);
        if (weImageView != null) {
            weImageView.mo104518r(C0966R.raw.finder_full_comment_outlined, C0966R.color.f3585yj);
            weImageView.setIconColor(d);
        }
        View D = oVar.mo85812D(C0966R.C0970id.bjq);
        if (D != null) {
            D.setEnabled(false);
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.bje);
        if (textView != null) {
            textView.setTextColor(d);
        }
        WeImageView weImageView2 = (WeImageView) oVar.mo85812D(C0966R.C0970id.f1x);
        if (weImageView2 != null) {
            weImageView2.setIconColor(d);
        }
        View D2 = oVar.mo85812D(C0966R.C0970id.a2s);
        if (D2 != null) {
            D2.setEnabled(false);
        }
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.fnp);
        if (textView2 != null) {
            textView2.setTextColor(d);
        }
        ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.e6u);
        View findViewById = viewGroup != null ? viewGroup.findViewById(C0966R.C0970id.a2r) : null;
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/logic/FinderScanPreviewLogic", "modifyConvertUILogic", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/logic/FinderScanPreviewLogic", "modifyConvertUILogic", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D3 = oVar.mo85812D(C0966R.C0970id.eh4);
        if (D3 != null && (D3 instanceof FinderFullSeekBarLayout)) {
            ((FinderFullSeekBarLayout) D3).setHidePrivateLike(true);
        }
    }
}
