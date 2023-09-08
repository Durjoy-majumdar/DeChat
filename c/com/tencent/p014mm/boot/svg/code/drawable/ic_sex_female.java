package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ic_sex_female */
public class ic_sex_female extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
        instancePaint3.setColor(-1150121);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(23.357143f, 31.267857f);
        Path path = instancePath;
        instancePath.cubicTo(25.82522f, 35.67271f, 21.368435f, 37.603485f, 19.517857f, 38.94643f);
        path.cubicTo(11.49915f, 43.23181f, 8.0f, 44.938072f, 8.0f, 46.625f);
        Path path2 = path;
        path2.lineTo(8.0f, 50.464287f);
        Path path3 = path2;
        path2.cubicTo(8.0f, 51.156628f, 8.728162f, 52.0f, 9.535714f, 52.0f);
        path3.lineTo(49.464287f, 52.0f);
        path3.cubicTo(50.27184f, 52.0f, 51.0f, 51.156628f, 51.0f, 50.464287f);
        path3.lineTo(51.0f, 46.625f);
        Path path4 = path3;
        path4.cubicTo(51.0f, 44.938072f, 47.50085f, 43.23181f, 39.482143f, 38.94643f);
        path4.cubicTo(37.631565f, 37.603485f, 33.17478f, 35.67271f, 35.642857f, 31.267857f);
        path4.cubicTo(38.24307f, 27.868282f, 40.103214f, 26.426222f, 40.25f, 20.517857f);
        path4.cubicTo(40.103214f, 14.887795f, 35.947693f, 9.0f, 29.5f, 9.0f);
        path4.cubicTo(23.052307f, 9.0f, 18.896786f, 14.887795f, 18.75f, 20.517857f);
        path4.cubicTo(18.896786f, 26.426222f, 20.756931f, 27.868282f, 23.357143f, 31.267857f);
        path3.close();
        WeChatSVGRenderC2Java.setFillType(path3, 2);
        canvas.drawPath(path3, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1150121);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(43.0f, 35.0f);
        instancePath2.lineTo(43.0f, 24.87092f);
        instancePath2.lineTo(43.0f, 20.50185f);
        Path path5 = instancePath2;
        path5.cubicTo(43.0f, 13.046129f, 36.955845f, 7.0f, 29.5f, 7.0f);
        path5.cubicTo(24.75873f, 7.0f, 29.5f, 7.0f, 29.5f, 7.0f);
        path5.cubicTo(22.040064f, 7.0f, 16.0f, 13.045625f, 16.0f, 20.50328f);
        path5.cubicTo(16.0f, 20.50328f, 16.0f, 26.211f, 16.0f, 24.426191f);
        instancePath2.lineTo(16.0f, 35.0f);
        instancePath2.lineTo(43.0f, 35.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(22.200684f, 38.115723f);
        Path path6 = instancePath3;
        path6.cubicTo(22.200684f, 38.115723f, 21.690918f, 42.961914f, 23.961914f, 45.899902f);
        path6.cubicTo(26.230072f, 48.83422f, 29.463587f, 44.642944f, 29.58355f, 43.118626f);
        path6.cubicTo(26.589844f, 42.558025f, 22.200684f, 38.115723f, 22.200684f, 38.115723f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 66.79199f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(29.706408f, 38.115723f);
        Path path7 = instancePath4;
        path7.cubicTo(29.706408f, 38.115723f, 29.196642f, 42.961914f, 31.467638f, 45.899902f);
        path7.cubicTo(33.738636f, 48.83789f, 37.022217f, 44.632446f, 37.13452f, 43.112915f);
        path7.cubicTo(34.14038f, 42.558025f, 29.706408f, 38.115723f, 29.706408f, 38.115723f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
