package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_mike_off */
public class icons_filled_mike_off extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(50.409134f, 44.045174f);
        instancePath.cubicTo(51.740875f, 41.665092f, 52.5f, 38.921196f, 52.5f, 36.0f);
        instancePath.lineTo(52.5f, 30.0f);
        instancePath.lineTo(57.0f, 30.0f);
        instancePath.lineTo(57.0f, 36.0f);
        instancePath.cubicTo(57.0f, 40.170326f, 55.78438f, 44.056732f, 53.688164f, 47.3242f);
        instancePath.lineTo(66.27565f, 59.91169f);
        instancePath.lineTo(63.09367f, 63.09367f);
        instancePath.lineTo(12.18198f, 12.18198f);
        instancePath.lineTo(15.363961f, 9.0f);
        instancePath.lineTo(24.005259f, 17.641298f);
        Path path = instancePath;
        path.cubicTo(24.194948f, 11.179807f, 29.492569f, 6.0f, 36.0f, 6.0f);
        path.cubicTo(42.62742f, 6.0f, 48.0f, 11.372583f, 48.0f, 18.0f);
        instancePath.lineTo(48.0f, 36.0f);
        instancePath.cubicTo(48.0f, 37.662823f, 47.66179f, 39.24665f, 47.050407f, 40.686447f);
        instancePath.lineTo(50.409134f, 44.045174f);
        instancePath.lineTo(50.409134f, 44.045174f);
        instancePath.close();
        instancePath.moveTo(44.045174f, 50.409134f);
        instancePath.lineTo(47.3242f, 53.688164f);
        instancePath.cubicTo(44.65228f, 55.402313f, 41.566483f, 56.527615f, 38.25f, 56.88088f);
        instancePath.lineTo(38.25f, 66.0f);
        instancePath.lineTo(33.75f, 66.0f);
        instancePath.lineTo(33.75f, 56.88088f);
        instancePath.cubicTo(23.210026f, 55.75819f, 15.0f, 46.83787f, 15.0f, 36.0f);
        instancePath.lineTo(15.0f, 30.0f);
        instancePath.lineTo(19.5f, 30.0f);
        instancePath.lineTo(19.5f, 36.0f);
        Path path2 = instancePath;
        path2.cubicTo(19.5f, 45.112698f, 26.887302f, 52.5f, 36.0f, 52.5f);
        path2.cubicTo(38.921196f, 52.5f, 41.665092f, 51.740875f, 44.045174f, 50.409134f);
        instancePath.lineTo(44.045174f, 50.409134f);
        instancePath.close();
        instancePath.moveTo(40.686447f, 47.050407f);
        path2.cubicTo(39.24665f, 47.66179f, 37.662823f, 48.0f, 36.0f, 48.0f);
        path2.cubicTo(29.372583f, 48.0f, 24.0f, 42.62742f, 24.0f, 36.0f);
        instancePath.lineTo(24.0f, 30.36396f);
        instancePath.lineTo(40.686447f, 47.050407f);
        instancePath.lineTo(40.686447f, 47.050407f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, 0.70710677f, 11.121322f, -0.70710677f, 0.70710677f, 13.242639f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
