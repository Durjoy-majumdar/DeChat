package com.tencent.p014mm.plugin.music.p080ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import ma2.C61453s;
import ya2.C112436a;
import ya2.C112437b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MarqueeLyricView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lma2/s;", "lyricObj", "Lrx3/b0;", "setLyricObj", "", "currentTime", "setCurrentTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-music_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.music.ui.view.MarqueeLyricView */
public final class MarqueeLyricView extends AppCompatTextView {

    /* renamed from: g */
    public Scroller f315168g;

    /* renamed from: h */
    public int f315169h;

    /* renamed from: i */
    public C61453s f315170i;

    /* renamed from: j */
    public int f315171j;

    /* renamed from: n */
    public int f315172n;

    /* renamed from: o */
    public int f315173o;

    /* renamed from: p */
    public Runnable f315174p;

    /* renamed from: q */
    public long f315175q;

    /* renamed from: r */
    public Runnable f315176r;

    /* renamed from: s */
    public Animation f315177s;

    /* renamed from: t */
    public Animation f315178t;

    /* renamed from: u */
    public boolean f315179u;

    /* renamed from: v */
    public int f315180v;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MarqueeLyricView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final int mo151080a(String str) {
        TextPaint paint = getPaint();
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        if (rect.width() > 0) {
            return rect.width();
        }
        return 25;
    }

    /* renamed from: b */
    public final void mo151081b(int i, String str) {
        boolean z;
        String str2;
        int i2 = i;
        String str3 = str;
        C87412m.m108594g(str3, "content");
        C61453s sVar = this.f315170i;
        if (sVar != null) {
            setText(str3);
            long j = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
            int i3 = i2 + 1;
            if (i3 < sVar.mo86427b()) {
                j = sVar.mo86426a(i3).f174760b - sVar.mo86426a(i2).f174760b;
            }
            boolean z2 = j > 1000;
            long j2 = (long) (((double) j) * 0.3d);
            long j3 = 200;
            if (200 > j2) {
                j3 = j2;
            }
            this.f315175q = j3;
            int a = mo151080a(str3);
            Log.m105919d("MicroMsg.MarqueeLyricView", "content:%s, width:%s,  contentWidth:%s, duration:%s, duration30Percent:%s, mMinDuration:%s", str3, Integer.valueOf(getWidth()), Integer.valueOf(a), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(this.f315175q));
            removeCallbacks(this.f315174p);
            this.f315168g.startScroll(0, 0, 0, 0, 0);
            if (this.f315179u) {
                this.f315177s.setDuration(this.f315175q);
                startAnimation(this.f315177s);
                z = z2;
                str2 = "MicroMsg.MarqueeLyricView";
                Log.m105919d(str2, "doFaceIn, duration:%s", Long.valueOf(this.f315175q));
                this.f315179u = false;
            } else {
                z = z2;
                str2 = "MicroMsg.MarqueeLyricView";
            }
            if (getWidth() >= a || !z) {
                Log.m105918d(str2, "stopScroll");
                return;
            }
            Log.m105918d(str2, "startScroll");
            int a2 = mo151080a(str3);
            int i4 = a2 - ((this.f315169h * 3) / 4);
            if (i4 != 0) {
                Log.m105919d(str2, "scrollingLen:%s, mXPause:%s, distance:%s", Integer.valueOf(a2), Integer.valueOf(this.f315169h), Integer.valueOf(i4));
                this.f315173o = (int) (((((float) i4) * 1.0f) / ((float) C74942w4.m89784a(getContext(), 25))) * ((float) 1000));
                this.f315171j = this.f315169h;
                this.f315172n = i4;
                postDelayed(this.f315174p, 1000);
            }
            if (sVar.mo86427b() - 1 > i2) {
                postDelayed(this.f315176r, j - this.f315175q);
                this.f315179u = true;
            }
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f315168g.computeScrollOffset()) {
            scrollTo(this.f315168g.getCurrX(), 0);
            invalidate();
        }
    }

    public boolean isFocused() {
        return true;
    }

    public final void setCurrentTime(long j) {
        Log.m105927v("MicroMsg.MarqueeLyricView", "getLyricLine, currentTime:%s", Long.valueOf(j));
        C61453s sVar = this.f315170i;
        int i = -1;
        if (sVar == null || sVar.mo86427b() <= 2) {
            Log.m105924i("MicroMsg.MarqueeLyricView", "getLyricLine, hasNoLyric");
            i = -2;
        } else if (-1 == this.f315180v) {
            this.f315180v = 0;
            C61453s sVar2 = this.f315170i;
            C87412m.m108591d(sVar2);
            String str = sVar2.mo86426a(this.f315180v).f174761c;
            C87412m.m108593f(str, "lyricObj!!.getSentence(currentLine).content");
            while (true) {
                int length = str.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = C87412m.m108596i(str.charAt(!z ? i2 : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i2++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (!(str.subSequence(i2, length + 1).toString().length() == 0)) {
                    break;
                }
                this.f315180v++;
                C61453s sVar3 = this.f315170i;
                C87412m.m108591d(sVar3);
                str = sVar3.mo86426a(this.f315180v).f174761c;
                C87412m.m108593f(str, "lyricObj!!.getSentence(currentLine).content");
            }
            i = this.f315180v;
        } else {
            C61453s sVar4 = this.f315170i;
            C87412m.m108591d(sVar4);
            int b = sVar4.mo86427b();
            int i3 = -1;
            for (int i4 = 0; i4 < b; i4++) {
                C61453s sVar5 = this.f315170i;
                C87412m.m108591d(sVar5);
                if (sVar5.mo86426a(i4).f174760b >= j) {
                    break;
                }
                C61453s sVar6 = this.f315170i;
                C87412m.m108591d(sVar6);
                if (!sVar6.mo86426a(i4).f174759a) {
                    i3 = i4;
                }
            }
            if (-1 == i3) {
                Log.m105920e("MicroMsg.MarqueeLyricView", "getLyricLine, can not found");
            } else {
                int i5 = this.f315180v;
                if (i3 == i5) {
                    Log.m105927v("MicroMsg.MarqueeLyricView", "getLyricLine, same line. [%s]", Integer.valueOf(i5));
                    i = -3;
                } else {
                    C61453s sVar7 = this.f315170i;
                    C87412m.m108591d(sVar7);
                    if (i3 >= sVar7.mo86427b()) {
                        C61453s sVar8 = this.f315170i;
                        C87412m.m108591d(sVar8);
                        Log.m105921e("MicroMsg.MarqueeLyricView", "getLyricLine, over range, tempHighLightIndex:%s, SentenceSize:%s", Integer.valueOf(i3), Integer.valueOf(sVar8.mo86427b()));
                        i = -5;
                    } else {
                        this.f315180v = i3;
                        C61453s sVar9 = this.f315170i;
                        C87412m.m108591d(sVar9);
                        String str2 = sVar9.mo86426a(i3).f174761c;
                        C87412m.m108593f(str2, "lyricObj!!.getSentence(tempHighLightIndex).content");
                        int length2 = str2.length() - 1;
                        int i6 = 0;
                        boolean z3 = false;
                        while (i6 <= length2) {
                            boolean z4 = C87412m.m108596i(str2.charAt(!z3 ? i6 : length2), 32) <= 0;
                            if (!z3) {
                                if (!z4) {
                                    z3 = true;
                                } else {
                                    i6++;
                                }
                            } else if (!z4) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        if (str2.subSequence(i6, length2 + 1).toString().length() == 0) {
                            Log.m105926v("MicroMsg.MarqueeLyricView", "getLyricLine, content length is 0");
                            i = -6;
                        } else {
                            Log.m105919d("MicroMsg.MarqueeLyricView", "lyric:%s", str2);
                            i = i3;
                        }
                    }
                }
            }
        }
        C61453s sVar10 = this.f315170i;
        if (sVar10 != null && i >= 0 && i < sVar10.mo86427b()) {
            String str3 = sVar10.mo86426a(i).f174761c;
            C87412m.m108593f(str3, "content");
            mo151081b(i, str3);
        }
    }

    public final void setLyricObj(C61453s sVar) {
        C87412m.m108594g(sVar, "lyricObj");
        setText("");
        this.f315179u = false;
        removeCallbacks(this.f315176r);
        removeCallbacks(this.f315174p);
        this.f315168g.startScroll(0, 0, 0, 0, 0);
        this.f315170i = sVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarqueeLyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315168g = new Scroller(getContext(), new LinearInterpolator());
        this.f315169h = -getWidth();
        this.f315174p = new C112437b(this);
        this.f315175q = 200;
        this.f315176r = new C112436a(this);
        this.f315177s = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2393bw);
        this.f315178t = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2394bx);
        this.f315180v = -1;
        setScroller(this.f315168g);
        setHorizontallyScrolling(true);
    }
}
