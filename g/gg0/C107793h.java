package gg0;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import f40.C86709a0;
import hg0.C46057k0;
import nj3.C76879j;

/* renamed from: gg0.h */
public class C107793h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BindMContactIntroUI f322622d;

    /* renamed from: gg0.h$a */
    public class C107794a implements DialogInterface.OnCancelListener {
        public C107794a(C107793h hVar) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public C107793h(BindMContactIntroUI bindMContactIntroUI) {
        this.f322622d = bindMContactIntroUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = this.f322622d.f344294o;
        if (str != null && !str.equals("")) {
            C86709a0.m107524d().mo123460f(new C46057k0(2));
            BindMContactIntroUI bindMContactIntroUI = this.f322622d;
            bindMContactIntroUI.f344295p = C76879j.m92723Q(bindMContactIntroUI, bindMContactIntroUI.getString(C0966R.string.a3h), this.f322622d.getString(C0966R.string.f360085a04), true, true, new C107794a(this));
        }
    }
}
