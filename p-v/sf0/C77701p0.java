package sf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;

/* renamed from: sf0.p0 */
public class C77701p0 {

    /* renamed from: a */
    public final int f226480a;

    /* renamed from: b */
    public final int f226481b;

    /* renamed from: c */
    public final String f226482c;

    /* renamed from: d */
    public final String f226483d;

    public C77701p0(int i, int i2, String str) {
        int i3;
        String str2;
        int i4;
        int i5;
        Exception exc;
        String str3 = "";
        int i6 = 0;
        try {
            Map<String, String> parseXml = XmlParser.parseXml(str, "e", (String) null);
            if (parseXml != null) {
                i4 = Integer.valueOf(parseXml.get(".e.ShowType")).intValue();
                try {
                    i3 = Integer.valueOf(parseXml.get(".e.Action")).intValue();
                    try {
                        Integer.valueOf(parseXml.get(".e.DispSec")).intValue();
                        String str4 = parseXml.get(".e.Title");
                        str2 = parseXml.get(".e.Url");
                    } catch (Exception e) {
                        e = e;
                        str2 = str3;
                        Exception exc2 = e;
                        i5 = i3;
                        i6 = i4;
                        exc = exc2;
                        Log.m105920e("MicroMsg.UnifyErrorProcessor", exc.toString());
                        i4 = i6;
                        i3 = i5;
                        this.f226480a = i4;
                        this.f226481b = i3;
                        this.f226482c = str3;
                        this.f226483d = str2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = str3;
                    i6 = i4;
                    exc = e;
                    i5 = 0;
                    Log.m105920e("MicroMsg.UnifyErrorProcessor", exc.toString());
                    i4 = i6;
                    i3 = i5;
                    this.f226480a = i4;
                    this.f226481b = i3;
                    this.f226482c = str3;
                    this.f226483d = str2;
                }
                try {
                    str3 = parseXml.get(".e.Content");
                } catch (Exception e3) {
                    e = e3;
                    Exception exc22 = e;
                    i5 = i3;
                    i6 = i4;
                    exc = exc22;
                    Log.m105920e("MicroMsg.UnifyErrorProcessor", exc.toString());
                    i4 = i6;
                    i3 = i5;
                    this.f226480a = i4;
                    this.f226481b = i3;
                    this.f226482c = str3;
                    this.f226483d = str2;
                }
                this.f226480a = i4;
                this.f226481b = i3;
                this.f226482c = str3;
                this.f226483d = str2;
            }
            throw new IllegalArgumentException("values == null");
        } catch (Exception e4) {
            e = e4;
            str2 = str3;
            exc = e;
            i5 = 0;
            Log.m105920e("MicroMsg.UnifyErrorProcessor", exc.toString());
            i4 = i6;
            i3 = i5;
            this.f226480a = i4;
            this.f226481b = i3;
            this.f226482c = str3;
            this.f226483d = str2;
        }
    }
}
