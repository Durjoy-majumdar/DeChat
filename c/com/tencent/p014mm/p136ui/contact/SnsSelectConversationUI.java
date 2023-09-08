package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86737h0;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import nj3.C88990b;
import p740wo.C53193b;
import wc3.C78538u;

@C86737h0
@C88989a(19)
/* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationUI */
public class SnsSelectConversationUI extends MMBaseSelectContactUI {

    /* renamed from: N */
    public static final int f218864N = C74560s1.m89278g(1, 2);

    /* renamed from: C */
    public RelativeLayout f218865C;

    /* renamed from: D */
    public RelativeLayout f218866D;

    /* renamed from: E */
    public LinearLayout f218867E;

    /* renamed from: F */
    public ImageView f218868F;

    /* renamed from: G */
    public TextView f218869G;

    /* renamed from: H */
    public boolean f218870H = true;

    /* renamed from: I */
    public List<String> f218871I = new LinkedList();

    /* renamed from: J */
    public int f218872J;

    /* renamed from: K */
    public C74466b4 f218873K;

    /* renamed from: L */
    public List<String> f218874L;

    /* renamed from: M */
    public MenuItem.OnMenuItemClickListener f218875M = new SnsSelectConversationUI$$c(this);

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        C74466b4 b4Var = new C74466b4(this, this.f218874L, true, this.f218870H, false, this.f218872J);
        this.f218873K = b4Var;
        return b4Var;
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1((MMBaseSelectContactUI) this, this.f218874L, true, this.f218604A, false, true);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        int[] intArrayExtra = getIntent().getIntArrayExtra("search_range");
        return intArrayExtra != null ? intArrayExtra : super.mo64515P7();
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        String stringExtra = getIntent().getStringExtra("Select_Conv_ui_title");
        return (stringExtra == null || stringExtra.length() <= 0) ? getString(C0966R.string.jje) : stringExtra;
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        int headerViewsCount = i - this.f218605d.getHeaderViewsCount();
        boolean z = false;
        if (headerViewsCount < 0) {
            Log.m105925i("MicroMsg.SnsSelectConversationUI", "Click HeaderView position=%d", Integer.valueOf(i));
            mo103484i8();
            return;
        }
        C75922b j2 = mo103379N7().getItem(headerViewsCount);
        if (j2 != null && (str = j2.f222621r) != null) {
            Log.m105925i("MicroMsg.SnsSelectConversationUI", "ClickUser=%s", str);
            if (C72996z1.m85820U5(str)) {
                Intent intent = new Intent();
                intent.setClass(this, SnsSelectConversationMemberUI.class);
                intent.putExtra("no_result_tip", getContext().getString(C0966R.string.m_a));
                intent.putExtra("Select_Conv_User", Util.listToString(this.f218871I, ","));
                intent.putExtra("select_chatroom_name", str);
                startActivityForResult(intent, 6);
            } else {
                if ("conversationboxservice".equals(str)) {
                    Intent intent2 = new Intent();
                    intent2.setClass(this, SnsSelectFromConvBoxUI.class);
                    intent2.putExtras(getIntent().getExtras());
                    intent2.putExtra("KIsMultiSelect", true);
                    intent2.putExtra("Select_Conv_User", Util.listToString(this.f218871I, ","));
                    startActivityForResult(intent2, 7);
                    C88990b.m111192a(getContext(), intent2);
                    z = true;
                }
                if (!z) {
                    if (((LinkedList) this.f218871I).contains(str) || !mo103485j8(((LinkedList) this.f218871I).size() + 1)) {
                        mo103378K7();
                        if (TextUtils.isEmpty(str) || !str.contains("openim")) {
                            MultiSelectContactView multiSelectContactView = this.f218609h;
                            if (multiSelectContactView != null) {
                                multiSelectContactView.mo100244d(str);
                            }
                            if (((LinkedList) this.f218871I).contains(str)) {
                                ((LinkedList) this.f218871I).remove(str);
                                C57354l.f164333a.mo80974k(str);
                            } else {
                                ((LinkedList) this.f218871I).add(str);
                                C57354l.f164333a.mo80964a(str, 1);
                            }
                        } else {
                            C76879j.m92749t(getContext(), getString(C0966R.string.f361399d12), "", new SnsSelectConversationUI$$a());
                        }
                    } else {
                        mo103378K7();
                        return;
                    }
                } else {
                    return;
                }
            }
            mo103487l8(this.f218871I);
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f218872J = getIntent().getIntExtra("Select_Conv_Type", f218864N);
        HashSet hashSet = new HashSet();
        hashSet.addAll(C74560s1.m89273b());
        hashSet.addAll(C74560s1.m89274c());
        String stringExtra = getIntent().getStringExtra("Select_block_List");
        if (!Util.isNullOrNil(stringExtra)) {
            hashSet.addAll(Util.stringsToList(stringExtra.split(",")));
        }
        if (C74560s1.m89275d(this.f218872J, 2)) {
            HashSet<String> h = C45628s0.m50776h();
            h.remove("filehelper");
            hashSet.addAll(h);
        }
        if (!C74560s1.m89275d(this.f218872J, 4)) {
            hashSet.remove("conversationboxservice");
        }
        ArrayList arrayList = new ArrayList();
        this.f218874L = arrayList;
        arrayList.addAll(hashSet);
        List<String> list = this.f218874L;
        long currentTimeMillis = System.currentTimeMillis();
        int size = list.size();
        list.addAll(ContactBlackListHelper.m6942a());
        Log.m105925i("MicroMsg.SnsSelectConversationUI", "[fillBlockList] cost:%sms size:%s block size:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(size), Integer.valueOf(list.size() - size));
        mo103483g8();
        this.f218871I = new LinkedList();
        String nullAs = Util.nullAs(getIntent().getStringExtra("Select_Contact"), "");
        if (!Util.isNullOrNil(nullAs)) {
            this.f218871I.addAll(Util.stringsToList(nullAs.split(",")));
        }
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return !(this instanceof SnsSelectFromConvBoxUI);
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

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            ((LinkedList) this.f218871I).remove(str);
            C57354l.f164333a.mo80974k(str);
            mo103487l8(this.f218871I);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(-1, C0966R.C0968anim.f2493eh);
    }

    /* renamed from: g8 */
    public void mo103483g8() {
        addTextOptionMenu(1, getString(C0966R.string.jdj), this.f218875M, (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        mo103486k8();
    }

    /* renamed from: i8 */
    public final void mo103484i8() {
        Log.m105924i("MicroMsg.SnsSelectConversationUI", "selectContactFromAddressUI");
        Intent intent = new Intent();
        intent.setClass(this, SnsSelectConversationAddressUI.class);
        intent.putExtra("Contact_Compose", true);
        intent.putExtra("List_Type", 1);
        intent.putExtra("Add_address_titile", getContext().getString(C0966R.string.jje));
        intent.putExtra("footer_tip", getContext().getString(C0966R.string.jka));
        intent.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
        intent.putExtra("Block_list", C75592q0.m90789s());
        intent.putExtra("Select_Conv_User", Util.listToString(this.f218871I, ","));
        intent.putExtra("sns_address_count", this.f218871I.size());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(6);
        aVar.mo10233c(intent);
        C117292a.m165364j(this, aVar.mo10232b(), "com/tencent/mm/ui/contact/SnsSelectConversationUI", "selectContactFromAddressUI", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void initView() {
        super.initView();
        this.f218865C = (RelativeLayout) findViewById(C0966R.C0970id.ifd);
        this.f218866D = (RelativeLayout) findViewById(C0966R.C0970id.evk);
        this.f218867E = (LinearLayout) findViewById(C0966R.C0970id.bs4);
        this.f218868F = (ImageView) this.f218865C.findViewById(C0966R.C0970id.f2a);
        TextView textView = (TextView) this.f218865C.findViewById(C0966R.C0970id.eve);
        this.f218869G = textView;
        C85875k4.m106191k0(textView.getPaint());
        this.f218869G.setText(getString(C0966R.string.iih));
        ((TextView) this.f218865C.findViewById(C0966R.C0970id.bsk)).setText(getString(C0966R.string.iim));
        ImageView imageView = this.f218868F;
        if (imageView != null) {
            imageView.setImageResource(C0966R.raw.icons_filled_contacts);
        }
        this.f218867E.setOnClickListener(new C74471c4(this));
        List<String> list = this.f218871I;
        MultiSelectContactView multiSelectContactView = this.f218609h;
        if (multiSelectContactView != null) {
            multiSelectContactView.mo100245e(list);
        }
        mo103487l8(list);
        this.f218605d.setOnScrollListener(new SnsSelectConversationUI$$b(this));
    }

    /* renamed from: j8 */
    public final boolean mo103485j8(int i) {
        if (i <= 10) {
            return false;
        }
        C76879j.m92749t(getContext(), getString(C0966R.string.m_b, new Object[]{Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10))}), "", new SnsSelectConversationUI$$d(this));
        return true;
    }

    /* renamed from: k8 */
    public void mo103486k8() {
        MultiSelectContactView multiSelectContactView = this.f218609h;
        if (multiSelectContactView != null) {
            multiSelectContactView.setVisibility(0);
        }
        List<String> list = this.f218871I;
        if (list == null || list.size() <= 0) {
            updateOptionMenuText(1, getString(C0966R.string.jdj));
            enableOptionMenu(1, false);
            if (!(this instanceof SnsSelectFromConvBoxUI)) {
                mo103381S7();
                return;
            }
            return;
        }
        updateOptionMenuText(1, String.format("%s(%d/%d)", new Object[]{getString(C0966R.string.jdj), Integer.valueOf(this.f218871I.size()), 10}));
        updateOptionMenuStyle(1, MMActivityController.C73075r.GREEN);
        enableOptionMenu(1, true);
    }

    /* renamed from: l8 */
    public void mo103487l8(List<String> list) {
        mo103486k8();
        C74466b4 b4Var = this.f218873K;
        if (b4Var != null) {
            b4Var.mo103552v(list);
        }
        mo103379N7().notifyDataSetChanged();
    }

    /* renamed from: n1 */
    public String mo7833n1(C75922b bVar) {
        int i;
        String str = bVar.f222621r;
        if (str == null || !C72996z1.m85813P4(str)) {
            return null;
        }
        List<String> list = this.f218871I;
        if (list != null) {
            i = 0;
            for (String Hd : list) {
                if (((C53193b) C86312j.m106911c(C53193b.class)).mo73723Hd(Hd)) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return getString(C0966R.string.ij7, new Object[]{Integer.valueOf(i)});
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra)) {
                ((LinkedList) this.f218871I).clear();
                ((LinkedList) this.f218871I).addAll(Util.stringsToList(stringExtra.split(",")));
                List<String> list = this.f218871I;
                MultiSelectContactView multiSelectContactView = this.f218609h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.mo100245e(list);
                }
                mo103487l8(list);
            }
            Log.m105924i("MicroMsg.SnsSelectConversationUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = " + intent.toString());
            return;
        }
        Log.m105924i("MicroMsg.SnsSelectConversationUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = null");
    }

    public void onBackPressed() {
        super.mo66629Z7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C78538u.m94868d(this);
    }

    public void onDestroy() {
        super.onDestroy();
        removeAllOptionMenu();
    }

    public void onStop() {
        super.onStop();
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f218871I.contains(str);
    }
}
