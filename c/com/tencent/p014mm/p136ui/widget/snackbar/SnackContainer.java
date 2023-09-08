package com.tencent.p014mm.p136ui.widget.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.tencent.mm.ui.widget.snackbar.SnackContainer */
public class SnackContainer extends FrameLayout {

    /* renamed from: d */
    public Queue<C75017d> f220722d = new LinkedList();

    /* renamed from: e */
    public AnimationSet f220723e;

    /* renamed from: f */
    public final Runnable f220724f = new C75014a();

    /* renamed from: g */
    public AnimationSet f220725g;

    /* renamed from: com.tencent.mm.ui.widget.snackbar.SnackContainer$a */
    public class C75014a implements Runnable {
        public C75014a() {
        }

        public void run() {
            if (SnackContainer.this.getVisibility() == 0) {
                SnackContainer snackContainer = SnackContainer.this;
                snackContainer.startAnimation(snackContainer.f220723e);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.snackbar.SnackContainer$b */
    public class C75015b implements Animation.AnimationListener {
        public C75015b() {
        }

        public void onAnimationEnd(Animation animation) {
            C75018a.C75025e eVar;
            SnackContainer.this.removeAllViews();
            if (!SnackContainer.this.f220722d.isEmpty() && (eVar = ((C75017d) ((LinkedList) SnackContainer.this.f220722d).poll()).f220734e) != null) {
                C75026b.f220750a = false;
                eVar.onHide();
            }
            if (!SnackContainer.this.f220722d.isEmpty()) {
                SnackContainer snackContainer = SnackContainer.this;
                snackContainer.mo104586b((C75017d) ((LinkedList) snackContainer.f220722d).peek(), false);
                return;
            }
            SnackContainer.this.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (!SnackContainer.this.f220722d.isEmpty() && ((LinkedList) SnackContainer.this.f220722d).peek() != null && ((C75017d) ((LinkedList) SnackContainer.this.f220722d).peek()).f220734e != null) {
                C75026b.f220750a = false;
                ((C75017d) ((LinkedList) SnackContainer.this.f220722d).peek()).f220734e.mo6958a();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.snackbar.SnackContainer$c */
    public class C75016c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C75017d f220728d;

        public C75016c(C75017d dVar) {
            this.f220728d = dVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/snackbar/SnackContainer$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 4) {
                SnackContainer snackContainer = SnackContainer.this;
                snackContainer.removeCallbacks(snackContainer.f220724f);
                SnackContainer snackContainer2 = SnackContainer.this;
                C75017d dVar = this.f220728d;
                snackContainer2.getClass();
                C75018a.C75025e eVar = dVar.f220734e;
                if (eVar != null) {
                    C75026b.f220750a = false;
                    eVar.onHide();
                }
                SnackContainer snackContainer3 = SnackContainer.this;
                snackContainer3.startAnimation(snackContainer3.f220723e);
                if (!SnackContainer.this.f220722d.isEmpty()) {
                    ((LinkedList) SnackContainer.this.f220722d).clear();
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/snackbar/SnackContainer$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.snackbar.SnackContainer$d */
    public static class C75017d {

        /* renamed from: a */
        public final View f220730a;

        /* renamed from: b */
        public final TextView f220731b;

        /* renamed from: c */
        public final TextView f220732c;

        /* renamed from: d */
        public final Snack f220733d;

        /* renamed from: e */
        public final C75018a.C75025e f220734e;

        public C75017d(Snack snack, View view, C75018a.C75025e eVar, C75014a aVar) {
            this.f220730a = view;
            this.f220732c = (TextView) view.findViewById(C0966R.C0970id.jnz);
            this.f220731b = (TextView) view.findViewById(C0966R.C0970id.f359227jo1);
            this.f220733d = snack;
            this.f220734e = eVar;
        }
    }

    public SnackContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo104585a();
    }

    /* renamed from: a */
    public final void mo104585a() {
        this.f220725g = new AnimationSet(false);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.f220725g.setInterpolator(new DecelerateInterpolator(1.5f));
        this.f220725g.addAnimation(translateAnimation);
        this.f220725g.addAnimation(alphaAnimation);
        this.f220723e = new AnimationSet(false);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.f220723e.addAnimation(translateAnimation2);
        this.f220723e.addAnimation(alphaAnimation2);
        this.f220723e.setDuration(300);
        this.f220723e.setAnimationListener(new C75015b());
    }

    /* renamed from: b */
    public final void mo104586b(C75017d dVar, boolean z) {
        setVisibility(0);
        C75018a.C75025e eVar = dVar.f220734e;
        if (eVar != null) {
            C75026b.f220750a = true;
            eVar.onShow();
        }
        addView(dVar.f220730a);
        dVar.f220731b.setText(dVar.f220733d.f220716d);
        if (dVar.f220733d.f220717e != null) {
            dVar.f220732c.setVisibility(0);
            dVar.f220732c.setText(dVar.f220733d.f220717e);
        } else {
            dVar.f220732c.setVisibility(8);
        }
        if (z) {
            this.f220725g.setDuration(0);
        } else {
            this.f220725g.setDuration(500);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2393bw);
        loadAnimation.setDuration(500);
        startAnimation(this.f220725g);
        loadAnimation.setStartOffset(200);
        dVar.f220732c.startAnimation(loadAnimation);
        dVar.f220731b.startAnimation(loadAnimation);
        int i = dVar.f220733d.f220720h;
        if (i > 0) {
            postDelayed(this.f220724f, (long) i);
        }
        dVar.f220730a.setOnTouchListener(new C75016c(dVar));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f220725g.cancel();
        this.f220723e.cancel();
        removeCallbacks(this.f220724f);
        this.f220722d.clear();
    }

    public void onVisibilityChanged(View view, int i) {
        C75018a.C75025e eVar;
        super.onVisibilityChanged(view, i);
        if (8 == i) {
            removeAllViews();
            if (!this.f220722d.isEmpty() && (eVar = ((C75017d) ((LinkedList) this.f220722d).poll()).f220734e) != null) {
                C75026b.f220750a = false;
                eVar.onHide();
            }
            if (!this.f220722d.isEmpty()) {
                mo104586b((C75017d) ((LinkedList) this.f220722d).peek(), false);
            } else {
                setVisibility(8);
            }
            C75026b.f220750a = false;
        }
    }

    public SnackContainer(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        viewGroup.addView(this, new ViewGroup.LayoutParams(-1, -1));
        setVisibility(8);
        setId(C0966R.C0970id.f359226jo0);
        mo104585a();
    }
}
