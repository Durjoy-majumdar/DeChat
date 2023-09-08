package ve1;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import jq3.C60905o;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: ve1.k5 */
public final class C52817k5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f147559d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<WeImageView> f147560e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f147561f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52817k5(Bitmap bitmap, C8479f0<WeImageView> f0Var, C60905o oVar) {
        super(0);
        this.f147559d = bitmap;
        this.f147560e = f0Var;
        this.f147561f = oVar;
    }

    public Object invoke() {
        Bitmap bitmap = this.f147559d;
        if (bitmap != null) {
            ((WeImageView) this.f147560e.f27484d).setImageBitmap(bitmap);
            ((WeImageView) this.f147560e.f27484d).setIconColor(C76577a.m92153d(this.f147561f.f173499A, C0966R.color.FG_1));
        }
        return C13598b0.f38549a;
    }
}
