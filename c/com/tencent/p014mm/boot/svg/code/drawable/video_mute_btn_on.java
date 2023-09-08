package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.video_mute_btn_on */
public class video_mute_btn_on extends C24542c {
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
        instancePaint3.setColor(-419430401);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(9.3f, 0.7f);
        Path path = instancePath;
        path.cubicTo(9.7f, 0.3f, 10.3f, 0.3f, 10.7f, 0.7f);
        path.cubicTo(10.9f, 0.9f, 11.0f, 1.1f, 11.0f, 1.4f);
        instancePath.lineTo(11.0f, 14.6f);
        Path path2 = instancePath;
        path2.cubicTo(11.0f, 15.2f, 10.6f, 15.6f, 10.0f, 15.6f);
        path2.cubicTo(9.7f, 15.6f, 9.5f, 15.5f, 9.3f, 15.3f);
        instancePath.lineTo(5.5f, 11.5f);
        instancePath.lineTo(1.0f, 11.5f);
        instancePath.cubicTo(0.4f, 11.5f, 0.0f, 11.1f, 0.0f, 10.5f);
        instancePath.lineTo(0.0f, 5.5f);
        instancePath.cubicTo(0.0f, 4.9f, 0.4f, 4.5f, 1.0f, 4.5f);
        instancePath.lineTo(5.5f, 4.5f);
        instancePath.lineTo(9.3f, 0.7f);
        instancePath.close();
        instancePath.moveTo(16.2f, 13.9f);
        instancePath.lineTo(15.1f, 12.8f);
        instancePath.lineTo(15.2f, 12.7f);
        Path path3 = instancePath;
        path3.cubicTo(16.5f, 11.4f, 17.1f, 9.8f, 17.1f, 8.0f);
        path3.cubicTo(17.1f, 6.2f, 16.4f, 4.6f, 15.2f, 3.3f);
        instancePath.lineTo(15.1f, 3.2f);
        instancePath.lineTo(16.2f, 2.1f);
        instancePath.lineTo(16.3f, 2.2f);
        Path path4 = instancePath;
        path4.cubicTo(17.8f, 3.7f, 18.7f, 5.8f, 18.7f, 8.0f);
        path4.cubicTo(18.7f, 10.2f, 17.9f, 12.2f, 16.3f, 13.8f);
        instancePath.lineTo(16.2f, 13.9f);
        instancePath.close();
        instancePath.moveTo(14.2f, 11.9f);
        instancePath.lineTo(13.1f, 10.8f);
        instancePath.lineTo(13.2f, 10.7f);
        Path path5 = instancePath;
        path5.cubicTo(13.9f, 10.0f, 14.3f, 9.0f, 14.3f, 8.0f);
        path5.cubicTo(14.3f, 7.0f, 13.9f, 6.0f, 13.2f, 5.3f);
        instancePath.lineTo(13.1f, 5.2f);
        instancePath.lineTo(14.2f, 4.1f);
        instancePath.lineTo(14.3f, 4.2f);
        Path path6 = instancePath;
        path6.cubicTo(15.3f, 5.2f, 15.9f, 6.6f, 15.9f, 8.0f);
        path6.cubicTo(15.9f, 9.4f, 15.3f, 10.8f, 14.3f, 11.8f);
        instancePath.lineTo(14.2f, 11.9f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
