package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.shake_success_icon_no_activity */
public class shake_success_icon_no_activity extends C24542c {
    private final int height = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
    private final int width = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
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
        instancePaint3.setColor(-11286451);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(106.78f, 0.0f);
        instancePath.lineTo(114.26f, 0.0f);
        Path path = instancePath;
        path.cubicTo(143.67f, 0.83f, 172.5f, 13.86f, 192.4f, 35.56f);
        path.cubicTo(210.27f, 54.61f, 220.71f, 80.13f, 222.0f, 106.17f);
        instancePath.lineTo(222.0f, 115.49f);
        Path path2 = instancePath;
        path2.cubicTo(220.85f, 140.93f, 210.93f, 165.91f, 193.85f, 184.84f);
        path2.cubicTo(173.91f, 207.48f, 144.4f, 221.16f, 114.26f, 222.0f);
        instancePath.lineTo(107.88f, 222.0f);
        Path path3 = instancePath;
        path3.cubicTo(78.88f, 221.22f, 50.43f, 208.59f, 30.55f, 187.44f);
        path3.cubicTo(12.11f, 168.27f, 1.27f, 142.3f, 0.0f, 115.78f);
        instancePath.lineTo(0.0f, 107.09f);
        path3.cubicTo(1.01f, 80.27f, 11.92f, 53.95f, 30.53f, 34.57f);
        path3.cubicTo(50.17f, 13.67f, 78.16f, 1.14f, 106.78f, 0.0f);
        instancePath.lineTo(106.78f, 0.0f);
        instancePath.close();
        instancePath.moveTo(166.75f, 67.7f);
        path3.cubicTo(141.11f, 93.18f, 115.52f, 118.69f, 89.88f, 144.16f);
        path3.cubicTo(78.65f, 133.04f, 67.47f, 121.87f, 56.26f, 110.74f);
        path3.cubicTo(55.32f, 109.66f, 53.84f, 108.99f, 52.43f, 109.53f);
        path3.cubicTo(49.78f, 111.27f, 45.1f, 115.1f, 48.7f, 118.23f);
        path3.cubicTo(60.56f, 130.06f, 72.47f, 141.86f, 84.32f, 153.7f);
        path3.cubicTo(85.66f, 154.99f, 86.88f, 156.46f, 88.47f, 157.46f);
        path3.cubicTo(90.13f, 158.14f, 91.93f, 157.42f, 93.02f, 156.09f);
        path3.cubicTo(120.24f, 128.93f, 147.59f, 101.89f, 174.75f, 74.68f);
        path3.cubicTo(177.24f, 72.17f, 174.1f, 69.35f, 172.21f, 67.69f);
        path3.cubicTo(170.84f, 65.92f, 168.1f, 65.88f, 166.75f, 67.7f);
        instancePath.lineTo(166.75f, 67.7f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 47.0f, 0.0f, 1.0f, 66.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(119.75f, 1.7f);
        Path path4 = instancePath2;
        path4.cubicTo(121.1f, -0.12f, 123.84f, -0.08f, 125.21f, 1.69f);
        path4.cubicTo(127.1f, 3.35f, 130.24f, 6.17f, 127.75f, 8.68f);
        path4.cubicTo(100.59f, 35.89f, 73.24f, 62.93f, 46.02f, 90.09f);
        path4.cubicTo(44.93f, 91.42f, 43.13f, 92.14f, 41.47f, 91.46f);
        path4.cubicTo(39.88f, 90.46f, 38.66f, 88.99f, 37.32f, 87.7f);
        path4.cubicTo(25.47f, 75.86f, 13.56f, 64.06f, 1.7f, 52.23f);
        path4.cubicTo(-1.9f, 49.1f, 2.78f, 45.27f, 5.43f, 43.53f);
        path4.cubicTo(6.84f, 42.99f, 8.32f, 43.66f, 9.26f, 44.74f);
        path4.cubicTo(20.47f, 55.87f, 31.65f, 67.04f, 42.88f, 78.16f);
        path4.cubicTo(68.52f, 52.69f, 94.11f, 27.18f, 119.75f, 1.7f);
        instancePath2.lineTo(119.75f, 1.7f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
