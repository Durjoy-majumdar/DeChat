package ny2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.wechat.aff.ting.TingClientProto;
import di0.C86299o;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import kr0.C76630x0;
import ky2.C10428a;
import ky2.C10434j;
import rx3.C13598b0;
import t90.C13867d;

/* renamed from: ny2.a */
public final class C11306a extends C10434j {

    /* renamed from: ny2.a$a */
    public static final class C11307a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C68070l.C68072b f33251d;

        /* renamed from: e */
        public final /* synthetic */ Context f33252e;

        public C11307a(C68070l.C68072b bVar, Context context) {
            this.f33251d = bVar;
            this.f33252e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/AppBrandAuthorizationFiller$onFill$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f33251d == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/AppBrandAuthorizationFiller$onFill$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Context context = this.f33252e;
            C86299o oVar = new C86299o();
            C68070l.C68072b bVar = this.f33251d;
            oVar.f250929a = bVar.f195573f2;
            oVar.f250939k = TingClientProto.TingScene.TingScene_BrandProfile_VALUE;
            oVar.f250932d = bVar.f195467A2;
            C13598b0 b0Var = C13598b0.f38549a;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/AppBrandAuthorizationFiller$onFill$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d */
    public String mo10175d(Context context) {
        C87412m.m108594g(context, "context");
        String string = context.getString(C0966R.string.a4n);
        C87412m.m108593f(string, "context.getString(com.te…string.appbrand_app_name)");
        return string;
    }

    /* renamed from: q */
    public void mo10176q(Context context, C10428a.C10430b bVar, C10428a.C10429a aVar) {
        Map<String, String> parseXml;
        String str;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "state");
        if (aVar != null && (parseXml = XmlParser.parseXml(((C13867d) aVar.f31647a.mo93555w(C13867d.class)).f39033e, "content", (String) null)) != null && (str = parseXml.get(".content")) != null) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(str, (String) null);
            boolean a = aVar.mo10733a();
            boolean z = a || bVar == C10428a.C10430b.AUTHORIZED;
            if (u != null) {
                aVar.f31658l.setText(u.f195570f);
                C20828a b = C20828a.m22825b();
                String str2 = u.f195646y;
                ImageView imageView = aVar.f31656j;
                C20937c.C20939b bVar2 = new C20937c.C20939b();
                bVar2.f59364t = true;
                bVar2.f59361q = C0966R.C0969drawable.bok;
                C13598b0 b0Var = C13598b0.f38549a;
                b.mo32519h(str2, imageView, bVar2.mo32666a());
            }
            if (a) {
                aVar.f31659m.setVisibility(0);
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    aVar.f31654h.setText(context.getString(C0966R.string.jvz));
                } else if (ordinal == 1) {
                    aVar.f31654h.setText(context.getString(C0966R.string.f361434jw0));
                } else if (ordinal == 2) {
                    aVar.f31654h.setText(context.getString(C0966R.string.jvy));
                } else if (ordinal == 3) {
                    aVar.f31654h.setText(context.getString(C0966R.string.jvx));
                }
            } else {
                aVar.f31659m.setVisibility(8);
                int ordinal2 = bVar.ordinal();
                if (ordinal2 == 0) {
                    aVar.f31654h.setText(context.getString(C0966R.string.f361437jw3));
                } else if (ordinal2 == 1) {
                    aVar.f31654h.setText(context.getString(C0966R.string.jw4));
                } else if (ordinal2 == 2) {
                    aVar.f31659m.setVisibility(0);
                    aVar.f31654h.setText(context.getString(C0966R.string.f361436jw2));
                } else if (ordinal2 == 3) {
                    aVar.f31654h.setText(context.getString(C0966R.string.f361435jw1));
                }
            }
            if (z) {
                aVar.f31655i.setOnClickListener(new C11307a(u, context));
            } else {
                aVar.f31655i.setOnClickListener((View.OnClickListener) null);
            }
        }
    }
}
