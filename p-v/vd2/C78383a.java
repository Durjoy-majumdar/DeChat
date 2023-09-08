package vd2;

import bp3.C67301m;
import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Iterator;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64418hb3;
import te3.C77946ib3;

/* renamed from: vd2.a */
public class C78383a extends C68066g {

    /* renamed from: b */
    public C64418hb3 f229698b = new C64418hb3();

    /* renamed from: a */
    public C68066g mo7615a() {
        C78383a aVar = new C78383a();
        aVar.f229698b = this.f229698b;
        return aVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C64418hb3 hb32 = this.f229698b;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("<patMsg>");
        sb4.append("<chatUser>");
        sb4.append(Util.nullAs(hb32.f183463d, ""));
        sb4.append("</chatUser>");
        sb4.append("<records>");
        sb4.append("<recordNum>");
        sb4.append(hb32.f183464e.size());
        sb4.append("</recordNum>");
        Iterator<C77946ib3> it = hb32.f183464e.iterator();
        while (it.hasNext()) {
            C77946ib3 next = it.next();
            sb4.append("<record>");
            sb4.append("<fromUser>");
            sb4.append(Util.nullAs(next.f227607d, ""));
            sb4.append("</fromUser>");
            sb4.append("<pattedUser>");
            sb4.append(Util.nullAs(next.f227608e, ""));
            sb4.append("</pattedUser>");
            sb4.append("<template>");
            sb4.append(XmlParser.getCDataWrapper(next.f227609f));
            sb4.append("</template>");
            if (next instanceof C67301m.C67302a) {
                sb4.append("<templete>");
                sb4.append(XmlParser.getCDataWrapper(((C67301m.C67302a) next).f193143o));
                sb4.append("</templete>");
            }
            sb4.append("<createTime>");
            sb4.append(next.f227610g);
            sb4.append("</createTime>");
            sb4.append("<readStatus>");
            sb4.append(next.f227611h);
            sb4.append("</readStatus>");
            sb4.append("<svrId>");
            sb4.append(next.f227612i);
            sb4.append("</svrId>");
            sb4.append("<showModifyTip>");
            sb4.append(next.f227613j);
            sb4.append("</showModifyTip>");
            sb4.append("<isNewPatMsg>");
            sb4.append(next.f227614n);
            sb4.append("</isNewPatMsg>");
            sb4.append("</record>");
        }
        sb4.append("</records>");
        sb4.append("</patMsg>");
        sb.append(sb4.toString());
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        this.f229698b = C67301m.m79640e(".msg.appmsg", map);
    }
}
