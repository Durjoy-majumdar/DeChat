package xv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import kv1.C99254i;
import lv1.C99667f;
import pv1.C22019b;

/* renamed from: xv1.a */
public class C23115a extends C22019b {

    /* renamed from: p */
    public CharSequence f66406p;

    /* renamed from: q */
    public C23117b f66407q = new C23117b();

    /* renamed from: xv1.a$a */
    public class C23116a extends C22019b.C22020a {

        /* renamed from: a */
        public View f66408a;

        /* renamed from: b */
        public ImageView f66409b;

        /* renamed from: c */
        public TextView f66410c;

        public C23116a(C23115a aVar) {
            super(aVar);
        }
    }

    /* renamed from: xv1.a$b */
    public class C23117b extends C22019b.C22021b {
        public C23117b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C23116a aVar2 = (C23116a) aVar;
            C23115a aVar3 = (C23115a) bVar;
            C93938f0.m118698f(aVar2.f66408a, C23115a.this.f62326d);
            C93938f0.m118693a(C23115a.this.f66406p, aVar2.f66410c);
            aVar2.f66409b.setImageResource(C0966R.raw.search_add_icon_green);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.atm, viewGroup, false);
            C23116a aVar = new C23116a(C23115a.this);
            aVar.f66409b = (ImageView) inflate.findViewById(C0966R.C0970id.f2a);
            aVar.f66410c = (TextView) inflate.findViewById(C0966R.C0970id.kms);
            aVar.f66408a = inflate.findViewById(C0966R.C0970id.f359139j63);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return false;
        }
    }

    public C23115a(int i) {
        super(7, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        this.f66406p = C99254i.m129307d(context.getResources().getString(C0966R.string.f2l), "", C99667f.m130088a(mo35139k(), mo35139k(), false, false)).f292107a;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f66407q;
    }
}
