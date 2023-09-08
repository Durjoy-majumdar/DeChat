package g63;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import nj3.C76879j;
import p206nj.C11171e;
import p629ny.C76979h;
import qn3.C77382c;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: g63.a */
public class C45890a {

    /* renamed from: g63.a$a */
    public class C45891a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76879j.C47267l f123852d;

        /* renamed from: e */
        public final /* synthetic */ EditText f123853e;

        /* renamed from: f */
        public final /* synthetic */ Context f123854f;

        /* renamed from: g63.a$a$a */
        public class C45892a implements Runnable {
            public C45892a() {
            }

            public void run() {
                ((MMActivity) C45891a.this.f123854f).hideVKB();
            }
        }

        public C45891a(C76879j.C47267l lVar, EditText editText, Context context) {
            this.f123852d = lVar;
            this.f123853e = editText;
            this.f123854f = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C76879j.C47267l lVar = this.f123852d;
            if (lVar != null ? lVar.onFinish(this.f123853e.getText().toString().trim()) : true) {
                dialogInterface.dismiss();
                if (this.f123854f instanceof MMActivity) {
                    MMHandlerThread.postToMainThread(new C45892a());
                }
            }
        }
    }

    /* renamed from: g63.a$b */
    public class C45893b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f123856d;

        /* renamed from: e */
        public final /* synthetic */ EditText f123857e;

        /* renamed from: f */
        public final /* synthetic */ Context f123858f;

        public C45893b(boolean z, EditText editText, Context context) {
            this.f123856d = z;
            this.f123857e = editText;
            this.f123858f = context;
        }

        public void run() {
            if (this.f123856d && this.f123857e != null && C11171e.m11046c(28)) {
                this.f123857e.requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) this.f123858f.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(this.f123857e, 0);
                }
            }
        }
    }

    /* renamed from: g63.a$c */
    public interface C45894c {
    }

    /* renamed from: a */
    public static C77398g m51175a(Context context, String str, String str2, String str3, boolean z, int i, C76879j.C47267l lVar, DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C77389a aVar = new C77389a();
        aVar.f225668y = false;
        aVar.f225669z = true;
        aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
        aVar.f225621D = onClickListener;
        aVar.f225644a = str;
        View inflate = View.inflate(context, C0966R.C0971layout.cdg, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.cd7);
        if (!Util.isNullOrNil(str2)) {
            editText.append(((C76979h) C86312j.m106911c(C76979h.class)).yp0(context, str2, editText.getTextSize()));
        }
        ((TextView) inflate.findViewById(C0966R.C0970id.knp)).setVisibility(8);
        if (!Util.isNullOrNil(str3)) {
            editText.setHint(str3);
        }
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
        aVar.f225620C = new C45891a(lVar, editText, context);
        aVar.f225641X = false;
        if (i > 0) {
            C77382c b = C77382c.m93286b(editText);
            b.f225611e = 0;
            b.f225610d = i;
            b.mo107499d((C77382c.C77383a) null);
        }
        aVar.f225627J = inflate;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        boolean z2 = context instanceof MMActivity;
        if (z2) {
            ((MMActivity) context).addDialog(gVar);
        }
        if (z2) {
            inflate.postDelayed(new C45893b(z, editText, context), 200);
        }
        return gVar;
    }
}
