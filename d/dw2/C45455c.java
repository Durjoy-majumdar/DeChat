package dw2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cw2.C97393p;
import gy3.C87412m;
import java.util.LinkedList;
import kw2.C99268i;
import kw2.C99269j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import sl0.C22368l;
import te3.hc4;
import te3.tb4;
import te3.ub4;

/* renamed from: dw2.c */
public final class C45455c extends C117747y implements C1311n {

    /* renamed from: d */
    public String f123028d;

    /* renamed from: e */
    public long f123029e;

    /* renamed from: f */
    public String f123030f;

    /* renamed from: g */
    public C47350c f123031g;

    /* renamed from: h */
    public int f123032h;

    /* renamed from: i */
    public C11385n f123033i;

    public C45455c(String str, long j, String str2) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_DATE);
        this.f123028d = str;
        this.f123029e = j;
        this.f123030f = str2;
        if (j == 0) {
            Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "fp mUserName " + this.f123028d);
        } else {
            Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "np mUserName " + this.f123028d);
        }
        this.f123032h = 4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new tb4();
        bVar.f127067b = new ub4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmstorydatedetail";
        bVar.f127069d = C22368l.CTRL_INDEX;
        int i = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123031g = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryDateDetailRequest");
        tb4 tb4 = (tb4) aVar;
        tb4.f142108d = this.f123028d;
        tb4.f142111g = this.f123029e;
        try {
            String timeZoneOffset = Util.getTimeZoneOffset();
            C87412m.m108593f(timeZoneOffset, "getTimeZoneOffset()");
            i = (int) Float.parseFloat(timeZoneOffset);
        } catch (Exception unused) {
        }
        tb4.f142109e = i;
        tb4.f142110f = this.f123030f;
        Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "req.mUserName:" + tb4.f142108d + " req.MaxId:" + tb4.f142111g + " req.TimeZone:" + tb4.f142109e + " req.Date:" + tb4.f142110f);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(nVar, "callback");
        this.f123033i = nVar;
        return dispatch(gVar, this.f123031g, this);
    }

    public int getType() {
        return C22368l.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        int i4 = i2;
        int i5 = i3;
        String str3 = str;
        Log.m105918d("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "netId=" + i + " errType=" + i4 + " errCode=" + i5 + " errMsg=" + str3);
        C47465a aVar = this.f123031g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryDateDetailResponse");
        ub4 ub4 = (ub4) aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("objCount: ");
        sb.append(ub4.f142725d);
        sb.append(", expiredTime: ");
        sb.append(ub4.f142729h);
        Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", sb.toString());
        String str4 = "callback";
        if (ub4.f142726e.isEmpty()) {
            Log.m105918d("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "error: server give size zero");
            C11385n nVar = this.f123033i;
            if (nVar != null) {
                nVar.onSceneEnd(i4, i5, str3, this);
            } else {
                C87412m.m108603p(str4);
                throw null;
            }
        } else {
            C97393p.C97394a aVar2 = C97393p.f285894a;
            String str5 = this.f123028d;
            LinkedList<hc4> linkedList = ub4.f142726e;
            int i6 = this.f123032h;
            C87412m.m108594g(str5, "userName");
            if (linkedList == null || linkedList.isEmpty()) {
                str2 = str4;
                new LinkedList();
            } else {
                LinkedList linkedList2 = new LinkedList();
                C99269j i7 = StoryCore.f281736t.mo134191i();
                int size = linkedList.size();
                int i8 = 0;
                while (i8 < size) {
                    hc4 hc4 = linkedList.get(i8);
                    StringBuilder sb4 = new StringBuilder();
                    int i9 = size;
                    sb4.append("storyObj.id:");
                    String str6 = str4;
                    sb4.append(hc4.f298334d);
                    Log.m105918d("MicroMsg.StoryInfoStorageLogic", sb4.toString());
                    C99268i qq = i7.mo138674qq(hc4.f298334d);
                    if (qq == null) {
                        qq = new C99268i();
                    }
                    if (!(aVar2.mo136660d(qq, hc4, i6) == 0 || qq.field_storyID == 0)) {
                        linkedList2.add(qq);
                    }
                    i8++;
                    size = i9;
                    str4 = str6;
                }
                str2 = str4;
            }
            if (this.f123029e == 0) {
                this.f123029e = ub4.f142726e.getFirst().f298334d;
            }
            Log.m105925i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "insertList mUserName %s maxId %s minId %s", this.f123028d, Long.valueOf(this.f123029e), 0L);
            C11385n nVar2 = this.f123033i;
            if (nVar2 != null) {
                nVar2.onSceneEnd(i4, i5, str3, this);
            } else {
                C87412m.m108603p(str2);
                throw null;
            }
        }
    }
}
