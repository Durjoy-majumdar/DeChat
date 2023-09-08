package o73;

import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.util.ArrayList;
import te3.d15;

/* renamed from: o73.i */
public class C47341i extends C47335c {

    /* renamed from: d */
    public ArrayList<Integer> f127034d;

    /* renamed from: e */
    public boolean f127035e;

    public C47341i(boolean z) {
        this.f127035e = z;
    }

    /* renamed from: b */
    public String mo67621b() {
        return "WearCancelNotificationTask";
    }

    /* renamed from: c */
    public void mo67622c() {
        Log.m105925i("MicroMsg.WearCancelNotificationTask", "Id List=%s", this.f127034d);
        d15 d15 = new d15();
        ArrayList<Integer> arrayList = this.f127034d;
        if (arrayList != null) {
            d15.f132070d.addAll(arrayList);
        }
        d15.f132071e = this.f127035e;
        try {
            C43457b.zx0().mo72270b(20004, d15.toByteArray(), false);
        } catch (IOException unused) {
        }
    }

    public C47341i(ArrayList<Integer> arrayList) {
        this.f127034d = arrayList;
        this.f127035e = false;
    }
}
