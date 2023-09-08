package hk1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import go3.C59600d;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C60167f1;
import ht1.C60200t1;
import ht1.C8777j5;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jp3.C9487b;
import ks3.C10412u;
import ls3.C10649f;
import o40.C61926c;
import p158gt.C76057w;
import p185kq.C10383h;
import p565ir.C60606n;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qy2.C77455o;
import qy2.C77456r;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import t91.C64208c;
import te3.C50429mo2;
import te3.C64238ap2;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64623p81;
import up1.C27696y;
import uz2.C65488a0;
import uz2.C65490m;
import vp3.C65849b;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: hk1.g */
public final class C59938g implements C77456r {

    /* renamed from: d */
    public final Map<String, C64273c21> f171054d = Collections.synchronizedMap(new HashMap());

    /* renamed from: hk1.g$a */
    public static final class C59939a extends C77455o {

        /* renamed from: d */
        public C64623p81 f171055d;

        /* renamed from: e */
        public int f171056e = 1;

        /* renamed from: f */
        public WeakReference<ImageView> f171057f;

        /* renamed from: hk1.g$a$a */
        public static final class C59940a implements C60606n.C60609c {

            /* renamed from: a */
            public final /* synthetic */ C59939a f171058a;

            public C59940a(C59939a aVar) {
                this.f171058a = aVar;
            }

            public void onLiveStatusCallback(long j, int i, Object obj) {
                C59939a aVar = this.f171058a;
                aVar.f171056e = i;
                WeakReference<ImageView> weakReference = aVar.f171057f;
                aVar.mo84854t(weakReference != null ? weakReference.get() : null);
                this.f171058a.mo84852r((C64623p81) null, i);
            }
        }

        /* renamed from: hk1.g$a$b */
        public static final class C59941b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f171059d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f171060e;

            /* renamed from: hk1.g$a$b$a */
            public static final class C59942a implements C76057w.C76058a {

                /* renamed from: a */
                public final /* synthetic */ ImageView f171061a;

                /* renamed from: hk1.g$a$b$a$a */
                public static final class C59943a extends C87413o implements C32226l<Bitmap, C13598b0> {

                    /* renamed from: d */
                    public final /* synthetic */ ImageView f171062d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C59943a(ImageView imageView) {
                        super(1);
                        this.f171062d = imageView;
                    }

                    public Object invoke(Object obj) {
                        this.f171062d.setImageBitmap((Bitmap) obj);
                        return C13598b0.f38549a;
                    }
                }

                public C59942a(ImageView imageView) {
                    this.f171061a = imageView;
                }

                /* renamed from: a */
                public final void mo25933a(String str, Bitmap bitmap, String str2) {
                    if (bitmap != null) {
                        C65849b bVar = new C65849b();
                        bVar.mo89891b(bitmap);
                        int width = this.f171061a.getWidth();
                        int height = this.f171061a.getHeight();
                        bVar.f189363b = width;
                        bVar.f189364c = height;
                        bVar.f189366e.f334033b.mo154924d();
                        bVar.mo89890a(new C59943a(this.f171061a));
                    }
                }
            }

            public C59941b(String str, ImageView imageView) {
                this.f171059d = str;
                this.f171060e = imageView;
            }

            public final void run() {
                ((C76057w) C86312j.m106911c(C76057w.class)).h60(this.f171059d, new C59942a(this.f171060e));
            }
        }

        public C59939a(String str) {
            super(str);
        }

        /* renamed from: b */
        public boolean mo84141b(Context context) {
            Class cls = C60200t1.class;
            C87412m.m108594g(context, "context");
            C64623p81 p812 = this.f171055d;
            if (p812 == null) {
                return false;
            }
            Intent intent = new Intent();
            boolean b = C87412m.m108589b(p812.f184779e, C66785b.f191882e.mo90662O5());
            intent.putExtra("finder_username", p812.f184779e);
            if (b) {
                ((C60200t1) C86312j.m106911c(cls)).mo76836bn(context, intent, 20, 2);
                return true;
            }
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(20, 2, 32, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(context, intent);
            return true;
        }

        /* renamed from: d */
        public boolean mo84142d(Context context, Bundle bundle) {
            boolean z;
            C87412m.m108594g(context, "context");
            C8477a0 a0Var = new C8477a0();
            C65488a0 a0Var2 = this.f225886b;
            if (a0Var2 != null) {
                if (C87412m.m108589b(a0Var2.f188439d, "2")) {
                    Map<String, String> parseXml = XmlParser.parseXml(a0Var2.f188441f, "finderLive", (String) null);
                    if (parseXml != null) {
                        C64623p81 k = C60167f1.m70153k("", parseXml);
                        C7335d c = C86312j.m106911c(C54108o.class);
                        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                        String str = "";
                        C8777j5.C8778a.m8603d((C8777j5) c, C61926c.m72671P(k.f184780f), C61926c.m72671P(k.f184778d), k.f184779e, -1, 0, C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM, "temp_16", (String) null, 0, 384, (Object) null);
                        if (Util.isEqual(C66785b.f191882e.mo90662O5(), k.f184779e)) {
                            Intent intent = new Intent();
                            intent.putExtra("KEY_PARAMS_SOURCE_TYPE", k.f184793v);
                            C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
                            Context context2 = MMApplicationContext.getContext();
                            long P = C61926c.m72671P(k.f184780f);
                            Long valueOf = Long.valueOf(C61926c.m72671P(k.f184778d));
                            String str2 = k.f184790s;
                            nVar.o90(intent, context2, P, valueOf, str2 == null ? str : str2, k.f184782h, "", "", "");
                        } else {
                            Intent intent2 = new Intent();
                            String str3 = k.f184794w;
                            if (str3 == null) {
                                str3 = str;
                            }
                            intent2.putExtra("key_enter_live_param_ecsource", str3);
                            int i = C10412u.f31640a;
                            intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 3);
                            C64238ap2 ap22 = new C64238ap2();
                            ap22.f182124d = C61926c.m72671P(k.f184780f);
                            ap22.f182125e = C61926c.m72671P(k.f184778d);
                            String str4 = k.f184790s;
                            if (str4 == null) {
                                str4 = str;
                            }
                            ap22.f182126f = str4;
                            String str5 = k.f184779e;
                            if (str5 == null) {
                                str5 = str;
                            }
                            ap22.f182127g = str5;
                            String str6 = str;
                            ap22.f182128h = str6;
                            ap22.f182129i = k.f184782h;
                            ap22.f182130j = null;
                            C64279c90 c902 = new C64279c90();
                            c902.f182444d = str6;
                            c902.f182445e = str6;
                            c902.f182447g = -1;
                            c902.f182448h = -1;
                            c902.f182449i = 1;
                            Context context3 = MMApplicationContext.getContext();
                            C87412m.m108593f(context3, "getContext()");
                            ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(context3, intent2, ap22, true, c902, (C10649f.C10650a) null);
                            z = true;
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                a0Var.f27482d = z;
            }
            return a0Var.f27482d;
        }

        /* renamed from: f */
        public CharSequence mo84143f() {
            C64623p81 p812 = this.f171055d;
            String str = p812 != null ? p812.f184781g : null;
            return str == null ? "" : str;
        }

        /* renamed from: h */
        public String mo84144h() {
            C64623p81 p812 = this.f171055d;
            String str = p812 != null ? p812.f184780f : null;
            return str == null ? "" : str;
        }

        /* renamed from: i */
        public CharSequence mo84145i() {
            C64623p81 p812 = this.f171055d;
            String str = p812 != null ? p812.f184782h : null;
            return str == null ? "" : str;
        }

        /* renamed from: j */
        public boolean mo84146j() {
            return true;
        }

        /* renamed from: m */
        public void mo84147m(String str, C65488a0 a0Var) {
            Map<String, String> parseXml;
            this.f225886b = a0Var;
            this.f225887c = str;
            this.f171056e = 1;
            if (!(a0Var == null || (parseXml = XmlParser.parseXml(a0Var.f188441f, "finderLive", (String) null)) == null)) {
                this.f171055d = C60167f1.m70153k("", parseXml);
            }
            mo84853s();
            C64623p81 p812 = this.f171055d;
            if (p812 != null) {
                mo84852r(p812, p812.f184791t);
            }
        }

        /* renamed from: n */
        public void mo84148n() {
            this.f171055d = null;
        }

        /* renamed from: o */
        public boolean mo84149o(FrameLayout frameLayout) {
            C87412m.m108594g(frameLayout, "container");
            ImageView imageView = (ImageView) frameLayout.findViewWithTag("Finder.TextStatusProvider");
            if (imageView == null) {
                imageView = new ImageView(frameLayout.getContext());
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            frameLayout.removeAllViews();
            frameLayout.addView(imageView);
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C64623p81 p812 = this.f171055d;
            String str = p812 != null ? p812.f184789r : null;
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(str, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            return true;
        }

        /* renamed from: p */
        public boolean mo84851p(FrameLayout frameLayout) {
            C87412m.m108594g(frameLayout, "container");
            mo84853s();
            ImageView imageView = new ImageView(frameLayout.getContext());
            mo84854t(imageView);
            frameLayout.addView(imageView);
            frameLayout.setVisibility(0);
            this.f171057f = new WeakReference<>(imageView);
            return true;
        }

        /* renamed from: q */
        public boolean mo84150q(FrameLayout frameLayout) {
            C87412m.m108594g(frameLayout, "container");
            C64623p81 p812 = this.f171055d;
            String str = p812 != null ? p812.f184783i : null;
            if (!(str == null || C112551y.m153811k(str))) {
                ImageView imageView = (ImageView) frameLayout.findViewWithTag("Finder.TextStatusProvider");
                if (imageView == null) {
                    imageView = new ImageView(frameLayout.getContext());
                    imageView.setTag("Finder.TextStatusProvider");
                    frameLayout.removeAllViews();
                    frameLayout.addView(imageView);
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.post(new C59941b(str, imageView));
            }
            return true;
        }

        /* renamed from: r */
        public final void mo84852r(C64623p81 p812, int i) {
            Class cls = C10383h.class;
            if (p812 != null) {
                C64208c.C64209a aVar = C64208c.f181951a;
                C64208c.f181949P.clear();
                ConcurrentHashMap<String, Object> concurrentHashMap = C64208c.f181949P;
                C13604l[] lVarArr = new C13604l[8];
                lVarArr[0] = new C13604l("feed_id", p812.f184780f);
                lVarArr[1] = new C13604l("live_id", p812.f184778d);
                lVarArr[2] = new C13604l("comment_scene", "temp_16");
                lVarArr[3] = new C13604l("finder_username", p812.f184779e);
                String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                if (Wb == null) {
                    Wb = "";
                }
                lVarArr[4] = new C13604l("behaviour_session_id", Wb);
                lVarArr[5] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
                lVarArr[6] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
                lVarArr[7] = new C13604l("session_buffer", "");
                concurrentHashMap.putAll(C90364q0.m113147f(lVarArr));
            }
            if (i == 1) {
                C64208c.C64209a aVar2 = C64208c.f181951a;
                C64208c.f181949P.put("live_enter_status", 1L);
                return;
            }
            C64208c.C64209a aVar3 = C64208c.f181951a;
            C64208c.f181949P.put("live_enter_status", 2L);
        }

        /* renamed from: s */
        public final void mo84853s() {
            String str;
            C64623p81 p812 = this.f171055d;
            if (p812 != null && (str = p812.f184778d) != null) {
                C7335d c = C86312j.m106911c(C60606n.class);
                C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
                C60606n.C60607a.m70857a((C60606n) c, Util.safeParseLong(str), false, (C9487b) null, new C59940a(this), 0, (String) null, (C50429mo2) null, 118, (Object) null);
            }
        }

        /* renamed from: t */
        public final void mo84854t(ImageView imageView) {
            Drawable drawable;
            if (this.f171056e == 2) {
                drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.finder_live_icon);
                C74933u4.m89769f(drawable, -1);
            } else {
                drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.finder_live_icon);
            }
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: IT */
    public C59600d mo84138IT(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar) {
        C87412m.m108594g(frameLayout, "container");
        C87412m.m108594g(mVar, "pullDownParam");
        if (mVar.f188446e == 0) {
            return null;
        }
        Map<String, C64273c21> map = this.f171054d;
        C87412m.m108593f(map, "liveEndCache");
        return new C59932c(str, frameLayout, a0Var, mVar, map);
    }

    public C77455o l30(String str) {
        return new C59939a(str);
    }

    public void release() {
    }
}
