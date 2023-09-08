package ig0;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.friend.p022ui.FindMContactAddUI;
import com.tencent.p014mm.plugin.account.friend.p022ui.FindMContactInviteUI;

/* renamed from: ig0.d */
public class C76338d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FindMContactAddUI f223592d;

    public C76338d(FindMContactAddUI findMContactAddUI) {
        this.f223592d = findMContactAddUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = this.f223592d.f196553s;
        if (str == null || !str.contains("2")) {
            this.f223592d.mo93953O7();
            return;
        }
        Intent intent = new Intent(this.f223592d, FindMContactInviteUI.class);
        intent.putExtra("regsetinfo_ticket", this.f223592d.f196551q);
        intent.putExtra("login_type", this.f223592d.f196555u);
        intent.putExtra("regsetinfo_NextStyle", this.f223592d.f196554t);
        MMWizardActivity.m7017L7(this.f223592d, intent);
    }
}
