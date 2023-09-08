package xv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C56782d;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kg3.C76577a;
import kv1.C99251g;
import p196ln.C76705f;
import p629ny.C76979h;
import pv1.C22019b;
import xv1.C102758m;

/* renamed from: xv1.g */
public class C102753g extends C102758m {

    /* renamed from: x */
    public C102754a f303411x = new C102754a();

    /* renamed from: y */
    public CharSequence f303412y;

    /* renamed from: xv1.g$a */
    public class C102754a extends C102758m.C102760b {
        public C102754a() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            Class cls = C76705f.class;
            C102753g gVar = (C102753g) bVar;
            C102758m.C102759a aVar2 = (C102758m.C102759a) aVar;
            C93938f0.m118699g(aVar2.f303434a, C102753g.this.f62326d);
            if (Util.isNullOrNil(gVar.f303426p.f292153g)) {
                ((C76705f) C86312j.m106911c(cls)).mo106849z(aVar2.f303435b, gVar.f303426p.f292151e);
            } else {
                ((C76705f) C86312j.m106911c(cls)).mo106849z(aVar2.f303435b, gVar.f303426p.f292153g);
            }
            C93938f0.m118693a(gVar.f303412y, aVar2.f303436c);
            C93938f0.m118693a(gVar.f303430t, aVar2.f303437d);
            C93938f0.m118693a(gVar.f303431u, aVar2.f303438e);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqy, viewGroup, false);
            C102758m.C102759a aVar = C102753g.this.f303433w;
            aVar.f303435b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f303436c = (TextView) inflate.findViewById(C0966R.C0970id.hg4);
            aVar.f303437d = (TextView) inflate.findViewById(C0966R.C0970id.h2q);
            aVar.f303434a = inflate.findViewById(C0966R.C0970id.c7p);
            aVar.f303438e = (TextView) inflate.findViewById(C0966R.C0970id.kky);
            aVar.f303435b.getLayoutParams().width = C76577a.m92157h(context, C0966R.dimen.f3946l5);
            aVar.f303435b.getLayoutParams().height = C76577a.m92157h(context, C0966R.dimen.f3946l5);
            inflate.setTag(aVar);
            return inflate;
        }
    }

    public C102753g(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        super.mo35129a(context, aVar, objArr);
        String d = C99251g.m129283d(this.f303426p.f292153g);
        if (Util.isNullOrNil(d)) {
            d = C99251g.m129283d(this.f303426p.f292151e);
        }
        this.f303412y = ((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, d, (float) C56782d.f162740d);
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303411x;
    }
}
