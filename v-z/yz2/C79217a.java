package yz2;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import az2.C39674e;
import b03.C39693c0;
import b03.C39696f;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import d03.C58010a;
import di3.C86312j;
import dl3.C45413b;
import eb0.C31543z5;
import go3.C59600d;
import gy3.C87412m;
import hz2.C60235a;
import j03.C60695a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import jz2.C76474e;
import jz2.C76485k;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nc3.C34767b;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p182kk.C61104a;
import p206nj.C47264o;
import p232rw.C63679m;
import p640ox.C77049b;
import p773yy.C66710j;
import p823sg.C90193h;
import qc0.C101093a;
import qy2.C63347a;
import qy2.C77448f0;
import qy2.C77451h;
import qy2.C77453j;
import qy2.C77454m;
import qy2.C77455o;
import rr3.C110622b;
import rr3.C110632i;
import rz2.C48201c;
import sn0.C90259e;
import su0.C13781a;
import uz2.C52678e0;
import uz2.C78315f0;
import z04.C112551y;
import z04.C119027c;
import zz2.C16421b;
import zz2.C53848a;

/* renamed from: yz2.a */
public final class C79217a implements C77451h {

    /* renamed from: A */
    public boolean f232552A;

    /* renamed from: B */
    public boolean f232553B;

    /* renamed from: C */
    public ImageView f232554C;

    /* renamed from: D */
    public final boolean f232555D;

    /* renamed from: E */
    public final GestureDetector f232556E;

    /* renamed from: F */
    public WeakReference<PAGView> f232557F;

    /* renamed from: G */
    public boolean f232558G;

    /* renamed from: H */
    public long f232559H;

    /* renamed from: I */
    public long f232560I;

    /* renamed from: J */
    public boolean f232561J;

    /* renamed from: K */
    public C34767b.C34768c f232562K;

    /* renamed from: L */
    public C48201c f232563L;

    /* renamed from: M */
    public C59600d f232564M;

    /* renamed from: N */
    public C52678e0 f232565N;

    /* renamed from: P */
    public boolean f232566P;

    /* renamed from: Q */
    public C77455o f232567Q;

    /* renamed from: R */
    public C52678e0 f232568R;

    /* renamed from: S */
    public float f232569S;

    /* renamed from: d */
    public Context f232570d;

    /* renamed from: e */
    public Runnable f232571e;

    /* renamed from: f */
    public boolean f232572f;

    /* renamed from: g */
    public final String f232573g;

    /* renamed from: h */
    public View f232574h;

    /* renamed from: i */
    public View f232575i;

    /* renamed from: j */
    public ImageView f232576j;

    /* renamed from: n */
    public FrameLayout f232577n;

    /* renamed from: o */
    public MMTPEffectVideoLayout f232578o;

    /* renamed from: p */
    public ImageView f232579p;

    /* renamed from: q */
    public FrameLayout f232580q;

    /* renamed from: r */
    public LinearLayout f232581r;

    /* renamed from: s */
    public FrameLayout f232582s;

    /* renamed from: t */
    public View f232583t;

    /* renamed from: u */
    public TextView f232584u;

    /* renamed from: v */
    public View f232585v;

    /* renamed from: w */
    public FrameLayout f232586w;

    /* renamed from: x */
    public ImageView f232587x;

    /* renamed from: y */
    public String f232588y = "";

    /* renamed from: z */
    public C77454m f232589z;

    /* renamed from: yz2.a$a */
    public static final class C53661a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79217a f150726d;

        public C53661a(C79217a aVar) {
            this.f150726d = aVar;
        }

        public final void onClick(View view) {
            View findViewById;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/BackPreview$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C87412m.m108589b(this.f150726d.f232588y, C13781a.m13082a())) {
                Context context = this.f150726d.f232570d;
                if ((context instanceof Activity) && (findViewById = ((Activity) context).findViewById(C0966R.C0970id.kin)) != null) {
                    findViewById.performClick();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/BackPreview$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yz2.a$b */
    public static final class C53662b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C79217a f150727d;

        public C53662b(C79217a aVar) {
            this.f150727d = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/BackPreview$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GestureDetector gestureDetector = this.f150727d.f232556E;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/BackPreview$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/textstatus/ui/BackPreview$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/textstatus/ui/BackPreview$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: yz2.a$c */
    public static final class C53663c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C79217a f150728d;

        public C53663c(C79217a aVar) {
            this.f150728d = aVar;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onContextClick() called with: res = " + onContextClick + " e = " + motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (!this.f150728d.f232555D) {
                C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return onDoubleTap;
            }
            String a = C13781a.m13082a();
            C48201c cVar = this.f150728d.f232563L;
            if (C87412m.m108589b(a, cVar != null ? cVar.field_UserName : null)) {
                C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return onDoubleTap;
            }
            this.f150728d.mo109229A((motionEvent != null ? Float.valueOf(motionEvent.getX()) : 0).intValue(), (motionEvent != null ? Float.valueOf(motionEvent.getY()) : 0).intValue(), true);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            boolean onDoubleTapEvent = super.onDoubleTapEvent(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onDoubleTapEvent() called with: res = " + onDoubleTapEvent + " e = " + motionEvent);
            return onDoubleTapEvent;
        }

        public boolean onDown(MotionEvent motionEvent) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onDown() called with: res = " + true + " e = " + motionEvent);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            boolean onSingleTapConfirmed = super.onSingleTapConfirmed(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onSingleTapConfirmed() called with: res = " + onSingleTapConfirmed + " e = " + motionEvent);
            return onSingleTapConfirmed;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onSingleTapUp() called with: res=" + onSingleTapUp + " e = " + motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/BackPreview$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: yz2.a$d */
    public static final class C79218d implements C34767b.C21622a {

        /* renamed from: a */
        public final /* synthetic */ C79217a f232590a;

        public C79218d(C79217a aVar) {
            this.f232590a = aVar;
        }

        /* renamed from: a */
        public void mo17997a(boolean z) {
            C60695a player;
            MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232590a.f232578o;
            if (mMTPEffectVideoLayout != null && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
                player.setMute(true);
            }
        }

        public void onResume() {
            C60695a player;
            MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232590a.f232578o;
            if (mMTPEffectVideoLayout != null && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
                player.setMute(false);
            }
        }

        public void onStop() {
            C60695a player;
            MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232590a.f232578o;
            if (mMTPEffectVideoLayout != null && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
                player.setMute(true);
            }
        }
    }

    public C79217a(Context context, Runnable runnable, boolean z) {
        C87412m.m108594g(context, "context");
        this.f232570d = context;
        this.f232571e = runnable;
        this.f232572f = z;
        String str = "MicroMsg.TextStatus.BackPreview" + hashCode();
        this.f232573g = str;
        boolean z2 = false;
        View inflate = LayoutInflater.from(this.f232570d).inflate(C0966R.C0971layout.c8w, (ViewGroup) null, false);
        this.f232574h = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.fda);
        C87412m.m108593f(findViewById, "back.findViewById(R.id.iv_preview)");
        this.f232576j = (ImageView) findViewById;
        View findViewById2 = this.f232574h.findViewById(C0966R.C0970id.fli);
        C87412m.m108593f(findViewById2, "back.findViewById(R.id.layout_video)");
        this.f232577n = (FrameLayout) findViewById2;
        View findViewById3 = this.f232574h.findViewById(C0966R.C0970id.fd5);
        C87412m.m108593f(findViewById3, "back.findViewById(R.id.iv_mask)");
        this.f232579p = (ImageView) findViewById3;
        View findViewById4 = this.f232574h.findViewById(C0966R.C0970id.fl_);
        C87412m.m108593f(findViewById4, "back.findViewById(R.id.layout_third_container)");
        this.f232580q = (FrameLayout) findViewById4;
        View findViewById5 = this.f232574h.findViewById(C0966R.C0970id.fkz);
        C87412m.m108593f(findViewById5, "back.findViewById(R.id.layout_preview_header)");
        this.f232581r = (LinearLayout) findViewById5;
        this.f232582s = (FrameLayout) this.f232574h.findViewById(C0966R.C0970id.f358511fk1);
        this.f232583t = this.f232574h.findViewById(C0966R.C0970id.f358510fk0);
        this.f232584u = (TextView) this.f232574h.findViewById(C0966R.C0970id.kvg);
        View findViewById6 = this.f232574h.findViewById(C0966R.C0970id.fkj);
        C87412m.m108593f(findViewById6, "back.findViewById(R.id.layout_detail)");
        this.f232585v = findViewById6;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById6;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/BackPreview", "<init>", "(Landroid/content/Context;Ljava/lang/Runnable;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById6.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/BackPreview", "<init>", "(Landroid/content/Context;Ljava/lang/Runnable;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById7 = this.f232574h.findViewById(C0966R.C0970id.fla);
        C87412m.m108593f(findViewById7, "back.findViewById(R.id.layout_third_thumb)");
        this.f232586w = (FrameLayout) findViewById7;
        this.f232587x = (ImageView) this.f232574h.findViewById(C0966R.C0970id.m2c);
        this.f232575i = this.f232574h.findViewById(C0966R.C0970id.mtm);
        this.f232554C = (ImageView) this.f232574h.findViewById(C0966R.C0970id.nnu);
        this.f232574h.setOnClickListener(new C53661a(this));
        this.f232574h.setOnTouchListener(new C53662b(this));
        ViewGroup.LayoutParams layoutParams = this.f232580q.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = C63347a.m74683a(this.f232570d)[1];
        }
        FrameLayout frameLayout = this.f232582s;
        float a = (float) C76577a.m92150a(this.f232570d, 10.0f);
        boolean z3 = true & true;
        z2 = true & true ? true : z2;
        if (frameLayout != null) {
            frameLayout.setOutlineProvider(new C39693c0(z3, z2, a));
        }
        if (frameLayout != null) {
            frameLayout.setClipToOutline(true);
        }
        C53848a aVar2 = (C53848a) C39818r.f106831a.mo62443b(this.f232570d).mo62449e(C53848a.class);
        if (aVar2 != null) {
            aVar2.f151087d = new WeakReference<>(this);
        }
        Log.m105924i(str, "create called:" + Util.getStack());
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        this.f232555D = true;
        this.f232556E = new GestureDetector(this.f232570d, new C53663c(this));
    }

    /* renamed from: A */
    public final void mo109229A(int i, int i2, boolean z) {
        C76485k kVar;
        WeakReference<C77453j> weakReference;
        PAGView pAGView;
        if (this.f232552A) {
            View view = this.f232574h;
            C79261r rVar = null;
            RelativeLayout relativeLayout = view instanceof RelativeLayout ? (RelativeLayout) view : null;
            if (relativeLayout != null) {
                PAGView pAGView2 = new PAGView(this.f232570d);
                int dimension = (int) this.f232570d.getResources().getDimension(C0966R.dimen.f3732cl);
                relativeLayout.addView(pAGView2);
                int i3 = dimension / 2;
                int i4 = i - i3;
                int i5 = i2 - i3;
                int i6 = 0;
                Log.m105919d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onDoubleTap() called width:%s, left:%s, top:%s, leftMargin:%s, topMargin:%s", Integer.valueOf(dimension), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5));
                WeakReference<PAGView> weakReference2 = this.f232557F;
                if (!(weakReference2 == null || (pAGView = weakReference2.get()) == null)) {
                    pAGView.stop();
                }
                PAGView pAGView3 = new PAGView(this.f232570d);
                int dimension2 = (int) this.f232570d.getResources().getDimension(C0966R.dimen.f3732cl);
                relativeLayout.addView(pAGView3);
                Log.m105919d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onDoubleTap() called width:%s, leftMargin:%s, topMargin:%s", Integer.valueOf(dimension2), Integer.valueOf(i4), Integer.valueOf(i5));
                ViewGroup.LayoutParams layoutParams = pAGView3.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.width = dimension2;
                    layoutParams2.height = dimension2;
                    if (!z) {
                        layoutParams2.addRule(13, -1);
                    } else {
                        int i7 = i4 + dimension2;
                        if (i7 > relativeLayout.getWidth()) {
                            layoutParams2.addRule(11, -1);
                            layoutParams2.removeRule(9);
                            layoutParams2.rightMargin = relativeLayout.getWidth() - i7;
                            layoutParams2.leftMargin = 0;
                        } else {
                            layoutParams2.addRule(9, -1);
                            layoutParams2.removeRule(11);
                            layoutParams2.leftMargin = i4;
                            layoutParams2.rightMargin = 0;
                        }
                        int i8 = dimension2 + i5;
                        if (i8 > relativeLayout.getHeight()) {
                            layoutParams2.addRule(12, -1);
                            layoutParams2.removeRule(10);
                            layoutParams2.bottomMargin = relativeLayout.getHeight() - i8;
                            layoutParams2.topMargin = 0;
                        } else {
                            layoutParams2.addRule(10, -1);
                            layoutParams2.removeRule(12);
                            layoutParams2.topMargin = i5;
                            layoutParams2.bottomMargin = 0;
                        }
                    }
                }
                pAGView3.addListener(new C53665b(pAGView3, relativeLayout));
                pAGView3.setComposition(PAGFile.Load(this.f232570d.getAssets(), "status_like_bmp.pag"));
                pAGView3.play();
                if (z) {
                    i6 = new Random().nextInt(31) - 15;
                }
                pAGView3.setRotation((float) i6);
                this.f232557F = new WeakReference<>(pAGView3);
            }
            C53848a aVar = (C53848a) C39818r.f106831a.mo62443b(this.f232570d).mo62449e(C53848a.class);
            PullDownListView.IPullDownCallback iPullDownCallback = (aVar == null || (weakReference = aVar.f151088e) == null) ? null : (C77453j) weakReference.get();
            if (iPullDownCallback instanceof C79261r) {
                rVar = (C79261r) iPullDownCallback;
            }
            if (rVar != null && (kVar = rVar.f232698r) != null) {
                ((C76474e) kVar).mo106705V(true, true);
            }
        }
    }

    /* renamed from: B */
    public final void mo109230B() {
        String str;
        String str2 = this.f232588y;
        if (!(str2 == null || C112551y.m153811k(str2)) && !this.f232561J) {
            this.f232561J = true;
            C48201c n0 = C39674e.f106452d.mo62253n0(this.f232588y);
            if (n0 != null) {
                Log.m105925i(this.f232573g, "[play] mediaType:%s, field_MediaUrl:%s, username:%s", Integer.valueOf(n0.field_MediaType), n0.field_MediaUrl, this.f232588y);
                if (n0.field_MediaType == 2) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    if (this.f232578o == null) {
                        this.f232578o = new MMTPEffectVideoLayout(this.f232570d);
                    }
                    MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232578o;
                    if (mMTPEffectVideoLayout != null) {
                        this.f232577n.removeAllViews();
                        this.f232577n.addView(mMTPEffectVideoLayout, layoutParams);
                        String str3 = n0.field_MediaUrl;
                        String str4 = null;
                        if (str3 != null) {
                            C87412m.m108593f(str3, "info.field_MediaUrl");
                            byte[] bytes = str3.getBytes(C119027c.f356488a);
                            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                            str = C90193h.m112878f(bytes);
                        } else {
                            str = null;
                        }
                        String str5 = str == null ? "" : str;
                        String str6 = n0.field_MediaUrl;
                        if (str6 != null) {
                            str4 = str6;
                        }
                        String str7 = str4 == null ? "" : str4;
                        int i = n0.field_mediaWidth;
                        int i2 = n0.field_mediaHeight;
                        if (i <= 0 || i2 <= 0) {
                            i = C74783i3.m89537a(this.f232570d).f24704a;
                            i2 = C74783i3.m89537a(this.f232570d).f24705b;
                        }
                        C39696f fVar = C39696f.f106501a;
                        String c = fVar.mo62320c(this.f232588y);
                        boolean k = C86013q1.m106450k(c);
                        if (!k) {
                            c = fVar.mo62321d("video", this.f232588y);
                        }
                        String str8 = c;
                        C58010a aVar = r11;
                        boolean z = k;
                        C58010a aVar2 = new C58010a(str5, str8, str7, i, i2);
                        aVar.f165933e = z;
                        if (z) {
                            C63679m.C63680a UU = ((C63679m) C86312j.m106911c(C63679m.class)).mo88484UU(str8, true);
                            aVar.f165935g = UU != null ? UU.f180528d : 0;
                            aVar.f165939k = UU != null ? UU.f180530f : 0;
                        }
                        Log.m105925i(this.f232573g, "[play] isLocal:%s, videoWidth:%s, videoHeight:%s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
                        mMTPEffectVideoLayout.mo81100f();
                        mMTPEffectVideoLayout.setMediaInfo(aVar);
                        C60695a player = mMTPEffectVideoLayout.getPlayer();
                        if (player != null) {
                            player.mo85614i(true);
                        }
                        C60695a player2 = mMTPEffectVideoLayout.getPlayer();
                        if (player2 != null) {
                            player2.setLoop(true);
                        }
                        mo109233E();
                        mMTPEffectVideoLayout.getEffectManager().mo154926f();
                        mMTPEffectVideoLayout.getEffectManager().mo154924d();
                        if (n0.mo72933B0()) {
                            C110622b b = mMTPEffectVideoLayout.getEffectManager().mo154922b();
                            b.mo162186d(5.0f);
                            b.mo162187e(1.0f);
                        } else {
                            mMTPEffectVideoLayout.getEffectManager().mo154936p(C110632i.BlurEffect);
                        }
                        try {
                            C60695a player3 = mMTPEffectVideoLayout.getPlayer();
                            if (player3 != null) {
                                player3.mo85619m();
                            }
                            this.f232577n.setVisibility(0);
                        } catch (Exception e) {
                            Log.m105920e(this.f232573g, "unable to play video! mediaInfo:" + aVar + " error:" + e.getLocalizedMessage());
                            this.f232577n.setVisibility(8);
                            this.f232576j.setVisibility(0);
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f232577n.setVisibility(8);
                    this.f232576j.setVisibility(0);
                }
                mo109232D();
            }
        }
    }

    /* renamed from: C */
    public final void mo109231C() {
        C60695a player;
        String str = this.f232588y;
        if (!(str == null || C112551y.m153811k(str))) {
            this.f232561J = false;
            MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232578o;
            if (!(mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null)) {
                C60695a.C60696a.m70998a(player, false, 1, (Object) null);
            }
            this.f232577n.setVisibility(8);
            this.f232576j.setVisibility(0);
            mo109235w();
            mo109232D();
            C34767b.C34768c cVar = this.f232562K;
            if (cVar != null) {
                ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
            }
            this.f232562K = null;
        }
    }

    /* renamed from: D */
    public final void mo109232D() {
        if (!C79224c.m95930b(this.f232563L, mo109236x())) {
            C48201c cVar = this.f232563L;
            boolean z = true;
            if (cVar == null || !cVar.mo72933B0()) {
                z = false;
            }
            if (!z) {
                this.f232579p.setVisibility(0);
                return;
            }
        }
        this.f232579p.setVisibility(8);
    }

    /* renamed from: E */
    public final void mo109233E() {
        C60695a player;
        Class cls = C34767b.class;
        C48201c n0 = C39674e.f106452d.mo62253n0(this.f232588y);
        String str = this.f232573g;
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = n0 != null ? Integer.valueOf(n0.field_MediaType) : null;
        objArr[1] = n0 != null ? n0.field_MediaUrl : null;
        objArr[2] = this.f232588y;
        Log.m105925i(str, "isNeedPlayVideo  mediaType:%s, field_MediaUrl:%s, username:%s", objArr);
        if (!(C61104a.m71668x() || C61104a.m71642B(this.f232570d, false) || !((n0 != null && n0.field_MediaType == 2) && this.f232552A))) {
            C34767b.C34768c el = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34774j.f93457c, new C79218d(this));
            this.f232562K = el;
            if (el != null && el.mo34198a()) {
                z = true;
            }
        } else {
            C34767b.C34768c cVar = this.f232562K;
            if (cVar != null) {
                ((C34767b) C86312j.m106911c(cls)).b20(cVar);
            }
            this.f232562K = null;
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232578o;
        if (mMTPEffectVideoLayout != null && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
            player.setMute(!z);
        }
    }

    /* renamed from: b */
    public void mo107620b(C77454m mVar) {
        this.f232589z = mVar;
    }

    /* renamed from: c */
    public void mo72647c() {
        Log.m105925i(this.f232573g, "onStatusShowDestroy:%s", Boolean.valueOf(this.f232552A));
        mo109235w();
        this.f232589z = null;
        mo109234t();
    }

    /* renamed from: d */
    public void mo107621d() {
        Log.m105924i(this.f232573g, "[onTabSwitchIn]");
    }

    /* renamed from: e */
    public void mo96596e() {
    }

    /* renamed from: g */
    public void mo107622g() {
        Log.m105924i(this.f232573g, "[onTabSwitchOut]");
    }

    public View getView() {
        View view = this.f232574h;
        C87412m.m108593f(view, "back");
        return view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72650h(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "username"
            gy3.C87412m.m108594g(r1, r2)
            r0.f232588y = r1
            android.content.Context r2 = r0.f232570d
            boolean r3 = r2 instanceof android.app.Activity
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x001c
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isFinishing()
            r2 = r2 ^ r4
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            return
        L_0x0020:
            lz2.m$k r2 = new lz2.m$k
            r2.<init>(r1, r0)
            az2.e r2 = az2.C39674e.f106452d
            rz2.c r2 = r2.mo62253n0(r1)
            r0.f232563L = r2
            java.lang.String r2 = r0.f232573g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "[update TextStatusinfo]:"
            r3.append(r6)
            rz2.c r6 = r0.f232563L
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            rz2.c r2 = r0.f232563L
            if (r2 != 0) goto L_0x0051
            qy2.m r1 = r0.f232589z
            if (r1 == 0) goto L_0x0050
            r1.mo96588e1()
        L_0x0050:
            return
        L_0x0051:
            int r3 = r2.field_MediaType
            r6 = 2
            if (r3 != r6) goto L_0x0060
            kz2.a r3 = kz2.C76641a.f224261a
            android.content.Context r7 = r0.f232570d
            android.widget.ImageView r8 = r0.f232576j
            r3.mo106919d(r7, r1, r8, r4)
            goto L_0x0069
        L_0x0060:
            kz2.a r3 = kz2.C76641a.f224261a
            android.content.Context r7 = r0.f232570d
            android.widget.ImageView r8 = r0.f232576j
            r3.mo106919d(r7, r1, r8, r5)
        L_0x0069:
            qy2.m r1 = r0.f232589z
            if (r1 == 0) goto L_0x0070
            r1.mo96587Y1()
        L_0x0070:
            r16.mo109232D()
            java.lang.Class<uz2.f0> r1 = uz2.C78315f0.class
            java.lang.Class<ox.b> r3 = p640ox.C77049b.class
            r7 = 0
            uz2.e0 r8 = p773yy.C66710j.C53637a.m60171a(r2, r5, r4, r7)
            java.lang.String r9 = hz2.C60235a.m70504d(r8)
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            r10 = 9
            r11 = 0
            if (r9 != 0) goto L_0x0132
            go3.d r9 = r0.f232564M
            if (r9 != 0) goto L_0x008f
            goto L_0x009e
        L_0x008f:
            uz2.e0 r9 = r0.f232565N
            if (r9 == 0) goto L_0x009b
            boolean r9 = yz2.C79224c.m95929a(r9, r8)
            if (r9 != r4) goto L_0x009b
            r9 = 1
            goto L_0x009c
        L_0x009b:
            r9 = 0
        L_0x009c:
            if (r9 != 0) goto L_0x00a0
        L_0x009e:
            r9 = 0
            goto L_0x00a1
        L_0x00a0:
            r9 = 1
        L_0x00a1:
            if (r9 != 0) goto L_0x012f
            r16.mo109234t()
            android.widget.FrameLayout r9 = r0.f232580q
            r9.removeAllViews()
            java.lang.String r9 = hz2.C60235a.m70504d(r8)
            if (r9 != 0) goto L_0x00b3
            java.lang.String r9 = ""
        L_0x00b3:
            java.util.LinkedList<uz2.a0> r13 = r8.f147090g
            uz2.m r14 = new uz2.m
            r14.<init>()
            r14.f188445d = r5
            r14.f188446e = r4
            boolean r15 = r0.f232572f
            r14.f188447f = r15
            rz2.c r15 = r0.f232563L
            if (r15 == 0) goto L_0x00c9
            int r15 = r15.field_CreateTime
            goto L_0x00cd
        L_0x00c9:
            int r15 = eb0.C31543z5.m39455e()
        L_0x00cd:
            r14.f188448g = r15
            if (r13 == 0) goto L_0x00d6
            uz2.a0 r13 = xz2.C79020s.m95585a(r13)
            goto L_0x00d7
        L_0x00d6:
            r13 = r7
        L_0x00d7:
            xz2.r r15 = xz2.C79019r.f232026a     // Catch:{ all -> 0x00ec }
            if (r13 == 0) goto L_0x00de
            java.lang.String r7 = r13.f188439d     // Catch:{ all -> 0x00ec }
            goto L_0x00df
        L_0x00de:
            r7 = 0
        L_0x00df:
            qy2.r r7 = r15.mo108986a(r7)     // Catch:{ all -> 0x00ec }
            if (r7 == 0) goto L_0x00ed
            android.widget.FrameLayout r15 = r0.f232580q     // Catch:{ all -> 0x00ec }
            go3.d r7 = r7.mo84138IT(r9, r15, r13, r14)     // Catch:{ all -> 0x00ec }
            goto L_0x00ee
        L_0x00ec:
        L_0x00ed:
            r7 = 0
        L_0x00ee:
            android.content.Context r9 = r0.f232570d
            boolean r13 = r9 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r13 == 0) goto L_0x00fb
            if (r7 == 0) goto L_0x00fb
            com.tencent.mm.ui.MMFragmentActivity r9 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r9
            dl3.C45413b.C45414a.m50357a(r7, r9)
        L_0x00fb:
            java.lang.String r9 = r0.f232573g
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "getThirdBack "
            r13.append(r14)
            if (r7 == 0) goto L_0x010e
            int r14 = r7.hashCode()
            goto L_0x010f
        L_0x010e:
            r14 = 0
        L_0x010f:
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r13)
            r0.f232564M = r7
            r0.f232565N = r8
            di3.d r3 = di3.C86312j.m106911c(r3)
            ox.b r3 = (p640ox.C77049b) r3
            android.content.Context r7 = r0.f232570d
            pe3.a r1 = r3.Wi0(r7, r10, r1)
            uz2.f0 r1 = (uz2.C78315f0) r1
            if (r1 == 0) goto L_0x012f
            r1.f229439r = r11
        L_0x012f:
            r0.f232566P = r4
            goto L_0x0150
        L_0x0132:
            r16.mo109234t()
            android.widget.FrameLayout r7 = r0.f232580q
            r7.removeAllViews()
            r0.f232566P = r5
            di3.d r3 = di3.C86312j.m106911c(r3)
            ox.b r3 = (p640ox.C77049b) r3
            android.content.Context r7 = r0.f232570d
            pe3.a r1 = r3.Wi0(r7, r10, r1)
            uz2.f0 r1 = (uz2.C78315f0) r1
            if (r1 == 0) goto L_0x0150
            r1.f229439r = r11
            r1.f229440s = r11
        L_0x0150:
            r0.mo109237y(r2)
            qy2.o r1 = r16.mo109236x()
            if (r1 == 0) goto L_0x0163
            android.widget.FrameLayout r2 = r0.f232586w
            boolean r1 = r1.mo84150q(r2)
            if (r1 != r4) goto L_0x0163
            r1 = 1
            goto L_0x0164
        L_0x0163:
            r1 = 0
        L_0x0164:
            if (r1 != 0) goto L_0x016b
            android.widget.FrameLayout r1 = r0.f232586w
            r1.removeAllViews()
        L_0x016b:
            qy2.o r1 = r16.mo109236x()
            android.widget.FrameLayout r2 = r0.f232580q
            if (r1 == 0) goto L_0x017b
            boolean r1 = r1.mo87468k()
            if (r1 != 0) goto L_0x017b
            r1 = 1
            goto L_0x017c
        L_0x017b:
            r1 = 0
        L_0x017c:
            if (r1 == 0) goto L_0x0184
            boolean r1 = r0.f232566P
            if (r1 == 0) goto L_0x0184
            r1 = 0
            goto L_0x0186
        L_0x0184:
            r1 = 8
        L_0x0186:
            r2.setVisibility(r1)
            rz2.c r1 = r0.f232563L
            if (r1 == 0) goto L_0x0192
            int r1 = r1.field_MediaType
            if (r1 != r6) goto L_0x0192
            goto L_0x0193
        L_0x0192:
            r4 = 0
        L_0x0193:
            if (r4 != 0) goto L_0x0198
            r16.mo109231C()
        L_0x0198:
            boolean r1 = r0.f232572f
            if (r1 == 0) goto L_0x01a7
            r0.f232561J = r5
            r16.mo109230B()
            long r1 = eb0.C31543z5.m39453c()
            r0.f232560I = r1
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79217a.mo72650h(java.lang.String):void");
    }

    /* renamed from: i */
    public void mo96597i(int i) {
    }

    /* renamed from: k */
    public void mo72648k() {
        Log.m105925i(this.f232573g, "onStatusShowResume:%s", Boolean.valueOf(this.f232572f));
        if (this.f232572f) {
            mo109230B();
        }
    }

    /* renamed from: l */
    public void mo107624l(int i) {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        layoutParams.width = -1;
        if (C79224c.m95930b(this.f232563L, mo109236x())) {
            layoutParams.height = -1;
        } else {
            layoutParams.height = C63347a.m74683a(this.f232570d)[1];
        }
        if (i > 0 && !this.f232553B) {
            float f = -(((float) i) / 2.0f);
            this.f232574h.setTranslationY(f);
            this.f232569S = f;
        }
        String str = this.f232573g;
        Log.m105918d(str, "initPos offset:" + i + " isPostOpen:" + this.f232553B + ' ');
    }

    /* renamed from: m */
    public void mo72649m() {
        Log.m105925i(this.f232573g, "onStatusShowPause:%s", Boolean.valueOf(this.f232552A));
        mo109231C();
    }

    /* renamed from: n */
    public void mo96598n() {
    }

    public void onPostClose() {
        C78315f0 f0Var;
        Log.m105924i(this.f232573g, "[onPostClose]");
        boolean z = false;
        this.f232553B = false;
        long c = C31543z5.m39453c() - this.f232559H;
        if (!this.f232572f) {
            mo109231C();
        }
        C59600d dVar = this.f232564M;
        if (!(dVar == null || (f0Var = (C78315f0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f232570d, 9, C78315f0.class)) == null)) {
            if (this.f232572f) {
                f0Var.f229439r = C31543z5.m39453c() - this.f232560I;
            } else {
                f0Var.f229439r += c;
            }
            f0Var.f229440s = dVar.mo79974c();
        }
        C59600d dVar2 = this.f232564M;
        if (dVar2 != null) {
            dVar2.mo79961e();
        }
        if (mo109238z() && this.f232558G) {
            C101093a.m132486h();
        }
        C77455o x = mo109236x();
        if (x != null && x.mo87468k()) {
            z = true;
        }
        if (z) {
            this.f232580q.setVisibility(8);
        }
        C48201c cVar = this.f232563L;
        if (cVar != null) {
            mo109237y(cVar);
        }
    }

    public void onPostOpen(boolean z) {
        C59600d dVar;
        C78315f0 f0Var;
        Log.m105924i(this.f232573g, "[onPostOpen]");
        this.f232553B = true;
        this.f232559H = C31543z5.m39453c();
        if (mo109238z()) {
            boolean c = C101093a.m132481c();
            this.f232558G = c;
            if (c) {
                C101093a.m132485g();
            }
        }
        mo109230B();
        C59600d dVar2 = this.f232564M;
        if (dVar2 != null) {
            dVar2.mo79962f();
        }
        if (this.f232566P) {
            this.f232580q.setVisibility(0);
        }
        if (this.f232572f && (dVar = this.f232564M) != null && (f0Var = (C78315f0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f232570d, 9, C78315f0.class)) != null) {
            f0Var.f229439r = C31543z5.m39453c() - this.f232560I;
            f0Var.f229440s = dVar.mo79974c();
        }
    }

    public void onPreClose() {
        this.f232552A = false;
        C59600d dVar = this.f232564M;
        if (dVar != null) {
            dVar.mo79963g();
        }
        mo109233E();
        ((C16421b) C39818r.f106831a.mo62443b(this.f232570d).mo75002a(C16421b.class)).mo14879c3();
        ImageView imageView = this.f232587x;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.f232554C;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r4 = r4.f151088e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreOpen() {
        /*
            r7 = this;
            r0 = 1
            r7.f232552A = r0
            go3.d r1 = r7.f232564M
            if (r1 == 0) goto L_0x000a
            r1.mo79964h()
        L_0x000a:
            boolean r1 = r7.f232566P
            r2 = 0
            if (r1 == 0) goto L_0x0014
            android.widget.FrameLayout r1 = r7.f232580q
            r1.setVisibility(r2)
        L_0x0014:
            r7.mo109233E()
            android.widget.ImageView r1 = r7.f232587x
            if (r1 == 0) goto L_0x009d
            rz2.c r3 = r7.f232563L
            if (r3 == 0) goto L_0x009d
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r5 = r7.f232570d
            bl3.r$a r4 = r4.mo62443b(r5)
            java.lang.Class<zz2.a> r5 = zz2.C53848a.class
            bl3.t r4 = r4.mo62449e(r5)
            zz2.a r4 = (zz2.C53848a) r4
            r5 = 0
            if (r4 == 0) goto L_0x003d
            java.lang.ref.WeakReference<qy2.j> r4 = r4.f151088e
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r4.get()
            qy2.j r4 = (qy2.C77453j) r4
            goto L_0x003e
        L_0x003d:
            r4 = r5
        L_0x003e:
            boolean r6 = r4 instanceof yz2.C79261r
            if (r6 == 0) goto L_0x0047
            yz2.r r4 = (yz2.C79261r) r4
            jz2.k r4 = r4.f232698r
            goto L_0x0051
        L_0x0047:
            boolean r6 = r4 instanceof yz2.C79239k
            if (r6 == 0) goto L_0x0050
            yz2.k r4 = (yz2.C79239k) r4
            jz2.k r4 = r4.f232622I
            goto L_0x0051
        L_0x0050:
            r4 = r5
        L_0x0051:
            if (r4 == 0) goto L_0x009d
            b03.c r6 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r6 = r6.mo62309u()
            if (r6 == 0) goto L_0x0098
            r6 = r4
            jz2.e r6 = (jz2.C76474e) r6
            boolean r6 = r6.mo106696J()
            if (r6 == 0) goto L_0x0070
            android.widget.ImageView r0 = r7.f232587x
            if (r0 != 0) goto L_0x006b
            goto L_0x009d
        L_0x006b:
            r1 = 4
            r0.setVisibility(r1)
            goto L_0x009d
        L_0x0070:
            uz2.e0 r0 = p773yy.C66710j.C53637a.m60171a(r3, r2, r0, r5)
            int r0 = r0.f147099s
            if (r0 != 0) goto L_0x007f
            r0 = 1050253722(0x3e99999a, float:0.3)
            r1.setAlpha(r0)
            goto L_0x0084
        L_0x007f:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
        L_0x0084:
            jz2.b r4 = (jz2.C76452b) r4
            r4.mo106701Q(r1, r3)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x009d
            android.widget.ImageView r0 = r7.f232554C
            if (r0 != 0) goto L_0x0094
            goto L_0x009d
        L_0x0094:
            r0.setVisibility(r2)
            goto L_0x009d
        L_0x0098:
            jz2.b r4 = (jz2.C76452b) r4
            r4.mo106701Q(r1, r3)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79217a.onPreOpen():void");
    }

    /* renamed from: q */
    public void mo96603q(int i) {
    }

    /* renamed from: r */
    public boolean mo107625r() {
        return true;
    }

    /* renamed from: t */
    public final void mo109234t() {
        C59600d dVar;
        Context context = this.f232570d;
        if ((context instanceof MMFragmentActivity) && (dVar = this.f232564M) != null) {
            C45413b.C45414a.m50358b(dVar, (MMFragmentActivity) context);
        }
        String str = this.f232573g;
        StringBuilder sb = new StringBuilder();
        sb.append("destroyThirdBackManual ");
        C59600d dVar2 = this.f232564M;
        sb.append(dVar2 != null ? dVar2.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        C59600d dVar3 = this.f232564M;
        if (dVar3 != null) {
            dVar3.onDestroy();
        }
        this.f232564M = null;
        this.f232565N = null;
    }

    /* renamed from: u */
    public void mo96604u(int i) {
    }

    /* renamed from: v */
    public void mo106676v(float f, float f2, float f3) {
        float f4 = ((float) 1) - f;
        this.f232579p.setAlpha(0.3f * f4);
        C59600d dVar = this.f232564M;
        if (dVar != null) {
            dVar.mo79965i(f);
        }
        if (f3 >= f2) {
            this.f232574h.setTranslationY(f4 * this.f232569S);
        } else {
            this.f232574h.setTranslationY(f2 - f3);
        }
        String str = this.f232573g;
        Log.m105918d(str, "onPullDownProgress() called with: persent = " + f + ", curTranslation = " + f2 + ", unfoldTranslation = " + f3 + " back.translationY :" + this.f232574h.getTranslationY() + " ivPreview.translationY:" + this.f232576j.getTranslationY());
        this.f232581r.setAlpha(f);
        this.f232581r.setScaleY(f);
    }

    /* renamed from: w */
    public final void mo109235w() {
        C60695a player;
        C60695a player2;
        Log.m105924i(this.f232573g, "[destroyVideo]");
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232578o;
        if (!(mMTPEffectVideoLayout == null || (player2 = mMTPEffectVideoLayout.getPlayer()) == null)) {
            player2.stopAsync();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f232578o;
        if (!(mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null)) {
            player.recycle();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.f232578o;
        if (mMTPEffectVideoLayout3 != null) {
            mMTPEffectVideoLayout3.mo81101g();
        }
        this.f232578o = null;
        this.f232577n.removeAllViews();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if ((r4 != null && yz2.C79224c.m95929a(r4, r0)) == false) goto L_0x0011;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qy2.C77455o mo109236x() {
        /*
            r5 = this;
            rz2.c r0 = r5.f232563L
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000c
            uz2.e0 r0 = p773yy.C66710j.C53637a.m60171a(r0, r2, r1, r3)
            goto L_0x000d
        L_0x000c:
            r0 = r3
        L_0x000d:
            qy2.o r4 = r5.f232567Q
            if (r4 != 0) goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0023
        L_0x0013:
            uz2.e0 r4 = r5.f232568R
            if (r4 == 0) goto L_0x001f
            boolean r4 = yz2.C79224c.m95929a(r4, r0)
            if (r4 != r1) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            if (r4 != 0) goto L_0x0023
            goto L_0x0011
        L_0x0023:
            if (r1 != 0) goto L_0x0055
            qy2.o r1 = r5.f232567Q
            if (r1 == 0) goto L_0x002c
            r1.mo84148n()
        L_0x002c:
            r5.f232567Q = r3
            r5.f232568R = r3
            xz2.r r1 = xz2.C79019r.f232026a
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = dz2.C75463g.m90504b(r0)
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            qy2.o r1 = r1.mo108987b(r2)
            r5.f232567Q = r1
            if (r1 == 0) goto L_0x0053
            rz2.c r2 = r5.f232563L
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = r2.field_StatusID
            goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            if (r0 == 0) goto L_0x0050
            uz2.a0 r3 = dz2.C75463g.m90503a(r0)
        L_0x0050:
            r1.mo84147m(r2, r3)
        L_0x0053:
            r5.f232568R = r0
        L_0x0055:
            qy2.o r0 = r5.f232567Q
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79217a.mo109236x():qy2.o");
    }

    /* renamed from: y */
    public final void mo109237y(C48201c cVar) {
        boolean z = true;
        CharSequence charSequence = null;
        String d = C60235a.m70504d(C66710j.C53637a.m60171a(cVar, false, 1, (Object) null));
        C77455o x = mo109236x();
        boolean l = x != null ? x.mo87469l() : true;
        if (!(d == null || C112551y.m153811k(d)) && l) {
            C77455o x2 = mo109236x();
            if (x2 == null || !x2.mo84146j()) {
                z = false;
            }
            if (z) {
                this.f232581r.setVisibility(0);
                C77455o x3 = mo109236x();
                FrameLayout frameLayout = this.f232582s;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    if (x3 != null) {
                        x3.mo84149o(frameLayout);
                    }
                }
                TextView textView = this.f232584u;
                if (textView != null) {
                    C77455o x4 = mo109236x();
                    if (x4 != null) {
                        charSequence = x4.mo84143f();
                    }
                    textView.setText(charSequence);
                }
                ViewGroup.LayoutParams layoutParams = this.f232581r.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams).topMargin = C47264o.m52556a(this.f232570d, 25) + this.f232570d.getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
                return;
            }
        }
        this.f232581r.setVisibility(8);
    }

    /* renamed from: z */
    public final boolean mo109238z() {
        C59600d dVar = this.f232564M;
        if (dVar != null && dVar.mo79975d()) {
            return true;
        }
        C48201c cVar = this.f232563L;
        return cVar != null && cVar.field_MediaType == 2;
    }
}
