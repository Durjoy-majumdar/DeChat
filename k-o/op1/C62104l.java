package op1;

import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.view.View;
import c30.C104289g;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32226l;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C8777j5;
import it1.C60625c;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import ob0.C89132b;
import pp1.C62427b;
import qg1.C47835w;
import rx3.C13598b0;
import sk1.C48416t;
import te3.C50483n21;
import te3.C50770p21;
import te3.C51059r51;

/* renamed from: op1.l */
public final class C62104l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C104289g f176599d;

    /* renamed from: e */
    public final /* synthetic */ C48416t f176600e;

    /* renamed from: f */
    public final /* synthetic */ C62084h f176601f;

    /* renamed from: g */
    public final /* synthetic */ C62427b f176602g;

    /* renamed from: op1.l$a */
    public static final class C62105a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C48416t f176603a;

        /* renamed from: b */
        public final /* synthetic */ C62427b f176604b;

        /* renamed from: c */
        public final /* synthetic */ C62084h f176605c;

        public C62105a(C48416t tVar, C62427b bVar, C62084h hVar) {
            this.f176603a = tVar;
            this.f176604b = bVar;
            this.f176605c = hVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C50770p21 p212 = this.f176603a.f129597d;
                p212.f139536f = !p212.f139536f;
                this.f176604b.mo87478B(p212);
                this.f176604b.f177406H.mo78796j(this.f176603a.f129597d.f139536f, true, "after cgi", false);
                C32226l<? super Boolean, C13598b0> lVar = this.f176605c.f176545v;
                if (lVar == null) {
                    return null;
                }
                lVar.invoke(Boolean.TRUE);
                return C13598b0.f38549a;
            }
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e3q);
            C87412m.m108593f(string, "getContext().resources.g…ofile_action_fail_prefix)");
            String string2 = this.f176603a.f129597d.f139536f ? MMApplicationContext.getContext().getResources().getString(C0966R.string.e8i) : MMApplicationContext.getContext().getResources().getString(C0966R.string.e8h);
            C87412m.m108593f(string2, "if (item.data.is_promoti…                        }");
            Context context = MMApplicationContext.getContext();
            C76912y0.makeText(context, (CharSequence) string + string2, 0).show();
            StringBuilder sb = new StringBuilder();
            sb.append("[pushOrCancelPromote] id:");
            C50483n21 n212 = this.f176603a.f129597d.f139535e;
            sb.append(n212 != null ? n212.f138339d : 0);
            sb.append(",errCode:");
            sb.append(cVar.f256794b);
            Log.m105924i("Finder.LiveShoppingListAdapter", sb.toString());
            return C13598b0.f38549a;
        }
    }

    public C62104l(C104289g gVar, C48416t tVar, C62084h hVar, C62427b bVar) {
        this.f176599d = gVar;
        this.f176600e = tVar;
        this.f176601f = hVar;
        this.f176602g = bVar;
    }

    public final void onClick(View view) {
        Class cls = C55001u.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f176599d.mo145953n("type", 18);
        this.f176599d.mo145953n("click_type", this.f176600e.f129597d.f139536f ? 3 : 2);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_COMMERCE, this.f176599d.toString(), (String) null, 4, (Object) null);
        C51059r51 r512 = new C51059r51();
        C50770p21 p212 = this.f176600e.f129597d;
        C50483n21 n212 = p212.f139535e;
        r512.f140705d = n212 != null ? n212.f138339d : 0;
        r512.f140706e = 12;
        r512.f140708g = p212.f139536f;
        C47835w wVar = new C47835w(((C55001u) this.f176601f.f176533g.mo71262a(cls)).f154416j, ((C55001u) this.f176601f.f176533g.mo71262a(cls)).f154420q.f182392d, r512, 4);
        Context context = this.f176601f.f176531e;
        C60625c.m70894l(wVar, context, context.getString(C0966R.string.ett), 0, 4, (Object) null);
        wVar.mo9225i().mo123420E(new C62105a(this.f176600e, this.f176602g, this.f176601f));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
