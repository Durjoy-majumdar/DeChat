package com.tencent.p014mm.plugin.ball.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw0.C103925l;
import aw0.C103926n;
import bw0.C104175n;
import bw0.C104176o;
import bw0.C104177p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.p1099ui.C105061b;
import com.tencent.p014mm.plugin.ball.p1099ui.C105070f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArraySet;
import kg3.C76577a;
import p385u2.C111105a;
import uv0.C111231e;
import vv0.C78486g;
import vv0.C78487h;
import xv0.C112184g;
import yv0.C112506c;
import yv0.C112507d;

/* renamed from: com.tencent.mm.plugin.ball.view.FloatMenuView */
public class FloatMenuView extends RelativeLayout implements C112184g {

    /* renamed from: F */
    public static final /* synthetic */ int f312029F = 0;

    /* renamed from: A */
    public int f312030A;

    /* renamed from: B */
    public boolean f312031B;

    /* renamed from: C */
    public volatile boolean f312032C;

    /* renamed from: D */
    public ResultReceiver f312033D;

    /* renamed from: E */
    public boolean f312034E;

    /* renamed from: d */
    public int f312035d;

    /* renamed from: e */
    public int f312036e;

    /* renamed from: f */
    public RecyclerView f312037f;

    /* renamed from: g */
    public C111231e f312038g;

    /* renamed from: h */
    public LinearLayoutManager f312039h;

    /* renamed from: i */
    public List<BallInfo> f312040i;

    /* renamed from: j */
    public Set<C112506c> f312041j;

    /* renamed from: n */
    public C112507d f312042n;

    /* renamed from: o */
    public LayoutAnimationController f312043o;

    /* renamed from: p */
    public LayoutAnimationController f312044p;

    /* renamed from: q */
    public LayoutAnimationController f312045q;

    /* renamed from: r */
    public LayoutAnimationController f312046r;

    /* renamed from: s */
    public int f312047s;

    /* renamed from: t */
    public int f312048t;

    /* renamed from: u */
    public boolean f312049u;

    /* renamed from: v */
    public boolean f312050v;

    /* renamed from: w */
    public String f312051w;

    /* renamed from: x */
    public boolean f312052x;

    /* renamed from: y */
    public Vibrator f312053y;

    /* renamed from: z */
    public View f312054z;

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatMenuView$a */
    public class C105105a extends AnimatorListenerAdapter {
        public C105105a() {
        }

        public void onAnimationEnd(Animator animator) {
            FloatMenuView.m141106a(FloatMenuView.this, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatMenuView$b */
    public class C105106b extends AnimatorListenerAdapter {
        public C105106b() {
        }

        public void onAnimationEnd(Animator animator) {
            FloatMenuView.m141106a(FloatMenuView.this, false);
            FloatMenuView.this.f312033D = null;
        }
    }

    public FloatMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m141106a(FloatMenuView floatMenuView, boolean z) {
        if (floatMenuView.f312033D != null) {
            Bundle bundle = null;
            if (!z) {
                bundle = new Bundle();
                bundle.putBoolean("can_add_float_ball_when_hide", floatMenuView.f312034E);
                floatMenuView.f312034E = false;
            }
            floatMenuView.f312033D.send(z ? 1 : 2, bundle);
        }
    }

    /* renamed from: B */
    public void mo145544B(List<BallInfo> list, BallInfo ballInfo) {
        Vector vector;
        List<BallInfo> f = C103925l.m138632f(C103925l.m138631e(list));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            Vector vector2 = (Vector) f;
            if (i >= vector2.size()) {
                break;
            }
            BallInfo ballInfo2 = (BallInfo) vector2.get(i);
            sb.append(ballInfo2.f311688f);
            sb.append(ballInfo2.f311686d);
            sb.append(ballInfo2.f311695p);
            sb.append(ballInfo2.f311698s);
            sb.append(ballInfo2.f311699t);
            sb.append(ballInfo2.f311701v);
            sb.append(ballInfo2.f311679D);
            sb.append(ballInfo2.f311680E);
            sb.append(ballInfo2.f311681F);
            sb.append(ballInfo2.f311702w);
            sb.append("|");
            i++;
        }
        String mD5String = MD5Util.getMD5String(sb.toString());
        if (Util.isEqual(mD5String, this.f312051w)) {
            Log.m105924i("MicroMsg.FloatMenuView", "FloatMenuView ignore refresh");
            return;
        }
        this.f312051w = mD5String;
        this.f312040i = f;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(C103925l.m138627a(f) ? this.f312040i.size() : 0);
        Log.m105925i("MicroMsg.FloatMenuView", "menuBallInfoList, size:%s", objArr);
        C111231e eVar = this.f312038g;
        eVar.f333089g = this.f312040i;
        eVar.notifyDataSetChanged();
        if (C103925l.m138629c(list, ballInfo)) {
            Log.m105924i("MicroMsg.FloatBallUtil", "filterBallInfoListForFloatMenu, single ball info true");
            vector = new Vector();
        } else if (C103925l.m138627a(list)) {
            Vector vector3 = new Vector();
            for (BallInfo next : list) {
                if (!next.f311681F) {
                    vector3.add(next);
                }
            }
            vector = vector3;
        } else {
            vector = new Vector();
        }
        if (!C103925l.m138627a(vector)) {
            mo149359b((AnimatorListenerAdapter) null);
        } else {
            mo149367i(this.f312035d, this.f312036e);
        }
    }

    /* renamed from: b */
    public void mo149359b(AnimatorListenerAdapter animatorListenerAdapter) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(animatorListenerAdapter);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "hide", "(Landroid/animation/AnimatorListenerAdapter;)V", this, array);
        if (getVisibility() == 8) {
            Log.m105924i("MicroMsg.FloatMenuView", "float menu already hide");
            C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "hide", "(Landroid/animation/AnimatorListenerAdapter;)V");
            return;
        }
        if (this.f312049u) {
            this.f312037f.setLayoutAnimation(this.f312044p);
        } else {
            this.f312037f.setLayoutAnimation(this.f312046r);
        }
        this.f312037f.startLayoutAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new C78486g(this, animatorListenerAdapter));
        ofFloat.addListener(new C105106b());
        ofFloat.start();
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "hide", "(Landroid/animation/AnimatorListenerAdapter;)V");
    }

    /* renamed from: c */
    public final void mo149360c() {
        Iterator it = ((CopyOnWriteArraySet) this.f312041j).iterator();
        while (it.hasNext()) {
            ((C112506c) it.next()).mo149208c();
        }
    }

    /* renamed from: d */
    public final void mo149361d(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        View D0 = this.f312037f.mo17019D0(rawX - ((float) this.f312037f.getLeft()), rawY - ((float) this.f312037f.getTop()));
        if (D0 != null) {
            mo149363e(this.f312037f.mo17029N0(D0), D0);
        } else {
            mo149363e(-1, (View) null);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if ((keyEvent.getKeyCode() != 4 && keyEvent.getKeyCode() != 3 && keyEvent.getKeyCode() != 82) || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        mo149360c();
        return true;
    }

    /* renamed from: e */
    public final void mo149363e(int i, View view) {
        if (i == -1) {
            mo149364f(this.f312054z);
        } else if (i != this.f312030A) {
            mo149364f(this.f312054z);
            if (view != null) {
                view.clearAnimation();
                if ((view.getTag() instanceof BallInfo) && !((BallInfo) view.getTag()).f311680E) {
                    view.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100).start();
                    Vibrator vibrator = this.f312053y;
                    if (vibrator != null) {
                        vibrator.vibrate(10);
                    }
                }
            }
        }
        this.f312030A = i;
        this.f312054z = view;
    }

    /* renamed from: f */
    public final void mo149364f(View view) {
        if (view != null) {
            view.clearAnimation();
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
        }
    }

    /* renamed from: g */
    public void mo149365g(AnimatorListenerAdapter animatorListenerAdapter) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(animatorListenerAdapter);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "show", "(Landroid/animation/AnimatorListenerAdapter;)V", this, array);
        mo149366h(animatorListenerAdapter, (ResultReceiver) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "show", "(Landroid/animation/AnimatorListenerAdapter;)V");
    }

    /* renamed from: h */
    public void mo149366h(AnimatorListenerAdapter animatorListenerAdapter, ResultReceiver resultReceiver) {
        if (getVisibility() == 0) {
            Log.m105924i("MicroMsg.FloatMenuView", "float menu already show");
            return;
        }
        this.f312033D = resultReceiver;
        setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new C78487h(this, animatorListenerAdapter));
        ofFloat.addListener(new C105105a());
        ofFloat.start();
        if (this.f312049u) {
            this.f312037f.setLayoutAnimation(this.f312043o);
        } else {
            this.f312037f.setLayoutAnimation(this.f312045q);
        }
        this.f312037f.startLayoutAnimation();
        if (C103925l.m138627a(this.f312040i)) {
            Iterator it = ((Vector) this.f312040i).iterator();
            while (it.hasNext()) {
                BallInfo ballInfo = (BallInfo) it.next();
                Iterator it4 = ((CopyOnWriteArraySet) this.f312041j).iterator();
                while (it4.hasNext()) {
                    ((C112506c) it4.next()).mo149206H(ballInfo);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo149367i(int i, int i2) {
        this.f312035d = i;
        this.f312036e = i2;
        C103926n.C103927a aVar = C103926n.C103927a.TOP_LEFT;
        C103926n.C103927a aVar2 = C103926n.C103927a.BOTTOM_LEFT;
        if (this.f312037f != null) {
            if (getVisibility() == 0) {
                Log.m105924i("MicroMsg.FloatMenuView", "updateMenuContentView, ignore when visible");
                return;
            }
            this.f312032C = false;
            int i3 = this.f312048t;
            if (i3 == 0) {
                i3 = C103926n.f307292b;
            }
            int size = C103925l.m138627a(this.f312040i) ? ((Vector) this.f312040i).size() * this.f312047s : 0;
            int i4 = this.f312035d;
            int i5 = this.f312036e;
            Context context = MMApplicationContext.getContext();
            Point point = new Point(C76577a.m92145A(context), C76577a.m92159j(context));
            int i6 = point.x / 2;
            int i7 = point.y / 2;
            int i8 = i5 + (i3 / 2);
            C103926n.C103927a aVar3 = (i4 > i6 || i8 > i7) ? i4 <= i6 ? aVar2 : i8 <= i7 ? C103926n.C103927a.TOP_RIGHT : C103926n.C103927a.BOTTOM_RIGHT : aVar;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int j = C76577a.m92159j(MMApplicationContext.getContext());
            int i9 = C103926n.f307291a;
            int i15 = j - i9;
            int i16 = this.f312036e;
            int i17 = i3 + i16;
            if (i17 + size > i15) {
                int i18 = i16 - size;
                if (i18 >= C103926n.f307301k) {
                    this.f312032C = i18 < i9;
                    if (i18 >= i9) {
                        i9 = i18;
                    }
                    if (aVar3 == aVar || aVar3 == aVar2) {
                        layoutParams.setMargins(0, 0, 0, 0);
                        layoutParams.leftMargin = 0;
                        layoutParams.topMargin = i9;
                        layoutParams.addRule(9);
                        this.f312043o.setOrder(1);
                    } else {
                        layoutParams.setMargins(0, 0, 0, 0);
                        layoutParams.rightMargin = 0;
                        layoutParams.topMargin = i9;
                        layoutParams.addRule(11);
                        this.f312045q.setOrder(1);
                    }
                    this.f312039h.mo16927Y(true);
                    this.f312037f.setLayoutManager(this.f312039h);
                } else {
                    int i19 = i15 - size;
                    this.f312032C = i19 < i9;
                    if (i19 >= i9) {
                        i9 = i19;
                    }
                    if (aVar3 == aVar || aVar3 == aVar2) {
                        layoutParams.setMargins(0, 0, 0, 0);
                        layoutParams.leftMargin = 0;
                        layoutParams.topMargin = i9;
                        layoutParams.addRule(9);
                        this.f312043o.setOrder(0);
                    } else {
                        layoutParams.setMargins(0, 0, 0, 0);
                        layoutParams.rightMargin = 0;
                        layoutParams.topMargin = i9;
                        layoutParams.addRule(11);
                        this.f312045q.setOrder(0);
                    }
                    this.f312039h.mo16927Y(false);
                    this.f312037f.setLayoutManager(this.f312039h);
                }
            } else {
                if (aVar3 == aVar || aVar3 == aVar2) {
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.leftMargin = 0;
                    layoutParams.topMargin = i17;
                    layoutParams.addRule(9);
                    this.f312043o.setOrder(0);
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.rightMargin = 0;
                    layoutParams.topMargin = i17;
                    layoutParams.addRule(11);
                    this.f312045q.setOrder(0);
                }
                this.f312039h.mo16927Y(false);
                this.f312037f.setLayoutManager(this.f312039h);
            }
            Log.m105925i("MicroMsg.FloatMenuView", "updateMenuContentView, anchorView:[%s, %s], margins:[%s, %s, %s, %s], enableScroll:%b", Integer.valueOf(this.f312035d), Integer.valueOf(this.f312036e), Integer.valueOf(layoutParams.leftMargin), Integer.valueOf(layoutParams.topMargin), Integer.valueOf(layoutParams.rightMargin), Integer.valueOf(layoutParams.bottomMargin), Boolean.valueOf(this.f312032C));
            this.f312037f.setLayoutParams(layoutParams);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        Iterator it = ((CopyOnWriteArraySet) this.f312041j).iterator();
        while (it.hasNext()) {
            ((C112506c) it.next()).onOrientationChange(i);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C112507d dVar = this.f312042n;
        if (dVar != null) {
            C105061b bVar = (C105061b) dVar;
            Log.m105919d("MicroMsg.FloatBallContainer", "alvinluo onMeasure floatMenuView height: %d", Integer.valueOf(bVar.f311830a.f311846d.getMeasuredHeight()));
            int measuredHeight = bVar.f311830a.f311846d.getMeasuredHeight();
            C105070f fVar = bVar.f311830a;
            if (measuredHeight != fVar.f311847e) {
                fVar.f311847e = fVar.f311846d.getMeasuredHeight();
                C105070f fVar2 = bVar.f311830a;
                fVar2.f311844b.mo149117e(fVar2.f311847e);
            }
        }
    }

    public void setCanAddFloatBallWhenHide(boolean z) {
        this.f312034E = z;
    }

    public void setForceShowFloatMenu(boolean z) {
        this.f312031B = z;
    }

    public void setInLongPressMode(boolean z) {
        this.f312050v = z;
        C111231e eVar = this.f312038g;
        eVar.f333088f = z;
        eVar.notifyDataSetChanged();
    }

    public void setOnMeasuredListener(C112507d dVar) {
        this.f312042n = dVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            Log.m105924i("MicroMsg.FloatMenuView", "setVisibility, updateMenuContentView when GONE");
            mo149367i(this.f312035d, this.f312036e);
            setForceShowFloatMenu(false);
        }
    }

    public FloatMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f312041j = new CopyOnWriteArraySet();
        this.f312042n = null;
        this.f312052x = true;
        this.f312030A = -1;
        this.f312031B = false;
        this.f312032C = false;
        this.f312033D = null;
        this.f312034E = false;
        View.inflate(context, C0966R.C0971layout.b4c, this);
        setBackgroundColor(C111105a.m151500b(context, C0966R.color.f3466u5));
        setOnClickListener(new C104175n(this));
        this.f312053y = (Vibrator) context.getSystemService("vibrator");
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.grq);
        this.f312037f = recyclerView;
        recyclerView.setOverScrollMode(2);
        setClipChildren(false);
        this.f312037f.setClipChildren(false);
        C111231e eVar = new C111231e(context);
        this.f312038g = eVar;
        boolean z = this.f312052x;
        eVar.f333091i = z;
        if (!z) {
            this.f312037f.setItemAnimator((RecyclerView.C16616j) null);
        } else {
            C105107a aVar = new C105107a(this);
            C55570b bVar = new C55570b();
            bVar.f44807c = 200;
            bVar.f44808d = 200;
            bVar.f44810f = 200;
            bVar.f44809e = 160;
            bVar.f158224s = aVar;
            this.f312038g.f333092j = aVar;
            this.f312037f.setItemAnimator(bVar);
        }
        C111231e eVar2 = this.f312038g;
        eVar2.f333090h = new C104176o(this);
        this.f312037f.setAdapter(eVar2);
        C104177p pVar = new C104177p(this, context);
        this.f312039h = pVar;
        pVar.mo16974W(1);
        this.f312037f.setLayoutManager(this.f312039h);
        this.f312047s = C76577a.m92155f(context, C0966R.dimen.a_m) + C76577a.m92155f(context, C0966R.dimen.f357033aa2) + C76577a.m92155f(context, C0966R.dimen.f357031aa0);
        this.f312043o = AnimationUtils.loadLayoutAnimation(context, C0966R.C0968anim.f2409cc);
        this.f312045q = AnimationUtils.loadLayoutAnimation(context, C0966R.C0968anim.f2410cd);
        this.f312044p = AnimationUtils.loadLayoutAnimation(context, C0966R.C0968anim.f2407ca);
        this.f312046r = AnimationUtils.loadLayoutAnimation(context, C0966R.C0968anim.f2408cb);
    }
}
