package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_full_share_new */
public class finder_full_share_new extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(39.01172f, 8.992188f);
            instancePath.cubicTo(39.80078f, 8.992188f, 40.558594f, 9.304688f, 41.121094f, 9.863281f);
            instancePath.lineTo(62.63672f, 31.171875f);
            instancePath.cubicTo(63.722656f, 32.25f, 63.8125f, 33.94922f, 62.90625f, 35.132812f);
            instancePath.lineTo(62.63672f, 35.433594f);
            instancePath.lineTo(41.121094f, 56.746094f);
            Path path = instancePath;
            path.cubicTo(39.945312f, 57.910156f, 38.046875f, 57.902344f, 36.878906f, 56.726562f);
            path.cubicTo(36.32422f, 56.164062f, 36.01172f, 55.402344f, 36.01172f, 54.61328f);
            instancePath.lineTo(36.01172f, 44.765625f);
            Path path2 = instancePath;
            path2.cubicTo(28.996094f, 45.328125f, 18.753906f, 49.472656f, 13.425781f, 62.464844f);
            path2.cubicTo(12.542969f, 64.625f, 10.371094f, 64.60547f, 9.898438f, 61.808594f);
            path2.cubicTo(6.160156f, 39.66797f, 18.753906f, 24.644531f, 36.01172f, 21.925781f);
            instancePath.lineTo(36.01172f, 11.992188f);
            instancePath.cubicTo(36.01172f, 10.335938f, 37.35547f, 8.992188f, 39.01172f, 8.992188f);
            instancePath.close();
            instancePath.moveTo(40.507812f, 15.589844f);
            instancePath.lineTo(40.51172f, 25.773438f);
            instancePath.lineTo(36.710938f, 26.371094f);
            instancePath.cubicTo(23.515625f, 28.449219f, 14.644531f, 38.210938f, 13.8125f, 52.08203f);
            instancePath.lineTo(13.777344f, 52.660156f);
            instancePath.lineTo(13.914062f, 52.48047f);
            instancePath.cubicTo(19.324219f, 45.26953f, 26.832031f, 41.23828f, 34.765625f, 40.36328f);
            instancePath.lineTo(35.652344f, 40.277344f);
            instancePath.lineTo(40.51172f, 39.88672f);
            instancePath.lineTo(40.507812f, 51.015625f);
            instancePath.lineTo(58.39453f, 33.304688f);
            instancePath.close();
            instancePath.moveTo(40.507812f, 15.589844f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
