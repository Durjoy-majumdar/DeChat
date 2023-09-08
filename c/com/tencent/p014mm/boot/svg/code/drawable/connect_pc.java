package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.connect_pc */
public class connect_pc extends C24542c {
    private final int height = 104;
    private final int width = 104;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 104;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(0.8f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(98.718056f, 16.4f);
        Path path = instancePath;
        path.cubicTo(99.05054f, 16.4f, 99.17673f, 16.420479f, 99.29978f, 16.486292f);
        path.cubicTo(99.57952f, 16.823275f, 99.6f, 16.949463f, 99.6f, 17.281942f);
        instancePath.lineTo(99.6f, 17.281942f);
        instancePath.lineTo(99.6f, 74.718056f);
        Path path2 = instancePath;
        path2.cubicTo(99.6f, 75.05054f, 99.57952f, 75.17673f, 99.51371f, 75.29978f);
        path2.cubicTo(99.17673f, 75.57952f, 99.05054f, 75.6f, 98.718056f, 75.6f);
        instancePath.lineTo(98.718056f, 75.6f);
        instancePath.lineTo(5.2819424f, 75.6f);
        Path path3 = instancePath;
        path3.cubicTo(4.949462f, 75.6f, 4.823275f, 75.57952f, 4.700217f, 75.51371f);
        path3.cubicTo(4.4204793f, 75.17673f, 4.4f, 75.05054f, 4.4f, 74.718056f);
        instancePath.lineTo(4.4f, 74.718056f);
        instancePath.lineTo(4.4f, 17.281942f);
        Path path4 = instancePath;
        path4.cubicTo(4.4f, 16.949463f, 4.4204793f, 16.823275f, 4.4862914f, 16.700216f);
        path4.cubicTo(4.823275f, 16.420479f, 4.949462f, 16.4f, 5.2819424f, 16.4f);
        instancePath.lineTo(5.2819424f, 16.4f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(0.8f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(57.0f, 80.0f);
        instancePath2.lineTo(57.0f, 87.59501f);
        instancePath2.cubicTo(57.0f, 88.108765f, 57.389294f, 88.53893f, 57.900497f, 88.59005f);
        instancePath2.lineTo(71.0995f, 89.90995f);
        instancePath2.cubicTo(71.6107f, 89.96107f, 72.0f, 90.391235f, 72.0f, 90.90499f);
        instancePath2.lineTo(72.0f, 91.0f);
        instancePath2.cubicTo(72.0f, 91.552284f, 71.552284f, 92.0f, 71.0f, 92.0f);
        instancePath2.lineTo(33.0f, 92.0f);
        instancePath2.cubicTo(32.447716f, 92.0f, 32.0f, 91.552284f, 32.0f, 91.0f);
        instancePath2.lineTo(32.0f, 90.90499f);
        instancePath2.cubicTo(32.0f, 90.391235f, 32.389294f, 89.96107f, 32.900497f, 89.90995f);
        instancePath2.lineTo(46.099503f, 88.59005f);
        instancePath2.cubicTo(46.610706f, 88.53893f, 47.0f, 88.108765f, 47.0f, 87.59501f);
        instancePath2.lineTo(47.0f, 80.0f);
        instancePath2.lineTo(47.0f, 80.0f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(0.8f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(98.87223f, 12.4f);
        Path path5 = instancePath3;
        path5.cubicTo(100.541985f, 12.4f, 101.15311f, 12.559718f, 101.76505f, 12.886991f);
        path5.cubicTo(102.34617f, 13.197774f, 102.80222f, 13.653834f, 103.11301f, 14.234948f);
        path5.cubicTo(103.440285f, 14.846895f, 103.6f, 15.458012f, 103.6f, 17.12777f);
        instancePath3.lineTo(103.6f, 17.12777f);
        instancePath3.lineTo(103.6f, 74.87223f);
        Path path6 = instancePath3;
        path6.cubicTo(103.6f, 76.541985f, 103.440285f, 77.15311f, 103.11301f, 77.76505f);
        path6.cubicTo(102.80222f, 78.34617f, 102.34617f, 78.80222f, 101.76505f, 79.11301f);
        path6.cubicTo(101.15311f, 79.440285f, 100.541985f, 79.6f, 98.87223f, 79.6f);
        instancePath3.lineTo(98.87223f, 79.6f);
        instancePath3.lineTo(5.1277704f, 79.6f);
        Path path7 = instancePath3;
        path7.cubicTo(3.4580119f, 79.6f, 2.8468952f, 79.440285f, 2.2349482f, 79.11301f);
        path7.cubicTo(1.6538347f, 78.80222f, 1.1977736f, 78.34617f, 0.88699067f, 77.76505f);
        path7.cubicTo(0.55971783f, 77.15311f, 0.4f, 76.541985f, 0.4f, 74.87223f);
        instancePath3.lineTo(0.4f, 74.87223f);
        instancePath3.lineTo(0.4f, 17.12777f);
        Path path8 = instancePath3;
        path8.cubicTo(0.4f, 15.458012f, 0.55971783f, 14.846895f, 0.88699067f, 14.234948f);
        path8.cubicTo(1.1977736f, 13.653834f, 1.6538347f, 13.197774f, 2.2349482f, 12.886991f);
        path8.cubicTo(2.8468952f, 12.559718f, 3.4580119f, 12.4f, 5.1277704f, 12.4f);
        instancePath3.lineTo(5.1277704f, 12.4f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
