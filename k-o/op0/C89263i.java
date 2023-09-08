package op0;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.pointers.PBool;
import gt0.C87327c0;
import gt0.C87370k0;
import js0.C9514m;
import op0.C89251a;
import p210o.C11323a;

/* renamed from: op0.i */
public class C89263i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PBool f257162d;

    /* renamed from: e */
    public final /* synthetic */ C9514m f257163e;

    /* renamed from: f */
    public final /* synthetic */ C9514m f257164f;

    /* renamed from: g */
    public final /* synthetic */ C89269l f257165g;

    /* renamed from: op0.i$a */
    public class C89264a implements DialogInterface.OnCancelListener {
        public C89264a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
            C89263i iVar = C89263i.this;
            C89269l.m111568e(iVar.f257165g, ((ModulePkgInfo) iVar.f257163e.f29691a).name, C89251a.C89255d.CANCEL);
        }
    }

    /* renamed from: op0.i$b */
    public class C89265b implements C11323a<Context, C87370k0.C87371a> {
        public C89265b() {
        }

        public Object apply(Object obj) {
            Context context = (Context) obj;
            Context R = C89263i.this.f257165g.f257182c.mo113026R();
            if (R == null) {
                R = C89263i.this.f257165g.f257182c.f238141d;
            }
            C87327c0 c0Var = new C87327c0(R);
            c0Var.setMessage(R.getString(C0966R.string.gk9));
            return c0Var;
        }
    }

    public C89263i(C89269l lVar, PBool pBool, C9514m mVar, C9514m mVar2) {
        this.f257165g = lVar;
        this.f257162d = pBool;
        this.f257163e = mVar;
        this.f257164f = mVar2;
    }

    public void run() {
        if (!this.f257162d.value) {
            T cVar = new C89256c();
            C89264a aVar = new C89264a();
            cVar.f257153g = aVar;
            C87370k0.C87371a aVar2 = cVar.f257152f;
            if (aVar2 != null) {
                aVar2.setOnCancelListener(aVar);
            }
            cVar.f257150d = new C89265b();
            cVar.mo123573a(this.f257165g.f257182c);
            this.f257164f.f29691a = cVar;
        }
    }
}
