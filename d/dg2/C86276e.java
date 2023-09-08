package dg2;

import ag2.C79540c0;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.qqmail.p090ui.AttachDownloadPage;
import com.tencent.p014mm.plugin.qqmail.p090ui.MailAttachListLinearLayout;
import com.tencent.xweb.CookieManager;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: dg2.e */
public class C86276e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f250886d;

    /* renamed from: e */
    public final /* synthetic */ String f250887e;

    /* renamed from: f */
    public final /* synthetic */ int f250888f;

    /* renamed from: g */
    public final /* synthetic */ String f250889g;

    /* renamed from: h */
    public final /* synthetic */ MailAttachListLinearLayout f250890h;

    public C86276e(MailAttachListLinearLayout mailAttachListLinearLayout, String str, String str2, int i, String str3) {
        this.f250890h = mailAttachListLinearLayout;
        this.f250886d = str;
        this.f250887e = str2;
        this.f250888f = i;
        this.f250889g = str3;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f250890h.f248797d, AttachDownloadPage.class);
        intent.putExtra("attach_name", this.f250886d);
        intent.putExtra("mail_id", this.f250890h.f248799f);
        intent.putExtra("attach_id", this.f250887e);
        intent.putExtra("total_size", this.f250888f);
        intent.putExtra("attach_url", this.f250889g);
        MailAttachListLinearLayout mailAttachListLinearLayout = this.f250890h;
        String str = this.f250889g;
        mailAttachListLinearLayout.getClass();
        intent.putExtra("is_compress", str != null && str.contains("/cgi-bin/viewcompress"));
        intent.putExtra("is_preview", 1);
        intent.putExtra("qqmail_cookie", CookieManager.getInstance().getCookie(C79540c0.m96570c()));
        Context context = this.f250890h.f248797d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
