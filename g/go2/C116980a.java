package go2;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.ByteBuffer;

/* renamed from: go2.a */
public class C116980a {
    /* renamed from: a */
    public static void m165048a(ByteBuffer byteBuffer, long j) {
        SnsMethodCalculate.markStartTimeMs("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        SnsMethodCalculate.markStartTimeMs("ensureUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Unsigned");
        if (j < 0 || j > 2147483647L) {
            ArithmeticException arithmeticException = new ArithmeticException("unsigned integer overflow");
            SnsMethodCalculate.markEndTimeMs("ensureUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Unsigned");
            throw arithmeticException;
        }
        SnsMethodCalculate.markEndTimeMs("ensureUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Unsigned");
        SnsMethodCalculate.markStartTimeMs("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        byteBuffer.position((int) j);
        SnsMethodCalculate.markEndTimeMs("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        SnsMethodCalculate.markEndTimeMs("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
    }

    /* renamed from: b */
    public static short m165049b(ByteBuffer byteBuffer) {
        SnsMethodCalculate.markStartTimeMs("readUByte", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        short s = (short) (byteBuffer.get() & ExifInterface.MARKER);
        SnsMethodCalculate.markEndTimeMs("readUByte", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        return s;
    }

    /* renamed from: c */
    public static long m165050c(ByteBuffer byteBuffer) {
        SnsMethodCalculate.markStartTimeMs("readUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        long j = ((long) byteBuffer.getInt()) & Util.MAX_32BIT_VALUE;
        SnsMethodCalculate.markEndTimeMs("readUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        return j;
    }
}
