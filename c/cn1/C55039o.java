package cn1;

import an1.C0092e;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gc0.C20828a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import hc0.C20937c;
import ht1.C60200t1;
import ic0.C98661k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import l31.C61212e;
import o40.C61926c;
import p227rn.C63484s;
import p227rn.C63485t;
import p243tn.C14050a;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import te3.C64273c21;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: cn1.o */
public class C55039o extends C60896i<C0092e> {

    /* renamed from: e */
    public static final int f154522e = C76577a.m92151b(MMApplicationContext.getContext(), 80);

    /* renamed from: f */
    public static final int f154523f = C76577a.m92151b(MMApplicationContext.getContext(), 108);

    /* renamed from: g */
    public static final Map<String, Integer> f154524g = new HashMap();

    /* renamed from: cn1.o$a */
    public static final class C55040a extends ShapeDrawable.ShaderFactory {

        /* renamed from: a */
        public final /* synthetic */ int f154525a;

        public C55040a(int i) {
            this.f154525a = i;
        }

        public Shader resize(int i, int i2) {
            float f = ((float) i) / 2.0f;
            float f2 = (float) i2;
            int i3 = this.f154525a;
            return new LinearGradient(f, 0.0f, f, f2, new int[]{0, i3, i3}, new float[]{0.0f, 0.58f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cne;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        FinderContact finderContact;
        C60905o oVar2 = oVar;
        C0092e eVar = (C0092e) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C61212e.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(eVar, "item");
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = "";
        C64689rq2 rq22 = eVar.mo3513o().isLiveFeed() ? (C64689rq2) C110818d0.m150916N(eVar.mo3513o().getLiveMediaList()) : (C64689rq2) C110818d0.m150916N(eVar.mo3513o().getMediaList());
        if (rq22 != null) {
            T t = Util.nullAsNil(rq22.f185283w) + Util.nullAsNil(rq22.f185234A);
            f0Var.f27484d = t;
            if (Util.isNullOrNil((String) t)) {
                f0Var.f27484d = rq22.f185267e + Util.nullAsNil(rq22.f185288z);
            }
        }
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.m_4);
        if (textView != null) {
            textView.setText(eVar.mo3513o().getNickName());
        }
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.m_3);
        if (imageView != null) {
            FinderObject finderObject = eVar.mo3513o().field_finderObject;
            String str = (finderObject == null || (finderContact = finderObject.contact) == null) ? null : finderContact.headUrl;
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(str, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        }
        ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.m_1);
        if (imageView2 != null) {
            C39818r rVar2 = C39818r.f106831a;
            ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0((String) f0Var.f27484d, C27696y.RAW_IMAGE), imageView2, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DARK_COMMON));
        }
        ImageView imageView3 = (ImageView) oVar2.mo85812D(C0966R.C0970id.m_2);
        if (imageView3 != null) {
            Integer num = (Integer) ((HashMap) f154524g).get(f0Var.f27484d);
            if (num != null) {
                Log.m105924i("Finder.HeadLivingConvert", "#bind nickName=" + eVar.mo3513o().getNickName() + " cache=" + num);
                mo76096j(num.intValue(), imageView3, eVar);
            } else {
                Log.m105924i("Finder.HeadLivingConvert", "#bind nickName=" + eVar.mo3513o().getNickName() + " no cache");
                Context context = oVar2.f173499A;
                C87412m.m108593f(context, "holder.context");
                int i3 = f154522e;
                int i4 = f154523f;
                C55037m mVar = new C55037m(eVar, f0Var, this, imageView3);
                Class cls4 = C63485t.class;
                String zH = ((C63484s) C86312j.m106911c(C63484s.class)).mo60498zH((String) f0Var.f27484d, 1);
                C20828a b = C20828a.m22825b();
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59361q = C0966R.C0969drawable.f4616hw;
                bVar.f59346b = true;
                bVar.f59354j = i3;
                bVar.f59355k = i4;
                bVar.f59369y = ((C63485t) C86312j.m106911c(cls4)).mo35195EL(1);
                bVar.f59370z = ((C63485t) C86312j.m106911c(cls4)).mo35194BK(1);
                bVar.f59343A = ((C63485t) C86312j.m106911c(cls4)).Zd0(1);
                bVar.f59350f = C14050a.m13405b(zH);
                b.mo32522k(zH, (ImageView) null, bVar.mo32666a(), (C98661k) null, ((C63485t) C86312j.m106911c(cls4)).mo35197zY(1, i3, i4, true, true, (float) C76577a.m92151b(context, 8), mVar));
            }
        }
        ((C61212e) C86312j.m106911c(cls3)).o30(oVar2.f44854d, "live_square_header_anchor_card");
        ((C61212e) C86312j.m106911c(cls3)).mo86175pO(oVar2.f44854d, 40, 25388);
        ((C61212e) C86312j.m106911c(cls3)).mo86175pO(oVar2.f44854d, 40, 26236);
        C61212e eVar2 = (C61212e) C86312j.m106911c(cls3);
        View view = oVar2.f44854d;
        C13604l[] lVarArr = new C13604l[5];
        lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(eVar.mo3513o().getFeedObject().f164794id));
        C64273c21 liveInfo = eVar.mo3513o().getLiveInfo();
        lVarArr[1] = new C13604l("live_id", liveInfo != null ? C61926c.m72691p(liveInfo.f182392d) : null);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context2 = oVar2.f173499A;
        C87412m.m108593f(context2, "holder.context");
        C13442s8 f = aVar.mo12873f(context2);
        lVarArr[2] = new C13604l("comment_scene", f != null ? Integer.valueOf(f.f38096i) : null);
        lVarArr[3] = new C13604l("finder_username", eVar.mo3513o().getFeedObject().username);
        C55001u uVar = (C55001u) FinderLiveService.f159376d.mo77630e(C55001u.class);
        lVarArr[4] = new C13604l("session_buffer", uVar != null ? uVar.f154424u : null);
        eVar2.mo86149PM(view, C90364q0.m113147f(lVarArr));
        ((C61212e) C86312j.m106911c(cls3)).E60(oVar2.f44854d, new C0856n(eVar, oVar2));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final void mo76096j(int i, ImageView imageView, C0092e eVar) {
        Log.m105924i("Finder.HeadLivingConvert", "#renderToBlurBg nickName=" + eVar.mo3513o().getNickName() + " load with url onProcessBitmap: color=" + i);
        C55040a aVar = new C55040a(i | -16777216);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(aVar);
        imageView.setBackground(paintDrawable);
        imageView.setVisibility(0);
    }
}
