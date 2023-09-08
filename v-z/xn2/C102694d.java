package xn2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UIStatusChangedEvent;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSurfaceView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import eb0.C97621e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p206nj.C11171e;
import p206nj.C76861g;
import p500dy.C97560f;
import qo3.C77390c0;

/* renamed from: xn2.d */
public class C102694d extends C77390c0 implements C97621e.C97622a {

    /* renamed from: o */
    public static final /* synthetic */ int f303307o = 0;

    /* renamed from: d */
    public C96875r0 f303308d = null;

    /* renamed from: e */
    public TextView f303309e = null;

    /* renamed from: f */
    public String f303310f;

    /* renamed from: g */
    public String f303311g;

    /* renamed from: h */
    public int f303312h = 0;

    /* renamed from: i */
    public int f303313i = 0;

    /* renamed from: j */
    public int f303314j = 0;

    /* renamed from: n */
    public C97621e f303315n = new C97621e();

    /* renamed from: xn2.d$a */
    public class C102695a implements C96875r0.C96876a {

        /* renamed from: xn2.d$a$a */
        public class C15867a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f42717d;

            public C15867a(Bitmap bitmap, String str) {
                this.f42717d = str;
            }

            public void run() {
                ((ImageView) C102694d.this.findViewById(C0966R.C0970id.f359495l82)).setVisibility(0);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                FileProviderHelper.setIntentDataAndType(C102694d.this.getContext(), intent, new C86009m1(this.f42717d), "video/*", false);
                try {
                    Context context = C102694d.this.getContext();
                    Intent createChooser = Intent.createChooser(intent, C102694d.this.getContext().getString(C0966R.string.a44));
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(createChooser);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.VideoPopupHelper", "startActivity fail, activity not found");
                    C76879j.m92738i(C102694d.this.getContext(), C0966R.string.h9s, C0966R.string.h9t);
                }
            }
        }

        /* renamed from: xn2.d$a$b */
        public class C102696b implements Runnable {
            public C102696b() {
            }

            public void run() {
                C102694d.this.f303309e.setVisibility(0);
                C102694d dVar = C102694d.this;
                dVar.f303309e.startAnimation(AnimationUtils.loadAnimation(dVar.getContext(), C0966R.C0968anim.f2393bw));
            }
        }

        public C102695a() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            return 0;
        }

        public void onCompletion() {
            Log.m105918d("MicroMsg.VideoPopupHelper", "on completion");
            C102694d.this.f303309e.post(new C102696b());
            C102694d.this.f303308d.setLoop(true);
            C102694d dVar = C102694d.this;
            if (!dVar.f303308d.start()) {
                dVar.mo142502c();
            } else {
                dVar.f303315n.mo136891c(dVar);
            }
        }

        public void onError(int i, int i2) {
            Log.m105921e("MicroMsg.VideoPopupHelper", "on play video error, what %d extra %d", Integer.valueOf(i), Integer.valueOf(i2));
            C102694d.this.f303308d.stop();
            CrashReportFactory.reportRawMessage(Base64.encodeToString((((C97560f) C86312j.m106911c(C97560f.class)).mo136822Ww() + "[SightPopupHelper] on play video error, what " + i + " extra " + i2 + ", path=" + Util.nullAs(C102694d.this.f303311g, "")).getBytes(), 2), "FullScreenPlaySight");
            MMHandlerThread.postToMainThread(new C15867a((Bitmap) null, C102694d.this.f303311g));
        }

        public void onPrepared() {
            Log.m105918d("MicroMsg.VideoPopupHelper", C76861g.m92659b() + " onPrepared");
            C102694d dVar = C102694d.this;
            if (!dVar.f303308d.start()) {
                dVar.mo142502c();
            } else {
                dVar.f303315n.mo136891c(dVar);
            }
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    /* renamed from: xn2.d$b */
    public class C102697b implements View.OnClickListener {
        public C102697b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102694d dVar = C102694d.this;
            int i = C102694d.f303307o;
            dVar.mo142502c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xn2.d$c */
    public class C102698c implements View.OnClickListener {
        public C102698c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102694d dVar = C102694d.this;
            int i = C102694d.f303307o;
            dVar.mo142502c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xn2.d$d */
    public class C102699d implements Runnable {
        public C102699d() {
        }

        public void run() {
            C102694d.this.dismiss();
        }
    }

    public C102694d(Context context) {
        super(context, C0966R.style.a7c);
    }

    /* renamed from: I2 */
    public void mo23179I2() {
    }

    /* renamed from: N3 */
    public void mo23180N3() {
    }

    /* renamed from: R0 */
    public void mo23181R0() {
    }

    /* renamed from: c */
    public final void mo142502c() {
        Log.m105926v("check", "onclick");
        if (this.f303308d.isPlaying()) {
            this.f303308d.pause();
            this.f303315n.mo136889a();
        }
        new MMHandler().post(new C102699d());
    }

    public void dismiss() {
        Log.m105918d("MicroMsg.VideoPopupHelper", "on dismiss");
        if (C92614a.m116679d() != null) {
            C92614a.m116679d().mo126635b();
        }
        C96875r0 r0Var = this.f303308d;
        if (r0Var != null) {
            r0Var.setVideoCallback((C96875r0.C96876a) null);
            this.f303308d.stop();
            this.f303308d.onDetach();
            findViewById(C0966R.C0970id.f359485l50).setOnClickListener((View.OnClickListener) null);
        }
        if (isShowing()) {
            UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
            UIStatusChangedEvent.C67803a aVar = uIStatusChangedEvent.f193971d;
            aVar.f193972a = 0;
            aVar.f193973b = this.f303313i;
            aVar.f193974c = this.f303314j;
            aVar.f193975d = this.f303312h;
            uIStatusChangedEvent.publish();
        }
        super.dismiss();
        this.f303315n.mo136890b(true);
    }

    /* renamed from: f2 */
    public void mo23185f2() {
    }

    public void onCreate(Bundle bundle) {
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105918d("MicroMsg.VideoPopupHelper", currentTimeMillis + " initView beg");
        super.onCreate(bundle);
        getWindow().setFlags(TPMediaCodecProfileLevel.HEVCMainTierLevel62, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        setContentView(C0966R.C0971layout.bz5);
        if (C92614a.m116679d() != null) {
            C92614a.m116679d().mo126634a();
        }
        Log.m105918d("MicroMsg.VideoPopupHelper", C76861g.m92659b() + " initView: fullpath:" + this.f303310f + ", imagepath:" + this.f303311g);
        this.f303309e = (TextView) findViewById(C0966R.C0970id.knp);
        View findViewById = findViewById(C0966R.C0970id.jjx);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.f359485l50);
        viewGroup.setBackgroundResource(C0966R.color.f3131gg);
        Log.m105924i("MicroMsg.VideoPopupHelper", "getVideoView, is normal video");
        if (C11171e.m11046c(14)) {
            this.f303308d = new VideoTextureView(getContext(), (AttributeSet) null);
        } else {
            this.f303308d = new VideoSurfaceView(getContext(), (AttributeSet) null);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        viewGroup.addView((View) this.f303308d, layoutParams);
        this.f303308d.setVideoCallback(new C102695a());
        findViewById(C0966R.C0970id.f359485l50).setOnClickListener(new C102697b());
        ((View) this.f303308d).setOnClickListener(new C102698c());
        if (this.f303310f != null) {
            this.f303308d.stop();
            this.f303308d.setVideoPath(this.f303310f);
        }
        Log.m105918d("MicroMsg.VideoPopupHelper", (System.currentTimeMillis() - currentTimeMillis) + " initView end");
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        uIStatusChangedEvent.f193971d.f193972a = 1;
        uIStatusChangedEvent.publish();
    }
}
