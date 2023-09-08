package com.tencent.p014mm.pluginsdk.p133ui.seekbar;

import a14.C0000n0;
import a14.C53930o0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kg3.C76577a;
import kotlin.Metadata;
import lu3.C34379c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00021\u000eB\u001b\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0002R\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00062"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView;", "Landroid/widget/LinearLayout;", "", "resId", "Lrx3/b0;", "setHeroProgressDrawable", "", "drag", "setEnableDrag", "", "timeMs", "setTotalTimeMs", "getSuggestUpdateInterval", "Landroid/widget/TextView;", "d", "Lrx3/g;", "getCurrentTimeTxt", "()Landroid/widget/TextView;", "currentTimeTxt", "e", "getTotalTimeText", "totalTimeText", "Landroid/widget/SeekBar;", "f", "getHeroSeekBar", "()Landroid/widget/SeekBar;", "heroSeekBar", "Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$c;", "q", "Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$c;", "getHeroSeekBarChangeListener", "()Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$c;", "setHeroSeekBarChangeListener", "(Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$c;)V", "heroSeekBarChangeListener", "Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$d;", "r", "Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$d;", "getVideoPlayDurationProvider", "()Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$d;", "setVideoPlayDurationProvider", "(Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$d;)V", "videoPlayDurationProvider", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "c", "plugin-playvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView */
public final class HeroSeekBarView extends LinearLayout {

    /* renamed from: d */
    public final C13601g f283683d = C36568h.m40985a(new C44618e(this));

    /* renamed from: e */
    public final C13601g f283684e = C36568h.m40985a(new C44620g(this));

    /* renamed from: f */
    public final C13601g f283685f = C36568h.m40985a(new C44619f(this));

    /* renamed from: g */
    public long f283686g;

    /* renamed from: h */
    public int f283687h = -1;

    /* renamed from: i */
    public boolean f283688i;

    /* renamed from: j */
    public int f283689j;

    /* renamed from: n */
    public long f283690n;

    /* renamed from: o */
    public long f283691o;

    /* renamed from: p */
    public volatile boolean f283692p;

    /* renamed from: q */
    public C96824c f283693q;

    /* renamed from: r */
    public C96825d f283694r;

    /* renamed from: s */
    public C34379c<?> f283695s;

    /* renamed from: t */
    public final C0000n0 f283696t = C53930o0.m60555b();

    /* renamed from: u */
    public boolean f283697u;

    /* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$a */
    public static final class C44617a implements View.OnClickListener {

        /* renamed from: d */
        public static final C44617a f120989d = new C44617a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$e */
    public static final class C44618e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ HeroSeekBarView f120990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44618e(HeroSeekBarView heroSeekBarView) {
            super(0);
            this.f120990d = heroSeekBarView;
        }

        public Object invoke() {
            return (TextView) this.f120990d.findViewById(C0966R.C0970id.evt);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$f */
    public static final class C44619f extends C87413o implements C32224a<SeekBar> {

        /* renamed from: d */
        public final /* synthetic */ HeroSeekBarView f120991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44619f(HeroSeekBarView heroSeekBarView) {
            super(0);
            this.f120991d = heroSeekBarView;
        }

        public Object invoke() {
            return (SeekBar) this.f120991d.findViewById(C0966R.C0970id.evu);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$g */
    public static final class C44620g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ HeroSeekBarView f120992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44620g(HeroSeekBarView heroSeekBarView) {
            super(0);
            this.f120992d = heroSeekBarView;
        }

        public Object invoke() {
            return (TextView) this.f120992d.findViewById(C0966R.C0970id.evw);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$b */
    public static final class C96822b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ HeroSeekBarView f283698d;

        /* renamed from: e */
        public final /* synthetic */ Context f283699e;

        /* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$b$a */
        public static final class C96823a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ HeroSeekBarView f283700d;

            /* renamed from: e */
            public final /* synthetic */ Context f283701e;

            public C96823a(HeroSeekBarView heroSeekBarView, Context context) {
                this.f283700d = heroSeekBarView;
                this.f283701e = context;
            }

            public final void run() {
                this.f283700d.setHeroProgressDrawable(C0966R.C0969drawable.f357219a92);
                this.f283700d.getCurrentTimeTxt().setVisibility(4);
                this.f283700d.getTotalTimeText().setVisibility(4);
                this.f283700d.getHeroSeekBar().setProgressDrawable(C76577a.m92158i(this.f283701e, C0966R.C0969drawable.f357219a92));
                this.f283700d.getHeroSeekBar().setThumb(C76577a.m92158i(this.f283701e, C0966R.C0969drawable.a95));
                HeroSeekBarView heroSeekBarView = this.f283700d;
                heroSeekBarView.mo135120g(heroSeekBarView.f283689j, false);
                this.f283700d.f283688i = true;
            }
        }

        public C96822b(HeroSeekBarView heroSeekBarView, Context context) {
            this.f283698d = heroSeekBarView;
            this.f283699e = context;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C96824c heroSeekBarChangeListener = this.f283698d.getHeroSeekBarChangeListener();
            if (heroSeekBarChangeListener != null) {
                heroSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
            if (z) {
                HeroSeekBarView heroSeekBarView = this.f283698d;
                heroSeekBarView.f283687h = i;
                heroSeekBarView.f283691o = heroSeekBarView.f283686g * ((long) i);
                heroSeekBarView.mo135124h(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f283698d.f283692p = true;
            HeroSeekBarView heroSeekBarView = this.f283698d;
            heroSeekBarView.f283688i = true;
            C34379c<?> cVar = heroSeekBarView.f283695s;
            if (cVar != null) {
                cVar.cancel(true);
            }
            this.f283698d.setHeroProgressDrawable(C0966R.C0969drawable.f357220a93);
            this.f283698d.getCurrentTimeTxt().setVisibility(0);
            this.f283698d.getTotalTimeText().setVisibility(0);
            this.f283698d.getHeroSeekBar().setPressed(true);
            this.f283698d.getHeroSeekBar().setProgressDrawable(C76577a.m92158i(this.f283699e, C0966R.C0969drawable.f357220a93));
            this.f283698d.getHeroSeekBar().setThumb(C76577a.m92158i(this.f283699e, C0966R.C0969drawable.a96));
            C96824c heroSeekBarChangeListener = this.f283698d.getHeroSeekBarChangeListener();
            if (heroSeekBarChangeListener != null) {
                heroSeekBarChangeListener.mo132391b(seekBar, this.f283698d.f283687h);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f283698d.f283692p = false;
            C96824c heroSeekBarChangeListener = this.f283698d.getHeroSeekBarChangeListener();
            if (heroSeekBarChangeListener != null) {
                heroSeekBarChangeListener.mo132390a(seekBar, this.f283698d.f283687h);
            }
            C34379c<?> cVar = this.f283698d.f283695s;
            if (cVar != null) {
                cVar.cancel(true);
            }
            HeroSeekBarView heroSeekBarView = this.f283698d;
            C119179t tVar = C119157j.f356862d;
            C96823a aVar = new C96823a(heroSeekBarView, this.f283699e);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            heroSeekBarView.f283695s = jVar.mo183892w(aVar, 3000, false);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$c */
    public interface C96824c {
        /* renamed from: a */
        void mo132390a(SeekBar seekBar, int i);

        /* renamed from: b */
        void mo132391b(SeekBar seekBar, int i);

        void onProgressChanged(SeekBar seekBar, int i, boolean z);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView$d */
    public interface C96825d {
        /* renamed from: a */
        long mo132393a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeroSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.az_, this, true);
        setOnClickListener(C44617a.f120989d);
        getHeroSeekBar().setMax(2500);
        getHeroSeekBar().setOnSeekBarChangeListener(new C96822b(this, context));
    }

    /* renamed from: e */
    public static final void m124366e(HeroSeekBarView heroSeekBarView, long j) {
        if (heroSeekBarView.f283686g != 0 && !heroSeekBarView.f283692p) {
            long j2 = heroSeekBarView.f283691o;
            if (j > j2 || Math.abs(j - j2) >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                if (j == heroSeekBarView.f283691o) {
                    j += System.currentTimeMillis() - heroSeekBarView.f283690n;
                }
                heroSeekBarView.f283690n = System.currentTimeMillis();
                heroSeekBarView.f283691o = j;
                int i = (int) ((j * ((long) 2500)) / heroSeekBarView.f283686g);
                if (heroSeekBarView.getVisibility() == 0) {
                    heroSeekBarView.mo135124h(i);
                    if (!heroSeekBarView.f283692p) {
                        heroSeekBarView.mo135120g(i, false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final TextView getCurrentTimeTxt() {
        Object value = ((C36570n) this.f283683d).getValue();
        C87412m.m108593f(value, "<get-currentTimeTxt>(...)");
        return (TextView) value;
    }

    /* access modifiers changed from: private */
    public final SeekBar getHeroSeekBar() {
        Object value = ((C36570n) this.f283685f).getValue();
        C87412m.m108593f(value, "<get-heroSeekBar>(...)");
        return (SeekBar) value;
    }

    /* access modifiers changed from: private */
    public final TextView getTotalTimeText() {
        Object value = ((C36570n) this.f283684e).getValue();
        C87412m.m108593f(value, "<get-totalTimeText>(...)");
        return (TextView) value;
    }

    /* access modifiers changed from: private */
    public final void setHeroProgressDrawable(int i) {
        Drawable drawable = getResources().getDrawable(i);
        Rect bounds = getHeroSeekBar().getProgressDrawable().getBounds();
        C87412m.m108593f(bounds, "heroSeekBar.progressDrawable.bounds");
        getHeroSeekBar().setProgressDrawable(drawable);
        getHeroSeekBar().getProgressDrawable().setBounds(bounds);
    }

    /* renamed from: f */
    public final String mo135119f(long j, boolean z) {
        SimpleDateFormat simpleDateFormat;
        if (z) {
            j = C60641c.m70922c((((double) j) * 1.0d) / ((double) 1000)) * ((long) 1000);
            simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
        } else {
            simpleDateFormat = new SimpleDateFormat("mm:ss.SSS", Locale.getDefault());
        }
        String format = simpleDateFormat.format(new Date(j));
        C87412m.m108593f(format, "dataFormat.format(Date(roundeTime))");
        return format;
    }

    /* renamed from: g */
    public final void mo135120g(int i, boolean z) {
        this.f283689j = i;
        if (Build.VERSION.SDK_INT >= 24) {
            boolean z2 = true;
            if (Math.abs(i - getHeroSeekBar().getProgress()) > 10) {
                this.f283688i = true;
            }
            SeekBar heroSeekBar = getHeroSeekBar();
            if (this.f283688i || !z) {
                z2 = false;
            }
            heroSeekBar.setProgress(i, z2);
            this.f283688i = false;
            return;
        }
        getHeroSeekBar().setProgress(i);
    }

    public final C96824c getHeroSeekBarChangeListener() {
        return this.f283693q;
    }

    public final int getSuggestUpdateInterval() {
        int i = getVisibility() == 0 ? (int) (this.f283686g / ((long) 1000)) : 500;
        if (i <= 16) {
            return 16;
        }
        return i;
    }

    public final C96825d getVideoPlayDurationProvider() {
        return this.f283694r;
    }

    /* renamed from: h */
    public final void mo135124h(int i) {
        getCurrentTimeTxt().setText(mo135119f((this.f283686g * ((long) i)) / ((long) 2500), true));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setEnableDrag(boolean z) {
        Log.m105924i("MicroMsg.HeroSeekBarView", "setEnableDrag " + z);
        getHeroSeekBar().setEnabled(z);
    }

    public final void setHeroSeekBarChangeListener(C96824c cVar) {
        this.f283693q = cVar;
    }

    public final void setTotalTimeMs(long j) {
        Log.m105924i("MicroMsg.HeroSeekBarView", "setTotalTimeMs " + j);
        this.f283686g = j;
        getTotalTimeText().setText(mo135119f(j, true));
        getHeroSeekBar().getMax();
    }

    public final void setVideoPlayDurationProvider(C96825d dVar) {
        this.f283694r = dVar;
    }
}
