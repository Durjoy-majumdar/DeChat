package g22;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelEditUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72955b2;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: g22.i */
public class C75837i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72955b2 f222458d;

    /* renamed from: e */
    public final /* synthetic */ C75838j f222459e;

    public C75837i(C75838j jVar, C72955b2 b2Var) {
        this.f222459e = jVar;
        this.f222458d = b2Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75838j jVar = this.f222459e;
        String str = "" + this.f222458d.field_labelID;
        String str2 = this.f222458d.field_labelName;
        jVar.getClass();
        Log.m105925i("MicroMsg.LabelAdapter", "startActivity ContactEditLabel labelID:%s lebalName:%s", str, str2);
        Intent intent = new Intent();
        intent.putExtra("label_id", str);
        intent.putExtra("label_name", str2);
        intent.putExtra("label_source", "label_source_SNS");
        intent.putExtra("last_page_source_type", 1);
        intent.setClass(jVar.f222465h, ContactLabelEditUI.class);
        Context context = jVar.f222465h;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "jumpToLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "jumpToLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
