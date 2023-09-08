package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_bellring_close */
public class icons_outlined_bellring_close extends C24542c {
    private final int height = 25;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 24;
        }
        if (i2 == 1) {
            return 25;
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
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(5.1867065f, 20.000029f);
        Path path = instancePath;
        path.cubicTo(4.973726f, 20.000029f, 4.766308f, 19.932f, 4.5946674f, 19.8059f);
        path.cubicTo(4.1496005f, 19.478926f, 4.053867f, 18.853064f, 4.3808413f, 18.407995f);
        path.cubicTo(5.460271f, 16.93865f, 6.0f, 15.469325f, 6.0f, 14.0f);
        instancePath.lineTo(6.0f, 10.0f);
        Path path2 = instancePath;
        path2.cubicTo(6.0f, 7.377336f, 7.682712f, 5.147691f, 10.027397f, 4.3318033f);
        path2.cubicTo(10.0093775f, 4.2238827f, 10.0f, 4.1130366f, 10.0f, 4.0f);
        path2.cubicTo(10.0f, 2.8954306f, 10.895431f, 2.0f, 12.0f, 2.0f);
        path2.cubicTo(13.104569f, 2.0f, 14.0f, 2.8954306f, 14.0f, 4.0f);
        path2.cubicTo(14.0f, 4.1130366f, 13.9906225f, 4.2238827f, 13.972603f, 4.3318033f);
        path2.cubicTo(16.317287f, 5.147691f, 18.0f, 7.377336f, 18.0f, 10.0f);
        instancePath.lineTo(18.0f, 14.0f);
        Path path3 = instancePath;
        path3.cubicTo(18.0f, 15.469309f, 18.539717f, 16.938618f, 19.619152f, 18.407927f);
        path3.cubicTo(19.745256f, 18.579578f, 19.813261f, 18.787006f, 19.813261f, 19.0f);
        path3.cubicTo(19.813261f, 19.5523f, 19.365532f, 20.000029f, 18.813232f, 20.000029f);
        instancePath.lineTo(13.0f, 20.0f);
        instancePath.lineTo(13.0f, 20.2f);
        Path path4 = instancePath;
        path4.cubicTo(13.0f, 20.752285f, 12.552284f, 21.2f, 12.0f, 21.2f);
        path4.cubicTo(11.447716f, 21.2f, 11.0f, 20.752285f, 11.0f, 20.2f);
        instancePath.lineTo(11.0f, 20.0f);
        instancePath.lineTo(5.1867065f, 20.000029f);
        instancePath.close();
        instancePath.moveTo(12.0f, 3.2f);
        Path path5 = instancePath;
        path5.cubicTo(11.558172f, 3.2f, 11.2f, 3.5581722f, 11.2f, 4.0f);
        path5.cubicTo(11.2f, 4.0457406f, 11.203718f, 4.0904965f, 11.211012f, 4.134177f);
        instancePath.lineTo(11.377702f, 5.132509f);
        instancePath.lineTo(10.42177f, 5.4651475f);
        Path path6 = instancePath;
        path6.cubicTo(8.508613f, 6.130875f, 7.2f, 7.9408607f, 7.2f, 10.0f);
        instancePath.lineTo(7.2f, 14.0f);
        path6.cubicTo(7.2f, 15.630327f, 6.6484923f, 17.235512f, 5.574221f, 18.800026f);
        instancePath.lineTo(18.42583f, 18.800026f);
        path6.cubicTo(17.351528f, 17.235563f, 16.8f, 15.630358f, 16.8f, 14.0f);
        instancePath.lineTo(16.8f, 10.0f);
        path6.cubicTo(16.8f, 7.9408607f, 15.491387f, 6.130875f, 13.57823f, 5.4651475f);
        instancePath.lineTo(12.622298f, 5.132509f);
        instancePath.lineTo(12.788988f, 4.134177f);
        path6.cubicTo(12.796282f, 4.0904965f, 12.8f, 4.0457406f, 12.8f, 4.0f);
        path6.cubicTo(12.8f, 3.5581722f, 12.441828f, 3.2f, 12.0f, 3.2f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
