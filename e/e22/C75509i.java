package e22;

import a22.C27740g;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: e22.i */
public final class C75509i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ContactEditLabel f221880d;

    public C75509i(ContactEditLabel contactEditLabel) {
        this.f221880d = contactEditLabel;
    }

    public void run() {
        ArrayList<String> bO = C27740g.vx0().mo100951bO(this.f221880d.f198457i);
        if (bO == null) {
            Log.m105928w(this.f221880d.f198452d, "result is null");
            return;
        }
        int size = bO.size();
        for (int i = 0; i < size; i++) {
            C87412m.m108593f(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(bO.get(i)), "service(IMessengerStorag…contactStg.get(result[i])");
        }
        ContactEditLabel contactEditLabel = this.f221880d;
        contactEditLabel.f198462q = bO;
        ArrayList<String> arrayList = contactEditLabel.f198463r;
        if (arrayList == null) {
            contactEditLabel.f198463r = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        this.f221880d.f198463r.addAll(bO);
        ContactEditLabel contactEditLabel2 = this.f221880d;
        MMHandler mMHandler = contactEditLabel2.f198451E;
        if (mMHandler != null) {
            mMHandler.sendEmptyMessage(contactEditLabel2.f198454f);
        }
    }
}
