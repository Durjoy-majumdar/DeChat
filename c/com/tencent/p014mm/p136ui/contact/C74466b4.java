package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75949o;
import gl3.C75955q;
import gl3.C75960s;
import java.util.HashMap;
import java.util.List;
import p922vj.C78420a;

/* renamed from: com.tencent.mm.ui.contact.b4 */
public class C74466b4 extends C74481e2 {
    public C74466b4(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2, boolean z3, int i) {
        super(mMBaseSelectContactUI, list, z, z2, z3, i);
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        int i2;
        C75960s sVar;
        Class cls = C75700k0.class;
        if (i == this.f219019q) {
            return mo103550t(i);
        }
        if (i < 0) {
            return null;
        }
        if (this.f219022t == 1) {
            i2 = i - 1;
        } else {
            Log.m105921e("MicroMsg.SnsSelectConversationAdapter", "Actually dead branch. position=%d", Integer.valueOf(i));
            i2 = i;
        }
        if (this.f219018p.moveToPosition(i2)) {
            C75949o oVar = new C75949o(i);
            C72976h2 h2Var = new C72976h2();
            h2Var.convertFrom(this.f219018p);
            C86709a0.m107528h();
            oVar.mo106181j(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69674W2(h2Var.getUsername()));
            if (oVar.f222600A == null) {
                C86709a0.m107528h();
                oVar.mo106181j(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(h2Var.getUsername()));
            }
            oVar.f222608e = this.f219057f;
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69755a0(h2Var.getUsername())) {
                oVar.f222616m = true;
                if (i == this.f219019q + 1 && (sVar = this.f219010F) != null) {
                    this.f219011G = true;
                    sVar.mo106193l(C0966R.C0969drawable.f357218a91);
                }
            }
            if (i == this.f219019q - 1) {
                oVar.f222615l = true;
            }
            String str = oVar.f222621r;
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69755a0(str)) {
                this.f219026x++;
            }
            ((HashMap) this.f219024v).put(str, Integer.valueOf(i - this.f219019q));
            return oVar;
        }
        C75955q qVar = new C75955q(4, i);
        Log.m105921e("MicroMsg.SnsSelectConversationAdapter", "wrong case: %s, %s", Boolean.valueOf(this.f219018p.isClosed()), Integer.valueOf(i2));
        return qVar;
    }

    /* renamed from: r */
    public void mo7853r() {
        Class cls = C75700k0.class;
        Log.m105924i("MicroMsg.SnsSelectConversationAdapter", "resetData");
        mo103549s();
        if (C74560s1.m89275d(this.f219021s, 4)) {
            List<String> b = C57827q0.m66829b();
            if (!Util.isNullOrNil((List) b)) {
                C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                List<String> list = this.f219096j;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
                this.f219017o = ((C44660i2) Ku).mo69739J(b, 3, list, (String) null, this.f219095i, "");
            }
            Log.m105924i("MicroMsg.SnsSelectConversationAdapter", "resetData: recent forward control switch on");
            C30783v3 Ku2 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            List<String> list2 = this.f219096j;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C78420a.f229768m1;
            this.f219016n = ((C44660i2) Ku2).mo69747R(3, list2, (String) null, this.f219095i, "");
        } else if (C74560s1.m89275d(this.f219021s, 16)) {
            List<String> a = C57827q0.m66827a();
            if (!Util.isNullOrNil((List) a)) {
                C30783v3 Ku3 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                List<String> list3 = this.f219096j;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo3 = C78420a.f229768m1;
                this.f219017o = ((C44660i2) Ku3).mo69739J(a, 5, list3, (String) null, this.f219095i, "");
            }
            Log.m105924i("MicroMsg.SnsSelectConversationAdapter", "resetData: recent forward control switch on");
            C30783v3 Ku4 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            List<String> list4 = this.f219096j;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo4 = C78420a.f229768m1;
            this.f219016n = ((C44660i2) Ku4).mo69747R(5, list4, (String) null, this.f219095i, "");
        } else {
            List<String> c = C57827q0.m66830c();
            if (!Util.isNullOrNil((List) c)) {
                C30783v3 Ku5 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                List<String> list5 = this.f219096j;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo5 = C78420a.f229768m1;
                this.f219017o = ((C44660i2) Ku5).mo69739J(c, 1, list5, (String) null, this.f219095i, "");
            }
            Log.m105924i("MicroMsg.SnsSelectConversationAdapter", "resetData: recent forward control switch on");
            C30783v3 Ku6 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            List<String> list6 = this.f219096j;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo6 = C78420a.f229768m1;
            this.f219016n = ((C44660i2) Ku6).mo69747R(1, list6, (String) null, this.f219095i, "");
        }
        int count = this.f219016n.getCount();
        this.f219005A = count;
        if (count > 0) {
            this.f219019q = 0;
        } else {
            this.f219019q = this.f219055d.mo7831f6().getHeaderViewsCount();
        }
        this.f219018p = this.f219016n;
        mo103564g();
    }
}
