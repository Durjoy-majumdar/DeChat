package hp1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;

/* renamed from: hp1.a0 */
public final class C8650a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8657d0 f27805d;

    /* renamed from: e */
    public final /* synthetic */ FinderContact f27806e;

    public C8650a0(C8657d0 d0Var, FinderContact finderContact) {
        this.f27805d = d0Var;
        this.f27806e = finderContact;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C8657d0 d0Var = this.f27805d;
        String str = this.f27806e.username;
        if (str == null) {
            str = "";
        }
        d0Var.getClass();
        Intent intent = new Intent();
        intent.putExtra("finder_username", str);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, d0Var.f27814a, intent, 0, (String) null, 0, 1, false, 0, 192, (Object) null);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(d0Var.f27814a, intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
