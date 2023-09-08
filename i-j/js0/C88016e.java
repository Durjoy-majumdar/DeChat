package js0;

import android.content.res.AssetFileDescriptor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;

/* renamed from: js0.e */
public final class C88016e {
    /* renamed from: a */
    public static byte[] m109544a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return new byte[0];
        }
        if (!byteBuffer.isDirect()) {
            return byteBuffer.array();
        }
        int position = byteBuffer.position();
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return bArr;
    }

    /* renamed from: b */
    public static byte[] m109545b(InputStream inputStream) {
        return m109546c(inputStream, 0, -1);
    }

    /* renamed from: c */
    public static byte[] m109546c(InputStream inputStream, long j, long j2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            int available = inputStream.available();
            if (available < 0) {
                byte[] bArr2 = new byte[0];
                try {
                    inputStream.close();
                } catch (Exception e) {
                    Exception exc = e;
                    Log.m105920e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + exc);
                }
                return bArr2;
            } else if ((j + j2) - 1 > ((long) (available - 1))) {
                byte[] bArr3 = new byte[0];
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    Exception exc2 = e2;
                    Log.m105920e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + exc2);
                }
                return bArr3;
            } else {
                long j3 = (long) available;
                if (j2 >= 0) {
                    j3 = j2;
                }
                inputStream.skip(j);
                int i = 0;
                while (true) {
                    long j4 = (long) i;
                    if (j4 >= j3) {
                        InputStream inputStream2 = inputStream;
                        break;
                    }
                    InputStream inputStream3 = inputStream;
                    try {
                        int read = inputStream.read(bArr, 0, 16384);
                        if (read == -1) {
                            break;
                        }
                        int min = (int) Math.min((long) read, j3 - j4);
                        byteArrayOutputStream.write(bArr, 0, min);
                        i += min;
                    } catch (Exception e3) {
                        e = e3;
                        try {
                            Log.m105920e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray: " + e);
                            byte[] bArr4 = new byte[0];
                            try {
                                inputStream.close();
                            } catch (Exception e4) {
                                Exception exc3 = e4;
                                Log.m105920e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + exc3);
                            }
                            return bArr4;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th4 = th;
                            try {
                                inputStream.close();
                            } catch (Exception e5) {
                                Exception exc4 = e5;
                                Log.m105920e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + exc4);
                            }
                            throw th4;
                        }
                    }
                }
                byteArrayOutputStream.flush();
                try {
                    inputStream.close();
                } catch (Exception e6) {
                    Exception exc5 = e6;
                    Log.m105920e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + exc5);
                }
                return byteArrayOutputStream.toByteArray();
            }
        } catch (Exception e7) {
            e = e7;
            InputStream inputStream4 = inputStream;
            Log.m105920e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray: " + e);
            byte[] bArr42 = new byte[0];
            inputStream.close();
            return bArr42;
        } catch (Throwable th5) {
            th = th5;
            InputStream inputStream5 = inputStream;
            Throwable th42 = th;
            inputStream.close();
            throw th42;
        }
    }

    /* renamed from: d */
    public static String m109547d(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[16384];
        StringWriter stringWriter = new StringWriter();
        while (true) {
            try {
                int read = inputStreamReader.read(cArr);
                if (-1 != read) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    Util.qualityClose(inputStreamReader);
                    Util.qualityClose(inputStream);
                    return stringWriter.toString();
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandIOUtil", "convertStreamToString: read, %s", e.getMessage());
                Util.qualityClose(inputStreamReader);
                Util.qualityClose(inputStream);
                return "";
            } catch (Throwable th) {
                Util.qualityClose(inputStreamReader);
                Util.qualityClose(inputStream);
                throw th;
            }
        }
    }

    /* renamed from: e */
    public static String m109548e(String str) {
        InputStream inputStream;
        try {
            inputStream = MMApplicationContext.getContext().getAssets().open(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandIOUtil", "openRead file( %s ) failed, exp = %s", str, Util.stackTraceToString(e));
            inputStream = null;
        }
        return inputStream == null ? "" : m109547d(inputStream);
    }

    /* renamed from: f */
    public static String m109549f(AssetFileDescriptor assetFileDescriptor) {
        FileInputStream createInputStream;
        if (assetFileDescriptor == null) {
            return "";
        }
        try {
            createInputStream = assetFileDescriptor.createInputStream();
            String d = m109547d(createInputStream);
            if (createInputStream != null) {
                createInputStream.close();
            }
            return d;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.AppBrandIOUtil", "openReadFdAsString(%s) createInputStream get exception %s", assetFileDescriptor, e);
            return "";
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
