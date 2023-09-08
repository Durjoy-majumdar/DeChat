package androidx.window.layout;

import gy3.C8480h;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo182094d2 = {"Landroidx/window/layout/FoldingFeature;", "Landroidx/window/layout/DisplayFeature;", "isSeparating", "", "()Z", "occlusionType", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$OcclusionType;", "orientation", "Landroidx/window/layout/FoldingFeature$Orientation;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$Orientation;", "state", "Landroidx/window/layout/FoldingFeature$State;", "getState", "()Landroidx/window/layout/FoldingFeature$State;", "OcclusionType", "Orientation", "State", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public interface FoldingFeature extends DisplayFeature {

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo182094d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType;", "", "description", "", "(Ljava/lang/String;)V", "toString", "Companion", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
    public static final class OcclusionType {
        public static final Companion Companion = new Companion((C8480h) null);
        public static final OcclusionType FULL = new OcclusionType("FULL");
        public static final OcclusionType NONE = new OcclusionType("NONE");
        private final String description;

        @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo182094d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;", "", "()V", "FULL", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "NONE", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        private OcclusionType(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo182094d2 = {"Landroidx/window/layout/FoldingFeature$Orientation;", "", "description", "", "(Ljava/lang/String;)V", "toString", "Companion", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
    public static final class Orientation {
        public static final Companion Companion = new Companion((C8480h) null);
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");
        public static final Orientation VERTICAL = new Orientation("VERTICAL");
        private final String description;

        @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo182094d2 = {"Landroidx/window/layout/FoldingFeature$Orientation$Companion;", "", "()V", "HORIZONTAL", "Landroidx/window/layout/FoldingFeature$Orientation;", "VERTICAL", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        private Orientation(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo182094d2 = {"Landroidx/window/layout/FoldingFeature$State;", "", "description", "", "(Ljava/lang/String;)V", "toString", "Companion", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
    public static final class State {
        public static final Companion Companion = new Companion((C8480h) null);
        public static final State FLAT = new State("FLAT");
        public static final State HALF_OPENED = new State("HALF_OPENED");
        private final String description;

        @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo182094d2 = {"Landroidx/window/layout/FoldingFeature$State$Companion;", "", "()V", "FLAT", "Landroidx/window/layout/FoldingFeature$State;", "HALF_OPENED", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        private State(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    OcclusionType getOcclusionType();

    Orientation getOrientation();

    State getState();

    boolean isSeparating();
}
