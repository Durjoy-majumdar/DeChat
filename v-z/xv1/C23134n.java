package xv1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import kv1.C99251g;
import pv1.C22019b;

/* renamed from: xv1.n */
public class C23134n extends C22019b {

    /* renamed from: p */
    public String f66449p;

    /* renamed from: q */
    public C23136b f66450q = new C23136b();

    /* renamed from: xv1.n$a */
    public class C23135a extends C22019b.C22020a {

        /* renamed from: a */
        public View f66451a;

        /* renamed from: b */
        public TextView f66452b;

        public C23135a(C23134n nVar) {
            super(nVar);
        }
    }

    /* renamed from: xv1.n$b */
    public class C23136b extends C22019b.C22021b {
        public C23136b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C23135a aVar2 = (C23135a) aVar;
            C93938f0.m118698f(aVar2.f66451a, C23134n.this.f62326d);
            aVar2.f66452b.setText(((C23134n) bVar).f66449p);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqz, viewGroup, false);
            C23135a aVar = new C23135a(C23134n.this);
            aVar.f66452b = (TextView) inflate.findViewById(C0966R.C0970id.kms);
            aVar.f66451a = inflate.findViewById(C0966R.C0970id.f359139j63);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            Intent intent = new Intent();
            intent.putExtra("detail_query", C23134n.this.mo35139k());
            intent.putExtra("detail_type", C23134n.this.f62329g);
            intent.putExtra("Search_Scene", C23134n.this.f62330h);
            C99251g.m129295p(context, ".ui.FTSDetailUI", intent);
            return true;
        }
    }

    public C23134n(int i) {
        super(8, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        String d = C93938f0.m118696d(this.f62329g);
        if (d == null) {
            this.f66449p = "";
        } else {
            this.f66449p = context.getResources().getString(C0966R.string.igi, new Object[]{d});
        }
        Log.m105925i("MicroMsg.FTS.FTSMoreDataItem", "fillDataItem: tip=%s", this.f66449p);
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f66450q;
    }
}
