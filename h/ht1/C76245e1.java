package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: ht1.e1 */
public class C76245e1 extends C68066g {

    /* renamed from: b */
    public String f223338b;

    /* renamed from: c */
    public String f223339c;

    /* renamed from: d */
    public String f223340d;

    /* renamed from: e */
    public int f223341e;

    /* renamed from: f */
    public String f223342f;

    /* renamed from: a */
    public C68066g mo7615a() {
        C76245e1 e1Var = new C76245e1();
        e1Var.f223338b = this.f223338b;
        e1Var.f223339c = this.f223339c;
        e1Var.f223340d = this.f223340d;
        e1Var.f223341e = this.f223341e;
        e1Var.f223342f = this.f223342f;
        return e1Var;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        sb.append("<finderGuarantee>");
        if (!Util.isNullOrNil(this.f223338b)) {
            sb.append("<title>");
            sb.append(C68070l.C68072b.m80417g(this.f223338b));
            sb.append("</title>");
        }
        if (!Util.isNullOrNil(this.f223339c)) {
            sb.append("<desc>");
            sb.append(C68070l.C68072b.m80417g(this.f223339c));
            sb.append("</desc>");
        }
        if (!Util.isNullOrNil(this.f223340d)) {
            sb.append("<relativePath>");
            sb.append(C68070l.C68072b.m80417g(this.f223340d));
            sb.append("</relativePath>");
        }
        if (!Util.isNullOrNil(this.f223342f)) {
            sb.append("<appid>");
            sb.append(C68070l.C68072b.m80417g(this.f223342f));
            sb.append("</appid>");
        }
        sb.append("<scene>");
        sb.append(C68070l.C68072b.m80417g(String.valueOf(this.f223341e)));
        sb.append("</scene>");
        sb.append("</finderGuarantee>");
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        this.f223338b = map.get(".msg.appmsg.finderGuarantee.title");
        this.f223339c = map.get(".msg.appmsg.finderGuarantee.desc");
        this.f223340d = map.get(".msg.appmsg.finderGuarantee.relativePath");
        this.f223342f = map.get(".msg.appmsg.finderGuarantee.appid");
        this.f223341e = Util.getInt(map.get(".msg.appmsg.finderGuarantee.scene"), 0);
    }
}
