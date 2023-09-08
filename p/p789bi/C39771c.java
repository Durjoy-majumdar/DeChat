package p789bi;

import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: bi.c */
public class C39771c {
    /* renamed from: a */
    public static Serializable m42564a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(URLDecoder.decode(str, "UTF-8").getBytes(KindaConfigCacheStg.SAVE_CHARSET));
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Serializable serializable = (Serializable) objectInputStream.readObject();
        objectInputStream.close();
        byteArrayInputStream.close();
        Log.m105919d("MicroMsg.NotificationQueueTool", "de serialize consume: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return serializable;
    }

    /* renamed from: b */
    public static String m42565b(Serializable serializable) {
        if (serializable == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        String encode = URLEncoder.encode(byteArrayOutputStream.toString(KindaConfigCacheStg.SAVE_CHARSET), "UTF-8");
        objectOutputStream.close();
        byteArrayOutputStream.close();
        Log.m105919d("MicroMsg.NotificationQueueTool", "serialize consume: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return encode;
    }
}
