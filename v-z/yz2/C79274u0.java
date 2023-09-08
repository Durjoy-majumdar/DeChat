package yz2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import b03.C39693c0;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.C81895h2;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;
import kr0.C76628m0;
import zp3.C79406f;

/* renamed from: yz2.u0 */
public final class C79274u0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f232721d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232722e;

    public C79274u0(ViewGroup viewGroup, TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232721d = viewGroup;
        this.f232722e = textStatusDoWhatActivityV2;
    }

    public boolean onPreDraw() {
        View view;
        View view2;
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.f232721d;
        if (!(viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        C76628m0 m0Var = this.f232722e.f206842w;
        if (!(m0Var == null || (view = ((C81895h2) m0Var).getView()) == null)) {
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232722e;
            ViewGroup viewGroup2 = this.f232721d;
            KeyBoardUtil.getKeyBordHeightPx(textStatusDoWhatActivityV2);
            C76577a.m92151b(MMApplicationContext.getContext(), 50);
            int j = ((((C76577a.m92159j(MMApplicationContext.getContext()) - C75044y4.m89994f(MMApplicationContext.getContext())) - textStatusDoWhatActivityV2.mo98426O7().getHeight()) - C76577a.m92150a(view.getContext(), 248.0f)) - C76577a.m92150a(view.getContext(), 32.0f)) - C75044y4.m89991c(view.getContext());
            if (j <= 0) {
                j = C79406f.m96347a(view.getContext(), 300.0f);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, j);
            layoutParams.addRule(9);
            layoutParams.addRule(12);
            view.setLayoutParams(layoutParams);
            C76628m0 m0Var2 = textStatusDoWhatActivityV2.f206842w;
            if (!(m0Var2 == null || (view2 = ((C81895h2) m0Var2).getView()) == null)) {
                view2.requestLayout();
            }
            view.setOutlineProvider(new C39693c0(true, false, (float) C76577a.m92151b(view.getContext(), 12)));
            view.setClipToOutline(true);
            viewGroup2.addView(view);
            view.setTranslationY((float) j);
            Log.m105919d("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "viewGroup?.viewTreeObserver?.addOnPreDrawListener:  height：%s", Integer.valueOf(j));
        }
        return true;
    }
}
