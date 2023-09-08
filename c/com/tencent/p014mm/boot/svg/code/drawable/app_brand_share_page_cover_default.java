package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_share_page_cover_default */
public class app_brand_share_page_cover_default extends C24542c {
    private final int height = 81;
    private final int width = 90;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 90;
        }
        if (i2 == 1) {
            return 81;
        }
        if (i2 == 2) {
            Canvas canvas = objArr[0];
            Looper looper = objArr[1];
            Matrix instanceMatrix = C24542c.instanceMatrix(looper);
            float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
            instancePaint3.setColor(-2565928);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -1531.0f, 0.0f, 1.0f, -1102.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(1582.0f, 1105.561f);
            instancePath.cubicTo(1574.8075f, 1109.677f, 1570.0f, 1116.952f, 1570.0f, 1125.25f);
            instancePath.lineTo(1570.0f, 1159.75f);
            Path path = instancePath;
            path.cubicTo(1570.0f, 1165.963f, 1563.955f, 1171.0f, 1556.5f, 1171.0f);
            path.cubicTo(1549.0435f, 1171.0f, 1543.0f, 1165.963f, 1543.0f, 1159.75f);
            path.cubicTo(1543.0f, 1155.328f, 1546.069f, 1151.5135f, 1550.5225f, 1149.6746f);
            path.cubicTo(1550.8435f, 1149.5425f, 1551.169f, 1149.4165f, 1551.5035f, 1149.3055f);
            path.cubicTo(1554.307f, 1148.1805f, 1556.7115f, 1146.0685f, 1557.604f, 1143.616f);
            path.cubicTo(1558.9225f, 1139.995f, 1556.4685f, 1137.061f, 1552.1245f, 1137.061f);
            path.cubicTo(1551.0415f, 1137.061f, 1549.9435f, 1137.244f, 1548.8845f, 1137.574f);
            path.cubicTo(1542.589f, 1139.3815f, 1537.3466f, 1143.3354f, 1534.1995f, 1148.5f);
            path.cubicTo(1532.167f, 1151.8375f, 1531.0f, 1155.67f, 1531.0f, 1159.75f);
            path.cubicTo(1531.0f, 1172.5706f, 1542.439f, 1183.0f, 1556.5f, 1183.0f);
            path.cubicTo(1561.4604f, 1183.0f, 1566.079f, 1181.6815f, 1570.0f, 1179.439f);
            path.cubicTo(1577.1925f, 1175.323f, 1582.0f, 1168.048f, 1582.0f, 1159.75f);
            instancePath.lineTo(1582.0f, 1125.25f);
            Path path2 = instancePath;
            path2.cubicTo(1582.0f, 1119.037f, 1588.0435f, 1114.0f, 1595.5f, 1114.0f);
            path2.cubicTo(1602.955f, 1114.0f, 1609.0f, 1119.037f, 1609.0f, 1125.25f);
            path2.cubicTo(1609.0f, 1129.861f, 1605.6715f, 1133.824f, 1600.906f, 1135.561f);
            path2.cubicTo(1597.8325f, 1136.5916f, 1595.314f, 1138.816f, 1594.354f, 1141.4515f);
            path2.cubicTo(1593.043f, 1145.0544f, 1595.485f, 1147.9764f, 1599.8094f, 1147.9764f);
            path2.cubicTo(1600.789f, 1147.9764f, 1601.779f, 1147.8085f, 1602.7435f, 1147.5355f);
            path2.cubicTo(1602.901f, 1147.492f, 1603.057f, 1147.444f, 1603.213f, 1147.3975f);
            path2.cubicTo(1609.456f, 1145.584f, 1614.667f, 1141.642f, 1617.799f, 1136.5f);
            path2.cubicTo(1619.833f, 1133.164f, 1621.0f, 1129.33f, 1621.0f, 1125.25f);
            path2.cubicTo(1621.0f, 1112.4294f, 1609.561f, 1102.0f, 1595.5f, 1102.0f);
            path2.cubicTo(1590.5396f, 1102.0f, 1585.921f, 1103.3185f, 1582.0f, 1105.561f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
