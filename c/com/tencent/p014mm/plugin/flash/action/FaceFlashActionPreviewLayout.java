package com.tencent.p014mm.plugin.flash.action;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au1.C0222b;
import au1.C113079a;
import bu1.C0381a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.plugin.facedetect.model.C105224h;
import com.tencent.p014mm.plugin.flash.C105347i;
import com.tencent.p014mm.plugin.flash.C105349l;
import com.tencent.p014mm.plugin.flash.C4397m;
import com.tencent.p014mm.plugin.flash.view.FaceNumberLayout;
import com.tencent.p014mm.plugin.flash.view.FaceReflectMask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtCameraSetting;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.util.HashMap;
import java.util.Objects;
import jb1.C108680a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lb1.C10481b;
import lu3.C34379c;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C50061k02;
import xt1.C15900c;
import zt1.C119133a;
import zt1.C119138d;
import zt1.C16401b;
import zt1.C16404e;
import zt1.C16405f;
import zt1.C16407i;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout */
public class FaceFlashActionPreviewLayout extends RelativeLayout implements YtSDKKitFramework.IYTReflectListener, TextureView.SurfaceTextureListener, YtSDKKitFramework.IYtSDKKitFrameworkEventListener, YtSDKKitFramework.IYTBaseFunctionListener, C11385n {

    /* renamed from: N */
    public static final int f18912N = C15900c.m14813a();

    /* renamed from: A */
    public boolean f18913A;

    /* renamed from: B */
    public boolean f18914B;

    /* renamed from: C */
    public int f18915C;

    /* renamed from: D */
    public int f18916D;

    /* renamed from: E */
    public boolean f18917E;

    /* renamed from: F */
    public C34379c f18918F;

    /* renamed from: G */
    public C34379c f18919G;

    /* renamed from: H */
    public int f18920H;

    /* renamed from: I */
    public float f18921I;

    /* renamed from: J */
    public long f18922J;

    /* renamed from: K */
    public boolean f18923K;

    /* renamed from: L */
    public int f18924L;

    /* renamed from: M */
    public CountDownTimer f18925M;

    /* renamed from: d */
    public SurfaceTexture f18926d;

    /* renamed from: e */
    public FaceReflectMask f18927e;

    /* renamed from: f */
    public TextView f18928f;

    /* renamed from: g */
    public TextView f18929g;

    /* renamed from: h */
    public TextView f18930h;

    /* renamed from: i */
    public MMTextureView f18931i;

    /* renamed from: j */
    public ImageView f18932j;

    /* renamed from: n */
    public ProgressBar f18933n;

    /* renamed from: o */
    public FaceNumberLayout f18934o;

    /* renamed from: p */
    public View f18935p;

    /* renamed from: q */
    public C105349l f18936q;

    /* renamed from: r */
    public FaceFlashActionUI f18937r;

    /* renamed from: s */
    public C105347i f18938s;

    /* renamed from: t */
    public Context f18939t;

    /* renamed from: u */
    public C16407i f18940u;

    /* renamed from: v */
    public C16405f f18941v;

    /* renamed from: w */
    public YtSDKKitFramework.YtSDKKitFrameworkWorkMode f18942w;

    /* renamed from: x */
    public Animation f18943x;

    /* renamed from: y */
    public Animation f18944y;

    /* renamed from: z */
    public boolean f18945z;

    /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$a */
    public class C4353a implements Camera.PreviewCallback {

        /* renamed from: d */
        public final /* synthetic */ Point f18946d;

        public C4353a(Point point) {
            this.f18946d = point;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
            if (faceFlashActionPreviewLayout.f18921I > 0.0f && faceFlashActionPreviewLayout.f18922J > 0) {
                FaceReflectMask faceReflectMask = faceFlashActionPreviewLayout.f18927e;
                long currentTimeMillis = System.currentTimeMillis();
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout2 = FaceFlashActionPreviewLayout.this;
                faceReflectMask.setProgress(((float) (currentTimeMillis - faceFlashActionPreviewLayout2.f18922J)) / faceFlashActionPreviewLayout2.f18921I);
            }
            if (FaceFlashActionPreviewLayout.this.f18917E) {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                bArr = bArr2;
            }
            Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "logicReset onPreviewFrame set data to yt");
            YtSDKKitFramework instance = YtSDKKitFramework.getInstance();
            Point point = this.f18946d;
            instance.updateWithFrameData(bArr, point.x, point.y, 1);
            C105224h.m141309b().mo149589c(bArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$b */
    public class C4354b implements C105349l.C4396e {
        public C4354b() {
        }

        /* renamed from: a */
        public void mo5233a(Boolean bool, C105349l lVar) {
            if (!bool.booleanValue()) {
                Log.m105920e("MicroMsg.FaceFlashActionPreviewLayout", "logicReset startPreview open camera failed");
                C0222b.m173l("openCamera", -1);
                C0222b.m163b().f9686B = 1;
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
                faceFlashActionPreviewLayout.f18937r.mo5278O7(faceFlashActionPreviewLayout.mo5248b(90038, C76577a.m92166q(faceFlashActionPreviewLayout.getContext(), C0966R.string.fq_)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$c */
    public class C4355c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ColorMatrixColorFilter f18949d;

        public C4355c(ColorMatrixColorFilter colorMatrixColorFilter) {
            this.f18949d = colorMatrixColorFilter;
        }

        public void run() {
            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
            if (faceFlashActionPreviewLayout.f18913A) {
                faceFlashActionPreviewLayout.f18937r.mo5277N7(C76577a.m92153d(faceFlashActionPreviewLayout.getContext(), C0966R.color.f2975b6));
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout2 = FaceFlashActionPreviewLayout.this;
                faceFlashActionPreviewLayout2.f18930h.setTextColor(C76577a.m92153d(faceFlashActionPreviewLayout2.getContext(), C0966R.color.BW_100_Alpha_0_8));
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout3 = FaceFlashActionPreviewLayout.this;
                faceFlashActionPreviewLayout3.f18928f.setTextColor(C76577a.m92153d(faceFlashActionPreviewLayout3.getContext(), C0966R.color.BW_100_Alpha_0_8));
                FaceFlashActionPreviewLayout.this.f18927e.setColorMatrixColorFilter(this.f18949d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$d */
    public class C4356d implements Runnable {
        public C4356d() {
        }

        public void run() {
            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
            faceFlashActionPreviewLayout.f18930h.setText(C76577a.m92166q(faceFlashActionPreviewLayout.getContext(), C0966R.string.ck_));
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$e */
    public class C4357e extends CountDownTimer {
        public C4357e(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
            faceFlashActionPreviewLayout.f18923K = true;
            if (!faceFlashActionPreviewLayout.f18913A && faceFlashActionPreviewLayout.getVisibility() == 0) {
                FaceFlashActionPreviewLayout.this.f18936q.mo149959h();
                YtSDKKitFramework.getInstance().fireEvent(YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, (Object) null);
                C0222b.m164c().f9724q = 6;
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout2 = FaceFlashActionPreviewLayout.this;
                faceFlashActionPreviewLayout2.f18937r.mo5278O7(((C119133a) faceFlashActionPreviewLayout2.f18940u).mo183837f(C76577a.m92166q(faceFlashActionPreviewLayout2.getContext(), C0966R.string.ckw), 90017).toString());
            }
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$f */
    public class C4358f implements C105349l.C4396e {

        /* renamed from: a */
        public final /* synthetic */ SurfaceTexture f18953a;

        /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$f$a */
        public class C4359a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f18955d;

            /* renamed from: e */
            public final /* synthetic */ int f18956e;

            public C4359a(int i, int i2) {
                this.f18955d = i;
                this.f18956e = i2;
            }

            public void run() {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) FaceFlashActionPreviewLayout.this.f18931i.getLayoutParams();
                int i = this.f18955d;
                layoutParams.width = i;
                int i2 = this.f18956e;
                layoutParams.height = i2;
                int i3 = (i2 - i) / 2;
                if (FaceFlashActionPreviewLayout.this.f18928f.getVisibility() == 0) {
                    layoutParams.topMargin = ((int) FaceFlashActionPreviewLayout.this.f18927e.getCircleMarginY()) - i3;
                } else {
                    layoutParams.topMargin = C76577a.m92157h(FaceFlashActionPreviewLayout.this.getContext(), C0966R.dimen.a58) - i3;
                }
                FaceFlashActionPreviewLayout.this.f18931i.setLayoutParams(layoutParams);
                FaceFlashActionPreviewLayout.this.f18932j.setVisibility(8);
            }
        }

        /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$f$b */
        public class C4360b implements C105349l.C4396e {
            public C4360b() {
            }

            /* renamed from: a */
            public void mo5233a(Boolean bool, C105349l lVar) {
                if (!bool.booleanValue()) {
                    Log.m105920e("MicroMsg.FaceFlashActionPreviewLayout", "startPreview open camera failed");
                    C0222b.m173l("openCamera", -1);
                    C0222b.m163b().f9686B = 1;
                    FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
                    faceFlashActionPreviewLayout.f18937r.mo5278O7(faceFlashActionPreviewLayout.mo5248b(90038, C76577a.m92166q(faceFlashActionPreviewLayout.getContext(), C0966R.string.fq_)));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$f$c */
        public class C4361c implements Camera.PreviewCallback {

            /* renamed from: d */
            public final /* synthetic */ Point f18959d;

            public C4361c(Point point) {
                this.f18959d = point;
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
                if (faceFlashActionPreviewLayout.f18921I > 0.0f && faceFlashActionPreviewLayout.f18922J > 0) {
                    FaceReflectMask faceReflectMask = faceFlashActionPreviewLayout.f18927e;
                    long currentTimeMillis = System.currentTimeMillis();
                    FaceFlashActionPreviewLayout faceFlashActionPreviewLayout2 = FaceFlashActionPreviewLayout.this;
                    faceReflectMask.setProgress(((float) (currentTimeMillis - faceFlashActionPreviewLayout2.f18922J)) / faceFlashActionPreviewLayout2.f18921I);
                }
                if (FaceFlashActionPreviewLayout.this.f18917E) {
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    bArr = bArr2;
                }
                Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "onPreviewFrame set data to yt");
                YtSDKKitFramework instance = YtSDKKitFramework.getInstance();
                Point point = this.f18959d;
                instance.updateWithFrameData(bArr, point.x, point.y, 1);
                C105224h.m141309b().mo149589c(bArr);
            }
        }

        public C4358f(SurfaceTexture surfaceTexture) {
            this.f18953a = surfaceTexture;
        }

        /* renamed from: a */
        public void mo5233a(Boolean bool, C105349l lVar) {
            if (!bool.booleanValue()) {
                Log.m105920e("MicroMsg.FaceFlashActionPreviewLayout", "open camera failed");
                C0222b.m173l("openCamera", -1);
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
                faceFlashActionPreviewLayout.f18937r.mo5278O7(faceFlashActionPreviewLayout.mo5248b(90035, C76577a.m92166q(faceFlashActionPreviewLayout.getContext(), C0966R.string.fq_)));
                return;
            }
            C0222b.m172k("openCamera");
            if (!FaceFlashActionPreviewLayout.this.f18938s.mo149952b(lVar.f313127d.f322936a, lVar.f313138o)) {
                C0222b.m173l("sdkCamera", -1);
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout2 = FaceFlashActionPreviewLayout.this;
                faceFlashActionPreviewLayout2.f18937r.mo5278O7(faceFlashActionPreviewLayout2.mo5248b(90013, C76577a.m92166q(faceFlashActionPreviewLayout2.getContext(), C0966R.string.fq_)));
                return;
            }
            C0222b.m172k("sdkCamera");
            int i = (int) (((float) C75044y4.m89990b(FaceFlashActionPreviewLayout.this.getContext()).x) * 0.27f * 2.0f);
            int b = (int) (((float) i) * lVar.mo149954b());
            YtSDKKitFramework.YtSDKPlatformContext platformContext = YtSDKKitFramework.getInstance().getPlatformContext();
            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout3 = FaceFlashActionPreviewLayout.this;
            platformContext.baseFunctionListener = faceFlashActionPreviewLayout3;
            platformContext.reflectListener = faceFlashActionPreviewLayout3;
            if (!faceFlashActionPreviewLayout3.f18938s.mo149951a(faceFlashActionPreviewLayout3.f18942w, faceFlashActionPreviewLayout3)) {
                C0222b.m173l("sdkFaceType", -1);
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout4 = FaceFlashActionPreviewLayout.this;
                faceFlashActionPreviewLayout4.f18937r.mo5278O7(faceFlashActionPreviewLayout4.mo5248b(90013, C76577a.m92166q(faceFlashActionPreviewLayout4.getContext(), C0966R.string.ckf)));
                return;
            }
            C0222b.m172k("sdkFaceType");
            ((C119157j) C119157j.f356862d).mo183895z(new C4359a(i, b));
            lVar.mo149958g(this.f18953a, new C4360b());
            Point c = lVar.mo149955c();
            Log.m105925i("MicroMsg.FaceFlashManager", "set sdk preview size:%sx%s", Integer.valueOf(c.x), Integer.valueOf(c.y));
            int rotate = YtCameraSetting.getRotate(FaceFlashActionPreviewLayout.this.getContext(), lVar.f313138o, 1);
            int i2 = c.x;
            int i3 = c.y;
            if (rotate >= 5) {
                int i4 = i3;
                i3 = i2;
                i2 = i4;
            }
            Log.m105925i("MicroMsg.FaceFlashManager", "setPreviewRect width:%d,height:%d，enableCopyData：%s", Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(FaceFlashActionPreviewLayout.this.f18917E));
            YtSDKKitFramework.getInstance().setPreviewRect(new Rect(0, 0, i2, i3));
            YtSDKKitFramework.getInstance().setDetectRect(new Rect(0, 0, i2, i3));
            FaceFlashActionPreviewLayout.this.f18941v.mo14855b(lVar.f313127d.mo158259c());
            lVar.mo149957f(new C4361c(c));
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$g */
    public class C4362g implements FaceReflectMask.C4403a {
        public C4362g() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$h */
    public class C4363h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ HashMap f18962d;

        /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$h$a */
        public class C4364a implements Runnable {
            public C4364a() {
            }

            public void run() {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) FaceFlashActionPreviewLayout.this.f18933n.getLayoutParams();
                layoutParams.topMargin = (int) (FaceFlashActionPreviewLayout.this.f18927e.getCircleY() - ((float) (FaceFlashActionPreviewLayout.this.f18933n.getWidth() / 2)));
                FaceFlashActionPreviewLayout.this.f18933n.setLayoutParams(layoutParams);
                FaceFlashActionPreviewLayout.this.f18933n.setVisibility(0);
                View view = FaceFlashActionPreviewLayout.this.f18935p;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout$h$b */
        public class C4365b implements Runnable {
            public C4365b() {
            }

            public void run() {
                Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "startTranslateAnimation");
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
                faceFlashActionPreviewLayout.f18943x.cancel();
                faceFlashActionPreviewLayout.f18943x.setDuration(500);
                faceFlashActionPreviewLayout.f18943x.setAnimationListener(new C4371e(faceFlashActionPreviewLayout));
                faceFlashActionPreviewLayout.f18929g.startAnimation(faceFlashActionPreviewLayout.f18943x);
                faceFlashActionPreviewLayout.f18944y.cancel();
                faceFlashActionPreviewLayout.f18944y.setDuration(500);
                faceFlashActionPreviewLayout.f18944y.setAnimationListener(new C4372f(faceFlashActionPreviewLayout));
                faceFlashActionPreviewLayout.f18930h.startAnimation(faceFlashActionPreviewLayout.f18944y);
            }
        }

        public C4363h(HashMap hashMap) {
            this.f18962d = hashMap;
        }

        public void run() {
            boolean z;
            if (this.f18962d.containsKey(StateEvent.Name.UI_TIPS)) {
                Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent preview tips：%s，isVerifying：%s, prepareVerifying：%s", this.f18962d.get(StateEvent.Name.UI_TIPS), Boolean.valueOf(FaceFlashActionPreviewLayout.this.f18913A), Boolean.valueOf(FaceFlashActionPreviewLayout.this.f18945z));
                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
                if ((faceFlashActionPreviewLayout.f18942w == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE && ((C115446l) faceFlashActionPreviewLayout.f18940u).f346096L) || (!faceFlashActionPreviewLayout.f18913A && !faceFlashActionPreviewLayout.f18945z)) {
                    Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent preview tips：real set text");
                    if (FaceFlashActionPreviewLayout.this.f18930h.getVisibility() == 0) {
                        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout2 = FaceFlashActionPreviewLayout.this;
                        faceFlashActionPreviewLayout2.f18940u.mo14863b(faceFlashActionPreviewLayout2.f18930h, (String) this.f18962d.get(StateEvent.Name.UI_TIPS));
                    } else {
                        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout3 = FaceFlashActionPreviewLayout.this;
                        faceFlashActionPreviewLayout3.f18940u.mo14863b(faceFlashActionPreviewLayout3.f18929g, (String) this.f18962d.get(StateEvent.Name.UI_TIPS));
                    }
                }
            }
            if (this.f18962d.containsKey(StateEvent.Name.UI_ACTION)) {
                Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent acting:" + this.f18962d.get(StateEvent.Name.UI_ACTION));
                if (Objects.equals(this.f18962d.get(StateEvent.Name.UI_ACTION), StateEvent.ActionValue.NET_REQ)) {
                    Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent acting ：network_request ");
                    FaceFlashActionPreviewLayout faceFlashActionPreviewLayout4 = FaceFlashActionPreviewLayout.this;
                    faceFlashActionPreviewLayout4.f18922J = 0;
                    faceFlashActionPreviewLayout4.f18927e.setProgress(0.0f);
                    FaceFlashActionPreviewLayout.this.mo5252f();
                    FaceFlashActionPreviewLayout.this.f18936q.mo149959h();
                    FaceFlashActionPreviewLayout.this.f18934o.setVisibility(4);
                    FaceFlashActionPreviewLayout faceFlashActionPreviewLayout5 = FaceFlashActionPreviewLayout.this;
                    faceFlashActionPreviewLayout5.mo5251e(faceFlashActionPreviewLayout5.f18930h, C76577a.m92166q(faceFlashActionPreviewLayout5.getContext(), C0966R.string.net_reporting));
                    FaceFlashActionPreviewLayout.this.f18933n.setVisibility(4);
                    FaceFlashActionPreviewLayout.this.f18933n.postDelayed(new C4364a(), 200);
                } else if (Objects.equals(this.f18962d.get(StateEvent.Name.UI_ACTION), StateEvent.ActionValue.STAGE_NOTPASS)) {
                    FaceFlashActionPreviewLayout faceFlashActionPreviewLayout6 = FaceFlashActionPreviewLayout.this;
                    int i = faceFlashActionPreviewLayout6.f18916D + 1;
                    faceFlashActionPreviewLayout6.f18916D = i;
                    Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent acting ：not_pass，faceOutRectFrames：%s", Integer.valueOf(i));
                    FaceFlashActionPreviewLayout faceFlashActionPreviewLayout7 = FaceFlashActionPreviewLayout.this;
                    if (faceFlashActionPreviewLayout7.f18916D > 10) {
                        if (faceFlashActionPreviewLayout7.f18945z && faceFlashActionPreviewLayout7.f18914B) {
                            Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "prepareVerifying and out rect time:%s", Integer.valueOf(faceFlashActionPreviewLayout7.f18915C));
                            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout8 = FaceFlashActionPreviewLayout.this;
                            int i2 = faceFlashActionPreviewLayout8.f18915C + 1;
                            faceFlashActionPreviewLayout8.f18915C = i2;
                            if (i2 >= 4) {
                                YtSDKKitFramework.getInstance().fireEvent(YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, (Object) null);
                                FaceFlashActionPreviewLayout.this.mo5252f();
                                FaceFlashActionPreviewLayout.this.f18936q.mo149959h();
                                C0222b.m164c().f9724q = 6;
                                FaceFlashActionPreviewLayout faceFlashActionPreviewLayout9 = FaceFlashActionPreviewLayout.this;
                                faceFlashActionPreviewLayout9.f18937r.mo5278O7(((C119133a) faceFlashActionPreviewLayout9.f18940u).mo183837f(C76577a.m92166q(faceFlashActionPreviewLayout9.getContext(), C0966R.string.cjm), 90031).toString());
                            }
                        }
                        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout10 = FaceFlashActionPreviewLayout.this;
                        if (!faceFlashActionPreviewLayout10.f18913A && faceFlashActionPreviewLayout10.f18914B) {
                            FaceFlashActionPreviewLayout.this.mo5250d(C0381a.m326c(faceFlashActionPreviewLayout10.f18939t, (String) this.f18962d.get(StateEvent.Name.UI_TIPS)));
                            FaceFlashActionPreviewLayout.this.f18945z = false;
                        }
                        FaceFlashActionPreviewLayout.this.f18914B = false;
                    }
                } else if (Objects.equals(this.f18962d.get(StateEvent.Name.UI_ACTION), StateEvent.ActionValue.STAGE_PASS)) {
                    C0222b.m174m("faceRecognized");
                    Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent acting ：pass");
                    FaceFlashActionPreviewLayout faceFlashActionPreviewLayout11 = FaceFlashActionPreviewLayout.this;
                    faceFlashActionPreviewLayout11.f18916D = 0;
                    faceFlashActionPreviewLayout11.f18914B = true;
                    if (!faceFlashActionPreviewLayout11.f18945z) {
                        faceFlashActionPreviewLayout11.f18945z = true;
                        if (faceFlashActionPreviewLayout11.f18942w == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE && faceFlashActionPreviewLayout11.f18934o.getChildCount() == 0) {
                            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout12 = FaceFlashActionPreviewLayout.this;
                            faceFlashActionPreviewLayout12.f18934o.setNumbers(((C119138d) faceFlashActionPreviewLayout12.f18940u).f356820C);
                            FaceFlashActionPreviewLayout.this.f18934o.measure(0, 0);
                            int circleY = ((int) FaceFlashActionPreviewLayout.this.f18927e.getCircleY()) - (FaceFlashActionPreviewLayout.this.f18934o.getMeasuredHeight() / 2);
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) FaceFlashActionPreviewLayout.this.f18934o.getLayoutParams();
                            layoutParams.width = ((int) ((((float) FaceFlashActionPreviewLayout.this.getWidth()) * 0.27f) * 2.0f)) - C76577a.m92157h(FaceFlashActionPreviewLayout.this.f18939t, C0966R.dimen.f3749d0);
                            layoutParams.topMargin = circleY;
                            FaceFlashActionPreviewLayout.this.f18934o.setLayoutParams(layoutParams);
                        }
                        C34379c cVar = FaceFlashActionPreviewLayout.this.f18919G;
                        if (cVar != null) {
                            cVar.cancel(true);
                            FaceFlashActionPreviewLayout.this.f18919G = null;
                        }
                        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout13 = FaceFlashActionPreviewLayout.this;
                        faceFlashActionPreviewLayout13.mo5251e(faceFlashActionPreviewLayout13.f18929g, C76577a.m92166q(faceFlashActionPreviewLayout13.getContext(), C0966R.string.fl_pose_incorrect));
                        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout14 = FaceFlashActionPreviewLayout.this;
                        C119157j jVar = (C119157j) C119157j.f356862d;
                        jVar.getClass();
                        faceFlashActionPreviewLayout14.f18919G = jVar.mo183892w(new C4365b(), (long) FaceFlashActionPreviewLayout.f18912N, false);
                    }
                }
            }
            if (this.f18962d.containsKey(StateEvent.Name.PROCESS_RESULT) && FaceFlashActionPreviewLayout.this.getVisibility() == 0) {
                Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent result:" + this.f18962d.get(StateEvent.Name.PROCESS_RESULT));
                FaceFlashActionPreviewLayout.this.f18925M.cancel();
                FaceFlashActionPreviewLayout.this.mo5252f();
                FaceFlashActionPreviewLayout.this.f18936q.mo149959h();
                FaceFlashActionPreviewLayout.this.f18913A = false;
                if (Objects.equals(this.f18962d.get(StateEvent.Name.PROCESS_RESULT), StateEvent.ProcessResult.SUCCEED)) {
                    C0222b.m172k("sdkResult");
                    Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent result:SUCCEED ,param:%s", this.f18962d);
                    FaceFlashActionPreviewLayout.this.f18941v.mo14857d();
                    FaceFlashActionUI faceFlashActionUI = FaceFlashActionPreviewLayout.this.f18937r;
                    String str = (String) this.f18962d.get(StateEvent.Name.MESSAGE);
                    Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity showSuccessLayout", Integer.valueOf(faceFlashActionUI.hashCode()));
                    faceFlashActionUI.f18983g = 90025;
                    faceFlashActionUI.f18985i = str;
                    C0222b.m173l("msgVerify", "ok");
                    C0222b.m170i(str, 0);
                    faceFlashActionUI.mo5277N7(C76577a.m92153d(faceFlashActionUI.getContext(), C0966R.color.BW_0));
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.optBoolean("selfHandle", false)) {
                            try {
                                faceFlashActionUI.mo5273J7(new JSONObject(str));
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.FaceFlashActionUI", e, "", new Object[0]);
                            }
                        } else if (C0381a.m328e()) {
                            faceFlashActionUI.mo5279P7("ok");
                        } else {
                            faceFlashActionUI.f18980d.setVisibility(8);
                            faceFlashActionUI.f18981e.setVisibility(0);
                            faceFlashActionUI.f18981e.setCircleY(faceFlashActionUI.f18980d.getCircleY());
                            faceFlashActionUI.f18981e.f18976p = faceFlashActionUI.f18980d.f18928f.getVisibility() == 0;
                            faceFlashActionUI.f18981e.mo5269a(faceFlashActionUI.getContentView().getHeight());
                            C119179t tVar = C119157j.f356862d;
                            C4382o oVar = new C4382o(faceFlashActionUI, jSONObject);
                            C119157j jVar2 = (C119157j) tVar;
                            jVar2.getClass();
                            jVar2.mo183892w(oVar, 1500, false);
                        }
                    } catch (JSONException e2) {
                        Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e2, "parse face success result error.%s", str);
                    }
                } else if (Objects.equals(this.f18962d.get(StateEvent.Name.PROCESS_RESULT), StateEvent.ProcessResult.FAILED)) {
                    HashMap hashMap = this.f18962d;
                    int i3 = -1;
                    if (hashMap.containsKey(StateEvent.Name.ERROR_CODE)) {
                        i3 = ((Integer) hashMap.get(StateEvent.Name.ERROR_CODE)).intValue();
                    }
                    C0222b.m173l("sdkResult", Integer.valueOf(i3));
                    Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent result:FAILED ,param:%s", this.f18962d);
                    if (C0381a.m329f(this.f18962d, StateEvent.Name.ERROR_CODE, ErrorCode.YT_SDK_VERIFY_TIMEOUT)) {
                        this.f18962d.put(StateEvent.Name.MESSAGE, C76577a.m92166q(FaceFlashActionPreviewLayout.this.f18939t, C0966R.string.ckw));
                    } else if (C0381a.m329f(this.f18962d, StateEvent.Name.ERROR_CODE, ErrorCode.YT_SDK_NETWORK_ERROR)) {
                        this.f18962d.put(StateEvent.Name.MESSAGE, C76577a.m92166q(FaceFlashActionPreviewLayout.this.f18939t, C0966R.string.net_fetch_failed));
                    } else if (C0381a.m329f(this.f18962d, StateEvent.Name.ERROR_CODE, 4194304) && this.f18962d.containsKey(StateEvent.Name.MESSAGE)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(this.f18962d.get(StateEvent.Name.MESSAGE).toString());
                            if (!jSONObject2.optString("errormsg").equals(StringCode.FL_NO_FACE)) {
                                if (!jSONObject2.optString("errormsg").equals(StringCode.FL_INCOMPLETE_FACE)) {
                                    z = false;
                                    if (z && !FaceFlashActionPreviewLayout.this.f18923K) {
                                        Log.m105920e("MicroMsg.FaceFlashActionPreviewLayout", "face not in range, reset");
                                        C0222b.m164c().f9720m++;
                                        FaceFlashActionPreviewLayout.this.mo5247a();
                                        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout15 = FaceFlashActionPreviewLayout.this;
                                        faceFlashActionPreviewLayout15.mo5251e(faceFlashActionPreviewLayout15.f18929g, C76577a.m92166q(faceFlashActionPreviewLayout15.getContext(), C0966R.string.fl_pose_not_in_rect));
                                        return;
                                    }
                                }
                            }
                            z = true;
                            Log.m105920e("MicroMsg.FaceFlashActionPreviewLayout", "face not in range, reset");
                            C0222b.m164c().f9720m++;
                            FaceFlashActionPreviewLayout.this.mo5247a();
                            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout152 = FaceFlashActionPreviewLayout.this;
                            faceFlashActionPreviewLayout152.mo5251e(faceFlashActionPreviewLayout152.f18929g, C76577a.m92166q(faceFlashActionPreviewLayout152.getContext(), C0966R.string.fl_pose_not_in_rect));
                            return;
                        } catch (Exception unused) {
                            Log.m105921e("MicroMsg.FaceFlashActionPreviewLayout", "get message error,message:%s", this.f18962d.get(StateEvent.Name.MESSAGE));
                        }
                    }
                    C0381a.m330g(FaceFlashActionPreviewLayout.this.getContext(), this.f18962d);
                    FaceFlashActionPreviewLayout.this.f18937r.mo5278O7((String) this.f18962d.get(StateEvent.Name.MESSAGE));
                } else {
                    Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "onFrameworkEvent result:UNKNOWN ,param:%s", this.f18962d);
                    FaceFlashActionPreviewLayout.this.f18937r.mo5278O7((String) this.f18962d.get(StateEvent.Name.MESSAGE));
                }
            }
        }
    }

    public FaceFlashActionPreviewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo5247a() {
        C105349l lVar;
        if (!(this.f18926d == null || (lVar = this.f18936q) == null)) {
            Point c = lVar.mo149955c();
            C105349l lVar2 = this.f18936q;
            SurfaceTexture surfaceTexture = this.f18926d;
            C4353a aVar = new C4353a(c);
            if (lVar2.mo149958g(surfaceTexture, new C4354b())) {
                lVar2.f313127d.mo158264h(new C4397m(lVar2, aVar));
            }
        }
        Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "resetWithoutPreview");
        C113079a.m154756b(this.f18942w);
        FaceReflectMask faceReflectMask = this.f18927e;
        faceReflectMask.getClass();
        faceReflectMask.setColorMatrixColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        this.f18937r.mo5277N7(C76577a.m92153d(getContext(), C0966R.color.BW_0));
        this.f18930h.setTextColor(C76577a.m92153d(getContext(), C0966R.color.BW_0));
        this.f18929g.setTextColor(C76577a.m92153d(getContext(), C0966R.color.BW_0));
        this.f18928f.setTextColor(C76577a.m92153d(getContext(), C0966R.color.UN_BW_0_Alpha_0_9));
        this.f18945z = false;
        this.f18913A = false;
        this.f18922J = 0;
        this.f18916D = 0;
        this.f18927e.setProgress(0.0f);
        this.f18933n.setVisibility(8);
        this.f18934o.mo149962a();
        this.f18934o.removeAllViews();
        View view = this.f18935p;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f18941v.mo14856c();
        this.f18940u.reset();
        this.f18938s.getClass();
        YtSDKKitFramework.getInstance().reset();
        this.f18937r.mo5277N7(C76577a.m92153d(getContext(), C0966R.color.BW_0));
        mo5250d(C76577a.m92166q(getContext(), C0966R.string.fl_pose_incorrect));
    }

    /* renamed from: b */
    public final String mo5248b(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i);
            jSONObject.put("err_code", i);
            jSONObject.put("err_msg", str);
            Intent intent = ((Activity) getContext()).getIntent();
            if (intent != null) {
                jSONObject.put("otherVerifyTitle", intent.getStringExtra("otherVerifyTitle"));
            }
            jSONObject.put("err_retry", 0);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.FaceFlashActionPreviewLayout", "packageErrorResult error:%s", e.getMessage());
        }
        return jSONObject.toString();
    }

    public String base64Encode(byte[] bArr, int i) {
        return null;
    }

    /* renamed from: c */
    public final void mo5249c() {
        if (this.f18927e.getCircleY() <= 0.0f) {
            this.f18927e.setCallback(new C4362g());
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f18932j.getLayoutParams();
        marginLayoutParams.topMargin = (int) (this.f18927e.getCircleY() - ((float) (this.f18932j.getHeight() / 2)));
        this.f18932j.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: d */
    public final void mo5250d(String str) {
        Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "resetTranslateAnimation prepareVerifying:%s", Boolean.valueOf(this.f18945z));
        C34379c cVar = this.f18918F;
        if (cVar != null) {
            cVar.cancel(true);
            this.f18918F = null;
        }
        C34379c cVar2 = this.f18919G;
        if (cVar2 != null) {
            cVar2.cancel(true);
            this.f18919G = null;
        }
        mo5251e(this.f18929g, str);
        this.f18929g.setTextColor(Color.parseColor("#000000"));
        this.f18930h.setTextColor(Color.parseColor("#000000"));
        this.f18944y.setAnimationListener((Animation.AnimationListener) null);
        this.f18943x.setAnimationListener((Animation.AnimationListener) null);
        this.f18929g.clearAnimation();
        this.f18930h.clearAnimation();
        this.f18929g.setVisibility(0);
        this.f18930h.setVisibility(4);
        this.f18934o.setVisibility(4);
    }

    /* renamed from: e */
    public final void mo5251e(TextView textView, String str) {
        textView.setText(str);
        C119133a aVar = (C119133a) this.f18940u;
        aVar.getClass();
        aVar.f356805q = System.currentTimeMillis();
    }

    /* renamed from: f */
    public final void mo5252f() {
        C16407i iVar;
        C16405f fVar = this.f18941v;
        if (fVar != null && (iVar = this.f18940u) != null) {
            long j = ((C119133a) iVar).f356797f;
            if (fVar.f43810a && C108680a.m147401e().mo159700h()) {
                C108680a.m147401e().mo159702j(new C16404e(fVar, j));
            }
        }
    }

    public float getCircleY() {
        return this.f18927e.getCircleY();
    }

    public String getFaceOtherVerifyTitle() {
        Intent intent = ((Activity) getContext()).getIntent();
        return intent != null ? intent.getStringExtra("otherVerifyTitle") : "";
    }

    public byte[] getVoiceData() {
        mo5252f();
        return C86013q1.m106433O(((C119138d) this.f18940u).f356819B.f350363c, -1, -1);
    }

    public void onFrameworkEvent(HashMap<String, Object> hashMap) {
        ((C119157j) C119157j.f356862d).mo183895z(new C4363h(hashMap));
    }

    public float onGetAppBrightness() {
        return 1.0f;
    }

    public void onNetworkRequestEvent(String str, String str2, HashMap<String, String> hashMap, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        this.f18940u.onNetworkRequestEvent(str, str2, hashMap, iYtSDKKitNetResponseParser);
    }

    public void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f) {
        Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "onReflectEvent change color :%s isVerifying:%s", colorMatrixColorFilter, Boolean.valueOf(this.f18913A));
        ((C119157j) C119157j.f356862d).mo183895z(new C4355c(colorMatrixColorFilter));
    }

    public void onReflectStart(long j) {
        Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "onReflectStart duration:%s", Long.valueOf(j));
        C0222b.m172k("reflect");
        this.f18921I = (float) j;
        this.f18922J = System.currentTimeMillis();
        ((C119157j) C119157j.f356862d).mo183895z(new C4356d());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", " onSceneEnd errType：%s errCode：%s errMsg：%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C10481b) {
            C50061k02 k022 = ((C10481b) yVar).f31721f;
            if (i == 0 && i2 == 0) {
                Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", " response.ret_code：%s response.ret_msg：%s", Integer.valueOf(k022.f136495d), k022.f136496e);
                if (k022.f136495d == 0) {
                    int i4 = k022.f136497f;
                    this.f18924L = i4;
                    Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", " onSceneEnd checkAliveType：%s", Integer.valueOf(i4));
                    Intent intent = ((Activity) getContext()).getIntent();
                    if (this.f18924L == 2) {
                        i3 = 5;
                        this.f18942w = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
                        this.f18920H = 3;
                    } else {
                        this.f18942w = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE;
                        this.f18920H = 2;
                        i3 = 3;
                    }
                    C0222b.m164c().f9712e = (long) this.f18920H;
                    C16407i a = C16401b.m15217a(i3);
                    this.f18940u = a;
                    a.mo14864c(intent, (Activity) getContext());
                    this.f18941v.mo14854a(intent, i3);
                    String stringExtra = intent.getStringExtra("faceVerifyTitle");
                    Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "initDatafaceDetectType:%s  after type:%s，faceverifyTitle:%s", this.f18942w, Integer.valueOf(i3), stringExtra);
                    if (!Util.isNullOrNil(stringExtra)) {
                        this.f18928f.setText(stringExtra);
                        C85875k4.m106189j0(this.f18928f.getPaint(), 0.8f);
                        this.f18928f.setVisibility(0);
                        this.f18927e.post(new C4369c(this));
                        this.f18929g.setTextSize(1, C76577a.m92165p(getContext()) * 17.0f);
                        this.f18930h.setTextSize(1, C76577a.m92165p(getContext()) * 17.0f);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f18929g.getLayoutParams();
                        layoutParams.addRule(3, C0966R.C0970id.f358299ea2);
                        layoutParams.topMargin = C76577a.m92151b(getContext(), 16);
                        this.f18929g.setLayoutParams(layoutParams);
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f18930h.getLayoutParams();
                        layoutParams2.addRule(3, C0966R.C0970id.f358299ea2);
                        layoutParams2.topMargin = C76577a.m92151b(getContext(), 16);
                        this.f18930h.setLayoutParams(layoutParams2);
                    } else {
                        this.f18928f.setVisibility(8);
                        this.f18927e.post(new C4370d(this));
                        C85875k4.m106189j0(this.f18929g.getPaint(), 0.8f);
                        C85875k4.m106189j0(this.f18930h.getPaint(), 0.8f);
                        this.f18929g.setTextSize(1, C76577a.m92165p(getContext()) * 22.0f);
                        this.f18930h.setTextSize(1, C76577a.m92165p(getContext()) * 22.0f);
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f18929g.getLayoutParams();
                        layoutParams3.removeRule(3);
                        layoutParams3.topMargin = C76577a.m92151b(getContext(), 100);
                        this.f18929g.setLayoutParams(layoutParams3);
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f18930h.getLayoutParams();
                        layoutParams4.removeRule(3);
                        layoutParams4.topMargin = C76577a.m92151b(getContext(), 100);
                        this.f18930h.setLayoutParams(layoutParams4);
                    }
                    mo5251e(this.f18929g, C76577a.m92166q(getContext(), C0966R.string.fl_pose_not_in_rect));
                    this.f18931i = (MMTextureView) findViewById(C0966R.C0970id.e_s);
                    if (!this.f18938s.mo149953c()) {
                        C0222b.m173l("initSdk", -1);
                        this.f18937r.mo5278O7(mo5248b(90013, C76577a.m92166q(getContext(), C0966R.string.ckf)));
                        return;
                    }
                    C0222b.m172k("initSdk");
                    if (this.f18931i.isAvailable()) {
                        onSurfaceTextureAvailable(this.f18931i.getSurfaceTexture(), this.f18931i.getWidth(), this.f18931i.getHeight());
                    }
                    this.f18931i.setSurfaceTextureListener(this);
                    this.f18925M.start();
                    return;
                }
                this.f18928f.setVisibility(8);
                this.f18937r.mo5278O7(mo5248b(k022.f136495d, k022.f136496e));
                return;
            }
            this.f18928f.setVisibility(8);
            this.f18937r.mo5278O7(mo5248b(90037, C76577a.m92166q(getContext(), C0966R.string.ckf)));
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "onSurfaceTextureAvailable width:%s,height:%s", Integer.valueOf(i), Integer.valueOf(i2));
        mo5249c();
        this.f18926d = surfaceTexture;
        if (this.f18936q.f313134k || this.f18913A || getVisibility() != 0) {
            Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "jump start preview again. isPreviewing:%s isVerifying:%s", Boolean.valueOf(this.f18936q.f313134k), Boolean.valueOf(this.f18913A));
            return;
        }
        this.f18927e.setVisibility(0);
        this.f18936q.mo149956e(this.f18931i, new C4358f(surfaceTexture));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "onSurfaceTextureDestroyed");
        this.f18926d = null;
        this.f18936q.mo149959h();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "onSurfaceTextureSizeChanged width:%s,height:%s", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public FaceFlashActionPreviewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        String str;
        this.f18936q = new C105349l(getContext());
        this.f18937r = (FaceFlashActionUI) getContext();
        this.f18938s = new C105347i();
        this.f18939t = getContext();
        this.f18941v = new C16405f();
        this.f18942w = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE;
        this.f18943x = new TranslateAnimation(0.0f, (float) (-C76577a.m92145A(getContext())), 0.0f, 0.0f);
        this.f18944y = new TranslateAnimation((float) C76577a.m92145A(getContext()), 0.0f, 0.0f, 0.0f);
        this.f18945z = false;
        this.f18913A = false;
        this.f18914B = false;
        this.f18915C = 0;
        this.f18916D = 0;
        this.f18917E = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_face_action_new_ui_copy_data, true);
        this.f18920H = 2;
        this.f18921I = 0.0f;
        this.f18922J = 0;
        this.f18923K = false;
        this.f18924L = 1;
        this.f18925M = new C4357e(25000, 50000);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a5k, this, true);
        this.f18927e = (FaceReflectMask) findViewById(C0966R.C0970id.e_y);
        this.f18929g = (TextView) findViewById(C0966R.C0970id.f358298ea1);
        this.f18930h = (TextView) findViewById(C0966R.C0970id.f358297ea0);
        this.f18932j = (ImageView) findViewById(C0966R.C0970id.cov);
        this.f18933n = (ProgressBar) findViewById(C0966R.C0970id.cq6);
        this.f18934o = (FaceNumberLayout) findViewById(C0966R.C0970id.e_u);
        this.f18935p = findViewById(C0966R.C0970id.e_r);
        this.f18928f = (TextView) findViewById(C0966R.C0970id.f358299ea2);
        Intent intent = ((Activity) getContext()).getIntent();
        if (intent == null) {
            Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "intent == null");
            if (Util.isNullOrNil("")) {
                str = this.f18939t.getString(C0966R.string.ckf);
            } else {
                str = "";
            }
            Context context2 = this.f18939t;
            C76879j.m92754y(context2, str, "", context2.getString(C0966R.string.cke), new C4368b(this, 90013, "init data failed"));
            return;
        }
        C10481b bVar = new C10481b(intent.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0), intent.getStringExtra("package"), intent.getStringExtra("packageSign"));
        C86709a0.m107524d().mo123455a(5965, this);
        C86709a0.m107524d().mo123460f(bVar);
    }
}
