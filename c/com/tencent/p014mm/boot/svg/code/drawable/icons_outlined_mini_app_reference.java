package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_mini_app_reference */
public class icons_outlined_mini_app_reference extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
        }
        if (i2 == 2) {
            Canvas canvas = objArr[0];
            Looper looper = objArr[1];
            C24542c.instanceMatrix(looper);
            C24542c.instanceMatrixArray(looper);
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-436207616);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.8f, 47.997f);
            Path path = instancePath;
            path.cubicTo(12.8f, 29.7275f, 27.6104f, 14.9172f, 45.8799f, 14.9172f);
            path.cubicTo(64.1494f, 14.9172f, 78.9597f, 29.7275f, 78.9597f, 47.997f);
            instancePath.lineTo(83.7597f, 47.997f);
            Path path2 = instancePath;
            path2.cubicTo(83.7597f, 27.0766f, 66.8003f, 10.1172f, 45.8799f, 10.1172f);
            path2.cubicTo(24.9594f, 10.1172f, 8.0f, 27.0766f, 8.0f, 47.997f);
            path2.cubicTo(8.0f, 68.9175f, 24.9594f, 85.8769f, 45.8799f, 85.8769f);
            path2.cubicTo(50.5397f, 85.8769f, 55.0083f, 85.0344f, 59.1379f, 83.4912f);
            instancePath.lineTo(57.4577f, 78.9949f);
            Path path3 = instancePath;
            path3.cubicTo(53.8574f, 80.3403f, 49.9574f, 81.0769f, 45.8799f, 81.0769f);
            path3.cubicTo(27.6104f, 81.0769f, 12.8f, 66.2666f, 12.8f, 47.997f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-436207616);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(55.4784f, 50.2141f);
            instancePath2.lineTo(55.9693f, 50.2089f);
            Path path4 = instancePath2;
            path4.cubicTo(61.1802f, 49.3026f, 64.972f, 45.2167f, 64.972f, 40.2905f);
            path4.cubicTo(64.972f, 34.7282f, 59.9875f, 30.2594f, 53.8657f, 30.2594f);
            path4.cubicTo(47.7439f, 30.2594f, 42.7594f, 34.7282f, 42.7594f, 40.2905f);
            instancePath2.lineTo(42.7594f, 56.4177f);
            Path path5 = instancePath2;
            path5.cubicTo(42.7594f, 59.773f, 39.5776f, 62.5138f, 35.5882f, 62.5138f);
            path5.cubicTo(31.5988f, 62.5138f, 28.417f, 59.773f, 28.417f, 56.4177f);
            path5.cubicTo(28.417f, 53.7236f, 30.5147f, 51.36f, 33.5212f, 50.6343f);
            path5.cubicTo(34.5092f, 50.3873f, 35.4458f, 49.6588f, 35.8068f, 48.8164f);
            path5.cubicTo(35.8651f, 48.7013f, 35.9046f, 48.5871f, 35.9247f, 48.4662f);
            path5.cubicTo(35.9405f, 48.3714f, 35.9435f, 48.2954f, 35.943f, 48.1391f);
            path5.cubicTo(35.943f, 47.2408f, 35.184f, 46.6016f, 34.083f, 46.6016f);
            instancePath2.lineTo(33.6529f, 46.6016f);
            Path path6 = instancePath2;
            path6.cubicTo(28.4444f, 47.3901f, 24.5895f, 51.5442f, 24.5895f, 56.4177f);
            path6.cubicTo(24.5895f, 61.98f, 29.5739f, 66.4488f, 35.6957f, 66.4488f);
            path6.cubicTo(41.8175f, 66.4488f, 46.802f, 61.98f, 46.802f, 56.4177f);
            instancePath2.lineTo(46.802f, 40.2905f);
            Path path7 = instancePath2;
            path7.cubicTo(46.802f, 36.9352f, 49.9839f, 34.1944f, 53.9732f, 34.1944f);
            path7.cubicTo(57.9626f, 34.1944f, 61.1445f, 36.9352f, 61.1445f, 40.2905f);
            path7.cubicTo(61.1445f, 43.0773f, 59.0631f, 45.4518f, 56.0403f, 46.1815f);
            path7.cubicTo(55.0009f, 46.4124f, 54.135f, 47.1117f, 53.7546f, 47.9993f);
            path7.cubicTo(53.2167f, 49.2095f, 54.0466f, 50.2141f, 55.4784f, 50.2141f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-436207616);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(76.3725f, 66.4209f);
            instancePath3.cubicTo(72.7068f, 64.866f, 68.347f, 64.6546f, 64.8243f, 65.0357f);
            instancePath3.lineTo(73.0934f, 73.3083f);
            instancePath3.lineTo(70.3898f, 76.0119f);
            instancePath3.lineTo(61.4924f, 67.1107f);
            instancePath3.cubicTo(59.5022f, 65.1197f, 59.5022f, 61.8921f, 61.4924f, 59.9011f);
            instancePath3.lineTo(70.3898f, 51.0f);
            instancePath3.lineTo(73.0934f, 53.7036f);
            instancePath3.lineTo(65.677f, 61.1232f);
            Path path8 = instancePath3;
            path8.cubicTo(69.4347f, 60.8664f, 73.8996f, 61.2184f, 77.8651f, 62.9006f);
            path8.cubicTo(80.626f, 64.0717f, 83.1869f, 65.9076f, 85.049f, 68.6646f);
            path8.cubicTo(86.9141f, 71.4261f, 87.9897f, 74.9811f, 87.9897f, 79.44f);
            instancePath3.lineTo(84.1667f, 79.44f);
            Path path9 = instancePath3;
            path9.cubicTo(84.1667f, 75.6129f, 83.2513f, 72.8339f, 81.8811f, 70.8051f);
            path9.cubicTo(80.5078f, 68.7719f, 78.5891f, 67.3612f, 76.3725f, 66.4209f);
            instancePath3.close();
            WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
