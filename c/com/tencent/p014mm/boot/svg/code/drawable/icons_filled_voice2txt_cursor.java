package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_voice2txt_cursor */
public class icons_filled_voice2txt_cursor extends C24542c {
    private final int height = 10;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 24;
        }
        if (i == 1) {
            return 10;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.5f, -2.1316282E-14f);
            instancePath.lineTo(23.500662f, -2.1316282E-14f);
            instancePath.cubicTo(22.163176f, -2.1316282E-14f, 20.431269f, 1.6341983f, 19.457546f, 2.697338f);
            instancePath.lineTo(14.130131f, 8.638686f);
            Path path = instancePath;
            path.cubicTo(13.588587f, 9.242793f, 12.756226f, 9.584702f, 12.0f, 9.584702f);
            path.cubicTo(11.231155f, 9.584702f, 10.457203f, 9.293136f, 9.870531f, 8.638686f);
            instancePath.lineTo(4.6710873f, 2.8385649f);
            instancePath.cubicTo(3.727653f, 1.7861383f, 1.8982798f, -2.1316282E-14f, 0.5f, -2.1316282E-14f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
