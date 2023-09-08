package xv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import di3.C86312j;
import kv1.C99254i;
import kv1.C99260q;
import lv1.C76727e;
import lv1.C99667f;
import lv1.C99681n;
import pv1.C22019b;

/* renamed from: xv1.j */
public class C102755j extends C22019b {

    /* renamed from: p */
    public C99681n f303414p;

    /* renamed from: q */
    public CharSequence f303415q;

    /* renamed from: r */
    public CharSequence f303416r;

    /* renamed from: s */
    public String f303417s;

    /* renamed from: t */
    public C76727e f303418t;

    /* renamed from: u */
    public C102757b f303419u = new C102757b();

    /* renamed from: v */
    public C102756a f303420v = new C102756a(this);

    /* renamed from: xv1.j$a */
    public class C102756a extends C22019b.C22020a {

        /* renamed from: a */
        public View f303421a;

        /* renamed from: b */
        public ImageView f303422b;

        /* renamed from: c */
        public TextView f303423c;

        /* renamed from: d */
        public TextView f303424d;

        public C102756a(C102755j jVar) {
            super(jVar);
        }
    }

    /* renamed from: xv1.j$b */
    public class C102757b extends C22019b.C22021b {
        public C102757b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C102756a aVar2 = (C102756a) aVar;
            C93938f0.m118698f(aVar2.f303421a, C102755j.this.f62326d);
            C93938f0.m118693a(C102755j.this.f303415q, aVar2.f303423c);
            C93938f0.m118693a(C102755j.this.f303416r, aVar2.f303424d);
            C93938f0.m118700h(context, aVar2.f303422b, (String) null, ((C102755j) bVar).f303417s, C0966R.raw.fts_default_img, true, 0, 0);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqs, viewGroup, false);
            C102756a aVar = C102755j.this.f303420v;
            aVar.f303422b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f303423c = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f303424d = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f303421a = inflate.findViewById(C0966R.C0970id.f359139j63);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return ((C99260q) C86312j.m106911c(C99260q.class)).au0(C102755j.this.f62323a).mo91604d(context, view, bVar, objArr);
        }
    }

    public C102755j(int i) {
        super(3, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        boolean z;
        C99681n nVar = this.f303414p;
        C76727e eVar = (C76727e) nVar.f292161o;
        this.f303418t = eVar;
        if (eVar != null) {
            String str = eVar.field_title;
            this.f303415q = str;
            String str2 = eVar.field_tag;
            this.f303416r = str2;
            this.f303417s = eVar.field_iconPath;
            String str3 = eVar.field_androidUrl;
            int i = eVar.field_actionType;
            int i2 = nVar.f292149c;
            boolean z2 = false;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        z2 = true;
                    } else if (i2 == 4) {
                        this.f303416r = C99254i.m129308e(C99667f.m130089b(str2, this.f62327e)).f292107a;
                        return;
                    } else {
                        return;
                    }
                }
                z = z2;
                z2 = true;
            } else {
                z = false;
            }
            this.f303415q = C99254i.m129308e(C99667f.m130091d(str, this.f62327e, z2, z)).f292107a;
        }
    }

    /* renamed from: d */
    public String mo35132d() {
        return this.f303418t.field_title;
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f303414p.f292164r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303419u;
    }
}
