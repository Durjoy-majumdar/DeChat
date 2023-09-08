package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_chats */
public class icons_outlined_chats extends C24542c {
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
            instancePath.moveTo(26.00236f, 54.803513f);
            instancePath.lineTo(27.321718f, 55.185577f);
            Path path = instancePath;
            path.cubicTo(30.085625f, 55.985954f, 33.006626f, 56.4f, 36.0f, 56.4f);
            path.cubicTo(50.69829f, 56.4f, 62.4f, 46.45355f, 62.4f, 34.5f);
            path.cubicTo(62.4f, 22.546453f, 50.69829f, 12.6f, 36.0f, 12.6f);
            path.cubicTo(21.30171f, 12.6f, 9.6f, 22.546453f, 9.6f, 34.5f);
            path.cubicTo(9.6f, 40.72777f, 12.770791f, 46.57829f, 18.301785f, 50.73409f);
            instancePath.lineTo(19.95378f, 51.97534f);
            instancePath.lineTo(19.24858f, 58.042023f);
            instancePath.lineTo(26.00236f, 54.803513f);
            instancePath.close();
            instancePath.moveTo(36.0f, 60.0f);
            instancePath.cubicTo(32.61305f, 60.0f, 29.357191f, 59.52292f, 26.320362f, 58.64351f);
            instancePath.lineTo(17.371504f, 62.934578f);
            Path path2 = instancePath;
            path2.cubicTo(17.116058f, 63.057068f, 16.831148f, 63.104713f, 16.54975f, 63.072006f);
            path2.cubicTo(15.726863f, 62.976353f, 15.137323f, 62.231728f, 15.232977f, 61.40884f);
            instancePath.lineTo(16.139269f, 53.6122f);
            Path path3 = instancePath;
            path3.cubicTo(9.920994f, 48.94f, 6.0f, 42.109215f, 6.0f, 34.5f);
            path3.cubicTo(6.0f, 20.416739f, 19.431458f, 9.0f, 36.0f, 9.0f);
            path3.cubicTo(52.568542f, 9.0f, 66.0f, 20.416739f, 66.0f, 34.5f);
            path3.cubicTo(66.0f, 48.58326f, 52.568542f, 60.0f, 36.0f, 60.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
