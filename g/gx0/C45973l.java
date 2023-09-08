package gx0;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C74866y0;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import d62.C7250m;

/* renamed from: gx0.l */
public class C45973l {

    /* renamed from: a */
    public final Activity f123986a;

    /* renamed from: b */
    public String f123987b;

    /* renamed from: c */
    public C74866y0 f123988c;

    public C45973l(Activity activity, String str) {
        this.f123986a = activity;
        this.f123987b = str;
    }

    /* renamed from: a */
    public boolean mo71367a(int i, int i2, Intent intent) {
        if (i != 1) {
            return false;
        }
        if (i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("be_send_card_name");
            String stringExtra2 = intent.getStringExtra("received_card_name");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            String stringExtra3 = intent.getStringExtra("custom_send_text");
            C7250m.m7431a().Y50(stringExtra, stringExtra2, booleanExtra);
            C7250m.m7431a().mo136252Ar(stringExtra3, stringExtra2);
            Activity activity = this.f123986a;
            C75026b.m89951a(activity, activity.getString(C0966R.string.fjh));
        }
        return true;
    }
}
