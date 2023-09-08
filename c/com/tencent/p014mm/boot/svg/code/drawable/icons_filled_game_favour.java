package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_game_favour */
public class icons_filled_game_favour extends C24542c {
    private final int height = 17;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 16;
        }
        if (i == 1) {
            return 17;
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
            instancePaint3.setColor(-1659136);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(2.43618f, 2.02016f);
            instancePath.cubicTo(2.39192f, 1.93924f, 2.27571f, 1.93924f, 2.23146f, 2.02016f);
            instancePath.lineTo(1.52526f, 3.3114f);
            instancePath.cubicTo(1.51455f, 3.33097f, 1.49845f, 3.34707f, 1.47888f, 3.35778f);
            instancePath.lineTo(0.187638f, 4.06398f);
            instancePath.cubicTo(0.106725f, 4.10823f, 0.106725f, 4.22444f, 0.187638f, 4.26869f);
            instancePath.lineTo(1.47888f, 4.9749f);
            instancePath.cubicTo(1.49845f, 4.9856f, 1.51455f, 5.0017f, 1.52526f, 5.02127f);
            instancePath.lineTo(2.23146f, 6.31252f);
            instancePath.cubicTo(2.27571f, 6.39343f, 2.39192f, 6.39343f, 2.43618f, 6.31252f);
            instancePath.lineTo(3.14238f, 5.02127f);
            instancePath.cubicTo(3.15308f, 5.0017f, 3.16918f, 4.9856f, 3.18876f, 4.9749f);
            instancePath.lineTo(4.48f, 4.26869f);
            instancePath.cubicTo(4.56091f, 4.22444f, 4.56091f, 4.10823f, 4.48f, 4.06398f);
            instancePath.lineTo(3.18876f, 3.35778f);
            Path path = instancePath;
            path.cubicTo(3.16918f, 3.34707f, 3.15308f, 3.33097f, 3.14238f, 3.3114f);
            instancePath.lineTo(2.43618f, 2.02016f);
            instancePath.close();
            instancePath.moveTo(9.65071f, 2.4668f);
            path.cubicTo(9.56391f, 2.24262f, 9.24671f, 2.24262f, 9.1599f, 2.4668f);
            instancePath.lineTo(7.57924f, 6.54916f);
            instancePath.cubicTo(7.55681f, 6.60709f, 7.51461f, 6.65521f, 7.4601f, 6.68502f);
            instancePath.lineTo(4.5643f, 8.26879f);
            instancePath.cubicTo(4.38179f, 8.36861f, 4.38179f, 8.63073f, 4.5643f, 8.73055f);
            instancePath.lineTo(7.4601f, 10.3143f);
            instancePath.cubicTo(7.51461f, 10.3441f, 7.55681f, 10.3923f, 7.57924f, 10.4502f);
            instancePath.lineTo(9.1599f, 14.5325f);
            instancePath.cubicTo(9.24671f, 14.7567f, 9.56391f, 14.7567f, 9.65071f, 14.5325f);
            instancePath.lineTo(11.2314f, 10.4502f);
            instancePath.cubicTo(11.2538f, 10.3923f, 11.296f, 10.3441f, 11.3505f, 10.3143f);
            instancePath.lineTo(14.2463f, 8.73055f);
            instancePath.cubicTo(14.4288f, 8.63073f, 14.4288f, 8.36861f, 14.2463f, 8.26879f);
            instancePath.lineTo(11.3505f, 6.68502f);
            instancePath.cubicTo(11.296f, 6.65521f, 11.2538f, 6.60709f, 11.2314f, 6.54916f);
            instancePath.lineTo(9.65071f, 2.4668f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
