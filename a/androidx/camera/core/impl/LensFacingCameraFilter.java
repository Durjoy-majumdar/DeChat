package androidx.camera.core.impl;

import androidx.camera.core.C16524b;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import java.util.ArrayList;
import java.util.List;
import p329d3.C20434g;

public class LensFacingCameraFilter implements CameraFilter {
    private int mLensFacing;

    public LensFacingCameraFilter(int i) {
        this.mLensFacing = i;
    }

    public List<CameraInfo> filter(List<CameraInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (CameraInfo next : list) {
            C20434g.m22018b(next instanceof CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            Integer lensFacing = ((CameraInfoInternal) next).getLensFacing();
            if (lensFacing != null && lensFacing.intValue() == this.mLensFacing) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public /* synthetic */ Identifier getIdentifier() {
        return C16524b.m15513a(this);
    }

    public int getLensFacing() {
        return this.mLensFacing;
    }
}
