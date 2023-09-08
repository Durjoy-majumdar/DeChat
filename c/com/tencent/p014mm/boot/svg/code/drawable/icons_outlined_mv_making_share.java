package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_mv_making_share */
public class icons_outlined_mv_making_share extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(13.5f, 4.5f);
        instancePath.lineTo(13.5f, 5.7f);
        instancePath.lineTo(4.7f, 5.7f);
        instancePath.lineTo(4.7f, 19.3f);
        instancePath.lineTo(18.3f, 19.3f);
        instancePath.lineTo(18.3f, 10.5f);
        instancePath.lineTo(19.5f, 10.5f);
        instancePath.lineTo(19.5f, 19.5f);
        instancePath.cubicTo(19.5f, 20.052284f, 19.052284f, 20.5f, 18.5f, 20.5f);
        instancePath.lineTo(4.5f, 20.5f);
        instancePath.cubicTo(3.9477153f, 20.5f, 3.5f, 20.052284f, 3.5f, 19.5f);
        instancePath.lineTo(3.5f, 5.5f);
        instancePath.cubicTo(3.5f, 4.9477153f, 3.9477153f, 4.5f, 4.5f, 4.5f);
        instancePath.lineTo(13.5f, 4.5f);
        instancePath.close();
        instancePath.moveTo(9.885072f, 9.5f);
        instancePath.cubicTo(9.952085f, 9.5f, 10.017937f, 9.5187235f, 10.07612f, 9.554318f);
        instancePath.lineTo(10.07612f, 9.554318f);
        instancePath.lineTo(14.305912f, 12.14202f);
        instancePath.lineTo(14.34122f, 12.166408f);
        Path path = instancePath;
        path.cubicTo(14.49836f, 12.2883215f, 14.547677f, 12.519997f, 14.449199f, 12.704505f);
        path.cubicTo(14.415085f, 12.768418f, 14.36561f, 12.821387f, 14.305912f, 12.857909f);
        instancePath.lineTo(14.305912f, 12.857909f);
        instancePath.lineTo(10.07612f, 15.445611f);
        instancePath.lineTo(10.038569f, 15.465797f);
        Path path2 = instancePath;
        path2.cubicTo(9.860685f, 15.548844f, 9.649215f, 15.476714f, 9.550735f, 15.292206f);
        path2.cubicTo(9.5174885f, 15.229914f, 9.5f, 15.159411f, 9.5f, 15.0876665f);
        instancePath.lineTo(9.5f, 15.0876665f);
        instancePath.lineTo(9.5f, 9.912263f);
        instancePath.lineTo(9.501988f, 9.870111f);
        instancePath.cubicTo(9.521708f, 9.662226f, 9.685694f, 9.5f, 9.885072f, 9.5f);
        instancePath.close();
        instancePath.moveTo(19.5f, 1.5f);
        instancePath.lineTo(19.499f, 4.499f);
        instancePath.lineTo(22.5f, 4.5f);
        instancePath.lineTo(22.5f, 5.7f);
        instancePath.lineTo(19.499f, 5.699f);
        instancePath.lineTo(19.5f, 8.7f);
        instancePath.lineTo(18.3f, 8.7f);
        instancePath.lineTo(18.299f, 5.699f);
        instancePath.lineTo(15.3f, 5.7f);
        instancePath.lineTo(15.3f, 4.5f);
        instancePath.lineTo(18.299f, 4.499f);
        instancePath.lineTo(18.3f, 1.5f);
        instancePath.lineTo(19.5f, 1.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
