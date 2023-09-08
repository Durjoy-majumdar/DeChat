package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.view.C57702l;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.y4 */
public class C57813y4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextPreviewUI f165428d;

    public C57813y4(TextPreviewUI textPreviewUI) {
        this.f165428d = textPreviewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/TextPreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextPreviewUI textPreviewUI = this.f165428d;
        C72963f4 f4Var = textPreviewUI.f215373t;
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_POSITION_REMIND_MSG_TIP_IN_BOOLEAN;
        if (((Boolean) u.mo119685f(aVar, Boolean.TRUE)).booleanValue()) {
            C76879j.m92749t(textPreviewUI.getContext(), textPreviewUI.getResources().getString(C0966R.string.hzg), textPreviewUI.getResources().getString(C0966R.string.hzh), new C57695u4(textPreviewUI, f4Var));
            C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.FALSE);
        } else {
            C57702l lVar = new C57702l(textPreviewUI.getContext());
            lVar.f165149h = new C57696v4(textPreviewUI, lVar, f4Var);
            C104428a aVar2 = lVar.f165144c;
            if (aVar2 != null) {
                aVar2.show();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
