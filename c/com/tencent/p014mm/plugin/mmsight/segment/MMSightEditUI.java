package com.tencent.p014mm.plugin.mmsight.segment;

import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.plugin.mmsight.p077ui.C105562q;
import com.tencent.p014mm.plugin.mmsight.p077ui.VideoSeekBarEditorView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f72.C97842b;
import l72.C109273a;
import nj3.C88989a;
import p156gj.C107835h0;
import p206nj.C11171e;
import p248ug.C111164r0;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.mmsight.segment.MMSightEditUI */
public class MMSightEditUI extends MMActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f313564t = 0;

    /* renamed from: d */
    public ViewGroup f313565d;

    /* renamed from: e */
    public VideoPlayerTextureView f313566e;

    /* renamed from: f */
    public VideoSeekBarEditorView f313567f;

    /* renamed from: g */
    public String f313568g;

    /* renamed from: h */
    public C105562q f313569h;

    /* renamed from: i */
    public VideoTransPara f313570i;

    /* renamed from: j */
    public C96905d f313571j = new C96905d(MMApplicationContext.getContext());

    /* renamed from: n */
    public String f313572n;

    /* renamed from: o */
    public String f313573o;

    /* renamed from: p */
    public boolean f313574p = false;

    /* renamed from: q */
    public boolean f313575q = true;

    /* renamed from: r */
    public boolean f313576r = false;

    /* renamed from: s */
    public C96875r0.C96876a f313577s = new C105457b();

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.MMSightEditUI$a */
    public class C105456a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f313578d;

        public C105456a(long j) {
            this.f313578d = j;
        }

        public void run() {
            boolean z = true;
            Log.m105925i("MicroMsg.MMSightEditUI", "connect cost %sms", Long.valueOf(Util.ticksToNow(this.f313578d)));
            if (CaptureMMProxy.getInstance() != null) {
                C107835h0.m146105b(CaptureMMProxy.getInstance().getDeviceInfoConfig());
            }
            MMSightEditUI mMSightEditUI = MMSightEditUI.this;
            int i = MMSightEditUI.f313564t;
            mMSightEditUI.getClass();
            if (C75044y4.m89993e(mMSightEditUI) > 0) {
                mMSightEditUI.setSelfNavigationBarColor(-637534208);
                mMSightEditUI.setSelfNavigationBarVisible(0);
            }
            mMSightEditUI.f313565d = (ViewGroup) mMSightEditUI.findViewById(C0966R.C0970id.iwc);
            mMSightEditUI.f313566e = (VideoPlayerTextureView) mMSightEditUI.findViewById(C0966R.C0970id.l6r);
            mMSightEditUI.f313567f = (VideoSeekBarEditorView) mMSightEditUI.findViewById(C0966R.C0970id.l7e);
            mMSightEditUI.f313567f.setTextColor(mMSightEditUI.getIntent().getStringExtra("key_text_color"));
            mMSightEditUI.f313568g = mMSightEditUI.getIntent().getStringExtra("key_video_path");
            mMSightEditUI.f313570i = (VideoTransPara) mMSightEditUI.getIntent().getParcelableExtra("key_video_para");
            mMSightEditUI.f313574p = mMSightEditUI.getIntent().getBooleanExtra("key_need_clip_video_first", false);
            mMSightEditUI.f313575q = mMSightEditUI.getIntent().getBooleanExtra("key_need_remux_video", true);
            int intExtra = mMSightEditUI.getIntent().getIntExtra("key_max_duration_seconds", 0);
            Log.m105925i("MicroMsg.MMSightEditUI", "maxDurationSeconds: %s", Integer.valueOf(intExtra));
            if (!mMSightEditUI.f313575q) {
                mMSightEditUI.f313574p = true;
            }
            if (Util.isNullOrNil(mMSightEditUI.f313568g)) {
                Log.m105920e("MicroMsg.MMSightEditUI", "error!, videoPath is null!!");
                return;
            }
            if (mMSightEditUI.f313570i == null) {
                Log.m105920e("MicroMsg.MMSightEditUI", "videoTransPara is null!, use SnsAlbumVideoTransPara");
                mMSightEditUI.f313570i = CaptureMMProxy.getInstance().getSnsAlbumVideoTransPara();
            }
            if (mMSightEditUI.f313570i == null) {
                Log.m105920e("MicroMsg.MMSightEditUI", "videoTransPara still null!!!");
                mMSightEditUI.f313570i = new VideoTransPara();
            }
            if (intExtra > 0) {
                mMSightEditUI.f313570i.f267170h = intExtra;
            }
            Log.m105925i("MicroMsg.MMSightEditUI", "videoTransPara: %s", mMSightEditUI.f313570i);
            mMSightEditUI.f313566e.setAlpha(0.0f);
            mMSightEditUI.f313566e.setVideoPath(mMSightEditUI.f313568g);
            mMSightEditUI.f313566e.setLoop(true);
            mMSightEditUI.f313566e.setForceScaleFullScreen(true);
            mMSightEditUI.f313566e.setVideoCallback(mMSightEditUI.f313577s);
            mMSightEditUI.f313572n = CaptureMMProxy.getInstance().getAccVideoPath() + "vsg_output_" + System.currentTimeMillis() + ".mp4";
            mMSightEditUI.f313573o = CaptureMMProxy.getInstance().getAccVideoPath() + "vsg_thumb_" + System.currentTimeMillis() + ".jpg";
            if (C75044y4.m89993e(mMSightEditUI) <= 0) {
                z = false;
            }
            if (z) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mMSightEditUI.f313567f.getLayoutParams();
                marginLayoutParams.bottomMargin += C75044y4.m89991c(mMSightEditUI);
                mMSightEditUI.f313567f.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.MMSightEditUI$b */
    public class C105457b implements C96875r0.C96876a {

        /* renamed from: com.tencent.mm.plugin.mmsight.segment.MMSightEditUI$b$a */
        public class C105458a implements Runnable {
            public C105458a() {
            }

            public void run() {
                MMSightEditUI mMSightEditUI = MMSightEditUI.this;
                int i = MMSightEditUI.f313564t;
                mMSightEditUI.getClass();
                C105562q qVar = new C105562q();
                mMSightEditUI.f313569h = qVar;
                qVar.f314001t = true;
                qVar.f314005x = 2;
                qVar.f313981C = mMSightEditUI.f313575q;
                qVar.f313997p = new C105479d(mMSightEditUI);
                qVar.f314004w = mMSightEditUI.f313572n;
                qVar.f313980B = true;
                qVar.mo150416d(mMSightEditUI, 512, mMSightEditUI.f313568g, mMSightEditUI.f313567f, mMSightEditUI.f313566e, mMSightEditUI.f313565d, mMSightEditUI.f313570i, mMSightEditUI.f313574p);
            }
        }

        public C105457b() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            return 0;
        }

        public void onCompletion() {
            MMSightEditUI.this.f313566e.mo24787a(0.0d, true);
        }

        public void onError(int i, int i2) {
            Log.m105921e("MicroMsg.MMSightEditUI", "%d on error what %d extra %d", Integer.valueOf(MMSightEditUI.this.hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
        }

        public void onPrepared() {
            VideoPlayerTextureView videoPlayerTextureView = MMSightEditUI.this.f313566e;
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.start();
                MMSightEditUI.this.f313566e.setLoop(true);
                MMSightEditUI.this.f313566e.setAlpha(1.0f);
                MMHandlerThread.postToMainThreadDelayed(new C105458a(), 300);
            }
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359895bg0;
    }

    public void onBackPressed() {
        C105562q qVar = this.f313569h;
        if (qVar != null) {
            boolean z = false;
            if (qVar.f313981C) {
                if (qVar.f314003v) {
                    qVar.mo150415c();
                    z = true;
                } else {
                    C111164r0 r0Var = qVar.f313992k;
                    if (r0Var != null) {
                        z = r0Var.mo162896e();
                    }
                }
            }
            if (z) {
                return;
            }
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
            C97842b.f286991a = true;
        } else {
            getWindow().setFlags(1024, 1024);
            C97842b.f286991a = false;
        }
        CaptureMMProxy.createProxy(new CaptureMMProxy(this.f313571j));
        this.f313571j.mo135257a(new C105456a(Util.currentTicks()));
    }

    public void onDestroy() {
        super.onDestroy();
        VideoPlayerTextureView videoPlayerTextureView = this.f313566e;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.stop();
        }
        C105562q qVar = this.f313569h;
        if (qVar != null) {
            if (this.f313576r) {
                C109273a.m148388a(new C109273a.C109274a(qVar.f314006y));
            }
            this.f313569h.mo150417e();
        }
    }

    public void onPause() {
        super.onPause();
        VideoPlayerTextureView videoPlayerTextureView = this.f313566e;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.pause();
        }
    }

    public void onResume() {
        super.onResume();
        VideoPlayerTextureView videoPlayerTextureView = this.f313566e;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.start();
        }
    }
}
