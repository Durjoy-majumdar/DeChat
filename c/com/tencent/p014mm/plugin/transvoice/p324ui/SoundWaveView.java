package com.tencent.p014mm.plugin.transvoice.p324ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import h13.C20882a;
import i13.C21041e;
import i13.C21042f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView */
public class SoundWaveView extends View {

    /* renamed from: A */
    public C19408f f54780A;

    /* renamed from: d */
    public C19411i f54781d;

    /* renamed from: e */
    public C19409g f54782e;

    /* renamed from: f */
    public ArrayList<Integer> f54783f;

    /* renamed from: g */
    public ArrayList<Integer> f54784g;

    /* renamed from: h */
    public ArrayList<AnimatorSet> f54785h;

    /* renamed from: i */
    public List<List<Float>> f54786i;

    /* renamed from: j */
    public List<List<Float>> f54787j;

    /* renamed from: n */
    public Interpolator f54788n;

    /* renamed from: o */
    public Paint f54789o;

    /* renamed from: p */
    public int f54790p;

    /* renamed from: q */
    public int f54791q;

    /* renamed from: r */
    public int f54792r;

    /* renamed from: s */
    public int f54793s;

    /* renamed from: t */
    public int f54794t;

    /* renamed from: u */
    public int f54795u;

    /* renamed from: v */
    public int f54796v;

    /* renamed from: w */
    public int f54797w;

    /* renamed from: x */
    public int f54798x;

    /* renamed from: y */
    public Runnable f54799y;

    /* renamed from: z */
    public int f54800z;

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView$a */
    public class C19403a implements Runnable {
        public C19403a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.NewTrans2Txt.SoundWaveView", "active waiting!!!");
            SoundWaveView soundWaveView = SoundWaveView.this;
            soundWaveView.f54782e = C19409g.WAITING;
            soundWaveView.f54800z = -1;
            soundWaveView.mo25105f();
            Iterator<AnimatorSet> it = soundWaveView.f54785h.iterator();
            while (it.hasNext()) {
                it.next().end();
            }
            Iterator<AnimatorSet> it4 = soundWaveView.f54785h.iterator();
            while (it4.hasNext()) {
                it4.next().start();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView$b */
    public class C19404b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f54802d;

        /* renamed from: e */
        public final /* synthetic */ int f54803e;

        /* renamed from: f */
        public final /* synthetic */ float f54804f;

        public C19404b(SoundWaveView soundWaveView, List list, int i, float f) {
            this.f54802d = list;
            this.f54803e = i;
            this.f54804f = f;
        }

        public void run() {
            this.f54802d.set(this.f54803e, Float.valueOf(this.f54804f));
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView$c */
    public class C19405c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f54805d;

        /* renamed from: e */
        public final /* synthetic */ int f54806e;

        /* renamed from: f */
        public final /* synthetic */ float f54807f;

        public C19405c(SoundWaveView soundWaveView, List list, int i, float f) {
            this.f54805d = list;
            this.f54806e = i;
            this.f54807f = f;
        }

        public void run() {
            this.f54805d.set(this.f54806e, Float.valueOf(this.f54807f));
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView$d */
    public class C19406d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f54808d;

        public C19406d(int i) {
            this.f54808d = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SoundWaveView.this.f54784g.set(this.f54808d, (Integer) valueAnimator.getAnimatedValue());
            SoundWaveView.this.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView$e */
    public class C19407e implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ int f54810d;

        public C19407e(int i) {
            this.f54810d = i;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105919d("MicroMsg.NewTrans2Txt.SoundWaveView", "AnimatorSet onAnimationEnd, mode: %s", SoundWaveView.this.f54782e);
            C19409g gVar = C19409g.WAITING;
            SoundWaveView soundWaveView = SoundWaveView.this;
            if (gVar == soundWaveView.f54782e && this.f54810d == soundWaveView.f54785h.size() - 1 && SoundWaveView.this.isShown()) {
                Log.m105918d("MicroMsg.NewTrans2Txt.SoundWaveView", "restart waiting anim!!!");
                Iterator<AnimatorSet> it = SoundWaveView.this.f54785h.iterator();
                while (it.hasNext()) {
                    it.next().start();
                }
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView$f */
    public class C19408f {

        /* renamed from: a */
        public int f54812a = -1;

        /* renamed from: b */
        public int f54813b = -1;

        public C19408f(SoundWaveView soundWaveView, C19403a aVar) {
        }

        public String toString() {
            return "start: " + this.f54812a + " end: " + this.f54813b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView$g */
    public enum C19409g {
        WAITING,
        REACTING,
        JUDGING
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView$h */
    public static class C19410h {

        /* renamed from: a */
        public static float[] f54818a = {0.8f, 0.6f};

        /* renamed from: b */
        public static float[] f54819b = {0.5f, 0.3f};

        /* renamed from: c */
        public static int f54820c = 14;

        /* renamed from: d */
        public static int f54821d = 74;

        /* renamed from: e */
        public static int f54822e = 29;
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.SoundWaveView$i */
    public enum C19411i {
        NORMAL,
        MINI
    }

    public SoundWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getActiveBundleIndex() {
        Log.m105919d("MicroMsg.NewTrans2Txt.SoundWaveView", "getActiveBundleIndex, mLastActiveBundleIndex: %s.", Integer.valueOf(this.f54800z));
        if (-1 == this.f54800z) {
            Random random = new Random();
            C19408f fVar = this.f54780A;
            int nextInt = random.nextInt((fVar.f54813b - fVar.f54812a) + 1) + this.f54780A.f54812a;
            this.f54800z = nextInt;
            return nextInt;
        }
        int nextInt2 = new Random().nextInt(3);
        if (1 == nextInt2) {
            int i = this.f54800z - 1;
            if (mo25102c(i)) {
                i = this.f54800z + 1;
                if (mo25102c(i)) {
                    Log.m105925i("MicroMsg.NewTrans2Txt.SoundWaveView", "getActiveBundleIndex, keep! %s %s", Integer.valueOf(this.f54800z), this.f54780A);
                    return this.f54800z;
                }
            }
            return i;
        } else if (2 != nextInt2) {
            return this.f54800z;
        } else {
            int i2 = this.f54800z + 1;
            if (mo25102c(i2)) {
                i2 = this.f54800z - 1;
                if (mo25102c(i2)) {
                    Log.m105925i("MicroMsg.NewTrans2Txt.SoundWaveView", "getActiveBundleIndex, keep! %s %s", Integer.valueOf(this.f54800z), this.f54780A);
                    return this.f54800z;
                }
            }
            return i2;
        }
    }

    private int getBundleCount() {
        float[] fArr = C19410h.f54818a;
        return C19411i.MINI == this.f54781d ? 2 : 5;
    }

    private int getVolumeItemCount() {
        int bundleCount = getBundleCount();
        float[] fArr = C19410h.f54818a;
        return bundleCount * 5;
    }

    /* renamed from: a */
    public final void mo25100a() {
        int bundleCount = getBundleCount();
        int i = bundleCount / 2;
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i + 1;
        if (i3 >= bundleCount) {
            i3 = bundleCount - 1;
        }
        C19408f fVar = this.f54780A;
        fVar.f54812a = i2;
        fVar.f54813b = i3;
        Log.m105925i("MicroMsg.NewTrans2Txt.SoundWaveView", "initBaseBundleGroupInfo: %s", fVar.toString());
    }

    /* renamed from: b */
    public final void mo25101b() {
        this.f54785h.clear();
        int volumeItemCount = getVolumeItemCount();
        for (int i = 0; i < volumeItemCount; i++) {
            AnimatorSet animatorSet = new AnimatorSet();
            float[] fArr = C19410h.f54818a;
            animatorSet.setStartDelay((long) (100 * i));
            animatorSet.setInterpolator(new LinearInterpolator());
            C19406d dVar = new C19406d(i);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f54793s, this.f54795u});
            long j = (long) 500;
            ofInt.setDuration(j);
            ofInt.addUpdateListener(dVar);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{this.f54795u, this.f54793s});
            ofInt2.setDuration(j);
            ofInt2.addUpdateListener(dVar);
            int i2 = this.f54793s;
            ValueAnimator ofInt3 = ValueAnimator.ofInt(new int[]{i2, i2});
            ofInt3.setDuration((long) 1000);
            ofInt3.addUpdateListener(dVar);
            animatorSet.addListener(new C19407e(i));
            animatorSet.playSequentially(new Animator[]{ofInt, ofInt2, ofInt3});
            this.f54785h.add(animatorSet);
        }
    }

    /* renamed from: c */
    public final boolean mo25102c(int i) {
        C19408f fVar = this.f54780A;
        return !(i >= fVar.f54812a && i <= fVar.f54813b);
    }

    /* renamed from: d */
    public void mo25103d() {
        Iterator it = ((ArrayList) this.f54786i).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List list = (List) it.next();
            for (int i = 0; i < list.size(); i++) {
                list.set(i, Float.valueOf((float) this.f54793s));
            }
        }
        Iterator it4 = ((ArrayList) this.f54787j).iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            for (int i2 = 0; i2 < list2.size(); i2++) {
                list2.set(i2, Float.valueOf((float) this.f54793s));
            }
        }
        this.f54782e = C19409g.WAITING;
        this.f54800z = -1;
        mo25105f();
        Iterator<AnimatorSet> it5 = this.f54785h.iterator();
        while (it5.hasNext()) {
            it5.next().end();
        }
        Iterator<AnimatorSet> it6 = this.f54785h.iterator();
        while (it6.hasNext()) {
            it6.next().start();
        }
    }

    /* renamed from: e */
    public final void mo25104e() {
        int bundleCount = getBundleCount();
        for (int i = 0; i < bundleCount; i++) {
            this.f54783f.set(i, Integer.valueOf(this.f54793s));
        }
    }

    /* renamed from: f */
    public final void mo25105f() {
        int volumeItemCount = getVolumeItemCount();
        for (int i = 0; i < volumeItemCount; i++) {
            this.f54784g.set(i, Integer.valueOf(this.f54793s));
        }
    }

    /* renamed from: g */
    public final void mo25106g(float f, List<Float> list) {
        float[] fArr = C19410h.f54818a;
        for (int i = 0; i < 5; i++) {
            float[] fArr2 = C19410h.f54818a;
            int i2 = 2 - i;
            float pow = (float) (((double) f) * Math.pow((double) 0.8f, (double) Math.abs(i2)));
            if (2 == Math.abs(i2)) {
                postDelayed(new C19404b(this, list, i, pow), 320);
            } else if (1 == Math.abs(i2)) {
                postDelayed(new C19405c(this, list, i, pow), 160);
            } else if (Math.abs(i2) == 0) {
                list.set(i, Float.valueOf(pow));
            }
        }
    }

    /* renamed from: h */
    public void mo25107h(C19411i iVar) {
        this.f54781d = iVar;
        mo25104e();
        mo25105f();
        mo25100a();
        mo25101b();
        Log.m105925i("MicroMsg.NewTrans2Txt.SoundWaveView", "update style %s", this.f54781d);
        requestLayout();
        mo25103d();
    }

    /* renamed from: i */
    public void mo25108i(int i) {
        C19409g gVar = C19409g.JUDGING;
        C19409g gVar2 = C19409g.REACTING;
        float f = ((float) i) / 100.0f;
        int i2 = 0;
        Log.m105919d("MicroMsg.NewTrans2Txt.SoundWaveView", "iVolume %s, fVolume %s", Integer.valueOf(i), Float.valueOf(f));
        if (((double) f) > 0.05d) {
            if (gVar == this.f54782e) {
                Log.m105924i("MicroMsg.NewTrans2Txt.SoundWaveView", "cancel judging!!!");
                this.f54782e = gVar2;
                removeCallbacks(this.f54799y);
            }
            if (C19409g.WAITING == this.f54782e) {
                Log.m105924i("MicroMsg.NewTrans2Txt.SoundWaveView", "active reacting!!!");
                this.f54782e = gVar2;
                Iterator<AnimatorSet> it = this.f54785h.iterator();
                while (it.hasNext()) {
                    it.next().end();
                }
            }
        } else if (gVar2 == this.f54782e) {
            this.f54782e = gVar;
            postDelayed(this.f54799y, (long) 300);
        }
        C19409g gVar3 = this.f54782e;
        if (gVar2 == gVar3 || gVar == gVar3) {
            mo25104e();
            float interpolation = ((PathInterpolator) this.f54788n).getInterpolation(f);
            Log.m105919d("MicroMsg.NewTrans2Txt.SoundWaveView", "PathInterpolatorCompat value: %s.", Float.valueOf(interpolation));
            int i3 = (int) (interpolation * ((float) this.f54794t));
            int activeBundleIndex = getActiveBundleIndex();
            Log.m105919d("MicroMsg.NewTrans2Txt.SoundWaveView", "getActiveBundleIndex, activeBundleIndex: %s", Integer.valueOf(activeBundleIndex));
            this.f54783f.set(activeBundleIndex, Integer.valueOf(i3));
            int nextInt = new Random().nextInt(2);
            C19408f fVar = this.f54780A;
            int i4 = fVar.f54812a;
            if (i4 == activeBundleIndex) {
                ArrayList<Integer> arrayList = this.f54783f;
                int i5 = fVar.f54813b;
                float f2 = (float) i3;
                float[] fArr = C19410h.f54818a;
                arrayList.set(i5, Integer.valueOf((int) (fArr[nextInt] * f2)));
                C19408f fVar2 = this.f54780A;
                int i6 = fVar2.f54813b;
                if (i6 - 1 != fVar2.f54812a) {
                    this.f54783f.set(i6 - 1, Integer.valueOf((int) (f2 * fArr[1 - nextInt])));
                }
            } else if (fVar.f54813b == activeBundleIndex) {
                ArrayList<Integer> arrayList2 = this.f54783f;
                float f3 = (float) i3;
                float[] fArr2 = C19410h.f54818a;
                arrayList2.set(i4, Integer.valueOf((int) (fArr2[nextInt] * f3)));
                C19408f fVar3 = this.f54780A;
                int i7 = fVar3.f54812a + 1;
                if (i7 != fVar3.f54813b) {
                    this.f54783f.set(i7, Integer.valueOf((int) (f3 * fArr2[1 - nextInt])));
                }
            } else {
                ArrayList<Integer> arrayList3 = this.f54783f;
                float f4 = (float) i3;
                float[] fArr3 = C19410h.f54818a;
                arrayList3.set(i4, Integer.valueOf((int) (fArr3[nextInt] * f4)));
                this.f54783f.set(this.f54780A.f54813b, Integer.valueOf((int) (f4 * fArr3[nextInt])));
            }
            int bundleCount = getBundleCount();
            int nextInt2 = new Random().nextInt(2);
            if (bundleCount == 5) {
                int i8 = bundleCount / 2;
                while (i2 < bundleCount) {
                    if (mo25102c(i2)) {
                        this.f54783f.set(i2, Integer.valueOf((int) (((float) i3) * C19410h.f54819b[nextInt2])));
                        nextInt2 = 1 - nextInt2;
                    }
                    int i9 = i8 - i2;
                    if (2 == Math.abs(i9)) {
                        postDelayed(new C21041e(this, i2), 320);
                    } else if (1 == Math.abs(i9)) {
                        postDelayed(new C21042f(this, i2), 160);
                    } else if (Math.abs(i9) == 0) {
                        mo25106g((float) this.f54783f.get(i2).intValue(), (List) ((ArrayList) this.f54787j).get(i2));
                    }
                    i2++;
                }
            } else {
                while (i2 < bundleCount) {
                    if (mo25102c(i2)) {
                        this.f54783f.set(i2, Integer.valueOf((int) (((float) i3) * C19410h.f54819b[nextInt2])));
                        nextInt2 = 1 - nextInt2;
                    }
                    mo25106g((float) this.f54783f.get(i2).intValue(), (List) ((ArrayList) this.f54787j).get(i2));
                    i2++;
                }
            }
            invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C19409g gVar = C19409g.REACTING;
        C19409g gVar2 = this.f54782e;
        int i = 0;
        if (gVar == gVar2 || C19409g.JUDGING == gVar2) {
            int bundleCount = getBundleCount();
            for (int i2 = 0; i2 < bundleCount; i2++) {
                this.f54783f.get(i2).intValue();
                float[] fArr = C19410h.f54818a;
                for (int i3 = 0; i3 < 5; i3++) {
                    float floatValue = ((Float) ((List) ((ArrayList) this.f54787j).get(i2)).get(i3)).floatValue();
                    float floatValue2 = ((Float) ((List) ((ArrayList) this.f54786i).get(i2)).get(i3)).floatValue();
                    ((List) ((ArrayList) this.f54786i).get(i2)).set(i3, Float.valueOf(floatValue2 + ((floatValue - floatValue2) / 6.0f)));
                }
                int i4 = (this.f54796v * i2) + (this.f54791q * i2);
                for (int i5 = 0; i5 < 5; i5++) {
                    int i6 = (this.f54790p * i5) + (this.f54791q * i5) + i4;
                    float floatValue3 = ((Float) ((List) ((ArrayList) this.f54786i).get(i2)).get(i5)).floatValue();
                    float f = (float) this.f54793s;
                    if (floatValue3 < f) {
                        floatValue3 = f;
                    }
                    float f2 = (float) this.f54794t;
                    if (floatValue3 > f2) {
                        floatValue3 = f2;
                    }
                    float f3 = (((float) this.f54798x) - floatValue3) / 2.0f;
                    float f4 = (float) i6;
                    float f5 = (float) (this.f54790p + i6);
                    float f6 = (float) this.f54792r;
                    canvas.drawRoundRect(f4, f3, f5, f3 + floatValue3, f6, f6, this.f54789o);
                }
            }
        } else if (C19409g.WAITING == gVar2) {
            int volumeItemCount = getVolumeItemCount();
            while (i < volumeItemCount) {
                int i7 = i + 1;
                int i8 = (this.f54797w - (this.f54790p * i7)) - (this.f54791q * i);
                int intValue = (this.f54798x - this.f54784g.get(i).intValue()) / 2;
                int i9 = this.f54792r;
                canvas.drawRoundRect((float) i8, (float) intValue, (float) (this.f54790p + i8), (float) (this.f54784g.get(i).intValue() + intValue), (float) i9, (float) i9, this.f54789o);
                i = i7;
            }
        }
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (C19411i.MINI == this.f54781d) {
            this.f54797w = C74942w4.m89784a(getContext(), C19410h.f54822e);
        } else {
            this.f54797w = C74942w4.m89784a(getContext(), C19410h.f54821d);
        }
        Log.m105919d("MicroMsg.NewTrans2Txt.SoundWaveView", "style: %s, w: %s, h: %s.", this.f54781d, Integer.valueOf(this.f54797w), Integer.valueOf(this.f54798x));
        setMeasuredDimension(this.f54797w, this.f54798x);
    }

    public void setStyle(C19411i iVar) {
        this.f54781d = iVar;
        Log.m105925i("MicroMsg.NewTrans2Txt.SoundWaveView", "set style %s", iVar);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            mo25103d();
        }
    }

    public SoundWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19411i iVar = C19411i.NORMAL;
        this.f54781d = iVar;
        this.f54782e = C19409g.WAITING;
        this.f54786i = new ArrayList();
        this.f54787j = new ArrayList();
        this.f54799y = new C19403a();
        this.f54800z = -1;
        this.f54780A = new C19408f(this, (C19403a) null);
        int i2 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20882a.f59012a, 0, 0);
            int i3 = obtainStyledAttributes.getInt(0, 0);
            if (i3 == 0) {
                this.f54781d = iVar;
            } else {
                C19411i iVar2 = C19411i.MINI;
                if (i3 == 1) {
                    this.f54781d = iVar2;
                } else {
                    Log.m105921e("MicroMsg.NewTrans2Txt.SoundWaveView", "style err! %s", Integer.valueOf(i3));
                }
            }
            obtainStyledAttributes.recycle();
            Log.m105925i("MicroMsg.NewTrans2Txt.SoundWaveView", "init style %s", this.f54781d);
        }
        Context context2 = getContext();
        float[] fArr = C19410h.f54818a;
        this.f54790p = C74942w4.m89784a(context2, 2);
        this.f54791q = C74942w4.m89784a(getContext(), 1);
        this.f54792r = C74942w4.m89784a(getContext(), 1);
        this.f54793s = C74942w4.m89784a(getContext(), 4);
        this.f54794t = C74942w4.m89784a(getContext(), 34);
        this.f54795u = C74942w4.m89784a(getContext(), 10);
        this.f54796v = C74942w4.m89784a(getContext(), C19410h.f54820c);
        this.f54797w = C74942w4.m89784a(getContext(), C19410h.f54821d);
        this.f54798x = C74942w4.m89784a(getContext(), 34);
        this.f54783f = new ArrayList<>();
        int i4 = 0;
        while (true) {
            float[] fArr2 = C19410h.f54818a;
            if (i4 >= 5) {
                break;
            }
            this.f54783f.add(Integer.valueOf(this.f54793s));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (true) {
                float[] fArr3 = C19410h.f54818a;
                if (i5 >= 5) {
                    break;
                }
                arrayList.add(Float.valueOf((float) this.f54793s));
                arrayList2.add(Float.valueOf((float) this.f54793s));
                i5++;
            }
            this.f54786i.add(arrayList);
            this.f54787j.add(arrayList2);
            i4++;
        }
        this.f54784g = new ArrayList<>();
        while (true) {
            float[] fArr4 = C19410h.f54818a;
            if (i2 < 25) {
                this.f54784g.add(Integer.valueOf(this.f54793s));
                i2++;
            } else {
                mo25104e();
                mo25105f();
                this.f54785h = new ArrayList<>(25);
                this.f54788n = new PathInterpolator(0.0f, 0.5f, 0.2f, 1.0f);
                mo25100a();
                mo25101b();
                Paint paint = new Paint(1);
                this.f54789o = paint;
                paint.setColor(Color.parseColor("#000000"));
                this.f54789o.setAlpha(128);
                return;
            }
        }
    }
}
