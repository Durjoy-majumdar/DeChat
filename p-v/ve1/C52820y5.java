package ve1;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C60905o;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: ve1.y5 */
public final class C52820y5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f147568d;

    /* renamed from: e */
    public final /* synthetic */ WeImageView f147569e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f147570f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52820y5(Bitmap bitmap, WeImageView weImageView, C60905o oVar) {
        super(0);
        this.f147568d = bitmap;
        this.f147569e = weImageView;
        this.f147570f = oVar;
    }

    public Object invoke() {
        Bitmap bitmap = this.f147568d;
        if (bitmap != null) {
            this.f147569e.setImageBitmap(bitmap);
            this.f147569e.setIconColor(C76577a.m92153d(this.f147570f.f173499A, C0966R.color.FG_1));
        }
        return C13598b0.f38549a;
    }
}
