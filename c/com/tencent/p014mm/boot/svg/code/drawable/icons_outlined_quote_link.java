package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_quote_link */
public class icons_outlined_quote_link extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.5f);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(54.401455f, 36.016678f);
        instancePath.lineTo(51.643738f, 33.258965f);
        instancePath.lineTo(58.53803f, 26.364672f);
        Path path = instancePath;
        path.cubicTo(62.0918f, 22.810902f, 62.0918f, 17.049099f, 58.53803f, 13.495328f);
        path.cubicTo(54.98426f, 9.941557f, 49.222458f, 9.941557f, 45.668686f, 13.495328f);
        instancePath.lineTo(33.029152f, 26.134863f);
        Path path2 = instancePath;
        path2.cubicTo(29.475382f, 29.688633f, 29.475382f, 35.450436f, 33.029152f, 39.004204f);
        instancePath.lineTo(30.271437f, 41.76192f);
        path2.cubicTo(25.19462f, 36.685104f, 25.19462f, 28.453962f, 30.271437f, 23.377146f);
        instancePath.lineTo(42.91097f, 10.737612f);
        Path path3 = instancePath;
        path3.cubicTo(47.987785f, 5.660796f, 56.21893f, 5.660796f, 61.295746f, 10.737612f);
        path3.cubicTo(66.37257f, 15.814427f, 66.37257f, 24.045572f, 61.295746f, 29.122389f);
        instancePath.lineTo(54.401455f, 36.016678f);
        instancePath.close();
        instancePath.moveTo(17.631903f, 36.016678f);
        instancePath.lineTo(20.38962f, 38.774395f);
        instancePath.lineTo(13.495328f, 45.668686f);
        Path path4 = instancePath;
        path4.cubicTo(9.941557f, 49.222458f, 9.941557f, 54.98426f, 13.495328f, 58.53803f);
        path4.cubicTo(17.049099f, 62.0918f, 22.810902f, 62.0918f, 26.364672f, 58.53803f);
        instancePath.lineTo(39.004204f, 45.898495f);
        Path path5 = instancePath;
        path5.cubicTo(42.557976f, 42.344727f, 42.557976f, 36.582924f, 39.004204f, 33.029152f);
        instancePath.lineTo(41.76192f, 30.271437f);
        path5.cubicTo(46.838737f, 35.34825f, 46.838737f, 43.579395f, 41.76192f, 48.65621f);
        instancePath.lineTo(29.122389f, 61.295746f);
        path5.cubicTo(24.045572f, 66.37257f, 15.814427f, 66.37257f, 10.737612f, 61.295746f);
        path5.cubicTo(5.660796f, 56.21893f, 5.660796f, 47.987785f, 10.737612f, 42.91097f);
        instancePath.lineTo(17.631903f, 36.016678f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint6);
        canvas.drawPath(instancePath, instancePaint7);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
