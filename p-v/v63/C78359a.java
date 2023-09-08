package v63;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ie3.C76330f;
import junit.framework.Assert;

/* renamed from: v63.a */
public class C78359a {

    /* renamed from: v63.a$a */
    public class C78360a implements C72478z.C72479a {

        /* renamed from: a */
        public final /* synthetic */ Context f229632a;

        public C78360a(Context context) {
            this.f229632a = context;
        }

        public void onClick(View view) {
            Log.m105924i("MicroMsg.PayUUtil", "hy: user clicked the span");
            C75228t.m90219L(this.f229632a, "https://www.payu.co.za/wechat/terms-and-conditions/", true);
        }
    }

    /* renamed from: v63.a$b */
    public class C78361b implements C72478z.C72479a {

        /* renamed from: a */
        public final /* synthetic */ Context f229633a;

        public C78361b(Context context) {
            this.f229633a = context;
        }

        public void onClick(View view) {
            Log.m105924i("MicroMsg.PayUUtil", "hy: user clicked the tos span");
            C75228t.m90219L(this.f229633a, C76330f.f223587a, true);
        }
    }

    /* renamed from: a */
    public static void m94632a(Context context, TextView textView) {
        Assert.assertTrue((context == null || textView == null) ? false : true);
        C72478z zVar = new C72478z(context);
        zVar.mo99888a(new C78360a(context));
        C72478z zVar2 = new C72478z(context);
        zVar2.mo99888a(new C78361b(context));
        String charSequence = context.getText(C0966R.string.l5d).toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(zVar, 94, 115, 33);
        spannableString.setSpan(zVar2, charSequence.length() - 3, charSequence.length(), 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
