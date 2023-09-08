package gg0;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactIntroUI;
import com.tencent.p014mm.plugin.account.p024ui.MobileInputUI;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import hg0.C76186t;
import p214om.C11502f;
import wc3.C15141z;
import wg0.C78595a;

/* renamed from: gg0.w */
public class C116959w implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FindMContactIntroUI f350528d;

    public C116959w(FindMContactIntroUI findMContactIntroUI) {
        this.f350528d = findMContactIntroUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C76186t.m91542j(true);
        C78595a.m94985e("R200_100");
        Intent intent = new Intent();
        intent.putExtra("mobile_input_purpose", 4);
        intent.putExtra("regsetinfo_ticket", this.f350528d.f344356f);
        intent.putExtra("regsetinfo_NextStep", this.f350528d.f344357g);
        intent.putExtra("regsetinfo_NextStyle", this.f350528d.f344358h);
        C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
        FindMContactIntroUI findMContactIntroUI = this.f350528d;
        ((C67654r1) yM).getClass();
        if (findMContactIntroUI != null) {
            intent.setClass(findMContactIntroUI, MobileInputUI.class);
            MMWizardActivity.m7017L7(findMContactIntroUI, intent);
        }
        C78595a.m94985e("R300_300_phone");
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(this.f350528d.getClass().getName());
        sb.append(",");
        sb.append("R300_200_phone");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("R300_200_phone"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }
}
