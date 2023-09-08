package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chat_reject_icon */
public class chat_reject_icon extends C24542c {
    private final int height = 42;
    private final int width = 42;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 42;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                canvas.saveLayerAlpha((RectF) null, 38, 31);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -1538.0f, 0.0f, 1.0f, -387.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(1539.7643f, 389.7639f);
                Path path = instancePath;
                path.cubicTo(1539.5017f, 389.20786f, 1539.599f, 388.5254f, 1540.0621f, 388.06216f);
                path.cubicTo(1540.6488f, 387.47556f, 1541.5945f, 387.47012f, 1542.1871f, 388.06277f);
                instancePath.lineTo(1548.1244f, 394.0f);
                instancePath.lineTo(1570.9926f, 394.0f);
                instancePath.cubicTo(1572.6536f, 394.0f, 1574.0f, 395.3431f, 1574.0f, 397.00793f);
                instancePath.lineTo(1574.0f, 416.99207f);
                instancePath.cubicTo(1574.0f, 417.79092f, 1573.6871f, 418.51703f, 1573.1799f, 419.05563f);
                instancePath.lineTo(1577.2443f, 423.11996f);
                Path path2 = instancePath;
                path2.cubicTo(1577.8313f, 423.70694f, 1577.8357f, 424.6542f, 1577.2449f, 425.24493f);
                path2.cubicTo(1576.784f, 425.70578f, 1576.1017f, 425.80792f, 1575.5428f, 425.5432f);
                path2.cubicTo(1575.4706f, 425.39014f, 1575.371f, 425.24667f, 1575.2443f, 425.11996f);
                instancePath.lineTo(1540.1871f, 390.06277f);
                Path path3 = instancePath;
                path3.cubicTo(1540.06f, 389.93573f, 1539.9167f, 389.83615f, 1539.7643f, 389.7639f);
                instancePath.close();
                instancePath.moveTo(1540.0359f, 394.16028f);
                path3.cubicTo(1538.8513f, 394.5642f, 1538.0f, 395.68658f, 1538.0f, 397.00793f);
                instancePath.lineTo(1538.0f, 416.99207f);
                instancePath.cubicTo(1538.0f, 418.6569f, 1539.3418f, 420.0f, 1540.9968f, 420.0f);
                instancePath.lineTo(1547.0f, 420.0f);
                instancePath.lineTo(1547.0f, 426.8875f);
                instancePath.cubicTo(1547.0f, 428.08762f, 1547.6836f, 428.36902f, 1548.5267f, 427.5205f);
                instancePath.lineTo(1556.0f, 420.0f);
                instancePath.lineTo(1565.8756f, 420.0f);
                instancePath.lineTo(1540.0359f, 394.16028f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
