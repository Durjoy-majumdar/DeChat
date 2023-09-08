package na2;

import android.content.ContentValues;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.music.cache.ipc.IPCAudioParamResponse;
import com.tencent.p014mm.plugin.music.model.cache.ipc.C94203a;
import com.tencent.p014mm.plugin.music.model.cache.ipc.C94208b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import ha2.C98327c;
import ja2.C98926a;
import ma2.C99814o0;
import q90.C101062d;
import qc0.C101108q;
import ra2.C101365a;
import ra2.C101366b;

/* renamed from: na2.e */
public class C100110e implements C98327c {
    /* renamed from: H */
    public void mo137639H(String str, int i) {
        C94203a.m119121j(str, i);
    }

    /* renamed from: I */
    public void mo137640I(long j) {
        C94203a.m119118g(j);
    }

    /* renamed from: N */
    public void mo137641N(String str, String str2) {
        String a = C94208b.m119124a(str);
        C101366b wx02 = C99814o0.wx0();
        wx02.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", str2);
        wx02.f296943e.update("Music", contentValues, "musicId=?", new String[]{a});
        C101365a aVar = (C101365a) ((C101062d) wx02.f296942d).get(a);
        if (aVar != null) {
            aVar.field_mimetype = str2;
        }
    }

    /* renamed from: W */
    public String mo137642W(String str) {
        int lastIndexOf;
        String a = C61638d.m72350a(str);
        if (!TextUtils.isEmpty(a) && !a.equalsIgnoreCase(str)) {
            Log.m105925i("MicroMsg.Music.MusicUrlParser", "use temp shake music url to play:%s", a);
            return a;
        } else if (!C61638d.m72351b(str)) {
            return "";
        } else {
            if (C61638d.m72351b(a) && (lastIndexOf = a.lastIndexOf("wxshakemusic")) > 1) {
                a = a.substring(0, lastIndexOf - 1);
            }
            Log.m105925i("MicroMsg.Music.MusicUrlParser", "play url :%s", a);
            return a;
        }
    }

    /* renamed from: Y */
    public long mo137643Y() {
        return C94203a.m119114c();
    }

    /* renamed from: Z */
    public void mo137644Z(String str, C98926a aVar) {
        String a = C94208b.m119124a(str);
        C101366b wx02 = C99814o0.wx0();
        long j = aVar.f289985d;
        wx02.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("wifiDownloadedLength", Long.valueOf(j));
        Log.m105925i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiDownloadedLength=%d", Integer.valueOf(wx02.f296943e.update("Music", contentValues, "musicId=?", new String[]{a})), a, Long.valueOf(j));
        C101365a aVar2 = (C101365a) ((C101062d) wx02.f296942d).get(a);
        if (aVar2 != null) {
            aVar2.field_wifiDownloadedLength = j;
        }
        C101366b wx03 = C99814o0.wx0();
        int i = aVar.f289986e;
        wx03.getClass();
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("wifiEndFlag", Integer.valueOf(i));
        Log.m105925i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiEndFlag=%d", Integer.valueOf(wx03.f296943e.update("Music", contentValues2, "musicId=?", new String[]{a})), a, Integer.valueOf(i));
        C101365a aVar3 = (C101365a) ((C101062d) wx03.f296942d).get(a);
        if (aVar3 != null) {
            aVar3.field_wifiEndFlag = i;
        }
        C101366b wx04 = C99814o0.wx0();
        long j2 = aVar.f289987f;
        wx04.getClass();
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("songWifiFileLength", Long.valueOf(j2));
        Log.m105925i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songWifiFileLength=%d", Integer.valueOf(wx04.f296943e.update("Music", contentValues3, "musicId=?", new String[]{a})), a, Long.valueOf(j2));
        C101365a aVar4 = (C101365a) ((C101062d) wx04.f296942d).get(a);
        if (aVar4 != null) {
            aVar4.field_songWifiFileLength = j2;
        }
        C101366b wx05 = C99814o0.wx0();
        long j3 = aVar.f289982a;
        wx05.getClass();
        ContentValues contentValues4 = new ContentValues();
        contentValues4.put("downloadedLength", Long.valueOf(j3));
        Log.m105925i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s downloadedLength=%d", Integer.valueOf(wx05.f296943e.update("Music", contentValues4, "musicId=?", new String[]{a})), a, Long.valueOf(j3));
        C101365a aVar5 = (C101365a) ((C101062d) wx05.f296942d).get(a);
        if (aVar5 != null) {
            aVar5.field_downloadedLength = j3;
        }
        C101366b wx06 = C99814o0.wx0();
        int i2 = aVar.f289984c;
        wx06.getClass();
        ContentValues contentValues5 = new ContentValues();
        contentValues5.put("endFlag", Integer.valueOf(i2));
        Log.m105925i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s endFlag=%d", Integer.valueOf(wx06.f296943e.update("Music", contentValues5, "musicId=?", new String[]{a})), a, Integer.valueOf(i2));
        C101365a aVar6 = (C101365a) ((C101062d) wx06.f296942d).get(a);
        if (aVar6 != null) {
            aVar6.field_endFlag = i2;
        }
        C101366b wx07 = C99814o0.wx0();
        long j4 = aVar.f289983b;
        wx07.getClass();
        ContentValues contentValues6 = new ContentValues();
        contentValues6.put("songFileLength", Long.valueOf(j4));
        Log.m105925i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songFileLength=%d", Integer.valueOf(wx07.f296943e.update("Music", contentValues6, "musicId=?", new String[]{a})), a, Long.valueOf(j4));
        C101365a aVar7 = (C101365a) ((C101062d) wx07.f296942d).get(a);
        if (aVar7 != null) {
            aVar7.field_songFileLength = j4;
        }
    }

    /* renamed from: a */
    public String mo137645a() {
        return C86013q1.m106448i("wcf://QQMusicCache/", true);
    }

    /* renamed from: b */
    public String mo137646b() {
        return C94203a.m119113b();
    }

    /* renamed from: e */
    public void mo137647e(String str, byte[] bArr) {
        C94203a.m119122k(str, bArr);
    }

    /* renamed from: j0 */
    public String mo137648j0(String str) {
        return C94203a.m119115d(str);
    }

    /* renamed from: k */
    public boolean mo137649k() {
        return C94203a.m119120i();
    }

    /* renamed from: k0 */
    public C98926a mo137650k0(String str) {
        C101365a jo = C99814o0.wx0().mo140855jo(C94208b.m119124a(str));
        C98926a aVar = new C98926a();
        if (jo != null) {
            aVar.f289985d = jo.field_wifiDownloadedLength;
            aVar.f289987f = jo.field_songWifiFileLength;
            aVar.f289986e = jo.field_wifiEndFlag;
            aVar.f289982a = jo.field_downloadedLength;
            aVar.f289983b = jo.field_songFileLength;
            aVar.f289984c = jo.field_endFlag;
            aVar.f289988g = jo.field_mimetype;
        }
        return aVar;
    }

    /* renamed from: m */
    public void mo137651m(String str, String str2) {
        C94203a.m119119h(str, str2);
    }

    /* renamed from: t0 */
    public C101108q mo137652t0(String str) {
        IPCAudioParamResponse e = C94203a.m119116e(str);
        if (e == null) {
            return null;
        }
        C101108q qVar = new C101108q();
        qVar.f295979a = e.f272151d;
        qVar.f295980b = e.f272152e;
        qVar.f295981c = e.f272153f;
        qVar.f295983e = e.f272155h;
        qVar.f295984f = e.f272154g;
        qVar.f295982d = e.f272156i;
        qVar.f295985g = e.f272157j;
        return qVar;
    }

    /* renamed from: u */
    public int mo137653u(int i) {
        return C94203a.m119117f(i);
    }

    /* renamed from: x */
    public void mo137654x(String str) {
        C94203a.m119112a(str);
    }

    /* renamed from: x0 */
    public String mo137655x0(String str) {
        return C94203a.m119123l(str);
    }
}
