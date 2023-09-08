package fd3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lc3.C10485b;
import te3.C101870ya3;

/* renamed from: fd3.a */
public class C97858a extends C97859b implements C97874l {

    /* renamed from: n */
    public int f287030n;

    /* renamed from: o */
    public int f287031o;

    /* renamed from: p */
    public C97872k f287032p;

    /* renamed from: q */
    public boolean f287033q;

    /* renamed from: r */
    public String f287034r;

    /* renamed from: s */
    public List<C97870j> f287035s;

    /* renamed from: t */
    public List<C97870j> f287036t;

    /* renamed from: u */
    public int f287037u;

    /* renamed from: v */
    public int f287038v;

    /* renamed from: w */
    public int f287039w = 0;

    public C97858a(C97872k kVar) {
        this.f287032p = kVar;
        int i = 32768;
        try {
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ParallelUploadPartSize");
            if (Util.isNullOrNil(c)) {
                Log.m105924i("MicroMsg.CGIFileUploader", "getFileSizeLimit nullOrNil");
            } else {
                Log.m105924i("MicroMsg.CGIFileUploader", "getFileSizeLimit " + c);
            }
            i = Util.getInt(c, 32768);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.CGIFileUploader", th, "getFileSizeLimit", new Object[0]);
        }
        this.f287031o = i;
        this.f287030n = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_cgi_upload_concurrent_max_android, 10);
        this.f287035s = Collections.synchronizedList(new ArrayList());
        this.f287036t = Collections.synchronizedList(new ArrayList());
    }

    /* renamed from: a */
    public void mo137183a(C97870j jVar, boolean z, int i) {
        Log.m105921e("MicroMsg.CGIFileUploader", "upload section failure, index = %s, canRetry:%s, retCode:%s", Integer.valueOf(jVar.f287102e.f287095b), Boolean.valueOf(z), Integer.valueOf(i));
        this.f287035s.remove(jVar);
        if (z) {
            jVar.f287099b++;
            int i2 = jVar.f287102e.f287095b;
            if (i2 == 0) {
                this.f287036t.add(0, jVar);
                mo137187e();
            } else if (i2 == this.f287037u - 1) {
                this.f287036t.add(jVar);
                mo137187e();
            } else {
                this.f287036t.add(0, jVar);
                mo137186d(this.f287038v);
            }
        } else {
            mo137185c();
            C97872k kVar = this.f287032p;
            if (kVar != null) {
                ((C97860d) kVar).mo137193f(this, this.f287034r, i);
            }
        }
    }

    /* renamed from: b */
    public void mo137184b() {
        if (this.f287033q) {
            Log.m105918d("MicroMsg.CGIFileUploader", "uploader is already running");
        } else if (!C86013q1.m106450k(this.f287040a)) {
            Log.m105921e("MicroMsg.CGIFileUploader", "file %s not exist", this.f287040a);
            C97872k kVar = this.f287032p;
            if (kVar != null) {
                ((C97860d) kVar).mo137193f(this, this.f287034r, -30001);
            }
        } else {
            long j = this.f287041b;
            int i = 0;
            int i2 = 0;
            while (true) {
                C97869i iVar = new C97869i();
                iVar.f287094a = this.f287040a;
                iVar.f287095b = i;
                iVar.f287096c = i2;
                int i3 = this.f287031o;
                int i4 = i2 + i3;
                int i5 = (((long) i4) > j ? 1 : (((long) i4) == j ? 0 : -1));
                if (i5 > 0) {
                    iVar.f287097d = (int) (j - ((long) i2));
                } else {
                    iVar.f287097d = i3;
                }
                C97870j jVar = new C97870j();
                jVar.f287106i = this;
                jVar.f287102e = iVar;
                jVar.f287098a = iVar.f287095b;
                jVar.f287099b = 0;
                jVar.f287104g = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_parallel_cgi_upload_retry_max_android, 3);
                if (i == 0) {
                    this.f287051l = C86013q1.m106456q(this.f287040a);
                    C101870ya3 ya32 = new C101870ya3();
                    ya32.f299920d = this.f287042c;
                    ya32.f299921e = this.f287043d;
                    ya32.f299922f = (int) this.f287041b;
                    ya32.f299923g = this.f287051l;
                    ya32.f299924h = this.f287031o;
                    ya32.f299925i = this.f287044e;
                    ya32.f299926j = this.f287045f;
                    ya32.f299928o = this.f287046g;
                    ya32.f299929p = this.f287047h;
                    ya32.f299930q = this.f287048i;
                    ya32.f299927n = null;
                    ya32.f299931r = this.f287049j;
                    ya32.f299932s = this.f287050k;
                    if (this.f287052m) {
                        ya32.f299933t = "HDVideo:1";
                    }
                    jVar.f287101d = ya32;
                }
                this.f287036t.add(jVar);
                i++;
                if (i5 >= 0) {
                    this.f287037u = this.f287036t.size();
                    Log.m105925i("MicroMsg.CGIFileUploader", "will start upload, file = %s, scene = %s, fileType = %s, sectionLen = %s, sectionCount = %s", this.f287040a, Integer.valueOf(this.f287042c), Integer.valueOf(this.f287043d), Integer.valueOf(this.f287031o), Integer.valueOf(this.f287036t.size()));
                    this.f287033q = true;
                    mo137187e();
                    return;
                }
                i2 = i4;
            }
        }
    }

    /* renamed from: c */
    public void mo137185c() {
        this.f287033q = false;
        for (C97870j next : this.f287035s) {
            next.f287103f = false;
            next.f287105h = null;
        }
    }

    /* renamed from: d */
    public final boolean mo137186d(int i) {
        if (!this.f287033q) {
            Log.m105924i("MicroMsg.CGIFileUploader", "it means error has occurred, return.");
            return false;
        }
        while (this.f287035s.size() < this.f287030n && this.f287036t.size() > 1) {
            if (i - 1 == this.f287039w) {
                Log.m105921e("MicroMsg.CGIFileUploader", "The whole piece is uploaded, but the limit value is not updated [%s, %s]", Integer.valueOf(i), Integer.valueOf(this.f287039w + 1));
                mo137185c();
                C97872k kVar = this.f287032p;
                if (kVar != null) {
                    ((C97860d) kVar).mo137193f(this, this.f287034r, -30004);
                }
                return false;
            }
            C97870j jVar = this.f287036t.get(0);
            if (jVar.f287098a > this.f287039w) {
                Log.m105924i("MicroMsg.CGIFileUploader", "upload too fast, need to wait for the previous task to complete first");
                return true;
            }
            this.f287036t.remove(0);
            this.f287035s.add(jVar);
            jVar.mo137197a();
            Log.m105925i("MicroMsg.CGIFileUploader", "start section idx = %s", Integer.valueOf(jVar.f287102e.f287095b));
        }
        return true;
    }

    /* renamed from: e */
    public final void mo137187e() {
        if (this.f287036t.size() < 1) {
            Log.m105921e("MicroMsg.CGIFileUploader", "no section to upload, file:%s", this.f287040a);
            C97872k kVar = this.f287032p;
            if (kVar != null) {
                ((C97860d) kVar).mo137193f(this, this.f287034r, -30003);
                return;
            }
            return;
        }
        C97870j jVar = this.f287036t.get(0);
        this.f287036t.remove(0);
        this.f287035s.add(jVar);
        jVar.mo137197a();
    }
}
