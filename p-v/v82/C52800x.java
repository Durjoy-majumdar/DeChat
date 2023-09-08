package v82;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import c92.C39929d;
import c92.C39930e;
import com.tencent.p014mm.p136ui.base.WxImageView;

/* renamed from: v82.x */
public class C52800x {

    /* renamed from: a */
    public Context f147508a;

    /* renamed from: b */
    public boolean f147509b = false;

    /* renamed from: c */
    public View f147510c;

    /* renamed from: d */
    public WxImageView f147511d;

    /* renamed from: e */
    public TextView f147512e;

    /* renamed from: f */
    public TextView f147513f;

    /* renamed from: g */
    public boolean f147514g = false;

    /* renamed from: h */
    public ViewTreeObserver.OnDrawListener f147515h = new C52801a();

    /* renamed from: v82.x$a */
    public class C52801a implements ViewTreeObserver.OnDrawListener {
        public C52801a() {
        }

        public void onDraw() {
            C52800x xVar = C52800x.this;
            if (!xVar.f147514g) {
                xVar.f147514g = true;
                C39930e.m42720c(C39929d.m42711i(), 0, 0, 0, 0, 0, 0, 0, 1, "", 0);
            }
        }
    }

    public C52800x(Context context) {
        this.f147508a = context;
    }
}
