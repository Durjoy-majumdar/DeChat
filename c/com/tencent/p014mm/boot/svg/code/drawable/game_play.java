package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_play */
public class game_play extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
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
                instancePaint3.setColor(-1);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(6.8563f, 4.5f);
                instancePath.lineTo(17.1435f, 4.5f);
                instancePath.cubicTo(19.1519f, 4.5f, 20.8392f, 6.0964f, 21.061f, 8.20654f);
                instancePath.lineTo(21.9869f, 17.0153f);
                Path path = instancePath;
                path.cubicTo(22.116f, 18.2435f, 21.2787f, 19.3498f, 20.1168f, 19.4863f);
                path.cubicTo(20.0392f, 19.4954f, 19.9612f, 19.5f, 19.8831f, 19.5f);
                instancePath.lineTo(19.4773f, 19.5f);
                instancePath.cubicTo(18.2229f, 19.5f, 17.0198f, 18.9732f, 16.1328f, 18.0355f);
                instancePath.lineTo(14.6914f, 16.5118f);
                Path path2 = instancePath;
                path2.cubicTo(13.9776f, 15.7573f, 13.0094f, 15.3333f, 11.9999f, 15.3333f);
                path2.cubicTo(10.9904f, 15.3333f, 10.0222f, 15.7573f, 9.30842f, 16.5118f);
                instancePath.lineTo(7.86704f, 18.0355f);
                instancePath.cubicTo(6.98001f, 18.9732f, 5.77694f, 19.5f, 4.52249f, 19.5f);
                instancePath.lineTo(4.11673f, 19.5f);
                Path path3 = instancePath;
                path3.cubicTo(2.94769f, 19.5f, 2.0f, 18.4982f, 2.0f, 17.2624f);
                path3.cubicTo(2.0f, 17.1798f, 2.00432f, 17.0973f, 2.01295f, 17.0153f);
                instancePath.lineTo(2.93883f, 8.20654f);
                instancePath.cubicTo(3.16062f, 6.0964f, 4.84787f, 4.5f, 6.8563f, 4.5f);
                instancePath.close();
                instancePath.moveTo(7.0f, 9.3f);
                instancePath.lineTo(7.0f, 7.5f);
                instancePath.lineTo(8.2f, 7.5f);
                instancePath.lineTo(8.2f, 9.3f);
                instancePath.lineTo(9.99999f, 9.3f);
                instancePath.lineTo(9.99999f, 10.5f);
                instancePath.lineTo(8.2f, 10.5f);
                instancePath.lineTo(8.2f, 12.3f);
                instancePath.lineTo(7.0f, 12.3f);
                instancePath.lineTo(7.0f, 10.5f);
                instancePath.lineTo(5.19999f, 10.5f);
                instancePath.lineTo(5.19999f, 9.3f);
                instancePath.lineTo(7.0f, 9.3f);
                instancePath.close();
                instancePath.moveTo(16.4f, 12.3f);
                Path path4 = instancePath;
                path4.cubicTo(17.7255f, 12.3f, 18.8f, 11.2255f, 18.8f, 9.9f);
                path4.cubicTo(18.8f, 8.57452f, 17.7255f, 7.5f, 16.4f, 7.5f);
                path4.cubicTo(15.0745f, 7.5f, 14.0f, 8.57452f, 14.0f, 9.9f);
                path4.cubicTo(14.0f, 11.2255f, 15.0745f, 12.3f, 16.4f, 12.3f);
                instancePath.close();
                instancePath.moveTo(16.4f, 11.0965f);
                Path path5 = instancePath;
                path5.cubicTo(15.7373f, 11.0965f, 15.2f, 10.5593f, 15.2f, 9.89655f);
                path5.cubicTo(15.2f, 9.23381f, 15.7373f, 8.69655f, 16.4f, 8.69655f);
                path5.cubicTo(17.0627f, 8.69655f, 17.6f, 9.23381f, 17.6f, 9.89655f);
                path5.cubicTo(17.6f, 10.5593f, 17.0627f, 11.0965f, 16.4f, 11.0965f);
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
