package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.native_oauth_default_head_img */
public class native_oauth_default_head_img extends C24542c {
    private final int height = 210;
    private final int width = 210;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 210;
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
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -335.0f, 0.0f, 1.0f, -284.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 335.0f, 0.0f, 1.0f, 284.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2565928);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(198.0f, 0.0f);
        path.cubicTo(204.62741f, 0.0f, 210.0f, 5.3725824f, 210.0f, 12.0f);
        instancePath.lineTo(210.0f, 198.0f);
        path.cubicTo(210.0f, 204.62741f, 204.62741f, 210.0f, 198.0f, 210.0f);
        instancePath.lineTo(12.0f, 210.0f);
        path.cubicTo(5.3725824f, 210.0f, 0.0f, 204.62741f, 0.0f, 198.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(157.64894f, 92.3088f);
        instancePath2.lineTo(144.74844f, 105.2093f);
        instancePath2.lineTo(138.95433f, 99.41519f);
        instancePath2.lineTo(151.85483f, 86.514694f);
        Path path2 = instancePath2;
        path2.cubicTo(159.84056f, 78.52897f, 159.70537f, 65.69745f, 151.70346f, 57.695538f);
        path2.cubicTo(143.70525f, 49.697327f, 130.86548f, 49.56299f, 122.88431f, 57.544167f);
        instancePath2.lineTo(97.083305f, 83.34517f);
        instancePath2.cubicTo(89.09758f, 91.33089f, 89.232765f, 104.162415f, 97.23468f, 112.16432f);
        instancePath2.lineTo(91.50112f, 117.89788f);
        instancePath2.cubicTo(80.298676f, 106.695435f, 80.20087f, 88.6394f, 91.2892f, 77.55106f);
        instancePath2.lineTo(117.0902f, 51.75006f);
        Path path3 = instancePath2;
        path3.cubicTo(128.17189f, 40.668373f, 146.23703f, 40.761997f, 157.43701f, 51.961983f);
        path3.cubicTo(168.63947f, 63.16443f, 168.73727f, 81.22047f, 157.64894f, 92.3088f);
        instancePath2.close();
        instancePath2.moveTo(51.753483f, 117.08678f);
        instancePath2.lineTo(64.653984f, 104.18628f);
        instancePath2.lineTo(70.44809f, 109.980385f);
        instancePath2.lineTo(57.54759f, 122.88088f);
        Path path4 = instancePath2;
        path4.cubicTo(49.56187f, 130.86661f, 49.697052f, 143.69812f, 57.698963f, 151.70004f);
        path4.cubicTo(65.697174f, 159.69824f, 78.53694f, 159.83258f, 86.51812f, 151.85141f);
        instancePath2.lineTo(112.31912f, 126.05041f);
        instancePath2.cubicTo(120.30484f, 118.06469f, 120.16966f, 105.23316f, 112.16775f, 97.231255f);
        instancePath2.lineTo(117.901306f, 91.497696f);
        instancePath2.cubicTo(129.10376f, 102.70014f, 129.20155f, 120.75618f, 118.11323f, 131.84451f);
        instancePath2.lineTo(92.312225f, 157.64552f);
        Path path5 = instancePath2;
        path5.cubicTo(81.23054f, 168.7272f, 63.165394f, 168.63358f, 51.965405f, 157.4336f);
        path5.cubicTo(40.76296f, 146.23114f, 40.665154f, 128.17511f, 51.753483f, 117.08678f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
