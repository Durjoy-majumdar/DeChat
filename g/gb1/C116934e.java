package gb1;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.plugin.facedetect.model.C105227i;
import com.tencent.p014mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.p014mm.plugin.facedetect.views.FaceNumberItemView;
import com.tencent.p014mm.plugin.facedetect.views.FaceNumberView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import gb1.C116924a;
import gb1.C116929b;
import jb1.C108680a;
import p375qh.C89658b;

/* renamed from: gb1.e */
public class C116934e implements C116929b {

    /* renamed from: a */
    public String f350395a = null;

    /* renamed from: b */
    public int f350396b = 0;

    /* renamed from: c */
    public C116924a f350397c = null;

    /* renamed from: d */
    public String[] f350398d = null;

    /* renamed from: e */
    public int f350399e = 0;

    /* renamed from: f */
    public int f350400f = 0;

    /* renamed from: g */
    public View f350401g = null;

    /* renamed from: h */
    public FaceNumberView f350402h = null;

    /* renamed from: i */
    public boolean f350403i = false;

    /* renamed from: j */
    public long f350404j = -1;

    /* renamed from: k */
    public boolean f350405k = false;

    /* renamed from: l */
    public boolean f350406l = false;

    /* renamed from: m */
    public boolean f350407m = false;

    /* renamed from: n */
    public Animation f350408n;

    /* renamed from: o */
    public Animation f350409o;

    /* renamed from: p */
    public AnimationSet f350410p;

    /* renamed from: q */
    public Animation f350411q;

    /* renamed from: r */
    public final Object f350412r = new Object();

    /* renamed from: s */
    public boolean f350413s = false;

    /* renamed from: t */
    public boolean f350414t = false;

    /* renamed from: u */
    public C116929b.C116930a f350415u = null;

    /* renamed from: v */
    public MMHandler f350416v = new C116935a(Looper.getMainLooper());

    /* renamed from: w */
    public CountDownTimer f350417w = new C116936b(MAlarmHandler.NEXT_FIRE_INTERVAL, 1000);

    /* renamed from: x */
    public Runnable f350418x = new C116937c();

    /* renamed from: y */
    public View f350419y;

    /* renamed from: z */
    public C116924a.C116928e f350420z = new C116941f();

    /* renamed from: gb1.e$a */
    public class C116935a extends MMHandler {
        public C116935a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                Log.m105924i("MicroMsg.NumberFaceMotion", "hy: refresh number");
                C116934e.this.mo180918p();
            }
        }
    }

    /* renamed from: gb1.e$b */
    public class C116936b extends CountDownTimer {
        public C116936b(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            Log.m105924i("MicroMsg.NumberFaceMotion", "hy: on count number finished");
        }

        public void onTick(long j) {
            Log.m105924i("MicroMsg.NumberFaceMotion", "hy: on ticked");
            C116934e eVar = C116934e.this;
            if (eVar.f350413s) {
                Log.m105928w("MicroMsg.NumberFaceMotion", "hy: isEnd. trigger cancel");
                cancel();
            } else if (eVar.f350405k) {
                Log.m105924i("MicroMsg.NumberFaceMotion", "hy: suspend.");
            } else {
                C116934e eVar2 = C116934e.this;
                Log.m105925i("MicroMsg.NumberFaceMotion", "hy: mCurrentShowedIndexInItem: %d, mItemDatas[mCurrentGroupDataIndex].length() - 1: %d, mCurrentGroupDataIndex: %d, mItemDatas.length - 1 : %d", Integer.valueOf(eVar.f350400f), Integer.valueOf(eVar2.f350398d[eVar2.f350399e].length() - 1), Integer.valueOf(C116934e.this.f350399e), Integer.valueOf(C116934e.this.f350398d.length - 1));
                C116934e eVar3 = C116934e.this;
                if (eVar3.f350400f < eVar3.f350398d[eVar3.f350399e].length() - 1) {
                    C116934e eVar4 = C116934e.this;
                    eVar4.f350400f++;
                    eVar4.f350416v.sendEmptyMessage(0);
                    return;
                }
                Log.m105924i("MicroMsg.NumberFaceMotion", "hy: last number in group");
                MMHandlerThread.postToMainThreadDelayed(C116934e.this.f350418x, 1500);
                C116934e.this.f350413s = true;
                cancel();
                C116934e.this.f350413s = true;
            }
        }
    }

    /* renamed from: gb1.e$c */
    public class C116937c implements Runnable {
        public C116937c() {
        }

        public void run() {
            synchronized (C116934e.this.f350412r) {
                C116934e eVar = C116934e.this;
                if (eVar.f350399e >= eVar.f350398d.length - 1) {
                    Log.m105924i("MicroMsg.NumberFaceMotion", "hy: already last. handle upper judge.");
                    C116934e eVar2 = C116934e.this;
                    eVar2.f350403i = true;
                    C105227i iVar = C105227i.INSTANCE;
                    byte[] O = C86013q1.m106433O(eVar2.f350397c.f350363c, -1, -1);
                    FaceProNative faceProNative = iVar.f312612d.f345985i.f345972a;
                    if (faceProNative == null) {
                        Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: set face data instance null!");
                    } else {
                        faceProNative.engineSetVoiceData(O);
                    }
                } else {
                    Log.m105924i("MicroMsg.NumberFaceMotion", "hy: startShowNext");
                    C116934e eVar3 = C116934e.this;
                    eVar3.f350399e++;
                    eVar3.f350400f = -1;
                    eVar3.mo180917o(true);
                    C116934e.this.mo180918p();
                }
            }
        }
    }

    /* renamed from: gb1.e$d */
    public class C116938d implements Animation.AnimationListener {

        /* renamed from: gb1.e$d$a */
        public class C116939a implements Runnable {
            public C116939a() {
            }

            public void run() {
                C116934e.m164973j(C116934e.this);
            }
        }

        public C116938d() {
        }

        public void onAnimationEnd(Animation animation) {
            MMHandlerThread.postToMainThreadDelayed(new C116939a(), 500);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: gb1.e$e */
    public class C116940e implements Runnable {
        public C116940e() {
        }

        public void run() {
            C116934e.m164973j(C116934e.this);
        }
    }

    /* renamed from: gb1.e$f */
    public class C116941f implements C116924a.C116928e {
        public C116941f() {
        }

        /* renamed from: a */
        public void mo180927a(int i) {
            synchronized (C116934e.this.f350412r) {
                Log.m105929w("MicroMsg.NumberFaceMotion", "hy: on voice prepare error: %d", Integer.valueOf(i));
                if (i != 11) {
                    C116934e eVar = C116934e.this;
                    eVar.f350414t = true;
                    eVar.f350415u = new C116929b.C116930a(7, MMApplicationContext.getResources().getString(C0966R.string.f361130hi2));
                } else {
                    C116934e.this.getClass();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116934e(java.lang.String r12) {
        /*
            r11 = this;
            r11.<init>()
            r0 = 0
            r11.f350395a = r0
            r1 = 0
            r11.f350396b = r1
            r11.f350397c = r0
            r11.f350398d = r0
            r11.f350399e = r1
            r11.f350400f = r1
            r11.f350401g = r0
            r11.f350402h = r0
            r11.f350403i = r1
            r2 = -1
            r11.f350404j = r2
            r11.f350405k = r1
            r11.f350406l = r1
            r11.f350407m = r1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r11.f350412r = r2
            r11.f350413s = r1
            r11.f350414t = r1
            r11.f350415u = r0
            gb1.e$a r0 = new gb1.e$a
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            r11.f350416v = r0
            gb1.e$b r0 = new gb1.e$b
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 1000(0x3e8, double:4.94E-321)
            r3 = r0
            r4 = r11
            r3.<init>(r5, r7)
            r11.f350417w = r0
            gb1.e$c r0 = new gb1.e$c
            r0.<init>()
            r11.f350418x = r0
            gb1.e$f r0 = new gb1.e$f
            r0.<init>()
            r11.f350420z = r0
            gb1.a r0 = new gb1.a
            r0.<init>()
            r11.f350397c = r0
            gb1.a$e r2 = r11.f350420z
            r0.f350361a = r2
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2130772182(0x7f0100d6, float:1.7147475E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r2)
            r11.f350408n = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2130772044(0x7f01004c, float:1.7147195E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r2)
            r11.f350409o = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2130772057(0x7f010059, float:1.7147222E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r2)
            r11.f350411q = r0
            r2 = 250(0xfa, double:1.235E-321)
            r0.setDuration(r2)
            android.view.animation.Animation r0 = r11.f350411q
            r2 = 1
            r0.setFillAfter(r2)
            r11.f350395a = r12
            if (r12 != 0) goto L_0x009a
            r12 = 0
            goto L_0x009e
        L_0x009a:
            int r12 = r12.length()
        L_0x009e:
            r11.f350396b = r12
            java.lang.String r12 = r11.f350395a
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            java.lang.String r0 = "MicroMsg.NumberFaceMotion"
            r3 = 6
            if (r12 != 0) goto L_0x00de
            int r12 = r11.f350396b
            if (r12 < r3) goto L_0x00b1
            r12 = 1
            goto L_0x00b2
        L_0x00b1:
            r12 = 0
        L_0x00b2:
            if (r12 == 0) goto L_0x00de
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r12[r1] = r5
            java.lang.String r5 = "hy: data too long. need to split into %d rounds"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r12)
            java.lang.String[] r12 = new java.lang.String[r4]
            r11.f350398d = r12
            int r12 = r11.f350396b
            int r12 = r12 / r4
            r5 = 0
        L_0x00ca:
            if (r5 >= r4) goto L_0x00e6
            java.lang.String[] r6 = r11.f350398d
            java.lang.String r7 = r11.f350395a
            int r8 = r12 * r5
            int r9 = r5 + 1
            int r10 = r12 * r9
            java.lang.String r7 = r7.substring(r8, r10)
            r6[r5] = r7
            r5 = r9
            goto L_0x00ca
        L_0x00de:
            java.lang.String[] r12 = new java.lang.String[r2]
            r11.f350398d = r12
            java.lang.String r4 = r11.f350395a
            r12[r1] = r4
        L_0x00e6:
            int r12 = r11.f350396b
            if (r12 < r3) goto L_0x00ec
            r12 = 1
            goto L_0x00ed
        L_0x00ec:
            r12 = 0
        L_0x00ed:
            if (r12 == 0) goto L_0x00ff
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2130772045(0x7f01004d, float:1.7147197E38)
            android.view.animation.Animation r12 = android.view.animation.AnimationUtils.loadAnimation(r12, r3)
            android.view.animation.AnimationSet r12 = (android.view.animation.AnimationSet) r12
            r11.f350410p = r12
            goto L_0x010e
        L_0x00ff:
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2130772046(0x7f01004e, float:1.71472E38)
            android.view.animation.Animation r12 = android.view.animation.AnimationUtils.loadAnimation(r12, r3)
            android.view.animation.AnimationSet r12 = (android.view.animation.AnimationSet) r12
            r11.f350410p = r12
        L_0x010e:
            android.view.animation.TranslateAnimation r12 = new android.view.animation.TranslateAnimation
            android.content.res.Resources r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r4 = 2131166402(0x7f0704c2, float:1.7947048E38)
            int r3 = r3.getDimensionPixelSize(r4)
            float r3 = (float) r3
            r4 = 0
            r12.<init>(r4, r4, r4, r3)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131361815(0x7f0a0017, float:1.8343393E38)
            int r3 = r3.getInteger(r4)
            long r3 = (long) r3
            r12.setDuration(r3)
            android.view.animation.AnimationSet r3 = r11.f350410p
            r3.addAnimation(r12)
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.String r2 = r11.f350395a
            r12[r1] = r2
            java.lang.String r1 = "hy: starting read number: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gb1.C116934e.<init>(java.lang.String):void");
    }

    /* renamed from: j */
    public static void m164973j(C116934e eVar) {
        eVar.f350400f = 0;
        synchronized (eVar.f350412r) {
            eVar.f350406l = false;
        }
        eVar.mo180918p();
        eVar.f350407m = true;
        if (eVar.f350399e == 0) {
            Log.m105924i("MicroMsg.NumberFaceMotion", "hy: triggered start record");
            C116924a aVar = eVar.f350397c;
            C116942f fVar = new C116942f(eVar);
            aVar.getClass();
            Log.m105924i("MicroMsg.FaceVoiceRecordLogic", "start record");
            ThreadPool.post((Runnable) new C116924a.C116927d(fVar, (C116924a.C107792a) null), "FaceVoice_record", 10);
            FaceProNative faceProNative = C105227i.INSTANCE.f312612d.f345985i.f345972a;
            if (faceProNative == null) {
                Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: startRecord not init");
            } else {
                faceProNative.engineStartRecord();
            }
        }
        MMHandlerThread.postToMainThreadDelayed(new C116943g(eVar), 2000);
    }

    /* renamed from: k */
    public static void m164974k(C116934e eVar) {
        long ticksToNow = Util.ticksToNow(eVar.f350404j);
        Log.m105924i("MicroMsg.NumberFaceMotion", "hy: delta after request");
        if (ticksToNow < 0) {
            Log.m105928w("MicroMsg.NumberFaceMotion", "hy: too fast. regard as fake");
        } else if (ticksToNow < 1000) {
            Log.m105928w("MicroMsg.NumberFaceMotion", "hy: too fast. wait until normal");
            MMHandlerThread.postToMainThreadDelayed(new C116944h(eVar), 1000 - ticksToNow);
        } else {
            eVar.f350417w.start();
        }
    }

    /* renamed from: a */
    public void mo180904a(String str) {
        ((TextView) this.f350419y.findViewById(C0966R.C0970id.ewa)).setText(str);
    }

    /* renamed from: b */
    public C116929b.C116930a mo180905b() {
        return this.f350415u;
    }

    /* renamed from: c */
    public boolean mo180906c(int i, CharSequence charSequence) {
        this.f350405k = true;
        return this.f350414t;
    }

    /* renamed from: d */
    public boolean mo180907d() {
        return this.f350403i;
    }

    /* renamed from: e */
    public C116929b.C116931b mo180908e() {
        return new C116929b.C116931b(90004, "user cancelled in processing");
    }

    /* renamed from: f */
    public boolean mo180909f(FaceCharacteristicsResult faceCharacteristicsResult) {
        this.f350405k = true;
        return this.f350414t;
    }

    /* renamed from: g */
    public void mo180910g(Context context, ViewGroup viewGroup, ViewGroup viewGroup2) {
        Log.m105918d("MicroMsg.NumberFaceMotion", "hy: on number init motion");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.a5u, viewGroup2);
        this.f350401g = inflate;
        this.f350402h = (FaceNumberView) inflate.findViewById(C0966R.C0970id.cqy);
        this.f350419y = LayoutInflater.from(context).inflate(C0966R.C0971layout.a5s, viewGroup);
        mo180916n(this.f350398d.length, -1);
        mo180915m().startAnimation(this.f350408n);
        FaceNumberView faceNumberView = this.f350402h;
        if (faceNumberView != null) {
            faceNumberView.setVisibility(0);
            this.f350402h.startAnimation(this.f350408n);
            this.f350399e = 0;
            mo180917o(false);
            this.f350400f = -1;
            mo180918p();
            Util.currentTicks();
            this.f350404j = Util.currentTicks();
            this.f350413s = false;
        }
    }

    /* renamed from: h */
    public boolean mo180911h(FaceCharacteristicsResult faceCharacteristicsResult) {
        this.f350405k = false;
        return this.f350414t;
    }

    /* renamed from: i */
    public void mo180912i() {
        FaceNumberItemView[] faceNumberItemViewArr;
        this.f350413s = true;
        this.f350414t = false;
        this.f350397c.mo180901c();
        C116924a aVar = this.f350397c;
        aVar.getClass();
        Log.m105924i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        aVar.f350361a = null;
        this.f350397c.mo180900b();
        if (C108680a.m147401e().f325476h && C108680a.m147401e().mo159700h()) {
            C116924a aVar2 = this.f350397c;
            C89658b f = C108680a.m147401e().mo159698f();
            synchronized (aVar2.f350367g) {
                aVar2.f350367g.remove(f);
            }
            if (this.f350403i) {
                C108680a.m147401e().mo159702j((C108680a.C108692h) null);
            } else {
                C108680a.m147401e().mo159697d();
            }
        }
        this.f350417w.cancel();
        this.f350416v.removeCallbacksAndMessages((Object) null);
        FaceNumberView faceNumberView = this.f350402h;
        if (faceNumberView != null && (faceNumberItemViewArr = faceNumberView.f197986g) != null && faceNumberItemViewArr.length > 0) {
            int i = 0;
            while (true) {
                FaceNumberItemView[] faceNumberItemViewArr2 = faceNumberView.f197986g;
                if (i >= faceNumberItemViewArr2.length) {
                    break;
                }
                faceNumberItemViewArr2[i].f197975d.stopped();
                i++;
            }
        }
        if (this.f350401g != null) {
            this.f350403i = false;
            this.f350401g = null;
            this.f350402h = null;
        }
    }

    /* renamed from: l */
    public final String mo180914l(int i) {
        if (i == 1) {
            return MMApplicationContext.getContext().getString(C0966R.string.cjx);
        }
        if (i == 2) {
            return MMApplicationContext.getContext().getString(C0966R.string.cjy);
        }
        if (i == 3) {
            return MMApplicationContext.getContext().getString(C0966R.string.f360404ck0);
        }
        if (i == 4) {
            return MMApplicationContext.getContext().getString(C0966R.string.f360405ck1);
        }
        Log.m105920e("MicroMsg.NumberFaceMotion", "hy: unknown length!!");
        return "";
    }

    /* renamed from: m */
    public TextView mo180915m() {
        View view = this.f350401g;
        if (view != null) {
            return (TextView) view.findViewById(C0966R.C0970id.ewa);
        }
        return null;
    }

    /* renamed from: n */
    public final void mo180916n(int i, int i2) {
        String str;
        Log.m105925i("MicroMsg.NumberFaceMotion", "alvinluo groupIndex: %d, itemDataLength: %d", Integer.valueOf(i2), Integer.valueOf(i));
        if (mo180915m() == null) {
            return;
        }
        if (i == 1) {
            mo180915m().setText(MMApplicationContext.getContext().getString(C0966R.string.ck4));
            return;
        }
        TextView m = mo180915m();
        if (i2 == -1) {
            Context context = MMApplicationContext.getContext();
            Object[] objArr = new Object[1];
            objArr[0] = i != 2 ? mo180914l(i) : MMApplicationContext.getContext().getString(C0966R.string.cjz);
            str = context.getString(C0966R.string.f360407ck3, objArr);
        } else {
            str = MMApplicationContext.getContext().getString(C0966R.string.f360406ck2, new Object[]{mo180914l(this.f350399e + 1)});
        }
        m.setText(str);
        if (i2 >= 1) {
            Log.m105925i("MicroMsg.NumberFaceMotion", "alvinluo start %d group number", Integer.valueOf(i2 + 1));
            FaceProNative faceProNative = C105227i.INSTANCE.f312612d.f345985i.f345972a;
            if (faceProNative == null) {
                Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: startRecord not init");
            } else {
                faceProNative.engineGroupChange();
            }
        }
    }

    /* renamed from: o */
    public final void mo180917o(boolean z) {
        if (this.f350402h != null) {
            mo180916n(this.f350398d.length, this.f350399e);
            this.f350402h.setNumberLengthAndInflate(this.f350398d[this.f350399e].length());
            this.f350407m = false;
            if (z) {
                this.f350408n.setAnimationListener(new C116938d());
                View view = this.f350401g;
                if (view != null) {
                    view.startAnimation(this.f350408n);
                    return;
                }
                return;
            }
            MMHandlerThread.postToMainThreadDelayed(new C116940e(), 500);
        }
    }

    /* renamed from: p */
    public final void mo180918p() {
        FaceNumberView faceNumberView = this.f350402h;
        if (faceNumberView != null) {
            int i = this.f350399e;
            if (i >= 0) {
                faceNumberView.mo94777a(this.f350398d[i].substring(0, this.f350400f + 1));
            } else {
                faceNumberView.mo94777a((String) null);
            }
        }
    }
}
