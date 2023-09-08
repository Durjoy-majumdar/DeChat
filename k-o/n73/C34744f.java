package n73;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.OmitAllFailNormalMsgEvent;
import com.tencent.p014mm.autogen.events.ResendAllFailNormalMsgEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.List;
import ke3.C88144b;

/* renamed from: n73.f */
public class C34744f extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11013);
        arrayList.add(11014);
        arrayList.add(11015);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        switch (i) {
            case 11013:
                new OmitAllFailNormalMsgEvent().publish();
                break;
            case 11014:
                ArrayList<C72963f4> NQ = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101077NQ();
                if (NQ.size() != 1) {
                    Intent intent = new Intent();
                    intent.addFlags(67108864);
                    intent.addFlags(536870912);
                    intent.putExtra("From_fail_notify", true);
                    Log.m105918d("MicroMsg.Wear.HttpFailMsgServer", "startMainUI");
                    C88144b.m109801s(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
                    break;
                } else {
                    String t = NQ.get(0).mo108768t();
                    Intent intent2 = new Intent();
                    intent2.putExtra("Main_User", t);
                    intent2.putExtra("From_fail_notify", true);
                    intent2.addFlags(67108864);
                    intent2.addFlags(536870912);
                    Log.m105919d("MicroMsg.Wear.HttpFailMsgServer", "startChattingUI talker=%s", t);
                    C88144b.m109801s(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI", intent2, (Bundle) null);
                    break;
                }
            case 11015:
                new ResendAllFailNormalMsgEvent().publish();
                break;
        }
        return null;
    }
}
