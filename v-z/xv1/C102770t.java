package xv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import kg3.C76577a;
import kv1.C99260q;
import lv1.C99681n;
import pv1.C22019b;
import xv1.C102758m;

/* renamed from: xv1.t */
public class C102770t extends C102758m {

    /* renamed from: x */
    public C99681n f303460x;

    /* renamed from: y */
    public int f303461y;

    /* renamed from: z */
    public C102771a f303462z = new C102771a();

    /* renamed from: xv1.t$a */
    public class C102771a extends C102758m.C102760b {
        public C102771a() {
            super();
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqy, viewGroup, false);
            C102758m.C102759a aVar = C102770t.this.f303433w;
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

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return ((C99260q) C86312j.m106911c(C99260q.class)).au0(C102770t.this.f62323a).mo91604d(context, view, bVar, objArr);
        }
    }

    public C102770t(int i) {
        super(i);
    }

    /* renamed from: f */
    public int mo35134f() {
        return this.f303427q < 2 ? 0 : 2;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303462z;
    }
}
