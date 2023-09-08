package com.tencent.p014mm.p136ui.transmit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.fts.p059ui.C18843b0;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75589l0;
import eb0.C75592q0;
import eb0.C97625j3;
import gl3.C75922b;
import gl3.C75939h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import ke3.C88144b;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import nj3.C76879j;
import nv1.C100219b;
import p530fx.C45819c;
import p910lj.C76701a;
import pg3.C47504d;
import pg3.C77084b;
import rn3.C77545e;
import rn3.C77549f;
import rn3.C77551g;
import rn3.C77554h;
import rn3.C77555i;
import wd3.C78553c1;

/* renamed from: com.tencent.mm.ui.transmit.MMCreateChatroomUI */
public class MMCreateChatroomUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public List<String> f220124C;

    /* renamed from: D */
    public boolean f220125D;

    /* renamed from: E */
    public int f220126E;

    /* renamed from: F */
    public C77545e f220127F;

    /* renamed from: G */
    public C77551g f220128G;

    /* renamed from: H */
    public boolean f220129H;

    /* renamed from: I */
    public boolean f220130I;

    /* renamed from: com.tencent.mm.ui.transmit.MMCreateChatroomUI$a */
    public class C74871a implements MenuItem.OnMenuItemClickListener {
        public C74871a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            boolean z;
            MMCreateChatroomUI mMCreateChatroomUI = MMCreateChatroomUI.this;
            if (!mMCreateChatroomUI.f220130I) {
                mMCreateChatroomUI.f220130I = true;
                Class cls = C45819c.class;
                List<String> s = mMCreateChatroomUI.f220127F.mo107707s();
                Iterator it = ((ArrayList) s).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C72996z1.m85843n5((String) it.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    mMCreateChatroomUI.mo104107j8(((C45819c) C86312j.m106911c(cls)).mo71192mK("@chatroom").mo71494e("", s));
                } else {
                    mMCreateChatroomUI.mo104107j8(((C45819c) C86312j.m106911c(cls)).mo71192mK("@im.chatroom").mo71494e("", s));
                }
                MMCreateChatroomUI mMCreateChatroomUI2 = MMCreateChatroomUI.this;
                if (mMCreateChatroomUI2.f220126E == 3) {
                    mMCreateChatroomUI2.f220129H = true;
                    C18843b0.m19718e(true);
                }
            }
            Log.m105924i("MicroMsg.MMCreateChatroomUI", "Create the chatroom");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MMCreateChatroomUI$b */
    public class C74872b extends C47504d {

        /* renamed from: l */
        public final /* synthetic */ C72940a f220132l;

        public C74872b(C72940a aVar) {
            this.f220132l = aVar;
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C47504d dVar = (C47504d) bVar;
            MMCreateChatroomUI mMCreateChatroomUI = MMCreateChatroomUI.this;
            mMCreateChatroomUI.f220130I = false;
            if (!C74785j2.C6981a.m7247a(mMCreateChatroomUI, i, i2, str, 4)) {
                if (i == 0 && i2 == 0 && !Util.isNullOrNil(this.f127466h)) {
                    if (this.f220132l.f212612a) {
                        C75589l0.m90737c(this.f127466h, dVar.f127459a, MMCreateChatroomUI.this.getString(C0966R.string.b66), false, "");
                    }
                    List<String> list = dVar.f127463e;
                    if (list != null && list.size() > 0) {
                        LinkedList linkedList = new LinkedList();
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            linkedList.add(list.get(i3));
                        }
                        String str2 = "weixin://findfriend/verifycontact/" + this.f127466h + "/";
                        if (this.f220132l.f212612a) {
                            C75589l0.m90737c(this.f127466h, linkedList, MMCreateChatroomUI.this.getString(C0966R.string.b67), true, str2);
                        }
                    }
                    MMCreateChatroomUI mMCreateChatroomUI2 = MMCreateChatroomUI.this;
                    String str3 = this.f127466h;
                    mMCreateChatroomUI2.getClass();
                    Intent intent = new Intent();
                    if (mMCreateChatroomUI2.f220125D) {
                        intent.putExtra("Chat_User", str3);
                        C88144b.m109801s(mMCreateChatroomUI2, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                    } else {
                        intent.putExtra("Select_Contact", str3);
                        intent.putExtra("Select_Conv_User", str3);
                        intent.putExtra("Select_Contact", str3);
                        intent.putExtra("need_delete_chatroom_when_cancel", true);
                        mMCreateChatroomUI2.setResult(-1, intent);
                    }
                    mMCreateChatroomUI2.finish();
                    return;
                }
                MMCreateChatroomUI.m89638g8(MMCreateChatroomUI.this, i, i2, dVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MMCreateChatroomUI$c */
    public class C74873c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C72940a f220134d;

        public C74873c(C72940a aVar) {
            this.f220134d = aVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            MMCreateChatroomUI.this.f220130I = false;
            this.f220134d.cancel();
        }
    }

    /* renamed from: g8 */
    public static void m89638g8(MMCreateChatroomUI mMCreateChatroomUI, int i, int i2, C47504d dVar) {
        String str;
        boolean z;
        MMCreateChatroomUI mMCreateChatroomUI2 = mMCreateChatroomUI;
        C47504d dVar2 = dVar;
        mMCreateChatroomUI.getClass();
        String string = MMApplicationContext.getContext().getString(C0966R.string.b68);
        String str2 = "";
        if (i2 == -23) {
            str = mMCreateChatroomUI2.getString(C0966R.string.i7n);
            str2 = mMCreateChatroomUI2.getString(C0966R.string.i7m);
        } else {
            str = str2;
        }
        List<String> list = dVar2.f127463e;
        List<String> list2 = dVar2.f127461c;
        if (list == null || list.size() <= 0 || (list.size() != dVar2.f127465g && (list2 == null || list2.size() <= 0 || dVar.mo72507b() != list.size() + list2.size()))) {
            List<String> list3 = dVar2.f127461c;
            if (list3 != null && list3.size() > 0 && dVar2.f127465g == list3.size()) {
                str = mMCreateChatroomUI2.getString(C0966R.string.f360942g51);
                str2 = str2 + mMCreateChatroomUI2.getString(C0966R.string.eyw, new Object[]{Util.listToString(mMCreateChatroomUI2.mo104109l8(list3), string)});
            }
            List<String> list4 = dVar2.f127460b;
            if (list4 != null && list4.size() > 0) {
                Iterator<String> it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C72996z1.m85843n5(it.next())) {
                            str = mMCreateChatroomUI2.getString(C0966R.string.f360942g51);
                            str2 = mMCreateChatroomUI2.getString(C0966R.string.f360943g52);
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    str = mMCreateChatroomUI2.getString(C0966R.string.f360942g51);
                    str2 = str2 + mMCreateChatroomUI2.getString(C0966R.string.eyz, new Object[]{Util.listToString(mMCreateChatroomUI2.mo104109l8(list4), string)});
                }
            }
            if (str == null || str.length() <= 0) {
                C76701a.makeText((Context) mMCreateChatroomUI2, (CharSequence) mMCreateChatroomUI2.getString(C0966R.string.eyg, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            } else {
                C76879j.m92748s(mMCreateChatroomUI2, str2, str);
            }
        } else {
            LinkedList linkedList = new LinkedList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                linkedList.add(list.get(i3));
            }
            Assert.assertTrue(linkedList.size() > 0);
            String string2 = MMApplicationContext.getContext().getString(C0966R.string.b68);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(linkedList);
            arrayList.addAll(list2);
            C76879j.m92709C(mMCreateChatroomUI, mMCreateChatroomUI2.getString(C0966R.string.ez8, new Object[]{Util.listToString(mMCreateChatroomUI2.mo104109l8(arrayList), string2)}), mMCreateChatroomUI2.getString(C0966R.string.f360942g51), mMCreateChatroomUI2.getString(C0966R.string.ez7), mMCreateChatroomUI2.getString(C0966R.string.ez6), true, new C77554h(mMCreateChatroomUI2, linkedList), (DialogInterface.OnClickListener) null);
        }
    }

    /* renamed from: i8 */
    public static void m89639i8(MMCreateChatroomUI mMCreateChatroomUI, LinkedList linkedList) {
        mMCreateChatroomUI.getClass();
        Assert.assertTrue(linkedList.size() > 0);
        LinkedList linkedList2 = new LinkedList();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList2.add(3);
        }
        new C78553c1(mMCreateChatroomUI, new C77555i(mMCreateChatroomUI)).mo108531g(linkedList, linkedList2);
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        C77545e.C77547b bVar2;
        if (!(bVar instanceof C75939h)) {
            return false;
        }
        C77545e eVar = this.f220127F;
        String str = ((C75939h) bVar).f222676B.f292151e;
        int i = bVar.f222605b;
        if (!eVar.f226079q.contains(str)) {
            return false;
        }
        int size = ((ArrayList) eVar.f226078p).size();
        while (true) {
            size--;
            if (size < 0) {
                bVar2 = null;
                break;
            }
            bVar2 = (C77545e.C77547b) ((ArrayList) eVar.f226078p).get(size);
            if (i >= bVar2.f226086c) {
                break;
            }
        }
        return bVar2 != null && !str.equals(bVar2.f226090g);
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        if (this.f220127F == null) {
            this.f220127F = new C77545e(this, (List<String>) null, true, true, this.f220124C, this.f218604A);
        }
        return this.f220127F;
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        if (this.f220128G == null) {
            this.f220128G = new C77551g(this, this.f218604A);
        }
        return this.f220128G;
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return getString(C0966R.string.ijf);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        C77545e eVar = this.f220127F;
        C77551g gVar = this.f220128G;
        C10656l lVar = gVar.f226100q;
        String str = gVar.f226099p;
        eVar.getClass();
        if (lVar.f32076e.size() != 1 || !lVar.f32076e.get(0).f292151e.equals("no_result​")) {
            C77545e.C77547b bVar = new C77545e.C77547b(eVar, (C77545e.C77546a) null);
            bVar.f226089f = lVar.f32076e;
            bVar.f226085b = lVar.f32075d;
            bVar.f226084a = str;
            ((ArrayList) eVar.f226078p).add(bVar);
            int headerViewsCount = i - eVar.f219055d.mo7831f6().getHeaderViewsCount();
            if (headerViewsCount >= 3) {
                lVar.f32076e.add(0, lVar.f32076e.remove(headerViewsCount));
                i = eVar.f219055d.mo7831f6().getHeaderViewsCount();
            }
            eVar.mo107709u();
            eVar.f219055d.mo7831f6().post(new C77549f(eVar, bVar.f226086c + i + 1));
        }
        mo103378K7();
        mo103377J7();
        hideVKB();
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f220124C = getIntent().getStringArrayListExtra("query_phrase_list");
        this.f220125D = getIntent().getBooleanExtra("go_to_chatroom_direct", false);
        this.f220126E = getIntent().getIntExtra("scene_from", 0);
    }

    /* renamed from: U7 */
    public boolean mo103382U7() {
        return true;
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
            C77545e eVar = this.f220127F;
            eVar.f226079q.remove(str);
            Iterator it = ((ArrayList) eVar.f226078p).iterator();
            while (it.hasNext()) {
                C77545e.C77547b bVar = (C77545e.C77547b) it.next();
                if (str.equals(bVar.f226090g)) {
                    bVar.f226090g = null;
                }
            }
            eVar.notifyDataSetChanged();
            mo104108k8();
        }
    }

    public void initView() {
        super.initView();
        C77545e eVar = this.f220127F;
        for (String str : eVar.f226076n) {
            C76728k kVar = new C76728k();
            kVar.f224479n = eVar.f226080r;
            kVar.f224478m = eVar.f226081s;
            kVar.f224468c = str;
            kVar.f224477l = C100219b.f293645d;
            kVar.f224472g = new int[]{131072};
            kVar.f224475j.add("filehelper");
            kVar.f224475j.add(C75592q0.m90789s());
            C99664b Xn0 = ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
            ArrayList arrayList = new ArrayList();
            eVar.f226077o = arrayList;
            arrayList.add(Xn0);
        }
        addTextOptionMenu(1, getString(C0966R.string.a18), new C74871a(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        mo104108k8();
    }

    /* renamed from: j8 */
    public final void mo104107j8(C72940a aVar) {
        aVar.f212615d = new C74872b(aVar);
        aVar.mo100867d(this, getString(C0966R.string.a3h), getString(C0966R.string.f360944g53), true, true, new C74873c(aVar));
    }

    /* renamed from: k8 */
    public void mo104108k8() {
        ArrayList arrayList = (ArrayList) this.f220127F.mo107707s();
        if (arrayList.size() > 0) {
            updateOptionMenuText(1, getString(C0966R.string.a18) + "(" + arrayList.size() + ")");
            if (arrayList.size() > 1) {
                enableOptionMenu(1, true);
            } else {
                enableOptionMenu(1, false);
            }
        } else {
            updateOptionMenuText(1, getString(C0966R.string.a18));
            enableOptionMenu(1, false);
        }
    }

    /* renamed from: l8 */
    public final List<String> mo104109l8(List<String> list) {
        LinkedList linkedList = new LinkedList();
        if (!C97625j3.m125811a() || list == null) {
            return linkedList;
        }
        for (String next : list) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(next);
            if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                next = z1Var.mo62898f();
            }
            linkedList.add(next);
        }
        return linkedList;
    }

    public void onDestroy() {
        this.f220127F.mo7851i();
        if (!this.f220129H && this.f220126E == 3) {
            C18843b0.m19718e(false);
        }
        super.onDestroy();
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        if (!(bVar instanceof C75939h)) {
            return false;
        }
        C77545e eVar = this.f220127F;
        return eVar.f226079q.contains(((C75939h) bVar).f222676B.f292151e);
    }
}
