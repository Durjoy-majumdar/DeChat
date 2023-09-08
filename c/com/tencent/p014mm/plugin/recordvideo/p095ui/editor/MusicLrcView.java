package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import p295b8.C16774g;
import p370p7.C21962v;
import p396x6.C22997e;
import p396x6.C23016o;
import p396x6.C23017p;
import p396x6.C23023u;
import p396x6.C23027v;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$R.\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/MusicLrcView;", "Landroid/widget/TextView;", "Lx6/u;", "value", "d", "Lx6/u;", "getPlayer", "()Lx6/u;", "setPlayer", "(Lx6/u;)V", "player", "", "e", "Z", "isRunningShow", "()Z", "setRunningShow", "(Z)V", "", "g", "I", "getRndDuration", "()I", "setRndDuration", "(I)V", "rndDuration", "j", "getScrollFirstDelay", "setScrollFirstDelay", "scrollFirstDelay", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView */
public final class MusicLrcView extends TextView {

    /* renamed from: o */
    public static final C106046a f315656o = new C106046a((C8480h) null);

    /* renamed from: d */
    public C23023u f315657d;

    /* renamed from: e */
    public boolean f315658e;

    /* renamed from: f */
    public Scroller f315659f;

    /* renamed from: g */
    public int f315660g;

    /* renamed from: h */
    public int f315661h;

    /* renamed from: i */
    public boolean f315662i;

    /* renamed from: j */
    public int f315663j;

    /* renamed from: n */
    public final int f315664n;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView$a */
    public static final class C106046a {
        public C106046a(C8480h hVar) {
        }

        /* renamed from: a */
        public final CharSequence mo151509a(String str, CharSequence charSequence, int i) {
            int B;
            C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
            SpannableString spannableString = new SpannableString(str);
            if (charSequence == null || charSequence.length() == 0) {
                return spannableString;
            }
            int length = charSequence.length();
            int i2 = 0;
            do {
                B = C112550d0.m153766B(str, charSequence.toString(), i2, false);
                if (B != -1) {
                    int i3 = B + length;
                    i2 += i3;
                    spannableString.setSpan(new ForegroundColorSpan(i), B, i3, 33);
                    continue;
                }
            } while (B != -1);
            return spannableString;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView$b */
    public static final class C106047b implements C23017p.C23018a {

        /* renamed from: d */
        public final /* synthetic */ MusicLrcView f315665d;

        public C106047b(MusicLrcView musicLrcView) {
            this.f315665d = musicLrcView;
        }

        public void onLoadingChanged(boolean z) {
        }

        public void onPlaybackParametersChanged(C23016o oVar) {
        }

        public void onPlayerError(C22997e eVar) {
        }

        public void onPlayerStateChanged(boolean z, int i) {
            if (i == 3) {
                MusicLrcView musicLrcView = this.f315665d;
                C106046a aVar = MusicLrcView.f315656o;
                if (musicLrcView.f315658e) {
                    musicLrcView.f315661h = musicLrcView.getWidth();
                    musicLrcView.f315662i = true;
                    musicLrcView.mo151500b();
                }
                C23023u player = this.f315665d.getPlayer();
                Long l = null;
                Long valueOf = player != null ? Long.valueOf(player.getDuration()) : null;
                C87412m.m108591d(valueOf);
                if (valueOf.longValue() < ((long) this.f315665d.getRndDuration())) {
                    MusicLrcView musicLrcView2 = this.f315665d;
                    C23023u player2 = musicLrcView2.getPlayer();
                    if (player2 != null) {
                        l = Long.valueOf(player2.getDuration());
                    }
                    C87412m.m108591d(l);
                    musicLrcView2.setRndDuration((int) l.longValue());
                }
            }
        }

        public void onPositionDiscontinuity() {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onTimelineChanged(C23027v vVar, Object obj) {
        }

        public void onTracksChanged(C21962v vVar, C16774g gVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView$c */
    public static final class C106048c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicLrcView f315666d;

        /* renamed from: e */
        public final /* synthetic */ int f315667e;

        /* renamed from: f */
        public final /* synthetic */ int f315668f;

        public C106048c(MusicLrcView musicLrcView, int i, int i2) {
            this.f315666d = musicLrcView;
            this.f315667e = i;
            this.f315668f = i2;
        }

        public final void run() {
            Scroller scroller = this.f315666d.f315659f;
            C87412m.m108591d(scroller);
            scroller.startScroll(this.f315666d.f315661h, 0, this.f315667e, 0, this.f315668f);
            this.f315666d.invalidate();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicLrcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public static void m142616c(MusicLrcView musicLrcView, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        musicLrcView.f315658e = z;
        if (!z) {
            Scroller scroller = musicLrcView.f315659f;
            if (scroller != null) {
                scroller.startScroll(0, 0, 0, 0, 0);
            }
        } else if (z) {
            if (i == -1) {
                i = musicLrcView.getWidth();
            }
            musicLrcView.f315661h = i;
            musicLrcView.f315662i = true;
            musicLrcView.mo151500b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo151499a(java.util.ArrayList<com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo.C57170c> r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0077
            boolean r0 = r5.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0077
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x0013:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo$c r3 = (com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo.C57170c) r3
            java.lang.String r3 = r3.f163832a
            r0.append(r3)
            java.lang.String r3 = "  "
            r0.append(r3)
            goto L_0x0013
        L_0x002a:
            if (r6 == 0) goto L_0x0057
            int r2 = r6.length()
            r3 = 0
            if (r2 <= 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "sb.toString()"
            gy3.C87412m.m108593f(r1, r2)
            boolean r1 = z04.C112550d0.m153801u(r1, r6, r3)
            if (r1 == 0) goto L_0x0057
            com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView$a r1 = f315656o
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r2)
            int r2 = r4.f315664n
            java.lang.CharSequence r6 = r1.mo151509a(r0, r6, r2)
            goto L_0x005b
        L_0x0057:
            java.lang.String r6 = r0.toString()
        L_0x005b:
            r4.setText(r6)
            java.lang.Object r6 = sx3.C110818d0.m150923U(r5)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo$c r6 = (com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo.C57170c) r6
            int r6 = r6.f163834c
            java.lang.Object r5 = sx3.C110818d0.m150914L(r5)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo$c r5 = (com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo.C57170c) r5
            int r5 = r5.f163833b
            int r6 = r6 - r5
            r4.f315660g = r6
            if (r6 != 0) goto L_0x0077
            r5 = 10000(0x2710, float:1.4013E-41)
            r4.f315660g = r5
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.p095ui.editor.MusicLrcView.mo151499a(java.util.ArrayList, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo151500b() {
        if (this.f315658e) {
            setHorizontallyScrolling(true);
            if (this.f315659f == null) {
                Scroller scroller = new Scroller(getContext(), new LinearInterpolator());
                this.f315659f = scroller;
                setScroller(scroller);
            }
            TextPaint paint = getPaint();
            Rect rect = new Rect();
            String obj = getText().toString();
            paint.getTextBounds(obj, 0, obj.length(), rect);
            int width = rect.width() > 0 ? rect.width() : getWidth();
            int i = width - ((this.f315661h * 3) / 4);
            if (i != 0) {
                int i2 = (this.f315660g * i) / width;
                if (this.f315662i) {
                    postDelayed(new C106048c(this, i, i2), (long) this.f315663j);
                    return;
                }
                Scroller scroller2 = this.f315659f;
                C87412m.m108591d(scroller2);
                scroller2.startScroll(this.f315661h, 0, i, 0, i2);
                invalidate();
            }
        }
    }

    public void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.f315659f;
        if (scroller != null) {
            C87412m.m108591d(scroller);
            if (scroller.isFinished()) {
                this.f315661h = -getWidth();
                this.f315662i = false;
                mo151500b();
            }
        }
    }

    public final C23023u getPlayer() {
        return this.f315657d;
    }

    public final int getRndDuration() {
        return this.f315660g;
    }

    public final int getScrollFirstDelay() {
        return this.f315663j;
    }

    public final void setPlayer(C23023u uVar) {
        if (uVar != null) {
            this.f315657d = uVar;
            uVar.mo36323h(new C106047b(this));
        }
    }

    public final void setRndDuration(int i) {
        this.f315660g = i;
    }

    public final void setRunningShow(boolean z) {
        this.f315658e = z;
    }

    public final void setScrollFirstDelay(int i) {
        this.f315663j = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicLrcView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315660g = 10000;
        this.f315661h = -getWidth();
        this.f315662i = true;
        this.f315664n = C76577a.m92153d(context, C0966R.color.ahy);
    }
}
