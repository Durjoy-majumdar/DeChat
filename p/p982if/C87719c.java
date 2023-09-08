package p982if;

import android.os.Build;
import com.tencent.matrix.resource.C80530h;
import com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p269xe.C91185g;
import p276y9.C26632h;
import p276y9.C26635k;
import p408af.C79522a;
import p423ye.C26638a;
import p425ze.C26657c;
import p425ze.C26698d;
import p425ze.C26703g;
import p425ze.C91669a;
import p723vf.C118672d;
import p761yd.C91441c;
import p937cf.C80018a;
import p955df.C86263c;
import p987jf.C87954a;

/* renamed from: if.c */
public abstract class C87719c {

    /* renamed from: d */
    public static volatile boolean f253996d;

    /* renamed from: a */
    public final C87954a f253997a;

    /* renamed from: b */
    public C86263c f253998b;

    /* renamed from: c */
    public C86263c.C86264a f253999c;

    public C87719c(C87954a aVar) {
        this.f253997a = aVar;
    }

    /* renamed from: a */
    public C91669a mo122137a(File file, String str) {
        C91669a aVar;
        f253996d = true;
        String str2 = ((C80530h) C91441c.m114730d().mo125377a(C80530h.class)).f235548h.f234434d;
        int i = Build.VERSION.SDK_INT;
        EnumSet<E> allOf = EnumSet.allOf(C26657c.class);
        C26698d.C26699b bVar = new C26698d.C26699b();
        Iterator<E> it = allOf.iterator();
        while (it.hasNext()) {
            C26657c cVar = (C26657c) it.next();
            if (cVar.mo53694a(i, str2)) {
                cVar.mo53695b(bVar);
                bVar.f74238e.f74239a = cVar.name();
            }
        }
        C26698d dVar = new C26698d(bVar);
        try {
            C26703g gVar = new C26703g(file);
            C26638a aVar2 = new C26638a(str, dVar);
            long nanoTime = System.nanoTime();
            try {
                C26635k kVar = gVar.f74244a;
                C26632h b = aVar2.mo53646b(str, kVar);
                aVar = b == null ? C91669a.m115209b(C79522a.m96544a(nanoTime)) : aVar2.mo53645a(nanoTime, kVar, b);
            } catch (Throwable th) {
                aVar = C91669a.m115208a(th, C79522a.m96544a(nanoTime));
            }
        } catch (IOException e) {
            aVar = C91669a.m115208a(e, 0);
        }
        this.f253997a.mo122416c();
        f253996d = false;
        return aVar;
    }

    /* renamed from: b */
    public abstract boolean mo112104b(DestroyedActivityInfo destroyedActivityInfo);

    /* renamed from: c */
    public final void mo122138c(int i, C80018a.C80020b bVar, String str, String str2, String str3, String str4) {
        mo122139d(i, bVar, str, str2, str3, str4, 0, (String) null);
    }

    /* renamed from: d */
    public final void mo122139d(int i, C80018a.C80020b bVar, String str, String str2, String str3, String str4, int i2, String str5) {
        C91185g gVar = new C91185g(i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dump_mode", bVar.name());
            jSONObject.put(EnvConsts.ACTIVITY_MANAGER_SRVNAME, str);
            jSONObject.put("ref_key", str2);
            jSONObject.put("leak_detail", str3);
            jSONObject.put("cost_millis", str4);
            jSONObject.put("retry_count", i2);
            jSONObject.put("hprof_path", str5);
        } catch (JSONException e) {
            C118672d.m167354d("Matrix.LeakProcessor.Base", e, "", new Object[0]);
        }
        gVar.f261446d = jSONObject;
        this.f253997a.f254526g.onDetectIssue(gVar);
    }
}
