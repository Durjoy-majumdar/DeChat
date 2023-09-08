package ve1;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0714b2;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import mo1.C11025q;
import mo1.C11057v;
import o40.C61926c;
import te3.C64719t23;
import te3.C64726td1;
import up1.C65417k0;

/* renamed from: ve1.l7 */
public final class C14564l7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64726td1 f40353d;

    /* renamed from: e */
    public final /* synthetic */ C0714b2 f40354e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f40355f;

    /* renamed from: g */
    public final /* synthetic */ C14588o7 f40356g;

    /* renamed from: h */
    public final /* synthetic */ C8479f0<String> f40357h;

    public C14564l7(C64726td1 td12, C0714b2 b2Var, C60905o oVar, C14588o7 o7Var, C8479f0<String> f0Var) {
        this.f40353d = td12;
        this.f40354e = b2Var;
        this.f40355f = oVar;
        this.f40356g = o7Var;
        this.f40357h = f0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileQQMusicConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64726td1 td12 = this.f40353d;
        if (td12 != null) {
            C0714b2 b2Var = this.f40354e;
            C60905o oVar = this.f40355f;
            C14588o7 o7Var = this.f40356g;
            C8479f0<String> f0Var = this.f40357h;
            String p = C61926c.m72691p(b2Var.mo3513o().getFinderObject().f164794id);
            C64719t23 t232 = new C64719t23();
            t232.f185459d = p;
            t232.f185460e = b2Var.mo3513o().getFinderObject().objectNonceId;
            t232.f185461f = (String) f0Var.f27484d;
            FinderContact finderContact = b2Var.mo3513o().getFinderObject().contact;
            t232.f185462g = finderContact != null ? finderContact.nickname : null;
            t232.f185463h = td12.f185537g;
            t232.f185464i = td12.f185538h;
            t232.f185469q = td12.f185543p;
            t232.f185473u = td12.f185536f;
            t232.f185475w = td12.f185535e;
            t232.f185472t = (String) f0Var.f27484d;
            String str = td12.f185534d;
            if (str == null) {
                str = "";
            }
            t232.f185470r = str;
            t232.f185474v = td12.f185548u;
            t232.f185468p = td12.f185549v;
            t232.f185465j = td12.f185550w;
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            ((C11057v) rVar.mo62443b(context).mo75002a(C11057v.class)).mo11197c3();
            C65417k0.f188264a.mo89512c(td12, p, 0, t232);
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C39622i0 a = rVar.mo62443b(context2).mo75002a(C11025q.class);
            C87412m.m108593f(a, "UICProvider.of(holder.co…rofileEduUIC::class.java)");
            C11025q qVar = (C11025q) a;
            Context context3 = oVar.f173499A;
            C87412m.m108593f(context3, "holder.context");
            o7Var.getClass();
            C11025q.m10965k3(qVar, "music_play", 1, p, context3 instanceof FinderProfileUI ? ((FinderProfileUI) context3).mo2194I7() : 0, (String) null, 16, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileQQMusicConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
