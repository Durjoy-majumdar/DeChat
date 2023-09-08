package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.m */
public class C72916m extends C68066g {

    /* renamed from: b */
    public String f212519b = "";

    /* renamed from: c */
    public String f212520c = "";

    /* renamed from: d */
    public String f212521d = "";

    /* renamed from: e */
    public String f212522e = "";

    /* renamed from: f */
    public String f212523f = "";

    /* renamed from: g */
    public String f212524g = "";

    /* renamed from: h */
    public String f212525h = "";

    /* renamed from: i */
    public String f212526i = "";

    /* renamed from: j */
    public String f212527j = "";

    /* renamed from: k */
    public String f212528k = "";

    /* renamed from: l */
    public String f212529l = "";

    /* renamed from: m */
    public String f212530m = "";

    /* renamed from: n */
    public int f212531n = 0;

    /* renamed from: o */
    public String f212532o = "";

    /* renamed from: p */
    public String f212533p = "";

    /* renamed from: q */
    public String f212534q = "";

    /* renamed from: a */
    public C68066g mo7615a() {
        C72916m mVar = new C72916m();
        mVar.f212519b = this.f212519b;
        mVar.f212520c = this.f212520c;
        mVar.f212521d = this.f212521d;
        mVar.f212522e = this.f212522e;
        mVar.f212523f = this.f212523f;
        mVar.f212524g = this.f212524g;
        mVar.f212525h = this.f212525h;
        mVar.f212526i = this.f212526i;
        mVar.f212527j = this.f212527j;
        mVar.f212528k = this.f212528k;
        mVar.f212529l = this.f212529l;
        mVar.f212530m = this.f212530m;
        mVar.f212531n = this.f212531n;
        mVar.f212533p = this.f212533p;
        mVar.f212534q = this.f212534q;
        return mVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        if (!Util.isNullOrNil(this.f212519b)) {
            sb.append("<songalbumurl>");
            sb.append(Util.escapeStringForXml(this.f212519b));
            sb.append("</songalbumurl>");
        }
        if (!Util.isNullOrNil(this.f212520c)) {
            sb.append("<songlyric>");
            sb.append(Util.escapeStringForXml(this.f212520c));
            sb.append("</songlyric>");
        }
        sb.append("<musicShareItem>");
        if (!Util.isNullOrNil(this.f212521d)) {
            sb.append("<mvObjectId>");
            sb.append(Util.escapeStringForXml(this.f212521d));
            sb.append("</mvObjectId>");
        }
        if (!Util.isNullOrNil(this.f212522e)) {
            sb.append("<mvNonceId>");
            sb.append(Util.escapeStringForXml(this.f212522e));
            sb.append("</mvNonceId>");
        }
        if (!Util.isNullOrNil(this.f212523f)) {
            sb.append("<mvCoverUrl>");
            sb.append(Util.escapeStringForXml(this.f212523f));
            sb.append("</mvCoverUrl>");
        }
        if (!Util.isNullOrNil(this.f212524g)) {
            sb.append("<mvMakerFinderNickname>");
            sb.append(Util.escapeStringForXml(this.f212524g));
            sb.append("</mvMakerFinderNickname>");
        }
        if (!Util.isNullOrNil(this.f212525h)) {
            sb.append("<mvSingerName>");
            sb.append(Util.escapeStringForXml(this.f212525h));
            sb.append("</mvSingerName>");
        }
        if (!Util.isNullOrNil(this.f212526i)) {
            sb.append("<mvAlbumName>");
            sb.append(Util.escapeStringForXml(this.f212526i));
            sb.append("</mvAlbumName>");
        }
        if (!Util.isNullOrNil(this.f212527j)) {
            sb.append("<mvMusicGenre>");
            sb.append(Util.escapeStringForXml(this.f212527j));
            sb.append("</mvMusicGenre>");
        }
        if (!Util.isNullOrNil(this.f212528k)) {
            sb.append("<mvIssueDate>");
            sb.append(Util.escapeStringForXml(this.f212528k));
            sb.append("</mvIssueDate>");
        }
        if (!Util.isNullOrNil(this.f212529l)) {
            sb.append("<mvIdentification>");
            sb.append(Util.escapeStringForXml(this.f212529l));
            sb.append("</mvIdentification>");
        }
        sb.append("<musicDuration>");
        sb.append(this.f212531n);
        sb.append("</musicDuration>");
        if (!Util.isNullOrNil(this.f212530m)) {
            sb.append("<mvExtInfo>");
            sb.append(Util.escapeStringForXml(this.f212530m));
            sb.append("</mvExtInfo>");
        }
        if (!Util.isNullOrNil(this.f212532o)) {
            sb.append("<mvOperationUrl>");
            sb.append(Util.escapeStringForXml(this.f212532o));
            sb.append("</mvOperationUrl>");
        }
        if (!Util.isNullOrNil(this.f212533p)) {
            sb.append("<mid>");
            sb.append(Util.escapeStringForXml(this.f212533p));
            sb.append("</mid>");
        }
        if (!Util.isNullOrNil(this.f212534q)) {
            sb.append("<appIdForSourceDisplay>");
            sb.append(Util.escapeStringForXml(this.f212534q));
            sb.append("</appIdForSourceDisplay>");
        }
        sb.append("</musicShareItem>");
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        this.f212519b = map.get(".msg.appmsg.songalbumurl");
        this.f212520c = map.get(".msg.appmsg.songlyric");
        this.f212521d = map.get(".msg.appmsg.musicShareItem.mvObjectId");
        this.f212522e = map.get(".msg.appmsg.musicShareItem.mvNonceId");
        this.f212523f = map.get(".msg.appmsg.musicShareItem.mvCoverUrl");
        this.f212524g = map.get(".msg.appmsg.musicShareItem.mvMakerFinderNickname");
        this.f212525h = map.get(".msg.appmsg.musicShareItem.mvSingerName");
        this.f212526i = map.get(".msg.appmsg.musicShareItem.mvAlbumName");
        this.f212527j = map.get(".msg.appmsg.musicShareItem.mvMusicGenre");
        this.f212528k = map.get(".msg.appmsg.musicShareItem.mvIssueDate");
        this.f212529l = map.get(".msg.appmsg.musicShareItem.mvIdentification");
        this.f212530m = map.get(".msg.appmsg.musicShareItem.mvExtInfo");
        this.f212531n = Util.safeParseInt(map.get(".msg.appmsg.musicShareItem.musicDuration"));
        this.f212532o = map.get(".msg.appmsg.musicShareItem.mvOperationUrl");
        this.f212533p = map.get(".msg.appmsg.musicShareItem.mid");
        this.f212534q = map.get(".msg.appmsg.musicShareItem.appIdForSourceDisplay");
    }
}
