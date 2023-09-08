package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_more_user_dark */
public class game_comment_more_user_dark extends C24542c {
    private final int height = 12;
    private final int width = 14;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 14;
        }
        if (i == 1) {
            return 12;
        }
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
            instancePaint3.setColor(-419430401);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(10.9665f, 10.2673f);
            instancePath.lineTo(10.9665f, 10.55f);
            instancePath.lineTo(1.28319f, 10.55f);
            instancePath.lineTo(1.28319f, 10.2673f);
            instancePath.cubicTo(1.28319f, 10.135f, 1.42145f, 9.91356f, 1.54007f, 9.85568f);
            instancePath.lineTo(4.84194f, 8.2444f);
            instancePath.cubicTo(5.73123f, 7.81044f, 5.95372f, 6.76056f, 5.31438f, 6.00278f);
            instancePath.lineTo(5.10348f, 5.75282f);
            instancePath.cubicTo(4.78071f, 5.37026f, 4.49152f, 4.57994f, 4.49152f, 4.08039f);
            instancePath.lineTo(4.49152f, 3.08306f);
            Path path = instancePath;
            path.cubicTo(4.49152f, 2.18218f, 5.22437f, 1.44997f, 6.12485f, 1.44997f);
            path.cubicTo(7.02645f, 1.44997f, 7.75819f, 2.18201f, 7.75819f, 3.08343f);
            instancePath.lineTo(7.75819f, 4.08092f);
            instancePath.cubicTo(7.75819f, 4.5792f, 7.4678f, 5.37246f, 7.14619f, 5.7537f);
            instancePath.lineTo(6.9353f, 6.00369f);
            instancePath.cubicTo(6.29727f, 6.76001f, 6.51736f, 7.81087f, 7.40787f, 8.24525f);
            instancePath.lineTo(10.7097f, 9.85586f);
            Path path2 = instancePath;
            path2.cubicTo(10.8292f, 9.91415f, 10.9665f, 10.1335f, 10.9665f, 10.2673f);
            instancePath.close();
            instancePath.moveTo(3.79159f, 4.08042f);
            path2.cubicTo(3.79159f, 4.74554f, 4.13944f, 5.69567f, 4.56853f, 6.20425f);
            instancePath.lineTo(4.77943f, 6.45421f);
            instancePath.cubicTo(5.12524f, 6.86407f, 5.01389f, 7.38165f, 4.53502f, 7.61533f);
            instancePath.lineTo(1.23314f, 9.22661f);
            instancePath.cubicTo(0.87384f, 9.40195f, 0.583252f, 9.86772f, 0.583252f, 10.2674f);
            instancePath.lineTo(0.583252f, 10.6676f);
            instancePath.cubicTo(0.583252f, 10.9909f, 0.844793f, 11.25f, 1.16742f, 11.25f);
            instancePath.lineTo(11.0824f, 11.25f);
            instancePath.cubicTo(11.4035f, 11.25f, 11.6666f, 10.9892f, 11.6666f, 10.6676f);
            instancePath.lineTo(11.6666f, 10.2674f);
            instancePath.cubicTo(11.6666f, 9.86468f, 11.3756f, 9.40182f, 11.0167f, 9.22674f);
            instancePath.lineTo(7.71482f, 7.61613f);
            instancePath.cubicTo(7.23394f, 7.38157f, 7.12652f, 6.86272f, 7.47041f, 6.45508f);
            instancePath.lineTo(7.6813f, 6.20508f);
            instancePath.cubicTo(8.1088f, 5.69834f, 8.45825f, 4.74542f, 8.45825f, 4.08094f);
            instancePath.lineTo(8.45825f, 3.08345f);
            Path path3 = instancePath;
            path3.cubicTo(8.45825f, 1.79591f, 7.41358f, 0.75f, 6.12492f, 0.75f);
            path3.cubicTo(4.83888f, 0.75f, 3.79159f, 1.79456f, 3.79159f, 3.08309f);
            instancePath.lineTo(3.79159f, 4.08042f);
            instancePath.close();
            instancePath.moveTo(8.74993f, 1.33332f);
            Path path4 = instancePath;
            path4.cubicTo(8.43491f, 1.33332f, 8.13689f, 1.40698f, 7.87265f, 1.53786f);
            path4.cubicTo(8.02872f, 1.71423f, 8.15853f, 1.91435f, 8.25594f, 2.13208f);
            path4.cubicTo(8.40768f, 2.06853f, 8.57463f, 2.03332f, 8.74993f, 2.03332f);
            path4.cubicTo(9.44975f, 2.03332f, 10.0148f, 2.59276f, 10.0148f, 3.27787f);
            instancePath.lineTo(10.0148f, 4.10911f);
            instancePath.cubicTo(10.0148f, 4.49534f, 9.78056f, 5.12868f, 9.52786f, 5.42511f);
            instancePath.lineTo(9.35027f, 5.63343f);
            instancePath.cubicTo(8.76249f, 6.32293f, 8.96739f, 7.29108f, 9.7845f, 7.6855f);
            instancePath.lineTo(12.565f, 9.02767f);
            instancePath.cubicTo(12.6269f, 9.05756f, 12.7166f, 9.19934f, 12.7166f, 9.26445f);
            instancePath.lineTo(12.7166f, 9.38332f);
            instancePath.lineTo(11.2446f, 9.38332f);
            instancePath.cubicTo(11.4435f, 9.56273f, 11.5962f, 9.8246f, 11.6477f, 10.0833f);
            instancePath.lineTo(12.9247f, 10.0833f);
            instancePath.cubicTo(13.1951f, 10.0833f, 13.4166f, 9.86602f, 13.4166f, 9.59797f);
            instancePath.lineTo(13.4166f, 9.26445f);
            instancePath.cubicTo(13.4166f, 8.92889f, 13.1716f, 8.54317f, 12.8693f, 8.39727f);
            instancePath.lineTo(10.0888f, 7.0551f);
            instancePath.cubicTo(9.68385f, 6.85963f, 9.59338f, 6.42726f, 9.88297f, 6.08755f);
            instancePath.lineTo(10.0606f, 5.87923f);
            instancePath.cubicTo(10.4206f, 5.45693f, 10.7148f, 4.66284f, 10.7148f, 4.10911f);
            instancePath.lineTo(10.7148f, 3.27787f);
            instancePath.cubicTo(10.7148f, 2.20491f, 9.83512f, 1.33332f, 8.74993f, 1.33332f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
