package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.lang.ref.WeakReference;
import ke3.C88144b;
import nj3.C76879j;
import p008bq.C67309t0;
import p158gt.C76057w;
import p645pj.C77092c;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.j */
public class C85490j implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f249147a;

    /* renamed from: com.tencent.mm.plugin.topstory.ui.webview.j$a */
    public class C85491a implements DialogInterface.OnClickListener {
        public C85491a(C85490j jVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.webview.j$b */
    public class C85492b implements DialogInterface.OnClickListener {
        public C85492b(C85490j jVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public C85490j(C19391e eVar, WeakReference weakReference) {
        this.f249147a = weakReference;
    }

    /* renamed from: a */
    public void mo25933a(String str, Bitmap bitmap, String str2) {
        Class cls = C67309t0.class;
        Context context = (Context) this.f249147a.get();
        if (context != null && !TextUtils.isEmpty(str2) && C86013q1.m106450k(str2)) {
            boolean z = false;
            if (ImgUtil.isGif(str2)) {
                IEmojiInfo Vs = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(C90193h.m112876d(str2));
                if (Vs == null || !Vs.mo62633C1()) {
                    Vs = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(((C67309t0) C86312j.m106911c(cls)).mo91190WE(MMApplicationContext.getContext(), str2));
                }
                long l = Vs == null ? 0 : C86013q1.m106451l(Vs.mo62640K1());
                if (Vs != null) {
                    str2 = Vs.mo62640K1();
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if ((BitmapUtil.decodeFile(str2, options) != null && options.outHeight > C77092c.m93041c()) || options.outWidth > C77092c.m93041c()) {
                    z = true;
                }
                String str3 = "";
                if (l > ((long) C77092c.m93039a()) || z) {
                    C76879j.m92754y(context, context.getString(C0966R.string.c5n), str3, context.getString(C0966R.string.fmz), (DialogInterface.OnClickListener) null);
                    C76879j.m92709C(context, context.getString(C0966R.string.c5n), "", context.getString(C0966R.string.fmz), "", false, new C85491a(this), new C85492b(this));
                    return;
                }
                Intent intent = new Intent();
                if (Vs != null) {
                    str3 = Vs.getMd5();
                }
                intent.putExtra("Retr_File_Name", str3);
                intent.putExtra("Retr_Msg_Type", 5);
                intent.putExtra("Retr_MsgImgScene", 1);
                C88144b.m109801s(context, ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("Retr_File_Name", str2);
            intent2.putExtra("Retr_Compress_Type", 0);
            intent2.putExtra("Retr_Msg_Type", 0);
            intent2.addFlags(268435456);
            C88144b.m109801s(context, ".ui.transmit.MsgRetransmitUI", intent2, (Bundle) null);
        }
    }
}
