package o73;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.plugin.wear.model.C43465i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import java.io.IOException;
import l73.C46836a;
import te3.v05;

/* renamed from: o73.g */
public class C47339g extends C47334b {

    /* renamed from: d */
    public C72963f4 f127029d;

    public C47339g(C72963f4 f4Var) {
        this.f127029d = f4Var;
    }

    /* renamed from: b */
    public String mo67621b() {
        return "WearLuckyCreateTask";
    }

    /* renamed from: c */
    public void mo67622c() {
        v05 v05 = new v05();
        String content = this.f127029d.getContent();
        if (content != null) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(content, this.f127029d.mo108775z2());
            if (u == null || !u.f195608o1.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao")) {
                Log.m105924i("MicroMsg.Wear.WearLuckyCreateTask", "biz c2c message, do not send to watch!");
                return;
            }
            v05.f143231g = this.f127029d.getMsgId();
            v05.f143228d = this.f127029d.mo108768t();
            String str = this.f127029d.mo108769t2() == 1 ? u.f195584i1 : u.f195580h1;
            v05.f143229e = C43465i.m46972b(this.f127029d.mo108768t());
            if (C72996z1.m85820U5(this.f127029d.mo108768t())) {
                v05.f143230f = String.format(MMApplicationContext.getContext().getString(C0966R.string.hbh), new Object[]{C43465i.m46972b(mo72382d(this.f127029d.mo108768t(), this.f127029d)), 8203, str});
            } else {
                v05.f143230f = str;
            }
            try {
                C43457b.zx0().mo72270b(20014, v05.toByteArray(), true);
                C46836a.m52129b(10, 0);
                C46836a.m52128a(10);
            } catch (IOException unused) {
            }
        } else {
            Log.m105928w("MicroMsg.Wear.WearLuckyCreateTask", "xml is null!");
        }
    }
}
