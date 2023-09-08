package xf0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CloseAAUrgeNotifyEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import ob0.C89132b;
import p910lj.C76701a;
import te3.C48931c;
import yf0.C79104i;

/* renamed from: xf0.e */
public class C53322e implements C87581a<Void, C89132b.C89134c<C48931c>> {

    /* renamed from: a */
    public final /* synthetic */ CloseAAUrgeNotifyEvent f148925a;

    public C53322e(C53323f fVar, CloseAAUrgeNotifyEvent closeAAUrgeNotifyEvent) {
        this.f148925a = closeAAUrgeNotifyEvent;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("CloseAAUrgeNotifyEventIListener", "close aa urge notify cgiback, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Log.m105924i("CloseAAUrgeNotifyEventIListener", "close aa urge notify success");
            C48931c cVar2 = (C48931c) cVar.f256796d;
            if (cVar2.f131414d > 0 && !Util.isNullOrNil(cVar2.f131415e)) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) ((C48931c) cVar.f256796d).f131415e, 0).show();
                C115669n.INSTANCE.idkeyStat(407, 29, 1, false);
                return null;
            } else if (((C48931c) cVar.f256796d).f131414d == 0) {
                C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.bfi, 0).show();
                C115669n.INSTANCE.idkeyStat(407, 27, 1, false);
                if (Util.isNullOrNil(((C48931c) cVar.f256796d).f131416f)) {
                    return null;
                }
                C79104i.m95675t(this.f148925a.f107414d.f107417c, ((C48931c) cVar.f256796d).f131416f);
                return null;
            } else {
                Log.m105924i("CloseAAUrgeNotifyEventIListener", "illegal resp");
                C115669n.INSTANCE.idkeyStat(407, 29, 1, false);
                return null;
            }
        } else {
            Log.m105924i("CloseAAUrgeNotifyEventIListener", "close aa urge notify failed");
            C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.bfh, 1).show();
            C115669n.INSTANCE.idkeyStat(407, 28, 1, false);
            return null;
        }
    }
}
