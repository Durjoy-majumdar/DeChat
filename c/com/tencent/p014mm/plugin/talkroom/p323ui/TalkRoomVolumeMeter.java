package com.tencent.p014mm.plugin.talkroom.p323ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter */
public class TalkRoomVolumeMeter extends FrameLayout {

    /* renamed from: d */
    public C19277a f54352d;

    /* renamed from: e */
    public ImageView f54353e;

    /* renamed from: f */
    public ImageView f54354f;

    /* renamed from: g */
    public ImageView f54355g;

    /* renamed from: h */
    public FrameLayout f54356h;

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter$a */
    public class C19277a extends SurfaceView implements SurfaceHolder.Callback {

        /* renamed from: d */
        public int f54357d = 100;

        /* renamed from: e */
        public float f54358e = 0.0f;

        /* renamed from: f */
        public float f54359f = 0.0f;

        /* renamed from: g */
        public SurfaceHolder f54360g;

        /* renamed from: h */
        public Bitmap f54361h;

        /* renamed from: i */
        public Bitmap f54362i;

        /* renamed from: j */
        public Bitmap f54363j;

        /* renamed from: n */
        public Paint f54364n;

        /* renamed from: o */
        public Rect f54365o;

        /* renamed from: p */
        public int f54366p;

        /* renamed from: q */
        public int f54367q;

        /* renamed from: r */
        public MTimerHandler f54368r;

        /* renamed from: s */
        public boolean f54369s = false;

        /* renamed from: t */
        public float f54370t = 0.0f;

        /* renamed from: u */
        public float f54371u = 0.0f;

        /* renamed from: v */
        public PaintFlagsDrawFilter f54372v;

        /* renamed from: w */
        public boolean f54373w = false;

        /* renamed from: x */
        public boolean f54374x = false;

        /* renamed from: y */
        public float[] f54375y;

        public C19277a(TalkRoomVolumeMeter talkRoomVolumeMeter, Context context) {
            super(context);
            SurfaceHolder holder = getHolder();
            this.f54360g = holder;
            holder.addCallback(this);
            Paint paint = new Paint();
            this.f54364n = paint;
            paint.setAntiAlias(true);
            this.f54372v = new PaintFlagsDrawFilter(0, 3);
            this.f54368r = new MTimerHandler(new C19278d(this), true);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Log.m105926v("MicroMsg.TalkRoomVoiceMeter", "surfaceChanged, width = " + i2 + " height = " + i3);
            this.f54359f = 0.0f;
            Bitmap bitmap = this.f54361h;
            int i4 = 190;
            this.f54358e = (float) (i3 - (bitmap == null ? 190 : bitmap.getHeight()));
            float f = this.f54359f;
            this.f54370t = f;
            this.f54371u = f;
            this.f54367q = i2;
            Bitmap bitmap2 = this.f54361h;
            if (bitmap2 != null) {
                i4 = bitmap2.getHeight();
            }
            this.f54366p = i4;
            int i5 = (int) this.f54370t;
            this.f54365o = new Rect(0, i5, this.f54367q, this.f54366p + i5);
            this.f54369s = true;
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Log.m105926v("MicroMsg.TalkRoomVoiceMeter", "surfaceCreated");
            this.f54361h = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.bml);
            this.f54363j = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.bmk);
            this.f54362i = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.bmm);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Log.m105926v("MicroMsg.TalkRoomVoiceMeter", "surfaceDestroyed");
            this.f54369s = false;
            this.f54368r.stopTimer();
            Bitmap bitmap = this.f54361h;
            if (bitmap != null) {
                Log.m105925i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", bitmap.toString());
                this.f54361h.recycle();
                this.f54361h = null;
            }
            Bitmap bitmap2 = this.f54363j;
            if (bitmap2 != null) {
                Log.m105925i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", bitmap2.toString());
                this.f54363j.recycle();
                this.f54363j = null;
            }
            Bitmap bitmap3 = this.f54362i;
            if (bitmap3 != null) {
                Log.m105925i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", bitmap3.toString());
                this.f54362i.recycle();
                this.f54362i = null;
            }
        }
    }

    public TalkRoomVolumeMeter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo24826a();
    }

    private void setShowErr(boolean z) {
        this.f54355g.setVisibility(z ? 0 : 8);
    }

    private void setShowRed(boolean z) {
        this.f54352d.f54373w = z;
    }

    /* renamed from: a */
    public final void mo24826a() {
        this.f54352d = new C19277a(this, getContext());
        ImageView imageView = new ImageView(getContext());
        this.f54353e = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f54353e.setImageResource(C0966R.C0969drawable.bmo);
        this.f54353e.setVisibility(0);
        ImageView imageView2 = new ImageView(getContext());
        this.f54354f = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f54354f.setImageResource(C0966R.C0969drawable.bmn);
        this.f54354f.setVisibility(8);
        ImageView imageView3 = new ImageView(getContext());
        this.f54355g = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f54355g.setImageResource(C0966R.C0969drawable.bmk);
        this.f54355g.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f54356h = frameLayout;
        frameLayout.addView(this.f54352d);
        this.f54356h.addView(this.f54354f);
        this.f54356h.setVisibility(8);
        addView(this.f54356h);
        addView(this.f54355g);
        addView(this.f54353e);
        setBackgroundColor(-16777216);
        bringChildToFront(this.f54353e);
    }

    public void setMax(int i) {
        this.f54352d.f54357d = i;
    }

    public void setMaxPos(int i) {
        this.f54352d.f54359f = (float) i;
    }

    public void setMinPos(int i) {
        this.f54352d.f54358e = (float) i;
    }

    public void setShowFlame(boolean z) {
        Canvas lockCanvas;
        this.f54356h.setVisibility(z ? 0 : 8);
        if (z) {
            C19277a aVar = this.f54352d;
            if (!aVar.f54374x) {
                aVar.f54374x = true;
                aVar.f54368r.startTimer(100);
                return;
            }
            return;
        }
        C19277a aVar2 = this.f54352d;
        if (aVar2.f54374x) {
            aVar2.f54374x = false;
            float f = aVar2.f54371u;
            if (!(f < aVar2.f54358e || f > aVar2.f54359f || aVar2.f54362i == null || aVar2.f54361h == null || (lockCanvas = aVar2.f54360g.lockCanvas()) == null || aVar2.f54365o == null)) {
                lockCanvas.setDrawFilter(aVar2.f54372v);
                int i = (int) 0.0f;
                aVar2.f54365o.set(0, i, aVar2.f54367q, aVar2.f54366p + i);
                lockCanvas.drawBitmap(aVar2.f54373w ? aVar2.f54362i : aVar2.f54361h, (Rect) null, aVar2.f54365o, aVar2.f54364n);
                aVar2.f54360g.unlockCanvasAndPost(lockCanvas);
            }
            aVar2.f54368r.stopTimer();
        }
    }

    public void setValue(int i) {
        C19277a aVar = this.f54352d;
        if (i < 0) {
            i = 0;
        } else {
            int i2 = aVar.f54357d;
            if (i > i2) {
                i = i2;
            }
        }
        aVar.getClass();
        float f = aVar.f54359f;
        aVar.f54371u = f - ((f - aVar.f54358e) * ((((float) i) * 1.0f) / ((float) aVar.f54357d)));
    }

    public TalkRoomVolumeMeter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo24826a();
    }
}
