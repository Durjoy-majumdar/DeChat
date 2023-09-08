package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.login_auth_state_radar_default_select */
public class login_auth_state_radar_default_select extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 2.4f, 0.0f, 0.0f, 0.0f, 2.4f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15028967);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(20.0f, 10.123457f);
        Path path = instancePath;
        path.cubicTo(20.0f, 4.477037f, 15.522963f, 0.0f, 9.876543f, 0.0f);
        path.cubicTo(4.477037f, 0.0f, 0.0f, 4.477037f, 0.0f, 10.123457f);
        path.cubicTo(0.0f, 15.522963f, 4.477037f, 20.0f, 9.876543f, 20.0f);
        path.cubicTo(15.522963f, 20.0f, 20.0f, 15.522963f, 20.0f, 10.123457f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(5.456435f, 10.368831f);
        instancePath2.lineTo(5.506938f, 10.300112f);
        Path path2 = instancePath2;
        path2.cubicTo(5.663359f, 10.087274f, 5.962703f, 10.041537f, 6.1755424f, 10.197958f);
        path2.cubicTo(6.1781316f, 10.199862f, 6.1807017f, 10.201791f, 6.1832523f, 10.203745f);
        instancePath2.lineTo(8.341835f, 11.858175f);
        instancePath2.cubicTo(8.519238f, 11.994144f, 8.767159f, 11.989105f, 8.938891f, 11.846039f);
        instancePath2.lineTo(15.01762f, 6.7819657f);
        instancePath2.cubicTo(15.194826f, 6.634339f, 15.455153f, 6.645353f, 15.619257f, 6.8074207f);
        instancePath2.lineTo(15.619257f, 6.8074207f);
        Path path3 = instancePath2;
        path3.cubicTo(15.776759f, 6.9629693f, 15.778342f, 7.2167473f, 15.622794f, 7.3742495f);
        path3.cubicTo(15.621458f, 7.375602f, 15.620112f, 7.376945f, 15.618758f, 7.3782783f);
        instancePath2.lineTo(8.9890175f, 13.902933f);
        Path path4 = instancePath2;
        path4.cubicTo(8.800759f, 14.088207f, 8.497951f, 14.085789f, 8.312676f, 13.897531f);
        path4.cubicTo(8.311649f, 13.896486f, 8.310627f, 13.895438f, 8.309609f, 13.894385f);
        instancePath2.lineTo(5.497875f, 10.98438f);
        instancePath2.cubicTo(5.3358793f, 10.816722f, 5.318373f, 10.556688f, 5.456435f, 10.368831f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
