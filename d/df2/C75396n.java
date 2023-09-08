package df2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: df2.n */
public class C75396n implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f221653d;

    /* renamed from: e */
    public final /* synthetic */ C75381g f221654e;

    public C75396n(C75381g gVar, String str) {
        this.f221654e = gVar;
        this.f221653d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14553, 2, 3, this.f221654e.f221634e.getUsername());
        this.f221654e.f221638i.show();
        C75381g gVar = this.f221654e;
        gVar.f221637h = false;
        gVar.mo105722f(this.f221653d);
    }
}
