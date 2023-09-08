package ve1;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C60905o;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: ve1.d6 */
public final class C52812d6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f147549d;

    /* renamed from: e */
    public final /* synthetic */ WeImageView f147550e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f147551f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52812d6(Bitmap bitmap, WeImageView weImageView, C60905o oVar) {
        super(0);
        this.f147549d = bitmap;
        this.f147550e = weImageView;
        this.f147551f = oVar;
    }

    public Object invoke() {
        Bitmap bitmap = this.f147549d;
        if (bitmap != null) {
            this.f147550e.setImageBitmap(bitmap);
            this.f147550e.setIconColor(C76577a.m92153d(this.f147551f.f173499A, C0966R.color.FG_1));
        }
        return C13598b0.f38549a;
    }
}
