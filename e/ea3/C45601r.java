package ea3;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import kj2.C117407d;

/* renamed from: ea3.r */
public final class C45601r {

    /* renamed from: a */
    public long f123323a;

    /* renamed from: b */
    public String f123324b = "";

    /* renamed from: c */
    public boolean f123325c;

    /* renamed from: d */
    public int f123326d;

    /* renamed from: e */
    public int f123327e;

    /* renamed from: f */
    public String f123328f = "";

    /* renamed from: g */
    public String f123329g = "";

    /* renamed from: h */
    public String f123330h = "";

    /* renamed from: i */
    public int f123331i = -1;

    /* renamed from: a */
    public final void mo71118a(int i) {
        Object[] objArr;
        if (this.f123331i <= 0) {
            this.f123331i = i;
            long currentTimeMillis = System.currentTimeMillis() - this.f123323a;
            if (currentTimeMillis < 0 || currentTimeMillis > 86400000) {
                currentTimeMillis = 0;
            }
            C117407d dVar = C117407d.INSTANCE;
            Object[] objArr2 = new Object[10];
            objArr2[0] = WebViewUtilities.doUrlEncode(this.f123324b);
            String str = this.f123324b;
            String str2 = "";
            if (str == null) {
                objArr = objArr2;
            } else {
                try {
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("__biz");
                    objArr = objArr2;
                    try {
                        long j = Util.getLong(parse.getQueryParameter("mid"), 0);
                        int i2 = Util.getInt(parse.getQueryParameter("idx"), 0);
                        if (!Util.isNullOrNil(queryParameter)) {
                            if (j >= 0) {
                                String str3 = "id://local/i.html?__biz=" + queryParameter + "&mid=" + j + "&idx=" + i2;
                                Log.m105918d("MicroMsg.WebViewLongClickReportHelper", "urlId=" + str3);
                                str2 = str3;
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.m105920e("MicroMsg.WebViewLongClickReportHelper", "getUrlId ex " + e.getMessage());
                        objArr[1] = str2;
                        objArr[2] = Integer.valueOf(this.f123325c ? 1 : 0);
                        objArr[3] = Integer.valueOf(this.f123326d);
                        objArr[4] = Integer.valueOf(this.f123327e);
                        objArr[5] = Long.valueOf(currentTimeMillis);
                        objArr[6] = WebViewUtilities.doUrlEncode(this.f123328f);
                        objArr[7] = this.f123329g;
                        objArr[8] = Integer.valueOf(i);
                        objArr[9] = this.f123330h;
                        dVar.mo160131h(19208, objArr);
                    }
                } catch (Exception e2) {
                    e = e2;
                    objArr = objArr2;
                    Log.m105920e("MicroMsg.WebViewLongClickReportHelper", "getUrlId ex " + e.getMessage());
                    objArr[1] = str2;
                    objArr[2] = Integer.valueOf(this.f123325c ? 1 : 0);
                    objArr[3] = Integer.valueOf(this.f123326d);
                    objArr[4] = Integer.valueOf(this.f123327e);
                    objArr[5] = Long.valueOf(currentTimeMillis);
                    objArr[6] = WebViewUtilities.doUrlEncode(this.f123328f);
                    objArr[7] = this.f123329g;
                    objArr[8] = Integer.valueOf(i);
                    objArr[9] = this.f123330h;
                    dVar.mo160131h(19208, objArr);
                }
            }
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(this.f123325c ? 1 : 0);
            objArr[3] = Integer.valueOf(this.f123326d);
            objArr[4] = Integer.valueOf(this.f123327e);
            objArr[5] = Long.valueOf(currentTimeMillis);
            objArr[6] = WebViewUtilities.doUrlEncode(this.f123328f);
            objArr[7] = this.f123329g;
            objArr[8] = Integer.valueOf(i);
            objArr[9] = this.f123330h;
            dVar.mo160131h(19208, objArr);
        }
    }
}
