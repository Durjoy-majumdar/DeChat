package xv1;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import pv1.C22019b;

/* renamed from: xv1.c */
public class C23118c extends C23134n {

    /* renamed from: r */
    public int f66412r;

    /* renamed from: s */
    public boolean f66413s;

    /* renamed from: t */
    public C23120b f66414t = new C23120b();

    /* renamed from: u */
    public C23119a f66415u = new C23119a(this);

    /* renamed from: xv1.c$a */
    public class C23119a extends C22019b.C22020a {

        /* renamed from: a */
        public TextView f66416a;

        /* renamed from: b */
        public ImageView f66417b;

        public C23119a(C23118c cVar) {
            super(cVar);
        }
    }

    /* renamed from: xv1.c$b */
    public class C23120b extends C22019b.C22021b {
        public C23120b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C23119a aVar2 = (C23119a) aVar;
            C23118c cVar = (C23118c) bVar;
            Resources resources = context.getResources();
            if (C23118c.this.f66413s) {
                C93938f0.m118694b(resources.getString(C0966R.string.iho, new Object[]{resources.getString(cVar.f66412r)}), aVar2.f66416a);
                aVar2.f66417b.setRotation(0.0f);
                return;
            }
            C93938f0.m118694b(resources.getString(C0966R.string.ihp), aVar2.f66416a);
            aVar2.f66417b.setRotation(180.0f);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ass, viewGroup, false);
            C23119a aVar = C23118c.this.f66415u;
            aVar.f66416a = (TextView) inflate.findViewById(C0966R.C0970id.h06);
            aVar.f66417b = (ImageView) inflate.findViewById(C0966R.C0970id.f358770gz3);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return false;
        }
    }

    public C23118c(int i) {
        super(i);
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f66414t;
    }
}
