package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_facebook_icon_normal */
public class album_facebook_icon_normal extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.972387f, 0.040298507f);
        instancePath.lineTo(1.027612f, 0.040298507f);
        Path path = instancePath;
        path.cubicTo(0.48358208f, 0.040298507f, 0.040298507f, 0.48358208f, 0.040298507f, 1.027612f);
        instancePath.lineTo(0.040298507f, 16.972387f);
        path.cubicTo(0.040298507f, 17.516418f, 0.48358208f, 17.959702f, 1.027612f, 17.959702f);
        instancePath.lineTo(9.611194f, 17.959702f);
        instancePath.lineTo(9.611194f, 11.021642f);
        instancePath.lineTo(7.2738805f, 11.021642f);
        instancePath.lineTo(7.2738805f, 8.314925f);
        instancePath.lineTo(9.611194f, 8.314925f);
        instancePath.lineTo(9.611194f, 6.3201494f);
        Path path2 = instancePath;
        path2.cubicTo(9.611194f, 4.002985f, 11.028358f, 2.747015f, 13.090299f, 2.747015f);
        path2.cubicTo(14.077612f, 2.747015f, 14.930597f, 2.8208954f, 15.179105f, 2.8544776f);
        instancePath.lineTo(15.179105f, 5.272388f);
        instancePath.lineTo(13.7485075f, 5.272388f);
        instancePath.cubicTo(12.626865f, 5.272388f, 12.405224f, 5.802985f, 12.405224f, 6.588806f);
        instancePath.lineTo(12.405224f, 8.314925f);
        instancePath.lineTo(15.085074f, 8.314925f);
        instancePath.lineTo(14.735821f, 11.021642f);
        instancePath.lineTo(12.405224f, 11.021642f);
        instancePath.lineTo(12.405224f, 17.966417f);
        instancePath.lineTo(16.972387f, 17.966417f);
        Path path3 = instancePath;
        path3.cubicTo(17.516418f, 17.966417f, 17.959702f, 17.523134f, 17.959702f, 16.979105f);
        instancePath.lineTo(17.959702f, 1.027612f);
        path3.cubicTo(17.959702f, 0.47686568f, 17.523134f, 0.040298507f, 16.972387f, 0.040298507f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
