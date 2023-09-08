package en2;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct;
import com.tencent.p014mm.plugin.setting.p102ui.setting.permission.BaseSettingPermissionUI;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p447aw.C103918d;

/* renamed from: en2.a */
public final class C7767a extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ BaseSettingPermissionUI f26261d;

    public C7767a(BaseSettingPermissionUI baseSettingPermissionUI) {
        this.f26261d = baseSettingPermissionUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initDesc$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new UserPrivacySettingClientReportStruct();
        userPrivacySettingClientReportStruct.f10079d = 101;
        userPrivacySettingClientReportStruct.mo86054n();
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f26261d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initDesc$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(this.f26261d.getContext().getResources().getColor(C0966R.color.f2958ae));
    }
}
