package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_note_toolbar_album */
public class fav_note_toolbar_album extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 == 2) {
            Canvas canvas = objArr[0];
            Looper looper = objArr[1];
            Matrix instanceMatrix = C24542c.instanceMatrix(looper);
            float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
            Paint instancePaint = C24542c.instancePaint(looper);
            instancePaint.setFlags(385);
            instancePaint.setStyle(Paint.Style.FILL);
            Paint instancePaint2 = C24542c.instancePaint(looper);
            instancePaint2.setFlags(385);
            instancePaint2.setStyle(Paint.Style.STROKE);
            instancePaint.setColor(-16777216);
            instancePaint2.setStrokeWidth(1.0f);
            instancePaint2.setStrokeCap(Paint.Cap.BUTT);
            instancePaint2.setStrokeJoin(Paint.Join.MITER);
            instancePaint2.setStrokeMiter(4.0f);
            instancePaint2.setPathEffect((PathEffect) null);
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 10.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(56.4f, 32.72654f);
            instancePath.lineTo(56.4f, 5.1f);
            instancePath.lineTo(3.6f, 5.1f);
            instancePath.lineTo(3.6f, 31.776659f);
            instancePath.lineTo(18.597736f, 19.647776f);
            instancePath.cubicTo(19.985397f, 18.525555f, 22.213877f, 18.57998f, 23.551487f, 19.75525f);
            instancePath.lineTo(36.98077f, 31.55468f);
            instancePath.lineTo(43.82731f, 25.732492f);
            instancePath.cubicTo(45.21395f, 24.553312f, 47.42017f, 24.577269f, 48.766293f, 25.785252f);
            instancePath.lineTo(56.4f, 32.72654f);
            instancePath.close();
            instancePath.moveTo(56.399998f, 37.480827f);
            instancePath.lineTo(46.278553f, 28.373676f);
            instancePath.lineTo(39.71393f, 33.956127f);
            instancePath.lineTo(43.74732f, 37.5f);
            instancePath.lineTo(38.433502f, 37.5f);
            instancePath.lineTo(21.01817f, 22.32025f);
            instancePath.lineTo(3.6f, 36.40657f);
            instancePath.lineTo(3.6f, 45.9f);
            instancePath.lineTo(56.4f, 45.9f);
            instancePath.lineTo(56.4f, 37.480827f);
            instancePath.close();
            instancePath.moveTo(2.9754093f, 1.5f);
            instancePath.lineTo(57.02459f, 1.5f);
            instancePath.cubicTo(58.634083f, 1.5f, 60.0f, 2.943411f, 60.0f, 4.723949f);
            instancePath.lineTo(60.0f, 46.27605f);
            instancePath.cubicTo(60.0f, 48.063454f, 58.667866f, 49.5f, 57.02459f, 49.5f);
            instancePath.lineTo(2.9754093f, 49.5f);
            instancePath.cubicTo(1.3659167f, 49.5f, 0.0f, 48.056587f, 0.0f, 46.27605f);
            instancePath.lineTo(0.0f, 4.723949f);
            instancePath.cubicTo(0.0f, 2.9365447f, 1.3321362f, 1.5f, 2.9754093f, 1.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
