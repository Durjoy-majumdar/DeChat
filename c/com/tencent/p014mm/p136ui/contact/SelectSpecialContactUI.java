package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gl3.C75922b;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.contact.SelectSpecialContactUI */
public class SelectSpecialContactUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public String f121734C;

    /* renamed from: D */
    public int f121735D;

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return new C44877d4(this, getIntent().getStringExtra("filter_type"));
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return null;
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return this.f121734C;
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        C75922b j2 = mo103379N7().getItem(i);
        if (j2 != null && (str = j2.f222621r) != null) {
            Log.m105925i("MicroMsg.SelectSpecialContactUI", "ClickUser=%s", str);
            Intent intent = new Intent();
            if (C74560s1.m89275d(this.f121735D, 16384)) {
                intent.putExtra("Select_Contact", str);
                setResult(-1, intent);
                finish();
            } else if (C74560s1.m89275d(this.f121735D, 32768)) {
                intent.putExtra("Contact_User", str);
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 20);
                C88144b.m109795m(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, 1);
            } else {
                intent.setClass(this, ChattingUI.class);
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/contact/SelectSpecialContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/contact/SelectSpecialContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
            }
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f121734C = getIntent().getStringExtra("titile");
        this.f121735D = getIntent().getIntExtra("list_attr", 0);
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.f218607f.mo7853r();
        }
    }
}
