package p661qj;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import java.util.Map;
import nj3.C76879j;
import p03.C21912d;
import p773yy.C79168k;
import qe3.C89625d;
import yc3.C38992a;

/* renamed from: qj.j */
public class C89679j implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f257923a = 0;

    static {
        C30650a.m39147b(new C89679j(), "//version");
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("[ver  ] %s %08X\n", new Object[]{ChannelUtil.formatVersion(context, C89625d.f257841g, true), Integer.valueOf(C89625d.f257841g)}));
        sb.append(BuildInfo.info());
        sb.append(String.format("[cid  ] %d\n", new Object[]{Integer.valueOf(ChannelUtil.channelId)}));
        sb.append(String.format("[s.ver] %d\n", new Object[]{Integer.valueOf(C43471q.m46977a(0))}));
        sb.append(String.format("[l.ver] %d %s\n", new Object[]{Integer.valueOf(C43471q.m46977a(1)), ((C21912d) C86312j.m106911c(C21912d.class)).mo34965kw()}));
        sb.append(String.format("[w.ver] %d\n", new Object[]{Integer.valueOf(C43471q.m46977a(3))}));
        sb.append(String.format("[b.ver] %d\n", new Object[]{Integer.valueOf(C43471q.m46977a(2))}));
        sb.append(String.format("[ts.ver] %d\n", new Object[]{Long.valueOf(((C79168k) C86312j.m106911c(C79168k.class)).mo74118OU())}));
        sb.append(String.format("[r.ver] %s\n", new Object[]{BuildInfo.CLIENT_VERSION}));
        if (BuildInfo.EX_DEVICE_LOGIN) {
            try {
                Map<String, String> parseXml = XmlParser.parseXml(Util.convertStreamToString(context.getAssets().open("merged_features.xml")), "merged", (String) null);
                if (parseXml != null) {
                    int i = 0;
                    while (true) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(".merged.feature");
                        sb4.append(i > 0 ? String.valueOf(i) : "");
                        String str2 = parseXml.get(sb4.toString());
                        if (str2 == null) {
                            break;
                        }
                        sb.append(String.format("[feature#%02d] %s\n", new Object[]{Integer.valueOf(i), str2}));
                        i++;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Version", e, "", new Object[0]);
            }
        }
        TextView textView = new TextView(context);
        textView.setText(sb);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(C0966R.color.FG_0));
        textView.setTypeface(Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        C76879j.m92746q(context, (String) null, textView, (DialogInterface.OnClickListener) null);
        return true;
    }
}
