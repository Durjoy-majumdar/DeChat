package rn3;

import android.view.View;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rn3.f0 */
public class C77550f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SelectConversationUI f226095d;

    public C77550f0(SelectConversationUI selectConversationUI) {
        this.f226095d = selectConversationUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/transmit/SelectConversationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SelectConversationUI selectConversationUI = this.f226095d;
        if (selectConversationUI.f220170U0) {
            selectConversationUI.mo104138o8();
        } else {
            String stringExtra = selectConversationUI.getIntent().getStringExtra("Select_App_Id");
            if (!this.f226095d.f220177Y || !Util.isNullOrNil(stringExtra)) {
                this.f226095d.mo104137n8();
            } else {
                this.f226095d.mo104142s8();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/transmit/SelectConversationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
