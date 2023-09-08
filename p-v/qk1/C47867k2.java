package qk1;

import android.database.Cursor;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p922vj.C78420a;

/* renamed from: qk1.k2 */
public final class C47867k2 extends C74526m1 {

    /* renamed from: n */
    public final ArrayList<String> f128470n = new ArrayList<>();

    /* renamed from: o */
    public Cursor f128471o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47867k2(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2) {
        super(mMBaseSelectContactUI, list, z, z2);
        C87412m.m108594g(mMBaseSelectContactUI, "selectContactUI");
        mo7853r();
    }

    public int getCount() {
        return this.f128470n.size();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        Class cls = C75700k0.class;
        String str = this.f128470n.get(i);
        C87412m.m108593f(str, "dataList[position]");
        String str2 = str;
        C72996z1 W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69674W2(str2);
        if (W2 == null) {
            W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(str2);
        }
        C77355e2 e2Var = new C77355e2(i);
        e2Var.mo106181j(W2);
        e2Var.f222608e = this.f219057f;
        return e2Var;
    }

    /* renamed from: r */
    public void mo7853r() {
        Log.m105924i("Finder.FinderLiveRoomAdapter", "resetData");
        Cursor cursor = this.f128471o;
        if (cursor != null) {
            if (cursor != null) {
                cursor.close();
            }
            this.f128471o = null;
        }
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        List<String> list = this.f219096j;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        Cursor R = ((C44660i2) Ku).mo69747R(5, list, (String) null, this.f219095i, "");
        this.f128471o = R;
        if (R != null) {
            while (R.moveToNext()) {
                String string = R.getString(R.getColumnIndex("username"));
                C87412m.m108593f(string, "it.getString(it.getColumnIndex(\"username\"))");
                if (!this.f128470n.contains(string)) {
                    this.f128470n.add(string);
                }
            }
            R.close();
        }
    }
}
