package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pay_receive_money */
public class icons_outlined_pay_receive_money extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(24.291172f, 3.3448083f);
            Path path = instancePath;
            path.cubicTo(25.055952f, 3.7077637f, 25.514912f, 3.9220836f, 25.99791f, 4.1389756f);
            path.cubicTo(28.293617f, 5.1698737f, 29.901888f, 5.6539063f, 31.273438f, 5.6539063f);
            path.cubicTo(32.783073f, 5.6539063f, 34.063473f, 5.488052f, 35.70194f, 5.1430516f);
            path.cubicTo(40.609493f, 4.109704f, 41.80466f, 4.2029753f, 43.67065f, 7.1570835f);
            path.cubicTo(45.54116f, 10.118341f, 43.905933f, 13.571045f, 39.32485f, 17.689869f);
            path.cubicTo(48.038654f, 23.094059f, 54.0f, 33.474678f, 54.0f, 42.235294f);
            path.cubicTo(54.0f, 54.71043f, 41.91169f, 62.0f, 27.0f, 62.0f);
            path.cubicTo(12.088312f, 62.0f, 0.0f, 54.71043f, 0.0f, 42.235294f);
            path.cubicTo(0.0f, 33.255516f, 6.2633405f, 22.573668f, 15.334585f, 17.292805f);
            path.cubicTo(9.474706f, 11.014716f, 7.958026f, 5.9791284f, 11.667408f, 2.4454f);
            path.cubicTo(14.7416725f, -0.48328567f, 17.464617f, 0.10500235f, 24.291172f, 3.3448083f);
            instancePath.close();
            instancePath.moveTo(27.0f, 17.6f);
            Path path2 = instancePath;
            path2.cubicTo(15.134592f, 17.6f, 3.6f, 30.582642f, 3.6f, 42.235294f);
            path2.cubicTo(3.6f, 51.841244f, 13.07616f, 58.4f, 27.0f, 58.4f);
            path2.cubicTo(40.92384f, 58.4f, 50.4f, 51.841244f, 50.4f, 42.235294f);
            path2.cubicTo(50.4f, 39.61109f, 49.81501f, 36.919434f, 48.772995f, 34.323795f);
            path2.cubicTo(37.51965f, 40.4158f, 23.15119f, 48.193726f, 23.15119f, 48.193726f);
            instancePath.lineTo(22.942083f, 48.307465f);
            Path path3 = instancePath;
            path3.cubicTo(22.683868f, 48.428635f, 22.393179f, 48.5f, 22.085064f, 48.5f);
            path3.cubicTo(21.369825f, 48.5f, 20.74805f, 48.13054f, 20.421717f, 47.5849f);
            instancePath.lineTo(20.297363f, 47.329178f);
            instancePath.lineTo(15.091088f, 36.60815f);
            Path path4 = instancePath;
            path4.cubicTo(15.034851f, 36.49144f, 15.0f, 36.35912f, 15.0f, 36.230515f);
            path4.cubicTo(15.0f, 35.736908f, 15.426926f, 35.33697f, 15.95286f, 35.33697f);
            path4.cubicTo(16.168303f, 35.33697f, 16.363945f, 35.403133f, 16.523943f, 35.514637f);
            instancePath.lineTo(22.666443f, 39.61884f);
            Path path5 = instancePath;
            path5.cubicTo(23.113962f, 39.89389f, 23.651777f, 40.055946f, 24.228405f, 40.055946f);
            path5.cubicTo(24.571371f, 40.055946f, 24.90008f, 39.996475f, 25.205027f, 39.89166f);
            path5.cubicTo(25.205027f, 39.89166f, 38.0061f, 34.557816f, 47.043728f, 30.79534f);
            path5.cubicTo(42.762436f, 23.436346f, 34.955578f, 17.6f, 27.0f, 17.6f);
            instancePath.close();
            instancePath.moveTo(14.150529f, 5.0519514f);
            Path path6 = instancePath;
            path6.cubicTo(12.271605f, 6.8419013f, 13.466239f, 10.272017f, 18.726133f, 15.633431f);
            path6.cubicTo(21.333752f, 14.590338f, 24.113998f, 14.0f, 27.0f, 14.0f);
            path6.cubicTo(30.11881f, 14.0f, 33.114117f, 14.689422f, 35.901142f, 15.894016f);
            path6.cubicTo(39.95245f, 12.497701f, 41.307995f, 10.157731f, 40.627003f, 9.079636f);
            path6.cubicTo(39.901825f, 7.931581f, 39.922867f, 7.933223f, 36.4437f, 8.665805f);
            path6.cubicTo(34.58153f, 9.057908f, 33.068424f, 9.253906f, 31.273438f, 9.253906f);
            path6.cubicTo(29.266068f, 9.253906f, 27.247272f, 8.64632f, 24.523178f, 7.4230537f);
            instancePath.lineTo(24.183172f, 7.269073f);
            Path path7 = instancePath;
            path7.cubicTo(23.783712f, 7.086624f, 23.359102f, 6.887309f, 22.74766f, 6.5971255f);
            path7.cubicTo(17.399836f, 4.0591087f, 15.600738f, 3.6704164f, 14.150529f, 5.0519514f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
