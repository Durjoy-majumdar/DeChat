package mj2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import te3.C48709ag2;

/* renamed from: mj2.a */
public class C61492a {

    /* renamed from: a */
    public static Object f174820a = new Object();

    /* renamed from: mj2.a$a */
    public interface C61493a {
    }

    public C61492a(C61493a aVar) {
    }

    /* renamed from: a */
    public final C48709ag2 mo86467a() {
        byte[] O;
        Log.m105918d("MicroMsg.HeavyUserIDMappingStg", "getIDMappingObj");
        synchronized (f174820a) {
            O = C86013q1.m106433O(C72994y1.f212832a + "heavy_user_id_mapping.dat", 0, -1);
        }
        if (O == null) {
            Log.m105928w("MicroMsg.HeavyUserIDMappingStg", "get file content fail, filenameheavy_user_id_mapping.dat");
            return null;
        }
        C48709ag2 ag22 = new C48709ag2();
        try {
            ag22.parseFrom(O);
            Log.m105924i("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + ag22.f130501d + ", ret:" + ag22.f130503f + ", size: " + ag22.f130502e.size());
            return ag22;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.HeavyUserIDMappingStg", th, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public final int mo86468b(int i) {
        Log.m105918d("MicroMsg.HeavyUserIDMappingStg", "getIDMappingVersion,chanel:" + i);
        C48709ag2 a = mo86467a();
        if (a == null) {
            return 0;
        }
        int i2 = a.f130501d;
        Log.m105924i("MicroMsg.HeavyUserIDMappingStg", "version:" + i2);
        return i2;
    }

    /* renamed from: c */
    public void mo86469c(C48709ag2 ag22, int i) {
        Log.m105924i("MicroMsg.HeavyUserIDMappingStg", "saveIDMapping, channel:" + i);
        if (ag22 == null) {
            Log.m105928w("MicroMsg.HeavyUserIDMappingStg", "HeavyUserRespInfo is null");
        } else if (ag22.f130503f != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("heavyUserRespInfo.RespType Unnormal, type:");
            int i2 = ag22.f130503f;
            sb.append(1 == i2 ? "服务器过载" : 2 == i2 ? "服务器没有配置表" : 3 == i2 ? "服务器配置表错误" : "非法的错误类型");
            sb.append(",version:");
            sb.append(ag22.f130501d);
            Log.m105920e("MicroMsg.HeavyUserIDMappingStg", sb.toString());
        } else {
            int b = mo86468b(i);
            int i3 = ag22.f130501d;
            if (b == i3) {
                Log.m105918d("MicroMsg.HeavyUserIDMappingStg", "client has same version with Srv, version:" + i3);
                return;
            }
            Log.m105924i("MicroMsg.HeavyUserIDMappingStg", "version changed, client:" + mo86468b(i) + ", svr:" + i3);
            Log.m105924i("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + ag22.f130501d + ", ret:" + ag22.f130503f + ", size: " + ag22.f130502e.size());
            try {
                byte[] byteArray = ag22.toByteArray();
                synchronized (f174820a) {
                    Log.m105924i("MicroMsg.HeavyUserIDMappingStg", "new version:" + ag22.f130501d);
                    C86013q1.m106440a(C72994y1.f212832a + "heavy_user_id_mapping.dat", byteArray);
                }
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.HeavyUserIDMappingStg", e, "", new Object[0]);
            }
        }
    }
}
