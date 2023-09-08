package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_test_unlike */
public class album_test_unlike extends C24542c {
    private final int height = 46;
    private final int width = 46;

    public int doCommand(int i, Object... objArr) {
        int i2 = 46;
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
                instancePaint3.setColor(-11184811);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(33.0f, 23.0f);
                instancePath.lineTo(32.0f, 23.0f);
                instancePath.lineTo(32.0f, 23.0f);
                instancePath.lineTo(32.0f, 4.4975147f);
                Path path = instancePath;
                path.cubicTo(32.0f, 3.1216204f, 30.880713f, 2.0f, 29.5f, 2.0f);
                path.cubicTo(28.109663f, 2.0f, 27.0f, 3.1181755f, 27.0f, 4.4975147f);
                instancePath.lineTo(27.0f, 23.0f);
                instancePath.lineTo(26.0f, 23.0f);
                instancePath.lineTo(26.0f, 2.497515f);
                Path path2 = instancePath;
                path2.cubicTo(26.0f, 1.1216205f, 24.880713f, -3.5527137E-15f, 23.5f, -3.5527137E-15f);
                path2.cubicTo(22.109663f, -3.5527137E-15f, 21.0f, 1.1181755f, 21.0f, 2.497515f);
                instancePath.lineTo(21.0f, 23.0f);
                instancePath.lineTo(21.0f, 23.0f);
                instancePath.lineTo(20.0f, 23.0f);
                instancePath.lineTo(20.0f, 23.0f);
                instancePath.lineTo(20.0f, 4.4976234f);
                Path path3 = instancePath;
                path3.cubicTo(20.0f, 3.119065f, 18.880713f, 2.0f, 17.5f, 2.0f);
                path3.cubicTo(16.109663f, 2.0f, 15.0f, 3.118224f, 15.0f, 4.4976234f);
                instancePath.lineTo(15.0f, 23.0f);
                instancePath.lineTo(14.0f, 23.0f);
                instancePath.lineTo(14.0f, 7.492989f);
                Path path4 = instancePath;
                path4.cubicTo(14.0f, 6.1171875f, 12.880712f, 5.0f, 11.5f, 5.0f);
                path4.cubicTo(10.109662f, 5.0f, 9.0f, 6.1161494f, 9.0f, 7.492989f);
                instancePath.lineTo(9.0f, 25.753506f);
                instancePath.lineTo(9.0f, 25.753506f);
                instancePath.lineTo(9.0f, 33.0f);
                instancePath.lineTo(9.07604f, 33.0f);
                Path path5 = instancePath;
                path5.cubicTo(9.823915f, 40.30732f, 15.996335f, 46.0f, 23.5f, 46.0f);
                path5.cubicTo(31.008278f, 46.0f, 37.17619f, 40.30293f, 37.923923f, 33.0f);
                instancePath.lineTo(37.923923f, 33.0f);
                instancePath.lineTo(38.0f, 33.0f);
                instancePath.lineTo(38.0f, 26.245796f);
                instancePath.lineTo(38.0f, 17.508408f);
                Path path6 = instancePath;
                path6.cubicTo(38.0f, 16.115417f, 36.88071f, 15.0f, 35.5f, 15.0f);
                path6.cubicTo(34.10966f, 15.0f, 33.0f, 16.123053f, 33.0f, 17.508408f);
                instancePath.lineTo(33.0f, 23.0f);
                instancePath.lineTo(33.0f, 23.0f);
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
