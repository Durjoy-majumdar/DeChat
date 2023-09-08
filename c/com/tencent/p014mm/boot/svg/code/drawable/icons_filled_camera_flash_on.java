package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_camera_flash_on */
public class icons_filled_camera_flash_on extends C24542c {
    private final int height = 30;
    private final int width = 30;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 30;
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
        instancePath.moveTo(18.25001f, 3.5f);
        Path path = instancePath;
        path.cubicTo(18.25001f, 3.2887099f, 18.11711f, 3.10021f, 17.918108f, 3.02911f);
        path.cubicTo(17.719109f, 2.9581099f, 17.496908f, 3.01981f, 17.363008f, 3.18341f);
        instancePath.lineTo(6.1130085f, 16.93341f);
        path.cubicTo(5.990709f, 17.08291f, 5.965409f, 17.28961f, 6.0482087f, 17.46411f);
        path.cubicTo(6.1309085f, 17.63871f, 6.3068085f, 17.75001f, 6.5f, 17.75001f);
        instancePath.lineTo(11.0f, 17.75001f);
        instancePath.lineTo(11.0f, 26.0f);
        path.cubicTo(11.0f, 26.21141f, 11.132909f, 26.39991f, 11.331908f, 26.47091f);
        path.cubicTo(11.530909f, 26.54201f, 11.753208f, 26.48021f, 11.887009f, 26.31661f);
        instancePath.lineTo(23.137009f, 12.56661f);
        path.cubicTo(23.259308f, 12.4171095f, 23.284609f, 12.21051f, 23.201809f, 12.03591f);
        path.cubicTo(23.119108f, 11.86131f, 22.943209f, 11.75001f, 22.75001f, 11.75001f);
        instancePath.lineTo(18.25001f, 11.75001f);
        instancePath.lineTo(18.25001f, 3.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-419430401);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(18.25001f, 3.5f);
        Path path2 = instancePath2;
        path2.cubicTo(18.25001f, 3.2887099f, 18.11711f, 3.10021f, 17.918108f, 3.02911f);
        path2.cubicTo(17.719109f, 2.9581099f, 17.496908f, 3.01981f, 17.363008f, 3.18341f);
        instancePath2.lineTo(6.1130085f, 16.93341f);
        Path path3 = instancePath2;
        path3.cubicTo(5.990709f, 17.08291f, 5.965409f, 17.28961f, 6.0482087f, 17.46411f);
        path3.cubicTo(6.1309085f, 17.63871f, 6.3068085f, 17.75001f, 6.5f, 17.75001f);
        instancePath2.lineTo(11.0f, 17.75001f);
        instancePath2.lineTo(11.0f, 26.0f);
        Path path4 = instancePath2;
        path4.cubicTo(11.0f, 26.21141f, 11.132909f, 26.39991f, 11.331908f, 26.47091f);
        path4.cubicTo(11.530909f, 26.54201f, 11.753208f, 26.48021f, 11.887009f, 26.31661f);
        instancePath2.lineTo(23.137009f, 12.56661f);
        Path path5 = instancePath2;
        path5.cubicTo(23.259308f, 12.4171095f, 23.284609f, 12.21051f, 23.201809f, 12.03591f);
        path5.cubicTo(23.119108f, 11.86131f, 22.943209f, 11.75001f, 22.75001f, 11.75001f);
        instancePath2.lineTo(18.25001f, 11.75001f);
        instancePath2.lineTo(18.25001f, 3.5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
