package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import fy0.C8219i;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import ic0.C21070h;
import j20.C117292a;
import java.util.LinkedList;
import jc0.C21210b;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import p823sg.C90193h;
import rr3.C110622b;
import rr3.C110625c0;
import rr3.C110632i;
import rx3.C13598b0;
import te3.C22508lo3;
import te3.C22521pi1;
import te3.C64627pd1;
import vp3.C65849b;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c3 */
public final class C18225c3 extends C18366u2 {

    /* renamed from: d */
    public final C18508z2 f50375d;

    /* renamed from: e */
    public final Context f50376e;

    /* renamed from: f */
    public View f50377f;

    /* renamed from: g */
    public int f50378g = 2004;

    /* renamed from: h */
    public C18227c f50379h;

    /* renamed from: i */
    public C18226a f50380i;

    /* renamed from: j */
    public C18226a f50381j;

    /* renamed from: k */
    public EffectManager f50382k = new EffectManager();

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c3$a */
    public final class C18226a extends C18230b {

        /* renamed from: b */
        public final View f50383b;

        /* renamed from: c */
        public final ImageView f50384c;

        /* renamed from: d */
        public final TextView f50385d;

        /* renamed from: e */
        public final TextView f50386e;

        /* renamed from: f */
        public final WeImageView f50387f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18226a(C18225c3 c3Var, View view, View view2) {
            super(c3Var, view);
            C87412m.m108594g(view, "parent");
            C87412m.m108594g(view2, "container");
            this.f50383b = view2;
            this.f50384c = (ImageView) view.findViewById(C0966R.C0970id.mng);
            this.f50385d = (TextView) view.findViewById(C0966R.C0970id.mnh);
            this.f50386e = (TextView) view.findViewById(C0966R.C0970id.mnj);
            this.f50387f = (WeImageView) view.findViewById(C0966R.C0970id.mnf);
            C46746a.m52038k(C46746a.f125826a, view, (float) C76577a.m92151b(c3Var.f50376e, 4), false, false, 12, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c3$c */
    public final class C18227c extends C18230b {

        /* renamed from: b */
        public final ImageView f50388b;

        /* renamed from: c */
        public final TextView f50389c;

        /* renamed from: d */
        public final TextView f50390d;

        /* renamed from: e */
        public final TextView f50391e;

        /* renamed from: f */
        public final WeImageView f50392f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18227c(C18225c3 c3Var, View view) {
            super(c3Var, view);
            C87412m.m108594g(view, "parent");
            this.f50388b = (ImageView) view.findViewById(C0966R.C0970id.mnm);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.mni);
            this.f50389c = textView;
            this.f50390d = (TextView) view.findViewById(C0966R.C0970id.mnh);
            this.f50391e = (TextView) view.findViewById(C0966R.C0970id.mnj);
            this.f50392f = (WeImageView) view.findViewById(C0966R.C0970id.mnl);
            C8219i.f27144a.mo9271b(textView);
            C46746a.m52038k(C46746a.f125826a, view, (float) C76577a.m92151b(c3Var.f50376e, 4), false, false, 12, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c3$d */
    public static final class C18228d implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ C18225c3 f50393a;

        /* renamed from: b */
        public final /* synthetic */ C18230b f50394b;

        /* renamed from: c */
        public final /* synthetic */ ImageView f50395c;

        /* renamed from: d */
        public final /* synthetic */ String f50396d;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c3$d$a */
        public static final class C18229a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C18225c3 f50397d;

            /* renamed from: e */
            public final /* synthetic */ C18230b f50398e;

            /* renamed from: f */
            public final /* synthetic */ C21210b f50399f;

            /* renamed from: g */
            public final /* synthetic */ ImageView f50400g;

            /* renamed from: h */
            public final /* synthetic */ String f50401h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18229a(C18225c3 c3Var, C18230b bVar, C21210b bVar2, ImageView imageView, String str) {
                super(0);
                this.f50397d = c3Var;
                this.f50398e = bVar;
                this.f50399f = bVar2;
                this.f50400g = imageView;
                this.f50401h = str;
            }

            public Object invoke() {
                C18225c3 c3Var = this.f50397d;
                C18230b bVar = this.f50398e;
                C21210b bVar2 = this.f50399f;
                c3Var.getClass();
                Log.m105924i("MicroMsg.BizTLRecFeedFinder", "onProcessLoadImageScale");
                Bitmap bitmap = bVar2.f59988d;
                if (bitmap == null) {
                    Log.m105924i("MicroMsg.BizTLRecFeedFinder", "imageData.bitmap == null");
                } else {
                    double width = ((double) bitmap.getWidth()) / ((double) bVar2.f59988d.getHeight());
                    if (bVar instanceof C18227c) {
                        C18227c cVar = (C18227c) bVar;
                        cVar.f50388b.setBackground(c3Var.f50376e.getDrawable(C0966R.color.ahf));
                        if (width >= 1.7477777777777777d) {
                            cVar.f50388b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        } else {
                            cVar.f50388b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        }
                        Log.m105924i("MicroMsg.BizTLRecFeedFinder", "realRatio_WH = " + width + ", promiseRatio = " + 1.7777777777777777d + ", scaleType = " + cVar.f50388b.getScaleType());
                    } else if (bVar instanceof C18226a) {
                        if (width <= 0.78d) {
                            ((C18226a) bVar).f50384c.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        } else {
                            ((C18226a) bVar).f50384c.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        }
                        Log.m105924i("MicroMsg.BizTLRecFeedFinder", "realRatio_WH = " + width + ", promiseRatio = " + 0.75d + ", scaleType = " + ((C18226a) bVar).f50384c.getScaleType());
                    }
                }
                if (this.f50400g.getScaleType() == ImageView.ScaleType.FIT_CENTER) {
                    C18225c3 c3Var2 = this.f50397d;
                    ImageView imageView = this.f50400g;
                    C21210b bVar3 = this.f50399f;
                    String str = this.f50401h;
                    c3Var2.getClass();
                    Log.m105924i("MicroMsg.BizTLRecFeedFinder", "onProcessBgBlur");
                    if (bVar3.f59988d == null) {
                        Log.m105924i("MicroMsg.BizTLRecFeedFinder", "imageData.bitmap == null");
                    } else {
                        byte[] bytes = str.getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        String f = C90193h.m112878f(bytes);
                        Bitmap e = C20828a.m22825b().mo32516e(f);
                        if (e != null) {
                            imageView.setImageBitmap(e);
                        } else {
                            C110625c0 g = c3Var2.f50382k.mo154927g(C110632i.f330995u);
                            C87412m.m108592e(g, "null cannot be cast to non-null type com.tencent.mm.xeffect.effect.BlurEffect");
                            C110622b bVar4 = (C110622b) g;
                            bVar4.mo162186d(80.0f);
                            bVar4.mo162187e(1.0f);
                            C65849b bVar5 = new C65849b();
                            Bitmap bitmap2 = bVar3.f59988d;
                            C87412m.m108593f(bitmap2, "imageData.bitmap");
                            bVar5.mo89891b(bitmap2);
                            int width2 = bVar3.f59988d.getWidth();
                            int height = bVar3.f59988d.getHeight();
                            bVar5.f189363b = width2;
                            bVar5.f189364c = height;
                            bVar5.f189366e.f334033b.mo154923c(bVar4);
                            bVar5.mo89890a(new C40688e3(c3Var2, imageView, bVar3, f));
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C18228d(C18225c3 c3Var, C18230b bVar, ImageView imageView, String str) {
            this.f50393a = c3Var;
            this.f50394b = bVar;
            this.f50395c = imageView;
            this.f50396d = str;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
            Log.m105924i("MicroMsg.BizTLRecFeedFinder", "onImageLoadStart");
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Log.m105924i("MicroMsg.BizTLRecFeedFinder", "onImageLoadFinish");
            if (bVar != null) {
                CommonKt.uiThread(new C18229a(this.f50393a, this.f50394b, bVar, this.f50395c, this.f50396d));
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c3$b */
    public class C18230b {

        /* renamed from: a */
        public final View f50402a;

        public C18230b(C18225c3 c3Var, View view) {
            C87412m.m108594g(view, "parent");
            this.f50402a = view;
        }

        /* renamed from: a */
        public final void mo22842a() {
            View view = this.f50402a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder$FinderViewGroup", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder$FinderViewGroup", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: b */
        public final void mo22843b() {
            View view = this.f50402a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder$FinderViewGroup", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder$FinderViewGroup", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C18225c3(C18508z2 z2Var, Context context) {
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f50375d = z2Var;
        this.f50376e = context;
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        int i2;
        C18226a aVar;
        View view3;
        C22508lo3 lo32;
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(view2, "parent");
        this.f50327a = o0Var;
        this.f50328b = i;
        if (this.f50377f == null) {
            View inflate = ((ViewStub) view2.findViewById(C0966R.C0970id.f359502mx2)).inflate();
            this.f50377f = inflate;
            C87412m.m108591d(inflate);
            View findViewById = inflate.findViewById(C0966R.C0970id.mns);
            View view4 = this.f50377f;
            C87412m.m108591d(view4);
            View findViewById2 = view4.findViewById(C0966R.C0970id.mnq);
            View view5 = this.f50377f;
            C87412m.m108591d(view5);
            View findViewById3 = view5.findViewById(C0966R.C0970id.mnr);
            View view6 = this.f50377f;
            C87412m.m108591d(view6);
            View findViewById4 = view6.findViewById(C0966R.C0970id.mnp);
            C87412m.m108593f(findViewById, "singleParent");
            this.f50379h = new C18227c(this, findViewById);
            C87412m.m108593f(findViewById2, "leftDualParent");
            C87412m.m108593f(findViewById4, "dualContainer");
            this.f50380i = new C18226a(this, findViewById2, findViewById4);
            C87412m.m108593f(findViewById3, "rightDualParent");
            this.f50381j = new C18226a(this, findViewById3, findViewById4);
        }
        View view7 = this.f50377f;
        C87412m.m108591d(view7);
        View findViewById5 = view7.findViewById(C0966R.C0970id.mnk);
        int i3 = this.f50328b;
        C18508z2 z2Var = this.f50375d;
        z2Var.getClass();
        int i4 = 0;
        if (i3 == (C18508z2.f51409I.mo23169c() ? ((LinkedList) z2Var.f51439g).size() + 1 : 0)) {
            i2 = 4;
        } else {
            C19623o0 q = this.f50375d.getItem(this.f50328b - 1);
            i2 = q != null && (lo32 = q.f55539x1) != null && lo32.f64173f == 2004 ? 8 : 0;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i2));
        View view8 = findViewById5;
        C117292a.m165358d(view8, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C64627pd1 pd12 = o0Var.f55539x1.f64172e.get(0).f64699q;
        C87412m.m108593f(pd12, "info.recFeed.RecommendItem[0].FinderInfo");
        int i5 = pd12.f184815d;
        if (i5 == 1) {
            C18226a aVar3 = this.f50381j;
            if (aVar3 != null) {
                aVar3.mo22842a();
            }
            C18226a aVar4 = this.f50380i;
            if (aVar4 != null) {
                aVar4.mo22842a();
            }
            C18227c cVar = this.f50379h;
            if (cVar != null) {
                cVar.mo22843b();
            }
            if (this.f50379h == null) {
                Log.m105928w("MicroMsg.BizTLRecFeedFinder", "singleGroup == null");
                return;
            }
            C22521pi1 first = pd12.f184816e.getFirst();
            C18227c cVar2 = this.f50379h;
            C87412m.m108591d(cVar2);
            ViewGroup.LayoutParams layoutParams = cVar2.f50402a.getLayoutParams();
            int g = C46746a.f125826a.mo71974g(this.f50376e) - C76577a.m92151b(this.f50376e, 32);
            layoutParams.width = g;
            layoutParams.height = (int) (((double) g) * 0.5625d);
            int i6 = cVar2.f50402a.getLayoutParams().width;
            int i7 = cVar2.f50402a.getLayoutParams().height;
            cVar2.f50389c.setText(first.f64433p);
            cVar2.f50390d.setText(first.f64425e);
            cVar2.f50391e.setText(first.f64413H);
            ImageView imageView = cVar2.f50388b;
            C87412m.m108593f(imageView, "coverIv");
            String str = first.f64434q;
            C87412m.m108593f(str, "singleFinderFeedsData.cover_img_url");
            mo22841i(cVar2, imageView, str);
            View view9 = cVar2.f50402a;
            if (view9 != null) {
                view9.setOnClickListener(new C18235d3(this, first, view9));
            }
            WeImageView weImageView = cVar2.f50392f;
            C87412m.m108593f(weImageView, "this.closeIv");
            mo22840h(weImageView);
        } else if (i5 != 2) {
            Log.m105928w("MicroMsg.BizTLRecFeedFinder", "finderMsg.sub_type illegal!");
        } else {
            C18226a aVar5 = this.f50381j;
            if (aVar5 != null) {
                aVar5.mo22843b();
            }
            C18226a aVar6 = this.f50380i;
            if (aVar6 != null) {
                aVar6.mo22843b();
            }
            C18227c cVar3 = this.f50379h;
            if (cVar3 != null) {
                cVar3.mo22842a();
            }
            if (this.f50380i == null || (aVar = this.f50381j) == null) {
                Log.m105928w("MicroMsg.BizTLRecFeedFinder", "dualGroup == null");
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = null;
            View view10 = aVar.f50402a;
            ViewGroup.LayoutParams layoutParams3 = view10 != null ? view10.getLayoutParams() : null;
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams3).addRule(21);
            C18226a aVar7 = this.f50380i;
            if (!(aVar7 == null || (view3 = aVar7.f50402a) == null)) {
                layoutParams2 = view3.getLayoutParams();
            }
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams2).addRule(20);
            C18226a[] aVarArr = {this.f50380i, this.f50381j};
            int i8 = 0;
            while (i4 < 2) {
                C18226a aVar8 = aVarArr[i4];
                int i9 = i8 + 1;
                C87412m.m108591d(aVar8);
                ViewGroup.LayoutParams layoutParams4 = aVar8.f50402a.getLayoutParams();
                double g2 = ((double) ((C46746a.f125826a.mo71974g(this.f50376e) - C76577a.m92151b(this.f50376e, 32)) - C76577a.m92151b(this.f50376e, 4))) / 2.0d;
                layoutParams4.width = (int) g2;
                layoutParams4.height = (int) (g2 * 1.3333333333333333d);
                int i15 = aVar8.f50402a.getLayoutParams().width;
                int i16 = aVar8.f50402a.getLayoutParams().height;
                C22521pi1 pi12 = pd12.f184816e.get(i8);
                aVar8.f50385d.setText(pi12.f64425e);
                aVar8.f50386e.setText(pi12.f64413H);
                ImageView imageView2 = aVar8.f50384c;
                C87412m.m108593f(imageView2, "dualViewGroup.coverIv");
                String str2 = pi12.f64434q;
                C87412m.m108593f(str2, "feedsData.cover_img_url");
                mo22841i(aVar8, imageView2, str2);
                View view11 = aVar8.f50402a;
                if (view11 != null) {
                    view11.setOnClickListener(new C18235d3(this, pi12, view11));
                }
                WeImageView weImageView2 = aVar8.f50387f;
                C87412m.m108593f(weImageView2, "dualViewGroup.closeIv");
                mo22840h(weImageView2);
                pi12.f64423S = i8;
                i4++;
                i8 = i9;
            }
        }
    }

    /* renamed from: b */
    public int mo22837b() {
        return this.f50378g;
    }

    /* renamed from: d */
    public void mo22838d() {
        View view = this.f50377f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public void mo22839g() {
        View view = this.f50377f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: h */
    public final void mo22840h(View view) {
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder", "bindCloseClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder", "bindCloseClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: i */
    public final void mo22841i(C18230b bVar, ImageView imageView, String str) {
        C20937c.C20939b bVar2 = new C20937c.C20939b();
        bVar2.f59361q = C0966R.C0969drawable.f4586h2;
        bVar2.f59347c = true;
        C20828a.m22825b().mo32520i(str, imageView, bVar2.mo32666a(), new C18228d(this, bVar, imageView, str));
    }
}
