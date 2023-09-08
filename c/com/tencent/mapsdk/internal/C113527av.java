package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.mapsdk.internal.C113521ap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.av */
public abstract class C113527av<D extends C113521ap> implements C113709et {
    /* renamed from: a */
    public Rect getScreenBound(C113707es esVar) {
        return mo171394f_().getScreenBound(esVar);
    }

    /* renamed from: b */
    public Rect getBound(C113707es esVar) {
        return mo171394f_().getBound(esVar);
    }

    /* renamed from: f_ */
    public abstract D mo171394f_();

    public List<Boundable<C113707es>> getGroupBounds() {
        return mo171394f_().getGroupBounds();
    }

    public String getId() {
        return mo171394f_().getId();
    }

    public int getLevel() {
        return mo171394f_().getLevel();
    }

    public int getZIndex() {
        return mo171394f_().getZIndex();
    }

    public boolean handleOnTap() {
        return mo171394f_().handleOnTap();
    }

    public boolean isRemoved() {
        return mo171394f_().isRemoved();
    }

    public boolean isSelected() {
        return mo171394f_().isSelected();
    }

    public boolean isVisible() {
        return mo171394f_().isVisible();
    }

    public boolean onTap(float f, float f2) {
        return mo171394f_().onTap(f, f2);
    }

    public void releaseData() {
        mo171394f_().releaseData();
    }

    public void remove() {
        mo171394f_().remove();
    }

    public void setLevel(int i) {
        mo171394f_().setLevel(i);
    }

    public void setSelected(boolean z) {
        mo171394f_().setSelected(z);
    }

    public <T> void setSelectedListener(Selectable.OnSelectedListener<T> onSelectedListener) {
        mo171394f_().setSelectedListener(onSelectedListener);
    }

    public void setVisible(boolean z) {
        mo171394f_().setVisible(z);
    }

    public void setZIndex(int i) {
        mo171394f_().setZIndex(i);
    }

    /* renamed from: a */
    public void mo171427a(GL10 gl10) {
        mo171394f_().mo171427a(gl10);
    }

    public void setZIndex(float f) {
        setZIndex((int) f);
    }
}
