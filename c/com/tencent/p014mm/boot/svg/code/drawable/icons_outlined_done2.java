package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_done2 */
public class icons_outlined_done2 extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.0f, 66.0f);
            Path path = instancePath;
            path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 62.4f);
            Path path2 = instancePath;
            path2.cubicTo(50.58032f, 62.4f, 62.4f, 50.58032f, 62.4f, 36.0f);
            path2.cubicTo(62.4f, 21.419683f, 50.58032f, 9.6f, 36.0f, 9.6f);
            path2.cubicTo(21.419683f, 9.6f, 9.6f, 21.419683f, 9.6f, 36.0f);
            path2.cubicTo(9.6f, 50.58032f, 21.419683f, 62.4f, 36.0f, 62.4f);
            instancePath.close();
            instancePath.moveTo(32.485283f, 43.674976f);
            instancePath.lineTo(49.91026f, 26.25f);
            instancePath.lineTo(52.455845f, 28.795584f);
            instancePath.lineTo(34.6066f, 46.64483f);
            instancePath.cubicTo(33.435028f, 47.8164f, 31.535534f, 47.8164f, 30.363962f, 46.64483f);
            instancePath.lineTo(21.0f, 37.280865f);
            instancePath.lineTo(23.545584f, 34.73528f);
            instancePath.lineTo(32.485283f, 43.674976f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
