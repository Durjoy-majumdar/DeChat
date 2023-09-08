package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
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
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96986x1;
import eb0.C45628s0;
import gl3.C75922b;
import i21.C60242i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k21.C60960c;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.contact.SnsAddressUI */
public class SnsAddressUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public ArrayList<String> f218844C = new ArrayList<>();

    /* renamed from: D */
    public List<String> f218845D;

    /* renamed from: com.tencent.mm.ui.contact.SnsAddressUI$a */
    public class C74433a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.ui.contact.SnsAddressUI$a$a */
        public class C74434a implements Runnable {
            public C74434a() {
            }

            public void run() {
                if (!SnsAddressUI.this.getIntent().getBooleanExtra("stay_in_wechat", true)) {
                    SnsAddressUI.this.moveTaskToBack(true);
                }
            }
        }

        public C74433a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            ArrayList<String> stringsToList = Util.stringsToList((String[]) SnsAddressUI.this.f218844C.toArray(new String[0]));
            if (stringsToList == null || stringsToList.size() == 0) {
                intent.putExtra("Select_Contact", "");
            } else {
                intent.putExtra("Select_Contact", Util.listToString(stringsToList, ","));
            }
            SnsAddressUI.this.setResult(-1, intent);
            SnsAddressUI.this.finish();
            MMHandlerThread.postToMainThreadDelayed(new C74434a(), 100);
            SnsAddressUI.this.hideVKB();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsAddressUI$b */
    public class C74435b implements MenuItem.OnMenuItemClickListener {
        public C74435b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsAddressUI.this.finish();
            if (!SnsAddressUI.this.getIntent().getBooleanExtra("stay_in_wechat", true)) {
                SnsAddressUI.this.moveTaskToBack(true);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsAddressUI$c */
    public class C74436c implements MultiSelectContactView.C72731d {
        public C74436c() {
        }

        /* renamed from: e6 */
        public void mo64521e6(int i, String str) {
            if (i == 1 && str != null) {
                SnsAddressUI.this.f218844C.remove(str);
                SnsAddressUI.this.mo103467g8();
            }
        }
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        C74572v vVar = new C74572v();
        vVar.f219205b = true;
        vVar.f219215l = true;
        vVar.f219217n = getString(C0966R.string.f7480hd);
        vVar.f219216m = Util.nullAs(getIntent().getStringExtra("Add_get_from_sns"), "");
        vVar.f219214k = "@all.contact.without.chatroom.openim.openimfavour.snsblack.black.socialblack";
        return new C74568u(this, this.f218845D, true, true, vVar);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1(this, this.f218845D, true, this.f218604A);
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
            Log.m105925i("MicroMsg.SnsAddressUI", "ClickUser=%s", str);
            String str2 = j2.f222621r;
            mo103378K7();
            if (this.f218844C.contains(str2)) {
                this.f218844C.remove(str2);
                this.f218609h.mo100244d(str2);
            } else if (this.f218844C.size() < C96986x1.f284186a) {
                this.f218844C.add(str2);
                this.f218609h.mo100244d(str2);
            } else {
                C76701a.makeText((Context) this, (int) C0966R.string.f361381jf1, 0).show();
                Log.m105925i("MicroMsg.SnsAddressUI", "select user size equal max size:%d", Integer.valueOf(C96986x1.f284186a));
            }
            mo103467g8();
            N7.notifyDataSetChanged();
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f218845D = new ArrayList();
        ArrayList<String> stringsToList = Util.stringsToList(Util.nullAs(getIntent().getStringExtra("Block_list"), "").split(","));
        HashSet<String> b = C74560s1.m89273b();
        b.addAll(stringsToList);
        this.f218845D.addAll(b);
        this.f218845D.addAll(C45628s0.m50776h());
        String nullAs = Util.nullAs(getIntent().getStringExtra("Select_Contact"), "");
        if (!Util.isNullOrNil(nullAs)) {
            this.f218844C.addAll(Util.stringsToList(nullAs.split(",")));
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

    /* renamed from: X7 */
    public boolean mo103383X7() {
        return true;
    }

    /* renamed from: a8 */
    public void mo96068a8(String str) {
        Intent intent = new Intent();
        intent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
        intent.putExtra("label", str);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f218844C);
        intent.putExtra("always_select_contact", Util.listToString(new ArrayList(hashSet), ","));
        intent.putExtra("list_attr", C74560s1.m89278g(16384, 64));
        startActivityForResult(intent, 3);
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            this.f218844C.remove(str);
            mo103379N7().notifyDataSetChanged();
            mo103467g8();
        }
    }

    /* renamed from: g8 */
    public final void mo103467g8() {
        String str;
        boolean z = false;
        if (this.f218844C.size() == 0) {
            str = String.format("%s", new Object[]{getString(C0966R.string.a18)});
        } else {
            str = String.format("%s(%d/%d)", new Object[]{getString(C0966R.string.a18), Integer.valueOf(this.f218844C.size()), Integer.valueOf(C96986x1.f284186a)});
        }
        updateOptionMenuText(1, str);
        if (this.f218844C.size() >= 0) {
            z = true;
        }
        enableOptionMenu(1, z);
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
            View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.b7w, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.edo)).setText(stringExtra2);
            this.f218605d.addFooterView(inflate);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 3) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105924i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS return usernames is null or empty");
                return;
            }
            Log.m105925i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS select username=%s", stringExtra);
            for (String str : stringExtra.split(",")) {
                if (this.f218844C.add(str)) {
                    this.f218609h.mo100244d(str);
                }
            }
            mo103467g8();
            mo103379N7().notifyDataSetChanged();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SnsAddressUI", "Create!");
        addTextOptionMenu(1, getString(C0966R.string.a18), new C74433a(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        setBackBtn(new C74435b());
        this.f218609h.mo100245e(this.f218844C);
        this.f218609h.setOnContactDeselectListener(new C74436c());
        mo103467g8();
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
        return this.f218844C.contains(str);
    }
}
