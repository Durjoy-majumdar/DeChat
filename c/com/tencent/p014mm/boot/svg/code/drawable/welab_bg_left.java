package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.welab_bg_left */
public class welab_bg_left extends C24542c {
    private final int height = 265;
    private final int width = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
        }
        if (i2 == 1) {
            return 265;
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
        canvas.saveLayerAlpha((RectF) null, 25, 31);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.6293204f, -0.777146f, 114.51628f, 0.777146f, 0.6293204f, 1.1047013f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(129.8682f, 161.8563f);
        instancePath.lineTo(40.530926f, 161.8563f);
        Path path = instancePath;
        path.cubicTo(26.720047f, 141.8038f, 1.1368684E-12f, 120.81583f, 1.1368684E-12f, 86.32336f);
        path.cubicTo(1.1368684E-12f, 38.648285f, 38.14514f, -1.409827E-12f, 85.199554f, -1.3926638E-12f);
        path.cubicTo(132.25397f, -1.3902678E-12f, 170.39911f, 38.648285f, 170.39911f, 86.32336f);
        path.cubicTo(170.39911f, 120.81583f, 143.67906f, 141.8038f, 129.8682f, 161.8563f);
        instancePath.close();
        instancePath.moveTo(55.37971f, 173.21463f);
        instancePath.lineTo(115.0194f, 173.21463f);
        instancePath.cubicTo(117.37212f, 173.21463f, 119.27938f, 175.12161f, 119.27938f, 177.47401f);
        instancePath.lineTo(119.27938f, 180.3136f);
        instancePath.cubicTo(119.27938f, 182.66599f, 117.37212f, 184.57297f, 115.0194f, 184.57297f);
        instancePath.lineTo(55.37971f, 184.57297f);
        instancePath.cubicTo(53.026993f, 184.57297f, 51.11973f, 182.66599f, 51.11973f, 180.3136f);
        instancePath.lineTo(51.11973f, 177.47401f);
        instancePath.cubicTo(51.11973f, 175.12161f, 53.026993f, 173.21463f, 55.37971f, 173.21463f);
        instancePath.close();
        instancePath.moveTo(63.899666f, 195.9313f);
        instancePath.lineTo(106.49944f, 195.9313f);
        instancePath.cubicTo(108.852165f, 195.9313f, 110.75942f, 197.83829f, 110.75942f, 200.19069f);
        instancePath.lineTo(110.75942f, 203.03027f);
        instancePath.cubicTo(110.75942f, 205.38266f, 108.852165f, 207.28964f, 106.49944f, 207.28964f);
        instancePath.lineTo(63.899666f, 207.28964f);
        instancePath.cubicTo(61.546947f, 207.28964f, 59.63969f, 205.38266f, 59.63969f, 203.03027f);
        instancePath.lineTo(59.63969f, 200.19069f);
        Path path2 = instancePath;
        path2.cubicTo(59.63969f, 197.83829f, 61.546947f, 195.9313f, 63.899666f, 195.9313f);
        instancePath.close();
        instancePath.moveTo(87.99253f, 105.08893f);
        path2.cubicTo(90.35236f, 109.80792f, 97.08666f, 109.80792f, 99.446495f, 105.08893f);
        instancePath.lineTo(110.75942f, 82.46626f);
        instancePath.lineTo(122.07235f, 105.08893f);
        Path path3 = instancePath;
        path3.cubicTo(123.65404f, 108.25185f, 127.500305f, 109.5337f, 130.66322f, 107.95201f);
        path3.cubicTo(133.82616f, 106.37032f, 135.108f, 102.524055f, 133.52632f, 99.36113f);
        instancePath.lineTo(116.486404f, 65.286125f);
        instancePath.cubicTo(114.12657f, 60.567127f, 107.39227f, 60.567127f, 105.03244f, 65.286125f);
        instancePath.lineTo(93.71951f, 87.90878f);
        instancePath.lineTo(82.406586f, 65.286125f);
        instancePath.cubicTo(80.04675f, 60.567127f, 73.31245f, 60.567127f, 70.95262f, 65.286125f);
        instancePath.lineTo(59.63969f, 87.90878f);
        instancePath.lineTo(48.32676f, 65.286125f);
        Path path4 = instancePath;
        path4.cubicTo(46.745075f, 62.1232f, 42.898808f, 60.84135f, 39.73588f, 62.42304f);
        path4.cubicTo(36.572956f, 64.00472f, 35.29111f, 67.85099f, 36.872795f, 71.013916f);
        instancePath.lineTo(53.91271f, 105.08893f);
        instancePath.cubicTo(56.272537f, 109.80792f, 63.00684f, 109.80792f, 65.36667f, 105.08893f);
        instancePath.lineTo(76.6796f, 82.46626f);
        instancePath.lineTo(87.99253f, 105.08893f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
