package ao1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58784w3;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C77407n;
import te3.C64284cg;
import up1.C27696y;
import zc1.C66785b;

/* renamed from: ao1.d */
public final class C0143d {

    /* renamed from: a */
    public static final C0143d f574a = new C0143d();

    /* renamed from: a */
    public final C77407n mo134a(Context context) {
        Context context2 = context;
        Class cls = C76979h.class;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        C87412m.m108594g(context2, "context");
        C77407n nVar = new C77407n(context2, 1, true);
        C58784w3 w3Var = C58784w3.f168295a;
        if (w3Var.mo83983z0()) {
            View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.apq, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.hft);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.a1p);
            C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
            if (b != null) {
                textView.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(context2, b.getNickname()));
                C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
                C62345f fVar = new C62345f(b.field_avatarUrl, (C27696y) null, 2, (C8480h) null);
                C87412m.m108593f(imageView, "avatarIv");
                C11978e0.C11979a aVar = C11978e0.C11979a.AVATAR;
                i2.mo85957c(fVar, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11867O2(aVar));
                w3Var.getClass();
                boolean z = C58960c.m68830b(b, true) != null;
                View findViewById = inflate.findViewById(C0966R.C0970id.aew);
                if (findViewById != null) {
                    int i = z ? 0 : 8;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i));
                    View view = findViewById;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderUtil", "checkPostDialogHeader", "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/utils/FinderUtil", "checkPostDialogHeader", "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.f359391ko2);
                if (textView2 != null) {
                    textView2.setText(z ? C0966R.string.eph : C0966R.string.epg);
                }
                C64284cg b2 = C58960c.m68830b(b, true);
                if (b2 != null) {
                    TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.hft);
                    if (textView3 != null) {
                        textView3.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(MMApplicationContext.getContext(), b2.f182469e));
                    }
                    ImageView imageView2 = (ImageView) inflate.findViewById(C0966R.C0970id.a1p);
                    if (imageView2 != null) {
                        C39818r rVar = C39818r.f106831a;
                        ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11872i2().mo85957c(new C62345f(b2.f182470f, (C27696y) null, 2, (C8480h) null), imageView2, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(aVar));
                    }
                }
                nVar.mo107569n(inflate, true);
            }
        }
        return nVar;
    }
}
