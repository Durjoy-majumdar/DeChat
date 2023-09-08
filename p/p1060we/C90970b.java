package p1060we;

import android.app.Application;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p1012ne.C88932a;
import p269xe.C91185g;
import p269xe.C91186h;
import p723vf.C118672d;
import p723vf.C90779e;

/* renamed from: we.b */
public abstract class C90970b implements C91186h.C91187a, C88932a {

    /* renamed from: d */
    public C90971c f261036d;

    /* renamed from: e */
    public Application f261037e;

    /* renamed from: f */
    public boolean f261038f = true;

    /* renamed from: g */
    public int f261039g = 0;

    /* renamed from: a */
    public void mo112097a(boolean z) {
    }

    /* renamed from: b */
    public String mo112098b() {
        return getClass().getName();
    }

    /* renamed from: c */
    public void mo112099c(Application application, C90971c cVar) {
        if (this.f261037e == null && this.f261036d == null) {
            this.f261039g = 1;
            this.f261037e = application;
            this.f261036d = cVar;
            cVar.mo110076b(this);
            ProcessUILifecycleOwner.f235399x.getClass();
            HashSet<C88932a> hashSet = ProcessUILifecycleOwner.f235395t;
            synchronized (hashSet) {
                hashSet.add(this);
            }
            return;
        }
        throw new RuntimeException("plugin duplicate init, application or plugin listener is not null");
    }

    /* renamed from: d */
    public void mo112100d() {
        int i = this.f261039g;
        boolean z = true;
        if (!(i == 8)) {
            if (i != 2) {
                z = false;
            }
            if (!z) {
                this.f261039g = 2;
                C90971c cVar = this.f261036d;
                if (cVar != null) {
                    cVar.mo110077c(this);
                    return;
                }
                throw new RuntimeException("plugin start, plugin listener is null");
            }
            throw new RuntimeException("plugin start, but plugin has been already started");
        }
        throw new RuntimeException("plugin start, but plugin has been already destroyed");
    }

    public void onDetectIssue(C91185g gVar) {
        if (gVar.f261444b == null) {
            gVar.f261444b = mo112098b();
        }
        gVar.f261447e = this;
        JSONObject jSONObject = gVar.f261446d;
        try {
            String str = gVar.f261444b;
            if (str != null) {
                jSONObject.put("tag", str);
            }
            int i = gVar.f261443a;
            if (i != 0) {
                jSONObject.put("type", i);
            }
            jSONObject.put("process", C90779e.m113846a(this.f261037e));
            jSONObject.put("time", System.currentTimeMillis());
        } catch (JSONException e) {
            C118672d.m167352b("Matrix.Plugin", "json error", e);
        }
        this.f261036d.mo110075a(gVar);
    }
}
