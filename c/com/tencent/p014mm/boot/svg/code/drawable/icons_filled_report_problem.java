package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_report_problem */
public class icons_filled_report_problem extends C24542c {
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
                instancePath.moveTo(63.803913f, 63.15811f);
                instancePath.lineTo(8.195969f, 63.162773f);
                Path path = instancePath;
                path.cubicTo(6.539114f, 63.16291f, 5.1958556f, 61.819878f, 5.195717f, 60.163025f);
                path.cubicTo(5.195673f, 59.636444f, 5.334232f, 59.11913f, 5.597469f, 58.66307f);
                instancePath.lineTo(33.396782f, 10.500515f);
                Path path2 = instancePath;
                path2.cubicTo(34.225044f, 9.065542f, 36.05976f, 8.573707f, 37.49473f, 9.40197f);
                path2.cubicTo(37.950855f, 9.665244f, 38.32964f, 10.043954f, 38.593f, 10.50003f);
                instancePath.lineTo(66.401634f, 58.657925f);
                Path path3 = instancePath;
                path3.cubicTo(67.23016f, 60.092743f, 66.73867f, 61.927547f, 65.303856f, 62.75608f);
                path3.cubicTo(64.847824f, 63.019413f, 64.33051f, 63.15807f, 63.803913f, 63.15811f);
                instancePath.close();
                instancePath.moveTo(33.74121f, 28.634766f);
                instancePath.lineTo(34.092773f, 45.632812f);
                instancePath.lineTo(37.907227f, 45.632812f);
                instancePath.lineTo(38.25879f, 28.634766f);
                instancePath.lineTo(33.74121f, 28.634766f);
                instancePath.close();
                instancePath.moveTo(35.99121f, 54.351562f);
                Path path4 = instancePath;
                path4.cubicTo(37.432617f, 54.351562f, 38.557617f, 53.24414f, 38.557617f, 51.85547f);
                path4.cubicTo(38.557617f, 50.466797f, 37.432617f, 49.376953f, 35.99121f, 49.376953f);
                path4.cubicTo(34.567383f, 49.376953f, 33.442383f, 50.466797f, 33.442383f, 51.85547f);
                path4.cubicTo(33.442383f, 53.24414f, 34.567383f, 54.351562f, 35.99121f, 54.351562f);
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
