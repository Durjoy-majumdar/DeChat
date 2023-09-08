package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_chats_off_profile */
public class icons_filled_chats_off_profile extends C24542c {
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
        instancePath2.moveTo(17.0f, 11.0f);
        Path path = instancePath2;
        path.cubicTo(19.761423f, 11.0f, 22.0f, 13.238576f, 22.0f, 16.0f);
        path.cubicTo(22.0f, 18.761423f, 19.761423f, 21.0f, 17.0f, 21.0f);
        path.cubicTo(14.238576f, 21.0f, 12.0f, 18.761423f, 12.0f, 16.0f);
        path.cubicTo(12.0f, 13.238576f, 14.238576f, 11.0f, 17.0f, 11.0f);
        instancePath2.close();
        instancePath2.moveTo(20.5f, 3.0f);
        path.cubicTo(21.328426f, 3.0f, 22.0f, 3.671573f, 22.0f, 4.5f);
        instancePath2.lineTo(22.000792f, 12.334314f);
        instancePath2.cubicTo(21.65948f, 11.869475f, 21.254915f, 11.453972f, 20.799784f, 11.100487f);
        instancePath2.lineTo(20.8f, 4.5f);
        instancePath2.cubicTo(20.8f, 4.3343143f, 20.665686f, 4.2f, 20.5f, 4.2f);
        instancePath2.lineTo(3.5f, 4.2f);
        instancePath2.cubicTo(3.3343146f, 4.2f, 3.2f, 4.3343143f, 3.2f, 4.5f);
        instancePath2.lineTo(3.2f, 16.5f);
        instancePath2.cubicTo(3.2f, 16.665686f, 3.3343146f, 16.8f, 3.5f, 16.8f);
        instancePath2.lineTo(8.2f, 16.8f);
        instancePath2.lineTo(8.2f, 19.102943f);
        instancePath2.lineTo(10.502944f, 16.8f);
        instancePath2.lineTo(10.851224f, 16.80068f);
        instancePath2.cubicTo(10.904639f, 17.21495f, 10.998943f, 17.61641f, 11.129957f, 18.00088f);
        instancePath2.lineTo(11.0f, 18.0f);
        instancePath2.lineTo(8.707107f, 20.292892f);
        Path path2 = instancePath2;
        path2.cubicTo(8.316583f, 20.683418f, 7.6834173f, 20.683418f, 7.2928934f, 20.292892f);
        path2.cubicTo(7.1053567f, 20.105356f, 7.0f, 19.851004f, 7.0f, 19.585787f);
        instancePath2.lineTo(7.0f, 18.0f);
        instancePath2.lineTo(3.5f, 18.0f);
        Path path3 = instancePath2;
        path3.cubicTo(2.671573f, 18.0f, 2.0f, 17.328426f, 2.0f, 16.5f);
        instancePath2.lineTo(2.0f, 4.5f);
        path3.cubicTo(2.0f, 3.671573f, 2.671573f, 3.0f, 3.5f, 3.0f);
        instancePath2.lineTo(20.5f, 3.0f);
        instancePath2.close();
        instancePath2.moveTo(13.9221945f, 13.770833f);
        path3.cubicTo(13.467889f, 14.397004f, 13.2f, 15.167217f, 13.2f, 16.0f);
        path3.cubicTo(13.2f, 18.098682f, 14.901318f, 19.8f, 17.0f, 19.8f);
        path3.cubicTo(17.832783f, 19.8f, 18.602997f, 19.53211f, 19.229166f, 19.077806f);
        instancePath2.lineTo(13.9221945f, 13.770833f);
        instancePath2.close();
        instancePath2.moveTo(17.0f, 12.2f);
        path3.cubicTo(16.167217f, 12.2f, 15.397004f, 12.467889f, 14.770833f, 12.9221945f);
        instancePath2.lineTo(20.077806f, 18.229166f);
        path3.cubicTo(20.53211f, 17.602997f, 20.8f, 16.832783f, 20.8f, 16.0f);
        path3.cubicTo(20.8f, 13.901318f, 19.098682f, 12.2f, 17.0f, 12.2f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
