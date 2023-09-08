package com.tencent.p014mm.plugin.scanner.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanDarkDetectEvent;
import com.tencent.p014mm.autogen.events.ScanFlashSwitchEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.licence.model.LibCardRecog;
import com.tencent.p014mm.plugin.scanner.p101ui.ScannerFlashSwitcher;
import com.tencent.p014mm.plugin.scanner.util.ScanCameraLightDetector;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qbar.WxQbarNative;
import com.tencent.scanlib.p325ui.ScanView;
import di3.C86312j;
import h81.C32735h;
import ht3.C108258a;
import ht3.C108261e;
import ht3.C108267t;
import ht3.C21001c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import yk2.C112475a;
import zk2.C23506a;
import zk2.C23509b;

/* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView */
public class ScanCardRectView extends ScanView {

    /* renamed from: z */
    public static final /* synthetic */ int f53839z = 0;

    /* renamed from: o */
    public int f53840o;

    /* renamed from: p */
    public long f53841p;

    /* renamed from: q */
    public ScanRectDecorView f53842q;

    /* renamed from: r */
    public CardHighLightEdgeView f53843r;

    /* renamed from: s */
    public C5175g f53844s;

    /* renamed from: t */
    public View f53845t;

    /* renamed from: u */
    public ScannerFlashSwitcher f53846u;

    /* renamed from: v */
    public C23506a.C23507a f53847v = new C19132c();

    /* renamed from: w */
    public C23509b.C23511b f53848w = new C19135d();

    /* renamed from: x */
    public IListener f53849x;

    /* renamed from: y */
    public IListener<ScanFlashSwitchEvent> f53850y;

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$g */
    public interface C5175g {
        /* renamed from: a */
        void mo6126a(long j, Bundle bundle);
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$a */
    public class C19129a implements C21001c.C21002a {

        /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$a$a */
        public class C19130a implements C108261e.C108262a {
            public C19130a() {
            }

            /* renamed from: a */
            public void mo24458a() {
                ScanCardRectView.this.mo24382k(0);
            }
        }

        public C19129a() {
        }

        /* renamed from: a */
        public void mo24425a() {
            ScanCardRectView.this.mo27898i(new C19130a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$b */
    public class C19131b implements C108261e.C108262a {
        public C19131b() {
        }

        /* renamed from: a */
        public void mo24458a() {
            ScanCardRectView.this.mo24382k(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$c */
    public class C19132c implements C23506a.C23507a {
        public C19132c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$e */
    public class C19133e implements View.OnClickListener {
        public C19133e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/view/ScanCardRectView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!ScanCardRectView.this.f53846u.f53787g) {
                ScanFlashSwitchEvent scanFlashSwitchEvent = new ScanFlashSwitchEvent();
                scanFlashSwitchEvent.f48122d.f48123a = 1;
                scanFlashSwitchEvent.publish();
                ScannerFlashSwitcher scannerFlashSwitcher = ScanCardRectView.this.f53846u;
                scannerFlashSwitcher.getClass();
                Log.m105924i("MicroMsg.ScannerFlashSwitcher", "openFlashStatus");
                scannerFlashSwitcher.f53787g = true;
                scannerFlashSwitcher.f53784d.setImageResource(C0966R.raw.scanner_flash_open_on);
                scannerFlashSwitcher.f53785e.setText(C0966R.string.f361231ic2);
            } else {
                ScanFlashSwitchEvent scanFlashSwitchEvent2 = new ScanFlashSwitchEvent();
                scanFlashSwitchEvent2.f48122d.f48123a = 2;
                scanFlashSwitchEvent2.publish();
                ScanCardRectView.this.f53846u.mo24459a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/view/ScanCardRectView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$f */
    public class C19134f implements Runnable {
        public C19134f() {
        }

        public void run() {
            ScanCameraLightDetector scanCameraLightDetector = ScanCameraLightDetector.f53829f;
            ScanCardRectView scanCardRectView = ScanCardRectView.this;
            int i = ScanCardRectView.f53839z;
            scanCameraLightDetector.mo24506c(((C112475a) scanCardRectView.f56970e).mo158642d(true));
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$d */
    public class C19135d implements C23509b.C23511b {

        /* renamed from: a */
        public LinkedList<Integer> f53859a = new LinkedList<>();

        /* renamed from: b */
        public Integer f53860b = 0;

        /* renamed from: c */
        public Integer f53861c = 0;

        /* renamed from: d */
        public Integer f53862d = 0;

        /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$d$a */
        public class C19136a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f53864d;

            /* renamed from: e */
            public final /* synthetic */ TextView f53865e;

            /* renamed from: f */
            public final /* synthetic */ View f53866f;

            /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$d$a$a */
            public class C19137a implements Animator.AnimatorListener {
                public C19137a() {
                }

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                    C19136a aVar = C19136a.this;
                    aVar.f53865e.setText(ScanCardRectView.this.getContext().getResources().getString(C0966R.string.icf));
                    View view = C19136a.this.f53866f;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/view/ScanCardRectView$6$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/view/ScanCardRectView$6$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }

            public C19136a(View view, TextView textView, View view2) {
                this.f53864d = view;
                this.f53865e = textView;
                this.f53866f = view2;
            }

            public void run() {
                if (C19135d.this.f53861c.intValue() != 1) {
                    C19135d.this.f53861c = 1;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f53864d, "alpha", new float[]{1.0f, 0.0f});
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f53864d, "alpha", new float[]{0.0f, 1.0f});
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(333);
                    animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                    ofFloat2.addListener(new C19137a());
                    animatorSet.start();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$d$b */
        public class C19138b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f53869d;

            /* renamed from: e */
            public final /* synthetic */ TextView f53870e;

            /* renamed from: f */
            public final /* synthetic */ View f53871f;

            /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCardRectView$d$b$a */
            public class C19139a implements Animator.AnimatorListener {
                public C19139a() {
                }

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                    C19138b bVar = C19138b.this;
                    bVar.f53870e.setText(ScanCardRectView.this.getContext().getResources().getString(C0966R.string.ich));
                    View view = C19138b.this.f53871f;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/view/ScanCardRectView$6$2$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/view/ScanCardRectView$6$2$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }

            public C19138b(View view, TextView textView, View view2) {
                this.f53869d = view;
                this.f53870e = textView;
                this.f53871f = view2;
            }

            public void run() {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f53869d, "alpha", new float[]{1.0f, 0.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f53869d, "alpha", new float[]{0.0f, 1.0f});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(333);
                animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                ofFloat2.addListener(new C19139a());
                animatorSet.start();
            }
        }

        public C19135d() {
        }

        /* renamed from: a */
        public void mo24522a(long j, Bundle bundle) {
            if (j == ScanCardRectView.this.f53841p && bundle.containsKey("param_card_edge")) {
                boolean[] booleanArray = bundle.getBooleanArray("param_card_edge");
                ScanCardRectView.this.f53843r.setHighLightEdges(booleanArray);
                ScanCardRectView scanCardRectView = ScanCardRectView.this;
                int i = scanCardRectView.f53840o;
                if ((i == 9 || i == 11) && scanCardRectView.mo24514o()) {
                    this.f53862d = Integer.valueOf(this.f53862d.intValue() + 1);
                    if (!booleanArray[0] || !booleanArray[1] || !booleanArray[2] || !booleanArray[3]) {
                        this.f53860b = Integer.valueOf(this.f53860b.intValue() + 1);
                        this.f53859a.add(1);
                    } else {
                        this.f53859a.add(0);
                    }
                    if (this.f53859a.size() > 60 && this.f53859a.pollFirst().intValue() == 1) {
                        this.f53860b = Integer.valueOf(this.f53860b.intValue() - 1);
                    }
                    if (this.f53862d.intValue() < 0) {
                        this.f53862d = 0;
                    }
                    if (this.f53862d.intValue() >= 70) {
                        if (this.f53860b.intValue() >= 53) {
                            TextView textView = (TextView) ScanCardRectView.this.f53845t.findViewById(C0966R.C0970id.f357561ai0);
                            textView.post(new C19136a(ScanCardRectView.this.f53845t.findViewById(C0966R.C0970id.ahz), textView, ScanCardRectView.this.f53845t.findViewById(C0966R.C0970id.ahy)));
                        } else if (this.f53860b.intValue() >= 40 && this.f53861c.intValue() != 2) {
                            this.f53861c = 2;
                            TextView textView2 = (TextView) ScanCardRectView.this.f53845t.findViewById(C0966R.C0970id.f357561ai0);
                            textView2.post(new C19138b(ScanCardRectView.this.f53845t.findViewById(C0966R.C0970id.ahz), textView2, ScanCardRectView.this.f53845t.findViewById(C0966R.C0970id.ahy)));
                        }
                    }
                }
            }
        }
    }

    public ScanCardRectView(Context context) {
        super(context);
        C40008f fVar = C40008f.f107254d;
        this.f53849x = new IListener<ScanDarkDetectEvent>(fVar) {
            {
                this.__eventId = -890853388;
            }

            public boolean callback(IEvent iEvent) {
                if (((ScanDarkDetectEvent) iEvent).f48120d.f48121a) {
                    ScannerFlashSwitcher scannerFlashSwitcher = ScanCardRectView.this.f53846u;
                    if (scannerFlashSwitcher == null || scannerFlashSwitcher.isShown()) {
                        return false;
                    }
                    ScanCardRectView.this.f53846u.mo24462d();
                    return false;
                }
                ScannerFlashSwitcher scannerFlashSwitcher2 = ScanCardRectView.this.f53846u;
                if (scannerFlashSwitcher2 == null || scannerFlashSwitcher2.f53787g) {
                    return false;
                }
                scannerFlashSwitcher2.mo24460b();
                return false;
            }
        };
        this.f53850y = new IListener<ScanFlashSwitchEvent>(fVar) {
            {
                this.__eventId = 208336003;
            }

            public boolean callback(IEvent iEvent) {
                if (((ScanFlashSwitchEvent) iEvent).f48122d.f48123a == 1) {
                    ScanCardRectView scanCardRectView = ScanCardRectView.this;
                    int i = ScanCardRectView.f53839z;
                    C112475a aVar = (C112475a) scanCardRectView.f56970e;
                    if (!aVar.f324148j) {
                        aVar.mo164196u();
                    }
                } else {
                    ScanCardRectView scanCardRectView2 = ScanCardRectView.this;
                    int i2 = ScanCardRectView.f53839z;
                    C112475a aVar2 = (C112475a) scanCardRectView2.f56970e;
                    if (aVar2.f324148j) {
                        aVar2.mo164193r();
                    }
                }
                return true;
            }
        };
    }

    /* renamed from: b */
    public void mo24370b() {
        this.f56970e = new C112475a();
    }

    /* renamed from: d */
    public void mo24371d() {
        super.mo24371d();
        CardHighLightEdgeView cardHighLightEdgeView = new CardHighLightEdgeView(getContext());
        this.f53843r = cardHighLightEdgeView;
        addView(cardHighLightEdgeView, new FrameLayout.LayoutParams(-1, -1));
        ScanRectDecorView scanRectDecorView = new ScanRectDecorView(getContext());
        this.f53842q = scanRectDecorView;
        addView(scanRectDecorView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: e */
    public void mo24372e() {
        super.mo24372e();
        mo24516p();
    }

    /* renamed from: f */
    public void mo24373f() {
        super.mo24373f();
        if (!((C108258a) this.f56970e).f324140b) {
            mo24374g(new C19129a());
        } else if (!((C108258a) this.f56970e).f324141c) {
            mo27898i(new C19131b());
        } else {
            mo24382k(0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f53841p = currentTimeMillis;
        int i = this.f53840o;
        if (i == 7) {
            C23506a aVar = C23506a.f67409l;
            C23506a.C23507a aVar2 = this.f53847v;
            synchronized (aVar.f67412b) {
                aVar.f67415e = currentTimeMillis;
                aVar.f67421k = 0;
                aVar.f67416f = aVar2;
            }
        } else if (i == 9 || i == 11 || i == 10) {
            if (i == 9 || i == 11) {
                C23509b bVar = C23509b.f67427m;
                C23509b.C23511b bVar2 = this.f53848w;
                synchronized (bVar.f67429b) {
                    bVar.f67436i = 1;
                    bVar.f67432e = currentTimeMillis;
                    bVar.f67437j = 0;
                    bVar.f67433f = bVar2;
                }
            } else if (i == 10) {
                C23509b bVar3 = C23509b.f67427m;
                C23509b.C23511b bVar4 = this.f53848w;
                synchronized (bVar3.f67429b) {
                    bVar3.f67436i = 2;
                    bVar3.f67432e = currentTimeMillis;
                    bVar3.f67437j = 0;
                    bVar3.f67433f = bVar4;
                }
            }
        }
        ScanRectDecorView scanRectDecorView = this.f53842q;
        if (!scanRectDecorView.f53880d.isStarted()) {
            scanRectDecorView.f53881e.setVisibility(0);
            scanRectDecorView.f53880d.start();
        }
    }

    public Rect getDecorRect() {
        return this.f53842q.getDecorRect();
    }

    /* renamed from: l */
    public final void mo24511l() {
        ScannerFlashSwitcher scannerFlashSwitcher = (ScannerFlashSwitcher) this.f53845t.findViewById(C0966R.C0970id.j28);
        this.f53846u = scannerFlashSwitcher;
        if (scannerFlashSwitcher != null) {
            scannerFlashSwitcher.setOnClickListener(new C19133e());
        }
        this.f53849x.alive();
        this.f53850y.alive();
        MMHandlerThread.postToMainThreadDelayed(new C19134f(), 300);
    }

    /* renamed from: m */
    public void mo24512m() {
        com.tencent.stubs.logger.Log.m106505i("ScanView", "onDestroy");
        this.f56969d.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        C23506a.f67409l.mo36982b();
        C23509b bVar = C23509b.f67427m;
        bVar.getClass();
        Log.m105924i("MicroMsg.LicenseCardDecodeQueue", "release");
        synchronized (bVar.f67430c) {
            if (bVar.f67434g) {
                LibCardRecog.recognizeCardRelease();
            }
            bVar.f67434g = false;
        }
    }

    /* renamed from: n */
    public void mo24513n() {
        com.tencent.stubs.logger.Log.m106505i("ScanView", "onStop");
        mo27895a();
        ScannerFlashSwitcher scannerFlashSwitcher = this.f53846u;
        if (scannerFlashSwitcher != null) {
            scannerFlashSwitcher.mo24459a();
        }
        ScanCameraLightDetector.f53829f.mo24507d();
        this.f53850y.dead();
        this.f53849x.dead();
    }

    /* renamed from: o */
    public final boolean mo24514o() {
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_id_card_scan_v2, 0) == 1;
        Log.m105925i("MicroMsg.ScanCardRectView", "id_card_scan_v2: %s", Boolean.valueOf(z));
        return z;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Point point = new Point();
        getDisplay().getSize(point);
        Log.m105925i("MicroMsg.ScanCardRectView", "screenSize %s", point);
        View view = this.f53845t;
        if (view != null) {
            removeView(view);
        }
        switch (this.f53840o) {
            case 7:
                this.f53845t = View.inflate(getContext(), C0966R.C0971layout.bu7, (ViewGroup) null);
                String nullAs = Util.nullAs(((Activity) getContext()).getIntent().getStringExtra("bank_card_owner"), "");
                String format = String.format(getContext().getResources().getString(C0966R.string.ib_), new Object[]{nullAs});
                View findViewById = this.f53845t.findViewById(C0966R.C0970id.kr9);
                if (Util.isNullOrNil(nullAs)) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/view/ScanCardRectView", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/view/ScanCardRectView", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    ((TextView) this.f53845t.findViewById(C0966R.C0970id.a5p)).setText(format);
                    this.f53845t.findViewById(C0966R.C0970id.a5n).setOnClickListener(new C71027b(this));
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/view/ScanCardRectView", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/view/ScanCardRectView", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                addView(this.f53845t, new FrameLayout.LayoutParams(-1, -1));
                Rect rect = new Rect();
                rect.left = C76577a.m92151b(getContext(), 40);
                rect.right = point.x - C76577a.m92151b(getContext(), 40);
                int width = (point.y - ((int) (((float) rect.width()) / 1.586f))) / 2;
                rect.top = width;
                rect.bottom = width + ((int) (((float) rect.width()) / 1.586f));
                Log.m105925i("MicroMsg.ScanCardRectView", "scan bank card rect %s", rect);
                this.f53842q.mo24541c(rect.width(), rect.height());
                this.f53843r.setCardRect(rect);
                mo24511l();
                return;
            case 9:
            case 11:
                Rect rect2 = new Rect();
                rect2.left = C76577a.m92151b(getContext(), 40);
                rect2.right = point.x - C76577a.m92151b(getContext(), 40);
                int width2 = (point.y - ((int) (((float) rect2.width()) / 1.586f))) / 2;
                rect2.top = width2;
                rect2.bottom = width2 + ((int) (((float) rect2.width()) / 1.586f));
                Log.m105925i("MicroMsg.ScanCardRectView", "scan id card rect %s", rect2);
                this.f53842q.mo24541c(rect2.width(), rect2.height());
                this.f53843r.setCardRect(rect2);
                View inflate = View.inflate(getContext(), C0966R.C0971layout.buc, (ViewGroup) null);
                this.f53845t = inflate;
                addView(inflate, new FrameLayout.LayoutParams(-1, -1));
                TextView textView = (TextView) this.f53845t.findViewById(C0966R.C0970id.f357561ai0);
                textView.setShadowLayer(3.0f, 0.0f, 0.0f, -16777216);
                textView.setText(getContext().getResources().getString(C0966R.string.icg));
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                mo24511l();
                return;
            case 10:
                Rect rect3 = new Rect();
                rect3.left = C76577a.m92151b(getContext(), 40);
                rect3.right = point.x - C76577a.m92151b(getContext(), 40);
                int width3 = (point.y - ((int) (((float) rect3.width()) / 1.467f))) / 2;
                rect3.top = width3;
                rect3.bottom = width3 + ((int) (((float) rect3.width()) / 1.467f));
                Log.m105925i("MicroMsg.ScanCardRectView", "scan driver card rect %s", rect3);
                this.f53842q.mo24541c(rect3.width(), rect3.height());
                this.f53843r.setCardRect(rect3);
                View inflate2 = View.inflate(getContext(), C0966R.C0971layout.buc, (ViewGroup) null);
                this.f53845t = inflate2;
                addView(inflate2, new FrameLayout.LayoutParams(-1, -1));
                ((TextView) this.f53845t.findViewById(C0966R.C0970id.f357561ai0)).setText("");
                mo24511l();
                return;
            default:
                Log.m105920e("MicroMsg.ScanCardRectView", "unknown mode!");
                return;
        }
    }

    public void onAutoFocus(boolean z, Camera camera) {
        Log.m105925i("MicroMsg.ScanCardRectView", "onAutoFocus %s", Boolean.valueOf(z));
        if (z) {
            mo24382k(0);
        }
        mo27896c((long) 1000);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        byte[] bArr2 = bArr;
        this.f56973h = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("onPreviewFrame null data:");
        sb.append(bArr2 == null);
        Log.m105924i("MicroMsg.ScanCardRectView", sb.toString());
        if (((C108258a) this.f56970e).f324141c && ((C112475a) this.f56970e).mo164195t()) {
            ScanCameraLightDetector scanCameraLightDetector = ScanCameraLightDetector.f53829f;
            C108267t tVar = this.f56970e;
            scanCameraLightDetector.mo24505b(bArr2, ((C112475a) tVar).f324142d.x, ((C112475a) tVar).f324142d.y);
        }
        int i = this.f53840o;
        if (i == 7) {
            Rect g = ((C108258a) this.f56970e).mo158645g(getDecorRect());
            C23506a aVar = C23506a.f67409l;
            C108267t tVar2 = this.f56970e;
            Point point = ((C108258a) tVar2).f324142d;
            int i2 = ((C108258a) tVar2).f324147i;
            synchronized (aVar.f67412b) {
                if (!(g.width() == aVar.f67419i.width() && g.height() == aVar.f67419i.height())) {
                    synchronized (aVar.f67413c) {
                        if (aVar.f67417g) {
                            WxQbarNative.focusedEngineRelease();
                        }
                    }
                    aVar.f67417g = false;
                }
            }
            Log.m105925i("MicroMsg.BankCardDetectQueue", "resolution %s, rotation %d, rect %s", point, Integer.valueOf(i2), g);
            if (!aVar.f67417g) {
                synchronized (aVar.f67413c) {
                    Log.m105925i("MicroMsg.BankCardDetectQueue", "rect %s", g);
                    aVar.f67419i = g;
                    int width = (int) (((float) g.width()) * C23506a.f67410m);
                    int height = (int) (((float) g.height()) * C23506a.f67410m);
                    aVar.f67420j.left = g.left - ((width - g.width()) / 2);
                    aVar.f67420j.top = g.top - ((height - g.height()) / 2);
                    Rect rect = aVar.f67420j;
                    rect.right = rect.left + width;
                    rect.bottom = rect.top + height;
                    Log.m105925i("MicroMsg.BankCardDetectQueue", "cropRect %s", rect);
                    aVar.f67417g = WxQbarNative.focusedEngineForBankcardInit(width, height, 8, false) == 0;
                }
            }
            if (aVar.f67417g) {
                synchronized (aVar.f67412b) {
                    ((HashMap) aVar.f67411a).clear();
                    ((HashMap) aVar.f67411a).put("param_preview_data", bArr2);
                    ((HashMap) aVar.f67411a).put("param_camera_resolution", point);
                    ((HashMap) aVar.f67411a).put("param_camera_rotation", Integer.valueOf(i2));
                    if (!aVar.f67418h) {
                        long j = aVar.f67415e;
                        if (j != 0) {
                            Log.m105925i("MicroMsg.BankCardDetectQueue", "%d submit decode bankcard", Long.valueOf(j));
                            aVar.f67414d.execute(new C23506a.C23508b(aVar.f67415e));
                        }
                    }
                }
            }
            if (!((C108258a) this.f56970e).mo158646h(true) && C23506a.f67409l.f67421k > 10) {
                Log.m105924i("MicroMsg.ScanCardRectView", "change to FOCUS_MODE_AUTO");
                ((C108258a) this.f56970e).mo158649k("auto");
                mo27896c(100);
            }
        } else if (i == 11) {
            Rect decorRect = getDecorRect();
            double d = 0.0d;
            if (mo24514o()) {
                d = 30.0d;
            }
            int i3 = decorRect.bottom;
            int i4 = decorRect.top;
            int i5 = decorRect.right;
            int i6 = decorRect.left;
            int i7 = (int) (d * 0.5d);
            int i8 = (int) ((((((double) (i3 - i4)) / ((double) (i5 - i6))) * (((double) (i5 - i6)) + d)) - ((double) (i3 - i4))) * 0.5d);
            Rect g2 = ((C108258a) this.f56970e).mo158645g(new Rect(decorRect.left - i7, decorRect.top - i8, decorRect.right + i7, decorRect.bottom + i8));
            C23509b bVar = C23509b.f67427m;
            C108267t tVar3 = this.f56970e;
            bVar.mo36984b(bArr2, ((C108258a) tVar3).f324142d, ((C108258a) tVar3).f324147i, g2);
            if (!((C108258a) this.f56970e).mo158646h(true) && C23509b.f67427m.f67437j > 10) {
                Log.m105924i("MicroMsg.ScanCardRectView", "change to FOCUS_MODE_AUTO");
                ((C108258a) this.f56970e).mo158649k("auto");
                mo27896c(100);
            }
        }
    }

    /* renamed from: p */
    public final void mo24516p() {
        C23506a.f67409l.mo36982b();
        C23509b bVar = C23509b.f67427m;
        long j = this.f53841p;
        synchronized (bVar.f67429b) {
            if (bVar.f67432e == j) {
                bVar.f67432e = 0;
                bVar.f67437j = 0;
                bVar.f67433f = null;
                ((HashMap) bVar.f67428a).clear();
            }
        }
        this.f53841p = 0;
    }

    public void setDecorRect(Rect rect) {
        this.f53842q.setDecorRect(rect);
        this.f53843r.setCardRect(rect);
    }

    public void setMode(int i) {
        this.f53840o = i;
        this.f53841p = 0;
    }

    public void setScanCallback(C5175g gVar) {
        this.f53844s = gVar;
    }

    public ScanCardRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C40008f fVar = C40008f.f107254d;
        this.f53849x = new IListener<ScanDarkDetectEvent>(fVar) {
            {
                this.__eventId = -890853388;
            }

            public boolean callback(IEvent iEvent) {
                if (((ScanDarkDetectEvent) iEvent).f48120d.f48121a) {
                    ScannerFlashSwitcher scannerFlashSwitcher = ScanCardRectView.this.f53846u;
                    if (scannerFlashSwitcher == null || scannerFlashSwitcher.isShown()) {
                        return false;
                    }
                    ScanCardRectView.this.f53846u.mo24462d();
                    return false;
                }
                ScannerFlashSwitcher scannerFlashSwitcher2 = ScanCardRectView.this.f53846u;
                if (scannerFlashSwitcher2 == null || scannerFlashSwitcher2.f53787g) {
                    return false;
                }
                scannerFlashSwitcher2.mo24460b();
                return false;
            }
        };
        this.f53850y = new IListener<ScanFlashSwitchEvent>(fVar) {
            {
                this.__eventId = 208336003;
            }

            public boolean callback(IEvent iEvent) {
                if (((ScanFlashSwitchEvent) iEvent).f48122d.f48123a == 1) {
                    ScanCardRectView scanCardRectView = ScanCardRectView.this;
                    int i = ScanCardRectView.f53839z;
                    C112475a aVar = (C112475a) scanCardRectView.f56970e;
                    if (!aVar.f324148j) {
                        aVar.mo164196u();
                    }
                } else {
                    ScanCardRectView scanCardRectView2 = ScanCardRectView.this;
                    int i2 = ScanCardRectView.f53839z;
                    C112475a aVar2 = (C112475a) scanCardRectView2.f56970e;
                    if (aVar2.f324148j) {
                        aVar2.mo164193r();
                    }
                }
                return true;
            }
        };
    }

    public ScanCardRectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C40008f fVar = C40008f.f107254d;
        this.f53849x = new IListener<ScanDarkDetectEvent>(fVar) {
            {
                this.__eventId = -890853388;
            }

            public boolean callback(IEvent iEvent) {
                if (((ScanDarkDetectEvent) iEvent).f48120d.f48121a) {
                    ScannerFlashSwitcher scannerFlashSwitcher = ScanCardRectView.this.f53846u;
                    if (scannerFlashSwitcher == null || scannerFlashSwitcher.isShown()) {
                        return false;
                    }
                    ScanCardRectView.this.f53846u.mo24462d();
                    return false;
                }
                ScannerFlashSwitcher scannerFlashSwitcher2 = ScanCardRectView.this.f53846u;
                if (scannerFlashSwitcher2 == null || scannerFlashSwitcher2.f53787g) {
                    return false;
                }
                scannerFlashSwitcher2.mo24460b();
                return false;
            }
        };
        this.f53850y = new IListener<ScanFlashSwitchEvent>(fVar) {
            {
                this.__eventId = 208336003;
            }

            public boolean callback(IEvent iEvent) {
                if (((ScanFlashSwitchEvent) iEvent).f48122d.f48123a == 1) {
                    ScanCardRectView scanCardRectView = ScanCardRectView.this;
                    int i = ScanCardRectView.f53839z;
                    C112475a aVar = (C112475a) scanCardRectView.f56970e;
                    if (!aVar.f324148j) {
                        aVar.mo164196u();
                    }
                } else {
                    ScanCardRectView scanCardRectView2 = ScanCardRectView.this;
                    int i2 = ScanCardRectView.f53839z;
                    C112475a aVar2 = (C112475a) scanCardRectView2.f56970e;
                    if (aVar2.f324148j) {
                        aVar2.mo164193r();
                    }
                }
                return true;
            }
        };
    }
}
