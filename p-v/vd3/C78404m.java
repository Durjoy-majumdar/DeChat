package vd3;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;

/* renamed from: vd3.m */
public class C78404m {

    /* renamed from: a */
    public int f229734a = -7829368;

    /* renamed from: b */
    public boolean f229735b = false;

    /* renamed from: c */
    public int f229736c = -1593835521;

    /* renamed from: d */
    public boolean f229737d = false;

    /* renamed from: e */
    public boolean f229738e = false;

    /* renamed from: f */
    public boolean f229739f = false;

    /* renamed from: g */
    public int f229740g = 0;

    /* renamed from: h */
    public boolean f229741h = false;

    public C78404m(String str, Context context) {
        Map<String, String> parseXml = XmlParser.parseXml(str, "chatbg", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.ChatBgAttr", "parse chatbgattr failed, values is null");
            return;
        }
        try {
            Util.nullAsNil(Integer.valueOf(parseXml.get(".chatbg" + ".$version")));
            this.f229734a = (int) Util.nullAs(Long.valueOf(Long.parseLong(parseXml.get(".chatbg" + ".$time_color"), 16)), (long) context.getResources().getColor(C0966R.color.FG_2));
            this.f229735b = Util.nullAsFalse(Boolean.valueOf(parseXml.get(".chatbg" + ".$time_show_shadow_color")));
            this.f229736c = (int) Util.nullAs(Long.valueOf(Long.parseLong(parseXml.get(".chatbg" + ".$time_shadow_color"), 16)), 0);
            this.f229737d = Util.nullAsFalse(Boolean.valueOf(parseXml.get(".chatbg" + ".$time_show_background")));
            this.f229738e = Util.nullAsFalse(Boolean.valueOf(parseXml.get(".chatbg" + ".$time_light_background")));
            Util.nullAs(Long.valueOf(Long.parseLong(parseXml.get(".chatbg" + ".$voice_second_color"), 16)), -16777216);
            this.f229739f = Util.nullAsFalse(Boolean.valueOf(parseXml.get(".chatbg" + ".$voice_second_show_shadow_color")));
            this.f229740g = (int) Util.nullAs(Long.valueOf(Long.parseLong(parseXml.get(".chatbg" + ".$voice_second_shadow_color"), 16)), 0);
            this.f229741h = Util.nullAsFalse(Boolean.valueOf(parseXml.get(".chatbg" + ".$voice_second_show_background")));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ChatBgAttr", "parse chatbgattr failed");
            Log.printErrStackTrace("MicroMsg.ChatBgAttr", e, "", new Object[0]);
        }
    }
}
