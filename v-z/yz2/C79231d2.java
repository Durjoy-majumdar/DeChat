package yz2;

import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity;
import qo3.C47883u;

/* renamed from: yz2.d2 */
public final class C79231d2 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ TextStatusEditHalfScreenActivity f232601a;

    public C79231d2(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
        this.f232601a = textStatusEditHalfScreenActivity;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        this.f232601a.hideVKB();
        if (z) {
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f232601a;
            textStatusEditHalfScreenActivity.f207065C1 = true;
            textStatusEditHalfScreenActivity.finish();
        }
    }
}
