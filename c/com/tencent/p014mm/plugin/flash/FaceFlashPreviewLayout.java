package com.tencent.p014mm.plugin.flash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.SensorManager;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au1.C0222b;
import au1.C113079a;
import bu1.C0381a;
import bu1.C0382b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.plugin.facedetect.model.C105224h;
import com.tencent.p014mm.plugin.flash.C105349l;
import com.tencent.p014mm.plugin.flash.view.FaceFlashReflectMask;
import com.tencent.p014mm.plugin.flash.view.FaceNumberLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import j20.C117292a;
import java.util.HashMap;
import java.util.Objects;
import jb1.C108680a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xt1.C15900c;
import yt1.C16072a;
import zt1.C119133a;
import zt1.C119138d;
import zt1.C16401b;
import zt1.C16404e;
import zt1.C16405f;
import zt1.C16407i;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout */
public class FaceFlashPreviewLayout extends RelativeLayout implements YtSDKKitFramework.IYTReflectListener, TextureView.SurfaceTextureListener, YtSDKKitFramework.IYtSDKKitFrameworkEventListener, YtSDKKitFramework.IYTBaseFunctionListener {

    /* renamed from: K */
    public static final /* synthetic */ int f18847K = 0;

    /* renamed from: A */
    public int f18848A;

    /* renamed from: B */
    public int f18849B;

    /* renamed from: C */
    public int f18850C;

    /* renamed from: D */
    public int f18851D;

    /* renamed from: E */
    public float f18852E;

    /* renamed from: F */
    public long f18853F;

    /* renamed from: G */
    public boolean f18854G;

    /* renamed from: H */
    public MultiProcessMMKV f18855H;

    /* renamed from: I */
    public long f18856I;

    /* renamed from: J */
    public CountDownTimer f18857J;

    /* renamed from: d */
    public FaceFlashReflectMask f18858d;

    /* renamed from: e */
    public TextView f18859e;

    /* renamed from: f */
    public TextView f18860f;

    /* renamed from: g */
    public MMTextureView f18861g;

    /* renamed from: h */
    public ImageView f18862h;

    /* renamed from: i */
    public ProgressBar f18863i;

    /* renamed from: j */
    public FaceNumberLayout f18864j;

    /* renamed from: n */
    public TextView f18865n;

    /* renamed from: o */
    public View f18866o;

    /* renamed from: p */
    public ImageView f18867p;

    /* renamed from: q */
    public FaceFlashUI f18868q;

    /* renamed from: r */
    public C4390h f18869r;

    /* renamed from: s */
    public Context f18870s;

    /* renamed from: t */
    public C16407i f18871t;

    /* renamed from: u */
    public C16405f f18872u;

    /* renamed from: v */
    public C16072a f18873v;

    /* renamed from: w */
    public YtSDKKitFramework.YtSDKKitFrameworkWorkMode f18874w;

    /* renamed from: x */
    public boolean f18875x;

    /* renamed from: y */
    public boolean f18876y;

    /* renamed from: z */
    public boolean f18877z;

    /* renamed from: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout$a */
    public class C4342a extends CountDownTimer {
        public C4342a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            Log.m105924i("MicroMsg.FaceFlashManager", "onFinish");
            FaceFlashPreviewLayout faceFlashPreviewLayout = FaceFlashPreviewLayout.this;
            faceFlashPreviewLayout.f18854G = true;
            if (!faceFlashPreviewLayout.f18876y && faceFlashPreviewLayout.getVisibility() == 0) {
                Log.m105924i("MicroMsg.FaceFlashManager", "onFinish break face detect!");
                FaceFlashPreviewLayout.this.mo5217g();
                YtSDKKitFramework.getInstance().fireEvent(YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, (Object) null);
                C0222b.m163b().f9686B = 6;
                FaceFlashPreviewLayout faceFlashPreviewLayout2 = FaceFlashPreviewLayout.this;
                faceFlashPreviewLayout2.f18868q.mo5243O7(((C119133a) faceFlashPreviewLayout2.f18871t).mo183837f(C76577a.m92166q(faceFlashPreviewLayout2.getContext(), C0966R.string.ckw), 90017).toString());
            }
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout$b */
    public class C4343b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ColorMatrixColorFilter f18879d;

        public C4343b(ColorMatrixColorFilter colorMatrixColorFilter) {
            this.f18879d = colorMatrixColorFilter;
        }

        public void run() {
            FaceFlashPreviewLayout faceFlashPreviewLayout = FaceFlashPreviewLayout.this;
            if (faceFlashPreviewLayout.f18876y) {
                faceFlashPreviewLayout.f18868q.mo5242N7(C76577a.m92153d(faceFlashPreviewLayout.getContext(), C0966R.color.f2975b6));
                FaceFlashPreviewLayout faceFlashPreviewLayout2 = FaceFlashPreviewLayout.this;
                faceFlashPreviewLayout2.f18859e.setTextColor(C76577a.m92153d(faceFlashPreviewLayout2.getContext(), C0966R.color.BW_100_Alpha_0_8));
                FaceFlashPreviewLayout.this.f18858d.setColorMatrixColorFilter(this.f18879d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout$c */
    public class C4344c implements Runnable {
        public C4344c() {
        }

        public void run() {
            FaceFlashPreviewLayout faceFlashPreviewLayout = FaceFlashPreviewLayout.this;
            C0381a.m332i(faceFlashPreviewLayout.f18859e, C76577a.m92166q(faceFlashPreviewLayout.getContext(), C0966R.string.ck_));
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout$d */
    public class C4345d implements C105349l.C4396e {

        /* renamed from: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout$d$a */
        public class C4346a implements Camera.PreviewCallback {

            /* renamed from: d */
            public final /* synthetic */ Point f18883d;

            public C4346a(Point point) {
                this.f18883d = point;
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                FaceFlashPreviewLayout faceFlashPreviewLayout = FaceFlashPreviewLayout.this;
                if (faceFlashPreviewLayout.f18852E > 0.0f) {
                    FaceFlashReflectMask faceFlashReflectMask = faceFlashPreviewLayout.f18858d;
                    long currentTimeMillis = System.currentTimeMillis();
                    FaceFlashPreviewLayout faceFlashPreviewLayout2 = FaceFlashPreviewLayout.this;
                    faceFlashReflectMask.setProgress(((float) (currentTimeMillis - faceFlashPreviewLayout2.f18853F)) / faceFlashPreviewLayout2.f18852E);
                }
                YtSDKKitFramework instance = YtSDKKitFramework.getInstance();
                Point point = this.f18883d;
                instance.updateWithFrameData(bArr, point.x, point.y, 1);
                C105224h.m141309b().mo149589c(bArr);
            }
        }

        public C4345d() {
        }

        /* renamed from: a */
        public void mo5233a(Boolean bool, C105349l lVar) {
            if (bool.booleanValue()) {
                FaceFlashPreviewLayout faceFlashPreviewLayout = FaceFlashPreviewLayout.this;
                int i = FaceFlashPreviewLayout.f18847K;
                faceFlashPreviewLayout.getClass();
                ((C119157j) C119157j.f356862d).mo183895z(new C4352a(faceFlashPreviewLayout, lVar));
                FaceFlashPreviewLayout.this.f18872u.mo14855b(lVar.f313127d.mo158259c());
                lVar.mo149957f(new C4346a(lVar.mo149955c()));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout$e */
    public class C4347e implements FaceFlashReflectMask.C4402a {
        public C4347e() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout$f */
    public class C4348f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ HashMap f18886d;

        public C4348f(HashMap hashMap) {
            this.f18886d = hashMap;
        }

        public void run() {
            boolean z;
            if (this.f18886d.containsKey(StateEvent.Name.UI_TIPS)) {
                String str = (String) this.f18886d.get(StateEvent.Name.UI_TIPS);
                Log.m105925i("MicroMsg.FaceFlashManager", "onFrameworkEvent tips:%s isVerifying:%s,prepareVerifying:%s", str, Boolean.valueOf(FaceFlashPreviewLayout.this.f18876y), Boolean.valueOf(FaceFlashPreviewLayout.this.f18875x));
                FaceFlashPreviewLayout faceFlashPreviewLayout = FaceFlashPreviewLayout.this;
                if (faceFlashPreviewLayout.f18874w == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE || (!faceFlashPreviewLayout.f18876y && !faceFlashPreviewLayout.f18875x)) {
                    faceFlashPreviewLayout.f18871t.mo14863b(faceFlashPreviewLayout.f18859e, str);
                }
            }
            if (this.f18886d.containsKey(StateEvent.Name.UI_ACTION)) {
                Log.m105924i("MicroMsg.FaceFlashManager", "onFrameworkEvent actions:" + this.f18886d.get(StateEvent.Name.UI_ACTION));
                if (Objects.equals(this.f18886d.get(StateEvent.Name.UI_ACTION), StateEvent.ActionValue.NET_REQ)) {
                    C0222b.m165d().f9677m = System.currentTimeMillis();
                    FaceFlashPreviewLayout faceFlashPreviewLayout2 = FaceFlashPreviewLayout.this;
                    faceFlashPreviewLayout2.f18853F = 0;
                    faceFlashPreviewLayout2.f18858d.setProgress(0.0f);
                    FaceFlashPreviewLayout.this.mo5217g();
                    FaceFlashPreviewLayout.this.f18869r.mo5305a();
                    FaceFlashPreviewLayout.this.f18864j.setVisibility(4);
                    FaceFlashPreviewLayout faceFlashPreviewLayout3 = FaceFlashPreviewLayout.this;
                    faceFlashPreviewLayout3.mo5216f(faceFlashPreviewLayout3.f18859e, C76577a.m92166q(faceFlashPreviewLayout3.getContext(), C0966R.string.net_reporting));
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) FaceFlashPreviewLayout.this.f18863i.getLayoutParams();
                    layoutParams.topMargin = (int) (FaceFlashPreviewLayout.this.f18858d.getCircleY() - ((float) (C76577a.m92157h(FaceFlashPreviewLayout.this.f18870s, C0966R.dimen.a57) / 2)));
                    FaceFlashPreviewLayout.this.f18863i.setLayoutParams(layoutParams);
                    FaceFlashPreviewLayout.this.f18863i.setVisibility(0);
                    FaceFlashPreviewLayout.this.f18866o.setBackgroundColor(Color.parseColor("#80000000"));
                    View view = FaceFlashPreviewLayout.this.f18866o;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (Objects.equals(this.f18886d.get(StateEvent.Name.UI_ACTION), StateEvent.ActionValue.STAGE_NOTPASS)) {
                    FaceFlashPreviewLayout faceFlashPreviewLayout4 = FaceFlashPreviewLayout.this;
                    int i = faceFlashPreviewLayout4.f18849B + 1;
                    faceFlashPreviewLayout4.f18849B = i;
                    Log.m105925i("MicroMsg.FaceFlashManager", "STAGE_NOTPASS %s", Integer.valueOf(i));
                    FaceFlashPreviewLayout faceFlashPreviewLayout5 = FaceFlashPreviewLayout.this;
                    if (faceFlashPreviewLayout5.f18849B > 10) {
                        if (faceFlashPreviewLayout5.f18875x && faceFlashPreviewLayout5.f18877z) {
                            Log.m105925i("MicroMsg.FaceFlashManager", "prepareVerifying and out rect time:%s", Integer.valueOf(faceFlashPreviewLayout5.f18848A));
                            FaceFlashPreviewLayout faceFlashPreviewLayout6 = FaceFlashPreviewLayout.this;
                            int i2 = faceFlashPreviewLayout6.f18848A + 1;
                            faceFlashPreviewLayout6.f18848A = i2;
                            if (i2 >= 4) {
                                YtSDKKitFramework.getInstance().fireEvent(YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, (Object) null);
                                FaceFlashPreviewLayout.this.mo5217g();
                                FaceFlashPreviewLayout.this.f18869r.mo5305a();
                                C0222b.m163b().f9686B = 6;
                                FaceFlashPreviewLayout faceFlashPreviewLayout7 = FaceFlashPreviewLayout.this;
                                faceFlashPreviewLayout7.f18868q.mo5243O7(((C119133a) faceFlashPreviewLayout7.f18871t).mo183837f(C76577a.m92166q(faceFlashPreviewLayout7.getContext(), C0966R.string.cjm), 90031).toString());
                            }
                        }
                        FaceFlashPreviewLayout faceFlashPreviewLayout8 = FaceFlashPreviewLayout.this;
                        if (!faceFlashPreviewLayout8.f18876y && faceFlashPreviewLayout8.f18877z) {
                            faceFlashPreviewLayout8.f18865n.setVisibility(4);
                            View view3 = FaceFlashPreviewLayout.this.f18866o;
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(4);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            FaceFlashPreviewLayout.this.setOnClickListener((View.OnClickListener) null);
                            FaceFlashPreviewLayout.this.mo5215e(C0381a.m326c(FaceFlashPreviewLayout.this.f18870s, (String) this.f18886d.get(StateEvent.Name.UI_TIPS)));
                            FaceFlashPreviewLayout.this.f18875x = false;
                        }
                        FaceFlashPreviewLayout.this.f18877z = false;
                    }
                } else if (Objects.equals(this.f18886d.get(StateEvent.Name.UI_ACTION), StateEvent.ActionValue.STAGE_PASS)) {
                    C0222b.m174m("faceRecognized");
                    FaceFlashPreviewLayout faceFlashPreviewLayout9 = FaceFlashPreviewLayout.this;
                    faceFlashPreviewLayout9.f18849B = 0;
                    faceFlashPreviewLayout9.f18877z = true;
                    if (!faceFlashPreviewLayout9.f18875x) {
                        faceFlashPreviewLayout9.f18875x = true;
                        YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = faceFlashPreviewLayout9.f18874w;
                        YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode2 = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE;
                        if (ytSDKKitFrameworkWorkMode == ytSDKKitFrameworkWorkMode2 && faceFlashPreviewLayout9.f18864j.getChildCount() == 0) {
                            FaceFlashPreviewLayout faceFlashPreviewLayout10 = FaceFlashPreviewLayout.this;
                            faceFlashPreviewLayout10.f18864j.setNumbers(((C119138d) faceFlashPreviewLayout10.f18871t).f356820C);
                            FaceFlashPreviewLayout.this.f18864j.measure(0, 0);
                            int circleY = ((int) FaceFlashPreviewLayout.this.f18858d.getCircleY()) - (FaceFlashPreviewLayout.this.f18864j.getMeasuredHeight() / 2);
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) FaceFlashPreviewLayout.this.f18864j.getLayoutParams();
                            layoutParams2.width = ((int) ((((float) FaceFlashPreviewLayout.this.getWidth()) * FaceFlashReflectMask.f19057q) * 2.0f)) - C76577a.m92157h(FaceFlashPreviewLayout.this.f18870s, C0966R.dimen.f3749d0);
                            layoutParams2.topMargin = circleY;
                            FaceFlashPreviewLayout.this.f18864j.setLayoutParams(layoutParams2);
                        }
                        FaceFlashPreviewLayout faceFlashPreviewLayout11 = FaceFlashPreviewLayout.this;
                        faceFlashPreviewLayout11.mo5216f(faceFlashPreviewLayout11.f18859e, C76577a.m92166q(faceFlashPreviewLayout11.getContext(), C0966R.string.fl_pose_incorrect));
                        FaceFlashPreviewLayout faceFlashPreviewLayout12 = FaceFlashPreviewLayout.this;
                        faceFlashPreviewLayout12.f18871t.mo14859a(faceFlashPreviewLayout12.f18859e);
                        if (faceFlashPreviewLayout12.f18874w == ytSDKKitFrameworkWorkMode2) {
                            faceFlashPreviewLayout12.f18866o.setBackgroundColor(Color.parseColor("#99000000"));
                            View view5 = faceFlashPreviewLayout12.f18866o;
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar3.mo10233c(0);
                            View view6 = view5;
                            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "dealFaceStatePass", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view6, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "dealFaceStatePass", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            faceFlashPreviewLayout12.f18865n.setVisibility(0);
                            C0222b.m175n(6);
                            faceFlashPreviewLayout12.setOnClickListener(new C4383b(faceFlashPreviewLayout12));
                        }
                        if (!faceFlashPreviewLayout12.f18875x) {
                            Log.m105924i("MicroMsg.FaceFlashManager", "prepareVerifying = false ,face not in rect.");
                        } else {
                            Log.m105924i("MicroMsg.FaceFlashManager", "start face verity.");
                            C0222b.m175n(3);
                            C0222b.m172k("sdkVerify");
                            YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode3 = faceFlashPreviewLayout12.f18874w;
                            if (ytSDKKitFrameworkWorkMode3 != ytSDKKitFrameworkWorkMode2) {
                                if (ytSDKKitFrameworkWorkMode3 == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                                    C0222b.m175n(7);
                                } else if (ytSDKKitFrameworkWorkMode3 == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE) {
                                    C0222b.m175n(5);
                                }
                                C0222b.m163b().f9704t = System.currentTimeMillis();
                                YtSDKKitFramework.getInstance().fireEvent(YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS, (Object) null);
                                faceFlashPreviewLayout12.f18876y = true;
                                faceFlashPreviewLayout12.f18872u.mo14858e();
                            }
                        }
                    }
                }
            }
            if (this.f18886d.containsKey(StateEvent.Name.PROCESS_RESULT) && FaceFlashPreviewLayout.this.getVisibility() == 0) {
                Log.m105924i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:" + this.f18886d.get(StateEvent.Name.PROCESS_RESULT));
                FaceFlashPreviewLayout.this.f18857J.cancel();
                FaceFlashPreviewLayout.this.mo5217g();
                FaceFlashPreviewLayout.this.f18876y = false;
                if (Objects.equals(this.f18886d.get(StateEvent.Name.PROCESS_RESULT), StateEvent.ProcessResult.SUCCEED)) {
                    C0222b.m172k("sdkResult");
                    Log.m105925i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:SUCCEED ,param:%s", this.f18886d);
                    FaceFlashPreviewLayout.this.f18872u.mo14857d();
                    FaceFlashUI faceFlashUI = FaceFlashPreviewLayout.this.f18868q;
                    String str2 = (String) this.f18886d.get(StateEvent.Name.MESSAGE);
                    Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity showSuccessLayout", Integer.valueOf(faceFlashUI.hashCode()));
                    FaceFlashPreviewLayout faceFlashPreviewLayout13 = faceFlashUI.f18899d;
                    if (faceFlashPreviewLayout13.f18873v.isShowing()) {
                        faceFlashPreviewLayout13.f18873v.dismiss();
                    }
                    faceFlashUI.f18904i = str2;
                    C0222b.m168g(str2);
                    faceFlashUI.mo5242N7(C76577a.m92153d(faceFlashUI.getContext(), C0966R.color.f3133gi));
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.optBoolean("selfHandle", false)) {
                            try {
                                faceFlashUI.mo5239J7(new JSONObject(str2));
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.FaceFlashManager", e, "", new Object[0]);
                            }
                        } else {
                            faceFlashUI.f18899d.setVisibility(8);
                            faceFlashUI.f18899d.mo5211b();
                            faceFlashUI.f18900e.setVisibility(0);
                            faceFlashUI.f18900e.mo5236a();
                            C119179t tVar = C119157j.f356862d;
                            C4392k kVar = new C4392k(faceFlashUI, jSONObject);
                            C119157j jVar = (C119157j) tVar;
                            jVar.getClass();
                            jVar.mo183892w(kVar, 1000, false);
                        }
                    } catch (JSONException e2) {
                        Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e2, "parse face success result error.%s", str2);
                    }
                } else if (Objects.equals(this.f18886d.get(StateEvent.Name.PROCESS_RESULT), StateEvent.ProcessResult.FAILED)) {
                    HashMap hashMap = this.f18886d;
                    int i3 = -1;
                    if (hashMap.containsKey(StateEvent.Name.ERROR_CODE)) {
                        i3 = ((Integer) hashMap.get(StateEvent.Name.ERROR_CODE)).intValue();
                    }
                    C0222b.m173l("sdkResult", Integer.valueOf(i3));
                    Log.m105925i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:FAILED ,param:%s", this.f18886d);
                    if (C0381a.m329f(this.f18886d, StateEvent.Name.ERROR_CODE, ErrorCode.YT_SDK_VERIFY_TIMEOUT)) {
                        C0381a.m331h(this.f18886d, C76577a.m92166q(FaceFlashPreviewLayout.this.f18870s, C0966R.string.ckw));
                    } else if (C0381a.m329f(this.f18886d, StateEvent.Name.ERROR_CODE, ErrorCode.YT_SDK_NETWORK_ERROR)) {
                        C0381a.m331h(this.f18886d, C76577a.m92166q(FaceFlashPreviewLayout.this.f18870s, C0966R.string.net_fetch_failed));
                    } else if (C0381a.m329f(this.f18886d, StateEvent.Name.ERROR_CODE, 4194304) && this.f18886d.containsKey(StateEvent.Name.MESSAGE)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(this.f18886d.get(StateEvent.Name.MESSAGE).toString());
                            if (!jSONObject2.optString("errormsg").equals(StringCode.FL_NO_FACE)) {
                                if (!jSONObject2.optString("errormsg").equals(StringCode.FL_INCOMPLETE_FACE)) {
                                    z = false;
                                    if (z && !FaceFlashPreviewLayout.this.f18854G) {
                                        C0222b.m163b().f9696l++;
                                        FaceFlashPreviewLayout.this.f18869r.f19034a.getClass();
                                        YtSDKKitFramework.getInstance().reset();
                                        FaceFlashPreviewLayout.this.mo5210a();
                                        FaceFlashPreviewLayout faceFlashPreviewLayout14 = FaceFlashPreviewLayout.this;
                                        faceFlashPreviewLayout14.mo5216f(faceFlashPreviewLayout14.f18859e, C76577a.m92166q(faceFlashPreviewLayout14.getContext(), C0966R.string.fl_pose_not_in_rect));
                                        return;
                                    }
                                }
                            }
                            z = true;
                            C0222b.m163b().f9696l++;
                            FaceFlashPreviewLayout.this.f18869r.f19034a.getClass();
                            YtSDKKitFramework.getInstance().reset();
                            FaceFlashPreviewLayout.this.mo5210a();
                            FaceFlashPreviewLayout faceFlashPreviewLayout142 = FaceFlashPreviewLayout.this;
                            faceFlashPreviewLayout142.mo5216f(faceFlashPreviewLayout142.f18859e, C76577a.m92166q(faceFlashPreviewLayout142.getContext(), C0966R.string.fl_pose_not_in_rect));
                            return;
                        } catch (Exception unused) {
                            Log.m105921e("MicroMsg.FaceFlashManagerError", "get message error,message:%s", this.f18886d.get(StateEvent.Name.MESSAGE));
                        }
                    }
                    C0381a.m330g(FaceFlashPreviewLayout.this.getContext(), this.f18886d);
                    FaceFlashPreviewLayout.this.f18868q.mo5243O7((String) this.f18886d.get(StateEvent.Name.MESSAGE));
                } else {
                    Log.m105925i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:UNKNOWN ,param:%s", this.f18886d);
                    FaceFlashPreviewLayout.this.f18868q.mo5243O7((String) this.f18886d.get(StateEvent.Name.MESSAGE));
                }
            }
        }
    }

    static {
        C15900c.m14813a();
    }

    public FaceFlashPreviewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getDegree() {
        int rotation = ((Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    /* renamed from: a */
    public final void mo5210a() {
        this.f18865n.setVisibility(4);
        Log.m105924i("MicroMsg.FaceFlashManager", "resetWithoutPreview");
        C113079a.m154756b(this.f18874w);
        FaceFlashReflectMask faceFlashReflectMask = this.f18858d;
        faceFlashReflectMask.getClass();
        faceFlashReflectMask.setColorMatrixColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        this.f18868q.mo5242N7(C76577a.m92153d(getContext(), C0966R.color.f3131gg));
        this.f18859e.setTextColor(C76577a.m92153d(getContext(), C0966R.color.f3131gg));
        this.f18875x = false;
        this.f18876y = false;
        this.f18853F = 0;
        this.f18849B = 0;
        this.f18858d.setProgress(0.0f);
        this.f18863i.setVisibility(8);
        this.f18864j.mo149962a();
        this.f18864j.removeAllViews();
        View view = this.f18866o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f18872u.mo14856c();
        this.f18871t.reset();
        this.f18868q.mo5242N7(C76577a.m92153d(getContext(), C0966R.color.f3131gg));
        mo5215e(C76577a.m92166q(getContext(), C0966R.string.fl_pose_incorrect));
    }

    /* renamed from: b */
    public void mo5211b() {
        Log.m105924i("MicroMsg.FaceFlashManager", "onPause");
        if (this.f18876y) {
            YtSDKKitFramework.getInstance().fireEvent(YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, (Object) null);
        }
        C4390h hVar = this.f18869r;
        hVar.mo5305a();
        hVar.f19034a.getClass();
        Log.m105924i("MicroMsg.FaceFlashManager", "releaseYTSdk");
        YtSDKKitFramework.getInstance().deInit();
        C105349l lVar = hVar.f19035b;
        if (lVar != null) {
            MMHandler mMHandler = lVar.f313126c;
            if (mMHandler != null) {
                mMHandler.post(new C105352n(lVar));
            } else {
                Log.m105924i("MicroMsg.FaceFlashManagerCamera", "back thread is not running");
            }
        }
        mo5217g();
        mo5210a();
    }

    public String base64Encode(byte[] bArr, int i) {
        return null;
    }

    /* renamed from: c */
    public void mo5213c() {
        boolean z;
        Log.m105924i("MicroMsg.FaceFlashManager", "onResume");
        if (getVisibility() == 0) {
            C4390h hVar = this.f18869r;
            hVar.getClass();
            C105347i iVar = new C105347i();
            hVar.f19034a = iVar;
            if (!iVar.mo149953c()) {
                C0222b.m173l("initSdk", -1);
                C0222b.m163b().f9686B = 2;
                hVar.f19036c.mo5240K7(90013, "init lib failed");
                z = false;
            } else {
                C0222b.m172k("initSdk");
                C0222b.m175n(10);
                z = true;
            }
            if (z) {
                if (this.f18861g.isAvailable()) {
                    onSurfaceTextureAvailable(this.f18861g.getSurfaceTexture(), this.f18861g.getWidth(), this.f18861g.getHeight());
                }
                this.f18861g.setSurfaceTextureListener(this);
                this.f18857J.start();
                if (this.f18851D == -1) {
                    this.f18851D = getDegree();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo5214d() {
        if (this.f18858d.getCircleY() <= 0.0f) {
            this.f18858d.setCallback(new C4347e());
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f18862h.getLayoutParams();
        marginLayoutParams.topMargin = (int) (this.f18858d.getCircleY() - ((float) (this.f18862h.getHeight() / 2)));
        this.f18862h.setLayoutParams(marginLayoutParams);
        Log.m105919d("MicroMsg.FaceFlashManager", "mFaceLoadingDot topMargin:%s  verifyLoadingBar height:%s", Integer.valueOf(marginLayoutParams.topMargin), Integer.valueOf(this.f18863i.getHeight()));
    }

    /* renamed from: e */
    public final void mo5215e(String str) {
        Log.m105925i("MicroMsg.FaceFlashManager", "resetTranslateAnimation prepareVerifying:%s", Boolean.valueOf(this.f18875x));
        mo5216f(this.f18859e, str);
        this.f18859e.setTextColor(Color.parseColor("#000000"));
        this.f18859e.clearAnimation();
        this.f18859e.setVisibility(0);
        this.f18864j.setVisibility(4);
    }

    /* renamed from: f */
    public final void mo5216f(TextView textView, String str) {
        C0381a.m332i(textView, str);
        C119133a aVar = (C119133a) this.f18871t;
        aVar.getClass();
        aVar.f356805q = System.currentTimeMillis();
    }

    /* renamed from: g */
    public final void mo5217g() {
        this.f18864j.mo149962a();
        C16405f fVar = this.f18872u;
        long j = ((C119133a) this.f18871t).f356797f;
        if (fVar.f43810a && C108680a.m147401e().mo159700h()) {
            C108680a.m147401e().mo159702j(new C16404e(fVar, j));
        }
        FaceFlashLogOpenStruct b = C0222b.m163b();
        b.f9709y = b.mo86045b("BioId", String.valueOf(((C119133a) this.f18871t).f356797f), true);
        C16407i iVar = this.f18871t;
        if (iVar instanceof C119138d) {
            ((C119138d) iVar).mo183847s();
        }
    }

    public byte[] getVoiceData() {
        mo5217g();
        int i = -1;
        byte[] O = C86013q1.m106433O(((C119138d) this.f18871t).f356819B.f350363c, -1, -1);
        if (O != null && O.length > 0) {
            i = 0;
        }
        C0222b.m173l("voiceData", Integer.valueOf(i));
        return O;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f18861g.setRotation((float) (-(getDegree() - this.f18851D)));
    }

    public void onFrameworkEvent(HashMap<String, Object> hashMap) {
        if (hashMap.containsKey(StateEvent.Name.STATE_STATS)) {
            HashMap hashMap2 = (HashMap) hashMap.get(StateEvent.Name.STATE_STATS);
            if (C0222b.f752e == null) {
                C0222b.f752e = new JSONArray();
            }
            if ((C0222b.f752e.toString().length() <= 1000) && hashMap2 != null && hashMap2.size() > 0) {
                JSONObject jSONObject = new JSONObject(hashMap2);
                Log.m105925i("MicroMsg.FaceFlashManagerReport", "updateFaceSdkState:%s", jSONObject);
                if (C0222b.f752e.length() >= 5) {
                    C0222b.f752e.remove(0);
                    C0222b.f752e.put(jSONObject);
                }
            }
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C4348f(hashMap));
    }

    public float onGetAppBrightness() {
        return 1.0f;
    }

    public void onNetworkRequestEvent(String str, String str2, HashMap<String, String> hashMap, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        this.f18871t.onNetworkRequestEvent(str, str2, hashMap, iYtSDKKitNetResponseParser);
    }

    public void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f) {
        Log.m105925i("MicroMsg.FaceFlashManager", "change color :%s isVerifying:%s", colorMatrixColorFilter, Boolean.valueOf(this.f18876y));
        ((C119157j) C119157j.f356862d).mo183895z(new C4343b(colorMatrixColorFilter));
    }

    public void onReflectStart(long j) {
        C0222b.m172k("reflect");
        this.f18852E = (float) j;
        this.f18853F = System.currentTimeMillis();
        ((C119157j) C119157j.f356862d).mo183895z(new C4344c());
        Log.m105925i("MicroMsg.FaceFlashManager", "onReflectStart duration:%s", Long.valueOf(j));
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.FaceFlashManager", "onSurfaceTextureAvailable width:%s,height:%s", Integer.valueOf(i), Integer.valueOf(i2));
        mo5214d();
        C105349l lVar = this.f18869r.f19035b;
        if ((lVar == null ? false : lVar.f313134k) || this.f18876y || getVisibility() != 0) {
            Object[] objArr = new Object[2];
            C105349l lVar2 = this.f18869r.f19035b;
            objArr[0] = Boolean.valueOf(lVar2 == null ? false : lVar2.f313134k);
            objArr[1] = Boolean.valueOf(this.f18876y);
            Log.m105925i("MicroMsg.FaceFlashManager", "jump start preview again. isPreviewing:%s isVerifying:%s", objArr);
            return;
        }
        C4390h hVar = this.f18869r;
        MMTextureView mMTextureView = this.f18861g;
        YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = this.f18874w;
        C4345d dVar = new C4345d();
        C105349l lVar3 = new C105349l(hVar.f19036c);
        hVar.f19035b = lVar3;
        lVar3.mo149956e(mMTextureView, new C4389g(hVar, this, this, ytSDKKitFrameworkWorkMode, this, surfaceTexture, dVar));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.FaceFlashManager", "onSurfaceTextureDestroyed");
        this.f18869r.mo5305a();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.FaceFlashManager", "onSurfaceTextureSizeChanged width:%s,height:%s", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public FaceFlashPreviewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        SensorManager sensorManager;
        FaceFlashUI faceFlashUI = (FaceFlashUI) getContext();
        this.f18868q = faceFlashUI;
        this.f18869r = new C4390h(faceFlashUI);
        this.f18870s = getContext();
        this.f18872u = new C16405f();
        YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        this.f18874w = ytSDKKitFrameworkWorkMode;
        this.f18875x = false;
        this.f18876y = false;
        this.f18877z = false;
        this.f18848A = 0;
        this.f18849B = 0;
        this.f18850C = -1;
        this.f18851D = -1;
        this.f18852E = 0.0f;
        this.f18853F = 0;
        this.f18854G = false;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("face-flash");
        this.f18855H = mmkv;
        this.f18856I = mmkv.decodeLong("show-dialog", 0);
        this.f18857J = new C4342a(25000, 1000);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a5o, this, true);
        this.f18858d = (FaceFlashReflectMask) findViewById(C0966R.C0970id.e_y);
        this.f18859e = (TextView) findViewById(C0966R.C0970id.f358298ea1);
        this.f18860f = (TextView) findViewById(C0966R.C0970id.f358299ea2);
        this.f18862h = (ImageView) findViewById(C0966R.C0970id.cov);
        this.f18863i = (ProgressBar) findViewById(C0966R.C0970id.cq6);
        this.f18864j = (FaceNumberLayout) findViewById(C0966R.C0970id.e_u);
        this.f18866o = findViewById(C0966R.C0970id.e_r);
        this.f18865n = (TextView) findViewById(C0966R.C0970id.cqo);
        this.f18867p = (ImageView) findViewById(C0966R.C0970id.cpz);
        Intent intent = ((Activity) getContext()).getIntent();
        int i2 = 4;
        int intExtra = intent.getIntExtra("check_alive_type", 4);
        if (intExtra != 1) {
            if (intExtra == 2) {
                Log.m105924i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX");
                C0382b bVar = C0382b.C0385c.f988a;
                bVar.mo416a(MMApplicationContext.getContext());
                C0382b.C0384b bVar2 = bVar.f985b;
                float f = bVar2 != null ? bVar2.f987d : -1.0f;
                if (bVar.f986c && (sensorManager = bVar.f984a) != null) {
                    bVar.f986c = false;
                    sensorManager.unregisterListener(bVar2);
                }
                if (f < intent.getFloatExtra("mLight_threshold", -1.0f)) {
                    this.f18874w = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE;
                    this.f18850C = 5;
                    Log.m105924i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX  REFLECTION");
                    i2 = 1;
                } else {
                    this.f18874w = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE;
                    this.f18850C = 6;
                    Log.m105924i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX  READ_NUMBER");
                }
            } else if (intExtra != 4) {
                this.f18874w = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE;
                this.f18850C = 3;
                Log.m105924i("MicroMsg.FaceFlashManager", "biz choose READ_NUMBER");
            } else {
                Log.m105924i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX  ACTREFLECT");
                this.f18874w = ytSDKKitFrameworkWorkMode;
                this.f18850C = 4;
            }
            i2 = 0;
        } else {
            this.f18874w = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE;
            Log.m105924i("MicroMsg.FaceFlashManager", "biz choose REFLECTION");
            this.f18850C = 2;
            i2 = intExtra;
        }
        C0222b.m163b().f9689e = (long) this.f18850C;
        C16407i a = C16401b.m15217a(i2);
        this.f18871t = a;
        a.mo14864c(intent, (Activity) getContext());
        this.f18872u.mo14854a(intent, i2);
        Log.m105925i("MicroMsg.FaceFlashManager", "face detect type:%s  after type:%s", this.f18874w, Integer.valueOf(i2));
        String stringExtra = intent.getStringExtra("business_tips");
        if (TextUtils.isEmpty(stringExtra)) {
            this.f18860f.setVisibility(8);
        } else {
            this.f18860f.setText(stringExtra);
        }
        mo5216f(this.f18859e, C76577a.m92166q(getContext(), C0966R.string.fl_pose_not_in_rect));
        this.f18861g = (MMTextureView) findViewById(C0966R.C0970id.e_s);
        this.f18873v = new C16072a(getContext());
    }
}
