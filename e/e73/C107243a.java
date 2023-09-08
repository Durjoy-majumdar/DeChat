package e73;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import g73.C107762g;
import g73.C107763i;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: e73.a */
public class C107243a {

    /* renamed from: a */
    public static long f320886a = -1;

    /* renamed from: a */
    public static boolean m145332a(String str) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLETLOCK_FINGERPRINT_FID_LIST_STRING_SYNC;
        Log.m105925i("MicroMsg.FingerprintInfoStorage", "alvinluo add fid to local: %s", str);
        try {
            JSONArray jSONArray = null;
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, (Object) null);
            if (str2 != null) {
                try {
                    jSONArray = new JSONArray(str2);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FingerprintInfoStorage", e, "", new Object[0]);
                }
            }
            HashSet<String> c = m145334c(jSONArray);
            if (jSONArray == null) {
                Log.m105928w("MicroMsg.FingerprintInfoStorage", "alvinluo list is null");
                jSONArray = new JSONArray();
            }
            if (c == null) {
                Log.m105928w("MicroMsg.FingerprintInfoStorage", "alvinluo fidSet is null");
                c = new HashSet<>();
            }
            Log.m105925i("MicroMsg.FingerprintInfoStorage", "alvinluo fidList: %s before add fid", jSONArray.toString());
            if (!c.contains(str)) {
                Log.m105929w("MicroMsg.FingerprintInfoStorage", "alvinluo fidSet contains fid %s: %b", str, Boolean.FALSE);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fid", str);
                jSONArray.put(jSONObject);
                Log.m105925i("MicroMsg.FingerprintInfoStorage", "alvinluo list: %s", jSONArray.toString());
                C86709a0.m107535s().mo121142i().mo119677K(aVar, jSONArray.toString());
                C86709a0.m107535s().mo121142i().mo119681a(true);
                return true;
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.FingerprintInfoStorage", e2, "", new Object[0]);
        }
        return false;
    }

    /* renamed from: b */
    public static void m145333b() {
        Log.m105925i("MicroMsg.FingerprintInfoStorage", "alvinluo clear local fids, stack: %s", Util.getStack());
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETLOCK_FINGERPRINT_FID_LIST_STRING_SYNC, (Object) null);
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }

    /* renamed from: c */
    public static HashSet<String> m145334c(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            HashSet<String> hashSet = new HashSet<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getJSONObject(i).getString("fid"));
            }
            return hashSet;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FingerprintInfoStorage", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m145335d() {
        C107763i iVar;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLETLOCK_FINGERPRINT_LAST_BLOCK_TIME_STRING_SYNC;
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i == null) {
            iVar = new C107763i();
        } else {
            String str = (String) i.mo119685f(aVar, (Object) null);
            if (str == null) {
                iVar = new C107763i();
            } else {
                C107763i iVar2 = new C107763i();
                iVar2.mo158190a(C107762g.m145998f(str));
                iVar = iVar2;
            }
        }
        if (iVar.f322499a != -1) {
            C107762g.m145994b(iVar);
            long j = iVar.f322500b;
            if (j / 1000 < 30) {
                m145336e(iVar.f322499a, j);
                return true;
            }
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            if (i2 != null) {
                i2.mo119677K(aVar, (Object) null);
                i2.mo119681a(true);
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m145336e(long j, long j2) {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i != null) {
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLETLOCK_FINGERPRINT_LAST_BLOCK_TIME_STRING_SYNC;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeLong(j);
                dataOutputStream.writeLong(j2);
                dataOutputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.TimeInfo", e, "", new Object[0]);
            }
            i.mo119677K(aVar, C107762g.m145993a(byteArrayOutputStream.toByteArray()));
            i.mo119681a(true);
        }
    }
}
