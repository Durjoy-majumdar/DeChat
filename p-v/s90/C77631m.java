package s90;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.io.IOException;
import p227rn.C48050d0;
import p243tn.C14050a;
import p248ug.C102027b;

/* renamed from: s90.m */
public class C77631m extends C77628g implements C48050d0 {
    public C77631m() {
        this.f226307q = new C77630j();
    }

    /* renamed from: b */
    public void mo107809b(Bundle bundle) {
        int i;
        try {
            if (C86709a0.m107531m().mo58407a().mo71804b() && (((i = this.f226307q.f226333o) == 5 || i == 8) && this.f226308r.size() == 0)) {
                this.f226308r.add(C14050a.m13405b(C102027b.m134386a(this.f226307q.f226330i, 4, true)));
            }
            bundle.putByteArray("biz_mp_msg_info", toByteArray());
            bundle.putString("rawUrl", this.f226307q.f226326e);
        } catch (IOException e) {
            Log.m105921e("MicroMsg.MPMsgInfo", "writeToIntent %s", e.getMessage());
        }
    }
}
