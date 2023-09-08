package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.remittance_cancle */
public class remittance_cancle extends C24542c {
    private final int height = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS;
    private final int width = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-16896);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(186.0f, 94.14815f);
                Path path = instancePath;
                path.cubicTo(186.0f, 41.636444f, 144.36356f, 0.0f, 91.85185f, 0.0f);
                path.cubicTo(41.636444f, 0.0f, 0.0f, 41.636444f, 0.0f, 94.14815f);
                path.cubicTo(0.0f, 144.36356f, 41.636444f, 186.0f, 91.85185f, 186.0f);
                path.cubicTo(144.36356f, 186.0f, 186.0f, 144.36356f, 186.0f, 94.14815f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(107.577896f, 70.84931f);
                Path path2 = instancePath2;
                path2.cubicTo(122.7227f, 70.84931f, 135.0f, 83.19187f, 135.0f, 98.42466f);
                path2.cubicTo(135.0f, 113.6541f, 122.72481f, 126.0f, 107.577896f, 126.0f);
                instancePath2.lineTo(55.890526f, 126.0f);
                instancePath2.cubicTo(55.3987f, 126.0f, 55.0f, 125.58803f, 55.0f, 125.10005f);
                instancePath2.lineTo(55.0f, 117.85886f);
                instancePath2.cubicTo(55.0f, 117.361824f, 55.39301f, 116.9589f, 55.890583f, 116.9589f);
                instancePath2.lineTo(107.58115f, 116.9589f);
                Path path3 = instancePath2;
                path3.cubicTo(117.75454f, 116.9589f, 126.01124f, 108.660835f, 126.01124f, 98.42466f);
                path3.cubicTo(126.01124f, 88.186226f, 117.7598f, 79.89041f, 107.58115f, 79.89041f);
                instancePath2.lineTo(75.55843f, 79.89041f);
                instancePath2.lineTo(75.55843f, 89.56726f);
                instancePath2.cubicTo(75.55843f, 90.5657f, 74.91493f, 90.89319f, 74.12114f, 90.29675f);
                instancePath2.lineTo(55.596493f, 76.37788f);
                instancePath2.cubicTo(54.799637f, 75.779144f, 54.8027f, 74.81443f, 55.596493f, 74.217995f);
                instancePath2.lineTo(74.12114f, 60.299118f);
                instancePath2.cubicTo(74.918f, 59.700382f, 75.55843f, 60.02929f, 75.55843f, 61.02861f);
                instancePath2.lineTo(75.55843f, 70.84931f);
                instancePath2.lineTo(107.577896f, 70.84931f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
