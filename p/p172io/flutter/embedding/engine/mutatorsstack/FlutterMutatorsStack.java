package p172io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack */
public class FlutterMutatorsStack {
    private List<Path> finalClippingPaths = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private float finalOpacity = 1.0f;
    private List<FlutterMutator> mutators = new ArrayList();

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$FlutterMutatorType */
    public enum FlutterMutatorType {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List<FlutterMutator> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i, int i2, int i3, int i4, float[] fArr) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new FlutterMutator(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new FlutterMutator(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f) {
        this.mutators.add(new FlutterMutator(f));
        this.finalOpacity *= f;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        FlutterMutator flutterMutator = new FlutterMutator(matrix);
        this.mutators.add(flutterMutator);
        this.finalMatrix.preConcat(flutterMutator.getMatrix());
    }

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$FlutterMutator */
    public class FlutterMutator {
        private Matrix matrix;
        private float opacity;
        private Path path;
        private float[] radiis;
        private Rect rect;
        private FlutterMutatorType type;

        public FlutterMutator(Rect rect2) {
            this.type = FlutterMutatorType.CLIP_RECT;
            this.rect = rect2;
        }

        public Matrix getMatrix() {
            return this.matrix;
        }

        public float getOpacity() {
            return this.opacity;
        }

        public Path getPath() {
            return this.path;
        }

        public Rect getRect() {
            return this.rect;
        }

        public FlutterMutatorType getType() {
            return this.type;
        }

        public FlutterMutator(Rect rect2, float[] fArr) {
            this.type = FlutterMutatorType.CLIP_RRECT;
            this.rect = rect2;
            this.radiis = fArr;
        }

        public FlutterMutator(Path path2) {
            this.type = FlutterMutatorType.CLIP_PATH;
            this.path = path2;
        }

        public FlutterMutator(Matrix matrix2) {
            this.type = FlutterMutatorType.TRANSFORM;
            this.matrix = matrix2;
        }

        public FlutterMutator(float f) {
            this.type = FlutterMutatorType.OPACITY;
            this.opacity = f;
        }
    }
}
