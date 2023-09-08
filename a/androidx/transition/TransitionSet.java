package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import p1050v2.C111331h;
import p853i4.C108348j;
import p853i4.C108352n;
import p853i4.C108353o;
import p853i4.C108354p;

public class TransitionSet extends Transition {

    /* renamed from: K */
    public ArrayList<Transition> f306738K = new ArrayList<>();

    /* renamed from: L */
    public boolean f306739L = true;

    /* renamed from: M */
    public int f306740M;

    /* renamed from: N */
    public boolean f306741N = false;

    /* renamed from: P */
    public int f306742P = 0;

    /* renamed from: androidx.transition.TransitionSet$a */
    public class C103825a extends C67095c {

        /* renamed from: d */
        public final /* synthetic */ Transition f306743d;

        public C103825a(TransitionSet transitionSet, Transition transition) {
            this.f306743d = transition;
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            this.f306743d.mo145313G();
            transition.mo145310C(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    public static class C103826b extends C67095c {

        /* renamed from: d */
        public TransitionSet f306744d;

        public C103826b(TransitionSet transitionSet) {
            this.f306744d = transitionSet;
        }

        /* renamed from: a */
        public void mo91179a(Transition transition) {
            TransitionSet transitionSet = this.f306744d;
            if (!transitionSet.f306741N) {
                transitionSet.mo145322Q();
                this.f306744d.f306741N = true;
            }
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            TransitionSet transitionSet = this.f306744d;
            int i = transitionSet.f306740M - 1;
            transitionSet.f306740M = i;
            if (i == 0) {
                transitionSet.f306741N = false;
                transitionSet.mo145336q();
            }
            transition.mo145310C(this);
        }
    }

    public TransitionSet() {
    }

    /* renamed from: B */
    public void mo145309B(View view) {
        super.mo145309B(view);
        int size = this.f306738K.size();
        for (int i = 0; i < size; i++) {
            this.f306738K.get(i).mo145309B(view);
        }
    }

    /* renamed from: C */
    public Transition mo145310C(Transition.C103824e eVar) {
        super.mo145310C(eVar);
        return this;
    }

    /* renamed from: E */
    public Transition mo145311E(View view) {
        for (int i = 0; i < this.f306738K.size(); i++) {
            this.f306738K.get(i).mo145311E(view);
        }
        this.f306718i.remove(view);
        return this;
    }

    /* renamed from: F */
    public void mo145312F(View view) {
        super.mo145312F(view);
        int size = this.f306738K.size();
        for (int i = 0; i < size; i++) {
            this.f306738K.get(i).mo145312F(view);
        }
    }

    /* renamed from: G */
    public void mo145313G() {
        if (this.f306738K.isEmpty()) {
            mo145322Q();
            mo145336q();
            return;
        }
        C103826b bVar = new C103826b(this);
        Iterator<Transition> it = this.f306738K.iterator();
        while (it.hasNext()) {
            it.next().mo145324a(bVar);
        }
        this.f306740M = this.f306738K.size();
        if (!this.f306739L) {
            for (int i = 1; i < this.f306738K.size(); i++) {
                this.f306738K.get(i - 1).mo145324a(new C103825a(this, this.f306738K.get(i)));
            }
            Transition transition = this.f306738K.get(0);
            if (transition != null) {
                transition.mo145313G();
                return;
            }
            return;
        }
        Iterator<Transition> it4 = this.f306738K.iterator();
        while (it4.hasNext()) {
            it4.next().mo145313G();
        }
    }

    /* renamed from: H */
    public void mo145314H(boolean z) {
        this.f306730x = z;
        int size = this.f306738K.size();
        for (int i = 0; i < size; i++) {
            this.f306738K.get(i).mo145314H(z);
        }
    }

    /* renamed from: I */
    public /* bridge */ /* synthetic */ Transition mo145315I(long j) {
        mo145349V(j);
        return this;
    }

    /* renamed from: J */
    public void mo145316J(Transition.C103823d dVar) {
        this.f306711F = dVar;
        this.f306742P |= 8;
        int size = this.f306738K.size();
        for (int i = 0; i < size; i++) {
            this.f306738K.get(i).mo145316J(dVar);
        }
    }

    /* renamed from: K */
    public /* bridge */ /* synthetic */ Transition mo145317K(TimeInterpolator timeInterpolator) {
        mo145350W(timeInterpolator);
        return this;
    }

    /* renamed from: L */
    public void mo145318L(PathMotion pathMotion) {
        super.mo145318L(pathMotion);
        this.f306742P |= 4;
        for (int i = 0; i < this.f306738K.size(); i++) {
            this.f306738K.get(i).mo145318L(pathMotion);
        }
    }

    /* renamed from: N */
    public void mo145319N(C108352n nVar) {
        this.f306710E = nVar;
        this.f306742P |= 2;
        int size = this.f306738K.size();
        for (int i = 0; i < size; i++) {
            this.f306738K.get(i).mo145319N(nVar);
        }
    }

    /* renamed from: O */
    public Transition mo145320O(ViewGroup viewGroup) {
        int size = this.f306738K.size();
        for (int i = 0; i < size; i++) {
            this.f306738K.get(i).mo145320O(viewGroup);
        }
        return this;
    }

    /* renamed from: P */
    public Transition mo145321P(long j) {
        this.f306714e = j;
        return this;
    }

    /* renamed from: R */
    public String mo145323R(String str) {
        String R = super.mo145323R(str);
        for (int i = 0; i < this.f306738K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(R);
            sb.append("\n");
            sb.append(this.f306738K.get(i).mo145323R(str + "  "));
            R = sb.toString();
        }
        return R;
    }

    /* renamed from: S */
    public TransitionSet mo145346S(Transition.C103824e eVar) {
        super.mo145324a(eVar);
        TransitionSet transitionSet = this;
        return this;
    }

    /* renamed from: T */
    public TransitionSet mo145347T(int i) {
        for (int i2 = 0; i2 < this.f306738K.size(); i2++) {
            this.f306738K.get(i2).mo145325b(i);
        }
        super.mo145325b(i);
        TransitionSet transitionSet = this;
        return this;
    }

    /* renamed from: U */
    public TransitionSet mo145348U(Transition transition) {
        this.f306738K.add(transition);
        transition.f306726t = this;
        long j = this.f306715f;
        if (j >= 0) {
            transition.mo145315I(j);
        }
        if ((this.f306742P & 1) != 0) {
            transition.mo145317K(this.f306716g);
        }
        if ((this.f306742P & 2) != 0) {
            transition.mo145319N(this.f306710E);
        }
        if ((this.f306742P & 4) != 0) {
            transition.mo145318L(this.f306712G);
        }
        if ((this.f306742P & 8) != 0) {
            transition.mo145316J(this.f306711F);
        }
        return this;
    }

    /* renamed from: V */
    public TransitionSet mo145349V(long j) {
        this.f306715f = j;
        if (j >= 0) {
            int size = this.f306738K.size();
            for (int i = 0; i < size; i++) {
                this.f306738K.get(i).mo145315I(j);
            }
        }
        return this;
    }

    /* renamed from: W */
    public TransitionSet mo145350W(TimeInterpolator timeInterpolator) {
        this.f306742P |= 1;
        ArrayList<Transition> arrayList = this.f306738K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f306738K.get(i).mo145317K(timeInterpolator);
            }
        }
        this.f306716g = timeInterpolator;
        return this;
    }

    /* renamed from: X */
    public TransitionSet mo145351X(int i) {
        if (i == 0) {
            this.f306739L = true;
        } else if (i == 1) {
            this.f306739L = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Transition mo145324a(Transition.C103824e eVar) {
        mo145346S(eVar);
        return this;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Transition mo145325b(int i) {
        mo145347T(i);
        return this;
    }

    /* renamed from: c */
    public Transition mo145326c(View view) {
        for (int i = 0; i < this.f306738K.size(); i++) {
            this.f306738K.get(i).mo145326c(view);
        }
        this.f306718i.add(view);
        return this;
    }

    /* renamed from: d */
    public Transition mo145328d(Class cls) {
        for (int i = 0; i < this.f306738K.size(); i++) {
            this.f306738K.get(i).mo145328d(cls);
        }
        super.mo145328d(cls);
        return this;
    }

    /* renamed from: e */
    public Transition mo145329e(String str) {
        for (int i = 0; i < this.f306738K.size(); i++) {
            this.f306738K.get(i).mo145329e(str);
        }
        super.mo145329e(str);
        return this;
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        if (mo145344z(oVar.f324392b)) {
            Iterator<Transition> it = this.f306738K.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo145344z(oVar.f324392b)) {
                    next.mo145266g(oVar);
                    oVar.f324393c.add(next);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo145331j(C108353o oVar) {
        super.mo145331j(oVar);
        int size = this.f306738K.size();
        for (int i = 0; i < size; i++) {
            this.f306738K.get(i).mo145331j(oVar);
        }
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        if (mo145344z(oVar.f324392b)) {
            Iterator<Transition> it = this.f306738K.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo145344z(oVar.f324392b)) {
                    next.mo145267k(oVar);
                    oVar.f324393c.add(next);
                }
            }
        }
    }

    /* renamed from: n */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f306738K = new ArrayList<>();
        int size = this.f306738K.size();
        for (int i = 0; i < size; i++) {
            transitionSet.mo145348U(this.f306738K.get(i).clone());
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo145335p(ViewGroup viewGroup, C108354p pVar, C108354p pVar2, ArrayList<C108353o> arrayList, ArrayList<C108353o> arrayList2) {
        long j = this.f306714e;
        int size = this.f306738K.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f306738K.get(i);
            if (j > 0 && (this.f306739L || i == 0)) {
                long j2 = transition.f306714e;
                if (j2 > 0) {
                    transition.mo145321P(j2 + j);
                } else {
                    transition.mo145321P(j);
                }
            }
            transition.mo145335p(viewGroup, pVar, pVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: r */
    public Transition mo145337r(int i, boolean z) {
        for (int i2 = 0; i2 < this.f306738K.size(); i2++) {
            this.f306738K.get(i2).mo145337r(i, z);
        }
        super.mo145337r(i, z);
        return this;
    }

    /* renamed from: s */
    public Transition mo145338s(Class cls, boolean z) {
        for (int i = 0; i < this.f306738K.size(); i++) {
            this.f306738K.get(i).mo145338s(cls, z);
        }
        super.mo145338s(cls, z);
        return this;
    }

    /* renamed from: t */
    public Transition mo145339t(String str, boolean z) {
        for (int i = 0; i < this.f306738K.size(); i++) {
            this.f306738K.get(i).mo145339t(str, z);
        }
        super.mo145339t(str, z);
        return this;
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C108348j.f324382h);
        mo145351X(C111331h.m151817d(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
