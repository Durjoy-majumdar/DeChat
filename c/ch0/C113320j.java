package ch0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.address.model.RcptItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jq3.C60896i;
import jq3.C60897k;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import nj3.C47265d;
import nl3.C47276a;
import p447aw.C103918d;
import p702ts.C118505d;
import p702ts.C78083b;
import p702ts.C78085c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C66723k;
import zg0.C119113p;

/* renamed from: ch0.j */
public final class C113320j extends C47276a {

    /* renamed from: G */
    public static RcptItem f339075G = new RcptItem("暂不选择", "000000000", "000000");

    /* renamed from: A */
    public final C13601g f339076A = C36568h.m40985a(new C113332i(this));

    /* renamed from: B */
    public RcptItem f339077B;

    /* renamed from: C */
    public int f339078C = 1;

    /* renamed from: D */
    public List<RcptItem> f339079D;

    /* renamed from: E */
    public C92411b.C92412a f339080E;

    /* renamed from: F */
    public C78083b.C78084a f339081F;

    /* renamed from: s */
    public final C32226l<RcptItem, C13598b0> f339082s;

    /* renamed from: t */
    public final int f339083t;

    /* renamed from: u */
    public final C119113p f339084u;

    /* renamed from: v */
    public final boolean f339085v;

    /* renamed from: w */
    public final C13601g f339086w = C36568h.m40985a(new C113336m(this));

    /* renamed from: x */
    public final C13601g f339087x = C36568h.m40985a(new C113333j(this));

    /* renamed from: y */
    public final C13601g f339088y = C36568h.m40985a(new C113335l(this));

    /* renamed from: z */
    public final C13601g f339089z = C36568h.m40985a(new C113334k(this));

    /* renamed from: ch0.j$a */
    public final class C113321a extends C60896i<C113322b> {
        public C113321a() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.bvu;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C113322b bVar = (C113322b) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(bVar, "addressItem");
            ((TextView) oVar.mo85812D(C0966R.C0970id.f5603jk)).setText(bVar.f339091d.f196786d);
            ((WeImageView) oVar.mo85812D(C0966R.C0970id.k0t)).setVisibility(C113320j.this.f339079D.contains(bVar.f339091d) ? 0 : 4);
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: ch0.j$b */
    public static final class C113322b implements C9493c {

        /* renamed from: d */
        public RcptItem f339091d;

        public C113322b(RcptItem rcptItem) {
            C87412m.m108594g(rcptItem, "item");
            this.f339091d = rcptItem;
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        public long getItemId() {
            return (long) hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: ch0.j$c */
    public static final class C113323c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C113320j f339092d;

        public C113323c(C113320j jVar) {
            this.f339092d = jVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f339092d.cancel();
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ch0.j$d */
    public static final class C113324d implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C113320j f339093d;

        public C113324d(C113320j jVar) {
            this.f339093d = jVar;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            Log.m105924i("MicroMsg.SelectAddressDialog", "onPageSelected");
            TextView[] textViewArr = {(TextView) ((C36570n) this.f339093d.f339087x).getValue(), (TextView) ((C36570n) this.f339093d.f339088y).getValue(), (TextView) ((C36570n) this.f339093d.f339089z).getValue(), (TextView) ((C36570n) this.f339093d.f339076A).getValue()};
            C113320j jVar = this.f339093d;
            int i2 = 0;
            int i3 = 0;
            while (i2 < 4) {
                TextView textView = textViewArr[i2];
                int i4 = i3 + 1;
                String str = null;
                RcptItem rcptItem = i3 >= jVar.f339079D.size() ? null : jVar.f339079D.get(i3);
                if (rcptItem != null) {
                    if (textView != null) {
                        textView.setText(rcptItem.f196786d);
                    }
                    if (textView != null) {
                        textView.setTextColor(jVar.getContext().getResources().getColor(C0966R.color.a7f));
                    }
                } else {
                    if (textView != null) {
                        CharSequence hint = textView.getHint();
                        if (hint != null) {
                            str = hint.toString();
                        }
                        textView.setText(str);
                    }
                    if (textView != null) {
                        textView.setTextColor(jVar.getContext().getResources().getColor(C0966R.color.f3563xt));
                    }
                }
                if (textView != null) {
                    textView.setVisibility(jVar.f339078C > i3 ? 0 : 4);
                }
                if (i == i3) {
                    if (textView != null) {
                        C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    }
                } else if (textView != null) {
                    C85875k4.m106193l0(textView.getPaint());
                }
                i2++;
                i3 = i4;
            }
        }
    }

    /* renamed from: ch0.j$e */
    public static final class C113325e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C113320j f339094d;

        /* renamed from: e */
        public final /* synthetic */ int f339095e;

        public C113325e(C113320j jVar, int i) {
            this.f339094d = jVar;
            this.f339095e = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C113320j jVar = this.f339094d;
            RcptItem rcptItem = C113320j.f339075G;
            CustomViewPager L = jVar.mo165885L();
            if (L != null) {
                L.setCurrentItem(this.f339095e, true);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ch0.j$f */
    public static final class C113326f extends C47265d {

        /* renamed from: g */
        public final /* synthetic */ C113320j f339096g;

        /* renamed from: h */
        public final /* synthetic */ HashMap<Integer, View> f339097h;

        /* renamed from: ch0.j$f$a */
        public static final class C113327a extends WxRecyclerAdapter<C113322b> {
            public C113327a(ArrayList<C113322b> arrayList, C9500j jVar) {
                super(jVar, arrayList, true);
            }

            /* renamed from: v6 */
            public boolean mo6267v6() {
                return true;
            }
        }

        /* renamed from: ch0.j$f$b */
        public static final class C113328b implements C60897k<C113322b> {

            /* renamed from: a */
            public final /* synthetic */ C113320j f339098a;

            /* renamed from: b */
            public final /* synthetic */ int f339099b;

            /* renamed from: c */
            public final /* synthetic */ HashMap<Integer, View> f339100c;

            /* renamed from: d */
            public final /* synthetic */ WxRecyclerView f339101d;

            /* renamed from: e */
            public final /* synthetic */ C113326f f339102e;

            public C113328b(C113320j jVar, int i, HashMap<Integer, View> hashMap, WxRecyclerView wxRecyclerView, C113326f fVar) {
                this.f339098a = jVar;
                this.f339099b = i;
                this.f339100c = hashMap;
                this.f339101d = wxRecyclerView;
                this.f339102e = fVar;
            }

            /* renamed from: a */
            public boolean mo2039a(View view, C9493c cVar, int i) {
                C60897k.C9501a.m9192a(this, view, (C113322b) cVar, i);
                return false;
            }

            /* renamed from: b */
            public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
                C60897k.C9501a.m9193b(this, view, motionEvent, (C113322b) cVar, i);
                return false;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b6, code lost:
                if (r8.f339099b == (r8.f339098a.f339078C - 1)) goto L_0x00ea;
             */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo2041c(android.view.View r9, jq3.C9493c r10, int r11) {
                /*
                    r8 = this;
                    ch0.j$b r10 = (ch0.C113320j.C113322b) r10
                    java.lang.String r11 = "itemView"
                    gy3.C87412m.m108594g(r9, r11)
                    java.lang.String r9 = "data"
                    gy3.C87412m.m108594g(r10, r9)
                    ch0.j r9 = r8.f339098a
                    java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r11 = r9.f339079D
                    int r0 = r8.f339099b
                    r1 = 0
                    java.util.List r11 = r11.subList(r1, r0)
                    r9.f339079D = r11
                    ch0.j r9 = r8.f339098a
                    java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r9 = r9.f339079D
                    com.tencent.mm.plugin.address.model.RcptItem r11 = r10.f339091d
                    r9.add(r11)
                    java.lang.String r2 = "110000000"
                    java.lang.String r3 = "120000000"
                    java.lang.String r4 = "500000000"
                    java.lang.String r5 = "310000000"
                    java.lang.String r6 = "810000000"
                    java.lang.String r7 = "820000000"
                    java.lang.String[] r9 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
                    java.util.ArrayList r9 = sx3.C64197v.m75534c(r9)
                    com.tencent.mm.plugin.address.model.RcptItem r11 = r10.f339091d
                    java.lang.String r11 = r11.f196787e
                    boolean r9 = r9.contains(r11)
                    r11 = 1
                    if (r9 == 0) goto L_0x0075
                    ch0.j r9 = r8.f339098a
                    zg0.p r9 = r9.f339084u
                    com.tencent.mm.plugin.address.model.RcptItem r0 = r10.f339091d
                    java.lang.String r0 = r0.f196787e
                    java.util.List r9 = r9.mo183781f(r0)
                    java.util.ArrayList r9 = (java.util.ArrayList) r9
                    java.lang.Object r9 = r9.get(r1)
                    java.lang.String r0 = "addrMgr.getRegionByParent(data.item.code)[0]"
                    gy3.C87412m.m108593f(r9, r0)
                    com.tencent.mm.plugin.address.model.RcptItem r9 = (com.tencent.p014mm.plugin.address.model.RcptItem) r9
                    r10.f339091d = r9
                    ch0.j r0 = r8.f339098a
                    java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r0 = r0.f339079D
                    r0.add(r9)
                    java.util.HashMap<java.lang.Integer, android.view.View> r9 = r8.f339100c
                    ch0.j r0 = r8.f339098a
                    java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r0 = r0.f339079D
                    int r0 = r0.size()
                    int r0 = r0 - r11
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r9.remove(r0)
                L_0x0075:
                    com.tencent.mm.plugin.address.model.RcptItem r9 = r10.f339091d
                    int r0 = r9.f196789g
                    r2 = 3
                    if (r0 != r2) goto L_0x007e
                    r0 = 1
                    goto L_0x007f
                L_0x007e:
                    r0 = 0
                L_0x007f:
                    if (r0 != 0) goto L_0x00b9
                    com.tencent.mm.plugin.address.model.RcptItem r0 = ch0.C113320j.f339075G
                    boolean r9 = gy3.C87412m.m108589b(r9, r0)
                    if (r9 != 0) goto L_0x00b9
                    ch0.j r9 = r8.f339098a
                    zg0.p r9 = r9.f339084u
                    com.tencent.mm.plugin.address.model.RcptItem r0 = r10.f339091d
                    java.lang.String r0 = r0.f196787e
                    java.util.List r9 = r9.mo183781f(r0)
                    java.util.ArrayList r9 = (java.util.ArrayList) r9
                    int r9 = r9.size()
                    if (r9 != 0) goto L_0x009e
                    goto L_0x00b9
                L_0x009e:
                    ch0.j r9 = r8.f339098a
                    java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r0 = r9.f339079D
                    int r0 = r0.size()
                    int r0 = r0 + r11
                    int r2 = r9.f339083t
                    int r0 = java.lang.Math.min(r0, r2)
                    r9.f339078C = r0
                    int r9 = r8.f339099b
                    ch0.j r0 = r8.f339098a
                    int r0 = r0.f339078C
                    int r0 = r0 - r11
                    if (r9 != r0) goto L_0x00eb
                    goto L_0x00ea
                L_0x00b9:
                    com.tencent.mm.plugin.address.model.RcptItem r9 = r10.f339091d
                    com.tencent.mm.plugin.address.model.RcptItem r0 = ch0.C113320j.f339075G
                    boolean r9 = gy3.C87412m.m108589b(r9, r0)
                    if (r9 == 0) goto L_0x00ea
                    ch0.j r9 = r8.f339098a
                    java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r9 = r9.f339079D
                    int r0 = r9.size()
                    int r0 = r0 - r11
                    java.lang.Object r9 = r9.get(r0)
                    com.tencent.mm.plugin.address.model.RcptItem r0 = ch0.C113320j.f339075G
                    boolean r9 = gy3.C87412m.m108589b(r9, r0)
                    if (r9 == 0) goto L_0x00ea
                    ch0.j r9 = r8.f339098a
                    java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r0 = r9.f339079D
                    int r1 = r0.size()
                    int r1 = r1 + -2
                    java.lang.Object r0 = r0.get(r1)
                    com.tencent.mm.plugin.address.model.RcptItem r0 = (com.tencent.p014mm.plugin.address.model.RcptItem) r0
                    r9.f339077B = r0
                L_0x00ea:
                    r1 = 1
                L_0x00eb:
                    com.tencent.mm.plugin.address.model.RcptItem r9 = r10.f339091d
                    com.tencent.mm.plugin.address.model.RcptItem r0 = ch0.C113320j.f339075G
                    boolean r9 = gy3.C87412m.m108589b(r9, r0)
                    if (r9 != 0) goto L_0x00fb
                    ch0.j r9 = r8.f339098a
                    com.tencent.mm.plugin.address.model.RcptItem r10 = r10.f339091d
                    r9.f339077B = r10
                L_0x00fb:
                    if (r1 != 0) goto L_0x011e
                    com.tencent.mm.view.recyclerview.WxRecyclerView r9 = r8.f339101d
                    androidx.recyclerview.widget.RecyclerView$e r9 = r9.getAdapter()
                    if (r9 == 0) goto L_0x0108
                    r9.notifyDataSetChanged()
                L_0x0108:
                    ch0.j$f r9 = r8.f339102e
                    r9.notifyDataSetChanged()
                    ch0.j r9 = r8.f339098a
                    com.tencent.mm.ui.base.CustomViewPager r9 = r9.mo165885L()
                    if (r9 == 0) goto L_0x012a
                    ch0.j r10 = r8.f339098a
                    int r10 = r10.f339078C
                    int r10 = r10 - r11
                    r9.setCurrentItem(r10, r11)
                    goto L_0x012a
                L_0x011e:
                    ch0.j r9 = r8.f339098a
                    fy3.l<com.tencent.mm.plugin.address.model.RcptItem, rx3.b0> r10 = r9.f339082s
                    com.tencent.mm.plugin.address.model.RcptItem r9 = r9.f339077B
                    gy3.C87412m.m108591d(r9)
                    r10.invoke(r9)
                L_0x012a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ch0.C113320j.C113326f.C113328b.mo2041c(android.view.View, jq3.c, int):void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113326f(C113320j jVar, HashMap<Integer, View> hashMap, Context context) {
            super(context);
            this.f339096g = jVar;
            this.f339097h = hashMap;
        }

        /* renamed from: a */
        public int mo72290a() {
            return this.f339096g.f339078C;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x009e A[LOOP:0: B:18:0x0098->B:20:0x009e, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x010a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View mo72291b(android.view.View r17, android.view.ViewGroup r18, int r19) {
            /*
                r16 = this;
                r6 = r16
                java.util.HashMap<java.lang.Integer, android.view.View> r0 = r6.f339097h
                java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                r1 = 0
                if (r0 != 0) goto L_0x0025
                android.content.Context r0 = r6.f126887d
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r2 = 2131497357(0x7f0c118d, float:1.8618305E38)
                r3 = r18
                android.view.View r0 = r0.inflate(r2, r3, r1)
                java.lang.String r2 = "from(context).inflate(R.…s_view, container, false)"
                gy3.C87412m.m108593f(r0, r2)
            L_0x0025:
                r7 = r0
                java.util.HashMap<java.lang.Integer, android.view.View> r0 = r6.f339097h
                java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
                r0.put(r2, r7)
                java.lang.Object r0 = r7.getTag()
                if (r0 == 0) goto L_0x004a
                java.lang.Integer r0 = (java.lang.Integer) r0
                ch0.j r2 = r6.f339096g
                java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r2 = r2.f339079D
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r0 = r0.compareTo(r2)
                if (r0 >= 0) goto L_0x004a
                return r7
            L_0x004a:
                r0 = r7
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r2 = 2131312021(0x7f093d95, float:1.8242399E38)
                android.view.View r0 = r0.findViewById(r2)
                java.lang.String r2 = "_convertView as ViewGrou…View>(R.id.recycler_view)"
                gy3.C87412m.m108593f(r0, r2)
                r4 = r0
                com.tencent.mm.view.recyclerview.WxRecyclerView r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r4
                androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
                android.content.Context r2 = r6.f126887d
                r3 = 1
                r0.<init>(r2, r3, r1)
                r4.setLayoutManager(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2 = 0
                if (r19 != 0) goto L_0x0070
                goto L_0x0089
            L_0x0070:
                ch0.j r5 = r6.f339096g
                java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r5 = r5.f339079D
                int r8 = r19 + -1
                java.lang.Object r5 = r5.get(r8)
                com.tencent.mm.plugin.address.model.RcptItem r5 = (com.tencent.p014mm.plugin.address.model.RcptItem) r5
                if (r5 == 0) goto L_0x0081
                java.lang.String r5 = r5.f196787e
                goto L_0x0082
            L_0x0081:
                r5 = r2
            L_0x0082:
                if (r5 == 0) goto L_0x0089
                int r5 = r5.hashCode()
                goto L_0x008a
            L_0x0089:
                r5 = 0
            L_0x008a:
                ch0.j r8 = r6.f339096g
                zg0.p r8 = r8.f339084u
                java.util.List r5 = r8.mo183780e(r5)
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x0098:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x00b2
                java.lang.Object r8 = r5.next()
                com.tencent.mm.plugin.address.model.RcptItem r8 = (com.tencent.p014mm.plugin.address.model.RcptItem) r8
                ch0.j$b r9 = new ch0.j$b
                java.lang.String r10 = "it"
                gy3.C87412m.m108593f(r8, r10)
                r9.<init>(r8)
                r0.add(r9)
                goto L_0x0098
            L_0x00b2:
                java.lang.Object r5 = r0.get(r1)
                ch0.j$b r5 = (ch0.C113320j.C113322b) r5
                com.tencent.mm.plugin.address.model.RcptItem r5 = r5.f339091d
                int r5 = r5.f196789g
                r8 = 3
                if (r5 != r8) goto L_0x00c0
                goto L_0x00c1
            L_0x00c0:
                r3 = 0
            L_0x00c1:
                if (r3 == 0) goto L_0x00cd
                ch0.j$b r3 = new ch0.j$b
                com.tencent.mm.plugin.address.model.RcptItem r5 = ch0.C113320j.f339075G
                r3.<init>(r5)
                r0.add(r3)
            L_0x00cd:
                ch0.j r3 = r6.f339096g
                r3.getClass()
                com.tencent.mm.plugin.address.ui.SelectAddressDialog$buildItemConverts$1 r5 = new com.tencent.mm.plugin.address.ui.SelectAddressDialog$buildItemConverts$1
                r5.<init>(r3)
                ch0.j$f$a r3 = new ch0.j$f$a
                r3.<init>(r0, r5)
                r4.setAdapter(r3)
                ch0.j r3 = r6.f339096g
                java.util.Iterator r0 = r0.iterator()
                r5 = -1
                r8 = 0
            L_0x00e7:
                boolean r9 = r0.hasNext()
                if (r9 == 0) goto L_0x0108
                java.lang.Object r9 = r0.next()
                int r10 = r8 + 1
                if (r8 < 0) goto L_0x0104
                ch0.j$b r9 = (ch0.C113320j.C113322b) r9
                java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r11 = r3.f339079D
                com.tencent.mm.plugin.address.model.RcptItem r9 = r9.f339091d
                boolean r9 = r11.contains(r9)
                if (r9 == 0) goto L_0x0102
                r5 = r8
            L_0x0102:
                r8 = r10
                goto L_0x00e7
            L_0x0104:
                sx3.C64197v.m75542k()
                throw r2
            L_0x0108:
                if (r5 < 0) goto L_0x0153
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.getLayoutManager()
                java.lang.String r2 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                gy3.C87412m.m108592e(r0, r2)
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2.mo10233c(r3)
                java.lang.Object[] r9 = r2.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$4"
                java.lang.String r11 = "getView"
                java.lang.String r12 = "(Landroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;"
                java.lang.String r13 = "Undefined"
                java.lang.String r14 = "scrollToPosition"
                java.lang.String r15 = "(I)V"
                r8 = r0
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r1 = r2.mo10231a(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r0.scrollToPosition(r1)
                java.lang.String r9 = "com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$4"
                java.lang.String r10 = "getView"
                java.lang.String r11 = "(Landroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;"
                java.lang.String r12 = "Undefined"
                java.lang.String r13 = "scrollToPosition"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            L_0x0153:
                androidx.recyclerview.widget.RecyclerView$e r0 = r4.getAdapter()
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.address.ui.SelectAddressDialog.AddressItem>"
                gy3.C87412m.m108592e(r0, r1)
                r8 = r0
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r8 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r8
                ch0.j$f$b r9 = new ch0.j$f$b
                ch0.j r1 = r6.f339096g
                java.util.HashMap<java.lang.Integer, android.view.View> r3 = r6.f339097h
                r0 = r9
                r2 = r19
                r5 = r16
                r0.<init>(r1, r2, r3, r4, r5)
                r8.f165746y = r9
                java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
                r7.setTag(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ch0.C113320j.C113326f.mo72291b(android.view.View, android.view.ViewGroup, int):android.view.View");
        }

        /* renamed from: c */
        public void mo72292c(View view, int i) {
        }

        public int getCount() {
            return this.f339096g.f339078C;
        }
    }

    /* renamed from: ch0.j$g */
    public static final class C113329g implements C78083b.C78084a {

        /* renamed from: a */
        public final /* synthetic */ C113320j f339103a;

        /* renamed from: b */
        public final /* synthetic */ TextView f339104b;

        /* renamed from: ch0.j$g$a */
        public static final class C113330a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C113320j f339105d;

            /* renamed from: e */
            public final /* synthetic */ RcptItem f339106e;

            public C113330a(C113320j jVar, RcptItem rcptItem) {
                this.f339105d = jVar;
                this.f339106e = rcptItem;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$5$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C32226l<RcptItem, C13598b0> lVar = this.f339105d.f339082s;
                RcptItem rcptItem = this.f339106e;
                C87412m.m108593f(rcptItem, "item");
                lVar.invoke(rcptItem);
                C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$5$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C113329g(C113320j jVar, TextView textView) {
            this.f339103a = jVar;
            this.f339104b = textView;
        }

        public final void onLocationAddr(Addr addr) {
            Log.m105918d("MicroMsg.SelectAddressDialog", "getPoi: " + addr);
            String str = addr.f343960h;
            if (Util.isNullOrNil(str)) {
                str = addr.f343959g;
            }
            RcptItem h = this.f339103a.f339084u.mo183783h(addr.f343958f, str, addr.f343961i, addr.f343965p);
            if (h != null) {
                String str2 = h.f196786d;
                RcptItem rcptItem = h;
                while (true) {
                    rcptItem = this.f339103a.f339084u.mo183779d(rcptItem.f196790h);
                    if (rcptItem == null) {
                        break;
                    }
                    str2 = rcptItem.f196786d + ' ' + str2;
                }
                this.f339104b.setText(str2);
                TextView textView = (TextView) this.f339103a.findViewById(C0966R.C0970id.nc_);
                if (textView != null) {
                    C113320j jVar = this.f339103a;
                    textView.setVisibility(0);
                    textView.setOnClickListener(new C113330a(jVar, h));
                }
            }
        }
    }

    /* renamed from: ch0.j$h */
    public static final class C113331h implements C92411b.C92412a {

        /* renamed from: d */
        public final /* synthetic */ C78085c f339107d;

        /* renamed from: e */
        public final /* synthetic */ C113320j f339108e;

        /* renamed from: f */
        public final /* synthetic */ TextView f339109f;

        public C113331h(C78085c cVar, C113320j jVar, TextView textView) {
            this.f339107d = cVar;
            this.f339108e = jVar;
            this.f339109f = textView;
        }

        public final boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            boolean z2 = z;
            float f3 = f;
            float f4 = f2;
            Log.m105924i("MicroMsg.SelectAddressDialog", "loc result: " + z + ", lng:" + f + ", lat:" + f2);
            if (z2) {
                this.f339107d.oe0().mo108054a(new C118505d((double) f4, (double) f3, true), this.f339108e.f339081F);
            } else {
                this.f339109f.setText(C0966R.string.mpj);
            }
            this.f339107d.mo108056ms().mo126408b(this.f339108e.f339080E);
            return false;
        }
    }

    /* renamed from: ch0.j$i */
    public static final class C113332i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C113320j f339110d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113332i(C113320j jVar) {
            super(0);
            this.f339110d = jVar;
        }

        public Object invoke() {
            return (TextView) this.f339110d.findViewById(C0966R.C0970id.f5602jj);
        }
    }

    /* renamed from: ch0.j$j */
    public static final class C113333j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C113320j f339111d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113333j(C113320j jVar) {
            super(0);
            this.f339111d = jVar;
        }

        public Object invoke() {
            return (TextView) this.f339111d.findViewById(C0966R.C0970id.f5604jl);
        }
    }

    /* renamed from: ch0.j$k */
    public static final class C113334k extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C113320j f339112d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113334k(C113320j jVar) {
            super(0);
            this.f339112d = jVar;
        }

        public Object invoke() {
            return (TextView) this.f339112d.findViewById(C0966R.C0970id.f5605jm);
        }
    }

    /* renamed from: ch0.j$l */
    public static final class C113335l extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C113320j f339113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113335l(C113320j jVar) {
            super(0);
            this.f339113d = jVar;
        }

        public Object invoke() {
            return (TextView) this.f339113d.findViewById(C0966R.C0970id.f5606jn);
        }
    }

    /* renamed from: ch0.j$m */
    public static final class C113336m extends C87413o implements C32224a<CustomViewPager> {

        /* renamed from: d */
        public final /* synthetic */ C113320j f339114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113336m(C113320j jVar) {
            super(0);
            this.f339114d = jVar;
        }

        public Object invoke() {
            return (CustomViewPager) this.f339114d.findViewById(C0966R.C0970id.f5636kg);
        }
    }

    /* renamed from: ch0.j$n */
    public static final class C113337n implements View.OnApplyWindowInsetsListener {

        /* renamed from: d */
        public final /* synthetic */ C113320j f339115d;

        public C113337n(C113320j jVar) {
            this.f339115d = jVar;
        }

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            View view2 = this.f339115d.f126903g;
            if (view2 != null) {
                view2.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
            }
            return windowInsets;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113320j(Context context, String str, C32226l<? super RcptItem, C13598b0> lVar, int i, C119113p pVar, boolean z) {
        super(context);
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "initAddress");
        C87412m.m108594g(lVar, "callback");
        C87412m.m108594g(pVar, "addrMgr");
        this.f339082s = lVar;
        this.f339083t = i;
        this.f339084u = pVar;
        this.f339085v = z;
        this.f339078C = Math.min(1, i);
        this.f339079D = new ArrayList();
        List<String> e = new C66723k("\\s+").mo90760e(str, 0);
        if (e.size() >= 3) {
            String str2 = null;
            RcptItem h = pVar.mo183783h(e.get(0), e.get(1), e.get(2), e.size() == 3 ? null : e.get(3));
            this.f339077B = h;
            if (h != null) {
                this.f339079D.add(h);
                RcptItem rcptItem = this.f339077B;
                Integer valueOf = rcptItem != null ? Integer.valueOf(rcptItem.f196790h) : null;
                C87412m.m108591d(valueOf);
                RcptItem d = pVar.mo183779d(valueOf.intValue());
                while (d != null) {
                    this.f339079D.add(0, d);
                    d = this.f339084u.mo183779d(d.f196790h);
                }
                C119113p pVar2 = this.f339084u;
                RcptItem rcptItem2 = this.f339077B;
                if (((ArrayList) pVar2.mo183781f(rcptItem2 != null ? rcptItem2.f196787e : str2)).size() == 0) {
                    this.f339078C = Math.min(this.f339079D.size(), this.f339083t);
                } else {
                    this.f339078C = Math.min(this.f339079D.size() + 1, this.f339083t);
                }
            }
        }
    }

    /* renamed from: G */
    public View mo6265G() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bvt, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ect_address_dialog, null)");
        return inflate;
    }

    /* renamed from: H */
    public void mo6266H() {
        View findViewById;
        super.mo6266H();
        View view = this.f126905i;
        if (!(view == null || (findViewById = view.findViewById(C0966R.C0970id.bec)) == null)) {
            findViewById.setOnClickListener(new C113323c(this));
        }
        CustomViewPager L = mo165885L();
        if (L != null) {
            L.setOnPageChangeListener(new C113324d(this));
        }
        TextView[] textViewArr = {(TextView) ((C36570n) this.f339087x).getValue(), (TextView) ((C36570n) this.f339088y).getValue(), (TextView) ((C36570n) this.f339089z).getValue(), (TextView) ((C36570n) this.f339076A).getValue()};
        int i = 0;
        int i2 = 0;
        while (i < 4) {
            TextView textView = textViewArr[i];
            int i3 = i2 + 1;
            if (textView != null) {
                textView.setOnClickListener(new C113325e(this, i2));
            }
            i++;
            i2 = i3;
        }
        HashMap hashMap = new HashMap();
        CustomViewPager L2 = mo165885L();
        if (L2 != null) {
            L2.setAdapter(new C113326f(this, hashMap, getContext()));
        }
        CustomViewPager L3 = mo165885L();
        if (L3 != null) {
            L3.setCurrentItem(this.f339078C - 1, false);
        }
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.n_7);
        if (textView2 == null) {
            return;
        }
        if (!this.f339085v) {
            ViewParent parent = textView2.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (!MMApplicationContext.isMainProcess() || !((C103918d) C86312j.m106911c(C103918d.class)).Lb0(getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            ViewParent parent2 = textView2.getParent();
            C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.View");
            View view4 = (View) parent2;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/address/ui/SelectAddressDialog", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C78085c cVar = (C78085c) C86312j.m106911c(C78085c.class);
            this.f339081F = new C113329g(this, textView2);
            this.f339080E = new C113331h(cVar, this, textView2);
            cVar.mo108056ms().mo126412f(this.f339080E, false);
        }
    }

    /* renamed from: J */
    public void mo68876J() {
        C78085c cVar = (C78085c) C86312j.m106911c(C78085c.class);
        cVar.mo108056ms().mo126408b(this.f339080E);
        cVar.oe0().mo108055b(this.f339081F);
        super.mo68876J();
    }

    /* renamed from: L */
    public final CustomViewPager mo165885L() {
        return (CustomViewPager) ((C36570n) this.f339086w).getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void show() {
        /*
            r7 = this;
            super.show()
            android.view.Window r0 = r7.getWindow()
            com.tencent.p014mm.p136ui.C85875k4.m106177d0(r0)
            android.view.Window r0 = r7.getWindow()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            android.view.View r0 = r0.getDecorView()
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x001e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0056
            r2 = 0
            int r3 = r0.getChildCount()
        L_0x0026:
            if (r2 >= r3) goto L_0x004a
            android.view.View r4 = r0.getChildAt(r2)
            java.lang.String r5 = r4.getTransitionName()
            java.lang.String r6 = "android:status:background"
            boolean r5 = gy3.C87412m.m108589b(r6, r5)
            if (r5 != 0) goto L_0x0047
            java.lang.String r5 = r4.getTransitionName()
            java.lang.String r6 = "android:navigation:background"
            boolean r5 = gy3.C87412m.m108589b(r6, r5)
            if (r5 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r1 = r4
            goto L_0x004a
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0026
        L_0x004a:
            if (r1 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            ch0.j$n r1 = new ch0.j$n
            r1.<init>(r7)
            r0.setOnApplyWindowInsetsListener(r1)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch0.C113320j.show():void");
    }
}
