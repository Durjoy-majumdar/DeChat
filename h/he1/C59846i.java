package he1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import df1.C7322a;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7435f2;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import he1.C59842e;
import hp3.C87581a;
import ht1.C60172g4;
import ht1.C8794p5;
import ht1.C8802s1;
import it1.C9247b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import je1.C46523h2;
import ke3.C88144b;
import l31.C61212e;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import ob0.C47350c;
import ob0.C89132b;
import org.json.JSONObject;
import qo3.C77407n;
import rs1.C13442s8;
import rs1.C63513a1;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C48708ag1;
import te3.C49021cm0;
import te3.C49164dm0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C50409mj;
import te3.C50542nh0;
import te3.C50551nj;
import te3.C52256zf1;
import te3.C64707sc1;

/* renamed from: he1.i */
public final class C59846i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ MMFragmentActivity f170862d;

    /* renamed from: e */
    public final /* synthetic */ C50409mj f170863e;

    /* renamed from: f */
    public final /* synthetic */ C49712hj1 f170864f;

    /* renamed from: g */
    public final /* synthetic */ View f170865g;

    /* renamed from: h */
    public final /* synthetic */ C55018j0 f170866h;

    /* renamed from: i */
    public final /* synthetic */ boolean f170867i;

    /* renamed from: j */
    public final /* synthetic */ PopupWindow.OnDismissListener f170868j;

    /* renamed from: n */
    public final /* synthetic */ C32224a<C13598b0> f170869n;

    /* renamed from: o */
    public final /* synthetic */ int f170870o;

    /* renamed from: he1.i$a */
    public static final class C59847a extends C87413o implements C32226l<C89132b.C89134c<? extends C49335eu3>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMFragmentActivity f170871d;

        /* renamed from: e */
        public final /* synthetic */ C50409mj f170872e;

        /* renamed from: f */
        public final /* synthetic */ boolean f170873f;

        /* renamed from: g */
        public final /* synthetic */ C11184p0 f170874g;

        /* renamed from: h */
        public final /* synthetic */ PopupWindow.OnDismissListener f170875h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59847a(MMFragmentActivity mMFragmentActivity, C50409mj mjVar, boolean z, C11184p0 p0Var, PopupWindow.OnDismissListener onDismissListener) {
            super(1);
            this.f170871d = mMFragmentActivity;
            this.f170872e = mjVar;
            this.f170873f = z;
            this.f170874g = p0Var;
            this.f170875h = onDismissListener;
        }

        public Object invoke(Object obj) {
            C59841d dVar;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C9247b bVar = C59842e.f170858d;
            if (bVar != null) {
                bVar.mo8913b();
            }
            Integer num = null;
            C59842e.f170858d = null;
            T t = cVar.f256796d;
            C49164dm0 dm02 = t instanceof C49164dm0 ? (C49164dm0) t : null;
            C50551nj njVar = dm02 != null ? dm02.f132414d : null;
            StringBuilder sb = new StringBuilder();
            sb.append("GetBulletCommentUser errType:");
            sb.append(cVar.f256793a);
            sb.append(", errCode:");
            sb.append(cVar.f256794b);
            sb.append("， nickname=");
            sb.append(njVar != null ? njVar.f138625e : null);
            sb.append(", is_in_black_list=");
            if (njVar != null) {
                num = Integer.valueOf(njVar.f138626f);
            }
            sb.append(num);
            Log.m105924i("FinderBulletPopupHelper", sb.toString());
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                MMFragmentActivity mMFragmentActivity = this.f170871d;
                dVar = new C59841d(this.f170873f, this.f170872e, mMFragmentActivity.getResources(), njVar != null && njVar.f138626f == 1);
            } else {
                dVar = new C59841d(this.f170873f, this.f170872e, this.f170871d.getResources(), false);
            }
            C77407n nVar = new C77407n((Context) this.f170871d, 1, false);
            nVar.f225771i = dVar;
            nVar.f225782p = this.f170874g;
            nVar.f225761d = new C59845h(this.f170875h);
            nVar.mo107573q();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: he1.i$b */
    public static final class C59848b implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ PopupWindow.OnDismissListener f170876a;

        public C59848b(PopupWindow.OnDismissListener onDismissListener) {
            this.f170876a = onDismissListener;
        }

        public final void onDismiss() {
            this.f170876a.onDismiss();
        }
    }

    /* renamed from: he1.i$c */
    public static final class C59849c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ View f170877d;

        /* renamed from: e */
        public final /* synthetic */ C55018j0 f170878e;

        /* renamed from: f */
        public final /* synthetic */ C50409mj f170879f;

        /* renamed from: g */
        public final /* synthetic */ PopupWindow.OnDismissListener f170880g;

        /* renamed from: h */
        public final /* synthetic */ MMFragmentActivity f170881h;

        /* renamed from: i */
        public final /* synthetic */ C49712hj1 f170882i;

        /* renamed from: j */
        public final /* synthetic */ C32224a<C13598b0> f170883j;

        /* renamed from: n */
        public final /* synthetic */ boolean f170884n;

        /* renamed from: o */
        public final /* synthetic */ int f170885o;

        /* renamed from: he1.i$c$a */
        public static final class C46029a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ View f124119d;

            public C46029a(View view) {
                this.f124119d = view;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                if (e0Var.mo107176v()) {
                    e0Var.mo107140d(10, this.f124119d.getContext().getResources().getColor(C0966R.color.a_3), this.f124119d.getContext().getString(C0966R.string.f7944x1));
                }
            }
        }

        /* renamed from: he1.i$c$b */
        public static final class C46030b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ MMFragmentActivity f124120d;

            /* renamed from: e */
            public final /* synthetic */ PopupWindow.OnDismissListener f124121e;

            /* renamed from: f */
            public final /* synthetic */ C49712hj1 f124122f;

            /* renamed from: g */
            public final /* synthetic */ C55018j0 f124123g;

            /* renamed from: h */
            public final /* synthetic */ C50409mj f124124h;

            /* renamed from: i */
            public final /* synthetic */ View f124125i;

            /* renamed from: j */
            public final /* synthetic */ C32224a<C13598b0> f124126j;

            /* renamed from: n */
            public final /* synthetic */ boolean f124127n;

            /* renamed from: o */
            public final /* synthetic */ int f124128o;

            /* renamed from: he1.i$c$b$a */
            public static final class C46031a<_Ret, _Var> implements C87581a {

                /* renamed from: a */
                public final /* synthetic */ View f124129a;

                /* renamed from: b */
                public final /* synthetic */ C55018j0 f124130b;

                /* renamed from: c */
                public final /* synthetic */ C50409mj f124131c;

                /* renamed from: d */
                public final /* synthetic */ C32224a<C13598b0> f124132d;

                /* renamed from: e */
                public final /* synthetic */ MMFragmentActivity f124133e;

                /* renamed from: f */
                public final /* synthetic */ C49712hj1 f124134f;

                /* renamed from: g */
                public final /* synthetic */ boolean f124135g;

                /* renamed from: h */
                public final /* synthetic */ int f124136h;

                public C46031a(View view, C55018j0 j0Var, C50409mj mjVar, C32224a<C13598b0> aVar, MMFragmentActivity mMFragmentActivity, C49712hj1 hj12, boolean z, int i) {
                    this.f124129a = view;
                    this.f124130b = j0Var;
                    this.f124131c = mjVar;
                    this.f124132d = aVar;
                    this.f124133e = mMFragmentActivity;
                    this.f124134f = hj12;
                    this.f124135g = z;
                    this.f124136h = i;
                }

                public Object call(Object obj) {
                    C89132b.C89134c cVar = (C89132b.C89134c) obj;
                    if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                        C76912y0.makeText(this.f124129a.getContext(), (int) C0966R.string.gqy, 0).show();
                        C55018j0 j0Var = this.f124130b;
                        long j = this.f124131c.f138058d;
                        Iterator it = ((ArrayList) j0Var.f154483h).iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            if (((C59840c) it.next()).f170850a.f138058d == j) {
                                break;
                            }
                            i++;
                        }
                        if (i > -1) {
                            ((ArrayList) j0Var.f154483h).remove(i);
                        }
                        this.f124132d.invoke();
                        C59853j jVar = C59853j.f170902a;
                        MMFragmentActivity mMFragmentActivity = this.f124133e;
                        C49712hj1 hj12 = this.f124134f;
                        JSONObject jSONObject = new JSONObject();
                        C50409mj mjVar = this.f124131c;
                        C55018j0 j0Var2 = this.f124130b;
                        jSONObject.put("bs_id", C61926c.m72691p(mjVar.f138058d));
                        jSONObject.put("feedid", C61926c.m72691p(j0Var2.getItemId()));
                        C13598b0 b0Var = C13598b0.f38549a;
                        jVar.mo84811a(mMFragmentActivity, hj12, "already_delete_bullet_screen", false, jSONObject, this.f124135g, this.f124131c.f138064j);
                        jVar.mo84812c(this.f124133e, this.f124131c, this.f124130b.getItemId(), this.f124136h, false);
                        jVar.mo84813d(this.f124129a, this.f124133e, this.f124131c, this.f124130b.getItemId(), this.f124136h, false);
                    } else {
                        C76912y0.makeText(this.f124129a.getContext(), (int) C0966R.string.gqx, 0).show();
                    }
                    return C13598b0.f38549a;
                }
            }

            public C46030b(MMFragmentActivity mMFragmentActivity, PopupWindow.OnDismissListener onDismissListener, C49712hj1 hj12, C55018j0 j0Var, C50409mj mjVar, View view, C32224a<C13598b0> aVar, boolean z, int i) {
                this.f124120d = mMFragmentActivity;
                this.f124121e = onDismissListener;
                this.f124122f = hj12;
                this.f124123g = j0Var;
                this.f124124h = mjVar;
                this.f124125i = view;
                this.f124126j = aVar;
                this.f124127n = z;
                this.f124128o = i;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 10) {
                    C52256zf1 zf12 = new C52256zf1();
                    C49712hj1 hj12 = this.f124122f;
                    C55018j0 j0Var = this.f124123g;
                    C50409mj mjVar = this.f124124h;
                    zf12.f145859d = C46523h2.f125330a.mo71860b(11836, hj12);
                    zf12.f145860e = j0Var.getItemId();
                    zf12.f145861f = mjVar.f138058d;
                    zf12.f145862g = 1;
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127069d = 11836;
                    bVar.f127068c = "/cgi-bin/micromsg-bin/finderopbulletcomment";
                    bVar.f127066a = zf12;
                    bVar.f127067b = new C48708ag1();
                    C47350c a = bVar.mo72403a();
                    C89132b ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
                    ui.mo123453j(a);
                    ui.mo9225i().mo123062e(new C46031a(this.f124125i, this.f124123g, this.f124124h, this.f124126j, this.f124120d, this.f124122f, this.f124127n, this.f124128o)).mo11397F(this.f124120d);
                }
                this.f124121e.onDismiss();
            }
        }

        /* renamed from: he1.i$c$c */
        public static final class C46032c implements C77407n.C47880p {

            /* renamed from: a */
            public final /* synthetic */ PopupWindow.OnDismissListener f124137a;

            public C46032c(PopupWindow.OnDismissListener onDismissListener) {
                this.f124137a = onDismissListener;
            }

            public final void onDismiss() {
                this.f124137a.onDismiss();
            }
        }

        /* renamed from: he1.i$c$e */
        public static final class C46033e implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ View f124138d;

            public C46033e(View view) {
                this.f124138d = view;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                if (e0Var.mo107176v()) {
                    e0Var.mo107140d(11, this.f124138d.getContext().getResources().getColor(C0966R.color.a_3), this.f124138d.getContext().getString(C0966R.string.a18));
                }
            }
        }

        /* renamed from: he1.i$c$g */
        public static final class C46034g implements C77407n.C47880p {

            /* renamed from: a */
            public final /* synthetic */ PopupWindow.OnDismissListener f124139a;

            public C46034g(PopupWindow.OnDismissListener onDismissListener) {
                this.f124139a = onDismissListener;
            }

            public final void onDismiss() {
                this.f124139a.onDismiss();
            }
        }

        /* renamed from: he1.i$c$d */
        public static final class C59850d implements C8794p5<C64707sc1> {

            /* renamed from: d */
            public final /* synthetic */ MMFragmentActivity f170886d;

            /* renamed from: e */
            public final /* synthetic */ C49712hj1 f170887e;

            /* renamed from: f */
            public final /* synthetic */ boolean f170888f;

            /* renamed from: g */
            public final /* synthetic */ C50409mj f170889g;

            /* renamed from: h */
            public final /* synthetic */ C55018j0 f170890h;

            public C59850d(MMFragmentActivity mMFragmentActivity, C49712hj1 hj12, boolean z, C50409mj mjVar, C55018j0 j0Var) {
                this.f170886d = mMFragmentActivity;
                this.f170887e = hj12;
                this.f170888f = z;
                this.f170889g = mjVar;
                this.f170890h = j0Var;
            }

            /* renamed from: c5 */
            public void mo705c5(Object obj, C50542nh0 nh02) {
                C87412m.m108594g((C64707sc1) obj, "req");
                C87412m.m108594g(nh02, "ret");
                Context context = MMApplicationContext.getContext();
                if (nh02.f138603e == 0) {
                    Log.m105924i("FinderBulletPopupHelper", "remove bullet black list succ");
                    C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.loc), 0).show();
                    C59853j jVar = C59853j.f170902a;
                    MMFragmentActivity mMFragmentActivity = this.f170886d;
                    C49712hj1 hj12 = this.f170887e;
                    JSONObject jSONObject = new JSONObject();
                    C50409mj mjVar = this.f170889g;
                    C55018j0 j0Var = this.f170890h;
                    jSONObject.put("bs_id", C61926c.m72691p(mjVar.f138058d));
                    jSONObject.put("feedid", C61926c.m72691p(j0Var.getItemId()));
                    C13598b0 b0Var = C13598b0.f38549a;
                    jVar.mo84811a(mMFragmentActivity, hj12, "already_out_blacklist", false, jSONObject, this.f170888f, this.f170889g.f138064j);
                    return;
                }
                Log.m105924i("FinderBulletPopupHelper", "remove comment black list failed:" + nh02.f138603e);
                C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.lod), 0).show();
            }
        }

        /* renamed from: he1.i$c$f */
        public static final class C59851f implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C50409mj f170891d;

            /* renamed from: e */
            public final /* synthetic */ C55018j0 f170892e;

            /* renamed from: f */
            public final /* synthetic */ PopupWindow.OnDismissListener f170893f;

            /* renamed from: g */
            public final /* synthetic */ MMFragmentActivity f170894g;

            /* renamed from: h */
            public final /* synthetic */ C49712hj1 f170895h;

            /* renamed from: i */
            public final /* synthetic */ boolean f170896i;

            /* renamed from: he1.i$c$f$a */
            public static final class C59852a implements C8794p5<C64707sc1> {

                /* renamed from: d */
                public final /* synthetic */ MMFragmentActivity f170897d;

                /* renamed from: e */
                public final /* synthetic */ C49712hj1 f170898e;

                /* renamed from: f */
                public final /* synthetic */ boolean f170899f;

                /* renamed from: g */
                public final /* synthetic */ C50409mj f170900g;

                /* renamed from: h */
                public final /* synthetic */ C55018j0 f170901h;

                public C59852a(MMFragmentActivity mMFragmentActivity, C49712hj1 hj12, boolean z, C50409mj mjVar, C55018j0 j0Var) {
                    this.f170897d = mMFragmentActivity;
                    this.f170898e = hj12;
                    this.f170899f = z;
                    this.f170900g = mjVar;
                    this.f170901h = j0Var;
                }

                /* renamed from: c5 */
                public void mo705c5(Object obj, C50542nh0 nh02) {
                    C87412m.m108594g((C64707sc1) obj, "req");
                    C87412m.m108594g(nh02, "ret");
                    Context context = MMApplicationContext.getContext();
                    if (nh02.f138603e == 0) {
                        Log.m105924i("FinderBulletPopupHelper", "bullet black list succ");
                        C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.e3x), 0).show();
                        C59853j jVar = C59853j.f170902a;
                        MMFragmentActivity mMFragmentActivity = this.f170897d;
                        C49712hj1 hj12 = this.f170898e;
                        JSONObject jSONObject = new JSONObject();
                        C50409mj mjVar = this.f170900g;
                        C55018j0 j0Var = this.f170901h;
                        jSONObject.put("bs_id", C61926c.m72691p(mjVar.f138058d));
                        jSONObject.put("feedid", C61926c.m72691p(j0Var.getItemId()));
                        C13598b0 b0Var = C13598b0.f38549a;
                        jVar.mo84811a(mMFragmentActivity, hj12, "already_into_blacklist", false, jSONObject, this.f170899f, this.f170900g.f138064j);
                        return;
                    }
                    Log.m105924i("FinderBulletPopupHelper", "comment black list failed:" + nh02.f138603e);
                    C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.e3y), 0).show();
                }
            }

            public C59851f(C50409mj mjVar, C55018j0 j0Var, PopupWindow.OnDismissListener onDismissListener, MMFragmentActivity mMFragmentActivity, C49712hj1 hj12, boolean z) {
                this.f170891d = mjVar;
                this.f170892e = j0Var;
                this.f170893f = onDismissListener;
                this.f170894g = mMFragmentActivity;
                this.f170895h = hj12;
                this.f170896i = z;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 11) {
                    ((C3603n1) C86312j.m106911c(C3603n1.class)).mo3968QI(this.f170891d.f138058d, this.f170892e.mo3513o().getId(), this.f170892e.mo3513o().getObjectNonceId(), true, new C59852a(this.f170894g, this.f170895h, this.f170896i, this.f170891d, this.f170892e));
                }
                this.f170893f.onDismiss();
            }
        }

        public C59849c(View view, C55018j0 j0Var, C50409mj mjVar, PopupWindow.OnDismissListener onDismissListener, MMFragmentActivity mMFragmentActivity, C49712hj1 hj12, C32224a<C13598b0> aVar, boolean z, int i) {
            this.f170877d = view;
            this.f170878e = j0Var;
            this.f170879f = mjVar;
            this.f170880g = onDismissListener;
            this.f170881h = mMFragmentActivity;
            this.f170882i = hj12;
            this.f170883j = aVar;
            this.f170884n = z;
            this.f170885o = i;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C7322a b;
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                C59842e.f170856b = true;
                C77407n nVar = new C77407n(this.f170877d.getContext(), 1, true);
                nVar.mo107569n(C85868k2.m106137b(this.f170877d.getContext()).inflate(C0966R.C0971layout.csb, (ViewGroup) null), false);
                View view = this.f170877d;
                nVar.f225771i = new C46029a(view);
                MMFragmentActivity mMFragmentActivity = this.f170881h;
                PopupWindow.OnDismissListener onDismissListener = this.f170880g;
                nVar.f225782p = new C46030b(mMFragmentActivity, onDismissListener, this.f170882i, this.f170878e, this.f170879f, view, this.f170883j, this.f170884n, this.f170885o);
                nVar.f225761d = new C46032c(onDismissListener);
                nVar.mo107573q();
            } else if (itemId == 2) {
                C59842e.f170856b = false;
                Context context = this.f170877d.getContext();
                C87412m.m108593f(context, "anchorView.context");
                long itemId2 = this.f170878e.getItemId();
                String format = String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&comment_ID=%s&Content_ID=%s", Arrays.copyOf(new Object[]{63, C61926c.m72691p(this.f170879f.f138058d), C61926c.m72691p(itemId2)}, 3));
                C87412m.m108593f(format, "format(format, *args)");
                Intent intent = new Intent();
                intent.putExtra("rawUrl", format);
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Ex0(itemId2);
                C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
                if (!(f == null || (b = C60172g4.C60173a.m70190b(f, 0, 1, (Object) null)) == null)) {
                    b.mo8766a(new C7322a.C7323a(17, itemId2));
                }
                this.f170880g.onDismiss();
            } else if (itemId == 3) {
                C59842e.f170856b = true;
                C77407n nVar2 = new C77407n(this.f170877d.getContext(), 1, true);
                View inflate = C85868k2.m106137b(this.f170877d.getContext()).inflate(C0966R.C0971layout.csb, (ViewGroup) null);
                ((TextView) inflate.findViewById(C0966R.C0970id.knp)).setText(this.f170877d.getContext().getResources().getString(C0966R.string.jsq));
                nVar2.mo107569n(inflate, false);
                nVar2.f225771i = new C46033e(this.f170877d);
                C50409mj mjVar = this.f170879f;
                C55018j0 j0Var = this.f170878e;
                PopupWindow.OnDismissListener onDismissListener2 = this.f170880g;
                nVar2.f225782p = new C59851f(mjVar, j0Var, onDismissListener2, this.f170881h, this.f170882i, this.f170884n);
                nVar2.f225761d = new C46034g(onDismissListener2);
                nVar2.mo107573q();
            } else if (itemId == 4) {
                C59842e.f170856b = false;
                ((C3603n1) C86312j.m106911c(C3603n1.class)).mo3968QI(this.f170879f.f138058d, this.f170878e.mo3513o().getId(), this.f170878e.mo3513o().getObjectNonceId(), false, new C59850d(this.f170881h, this.f170882i, this.f170884n, this.f170879f, this.f170878e));
                this.f170880g.onDismiss();
            }
        }
    }

    public C59846i(MMFragmentActivity mMFragmentActivity, C50409mj mjVar, C49712hj1 hj12, View view, C55018j0 j0Var, boolean z, PopupWindow.OnDismissListener onDismissListener, C32224a<C13598b0> aVar, int i) {
        this.f170862d = mMFragmentActivity;
        this.f170863e = mjVar;
        this.f170864f = hj12;
        this.f170865g = view;
        this.f170866h = j0Var;
        this.f170867i = z;
        this.f170868j = onDismissListener;
        this.f170869n = aVar;
        this.f170870o = i;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        MegaVideoBulletView megaVideoBulletView;
        C59854m bulletManager;
        C89059e<C89132b.C89134c<?>> i2;
        int itemId = menuItem.getItemId();
        if (itemId == 5) {
            C59842e.f170856b = false;
            C63513a1 a1Var = (C63513a1) C39818r.f106831a.mo62444c(this.f170862d).mo62449e(C63513a1.class);
            if (a1Var != null) {
                C50409mj mjVar = this.f170863e;
                C87412m.m108594g(mjVar, "bulletInfo");
                Log.m105924i("FinderBulletUIC", "doFollowPost: content=" + mjVar.f138060f + ", bulletId=" + C61926c.m72691p(mjVar.f138058d) + ", feedId=" + C61926c.m72691p(a1Var.f180151r) + ", curBulletView=" + a1Var.f180149p);
                String str = mjVar.f138060f;
                if (!((str == null || str.length() == 0) || (megaVideoBulletView = a1Var.f180149p) == null || (bulletManager = megaVideoBulletView.getBulletManager()) == null)) {
                    String str2 = mjVar.f138060f;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bulletManager.mo84819f(str2, a1Var.mo88378n3(), 2, mjVar.f138058d);
                }
            }
            C7435f2 f2Var = C7435f2.f25626a;
            C49712hj1 hj12 = this.f170864f;
            JSONObject jSONObject = new JSONObject();
            C50409mj mjVar2 = this.f170863e;
            C55018j0 j0Var = this.f170866h;
            jSONObject.put("bs_id", C61926c.m72691p(mjVar2.f138058d));
            jSONObject.put("feedid", C61926c.m72691p(j0Var.getItemId()));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(hj12, "bs_agree_button", 1, jSONObject);
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", this.f170865g, C90364q0.m113147f(new C13604l("view_id", "bs_agree_button"), new C13604l("agree_bs_id", C61926c.m72691p(this.f170863e.f138058d)), new C13604l("feed_id", C61926c.m72691p(this.f170866h.getItemId()))), 25496);
        } else if (itemId == 6) {
            C59842e.f170856b = true;
            View view = this.f170865g;
            C55018j0 j0Var2 = this.f170866h;
            C50409mj mjVar3 = this.f170863e;
            PopupWindow.OnDismissListener onDismissListener = this.f170868j;
            MMFragmentActivity mMFragmentActivity = this.f170862d;
            C49712hj1 hj13 = this.f170864f;
            C32224a<C13598b0> aVar = this.f170869n;
            boolean z = this.f170867i;
            boolean z2 = z;
            C59849c cVar = new C59849c(view, j0Var2, mjVar3, onDismissListener, mMFragmentActivity, hj13, aVar, z, this.f170870o);
            if (!z2 || mjVar3.f138064j != 0) {
                C77407n nVar = new C77407n((Context) mMFragmentActivity, 1, false);
                nVar.f225771i = new C59841d(this.f170867i, this.f170863e, this.f170862d.getResources(), false);
                nVar.f225782p = cVar;
                nVar.f225761d = new C59848b(this.f170868j);
                nVar.mo107573q();
                return;
            }
            C59842e.f170858d = C9247b.C9248a.m8889a(C9247b.f28989d, mMFragmentActivity, (String) null, 300, (DialogInterface.OnCancelListener) null, 8, (Object) null);
            C49021cm0 cm02 = new C49021cm0();
            C49712hj1 hj14 = this.f170864f;
            C55018j0 j0Var3 = this.f170866h;
            C50409mj mjVar4 = this.f170863e;
            cm02.f131819d = C46523h2.f125330a.mo71860b(11137, hj14);
            cm02.f131820e = j0Var3.getItemId();
            cm02.f131821f = mjVar4.f138058d;
            cm02.f131822g = j0Var3.mo3513o().getObjectNonceId();
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 11137;
            bVar.f127068c = "/cgi-bin/micromsg-bin/findergetbulletcommentuserinfo";
            bVar.f127066a = cm02;
            bVar.f127067b = new C49164dm0();
            C47350c a = bVar.mo72403a();
            C89132b<?> ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
            ui.mo123453j(a);
            C59842e.f170857c = ui;
            C9247b bVar2 = C59842e.f170858d;
            if (bVar2 != null) {
                bVar2.begin();
            }
            C89132b<?> bVar3 = C59842e.f170857c;
            if (bVar3 != null && (i2 = bVar3.mo9225i()) != null) {
                C89059e<_Ret> B = i2.mo123062e(new C59842e.C59843a(new C59847a(this.f170862d, this.f170863e, this.f170867i, cVar, this.f170868j)));
                if (B != null) {
                    B.mo11397F(this.f170862d);
                }
            }
        }
    }
}
