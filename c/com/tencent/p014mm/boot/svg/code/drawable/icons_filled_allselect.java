package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_allselect */
public class icons_filled_allselect extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(65.435585f, 40.122665f);
        instancePath.lineTo(70.37511f, 45.062183f);
        instancePath.lineTo(50.637524f, 64.79977f);
        instancePath.lineTo(38.28873f, 52.45097f);
        instancePath.lineTo(43.223125f, 47.516575f);
        instancePath.lineTo(50.6324f, 54.92585f);
        instancePath.lineTo(65.435585f, 40.122665f);
        instancePath.close();
        instancePath.moveTo(51.758507f, 7.5f);
        instancePath.cubicTo(53.433002f, 7.5f, 54.801384f, 8.81064f, 54.893764f, 10.462035f);
        instancePath.lineTo(54.898735f, 10.640229f);
        instancePath.lineTo(54.898f, 43.446f);
        instancePath.lineTo(50.854694f, 47.49073f);
        instancePath.lineTo(43.431087f, 40.06637f);
        instancePath.lineTo(30.703167f, 52.79429f);
        instancePath.lineTo(41.235f, 63.326f);
        instancePath.lineTo(9.14023f, 63.326305f);
        instancePath.cubicTo(7.465732f, 63.326305f, 6.097351f, 62.015667f, 6.004971f, 60.364273f);
        instancePath.lineTo(6.0f, 60.186077f);
        instancePath.lineTo(6.0f, 10.640229f);
        instancePath.cubicTo(6.0f, 8.965733f, 7.31064f, 7.597351f, 8.962035f, 7.504971f);
        instancePath.lineTo(9.14023f, 7.5f);
        instancePath.lineTo(51.758507f, 7.5f);
        instancePath.close();
        instancePath.moveTo(30.449368f, 36.80881f);
        instancePath.lineTo(15.168513f, 36.80881f);
        instancePath.lineTo(15.168513f, 41.519154f);
        instancePath.lineTo(30.449368f, 41.519154f);
        instancePath.lineTo(30.449368f, 36.80881f);
        instancePath.close();
        instancePath.moveTo(45.73022f, 27.38812f);
        instancePath.lineTo(15.168513f, 27.38812f);
        instancePath.lineTo(15.168513f, 32.098465f);
        instancePath.lineTo(45.73022f, 32.098465f);
        instancePath.lineTo(45.73022f, 27.38812f);
        instancePath.close();
        instancePath.moveTo(45.73022f, 17.967432f);
        instancePath.lineTo(15.168513f, 17.967432f);
        instancePath.lineTo(15.168513f, 22.677776f);
        instancePath.lineTo(45.73022f, 22.677776f);
        instancePath.lineTo(45.73022f, 17.967432f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
