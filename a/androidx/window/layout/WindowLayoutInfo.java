package androidx.window.layout;

import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0017\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, mo182094d2 = {"Landroidx/window/layout/WindowLayoutInfo;", "", "displayFeatures", "", "Landroidx/window/layout/DisplayFeature;", "(Ljava/util/List;)V", "getDisplayFeatures", "()Ljava/util/List;", "equals", "", "other", "hashCode", "", "toString", "", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    public WindowLayoutInfo(List<? extends DisplayFeature> list) {
        C87412m.m108594g(list, "displayFeatures");
        this.displayFeatures = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C87412m.m108589b(WindowLayoutInfo.class, obj.getClass())) {
            return false;
        }
        return C87412m.m108589b(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return C110818d0.m150921S(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
    }
}
