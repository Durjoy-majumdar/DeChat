package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_icon_filled_pay */
public class kinda_icon_filled_pay extends C24542c {
    private final int height = 24;
    private final int width = 28;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 28;
        }
        if (i2 == 1) {
            return 24;
        }
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
            instancePaint3.setColor(-16268960);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -174.0f, 0.0f, 1.0f, -64.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 172.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.364812f, 19.181551f);
            Path path = instancePath;
            path.cubicTo(12.244402f, 19.242964f, 12.108849f, 19.279133f, 11.96517f, 19.279133f);
            path.cubicTo(11.631642f, 19.279133f, 11.3417f, 19.091883f, 11.189525f, 18.81534f);
            instancePath.lineTo(11.1315365f, 18.685736f);
            instancePath.lineTo(8.703769f, 13.2521f);
            Path path2 = instancePath;
            path2.cubicTo(8.677545f, 13.192948f, 8.661293f, 13.125885f, 8.661293f, 13.060705f);
            path2.cubicTo(8.661293f, 12.810536f, 8.860374f, 12.60784f, 9.105626f, 12.60784f);
            path2.cubicTo(9.206091f, 12.60784f, 9.297321f, 12.641372f, 9.371931f, 12.6978855f);
            instancePath.lineTo(12.236277f, 14.777978f);
            Path path3 = instancePath;
            path3.cubicTo(12.444962f, 14.917379f, 12.695753f, 14.999514f, 12.9646435f, 14.999514f);
            path3.cubicTo(13.124574f, 14.999514f, 13.277856f, 14.969373f, 13.420058f, 14.916249f);
            instancePath.lineTo(26.89079f, 8.801055f);
            Path path4 = instancePath;
            path4.cubicTo(24.47632f, 5.897741f, 20.499477f, 4.0f, 15.999631f, 4.0f);
            path4.cubicTo(8.635438f, 4.0f, 2.6666667f, 9.074583f, 2.6666667f, 15.334453f);
            path4.cubicTo(2.6666667f, 18.749407f, 4.4620996f, 21.824146f, 7.2732577f, 23.90198f);
            path4.cubicTo(7.4989333f, 24.06587f, 7.646306f, 24.335255f, 7.646306f, 24.64043f);
            path4.cubicTo(7.646306f, 24.741402f, 7.6259913f, 24.832577f, 7.599398f, 24.929028f);
            path4.cubicTo(7.3752f, 25.78352f, 7.0158176f, 27.15116f, 6.9991965f, 27.215586f);
            path4.cubicTo(6.9711256f, 27.322208f, 6.9271727f, 27.434483f, 6.9271727f, 27.547134f);
            path4.cubicTo(6.9271727f, 27.796926f, 7.1258855f, 28.0f, 7.372245f, 28.0f);
            path4.cubicTo(7.468277f, 28.0f, 7.5469494f, 27.963455f, 7.6285768f, 27.915983f);
            instancePath.lineTo(10.547586f, 26.19645f);
            Path path5 = instancePath;
            path5.cubicTo(10.766983f, 26.06722f, 10.999308f, 25.987347f, 11.25564f, 25.987347f);
            path5.cubicTo(11.391932f, 25.987347f, 11.523791f, 26.008823f, 11.647525f, 26.047628f);
            path5.cubicTo(13.0093355f, 26.446995f, 14.478628f, 26.668907f, 15.999631f, 26.668907f);
            path5.cubicTo(23.363455f, 26.668907f, 29.333334f, 21.594324f, 29.333334f, 15.334453f);
            path5.cubicTo(29.333334f, 13.438972f, 28.782625f, 11.65313f, 27.814178f, 10.082793f);
            instancePath.lineTo(12.462321f, 19.123907f);
            instancePath.lineTo(12.364812f, 19.181551f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
