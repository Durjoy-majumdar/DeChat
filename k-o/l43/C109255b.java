package l43;

import a43.C103310i;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b43.C104034c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.video.ObservableTextureView;
import com.tencent.p014mm.plugin.voip.model.C106343f0;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.plugin.voip.video.OpenGlView;
import com.tencent.p014mm.plugin.voip.video.p806cs.MovableVideoView;
import com.tencent.p014mm.plugin.voip.widget.VoipBigIconButton;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import k43.C108884a;
import k43.C108886d;
import k43.C108887f;
import k43.C108888g;
import kg3.C76577a;
import lu3.C88654b;
import lu3.C88656g;
import p43.C110162a;
import p43.C110163b;
import p43.C11826c;
import p567iu.C98798b;
import z33.C91617n;
import zt3.C119157j;

/* renamed from: l43.b */
public class C109255b implements View.OnClickListener, C104034c, TextureView.SurfaceTextureListener, C106343f0.C106347d {

    /* renamed from: T */
    public static int f327086T;

    /* renamed from: U */
    public static int f327087U;

    /* renamed from: V */
    public static final int[] f327088V = {-1, C0966R.string.kg6, C0966R.string.kga, C0966R.string.kg_};

    /* renamed from: A */
    public boolean f327089A = false;

    /* renamed from: B */
    public boolean f327090B = false;

    /* renamed from: C */
    public long f327091C = -1;

    /* renamed from: D */
    public boolean f327092D = false;

    /* renamed from: E */
    public C110163b f327093E = new C110163b();

    /* renamed from: F */
    public String f327094F = "";

    /* renamed from: G */
    public String f327095G = "";

    /* renamed from: H */
    public VoipBigIconButton f327096H;

    /* renamed from: I */
    public MTimerHandler f327097I = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C109256a(), false);

    /* renamed from: J */
    public MTimerHandler f327098J = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C109257b(), false);

    /* renamed from: K */
    public MTimerHandler.CallBack f327099K = new C109258c();

    /* renamed from: L */
    public MTimerHandler f327100L = new MTimerHandler(Looper.getMainLooper(), this.f327099K, true);

    /* renamed from: M */
    public View.OnClickListener f327101M = new C109259d();

    /* renamed from: N */
    public C109264i f327102N = new C109264i(this, (C109256a) null);

    /* renamed from: P */
    public C109266k f327103P;

    /* renamed from: Q */
    public C109265j f327104Q;

    /* renamed from: R */
    public String f327105R = "";

    /* renamed from: S */
    public Drawable f327106S = null;

    /* renamed from: d */
    public VoipCSMainUI f327107d;

    /* renamed from: e */
    public RelativeLayout f327108e;

    /* renamed from: f */
    public ImageButton f327109f;

    /* renamed from: g */
    public TextView f327110g;

    /* renamed from: h */
    public TextView f327111h;

    /* renamed from: i */
    public TextView f327112i;

    /* renamed from: j */
    public TextView f327113j;

    /* renamed from: n */
    public TextView f327114n;

    /* renamed from: o */
    public TextView f327115o;

    /* renamed from: p */
    public ImageView f327116p;

    /* renamed from: q */
    public View f327117q;

    /* renamed from: r */
    public OpenGlView f327118r;

    /* renamed from: s */
    public OpenGlRender f327119s;

    /* renamed from: t */
    public OpenGlView f327120t;

    /* renamed from: u */
    public OpenGlRender f327121u;

    /* renamed from: v */
    public boolean f327122v = false;

    /* renamed from: w */
    public MMHandler f327123w;

    /* renamed from: x */
    public MMHandler f327124x;

    /* renamed from: y */
    public C110162a f327125y;

    /* renamed from: z */
    public ObservableTextureView f327126z;

    /* renamed from: l43.b$a */
    public class C109256a implements MTimerHandler.CallBack {
        public C109256a() {
        }

        public boolean onTimerExpired() {
            Log.m105924i("MicroMsg.voipcs.VoipCSViewManager", "voipcs invite time out!opposite not responese");
            C108886d.vx0().f326081a = 1;
            C109255b.this.mo160487e(6);
            return true;
        }
    }

    /* renamed from: l43.b$b */
    public class C109257b implements MTimerHandler.CallBack {
        public C109257b() {
        }

        public boolean onTimerExpired() {
            C109255b.this.f327112i.setText(MMApplicationContext.getContext().getString(C0966R.string.kgc));
            C109255b.this.f327113j.setVisibility(0);
            C109255b bVar = C109255b.this;
            C110163b bVar2 = bVar.f327093E;
            TextView textView = bVar.f327113j;
            int[] iArr = C109255b.f327088V;
            bVar2.getClass();
            if (textView == null) {
                Log.m105920e("MicroMsg.DynamicTextWrap", "textList or tv is null");
                return true;
            }
            bVar2.mo161577a();
            bVar2.f329574c = 0;
            bVar2.f329572a = iArr;
            bVar2.f329573b = textView;
            MTimerHandler mTimerHandler = bVar2.f329575d;
            if (mTimerHandler != null) {
                mTimerHandler.startTimer((long) 500);
            }
            Log.printDebugStack("MicroMsg.DynamicTextWrap", "start textview:" + textView, new Object[0]);
            return true;
        }
    }

    /* renamed from: l43.b$c */
    public class C109258c implements MTimerHandler.CallBack {
        public C109258c() {
        }

        public boolean onTimerExpired() {
            C109255b bVar = C109255b.this;
            long secondsToNow = Util.secondsToNow(bVar.f327091C);
            bVar.getClass();
            C109255b.this.f327110g.setText(String.format("%02d:%02d", new Object[]{Long.valueOf(secondsToNow / 60), Long.valueOf(secondsToNow % 60)}));
            return true;
        }
    }

    /* renamed from: l43.b$d */
    public class C109259d implements View.OnClickListener {
        public C109259d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip_cs/model/device/VoipCSViewManager$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.voipcs.VoipCSViewManager", "switch camera");
            C109255b.this.f327096H.setEnabled(false);
            if (C108886d.xx0().f326118n > 1) {
                C109255b bVar = C109255b.this;
                bVar.getClass();
                Log.m105924i("MicroMsg.voipcs.VoipCSViewManager", "trigger dismiss button");
                bVar.f327123w.postDelayed(new C109267c(bVar), 10000);
            }
            C109255b.this.f327096H.setEnabled(true);
            C110162a aVar = C109255b.this.f327125y;
            if (aVar != null) {
                aVar.mo145975a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip_cs/model/device/VoipCSViewManager$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: l43.b$e */
    public class C109260e extends MMHandler {
        public C109260e() {
        }

        public void handleMessage(Message message) {
            if (message.what == 12) {
                C109255b bVar = C109255b.this;
                Drawable drawable = bVar.f327106S;
                if (drawable != null) {
                    bVar.f327116p.setImageDrawable(drawable);
                } else {
                    bVar.f327116p.setImageResource(C0966R.C0969drawable.bfa);
                }
            }
        }
    }

    /* renamed from: l43.b$f */
    public class C109261f implements View.OnClickListener {
        public C109261f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip_cs/model/device/VoipCSViewManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109255b bVar = C109255b.this;
            boolean z = !bVar.f327122v;
            bVar.f327122v = z;
            Point d = bVar.mo160486d(z);
            OpenGlView openGlView = C109255b.this.f327120t;
            int i = d.x;
            int i2 = d.y;
            MovableVideoView movableVideoView = (MovableVideoView) openGlView;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) movableVideoView.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i2);
            layoutParams2.rightMargin = layoutParams.rightMargin;
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams2.addRule(21, -1);
            movableVideoView.f117117u = i;
            movableVideoView.f117118v = i2;
            movableVideoView.setLayoutParams(layoutParams2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip_cs/model/device/VoipCSViewManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: l43.b$g */
    public class C109262g implements C88656g {
        public C109262g(C109255b bVar) {
        }

        public String getKey() {
            return "VoipCS_play_end_sound";
        }

        public void run() {
            C109254a aVar = C109254a.f327084b;
            if (aVar == null) {
                if (aVar == null) {
                    C109254a.f327084b = new C109254a();
                }
                C109254a.f327084b = C109254a.f327084b;
            }
            C103310i iVar = C109254a.f327084b.f327085a;
            if (iVar != null) {
                iVar.mo143086b("close_lower_volume", false, 0, true);
            }
        }
    }

    /* renamed from: l43.b$h */
    public class C109263h implements Runnable {
        public C109263h() {
        }

        public void run() {
            C109255b.this.f327107d.finish();
        }
    }

    /* renamed from: l43.b$i */
    public class C109264i {

        /* renamed from: a */
        public int[] f327134a;

        public C109264i(C109255b bVar, C109256a aVar) {
        }
    }

    /* renamed from: l43.b$j */
    public class C109265j extends C88654b {
        public C109265j() {
        }

        public String getKey() {
            return "VOIPCS_netPic";
        }

        public void run() {
            Drawable drawable;
            C109255b bVar = C109255b.this;
            try {
                drawable = Drawable.createFromStream((InputStream) new URL(bVar.f327105R).getContent(), "urlDrawable");
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.voipcs.VoipCSViewManager", "parse Drawable faill!");
                drawable = null;
            }
            bVar.f327106S = drawable;
            Message message = new Message();
            message.what = 12;
            C109255b.this.f327124x.sendMessage(message);
            C109255b.this.f327104Q.mo97819a();
        }
    }

    /* renamed from: l43.b$k */
    public class C109266k extends C88654b {

        /* renamed from: e */
        public boolean f327136e = false;

        /* renamed from: f */
        public byte[] f327137f = null;

        public C109266k() {
        }

        public String getKey() {
            return "VOIPCS_VideoDecode";
        }

        public void run() {
            while (!this.f327136e && !C109255b.this.f327089A) {
                if (this.f327137f == null) {
                    this.f327137f = new byte[(((C108886d.wx0().f327737a.f317623c * C108886d.wx0().f327737a.f317626d) * 3) / 2)];
                }
                if (C108886d.wx0().f327737a.videoDecode(this.f327137f) == 1) {
                    int i = C108886d.wx0().f327737a.field_remoteImgWidth;
                    int i2 = C108886d.wx0().f327737a.field_remoteImgHeight;
                    if (OpenGlRender.f318118B == 1) {
                        C109255b bVar = C109255b.this;
                        if (bVar.f327122v) {
                            bVar.f327119s.mo153104d(C108886d.wx0().f327737a.f317610W0, i, i2, 4, false);
                        } else {
                            bVar.f327121u.mo153104d(C108886d.wx0().f327737a.f317610W0, i, i2, 4, false);
                        }
                    } else {
                        C109255b bVar2 = C109255b.this;
                        if (bVar2.f327122v) {
                            bVar2.f327119s.mo153103c(this.f327137f, i, i2, 5, false, 1);
                        } else {
                            bVar2.f327121u.mo153103c(this.f327137f, i, i2, 5, false, 1);
                        }
                    }
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    Log.printErrStackTrace("MicroMsg.voipcs.VoipCSViewManager", e, "", new Object[0]);
                }
            }
        }
    }

    public C109255b(VoipCSMainUI voipCSMainUI) {
        this.f327107d = voipCSMainUI;
        WindowManager windowManager = (WindowManager) voipCSMainUI.getSystemService("window");
        int height = windowManager.getDefaultDisplay().getHeight() / 5;
        int width = (windowManager.getDefaultDisplay().getWidth() * height) / windowManager.getDefaultDisplay().getHeight();
        if (Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
            ((RelativeLayout) voipCSMainUI.findViewById(C0966R.C0970id.ivi)).setPadding(0, 0, 0, BackwardSupportUtil.BitmapFactory.fromDPToPix(voipCSMainUI.getContext(), 40.0f));
        }
        MovableVideoView movableVideoView = new MovableVideoView(voipCSMainUI.getApplicationContext(), (AttributeSet) null);
        this.f327120t = movableVideoView;
        movableVideoView.mo67523h(width, height);
        this.f327120t.setVisibility(8);
        OpenGlRender openGlRender = new OpenGlRender(this.f327120t, (OpenGlRender.C106501e) null, 1);
        this.f327121u = openGlRender;
        this.f327120t.setRenderer(openGlRender);
        this.f327120t.setRenderMode(0);
        TextView textView = (TextView) voipCSMainUI.findViewById(C0966R.C0970id.kky);
        this.f327110g = textView;
        textView.setVisibility(0);
        TextView textView2 = (TextView) voipCSMainUI.findViewById(C0966R.C0970id.lce);
        this.f327111h = textView2;
        textView2.setVisibility(0);
        this.f327112i = (TextView) voipCSMainUI.findViewById(C0966R.C0970id.lcj);
        if (voipCSMainUI.f318251r.equals("1")) {
            if (voipCSMainUI.f318252s.equals("video")) {
                this.f327112i.setText(MMApplicationContext.getContext().getString(C0966R.string.kfp));
            } else {
                this.f327112i.setText(MMApplicationContext.getContext().getString(C0966R.string.kfq));
            }
        } else if (voipCSMainUI.f318252s.equals("video")) {
            this.f327112i.setText(MMApplicationContext.getContext().getString(C0966R.string.kfr));
        } else {
            this.f327112i.setText(MMApplicationContext.getContext().getString(C0966R.string.kfq));
        }
        this.f327112i.setVisibility(0);
        TextView textView3 = (TextView) voipCSMainUI.findViewById(C0966R.C0970id.lcm);
        this.f327114n = textView3;
        textView3.setVisibility(0);
        ImageView imageView = (ImageView) voipCSMainUI.findViewById(C0966R.C0970id.lcf);
        this.f327116p = imageView;
        imageView.setVisibility(0);
        this.f327115o = (TextView) voipCSMainUI.findViewById(C0966R.C0970id.lci);
        this.f327113j = (TextView) voipCSMainUI.findViewById(C0966R.C0970id.lck);
        this.f327096H = (VoipBigIconButton) voipCSMainUI.findViewById(C0966R.C0970id.lcg);
        String str = voipCSMainUI.f318248o;
        if (str == null || !str.equals("1")) {
            this.f327096H.setVisibility(8);
        } else {
            this.f327096H.setVisibility(0);
            this.f327096H.setOnClickListener(this.f327101M);
        }
        this.f327123w = new MMHandler();
        this.f327124x = new C109260e();
        this.f327117q = voipCSMainUI.findViewById(C0966R.C0970id.lcb);
        this.f327109f = (ImageButton) voipCSMainUI.findViewById(C0966R.C0970id.lch);
        this.f327108e = (RelativeLayout) voipCSMainUI.findViewById(C0966R.C0970id.lcb);
        f327086T = C76577a.m92145A(voipCSMainUI.getContext());
        AppCompatActivity context = voipCSMainUI.getContext();
        if (C11826c.f34581a == 0) {
            C11826c.f34581a = C76577a.m92159j(context);
        }
        f327087U = C11826c.f34581a;
        OpenGlView openGlView = (OpenGlView) voipCSMainUI.findViewById(C0966R.C0970id.lcc);
        this.f327118r = openGlView;
        openGlView.mo67520f(f327086T, f327087U);
        OpenGlRender openGlRender2 = new OpenGlRender(this.f327118r, (OpenGlRender.C106501e) null, 0);
        this.f327119s = openGlRender2;
        this.f327118r.setRenderer(openGlRender2);
        this.f327118r.setRenderMode(0);
        this.f327118r.setVisibility(0);
        Log.m105925i("MicroMsg.voipcs.VoipCSViewManager", "mScreenHeight %d", Integer.valueOf(f327087U));
        this.f327109f.setOnClickListener(this);
        this.f327108e.addView(this.f327120t);
        this.f327120t.setOnClickListener(new C109261f());
        OpenGlRender openGlRender3 = this.f327121u;
        openGlRender3.f318125b = true;
        openGlRender3.mo153109j();
        OpenGlRender openGlRender4 = this.f327119s;
        openGlRender4.f318125b = true;
        openGlRender4.mo153109j();
        if (!C91617n.m114964b(MMApplicationContext.getContext())) {
            C91617n.m114965c(MMApplicationContext.getContext());
        }
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        this.f327094F = defaultPreference.getString("voip_cs_headImageUrl_" + this.f327107d.f318245i, "");
        String str2 = this.f327107d.f318247n;
        if (str2 != null && !str2.equals("")) {
            mo160488f(this.f327107d.f318247n);
        } else if (!Util.isNullOrNil(this.f327094F)) {
            mo160488f(this.f327094F);
        }
        String string = defaultPreference.getString("voip_cs_nickname_" + this.f327107d.f318245i, "");
        this.f327095G = string;
        if (!Util.isNullOrNil(string)) {
            mo160489g(this.f327095G);
        }
        C108888g xx02 = C108886d.xx0();
        String str3 = this.f327107d.f318245i;
        xx02.getClass();
        Log.m105918d("MicroMsg.voipcs.VoipCSService", "start getBizInfo for username:" + str3);
        C86709a0.m107524d().mo123455a(106, xx02);
        C86709a0.m107524d().mo123460f(((C98798b) C86312j.m106911c(C98798b.class)).mo71568Fm(str3));
    }

    /* renamed from: D */
    public /* synthetic */ void mo145645D(int i) {
    }

    /* renamed from: H */
    public void mo150057H(boolean z) {
        this.f327115o.setVisibility(0);
        this.f327115o.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        this.f327115o.setBackgroundResource(C0966R.C0969drawable.cdx);
        this.f327115o.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f327115o.setCompoundDrawablePadding(0);
        this.f327115o.setText(mo160485a(1001));
    }

    /* renamed from: I */
    public void mo145646I(byte[] bArr, long j, int i, int i2, int i3, int i4, double d) {
        int i5;
        int i6;
        Log.m105918d("MicroMsg.voipcs.VoipCSViewManager", "receive frame data , isPause : " + this.f327089A);
        if (!this.f327089A) {
            C109264i iVar = this.f327102N;
            if (iVar.f327134a == null) {
                iVar.f327134a = new int[(i * i2)];
            }
            C110162a aVar = this.f327125y;
            if (aVar.f308666d) {
                int i7 = OpenGlRender.f318118B;
                i5 = 16;
            } else {
                i5 = 0;
            }
            if (aVar.f308667e) {
                int i8 = OpenGlRender.f318118B;
                i6 = 12;
            } else {
                int i9 = OpenGlRender.f318118B;
                i6 = 4;
            }
            if (this.f327092D) {
                int videoEncodeToSend = C108886d.wx0().f327737a.videoEncodeToSend(bArr, bArr.length, i, i2, i3 + i4);
                Log.m105918d("MicroMsg.voipcs.VoipCSViewManager", "videoEncodeToSend , ret = " + videoEncodeToSend);
                C108884a aVar2 = C108886d.wx0().f327737a;
                aVar2.f317679u1 = aVar2.f317679u1 + 1;
            } else {
                byte[] bArr2 = bArr;
            }
            C108886d.wx0().f327737a.videoEncodeToLocal(bArr, (int) j, i, i2, i3 + i4, 0, 75, this.f327102N.f327134a);
            int i15 = OpenGlRender.f318118B;
            if (i15 == 1) {
                if (this.f327122v) {
                    this.f327121u.mo153104d(this.f327102N.f327134a, i, i2, i5 + 1 + i6, false);
                    return;
                }
                this.f327119s.mo153104d(this.f327102N.f327134a, i, i2, i5 + 1 + i6, false);
            } else if (i15 != 2) {
            } else {
                if (this.f327122v) {
                    this.f327121u.mo153103c(bArr, i, i2, i5 + 3 + i6, false, 3);
                    return;
                }
                this.f327119s.mo153103c(bArr, i, i2, i5 + 3 + i6, false, 3);
            }
        }
    }

    /* renamed from: a */
    public final int mo160485a(int i) {
        return i == 1 ? C0966R.string.kfm : i == 0 ? C0966R.string.kft : (i == -1 || i == 5) ? C0966R.string.f360087a11 : (i == 403 || i == 404) ? C0966R.string.kgb : i == 6 ? C0966R.string.kg7 : i == 1001 ? C0966R.string.f361518kg3 : i == 10 ? C0966R.string.kfs : C108886d.xx0().f326118n < 2 ? C0966R.string.kfk : C0966R.string.kft;
    }

    /* renamed from: b */
    public void mo150059b() {
        this.f327115o.setVisibility(8);
    }

    /* renamed from: c */
    public /* synthetic */ void mo145647c(int i) {
    }

    /* renamed from: d */
    public final Point mo160486d(boolean z) {
        byte[] bArr;
        int height = ((WindowManager) this.f327107d.getSystemService("window")).getDefaultDisplay().getHeight() / 5;
        float f = (float) height;
        boolean z2 = !z;
        float f2 = 0.74766356f;
        if (z2) {
            try {
                bArr = C108886d.wx0().f327737a.field_capInfo;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.voipcs.VoipCSViewManager", "update failed: " + e.getMessage());
            }
        } else {
            bArr = C108886d.wx0().f327737a.f317674t;
        }
        if (bArr != null) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            if (wrap.getInt() > 65535) {
                wrap.order(ByteOrder.LITTLE_ENDIAN);
            }
            wrap.getShort();
            wrap.getShort();
            float f3 = ((float) wrap.getInt()) / 100.0f;
            if (f3 != 0.0f) {
                f2 = f3;
            }
            Log.m105919d("MicroMsg.voipcs.VoipCSViewManager", "use rate: %s, changed: %s", Float.valueOf(f2), Boolean.valueOf(z2));
        }
        return new Point((int) (f * f2), height);
    }

    /* renamed from: e */
    public void mo160487e(int i) {
        Log.m105924i("MicroMsg.voipcs.VoipCSViewManager", "onRefreshed for action:" + i);
        MTimerHandler mTimerHandler = this.f327100L;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f327100L = null;
        }
        if (!this.f327097I.stopped()) {
            this.f327097I.stopTimer();
        }
        if (!this.f327098J.stopped()) {
            this.f327098J.stopTimer();
        }
        this.f327093E.mo161577a();
        this.f327090B = false;
        this.f327115o.setVisibility(0);
        this.f327115o.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        this.f327115o.setBackgroundResource(C0966R.C0969drawable.cdx);
        this.f327115o.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f327115o.setCompoundDrawablePadding(0);
        this.f327115o.setText(mo160485a(i));
        if (C108886d.xx0().f326118n == 2) {
            ((C119157j) C119157j.f356862d).mo183875f(new C109262g(this));
        }
        this.f327123w.postDelayed(new C109263h(), 2000);
    }

    /* renamed from: f */
    public final void mo160488f(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f327104Q = new C109265j();
            String str2 = this.f327107d.f318247n;
            if (str2 == null || str2.equals("")) {
                this.f327105R = str;
            } else {
                this.f327105R = this.f327107d.f318247n;
            }
            ((C119157j) C119157j.f356862d).mo183875f(this.f327104Q);
        }
    }

    /* renamed from: g */
    public final void mo160489g(String str) {
        String str2;
        if (this.f327107d.f318253t) {
            str2 = str + MMApplicationContext.getContext().getString(C0966R.string.kfg);
        } else {
            str2 = str + MMApplicationContext.getContext().getString(C0966R.string.kfh);
        }
        this.f327114n.setText(str2);
    }

    /* renamed from: h */
    public final void mo160490h(int i) {
        String str = this.f327107d.f318248o;
        if (str == null || !str.equals("1")) {
            this.f327096H.setVisibility(8);
        } else {
            this.f327096H.setVisibility(i);
        }
    }

    /* renamed from: i */
    public final void mo160491i(boolean z) {
        if (Build.MANUFACTURER.equalsIgnoreCase("sony")) {
            Log.m105924i("MicroMsg.voipcs.VoipCSViewManager", "sony is not compatible,so we return.");
        } else if (!z) {
            this.f327107d.getWindow().setFlags(1024, 1024);
        } else {
            this.f327107d.getWindow().clearFlags(1024);
        }
    }

    /* renamed from: j */
    public void mo160492j() {
        Log.m105924i("MicroMsg.voipcs.VoipCSViewManager", "stop capture render");
        ObservableTextureView observableTextureView = this.f327126z;
        if (observableTextureView != null) {
            this.f327108e.removeView(observableTextureView);
            this.f327126z = null;
        }
        C110162a aVar = this.f327125y;
        if (aVar != null) {
            aVar.mo145981i();
            this.f327125y.getClass();
            this.f327125y = null;
        }
    }

    /* renamed from: k */
    public void mo145648k() {
        Log.m105920e("MicroMsg.voipcs.VoipCSViewManager", "init camera fail！");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip_cs/model/device/VoipCSViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = true;
        if (view.getId() == C0966R.C0970id.lch) {
            if (C108886d.xx0().f326118n < 2) {
                C108886d.vx0().f326081a = 2;
            } else {
                C108886d.vx0().f326081a = 4;
            }
            C108887f vx02 = C108886d.vx0();
            vx02.f326085c = 1;
            vx02.f326059E = 1;
            vx02.f326087d = (int) (System.currentTimeMillis() / 1000);
            C108887f vx03 = C108886d.vx0();
            vx03.getClass();
            Log.m105918d("MicroMsg.VoipCSReportHelper", "selfCancel");
            if (vx03.f326056B == 0) {
                vx03.f326106v = 3;
                if (vx03.f326060F == 0 && vx03.f326077W != 0) {
                    vx03.f326060F = (long) (((int) (System.currentTimeMillis() / 1000)) - vx03.f326077W);
                }
            }
            C108886d.vx0().mo160019a();
            Log.m105918d("MicroMsg.voipcs.VoipCSViewManager", "user click hangup button!");
            mo160487e(0);
        } else {
            int i = this.f327109f.getVisibility() == 0 ? 8 : 0;
            this.f327109f.setVisibility(i);
            this.f327110g.setVisibility(i);
            this.f327111h.setVisibility(i);
            mo160490h(i);
            if (i != 0) {
                z = false;
            }
            mo160491i(z);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip_cs/model/device/VoipCSViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: r */
    public void mo150072r() {
    }

    /* renamed from: t */
    public /* synthetic */ void mo145649t(int i, int i2) {
    }

    /* renamed from: w */
    public void mo150073w() {
    }
}
