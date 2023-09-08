package p278yh;

import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.anim.transition.view.AnimMultiTouchImage;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;

/* renamed from: yh.b */
public class C102862b {

    /* renamed from: a */
    public final View f303618a;

    /* renamed from: b */
    public WxImageView f303619b;

    /* renamed from: c */
    public AnimMultiTouchImage f303620c;

    /* renamed from: d */
    public RelativeLayout f303621d;

    /* renamed from: e */
    public MultiTouchImageView f303622e;

    public C102862b(View view) {
        this.f303618a = view;
    }

    /* renamed from: a */
    public WxImageView mo142565a() {
        if (this.f303619b == null) {
            this.f303619b = (WxImageView) this.f303618a.findViewById(C0966R.C0970id.dlv);
        }
        return this.f303619b;
    }

    /* renamed from: b */
    public MultiTouchImageView mo142566b() {
        if (this.f303622e == null) {
            this.f303622e = (MultiTouchImageView) this.f303618a.findViewById(C0966R.C0970id.ob5);
        }
        return this.f303622e;
    }
}
