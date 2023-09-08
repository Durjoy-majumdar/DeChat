package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_chat_tips_icon_down */
public class game_chat_tips_icon_down extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 16;
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
            instancePaint3.setColor(-1);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(3.184f, 8.954f);
            instancePath.lineTo(3.968f, 8.17f);
            instancePath.lineTo(8.0f, 12.16f);
            instancePath.lineTo(12.018f, 8.17f);
            instancePath.lineTo(12.816f, 8.954f);
            instancePath.lineTo(8.518f, 13.196f);
            Path path = instancePath;
            path.cubicTo(8.36867f, 13.3453f, 8.19133f, 13.42f, 7.986f, 13.42f);
            path.cubicTo(7.79f, 13.42f, 7.622f, 13.3453f, 7.482f, 13.196f);
            instancePath.lineTo(3.184f, 8.954f);
            instancePath.close();
            instancePath.moveTo(3.212f, 4.474f);
            instancePath.lineTo(3.996f, 3.69f);
            instancePath.lineTo(8.014f, 7.68f);
            instancePath.lineTo(12.032f, 3.69f);
            instancePath.lineTo(12.83f, 4.474f);
            instancePath.lineTo(8.546f, 8.716f);
            Path path2 = instancePath;
            path2.cubicTo(8.39667f, 8.86533f, 8.21933f, 8.94f, 8.014f, 8.94f);
            path2.cubicTo(7.80867f, 8.94f, 7.636f, 8.86533f, 7.496f, 8.716f);
            instancePath.lineTo(3.212f, 4.474f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
