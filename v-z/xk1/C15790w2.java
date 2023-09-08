package xk1;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import nj3.C11184p0;
import nj3.C76912y0;
import qo3.C77407n;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C64373fs0;
import tf0.C13883o1;
import uo3.C78253a;

/* renamed from: xk1.w2 */
public final class C15790w2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C15771r2 f42551d;

    /* renamed from: e */
    public final /* synthetic */ C64373fs0 f42552e;

    public C15790w2(C15771r2 r2Var, C64373fs0 fs02) {
        this.f42551d = r2Var;
        this.f42552e = fs02;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        boolean z = false;
        if (itemId == 1) {
            C78253a aVar = this.f42551d.f42513j;
            if (aVar != null) {
                aVar.mo108266a();
            }
            int e = C31543z5.m39455e();
            String str = this.f42551d.f42507d;
            Log.m105924i(str, "showPopupMenu modifyTime:" + this.f42551d.f42521u + ",serverTime:" + e);
            String string = this.f42551d.getContext().getResources().getString(C0966R.string.e_f);
            C87412m.m108593f(string, "context.resources.getStr…bidden_edit_dialog_title)");
            C15771r2 r2Var = this.f42551d;
            long j = r2Var.f42521u;
            if (j == Long.MIN_VALUE) {
                C76912y0.makeText((Context) r2Var.getContext(), (CharSequence) string, 0).show();
            } else if (j - ((long) C31543z5.m39455e()) <= 0) {
                AppCompatActivity activity = this.f42551d.getActivity();
                Intent intent = new Intent();
                C64373fs0 fs02 = this.f42552e;
                C15771r2 r2Var2 = this.f42551d;
                intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", fs02.f183213d);
                intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", fs02.f183214e);
                intent.putExtra("KEY_SOURCE", r2Var2.getIntent().getIntExtra("KEY_SOURCE", 0));
                C13598b0 b0Var = C13598b0.f38549a;
                ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13285ny(activity, intent, 1);
            } else {
                C15771r2 r2Var3 = this.f42551d;
                String c3 = r2Var3.mo14486c3();
                C77426q qVar = new C77426q(r2Var3.getContext());
                if (string.length() == 0) {
                    z = true;
                }
                if (z) {
                    qVar.mo107595g(c3);
                } else {
                    qVar.mo107606r(string);
                    qVar.mo107595g(c3);
                }
                String string2 = r2Var3.getContext().getResources().getString(C0966R.string.f360528df1);
                C87412m.m108593f(string2, "context.resources.getStr…ive_alert_dialog_btn_txt)");
                qVar.mo107602n(string2);
                qVar.mo107600l(new C15779s2(r2Var3));
                qVar.mo107603o();
            }
        } else if (itemId == 2) {
            C78253a aVar2 = this.f42551d.f42513j;
            if (aVar2 != null) {
                aVar2.mo108266a();
            }
            C15771r2 r2Var4 = this.f42551d;
            r2Var4.f42514n = new C77407n((Context) r2Var4.getContext(), 1, false);
            View inflate = View.inflate(r2Var4.getContext(), C0966R.C0971layout.b6k, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.fs_);
            textView.setText(r2Var4.getContext().getResources().getString(C0966R.string.e_d));
            textView.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
            C77407n nVar = r2Var4.f42514n;
            if (nVar != null) {
                nVar.mo107569n(inflate, false);
            }
            C77407n nVar2 = r2Var4.f42514n;
            if (nVar2 != null) {
                nVar2.f225771i = new C15780t2(r2Var4);
            }
            if (nVar2 != null) {
                nVar2.f225782p = new C15782u2(r2Var4);
            }
            if (nVar2 != null) {
                nVar2.mo107573q();
            }
        }
    }
}
