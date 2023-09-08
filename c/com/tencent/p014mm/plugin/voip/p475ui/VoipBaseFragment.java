package com.tencent.p014mm.plugin.voip.p475ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.p136ui.C85811a5;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l33.C109247e;
import lu3.C88654b;
import p196ln.C76708i;
import tj3.C111011i;
import y33.C112390a;
import z33.C112604l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment */
public abstract class VoipBaseFragment extends HellAndroidXFragment implements C112390a {

    /* renamed from: G */
    public static final int[] f317906G = {-1, C0966R.string.f361525ki3, C0966R.string.f361528kj3, C0966R.string.f361526kj1};

    /* renamed from: H */
    public static int f317907H = -1;

    /* renamed from: I */
    public static int f317908I;

    /* renamed from: J */
    public static int f317909J;

    /* renamed from: A */
    public FrameLayout f317910A;

    /* renamed from: B */
    public C106444e0 f317911B = new C106444e0(this);

    /* renamed from: C */
    public FrameLayout f317912C;

    /* renamed from: D */
    public C106476z f317913D = new C106476z(this);

    /* renamed from: E */
    public FrameLayout f317914E;

    /* renamed from: F */
    public Runnable f317915F = new C106428b();

    /* renamed from: d */
    public String f317916d;

    /* renamed from: e */
    public boolean f317917e;

    /* renamed from: f */
    public MMHandler f317918f;

    /* renamed from: g */
    public RelativeLayout f317919g;

    /* renamed from: h */
    public ImageView f317920h;

    /* renamed from: i */
    public ImageView f317921i;

    /* renamed from: j */
    public long f317922j = -1;

    /* renamed from: n */
    public int f317923n = 4096;

    /* renamed from: o */
    public int f317924o = -1;

    /* renamed from: p */
    public View f317925p;

    /* renamed from: q */
    public View f317926q;

    /* renamed from: r */
    public TextView f317927r;

    /* renamed from: s */
    public ImageView f317928s;

    /* renamed from: t */
    public boolean f317929t = false;

    /* renamed from: u */
    public C106436g f317930u;

    /* renamed from: v */
    public WeakReference<C106448g> f317931v;

    /* renamed from: w */
    public C106430d f317932w;

    /* renamed from: x */
    public C106432e f317933x;

    /* renamed from: y */
    public C111011i f317934y;

    /* renamed from: z */
    public C106475y f317935z = new C106475y();

    /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$a */
    public class C106427a implements View.OnClickListener {
        public C106427a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoipBaseFragment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (VoipBaseFragment.this.f317919g.findViewById(C0966R.C0970id.has) != null) {
                VoipBaseFragment.this.f317931v.get().mo152451V(1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoipBaseFragment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$b */
    public class C106428b implements Runnable {
        public C106428b() {
        }

        public void run() {
            if (VoipBaseFragment.this.getActivity() != null && !VoipBaseFragment.this.getActivity().isFinishing()) {
                if (VoipBaseFragment.this.f317919g.findViewById(C0966R.C0970id.has) != null) {
                    VoipBaseFragment.this.f317919g.findViewById(C0966R.C0970id.has).setOnClickListener((View.OnClickListener) null);
                }
                VoipBaseFragment voipBaseFragment = VoipBaseFragment.this;
                voipBaseFragment.f317929t = false;
                voipBaseFragment.f317927r.setVisibility(8);
                VoipBaseFragment.this.f317928s.setVisibility(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$c */
    public class C106429c implements C85878m2.C85879a {
        public C106429c() {
        }

        /* renamed from: a */
        public void mo4167a() {
            C106444e0 e0Var = VoipBaseFragment.this.f317911B;
            if (e0Var != null) {
                e0Var.mo152999b(0);
            }
        }

        /* renamed from: b */
        public void mo4168b() {
            C106444e0 e0Var = VoipBaseFragment.this.f317911B;
            if (e0Var != null) {
                e0Var.mo152999b(2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$d */
    public class C106430d extends C88654b {

        /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$d$a */
        public class C106431a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f317940d;

            public C106431a(Bitmap bitmap) {
                this.f317940d = bitmap;
            }

            public void run() {
                ImageView imageView = VoipBaseFragment.this.f317920h;
                if (imageView != null) {
                    imageView.setBackgroundDrawable(new BitmapDrawable(this.f317940d));
                    VoipBaseFragment.this.f317920h.getBackground().setAlpha(128);
                }
                VoipBaseFragment.this.f317932w = null;
            }
        }

        public C106430d() {
        }

        public String getKey() {
            return "VoipBaseFragment_blurbitmap";
        }

        public void run() {
            Log.m105924i("MicroMsg.VoipBaseFragment", "try load blur bitmap,timestamp: " + System.currentTimeMillis());
            Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(VoipBaseFragment.this.f317916d);
            if (N50 != null && VoipBaseFragment.this.f317919g != null) {
                int i = 0;
                while (true) {
                    if ((VoipBaseFragment.this.f317919g.getHeight() == 0 || VoipBaseFragment.this.f317919g.getWidth() == 0) && i < 10) {
                        try {
                            Thread.sleep(300);
                            i++;
                        } catch (InterruptedException unused) {
                            Log.m105920e("MicroMsg.VoipBaseFragment", "wait voip initialize interrupted");
                            return;
                        }
                    }
                }
                if (N50.getHeight() <= N50.getWidth() && N50.getHeight() / 5 > 0 && ((int) (((double) N50.getHeight()) * 0.6d)) > 0) {
                    N50 = Bitmap.createBitmap(N50, N50.getWidth() / 5, N50.getHeight() / 5, (int) (((double) N50.getHeight()) * 0.6d), (int) (((double) N50.getHeight()) * 0.6d), (Matrix) null, false);
                }
                Bitmap extractThumbNail = BitmapUtil.extractThumbNail(N50, N50.getHeight(), (int) (((float) N50.getHeight()) / (((float) C85875k4.m106184h(MMApplicationContext.getContext()).y) / ((float) C85875k4.m106184h(MMApplicationContext.getContext()).x))), true, false);
                if (extractThumbNail == null) {
                    Log.m105920e("MicroMsg.VoipBaseFragment", "extract Thumb Nail for blur background failed");
                    return;
                }
                try {
                    Bitmap fastblur = BitmapUtil.fastblur(extractThumbNail, 20);
                    Log.m105924i("MicroMsg.VoipBaseFragment", "blur ok, timestamp: " + System.currentTimeMillis());
                    VoipBaseFragment.this.f317918f.post(new C106431a(fastblur));
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.VoipBaseFragment", "fastblur failed: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$e */
    public class C106432e extends C88654b {

        /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$e$a */
        public class C106433a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f317943d;

            public C106433a(Bitmap bitmap) {
                this.f317943d = bitmap;
            }

            public void run() {
                ImageView imageView = VoipBaseFragment.this.f317921i;
                if (imageView != null) {
                    imageView.setBackgroundDrawable(new BitmapDrawable(this.f317943d));
                    VoipBaseFragment.this.f317921i.getBackground().setAlpha(230);
                    VoipBaseFragment.this.f317921i.getBackground().setFilterBitmap(true);
                }
                VoipBaseFragment.this.f317933x = null;
            }
        }

        public C106432e() {
        }

        public String getKey() {
            return "VoipBaseFragment_blurtransparentbitmap";
        }

        public void run() {
            Log.m105924i("MicroMsg.VoipBaseFragment", "try create blur bitmap,timestamp: " + System.currentTimeMillis());
            Bitmap bitmapNative = BitmapUtil.getBitmapNative((int) C0966R.C0969drawable.ced);
            Log.m105924i("MicroMsg.VoipBaseFragment", "blur transparent ok, timestamp: " + System.currentTimeMillis());
            VoipBaseFragment.this.f317918f.post(new C106433a(bitmapNative));
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$f */
    public static class C106434f {

        /* renamed from: a */
        public int[] f317945a;

        /* renamed from: b */
        public TextView f317946b;

        /* renamed from: c */
        public int f317947c;

        /* renamed from: d */
        public MTimerHandler f317948d = new MTimerHandler(new C106435a(), true);

        /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$f$a */
        public class C106435a implements MTimerHandler.CallBack {
            public C106435a() {
            }

            public boolean onTimerExpired() {
                C106434f fVar = C106434f.this;
                int[] iArr = fVar.f317945a;
                int i = iArr[fVar.f317947c % iArr.length];
                TextView textView = fVar.f317946b;
                if (textView != null) {
                    if (-1 == i) {
                        textView.setText((CharSequence) null);
                    } else {
                        textView.setText(i);
                    }
                }
                C106434f.this.f317947c++;
                return true;
            }
        }

        /* renamed from: a */
        public void mo152984a(TextView textView, int[] iArr, int i) {
            if (iArr == null || textView == null) {
                Log.m105920e("MicroMsg.DynamicTextWrap", "textList or tv is null");
                return;
            }
            mo152985b();
            this.f317947c = 0;
            this.f317945a = iArr;
            this.f317946b = textView;
            MTimerHandler mTimerHandler = this.f317948d;
            if (mTimerHandler != null) {
                mTimerHandler.startTimer((long) i);
            }
            Log.printDebugStack("MicroMsg.DynamicTextWrap", "start textview:" + textView, new Object[0]);
        }

        /* renamed from: b */
        public void mo152985b() {
            MTimerHandler mTimerHandler = this.f317948d;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            Log.printDebugStack("MicroMsg.DynamicTextWrap", "stop textview: " + this.f317946b, new Object[0]);
            this.f317946b = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VoipBaseFragment$g */
    public interface C106436g {
        /* renamed from: f0 */
        void mo152925f0(boolean z, boolean z2);
    }

    /* renamed from: K */
    public String mo152971K() {
        long secondsToNow = Util.secondsToNow(this.f317922j);
        return String.format(MMApplicationContext.getString(C0966R.string.f361527kj2), new Object[]{Long.valueOf(secondsToNow / 60), Long.valueOf(secondsToNow % 60)});
    }

    /* renamed from: L */
    public abstract void mo152879L();

    /* renamed from: M */
    public String mo152972M(long j) {
        return String.format("%02d:%02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)});
    }

    /* renamed from: N */
    public boolean mo152973N() {
        return this instanceof NewVoipVideoFragment;
    }

    /* renamed from: O */
    public void mo152880O(int i) {
    }

    /* renamed from: P */
    public void mo152974P(int i) {
        boolean z;
        C109247e.xx0().getClass();
        if (v2protocal.f317539Z1 < 900 || v2protocal.f317538Y1) {
            z = false;
        } else {
            z = true;
            v2protocal.f317538Y1 = true;
        }
        if (z) {
            this.f317928s.setVisibility(8);
            this.f317927r.setVisibility(0);
            if (this.f317919g.findViewById(C0966R.C0970id.has) != null) {
                this.f317919g.findViewById(C0966R.C0970id.has).setOnClickListener(new C106427a());
            }
            this.f317927r.setText(C0966R.string.kem);
            this.f317918f.removeCallbacks(this.f317915F);
            this.f317918f.postDelayed(this.f317915F, (long) (i * 1000));
        }
    }

    /* renamed from: Q */
    public void mo152881Q() {
    }

    /* renamed from: R */
    public void mo152882R(int i) {
    }

    /* renamed from: S */
    public abstract void mo152883S(boolean z);

    /* renamed from: T */
    public void mo152884T(int i, int i2) {
        Log.printInfoStack("MicroMsg.VoipBaseFragment", "newState: " + C112604l.m153981d(i2) + ", action: " + C112604l.m153981d(i) + ", lastStatus: " + C112604l.m153981d(f317907H), new Object[0]);
        int i3 = f317907H;
        int i4 = this.f317924o;
        if (!(i3 == i4 || i2 == i4)) {
            f317907H = i4;
        }
        this.f317923n = i;
        this.f317924o = i2;
    }

    /* renamed from: U */
    public abstract void mo152885U(Point point);

    /* renamed from: V */
    public abstract void mo152886V(int i);

    /* renamed from: X */
    public abstract void mo152887X(boolean z);

    /* renamed from: Y */
    public void mo152975Y() {
        if (this.f317916d != null && this.f317920h.getVisibility() != 0) {
            this.f317920h.setVisibility(0);
            C106430d dVar = new C106430d();
            this.f317932w = dVar;
            ((C119157j) C119157j.f356862d).mo183875f(dVar);
        }
    }

    /* renamed from: Z */
    public abstract void mo152888Z(int i, int i2);

    /* renamed from: a0 */
    public void mo152976a0(int i) {
        if (this.f317927r != null) {
            this.f317929t = true;
            if (this.f317919g.findViewById(C0966R.C0970id.has) != null) {
                this.f317919g.findViewById(C0966R.C0970id.has).setOnClickListener(new C106451i0(this));
            }
            this.f317928s.setVisibility(0);
            this.f317927r.setVisibility(0);
            this.f317927r.setText(C0966R.string.keq);
            this.f317918f.removeCallbacks(this.f317915F);
            this.f317918f.postDelayed(this.f317915F, (long) (i * 1000));
        }
    }

    /* renamed from: d0 */
    public abstract void mo152889d0(String str);

    /* renamed from: e0 */
    public void mo152890e0() {
        Log.m105918d("MicroMsg.VoipBaseFragment", "uninit");
        C106430d dVar = this.f317932w;
        if (dVar != null) {
            dVar.mo97819a();
            this.f317932w = null;
        }
        C106432e eVar = this.f317933x;
        if (eVar != null) {
            eVar.mo97819a();
            this.f317933x = null;
        }
        this.f317913D = null;
        this.f317911B = null;
        C106475y yVar = this.f317935z;
        if (yVar != null) {
            yVar.f318028g.mo152985b();
            C106434f fVar = yVar.f318028g;
            fVar.getClass();
            Log.m105918d("MicroMsg.DynamicTextWrap", "uninit");
            fVar.mo152985b();
            fVar.f317948d = null;
            this.f317935z = null;
        }
    }

    /* renamed from: f0 */
    public void mo152977f0() {
        WeImageView weImageView;
        C85811a5.m106025b(getActivity());
        if (C85875k4.m106208w() || C85985z2.m106332d(getActivity().getTaskId())) {
            int i = C85875k4.m106209x(getActivity().getTaskId()) ? 2 : 0;
            C106444e0 e0Var = this.f317911B;
            if (e0Var != null) {
                e0Var.mo152999b(i);
                return;
            }
            return;
        }
        C106444e0 e0Var2 = this.f317911B;
        if (e0Var2 != null && (weImageView = e0Var2.f317978d) != null) {
            weImageView.setVisibility(8);
        }
    }

    public int getLayoutId() {
        return 0;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (Build.VERSION.SDK_INT >= 23) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f317908I = displayMetrics.widthPixels;
            f317909J = displayMetrics.heightPixels;
        } else if (f317908I == 0) {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            f317908I = defaultDisplay2.getWidth();
            f317909J = defaultDisplay2.getHeight();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f317916d = arguments.getString("key_username");
        this.f317917e = arguments.getBoolean("key_isoutcall");
        if (-1 == this.f317924o) {
            this.f317924o = arguments.getInt("key_status");
        }
        this.f317918f = new MMHandler();
        this.f317934y = new C111011i(getContext());
    }

    /* JADX WARNING: type inference failed for: r1v29, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            int r0 = r10.getLayoutId()
            r1 = 0
            android.view.View r0 = r11.inflate(r0, r12, r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r10.f317919g = r0
            r2 = 2131315495(0x7f094b27, float:1.8249445E38)
            android.view.View r0 = r0.findViewById(r2)
            r10.f317925p = r0
            android.widget.RelativeLayout r0 = r10.f317919g
            r2 = 2131298190(0x7f09078e, float:1.8214346E38)
            android.view.View r0 = r0.findViewById(r2)
            r10.f317926q = r0
            android.widget.RelativeLayout r0 = r10.f317919g
            r2 = 2131297467(0x7f0904bb, float:1.821288E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.f317910A = r0
            if (r0 == 0) goto L_0x0046
            r0.removeAllViews()
            com.tencent.mm.plugin.voip.ui.y r0 = r10.f317935z
            if (r0 == 0) goto L_0x0046
            android.content.Context r2 = r10.getContext()
            android.widget.FrameLayout r3 = r10.f317910A
            java.lang.String r4 = r10.f317916d
            boolean r5 = r10.mo152973N()
            r0.mo153037a(r2, r3, r4, r5)
        L_0x0046:
            android.widget.RelativeLayout r0 = r10.f317919g
            r2 = 2131315501(0x7f094b2d, float:1.8249457E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.f317912C = r0
            java.lang.String r2 = "rootView"
            java.lang.String r3 = "context"
            if (r0 == 0) goto L_0x00da
            r0.removeAllViews()
            com.tencent.mm.plugin.voip.ui.e0 r0 = r10.f317911B
            if (r0 == 0) goto L_0x00da
            android.content.Context r4 = r10.getContext()
            android.widget.FrameLayout r5 = r10.f317912C
            java.lang.String r6 = r10.f317916d
            boolean r7 = r10.f317917e
            r0.getClass()
            gy3.C87412m.m108594g(r4, r3)
            gy3.C87412m.m108594g(r5, r2)
            java.lang.String r8 = "mUserName"
            gy3.C87412m.m108594g(r6, r8)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r6 = 2131496201(0x7f0c0d09, float:1.861596E38)
            android.view.View r4 = r4.inflate(r6, r5)
            r0.f317976b = r4
            if (r4 == 0) goto L_0x00da
            r5 = 2131298449(0x7f090891, float:1.8214871E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView"
            gy3.C87412m.m108592e(r5, r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f317977c = r5
            android.content.Context r6 = r4.getContext()
            r8 = 2131755887(0x7f10036f, float:1.9142666E38)
            r9 = -1
            android.graphics.drawable.Drawable r6 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r6, r8, r9)
            r5.setBackground(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f317977c
            if (r5 == 0) goto L_0x00af
            android.view.View$OnClickListener r6 = r0.f317981g
            r5.setOnClickListener(r6)
        L_0x00af:
            r5 = 2131298475(0x7f0908ab, float:1.8214924E38)
            android.view.View r5 = r4.findViewById(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f317978d = r5
            r5 = 2131312558(0x7f093fae, float:1.8243488E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.f317979e = r4
            if (r7 == 0) goto L_0x00da
            androidx.lifecycle.z<wj2.f> r4 = nj2.C61767o.f175578d
            y33.a r5 = r0.f317975a
            java.lang.String r6 = "null cannot be cast to non-null type androidx.fragment.app.Fragment"
            gy3.C87412m.m108592e(r5, r6)
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            com.tencent.mm.plugin.voip.ui.d0 r6 = new com.tencent.mm.plugin.voip.ui.d0
            r6.<init>(r0)
            r4.observe(r5, r6)
        L_0x00da:
            r10.mo152977f0()
            android.widget.RelativeLayout r0 = r10.f317919g
            r4 = 2131298206(0x7f09079e, float:1.8214379E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.f317914E = r0
            if (r0 == 0) goto L_0x0246
            r0.removeAllViews()
            com.tencent.mm.plugin.voip.ui.z r0 = r10.f317913D
            if (r0 == 0) goto L_0x0246
            android.content.Context r4 = r10.getContext()
            android.widget.FrameLayout r5 = r10.f317914E
            boolean r6 = r10.mo152973N()
            r0.getClass()
            gy3.C87412m.m108594g(r4, r3)
            gy3.C87412m.m108594g(r5, r2)
            if (r6 == 0) goto L_0x0114
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r4)
            r3 = 2131496192(0x7f0c0d00, float:1.8615942E38)
            android.view.View r2 = r2.inflate(r3, r5)
            goto L_0x011f
        L_0x0114:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r4)
            r3 = 2131496191(0x7f0c0cff, float:1.861594E38)
            android.view.View r2 = r2.inflate(r3, r5)
        L_0x011f:
            r0.f318036f = r2
            if (r2 == 0) goto L_0x0246
            java.lang.String r3 = "VOIPBlockIgnoreButton"
            int r1 = z33.C91617n.m114966d(r3, r1)
            if (r1 != 0) goto L_0x013e
            r1 = 2131316503(0x7f094f17, float:1.825149E38)
            android.view.View r1 = r2.findViewById(r1)
            com.tencent.mm.plugin.voip.widget.VoipSmallIconButton r1 = (com.tencent.p014mm.plugin.voip.widget.VoipSmallIconButton) r1
            r0.f318032b = r1
            if (r1 == 0) goto L_0x0148
            android.view.View$OnClickListener r3 = r0.f318046p
            r1.setOnClickListener(r3)
            goto L_0x0148
        L_0x013e:
            com.tencent.mm.plugin.voip.widget.VoipSmallIconButton r1 = r0.f318032b
            if (r1 != 0) goto L_0x0143
            goto L_0x0148
        L_0x0143:
            r3 = 8
            r1.setVisibility(r3)
        L_0x0148:
            r1 = 2131316534(0x7f094f36, float:1.8251552E38)
            android.view.View r1 = r2.findViewById(r1)
            com.tencent.mm.plugin.voip.widget.VoIPFuncIconLayout r1 = (com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout) r1
            r0.f318033c = r1
            if (r1 == 0) goto L_0x015a
            android.view.View$OnClickListener r3 = r0.f318044n
            r1.setOnClickListener(r3)
        L_0x015a:
            r1 = 2131316507(0x7f094f1b, float:1.8251497E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.f318038h = r1
            if (r1 == 0) goto L_0x01fb
            com.tencent.mm.plugin.voip.ui.b0 r3 = r0.f318037g
            if (r3 == 0) goto L_0x01fb
            android.content.Context r4 = r2.getContext()
            java.lang.String r5 = "it.context"
            gy3.C87412m.m108593f(r4, r5)
            if (r6 == 0) goto L_0x0182
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131496197(0x7f0c0d05, float:1.8615952E38)
            android.view.View r1 = r4.inflate(r5, r1)
            goto L_0x018d
        L_0x0182:
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131496196(0x7f0c0d04, float:1.861595E38)
            android.view.View r1 = r4.inflate(r5, r1)
        L_0x018d:
            r3.f317971j = r1
            r4 = 0
            if (r1 == 0) goto L_0x019c
            r5 = 2131316485(0x7f094f05, float:1.8251453E38)
            android.view.View r1 = r1.findViewById(r5)
            com.tencent.mm.plugin.voip.widget.VoIPFuncIconLayout r1 = (com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout) r1
            goto L_0x019d
        L_0x019c:
            r1 = r4
        L_0x019d:
            r3.f317966e = r1
            if (r1 == 0) goto L_0x01a4
            r1.setOnClickListener(r3)
        L_0x01a4:
            android.view.View r1 = r3.f317971j
            if (r1 == 0) goto L_0x01b2
            r5 = 2131316518(0x7f094f26, float:1.825152E38)
            android.view.View r1 = r1.findViewById(r5)
            com.tencent.mm.plugin.voip.widget.VoIPFuncIconLayout r1 = (com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout) r1
            goto L_0x01b3
        L_0x01b2:
            r1 = r4
        L_0x01b3:
            r3.f317967f = r1
            if (r1 == 0) goto L_0x01ba
            r1.setOnClickListener(r3)
        L_0x01ba:
            android.view.View r1 = r3.f317971j
            if (r1 == 0) goto L_0x01c8
            r5 = 2131316502(0x7f094f16, float:1.8251487E38)
            android.view.View r1 = r1.findViewById(r5)
            com.tencent.mm.plugin.voip.widget.VoIPFuncIconLayout r1 = (com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout) r1
            goto L_0x01c9
        L_0x01c8:
            r1 = r4
        L_0x01c9:
            r3.f317968g = r1
            if (r1 == 0) goto L_0x01d0
            r1.setOnClickListener(r3)
        L_0x01d0:
            android.view.View r1 = r3.f317971j
            if (r1 == 0) goto L_0x01de
            r5 = 2131316481(0x7f094f01, float:1.8251445E38)
            android.view.View r1 = r1.findViewById(r5)
            com.tencent.mm.plugin.voip.widget.VoIPFuncIconLayout r1 = (com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout) r1
            goto L_0x01df
        L_0x01de:
            r1 = r4
        L_0x01df:
            r3.f317969h = r1
            if (r1 == 0) goto L_0x01e6
            r1.setOnClickListener(r3)
        L_0x01e6:
            android.view.View r1 = r3.f317971j
            if (r1 == 0) goto L_0x01f4
            r4 = 2131316482(0x7f094f02, float:1.8251447E38)
            android.view.View r1 = r1.findViewById(r4)
            r4 = r1
            com.tencent.mm.plugin.voip.widget.VoIPFuncIconLayout r4 = (com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout) r4
        L_0x01f4:
            r3.f317970i = r4
            if (r4 == 0) goto L_0x01fb
            r4.setOnClickListener(r3)
        L_0x01fb:
            r1 = 2131316526(0x7f094f2e, float:1.8251536E38)
            android.view.View r1 = r2.findViewById(r1)
            com.tencent.mm.plugin.voip.widget.VoIPControlIconLayout r1 = (com.tencent.p014mm.plugin.voip.widget.VoIPControlIconLayout) r1
            r0.f318039i = r1
            if (r1 == 0) goto L_0x020d
            android.view.View$OnClickListener r3 = r0.f318048r
            r1.setOnClickListener(r3)
        L_0x020d:
            r1 = 2131316509(0x7f094f1d, float:1.8251502E38)
            android.view.View r1 = r2.findViewById(r1)
            com.tencent.mm.plugin.voip.widget.VoIPControlIconLayout r1 = (com.tencent.p014mm.plugin.voip.widget.VoIPControlIconLayout) r1
            r0.f318040j = r1
            if (r1 == 0) goto L_0x021f
            android.view.View$OnClickListener r3 = r0.f318047q
            r1.setOnClickListener(r3)
        L_0x021f:
            r1 = 2131316528(0x7f094f30, float:1.825154E38)
            android.view.View r1 = r2.findViewById(r1)
            com.tencent.mm.plugin.voip.widget.VoIPFuncIconLayout r1 = (com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout) r1
            r0.f318035e = r1
            if (r1 == 0) goto L_0x0231
            android.view.View$OnClickListener r3 = r0.f318045o
            r1.setOnClickListener(r3)
        L_0x0231:
            r1 = 2131316527(0x7f094f2f, float:1.8251538E38)
            android.view.View r1 = r2.findViewById(r1)
            com.tencent.mm.plugin.voip.widget.VoIPFuncIconLayout r1 = (com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout) r1
            r0.f318034d = r1
            if (r1 == 0) goto L_0x0243
            android.view.View$OnClickListener r2 = r0.f318043m
            r1.setOnClickListener(r2)
        L_0x0243:
            r0.mo153047g()
        L_0x0246:
            android.view.View r11 = super.onCreateView(r11, r12, r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.p475ui.VoipBaseFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        this.f317934y.destroy();
        super.onDestroy();
    }

    public void onDetach() {
        MMHandler mMHandler = this.f317918f;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        this.f317930u = null;
        super.onDetach();
    }

    public void onStop() {
        super.onStop();
    }

    /* renamed from: v */
    public void mo152898v(C112390a.C112392b bVar, Bundle bundle) {
        WeakReference<C106448g> weakReference;
        int ordinal = bVar.ordinal();
        if (ordinal == 1) {
            C115669n.INSTANCE.mo160131h(11618, 2, 1);
            WeakReference<C106448g> weakReference2 = this.f317931v;
            if (weakReference2 != null && weakReference2.get() != null) {
                this.f317931v.get().mo152433L(true);
            }
        } else if (ordinal == 2) {
            C106444e0 e0Var = this.f317911B;
            if (e0Var != null) {
                e0Var.mo152999b(-1);
            }
            C85878m2.m106216e(getActivity().getTaskId(), new C106429c());
        } else if (ordinal == 3) {
            WeakReference<C106448g> weakReference3 = this.f317931v;
            if (weakReference3 != null && weakReference3.get() != null && bundle != null) {
                this.f317931v.get().mo152476l(bundle.getBoolean("mute", false));
            }
        } else if (ordinal == 4) {
            WeakReference<C106448g> weakReference4 = this.f317931v;
            if (weakReference4 != null && weakReference4.get() != null && bundle != null) {
                this.f317931v.get().mo152472i(bundle.getBoolean("speaker", false), true);
            }
        } else if (ordinal == 5) {
            WeakReference<C106448g> weakReference5 = this.f317931v;
            if (weakReference5 != null && weakReference5.get() != null) {
                this.f317931v.get().mo152438O();
            }
        } else if (ordinal == 9 && (weakReference = this.f317931v) != null && weakReference.get() != null && this.f317931v.get().mo152484p()) {
            mo152888Z(C0966R.string.kgm, -1);
        }
    }
}
