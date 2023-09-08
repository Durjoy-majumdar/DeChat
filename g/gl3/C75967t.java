package gl3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import gl3.C75922b;
import kv1.C99254i;
import lv1.C99667f;

/* renamed from: gl3.t */
public class C75967t extends C75921a {

    /* renamed from: B */
    public CharSequence f222757B;

    /* renamed from: C */
    public C75969b f222758C = new C75969b();

    /* renamed from: D */
    public C75922b.C75923a f222759D = new C75968a(this);

    /* renamed from: gl3.t$a */
    public class C75968a implements C75922b.C75923a {

        /* renamed from: a */
        public TextView f222760a;

        public C75968a(C75967t tVar) {
        }
    }

    /* renamed from: gl3.t$b */
    public class C75969b implements C75922b.C75924b {
        public C75969b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C93938f0.m118693a(C75967t.this.f222757B, ((C75968a) aVar).f222760a);
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bwi, viewGroup, false);
            C75968a aVar = (C75968a) C75967t.this.f222759D;
            aVar.f222760a = (TextView) inflate.findViewById(C0966R.C0970id.f358456f71);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    public C75967t(int i) {
        super(6, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        String string = context.getString(C0966R.string.igo);
        String string2 = context.getString(C0966R.string.ign);
        String str = this.f222619p;
        this.f222757B = C99254i.m129307d(string, string2, C99667f.m130088a(str, str, false, false)).f292107a;
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f222758C;
    }
}
