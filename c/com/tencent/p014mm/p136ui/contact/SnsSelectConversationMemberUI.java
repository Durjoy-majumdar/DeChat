package com.tencent.p014mm.p136ui.contact;

import a11.C39479c;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import gl3.C75922b;
import i40.C46166d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import p749xh.C53339k1;

/* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationMemberUI */
public class SnsSelectConversationMemberUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public List<String> f218856C;

    /* renamed from: D */
    public String f218857D;

    /* renamed from: E */
    public String f218858E;

    /* renamed from: F */
    public ArrayList<String> f218859F = new ArrayList<>();

    /* renamed from: G */
    public List<String> f218860G = new ArrayList();

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationMemberUI$a */
    public class C74442a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationMemberUI$a$a */
        public class C74443a implements Runnable {
            public C74443a() {
            }

            public void run() {
                if (!SnsSelectConversationMemberUI.this.getIntent().getBooleanExtra("stay_in_wechat", true)) {
                    SnsSelectConversationMemberUI.this.moveTaskToBack(true);
                }
            }
        }

        public C74442a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsSelectConversationMemberUI snsSelectConversationMemberUI = SnsSelectConversationMemberUI.this;
            if (snsSelectConversationMemberUI.mo103477g8(snsSelectConversationMemberUI.f218859F.size())) {
                return false;
            }
            Intent intent = new Intent();
            if (Util.isNullOrNil((List) SnsSelectConversationMemberUI.this.f218859F)) {
                intent.putExtra("Select_Conv_User", "");
            } else {
                intent.putExtra("Select_Conv_User", Util.listToString(SnsSelectConversationMemberUI.this.f218859F, ","));
            }
            SnsSelectConversationMemberUI snsSelectConversationMemberUI2 = SnsSelectConversationMemberUI.this;
            snsSelectConversationMemberUI2.getClass();
            snsSelectConversationMemberUI2.setResult(-1, intent);
            SnsSelectConversationMemberUI.this.finish();
            MMHandlerThread.postToMainThreadDelayed(new C74443a(), 100);
            SnsSelectConversationMemberUI.this.hideVKB();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationMemberUI$b */
    public class C74444b implements MenuItem.OnMenuItemClickListener {
        public C74444b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsSelectConversationMemberUI.this.finish();
            if (!SnsSelectConversationMemberUI.this.getIntent().getBooleanExtra("stay_in_wechat", true)) {
                SnsSelectConversationMemberUI.this.moveTaskToBack(true);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationMemberUI$c */
    public class C74445c implements DialogInterface.OnClickListener {
        public C74445c(SnsSelectConversationMemberUI snsSelectConversationMemberUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return new C44883r0(this, true, this.f218860G, this.f218856C);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return null;
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131072};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return getResources().getString(C0966R.string.m__, new Object[]{Integer.valueOf(this.f218860G.size())});
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        C74502i1 N7 = mo103379N7();
        C75922b j2 = N7.getItem(i - this.f218605d.getHeaderViewsCount());
        if (j2 != null && (str = j2.f222621r) != null) {
            Log.m105925i("MicroMsg.SnsSelectConversationMemberUI", "ClickUser=%s", str);
            String str2 = j2.f222621r;
            mo103378K7();
            if (this.f218859F.contains(str2)) {
                this.f218859F.remove(str2);
                C57354l.f164333a.mo80974k(str2);
                MultiSelectContactView multiSelectContactView = this.f218609h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.mo100244d(str2);
                }
            } else if (!mo103477g8(this.f218859F.size() + 1)) {
                this.f218859F.add(str2);
                C57354l.f164333a.mo80964a(str2, 2);
                MultiSelectContactView multiSelectContactView2 = this.f218609h;
                if (multiSelectContactView2 != null) {
                    multiSelectContactView2.mo100244d(str2);
                }
            } else {
                return;
            }
            mo103478i8();
            N7.notifyDataSetChanged();
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f218857D = Util.nullAs(getIntent().getStringExtra("select_chatroom_name"), "");
        this.f218859F = new ArrayList<>();
        String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        this.f218858E = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f218859F.addAll(Util.stringsToList(this.f218858E.split(",")));
        }
        ArrayList<String> stringsToList = Util.stringsToList(Util.nullAs(getIntent().getStringExtra("Block_list"), "").split(","));
        HashSet<String> b = C74560s1.m89273b();
        b.addAll(stringsToList);
        ArrayList arrayList = new ArrayList();
        this.f218856C = arrayList;
        arrayList.addAll(b);
        this.f218856C.addAll(C45628s0.m50776h());
        this.f218860G = new LinkedList();
        List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(this.f218857D);
        SingleTable singleTable = C53339k1.f149474h1;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        linkedList.add(C53339k1.f149475i1);
        List<C72996z1> multiQuery = C53339k1.f149474h1.select((List<? extends ISqlColumn>) linkedList).where(C53339k1.f149475i1.inString(bD).and(C53339k1.f149476j1.bitAndEqual(1, 1))).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().multiQuery(new C46166d().getDB(), C72996z1.class);
        String s = C75592q0.m90789s();
        for (C72996z1 next : multiQuery) {
            if (!s.equals(next.getUsername()) && !TextUtils.isEmpty(next.getUsername()) && !next.getUsername().contains("openim")) {
                this.f218860G.add(next.getUsername());
            }
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

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            this.f218859F.remove(str);
            C57354l.f164333a.mo80974k(str);
            MultiSelectContactView multiSelectContactView = this.f218609h;
            if (multiSelectContactView != null) {
                multiSelectContactView.mo100245e(this.f218859F);
            }
            mo103379N7().notifyDataSetChanged();
            mo103478i8();
        }
    }

    /* renamed from: g8 */
    public final boolean mo103477g8(int i) {
        if (i <= 10) {
            return false;
        }
        Log.m105920e("MicroMsg.SnsSelectConversationMemberUI", "tooManySelection");
        C76879j.m92749t(getContext(), getString(C0966R.string.m_b, new Object[]{Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10))}), "", new C74445c(this));
        return true;
    }

    /* renamed from: i8 */
    public final void mo103478i8() {
        updateOptionMenuText(1, getResources().getString(C0966R.string.f361029gs3));
        enableOptionMenu(1, this.f218859F.size() >= 0);
    }

    public void initView() {
        super.initView();
        this.f218605d.setBackgroundResource(C0966R.color.f3284m6);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SnsSelectConversationMemberUI", "Create!");
        addTextOptionMenu(1, getResources().getString(C0966R.string.f361029gs3), new C74442a(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        setBackBtn(new C74444b());
        MultiSelectContactView multiSelectContactView = this.f218609h;
        if (multiSelectContactView != null) {
            multiSelectContactView.mo100245e(this.f218859F);
        }
        mo103478i8();
        mo103379N7().notifyDataSetChanged();
        mo103478i8();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f218859F.contains(str);
    }
}
