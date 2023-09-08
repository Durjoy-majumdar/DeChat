package com.tencent.mapsdk.internal;

import android.graphics.Color;
import android.graphics.Rect;
import com.tencent.mapsdk.internal.C113521ap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.oy */
public abstract class C114027oy<D extends C113521ap> extends C113527av<D> implements C113704ep {

    /* renamed from: a */
    private static final AtomicInteger f341060a = new AtomicInteger(1);

    /* renamed from: b_ */
    public final String f341061b_ = String.valueOf(f341060a.incrementAndGet());

    /* renamed from: c_ */
    public IndoorInfo f341062c_;

    /* renamed from: d */
    public float f341063d = 1.0f;

    /* renamed from: e */
    public int f341064e = Color.argb(17, 0, 163, 255);

    /* renamed from: f */
    public int f341065f = Color.argb(255, 0, 163, 255);

    /* renamed from: g */
    public float f341066g = 0.0f;

    /* renamed from: h */
    public boolean f341067h = true;

    /* renamed from: i */
    public boolean f341068i = false;

    /* renamed from: j */
    public int f341069j = 2;

    /* renamed from: k */
    public int f341070k = -1;

    /* renamed from: l */
    public final C113532ba f341071l;

    /* renamed from: m */
    public volatile boolean f341072m;

    /* renamed from: n */
    private boolean f341073n = false;

    /* renamed from: o */
    private boolean f341074o;

    /* renamed from: p */
    private Object f341075p;

    /* renamed from: q */
    private boolean f341076q;

    /* renamed from: r */
    private Selectable.OnSelectedListener f341077r;

    /* renamed from: s */
    private float f341078s;

    /* renamed from: t */
    private boolean f341079t;

    /* renamed from: u */
    private boolean f341080u;

    public C114027oy(C113532ba baVar) {
        this.f341071l = baVar;
    }

    /* renamed from: d */
    private C113532ba mo172012d() {
        return this.f341071l;
    }

    /* renamed from: e */
    private void mo172013e() {
        this.f341072m = true;
    }

    /* renamed from: f */
    private Selectable.OnSelectedListener mo172014f() {
        return this.f341077r;
    }

    /* renamed from: g */
    private String mo172015g() {
        return this.f341061b_;
    }

    /* renamed from: h */
    private static void mo171381h() {
    }

    /* renamed from: a */
    public int mo172002a() {
        return this.f341070k;
    }

    /* renamed from: b */
    public Rect getBound(C113707es esVar) {
        return new Rect();
    }

    public int getFillColor() {
        return this.f341064e;
    }

    public List<Boundable<C113707es>> getGroupBounds() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this);
        return arrayList;
    }

    public String getId() {
        return this.f341061b_;
    }

    public int getLevel() {
        return this.f341069j;
    }

    public float getRotation() {
        return this.f341078s;
    }

    public int getStrokeColor() {
        return this.f341065f;
    }

    public float getStrokeWidth() {
        return this.f341063d;
    }

    public Object getTag() {
        return this.f341075p;
    }

    public int getZIndex() {
        return (int) this.f341066g;
    }

    /* renamed from: h_ */
    public void mo172595h_() {
    }

    public boolean handleOnTap() {
        return false;
    }

    public boolean isClickable() {
        return this.f341074o;
    }

    public boolean isDraggable() {
        return this.f341079t;
    }

    public boolean isRemoved() {
        return this.f341080u;
    }

    public boolean isSelected() {
        return this.f341076q;
    }

    public boolean isVisible() {
        return this.f341062c_ != null ? this.f341067h && this.f341073n : this.f341067h;
    }

    /* renamed from: j */
    public void mo172003j() {
    }

    /* renamed from: j_ */
    public void mo172596j_() {
    }

    /* renamed from: k */
    public boolean mo172004k() {
        return false;
    }

    /* renamed from: l */
    public final void mo172005l() {
    }

    /* renamed from: m */
    public final IndoorInfo mo172019m() {
        return this.f341062c_;
    }

    /* renamed from: n */
    public final boolean mo172020n() {
        return this.f341073n;
    }

    /* renamed from: o */
    public void mo172021o() {
        if (this.f341062c_ != null) {
            this.f341073n = false;
            mo172606q();
        }
        mo172003j();
    }

    /* renamed from: p */
    public final boolean mo172605p() {
        return this.f341068i;
    }

    /* renamed from: q */
    public void mo172606q() {
        if (!this.f341072m) {
            this.f341068i = true;
        }
    }

    /* renamed from: r */
    public final void mo172607r() {
        this.f341072m = false;
        mo172606q();
    }

    public void releaseData() {
    }

    public final void remove() {
        this.f341077r = null;
        this.f341071l.mo171594d(getId());
        mo172595h_();
        this.f341080u = true;
    }

    /* renamed from: s */
    public void mo172608s() {
    }

    public void setClickable(boolean z) {
        this.f341074o = z;
    }

    public void setDraggable(boolean z) {
        this.f341079t = z;
    }

    public void setFillColor(int i) {
        this.f341064e = i;
        mo172606q();
    }

    public void setLevel(int i) {
        this.f341069j = i;
        mo172606q();
    }

    public void setRotation(float f) {
        this.f341078s = f;
    }

    public void setSelected(boolean z) {
        this.f341076q = z;
    }

    public void setSelectedListener(Selectable.OnSelectedListener onSelectedListener) {
        this.f341077r = onSelectedListener;
    }

    public void setStrokeColor(int i) {
        this.f341065f = i;
        mo172606q();
    }

    public void setStrokeWidth(float f) {
        this.f341063d = f;
        mo172606q();
    }

    public void setTag(Object obj) {
        this.f341075p = obj;
    }

    public void setVisible(boolean z) {
        this.f341067h = z;
        mo172606q();
    }

    public void setZIndex(int i) {
        setZIndex((float) i);
    }

    /* renamed from: a */
    private void mo172716a(int i) {
        this.f341070k = i;
    }

    public void setZIndex(float f) {
        this.f341066g = f;
        mo172606q();
    }

    /* renamed from: a */
    public final void mo172018a(IndoorInfo indoorInfo) {
        this.f341062c_ = indoorInfo;
    }

    /* renamed from: a */
    public void mo172017a(IndoorBuilding indoorBuilding) {
        IndoorInfo indoorInfo = this.f341062c_;
        if (indoorInfo != null) {
            this.f341073n = indoorInfo.toString().equals(indoorBuilding.toString());
            mo172606q();
        }
        mo172003j();
    }

    /* renamed from: a */
    public final void mo171427a(GL10 gl10) {
        C113532ba baVar;
        boolean z = this.f341068i;
        mo172596j_();
        if (z && (baVar = this.f341071l) != null) {
            baVar.mo171542F();
        }
        this.f341068i = false;
        mo172608s();
    }
}
