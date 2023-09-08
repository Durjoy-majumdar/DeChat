package nj3;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.AlertActivity;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.p136ui.C97212f4;
import j20.C117292a;
import k20.C9556a;
import qo3.C77390c0;

/* renamed from: nj3.v0 */
public class C100124v0 extends C77390c0 {

    /* renamed from: d */
    public TextView f293283d;

    /* renamed from: e */
    public ImageView f293284e;

    /* renamed from: f */
    public Context f293285f;

    /* renamed from: g */
    public View f293286g;

    /* renamed from: h */
    public Handler f293287h = new C100125a(Looper.getMainLooper());

    /* renamed from: nj3.v0$a */
    public class C100125a extends Handler {
        public C100125a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C85975v4.m106306c("MicroMsg.MMTipsDialog", "mTipsBuilder handleMessage", new Object[0]);
            Context context = C100124v0.this.f293285f;
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                C100124v0.this.dismiss();
            }
        }
    }

    /* renamed from: nj3.v0$b */
    public static class C100126b {

        /* renamed from: a */
        public C100124v0 f293289a;

        /* renamed from: b */
        public Context f293290b;

        /* renamed from: c */
        public C97212f4 f293291c = new C97212f4();

        public C100126b(Context context) {
            this.f293290b = context;
        }

        /* renamed from: a */
        public C100124v0 mo139424a() {
            ImageView imageView;
            Context context = this.f293290b;
            C97212f4 f4Var = this.f293291c;
            C100124v0 v0Var = new C100124v0(context, f4Var.f285232a, f4Var.f285233b);
            C97212f4 f4Var2 = this.f293291c;
            CharSequence charSequence = f4Var2.f285234c;
            if (charSequence != null && charSequence.length() > 0) {
                v0Var.f293283d.setText(f4Var2.f285234c);
            }
            Drawable drawable = f4Var2.f285235d;
            if (!(drawable == null || (imageView = v0Var.f293284e) == null)) {
                imageView.setImageDrawable(drawable);
            }
            v0Var.setCanceledOnTouchOutside(f4Var2.f285236e);
            DialogInterface.OnDismissListener onDismissListener = f4Var2.f285237f;
            if (onDismissListener != null) {
                v0Var.setOnDismissListener(onDismissListener);
            }
            DialogInterface.OnCancelListener onCancelListener = f4Var2.f285238g;
            if (onCancelListener != null) {
                v0Var.setOnCancelListener(onCancelListener);
            }
            return v0Var;
        }
    }

    public C100124v0(Context context, int i, int i2) {
        super(context, i);
        int i3;
        this.f293285f = context;
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = C0966R.C0971layout.bfq;
            } else if (i2 == 2) {
                i3 = C0966R.C0971layout.bfj;
            }
            View inflate = View.inflate(context, i3, (ViewGroup) null);
            this.f293286g = inflate;
            this.f293283d = (TextView) inflate.findViewById(C0966R.C0970id.h16);
            this.f293284e = (ImageView) this.f293286g.findViewById(C0966R.C0970id.f15);
            setCanceledOnTouchOutside(true);
        }
        i3 = C0966R.C0971layout.bfp;
        View inflate2 = View.inflate(context, i3, (ViewGroup) null);
        this.f293286g = inflate2;
        this.f293283d = (TextView) inflate2.findViewById(C0966R.C0970id.h16);
        this.f293284e = (ImageView) this.f293286g.findViewById(C0966R.C0970id.f15);
        setCanceledOnTouchOutside(true);
    }

    /* renamed from: c */
    public static C100124v0 m130821c(Drawable drawable, CharSequence charSequence, Context context, int i, DialogInterface.OnDismissListener onDismissListener) {
        int i2 = C0966R.style.a6a;
        if (i != 0 && i == 1) {
            i2 = C0966R.style.a66;
        }
        C100126b bVar = new C100126b(context);
        C97212f4 f4Var = bVar.f293291c;
        f4Var.f285232a = i2;
        f4Var.f285233b = i;
        f4Var.f285234c = charSequence;
        f4Var.f285235d = drawable;
        f4Var.f285236e = true;
        f4Var.f285237f = onDismissListener;
        if (bVar.f293290b instanceof Activity) {
            if (bVar.f293289a == null) {
                bVar.f293289a = bVar.mo139424a();
            }
            bVar.f293289a.show();
        } else {
            AlertActivity.f284188n = bVar;
            Intent intent = new Intent(bVar.f293290b, AlertActivity.class);
            intent.setFlags(335544320);
            intent.putExtra("dialog_scene", 2);
            Context context2 = bVar.f293290b;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/ui/base/MMTipsDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/ui/base/MMTipsDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return bVar.f293289a;
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f293286g, new LinearLayout.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
    }

    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            C85975v4.m106307d("MicroMsg.MMTipsDialog", e, "", new Object[0]);
        }
        this.f293287h.sendEmptyMessageDelayed(0, 1000);
    }
}
