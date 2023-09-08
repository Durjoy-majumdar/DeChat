package u73;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: u73.r0 */
public class C90621r0 extends C68066g {

    /* renamed from: b */
    public String f260345b;

    /* renamed from: c */
    public String f260346c;

    /* renamed from: d */
    public String f260347d;

    /* renamed from: e */
    public String f260348e;

    /* renamed from: f */
    public long f260349f;

    /* renamed from: g */
    public String f260350g;

    /* renamed from: h */
    public String f260351h;

    /* renamed from: i */
    public String f260352i;

    /* renamed from: j */
    public String f260353j;

    /* renamed from: k */
    public String f260354k;

    /* renamed from: l */
    public String f260355l;

    /* renamed from: m */
    public String f260356m;

    /* renamed from: n */
    public String f260357n;

    /* renamed from: o */
    public String f260358o;

    /* renamed from: p */
    public String f260359p;

    /* renamed from: q */
    public String f260360q;

    /* renamed from: r */
    public String f260361r;

    /* renamed from: s */
    public long f260362s;

    /* renamed from: t */
    public String f260363t;

    /* renamed from: u */
    public String f260364u;

    /* renamed from: a */
    public C68066g mo7615a() {
        C90621r0 r0Var = new C90621r0();
        r0Var.f260345b = this.f260345b;
        r0Var.f260346c = this.f260346c;
        r0Var.f260347d = this.f260347d;
        r0Var.f260348e = this.f260348e;
        r0Var.f260349f = this.f260349f;
        r0Var.f260350g = this.f260350g;
        r0Var.f260351h = this.f260351h;
        r0Var.f260352i = this.f260352i;
        r0Var.f260353j = this.f260353j;
        r0Var.f260354k = this.f260354k;
        r0Var.f260355l = this.f260355l;
        r0Var.f260356m = this.f260356m;
        r0Var.f260357n = this.f260357n;
        r0Var.f260358o = this.f260358o;
        r0Var.f260359p = this.f260359p;
        r0Var.f260360q = this.f260360q;
        r0Var.f260361r = this.f260361r;
        r0Var.f260362s = this.f260362s;
        r0Var.f260363t = this.f260363t;
        r0Var.f260364u = this.f260364u;
        return r0Var;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        sb.append("<websearch>");
        if (!Util.isNullOrNil(this.f260345b)) {
            sb.append("<relevant_vid>");
            sb.append(C68070l.C68072b.m80417g(this.f260345b));
            sb.append("</relevant_vid>");
        }
        if (!Util.isNullOrNil(this.f260346c)) {
            sb.append("<relevant_expand>");
            sb.append(C68070l.C68072b.m80417g(this.f260346c));
            sb.append("</relevant_expand>");
        }
        if (!Util.isNullOrNil(this.f260346c)) {
            sb.append("<relevant_expand>");
            sb.append(C68070l.C68072b.m80417g(this.f260346c));
            sb.append("</relevant_expand>");
        }
        if (!Util.isNullOrNil(this.f260347d)) {
            sb.append("<relevant_pre_searchid>");
            sb.append(C68070l.C68072b.m80417g(this.f260347d));
            sb.append("</relevant_pre_searchid>");
        }
        if (!Util.isNullOrNil(this.f260348e)) {
            sb.append("<relevant_shared_openid>");
            sb.append(C68070l.C68072b.m80417g(this.f260348e));
            sb.append("</relevant_shared_openid>");
        }
        if (this.f260349f >= 0) {
            sb.append("<rec_category>");
            sb.append(this.f260349f);
            sb.append("</rec_category>");
        }
        if (!Util.isNullOrNil(this.f260350g)) {
            sb.append("<shareUrl>");
            sb.append(C68070l.C68072b.m80417g(this.f260350g));
            sb.append("</shareUrl>");
        }
        if (!Util.isNullOrNil(this.f260351h)) {
            sb.append("<shareTitle>");
            sb.append(C68070l.C68072b.m80417g(this.f260351h));
            sb.append("</shareTitle>");
        }
        if (!Util.isNullOrNil(this.f260352i)) {
            sb.append("<shareDesc>");
            sb.append(C68070l.C68072b.m80417g(this.f260352i));
            sb.append("</shareDesc>");
        }
        if (!Util.isNullOrNil(this.f260353j)) {
            sb.append("<shareImgUrl>");
            sb.append(C68070l.C68072b.m80417g(this.f260353j));
            sb.append("</shareImgUrl>");
        }
        if (!Util.isNullOrNil(this.f260354k)) {
            sb.append("<shareString>");
            sb.append(C68070l.C68072b.m80417g(this.f260354k));
            sb.append("</shareString>");
        }
        if (!Util.isNullOrNil(this.f260355l)) {
            sb.append("<shareStringUrl>");
            sb.append(C68070l.C68072b.m80417g(this.f260355l));
            sb.append("</shareStringUrl>");
        }
        if (!Util.isNullOrNil(this.f260356m)) {
            sb.append("<source>");
            sb.append(C68070l.C68072b.m80417g(this.f260356m));
            sb.append("</source>");
        }
        if (!Util.isNullOrNil(this.f260357n)) {
            sb.append("<sourceUrl>");
            sb.append(C68070l.C68072b.m80417g(this.f260357n));
            sb.append("</sourceUrl>");
        }
        if (!Util.isNullOrNil(this.f260358o)) {
            sb.append("<strPlayCount>");
            sb.append(C68070l.C68072b.m80417g(this.f260358o));
            sb.append("</strPlayCount>");
        }
        if (!Util.isNullOrNil(this.f260359p)) {
            sb.append("<titleUrl>");
            sb.append(C68070l.C68072b.m80417g(this.f260359p));
            sb.append("</titleUrl>");
        }
        if (!Util.isNullOrNil(this.f260360q)) {
            sb.append("<extReqParams>");
            sb.append(C68070l.C68072b.m80417g(this.f260360q));
            sb.append("</extReqParams>");
        }
        if (!Util.isNullOrNil(this.f260361r)) {
            sb.append("<tagList>");
            sb.append(C68070l.C68072b.m80417g(this.f260361r));
            sb.append("</tagList>");
        }
        if (this.f260362s >= 0) {
            sb.append("<channelId>");
            sb.append(this.f260362s);
            sb.append("</channelId>");
        }
        if (!Util.isNullOrNil(this.f260363t)) {
            sb.append("<thumbUrl>");
            sb.append(C68070l.C68072b.m80417g(this.f260363t));
            sb.append("</thumbUrl>");
        }
        if (!Util.isNullOrNil(this.f260364u)) {
            sb.append("<shareTag>");
            sb.append(C68070l.C68072b.m80417g(this.f260364u));
            sb.append("</shareTag>");
        }
        sb.append("</websearch>");
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        this.f260345b = map.get(".msg.appmsg.websearch.relevant_vid");
        this.f260346c = map.get(".msg.appmsg.websearch.relevant_expand");
        this.f260347d = map.get(".msg.appmsg.websearch.relevant_pre_searchid");
        this.f260348e = map.get(".msg.appmsg.websearch.relevant_shared_openid");
        this.f260349f = (long) Util.getInt(map.get(".msg.appmsg.websearch.rec_category"), -1);
        this.f260350g = map.get(".msg.appmsg.websearch.shareUrl");
        this.f260351h = map.get(".msg.appmsg.websearch.shareTitle");
        this.f260352i = map.get(".msg.appmsg.websearch.shareDesc");
        this.f260353j = map.get(".msg.appmsg.websearch.shareImgUrl");
        this.f260354k = map.get(".msg.appmsg.websearch.shareString");
        this.f260355l = map.get(".msg.appmsg.websearch.shareStringUrl");
        this.f260356m = map.get(".msg.appmsg.websearch.source");
        this.f260357n = map.get(".msg.appmsg.websearch.sourceUrl");
        this.f260358o = map.get(".msg.appmsg.websearch.strPlayCount");
        this.f260359p = map.get(".msg.appmsg.websearch.titleUrl");
        this.f260360q = map.get(".msg.appmsg.websearch.extReqParams");
        this.f260361r = map.get(".msg.appmsg.websearch.tagList");
        this.f260362s = Util.getLong(map.get(".msg.appmsg.websearch.channelId"), -1);
        this.f260363t = map.get(".msg.appmsg.websearch.thumbUrl");
        this.f260364u = map.get(".msg.appmsg.websearch.shareTag");
    }
}
