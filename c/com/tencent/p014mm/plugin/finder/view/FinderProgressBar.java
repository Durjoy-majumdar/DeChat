package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019R#\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00038BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderProgressBar;", "Landroid/widget/FrameLayout;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/SeekBar;", "kotlin.jvm.PlatformType", "f", "Lrx3/g;", "getSeekBar", "()Landroid/widget/SeekBar;", "seekBar", "g", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "setListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "listener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderProgressBar */
public final class FinderProgressBar extends FrameLayout implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: h */
    public static final /* synthetic */ int f312887h = 0;

    /* renamed from: d */
    public boolean f312888d;

    /* renamed from: e */
    public float f312889e;

    /* renamed from: f */
    public final C13601g f312890f;

    /* renamed from: g */
    public SeekBar.OnSeekBarChangeListener f312891g;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderProgressBar$a */
    public static final class C105308a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderProgressBar f312892d;

        public C105308a(FinderProgressBar finderProgressBar) {
            this.f312892d = finderProgressBar;
        }

        public final void run() {
            this.f312892d.setAlpha(0.0f);
            this.f312892d.setVisibility(0);
            this.f312892d.f312888d = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderProgressBar$b */
    public static final class C105309b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ FinderProgressBar f312893d;

        public C105309b(FinderProgressBar finderProgressBar) {
            this.f312893d = finderProgressBar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f312893d.getSeekBar().setAlpha(1.0f);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderProgressBar$c */
    public static final class C105310c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ FinderProgressBar f312894d;

        public C105310c(FinderProgressBar finderProgressBar) {
            this.f312894d = finderProgressBar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f312894d.setAlpha(0.0f);
            this.f312894d.f312888d = false;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.ar5, this, true);
        SeekBar seekBar = (SeekBar) findViewById(C0966R.C0970id.j8m);
        if (seekBar != null) {
            setAlpha(0.0f);
            seekBar.setOnTouchListener(C4155q4.f18379d);
        }
        setOnLongClickListener(new C105317r4(this));
        this.f312890f = C36568h.m40985a(new C105318s4(this));
    }

    /* access modifiers changed from: private */
    public final SeekBar getSeekBar() {
        return (SeekBar) this.f312890f.getValue();
    }

    /* renamed from: b */
    public final void mo149749b(boolean z, long j) {
        if (z) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f312891g;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(getSeekBar());
            }
            animate().cancel();
            animate().alpha(1.0f).withStartAction(new C105308a(this)).setListener(new C105309b(this)).setDuration(300).alpha(1.0f).setStartDelay(j).start();
            return;
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.f312891g;
        if (onSeekBarChangeListener2 != null) {
            onSeekBarChangeListener2.onStopTrackingTouch(getSeekBar());
        }
        animate().cancel();
        animate().alpha(0.0f).setListener(new C105310c(this)).setDuration(300).setStartDelay(j).start();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (this.f312888d && motionEvent.getAction() == 0) {
            animate().cancel();
            setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f312888d) {
                mo149749b(false, 0);
            }
        } else if (motionEvent.getAction() == 2 && this.f312888d) {
            float x = this.f312889e - motionEvent.getX();
            float abs = Math.abs(x);
            float progress = (float) getSeekBar().getProgress();
            if (x >= 0.0f) {
                abs = -abs;
            }
            getSeekBar().setProgress((int) (progress + abs));
        }
        this.f312889e = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final SeekBar.OnSeekBarChangeListener getListener() {
        return this.f312891g;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C87412m.m108594g(seekBar, "seekBar");
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f312891g;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C87412m.m108594g(seekBar, "seekBar");
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C87412m.m108594g(seekBar, "seekBar");
    }

    public final void setListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f312891g = onSeekBarChangeListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.ar5, this, true);
        SeekBar seekBar = (SeekBar) findViewById(C0966R.C0970id.j8m);
        if (seekBar != null) {
            setAlpha(0.0f);
            seekBar.setOnTouchListener(C4155q4.f18379d);
        }
        setOnLongClickListener(new C105317r4(this));
        this.f312890f = C36568h.m40985a(new C105318s4(this));
    }
}
