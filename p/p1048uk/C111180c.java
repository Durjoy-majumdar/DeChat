package p1048uk;

import android.graphics.RectF;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.p014mm.autogen.mmdata.rpt.AnimateEmojiReportStruct;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.smiley.C72953u;
import gy3.C87412m;
import o40.C61926c;
import p1048uk.C102048b;
import qz1.C22187h;

/* renamed from: uk.c */
public final class C111180c {

    /* renamed from: a */
    public final String f332963a = "MicroMsg.EmojiAnimViewHolder";

    /* renamed from: b */
    public String f332964b = "";

    /* renamed from: c */
    public long f332965c;

    /* renamed from: d */
    public int f332966d;

    /* renamed from: e */
    public FrameLayout f332967e;

    /* renamed from: f */
    public MMAnimateView f332968f;

    /* renamed from: g */
    public MMNeat7extView f332969g;

    /* renamed from: h */
    public C72953u f332970h;

    /* renamed from: i */
    public C22187h f332971i;

    /* renamed from: j */
    public final RectF f332972j = new RectF();

    /* renamed from: k */
    public C102048b.C102049a f332973k;

    /* renamed from: l */
    public boolean f332974l;

    /* renamed from: m */
    public boolean f332975m;

    /* renamed from: n */
    public int f332976n = -16777216;

    /* renamed from: o */
    public Runnable f332977o = new C111183c(this);

    /* renamed from: p */
    public Runnable f332978p = new C111182b(this);

    /* renamed from: q */
    public AnimateEmojiReportStruct f332979q;

    /* renamed from: r */
    public C111181a f332980r;

    /* renamed from: uk.c$a */
    public interface C111181a {
        /* renamed from: a */
        void mo162914a();

        /* renamed from: b */
        void mo162915b(long j, String str, C102048b.C102049a aVar);

        /* renamed from: c */
        void mo162916c(long j, String str, C102048b.C102049a aVar);

        /* renamed from: d */
        void mo162917d(C111180c cVar, boolean z);

        void onStart();
    }

    /* renamed from: uk.c$b */
    public static final class C111182b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111180c f332981d;

        public C111182b(C111180c cVar) {
            this.f332981d = cVar;
        }

        public final void run() {
            C111180c cVar = this.f332981d;
            if (!cVar.f332974l) {
                Log.m105924i(cVar.f332963a, "delay: recycle");
                this.f332981d.mo162911b();
                C111180c cVar2 = this.f332981d;
                C111181a aVar = cVar2.f332980r;
                if (aVar != null) {
                    aVar.mo162917d(cVar2, false);
                }
            }
        }
    }

    /* renamed from: uk.c$c */
    public static final class C111183c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111180c f332982d;

        public C111183c(C111180c cVar) {
            this.f332982d = cVar;
        }

        public final void run() {
            C111181a aVar;
            C111180c cVar = this.f332982d;
            C102048b.C102049a aVar2 = cVar.f332973k;
            if (aVar2 != null && aVar2.f300531d != null && (aVar = cVar.f332980r) != null) {
                aVar.mo162916c(cVar.f332965c, cVar.f332964b, aVar2);
            }
        }
    }

    /* renamed from: uk.c$d */
    public static final class C111184d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111180c f332983d;

        /* renamed from: e */
        public final /* synthetic */ MMAnimateView f332984e;

        /* renamed from: uk.c$d$a */
        public static final class C111185a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C111180c f332985d;

            /* renamed from: e */
            public final /* synthetic */ MMAnimateView f332986e;

            /* renamed from: uk.c$d$a$a */
            public static final class C111186a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C111180c f332987d;

                public C111186a(C111180c cVar) {
                    this.f332987d = cVar;
                }

                public final void run() {
                    C102048b.C102050b bVar;
                    C111180c cVar = this.f332987d;
                    if (cVar.f332974l) {
                        C102048b.C102049a aVar = cVar.f332973k;
                        if (!(aVar == null || (bVar = aVar.f300531d) == null || bVar.f300532b != -1)) {
                            ((C111183c) cVar.f332977o).run();
                        }
                        C61926c.m72698w(cVar.f332977o);
                        cVar.mo162911b();
                        cVar.f332965c = 0;
                        cVar.f332969g = null;
                        C111181a aVar2 = cVar.f332980r;
                        if (aVar2 != null) {
                            aVar2.mo162914a();
                        }
                        C111181a aVar3 = cVar.f332980r;
                        if (aVar3 != null) {
                            aVar3.mo162917d(cVar, true);
                        }
                    }
                }
            }

            public C111185a(C111180c cVar, MMAnimateView mMAnimateView) {
                this.f332985d = cVar;
                this.f332986e = mMAnimateView;
            }

            public final void run() {
                C22187h hVar = this.f332985d.f332971i;
                if (hVar != null) {
                    hVar.f62766d = false;
                }
                this.f332986e.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).withEndAction(new C111186a(this.f332985d));
            }
        }

        public C111184d(C111180c cVar, MMAnimateView mMAnimateView) {
            this.f332983d = cVar;
            this.f332984e = mMAnimateView;
        }

        public final void run() {
            C22187h hVar = this.f332983d.f332971i;
            if (hVar != null) {
                hVar.mo35282d();
            }
            C111180c cVar = this.f332983d;
            C22187h hVar2 = cVar.f332971i;
            if (hVar2 != null) {
                hVar2.f62762N = new C111185a(cVar, this.f332984e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo162910a(MMNeat7extView mMNeat7extView) {
        String str = this.f332963a;
        Log.m105918d(str, "bindItemView: " + this.f332965c + ", " + mMNeat7extView);
        if (!C87412m.m108589b(this.f332969g, mMNeat7extView)) {
            mo162912c();
            this.f332969g = mMNeat7extView;
            int i = this.f332966d;
            if (i == 889192497 || i == 922746929) {
                Log.m105924i(this.f332963a, "recordTextView: skip pat msg");
                MMNeat7extView mMNeat7extView2 = this.f332969g;
                C72953u uVar = null;
                CharSequence a = mMNeat7extView2 != null ? mMNeat7extView2.mo154968a() : null;
                Spannable spannable = a instanceof Spannable ? (Spannable) a : null;
                if (spannable != null) {
                    C72953u[] uVarArr = (C72953u[]) spannable.getSpans(0, spannable.length(), C72953u.class);
                    C87412m.m108593f(uVarArr, "emojiList");
                    int length = uVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        C72953u uVar2 = uVarArr[i2];
                        if (uVar2.f212635e) {
                            uVar = uVar2;
                            break;
                        }
                        i2++;
                    }
                    if (uVar != null) {
                        this.f332970h = uVar;
                        uVar.f212639i = Math.round(0.0f);
                        uVar.f212640j = true;
                        MMNeat7extView mMNeat7extView3 = this.f332969g;
                        if (mMNeat7extView3 != null) {
                            mMNeat7extView3.invalidate();
                        }
                    }
                }
            } else {
                this.f332976n = mMNeat7extView != null ? mMNeat7extView.getCurrentTextColor() : this.f332976n;
                MMNeat7extView mMNeat7extView4 = this.f332969g;
                if (mMNeat7extView4 != null) {
                    mMNeat7extView4.setTextColor(0);
                }
                String str2 = this.f332963a;
                Log.m105924i(str2, "recordTextView: " + this.f332969g + ", color:" + this.f332976n);
            }
        }
        if (this.f332969g == null) {
            if (this.f332974l) {
                Log.m105924i(this.f332963a, "bindItemView: null");
                mo162911b();
                return true;
            } else if (!this.f332975m) {
                C61926c.m72667L(200, this.f332978p);
            }
        }
        this.f332975m = true;
        return false;
    }

    /* renamed from: b */
    public final void mo162911b() {
        ViewPropertyAnimator animate;
        C61926c.m72698w(this.f332977o);
        C61926c.m72698w(this.f332978p);
        C22187h hVar = this.f332971i;
        if (hVar != null) {
            hVar.mo35280b();
        }
        this.f332971i = null;
        MMAnimateView mMAnimateView = this.f332968f;
        if (mMAnimateView != null) {
            mMAnimateView.setVisibility(8);
        }
        MMAnimateView mMAnimateView2 = this.f332968f;
        if (!(mMAnimateView2 == null || (animate = mMAnimateView2.animate()) == null)) {
            animate.cancel();
        }
        MMAnimateView mMAnimateView3 = this.f332968f;
        if (mMAnimateView3 != null) {
            mMAnimateView3.setScaleX(1.0f);
        }
        MMAnimateView mMAnimateView4 = this.f332968f;
        if (mMAnimateView4 != null) {
            mMAnimateView4.setScaleY(1.0f);
        }
        mo162912c();
        this.f332974l = false;
    }

    /* renamed from: c */
    public final void mo162912c() {
        MMNeat7extView mMNeat7extView;
        int i = this.f332966d;
        int i2 = 0;
        if (i == 889192497 || i == 922746929) {
            Log.m105924i(this.f332963a, "recordTextView: skip pat msg");
            C72953u uVar = this.f332970h;
            if (uVar != null) {
                uVar.f212639i = Math.round(255.0f);
                uVar.f212640j = false;
            }
            MMNeat7extView mMNeat7extView2 = this.f332969g;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.invalidate();
                return;
            }
            return;
        }
        MMNeat7extView mMNeat7extView3 = this.f332969g;
        if (mMNeat7extView3 != null) {
            i2 = mMNeat7extView3.getCurrentTextColor();
        }
        if (i2 == 0 && (mMNeat7extView = this.f332969g) != null) {
            mMNeat7extView.setTextColor(this.f332976n);
        }
        String str = this.f332963a;
        Log.m105924i(str, "restoreTextView: " + this.f332969g + ", " + i2);
    }

    /* renamed from: d */
    public final void mo162913d(float f, float f2, int i) {
        C102048b.C102050b bVar;
        int i2;
        MMAnimateView mMAnimateView;
        FrameLayout frameLayout;
        if (this.f332971i == null) {
            Log.m105924i(this.f332963a, "updateView: no drawable");
        } else if (this.f332967e == null) {
            Log.m105924i(this.f332963a, "updateView: no rootView");
        } else {
            String str = this.f332963a;
            Log.m105918d(str, "updateView: " + f + ", " + f2 + ", " + i + ", " + this.f332974l);
            ViewGroup.LayoutParams layoutParams = null;
            if (this.f332968f == null) {
                FrameLayout frameLayout2 = this.f332967e;
                MMAnimateView mMAnimateView2 = new MMAnimateView(frameLayout2 != null ? frameLayout2.getContext() : null, (AttributeSet) null);
                this.f332968f = mMAnimateView2;
                FrameLayout frameLayout3 = this.f332967e;
                if (frameLayout3 != null) {
                    frameLayout3.addView(mMAnimateView2, new FrameLayout.LayoutParams(i, i));
                }
                MMAnimateView mMAnimateView3 = this.f332968f;
                if (mMAnimateView3 != null) {
                    mMAnimateView3.setVisibility(8);
                }
            }
            MMAnimateView mMAnimateView4 = this.f332968f;
            if (mMAnimateView4 != null) {
                layoutParams = mMAnimateView4.getLayoutParams();
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 == null) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i, i);
                MMAnimateView mMAnimateView5 = this.f332968f;
                if (mMAnimateView5 != null) {
                    mMAnimateView5.setLayoutParams(layoutParams3);
                }
            } else if (!(layoutParams2.width == i && layoutParams2.height == i)) {
                layoutParams2.width = i;
                layoutParams2.height = i;
                MMAnimateView mMAnimateView6 = this.f332968f;
                if (mMAnimateView6 != null) {
                    mMAnimateView6.setLayoutParams(layoutParams2);
                }
            }
            MMAnimateView mMAnimateView7 = this.f332968f;
            if (mMAnimateView7 != null) {
                mMAnimateView7.setTranslationX(f - ((float) (i / 2)));
            }
            MMAnimateView mMAnimateView8 = this.f332968f;
            if (mMAnimateView8 != null) {
                mMAnimateView8.setTranslationY(f2 - ((float) (i / 2)));
            }
            if (!this.f332974l) {
                AnimateEmojiReportStruct animateEmojiReportStruct = this.f332979q;
                if (animateEmojiReportStruct != null) {
                    animateEmojiReportStruct.mo86054n();
                }
                FrameLayout frameLayout4 = this.f332967e;
                if ((frameLayout4 != null && frameLayout4.getVisibility() == 8) && (frameLayout = this.f332967e) != null) {
                    frameLayout.setVisibility(0);
                }
                MMAnimateView mMAnimateView9 = this.f332968f;
                if ((mMAnimateView9 != null && mMAnimateView9.getVisibility() == 8) && (mMAnimateView = this.f332968f) != null) {
                    mMAnimateView.setVisibility(0);
                }
                MMAnimateView mMAnimateView10 = this.f332968f;
                if (mMAnimateView10 != null) {
                    mMAnimateView10.setImageDrawable(this.f332971i);
                }
                C111181a aVar = this.f332980r;
                if (aVar != null) {
                    aVar.onStart();
                }
                C61926c.m72698w(this.f332977o);
                C102048b.C102049a aVar2 = this.f332973k;
                if (!(aVar2 == null || (bVar = aVar2.f300531d) == null || (i2 = bVar.f300532b) < 0)) {
                    C61926c.m72667L((long) i2, this.f332977o);
                }
                this.f332974l = true;
                C61926c.m72698w(this.f332978p);
                MMAnimateView mMAnimateView11 = this.f332968f;
                if (mMAnimateView11 != null) {
                    mMAnimateView11.animate().scaleX(1.5f).scaleY(1.5f).setDuration(0).withEndAction(new C111184d(this, mMAnimateView11));
                }
            }
        }
    }
}
