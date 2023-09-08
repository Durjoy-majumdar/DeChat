package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.seekbar.BothSidesSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import is3.C108485b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ks3.C109054b;
import nj3.C76879j;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002@AB'\b\u0007\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00198\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00198\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR6\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010%8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R6\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010%8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R*\u00108\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001018\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006B"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsView;", "Landroid/widget/RelativeLayout;", "Lis3/b;", "", "progress", "Lrx3/b0;", "setAndMoveSeekValueText", "setAndMoveDefaultValueIcon", "Lks3/b;", "value", "f", "Lks3/b;", "getSelectedEffect", "()Lks3/b;", "setSelectedEffect", "(Lks3/b;)V", "selectedEffect", "", "g", "Ljava/util/List;", "getEffectItems", "()Ljava/util/List;", "setEffectItems", "(Ljava/util/List;)V", "effectItems", "Lkotlin/Function1;", "h", "Lfy3/l;", "getOnRequestSeekByKey", "()Lfy3/l;", "setOnRequestSeekByKey", "(Lfy3/l;)V", "onRequestSeekByKey", "i", "getOnRequestDefaultSeekByKey", "setOnRequestDefaultSeekByKey", "onRequestDefaultSeekByKey", "Lkotlin/Function2;", "j", "Lfy3/p;", "getOnSeekChanging", "()Lfy3/p;", "setOnSeekChanging", "(Lfy3/p;)V", "onSeekChanging", "n", "getOnSeekDone", "setOnSeekDone", "onSeekDone", "Lkotlin/Function0;", "o", "Lfy3/a;", "getOnRequestReset", "()Lfy3/a;", "setOnRequestReset", "(Lfy3/a;)V", "onRequestReset", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", "d", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView */
public final class FinderLiveCameraOptBeautyPowerfulDetailsView extends RelativeLayout implements C108485b {

    /* renamed from: d */
    public final C105268c f312753d;

    /* renamed from: e */
    public Animator f312754e;

    /* renamed from: f */
    public C109054b f312755f;

    /* renamed from: g */
    public List<C109054b> f312756g;

    /* renamed from: h */
    public C32226l<? super Integer, Integer> f312757h;

    /* renamed from: i */
    public C32226l<? super Integer, Integer> f312758i;

    /* renamed from: j */
    public C32227p<? super Integer, ? super Integer, C13598b0> f312759j;

    /* renamed from: n */
    public C32227p<? super Integer, ? super Integer, C13598b0> f312760n;

    /* renamed from: o */
    public C32224a<C13598b0> f312761o;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView$a */
    public static final class C105264a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsView f312762d;

        public C105264a(FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView) {
            this.f312762d = finderLiveCameraOptBeautyPowerfulDetailsView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C32227p<Integer, Integer, C13598b0> onSeekChanging;
            FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = this.f312762d;
            C109054b selectedEffect = finderLiveCameraOptBeautyPowerfulDetailsView.getSelectedEffect();
            int i2 = 0;
            boolean z2 = selectedEffect != null ? selectedEffect.f326604c : false;
            if (seekBar != null) {
                i2 = seekBar.getMax();
            }
            int d = finderLiveCameraOptBeautyPowerfulDetailsView.mo149676d(i, z2, i2);
            C109054b selectedEffect2 = this.f312762d.getSelectedEffect();
            if (!(selectedEffect2 == null || (onSeekChanging = this.f312762d.getOnSeekChanging()) == null)) {
                if (!z) {
                    onSeekChanging = null;
                }
                if (onSeekChanging != null) {
                    onSeekChanging.invoke(Integer.valueOf(selectedEffect2.f326602a), Integer.valueOf(d));
                }
            }
            this.f312762d.setAndMoveSeekValueText(i);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStopTrackingTouch(android.widget.SeekBar r5) {
            /*
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L_0x0019
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView r1 = r4.f312762d
                int r2 = r5.getProgress()
                ks3.b r3 = r1.getSelectedEffect()
                if (r3 == 0) goto L_0x0011
                boolean r0 = r3.f326604c
            L_0x0011:
                int r5 = r5.getMax()
                int r0 = r1.mo149676d(r2, r0, r5)
            L_0x0019:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r1 = "#onStopTrackingTouch progress="
                r5.append(r1)
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                java.lang.String r1 = "Finder.FinderLiveCameraOptBeautyPowerfulDetailsView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView r5 = r4.f312762d
                ks3.b r5 = r5.getSelectedEffect()
                if (r5 == 0) goto L_0x004c
                com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView r1 = r4.f312762d
                fy3.p r1 = r1.getOnSeekDone()
                if (r1 == 0) goto L_0x004c
                int r5 = r5.f326602a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.invoke(r5, r0)
            L_0x004c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView.C105264a.onStopTrackingTouch(android.widget.SeekBar):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView$b */
    public static final class C105265b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f312763d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsView f312764e;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView$b$a */
        public static final class C105266a implements C47883u {

            /* renamed from: a */
            public static final C105266a f312765a = new C105266a();

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView$b$b */
        public static final class C105267b implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsView f312766a;

            /* renamed from: b */
            public final /* synthetic */ Context f312767b;

            public C105267b(FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView, Context context) {
                this.f312766a = finderLiveCameraOptBeautyPowerfulDetailsView;
                this.f312767b = context;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                C32224a<C13598b0> onRequestReset = this.f312766a.getOnRequestReset();
                if (onRequestReset != null) {
                    onRequestReset.invoke();
                }
                Context context = this.f312767b;
                C76879j.m92727U(context, context.getString(C0966R.string.dvs), 0);
            }
        }

        public C105265b(Context context, FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView) {
            this.f312763d = context;
            this.f312764e = finderLiveCameraOptBeautyPowerfulDetailsView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77426q qVar = new C77426q(this.f312763d);
            qVar.mo107598j(this.f312763d.getString(C0966R.string.dvp));
            qVar.mo107602n(this.f312763d.getString(C0966R.string.dvt));
            qVar.mo107595g(this.f312763d.getString(C0966R.string.dvq));
            qVar.mo107591c(C105266a.f312765a, new C105267b(this.f312764e, this.f312763d));
            qVar.mo107604p(true);
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView$c */
    public final class C105268c extends RecyclerView.C16613e<C105269d> {
        public C105268c() {
        }

        public int getItemCount() {
            return FinderLiveCameraOptBeautyPowerfulDetailsView.this.getEffectItems().size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C105269d dVar = (C105269d) zVar;
            C87412m.m108594g(dVar, "holder");
            if (i >= 0 && i < FinderLiveCameraOptBeautyPowerfulDetailsView.this.getEffectItems().size()) {
                boolean z = false;
                int a = i == 0 ? C74942w4.m89784a(dVar.f44854d.getContext(), 32) : 0;
                View view = dVar.f44854d;
                view.setPadding(a, view.getPaddingTop(), dVar.f44854d.getPaddingRight(), dVar.f44854d.getPaddingBottom());
                dVar.f312769z.setText(FinderLiveCameraOptBeautyPowerfulDetailsView.this.getEffectItems().get(i).f326603b);
                TextView textView = dVar.f312769z;
                C109054b selectedEffect = FinderLiveCameraOptBeautyPowerfulDetailsView.this.getSelectedEffect();
                if (selectedEffect != null && selectedEffect.f326602a == FinderLiveCameraOptBeautyPowerfulDetailsView.this.getEffectItems().get(i).f326602a) {
                    z = true;
                }
                textView.setActivated(z);
                dVar.f44854d.setOnClickListener(new C105289y(FinderLiveCameraOptBeautyPowerfulDetailsView.this, i));
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.d3y, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(parent.context,\n…em,\n                null)");
            return new C105269d(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView$d */
    public static final class C105269d extends RecyclerView.C16631z {

        /* renamed from: z */
        public final TextView f312769z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105269d(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.dh4);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…ra_opt_beauty_item_title)");
            this.f312769z = (TextView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView$e */
    public static final class C105270e extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsView f312770d;

        public C105270e(FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView) {
            this.f312770d = finderLiveCameraOptBeautyPowerfulDetailsView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f312770d.setVisibility(8);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView$f */
    public static final class C105271f extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulDetailsView f312771d;

        public C105271f(FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView) {
            this.f312771d = finderLiveCameraOptBeautyPowerfulDetailsView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f312771d.setAlpha(1.0f);
            this.f312771d.reload();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f312771d.setAlpha(0.0f);
            this.f312771d.setVisibility(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptBeautyPowerfulDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final void setAndMoveDefaultValueIcon(int i) {
        BothSidesSeekBar bothSidesSeekBar = (BothSidesSeekBar) findViewById(C0966R.C0970id.f358105dg0);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f358106dg1);
        int width = bothSidesSeekBar.getWidth() - imageView.getWidth();
        float max = (((float) i) / ((float) bothSidesSeekBar.getMax())) * ((float) ((bothSidesSeekBar.getMeasuredWidth() - bothSidesSeekBar.getPaddingStart()) - bothSidesSeekBar.getPaddingEnd()));
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#setAndMoveDefaultValueIcon progress:" + i + " translationX:" + max);
        float f = (float) width;
        if (max > f) {
            max = f;
        }
        imageView.setTranslationX(max);
    }

    /* access modifiers changed from: private */
    public final void setAndMoveSeekValueText(int i) {
        BothSidesSeekBar bothSidesSeekBar = (BothSidesSeekBar) findViewById(C0966R.C0970id.f358105dg0);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f358107dg2);
        int width = bothSidesSeekBar.getWidth() - textView.getWidth();
        float max = (((float) i) / ((float) bothSidesSeekBar.getMax())) * ((float) ((bothSidesSeekBar.getMeasuredWidth() - bothSidesSeekBar.getPaddingStart()) - bothSidesSeekBar.getPaddingEnd()));
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#setAndMoveSeekValueText progress:" + i + " translationX:" + max);
        C109054b selectedEffect = getSelectedEffect();
        textView.setText(String.valueOf(mo149676d(i, selectedEffect != null ? selectedEffect.f326604c : false, bothSidesSeekBar.getMax())));
        float f = (float) width;
        if (max > f) {
            max = f;
        }
        textView.setTranslationX(max);
    }

    /* renamed from: a */
    public void mo149674a() {
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#showSelf");
        Animator animator = this.f312754e;
        boolean z = true;
        if (animator == null || !animator.isRunning()) {
            z = false;
        }
        if (z) {
            Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#showSelf visibilityAnimator isRunning");
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.addListener(new C105271f(this));
        ofFloat.start();
        this.f312754e = ofFloat;
    }

    /* renamed from: b */
    public void mo149675b(boolean z) {
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#hideSelf isAnimator=" + z);
        Animator animator = this.f312754e;
        boolean z2 = true;
        if (animator == null || !animator.isRunning()) {
            z2 = false;
        }
        if (z2) {
            Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#hideSelf visibilityAnimator isRunning");
        } else if (!z) {
            setVisibility(8);
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.addListener(new C105270e(this));
            ofFloat.start();
            this.f312754e = ofFloat;
        }
    }

    /* renamed from: d */
    public final int mo149676d(int i, boolean z, int i2) {
        Number number;
        float f = (float) i2;
        float f2 = f / 2.0f;
        if (z) {
            float f3 = (float) i;
            number = f3 < f2 ? Float.valueOf(((f3 / f2) * 100.0f) - 100.0f) : f3 > f2 ? Float.valueOf(((f3 - f2) / f2) * 100.0f) : 0;
        } else {
            number = Float.valueOf((((float) i) / f) * 100.0f);
        }
        return number.intValue();
    }

    public List<C109054b> getEffectItems() {
        return this.f312756g;
    }

    public C32226l<Integer, Integer> getOnRequestDefaultSeekByKey() {
        return this.f312758i;
    }

    public C32224a<C13598b0> getOnRequestReset() {
        return this.f312761o;
    }

    public C32226l<Integer, Integer> getOnRequestSeekByKey() {
        return this.f312757h;
    }

    public C32227p<Integer, Integer, C13598b0> getOnSeekChanging() {
        return this.f312759j;
    }

    public C32227p<Integer, Integer, C13598b0> getOnSeekDone() {
        return this.f312760n;
    }

    public C109054b getSelectedEffect() {
        return this.f312755f;
    }

    public void reload() {
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#reload");
        setSelectedEffect(getSelectedEffect());
    }

    public void setEffectItems(List<C109054b> list) {
        C87412m.m108594g(list, "value");
        getEffectItems().clear();
        getEffectItems().addAll(list);
        setSelectedEffect((C109054b) C110818d0.m150916N(getEffectItems()));
        this.f312753d.notifyDataSetChanged();
    }

    public void setOnRequestDefaultSeekByKey(C32226l<? super Integer, Integer> lVar) {
        this.f312758i = lVar;
    }

    public void setOnRequestReset(C32224a<C13598b0> aVar) {
        this.f312761o = aVar;
    }

    public void setOnRequestSeekByKey(C32226l<? super Integer, Integer> lVar) {
        this.f312757h = lVar;
    }

    public void setOnSeekChanging(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f312759j = pVar;
    }

    public void setOnSeekDone(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f312760n = pVar;
    }

    public void setSelectedEffect(C109054b bVar) {
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#selectedEffect set " + bVar);
        this.f312755f = bVar;
        this.f312753d.notifyDataSetChanged();
        C109054b bVar2 = this.f312755f;
        if (bVar2 != null) {
            C32226l<Integer, Integer> onRequestSeekByKey = getOnRequestSeekByKey();
            if (onRequestSeekByKey != null) {
                int intValue = onRequestSeekByKey.invoke(Integer.valueOf(bVar2.f326602a)).intValue();
                Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#selectedEffect set onRequestSeekByKey " + intValue);
                BothSidesSeekBar bothSidesSeekBar = (BothSidesSeekBar) findViewById(C0966R.C0970id.f358105dg0);
                if (bothSidesSeekBar != null) {
                    bothSidesSeekBar.setBothSidesMode(bVar2.f326604c);
                    boolean z = bVar2.f326604c;
                    float max = (float) bothSidesSeekBar.getMax();
                    float f = max / 2.0f;
                    if (z) {
                        float f2 = f / 100.0f;
                        if (intValue != 0) {
                            f += ((float) intValue) * f2;
                        }
                    } else {
                        f = (max / 100.0f) * ((float) intValue);
                    }
                    bothSidesSeekBar.setProgress((int) f);
                    setAndMoveSeekValueText(bothSidesSeekBar.getProgress());
                }
            }
            C32226l<Integer, Integer> onRequestDefaultSeekByKey = getOnRequestDefaultSeekByKey();
            if (onRequestDefaultSeekByKey != null) {
                int intValue2 = onRequestDefaultSeekByKey.invoke(Integer.valueOf(bVar2.f326602a)).intValue();
                Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#selectedEffect set onRequestDefaultSeekByKey " + intValue2);
                BothSidesSeekBar bothSidesSeekBar2 = (BothSidesSeekBar) findViewById(C0966R.C0970id.f358105dg0);
                if (bothSidesSeekBar2 != null) {
                    boolean z2 = bVar2.f326604c;
                    float max2 = (float) bothSidesSeekBar2.getMax();
                    float f3 = max2 / 2.0f;
                    if (z2) {
                        float f4 = f3 / 100.0f;
                        if (intValue2 != 0) {
                            f3 += ((float) intValue2) * f4;
                        }
                    } else {
                        f3 = (max2 / 100.0f) * ((float) intValue2);
                    }
                    setAndMoveDefaultValueIcon((int) f3);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptBeautyPowerfulDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C105268c cVar = new C105268c();
        this.f312753d = cVar;
        this.f312756g = new ArrayList();
        View.inflate(context, C0966R.C0971layout.af8, this);
        mo149675b(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.dfz);
        recyclerView.setAdapter(cVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        ((BothSidesSeekBar) findViewById(C0966R.C0970id.f358105dg0)).setOnSeekBarChangeListener(new C105264a(this));
        findViewById(C0966R.C0970id.dfx).setOnClickListener(new C105265b(context, this));
    }
}
