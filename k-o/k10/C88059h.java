package k10;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.StandardMessageCodec;

/* renamed from: k10.h */
public class C88059h {

    /* renamed from: k10.h$a */
    public static class C88060a {

        /* renamed from: a */
        public Long f254709a;

        /* renamed from: b */
        public String f254710b;

        /* renamed from: c */
        public byte[] f254711c;

        /* renamed from: a */
        public static C88060a m109639a(Map<String, Object> map) {
            Long l;
            C88060a aVar = new C88060a();
            Object obj = map.get("errCode");
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            aVar.mo122499b(l);
            aVar.mo122500c((String) map.get("errMsg"));
            aVar.f254711c = (byte[]) map.get("data");
            return aVar;
        }

        /* renamed from: b */
        public void mo122499b(Long l) {
            if (l != null) {
                this.f254709a = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"errCode\" is null.");
        }

        /* renamed from: c */
        public void mo122500c(String str) {
            if (str != null) {
                this.f254710b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"errMsg\" is null.");
        }
    }

    /* renamed from: k10.h$b */
    public static class C88061b {

        /* renamed from: a */
        public final BinaryMessenger f254712a;

        public C88061b(BinaryMessenger binaryMessenger) {
            this.f254712a = binaryMessenger;
        }
    }

    /* renamed from: k10.h$c */
    public static class C88062c extends StandardMessageCodec {

        /* renamed from: a */
        public static final C88062c f254713a = new C88062c();

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? super.readValueOfType(b, byteBuffer) : C88060a.m109639a((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C88060a) {
                byteArrayOutputStream.write(128);
                C88060a aVar = (C88060a) obj;
                aVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", aVar.f254709a);
                hashMap.put("errMsg", aVar.f254710b);
                hashMap.put("data", aVar.f254711c);
                writeValue(byteArrayOutputStream, hashMap);
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    /* renamed from: k10.h$d */
    public interface C88063d {
        /* renamed from: n */
        void mo121213n(String str, String str2, byte[] bArr, C88065f<C88060a> fVar);
    }

    /* renamed from: k10.h$e */
    public static class C88064e extends StandardMessageCodec {

        /* renamed from: a */
        public static final C88064e f254714a = new C88064e();

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? super.readValueOfType(b, byteBuffer) : C88060a.m109639a((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C88060a) {
                byteArrayOutputStream.write(128);
                C88060a aVar = (C88060a) obj;
                aVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", aVar.f254709a);
                hashMap.put("errMsg", aVar.f254710b);
                hashMap.put("data", aVar.f254711c);
                writeValue(byteArrayOutputStream, hashMap);
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    /* renamed from: k10.h$f */
    public interface C88065f<T> {
    }

    /* renamed from: a */
    public static Map m109638a(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.MESSAGE, th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
