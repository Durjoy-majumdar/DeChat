package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_envelopes */
public class icons_outlined_envelopes extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.5f, 0.0f, 1.0f, 5.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(25.5f, 30.5f);
        Path path = instancePath;
        path.cubicTo(28.606602f, 30.5f, 31.125f, 27.981602f, 31.125f, 24.875f);
        path.cubicTo(31.125f, 21.768398f, 28.606602f, 19.25f, 25.5f, 19.25f);
        path.cubicTo(22.393398f, 19.25f, 19.875f, 21.768398f, 19.875f, 24.875f);
        path.cubicTo(19.875f, 27.981602f, 22.393398f, 30.5f, 25.5f, 30.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(4.95f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(46.65f, 3.0943847f);
        Path path2 = instancePath2;
        path2.cubicTo(46.96066f, 3.0943847f, 47.24191f, 3.2203047f, 47.445496f, 3.4238896f);
        path2.cubicTo(47.64908f, 3.6274745f, 47.775f, 3.9087245f, 47.775f, 4.2193847f);
        instancePath2.lineTo(47.775f, 4.2193847f);
        instancePath2.lineTo(47.775f, 56.848732f);
        Path path3 = instancePath2;
        path3.cubicTo(47.775f, 57.15939f, 47.64908f, 57.44064f, 47.445496f, 57.644226f);
        path3.cubicTo(47.24191f, 57.84781f, 46.96066f, 57.973732f, 46.65f, 57.973732f);
        instancePath2.lineTo(46.65f, 57.973732f);
        instancePath2.lineTo(4.35f, 57.973732f);
        Path path4 = instancePath2;
        path4.cubicTo(4.03934f, 57.973732f, 3.7580898f, 57.84781f, 3.5545049f, 57.644226f);
        path4.cubicTo(3.35092f, 57.44064f, 3.225f, 57.15939f, 3.225f, 56.848732f);
        instancePath2.lineTo(3.225f, 56.848732f);
        instancePath2.lineTo(3.225f, 4.2193847f);
        Path path5 = instancePath2;
        path5.cubicTo(3.225f, 3.9087245f, 3.35092f, 3.6274745f, 3.5545049f, 3.4238896f);
        path5.cubicTo(3.7580898f, 3.2203047f, 4.03934f, 3.0943847f, 4.35f, 3.0943847f);
        instancePath2.lineTo(4.35f, 3.0943847f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-16777216);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(2.25f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(3.0280151f, 7.681593f);
        Path path6 = instancePath3;
        path6.cubicTo(3.0280151f, 15.295336f, 10.917f, 21.71345f, 19.6848f, 23.7188f);
        path6.cubicTo(19.5684f, 24.20165f, 19.5f, 24.703764f, 19.5f, 25.2239f);
        path6.cubicTo(19.5f, 25.430214f, 19.5108f, 25.634043f, 19.53f, 25.835386f);
        path6.cubicTo(13.7418f, 24.903242f, 7.0864153f, 22.641865f, 3.0280151f, 19.46885f);
        instancePath3.lineTo(3.0280151f, 7.681593f);
        path6.cubicTo(3.0280151f, 7.681593f, 2.6176949f, 4.320863f, 3.0280151f, 3.3357544f);
        path6.cubicTo(3.4383354f, 2.3506463f, 5.257324f, 2.3294067f, 5.257324f, 2.3294067f);
        instancePath3.lineTo(44.426514f, 2.3294067f);
        instancePath3.lineTo(47.220886f, 3.3357544f);
        instancePath3.lineTo(48.046143f, 7.681593f);
        instancePath3.lineTo(48.046143f, 19.46885f);
        Path path7 = instancePath3;
        path7.cubicTo(43.987743f, 22.641865f, 37.2582f, 24.903242f, 31.47f, 25.835386f);
        path7.cubicTo(31.4892f, 25.634043f, 31.5f, 25.430214f, 31.5f, 25.2239f);
        path7.cubicTo(31.5f, 24.703764f, 31.4316f, 24.20165f, 31.3152f, 23.7188f);
        path7.cubicTo(40.083f, 21.71345f, 48.046143f, 15.295336f, 48.046143f, 7.681593f);
        path7.cubicTo(48.046143f, 7.681593f, 47.672394f, 2.9179604f, 44.426514f, 2.3294067f);
        path7.cubicTo(35.889668f, 0.78147715f, 14.429889f, 2.3294067f, 5.257324f, 2.3294067f);
        path7.cubicTo(3.9174805f, 2.3294067f, 3.0280151f, 7.681593f, 3.0280151f, 7.681593f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
