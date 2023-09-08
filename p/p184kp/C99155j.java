package p184kp;

import android.util.Pair;
import cc3.C26835d;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.modelstat.ChattingOperationUitl;
import com.tencent.p014mm.plugin.messenger.foundation.C69843t;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C96762a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import di3.C86312j;
import eb0.C75569c4;
import ei3.C86522b;
import f62.C75707s0;
import fy3.C32226l;
import hp3.C87581a;
import kj2.C117407d;
import ob0.C89132b;
import p654pw.C100971c;
import rx3.C13598b0;
import te3.C64596nz3;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: kp.j */
public class C99155j extends C86301e implements C80996q {

    /* renamed from: kp.j$a */
    public class C99156a implements C87581a<Void, C89132b.C89134c<C64596nz3>> {

        /* renamed from: a */
        public final /* synthetic */ C72963f4 f290730a;

        /* renamed from: b */
        public final /* synthetic */ C32226l f290731b;

        public C99156a(C99155j jVar, C72963f4 f4Var, C32226l lVar) {
            this.f290730a = f4Var;
            this.f290731b = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C69843t.class;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            C64596nz3 nz32 = (C64596nz3) cVar.f256796d;
            if (nz32 != null && (i == 4 || (i == 0 && i2 == 0))) {
                ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96077Vq(nz32.f184598q);
            }
            C72963f4 b002 = ((C69843t) C86312j.m106911c(cls)).mo96095LE().b00(this.f290730a.getMsgId());
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                b002.mo100991d(2);
                b002.mo108745Y2(((C64596nz3) cVar.f256796d).f184595n);
                C75569c4.m90666L(b002, ((C64596nz3) cVar.f256796d).f184597p, false);
                ((C69843t) C86312j.m106911c(cls)).mo96095LE().xy0(b002.getMsgId(), b002);
                ((C100971c) C86312j.m106911c(C100971c.class)).Bh0(b002.getMsgId());
                ChattingOperationUitl.f48963f.mo21922e(b002, C40339m.m43520a(b002));
                C32226l lVar = this.f290731b;
                if (lVar == null) {
                    return null;
                }
                lVar.invoke(cVar);
                return null;
            }
            b002.mo100991d(5);
            C117407d.INSTANCE.idkeyStat(111, 34, 1, true);
            ((C69843t) C86312j.m106911c(cls)).mo96095LE().xy0(b002.getMsgId(), b002);
            Log.m105920e("LegacyAppMessageService", "send app msg failed, err=" + cVar.f256793a + "," + cVar.f256794b + ", msgId " + b002.getMsgId());
            C32226l lVar2 = this.f290731b;
            if (lVar2 == null) {
                return null;
            }
            lVar2.invoke(cVar);
            return null;
        }
    }

    public void Je0(C72963f4 f4Var, C26835d dVar, C32226l<? super C89132b.C89134c<C64596nz3>, C13598b0> lVar) {
        C89132b<C64596nz3> b = C96762a0.m124215a(f4Var, dVar).mo141225b();
        b.f256791h = true;
        b.mo9225i().mo123062e(new C99156a(this, f4Var, lVar));
    }

    /* renamed from: qE */
    public Pair<Integer, Long> mo112827qE(C68070l.C68072b bVar, String str, String str2, String str3, String str4, byte[] bArr) {
        return C72695v.m85052E(bVar, str, str2, str3, str4, bArr);
    }

    /* renamed from: y0 */
    public Pair<Integer, Long> mo112828y0(C68070l.C68072b bVar, String str, String str2, String str3, String str4, byte[] bArr, boolean z) {
        return C72695v.m85054G(bVar, str, str2, str3, str4, bArr, (String) null, "", "", z ? 1 : 0);
    }
}
