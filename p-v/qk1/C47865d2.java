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
import java.util.ArrayList;
import java.util.List;
import p922vj.C78420a;

/* renamed from: qk1.d2 */
public final class C47865d2 extends C74526m1 {

    /* renamed from: n */
    public Cursor f128467n;

    /* renamed from: o */
    public final List<String> f128468o = new ArrayList();

    public C47865d2(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2) {
        super(mMBaseSelectContactUI, list, z, true);
        Log.m105924i("MicroMsg.FinderLiveMultiChatRoomAdapter", "create!");
        mo7853r();
    }

    public int getCount() {
        return ((ArrayList) this.f128468o).size();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        Class cls = C75700k0.class;
        String str = (String) ((ArrayList) this.f128468o).get(i);
        C72996z1 W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69674W2(str);
        if (W2 == null) {
            W2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(str);
        }
        C77355e2 e2Var = new C77355e2(i);
        e2Var.mo106181j(W2);
        e2Var.f222608e = this.f219057f;
        return e2Var;
    }

    /* renamed from: r */
    public void mo7853r() {
        Log.m105924i("MicroMsg.FinderLiveMultiChatRoomAdapter", "resetData");
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        List<String> list = this.f219096j;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        this.f128467n = ((C44660i2) Ku).mo69747R(5, list, (String) null, this.f219095i, "");
        mo103564g();
        Cursor cursor = this.f128467n;
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("username"));
                if (!this.f128468o.contains(string)) {
                    this.f128468o.add(string);
                }
            }
        }
    }
}
