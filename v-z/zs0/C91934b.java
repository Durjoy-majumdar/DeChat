package zs0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import ws0.C91102b;

/* renamed from: zs0.b */
public class C91934b {

    /* renamed from: a */
    public static CodingErrorAction f263208a = CodingErrorAction.REPORT;

    /* renamed from: a */
    public static String m115449a(ByteBuffer byteBuffer) {
        CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
        newDecoder.onMalformedInput(f263208a);
        newDecoder.onUnmappableCharacter(f263208a);
        try {
            byteBuffer.mark();
            String charBuffer = newDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return charBuffer;
        } catch (CharacterCodingException e) {
            throw new C91102b(1007, (Throwable) e);
        }
    }

    /* renamed from: b */
    public static byte[] m115450b(String str) {
        try {
            return str.getBytes("UTF8");
        } catch (UnsupportedEncodingException e) {
            Log.m105920e("MicroMsg.AppBrandNetWork.Charsetfunctions", e.toString());
            return new byte[0];
        }
    }
}
