package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C64186f0;

@Metadata(mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0002J(\u0010\n\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0006J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0014\u001a\u00020\u0006¨\u0006\u0016"}, mo182094d2 = {"Landroidx/window/layout/SidecarAdapter;", "", "()V", "isEqualSidecarDeviceState", "", "first", "Landroidx/window/sidecar/SidecarDeviceState;", "second", "isEqualSidecarDisplayFeature", "Landroidx/window/sidecar/SidecarDisplayFeature;", "isEqualSidecarDisplayFeatures", "", "isEqualSidecarWindowLayoutInfo", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "translate", "Landroidx/window/layout/WindowLayoutInfo;", "extensionInfo", "state", "Landroidx/window/layout/DisplayFeature;", "sidecarDisplayFeatures", "deviceState", "Companion", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class SidecarAdapter {
    public static final Companion Companion = new Companion((C8480h) null);
    /* access modifiers changed from: private */
    public static final String TAG = "SidecarAdapter";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007J\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0007J!\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo182094d2 = {"Landroidx/window/layout/SidecarAdapter$Companion;", "", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "getSidecarDisplayFeatures", "displayFeatures", "Lrx3/b0;", "setSidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "getSidecarDevicePosture$window_release", "(Landroidx/window/sidecar/SidecarDeviceState;)I", "getSidecarDevicePosture", "getRawSidecarDevicePosture", "posture", "setSidecarDevicePosture", "feature", "deviceState", "Landroidx/window/layout/DisplayFeature;", "translate$window_release", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/DisplayFeature;", "translate", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final int getRawSidecarDevicePosture(SidecarDeviceState sidecarDeviceState) {
            C87412m.m108594g(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                if (invoke != null) {
                    return ((Integer) invoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final int getSidecarDevicePosture$window_release(SidecarDeviceState sidecarDeviceState) {
            C87412m.m108594g(sidecarDeviceState, "sidecarDeviceState");
            int rawSidecarDevicePosture = getRawSidecarDevicePosture(sidecarDeviceState);
            if (rawSidecarDevicePosture < 0 || rawSidecarDevicePosture > 4) {
                return 0;
            }
            return rawSidecarDevicePosture;
        }

        public final List<SidecarDisplayFeature> getSidecarDisplayFeatures(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            C87412m.m108594g(sidecarWindowLayoutInfo, "info");
            try {
                List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? C64186f0.f181907d : list;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return C64186f0.f181907d;
            }
        }

        public final void setSidecarDevicePosture(SidecarDeviceState sidecarDeviceState, int i) {
            C87412m.m108594g(sidecarDeviceState, "sidecarDeviceState");
            try {
                sidecarDeviceState.posture = i;
            } catch (NoSuchFieldError unused) {
                Class<SidecarDeviceState> cls = SidecarDeviceState.class;
                try {
                    cls.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i)});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }

        public final void setSidecarDisplayFeatures(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, List<SidecarDisplayFeature> list) {
            C87412m.m108594g(sidecarWindowLayoutInfo, "info");
            C87412m.m108594g(list, "displayFeatures");
            try {
                sidecarWindowLayoutInfo.displayFeatures = list;
            } catch (NoSuchFieldError unused) {
                try {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", new Class[]{List.class}).invoke(sidecarWindowLayoutInfo, new Object[]{list});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }

        public final DisplayFeature translate$window_release(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
            HardwareFoldingFeature.Type type;
            FoldingFeature.State state;
            C87412m.m108594g(sidecarDisplayFeature, "feature");
            C87412m.m108594g(sidecarDeviceState, "deviceState");
            Rect rect = sidecarDisplayFeature.getRect();
            C87412m.m108593f(rect, "feature.rect");
            if (rect.width() == 0 && rect.height() == 0) {
                return null;
            }
            if (sidecarDisplayFeature.getType() == 1 && rect.width() != 0 && rect.height() != 0) {
                return null;
            }
            if ((sidecarDisplayFeature.getType() == 2 || sidecarDisplayFeature.getType() == 1) && rect.left != 0 && rect.top != 0) {
                return null;
            }
            int type2 = sidecarDisplayFeature.getType();
            if (type2 == 1) {
                type = HardwareFoldingFeature.Type.Companion.getFOLD();
            } else if (type2 != 2) {
                return null;
            } else {
                type = HardwareFoldingFeature.Type.Companion.getHINGE();
            }
            int sidecarDevicePosture$window_release = getSidecarDevicePosture$window_release(sidecarDeviceState);
            if (!(sidecarDevicePosture$window_release == 0 || sidecarDevicePosture$window_release == 1)) {
                if (sidecarDevicePosture$window_release == 2) {
                    state = FoldingFeature.State.HALF_OPENED;
                } else if (sidecarDevicePosture$window_release == 3) {
                    state = FoldingFeature.State.FLAT;
                } else if (sidecarDevicePosture$window_release != 4) {
                    state = FoldingFeature.State.FLAT;
                }
                Rect rect2 = sidecarDisplayFeature.getRect();
                C87412m.m108593f(rect2, "feature.rect");
                return new HardwareFoldingFeature(new Bounds(rect2), type, state);
            }
            return null;
        }
    }

    private final boolean isEqualSidecarDisplayFeature(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C87412m.m108589b(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C87412m.m108589b(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean isEqualSidecarDisplayFeatures(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!isEqualSidecarDisplayFeature(list.get(i), list2.get(i))) {
                    return false;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return true;
    }

    public final boolean isEqualSidecarDeviceState(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (C87412m.m108589b(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        Companion companion = Companion;
        return companion.getSidecarDevicePosture$window_release(sidecarDeviceState) == companion.getSidecarDevicePosture$window_release(sidecarDeviceState2);
    }

    public final boolean isEqualSidecarWindowLayoutInfo(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C87412m.m108589b(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        Companion companion = Companion;
        return isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo2));
    }

    public final WindowLayoutInfo translate(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        C87412m.m108594g(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo(C64186f0.f181907d);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        Companion companion = Companion;
        companion.setSidecarDevicePosture(sidecarDeviceState2, companion.getSidecarDevicePosture$window_release(sidecarDeviceState));
        return new WindowLayoutInfo(translate(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final List<DisplayFeature> translate(List<SidecarDisplayFeature> list, SidecarDeviceState sidecarDeviceState) {
        C87412m.m108594g(list, "sidecarDisplayFeatures");
        C87412m.m108594g(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature translate$window_release : list) {
            DisplayFeature translate$window_release2 = Companion.translate$window_release(translate$window_release, sidecarDeviceState);
            if (translate$window_release2 != null) {
                arrayList.add(translate$window_release2);
            }
        }
        return arrayList;
    }
}
