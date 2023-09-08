package com.tencent.p014mm.plugin.music.p080ui.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import gy3.C87412m;
import ia2.C60264a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p192l4.C10462b;
import ya2.C66604j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002&'B!\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006R\"\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, mo182094d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MusicPlayerSeekBar;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/music/ui/view/MusicPlayerSeekBar$b;", "onSeekBarChange", "Lrx3/b0;", "setOnSeekBarChange", "", "textSize", "setTextSize", "color", "setColor", "currentPos", "setProgress", "totalDuration", "setMaxProgress", "", "d", "Z", "isSeeking", "()Z", "setSeeking", "(Z)V", "Landroid/graphics/drawable/Drawable;", "e", "Landroid/graphics/drawable/Drawable;", "getThumbDrawable", "()Landroid/graphics/drawable/Drawable;", "setThumbDrawable", "(Landroid/graphics/drawable/Drawable;)V", "thumbDrawable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "plugin-music_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerSeekBar */
public final class MusicPlayerSeekBar extends FrameLayout {

    /* renamed from: g */
    public static final C56893a f162984g = new C56893a((C8480h) null);

    /* renamed from: d */
    public boolean f162985d;

    /* renamed from: e */
    public Drawable f162986e;

    /* renamed from: f */
    public C60264a f162987f;

    /* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerSeekBar$a */
    public static final class C56893a {
        public C56893a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo80343a(int i) {
            StringBuilder sb = new StringBuilder();
            long j = (long) i;
            long j2 = j / 60000;
            long floor = (long) Math.floor(((double) (j % 60000)) / 1000.0d);
            if (j2 < 10) {
                sb.append("0");
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j2);
            sb4.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(sb4.toString());
            if (floor < 10) {
                sb.append("0");
            }
            sb.append(floor);
            String sb5 = sb.toString();
            C87412m.m108593f(sb5, "time.toString()");
            return sb5;
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerSeekBar$b */
    public interface C56894b {
        /* renamed from: a */
        void mo80344a(int i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicPlayerSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bjf, this, false);
        addView(inflate);
        int i2 = C0966R.C0970id.bxl;
        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.bxl);
        if (textView != null) {
            i2 = C0966R.C0970id.cjs;
            TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.cjs);
            if (textView2 != null) {
                i2 = C0966R.C0970id.e_7;
                View a = C10462b.m10395a(inflate, C0966R.C0970id.e_7);
                if (a != null) {
                    i2 = C0966R.C0970id.h0f;
                    SeekBar seekBar = (SeekBar) C10462b.m10395a(inflate, C0966R.C0970id.h0f);
                    if (seekBar != null) {
                        this.f162987f = new C60264a((LinearLayout) inflate, textView, textView2, a, seekBar);
                        textView.setText("00:00");
                        TextView textView3 = this.f162987f.f171809b;
                        C87412m.m108591d(textView3);
                        textView3.setText("--:--");
                        this.f162986e = getResources().getDrawable(C0966R.C0969drawable.ajy);
                        Util.expandViewTouchArea(this.f162987f.f171811d, 100, 100, 100, 100);
                        this.f162987f.f171811d.setOnSeekBarChangeListener(new C66604j(this));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final Drawable getThumbDrawable() {
        return this.f162986e;
    }

    public final void setColor(int i) {
        TextView textView = this.f162987f.f171808a;
        C87412m.m108591d(textView);
        textView.setTextColor(i);
        TextView textView2 = this.f162987f.f171809b;
        C87412m.m108591d(textView2);
        textView2.setTextColor(i);
        SeekBar seekBar = this.f162987f.f171811d;
        C87412m.m108591d(seekBar);
        seekBar.getProgressDrawable().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        SeekBar seekBar2 = this.f162987f.f171811d;
        C87412m.m108591d(seekBar2);
        seekBar2.getThumb().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        Drawable drawable = this.f162986e;
        C87412m.m108591d(drawable);
        drawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        this.f162987f.f171810c.setBackgroundColor(i);
    }

    public final void setMaxProgress(int i) {
        TextView textView = this.f162987f.f171809b;
        C87412m.m108591d(textView);
        textView.setText(f162984g.mo80343a(i));
        SeekBar seekBar = this.f162987f.f171811d;
        C87412m.m108591d(seekBar);
        seekBar.setMax(i);
    }

    public final void setOnSeekBarChange(C56894b bVar) {
        C87412m.m108594g(bVar, "onSeekBarChange");
    }

    public final void setProgress(int i) {
        if (!this.f162985d) {
            TextView textView = this.f162987f.f171808a;
            C87412m.m108591d(textView);
            textView.setText(f162984g.mo80343a(i));
            SeekBar seekBar = this.f162987f.f171811d;
            C87412m.m108591d(seekBar);
            seekBar.setProgress(i);
            if (i > 0) {
                View view = this.f162987f.f171810c;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/music/ui/view/MusicPlayerSeekBar", "setProgress", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/music/ui/view/MusicPlayerSeekBar", "setProgress", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    public final void setSeeking(boolean z) {
        this.f162985d = z;
    }

    public final void setTextSize(int i) {
        TextView textView = this.f162987f.f171808a;
        C87412m.m108591d(textView);
        float f = (float) i;
        textView.setTextSize(0, f);
        TextView textView2 = this.f162987f.f171809b;
        C87412m.m108591d(textView2);
        textView2.setTextSize(0, f);
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.f162986e = drawable;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicPlayerSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
