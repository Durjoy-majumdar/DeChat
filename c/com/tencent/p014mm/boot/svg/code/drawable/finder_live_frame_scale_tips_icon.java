package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_frame_scale_tips_icon */
public class finder_live_frame_scale_tips_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(50.0758f, 44.8216f);
        Path path = instancePath;
        path.cubicTo(51.691f, 49.5371f, 49.7204f, 54.7381f, 45.3923f, 57.1831f);
        path.cubicTo(44.0522f, 57.9402f, 42.5586f, 58.3823f, 41.0238f, 58.4761f);
        instancePath.lineTo(29.683f, 59.1692f);
        Path path2 = instancePath;
        path2.cubicTo(27.9609f, 59.2744f, 26.4294f, 60.3043f, 25.6768f, 61.8631f);
        path2.cubicTo(24.4665f, 64.3697f, 25.6313f, 67.3807f, 28.2091f, 68.4098f);
        instancePath.lineTo(37.7747f, 72.2285f);
        instancePath.lineTo(60.8294f, 82.6942f);
        instancePath.cubicTo(64.6707f, 84.438f, 69.074f, 84.4351f, 72.913f, 82.6864f);
        instancePath.lineTo(80.0411f, 79.4396f);
        instancePath.cubicTo(85.7622f, 77.305f, 89.0349f, 71.2562f, 87.7049f, 65.2749f);
        instancePath.lineTo(83.8257f, 47.8289f);
        Path path3 = instancePath;
        path3.cubicTo(82.0755f, 39.9576f, 74.7996f, 34.5978f, 66.797f, 35.2846f);
        path3.cubicTo(64.8189f, 35.4543f, 62.9099f, 34.5101f, 61.8383f, 32.8319f);
        instancePath.lineTo(54.6379f, 21.5554f);
        instancePath.lineTo(50.2086f, 15.1826f);
        Path path4 = instancePath;
        path4.cubicTo(49.1131f, 13.6063f, 47.2284f, 12.782f, 45.3329f, 13.05f);
        path4.cubicTo(42.1408f, 13.5012f, 40.1683f, 16.7845f, 41.2595f, 19.8303f);
        instancePath.lineTo(47.0952f, 36.1194f);
        instancePath.lineTo(50.0758f, 44.8216f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(21.6002f, 22.1744f);
        Path path5 = instancePath2;
        path5.cubicTo(20.6237f, 22.4379f, 20.0449f, 23.4464f, 20.3074f, 24.4269f);
        path5.cubicTo(20.5698f, 25.4074f, 21.5741f, 25.9886f, 22.5506f, 25.7251f);
        instancePath2.lineTo(27.0333f, 24.5152f);
        instancePath2.lineTo(12.8041f, 49.3072f);
        instancePath2.lineTo(11.5992f, 44.8057f);
        Path path6 = instancePath2;
        path6.cubicTo(11.3368f, 43.8252f, 10.3325f, 43.244f, 9.35601f, 43.5075f);
        path6.cubicTo(8.37957f, 43.771f, 7.80076f, 44.7795f, 8.0632f, 45.76f);
        instancePath2.lineTo(10.1541f, 53.5715f);
        instancePath2.cubicTo(10.5478f, 55.0422f, 12.0543f, 55.914f, 13.5189f, 55.5187f);
        instancePath2.lineTo(21.2982f, 53.4192f);
        Path path7 = instancePath2;
        path7.cubicTo(22.2746f, 53.1556f, 22.8534f, 52.1472f, 22.591f, 51.1667f);
        path7.cubicTo(22.3285f, 50.1862f, 21.3242f, 49.605f, 20.3478f, 49.8685f);
        instancePath2.lineTo(16.0409f, 51.0309f);
        instancePath2.lineTo(30.1415f, 26.463f);
        instancePath2.lineTo(31.2991f, 30.7879f);
        Path path8 = instancePath2;
        path8.cubicTo(31.5616f, 31.7684f, 32.5659f, 32.3496f, 33.5423f, 32.0861f);
        path8.cubicTo(34.5188f, 31.8225f, 35.0976f, 30.8141f, 34.8351f, 29.8336f);
        instancePath2.lineTo(32.7442f, 22.0221f);
        instancePath2.cubicTo(32.3506f, 20.5513f, 30.8441f, 19.6795f, 29.3794f, 20.0748f);
        instancePath2.lineTo(21.6002f, 22.1744f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
