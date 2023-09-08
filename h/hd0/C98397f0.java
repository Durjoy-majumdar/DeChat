package hd0;

import com.tencent.p014mm.autogen.mmdata.rpt.DownloadVideoInfoStruct;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p663qo.C101211h;
import u13.C101938c;

/* renamed from: hd0.f0 */
public class C98397f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f288484d;

    /* renamed from: e */
    public final /* synthetic */ String[] f288485e;

    /* renamed from: f */
    public final /* synthetic */ String f288486f;

    /* renamed from: g */
    public final /* synthetic */ String f288487g;

    /* renamed from: h */
    public final /* synthetic */ int f288488h;

    /* renamed from: i */
    public final /* synthetic */ String f288489i;

    /* renamed from: j */
    public final /* synthetic */ String f288490j;

    /* renamed from: n */
    public final /* synthetic */ long f288491n;

    /* renamed from: o */
    public final /* synthetic */ long f288492o;

    /* renamed from: p */
    public final /* synthetic */ int f288493p;

    /* renamed from: q */
    public final /* synthetic */ int f288494q;

    /* renamed from: r */
    public final /* synthetic */ String f288495r;

    public C98397f0(String str, String[] strArr, String str2, String str3, int i, String str4, String str5, long j, long j2, int i2, int i3, String str6) {
        this.f288484d = str;
        this.f288485e = strArr;
        this.f288486f = str2;
        this.f288487g = str3;
        this.f288488h = i;
        this.f288489i = str4;
        this.f288490j = str5;
        this.f288491n = j;
        this.f288492o = j2;
        this.f288493p = i2;
        this.f288494q = i3;
        this.f288495r = str6;
    }

    public void run() {
        C94554a c = C94555d.m119567c(this.f288484d, true);
        if (c == null) {
            Log.m105929w("MicroMsg.SubCoreMediaRpt", "get media info is null. %s", this.f288484d);
            return;
        }
        int l = (int) C86013q1.m106451l(this.f288484d);
        String str = null;
        if (this.f288485e != null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (String append : this.f288485e) {
                stringBuffer.append(append);
                stringBuffer.append("|");
            }
            str = stringBuffer.toString();
        }
        int iOSOldNetType = NetStatusUtil.getIOSOldNetType(MMApplicationContext.getContext());
        String k7 = ((C101211h) C86312j.m106911c(C101211h.class)).mo140292k7(this.f288484d);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.f288486f);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f288487g);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f288488h);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f288489i);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f288490j);
        stringBuffer2.append(",");
        stringBuffer2.append(iOSOldNetType);
        stringBuffer2.append(",");
        stringBuffer2.append(k7);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f288491n);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f288492o);
        stringBuffer2.append(",");
        stringBuffer2.append(l);
        stringBuffer2.append(",");
        stringBuffer2.append(c.f273443a);
        stringBuffer2.append(",");
        stringBuffer2.append(c.f273444b / 1000);
        stringBuffer2.append(",");
        stringBuffer2.append(c.f273449g / 1000);
        stringBuffer2.append(",");
        stringBuffer2.append(c.f273447e);
        stringBuffer2.append(",");
        stringBuffer2.append(c.f273445c);
        stringBuffer2.append(",");
        stringBuffer2.append(c.f273446d);
        stringBuffer2.append(",");
        stringBuffer2.append(str);
        stringBuffer2.append(",");
        stringBuffer2.append(c.f273448f);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f288493p);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f288494q);
        stringBuffer2.append(",");
        stringBuffer2.append(C101938c.m134167a(this.f288495r));
        Log.m105925i("MicroMsg.SubCoreMediaRpt", "download video rpt %s ", stringBuffer2.toString());
        new DownloadVideoInfoStruct(stringBuffer2.toString()).mo86054n();
    }
}
