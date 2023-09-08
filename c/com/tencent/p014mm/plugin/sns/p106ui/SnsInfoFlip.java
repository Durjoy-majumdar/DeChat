package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewpager.widget.ViewPager;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CancelDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.SnsFlipUIEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.p136ui.base.MMPageControlView;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.GalleryTitleManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import d20.C20382b;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import nj3.C100120b1;
import os2.C100417r0;
import p182kk.C61104a;
import p575jn.C98950b;
import p823sg.C77710q;
import p910lj.C76701a;
import te3.C101804kv2;
import te3.C101817mv2;
import te3.C101829pp1;
import vl2.C111557w;
import vr2.C102236a0;
import vr2.C102268v;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip */
public class SnsInfoFlip extends FlipView {

    /* renamed from: p1 */
    public static final /* synthetic */ int f278141p1 = 0;

    /* renamed from: Q0 */
    public HashMap<Integer, Long> f278142Q0 = new HashMap<>();

    /* renamed from: R0 */
    public HashMap<Integer, Long> f278143R0 = new HashMap<>();

    /* renamed from: S0 */
    public boolean f278144S0 = false;

    /* renamed from: T */
    public Context f278145T;

    /* renamed from: T0 */
    public boolean f278146T0 = false;

    /* renamed from: U */
    public MMViewPager f278147U;

    /* renamed from: U0 */
    public boolean f278148U0 = false;

    /* renamed from: V */
    public C95555h f278149V;

    /* renamed from: V0 */
    public boolean f278150V0 = false;

    /* renamed from: W */
    public C19706a f278151W;

    /* renamed from: W0 */
    public boolean f278152W0 = true;

    /* renamed from: X0 */
    public List<C101829pp1> f278153X0;

    /* renamed from: Y0 */
    public boolean f278154Y0 = true;

    /* renamed from: Z0 */
    public float f278155Z0 = 1.0f;

    /* renamed from: a1 */
    public MMPageControlView f278156a1;

    /* renamed from: b1 */
    public Runnable f278157b1 = null;

    /* renamed from: c1 */
    public MMHandler f278158c1 = new MMHandler();

    /* renamed from: d1 */
    public String f278159d1 = "";

    /* renamed from: e1 */
    public int f278160e1 = -1;

    /* renamed from: f1 */
    public int f278161f1 = -1;

    /* renamed from: g1 */
    public boolean f278162g1 = false;

    /* renamed from: h1 */
    public boolean f278163h1 = false;

    /* renamed from: i1 */
    public long f278164i1 = 0;

    /* renamed from: j1 */
    public int f278165j1 = 0;

    /* renamed from: k1 */
    public String f278166k1;

    /* renamed from: l1 */
    public C95554g f278167l1;

    /* renamed from: m1 */
    public HashMap<String, SnsInfo> f278168m1 = new HashMap<>();

    /* renamed from: n1 */
    public HashSet<String> f278169n1 = new HashSet<>();

    /* renamed from: o1 */
    public HashMap<String, C95553f> f278170o1 = new HashMap<>();

    /* renamed from: p0 */
    public boolean f278171p0 = false;

    /* renamed from: x0 */
    public boolean f278172x0 = true;

    /* renamed from: y0 */
    public HashMap<Integer, Integer> f278173y0 = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$a */
    public class C95548a implements MMViewPager.C19691i {
        public C95548a() {
        }

        /* renamed from: a */
        public void mo26046a() {
            SnsMethodCalculate.markStartTimeMs("singleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$2");
            SnsInfoFlip snsInfoFlip = SnsInfoFlip.this;
            int i = SnsInfoFlip.f278141p1;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            boolean z = snsInfoFlip.f278152W0;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (z) {
                SnsInfoFlip.m122113w(SnsInfoFlip.this);
            }
            SnsMethodCalculate.markEndTimeMs("singleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$2");
        }

        /* renamed from: b */
        public void mo26047b() {
            SnsMethodCalculate.markStartTimeMs("exitDirectly", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$2");
            SnsInfoFlip.m122113w(SnsInfoFlip.this);
            SnsMethodCalculate.markEndTimeMs("exitDirectly", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$b */
    public class C95549b implements Runnable {
        public C95549b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$3");
            if (SnsInfoFlip.m122114x(SnsInfoFlip.this) != null) {
                SnsInfoFlip.m122114x(SnsInfoFlip.this).mo132804n();
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$c */
    public class C95550c implements ViewPager.OnPageChangeListener {
        public C95550c() {
        }

        public void onPageScrollStateChanged(int i) {
            SnsMethodCalculate.markStartTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
            SnsMethodCalculate.markEndTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        }

        public void onPageScrolled(int i, float f, int i2) {
            SnsMethodCalculate.markStartTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
            SnsMethodCalculate.markEndTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        }

        public void onPageSelected(int i) {
            SnsMethodCalculate.markStartTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
            if (SnsInfoFlip.m122114x(SnsInfoFlip.this) != null) {
                SnsInfoFlip snsInfoFlip = SnsInfoFlip.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                boolean z = snsInfoFlip.f278144S0;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                if (z && SnsInfoFlip.m122114x(SnsInfoFlip.this).getCount() > 1) {
                    SnsInfoFlip snsInfoFlip2 = SnsInfoFlip.this;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    MMPageControlView mMPageControlView = snsInfoFlip2.f278156a1;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    mMPageControlView.setVisibility(0);
                    SnsInfoFlip snsInfoFlip3 = SnsInfoFlip.this;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    MMPageControlView mMPageControlView2 = snsInfoFlip3.f278156a1;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    mMPageControlView2.setPage(i);
                }
                C101804kv2 kv22 = SnsInfoFlip.m122114x(SnsInfoFlip.this).mo132802l(i).f299180d;
                String str = SnsInfoFlip.m122114x(SnsInfoFlip.this).mo132802l(i).f299181e;
                SnsInfoFlip snsInfoFlip4 = SnsInfoFlip.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                snsInfoFlip4.mo132766A(kv22, i, str);
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                C19706a c = SnsInfoFlip.m122114x(SnsInfoFlip.this).mo129059c(i, true);
                if (c == null) {
                    c = SnsInfoFlip.m122114x(SnsInfoFlip.this).mo129061f(i, true);
                }
                SnsInfoFlip snsInfoFlip5 = SnsInfoFlip.this;
                SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                snsInfoFlip5.f278151W = c;
                SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                if (c != null) {
                    c.mo26059d();
                }
                SnsInfoFlip snsInfoFlip6 = SnsInfoFlip.this;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                Context context = snsInfoFlip6.f278145T;
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                if (context instanceof SnsBrowseUI) {
                    SnsInfoFlip snsInfoFlip7 = SnsInfoFlip.this;
                    SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    Context context2 = snsInfoFlip7.f278145T;
                    SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    ((SnsBrowseUI) context2).mo132608e8();
                }
                SnsInfoFlip.m122114x(SnsInfoFlip.this).mo132805o(i);
            }
            SnsMethodCalculate.markEndTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$d */
    public class C95551d implements View.OnTouchListener {
        public C95551d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsInfoFlip$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
            if (motionEvent.getAction() == 0) {
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
                SnsInfoFlip snsInfoFlip = SnsInfoFlip.this;
                int i = SnsInfoFlip.f278141p1;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                C19706a aVar = snsInfoFlip.f278151W;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                if (aVar instanceof View) {
                    SnsInfoFlip snsInfoFlip2 = SnsInfoFlip.this;
                    SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    C19706a aVar2 = snsInfoFlip2.f278151W;
                    SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    PointF c2 = C111557w.m152067c((View) aVar2, motionEvent.getRawX(), motionEvent.getRawY());
                    if (c2 != null) {
                        c.mo120962i("key_basescanui_touch_normalize_x", Float.valueOf(c2.x));
                        c.mo120962i("key_basescanui_touch_normalize_y", Float.valueOf(c2.y));
                    } else {
                        Log.m105920e("MicroMsg.SnsInfoFlip", "alvinluo get touchCoordinate is invalid");
                        c.mo120962i("key_basescanui_screen_position", Boolean.TRUE);
                        c.mo120962i("key_basescanui_screen_x", Float.valueOf(motionEvent.getRawX()));
                        c.mo120962i("key_basescanui_screen_y", Float.valueOf(motionEvent.getRawY()));
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$5");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$e */
    public class C95552e implements MMViewPager.C19705g {
        public C95552e() {
        }

        /* renamed from: a */
        public void mo26055a() {
            SnsMethodCalculate.markStartTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
            SnsInfoFlip snsInfoFlip = SnsInfoFlip.this;
            int i = SnsInfoFlip.f278141p1;
            SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            boolean z = snsInfoFlip.f278172x0;
            SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
            } else if (SnsInfoFlip.m122114x(SnsInfoFlip.this) == null) {
                Log.m105920e("MicroMsg.SnsInfoFlip", "longClickOver, adapter is null.");
                SnsMethodCalculate.markEndTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
            } else {
                C101829pp1 l = SnsInfoFlip.m122114x(SnsInfoFlip.this).mo132802l(SnsInfoFlip.m122110s(SnsInfoFlip.this).getCurrentItem());
                if (l == null || Util.isNullOrNil(l.f299181e)) {
                    SnsMethodCalculate.markEndTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
                    return;
                }
                SnsInfoFlip snsInfoFlip2 = SnsInfoFlip.this;
                View.OnLongClickListener onLongClickListener = snsInfoFlip2.f276776D;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(SnsInfoFlip.m122110s(snsInfoFlip2));
                }
                GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
                galleryTranslateReportStruct.f265619e = 1;
                SnsInfoFlip snsInfoFlip3 = SnsInfoFlip.this;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                boolean z2 = snsInfoFlip3.f278162g1;
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                if (z2) {
                    galleryTranslateReportStruct.f265620f = 6;
                } else {
                    galleryTranslateReportStruct.f265620f = 7;
                }
                C101804kv2 kv22 = SnsInfoFlip.m122114x(SnsInfoFlip.this).mo132802l(SnsInfoFlip.m122110s(SnsInfoFlip.this).getCurrentItem()).f299180d;
                galleryTranslateReportStruct.mo126621t(kv22.f298692g);
                galleryTranslateReportStruct.mo86054n();
                String str = kv22.f298689d;
                SnsInfoFlip.this.mo132156q(C94901o.m120385m(kv22), l.f299181e, str, true);
                SnsMethodCalculate.markEndTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$6");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$f */
    public class C95553f {

        /* renamed from: a */
        public int f278179a;

        /* renamed from: b */
        public int f278180b = -1;

        /* renamed from: c */
        public int f278181c;

        /* renamed from: d */
        public C101804kv2 f278182d;

        /* renamed from: e */
        public long f278183e = -1;

        /* renamed from: f */
        public long f278184f = -1;

        /* renamed from: g */
        public long f278185g = -1;

        /* renamed from: h */
        public String f278186h = "";

        /* renamed from: i */
        public String f278187i;

        public C95553f(SnsInfoFlip snsInfoFlip) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$g */
    public interface C95554g {
        /* renamed from: s5 */
        void mo132601s5(C101804kv2 kv22, int i, String str);
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h */
    public class C95555h extends C100120b1 {

        /* renamed from: g */
        public Context f278188g;

        /* renamed from: h */
        public int f278189h;

        /* renamed from: i */
        public boolean f278190i;

        /* renamed from: j */
        public String f278191j;

        /* renamed from: n */
        public Map<String, WeakReference<View>> f278192n = new HashMap();

        /* renamed from: o */
        public boolean f278193o = false;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h$a */
        public class C95556a implements C20382b {

            /* renamed from: a */
            public final /* synthetic */ C95559i f278195a;

            /* renamed from: b */
            public final /* synthetic */ int f278196b;

            /* renamed from: c */
            public final /* synthetic */ C101804kv2 f278197c;

            /* renamed from: d */
            public final /* synthetic */ boolean f278198d;

            public C95556a(C95559i iVar, int i, C101804kv2 kv22, boolean z) {
                this.f278195a = iVar;
                this.f278196b = i;
                this.f278197c = kv22;
                this.f278198d = z;
            }

            public void onImageLoadError(ImageDecodeResult imageDecodeResult) {
                SnsMethodCalculate.markStartTimeMs("onImageLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
                Log.m105928w("MicroMsg.SnsGalleryAdapter", "onImageLoadError, switch to multiTouchImageView");
                C95555h hVar = C95555h.this;
                C95559i iVar = this.f278195a;
                int i = this.f278196b;
                C101804kv2 kv22 = this.f278197c;
                boolean z = this.f278198d;
                SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                hVar.mo132806p(iVar, i, kv22, z);
                SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                SnsMethodCalculate.markEndTimeMs("onImageLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
            }

            public void onImageLoaded(Bitmap bitmap) {
                SnsMethodCalculate.markStartTimeMs("onImageLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
                Log.m105918d("MicroMsg.SnsGalleryAdapter", "pennqin, wxImageView, on image loaded.");
                this.f278195a.f278208b.setVisibility(8);
                this.f278195a.f278209c.setVisibility(8);
                if (SnsInfoFlip.m122110s(SnsInfoFlip.this) != null && this.f278196b == SnsInfoFlip.m122110s(SnsInfoFlip.this).getCurrentItem()) {
                    SnsInfoFlip snsInfoFlip = SnsInfoFlip.this;
                    WxImageView wxImageView = this.f278195a.f278211e;
                    SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    snsInfoFlip.f278151W = wxImageView;
                    SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                }
                SnsMethodCalculate.markEndTimeMs("onImageLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
            }

            public void onPreviewLoadError(ImageDecodeResult imageDecodeResult) {
                SnsMethodCalculate.markStartTimeMs("onPreviewLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
                SnsMethodCalculate.markEndTimeMs("onPreviewLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
            }

            public void onPreviewLoaded() {
                SnsMethodCalculate.markStartTimeMs("onPreviewLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
                Log.m105918d("MicroMsg.SnsGalleryAdapter", "pennqin, wxImageView, on preview loaded.");
                SnsMethodCalculate.markEndTimeMs("onPreviewLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
            }

            public void onPreviewReleased() {
                SnsMethodCalculate.markStartTimeMs("onPreviewReleased", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
                SnsMethodCalculate.markEndTimeMs("onPreviewReleased", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
            }

            public void onReady() {
                SnsMethodCalculate.markStartTimeMs("onReady", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
                SnsMethodCalculate.markEndTimeMs("onReady", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
            }

            public void onTileLoadError(ImageDecodeResult imageDecodeResult) {
                SnsMethodCalculate.markStartTimeMs("onTileLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
                SnsMethodCalculate.markEndTimeMs("onTileLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h$b */
        public class C95557b implements C94901o.C94915l {

            /* renamed from: a */
            public final /* synthetic */ C101804kv2 f278200a;

            /* renamed from: b */
            public final /* synthetic */ int f278201b;

            /* renamed from: c */
            public final /* synthetic */ C95559i f278202c;

            /* renamed from: d */
            public final /* synthetic */ C96983o3 f278203d;

            /* renamed from: e */
            public final /* synthetic */ boolean f278204e;

            /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h$b$a */
            public class C95558a implements Runnable {
                public C95558a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2$1");
                    C95557b.this.f278202c.f278208b.setVisibility(8);
                    C95557b.this.f278202c.f278209c.setVisibility(8);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2$1");
                }
            }

            public C95557b(C101804kv2 kv22, int i, C95559i iVar, C96983o3 o3Var, boolean z) {
                this.f278200a = kv22;
                this.f278201b = i;
                this.f278202c = iVar;
                this.f278203d = o3Var;
                this.f278204e = z;
            }

            /* renamed from: a */
            public void mo131160a(Bitmap bitmap) {
                String str;
                SnsMethodCalculate.markStartTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
                if (!C102236a0.m134740e(bitmap)) {
                    SnsInfoFlip snsInfoFlip = SnsInfoFlip.this;
                    int i = SnsInfoFlip.f278141p1;
                    SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    boolean z = snsInfoFlip.f278162g1;
                    SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    if (z && SnsInfoFlip.this.getSelectItem() != null) {
                        SnsInfoFlip snsInfoFlip2 = SnsInfoFlip.this;
                        String str2 = this.f278200a.f298689d;
                        String str3 = snsInfoFlip2.getSelectItem().f299181e;
                        C101804kv2 kv22 = this.f278200a;
                        SnsInfoFlip.m122112v(snsInfoFlip2, str2, str3, kv22.f298698p, kv22);
                    }
                }
                if (!C102236a0.m134740e(bitmap) && (str = this.f278200a.f298689d) != null && !str.startsWith("pre_temp_extend_pic")) {
                    Log.m105925i("MicroMsg.SnsGalleryAdapter", "big image not ready, set loading img. position: %d, media id: %s.", Integer.valueOf(this.f278201b), this.f278200a.f298689d);
                    this.f278202c.f278208b.setVisibility(0);
                    this.f278202c.f278209c.setVisibility(0);
                    this.f278202c.f278209c.setAlpha(0.1f);
                    this.f278202c.f278209c.animate().alpha(1.0f).setDuration(2000).setListener((Animator.AnimatorListener) null);
                    this.f278202c.f278210d.setVisibility(8);
                    this.f278202c.f278211e.setVisibility(8);
                    C94866e1.Fx0().mo131091K(this.f278202c.f278208b);
                    C94901o Fx0 = C94866e1.Fx0();
                    C101804kv2 kv23 = this.f278200a;
                    ImageView imageView = this.f278202c.f278208b;
                    C95555h hVar = C95555h.this;
                    SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    Context context = hVar.f278188g;
                    SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    Fx0.mo131114e0(kv23, imageView, C0966R.C0969drawable.f357116be3, context.hashCode(), this.f278203d);
                    if (this.f278204e) {
                        this.f278202c.f278209c.setVisibility(8);
                    }
                } else if (C102236a0.m134740e(bitmap)) {
                    Log.m105925i("MicroMsg.SnsGalleryAdapter", "pennqin, use multiTouchImageView, %s.", this.f278202c.f278210d);
                    this.f278202c.f278210d.setVisibility(0);
                    this.f278202c.f278211e.setVisibility(8);
                    MultiTouchImageView multiTouchImageView = this.f278202c.f278210d;
                    SnsInfoFlip snsInfoFlip3 = SnsInfoFlip.this;
                    int i2 = SnsInfoFlip.f278141p1;
                    SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    boolean z2 = snsInfoFlip3.f278150V0;
                    SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    multiTouchImageView.setEnableHorLongBmpMode(z2);
                    MultiTouchImageView multiTouchImageView2 = this.f278202c.f278210d;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    multiTouchImageView2.f348280o = width;
                    multiTouchImageView2.f348281p = height;
                    this.f278202c.f278210d.setImageBitmap((Bitmap) null);
                    this.f278202c.f278210d.setImageBitmap(bitmap);
                    this.f278202c.f278210d.post(new C95558a());
                    if (SnsInfoFlip.m122110s(SnsInfoFlip.this) != null && this.f278201b == SnsInfoFlip.m122110s(SnsInfoFlip.this).getCurrentItem()) {
                        SnsInfoFlip snsInfoFlip4 = SnsInfoFlip.this;
                        MultiTouchImageView multiTouchImageView3 = this.f278202c.f278210d;
                        SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        snsInfoFlip4.f278151W = multiTouchImageView3;
                        SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
            }
        }

        public C95555h(Context context) {
            this.f278188g = context;
            this.f278189h = SnsInfoFlip.m122111t(SnsInfoFlip.this).size();
            this.f278190i = ((C98950b) C86312j.m106911c(C98950b.class)).mo59100Qj();
        }

        /* renamed from: c */
        public MultiTouchImageView mo129059c(int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            View e = mo139420e(i);
            if (e == null) {
                Log.m105921e("MicroMsg.SnsGalleryAdapter", "position : %d getMultiTouchImageViewByPosition view is null.", Integer.valueOf(i));
                SnsMethodCalculate.markEndTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return null;
            }
            C95559i iVar = (C95559i) e.getTag();
            if (iVar == null) {
                Log.m105921e("MicroMsg.SnsGalleryAdapter", "position : %d getMultiTouchImageViewByPosition holder is null.", Integer.valueOf(i));
                SnsMethodCalculate.markEndTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return null;
            } else if (!z || iVar.f278210d.getVisibility() != 8) {
                MultiTouchImageView multiTouchImageView = iVar.f278210d;
                SnsMethodCalculate.markEndTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return multiTouchImageView;
            } else {
                SnsMethodCalculate.markEndTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return null;
            }
        }

        /* renamed from: d */
        public Object mo129060d(int i, View view, ViewGroup viewGroup) {
            OnlineVideoView onlineVideoView;
            OnlineVideoView onlineVideoView2;
            SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            if (mo132802l(i).f299180d.f298690e == 6) {
                SnsMethodCalculate.markStartTimeMs("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Boolean.valueOf(view == null);
                Log.m105919d("MicroMsg.SnsGalleryAdapter", "fill view online sight %d convert view is null %b.", objArr);
                C101829pp1 l = mo132802l(i);
                if (l == null) {
                    Log.m105928w("MicroMsg.SnsGalleryAdapter", "fill online sight view, but flip item is null.");
                    SnsMethodCalculate.markEndTimeMs("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    onlineVideoView = view;
                } else {
                    String str = l.f299181e;
                    if (Util.isNullOrNil(str)) {
                        Log.m105928w("MicroMsg.SnsGalleryAdapter", "fill online sight view, but sns local id is null.");
                        SnsMethodCalculate.markEndTimeMs("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        onlineVideoView = view;
                    } else {
                        WeakReference weakReference = (WeakReference) ((HashMap) this.f278192n).get(str);
                        if (weakReference == null || weakReference.get() == null) {
                            OnlineVideoView onlineVideoView3 = new OnlineVideoView(this.f278188g, (AttributeSet) null);
                            ((HashMap) this.f278192n).put(str, new WeakReference(onlineVideoView3));
                            onlineVideoView2 = onlineVideoView3;
                        } else {
                            onlineVideoView2 = (OnlineVideoView) weakReference.get();
                        }
                        onlineVideoView2.getClass();
                        SnsMethodCalculate.markStartTimeMs("enableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView2.f277202l1 = null;
                        onlineVideoView2.f277203m1 = true;
                        SnsMethodCalculate.markEndTimeMs("enableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        if (Util.isEqual(str, this.f278191j)) {
                            mo132803m(i);
                        }
                        Log.m105925i("MicroMsg.SnsGalleryAdapter", "return online sight view %d parent id %s.", Integer.valueOf(onlineVideoView2.hashCode()), l.f299181e);
                        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
                        if (DN != null) {
                            SnsInfoFlip snsInfoFlip = SnsInfoFlip.this;
                            SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                            int i2 = snsInfoFlip.f278165j1;
                            SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                            onlineVideoView2.setScene(i2);
                            onlineVideoView2.setSessionId(new C77710q(C86709a0.m107523b().mo121110g()).toString() + "_" + Util.nowMilliSecond());
                            onlineVideoView2.setSessionTimestamp(Util.nowMilliSecond());
                            onlineVideoView2.setSnsId(C102236a0.m134765q0(DN.field_snsId));
                            onlineVideoView2.setFilePath(C94867e2.m120295n(l.f299180d));
                            if (C85875k4.m106208w() || C85875k4.m106157N()) {
                                onlineVideoView2.setVideoScaleType(C96814a.C96817e.CONTAIN);
                            } else {
                                onlineVideoView2.setVideoScaleType(C96814a.C96817e.DEFAULT);
                            }
                            if (C61104a.m71668x()) {
                                onlineVideoView2.setMute(true);
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("fillViewOnlineSight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        onlineVideoView = onlineVideoView2;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return onlineVideoView;
            }
            View k = mo132801k(i, view, viewGroup);
            SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return k;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            SnsMethodCalculate.markStartTimeMs("destroyItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            viewGroup.removeView((View) obj);
            super.destroyItem(viewGroup, i, obj);
            SnsMethodCalculate.markEndTimeMs("destroyItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }

        /* renamed from: f */
        public WxImageView mo129061f(int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            View e = mo139420e(i);
            if (e == null) {
                Log.m105921e("MicroMsg.SnsGalleryAdapter", "position : %d getWxImageViewByPosition view is null.", Integer.valueOf(i));
                SnsMethodCalculate.markEndTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return null;
            }
            C95559i iVar = (C95559i) e.getTag();
            if (iVar == null) {
                Log.m105921e("MicroMsg.SnsGalleryAdapter", "position : %d getWxImageViewByPosition holder is null.", Integer.valueOf(i));
                SnsMethodCalculate.markEndTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return null;
            } else if (!z || iVar.f278211e.getVisibility() != 8) {
                WxImageView wxImageView = iVar.f278211e;
                SnsMethodCalculate.markEndTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return wxImageView;
            } else {
                SnsMethodCalculate.markEndTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return null;
            }
        }

        public int getCount() {
            SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            int size = SnsInfoFlip.m122111t(SnsInfoFlip.this) == null ? 0 : SnsInfoFlip.m122111t(SnsInfoFlip.this).size();
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return size;
        }

        public int getItemPosition(Object obj) {
            SnsMethodCalculate.markStartTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            if (this.f278193o) {
                SnsMethodCalculate.markEndTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return -2;
            }
            int itemPosition = super.getItemPosition(obj);
            SnsMethodCalculate.markEndTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return itemPosition;
        }

        /* renamed from: j */
        public final void mo132800j(int i) {
            String str;
            SnsMethodCalculate.markStartTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            C101804kv2 kv22 = mo132802l(i).f299180d;
            C96983o3 o3Var = SnsInfoFlip.this.f276773A;
            int i2 = mo132802l(i).f299182f;
            C96983o3 o3Var2 = new C96983o3(o3Var.f284144a);
            o3Var2.f284145b = i2;
            int i3 = 2;
            if (kv22.f298690e != 2) {
                SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return;
            }
            boolean e = C100417r0.m131416e(mo132802l(i).f299181e);
            C94866e1.Fx0().getClass();
            SnsMethodCalculate.markStartTimeMs("tryGetSnsBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            boolean z = false;
            String str2 = kv22.f298689d;
            if (str2 == null || str2.equals("")) {
                SnsMethodCalculate.markEndTimeMs("tryGetSnsBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            } else {
                if (kv22.f298689d.startsWith("Locall_path")) {
                    str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134731Z(kv22);
                } else {
                    str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134722Q(kv22);
                }
                if (!C86013q1.m106450k(str)) {
                    C94853e Vx0 = C94866e1.Vx0();
                    if (e) {
                        i3 = 8;
                    }
                    Vx0.mo130979d(kv22, i3, (C102268v) null, o3Var2);
                    SnsMethodCalculate.markEndTimeMs("tryGetSnsBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    z = true;
                    SnsMethodCalculate.markEndTimeMs("tryGetSnsBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
            }
            SnsInfoFlip snsInfoFlip = SnsInfoFlip.this;
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            boolean z2 = snsInfoFlip.f278162g1;
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (z2 && !z) {
                SnsInfoFlip snsInfoFlip2 = SnsInfoFlip.this;
                SnsInfoFlip.m122112v(snsInfoFlip2, kv22.f298689d, snsInfoFlip2.getSelectItem().f299181e, kv22.f298698p, kv22);
            }
            SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0130  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0153  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0157  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0266  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x026c  */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.View mo132801k(int r21, android.view.View r22, android.view.ViewGroup r23) {
            /*
                r20 = this;
                r6 = r20
                r7 = r21
                java.lang.String r8 = "fillViewImage"
                java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
                te3.pp1 r0 = r20.mo132802l(r21)
                te3.kv2 r0 = r0.f299180d
                if (r22 == 0) goto L_0x0024
                java.lang.Object r1 = r22.getTag()
                if (r1 != 0) goto L_0x001a
                goto L_0x0024
            L_0x001a:
                java.lang.Object r1 = r22.getTag()
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip$i r1 = (com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.C95559i) r1
                r10 = r22
                r11 = r1
                goto L_0x006d
            L_0x0024:
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip$i r1 = new com.tencent.mm.plugin.sns.ui.SnsInfoFlip$i
                r1.<init>()
                android.content.Context r2 = r6.f278188g
                r3 = 2131497663(0x7f0c12bf, float:1.8618925E38)
                r4 = 0
                android.view.View r2 = android.view.View.inflate(r2, r3, r4)
                r3 = 2131305332(0x7f092374, float:1.8228832E38)
                android.view.View r3 = r2.findViewById(r3)
                r1.f278207a = r3
                r3 = 2131308032(0x7f092e00, float:1.8234308E38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r1.f278208b = r3
                r3 = 2131308039(0x7f092e07, float:1.8234322E38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
                r1.f278209c = r3
                r3 = 2131309629(0x7f09343d, float:1.8237547E38)
                android.view.View r3 = r2.findViewById(r3)
                com.tencent.mm.ui.base.MultiTouchImageView r3 = (com.tencent.p014mm.p136ui.base.MultiTouchImageView) r3
                r1.f278210d = r3
                r3 = 2131317277(0x7f09521d, float:1.825306E38)
                android.view.View r3 = r2.findViewById(r3)
                com.tencent.mm.ui.base.WxImageView r3 = (com.tencent.p014mm.p136ui.base.WxImageView) r3
                r1.f278211e = r3
                r2.setTag(r1)
                r11 = r1
                r10 = r2
            L_0x006d:
                r1 = 3
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
                r12 = 0
                r2[r12] = r3
                java.lang.String r3 = r0.f298689d
                r4 = 1
                r2[r4] = r3
                com.tencent.mm.ui.base.MultiTouchImageView r3 = r11.f278210d
                r5 = 2
                r2[r5] = r3
                java.lang.String r3 = "MicroMsg.SnsGalleryAdapter"
                java.lang.String r13 = "gallery position %d, media id: %s, %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r13, r2)
                com.tencent.mm.ui.base.WxImageView r2 = r11.f278211e
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.this
                android.content.res.Resources r13 = r13.getResources()
                r14 = 2131836938(0x7f11400a, float:1.9307057E38)
                java.lang.String r13 = r13.getString(r14)
                java.lang.Object[] r15 = new java.lang.Object[r5]
                int r1 = r7 + 1
                java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
                r15[r12] = r16
                int r16 = r20.getCount()
                java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
                r15[r4] = r16
                java.lang.String r13 = java.lang.String.format(r13, r15)
                r2.setContentDescription(r13)
                com.tencent.mm.ui.base.MultiTouchImageView r2 = r11.f278210d
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.this
                android.content.res.Resources r13 = r13.getResources()
                java.lang.String r13 = r13.getString(r14)
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
                r14[r12] = r15
                int r15 = r20.getCount()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r14[r4] = r15
                java.lang.String r13 = java.lang.String.format(r13, r14)
                r2.setContentDescription(r13)
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.this
                java.lang.String r13 = "access$1500"
                java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
                java.lang.String r2 = r2.f278159d1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x00ff
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
                java.lang.String r2 = r2.f278159d1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
                java.lang.String r13 = r0.f298689d
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x00ff
                r13 = 1
                goto L_0x0100
            L_0x00ff:
                r13 = 0
            L_0x0100:
                java.lang.String r2 = r0.f298689d
                java.lang.String r15 = "Locall_path"
                boolean r2 = r2.startsWith(r15)
                if (r2 == 0) goto L_0x017b
                te3.pp1 r2 = r20.mo132802l(r21)
                java.lang.String r2 = r2.f299181e
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x017b
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.this
                java.lang.String r15 = "access$1600"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r14)
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.sns.storage.SnsInfo> r2 = r2.f278168m1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
                te3.pp1 r5 = r20.mo132802l(r21)
                java.lang.String r5 = r5.f299181e
                java.lang.Object r2 = r2.get(r5)
                com.tencent.mm.plugin.sns.storage.SnsInfo r2 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r2
                if (r2 != 0) goto L_0x0151
                os2.e0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
                te3.pp1 r5 = r20.mo132802l(r21)
                java.lang.String r5 = r5.f299181e
                com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r2.mo139798DN(r5)
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r14)
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.sns.storage.SnsInfo> r5 = r5.f278168m1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
                te3.pp1 r15 = r20.mo132802l(r21)
                java.lang.String r15 = r15.f299181e
                r5.put(r15, r2)
            L_0x0151:
                if (r2 != 0) goto L_0x0157
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                return r10
            L_0x0157:
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r2.getTimeLine()
                te3.j00 r5 = r2.ContentObj
                java.util.LinkedList<te3.kv2> r5 = r5.f298427h
                int r5 = r5.size()
                te3.pp1 r15 = r20.mo132802l(r21)
                int r15 = r15.f299183g
                if (r5 <= r15) goto L_0x017b
                te3.j00 r0 = r2.ContentObj
                java.util.LinkedList<te3.kv2> r0 = r0.f298427h
                te3.pp1 r2 = r20.mo132802l(r21)
                int r2 = r2.f299183g
                java.lang.Object r0 = r0.get(r2)
                te3.kv2 r0 = (te3.C101804kv2) r0
            L_0x017b:
                r15 = r0
                java.lang.String r5 = com.tencent.p014mm.plugin.sns.model.C94901o.m120385m(r15)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r0 != 0) goto L_0x0254
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.this
                java.lang.String r2 = "access$1700"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r14)
                r0.getClass()
                java.lang.String r0 = "isUseWxImageView"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r14)
                java.lang.String r16 = com.tencent.p014mm.vfs.C86013q1.m106448i(r5, r12)
                boolean r16 = pr3.C89436a.m111810b(r16)
                boolean r17 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r17 != 0) goto L_0x01af
                boolean r17 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r17 != 0) goto L_0x01af
                boolean r17 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r17 == 0) goto L_0x01ab
                goto L_0x01af
            L_0x01ab:
                r4 = 3
                r17 = 0
                goto L_0x01b2
            L_0x01af:
                r4 = 3
                r17 = 1
            L_0x01b2:
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Boolean r18 = java.lang.Boolean.valueOf(r16)
                r4[r12] = r18
                java.lang.Boolean r17 = java.lang.Boolean.valueOf(r17)
                r18 = 1
                r4[r18] = r17
                r17 = 2
                r4[r17] = r5
                java.lang.String r12 = "MicroMsg.SnsInfoFlip"
                r23 = r1
                java.lang.String r1 = "isSupport: %s, isInnerVersion: %s, path: %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r14)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r14)
                if (r16 == 0) goto L_0x024b
                java.lang.String r0 = "pennqin, use wxImageView."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r11.f278210d
                r1 = 8
                r0.setVisibility(r1)
                com.tencent.mm.ui.base.WxImageView r0 = r11.f278211e
                r1 = 0
                r0.setVisibility(r1)
                android.graphics.BitmapFactory$Options r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r5)
                if (r0 == 0) goto L_0x0242
                int r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r5)
                com.tencent.mm.ui.base.WxImageView r2 = r11.f278211e
                r2.setOrientation(r1)
                com.tencent.mm.ui.base.WxImageView r1 = r11.f278211e
                int r2 = r0.outWidth
                int r0 = r0.outHeight
                r1.f48889h = r2
                r1.f48890i = r0
                r1.mo26059d()
                com.tencent.mm.ui.base.WxImageView r12 = r11.f278211e
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h$a r14 = new com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h$a
                r0 = r14
                r4 = r23
                r1 = r20
                r2 = r11
                r3 = r21
                r23 = r10
                r10 = r4
                r4 = r15
                r16 = r8
                r8 = r5
                r5 = r13
                r0.<init>(r2, r3, r4, r5)
                r12.setOnImageLoadEventListener(r14)
                java.lang.String r0 = com.tencent.p014mm.plugin.sns.model.C94901o.m120386o(r15)
                r1 = 0
                java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r1)
                java.lang.String r0 = android.net.Uri.encode(r0)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 != 0) goto L_0x025c
                com.tencent.mm.ui.base.WxImageView r2 = r11.f278211e
                java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r8, r1)
                com.davemorrissey.labs.subscaleview.view.ImageSource r0 = com.davemorrissey.labs.subscaleview.view.ImageSource.uri((java.lang.String) r0)
                r2.mo21400p(r1, r0)
                goto L_0x025c
            L_0x0242:
                r16 = r8
                r19 = r10
                r10 = r23
                r23 = r19
                goto L_0x025c
            L_0x024b:
                r16 = r8
                r19 = r10
                r10 = r23
                r23 = r19
                goto L_0x0259
            L_0x0254:
                r16 = r8
                r23 = r10
                r10 = r1
            L_0x0259:
                r6.mo132806p(r11, r7, r15, r13)
            L_0x025c:
                java.lang.String r0 = "preImageView"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)
                boolean r1 = r6.f278190i
                if (r1 != 0) goto L_0x026c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
            L_0x0269:
                r0 = r16
                goto L_0x029e
            L_0x026c:
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.this
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.m122114x(r1)
                if (r1 != 0) goto L_0x0278
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
                goto L_0x0269
            L_0x0278:
                android.content.Context r1 = r6.f278188g
                boolean r1 = com.tencent.p014mm.network.C114786m0.m161568a(r1)
                if (r1 != 0) goto L_0x0284
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
                goto L_0x0269
            L_0x0284:
                int r1 = r7 + -1
                if (r1 < 0) goto L_0x028b
                r6.mo132800j(r1)
            L_0x028b:
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.this
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.m122114x(r1)
                int r1 = r1.getCount()
                if (r10 >= r1) goto L_0x029a
                r6.mo132800j(r10)
            L_0x029a:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
                goto L_0x0269
            L_0x029e:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
                return r23
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.C95555h.mo132801k(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        /* renamed from: l */
        public C101829pp1 mo132802l(int i) {
            SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            if (i >= SnsInfoFlip.m122111t(SnsInfoFlip.this).size() || i < 0) {
                SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return null;
            }
            C101829pp1 pp12 = (C101829pp1) SnsInfoFlip.m122111t(SnsInfoFlip.this).get(i);
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return pp12;
        }

        /* renamed from: m */
        public final void mo132803m(int i) {
            SnsMethodCalculate.markStartTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            C101829pp1 l = mo132802l(i);
            if (l == null) {
                Log.m105928w("MicroMsg.SnsGalleryAdapter", "notify online sight play, but flip item is null.");
                SnsMethodCalculate.markEndTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return;
            }
            String str = l.f299181e;
            if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.SnsGalleryAdapter", "notify online sight play, but sns local id is null.");
                SnsMethodCalculate.markEndTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return;
            }
            Log.m105925i("MicroMsg.SnsGalleryAdapter", "notify online sight play pos %s sns local id %s.", Integer.valueOf(i), str);
            WeakReference weakReference = (WeakReference) ((HashMap) this.f278192n).get(str);
            if (weakReference == null) {
                Log.m105928w("MicroMsg.SnsGalleryAdapter", "notify online sight play, but view cache is null.");
                this.f278191j = str;
                SnsMethodCalculate.markEndTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return;
            }
            OnlineVideoView onlineVideoView = (OnlineVideoView) weakReference.get();
            if (onlineVideoView == null) {
                Log.m105929w("MicroMsg.SnsGalleryAdapter", "online sight view is null, do nothing. snsLocalId %s.", str);
                this.f278191j = str;
            } else {
                Log.m105925i("MicroMsg.SnsGalleryAdapter", "%d notify online sight play video %s.", Integer.valueOf(onlineVideoView.hashCode()), str);
                this.f278191j = null;
                SnsMethodCalculate.markStartTimeMs("regSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                Log.m105919d(onlineVideoView.f277187d, "%d register sns ui event", Integer.valueOf(onlineVideoView.hashCode()));
                onlineVideoView.f277216s1.alive();
                SnsMethodCalculate.markEndTimeMs("regSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                onlineVideoView.mo132324P(l.f299180d, l.f299181e, l.f299182f);
                SnsFlipUIEvent snsFlipUIEvent = new SnsFlipUIEvent();
                SnsFlipUIEvent.C92577a aVar = snsFlipUIEvent.f265148d;
                aVar.f265150b = 1;
                aVar.f265151c = str;
                snsFlipUIEvent.publish();
            }
            SnsMethodCalculate.markEndTimeMs("notifyOnlineSightPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }

        /* renamed from: n */
        public void mo132804n() {
            SnsMethodCalculate.markStartTimeMs("notifyOnlineSightStop", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            Log.m105925i("MicroMsg.SnsGalleryAdapter", "notify online sight stop %s", Util.getStack());
            SnsFlipUIEvent snsFlipUIEvent = new SnsFlipUIEvent();
            SnsFlipUIEvent.C92577a aVar = snsFlipUIEvent.f265148d;
            aVar.f265149a = this.f278188g;
            aVar.f265151c = this.f278191j;
            aVar.f265150b = 2;
            snsFlipUIEvent.publish();
            this.f278191j = null;
            SnsMethodCalculate.markEndTimeMs("notifyOnlineSightStop", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }

        public void notifyDataSetChanged() {
            SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            this.f278193o = true;
            super.notifyDataSetChanged();
            this.f278193o = false;
            int size = SnsInfoFlip.m122111t(SnsInfoFlip.this).size();
            this.f278189h = size;
            Log.m105919d("MicroMsg.SnsGalleryAdapter", "items.size: %d.", Integer.valueOf(size));
            if (this.f278189h <= 0) {
                SnsInfoFlip snsInfoFlip = SnsInfoFlip.this;
                SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                Runnable runnable = snsInfoFlip.f278157b1;
                SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                if (runnable != null) {
                    SnsInfoFlip snsInfoFlip2 = SnsInfoFlip.this;
                    SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    Runnable runnable2 = snsInfoFlip2.f278157b1;
                    SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    runnable2.run();
                }
            }
            SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }

        /* renamed from: o */
        public boolean mo132805o(int i) {
            SnsMethodCalculate.markStartTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            View e = mo139420e(i);
            if (e != null && mo129059c(i, true) == null && mo129061f(i, true) == null) {
                mo132801k(i, e, (ViewGroup) null);
                SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                return true;
            }
            SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            return false;
        }

        /* renamed from: p */
        public final void mo132806p(C95559i iVar, int i, C101804kv2 kv22, boolean z) {
            int i2 = i;
            SnsMethodCalculate.markStartTimeMs("useMultiTouchImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            C96983o3 o3Var = SnsInfoFlip.this.f276773A;
            int i3 = mo132802l(i2).f299182f;
            C96983o3 o3Var2 = new C96983o3(o3Var.f284144a);
            o3Var2.f284145b = i3;
            C95559i iVar2 = iVar;
            C94866e1.Fx0().mo131127l(kv22, iVar2.f278210d, this.f278188g.hashCode(), !z, o3Var2, C100417r0.m131416e(mo132802l(i2).f299181e), new C95557b(kv22, i, iVar2, o3Var2, z));
            SnsMethodCalculate.markEndTimeMs("useMultiTouchImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$i */
    public static class C95559i {

        /* renamed from: a */
        public View f278207a;

        /* renamed from: b */
        public ImageView f278208b;

        /* renamed from: c */
        public ProgressBar f278209c;

        /* renamed from: d */
        public MultiTouchImageView f278210d;

        /* renamed from: e */
        public WxImageView f278211e;
    }

    public SnsInfoFlip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m122109m(context);
    }

    private int getReportNetworkType() {
        SnsMethodCalculate.markStartTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        Context context = MMApplicationContext.getContext();
        if (NetStatusUtil.is2G(context)) {
            SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 1;
        } else if (NetStatusUtil.is3G(context)) {
            SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 2;
        } else if (NetStatusUtil.is4G(context)) {
            SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 3;
        } else if (NetStatusUtil.isWifi(context)) {
            SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 4;
        } else {
            SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 0;
        }
    }

    /* renamed from: m */
    private void m122109m(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278164i1 = System.currentTimeMillis();
        this.f278145T = context;
        MMViewPager mMViewPager = (MMViewPager) View.inflate(context, C0966R.C0971layout.c3_, this).findViewById(C0966R.C0970id.ehh);
        this.f278147U = mMViewPager;
        mMViewPager.setVerticalFadingEdgeEnabled(false);
        this.f278147U.setHorizontalFadingEdgeEnabled(false);
        this.f278147U.setOffscreenPageLimit(1);
        this.f278147U.setSingleClickOverListener(new C95548a());
        MMPageControlView mMPageControlView = (MMPageControlView) findViewById(C0966R.C0970id.lpk);
        this.f278156a1 = mMPageControlView;
        mMPageControlView.setIndicatorLayoutRes(C0966R.C0971layout.c59);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f278156a1.getLayoutParams();
        layoutParams.bottomMargin += C75044y4.m89991c(getContext());
        this.f278156a1.setLayoutParams(layoutParams);
        C102236a0.f301038b = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_big_pic_bound, 3200);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: s */
    public static /* synthetic */ MMViewPager m122110s(SnsInfoFlip snsInfoFlip) {
        SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        MMViewPager mMViewPager = snsInfoFlip.f278147U;
        SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return mMViewPager;
    }

    /* renamed from: t */
    public static /* synthetic */ List m122111t(SnsInfoFlip snsInfoFlip) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        List<C101829pp1> list = snsInfoFlip.f278153X0;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return list;
    }

    /* renamed from: v */
    public static void m122112v(SnsInfoFlip snsInfoFlip, String str, String str2, C101817mv2 mv22, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        snsInfoFlip.getClass();
        SnsMethodCalculate.markStartTimeMs("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        Log.printInfoStack("MicroMsg.SnsInfoFlip", "recordLoadStart, bigPicId:%s, mediaId:%s", str, kv22 != null ? kv22.f298689d : "");
        if (!snsInfoFlip.f278170o1.containsKey(str)) {
            C95553f fVar = new C95553f(snsInfoFlip);
            fVar.f278179a = snsInfoFlip.getCount();
            fVar.f278186h = str2;
            fVar.f278181c = snsInfoFlip.getReportNetworkType();
            fVar.f278183e = System.currentTimeMillis();
            fVar.f278187i = str;
            fVar.f278182d = kv22;
            snsInfoFlip.f278170o1.put(str, fVar);
            Log.m105918d("MicroMsg.SnsInfoFlip", "recordLoadStart, put to map");
        }
        SnsMethodCalculate.markEndTimeMs("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: w */
    public static void m122113w(SnsInfoFlip snsInfoFlip) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        snsInfoFlip.getClass();
        SnsMethodCalculate.markStartTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        Context context = snsInfoFlip.f278145T;
        if (context instanceof SnsBrowseUI) {
            ((SnsBrowseUI) context).mo132609f8();
        } else if (snsInfoFlip.f278146T0) {
            ((MMActivity) context).finish();
            SnsMethodCalculate.markEndTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        } else {
            snsInfoFlip.f278158c1.post(new C96244v4(snsInfoFlip));
        }
        SnsMethodCalculate.markEndTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: x */
    public static /* synthetic */ C95555h m122114x(SnsInfoFlip snsInfoFlip) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C95555h hVar = snsInfoFlip.f278149V;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02ac  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo132766A(te3.C101804kv2 r20, int r21, java.lang.String r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "onMediaSelect"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip$g r6 = r0.f278167l1
            if (r6 == 0) goto L_0x0017
            r6.mo132601s5(r1, r2, r3)
        L_0x0017:
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r6.mo139798DN(r3)
            if (r6 == 0) goto L_0x0024
            ft2.C97979c.m126546k(r6, r2)
        L_0x0024:
            int r6 = r0.f278160e1
            r7 = -1
            if (r6 != r7) goto L_0x002b
            r0.f278160e1 = r2
        L_0x002b:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            r7 = 0
            java.lang.String r8 = " / "
            java.lang.String r9 = ""
            r10 = 1
            if (r6 == 0) goto L_0x005e
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h r6 = r0.f278149V
            if (r6 == 0) goto L_0x005e
            int r1 = r6.getCount()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            int r2 = r2 + r10
            r3.append(r2)
            r3.append(r8)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.mm.plugin.sns.ui.GalleryTitleManager$c r2 = r0.f276794h
            r2.mo132178p7(r1, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x005e:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.sns.storage.SnsInfo> r6 = r0.f278168m1
            java.lang.Object r6 = r6.get(r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r6
            if (r6 != 0) goto L_0x0075
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r6.mo139798DN(r3)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.sns.storage.SnsInfo> r11 = r0.f278168m1
            r11.put(r3, r6)
        L_0x0075:
            if (r6 != 0) goto L_0x007b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x007b:
            int r11 = r1.f298690e
            r12 = 6
            if (r11 == r12) goto L_0x008c
            com.tencent.mm.sdk.platformtools.MMHandler r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip$b r12 = new com.tencent.mm.plugin.sns.ui.SnsInfoFlip$b
            r12.<init>()
            r11.post(r12)
        L_0x008c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "onItemSelected "
            r11.append(r12)
            r11.append(r2)
            java.lang.String r12 = " localId "
            r11.append(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "MicroMsg.SnsInfoFlip"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r11)
            int r11 = r0.f278161f1
            if (r11 == r2) goto L_0x020a
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r11 = r0.f278173y0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r21)
            boolean r11 = r11.containsKey(r13)
            if (r11 == 0) goto L_0x00cc
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r11 = r0.f278173y0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r21)
            java.lang.Object r11 = r11.get(r14)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            goto L_0x00cd
        L_0x00cc:
            r11 = 0
        L_0x00cd:
            int r11 = r11 + r10
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r14 = r0.f278173y0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r21)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14.put(r15, r11)
            java.util.HashMap<java.lang.Integer, java.lang.Long> r11 = r0.f278142Q0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r21)
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r11.put(r14, r15)
            int r11 = r0.f278161f1
            if (r11 < 0) goto L_0x0187
            java.util.HashMap<java.lang.Integer, java.lang.Long> r14 = r0.f278142Q0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r14.containsKey(r11)
            r14 = 0
            if (r11 == 0) goto L_0x0111
            java.util.HashMap<java.lang.Integer, java.lang.Long> r11 = r0.f278142Q0
            int r7 = r0.f278161f1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r11.get(r7)
            java.lang.Long r7 = (java.lang.Long) r7
            long r17 = r7.longValue()
            goto L_0x0113
        L_0x0111:
            r17 = r14
        L_0x0113:
            int r7 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x0187
            java.util.HashMap<java.lang.Integer, java.lang.Long> r7 = r0.f278142Q0
            int r11 = r0.f278161f1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r7.put(r11, r13)
            java.util.HashMap<java.lang.Integer, java.lang.Long> r7 = r0.f278143R0
            int r11 = r0.f278161f1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r7 = r7.containsKey(r11)
            if (r7 == 0) goto L_0x0146
            java.util.HashMap<java.lang.Integer, java.lang.Long> r7 = r0.f278143R0
            int r11 = r0.f278161f1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r7 = r7.get(r11)
            java.lang.Long r7 = (java.lang.Long) r7
            long r14 = r7.longValue()
        L_0x0146:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r17)
            long r14 = r14 + r10
            java.util.HashMap<java.lang.Integer, java.lang.Long> r13 = r0.f278143R0
            int r7 = r0.f278161f1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r13.put(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "curSelectPosition "
            r1.append(r7)
            int r7 = r0.f278161f1
            r1.append(r7)
            java.lang.String r7 = " curtime "
            r1.append(r7)
            r1.append(r14)
            java.lang.String r7 = " passtime "
            r1.append(r7)
            double r10 = (double) r10
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r10 = r10 / r13
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
        L_0x0187:
            boolean r1 = r0.f278162g1
            if (r1 == 0) goto L_0x020a
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h r1 = r0.f278149V
            if (r1 == 0) goto L_0x020a
            int r7 = r0.f278161f1
            te3.pp1 r1 = r1.mo132802l(r7)
            if (r1 == 0) goto L_0x020a
            te3.kv2 r1 = r1.f299180d
            java.lang.String r1 = r1.f298689d
            java.lang.String r10 = "recordMediaScrollOver"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r5)
            r7 = 1
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r13 = 0
            r11[r13] = r1
            java.lang.String r13 = "recordMediaScrollOver, bigPicId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r13, r11)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.sns.ui.SnsInfoFlip$f> r11 = r0.f278170o1
            boolean r11 = r11.containsKey(r1)
            if (r11 == 0) goto L_0x0205
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.sns.ui.SnsInfoFlip$f> r11 = r0.f278170o1
            java.lang.Object r1 = r11.get(r1)
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip$f r1 = (com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.C95553f) r1
            int r11 = r19.getReportNetworkType()
            r1.f278181c = r11
            long r13 = r1.f278184f
            r17 = -1
            int r11 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r11 == 0) goto L_0x01e5
            r7 = 1
            r1.f278180b = r7
            r11 = r8
            long r7 = r1.f278183e
            long r13 = r13 - r7
            r1.f278185g = r13
            r1 = 1
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r13 = 0
            r8[r13] = r1
            java.lang.String r1 = "recordMediaScrollOver, load success, costTime:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r1, r8)
            goto L_0x0206
        L_0x01e5:
            r11 = r8
            r8 = 2
            r1.f278180b = r8
            long r13 = java.lang.System.currentTimeMillis()
            r1.f278184f = r13
            long r7 = r1.f278183e
            long r13 = r13 - r7
            r1.f278185g = r13
            r1 = 1
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r13 = 0
            r8[r13] = r1
            java.lang.String r1 = "recordMediaScrollOver, load failed, costTime:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r1, r8)
            goto L_0x0206
        L_0x0205:
            r11 = r8
        L_0x0206:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r5)
            goto L_0x020b
        L_0x020a:
            r11 = r8
        L_0x020b:
            r0.f278161f1 = r2
            com.tencent.mm.plugin.sns.ui.z0 r1 = r0.f276793g
            if (r1 == 0) goto L_0x0214
            r1.mo133641a(r3)
        L_0x0214:
            int r1 = r6.getCreateTime()
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r6.getTimeLine()
            android.content.Context r8 = r0.f278145T
            long r12 = (long) r1
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            java.lang.String r1 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.m123537c(r8, r12)
            if (r6 == 0) goto L_0x025e
            te3.j00 r8 = r6.ContentObj
            if (r8 == 0) goto L_0x025e
            java.util.LinkedList<te3.kv2> r8 = r8.f298427h
            int r8 = r8.size()
            r7 = 1
            if (r8 <= r7) goto L_0x025e
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h r8 = r0.f278149V
            if (r8 == 0) goto L_0x025e
            te3.j00 r6 = r6.ContentObj
            java.util.LinkedList<te3.kv2> r6 = r6.f298427h
            int r6 = r6.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h r10 = r0.f278149V
            te3.pp1 r10 = r10.mo132802l(r2)
            int r10 = r10.f299183g
            int r10 = r10 + r7
            r8.append(r10)
            r8.append(r11)
            r8.append(r6)
            java.lang.String r7 = r8.toString()
            goto L_0x025f
        L_0x025e:
            r7 = 0
        L_0x025f:
            com.tencent.mm.plugin.sns.ui.GalleryTitleManager$c r6 = r0.f276794h
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r9)
            java.lang.String r1 = r8.toString()
            r6.mo132178p7(r1, r7)
            com.tencent.mm.plugin.sns.ui.GalleryTitleManager$c r1 = r0.f276794h
            r1.mo132030m1(r3, r2)
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip$h r1 = r0.f278149V
            if (r1 == 0) goto L_0x0289
            java.lang.String r6 = "access$400"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r1.mo132803m(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
        L_0x0289:
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.FlipView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            r0.f276785M = r3
            r2 = r20
            r0.f276786N = r2
            java.lang.String r2 = av2.C92125p.m115797b(r3, r2)
            java.lang.String r3 = "dispatchMediaChange"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            com.tencent.mm.plugin.sns.ui.FlipView$$a r6 = new com.tencent.mm.plugin.sns.ui.FlipView$$a
            r6.<init>(r0, r2)
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            if (r2 != r7) goto L_0x02af
            r6.run()
        L_0x02af:
            zt3.t r2 = zt3.C119157j.f356862d
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183895z(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.mo132766A(te3.kv2, int, java.lang.String):void");
    }

    /* renamed from: B */
    public void mo132767B() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276804u = null;
        this.f276805v = "";
        this.f276806w = null;
        if (this.f276809z != null) {
            CancelDealQBarStrEvent cancelDealQBarStrEvent = new CancelDealQBarStrEvent();
            CancelDealQBarStrEvent.C92466a aVar = cancelDealQBarStrEvent.f264642d;
            aVar.f264644b = (Activity) this.f276797n;
            aVar.f264643a = this.f276809z.f273113d;
            cancelDealQBarStrEvent.publish();
            this.f276809z = null;
        }
        this.f276808y.clear();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.FlipView");
        C95555h hVar = this.f278149V;
        if (hVar != null) {
            hVar.mo132804n();
            C95555h hVar2 = this.f278149V;
            hVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            Log.m105924i("MicroMsg.SnsGalleryAdapter", "adapter clear.");
            ((HashMap) hVar2.f278192n).clear();
            SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: C */
    public void mo132768C(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (this.f278149V != null) {
            Log.m105918d("MicroMsg.SnsInfoFlip", "onRefresh ");
            if (z) {
                this.f278149V.notifyDataSetChanged();
            }
            mo132769D();
        }
        SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: D */
    public final void mo132769D() {
        SnsMethodCalculate.markStartTimeMs("onSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C95555h hVar = this.f278149V;
        if (hVar == null || hVar.mo132802l(this.f278147U.getCurrentItem()) == null) {
            SnsMethodCalculate.markEndTimeMs("onSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        int currentItem = this.f278147U.getCurrentItem();
        if (this.f278144S0 && this.f278149V.getCount() > 1) {
            this.f278156a1.setVisibility(0);
            this.f278156a1.setPage(currentItem);
        }
        C101804kv2 kv22 = this.f278149V.mo132802l(this.f278147U.getCurrentItem()).f299180d;
        this.f278169n1.add(kv22.f298689d);
        String str = this.f278149V.mo132802l(this.f278147U.getCurrentItem()).f299181e;
        String str2 = kv22.f298689d;
        SnsMethodCalculate.markStartTimeMs("resetFailId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (Util.isNullOrNil(this.f278159d1) || !this.f278159d1.equals(str2)) {
            this.f278159d1 = "";
            SnsMethodCalculate.markEndTimeMs("resetFailId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        } else {
            SnsMethodCalculate.markEndTimeMs("resetFailId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        mo132766A(kv22, currentItem, str);
        SnsMethodCalculate.markEndTimeMs("onSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: E */
    public boolean mo132770E(String str) {
        SnsMethodCalculate.markStartTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i = 0;
        if (this.f278149V == null || this.f278153X0 == null) {
            SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return false;
        }
        while (i >= 0) {
            SnsMethodCalculate.markStartTimeMs("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (this.f278149V == null) {
                SnsMethodCalculate.markEndTimeMs("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            } else {
                while (i < this.f278153X0.size()) {
                    C101829pp1 l = this.f278149V.mo132802l(i);
                    if (!Util.isNullOrNil(l.f299181e) && l.f299181e.equals(str)) {
                        this.f278153X0.remove(i);
                        SnsMethodCalculate.markEndTimeMs("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        break;
                    }
                    i++;
                }
                SnsMethodCalculate.markEndTimeMs("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            }
            i = -1;
        }
        this.f278149V.notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return true;
    }

    public C101804kv2 getCntMedia() {
        SnsMethodCalculate.markStartTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (this.f278149V != null) {
            int currentItem = this.f278147U.getCurrentItem();
            List<C101829pp1> list = this.f278153X0;
            if (list != null && currentItem < list.size()) {
                C101804kv2 kv22 = this.f278149V.mo132802l(currentItem).f299180d;
                SnsMethodCalculate.markEndTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return kv22;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return null;
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C95555h hVar = this.f278149V;
        if (hVar != null) {
            int count = hVar.getCount();
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return count;
        }
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return 0;
    }

    public View getCurrentImageView() {
        SnsMethodCalculate.markStartTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C19706a aVar = this.f278151W;
        if (aVar instanceof View) {
            View view = (View) aVar;
            SnsMethodCalculate.markEndTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return view;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return null;
    }

    public View getCurrentView() {
        SnsMethodCalculate.markStartTimeMs("getCurrentView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C95555h hVar = this.f278149V;
        if (hVar != null || this.f278161f1 == -1) {
            View e = hVar.mo139420e(this.f278161f1);
            SnsMethodCalculate.markEndTimeMs("getCurrentView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return e;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrentView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return null;
    }

    public List<C101829pp1> getFlipList() {
        SnsMethodCalculate.markStartTimeMs("getFlipList", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        List<C101829pp1> list = this.f278153X0;
        SnsMethodCalculate.markEndTimeMs("getFlipList", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return list;
    }

    public C96983o3 getFromScene() {
        SnsMethodCalculate.markStartTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C96983o3 o3Var = this.f276773A;
        SnsMethodCalculate.markEndTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return o3Var;
    }

    public MMViewPager getGallery() {
        SnsMethodCalculate.markStartTimeMs("getGallery", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        MMViewPager mMViewPager = this.f278147U;
        SnsMethodCalculate.markEndTimeMs("getGallery", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return mMViewPager;
    }

    public int getNumOfFileExist() {
        SnsMethodCalculate.markStartTimeMs("getNumOfFileExist", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i = 0;
        int i2 = 0;
        for (C101829pp1 pp12 : this.f278153X0) {
            C94866e1.Fx0();
            if (C86013q1.m106450k(C94901o.m120385m(pp12.f299180d))) {
                i++;
            }
            i2++;
            if (i2 > 9) {
                break;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getNumOfFileExist", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return i;
    }

    public int getPosition() {
        SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i = this.f278161f1;
        SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return i;
    }

    public int getSelectCount() {
        SnsMethodCalculate.markStartTimeMs("getSelectCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int size = this.f278169n1.size();
        SnsMethodCalculate.markEndTimeMs("getSelectCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return size;
    }

    public String getSelectId() {
        SnsMethodCalculate.markStartTimeMs("getSelectId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C101829pp1 selectItem = getSelectItem();
        if (selectItem == null) {
            SnsMethodCalculate.markEndTimeMs("getSelectId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        String str = selectItem.f299181e;
        SnsMethodCalculate.markEndTimeMs("getSelectId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return str;
    }

    public C101829pp1 getSelectItem() {
        SnsMethodCalculate.markStartTimeMs("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        MMViewPager mMViewPager = this.f278147U;
        if (mMViewPager == null || this.f278149V == null) {
            SnsMethodCalculate.markEndTimeMs("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        C101829pp1 l = this.f278149V.mo132802l(mMViewPager.getCurrentItem());
        SnsMethodCalculate.markEndTimeMs("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return l;
    }

    public String getSelectedMediaId() {
        SnsMethodCalculate.markStartTimeMs("getSelectedMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C101804kv2 cntMedia = getCntMedia();
        if (cntMedia != null) {
            String str = cntMedia.f298689d;
            SnsMethodCalculate.markEndTimeMs("getSelectedMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getSelectedMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return null;
    }

    public long getSnsId() {
        SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C95555h hVar = this.f278149V;
        long j = 0;
        if (hVar == null) {
            SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 0;
        }
        C101829pp1 l = hVar.mo132802l(this.f278147U.getCurrentItem());
        String str = l == null ? "" : l.f299181e;
        if (!Util.isNullOrNil(str)) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
            if (DN != null) {
                j = DN.field_snsId;
            }
            SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return j;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return 0;
    }

    public float getWidthModHeight() {
        SnsMethodCalculate.markStartTimeMs("getWidthModHeight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        float f = this.f278155Z0;
        SnsMethodCalculate.markEndTimeMs("getWidthModHeight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return f;
    }

    /* renamed from: h */
    public boolean mo132147h(float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("dispatchXY", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        SnsMethodCalculate.markEndTimeMs("dispatchXY", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return true;
    }

    /* renamed from: n */
    public boolean mo132152n() {
        SnsMethodCalculate.markStartTimeMs("isFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z = this.f278162g1;
        SnsMethodCalculate.markEndTimeMs("isFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z;
    }

    public void onImageFinish(String str, boolean z) {
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        super.onImageFinish(str, z);
        Object[] objArr = new Object[3];
        int i = 0;
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = Boolean.valueOf(this.f278149V == null);
        Log.m105925i("MicroMsg.SnsInfoFlip", "onImageFinish, mediaId: %s, isOK: %s, null == adapter: %s.", objArr);
        C95555h hVar = this.f278149V;
        if (hVar == null) {
            SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        C101804kv2 kv22 = hVar.mo132802l(this.f278147U.getCurrentItem()).f299180d;
        if (!z && kv22 != null && (str3 = kv22.f298689d) != null && str3.equals(str)) {
            Context context = this.f278145T;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.jbu), 0).show();
            this.f278159d1 = str;
        }
        if (this.f278162g1) {
            SnsMethodCalculate.markStartTimeMs("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            Log.m105919d("MicroMsg.SnsInfoFlip", "recordLoadEnd, bigPicId:%s, suceess:%b, mediaId:%s", str, Boolean.valueOf(z), kv22 != null ? kv22.f298689d : "");
            if (z && this.f278170o1.containsKey(str)) {
                C95553f fVar = this.f278170o1.get(str);
                fVar.f278184f = System.currentTimeMillis();
                fVar.f278181c = getReportNetworkType();
                Log.m105918d("MicroMsg.SnsInfoFlip", "recordLoadEnd, update map");
            }
            SnsMethodCalculate.markEndTimeMs("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        if (!(kv22 == null || (str2 = kv22.f298689d) == null || !str2.equals(str))) {
            Log.m105925i("MicroMsg.SnsInfoFlip", "img download finish, refresh ui, media id: %s. and mediaLocal id %s", kv22.f298689d, Integer.valueOf(kv22.f298701s));
            C95555h hVar2 = this.f278149V;
            hVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            int size = m122111t(SnsInfoFlip.this).size();
            while (true) {
                if (i < size) {
                    C101829pp1 l = hVar2.mo132802l(i);
                    if (l != null && l.f299180d.f298689d.equals(str)) {
                        hVar2.mo132805o(i);
                        SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        break;
                    }
                    i++;
                } else {
                    SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    break;
                }
            }
            if (this.f278163h1) {
                SnsMethodCalculate.markStartTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.FlipView");
                String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
                String L = C102236a0.m134717L(kv22);
                if (C86013q1.m106450k(e + L)) {
                    mo132150l(e + L);
                }
                SnsMethodCalculate.markEndTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.FlipView");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void onSightFinish(String str, boolean z) {
        C101804kv2 kv22;
        String str2;
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        super.onSightFinish(str, z);
        StringBuilder sb = new StringBuilder();
        sb.append("onSightFinish ");
        sb.append(str);
        sb.append(" ");
        sb.append(z);
        sb.append(" ");
        sb.append(this.f278149V == null);
        Log.m105924i("MicroMsg.SnsInfoFlip", sb.toString());
        C95555h hVar = this.f278149V;
        if (hVar == null) {
            SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        if (!(z || hVar.mo132802l(this.f278147U.getCurrentItem()) == null || (kv22 = this.f278149V.mo132802l(this.f278147U.getCurrentItem()).f299180d) == null || (str2 = kv22.f298689d) == null || !str2.equals(str))) {
            Context context = this.f278145T;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.jbv), 0).show();
            this.f278159d1 = str;
        }
        this.f278149V.notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setEnableHorLongBmpMode(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEnableHorLongBmpMode", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278150V0 = z;
        SnsMethodCalculate.markEndTimeMs("setEnableHorLongBmpMode", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setEnableSingleClickOver(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEnableSingleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278152W0 = z;
        SnsMethodCalculate.markEndTimeMs("setEnableSingleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setFromScene(C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f276773A = o3Var;
        SnsMethodCalculate.markEndTimeMs("setFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setInfoType(int i) {
        SnsMethodCalculate.markStartTimeMs("setInfoType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        SnsMethodCalculate.markEndTimeMs("setInfoType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setIsAd(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278171p0 = z;
        SnsMethodCalculate.markEndTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setIsFromMainTimeline(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278162g1 = z;
        SnsMethodCalculate.markEndTimeMs("setIsFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setIsSoonEnterPhotoEditUI(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsSoonEnterPhotoEditUI", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278163h1 = z;
        SnsMethodCalculate.markEndTimeMs("setIsSoonEnterPhotoEditUI", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setItems(List<C101829pp1> list) {
        SnsMethodCalculate.markStartTimeMs("setItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278153X0 = list;
        SnsMethodCalculate.markEndTimeMs("setItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setOnDeleteAllAction(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("setOnDeleteAllAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278157b1 = runnable;
        SnsMethodCalculate.markEndTimeMs("setOnDeleteAllAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setOnPageSelectListener(C95554g gVar) {
        SnsMethodCalculate.markStartTimeMs("setOnPageSelectListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278167l1 = gVar;
        SnsMethodCalculate.markEndTimeMs("setOnPageSelectListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setShowLongClickMenu(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setShowLongClickMenu", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278172x0 = z;
        SnsMethodCalculate.markEndTimeMs("setShowLongClickMenu", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setShowPageControl(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setShowPageControl", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278144S0 = z;
        SnsMethodCalculate.markEndTimeMs("setShowPageControl", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setShowTitle(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setShowTitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278148U0 = z;
        SnsMethodCalculate.markEndTimeMs("setShowTitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setTouchFinish(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setTouchFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278146T0 = z;
        SnsMethodCalculate.markEndTimeMs("setTouchFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setUIFromScene(int i) {
        SnsMethodCalculate.markStartTimeMs("setUIFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f276774B = i;
        SnsMethodCalculate.markEndTimeMs("setUIFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setVideoScene(int i) {
        SnsMethodCalculate.markStartTimeMs("setVideoScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f278165j1 = i;
        SnsMethodCalculate.markEndTimeMs("setVideoScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: y */
    public void mo132796y() {
        SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C95555h hVar = this.f278149V;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
        SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: z */
    public void mo132797z(List<C101829pp1> list, String str, int i, C96327z0 z0Var, GalleryTitleManager.C95343c cVar) {
        C101817mv2 mv22;
        SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        C94866e1.Vx0().mo130978c(this);
        this.f278153X0 = list;
        int i2 = C94897n1.f274990d;
        SnsMethodCalculate.markStartTimeMs("isSelf", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        C75592q0.m90789s().equals(str.trim());
        SnsMethodCalculate.markEndTimeMs("isSelf", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        this.f276793g = z0Var;
        this.f276794h = cVar;
        C95555h hVar = new C95555h(this.f278145T);
        this.f278149V = hVar;
        this.f278147U.setAdapter(hVar);
        if (i >= 0 && i < this.f278153X0.size()) {
            this.f278147U.setCurrentItem(i);
            if (this.f278154Y0) {
                this.f278154Y0 = false;
                C101804kv2 kv22 = this.f278149V.mo132802l(i).f299180d;
                if (!(kv22 == null || (mv22 = kv22.f298698p) == null)) {
                    float f = mv22.f298876e;
                    if (f > 0.0f) {
                        this.f278155Z0 = mv22.f298875d / f;
                    }
                }
                this.f278155Z0 = 1.0f;
            }
        }
        this.f278147U.setFadingEdgeLength(0);
        this.f278147U.setOnPageChangeListener(new C95550c());
        this.f278147U.setOnTouchListener(new C95551d());
        if (this.f278172x0) {
            this.f278147U.setLongClickOverListener(new C95552e());
        }
        if (this.f278144S0 && this.f278149V.getCount() > 1) {
            this.f278156a1.setVisibility(0);
            MMPageControlView mMPageControlView = this.f278156a1;
            mMPageControlView.f284231e = this.f278149V.getCount();
            mMPageControlView.mo131771a(i);
        }
        if (this.f278163h1 && !Util.isNullOrNil(this.f278149V.mo132802l(i).f299181e)) {
            String str2 = this.f278149V.mo132802l(i).f299180d.f298689d;
            mo132150l(C94938q1.m120518e(C94866e1.m120262YO(), str2) + C102236a0.m134717L(this.f278149V.mo132802l(i).f299180d));
        }
        SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public SnsInfoFlip(Context context) {
        super(context);
        m122109m(context);
    }
}
