package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_star_new_bold */
public class icons_outlined_star_new_bold extends C24542c {
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
            instancePaint3.setColor(-2565928);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-436207616);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(41.72253f, 9.320517f);
            instancePath2.cubicTo(45.940704f, 10.273167f, 49.408337f, 14.231492f, 49.408337f, 20.391665f);
            instancePath2.lineTo(48.876755f, 28.663982f);
            instancePath2.lineTo(58.458202f, 28.663982f);
            instancePath2.cubicTo(62.498623f, 28.663982f, 65.536125f, 32.81999f, 64.92497f, 36.953964f);
            instancePath2.lineTo(64.845406f, 37.396618f);
            instancePath2.lineTo(60.559032f, 57.62854f);
            instancePath2.cubicTo(59.92328f, 60.605885f, 57.498554f, 62.76747f, 54.628498f, 62.976185f);
            instancePath2.lineTo(54.17183f, 62.992744f);
            instancePath2.lineTo(13.05f, 62.97731f);
            instancePath2.cubicTo(11.393586f, 62.975563f, 10.0511265f, 61.6326f, 10.05f, 59.976185f);
            instancePath2.lineTo(10.05f, 34.23547f);
            instancePath2.cubicTo(10.05f, 32.578617f, 11.393146f, 31.23547f, 13.05f, 31.23547f);
            instancePath2.lineTo(19.528627f, 31.23547f);
            instancePath2.lineTo(23.314432f, 31.146284f);
            instancePath2.lineTo(24.565876f, 31.091139f);
            instancePath2.lineTo(25.069244f, 31.047783f);
            instancePath2.lineTo(25.154137f, 31.032951f);
            instancePath2.cubicTo(29.21965f, 30.087223f, 32.324432f, 23.813648f, 32.89456f, 18.203745f);
            instancePath2.lineTo(32.925507f, 17.723846f);
            instancePath2.lineTo(32.99076f, 16.006575f);
            instancePath2.lineTo(32.99076f, 15.143202f);
            Path path = instancePath2;
            path.cubicTo(33.210598f, 13.019561f, 34.468346f, 10.805619f, 36.711006f, 9.74678f);
            path.cubicTo(38.532307f, 8.886881f, 40.33807f, 9.007844f, 41.72253f, 9.320517f);
            instancePath2.close();
            instancePath2.moveTo(39.27266f, 15.172454f);
            instancePath2.cubicTo(39.17877f, 15.216784f, 39.065884f, 15.364554f, 39.002804f, 15.556517f);
            instancePath2.lineTo(38.988f, 15.621f);
            instancePath2.lineTo(38.98643f, 16.234406f);
            instancePath2.lineTo(38.91307f, 18.109913f);
            instancePath2.lineTo(38.863815f, 18.810392f);
            instancePath2.cubicTo(38.07242f, 26.597534f, 34.02924f, 34.158073f, 27.901937f, 36.456474f);
            instancePath2.lineTo(27.901f, 56.980247f);
            instancePath2.lineTo(54.193317f, 56.99199f);
            instancePath2.cubicTo(54.337605f, 56.981495f, 54.516006f, 56.844994f, 54.62357f, 56.59426f);
            instancePath2.lineTo(54.68932f, 56.38497f);
            instancePath2.lineTo(58.989483f, 36.076477f);
            instancePath2.cubicTo(59.08555f, 35.426685f, 58.705902f, 34.83259f, 58.52272f, 34.694218f);
            instancePath2.lineTo(58.458202f, 34.663982f);
            instancePath2.lineTo(42.478817f, 34.663982f);
            instancePath2.lineTo(43.404f, 20.25f);
            instancePath2.lineTo(43.393345f, 19.829138f);
            instancePath2.cubicTo(43.254425f, 17.27707f, 42.164276f, 15.748302f, 40.716297f, 15.261479f);
            instancePath2.lineTo(40.400753f, 15.173115f);
            instancePath2.cubicTo(39.8467f, 15.047985f, 39.50376f, 15.063343f, 39.27266f, 15.172454f);
            instancePath2.close();
            instancePath2.moveTo(22.308f, 37.17125f);
            instancePath2.lineTo(19.528627f, 37.23547f);
            instancePath2.lineTo(16.047f, 37.233f);
            instancePath2.lineTo(16.047f, 56.976f);
            instancePath2.lineTo(22.308f, 56.97825f);
            instancePath2.lineTo(22.308f, 37.17125f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
