package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_recommend_not_good */
public class icon_recommend_not_good extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-372399);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(9.65459f, 25.8422f);
                Path path = instancePath;
                path.cubicTo(13.4435f, 19.5302f, 21.6268f, 17.4879f, 27.9326f, 21.2805f);
                path.cubicTo(28.5229f, 21.6356f, 29.2787f, 22.0718f, 30.2f, 22.5892f);
                path.cubicTo(30.7707f, 21.6994f, 31.2335f, 20.9591f, 31.5882f, 20.3682f);
                path.cubicTo(35.3771f, 14.0562f, 43.5604f, 12.0138f, 49.8662f, 15.8064f);
                path.cubicTo(55.8609f, 19.412f, 58.0006f, 26.993f, 54.9418f, 33.1554f);
                path.cubicTo(52.2181f, 28.0969f, 46.259f, 25.4349f, 40.5146f, 27.0838f);
                path.cubicTo(33.9481f, 28.9685f, 30.1268f, 35.7777f, 31.9029f, 42.3559f);
                instancePath.lineTo(31.9115f, 42.3878f);
                instancePath.lineTo(36.2017f, 57.3642f);
                instancePath.lineTo(14.0362f, 44.0326f);
                instancePath.cubicTo(7.86858f, 40.1934f, 5.90095f, 32.0955f, 9.65459f, 25.8422f);
                instancePath.close();
                instancePath.moveTo(41.7042f, 31.2364f);
                Path path2 = instancePath;
                path2.cubicTo(46.0406f, 29.9917f, 50.564f, 32.5016f, 51.8075f, 36.8423f);
                path2.cubicTo(51.8936f, 37.1429f, 52.0018f, 37.5012f, 52.1319f, 37.9174f);
                path2.cubicTo(52.1778f, 38.0639f, 52.2263f, 38.2176f, 52.2776f, 38.3784f);
                path2.cubicTo(52.9053f, 38.2183f, 53.4222f, 38.08f, 53.8281f, 37.9635f);
                path2.cubicTo(58.1646f, 36.7188f, 62.688f, 39.2286f, 63.9315f, 43.5694f);
                path2.cubicTo(65.1634f, 47.8697f, 62.7139f, 52.3538f, 58.4516f, 53.6471f);
                instancePath.lineTo(42.0174f, 58.3651f);
                instancePath.cubicTo(41.487f, 58.5174f, 40.9338f, 58.2104f, 40.7817f, 57.6795f);
                instancePath.lineTo(40.6166f, 57.1033f);
                instancePath.lineTo(36.0692f, 41.2288f);
                instancePath.cubicTo(34.9071f, 36.925f, 37.408f, 32.4695f, 41.7042f, 31.2364f);
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
