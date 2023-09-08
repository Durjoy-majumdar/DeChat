package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import a14.C0000n0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.InputFilter;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C16569a;
import androidx.constraintlayout.widget.ConstraintLayout;
import by0.C16825a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.nativefinder.list.BizNativeFinderRecyclerView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.nativefinder.list.NativeFinderListHelper$initRv$buildItemConvert$1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.thumbplayer.api.ITPPlayer;
import cy0.C20371a;
import di3.C86312j;
import fy0.C8218c;
import fy0.C8219i;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hc0.C20937c;
import ht1.C60157c5;
import ht1.C60171g1;
import ht1.C60200t1;
import ic0.C21070h;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc0.C21210b;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import kw0.C46746a;
import o40.C61926c;
import ox0.C21905b;
import p629ny.C76979h;
import p823sg.C90193h;
import px0.C22039d;
import px0.C22043h;
import px0.C22049m;
import px0.C22050n;
import px0.C22051o;
import px0.C22055p;
import px0.C22058r;
import px0.C47538i;
import rb0.C48009v0;
import rr3.C110622b;
import rr3.C110625c0;
import rr3.C110632i;
import rx0.C22260f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C22521pi1;
import te3.C64846y23;
import te3.me4;
import te3.re4;
import vp3.C65849b;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1 */
public final class C18386y1 extends C18366u2 {

    /* renamed from: A */
    public Map<String, WeakReference<C60171g1>> f50951A = new LinkedHashMap();

    /* renamed from: B */
    public final C13601g f50952B = C36568h.m40985a(C18395e.f51000d);

    /* renamed from: C */
    public C60157c5 f50953C = new C18394f(this);

    /* renamed from: d */
    public final C18508z2 f50954d;

    /* renamed from: e */
    public final Context f50955e;

    /* renamed from: f */
    public View f50956f;

    /* renamed from: g */
    public View f50957g;

    /* renamed from: h */
    public C64846y23 f50958h;

    /* renamed from: i */
    public C19623o0 f50959i;

    /* renamed from: j */
    public int f50960j;

    /* renamed from: k */
    public EffectManager f50961k = new EffectManager();

    /* renamed from: l */
    public C22055p f50962l = new C22055p(this);

    /* renamed from: m */
    public TextView f50963m;

    /* renamed from: n */
    public TextView f50964n;

    /* renamed from: o */
    public TextView f50965o;

    /* renamed from: p */
    public TextView f50966p;

    /* renamed from: q */
    public TextView f50967q;

    /* renamed from: r */
    public C20371a f50968r;

    /* renamed from: s */
    public View f50969s;

    /* renamed from: t */
    public View f50970t;

    /* renamed from: u */
    public View f50971u;

    /* renamed from: v */
    public View f50972v;

    /* renamed from: w */
    public FrameLayout f50973w;

    /* renamed from: x */
    public int f50974x;

    /* renamed from: y */
    public int f50975y;

    /* renamed from: z */
    public C60171g1 f50976z;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$a */
    public static final class C18387a implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C22521pi1 f50977d;

        /* renamed from: e */
        public final /* synthetic */ C18386y1 f50978e;

        /* renamed from: f */
        public final /* synthetic */ View f50979f;

        /* renamed from: g */
        public final /* synthetic */ C19623o0 f50980g;

        /* renamed from: h */
        public final /* synthetic */ boolean f50981h;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$a$a */
        public static final class C18388a extends C87413o implements C32226l<C22521pi1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C18386y1 f50982d;

            /* renamed from: e */
            public final /* synthetic */ C19623o0 f50983e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18388a(C18386y1 y1Var, C19623o0 o0Var) {
                super(1);
                this.f50982d = y1Var;
                this.f50983e = o0Var;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C22521pi1) obj, LocaleUtil.ITALIAN);
                this.f50982d.mo22945m(this.f50983e);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$a$b */
        public static final class C18389b extends C87413o implements C32226l<C22521pi1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C22521pi1 f50984d;

            /* renamed from: e */
            public final /* synthetic */ C18386y1 f50985e;

            /* renamed from: f */
            public final /* synthetic */ C19623o0 f50986f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18389b(C22521pi1 pi12, C18386y1 y1Var, C19623o0 o0Var) {
                super(1);
                this.f50984d = pi12;
                this.f50985e = y1Var;
                this.f50986f = o0Var;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C22521pi1) obj, LocaleUtil.ITALIAN);
                C22521pi1 pi12 = this.f50984d;
                boolean z = true;
                if (pi12.f64411F == 1) {
                    C18386y1 y1Var = this.f50985e;
                    C19623o0 o0Var = this.f50986f;
                    y1Var.getClass();
                    if (o0Var != null) {
                        String str = pi12.f64435r;
                        if (!(str == null || str.length() == 0)) {
                            z = false;
                        }
                        long P = !z ? C61926c.m72671P(pi12.f64435r) : 0;
                        String str2 = pi12.f64432o;
                        C87412m.m108593f(str2, "targetUsername");
                        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76768Iz(str2, P);
                        y1Var.mo22945m(o0Var);
                    }
                } else {
                    C22058r rVar = C22058r.f62430a;
                    String str3 = pi12.f64426f;
                    C87412m.m108593f(str3, "finderRecommendData.username");
                    rVar.mo35168d(str3, this.f50985e.f50955e);
                }
                return C13598b0.f38549a;
            }
        }

        public C18387a(C22521pi1 pi12, C18386y1 y1Var, View view, C19623o0 o0Var, boolean z) {
            this.f50977d = pi12;
            this.f50978e = y1Var;
            this.f50979f = view;
            this.f50980g = o0Var;
            this.f50981h = z;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$bindBodyLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C22521pi1 pi12 = this.f50977d;
            boolean z = pi12.f64430j != 2;
            C18386y1 y1Var = this.f50978e;
            C22260f fVar = ((BizTimeLineUI) y1Var.f50955e).f50233d;
            int i = y1Var.f50328b;
            View view2 = this.f50979f;
            C19623o0 o0Var = this.f50980g;
            fVar.mo35420c(view2, o0Var, pi12, i, z, this.f50981h, new C18388a(y1Var, o0Var), new C18389b(this.f50977d, this.f50978e, this.f50980g));
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$bindBodyLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$b */
    public static final class C18390b extends C87413o implements C32229r<Boolean, Integer, C22521pi1, TextView, C13598b0> {

        /* renamed from: d */
        public static final C18390b f50987d = new C18390b();

        public C18390b() {
            super(4);
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int intValue = ((Number) obj2).intValue();
            C22521pi1 pi12 = (C22521pi1) obj3;
            TextView textView = (TextView) obj4;
            C87412m.m108594g(pi12, "finderRecData");
            if (!(intValue == 0 || textView == null)) {
                textView.setText(C92721n.m116876d(Math.max(pi12.f64440w - intValue, 0)));
                if (textView.getVisibility() != 0) {
                    textView.setVisibility(0);
                }
            }
            if (!booleanValue && textView != null) {
                textView.setText(C92721n.m116876d(pi12.f64440w));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$c */
    public static final class C18391c implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ C18386y1 f50988a;

        /* renamed from: b */
        public final /* synthetic */ ImageView f50989b;

        /* renamed from: c */
        public final /* synthetic */ C22521pi1 f50990c;

        /* renamed from: d */
        public final /* synthetic */ ImageView f50991d;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$c$a */
        public static final class C18392a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C18386y1 f50992d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f50993e;

            /* renamed from: f */
            public final /* synthetic */ C21210b f50994f;

            /* renamed from: g */
            public final /* synthetic */ C22521pi1 f50995g;

            /* renamed from: h */
            public final /* synthetic */ ImageView f50996h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18392a(C18386y1 y1Var, ImageView imageView, C21210b bVar, C22521pi1 pi12, ImageView imageView2) {
                super(0);
                this.f50992d = y1Var;
                this.f50993e = imageView;
                this.f50994f = bVar;
                this.f50995g = pi12;
                this.f50996h = imageView2;
            }

            public Object invoke() {
                double d;
                Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "onProcessLoadImageScale");
                C18386y1 y1Var = this.f50992d;
                ImageView imageView = this.f50993e;
                C21210b bVar = this.f50994f;
                y1Var.getClass();
                Bitmap bitmap = bVar.f59988d;
                if (bitmap == null) {
                    Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "imageData.bitmap == null");
                } else {
                    double width = ((double) bitmap.getWidth()) / ((double) bVar.f59988d.getHeight());
                    imageView.setBackground(y1Var.f50955e.getDrawable(C0966R.color.ahf));
                    C64846y23 y232 = y1Var.f50958h;
                    boolean z = true;
                    if (y232 == null || y232.f186438d != 1) {
                        z = false;
                    }
                    if (z) {
                        d = 1.7777777777777777d;
                        if (width >= 1.7477777777777777d) {
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        } else {
                            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        }
                    } else {
                        d = 0.75d;
                        if (width <= 0.78d) {
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        } else {
                            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        }
                    }
                    Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "realRatio_WH = " + width + ", promiseRatio = " + d + ", scaleType = " + imageView.getScaleType());
                }
                if (this.f50993e.getScaleType() == ImageView.ScaleType.FIT_CENTER) {
                    Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "onProcessBgBlur");
                    C18386y1 y1Var2 = this.f50992d;
                    ImageView imageView2 = this.f50996h;
                    C21210b bVar2 = this.f50994f;
                    C22521pi1 pi12 = this.f50995g;
                    y1Var2.getClass();
                    if (bVar2.f59988d == null) {
                        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "imageData.bitmap == null");
                    } else {
                        imageView2.setScaleType(ImageView.ScaleType.MATRIX);
                        Matrix matrix = new Matrix();
                        float width2 = ((float) y1Var2.f50974x) / ((float) bVar2.f59988d.getWidth());
                        float height = ((float) y1Var2.f50975y) / ((float) bVar2.f59988d.getHeight());
                        if (width2 <= height) {
                            width2 = height;
                        }
                        matrix.setScale(width2, width2, 0.0f, 0.0f);
                        imageView2.setImageMatrix(matrix);
                        String str = pi12.f64434q;
                        C87412m.m108593f(str, "finderRecommendData.cover_img_url");
                        byte[] bytes = str.getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        String f = C90193h.m112878f(bytes);
                        Bitmap e = C20828a.m22825b().mo32516e(f);
                        if (e != null) {
                            imageView2.setImageBitmap(e);
                        } else {
                            C110625c0 g = y1Var2.f50961k.mo154927g(C110632i.f330995u);
                            C87412m.m108592e(g, "null cannot be cast to non-null type com.tencent.mm.xeffect.effect.BlurEffect");
                            C110622b bVar3 = (C110622b) g;
                            bVar3.mo162186d(80.0f);
                            bVar3.mo162187e(1.0f);
                            C65849b bVar4 = new C65849b();
                            Bitmap bitmap2 = bVar2.f59988d;
                            C87412m.m108593f(bitmap2, "imageData.bitmap");
                            bVar4.mo89891b(bitmap2);
                            int width3 = bVar2.f59988d.getWidth();
                            int height2 = bVar2.f59988d.getHeight();
                            bVar4.f189363b = width3;
                            bVar4.f189364c = height2;
                            bVar4.f189366e.f334033b.mo154923c(bVar3);
                            bVar4.mo89890a(new C40687c2(f, imageView2));
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C18391c(C18386y1 y1Var, ImageView imageView, C22521pi1 pi12, ImageView imageView2) {
            this.f50988a = y1Var;
            this.f50989b = imageView;
            this.f50990c = pi12;
            this.f50991d = imageView2;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
            Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "onImageLoadStart");
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "onImageLoadFinish");
            if (bVar != null) {
                C61926c.m72668M(new C18392a(this.f50988a, this.f50989b, bVar, this.f50990c, this.f50991d));
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardNativeFinder$setVideoStatus$1", mo125469f = "BizTLRecCardNativeFinder.kt", mo125470l = {519}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$d */
    public static final class C18393d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f50997d;

        /* renamed from: e */
        public final /* synthetic */ C18386y1 f50998e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18393d(C18386y1 y1Var, C15601d<? super C18393d> dVar) {
            super(2, dVar);
            this.f50998e = y1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C18393d(this.f50998e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C18393d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            LinkedList<C22521pi1> linkedList;
            C22521pi1 first;
            LinkedList<C22521pi1> linkedList2;
            View videoView;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f50997d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C18386y1 y1Var = this.f50998e;
                this.f50997d = 1;
                obj = C18386y1.m18968h(y1Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C60171g1 g1Var = (C60171g1) obj;
            C21905b bVar = C21905b.f61956a;
            FrameLayout frameLayout = this.f50998e.f50973w;
            View view = null;
            if (!(g1Var == null || (videoView = g1Var.getVideoView()) == null || C87412m.m108589b(videoView.getParent(), frameLayout))) {
                ViewParent parent = videoView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(videoView);
                }
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                if (frameLayout != null) {
                    frameLayout.addView(videoView);
                }
            }
            if (!(g1Var != null && g1Var.isPlaying())) {
                C18386y1 y1Var2 = this.f50998e;
                C20371a aVar2 = new C20371a();
                y1Var2.f50968r = aVar2;
                C19623o0 o0Var = y1Var2.f50959i;
                C64846y23 y232 = y1Var2.f50958h;
                int i2 = y1Var2.f50960j;
                aVar2.f57075a = o0Var;
                Integer valueOf = y232 != null ? Integer.valueOf(y232.f186438d) : null;
                if (valueOf != null && valueOf.intValue() == 1) {
                    if (!(((y232 == null || (linkedList2 = y232.f186439e) == null || linkedList2.size() != 0) ? false : true) || y232 == null || (linkedList = y232.f186439e) == null || (first = linkedList.getFirst()) == null)) {
                        C20371a aVar3 = y1Var2.f50968r;
                        if (aVar3 != null) {
                            String str = first.f64431n;
                            C87412m.m108593f(str, "feed.finder_uin");
                            aVar3.f57077c = str;
                        }
                        C20371a aVar4 = y1Var2.f50968r;
                        if (aVar4 != null) {
                            String str2 = first.f64435r;
                            C87412m.m108593f(str2, "feed.finder_object_id");
                            aVar4.f57078d = str2;
                        }
                        C20371a aVar5 = y1Var2.f50968r;
                        if (aVar5 != null) {
                            aVar5.f57081g = ((long) first.f64440w) * ((long) 1000);
                        }
                    }
                } else if ((valueOf == null || valueOf.intValue() != 2) && valueOf != null) {
                    valueOf.intValue();
                }
                C20371a aVar6 = this.f50998e.f50968r;
                if (aVar6 != null) {
                    aVar6.f57082h = System.currentTimeMillis();
                }
                C20371a aVar7 = this.f50998e.f50968r;
                if (aVar7 != null) {
                    aVar7.f57076b = System.nanoTime();
                }
                if (g1Var != null) {
                    g1Var.setMute(true);
                }
                if (g1Var != null) {
                    C60171g1.C8767a.m8577a(g1Var, (Integer) null, 1, (Object) null);
                }
                C60171g1 g1Var2 = this.f50998e.f50976z;
                if (g1Var2 != null) {
                    view = g1Var2.getVideoView();
                }
                if (view != null) {
                    C9556a aVar8 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar8.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar8.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$setVideoStatus$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$setVideoStatus$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$f */
    public static final class C18394f implements C60157c5 {

        /* renamed from: d */
        public final /* synthetic */ C18386y1 f50999d;

        public C18394f(C18386y1 y1Var) {
            this.f50999d = y1Var;
        }

        /* renamed from: F */
        public void mo22955F(String str, String str2) {
            C20371a aVar = this.f50999d.f50968r;
            if (aVar != null) {
                aVar.f57085k = System.currentTimeMillis();
            }
            C20371a aVar2 = this.f50999d.f50968r;
            if (aVar2 != null) {
                aVar2.mo31866a(5);
            }
        }

        /* renamed from: I1 */
        public void mo22956I1(String str, String str2) {
        }

        /* renamed from: I3 */
        public void mo22957I3(String str, String str2, Boolean bool) {
            bool.booleanValue();
            C20371a aVar = this.f50999d.f50968r;
            if (aVar != null) {
                aVar.f57084j = System.currentTimeMillis();
            }
        }

        /* renamed from: L */
        public void mo22958L(String str, String str2) {
            this.f50999d.getClass();
            this.f50999d.mo22950r(false, 0);
        }

        /* renamed from: M5 */
        public void mo22959M5(int i, int i2) {
            this.f50999d.mo22950r(true, i);
        }

        /* renamed from: T */
        public void mo22960T(String str, String str2, String str3, int i, int i2) {
            this.f50999d.getClass();
            this.f50999d.mo22950r(false, 0);
        }

        /* renamed from: V5 */
        public void mo22961V5(String str, String str2, int i, int i2, int i3) {
        }

        /* renamed from: Z */
        public void mo22962Z(String str, String str2) {
        }

        /* renamed from: a0 */
        public void mo22963a0(String str, String str2) {
            this.f50999d.getClass();
            this.f50999d.mo22950r(false, 0);
        }

        /* renamed from: l0 */
        public void mo22964l0(String str, String str2, int i, int i2) {
        }

        /* renamed from: m0 */
        public void mo22965m0(String str, String str2) {
            this.f50999d.getClass();
            this.f50999d.mo22950r(true, 0);
            C20371a aVar = this.f50999d.f50968r;
            if (aVar != null) {
                aVar.f57083i = System.currentTimeMillis();
            }
            C20371a aVar2 = this.f50999d.f50968r;
            if (aVar2 != null) {
                aVar2.mo31866a(1);
            }
            C20371a aVar3 = this.f50999d.f50968r;
            if (aVar3 != null) {
                aVar3.mo31866a(2);
            }
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$e */
    public static final class C18395e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C18395e f51000d = new C18395e();

        public C18395e() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_biz_timeline_native_finder_single_large_new, 0) == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C18386y1(C18508z2 z2Var, Context context) {
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f50954d = z2Var;
        this.f50955e = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r5 = r5.f186439e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m18968h(com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18386y1 r4, wx3.C15601d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18215b2
            if (r0 == 0) goto L_0x0016
            r0 = r5
            com.tencent.mm.plugin.brandservice.ui.timeline.item.b2 r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18215b2) r0
            int r1 = r0.f50354i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f50354i = r1
            goto L_0x001b
        L_0x0016:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.b2 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.b2
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.f50352g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f50354i
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r4 = r0.f50351f
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y1 r4 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18386y1) r4
            java.lang.Object r1 = r0.f50350e
            te3.pi1 r1 = (te3.C22521pi1) r1
            java.lang.Object r0 = r0.f50349d
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y1 r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18386y1) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0079
        L_0x0036:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r5)
            ht1.g1 r5 = r4.f50976z
            if (r5 != 0) goto L_0x0093
            te3.y23 r5 = r4.f50958h
            if (r5 == 0) goto L_0x0052
            java.util.LinkedList<te3.pi1> r5 = r5.f186439e
            if (r5 == 0) goto L_0x0052
            int r5 = r5.size()
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            if (r5 <= 0) goto L_0x0093
            te3.y23 r5 = r4.f50958h
            if (r5 == 0) goto L_0x0064
            java.util.LinkedList<te3.pi1> r5 = r5.f186439e
            if (r5 == 0) goto L_0x0064
            java.lang.Object r5 = r5.getFirst()
            te3.pi1 r5 = (te3.C22521pi1) r5
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            ox0.b r2 = ox0.C21905b.f61956a
            r0.f50349d = r4
            r0.f50350e = r5
            r0.f50351f = r4
            r0.f50354i = r3
            java.lang.Object r0 = r2.mo34946a(r5, r0)
            if (r0 != r1) goto L_0x0076
            goto L_0x009e
        L_0x0076:
            r1 = r5
            r5 = r0
            r0 = r4
        L_0x0079:
            ht1.g1 r5 = (ht1.C60171g1) r5
            r4.f50976z = r5
            if (r1 == 0) goto L_0x0092
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<ht1.g1>> r4 = r0.f50951A
            java.lang.String r5 = r1.f64435r
            java.lang.String r1 = "finderData.finder_object_id"
            gy3.C87412m.m108593f(r5, r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            ht1.g1 r2 = r0.f50976z
            r1.<init>(r2)
            r4.put(r5, r1)
        L_0x0092:
            r4 = r0
        L_0x0093:
            ht1.g1 r5 = r4.f50976z
            if (r5 == 0) goto L_0x009c
            ht1.c5 r0 = r4.f50953C
            r5.setIMMVideoViewCallback(r0)
        L_0x009c:
            ht1.g1 r1 = r4.f50976z
        L_0x009e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18386y1.m18968h(com.tencent.mm.plugin.brandservice.ui.timeline.item.y1, wx3.d):java.lang.Object");
    }

    /* renamed from: j */
    public static /* synthetic */ void m18969j(C18386y1 y1Var, View view, View view2, C19623o0 o0Var, C22521pi1 pi12, boolean z, int i, Object obj) {
        y1Var.mo22942i(view, view2, o0Var, pi12, (i & 16) != 0 ? true : z);
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        boolean z;
        ImageView imageView;
        TextView textView;
        View view3;
        TextView textView2;
        TextView textView3;
        int i2;
        TextView textView4;
        TextView textView5;
        int i3;
        TextView textView6;
        TextView textView7;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        LinkedList<C22521pi1> linkedList;
        Integer num;
        TextView textView8;
        MMNeat7extView mMNeat7extView;
        int i4;
        int i5;
        TextView textView9;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        LinkedList<C22521pi1> linkedList2;
        String str;
        C19623o0 o0Var2 = o0Var;
        View view4 = view2;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(view4, "parent");
        this.f50957g = view4;
        if (this.f50956f == null) {
            View inflate = ((ViewStub) view4.findViewById(C0966R.C0970id.mih)).inflate();
            this.f50970t = inflate.findViewById(C0966R.C0970id.mfy);
            this.f50969s = inflate.findViewById(C0966R.C0970id.mg9);
            this.f50972v = inflate.findViewById(C0966R.C0970id.nxh);
            this.f50973w = mo22948p() ? (FrameLayout) inflate.findViewById(C0966R.C0970id.nxg) : (FrameLayout) inflate.findViewById(C0966R.C0970id.nxe);
            this.f50956f = inflate;
        }
        View view5 = this.f50956f;
        if (view5 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (C16825a.f45444a.mo17865c()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : C16825a.f45450g.entrySet()) {
                if (C87412m.m108589b(((WeakReference) next.getValue()).get(), this)) {
                    Object key = next.getKey();
                    C87412m.m108593f(key, "entry.key");
                    arrayList.add(key);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C16825a.f45450g.remove(Long.valueOf(((Number) it.next()).longValue()));
            }
        }
        if (o0Var.mo25774x2().f64529u.f186439e.size() > 0) {
            C64846y23 y232 = o0Var.mo25774x2().f64529u;
            this.f50958h = y232;
            if (y232 != null) {
                LinkedList<C22521pi1> linkedList3 = y232.f186439e;
                C87412m.m108593f(linkedList3, "finderFeeds.finder_feeds");
                for (T t : C110818d0.m150947s0(linkedList3, 2)) {
                    if (Util.isNullOrNil(t.f64426f) && (t.f64411F == 0 || Util.isNullOrNil(t.f64432o))) {
                        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "finder identity check fail");
                    } else if (Util.isNullOrNil(t.f64425e)) {
                        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "username or nickname is null");
                    } else if (Util.isNullOrNil(t.f64434q)) {
                        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "cover_img_url is null");
                    } else if (Util.isNullOrNil(t.f64436s)) {
                        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "finder_export_id is null");
                    } else if (Util.isNullOrNil(t.f64432o)) {
                        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "finder_encrypt_user_name is null");
                    } else if (Util.isNullOrNil(t.f64437t)) {
                        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "finder_object_nonce_id is null");
                    }
                    z = false;
                }
                z = true;
                if (z) {
                    C64846y23 y233 = this.f50958h;
                    if (y233 != null) {
                        String str2 = "NecessaryInfo: style = " + y233.f186438d;
                        C64846y23 y234 = this.f50958h;
                        C87412m.m108591d(y234);
                        LinkedList<C22521pi1> linkedList4 = y234.f186439e;
                        C87412m.m108593f(linkedList4, "nativeFinderFeedData!!.finder_feeds");
                        int i6 = 0;
                        for (T next2 : linkedList4) {
                            int i7 = i6 + 1;
                            if (i6 >= 0) {
                                C22521pi1 pi12 = (C22521pi1) next2;
                                str2 = str2 + " |||| index = " + i6 + ", title = " + pi12.f64433p + ", delete = " + pi12.f64422R + ", nickname = " + pi12.f64425e + ", coverUrl = " + pi12.f64434q + ", duration = " + pi12.f64440w + ", showFinder = " + pi12.f64411F;
                                i6 = i7;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", str2);
                    }
                    this.f50959i = o0Var2;
                    this.f50960j = i;
                    C60171g1 g1Var = this.f50976z;
                    if (g1Var != null) {
                        C21905b bVar = C21905b.f61956a;
                        Object obj = C21905b.f61957b;
                        synchronized (obj) {
                            str = (String) ((LinkedHashMap) C21905b.f61958c).get(new C21905b.C21907a(g1Var));
                            if (str == null) {
                                str = "";
                            }
                        }
                        C64846y23 y235 = this.f50958h;
                        C87412m.m108591d(y235);
                        if (!C87412m.m108589b(str, y235.f186439e.getFirst().f64435r)) {
                            FrameLayout frameLayout = this.f50973w;
                            if (!(frameLayout != null && frameLayout.indexOfChild(g1Var.getVideoView()) == -1)) {
                                FrameLayout frameLayout2 = this.f50973w;
                                if (frameLayout2 != null) {
                                    frameLayout2.removeView(g1Var.getVideoView());
                                }
                                synchronized (obj) {
                                    int size = C21905b.f61959d.size();
                                    Set<C60171g1> set = C21905b.f61960e;
                                    if (size + set.size() < 7) {
                                        Log.m105924i("MicroMsg.BizTimeLineFinderPlayerHelper", "[takeOver] stash to unuse cache");
                                        g1Var.stop();
                                        set.add(g1Var);
                                    } else {
                                        Log.m105924i("MicroMsg.BizTimeLineFinderPlayerHelper", "[takeOver] reach max cache count, destroy player");
                                        g1Var.mo78608c();
                                        g1Var.mo78609d();
                                        C13598b0 b0Var = C13598b0.f38549a;
                                    }
                                }
                                this.f50976z = null;
                            }
                        }
                    }
                    C64846y23 y236 = this.f50958h;
                    Integer valueOf = y236 != null ? Integer.valueOf(y236.f186438d) : null;
                    if (valueOf != null && valueOf.intValue() == 1) {
                        if (mo22948p()) {
                            View view7 = this.f50970t;
                            if (view7 == null) {
                                num = 8;
                            } else {
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar2.mo10233c(8);
                                View view8 = view7;
                                num = 8;
                                C117292a.m165358d(view8, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleMPStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view8, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleMPStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            View view9 = this.f50969s;
                            if (view9 != null) {
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                aVar3.mo10233c(num);
                                View view10 = view9;
                                C117292a.m165358d(view10, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleMPStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view9.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view10, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleMPStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            View view11 = this.f50971u;
                            if (view11 != null) {
                                C9556a aVar4 = new C9556a();
                                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                                aVar4.mo10233c(num);
                                View view12 = view11;
                                C117292a.m165358d(view12, aVar4.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleMPStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view11.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view12, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleMPStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            View view13 = this.f50972v;
                            if (view13 != null) {
                                C9556a aVar5 = new C9556a();
                                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                                aVar5.mo10233c(0);
                                View view14 = view13;
                                C117292a.m165358d(view14, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleMPStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view13.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                C117292a.m165359e(view14, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleMPStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "fillSingleMPStyle");
                            C64846y23 y237 = this.f50958h;
                            C22521pi1 first = (y237 == null || (linkedList2 = y237.f186439e) == null) ? null : linkedList2.getFirst();
                            if (first == null) {
                                Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "finderRecData illegal");
                                mo22945m(o0Var);
                            } else {
                                View view15 = this.f50956f;
                                ViewGroup.LayoutParams layoutParams5 = view15 != null ? view15.getLayoutParams() : null;
                                LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
                                if (layoutParams6 != null) {
                                    layoutParams6.setMargins(C76577a.m92151b(this.f50955e, 8), 0, C76577a.m92151b(this.f50955e, 8), 0);
                                }
                                if (!C18355t.m18925d(first)) {
                                    Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "large card, userHasUnfollow");
                                    mo22945m(o0Var);
                                } else {
                                    View view16 = this.f50972v;
                                    View findViewById = view16 != null ? view16.findViewById(C0966R.C0970id.nrp) : null;
                                    View view17 = this.f50972v;
                                    View findViewById2 = view17 != null ? view17.findViewById(C0966R.C0970id.nrj) : null;
                                    View view18 = this.f50972v;
                                    View findViewById3 = view18 != null ? view18.findViewById(C0966R.C0970id.nrm) : null;
                                    View view19 = this.f50972v;
                                    ImageView imageView2 = view19 != null ? (ImageView) view19.findViewById(C0966R.C0970id.nro) : null;
                                    View view20 = this.f50972v;
                                    TextView textView10 = view20 != null ? (TextView) view20.findViewById(C0966R.C0970id.nrr) : null;
                                    View view21 = this.f50972v;
                                    TextView textView11 = view21 != null ? (TextView) view21.findViewById(C0966R.C0970id.nrs) : null;
                                    View view22 = this.f50972v;
                                    ImageView imageView3 = view22 != null ? (ImageView) view22.findViewById(C0966R.C0970id.nrk) : null;
                                    View view23 = this.f50972v;
                                    ImageView imageView4 = view23 != null ? (ImageView) view23.findViewById(C0966R.C0970id.nrl) : null;
                                    View view24 = this.f50972v;
                                    this.f50967q = view24 != null ? (TextView) view24.findViewById(C0966R.C0970id.hx8) : null;
                                    View view25 = this.f50972v;
                                    MMNeat7extView mMNeat7extView2 = view25 != null ? (MMNeat7extView) view25.findViewById(C0966R.C0970id.nrt) : null;
                                    View view26 = this.f50972v;
                                    TextView textView12 = view26 != null ? (TextView) view26.findViewById(C0966R.C0970id.nrn) : null;
                                    View view27 = this.f50972v;
                                    ImageView imageView5 = view27 != null ? (ImageView) view27.findViewById(C0966R.C0970id.o9q) : null;
                                    View view28 = this.f50972v;
                                    ImageView imageView6 = imageView5;
                                    TextView textView13 = view28 != null ? (TextView) view28.findViewById(C0966R.C0970id.o9s) : null;
                                    View view29 = this.f50972v;
                                    TextView textView14 = textView13;
                                    ImageView imageView7 = view29 != null ? (ImageView) view29.findViewById(C0966R.C0970id.o9r) : null;
                                    C46746a aVar6 = C46746a.f125826a;
                                    ImageView imageView8 = imageView7;
                                    C46746a aVar7 = aVar6;
                                    this.f50974x = aVar6.mo71974g(this.f50955e) - mo22953u(16);
                                    if (findViewById3 == null || (layoutParams4 = findViewById3.getLayoutParams()) == null) {
                                        mMNeat7extView = mMNeat7extView2;
                                        textView8 = textView12;
                                    } else {
                                        int i8 = this.f50974x;
                                        layoutParams4.width = i8;
                                        mMNeat7extView = mMNeat7extView2;
                                        textView8 = textView12;
                                        int i9 = (int) (((double) i8) / 1.7777777777777777d);
                                        layoutParams4.height = i9;
                                        this.f50975y = i9;
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("bodyContainer width = ");
                                    sb.append(this.f50974x);
                                    sb.append(", height = ");
                                    sb.append((findViewById2 == null || (layoutParams3 = findViewById2.getLayoutParams()) == null) ? null : Integer.valueOf(layoutParams3.height));
                                    Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", sb.toString());
                                    C20937c.C20939b bVar2 = new C20937c.C20939b();
                                    bVar2.f59361q = C0966R.C0969drawable.be5;
                                    bVar2.f59347c = true;
                                    bVar2.f59364t = true;
                                    C20828a.m22825b().mo32519h(first.f64424d, imageView2, bVar2.mo32666a());
                                    if (textView10 != null) {
                                        textView10.setText(first.f64425e);
                                    }
                                    C8219i.f27144a.mo9271b(textView10);
                                    if (findViewById != null) {
                                        findViewById.setOnTouchListener(new C2107a2(textView10));
                                    }
                                    if (textView11 != null) {
                                        if (C19636w0.m21172n()) {
                                            long j = ((long) first.f64410E) * ((long) 1000);
                                            if (j > 0) {
                                                textView11.setVisibility(0);
                                                textView11.setText(C8218c.m8301a(textView11.getContext(), j));
                                            } else {
                                                textView11.setVisibility(8);
                                            }
                                        } else {
                                            textView11.setVisibility(0);
                                            textView11.setText(Util.nullAsNil(o0Var2.field_recommendReason));
                                            textView11.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
                                            textView11.setMaxEms(8);
                                        }
                                    }
                                    mo22952t(imageView3, imageView4, first);
                                    TextView textView15 = this.f50967q;
                                    if (textView15 != null) {
                                        textView15.setText(C92721n.m116876d(first.f64440w));
                                    }
                                    if (mMNeat7extView != null) {
                                        String str3 = first.f64433p;
                                        C87412m.m108593f(str3, "finderRecData.title");
                                        mMNeat7extView.mo104279b(mo22949q(str3));
                                    }
                                    if (Util.isNullOrNil(first.f64413H)) {
                                        if (textView8 != null) {
                                            textView8.setVisibility(8);
                                        }
                                        i4 = 0;
                                    } else {
                                        TextView textView16 = textView8;
                                        if (textView16 == null) {
                                            i4 = 0;
                                        } else {
                                            i4 = 0;
                                            textView16.setVisibility(0);
                                        }
                                        if (textView16 != null) {
                                            textView16.setText(first.f64413H);
                                        }
                                    }
                                    if (first.f64421Q != 0) {
                                        if (imageView6 != null) {
                                            imageView6.setVisibility(i4);
                                        }
                                        if (textView14 == null) {
                                            textView9 = textView14;
                                        } else {
                                            textView9 = textView14;
                                            textView9.setVisibility(i4);
                                        }
                                        if (imageView8 != null) {
                                            imageView8.setVisibility(i4);
                                        }
                                        if (textView9 != null) {
                                            textView9.setText(this.f50955e.getResources().getString(C0966R.string.f360193ct0));
                                        }
                                        i5 = 8;
                                    } else {
                                        ImageView imageView9 = imageView6;
                                        TextView textView17 = textView14;
                                        ImageView imageView10 = imageView8;
                                        if (imageView9 == null) {
                                            i5 = 8;
                                        } else {
                                            i5 = 8;
                                            imageView9.setVisibility(8);
                                        }
                                        if (textView17 != null) {
                                            textView17.setVisibility(i5);
                                        }
                                        if (imageView10 != null) {
                                            imageView10.setVisibility(i5);
                                        }
                                    }
                                    aVar7.mo71977j(this.f50972v, (float) mo22953u(i5), true, true);
                                    if (findViewById != null) {
                                        findViewById.setOnClickListener(new C18400z1(first, this, o0Var2));
                                    }
                                    if (findViewById2 != null) {
                                        findViewById2.setOnClickListener(new C18382x1(this, first, findViewById2));
                                    }
                                    C19623o0 o0Var3 = o0Var;
                                    C22521pi1 pi13 = first;
                                    m18969j(this, findViewById2, findViewById2, o0Var3, pi13, false, 16, (Object) null);
                                    mo22942i(findViewById, this.f50972v, o0Var3, pi13, false);
                                    this.f50954d.f51453x.mo34948a(first, 25);
                                }
                            }
                        } else {
                            View view30 = this.f50970t;
                            if (view30 != null) {
                                C9556a aVar8 = new C9556a();
                                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                                aVar8.mo10233c(8);
                                View view31 = view30;
                                C117292a.m165358d(view31, aVar8.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view30.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                                C117292a.m165359e(view31, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            View view32 = this.f50969s;
                            if (view32 != null) {
                                C9556a aVar9 = new C9556a();
                                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                                aVar9.mo10233c(0);
                                View view33 = view32;
                                C117292a.m165358d(view33, aVar9.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view32.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                                C117292a.m165359e(view33, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            View view34 = this.f50971u;
                            if (view34 != null) {
                                C9556a aVar10 = new C9556a();
                                ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                                aVar10.mo10233c(8);
                                View view35 = view34;
                                C117292a.m165358d(view35, aVar10.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view34.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                                C117292a.m165359e(view35, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            View view36 = this.f50972v;
                            if (view36 != null) {
                                C9556a aVar11 = new C9556a();
                                ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                                aVar11.mo10233c(8);
                                View view37 = view36;
                                C117292a.m165358d(view37, aVar11.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view36.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                                C117292a.m165359e(view37, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "fillSingleLargeStyle");
                            C64846y23 y238 = this.f50958h;
                            C22521pi1 first2 = (y238 == null || (linkedList = y238.f186439e) == null) ? null : linkedList.getFirst();
                            if (first2 == null) {
                                Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "finderRecData illegal");
                                mo22945m(o0Var);
                            } else {
                                View view38 = this.f50956f;
                                ViewGroup.LayoutParams layoutParams7 = view38 != null ? view38.getLayoutParams() : null;
                                LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams7 : null;
                                if (layoutParams8 != null) {
                                    layoutParams8.setMargins(C76577a.m92151b(this.f50955e, 8), 0, C76577a.m92151b(this.f50955e, 8), 0);
                                }
                                if (!C18355t.m18925d(first2)) {
                                    Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "large card, userHasUnfollow");
                                    mo22945m(o0Var);
                                    C18355t.m18926e(first2, this.f50954d.f51436d.f50208A);
                                } else {
                                    View view39 = this.f50969s;
                                    ImageView imageView11 = view39 != null ? (ImageView) view39.findViewById(C0966R.C0970id.mfr) : null;
                                    View view40 = this.f50969s;
                                    TextView textView18 = view40 != null ? (TextView) view40.findViewById(C0966R.C0970id.mg8) : null;
                                    View view41 = this.f50969s;
                                    ImageView imageView12 = view41 != null ? (ImageView) view41.findViewById(C0966R.C0970id.mfu) : null;
                                    View view42 = this.f50969s;
                                    View findViewById4 = view42 != null ? view42.findViewById(C0966R.C0970id.mfx) : null;
                                    View view43 = this.f50969s;
                                    View findViewById5 = view43 != null ? view43.findViewById(C0966R.C0970id.mag) : null;
                                    View view44 = this.f50969s;
                                    View findViewById6 = view44 != null ? view44.findViewById(C0966R.C0970id.maf) : null;
                                    View view45 = this.f50969s;
                                    View findViewById7 = view45 != null ? view45.findViewById(C0966R.C0970id.hx9) : null;
                                    this.f50974x = C46746a.f125826a.mo71974g(this.f50955e) - mo22953u(16);
                                    if (!(findViewById5 == null || (layoutParams2 = findViewById5.getLayoutParams()) == null)) {
                                        int i15 = this.f50974x;
                                        layoutParams2.width = i15;
                                        int i16 = (int) (((double) i15) / 1.7777777777777777d);
                                        layoutParams2.height = i16;
                                        this.f50975y = i16;
                                    }
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("bodyContainer width = ");
                                    sb4.append(this.f50974x);
                                    sb4.append(", height = ");
                                    sb4.append((findViewById5 == null || (layoutParams = findViewById5.getLayoutParams()) == null) ? null : Integer.valueOf(layoutParams.height));
                                    Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", sb4.toString());
                                    if (findViewById6 == null || (textView7 = (TextView) findViewById6.findViewById(C0966R.C0970id.mg_)) == null) {
                                        textView = textView18;
                                        imageView = imageView12;
                                    } else {
                                        textView = textView18;
                                        imageView = imageView12;
                                        long j2 = ((long) first2.f64410E) * ((long) 1000);
                                        if (j2 > 0) {
                                            textView7.setVisibility(0);
                                            textView7.setText(C8218c.m8301a(textView7.getContext(), j2));
                                        } else {
                                            textView7.setVisibility(8);
                                        }
                                    }
                                    if (findViewById5 == null || ((ImageView) findViewById5.findViewById(C0966R.C0970id.l5y)) == null) {
                                        view3 = null;
                                    } else {
                                        C16569a aVar12 = new C16569a();
                                        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById5;
                                        aVar12.mo16716c(constraintLayout);
                                        if (!Util.isNullOrNil(first2.f64413H)) {
                                            aVar12.mo16721h(C0966R.C0970id.l5y).f44557v = 0.47f;
                                        } else {
                                            aVar12.mo16721h(C0966R.C0970id.l5y).f44557v = 0.5f;
                                        }
                                        aVar12.mo16714a(constraintLayout);
                                        view3 = null;
                                        constraintLayout.setConstraintSet((C16569a) null);
                                    }
                                    View findViewById8 = findViewById4 != null ? findViewById4.findViewById(C0966R.C0970id.mga) : view3;
                                    if (findViewById4 != null) {
                                        view3 = findViewById4.findViewById(C0966R.C0970id.mgb);
                                    }
                                    if (findViewById7 != null) {
                                        C9556a aVar13 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
                                        aVar13.mo10233c(4);
                                        View view46 = findViewById7;
                                        C117292a.m165358d(view46, aVar13.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById7.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                                        C117292a.m165359e(view46, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                    if (Util.isNullOrNil(first2.f64413H)) {
                                        if (findViewById8 != null) {
                                            C9556a aVar14 = new C9556a();
                                            ThreadLocal<C9556a> threadLocal11 = C60958c.f173611a;
                                            aVar14.mo10233c(8);
                                            View view47 = findViewById8;
                                            C117292a.m165358d(view47, aVar14.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            findViewById8.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                                            C117292a.m165359e(view47, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        }
                                        if (view3 != null) {
                                            C9556a aVar15 = new C9556a();
                                            ThreadLocal<C9556a> threadLocal12 = C60958c.f173611a;
                                            aVar15.mo10233c(0);
                                            View view48 = view3;
                                            C117292a.m165358d(view48, aVar15.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view3.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                                            C117292a.m165359e(view48, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        }
                                        if (!(view3 == null || (textView6 = (TextView) view3.findViewById(C0966R.C0970id.mfv)) == null)) {
                                            textView6.setVisibility(0);
                                            String str4 = first2.f64433p;
                                            C87412m.m108593f(str4, "finderRecData.title");
                                            textView6.setText(mo22949q(str4));
                                            C8219i.f27144a.mo9271b(textView6);
                                            this.f50966p = textView6;
                                        }
                                        if (!(view3 == null || (textView5 = (TextView) view3.findViewById(C0966R.C0970id.mg5)) == null || (i3 = first2.f64440w) == 0)) {
                                            textView5.setText(C92721n.m116876d(i3));
                                            textView5.setVisibility(0);
                                            this.f50965o = textView5;
                                        }
                                    } else {
                                        if (findViewById8 != null) {
                                            C9556a aVar16 = new C9556a();
                                            ThreadLocal<C9556a> threadLocal13 = C60958c.f173611a;
                                            aVar16.mo10233c(0);
                                            View view49 = findViewById8;
                                            C117292a.m165358d(view49, aVar16.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            findViewById8.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                                            C117292a.m165359e(view49, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        }
                                        if (view3 != null) {
                                            C9556a aVar17 = new C9556a();
                                            ThreadLocal<C9556a> threadLocal14 = C60958c.f173611a;
                                            aVar17.mo10233c(8);
                                            View view50 = view3;
                                            C117292a.m165358d(view50, aVar17.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view3.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                                            C117292a.m165359e(view50, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillSingleLargeStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        }
                                        if (!(findViewById8 == null || (textView4 = (TextView) findViewById8.findViewById(C0966R.C0970id.mfv)) == null)) {
                                            textView4.setVisibility(0);
                                            String str5 = first2.f64433p;
                                            C87412m.m108593f(str5, "finderRecData.title");
                                            textView4.setText(mo22949q(str5));
                                            C8219i.f27144a.mo9271b(textView4);
                                            this.f50964n = textView4;
                                        }
                                        if (!(findViewById8 == null || (textView3 = (TextView) findViewById8.findViewById(C0966R.C0970id.mg5)) == null || (i2 = first2.f64440w) == 0)) {
                                            textView3.setText(C92721n.m116876d(i2));
                                            textView3.setVisibility(0);
                                            this.f50963m = textView3;
                                        }
                                        if (!(findViewById8 == null || (textView2 = (TextView) findViewById8.findViewById(C0966R.C0970id.mfw)) == null)) {
                                            textView2.setText(first2.f64413H);
                                            textView2.setVisibility(0);
                                        }
                                    }
                                    mo22943k(first2, findViewById5, imageView11, textView, imageView);
                                    if (findViewById6 != null) {
                                        findViewById6.setOnClickListener(new C18400z1(first2, this, o0Var2));
                                    }
                                    C19623o0 o0Var4 = o0Var;
                                    C22521pi1 pi14 = first2;
                                    m18969j(this, findViewById5, findViewById5, o0Var4, pi14, false, 16, (Object) null);
                                    mo22942i(findViewById6, this.f50969s, o0Var4, pi14, false);
                                }
                            }
                        }
                    } else if (valueOf != null && valueOf.intValue() == 2) {
                        mo22946n(o0Var, i, view, view2);
                    } else if (valueOf != null && valueOf.intValue() == 3) {
                        mo22947o(o0Var, i, view, view2);
                    } else {
                        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "sub_type illegal");
                        mo22945m(o0Var);
                    }
                    C16825a.f45444a.mo17868f(o0Var2, this);
                    return;
                }
            }
            Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "check error!");
            mo22945m(o0Var);
            return;
        }
        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "nativeFinderFeedData is null");
        mo22945m(o0Var);
    }

    /* renamed from: c */
    public Object mo22832c(C15601d<? super View> dVar) {
        C64846y23 y232 = this.f50958h;
        Integer num = y232 != null ? new Integer(y232.f186438d) : null;
        if (num != null && num.intValue() == 1) {
            return this.f50973w;
        }
        if ((num != null && num.intValue() == 2) || num == null) {
            return null;
        }
        int intValue = num.intValue();
        return null;
    }

    /* renamed from: e */
    public boolean mo22833e() {
        C64846y23 y232 = this.f50958h;
        Integer valueOf = y232 != null ? Integer.valueOf(y232.f186438d) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return true;
        }
        if ((valueOf != null && valueOf.intValue() == 2) || valueOf == null) {
            return false;
        }
        int intValue = valueOf.intValue();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r1 = r1.f186439e;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22834f(int r15) {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setVideoStatus="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = "   nativeFinderFeedData="
            r0.append(r1)
            te3.y23 r1 = r14.f50958h
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.util.LinkedList<te3.pi1> r1 = r1.f186439e
            if (r1 == 0) goto L_0x0021
            int r1 = r1.size()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r3 = 0
            if (r1 <= 0) goto L_0x003b
            te3.y23 r1 = r14.f50958h
            if (r1 == 0) goto L_0x0038
            java.util.LinkedList<te3.pi1> r1 = r1.f186439e
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r1.get(r2)
            te3.pi1 r1 = (te3.C22521pi1) r1
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = r1.f64433p
            goto L_0x0039
        L_0x0038:
            r1 = r3
        L_0x0039:
            if (r1 != 0) goto L_0x003d
        L_0x003b:
            java.lang.String r1 = ""
        L_0x003d:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.BizTLRecCardNativeFinder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 2
            r1 = 1
            if (r15 == r1) goto L_0x0167
            r4 = 3
            r5 = 4
            if (r15 == r0) goto L_0x00e0
            if (r15 == r4) goto L_0x0055
            goto L_0x019d
        L_0x0055:
            te3.y23 r15 = r14.f50958h
            if (r15 == 0) goto L_0x0060
            int r15 = r15.f186438d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0061
        L_0x0060:
            r15 = r3
        L_0x0061:
            if (r15 != 0) goto L_0x0064
            goto L_0x00c1
        L_0x0064:
            int r6 = r15.intValue()
            if (r6 != r1) goto L_0x00c1
            ht1.g1 r15 = r14.f50976z
            if (r15 == 0) goto L_0x0071
            r15.stop()
        L_0x0071:
            ht1.g1 r15 = r14.f50976z
            if (r15 == 0) goto L_0x007a
            android.view.View r15 = r15.getVideoView()
            goto L_0x007b
        L_0x007a:
            r15 = r3
        L_0x007b:
            if (r15 != 0) goto L_0x007e
            goto L_0x00d2
        L_0x007e:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.mo10233c(r1)
            java.lang.Object[] r7 = r0.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder"
            java.lang.String r9 = "setVideoStatus"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r15
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r15.setVisibility(r0)
            java.lang.String r7 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder"
            java.lang.String r8 = "setVideoStatus"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00d2
        L_0x00c1:
            if (r15 != 0) goto L_0x00c4
            goto L_0x00cb
        L_0x00c4:
            int r1 = r15.intValue()
            if (r1 != r0) goto L_0x00cb
            goto L_0x00d2
        L_0x00cb:
            if (r15 != 0) goto L_0x00ce
            goto L_0x00d2
        L_0x00ce:
            int r15 = r15.intValue()
        L_0x00d2:
            r14.mo22950r(r2, r2)
            cy0.a r15 = r14.f50968r
            if (r15 == 0) goto L_0x00dc
            r15.mo31866a(r5)
        L_0x00dc:
            r14.f50968r = r3
            goto L_0x019d
        L_0x00e0:
            te3.y23 r15 = r14.f50958h
            if (r15 == 0) goto L_0x00eb
            int r15 = r15.f186438d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x00ec
        L_0x00eb:
            r15 = r3
        L_0x00ec:
            if (r15 != 0) goto L_0x00ef
            goto L_0x014c
        L_0x00ef:
            int r6 = r15.intValue()
            if (r6 != r1) goto L_0x014c
            ht1.g1 r15 = r14.f50976z
            if (r15 == 0) goto L_0x00fc
            r15.pause()
        L_0x00fc:
            ht1.g1 r15 = r14.f50976z
            if (r15 == 0) goto L_0x0105
            android.view.View r15 = r15.getVideoView()
            goto L_0x0106
        L_0x0105:
            r15 = r3
        L_0x0106:
            if (r15 != 0) goto L_0x0109
            goto L_0x015d
        L_0x0109:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.mo10233c(r1)
            java.lang.Object[] r7 = r0.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder"
            java.lang.String r9 = "setVideoStatus"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r15
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r15.setVisibility(r0)
            java.lang.String r7 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder"
            java.lang.String r8 = "setVideoStatus"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x015d
        L_0x014c:
            if (r15 != 0) goto L_0x014f
            goto L_0x0156
        L_0x014f:
            int r1 = r15.intValue()
            if (r1 != r0) goto L_0x0156
            goto L_0x015d
        L_0x0156:
            if (r15 != 0) goto L_0x0159
            goto L_0x015d
        L_0x0159:
            int r15 = r15.intValue()
        L_0x015d:
            cy0.a r15 = r14.f50968r
            if (r15 == 0) goto L_0x0164
            r15.mo31866a(r5)
        L_0x0164:
            r14.f50968r = r3
            goto L_0x019d
        L_0x0167:
            te3.y23 r15 = r14.f50958h
            if (r15 == 0) goto L_0x0172
            int r15 = r15.f186438d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0173
        L_0x0172:
            r15 = r3
        L_0x0173:
            if (r15 != 0) goto L_0x0176
            goto L_0x018d
        L_0x0176:
            int r2 = r15.intValue()
            if (r2 != r1) goto L_0x018d
            a14.n0 r4 = a14.C53930o0.m60555b()
            r5 = 0
            r6 = 0
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$d r7 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.y1$d
            r7.<init>(r14, r3)
            r8 = 3
            r9 = 0
            a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            goto L_0x019d
        L_0x018d:
            if (r15 != 0) goto L_0x0190
            goto L_0x0197
        L_0x0190:
            int r1 = r15.intValue()
            if (r1 != r0) goto L_0x0197
            goto L_0x019d
        L_0x0197:
            if (r15 != 0) goto L_0x019a
            goto L_0x019d
        L_0x019a:
            r15.intValue()
        L_0x019d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18386y1.mo22834f(int):void");
    }

    /* renamed from: i */
    public final void mo22942i(View view, View view2, C19623o0 o0Var, C22521pi1 pi12, boolean z) {
        if (view != null && view2 != null && (this.f50955e instanceof BizTimeLineUI)) {
            view.setOnLongClickListener(new C18387a(pi12, this, view, o0Var, z));
        }
    }

    /* renamed from: k */
    public final void mo22943k(C22521pi1 pi12, View view, ImageView imageView, TextView textView, ImageView imageView2) {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.C0969drawable.be5;
        bVar.f59347c = true;
        bVar.f59364t = true;
        C20828a.m22825b().mo32519h(pi12.f64424d, imageView, bVar.mo32666a());
        if (textView != null) {
            textView.setText(pi12.f64425e);
        }
        C8219i.f27144a.mo9271b(textView);
        mo22952t(imageView2, view != null ? (ImageView) view.findViewById(C0966R.C0970id.mfs) : null, pi12);
        C46746a.f125826a.mo71977j(view, (float) mo22953u(8), true, true);
        if (view != null) {
            view.setOnClickListener(new C18382x1(this, pi12, view));
        }
        this.f50954d.f51453x.mo34948a(pi12, 25);
    }

    /* renamed from: l */
    public void mo22944l(C19623o0 o0Var, String str) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(str, "extra");
        C64846y23 y232 = this.f50958h;
        Integer valueOf = y232 != null ? Integer.valueOf(y232.f186438d) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            C20371a aVar = this.f50968r;
            if (aVar != null) {
                aVar.mo31866a(3);
            }
            C16825a.f45444a.mo17864b(o0Var, str);
        } else if ((valueOf == null || valueOf.intValue() != 2) && valueOf != null) {
            valueOf.intValue();
        }
    }

    /* renamed from: m */
    public final void mo22945m(C19623o0 o0Var) {
        if (o0Var != null) {
            C48009v0.Jx0().mo25785Lo(o0Var.field_msgId);
        }
    }

    /* renamed from: n */
    public final void mo22946n(C19623o0 o0Var, int i, View view, View view2) {
        C13604l lVar;
        View view3;
        View view4;
        View view5;
        boolean z;
        TextView textView;
        TextView textView2;
        ViewGroup.LayoutParams layoutParams;
        TextView textView3;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View findViewById;
        View findViewById2;
        List<C22521pi1> list;
        List<C22521pi1> list2;
        View view6 = this.f50970t;
        if (view6 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view7 = this.f50969s;
        if (view7 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view9 = this.f50971u;
        if (view9 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view9, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view10 = this.f50972v;
        if (view10 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view11 = view10;
            C117292a.m165358d(view11, aVar4.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "fillDualSmallStyle");
        C64846y23 y232 = this.f50958h;
        LinkedList<C22521pi1> linkedList = y232 != null ? y232.f186439e : null;
        if (Util.isNullOrNil((List) linkedList)) {
            mo22945m(o0Var);
            return;
        }
        View view12 = this.f50956f;
        ViewGroup.LayoutParams layoutParams4 = view12 != null ? view12.getLayoutParams() : null;
        LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams4 : null;
        if (layoutParams5 != null) {
            layoutParams5.setMargins(C76577a.m92151b(this.f50955e, 8), 0, C76577a.m92151b(this.f50955e, 8), 0);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        if (linkedList != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (T next : linkedList) {
                C22521pi1 pi12 = (C22521pi1) next;
                if (!pi12.f64422R && C18355t.m18925d(pi12)) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            lVar = new C13604l(arrayList, arrayList2);
        } else {
            lVar = null;
        }
        if (!(lVar == null || (list2 = (List) lVar.f38555d) == null)) {
            for (C22521pi1 pi13 : list2) {
                if (pi13.f64422R) {
                    pi13.f64422R = false;
                    C18355t.m18927f(o0Var);
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
        if (!(lVar == null || (list = (List) lVar.f38556e) == null)) {
            for (C22521pi1 pi14 : list) {
                if (!pi14.f64422R) {
                    pi14.f64422R = true;
                    C18355t.m18927f(o0Var);
                    C18355t.m18926e(pi14, this.f50954d.f51436d.f50208A);
                }
            }
            C13598b0 b0Var3 = C13598b0.f38549a;
        }
        C13598b0 b0Var4 = C13598b0.f38549a;
        List list3 = lVar != null ? (List) lVar.f38555d : null;
        ArrayList arrayList3 = new ArrayList();
        View view13 = this.f50970t;
        int i2 = C0966R.C0970id.f358824mg0;
        if (!(view13 == null || (findViewById2 = view13.findViewById(C0966R.C0970id.f358824mg0)) == null)) {
            arrayList3.add(findViewById2);
        }
        View view14 = this.f50970t;
        int i3 = C0966R.C0970id.f358827mg3;
        if (!(view14 == null || (findViewById = view14.findViewById(C0966R.C0970id.f358827mg3)) == null)) {
            arrayList3.add(findViewById);
        }
        if (list3 != null && list3.size() == 1) {
            View view15 = (View) arrayList3.get(1);
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view16 = view15;
            C117292a.m165358d(view16, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (list3 != null && list3.size() == 0) {
                mo22945m(o0Var);
                Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "dual card: finderVisibleList?.size == 0");
                return;
            }
        }
        if (list3 != null) {
            int i4 = 0;
            for (Object next2 : list3) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C22521pi1 pi15 = (C22521pi1) next2;
                    if (i4 == 0) {
                        View view17 = this.f50970t;
                        View findViewById3 = view17 != null ? view17.findViewById(i2) : null;
                        View view18 = this.f50970t;
                        View findViewById4 = view18 != null ? view18.findViewById(C0966R.C0970id.mfz) : null;
                        View view19 = this.f50970t;
                        view4 = findViewById4;
                        view3 = view19 != null ? view19.findViewById(C0966R.C0970id.f358825mg1) : null;
                        view5 = findViewById3;
                        z = true;
                    } else {
                        View view20 = this.f50970t;
                        View findViewById5 = view20 != null ? view20.findViewById(i3) : null;
                        View view21 = this.f50970t;
                        View findViewById6 = view21 != null ? view21.findViewById(C0966R.C0970id.f358826mg2) : null;
                        View view22 = this.f50970t;
                        View findViewById7 = view22 != null ? view22.findViewById(C0966R.C0970id.mg4) : null;
                        if (findViewById5 != null) {
                            findViewById5.setTranslationX(0.0f);
                        }
                        view4 = findViewById6;
                        view3 = findViewById7;
                        view5 = findViewById5;
                        z = false;
                    }
                    pi15.f64423S = i4;
                    Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "filling left = " + z);
                    ImageView imageView = view5 != null ? (ImageView) view5.findViewById(C0966R.C0970id.mfr) : null;
                    TextView textView4 = view5 != null ? (TextView) view5.findViewById(C0966R.C0970id.mg8) : null;
                    ImageView imageView2 = view5 != null ? (ImageView) view5.findViewById(C0966R.C0970id.mfu) : null;
                    View findViewById8 = view5 != null ? view5.findViewById(C0966R.C0970id.mfx) : null;
                    View findViewById9 = view5 != null ? view5.findViewById(C0966R.C0970id.hx9) : null;
                    if (view4 != null) {
                        view4.setTag(pi15.f64433p);
                    }
                    this.f50974x = ((C46746a.f125826a.mo71974g(this.f50955e) - mo22953u(16)) - mo22953u(8)) / 2;
                    if (!(view5 == null || (layoutParams3 = view5.getLayoutParams()) == null)) {
                        layoutParams3.width = this.f50974x;
                        C13598b0 b0Var5 = C13598b0.f38549a;
                    }
                    if (!(view4 == null || (layoutParams2 = view4.getLayoutParams()) == null)) {
                        int i6 = this.f50974x;
                        layoutParams2.width = i6;
                        int i7 = (int) (((double) i6) / 0.75d);
                        layoutParams2.height = i7;
                        this.f50975y = i7;
                        C13598b0 b0Var6 = C13598b0.f38549a;
                    }
                    if (!(view3 == null || (textView3 = (TextView) view3.findViewById(C0966R.C0970id.mg_)) == null)) {
                        textView3.setVisibility(8);
                        C13598b0 b0Var7 = C13598b0.f38549a;
                    }
                    if (view5 != null) {
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                        aVar6.mo10233c(0);
                        View view23 = view5;
                        C117292a.m165358d(view23, aVar6.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view23, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("bodyContainer width = ");
                    sb.append(this.f50974x);
                    sb.append(", height = ");
                    sb.append((view4 == null || (layoutParams = view4.getLayoutParams()) == null) ? null : Integer.valueOf(layoutParams.height));
                    Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", sb.toString());
                    if (findViewById8 == null || (textView = (TextView) findViewById8.findViewById(C0966R.C0970id.mfw)) == null) {
                        textView = null;
                    } else {
                        if (Util.isNullOrNil(pi15.f64413H)) {
                            textView.setVisibility(8);
                        } else {
                            textView.setVisibility(0);
                            textView.setText(pi15.f64413H);
                        }
                        C13598b0 b0Var8 = C13598b0.f38549a;
                    }
                    if (!(findViewById8 == null || (textView2 = (TextView) findViewById8.findViewById(C0966R.C0970id.mg5)) == null)) {
                        if (pi15.f64440w == 0) {
                            textView2.setVisibility(8);
                            if (findViewById9 != null) {
                                C9556a aVar7 = new C9556a();
                                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                                aVar7.mo10233c(8);
                                View view24 = findViewById9;
                                C117292a.m165358d(view24, aVar7.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById9.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                C117292a.m165359e(view24, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        } else {
                            textView2.setVisibility(0);
                            if (findViewById9 != null) {
                                C9556a aVar8 = new C9556a();
                                ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                                aVar8.mo10233c(0);
                                View view25 = findViewById9;
                                C117292a.m165358d(view25, aVar8.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById9.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                                C117292a.m165359e(view25, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            textView2.setText(C92721n.m116876d(pi15.f64440w));
                        }
                        C13598b0 b0Var9 = C13598b0.f38549a;
                    }
                    if (textView != null && textView.getVisibility() == 0) {
                        findViewById8.setBackground(this.f50955e.getResources().getDrawable(C0966R.C0969drawable.f4620io));
                        if (findViewById9 != null) {
                            C9556a aVar9 = new C9556a();
                            ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                            aVar9.mo10233c(8);
                            View view26 = findViewById9;
                            C117292a.m165358d(view26, aVar9.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById9.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                            C117292a.m165359e(view26, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        if (findViewById8 != null) {
                            findViewById8.setBackground(this.f50955e.getResources().getDrawable(C0966R.C0969drawable.ayq));
                        }
                        if (findViewById9 != null) {
                            C9556a aVar10 = new C9556a();
                            ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
                            aVar10.mo10233c(0);
                            View view27 = findViewById9;
                            C117292a.m165358d(view27, aVar10.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById9.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                            C117292a.m165359e(view27, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillDualSmallStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    View view28 = view5;
                    View view29 = view4;
                    View view30 = view3;
                    mo22943k(pi15, view4, imageView, textView4, imageView2);
                    if (view30 != null) {
                        view30.setOnClickListener(new C18400z1(pi15, this, o0Var));
                    } else {
                        C19623o0 o0Var2 = o0Var;
                    }
                    C19623o0 o0Var3 = o0Var;
                    C22521pi1 pi16 = pi15;
                    mo22942i(view30, view28, o0Var3, pi16, false);
                    m18969j(this, view29, view29, o0Var3, pi16, false, 16, (Object) null);
                    i4 = i5;
                    i3 = C0966R.C0970id.f358827mg3;
                    i2 = C0966R.C0970id.f358824mg0;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            C13598b0 b0Var10 = C13598b0.f38549a;
        }
    }

    /* renamed from: o */
    public final void mo22947o(C19623o0 o0Var, int i, View view, View view2) {
        C13604l lVar;
        String str;
        me4 me4;
        List<C22521pi1> list;
        List<C22521pi1> list2;
        List<C22521pi1> list3;
        C64846y23 y232;
        LinkedList<C22521pi1> linkedList;
        C19623o0 o0Var2 = o0Var;
        View view3 = view2;
        View view4 = this.f50970t;
        if (view4 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillingListStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillingListStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view5 = this.f50969s;
        if (view5 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillingListStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillingListStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view7 = this.f50972v;
        if (view7 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillingListStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillingListStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f50971u == null) {
            this.f50971u = ((ViewStub) view3.findViewById(C0966R.C0970id.nd4)).inflate();
        }
        View view8 = this.f50971u;
        if (view8 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillingListStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "fillingListStyle", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f50971u != null) {
            View view9 = this.f50956f;
            ViewGroup.LayoutParams layoutParams = view9 != null ? view9.getLayoutParams() : null;
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(0, C76577a.m92151b(this.f50955e, 8), 0, 0);
            }
            Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "fillingListStyle");
            C22055p pVar = this.f50962l;
            View view10 = this.f50971u;
            C87412m.m108591d(view10);
            pVar.getClass();
            C87412m.m108594g(o0Var2, "info");
            C87412m.m108594g(view, "convertView");
            C87412m.m108594g(view3, "parent");
            re4 x2 = o0Var.mo25774x2();
            if (!((x2 == null || (y232 = x2.f64529u) == null || (linkedList = y232.f186439e) == null || linkedList.size() != 0) ? false : true)) {
                Context context = view2.getContext();
                C87412m.m108593f(context, "parent.context");
                pVar.f62416c = context;
                TextView textView = new TextView(pVar.mo35163d());
                textView.setText(Util.getRandomString(100));
                textView.setTextSize(C76577a.m92165p(MMApplicationContext.getContext()) * 15.0f);
                textView.measure(10, 0);
                int max = Math.max((textView.getMeasuredHeight() * 2) + C76577a.m92151b(pVar.mo35163d(), 1), C76577a.m92151b(pVar.mo35163d(), 40));
                pVar.f62415b = (int) (C22055p.f62411q + ((double) max) + ((double) C76577a.m92151b(pVar.mo35163d(), 40)));
                Log.m105924i("MicroMsg.NativeFinderListHelper", "titleContainerHeight = " + max + ", cardHeightMp = " + pVar.f62415b);
                pVar.f62417d = view10;
                pVar.f62418e = o0Var2;
                pVar.f62420g = i;
                LinkedList<C22521pi1> linkedList2 = o0Var.mo25774x2().f64529u.f186439e;
                if (linkedList2 != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (T next : linkedList2) {
                        C22521pi1 pi12 = (C22521pi1) next;
                        if (!pi12.f64422R && C18355t.m18925d(pi12)) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                    lVar = new C13604l(arrayList, arrayList2);
                } else {
                    lVar = null;
                }
                if (!(lVar == null || (list3 = (List) lVar.f38555d) == null)) {
                    for (C22521pi1 pi13 : list3) {
                        if (pi13.f64422R) {
                            pi13.f64422R = false;
                            C18355t.m18927f(o0Var);
                        }
                    }
                }
                if (!(lVar == null || (list2 = (List) lVar.f38556e) == null)) {
                    for (C22521pi1 pi14 : list2) {
                        if (!pi14.f64422R) {
                            pi14.f64422R = true;
                            C18355t.m18927f(o0Var);
                            C18355t.m18926e(pi14, pVar.f62414a.f50954d.f51436d.f50208A);
                        }
                    }
                }
                ArrayList<C22039d> arrayList3 = new ArrayList<>();
                if (!(lVar == null || (list = (List) lVar.f38555d) == null)) {
                    for (C22521pi1 pi15 : list) {
                        C87412m.m108593f(pi15, "finderData");
                        C22039d dVar = new C22039d(pi15);
                        dVar.f62374e = o0Var.mo25774x2().f64529u.f186439e.size();
                        dVar.f62375f = o0Var.mo25774x2().f64529u.f186440f;
                        dVar.f62376g = pVar.f62415b;
                        arrayList3.add(dVar);
                    }
                }
                pVar.f62419f = arrayList3;
                View findViewById = view10.findViewById(C0966R.C0970id.nbk);
                C87412m.m108593f(findViewById, "container.findViewById(R…native_finder_list_title)");
                pVar.f62421h = (TextView) findViewById;
                if ((lVar != null ? (List) lVar.f38555d : null) == null || ((List) lVar.f38555d).isEmpty()) {
                    pVar.f62414a.mo22945m(o0Var2);
                    Log.m105924i("MicroMsg.NativeFinderListHelper", "delete native finder list");
                } else if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                    TextView textView2 = pVar.f62421h;
                    if (textView2 != null) {
                        textView2.setOnLongClickListener(new C22043h(pVar, o0Var2));
                    } else {
                        C87412m.m108603p("titleTv");
                        throw null;
                    }
                }
                View view11 = pVar.f62417d;
                if (view11 != null) {
                    View findViewById2 = view11.findViewById(C0966R.C0970id.nbj);
                    C87412m.m108593f(findViewById2, "container.findViewById(R.id.native_finder_list_rv)");
                    pVar.f62422i = (BizNativeFinderRecyclerView) findViewById2;
                    WxLinearLayoutManager wxLinearLayoutManager = new WxLinearLayoutManager(pVar.mo35163d());
                    wxLinearLayoutManager.mo16974W(0);
                    pVar.f62424k = wxLinearLayoutManager;
                    pVar.f62423j = new C47538i(new NativeFinderListHelper$initRv$buildItemConvert$1(pVar), pVar.mo35160a());
                    pVar.mo35164e().setAdapter(pVar.mo35162c());
                    BizNativeFinderRecyclerView e = pVar.mo35164e();
                    WxLinearLayoutManager wxLinearLayoutManager2 = pVar.f62424k;
                    if (wxLinearLayoutManager2 != null) {
                        e.setLayoutManager(wxLinearLayoutManager2);
                        pVar.mo35164e().setFlingSpeedFactor(80);
                        C18508z2 z2Var = pVar.f62414a.f50954d;
                        int i2 = z2Var.f51454y;
                        if (!(i2 == 0 && z2Var.f51455z == 0)) {
                            int i3 = i2 + 1;
                            int size = pVar.mo35160a().size();
                            if (i3 > size) {
                                i3 = size;
                            }
                            WxLinearLayoutManager wxLinearLayoutManager3 = pVar.f62424k;
                            if (wxLinearLayoutManager3 != null) {
                                int i4 = pVar.f62414a.f50954d.f51455z;
                                C9556a aVar5 = new C9556a();
                                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                                aVar5.mo10233c(Integer.valueOf(i4));
                                aVar5.mo10233c(Integer.valueOf(i3));
                                WxLinearLayoutManager wxLinearLayoutManager4 = wxLinearLayoutManager3;
                                C117292a.m165358d(wxLinearLayoutManager4, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderListHelper", "initRv", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                wxLinearLayoutManager3.mo16973V(((Integer) aVar5.mo10231a(0)).intValue(), ((Integer) aVar5.mo10231a(1)).intValue());
                                C117292a.m165359e(wxLinearLayoutManager4, "com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderListHelper", "initRv", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            } else {
                                C87412m.m108603p("layoutManager");
                                throw null;
                            }
                        }
                        pVar.mo35162c().f165746y = new C22049m(pVar);
                        pVar.mo35164e().mo17043c(new C22050n(pVar));
                        pVar.mo35162c().f165737C = new C22051o(pVar);
                        Log.m105924i("MicroMsg.NativeFinderListHelper", "resetSize, showMpStyle = " + ((Boolean) ((C36570n) pVar.f62427n).getValue()).booleanValue());
                        ViewGroup.LayoutParams layoutParams3 = pVar.mo35164e().getLayoutParams();
                        layoutParams3.width = -1;
                        layoutParams3.height = ((Boolean) ((C36570n) pVar.f62427n).getValue()).booleanValue() ? pVar.f62415b : C22055p.f62410p;
                        TextView textView3 = pVar.f62421h;
                        if (textView3 != null) {
                            re4 x25 = pVar.mo35161b().mo25774x2();
                            if (x25 == null || (me4 = x25.f64515d) == null || (str = me4.f64239d) == null) {
                                str = "";
                            }
                            textView3.setText(str);
                            return;
                        }
                        C87412m.m108603p("titleTv");
                        throw null;
                    }
                    C87412m.m108603p("layoutManager");
                    throw null;
                }
                C87412m.m108603p("container");
                throw null;
            }
        }
    }

    /* renamed from: p */
    public final boolean mo22948p() {
        return ((Boolean) ((C36570n) this.f50952B).getValue()).booleanValue();
    }

    /* renamed from: q */
    public final SpannableString mo22949q(String str) {
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f50955e, str);
        C87412m.m108593f(T1, "getService(ISpannableSer…anForSmiley(context, str)");
        return T1;
    }

    /* renamed from: r */
    public final void mo22950r(boolean z, int i) {
        TextView textView;
        TextView textView2;
        LinkedList<C22521pi1> linkedList;
        C18390b bVar = C18390b.f50987d;
        C64846y23 y232 = this.f50958h;
        C22521pi1 pi12 = null;
        Integer valueOf = y232 != null ? Integer.valueOf(y232.f186438d) : null;
        if (valueOf != null) {
            boolean z2 = true;
            if (valueOf.intValue() == 1) {
                C64846y23 y233 = this.f50958h;
                if (!(y233 == null || (linkedList = y233.f186439e) == null)) {
                    pi12 = linkedList.getFirst();
                }
                if (pi12 != null) {
                    View view = mo22948p() ? this.f50972v : this.f50969s;
                    int i2 = 4;
                    if (view != null) {
                        if (z) {
                            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.l5y);
                            if (!(imageView == null || imageView.getVisibility() == 4)) {
                                imageView.setVisibility(4);
                            }
                        } else {
                            ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.l5y);
                            if (!(imageView2 == null || imageView2.getVisibility() == 0)) {
                                imageView2.setVisibility(0);
                            }
                        }
                    }
                    if (Util.isNullOrNil(pi12.f64413H)) {
                        if (z) {
                            TextView textView3 = this.f50966p;
                            if (textView3 == null || textView3.getVisibility() != 4) {
                                z2 = false;
                            }
                            if (!z2 && (textView2 = this.f50966p) != null) {
                                textView2.setVisibility(4);
                            }
                        } else {
                            TextView textView4 = this.f50966p;
                            if (textView4 == null || textView4.getVisibility() != 0) {
                                z2 = false;
                            }
                            if (!z2 && (textView = this.f50966p) != null) {
                                textView.setVisibility(0);
                            }
                        }
                        bVar.mo162I(Boolean.valueOf(z), Integer.valueOf(i), pi12, mo22948p() ? this.f50967q : this.f50965o);
                        return;
                    }
                    TextView textView5 = this.f50964n;
                    if (textView5 != null) {
                        if (!z) {
                            i2 = 0;
                        }
                        textView5.setVisibility(i2);
                    }
                    bVar.mo162I(Boolean.valueOf(z), Integer.valueOf(i), pi12, mo22948p() ? this.f50967q : this.f50963m);
                    return;
                }
                return;
            }
        }
        if ((valueOf == null || valueOf.intValue() != 2) && valueOf != null) {
            valueOf.intValue();
        }
    }

    /* renamed from: s */
    public final void mo22951s() {
        View view = this.f50956f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: t */
    public final void mo22952t(ImageView imageView, ImageView imageView2, C22521pi1 pi12) {
        if (imageView != null && imageView2 != null) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59361q = C0966R.C0969drawable.f4586h2;
            bVar.f59347c = true;
            C20828a.m22825b().mo32520i(pi12.f64434q, imageView, bVar.mo32666a(), new C18391c(this, imageView, pi12, imageView2));
        }
    }

    /* renamed from: u */
    public final int mo22953u(int i) {
        return C76577a.m92151b(this.f50955e, i);
    }
}
