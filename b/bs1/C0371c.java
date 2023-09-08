package bs1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import as1.C0201a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: bs1.c */
public final class C0371c extends C0376e {

    /* renamed from: b */
    public final Context f967b;

    /* renamed from: c */
    public final int f968c;

    /* renamed from: d */
    public final int f969d;

    /* renamed from: e */
    public final int f970e;

    /* renamed from: f */
    public final boolean f971f;

    /* renamed from: g */
    public final C13601g f972g;

    /* renamed from: h */
    public final C13601g f973h;

    /* renamed from: i */
    public View f974i;

    /* renamed from: bs1.c$a */
    public static final class C0372a extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C0371c f975d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0372a(C0371c cVar) {
            super(0);
            this.f975d = cVar;
        }

        public Object invoke() {
            View a = this.f975d.mo408a();
            C87412m.m108591d(a);
            return (WeImageView) a.findViewById(C0966R.C0970id.mso);
        }
    }

    /* renamed from: bs1.c$b */
    public static final class C0373b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C0371c f976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0373b(C0371c cVar) {
            super(0);
            this.f976d = cVar;
        }

        public Object invoke() {
            View a = this.f976d.mo408a();
            C87412m.m108591d(a);
            return a.findViewById(C0966R.C0970id.eu_);
        }
    }

    /* renamed from: bs1.c$c */
    public static final class C0374c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C0371c f977d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0374c(C0371c cVar) {
            super(0);
            this.f977d = cVar;
        }

        public Object invoke() {
            View a = this.f977d.mo408a();
            C87412m.m108591d(a);
            return a.findViewById(C0966R.C0970id.msp);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0371c(Context context, int i, int i2, int i3, boolean z, int i4, C8480h hVar) {
        this(context, (i4 & 2) != 0 ? C0966R.color.f2932f : i, (i4 & 4) != 0 ? C0966R.color.BW_0_Alpha_0_5 : i2, (i4 & 8) != 0 ? C0966R.C0969drawable.b9_ : i3, (i4 & 16) != 0 ? true : z);
    }

    /* renamed from: a */
    public View mo408a() {
        WeImageView weImageView;
        View findViewById;
        View findViewById2;
        if (this.f974i == null) {
            this.f974i = C85868k2.m106137b(this.f967b).inflate(C0966R.C0971layout.cti, (ViewGroup) null);
        }
        View view = this.f974i;
        if (!(view == null || (findViewById2 = view.findViewById(C0966R.C0970id.msp)) == null)) {
            findViewById2.setBackgroundResource(this.f970e);
        }
        View view2 = this.f974i;
        if (!(view2 == null || (findViewById = view2.findViewById(C0966R.C0970id.eu_)) == null)) {
            if (!this.f971f) {
                findViewById.getLayoutParams().height = -2;
            }
            findViewById.setBackgroundColor(this.f967b.getResources().getColor(this.f968c));
        }
        View view3 = this.f974i;
        if (!(view3 == null || (weImageView = (WeImageView) view3.findViewById(C0966R.C0970id.mso)) == null)) {
            weImageView.setVisibility(this.f971f ? 0 : 8);
            weImageView.setIconColor(this.f967b.getResources().getColor(this.f969d));
        }
        return this.f974i;
    }

    /* renamed from: e */
    public void mo411e(C0201a aVar) {
        C87412m.m108594g(aVar, "layout");
        ViewGroup.LayoutParams layoutParams = ((View) ((C36570n) this.f972g).getValue()).getLayoutParams();
        layoutParams.height = C76577a.m92151b(this.f967b, 4);
        ((View) ((C36570n) this.f972g).getValue()).setLayoutParams(layoutParams);
        ((WeImageView) ((C36570n) this.f973h).getValue()).setAlpha(0.0f);
    }

    /* renamed from: f */
    public void mo409f(C0201a aVar, float f, String str) {
        C87412m.m108594g(aVar, "layout");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        super.mo409f(aVar, f, str);
        if (this.f971f) {
            float borderExpand = aVar.getBorderExpand();
            float borderExpand2 = (f - borderExpand) / ((aVar.getBorderExpand() + ((float) C76577a.m92151b(this.f967b, 56))) - borderExpand);
            float f2 = (borderExpand2 - 0.5f) * 2.0f;
            float f3 = 0.0f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (borderExpand2 > 1.0f) {
                borderExpand2 = 1.0f;
            }
            if (0.0f < borderExpand2) {
                f3 = borderExpand2;
            }
            int b = C76577a.m92151b(this.f967b, 16);
            int b2 = C76577a.m92151b(this.f967b, 4);
            ViewGroup.LayoutParams layoutParams = ((View) ((C36570n) this.f972g).getValue()).getLayoutParams();
            layoutParams.height = (int) (((float) b2) + (f3 * ((float) (b - b2))));
            ((View) ((C36570n) this.f972g).getValue()).setLayoutParams(layoutParams);
            ((WeImageView) ((C36570n) this.f973h).getValue()).setAlpha(f2);
        }
    }

    public C0371c(Context context, int i, int i2, int i3, boolean z) {
        C87412m.m108594g(context, "context");
        this.f967b = context;
        this.f968c = i;
        this.f969d = i2;
        this.f970e = i3;
        this.f971f = z;
        this.f972g = C36568h.m40985a(new C0374c(this));
        this.f973h = C36568h.m40985a(new C0372a(this));
        C36568h.m40985a(new C0373b(this));
    }
}
