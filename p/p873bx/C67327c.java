package p873bx;

import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import g62.C75875l;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import nj3.C76912y0;
import pc0.C77068x;
import qo3.C89779i0;

/* renamed from: bx.c */
public final class C67327c implements C75875l.C75877b {

    /* renamed from: d */
    public boolean f193163d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f193164e;

    /* renamed from: f */
    public final /* synthetic */ String f193165f;

    /* renamed from: g */
    public final /* synthetic */ String f193166g;

    /* renamed from: h */
    public final /* synthetic */ C67391b f193167h;

    public C67327c(C72963f4 f4Var, String str, String str2, C67391b bVar) {
        this.f193164e = f4Var;
        this.f193165f = str;
        this.f193166g = str2;
        this.f193167h = bVar;
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        C77068x.C77069a aVar;
        C89779i0 i0Var;
        if (lVar != null && eVar != null && !this.f193163d) {
            ArrayList<C72963f4> arrayList = eVar.f123846c;
            C87412m.m108593f(arrayList, "notifyInfo.msgList");
            C72963f4 f4Var = this.f193164e;
            String str = this.f193165f;
            String str2 = this.f193166g;
            C67391b bVar = this.f193167h;
            Iterator<C72963f4> it = arrayList.iterator();
            while (it.hasNext()) {
                C72963f4 next = it.next();
                if (next.getMsgId() == f4Var.getMsgId()) {
                    C72963f4 b002 = ((C72972g4) lVar).b00(next.getMsgId());
                    Log.m105924i("MMRevoke.RevokeMsgHandler", "reqRevoke() onNotifyChange msgId=" + b002.getMsgId() + " status:" + b002.getStatus());
                    int i = 2;
                    boolean z = true;
                    if (b002.getStatus() == 2) {
                        Log.m105924i("MMRevoke.RevokeMsgHandler", "reqRevoke() STATE_SENT msgId=" + f4Var.getMsgId());
                        this.f193163d = true;
                        ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(this);
                        C67325b.f193160a.mo91457a(b002, str, str2);
                        return;
                    } else if (b002.getStatus() == 5) {
                        WeakReference<C89779i0> weakReference = C67325b.f193161b;
                        if (!(weakReference == null || (i0Var = weakReference.get()) == null)) {
                            i0Var.dismiss();
                        }
                        Log.m105924i("MMRevoke.RevokeMsgHandler", "reqRevoke() STATE_FAILED msgId=" + f4Var.getMsgId());
                        C76912y0.m92769h(bVar.mo91565f(), bVar.mo91572m().getString(C0966R.string.ct7), C0966R.raw.icons_filled_error);
                        this.f193163d = true;
                        ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(this);
                        C72963f4 b003 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(b002.getMsgId());
                        HashMap<Long, C77068x.C77069a> hashMap = C77068x.f225121b;
                        synchronized (hashMap) {
                            aVar = hashMap.get(Long.valueOf(b003.getMsgId()));
                        }
                        if (aVar == null || !aVar.f225125d) {
                            z = false;
                        }
                        if (z) {
                            i = 3;
                        }
                        C67328d.m79664b(i, b003, 3);
                        return;
                    }
                }
            }
        }
    }
}
