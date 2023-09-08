package yg1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import cj1.C0581o5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fj1.C45795b;
import fy3.C32224a;
import go3.C76003c;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import ok1.C62042e;
import qk1.C12806i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48770aw0;
import te3.C49765hx0;
import te3.C52013xs0;
import te3.C64674r41;
import wk1.C15460p;

/* renamed from: yg1.b */
public abstract class C15999b {

    /* renamed from: a */
    public final C45795b f43048a;

    /* renamed from: b */
    public final String f43049b = "FinderLiveCommentItem";

    /* renamed from: c */
    public final C13601g f43050c = C36568h.m40985a(C16001b.f43057d);

    /* renamed from: d */
    public final C13601g f43051d = C36568h.m40985a(C16000a.f43056d);

    /* renamed from: e */
    public final C13601g f43052e = C36568h.m40985a(C16002c.f43058d);

    /* renamed from: f */
    public final ForegroundColorSpan f43053f = new ForegroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3553xj));

    /* renamed from: g */
    public final C13601g f43054g = C36568h.m40985a(C16003d.f43059d);

    /* renamed from: h */
    public final int f43055h;

    /* renamed from: yg1.b$a */
    public static final class C16000a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C16000a f43056d = new C16000a();

        public C16000a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C74942w4.m89784a(MMApplicationContext.getContext(), 16));
        }
    }

    /* renamed from: yg1.b$b */
    public static final class C16001b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C16001b f43057d = new C16001b();

        public C16001b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C74942w4.m89784a(MMApplicationContext.getContext(), 12));
        }
    }

    /* renamed from: yg1.b$c */
    public static final class C16002c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C16002c f43058d = new C16002c();

        public C16002c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df));
        }
    }

    /* renamed from: yg1.b$d */
    public static final class C16003d extends C87413o implements C32224a<C76003c> {

        /* renamed from: d */
        public static final C16003d f43059d = new C16003d();

        public C16003d() {
            super(0);
        }

        public Object invoke() {
            Drawable e = C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_channel, Color.parseColor("#B2B2B2"));
            C87412m.m108593f(e, "getColorDrawable(\n      …olor(\"#B2B2B2\")\n        )");
            int dimensionPixelSize = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            return new C76003c(e, 1);
        }
    }

    public C15999b(C45795b bVar) {
        C87412m.m108594g(bVar, "buContext");
        this.f43048a = bVar;
        this.f43055h = C62042e.f176370a.mo87027N0() ? 17 : 14;
    }

    /* renamed from: a */
    public final String mo14623a(String str, List<? extends ImageSpan> list, String str2, String str3) {
        C87412m.m108594g(str, "anchorTag");
        C87412m.m108594g(str2, "userTag");
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0) {
            sb.append(str);
        }
        int size = list != null ? list.size() : 0;
        for (int i = 0; i < size; i++) {
            sb.append(" ");
        }
        sb.append(str2);
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "result.toString()");
        C62042e eVar = C62042e.f176370a;
        String str4 = this.f43049b;
        eVar.mo86998D1(str4, "#createTextMsg result=" + sb4);
        return sb4;
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        LinkedList<C48770aw0> linkedList;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(o5Var, "msg");
        StringBuilder sb = new StringBuilder();
        sb.append("#fillItem");
        sb.append(" name=");
        sb.append(o5Var.mo573g());
        sb.append(" content=");
        sb.append(o5Var.getContent());
        sb.append(" badge=");
        C49765hx0 i2 = o5Var.mo579i();
        if (!(i2 == null || (linkedList = i2.f134930r) == null)) {
            for (C48770aw0 aw02 : linkedList) {
                sb.append(String.valueOf(aw02.f130789d));
                sb.append("|");
            }
        }
        Log.m105924i(this.f43049b, sb.toString());
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        return null;
    }

    /* renamed from: d */
    public C0581o5 mo8796d(C64674r41 r412) {
        C87412m.m108594g(r412, "msg");
        return null;
    }

    /* renamed from: e */
    public final String mo14624e() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dgf);
        C87412m.m108593f(string, "getContext().resources.g…_annoucement_replacement)");
        return string;
    }

    /* renamed from: f */
    public final C15460p mo14625f() {
        int i = C15460p.f41933f;
        C15460p.C15461a aVar = new C15460p.C15461a();
        aVar.f41936a.f41950m = MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3);
        aVar.f41936a.f41940c = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2975b6);
        aVar.f41936a.f41941d = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3645a3);
        aVar.mo14276c((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3703bv));
        aVar.mo14278e(mo14626g());
        return aVar.mo14274a();
    }

    /* renamed from: g */
    public final String mo14626g() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dg_);
        C87412m.m108593f(string, "getContext().resources.g…nder_live_anchor_tag_txt)");
        return string;
    }

    /* renamed from: h */
    public final int mo14627h() {
        return this.f43055h;
    }

    /* renamed from: i */
    public final int mo14628i() {
        return ((Number) ((C36570n) this.f43052e).getValue()).intValue();
    }

    /* renamed from: j */
    public abstract int mo8797j();

    /* renamed from: k */
    public void mo8813k() {
    }

    /* renamed from: l */
    public void mo8805l(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i, List<Object> list) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(o5Var, "msg");
        C87412m.m108594g(list, "payloads");
    }
}
