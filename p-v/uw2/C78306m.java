package uw2;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import p749xh.C78814j9;
import p823sg.C90193h;

/* renamed from: uw2.m */
public class C78306m extends MAutoStorage<C78295i> {

    /* renamed from: f */
    public static final String[] f229381f = {MAutoStorage.getCreateSQLs(C78295i.f229348V, "VoiceRemindInfo")};

    /* renamed from: g */
    public static long f229382g = 0;

    /* renamed from: d */
    public ISQLiteDatabase f229383d;

    /* renamed from: e */
    public Map<String, C78289d> f229384e = new HashMap();

    public C78306m(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C78295i.f229348V, "VoiceRemindInfo", C78814j9.f230853y);
        this.f229383d = iSQLiteDatabase;
    }

    public static String yr0(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        String format = new SimpleDateFormat("ssHHmmMMddyy").format(new Date(currentTimeMillis));
        if (str != null && str.length() > 1) {
            format = format + C90193h.m112878f(str.getBytes()).substring(0, 7);
        }
        String str2 = format + (currentTimeMillis % 10000);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        long j = f229382g;
        f229382g = 1 + j;
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: c */
    public boolean mo108319c(String str) {
        Assert.assertTrue(str.length() > 0);
        if (this.f229383d.delete("VoiceRemindInfo", "filename= ?", new String[]{str}) <= 0) {
            Log.m105928w("MicroMsg.VoiceRemindStorage", "delete failed, no such file:" + str);
        }
        return true;
    }

    /* renamed from: jo */
    public boolean mo108320jo(String str, C78295i iVar) {
        Assert.assertTrue(str.length() > 0);
        Assert.assertTrue(iVar != null);
        ContentValues convertTo = iVar.convertTo();
        if (convertTo.size() <= 0) {
            Log.m105920e("MicroMsg.VoiceRemindStorage", "update failed, no values set");
        } else {
            if (this.f229383d.update("VoiceRemindInfo", convertTo, "filename= ?", new String[]{str}) > 0) {
                doNotify();
                return true;
            }
        }
        return false;
    }
}
