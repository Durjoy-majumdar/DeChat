package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k11.v$$e;
import k20.C60958c;
import k20.C9556a;
import p214om.C11502f;
import qo3.C101218e0;
import qo3.C77426q;
import wc3.C15141z;

/* renamed from: com.tencent.mm.plugin.sns.ui.AtContactWidget$$b */
public class AtContactWidget$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AtContactWidget f276686d;

    public AtContactWidget$$b(AtContactWidget atContactWidget) {
        this.f276686d = atContactWidget;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.AtContactWidget$1");
        AtContactWidget atContactWidget = this.f276686d;
        int i = AtContactWidget.f276675p;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        View view2 = atContactWidget.f276677e;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        View findViewById = view2.findViewById(C0966R.C0970id.f6168z8);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = findViewById;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (C94847c1.m120214b() || C94847c1.m120215c()) {
            MultiProcessMMKV.getDefault().encode("sns_with_together_at_contact_red", 1);
            MultiProcessMMKV.getDefault().encode("sns_with_together_at_contact_red_second_version", 1);
        }
        AtContactWidget atContactWidget2 = this.f276686d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        atContactWidget2.getClass();
        SnsMethodCalculate.markStartTimeMs("addContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (atContactWidget2.f276683n == null) {
            atContactWidget2.f276683n = new LinkedList();
        }
        SnsUploadConfigView snsUploadConfigView = atContactWidget2.f276682j;
        if (snsUploadConfigView == null || snsUploadConfigView.getPrivated() <= 0) {
            Class cls = C32735h.class;
            SnsMethodCalculate.markStartTimeMs("dealAddWithContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            Intent intent = new Intent();
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_withta_select_conversation, 0);
            if (!C94847c1.m120213a() || Qe != 1) {
                intent.putExtra("Contact_Compose", true);
                intent.putExtra("List_Type", 1);
                if (C94847c1.m120213a()) {
                    intent.putExtra("Add_address_titile", atContactWidget2.f276676d.getString(C0966R.string.jje));
                    intent.putExtra("address_ui_sub_title", atContactWidget2.f276676d.getString(C0966R.string.jkb));
                    intent.putExtra("footer_tip", atContactWidget2.f276676d.getString(C0966R.string.jka));
                    intent.putExtra("no_result_tip", atContactWidget2.f276676d.getString(C0966R.string.jam));
                } else {
                    intent.putExtra("Add_address_titile", atContactWidget2.f276676d.getString(C0966R.string.jkc));
                }
                intent.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
                intent.putExtra("Block_list", C75592q0.m90789s());
                intent.putExtra("Select_Contact", Util.listToString(atContactWidget2.f276683n, ","));
                intent.putExtra("sns_address_count", 0);
                C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
                Activity activity = atContactWidget2.f276676d;
                ((C67654r1) yM).getClass();
                if (activity != null) {
                    intent.setClassName(activity, "com.tencent.mm.ui.contact.SnsAddressUI");
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(6);
                    aVar2.mo10233c(intent);
                    C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startSnsAddressUIForResult", "(Landroid/content/Intent;Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            } else {
                SnsMethodCalculate.markStartTimeMs("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                if (!((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_withta_show_teach_dialog, false)) {
                    atContactWidget2.mo132063c();
                    SnsMethodCalculate.markEndTimeMs("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                } else if (MultiProcessMMKV.getMMKV("SnsMMKV").getBoolean("SnsMMKVWithTaTeachDialog", true)) {
                    MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVWithTaTeachDialog", false);
                    Log.m105924i("MicroMsg.AtContactWiget", "showTeachDialog");
                    C101218e0 e0Var = new C101218e0(atContactWidget2.getContext(), 2, 3);
                    e0Var.mo140677w(atContactWidget2.getResources().getString(C0966R.string.f8028zq));
                    e0Var.f296375F = new v$$e(e0Var);
                    e0Var.mo140665l(new AtContactWidget$$a(atContactWidget2));
                    e0Var.mo140676v(1);
                    e0Var.mo140678x(atContactWidget2.getResources().getColor(C0966R.color.al7));
                    e0Var.mo140662i(C0966R.C0971layout.cq6);
                    e0Var.mo140673s(LayoutInflater.from(atContactWidget2.getContext()).inflate(C0966R.C0971layout.cq7, (ViewGroup) null));
                    e0Var.mo140655A();
                    SnsMethodCalculate.markEndTimeMs("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                } else {
                    atContactWidget2.mo132063c();
                    SnsMethodCalculate.markEndTimeMs("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                }
            }
            SnsMethodCalculate.markEndTimeMs("dealAddWithContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            SnsMethodCalculate.markEndTimeMs("addContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        } else {
            C77426q qVar = new C77426q(atContactWidget2.getContext());
            qVar.mo107606r(atContactWidget2.f276676d.getString(C0966R.string.jgd));
            qVar.mo107601m(C0966R.string.lkg);
            qVar.mo107603o();
            SnsMethodCalculate.markEndTimeMs("addContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        }
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.AtContactWidget$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
