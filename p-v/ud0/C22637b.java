package ud0;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import fy3.C32224a;
import qo3.C77398g;
import rd0.C22222c;
import rd0.C48018e;
import rx3.C13598b0;
import ud0.C22624a;

/* renamed from: ud0.b */
public final class C22637b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22624a.C22626b f65123d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f65124e;

    /* renamed from: f */
    public final /* synthetic */ Context f65125f;

    /* renamed from: g */
    public final /* synthetic */ SubscribeMsgRequestResult f65126g;

    public C22637b(C22624a.C22626b bVar, C32224a<C13598b0> aVar, Context context, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f65123d = bVar;
        this.f65124e = aVar;
        this.f65125f = context;
        this.f65126g = subscribeMsgRequestResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f65123d.f65088k;
        if (gVar != null) {
            gVar.dismiss();
        }
        this.f65124e.invoke();
        C22222c a = C48018e.f128802a.mo72802a("name_biz");
        if (a != null) {
            a.mo35366g(this.f65125f, 3, this.f65123d.f65080c, this.f65126g.f49002f);
        }
    }
}
