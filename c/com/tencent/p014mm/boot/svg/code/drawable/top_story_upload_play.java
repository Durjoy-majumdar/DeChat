package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.top_story_upload_play */
public class top_story_upload_play extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -65.0f, 0.0f, 1.0f, -131.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 65.0f, 0.0f, 1.0f, 131.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.0f, 24.0f);
                Path path = instancePath;
                path.cubicTo(5.372583f, 24.0f, 0.0f, 18.627417f, 0.0f, 12.0f);
                path.cubicTo(0.0f, 5.372583f, 5.372583f, 0.0f, 12.0f, 0.0f);
                path.cubicTo(18.627417f, 0.0f, 24.0f, 5.372583f, 24.0f, 12.0f);
                path.cubicTo(24.0f, 18.627417f, 18.627417f, 24.0f, 12.0f, 24.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 22.333334f);
                Path path2 = instancePath;
                path2.cubicTo(17.706942f, 22.333334f, 22.333334f, 17.706942f, 22.333334f, 12.0f);
                path2.cubicTo(22.333334f, 6.2930574f, 17.706942f, 1.6666666f, 12.0f, 1.6666666f);
                path2.cubicTo(6.2930574f, 1.6666666f, 1.6666666f, 6.2930574f, 1.6666666f, 12.0f);
                path2.cubicTo(1.6666666f, 17.706942f, 6.2930574f, 22.333334f, 12.0f, 22.333334f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(13.666667f, 11.666667f);
                instancePath2.lineTo(13.666667f, 13.624764f);
                instancePath2.lineTo(13.666667f, 14.916196f);
                instancePath2.cubicTo(13.666667f, 15.154654f, 13.482121f, 15.333324f, 13.254474f, 15.333315f);
                instancePath2.lineTo(6.4121933f, 15.333003f);
                instancePath2.cubicTo(6.189514f, 15.332993f, 6.0f, 15.146587f, 6.0f, 14.916656f);
                instancePath2.lineTo(6.0f, 9.093866f);
                instancePath2.cubicTo(6.0f, 8.869545f, 6.184545f, 8.677277f, 6.4121933f, 8.676953f);
                instancePath2.lineTo(13.254474f, 8.667252f);
                Path path3 = instancePath2;
                path3.cubicTo(13.477153f, 8.666935f, 13.666667f, 8.853425f, 13.666667f, 9.083804f);
                instancePath2.lineTo(13.666667f, 11.666667f);
                instancePath2.close();
                instancePath2.moveTo(14.666667f, 10.752296f);
                path3.cubicTo(15.714527f, 9.888178f, 17.115644f, 8.891267f, 17.5f, 8.677538f);
                path3.cubicTo(17.615805f, 8.618451f, 18.0f, 8.80178f, 18.0f, 9.189495f);
                instancePath2.lineTo(18.0f, 14.821027f);
                Path path4 = instancePath2;
                path4.cubicTo(18.0f, 15.089015f, 17.652575f, 15.344082f, 17.5f, 15.332984f);
                path4.cubicTo(17.179924f, 15.098051f, 15.743977f, 14.046944f, 14.666667f, 13.185655f);
                instancePath2.lineTo(14.666667f, 10.752296f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
