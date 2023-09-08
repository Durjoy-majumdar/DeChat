package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_chat_tips_icon_up */
public class game_chat_tips_icon_up extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.816f, 11.328f);
        instancePath.lineTo(12.032f, 12.112f);
        instancePath.lineTo(8.0f, 8.122f);
        instancePath.lineTo(3.982f, 12.112f);
        instancePath.lineTo(3.184f, 11.328f);
        instancePath.lineTo(7.482f, 7.086f);
        Path path = instancePath;
        path.cubicTo(7.63133f, 6.93667f, 7.804f, 6.862f, 8.0f, 6.862f);
        path.cubicTo(8.20533f, 6.862f, 8.378f, 6.93667f, 8.518f, 7.086f);
        instancePath.lineTo(12.816f, 11.328f);
        instancePath.close();
        instancePath.moveTo(12.816f, 6.764f);
        instancePath.lineTo(12.032f, 7.548f);
        instancePath.lineTo(8.014f, 3.558f);
        instancePath.lineTo(3.996f, 7.548f);
        instancePath.lineTo(3.198f, 6.764f);
        instancePath.lineTo(7.482f, 2.522f);
        Path path2 = instancePath;
        path2.cubicTo(7.63133f, 2.37267f, 7.80867f, 2.298f, 8.014f, 2.298f);
        path2.cubicTo(8.21933f, 2.298f, 8.392f, 2.37267f, 8.532f, 2.522f);
        instancePath.lineTo(12.816f, 6.764f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
