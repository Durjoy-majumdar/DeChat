package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.collect_sound_on */
public class collect_sound_on extends C24542c {
    private final int height = 62;
    private final int width = 62;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 62;
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
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-11776948);
            instancePaint4.setStrokeWidth(3.0f);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.5f, 51.5f);
            instancePath.lineTo(12.5f, 50.833168f);
            Path path = instancePath;
            path.cubicTo(12.604213f, 50.756973f, 12.7130165f, 50.673367f, 12.825878f, 50.581997f);
            path.cubicTo(13.609306f, 49.947758f, 14.377914f, 49.098545f, 15.08248f, 48.008003f);
            path.cubicTo(17.25971f, 44.638042f, 18.415026f, 39.67215f, 18.092539f, 32.831554f);
            path.cubicTo(18.56658f, 22.598658f, 22.709154f, 17.582647f, 28.795002f, 16.286835f);
            instancePath.lineTo(31.072823f, 15.801835f);
            instancePath.lineTo(29.689184f, 13.928539f);
            Path path2 = instancePath;
            path2.cubicTo(29.419085f, 13.562856f, 29.272728f, 13.127208f, 29.272728f, 12.666667f);
            path2.cubicTo(29.272728f, 11.47552f, 30.26446f, 10.5f, 31.5f, 10.5f);
            path2.cubicTo(32.735542f, 10.5f, 33.727272f, 11.47552f, 33.727272f, 12.666667f);
            path2.cubicTo(33.727272f, 13.127208f, 33.580914f, 13.562856f, 33.310818f, 13.928539f);
            instancePath.lineTo(31.927177f, 15.801835f);
            instancePath.lineTo(34.204998f, 16.286835f);
            Path path3 = instancePath;
            path3.cubicTo(40.290844f, 17.582647f, 44.43342f, 22.598658f, 44.90746f, 32.831554f);
            path3.cubicTo(44.584972f, 39.67215f, 45.740288f, 44.638042f, 47.91752f, 48.008003f);
            path3.cubicTo(48.622086f, 49.098545f, 49.390694f, 49.947758f, 50.17412f, 50.581997f);
            path3.cubicTo(50.286983f, 50.673367f, 50.395786f, 50.756973f, 50.5f, 50.833168f);
            instancePath.lineTo(50.5f, 51.5f);
            instancePath.lineTo(12.5f, 51.5f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
