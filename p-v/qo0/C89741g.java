package qo0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import at0.C103915c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import ej0.C86524b;
import ej0.C86525c;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Timer;
import p225rc.C89923l;
import p385u2.C111105a;
import po0.C89402b;
import qo3.C12903b;
import rx3.C13598b0;

/* renamed from: qo0.g */
public final class C89741g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final C89402b f258051d;

    /* renamed from: e */
    public final C89731d0 f258052e;

    /* renamed from: f */
    public final boolean f258053f;

    /* renamed from: g */
    public Dialog f258054g;

    /* renamed from: h */
    public Context f258055h;

    /* renamed from: i */
    public View f258056i;

    /* renamed from: j */
    public C89742a f258057j;

    /* renamed from: n */
    public int f258058n;

    /* renamed from: o */
    public BottomSheetBehavior<?> f258059o;

    /* renamed from: p */
    public boolean f258060p;

    /* renamed from: q */
    public int f258061q;

    /* renamed from: r */
    public View f258062r;

    /* renamed from: s */
    public ViewTreeObserver f258063s;

    /* renamed from: t */
    public boolean f258064t;

    /* renamed from: u */
    public boolean f258065u;

    /* renamed from: v */
    public C32227p<? super C86525c, ? super Integer, C13598b0> f258066v;

    /* renamed from: w */
    public C32226l<? super Integer, C13598b0> f258067w;

    /* renamed from: x */
    public C32224a<C13598b0> f258068x;

    /* renamed from: y */
    public final C77386k f258069y;

    /* renamed from: qo0.g$a */
    public final class C89742a extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: qo0.g$a$a */
        public final class C89743a extends RecyclerView.C16631z {

            /* renamed from: A */
            public FrameLayout f258071A;

            /* renamed from: B */
            public ProgressBar f258072B;

            /* renamed from: C */
            public ImageView f258073C;

            /* renamed from: D */
            public final TextView f258074D;

            /* renamed from: z */
            public final TextView f258075z;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C89743a(qo0.C89741g.C89742a r22, android.view.View r23) {
                /*
                    r21 = this;
                    r0 = r21
                    r2 = r23
                    java.lang.String r1 = "itemView"
                    gy3.C87412m.m108594g(r2, r1)
                    r0.<init>(r2)
                    r1 = 2131315712(0x7f094c00, float:1.8249885E38)
                    android.view.View r1 = r2.findViewById(r1)
                    java.lang.String r3 = "itemView.findViewById(R.id.tv_device_name)"
                    gy3.C87412m.m108593f(r1, r3)
                    r15 = r1
                    android.widget.TextView r15 = (android.widget.TextView) r15
                    r0.f258075z = r15
                    r1 = 2131304948(0x7f0921f4, float:1.8228053E38)
                    android.view.View r1 = r2.findViewById(r1)
                    java.lang.String r3 = "itemView.findViewById(R.id.fl_device_item)"
                    gy3.C87412m.m108593f(r1, r3)
                    android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
                    r0.f258071A = r1
                    r1 = 2131310880(0x7f093920, float:1.8240085E38)
                    android.view.View r1 = r2.findViewById(r1)
                    java.lang.String r3 = "itemView.findViewById(R.id.pb_device_connecting)"
                    gy3.C87412m.m108593f(r1, r3)
                    android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                    r0.f258072B = r1
                    r1 = 2131306727(0x7f0928e7, float:1.8231661E38)
                    android.view.View r1 = r2.findViewById(r1)
                    java.lang.String r3 = "itemView.findViewById(R.id.iv_connected)"
                    gy3.C87412m.m108593f(r1, r3)
                    android.widget.ImageView r1 = (android.widget.ImageView) r1
                    r0.f258073C = r1
                    r1 = 2131315690(0x7f094bea, float:1.824984E38)
                    android.view.View r1 = r2.findViewById(r1)
                    java.lang.String r3 = "itemView.findViewById(R.id.tv_cast_fail)"
                    gy3.C87412m.m108593f(r1, r3)
                    r14 = r1
                    android.widget.TextView r14 = (android.widget.TextView) r14
                    r0.f258074D = r14
                    android.widget.ImageView r1 = r0.f258073C
                    r3 = 2131755330(0x7f100142, float:1.9141536E38)
                    r1.setImageResource(r3)
                    at0.c$b r1 = at0.C103915c.f307262l
                    r3 = 0
                    r4 = 0
                    r5 = 1
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r16 = 0
                    r17 = 8182(0x1ff6, float:1.1465E-41)
                    r18 = 0
                    r19 = r14
                    r14 = r16
                    r20 = r15
                    r15 = r17
                    r16 = r18
                    at0.C103915c.C67105b.m79374b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a
                    r1 = 1
                    r2 = r20
                    p849e3.C107207u.C107208b.m145191s(r2, r1)
                    r2 = r19
                    p849e3.C107207u.C107208b.m145191s(r2, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: qo0.C89741g.C89742a.C89743a.<init>(qo0.g$a, android.view.View):void");
            }
        }

        /* renamed from: qo0.g$a$b */
        public final class C89744b extends RecyclerView.C16631z {

            /* renamed from: A */
            public ProgressBar f258076A;

            /* renamed from: z */
            public final TextView f258077z;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C89744b(qo0.C89741g.C89742a r20, android.view.View r21) {
                /*
                    r19 = this;
                    r0 = r19
                    r2 = r21
                    java.lang.String r1 = "itemView"
                    gy3.C87412m.m108594g(r2, r1)
                    r0.<init>(r2)
                    r1 = 2131315830(0x7f094c76, float:1.8250124E38)
                    android.view.View r1 = r2.findViewById(r1)
                    java.lang.String r3 = "itemView.findViewById(R.id.tv_select_device_title)"
                    gy3.C87412m.m108593f(r1, r3)
                    r15 = r1
                    android.widget.TextView r15 = (android.widget.TextView) r15
                    r0.f258077z = r15
                    r1 = 2131310881(0x7f093921, float:1.8240087E38)
                    android.view.View r1 = r2.findViewById(r1)
                    java.lang.String r3 = "itemView.findViewById(R.id.pb_device_search)"
                    gy3.C87412m.m108593f(r1, r3)
                    android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                    r0.f258076A = r1
                    at0.c$b r1 = at0.C103915c.f307262l
                    r3 = 0
                    r4 = 0
                    r5 = 1
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r16 = 8182(0x1ff6, float:1.1465E-41)
                    r17 = 0
                    r18 = r15
                    r15 = r16
                    r16 = r17
                    at0.C103915c.C67105b.m79374b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a
                    r1 = 1
                    r2 = r18
                    p849e3.C107207u.C107208b.m145191s(r2, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: qo0.C89741g.C89742a.C89744b.<init>(qo0.g$a, android.view.View):void");
            }
        }

        public C89742a() {
        }

        /* renamed from: F4 */
        public final C89738e mo124038F4(int i) {
            C89738e eVar;
            if (!(!C89741g.this.f258052e.f258034e.isEmpty()) || i > C89741g.this.f258052e.f258034e.size()) {
                if (!C89741g.this.f258052e.f258034e.isEmpty()) {
                    C89731d0 d0Var = C89741g.this.f258052e;
                    eVar = d0Var.f258033d.get((i - d0Var.f258034e.size()) - 1);
                } else {
                    eVar = C89741g.this.f258052e.f258033d.get(i);
                }
                C87412m.m108593f(eVar, "{\n                if (vi…          }\n            }");
                return eVar;
            }
            C89738e eVar2 = C89741g.this.f258052e.f258034e.get(i);
            C87412m.m108593f(eVar2, "{\n                videoC…bFistTitle]\n            }");
            return eVar2;
        }

        /* renamed from: G4 */
        public final String mo124039G4(int i) {
            Context context = C89741g.this.f258055h;
            if (context == null) {
                return "";
            }
            String string = context.getString(i);
            C87412m.m108593f(string, "ctx.getString(id)");
            return string;
        }

        public int getItemCount() {
            int size = C89741g.m112202a(C89741g.this) ? C89741g.this.f258052e.f258034e.size() + C89741g.this.f258052e.f258033d.size() + 2 : C89741g.this.f258052e.f258033d.size() + C89741g.this.f258052e.f258034e.size() + 1;
            Log.m105918d("MicroMsg.VideoCast.SelectDevicesBottomSheet", "item count = " + size);
            return size;
        }

        public int getItemViewType(int i) {
            if (i != 0 || !C89741g.m112202a(C89741g.this)) {
                return (i != 0 && (!C89741g.m112202a(C89741g.this) || i != C89741g.this.f258052e.f258034e.size() + 1)) ? 3 : 2;
            }
            return 1;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "viewHolder");
            int itemViewType = getItemViewType(i);
            if (itemViewType == 1) {
                C89744b bVar = (C89744b) zVar;
                bVar.f258076A.setVisibility(8);
                if (C89741g.m112202a(C89741g.this)) {
                    bVar.f258077z.setText("最近连接");
                } else {
                    bVar.f258077z.setVisibility(8);
                }
            } else if (itemViewType == 2) {
                C89744b bVar2 = (C89744b) zVar;
                bVar2.f258077z.setText(C89741g.m112202a(C89741g.this) ? mo124039G4(C0966R.string.f7917ap) : mo124039G4(C0966R.string.f7915an));
                new Timer("progressBarHolder", false).schedule(new C89746i(bVar2, C89741g.this, this), 10000, MAlarmHandler.NEXT_FIRE_INTERVAL);
            } else if (itemViewType == 3) {
                C89743a aVar = (C89743a) zVar;
                int i2 = i - 1;
                aVar.f258071A.setOnClickListener(new C89745h(C89741g.this, i2, this, i));
                C89738e F4 = mo124038F4(i2);
                Log.m105918d("MicroMsg.VideoCast.SelectDevicesBottomSheet", "bindDeviceViewHolder: " + F4);
                TextView textView = aVar.f258075z;
                C86524b bVar3 = F4.f258045a.f251382a;
                C87412m.m108591d(bVar3);
                String str = bVar3.f251378g;
                C87412m.m108593f(str, "device.mrDevice.dlnaDevice!!.friendlyName");
                if (!Util.isNullOrNil(str)) {
                    textView.setText(str);
                    if (!C89741g.this.f258053f) {
                        aVar.f258072B.setVisibility(8);
                        aVar.f258073C.setVisibility(8);
                        aVar.f258074D.setVisibility(8);
                        return;
                    }
                    boolean z = F4.f258048d;
                    if (z && F4.f258046b && !F4.f258047c) {
                        aVar.f258072B.setVisibility(0);
                        aVar.f258074D.setVisibility(8);
                        aVar.f258073C.setVisibility(8);
                    } else if (!z && F4.f258047c && F4.f258046b) {
                        aVar.f258072B.setVisibility(8);
                        aVar.f258074D.setVisibility(8);
                        aVar.f258073C.setVisibility(0);
                    } else if (!F4.f258047c && F4.f258046b && !z) {
                        aVar.f258072B.setVisibility(8);
                        aVar.f258074D.setVisibility(8);
                        aVar.f258073C.setVisibility(0);
                    } else if (!F4.f258046b) {
                        aVar.f258072B.setVisibility(8);
                        aVar.f258074D.setVisibility(8);
                        aVar.f258073C.setVisibility(8);
                    }
                } else {
                    C87412m.m108591d(F4.f258045a.f251382a);
                    C87412m.m108593f((Object) null, "device.mrDevice.dlnaDevice!!.modeName");
                    throw null;
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == 3) {
                View inflate = LayoutInflater.from(C89741g.this.f258055h).inflate(C0966R.C0971layout.b2v, viewGroup, false);
                C87412m.m108593f(inflate, "itemView");
                return new C89743a(this, inflate);
            }
            View inflate2 = LayoutInflater.from(C89741g.this.f258055h).inflate(C0966R.C0971layout.b5e, viewGroup, false);
            C87412m.m108593f(inflate2, "itemView");
            return new C89744b(this, inflate2);
        }
    }

    public C89741g(Context context, boolean z, C89402b bVar, C89731d0 d0Var, boolean z2, int i, C8480h hVar) {
        Dialog dialog;
        int i2;
        int i3;
        Context context2 = context;
        C89402b bVar2 = bVar;
        C89731d0 d0Var2 = d0Var;
        boolean z3 = (i & 2) != 0 ? true : z;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(bVar2, "videoCastHandler");
        C87412m.m108594g(d0Var2, "videoCastDeviceManager");
        this.f258051d = bVar2;
        this.f258052e = d0Var2;
        this.f258053f = z2;
        this.f258055h = context2;
        this.f258064t = true;
        this.f258065u = z3;
        this.f258067w = C12896p.f36881d;
        C77386k kVar = new C77386k(this);
        this.f258069y = kVar;
        Context context3 = this.f258055h;
        if (context3 instanceof Activity) {
            C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
            View decorView = ((Activity) context3).getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f258062r = ((ViewGroup) decorView).findViewById(16908290);
        }
        Context context4 = this.f258055h;
        if (this.f258065u) {
            C87412m.m108591d(context4);
            dialog = new C12903b(context4, 0);
        } else {
            C87412m.m108591d(context4);
            dialog = new C104428a(context4, 0);
        }
        this.f258054g = dialog;
        View inflate = View.inflate(context4, C0966R.C0971layout.b5d, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…video_cast_devices, null)");
        this.f258056i = inflate;
        C103915c.C67105b bVar3 = C103915c.f307262l;
        View findViewById = inflate.findViewById(C0966R.C0970id.kyn);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.tv_title)");
        C103915c.C67105b.m79374b(bVar3, findViewById, (Class) null, (Integer) null, false, Boolean.TRUE, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 8174, (Object) null);
        View view = this.f258056i;
        if (view != null) {
            View findViewById2 = view.findViewById(C0966R.C0970id.kwt);
            findViewById2.setOnClickListener(new C77387l(this));
            C103915c.C67105b.m79374b(bVar3, findViewById2, Button.class, Integer.valueOf(C0966R.string.b2u), false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 8184, (Object) null);
            View view2 = this.f258056i;
            if (view2 != null) {
                RecyclerView recyclerView = (RecyclerView) view2.findViewById(C0966R.C0970id.ahh);
                recyclerView.setHasFixedSize(true);
                View view3 = this.f258056i;
                if (view3 != null) {
                    View findViewById3 = view3.findViewById(C0966R.C0970id.fco);
                    findViewById3.setOnClickListener(new C77388m(this));
                    C103915c.C67105b.m79374b(bVar3, findViewById3, Button.class, Integer.valueOf(C0966R.string.f7914am), false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 8184, (Object) null);
                    View view4 = this.f258056i;
                    if (view4 != null) {
                        ImageView imageView = (ImageView) view4.findViewById(C0966R.C0970id.fcn);
                        if (C89923l.f258408a.mo117495a()) {
                            Context context5 = this.f258055h;
                            C87412m.m108591d(context5);
                            Object obj = C111105a.f332697a;
                            imageView.setImageDrawable(C111105a.C111110c.m151511b(context5, C0966R.C0969drawable.f357090bt2));
                        } else {
                            Context context6 = this.f258055h;
                            C87412m.m108591d(context6);
                            Object obj2 = C111105a.f332697a;
                            imageView.setImageDrawable(C111105a.C111110c.m151511b(context6, C0966R.C0969drawable.bsy));
                        }
                        this.f258060p = mo124034c();
                        int c = C74942w4.m89786c(this.f258055h, C0966R.dimen.f4182vc);
                        if (this.f258060p) {
                            i3 = (int) (((double) c) * 4.5d);
                            i2 = C74942w4.m89786c(this.f258055h, C0966R.dimen.f4175v5);
                        } else {
                            i3 = (int) (((double) c) * 6.5d);
                            i2 = C74942w4.m89786c(this.f258055h, C0966R.dimen.f4175v5);
                        }
                        this.f258058n = i3 + i2;
                        recyclerView.setLayoutManager(new LinearLayoutManager(this.f258055h));
                        recyclerView.setFocusable(false);
                        C89742a aVar = new C89742a();
                        this.f258057j = aVar;
                        recyclerView.setAdapter(aVar);
                        recyclerView.setOverScrollMode(1);
                        Dialog dialog2 = this.f258054g;
                        if (dialog2 != null) {
                            View view5 = this.f258056i;
                            if (view5 != null) {
                                dialog2.setContentView(view5);
                                if (!this.f258065u) {
                                    View view6 = this.f258056i;
                                    if (view6 != null) {
                                        ViewParent parent = view6.getParent();
                                        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
                                        BottomSheetBehavior<?> y = BottomSheetBehavior.m139527y((View) parent);
                                        this.f258059o = y;
                                        C87412m.m108591d(y);
                                        y.mo146383A(this.f258058n);
                                    } else {
                                        C87412m.m108603p("rootView");
                                        throw null;
                                    }
                                }
                                Dialog dialog3 = this.f258054g;
                                if (dialog3 != null) {
                                    dialog3.setOnCancelListener(new C89748n(this));
                                    Dialog dialog4 = this.f258054g;
                                    if (dialog4 != null) {
                                        dialog4.setOnDismissListener(new C89749o(this));
                                        Dialog dialog5 = this.f258054g;
                                        if (dialog5 != null) {
                                            dialog5.setCancelable(false);
                                            AppBrandRuntime a = bVar.mo123732a();
                                            if (a != null) {
                                                a.mo113057h(4, -1, kVar);
                                                return;
                                            }
                                            return;
                                        }
                                        C87412m.m108603p("mBottomSheetDialog");
                                        throw null;
                                    }
                                    C87412m.m108603p("mBottomSheetDialog");
                                    throw null;
                                }
                                C87412m.m108603p("mBottomSheetDialog");
                                throw null;
                            }
                            C87412m.m108603p("rootView");
                            throw null;
                        }
                        C87412m.m108603p("mBottomSheetDialog");
                        throw null;
                    }
                    C87412m.m108603p("rootView");
                    throw null;
                }
                C87412m.m108603p("rootView");
                throw null;
            }
            C87412m.m108603p("rootView");
            throw null;
        }
        C87412m.m108603p("rootView");
        throw null;
    }

    /* renamed from: a */
    public static final boolean m112202a(C89741g gVar) {
        return !gVar.f258052e.f258034e.isEmpty();
    }

    /* renamed from: b */
    public final int mo124033b() {
        Context context = this.f258055h;
        if (!(context instanceof Activity)) {
            return 0;
        }
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    /* renamed from: c */
    public final boolean mo124034c() {
        Context context = this.f258055h;
        C87412m.m108591d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: d */
    public final boolean mo124035d() {
        Dialog dialog = this.f258054g;
        if (dialog != null) {
            if (dialog == null) {
                C87412m.m108603p("mBottomSheetDialog");
                throw null;
            } else if (dialog.isShowing()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo124036e() {
        if (this.f258054g != null) {
            BottomSheetBehavior<?> bottomSheetBehavior = this.f258059o;
            if (bottomSheetBehavior != null) {
                C87412m.m108591d(bottomSheetBehavior);
                bottomSheetBehavior.f309230p = true;
            }
            Context context = this.f258055h;
            if (context != null) {
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                if (!((Activity) context).isFinishing()) {
                    Dialog dialog = this.f258054g;
                    if (dialog != null) {
                        dialog.dismiss();
                    } else {
                        C87412m.m108603p("mBottomSheetDialog");
                        throw null;
                    }
                }
            }
        }
        AppBrandRuntime a = this.f258051d.mo123732a();
        if (a != null) {
            a.mo113016K0(this.f258069y);
        }
    }

    public void onGlobalLayout() {
        if (mo124035d()) {
            View view = this.f258062r;
            if (view == null || (!view.isShown() && view.getVisibility() != 0)) {
                mo124036e();
            } else if (!mo124035d()) {
            } else {
                if (this.f258060p != mo124034c() || this.f258061q != mo124033b()) {
                    mo124036e();
                }
            }
        }
    }
}
