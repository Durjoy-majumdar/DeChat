package dw2;

import android.database.Cursor;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cw2.C97393p;
import cw2.C97396r;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import kw2.C99266g;
import kw2.C99268i;
import kw2.C99269j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C51018qv3;
import te3.hc4;
import te3.pc4;
import te3.xb4;
import te3.yb4;
import te3.zb4;
import z04.C119027c;

/* renamed from: dw2.d */
public final class C97558d extends C117747y implements C1311n {

    /* renamed from: d */
    public String f286270d;

    /* renamed from: e */
    public long f286271e;

    /* renamed from: f */
    public C47350c f286272f;

    /* renamed from: g */
    public int f286273g;

    /* renamed from: h */
    public C11385n f286274h;

    /* renamed from: i */
    public String f286275i = "";

    /* renamed from: j */
    public long f286276j;

    /* renamed from: n */
    public boolean f286277n;

    /* renamed from: o */
    public long f286278o;

    public C97558d(String str, long j, boolean z) {
        C87412m.m108594g(str, "userName");
        this.f286270d = str;
        this.f286271e = j;
        long j2 = 0;
        if (j == 0) {
            Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "fp mUserName " + this.f286270d);
        } else {
            Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "np mUserName " + this.f286270d);
        }
        this.f286273g = 20;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new yb4();
        bVar.f127067b = new zb4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmstoryhistorypage";
        bVar.f127069d = 191;
        int i = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f286272f = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryHistoryPageRequest");
        yb4 yb4 = (yb4) aVar;
        yb4.f145220e = this.f286270d;
        long j3 = this.f286271e;
        yb4.f145222g = j3;
        this.f286277n = j3 == 0;
        StoryCore.C96337h hVar = StoryCore.f281736t;
        hVar.mo134192j();
        C87412m.m108594g(this.f286270d, "userName");
        C99269j i2 = hVar.mo134191i();
        long j4 = this.f286277n ? 0 : this.f286271e;
        String str2 = "select *,rowid from MMStoryInfo  WHERE " + C99269j.f291085s;
        C87412m.m108594g(str2, "baseSql");
        if (j4 != 0) {
            str2 = str2 + " AND " + "MMStoryInfo" + ".storyID < '" + j4 + '\'';
        }
        String str3 = str2 + C99269j.f291080n + " limit " + 30;
        Log.m105918d("MicroMsg.StoryInfoStorage", "getMinIdByLimit sql=" + str3);
        Cursor rawQuery = i2.f291093h.rawQuery(str3, (String[]) null);
        if (rawQuery.moveToLast()) {
            C99268i iVar = new C99268i();
            iVar.convertFrom(rawQuery);
            rawQuery.close();
            j2 = iVar.field_storyID;
        } else {
            rawQuery.close();
        }
        this.f286278o = j2;
        yb4.f145223h = j2;
        yb4.f145224i = 0;
        try {
            String timeZoneOffset = Util.getTimeZoneOffset();
            C87412m.m108593f(timeZoneOffset, "getTimeZoneOffset()");
            i = (int) Float.parseFloat(timeZoneOffset);
        } catch (Exception unused) {
        }
        yb4.f145221f = i;
        if (this.f286277n) {
            String str4 = StoryCore.f281736t.mo134189g().mo138640Ow("@__weixinhistory").field_md5;
            this.f286275i = str4;
            if (str4 == null) {
                this.f286275i = "";
            }
            yb4.f145219d = this.f286275i;
        }
        Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "req.mUserName:" + yb4.f145220e + " req.MaxId:" + yb4.f145222g + " req.MinFilterId:" + yb4.f145223h + " req.LastRequestTime:" + yb4.f145224i + " req.FirstPageMd5:" + yb4.f145219d + " req.TimeZone:" + yb4.f145221f);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(nVar, "callback");
        this.f286274h = nVar;
        return dispatch(gVar, this.f286272f, this);
    }

    public int getType() {
        return 191;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        zb4 zb4;
        String str3;
        C89349b bVar;
        int i4 = i2;
        int i5 = i3;
        String str4 = str;
        String str5 = "MicroMsg.StoryCgi.NetSceneStoryHistoryPage";
        Log.m105918d(str5, "netId=" + i + " errType=" + i4 + " errCode=" + i5 + " errMsg=" + str4);
        C47465a aVar = this.f286272f.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryHistoryPageResponse");
        zb4 zb42 = (zb4) aVar;
        this.f286276j = zb42.f145799h;
        String str6 = zb42.f145795d;
        if (str6 == null) {
            str6 = "";
        }
        Log.m105924i(str5, "objCount:" + zb42.f145796e + " firstPageMd5:" + str6 + ", expiredTime:" + zb42.f145800i);
        String str7 = "callback";
        if (zb42.f145797f.isEmpty()) {
            Log.m105924i(str5, "server give size zero");
            C11385n nVar = this.f286274h;
            if (nVar != null) {
                nVar.onSceneEnd(i4, i5, str4, this);
            } else {
                C87412m.m108603p(str7);
                throw null;
            }
        } else {
            StoryCore.C96337h hVar = StoryCore.f281736t;
            hVar.mo134189g().mo138647kD("@__weixinhistory", str6);
            if (this.f286277n) {
                LinkedList<xb4> linkedList = zb42.f145797f;
                str2 = "";
                if (linkedList.get(linkedList.size() + -1).f144576d > C97393p.f285894a.mo136659c(this.f286270d).field_storyID) {
                    LinkedList<xb4> linkedList2 = zb42.f145797f;
                    long j = linkedList2.get(linkedList2.size() - 1).f144576d;
                    if (Util.isEqual(this.f286270d, hVar.mo134187e())) {
                        String str8 = this.f286270d;
                        C87412m.m108594g(str8, "userName");
                        C99269j i6 = hVar.mo134191i();
                        String str9 = "UPDATE " + "MMStoryInfo" + " SET sourceType = " + 4 + " Where userName = '" + str8 + "' AND storyID < " + j;
                        Log.m105918d("MicroMsg.StoryInfoStorage", "updateSourceTypeBefore sql " + str9);
                        i6.f291093h.execSQL("MMStoryInfo", str9);
                    }
                }
            } else {
                str2 = "";
            }
            LinkedList<xb4> linkedList3 = zb42.f145797f;
            C87412m.m108593f(linkedList3, "resp.HistoryItemList");
            Iterator<T> it = linkedList3.iterator();
            while (it.hasNext()) {
                xb4 xb4 = (xb4) it.next();
                Log.m105918d(str5, "date=" + xb4.f144577e + " count=" + xb4.f144579g + " id=" + xb4.f144576d);
                String str10 = this.f286270d;
                hc4 hc4 = xb4.f144578f;
                C87412m.m108593f(hc4, "it.StoryObject");
                int i7 = this.f286273g;
                C87412m.m108594g(str10, "userName");
                StoryCore.C96337h hVar2 = StoryCore.f281736t;
                C99269j i8 = hVar2.mo134191i();
                Iterator<T> it4 = it;
                StringBuilder sb = new StringBuilder();
                String str11 = str2;
                sb.append("insertStory storyObj.id:");
                String str12 = str7;
                sb.append(hc4.f298334d);
                Log.m105918d("MicroMsg.StoryInfoStorageLogic", sb.toString());
                C99268i qq = i8.mo138674qq(hc4.f298334d);
                if (qq == null) {
                    qq = new C99268i();
                }
                C51018qv3 qv32 = hc4.f298339i;
                if (qv32 == null || (bVar = qv32.f140574f) == null) {
                    zb4 = zb42;
                    str3 = str5;
                    Log.m105924i("MicroMsg.StoryInfoStorageLogic", "object desc is null");
                } else {
                    String str13 = new String(bVar.mo123703f(), C119027c.f356488a);
                    zb4 = zb42;
                    Log.m105919d("MicroMsg.StoryInfoStorageLogic", "from server %d \n%s", Long.valueOf(hc4.f298334d), str13);
                    pc4 a = C97396r.f285895a.mo136666a(str13);
                    if (Util.isNullOrNil(str13) || a == null || !qq.mo138660s2(a)) {
                        str3 = str5;
                    } else {
                        str3 = str5;
                        Log.m105919d("MicroMsg.StoryInfoStorageLogic", "from server xml ok %d \n " + str13, Long.valueOf(hc4.f298334d));
                        hc4.f298339i.mo73350k(new byte[0]);
                        qq.field_userName = hc4.f298335e;
                        qq.field_createTime = hc4.f298337g;
                        qq.field_storyID = hc4.f298334d;
                        if (!hc4.f298341n.isEmpty()) {
                            qq.field_attrBuf = hc4.toByteArray();
                        }
                        Log.m105924i("MicroMsg.StoryInfoStorageLogic", "id:" + qq.field_storyID + " createTime:" + qq.field_createTime + " CommentListSize:" + hc4.f298341n.size() + " BubbleListSize:" + hc4.f298343p.size());
                        qq.field_sourceType = qq.field_sourceType | i7;
                        pc4 p2 = qq.mo138657p2();
                        p2.f299133e = hc4.f298335e;
                        qq.mo138662u2(p2);
                        Cursor rawQuery = hVar2.mo134191i().f291093h.rawQuery("select *,rowid from MMStoryInfo  where " + "MMStoryInfo" + ".storyID = " + hc4.f298334d, (String[]) null);
                        int count = rawQuery.getCount();
                        rawQuery.close();
                        if (count > 0) {
                            hVar2.mo134191i().update(hc4.f298334d, qq);
                            hVar2.mo134191i().mo138664Ow(hc4.f298334d);
                        } else {
                            hVar2.mo134191i().mo138669bF(qq);
                        }
                    }
                }
                C99266g gVar = new C99266g();
                String str14 = xb4.f144577e;
                if (str14 == null) {
                    str14 = str11;
                }
                gVar.field_date = str14;
                gVar.field_count = xb4.f144579g;
                hVar2.mo134190h().mo138651Lo(gVar);
                int i9 = i2;
                int i15 = i3;
                str5 = str3;
                zb42 = zb4;
                it = it4;
                str2 = str11;
                str7 = str12;
                String str15 = str;
            }
            zb4 zb43 = zb42;
            String str16 = str5;
            String str17 = str7;
            if (this.f286271e == 0) {
                this.f286271e = zb43.f145797f.getFirst().f144576d;
            }
            this.f286278o = zb43.f145797f.getLast().f144576d;
            Log.m105925i(str16, "insertList mUserName %s maxId %s minId %s NewRequestTime %s", this.f286270d, Long.valueOf(this.f286271e), Long.valueOf(this.f286278o), Integer.valueOf(zb43.f145798g));
            C11385n nVar2 = this.f286274h;
            if (nVar2 != null) {
                nVar2.onSceneEnd(i2, i3, str, this);
            } else {
                C87412m.m108603p(str17);
                throw null;
            }
        }
    }
}
