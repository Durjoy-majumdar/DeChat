package kf1;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView;
import com.tencent.p014mm.view.RCConstraintLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: kf1.n4 */
public final class C9867n4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9765h4 f30448d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9867n4(C9765h4 h4Var) {
        super(0);
        this.f30448d = h4Var;
    }

    public Object invoke() {
        this.f30448d.mo10364e3();
        LinearLayout linearLayout = this.f30448d.f30270i;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            ConstraintLayout constraintLayout = this.f30448d.f30242C;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
                RCConstraintLayout rCConstraintLayout = this.f30448d.f30269h;
                if (rCConstraintLayout != null) {
                    rCConstraintLayout.setVisibility(8);
                    ConcertTicketTextView concertTicketTextView = this.f30448d.f30267f;
                    if (concertTicketTextView != null) {
                        concertTicketTextView.setVisibility(8);
                        ConcertTicketTextView concertTicketTextView2 = this.f30448d.f30272n;
                        if (concertTicketTextView2 != null) {
                            concertTicketTextView2.setVisibility(8);
                            ConcertTicketTextView concertTicketTextView3 = this.f30448d.f30273o;
                            if (concertTicketTextView3 != null) {
                                concertTicketTextView3.setVisibility(8);
                                View view = this.f30448d.f30268g;
                                if (view != null) {
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(8);
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    ImageView imageView = this.f30448d.f30241B;
                                    if (imageView != null) {
                                        imageView.setImageDrawable(new ColorDrawable(this.f30448d.getContext().getResources().getColor(C0966R.color.f2938l)));
                                        return C13598b0.f38549a;
                                    }
                                    C87412m.m108603p("concertlayoutBg");
                                    throw null;
                                }
                                C87412m.m108603p("playDivider");
                                throw null;
                            }
                            C87412m.m108603p("changeImgBtn");
                            throw null;
                        }
                        C87412m.m108603p("saveImgBtn");
                        throw null;
                    }
                    C87412m.m108603p("shareBtn");
                    throw null;
                }
                C87412m.m108603p("concertTicketViewRoot");
                throw null;
            }
            C87412m.m108603p("concertRetryLayout");
            throw null;
        }
        C87412m.m108603p("concertLoadingLayout");
        throw null;
    }
}
