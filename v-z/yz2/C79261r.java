package yz2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import az2.C39674e;
import b03.C39693c0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.LongTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import jz2.C76452b;
import jz2.C76485k;
import k20.C9556a;
import kg3.C76577a;
import lz2.C76738b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p255vr.C65873e;
import qy2.C47894a0;
import qy2.C47896n;
import qy2.C77446d0;
import qy2.C77448f0;
import qy2.C77453j;
import qy2.C77459z;
import rx3.C13598b0;
import rz2.C48201c;
import sn0.C90259e;
import su0.C13781a;
import uz2.C52678e0;
import uz2.C52718u;
import vz2.C78501d;
import zz2.C16421b;
import zz2.C53848a;

/* renamed from: yz2.r */
public class C79261r implements C77453j, View.OnClickListener, C11385n {

    /* renamed from: A */
    public long f232686A;

    /* renamed from: d */
    public final RelativeLayout f232687d;

    /* renamed from: e */
    public final LinearLayout f232688e;

    /* renamed from: f */
    public final View f232689f;

    /* renamed from: g */
    public TextView f232690g;

    /* renamed from: h */
    public Context f232691h;

    /* renamed from: i */
    public String f232692i;

    /* renamed from: j */
    public TextView f232693j;

    /* renamed from: n */
    public C48201c f232694n;

    /* renamed from: o */
    public ImageView f232695o;

    /* renamed from: p */
    public View f232696p;

    /* renamed from: q */
    public TextView f232697q;

    /* renamed from: r */
    public C76485k f232698r;

    /* renamed from: s */
    public HashMap<TextView, ColorStateList> f232699s = new HashMap<>();

    /* renamed from: t */
    public String f232700t;

    /* renamed from: u */
    public String f232701u;

    /* renamed from: v */
    public final C47896n.C47897a f232702v;

    /* renamed from: w */
    public C47896n.C47897a f232703w;

    /* renamed from: x */
    public long f232704x;

    /* renamed from: y */
    public final boolean f232705y;

    /* renamed from: z */
    public final GestureDetector f232706z;

    /* renamed from: yz2.r$b */
    public static final class C53717b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C79261r f150824d;

        /* renamed from: e */
        public final /* synthetic */ Context f150825e;

        public C53717b(C79261r rVar, Context context) {
            this.f150824d = rVar;
            this.f150825e = context;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onContextClick() called with: res = " + onContextClick + " e = " + motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            WeakReference<C79217a> weakReference;
            C79217a aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (!this.f150824d.f232705y) {
                C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return onDoubleTap;
            }
            String a = C13781a.m13082a();
            C48201c cVar = this.f150824d.f232694n;
            if (C87412m.m108589b(a, cVar != null ? cVar.field_UserName : null)) {
                C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return onDoubleTap;
            }
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onDoubleTap() called with: res = " + onDoubleTap + " e = " + motionEvent);
            int intValue = (motionEvent != null ? Float.valueOf(motionEvent.getRawX()) : 0).intValue();
            int intValue2 = (motionEvent != null ? Float.valueOf(motionEvent.getRawY()) : 0).intValue();
            C53848a aVar2 = (C53848a) C39818r.f106831a.mo62443b(this.f150825e).mo62449e(C53848a.class);
            if (!(aVar2 == null || (weakReference = aVar2.f151087d) == null || (aVar = weakReference.get()) == null)) {
                aVar.mo109229A(intValue, intValue2, true);
            }
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
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
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
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
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "onSingleTapUp() called with: res=" + onSingleTapUp + " e = " + motionEvent);
            ((C16421b) C39818r.f106831a.mo62443b(this.f150824d.f232691h).mo75002a(C16421b.class)).mo14879c3();
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: yz2.r$e */
    public static final class C53718e implements C47896n.C47897a {

        /* renamed from: a */
        public final /* synthetic */ C79261r f150826a;

        /* renamed from: b */
        public final /* synthetic */ Context f150827b;

        public C53718e(C79261r rVar, Context context) {
            this.f150826a = rVar;
            this.f150827b = context;
        }

        /* renamed from: a */
        public void mo67431a(int i, Object obj) {
            C53848a aVar;
            WeakReference<C79217a> weakReference;
            C79217a aVar2;
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            C47896n.C47897a aVar3 = this.f150826a.f232703w;
            if (aVar3 != null) {
                aVar3.mo67431a(2, obj);
            }
            if (booleanValue && this.f150826a.f232705y && (aVar = (C53848a) C39818r.f106831a.mo62443b(this.f150827b).mo62449e(C53848a.class)) != null && (weakReference = aVar.f151087d) != null && (aVar2 = weakReference.get()) != null) {
                aVar2.mo109229A(0, 0, false);
            }
        }
    }

    /* renamed from: yz2.r$a */
    public static final class C79262a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C79261r f232707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79262a(C79261r rVar) {
            super(0);
            this.f232707d = rVar;
        }

        public Object invoke() {
            this.f232707d.mo109265t();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yz2.r$c */
    public static final class C79263c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C79261r f232708d;

        public C79263c(C79261r rVar) {
            this.f232708d = rVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/ProfileCardView$onPreOpen$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GestureDetector gestureDetector = this.f232708d.f232706z;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$onPreOpen$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$onPreOpen$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$onPreOpen$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: yz2.r$d */
    public static final class C79264d implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C79261r f232709d;

        public C79264d(C79261r rVar) {
            this.f232709d = rVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/ProfileCardView$onPreOpen$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GestureDetector gestureDetector = this.f232709d.f232706z;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$onPreOpen$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$onPreOpen$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView$onPreOpen$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    public C79261r(Context context, RelativeLayout relativeLayout, LinearLayout linearLayout, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(relativeLayout, "rootLayout");
        C87412m.m108594g(linearLayout, "headerRoot");
        this.f232687d = relativeLayout;
        this.f232688e = linearLayout;
        boolean z = false;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c9r, (ViewGroup) null, false);
        C87412m.m108593f(inflate, "from(context).inflate(getLayoutId(), null, false)");
        this.f232689f = inflate;
        this.f232691h = context;
        C47894a0 a0Var = new C47894a0();
        a0Var.mo72637c(true);
        a0Var.f128520h = false;
        C76452b bVar = new C76452b(a0Var);
        this.f232698r = bVar;
        bVar.mo106674h(inflate);
        this.f232698r.mo106712k(new C79262a(this));
        this.f232690g = (TextView) inflate.findViewById(C0966R.C0970id.kyg);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kxy);
        LongTextView longTextView = (LongTextView) inflate.findViewById(C0966R.C0970id.f359429kw2);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.kxe);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.alu);
        View findViewById = inflate.findViewById(C0966R.C0970id.alw);
        C87412m.m108593f(findViewById, "cardView.findViewById(R.id.btn_like)");
        ImageView imageView2 = (ImageView) findViewById;
        ImageView imageView3 = (ImageView) inflate.findViewById(C0966R.C0970id.f2o);
        this.f232693j = (TextView) inflate.findViewById(C0966R.C0970id.ky8);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f1g);
        C87412m.m108593f(findViewById2, "cardView.findViewById(R.id.icon_avatar_notify)");
        this.f232695o = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.f359430kw3);
        C87412m.m108593f(findViewById3, "cardView.findViewById(R.id.tv_desc_notify)");
        TextView textView3 = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.fkw);
        C87412m.m108593f(findViewById4, "cardView.findViewById(R.id.layout_notify)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.f359441kx1);
        C87412m.m108593f(findViewById5, "cardView.findViewById(R.id.tv_like_num)");
        TextView textView4 = (TextView) findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.m2q);
        C87412m.m108593f(findViewById6, "cardView.findViewById(R.id.layout_des_content)");
        this.f232696p = findViewById6;
        this.f232697q = (TextView) inflate.findViewById(C0966R.C0970id.kxw);
        ImageView imageView4 = (ImageView) inflate.findViewById(C0966R.C0970id.l2t);
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(C0966R.C0970id.fkc);
        ImageView imageView5 = this.f232695o;
        float a = (float) C76577a.m92150a(context, 10.0f);
        boolean z2 = true & true;
        z = true & true ? true : z;
        if (imageView5 != null) {
            imageView5.setOutlineProvider(new C39693c0(z2, z, a));
        }
        if (imageView5 != null) {
            imageView5.setClipToOutline(true);
        }
        C53848a aVar = (C53848a) C39818r.f106831a.mo62443b(context).mo62449e(C53848a.class);
        if (aVar != null) {
            aVar.f151088e = new WeakReference<>(this);
        }
        String ep02 = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(1);
        C87412m.m108593f(ep02, "getService(IFTSApiLogicS…atus.SessionScene.NORMAL)");
        this.f232700t = ep02;
        this.f232701u = "";
        this.f232702v = new C53718e(this, context);
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        this.f232705y = true;
        this.f232706z = new GestureDetector(this.f232691h, new C53717b(this, context));
    }

    /* renamed from: c */
    public void mo72647c() {
    }

    /* renamed from: e */
    public void mo96596e() {
        this.f232698r.getClass();
    }

    /* renamed from: f */
    public void mo72640f(C47896n.C47897a aVar) {
        this.f232703w = aVar;
    }

    public View getView() {
        return this.f232689f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0183  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72650h(java.lang.String r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0011
            boolean r4 = z04.C112551y.m153811k(r21)
            if (r4 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r4 = 0
            goto L_0x0012
        L_0x0011:
            r4 = 1
        L_0x0012:
            if (r4 == 0) goto L_0x0015
            return
        L_0x0015:
            lz2.m$k r4 = new lz2.m$k
            r4.<init>(r1, r0)
            java.lang.Class<uz2.f0> r4 = uz2.C78315f0.class
            java.lang.Class<ox.b> r5 = p640ox.C77049b.class
            di3.d r6 = di3.C86312j.m106911c(r5)
            ox.b r6 = (p640ox.C77049b) r6
            android.content.Context r7 = r0.f232691h
            dm2.c r8 = new dm2.c
            r9 = 9
            r8.<init>(r4, r9, r3)
            r6.mo72352Rp(r7, r8)
            di3.d r6 = di3.C86312j.m106911c(r5)
            ox.b r6 = (p640ox.C77049b) r6
            android.content.Context r7 = r0.f232691h
            pe3.a r6 = r6.Wi0(r7, r9, r4)
            uz2.f0 r6 = (uz2.C78315f0) r6
            if (r6 == 0) goto L_0x0049
            java.lang.String r7 = r0.f232700t
            r6.f229428d = r7
            r6.f229429e = r1
            r7 = 4
            r6.f229434j = r7
        L_0x0049:
            r0.f232692i = r1
            lz2.m$k r6 = new lz2.m$k
            r6.<init>(r1, r0)
            az2.e r6 = az2.C39674e.f106452d
            rz2.c r7 = r6.mo62253n0(r1)
            r0.f232694n = r7
            rz2.h r7 = r6.mo62255t0()
            r7.mo72971mI(r1)
            jz2.k r7 = r0.f232698r
            jz2.e r7 = (jz2.C76474e) r7
            r7.getClass()
            rz2.c r6 = r6.mo62253n0(r1)
            uz2.j0 r8 = new uz2.j0
            r8.<init>()
            boolean r1 = r7.mo106661a(r1, r6, r8)
            android.content.Context r6 = r0.f232691h
            boolean r6 = qy2.C63347a.m74685c(r6)
            r6 = r6 ^ r3
            if (r1 == 0) goto L_0x0080
            if (r6 != 0) goto L_0x0080
            r7 = 1
            goto L_0x0081
        L_0x0080:
            r7 = 0
        L_0x0081:
            r8 = -2
            r10 = 0
            if (r7 != 0) goto L_0x00b0
            android.widget.LinearLayout r7 = r0.f232688e
            int r11 = r7.getPaddingLeft()
            int r12 = r7.getPaddingTop()
            int r13 = r7.getPaddingRight()
            android.content.Context r14 = r0.f232691h
            r15 = 32
            int r14 = kg3.C76577a.m92151b(r14, r15)
            r7.setPadding(r11, r12, r13, r14)
            android.widget.RelativeLayout r7 = r0.f232687d
            if (r7 == 0) goto L_0x00a7
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            goto L_0x00a8
        L_0x00a7:
            r7 = r10
        L_0x00a8:
            if (r7 != 0) goto L_0x00ac
            goto L_0x01bf
        L_0x00ac:
            r7.height = r8
            goto L_0x01bf
        L_0x00b0:
            android.content.Context r7 = r0.f232691h
            com.tencent.p014mm.p136ui.C74783i3.m89537a(r7)
            android.widget.LinearLayout r7 = r0.f232688e
            int r11 = r7.getPaddingLeft()
            int r12 = r7.getPaddingTop()
            int r13 = r7.getPaddingRight()
            android.content.Context r14 = r0.f232691h
            r15 = 16
            int r14 = kg3.C76577a.m92151b(r14, r15)
            r7.setPadding(r11, r12, r13, r14)
            rz2.c r7 = r0.f232694n
            jz2.k r11 = r0.f232698r
            jz2.e r11 = (jz2.C76474e) r11
            qy2.i r11 = r11.mo106711c()
            boolean r7 = yz2.C79224c.m95930b(r7, r11)
            if (r7 == 0) goto L_0x00ff
            rz2.c r7 = r0.f232694n
            if (r7 == 0) goto L_0x00f9
            uz2.s r7 = r7.mo72945n2()
            java.lang.String r7 = r7.f147197d
            if (r7 == 0) goto L_0x00f3
            boolean r7 = z04.C112551y.m153811k(r7)
            if (r7 == 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            r7 = 0
            goto L_0x00f4
        L_0x00f3:
            r7 = 1
        L_0x00f4:
            r7 = r7 ^ r3
            if (r7 != r3) goto L_0x00f9
            r7 = 1
            goto L_0x00fa
        L_0x00f9:
            r7 = 0
        L_0x00fa:
            if (r7 == 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r7 = 0
            goto L_0x0100
        L_0x00ff:
            r7 = 1
        L_0x0100:
            java.lang.String r11 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            if (r7 == 0) goto L_0x013b
            android.widget.RelativeLayout r8 = r0.f232687d
            if (r8 == 0) goto L_0x010d
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            goto L_0x010e
        L_0x010d:
            r8 = r10
        L_0x010e:
            if (r8 != 0) goto L_0x0111
            goto L_0x0123
        L_0x0111:
            android.content.Context r12 = r0.f232691h
            int[] r12 = qy2.C63347a.m74683a(r12)
            r13 = r12[r3]
            float r13 = (float) r13
            r14 = 1071877689(0x3fe38e39, float:1.7777778)
            float r13 = r13 / r14
            int r13 = (int) r13
            r12[r3] = r13
            r8.height = r13
        L_0x0123:
            android.view.View r8 = r0.f232696p
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            r8.height = r2
            android.view.View r8 = r0.f232696p
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            gy3.C87412m.m108592e(r8, r11)
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            r11 = 1065353216(0x3f800000, float:1.0)
            r8.weight = r11
            goto L_0x0160
        L_0x013b:
            android.widget.RelativeLayout r12 = r0.f232687d
            if (r12 == 0) goto L_0x0144
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            goto L_0x0145
        L_0x0144:
            r12 = r10
        L_0x0145:
            if (r12 != 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r12.height = r8
        L_0x014a:
            android.view.View r12 = r0.f232696p
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            r12.height = r8
            android.view.View r8 = r0.f232696p
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            gy3.C87412m.m108592e(r8, r11)
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            r11 = 0
            r8.weight = r11
        L_0x0160:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "fixLayout isStaticCardHeight:"
            r8.append(r11)
            r8.append(r7)
            java.lang.String r7 = " rootHeight:"
            r8.append(r7)
            android.widget.RelativeLayout r7 = r0.f232687d
            if (r7 == 0) goto L_0x0183
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            if (r7 == 0) goto L_0x0183
            int r7 = r7.height
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0184
        L_0x0183:
            r7 = r10
        L_0x0184:
            r8.append(r7)
            java.lang.String r7 = " layoutCenterHeight:"
            r8.append(r7)
            android.view.View r7 = r0.f232696p
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            int r7 = r7.height
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "MicroMsg.TextStatus.StatusCardView"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r7)
            android.widget.RelativeLayout r7 = r0.f232687d
            if (r7 == 0) goto L_0x01b5
            r8 = 2131316062(0x7f094d5e, float:1.8250595E38)
            android.view.View r7 = r7.findViewById(r8)
            if (r7 == 0) goto L_0x01b5
            yz2.s r8 = new yz2.s
            r8.<init>(r0)
            r7.setOnClickListener(r8)
        L_0x01b5:
            android.widget.RelativeLayout r7 = r0.f232687d
            yz2.t r8 = new yz2.t
            r8.<init>(r0)
            r7.setOnClickListener(r8)
        L_0x01bf:
            android.view.View r7 = r0.f232689f
            r8 = 8
            if (r6 == 0) goto L_0x01c8
            r11 = 8
            goto L_0x01c9
        L_0x01c8:
            r11 = 0
        L_0x01c9:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15.mo10233c(r11)
            java.lang.Object[] r12 = r15.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/textstatus/ui/ProfileCardView"
            java.lang.String r14 = "initData"
            java.lang.String r16 = "(Ljava/lang/String;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r11 = r7
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r9 = r9.mo10231a(r2)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.setVisibility(r9)
            java.lang.String r12 = "com/tencent/mm/plugin/textstatus/ui/ProfileCardView"
            java.lang.String r13 = "initData"
            java.lang.String r14 = "(Ljava/lang/String;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            if (r6 == 0) goto L_0x023c
            java.util.HashMap<android.widget.TextView, android.content.res.ColorStateList> r1 = r0.f232699s
            if (r1 != 0) goto L_0x0218
            goto L_0x037e
        L_0x0218:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0220:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x037e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r2 = r2.getValue()
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r3.setTextColor(r2)
            goto L_0x0220
        L_0x023c:
            if (r1 != 0) goto L_0x02a6
            android.view.View r1 = r0.f232689f
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3.mo10233c(r4)
            java.lang.Object[] r5 = r3.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/textstatus/ui/ProfileCardView"
            java.lang.String r7 = "initData"
            java.lang.String r8 = "(Ljava/lang/String;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r3.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r5 = "com/tencent/mm/plugin/textstatus/ui/ProfileCardView"
            java.lang.String r6 = "initData"
            java.lang.String r7 = "(Ljava/lang/String;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            java.util.HashMap<android.widget.TextView, android.content.res.ColorStateList> r1 = r0.f232699s
            if (r1 != 0) goto L_0x0282
            goto L_0x037e
        L_0x0282:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x028a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x037e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r2 = r2.getValue()
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r3.setTextColor(r2)
            goto L_0x028a
        L_0x02a6:
            android.view.View r1 = r0.f232689f
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6.mo10233c(r7)
            java.lang.Object[] r12 = r6.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/textstatus/ui/ProfileCardView"
            java.lang.String r14 = "initData"
            java.lang.String r15 = "(Ljava/lang/String;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r6 = r6.mo10231a(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.setVisibility(r6)
            java.lang.String r12 = "com/tencent/mm/plugin/textstatus/ui/ProfileCardView"
            java.lang.String r13 = "initData"
            java.lang.String r14 = "(Ljava/lang/String;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            b03.e0 r1 = b03.C67130e0.f192743a
            android.widget.LinearLayout r6 = r0.f232688e
            r7 = -1
            java.util.HashMap<android.widget.TextView, android.content.res.ColorStateList> r8 = r0.f232699s
            r1.mo91235a(r6, r7, r8)
            b03.c r1 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            rz2.c r6 = r0.f232694n
            if (r6 == 0) goto L_0x02fa
            uz2.e0 r10 = p773yy.C66710j.C53637a.m60171a(r6, r2, r3, r10)
        L_0x02fa:
            java.lang.String r1 = r1.mo62301m(r10)
            android.widget.TextView r2 = r0.f232690g
            if (r2 != 0) goto L_0x0303
            goto L_0x031e
        L_0x0303:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r6 = r0.f232691h
            r7 = 2131837972(0x7f114414, float:1.9309154E38)
            java.lang.String r6 = r6.getString(r7)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
        L_0x031e:
            android.view.View r1 = r0.f232689f
            r1.setOnClickListener(r0)
            android.widget.TextView r1 = r0.f232697q
            if (r1 == 0) goto L_0x032a
            r1.setOnClickListener(r0)
        L_0x032a:
            di3.d r1 = di3.C86312j.m106911c(r5)
            ox.b r1 = (p640ox.C77049b) r1
            android.content.Context r2 = r0.f232691h
            r3 = 9
            pe3.a r1 = r1.Wi0(r2, r3, r4)
            uz2.f0 r1 = (uz2.C78315f0) r1
            if (r1 == 0) goto L_0x037e
            java.lang.String r2 = r1.f229428d
            java.lang.String r3 = r0.f232701u
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0347
            goto L_0x037e
        L_0x0347:
            vz2.d r3 = vz2.C78501d.f229945a
            android.content.Context r4 = r0.f232691h
            r5 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 508(0x1fc, float:7.12E-43)
            r19 = 0
            vz2.C78501d.m94806h(r3, r4, r5, r7, r8, r9, r11, r13, r15, r17, r18, r19)
            long r2 = eb0.C31543z5.m39453c()
            r0.f232704x = r2
            java.lang.String r2 = r1.f229428d
            java.lang.String r3 = "it.sessionId"
            gy3.C87412m.m108593f(r2, r3)
            r0.f232701u = r2
            java.lang.Class<mm.h> r2 = p606mm.C99933h.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x037e }
            mm.h r2 = (p606mm.C99933h) r2     // Catch:{ all -> 0x037e }
            java.lang.String r3 = "TextStatusCardExposed"
            r4 = 9
            r2.mo84407yo(r4, r3, r1)     // Catch:{ all -> 0x037e }
        L_0x037e:
            jz2.k r1 = r0.f232698r
            qy2.n$a r2 = r0.f232702v
            jz2.e r1 = (jz2.C76474e) r1
            r1.f223871X = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79261r.mo72650h(java.lang.String):void");
    }

    /* renamed from: i */
    public void mo96597i(int i) {
        this.f232698r.getClass();
    }

    /* renamed from: j */
    public boolean mo107629j(View view, View view2) {
        return !C87412m.m108589b(view, this.f232687d) && !C87412m.m108589b(view2, this.f232688e);
    }

    /* renamed from: k */
    public void mo72648k() {
    }

    /* renamed from: m */
    public void mo72649m() {
    }

    /* renamed from: n */
    public void mo96598n() {
        this.f232698r.getClass();
    }

    /* renamed from: o */
    public void mo72642o(boolean z) {
    }

    public void onBackPressed() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/ProfileCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.kin) {
            mo109265t();
        } else if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.kxw || C39674e.f106452d.mo62253n0(this.f232692i) == null)) {
            C77459z zVar = new C77459z();
            zVar.f229403h = this.f232700t;
            zVar.f229411s = 2;
            zVar.f229412t = this.f232692i;
            zVar.f229402g = true;
            zVar.f229404i = 13;
            C52718u uVar = zVar.f229399d;
            C52678e0 e0Var = uVar != null ? uVar.f147238g : null;
            if (e0Var != null) {
                C48201c cVar = this.f232694n;
                e0Var.f147088e = cVar != null ? cVar.field_IconID : null;
            }
            C77446d0.f225875a.mo107615b(this.f232691h, zVar, (ResultReceiver) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/ProfileCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onPostClose() {
        ((C76452b) this.f232698r).onPostClose();
        TextView textView = this.f232697q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f232693j;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if ((((r9 == null ? 0 : r9.longValue()) & 4) != 0) == true) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostOpen(boolean r9) {
        /*
            r8 = this;
            jz2.k r0 = r8.f232698r
            jz2.b r0 = (jz2.C76452b) r0
            r0.onPostOpen(r9)
            java.lang.String r9 = r8.f232692i
            java.lang.String r0 = su0.C13781a.m13082a()
            boolean r9 = android.text.TextUtils.equals(r9, r0)
            r0 = 0
            if (r9 != 0) goto L_0x0045
            boolean r9 = r8.mo109266w()
            if (r9 == 0) goto L_0x0045
            rz2.c r9 = r8.f232694n
            r1 = 1
            if (r9 == 0) goto L_0x0038
            java.lang.Long r9 = r9.field_option
            r2 = 0
            if (r9 != 0) goto L_0x0027
            r4 = r2
            goto L_0x002b
        L_0x0027:
            long r4 = r9.longValue()
        L_0x002b:
            r6 = 4
            long r4 = r4 & r6
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x0034
            r9 = 1
            goto L_0x0035
        L_0x0034:
            r9 = 0
        L_0x0035:
            if (r9 != r1) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            if (r1 == 0) goto L_0x0045
            android.widget.TextView r9 = r8.f232697q
            if (r9 != 0) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            r1 = 8
            r9.setVisibility(r1)
        L_0x0045:
            android.widget.TextView r9 = r8.f232693j
            if (r9 != 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            r9.setVisibility(r0)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79261r.onPostOpen(boolean):void");
    }

    public void onPreClose() {
        ((C76452b) this.f232698r).onPreClose();
        this.f232689f.setClickable(true);
        View findViewById = this.f232687d.findViewById(C0966R.C0970id.f359475l31);
        if (findViewById != null) {
            findViewById.setOnTouchListener((View.OnTouchListener) null);
        }
        this.f232687d.setOnTouchListener((View.OnTouchListener) null);
    }

    public void onPreOpen() {
        ((C76452b) this.f232698r).onPreOpen();
        this.f232689f.setClickable(false);
        View findViewById = this.f232687d.findViewById(C0966R.C0970id.f359475l31);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new C79263c(this));
        }
        this.f232687d.setOnTouchListener(new C79264d(this));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        if (yVar instanceof C76738b) {
            C89137b0 d = C86709a0.m107524d();
            ((C76738b) yVar).getClass();
            d.mo123470p(5293, this);
            if (i == 0 && i2 == 0) {
                z = true;
            } else {
                Context context = this.f232691h;
                C76879j.m92748s(context, context.getString(C0966R.string.jzj), "");
                z = false;
            }
            C47896n.C47897a aVar = this.f232703w;
            if (aVar != null) {
                aVar.mo67431a(0, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: p */
    public void mo72644p(long j) {
        long c = C31543z5.m39453c();
        long j2 = this.f232704x;
        long j3 = c - j2;
        C78501d.m94806h(C78501d.f229945a, this.f232691h, 2, (String) null, (C48201c) null, j, (j3 < 0 || j2 == 0) ? 0 : j3, 0, 0, (Integer) null, 460, (Object) null);
    }

    /* renamed from: q */
    public void mo96603q(int i) {
        this.f232698r.getClass();
    }

    /* renamed from: s */
    public void mo72645s(boolean z) {
    }

    /* renamed from: t */
    public final void mo109265t() {
        if (!TextUtils.equals(this.f232692i, C13781a.m13082a()) && mo109266w()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - this.f232686A) >= 1000) {
                this.f232686A = currentTimeMillis;
            }
        }
    }

    /* renamed from: u */
    public void mo96604u(int i) {
        this.f232698r.getClass();
    }

    /* renamed from: v */
    public void mo106676v(float f, float f2, float f3) {
        ((C76452b) this.f232698r).mo106676v(f, f2, f3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r2.mo87469l() == true) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009d, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r2) != false) goto L_0x003b;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo109266w() {
        /*
            r7 = this;
            rz2.c r0 = r7.f232694n
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = r7.f232692i
            if (r2 != 0) goto L_0x000b
            return r1
        L_0x000b:
            int r3 = r0.field_MediaType
            java.lang.String r4 = "thumb"
            r5 = 1
            if (r3 == r5) goto L_0x0067
            r6 = 2
            if (r3 == r6) goto L_0x003f
            jz2.k r2 = r7.f232698r
            jz2.e r2 = (jz2.C76474e) r2
            qy2.i r2 = r2.mo106711c()
            if (r2 == 0) goto L_0x0028
            boolean r2 = r2.mo84146j()
            if (r2 != r5) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            if (r2 == 0) goto L_0x00a0
            jz2.k r2 = r7.f232698r
            jz2.e r2 = (jz2.C76474e) r2
            qy2.i r2 = r2.mo106711c()
            if (r2 == 0) goto L_0x003c
            boolean r2 = r2.mo87469l()
            if (r2 != r5) goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            r5 = r1
            goto L_0x00a0
        L_0x003f:
            b03.f r3 = b03.C39696f.f106501a
            java.lang.String r2 = r3.mo62321d(r4, r2)
            java.lang.String r3 = r0.field_MediaThumbUrl
            if (r3 == 0) goto L_0x0052
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r3 = 0
            goto L_0x0053
        L_0x0052:
            r3 = 1
        L_0x0053:
            if (r3 != 0) goto L_0x00a0
            java.lang.String r3 = r0.field_MediaUrl
            if (r3 == 0) goto L_0x005f
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x0060
        L_0x005f:
            r1 = 1
        L_0x0060:
            if (r1 != 0) goto L_0x00a0
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            goto L_0x00a0
        L_0x0067:
            b03.f r3 = b03.C39696f.f106501a
            java.lang.String r4 = r3.mo62321d(r4, r2)
            java.lang.String r6 = "image"
            java.lang.String r2 = r3.mo62321d(r6, r2)
            java.lang.String r3 = r0.field_MediaThumbUrl
            if (r3 == 0) goto L_0x0080
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r3 = 0
            goto L_0x0081
        L_0x0080:
            r3 = 1
        L_0x0081:
            if (r3 != 0) goto L_0x00a0
            java.lang.String r3 = r0.field_MediaUrl
            if (r3 == 0) goto L_0x0090
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r3 = 0
            goto L_0x0091
        L_0x0090:
            r3 = 1
        L_0x0091:
            if (r3 != 0) goto L_0x00a0
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r3 == 0) goto L_0x003c
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x003c
            goto L_0x003b
        L_0x00a0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isCanRef:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " mtpe:"
            r1.append(r2)
            int r0 = r0.field_MediaType
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.TextStatus.StatusCardView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79261r.mo109266w():boolean");
    }
}
