package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_filled_lock */
public class finder_icons_filled_lock extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.0f, 2.0f);
        Path path = instancePath;
        path.cubicTo(14.485281f, 2.0f, 16.5f, 4.0147185f, 16.5f, 6.5f);
        instancePath.lineTo(16.5f, 9.0f);
        instancePath.lineTo(18.999128f, 9.0f);
        path.cubicTo(19.551895f, 9.0f, 20.0f, 9.44749f, 20.0f, 9.998503f);
        instancePath.lineTo(20.0f, 21.001497f);
        instancePath.cubicTo(20.0f, 21.552956f, 19.555368f, 22.0f, 18.999128f, 22.0f);
        instancePath.lineTo(5.0008717f, 22.0f);
        Path path2 = instancePath;
        path2.cubicTo(4.4481053f, 22.0f, 4.0f, 21.552511f, 4.0f, 21.001497f);
        instancePath.lineTo(4.0f, 9.998503f);
        path2.cubicTo(4.0f, 9.447044f, 4.4446306f, 9.0f, 5.0008717f, 9.0f);
        instancePath.lineTo(7.5f, 9.0f);
        instancePath.lineTo(7.5f, 6.5f);
        path2.cubicTo(7.5f, 4.0147185f, 9.514719f, 2.0f, 12.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 13.0f);
        path2.cubicTo(11.171573f, 13.0f, 10.5f, 13.671573f, 10.5f, 14.5f);
        path2.cubicTo(10.5f, 15.11479f, 10.869861f, 15.643195f, 11.399211f, 15.874842f);
        instancePath.lineTo(11.4f, 18.0f);
        instancePath.lineTo(12.599999f, 18.0f);
        instancePath.lineTo(12.599782f, 15.875282f);
        Path path3 = instancePath;
        path3.cubicTo(13.12967f, 15.643866f, 13.5f, 15.11518f, 13.5f, 14.5f);
        path3.cubicTo(13.5f, 13.671573f, 12.828427f, 13.0f, 12.0f, 13.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 3.5f);
        path3.cubicTo(10.343145f, 3.5f, 9.0f, 4.843146f, 9.0f, 6.5f);
        instancePath.lineTo(9.0f, 9.0f);
        instancePath.lineTo(15.0f, 9.0f);
        instancePath.lineTo(15.0f, 6.5f);
        path3.cubicTo(15.0f, 4.843146f, 13.656855f, 3.5f, 12.0f, 3.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
