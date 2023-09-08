package xv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import lv1.C99681n;
import p196ln.C76705f;
import pv1.C22019b;

/* renamed from: xv1.b */
public abstract class C78991b extends C22019b {

    /* renamed from: p */
    public C99681n f231943p;

    /* renamed from: q */
    public C72996z1 f231944q;

    /* renamed from: r */
    public String f231945r;

    /* renamed from: s */
    public CharSequence f231946s;

    /* renamed from: t */
    public CharSequence f231947t;

    /* renamed from: u */
    public String f231948u;

    /* renamed from: v */
    public C78992a f231949v = new C78992a(this);

    /* renamed from: xv1.b$a */
    public class C78992a extends C22019b.C22020a {

        /* renamed from: a */
        public View f231950a;

        /* renamed from: b */
        public ImageView f231951b;

        /* renamed from: c */
        public TextView f231952c;

        /* renamed from: d */
        public TextView f231953d;

        /* renamed from: e */
        public TextView f231954e;

        public C78992a(C78991b bVar) {
            super(bVar);
        }
    }

    /* renamed from: xv1.b$b */
    public abstract class C78993b extends C22019b.C22021b {
        public C78993b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C78992a aVar2 = (C78992a) aVar;
            C78991b bVar2 = (C78991b) bVar;
            C93938f0.m118699g(aVar2.f231950a, C78991b.this.f62326d);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar2.f231951b, bVar2.f231945r);
            C93938f0.m118693a(bVar2.f231946s, aVar2.f231952c);
            C93938f0.m118693a(bVar2.f231947t, aVar2.f231953d);
            C93938f0.m118694b(bVar2.f231948u, aVar2.f231954e);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqs, viewGroup, false);
            C78992a aVar = C78991b.this.f231949v;
            aVar.f231951b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f231952c = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f231953d = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f231954e = (TextView) inflate.findViewById(C0966R.C0970id.fac);
            aVar.f231950a = inflate.findViewById(C0966R.C0970id.c7p);
            inflate.setTag(aVar);
            return inflate;
        }
    }

    public C78991b(int i) {
        super(1, i);
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f231943p.f292164r;
    }
}
