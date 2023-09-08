package dg2;

import ag2.C79540c0;
import ag2.C79544u;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.qqmail.p090ui.MailAttachListLinearLayout;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileExplorerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import java.util.ArrayList;
import p910lj.C76701a;

/* renamed from: dg2.q */
public class C86287q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f250903d;

    /* renamed from: e */
    public final /* synthetic */ String f250904e;

    /* renamed from: f */
    public final /* synthetic */ C86288s f250905f;

    public C86287q(C86288s sVar, Bundle bundle, String str) {
        this.f250905f = sVar;
        this.f250903d = bundle;
        this.f250904e = str;
    }

    public void run() {
        this.f250905f.f250906d.f248820g.setVisibility(8);
        int i = this.f250903d.getInt("err_type");
        int i2 = this.f250903d.getInt("err_code");
        String string = this.f250903d.getString("err_msg");
        Log.m105925i("MicroMsg.ReadMailUI", "mailId %s, errType %d, errCode %d, errMsg %s", this.f250904e, Integer.valueOf(i), Integer.valueOf(i2), string);
        if (i == 0 && i2 == 0) {
            C79544u uVar = this.f250905f.f250906d.f248818e;
            Bundle bundle = this.f250903d;
            uVar.getClass();
            uVar.f233221i = bundle.getString("mail_content");
            uVar.f233219g = bundle.getParcelableArrayList("mail_normal_attach");
            uVar.f233220h = bundle.getParcelableArrayList("mail_big_attach");
            uVar.f233222j = (Bundle) bundle.getParcelable("mail_cookie");
            Log.m105919d("MicroMsg.ReadMailUI", "mail content %s", this.f250905f.f250906d.f248818e.f233221i);
            MMWebView mMWebView = this.f250905f.f250906d.f248819f;
            mMWebView.loadDataWithBaseURL(C79540c0.m96570c() + "?pageWidth=" + ReadMailUI.f248803Q, "<html style=\"margin-top:" + ReadMailUI.f248804R + "px\">" + this.f250905f.f250906d.f248818e.f233221i + "</html>", "text/html", "utf-8", (String) null);
            ArrayList arrayList = new ArrayList();
            ArrayList<Bundle> arrayList2 = this.f250905f.f250906d.f248818e.f233219g;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            ArrayList<Bundle> arrayList3 = this.f250905f.f250906d.f248818e.f233220h;
            if (arrayList3 != null) {
                arrayList.addAll(arrayList3);
            }
            if (!arrayList.isEmpty()) {
                this.f250905f.f250906d.f248830t.setVisibility(0);
                ((TextView) this.f250905f.f250906d.findViewById(C0966R.C0970id.idy)).setText(this.f250905f.f250906d.getString(C0966R.string.f361163hs1, new Object[]{Integer.valueOf(arrayList.size())}));
                this.f250905f.f250906d.f248831u.removeAllViews();
                MailAttachListLinearLayout mailAttachListLinearLayout = this.f250905f.f250906d.f248831u;
                mailAttachListLinearLayout.getClass();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    View inflate = View.inflate(mailAttachListLinearLayout.f248797d, C0966R.C0971layout.bpv, (ViewGroup) null);
                    Bundle bundle2 = (Bundle) arrayList.get(i3);
                    if (i3 == arrayList.size() - 1) {
                        inflate.setBackgroundResource(C0966R.C0969drawable.aew);
                    } else {
                        inflate.setBackgroundResource(C0966R.C0969drawable.aev);
                    }
                    mailAttachListLinearLayout.addView(inflate);
                    String string2 = bundle2.getString("attach_name", "");
                    ((ArrayList) mailAttachListLinearLayout.f248798e).add(string2);
                    int i4 = bundle2.getInt("attach_size", 0);
                    ((TextView) inflate.findViewById(C0966R.C0970id.f359010ie0)).setText(string2);
                    ((TextView) inflate.findViewById(C0966R.C0970id.f359012ie2)).setText(Util.getSizeKB((long) i4));
                    inflate.setOnClickListener(new C86276e(mailAttachListLinearLayout, string2, bundle2.getString("attach_fileId", ""), i4, bundle2.getString("attach_download_url", "")));
                    ((ImageView) inflate.findViewById(C0966R.C0970id.idz)).setImageResource(FileExplorerUI.m20925I7(string2));
                }
            } else {
                this.f250905f.f250906d.f248830t.setVisibility(8);
            }
            ReadMailUI readMailUI = this.f250905f.f250906d;
            C79544u uVar2 = readMailUI.f248818e;
            readMailUI.getClass();
            CookieManager.getInstance().removeSessionCookie();
            if (uVar2.f233222j == null) {
                Log.m105928w("MicroMsg.ReadMailUI", "cookie is null");
                return;
            }
            CookieManager.getInstance().setCookie(C79540c0.m96570c(), "xm_skey=" + uVar2.f233222j.getString("cookie_xmail_skey"));
            CookieManager.getInstance().setCookie(C79540c0.m96570c(), "xm_uin=" + uVar2.f233222j.getLong("cookie_xmail_uin"));
            CookieManager.getInstance().setCookie(C79540c0.m96570c(), "xm_sid=" + uVar2.f233222j.getString("cookie_xmail_sid"));
            CookieManager.getInstance().flush();
            return;
        }
        if (Util.isNullOrNil(string)) {
            string = this.f250905f.f250906d.getString(C0966R.string.hl5);
        }
        C76701a.makeText((Context) this.f250905f.f250906d, (CharSequence) string, 1).show();
        this.f250905f.f250906d.f248821h.setVisibility(0);
    }
}
