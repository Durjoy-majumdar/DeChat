package sz0;

import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13598b0;
import te3.C50655oa3;
import uz0.C102117c;

/* renamed from: sz0.s */
public final class C48516s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C48517t f129762d;

    /* renamed from: e */
    public final /* synthetic */ C50655oa3 f129763e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48516s(C48517t tVar, C50655oa3 oa32) {
        super(0);
        this.f129762d = tVar;
        this.f129763e = oa32;
    }

    public Object invoke() {
        this.f129762d.mo73151y().f312094e = C76577a.m92151b(this.f129762d.mo73151y().getContext(), 32);
        MemberCardTopCropImageView y = this.f129762d.mo73151y();
        C48517t tVar = this.f129762d;
        y.f312093d = tVar.f129771z;
        ViewGroup.LayoutParams layoutParams = tVar.mo73151y().getLayoutParams();
        C48517t tVar2 = this.f129762d;
        layoutParams.height = tVar2.f129771z;
        MemberCardTopCropImageView y2 = tVar2.mo73151y();
        boolean z = false;
        y2.setVisibility(0);
        ImageView imageView = this.f129762d.f129770G;
        if (imageView != null) {
            imageView.setVisibility(0);
            String str = this.f129763e.f139067n;
            if (!(str == null || str.length() == 0)) {
                MemberCardTopCropImageView y3 = this.f129762d.mo73151y();
                String str2 = this.f129763e.f139067n;
                C48517t tVar3 = this.f129762d;
                C102117c.m134521b(y3, str2, tVar3.f129764A, tVar3.f129771z);
            } else {
                String str3 = this.f129763e.f139066j;
                if (str3 == null || str3.length() == 0) {
                    z = true;
                }
                if (!z) {
                    this.f129762d.mo73151y().setImageDrawable(C102117c.m134520a(Color.parseColor(this.f129763e.f139066j)));
                }
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("shadowIv");
        throw null;
    }
}
