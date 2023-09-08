package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;
import lu3.C34379c;
import nj3.C109752f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.tools.CropImageView */
public class CropImageView extends ImageView {

    /* renamed from: F */
    public static final /* synthetic */ int f348487F = 0;

    /* renamed from: A */
    public C116127d f348488A;

    /* renamed from: B */
    public boolean f348489B = true;

    /* renamed from: C */
    public View.OnTouchListener f348490C;

    /* renamed from: D */
    public boolean f348491D;

    /* renamed from: E */
    public Drawable f348492E;

    /* renamed from: d */
    public boolean f348493d = true;

    /* renamed from: e */
    public Bitmap f348494e;

    /* renamed from: f */
    public boolean f348495f = false;

    /* renamed from: g */
    public float f348496g;

    /* renamed from: h */
    public float f348497h;

    /* renamed from: i */
    public float f348498i;

    /* renamed from: j */
    public float f348499j;

    /* renamed from: n */
    public PointF f348500n = new PointF();

    /* renamed from: o */
    public float f348501o = 0.0f;

    /* renamed from: p */
    public float f348502p = 0.0f;

    /* renamed from: q */
    public boolean f348503q = false;

    /* renamed from: r */
    public boolean f348504r = false;

    /* renamed from: s */
    public float f348505s = 1.0f;

    /* renamed from: t */
    public boolean f348506t = false;

    /* renamed from: u */
    public boolean f348507u = false;

    /* renamed from: v */
    public C34379c<?> f348508v = null;

    /* renamed from: w */
    public MMHandler f348509w = new C116123a();

    /* renamed from: x */
    public MMHandler f348510x = new C116124b();

    /* renamed from: y */
    public long f348511y;

    /* renamed from: z */
    public int f348512z = 0;

    /* renamed from: com.tencent.mm.ui.tools.CropImageView$a */
    public class C116123a extends MMHandler {
        public C116123a() {
        }

        public void handleMessage(Message message) {
            C116127d dVar;
            Log.m105918d("MicroMsg.CropImageView", "on handler");
            int i = message.what;
            if (i == 4659) {
                CropImageView.this.mo177441a();
            } else if (i == 4658) {
                CropImageView.this.mo177442b();
            } else if (i != 4660 && i == 4661) {
                MotionEvent motionEvent = (MotionEvent) message.obj;
                CropImageView.this.f348511y = System.currentTimeMillis();
                boolean z = true;
                CropImageView.this.f348504r = false;
                if (motionEvent.getRawX() - CropImageView.this.f348498i > 10.0f || motionEvent.getRawY() - CropImageView.this.f348499j > 10.0f || motionEvent.getRawX() - CropImageView.this.f348498i < -10.0f || motionEvent.getRawY() - CropImageView.this.f348499j < -10.0f) {
                    z = false;
                }
                if (z) {
                    long currentTimeMillis = System.currentTimeMillis();
                    CropImageView cropImageView = CropImageView.this;
                    long j = cropImageView.f348511y;
                    if (j != 0) {
                        long j2 = currentTimeMillis - j;
                        if (j2 < 300 && j2 >= 0 && (dVar = cropImageView.f348488A) != null) {
                            CropImageNewUI cropImageNewUI = CropImageNewUI.this;
                            int i2 = CropImageNewUI.f348463t;
                            cropImageNewUI.getClass();
                            Log.m105918d("MicroMsg.CropImageUI", "doShowOrNot");
                            if (cropImageNewUI.f348467g.getVisibility() == 0) {
                                cropImageNewUI.f348467g.setVisibility(4);
                            } else if (cropImageNewUI.f348467g.getVisibility() == 4) {
                                cropImageNewUI.f348467g.setVisibility(0);
                            }
                        }
                    }
                    CropImageView.this.f348511y = 0;
                }
                CropImageView cropImageView2 = CropImageView.this;
                PointF pointF = cropImageView2.f348500n;
                Bitmap bitmap = cropImageView2.f348494e;
                if (!(pointF == null || bitmap == null)) {
                    pointF.set(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
                }
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CropImageView$b */
    public class C116124b extends MMHandler {
        public C116124b() {
        }

        public void handleMessage(Message message) {
            if (message.what != 4653) {
                CropImageView cropImageView = CropImageView.this;
                int i = CropImageView.f348487F;
                cropImageView.getClass();
                cropImageView.setImageBitmap(cropImageView.f348494e);
                cropImageView.invalidate();
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CropImageView$c */
    public class C116125c implements View.OnTouchListener {

        /* renamed from: com.tencent.mm.ui.tools.CropImageView$c$a */
        public class C116126a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MotionEvent f348516d;

            public C116126a(MotionEvent motionEvent) {
                this.f348516d = motionEvent;
            }

            public void run() {
                if (CropImageView.this.f348507u) {
                    Message message = new Message();
                    message.what = 4661;
                    message.obj = this.f348516d;
                    CropImageView.this.f348509w.sendMessage(message);
                    CropImageView.this.f348507u = false;
                }
            }
        }

        public C116125c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            CropImageView cropImageView = CropImageView.this;
            if (!cropImageView.f348489B) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (cropImageView.f348494e == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                int action = motionEvent.getAction() & 255;
                Log.m105918d("MicroMsg.CropImageView", "on touch : event type=" + action + ", isDownOnImg=" + CropImageView.this.f348504r);
                if (CropImageView.this.f348504r || action == 0) {
                    if (action == 0) {
                        Log.m105918d("MicroMsg.CropImageView", "action_down");
                        CropImageView.this.f348496g = motionEvent.getRawX();
                        CropImageView.this.f348497h = motionEvent.getRawY();
                        Log.m105918d("MicroMsg.CropImageView", "lastX=" + CropImageView.this.f348496g + ",lastY=" + CropImageView.this.f348497h);
                        CropImageView cropImageView2 = CropImageView.this;
                        cropImageView2.f348498i = cropImageView2.f348496g;
                        cropImageView2.f348499j = cropImageView2.f348497h;
                        Matrix imageMatrix = cropImageView2.getImageMatrix();
                        RectF rectF = new RectF();
                        rectF.set(0.0f, 0.0f, (float) CropImageView.this.f348494e.getWidth(), (float) CropImageView.this.f348494e.getHeight());
                        imageMatrix.mapRect(rectF);
                        CropImageView cropImageView3 = CropImageView.this;
                        cropImageView3.f348504r = rectF.contains(cropImageView3.f348496g, cropImageView3.f348497h);
                        CropImageView.this.f348511y = System.currentTimeMillis();
                    } else if (action == 1) {
                        Log.m105918d("MicroMsg.CropImageView", "action_up");
                        CropImageView cropImageView4 = CropImageView.this;
                        if (cropImageView4.f348507u) {
                            cropImageView4.f348507u = false;
                            if (cropImageView4.f348506t) {
                                cropImageView4.f348506t = false;
                                cropImageView4.mo177442b();
                                CropImageView.this.mo177442b();
                                CropImageView.this.mo177442b();
                                CropImageView.this.mo177442b();
                                CropImageView.this.mo177442b();
                            } else {
                                cropImageView4.f348506t = true;
                                cropImageView4.mo177441a();
                                CropImageView.this.mo177441a();
                                CropImageView.this.mo177441a();
                                CropImageView.this.mo177441a();
                                CropImageView.this.mo177441a();
                            }
                        } else {
                            cropImageView4.f348507u = true;
                            C34379c<?> cVar = cropImageView4.f348508v;
                            if (cVar != null) {
                                cVar.cancel(true);
                            }
                            CropImageView.this.f348508v = ((C119157j) C119157j.f356862d).mo183878i(new C116126a(motionEvent), 200);
                        }
                    } else if (action == 2) {
                        Log.m105918d("MicroMsg.CropImageView", "action_move");
                        if (CropImageView.this.f348503q) {
                            Log.m105918d("MicroMsg.CropImageView", "is valid mult down");
                            CropImageView.this.f348502p = C109752f.m149071a(motionEvent);
                            CropImageView cropImageView5 = CropImageView.this;
                            float f = cropImageView5.f348502p;
                            float f2 = f - cropImageView5.f348501o;
                            if (f > 5.0f && Math.abs(f2) > 5.0f) {
                                C109752f.m149074d(CropImageView.this.f348500n, motionEvent);
                                Log.m105918d("MicroMsg.CropImageView", "mX=" + CropImageView.this.f348500n.x + ",mY=" + CropImageView.this.f348500n.y);
                                if (f2 > 0.0f) {
                                    Log.m105918d("MicroMsg.CropImageView", "zoom in");
                                    CropImageView.this.mo177441a();
                                } else {
                                    Log.m105918d("MicroMsg.CropImageView", "zoom out");
                                    CropImageView.this.mo177442b();
                                }
                            }
                            CropImageView cropImageView6 = CropImageView.this;
                            cropImageView6.f348501o = cropImageView6.f348502p;
                        }
                        if (!CropImageView.this.f348495f) {
                            float rawX = motionEvent.getRawX() - CropImageView.this.f348496g;
                            float rawY = motionEvent.getRawY() - CropImageView.this.f348497h;
                            if (Math.abs(rawX) > 5.0f || Math.abs(rawY) > 5.0f) {
                                CropImageView.this.getImageMatrix().postTranslate(rawX, rawY);
                            }
                            CropImageView.this.invalidate();
                        }
                        CropImageView cropImageView7 = CropImageView.this;
                        cropImageView7.f348495f = false;
                        cropImageView7.f348496g = motionEvent.getRawX();
                        CropImageView.this.f348497h = motionEvent.getRawY();
                    } else if (action == 5) {
                        Log.m105918d("MicroMsg.CropImageView", "action_mult_down");
                        CropImageView cropImageView8 = CropImageView.this;
                        cropImageView8.f348495f = true;
                        cropImageView8.f348501o = C109752f.m149071a(motionEvent);
                        CropImageView cropImageView9 = CropImageView.this;
                        if (cropImageView9.f348501o > 5.0f) {
                            cropImageView9.f348503q = true;
                            C109752f.m149074d(cropImageView9.f348500n, motionEvent);
                            C117292a.m165362h(true, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return true;
                        }
                    } else if (action == 6) {
                        Log.m105918d("MicroMsg.CropImageView", "action_mult_up");
                        CropImageView cropImageView10 = CropImageView.this;
                        cropImageView10.f348503q = false;
                        cropImageView10.f348495f = true;
                        C117292a.m165362h(true, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return true;
                    }
                    C117292a.m165362h(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CropImageView$d */
    public interface C116127d {
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C116125c cVar = new C116125c();
        this.f348490C = cVar;
        this.f348491D = false;
        setOnTouchListener(cVar);
    }

    /* renamed from: a */
    public void mo177441a() {
        float f = this.f348505s * 1.0666f;
        this.f348505s = f;
        if (!this.f348493d || 4.0f >= f) {
            PointF pointF = this.f348500n;
            float f2 = pointF.x;
            float f3 = pointF.y;
            float[] fArr = {f2, f3};
            float[] fArr2 = {f2, f3};
            getImageMatrix().mapPoints(fArr2);
            getImageMatrix().postScale(1.0666f, 1.0666f);
            getImageMatrix().mapPoints(fArr);
            getImageMatrix().postTranslate((fArr2[0] - fArr[0]) / 2.0f, (fArr2[1] - fArr[1]) / 2.0f);
            setImageBitmap(this.f348494e);
            invalidate();
            return;
        }
        this.f348505s = 4.0f;
    }

    /* renamed from: b */
    public void mo177442b() {
        float f = this.f348505s * 0.9375f;
        this.f348505s = f;
        if (0.4f > f) {
            this.f348505s = 0.4f;
            return;
        }
        PointF pointF = this.f348500n;
        float f2 = pointF.x;
        float f3 = pointF.y;
        float[] fArr = {f2, f3};
        float[] fArr2 = {f2, f3};
        getImageMatrix().mapPoints(fArr2);
        getImageMatrix().postScale(0.9375f, 0.9375f);
        getImageMatrix().mapPoints(fArr);
        getImageMatrix().postTranslate((fArr2[0] - fArr[0]) / 2.0f, (fArr2[1] - fArr[1]) / 2.0f);
        setImageBitmap(this.f348494e);
        invalidate();
    }

    public Bitmap getBmp() {
        return this.f348494e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f348492E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getGifHeight() {
        /*
            r1 = this;
            boolean r0 = r1.f348491D
            if (r0 == 0) goto L_0x000d
            android.graphics.drawable.Drawable r0 = r1.f348492E
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getIntrinsicHeight()
            return r0
        L_0x000d:
            int r0 = r1.getHeight()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.CropImageView.getGifHeight():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f348492E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getGifWidth() {
        /*
            r1 = this;
            boolean r0 = r1.f348491D
            if (r0 == 0) goto L_0x000d
            android.graphics.drawable.Drawable r0 = r1.f348492E
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getIntrinsicWidth()
            return r0
        L_0x000d:
            int r0 = r1.getWidth()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.CropImageView.getGifWidth():int");
    }

    public int getRotateCount() {
        return this.f348512z;
    }

    public void setEnableOprate(boolean z) {
        this.f348489B = z;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [ul3.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGifPath(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 1
            r2.f348491D = r0     // Catch:{ Exception -> 0x001f }
            java.lang.Class<ul3.c> r0 = ul3.C102054c.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x001f }
            ul3.c r0 = (ul3.C102054c) r0     // Catch:{ Exception -> 0x001f }
            r1 = 0
            if (r0 == 0) goto L_0x0019
            ul3.b r3 = r0.mo126040w(r3, r3)     // Catch:{ Exception -> 0x001f }
            boolean r0 = r3 instanceof android.graphics.drawable.Drawable     // Catch:{ Exception -> 0x001f }
            if (r0 == 0) goto L_0x0019
            r1 = r3
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1     // Catch:{ Exception -> 0x001f }
        L_0x0019:
            r2.f348492E = r1     // Catch:{ Exception -> 0x001f }
            r2.setImageDrawable(r1)     // Catch:{ Exception -> 0x001f }
            goto L_0x0022
        L_0x001f:
            r3 = 0
            r2.f348491D = r3
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.CropImageView.setGifPath(java.lang.String):void");
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f348491D = false;
        this.f348494e = bitmap;
        PointF pointF = this.f348500n;
        if (!(pointF == null || bitmap == null)) {
            pointF.set(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        }
        super.setImageBitmap(bitmap);
    }

    public void setLimitZoomIn(boolean z) {
        this.f348493d = z;
    }

    public void setOnShortClick(C116127d dVar) {
        this.f348488A = dVar;
    }
}
