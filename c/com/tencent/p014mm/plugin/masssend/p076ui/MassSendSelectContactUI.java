package com.tencent.p014mm.plugin.masssend.p076ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.HeaderViewListAdapter;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74502i1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.C74551q1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.C74568u;
import com.tencent.p014mm.p136ui.contact.C74572v;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import eb0.C75592q0;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI */
public class MassSendSelectContactUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public Button f201463C;

    /* renamed from: D */
    public List<String> f201464D;

    /* renamed from: E */
    public List<String> f201465E;

    /* renamed from: F */
    public boolean f201466F;

    /* renamed from: G */
    public MultiSelectContactView f201467G;

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI$a */
    public class C69826a implements MenuItem.OnMenuItemClickListener {
        public C69826a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.MassSendSelectContactUI", "Click Next Btn");
            ArrayList<String> stringsToList = Util.stringsToList((String[]) ((LinkedList) MassSendSelectContactUI.this.f201465E).toArray(new String[0]));
            if (stringsToList == null) {
                Log.m105920e("MicroMsg.MassSendSelectContactUI", "no choosed anyone");
                return false;
            }
            stringsToList.remove(C75592q0.m90789s());
            String listToString = Util.listToString(stringsToList, ";");
            Intent intent = new Intent(MassSendSelectContactUI.this, MassSendMsgUI.class);
            intent.putExtra("mass_send_contact_list", listToString);
            MassSendSelectContactUI massSendSelectContactUI = MassSendSelectContactUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MassSendSelectContactUI massSendSelectContactUI2 = massSendSelectContactUI;
            C117292a.m165358d(massSendSelectContactUI2, aVar.mo10232b(), "com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            massSendSelectContactUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(massSendSelectContactUI2, "com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI$b */
    public class C69827b implements View.OnClickListener {
        public C69827b() {
        }

        public void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.MassSendSelectContactUI", "Click SelectAll");
            C74502i1 i1Var = (C74502i1) ((HeaderViewListAdapter) MassSendSelectContactUI.this.f218605d.getAdapter()).getWrappedAdapter();
            MassSendSelectContactUI massSendSelectContactUI = MassSendSelectContactUI.this;
            if (!massSendSelectContactUI.f201466F) {
                massSendSelectContactUI.f201463C.setText(C0966R.string.gpb);
                int count = i1Var.getCount();
                for (int i = 0; i < count; i++) {
                    C75922b j = i1Var.getItem(i);
                    if (!(j == null || (str = j.f222621r) == null)) {
                        ((LinkedList) MassSendSelectContactUI.this.f201465E).add(str);
                    }
                }
                MassSendSelectContactUI massSendSelectContactUI2 = MassSendSelectContactUI.this;
                massSendSelectContactUI2.f201467G.mo100245e(massSendSelectContactUI2.f201465E);
            } else {
                massSendSelectContactUI.f201463C.setText(C0966R.string.gpn);
                MassSendSelectContactUI.this.f201467G.mo100245e(new LinkedList());
                ((LinkedList) MassSendSelectContactUI.this.f201465E).clear();
            }
            MassSendSelectContactUI massSendSelectContactUI3 = MassSendSelectContactUI.this;
            massSendSelectContactUI3.f201466F = !massSendSelectContactUI3.f201466F;
            massSendSelectContactUI3.mo96069g8(((LinkedList) massSendSelectContactUI3.f201465E).size());
            i1Var.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI$c */
    public class C69828c implements MultiSelectContactView.C72731d {
        public C69828c() {
        }

        /* renamed from: e6 */
        public void mo64521e6(int i, String str) {
            if (i == 1 && str != null) {
                ((LinkedList) MassSendSelectContactUI.this.f201465E).remove(str);
                MassSendSelectContactUI massSendSelectContactUI = MassSendSelectContactUI.this;
                massSendSelectContactUI.mo96069g8(((LinkedList) massSendSelectContactUI.f201465E).size());
            }
        }
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        C74572v vVar = new C74572v();
        vVar.f219205b = true;
        vVar.f219214k = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        return new C74568u(this, this.f201464D, true, true, vVar);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1(this, this.f201464D, true, this.f218604A);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131072};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return getString(C0966R.string.gpo);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        C74502i1 N7 = mo103379N7();
        C75922b j2 = N7.getItem(i - this.f218605d.getHeaderViewsCount());
        if (j2 != null && (str = j2.f222621r) != null) {
            Log.m105925i("MicroMsg.MassSendSelectContactUI", "ClickUser=%s", str);
            String str2 = j2.f222621r;
            mo103378K7();
            if (((LinkedList) this.f201465E).contains(str2)) {
                ((LinkedList) this.f201465E).remove(str2);
                this.f201467G.mo100244d(str2);
            } else {
                ((LinkedList) this.f201465E).add(str2);
                this.f201467G.mo100244d(str2);
            }
            mo96069g8(((LinkedList) this.f201465E).size());
            N7.notifyDataSetChanged();
            mo103378K7();
            mo103377J7();
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        ArrayList arrayList = new ArrayList();
        this.f201464D = arrayList;
        arrayList.addAll(C74560s1.m89273b());
        this.f201464D.addAll(C45628s0.m50776h());
        this.f201464D.add(C75592q0.m90789s());
        this.f201465E = new LinkedList();
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return true;
    }

    /* renamed from: a8 */
    public void mo96068a8(String str) {
        C115669n.INSTANCE.mo160131h(11225, 1, 0);
        Intent intent = new Intent();
        intent.putExtra("label", str);
        intent.putExtra("always_select_contact", Util.listToString(new ArrayList(this.f201465E), ","));
        intent.putExtra("list_attr", C74560s1.m89278g(16384, 64));
        C88144b.m109802t(this, ".ui.contact.SelectLabelContactUI", intent, 0);
    }

    /* renamed from: g8 */
    public final void mo96069g8(int i) {
        if (i > 0) {
            updateOptionMenuText(1, getString(C0966R.string.gpm) + "(" + ((LinkedList) this.f201465E).size() + ")");
            enableOptionMenu(1, true);
            return;
        }
        updateOptionMenuText(1, getString(C0966R.string.gpm));
        enableOptionMenu(1, false);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bb9;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.MassSendSelectContactUI", "requestCode=%d | resultCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1 && i == 0) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105924i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
                return;
            }
            Log.m105925i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS select username=%s", stringExtra);
            for (String str : stringExtra.split(",")) {
                if (((LinkedList) this.f201465E).add(str)) {
                    this.f201467G.mo100244d(str);
                }
            }
            mo96069g8(((LinkedList) this.f201465E).size());
            mo103379N7().notifyDataSetChanged();
            C106742j1 j1Var = this.f218610i;
            if (j1Var != null) {
                j1Var.mo153849a();
                this.f218610i.mo153850b();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.MassSendSelectContactUI", "create!");
        MultiSelectContactView multiSelectContactView = this.f218609h;
        this.f201467G = multiSelectContactView;
        if (multiSelectContactView == null) {
            finish();
            return;
        }
        multiSelectContactView.setBackgroundDrawable((Drawable) null);
        addTextOptionMenu(1, getString(C0966R.string.gpm), new C69826a(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        Button button = (Button) findViewById(C0966R.C0970id.f359150j93);
        this.f201463C = button;
        button.setOnClickListener(new C69827b());
        this.f201467G.setOnContactDeselectListener(new C69828c());
        mo96069g8(((LinkedList) this.f201465E).size());
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return ((LinkedList) this.f201465E).contains(str);
    }
}
