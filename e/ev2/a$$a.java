package ev2;

import a22.C67001a;
import android.content.Intent;
import android.view.View;
import b22.C28250a;
import com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

public final /* synthetic */ class a$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97753a f286773d;

    public /* synthetic */ a$$a(C97753a aVar) {
        this.f286773d = aVar;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        Object child;
        C97753a aVar = this.f286773d;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
        SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        a$$d a__d = (view.getTag() == null || !(view.getTag() instanceof a$$d)) ? null : (a$$d) view.getTag();
        if (a__d == null) {
            Log.m105928w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
            SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            C117292a.m165361g(aVar, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        a$$c a__c = aVar.f286772s;
        if (a__c != null) {
            SnsMethodCalculate.markStartTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$1");
            int i = a__d.f286780a;
            int i2 = a__d.f286781b;
            SnsLabelUI snsLabelUI = SnsLabelUI.this;
            int i3 = SnsLabelUI.f278212C;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI.getClass();
            SnsMethodCalculate.markStartTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            C97753a aVar2 = snsLabelUI.f278221j;
            if (aVar2 == null || (child = aVar2.getChild(i, i2)) == null || !(child instanceof String)) {
                str = "(Landroid/view/View;)V";
                str3 = "onClick";
                str2 = "android/view/View$OnClickListener";
            } else {
                String str4 = (String) child;
                String f = ((C67001a) C28250a.m38138a()).mo90968f(str4);
                Intent intent = new Intent();
                str = "(Landroid/view/View;)V";
                intent.putExtra("label_id", f);
                intent.putExtra("label_name", str4);
                intent.putExtra("is_show_delete", false);
                intent.putExtra("key_label_click_source", 3);
                intent.putExtra("last_page_source_type", 1);
                str3 = "onClick";
                str2 = "android/view/View$OnClickListener";
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_new_contact_label_ui, 1) == 1) {
                    Log.m105924i("MicroMsg.SnsLabelUI", "startActivity ContactEditLabel ");
                    C88144b.m109795m(snsLabelUI.getContext(), "label", ".ui.ContactEditLabel", intent, 4002);
                } else {
                    Log.m105924i("MicroMsg.SnsLabelUI", "startActivity ContactLabelEditUI ");
                    C88144b.m109795m(snsLabelUI.getContext(), "label", ".ui.ContactLabelEditUI", intent, 4002);
                }
            }
            SnsMethodCalculate.markEndTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$1");
        } else {
            str = "(Landroid/view/View;)V";
            str3 = "onClick";
            str2 = "android/view/View$OnClickListener";
        }
        SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        C117292a.m165361g(aVar, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", str2, str3, str);
    }
}
