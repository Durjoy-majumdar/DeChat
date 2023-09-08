package lv1;

import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kv1.C61173o;

/* renamed from: lv1.j */
public abstract class C99678j extends C99664b {

    /* renamed from: j */
    public C76728k f292133j;

    /* renamed from: n */
    public C10656l f292134n;

    /* renamed from: o */
    public WeakReference<C61173o> f292135o;

    /* renamed from: lv1.j$a */
    public class C99679a implements Runnable {
        public C99679a() {
        }

        public void run() {
            C61173o oVar = C99678j.this.f292135o.get();
            if (oVar != null) {
                oVar.mo293H0(C99678j.this.f292134n);
            }
        }
    }

    public C99678j(C76728k kVar) {
        this.f292133j = kVar;
        this.f292135o = new WeakReference<>(kVar.f224478m);
        if (!kVar.f224481p) {
            this.f292133j.f224478m = null;
        }
    }

    /* renamed from: b */
    public boolean mo57099b() {
        C76728k kVar = this.f292133j;
        if (!Util.isNullOrNil(kVar.f224468c)) {
            try {
                kVar.f224468c = new String(kVar.f224468c.getBytes("UTF8"), "UTF8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        C10656l lVar = new C10656l(this.f292133j);
        this.f292134n = lVar;
        try {
            lVar.f32073b = this;
            mo128820i(lVar);
            this.f292134n.f32074c = 0;
            MMHandler mMHandler = this.f292133j.f224479n;
            if (mMHandler == null) {
                C61173o oVar = this.f292135o.get();
                if (oVar != null) {
                    oVar.mo293H0(this.f292134n);
                }
            } else {
                mMHandler.post(new C99679a());
            }
            return true;
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                this.f292134n.f32074c = 1;
            } else {
                this.f292134n.f32074c = -1;
            }
            throw e;
        } catch (Throwable th) {
            MMHandler mMHandler2 = this.f292133j.f224479n;
            if (mMHandler2 == null) {
                C61173o oVar2 = this.f292135o.get();
                if (oVar2 != null) {
                    oVar2.mo293H0(this.f292134n);
                }
            } else {
                mMHandler2.post(new C99679a());
            }
            throw th;
        }
    }

    /* renamed from: i */
    public void mo128820i(C10656l lVar) {
        lVar.f32075d = C99672i.m130094a(this.f292133j.f224468c, false);
        lVar.f32074c = -5;
    }
}
