package xk3;

import android.content.Context;
import android.view.MenuItem;
import di3.C86312j;
import f62.C7994b0;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: xk3.e */
public class C15815e implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f42609d;

    /* renamed from: e */
    public final /* synthetic */ String f42610e;

    /* renamed from: f */
    public final /* synthetic */ Context f42611f;

    /* renamed from: g */
    public final /* synthetic */ C77407n f42612g;

    /* renamed from: xk3.e$a */
    public class C15816a implements C7994b0.C7997c {
        public C15816a(C15815e eVar) {
        }

        /* renamed from: a */
        public void mo1114a(boolean z, String str, String str2) {
        }
    }

    public C15815e(C15810c cVar, String str, String str2, Context context, C77407n nVar) {
        this.f42609d = str;
        this.f42610e = str2;
        this.f42611f = context;
        this.f42612g = nVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 101) {
            C7994b0.C7996b bVar = new C7994b0.C7996b();
            bVar.f26678d = this.f42609d;
            bVar.f26684j = this.f42610e;
            bVar.f26686o = 2;
            ((C7994b0) C86312j.m106911c(C7994b0.class)).l60(this.f42611f, bVar, new C15816a(this));
            this.f42612g.mo107572p();
        }
    }
}
