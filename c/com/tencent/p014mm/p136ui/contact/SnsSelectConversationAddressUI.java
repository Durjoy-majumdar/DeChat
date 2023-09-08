package com.tencent.p014mm.p136ui.contact;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import gl3.C75922b;
import i21.C60242i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k21.C60960c;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationAddressUI */
public class SnsSelectConversationAddressUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public ArrayList<String> f218850C = new ArrayList<>();

    /* renamed from: D */
    public List<String> f218851D;

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationAddressUI$a */
    public class C74437a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationAddressUI$a$a */
        public class C74438a implements Runnable {
            public C74438a() {
            }

            public void run() {
                if (!SnsSelectConversationAddressUI.this.getIntent().getBooleanExtra("stay_in_wechat", true)) {
                    SnsSelectConversationAddressUI.this.moveTaskToBack(true);
                }
            }
        }

        public C74437a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsSelectConversationAddressUI snsSelectConversationAddressUI = SnsSelectConversationAddressUI.this;
            if (snsSelectConversationAddressUI.mo103471g8(snsSelectConversationAddressUI.f218850C.size())) {
                return false;
            }
            Intent intent = new Intent();
            ArrayList<String> stringsToList = Util.stringsToList((String[]) SnsSelectConversationAddressUI.this.f218850C.toArray(new String[0]));
            if (stringsToList == null || stringsToList.size() == 0) {
                intent.putExtra("Select_Conv_User", "");
            } else {
                intent.putExtra("Select_Conv_User", Util.listToString(stringsToList, ","));
            }
            SnsSelectConversationAddressUI.this.setResult(-1, intent);
            SnsSelectConversationAddressUI.this.finish();
            MMHandlerThread.postToMainThreadDelayed(new C74438a(), 100);
            SnsSelectConversationAddressUI.this.hideVKB();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationAddressUI$b */
    public class C74439b implements MenuItem.OnMenuItemClickListener {
        public C74439b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsSelectConversationAddressUI.this.finish();
            if (!SnsSelectConversationAddressUI.this.getIntent().getBooleanExtra("stay_in_wechat", true)) {
                SnsSelectConversationAddressUI.this.moveTaskToBack(true);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationAddressUI$c */
    public class C74440c implements MultiSelectContactView.C72731d {
        public C74440c() {
        }

        /* renamed from: e6 */
        public void mo64521e6(int i, String str) {
            if (i == 1 && str != null) {
                SnsSelectConversationAddressUI.this.f218850C.remove(str);
                C57354l.f164333a.mo80974k(str);
                SnsSelectConversationAddressUI snsSelectConversationAddressUI = SnsSelectConversationAddressUI.this;
                MultiSelectContactView multiSelectContactView = snsSelectConversationAddressUI.f218609h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.mo100245e(snsSelectConversationAddressUI.f218850C);
                }
                SnsSelectConversationAddressUI.this.mo103472i8();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationAddressUI$d */
    public class C74441d implements DialogInterface.OnClickListener {
        public C74441d(SnsSelectConversationAddressUI snsSelectConversationAddressUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        C74572v vVar = new C74572v();
        vVar.f219205b = true;
        vVar.f219215l = true;
        vVar.f219217n = getString(C0966R.string.m_5);
        vVar.f219216m = Util.nullAs(getIntent().getStringExtra("Add_get_from_sns"), "");
        vVar.f219214k = "@all.contact.without.chatroom.openim.openimfavour.snsblack.black.socialblack";
        return new C74568u(this, this.f218851D, true, true, vVar);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1(this, this.f218851D, true, this.f218604A);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131072};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return Util.nullAs(getIntent().getStringExtra("Add_address_titile"), "");
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        C74502i1 N7 = mo103379N7();
        C75922b j2 = N7.getItem(i - this.f218605d.getHeaderViewsCount());
        if (j2 != null && (str = j2.f222621r) != null) {
            Log.m105925i("MicroMsg.SnsSelectConversationAddressUI.SnsSelectConversationAddressUI", "ClickUser=%s", str);
            String str2 = j2.f222621r;
            mo103378K7();
            if (this.f218850C.contains(str2)) {
                this.f218850C.remove(str2);
                C57354l.f164333a.mo80974k(str2);
                this.f218609h.mo100244d(str2);
            } else if (!mo103471g8(this.f218850C.size() + 1)) {
                this.f218850C.add(str2);
                C57354l.f164333a.mo80964a(str2, 3);
                this.f218609h.mo100244d(str2);
            } else {
                return;
            }
            mo103472i8();
            N7.notifyDataSetChanged();
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f218851D = new ArrayList();
        ArrayList<String> stringsToList = Util.stringsToList(Util.nullAs(getIntent().getStringExtra("Block_list"), "").split(","));
        HashSet<String> b = C74560s1.m89273b();
        b.addAll(stringsToList);
        this.f218851D.addAll(b);
        this.f218851D.addAll(C45628s0.m50776h());
        String nullAs = Util.nullAs(getIntent().getStringExtra("Select_Conv_User"), "");
        if (!Util.isNullOrNil(nullAs)) {
            this.f218850C.addAll(Util.stringsToList(nullAs.split(",")));
        }
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return true;
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            this.f218850C.remove(str);
            C57354l.f164333a.mo80974k(str);
            MultiSelectContactView multiSelectContactView = this.f218609h;
            if (multiSelectContactView != null) {
                multiSelectContactView.mo100245e(this.f218850C);
            }
            mo103379N7().notifyDataSetChanged();
            mo103472i8();
        }
    }

    /* renamed from: g8 */
    public final boolean mo103471g8(int i) {
        if (i <= 10) {
            return false;
        }
        Log.m105920e("MicroMsg.SnsSelectConversationAddressUI.SnsSelectConversationAddressUI", "tooManySelection");
        C76879j.m92749t(getContext(), getString(C0966R.string.m_b, new Object[]{Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10))}), "", new C74441d(this));
        return true;
    }

    /* renamed from: i8 */
    public final void mo103472i8() {
        enableOptionMenu(1, this.f218850C.size() >= 0);
    }

    public void initView() {
        TextView textView;
        super.initView();
        this.f218605d.setBackgroundResource(C0966R.color.f3284m6);
        String stringExtra = getIntent().getStringExtra("address_ui_sub_title");
        if (!Util.isNullOrNil(stringExtra) && (textView = (TextView) findViewById(C0966R.C0970id.k_d)) != null) {
            textView.setText(stringExtra);
            textView.setVisibility(0);
        }
        String stringExtra2 = getIntent().getStringExtra("footer_tip");
        if (!Util.isNullOrNil(stringExtra2)) {
            View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.cp7, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.edo)).setText(stringExtra2);
            this.f218605d.addFooterView(inflate);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 3) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105924i("MicroMsg.SnsSelectConversationAddressUI.SnsSelectConversationAddressUI", "GET_LABEL_USERS return usernames is null or empty");
                return;
            }
            Log.m105925i("MicroMsg.SnsSelectConversationAddressUI.SnsSelectConversationAddressUI", "GET_LABEL_USERS select username=%s", stringExtra);
            for (String str : stringExtra.split(",")) {
                if (this.f218850C.add(str)) {
                    C57354l.f164333a.mo80964a(str, 3);
                    this.f218609h.mo100244d(str);
                }
            }
            mo103472i8();
            mo103379N7().notifyDataSetChanged();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SnsSelectConversationAddressUI.SnsSelectConversationAddressUI", "Create!");
        addTextOptionMenu(1, getString(C0966R.string.f361029gs3), new C74437a(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        setBackBtn(new C74439b());
        this.f218609h.mo100245e(this.f218850C);
        this.f218609h.setOnContactDeselectListener(new C74440c());
        mo103472i8();
    }

    public void onDestroy() {
        super.onDestroy();
        C60960c.f173618a.mo85927k("SnsPublishProcess", "atPageStaytime_", Long.valueOf(getActivityBrowseTimeMs()), C60242i.APPEND);
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f218850C.contains(str);
    }
}
