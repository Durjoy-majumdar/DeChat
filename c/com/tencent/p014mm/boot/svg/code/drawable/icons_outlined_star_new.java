package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_star_new */
public class icons_outlined_star_new extends C24542c {
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
            instancePaint4.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(46.962925f, 20.391665f);
            instancePath.lineTo(46.431343f, 28.663982f);
            instancePath.lineTo(58.458202f, 28.663982f);
            instancePath.cubicTo(62.498623f, 28.663982f, 65.536125f, 32.81999f, 64.92497f, 36.953964f);
            instancePath.lineTo(64.845406f, 37.396618f);
            instancePath.lineTo(60.559032f, 57.62854f);
            instancePath.cubicTo(59.92328f, 60.605885f, 57.498554f, 62.76747f, 54.628498f, 62.976185f);
            instancePath.lineTo(54.17183f, 62.992744f);
            instancePath.lineTo(13.05f, 62.97731f);
            instancePath.cubicTo(11.393586f, 62.975563f, 10.0511265f, 61.6326f, 10.05f, 59.976185f);
            instancePath.lineTo(10.05f, 34.23547f);
            instancePath.cubicTo(10.05f, 32.578617f, 11.393146f, 31.23547f, 13.05f, 31.23547f);
            instancePath.lineTo(20.373611f, 31.23547f);
            instancePath.lineTo(24.159416f, 31.146284f);
            instancePath.lineTo(25.41086f, 31.091139f);
            instancePath.lineTo(25.914228f, 31.047783f);
            Path path = instancePath;
            path.cubicTo(25.949434f, 31.042871f, 25.977732f, 31.037928f, 25.99912f, 31.032951f);
            path.cubicTo(30.064634f, 30.087223f, 33.16942f, 23.813648f, 33.739548f, 18.203745f);
            instancePath.lineTo(33.77049f, 17.723846f);
            instancePath.lineTo(33.835743f, 16.006575f);
            instancePath.lineTo(33.902138f, 15.181364f);
            Path path2 = instancePath;
            path2.cubicTo(34.121975f, 13.057724f, 34.799442f, 10.561272f, 37.143444f, 9.532442f);
            path2.cubicTo(43.304684f, 6.828153f, 47.301086f, 15.0369625f, 46.962925f, 20.391665f);
            instancePath.close();
            instancePath.moveTo(38.59032f, 12.828888f);
            instancePath.cubicTo(38.11093f, 13.039301f, 37.74496f, 13.712654f, 37.55388f, 14.9706745f);
            instancePath.lineTo(37.490543f, 15.470076f);
            instancePath.lineTo(37.433147f, 16.143272f);
            instancePath.lineTo(37.36303f, 17.955486f);
            instancePath.lineTo(37.3211f, 18.567734f);
            instancePath.cubicTo(36.563286f, 26.024414f, 32.47689f, 33.2222f, 26.814781f, 34.53933f);
            instancePath.lineTo(26.522924f, 34.593815f);
            instancePath.lineTo(25.913412f, 34.661156f);
            instancePath.lineTo(25.368773f, 34.69824f);
            instancePath.lineTo(24.599f, 34.729f);
            instancePath.lineTo(24.599f, 59.38f);
            instancePath.lineTo(54.041367f, 59.39511f);
            instancePath.lineTo(54.36739f, 59.385666f);
            instancePath.cubicTo(55.5133f, 59.302334f, 56.532146f, 58.472706f, 56.935238f, 57.258003f);
            instancePath.lineTo(57.037205f, 56.8824f);
            instancePath.lineTo(61.30219f, 36.75975f);
            instancePath.lineTo(61.363678f, 36.42747f);
            instancePath.cubicTo(61.659916f, 34.423664f, 60.301155f, 32.50366f, 58.750786f, 32.284706f);
            instancePath.lineTo(58.458202f, 32.263985f);
            instancePath.lineTo(42.592583f, 32.263985f);
            instancePath.lineTo(43.370083f, 20.16477f);
            instancePath.cubicTo(43.6445f, 15.819415f, 40.781006f, 11.8673525f, 38.59032f, 12.828888f);
            instancePath.close();
            instancePath.moveTo(20.999f, 34.821f);
            instancePath.lineTo(20.373611f, 34.835472f);
            instancePath.lineTo(13.647f, 34.833f);
            instancePath.lineTo(13.647f, 59.376f);
            instancePath.lineTo(20.999f, 59.379f);
            instancePath.lineTo(20.999f, 34.821f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
