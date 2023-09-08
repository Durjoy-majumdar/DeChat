package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.top_story_icon */
public class top_story_icon extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(32.0f, 0.0f);
        instancePath.lineTo(32.0f, 32.0f);
        instancePath.lineTo(0.0f, 32.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15616);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(16.790709f, 22.000523f);
        instancePath2.lineTo(20.811907f, 24.339336f);
        instancePath2.lineTo(17.113327f, 28.037678f);
        Path path = instancePath2;
        path.cubicTo(16.496899f, 28.654108f, 15.497373f, 28.654108f, 14.880942f, 28.037678f);
        instancePath2.lineTo(11.182602f, 24.339336f);
        instancePath2.lineTo(15.203562f, 22.000523f);
        path.cubicTo(15.694278f, 21.715284f, 16.299994f, 21.715284f, 16.790709f, 22.000523f);
        instancePath2.close();
        instancePath2.moveTo(6.3677835f, 15.999965f);
        instancePath2.lineTo(10.403744f, 18.313065f);
        instancePath2.cubicTo(10.896126f, 18.595207f, 11.199222f, 19.11997f, 11.197326f, 19.68759f);
        instancePath2.lineTo(11.182554f, 24.339266f);
        instancePath2.lineTo(6.1301637f, 22.985455f);
        instancePath2.cubicTo(5.2882576f, 22.759739f, 4.7884946f, 21.89426f, 5.0142093f, 21.052116f);
        instancePath2.lineTo(6.3677835f, 15.999965f);
        instancePath2.close();
        instancePath2.moveTo(25.626488f, 15.999965f);
        instancePath2.lineTo(26.980299f, 21.052355f);
        instancePath2.cubicTo(27.205776f, 21.894499f, 26.706013f, 22.759739f, 25.864107f, 22.985455f);
        instancePath2.lineTo(20.811716f, 24.339266f);
        instancePath2.lineTo(20.796947f, 19.68759f);
        instancePath2.cubicTo(20.795286f, 19.11997f, 21.098145f, 18.595207f, 21.590527f, 18.313065f);
        instancePath2.lineTo(25.626488f, 15.999965f);
        instancePath2.close();
        instancePath2.moveTo(11.182554f, 7.6608534f);
        instancePath2.lineTo(11.197326f, 12.312529f);
        instancePath2.cubicTo(11.199222f, 12.87991f, 10.896126f, 13.404674f, 10.403744f, 13.687055f);
        instancePath2.lineTo(6.3677835f, 15.999917f);
        instancePath2.lineTo(5.0142093f, 10.947764f);
        instancePath2.cubicTo(4.7884946f, 10.105619f, 5.2882576f, 9.240142f, 6.1301637f, 9.014427f);
        instancePath2.lineTo(11.182554f, 7.6608534f);
        instancePath2.close();
        instancePath2.moveTo(20.811716f, 7.6608768f);
        instancePath2.lineTo(25.864107f, 9.014451f);
        instancePath2.cubicTo(26.706013f, 9.240166f, 27.205776f, 10.105643f, 26.980299f, 10.947788f);
        instancePath2.lineTo(25.626488f, 15.999941f);
        instancePath2.lineTo(21.590527f, 13.687078f);
        Path path2 = instancePath2;
        path2.cubicTo(21.098145f, 13.404697f, 20.795286f, 12.879934f, 20.796947f, 12.312552f);
        instancePath2.lineTo(20.811716f, 7.6608768f);
        instancePath2.close();
        instancePath2.moveTo(17.113327f, 3.9623222f);
        instancePath2.lineTo(20.811907f, 7.6609006f);
        instancePath2.lineTo(16.790709f, 9.999476f);
        path2.cubicTo(16.299994f, 10.284716f, 15.694278f, 10.284716f, 15.203562f, 9.999476f);
        instancePath2.lineTo(11.182602f, 7.6609006f);
        instancePath2.lineTo(14.881181f, 3.9623222f);
        path2.cubicTo(15.497373f, 3.3458927f, 16.496899f, 3.3458927f, 17.113327f, 3.9623222f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
