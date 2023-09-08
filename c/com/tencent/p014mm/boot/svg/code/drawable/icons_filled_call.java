package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_call */
public class icons_filled_call extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                instancePaint3.setColor(-16777216);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(41.456177f, 37.89717f);
                Path path = instancePath;
                path.cubicTo(40.90096f, 37.712082f, 40.66962f, 37.804626f, 40.16067f, 38.082264f);
                path.cubicTo(38.49502f, 39.007713f, 34.42343f, 41.22879f, 32.017494f, 42.47815f);
                path.cubicTo(31.416008f, 42.802055f, 30.768255f, 42.98715f, 30.027967f, 42.98715f);
                path.cubicTo(29.24141f, 42.98715f, 28.54739f, 42.755783f, 27.945904f, 42.385605f);
                path.cubicTo(24.568336f, 40.395885f, 21.375841f, 38.082264f, 18.646027f, 35.305912f);
                path.cubicTo(15.91621f, 32.575836f, 13.602808f, 29.383034f, 11.613281f, 26.005142f);
                path.cubicTo(11.243137f, 25.403599f, 11.011797f, 24.663239f, 11.011797f, 23.922878f);
                path.cubicTo(11.011797f, 23.228792f, 11.196869f, 22.534704f, 11.520745f, 21.933163f);
                path.cubicTo(12.769983f, 19.48072f, 14.9908495f, 15.40874f, 15.91621f, 13.789203f);
                path.cubicTo(16.193819f, 13.280206f, 16.286354f, 13.002571f, 16.101282f, 12.493573f);
                instancePath.lineTo(12.168498f, 2.0359898f);
                Path path2 = instancePath;
                path2.cubicTo(11.65955f, 0.8329049f, 10.502849f, 0.046272494f, 9.114807f, 0.0f);
                path2.cubicTo(8.55959f, 0.0f, 7.911837f, 0.23136246f, 7.773033f, 0.27763495f);
                path2.cubicTo(3.2387638f, 1.9434447f, 0.0f, 6.2467866f, 0.0f, 11.3367605f);
                path2.cubicTo(0.0f, 12.771208f, 0.37014443f, 14.113111f, 0.41641247f, 14.437018f);
                path2.cubicTo(2.637279f, 24.154242f, 7.5879607f, 32.807198f, 14.389365f, 39.609253f);
                path2.cubicTo(21.19077f, 46.411312f, 29.842896f, 51.36247f, 39.559185f, 53.58355f);
                path2.cubicTo(39.883064f, 53.676094f, 41.224834f, 54.0f, 42.659145f, 54.0f);
                path2.cubicTo(47.74863f, 54.0f, 52.05156f, 50.760925f, 53.717213f, 46.226223f);
                path2.cubicTo(53.763477f, 46.087402f, 54.04109f, 45.43959f, 53.99482f, 44.88432f);
                path2.cubicTo(53.902283f, 43.496143f, 53.115726f, 42.339333f, 51.912758f, 41.830334f);
                instancePath.lineTo(41.456177f, 37.89717f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
