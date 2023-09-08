package com.tencent.p014mm.plugin.finder.nearby.person;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bh3.C113177k;
import bl3.C39818r;
import cc0.C92411b;
import cc2.C67350b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.plugin.finder.nearby.NearbyHomeUIC;
import com.tencent.p014mm.plugin.finder.nearby.video.NearbyVideoPresenter;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72957c4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f12.C7970a;
import f40.C86709a0;
import f62.C75700k0;
import fe1.C8014g;
import fm1.C8139f;
import fy3.C32224a;
import gc0.C20828a;
import gn1.C75991a;
import gn1.C75994b;
import gn1.C75995e;
import gn1.C75996f;
import gn1.C75997g;
import gn1.C76002o;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hc0.C20937c;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import lj3.C46863b;
import ln1.C21448d;
import nc0.C76850a;
import nj3.C76879j;
import ob0.C117747y;
import ob0.C89137b0;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76708i;
import p286zl.C16292g;
import p447aw.C103918d;
import p601lv.C76726b;
import p702ts.C78085c;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C78019ym2;
import te3.a94;
import vc1.C37715b;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC */
public final class NearbyPersonV1UIC extends C75991a {

    /* renamed from: A */
    public boolean f198088A;

    /* renamed from: B */
    public boolean f198089B;

    /* renamed from: C */
    public boolean f198090C;

    /* renamed from: D */
    public boolean f198091D = true;

    /* renamed from: E */
    public boolean f198092E = true;

    /* renamed from: F */
    public boolean f198093F;

    /* renamed from: G */
    public boolean f198094G = true;

    /* renamed from: H */
    public final IListener<?> f198095H = new NearbyPersonV1UIC$sayHiListener$1(this, C40008f.f107254d);

    /* renamed from: I */
    public boolean f198096I;

    /* renamed from: g */
    public ViewGroup f198097g;

    /* renamed from: h */
    public ListView f198098h;

    /* renamed from: i */
    public View f198099i;

    /* renamed from: j */
    public C89779i0 f198100j;

    /* renamed from: n */
    public C68941a f198101n;

    /* renamed from: o */
    public boolean f198102o;

    /* renamed from: p */
    public List<C78019ym2> f198103p = new LinkedList();

    /* renamed from: q */
    public boolean f198104q;

    /* renamed from: r */
    public int f198105r = 1;

    /* renamed from: s */
    public boolean f198106s;

    /* renamed from: t */
    public C92411b f198107t;

    /* renamed from: u */
    public boolean f198108u;

    /* renamed from: v */
    public C75991a.C75993b f198109v;

    /* renamed from: w */
    public boolean f198110w;

    /* renamed from: x */
    public boolean f198111x;

    /* renamed from: y */
    public final C92411b.C92412a f198112y = new C68947c(this);

    /* renamed from: z */
    public long f198113z;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$d */
    public static final class C3328d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyPersonV1UIC f15757d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3328d(NearbyPersonV1UIC nearbyPersonV1UIC) {
            super(0);
            this.f15757d = nearbyPersonV1UIC;
        }

        public Object invoke() {
            ((C8139f) C39818r.f106831a.mo62444c(this.f15757d.getActivity()).mo75002a(C8139f.class)).mo9205e3();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$f */
    public static final class C3329f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyPersonV1UIC f15758d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3329f(NearbyPersonV1UIC nearbyPersonV1UIC) {
            super(0);
            this.f15758d = nearbyPersonV1UIC;
        }

        public Object invoke() {
            NearbyHomeUIC nearbyHomeUIC = (NearbyHomeUIC) C39818r.f106831a.mo62444c(this.f15758d.getActivity()).mo75002a(NearbyHomeUIC.class);
            nearbyHomeUIC.getClass();
            if (C37715b.f99914a.mo61298a()) {
                nearbyHomeUIC.mo3545f3(1006);
            } else {
                nearbyHomeUIC.mo3545f3(1001);
            }
            this.f15758d.f198089B = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a */
    public final class C68941a extends BaseAdapter {

        /* renamed from: d */
        public final Context f198114d;

        /* renamed from: e */
        public C46863b f198115e = new C46863b(15, C68942a.f198118a);

        /* renamed from: f */
        public C46863b.C46867d f198116f;

        /* renamed from: g */
        public final /* synthetic */ NearbyPersonV1UIC f198117g;

        /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$a */
        public static final class C68942a implements C46863b.C46866c {

            /* renamed from: a */
            public static final C68942a f198118a = new C68942a();

            /* renamed from: a */
            public final Bitmap mo63515a(String str) {
                return ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$b */
        public static final class C68943b implements C46863b.C46867d {

            /* renamed from: a */
            public final /* synthetic */ C68941a f198119a;

            public C68943b(C68941a aVar) {
                this.f198119a = aVar;
            }

            /* renamed from: a */
            public int mo63517a() {
                return this.f198119a.getCount();
            }

            /* renamed from: b */
            public String mo63518b(int i) {
                if (i >= 0 && i < this.f198119a.getCount()) {
                    return this.f198119a.f198117g.f198103p.get(i).f228622d;
                }
                Log.m105920e("NearbyPersonUIC", "pos is invalid");
                return null;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$c */
        public static final class C68944c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ NearbyPersonV1UIC f198120d;

            /* renamed from: e */
            public final /* synthetic */ C78019ym2 f198121e;

            /* renamed from: f */
            public final /* synthetic */ C68941a f198122f;

            public C68944c(NearbyPersonV1UIC nearbyPersonV1UIC, C78019ym2 ym22, C68941a aVar) {
                this.f198120d = nearbyPersonV1UIC;
                this.f198121e = ym22;
                this.f198122f = aVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C75991a.C75992a aVar = (C75991a.C75992a) ((HashMap) this.f198120d.f222832f).get(this.f198121e.f228622d);
                if (aVar != null) {
                    aVar.f222842j++;
                    aVar.f222845m = true;
                    aVar.f222844l |= 2;
                }
                this.f198120d.mo94860i3();
                this.f198122f.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$d */
        public static final class C68945d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C78019ym2 f198123d;

            /* renamed from: e */
            public final /* synthetic */ NearbyPersonV1UIC f198124e;

            /* renamed from: f */
            public final /* synthetic */ int f198125f;

            public C68945d(C78019ym2 ym22, NearbyPersonV1UIC nearbyPersonV1UIC, int i) {
                this.f198123d = ym22;
                this.f198124e = nearbyPersonV1UIC;
                this.f198125f = i;
            }

            /* JADX WARNING: Removed duplicated region for block: B:35:0x005d  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x0060  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x006d  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0070  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x0082  */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r34 = this;
                    r0 = r34
                    ln1.d r1 = ln1.C21448d.f60723a
                    te3.ym2 r2 = r0.f198123d
                    com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC r3 = r0.f198124e
                    boolean r3 = r3.mo94859g3(r2)
                    com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC r4 = r0.f198124e
                    int r4 = r4.f198105r
                    te3.ym2 r5 = r0.f198123d
                    int r5 = r5.f228621E
                    r6 = 1
                    r5 = r5 & r6
                    if (r5 <= 0) goto L_0x001a
                    r5 = 1
                    goto L_0x001b
                L_0x001a:
                    r5 = 0
                L_0x001b:
                    int r7 = r0.f198125f
                    java.lang.String r8 = r2.f228622d
                    java.lang.String r9 = ""
                    if (r8 != 0) goto L_0x0025
                    r10 = r9
                    goto L_0x0026
                L_0x0025:
                    r10 = r8
                L_0x0026:
                    java.lang.String r8 = r2.f228627i
                    if (r8 != 0) goto L_0x002c
                    r11 = r9
                    goto L_0x002d
                L_0x002c:
                    r11 = r8
                L_0x002d:
                    java.lang.String r8 = r2.f228639x
                    if (r8 != 0) goto L_0x0033
                    r12 = r9
                    goto L_0x0034
                L_0x0033:
                    r12 = r8
                L_0x0034:
                    java.lang.String r8 = r2.f228625g
                    if (r8 != 0) goto L_0x003a
                    r13 = r9
                    goto L_0x003b
                L_0x003a:
                    r13 = r8
                L_0x003b:
                    r8 = 1
                    r14 = 0
                    if (r3 == 0) goto L_0x0044
                    r16 = r8
                    goto L_0x0046
                L_0x0044:
                    r16 = r14
                L_0x0046:
                    if (r4 == r6) goto L_0x0057
                    r3 = 3
                    if (r4 == r3) goto L_0x0054
                    r3 = 4
                    if (r4 == r3) goto L_0x0051
                    r26 = r14
                    goto L_0x005b
                L_0x0051:
                    r26 = r8
                    goto L_0x005b
                L_0x0054:
                    r3 = 2
                    goto L_0x0059
                L_0x0057:
                    r3 = 3
                L_0x0059:
                    r26 = r3
                L_0x005b:
                    if (r5 == 0) goto L_0x0060
                    r28 = r8
                    goto L_0x0062
                L_0x0060:
                    r28 = r14
                L_0x0062:
                    java.lang.String r3 = r2.f228626h
                    if (r3 == 0) goto L_0x0070
                    boolean r3 = z04.C112551y.m153811k(r3)
                    r3 = r3 ^ r6
                    if (r3 == 0) goto L_0x0070
                    r30 = r8
                    goto L_0x0072
                L_0x0070:
                    r30 = r14
                L_0x0072:
                    java.lang.Class<z51.f> r3 = z51.C79305f.class
                    di3.d r3 = di3.C86312j.m106911c(r3)
                    z51.f r3 = (z51.C79305f) r3
                    java.lang.String r4 = r2.f228623e
                    boolean r3 = r3.mo109309L3(r4)
                    if (r3 == 0) goto L_0x0085
                    r32 = r8
                    goto L_0x0087
                L_0x0085:
                    r32 = r14
                L_0x0087:
                    long r3 = (long) r7
                    long r18 = r3 + r8
                    int r2 = r2.f228628j
                    long r2 = (long) r2
                    r20 = r2
                    r8 = 1
                    r22 = 0
                    r24 = 4096(0x1000, float:5.74E-42)
                    r25 = 0
                    r2 = r10
                    r3 = r12
                    r4 = r13
                    r5 = r11
                    r6 = r16
                    r10 = r26
                    r12 = r28
                    r14 = r30
                    r16 = r32
                    ln1.C21448d.m24264c(r1, r2, r3, r4, r5, r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r25)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC.C68941a.C68945d.run():void");
            }
        }

        public C68941a(NearbyPersonV1UIC nearbyPersonV1UIC, Context context) {
            C87412m.m108594g(context, "context");
            this.f198117g = nearbyPersonV1UIC;
            this.f198114d = context;
        }

        /* renamed from: a */
        public final void mo94865a(ImageView imageView, String str) {
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("NearbyPersonUIC", "setImgBmp url is empty");
                return;
            }
            if (imageView != null) {
                imageView.setImageBitmap((Bitmap) null);
            }
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C7970a.m8127a();
            bVar.f59346b = true;
            bVar.f59363s = true;
            C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
        }

        public int getCount() {
            return this.f198117g.f198103p.size();
        }

        public Object getItem(int i) {
            return this.f198117g.f198103p.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:147:0x035e  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0367  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0379  */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x037b  */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x037e  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x03c5  */
        /* JADX WARNING: Removed duplicated region for block: B:166:0x0411  */
        /* JADX WARNING: Removed duplicated region for block: B:167:0x0413  */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x0416  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x0464  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                java.lang.Class<f62.k0> r2 = f62.C75700k0.class
                java.lang.Class<ny.h> r3 = p629ny.C76979h.class
                lj3.b$d r4 = r0.f198116f
                if (r4 != 0) goto L_0x0013
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$b r4 = new com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$b
                r4.<init>(r0)
                r0.f198116f = r4
            L_0x0013:
                lj3.b r4 = r0.f198115e
                if (r4 == 0) goto L_0x001c
                lj3.b$d r5 = r0.f198116f
                r4.mo72072b(r1, r5)
            L_0x001c:
                r4 = 0
                if (r30 != 0) goto L_0x0117
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$b r5 = new com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$b
                r5.<init>()
                android.content.Context r6 = r0.f198114d
                r7 = 2131496865(0x7f0c0fa1, float:1.8617307E38)
                android.view.View r6 = android.view.View.inflate(r6, r7, r4)
                r7 = 2131310040(0x7f0935d8, float:1.823838E38)
                android.view.View r7 = r6.findViewById(r7)
                java.lang.String r8 = "null cannot be cast to non-null type android.widget.TextView"
                gy3.C87412m.m108592e(r7, r8)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r5.f198126a = r7
                r7 = 2131310043(0x7f0935db, float:1.8238387E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r8)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r5.f198128c = r7
                r7 = 2131310035(0x7f0935d3, float:1.823837E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r8)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r5.f198127b = r7
                r7 = 2131310034(0x7f0935d2, float:1.8238369E38)
                android.view.View r7 = r6.findViewById(r7)
                java.lang.String r9 = "null cannot be cast to non-null type android.widget.ImageView"
                gy3.C87412m.m108592e(r7, r9)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f198129d = r7
                r7 = 2131310037(0x7f0935d5, float:1.8238375E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r8)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r5.f198130e = r7
                r7 = 2131310045(0x7f0935dd, float:1.823839E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r9)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f198131f = r7
                r7 = 2131310044(0x7f0935dc, float:1.8238389E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r9)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f198132g = r7
                r7 = 2131302938(0x7f091a1a, float:1.8223976E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r9)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f198133h = r7
                r7 = 2131310031(0x7f0935cf, float:1.8238363E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r9)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f198135j = r7
                r7 = 2131310032(0x7f0935d0, float:1.8238365E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r9)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f198136k = r7
                r7 = 2131310033(0x7f0935d1, float:1.8238367E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r9)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f198137l = r7
                r7 = 2131299709(0x7f090d7d, float:1.8217427E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r9)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f198138m = r7
                android.widget.ImageView r7 = r5.f198132g
                gy3.C87412m.m108591d(r7)
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                android.content.Context r8 = r0.f198114d
                r10 = 2131165324(0x7f07008c, float:1.7944862E38)
                int r8 = kg3.C76577a.m92157h(r8, r10)
                r7.height = r8
                android.content.Context r8 = r0.f198114d
                int r8 = kg3.C76577a.m92157h(r8, r10)
                r7.width = r8
                android.widget.ImageView r8 = r5.f198132g
                gy3.C87412m.m108591d(r8)
                r8.setLayoutParams(r7)
                android.view.View r8 = r5.f198133h
                gy3.C87412m.m108591d(r8)
                r8.setLayoutParams(r7)
                r7 = 2131310042(0x7f0935da, float:1.8238385E38)
                android.view.View r7 = r6.findViewById(r7)
                gy3.C87412m.m108592e(r7, r9)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r5.f198134i = r7
                r6.setTag(r5)
                goto L_0x0124
            L_0x0117:
                java.lang.Object r5 = r30.getTag()
                java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC.ViewHolder"
                gy3.C87412m.m108592e(r5, r6)
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$b r5 = (com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC.C68946b) r5
                r6 = r30
            L_0x0124:
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC r7 = r0.f198117g
                java.util.List<te3.ym2> r7 = r7.f198103p
                java.lang.Object r7 = r7.get(r1)
                te3.ym2 r7 = (te3.C78019ym2) r7
                android.widget.TextView r8 = r5.f198126a
                if (r8 != 0) goto L_0x0133
                goto L_0x014d
            L_0x0133:
                di3.d r9 = di3.C86312j.m106911c(r3)
                ny.h r9 = (p629ny.C76979h) r9
                android.content.Context r10 = r0.f198114d
                java.lang.String r11 = r7.f228623e
                android.widget.TextView r12 = r5.f198126a
                gy3.C87412m.m108591d(r12)
                float r12 = r12.getTextSize()
                android.text.SpannableString r9 = r9.yp0(r10, r11, r12)
                r8.setText(r9)
            L_0x014d:
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC r8 = r0.f198117g
                int r8 = r8.f198105r
                r9 = 2
                r10 = 8
                r11 = 1
                r12 = 0
                if (r8 != r11) goto L_0x01ba
                int r8 = r7.f228628j
                if (r8 == 0) goto L_0x01b1
                if (r8 == r11) goto L_0x018d
                if (r8 == r9) goto L_0x0169
                android.widget.ImageView r8 = r5.f198134i
                if (r8 != 0) goto L_0x0165
                goto L_0x01c2
            L_0x0165:
                r8.setVisibility(r10)
                goto L_0x01c2
            L_0x0169:
                android.widget.ImageView r8 = r5.f198134i
                if (r8 != 0) goto L_0x016e
                goto L_0x0171
            L_0x016e:
                r8.setVisibility(r12)
            L_0x0171:
                android.widget.ImageView r8 = r5.f198134i
                if (r8 == 0) goto L_0x017b
                r13 = 2131755868(0x7f10035c, float:1.9142627E38)
                r8.setImageResource(r13)
            L_0x017b:
                android.widget.ImageView r8 = r5.f198134i
                if (r8 != 0) goto L_0x0180
                goto L_0x01c2
            L_0x0180:
                android.content.Context r13 = r0.f198114d
                r14 = 2131825835(0x7f1114ab, float:1.9284537E38)
                java.lang.String r13 = r13.getString(r14)
                r8.setContentDescription(r13)
                goto L_0x01c2
            L_0x018d:
                android.widget.ImageView r8 = r5.f198134i
                if (r8 != 0) goto L_0x0192
                goto L_0x0195
            L_0x0192:
                r8.setVisibility(r12)
            L_0x0195:
                android.widget.ImageView r8 = r5.f198134i
                if (r8 == 0) goto L_0x019f
                r13 = 2131755869(0x7f10035d, float:1.914263E38)
                r8.setImageResource(r13)
            L_0x019f:
                android.widget.ImageView r8 = r5.f198134i
                if (r8 != 0) goto L_0x01a4
                goto L_0x01c2
            L_0x01a4:
                android.content.Context r13 = r0.f198114d
                r14 = 2131832672(0x7f112f60, float:1.9298404E38)
                java.lang.String r13 = r13.getString(r14)
                r8.setContentDescription(r13)
                goto L_0x01c2
            L_0x01b1:
                android.widget.ImageView r8 = r5.f198134i
                if (r8 != 0) goto L_0x01b6
                goto L_0x01c2
            L_0x01b6:
                r8.setVisibility(r10)
                goto L_0x01c2
            L_0x01ba:
                android.widget.ImageView r8 = r5.f198134i
                if (r8 != 0) goto L_0x01bf
                goto L_0x01c2
            L_0x01bf:
                r8.setVisibility(r10)
            L_0x01c2:
                int r8 = r7.f228630o
                if (r8 == 0) goto L_0x01cf
                android.widget.ImageView r1 = r5.f198131f
                if (r1 != 0) goto L_0x01cb
                goto L_0x01ce
            L_0x01cb:
                r1.setVisibility(r12)
            L_0x01ce:
                throw r4
            L_0x01cf:
                android.widget.ImageView r8 = r5.f198131f
                if (r8 != 0) goto L_0x01d4
                goto L_0x01d7
            L_0x01d4:
                r8.setVisibility(r10)
            L_0x01d7:
                android.widget.TextView r8 = r5.f198127b
                if (r8 != 0) goto L_0x01dc
                goto L_0x01e1
            L_0x01dc:
                java.lang.String r13 = r7.f228627i
                r8.setText(r13)
            L_0x01e1:
                android.widget.ImageView r8 = r5.f198135j
                if (r8 != 0) goto L_0x01e6
                goto L_0x01e9
            L_0x01e6:
                r8.setVisibility(r10)
            L_0x01e9:
                android.widget.ImageView r8 = r5.f198136k
                if (r8 != 0) goto L_0x01ee
                goto L_0x01f1
            L_0x01ee:
                r8.setVisibility(r10)
            L_0x01f1:
                android.widget.ImageView r8 = r5.f198137l
                if (r8 != 0) goto L_0x01f6
                goto L_0x01f9
            L_0x01f6:
                r8.setVisibility(r10)
            L_0x01f9:
                android.widget.ImageView r8 = r5.f198138m
                if (r8 != 0) goto L_0x01fe
                goto L_0x0201
            L_0x01fe:
                r8.setVisibility(r10)
            L_0x0201:
                boolean r8 = r7 instanceof cc2.C67349a
                if (r8 == 0) goto L_0x02e4
                r8 = r7
                cc2.a r8 = (cc2.C67349a) r8
                java.util.LinkedList r8 = r8.mo91490a()
                java.lang.String r13 = "adIconUrl[0]"
                if (r8 == 0) goto L_0x022e
                int r14 = r8.size()
                if (r14 != r11) goto L_0x022e
                android.widget.ImageView r9 = r5.f198135j
                if (r9 != 0) goto L_0x021b
                goto L_0x021e
            L_0x021b:
                r9.setVisibility(r12)
            L_0x021e:
                android.widget.ImageView r9 = r5.f198135j
                java.lang.Object r8 = r8.get(r12)
                gy3.C87412m.m108593f(r8, r13)
                java.lang.String r8 = (java.lang.String) r8
                r0.mo94865a(r9, r8)
                goto L_0x02b2
            L_0x022e:
                java.lang.String r14 = "adIconUrl[1]"
                if (r8 == 0) goto L_0x0265
                int r15 = r8.size()
                if (r15 != r9) goto L_0x0265
                android.widget.ImageView r9 = r5.f198135j
                if (r9 != 0) goto L_0x023d
                goto L_0x0240
            L_0x023d:
                r9.setVisibility(r12)
            L_0x0240:
                android.widget.ImageView r9 = r5.f198136k
                if (r9 != 0) goto L_0x0245
                goto L_0x0248
            L_0x0245:
                r9.setVisibility(r12)
            L_0x0248:
                android.widget.ImageView r9 = r5.f198135j
                java.lang.Object r15 = r8.get(r12)
                gy3.C87412m.m108593f(r15, r13)
                java.lang.String r15 = (java.lang.String) r15
                r0.mo94865a(r9, r15)
                android.widget.ImageView r9 = r5.f198136k
                java.lang.Object r8 = r8.get(r11)
                gy3.C87412m.m108593f(r8, r14)
                java.lang.String r8 = (java.lang.String) r8
                r0.mo94865a(r9, r8)
                goto L_0x02b2
            L_0x0265:
                if (r8 == 0) goto L_0x02b2
                int r15 = r8.size()
                r4 = 3
                if (r15 < r4) goto L_0x02b2
                android.widget.ImageView r4 = r5.f198135j
                if (r4 != 0) goto L_0x0273
                goto L_0x0276
            L_0x0273:
                r4.setVisibility(r12)
            L_0x0276:
                android.widget.ImageView r4 = r5.f198136k
                if (r4 != 0) goto L_0x027b
                goto L_0x027e
            L_0x027b:
                r4.setVisibility(r12)
            L_0x027e:
                android.widget.ImageView r4 = r5.f198137l
                if (r4 != 0) goto L_0x0283
                goto L_0x0286
            L_0x0283:
                r4.setVisibility(r12)
            L_0x0286:
                android.widget.ImageView r4 = r5.f198135j
                java.lang.Object r15 = r8.get(r12)
                gy3.C87412m.m108593f(r15, r13)
                java.lang.String r15 = (java.lang.String) r15
                r0.mo94865a(r4, r15)
                android.widget.ImageView r4 = r5.f198136k
                java.lang.Object r13 = r8.get(r11)
                gy3.C87412m.m108593f(r13, r14)
                java.lang.String r13 = (java.lang.String) r13
                r0.mo94865a(r4, r13)
                android.widget.ImageView r4 = r5.f198137l
                java.lang.Object r8 = r8.get(r9)
                java.lang.String r9 = "adIconUrl[2]"
                gy3.C87412m.m108593f(r8, r9)
                java.lang.String r8 = (java.lang.String) r8
                r0.mo94865a(r4, r8)
            L_0x02b2:
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC r4 = r0.f198117g
                java.util.Map<java.lang.String, gn1.a$a> r4 = r4.f222832f
                java.lang.String r8 = r7.f228622d
                java.util.HashMap r4 = (java.util.HashMap) r4
                java.lang.Object r4 = r4.get(r8)
                gn1.a$a r4 = (gn1.C75991a.C75992a) r4
                if (r4 == 0) goto L_0x02d6
                int r8 = r4.f222844l
                r9 = -1
                if (r8 != r9) goto L_0x02c8
                r8 = 0
            L_0x02c8:
                r4.f222844l = r8
                int r4 = r4.f222835c
                if (r4 <= 0) goto L_0x02d6
                android.widget.ImageView r4 = r5.f198138m
                if (r4 != 0) goto L_0x02d3
                goto L_0x02d6
            L_0x02d3:
                r4.setVisibility(r12)
            L_0x02d6:
                android.widget.ImageView r4 = r5.f198138m
                if (r4 == 0) goto L_0x02e4
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$c r8 = new com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$c
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC r9 = r0.f198117g
                r8.<init>(r9, r7, r0)
                r4.setOnClickListener(r8)
            L_0x02e4:
                java.lang.String r4 = r7.f228626h
                if (r4 == 0) goto L_0x034e
                int r8 = r4.length()
                int r8 = r8 - r11
                r9 = 0
                r13 = 0
            L_0x02ef:
                if (r9 > r8) goto L_0x0314
                if (r13 != 0) goto L_0x02f5
                r14 = r9
                goto L_0x02f6
            L_0x02f5:
                r14 = r8
            L_0x02f6:
                char r14 = r4.charAt(r14)
                r15 = 32
                int r14 = gy3.C87412m.m108596i(r14, r15)
                if (r14 > 0) goto L_0x0304
                r14 = 1
                goto L_0x0305
            L_0x0304:
                r14 = 0
            L_0x0305:
                if (r13 != 0) goto L_0x030e
                if (r14 != 0) goto L_0x030b
                r13 = 1
                goto L_0x02ef
            L_0x030b:
                int r9 = r9 + 1
                goto L_0x02ef
            L_0x030e:
                if (r14 != 0) goto L_0x0311
                goto L_0x0314
            L_0x0311:
                int r8 = r8 + -1
                goto L_0x02ef
            L_0x0314:
                int r8 = r8 + r11
                java.lang.CharSequence r4 = r4.subSequence(r9, r8)
                java.lang.String r4 = r4.toString()
                java.lang.String r8 = ""
                boolean r4 = gy3.C87412m.m108589b(r4, r8)
                if (r4 == 0) goto L_0x0326
                goto L_0x034e
            L_0x0326:
                android.widget.TextView r4 = r5.f198128c
                if (r4 != 0) goto L_0x032b
                goto L_0x032e
            L_0x032b:
                r4.setVisibility(r12)
            L_0x032e:
                android.widget.TextView r4 = r5.f198128c
                if (r4 != 0) goto L_0x0333
                goto L_0x0356
            L_0x0333:
                di3.d r8 = di3.C86312j.m106911c(r3)
                ny.h r8 = (p629ny.C76979h) r8
                android.content.Context r9 = r0.f198114d
                java.lang.String r13 = r7.f228626h
                android.widget.TextView r14 = r5.f198128c
                gy3.C87412m.m108591d(r14)
                float r14 = r14.getTextSize()
                android.text.SpannableString r8 = r8.yp0(r9, r13, r14)
                r4.setText(r8)
                goto L_0x0356
            L_0x034e:
                android.widget.TextView r4 = r5.f198128c
                if (r4 != 0) goto L_0x0353
                goto L_0x0356
            L_0x0353:
                r4.setVisibility(r10)
            L_0x0356:
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC r4 = r0.f198117g
                boolean r4 = r4.mo94859g3(r7)
                if (r4 == 0) goto L_0x0367
                android.widget.ImageView r4 = r5.f198132g
                if (r4 != 0) goto L_0x0363
                goto L_0x036f
            L_0x0363:
                r4.setVisibility(r12)
                goto L_0x036f
            L_0x0367:
                android.widget.ImageView r4 = r5.f198132g
                if (r4 != 0) goto L_0x036c
                goto L_0x036f
            L_0x036c:
                r4.setVisibility(r10)
            L_0x036f:
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC r4 = r0.f198117g
                r4.getClass()
                int r4 = r7.f228621E
                r4 = r4 & r11
                if (r4 <= 0) goto L_0x037b
                r4 = 1
                goto L_0x037c
            L_0x037b:
                r4 = 0
            L_0x037c:
                if (r4 == 0) goto L_0x03c5
                android.view.View r4 = r5.f198133h
                if (r4 != 0) goto L_0x0384
                goto L_0x040b
            L_0x0384:
                k20.a r8 = new k20.a
                r8.<init>()
                java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
                r8.mo10233c(r9)
                java.lang.Object[] r14 = r8.mo10232b()
                java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter"
                java.lang.String r16 = "getView"
                java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r4
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r8 = r8.mo10231a(r12)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r4.setVisibility(r8)
                java.lang.String r14 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter"
                java.lang.String r15 = "getView"
                java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                goto L_0x040b
            L_0x03c5:
                android.view.View r4 = r5.f198133h
                if (r4 != 0) goto L_0x03ca
                goto L_0x040b
            L_0x03ca:
                k20.a r8 = new k20.a
                r8.<init>()
                java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
                r8.mo10233c(r9)
                java.lang.Object[] r21 = r8.mo10232b()
                java.lang.String r22 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter"
                java.lang.String r23 = "getView"
                java.lang.String r24 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r25 = "android/view/View_EXEC_"
                java.lang.String r26 = "setVisibility"
                java.lang.String r27 = "(I)V"
                r20 = r4
                j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
                java.lang.Object r8 = r8.mo10231a(r12)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r4.setVisibility(r8)
                java.lang.String r21 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter"
                java.lang.String r22 = "getView"
                java.lang.String r23 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r24 = "android/view/View_EXEC_"
                java.lang.String r25 = "setVisibility"
                java.lang.String r26 = "(I)V"
                j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            L_0x040b:
                int r4 = r7.f228628j
                r8 = 10000(0x2710, float:1.4013E-41)
                if (r4 != r8) goto L_0x0413
                r4 = 1
                goto L_0x0414
            L_0x0413:
                r4 = 0
            L_0x0414:
                if (r4 == 0) goto L_0x0464
                android.widget.ImageView r2 = r5.f198129d
                if (r2 == 0) goto L_0x041e
                r3 = 0
                r2.setImageBitmap(r3)
            L_0x041e:
                hc0.c$b r2 = new hc0.c$b
                r2.<init>()
                java.lang.String r3 = f12.C7970a.m8127a()
                r2.f59351g = r3
                r2.f59346b = r11
                r2.f59363s = r11
                hc0.c r2 = r2.mo32666a()
                gc0.a r3 = gc0.C20828a.m22825b()
                java.lang.String r4 = r7.f228641z
                android.widget.ImageView r8 = r5.f198129d
                r3.mo32519h(r4, r8, r2)
                java.lang.String r2 = r7.f228633r
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x044f
                android.widget.TextView r2 = r5.f198130e
                if (r2 != 0) goto L_0x044a
                goto L_0x0501
            L_0x044a:
                r2.setVisibility(r10)
                goto L_0x0501
            L_0x044f:
                android.widget.TextView r2 = r5.f198130e
                if (r2 != 0) goto L_0x0454
                goto L_0x0459
            L_0x0454:
                java.lang.String r3 = r7.f228633r
                r2.setText(r3)
            L_0x0459:
                android.widget.TextView r2 = r5.f198130e
                if (r2 != 0) goto L_0x045f
                goto L_0x0501
            L_0x045f:
                r2.setVisibility(r12)
                goto L_0x0501
            L_0x0464:
                java.lang.Class<ln.f> r4 = p196ln.C76705f.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                ln.f r4 = (p196ln.C76705f) r4
                android.widget.ImageView r8 = r5.f198129d
                java.lang.String r9 = r7.f228622d
                r4.mo106849z(r8, r9)
                k40.a r4 = f40.C86709a0.m107533q(r2)
                f62.k0 r4 = (f62.C75700k0) r4
                com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
                java.lang.String r8 = r7.f228622d
                boolean r4 = r4.mo69724s3(r8)
                if (r4 == 0) goto L_0x04f9
                android.widget.TextView r4 = r5.f198130e
                if (r4 != 0) goto L_0x048a
                goto L_0x048d
            L_0x048a:
                r4.setVisibility(r12)
            L_0x048d:
                int r4 = r7.f228630o
                boolean r4 = com.tencent.p014mm.storage.C72996z1.m85810M4(r4)
                if (r4 == 0) goto L_0x04a7
                android.widget.TextView r2 = r5.f198130e
                if (r2 != 0) goto L_0x049a
                goto L_0x0501
            L_0x049a:
                android.content.Context r3 = r0.f198114d
                r4 = 2131833431(0x7f113257, float:1.9299944E38)
                java.lang.String r3 = r3.getString(r4)
                r2.setText(r3)
                goto L_0x0501
            L_0x04a7:
                k40.a r2 = f40.C86709a0.m107533q(r2)
                f62.k0 r2 = (f62.C75700k0) r2
                com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
                java.lang.String r4 = r7.f228622d
                com.tencent.mm.storage.z1 r2 = r2.mo69664N2(r4)
                if (r2 == 0) goto L_0x04e7
                android.widget.TextView r4 = r5.f198126a
                if (r4 != 0) goto L_0x04be
                goto L_0x04e7
            L_0x04be:
                di3.d r3 = di3.C86312j.m106911c(r3)
                ny.h r3 = (p629ny.C76979h) r3
                android.content.Context r8 = r0.f198114d
                java.lang.String r9 = r2.mo62898f()
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x04d3
                java.lang.String r2 = r7.f228623e
                goto L_0x04d7
            L_0x04d3:
                java.lang.String r2 = r2.mo62898f()
            L_0x04d7:
                android.widget.TextView r9 = r5.f198126a
                gy3.C87412m.m108591d(r9)
                float r9 = r9.getTextSize()
                android.text.SpannableString r2 = r3.yp0(r8, r2, r9)
                r4.setText(r2)
            L_0x04e7:
                android.widget.TextView r2 = r5.f198130e
                if (r2 != 0) goto L_0x04ec
                goto L_0x0501
            L_0x04ec:
                android.content.Context r3 = r0.f198114d
                r4 = 2131833436(0x7f11325c, float:1.9299954E38)
                java.lang.String r3 = r3.getString(r4)
                r2.setText(r3)
                goto L_0x0501
            L_0x04f9:
                android.widget.TextView r2 = r5.f198130e
                if (r2 != 0) goto L_0x04fe
                goto L_0x0501
            L_0x04fe:
                r2.setVisibility(r10)
            L_0x0501:
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$d r2 = new com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a$d
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC r3 = r0.f198117g
                r2.<init>(r7, r3, r1)
                r6.post(r2)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC.C68941a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$b */
    public static final class C68946b {

        /* renamed from: a */
        public TextView f198126a;

        /* renamed from: b */
        public TextView f198127b;

        /* renamed from: c */
        public TextView f198128c;

        /* renamed from: d */
        public ImageView f198129d;

        /* renamed from: e */
        public TextView f198130e;

        /* renamed from: f */
        public ImageView f198131f;

        /* renamed from: g */
        public ImageView f198132g;

        /* renamed from: h */
        public View f198133h;

        /* renamed from: i */
        public ImageView f198134i;

        /* renamed from: j */
        public ImageView f198135j;

        /* renamed from: k */
        public ImageView f198136k;

        /* renamed from: l */
        public ImageView f198137l;

        /* renamed from: m */
        public ImageView f198138m;
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$c */
    public static final class C68947c implements C92411b.C92412a {

        /* renamed from: d */
        public final /* synthetic */ NearbyPersonV1UIC f198139d;

        /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$c$a */
        public static final class C68948a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ NearbyPersonV1UIC f198140d;

            public C68948a(NearbyPersonV1UIC nearbyPersonV1UIC) {
                this.f198140d = nearbyPersonV1UIC;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                LocationUtil.jumpToOpenGps(this.f198140d.getActivity());
            }
        }

        public C68947c(NearbyPersonV1UIC nearbyPersonV1UIC) {
            this.f198139d = nearbyPersonV1UIC;
        }

        public final boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            NearbyPersonV1UIC nearbyPersonV1UIC = this.f198139d;
            if (nearbyPersonV1UIC.f198108u) {
                return false;
            }
            nearbyPersonV1UIC.f198108u = true;
            if (nearbyPersonV1UIC.f198111x) {
                Log.m105924i("NearbyPersonUIC", "dismissTipDialog");
                C89779i0 i0Var = nearbyPersonV1UIC.f198100j;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                nearbyPersonV1UIC.f198100j = null;
                C85405m.m105415e(11);
                return false;
            }
            if (z) {
                C89779i0 i0Var2 = nearbyPersonV1UIC.f198100j;
                if (i0Var2 != null) {
                    i0Var2.setMessage(nearbyPersonV1UIC.getString(C0966R.string.h5j));
                }
                NearbyPersonV1UIC nearbyPersonV1UIC2 = this.f198139d;
                float f3 = f2;
                nearbyPersonV1UIC2.f198109v = new C75991a.C75993b(f3, f, (int) d2);
                NearbyPersonV1UIC nearbyPersonV1UIC3 = this.f198139d;
                int i2 = nearbyPersonV1UIC3.f198105r;
                C75991a.C75993b bVar = nearbyPersonV1UIC3.f198109v;
                C87412m.m108591d(bVar);
                float f4 = bVar.f222847b;
                C75991a.C75993b bVar2 = this.f198139d.f198109v;
                C87412m.m108591d(bVar2);
                float f5 = bVar2.f222846a;
                C75991a.C75993b bVar3 = this.f198139d.f198109v;
                C87412m.m108591d(bVar3);
                nearbyPersonV1UIC2.f222830d = ((C76726b) C86312j.m106911c(C76726b.class)).mo106909kq(i2, f4, f5, bVar3.f222848c, i, "", "");
                C89137b0 d4 = C86709a0.m107524d();
                C67350b bVar4 = this.f198139d.f222830d;
                C87412m.m108592e(bVar4, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
                d4.mo123460f((C117747y) bVar4);
                Log.m105924i("NearbyPersonUIC", "onGetLocation doScene");
            } else {
                C85405m.m105415e(11);
                NearbyPersonV1UIC nearbyPersonV1UIC4 = this.f198139d;
                nearbyPersonV1UIC4.getClass();
                Log.m105924i("NearbyPersonUIC", "dismissTipDialog");
                C89779i0 i0Var3 = nearbyPersonV1UIC4.f198100j;
                if (i0Var3 != null) {
                    i0Var3.dismiss();
                }
                nearbyPersonV1UIC4.f198100j = null;
                View findViewById = this.f198139d.getRootView().findViewById(C0966R.C0970id.h_y);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$onLocationGet$1", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$onLocationGet$1", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ListView listView = this.f198139d.f198098h;
                C87412m.m108591d(listView);
                listView.setVisibility(8);
                NearbyPersonV1UIC nearbyPersonV1UIC5 = this.f198139d;
                nearbyPersonV1UIC5.f198106s = true;
                if (!nearbyPersonV1UIC5.f198110w && !LocationUtil.isGpsEnable()) {
                    NearbyPersonV1UIC nearbyPersonV1UIC6 = this.f198139d;
                    nearbyPersonV1UIC6.f198110w = true;
                    C76879j.m92709C(nearbyPersonV1UIC6.getActivity(), this.f198139d.getString(C0966R.string.fez), this.f198139d.getString(C0966R.string.a3h), this.f198139d.getString(C0966R.string.fyd), this.f198139d.getString(C0966R.string.f7926wf), false, new C68948a(this.f198139d), (DialogInterface.OnClickListener) null);
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$e */
    public static final class C68949e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyPersonV1UIC f198141d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68949e(NearbyPersonV1UIC nearbyPersonV1UIC) {
            super(0);
            this.f198141d = nearbyPersonV1UIC;
        }

        public Object invoke() {
            this.f198141d.getContext().finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$g */
    public static final class C68950g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyPersonV1UIC f198142d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68950g(NearbyPersonV1UIC nearbyPersonV1UIC) {
            super(0);
            this.f198142d = nearbyPersonV1UIC;
        }

        public Object invoke() {
            NearbyPersonV1UIC.m81188c3(this.f198142d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$h */
    public static final class C68951h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ NearbyPersonV1UIC f198143d;

        public C68951h(NearbyPersonV1UIC nearbyPersonV1UIC) {
            this.f198143d = nearbyPersonV1UIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$showPermissionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f198143d.mo94856d3()) {
                this.f198143d.mo94861j3();
            } else if (!((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.NEARBY)) {
                NearbyPersonV1UIC.m81188c3(this.f198143d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$showPermissionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyPersonV1UIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        new LinkedList();
    }

    /* renamed from: c3 */
    public static final void m81188c3(NearbyPersonV1UIC nearbyPersonV1UIC) {
        nearbyPersonV1UIC.getClass();
        if (!((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9103H()) {
            nearbyPersonV1UIC.mo94862k3();
            nearbyPersonV1UIC.mo94861j3();
        } else if (((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.LOCAION, C113177k.C113178a.NEARBY, new C75995e(nearbyPersonV1UIC))) {
            Log.m105924i("NearbyPersonUIC", "handleOnStartLoadData return for permission:" + nearbyPersonV1UIC.f198096I);
        } else {
            nearbyPersonV1UIC.mo94858f3();
        }
    }

    /* renamed from: d3 */
    public final boolean mo94856d3() {
        boolean H = ((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9103H();
        this.f198096I = H;
        return H;
    }

    /* renamed from: e3 */
    public final void mo94857e3() {
        if (!this.f198093F) {
            Log.m105924i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for isOnResume:" + this.f198093F);
        } else if (!this.f198090C) {
            Log.m105924i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for isOnUserVisibleFocused:" + this.f198090C);
        } else if (this.f198096I) {
            Log.m105924i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for lastOnPauseHasPermission:" + this.f198096I);
        } else if (!((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9103H()) {
            Log.m105924i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for permission:" + this.f198096I);
        } else {
            Log.m105924i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain requestInit");
            Log.m105928w("NearbyPersonUIC", "dismissPermissionView");
            View findViewById = getRootView().findViewById(C0966R.C0970id.f358533fm3);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "dismissPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "dismissPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo94858f3();
        }
    }

    /* renamed from: f3 */
    public final void mo94858f3() {
        Map<String, String> parseXml;
        int i;
        Log.m105924i("NearbyPersonUIC", "fetchDataInternal hasLoadData:" + this.f198088A);
        if (!this.f198088A) {
            mo94863l3();
            if (LocaleUtil.isSimplifiedChineseAppLang() && (parseXml = XmlParser.parseXml(((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_nearby_ad, ""), "lbsads", (String) null)) != null && (i = Util.getInt(parseXml.get(".lbsads.$count"), 0)) > 0) {
                int i2 = 0;
                while (i2 < i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(".lbsads.lbsad");
                    sb.append(i2 == 0 ? "" : Integer.valueOf(i2));
                    String sb4 = sb.toString();
                    C75991a.C75992a aVar = new C75991a.C75992a();
                    aVar.f222833a = parseXml.get(sb4 + ".$id");
                    aVar.f222834b = Util.getInt(parseXml.get(sb4 + ".$pos"), 0);
                    aVar.f222835c = Util.getInt(parseXml.get(sb4 + ".$close_times"), 0);
                    aVar.f222836d = Util.getInt(parseXml.get(sb4 + ".$show_times"), Integer.MAX_VALUE);
                    aVar.f222837e = parseXml.get(sb4 + ".name");
                    aVar.f222838f = parseXml.get(sb4 + ".desc");
                    aVar.f222839g = parseXml.get(sb4 + ".icon");
                    aVar.f222840h = Util.getInt(parseXml.get(sb4 + ".jump.$type"), 0);
                    aVar.f222841i = parseXml.get(sb4 + ".jump");
                    Map<String, C75991a.C75992a> map = this.f222832f;
                    String str = aVar.f222833a;
                    C87412m.m108591d(str);
                    ((HashMap) map).put(str, aVar);
                    i2++;
                }
                String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_NEAR_BY_AD_STRING_SYNC, (Object) null);
                if (str2 != null) {
                    Object[] array = C112550d0.m153785U(str2, new String[]{"\\|"}, false, 0, 6, (Object) null).toArray(new String[0]);
                    C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    for (String U : (String[]) array) {
                        Object[] array2 = C112550d0.m153785U(U, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null).toArray(new String[0]);
                        C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        String[] strArr = (String[]) array2;
                        if (strArr.length == 3) {
                            C75991a.C75992a aVar2 = (C75991a.C75992a) ((HashMap) this.f222832f).get(strArr[0]);
                            if (aVar2 != null) {
                                aVar2.f222842j = Util.getInt(strArr[1], 0);
                                aVar2.f222843k = Util.getInt(strArr[2], 0);
                            }
                        }
                    }
                }
            }
            this.f198088A = true;
        }
    }

    /* renamed from: g3 */
    public final boolean mo94859g3(C78019ym2 ym22) {
        a94 a94 = ym22.f228638w;
        return a94 != null && (a94.f130392d & 1) > 0;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bkh;
    }

    /* renamed from: i3 */
    public final void mo94860i3() {
        int i;
        LinkedList linkedList = new LinkedList();
        int size = this.f198103p.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                break;
            }
            if (this.f198103p.get(i3).f228628j != 10000) {
                z = false;
            }
            if (!z) {
                linkedList.add(this.f198103p.get(i3));
            }
            i3++;
        }
        this.f198103p.clear();
        this.f198103p = linkedList;
        Log.m105924i("NearbyPersonUIC", "mergeADItemList friendList size:" + this.f198103p.size());
        boolean isEmpty = this.f198103p.isEmpty() ^ true;
        for (String str : ((HashMap) this.f222832f).keySet()) {
            if (isEmpty) {
                C75991a.C75992a aVar = (C75991a.C75992a) ((HashMap) this.f222832f).get(str);
                C87412m.m108591d(aVar);
                if (!aVar.f222845m && (((i = aVar.f222835c) < 1 || aVar.f222842j < i) && aVar.f222843k < aVar.f222836d)) {
                    List<C78019ym2> list = this.f198103p;
                    int i4 = aVar.f222834b;
                    int size2 = (i4 < 0 || i4 > list.size()) ? this.f198103p.size() : aVar.f222834b + i2;
                    String str2 = aVar.f222833a;
                    String str3 = aVar.f222839g;
                    String str4 = aVar.f222837e;
                    String str5 = aVar.f222838f;
                    String str6 = aVar.f222841i;
                    C78019ym2 w602 = ((C76726b) C86312j.m106911c(C76726b.class)).w60();
                    w602.f228628j = 10000;
                    w602.f228622d = str2;
                    w602.f228641z = str3;
                    w602.f228627i = str5;
                    w602.f228623e = str4;
                    w602.f228624f = str6;
                    list.add(size2, w602);
                    i2++;
                }
            }
        }
    }

    /* renamed from: j3 */
    public final void mo94861j3() {
        boolean z;
        Class cls = C103918d.class;
        Object e = C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
        if (C76850a.m92639k((String) e)) {
            z = ((C103918d) C86312j.m106911c(cls)).Lb0(getActivity(), "android.permission.ACCESS_FINE_LOCATION");
            if (!z) {
                if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, false)) {
                    ((C16292g) C86312j.m106911c(C16292g.class)).nr0(getActivity(), getActivity().getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30764, true);
                } else {
                    ((C103918d) C86312j.m106911c(cls)).mo125790zt(getActivity(), "android.permission.ACCESS_FINE_LOCATION", 153);
                }
            }
        } else {
            z = ((C103918d) C86312j.m106911c(cls)).Uu0(getActivity(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 153, (String) null, (String) null);
        }
        Log.m105924i("NearbyPersonUIC", "requestLocationPermission checkLocation:" + z);
    }

    /* renamed from: k3 */
    public final void mo94862k3() {
        Log.m105928w("NearbyPersonUIC", "showNoPermissionView");
        View findViewById = getRootView().findViewById(C0966R.C0970id.f358533fm3);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "showPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "showPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getRootView().findViewById(C0966R.C0970id.fm4).setOnClickListener(new C68951h(this));
    }

    /* renamed from: l3 */
    public final void mo94863l3() {
        C86709a0.m107524d().mo123455a(148, this);
        C86709a0.m107524d().mo123455a(1087, this);
        this.f198100j = C76879j.m92723Q(getActivity(), getString(C0966R.string.a3h), getString(C0966R.string.h5s), true, true, new C76002o(this));
        this.f198108u = false;
        this.f198111x = false;
        C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        this.f198107t = ms;
        if (ms != null) {
            ms.mo126409c(this.f198112y, true, false);
        }
        C5139t.m5183e(22, 10);
    }

    /* renamed from: m3 */
    public final void mo94864m3() {
        Class cls = C76726b.class;
        if (((C76726b) C86312j.m106911c(cls)).mo106908ei() || ((C76726b) C86312j.m106911c(cls)).mo106905Mb()) {
            View view = null;
            if (this.f198099i != null) {
                ListView listView = this.f198098h;
                C87412m.m108591d(listView);
                listView.removeHeaderView(this.f198099i);
                this.f198099i = null;
            }
            Class cls2 = C75700k0.class;
            View inflate = View.inflate(getActivity(), C0966R.C0971layout.bk4, (ViewGroup) null);
            View findViewById = inflate.findViewById(C0966R.C0970id.j0x);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById;
            C86709a0.m107523b().mo121108c();
            int kD = ((C72957c4) ((C75700k0) C86709a0.m107533q(cls2)).mo96099XB()).mo100937kD();
            if (kD == 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = inflate;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = inflate;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(getActivity().getResources().getQuantityString(C0966R.plurals.f7246a3, kD, new Object[]{Integer.valueOf(kD)}));
                View findViewById2 = inflate.findViewById(C0966R.C0970id.gpl);
                C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) findViewById2;
                C72956b4 bD = ((C72957c4) ((C75700k0) C86709a0.m107533q(cls2)).mo96099XB()).mo100935bD();
                if (bD != null) {
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, bD.field_sayhiuser);
                }
                inflate.setOnClickListener(new C75994b(this));
                C21448d.f60723a.mo33624b(11);
                view = inflate;
            }
            this.f198099i = view;
            if (view != null) {
                ListView listView2 = this.f198098h;
                C87412m.m108591d(listView2);
                listView2.addHeaderView(this.f198099i);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C85405m.m105411a(11);
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("LBSShowBindPhone");
        if (c != null) {
            if (c.length() > 0) {
                try {
                    Integer valueOf = Integer.valueOf(c);
                    C87412m.m108593f(valueOf, "{\n                Intege…lueOf(flag)\n            }");
                    valueOf.intValue();
                } catch (Exception unused) {
                }
            }
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        this.f198105r = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(16386, (Object) null), 1);
        this.f198101n = new C68941a(this, getActivity());
        ListView listView = (ListView) getRootView().findViewById(C0966R.C0970id.h_z);
        this.f198098h = listView;
        if (listView != null) {
            if (this.f198097g == null) {
                LinearLayout linearLayout = new LinearLayout(getActivity());
                this.f198097g = linearLayout;
                linearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                ViewGroup viewGroup = this.f198097g;
                C87412m.m108592e(viewGroup, "null cannot be cast to non-null type android.widget.LinearLayout");
                ((LinearLayout) viewGroup).setGravity(17);
            }
            this.f198102o = true;
            listView.addHeaderView(this.f198097g);
        }
        ListView listView2 = this.f198098h;
        if (listView2 != null) {
            listView2.setAdapter(this.f198101n);
        }
        ListView listView3 = this.f198098h;
        if (listView3 != null) {
            listView3.setOnItemClickListener(new C75996f(this));
        }
        ListView listView4 = this.f198098h;
        if (listView4 != null) {
            listView4.setOnTouchListener(new C75997g(this));
        }
        this.f198113z = System.currentTimeMillis();
        mo94856d3();
        Log.m105924i("NearbyPersonUIC", "onCreate");
    }

    public void onDestroy() {
        C46863b bVar;
        super.onDestroy();
        C85405m.m105415e(11);
        C86709a0.m107524d().mo123470p(148, this);
        C86709a0.m107524d().mo123470p(1087, this);
        Log.m105924i("NearbyPersonUIC", "dismissTipDialog");
        C89779i0 i0Var = this.f198100j;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f198100j = null;
        C92411b bVar2 = this.f198107t;
        if (bVar2 != null) {
            bVar2.mo126408b(this.f198112y);
        }
        ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93574a();
        C68941a aVar = this.f198101n;
        if (!(aVar == null || (bVar = aVar.f198115e) == null)) {
            bVar.mo72071a();
            aVar.f198115e = null;
        }
        if (this.f198103p.size() > 0) {
            String str = "";
            for (C75991a.C75992a aVar2 : ((HashMap) this.f222832f).values()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('|');
                sb.append(aVar2.f222833a);
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                sb.append(aVar2.f222842j);
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                int i = aVar2.f222843k + 1;
                aVar2.f222843k = i;
                sb.append(i);
                str = sb.toString();
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEAR_BY_AD_STRING_SYNC, str);
        }
        C21448d.m24264c(C21448d.f60723a, (String) null, (String) null, (String) null, (String) null, 0, 100, 0, 0, 0, 0, 0, 0, System.currentTimeMillis() - this.f198113z, 4063, (Object) null);
    }

    public void onPause() {
        Log.m105924i("NearbyPersonUIC", "onPause");
        C92411b bVar = this.f198107t;
        if (bVar != null) {
            bVar.mo126408b(this.f198112y);
        }
        this.f198095H.dead();
        this.f198111x = true;
        this.f198093F = false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        Log.m105924i("NearbyPersonUIC", "onRequestPermissionsResult requestCode:" + i + " grantResults[0]:" + iArr[0]);
        if (i != 79 && i != 153) {
            return;
        }
        if (iArr[0] == 0) {
            mo94857e3();
        } else {
            Log.m105924i(NearbyVideoPresenter.TAG, "onRequestPermissionsResult return for grant.");
        }
    }

    public void onResume() {
        Log.m105924i("NearbyPersonUIC", "onResume");
        this.f198093F = true;
        if (!this.f198094G) {
            mo94857e3();
        }
        mo94864m3();
        C68941a aVar = this.f198101n;
        C87412m.m108591d(aVar);
        aVar.notifyDataSetChanged();
        C86709a0.m107523b().mo121108c();
        if (((C72957c4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB()).mo100937kD() == 0) {
            ListView listView = this.f198098h;
            C87412m.m108591d(listView);
            listView.removeHeaderView((View) null);
        }
        this.f198095H.alive();
        this.f198111x = false;
        this.f198094G = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02f3, code lost:
        if (r6 != 4) goto L_0x0380;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x036c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r24, int r25, java.lang.String r26, ob0.C117747y r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r27
            java.lang.Class<lv.b> r3 = p601lv.C76726b.class
            java.lang.String r4 = "scene"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onSceneEnd scene.type:"
            r4.append(r5)
            int r5 = r27.getType()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "NearbyPersonUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            qo3.i0 r4 = r0.f198100j
            if (r4 == 0) goto L_0x002e
            r4.dismiss()
        L_0x002e:
            r4 = 0
            r0.f198100j = r4
            int r6 = r27.getType()
            r7 = 148(0x94, float:2.07E-43)
            if (r6 != r7) goto L_0x0388
            r6 = r2
            cc2.b r6 = (cc2.C67350b) r6
            int r8 = r6.mo75607f()
            cc2.b r9 = r0.f222830d
            java.lang.String r10 = " code:"
            r11 = 4
            r12 = 3
            r13 = 1
            if (r9 != 0) goto L_0x006d
            if (r8 == r13) goto L_0x004f
            if (r8 == r12) goto L_0x004f
            if (r8 != r11) goto L_0x006d
        L_0x004f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleFindLbsFriends sceneLbsFind:"
            r1.append(r2)
            cc2.b r2 = r0.f222830d
            r1.append(r2)
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x0380
        L_0x006d:
            boolean r9 = r0.f198104q
            if (r9 == 0) goto L_0x0095
            if (r8 == r13) goto L_0x0077
            if (r8 == r12) goto L_0x0077
            if (r8 != r11) goto L_0x0095
        L_0x0077:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleFindLbsFriends isDataReqed:"
            r1.append(r2)
            boolean r2 = r0.f198104q
            r1.append(r2)
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x0380
        L_0x0095:
            cc2.b r9 = r0.f222831e
            r14 = 2
            if (r9 != 0) goto L_0x00ba
            if (r8 != r14) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleFindLbsFriends sceneClearLocation:"
            r1.append(r2)
            cc2.b r2 = r0.f222831e
            r1.append(r2)
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x0380
        L_0x00ba:
            int r9 = r27.getType()
            if (r9 == r7) goto L_0x00da
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "handleFindLbsFriends type:"
            r1.append(r3)
            int r2 = r27.getType()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x0380
        L_0x00da:
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r24)
            r9 = 0
            r2[r9] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r25)
            r2[r13] = r7
            r2[r14] = r26
            java.lang.String r7 = "handleFindLbsFriends errType=%d, errCode=%d, errMsg=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r2)
            r2 = 8
            r7 = 2131310041(0x7f0935d9, float:1.8238383E38)
            java.lang.String r10 = "showLbsTips"
            if (r24 != 0) goto L_0x02e9
            if (r1 != 0) goto L_0x02e9
            if (r8 == r13) goto L_0x0104
            if (r8 == r12) goto L_0x0104
            if (r8 == r11) goto L_0x0104
            goto L_0x029c
        L_0x0104:
            java.util.List r1 = r6.mo75608j0()
            java.lang.String r8 = "scene.lbsList"
            gy3.C87412m.m108593f(r1, r8)
            r0.f198103p = r1
            int r1 = r1.size()
            if (r1 != 0) goto L_0x017c
            android.view.View r1 = r23.getRootView()
            android.view.View r1 = r1.findViewById(r7)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r7.mo10233c(r8)
            java.lang.Object[] r16 = r7.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC"
            java.lang.String r18 = "handleLbsFindFriends"
            java.lang.String r19 = "(ILcom/tencent/mm/plugin/nearby/model/INetSceneLbsFind;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r7 = r7.mo10231a(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC"
            java.lang.String r17 = "handleLbsFindFriends"
            java.lang.String r18 = "(ILcom/tencent/mm/plugin/nearby/model/INetSceneLbsFind;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.widget.ListView r1 = r0.f198098h
            gy3.C87412m.m108591d(r1)
            r1.setVisibility(r2)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            di3.d r1 = di3.C86312j.m106911c(r3)
            lv.b r1 = (p601lv.C76726b) r1
            androidx.appcompat.app.AppCompatActivity r2 = r23.getActivity()
            r1.mo106910pd(r2)
            r1 = 11
            com.tencent.p014mm.plugin.report.service.C85405m.m105415e(r1)
            goto L_0x0290
        L_0x017c:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.List<te3.ym2> r3 = r0.f198103p
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x0188:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x01c2
            java.lang.Object r8 = r3.next()
            te3.ym2 r8 = (te3.C78019ym2) r8
            java.lang.Class<f62.k0> r10 = f62.C75700k0.class
            k40.a r10 = f40.C86709a0.m107533q(r10)
            f62.k0 r10 = (f62.C75700k0) r10
            com.tencent.mm.storage.u3 r10 = r10.mo96097Ni()
            java.lang.String r15 = r8.f228622d
            boolean r10 = r10.mo69724s3(r15)
            if (r10 == 0) goto L_0x01ae
            r1.add(r5, r8)
            int r5 = r5 + 1
            goto L_0x0188
        L_0x01ae:
            java.lang.String r10 = r8.f228622d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0188
            java.lang.String r10 = r8.f228627i
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0188
            r1.add(r8)
            goto L_0x0188
        L_0x01c2:
            java.util.List<te3.ym2> r3 = r0.f198103p
            r3.clear()
            r0.f198103p = r1
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0220
            android.view.View r1 = r23.getRootView()
            android.view.View r1 = r1.findViewById(r7)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r3.mo10233c(r5)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC"
            java.lang.String r18 = "handleLbsFindFriends"
            java.lang.String r19 = "(ILcom/tencent/mm/plugin/nearby/model/INetSceneLbsFind;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC"
            java.lang.String r17 = "handleLbsFindFriends"
            java.lang.String r18 = "(ILcom/tencent/mm/plugin/nearby/model/INetSceneLbsFind;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.widget.ListView r1 = r0.f198098h
            gy3.C87412m.m108591d(r1)
            r1.setVisibility(r2)
            goto L_0x0290
        L_0x0220:
            android.view.View r1 = r23.getRootView()
            android.view.View r1 = r1.findViewById(r7)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC"
            java.lang.String r18 = "handleLbsFindFriends"
            java.lang.String r19 = "(ILcom/tencent/mm/plugin/nearby/model/INetSceneLbsFind;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r2 = r3.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC"
            java.lang.String r17 = "handleLbsFindFriends"
            java.lang.String r18 = "(ILcom/tencent/mm/plugin/nearby/model/INetSceneLbsFind;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            r23.mo94860i3()
            com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a r1 = r0.f198101n
            gy3.C87412m.m108591d(r1)
            r1.notifyDataSetChanged()
            com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$a r1 = r0.f198101n
            gy3.C87412m.m108591d(r1)
            int r1 = r1.getCount()
            if (r1 <= 0) goto L_0x0286
            android.widget.ListView r1 = r0.f198098h
            gy3.C87412m.m108591d(r1)
            r1.setSelection(r9)
        L_0x0286:
            android.widget.ListView r1 = r0.f198098h
            gy3.C87412m.m108591d(r1)
            gn1.d r2 = gn1.C59599d.f170309d
            r1.post(r2)
        L_0x0290:
            int r1 = r0.f198105r
            if (r1 == r12) goto L_0x0298
            if (r1 == r11) goto L_0x0298
            r0.f198105r = r13
        L_0x0298:
            r0.f198104q = r13
            r0.f222830d = r4
        L_0x029c:
            int r1 = r6.mo75607f()
            if (r1 != r14) goto L_0x0380
            androidx.appcompat.app.AppCompatActivity r1 = r23.getActivity()
            r2 = 2131833426(0x7f113252, float:1.9299934E38)
            java.lang.String r2 = r0.getString(r2)
            gn1.c r3 = new gn1.c
            r3.<init>(r0)
            java.lang.String r5 = ""
            nj3.C76879j.m92749t(r1, r2, r5, r3)
            r0.f222831e = r4
            r0.f198088A = r9
            com.tencent.mm.plugin.finder.extension.reddot.o0$a r1 = com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12984a
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r23.getActivity()
            bl3.r$a r2 = r2.mo62444c(r3)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.s8 r2 = (rs1.C13442s8) r2
            te3.hj1 r2 = r2.mo12861q3()
            r1.mo2462l(r14, r2)
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.b4 r1 = r1.Nt0()
            java.lang.String r2 = "NearbyPeopleFooterprintClear"
            r1.mo77239M5(r2)
            goto L_0x0380
        L_0x02e9:
            int r6 = r6.mo75607f()
            if (r6 == r13) goto L_0x0309
            if (r6 == r14) goto L_0x02f7
            if (r6 == r12) goto L_0x0309
            if (r6 == r11) goto L_0x0309
            goto L_0x0380
        L_0x02f7:
            androidx.appcompat.app.AppCompatActivity r1 = r23.getActivity()
            r2 = 2131833425(0x7f113251, float:1.9299932E38)
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r13)
            r1.show()
            r0.f222831e = r4
            goto L_0x0380
        L_0x0309:
            android.view.View r6 = r23.getRootView()
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.TextView"
            gy3.C87412m.m108592e(r6, r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setVisibility(r9)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            di3.d r3 = di3.C86312j.m106911c(r3)
            lv.b r3 = (p601lv.C76726b) r3
            androidx.appcompat.app.AppCompatActivity r5 = r23.getActivity()
            r3.mo106910pd(r5)
            if (r26 == 0) goto L_0x033d
            int r3 = r26.length()
            if (r3 <= 0) goto L_0x0335
            r3 = 1
            goto L_0x0336
        L_0x0335:
            r3 = 0
        L_0x0336:
            if (r3 == 0) goto L_0x033d
            ei.a r3 = p148ei.C7660a.m7782a(r26)
            goto L_0x033e
        L_0x033d:
            r3 = r4
        L_0x033e:
            if (r3 == 0) goto L_0x0343
            java.lang.String r5 = r3.f26001b
            goto L_0x0344
        L_0x0343:
            r5 = r4
        L_0x0344:
            if (r5 == 0) goto L_0x035d
            java.lang.String r5 = r3.f26001b
            java.lang.String r7 = "br.desc"
            gy3.C87412m.m108593f(r5, r7)
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0354
            goto L_0x0355
        L_0x0354:
            r13 = 0
        L_0x0355:
            if (r13 == 0) goto L_0x035d
            java.lang.String r1 = r3.f26001b
            r6.setText(r1)
            goto L_0x0376
        L_0x035d:
            r3 = -2001(0xfffffffffffff82f, float:NaN)
            if (r1 != r3) goto L_0x036c
            r1 = 2131833428(0x7f113254, float:1.9299938E38)
            java.lang.String r1 = r0.getString(r1)
            r6.setText(r1)
            goto L_0x0376
        L_0x036c:
            r1 = 2131833432(0x7f113258, float:1.9299946E38)
            java.lang.String r1 = r0.getString(r1)
            r6.setText(r1)
        L_0x0376:
            android.widget.ListView r1 = r0.f198098h
            gy3.C87412m.m108591d(r1)
            r1.setVisibility(r2)
            r0.f222830d = r4
        L_0x0380:
            com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$d r1 = new com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$d
            r1.<init>(r0)
            o40.C61926c.m72668M(r1)
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void onStop() {
        super.onStop();
        mo94856d3();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUserVisibleFocused() {
        /*
            r9 = this;
            super.onUserVisibleFocused()
            eb0.o4 r0 = eb0.C75590o4.m90741b()
            boolean r1 = r9.f198092E
            r2 = 1
            if (r1 == 0) goto L_0x010e
            if (r0 == 0) goto L_0x010e
            java.lang.String r1 = r0.mo105937d()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x010e
            int r0 = r0.f222065b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r1)
            if (r0 != 0) goto L_0x0027
            goto L_0x010e
        L_0x0027:
            r9.f198090C = r2
            com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$g r0 = new com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$g
            r0.<init>(r9)
            com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$f r3 = new com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$f
            r3.<init>(r9)
            boolean r4 = r9.f198089B
            if (r4 != 0) goto L_0x00de
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            r5 = 4104(0x1008, float:5.751E-42)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Object r4 = r4.mo119684e(r5, r6)
            if (r4 == 0) goto L_0x0054
            boolean r5 = r4 instanceof java.lang.Boolean
            if (r5 == 0) goto L_0x0054
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x0055
        L_0x0054:
            r4 = 1
        L_0x0055:
            if (r4 == 0) goto L_0x00de
            androidx.appcompat.app.AppCompatActivity r4 = r9.getActivity()
            r5 = 2131496205(0x7f0c0d0d, float:1.8615968E38)
            r6 = 0
            android.view.View r4 = android.view.View.inflate(r4, r5, r6)
            androidx.appcompat.app.AppCompatActivity r5 = r9.getActivity()
            gn1.i r7 = new gn1.i
            r7.<init>(r0)
            gn1.j r0 = new gn1.j
            r0.<init>(r3)
            boolean r3 = r5 instanceof android.app.Activity
            if (r3 == 0) goto L_0x007c
            boolean r3 = r5.isFinishing()
            if (r3 == 0) goto L_0x007c
            goto L_0x00d1
        L_0x007c:
            qo3.a r3 = new qo3.a
            r3.<init>()
            r6 = 2131821704(0x7f110488, float:1.9276159E38)
            android.content.res.Resources r8 = al3.C0086a.m38a(r5)
            java.lang.String r6 = r8.getString(r6)
            r3.f225644a = r6
            r6 = -1
            android.content.res.Resources r8 = al3.C0086a.m38a(r5)
            java.lang.String r6 = r8.getString(r6)
            r3.f225660q = r6
            r3.f225627J = r4
            r4 = 2131821617(0x7f110431, float:1.9275982E38)
            android.content.res.Resources r6 = al3.C0086a.m38a(r5)
            java.lang.String r4 = r6.getString(r4)
            r3.f225663t = r4
            r3.f225620C = r7
            r4 = 2131820948(0x7f110194, float:1.9274625E38)
            android.content.res.Resources r6 = al3.C0086a.m38a(r5)
            java.lang.String r4 = r6.getString(r4)
            r3.f225664u = r4
            r3.f225621D = r0
            nj3.l r4 = new nj3.l
            r4.<init>(r0)
            r3.f225622E = r4
            qo3.g r6 = new qo3.g
            r0 = 2131887328(0x7f1204e0, float:1.940926E38)
            r6.<init>(r5, r0)
            r6.mo107525e(r3)
            r6.show()
            nj3.C76879j.m92730a(r5, r6)
        L_0x00d1:
            r6.show()
            ln1.d r0 = ln1.C21448d.f60723a
            r3 = 15
            r0.mo33624b(r3)
            r9.f198089B = r2
            goto L_0x00e1
        L_0x00de:
            r0.invoke()
        L_0x00e1:
            boolean r0 = r9.f198091D
            if (r0 != 0) goto L_0x00e8
            r9.mo94857e3()
        L_0x00e8:
            com.tencent.mm.plugin.finder.extension.reddot.o0$a r0 = com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12984a
            r2 = 3
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r4 = r9.getActivity()
            bl3.r$a r3 = r3.mo62444c(r4)
            java.lang.Class<rs1.s8> r4 = rs1.C13442s8.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            rs1.s8 r3 = (rs1.C13442s8) r3
            te3.hj1 r3 = r3.mo12861q3()
            r0.mo2462l(r2, r3)
            r9.f198091D = r1
            java.lang.String r0 = "NearbyPersonUIC"
            java.lang.String r1 = "onUserVisibleFocused"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x010e:
            r9.f198092E = r2
            android.app.Activity r0 = r9.getContext()
            java.lang.String r1 = "nearby"
            java.lang.String r2 = ".ui.NearbyPersonalInfoUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            r0 = 200(0xc8, double:9.9E-322)
            com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$e r2 = new com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$e
            r2.<init>(r9)
            o40.C61926c.m72666K(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC.onUserVisibleFocused():void");
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        this.f198090C = false;
        Log.m105924i("NearbyPersonUIC", "onUserVisibleUnFocused");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyPersonV1UIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        new LinkedList();
    }
}
