package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_lottery_fan_icon_disable */
public class finder_live_lottery_fan_icon_disable extends C24542c {
    private final int height = 20;
    private final int width = 21;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 21;
        }
        if (i2 == 1) {
            return 20;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -136.0f, 0.0f, 1.0f, -549.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 47.0f, 0.0f, 1.0f, 236.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 68.0f, 0.0f, 1.0f, 303.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 19.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-422853187);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.442566f, 3.3628154f);
        instancePath.cubicTo(12.639778f, 3.4601457f, 12.799406f, 3.6197731f, 12.896736f, 3.8169858f);
        instancePath.lineTo(15.232819f, 8.550406f);
        instancePath.lineTo(17.8651f, 8.932535f);
        Path path = instancePath;
        path.cubicTo(18.48807f, 8.260741f, 19.021189f, 7.5784283f, 19.429863f, 6.9035153f);
        path.cubicTo(19.079073f, 7.6061068f, 18.645071f, 8.299111f, 18.146704f, 8.974116f);
        instancePath.lineTo(20.456459f, 9.309445f);
        Path path2 = instancePath;
        path2.cubicTo(21.003004f, 9.388864f, 21.381685f, 9.896306f, 21.302267f, 10.442851f);
        path2.cubicTo(21.270643f, 10.660488f, 21.168156f, 10.86163f, 21.010672f, 11.01514f);
        instancePath.lineTo(17.23081f, 14.699594f);
        instancePath.lineTo(18.123116f, 19.902126f);
        Path path3 = instancePath;
        path3.cubicTo(18.216476f, 20.446463f, 17.85089f, 20.963419f, 17.306551f, 21.05678f);
        path3.cubicTo(17.089794f, 21.093956f, 16.866827f, 21.058641f, 16.672165f, 20.956303f);
        instancePath.lineTo(12.0f, 18.5f);
        instancePath.lineTo(7.3278346f, 20.956303f);
        Path path4 = instancePath;
        path4.cubicTo(6.8389897f, 21.213305f, 6.2343626f, 21.025356f, 5.9773617f, 20.536512f);
        path4.cubicTo(5.875023f, 20.341852f, 5.839708f, 20.118883f, 5.876885f, 19.902126f);
        instancePath.lineTo(6.312376f, 17.35822f);
        Path path5 = instancePath;
        path5.cubicTo(3.256165f, 18.169153f, 1.4879068f, 17.164633f, 3.5843563f, 13.194225f);
        path5.cubicTo(2.6007106f, 15.833262f, 4.1095295f, 16.463383f, 6.5660043f, 15.884661f);
        instancePath.lineTo(6.7691894f, 14.699594f);
        instancePath.lineTo(2.9893277f, 11.01514f);
        Path path6 = instancePath;
        path6.cubicTo(2.5938442f, 10.629638f, 2.5857518f, 9.996525f, 2.9712532f, 9.601041f);
        path6.cubicTo(3.1247616f, 9.443558f, 3.3259041f, 9.34107f, 3.5435412f, 9.309445f);
        instancePath.lineTo(8.767181f, 8.550406f);
        instancePath.lineTo(11.103264f, 3.8169858f);
        instancePath.cubicTo(11.347686f, 3.321732f, 11.947312f, 3.1183932f, 12.442566f, 3.3628154f);
        instancePath.close();
        instancePath.moveTo(7.602916f, 16.937668f);
        instancePath.lineTo(7.1281195f, 19.705568f);
        instancePath.lineTo(12.0f, 17.14427f);
        instancePath.lineTo(16.87188f, 19.705568f);
        instancePath.lineTo(15.941434f, 14.280649f);
        instancePath.lineTo(19.882868f, 10.438701f);
        instancePath.lineTo(17.277895f, 10.059971f);
        instancePath.cubicTo(14.600768f, 13.165067f, 10.700022f, 15.759333f, 7.602916f, 16.937668f);
        instancePath.close();
        instancePath.moveTo(12.0f, 4.7114615f);
        instancePath.lineTo(9.564059f, 9.647216f);
        instancePath.lineTo(4.1171317f, 10.438701f);
        instancePath.lineTo(8.058566f, 14.280649f);
        instancePath.lineTo(7.848633f, 15.504381f);
        instancePath.cubicTo(10.66039f, 14.519663f, 14.209671f, 12.389323f, 16.802174f, 9.99086f);
        instancePath.lineTo(14.435941f, 9.647216f);
        instancePath.lineTo(12.0f, 4.7114615f);
        instancePath.close();
        instancePath.moveTo(20.05817f, 2.1795447f);
        instancePath.cubicTo(20.110909f, 2.1975546f, 20.152332f, 2.2389777f, 20.170341f, 2.291717f);
        instancePath.lineTo(20.636396f, 3.656497f);
        instancePath.lineTo(22.001177f, 4.1225514f);
        Path path7 = instancePath;
        path7.cubicTo(22.095253f, 4.1546774f, 22.145475f, 4.2569857f, 22.113348f, 4.351063f);
        path7.cubicTo(22.095339f, 4.403802f, 22.053915f, 4.4452252f, 22.001177f, 4.463235f);
        instancePath.lineTo(20.636396f, 4.9292893f);
        instancePath.lineTo(20.170341f, 6.2940693f);
        Path path8 = instancePath;
        path8.cubicTo(20.138216f, 6.3881464f, 20.035908f, 6.438368f, 19.94183f, 6.406242f);
        path8.cubicTo(19.889091f, 6.3882318f, 19.847668f, 6.346809f, 19.829659f, 6.2940693f);
        instancePath.lineTo(19.363604f, 4.9292893f);
        instancePath.lineTo(17.998823f, 4.463235f);
        Path path9 = instancePath;
        path9.cubicTo(17.904747f, 4.431109f, 17.854525f, 4.3288007f, 17.886652f, 4.2347236f);
        path9.cubicTo(17.904661f, 4.1819844f, 17.946085f, 4.140561f, 17.998823f, 4.1225514f);
        instancePath.lineTo(19.363604f, 3.656497f);
        instancePath.lineTo(19.829659f, 2.291717f);
        instancePath.cubicTo(19.861784f, 2.19764f, 19.964092f, 2.1474187f, 20.05817f, 2.1795447f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
