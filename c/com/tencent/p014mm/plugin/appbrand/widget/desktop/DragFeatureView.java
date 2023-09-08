package com.tencent.p014mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import dt0.C75447f;
import dt0.C75455n;
import dt0.C75456p;
import dt0.o$$a;
import et0.C75660c;
import et0.C75661d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView */
public abstract class DragFeatureView extends FrameLayout implements GestureDetector.OnGestureListener, View.OnTouchListener {

    /* renamed from: F */
    public static float f197287F = Float.MAX_VALUE;

    /* renamed from: A */
    public boolean f197288A = false;

    /* renamed from: B */
    public Runnable f197289B;

    /* renamed from: C */
    public Rect f197290C = new Rect();

    /* renamed from: D */
    public Paint f197291D = new Paint();

    /* renamed from: E */
    public Animator.AnimatorListener f197292E = new C68682b();

    /* renamed from: d */
    public int f197293d = (C76577a.m92155f(getContext(), C0966R.dimen.f4074qk) + C76577a.m92155f(getContext(), C0966R.dimen.f4073qj));

    /* renamed from: e */
    public Runnable f197294e;

    /* renamed from: f */
    public C75660c f197295f;

    /* renamed from: g */
    public RecyclerView f197296g;

    /* renamed from: h */
    public GestureDetector f197297h;

    /* renamed from: i */
    public RecyclerView.C16631z f197298i;

    /* renamed from: j */
    public int f197299j = -1;

    /* renamed from: n */
    public Vibrator f197300n;

    /* renamed from: o */
    public View f197301o;

    /* renamed from: p */
    public Rect f197302p = new Rect();

    /* renamed from: q */
    public Rect f197303q = new Rect();

    /* renamed from: r */
    public Rect f197304r = new Rect();

    /* renamed from: s */
    public Vibrator f197305s = ((Vibrator) getContext().getSystemService("vibrator"));

    /* renamed from: t */
    public boolean f197306t = true;

    /* renamed from: u */
    public C68683c f197307u;

    /* renamed from: v */
    public C68683c f197308v;

    /* renamed from: w */
    public boolean f197309w = false;

    /* renamed from: x */
    public boolean f197310x = false;

    /* renamed from: y */
    public boolean f197311y = false;

    /* renamed from: z */
    public boolean f197312z = true;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$a */
    public class C68681a implements Runnable {
        public C68681a() {
        }

        public void run() {
            DragFeatureView.this.setVisibility(8);
            DragFeatureView dragFeatureView = DragFeatureView.this;
            dragFeatureView.f197301o = null;
            dragFeatureView.f197289B = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$b */
    public class C68682b implements Animator.AnimatorListener {
        public C68682b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            DragFeatureView dragFeatureView = DragFeatureView.this;
            float f = DragFeatureView.f197287F;
            dragFeatureView.mo94443i();
            DragFeatureView.this.requestLayout();
            DragFeatureView.this.post(new o$$a(this));
            DragFeatureView dragFeatureView2 = DragFeatureView.this;
            if (dragFeatureView2.f197288A) {
                RecyclerView recyclerView = dragFeatureView2.f197296g;
                if (recyclerView instanceof DragRecyclerView) {
                    ((DragRecyclerView) recyclerView).setLongPress(false);
                    DragFeatureView dragFeatureView3 = DragFeatureView.this;
                    dragFeatureView3.f197288A = false;
                    dragFeatureView3.f197311y = false;
                }
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$c */
    public static class C68683c extends LinearLayout {

        /* renamed from: d */
        public int f197315d;

        /* renamed from: e */
        public int f197316e;

        /* renamed from: f */
        public int f197317f;

        /* renamed from: g */
        public int f197318g;

        /* renamed from: h */
        public int f197319h;

        /* renamed from: i */
        public int f197320i;

        /* renamed from: j */
        public WeImageView f197321j;

        /* renamed from: n */
        public TextView f197322n;

        public C68683c(Context context) {
            super(context);
            setOrientation(0);
            setOrientation(1);
            setGravity(17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        public void mo94460a() {
            if (this.f197322n.getTextSize() > 0.0f) {
                DragFeatureView.f197287F = Math.min(DragFeatureView.f197287F, this.f197322n.getTextSize());
                if (this.f197322n.getTextSize() > DragFeatureView.f197287F && Build.VERSION.SDK_INT >= 26) {
                    this.f197322n.setAutoSizeTextTypeUniformWithConfiguration(1, (int) DragFeatureView.f197287F, 1, 0);
                }
            }
        }

        /* renamed from: b */
        public void mo94461b(boolean z) {
            this.f197321j.setImageResource(z ? this.f197316e : this.f197315d);
            setBackgroundResource(z ? this.f197320i : this.f197319h);
            this.f197322n.setText(z ? this.f197318g : this.f197317f);
        }

        /* renamed from: c */
        public void mo94462c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f197315d = i;
            this.f197316e = i2;
            this.f197317f = i3;
            this.f197318g = i4;
            this.f197319h = i5;
            this.f197320i = i6;
            setBackgroundResource(i5);
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            addView(relativeLayout, layoutParams);
            WeImageView weImageView = new WeImageView(getContext());
            weImageView.setImageResource(i);
            weImageView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.width = (int) (((float) C76577a.m92155f(getContext(), C0966R.dimen.f3743cv)) * C75447f.m90469a(getContext()));
            layoutParams2.height = (int) (((float) C76577a.m92155f(getContext(), C0966R.dimen.f3743cv)) * C75447f.m90469a(getContext()));
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            weImageView.setIconColor(-1);
            weImageView.setLayoutParams(layoutParams2);
            this.f197321j = weImageView;
            relativeLayout.addView(weImageView);
            RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams3.weight = 1.0f;
            relativeLayout2.setPadding(C76577a.m92151b(getContext(), 4), 0, C76577a.m92151b(getContext(), 4), C76577a.m92151b(getContext(), 4));
            addView(relativeLayout2, layoutParams3);
            TextView textView = new TextView(getContext());
            textView.setText(i3);
            textView.setTextSize(1, C75447f.m90469a(getContext()) * 12.0f);
            textView.setTextColor(getContext().getResources().getColor(C0966R.color.al_));
            textView.setPadding(0, C76577a.m92151b(getContext(), 2), 0, 0);
            textView.setGravity(49);
            if (Build.VERSION.SDK_INT >= 26) {
                textView.setAutoSizeTextTypeUniformWithConfiguration(1, (int) (C75447f.m90469a(getContext()) * 12.0f), 1, 1);
            }
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.f197322n = textView;
            relativeLayout2.addView(textView);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$d */
    public class C68684d implements Runnable {

        /* renamed from: d */
        public final RecyclerView.C16631z f197323d;

        public C68684d(RecyclerView.C16631z zVar) {
            this.f197323d = zVar;
        }

        public void run() {
            RecyclerView.C16631z zVar = this.f197323d;
            if (zVar != null) {
                int i = DragFeatureView.this.f197299j;
                int j = zVar.mo17363j();
                if (j >= 0 || i >= 0) {
                    Object[] objArr = new Object[4];
                    boolean z = false;
                    objArr[0] = Boolean.valueOf(DragFeatureView.this.f197298i != this.f197323d);
                    DragFeatureView dragFeatureView = DragFeatureView.this;
                    objArr[1] = Boolean.valueOf(((C75661d) dragFeatureView.f197295f).mo106006c(dragFeatureView.getRecyclerView(), DragFeatureView.this.f197298i, this.f197323d, i, j));
                    objArr[2] = Integer.valueOf(i);
                    objArr[3] = Integer.valueOf(j);
                    Log.m105925i("MicroMsg.DragFeatureView", "alvinluo move run %b, onMove: %b, from: %d, to: %d", objArr);
                    DragFeatureView dragFeatureView2 = DragFeatureView.this;
                    if (dragFeatureView2.f197298i != this.f197323d) {
                        if (((C75661d) dragFeatureView2.f197295f).mo106006c(dragFeatureView2.getRecyclerView(), DragFeatureView.this.f197298i, this.f197323d, i, j)) {
                            DragFeatureView dragFeatureView3 = DragFeatureView.this;
                            C75660c cVar = dragFeatureView3.f197295f;
                            RecyclerView recyclerView = dragFeatureView3.getRecyclerView();
                            RecyclerView.C16631z zVar2 = DragFeatureView.this.f197298i;
                            RecyclerView.C16631z zVar3 = this.f197323d;
                            C75661d dVar = (C75661d) cVar;
                            dVar.getClass();
                            Log.m105924i("MicroMsg.ItemMoveHelper", "[onMoved] position:" + zVar2.mo17363j() + " target:" + zVar3.mo17363j());
                            Log.m105925i("MicroMsg.ItemMoveHelper", "alvinluo onMoved mList: %d", Integer.valueOf(dVar.f222248c.hashCode()));
                            if (i >= 0 && i < dVar.f222248c.size() && j >= 0 && j < dVar.f222248c.size()) {
                                if (i < j) {
                                    int i2 = i;
                                    while (i2 < j) {
                                        int i3 = i2 + 1;
                                        Collections.swap(dVar.f222248c, i2, i3);
                                        i2 = i3;
                                    }
                                } else {
                                    int i4 = i;
                                    while (i4 > j) {
                                        int i5 = i4 - 1;
                                        Collections.swap(dVar.f222248c, i4, i5);
                                        i4 = i5;
                                    }
                                }
                                Log.m105925i("MicroMsg.ItemMoveHelper", "alvinluo onMoved end mList: %d", Integer.valueOf(dVar.f222248c.hashCode()));
                                recyclerView.getAdapter().notifyItemMoved(i, j);
                                if (dVar.f222251f != null) {
                                    dVar.f222253h = j;
                                }
                                recyclerView.getAdapter().notifyItemRangeChanged(0, recyclerView.getAdapter().getItemCount(), Boolean.TRUE);
                                z = true;
                            }
                            if (z) {
                                DragFeatureView.this.f197299j = j;
                            }
                        }
                    }
                }
            }
        }
    }

    public DragFeatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo94442h(context);
    }

    private void setItemDragCallback(C75660c cVar) {
        this.f197295f = cVar;
    }

    /* renamed from: a */
    public void mo94431a() {
        if (this.f197311y) {
            Log.m105924i("MicroMsg.DragFeatureView", "resetIfNeeded trigger");
            mo94444j(false);
        }
    }

    /* renamed from: b */
    public void mo94432b(boolean z) {
        int i = 0;
        Log.m105925i("MicroMsg.DragFeatureView", "enableStar %b", Boolean.valueOf(z));
        C68683c cVar = this.f197307u;
        if (!z) {
            i = 8;
        }
        cVar.setVisibility(i);
        this.f197307u.getParent().requestLayout();
    }

    /* renamed from: c */
    public void mo94433c(RecyclerView.C16631z zVar, int i) {
        RecyclerView.C16631z zVar2 = zVar;
        if (getVisibility() != 8) {
            Log.m105925i("MicroMsg.DragFeatureView", "onBindViewHolder %d %d", Integer.valueOf(this.f197299j), Integer.valueOf(i));
            if (this.f197299j == i) {
                View view = zVar2.f44854d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = zVar2.f44854d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: d */
    public abstract C75660c mo94392d(RecyclerView.C16631z zVar);

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f197291D.setStyle(Paint.Style.FILL);
        this.f197291D.setColor(-65536);
        Rect rect = this.f197302p;
        if (rect != null) {
            canvas.drawRect(rect, this.f197291D);
        }
        this.f197291D.setColor(-16711936);
        Rect rect2 = this.f197303q;
        if (rect2 != null) {
            canvas.drawRect(rect2, this.f197291D);
        }
    }

    /* renamed from: e */
    public boolean mo94393e(MotionEvent motionEvent) {
        if (getTopScrollRect().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            if (this.f197289B == null) {
                C75455n nVar = new C75455n(this, true);
                this.f197289B = nVar;
                postDelayed(nVar, 250);
            }
            return true;
        } else if (getBottomScrollRect().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            if (this.f197289B == null) {
                C75455n nVar2 = new C75455n(this, false);
                this.f197289B = nVar2;
                postDelayed(nVar2, 250);
            }
            return true;
        } else if (!getRubbishRect().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return false;
        } else {
            removeCallbacks(this.f197294e);
            removeCallbacks(this.f197289B);
            this.f197289B = null;
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo94435f(float f, float f2) {
        int i = (int) f2;
        return getRubbishRect().contains((int) f, i) || getRubbishRect().top < i;
    }

    /* renamed from: g */
    public RecyclerView.C16631z mo94394g(float f, float f2, boolean z) {
        int i = (int) f;
        int i2 = (int) f2;
        if (this.f197302p.contains(i, i2)) {
            return null;
        }
        for (int i3 = 0; i3 < getRecyclerView().getChildCount(); i3++) {
            RecyclerView.C16631z P0 = getRecyclerView().mo17031P0(getRecyclerView().getChildAt(i3));
            P0.f44854d.getGlobalVisibleRect(this.f197290C);
            if (this.f197290C.contains(i, i2)) {
                return P0;
            }
        }
        this.f197303q.contains(i, i2);
        return null;
    }

    public Rect getBottomScrollRect() {
        return this.f197302p;
    }

    public C75660c getItemDragCallback() {
        return this.f197295f;
    }

    public C75456p getRecyclerScrollComputer() {
        return null;
    }

    public RecyclerView getRecyclerView() {
        return this.f197296g;
    }

    public Rect getRubbishRect() {
        return this.f197304r;
    }

    public Rect getTopScrollRect() {
        return this.f197303q;
    }

    /* renamed from: h */
    public final void mo94442h(Context context) {
        setVisibility(8);
        this.f197297h = new GestureDetector(context, this);
        this.f197300n = (Vibrator) context.getSystemService("vibrator");
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(getContext());
        float f = (float) C76577a.m92155f(getContext(), C0966R.dimen.f3766df);
        roundedCornerFrameLayout.mo153905b(f, f, 0.0f, 0.0f);
        roundedCornerFrameLayout.setId(C0966R.C0970id.ixb);
        roundedCornerFrameLayout.setTranslationY((float) this.f197293d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f197293d);
        layoutParams.gravity = 80;
        roundedCornerFrameLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        roundedCornerFrameLayout.addView(linearLayout);
        C68683c cVar = new C68683c(getContext());
        this.f197307u = cVar;
        cVar.mo94462c(C0966R.raw.appbrand_icon_star_off, C0966R.raw.appbrand_icon_star_on, C0966R.string.f7661n1, C0966R.string.f7662n2, C0966R.color.f3064e2, C0966R.color.f3065e3);
        linearLayout.addView(this.f197307u);
        C68683c cVar2 = new C68683c(getContext());
        this.f197308v = cVar2;
        cVar2.mo94462c(C0966R.raw.icons_filled_delete, C0966R.raw.icons_filled_delete_on, C0966R.string.f7660mz, C0966R.string.f7663n5, C0966R.color.f3060dw, C0966R.color.f3061dx);
        linearLayout.addView(this.f197308v);
        addView(roundedCornerFrameLayout);
    }

    /* renamed from: i */
    public final void mo94443i() {
        Log.m105924i("MicroMsg.DragFeatureView", "resetRubbishView");
        this.f197309w = false;
        this.f197307u.mo94461b(false);
        this.f197308v.mo94461b(false);
    }

    /* renamed from: j */
    public final void mo94444j(boolean z) {
        Log.m105925i("MicroMsg.DragFeatureView", "resetStatus %b", Boolean.valueOf(z));
        removeCallbacks(this.f197294e);
        removeCallbacks(this.f197289B);
        setRubbishViewVisible(8);
        int i = this.f197299j;
        this.f197299j = -1;
        this.f197309w = false;
        ((C75661d) this.f197295f).mo106005b(getRecyclerView(), this.f197298i, i, z, true, new C68681a());
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getGlobalVisibleRect(this.f197302p);
        Rect rect = this.f197302p;
        int i5 = rect.left;
        int i6 = rect.bottom;
        int i7 = this.f197293d;
        rect.set(i5, i6 - (i7 * 2), rect.right, i6 - i7);
        getRecyclerView().getGlobalVisibleRect(this.f197303q);
        Rect rect2 = this.f197303q;
        rect2.set(rect2.left, 0, rect2.right, rect2.top + this.f197293d);
        findViewById(C0966R.C0970id.ixb).getGlobalVisibleRect(this.f197304r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0064, code lost:
        r1 = r0.f44859i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLongPress(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r1 = "android/view/GestureDetector$OnGestureListener"
            java.lang.String r2 = "onLongPress"
            java.lang.String r3 = "(Landroid/view/MotionEvent;)V"
            r4 = r23
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            boolean r0 = r6.f197311y
            java.lang.String r1 = "MicroMsg.DragFeatureView"
            java.lang.String r2 = "(Landroid/view/MotionEvent;)V"
            java.lang.String r3 = "android/view/GestureDetector$OnGestureListener"
            java.lang.String r4 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r5 = "onLongPress"
            r8 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "alvinluo DragFeatureView onLongPress is in long press and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            r6.f197311y = r8
            j20.C117292a.m165361g(r6, r4, r3, r5, r2)
            return
        L_0x003a:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            float r0 = r24.getRawX()
            float r1 = r24.getRawY()
            r9 = 1
            androidx.recyclerview.widget.RecyclerView$z r0 = r6.mo94394g(r0, r1, r9)
            if (r0 != 0) goto L_0x0050
            j20.C117292a.m165361g(r6, r4, r3, r5, r2)
            return
        L_0x0050:
            r6.f197311y = r9
            et0.c r1 = r6.mo94392d(r0)
            r6.setItemDragCallback(r1)
            et0.c r1 = r6.f197295f
            r23.getRecyclerView()
            et0.d r1 = (et0.C75661d) r1
            et0.a r1 = r1.f222249d
            if (r1 == 0) goto L_0x006e
            int r1 = r0.f44859i
            r10 = 2
            if (r1 == r10) goto L_0x006e
            if (r1 != r9) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r1 = 0
            goto L_0x006f
        L_0x006e:
            r1 = 1
        L_0x006f:
            if (r1 == 0) goto L_0x0211
            et0.c r1 = r6.f197295f
            androidx.recyclerview.widget.RecyclerView r11 = r23.getRecyclerView()
            et0.d r1 = (et0.C75661d) r1
            android.widget.FrameLayout r12 = r1.f222246a
            android.view.View r15 = r0.f44854d
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r13 = 4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14.mo10233c(r13)
            java.lang.Object[] r16 = r14.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper"
            java.lang.String r18 = "makeFloatView"
            java.lang.String r19 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r13 = r15
            r10 = r14
            r14 = r16
            r9 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r22
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r14 = "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper"
            java.lang.String r15 = "makeFloatView"
            java.lang.String r16 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r13 = r9
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            et0.a r9 = r1.f222249d
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b r9 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b) r9
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r9 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
            r10 = r0
            com.tencent.mm.plugin.appbrand.widget.desktop.c r10 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68687c) r10
            android.view.View r9 = r9.mo94395m(r11, r10)
            k20.a r10 = new k20.a
            r10.<init>()
            r11 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r13 = java.lang.Float.valueOf(r11)
            r10.mo10233c(r13)
            java.lang.Object[] r14 = r10.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper"
            java.lang.String r16 = "makeFloatView"
            java.lang.String r17 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setAlpha"
            java.lang.String r20 = "(F)V"
            r13 = r9
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            r9.setAlpha(r10)
            java.lang.String r14 = "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper"
            java.lang.String r15 = "makeFloatView"
            java.lang.String r16 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setAlpha"
            java.lang.String r19 = "(F)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            r9.setScaleX(r11)
            r9.setScaleY(r11)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r10.mo10233c(r11)
            java.lang.Object[] r14 = r10.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper"
            java.lang.String r16 = "makeFloatView"
            java.lang.String r17 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r14 = "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper"
            java.lang.String r15 = "makeFloatView"
            java.lang.String r16 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            r1.f222247b = r9
            r12.addView(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[onDragBegin] position:"
            r9.append(r10)
            int r10 = r0.mo17363j()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MicroMsg.ItemMoveHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            int r9 = r0.mo17363j()
            if (r9 >= 0) goto L_0x0191
            android.view.View r9 = r1.f222247b
            if (r9 == 0) goto L_0x0191
            android.widget.FrameLayout r10 = r1.f222246a
            r10.removeView(r9)
            r9 = 0
            r1.f222247b = r9
            goto L_0x01db
        L_0x0191:
            et0.f r9 = r1.f222251f
            if (r9 == 0) goto L_0x01d9
            java.util.List r9 = r1.f222248c
            int r9 = r9.size()
            int r10 = r0.mo17363j()
            if (r9 <= r10) goto L_0x01d9
            et0.f r9 = r1.f222251f
            java.util.List r10 = r1.f222248c
            int r11 = r0.mo17363j()
            java.lang.Object r10 = r10.get(r11)
            int r11 = r0.mo17363j()
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$a r9 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68669a) r9
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r9 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
            com.tencent.mm.plugin.appbrand.widget.desktop.d$a r9 = r9.f197236H
            if (r9 == 0) goto L_0x01bd
            r12 = 1
            r9.mo94425c(r11, r12, r8)
        L_0x01bd:
            boolean r9 = r10 instanceof com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a
            if (r9 == 0) goto L_0x01cf
            com.tencent.mm.plugin.appbrand.widget.desktop.e$a r10 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a) r10
            com.tencent.mm.plugin.appbrand.widget.desktop.e$a r9 = new com.tencent.mm.plugin.appbrand.widget.desktop.e$a
            int r11 = r10.f197341b
            r9.<init>((int) r11)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r10 = r10.f197340a
            r9.f197340a = r10
            r10 = r9
        L_0x01cf:
            r1.f222250e = r10
            int r9 = r0.mo17363j()
            r1.f222252g = r9
            r1.f222253h = r9
        L_0x01d9:
            android.view.View r9 = r1.f222247b
        L_0x01db:
            r6.f197301o = r9
            if (r9 == 0) goto L_0x0208
            r1 = 8
            r6.setVisibility(r1)
            int r1 = r0.mo17363j()
            r6.f197299j = r1
            r6.f197298i = r0
            android.content.Context r0 = r23.getContext()
            r1 = 2131821061(0x7f110205, float:1.9274855E38)
            java.lang.String r0 = r0.getString(r1)
            r6.announceForAccessibility(r0)
            android.os.Vibrator r0 = r6.f197300n
            r9 = 30
            r0.vibrate(r9)
            r6.setRubbishViewVisible(r8)
            r6.setVisibility(r8)
            goto L_0x0216
        L_0x0208:
            r0 = 8
            r6.setRubbishViewVisible(r0)
            r6.setVisibility(r0)
            goto L_0x0216
        L_0x0211:
            r0 = 8
            r6.setVisibility(r0)
        L_0x0216:
            r7.setAction(r8)
            android.view.GestureDetector r0 = r6.f197297h
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r7)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r12 = "onLongPress"
            java.lang.String r13 = "(Landroid/view/MotionEvent;)V"
            java.lang.String r14 = "android/view/GestureDetector_EXEC_"
            java.lang.String r15 = "onTouchEvent"
            java.lang.String r16 = "(Landroid/view/MotionEvent;)Z"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r8)
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r10 = r0.onTouchEvent(r1)
            java.lang.String r11 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r12 = "onLongPress"
            java.lang.String r13 = "(Landroid/view/MotionEvent;)V"
            java.lang.String r14 = "android/view/GestureDetector_EXEC_"
            java.lang.String r15 = "onTouchEvent"
            java.lang.String r16 = "(Landroid/view/MotionEvent;)Z"
            j20.C117292a.m165360f(r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 3
            r7.setAction(r0)
            android.view.GestureDetector r0 = r6.f197297h
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r7)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r12 = "onLongPress"
            java.lang.String r13 = "(Landroid/view/MotionEvent;)V"
            java.lang.String r14 = "android/view/GestureDetector_EXEC_"
            java.lang.String r15 = "onTouchEvent"
            java.lang.String r16 = "(Landroid/view/MotionEvent;)Z"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r8)
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r10 = r0.onTouchEvent(r1)
            java.lang.String r11 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r12 = "onLongPress"
            java.lang.String r13 = "(Landroid/view/MotionEvent;)V"
            java.lang.String r14 = "android/view/GestureDetector_EXEC_"
            java.lang.String r15 = "onTouchEvent"
            java.lang.String r16 = "(Landroid/view/MotionEvent;)Z"
            j20.C117292a.m165360f(r9, r10, r11, r12, r13, r14, r15, r16)
            j20.C117292a.m165361g(r6, r4, r3, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.desktop.DragFeatureView.onLongPress(android.view.MotionEvent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onScroll(android.view.MotionEvent r23, android.view.MotionEvent r24, float r25, float r26) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r22.getVisibility()
            r2 = 0
            r3 = 8
            if (r1 != r3) goto L_0x000c
            return r2
        L_0x000c:
            float r1 = r24.getRawX()
            float r3 = r24.getRawY()
            androidx.recyclerview.widget.RecyclerView r4 = r22.getRecyclerView()
            android.graphics.Rect r5 = r0.f197290C
            r4.getGlobalVisibleRect(r5)
            android.graphics.Rect r4 = r0.f197290C
            int r5 = (int) r1
            int r6 = (int) r3
            boolean r4 = r4.contains(r5, r6)
            r7 = 2
            r8 = 3
            r9 = 4
            r10 = 5
            r11 = 6
            r12 = 1
            if (r4 != 0) goto L_0x0041
            android.graphics.Rect r4 = r0.f197290C
            int r13 = r4.left
            float r13 = (float) r13
            int r13 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0038
            r1 = 3
            goto L_0x008d
        L_0x0038:
            int r4 = r4.right
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0041
            r1 = 4
            goto L_0x008d
        L_0x0041:
            android.graphics.Rect r4 = r0.f197302p
            boolean r4 = r4.contains(r5, r6)
            if (r4 == 0) goto L_0x004b
            r1 = 2
            goto L_0x008d
        L_0x004b:
            android.graphics.Rect r4 = r0.f197303q
            boolean r4 = r4.contains(r5, r6)
            if (r4 == 0) goto L_0x0055
            r1 = 1
            goto L_0x008d
        L_0x0055:
            boolean r1 = r0.mo94435f(r1, r3)
            if (r1 == 0) goto L_0x005d
            r1 = 6
            goto L_0x008d
        L_0x005d:
            r1 = 0
        L_0x005e:
            androidx.recyclerview.widget.RecyclerView r3 = r22.getRecyclerView()
            int r3 = r3.getChildCount()
            if (r1 >= r3) goto L_0x008c
            androidx.recyclerview.widget.RecyclerView r3 = r22.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView r4 = r22.getRecyclerView()
            android.view.View r4 = r4.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$z r3 = r3.mo17031P0(r4)
            android.view.View r3 = r3.f44854d
            android.graphics.Rect r4 = r0.f197290C
            r3.getGlobalVisibleRect(r4)
            android.graphics.Rect r3 = r0.f197290C
            boolean r3 = r3.contains(r5, r6)
            if (r3 == 0) goto L_0x0089
            r1 = 5
            goto L_0x008d
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x005e
        L_0x008c:
            r1 = 7
        L_0x008d:
            float r3 = r24.getRawX()
            float r4 = r24.getRawY()
            androidx.recyclerview.widget.RecyclerView$z r3 = r0.mo94394g(r3, r4, r2)
            boolean r4 = r0.f197312z
            if (r4 != 0) goto L_0x00bc
            et0.c r4 = r0.f197295f
            androidx.recyclerview.widget.RecyclerView r14 = r22.getRecyclerView()
            android.view.View r15 = r0.f197301o
            float r20 = r24.getRawX()
            float r21 = r24.getRawY()
            r13 = r4
            et0.d r13 = (et0.C75661d) r13
            r16 = r25
            r17 = r26
            r18 = r3
            r19 = r1
            r13.mo106004a(r14, r15, r16, r17, r18, r19, r20, r21)
            return r2
        L_0x00bc:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4[r2] = r5
            if (r3 != 0) goto L_0x00c7
            r2 = 1
        L_0x00c7:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4[r12] = r2
            float r2 = r24.getRawX()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r4[r7] = r2
            float r2 = r24.getRawY()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r4[r8] = r2
            if (r3 == 0) goto L_0x00e6
            int r2 = r3.f44859i
            goto L_0x00e7
        L_0x00e6:
            r2 = -1
        L_0x00e7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r9] = r2
            java.lang.String r2 = "MicroMsg.DragFeatureView"
            java.lang.String r5 = "alvinluo onScroll currentArea: %d, viewHolder == null: %b, x: %f, y: %f, itemViewType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r5, r4)
            if (r1 == r12) goto L_0x0114
            if (r1 == r7) goto L_0x0114
            if (r1 != r11) goto L_0x00fb
            goto L_0x0114
        L_0x00fb:
            if (r1 == r8) goto L_0x0109
            if (r1 == r9) goto L_0x0109
            et0.c r2 = r0.f197295f
            r22.getRecyclerView()
            et0.d r2 = (et0.C75661d) r2
            et0.a r2 = r2.f222249d
            goto L_0x0111
        L_0x0109:
            et0.c r2 = r0.f197295f
            r22.getRecyclerView()
            r2.getClass()
        L_0x0111:
            r2 = r24
            goto L_0x0119
        L_0x0114:
            r2 = r24
            r0.mo94393e(r2)
        L_0x0119:
            et0.c r4 = r0.f197295f
            androidx.recyclerview.widget.RecyclerView r14 = r22.getRecyclerView()
            android.view.View r15 = r0.f197301o
            float r20 = r24.getRawX()
            float r21 = r24.getRawY()
            r13 = r4
            et0.d r13 = (et0.C75661d) r13
            r16 = r25
            r17 = r26
            r18 = r3
            r19 = r1
            r13.mo106004a(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r1 == r12) goto L_0x0143
            if (r1 == r7) goto L_0x0143
            java.lang.Runnable r1 = r0.f197289B
            r0.removeCallbacks(r1)
            r1 = 0
            r0.f197289B = r1
        L_0x0143:
            float r1 = java.lang.Math.abs(r25)
            r2 = 1077936128(0x40400000, float:3.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0155
            float r1 = java.lang.Math.abs(r26)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0182
        L_0x0155:
            java.lang.Runnable r1 = r0.f197294e
            r0.removeCallbacks(r1)
            et0.c r1 = r0.f197295f
            r22.getRecyclerView()
            et0.d r1 = (et0.C75661d) r1
            et0.a r1 = r1.f222249d
            if (r3 == 0) goto L_0x0176
            int r1 = r3.f44859i
            if (r1 != r10) goto L_0x0176
            com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$d r1 = new com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$d
            r1.<init>(r3)
            r0.f197294e = r1
            r2 = 50
            r0.postDelayed(r1, r2)
            goto L_0x0182
        L_0x0176:
            com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$d r1 = new com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$d
            r1.<init>(r3)
            r0.f197294e = r1
            r2 = 150(0x96, double:7.4E-322)
            r0.postDelayed(r1, r2)
        L_0x0182:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.desktop.DragFeatureView.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r0 != 3) goto L_0x023a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            r18 = this;
            r6 = r18
            r7 = r20
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r19
            r0.add(r1)
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r18
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            boolean r0 = r6.f197306t
            r8 = 0
            if (r0 != 0) goto L_0x003b
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r18
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x003b:
            int r0 = r20.getAction()
            java.lang.String r1 = "MicroMsg.DragFeatureView"
            r9 = 1
            if (r0 == r9) goto L_0x00dc
            r2 = 2
            if (r0 == r2) goto L_0x004c
            r2 = 3
            if (r0 == r2) goto L_0x00dc
            goto L_0x023a
        L_0x004c:
            float r0 = r20.getRawX()
            float r2 = r20.getRawY()
            boolean r0 = r6.mo94435f(r0, r2)
            if (r0 == 0) goto L_0x00d7
            float r0 = r20.getRawX()
            com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$c r2 = r6.f197307u
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0075
            android.graphics.Rect r2 = r18.getRubbishRect()
            int r2 = r2.centerX()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r2[r8] = r3
            java.lang.String r3 = "handleActive %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            boolean r1 = r6.f197309w
            r2 = 2131821058(0x7f110202, float:1.9274848E38)
            r3 = 10
            r5 = 2131821059(0x7f110203, float:1.927485E38)
            if (r1 != 0) goto L_0x00aa
            android.os.Vibrator r1 = r6.f197305s
            if (r1 == 0) goto L_0x0096
            r1.vibrate(r3)
        L_0x0096:
            android.content.Context r1 = r18.getContext()
            if (r0 == 0) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            r2 = 2131821059(0x7f110203, float:1.927485E38)
        L_0x00a0:
            java.lang.String r1 = r1.getString(r2)
            r6.announceForAccessibility(r1)
            r6.f197310x = r0
            goto L_0x00c8
        L_0x00aa:
            boolean r1 = r6.f197310x
            if (r0 == r1) goto L_0x00c8
            android.os.Vibrator r1 = r6.f197305s
            if (r1 == 0) goto L_0x00b5
            r1.vibrate(r3)
        L_0x00b5:
            android.content.Context r1 = r18.getContext()
            if (r0 == 0) goto L_0x00bc
            goto L_0x00bf
        L_0x00bc:
            r2 = 2131821059(0x7f110203, float:1.927485E38)
        L_0x00bf:
            java.lang.String r1 = r1.getString(r2)
            r6.announceForAccessibility(r1)
            r6.f197310x = r0
        L_0x00c8:
            r6.f197309w = r9
            com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$c r1 = r6.f197307u
            r1.mo94461b(r0)
            com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$c r1 = r6.f197308v
            r0 = r0 ^ r9
            r1.mo94461b(r0)
            goto L_0x023a
        L_0x00d7:
            r18.mo94443i()
            goto L_0x023a
        L_0x00dc:
            float r0 = r20.getRawX()
            float r2 = r20.getRawY()
            boolean r0 = r6.mo94435f(r0, r2)
            if (r0 == 0) goto L_0x0237
            float r0 = r20.getRawX()
            com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView$c r2 = r6.f197307u
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0105
            android.graphics.Rect r2 = r18.getRubbishRect()
            int r2 = r2.centerX()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0105
            r0 = 1
            goto L_0x0106
        L_0x0105:
            r0 = 0
        L_0x0106:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r2[r8] = r3
            java.lang.String r3 = "handleDoAction %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            int r13 = r6.f197299j
            r6.f197309w = r8
            java.lang.String r1 = "MicroMsg.ItemMoveHelper"
            if (r0 == 0) goto L_0x0167
            et0.c r0 = r6.f197295f
            r18.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$z r2 = r6.f197298i
            et0.d r0 = (et0.C75661d) r0
            r0.getClass()
            java.lang.Object[] r3 = new java.lang.Object[r9]
            int r4 = r2.mo17363j()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r8] = r4
            java.lang.String r4 = "alvinluo onStar adapter position: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r3)
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.appbrand.widget.desktop.C68687c
            if (r3 == 0) goto L_0x014d
            java.lang.Object[] r3 = new java.lang.Object[r9]
            com.tencent.mm.plugin.appbrand.widget.desktop.c r2 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68687c) r2
            android.widget.TextView r2 = r2.f197335E
            java.lang.CharSequence r2 = r2.getText()
            r3[r8] = r2
            java.lang.String r2 = "alvinluo onStar holder: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)
        L_0x014d:
            et0.a r1 = r0.f222249d
            if (r1 == 0) goto L_0x0162
            java.lang.Object r0 = r0.f222250e
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b r1 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b) r1
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a
            if (r2 == 0) goto L_0x0162
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
            com.tencent.mm.plugin.appbrand.widget.desktop.d$a r1 = r1.f197236H
            if (r1 == 0) goto L_0x0162
            r1.mo94428f(r0)
        L_0x0162:
            r6.mo94444j(r9)
            goto L_0x023a
        L_0x0167:
            et0.c r0 = r6.f197295f
            androidx.recyclerview.widget.RecyclerView r11 = r18.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$z r12 = r6.f197298i
            r14 = 1
            r15 = 0
            r16 = 0
            r10 = r0
            et0.d r10 = (et0.C75661d) r10
            r10.mo106005b(r11, r12, r13, r14, r15, r16)
            r0 = -1
            r6.f197299j = r0
            et0.c r0 = r6.f197295f
            androidx.recyclerview.widget.RecyclerView r2 = r18.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$z r3 = r6.f197298i
            et0.d r0 = (et0.C75661d) r0
            r0.getClass()
            java.lang.Object[] r4 = new java.lang.Object[r9]
            int r5 = r3.mo17363j()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r8] = r5
            java.lang.String r5 = "alvinluo onDelete adapter position: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r4)
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.appbrand.widget.desktop.C68687c
            if (r4 == 0) goto L_0x01b0
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r5 = r3
            com.tencent.mm.plugin.appbrand.widget.desktop.c r5 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68687c) r5
            android.widget.TextView r5 = r5.f197335E
            java.lang.CharSequence r5 = r5.getText()
            r4[r8] = r5
            java.lang.String r5 = "alvinluo onDelete holder: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r4)
        L_0x01b0:
            et0.f r4 = r0.f222251f
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$a r4 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68669a) r4
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r4 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
            boolean r4 = r4.f197240L
            if (r4 == 0) goto L_0x01e1
            java.util.List r4 = r0.f222248c
            int r5 = r3.mo17363j()
            r4.remove(r5)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.util.List r5 = r0.f222248c
            int r5 = r5.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r8] = r5
            java.lang.String r5 = "alvinluo mList hashCode: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r4)
            androidx.recyclerview.widget.RecyclerView$e r1 = r2.getAdapter()
            int r2 = r3.mo17363j()
            r1.notifyItemRemoved(r2)
        L_0x01e1:
            et0.a r1 = r0.f222249d
            if (r1 == 0) goto L_0x0205
            java.lang.Object r0 = r0.f222250e
            int r2 = r3.mo17363j()
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b r1 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b) r1
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a
            if (r3 == 0) goto L_0x0205
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r1 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
            com.tencent.mm.plugin.appbrand.widget.desktop.d$a r1 = r1.f197236H
            if (r1 == 0) goto L_0x0205
            r3 = r0
            com.tencent.mm.plugin.appbrand.widget.desktop.e$a r3 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.C68692a) r3
            int r3 = r3.f197341b
            if (r3 != r9) goto L_0x0202
            r1.mo94426d(r0, r2)
            goto L_0x0205
        L_0x0202:
            r1.mo94427e(r0, r2)
        L_0x0205:
            android.view.View r0 = r6.f197301o
            if (r0 == 0) goto L_0x022c
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            dt0.m r1 = new dt0.m
            r1.<init>(r6)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r1 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r0.start()
        L_0x022c:
            java.lang.Runnable r0 = r6.f197294e
            r6.removeCallbacks(r0)
            java.lang.Runnable r0 = r6.f197289B
            r6.removeCallbacks(r0)
            goto L_0x023a
        L_0x0237:
            r6.mo94444j(r8)
        L_0x023a:
            android.view.GestureDetector r0 = r6.f197297h
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r7)
            java.lang.Object[] r11 = r1.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r13 = "onTouch"
            java.lang.String r14 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r15 = "android/view/GestureDetector_EXEC_"
            java.lang.String r16 = "onTouchEvent"
            java.lang.String r17 = "(Landroid/view/MotionEvent;)Z"
            r10 = r0
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r1 = r1.mo10231a(r8)
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r11 = r0.onTouchEvent(r1)
            java.lang.String r12 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r13 = "onTouch"
            java.lang.String r14 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r15 = "android/view/GestureDetector_EXEC_"
            java.lang.String r16 = "onTouchEvent"
            java.lang.String r17 = "(Landroid/view/MotionEvent;)Z"
            j20.C117292a.m165360f(r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r18
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.desktop.DragFeatureView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f197296g = recyclerView;
    }

    public void setRecyclerViewScrollComputer(C75456p pVar) {
    }

    public void setRubbishViewVisible(int i) {
        View findViewById = findViewById(C0966R.C0970id.ixb);
        if (findViewById != null) {
            Log.m105925i("MicroMsg.DragFeatureView", "setRubbishViewVisible %d", Integer.valueOf(i));
            if (i == 0) {
                findViewById.requestLayout();
                findViewById.animate().translationY(0.0f).setDuration(300).setListener(this.f197292E).start();
                return;
            }
            this.f197288A = true;
            findViewById.animate().translationY((float) findViewById.getHeight()).setDuration(300).setListener(this.f197292E).start();
        }
    }

    public void setTouchEnabled(boolean z) {
        this.f197306t = z;
    }

    public DragFeatureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo94442h(context);
    }
}
