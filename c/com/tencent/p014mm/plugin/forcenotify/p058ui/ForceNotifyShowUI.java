package com.tencent.p014mm.plugin.forcenotify.p058ui;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import di3.C7335d;
import di3.C86312j;
import dv1.C58435m;
import eb0.C31543z5;
import ev1.C31726h;
import ev1.C58838a;
import ev1.C58848l;
import fv1.C32183a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C88989a;
import p687sr.C64156g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI;", "Lcom/tencent/mm/plugin/forcenotify/ui/BaseForceNotifyShowUI;", "<init>", "()V", "plugin-force-notify_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI */
public final class ForceNotifyShowUI extends BaseForceNotifyShowUI {

    /* renamed from: s */
    public static final /* synthetic */ int f162715s = 0;

    /* renamed from: f */
    public final C13601g f162716f = C36568h.m40985a(new C56774b(this));

    /* renamed from: g */
    public final C13601g f162717g = C36568h.m40985a(new C56780h(this));

    /* renamed from: h */
    public MediaPlayer f162718h;

    /* renamed from: i */
    public Runnable f162719i;

    /* renamed from: j */
    public Runnable f162720j;

    /* renamed from: n */
    public AudioManager.OnAudioFocusChangeListener f162721n = C56773a.f162726d;

    /* renamed from: o */
    public final MMHandler f162722o = new MMHandler(Looper.getMainLooper());

    /* renamed from: p */
    public boolean f162723p;

    /* renamed from: q */
    public boolean f162724q;

    /* renamed from: r */
    public boolean f162725r;

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$a */
    public static final class C56773a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: d */
        public static final C56773a f162726d = new C56773a();

        public final void onAudioFocusChange(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$b */
    public static final class C56774b extends C87413o implements C32224a<AudioManager> {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyShowUI f162727d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56774b(ForceNotifyShowUI forceNotifyShowUI) {
            super(0);
            this.f162727d = forceNotifyShowUI;
        }

        public Object invoke() {
            Object systemService = this.f162727d.getSystemService("audio");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$c */
    public static final class C56775c extends C87413o implements C32224a<C31726h> {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyShowUI f162728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56775c(ForceNotifyShowUI forceNotifyShowUI) {
            super(0);
            this.f162728d = forceNotifyShowUI;
        }

        public Object invoke() {
            C58838a aVar = this.f162728d.f162687e;
            if (aVar != null) {
                return C32183a.f85554d.mo58521Lo(aVar.f168434d);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$d */
    public static final class C56776d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyShowUI f162729d;

        public C56776d(ForceNotifyShowUI forceNotifyShowUI) {
            this.f162729d = forceNotifyShowUI;
        }

        public final void run() {
            ForceNotifyShowUI forceNotifyShowUI = this.f162729d;
            int i = ForceNotifyShowUI.f162715s;
            Class cls = C58435m.class;
            forceNotifyShowUI.getWindow().getDecorView().setKeepScreenOn(true);
            forceNotifyShowUI.getWindow().addFlags(128);
            if (forceNotifyShowUI.f162723p) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(ForceNotifyService::class.java)");
                if (!C58435m.zx0((C58435m) c, (Context) null, 1, (Object) null)) {
                    Log.m105924i(forceNotifyShowUI.f162686d, "PlaySound.playRoot");
                    forceNotifyShowUI.f162718h = PlaySound.playRoot(forceNotifyShowUI.getContext(), C0966R.string.f1t, PlaySound.SPEAKERON.NOTSET, 2, true, (PlaySound.OnPlayCompletionListener) null);
                }
            }
            if (forceNotifyShowUI.f162724q) {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(ForceNotifyService::class.java)");
                if (C58435m.Ax0((C58435m) c2, (Context) null, 1, (Object) null)) {
                    Log.m105924i(forceNotifyShowUI.f162686d, "vibrator.vibrate");
                    ((Vibrator) ((C36570n) forceNotifyShowUI.f162717g).getValue()).vibrate(new long[]{1000, 1000, 1000, 1000}, 0);
                }
            }
            forceNotifyShowUI.f162725r = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$e */
    public static final class C56777e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyShowUI f162730d;

        public C56777e(ForceNotifyShowUI forceNotifyShowUI) {
            this.f162730d = forceNotifyShowUI;
        }

        public final void run() {
            ForceNotifyShowUI forceNotifyShowUI = this.f162730d;
            int i = ForceNotifyShowUI.f162715s;
            forceNotifyShowUI.mo80152J7();
            ForceNotifyShowUI forceNotifyShowUI2 = this.f162730d;
            forceNotifyShowUI2.f162723p = false;
            forceNotifyShowUI2.f162724q = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$f */
    public static final class C56778f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58838a f162731d;

        /* renamed from: e */
        public final /* synthetic */ ForceNotifyShowUI f162732e;

        public C56778f(C58838a aVar, ForceNotifyShowUI forceNotifyShowUI) {
            this.f162731d = aVar;
            this.f162732e = forceNotifyShowUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58838a aVar = this.f162731d;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            aVar.mo84041n(view);
            ForceNotifyShowUI forceNotifyShowUI = this.f162732e;
            forceNotifyShowUI.f162723p = false;
            forceNotifyShowUI.f162724q = false;
            forceNotifyShowUI.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$g */
    public static final class C56779g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58838a f162733d;

        /* renamed from: e */
        public final /* synthetic */ ForceNotifyShowUI f162734e;

        public C56779g(C58838a aVar, ForceNotifyShowUI forceNotifyShowUI) {
            this.f162733d = aVar;
            this.f162734e = forceNotifyShowUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f162733d instanceof C58848l) {
                StringBuilder sb = new StringBuilder();
                long j = (long) 1000;
                sb.append(((C58848l) this.f162733d).f168470n / j);
                sb.append(((C58848l) this.f162733d).f168467h);
                ((C64156g) C86312j.m106911c(C64156g.class)).mo58061Ke(this.f162733d.f168434d, sb.toString(), 2, C31543z5.m39453c() / j);
            }
            this.f162734e.finish();
            ForceNotifyShowUI forceNotifyShowUI = this.f162734e;
            forceNotifyShowUI.f162723p = false;
            forceNotifyShowUI.f162724q = false;
            forceNotifyShowUI.overridePendingTransition(0, C0966R.C0968anim.f2469dt);
            C117292a.m165361g(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$h */
    public static final class C56780h extends C87413o implements C32224a<Vibrator> {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyShowUI f162735d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56780h(ForceNotifyShowUI forceNotifyShowUI) {
            super(0);
            this.f162735d = forceNotifyShowUI;
        }

        public Object invoke() {
            Object systemService = this.f162735d.getContext().getSystemService("vibrator");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
    }

    public ForceNotifyShowUI() {
        C36568h.m40985a(new C56775c(this));
    }

    /* renamed from: H7 */
    public final AudioManager mo80150H7() {
        return (AudioManager) ((C36570n) this.f162716f).getValue();
    }

    /* renamed from: I7 */
    public final void mo80151I7() {
        Log.m105924i(this.f162686d, "reset");
        if (this.f162725r) {
            this.f162723p = false;
            this.f162724q = false;
        }
        getWindow().getDecorView().setKeepScreenOn(false);
        getWindow().clearFlags(128);
        this.f162722o.removeCallbacksAndMessages((Object) null);
        try {
            this.f162722o.removeCallbacks(this.f162719i);
            mo80152J7();
        } catch (IllegalStateException e) {
            Log.printErrStackTrace(this.f162686d, e, "", new Object[0]);
        }
    }

    /* renamed from: J7 */
    public final void mo80152J7() {
        try {
            ((Vibrator) ((C36570n) this.f162717g).getValue()).cancel();
            MediaPlayer mediaPlayer = this.f162718h;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.f162718h;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            getWindow().getDecorView().setKeepScreenOn(false);
            getWindow().clearFlags(128);
            mo80150H7().abandonAudioFocus(this.f162721n);
        } catch (Exception unused) {
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ash;
    }

    public void onBackPressed() {
        super.onBackPressed();
        Log.m105924i(this.f162686d, "[onBackPressed]");
        C58838a aVar = this.f162687e;
        if (aVar != null && (aVar instanceof C58848l)) {
            StringBuilder sb = new StringBuilder();
            C58848l lVar = (C58848l) aVar;
            long j = (long) 1000;
            sb.append(lVar.f168470n / j);
            sb.append(lVar.f168467h);
            ((C64156g) C86312j.m106911c(C64156g.class)).mo58061Ke(aVar.f168434d, sb.toString(), 8, C31543z5.m39453c() / j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x036f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r0 = r26
            java.lang.Class<dv1.m> r1 = dv1.C58435m.class
            super.onCreate(r27)
            ev1.a r2 = r0.f162687e
            if (r2 != 0) goto L_0x000f
            r26.finish()
            return
        L_0x000f:
            android.media.AudioManager r3 = r26.mo80150H7()
            r4 = 1
            int r3 = r3.getVibrateSetting(r4)
            android.media.AudioManager r5 = r26.mo80150H7()
            r6 = 0
            int r5 = r5.getVibrateSetting(r6)
            android.media.AudioManager r7 = r26.mo80150H7()
            int r7 = r7.getRingerMode()
            java.lang.String r8 = r0.f162686d
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r10[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r5 = 2
            r10[r5] = r3
            java.lang.String r3 = "V:%s V1:%s  R:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r10)
            android.media.AudioManager r3 = r26.mo80150H7()
            android.media.AudioManager$OnAudioFocusChangeListener r7 = r0.f162721n
            int r3 = r3.requestAudioFocus(r7, r9, r5)
            android.view.Window r7 = r26.getWindow()
            android.view.View r7 = r7.getDecorView()
            r7.setKeepScreenOn(r6)
            android.view.Window r7 = r26.getWindow()
            r8 = 128(0x80, float:1.794E-43)
            r7.clearFlags(r8)
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r8 = 2131310284(0x7f0936cc, float:1.8238876E38)
            r10 = 2131310285(0x7f0936cd, float:1.8238878E38)
            r11 = 2131317168(0x7f0951b0, float:1.8252838E38)
            r12 = 2131315432(0x7f094ae8, float:1.8249317E38)
            r13 = 2131306206(0x7f0926de, float:1.8230605E38)
            if (r7 == 0) goto L_0x00fb
            android.view.View r7 = r0.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r14 = 2131100791(0x7f060477, float:1.7813973E38)
            if (r7 == 0) goto L_0x008f
            android.content.res.Resources r15 = r26.getResources()
            int r15 = r15.getColor(r14)
            r7.setTextColor(r15)
        L_0x008f:
            android.view.View r7 = r0.findViewById(r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00a2
            android.content.res.Resources r15 = r26.getResources()
            int r15 = r15.getColor(r14)
            r7.setTextColor(r15)
        L_0x00a2:
            android.view.View r7 = r0.findViewById(r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00b5
            android.content.res.Resources r15 = r26.getResources()
            int r14 = r15.getColor(r14)
            r7.setTextColor(r14)
        L_0x00b5:
            android.view.View r7 = r0.findViewById(r12)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r14 = 2131100783(0x7f06046f, float:1.7813957E38)
            if (r7 == 0) goto L_0x00cb
            android.content.res.Resources r15 = r26.getResources()
            int r15 = r15.getColor(r14)
            r7.setTextColor(r15)
        L_0x00cb:
            android.view.View r7 = r0.findViewById(r13)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            if (r7 == 0) goto L_0x00de
            android.content.res.Resources r15 = r26.getResources()
            int r14 = r15.getColor(r14)
            r7.setIconColor(r14)
        L_0x00de:
            android.view.Window r7 = r26.getWindow()
            android.view.View r7 = r7.getDecorView()
            android.graphics.drawable.ColorDrawable r14 = new android.graphics.drawable.ColorDrawable
            android.content.res.Resources r15 = r26.getResources()
            r9 = 2131100781(0x7f06046d, float:1.7813953E38)
            int r9 = r15.getColor(r9)
            r14.<init>(r9)
            r7.setBackground(r14)
            goto L_0x017b
        L_0x00fb:
            android.view.View r7 = r0.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r9 = 2131100788(0x7f060474, float:1.7813967E38)
            if (r7 == 0) goto L_0x0111
            android.content.res.Resources r14 = r26.getResources()
            int r14 = r14.getColor(r9)
            r7.setTextColor(r14)
        L_0x0111:
            android.view.View r7 = r0.findViewById(r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0124
            android.content.res.Resources r14 = r26.getResources()
            int r14 = r14.getColor(r9)
            r7.setTextColor(r14)
        L_0x0124:
            android.view.View r7 = r0.findViewById(r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0137
            android.content.res.Resources r14 = r26.getResources()
            int r9 = r14.getColor(r9)
            r7.setTextColor(r9)
        L_0x0137:
            android.view.View r7 = r0.findViewById(r12)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r9 = 2131100782(0x7f06046e, float:1.7813955E38)
            if (r7 == 0) goto L_0x014d
            android.content.res.Resources r14 = r26.getResources()
            int r14 = r14.getColor(r9)
            r7.setTextColor(r14)
        L_0x014d:
            android.view.View r7 = r0.findViewById(r13)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            if (r7 == 0) goto L_0x0160
            android.content.res.Resources r14 = r26.getResources()
            int r9 = r14.getColor(r9)
            r7.setIconColor(r9)
        L_0x0160:
            android.view.Window r7 = r26.getWindow()
            android.view.View r7 = r7.getDecorView()
            android.graphics.drawable.ColorDrawable r9 = new android.graphics.drawable.ColorDrawable
            android.content.res.Resources r14 = r26.getResources()
            r15 = 2131100780(0x7f06046c, float:1.7813951E38)
            int r14 = r14.getColor(r15)
            r9.<init>(r14)
            r7.setBackground(r9)
        L_0x017b:
            boolean r7 = r2.mo84036i()
            r0.f162723p = r7
            boolean r7 = r2.mo84037j()
            r0.f162724q = r7
            com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$d r7 = new com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$d
            r7.<init>(r0)
            r0.f162720j = r7
            com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$e r7 = new com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$e
            r7.<init>(r0)
            r0.f162719i = r7
            java.lang.String r7 = r0.f162686d
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r14 = r2.f168434d
            r9[r6] = r14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9[r4] = r3
            java.lang.String r3 = "[onCreate] forcePushId:%s requestAudioFocus:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r9)
            android.view.View r3 = r0.findViewById(r8)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r7 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.view.View r8 = r0.findViewById(r11)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131297407(0x7f09047f, float:1.8212758E38)
            android.view.View r9 = r0.findViewById(r9)
            r16 = r9
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r9 = 2131299709(0x7f090d7d, float:1.8217427E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r11 = 2131300854(0x7f0911f6, float:1.821975E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r14 = 2131310277(0x7f0936c5, float:1.8238862E38)
            android.view.View r14 = r0.findViewById(r14)
            r15 = 2131297408(0x7f090480, float:1.821276E38)
            android.view.View r15 = r0.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.view.View r13 = r0.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131317162(0x7f0951aa, float:1.8252826E38)
            android.view.View r13 = r0.findViewById(r13)
            java.lang.String r4 = r2.mo84034d()
            r12.setText(r4)
            android.text.TextPaint r4 = r8.getPaint()
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r12)
            android.text.TextPaint r4 = r10.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r12)
            r4 = 2131306158(0x7f0926ae, float:1.8230507E38)
            android.view.View r4 = r0.findViewById(r4)
            com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$f r12 = new com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$f
            r12.<init>(r2, r0)
            r4.setOnClickListener(r12)
            com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$g r4 = new com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI$g
            r4.<init>(r2, r0)
            r9.setOnClickListener(r4)
            boolean r4 = r2 instanceof ev1.C58848l
            java.lang.String r12 = ""
            r5 = 0
            if (r4 == 0) goto L_0x0275
            java.lang.String r4 = r2.f168434d
            java.lang.String r9 = "@miniapp"
            r10 = 2
            boolean r4 = z04.C112551y.m153808h(r4, r9, r6, r10, r5)
            if (r4 == 0) goto L_0x0251
            gc0.a r4 = gc0.C20828a.m22825b()
            r6 = r2
            ev1.l r6 = (ev1.C58848l) r6
            java.lang.String r6 = r6.f168471o
            r4.mo32518g(r6, r7)
            goto L_0x0264
        L_0x0251:
            java.lang.Class<ln.f> r4 = p196ln.C76705f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ln.f r4 = (p196ln.C76705f) r4
            r6 = r2
            ev1.l r6 = (ev1.C58848l) r6
            java.lang.String r6 = r6.f168467h
            r9 = 1036831949(0x3dcccccd, float:0.1)
            r4.D20(r7, r6, r9)
        L_0x0264:
            r4 = r2
            ev1.l r4 = (ev1.C58848l) r4
            java.lang.String r6 = r4.f168468i
            r3.setText(r6)
            java.lang.String r3 = r4.f168469j
            r8.setText(r3)
            r25 = r1
            goto L_0x0405
        L_0x0275:
            r3 = 2
            boolean r4 = r2 instanceof ev1.C58847k
            java.lang.String r3 = "wordingContainer"
            r5 = 8
            java.lang.String r6 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r4 == 0) goto L_0x0386
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r17 = k20.C60958c.f173611a
            r25 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r1)
            java.lang.Object[] r18 = r4.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI"
            java.lang.String r20 = "onCreate"
            java.lang.String r21 = "(Landroid/os/Bundle;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r14
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = 0
            java.lang.Object r4 = r4.mo10231a(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r1 = r4.intValue()
            r14.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI"
            java.lang.String r19 = "onCreate"
            java.lang.String r20 = "(Landroid/os/Bundle;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            r7.setVisibility(r5)
            r1 = r2
            ev1.k r1 = (ev1.C58847k) r1
            java.lang.String r4 = r1.f168463p
            if (r4 == 0) goto L_0x02fa
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x02d7
            r4 = 1
            goto L_0x02d8
        L_0x02d7:
            r4 = 0
        L_0x02d8:
            if (r4 == 0) goto L_0x02fa
            r4 = 0
            r15.setVisibility(r4)
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            java.lang.String r7 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r4, r7)
            r14 = r4
            ht1.t1 r14 = (ht1.C60200t1) r14
            java.lang.String r4 = r1.f168463p
            r17 = 0
            r18 = 4
            r19 = 0
            r7 = r15
            r15 = r4
            ht1.C60200t1.C60201a.m70370h(r14, r15, r16, r17, r18, r19)
            goto L_0x02fe
        L_0x02fa:
            r7 = r15
            r7.setVisibility(r5)
        L_0x02fe:
            r4 = 0
            r10.setVisibility(r4)
            java.lang.String r14 = r1.f168462o
            if (r14 == 0) goto L_0x030f
            int r14 = r14.length()
            if (r14 != 0) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            r14 = 0
            goto L_0x0310
        L_0x030f:
            r14 = 1
        L_0x0310:
            if (r14 == 0) goto L_0x032d
            r10.setVisibility(r4)
            java.lang.String r4 = r1.f168458h
            r10.setText(r4)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r7 = 2131830424(0x7f112698, float:1.9293845E38)
            java.lang.String r4 = r4.getString(r7)
            r8.setText(r4)
            goto L_0x033b
        L_0x032d:
            r10.setVisibility(r5)
            r7.setVisibility(r5)
            r10.setText(r12)
            java.lang.String r4 = r1.f168462o
            r8.setText(r4)
        L_0x033b:
            androidx.appcompat.app.AppCompatActivity r4 = r26.getContext()
            r7 = 2131820948(0x7f110194, float:1.9274625E38)
            java.lang.String r4 = r4.getString(r7)
            r9.setContentDescription(r4)
            java.lang.String r1 = r1.f168464q
            if (r1 == 0) goto L_0x035b
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x0355
            r4 = 1
            goto L_0x0356
        L_0x0355:
            r4 = 0
        L_0x0356:
            r7 = 1
            if (r4 != r7) goto L_0x035b
            r4 = 1
            goto L_0x035c
        L_0x035b:
            r4 = 0
        L_0x035c:
            if (r4 == 0) goto L_0x035f
            goto L_0x0360
        L_0x035f:
            r1 = 0
        L_0x0360:
            if (r1 == 0) goto L_0x036c
            r4 = 0
            r11.setVisibility(r4)
            r11.setText(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x036d
        L_0x036c:
            r1 = 0
        L_0x036d:
            if (r1 != 0) goto L_0x0372
            r11.setVisibility(r5)
        L_0x0372:
            gy3.C87412m.m108593f(r13, r3)
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            gy3.C87412m.m108592e(r1, r6)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r3 = 0
            r1.topMargin = r3
            r13.setLayoutParams(r1)
            goto L_0x0405
        L_0x0386:
            r25 = r1
            boolean r1 = r2 instanceof ev1.C58841f
            if (r1 == 0) goto L_0x0405
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1.mo10233c(r4)
            java.lang.Object[] r18 = r1.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI"
            java.lang.String r20 = "onCreate"
            java.lang.String r21 = "(Landroid/os/Bundle;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r14
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r14.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI"
            java.lang.String r19 = "onCreate"
            java.lang.String r20 = "(Landroid/os/Bundle;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            r7.setVisibility(r5)
            r1 = r2
            ev1.f r1 = (ev1.C58841f) r1
            java.lang.String r4 = r1.f168442h
            r8.setText(r4)
            java.lang.String r4 = r1.f168443i
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x03e3
            r4 = 1
            goto L_0x03e4
        L_0x03e3:
            r4 = 0
        L_0x03e4:
            if (r4 == 0) goto L_0x03f0
            r4 = 0
            r11.setVisibility(r4)
            java.lang.String r1 = r1.f168443i
            r11.setText(r1)
            goto L_0x03f4
        L_0x03f0:
            r4 = 0
            r11.setVisibility(r5)
        L_0x03f4:
            gy3.C87412m.m108593f(r13, r3)
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            gy3.C87412m.m108592e(r1, r6)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.topMargin = r4
            r13.setLayoutParams(r1)
        L_0x0405:
            ev1.a r1 = r0.f162687e
            if (r1 == 0) goto L_0x047f
            boolean r3 = r1 instanceof ev1.C58848l
            if (r3 == 0) goto L_0x0417
            r3 = r1
            ev1.l r3 = (ev1.C58848l) r3
            java.lang.String r12 = r3.f168467h
            r14 = r12
            r4 = 1
            r16 = 1
            goto L_0x0435
        L_0x0417:
            boolean r3 = r1 instanceof ev1.C58847k
            if (r3 == 0) goto L_0x0425
            r3 = r1
            ev1.k r3 = (ev1.C58847k) r3
            java.lang.String r12 = r3.f168459i
            r14 = r12
            r4 = 1
            r16 = 2
            goto L_0x0435
        L_0x0425:
            boolean r3 = r1 instanceof ev1.C58841f
            if (r3 == 0) goto L_0x047f
            r3 = r1
            ev1.f r3 = (ev1.C58841f) r3
            int r3 = r3.f168445n
            r4 = 1
            if (r3 != r4) goto L_0x047f
            r10 = 5
            r14 = r12
            r16 = 5
        L_0x0435:
            java.lang.Class<sr.g> r3 = p687sr.C64156g.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            r13 = r3
            sr.g r13 = (p687sr.C64156g) r13
            di3.d r3 = di3.C86312j.m106911c(r25)
            java.lang.String r5 = "getService(ForceNotifyService::class.java)"
            gy3.C87412m.m108593f(r3, r5)
            dv1.m r3 = (dv1.C58435m) r3
            r6 = 0
            boolean r3 = dv1.C58435m.zx0(r3, r6, r4, r6)
            if (r3 == 0) goto L_0x0464
            di3.d r3 = di3.C86312j.m106911c(r25)
            gy3.C87412m.m108593f(r3, r5)
            dv1.m r3 = (dv1.C58435m) r3
            boolean r3 = dv1.C58435m.Ax0(r3, r6, r4, r6)
            if (r3 == 0) goto L_0x0461
            r15 = 1
            goto L_0x0476
        L_0x0461:
            r4 = 4
            r15 = 4
            goto L_0x0476
        L_0x0464:
            di3.d r3 = di3.C86312j.m106911c(r25)
            gy3.C87412m.m108593f(r3, r5)
            dv1.m r3 = (dv1.C58435m) r3
            boolean r3 = dv1.C58435m.Ax0(r3, r6, r4, r6)
            if (r3 == 0) goto L_0x0475
            r15 = 3
            goto L_0x0476
        L_0x0475:
            r15 = 2
        L_0x0476:
            java.lang.String r1 = r1.f168434d
            r18 = 1
            r17 = r1
            r13.ql0(r14, r15, r16, r17, r18)
        L_0x047f:
            fv1.a r1 = fv1.C32183a.f85554d
            java.lang.String r2 = r2.f168434d
            r1.mo58522c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.forcenotify.p058ui.ForceNotifyShowUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        mo80151I7();
        this.f162720j = null;
        this.f162719i = null;
        C58838a aVar = this.f162687e;
        if (aVar != null && (str = aVar.f168434d) != null) {
            C32183a.f85554d.mo58522c(str);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        String str = this.f162686d;
        Log.m105924i(str, "[onKeyDown] keyCode:" + i);
        mo80151I7();
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i(this.f162686d, "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i(this.f162686d, "onResume");
    }

    public void onStart() {
        super.onStart();
        Log.m105924i(this.f162686d, "onStart");
        if (this.f162723p || this.f162724q) {
            this.f162722o.postDelayed(this.f162720j, 1000);
            this.f162722o.postDelayed(this.f162719i, 60000);
        }
    }

    public void onStop() {
        super.onStop();
        mo80151I7();
        Log.m105924i(this.f162686d, "onStop");
    }
}
