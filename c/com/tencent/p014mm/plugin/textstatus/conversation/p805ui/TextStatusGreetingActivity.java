package com.tencent.p014mm.plugin.textstatus.conversation.p805ui;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingActivity */
public class TextStatusGreetingActivity extends MMActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f116873e = 0;

    /* renamed from: d */
    public Fragment f116874d;

    /* renamed from: com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingActivity$a */
    public static final class C43188a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusGreetingActivity f116875d;

        public C43188a(TextStatusGreetingActivity textStatusGreetingActivity) {
            this.f116875d = textStatusGreetingActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f116875d.onBackPressed();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360032c91;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.k0p);
        setBackBtn(new C43188a(this));
        if (this.f116874d == null) {
            this.f116874d = new TextStatusGreetingFragment();
        }
        Fragment fragment = this.f116874d;
        if (fragment != null) {
            C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
            C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.mo165200l(C0966R.C0970id.eek, fragment);
            beginTransaction.mo165164f();
        }
    }
}
