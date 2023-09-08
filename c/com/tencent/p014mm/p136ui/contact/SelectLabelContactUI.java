package com.tencent.p014mm.p136ui.contact;

import a22.C67001a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.contact.SelectLabelContactUI */
public class SelectLabelContactUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public String f218839C;

    /* renamed from: D */
    public int f218840D;

    /* renamed from: E */
    public List<String> f218841E;

    /* renamed from: F */
    public HashSet<String> f218842F;

    /* renamed from: G */
    public HashSet<String> f218843G;

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f218843G.contains(str);
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return new C44883r0(this, C74560s1.m89275d(this.f218840D, 64), ((C67001a) C28250a.m38138a()).mo90973k(((C67001a) C28250a.m38138a()).mo90968f(this.f218839C)), this.f218841E);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return null;
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return this.f218839C;
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        int headerViewsCount = i - this.f218605d.getHeaderViewsCount();
        C74502i1 N7 = mo103379N7();
        C75922b j2 = N7.getItem(headerViewsCount);
        if (j2 != null && (str = j2.f222621r) != null) {
            Log.m105925i("MicroMsg.SelectLabelContactUI", "ClickUser=%s", str);
            if (!C74560s1.m89275d(this.f218840D, 64)) {
                mo103465g8(str);
            } else if (this.f218843G.contains(str) || this.f218842F.contains(str) || !C74560s1.m89275d(this.f218840D, 131072) || this.f218843G.size() + this.f218842F.size() < getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) {
                if (!this.f218843G.contains(str)) {
                    if (this.f218842F.contains(str)) {
                        this.f218842F.remove(str);
                    } else {
                        this.f218842F.add(str);
                    }
                }
                mo103466i8();
                N7.notifyDataSetChanged();
            } else {
                C76879j.m92749t(getContext(), getString(C0966R.string.iiv, new Object[]{Integer.valueOf(getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE))}), "", new C74583w3(this));
            }
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f218839C = getIntent().getStringExtra("label");
        this.f218840D = getIntent().getIntExtra("list_attr", 0);
        this.f218842F = new HashSet<>();
        this.f218843G = new HashSet<>();
        this.f218841E = new ArrayList();
        String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f218843G.addAll(Util.stringsToList(stringExtra.split(",")));
        }
        String stringExtra2 = getIntent().getStringExtra("already_select_contact");
        if (!Util.isNullOrNil(stringExtra2)) {
            this.f218842F.addAll(Util.stringsToList(stringExtra2.split(",")));
        }
        String stringExtra3 = getIntent().getStringExtra("block_contact");
        if (!Util.isNullOrNil(stringExtra3)) {
            this.f218841E.addAll(Util.stringsToList(stringExtra3.split(",")));
        }
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: g8 */
    public final void mo103465g8(String str) {
        if (C74560s1.m89275d(this.f218840D, 16384)) {
            Intent intent = new Intent();
            intent.putExtra("Select_Contact", str);
            setResult(-1, intent);
            finish();
            return;
        }
        Intent intent2 = new Intent();
        intent2.setClass(this, ChattingUI.class);
        intent2.putExtra("Chat_User", str);
        intent2.putExtra("finish_direct", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/contact/SelectLabelContactUI", "handleSelect", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/ui/contact/SelectLabelContactUI", "handleSelect", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    /* renamed from: i8 */
    public final void mo103466i8() {
        if (!C74560s1.m89275d(this.f218840D, 64) || this.f218842F.size() <= 0) {
            updateOptionMenuText(1, getString(C0966R.string.a18));
            enableOptionMenu(1, false);
            return;
        }
        updateOptionMenuText(1, getString(C0966R.string.a18) + "(" + this.f218842F.size() + ")");
        enableOptionMenu(1, true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C74560s1.m89275d(this.f218840D, 64)) {
            addTextOptionMenu(1, getString(C0966R.string.a18), new C74575v3(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        }
        mo103466i8();
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f218842F.contains(str);
    }
}
