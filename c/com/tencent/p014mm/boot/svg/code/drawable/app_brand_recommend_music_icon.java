package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_recommend_music_icon */
public class app_brand_recommend_music_icon extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -307.0f, 0.0f, 1.0f, -749.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 307.0f, 0.0f, 1.0f, 749.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(855638016);
        instancePaint5.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.0f, 31.5f);
        Path path = instancePath;
        instancePath.cubicTo(24.560413f, 31.5f, 31.5f, 24.560413f, 31.5f, 16.0f);
        Path path2 = path;
        path2.cubicTo(31.5f, 7.439586f, 24.560413f, 0.5f, 16.0f, 0.5f);
        path2.cubicTo(7.439586f, 0.5f, 0.5f, 7.439586f, 0.5f, 16.0f);
        path2.cubicTo(0.5f, 24.560413f, 7.439586f, 31.5f, 16.0f, 31.5f);
        path.close();
        WeChatSVGRenderC2Java.setFillType(path2, 2);
        canvas.drawPath(path2, instancePaint4);
        canvas.drawPath(path2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint6, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(15.0f, 3.5907052f);
        instancePath2.lineTo(6.6666665f, 5.4176283f);
        instancePath2.lineTo(6.6666665f, 15.163136f);
        instancePath2.lineTo(6.6666665f, 16.001057f);
        Path path3 = instancePath2;
        path3.cubicTo(6.6666665f, 16.78138f, 6.1440945f, 17.542246f, 5.441226f, 17.870054f);
        path3.cubicTo(5.3105655f, 17.930992f, 4.485161f, 18.115479f, 4.377384f, 18.137161f);
        path3.cubicTo(3.3418045f, 18.345497f, 2.5461206f, 17.458466f, 2.5023015f, 16.561483f);
        path3.cubicTo(2.458482f, 15.664502f, 3.0467193f, 14.916552f, 3.7292247f, 14.779246f);
        instancePath2.lineTo(4.656247f, 14.54665f);
        instancePath2.cubicTo(5.1032343f, 14.434498f, 5.4166665f, 14.032707f, 5.4166665f, 13.571865f);
        instancePath2.lineTo(5.4166665f, 5.2597876f);
        instancePath2.lineTo(5.4166665f, 5.1011295f);
        instancePath2.cubicTo(5.4166665f, 4.6312795f, 5.743765f, 4.224795f, 6.202738f, 4.12428f);
        instancePath2.lineTo(15.643036f, 2.0568664f);
        Path path4 = instancePath2;
        path4.cubicTo(15.912786f, 1.9977916f, 16.17935f, 2.1685772f, 16.238424f, 2.4383266f);
        path4.cubicTo(16.246119f, 2.4734614f, 16.25f, 2.5093238f, 16.25f, 2.5452912f);
        instancePath2.lineTo(16.25f, 2.9061635f);
        instancePath2.lineTo(16.25f, 12.9448185f);
        instancePath2.lineTo(16.25f, 13.78274f);
        Path path5 = instancePath2;
        path5.cubicTo(16.25f, 14.563063f, 15.722891f, 15.323929f, 15.013919f, 15.651737f);
        path5.cubicTo(14.882124f, 15.712675f, 14.049552f, 15.8971615f, 13.94084f, 15.918844f);
        path5.cubicTo(12.896268f, 16.12718f, 12.093675f, 15.240149f, 12.049476f, 14.343167f);
        path5.cubicTo(12.005276f, 13.446185f, 12.59862f, 12.698235f, 13.287052f, 12.560929f);
        instancePath2.lineTo(14.23615f, 12.32634f);
        instancePath2.cubicTo(14.684809f, 12.215445f, 15.0f, 11.8128605f, 15.0f, 11.3507f);
        instancePath2.lineTo(15.0f, 3.5907052f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
