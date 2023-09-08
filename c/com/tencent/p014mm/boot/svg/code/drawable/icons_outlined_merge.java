package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_merge */
public class icons_outlined_merge extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(57.02629f, 12.004629f);
        instancePath.lineTo(58.15277f, 12.041431f);
        Path path = instancePath;
        path.cubicTo(59.698654f, 12.123953f, 60.631565f, 12.328727f, 61.4139f, 12.646564f);
        instancePath.lineTo(61.918224f, 12.875104f);
        path.cubicTo(62.00025f, 12.915952f, 62.08169f, 12.958171f, 62.16317f, 13.001747f);
        path.cubicTo(63.385395f, 13.655399f, 64.344604f, 14.614607f, 64.99825f, 15.836828f);
        instancePath.lineTo(65.12489f, 16.081776f);
        instancePath.lineTo(65.35344f, 16.5861f);
        Path path2 = instancePath;
        path2.cubicTo(65.67127f, 17.368437f, 65.876045f, 18.301344f, 65.95857f, 19.84723f);
        instancePath.lineTo(65.99537f, 20.973707f);
        path2.cubicTo(65.99845f, 21.17828f, 66.0f, 21.39169f, 66.0f, 21.614569f);
        instancePath.lineTo(66.0f, 50.38543f);
        instancePath.lineTo(65.99537f, 51.02629f);
        instancePath.lineTo(65.95857f, 52.15277f);
        Path path3 = instancePath;
        path3.cubicTo(65.876045f, 53.698654f, 65.67127f, 54.631565f, 65.35344f, 55.4139f);
        instancePath.lineTo(65.12489f, 55.918224f);
        path3.cubicTo(65.084045f, 56.00025f, 65.04183f, 56.08169f, 64.99825f, 56.16317f);
        path3.cubicTo(64.344604f, 57.385395f, 63.385395f, 58.3446f, 62.16317f, 58.998253f);
        instancePath.lineTo(61.918224f, 59.124897f);
        instancePath.lineTo(61.4139f, 59.353436f);
        Path path4 = instancePath;
        path4.cubicTo(60.631565f, 59.671272f, 59.698654f, 59.876045f, 58.15277f, 59.95857f);
        instancePath.lineTo(57.02629f, 59.995373f);
        path4.cubicTo(56.82172f, 59.99845f, 56.60831f, 60.0f, 56.38543f, 60.0f);
        instancePath.lineTo(15.61457f, 60.0f);
        instancePath.lineTo(14.973708f, 59.995373f);
        instancePath.lineTo(13.847231f, 59.95857f);
        Path path5 = instancePath;
        path5.cubicTo(12.301345f, 59.876045f, 11.368437f, 59.671272f, 10.586101f, 59.353436f);
        instancePath.lineTo(10.081776f, 59.124897f);
        path5.cubicTo(9.999747f, 59.08405f, 9.91831f, 59.04183f, 9.836828f, 58.998253f);
        path5.cubicTo(8.614607f, 58.3446f, 7.6553993f, 57.385395f, 7.0017476f, 56.16317f);
        instancePath.lineTo(6.875104f, 55.918224f);
        instancePath.lineTo(6.6465635f, 55.4139f);
        Path path6 = instancePath;
        path6.cubicTo(6.3287272f, 54.631565f, 6.1239533f, 53.698654f, 6.0414314f, 52.15277f);
        instancePath.lineTo(6.0046287f, 51.02629f);
        instancePath.lineTo(6.0046287f, 20.973707f);
        instancePath.lineTo(6.0414314f, 19.84723f);
        path6.cubicTo(6.1239533f, 18.301344f, 6.3287272f, 17.368437f, 6.6465635f, 16.5861f);
        instancePath.lineTo(6.875104f, 16.081776f);
        path6.cubicTo(6.915952f, 15.999747f, 6.958171f, 15.91831f, 7.0017476f, 15.836828f);
        path6.cubicTo(7.6553993f, 14.614607f, 8.614607f, 13.655399f, 9.836828f, 13.001747f);
        instancePath.lineTo(10.081776f, 12.875104f);
        instancePath.lineTo(10.586101f, 12.646564f);
        path6.cubicTo(11.368437f, 12.328727f, 12.301345f, 12.123953f, 13.847231f, 12.041431f);
        instancePath.lineTo(14.973708f, 12.004629f);
        instancePath.lineTo(57.02629f, 12.004629f);
        instancePath.close();
        instancePath.moveTo(56.93358f, 15.602728f);
        instancePath.lineTo(15.066422f, 15.602728f);
        instancePath.lineTo(14.060065f, 15.628873f);
        path6.cubicTo(12.72753f, 15.690152f, 12.135895f, 15.854691f, 11.534584f, 16.176275f);
        path6.cubicTo(10.939729f, 16.494408f, 10.494408f, 16.93973f, 10.176275f, 17.534584f);
        path6.cubicTo(9.88149f, 18.085787f, 9.718666f, 18.628857f, 9.646375f, 19.741932f);
        instancePath.lineTo(9.611139f, 20.574772f);
        path6.cubicTo(9.60735f, 20.729769f, 9.604566f, 20.893387f, 9.602728f, 21.066422f);
        instancePath.lineTo(9.602728f, 50.93358f);
        instancePath.lineTo(9.628873f, 51.939934f);
        path6.cubicTo(9.690152f, 53.27247f, 9.854691f, 53.864105f, 10.176275f, 54.465416f);
        path6.cubicTo(10.494408f, 55.060272f, 10.939729f, 55.505592f, 11.534584f, 55.823727f);
        path6.cubicTo(12.085786f, 56.11851f, 12.628857f, 56.281334f, 13.741933f, 56.353626f);
        instancePath.lineTo(14.574773f, 56.388863f);
        instancePath.lineTo(15.61457f, 56.4f);
        instancePath.lineTo(56.93358f, 56.39727f);
        instancePath.lineTo(57.86514f, 56.374424f);
        path6.cubicTo(59.25056f, 56.315887f, 59.85297f, 56.151264f, 60.465416f, 55.823727f);
        path6.cubicTo(61.060272f, 55.505592f, 61.505592f, 55.060272f, 61.823727f, 54.465416f);
        path6.cubicTo(62.11851f, 53.914215f, 62.281334f, 53.371143f, 62.353626f, 52.258068f);
        instancePath.lineTo(62.388863f, 51.42523f);
        instancePath.lineTo(62.4f, 50.38543f);
        instancePath.lineTo(62.39727f, 21.066422f);
        instancePath.lineTo(62.374424f, 20.134863f);
        path6.cubicTo(62.315887f, 18.74944f, 62.151264f, 18.14703f, 61.823727f, 17.534584f);
        path6.cubicTo(61.505592f, 16.93973f, 61.060272f, 16.494408f, 60.465416f, 16.176275f);
        path6.cubicTo(59.914215f, 15.88149f, 59.371143f, 15.718666f, 58.258068f, 15.646375f);
        instancePath.lineTo(57.42523f, 15.611139f);
        path6.cubicTo(57.270233f, 15.60735f, 57.106613f, 15.604566f, 56.93358f, 15.602728f);
        instancePath.close();
        instancePath.moveTo(51.65417f, 22.5f);
        path6.cubicTo(52.99145f, 22.5f, 53.47638f, 22.639238f, 53.965267f, 22.9007f);
        path6.cubicTo(54.45416f, 23.162159f, 54.83784f, 23.545843f, 55.0993f, 24.03473f);
        path6.cubicTo(55.36076f, 24.52362f, 55.5f, 25.00855f, 55.5f, 26.345827f);
        instancePath.lineTo(55.5f, 45.65417f);
        path6.cubicTo(55.5f, 46.99145f, 55.36076f, 47.47638f, 55.0993f, 47.965267f);
        path6.cubicTo(54.83784f, 48.45416f, 54.45416f, 48.83784f, 53.965267f, 49.0993f);
        path6.cubicTo(53.47638f, 49.36076f, 52.99145f, 49.5f, 51.65417f, 49.5f);
        instancePath.lineTo(20.345827f, 49.5f);
        path6.cubicTo(19.00855f, 49.5f, 18.52362f, 49.36076f, 18.03473f, 49.0993f);
        path6.cubicTo(17.545843f, 48.83784f, 17.162159f, 48.45416f, 16.9007f, 47.965267f);
        path6.cubicTo(16.639238f, 47.47638f, 16.5f, 46.99145f, 16.5f, 45.65417f);
        instancePath.lineTo(16.5f, 26.345827f);
        path6.cubicTo(16.5f, 25.00855f, 16.639238f, 24.52362f, 16.9007f, 24.03473f);
        path6.cubicTo(17.162159f, 23.545843f, 17.545843f, 23.162159f, 18.03473f, 22.9007f);
        path6.cubicTo(18.52362f, 22.639238f, 19.00855f, 22.5f, 20.345827f, 22.5f);
        instancePath.lineTo(51.65417f, 22.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
