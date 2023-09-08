package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_type_music */
public class fav_type_music extends C24542c {
    private final int height = 24;
    private final int width = 25;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 25;
        }
        if (i == 1) {
            return 24;
        }
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
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(14.1959f, 2.48779f);
            instancePath.cubicTo(14.5273f, 2.48779f, 14.7959f, 2.75642f, 14.7959f, 3.08779f);
            instancePath.lineTo(14.7959f, 3.47504f);
            Path path = instancePath;
            path.cubicTo(14.7959f, 3.71656f, 14.9694f, 3.92102f, 15.2009f, 3.98969f);
            path.cubicTo(17.359f, 4.62965f, 20.3329f, 7.33908f, 17.864f, 11.2519f);
            path.cubicTo(17.786f, 11.3754f, 17.5989f, 11.3192f, 17.5951f, 11.1732f);
            path.cubicTo(17.5312f, 8.74594f, 16.9399f, 6.94775f, 15.0218f, 6.56835f);
            path.cubicTo(14.9031f, 6.54488f, 14.7959f, 6.6386f, 14.7959f, 6.75957f);
            instancePath.lineTo(14.7959f, 17.463f);
            Path path2 = instancePath;
            path2.cubicTo(14.8889f, 19.2603f, 13.3044f, 20.8618f, 11.3194f, 21.3387f);
            path2.cubicTo(9.13719f, 21.863f, 6.76868f, 20.9564f, 6.28615f, 18.948f);
            path2.cubicTo(5.80362f, 16.9395f, 7.50182f, 15.056f, 9.68403f, 14.5317f);
            path2.cubicTo(10.911f, 14.2369f, 12.1969f, 14.3945f, 13.1733f, 14.9459f);
            path2.cubicTo(13.3537f, 15.0478f, 13.5959f, 14.9251f, 13.5959f, 14.7179f);
            instancePath.lineTo(13.5959f, 3.08779f);
            instancePath.cubicTo(13.5959f, 2.75642f, 13.8646f, 2.48779f, 14.1959f, 2.48779f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
