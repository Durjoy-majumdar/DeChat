package vd3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.model.C19444f1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19568o0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import qo3.C101218e0;

/* renamed from: vd3.b0 */
public final class C22744b0 implements C22751q {

    /* renamed from: a */
    public final Context f65437a;

    /* renamed from: b */
    public final String f65438b;

    /* renamed from: c */
    public final String f65439c;

    /* renamed from: d */
    public final String f65440d;

    /* renamed from: e */
    public final String f65441e;

    /* renamed from: f */
    public final String f65442f;

    /* renamed from: g */
    public final C19568o0 f65443g;

    /* renamed from: h */
    public C101218e0 f65444h;

    public C22744b0(Context context, String str, String str2, String str3, String str4, String str5, C19568o0 o0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, DownloadInfo.FILENAME);
        C87412m.m108594g(str3, "fileExt");
        C87412m.m108594g(str4, "contextId");
        C87412m.m108594g(str5, "fileMd5");
        C87412m.m108594g(o0Var, "creater");
        this.f65437a = context;
        this.f65438b = str;
        this.f65439c = str2;
        this.f65440d = str3;
        this.f65441e = str4;
        this.f65442f = str5;
        this.f65443g = o0Var;
        this.f65444h = new C101218e0(context, 2, 3, false);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d0f, (ViewGroup) null);
        C85875k4.m106191k0(((TextView) inflate.findViewById(C0966R.C0970id.f359429kw2)).getPaint());
        this.f65444h.mo140663j(inflate);
        String string = C19444f1.m20777q(MMApplicationContext.getContext()) ? context.getResources().getString(C0966R.string.m94) : context.getResources().getString(C0966R.string.f361148m92);
        C87412m.m108593f(string, "if (QQBrowserHelper.isQQ…c_for_download)\n        }");
        this.f65444h.mo140677w(string);
        this.f65444h.mo140676v(0);
        View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359824cr3, (ViewGroup) null);
        ((WeImageView) inflate2.findViewById(C0966R.C0970id.f358476fd0)).setOnClickListener(new C52811z(this));
        this.f65444h.mo140672r(inflate2);
        this.f65444h.f296375F = new C22743a0(this);
    }
}
