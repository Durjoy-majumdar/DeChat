package o73;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.io.IOException;
import te3.n05;

/* renamed from: o73.e */
public class C47337e extends C47335c {
    /* renamed from: b */
    public String mo67621b() {
        return "WearFailMsgCreateTask";
    }

    /* renamed from: c */
    public void mo67622c() {
        int size = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101077NQ().size();
        n05 n05 = new n05();
        n05.f138318d = C43457b.yx0().mo67628a(C75592q0.m90789s()).f117477b;
        n05.f138319e = MMApplicationContext.getContext().getString(C0966R.string.a0u);
        n05.f138320f = MMApplicationContext.getContext().getString(C0966R.string.ha9, new Object[]{Integer.valueOf(size)});
        try {
            C43457b.zx0().mo72270b(20005, n05.toByteArray(), true);
        } catch (IOException unused) {
        }
    }
}
