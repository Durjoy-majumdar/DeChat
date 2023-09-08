package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C103438a;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103454h;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.view.menu.C103458j;
import androidx.appcompat.view.menu.C103463l;
import androidx.appcompat.widget.ActionMenuView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p1130l.C109066f;
import p1130l.C109068h;
import p849e3.C107170b;

public class ActionMenuPresenter extends C103438a implements C107170b.C107171a {

    /* renamed from: A */
    public C103475e f305378A;

    /* renamed from: B */
    public C103470a f305379B;

    /* renamed from: C */
    public C103472c f305380C;

    /* renamed from: D */
    public C103471b f305381D;

    /* renamed from: E */
    public final C103476f f305382E = new C103476f();

    /* renamed from: F */
    public int f305383F;

    /* renamed from: p */
    public C103473d f305384p;

    /* renamed from: q */
    public Drawable f305385q;

    /* renamed from: r */
    public boolean f305386r;

    /* renamed from: s */
    public boolean f305387s;

    /* renamed from: t */
    public boolean f305388t;

    /* renamed from: u */
    public int f305389u;

    /* renamed from: v */
    public int f305390v;

    /* renamed from: w */
    public int f305391w;

    /* renamed from: x */
    public boolean f305392x;

    /* renamed from: y */
    public final SparseBooleanArray f305393y = new SparseBooleanArray();

    /* renamed from: z */
    public View f305394z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103469a();

        /* renamed from: d */
        public int f305395d;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        public static class C103469a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f305395d);
        }

        public SavedState(Parcel parcel) {
            this.f305395d = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C103470a extends C103454h {
        public C103470a(Context context, C103463l lVar, View view) {
            super(context, lVar, view, false, C0966R.attr.f2649aq);
            if (!((lVar.f305324G.f305261D & 32) == 32)) {
                View view2 = ActionMenuPresenter.this.f305384p;
                this.f305293f = view2 == null ? (View) ActionMenuPresenter.this.f305178n : view2;
            }
            C103476f fVar = ActionMenuPresenter.this.f305382E;
            this.f305296i = fVar;
            C109066f fVar2 = this.f305297j;
            if (fVar2 != null) {
                fVar2.mo143536i(fVar);
            }
        }

        /* renamed from: c */
        public void mo143698c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f305379B = null;
            actionMenuPresenter.f305383F = 0;
            super.mo143698c();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    public class C103471b extends ActionMenuItemView.C103437b {
        public C103471b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class C103472c implements Runnable {

        /* renamed from: d */
        public C103475e f305398d;

        public C103472c(C103475e eVar) {
            this.f305398d = eVar;
        }

        public void run() {
            C103448e.C103449a aVar;
            C103448e eVar = ActionMenuPresenter.this.f305173f;
            if (!(eVar == null || (aVar = eVar.f305239h) == null)) {
                aVar.mo143385c(eVar);
            }
            View view = (View) ActionMenuPresenter.this.f305178n;
            if (!(view == null || view.getWindowToken() == null)) {
                C103475e eVar2 = this.f305398d;
                boolean z = true;
                if (!eVar2.mo143697b()) {
                    if (eVar2.f305293f == null) {
                        z = false;
                    } else {
                        eVar2.mo143699d(0, 0, false, false);
                    }
                }
                if (z) {
                    ActionMenuPresenter.this.f305378A = this.f305398d;
                }
            }
            ActionMenuPresenter.this.f305380C = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C103473d extends AppCompatImageView implements ActionMenuView.C103477a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        public class C103474a extends C103560s {
            public C103474a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            /* renamed from: b */
            public C109068h mo143517b() {
                C103475e eVar = ActionMenuPresenter.this.f305378A;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo143696a();
            }

            /* renamed from: c */
            public boolean mo143518c() {
                ActionMenuPresenter.this.mo143809o();
                return true;
            }

            /* renamed from: d */
            public boolean mo143817d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f305380C != null) {
                    return false;
                }
                actionMenuPresenter.mo143806l();
                return true;
            }
        }

        public C103473d(Context context) {
            super(context, (AttributeSet) null, C0966R.attr.f2648ap);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C103542j0.m137612a(this, getContentDescription());
            setOnTouchListener(new C103474a(this, ActionMenuPresenter.this));
        }

        /* renamed from: c */
        public boolean mo143500c() {
            return false;
        }

        /* renamed from: k */
        public boolean mo143504k() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo143809o();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C103475e extends C103454h {
        public C103475e(Context context, C103448e eVar, View view, boolean z) {
            super(context, eVar, view, z, C0966R.attr.f2649aq);
            this.f305294g = 8388613;
            C103476f fVar = ActionMenuPresenter.this.f305382E;
            this.f305296i = fVar;
            C109066f fVar2 = this.f305297j;
            if (fVar2 != null) {
                fVar2.mo143536i(fVar);
            }
        }

        /* renamed from: c */
        public void mo143698c() {
            C103448e eVar = ActionMenuPresenter.this.f305173f;
            if (eVar != null) {
                eVar.mo143591c(true);
            }
            ActionMenuPresenter.this.f305378A = null;
            super.mo143698c();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    public class C103476f implements C103456i.C103457a {
        public C103476f() {
        }

        /* renamed from: a */
        public void mo143414a(C103448e eVar, boolean z) {
            if (eVar instanceof C103463l) {
                eVar.mo143606k().mo143591c(false);
            }
            C103456i.C103457a aVar = ActionMenuPresenter.this.f305175h;
            if (aVar != null) {
                aVar.mo143414a(eVar, z);
            }
        }

        /* renamed from: d */
        public boolean mo143415d(C103448e eVar) {
            if (eVar == null) {
                return false;
            }
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f305383F = ((C103463l) eVar).f305324G.f305267d;
            C103456i.C103457a aVar = actionMenuPresenter.f305175h;
            if (aVar != null) {
                return aVar.mo143415d(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0966R.C0971layout.f6272aa, C0966R.C0971layout.f6271a_);
    }

    /* renamed from: a */
    public void mo143537a(C103448e eVar, boolean z) {
        mo143806l();
        C103470a aVar = this.f305379B;
        if (aVar != null && aVar.mo143697b()) {
            aVar.f305297j.dismiss();
        }
        C103456i.C103457a aVar2 = this.f305175h;
        if (aVar2 != null) {
            aVar2.mo143414a(eVar, z);
        }
    }

    /* renamed from: b */
    public Parcelable mo143538b() {
        SavedState savedState = new SavedState();
        savedState.f305395d = this.f305383F;
        return savedState;
    }

    /* renamed from: c */
    public void mo143539c(boolean z) {
        C103458j jVar;
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f305178n;
        boolean z3 = false;
        ArrayList<C103452g> arrayList = null;
        if (viewGroup != null) {
            C103448e eVar = this.f305173f;
            if (eVar != null) {
                eVar.mo143603i();
                ArrayList<C103452g> l = this.f305173f.mo143607l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C103452g gVar = l.get(i2);
                    if ((gVar.f305261D & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C103452g itemData = childAt instanceof C103458j.C103459a ? ((C103458j.C103459a) childAt).getItemData() : null;
                        View k = mo143805k(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            k.setPressed(false);
                            k.jumpDrawablesToCurrentState();
                        }
                        if (k != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) k.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(k);
                            }
                            ((ViewGroup) this.f305178n).addView(k, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f305384p) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f305178n).requestLayout();
        C103448e eVar2 = this.f305173f;
        if (eVar2 != null) {
            eVar2.mo143603i();
            ArrayList<C103452g> arrayList2 = eVar2.f305243o;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C107170b bVar = arrayList2.get(i3).f305264G;
                if (bVar != null) {
                    bVar.f320759b = this;
                }
            }
        }
        C103448e eVar3 = this.f305173f;
        if (eVar3 != null) {
            eVar3.mo143603i();
            arrayList = eVar3.f305244p;
        }
        if (this.f305387s && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).f305266I;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f305384p == null) {
                this.f305384p = new C103473d(this.f305171d);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f305384p.getParent();
            if (viewGroup3 != this.f305178n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f305384p);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f305178n;
                C103473d dVar = this.f305384p;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParams = new ActionMenuView.LayoutParams(-2, -2);
                layoutParams.f305506b = 16;
                layoutParams.f305416c = true;
                actionMenuView.addView(dVar, layoutParams);
            }
        } else {
            C103473d dVar2 = this.f305384p;
            if (dVar2 != null && dVar2.getParent() == (jVar = this.f305178n)) {
                ((ViewGroup) jVar).removeView(this.f305384p);
            }
        }
        ((ActionMenuView) this.f305178n).setOverflowReserved(this.f305387s);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo143540d(androidx.appcompat.view.menu.C103463l r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            androidx.appcompat.view.menu.e r2 = r0.f305323F
            androidx.appcompat.view.menu.e r3 = r8.f305173f
            if (r2 == r3) goto L_0x0013
            r0 = r2
            androidx.appcompat.view.menu.l r0 = (androidx.appcompat.view.menu.C103463l) r0
            goto L_0x0009
        L_0x0013:
            androidx.appcompat.view.menu.g r0 = r0.f305324G
            androidx.appcompat.view.menu.j r2 = r8.f305178n
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L_0x001d
            goto L_0x003a
        L_0x001d:
            int r4 = r2.getChildCount()
            r5 = 0
        L_0x0022:
            if (r5 >= r4) goto L_0x003a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.C103458j.C103459a
            if (r7 == 0) goto L_0x0037
            r7 = r6
            androidx.appcompat.view.menu.j$a r7 = (androidx.appcompat.view.menu.C103458j.C103459a) r7
            androidx.appcompat.view.menu.g r7 = r7.getItemData()
            if (r7 != r0) goto L_0x0037
            r3 = r6
            goto L_0x003a
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x003a:
            if (r3 != 0) goto L_0x003d
            return r1
        L_0x003d:
            androidx.appcompat.view.menu.g r0 = r9.f305324G
            int r0 = r0.f305267d
            r8.f305383F = r0
            int r0 = r9.size()
            r2 = 0
        L_0x0048:
            r4 = 1
            if (r2 >= r0) goto L_0x0060
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x005d
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x005d
            r0 = 1
            goto L_0x0061
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0060:
            r0 = 0
        L_0x0061:
            androidx.appcompat.widget.ActionMenuPresenter$a r2 = new androidx.appcompat.widget.ActionMenuPresenter$a
            android.content.Context r5 = r8.f305172e
            r2.<init>(r5, r9, r3)
            r8.f305379B = r2
            r2.f305295h = r0
            l.f r2 = r2.f305297j
            if (r2 == 0) goto L_0x0073
            r2.mo143548n(r0)
        L_0x0073:
            androidx.appcompat.widget.ActionMenuPresenter$a r0 = r8.f305379B
            boolean r2 = r0.mo143697b()
            if (r2 == 0) goto L_0x007d
        L_0x007b:
            r1 = 1
            goto L_0x0086
        L_0x007d:
            android.view.View r2 = r0.f305293f
            if (r2 != 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            r0.mo143699d(r1, r1, r1, r1)
            goto L_0x007b
        L_0x0086:
            if (r1 == 0) goto L_0x0090
            androidx.appcompat.view.menu.i$a r0 = r8.f305175h
            if (r0 == 0) goto L_0x008f
            r0.mo143415d(r9)
        L_0x008f:
            return r4
        L_0x0090:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.mo143540d(androidx.appcompat.view.menu.l):boolean");
    }

    /* renamed from: f */
    public boolean mo143542f() {
        int i;
        ArrayList<C103452g> arrayList;
        int i2;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        C103448e eVar = actionMenuPresenter.f305173f;
        if (eVar != null) {
            arrayList = eVar.mo143607l();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = actionMenuPresenter.f305391w;
        int i4 = actionMenuPresenter.f305390v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f305178n;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C103452g gVar = arrayList.get(i5);
            int i8 = gVar.f305262E;
            if ((i8 & 2) == 2) {
                i6++;
            } else {
                if ((i8 & 1) == 1) {
                    i7++;
                } else {
                    z2 = true;
                }
            }
            if (actionMenuPresenter.f305392x && gVar.f305266I) {
                i3 = 0;
            }
            i5++;
        }
        if (actionMenuPresenter.f305387s && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f305393y;
        sparseBooleanArray.clear();
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            C103452g gVar2 = arrayList.get(i15);
            int i17 = gVar2.f305262E;
            if ((i17 & 2) == i2) {
                View k = actionMenuPresenter.mo143805k(gVar2, actionMenuPresenter.f305394z, viewGroup);
                if (actionMenuPresenter.f305394z == null) {
                    actionMenuPresenter.f305394z = k;
                }
                k.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = k.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                int i18 = gVar2.f305268e;
                if (i18 != 0) {
                    sparseBooleanArray.put(i18, z);
                }
                gVar2.mo143642g(z);
            } else {
                if ((i17 & true) == z) {
                    int i19 = gVar2.f305268e;
                    boolean z3 = sparseBooleanArray.get(i19);
                    boolean z4 = (i9 > 0 || z3) && i4 > 0;
                    if (z4) {
                        View k2 = actionMenuPresenter.mo143805k(gVar2, actionMenuPresenter.f305394z, viewGroup);
                        if (actionMenuPresenter.f305394z == null) {
                            actionMenuPresenter.f305394z = k2;
                        }
                        k2.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = k2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i16 == 0) {
                            i16 = measuredWidth2;
                        }
                        z4 &= i4 + i16 > 0;
                    }
                    if (z4 && i19 != 0) {
                        sparseBooleanArray.put(i19, true);
                    } else if (z3) {
                        sparseBooleanArray.put(i19, false);
                        int i25 = 0;
                        while (i25 < i15) {
                            C103452g gVar3 = arrayList.get(i25);
                            if (gVar3.f305268e == i19) {
                                if ((gVar3.f305261D & 32) == 32) {
                                    i9++;
                                }
                                gVar3.mo143642g(false);
                            }
                            i25++;
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    gVar2.mo143642g(z4);
                } else {
                    gVar2.mo143642g(false);
                    i15++;
                    i2 = 2;
                    actionMenuPresenter = this;
                    z = true;
                }
            }
            i15++;
            i2 = 2;
            actionMenuPresenter = this;
            z = true;
        }
        return true;
    }

    /* renamed from: h */
    public void mo143564h(Context context, C103448e eVar) {
        this.f305172e = context;
        LayoutInflater.from(context);
        this.f305173f = eVar;
        Resources resources = context.getResources();
        if (!this.f305388t) {
            this.f305387s = true;
        }
        int i = 2;
        this.f305389u = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f305391w = i;
        int i4 = this.f305389u;
        if (this.f305387s) {
            if (this.f305384p == null) {
                C103473d dVar = new C103473d(this.f305171d);
                this.f305384p = dVar;
                if (this.f305386r) {
                    dVar.setImageDrawable(this.f305385q);
                    this.f305385q = null;
                    this.f305386r = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f305384p.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f305384p.getMeasuredWidth();
        } else {
            this.f305384p = null;
        }
        this.f305390v = i4;
        float f = resources.getDisplayMetrics().density;
        this.f305394z = null;
    }

    /* renamed from: j */
    public void mo143545j(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f305395d) > 0 && (findItem = this.f305173f.findItem(i)) != null) {
            mo143540d((C103463l) findItem.getSubMenu());
        }
    }

    /* renamed from: k */
    public View mo143805k(C103452g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.mo143639e()) {
            C103458j.C103459a aVar = view instanceof C103458j.C103459a ? (C103458j.C103459a) view : (C103458j.C103459a) this.f305174g.inflate(this.f305177j, viewGroup, false);
            aVar.mo143501d(gVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f305178n);
            if (this.f305381D == null) {
                this.f305381D = new C103471b();
            }
            actionMenuItemView.setPopupCallback(this.f305381D);
            actionView = (View) aVar;
        }
        int i = gVar.f305266I ? 8 : 0;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i));
        View view2 = actionView;
        C117292a.m165358d(view2, aVar2.mo10232b(), "androidx/appcompat/widget/ActionMenuPresenter", "getItemView", "(Landroidx/appcompat/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "androidx/appcompat/widget/ActionMenuPresenter", "getItemView", "(Landroidx/appcompat/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo143829j(layoutParams));
        }
        return actionView;
    }

    /* renamed from: l */
    public boolean mo143806l() {
        C103458j jVar;
        C103472c cVar = this.f305380C;
        if (cVar == null || (jVar = this.f305178n) == null) {
            C103475e eVar = this.f305378A;
            if (eVar == null) {
                return false;
            }
            if (eVar.mo143697b()) {
                eVar.f305297j.dismiss();
            }
            return true;
        }
        ((View) jVar).removeCallbacks(cVar);
        this.f305380C = null;
        return true;
    }

    /* renamed from: m */
    public boolean mo143807m() {
        C103475e eVar = this.f305378A;
        return eVar != null && eVar.mo143697b();
    }

    /* renamed from: n */
    public void mo143808n(boolean z) {
        if (z) {
            C103456i.C103457a aVar = this.f305175h;
            if (aVar != null) {
                aVar.mo143415d((C103448e) null);
                return;
            }
            return;
        }
        C103448e eVar = this.f305173f;
        if (eVar != null) {
            eVar.mo143591c(false);
        }
    }

    /* renamed from: o */
    public boolean mo143809o() {
        C103448e eVar;
        if (!this.f305387s || mo143807m() || (eVar = this.f305173f) == null || this.f305178n == null || this.f305380C != null) {
            return false;
        }
        eVar.mo143603i();
        if (eVar.f305244p.isEmpty()) {
            return false;
        }
        C103472c cVar = new C103472c(new C103475e(this.f305172e, this.f305173f, this.f305384p, true));
        this.f305380C = cVar;
        ((View) this.f305178n).post(cVar);
        C103456i.C103457a aVar = this.f305175h;
        if (aVar == null) {
            return true;
        }
        aVar.mo143415d((C103448e) null);
        return true;
    }
}
