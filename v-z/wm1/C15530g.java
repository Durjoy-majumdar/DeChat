package wm1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import c30.C104289g;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.HardTouchableLayout;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jm1.C9475d;
import k20.C60958c;
import k20.C9556a;
import km1.C10361l;
import o40.C61926c;
import p185kq.C61130g;
import p192l4.C10462b;
import p565ir.C60606n;
import pe3.C47465a;
import rm1.C13087a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sm1.C13731a;
import te3.C49712hj1;
import te3.C51942x91;
import um1.C14248a;
import vc1.C37715b;
import zt3.C119157j;

/* renamed from: wm1.g */
public final class C15530g extends UIComponent {

    /* renamed from: A */
    public boolean f42093A;

    /* renamed from: d */
    public boolean f42094d;

    /* renamed from: e */
    public List<C51942x91> f42095e = new LinkedList();

    /* renamed from: f */
    public C15522a f42096f;

    /* renamed from: g */
    public int f42097g;

    /* renamed from: h */
    public boolean f42098h;

    /* renamed from: i */
    public boolean f42099i;

    /* renamed from: j */
    public byte[] f42100j;

    /* renamed from: n */
    public boolean f42101n;

    /* renamed from: o */
    public int f42102o;

    /* renamed from: p */
    public String f42103p = "";

    /* renamed from: q */
    public String f42104q = "";

    /* renamed from: r */
    public String f42105r = "";

    /* renamed from: s */
    public String f42106s = "";

    /* renamed from: t */
    public final C13601g f42107t = C36568h.m40985a(new C15535d(this));

    /* renamed from: u */
    public final C13601g f42108u = C36568h.m40985a(new C15543j(this));

    /* renamed from: v */
    public final C13601g f42109v = C36568h.m40985a(new C15533b(this));

    /* renamed from: w */
    public final C13601g f42110w = C36568h.m40985a(new C15544k(this));

    /* renamed from: x */
    public final C13601g f42111x = C36568h.m40985a(new C15545l(this));

    /* renamed from: y */
    public final C13601g f42112y = C36568h.m40985a(new C15536e(this));

    /* renamed from: z */
    public boolean f42113z;

    /* renamed from: wm1.g$a */
    public static final class C15531a {

        /* renamed from: a */
        public TabLayout.C55061f f42114a;

        /* renamed from: b */
        public int f42115b;

        /* renamed from: c */
        public int f42116c;

        /* renamed from: d */
        public TextView f42117d;

        /* renamed from: e */
        public ImageView f42118e;

        /* renamed from: wm1.g$a$a */
        public static final class C15532a extends C87413o implements C32224a<C9475d> {

            /* renamed from: d */
            public final /* synthetic */ C15531a f42119d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15532a(C15531a aVar) {
                super(0);
                this.f42119d = aVar;
            }

            public Object invoke() {
                View view = this.f42119d.f42114a.f154605f;
                C87412m.m108591d(view);
                int i = C0966R.C0970id.kcm;
                ImageView imageView = (ImageView) C10462b.m10395a(view, C0966R.C0970id.kcm);
                if (imageView != null) {
                    i = C0966R.C0970id.kcp;
                    TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.kcp);
                    if (textView != null) {
                        return new C9475d((ConstraintLayout) view, imageView, textView);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            }
        }

        public C15531a(TabLayout.C55061f fVar, int i, boolean z) {
            C87412m.m108594g(fVar, "tab");
            this.f42114a = fVar;
            C13601g a = C36568h.m40985a(new C15532a(this));
            TabLayout.C55061f fVar2 = this.f42114a;
            fVar2.f154600a = this;
            fVar2.mo76122c(C0966R.C0971layout.bkb);
            TextView textView = ((C9475d) ((C36570n) a).getValue()).f29554b;
            this.f42117d = textView;
            if (textView != null) {
                View view = this.f42114a.f154605f;
                C87412m.m108591d(view);
                textView.setTextColor(view.getContext().getResources().getColor(z ? C0966R.color.BW_0_Alpha_0_5_Night_Mode : C0966R.color.f3288ma));
            }
            ImageView imageView = ((C9475d) ((C36570n) a).getValue()).f29553a;
            this.f42118e = imageView;
            if (imageView != null) {
                imageView.setImageResource(C0966R.raw.finder_live_icon);
            }
        }

        /* renamed from: a */
        public final void mo14307a(boolean z) {
            TextView textView = this.f42117d;
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

    /* renamed from: wm1.g$b */
    public static final class C15533b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C15530g f42120d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15533b(C15530g gVar) {
            super(0);
            this.f42120d = gVar;
        }

        public Object invoke() {
            return this.f42120d.findViewById(C0966R.C0970id.f357591ln3);
        }
    }

    /* renamed from: wm1.g$c */
    public static final class C15534c implements TabLayout.C104470c<TabLayout.C55061f> {

        /* renamed from: a */
        public final /* synthetic */ C15530g f42121a;

        public C15534c(C15530g gVar) {
            this.f42121a = gVar;
        }

        /* renamed from: a */
        public void mo9213a(TabLayout.C55061f fVar) {
            C87412m.m108594g(fVar, "t");
            Object obj = fVar.f154600a;
            if (obj instanceof C15531a) {
                C15531a aVar = (C15531a) obj;
                int i = this.f42121a.f42101n ? C0966R.color.BW_0_Alpha_0_5_Night_Mode : C0966R.color.f3288ma;
                TextView textView = aVar.f42117d;
                if (textView != null) {
                    View view = aVar.f42114a.f154605f;
                    C87412m.m108591d(view);
                    textView.setTextColor(view.getContext().getResources().getColor(i));
                }
                aVar.mo14307a(false);
            }
        }

        /* renamed from: b */
        public void mo9214b(TabLayout.C55061f fVar) {
            C87412m.m108594g(fVar, "t");
            Object obj = fVar.f154600a;
            if (obj instanceof C15531a) {
                C15531a aVar = (C15531a) obj;
                int i = this.f42121a.f42101n ? C0966R.color.BW_0_Alpha_0_9_Night_Mode : C0966R.color.a7f;
                TextView textView = aVar.f42117d;
                if (textView != null) {
                    View view = aVar.f42114a.f154605f;
                    C87412m.m108591d(view);
                    textView.setTextColor(view.getContext().getResources().getColor(i));
                }
                aVar.mo14307a(true);
                C39818r rVar = C39818r.f106831a;
                Fragment fragment = this.f42121a.getFragment();
                C87412m.m108591d(fragment);
                C39622i0 a = rVar.mo62445d(fragment).mo75002a(NearbyLiveSquareUIC.class);
                C87412m.m108593f(a, "UICProvider.of(fragment!…iveSquareUIC::class.java)");
                NearbyLiveSquareUIC.m3322j3((NearbyLiveSquareUIC) a, aVar.f42115b, false, (Bundle) null, 6, (Object) null);
            }
        }

        /* renamed from: c */
        public void mo9215c(TabLayout.C55061f fVar) {
            C87412m.m108594g(fVar, "t");
        }
    }

    /* renamed from: wm1.g$d */
    public static final class C15535d extends C87413o implements C32224a<ConstraintLayout> {

        /* renamed from: d */
        public final /* synthetic */ C15530g f42122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15535d(C15530g gVar) {
            super(0);
            this.f42122d = gVar;
        }

        public Object invoke() {
            return (ConstraintLayout) this.f42122d.findViewById(C0966R.C0970id.bd9);
        }
    }

    /* renamed from: wm1.g$e */
    public static final class C15536e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C15530g f42123d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15536e(C15530g gVar) {
            super(0);
            this.f42123d = gVar;
        }

        public Object invoke() {
            return (TextView) this.f42123d.findViewById(C0966R.C0970id.cja);
        }
    }

    /* renamed from: wm1.g$f */
    public static final class C15537f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15530g f42124d;

        public C15537f(C15530g gVar) {
            this.f42124d = gVar;
        }

        public final void onClick(View view) {
            String str;
            TabLayout.C55061f k;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C15530g gVar = this.f42124d;
            gVar.getClass();
            Class cls = C13442s8.class;
            C39818r rVar = C39818r.f106831a;
            Fragment fragment = gVar.getFragment();
            C87412m.m108591d(fragment);
            String str2 = ((C13442s8) rVar.mo62445d(fragment).mo75002a(cls)).f38098n;
            if (str2 == null) {
                str2 = "";
            }
            Intent intent = new Intent();
            intent.putExtra("key_context_id", str2);
            intent.putExtra("key_click_tab_context_id", C13087a.f37256c);
            AbsNearByFragment d3 = gVar.mo14304d3();
            if (d3 == null || (str = d3.mo3551S()) == null) {
                str = "";
            }
            intent.putExtra("key_click_sub_tab_context_id", str);
            new C13731a(gVar.getActivity()).mo13108a(intent);
            Fragment fragment2 = gVar.getFragment();
            if (fragment2 != null) {
                C104289g gVar2 = new C104289g();
                TabLayout f3 = gVar.mo14306f3();
                int i = 0;
                int selectedTabPosition = f3 != null ? f3.getSelectedTabPosition() : 0;
                TabLayout f35 = gVar.mo14306f3();
                C15531a aVar = null;
                Object obj = (f35 == null || (k = f35.mo146907k(selectedTabPosition)) == null) ? null : k.f154600a;
                if (obj instanceof C15531a) {
                    aVar = (C15531a) obj;
                }
                if (aVar != null) {
                    i = aVar.f42116c;
                }
                gVar2.mo145967r("tab_id", Integer.valueOf(i));
                C49712hj1 q3 = ((C13442s8) rVar.mo62445d(fragment2).mo75002a(cls)).mo12861q3();
                FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new FinderBroadcastEidClickStruct();
                finderBroadcastEidClickStruct.f9725d = Util.nowMilliSecond();
                finderBroadcastEidClickStruct.mo1017x("");
                finderBroadcastEidClickStruct.mo1012s("");
                finderBroadcastEidClickStruct.mo1011E("");
                finderBroadcastEidClickStruct.mo1008B("");
                String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                if (Wb == null) {
                    Wb = "";
                }
                finderBroadcastEidClickStruct.mo1019z(Wb);
                String str3 = q3.f134671e;
                if (str3 == null) {
                    str3 = "";
                }
                finderBroadcastEidClickStruct.mo1014u(str3);
                String gK = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
                if (gK == null) {
                    gK = "";
                }
                finderBroadcastEidClickStruct.mo1013t(gK);
                finderBroadcastEidClickStruct.mo1010D("");
                finderBroadcastEidClickStruct.mo1007A("");
                finderBroadcastEidClickStruct.mo1018y("");
                finderBroadcastEidClickStruct.mo1015v("more_page_search");
                finderBroadcastEidClickStruct.mo1016w(gVar2.toString());
                finderBroadcastEidClickStruct.mo1009C(((C60606n) C86312j.m106911c(C60606n.class)).tx0());
                finderBroadcastEidClickStruct.mo86054n();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wm1.g$g */
    public static final class C15538g implements HardTouchableLayout.C7077f {

        /* renamed from: a */
        public final /* synthetic */ C15530g f42125a;

        /* renamed from: wm1.g$g$a */
        public static final class C15539a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C15530g f42126d;

            public C15539a(C15530g gVar) {
                this.f42126d = gVar;
            }

            public final void run() {
                AbsNearByFragment d3 = this.f42126d.mo14304d3();
                if (d3 != null) {
                    d3.mo3557Z();
                }
            }
        }

        public C15538g(C15530g gVar) {
            this.f42125a = gVar;
        }

        /* renamed from: a */
        public void mo2341a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            Log.m105924i("NearbyLiveSquareTabLayoutUIC", "onDoubleClick ...");
            ((C119157j) C119157j.f356862d).mo183895z(new C15539a(this.f42125a));
        }
    }

    /* renamed from: wm1.g$h */
    public static final class C15540h implements HardTouchableLayout.C7074a {

        /* renamed from: a */
        public final /* synthetic */ C15530g f42127a;

        /* renamed from: wm1.g$h$a */
        public static final class C15541a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C15530g f42128d;

            public C15541a(C15530g gVar) {
                this.f42128d = gVar;
            }

            public final void run() {
                AbsNearByFragment d3 = this.f42128d.mo14304d3();
                if (d3 != null) {
                    d3.mo3558a0();
                }
            }
        }

        public C15540h(C15530g gVar) {
            this.f42127a = gVar;
        }

        /* renamed from: a */
        public void mo2343a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            Log.m105924i("NearbyLiveSquareTabLayoutUIC", "onDoubleClick ...");
            ((C119157j) C119157j.f356862d).mo183895z(new C15541a(this.f42127a));
        }
    }

    /* renamed from: wm1.g$i */
    public static final class C15542i extends C87413o implements C32230s<String, String, String, LinkedList<C51942x91>, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15530g f42129d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15542i(C15530g gVar) {
            super(5);
            this.f42129d = gVar;
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            LinkedList linkedList = (LinkedList) obj4;
            boolean booleanValue = ((Boolean) obj5).booleanValue();
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "videoTabName");
            C87412m.m108594g(str3, "liveTabName");
            C87412m.m108594g(linkedList, "tabList");
            Log.m105924i("NearbyLiveSquareTabLayoutUIC", "fetchTabsInfo title:" + str + " videoTabName:" + str2 + " liveTabName:" + str3 + " tabList:" + linkedList + " isHideTabs:" + booleanValue);
            C61926c.m72668M(new C15546h(this.f42129d, str, booleanValue, linkedList));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wm1.g$j */
    public static final class C15543j extends C87413o implements C32224a<HardTouchableLayout> {

        /* renamed from: d */
        public final /* synthetic */ C15530g f42130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15543j(C15530g gVar) {
            super(0);
            this.f42130d = gVar;
        }

        public Object invoke() {
            return (HardTouchableLayout) this.f42130d.findViewById(C0966R.C0970id.kcw);
        }
    }

    /* renamed from: wm1.g$k */
    public static final class C15544k extends C87413o implements C32224a<TabLayout> {

        /* renamed from: d */
        public final /* synthetic */ C15530g f42131d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15544k(C15530g gVar) {
            super(0);
            this.f42131d = gVar;
        }

        public Object invoke() {
            return (TabLayout) this.f42131d.findViewById(C0966R.C0970id.f359340kd1);
        }
    }

    /* renamed from: wm1.g$l */
    public static final class C15545l extends C87413o implements C32224a<FinderViewPager> {

        /* renamed from: d */
        public final /* synthetic */ C15530g f42132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15545l(C15530g gVar) {
            super(0);
            this.f42132d = gVar;
        }

        public Object invoke() {
            return (FinderViewPager) this.f42132d.findViewById(C0966R.C0970id.l89);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15530g(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* JADX WARNING: type inference failed for: r13v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14303c3(java.util.List<? extends te3.C51942x91> r13) {
        /*
            r12 = this;
            boolean r0 = r12.f42093A
            java.lang.String r1 = "NearbyLiveSquareTabLayoutUIC"
            if (r0 == 0) goto L_0x001d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "buildTab hasBuildTab:"
            r13.append(r0)
            boolean r0 = r12.f42093A
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            return
        L_0x001d:
            boolean r0 = r12.f42113z
            if (r0 != 0) goto L_0x0038
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "buildTab onUserVisibleFocused:"
            r13.append(r0)
            boolean r0 = r12.f42113z
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            return
        L_0x0038:
            androidx.fragment.app.Fragment r0 = r12.getFragment()
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.isDetached()
            if (r0 == 0) goto L_0x004b
            java.lang.String r13 = "buildTab after fragment detached"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            return
        L_0x004b:
            androidx.fragment.app.Fragment r0 = r12.getFragment()
            gy3.C87412m.m108591d(r0)
            android.view.View r0 = r0.getView()
            if (r0 != 0) goto L_0x005e
            java.lang.String r13 = "buildTab view is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            return
        L_0x005e:
            boolean r0 = r13.isEmpty()
            r2 = 8
            if (r0 == 0) goto L_0x008f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "buildTab liveTabList:"
            r0.append(r3)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            rx3.g r13 = r12.f42111x
            rx3.n r13 = (rx3.C36570n) r13
            java.lang.Object r13 = r13.getValue()
            com.tencent.mm.plugin.finder.view.FinderViewPager r13 = (com.tencent.p014mm.plugin.finder.view.FinderViewPager) r13
            r13.setVisibility(r2)
            com.tencent.mm.view.HardTouchableLayout r13 = r12.mo14305e3()
            r13.setVisibility(r2)
            return
        L_0x008f:
            com.tencent.mm.view.HardTouchableLayout r0 = r12.mo14305e3()
            r3 = 0
            r0.setVisibility(r3)
            rx3.g r0 = r12.f42111x
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.plugin.finder.view.FinderViewPager r0 = (com.tencent.p014mm.plugin.finder.view.FinderViewPager) r0
            r0.setVisibility(r3)
            boolean r0 = r12.f42094d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkIfHideTabs isHideTabs:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            com.tencent.mm.view.HardTouchableLayout r1 = r12.mo14305e3()
            if (r0 == 0) goto L_0x00c3
            r0 = 8
            goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            r1.setVisibility(r0)
            rx3.g r0 = r12.f42112y
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.List<te3.x91> r1 = r12.f42095e
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            int r1 = r1.size()
            if (r1 != 0) goto L_0x00dc
            r2 = 0
        L_0x00dc:
            r0.setVisibility(r2)
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r1 = r12.getFragment()
            gy3.C87412m.m108591d(r1)
            bl3.r$a r0 = r0.mo62445d(r1)
            java.lang.Class<rs1.s8> r1 = rs1.C13442s8.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            rs1.s8 r0 = (rs1.C13442s8) r0
            te3.hj1 r0 = r0.mo12861q3()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r2 = r13.iterator()
            r4 = 0
        L_0x0102:
            boolean r5 = r2.hasNext()
            r6 = 2
            r7 = 0
            if (r5 == 0) goto L_0x0189
            java.lang.Object r5 = r2.next()
            int r8 = r4 + 1
            if (r4 < 0) goto L_0x0185
            te3.x91 r5 = (te3.C51942x91) r5
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            byte[] r10 = r5.toByteArray()
            java.lang.String r11 = "nearby_live_square_tab_info_key"
            r9.putByteArray(r11, r10)
            int r10 = r0.f134675i
            java.lang.String r11 = "key_from_comment_scene"
            r9.putInt(r11, r10)
            java.lang.String r10 = r0.f134672f
            java.lang.String r11 = "key_click_tab_context_id"
            r9.putString(r11, r10)
            androidx.fragment.app.Fragment r10 = r12.getFragment()
            java.lang.String r11 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment"
            gy3.C87412m.m108592e(r10, r11)
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment r10 = (com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment) r10
            java.lang.String r10 = r10.mo3553U()
            java.lang.String r11 = "key_click_tab_id"
            r9.putString(r11, r10)
            boolean r10 = r12.f42101n
            java.lang.String r11 = "key_use_dark_style"
            r9.putInt(r11, r10)
            java.lang.String r10 = r12.f42103p
            java.lang.String r11 = "key_by_pass"
            r9.putString(r11, r10)
            boolean r10 = r12.f42098h
            java.lang.String r11 = "nearby_live_target_auto_refresh_params_key"
            r9.putBoolean(r11, r10)
            int r10 = r12.f42097g
            if (r10 != 0) goto L_0x015f
            if (r4 == 0) goto L_0x0163
        L_0x015f:
            int r4 = r5.f144531d
            if (r10 != r4) goto L_0x016f
        L_0x0163:
            boolean r4 = r12.f42099i
            r9.putBoolean(r11, r4)
            byte[] r4 = r12.f42100j
            java.lang.String r10 = "nearby_live_target_last_buffer_params_key"
            r9.putByteArray(r10, r4)
        L_0x016f:
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r4 = new com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment
            r4.<init>(r5, r7, r6, r7)
            java.lang.String r5 = r5.f144532e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.f15526n = r5
            r4.setArguments(r9)
            r1.add(r4)
            r4 = r8
            goto L_0x0102
        L_0x0185:
            sx3.C64197v.m75542k()
            throw r7
        L_0x0189:
            java.util.Iterator r0 = r1.iterator()
            r2 = 0
        L_0x018e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01da
            java.lang.Object r4 = r0.next()
            int r5 = r2 + 1
            if (r2 < 0) goto L_0x01d6
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r4 = (com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) r4
            wm1.g$a r8 = new wm1.g$a
            com.google.android.material.tabs.TabLayout r9 = r12.mo14306f3()
            com.google.android.material.tabs.TabLayout$f r9 = r9.mo146908l()
            int r10 = r4.f15527o
            boolean r11 = r12.f42101n
            r8.<init>(r9, r10, r11)
            java.lang.String r9 = r4.f15526n
            java.lang.String r10 = "title"
            gy3.C87412m.m108594g(r9, r10)
            android.widget.TextView r10 = r8.f42117d
            if (r10 != 0) goto L_0x01bc
            goto L_0x01bf
        L_0x01bc:
            r10.setText(r9)
        L_0x01bf:
            r8.f42115b = r2
            te3.x91 r2 = r4.f15690r
            if (r2 == 0) goto L_0x01c8
            int r2 = r2.f144531d
            goto L_0x01c9
        L_0x01c8:
            r2 = 0
        L_0x01c9:
            r8.f42116c = r2
            com.google.android.material.tabs.TabLayout r2 = r12.mo14306f3()
            com.google.android.material.tabs.TabLayout$f r4 = r8.f42114a
            r2.mo146889d(r4, r3)
            r2 = r5
            goto L_0x018e
        L_0x01d6:
            sx3.C64197v.m75542k()
            throw r7
        L_0x01da:
            com.google.android.material.tabs.TabLayout r0 = r12.mo14306f3()
            wm1.g$c r2 = new wm1.g$c
            r2.<init>(r12)
            r0.mo146882a(r2)
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r2 = r12.getFragment()
            gy3.C87412m.m108591d(r2)
            bl3.r$a r0 = r0.mo62445d(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC> r2 = com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r0 = (com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) r0
            r0.getClass()
            java.util.LinkedList<te3.x91> r2 = r0.f15664p
            r2.addAll(r13)
            java.util.LinkedList<com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment> r13 = r0.f15663o
            r13.addAll(r1)
            androidx.fragment.app.Fragment r13 = r0.getFragment()
            if (r13 == 0) goto L_0x021e
            android.view.View r13 = r13.getView()
            if (r13 == 0) goto L_0x021e
            r1 = 2131316254(0x7f094e1e, float:1.8250984E38)
            android.view.View r13 = r13.findViewById(r1)
            r7 = r13
            androidx.viewpager.widget.ViewPager r7 = (androidx.viewpager.widget.ViewPager) r7
        L_0x021e:
            r13 = 1
            if (r7 == 0) goto L_0x0285
            im1.c r1 = new im1.c
            androidx.fragment.app.Fragment r2 = r0.getFragment()
            gy3.C87412m.m108591d(r2)
            androidx.fragment.app.FragmentManager r2 = r2.getChildFragmentManager()
            java.lang.String r4 = "fragment!!.childFragmentManager"
            gy3.C87412m.m108593f(r2, r4)
            java.util.LinkedList<com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment> r4 = r0.f15663o
            r1.<init>(r2, r4)
            r7.setAdapter(r1)
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC$a r1 = r0.f15666r
            r7.addOnPageChangeListener(r1)
            r7.setOffscreenPageLimit(r6)
            tm1.b r1 = new tm1.b
            r1.<init>(r0, r7)
            r7.post(r1)
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99421i2
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0285
            android.content.Context r1 = r7.getContext()
            java.lang.Class<androidx.viewpager.widget.ViewPager> r2 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r4 = "mScroller"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch:{ Exception -> 0x027b }
            java.lang.String r4 = "ViewPager::class.java.ge…eclaredField(\"mScroller\")"
            gy3.C87412m.m108593f(r2, r4)     // Catch:{ Exception -> 0x027b }
            r2.setAccessible(r13)     // Catch:{ Exception -> 0x027b }
            er1.r5 r4 = new er1.r5     // Catch:{ Exception -> 0x027b }
            r4.<init>(r1, r0)     // Catch:{ Exception -> 0x027b }
            r2.set(r7, r4)     // Catch:{ Exception -> 0x027b }
            goto L_0x0285
        L_0x027b:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "ViewPageUtils"
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x0285:
            if (r7 == 0) goto L_0x0290
            androidx.viewpager.widget.a r0 = r7.getAdapter()
            if (r0 == 0) goto L_0x0290
            r0.notifyDataSetChanged()
        L_0x0290:
            r12.f42093A = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wm1.C15530g.mo14303c3(java.util.List):void");
    }

    /* renamed from: d3 */
    public final AbsNearByFragment mo14304d3() {
        if (getFragment() == null) {
            Log.m105928w("NearbyLiveSquareTabLayoutUIC", "getActivityFragment return for fragment is null.");
            return null;
        }
        Fragment fragment = getFragment();
        C87412m.m108591d(fragment);
        if (fragment.getActivity() == null) {
            Log.m105928w("NearbyLiveSquareTabLayoutUIC", "getActivityFragment return for activity is null.");
            return null;
        }
        C39818r rVar = C39818r.f106831a;
        Fragment fragment2 = getFragment();
        C87412m.m108591d(fragment2);
        return ((NearbyLiveSquareUIC) rVar.mo62445d(fragment2).mo75002a(NearbyLiveSquareUIC.class)).mo3605d3();
    }

    /* renamed from: e3 */
    public final HardTouchableLayout mo14305e3() {
        return (HardTouchableLayout) ((C36570n) this.f42108u).getValue();
    }

    /* renamed from: f3 */
    public final TabLayout mo14306f3() {
        return (TabLayout) ((C36570n) this.f42110w).getValue();
    }

    public void onCreate(Bundle bundle) {
        int i;
        byte[] byteArray;
        Fragment fragment = getFragment();
        C87412m.m108591d(fragment);
        Bundle arguments = getArguments();
        boolean z = true;
        this.f42101n = arguments != null && arguments.getInt("key_use_dark_style", 1) == 1;
        Bundle arguments2 = getArguments();
        View view = null;
        String string = arguments2 != null ? arguments2.getString("key_by_pass") : null;
        String str = "";
        if (string == null) {
            string = str;
        }
        this.f42103p = string;
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("key_feed_export_id") : null;
        if (string2 == null) {
            string2 = str;
        }
        this.f42104q = string2;
        Bundle arguments4 = getArguments();
        String string3 = arguments4 != null ? arguments4.getString("key_feed_nonce_id") : null;
        if (string3 == null) {
            string3 = str;
        }
        this.f42105r = string3;
        Bundle arguments5 = getArguments();
        String string4 = arguments5 != null ? arguments5.getString("key_page_title") : null;
        if (string4 != null) {
            str = string4;
        }
        this.f42106s = str;
        Bundle arguments6 = getArguments();
        this.f42102o = arguments6 != null ? arguments6.getInt("key_request_scene") : 0;
        Log.m105924i("NearbyLiveSquareTabLayoutUIC", "onCreate isForceNightMode:" + this.f42101n + " fetchTabListScene:" + this.f42102o + " byPass:" + this.f42103p);
        if (this.f42101n) {
            ((ConstraintLayout) ((C36570n) this.f42107t).getValue()).setBackgroundColor(getResources().getColor(C0966R.color.f2947a4));
        } else {
            ((ConstraintLayout) ((C36570n) this.f42107t).getValue()).setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.ak8));
        }
        View view2 = (View) ((C36570n) this.f42109v).getValue();
        if (view2 != null) {
            if (!((C60606n) C86312j.m106911c(C60606n.class)).Q30() || !C37715b.f99914a.mo61298a()) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setOnClickListener(new C15537f(this));
            }
        }
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (byteArray = arguments7.getByteArray("nearby_live_target_square_page_params_key")) == null) {
            i = 0;
        } else {
            C47465a parseFrom = new C51942x91().parseFrom(byteArray);
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveTabInfo");
            i = ((C51942x91) parseFrom).f144531d;
        }
        this.f42097g = i;
        Bundle arguments8 = getArguments();
        this.f42098h = arguments8 != null ? arguments8.getBoolean("nearby_live_all_auto_refresh_params_key", false) : false;
        Bundle arguments9 = getArguments();
        this.f42099i = arguments9 != null ? arguments9.getBoolean("nearby_live_target_auto_refresh_params_key", false) : false;
        Bundle arguments10 = getArguments();
        this.f42100j = arguments10 != null ? arguments10.getByteArray("nearby_live_target_last_buffer_params_key") : null;
        mo14305e3().setOnSingleClickListener(new C15538g(this));
        mo14305e3().setOnDoubleClickListener(new C15540h(this));
        View view3 = fragment.getView();
        if (view3 != null) {
            view = view3.findViewById(C0966R.C0970id.a7r);
        }
        C39818r rVar = C39818r.f106831a;
        C10361l lVar = ((C14248a) rVar.mo62445d(fragment).mo75002a(C14248a.class)).f39775d;
        FinderViewPager finderViewPager = (FinderViewPager) ((C36570n) this.f42111x).getValue();
        C87412m.m108593f(finderViewPager, "viewPager");
        lVar.getClass();
        lVar.f31542c = view;
        lVar.f31543d = finderViewPager;
        finderViewPager.getLocationOnScreen(lVar.f31544e);
        Log.m105924i("FinderLivePageScrollGuideHelper", "setTargetView pos[" + lVar.f31544e[0] + ", " + lVar.f31544e[1] + "] targetView:" + finderViewPager);
        C49712hj1 q3 = ((C13442s8) rVar.mo62445d(fragment).mo75002a(C13442s8.class)).mo12861q3();
        if (this.f42096f == null) {
            this.f42096f = new C15522a(getContext(), this.f42102o, this.f42103p, this.f42104q, this.f42105r, this.f42106s);
        }
        if (this.f42102o != 0) {
            z = false;
        }
        C15522a aVar3 = this.f42096f;
        if (aVar3 != null) {
            aVar3.mo14300a(q3, false, z, new C15542i(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C15522a aVar = this.f42096f;
        if (aVar != null) {
            C86709a0.m107524d().mo123470p(4210, aVar);
        }
        Log.m105924i("NearbyLiveSquareTabLayoutUIC", "onDestroy");
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        this.f42113z = true;
        mo14303c3(this.f42095e);
        Log.m105924i("NearbyLiveSquareTabLayoutUIC", "onUserVisibleFocused");
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        this.f42113z = false;
    }
}
