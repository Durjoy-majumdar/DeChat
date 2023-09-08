package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_pay_minifund */
public class icons_filled_pay_minifund extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(19.604445f, 26.17499f);
        instancePath.lineTo(36.0f, 66.0f);
        instancePath.lineTo(6.2137012f, 27.233997f);
        Path path = instancePath;
        path.cubicTo(5.992266f, 26.945807f, 6.0463824f, 26.532673f, 6.334574f, 26.311237f);
        path.cubicTo(6.44956f, 26.222887f, 6.590509f, 26.17499f, 6.735518f, 26.17499f);
        instancePath.lineTo(19.604445f, 26.17499f);
        instancePath.close();
        instancePath.moveTo(65.26448f, 26.17499f);
        Path path2 = instancePath;
        path2.cubicTo(65.40949f, 26.17499f, 65.55044f, 26.222887f, 65.66543f, 26.311237f);
        path2.cubicTo(65.95362f, 26.532673f, 66.00774f, 26.945807f, 65.7863f, 27.233997f);
        instancePath.lineTo(65.7863f, 27.233997f);
        instancePath.lineTo(36.0f, 66.0f);
        instancePath.lineTo(52.697777f, 26.17499f);
        instancePath.close();
        instancePath.moveTo(47.9f, 26.17499f);
        instancePath.lineTo(36.0f, 66.0f);
        instancePath.lineTo(24.1f, 26.17499f);
        instancePath.lineTo(47.9f, 26.17499f);
        instancePath.close();
        instancePath.moveTo(29.2f, 12.0f);
        instancePath.lineTo(19.927273f, 22.125f);
        instancePath.lineTo(7.422167f, 22.125f);
        Path path3 = instancePath;
        path3.cubicTo(7.211729f, 22.125f, 7.0139832f, 22.024357f, 6.8901353f, 21.854223f);
        path3.cubicTo(6.6762424f, 21.56039f, 6.7410464f, 21.148798f, 7.034879f, 20.934904f);
        instancePath.lineTo(7.034879f, 20.934904f);
        instancePath.lineTo(19.135954f, 12.126033f);
        instancePath.cubicTo(19.248474f, 12.044126f, 19.384068f, 12.0f, 19.523241f, 12.0f);
        instancePath.lineTo(19.523241f, 12.0f);
        instancePath.lineTo(29.2f, 12.0f);
        instancePath.close();
        instancePath.moveTo(39.4f, 12.0f);
        instancePath.lineTo(47.9f, 22.125f);
        instancePath.lineTo(24.1f, 22.125f);
        instancePath.lineTo(32.6f, 12.0f);
        instancePath.lineTo(39.4f, 12.0f);
        instancePath.close();
        instancePath.moveTo(51.51333f, 12.0f);
        instancePath.cubicTo(51.65526f, 12.0f, 51.793385f, 12.045888f, 51.9071f, 12.130816f);
        instancePath.lineTo(63.70182f, 20.939688f);
        Path path4 = instancePath;
        path4.cubicTo(63.99301f, 21.157164f, 64.05277f, 21.569519f, 63.835293f, 21.86071f);
        path4.cubicTo(63.71107f, 22.02704f, 63.515644f, 22.125f, 63.308044f, 22.125f);
        instancePath.lineTo(51.43068f, 22.125f);
        instancePath.lineTo(41.488907f, 12.0f);
        instancePath.lineTo(51.51333f, 12.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
