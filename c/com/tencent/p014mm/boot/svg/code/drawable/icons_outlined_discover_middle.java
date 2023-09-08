package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_discover_middle */
public class icons_outlined_discover_middle extends C24542c {
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
            instancePaint3.setColor(-16726153);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.0f, 62.4f);
            Path path = instancePath;
            path.cubicTo(50.58032f, 62.4f, 62.4f, 50.58032f, 62.4f, 36.0f);
            path.cubicTo(62.4f, 21.419683f, 50.58032f, 9.6f, 36.0f, 9.6f);
            path.cubicTo(21.419683f, 9.6f, 9.6f, 21.419683f, 9.6f, 36.0f);
            path.cubicTo(9.6f, 50.58032f, 21.419683f, 62.4f, 36.0f, 62.4f);
            instancePath.close();
            instancePath.moveTo(36.0f, 66.0f);
            Path path2 = instancePath;
            path2.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            path2.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            path2.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            path2.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(33.370068f, 33.370068f);
            instancePath2.lineTo(27.802084f, 44.197914f);
            instancePath2.lineTo(38.629932f, 38.629932f);
            instancePath2.lineTo(44.197914f, 27.802084f);
            instancePath2.lineTo(33.370068f, 33.370068f);
            instancePath2.close();
            instancePath2.moveTo(30.6967f, 30.6967f);
            instancePath2.lineTo(48.37305f, 21.607025f);
            Path path3 = instancePath2;
            path3.cubicTo(48.803566f, 21.385643f, 49.314457f, 21.385643f, 49.744972f, 21.607025f);
            path3.cubicTo(50.4817f, 21.985872f, 50.77182f, 22.890223f, 50.392975f, 23.62695f);
            instancePath2.lineTo(41.303303f, 41.303303f);
            instancePath2.lineTo(23.62695f, 50.392975f);
            Path path4 = instancePath2;
            path4.cubicTo(23.196436f, 50.614357f, 22.685541f, 50.614357f, 22.255028f, 50.392975f);
            path4.cubicTo(21.518301f, 50.01413f, 21.22818f, 49.10978f, 21.607025f, 48.37305f);
            instancePath2.lineTo(30.6967f, 30.6967f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
