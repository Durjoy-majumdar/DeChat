package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_more_user */
public class game_comment_more_user extends C24542c {
    private final int height = 14;
    private final int width = 14;

    public int doCommand(int i, Object... objArr) {
        int i2 = 14;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
            if (i == 2) {
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
                instancePath.moveTo(10.9665f, 11.2673f);
                instancePath.lineTo(10.9665f, 11.55f);
                instancePath.lineTo(1.28319f, 11.55f);
                instancePath.lineTo(1.28319f, 11.2673f);
                instancePath.cubicTo(1.28319f, 11.135f, 1.42145f, 10.9136f, 1.54007f, 10.8557f);
                instancePath.lineTo(4.84194f, 9.2444f);
                instancePath.cubicTo(5.73123f, 8.81044f, 5.95372f, 7.76056f, 5.31438f, 7.00278f);
                instancePath.lineTo(5.10348f, 6.75282f);
                instancePath.cubicTo(4.78071f, 6.37026f, 4.49152f, 5.57994f, 4.49152f, 5.08039f);
                instancePath.lineTo(4.49152f, 4.08306f);
                Path path = instancePath;
                path.cubicTo(4.49152f, 3.18218f, 5.22437f, 2.44997f, 6.12485f, 2.44997f);
                path.cubicTo(7.02645f, 2.44997f, 7.75819f, 3.18201f, 7.75819f, 4.08343f);
                instancePath.lineTo(7.75819f, 5.08092f);
                instancePath.cubicTo(7.75819f, 5.5792f, 7.4678f, 6.37246f, 7.14619f, 6.7537f);
                instancePath.lineTo(6.9353f, 7.00369f);
                instancePath.cubicTo(6.29727f, 7.76001f, 6.51736f, 8.81087f, 7.40787f, 9.24525f);
                instancePath.lineTo(10.7097f, 10.8559f);
                Path path2 = instancePath;
                path2.cubicTo(10.8292f, 10.9142f, 10.9665f, 11.1335f, 10.9665f, 11.2673f);
                instancePath.close();
                instancePath.moveTo(3.79159f, 5.08042f);
                path2.cubicTo(3.79159f, 5.74554f, 4.13944f, 6.69567f, 4.56853f, 7.20425f);
                instancePath.lineTo(4.77943f, 7.45421f);
                instancePath.cubicTo(5.12524f, 7.86407f, 5.01389f, 8.38165f, 4.53502f, 8.61533f);
                instancePath.lineTo(1.23314f, 10.2266f);
                instancePath.cubicTo(0.87384f, 10.4019f, 0.583252f, 10.8677f, 0.583252f, 11.2674f);
                instancePath.lineTo(0.583252f, 11.6676f);
                instancePath.cubicTo(0.583252f, 11.9909f, 0.844793f, 12.25f, 1.16742f, 12.25f);
                instancePath.lineTo(11.0824f, 12.25f);
                instancePath.cubicTo(11.4035f, 12.25f, 11.6666f, 11.9892f, 11.6666f, 11.6676f);
                instancePath.lineTo(11.6666f, 11.2674f);
                instancePath.cubicTo(11.6666f, 10.8647f, 11.3756f, 10.4018f, 11.0167f, 10.2267f);
                instancePath.lineTo(7.71482f, 8.61613f);
                instancePath.cubicTo(7.23394f, 8.38157f, 7.12652f, 7.86272f, 7.47041f, 7.45508f);
                instancePath.lineTo(7.6813f, 7.20508f);
                instancePath.cubicTo(8.1088f, 6.69834f, 8.45825f, 5.74542f, 8.45825f, 5.08094f);
                instancePath.lineTo(8.45825f, 4.08345f);
                Path path3 = instancePath;
                path3.cubicTo(8.45825f, 2.79591f, 7.41358f, 1.75f, 6.12492f, 1.75f);
                path3.cubicTo(4.83888f, 1.75f, 3.79159f, 2.79456f, 3.79159f, 4.08309f);
                instancePath.lineTo(3.79159f, 5.08042f);
                instancePath.close();
                instancePath.moveTo(8.74993f, 2.33332f);
                Path path4 = instancePath;
                path4.cubicTo(8.43491f, 2.33332f, 8.13689f, 2.40698f, 7.87265f, 2.53786f);
                path4.cubicTo(8.02872f, 2.71423f, 8.15853f, 2.91435f, 8.25594f, 3.13208f);
                path4.cubicTo(8.40768f, 3.06853f, 8.57463f, 3.03332f, 8.74993f, 3.03332f);
                path4.cubicTo(9.44975f, 3.03332f, 10.0148f, 3.59276f, 10.0148f, 4.27787f);
                instancePath.lineTo(10.0148f, 5.10911f);
                instancePath.cubicTo(10.0148f, 5.49534f, 9.78056f, 6.12868f, 9.52786f, 6.42511f);
                instancePath.lineTo(9.35027f, 6.63343f);
                instancePath.cubicTo(8.76249f, 7.32293f, 8.96739f, 8.29108f, 9.7845f, 8.6855f);
                instancePath.lineTo(12.565f, 10.0277f);
                instancePath.cubicTo(12.6269f, 10.0576f, 12.7166f, 10.1993f, 12.7166f, 10.2645f);
                instancePath.lineTo(12.7166f, 10.3833f);
                instancePath.lineTo(11.2446f, 10.3833f);
                instancePath.cubicTo(11.4435f, 10.5627f, 11.5962f, 10.8246f, 11.6477f, 11.0833f);
                instancePath.lineTo(12.9247f, 11.0833f);
                instancePath.cubicTo(13.1951f, 11.0833f, 13.4166f, 10.866f, 13.4166f, 10.598f);
                instancePath.lineTo(13.4166f, 10.2645f);
                instancePath.cubicTo(13.4166f, 9.92889f, 13.1716f, 9.54317f, 12.8693f, 9.39727f);
                instancePath.lineTo(10.0888f, 8.0551f);
                instancePath.cubicTo(9.68385f, 7.85963f, 9.59338f, 7.42726f, 9.88297f, 7.08755f);
                instancePath.lineTo(10.0606f, 6.87923f);
                instancePath.cubicTo(10.4206f, 6.45693f, 10.7148f, 5.66284f, 10.7148f, 5.10911f);
                instancePath.lineTo(10.7148f, 4.27787f);
                instancePath.cubicTo(10.7148f, 3.20491f, 9.83512f, 2.33332f, 8.74993f, 2.33332f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
