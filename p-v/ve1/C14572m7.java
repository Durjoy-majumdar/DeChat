package ve1;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0714b2;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import gy3.C87412m;
import jq3.C60905o;
import mo1.C11025q;
import zp3.C23555k;
import zt3.C119157j;

/* renamed from: ve1.m7 */
public final class C14572m7 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C60905o f40367a;

    /* renamed from: b */
    public final /* synthetic */ String f40368b;

    /* renamed from: c */
    public final /* synthetic */ C14588o7 f40369c;

    /* renamed from: d */
    public final /* synthetic */ String f40370d;

    /* renamed from: e */
    public final /* synthetic */ C0714b2 f40371e;

    /* renamed from: ve1.m7$a */
    public static final class C14573a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40372d;

        /* renamed from: e */
        public final /* synthetic */ String f40373e;

        /* renamed from: f */
        public final /* synthetic */ C14588o7 f40374f;

        /* renamed from: g */
        public final /* synthetic */ String f40375g;

        public C14573a(C60905o oVar, String str, C14588o7 o7Var, String str2) {
            this.f40372d = oVar;
            this.f40373e = str;
            this.f40374f = o7Var;
            this.f40375g = str2;
        }

        public final void run() {
            Class cls = C11025q.class;
            C39818r rVar = C39818r.f106831a;
            Context context = this.f40372d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C11025q qVar = (C11025q) rVar.mo62443b(context).mo75002a(cls);
            String str = this.f40373e;
            C14588o7 o7Var = this.f40374f;
            Context context2 = this.f40372d.f173499A;
            C87412m.m108593f(context2, "holder.context");
            o7Var.getClass();
            qVar.mo11182j3("music_card", 0, str, context2 instanceof FinderProfileUI ? ((FinderProfileUI) context2).mo2194I7() : 0, this.f40375g);
            Context context3 = this.f40372d.f173499A;
            C87412m.m108593f(context3, "holder.context");
            C39622i0 a = rVar.mo62443b(context3).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(holder.co…rofileEduUIC::class.java)");
            C11025q qVar2 = (C11025q) a;
            String str2 = this.f40373e;
            C14588o7 o7Var2 = this.f40374f;
            Context context4 = this.f40372d.f173499A;
            C87412m.m108593f(context4, "holder.context");
            o7Var2.getClass();
            C11025q.m10965k3(qVar2, "music_play", 0, str2, context4 instanceof FinderProfileUI ? ((FinderProfileUI) context4).mo2194I7() : 0, (String) null, 16, (Object) null);
        }
    }

    public C14572m7(C60905o oVar, String str, C14588o7 o7Var, String str2, C0714b2 b2Var) {
        this.f40367a = oVar;
        this.f40368b = str;
        this.f40369c = o7Var;
        this.f40370d = str2;
        this.f40371e = b2Var;
    }

    /* renamed from: a */
    public long mo52a(View view) {
        C87412m.m108594g(view, "view");
        return this.f40371e.mo3513o().getFinderObject().f164794id;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            ((C119157j) C119157j.f356862d).mo183875f(new C14573a(this.f40367a, this.f40368b, this.f40369c, this.f40370d));
        }
    }
}
