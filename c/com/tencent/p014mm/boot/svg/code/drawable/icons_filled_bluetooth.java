package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_bluetooth */
public class icons_filled_bluetooth extends C24542c {
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
                instancePath.moveTo(35.557423f, 5.8705916f);
                instancePath.lineTo(50.848534f, 21.151468f);
                Path path = instancePath;
                path.cubicTo(52.021313f, 22.32183f, 52.02195f, 24.221327f, 50.85077f, 25.393291f);
                path.cubicTo(50.8505f, 25.393564f, 50.850224f, 25.393835f, 50.849136f, 25.393291f);
                instancePath.lineTo(40.242115f, 35.99924f);
                instancePath.lineTo(40.242115f, 35.99924f);
                instancePath.lineTo(50.849262f, 46.606583f);
                instancePath.cubicTo(52.020676f, 47.77823f, 52.020706f, 49.677643f, 50.84933f, 50.84933f);
                instancePath.lineTo(35.55782f, 66.14209f);
                Path path2 = instancePath;
                path2.cubicTo(34.972057f, 66.7279f, 34.022312f, 66.727936f, 33.4365f, 66.14217f);
                path2.cubicTo(33.15517f, 65.86086f, 32.997116f, 65.47932f, 32.997116f, 65.08147f);
                instancePath.lineTo(32.997116f, 43.244244f);
                instancePath.lineTo(32.997116f, 43.244244f);
                instancePath.lineTo(21.150757f, 55.091885f);
                instancePath.lineTo(16.908117f, 50.849243f);
                instancePath.lineTo(31.755117f, 35.99924f);
                instancePath.lineTo(16.908117f, 21.150757f);
                instancePath.lineTo(21.150757f, 16.908117f);
                instancePath.lineTo(32.997116f, 28.754242f);
                instancePath.lineTo(32.997116f, 6.931607f);
                Path path3 = instancePath;
                path3.cubicTo(32.997116f, 6.1031795f, 33.66869f, 5.431607f, 34.497116f, 5.431607f);
                path3.cubicTo(34.894768f, 5.431607f, 35.276146f, 5.5895042f, 35.557423f, 5.8705916f);
                instancePath.close();
                instancePath.moveTo(38.997116f, 43.24124f);
                instancePath.lineTo(38.997116f, 54.218243f);
                instancePath.lineTo(44.487118f, 48.72824f);
                instancePath.lineTo(38.997116f, 43.24124f);
                instancePath.close();
                instancePath.moveTo(38.997116f, 17.795242f);
                instancePath.lineTo(38.997116f, 28.757242f);
                instancePath.lineTo(44.478115f, 23.276243f);
                instancePath.lineTo(38.997116f, 17.795242f);
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
