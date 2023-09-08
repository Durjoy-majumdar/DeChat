package uz0;

import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13598b0;
import te3.C22502jn;
import uz0.C22676g;

/* renamed from: uz0.f */
public final class C22674f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C22676g.C22677a f65208d;

    /* renamed from: e */
    public final /* synthetic */ C22502jn f65209e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22674f(C22676g.C22677a aVar, C22502jn jnVar) {
        super(0);
        this.f65208d = aVar;
        this.f65209e = jnVar;
    }

    public Object invoke() {
        MemberCardTopCropImageView memberCardTopCropImageView = this.f65208d.f65219G;
        if (memberCardTopCropImageView != null) {
            memberCardTopCropImageView.f312094e = C76577a.m92151b(memberCardTopCropImageView.getContext(), 32);
            C22676g.C22677a aVar = this.f65208d;
            MemberCardTopCropImageView memberCardTopCropImageView2 = aVar.f65219G;
            if (memberCardTopCropImageView2 != null) {
                memberCardTopCropImageView2.f312093d = aVar.f65221z;
                ViewGroup.LayoutParams layoutParams = memberCardTopCropImageView2.getLayoutParams();
                C22676g.C22677a aVar2 = this.f65208d;
                layoutParams.height = aVar2.f65221z;
                MemberCardTopCropImageView memberCardTopCropImageView3 = aVar2.f65219G;
                if (memberCardTopCropImageView3 != null) {
                    boolean z = false;
                    memberCardTopCropImageView3.setVisibility(0);
                    ImageView imageView = this.f65208d.f65220H;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        String str = this.f65209e.f64054i;
                        if (!(str == null || str.length() == 0)) {
                            C22676g.C22677a aVar3 = this.f65208d;
                            MemberCardTopCropImageView memberCardTopCropImageView4 = aVar3.f65219G;
                            if (memberCardTopCropImageView4 != null) {
                                C102117c.m134521b(memberCardTopCropImageView4, this.f65209e.f64054i, aVar3.f65213A, aVar3.f65221z);
                            } else {
                                C87412m.m108603p("bgIv");
                                throw null;
                            }
                        } else {
                            String str2 = this.f65209e.f64053h;
                            if (str2 == null || str2.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                MemberCardTopCropImageView memberCardTopCropImageView5 = this.f65208d.f65219G;
                                if (memberCardTopCropImageView5 != null) {
                                    memberCardTopCropImageView5.setImageDrawable(C102117c.m134520a(Color.parseColor(this.f65209e.f64053h)));
                                } else {
                                    C87412m.m108603p("bgIv");
                                    throw null;
                                }
                            }
                        }
                        return C13598b0.f38549a;
                    }
                    C87412m.m108603p("shadowBgIv");
                    throw null;
                }
                C87412m.m108603p("bgIv");
                throw null;
            }
            C87412m.m108603p("bgIv");
            throw null;
        }
        C87412m.m108603p("bgIv");
        throw null;
    }
}
