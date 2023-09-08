package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kg3.C76577a;
import ma2.C99819r;

/* renamed from: com.tencent.mm.plugin.music.ui.LyricView */
public class LyricView extends View {

    /* renamed from: G */
    public static int f272198G = C76577a.m92151b(MMApplicationContext.getContext(), 16);

    /* renamed from: H */
    public static int f272199H = C76577a.m92151b(MMApplicationContext.getContext(), 10);

    /* renamed from: A */
    public float f272200A;

    /* renamed from: B */
    public float f272201B;

    /* renamed from: C */
    public int f272202C;

    /* renamed from: D */
    public float f272203D;

    /* renamed from: E */
    public int[] f272204E;

    /* renamed from: F */
    public int[] f272205F;

    /* renamed from: d */
    public long f272206d;

    /* renamed from: e */
    public C99819r f272207e;

    /* renamed from: f */
    public GestureDetector f272208f;

    /* renamed from: g */
    public int f272209g = 1;

    /* renamed from: h */
    public TextPaint f272210h;

    /* renamed from: i */
    public TextPaint f272211i;

    /* renamed from: j */
    public Paint.Align f272212j = Paint.Align.CENTER;

    /* renamed from: n */
    public boolean f272213n = false;

    /* renamed from: o */
    public int f272214o = 0;

    /* renamed from: p */
    public int f272215p;

    /* renamed from: q */
    public int f272216q;

    /* renamed from: r */
    public int f272217r;

    /* renamed from: s */
    public int f272218s;

    /* renamed from: t */
    public int f272219t;

    /* renamed from: u */
    public int f272220u;

    /* renamed from: v */
    public int f272221v;

    /* renamed from: w */
    public boolean f272222w;

    /* renamed from: x */
    public int f272223x;

    /* renamed from: y */
    public int f272224y;

    /* renamed from: z */
    public boolean f272225z;

    /* renamed from: com.tencent.mm.plugin.music.ui.LyricView$b */
    public class C94231b extends GestureDetector.SimpleOnGestureListener {
        public C94231b(C94230a aVar) {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/LyricView$LongClickGestureDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/music/ui/LyricView$LongClickGestureDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/LyricView$LongClickGestureDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/music/ui/LyricView$LongClickGestureDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00f6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLongPress(android.view.MotionEvent r9) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/music/ui/LyricView$LongClickGestureDetector"
                java.lang.String r2 = "android/view/GestureDetector$SimpleOnGestureListener"
                java.lang.String r3 = "onLongPress"
                java.lang.String r4 = "(Landroid/view/MotionEvent;)V"
                r5 = r8
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.music.ui.LyricView r0 = com.tencent.p014mm.plugin.music.p080ui.LyricView.this
                float r1 = r9.getX()
                float r9 = r9.getY()
                int r2 = com.tencent.p014mm.plugin.music.p080ui.LyricView.f272198G
                r0.getClass()
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r4 = 0
                r3[r4] = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r9)
                r5 = 1
                r3[r5] = r1
                java.lang.String r1 = "MicroMsg.Music.LyricView"
                java.lang.String r6 = "getSentenceByXY %f, %f"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r3)
                ma2.r r3 = r0.f272207e
                if (r3 == 0) goto L_0x00c6
                int r3 = r3.mo86427b()
                if (r3 <= 0) goto L_0x00c6
                int r3 = r0.f272223x
                int r3 = r3 / r2
                int r2 = r0.f272221v
                int r3 = r3 - r2
                int r2 = r0.f272220u
                int r6 = r2 / 2
                int r7 = r3 - r6
                int r3 = r3 + r6
                float r6 = (float) r7
                int r7 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r7 < 0) goto L_0x0079
                float r7 = (float) r3
                int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r7 > 0) goto L_0x0079
                ma2.r r9 = r0.f272207e
                int r2 = r0.f272219t
                ma2.r$a r9 = r9.mo86426a(r2)
                if (r9 == 0) goto L_0x00c6
                ma2.r r9 = r0.f272207e
                int r0 = r0.f272219t
                ma2.r$a r9 = r9.mo86426a(r0)
                java.lang.String r9 = r9.f174761c
                goto L_0x00c8
            L_0x0079:
                int r7 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r7 >= 0) goto L_0x009f
                float r6 = r6 - r9
                int r9 = (int) r6
                int r9 = r9 / r2
                int r2 = r0.f272219t
                int r2 = r2 - r9
                int r2 = r2 - r5
                ma2.r r9 = r0.f272207e
                int r9 = r9.mo86427b()
                if (r2 >= r9) goto L_0x00c6
                if (r2 < 0) goto L_0x00c6
                ma2.r r9 = r0.f272207e
                ma2.r$a r9 = r9.mo86426a(r2)
                if (r9 == 0) goto L_0x00c6
                ma2.r r9 = r0.f272207e
                ma2.r$a r9 = r9.mo86426a(r2)
                java.lang.String r9 = r9.f174761c
                goto L_0x00c8
            L_0x009f:
                float r3 = (float) r3
                int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r6 <= 0) goto L_0x00c6
                float r9 = r9 - r3
                int r9 = (int) r9
                int r9 = r9 / r2
                int r2 = r0.f272219t
                int r2 = r2 + r9
                int r2 = r2 + r5
                ma2.r r9 = r0.f272207e
                int r9 = r9.mo86427b()
                if (r2 >= r9) goto L_0x00c6
                if (r2 < 0) goto L_0x00c6
                ma2.r r9 = r0.f272207e
                ma2.r$a r9 = r9.mo86426a(r2)
                if (r9 == 0) goto L_0x00c6
                ma2.r r9 = r0.f272207e
                ma2.r$a r9 = r9.mo86426a(r2)
                java.lang.String r9 = r9.f174761c
                goto L_0x00c8
            L_0x00c6:
                java.lang.String r9 = ""
            L_0x00c8:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r0 != 0) goto L_0x00f6
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r1 = "MicroMsg.Music"
                com.tencent.p014mm.sdk.platformtools.ClipboardHelper.setText(r0, r1, r9)
                com.tencent.mm.plugin.music.ui.LyricView r0 = com.tencent.p014mm.plugin.music.p080ui.LyricView.this
                android.content.Context r0 = r0.getContext()
                com.tencent.mm.plugin.music.ui.LyricView r1 = com.tencent.p014mm.plugin.music.p080ui.LyricView.this
                android.content.Context r1 = r1.getContext()
                r2 = 2131833280(0x7f1131c0, float:1.9299638E38)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                r3[r4] = r9
                java.lang.String r9 = r1.getString(r2, r3)
                android.widget.Toast r9 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r9, (int) r4)
                r9.show()
                goto L_0x00fc
            L_0x00f6:
                java.lang.String r9 = "onLongPress not found sentence"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            L_0x00fc:
                java.lang.String r9 = "com/tencent/mm/plugin/music/ui/LyricView$LongClickGestureDetector"
                java.lang.String r0 = "android/view/GestureDetector$SimpleOnGestureListener"
                java.lang.String r1 = "onLongPress"
                java.lang.String r2 = "(Landroid/view/MotionEvent;)V"
                j20.C117292a.m165361g(r8, r9, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.music.p080ui.LyricView.C94231b.onLongPress(android.view.MotionEvent):void");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/LyricView$LongClickGestureDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            LyricView.this.getClass();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/music/ui/LyricView$LongClickGestureDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public LyricView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = f272198G;
        this.f272215p = i;
        int i2 = f272199H;
        this.f272216q = i2;
        this.f272219t = -1;
        int i3 = 0 + i + i2;
        this.f272220u = i3;
        this.f272221v = i3;
        this.f272204E = new int[2];
        this.f272205F = new int[2];
        mo129538a();
    }

    /* renamed from: a */
    public final void mo129538a() {
        setNestedScrollingEnabled(true);
        TextPaint textPaint = new TextPaint();
        this.f272210h = textPaint;
        textPaint.setTextSize((float) this.f272215p);
        this.f272210h.setColor(-1);
        this.f272210h.setAntiAlias(true);
        this.f272210h.setTextAlign(this.f272212j);
        TextPaint textPaint2 = new TextPaint();
        this.f272211i = textPaint2;
        textPaint2.setTextSize((float) this.f272215p);
        this.f272211i.setColor(-1);
        this.f272211i.setAlpha(127);
        this.f272211i.setAntiAlias(true);
        this.f272211i.setTextAlign(this.f272212j);
        GestureDetector gestureDetector = new GestureDetector(getContext(), new C94231b((C94230a) null));
        this.f272208f = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    public float getTextSize() {
        return (float) ((int) this.f272210h.getTextSize());
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int descent;
        super.onDraw(canvas);
        C99819r rVar = this.f272207e;
        if (rVar == null || rVar.mo86427b() <= 2) {
            Log.m105918d("MicroMsg.Music.LyricView", "lyricObj is null | no lyric");
            int i3 = this.f272223x;
            if (i3 > 300) {
                i3 = this.f272220u;
            }
            int descent2 = ((i3 / 2) + this.f272214o) - (((int) (this.f272210h.descent() + this.f272210h.ascent())) / 2);
            if (descent2 < i3 && descent2 > 0) {
                canvas.drawText("", 0.0f, (float) descent2, this.f272210h);
                return;
            }
            return;
        }
        if (this.f272223x == 0 || this.f272224y == 0) {
            this.f272223x = getMeasuredHeight();
            this.f272224y = getMeasuredWidth();
        }
        if (this.f272219t >= 0) {
            boolean z = true;
            if (Paint.Align.LEFT == this.f272212j) {
                int i4 = this.f272221v;
                C99819r rVar2 = this.f272207e;
                if (rVar2 != null && rVar2.mo86427b() > (i2 = this.f272219t)) {
                    int i5 = this.f272214o;
                    this.f272220u = this.f272215p + i5 + this.f272216q;
                    if (!this.f272213n) {
                        int i6 = this.f272223x;
                        int i7 = ((i6 / 2) - i4) + i5;
                        if (i7 < i6 && i7 > 0 && this.f272207e.mo86426a(i2) != null && !this.f272207e.mo86426a(this.f272219t).mo86424a()) {
                            canvas.drawText(this.f272207e.mo86426a(this.f272219t).f174761c, 0.0f, (float) i7, this.f272210h);
                        }
                        int i8 = this.f272219t;
                        while (true) {
                            i8--;
                            if (i8 < 0) {
                                break;
                            }
                            int i9 = i7 - ((this.f272219t - i8) * this.f272220u);
                            if (i9 > 0 && i9 < this.f272223x && this.f272207e.mo86426a(i8) != null && !this.f272207e.mo86426a(i8).mo86424a()) {
                                canvas.drawText(this.f272207e.mo86426a(i8).f174761c, 0.0f, (float) i9, this.f272211i);
                            }
                        }
                        int i15 = this.f272219t;
                        while (true) {
                            i15++;
                            if (i15 >= this.f272207e.mo86427b()) {
                                break;
                            }
                            int i16 = ((i15 - this.f272219t) * this.f272220u) + i7;
                            if (i16 < this.f272223x && i16 > 0 && this.f272207e.mo86426a(i15) != null && !this.f272207e.mo86426a(i15).mo86424a()) {
                                canvas.drawText(this.f272207e.mo86426a(i15).f174761c, 0.0f, (float) i16, this.f272211i);
                            }
                        }
                    } else {
                        C99819r rVar3 = this.f272207e;
                        if (rVar3 != null && rVar3.mo86427b() > this.f272219t && (descent = ((this.f272223x / 2) + this.f272214o) - (((int) (this.f272210h.descent() + this.f272210h.ascent())) / 2)) < this.f272223x && descent > 0 && this.f272207e.mo86426a(this.f272219t) != null && !this.f272207e.mo86426a(this.f272219t).mo86424a()) {
                            canvas.drawText(this.f272207e.mo86426a(this.f272219t).f174761c, 0.0f, (float) descent, this.f272210h);
                        }
                    }
                }
            } else {
                int i17 = this.f272221v;
                C99819r rVar4 = this.f272207e;
                if (rVar4 != null && rVar4.mo86427b() > (i = this.f272219t)) {
                    int i18 = this.f272223x;
                    int i19 = ((i18 / 2) - i17) + this.f272214o;
                    if (i19 < i18 && i19 > 0 && this.f272207e.mo86426a(i) != null) {
                        canvas.drawText(this.f272207e.mo86426a(this.f272219t).f174761c, (float) (this.f272224y / 2), (float) i19, this.f272210h);
                    }
                    int i25 = this.f272219t;
                    while (true) {
                        i25--;
                        if (i25 < 0) {
                            break;
                        }
                        int i26 = i19 - ((this.f272219t - i25) * this.f272220u);
                        if (i26 > 0 && i26 < this.f272223x && this.f272207e.mo86426a(i25) != null) {
                            canvas.drawText(this.f272207e.mo86426a(i25).f174761c, (float) (this.f272224y / 2), (float) i26, this.f272211i);
                        }
                    }
                    int i27 = this.f272219t;
                    while (true) {
                        i27++;
                        if (i27 >= this.f272207e.mo86427b()) {
                            break;
                        }
                        int i28 = ((i27 - this.f272219t) * this.f272220u) + i19;
                        if (i28 < this.f272223x && i28 > 0 && this.f272207e.mo86426a(i27) != null) {
                            canvas.drawText(this.f272207e.mo86426a(i27).f174761c, (float) (this.f272224y / 2), (float) i28, this.f272211i);
                        }
                    }
                }
            }
            if (this.f272222w) {
                int i29 = this.f272221v;
                if (i29 == 0) {
                    z = false;
                }
                if (z) {
                    this.f272221v = (int) (((float) i29) * 0.9f);
                    invalidate();
                }
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f272223x = i2;
        this.f272224y = i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f272208f;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/music/ui/LyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/music/ui/LyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        int pointerId = motionEvent.getPointerId(0);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f272200A = motionEvent.getY();
            this.f272201B = motionEvent.getX();
            this.f272202C = this.f272221v;
            this.f272225z = true;
            this.f272222w = false;
            int findPointerIndex = motionEvent.findPointerIndex(pointerId);
            float y = findPointerIndex < 0 ? -1.0f : motionEvent.getY(findPointerIndex);
            this.f272203D = y;
            if (y == -1.0f) {
                return false;
            }
            if (2 == this.f272209g) {
                startNestedScroll(2);
            }
        } else if (action == 1) {
            this.f272225z = false;
        } else if (action == 2) {
            int x = (int) (motionEvent.getX() - this.f272201B);
            int y2 = (int) (motionEvent.getY() - this.f272200A);
            int i = this.f272202C - y2;
            if (i > 0) {
                int i2 = this.f272218s;
                if (i <= i2) {
                    i2 = i;
                }
                this.f272221v = i2;
            } else {
                int i3 = -this.f272217r;
                if (i >= i3) {
                    i3 = i;
                }
                this.f272221v = i3;
            }
            invalidate();
            Log.m105919d("MicroMsg.Music.LyricView", "xDistance: %d yDisntance: %d tempYOffset: %d baseYOffset: %d", Integer.valueOf(x), Integer.valueOf(y2), Integer.valueOf(i), Integer.valueOf(this.f272202C));
            if (2 == this.f272209g) {
                int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                float y3 = findPointerIndex2 < 0 ? -1.0f : motionEvent.getY(findPointerIndex2);
                if (y3 == -1.0f) {
                    return false;
                }
                float f = y3 - this.f272203D;
                dispatchNestedPreScroll(0, 0, this.f272204E, this.f272205F);
                dispatchNestedScroll(0, (int) f, 0, 0, (int[]) null);
            }
        }
        return true;
    }

    public void setCurrentTime(long j) {
        if (this.f272206d != j) {
            this.f272206d = j;
            C99819r rVar = this.f272207e;
            if (rVar != null && rVar.mo86427b() != 0) {
                int i = -1;
                int i2 = 0;
                while (i2 < this.f272207e.mo86427b() && this.f272207e.mo86426a(i2).f174760b < j) {
                    if (!this.f272207e.mo86426a(i2).f174759a) {
                        i = i2;
                    }
                    i2++;
                }
                if (!this.f272225z && i != this.f272219t) {
                    this.f272219t = i;
                    int i3 = this.f272220u;
                    this.f272217r = i * i3;
                    this.f272218s = i3 * ((this.f272207e.mo86427b() - this.f272219t) - 1);
                    if (this.f272221v == 0) {
                        this.f272221v = -this.f272220u;
                    }
                    this.f272222w = true;
                    invalidate();
                }
            }
        }
    }

    public void setLyricColor(int i) {
        this.f272210h.setColor(i);
        this.f272210h.setAlpha(255);
        this.f272211i.setColor(i);
        this.f272211i.setAlpha(127);
    }

    public void setLyricObj(C99819r rVar) {
        this.f272207e = rVar;
        invalidate();
    }

    public void setMode(int i) {
        this.f272209g = i;
        boolean z = true;
        if (1 != i) {
            z = false;
        }
        this.f272213n = z;
    }

    public void setTextSize(float f) {
        this.f272210h.setTextSize(f);
        this.f272211i.setTextSize(f);
    }

    public LyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = f272198G;
        this.f272215p = i2;
        int i3 = f272199H;
        this.f272216q = i3;
        this.f272219t = -1;
        int i4 = 0 + i2 + i3;
        this.f272220u = i4;
        this.f272221v = i4;
        this.f272204E = new int[2];
        this.f272205F = new int[2];
        mo129538a();
    }
}
