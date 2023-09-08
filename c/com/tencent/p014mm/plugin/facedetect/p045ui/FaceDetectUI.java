package com.tencent.p014mm.plugin.facedetect.p045ui;

import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.facedetect.model.C105227i;
import com.tencent.p014mm.plugin.facedetect.model.C105228s;
import com.tencent.p014mm.plugin.facedetect.model.C115422j;
import com.tencent.p014mm.plugin.facedetect.model.C115423k;
import com.tencent.p014mm.plugin.facedetect.model.C115426w;
import com.tencent.p014mm.plugin.facedetect.model.C93390g;
import com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.p014mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.p014mm.plugin.facedetect.views.C105243b;
import com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView;
import com.tencent.p014mm.plugin.facedetect.views.FaceDetectView;
import com.tencent.p014mm.plugin.facedetect.views.FaceScanRect;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.service.C116024c;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fb1.C116852b;
import fb1.C116853c;
import fb1.C116854d;
import fb1.C116855e;
import gb1.C116929b;
import gb1.C116932c;
import gb1.C116934e;
import ib1.C117149g;
import ib1.C117150h;
import j20.C117292a;
import java.util.ArrayList;
import jb1.C108680a;
import k20.C60958c;
import k20.C9556a;
import kb1.C108993h;
import kb1.C117405f;
import ke3.C88144b;
import nj3.C88989a;
import org.xwalk.core.XWalkEnvironment;
import p156gj.C107848z;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectUI */
public class FaceDetectUI extends MMActivity implements C117405f, C116855e {

    /* renamed from: z */
    public static final /* synthetic */ int f345990z = 0;

    /* renamed from: d */
    public PowerManager.WakeLock f345991d = null;

    /* renamed from: e */
    public String f345992e = null;

    /* renamed from: f */
    public int f345993f = -1;

    /* renamed from: g */
    public C115423k f345994g = null;

    /* renamed from: h */
    public C115432e f345995h = null;

    /* renamed from: i */
    public boolean f345996i = false;

    /* renamed from: j */
    public boolean f345997j = false;

    /* renamed from: n */
    public boolean f345998n = false;

    /* renamed from: o */
    public View f345999o = null;

    /* renamed from: p */
    public RelativeLayout f346000p;

    /* renamed from: q */
    public FaceDetectView f346001q = null;

    /* renamed from: r */
    public FaceScanRect f346002r = null;

    /* renamed from: s */
    public TextView f346003s = null;

    /* renamed from: t */
    public FaceDetectProcessService f346004t = null;

    /* renamed from: u */
    public ServiceConnection f346005u = null;

    /* renamed from: v */
    public boolean f346006v = false;

    /* renamed from: w */
    public boolean f346007w = false;

    /* renamed from: x */
    public C108993h f346008x = null;

    /* renamed from: y */
    public String f346009y;

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectUI$a */
    public class C115428a implements View.OnClickListener {
        public C115428a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceDetectUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.FaceDetectUI", "hy: user cancelled with left button");
            FaceDetectUI faceDetectUI = FaceDetectUI.this;
            int i = FaceDetectUI.f345990z;
            faceDetectUI.getClass();
            Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo onUserCancel");
            C116929b.C116931b currentMotionCancelInfo = faceDetectUI.f346001q.getCurrentMotionCancelInfo();
            faceDetectUI.mo175315H7(1, currentMotionCancelInfo.f350380a, currentMotionCancelInfo.f350381b, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectUI$b */
    public class C115429b implements FaceScanRect.C115439b {
        public C115429b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectUI$c */
    public class C115430c implements Animation.AnimationListener {
        public C115430c() {
        }

        public void onAnimationEnd(Animation animation) {
            FaceDetectUI faceDetectUI = FaceDetectUI.this;
            int i = FaceDetectUI.f345990z;
            faceDetectUI.mo175318K7();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectUI$d */
    public interface C115431d {
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectUI$e */
    public class C115432e {

        /* renamed from: a */
        public boolean f346013a = false;

        public C115432e(C115428a aVar) {
        }

        public String toString() {
            return "InitHandler{isCgiInitDone=" + true + ", isCameraInitDone=" + this.f346013a + ", isLightInitDone=" + true + ", isLibraryInitDone=" + true + '}';
        }
    }

    /* renamed from: H7 */
    public void mo175315H7(int i, int i2, String str, Bundle bundle) {
        Log.m105925i("MicroMsg.FaceDetectUI", "finishWithResult errType: %d, errCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 0 && i2 != 0 && C108680a.m147401e().mo159700h() && C108680a.m147401e().f325476h) {
            C108680a.m147401e().mo159697d();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("key_parcelable_reporter", FaceDetectReporter.m162242a());
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putInt("err_type", i);
        bundle3.putInt("err_code", i2);
        bundle3.putString("err_msg", str);
        bundle3.putAll(bundle2);
        Intent intent = new Intent();
        intent.putExtras(bundle3);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: I7 */
    public final void mo175316I7(int i, int i2, String str, String str2) {
        Log.m105925i("MicroMsg.FaceDetectUI", "onProcessingError errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        Bundle bundle = new Bundle();
        bundle.putString("show_err_msg", str2);
        mo175319L7();
        mo175315H7(i, i2, str, bundle);
    }

    /* renamed from: J7 */
    public void mo175317J7(int i, String str) {
        boolean z = true;
        Log.m105925i("MicroMsg.FaceDetectUI", "hy: face detect result: %d", Integer.valueOf(i));
        if (!(i > 0 && i < 10)) {
            C115423k kVar = this.f345994g;
            if (kVar.f345974a >= kVar.f345976c - 1) {
                Log.m105924i("MicroMsg.FaceDetectUI", "hy: collect data ok");
                this.f346001q.mo175332g(true, (C115426w) null);
                Bitmap previewBm = this.f346001q.getPreviewBm();
                Object[] objArr = new Object[1];
                if (previewBm != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.FaceDetectUI", "alvinluo bitmap == null: %b", objArr);
                ThreadPool.post(new C115434b(this, previewBm, new C115436c(this)), "save_face_bitmap");
                return;
            }
            C115422j jVar = C105227i.INSTANCE.f312612d.f345985i;
            if (jVar.f345972a == null) {
                Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: move to next motion no instance");
            } else {
                Log.m105924i("MicroMsg.FaceDetectNativeManager", "hy: start move next motion");
                jVar.f345972a.engineNextMotion();
            }
            kVar.f345974a++;
            int i2 = kVar.mo175309a().f345977a;
            Log.m105925i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", Integer.valueOf(i2));
            if (this.f345994g.mo175309a().f345984h) {
                this.f346002r.mo175344a(new C115430c());
                return;
            }
            Log.m105925i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", Integer.valueOf(i2));
            mo175318K7();
        } else if (i == 3) {
            mo175316I7(4, 90017, "face detect time out", str);
        } else if (i == 6 || i == 5) {
            mo175316I7(4, 90023, "face track failed or not stable", str);
        } else if (i == 7) {
            mo175316I7(4, 90009, "audio permission not granted", MMApplicationContext.getContext().getString(C0966R.string.f361130hi2));
        } else {
            mo175316I7(4, 90018, "system error", str);
        }
    }

    /* renamed from: K7 */
    public final void mo175318K7() {
        C116929b bVar;
        if (this.f345997j) {
            Log.m105924i("MicroMsg.FaceDetectUI", "hy: start capture face");
            FaceDetectView faceDetectView = this.f346001q;
            Rect rect = new Rect(this.f346002r.getLeft(), this.f346002r.getTop(), this.f346002r.getRight(), this.f346002r.getBottom());
            C115423k.C115424a a = this.f345994g.mo175309a();
            faceDetectView.getClass();
            if (a.f345977a != 100) {
                C116929b bVar2 = faceDetectView.f346028j;
                if (bVar2 != null) {
                    bVar2.mo180912i();
                }
                faceDetectView.f346030o = false;
                faceDetectView.f346031p = false;
                faceDetectView.f346034s = Util.currentTicks();
                faceDetectView.f346032q = a.f345981e;
                Log.m105924i("MicroMsg.FaceDetectView", "carson logic");
                Log.m105924i("MicroMsg.FaceDetectView", "item.hintStr" + a.f345980d);
                faceDetectView.f346033r = a.f345982f;
                if (a.f345977a == 4) {
                    Log.m105924i("MicroMsg.IFaceMotion.Factory", "hy: is read number");
                    bVar = new C116934e(a.f345983g);
                } else {
                    Log.m105924i("MicroMsg.IFaceMotion.Factory", "hy: is normal");
                    bVar = new C116932c(a.f345980d, a.f345979c);
                }
                faceDetectView.f346028j = bVar;
                ViewGroup viewGroup = faceDetectView.f346025g;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                ViewGroup viewGroup2 = faceDetectView.f346026h;
                if (viewGroup2 != null) {
                    viewGroup2.removeAllViews();
                }
                faceDetectView.f346028j.mo180910g(faceDetectView.getContext(), faceDetectView.f346025g, faceDetectView.f346026h);
                Log.m105918d("MicroMsg.FaceDetectView", "mBusinessTip : " + faceDetectView.f346029n);
                faceDetectView.f346028j.mo180904a(faceDetectView.f346029n);
                FaceDetectCameraView faceDetectCameraView = faceDetectView.f346022d;
                if (faceDetectCameraView != null) {
                    long j = a.f345978b;
                    synchronized (faceDetectCameraView) {
                        Log.m105924i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
                        C105227i.f312610f.removeCallbacksAndMessages((Object) null);
                        faceDetectCameraView.f312642v = rect;
                        faceDetectCameraView.mo149605G();
                        ((FaceDetectCameraView.C105232c) faceDetectCameraView.f312646z).mo149620c(j);
                    }
                }
            }
        }
    }

    /* renamed from: L7 */
    public final void mo175319L7() {
        C107848z zVar;
        this.f345997j = false;
        this.f346001q.mo175332g(false, (C115426w) null);
        Log.m105924i("MicroMsg.FaceDetectUI", "hy: stopped scan");
        this.f345996i = false;
        FaceDetectCameraView.C105232c cVar = (FaceDetectCameraView.C105232c) this.f346001q.f346022d.f312646z;
        synchronized (FaceDetectCameraView.this.f312641u) {
            C105228s sVar = cVar.f312647a;
            if (!(sVar == null || !sVar.f312615c || (zVar = sVar.f312614b) == null)) {
                zVar.mo158268l();
                sVar.f312615c = false;
                C93390g.f269584d.mo126892c();
            }
        }
        Log.m105924i("MicroMsg.FaceDetectUI", "hy: stopped preview");
    }

    /* renamed from: M7 */
    public final void mo175320M7() {
        Log.m105925i("MicroMsg.FaceDetectUI", "alvinluo unbindService, mBound: %b", Boolean.valueOf(this.f346006v));
        if (this.f346006v) {
            Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo unbindService");
            C116024c.m163166f(this.f346005u, XWalkEnvironment.MODULE_TOOLS, true, C88144b.m109786e(XWalkEnvironment.MODULE_TOOLS));
            this.f346006v = false;
        }
    }

    public void finish() {
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo finish");
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo FaceDetectUI release");
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo releaseFaceDetect");
        if (!this.f345998n) {
            this.f346008x = null;
            this.f345998n = true;
            if (this.f345995h.f346013a) {
                mo175319L7();
                FaceDetectCameraView.C105232c cVar = (FaceDetectCameraView.C105232c) this.f346001q.f346022d.f312646z;
                FaceDetectCameraView faceDetectCameraView = FaceDetectCameraView.this;
                if (!faceDetectCameraView.f312636p) {
                    faceDetectCameraView.f312636p = true;
                    ThreadPool.post(new C105243b(cVar), "FaceDetectCameraView_Camera");
                }
            }
            PowerManager.WakeLock wakeLock = this.f345991d;
            if (wakeLock != null && wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = this.f345991d;
                PowerManager.WakeLock wakeLock3 = wakeLock2;
                C117292a.m165357c(wakeLock3, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                C117292a.m165359e(wakeLock3, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                this.f345991d = null;
            }
            ThreadPool.post(new C117149g(this), "Face_active_gc");
        }
        mo175320M7();
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a5z;
    }

    public void onBackPressed() {
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo onBackPressed and cancel");
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo onUserCancel");
        C116929b.C116931b currentMotionCancelInfo = this.f346001q.getCurrentMotionCancelInfo();
        mo175315H7(1, currentMotionCancelInfo.f350380a, currentMotionCancelInfo.f350381b, (Bundle) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        this.f345992e = getIntent().getStringExtra("k_user_name");
        this.f345993f = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        this.f346009y = getIntent().getStringExtra("business_tips");
        FaceDetectReporter faceDetectReporter = (FaceDetectReporter) getIntent().getBundleExtra("key_reporter_bundle").getParcelable("key_parcelable_reporter");
        if (faceDetectReporter != null) {
            FaceDetectReporter.m162242a().mo175303g(faceDetectReporter);
        }
        int i = this.f345993f;
        Bundle extras = getIntent().getExtras();
        Log.m105925i("MicroMsg.FaceDetectControllerFactory", "alvinluo getController serverScene: %d", Integer.valueOf(i));
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 4:
                new C116852b(this, this, i, 0, extras);
                break;
            case 2:
            case 5:
                new C116853c(this, this, i, 0, extras);
                break;
            case 6:
                new C116854d(this, this, i, 0, extras);
                break;
        }
        getWindow().setFlags(1024, 1024);
        ((Button) findViewById(C0966R.C0970id.fmq)).setOnClickListener(new C115428a());
        View findViewById = findViewById(C0966R.C0970id.cph);
        this.f345999o = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346000p = (RelativeLayout) findViewById(C0966R.C0970id.cq_);
        this.f346002r = (FaceScanRect) findViewById(C0966R.C0970id.cpu);
        this.f346001q = (FaceDetectView) findViewById(C0966R.C0970id.cpt);
        this.f346003s = (TextView) findViewById(C0966R.C0970id.ckq);
        this.f346001q.setCallback(this);
        this.f346001q.setBusinessTip(this.f346009y);
        FaceDetectView faceDetectView = this.f346001q;
        RelativeLayout relativeLayout = this.f346000p;
        ViewGroup centerHintHolder = this.f346002r.getCenterHintHolder();
        faceDetectView.f346025g = relativeLayout;
        faceDetectView.f346026h = centerHintHolder;
        this.f346001q.setErrTextView(this.f346003s);
        this.f346001q.mo175330e(true, this.f345992e);
        this.f346002r.setOnRefreshRectListener(new C115429b());
        this.f346002r.setVisibility(4);
        this.f345995h = new C115432e((C115428a) null);
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.FaceDetectUI", "hy: current %d instance not destroyed", Integer.valueOf(hashCode()));
        super.onDestroy();
    }

    public void onStart() {
        super.onStart();
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo onStart");
        if (this.f345991d == null) {
            this.f345991d = ((PowerManager) getSystemService("power")).newWakeLock(10, "Scan Lock");
        }
        if (!this.f345991d.isHeld()) {
            Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo acquire wakeLock");
            PowerManager.WakeLock wakeLock = this.f345991d;
            PowerManager.WakeLock wakeLock2 = wakeLock;
            C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "acquireWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "acquireWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        Intent intent = new Intent(this, FaceDetectProcessService.class);
        intent.putExtra("key_face_service_connection_from", 2);
        this.f346005u = new C117150h(this);
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo bindService");
        C116024c.m163161a(intent, this.f346005u, 1, XWalkEnvironment.MODULE_TOOLS, true, C88144b.m109786e(XWalkEnvironment.MODULE_TOOLS));
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.FaceDetectUI", "hy: onStop, finish");
        mo175320M7();
        if (!this.f346007w) {
            mo175315H7(1, 90006, "cancel with on stop", (Bundle) null);
        } else {
            finish();
        }
    }
}
