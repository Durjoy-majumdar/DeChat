package df2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import ke3.C88144b;

/* renamed from: df2.m */
public class C75395m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75381g f221652d;

    public C75395m(C75381g gVar) {
        this.f221652d = gVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14553, 2, 4, this.f221652d.f221634e.getUsername());
        this.f221652d.f221637h = true;
        Intent intent = new Intent();
        intent.putExtra("Chat_User", this.f221652d.f221634e.getUsername());
        intent.addFlags(67108864);
        C88144b.m109801s(this.f221652d.f221633d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
    }
}
