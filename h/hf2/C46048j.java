package hf2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoSettingUI;

/* renamed from: hf2.j */
public class C46048j implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ NewBizInfoSettingUI f124169d;

    public C46048j(NewBizInfoSettingUI newBizInfoSettingUI) {
        this.f124169d = newBizInfoSettingUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f124169d.f115459t = true;
    }
}
