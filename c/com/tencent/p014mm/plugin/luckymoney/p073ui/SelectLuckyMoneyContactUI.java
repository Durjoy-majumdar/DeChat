package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.C74551q1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import p240sx.C77810t;
import p740wo.C53193b;
import wc3.C78541w;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI */
public class SelectLuckyMoneyContactUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public View f115090C;

    /* renamed from: D */
    public List<String> f115091D;

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return ((C77810t) C86312j.m106911c(C77810t.class)).mo107762De(this, this.f115091D, true, false);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1(this, this.f115091D, false, this.f218604A);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131072};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return getString(C0966R.string.giy);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        String str2;
        if (i < this.f218605d.getHeaderViewsCount()) {
            Log.m105925i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", Integer.valueOf(i));
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
            int intExtra = getIntent().getIntExtra("key_friends_num", 0);
            Intent intent = new Intent();
            int g = C74560s1.m89278g(16, 1, 2, 4, 16384, 64, 65536, 131072);
            intent.putExtra("list_type", 0);
            intent.putExtra("list_attr", g);
            intent.putExtra("max_limit_num", intExtra);
            intent.putExtra("titile", getString(C0966R.string.gix, new Object[]{Integer.valueOf(intExtra)}));
            intent.putExtra("sub_title", getString(C0966R.string.liw));
            C88144b.m109802t(this, ".ui.contact.SelectContactUI", intent, 1);
            overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            return;
        }
        C75922b bVar = (C75922b) this.f218605d.getAdapter().getItem(i);
        if (bVar != null && (str = bVar.f222621r) != null) {
            Log.m105925i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", str);
            Intent intent2 = new Intent();
            intent2.putExtra("Select_Conv_User", str);
            if (C72996z1.m85820U5(str)) {
                str2 = getString(C0966R.string.l8o, new Object[]{Integer.valueOf(((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str))});
            } else {
                str2 = null;
            }
            String str3 = str;
            ((C78541w) C86312j.m106911c(C78541w.class)).Iu0(this.mController, (Bitmap) null, str3, getString(C0966R.string.i4d), str, str2, getString(C0966R.string.a2s), new C42541r5(this, intent2));
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        HashSet hashSet = new HashSet();
        hashSet.addAll(C74560s1.m89273b());
        hashSet.addAll(C45628s0.m50776h());
        String stringExtra = getIntent().getStringExtra("Select_block_List");
        if (!Util.isNullOrNil(stringExtra)) {
            hashSet.addAll(Util.stringsToList(stringExtra.split(",")));
        }
        ArrayList arrayList = new ArrayList();
        this.f115091D = arrayList;
        arrayList.addAll(hashSet);
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: Z7 */
    public void mo66629Z7() {
        super.mo66629Z7();
        hideVKB();
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
        if (this.f115090C == null) {
            View inflate = View.inflate(this, C0966R.C0971layout.bvy, (ViewGroup) null);
            this.f115090C = inflate.findViewById(C0966R.C0970id.br8);
            ((TextView) inflate.findViewById(C0966R.C0970id.kms)).setText(C0966R.string.ggp);
            listView.addHeaderView(inflate);
        }
        View view = this.f115090C;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/SelectLuckyMoneyContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/SelectLuckyMoneyContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = " + intent.toString());
        } else {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = null");
        }
        if (i != 1) {
            Log.m105920e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = " + i);
        } else if (i2 == -1) {
            Log.m105924i("MicroMsg.SelectRemittanceContactUI", "getIntent = " + getIntent());
            setResult(-1, intent);
            finish();
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            mo66629Z7();
        }
        return super.onKeyUp(i, keyEvent);
    }
}
