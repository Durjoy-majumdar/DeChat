package com.tencent.p014mm.plugin.appbrand.widget.music;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.file.XVFSFile;
import ut0.C102083a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar */
public class MusicSeekBar extends FrameLayout {

    /* renamed from: d */
    public Context f267636d;

    /* renamed from: e */
    public TextView f267637e;

    /* renamed from: f */
    public TextView f267638f;

    /* renamed from: g */
    public SeekBar f267639g;

    /* renamed from: h */
    public ValueAnimator f267640h;

    /* renamed from: i */
    public boolean f267641i;

    /* renamed from: j */
    public boolean f267642j;

    /* renamed from: n */
    public C102083a f267643n;

    /* renamed from: o */
    public Drawable f267644o;

    /* renamed from: p */
    public C92920b f267645p;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar$a */
    public class C92919a implements ValueAnimator.AnimatorUpdateListener {
        public C92919a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C102083a aVar = MusicSeekBar.this.f267643n;
            aVar.f300613d = floatValue;
            aVar.invalidateSelf();
            MusicSeekBar musicSeekBar = MusicSeekBar.this;
            musicSeekBar.f267639g.setThumb(musicSeekBar.f267643n);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar$b */
    public interface C92920b {
    }

    public MusicSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public static String m117246b(int i) {
        StringBuilder sb = new StringBuilder();
        long j = (long) (i / CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        long floor = (long) Math.floor((double) (((long) (i % CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)) / 1000));
        if (j < 10) {
            sb.append("0");
        }
        sb.append(j + XVFSFile.PATH_SEPARATOR);
        if (floor < 10) {
            sb.append("0");
        }
        sb.append(floor);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo127321a(boolean z) {
        if (this.f267640h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
            this.f267640h = ofFloat;
            ofFloat.setTarget(this.f267639g);
            this.f267640h.setRepeatCount(100);
            this.f267640h.setDuration(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            this.f267640h.setInterpolator(new LinearInterpolator());
            this.f267640h.addUpdateListener(new C92919a());
        }
        this.f267642j = z;
        if (z) {
            this.f267640h.start();
            return;
        }
        this.f267640h.cancel();
        this.f267639g.setThumb(this.f267644o);
    }

    public void setColor(int i) {
        this.f267637e.setTextColor(i);
        this.f267638f.setTextColor(i);
        this.f267639g.getProgressDrawable().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        this.f267639g.getThumb().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        this.f267644o.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        this.f267643n.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    public void setMaxProgress(int i) {
        this.f267638f.setText(m117246b(i));
        this.f267639g.setMax(i);
    }

    public void setOnSeekBarChange(C92920b bVar) {
        this.f267645p = bVar;
    }

    public void setProgress(int i) {
        if (!this.f267642j && !this.f267641i) {
            this.f267637e.setText(m117246b(i));
            this.f267639g.setProgress(i);
        }
    }

    public MusicSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f267641i = false;
        this.f267642j = false;
        this.f267636d = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bjh, this);
        this.f267637e = (TextView) inflate.findViewById(C0966R.C0970id.bxr);
        this.f267638f = (TextView) inflate.findViewById(C0966R.C0970id.cjy);
        this.f267639g = (SeekBar) inflate.findViewById(C0966R.C0970id.j8m);
        this.f267637e.setText("00:00");
        this.f267638f.setText("--:--");
        this.f267643n = new C102083a(getResources().getDrawable(C0966R.C0969drawable.f357292c90));
        this.f267644o = getResources().getDrawable(C0966R.C0969drawable.ajy);
        this.f267639g.setOnSeekBarChangeListener(new C92921a(this));
    }
}
