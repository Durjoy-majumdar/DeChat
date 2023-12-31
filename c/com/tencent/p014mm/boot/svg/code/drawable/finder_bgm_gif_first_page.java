package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_bgm_gif_first_page */
public class finder_bgm_gif_first_page extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(11.000303f, 3.0548952f);
                instancePath.lineTo(11.000472f, 4.2634444f);
                Path path = instancePath;
                path.cubicTo(7.1647005f, 4.754101f, 4.2f, 8.030828f, 4.2f, 12.0f);
                path.cubicTo(4.2f, 16.307821f, 7.6921787f, 19.8f, 12.0f, 19.8f);
                path.cubicTo(16.307821f, 19.8f, 19.8f, 16.307821f, 19.8f, 12.0f);
                path.cubicTo(19.8f, 9.97815f, 19.03073f, 8.135974f, 17.768913f, 6.7501936f);
                instancePath.lineTo(19.05774f, 6.41477f);
                Path path2 = instancePath;
                path2.cubicTo(20.27382f, 7.949388f, 21.0f, 9.88989f, 21.0f, 12.0f);
                path2.cubicTo(21.0f, 16.970562f, 16.970562f, 21.0f, 12.0f, 21.0f);
                path2.cubicTo(7.029437f, 21.0f, 3.0f, 16.970562f, 3.0f, 12.0f);
                path2.cubicTo(3.0f, 7.3673425f, 6.500207f, 3.5522017f, 11.000303f, 3.0548952f);
                instancePath.close();
                instancePath.moveTo(19.296652f, 1.5612323f);
                instancePath.lineTo(19.29916f, 1.5739541f);
                instancePath.lineTo(19.3f, 3.8799644f);
                instancePath.cubicTo(19.3f, 3.92531f, 19.269487f, 3.9649796f, 19.22566f, 3.976616f);
                instancePath.lineTo(14.499f, 5.230869f);
                instancePath.lineTo(14.5f, 12.0f);
                Path path3 = instancePath;
                path3.cubicTo(14.5f, 13.325483f, 13.468464f, 14.410039f, 12.164375f, 14.494682f);
                instancePath.lineTo(12.0f, 14.5f);
                path3.cubicTo(10.619288f, 14.5f, 9.5f, 13.380712f, 9.5f, 12.0f);
                path3.cubicTo(9.5f, 10.619288f, 10.619288f, 9.5f, 12.0f, 9.5f);
                path3.cubicTo(12.476136f, 9.5f, 12.921185f, 9.633106f, 13.299963f, 9.864139f);
                instancePath.lineTo(13.3f, 3.819039f);
                instancePath.cubicTo(13.3f, 3.3655841f, 13.605117f, 2.9688869f, 14.043387f, 2.8525248f);
                instancePath.lineTo(19.17434f, 1.4902421f);
                instancePath.cubicTo(19.227718f, 1.4760698f, 19.282478f, 1.5078532f, 19.296652f, 1.5612323f);
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
