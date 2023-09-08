package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import ax1.C39642e;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dx1.C97559e;
import f40.C86737h0;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kx1.C46787a;
import nj3.C88989a;
import p192l4.C10462b;
import p663qo.C101213l;
import pr3.C89436a;
import qo3.C77407n;
import sn0.C90259e;
import vo3.C90852c;
import yw1.C53601h;
import zt3.C119157j;

@C86737h0
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI */
public class GameImagePreviewUI extends MMActivity {

    /* renamed from: q */
    public static final /* synthetic */ int f271648q = 0;

    /* renamed from: d */
    public GestureDetector f271649d;

    /* renamed from: e */
    public C97559e f271650e;

    /* renamed from: f */
    public String f271651f;

    /* renamed from: g */
    public String f271652g;

    /* renamed from: h */
    public String f271653h;

    /* renamed from: i */
    public String f271654i;

    /* renamed from: j */
    public boolean f271655j = true;

    /* renamed from: n */
    public C77407n f271656n;

    /* renamed from: o */
    public String f271657o;

    /* renamed from: p */
    public String f271658p;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI$a */
    public class C94079a extends GestureDetector.SimpleOnGestureListener {
        public C94079a() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            GameImagePreviewUI gameImagePreviewUI = GameImagePreviewUI.this;
            if (!Util.isNullOrNil(gameImagePreviewUI.f271657o)) {
                if (gameImagePreviewUI.f271656n == null) {
                    gameImagePreviewUI.f271656n = new C77407n((Context) gameImagePreviewUI.getContext(), 1, false);
                }
                C77407n nVar = gameImagePreviewUI.f271656n;
                nVar.f225771i = new C94083c(gameImagePreviewUI);
                nVar.f225782p = new C94084d(gameImagePreviewUI);
                nVar.f225761d = new C94085e(gameImagePreviewUI);
                if (!gameImagePreviewUI.getContext().isFinishing()) {
                    gameImagePreviewUI.f271656n.mo107573q();
                }
            }
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            GameImagePreviewUI.this.finish();
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI$b */
    public class C94080b implements C39642e {
        public C94080b() {
        }

        /* renamed from: a */
        public void mo62209a(boolean z, int i, String str, String str2) {
            Log.m105925i("MicroMsg.GameImagePreviewUI", "success:%b, errCode:%d, filePath:%s", Boolean.valueOf(z), Integer.valueOf(i), str2);
            GameImagePreviewUI.this.f271655j = false;
            if (!z || !C86013q1.m106450k(str2)) {
                ((C119157j) C119157j.f356862d).mo183895z(new GameImagePreviewUI$b$$b(this));
                return;
            }
            ((C119157j) C119157j.f356862d).mo183895z(new GameImagePreviewUI$b$$a(this, str2));
        }

        /* renamed from: b */
        public void mo62210b(int i, String str) {
            Log.m105925i("MicroMsg.GameImagePreviewUI", "percent:%d", Integer.valueOf(i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI$c */
    public class C94081c implements View.OnLongClickListener {
        public C94081c(GameImagePreviewUI gameImagePreviewUI) {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: H7 */
    public final Bitmap mo129094H7(String str) {
        if (str == null) {
            return null;
        }
        Log.m105924i("MicroMsg.GameImagePreviewUI", str);
        C20828a b = C20828a.m22825b();
        Bitmap e = b.mo32516e(str + "_" + C86013q1.m106451l(str));
        if (e != null && !e.isRecycled()) {
            return e;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        Log.m105924i("MicroMsg.GameImagePreviewUI", String.valueOf(options.outWidth) + ", " + String.valueOf(options.outHeight));
        if (decodeFile != null) {
            Log.m105925i("MicroMsg.GameImagePreviewUI", "recycle bitmap:%s", decodeFile.toString());
            decodeFile.recycle();
        }
        Bitmap bitmapNative = BitmapUtil.getBitmapNative(str);
        if (bitmapNative == null && MMNativeJpeg.IsJpegFile(str) && MMNativeJpeg.isProgressive(str)) {
            bitmapNative = MMNativeJpeg.decodeAsBitmap(str);
            Object[] objArr = new Object[1];
            if (bitmapNative != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.GameImagePreviewUI", "Progressive jpeg, result isNull:%b", objArr);
        }
        if (bitmapNative == null) {
            Log.m105920e("MicroMsg.GameImagePreviewUI", "getSuitableBmp fail, temBmp is null, filePath = " + str);
            return null;
        }
        C20828a b2 = C20828a.m22825b();
        b2.mo32526o(str + "_" + C86013q1.m106451l(str), bitmapNative);
        return bitmapNative;
    }

    /* renamed from: I7 */
    public final void mo129095I7(String str, boolean z) {
        boolean z2;
        if (!Util.isNullOrNil(str)) {
            try {
                this.f271650e.f286281c.setVisibility(8);
                this.f271650e.f286279a.setVisibility(8);
                this.f271650e.f286282d.setVisibility(8);
                this.f271650e.f286280b.setVisibility(8);
                Bitmap bitmap = null;
                if (!C89436a.m111811c(str)) {
                    bitmap = mo129094H7(str);
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!(bitmap != null && !bitmap.isRecycled() && (bitmap.getWidth() > 1024 || bitmap.getHeight() > 1024)) && ImgUtil.isGif(str)) {
                    try {
                        this.f271650e.f286279a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                        this.f271650e.f286279a.setVisibility(0);
                        this.f271650e.f286279a.setImageFilePath(str);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.GameImagePreviewUI", e, "", new Object[0]);
                        this.f271650e.f286279a.setVisibility(0);
                        this.f271650e.f286279a.setImageBitmap(bitmap);
                    }
                } else if (bitmap != null && !bitmap.isRecycled()) {
                    this.f271650e.f286279a.setVisibility(8);
                    MultiTouchImageView multiTouchImageView = this.f271650e.f286280b;
                    multiTouchImageView.setEnabled(true);
                    ForceGpuUtil.decideLayerType(multiTouchImageView, bitmap.getWidth(), bitmap.getHeight());
                    multiTouchImageView.setEnableHorLongBmpMode(false);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    multiTouchImageView.f348280o = width;
                    multiTouchImageView.f348281p = height;
                    multiTouchImageView.setImageBitmap(bitmap);
                    multiTouchImageView.setVisibility(0);
                } else if (!z2) {
                    Log.m105920e("MicroMsg.GameImagePreviewUI", "load image failed");
                } else if (this.f271650e.f286282d.getVisibility() == 8) {
                    mo129096J7(this.f271650e.f286282d, str);
                }
                if (!z) {
                    this.f271657o = str;
                }
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.GameImagePreviewUI", "Catch Exception");
            }
        }
    }

    /* renamed from: J7 */
    public final void mo129096J7(WxImageView wxImageView, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap d = MMBitmapFactory.m98735d(str, options);
        if (d != null) {
            d.recycle();
        }
        wxImageView.setVisibility(0);
        wxImageView.setOnLongClickListener(new C94081c(this));
        wxImageView.setOrientation(BackwardSupportUtil.ExifHelper.getExifOrientation(str));
        int i = options.outWidth;
        int i2 = options.outHeight;
        wxImageView.f48889h = i;
        wxImageView.f48890i = i2;
        wxImageView.mo26059d();
        wxImageView.mo21400p(str, (ImageSource) null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f271649d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(67108864);
        fullScreenNoTitleBar(true);
        this.f271649d = new GestureDetector(new C94079a());
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.cp_, (ViewGroup) null, false);
        int i = C0966R.C0970id.f39;
        MMAnimateView mMAnimateView = (MMAnimateView) C10462b.m10395a(inflate, C0966R.C0970id.f39);
        if (mMAnimateView != null) {
            i = C0966R.C0970id.f358789h34;
            MultiTouchImageView multiTouchImageView = (MultiTouchImageView) C10462b.m10395a(inflate, C0966R.C0970id.f358789h34);
            if (multiTouchImageView != null) {
                i = C0966R.C0970id.i89;
                ProgressBar progressBar = (ProgressBar) C10462b.m10395a(inflate, C0966R.C0970id.i89);
                if (progressBar != null) {
                    i = C0966R.C0970id.f359612lu3;
                    WxImageView wxImageView = (WxImageView) C10462b.m10395a(inflate, C0966R.C0970id.f359612lu3);
                    if (wxImageView != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) inflate;
                        this.f271650e = new C97559e(relativeLayout, mMAnimateView, multiTouchImageView, progressBar, wxImageView);
                        setContentView((View) relativeLayout);
                        this.f271651f = getIntent().getStringExtra("img_aeskey");
                        this.f271652g = getIntent().getStringExtra("img_url");
                        this.f271653h = getIntent().getStringExtra("img_md5");
                        this.f271658p = getIntent().getStringExtra("img_thumb");
                        String n = C53601h.m60135n(this.f271652g, false);
                        if (Util.isNullOrNil(n) || !C86013q1.m106450k(n)) {
                            if (!Util.isNullOrNil(this.f271658p) && C86013q1.m106450k(this.f271658p)) {
                                mo129095I7(this.f271658p, true);
                            }
                            this.f271654i = C46787a.m52077a(false, this.f271652g, this.f271651f, this.f271653h, new C94080b());
                        } else {
                            this.f271655j = false;
                            mo129095I7(n, false);
                        }
                        this.f271650e.f286282d.setOnImageLoadEventListener(new C94082b(this));
                        if (this.f271655j) {
                            this.f271650e.f286281c.setVisibility(0);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f271654i != null) {
            ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(this.f271654i);
        }
    }
}
