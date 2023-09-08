package com.pay.tool;

import android.text.TextUtils;
import com.pay.http.APPluginUrlConf;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.comm.APLog;
import java.io.CharConversionException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.io.WriteAbortedException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.apache.http.conn.ConnectTimeoutException;

public class APMidasTools {
    public static long lastClickTime;

    public static String getCurrentThreadName(Thread thread) {
        return thread.getName();
    }

    public static int getErrorCodeFromException(IOException iOException) {
        if (iOException instanceof CharConversionException) {
            return -20;
        }
        if (iOException instanceof MalformedInputException) {
            return -21;
        }
        if (iOException instanceof UnmappableCharacterException) {
            return -22;
        }
        if (iOException instanceof ClosedChannelException) {
            return -24;
        }
        if (iOException instanceof EOFException) {
            return -26;
        }
        if (iOException instanceof FileLockInterruptionException) {
            return -27;
        }
        if (iOException instanceof FileNotFoundException) {
            return -28;
        }
        if (iOException instanceof HttpRetryException) {
            return -29;
        }
        if (iOException instanceof ConnectTimeoutException) {
            return -7;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -8;
        }
        if (iOException instanceof InvalidPropertiesFormatException) {
            return -30;
        }
        if (iOException instanceof MalformedURLException) {
            return -3;
        }
        if (iOException instanceof InvalidClassException) {
            return -33;
        }
        if (iOException instanceof InvalidObjectException) {
            return -34;
        }
        if (iOException instanceof NotActiveException) {
            return -35;
        }
        if (iOException instanceof NotSerializableException) {
            return -36;
        }
        if (iOException instanceof OptionalDataException) {
            return -37;
        }
        if (iOException instanceof StreamCorruptedException) {
            return -38;
        }
        if (iOException instanceof WriteAbortedException) {
            return -39;
        }
        if (iOException instanceof ProtocolException) {
            return -40;
        }
        if (iOException instanceof SSLHandshakeException) {
            return -41;
        }
        if (iOException instanceof SSLKeyException) {
            return -42;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -43;
        }
        if (iOException instanceof SSLProtocolException) {
            return -44;
        }
        if (iOException instanceof BindException) {
            return -45;
        }
        if (iOException instanceof ConnectException) {
            return -46;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -47;
        }
        if (iOException instanceof PortUnreachableException) {
            return -48;
        }
        if (iOException instanceof SyncFailedException) {
            return -49;
        }
        if (iOException instanceof UTFDataFormatException) {
            return -50;
        }
        if (iOException instanceof UnknownHostException) {
            return -51;
        }
        if (iOException instanceof UnknownServiceException) {
            return -52;
        }
        if (iOException instanceof UnsupportedEncodingException) {
            return -53;
        }
        return iOException instanceof ZipException ? -54 : -2;
    }

    public static String getSysServerDomain() {
        String str = APMidasPayAPI.env;
        return str.equals(APMidasPayAPI.ENV_DEV) ? APPluginUrlConf.UNIPAY_DEV_DOMAIN : str.equals(APMidasPayAPI.ENV_TEST) ? APPluginUrlConf.UNIPAY_SANDBOX_DOMAIN : "api.unipay.qq.com";
    }

    public static long getTimeInterval(long j, long j2) {
        return j2 - j;
    }

    public static String getUUID() {
        try {
            return UUID.randomUUID().toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getUrlParamsValue(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String[] split = str.split("[?]");
        if (split.length > 1 && (str3 = split[1]) != null) {
            for (String split2 : str3.split("[&]")) {
                String[] split3 = split2.split("[=]");
                if (split3.length <= 1 || (str4 = split3[0]) == null) {
                    str4 = null;
                }
                if (split3.length <= 1 || (str5 = split3[1]) == null) {
                    str5 = null;
                }
                if (str4 != null && str4.compareToIgnoreCase(str2) == 0) {
                    return str5;
                }
            }
        }
        return null;
    }

    public static boolean isFastClick() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastClickTime < 3000) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }

    public static String map2UrlParams(HashMap<String, String> hashMap) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            for (Map.Entry next : hashMap.entrySet()) {
                stringBuffer.append((String) next.getKey());
                stringBuffer.append("=");
                stringBuffer.append((String) next.getValue());
                stringBuffer.append("&");
            }
            if (!TextUtils.isEmpty(stringBuffer)) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        } catch (Exception unused) {
        }
        return stringBuffer.toString();
    }

    public static String urlDecode(String str, int i) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            APLog.m161222w(str2, "解码内容为空");
        } else if (i <= 0) {
            return str;
        } else {
            int i2 = 0;
            while (i2 < i) {
                try {
                    str2 = URLDecoder.decode(str, "utf-8");
                } catch (Exception e) {
                    APLog.m161214i("urlEncode", e.toString());
                }
                i2++;
                str = str2;
            }
        }
        return str2;
    }

    public static String urlEncode(String str, int i) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            APLog.m161214i("urlEncode", "编码内容为空");
        } else if (i <= 0) {
            return str;
        } else {
            int i2 = 0;
            while (i2 < i) {
                try {
                    str2 = URLEncoder.encode(str, "utf-8");
                } catch (Exception e) {
                    APLog.m161214i("urlEncode", e.toString());
                }
                i2++;
                str = str2;
            }
        }
        return str2;
    }
}
