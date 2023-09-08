package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_detail_skin_hb_mask_dark */
public class icons_filled_detail_skin_hb_mask_dark extends C24542c {
    private final int height = 444;
    private final int width = 1201;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 1201;
        }
        if (i2 == 1) {
            return 444;
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -96.0f, 0.0f, 1.0f, -605.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 96.0f, 0.0f, 1.0f, 605.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-14474461);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.009927948f, 275.6f);
            Path path = instancePath;
            path.cubicTo(0.009927948f, 289.88358f, 10.258303f, 306.87317f, 22.900314f, 313.53232f);
            path.cubicTo(22.900314f, 313.53232f, 52.041653f, 329.41473f, 80.79265f, 341.9114f);
            path.cubicTo(220.63646f, 402.69476f, 401.92905f, 439.37936f, 600.00995f, 439.37936f);
            path.cubicTo(798.3458f, 439.37936f, 979.8502f, 402.60025f, 1119.7672f, 341.6765f);
            path.cubicTo(1148.3163f, 329.24542f, 1177.1123f, 313.54172f, 1177.1123f, 313.54172f);
            path.cubicTo(1189.7782f, 306.9105f, 1200.0099f, 289.89032f, 1200.0099f, 275.6f);
            instancePath.lineTo(1200.0099f, 444.0f);
            instancePath.lineTo(0.009927948f, 444.0f);
            instancePath.lineTo(0.009927948f, 275.6f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-995729);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.0f, 275.6f);
            instancePath2.cubicTo(0.0f, 288.51648f, 10.567902f, 304.75446f, 22.845072f, 311.67966f);
            instancePath2.lineTo(27.106369f, 313.9748f);
            instancePath2.lineTo(32.18714f, 316.65604f);
            Path path2 = instancePath2;
            path2.cubicTo(33.5395f, 317.3637f, 34.95122f, 318.0979f, 36.417206f, 318.85532f);
            path2.cubicTo(46.190487f, 323.9047f, 56.37047f, 328.95404f, 66.43872f, 333.6655f);
            path2.cubicTo(70.24551f, 335.4469f, 73.96943f, 337.14795f, 77.594154f, 338.758f);
            instancePath2.lineTo(81.43045f, 340.44403f);
            Path path3 = instancePath2;
            path3.cubicTo(225.107f, 402.89328f, 407.27304f, 437.7794f, 600.00995f, 437.7794f);
            path3.cubicTo(791.06323f, 437.7794f, 971.72656f, 403.49966f, 1114.8042f, 342.07907f);
            instancePath2.lineTo(1119.8541f, 339.89285f);
            Path path4 = instancePath2;
            path4.cubicTo(1124.3289f, 337.9361f, 1128.9657f, 335.83185f, 1133.7327f, 333.60117f);
            path4.cubicTo(1143.7661f, 328.90585f, 1153.9089f, 323.87387f, 1163.6449f, 318.8418f);
            instancePath2.lineTo(1167.8586f, 316.6501f);
            instancePath2.lineTo(1176.3701f, 312.12424f);
            Path path5 = instancePath2;
            path5.cubicTo(1188.6996f, 305.66922f, 1199.5293f, 289.5502f, 1199.9944f, 276.46753f);
            instancePath2.lineTo(1200.0099f, 275.6f);
            path5.cubicTo(1200.0099f, 282.0f, 1200.0099f, 286.75137f, 1200.0099f, 289.85416f);
            path5.cubicTo(1200.0099f, 289.8798f, 1199.978f, 292.52603f, 1199.9672f, 292.55164f);
            path5.cubicTo(1195.6947f, 302.57938f, 1187.6565f, 312.11f, 1178.7155f, 317.10852f);
            instancePath2.lineTo(1174.4143f, 319.42285f);
            instancePath2.cubicTo(1172.0438f, 320.68573f, 1169.4094f, 322.07208f, 1166.5516f, 323.55548f);
            instancePath2.lineTo(1165.1042f, 324.30518f);
            Path path6 = instancePath2;
            path6.cubicTo(1155.3334f, 329.35526f, 1145.154f, 334.4054f, 1135.079f, 339.12012f);
            path6.cubicTo(1131.2466f, 340.91354f, 1127.4967f, 342.62607f, 1123.8458f, 344.247f);
            instancePath2.lineTo(1120.396f, 345.7641f);
            Path path7 = instancePath2;
            path7.cubicTo(976.22284f, 408.5411f, 793.40686f, 443.6f, 600.0f, 443.6f);
            path7.cubicTo(408.7716f, 443.6f, 227.8939f, 409.32687f, 84.479324f, 347.87006f);
            instancePath2.lineTo(79.00112f, 345.50058f);
            Path path8 = instancePath2;
            path8.cubicTo(74.507774f, 343.53442f, 69.85443f, 341.4222f, 65.0725f, 339.18448f);
            path8.cubicTo(56.647827f, 335.24213f, 48.148964f, 331.06604f, 39.8741f, 326.85104f);
            instancePath2.lineTo(34.938446f, 324.3189f);
            instancePath2.cubicTo(32.48644f, 323.05206f, 30.185429f, 321.8498f, 28.058937f, 320.72742f);
            instancePath2.lineTo(22.144714f, 317.56854f);
            Path path9 = instancePath2;
            path9.cubicTo(12.846583f, 312.6708f, 4.403824f, 303.53986f, 0.0f, 293.2f);
            path9.cubicTo(0.0f, 293.17496f, 0.0f, 292.45557f, 0.0f, 292.43054f);
            path9.cubicTo(0.0f, 288.2906f, 0.0f, 282.68042f, 0.0f, 275.6f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
