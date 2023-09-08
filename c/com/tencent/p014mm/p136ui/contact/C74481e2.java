package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.item.RecentForwardListDataItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75946n;
import gl3.C75955q;
import gl3.C75960s;
import gl3.C75976w;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p922vj.C78420a;
import qo3.C77426q;

/* renamed from: com.tencent.mm.ui.contact.e2 */
public class C74481e2 extends C74526m1 implements MStorageEx.IOnStorageChange {

    /* renamed from: A */
    public int f219005A = 0;

    /* renamed from: B */
    public int f219006B = 0;

    /* renamed from: C */
    public C74483b f219007C;

    /* renamed from: D */
    public C75976w f219008D;

    /* renamed from: E */
    public RecentForwardListDataItem f219009E;

    /* renamed from: F */
    public C75960s f219010F;

    /* renamed from: G */
    public boolean f219011G;

    /* renamed from: H */
    public boolean f219012H;

    /* renamed from: I */
    public boolean f219013I;

    /* renamed from: J */
    public boolean f219014J;

    /* renamed from: K */
    public Context f219015K;

    /* renamed from: n */
    public Cursor f219016n;

    /* renamed from: o */
    public Cursor f219017o;

    /* renamed from: p */
    public Cursor f219018p;

    /* renamed from: q */
    public int f219019q = -1;

    /* renamed from: r */
    public boolean f219020r;

    /* renamed from: s */
    public int f219021s = 0;

    /* renamed from: t */
    public int f219022t = 1;

    /* renamed from: u */
    public boolean f219023u = false;

    /* renamed from: v */
    public Map<String, Integer> f219024v = new HashMap();

    /* renamed from: w */
    public Map<String, Integer> f219025w = new HashMap();

    /* renamed from: x */
    public int f219026x = 0;

    /* renamed from: y */
    public int f219027y = 0;

    /* renamed from: z */
    public String f219028z = "";

    /* renamed from: com.tencent.mm.ui.contact.e2$a */
    public class C74482a implements C75976w {
        public C74482a() {
        }

        /* renamed from: a */
        public void mo103553a() {
            C75976w wVar = C74481e2.this.f219008D;
            if (wVar != null) {
                wVar.mo103553a();
            }
        }

        /* renamed from: b */
        public void mo103554b() {
            C74481e2 e2Var = C74481e2.this;
            C75976w wVar = e2Var.f219008D;
            if (wVar == null) {
                return;
            }
            if (!e2Var.f219012H) {
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(e2Var.f219015K.getString(C0966R.string.na5));
                qVar.mo107602n(e2Var.f219015K.getString(C0966R.string.na6));
                qVar.mo107600l(new C74489f2(e2Var));
                qVar.mo107603o();
            } else if (wVar != null) {
                wVar.mo103554b();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.e2$b */
    public interface C74483b {
    }

    public C74481e2(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2, boolean z3, int i) {
        super(mMBaseSelectContactUI, list, z, z2);
        new ArrayList();
        this.f219011G = false;
        this.f219012H = false;
        this.f219013I = false;
        this.f219014J = false;
        Log.m105924i("MicroMsg.NewRecentConversationAdapter", "create!");
        this.f219020r = z3;
        this.f219021s = i;
        this.f219015K = mMBaseSelectContactUI;
        mo7853r();
    }

    public int getCount() {
        if (this.f219018p != null) {
            return this.f219006B != 0 ? this.f219005A + 1 + 1 : this.f219005A + 1;
        }
        Log.m105920e("MicroMsg.NewRecentConversationAdapter", "getCount: dataCursor == null ");
        return 0;
    }

    public int getItemViewType(int i) {
        if (this.f219006B == 0 || i >= this.f219019q) {
            return super.getItemViewType(i);
        }
        Log.m105924i("MicroMsg.NewRecentConversationAdapter", "getItemViewType:  return HORIZONTAL_RECENT_FORWARD_LIST Type");
        return 9;
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        int i2;
        C75960s sVar;
        Class cls = C75700k0.class;
        int i3 = this.f219019q;
        int i4 = this.f219006B;
        if (i4 != 0 && i == 0) {
            RecentForwardListDataItem recentForwardListDataItem = new RecentForwardListDataItem(i);
            this.f219009E = recentForwardListDataItem;
            ArrayList<C74500h3> arrayList = new ArrayList<>();
            Cursor cursor = this.f219017o;
            if (cursor != null && cursor.getCount() > 0) {
                int i5 = 1;
                while (this.f219017o.moveToNext()) {
                    Cursor cursor2 = this.f219017o;
                    String string = cursor2.getString(cursor2.getColumnIndex("username"));
                    C86709a0.m107528h();
                    C72996z1 W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69674W2(string);
                    if (W2 == null) {
                        Log.m105924i("MicroMsg.NewRecentConversationAdapter", "parse: contact == null");
                        C86709a0.m107528h();
                        W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(string);
                    }
                    String pi = ((C75339i) C86312j.m106911c(C75339i.class)).mo62520pi(W2);
                    C87412m.m108594g(string, "contactUserName");
                    C87412m.m108594g(pi, "displayNickName");
                    C74500h3 h3Var = new C74500h3(new C74504i3(string, pi, false, false, 12, (C8480h) null));
                    arrayList.add(h3Var);
                    ((HashMap) this.f219025w).put(h3Var.f219053d.f219061a, Integer.valueOf(i5));
                    i5++;
                }
            }
            recentForwardListDataItem.f219065B = arrayList;
            RecentForwardListDataItem recentForwardListDataItem2 = this.f219009E;
            recentForwardListDataItem2.f222608e = this.f219057f;
            recentForwardListDataItem2.f219066C = new C74494g2(this);
            C74499h2 h2Var = new C74499h2(this);
            recentForwardListDataItem2.getClass();
            recentForwardListDataItem2.f219067D = h2Var;
            RecentForwardListDataItem recentForwardListDataItem3 = this.f219009E;
            C74503i2 i2Var = new C74503i2(this);
            recentForwardListDataItem3.getClass();
            recentForwardListDataItem3.f219068E = i2Var;
            this.f219023u = true;
            return this.f219009E;
        } else if (i == i3) {
            return mo103550t(i);
        } else {
            if (i < 0) {
                return null;
            }
            if (this.f219022t == 1) {
                i2 = i4 != 0 ? i - 2 : i - 1;
            } else {
                Log.m105921e("MicroMsg.NewRecentConversationAdapter", "Actually dead branch. position=%d", Integer.valueOf(i));
                i2 = i;
            }
            if (this.f219018p.moveToPosition(i2)) {
                C75946n nVar = new C75946n(i);
                C72976h2 h2Var2 = new C72976h2();
                h2Var2.convertFrom(this.f219018p);
                C86709a0.m107528h();
                nVar.mo106181j(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69674W2(h2Var2.getUsername()));
                if (nVar.f222600A == null) {
                    C86709a0.m107528h();
                    nVar.mo106181j(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(h2Var2.getUsername()));
                }
                nVar.f222608e = this.f219057f;
                if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69755a0(h2Var2.getUsername())) {
                    nVar.f222616m = true;
                    if (i == this.f219019q + 1 && (sVar = this.f219010F) != null) {
                        this.f219011G = true;
                        sVar.mo106193l(C0966R.C0969drawable.f357218a91);
                    }
                }
                if (i == this.f219019q - 1) {
                    nVar.f222615l = true;
                }
                String str = nVar.f222621r;
                if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69755a0(str)) {
                    this.f219026x++;
                }
                ((HashMap) this.f219024v).put(str, Integer.valueOf(i - this.f219019q));
                return nVar;
            }
            C75955q qVar = new C75955q(4, i);
            Log.m105921e("MicroMsg.NewRecentConversationAdapter", "wrong case: %s, %s", Boolean.valueOf(this.f219018p.isClosed()), Integer.valueOf(i2));
            return qVar;
        }
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.NewRecentConversationAdapter", "finish!");
        mo103549s();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().remove(this);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        mo7853r();
        notifyDataSetChanged();
    }

    /* renamed from: p */
    public void mo103548p(boolean z) {
        super.mo103548p(z);
    }

    /* renamed from: r */
    public void mo7853r() {
        Cursor cursor;
        Class cls = C75700k0.class;
        Log.m105924i("MicroMsg.NewRecentConversationAdapter", "resetData");
        mo103549s();
        new ArrayList();
        this.f219006B = 0;
        List<String> list = null;
        if (C74560s1.m89275d(this.f219021s, 4)) {
            if (!this.f219013I) {
                list = C57827q0.m66829b();
                if (!Util.isNullOrNil((List) list)) {
                    C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                    List<String> list2 = this.f219096j;
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
                    this.f219017o = ((C44660i2) Ku).mo69739J(list, 3, list2, (String) null, this.f219095i, "");
                }
                Log.m105924i("MicroMsg.NewRecentConversationAdapter", "resetData: recent forward control switch on");
            }
            C30783v3 Ku2 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            List<String> list3 = this.f219096j;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C78420a.f229768m1;
            this.f219016n = ((C44660i2) Ku2).mo69747R(3, list3, (String) null, this.f219095i, "");
        } else if (C74560s1.m89275d(this.f219021s, 16)) {
            if (!this.f219013I) {
                list = C57827q0.m66827a();
                if (!Util.isNullOrNil((List) list)) {
                    C30783v3 Ku3 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                    List<String> list4 = this.f219096j;
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo3 = C78420a.f229768m1;
                    this.f219017o = ((C44660i2) Ku3).mo69739J(list, 5, list4, (String) null, this.f219095i, "");
                }
                Log.m105924i("MicroMsg.NewRecentConversationAdapter", "resetData: recent forward control switch on");
            }
            C30783v3 Ku4 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            List<String> list5 = this.f219096j;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo4 = C78420a.f229768m1;
            this.f219016n = ((C44660i2) Ku4).mo69747R(5, list5, (String) null, this.f219095i, "");
        } else {
            if (!this.f219013I) {
                list = C57827q0.m66830c();
                if (!Util.isNullOrNil((List) list)) {
                    C30783v3 Ku5 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                    List<String> list6 = this.f219096j;
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo5 = C78420a.f229768m1;
                    this.f219017o = ((C44660i2) Ku5).mo69739J(list, 1, list6, (String) null, this.f219095i, "");
                }
            }
            Log.m105924i("MicroMsg.NewRecentConversationAdapter", "resetData: recent forward control switch on");
            C30783v3 Ku6 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            List<String> list7 = this.f219096j;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo6 = C78420a.f229768m1;
            this.f219016n = ((C44660i2) Ku6).mo69747R(1, list7, (String) null, this.f219095i, "");
        }
        int i = this.f219020r ? 2 : 0;
        if (!Util.isNullOrNil((List) list) && (cursor = this.f219017o) != null) {
            this.f219006B = cursor.getCount();
        }
        int count = this.f219016n.getCount();
        this.f219005A = count;
        if (count <= 0) {
            this.f219019q = this.f219055d.mo7831f6().getHeaderViewsCount();
        } else if (this.f219006B == 0) {
            this.f219019q = 0 + i;
        } else {
            this.f219019q = 0 + i + 1;
        }
        this.f219018p = this.f219016n;
        mo103564g();
    }

    /* renamed from: s */
    public void mo103549s() {
        Cursor cursor = this.f219016n;
        if (cursor != null) {
            cursor.close();
            this.f219016n = null;
        }
        Cursor cursor2 = this.f219017o;
        if (cursor2 != null) {
            cursor2.close();
            this.f219017o = null;
        }
        Cursor cursor3 = this.f219018p;
        if (cursor3 != null) {
            cursor3.close();
            this.f219018p = null;
        }
    }

    /* renamed from: t */
    public C75960s mo103550t(int i) {
        Log.m105925i("MicroMsg.NewRecentConversationAdapter", "createHeaderViewDataItem: isSupportForwardToWeWork:%s", Boolean.valueOf(this.f219012H));
        C75960s sVar = new C75960s(i);
        sVar.f222742H = this.f219012H;
        sVar.f222741G = this.f219014J;
        sVar.f222736B = new C74482a();
        this.f219010F = sVar;
        return sVar;
    }

    /* renamed from: u */
    public boolean mo103551u(String str) {
        Map<String, Integer> map;
        if (Util.isNullOrNil(str) || (map = this.f219024v) == null || ((HashMap) map).isEmpty()) {
            return false;
        }
        return ((HashMap) this.f219024v).containsKey(str);
    }

    /* renamed from: v */
    public void mo103552v(List<String> list) {
        RecentForwardListDataItem recentForwardListDataItem = this.f219009E;
        if (recentForwardListDataItem != null) {
            ArrayList<C74500h3> arrayList = recentForwardListDataItem.f219065B;
            if (arrayList != null) {
                for (C74500h3 h3Var : arrayList) {
                    h3Var.f219053d.f219063c = false;
                    if (list != null) {
                        for (String b : list) {
                            if (C87412m.m108589b(h3Var.f219053d.f219061a, b)) {
                                h3Var.f219053d.f219063c = true;
                            }
                        }
                    }
                }
            }
            WxRecyclerAdapter<C74500h3> wxRecyclerAdapter = recentForwardListDataItem.f219070G;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }
    }
}
