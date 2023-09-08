package qj1;

import ak1.C0076j0;
import ak1.C54116w;
import al1.C54130j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import bl3.C39818r;
import cj1.C0639y1;
import cj1.C54795n5;
import cl1.C0653a0;
import cl1.C0696x;
import cl1.C0700z;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView;
import com.tencent.p014mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftPanelIndicator;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import d60.C58124b;
import di3.C86312j;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import l31.C10460a;
import l31.C61212e;
import l60.C99344b;
import m53.C10753a;
import m53.C10757d;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qk1.C12838s1;
import r60.C101350i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C90363p0;
import t60.C64207e;
import t91.C64208c;
import te3.C50326ly0;
import te3.C50900q11;
import up1.C27696y;
import x60.C102564a;
import xs1.C15883o;
import yh1.C16011a;
import zh1.C16200d;
import zh1.C16203f;
import zh1.C16209i;
import zh1.C16210j;

/* renamed from: qj1.d7 */
public class C12282d7 extends C62660c implements View.OnClickListener {

    /* renamed from: U0 */
    public static final String f35384U0;

    /* renamed from: A */
    public final C12838s1 f35385A;

    /* renamed from: B */
    public final TextView f35386B;

    /* renamed from: C */
    public final View f35387C;

    /* renamed from: D */
    public final View f35388D;

    /* renamed from: E */
    public final View f35389E;

    /* renamed from: F */
    public final View f35390F;

    /* renamed from: G */
    public C10757d f35391G;

    /* renamed from: H */
    public boolean f35392H;

    /* renamed from: I */
    public long f35393I;

    /* renamed from: J */
    public volatile boolean f35394J;

    /* renamed from: K */
    public FinderLiveGiftPanelIndicator f35395K;

    /* renamed from: L */
    public final Object f35396L;

    /* renamed from: M */
    public String f35397M;

    /* renamed from: N */
    public final C4191v0 f35398N;

    /* renamed from: P */
    public final LinearLayout f35399P;

    /* renamed from: Q */
    public final C32226l<C12289d, C13598b0> f35400Q;

    /* renamed from: Q0 */
    public final ArrayList<WxRecyclerView> f35401Q0;

    /* renamed from: R */
    public C12289d f35402R;

    /* renamed from: R0 */
    public C8916d f35403R0;

    /* renamed from: S */
    public String f35404S;

    /* renamed from: S0 */
    public C16011a f35405S0;

    /* renamed from: T */
    public final LinearLayout f35406T;

    /* renamed from: T0 */
    public long f35407T0;

    /* renamed from: U */
    public final LinearLayout f35408U;

    /* renamed from: V */
    public final ImageView f35409V;

    /* renamed from: W */
    public final TextView f35410W;

    /* renamed from: X */
    public final TextView f35411X;

    /* renamed from: Y */
    public boolean f35412Y;

    /* renamed from: Z */
    public final C13601g f35413Z;

    /* renamed from: p */
    public final C58124b f35414p;

    /* renamed from: p0 */
    public final C13601g f35415p0;

    /* renamed from: q */
    public final C12288c f35416q;

    /* renamed from: r */
    public final String f35417r;

    /* renamed from: s */
    public final View f35418s;

    /* renamed from: t */
    public final ViewPager f35419t;

    /* renamed from: u */
    public final FinderLiveGiftTagView f35420u;

    /* renamed from: v */
    public final TextView f35421v;

    /* renamed from: w */
    public final LiveBottomSheetPanel f35422w;

    /* renamed from: x */
    public final TextView f35423x;

    /* renamed from: x0 */
    public final C13601g f35424x0;

    /* renamed from: y */
    public final FinderLiveLevelProgressView f35425y;

    /* renamed from: y0 */
    public boolean f35426y0;

    /* renamed from: z */
    public final View f35427z;

    /* renamed from: qj1.d7$a */
    public static final class C12283a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12283a(C12282d7 d7Var) {
            super(1);
            this.f35428d = d7Var;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f35428d.f35394J = false;
                this.f35428d.mo11996q1();
            } else {
                this.f35428d.mo10792g(8);
                C58124b.C7172a.m7372a(this.f35428d.f35414p, C58124b.C58125b.LIVE_EVENT_HIDE_GIFT_PANEL, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.d7$a0 */
    public static final class C12284a0 implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35429d;

        /* renamed from: qj1.d7$a0$a */
        public static final class C12285a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C12282d7 f35430d;

            /* renamed from: e */
            public final /* synthetic */ int f35431e;

            public C12285a(C12282d7 d7Var, int i) {
                this.f35430d = d7Var;
                this.f35431e = i;
            }

            public final void run() {
                this.f35430d.f35420u.mo3237b(this.f35431e);
            }
        }

        public C12284a0(C12282d7 d7Var) {
            this.f35429d = d7Var;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
            this.f35429d.mo11988g1();
        }

        public void onPageSelected(int i) {
            C12282d7 d7Var = this.f35429d;
            d7Var.f35420u.post(new C12285a(d7Var, i));
        }
    }

    /* renamed from: qj1.d7$b */
    public static final class C12286b extends C87413o implements C32226l<C12289d, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12286b(C12282d7 d7Var) {
            super(1);
            this.f35432d = d7Var;
        }

        public Object invoke(Object obj) {
            C12289d dVar = (C12289d) obj;
            C87412m.m108594g(dVar, "contact");
            String str = this.f35432d.f35417r;
            Log.m105924i(str, "bottomSheetClickListener contact:" + dVar);
            C12282d7.m11832a1(this.f35432d, dVar);
            C12282d7.m11831Z0(this.f35432d);
            this.f35432d.f35398N.mo5072g();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.d7$b0 */
    public static final class C12287b0 extends C87413o implements C32227p<Long, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12287b0(C12282d7 d7Var) {
            super(2);
            this.f35433d = d7Var;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj2).longValue();
            C12282d7 d7Var = this.f35433d;
            if (longValue2 != d7Var.f35393I) {
                String str = d7Var.f35417r;
                Log.m105924i(str, "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + this.f35433d.f35393I);
            } else {
                C61926c.m72668M(new C12598p7(d7Var, longValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.d7$c */
    public enum C12288c {
        VISITOR,
        ANCHOR_SELECT
    }

    /* renamed from: qj1.d7$d */
    public static final class C12289d {

        /* renamed from: a */
        public String f35437a;

        /* renamed from: b */
        public String f35438b;

        /* renamed from: c */
        public String f35439c;

        /* renamed from: d */
        public boolean f35440d;

        public C12289d(String str, String str2, String str3) {
            this.f35437a = str;
            this.f35438b = str2;
            this.f35439c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12289d)) {
                return false;
            }
            C12289d dVar = (C12289d) obj;
            return C87412m.m108589b(this.f35437a, dVar.f35437a) && C87412m.m108589b(this.f35438b, dVar.f35438b) && C87412m.m108589b(this.f35439c, dVar.f35439c);
        }

        public int hashCode() {
            String str = this.f35437a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f35438b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f35439c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "username=" + this.f35437a + ", nickname=" + this.f35438b;
        }
    }

    /* renamed from: qj1.d7$e */
    public static final class C12290e<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ ImageView f35441a;

        /* renamed from: b */
        public final /* synthetic */ C12282d7 f35442b;

        public C12290e(ImageView imageView, C12282d7 d7Var) {
            this.f35441a = imageView;
            this.f35442b = d7Var;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C12359e7((Bitmap) obj, this.f35441a, this.f35442b));
        }
    }

    /* renamed from: qj1.d7$f */
    public static final class C12291f<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ ImageView f35443a;

        /* renamed from: b */
        public final /* synthetic */ C12282d7 f35444b;

        public C12291f(ImageView imageView, C12282d7 d7Var) {
            this.f35443a = imageView;
            this.f35444b = d7Var;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C12387f7((Bitmap) obj, this.f35443a, this.f35444b));
        }
    }

    /* renamed from: qj1.d7$g */
    public static final class C12292g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C12289d, C13598b0> f35445d;

        /* renamed from: e */
        public final /* synthetic */ C12289d f35446e;

        public C12292g(C32226l<? super C12289d, C13598b0> lVar, C12289d dVar) {
            this.f35445d = lVar;
            this.f35446e = dVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$createBottomSheetItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f35445d.invoke(this.f35446e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$createBottomSheetItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.d7$h */
    public static final class C12293h extends C87413o implements C32226l<C8916d, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<String> f35447d;

        /* renamed from: e */
        public final /* synthetic */ C12282d7 f35448e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12293h(ArrayList<String> arrayList, C12282d7 d7Var) {
            super(1);
            this.f35447d = arrayList;
            this.f35448e = d7Var;
        }

        public Object invoke(Object obj) {
            C8916d dVar = (C8916d) obj;
            C87412m.m108594g(dVar, LocaleUtil.ITALIAN);
            boolean z = !this.f35447d.contains(dVar.field_rewardProductId);
            if (z) {
                Log.m105924i(this.f35448e.f35417r, "getCacheGiftList remove:" + dVar.field_rewardProductId + ", notExistInTab");
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: qj1.d7$i */
    public static final class C12294i extends C87413o implements C32224a<C16200d> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35449d;

        /* renamed from: e */
        public final /* synthetic */ C12282d7 f35450e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12294i(ViewGroup viewGroup, C12282d7 d7Var) {
            super(0);
            this.f35449d = viewGroup;
            this.f35450e = d7Var;
        }

        public Object invoke() {
            Context context = this.f35449d.getContext();
            C87412m.m108593f(context, "root.context");
            return new C16200d(context, this.f35449d, new C12448i7(this.f35450e));
        }
    }

    /* renamed from: qj1.d7$j */
    public static final class C12295j extends C87413o implements C32224a<C16203f> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35451d;

        /* renamed from: e */
        public final /* synthetic */ C12282d7 f35452e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12295j(ViewGroup viewGroup, C12282d7 d7Var) {
            super(0);
            this.f35451d = viewGroup;
            this.f35452e = d7Var;
        }

        public Object invoke() {
            Context context = this.f35451d.getContext();
            C87412m.m108593f(context, "root.context");
            return new C16203f(context, this.f35451d, this.f35452e.f35405S0);
        }
    }

    /* renamed from: qj1.d7$k */
    public static final class C12296k extends C87413o implements C32224a<C16210j> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12296k(ViewGroup viewGroup) {
            super(0);
            this.f35453d = viewGroup;
        }

        public Object invoke() {
            Context context = this.f35453d.getContext();
            C87412m.m108593f(context, "root.context");
            return new C16210j(context, this.f35453d);
        }
    }

    /* renamed from: qj1.d7$l */
    public static final class C12297l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12297l(C12282d7 d7Var) {
            super(0);
            this.f35454d = d7Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
            if (r1 != false) goto L_0x004a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r5 = this;
                qj1.d7 r0 = r5.f35454d
                r1 = 1
                r0.f35394J = r1
                qj1.d7 r0 = r5.f35454d
                java.lang.String r0 = r0.f35417r
                java.lang.String r2 = "hideGiftListContent"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                qj1.d7 r0 = r5.f35454d
                com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r0.f35422w
                r0.mo78802a()
                qj1.d7 r0 = r5.f35454d
                r0.mo11988g1()
                qj1.d7 r0 = r5.f35454d
                qk1.s1 r0 = r0.f35385A
                r0.mo12367b()
                r0 = 0
                t91.C64208c.f181968r = r0
                qj1.d7 r2 = r5.f35454d
                qj1.d7$c r3 = r2.f35416q
                qj1.d7$c r4 = qj1.C12282d7.C12288c.ANCHOR_SELECT
                if (r3 != r4) goto L_0x006d
                ig1.d r3 = r2.f35403R0
                if (r3 == 0) goto L_0x006d
                boolean r3 = r3.mo9723n2()
                if (r3 == 0) goto L_0x004a
                java.lang.Class<cl1.x> r3 = cl1.C0696x.class
                androidx.lifecycle.i0 r3 = r2.mo87696x0(r3)
                cl1.x r3 = (cl1.C0696x) r3
                te3.ly0 r3 = r3.f1644g
                if (r3 == 0) goto L_0x0047
                boolean r3 = r3.f137707e
                if (r3 != r1) goto L_0x0047
                goto L_0x0048
            L_0x0047:
                r1 = 0
            L_0x0048:
                if (r1 == 0) goto L_0x006a
            L_0x004a:
                java.lang.Class<cl1.z> r0 = cl1.C0700z.class
                androidx.lifecycle.i0 r0 = r2.mo87696x0(r0)
                cl1.z r0 = (cl1.C0700z) r0
                fj1.b r1 = r0.f107146d
                java.lang.Class<cl1.o> r3 = cl1.C54991o.class
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                cl1.o r1 = (cl1.C54991o) r1
                boolean r1 = r1.f154305d3
                if (r1 == 0) goto L_0x0063
                com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Boolean> r0 = r0.f1659h
                goto L_0x0065
            L_0x0063:
                com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Boolean> r0 = r0.f1660i
            L_0x0065:
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.postValue(r1)
            L_0x006a:
                r0 = 0
                r2.f35403R0 = r0
            L_0x006d:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12282d7.C12297l.invoke():java.lang.Object");
        }
    }

    /* renamed from: qj1.d7$m */
    public static final class C12298m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35455d;

        public C12298m(C12282d7 d7Var) {
            this.f35455d = d7Var;
        }

        public final void run() {
            this.f35455d.mo11989h1();
        }
    }

    /* renamed from: qj1.d7$n */
    public static final class C12299n<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35456d;

        public C12299n(C12282d7 d7Var) {
            this.f35456d = d7Var;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            String str = this.f35456d.f35417r;
            Log.m105924i(str, "receive panelOpenSwitch " + bool);
            if (C87412m.m108589b(bool, Boolean.TRUE)) {
                C12282d7.m11835p1(this.f35456d, (C12289d) null, (String) null, 3, (Object) null);
            } else {
                this.f35456d.mo11989h1();
            }
        }
    }

    /* renamed from: qj1.d7$o */
    public static final class C12300o<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35457d;

        public C12300o(C12282d7 d7Var) {
            this.f35457d = d7Var;
        }

        public void onChanged(Object obj) {
            C0700z.C0701a aVar = (C0700z.C0701a) obj;
            if (aVar != null && this.f35457d.mo11990i1(aVar.f1666d)) {
                C58124b bVar = this.f35457d.f35414p;
                C58124b.C58125b bVar2 = C58124b.C58125b.LIVE_EVENT_GIFT_SHOW_SEND_BTN;
                Bundle bundle = new Bundle();
                bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", aVar.f1666d);
                bundle.putSerializable("PARAM_FINDER_LIVE_SEND_GIFT_DATA", aVar);
                C13598b0 b0Var = C13598b0.f38549a;
                bVar.statusChange(bVar2, bundle);
            }
        }
    }

    /* renamed from: qj1.d7$p */
    public static final class C12301p<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35458d;

        public C12301p(C12282d7 d7Var) {
            this.f35458d = d7Var;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            Class cls = C55001u.class;
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                this.f35458d.f35426y0 = false;
                FinderLiveService.f159376d.getClass();
                C54795n5 n5Var = FinderLiveService.f159396y;
                if (n5Var != null) {
                    n5Var.mo75755w(((C55001u) this.f35458d.mo87696x0(cls)).f154420q.f182392d, ((C55001u) this.f35458d.mo87696x0(cls)).f154416j, ((C55001u) this.f35458d.mo87696x0(cls)).f154423t, 1, new C12484k7(this.f35458d));
                    return;
                }
                return;
            }
            this.f35458d.f35426y0 = true;
        }
    }

    /* renamed from: qj1.d7$q */
    public static final class C12302q extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12302q(C12282d7 d7Var) {
            super(0);
            this.f35459d = d7Var;
        }

        public Object invoke() {
            if (this.f35459d.mo14483f0() != 0) {
                C58124b.C7172a.m7372a(this.f35459d.f35414p, C58124b.C58125b.LIVE_EVENT_SHOW_GIFT_PANEL, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.d7$r */
    public static final class C12303r implements C10757d.C10758a {

        /* renamed from: a */
        public final /* synthetic */ C12282d7 f35460a;

        public C12303r(C12282d7 d7Var) {
            this.f35460a = d7Var;
        }

        /* renamed from: a */
        public final void mo9998a(C10757d dVar, Boolean bool) {
            C87412m.m108593f(bool, "isCloseManually");
            if (bool.booleanValue()) {
                C12282d7 d7Var = this.f35460a;
                d7Var.mo11994o1(d7Var.f35402R, d7Var.f35404S);
            }
        }
    }

    /* renamed from: qj1.d7$s */
    public static final class C12304s implements C10753a {

        /* renamed from: a */
        public final /* synthetic */ C12282d7 f35461a;

        public C12304s(C12282d7 d7Var) {
            this.f35461a = d7Var;
        }

        /* renamed from: a */
        public final void mo10987a() {
            C56032b F0 = this.f35461a.mo14482F0();
            if (F0 != null) {
                F0.changeScreenToPortrait();
            }
        }
    }

    /* renamed from: qj1.d7$t */
    public static final class C12305t implements C4191v0.C4192a {

        /* renamed from: a */
        public final /* synthetic */ C12282d7 f35462a;

        public C12305t(C12282d7 d7Var) {
            this.f35462a = d7Var;
        }

        public final void onDismiss() {
            C12282d7 d7Var = this.f35462a;
            d7Var.mo11994o1(d7Var.f35402R, d7Var.f35404S);
        }
    }

    /* renamed from: qj1.d7$u */
    public static final class C12306u implements C16011a {

        /* renamed from: a */
        public boolean f35463a;

        /* renamed from: b */
        public final /* synthetic */ C12282d7 f35464b;

        /* renamed from: c */
        public final /* synthetic */ ViewGroup f35465c;

        public C12306u(C12282d7 d7Var, ViewGroup viewGroup) {
            this.f35464b = d7Var;
            this.f35465c = viewGroup;
        }

        /* renamed from: a */
        public void mo12005a(ViewGroup viewGroup, C8916d dVar) {
            boolean z;
            C87412m.m108594g(viewGroup, "view");
            C87412m.m108594g(dVar, "giftInfo");
            if (!this.f35463a) {
                C62042e eVar = C62042e.f176370a;
                int i = eVar.mo87106p0().getInt("BATCH_SELECT_SHOW_NUM_KEY", 0);
                if (i > 3) {
                    Log.m105924i("FinderLiveGiftUtil", "isEnableShowBatchToastWidget: " + i);
                    z = false;
                } else {
                    z = !DateUtils.isToday(eVar.mo87106p0().getLong("BATCH_SELECT_SHOW_TIME_KEY", 0));
                }
                if (z) {
                    String str = dVar.field_rewardProductId;
                    C87412m.m108593f(str, "giftInfo.field_rewardProductId");
                    ((C16210j) ((C36570n) this.f35464b.f35415p0).getValue()).mo14732d(viewGroup, str);
                    this.f35463a = true;
                    eVar.mo87106p0().putInt("BATCH_SELECT_SHOW_NUM_KEY", eVar.mo87106p0().getInt("BATCH_SELECT_SHOW_NUM_KEY", 0) + 1);
                    eVar.mo87106p0().putLong("BATCH_SELECT_SHOW_TIME_KEY", System.currentTimeMillis());
                }
            }
        }

        /* renamed from: b */
        public void mo12006b(ViewGroup viewGroup, String str) {
            C87412m.m108594g(viewGroup, "view");
            C87412m.m108594g(str, "giftId");
            C12282d7 d7Var = this.f35464b;
            d7Var.f35397M = str;
            C0639y1 y1Var = C0639y1.f1510a;
            y1Var.mo614f(str, false);
            if (d7Var.f35397M != null) {
                Object obj = d7Var.f35396L;
                if (obj instanceof Vibrator) {
                    ((Vibrator) obj).vibrate(50);
                }
            }
            C8916d d = y1Var.mo612d(str);
            if (d != null) {
                ViewGroup viewGroup2 = this.f35465c;
                C12282d7 d7Var2 = this.f35464b;
                if (d.mo9721l2().size() == 0) {
                    C76912y0.m92773l(viewGroup2.getContext(), viewGroup2.getContext().getString(C0966R.string.n1w));
                    d7Var2.mo11988g1();
                    return;
                }
                ((C16210j) ((C36570n) d7Var2.f35415p0).getValue()).mo14731c();
                d7Var2.f35385A.mo12368c(str, 1);
                C16203f fVar = (C16203f) ((C36570n) d7Var2.f35424x0).getValue();
                fVar.getClass();
                fVar.f43413h = d;
                LinkedList<C50900q11> l2 = d.mo9721l2();
                if (l2.size() == 0) {
                    fVar.mo14737a();
                    return;
                }
                View view = fVar.f43409d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                fVar.f43409d.getViewTreeObserver().addOnPreDrawListener(new C16209i(fVar, viewGroup));
                fVar.f43411f.clear();
                fVar.f43411f.addAll(l2);
                fVar.f43412g.notifyItemRangeChanged(0, fVar.f43411f.size());
                ViewGroup.LayoutParams layoutParams = fVar.f43414i.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = 0;
                }
                fVar.f43409d.requestLayout();
                fVar.f43407b.removeView(fVar.f43409d);
                fVar.f43407b.addView(fVar.f43409d);
            }
        }

        /* renamed from: c */
        public void mo12007c(ViewGroup viewGroup, String str) {
            C87412m.m108594g(viewGroup, "view");
            C87412m.m108594g(str, "giftId");
            String str2 = this.f35464b.f35417r;
            Log.m105924i(str2, "onGiftItemClick giftId:" + str + " click,panelHiding:" + this.f35464b.f35394J + '!');
            C12282d7 d7Var = this.f35464b;
            C0639y1 y1Var = C0639y1.f1510a;
            d7Var.f35403R0 = y1Var.mo612d(str);
            this.f35464b.mo11988g1();
            C12282d7 d7Var2 = this.f35464b;
            boolean z = false;
            boolean z2 = true;
            if (d7Var2.f35416q == C12288c.ANCHOR_SELECT) {
                C8916d dVar = d7Var2.f35403R0;
                if (dVar != null && dVar.mo9723n2()) {
                    C50326ly0 ly02 = ((C0696x) this.f35464b.mo87696x0(C0696x.class)).f1644g;
                    if (ly02 != null && !ly02.f137707e) {
                        z = true;
                    }
                    if (z) {
                        C58124b bVar = this.f35464b.f35414p;
                        C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_ANCHOR_FANS_CLUB;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_FANS_FROM_WISH", true);
                        C13598b0 b0Var = C13598b0.f38549a;
                        bVar.statusChange(bVar2, bundle);
                        this.f35464b.mo11989h1();
                    }
                }
                ((C0700z) this.f35464b.mo87696x0(C0700z.class)).f1661j.postValue(y1Var.mo612d(str));
                this.f35464b.mo11989h1();
            } else if (!d7Var2.f35394J) {
                y1Var.mo614f(str, true);
                Log.m105924i(this.f35464b.f35417r, "onGiftItemClick start Preview");
                C12282d7 d7Var3 = this.f35464b;
                d7Var3.f35397M = str;
                C8916d dVar2 = d7Var3.f35403R0;
                String str3 = dVar2 != null ? dVar2.field_description : null;
                if (!(str3 == null || str3.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    this.f35464b.f35385A.mo12368c(str, 2);
                } else {
                    this.f35464b.f35385A.mo12368c(str, 0);
                }
                ((C16200d) ((C36570n) this.f35464b.f35413Z).getValue()).mo14732d(viewGroup, str);
                Log.m105924i(this.f35464b.f35417r, "onGiftItemClick end Preview");
                if (this.f35464b.f35414p.getLiveRole() == 0) {
                    ((C54116w) C86312j.m106911c(C54116w.class)).nv0(C0076j0.CLICK_GIFT_BOARD_INNER_GITF, str, 0);
                }
            }
        }

        /* renamed from: d */
        public void mo12008d(String str, int i) {
            C87412m.m108594g(str, "giftId");
            String str2 = this.f35464b.f35417r;
            Log.m105924i(str2, "on gift batch send, giftId: " + str + ", batchNum: " + i);
            C12282d7.m11833j1(this.f35464b, (ViewGroup) null, str, i, false, false, 17, (Object) null);
        }

        /* renamed from: e */
        public void mo12009e(ViewGroup viewGroup, String str, boolean z) {
            C87412m.m108594g(viewGroup, "view");
            C87412m.m108594g(str, "giftId");
            C12282d7.m11833j1(this.f35464b, viewGroup, str, 0, false, z, 12, (Object) null);
        }
    }

    /* renamed from: qj1.d7$v */
    public static final class C12307v extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12289d f35466d;

        /* renamed from: e */
        public final /* synthetic */ C12282d7 f35467e;

        /* renamed from: f */
        public final /* synthetic */ String f35468f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12307v(C12289d dVar, C12282d7 d7Var, String str) {
            super(0);
            this.f35466d = dVar;
            this.f35467e = d7Var;
            this.f35468f = str;
        }

        public Object invoke() {
            C12289d dVar = this.f35466d;
            if (dVar != null) {
                if (Util.isEqual(dVar.f35437a, ((C54991o) this.f35467e.mo87696x0(C54991o.class)).f154345o)) {
                    C12282d7 d7Var = this.f35467e;
                    C58969q d1 = d7Var.mo11985d1();
                    String str = null;
                    String nickname = d1 != null ? d1.getNickname() : null;
                    C58969q d15 = this.f35467e.mo11985d1();
                    if (d15 != null) {
                        str = d15.getAvatarUrl();
                    }
                    C12282d7.m11832a1(d7Var, new C12289d("", nickname, str));
                } else {
                    C12282d7.m11832a1(this.f35467e, this.f35466d);
                }
            }
            C12282d7 d7Var2 = this.f35467e;
            String str2 = this.f35468f;
            String str3 = d7Var2.f35417r;
            Log.m105924i(str3, "refreshSingSongName: songName = " + str2);
            d7Var2.f35404S = str2;
            Log.m105924i(this.f35467e.f35417r, "showGiftListContent");
            this.f35467e.mo10792g(0);
            this.f35467e.f35423x.setVisibility(8);
            View view = this.f35467e.f35427z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$showGiftListContent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$showGiftListContent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f35467e.f35422w.mo78804d();
            C12282d7.m11831Z0(this.f35467e);
            C64208c.f181968r = true;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.d7$w */
    public static final class C12308w extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f35469d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f35470e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f35471f;

        public C12308w(C8478d0 d0Var, C8478d0 d0Var2, C8478d0 d0Var3) {
            this.f35469d = d0Var;
            this.f35470e = d0Var2;
            this.f35471f = d0Var3;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int N0 = recyclerView.mo17029N0(view);
            rect.left = 0;
            int i = this.f35469d.f27483d;
            rect.right = N0 % i == i + -1 ? this.f35470e.f27483d : 0;
            rect.top = N0 >= i ? this.f35471f.f27483d : 0;
            rect.bottom = 0;
        }
    }

    /* renamed from: qj1.d7$x */
    public static final class C12309x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35472d;

        public C12309x(C12282d7 d7Var) {
            this.f35472d = d7Var;
        }

        public final void run() {
            FinderLiveGiftTagView finderLiveGiftTagView = this.f35472d.f35420u;
            finderLiveGiftTagView.mo3237b(finderLiveGiftTagView.getRv().getChildCount() - 1);
            this.f35472d.f35420u.getRv().getChildAt(this.f35472d.f35420u.getRv().getChildCount() - 1).performClick();
        }
    }

    /* renamed from: qj1.d7$y */
    public static final class C12310y extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12310y(C12282d7 d7Var) {
            super(1);
            this.f35473d = d7Var;
        }

        public Object invoke(Object obj) {
            this.f35473d.f35419t.setCurrentItem(((Number) obj).intValue(), false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.d7$z */
    public static final class C12311z extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12282d7 f35474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12311z(C12282d7 d7Var) {
            super(0);
            this.f35474d = d7Var;
        }

        public Object invoke() {
            this.f35474d.mo11988g1();
            return C13598b0.f38549a;
        }
    }

    static {
        String string = MMApplicationContext.getResources().getString(C0966R.string.dg_);
        C87412m.m108593f(string, "getResources().getString…nder_live_anchor_tag_txt)");
        f35384U0 = string;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12282d7(android.view.ViewGroup r22, d60.C58124b r23, qj1.C12282d7.C12288c r24) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r0 = r23
            r8 = r24
            java.lang.String r1 = "root"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "statusMonitor"
            gy3.C87412m.m108594g(r0, r1)
            r9 = 0
            r6.<init>(r7, r0, r9)
            r6.f35414p = r0
            r6.f35416q = r8
            java.lang.String r0 = "Finder.FinderLiveGiftPanelPlugin"
            r6.f35417r = r0
            qk1.s1 r0 = new qk1.s1
            r0.<init>()
            r6.f35385A = r0
            android.content.Context r1 = r22.getContext()
            java.lang.String r2 = "vibrator"
            java.lang.Object r1 = r1.getSystemService(r2)
            r6.f35396L = r1
            com.tencent.mm.plugin.finder.view.v0 r10 = new com.tencent.mm.plugin.finder.view.v0
            android.content.Context r1 = r22.getContext()
            r10.<init>(r1)
            r6.f35398N = r10
            qj1.d7$i r1 = new qj1.d7$i
            r1.<init>(r7, r6)
            rx3.g r1 = rx3.C36568h.m40985a(r1)
            r6.f35413Z = r1
            qj1.d7$k r1 = new qj1.d7$k
            r1.<init>(r7)
            rx3.g r1 = rx3.C36568h.m40985a(r1)
            r6.f35415p0 = r1
            qj1.d7$j r1 = new qj1.d7$j
            r1.<init>(r7, r6)
            rx3.g r1 = rx3.C36568h.m40985a(r1)
            r6.f35424x0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.f35401Q0 = r1
            r1 = 2131303579(0x7f091c9b, float:1.8225276E38)
            android.view.View r1 = r7.findViewById(r1)
            java.lang.String r2 = "root.findViewById(com.te…live_gift_panel_title_tv)"
            gy3.C87412m.m108593f(r1, r2)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6.f35421v = r5
            wc1.b r1 = wc1.C15064b.f41199a
            android.content.Context r12 = r22.getContext()
            java.lang.String r2 = "root.context"
            gy3.C87412m.m108593f(r12, r2)
            r14 = 1097859072(0x41700000, float:15.0)
            r15 = 0
            r16 = 8
            r17 = 0
            r11 = r1
            r13 = r5
            wc1.C15064b.m14230a(r11, r12, r13, r14, r15, r16, r17)
            r3 = 2131303574(0x7f091c96, float:1.8225266E38)
            android.view.View r3 = r7.findViewById(r3)
            java.lang.String r4 = "root.findViewById(R.id.f…live_gift_panel_icon_btn)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 2131303569(0x7f091c91, float:1.8225256E38)
            android.view.View r4 = r7.findViewById(r4)
            java.lang.String r11 = "root.findViewById(R.id.f…ve_gift_panel_blank_area)"
            gy3.C87412m.m108593f(r4, r11)
            r6.f35418s = r4
            r11 = 2131303661(0x7f091ced, float:1.8225443E38)
            android.view.View r11 = r7.findViewById(r11)
            java.lang.String r12 = "root.findViewById(R.id.finder_live_gift_viewpager)"
            gy3.C87412m.m108593f(r11, r12)
            r15 = r11
            androidx.viewpager.widget.ViewPager r15 = (androidx.viewpager.widget.ViewPager) r15
            r6.f35419t = r15
            r11 = 2131303646(0x7f091cde, float:1.8225412E38)
            android.view.View r11 = r7.findViewById(r11)
            java.lang.String r12 = "root.findViewById(R.id.f…er_live_gift_tab_rv_root)"
            gy3.C87412m.m108593f(r11, r12)
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView r11 = (com.tencent.p014mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView) r11
            r6.f35420u = r11
            r11 = 2131303573(0x7f091c95, float:1.8225264E38)
            android.view.View r11 = r7.findViewById(r11)
            java.lang.String r12 = "root.findViewById(R.id.f…_gift_panel_content_area)"
            gy3.C87412m.m108593f(r11, r12)
            r14 = r11
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r14 = (com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel) r14
            r6.f35422w = r14
            r11 = 2131303577(0x7f091c99, float:1.8225272E38)
            android.view.View r11 = r7.findViewById(r11)
            java.lang.String r12 = "root.findViewById(R.id.f…ive_gift_panel_retry_tip)"
            gy3.C87412m.m108593f(r11, r12)
            r13 = r11
            android.widget.TextView r13 = (android.widget.TextView) r13
            r6.f35423x = r13
            r11 = 2131303637(0x7f091cd5, float:1.8225394E38)
            android.view.View r11 = r7.findViewById(r11)
            java.lang.String r12 = "root.findViewById(R.id.f…_live_gift_progress_root)"
            gy3.C87412m.m108593f(r11, r12)
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView r11 = (com.tencent.p014mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView) r11
            r6.f35425y = r11
            android.content.Context r12 = r22.getContext()
            gy3.C87412m.m108593f(r12, r2)
            r16 = 1097859072(0x41700000, float:15.0)
            r17 = 0
            r18 = 8
            r19 = 0
            r11 = r1
            r23 = r13
            r9 = r14
            r14 = r16
            r20 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            wc1.C15064b.m14230a(r11, r12, r13, r14, r15, r16, r17)
            r11 = 2131303576(0x7f091c98, float:1.822527E38)
            android.view.View r11 = r7.findViewById(r11)
            java.lang.String r12 = "root.findViewById(R.id.f…_live_gift_panel_loading)"
            gy3.C87412m.m108593f(r11, r12)
            r6.f35427z = r11
            r11 = 2131303587(0x7f091ca3, float:1.8225293E38)
            android.view.View r11 = r7.findViewById(r11)
            java.lang.String r12 = "root.findViewById(R.id.f…ive_gift_panel_wecoin_tv)"
            gy3.C87412m.m108593f(r11, r12)
            r13 = r11
            android.widget.TextView r13 = (android.widget.TextView) r13
            r6.f35386B = r13
            android.content.Context r12 = r22.getContext()
            gy3.C87412m.m108593f(r12, r2)
            r14 = 1096810496(0x41600000, float:14.0)
            r15 = 0
            r16 = 8
            r17 = 0
            r11 = r1
            wc1.C15064b.m14230a(r11, r12, r13, r14, r15, r16, r17)
            r1 = 2131303584(0x7f091ca0, float:1.8225286E38)
            android.view.View r15 = r7.findViewById(r1)
            java.lang.String r1 = "root.findViewById(R.id.f…_gift_panel_wecoin_group)"
            gy3.C87412m.m108593f(r15, r1)
            r6.f35387C = r15
            r1 = 2131303585(0x7f091ca1, float:1.8225289E38)
            android.view.View r1 = r7.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.f…e_gift_panel_wecoin_icon)"
            gy3.C87412m.m108593f(r1, r2)
            r6.f35388D = r1
            r1 = 2131303583(0x7f091c9f, float:1.8225284E38)
            android.view.View r1 = r7.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.f…_gift_panel_wecoin_arrow)"
            gy3.C87412m.m108593f(r1, r2)
            r6.f35389E = r1
            r1 = 2131303586(0x7f091ca2, float:1.822529E38)
            android.view.View r1 = r7.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.f…ft_panel_wecoin_progress)"
            gy3.C87412m.m108593f(r1, r2)
            r6.f35390F = r1
            r1 = 2131303554(0x7f091c82, float:1.8225226E38)
            android.view.View r1 = r7.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.finder_live_gift_indicator)"
            gy3.C87412m.m108593f(r1, r2)
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPanelIndicator r1 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftPanelIndicator) r1
            r6.f35395K = r1
            r1 = 2131307884(0x7f092d6c, float:1.8234008E38)
            android.view.View r1 = r7.findViewById(r1)
            java.lang.String r2 = "root.findViewById(com.te…pi.R.id.ll_choose_target)"
            gy3.C87412m.m108593f(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r6.f35406T = r1
            r2 = 2131307918(0x7f092d8e, float:1.8234077E38)
            android.view.View r2 = r7.findViewById(r2)
            java.lang.String r11 = "root.findViewById(com.te…R.id.ll_want_listen_song)"
            gy3.C87412m.m108593f(r2, r11)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r6.f35408U = r2
            r2 = 2131303582(0x7f091c9e, float:1.8225282E38)
            android.view.View r2 = r7.findViewById(r2)
            java.lang.String r11 = "root.findViewById(com.te…anel_want_listen_song_tv)"
            gy3.C87412m.m108593f(r2, r11)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r6.f35411X = r2
            r2 = 2131303571(0x7f091c93, float:1.822526E38)
            android.view.View r2 = r7.findViewById(r2)
            java.lang.String r11 = "root.findViewById(com.te…t_panel_choose_target_tv)"
            gy3.C87412m.m108593f(r2, r11)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r6.f35410W = r2
            r2 = 2131303570(0x7f091c92, float:1.8225258E38)
            android.view.View r2 = r7.findViewById(r2)
            java.lang.String r11 = "root.findViewById(com.te…nel_choose_target_avatar)"
            gy3.C87412m.m108593f(r2, r11)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r6.f35409V = r2
            qj1.d7$a r2 = new qj1.d7$a
            r2.<init>(r6)
            r9.setOnVisibilityListener(r2)
            r11 = r20
            r11.setAdapter(r0)
            r3.setOnClickListener(r6)
            r4.setOnClickListener(r6)
            r15.setOnClickListener(r6)
            r11 = r23
            r11.setOnClickListener(r6)
            r1.setOnClickListener(r6)
            java.lang.String r2 = "finder_live_room_gift_back_icon"
            r11 = 0
            r12 = 4
            r13 = 0
            r0 = r21
            r1 = r3
            r3 = r11
            r11 = r4
            r4 = r12
            r12 = r5
            r5 = r13
            m11834n1(r0, r1, r2, r3, r4, r5)
            java.lang.String r2 = "finder_live_room_gift_blank"
            r3 = 0
            r4 = 4
            r5 = 0
            r1 = r11
            m11834n1(r0, r1, r2, r3, r4, r5)
            java.lang.String r2 = "finder_live_room_wecoin_icon"
            r1 = r15
            m11834n1(r0, r1, r2, r3, r4, r5)
            android.content.Context r0 = r22.getContext()
            int r0 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r0)
            boolean r1 = r21.mo82893g0()
            if (r1 != 0) goto L_0x026a
            android.content.Context r1 = r22.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            float r1 = (float) r1
            r9.setTranslationY(r1)
            int r1 = r9.getPaddingLeft()
            int r2 = r9.getPaddingTop()
            int r3 = r9.getPaddingRight()
            int r4 = r9.getPaddingBottom()
            int r4 = r4 + r0
            r9.setPadding(r1, r2, r3, r4)
            goto L_0x0288
        L_0x026a:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            android.content.Context r1 = r22.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            r0.width = r1
            android.content.Context r0 = r22.getContext()
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
            int r0 = r0.x
            float r0 = (float) r0
            r9.setTranslationX(r0)
        L_0x0288:
            r0 = 0
            t91.C64208c.f181968r = r0
            qj1.d7$d r1 = new qj1.d7$d
            fe1.q r2 = r21.mo11985d1()
            if (r2 == 0) goto L_0x0298
            java.lang.String r2 = r2.getNickname()
            goto L_0x029a
        L_0x0298:
            java.lang.String r2 = f35384U0
        L_0x029a:
            fe1.q r3 = r21.mo11985d1()
            if (r3 == 0) goto L_0x02a5
            java.lang.String r9 = r3.getAvatarUrl()
            goto L_0x02a6
        L_0x02a5:
            r9 = 0
        L_0x02a6:
            java.lang.String r3 = ""
            r1.<init>(r3, r2, r9)
            r6.f35402R = r1
            r1 = 2131494958(0x7f0c082e, float:1.861344E38)
            r10.mo5070e(r1)
            r1 = 1
            r10.f18469o = r1
            r10.mo5067b(r0)
            android.view.View r1 = r10.f18463f
            if (r1 == 0) goto L_0x02f1
            android.view.ViewGroup r1 = r10.f18480z
            r2 = 2131235385(0x7f081239, float:1.8086962E38)
            r1.setBackgroundResource(r2)
            android.view.View r1 = r10.f18474t
            android.content.Context r2 = r10.f18462e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099793(0x7f060091, float:1.781195E38)
            int r2 = r2.getColor(r3)
            r1.setBackgroundColor(r2)
            android.widget.TextView r1 = r10.f18475u
            android.content.Context r2 = r10.f18462e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099704(0x7f060038, float:1.7811769E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.TextView r1 = r10.f18475u
            r2 = 2131231868(0x7f08047c, float:1.807983E38)
            r1.setBackgroundResource(r2)
        L_0x02f1:
            android.view.View r1 = r10.f18463f
            r2 = 2131307882(0x7f092d6a, float:1.8234004E38)
            android.view.View r1 = r1.findViewById(r2)
            java.lang.String r2 = "chooseTargetSheet.rootVi…l_bottom_sheet_container)"
            gy3.C87412m.m108593f(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r6.f35399P = r1
            qj1.d7$b r1 = new qj1.d7$b
            r1.<init>(r6)
            r6.f35400Q = r1
            ok1.e r1 = ok1.C62042e.f176370a
            fj1.b r2 = r21.mo87684A0()
            boolean r1 = r1.mo87073d1(r2)
            if (r1 != 0) goto L_0x0319
            r21.mo11991l1()
        L_0x0319:
            qj1.d7$c r1 = qj1.C12282d7.C12288c.ANCHOR_SELECT
            if (r8 != r1) goto L_0x0377
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131829078(0x7f112156, float:1.9291115E38)
            java.lang.String r1 = r1.getString(r2)
            r12.setText(r1)
            r1 = 8
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin"
            java.lang.String r14 = "handlerOptionMode"
            java.lang.String r1 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r15
            r3 = r15
            r15 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r2.mo10231a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin"
            java.lang.String r13 = "handlerOptionMode"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r11 = r3
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x038b
        L_0x0377:
            android.view.ViewGroup r0 = r6.f166287d
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131827578(0x7f111b7a, float:1.9288073E38)
            java.lang.String r0 = r0.getString(r1)
            r12.setText(r0)
        L_0x038b:
            qj1.d7$u r0 = new qj1.d7$u
            r0.<init>(r6, r7)
            r6.f35405S0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12282d7.<init>(android.view.ViewGroup, d60.b, qj1.d7$c):void");
    }

    /* renamed from: Z0 */
    public static final void m11831Z0(C12282d7 d7Var) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (d7Var.f35416q != C12288c.ANCHOR_SELECT) {
            if (((ArrayList) d7Var.mo11987f1()).isEmpty()) {
                Log.m105924i(d7Var.f35417r, "refreshSendGiftTargetTitleLayout: validList is empty");
                d7Var.f35406T.setVisibility(8);
                String str = d7Var.f35404S;
                if (!(str == null || str.length() == 0)) {
                    d7Var.f35411X.setText(d7Var.f166287d.getContext().getResources().getString(C0966R.string.map, new Object[]{d7Var.f35404S}));
                    d7Var.f35408U.setVisibility(0);
                } else {
                    d7Var.f35408U.setVisibility(8);
                }
                d7Var.f35421v.setText(d7Var.f166287d.getContext().getResources().getString(C0966R.string.dor));
                return;
            }
            String str2 = d7Var.f35417r;
            Log.m105924i(str2, "refreshSendGiftTargetTitleLayout: sendGiftTargetContact = " + d7Var.f35402R);
            d7Var.f35406T.setVisibility(0);
            d7Var.f35421v.setText(d7Var.f166287d.getContext().getResources().getString(C0966R.string.dos));
            TextView textView = d7Var.f35410W;
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = d7Var.f35410W.getContext();
            C12289d dVar = d7Var.f35402R;
            textView.setText(hVar.yp0(context, dVar != null ? dVar.f35438b : null, d7Var.f35410W.getTextSize()));
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C12289d dVar2 = d7Var.f35402R;
            C99344b<C100810g0, Bitmap> b = i2.mo85956b(new C62345f(dVar2 != null ? dVar2.f35439c : null, (C27696y) null, 2, (C8480h) null), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            C12551n7 n7Var = new C12551n7(d7Var);
            b.getClass();
            b.f291320d = n7Var;
            b.mo85951a();
        }
    }

    /* renamed from: a1 */
    public static final void m11832a1(C12282d7 d7Var, C12289d dVar) {
        String str = d7Var.f35417r;
        Log.m105924i(str, "refreshTargetContact: contact = " + dVar);
        C12289d dVar2 = d7Var.f35402R;
        if (dVar2 != null) {
            dVar2.f35437a = dVar.f35437a;
        }
        if (dVar2 != null) {
            dVar2.f35438b = dVar.f35438b;
        }
        if (dVar2 != null) {
            dVar2.f35439c = dVar.f35439c;
        }
    }

    /* renamed from: j1 */
    public static void m11833j1(C12282d7 d7Var, ViewGroup viewGroup, String str, int i, boolean z, boolean z2, int i2, Object obj) {
        C8916d d;
        if (obj == null) {
            if ((i2 & 1) != 0) {
                viewGroup = null;
            }
            boolean z3 = true;
            if ((i2 & 4) != 0) {
                i = 1;
            }
            if ((i2 & 8) != 0) {
                z = true;
            }
            if ((i2 & 16) != 0) {
                z2 = false;
            }
            Class cls = C54991o.class;
            d7Var.f35397M = str;
            String str2 = d7Var.f35417r;
            Log.m105924i(str2, "jumpToSendGift curGiftId:" + d7Var.f35397M + " click!, sendGiftTargetContact = " + d7Var.f35402R + ", wecoinBalanceValid = " + d7Var.f35392H);
            d7Var.mo11988g1();
            long currentTimeMillis = System.currentTimeMillis();
            boolean z4 = currentTimeMillis - d7Var.f35407T0 < ((long) 500);
            d7Var.f35407T0 = currentTimeMillis;
            if (!z4) {
                if (!d7Var.f35392H) {
                    C76912y0.m92773l(d7Var.f166287d.getContext(), d7Var.f166287d.getContext().getResources().getString(C0966R.string.dot));
                    return;
                }
                String str3 = d7Var.f35397M;
                if (str3 == null) {
                    str3 = "";
                }
                if (d7Var.mo11990i1(str3)) {
                    ((C54991o) d7Var.mo87696x0(cls)).mo76019q4(Util.safeParseLong(d7Var.f35386B.getText().toString()));
                    if (!(viewGroup == null || (d = C0639y1.f1510a.mo612d(d7Var.f35397M)) == null)) {
                        float f = d.field_price;
                        if (((C54991o) d7Var.mo87696x0(cls)).f154258T1 >= ((long) ((int) f))) {
                            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_gift_send", Float.valueOf(f), C90363p0.m113143b(new C13604l("live_gift_id", d7Var.f35397M)), 25561);
                        }
                    }
                    C0639y1.f1510a.mo614f(d7Var.f35397M, false);
                    if (d7Var.f35397M != null) {
                        Object obj2 = d7Var.f35396L;
                        if (obj2 instanceof Vibrator) {
                            ((Vibrator) obj2).vibrate(50);
                        }
                    }
                    d7Var.mo11989h1();
                    C58124b bVar = d7Var.f35414p;
                    C58124b.C58125b bVar2 = C58124b.C58125b.LIVE_EVENT_GIFT_SHOW_SEND_BTN;
                    Bundle bundle = new Bundle();
                    bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", d7Var.f35397M);
                    String str4 = d7Var.f35404S;
                    if (!(str4 == null || str4.length() == 0)) {
                        z3 = false;
                    }
                    if (!z3) {
                        bundle.putString("PARAM_FINDER_LIVE_SING_SONG_NAME", d7Var.f35404S);
                    }
                    bundle.putInt("PARAM_FINDER_LIVE_GIFT_BATCH_SUM", i);
                    bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", z);
                    bundle.putBoolean("PARAM_FINDER_LIVE_GIFT_IS_PKG", z2);
                    C12289d dVar = d7Var.f35402R;
                    if (dVar != null) {
                        bundle.putString("PARAM_FINDER_LIVE_SEND_GIFT_TARGET_USER_NAME", dVar.f35437a);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                    bVar.statusChange(bVar2, bundle);
                    return;
                }
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpToSendGift");
    }

    /* renamed from: n1 */
    public static void m11834n1(C12282d7 d7Var, View view, String str, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                i = 8;
            }
            d7Var.getClass();
            C10460a.m10392a(view, str);
            C10460a.m10394c(view, i, 25561);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setReportSdkPolicy");
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m11835p1(C12282d7 d7Var, C12289d dVar, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                dVar = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            d7Var.mo11994o1(dVar, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showGiftListContent");
    }

    /* renamed from: T0 */
    public void mo11982T0(Bundle bundle, Object obj) {
        String str = "";
        String str2 = null;
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        String str3 = this.f35417r;
        Log.m105924i(str3, "onPortraitAction action: " + str);
        if (C87412m.m108589b(str, "PORTRAIT_ACTION_CHANGE_GIFT_JUMP_CLICK")) {
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            if (str2 != null) {
                ((C16200d) ((C36570n) this.f35413Z).getValue()).mo14734e(str2);
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        C15883o oVar = (C15883o) mo87687E0(C15883o.class);
        return !(oVar != null && oVar.mo14483f0() == 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00d9  */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo11983b1(qj1.C12282d7.C12289d r12, fy3.C32226l<? super qj1.C12282d7.C12289d, rx3.C13598b0> r13, boolean r14) {
        /*
            r11 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            android.view.ViewGroup r2 = r11.f166287d
            android.content.Context r2 = r2.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131494957(0x7f0c082d, float:1.8613437E38)
            android.view.ViewGroup r4 = r11.f166287d
            r5 = 0
            android.view.View r2 = r2.inflate(r3, r4, r5)
            r3 = 2131297455(0x7f0904af, float:1.8212855E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 2131309954(0x7f093582, float:1.8238206E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r6 = 2131299484(0x7f090c9c, float:1.821697E38)
            android.view.View r6 = r2.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r6
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ny.h r7 = (p629ny.C76979h) r7
            android.view.ViewGroup r8 = r11.f166287d
            android.content.Context r8 = r8.getContext()
            java.lang.String r9 = r12.f35438b
            float r10 = r4.getTextSize()
            android.text.SpannableString r7 = r7.yp0(r8, r9, r10)
            r4.setText(r7)
            r4 = 2
            r7 = 0
            if (r14 != 0) goto L_0x009a
            java.lang.String r14 = r12.f35437a
            if (r14 != 0) goto L_0x0058
            java.lang.String r14 = ""
        L_0x0058:
            boolean r14 = com.tencent.p014mm.storage.C72996z1.m85817T4(r14)
            if (r14 == 0) goto L_0x005f
            goto L_0x009a
        L_0x005f:
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r14 = r14.mo62446e(r1)
            bl3.c r14 = r14.mo62447c(r0)
            pl1.s0 r14 = (pl1.C11990s0) r14
            k60.d r14 = r14.mo11865K1()
            pl1.f r8 = new pl1.f
            java.lang.String r9 = r12.f35439c
            r8.<init>(r9, r7, r4, r7)
            pl1.e0$a r4 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r1 = r7.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r4)
            l60.b r14 = r14.mo85956b(r8, r0)
            qj1.d7$f r0 = new qj1.d7$f
            r0.<init>(r3, r11)
            r14.getClass()
            r14.f291320d = r0
            r14.mo85951a()
            goto L_0x00d4
        L_0x009a:
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r14 = r14.mo62446e(r1)
            bl3.c r14 = r14.mo62447c(r0)
            pl1.s0 r14 = (pl1.C11990s0) r14
            k60.d r14 = r14.mo11872i2()
            pl1.f r8 = new pl1.f
            java.lang.String r9 = r12.f35439c
            r8.<init>(r9, r7, r4, r7)
            pl1.e0$a r4 = pl1.C11978e0.C11979a.AVATAR
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r1 = r7.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r4)
            l60.b r14 = r14.mo85956b(r8, r0)
            qj1.d7$e r0 = new qj1.d7$e
            r0.<init>(r3, r11)
            r14.getClass()
            r14.f291320d = r0
            r14.mo85951a()
        L_0x00d4:
            boolean r14 = r12.f35440d
            if (r14 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r5 = 8
        L_0x00db:
            r6.setVisibility(r5)
            qj1.d7$g r14 = new qj1.d7$g
            r14.<init>(r13, r12)
            r2.setOnClickListener(r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12282d7.mo11983b1(qj1.d7$d, fy3.l, boolean):android.view.View");
    }

    /* renamed from: c1 */
    public final void mo11984c1(String str) {
        String str2 = this.f35417r;
        Log.m105924i(str2, "[dimissPkgRedDot], " + str);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_NEED_SHOW_PKG_REDDOT_BOOLEAN_SYNC, Boolean.FALSE);
        ((C0700z) mo87696x0(C0700z.class)).f1665q.postValue(Boolean.TRUE);
    }

    /* renamed from: d1 */
    public final C58969q mo11985d1() {
        return C58961d.f168673a.mo84155b(((C54991o) mo87696x0(C54991o.class)).f154345o);
    }

    /* renamed from: e1 */
    public final C13604l<List<C8916d>, LinkedHashMap<String, List<String>>> mo11986e1() {
        LinkedHashMap linkedHashMap;
        C13598b0 b0Var;
        Object obj;
        C0639y1 y1Var = C0639y1.f1510a;
        Collection<C8916d> values = C0639y1.f1513d.values();
        ArrayList arrayList = new ArrayList();
        for (T next : values) {
            C8916d dVar = (C8916d) next;
            dVar.mo9724o2();
            if (!C61926c.m72696u(dVar.field_flag, 2)) {
                arrayList.add(next);
            }
        }
        Log.m105924i(this.f35417r, "getCacheGiftList cacheGiftListSize:" + arrayList.size() + " \nlist = " + arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        C0639y1 y1Var2 = C0639y1.f1510a;
        for (List addAll : C0639y1.f1512c.values()) {
            arrayList3.addAll(addAll);
        }
        if (!arrayList3.isEmpty()) {
            C61926c.m72673R(arrayList2, new C12293h(arrayList3, this));
        }
        Log.m105924i(this.f35417r, "getCacheGiftList display cacheGiftListSize:" + arrayList.size() + " \nlist = " + arrayList);
        C0639y1 y1Var3 = C0639y1.f1510a;
        Map<String, List<String>> map = C0639y1.f1512c;
        C87412m.m108593f(map, LocaleUtil.ITALIAN);
        if (!(!map.isEmpty())) {
            map = null;
        }
        if (map != null) {
            linkedHashMap = new LinkedHashMap(C0639y1.f1512c);
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Object value = entry.getValue();
                LinkedList linkedList = value instanceof LinkedList ? (LinkedList) value : null;
                Iterator it4 = linkedList != null ? linkedList.iterator() : null;
                if (it4 != null) {
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        C87412m.m108593f(next2, "iterator.next()");
                        String str = (String) next2;
                        Iterator it5 = arrayList2.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it5.next();
                            if (C87412m.m108589b(((C8916d) obj).field_rewardProductId, str)) {
                                break;
                            }
                        }
                        if (obj == null) {
                            it4.remove();
                        }
                    }
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    Log.m105924i(this.f35417r, "[getCacheGiftList] iterator is null , clear tabInfo");
                    linkedHashMap.clear();
                    break;
                } else if (((List) entry.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        return new C13604l<>(arrayList2, linkedHashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0019 A[SYNTHETIC] */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<al1.C54130j> mo11987f1() {
        /*
            r10 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            androidx.lifecycle.i0 r0 = r10.mo87696x0(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            java.lang.String r1 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r0, r1)
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x005c }
        L_0x0019:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x005c }
            r4 = r3
            al1.j r4 = (al1.C54130j) r4     // Catch:{ all -> 0x005c }
            int r5 = r4.f152009m     // Catch:{ all -> 0x005c }
            r6 = 16
            boolean r5 = o40.C61926c.m72696u(r5, r6)     // Catch:{ all -> 0x005c }
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0053
            java.lang.String r5 = r4.f151999c     // Catch:{ all -> 0x005c }
            er1.j4 r8 = er1.C58739j4.f168176a     // Catch:{ all -> 0x005c }
            boolean r9 = r8.mo83691T(r5)     // Catch:{ all -> 0x005c }
            if (r9 != 0) goto L_0x0045
            boolean r5 = r8.mo83694W(r5)     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r5 = 0
            goto L_0x0046
        L_0x0045:
            r5 = 1
        L_0x0046:
            if (r5 != 0) goto L_0x0053
            java.lang.Boolean r4 = r4.f152016t     // Catch:{ all -> 0x005c }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005c }
            boolean r4 = gy3.C87412m.m108589b(r4, r5)     // Catch:{ all -> 0x005c }
            if (r4 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r6 = 0
        L_0x0054:
            if (r6 == 0) goto L_0x0019
            r1.add(r3)     // Catch:{ all -> 0x005c }
            goto L_0x0019
        L_0x005a:
            monitor-exit(r0)
            return r1
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12282d7.mo11987f1():java.util.List");
    }

    /* renamed from: g1 */
    public final void mo11988g1() {
        ((C16200d) ((C36570n) this.f35413Z).getValue()).mo14731c();
        ((C16210j) ((C36570n) this.f35415p0).getValue()).mo14731c();
        ((C16203f) ((C36570n) this.f35424x0).getValue()).mo14737a();
        this.f35385A.mo12367b();
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h1 */
    public final void mo11989h1() {
        C61926c.m72668M(new C12297l(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    /* renamed from: i1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11990i1(java.lang.String r8) {
        /*
            r7 = this;
            cj1.y1 r0 = cj1.C0639y1.f1510a
            ig1.d r8 = r0.mo612d(r8)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0012
            boolean r2 = r8.mo9723n2()
            if (r2 != r0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0094
            java.lang.Class<cl1.x> r2 = cl1.C0696x.class
            androidx.lifecycle.i0 r2 = r7.mo87696x0(r2)
            cl1.x r2 = (cl1.C0696x) r2
            boolean r2 = r2.f1643f
            if (r2 == 0) goto L_0x0070
            te3.mc0 r2 = cj1.C0639y1.f1523n
            if (r2 == 0) goto L_0x0028
            int r2 = r2.f137947d
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            int r3 = r8.field_unlockIntimacyLevel
            if (r2 < r3) goto L_0x002f
            goto L_0x011e
        L_0x002f:
            com.tencent.mm.plugin.finder.live.view.b r2 = r7.mo14484z0()
            android.view.ViewGroup r3 = r7.f166287d
            android.content.Context r3 = r3.getContext()
            r4 = 2131828926(0x7f1120be, float:1.9290807E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r5 = r8.field_unlockIntimacyLevel
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r1] = r5
            java.lang.String r0 = r3.getString(r4, r0)
            java.lang.String r3 = "root.context.getString(R…ield_unlockIntimacyLevel)"
            gy3.C87412m.m108593f(r0, r3)
            r3 = 2131756031(0x7f1003ff, float:1.9142958E38)
            r2.showCenterCustomizeToast(r0, r3)
            java.lang.String r0 = r7.f35417r
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isGiftEnable unlockIntimacyLevel:"
            r2.append(r3)
            int r8 = r8.field_unlockIntimacyLevel
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            goto L_0x011d
        L_0x0070:
            java.lang.Class<qj1.tg> r8 = qj1.C12677tg.class
            qj1.c r8 = r7.mo87687E0(r8)
            qj1.tg r8 = (qj1.C12677tg) r8
            if (r8 == 0) goto L_0x007f
            qj1.tg$a r0 = qj1.C12677tg.C12678a.GIFT_PANEL
            r8.mo12259b1(r0)
        L_0x007f:
            com.tencent.mm.plugin.finder.live.view.b r8 = r7.mo14484z0()
            qj1.d7$m r0 = new qj1.d7$m
            r0.<init>(r7)
            r8.post(r0)
            java.lang.String r8 = r7.f35417r
            java.lang.String r0 = "isGiftEnable not a fans club member!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x011d
        L_0x0094:
            if (r8 == 0) goto L_0x00a1
            int r2 = r8.field_needUnlock
            if (r2 != r0) goto L_0x009c
            r2 = 1
            goto L_0x009d
        L_0x009c:
            r2 = 0
        L_0x009d:
            if (r2 != r0) goto L_0x00a1
            r2 = 1
            goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            if (r2 == 0) goto L_0x00bb
            android.view.ViewGroup r8 = r7.f166287d
            android.content.Context r8 = r8.getContext()
            android.view.ViewGroup r0 = r7.f166287d
            android.content.Context r0 = r0.getContext()
            r2 = 2131827515(0x7f111b3b, float:1.9287945E38)
            java.lang.String r0 = r0.getString(r2)
            nj3.C76912y0.m92773l(r8, r0)
            goto L_0x011d
        L_0x00bb:
            te3.x11 r2 = cj1.C0639y1.f1522m
            if (r2 == 0) goto L_0x00c2
            int r2 = r2.f144398d
            goto L_0x00c3
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            if (r8 == 0) goto L_0x00c8
            int r3 = r8.field_globalUnlockLevel
            goto L_0x00c9
        L_0x00c8:
            r3 = 0
        L_0x00c9:
            java.lang.String r4 = r7.f35417r
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[isGiftEnable] globalLevel = "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", levelLimit = "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            if (r8 == 0) goto L_0x00ee
            int r8 = r8.field_globalUnlockLevel
            if (r2 < r8) goto L_0x00ee
            goto L_0x011e
        L_0x00ee:
            com.tencent.mm.plugin.finder.live.view.b r8 = r7.mo14484z0()
            android.view.ViewGroup r2 = r7.f166287d
            android.content.Context r2 = r2.getContext()
            r4 = 2131827533(0x7f111b4d, float:1.9287981E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r0[r1] = r5
            java.lang.String r0 = r2.getString(r4, r0)
            java.lang.String r2 = "root.context.getString(\n…                        )"
            gy3.C87412m.m108593f(r0, r2)
            wk1.r r2 = new wk1.r
            r4 = 3
            r5 = 0
            r2.<init>(r5, r5, r4, r5)
            wk1.r$k r2 = wk1.C15465r.f41958c
            int r2 = r2.mo14283a(r3)
            r8.showCenterCustomizeToast(r0, r2)
        L_0x011d:
            r0 = 0
        L_0x011e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12282d7.mo11990i1(java.lang.String):boolean");
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        mo11989h1();
        if (this.f35414p.getLiveRole() == 0) {
            ((C54116w) C86312j.m106911c(C54116w.class)).nv0(C0076j0.RETURN_LIVE_ROOM_FROM_GIFT_BOARD, "", 0);
        }
        return true;
    }

    /* renamed from: l1 */
    public final void mo11991l1() {
        Class cls = C0700z.class;
        if (this.f35412Y) {
            Log.m105924i(this.f35417r, "observeData have observe");
            return;
        }
        this.f35412Y = true;
        LiveMutableData<Boolean> c3 = ((C0700z) mo87696x0(cls)).mo665c3();
        c3.f15070d = true;
        c3.observe(this, new C12299n(this));
        ((C0700z) mo87696x0(cls)).f1663o.observe(this, new C12300o(this));
        ((C0700z) mo87696x0(cls)).f1664p.observe(this, new C12301p(this));
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        Object obj;
        C87412m.m108594g(linkedHashMap, "micUserMap");
        C12289d dVar = this.f35402R;
        if (dVar != null) {
            List<C54130j> f1 = mo11987f1();
            String str = dVar.f35437a;
            if (str == null || str.length() == 0) {
                return;
            }
            if (((ArrayList) f1).isEmpty()) {
                Log.m105924i(this.f35417r, "onAudienceMicUserChanged no mic users, restore to anchor target");
                C61926c.m72668M(new C12569o7(this));
                return;
            }
            synchronized (f1) {
                Iterator it = ((ArrayList) f1).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Util.isEqual(((C54130j) obj).f151999c, dVar.f35437a)) {
                        break;
                    }
                }
            }
            if (obj == null) {
                Log.m105924i(this.f35417r, "onAudienceMicUserChanged mic users change, restore to anchor target");
                C61926c.m72668M(new C12569o7(this));
            }
        }
    }

    /* renamed from: m1 */
    public final void mo11993m1() {
        String str = this.f35417r;
        Log.m105924i(str, "refreshWecoinLayout, wecoinBalanceValid:" + this.f35392H);
        if (this.f35392H) {
            View view = this.f35390F;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f35388D;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f35386B.setVisibility(0);
            View view5 = this.f35389E;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view7 = this.f35390F;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(0);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view9 = this.f35388D;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f35386B.setVisibility(8);
        View view10 = this.f35389E;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view11 = view10;
        C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: o1 */
    public final void mo11994o1(C12289d dVar, String str) {
        Class cls = C54991o.class;
        if (((C54991o) mo87696x0(cls)).mo75963I3() || this.f35416q == C12288c.ANCHOR_SELECT) {
            this.f35392H = false;
            mo11993m1();
            mo11998s1((Long) null);
            C61926c.m72668M(new C12307v(dVar, this, str));
            C58124b.C7172a.m7372a(this.f35414p, C58124b.C58125b.LIVE_EVENT_GIFT_HIDE_SEND_BTN, (Bundle) null, 2, (Object) null);
            return;
        }
        String str2 = this.f35417r;
        Log.m105924i(str2, "showGiftListContent business(LiveCommonSlice::class.java).enableGift:" + ((C54991o) mo87696x0(cls)).mo75963I3());
    }

    public void onClick(View view) {
        String str;
        Class cls = C54116w.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C10757d dVar = null;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if ((valueOf != null && valueOf.intValue() == C0966R.C0970id.dml) || (valueOf != null && valueOf.intValue() == C0966R.C0970id.dmg)) {
            mo11989h1();
            if (this.f35414p.getLiveRole() == 0) {
                ((C54116w) C86312j.m106911c(cls)).nv0(C0076j0.RETURN_LIVE_ROOM_FROM_GIFT_BOARD, "", 0);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dmu) {
            if (this.f166287d.getContext() instanceof FragmentActivity) {
                if (this.f35414p.getLiveRole() == 0) {
                    ((C54116w) C86312j.m106911c(cls)).nv0(C0076j0.CLICK_GIFT_BOARD_RIGHT_GREEN_ENTER_RECHARGE_UI, "", 0);
                }
                mo11989h1();
                C54795n5 D0 = mo14476D0();
                if (D0 != null) {
                    Context context = this.f166287d.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    dVar = D0.mo75699C((FragmentActivity) context, 1, new C12302q(this));
                }
                this.f35391G = dVar;
                if (dVar != null) {
                    dVar.mo11002a(new C12303r(this));
                }
                C10757d dVar2 = this.f35391G;
                if (dVar2 != null) {
                    dVar2.mo11004c(new C12304s(this));
                }
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dmo) {
            mo11996q1();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.g15) {
            mo11989h1();
            this.f35399P.removeAllViews();
            C58969q d1 = mo11985d1();
            String nickname = d1 != null ? d1.getNickname() : f35384U0;
            C58969q d15 = mo11985d1();
            C12289d dVar3 = new C12289d("", nickname, d15 != null ? d15.getAvatarUrl() : null);
            C12289d dVar4 = this.f35402R;
            dVar3.f35440d = (dVar4 == null || (str = dVar4.f35437a) == null || !str.equals("")) ? false : true;
            this.f35399P.addView(mo11983b1(dVar3, this.f35400Q, true));
            List<C54130j> f1 = mo11987f1();
            synchronized (f1) {
                Iterator it = ((ArrayList) f1).iterator();
                while (it.hasNext()) {
                    C54130j jVar = (C54130j) it.next();
                    String str2 = jVar.f151999c;
                    C12289d dVar5 = new C12289d(str2, jVar.f152000d, jVar.f151998b);
                    C12289d dVar6 = this.f35402R;
                    dVar5.f35440d = C87412m.m108589b(str2, dVar6 != null ? dVar6.f35437a : null);
                    this.f35399P.addView(mo11983b1(dVar5, this.f35400Q, false));
                }
            }
            this.f35398N.mo5073h();
            this.f35398N.f18472r = new C12305t(this);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: q1 */
    public final void mo11996q1() {
        Class cls = C55001u.class;
        Log.m105924i(this.f35417r, "showGiftPage");
        C13604l<List<C8916d>, LinkedHashMap<String, List<String>>> e1 = mo11986e1();
        boolean z = ((C0653a0) mo87696x0(C0653a0.class)).f1543g;
        if (((List) e1.f38555d).isEmpty() || !z) {
            String str = this.f35417r;
            StringBuilder sb = new StringBuilder();
            sb.append("getGiftListFromCgi loading:");
            sb.append(this.f35427z.getVisibility() == 0);
            sb.append('!');
            Log.m105924i(str, sb.toString());
            View view = this.f35427z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "getGiftListFromCgi", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "getGiftListFromCgi", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f35419t.setVisibility(8);
            this.f35423x.setVisibility(8);
            C54795n5 D0 = mo14476D0();
            if (D0 != null) {
                D0.mo75755w(((C55001u) mo87696x0(cls)).f154420q.f182392d, ((C55001u) mo87696x0(cls)).f154416j, ((C55001u) mo87696x0(cls)).f154423t, 1, new C12438h7(this));
                return;
            }
            return;
        }
        C54795n5 D02 = mo14476D0();
        if (D02 != null) {
            C54795n5.C54796a.m61724b(D02, ((C55001u) mo87696x0(cls)).f154420q.f182392d, ((C55001u) mo87696x0(cls)).f154416j, ((C55001u) mo87696x0(cls)).f154423t, 1, (C32227p) null, 16, (Object) null);
        }
        mo11997r1((List) e1.f38555d, (LinkedHashMap) e1.f38556e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x042d  */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11997r1(java.util.List<ig1.C8916d> r33, java.util.LinkedHashMap<java.lang.String, java.util.List<java.lang.String>> r34) {
        /*
            r32 = this;
            r0 = r32
            long r1 = java.lang.System.currentTimeMillis()
            boolean r3 = r33.isEmpty()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r3 == 0) goto L_0x0017
            android.widget.TextView r1 = r0.f35423x
            r1.setVisibility(r4)
            return
        L_0x0017:
            androidx.viewpager.widget.ViewPager r3 = r0.f35419t
            r3.setVisibility(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r33
            r3.addAll(r6)
            java.util.Map r6 = java.util.Collections.synchronizedMap(r34)
            qj1.d7$c r7 = r0.f35416q
            qj1.d7$c r8 = qj1.C12282d7.C12288c.VISITOR
            r9 = 2131827568(0x7f111b70, float:1.9288052E38)
            java.lang.String r10 = "FinderLiveGiftLoader.pkgGiftCache"
            r11 = 1
            if (r7 != r8) goto L_0x00af
            cj1.y1 r7 = cj1.C0639y1.f1510a
            java.util.Map<java.lang.String, ig1.d> r7 = cj1.C0639y1.f1519j
            gy3.C87412m.m108593f(r7, r10)
            boolean r8 = r7.isEmpty()
            r8 = r8 ^ r11
            if (r8 == 0) goto L_0x00af
            java.lang.String r8 = r0.f35417r
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "[updateGiftPage] pkgGiftList = "
            r12.append(r13)
            java.util.Set r13 = r7.keySet()
            r12.append(r13)
            java.lang.String r13 = ", batchInfoList = "
            r12.append(r13)
            java.util.Map<java.lang.String, java.util.LinkedList<te3.uh3>> r13 = cj1.C0639y1.f1518i
            java.util.Set r13 = r13.keySet()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            java.util.Collection r8 = r7.values()
            r3.addAll(r8)
            java.lang.String r8 = "tabCache"
            gy3.C87412m.m108593f(r6, r8)
            android.view.ViewGroup r8 = r0.f166287d
            android.content.Context r8 = r8.getContext()
            java.lang.String r8 = r8.getString(r9)
            java.util.Collection r7 = r7.values()
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = sx3.C36907w.m41090l(r7, r13)
            r12.<init>(r13)
            java.util.Iterator r7 = r7.iterator()
        L_0x0096:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x00a8
            java.lang.Object r13 = r7.next()
            ig1.d r13 = (ig1.C8916d) r13
            java.lang.String r13 = r13.field_rewardProductId
            r12.add(r13)
            goto L_0x0096
        L_0x00a8:
            java.util.List r7 = sx3.C110818d0.m150953y0(r12)
            r6.put(r8, r7)
        L_0x00af:
            int r7 = r3.size()
            java.util.Set r8 = r6.keySet()
            int r8 = r8.size()
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            if (r8 <= r11) goto L_0x01b5
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView r15 = r0.f35420u
            r15.setVisibility(r4)
            java.util.Set r15 = r6.entrySet()
            java.util.Iterator r15 = r15.iterator()
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x00da:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L_0x0186
            java.lang.Object r19 = r15.next()
            java.util.Map$Entry r19 = (java.util.Map.Entry) r19
            java.lang.Object r20 = r19.getValue()
            java.util.List r20 = (java.util.List) r20
            int r4 = r20.size()
            java.lang.String r14 = r0.f35417r
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "tab = "
            r9.append(r11)
            java.lang.Object r11 = r19.getKey()
            java.lang.String r11 = (java.lang.String) r11
            r9.append(r11)
            java.lang.String r11 = ", size = "
            r9.append(r11)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r9)
            int r9 = r4 % 8
            int r11 = r4 / 8
            if (r9 != 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r14 = 1
            int r11 = r11 + r14
        L_0x011e:
            java.lang.Object r14 = r19.getKey()
            r21 = r15
            android.view.ViewGroup r15 = r0.f166287d
            android.content.Context r15 = r15.getContext()
            r22 = r1
            r1 = 2131827568(0x7f111b70, float:1.9288052E38)
            java.lang.String r2 = r15.getString(r1)
            boolean r2 = gy3.C87412m.m108589b(r14, r2)
            if (r2 == 0) goto L_0x013b
            r18 = r11
        L_0x013b:
            int r16 = r16 + r11
            int r2 = r4 / 8
            r11 = 1
            if (r9 != 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            int r2 = r2 + r11
        L_0x0144:
            int r17 = r17 + r2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
            r13.add(r14)
            if (r11 > r2) goto L_0x017b
            r11 = 1
            r14 = 0
        L_0x0151:
            int r15 = r11 * 8
            if (r15 <= r4) goto L_0x0157
            r15 = r9
            goto L_0x0159
        L_0x0157:
            r15 = 8
        L_0x0159:
            java.util.LinkedList r1 = new java.util.LinkedList
            java.lang.Object r24 = r19.getValue()
            r25 = r4
            r4 = r24
            java.util.List r4 = (java.util.List) r4
            int r15 = r15 + r14
            java.util.List r4 = r4.subList(r14, r15)
            r1.<init>(r4)
            r12.add(r1)
            if (r11 == r2) goto L_0x017b
            int r11 = r11 + 1
            r14 = r15
            r4 = r25
            r1 = 2131827568(0x7f111b70, float:1.9288052E38)
            goto L_0x0151
        L_0x017b:
            r15 = r21
            r1 = r22
            r4 = 0
            r9 = 2131827568(0x7f111b70, float:1.9288052E38)
            r11 = 1
            goto L_0x00da
        L_0x0186:
            r22 = r1
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView r1 = r0.f35420u
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r6)
            qj1.d7$y r4 = new qj1.d7$y
            r4.<init>(r0)
            r1.mo3239d(r2, r13, r4)
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView r1 = r0.f35420u
            qj1.d7$z r2 = new qj1.d7$z
            r2.<init>(r0)
            r1.setTouchBlock(r2)
            androidx.viewpager.widget.ViewPager r1 = r0.f35419t
            r1.clearOnPageChangeListeners()
            androidx.viewpager.widget.ViewPager r1 = r0.f35419t
            qj1.d7$a0 r2 = new qj1.d7$a0
            r2.<init>(r0)
            r1.addOnPageChangeListener(r2)
            r1 = r16
            r2 = r18
            goto L_0x01d2
        L_0x01b5:
            r22 = r1
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView r1 = r0.f35420u
            r2 = 8
            r1.setVisibility(r2)
            androidx.viewpager.widget.ViewPager r1 = r0.f35419t
            r1.clearOnPageChangeListeners()
            int r1 = r7 % 8
            if (r1 != 0) goto L_0x01ca
            int r16 = r7 / 8
            goto L_0x01cf
        L_0x01ca:
            int r1 = r7 / 8
            r2 = 1
            int r16 = r1 + 1
        L_0x01cf:
            r1 = r16
            r2 = 0
        L_0x01d2:
            java.lang.String r4 = r0.f35417r
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "updateGiftPage giftSize:"
            r6.append(r9)
            r6.append(r7)
            java.lang.String r7 = ", tabSize:"
            r6.append(r7)
            r6.append(r8)
            java.lang.String r7 = ", calPageSize:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", pageSize:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            android.view.ViewGroup r4 = r0.f166287d
            android.content.Context r4 = r4.getContext()
            android.graphics.Point r4 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r4)
            int r4 = r4.x
            android.view.ViewGroup r6 = r0.f166287d
            android.content.Context r6 = r6.getContext()
            android.graphics.Point r6 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
            int r6 = r6.y
            gy3.d0 r7 = new gy3.d0
            r7.<init>()
            r8 = 4
            r7.f27483d = r8
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131165284(0x7f070064, float:1.794478E38)
            int r8 = r8.getDimensionPixelOffset(r9)
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r9 = r9.getDimensionPixelOffset(r11)
            gy3.d0 r11 = new gy3.d0
            r11.<init>()
            boolean r13 = r32.mo82893g0()
            if (r13 != 0) goto L_0x0256
            int r6 = r7.f27483d
            int r8 = r8 * r6
            int r4 = r4 - r8
            int r8 = r9 * 2
            int r4 = r4 - r8
            r13 = 1
            int r6 = r6 - r13
            int r4 = r4 / r6
            goto L_0x0262
        L_0x0256:
            r13 = 1
            int r4 = r7.f27483d
            int r8 = r8 * r4
            int r6 = r6 - r8
            int r8 = r9 * 2
            int r6 = r6 - r8
            int r4 = r4 - r13
            int r4 = r6 / r4
        L_0x0262:
            r11.f27483d = r4
            gy3.d0 r4 = new gy3.d0
            r4.<init>()
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r6 = r6.getDimensionPixelOffset(r8)
            r4.f27483d = r6
            r6 = 0
        L_0x027b:
            r8 = 2131303588(0x7f091ca4, float:1.8225295E38)
            if (r6 >= r1) goto L_0x032d
            java.util.ArrayList<com.tencent.mm.view.recyclerview.WxRecyclerView> r14 = r0.f35401Q0
            java.lang.Object r14 = sx3.C110818d0.m150917O(r14, r6)
            com.tencent.mm.view.recyclerview.WxRecyclerView r14 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r14
            if (r14 == 0) goto L_0x02a1
            androidx.recyclerview.widget.RecyclerView$e r8 = r14.getAdapter()
            java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveGiftGridAdapter"
            gy3.C87412m.m108592e(r8, r13)
            qk1.m1 r8 = (qk1.C12814m1) r8
            r8.mo12351G4(r3, r6, r12)
            r8.notifyDataSetChanged()
            r16 = r2
            r17 = r3
            goto L_0x0325
        L_0x02a1:
            com.tencent.mm.view.recyclerview.WxRecyclerView r14 = new com.tencent.mm.view.recyclerview.WxRecyclerView
            android.view.ViewGroup r15 = r0.f166287d
            android.content.Context r15 = r15.getContext()
            java.lang.String r13 = "root.context"
            gy3.C87412m.m108593f(r15, r13)
            r14.<init>(r15)
            r14.setId(r8)
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r15 = -1
            r8.<init>(r15, r15)
            r14.setLayoutParams(r8)
            qk1.m1 r8 = new qk1.m1
            android.view.ViewGroup r15 = r0.f166287d
            android.content.Context r15 = r15.getContext()
            gy3.C87412m.m108593f(r15, r13)
            r8.<init>(r15, r14)
            r13 = 1
            if (r13 > r2) goto L_0x02d3
            if (r2 >= r1) goto L_0x02d3
            r13 = 1
            goto L_0x02d4
        L_0x02d3:
            r13 = 0
        L_0x02d4:
            if (r13 == 0) goto L_0x02e3
            int r13 = r1 - r2
            if (r13 > r6) goto L_0x02de
            if (r6 >= r1) goto L_0x02de
            r13 = 1
            goto L_0x02df
        L_0x02de:
            r13 = 0
        L_0x02df:
            if (r13 == 0) goto L_0x02e3
            r13 = 1
            goto L_0x02e4
        L_0x02e3:
            r13 = 0
        L_0x02e4:
            r8.f36678f = r13
            r8.mo12351G4(r3, r6, r12)
            yh1.a r13 = r0.f35405S0
            r8.f36680h = r13
            r14.setAdapter(r8)
            androidx.recyclerview.widget.GridLayoutManager r8 = new androidx.recyclerview.widget.GridLayoutManager
            android.view.ViewGroup r13 = r0.f166287d
            android.content.Context r13 = r13.getContext()
            int r15 = r7.f27483d
            r16 = r2
            r17 = r3
            r2 = 1
            r3 = 0
            r8.<init>((android.content.Context) r13, (int) r15, (int) r2, (boolean) r3)
            r14.setLayoutManager(r8)
            qj1.d7$w r2 = new qj1.d7$w
            r2.<init>(r7, r11, r4)
            r14.mo17085h0(r2)
            r14.setVerticalScrollBarEnabled(r3)
            int r2 = r14.getPaddingTop()
            int r3 = r14.getPaddingRight()
            int r8 = r14.getPaddingBottom()
            r14.setPadding(r9, r2, r3, r8)
            java.util.ArrayList<com.tencent.mm.view.recyclerview.WxRecyclerView> r2 = r0.f35401Q0
            r2.add(r14)
        L_0x0325:
            int r6 = r6 + 1
            r2 = r16
            r3 = r17
            goto L_0x027b
        L_0x032d:
            qk1.s1 r2 = r0.f35385A
            java.util.ArrayList<com.tencent.mm.view.recyclerview.WxRecyclerView> r3 = r0.f35401Q0
            java.util.List r3 = sx3.C110818d0.m150947s0(r3, r1)
            r2.getClass()
            java.util.ArrayList<com.tencent.mm.view.recyclerview.WxRecyclerView> r4 = r2.f36746e
            r4.clear()
            java.util.ArrayList<com.tencent.mm.view.recyclerview.WxRecyclerView> r4 = r2.f36746e
            r4.addAll(r3)
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x0347:
            boolean r6 = r3.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x03b7
            java.lang.Object r6 = r3.next()
            int r9 = r4 + 1
            if (r4 < 0) goto L_0x03b3
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r6
            java.util.ArrayList<android.view.ViewGroup> r11 = r2.f36747f
            java.lang.Object r4 = sx3.C110818d0.m150917O(r11, r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x0379
            android.view.View r7 = r4.findViewById(r8)
            if (r7 == 0) goto L_0x0374
            r4.removeView(r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r7 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r11 = -1
            r7.<init>((int) r11, (int) r11)
            r4.addView(r6, r7)
        L_0x0374:
            r2.mo12366a(r4, r6)
            r11 = -1
            goto L_0x03b1
        L_0x0379:
            android.view.ViewParent r4 = r6.getParent()
            boolean r11 = r4 instanceof android.view.ViewGroup
            if (r11 == 0) goto L_0x0384
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x0385
        L_0x0384:
            r4 = r7
        L_0x0385:
            if (r4 == 0) goto L_0x038a
            r4.removeView(r6)
        L_0x038a:
            android.content.Context r4 = r6.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r11 = 2131494960(0x7f0c0830, float:1.8613443E38)
            android.view.View r4 = r4.inflate(r11, r7)
            java.lang.String r7 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            gy3.C87412m.m108592e(r4, r7)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r7 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r11 = -1
            r7.<init>((int) r11, (int) r11)
            r4.addView(r6, r7)
            r2.mo12366a(r4, r6)
            java.util.ArrayList<android.view.ViewGroup> r6 = r2.f36747f
            r6.add(r4)
        L_0x03b1:
            r4 = r9
            goto L_0x0347
        L_0x03b3:
            sx3.C64197v.m75542k()
            throw r7
        L_0x03b7:
            r2.notifyDataSetChanged()
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPanelIndicator r2 = r0.f35395K
            r2.setIndicatorSize(r1)
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPanelIndicator r1 = r0.f35395K
            androidx.viewpager.widget.ViewPager r2 = r0.f35419t
            r1.getClass()
            java.lang.String r3 = "viewpager"
            gy3.C87412m.m108594g(r2, r3)
            com.tencent.mm.plugin.finder.live.view.q0 r3 = new com.tencent.mm.plugin.finder.live.view.q0
            r3.<init>(r1)
            r2.addOnPageChangeListener(r3)
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPanelIndicator r1 = r0.f35395K
            r2 = 0
            r1.setCurrentChoosedIndicator(r2)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_NEED_SHOW_PKG_REDDOT_BOOLEAN_SYNC
            boolean r1 = r1.mo119686g(r3, r2)
            if (r1 == 0) goto L_0x0416
            cj1.y1 r1 = cj1.C0639y1.f1510a
            java.util.Map<java.lang.String, ig1.d> r1 = cj1.C0639y1.f1519j
            gy3.C87412m.m108593f(r1, r10)
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0416
            android.view.ViewGroup r1 = r0.f166287d
            boolean r1 = r1.isShown()
            if (r1 == 0) goto L_0x0407
            java.lang.String r1 = "updateGiftPage"
            r0.mo11984c1(r1)
        L_0x0407:
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView r1 = r0.f35420u
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r1.getRv()
            qj1.d7$x r2 = new qj1.d7$x
            r2.<init>(r0)
            r1.post(r2)
            goto L_0x041c
        L_0x0416:
            androidx.viewpager.widget.ViewPager r1 = r0.f35419t
            r2 = 0
            r1.setCurrentItem(r2, r2)
        L_0x041c:
            ok1.e r1 = ok1.C62042e.f176370a
            boolean r1 = r1.mo87027N0()
            if (r1 == 0) goto L_0x042d
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView r1 = r0.f35425y
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x0736
        L_0x042d:
            cj1.y1 r1 = cj1.C0639y1.f1510a
            te3.x11 r1 = cj1.C0639y1.f1522m
            if (r1 == 0) goto L_0x072f
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView r2 = r0.f35425y
            java.lang.Class<cl1.z0> r3 = cl1.C0702z0.class
            androidx.lifecycle.i0 r3 = r0.mo87696x0(r3)
            cl1.z0 r3 = (cl1.C0702z0) r3
            boolean r3 = r3.mo670d3()
            r2.getClass()
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            r4.f27484d = r1
            pe1.c<java.lang.Integer> r1 = gg1.C32444a.f86180o2
            java.lang.Object r1 = r1.mo60266n()
            r6 = r1
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 <= 0) goto L_0x045c
            r6 = 1
            goto L_0x045d
        L_0x045c:
            r6 = 0
        L_0x045d:
            if (r6 == 0) goto L_0x0460
            goto L_0x0461
        L_0x0460:
            r1 = r7
        L_0x0461:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x048b
            int r1 = r1.intValue()
            T r6 = r4.f27484d
            if (r6 != 0) goto L_0x0474
            te3.x11 r6 = new te3.x11
            r6.<init>()
            r4.f27484d = r6
        L_0x0474:
            T r6 = r4.f27484d
            te3.x11 r6 = (te3.C51909x11) r6
            if (r6 != 0) goto L_0x047b
            goto L_0x047d
        L_0x047b:
            r6.f144398d = r1
        L_0x047d:
            if (r6 != 0) goto L_0x0480
            goto L_0x0484
        L_0x0480:
            r8 = 100
            r6.f144400f = r8
        L_0x0484:
            if (r6 != 0) goto L_0x0487
            goto L_0x048b
        L_0x0487:
            r8 = 75
            r6.f144399e = r8
        L_0x048b:
            T r1 = r4.f27484d
            te3.x11 r1 = (te3.C51909x11) r1
            if (r1 == 0) goto L_0x071c
            r6 = 0
            r2.setVisibility(r6)
            int r6 = r1.f144398d
            java.lang.String r8 = "progressRoot"
            java.lang.String r9 = "zeroRoot"
            if (r6 != 0) goto L_0x0541
            android.view.View r6 = r2.f15201p
            if (r6 == 0) goto L_0x053d
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r9.mo10233c(r5)
            java.lang.Object[] r11 = r9.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView"
            java.lang.String r13 = "update"
            java.lang.String r14 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGlobalRewardLevel;Z)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r6
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            r5 = 0
            java.lang.Object r9 = r9.mo10231a(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r5 = r9.intValue()
            r6.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView"
            java.lang.String r12 = "update"
            java.lang.String r13 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGlobalRewardLevel;Z)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r5 = r2.f15195g
            if (r5 == 0) goto L_0x0539
            k20.a r6 = new k20.a
            r6.<init>()
            r8 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6.mo10233c(r9)
            java.lang.Object[] r25 = r6.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView"
            java.lang.String r27 = "update"
            java.lang.String r28 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGlobalRewardLevel;Z)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r5
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r8 = 0
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView"
            java.lang.String r26 = "update"
            java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGlobalRewardLevel;Z)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.widget.TextView r5 = r2.f15200o
            if (r5 == 0) goto L_0x0532
            r2.mo3244a(r5)
            goto L_0x06ae
        L_0x0532:
            java.lang.String r1 = "roleZeroStateTxt"
            gy3.C87412m.m108603p(r1)
            throw r7
        L_0x0539:
            gy3.C87412m.m108603p(r8)
            throw r7
        L_0x053d:
            gy3.C87412m.m108603p(r9)
            throw r7
        L_0x0541:
            android.view.View r6 = r2.f15201p
            if (r6 == 0) goto L_0x0717
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r15.mo10233c(r10)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView"
            java.lang.String r12 = "update"
            java.lang.String r13 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGlobalRewardLevel;Z)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r6
            r7 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r9 = 0
            java.lang.Object r7 = r7.mo10231a(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView"
            java.lang.String r11 = "update"
            java.lang.String r12 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGlobalRewardLevel;Z)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r9 = r6
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r6 = r2.f15195g
            if (r6 == 0) goto L_0x0712
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r5)
            java.lang.Object[] r25 = r7.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView"
            java.lang.String r27 = "update"
            java.lang.String r28 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGlobalRewardLevel;Z)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r6
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 0
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r5 = r7.intValue()
            r6.setVisibility(r5)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView"
            java.lang.String r26 = "update"
            java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGlobalRewardLevel;Z)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            wk1.r r5 = new wk1.r
            wk1.x r6 = wk1.C15483x.MODE_DARK
            wk1.y r7 = wk1.C15484y.SIZE_NORMAL
            r5.<init>(r6, r7)
            wk1.i$a r6 = wk1.C15432i.f41854e
            wk1.j r6 = new wk1.j
            r6.<init>()
            int r7 = r1.f144398d
            java.lang.String r8 = java.lang.String.valueOf(r7)
            r6.mo14251b(r7, r8, r5)
            android.content.Context r7 = r2.f15193e
            java.lang.String r8 = "mContext"
            if (r7 == 0) goto L_0x070d
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131165306(0x7f07007a, float:1.7944825E38)
            int r7 = r7.getDimensionPixelOffset(r9)
            wk1.i$a$a r9 = r6.f41876a
            r9.f41859c = r7
            r7 = 0
            r9.f41874r = r7
            android.widget.TextView r7 = r2.f15198j
            java.lang.String r9 = "levelBadgeTxt"
            if (r7 == 0) goto L_0x0708
            wk1.i r6 = r6.mo14250a(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = " "
            r7.append(r10)
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r7)
            r7 = 33
            r11 = 1
            r12 = 0
            r10.setSpan(r6, r12, r11, r7)
            android.widget.TextView r6 = r2.f15198j
            if (r6 == 0) goto L_0x0703
            android.content.Context r7 = r2.f15193e
            if (r7 == 0) goto L_0x06fe
            int r11 = r1.f144398d
            int r11 = r5.mo14282k(r11)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r11)
            r6.setBackground(r7)
            android.widget.TextView r6 = r2.f15198j
            if (r6 == 0) goto L_0x06f9
            r6.setText(r10)
            android.content.Context r6 = r2.f15193e
            if (r6 == 0) goto L_0x06f4
            r7 = 2131232646(0x7f080786, float:1.8081407E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            android.content.Context r7 = r2.f15193e
            if (r7 == 0) goto L_0x06ef
            int r9 = r1.f144398d
            int r5 = r5.mo14282k(r9)
            android.graphics.drawable.Drawable r5 = r7.getDrawable(r5)
            android.graphics.drawable.ClipDrawable r7 = new android.graphics.drawable.ClipDrawable
            r9 = 8388611(0x800003, float:1.1754948E-38)
            r10 = 1
            r7.<init>(r5, r9, r10)
            android.widget.ProgressBar r5 = r2.f15196h
            java.lang.String r9 = "progressBar"
            if (r5 == 0) goto L_0x06ea
            r5.setProgressDrawable(r7)
            android.widget.ProgressBar r5 = r2.f15196h
            if (r5 == 0) goto L_0x06e5
            r5.setBackground(r6)
            android.widget.ProgressBar r5 = r2.f15196h
            if (r5 == 0) goto L_0x06e0
            long r6 = r1.f144400f
            int r7 = (int) r6
            r5.setMax(r7)
            android.widget.ProgressBar r5 = r2.f15196h
            if (r5 == 0) goto L_0x06db
            r6 = 0
            r5.setProgress(r6)
            android.widget.ProgressBar r5 = r2.f15196h
            if (r5 == 0) goto L_0x06d6
            long r6 = r1.f144399e
            int r7 = (int) r6
            r5.setProgress(r7)
            android.widget.TextView r5 = r2.f15197i
            if (r5 == 0) goto L_0x06cf
            android.content.Context r6 = r2.f15193e
            if (r6 == 0) goto L_0x06ca
            r7 = 2131827571(0x7f111b73, float:1.9288058E38)
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            long r9 = r1.f144400f
            long r11 = r1.f144399e
            long r9 = r9 - r11
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 0
            r8[r10] = r9
            java.lang.String r6 = r6.getString(r7, r8)
            r5.setText(r6)
        L_0x06ae:
            android.widget.TextView r5 = r2.f15199n
            if (r5 == 0) goto L_0x06c2
            r2.mo3244a(r5)
            tj1.o r5 = new tj1.o
            r5.<init>(r4, r2, r1, r3)
            r2.setOnClickListener(r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r3 = r1
            r1 = 0
            goto L_0x071e
        L_0x06c2:
            java.lang.String r1 = "roleStateTxt"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        L_0x06ca:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x06cf:
            r1 = 0
            java.lang.String r2 = "progressTxtView"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x06d6:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x06db:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x06e0:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x06e5:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x06ea:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x06ef:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x06f4:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x06f9:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x06fe:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x0703:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x0708:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x070d:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x0712:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x0717:
            r1 = r7
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x071c:
            r1 = r7
            r3 = r1
        L_0x071e:
            if (r3 != 0) goto L_0x0728
            r3 = 8
            r2.setVisibility(r3)
            r2.setOnClickListener(r1)
        L_0x0728:
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView r1 = r0.f35425y
            r2 = 0
            r1.setVisibility(r2)
            goto L_0x0736
        L_0x072f:
            r3 = 8
            com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView r1 = r0.f35425y
            r1.setVisibility(r3)
        L_0x0736:
            java.lang.String r1 = r0.f35417r
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateGiftPage end, duration = "
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r22
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12282d7.mo11997r1(java.util.List, java.util.LinkedHashMap):void");
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        if (mo14483f0() == 0) {
            mo11998s1((Long) null);
        }
    }

    /* renamed from: s1 */
    public final void mo11998s1(Long l) {
        if (l == null) {
            this.f35393I = System.currentTimeMillis();
            C54795n5 D0 = mo14476D0();
            if (D0 != null) {
                D0.mo75729d(this.f35393I, new C12287b0(this));
                return;
            }
            return;
        }
        C61926c.m72668M(new C12598p7(this, l.longValue()));
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            mo11991l1();
        } else if (ordinal == 27) {
            C10757d dVar = this.f35391G;
            if (dVar != null) {
                dVar.mo11003b();
            }
        } else if (ordinal == 74) {
            boolean z = true;
            if (bundle == null || !bundle.containsKey("PARAM_FINDER_LIVE_GIFT_UPDATE_WECOIN")) {
                z = false;
            }
            Long valueOf = (!z || bundle == null) ? null : Long.valueOf(bundle.getLong("PARAM_FINDER_LIVE_GIFT_UPDATE_WECOIN"));
            if (valueOf != null) {
                mo11998s1(valueOf);
            } else {
                mo11998s1((Long) null);
            }
        } else if (ordinal == 118 && !((C54991o) mo87696x0(C54991o.class)).mo75963I3()) {
            if (mo14483f0() == 0) {
                mo11989h1();
            }
            C10757d dVar2 = this.f35391G;
            if (dVar2 != null) {
                dVar2.mo11003b();
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f35412Y = false;
        this.f35385A.mo12367b();
        this.f35393I = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12282d7(ViewGroup viewGroup, C58124b bVar, C12288c cVar, int i, C8480h hVar) {
        this(viewGroup, bVar, (i & 4) != 0 ? C12288c.VISITOR : cVar);
    }
}
