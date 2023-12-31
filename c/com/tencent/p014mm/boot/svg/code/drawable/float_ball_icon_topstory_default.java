package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_ball_icon_topstory_default */
public class float_ball_icon_topstory_default extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        Matrix instanceMatrix = C24542c.instanceMatrix(looper);
        float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15616);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.333333f, 0.0f, 1.0f, 5.333333f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(11.393916f, 15.901952f);
        instancePath2.lineTo(6.2608156f, 18.81208f);
        instancePath2.lineTo(4.5386353f, 12.446175f);
        Path path = instancePath2;
        path.cubicTo(4.254392f, 11.387946f, 4.8897595f, 10.296648f, 5.959852f, 10.015556f);
        instancePath2.lineTo(12.380408f, 8.3124695f);
        instancePath2.lineTo(12.397128f, 14.165795f);
        path.cubicTo(12.397128f, 14.876793f, 12.012564f, 15.538185f, 11.393916f, 15.901952f);
        instancePath2.close();
        instancePath2.moveTo(12.397128f, 23.44183f);
        instancePath2.lineTo(12.380408f, 29.295155f);
        instancePath2.lineTo(5.959852f, 27.592068f);
        instancePath2.cubicTo(4.8897595f, 27.310976f, 4.254392f, 26.219679f, 4.5386353f, 25.16145f);
        instancePath2.lineTo(6.2608156f, 18.81208f);
        instancePath2.lineTo(11.393916f, 21.722208f);
        instancePath2.cubicTo(12.012564f, 22.069439f, 12.397128f, 22.730831f, 12.397128f, 23.44183f);
        instancePath2.close();
        instancePath2.moveTo(19.519934f, 26.351957f);
        instancePath2.lineTo(24.636312f, 29.295155f);
        instancePath2.lineTo(19.921217f, 33.941437f);
        Path path2 = instancePath2;
        path2.cubicTo(19.135368f, 34.718575f, 17.864634f, 34.718575f, 17.078783f, 33.941437f);
        instancePath2.lineTo(12.380408f, 29.295155f);
        instancePath2.lineTo(17.496788f, 26.351957f);
        path2.cubicTo(18.115437f, 25.988192f, 18.884565f, 25.988192f, 19.519934f, 26.351957f);
        instancePath2.close();
        instancePath2.moveTo(25.606085f, 21.705673f);
        instancePath2.lineTo(30.739185f, 18.795546f);
        instancePath2.lineTo(32.461365f, 25.144915f);
        instancePath2.cubicTo(32.74561f, 26.203144f, 32.11024f, 27.294441f, 31.04015f, 27.575533f);
        instancePath2.lineTo(24.619593f, 29.27862f);
        instancePath2.lineTo(24.602873f, 23.425295f);
        instancePath2.cubicTo(24.602873f, 22.730831f, 24.987438f, 22.069439f, 25.606085f, 21.705673f);
        instancePath2.close();
        instancePath2.moveTo(24.602873f, 14.165795f);
        instancePath2.lineTo(24.619593f, 8.3124695f);
        instancePath2.lineTo(31.04015f, 10.015556f);
        instancePath2.cubicTo(32.11024f, 10.296648f, 32.74561f, 11.387946f, 32.461365f, 12.446175f);
        instancePath2.lineTo(30.739185f, 18.795546f);
        instancePath2.lineTo(25.606085f, 15.885417f);
        instancePath2.cubicTo(24.987438f, 15.538185f, 24.602873f, 14.876793f, 24.602873f, 14.165795f);
        instancePath2.close();
        instancePath2.moveTo(17.496788f, 11.255668f);
        instancePath2.lineTo(12.380408f, 8.3124695f);
        instancePath2.lineTo(17.078783f, 3.6661856f);
        Path path3 = instancePath2;
        path3.cubicTo(17.864634f, 2.8890493f, 19.135368f, 2.8890493f, 19.921217f, 3.6661856f);
        instancePath2.lineTo(24.619593f, 8.3124695f);
        instancePath2.lineTo(19.503212f, 11.255668f);
        path3.cubicTo(18.884565f, 11.619433f, 18.115437f, 11.619433f, 17.496788f, 11.255668f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
