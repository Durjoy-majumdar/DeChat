package com.tencent.p014mm.plugin.webview.luggage;

import android.graphics.Bitmap;
import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.webview.luggage.C43687x0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import ea3.C7618l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import nj3.C76875f0;
import nj3.C76878h0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.u0 */
public class C6010u0 implements C76878h0 {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.u0$a */
    public class C6011a implements C1256g<IPCString> {

        /* renamed from: d */
        public final /* synthetic */ ImageView f22260d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f22261e;

        public C6011a(C6010u0 u0Var, ImageView imageView, ImageView imageView2) {
            this.f22260d = imageView;
            this.f22261e = imageView2;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            String str = ((IPCString) obj).f10315d;
            HashMap<String, WeakReference<Bitmap>> hashMap = C6600v.f23854a;
            Bitmap a = C7618l.f25900a.mo8750a(str);
            Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(a, true, ((float) a.getWidth()) * 0.1f);
            ((C119157j) C119157j.f356862d).mo183895z(new u0$a$$a(this.f22260d, this.f22261e, roundedCornerBitmap));
        }
    }

    public C6010u0(C43687x0 x0Var) {
    }

    /* renamed from: a */
    public void mo6974a(ImageView imageView, ImageView imageView2, MenuItem menuItem) {
        C76875f0 f0Var = (C76875f0) menuItem;
        if (!Util.isNullOrNil(f0Var.f224730y)) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(f0Var.f224730y), C43687x0.C6018a.class, new C6011a(this, imageView, imageView2));
        }
    }
}
