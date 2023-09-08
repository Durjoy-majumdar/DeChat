package gv2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gv2.c */
public class C45961c implements View.OnClickListener {
    public C45961c(AbsSnsUploadSayFooter absSnsUploadSayFooter) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/widget/AbsSnsUploadSayFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$3");
        Log.m105918d("MicroMsg.SnsUpload.AbsSayFooter", "onClick: footer_container");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/widget/AbsSnsUploadSayFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
