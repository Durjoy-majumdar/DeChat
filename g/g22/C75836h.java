package g22;

import a22.C27740g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.contact.privacy.SelectPrivacyContactsFromRangeUI;
import com.tencent.p014mm.storage.C72955b2;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;

/* renamed from: g22.h */
public class C75836h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72955b2 f222456d;

    /* renamed from: e */
    public final /* synthetic */ C75838j f222457e;

    public C75836h(C75838j jVar, C72955b2 b2Var) {
        this.f222457e = jVar;
        this.f222456d = b2Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75838j jVar = this.f222457e;
        String str = this.f222456d.field_labelName;
        jVar.getClass();
        HashSet hashSet = new HashSet();
        ArrayList<String> bO = C27740g.vx0().mo100951bO("" + this.f222456d.field_labelID);
        if (bO != null && bO.size() > 0) {
            hashSet.addAll(bO);
        }
        String s = C75592q0.m90789s();
        if (hashSet.contains(s)) {
            hashSet.remove(s);
        }
        Intent intent = new Intent(jVar.f222465h, SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("last_page_source_type", 1);
        intent.putExtra("list_type", 1);
        intent.putExtra("filter_type", "@all.contact.android");
        intent.putExtra("only_show_contact", true);
        Context context = jVar.f222465h;
        if (context instanceof Activity) {
            intent.putExtra("key_label_click_source", ((Activity) context).getIntent().getIntExtra("key_label_click_source", 0));
        }
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
        if (hashSet.size() > 0) {
            intent.putExtra("titile", str + "(" + hashSet.size() + ")");
        } else {
            intent.putExtra("titile", str);
        }
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (String[]) hashSet.toArray(new String[0]));
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(7001);
        aVar.mo10233c(intent);
        C117292a.m165364j((Activity) jVar.f222465h, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "gotoSingleLebalContact", "(Ljava/lang/String;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
