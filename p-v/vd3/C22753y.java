package vd3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.model.C19441d1;
import com.tencent.p014mm.pluginsdk.model.C19444f1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C8480h;
import gy3.C87412m;
import p407zo.C23547h;
import qo3.C101218e0;

/* renamed from: vd3.y */
public final class C22753y {

    /* renamed from: a */
    public final Context f65455a;

    /* renamed from: b */
    public final String f65456b;

    /* renamed from: c */
    public final String f65457c;

    /* renamed from: d */
    public final String f65458d;

    /* renamed from: e */
    public final String f65459e;

    /* renamed from: f */
    public final String f65460f;

    /* renamed from: g */
    public C101218e0 f65461g;

    public C22753y(Context context, String str, String str2, String str3, String str4, String str5) {
        Context context2 = context;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str6, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str7, DownloadInfo.FILENAME);
        C87412m.m108594g(str8, "fileExt");
        C87412m.m108594g(str9, "contextId");
        C87412m.m108594g(str10, "fileMd5");
        this.f65455a = context2;
        this.f65456b = str6;
        this.f65457c = str7;
        this.f65458d = str8;
        this.f65459e = str9;
        this.f65460f = str10;
        this.f65461g = new C101218e0(context2, 2, 3, false);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359823cr2, (ViewGroup) null);
        C85875k4.m106191k0(((TextView) inflate.findViewById(C0966R.C0970id.f359429kw2)).getPaint());
        this.f65461g.mo140663j(inflate);
        String string = C19444f1.m20777q(MMApplicationContext.getContext()) ? context.getResources().getString(C0966R.string.m94) : context.getResources().getString(C0966R.string.f361148m92);
        C87412m.m108593f(string, "if (QQBrowserHelper.isQQ…c_for_download)\n        }");
        this.f65461g.mo140677w(string);
        this.f65461g.mo140676v(0);
        View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359824cr3, (ViewGroup) null);
        ((WeImageView) inflate2.findViewById(C0966R.C0970id.f358476fd0)).setOnClickListener(new C52810w(this));
        this.f65461g.mo140672r(inflate2);
        this.f65461g.f296375F = new C22752x(this);
        C19441d1.m20769a(str4, str3, str5, 201, new C23547h.C23548a(true, (String) null, (String) null, (String) null, false, false, 62, (C8480h) null).mo37002a());
    }
}
