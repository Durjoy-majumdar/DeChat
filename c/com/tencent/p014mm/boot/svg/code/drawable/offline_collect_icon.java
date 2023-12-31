package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.offline_collect_icon */
public class offline_collect_icon extends C24542c {
    private final int height = 73;
    private final int width = 68;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 68;
        }
        if (i == 1) {
            return 73;
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
            instancePaint3.setColor(-2115775);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(45.02786f, 19.699146f);
            Path path = instancePath;
            path.cubicTo(47.790768f, 16.894377f, 53.183926f, 9.984685f, 51.000412f, 7.6524725f);
            path.cubicTo(48.730103f, 5.2275586f, 44.949017f, 8.090303f, 40.595642f, 8.090303f);
            path.cubicTo(35.52866f, 8.090303f, 30.163124f, 4.05f, 25.084188f, 4.05f);
            path.cubicTo(20.005253f, 4.05f, 17.508955f, 5.9924593f, 17.103004f, 7.6524725f);
            path.cubicTo(15.994337f, 12.186032f, 20.433609f, 17.720968f, 22.574883f, 19.639809f);
            path.cubicTo(12.409413f, 24.923576f, 5.4f, 36.815495f, 5.4f, 47.60502f);
            path.cubicTo(5.4f, 62.00375f, 17.88318f, 68.98671f, 33.69146f, 68.98671f);
            path.cubicTo(49.499737f, 68.98671f, 62.646835f, 62.00375f, 62.646835f, 47.60502f);
            path.cubicTo(62.646835f, 36.855694f, 55.319534f, 25.01218f, 45.02786f, 19.699146f);
            instancePath.close();
            instancePath.moveTo(40.52908f, 17.868376f);
            Path path2 = instancePath;
            path2.cubicTo(42.654507f, 16.605152f, 45.585922f, 12.036678f, 45.00239f, 11.457223f);
            path2.cubicTo(44.324272f, 10.783839f, 42.947887f, 12.130608f, 40.303074f, 12.130608f);
            path2.cubicTo(34.199993f, 12.130608f, 27.791922f, 8.090303f, 24.706308f, 8.090303f);
            path2.cubicTo(21.620693f, 8.090303f, 21.315706f, 9.409305f, 21.315706f, 10.783839f);
            path2.cubicTo(21.315706f, 12.656585f, 25.16565f, 16.920174f, 26.480436f, 17.998384f);
            path2.cubicTo(28.776915f, 17.253117f, 31.192646f, 16.844296f, 33.69146f, 16.844296f);
            path2.cubicTo(36.04092f, 16.844296f, 38.331604f, 17.20571f, 40.52908f, 17.868376f);
            instancePath.close();
            instancePath.moveTo(33.790348f, 63.98117f);
            Path path3 = instancePath;
            path3.cubicTo(46.243694f, 63.98117f, 58.293385f, 59.720745f, 58.293385f, 47.819958f);
            path3.cubicTo(58.293385f, 35.919167f, 46.243694f, 21.557983f, 33.790348f, 21.557983f);
            path3.cubicTo(21.337004f, 21.557983f, 10.146842f, 35.919167f, 10.146842f, 47.819958f);
            path3.cubicTo(10.146842f, 59.720745f, 21.337004f, 63.98117f, 33.790348f, 63.98117f);
            instancePath.close();
            instancePath.moveTo(20.487278f, 43.41178f);
            path3.cubicTo(20.300562f, 43.21989f, 20.275011f, 42.89434f, 20.42848f, 42.686977f);
            instancePath.lineTo(21.473255f, 41.2753f);
            instancePath.cubicTo(21.627497f, 41.06689f, 21.917448f, 41.018803f, 22.133364f, 41.177032f);
            instancePath.lineTo(29.26747f, 46.405273f);
            instancePath.cubicTo(29.477795f, 46.55941f, 29.811935f, 46.54795f, 30.008999f, 46.38367f);
            instancePath.lineTo(45.82105f, 33.202114f);
            instancePath.cubicTo(46.02026f, 33.036045f, 46.329716f, 33.046528f, 46.52178f, 33.234882f);
            instancePath.lineTo(47.44506f, 34.140343f);
            Path path4 = instancePath;
            path4.cubicTo(47.63285f, 34.324512f, 47.63874f, 34.634953f, 47.46383f, 34.82707f);
            path4.cubicTo(47.46383f, 34.82707f, 42.825367f, 39.949135f, 39.71318f, 42.9906f);
            path4.cubicTo(36.600994f, 46.032063f, 29.990932f, 52.491913f, 29.990932f, 52.491913f);
            path4.cubicTo(29.8017f, 52.676846f, 29.49909f, 52.673416f, 29.31022f, 52.479313f);
            instancePath.lineTo(20.487278f, 43.41178f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
