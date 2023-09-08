package ax2;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ax2.h */
public final class C0234h extends Dialog {

    /* renamed from: d */
    public View f766d;

    /* renamed from: e */
    public ImageView f767e;

    /* renamed from: f */
    public ImageView f768f;

    /* renamed from: g */
    public ImageView f769g;

    /* renamed from: h */
    public TextView f770h;

    /* renamed from: i */
    public TextView f771i;

    /* renamed from: j */
    public TextView f772j;

    /* renamed from: n */
    public View f773n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0234h(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.d0v, (ViewGroup) null, false);
        this.f766d = inflate;
        if (inflate != null) {
            inflate.setBackgroundResource(C0966R.C0969drawable.f4421c4);
            this.f767e = (ImageView) inflate.findViewById(C0966R.C0970id.noq);
            this.f768f = (ImageView) inflate.findViewById(C0966R.C0970id.noy);
            this.f769g = (ImageView) inflate.findViewById(C0966R.C0970id.i_l);
            this.f770h = (TextView) inflate.findViewById(C0966R.C0970id.now);
            this.f771i = (TextView) inflate.findViewById(C0966R.C0970id.f358992np2);
            this.f772j = (TextView) inflate.findViewById(C0966R.C0970id.nox);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.not);
            this.f773n = inflate.findViewById(C0966R.C0970id.nos);
            setContentView(inflate);
        }
        long k = C75592q0.m90781k();
        StringBuilder sb = new StringBuilder();
        long j = 2 & k;
        sb.append(j);
        sb.append(",extstatus:");
        sb.append(k);
        Log.m105924i("MicroMsg.QRCodeDialog", sb.toString());
        if (j != 0) {
            View view = this.f773n;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeDialog", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeDialog", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ImageView imageView = this.f768f;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f768f;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        View view3 = this.f773n;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeDialog", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeDialog", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void show() {
        super.show();
    }
}
