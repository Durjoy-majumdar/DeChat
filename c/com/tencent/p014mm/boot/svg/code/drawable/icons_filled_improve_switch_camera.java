package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_improve_switch_camera */
public class icons_filled_improve_switch_camera extends C24542c {
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
        instancePath.moveTo(5.5080853f, 11.864971f);
        Path path = instancePath;
        path.cubicTo(5.707485f, 11.634671f, 6.064685f, 11.634671f, 6.263985f, 11.864971f);
        instancePath.lineTo(6.263985f, 11.864971f);
        instancePath.lineTo(8.649185f, 14.618971f);
        path.cubicTo(8.929585f, 14.942871f, 8.699585f, 15.446371f, 8.271185f, 15.446371f);
        instancePath.lineTo(8.271185f, 15.446371f);
        instancePath.lineTo(6.586585f, 15.446371f);
        path.cubicTo(6.636685f, 17.06907f, 7.141185f, 18.647171f, 8.045085f, 20.00007f);
        path.cubicTo(8.998685f, 21.42727f, 10.354085f, 22.539572f, 11.939885f, 23.19647f);
        path.cubicTo(13.525685f, 23.853271f, 15.270685f, 24.025171f, 16.954185f, 23.690271f);
        path.cubicTo(18.637686f, 23.35547f, 20.183985f, 22.528872f, 21.397785f, 21.31517f);
        instancePath.lineTo(21.397785f, 21.31517f);
        instancePath.lineTo(22.458385f, 22.375872f);
        path.cubicTo(21.034885f, 23.799372f, 19.221285f, 24.76877f, 17.246784f, 25.16147f);
        path.cubicTo(15.272385f, 25.554272f, 13.225785f, 25.35267f, 11.365885f, 24.582272f);
        path.cubicTo(9.505985f, 23.81187f, 7.916285f, 22.50727f, 6.797885f, 20.83337f);
        path.cubicTo(5.729085f, 19.233871f, 5.136485f, 17.36577f, 5.085985f, 15.446371f);
        instancePath.lineTo(5.085985f, 15.446371f);
        instancePath.lineTo(3.5009851f, 15.446371f);
        instancePath.cubicTo(3.072585f, 15.446371f, 2.842585f, 14.942871f, 3.1229851f, 14.618971f);
        instancePath.lineTo(3.1229851f, 14.618971f);
        instancePath.close();
        instancePath.moveTo(13.275285f, 5.195571f);
        Path path2 = instancePath;
        path2.cubicTo(15.249685f, 4.8028708f, 17.296286f, 5.0043707f, 19.156185f, 5.7747707f);
        path2.cubicTo(21.016085f, 6.545171f, 22.605684f, 7.849771f, 23.724186f, 9.523671f);
        path2.cubicTo(24.792986f, 11.123171f, 25.385485f, 12.991271f, 25.436085f, 14.910671f);
        instancePath.lineTo(25.436085f, 14.910671f);
        instancePath.lineTo(27.021086f, 14.910671f);
        instancePath.cubicTo(27.449486f, 14.910671f, 27.679485f, 15.414171f, 27.399084f, 15.7380705f);
        instancePath.lineTo(27.399084f, 15.7380705f);
        instancePath.lineTo(25.013985f, 18.49217f);
        instancePath.cubicTo(24.814585f, 18.72237f, 24.457384f, 18.72237f, 24.257984f, 18.49217f);
        instancePath.lineTo(24.257984f, 18.49217f);
        instancePath.lineTo(21.872885f, 15.7380705f);
        instancePath.cubicTo(21.592485f, 15.414171f, 21.822485f, 14.910671f, 22.250885f, 14.910671f);
        instancePath.lineTo(22.250885f, 14.910671f);
        instancePath.lineTo(23.935385f, 14.910671f);
        Path path3 = instancePath;
        path3.cubicTo(23.885284f, 13.287971f, 23.380884f, 11.709871f, 22.476986f, 10.356971f);
        path3.cubicTo(21.523384f, 8.929871f, 20.167885f, 7.817471f, 18.582085f, 7.160571f);
        path3.cubicTo(16.996284f, 6.503771f, 15.251385f, 6.331871f, 13.567885f, 6.666771f);
        path3.cubicTo(11.884385f, 7.0015707f, 10.337985f, 7.828171f, 9.124285f, 9.041871f);
        instancePath.lineTo(9.124285f, 9.041871f);
        instancePath.lineTo(8.063685f, 7.981271f);
        instancePath.cubicTo(9.4871855f, 6.5577707f, 11.300785f, 5.5882707f, 13.275285f, 5.195571f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-419430401);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(5.5080853f, 11.864971f);
        instancePath2.cubicTo(5.707485f, 11.634671f, 6.064685f, 11.634671f, 6.263985f, 11.864971f);
        instancePath2.lineTo(6.263985f, 11.864971f);
        instancePath2.lineTo(8.649185f, 14.618971f);
        instancePath2.cubicTo(8.929585f, 14.942871f, 8.699585f, 15.446371f, 8.271185f, 15.446371f);
        instancePath2.lineTo(8.271185f, 15.446371f);
        instancePath2.lineTo(6.586585f, 15.446371f);
        Path path4 = instancePath2;
        path4.cubicTo(6.636685f, 17.06907f, 7.141185f, 18.647171f, 8.045085f, 20.00007f);
        path4.cubicTo(8.998685f, 21.42727f, 10.354085f, 22.539572f, 11.939885f, 23.19647f);
        path4.cubicTo(13.525685f, 23.853271f, 15.270685f, 24.025171f, 16.954185f, 23.690271f);
        path4.cubicTo(18.637686f, 23.35547f, 20.183985f, 22.528872f, 21.397785f, 21.31517f);
        instancePath2.lineTo(21.397785f, 21.31517f);
        instancePath2.lineTo(22.458385f, 22.375872f);
        Path path5 = instancePath2;
        path5.cubicTo(21.034885f, 23.799372f, 19.221285f, 24.76877f, 17.246784f, 25.16147f);
        path5.cubicTo(15.272385f, 25.554272f, 13.225785f, 25.35267f, 11.365885f, 24.582272f);
        path5.cubicTo(9.505985f, 23.81187f, 7.916285f, 22.50727f, 6.797885f, 20.83337f);
        path5.cubicTo(5.729085f, 19.233871f, 5.136485f, 17.36577f, 5.085985f, 15.446371f);
        instancePath2.lineTo(5.085985f, 15.446371f);
        instancePath2.lineTo(3.5009851f, 15.446371f);
        instancePath2.cubicTo(3.072585f, 15.446371f, 2.842585f, 14.942871f, 3.1229851f, 14.618971f);
        instancePath2.lineTo(3.1229851f, 14.618971f);
        instancePath2.close();
        instancePath2.moveTo(13.275285f, 5.195571f);
        Path path6 = instancePath2;
        path6.cubicTo(15.249685f, 4.8028708f, 17.296286f, 5.0043707f, 19.156185f, 5.7747707f);
        path6.cubicTo(21.016085f, 6.545171f, 22.605684f, 7.849771f, 23.724186f, 9.523671f);
        path6.cubicTo(24.792986f, 11.123171f, 25.385485f, 12.991271f, 25.436085f, 14.910671f);
        instancePath2.lineTo(25.436085f, 14.910671f);
        instancePath2.lineTo(27.021086f, 14.910671f);
        instancePath2.cubicTo(27.449486f, 14.910671f, 27.679485f, 15.414171f, 27.399084f, 15.7380705f);
        instancePath2.lineTo(27.399084f, 15.7380705f);
        instancePath2.lineTo(25.013985f, 18.49217f);
        instancePath2.cubicTo(24.814585f, 18.72237f, 24.457384f, 18.72237f, 24.257984f, 18.49217f);
        instancePath2.lineTo(24.257984f, 18.49217f);
        instancePath2.lineTo(21.872885f, 15.7380705f);
        Path path7 = instancePath2;
        path7.cubicTo(21.592485f, 15.414171f, 21.822485f, 14.910671f, 22.250885f, 14.910671f);
        instancePath2.lineTo(22.250885f, 14.910671f);
        instancePath2.lineTo(23.935385f, 14.910671f);
        path7.cubicTo(23.885284f, 13.287971f, 23.380884f, 11.709871f, 22.476986f, 10.356971f);
        path7.cubicTo(21.523384f, 8.929871f, 20.167885f, 7.817471f, 18.582085f, 7.160571f);
        path7.cubicTo(16.996284f, 6.503771f, 15.251385f, 6.331871f, 13.567885f, 6.666771f);
        path7.cubicTo(11.884385f, 7.0015707f, 10.337985f, 7.828171f, 9.124285f, 9.041871f);
        instancePath2.lineTo(9.124285f, 9.041871f);
        instancePath2.lineTo(8.063685f, 7.981271f);
        instancePath2.cubicTo(9.4871855f, 6.5577707f, 11.300785f, 5.5882707f, 13.275285f, 5.195571f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}