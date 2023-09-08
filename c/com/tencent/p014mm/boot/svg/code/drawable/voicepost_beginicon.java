package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voicepost_beginicon */
public class voicepost_beginicon extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
                instancePaint3.setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-15028967);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(29.278912f, 21.516287f);
                instancePath.lineTo(52.24126f, 35.468605f);
                Path path = instancePath;
                path.cubicTo(52.949238f, 35.898785f, 53.17444f, 36.82145f, 52.74426f, 37.52943f);
                path.cubicTo(52.61935f, 37.735f, 52.44683f, 37.90752f, 52.24126f, 38.03243f);
                instancePath.lineTo(29.278912f, 51.98475f);
                Path path2 = instancePath;
                path2.cubicTo(28.57093f, 52.41493f, 27.64827f, 52.189728f, 27.218088f, 51.481747f);
                path2.cubicTo(27.07544f, 51.24698f, 27.0f, 50.977547f, 27.0f, 50.702835f);
                instancePath.lineTo(27.0f, 22.798197f);
                Path path3 = instancePath;
                path3.cubicTo(27.0f, 21.96977f, 27.671574f, 21.298197f, 28.5f, 21.298197f);
                path3.cubicTo(28.77471f, 21.298197f, 29.044144f, 21.373636f, 29.278912f, 21.516287f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                instancePaint5.setColor(-15028967);
                instancePaint5.setStrokeWidth(3.6f);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(36.0f, 1.7999992f);
                Path path4 = instancePath2;
                path4.cubicTo(54.888138f, 1.7999992f, 70.2f, 17.11186f, 70.2f, 36.0f);
                path4.cubicTo(70.2f, 54.888138f, 54.888138f, 70.2f, 36.0f, 70.2f);
                path4.cubicTo(17.11186f, 70.2f, 1.7999992f, 54.888138f, 1.7999992f, 36.0f);
                path4.cubicTo(1.7999992f, 17.11186f, 17.11186f, 1.7999992f, 36.0f, 1.7999992f);
                instancePath2.close();
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
