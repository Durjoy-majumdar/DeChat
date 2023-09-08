package mh1;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl1.C39808w;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.finder.live.view.LiveNeat7extView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import di3.C7335d;
import di3.C86312j;
import go3.C76003c;
import gy3.C87412m;
import ht1.C60172g4;
import ht1.C98522w3;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import oa1.C117731d;
import p629ny.C76979h;
import rx3.C36570n;
import te3.C64311db1;
import te3.m74;
import tf0.C13883o1;
import tf0.C64916p1;
import tf3.C101877q;
import up1.C37521f;
import vg1.C52891f;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: mh1.e */
public final class C47030e extends C60896i<C39808w> {
    /* renamed from: j */
    public static final void m52356j(C47030e eVar, Context context, C64311db1 db12) {
        eVar.getClass();
        Class cls = C13883o1.class;
        Intent intent = new Intent();
        m74 m74 = new m74();
        m74.f184220e = db12.f182662e;
        m74.f184219d = db12.f182661d;
        intent.putExtra("key_location", m74.toByteArray());
        intent.putExtra("key_from_type", C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER);
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context);
        if (gr02 != null) {
            intent.putExtra("key_from_scene", gr02.mo12864t3());
            intent.putExtra("key_context_id", gr02.mo12866v3());
        }
        C115669n.INSTANCE.mo175912v(((C98522w3) C86312j.m106911c(C98522w3.class)).mo3991CD(), 8);
        C101877q qVar = new C101877q();
        boolean z = false;
        if (C117731d.m166007c().mo182440a(qVar) == 1 || C79758p.f233760a.mo109883f(qVar) == 1) {
            String str = db12.f182666i;
            if (str != null && C112551y.m153819s(str, "foursquare_", false)) {
                z = true;
            }
            if (!z) {
                C37521f.f99374d.getClass();
                if (C37521f.f99576z4.mo60266n().intValue() != 0) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
                    C13883o1.C13884a.m13253e((C13883o1) c, context, intent, m74, 0, 8, (Object) null);
                    return;
                }
            }
        }
        ((C13883o1) C86312j.m106911c(cls)).I00(context, intent);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cor;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        int E;
        C60905o oVar2 = oVar;
        C39808w wVar = (C39808w) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(wVar, "item");
        C52891f fVar = C52891f.f147704a;
        if (!fVar.mo73655e(oVar, wVar, i, i2, z, list)) {
            LiveNeat7extView liveNeat7extView = (LiveNeat7extView) oVar2.mo85812D(C0966R.C0970id.mao);
            C87412m.m108593f(liveNeat7extView, "contentTv");
            fVar.mo73662l(liveNeat7extView);
            Context context = oVar2.f173499A;
            C87412m.m108593f(context, "holder.context");
            String c = fVar.mo73653c(context, liveNeat7extView, wVar);
            String string = oVar2.f173499A.getString(C0966R.string.djn, new Object[]{wVar.mo62427j().f182663f});
            C87412m.m108593f(string, "holder.context.getString…city, item.location.city)");
            String content = !(wVar.getContent().length() == 0) ? wVar.getContent() : string;
            boolean b = C87412m.m108589b(content, string);
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).Te0(oVar2.f173499A, fVar.mo73651a(c, content), 0.0f));
            uVar.mo105705b((ForegroundColorSpan) ((C36570n) C52891f.f147706c).getValue(), 1, c.length() + 1, 33);
            Context context2 = oVar2.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C64311db1 j = wVar.mo62427j();
            String str = j.f182663f;
            if (!(str == null || str.length() == 0) && (E = C112550d0.m153769E(uVar, str, 0, false, 6, (Object) null)) >= 0 && str.length() + E <= uVar.length()) {
                uVar.mo105705b(new C10888c(this, context2, j), E, str.length() + E, 33);
            }
            if (b) {
                Context context3 = oVar2.f173499A;
                C87412m.m108593f(context3, "holder.context");
                C64311db1 j2 = wVar.mo62427j();
                Drawable drawable = context3.getResources().getDrawable(C0966R.raw.icons_filled_location);
                C74933u4.m89769f(drawable, context3.getResources().getColor(C0966R.color.f3418s6));
                drawable.setBounds(0, 0, ((Number) ((C36570n) C52891f.f147709f).getValue()).intValue(), C52891f.f147710g);
                uVar.mo105705b(new C76003c(drawable, 1), uVar.length() - 1, uVar.length(), 33);
                uVar.mo105705b(new C10889d(this, context3, j2), uVar.length() - 1, uVar.length(), 33);
            }
            liveNeat7extView.mo104279b(uVar);
            C52891f fVar2 = fVar;
            fVar.mo73654d(liveNeat7extView, wVar.mo62408b(), 0, 1, fVar.mo73652b(), uVar);
            fVar2.mo73663m(oVar2, wVar, (Integer) null);
            oVar2.mo85812D(C0966R.C0970id.man).setBackground(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.f5166yy));
            View D = oVar2.mo85812D(C0966R.C0970id.man);
            C87412m.m108593f(D, "holder.getView(R.id.box_comment_container)");
            fVar2.mo73660j(oVar2, false, wVar, D);
            fVar2.mo73661k(oVar2, wVar);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
