package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_chats_on_profile */
public class icons_filled_chats_on_profile extends C24542c {
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
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -0.2f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.restore();
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(20.5f, 3.0f);
        instancePath2.cubicTo(21.328426f, 3.0f, 22.0f, 3.687391f, 22.0f, 4.535331f);
        instancePath2.lineTo(22.0f, 16.817978f);
        instancePath2.cubicTo(22.0f, 17.665916f, 21.328426f, 18.353308f, 20.5f, 18.353308f);
        instancePath2.lineTo(11.0f, 18.353308f);
        instancePath2.lineTo(8.707107f, 20.700209f);
        Path path = instancePath2;
        path.cubicTo(8.316583f, 21.09993f, 7.6834173f, 21.09993f, 7.2928934f, 20.700209f);
        path.cubicTo(7.1053567f, 20.508255f, 7.0f, 20.24791f, 7.0f, 19.976446f);
        instancePath2.lineTo(7.0f, 18.353308f);
        instancePath2.lineTo(3.5f, 18.353308f);
        Path path2 = instancePath2;
        path2.cubicTo(2.671573f, 18.353308f, 2.0f, 17.665916f, 2.0f, 16.817978f);
        instancePath2.lineTo(2.0f, 4.535331f);
        path2.cubicTo(2.0f, 3.687391f, 2.671573f, 3.0f, 3.5f, 3.0f);
        instancePath2.lineTo(20.5f, 3.0f);
        instancePath2.close();
        instancePath2.moveTo(20.5f, 4.228265f);
        instancePath2.lineTo(3.5f, 4.228265f);
        path2.cubicTo(3.3343146f, 4.228265f, 3.2f, 4.3657427f, 3.2f, 4.535331f);
        instancePath2.lineTo(3.2f, 16.817978f);
        path2.cubicTo(3.2f, 16.987566f, 3.3343146f, 17.125044f, 3.5f, 17.125044f);
        instancePath2.lineTo(8.2f, 17.125044f);
        instancePath2.lineTo(8.2f, 19.482231f);
        instancePath2.lineTo(10.502944f, 17.125044f);
        instancePath2.lineTo(20.5f, 17.125044f);
        Path path3 = instancePath2;
        path3.cubicTo(20.665686f, 17.125044f, 20.8f, 16.987566f, 20.8f, 16.817978f);
        instancePath2.lineTo(20.8f, 4.535331f);
        path3.cubicTo(20.8f, 4.3657427f, 20.665686f, 4.228265f, 20.5f, 4.228265f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
