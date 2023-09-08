package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p159gw.C8462g;
import p609mp.C76802a;
import p609mp.C76803c;
import pj3.C47511g;
import qo3.C89779i0;
import s03.C13609i;
import te3.C52179yx;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI */
public class TopStorySettingVisibilityDetailUI extends MMPreference implements C11385n {

    /* renamed from: t */
    public static final /* synthetic */ int f21594t = 0;

    /* renamed from: d */
    public ContactListExpandPreference f21595d;

    /* renamed from: e */
    public Preference f21596e;

    /* renamed from: f */
    public Preference f21597f;

    /* renamed from: g */
    public C47511g f21598g;

    /* renamed from: h */
    public List<String> f21599h = new ArrayList();

    /* renamed from: i */
    public List<String> f21600i = new ArrayList();

    /* renamed from: j */
    public List<String> f21601j = new ArrayList();

    /* renamed from: n */
    public long f21602n;

    /* renamed from: o */
    public String f21603o = "";

    /* renamed from: p */
    public String f21604p = "";

    /* renamed from: q */
    public C89779i0 f21605q = null;

    /* renamed from: r */
    public ContactListExpandPreference.C72740a f21606r = new C5650e();

    /* renamed from: s */
    public Set<C13609i> f21607s = new HashSet();

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI$a */
    public class C5646a implements DialogInterface.OnClickListener {
        public C5646a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Iterator it = ((ArrayList) TopStorySettingVisibilityDetailUI.this.f21601j).iterator();
            while (it.hasNext()) {
                ((ArrayList) TopStorySettingVisibilityDetailUI.this.f21599h).remove((String) it.next());
            }
            TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = TopStorySettingVisibilityDetailUI.this;
            ContactListExpandPreference contactListExpandPreference = topStorySettingVisibilityDetailUI.f21595d;
            if (contactListExpandPreference != null) {
                contactListExpandPreference.mo100303M(topStorySettingVisibilityDetailUI.f21599h);
                TopStorySettingVisibilityDetailUI.this.f21595d.mo69931v();
            }
            ((ArrayList) TopStorySettingVisibilityDetailUI.this.f21601j).clear();
            TopStorySettingVisibilityDetailUI.this.mo6669J7();
            TopStorySettingVisibilityDetailUI.this.mo6670K7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI$b */
    public class C5647b implements MenuItem.OnMenuItemClickListener {
        public C5647b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = TopStorySettingVisibilityDetailUI.this;
            int i = TopStorySettingVisibilityDetailUI.f21594t;
            topStorySettingVisibilityDetailUI.mo6667H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI$c */
    public class C5648c implements MenuItem.OnMenuItemClickListener {
        public C5648c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
            if (r0 != 6) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
            if (r0 != 6) goto L_0x0038;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r12) {
            /*
                r11 = this;
                com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI r12 = com.tencent.p014mm.plugin.topstory.p113ui.home.TopStorySettingVisibilityDetailUI.this
                r12.getClass()
                f40.j r0 = f40.C86709a0.m107531m()
                j40.a r0 = r0.mo58407a()
                j40.b r0 = (j40.C87829b) r0
                boolean r0 = r0.mo71804b()
                r1 = 4
                r2 = 6
                r6 = 0
                r7 = 1
                if (r0 == 0) goto L_0x0026
                ob0.b0 r0 = f40.C86709a0.m107524d()
                int r0 = r0.mo123467m()
                if (r0 == r1) goto L_0x003a
                if (r0 != r2) goto L_0x0038
                goto L_0x003a
            L_0x0026:
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r0)
                if (r0 == 0) goto L_0x0032
                r0 = 6
                goto L_0x0033
            L_0x0032:
                r0 = 0
            L_0x0033:
                if (r0 == r1) goto L_0x003a
                if (r0 != r2) goto L_0x0038
                goto L_0x003a
            L_0x0038:
                r0 = 0
                goto L_0x003b
            L_0x003a:
                r0 = 1
            L_0x003b:
                if (r0 != 0) goto L_0x0049
                r0 = 2131838097(0x7f114491, float:1.9309408E38)
                android.widget.Toast r12 = nj3.C76912y0.makeText((android.content.Context) r12, (int) r0, (int) r6)
                r12.show()
                goto L_0x01d1
            L_0x0049:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = r12.f21603o
                r0.append(r2)
                java.lang.String r2 = " "
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r12.f21599h
                java.lang.String r3 = ","
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r2, r3)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = r12.f21604p
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007c
                long r2 = r12.f21602n
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 == 0) goto L_0x007c
                r12.finish()
                goto L_0x01d1
            L_0x007c:
                long r2 = r12.f21602n
                r4 = 1
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x00a0
                r03.a r0 = r03.C47918a.m53244b()
                java.util.List<java.lang.String> r0 = r0.f128580e
                r0.clear()
                r03.a r0 = r03.C47918a.m53244b()
                java.util.List<java.lang.String> r0 = r0.f128580e
                java.util.List<java.lang.String> r2 = r12.f21599h
                r0.addAll(r2)
                r03.a r0 = r03.C47918a.m53244b()
                r0.mo72677d()
                goto L_0x00bb
            L_0x00a0:
                r03.a r0 = r03.C47918a.m53244b()
                java.util.List<java.lang.String> r0 = r0.f128579d
                r0.clear()
                r03.a r0 = r03.C47918a.m53244b()
                java.util.List<java.lang.String> r0 = r0.f128579d
                java.util.List<java.lang.String> r2 = r12.f21599h
                r0.addAll(r2)
                r03.a r0 = r03.C47918a.m53244b()
                r0.mo72676c()
            L_0x00bb:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.List<java.lang.String> r0 = r12.f21599h
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x00cd:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x00fc
                java.lang.Object r2 = r0.next()
                java.lang.String r2 = (java.lang.String) r2
                java.util.List<java.lang.String> r3 = r12.f21600i
                boolean r3 = r3.contains(r2)
                if (r3 == 0) goto L_0x00e2
                goto L_0x00cd
            L_0x00e2:
                r8.add(r2)
                long r2 = r12.f21602n
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r10 != 0) goto L_0x00f4
                r2 = 3
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r9.add(r2)
                goto L_0x00cd
            L_0x00f4:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                r9.add(r2)
                goto L_0x00cd
            L_0x00fc:
                java.util.List<java.lang.String> r0 = r12.f21600i
                java.util.Iterator r0 = r0.iterator()
            L_0x0102:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0133
                java.lang.Object r2 = r0.next()
                java.lang.String r2 = (java.lang.String) r2
                java.util.List<java.lang.String> r3 = r12.f21599h
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                boolean r3 = r3.contains(r2)
                if (r3 == 0) goto L_0x0119
                goto L_0x0102
            L_0x0119:
                r8.add(r2)
                long r2 = r12.f21602n
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r10 != 0) goto L_0x012a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                r9.add(r2)
                goto L_0x0102
            L_0x012a:
                r2 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r9.add(r2)
                goto L_0x0102
            L_0x0133:
                r0 = 2131821704(0x7f110488, float:1.9276159E38)
                java.lang.String r1 = r12.getString(r0)
                r0 = 2131838101(0x7f114495, float:1.9309416E38)
                java.lang.String r2 = r12.getString(r0)
                r3 = 1
                r4 = 1
                com.tencent.mm.plugin.topstory.ui.home.r r5 = new com.tencent.mm.plugin.topstory.ui.home.r
                r5.<init>(r12)
                r0 = r12
                qo3.i0 r0 = nj3.C76879j.m92723Q(r0, r1, r2, r3, r4, r5)
                r12.f21605q = r0
                java.util.Set<s03.i> r0 = r12.f21607s
                java.util.HashSet r0 = (java.util.HashSet) r0
                r0.clear()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2 = 0
            L_0x0161:
                int r3 = r8.size()
                if (r2 >= r3) goto L_0x019c
                r0.clear()
                r1.clear()
                r3 = 0
            L_0x016e:
                int r4 = r8.size()
                if (r2 >= r4) goto L_0x018f
                r4 = 50
                if (r3 >= r4) goto L_0x018f
                java.lang.Object r4 = r8.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                r0.add(r4)
                java.lang.Object r4 = r9.get(r2)
                java.lang.Integer r4 = (java.lang.Integer) r4
                r1.add(r4)
                int r2 = r2 + 1
                int r3 = r3 + 1
                goto L_0x016e
            L_0x018f:
                s03.i r3 = new s03.i
                r3.<init>(r0, r1)
                java.util.Set<s03.i> r4 = r12.f21607s
                java.util.HashSet r4 = (java.util.HashSet) r4
                r4.add(r3)
                goto L_0x0161
            L_0x019c:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.util.Set<s03.i> r1 = r12.f21607s
                java.util.HashSet r1 = (java.util.HashSet) r1
                int r1 = r1.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r6] = r1
                java.lang.String r1 = "MicroMsg.TopStory.TopStorySettingVisibilityDetailUI"
                java.lang.String r2 = "batch doNetscene, size: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
                java.util.Set<s03.i> r12 = r12.f21607s
                java.util.HashSet r12 = (java.util.HashSet) r12
                java.util.Iterator r12 = r12.iterator()
            L_0x01bb:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x01d1
                java.lang.Object r0 = r12.next()
                s03.i r0 = (s03.C13609i) r0
                f40.g r1 = f40.C86709a0.m107529k()
                ob0.b0 r1 = r1.f251779b
                r1.mo123460f(r0)
                goto L_0x01bb
            L_0x01d1:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.topstory.p113ui.home.TopStorySettingVisibilityDetailUI.C5648c.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI$d */
    public class C5649d implements DialogInterface.OnClickListener {
        public C5649d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TopStorySettingVisibilityDetailUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI$e */
    public class C5650e implements ContactListExpandPreference.C72740a {
        public C5650e() {
        }

        /* renamed from: a */
        public void mo5953a(ViewGroup viewGroup, View view, int i) {
            ContactListExpandPreference contactListExpandPreference;
            String c = C76802a.m92581c(TopStorySettingVisibilityDetailUI.this.f21595d, i);
            Log.m105924i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "roomPref del " + i + " userName : " + c);
            C86709a0.m107528h();
            if (Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), "").equals(c)) {
                C76879j.m92748s(TopStorySettingVisibilityDetailUI.this.getContext(), TopStorySettingVisibilityDetailUI.this.getString(C0966R.string.i6o), "");
                return;
            }
            TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = TopStorySettingVisibilityDetailUI.this;
            topStorySettingVisibilityDetailUI.getClass();
            Log.m105924i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "dealDelChatRoomMember");
            if (c != null && !c.equals("")) {
                ((ArrayList) topStorySettingVisibilityDetailUI.f21599h).remove(c);
                ContactListExpandPreference contactListExpandPreference2 = topStorySettingVisibilityDetailUI.f21595d;
                if (contactListExpandPreference2 != null) {
                    contactListExpandPreference2.mo100303M(topStorySettingVisibilityDetailUI.f21599h);
                    topStorySettingVisibilityDetailUI.f21595d.mo69931v();
                }
                if (((ArrayList) topStorySettingVisibilityDetailUI.f21599h).size() != 0 || (contactListExpandPreference = topStorySettingVisibilityDetailUI.f21595d) == null) {
                    ContactListExpandPreference contactListExpandPreference3 = topStorySettingVisibilityDetailUI.f21595d;
                    if (contactListExpandPreference3 != null) {
                        contactListExpandPreference3.mo100304N(true);
                        contactListExpandPreference3.mo100305P(true);
                    }
                } else {
                    contactListExpandPreference.mo100300J();
                    ContactListExpandPreference contactListExpandPreference4 = topStorySettingVisibilityDetailUI.f21595d;
                    contactListExpandPreference4.mo100304N(true);
                    contactListExpandPreference4.mo100305P(false);
                    topStorySettingVisibilityDetailUI.f21598g.notifyDataSetChanged();
                }
                ((ArrayList) topStorySettingVisibilityDetailUI.f21601j).clear();
                topStorySettingVisibilityDetailUI.mo6669J7();
                topStorySettingVisibilityDetailUI.mo6670K7();
            }
            if ((TopStorySettingVisibilityDetailUI.this.f21603o + " " + Util.listToString(TopStorySettingVisibilityDetailUI.this.f21599h, ",")).equals(TopStorySettingVisibilityDetailUI.this.f21604p)) {
                TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI2 = TopStorySettingVisibilityDetailUI.this;
                if (topStorySettingVisibilityDetailUI2.f21602n != 0) {
                    topStorySettingVisibilityDetailUI2.enableOptionMenu(false);
                    return;
                }
            }
            TopStorySettingVisibilityDetailUI.this.enableOptionMenu(true);
        }

        /* renamed from: b */
        public void mo5954b(ViewGroup viewGroup, View view, int i) {
        }

        /* renamed from: c */
        public void mo5955c(ViewGroup viewGroup, View view, int i) {
            Log.m105918d("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "roomPref add " + i);
            TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = TopStorySettingVisibilityDetailUI.this;
            String listToString = Util.listToString(topStorySettingVisibilityDetailUI.f21599h, ",");
            Intent intent = new Intent();
            intent.putExtra("titile", topStorySettingVisibilityDetailUI.getString(C0966R.string.f7496hv));
            intent.putExtra("list_type", 1);
            intent.putExtra("KBlockOpenImFav", true);
            intent.putExtra("show_too_many_member", false);
            int i2 = 2;
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.m89278g(C74560s1.f219162c, 1024), 524288) & -16777217);
            intent.putExtra("always_select_contact", listToString);
            if (topStorySettingVisibilityDetailUI.f21602n == 1) {
                i2 = 1;
            }
            intent.putExtra("topstory_import_type", i2);
            C88144b.m109802t(topStorySettingVisibilityDetailUI, ".ui.contact.SelectContactUI", intent, 1);
        }

        /* renamed from: d */
        public void mo5956d(ViewGroup viewGroup, View view, int i) {
            ContactListExpandPreference contactListExpandPreference = TopStorySettingVisibilityDetailUI.this.f21595d;
            if (contactListExpandPreference != null) {
                contactListExpandPreference.mo100300J();
            }
        }

        /* renamed from: e */
        public void mo5957e(ViewGroup viewGroup, View view, int i) {
            String c = C76802a.m92581c(TopStorySettingVisibilityDetailUI.this.f21595d, i);
            Intent intent = new Intent();
            intent.putExtra("Contact_User", c);
            C88144b.m109791i(TopStorySettingVisibilityDetailUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: H7 */
    public final boolean mo6667H7() {
        if ((this.f21603o + " " + Util.listToString(this.f21599h, ",")).equals(this.f21604p)) {
            finish();
            return true;
        }
        int i = C0966R.string.k4o;
        if (this.f21605q != null) {
            i = C0966R.string.k4q;
        }
        C76879j.m92707A(this, getString(i), "", getString(C0966R.string.k4u), getString(C0966R.string.f7926wf), new C5649d(), (DialogInterface.OnClickListener) null);
        return false;
    }

    /* renamed from: I7 */
    public void mo6668I7(List<String> list, boolean z) {
        C72996z1 z1Var;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(list == null ? -1 : list.size());
        Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "dealOnAddContact %s", objArr);
        C86709a0.m107528h();
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        String s = C75592q0.m90789s();
        for (String next : list) {
            if (!((ArrayList) this.f21599h).contains(next) && s != null && !s.equals(next) && (z1Var = Ni.get(next)) != null) {
                if (z1Var.mo62927s3() || !z) {
                    ((ArrayList) this.f21599h).add(next);
                    ((ArrayList) this.f21601j).add(next);
                }
            }
        }
        ContactListExpandPreference contactListExpandPreference = this.f21595d;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.mo100303M(this.f21599h);
            this.f21595d.mo69931v();
        }
        if (((ArrayList) this.f21599h).size() > 0) {
            ContactListExpandPreference contactListExpandPreference2 = this.f21595d;
            contactListExpandPreference2.mo100304N(true);
            contactListExpandPreference2.mo100305P(true);
        } else {
            ContactListExpandPreference contactListExpandPreference3 = this.f21595d;
            contactListExpandPreference3.mo100304N(true);
            contactListExpandPreference3.mo100305P(false);
        }
        mo6669J7();
        mo6670K7();
    }

    /* renamed from: J7 */
    public final void mo6669J7() {
        if (((ArrayList) this.f21601j).isEmpty()) {
            this.f21598g.mo72529n("revert_pref", true);
            return;
        }
        this.f21598g.mo72529n("revert_pref", false);
        this.f21597f.mo69924H(getString(C0966R.string.k4r, new Object[]{Integer.valueOf(((ArrayList) this.f21601j).size())}));
    }

    /* renamed from: K7 */
    public void mo6670K7() {
        setMMTitle(this.f21603o + "(" + ((ArrayList) this.f21599h).size() + ")");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        mo6667H7();
        return true;
    }

    public int getResourceId() {
        return C0966R.xml.f8980d3;
    }

    public void initView() {
        C47511g preferenceScreen = getPreferenceScreen();
        this.f21598g = preferenceScreen;
        ContactListExpandPreference contactListExpandPreference = (ContactListExpandPreference) preferenceScreen.mo72519a("roominfo_contact_anchor");
        this.f21595d = contactListExpandPreference;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.mo100302L(this.f21598g, contactListExpandPreference.f121285r);
            ContactListExpandPreference contactListExpandPreference2 = this.f21595d;
            contactListExpandPreference2.mo100304N(true);
            contactListExpandPreference2.mo100305P(true);
            this.f21595d.mo100301K((String) null, this.f21599h);
            ContactListExpandPreference contactListExpandPreference3 = this.f21595d;
            C5651q qVar = new C5651q(this);
            C76803c cVar = contactListExpandPreference3.f211662K;
            if (cVar != null) {
                ((C72741a) cVar).f211671h = qVar;
            }
            contactListExpandPreference3.mo100307S(this.f21606r);
        }
        this.f21596e = this.f21598g.mo72519a("desc");
        this.f21597f = this.f21598g.mo72519a("revert_pref");
        this.f21598g.mo72529n("revert_pref", true);
        getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
        setBackBtn(new C5647b());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C5648c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onActivityResult %s", stringExtra);
            if (Util.nullAsNil(C75592q0.m90789s()).equals(stringExtra)) {
                z = true;
            } else {
                List<String> list = this.f21599h;
                if (list == null) {
                    z = false;
                } else {
                    Iterator it = ((ArrayList) list).iterator();
                    z = false;
                    while (it.hasNext()) {
                        if (((String) it.next()).equals(stringExtra)) {
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                C76879j.m92748s(this, getString(C0966R.string.f7396f3), "");
                return;
            }
            ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
            if (stringsToList != null) {
                String stringExtra2 = intent.getStringExtra("App_MsgId");
                if (Util.isNullOrNil(stringExtra2) || !stringExtra2.equals("fromSns")) {
                    mo6668I7(stringsToList, true);
                } else {
                    mo6668I7(stringsToList, false);
                }
                if (!(this.f21603o + " " + Util.listToString(this.f21599h, ",")).equals(this.f21604p) || this.f21602n == 0) {
                    enableOptionMenu(true);
                } else {
                    enableOptionMenu(false);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        List<String> og = ((C8462g) C86312j.m106911c(C8462g.class)).mo9267og();
        String stringExtra = getIntent().getStringExtra("k_topstory_user_list");
        if (!Util.isNullOrNil(stringExtra)) {
            List<String> asList = Arrays.asList(stringExtra.split(","));
            this.f21600i = asList;
            for (String next : asList) {
                if (!Util.isNullOrNil(next) && !og.contains(next)) {
                    ((ArrayList) this.f21599h).add(next);
                }
            }
        }
        initView();
        long intExtra = (long) getIntent().getIntExtra("k_topstory_type", 0);
        this.f21602n = intExtra;
        if (intExtra == 1) {
            this.f21603o = getString(C0966R.string.k4y);
            this.f21596e.mo69923G(C0966R.string.k4z);
        } else {
            this.f21603o = getString(C0966R.string.k4m);
            this.f21596e.mo69923G(C0966R.string.k4n);
        }
        C86709a0.m107524d().mo123455a(2859, this);
        enableOptionMenu(false);
        mo6670K7();
        this.f21604p = this.f21603o + " " + Util.listToString(this.f21599h, ",");
    }

    public void onDestroy() {
        ContactListExpandPreference contactListExpandPreference = this.f21595d;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.getClass();
        }
        C89779i0 i0Var = this.f21605q;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C86709a0.m107524d().mo123470p(2859, this);
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (!"revert_pref".equals(preference.f121285r)) {
            return false;
        }
        C76879j.m92707A(this, getString(C0966R.string.k4o), "", getString(C0966R.string.k4u), getString(C0966R.string.f7926wf), new C5646a(), (DialogInterface.OnClickListener) null);
        return false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        Log.m105924i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (yVar instanceof C13609i) {
            C13609i iVar = (C13609i) yVar;
            boolean z = i == 0 && i2 == 0;
            if (z && (i3 = ((C52179yx) iVar.f38564f.f127056b.f127083a).BaseResponse.f135955d) != 0) {
                Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd ret:%s", Integer.valueOf(i3));
                z = false;
            }
            Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd succ:%s", Boolean.valueOf(z));
            if (!z) {
                int i4 = iVar.f38567i + 1;
                iVar.f38567i = i4;
                if (i4 < 2) {
                    C13609i iVar2 = new C13609i(iVar);
                    C86709a0.m107529k().f251779b.mo123460f(iVar2);
                    ((HashSet) this.f21607s).add(iVar2);
                }
            }
            if (((HashSet) this.f21607s).contains(yVar)) {
                ((HashSet) this.f21607s).remove(yVar);
                Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd netSceneSet remove, size:%s", Integer.valueOf(((HashSet) this.f21607s).size()));
                if (((HashSet) this.f21607s).isEmpty()) {
                    C89779i0 i0Var = this.f21605q;
                    if (i0Var != null) {
                        i0Var.dismiss();
                        this.f21605q = null;
                    }
                    finish();
                }
            }
        }
    }
}
