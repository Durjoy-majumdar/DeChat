package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_eye */
public class icons_filled_eye extends C24542c {
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 15.0f);
                Path path = instancePath;
                path.cubicTo(50.423954f, 15.0f, 62.9172f, 23.543571f, 69.00072f, 36.001507f);
                path.cubicTo(62.915207f, 48.45779f, 50.422802f, 57.0f, 36.0f, 57.0f);
                path.cubicTo(21.577196f, 57.0f, 9.084794f, 48.45779f, 3.000719f, 36.001472f);
                path.cubicTo(9.082803f, 23.543571f, 21.576046f, 15.0f, 36.0f, 15.0f);
                instancePath.close();
                instancePath.moveTo(36.0f, 21.6f);
                path.cubicTo(25.721823f, 21.6f, 16.340965f, 26.970743f, 10.780168f, 35.613647f);
                instancePath.lineTo(10.539f, 36.0f);
                instancePath.lineTo(10.780209f, 36.38798f);
                instancePath.cubicTo(16.173777f, 44.768288f, 25.157724f, 50.071552f, 35.068256f, 50.385265f);
                instancePath.lineTo(36.0f, 50.4f);
                instancePath.cubicTo(46.277203f, 50.4f, 55.65782f, 45.0302f, 61.22107f, 36.387615f);
                instancePath.lineTo(61.461f, 36.0f);
                instancePath.lineTo(61.221107f, 35.614056f);
                instancePath.cubicTo(55.82773f, 27.23264f, 46.84316f, 21.928503f, 36.93182f, 21.614737f);
                instancePath.lineTo(36.0f, 21.6f);
                instancePath.close();
                instancePath.moveTo(36.0f, 28.5f);
                Path path2 = instancePath;
                path2.cubicTo(40.142136f, 28.5f, 43.5f, 31.857864f, 43.5f, 36.0f);
                path2.cubicTo(43.5f, 40.142136f, 40.142136f, 43.5f, 36.0f, 43.5f);
                path2.cubicTo(31.857864f, 43.5f, 28.5f, 40.142136f, 28.5f, 36.0f);
                path2.cubicTo(28.5f, 31.857864f, 31.857864f, 28.5f, 36.0f, 28.5f);
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
