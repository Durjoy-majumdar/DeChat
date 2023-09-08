package ki0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.List;
import p749xh.C38652r7;
import tr0.C37242c;

/* renamed from: ki0.e */
public class C33910e extends C37242c<C33911f> {

    /* renamed from: e */
    public static final String[] f91603e = {MAutoStorage.getCreateSQLs(C33911f.f91605y, "PredownloadIssueLaunchWxaAppResponse")};

    public C33910e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33911f.f91605y, "PredownloadIssueLaunchWxaAppResponse", C38652r7.f103521n);
    }

    /* renamed from: jo */
    public boolean mo59362jo(byte[] bArr, String str, List<Integer> list, long j, long j2) {
        if (Util.isNullOrNil(bArr) || Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, invalid input %s", str);
            return false;
        } else if (Util.isNullOrNil((List) list)) {
            Log.m105921e("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, empty sceneList", str);
            return false;
        } else {
            boolean z = true;
            for (Integer intValue : list) {
                int intValue2 = intValue.intValue();
                C33911f fVar = new C33911f();
                fVar.field_appId = str;
                fVar.field_scene = intValue2;
                boolean z2 = get(fVar, new String[0]);
                fVar.field_launchProtoBlob = bArr;
                fVar.field_startTime = j;
                fVar.field_endTime = j2;
                z &= z2 ? update(fVar, new String[0]) : insert(fVar);
            }
            Log.m105925i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, sceneList %d, setOk %b", str, Integer.valueOf(list.size()), Boolean.valueOf(z));
            return z;
        }
    }
}
