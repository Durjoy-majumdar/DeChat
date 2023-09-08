package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_transfer */
public class icons_outlined_transfer extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
            if (i == 2) {
                Canvas canvas = objArr[0];
                Looper looper = objArr[1];
                C24542c.instanceMatrix(looper);
                C24542c.instanceMatrixArray(looper);
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(22.590546f, 27.0f);
                instancePath.lineTo(60.0f, 27.0f);
                instancePath.lineTo(60.0f, 31.5f);
                instancePath.lineTo(13.496722f, 31.5f);
                Path path = instancePath;
                path.cubicTo(12.668295f, 31.5f, 11.996722f, 30.828426f, 11.996722f, 30.0f);
                path.cubicTo(11.996722f, 29.56789f, 12.183069f, 29.15677f, 12.508029f, 28.871954f);
                instancePath.lineTo(27.306252f, 15.901824f);
                Path path2 = instancePath;
                path2.cubicTo(27.804653f, 15.464992f, 28.562809f, 15.514904f, 28.999641f, 16.013306f);
                path2.cubicTo(29.36046f, 16.42498f, 29.39694f, 17.028662f, 29.08832f, 17.480791f);
                instancePath.lineTo(22.590546f, 27.0f);
                instancePath.close();
                instancePath.moveTo(49.406178f, 45.0f);
                instancePath.lineTo(11.996722f, 45.0f);
                instancePath.lineTo(11.996722f, 40.5f);
                instancePath.lineTo(53.996723f, 40.5f);
                instancePath.lineTo(58.5f, 40.5f);
                Path path3 = instancePath;
                path3.cubicTo(59.328426f, 40.5f, 60.0f, 41.171574f, 60.0f, 42.0f);
                path3.cubicTo(60.0f, 42.43211f, 59.813652f, 42.84323f, 59.488693f, 43.128044f);
                instancePath.lineTo(44.69047f, 56.098175f);
                Path path4 = instancePath;
                path4.cubicTo(44.19207f, 56.535007f, 43.433914f, 56.485096f, 42.99708f, 55.986694f);
                path4.cubicTo(42.63626f, 55.57502f, 42.59978f, 54.971336f, 42.9084f, 54.51921f);
                instancePath.lineTo(49.406178f, 45.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
