package zm2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.wcdb.support.CancellationSignal;
import di3.C86312j;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76879j;
import p275xz.C79012e;

/* renamed from: zm2.d */
public class C23512d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C23519f f67446d;

    /* renamed from: zm2.d$a */
    public class C23513a implements DialogInterface.OnCancelListener {
        public C23513a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C23519f fVar = C23512d.this.f67446d;
            fVar.f67456c = true;
            fVar.f67457d.cancel();
        }
    }

    /* renamed from: zm2.d$b */
    public class C23514b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f67448d;

        public C23514b(ArrayList arrayList) {
            this.f67448d = arrayList;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14553, 5, 4, "");
            C23519f fVar = C23512d.this.f67446d;
            fVar.f67456c = true;
            fVar.f67457d.cancel();
            if (this.f67448d.size() <= 1) {
                Intent intent = new Intent();
                intent.putExtra("Chat_User", (String) this.f67448d.get(0));
                intent.addFlags(67108864);
                C88144b.m109801s(C23512d.this.f67446d.f67454a, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.putStringArrayListExtra("key_conversation_list", this.f67448d);
            C88144b.m109801s(C23512d.this.f67446d.f67454a, ".ui.conversation.SettingCheckUnProcessWalletConvUI", intent2, (Bundle) null);
        }
    }

    /* renamed from: zm2.d$c */
    public class C23515c implements DialogInterface.OnClickListener {
        public C23515c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14553, 5, 3, "");
            C23512d.this.f67446d.f67455b.show();
            C23519f fVar = C23512d.this.f67446d;
            fVar.f67456c = false;
            fVar.f67457d = new CancellationSignal();
            C23519f fVar2 = C23512d.this.f67446d;
            fVar2.getClass();
            ThreadPool.post(new C23516e(fVar2), "doResetChatHistory");
        }
    }

    public C23512d(C23519f fVar) {
        this.f67446d = fVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.SettingChattingResetHelper", "Clean all messages confirmed.");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(14553, 5, 2, "");
        nVar.idkeyStat(324, 0, 1, false);
        C23519f fVar = this.f67446d;
        fVar.f67456c = false;
        fVar.f67457d = new CancellationSignal();
        C23519f fVar2 = this.f67446d;
        Context context = fVar2.f67454a;
        fVar2.f67455b = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f67446d.f67454a.getString(C0966R.string.a4d), true, true, new C23513a());
        ArrayList<String> wQ = ((C79012e) C86312j.m106911c(C79012e.class)).mo61653wQ();
        if (wQ == null || wQ.size() <= 0) {
            C23519f fVar3 = this.f67446d;
            fVar3.getClass();
            ThreadPool.post(new C23516e(fVar3), "doResetChatHistory");
            return;
        }
        this.f67446d.f67455b.dismiss();
        Context context2 = this.f67446d.f67454a;
        C76879j.m92718L(context2, false, context2.getString(C0966R.string.krd, new Object[]{Integer.valueOf(wQ.size())}), (String) null, this.f67446d.f67454a.getString(C0966R.string.fey), this.f67446d.f67454a.getString(C0966R.string.bfe), new C23514b(wQ), new C23515c(), -1, C0966R.color.f3041d1);
    }
}
