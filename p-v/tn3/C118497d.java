package tn3;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import e34.C116679a;
import g34.C116918i;
import g34.C116919k;
import h34.C117065a;
import tn3.C101905a;

/* renamed from: tn3.d */
public class C118497d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f354654d;

    /* renamed from: e */
    public final /* synthetic */ C118493b f354655e;

    /* renamed from: tn3.d$a */
    public class C118498a implements Runnable {
        public C118498a() {
        }

        public void run() {
            C118497d.this.f354655e.mo183213a(C101905a.C101908c.Finished);
            C115669n.INSTANCE.idkeyStat(583, 1, 1, false);
        }
    }

    /* renamed from: tn3.d$b */
    public class C118499b implements Runnable {
        public C118499b() {
        }

        public void run() {
            C118497d.this.f354655e.mo183213a(C101905a.C101908c.Failed);
            C115669n.INSTANCE.idkeyStat(583, 4, 1, false);
        }
    }

    public C118497d(C118493b bVar, Bundle bundle) {
        this.f354655e = bVar;
        this.f354654d = bundle;
    }

    public void run() {
        C118493b bVar = this.f354655e;
        if (bVar.f354644c != null) {
            bVar.mo183216d(true);
            String string = this.f354654d.getString("oauth_verifier");
            C116918i iVar = null;
            if (string != null) {
                C116919k kVar = new C116919k(string);
                try {
                    C118493b bVar2 = this.f354655e;
                    iVar = ((C117065a) bVar2.f354642a).mo180994c(bVar2.f354644c, kVar);
                } catch (C116679a unused) {
                }
            }
            if (iVar != null) {
                C118493b bVar3 = this.f354655e;
                bVar3.f354643b = iVar;
                bVar3.mo183217e(iVar);
                new MMHandler(Looper.getMainLooper()).post(new C118498a());
                return;
            }
            new MMHandler(Looper.getMainLooper()).post(new C118499b());
        }
    }

    public String toString() {
        return super.toString() + "|onComplete";
    }
}
