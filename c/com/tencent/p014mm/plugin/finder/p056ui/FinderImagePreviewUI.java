package com.tencent.p014mm.plugin.finder.p056ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.AnimationLayout;
import com.tencent.p014mm.view.C97328a;
import com.tencent.p014mm.view.C97330b;
import com.tencent.p014mm.view.ViewAnimHelper;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C99099a;
import k60.C99101e;
import kotlin.Metadata;
import l60.C99342a;
import l60.C99344b;
import nj3.C88989a;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import up1.C27696y;
import x60.C102564a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderImagePreviewUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI */
public final class FinderImagePreviewUI extends MMFinderUI {

    /* renamed from: A */
    public static final /* synthetic */ int f270636A = 0;

    /* renamed from: o */
    public final String f270637o = "MicroMsg.FinderImagePreviewUI";

    /* renamed from: p */
    public View f270638p;

    /* renamed from: q */
    public MMGestureGallery f270639q;

    /* renamed from: r */
    public View f270640r;

    /* renamed from: s */
    public AnimationLayout f270641s;

    /* renamed from: t */
    public boolean f270642t;

    /* renamed from: u */
    public boolean f270643u;

    /* renamed from: v */
    public Rect f270644v;

    /* renamed from: w */
    public float f270645w;

    /* renamed from: x */
    public float f270646x;

    /* renamed from: y */
    public float f270647y;

    /* renamed from: z */
    public float f270648z;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI$a */
    public final class C93768a extends BaseAdapter {

        /* renamed from: d */
        public ArrayList<String> f270649d = new ArrayList<>();

        /* renamed from: e */
        public boolean f270650e;

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI$a$a */
        public static final class C93769a<T, R> implements C64207e {

            /* renamed from: a */
            public static final C93769a<T, R> f270652a = new C93769a<>();

            /* renamed from: a */
            public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    MMHandlerThread.postToMainThread(new C93775y0(iVar, bitmap));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI$a$b */
        public static final class C93770b extends C87413o implements C32227p<C101350i<?>, Bitmap, C13598b0> {

            /* renamed from: d */
            public static final C93770b f270653d = new C93770b();

            public C93770b() {
                super(2);
            }

            public Object invoke(Object obj, Object obj2) {
                C101350i iVar = (C101350i) obj;
                Bitmap bitmap = (Bitmap) obj2;
                C87412m.m108594g(iVar, "imageView");
                if (bitmap != null) {
                    MMHandlerThread.postToMainThread(new C93776z0(iVar, bitmap));
                }
                return C13598b0.f38549a;
            }
        }

        public C93768a() {
        }

        public int getCount() {
            return this.f270649d.size();
        }

        public Object getItem(int i) {
            return this.f270649d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(viewGroup, "viewGroup");
            if (view == null) {
                view = new MultiTouchImageView(FinderImagePreviewUI.this, 0, 0);
                view.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            }
            if (this.f270650e) {
                C99099a aVar = C99101e.f290571b;
                String str = this.f270649d.get(i);
                C87412m.m108591d(str);
                C99344b<String, Bitmap> i2 = aVar.mo138474i(str);
                i2.f291320d = C93769a.f270652a;
                ((C99342a) i2).mo85954d((ImageView) view);
            } else {
                C99344b<C100810g0, Bitmap> a = !FinderImagePreviewUI.this.f270642t ? ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85955a(new C11984n0(Util.nullAsNil(this.f270649d.get(i)), C27696y.RAW_IMAGE)) : ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11862B1().mo85955a(new C62345f(Util.nullAsNil(this.f270649d.get(i)), C27696y.ORIGIN_AVATAR_IMAGE));
                if (a instanceof C99342a) {
                    ((C99342a) a).mo138753h((ImageView) view, C93770b.f270653d);
                }
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI$b */
    public static final class C93771b implements MMGestureGallery.C19842g {

        /* renamed from: a */
        public final /* synthetic */ FinderImagePreviewUI f270654a;

        public C93771b(FinderImagePreviewUI finderImagePreviewUI) {
            this.f270654a = finderImagePreviewUI;
        }

        /* renamed from: a */
        public final void mo26370a() {
            FinderImagePreviewUI finderImagePreviewUI = this.f270654a;
            int i = FinderImagePreviewUI.f270636A;
            finderImagePreviewUI.mo128689N7();
        }
    }

    /* renamed from: N7 */
    public final void mo128689N7() {
        if (this.f270644v == null) {
            finish();
        } else if (this.f270643u) {
            finish();
        } else {
            this.f270643u = true;
            Log.m105924i(this.f270637o, "runExitAnimation");
            MMGestureGallery mMGestureGallery = this.f270639q;
            if (mMGestureGallery != null) {
                View selectedView = mMGestureGallery.getSelectedView();
                C87412m.m108592e(selectedView, "null cannot be cast to non-null type com.tencent.mm.ui.base.MultiTouchImageView");
                MultiTouchImageView multiTouchImageView = (MultiTouchImageView) selectedView;
                AnimationLayout animationLayout = this.f270641s;
                if (animationLayout != null) {
                    View view = this.f270640r;
                    if (view != null) {
                        View view2 = this.f270638p;
                        if (view2 != null) {
                            animationLayout.mo136401a(view, view2, new ViewAnimHelper.ViewInfo(this.f270644v), new C93772c1(multiTouchImageView, this), new C93773d1(multiTouchImageView, this));
                        } else {
                            C87412m.m108603p("root");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("galleryBg");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("animationLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("gallery");
                throw null;
            }
        }
    }

    public boolean convertActivityFromTranslucent() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ad8;
    }

    public void initView() {
        getController().mo177037B().mo91104o();
        getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
        getController().mo177103x0(getResources().getColor(C0966R.color.ahf));
        View findViewById = findViewById(C0966R.C0970id.iwc);
        C87412m.m108593f(findViewById, "findViewById(R.id.root)");
        this.f270638p = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.ehh);
        C87412m.m108593f(findViewById2, "findViewById(R.id.gallery)");
        this.f270639q = (MMGestureGallery) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.ehi);
        C87412m.m108593f(findViewById3, "findViewById(R.id.gallery_bg)");
        this.f270640r = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f5852qb);
        C87412m.m108593f(findViewById4, "findViewById(R.id.animation_layout)");
        this.f270641s = (AnimationLayout) findViewById4;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_file_list");
        ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("key_url_list");
        this.f270642t = getIntent().getBooleanExtra("key_preview_avatar", false);
        this.f270644v = (Rect) getIntent().getParcelableExtra("key_thumb_location");
        Log.m105925i(this.f270637o, "files %s, urls", stringArrayListExtra, stringArrayListExtra2);
        C93768a aVar = new C93768a();
        if (stringArrayListExtra != null) {
            aVar.f270649d.addAll(stringArrayListExtra);
            aVar.f270650e = true;
        } else if (stringArrayListExtra2 != null) {
            aVar.f270649d.addAll(stringArrayListExtra2);
            aVar.f270650e = false;
        }
        MMGestureGallery mMGestureGallery = this.f270639q;
        if (mMGestureGallery != null) {
            mMGestureGallery.setSingleClickOverListener(new C93771b(this));
            MMGestureGallery mMGestureGallery2 = this.f270639q;
            if (mMGestureGallery2 != null) {
                mMGestureGallery2.setAdapter(aVar);
                MMGestureGallery mMGestureGallery3 = this.f270639q;
                if (mMGestureGallery3 != null) {
                    mMGestureGallery3.setGalleryScaleListener(new C68953a1(this));
                    if (this.f270644v == null) {
                        View view = this.f270640r;
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        C87412m.m108603p("galleryBg");
                        throw null;
                    } else if (!this.f270643u) {
                        this.f270643u = true;
                        Log.m105924i(this.f270637o, "runEnterAnimation");
                        AnimationLayout animationLayout = this.f270641s;
                        if (animationLayout != null) {
                            View view2 = this.f270640r;
                            if (view2 != null) {
                                View view3 = this.f270638p;
                                if (view3 != null) {
                                    C97328a aVar3 = new C97328a(animationLayout, view3, new ViewAnimHelper.ViewInfo(this.f270644v), view2, new C41532b1(this), (ValueAnimator.AnimatorUpdateListener) null);
                                    if ((animationLayout.getMeasuredState() & -16777216) > 0) {
                                        aVar3.run();
                                    } else {
                                        animationLayout.getViewTreeObserver().addOnPreDrawListener(new C97330b(animationLayout, aVar3));
                                    }
                                } else {
                                    C87412m.m108603p("root");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("galleryBg");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("animationLayout");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("gallery");
                    throw null;
                }
            } else {
                C87412m.m108603p("gallery");
                throw null;
            }
        } else {
            C87412m.m108603p("gallery");
            throw null;
        }
    }

    public void onBackPressed() {
        mo128689N7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(5894);
        initView();
    }
}
