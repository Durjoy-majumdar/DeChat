package ny1;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import ny1.C100247i;

/* renamed from: ny1.g */
public class C100245g implements C100247i.C100252d {

    /* renamed from: a */
    public final /* synthetic */ int f293693a;

    /* renamed from: b */
    public final /* synthetic */ C100247i f293694b;

    public C100245g(C100247i iVar, int i) {
        this.f293694b = iVar;
        this.f293693a = i;
    }

    /* renamed from: a */
    public void mo139530a(C100247i.C100253e eVar) {
        C100247i iVar = this.f293694b;
        int i = this.f293693a;
        iVar.getClass();
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_title", eVar.f293714a);
        intent.putExtra("Ksnsupload_imgurl", eVar.f293716c);
        intent.putExtra("Ksnsupload_link", eVar.f293717d);
        intent.putExtra("KContentObjDesc", Util.isNullOrNil(eVar.f293715b) ? iVar.f293698a.getString(C0966R.string.fbx) : eVar.f293715b);
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("Ksnsupload_type", 1);
        intent.putExtra("need_result", true);
        intent.putExtra("src_username", iVar.f293698a.getString(C0966R.string.fbx));
        intent.putExtra("src_displayname", iVar.f293698a.getString(C0966R.string.fbx));
        C88144b.m109795m(iVar.f293698a, "sns", ".ui.SnsUploadUI", intent, i);
    }
}
