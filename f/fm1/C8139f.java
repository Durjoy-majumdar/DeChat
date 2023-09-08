package fm1;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.nearby.NearbyHomeUIC;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.HardTouchableLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60152b4;
import j20.C117292a;
import java.util.ArrayList;
import jm1.C9473b;
import jm1.C9474c;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import p192l4.C10462b;
import p601lv.C76726b;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C49712hj1;
import wm1.C15522a;
import zt3.C119157j;

/* renamed from: fm1.f */
public final class C8139f extends UIComponent {

    /* renamed from: d */
    public C15522a f27002d;

    /* renamed from: e */
    public final C13601g f27003e;

    /* renamed from: f */
    public final C13601g f27004f;

    /* renamed from: g */
    public final C13601g f27005g;

    /* renamed from: h */
    public final C13601g f27006h;

    /* renamed from: i */
    public final C13601g f27007i;

    /* renamed from: j */
    public final C13601g f27008j;

    /* renamed from: fm1.f$a */
    public static final class C8140a {

        /* renamed from: a */
        public TabLayout.C55061f f27009a;

        /* renamed from: b */
        public int f27010b;

        /* renamed from: c */
        public TextView f27011c;

        /* renamed from: d */
        public WeImageView f27012d;

        /* renamed from: e */
        public ImageView f27013e;

        /* renamed from: fm1.f$a$a */
        public static final class C8141a extends C87413o implements C32224a<C9473b> {

            /* renamed from: d */
            public final /* synthetic */ C8140a f27014d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8141a(C8140a aVar) {
                super(0);
                this.f27014d = aVar;
            }

            public Object invoke() {
                View view = this.f27014d.f27009a.f154605f;
                C87412m.m108591d(view);
                int i = C0966R.C0970id.kcm;
                ImageView imageView = (ImageView) C10462b.m10395a(view, C0966R.C0970id.kcm);
                if (imageView != null) {
                    i = C0966R.C0970id.kcp;
                    TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.kcp);
                    if (textView != null) {
                        return new C9473b((ConstraintLayout) view, imageView, textView);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            }
        }

        /* renamed from: fm1.f$a$b */
        public static final class C8142b extends C87413o implements C32224a<C9474c> {

            /* renamed from: d */
            public final /* synthetic */ C8140a f27015d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8142b(C8140a aVar) {
                super(0);
                this.f27015d = aVar;
            }

            public Object invoke() {
                View view = this.f27015d.f27009a.f154605f;
                C87412m.m108591d(view);
                int i = C0966R.C0970id.kcm;
                ImageView imageView = (ImageView) C10462b.m10395a(view, C0966R.C0970id.kcm);
                if (imageView != null) {
                    i = C0966R.C0970id.kcp;
                    TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.kcp);
                    if (textView != null) {
                        i = C0966R.C0970id.kcs;
                        WeImageView weImageView = (WeImageView) C10462b.m10395a(view, C0966R.C0970id.kcs);
                        if (weImageView != null) {
                            return new C9474c((ConstraintLayout) view, imageView, textView, weImageView);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            }
        }

        public C8140a(TabLayout.C55061f fVar, int i) {
            C87412m.m108594g(fVar, "tab");
            this.f27009a = fVar;
            this.f27010b = i;
            C13601g a = C36568h.m40985a(new C8141a(this));
            C13601g a2 = C36568h.m40985a(new C8142b(this));
            this.f27009a.f154600a = this;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            float f = (displayMetrics.density * 15.0f) / context.getResources().getDisplayMetrics().density;
            int i2 = this.f27010b;
            ImageView imageView = null;
            if (i2 != 1006) {
                switch (i2) {
                    case 1001:
                        this.f27009a.mo76122c(C0966R.C0971layout.bk8);
                        TextView textView = ((C9473b) ((C36570n) a).getValue()).f29549b;
                        C87412m.m108591d(textView);
                        this.f27011c = textView;
                        ImageView imageView2 = ((C9473b) ((C36570n) a).getValue()).f29548a;
                        C87412m.m108591d(imageView2);
                        this.f27013e = imageView2;
                        imageView2.setImageResource(C0966R.raw.finder_live_icon);
                        TextView textView2 = this.f27011c;
                        if (textView2 != null) {
                            textView2.setTextSize(1, f);
                            return;
                        }
                        return;
                    case 1002:
                        break;
                    case 1003:
                        this.f27009a.mo76122c(C0966R.C0971layout.bk9);
                        C9474c cVar = (C9474c) ((C36570n) a2).getValue();
                        TextView textView3 = cVar != null ? cVar.f29551b : null;
                        C87412m.m108591d(textView3);
                        this.f27011c = textView3;
                        textView3.setTextSize(1, f);
                        C9474c cVar2 = (C9474c) ((C36570n) a2).getValue();
                        WeImageView weImageView = cVar2 != null ? cVar2.f29552c : null;
                        C87412m.m108591d(weImageView);
                        this.f27012d = weImageView;
                        C9474c cVar3 = (C9474c) ((C36570n) a2).getValue();
                        imageView = cVar3 != null ? cVar3.f29550a : imageView;
                        C87412m.m108591d(imageView);
                        this.f27013e = imageView;
                        if (((C76726b) C86312j.m106911c(C76726b.class)).mo106906Qx()) {
                            WeImageView weImageView2 = this.f27012d;
                            if (weImageView2 != null) {
                                weImageView2.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        WeImageView weImageView3 = this.f27012d;
                        if (weImageView3 != null) {
                            weImageView3.setVisibility(0);
                            return;
                        }
                        return;
                    default:
                        this.f27009a.mo76122c(C0966R.C0971layout.f359696ad2);
                        return;
                }
            }
            this.f27009a.mo76122c(C0966R.C0971layout.bk8);
            C9473b bVar = (C9473b) ((C36570n) a).getValue();
            TextView textView4 = bVar != null ? bVar.f29549b : null;
            C87412m.m108591d(textView4);
            this.f27011c = textView4;
            C9473b bVar2 = (C9473b) ((C36570n) a).getValue();
            imageView = bVar2 != null ? bVar2.f29548a : imageView;
            C87412m.m108591d(imageView);
            this.f27013e = imageView;
            TextView textView5 = this.f27011c;
            if (textView5 != null) {
                textView5.setTextSize(1, f);
            }
        }

        /* renamed from: a */
        public final void mo9207a(boolean z) {
            TextView textView = this.f27011c;
            if (textView == null) {
                return;
            }
            if (z) {
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                return;
            }
            textView.getPaint().setFakeBoldText(false);
            textView.getPaint().setStrokeWidth(0.0f);
        }
    }

    /* renamed from: fm1.f$b */
    public static final class C8143b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f27016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8143b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f27016d = appCompatActivity;
        }

        public Object invoke() {
            return this.f27016d.findViewById(C0966R.C0970id.a37);
        }
    }

    /* renamed from: fm1.f$c */
    public static final class C8144c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f27017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8144c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f27017d = appCompatActivity;
        }

        public Object invoke() {
            return this.f27017d.findViewById(C0966R.C0970id.hak);
        }
    }

    /* renamed from: fm1.f$d */
    public static final class C8145d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f27018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8145d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f27018d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f27018d.findViewById(C0966R.C0970id.hal);
        }
    }

    /* renamed from: fm1.f$e */
    public static final class C8146e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f27019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8146e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f27019d = appCompatActivity;
        }

        public Object invoke() {
            return this.f27019d.findViewById(C0966R.C0970id.ham);
        }
    }

    /* renamed from: fm1.f$f */
    public static final class C8147f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8139f f27020d;

        public C8147f(C8139f fVar) {
            this.f27020d = fVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f27020d.getActivity().onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fm1.f$g */
    public static final class C8148g implements HardTouchableLayout.C7077f {

        /* renamed from: a */
        public final /* synthetic */ C8139f f27021a;

        /* renamed from: fm1.f$g$a */
        public static final class C8149a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C8139f f27022d;

            public C8149a(C8139f fVar) {
                this.f27022d = fVar;
            }

            public final void run() {
                AbsNearByFragment c3 = ((NearbyHomeUIC) C39818r.f106831a.mo62444c(this.f27022d.getActivity()).mo75002a(NearbyHomeUIC.class)).mo3542c3();
                if (c3 != null) {
                    c3.mo3557Z();
                }
            }
        }

        public C8148g(C8139f fVar) {
            this.f27021a = fVar;
        }

        /* renamed from: a */
        public void mo2341a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            Log.m105924i("NearbyActionBarUIC", "onDoubleClick ...");
            ((C119157j) C119157j.f356862d).mo183895z(new C8149a(this.f27021a));
        }
    }

    /* renamed from: fm1.f$h */
    public static final class C8150h implements HardTouchableLayout.C7074a {

        /* renamed from: a */
        public final /* synthetic */ C8139f f27023a;

        /* renamed from: fm1.f$h$a */
        public static final class C8151a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C8139f f27024d;

            public C8151a(C8139f fVar) {
                this.f27024d = fVar;
            }

            public final void run() {
                AbsNearByFragment c3 = ((NearbyHomeUIC) C39818r.f106831a.mo62444c(this.f27024d.getActivity()).mo75002a(NearbyHomeUIC.class)).mo3542c3();
                if (c3 != null) {
                    c3.mo3558a0();
                }
            }
        }

        public C8150h(C8139f fVar) {
            this.f27023a = fVar;
        }

        /* renamed from: a */
        public void mo2343a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            Log.m105924i("NearbyActionBarUIC", "onDoubleClick ...");
            ((C119157j) C119157j.f356862d).mo183895z(new C8151a(this.f27023a));
        }
    }

    /* renamed from: fm1.f$i */
    public static final class C8152i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8139f f27025d;

        /* renamed from: fm1.f$i$a */
        public static final class C8153a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C8139f f27026d;

            public C8153a(C8139f fVar) {
                this.f27026d = fVar;
            }

            public final void run() {
                AbsNearByFragment c3 = ((NearbyHomeUIC) C39818r.f106831a.mo62444c(this.f27026d.getActivity()).mo75002a(NearbyHomeUIC.class)).mo3542c3();
                if (c3 != null) {
                    c3.mo3559d0();
                }
            }
        }

        public C8152i(C8139f fVar) {
            this.f27025d = fVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("NearbyActionBarUIC", "onMenuClick ...");
            if (C58739j4.f168176a.mo83683L()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C8153a(this.f27025d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fm1.f$j */
    public static final class C8154j extends C87413o implements C32224a<HardTouchableLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f27027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8154j(AppCompatActivity appCompatActivity) {
            super(0);
            this.f27027d = appCompatActivity;
        }

        public Object invoke() {
            return (HardTouchableLayout) this.f27027d.findViewById(C0966R.C0970id.kcw);
        }
    }

    /* renamed from: fm1.f$k */
    public static final class C8155k extends C87413o implements C32224a<TabLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f27028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8155k(AppCompatActivity appCompatActivity) {
            super(0);
            this.f27028d = appCompatActivity;
        }

        public Object invoke() {
            return (TabLayout) this.f27028d.findViewById(C0966R.C0970id.f359340kd1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8139f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f27003e = C36568h.m40985a(new C8143b(appCompatActivity));
        this.f27004f = C36568h.m40985a(new C8154j(appCompatActivity));
        this.f27005g = C36568h.m40985a(new C8144c(appCompatActivity));
        this.f27006h = C36568h.m40985a(new C8145d(appCompatActivity));
        this.f27007i = C36568h.m40985a(new C8146e(appCompatActivity));
        this.f27008j = C36568h.m40985a(new C8155k(appCompatActivity));
    }

    /* renamed from: c3 */
    public static final TabLayout.C55061f m8228c3(C8139f fVar, TabLayout tabLayout, Object obj) {
        fVar.getClass();
        int tabCount = tabLayout.getTabCount();
        int i = 0;
        while (true) {
            Object obj2 = null;
            if (i >= tabCount) {
                return null;
            }
            TabLayout.C55061f k = tabLayout.mo146907k(i);
            if (k != null) {
                obj2 = k.f154600a;
            }
            if (obj2 instanceof C8140a) {
                Object obj3 = k.f154600a;
                C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.NearbyActionBarUIC.NearbyTab");
                int i2 = ((C8140a) obj3).f27010b;
                if ((obj instanceof Integer) && i2 == ((Number) obj).intValue()) {
                    return k;
                }
            }
            i++;
        }
    }

    /* renamed from: d3 */
    public static final void m8229d3(C8139f fVar, int i) {
        if (i == 1) {
            View view = (View) ((C36570n) fVar.f27005g).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) ((C36570n) fVar.f27006h).getValue()).setVisibility(8);
            View view3 = (View) ((C36570n) fVar.f27007i).getValue();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i == 2) {
            View view5 = (View) ((C36570n) fVar.f27005g).getValue();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(4);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i != 3) {
            fVar.getClass();
        } else {
            View view7 = (View) ((C36570n) fVar.f27005g).getValue();
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) ((C36570n) fVar.f27006h).getValue()).setVisibility(8);
            View view9 = (View) ((C36570n) fVar.f27007i).getValue();
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e3 */
    public final void mo9205e3() {
        Class cls = FinderCommonFeatureService.class;
        if (!((C76726b) C86312j.m106911c(C76726b.class)).mo106906Qx()) {
            Log.m105924i("NearbyActionBarUIC", "checkAddFootPrintRedDot: add footprint red dot");
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158525b.mo2466c();
            return;
        }
        Log.m105924i("NearbyActionBarUIC", "checkAddFootPrintRedDot: clear footprint red dot");
        C60152b4.C8759a.m8562b(((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0(), 1014, (String) null, 2, (Object) null);
    }

    /* renamed from: f3 */
    public final TabLayout mo9206f3() {
        return (TabLayout) ((C36570n) this.f27008j).getValue();
    }

    public void onCreate(Bundle bundle) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        ((View) ((C36570n) this.f27003e).getValue()).setOnClickListener(new C8147f(this));
        ((HardTouchableLayout) ((C36570n) this.f27004f).getValue()).setOnSingleClickListener(new C8148g(this));
        ((HardTouchableLayout) ((C36570n) this.f27004f).getValue()).setOnDoubleClickListener(new C8150h(this));
        ((View) ((C36570n) this.f27005g).getValue()).setOnClickListener(new C8152i(this));
        TextView textView = (TextView) ((C36570n) this.f27006h).getValue();
        if (textView != null) {
            textView.setTextSize(1, 15.0f);
        }
        Class cls = NearbyHomeUIC.class;
        C39818r rVar = C39818r.f106831a;
        if (((NearbyHomeUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).f15513f.size() == 2) {
            ViewGroup.LayoutParams layoutParams = ((HardTouchableLayout) ((C36570n) this.f27004f).getValue()).getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        int i = 0;
        for (T next : ((NearbyHomeUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).f15513f) {
            int i2 = i + 1;
            if (i >= 0) {
                AbsNearByFragment absNearByFragment = (AbsNearByFragment) next;
                C8140a aVar = new C8140a(mo9206f3().mo146908l(), absNearByFragment.f15527o);
                if (!TextUtils.isEmpty(absNearByFragment.f15526n)) {
                    String str = absNearByFragment.f15526n;
                    C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    TextView textView2 = aVar.f27011c;
                    if (textView2 != null) {
                        textView2.setText(str);
                    }
                } else {
                    String string = getContext().getString(absNearByFragment.f15525j);
                    C87412m.m108593f(string, "context.getString(fragment.titleId)");
                    TextView textView3 = aVar.f27011c;
                    if (textView3 != null) {
                        textView3.setText(string);
                    }
                }
                mo9206f3().mo146889d(aVar.f27009a, false);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        mo9206f3().mo146882a(new C8156g(this));
        C61926c.m72695t(C2479n0.f12980z, getActivity(), new C8159j(this));
        C61926c.m72695t(C2479n0.f12944A, getActivity(), new C8160k(this));
        C61926c.m72695t(C2479n0.f12945B, getActivity(), new C8161l(this));
        Class cls2 = C13442s8.class;
        Fragment fragment = getFragment();
        C49712hj1 q3 = fragment != null ? ((C13442s8) C39818r.f106831a.mo62445d(fragment).mo75002a(cls2)).mo12861q3() : ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls2)).mo12861q3();
        if (this.f27002d == null) {
            this.f27002d = new C15522a(getContext(), 0, "", "", "", "");
        }
        C15522a aVar2 = this.f27002d;
        if (aVar2 != null) {
            aVar2.mo14300a(q3, true, true, new C8158i(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C15522a aVar = this.f27002d;
        if (aVar != null) {
            C86709a0.m107524d().mo123470p(4210, aVar);
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
