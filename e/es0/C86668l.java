package es0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.LinkedList;
import te3.C90406da0;
import te3.C90419io3;
import te3.C90425kw;

/* renamed from: es0.l */
public class C86668l {

    /* renamed from: a */
    public long f251653a = 0;

    /* renamed from: b */
    public long f251654b = 0;

    /* renamed from: c */
    public long f251655c = 0;

    /* renamed from: d */
    public boolean f251656d = false;

    /* renamed from: e */
    public HashMap<String, C90406da0> f251657e = new HashMap<>();

    /* renamed from: f */
    public LinkedList<C90425kw> f251658f = new LinkedList<>();

    /* renamed from: g */
    public HashMap<String, C90425kw> f251659g = new HashMap<>();

    /* renamed from: a */
    public final C90425kw mo121062a(int i, C90419io3 io32) {
        C90425kw kwVar = new C90425kw();
        kwVar.f259658d = io32.f259585f;
        kwVar.f259659e = io32.f259594r;
        kwVar.f259662h = io32.f259596t;
        kwVar.f259664j = io32.f259586g;
        kwVar.f259665n = io32.f259587h;
        kwVar.f259666o = io32.f259583d;
        kwVar.f259667p = io32.f259599w;
        kwVar.f259668q = i + 1;
        WxaAttributes LL = C81161g2.Cx0().mo114000LL(io32.f259585f, new String[0]);
        if (LL != null) {
            kwVar.f259663i = LL.field_appId;
        }
        return kwVar;
    }

    /* renamed from: b */
    public void mo121063b() {
        long nowSecond = Util.nowSecond();
        this.f251654b = nowSecond;
        this.f251653a = nowSecond;
        this.f251656d = false;
        this.f251657e.clear();
        this.f251658f.clear();
        this.f251659g.clear();
        this.f251655c = 0;
    }
}
