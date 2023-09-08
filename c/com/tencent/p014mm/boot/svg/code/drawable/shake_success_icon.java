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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.shake_success_icon */
public class shake_success_icon extends C24542c {
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
        instancePaint3.setColor(-8806);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(108.41f, 0.0f);
        instancePath.lineTo(113.56f, 0.0f);
        Path path = instancePath;
        path.cubicTo(139.19f, 0.58f, 164.5f, 10.31f, 183.78f, 27.22f);
        path.cubicTo(206.99f, 47.15f, 221.11f, 77.02f, 222.0f, 107.59f);
        instancePath.lineTo(222.0f, 111.72f);
        Path path2 = instancePath;
        path2.cubicTo(221.92f, 139.4f, 210.98f, 166.83f, 191.95f, 186.92f);
        path2.cubicTo(171.7f, 208.74f, 142.35f, 221.7f, 112.58f, 222.0f);
        instancePath.lineTo(107.9f, 222.0f);
        Path path3 = instancePath;
        path3.cubicTo(79.15f, 221.23f, 50.91f, 208.82f, 31.06f, 187.98f);
        path3.cubicTo(12.03f, 168.43f, 0.85f, 141.66f, 0.0f, 114.41f);
        instancePath.lineTo(0.0f, 107.69f);
        path3.cubicTo(0.84f, 79.23f, 13.02f, 51.32f, 33.52f, 31.54f);
        path3.cubicTo(53.31f, 12.06f, 80.65f, 0.61f, 108.41f, 0.0f);
        instancePath.lineTo(108.41f, 0.0f);
        instancePath.close();
        instancePath.moveTo(166.8f, 67.65f);
        path3.cubicTo(141.14f, 93.13f, 115.55f, 118.68f, 89.88f, 144.15f);
        path3.cubicTo(78.41f, 132.89f, 67.14f, 121.42f, 55.64f, 110.2f);
        path3.cubicTo(53.08f, 107.82f, 50.36f, 110.96f, 48.69f, 112.83f);
        path3.cubicTo(47.23f, 114.01f, 46.74f, 116.38f, 48.25f, 117.73f);
        path3.cubicTo(61.05f, 130.61f, 73.99f, 143.36f, 86.84f, 156.19f);
        path3.cubicTo(88.39f, 158.28f, 91.57f, 158.14f, 93.05f, 156.06f);
        path3.cubicTo(120.26f, 128.91f, 147.6f, 101.88f, 174.75f, 74.68f);
        path3.cubicTo(177.24f, 72.19f, 174.13f, 69.37f, 172.24f, 67.73f);
        path3.cubicTo(170.89f, 65.97f, 168.16f, 65.84f, 166.8f, 67.65f);
        instancePath.lineTo(166.8f, 67.65f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1940159);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 47.0f, 0.0f, 1.0f, 66.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(119.8f, 1.65f);
        Path path4 = instancePath2;
        path4.cubicTo(121.16f, -0.16f, 123.89f, -0.03f, 125.24f, 1.73f);
        path4.cubicTo(127.13f, 3.37f, 130.24f, 6.19f, 127.75f, 8.68f);
        path4.cubicTo(100.6f, 35.88f, 73.26f, 62.91f, 46.05f, 90.06f);
        path4.cubicTo(44.57f, 92.14f, 41.39f, 92.28f, 39.84f, 90.19f);
        path4.cubicTo(26.99f, 77.36f, 14.05f, 64.61f, 1.25f, 51.73f);
        path4.cubicTo(-0.26f, 50.38f, 0.23f, 48.01f, 1.69f, 46.83f);
        path4.cubicTo(3.36f, 44.96f, 6.08f, 41.82f, 8.64f, 44.2f);
        path4.cubicTo(20.14f, 55.42f, 31.41f, 66.89f, 42.88f, 78.15f);
        path4.cubicTo(68.55f, 52.68f, 94.14f, 27.13f, 119.8f, 1.65f);
        instancePath2.lineTo(119.8f, 1.65f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
