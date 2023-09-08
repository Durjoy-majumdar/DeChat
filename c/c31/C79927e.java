package c31;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.crashfix.patch.killself.KillSelfMonitor;
import com.tencent.p014mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.sdk.platformtools.Log;
import d31.C86169a;
import di3.C86301e;
import e31.C58526a;
import ei3.C86522b;
import f31.C86706a;
import f81.C7998c;
import g31.C87130d;
import h31.C32696a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C86522b(dependencies = {C85597u.class, C7998c.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI})
/* renamed from: c31.e */
public class C79927e extends C86301e {

    /* renamed from: d */
    public List<C79925c> f234150d;

    public void onCreate(Context context) {
        Log.m105924i("MicroMsg.SystemCrashFixPatch", "api level :" + Build.VERSION.SDK_INT);
        Handler handler = new Handler(Looper.myLooper());
        if (this.f234150d == null) {
            ArrayList arrayList = new ArrayList();
            this.f234150d = arrayList;
            arrayList.add(new C87130d());
            ((ArrayList) this.f234150d).add(new C32696a());
            ((ArrayList) this.f234150d).add(new C86169a());
            ((ArrayList) this.f234150d).add(new KillSelfMonitor());
            ((ArrayList) this.f234150d).add(new PhoneStateOverflow());
            ((ArrayList) this.f234150d).add(new C86706a());
            ((ArrayList) this.f234150d).add(new C58526a());
        }
        Iterator it = ((ArrayList) this.f234150d).iterator();
        while (it.hasNext()) {
            C79925c cVar = (C79925c) it.next();
            if (cVar.mo58760a(Build.VERSION.SDK_INT)) {
                if (cVar instanceof C79924b) {
                    C79924b bVar = (C79924b) cVar;
                    handler.postDelayed(new C79926d(this, bVar, cVar), bVar.mo58764e());
                } else {
                    boolean d = cVar.mo58763d();
                    Log.m105924i("MicroMsg.SystemCrashFixPatch", cVar.getClass().getCanonicalName() + " : " + d);
                }
            }
        }
    }
}
