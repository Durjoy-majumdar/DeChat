package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_play */
public class icons_outlined_play extends C24542c {
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
            instancePath.moveTo(32.1f, 44.504707f);
            instancePath.lineTo(45.707535f, 36.0f);
            instancePath.lineTo(32.1f, 27.49529f);
            instancePath.lineTo(32.1f, 44.504707f);
            instancePath.close();
            instancePath.moveTo(30.794998f, 22.434374f);
            instancePath.lineTo(50.464806f, 34.728f);
            Path path3 = instancePath;
            path3.cubicTo(51.16731f, 35.16707f, 51.380867f, 36.092495f, 50.941803f, 36.795f);
            path3.cubicTo(50.821083f, 36.98815f, 50.65796f, 37.151276f, 50.464806f, 37.272f);
            instancePath.lineTo(30.794998f, 49.565624f);
            Path path4 = instancePath;
            path4.cubicTo(30.092493f, 50.004692f, 29.167068f, 49.79113f, 28.728003f, 49.088627f);
            path4.cubicTo(28.579004f, 48.85023f, 28.5f, 48.574757f, 28.5f, 48.29363f);
            instancePath.lineTo(28.5f, 23.706371f);
            Path path5 = instancePath;
            path5.cubicTo(28.5f, 22.877945f, 29.171574f, 22.206371f, 30.0f, 22.206371f);
            path5.cubicTo(30.28113f, 22.206371f, 30.5566f, 22.285376f, 30.794998f, 22.434374f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
