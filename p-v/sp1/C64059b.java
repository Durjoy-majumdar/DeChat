package sp1;

import android.content.Context;
import android.os.Looper;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: sp1.b */
public final class C64059b {

    /* renamed from: a */
    public final ViewGroup f181603a;

    /* renamed from: b */
    public final String f181604b = "FinderLiveShopDiscountView";

    /* renamed from: c */
    public final C13601g f181605c;

    /* renamed from: d */
    public final C13601g f181606d;

    /* renamed from: e */
    public final C13601g f181607e;

    /* renamed from: f */
    public int f181608f;

    /* renamed from: g */
    public final C13601g f181609g;

    /* renamed from: h */
    public final C13601g f181610h;

    /* renamed from: i */
    public C32224a<C13598b0> f181611i;

    /* renamed from: j */
    public int f181612j;

    /* renamed from: k */
    public int f181613k;

    /* renamed from: l */
    public final C13601g f181614l;

    /* renamed from: m */
    public final C13601g f181615m;

    /* renamed from: sp1.b$a */
    public static final class C64060a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final WeakReference<C64059b> f181616d;

        public C64060a(WeakReference<C64059b> weakReference) {
            C87412m.m108594g(weakReference, "rDisCountView");
            this.f181616d = weakReference;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r12 = this;
                java.lang.ref.WeakReference<sp1.b> r0 = r12.f181616d
                java.lang.Object r0 = r0.get()
                sp1.b r0 = (sp1.C64059b) r0
                r1 = 0
                if (r0 != 0) goto L_0x000c
                return r1
            L_0x000c:
                int r2 = r0.f181612j
                int r2 = r2 + -1
                r0.f181612j = r2
                r3 = 1
                if (r2 <= 0) goto L_0x0016
                goto L_0x0024
            L_0x0016:
                int r4 = r0.f181613k
                if (r4 <= 0) goto L_0x0026
                int r4 = r4 + -1
                r0.f181613k = r4
                r4 = 86400(0x15180, float:1.21072E-40)
                int r2 = r2 + r4
                r0.f181612j = r2
            L_0x0024:
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x0040
                y50.n0$a r4 = y50.C15936n0.f42815a
                int r5 = r0.f181612j
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 28
                r11 = 0
                java.lang.String r6 = ":"
                java.lang.String r1 = y50.C15936n0.C15937a.m14866a(r4, r5, r6, r7, r8, r9, r10, r11)
                int r2 = r0.f181613k
                r0.mo88817e(r1, r2)
                r1 = 1
                goto L_0x004b
            L_0x0040:
                fy3.a<rx3.b0> r2 = r0.f181611i
                if (r2 == 0) goto L_0x0047
                r2.invoke()
            L_0x0047:
                r2 = 2
                r0.mo88813a(r2)
            L_0x004b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: sp1.C64059b.C64060a.onTimerExpired():boolean");
        }
    }

    /* renamed from: sp1.b$b */
    public static final class C64061b extends C87413o implements C32224a<C64060a> {

        /* renamed from: d */
        public final /* synthetic */ C64059b f181617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64061b(C64059b bVar) {
            super(0);
            this.f181617d = bVar;
        }

        public Object invoke() {
            return new C64060a(new WeakReference(this.f181617d));
        }
    }

    /* renamed from: sp1.b$c */
    public static final class C64062c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C64059b f181618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64062c(C64059b bVar) {
            super(0);
            this.f181618d = bVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f181618d.mo88815c().findViewById(C0966R.C0970id.mos);
            textView.setTextSize(2, 12.0f);
            return textView;
        }
    }

    /* renamed from: sp1.b$d */
    public static final class C64063d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C64059b f181619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64063d(C64059b bVar) {
            super(0);
            this.f181619d = bVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f181619d.mo88815c().findViewById(C0966R.C0970id.mov);
            textView.setTextSize(2, 12.0f);
            return textView;
        }
    }

    /* renamed from: sp1.b$e */
    public static final class C64064e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ Context f181620d;

        /* renamed from: e */
        public final /* synthetic */ C64059b f181621e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64064e(Context context, C64059b bVar) {
            super(0);
            this.f181620d = context;
            this.f181621e = bVar;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f181620d).inflate(C0966R.C0971layout.cs7, this.f181621e.f181603a, false);
        }
    }

    /* renamed from: sp1.b$f */
    public static final class C64065f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C64059b f181622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64065f(C64059b bVar) {
            super(0);
            this.f181622d = bVar;
        }

        public Object invoke() {
            return this.f181622d.mo88815c().findViewById(C0966R.C0970id.moy);
        }
    }

    /* renamed from: sp1.b$g */
    public static final class C64066g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C64059b f181623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64066g(C64059b bVar) {
            super(0);
            this.f181623d = bVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f181623d.mo88815c().findViewById(C0966R.C0970id.mox);
            textView.setTextSize(2, 12.0f);
            return textView;
        }
    }

    /* renamed from: sp1.b$h */
    public static final class C64067h extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public final /* synthetic */ C64059b f181624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64067h(C64059b bVar) {
            super(0);
            this.f181624d = bVar;
        }

        public Object invoke() {
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) (C64060a) ((C36570n) this.f181624d.f181614l).getValue(), true);
            mTimerHandler.setLogging(false);
            return mTimerHandler;
        }
    }

    public C64059b(Context context, ViewGroup viewGroup) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "parent");
        this.f181603a = viewGroup;
        this.f181605c = C36568h.m40985a(new C64064e(context, this));
        this.f181606d = C36568h.m40985a(new C64063d(this));
        this.f181607e = C36568h.m40985a(new C64062c(this));
        this.f181609g = C36568h.m40985a(new C64065f(this));
        this.f181610h = C36568h.m40985a(new C64066g(this));
        this.f181614l = C36568h.m40985a(new C64061b(this));
        this.f181615m = C36568h.m40985a(new C64067h(this));
    }

    /* renamed from: a */
    public final void mo88813a(int i) {
        String str = this.f181604b;
        Log.m105924i(str, "detach " + this.f181612j + " source:" + i);
        ((MTimerHandler) ((C36570n) this.f181615m).getValue()).stopTimer();
        this.f181611i = null;
        this.f181608f = 0;
        this.f181612j = 0;
        this.f181613k = 0;
        C62042e eVar = C62042e.f176370a;
        View c = mo88815c();
        C87412m.m108593f(c, "discountView");
        eVar.mo87010H1(c);
    }

    /* renamed from: b */
    public final TextView mo88814b() {
        return (TextView) ((C36570n) this.f181607e).getValue();
    }

    /* renamed from: c */
    public final View mo88815c() {
        return (View) ((C36570n) this.f181605c).getValue();
    }

    /* renamed from: d */
    public final TextView mo88816d() {
        return (TextView) ((C36570n) this.f181610h).getValue();
    }

    /* renamed from: e */
    public final void mo88817e(String str, int i) {
        TextView b = mo88814b();
        if (i > 0) {
            str = mo88814b().getContext().getResources().getString(C0966R.string.mbh, new Object[]{Integer.valueOf(i), str});
        }
        b.setText(str);
        if (this.f181608f <= 0) {
            float desiredWidth = Layout.getDesiredWidth(mo88814b().getText().toString(), mo88814b().getPaint());
            if (desiredWidth > 0.0f) {
                mo88814b().getLayoutParams().width = (int) (((float) MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df)) + desiredWidth);
            }
            String str2 = this.f181604b;
            Log.m105924i(str2, hashCode() + " countDownTvWidth:" + this.f181608f + " to " + desiredWidth + '(' + mo88814b().getLayoutParams().width + ')');
            this.f181608f = (int) desiredWidth;
        }
    }
}
