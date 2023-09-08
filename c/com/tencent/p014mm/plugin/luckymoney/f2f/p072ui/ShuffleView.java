package com.tencent.p014mm.plugin.luckymoney.f2f.p072ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import q32.C77301c;
import s32.C22296j;
import s32.C22297k;
import s32.C22298l;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView */
public class ShuffleView extends FrameLayout {

    /* renamed from: E */
    public static DisplayMetrics f53077E;

    /* renamed from: A */
    public boolean f53078A;

    /* renamed from: B */
    public int f53079B = getResources().getDimensionPixelSize(C0966R.dimen.ae9);

    /* renamed from: C */
    public int f53080C = 2500;

    /* renamed from: D */
    public GestureDetector f53081D = new GestureDetector(new C18916j());

    /* renamed from: d */
    public List<View> f53082d = new ArrayList();

    /* renamed from: e */
    public C18918n f53083e = new C18918n();

    /* renamed from: f */
    public ValueAnimator f53084f;

    /* renamed from: g */
    public ValueAnimator f53085g;

    /* renamed from: h */
    public ValueAnimator f53086h;

    /* renamed from: i */
    public ValueAnimator f53087i;

    /* renamed from: j */
    public C18921l f53088j;

    /* renamed from: n */
    public C18921l f53089n;

    /* renamed from: o */
    public C18922m f53090o;

    /* renamed from: p */
    public View f53091p;

    /* renamed from: q */
    public View f53092q;

    /* renamed from: r */
    public View f53093r;

    /* renamed from: s */
    public int f53094s;

    /* renamed from: t */
    public View f53095t;

    /* renamed from: u */
    public int f53096u;

    /* renamed from: v */
    public int f53097v;

    /* renamed from: w */
    public float f53098w;

    /* renamed from: x */
    public float f53099x;

    /* renamed from: y */
    public ArrayList<Float> f53100y = new ArrayList<>();

    /* renamed from: z */
    public ArrayList<Float> f53101z = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$b */
    public class C18909b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f53102d;

        public C18909b(int i) {
            this.f53102d = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i = this.f53102d;
            while (true) {
                ShuffleView shuffleView = ShuffleView.this;
                if (i < shuffleView.f53097v - 1) {
                    View view = (View) ((ArrayList) shuffleView.f53082d).get(i);
                    C18918n nVar = ShuffleView.this.f53083e;
                    int i2 = nVar.f53114a;
                    if (i2 == 1) {
                        nVar.getClass();
                        int i3 = i + 1;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ShuffleView.this.f53083e.getClass();
                        view.setScaleX((1.0f - (((float) i3) * 0.01f)) + (floatValue * 0.01f));
                        ShuffleView shuffleView2 = ShuffleView.this;
                        int i4 = shuffleView2.f53083e.f53115b;
                        if (i4 == 2) {
                            view.setTranslationY(shuffleView2.mo23921h(i3) - (((Float) valueAnimator.getAnimatedValue()).floatValue() * ShuffleView.this.f53099x));
                        } else if (i4 == 1) {
                            view.setTranslationY(shuffleView2.mo23921h(i3) + (((Float) valueAnimator.getAnimatedValue()).floatValue() * ShuffleView.this.f53099x));
                        }
                    } else if (i2 == 2) {
                        int i5 = i + 1;
                        view.setScaleY((1.0f - (nVar.f53117d * ((float) i5))) + (((Float) valueAnimator.getAnimatedValue()).floatValue() * ShuffleView.this.f53083e.f53117d));
                        ShuffleView shuffleView3 = ShuffleView.this;
                        int i6 = shuffleView3.f53083e.f53115b;
                        if (i6 == 3) {
                            view.setTranslationX(shuffleView3.mo23918g(i5) + (((Float) valueAnimator.getAnimatedValue()).floatValue() * ShuffleView.this.f53098w));
                        } else if (i6 == 4) {
                            view.setTranslationX(shuffleView3.mo23918g(i5) - (((Float) valueAnimator.getAnimatedValue()).floatValue() * ShuffleView.this.f53098w));
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$d */
    public class C18910d implements ValueAnimator.AnimatorUpdateListener {
        public C18910d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShuffleView shuffleView = ShuffleView.this;
            C18921l lVar = shuffleView.f53088j;
            if (lVar != null) {
                ((C18923a) lVar).mo23956a(valueAnimator, shuffleView.f53091p);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$e */
    public class C18911e implements ValueAnimator.AnimatorUpdateListener {
        public C18911e() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShuffleView shuffleView = ShuffleView.this;
            C18921l lVar = shuffleView.f53089n;
            if (lVar != null) {
                ((C18923a) lVar).mo23956a(valueAnimator, shuffleView.f53092q);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$f */
    public class C18912f implements ValueAnimator.AnimatorUpdateListener {
        public C18912f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = 0;
            if (floatValue == 0.0f) {
                ShuffleView.this.f53100y.clear();
                ShuffleView.this.f53101z.clear();
                while (true) {
                    ShuffleView shuffleView = ShuffleView.this;
                    if (i < shuffleView.f53097v) {
                        shuffleView.f53100y.add(Float.valueOf(((View) ((ArrayList) shuffleView.f53082d).get(i)).getTranslationX()));
                        ShuffleView shuffleView2 = ShuffleView.this;
                        shuffleView2.f53101z.add(Float.valueOf(((View) ((ArrayList) shuffleView2.f53082d).get(i)).getTranslationY()));
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ShuffleView shuffleView3 = ShuffleView.this;
                    if (i < shuffleView3.f53097v) {
                        float f = 1.0f - floatValue;
                        ((View) ((ArrayList) shuffleView3.f53082d).get(i)).setTranslationX((ShuffleView.this.f53100y.get(i).floatValue() * f) + (ShuffleView.this.mo23918g(i) * floatValue));
                        ((View) ((ArrayList) ShuffleView.this.f53082d).get(i)).setTranslationY((ShuffleView.this.f53101z.get(i).floatValue() * f) + (ShuffleView.this.mo23921h(i) * floatValue));
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$g */
    public class C18913g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f53107d;

        /* renamed from: e */
        public final /* synthetic */ int f53108e;

        public C18913g(int i, int i2) {
            this.f53107d = i;
            this.f53108e = i2;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShuffleView shuffleView;
            int i;
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i2 = 0;
            if (floatValue == 0.0f) {
                ShuffleView.this.f53100y.clear();
                ShuffleView.this.f53101z.clear();
                while (true) {
                    ShuffleView shuffleView2 = ShuffleView.this;
                    if (i2 < shuffleView2.f53097v) {
                        shuffleView2.f53100y.add(Float.valueOf(((View) ((ArrayList) shuffleView2.f53082d).get(i2)).getTranslationX()));
                        ShuffleView shuffleView3 = ShuffleView.this;
                        shuffleView3.f53101z.add(Float.valueOf(((View) ((ArrayList) shuffleView3.f53082d).get(i2)).getTranslationY()));
                        i2++;
                    } else {
                        return;
                    }
                }
            } else {
                if (this.f53107d <= 0) {
                    while (true) {
                        ShuffleView shuffleView4 = ShuffleView.this;
                        if (i2 >= shuffleView4.f53094s) {
                            break;
                        }
                        float f = 1.0f - floatValue;
                        ((View) ((ArrayList) shuffleView4.f53082d).get(i2)).setTranslationX((ShuffleView.this.f53100y.get(i2).floatValue() * f) + (ShuffleView.this.mo23918g(i2) * floatValue));
                        ((View) ((ArrayList) ShuffleView.this.f53082d).get(i2)).setTranslationY((ShuffleView.this.f53101z.get(i2).floatValue() * f) + (ShuffleView.this.mo23921h(i2) * floatValue));
                        i2++;
                    }
                } else {
                    while (true) {
                        shuffleView = ShuffleView.this;
                        i = shuffleView.f53094s;
                        if (i2 >= i - 1) {
                            break;
                        }
                        float f2 = 1.0f - floatValue;
                        int i3 = i2 + 1;
                        ((View) ((ArrayList) shuffleView.f53082d).get(i2)).setTranslationX((ShuffleView.this.f53100y.get(i2).floatValue() * f2) + ((ShuffleView.this.mo23918g(i2) - (((float) i3) * ShuffleView.this.getSelectScaleTranslationX())) * floatValue));
                        ((View) ((ArrayList) ShuffleView.this.f53082d).get(i2)).setTranslationY((ShuffleView.this.f53101z.get(i2).floatValue() * f2) + (ShuffleView.this.mo23921h(i2) * floatValue));
                        i2 = i3;
                    }
                    ArrayList arrayList = (ArrayList) shuffleView.f53082d;
                    ShuffleView shuffleView5 = ShuffleView.this;
                    float f3 = 1.0f - floatValue;
                    ShuffleView shuffleView6 = ShuffleView.this;
                    ((View) arrayList.get(i - 1)).setTranslationX((shuffleView5.f53100y.get(shuffleView5.f53094s - 1).floatValue() * f3) + ((shuffleView6.mo23918g(shuffleView6.f53094s - 1) - ((ShuffleView.this.getSelectScaleTranslationX() * ((float) this.f53107d)) / 2.0f)) * floatValue));
                    ShuffleView shuffleView7 = ShuffleView.this;
                    ArrayList arrayList2 = (ArrayList) shuffleView7.f53082d;
                    ShuffleView shuffleView8 = ShuffleView.this;
                    float floatValue2 = shuffleView8.f53101z.get(shuffleView8.f53094s - 1).floatValue() * f3;
                    ShuffleView shuffleView9 = ShuffleView.this;
                    ((View) arrayList2.get(shuffleView7.f53094s - 1)).setTranslationY(floatValue2 + (shuffleView9.mo23921h(shuffleView9.f53094s - 1) * floatValue));
                }
                if (this.f53108e <= 0) {
                    int i4 = ShuffleView.this.f53094s;
                    while (true) {
                        ShuffleView shuffleView10 = ShuffleView.this;
                        if (i4 >= shuffleView10.f53097v) {
                            break;
                        }
                        float f4 = 1.0f - floatValue;
                        ((View) ((ArrayList) shuffleView10.f53082d).get(i4)).setTranslationX((ShuffleView.this.f53100y.get(i4).floatValue() * f4) + (ShuffleView.this.mo23918g(i4) * floatValue));
                        ((View) ((ArrayList) ShuffleView.this.f53082d).get(i4)).setTranslationY((ShuffleView.this.f53101z.get(i4).floatValue() * f4) + (ShuffleView.this.mo23921h(i4) * floatValue));
                        i4++;
                    }
                } else {
                    ShuffleView shuffleView11 = ShuffleView.this;
                    View view = shuffleView11.f53093r;
                    float f5 = 1.0f - floatValue;
                    ShuffleView shuffleView12 = ShuffleView.this;
                    view.setTranslationX((shuffleView11.f53100y.get(shuffleView11.f53094s).floatValue() * f5) + ((shuffleView12.mo23918g(shuffleView12.f53094s) + ((ShuffleView.this.getSelectScaleTranslationX() * ((float) this.f53108e)) / 2.0f)) * floatValue));
                    int i5 = ShuffleView.this.f53094s;
                    while (true) {
                        i5++;
                        ShuffleView shuffleView13 = ShuffleView.this;
                        if (i5 >= shuffleView13.f53097v) {
                            break;
                        }
                        float g = ShuffleView.this.mo23918g(i5);
                        ShuffleView shuffleView14 = ShuffleView.this;
                        ((View) ((ArrayList) shuffleView13.f53082d).get(i5)).setTranslationX((ShuffleView.this.f53100y.get(i5).floatValue() * f5) + ((g + (((float) (shuffleView14.f53097v - i5)) * shuffleView14.getSelectScaleTranslationX())) * floatValue));
                        ((View) ((ArrayList) ShuffleView.this.f53082d).get(i5)).setTranslationY((ShuffleView.this.f53101z.get(i5).floatValue() * f5) + (ShuffleView.this.mo23921h(i5) * floatValue));
                    }
                }
                ShuffleView shuffleView15 = ShuffleView.this;
                shuffleView15.f53093r.setTranslationY(((1.0f - floatValue) * shuffleView15.f53101z.get(shuffleView15.f53094s).floatValue()) - ((floatValue * ((float) ShuffleView.this.f53093r.getHeight())) / 7.0f));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$h */
    public class C18914h implements ValueAnimator.AnimatorUpdateListener {
        public C18914h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = 0;
            if (floatValue == 0.0f) {
                ShuffleView.this.f53100y.clear();
                ShuffleView.this.f53101z.clear();
                while (true) {
                    ShuffleView shuffleView = ShuffleView.this;
                    if (i < shuffleView.f53097v) {
                        shuffleView.f53100y.add(Float.valueOf(((View) ((ArrayList) shuffleView.f53082d).get(i)).getTranslationX()));
                        ShuffleView shuffleView2 = ShuffleView.this;
                        shuffleView2.f53101z.add(Float.valueOf(((View) ((ArrayList) shuffleView2.f53082d).get(i)).getTranslationY()));
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                ShuffleView shuffleView3 = ShuffleView.this;
                View view = shuffleView3.f53093r;
                if (view != null) {
                    view.setTranslationY((shuffleView3.f53101z.get(0).floatValue() * (1.0f - floatValue)) - ((((float) ShuffleView.this.f53093r.getHeight()) * floatValue) / 7.0f));
                }
                int i2 = 1;
                while (true) {
                    ShuffleView shuffleView4 = ShuffleView.this;
                    if (i2 < shuffleView4.f53097v) {
                        List<View> list = shuffleView4.f53082d;
                        if (!(list == null || ((ArrayList) list).get(i2) == null)) {
                            float f = 1.0f - floatValue;
                            ((View) ((ArrayList) ShuffleView.this.f53082d).get(i2)).setTranslationX((ShuffleView.this.f53100y.get(i2).floatValue() * f) + (ShuffleView.this.mo23918g(i2) * floatValue));
                            ((View) ((ArrayList) ShuffleView.this.f53082d).get(i2)).setTranslationY((ShuffleView.this.f53101z.get(i2).floatValue() * f) + (ShuffleView.this.mo23921h(i2) * floatValue));
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$i */
    public class C18915i implements ValueAnimator.AnimatorUpdateListener {
        public C18915i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = 0;
            if (floatValue == 0.0f) {
                ShuffleView.this.f53100y.clear();
                ShuffleView.this.f53101z.clear();
                while (true) {
                    ShuffleView shuffleView = ShuffleView.this;
                    if (i < shuffleView.f53097v) {
                        shuffleView.f53100y.add(Float.valueOf(((View) ((ArrayList) shuffleView.f53082d).get(i)).getTranslationX()));
                        ShuffleView shuffleView2 = ShuffleView.this;
                        shuffleView2.f53101z.add(Float.valueOf(((View) ((ArrayList) shuffleView2.f53082d).get(i)).getTranslationY()));
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ShuffleView shuffleView3 = ShuffleView.this;
                    if (i < shuffleView3.f53097v) {
                        float f = 1.0f - floatValue;
                        ((View) ((ArrayList) shuffleView3.f53082d).get(i)).setTranslationX((ShuffleView.this.f53100y.get(i).floatValue() * f) + (ShuffleView.this.mo23918g(i) * floatValue));
                        ((View) ((ArrayList) ShuffleView.this.f53082d).get(i)).setTranslationY((ShuffleView.this.f53101z.get(i).floatValue() * f) + (ShuffleView.this.mo23921h(i) * floatValue));
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$j */
    public class C18916j implements GestureDetector.OnGestureListener {
        public C18916j() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            Log.m105918d("ShuffleView", "gesture down");
            if (ShuffleView.this.f53083e.f53115b == 4) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i = 0;
                while (true) {
                    ShuffleView shuffleView = ShuffleView.this;
                    if (i >= shuffleView.f53097v) {
                        break;
                    }
                    Rect f = shuffleView.mo23917f(i);
                    if (f == null || !f.contains(x, y)) {
                        i++;
                    } else {
                        View view = (View) ((ArrayList) ShuffleView.this.f53082d).get(i);
                        ShuffleView shuffleView2 = ShuffleView.this;
                        View view2 = shuffleView2.f53093r;
                        if (view2 != view && view2 != null) {
                            shuffleView2.mo23915d();
                        } else if (view2 == view) {
                            Log.m105924i("ShuffleView", "down on the select card");
                            return true;
                        }
                        ShuffleView.m19861a(ShuffleView.this, i);
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Log.m105924i("ShuffleView", "fling up " + f2);
            ShuffleView shuffleView = ShuffleView.this;
            if (f2 >= ((float) (-shuffleView.f53080C))) {
                return false;
            }
            if (shuffleView.f53083e.f53115b != 4) {
                return true;
            }
            if (shuffleView.f53093r != null) {
                shuffleView.mo23915d();
            }
            ShuffleView shuffleView2 = ShuffleView.this;
            if (shuffleView2.f53095t == null) {
                return true;
            }
            C18922m mVar = shuffleView2.f53090o;
            if (mVar != null) {
                ((C18924b) mVar).mo23958b(shuffleView2.f53096u, shuffleView2.f53097v);
            }
            ShuffleView shuffleView3 = ShuffleView.this;
            shuffleView3.mo23923j(shuffleView3.f53096u);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent2.getActionMasked() == 2) {
                int x = (int) motionEvent2.getX();
                int y = (int) motionEvent2.getY();
                if (ShuffleView.this.f53083e.f53115b == 4) {
                    if (Math.abs(f2) < ((float) ShuffleView.this.f53079B)) {
                        int i = 0;
                        while (true) {
                            ShuffleView shuffleView = ShuffleView.this;
                            if (i >= shuffleView.f53097v) {
                                break;
                            }
                            Rect f3 = shuffleView.mo23917f(i);
                            if (f3 != null && f3.contains(x, y)) {
                                View view = (View) ((ArrayList) ShuffleView.this.f53082d).get(i);
                                ShuffleView shuffleView2 = ShuffleView.this;
                                View view2 = shuffleView2.f53093r;
                                if (view2 == view || view2 == null) {
                                    if (view2 == view) {
                                        Log.m105924i("ShuffleView", "scroll on the select card");
                                        break;
                                    }
                                } else {
                                    shuffleView2.mo23915d();
                                }
                                ShuffleView shuffleView3 = ShuffleView.this;
                                if (shuffleView3.f53095t != view) {
                                    shuffleView3.mo23916e();
                                    ShuffleView.m19861a(ShuffleView.this, i);
                                }
                            }
                            i++;
                        }
                    }
                    if (Math.abs(f) < ((float) ShuffleView.this.f53079B)) {
                        Log.m105918d("ShuffleView", "scroll distanceY:" + f2);
                        ShuffleView shuffleView4 = ShuffleView.this;
                        View view3 = shuffleView4.f53095t;
                        if (view3 == null && (view3 = shuffleView4.f53093r) == null) {
                            view3 = null;
                        }
                        if (view3 != null) {
                            Log.m105924i("ShuffleView", "scroll translationY:" + view3.getTranslationY() + "," + (view3.getHeight() / 7));
                            if (((int) view3.getTranslationY()) <= (-view3.getHeight()) / 7) {
                                if (f2 < 0.0f && Math.abs(f2) > ((float) ShuffleView.this.f53079B)) {
                                    if (((int) f2) <= (-view3.getHeight()) / 7) {
                                        view3.setTranslationY(0.0f);
                                    } else {
                                        view3.setTranslationY(view3.getTranslationY() - f2);
                                    }
                                    ShuffleView shuffleView5 = ShuffleView.this;
                                    View view4 = shuffleView5.f53093r;
                                    if (view3 == view4) {
                                        shuffleView5.f53095t = view4;
                                        shuffleView5.f53096u = shuffleView5.f53094s;
                                        if (shuffleView5.f53087i.isStarted()) {
                                            Log.m105924i("ShuffleView", "scroll when select view is animation");
                                            ShuffleView.this.f53087i.cancel();
                                        }
                                        ShuffleView shuffleView6 = ShuffleView.this;
                                        shuffleView6.f53093r = null;
                                        shuffleView6.f53094s = 0;
                                    }
                                }
                            } else if (view3.getTranslationY() == 0.0f) {
                                if (f2 > 0.0f && Math.abs(f2) > ((float) ShuffleView.this.f53079B)) {
                                    if (((int) f2) >= view3.getHeight() / 7) {
                                        view3.setTranslationY((float) ((-view3.getHeight()) / 7));
                                    } else {
                                        view3.setTranslationY(view3.getTranslationY() - f2);
                                    }
                                }
                            } else if (f2 < 0.0f) {
                                if (view3.getTranslationY() - f2 >= 0.0f) {
                                    view3.setTranslationY(0.0f);
                                } else {
                                    view3.setTranslationY(view3.getTranslationY() - f2);
                                }
                            } else if (((int) (view3.getTranslationY() - f2)) <= (-view3.getHeight()) / 7) {
                                view3.setTranslationY((float) ((-view3.getHeight()) / 7));
                            } else {
                                view3.setTranslationY(view3.getTranslationY() - f2);
                            }
                        }
                    }
                }
            }
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            ShuffleView shuffleView = ShuffleView.this;
            if (shuffleView.f53083e.f53115b != 4) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return false;
            }
            if (shuffleView.f53093r != null) {
                Log.m105918d("ShuffleView", "click the select card");
                ShuffleView shuffleView2 = ShuffleView.this;
                C18922m mVar = shuffleView2.f53090o;
                if (mVar != null) {
                    ((C18924b) mVar).mo23957a(shuffleView2.f53094s, shuffleView2.f53097v);
                }
                ShuffleView.this.mo23915d();
            }
            ShuffleView shuffleView3 = ShuffleView.this;
            if (shuffleView3.f53095t != null) {
                C18922m mVar2 = shuffleView3.f53090o;
                if (mVar2 != null) {
                    ((C18924b) mVar2).mo23958b(shuffleView3.f53096u, shuffleView3.f53097v);
                }
                ShuffleView shuffleView4 = ShuffleView.this;
                shuffleView4.mo23923j(shuffleView4.f53096u);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$k */
    public class C18917k implements ValueAnimator.AnimatorUpdateListener {
        public C18917k() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = 0;
            if (floatValue == 0.0f) {
                ShuffleView.this.f53100y.clear();
                ShuffleView.this.f53101z.clear();
                while (true) {
                    ShuffleView shuffleView = ShuffleView.this;
                    if (i < shuffleView.f53097v) {
                        shuffleView.f53100y.add(Float.valueOf(((View) ((ArrayList) shuffleView.f53082d).get(i)).getTranslationX()));
                        ShuffleView shuffleView2 = ShuffleView.this;
                        shuffleView2.f53101z.add(Float.valueOf(((View) ((ArrayList) shuffleView2.f53082d).get(i)).getTranslationY()));
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ShuffleView shuffleView3 = ShuffleView.this;
                    if (i < shuffleView3.f53097v) {
                        View view = (View) ((ArrayList) shuffleView3.f53082d).get(i);
                        if (i < ShuffleView.this.f53100y.size()) {
                            C18918n nVar = ShuffleView.this.f53083e;
                            int i2 = nVar.f53114a;
                            if (i2 == 1) {
                                nVar.getClass();
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ShuffleView.this.f53083e.getClass();
                                view.setScaleX((1.0f - (((float) (i + 1)) * 0.01f)) + (floatValue2 * 0.01f));
                                view.setTranslationY((ShuffleView.this.mo23921h(i) * floatValue) + ((1.0f - floatValue) * ShuffleView.this.f53101z.get(i).floatValue()));
                            } else if (i2 == 2) {
                                view.setScaleY((1.0f - (nVar.f53117d * ((float) (i + 1)))) + (((Float) valueAnimator.getAnimatedValue()).floatValue() * ShuffleView.this.f53083e.f53117d));
                                view.setTranslationX((ShuffleView.this.mo23918g(i) * floatValue) + ((1.0f - floatValue) * ShuffleView.this.f53100y.get(i).floatValue()));
                            }
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$n */
    public static class C18918n {

        /* renamed from: a */
        public int f53114a = 1;

        /* renamed from: b */
        public int f53115b = 1;

        /* renamed from: c */
        public int f53116c = 2;

        /* renamed from: d */
        public float f53117d = 0.01f;

        /* renamed from: e */
        public int f53118e = 200;
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$a */
    public class C18919a implements Animator.AnimatorListener {
        public C18919a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ShuffleView shuffleView = ShuffleView.this;
            shuffleView.f53078A = false;
            shuffleView.f53095t = null;
            shuffleView.f53096u = -1;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            ShuffleView.this.f53078A = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$c */
    public class C18920c implements Animator.AnimatorListener {
        public C18920c() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ShuffleView shuffleView = ShuffleView.this;
            shuffleView.f53078A = false;
            View view = shuffleView.f53092q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$12", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$12", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ValueAnimator valueAnimator = ShuffleView.this.f53085g;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            ShuffleView.this.f53078A = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$l */
    public interface C18921l {
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView$m */
    public interface C18922m {
    }

    public ShuffleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static void m19861a(ShuffleView shuffleView, int i) {
        if (i < 0) {
            shuffleView.getClass();
        } else if (i < shuffleView.f53097v) {
            Log.m105924i("ShuffleView", "touch card " + i);
            if (shuffleView.f53087i.isStarted()) {
                shuffleView.f53087i.cancel();
            }
            shuffleView.f53087i.removeAllUpdateListeners();
            shuffleView.f53087i.removeAllListeners();
            shuffleView.f53095t = (View) ((ArrayList) shuffleView.f53082d).get(i);
            shuffleView.f53096u = i;
            if (shuffleView.f53083e.f53115b == 4) {
                if (i > 0) {
                    shuffleView.f53087i.addUpdateListener(new C22297k(shuffleView, i - 1, (shuffleView.f53097v - 1) - i));
                } else {
                    shuffleView.f53087i.addUpdateListener(new C22298l(shuffleView));
                }
                C18922m mVar = shuffleView.f53090o;
                if (mVar != null) {
                    int i2 = shuffleView.f53096u;
                    C18924b bVar = (C18924b) mVar;
                    if (shuffleView.f53097v == 8) {
                        C77301c cVar = bVar.f53122a.f53011H;
                        cVar.mo107445a("music" + (i2 + 1) + ".m4a");
                        int[] iArr = bVar.f53122a.f53029V;
                        iArr[4] = iArr[4] + 1;
                    } else {
                        bVar.f53122a.f53011H.mo107445a("touch_card.m4a");
                        int[] iArr2 = bVar.f53122a.f53029V;
                        iArr2[2] = iArr2[2] + 1;
                    }
                }
            }
            shuffleView.f53087i.start();
        }
    }

    /* access modifiers changed from: private */
    public float getSelectScaleTranslationX() {
        View view = this.f53093r;
        if (view == null) {
            return 0.0f;
        }
        float width = (((float) view.getWidth()) * 0.33f) - this.f53098w;
        int i = this.f53094s;
        int i2 = i - 1;
        int i3 = (this.f53097v - 1) - i;
        int i4 = 0;
        if (i2 > 0) {
            i4 = 0 + i2;
        }
        if (i3 > 0) {
            i4 += i3;
        }
        if (i4 > 0) {
            return (width * 2.0f) / ((float) i4);
        }
        return 0.0f;
    }

    /* access modifiers changed from: private */
    public float getTouchScaleTranslationX() {
        View view = this.f53095t;
        if (view == null) {
            return 0.0f;
        }
        float width = (((float) view.getWidth()) * 0.28f) - this.f53098w;
        int i = this.f53096u;
        int i2 = i - 1;
        int i3 = (this.f53097v - 1) - i;
        int i4 = 0;
        if (i2 > 0) {
            i4 = 0 + i2;
        }
        if (i3 > 0) {
            i4 += i3;
        }
        if (i4 > 0) {
            return (width * 2.0f) / ((float) i4);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void mo23915d() {
        if (this.f53093r != null) {
            Log.m105924i("ShuffleView", "selectView != null, cancel select");
            if (this.f53087i.isStarted()) {
                this.f53087i.cancel();
            }
            this.f53087i.removeAllUpdateListeners();
            this.f53087i.removeAllListeners();
            if (this.f53083e.f53115b == 4 && this.f53094s >= 0) {
                this.f53087i.addUpdateListener(new C18912f());
            }
            this.f53093r = null;
            this.f53094s = 0;
            this.f53087i.start();
        }
    }

    /* renamed from: e */
    public final void mo23916e() {
        if (this.f53095t != null) {
            Log.m105924i("ShuffleView", "touchView != null,cancel touch");
            if (this.f53087i.isStarted()) {
                this.f53087i.cancel();
            }
            this.f53087i.removeAllUpdateListeners();
            this.f53087i.removeAllListeners();
            if (this.f53083e.f53115b == 4 && this.f53096u >= 0) {
                this.f53087i.addUpdateListener(new C18915i());
            }
            this.f53095t = null;
            this.f53096u = -1;
            this.f53087i.start();
        }
    }

    /* renamed from: f */
    public final Rect mo23917f(int i) {
        if (i < 0 || i >= this.f53097v) {
            return null;
        }
        View view = (View) ((ArrayList) this.f53082d).get(i);
        if (this.f53083e.f53115b != 4) {
            return null;
        }
        if (i == 0) {
            return new Rect(view.getLeft() + ((int) view.getTranslationX()), view.getTop() + ((int) view.getTranslationY()), view.getRight() + ((int) view.getTranslationX()), view.getBottom() + ((int) view.getTranslationY()));
        }
        View view2 = (View) ((ArrayList) this.f53082d).get(i - 1);
        return new Rect(view2.getRight() + ((int) view2.getTranslationX()), view.getTop() + ((int) view.getTranslationY()), view.getRight() + ((int) view.getTranslationX()), view.getBottom() + ((int) view.getTranslationY()));
    }

    /* renamed from: g */
    public float mo23918g(int i) {
        int i2;
        C18918n nVar = this.f53083e;
        if (nVar.f53114a != 2 || (i2 = this.f53097v) <= 0) {
            return 0.0f;
        }
        int i3 = nVar.f53115b;
        if (i3 == 3) {
            float f = this.f53098w;
            return ((((float) (i2 - 1)) * 0.5f) * f) - (f * ((float) i));
        } else if (i3 != 4) {
            return 0.0f;
        } else {
            float f2 = this.f53098w;
            return (((float) i) * f2) - ((((float) (i2 - 1)) * 0.5f) * f2);
        }
    }

    public View getEnterView() {
        return this.f53092q;
    }

    public View getExitView() {
        return this.f53091p;
    }

    /* renamed from: h */
    public float mo23921h(int i) {
        C18918n nVar = this.f53083e;
        if (nVar.f53114a != 1) {
            return 0.0f;
        }
        int i2 = nVar.f53115b;
        if (i2 == 1) {
            float f = this.f53099x;
            return ((((float) (this.f53097v - 1)) * 0.5f) * f) - (f * ((float) i));
        } else if (i2 != 2) {
            return 0.0f;
        } else {
            float f2 = this.f53099x;
            return (((float) i) * f2) - ((((float) (this.f53097v - 1)) * 0.5f) * f2);
        }
    }

    /* renamed from: i */
    public final void mo23922i(int i) {
        this.f53086h.removeAllUpdateListeners();
        this.f53086h.removeAllListeners();
        int size = ((ArrayList) this.f53082d).size();
        int i2 = this.f53097v;
        if (size < i2) {
            int i3 = i2 - 1;
            this.f53097v = i3;
            if (i3 == 1) {
                View findViewById = ((View) ((ArrayList) this.f53082d).get(0)).findViewById(C0966R.C0970id.gfb);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo23925l();
            this.f53086h.addUpdateListener(new C18917k());
            this.f53086h.addListener(new C18919a());
        } else {
            View view2 = (View) ((ArrayList) this.f53082d).get(i2 - 1);
            this.f53092q = view2;
            mo23924k(view2, this.f53097v - 1);
            addView(this.f53092q, 0);
            if (this.f53085g != null) {
                int i4 = this.f53083e.f53116c;
                if (i4 == 1) {
                    this.f53092q.setTranslationY((float) (-f53077E.heightPixels));
                } else if (i4 == 2) {
                    this.f53092q.setTranslationY((float) f53077E.heightPixels);
                } else if (i4 == 3) {
                    this.f53092q.setTranslationX((float) (-f53077E.widthPixels));
                } else if (i4 == 4) {
                    this.f53092q.setTranslationX((float) f53077E.widthPixels);
                }
            }
            View view3 = this.f53092q;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f53086h.addUpdateListener(new C18909b(i));
            this.f53086h.addListener(new C18920c());
        }
        this.f53086h.start();
    }

    /* renamed from: j */
    public final void mo23923j(int i) {
        if (i >= 0 && i < this.f53097v) {
            Log.m105924i("ShuffleView", "select card " + i);
            if (this.f53087i.isStarted()) {
                this.f53087i.cancel();
            }
            this.f53087i.removeAllUpdateListeners();
            this.f53087i.removeAllListeners();
            this.f53093r = (View) ((ArrayList) this.f53082d).get(i);
            this.f53094s = i;
            this.f53095t = null;
            this.f53096u = -1;
            if (this.f53083e.f53115b == 4) {
                if (i > 0) {
                    this.f53087i.addUpdateListener(new C18913g(i - 1, (this.f53097v - 1) - i));
                } else {
                    this.f53087i.addUpdateListener(new C18914h());
                }
            }
            this.f53087i.start();
        }
    }

    /* renamed from: k */
    public final void mo23924k(View view, int i) {
        C18918n nVar = this.f53083e;
        int i2 = nVar.f53114a;
        if (i2 == 1) {
            nVar.getClass();
            view.setScaleX(1.0f - (0.01f * ((float) i)));
            view.setTranslationY(mo23921h(i));
        } else if (i2 == 2) {
            view.setScaleY(1.0f - (nVar.f53117d * ((float) i)));
            view.setTranslationX(mo23918g(i));
        }
    }

    /* renamed from: l */
    public final void mo23925l() {
        if (this.f53097v > 1) {
            Log.m105919d("ShuffleView", "card width: %d,height: %d", Integer.valueOf(((View) ((ArrayList) this.f53082d).get(0)).getWidth()), Integer.valueOf(((View) ((ArrayList) this.f53082d).get(0)).getHeight()));
            int i = this.f53083e.f53114a;
            if (i == 2) {
                float width = (((float) ((View) ((ArrayList) this.f53082d).get(0)).getWidth()) * 1.5f) / ((float) this.f53097v);
                this.f53098w = width;
                if (width > ((float) ((View) ((ArrayList) this.f53082d).get(0)).getWidth()) * 0.23f) {
                    this.f53098w = ((float) ((View) ((ArrayList) this.f53082d).get(0)).getWidth()) * 0.23f;
                }
            } else if (i == 1) {
                this.f53099x = (((float) ((View) ((ArrayList) this.f53082d).get(0)).getHeight()) * 1.0f) / ((float) this.f53097v);
            }
        } else {
            this.f53098w = 0.0f;
            this.f53099x = 0.0f;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f53078A) {
            return true;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.f53097v <= 0) {
            return false;
        }
        Log.m105919d("ShuffleView", "y:%d,packet largest:%d", Integer.valueOf(y), Integer.valueOf((getHeight() - ((View) ((ArrayList) this.f53082d).get(0)).getHeight()) - (((View) ((ArrayList) this.f53082d).get(0)).getHeight() / 7)));
        if (y < (getHeight() - ((View) ((ArrayList) this.f53082d).get(0)).getHeight()) - (((View) ((ArrayList) this.f53082d).get(0)).getHeight() / 7)) {
            if (this.f53093r == null || motionEvent.getActionMasked() != 0) {
                View view = this.f53095t;
                if (view != null && view.getTranslationY() == ((float) ((-this.f53095t.getHeight()) / 7))) {
                    C18922m mVar = this.f53090o;
                    if (mVar != null) {
                        ((C18924b) mVar).mo23958b(this.f53096u, this.f53097v);
                    }
                    mo23923j(this.f53096u);
                } else if (this.f53095t != null) {
                    mo23916e();
                }
            } else {
                C18922m mVar2 = this.f53090o;
                if (mVar2 != null) {
                    ((C18924b) mVar2).mo23957a(this.f53094s, this.f53097v);
                }
                mo23915d();
            }
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= this.f53097v) {
                z = false;
                break;
            }
            Rect f = mo23917f(i);
            if (f != null && f.contains(x, y)) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            Log.m105919d("ShuffleView", "event %d out of cards,%d,%d", Integer.valueOf(motionEvent.getActionMasked()), Integer.valueOf(x), Integer.valueOf(y));
            if (this.f53093r == null || motionEvent.getActionMasked() != 0) {
                View view2 = this.f53095t;
                if (view2 != null && view2.getTranslationY() == ((float) ((-this.f53095t.getHeight()) / 7))) {
                    C18922m mVar3 = this.f53090o;
                    if (mVar3 != null) {
                        ((C18924b) mVar3).mo23958b(this.f53096u, this.f53097v);
                    }
                    mo23923j(this.f53096u);
                } else if (this.f53095t != null) {
                    mo23916e();
                }
            } else {
                C18922m mVar4 = this.f53090o;
                if (mVar4 != null) {
                    ((C18924b) mVar4).mo23957a(this.f53094s, this.f53097v);
                }
                mo23915d();
            }
        }
        if (this.f53097v <= 1) {
            return false;
        }
        GestureDetector gestureDetector = this.f53081D;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        Log.m105925i("ShuffleView", "ret:%s,action:%s", Boolean.valueOf(onTouchEvent), Integer.valueOf(motionEvent.getActionMasked()));
        if (!onTouchEvent && motionEvent.getActionMasked() == 1) {
            View view3 = this.f53095t;
            if (view3 != null && view3.getTranslationY() == ((float) ((-this.f53095t.getHeight()) / 7))) {
                C18922m mVar5 = this.f53090o;
                if (mVar5 != null) {
                    ((C18924b) mVar5).mo23958b(this.f53096u, this.f53097v);
                }
                mo23923j(this.f53096u);
            } else if (this.f53095t != null) {
                mo23916e();
            }
        }
        return true;
    }

    public void setAllShuffleCards(List<View> list) {
        ((ArrayList) this.f53082d).clear();
        ((ArrayList) this.f53082d).addAll(list);
        this.f53094s = 0;
        this.f53093r = null;
        this.f53096u = -1;
        this.f53095t = null;
        removeAllViews();
        ArrayList arrayList = (ArrayList) this.f53082d;
        if (arrayList.size() > 100) {
            this.f53097v = 100;
        } else {
            int size = arrayList.size();
            this.f53097v = size;
            if (size == 1) {
                View findViewById = ((View) arrayList.get(0)).findViewById(C0966R.C0970id.gfb);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "fitCards", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "fitCards", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        for (int i = this.f53097v - 1; i >= 0; i--) {
            addView((View) arrayList.get(i));
        }
        addOnLayoutChangeListener(new C22296j(this));
    }

    public void setCardListener(C18922m mVar) {
        this.f53090o = mVar;
    }

    public void setEnterAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f53085g;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f53085g.cancel();
        }
        this.f53085g = valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new C18911e());
        }
    }

    public void setEnterAnimatorListener(C18921l lVar) {
        this.f53089n = lVar;
    }

    public void setExitAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f53084f;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f53084f.cancel();
        }
        this.f53084f = valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new C18910d());
        }
    }

    public void setExitAnimatorListener(C18921l lVar) {
        this.f53088j = lVar;
    }

    public void setShuffleSetting(C18918n nVar) {
        this.f53083e = nVar;
        this.f53086h = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration((long) nVar.f53118e);
        this.f53087i = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration((long) 80);
    }
}
