package j61;

import a61.C39496m;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p441aq.C92054g;
import te3.C50933qa;
import te3.C51077ra;
import wh3.C102451g;

/* renamed from: j61.f */
public class C46437f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125067d;

    /* renamed from: e */
    public final C47350c f125068e;

    /* renamed from: f */
    public ArrayList<String> f125069f;

    public C46437f(ArrayList<String> arrayList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50933qa();
        bVar.f127067b = new C51077ra();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmbatchemojibackup";
        bVar.f127069d = 696;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f125068e = bVar.mo72403a();
        this.f125069f = arrayList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125067d = nVar;
        ((C50933qa) this.f125068e.f127055a.f127080a).f140204d = new LinkedList<>(this.f125069f);
        ArrayList<String> arrayList = this.f125069f;
        if (arrayList != null && arrayList.size() > 0) {
            return dispatch(gVar, this.f125068e, this);
        }
        Log.m105924i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "need no backup custom emoji, list is null.");
        C86709a0.m107535s().mo121142i().mo119676J(348162, Boolean.FALSE);
        return -1;
    }

    public int getType() {
        return 696;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        String str3;
        Class cls;
        String str4;
        int i4 = i2;
        int i5 = i3;
        Class cls2 = C92054g.class;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN;
        Log.m105925i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "netId:%d, errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (i5 == -434) {
            Log.m105928w("MicroMsg.emoji.NetSceneBatchEmojiBackup", "[cpan] batch backup emoji failed. over size.");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            C115669n.INSTANCE.idkeyStat(164, 4, 1, false);
        }
        String str5 = "md5";
        String str6 = "MicroMsg.emoji.NetSceneBatchEmojiBackup";
        String str7 = "EmojiInfo";
        if (i4 == 0 && i5 == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
            ((C92054g) C86312j.m106911c(cls2)).getClass();
            C102451g d = C30790w2.m39221h().mo57717d();
            ArrayList<String> arrayList = this.f125069f;
            d.getClass();
            if (arrayList == null || arrayList.size() <= 0) {
                cls = cls2;
                str3 = " IN (";
                str2 = str5;
                str4 = str7;
                Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] LocalCustomEmoji failed. list is null");
            } else {
                cls = cls2;
                Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] LocalCustomEmoji list size :%d.", Integer.valueOf(arrayList.size()));
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE");
                sb.append(" EmojiInfo ");
                sb.append(" SET ");
                sb.append(FirebaseAnalytics.C113379b.SOURCE);
                sb.append("=");
                sb.append(1);
                sb.append(" where ");
                sb.append(str5);
                sb.append(" IN (");
                str3 = " IN (";
                int i6 = 0;
                while (i6 < arrayList.size()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("'");
                    String str8 = str5;
                    sb4.append(arrayList.get(i6));
                    sb4.append("'");
                    sb.append(sb4.toString());
                    if (i6 < arrayList.size() - 1) {
                        sb.append(",");
                    }
                    i6++;
                    str5 = str8;
                }
                str2 = str5;
                sb.append(")");
                Log.m105918d("MicroMsg.emoji.EmojiInfoStorage", sb.toString());
                ISQLiteDatabase iSQLiteDatabase = d.f301704d;
                String sb5 = sb.toString();
                str4 = str7;
                iSQLiteDatabase.execSQL(str4, sb5);
            }
            C115669n.INSTANCE.idkeyStat(164, 2, 1, false);
        } else {
            cls = cls2;
            str3 = " IN (";
            str2 = str5;
            str4 = str7;
            C115669n.INSTANCE.idkeyStat(164, 3, 1, false);
        }
        C51077ra raVar = (C51077ra) this.f125068e.f127056b.f127083a;
        LinkedList<String> linkedList = raVar.f140782d;
        if (linkedList != null && linkedList.size() > 0) {
            Log.m105924i(str6, "[cpan] there are some emoji need to upload.");
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C102451g d2 = C30790w2.m39221h().mo57717d();
            LinkedList<String> linkedList2 = raVar.f140782d;
            d2.getClass();
            if (linkedList2 == null || linkedList2.size() <= 0) {
                Log.m105924i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] updateNeedUploadEmojiList failed. list is null");
            } else {
                C102451g gVar = d2;
                String str9 = str4;
                C115669n.INSTANCE.mo175912v(164, 12);
                Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] updateNeedUploadEmojiList list size :%d.", Integer.valueOf(linkedList2.size()));
                StringBuilder sb6 = new StringBuilder();
                sb6.append("UPDATE");
                sb6.append(" EmojiInfo ");
                sb6.append(" SET ");
                sb6.append("needupload");
                sb6.append("=");
                sb6.append(1);
                sb6.append(" where ");
                sb6.append(str2);
                sb6.append(str3);
                for (int i7 = 0; i7 < linkedList2.size(); i7++) {
                    sb6.append("'" + linkedList2.get(i7) + "'");
                    if (i7 < linkedList2.size() - 1) {
                        sb6.append(",");
                    }
                }
                sb6.append(")");
                Log.m105918d("MicroMsg.emoji.EmojiInfoStorage", sb6.toString());
                gVar.f301704d.execSQL(str9, sb6.toString());
            }
            C86709a0.m107535s().mo121142i().mo119676J(348165, Boolean.TRUE);
            C39496m.m42135d(true);
        }
        this.f125067d.onSceneEnd(i2, i3, str, this);
    }
}
