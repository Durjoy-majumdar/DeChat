package kl1;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import go3.C76003c;
import gy3.C87412m;
import gy3.C87413o;
import hi3.C87515a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import ok1.C62042e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48770aw0;
import wk1.C15465r;
import wk1.C15483x;
import wk1.C15484y;

/* renamed from: kl1.l */
public final class C10327l {

    /* renamed from: h */
    public static final int f31467h = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);

    /* renamed from: i */
    public static final int f31468i = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);

    /* renamed from: j */
    public static final int f31469j = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3723cd);

    /* renamed from: k */
    public static final int f31470k = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);

    /* renamed from: l */
    public static final int f31471l = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3738cr);

    /* renamed from: a */
    public final C10333o f31472a;

    /* renamed from: b */
    public final C13601g f31473b = C36568h.m40985a(C10329b.f31480d);

    /* renamed from: c */
    public int f31474c;

    /* renamed from: d */
    public int f31475d;

    /* renamed from: e */
    public final C13601g f31476e;

    /* renamed from: f */
    public final int f31477f;

    /* renamed from: g */
    public final C13601g f31478g;

    /* renamed from: kl1.l$a */
    public static final class C10328a extends C87413o implements C32224a<ImageView[]> {

        /* renamed from: d */
        public final /* synthetic */ C10327l f31479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10328a(C10327l lVar) {
            super(0);
            this.f31479d = lVar;
        }

        public Object invoke() {
            View findViewById = this.f31479d.f31472a.mo10631c().findViewById(C0966R.C0970id.nk4);
            C87412m.m108593f(findViewById, "widget.bulletAvatarLayou….id.bullet_like_avatar_1)");
            View findViewById2 = this.f31479d.f31472a.mo10631c().findViewById(C0966R.C0970id.nk5);
            C87412m.m108593f(findViewById2, "widget.bulletAvatarLayou….id.bullet_like_avatar_2)");
            View findViewById3 = this.f31479d.f31472a.mo10631c().findViewById(C0966R.C0970id.nk6);
            C87412m.m108593f(findViewById3, "widget.bulletAvatarLayou….id.bullet_like_avatar_3)");
            return new ImageView[]{(ImageView) findViewById, (ImageView) findViewById2, (ImageView) findViewById3};
        }
    }

    /* renamed from: kl1.l$b */
    public static final class C10329b extends C87413o implements C32224a<HashMap<Integer, Drawable>> {

        /* renamed from: d */
        public static final C10329b f31480d = new C10329b();

        public C10329b() {
            super(0);
        }

        public Object invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put(2, MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.a18));
            hashMap.put(0, MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.f5166yy));
            hashMap.put(-1, MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.a18));
            return hashMap;
        }
    }

    /* renamed from: kl1.l$c */
    public static final class C10330c extends C87413o implements C32224a<C76003c> {

        /* renamed from: d */
        public final /* synthetic */ C10327l f31481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10330c(C10327l lVar) {
            super(0);
            this.f31481d = lVar;
        }

        public Object invoke() {
            Drawable e = C87515a.m108835e(this.f31481d.f31472a.f31488e.getContext().getResources(), C0966R.raw.icons_filled_shop, 0.0f);
            int i = this.f31481d.f31474c;
            e.setBounds(0, 0, i, i);
            e.setColorFilter(new PorterDuffColorFilter(this.f31481d.f31472a.f31488e.getContext().getResources().getColor(C0966R.color.f2975b6), PorterDuff.Mode.SRC_ATOP));
            return new C76003c(e, 1);
        }
    }

    public C10327l(C10333o oVar) {
        C87412m.m108594g(oVar, "widget");
        this.f31472a = oVar;
        int i = f31470k;
        this.f31474c = i;
        this.f31476e = C36568h.m40985a(new C10328a(this));
        this.f31477f = oVar.f31488e.getContext().getResources().getColor(C0966R.color.al_);
        if (C62042e.f176370a.mo87027N0()) {
            oVar.mo10632d().setTextSize(1, 17.0f);
            this.f31474c = f31471l;
        } else {
            oVar.mo10632d().setTextSize(1, 15.0f);
            this.f31474c = i;
        }
        this.f31478g = C36568h.m40985a(new C10330c(this));
    }

    /* renamed from: b */
    public static Drawable m10265b(C10327l lVar, LinkedList linkedList, int i, int i2, Object obj) {
        Drawable drawable;
        int i3;
        Object obj2;
        Object obj3;
        boolean z;
        boolean z2;
        if ((i2 & 2) != 0) {
            i = 230;
        }
        lVar.getClass();
        Iterator it = linkedList.iterator();
        while (true) {
            drawable = null;
            i3 = 0;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((C48770aw0) obj2).f130789d == 8) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (obj2 != null) {
            return lVar.mo10629a().get(-1);
        }
        int b0 = C62042e.f176370a.mo87066b0(linkedList);
        Iterator it4 = linkedList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it4.next();
            if (((C48770aw0) obj3).f130789d == 4) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C48770aw0 aw02 = (C48770aw0) obj3;
        if (aw02 != null) {
            i3 = aw02.f130791f;
        }
        if (b0 >= 40) {
            drawable = MMApplicationContext.getContext().getResources().getDrawable(new C15465r(C15483x.MODE_DARK, C15484y.SIZE_NORMAL).mo14282k(b0));
            drawable.setAlpha(i);
        } else if (i3 > 10) {
            drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.b_c);
        }
        return drawable;
    }

    /* renamed from: a */
    public final HashMap<Integer, Drawable> mo10629a() {
        return (HashMap) ((C36570n) this.f31473b).getValue();
    }
}
