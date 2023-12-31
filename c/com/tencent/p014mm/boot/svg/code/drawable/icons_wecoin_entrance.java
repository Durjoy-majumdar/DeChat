package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_wecoin_entrance */
public class icons_wecoin_entrance extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-16777216);
            instancePaint4.setStrokeWidth(1.2f);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(10.0884f, 10.7079f);
            Path path = instancePath;
            path.cubicTo(10.0884f, 10.7079f, 13.0574f, 8.9209f, 13.3214f, 5.4159f);
            path.cubicTo(13.3924f, 4.4879f, 13.0904f, 3.0409f, 12.6794f, 2.6249f);
            path.cubicTo(12.4344f, 2.3759f, 12.0134f, 2.5209f, 11.9804f, 2.8689f);
            path.cubicTo(11.9244f, 3.4389f, 11.7124f, 4.5189f, 11.1574f, 5.2589f);
            path.cubicTo(10.7114f, 5.8529f, 9.7674f, 6.5379f, 9.4294f, 6.7719f);
            path.cubicTo(8.6154f, 7.2499f, 7.8304f, 7.8489f, 7.1104f, 8.5689f);
            path.cubicTo(3.5844f, 12.0949f, 2.9154f, 17.1419f, 5.6154f, 19.8429f);
            path.cubicTo(8.3164f, 22.5429f, 13.3634f, 21.8739f, 16.8894f, 18.3479f);
            path.cubicTo(20.4154f, 14.8219f, 21.0844f, 9.7739f, 18.3844f, 7.0739f);
            path.cubicTo(17.4384f, 6.1279f, 16.0394f, 5.5629f, 14.9954f, 5.4459f);
            path.cubicTo(13.9514f, 5.3299f, 13.3554f, 5.4159f, 13.3554f, 5.4159f);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
